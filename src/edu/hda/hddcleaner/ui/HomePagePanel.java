package edu.hda.hddcleaner.ui;

import edu.hda.hddcleaner.ui.HomePageTableModel;
import edu.hda.hddcleaner.logic.SearchDeleteFiles;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JFileChooser;

public class HomePagePanel extends JPanel {

    // Attributes --begin--
    private JButton scanButton;
    private JButton cleanButton;
    private JScrollPane scrollPane;
    private JTable table;
    private JTextField textfield;
    private ArrayList<File> matches; //DIRTY!!!
    private ArrayList<String> find; //DIRTY!!!
    private ArrayList<File> files_found;
    // Attributes --end--

    // Methods --begin--
    public HomePagePanel() {
        this.setBackground(Color.WHITE);
        initScanButton();
        initCleanButton();
        initTable();
        initFind(); //DIRTY!!!!
        initTextBox(); //DIRTY!!!!
        this.setLayout(new GridBagLayout());
        this.add(this.scanButton, this.createScanButtonLayoutConstraints());
        this.add(this.cleanButton, this.createCleanButtonLayoutConstraints());
        this.add(this.scrollPane, this.createScrollPaneLayoutConstraints());
        this.add(this.textfield, this.createTextBoxLayoutConstraints());
    }

    private void initTextBox() {
        this.textfield = new JTextField("Pfad/eingeben");
    }

    private void initScanButton() {
        this.scanButton = new JButton("Scan");
        this.scanButton.setBackground(new Color(160, 192, 217));
        this.scanButton.setForeground(Color.WHITE);
        this.scanButton.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                startScan(e);
            }
        });
    }

    private void initCleanButton() {
        this.cleanButton = new JButton("Reinigen");
        this.cleanButton.setBackground(new Color(160, 192, 217));
        this.cleanButton.setForeground(Color.WHITE);
        this.cleanButton.setEnabled(false);
        this.cleanButton.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                startDelete(e);
            }
        });
    }

    private void initTable() {
        this.table = new JTable(new HomePageTableModel());
        this.scrollPane = new JScrollPane(this.table);
    }

    private GridBagConstraints createScrollPaneLayoutConstraints() {
        System.out.println("HomePagePanel::createScrollPaneLayoutConstraints()");
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 3;
        gbc.gridheight = 1;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.ipadx = 0;
        gbc.ipady = 0;
        gbc.insets = new Insets(20, 20, 15, 20);
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        return gbc;
    }

    private GridBagConstraints createScanButtonLayoutConstraints() {
        System.out.println("HomePagePanel::createScanButtonLayoutConstraints()");
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        gbc.fill = GridBagConstraints.NONE;
        gbc.ipadx = 0;
        gbc.ipady = 0;
        gbc.insets = new Insets(10, 20, 20, 10);
        gbc.anchor = GridBagConstraints.LINE_START;
        return gbc;
    }

    private GridBagConstraints createCleanButtonLayoutConstraints() {
        System.out.println("HomePagePanel::createCleanButtonLayoutConstraints()");
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 2;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        gbc.fill = GridBagConstraints.NONE;
        gbc.ipadx = 0;
        gbc.ipady = 0;
        gbc.insets = new Insets(10, 10, 20, 20);
        gbc.anchor = GridBagConstraints.LINE_END;
        return gbc;
    }

    private GridBagConstraints createTextBoxLayoutConstraints() {
        System.out.println("HomePagePanel::createCleanButtonLayoutConstraints()");
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        gbc.fill = GridBagConstraints.NONE;
        gbc.ipadx = 440;
        gbc.ipady = 0;
        gbc.insets = new Insets(10, 10, 20, 10);
        gbc.anchor = GridBagConstraints.CENTER;
        return gbc;
    }

    private void startScan(ActionEvent e) {
        ArrayList<String> path_names = new ArrayList<String>();
        JFileChooser chooser = new JFileChooser();
        chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int returnVal = chooser.showOpenDialog(null);
            if(returnVal == JFileChooser.APPROVE_OPTION) {
                System.out.println("You chose to open this file: " +
                  chooser.getSelectedFile().getPath());
              
              path_names.add(chooser.getSelectedFile().getPath().toString());
        }
        SearchDeleteFiles sd = new SearchDeleteFiles();
        this.files_found = sd.searchFilesInDirectories(path_names, find);
        this.cleanButton.setEnabled(true);
    }

    private void startDelete(ActionEvent e) {
       this.cleanButton.setEnabled(false);
        SearchDeleteFiles sd = new SearchDeleteFiles();
        sd.deleteFilesInDirectory(files_found);
    }

    private void initFind() {
        this.find = new ArrayList<String>();
        find.add(".txt");
    }
    // Methods --end--
}
