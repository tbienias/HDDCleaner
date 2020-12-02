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

public class NewFileExtensionsPanel extends JPanel{
    JPanel centerPanel;
    JLabel newFileExtensionLabel;
    JTextField newFileExtensionTextField;
    JButton newFileExtensionButton;

    public NewFileExtensionsPanel() {
        this.setBackground(Color.WHITE);
        this.initEditFileExtensionLabel();
        this.initFileExtensionTextField();
        this.initEditFileExtensionButton();
        this.initCenterPanel();
        this.setLayout(new GridBagLayout());
        this.add(this.centerPanel, this.createCenterPanelLayoutConstraints());
    }

    private void initCenterPanel() {
        this.centerPanel = new JPanel(new GridBagLayout());
        this.centerPanel.setBackground(Color.WHITE);
        this.centerPanel.add(this.newFileExtensionLabel, this.createEditFileExtensionLabelLayoutConstraints());
        this.centerPanel.add(this.newFileExtensionTextField, this.createEditFileExtensionTextFieldLayoutConstraints());
        this.centerPanel.add(this.newFileExtensionButton, this.createEditFileExtensionButtonLayoutConstraints());
    }

    private void initEditFileExtensionLabel() {
        this.newFileExtensionLabel = new JLabel("Name der Endung");
        this.newFileExtensionLabel.setFont(new Font("Calibri", Font.BOLD, 11));
    }

    private void initFileExtensionTextField() {
        this.newFileExtensionTextField = new JTextField();
        this.newFileExtensionTextField.setFont(new Font("Calibri", Font.BOLD, 11));
    }

    private void initEditFileExtensionButton() {
        this.newFileExtensionButton = new JButton("Endung hinzufügen");
        this.newFileExtensionButton.setBackground(new Color(160, 192, 217));
        this.newFileExtensionButton.setForeground(Color.WHITE);
        this.newFileExtensionButton.setEnabled(false);
    }

    private GridBagConstraints createCenterPanelLayoutConstraints() {
        GridBagConstraints gbc = new GridBagConstraints(0, 0, 1, 1, 1.0, 1.0, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(50, 50, 50, 50), 0, 0);
        return gbc;
    }

    private GridBagConstraints createEditFileExtensionLabelLayoutConstraints() {
        GridBagConstraints gbc = new GridBagConstraints(0, 0, 1, 1, 0, 0, GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets(20, 20, 20, 5), 0, 0);
        return gbc;
    }

    private GridBagConstraints createEditFileExtensionTextFieldLayoutConstraints() {
        GridBagConstraints gbc = new GridBagConstraints(1, 0, 1, 1, 0, 0, GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets(20, 0, 20, 20), 200, 0);
        return gbc;
    }

    private GridBagConstraints createEditFileExtensionButtonLayoutConstraints() {
        GridBagConstraints gbc = new GridBagConstraints(0, 1, 2, 1, 0, 0, GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets(20, 20, 20, 20), 0, 0);
        return gbc;
    }
}
