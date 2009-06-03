/**
 * Copyright 2008-2009 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is
 * distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and limitations under the License.
 */
package commonline.file;

import commonline.file.parser.ParserRegistry;
import commonline.file.util.FileTypeValueConverter;
import commonline.file.util.FileVersionValueConverter;
import flapjack.io.LineRecordReader;
import flapjack.layout.RecordLayout;
import flapjack.model.ObjectMapping;
import flapjack.model.ObjectMappingStore;
import flapjack.model.RecordFactory;
import flapjack.model.SameRecordFactoryResolver;
import flapjack.parser.ParseResult;
import flapjack.parser.RecordParser;
import flapjack.parser.RecordParserImpl;
import flapjack.util.TypeConverter;

import java.io.*;
import java.util.Iterator;

public class FileAnalyzer {
    private HeaderLocator headerLocator;
    private ParserRegistry parserRegistry = new ParserRegistry();
    private ObjectMappingStore objectMappingStore = new ObjectMappingStore();
    private TypeConverter typeConverter = new TypeConverter();

    public FileAnalyzer() {
        this(new CommonlineHeaderLocator());
    }

    protected FileAnalyzer(HeaderLocator headerLocator) {
        this.headerLocator = headerLocator;

        typeConverter.registerConverter(new FileTypeValueConverter());
        typeConverter.registerConverter(new FileVersionValueConverter());

        ObjectMapping fileInfoMapping = new ObjectMapping(FileInfo.class);
        fileInfoMapping.field("File Identifier Code", "version", FileVersionValueConverter.class);
        fileInfoMapping.field("File Identifier Name", "type", FileTypeValueConverter.class);
        objectMappingStore.add(fileInfoMapping);
    }

    public FileInfo analyze(InputStream input) throws IllegalArgumentException {
        String headerRecord = headerLocator.locate(input);
        if (headerRecord == null) {
            throw new IllegalArgumentException("Could not locate header");
        }
        Iterator it = parserRegistry.parsers().iterator();
        while (it.hasNext()) {
            LineRecordReader reader = new LineRecordReader(new ByteArrayInputStream(headerRecord.getBytes()));
            RecordParser parser = (RecordParser) it.next();
            try {
                applyToParser(parser);
                ParseResult result = parser.parse(reader);
                if (result.getRecords().size() > 0) {
                	FileInfo info = (FileInfo) result.getRecords().get(0);
                    return info;
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return null;
    }

    public FileInfo analyze(File file) throws IllegalArgumentException {
        try {
            return analyze(new FileInputStream(file));
        } catch (IllegalArgumentException err) {
            throw new IllegalArgumentException("Could not locate header record in file=" + file);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    protected void applyToParser(RecordParser parser) {
        RecordParserImpl parserImpl = (RecordParserImpl) parser;
        parserImpl.setObjectMappingStore(objectMappingStore);
        parserImpl.setTypeConverter(typeConverter);
        parserImpl.setRecordFactoryResolver(new SameRecordFactoryResolver(FileInfoFactory.class));
        parserImpl.setIgnoreUnmappedFields(true);
    }

    protected void setParserRegistry(ParserRegistry parserRegistry) {
        this.parserRegistry = parserRegistry;
    }
    
    public static final class FileInfoFactory implements RecordFactory {
		public Object build(RecordLayout arg0) {
			return new FileInfo();
		}
    	
    }
}
