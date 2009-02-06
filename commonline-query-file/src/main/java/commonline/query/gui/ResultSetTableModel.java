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
package commonline.query.gui;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class ResultSetTableModel extends AbstractTableModel {
    private List<Map> rows = new ArrayList<Map>();
    private List<String> headings = new ArrayList<String>();

    @Override
    public String getColumnName(int i) {
        if (headings.size() == 0) {
            return "";
        }
        return headings.get(i);
    }

    @Override
    public Class<?> getColumnClass(int i) {
//        if (headings.size() == 0) {
//            return null;
//        }
//        String name = headings.get(i);
//        return rows.get(i).get(name).getClass();
        return String.class;
    }

    public int getRowCount() {
        return rows.size();
    }

    public int getColumnCount() {
        return headings.size();
    }

    public Object getValueAt(int row, int column) {
        if (rows.size() == 0) {
            return null;
        }
        Map values = rows.get(row);
        return values.get(headings.get(column));
    }

    public void addResults(List<String> columns, Map<String, Object> results) {
        initializeColumnHeadings(columns);
        Map values = new HashMap();
        for (String heading : headings) {
            values.put(heading, results.get(heading));
        }
        rows.add(values);
        fireTableDataChanged();
    }

    private void initializeColumnHeadings(List<String> columnNames) {
        if (rows.size() == 0) {
            headings.clear();
            headings.addAll(columnNames);
            fireTableStructureChanged();
        }
    }

    public void reset() {
        rows.clear();
        headings.clear();
        fireTableStructureChanged();
    }
}
