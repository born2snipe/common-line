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
package commonline.file.parser;

import commonline.cl4.response.parser.ResponseParser;
import commonline.file.FileType;
import commonline.file.FileVersion;
import flapjack.parser.RecordParser;

import java.util.HashMap;
import java.util.Map;


public class ParserResolver {
    private Map parsers = new HashMap();

    public ParserResolver() {
        parsers.put(new ParserInfo(FileType.RESPONSE, FileVersion.CL4), new ResponseParser());
    }

    public RecordParser resolver(FileType fileType, FileVersion fileVersion) {
        return (RecordParser) parsers.get(new ParserInfo(fileType, fileVersion));
    }

    private static class ParserInfo {
        private FileType type;
        private FileVersion version;

        private ParserInfo(FileType type, FileVersion version) {
            this.type = type;
            this.version = version;
        }

        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ParserInfo that = (ParserInfo) o;

            if (type != that.type) return false;
            if (version != that.version) return false;

            return true;
        }

        public int hashCode() {
            int result = type != null ? type.hashCode() : 0;
            result = 31 * result + (version != null ? version.hashCode() : 0);
            return result;
        }
    }
}
