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
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;


public class ResultSetTableModel extends AbstractTableModel {
    private int rowCount = 0;
    private int columnCount = 0;
    private ResultSet resultSet;
    private ResultSetMetaData metaData;


    @Override
    public String getColumnName(int i) {
        try {
            return metaData.getColumnName(i + 1);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return "";
    }

    public int getRowCount() {
        return rowCount;
    }


    public int getColumnCount() {
        return columnCount;
    }


    public Object getValueAt(int row, int column) {
        try {
            if (resultSet.absolute(row + 1)) {
                return resultSet.getObject(getColumnName(column));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return "";
    }

    public void updateResultSet(ResultSet resultSet) {
        try {
            if (this.resultSet != null) {
                this.resultSet.close();
            }
            resultSet.last();
            rowCount = resultSet.getRow();
            metaData = resultSet.getMetaData();
            columnCount = metaData.getColumnCount();
            this.resultSet = resultSet;
            fireTableStructureChanged();
        } catch (SQLException err) {
            err.printStackTrace();
        }
    }
}
