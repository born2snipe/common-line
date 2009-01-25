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

import jsyntaxpane.DefaultSyntaxKit;

import javax.swing.*;
import java.awt.*;


public class QueryPanel extends JPanel {
    private JEditorPane codeEditor;
    private OutputPanel outputPanel;

    public QueryPanel() {
        super(new BorderLayout());
        DefaultSyntaxKit.initKit();

        codeEditor = new JEditorPane();
        outputPanel = new OutputPanel();

        JScrollPane scrPane = new JScrollPane(codeEditor);

        JPanel p = new JPanel(new BorderLayout());
        p.add(scrPane, BorderLayout.CENTER);
        p.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Query Editor"));

        JSplitPane split = new JSplitPane(JSplitPane.VERTICAL_SPLIT, p, outputPanel);
        split.setDividerLocation(400);

        add(split, BorderLayout.CENTER);
        doLayout();
        codeEditor.setContentType("text/sql");
    }
}
