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
import java.util.Map;


public class QueryHandlerManager {
    private static QueryHandlerManager instance = new QueryHandlerManager();
    private List<QueryHandler> handlers = new ArrayList<QueryHandler>();

    public static QueryHandlerManager instance() {
        return instance;
    }

    public void addHandler(QueryHandler handler) {
        handlers.add(handler);
    }

    public void handle(List<String> columns, int rowCount, Map<String, Object> results) {
        for (QueryHandler handler : handlers)
            handler.handle(columns, rowCount, results);
    }

    public void reset() {
        for (QueryHandler handler : handlers)
            handler.reset();
    }

    public interface QueryHandler {
        void handle(List<String> columns, int rowCount, Map<String, Object> results);

        void reset();
    }
}
