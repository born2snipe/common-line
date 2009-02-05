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

import commonline.query.sql.RecordParserDataSource;
import commonline.query.sql.SqlType;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeCellRenderer;
import java.awt.*;
import java.util.List;


public class DatabaseStructurePanel extends JPanel {
    private ImageIcon TABLE_ICON;
    private ImageIcon DB_ICON;
    private ImageIcon COLUMN_ICON;

    public DatabaseStructurePanel() {
        super(new BorderLayout());
        setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Database Structure"));
        TABLE_ICON = new ImageIcon(getClass().getClassLoader().getResource("tree_table.gif"));
        DB_ICON = new ImageIcon(getClass().getClassLoader().getResource("tree_database.gif"));
        COLUMN_ICON = new ImageIcon(getClass().getClassLoader().getResource("tree_column.gif"));


        final DefaultMutableTreeNode root = new DefaultMutableTreeNode("Databases");

        MetaDataAnalyzer.instance().setHandler(new MetaDataAnalyzer.Handler() {
            private DefaultMutableTreeNode currentDb;
            private DefaultMutableTreeNode currentTable;

            public void addDatabase(String name) {
                currentDb = new Node(name, NodeType.DB);
                root.add(currentDb);
            }

            public void addTable(String name) {
                currentTable = new Node(name, NodeType.TABLE);
                currentDb.add(currentTable);
            }

            public void addColumn(String column, SqlType type, int length) {
                String text = "<html>" + column + " <i><font color='#4C9EAF'>" + type.format(length) + "</font></i></html>";
                currentTable.add(new Node(text, NodeType.COLUMN));
            }
        });

        JTree tree = new JTree(root);
        tree.setCellRenderer(new CellRenderer());

        add(new JScrollPane(tree), BorderLayout.CENTER);
    }


    private class CellRenderer extends DefaultTreeCellRenderer {
        public java.awt.Component getTreeCellRendererComponent(javax.swing.JTree jTree, java.lang.Object o, boolean b, boolean b1, boolean b2, int i, boolean b3) {
            JLabel label = (JLabel) super.getTreeCellRendererComponent(jTree, o, b, b1, b2, i, b3);
            if (o instanceof Node) {
                Node node = (Node) o;
                switch (node.type) {
                    case TABLE:
                    case DB:
                    case COLUMN:
                        label.setIcon(node.getIcon());
                        label.setText(node.name);
                        break;
                    default:
                        label.setText(node.getUserObject().toString());
                }
            } else {
                DefaultMutableTreeNode node = (DefaultMutableTreeNode) o;
                label.setText(node.getUserObject().toString());
            }
            return label;
        }
    }

    private class Node extends DefaultMutableTreeNode {
        private String name;
        private NodeType type;

        private Node(String name, NodeType type) {
            this.name = name;
            this.type = type;
        }

        @Override
        public Object getUserObject() {
            return name;
        }

        public ImageIcon getIcon() {
            switch (type) {
                case DB:
                    return DB_ICON;
                case TABLE:
                    return TABLE_ICON;
                case COLUMN:
                    return COLUMN_ICON;
                default:
                    return null;
            }
        }
    }

    private enum NodeType {
        DB, TABLE, COLUMN;
    }

}
