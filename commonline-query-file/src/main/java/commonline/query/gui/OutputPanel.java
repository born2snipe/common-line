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

import javax.swing.*;
import java.awt.*;
import java.sql.ResultSet;


public class OutputPanel extends JPanel {
    private JTabbedPane tabs = new JTabbedPane(JTabbedPane.BOTTOM);
    private JTextPane console = new JTextPane();
    private ResultSetTableModel tableModel;
    private JLabel label = new JLabel();

    public OutputPanel() {
        super(new BorderLayout());

        console.setEditable(false);

        ErrorHandlerManager.instance().addHandler(new ErrorHandlerManager.ErrorHandler() {
            public void handle(final Exception err) {
                SwingUtilities.invokeLater(new Runnable() {
                    public void run() {
                        console.setText(err.getMessage());
                        tabs.setSelectedIndex(1);
                    }
                });
            }
        });

        tableModel = new ResultSetTableModel();

        QueryHandlerManager.instance().addHandler(new QueryHandlerManager.QueryHandler() {
            public void handle(final ResultSet resultSet, final int rowCount) {
                SwingUtilities.invokeLater(new Runnable() {
                    public void run() {
                        tableModel.addResultSet(resultSet);
                        label.setText("Results: " + rowCount);
                    }
                });
            }

            public void reset() {
                SwingUtilities.invokeLater(new Runnable() {
                    public void run() {
                        tableModel.reset();
                        tabs.setSelectedIndex(0);
                        console.setText("");
                        label.setText("Results: 0");
                    }
                });
            }
        });


        JTable results = new JTable(tableModel);

        JScrollPane resultScrollPane = new JScrollPane(results);
        JScrollPane consoleScrollPane = new JScrollPane(console);

        JPanel resultPanel = new JPanel(new BorderLayout());
        resultPanel.add(resultScrollPane, BorderLayout.CENTER);
        resultPanel.add(label, BorderLayout.SOUTH);

        JPanel consolePanel = new JPanel(new BorderLayout());
        consolePanel.add(consoleScrollPane, BorderLayout.CENTER);
        consolePanel.add(label, BorderLayout.SOUTH);

        tabs.addTab("Results", resultPanel);
        tabs.addTab("Console", consolePanel);
        add(tabs, BorderLayout.CENTER);
    }
}
