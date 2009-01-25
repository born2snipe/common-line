package commonline.query.sql;

import flapjack.layout.RecordLayout;
import flapjack.parser.RecordParser;


public interface RecordLayoutTableInfoFactory {
    RecordLayoutTableInfo build(RecordParser parser, RecordLayout recordLayout);
}
