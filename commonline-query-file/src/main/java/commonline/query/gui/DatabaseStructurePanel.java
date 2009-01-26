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

import commonline.query.sql.FieldColumn;
import commonline.query.sql.RecordLayoutTableInfo;
import commonline.query.sql.RecordParserDataSource;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeCellRenderer;
import java.awt.*;
import java.util.List;


public class DatabaseStructurePanel extends JPanel {
    private ImageIcon TABLE_ICON;
    private ImageIcon DB_ICON;
    private ImageIcon COLUMN_ICON;

    public DatabaseStructurePanel(List<RecordParserDataSource> dataSources) {
        super(new BorderLayout());
        setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Database Structure"));
        TABLE_ICON = new ImageIcon(getClass().getClassLoader().getResource("tree_table.gif"));
        DB_ICON = new ImageIcon(getClass().getClassLoader().getResource("tree_database.gif"));
        COLUMN_ICON = new ImageIcon(getClass().getClassLoader().getResource("tree_column.gif"));

        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Databases");

        for (RecordParserDataSource dataSource : dataSources) {
            DefaultMutableTreeNode db = new Node(dataSource);
            for (RecordLayoutTableInfo tableInfo : dataSource.getTableInfos()) {
                DefaultMutableTreeNode table = new Node(tableInfo);
                for (FieldColumn column : tableInfo.getColumns()) {
                    table.add(new Node(column));
                }
                db.add(table);
            }
            root.add(db);
        }

        JTree tree = new JTree(root);
        tree.setCellRenderer(new CellRenderer());

        add(new JScrollPane(tree), BorderLayout.CENTER);
    }


    private class CellRenderer extends DefaultTreeCellRenderer {
        public java.awt.Component getTreeCellRendererComponent(javax.swing.JTree jTree, java.lang.Object o, boolean b, boolean b1, boolean b2, int i, boolean b3) {
            JLabel label = (JLabel) super.getTreeCellRendererComponent(jTree, o, b, b1, b2, i, b3);
            DefaultMutableTreeNode node = (DefaultMutableTreeNode) o;
            if (node.getUserObject() instanceof RecordLayoutTableInfo) {
                label.setIcon(TABLE_ICON);
                label.setText(((RecordLayoutTableInfo) node.getUserObject()).getTableName());
            } else if (node.getUserObject() instanceof RecordParserDataSource) {
                label.setIcon(DB_ICON);
                label.setText(((RecordParserDataSource) node.getUserObject()).getName());
            } else if (node.getUserObject() instanceof FieldColumn) {
                label.setIcon(COLUMN_ICON);
                label.setText(((FieldColumn) node.getUserObject()).getColumnName());
            } else {
                label.setText(node.getUserObject().toString());
            }
            return label;
        }
    }

    private static class Node extends DefaultMutableTreeNode {
        private Object obj;

        private Node(Object obj) {
            this.obj = obj;
        }

        @Override
        public Object getUserObject() {
            return obj;
        }

        @Override
        public void setUserObject(Object o) {
            this.obj = o;
        }
    }


}
