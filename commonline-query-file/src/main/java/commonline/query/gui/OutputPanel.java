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
import java.util.Map;


public class OutputPanel extends JPanel {
    private JTabbedPane tabs = new JTabbedPane(JTabbedPane.BOTTOM);
    private JTextPane console = new JTextPane();
    private ResultSetTableModel tableModel;
    private JLabel resultLabel = new JLabel();
    private JLabel consoleLabel = new JLabel();

    public OutputPanel() {
        super(new BorderLayout());

        console.setEditable(false);
        console.setFocusable(false);
        tableModel = new ResultSetTableModel();

        JTable results = new JTable(tableModel);
        results.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);

        final JScrollPane resultScrollPane = new JScrollPane(results);

        ErrorHandlerManager.instance().addHandler(new ErrorHandlerManager.ErrorHandler() {
            public void handle(final Exception err) {
                Runnable runnable = new Runnable() {
                    public void run() {
                        ConsoleManager.instance().println(err.getMessage());
                        tabs.setSelectedIndex(1);
                    }
                };
                if (SwingUtilities.isEventDispatchThread()) {
                    runnable.run();
                } else {
                    SwingUtilities.invokeLater(runnable);
                }
            }
        });


        QueryHandlerManager.instance().addHandler(new QueryHandlerManager.QueryHandler() {
            public void handle(final java.util.List<String> columns, final int rowCount, final Map<String, Object> results) {
                Runnable runnable = new Runnable() {
                    public void run() {
                        tableModel.addResults(columns, results);
                        int row = rowCount +1;
                        resultLabel.setText("Results: " + row);
                        consoleLabel.setText("Results: " + row);
                    }
                };
                if (SwingUtilities.isEventDispatchThread()) {
                    runnable.run();
                } else {
                    SwingUtilities.invokeLater(runnable);
                }
            }

            public void reset() {
                Runnable runnable = new Runnable() {
                    public void run() {
                        tableModel.reset();
                        tabs.setSelectedIndex(0);
                        ConsoleManager.instance().clear();
                        resultLabel.setText("Results: 0");
                        consoleLabel.setText("Results: 0");
                        resultScrollPane.getHorizontalScrollBar().setValue(0);
                    }
                };
                if (SwingUtilities.isEventDispatchThread()) {
                    runnable.run();
                } else {
                    SwingUtilities.invokeLater(runnable);
                }
            }
        });

        ConsoleManager.instance().addHandler(new ConsoleManager.Handler() {
            public void clear() {
                Runnable runnable = new Runnable() {
                    public void run() {
                        console.setText("");
                    }
                };
                if (SwingUtilities.isEventDispatchThread()) {
                    runnable.run();
                } else {
                    SwingUtilities.invokeLater(runnable);
                }
            }

            public void print(final String text) {
                Runnable runnable = new Runnable() {
                    public void run() {
                        console.setText(console.getText() + text);
                        tabs.setSelectedIndex(1);
                    }
                };
                if (SwingUtilities.isEventDispatchThread()) {
                    runnable.run();
                } else {
                    SwingUtilities.invokeLater(runnable);
                }
            }

        });


        JScrollPane consoleScrollPane = new JScrollPane(console);

        JPanel resultPanel = new JPanel(new BorderLayout());
        resultPanel.add(resultScrollPane, BorderLayout.CENTER);
        resultPanel.add(resultLabel, BorderLayout.SOUTH);

        JPanel consolePanel = new JPanel(new BorderLayout());
        consolePanel.add(consoleScrollPane, BorderLayout.CENTER);
        consolePanel.add(consoleLabel, BorderLayout.SOUTH);

        tabs.addTab("Results", resultPanel);
        tabs.addTab("Console", consolePanel);
        add(tabs, BorderLayout.CENTER);
    }
}
