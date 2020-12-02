package edu.hda.hddcleaner.ui;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class NewProfilePanel extends JPanel{
    JPanel centerPanel;
    JLabel newProfileLabel;
    JTextField profileNameTextField;
    JButton newProfileButton;

    public NewProfilePanel() {
        this.setBackground(Color.WHITE);
        this.initNewProfileLabel();
        this.initProfileNameTextField();
        this.initNewProfileButton();
        this.initCenterPanel();
        this.setLayout(new GridBagLayout());
        this.add(this.centerPanel, this.createCenterPanelLayoutConstraints());
    }

    private void initCenterPanel() {
        this.centerPanel = new JPanel(new GridBagLayout());
        this.centerPanel.setBackground(Color.WHITE);
        this.centerPanel.add(this.newProfileLabel, this.createNewProfileLabelLayoutConstraints());
        this.centerPanel.add(this.profileNameTextField, this.createProfileNameTextfieldLayoutConstraints());
        this.centerPanel.add(this.newProfileButton, this.createNewProfileButtonLayoutConstraints());
    }

    private void initNewProfileLabel() {
        this.newProfileLabel = new JLabel("Verwendeter Profilname");
        this.newProfileLabel.setFont(new Font("Calibri", Font.BOLD, 11));
    }

    private void initNewProfileButton() {
        this.newProfileButton = new JButton("Profil anlegen");
        this.newProfileButton.setBackground(new Color(160, 192, 217));
        this.newProfileButton.setForeground(Color.WHITE);
        this.newProfileButton.setEnabled(false);
    }

    private void initProfileNameTextField() {
        this.profileNameTextField = new JTextField();
        this.profileNameTextField.setFont(new Font("Calibri", Font.BOLD, 11));
    }

    private GridBagConstraints createCenterPanelLayoutConstraints() {
        GridBagConstraints gbc = new GridBagConstraints(0, 0, 1, 1, 1.0, 1.0, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(50, 50, 50, 50), 0, 0);
        return gbc;
    }

    private GridBagConstraints createNewProfileLabelLayoutConstraints() {
        GridBagConstraints gbc = new GridBagConstraints(0, 0, 1, 1, 0, 0, GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets(20, 20, 20, 5), 0, 0);
        return gbc;
    }

    private GridBagConstraints createProfileNameTextfieldLayoutConstraints() {
        GridBagConstraints gbc = new GridBagConstraints(1, 0, 1, 1, 0, 0, GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets(20, 0, 20, 20), 150, 0);
        return gbc;
    }

    private GridBagConstraints createNewProfileButtonLayoutConstraints() {
        GridBagConstraints gbc = new GridBagConstraints(0, 1, 2, 1, 0, 0, GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets(20, 20, 20, 20), 0, 0);
        return gbc;
    }
}
