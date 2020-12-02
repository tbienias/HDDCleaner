package edu.hda.hddcleaner.ui;

import edu.hda.hddcleaner.ui.ConfigPagePanel;
import edu.hda.hddcleaner.ui.HomePagePanel;
import java.awt.Color;
import java.awt.Font;
import java.util.Vector;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class TabbedPane extends JTabbedPane {

    // Attributes --begin--
    private Vector<String> tabNames;
    // Attributes --end--

    // Methods --begin--
    public TabbedPane() {
        initTabNames();
        initTabs();
        this.setFont(new Font("Calibri", Font.BOLD, 11));
    }

    private void initTabNames() {
        this.tabNames = new Vector<String>();
        this.tabNames.addElement("Startseite");
        this.tabNames.addElement("Konfiguration");
        this.tabNames.addElement("Hilfe");
    }

    private void initTabs() {
        // Tab: "Startseite"
        this.addTab(this.tabNames.elementAt(0), new HomePagePanel());
        this.setBackgroundAt(0, Color.WHITE);

        // Tab: "Konfiguration"
        this.addTab(this.tabNames.elementAt(1), new ConfigPagePanel());
        this.setBackgroundAt(1, Color.WHITE);
    }
    // Methods --end--
}
