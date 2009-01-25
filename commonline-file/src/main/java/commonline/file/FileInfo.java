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


public class FileInfo {
    private FileVersion version;
    private FileType type;

    public FileInfo(FileVersion version, FileType type) {
        this.version = version;
        this.type = type;
    }

    public FileVersion getVersion() {
        return version;
    }

    public FileType getType() {
        return type;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FileInfo fileInfo = (FileInfo) o;

        if (type != null ? !type.equals(fileInfo.type) : fileInfo.type != null) return false;
        if (version != null ? !version.equals(fileInfo.version) : fileInfo.version != null) return false;

        return true;
    }

    public int hashCode() {
        int result = version != null ? version.hashCode() : 0;
        result = 31 * result + (type != null ? type.hashCode() : 0);
        return result;
    }
}
