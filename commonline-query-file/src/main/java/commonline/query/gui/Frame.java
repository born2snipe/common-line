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

import commonline.query.gui.action.*;
import commonline.query.sql.RecordParserDataSource;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Frame extends JFrame {
    public Frame(boolean isMac, List dataSources) throws HeadlessException {
        super("Commonline Query File Tool");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        initializeMenu(isMac);
        initializeView(dataSources);

        setSize(800, 600);
        setLocationByPlatform(true);
    }

    private void initializeView(List dataSources) {
        JSplitPane split = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, new DatabaseStructurePanel(dataSources), new QueryPanel());
        split.setDividerLocation(200);

        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(split, BorderLayout.CENTER);
    }

    private void initializeMenu(boolean isMac) {
        JMenu file = new JMenu("File");
        JMenuItem open = new JMenuItem(new OpenAction(isMac));
        JMenuItem clear = new JMenuItem(new ClearDatabaseAction(isMac));
        JMenuItem exit = new JMenuItem(new ExitAction());

        file.add(open);
        file.addSeparator();
        file.add(clear);
        if (!isMac) {
            file.addSeparator();
            file.add(exit);
        }

        JMenu query = new JMenu("Query");
        JMenuItem execute = new JMenuItem(new ExecuteScriptAction(isMac));
        JMenuItem stop = new JMenuItem(new StopScriptAction(isMac));

        query.add(execute);
        query.add(stop);


        JMenuBar menuBar = new JMenuBar();
        menuBar.add(file);
        menuBar.add(query);
        setJMenuBar(menuBar);
    }

    public static void main(String args[]) throws Exception {
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());

        System.setProperty("com.apple.macos.useScreenMenuBar", "true");

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("MainContext.xml");

        List dataSources = new ArrayList();
        dataSources.addAll(context.getBeansOfType(RecordParserDataSource.class).values());

        Frame frame = new Frame(System.getProperty("os.name").toLowerCase().indexOf("mac") != -1, dataSources);
        frame.setVisible(true);
    }
}
