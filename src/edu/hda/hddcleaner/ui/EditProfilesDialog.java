package edu.hda.hddcleaner.ui;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class EditProfilesDialog extends JDialog {
    private Color dialogBackgroundColor;
    private JPanel dialogPanel;
    private JLabel headLineLabel;
    private JTabbedPane dialogTabbedPane;

    public EditProfilesDialog() {
        this.initDialogBackgroundColor();
        this.initHeadLineLabel();
        this.initDialogTabbedPane();
        this.initDialogPanel();
        this.getContentPane().add(this.dialogPanel);
        this.pack();
    }

    private void initDialogBackgroundColor() {
        this.dialogBackgroundColor = new Color(160, 192, 217);
    }

    private void initHeadLineLabel() {
        this.headLineLabel = new JLabel("Profile bearbeiten", new ImageIcon("icons/festplatte.jpg"), JLabel.LEFT);
        this.headLineLabel.setHorizontalTextPosition(JLabel.LEFT);
        this.headLineLabel.setFont(new Font("Calirbi", Font.PLAIN, 17));
        this.headLineLabel.setForeground(Color.WHITE);
    }

    private void initDialogTabbedPane() {
        this.dialogTabbedPane = new JTabbedPane();
        this.dialogTabbedPane.setFont(new Font("Calibri", Font.PLAIN, 11));
        this.dialogTabbedPane.addTab("Neues Profil", new NewProfilePanel());
        this.dialogTabbedPane.addTab("Profil umbenennen", new EditProfilePanel());
        this.dialogTabbedPane.addTab("Profil löschen", new DeleteProfilePanel());

        for (int i = 0; i < this.dialogTabbedPane.getTabCount(); i++) {
            this.dialogTabbedPane.setBackgroundAt(i, Color.WHITE);
        }
    }

    private void initDialogPanel() {
        this.initHeadLineLabel();
        this.dialogPanel = new JPanel();
        this.dialogPanel.setBackground(this.dialogBackgroundColor);
        this.dialogPanel.setLayout(new GridBagLayout());
        this.dialogPanel.add(this.headLineLabel, createLabelLayoutConstraints());
        this.dialogPanel.add(this.dialogTabbedPane, createTabbedPaneLayoutConstraints());
    }

    private GridBagConstraints createLabelLayoutConstraints() {
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.ipadx = 0;
        gbc.ipady = 0;
        gbc.insets = new Insets(5, 10, 0, 0);
        gbc.anchor = GridBagConstraints.PAGE_START;
        return gbc;
    }

    private GridBagConstraints createTabbedPaneLayoutConstraints() {
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.ipadx = 0;
        gbc.ipady = 0;
        gbc.insets = new Insets(10, 50, 30, 50);
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        return gbc;
    }
}
