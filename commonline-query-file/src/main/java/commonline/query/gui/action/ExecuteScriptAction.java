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

import javax.sql.DataSource;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;


public class ExecuteScriptAction extends AbtractMacableAction {
    private List<RecordParserDataSource> dataSources;
    private JEditorPane sqlEditor;
    private JComboBox databaseSelector;
    private Connection connection;

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
                connection = findSelectedDataSource().getConnection();
                Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
                String sql = sqlEditor.getSelectedText();
                if (sql == null || sql.trim().length() == 0) {
                    sql = sqlEditor.getText();
                }
                ResultSet resultSet = statement.executeQuery(sql);
                QueryHandlerManager.instance().handle(resultSet);

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
