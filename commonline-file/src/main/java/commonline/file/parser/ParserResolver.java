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

import commonline.cl4.appsend.parser.AppSendParser;
import commonline.cl4.changesend.parser.ChangeSendParser;
import commonline.cl4.response.parser.ResponseParser;
import commonline.cl4.disbursement.parser.DisbursementParser;
import commonline.file.FileInfo;
import commonline.file.FileType;
import commonline.file.FileVersion;
import flapjack.parser.RecordParser;
import flapjack.parser.RecordParserImpl;
import flapjack.model.ObjectMappingStore;
import flapjack.model.ObjectMapping;

import java.util.HashMap;
import java.util.Map;


public class ParserResolver {
    private Map parsers = new HashMap();

    public ParserResolver() {
        parsers.put(new FileInfo(FileVersion.CL4, FileType.RESPONSE), new ResponseParser());
        parsers.put(new FileInfo(FileVersion.CL4, FileType.CHANGE_SEND), new ChangeSendParser());
        parsers.put(new FileInfo(FileVersion.CL4, FileType.APP_SEND), new AppSendParser());
        parsers.put(new FileInfo(FileVersion.CL4, FileType.DISBURSEMENT_ROSTER), new DisbursementParser());
        parsers.put(new FileInfo(FileVersion.CL4, FileType.DISBURSEMENT_ACKNOWLEDGEMENT), new DisbursementParser());
    }

    public RecordParser resolver(FileType fileType, FileVersion fileVersion) {
        return (RecordParser) parsers.get(new FileInfo(fileVersion, fileType));
    }

}
