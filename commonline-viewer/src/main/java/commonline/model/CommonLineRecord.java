package commonline.model;

import commonline.core.layout.CommonLineRecordLayout;

import java.util.LinkedHashMap;
import java.util.Map;


public class CommonLineRecord {
    private Map<String, byte[]> fields = new LinkedHashMap<String, byte[]>();
    private CommonLineRecordLayout recordLayout;


    public CommonLineRecord(Map<String, byte[]> fields, CommonLineRecordLayout recordLayout) {
        this.fields = fields;
        this.recordLayout = recordLayout;
    }
}
