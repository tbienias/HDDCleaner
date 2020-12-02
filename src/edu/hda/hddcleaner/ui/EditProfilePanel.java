package edu.hda.hddcleaner.ui;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextField;

public class EditProfilePanel extends JPanel{
    JPanel centerPanel;
    JLabel editProfileLabel;
    JComboBox editProfileComboBox;
    JTextField editProfileTextField;
    JButton editProfileButton;

    public EditProfilePanel() {
        this.setBackground(Color.WHITE);
        this.initEditProfileLabel();
        this.initEditProfileComboBox();
        this.initProfileTextField();
        this.initEditProfileButton();
        this.initCenterPanel();
        this.setLayout(new GridBagLayout());
        this.add(this.centerPanel, this.createCenterPanelLayoutConstraints());
    }

    private void initCenterPanel() {
        this.centerPanel = new JPanel(new GridBagLayout());
        this.centerPanel.setBackground(Color.WHITE);
        this.centerPanel.add(this.editProfileLabel, this.createEditProfileLabelLayoutConstraints());
        this.centerPanel.add(this.editProfileComboBox, this.createEditProfileComboBoxLayoutConstraints());
        this.centerPanel.add(this.editProfileTextField, this.createEditProfileTextFieldLayoutConstraints());
        this.centerPanel.add(this.editProfileButton, this.createEditProfileButtonLayoutConstraints());
    }

    private void initEditProfileLabel() {
        this.editProfileLabel = new JLabel("Umzubenennendes Profil");
        this.editProfileLabel.setFont(new Font("Calibri", Font.BOLD, 11));
    }

    private void initEditProfileComboBox() {
        this.editProfileComboBox = new JComboBox();
        this.editProfileComboBox.setFont(new Font("Calibri", Font.BOLD, 11));
    }

    private void initProfileTextField() {
        this.editProfileTextField = new JTextField();
        this.editProfileTextField.setFont(new Font("Calibri", Font.BOLD, 11));
    }

    private void initEditProfileButton() {
        this.editProfileButton = new JButton("Profil umbennenen");
        this.editProfileButton.setBackground(new Color(160, 192, 217));
        this.editProfileButton.setForeground(Color.WHITE);
        this.editProfileButton.setEnabled(false);
    }

    private GridBagConstraints createCenterPanelLayoutConstraints() {
        GridBagConstraints gbc = new GridBagConstraints(0, 0, 1, 1, 1.0, 1.0, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(50, 50, 50, 50), 0, 0);
        return gbc;
    }

    private GridBagConstraints createEditProfileLabelLayoutConstraints() {
        GridBagConstraints gbc = new GridBagConstraints(0, 0, 1, 1, 0, 0, GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets(20, 20, 20, 5), 0, 0);
        return gbc;
    }

    private GridBagConstraints createEditProfileComboBoxLayoutConstraints() {
        GridBagConstraints gbc = new GridBagConstraints(1, 0, 1, 1, 0, 0, GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets(20, 0, 20, 20), 150, 0);
        return gbc;
    }

    private GridBagConstraints createEditProfileTextFieldLayoutConstraints() {
        GridBagConstraints gbc = new GridBagConstraints(0, 1, 2, 1, 0, 0, GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets(20, 20, 20, 20), 250, 0);
        return gbc;
    }

    private GridBagConstraints createEditProfileButtonLayoutConstraints() {
        GridBagConstraints gbc = new GridBagConstraints(0, 2, 2, 1, 0, 0, GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets(20, 20, 20, 20), 0, 0);
        return gbc;
    }

}
