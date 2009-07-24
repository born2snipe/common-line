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

import flapjack.io.FileUtil;
import flapjack.io.FileUtilImpl;

import java.io.*;


public class RecordLengthFileAnalyzer implements FileAnalyzer {
    private FileUtil fileUtil = new FileUtilImpl();
    private static final int CHANGE_SEND_LENGTH = 480;
    private static final int DISBURSEMENT_LENGTH = 560;
    private static final int CL4_RESPONSE_LENGTH = 1040;
    private static final int CL5_APP_SEND_LENGTH = 960;
    private static final int CL5_RESPONSE_LENGTH = 1200;
    private static final int CL4_APP_SEND_LENGTH = 880;

    public FileInfo analyze(InputStream input) throws IllegalArgumentException {
        try {
            String line = readLine(input);
            switch (line.length()) {
                case CHANGE_SEND_LENGTH:
                    return new FileInfo(FileVersion.CL5, FileType.CHANGE_SEND);
                case DISBURSEMENT_LENGTH:
                    return new FileInfo(FileVersion.CL4, FileType.DISBURSEMENT_ROSTER);
                case CL4_RESPONSE_LENGTH:
                    return new FileInfo(FileVersion.CL4, FileType.RESPONSE);
                case CL5_RESPONSE_LENGTH:
                    return new FileInfo(FileVersion.CL5, FileType.RESPONSE);
                case CL4_APP_SEND_LENGTH:
                    return new FileInfo(FileVersion.CL4, FileType.APP_SEND);
                case CL5_APP_SEND_LENGTH:
                    return new FileInfo(FileVersion.CL5, FileType.APP_SEND);
            }
        } catch (IOException e) {

        }

        return null;
    }

    public FileInfo analyze(File file) throws IllegalArgumentException {
        InputStream input = null;
        try {
            input = new FileInputStream(file);
            return analyze(input);
        } catch (IOException err) {
            throw new RuntimeException(err);
        } finally {
            fileUtil.close(input);
        }
    }

    private String readLine(InputStream input) throws IOException {
        return new BufferedReader(new InputStreamReader(input)).readLine();
    }
}
