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
package commonline.query.gui.action;

import commonline.query.gui.ErrorHandlerManager;
import commonline.query.gui.QueryHandlerManager;
import commonline.query.sql.RecordParserDataSource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class ExecuteScriptAction extends AbtractMacableAction {
    private List<RecordParserDataSource> dataSources;
    private JEditorPane sqlEditor;
    private JComboBox databaseSelector;

    public ExecuteScriptAction(boolean isMac, List dataSources) {
        super("Execute...", "Execute the current query", KeyEvent.VK_E, isMac);
        putValue(Action.SMALL_ICON, new ImageIcon(getClass().getClassLoader().getResource("icon_run.gif")));
        this.dataSources = dataSources;
    }


    public void actionPerformed(ActionEvent actionEvent) {
        synchronized (sqlEditor) {
            if (sqlEditor.getText().trim().length() == 0) {
                return;
            }
            try {
                QueryHandlerManager.instance().reset();
                final List<String> columnNames = new ArrayList<String>();
                JdbcTemplate jdbcTemplate = new JdbcTemplate(findSelectedDataSource());
                jdbcTemplate.query(sqlEditor.getText(), new RowMapper() {
                    public Object mapRow(ResultSet resultSet, int rowCount) throws SQLException {
                        initializeColumnHeadings(resultSet);
                        Map results = convertToMap(resultSet);
                        QueryHandlerManager.instance().handle(columnNames, rowCount, results);
                        return null;
                    }

                    private Map<String, Object> convertToMap(ResultSet resultSet) throws SQLException {
                        Map<String, Object> map = new HashMap<String, Object>();
                        for (String name : columnNames) {
                            map.put(name, resultSet.getObject(name));
                        }
                        return map;
                    }

                    private void initializeColumnHeadings(ResultSet resultSet) {
                        if (columnNames.size() == 0) {
                            try {
                                ResultSetMetaData metaData = resultSet.getMetaData();
                                int count = metaData.getColumnCount();
                                for (int i = 1; i <= count; i++) {
                                    columnNames.add(metaData.getColumnName(i));
                                }
                            } catch (SQLException err) {
                                ErrorHandlerManager.instance().handle(err);
                            }
                        }
                    }
                });
            } catch (Exception err) {
                ErrorHandlerManager.instance().handle(err);
            }
        }
    }

    private DataSource findSelectedDataSource() {
        for (RecordParserDataSource dataSource : dataSources) {
            if (dataSource.getName().equalsIgnoreCase((String) databaseSelector.getSelectedItem())) {
                return dataSource;
            }
        }
        return null;
    }

    public void setSqlEditor(JEditorPane sqlEditor) {
        this.sqlEditor = sqlEditor;
    }

    public void setDatabaseSelector(JComboBox databaseSelector) {
        this.databaseSelector = databaseSelector;
    }
}
