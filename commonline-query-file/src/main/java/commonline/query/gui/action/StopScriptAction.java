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

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;


public class StopScriptAction extends AbtractMacableAction {
    public StopScriptAction(boolean isMac) {
        super("Stop", "Stop the current query", KeyEvent.VK_S, isMac);
        putValue(Action.SMALL_ICON, new ImageIcon(getClass().getClassLoader().getResource("ch_cancel.gif")));
    }

    public void actionPerformed(ActionEvent actionEvent) {

    }
}
