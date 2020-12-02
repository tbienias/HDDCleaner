package edu.hda.hddcleaner.ui;

import edu.hda.hddcleaner.ui.DeleteProfilePanel;
import edu.hda.hddcleaner.ui.EditProfilePanel;
import edu.hda.hddcleaner.ui.EditProfilesDialog;
import edu.hda.hddcleaner.ui.NewProfilePanel;
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

public class DeleteFileExtensionsPanel extends JPanel {
    JPanel centerPanel;
    JLabel deleteFileExtensionLabel;
    JComboBox deleteFileExtensionComboBox;
    JButton deleteFileExtensionButton;

    public DeleteFileExtensionsPanel() {
        this.setBackground(Color.WHITE);

        this.initDeleteFileExtensionLabel();
        this.initDeleteFileExtensionComboBox();
        this.initDeleteFileExtensionButton();
        this.initCenterPanel();
        this.setLayout(new GridBagLayout());
        this.add(this.centerPanel, this.createCenterPanelLayoutConstraints());
    }

    private void initCenterPanel() {
        this.centerPanel = new JPanel(new GridBagLayout());
        this.centerPanel.setBackground(Color.WHITE);
        this.centerPanel.add(this.deleteFileExtensionLabel, this.createDeleteFileExtensionLabelLayoutConstraints());
        this.centerPanel.add(this.deleteFileExtensionComboBox, this.createDeleteFileExtensionComboBoxLayoutConstraints());
        this.centerPanel.add(this.deleteFileExtensionButton, this.createDeleteFileExtensionButtonLayoutConstraints());
    }

    private void initDeleteFileExtensionLabel() {
        this.deleteFileExtensionLabel = new JLabel("Zu löschende Endung");
        this.deleteFileExtensionLabel.setFont(new Font("Calibri", Font.BOLD, 11));
    }

    private void initDeleteFileExtensionComboBox() {
        this.deleteFileExtensionComboBox = new JComboBox();
        this.deleteFileExtensionComboBox.setFont(new Font("Calibri", Font.BOLD, 11));
    }

    private void initDeleteFileExtensionButton() {
        this.deleteFileExtensionButton = new JButton("Endung löschen");
        this.deleteFileExtensionButton.setBackground(new Color(160, 192, 217));
        this.deleteFileExtensionButton.setForeground(Color.WHITE);
        this.deleteFileExtensionButton.setEnabled(false);
    }

    private GridBagConstraints createCenterPanelLayoutConstraints() {
        GridBagConstraints gbc = new GridBagConstraints(0, 0, 1, 1, 1.0, 1.0, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(50, 50, 50, 50), 0, 0);
        return gbc;
    }

    private GridBagConstraints createDeleteFileExtensionLabelLayoutConstraints() {
        GridBagConstraints gbc = new GridBagConstraints(0, 0, 1, 1, 0, 0, GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets(20, 20, 20, 5), 0, 0);
        return gbc;
    }

    private GridBagConstraints createDeleteFileExtensionComboBoxLayoutConstraints() {
        GridBagConstraints gbc = new GridBagConstraints(1, 0, 1, 1, 0, 0, GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets(20, 0, 20, 20), 150, 0);
        return gbc;
    }

    private GridBagConstraints createDeleteFileExtensionButtonLayoutConstraints() {
        GridBagConstraints gbc = new GridBagConstraints(0, 1, 2, 1, 0, 0, GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets(20, 20, 20, 20), 0, 0);
        return gbc;
    }
}
