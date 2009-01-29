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
import java.sql.SQLException;
import java.util.List;


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
            QueryHandlerManager.instance().reset();
            if (sqlEditor.getText().trim().length() == 0) {
                return;
            }
            try {
                JdbcTemplate jdbcTemplate = new JdbcTemplate(findSelectedDataSource());
                jdbcTemplate.query(sqlEditor.getText(), new RowMapper() {
                    public Object mapRow(ResultSet resultSet, int rowCount) throws SQLException {
                        QueryHandlerManager.instance().handle(resultSet, rowCount);
                        return null;
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
