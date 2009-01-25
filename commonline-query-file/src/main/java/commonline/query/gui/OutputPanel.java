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


public class OutputPanel extends JPanel {
    private JTabbedPane tabs = new JTabbedPane(JTabbedPane.BOTTOM);
    private JTextPane console = new JTextPane();

    public OutputPanel() {
        super(new BorderLayout());

        console.setEditable(false);

        ErrorHandlerManager.instance().addHandler(new ErrorHandlerManager.ErrorHandler() {
            public void handle(Exception err) {
                console.setText(err.getMessage());
                tabs.setSelectedIndex(1);
            }
        });

        JTable results = new JTable();

        tabs.addTab("Results", new JScrollPane(results));
        tabs.addTab("Console", new JScrollPane(console));
        add(tabs, BorderLayout.CENTER);
    }
}
