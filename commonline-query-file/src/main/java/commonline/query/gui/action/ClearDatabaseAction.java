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

import commonline.query.sql.RecordLayoutTableInfo;
import commonline.query.sql.RecordParserDataSource;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.util.List;


public class ClearDatabaseAction extends AbtractMacableAction {
    private JFrame parent;
    private List<RecordParserDataSource> dataSources;

    public ClearDatabaseAction(boolean isMac, JFrame parent, List dataSources) {
        super("Clear DB", "Clean all databases and tables of data", KeyEvent.VK_F10, isMac);
        this.parent = parent;
        this.dataSources = dataSources;
    }

    public void actionPerformed(ActionEvent actionEvent) {
        if (JOptionPane.showConfirmDialog(parent, "Are you sure you want to clear the databases?", "Clear DB", JOptionPane.YES_NO_OPTION) == JOptionPane.OK_OPTION) {
            SwingWorker worker = new SwingWorker<Void, Void>() {
                protected Void doInBackground() throws Exception {
                    for (RecordParserDataSource dataSource : dataSources) {
                        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
                        for (RecordLayoutTableInfo tableInfo : dataSource.getTableInfos()) {
                            try {
                                jdbcTemplate.execute("delete from " + tableInfo.getTableName());
                            } catch (Exception err) {
                                throw new RuntimeException("Problem clearing table:" + tableInfo.getTableName() + ", in DB:" + dataSource.getUrl(), err);
                            }
                        }
                    }
                    return null;
                }
            };
            worker.execute();
        }
    }
}
