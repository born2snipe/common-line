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


public class ErrorHandlerManager {
    private static final ErrorHandlerManager instance = new ErrorHandlerManager();
    private static List<ErrorHandler> handlers = new ArrayList<ErrorHandler>();

    public static ErrorHandlerManager instance() {
        return instance;
    }

    private ErrorHandlerManager() {

    }

    public void addHandler(ErrorHandler handler) {
        handlers.add(handler);
    }

    public void handle(Exception err) {
        err.printStackTrace();
        for (ErrorHandler handler : handlers) {
            handler.handle(err);
        }
    }

    public static interface ErrorHandler {
        void handle(Exception err);
    }
}
