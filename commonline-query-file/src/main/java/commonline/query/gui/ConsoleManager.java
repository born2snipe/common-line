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

import java.util.ArrayList;
import java.util.List;


public class ConsoleManager {
    private static final ConsoleManager instance = new ConsoleManager();

    private List<Handler> handlers = new ArrayList<Handler>();

    public static ConsoleManager instance() {
        return instance;
    }

    private ConsoleManager() {
    }

    public void addHandler(Handler handler) {
        handlers.add(handler);
    }

    public void clear() {
        for (Handler handler : handlers) {
            handler.clear();
        }
    }

    public void print(String text) {
        for (Handler handler : handlers) {
            handler.print(text);
        }
    }

    public void println(String text) {
        print(text + "\n");
    }

    public interface Handler {
        void clear();

        void print(String text);
    }
}
