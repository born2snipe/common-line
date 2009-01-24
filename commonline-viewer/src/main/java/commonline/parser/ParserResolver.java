package commonline.parser;

import commonline.FileType;
import commonline.FileVersion;
import commonline.cl4.response.parser.ResponseParser;
import flapjack.parser.RecordParser;

import java.util.HashMap;
import java.util.Map;


public class ParserResolver {
    private Map<ParserInfo, RecordParser> parsers = new HashMap<ParserInfo, RecordParser>();

    public ParserResolver() {
        parsers.put(new ParserInfo(FileType.RESPONSE, FileVersion.CL4), new ResponseParser());
    }

    public RecordParser resolver(FileType fileType, FileVersion fileVersion) {
        return parsers.get(new ParserInfo(fileType, fileVersion));
    }

    private static class ParserInfo {
        private FileType type;
        private FileVersion version;

        private ParserInfo(FileType type, FileVersion version) {
            this.type = type;
            this.version = version;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ParserInfo that = (ParserInfo) o;

            if (type != that.type) return false;
            if (version != that.version) return false;

            return true;
        }

        @Override
        public int hashCode() {
            int result = type != null ? type.hashCode() : 0;
            result = 31 * result + (version != null ? version.hashCode() : 0);
            return result;
        }
    }
}
