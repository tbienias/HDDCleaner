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

public class DeleteProfilePanel extends JPanel {
    JPanel centerPanel;
    JLabel deleteProfileLabel;
    JComboBox deleteProfileComboBox;
    JTextField deleteProfileTextField;
    JButton deleteProfileButton;

    public DeleteProfilePanel() {
        this.setBackground(Color.WHITE);
        this.initDeleteProfileLabel();
        this.initDeleteProfileComboBox();
        this.initProfileTextField();
        this.initDeleteProfileButton();
        this.initCenterPanel();
        this.setLayout(new GridBagLayout());
        this.add(this.centerPanel, this.createCenterPanelLayoutConstraints());
    }

    private void initCenterPanel() {
        this.centerPanel = new JPanel(new GridBagLayout());
        this.centerPanel.setBackground(Color.WHITE);
        this.centerPanel.add(this.deleteProfileLabel, this.createDeleteProfileLabelLayoutConstraints());
        this.centerPanel.add(this.deleteProfileComboBox, this.createDeleteProfileComboBoxLayoutConstraints());
        this.centerPanel.add(this.deleteProfileTextField, this.createDeleteProfileTextFieldLayoutConstraints());
        this.centerPanel.add(this.deleteProfileButton, this.createDeleteProfileButtonLayoutConstraints());
    }

    private void initDeleteProfileLabel() {
        this.deleteProfileLabel = new JLabel("Zu löschendes Profil");
        this.deleteProfileLabel.setFont(new Font("Calibri", Font.BOLD, 11));
    }

    private void initDeleteProfileComboBox() {
        this.deleteProfileComboBox = new JComboBox();
        this.deleteProfileComboBox.setFont(new Font("Calibri", Font.BOLD, 11));
    }

    private void initProfileTextField() {
        this.deleteProfileTextField = new JTextField();
        this.deleteProfileTextField.setFont(new Font("Calibri", Font.BOLD, 11));
    }

    private void initDeleteProfileButton() {
        this.deleteProfileButton = new JButton("Profil löschen");
        this.deleteProfileButton.setBackground(new Color(160, 192, 217));
        this.deleteProfileButton.setForeground(Color.WHITE);
        this.deleteProfileButton.setEnabled(false);
    }

    private GridBagConstraints createCenterPanelLayoutConstraints() {
        GridBagConstraints gbc = new GridBagConstraints(0, 0, 1, 1, 1.0, 1.0, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(50, 50, 50, 50), 0, 0);
        return gbc;
    }

    private GridBagConstraints createDeleteProfileLabelLayoutConstraints() {
        GridBagConstraints gbc = new GridBagConstraints(0, 0, 1, 1, 0, 0, GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets(20, 20, 20, 5), 0, 0);
        return gbc;
    }

    private GridBagConstraints createDeleteProfileComboBoxLayoutConstraints() {
        GridBagConstraints gbc = new GridBagConstraints(1, 0, 1, 1, 0, 0, GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets(20, 0, 20, 20), 150, 0);
        return gbc;
    }

    private GridBagConstraints createDeleteProfileTextFieldLayoutConstraints() {
        GridBagConstraints gbc = new GridBagConstraints(0, 1, 2, 1, 0, 0, GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets(20, 20, 20, 20), 250, 0);
        return gbc;
    }

    private GridBagConstraints createDeleteProfileButtonLayoutConstraints() {
        GridBagConstraints gbc = new GridBagConstraints(0, 2, 2, 1, 0, 0, GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets(20, 20, 20, 20), 0, 0);
        return gbc;
    }
}
