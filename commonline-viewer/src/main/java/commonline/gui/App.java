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
package commonline.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;


public class App extends JFrame {
    private JTabbedPane tabs = new JTabbedPane();

    public App() throws HeadlessException {
        super("Commonline File Viewer");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        initializeMenus();

        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(tabs);

        setSize(800, 600);
        setLocationByPlatform(true);
    }

    private void initializeMenus() {
        JMenu file = new JMenu("File");
        file.setMnemonic('F');

        JMenuItem open = new JMenuItem("Open...");
        open.setAccelerator(KeyStroke.getKeyStroke("ctrl O"));
        open.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                File fileToOpen = loadFile(App.this);
                tabs.addTab(fileToOpen.getName(), new FilePanel());
            }
        });

        JMenuItem exit = new JMenuItem("Exit");
        exit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        file.add(open);
        file.addSeparator();
        file.add(exit);

        JMenuBar menuBar = new JMenuBar();
        menuBar.add(file);

        setJMenuBar(menuBar);
    }

    public static void main(String[] args) throws IllegalAccessException, UnsupportedLookAndFeelException, InstantiationException, ClassNotFoundException {
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new App().setVisible(true);
            }
        });
    }

    public File loadFile(Frame f) {
        FileDialog fd = new FileDialog(f, "Open...", FileDialog.LOAD);
        fd.setLocationRelativeTo(f);
        fd.show();
        return new File(fd.getFile());
    }

}
