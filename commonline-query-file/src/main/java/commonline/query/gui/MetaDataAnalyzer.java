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

import commonline.query.sql.RecordParserDataSource;
import commonline.query.sql.SqlType;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;


public class MetaDataAnalyzer {
    private static final MetaDataAnalyzer instance = new MetaDataAnalyzer();
    private Handler handler;

    public static MetaDataAnalyzer instance() {
        return instance;
    }

    private MetaDataAnalyzer() {
    }

    public void analyze(RecordParserDataSource dataSource) {
        Connection conn = null;
        try {
            handler.addDatabase(dataSource.getName());
            conn = dataSource.getConnection();
            DatabaseMetaData metaData = conn.getMetaData();
            ResultSet resultSet = metaData.getTables(null, null, "%", new String[]{"TABLE"});
            while (resultSet.next()) {
                String tableName = resultSet.getString("TABLE_NAME");
                handler.addTable(tableName);
                ResultSet columnResultSet = metaData.getColumns(null, null, tableName, null);
                while (columnResultSet.next()) {
                    String name = columnResultSet.getString("COLUMN_NAME");
                    SqlType type = SqlType.convert(columnResultSet.getInt("DATA_TYPE"));
                    int length = columnResultSet.getInt("COLUMN_SIZE");
                    handler.addColumn(name, type, length);
                }
            }

        } catch (SQLException err) {
            err.printStackTrace();
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {

                }
            }
        }
    }

    public void setHandler(Handler handler) {
        this.handler = handler;
    }

    public interface Handler {
        void addDatabase(String name);

        void addTable(String name);

        void addColumn(String column, SqlType type, int length);
    }
}
