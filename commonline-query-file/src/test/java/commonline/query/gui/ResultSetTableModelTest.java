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

import junit.framework.TestCase;
import static org.mockito.Mockito.*;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;


public class ResultSetTableModelTest extends TestCase {
    private ResultSetTableModel model;
    private ResultSet resultSet;
    private ResultSetMetaData metaData;

    protected void setUp() throws Exception {
        super.setUp();
        model = new ResultSetTableModel();
        resultSet = mock(ResultSet.class);
        metaData = mock(ResultSetMetaData.class);
    }

    public void test_updateResultSet_AlreadyHadAResultSet() throws SQLException {
        ResultSet newResultSet = mock(ResultSet.class);
        ResultSetMetaData newMetaData = mock(ResultSetMetaData.class);

        when(resultSet.getMetaData()).thenReturn(metaData);
        when(metaData.getColumnCount()).thenReturn(1);
        when(resultSet.last()).thenReturn(true);
        when(resultSet.getRow()).thenReturn(1);

        when(newResultSet.getMetaData()).thenReturn(newMetaData);
        when(newMetaData.getColumnCount()).thenReturn(2);
        when(newResultSet.last()).thenReturn(true);
        when(newResultSet.getRow()).thenReturn(2);

        model.updateResultSet(resultSet);

        model.updateResultSet(newResultSet);

        assertEquals(2, model.getColumnCount());
        assertEquals(2, model.getRowCount());

        verify(resultSet).close();
    }

    public void test_getValueAt() throws SQLException {
        when(resultSet.getMetaData()).thenReturn(metaData);
        when(metaData.getColumnName(2)).thenReturn("column");

        when(resultSet.absolute(1)).thenReturn(true);
        when(resultSet.getObject("column")).thenReturn("value");

        model.updateResultSet(resultSet);

        assertEquals("value", model.getValueAt(0, 1));
    }

    public void test_getColumnCount() throws SQLException {
        when(resultSet.getMetaData()).thenReturn(metaData);
        when(metaData.getColumnCount()).thenReturn(5);

        model.updateResultSet(resultSet);

        assertEquals(5, model.getColumnCount());
    }

    public void test_getRowCount() throws SQLException {
        when(resultSet.getMetaData()).thenReturn(metaData);
        when(resultSet.getRow()).thenReturn(1);

        model.updateResultSet(resultSet);

        assertEquals(1, model.getRowCount());
    }
}
