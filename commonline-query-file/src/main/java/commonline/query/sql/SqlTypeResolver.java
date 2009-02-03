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
package commonline.query.sql;

import flapjack.layout.FieldDefinition;

/**
 * Created by IntelliJ IDEA.
 * User: dan
 * Date: Feb 2, 2009
 * Time: 12:58:29 PM
 * To change this template use File | Settings | File Templates.
 */
public interface SqlTypeResolver {
    SqlType resolve(FieldDefinition fieldDef);
}
