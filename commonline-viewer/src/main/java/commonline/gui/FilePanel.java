package commonline.gui;

import javax.swing.*;
import java.awt.*;


public class FilePanel extends JPanel {
    private JTabbedPane tabs = new JTabbedPane(JTabbedPane.BOTTOM);
    private FileSummaryPanel summaryPanel;
    private RecordPanel recordPanel;

    public FilePanel() {
        super(new BorderLayout());
        add(tabs);

        summaryPanel = new FileSummaryPanel();
        recordPanel = new RecordPanel();

        tabs.addTab("Summary", summaryPanel);
        tabs.addTab("Records", recordPanel);
    }
}
