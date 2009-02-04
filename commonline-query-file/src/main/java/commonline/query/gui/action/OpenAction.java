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

import commonline.query.gui.LoadFilesWorker;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.Arrays;


public class OpenAction extends AbtractMacableAction {
    private JFileChooser fileChooser;
    private JFrame parent;

    public OpenAction(boolean isMac, JFrame parent) {
        super("Open...", "Open up commonline files to query", KeyEvent.VK_O, isMac);
        this.parent = parent;
        fileChooser = new JFileChooser();
        fileChooser.setMultiSelectionEnabled(true);
    }

    public void actionPerformed(ActionEvent actionEvent) {
        if (JFileChooser.APPROVE_OPTION == fileChooser.showOpenDialog(parent)) {
            File[] files = fileChooser.getSelectedFiles();
            if (files != null)
                new LoadFilesWorker(Arrays.asList(files)).execute();
        }
    }

}
