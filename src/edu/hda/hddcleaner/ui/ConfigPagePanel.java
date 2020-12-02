package edu.hda.hddcleaner.ui;

import edu.hda.hddcleaner.ui.EditFileExtensionsDialog;
import edu.hda.hddcleaner.ui.EditProfilesDialog;
import java.awt.Color;
import java.awt.Dialog.ModalityType;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ConfigPagePanel extends JPanel {

    // Attributes --begin--
    JPanel centerPanel;
    JButton editPathsButton;
    JButton editFileExtensionsButton;
    JButton editProfilesButton;
    JLabel editPathsLabel;
    JLabel editFileExtensionsLabel;
    JLabel editProfilesLabel;
    // Attributes --end--

    // Methods --begin--
    public ConfigPagePanel() {
        this.setBackground(Color.WHITE);
        this.initEditPathsLabel();
        this.initEditFileExtensionsLabel();
        this.initEditProfilesLabel();
        this.initEditPathsButton();
        this.initEditFileExtensionsButton();
        this.initEditProfilesButton();
        this.initCenterPanel();

        // Layout --begin--
        this.setLayout(new GridBagLayout());
        this.add(this.centerPanel, this.createCenterPanelLayoutConstraints());
        // Layout --end--
    }

    private void initCenterPanel() {
        this.centerPanel = new JPanel(new GridBagLayout());
        this.centerPanel.setBackground(Color.WHITE);
        this.centerPanel.add(this.editPathsLabel, this.createEditPathsLabelLayoutConstraints());
        this.centerPanel.add(this.editPathsButton, this.createEditPathsButtonLayoutConstraints());
        this.centerPanel.add(this.editFileExtensionsLabel, this.createEditFileExtensionsLabelLayoutConstraints());
        this.centerPanel.add(this.editFileExtensionsButton, this.createEditFileExtensionsButtonLayoutConstraints());
        this.centerPanel.add(this.editProfilesLabel, this.createEditProfilesLabelLayoutConstraints());
        this.centerPanel.add(this.editProfilesButton, this.createEditProfilesButtonLayoutConstraints());
    }

    private void initEditPathsButton() {
        this.editPathsButton = new JButton("Pfade bearbeiten");
        this.editPathsButton.setBackground(new Color(160, 192, 217));
        this.editPathsButton.setForeground(Color.WHITE);
    }

    private void initEditFileExtensionsButton() {
        this.editFileExtensionsButton = new JButton("Dateiendungen bearbeiten");
        this.editFileExtensionsButton.setBackground(new Color(160, 192, 217));
        this.editFileExtensionsButton.setForeground(Color.WHITE);
        this.editFileExtensionsButton.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                EditFileExtensionsDialog d = new EditFileExtensionsDialog();
                d.setVisible(true);
            }
        });
    }

    private void initEditProfilesButton() {
        this.editProfilesButton = new JButton("Profile bearbeiten");
        this.editProfilesButton.setBackground(new Color(160, 192, 217));
        this.editProfilesButton.setForeground(Color.WHITE);
        this.editProfilesButton.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                EditProfilesDialog d = new EditProfilesDialog();
                d.setVisible(true);
            }
        });
    }

    private void initEditPathsLabel() {
        this.editPathsLabel = new JLabel("Suchordner festlegen", new ImageIcon("icons/ordner.jpg"), JLabel.LEFT);
        this.editPathsLabel.setHorizontalTextPosition(JLabel.RIGHT);
        this.editPathsLabel.setFont(new Font("Calirbi", Font.BOLD, 11));
    }

    private void initEditFileExtensionsLabel() {
        this.editFileExtensionsLabel = new JLabel("Dateiendungen festlegen", new ImageIcon("icons/trichter.jpg"), JLabel.LEFT);
        this.editFileExtensionsLabel.setHorizontalTextPosition(JLabel.RIGHT);
        this.editFileExtensionsLabel.setFont(new Font("Calirbi", Font.BOLD, 11));
    }

    private void initEditProfilesLabel() {
        this.editProfilesLabel = new JLabel("Profile anlegen und verwalten", new ImageIcon("icons/benutzer.jpg"), JLabel.LEFT);
        this.editProfilesLabel.setHorizontalTextPosition(JLabel.RIGHT);
        this.editProfilesLabel.setFont(new Font("Calirbi", Font.BOLD, 11));
    }

    public GridBagConstraints createCenterPanelLayoutConstraints() {
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.ipadx = 0;
        gbc.ipady = 0;
        gbc.insets = new Insets(50, 50, 50, 50);
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        return gbc;
    }

    private GridBagConstraints createEditPathsLabelLayoutConstraints() {
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        gbc.fill = GridBagConstraints.NONE;
        gbc.ipadx = 0;
        gbc.ipady = 0;
        gbc.insets = new Insets(0, 0, 15, 5);
        gbc.anchor = GridBagConstraints.LINE_END;
        return gbc;
    }

    private GridBagConstraints createEditPathsButtonLayoutConstraints() {
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        gbc.fill = GridBagConstraints.NONE;
        gbc.ipadx = 69;
        gbc.ipady = 0;
        gbc.insets = new Insets(0, 0, 15, 0);
        gbc.anchor = GridBagConstraints.CENTER;
        return gbc;
    }

    private GridBagConstraints createEditFileExtensionsLabelLayoutConstraints() {
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        gbc.fill = GridBagConstraints.NONE;
        gbc.ipadx = 0;
        gbc.ipady = 0;
        gbc.insets = new Insets(15, 0, 15, 5);
        gbc.anchor = GridBagConstraints.LINE_END;
        return gbc;
    }

    private GridBagConstraints createEditFileExtensionsButtonLayoutConstraints() {
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        gbc.fill = GridBagConstraints.NONE;
        gbc.ipadx = 0;
        gbc.ipady = 0;
        gbc.insets = new Insets(15, 0, 15, 0);
        gbc.anchor = GridBagConstraints.CENTER;
        return gbc;
    }

    private GridBagConstraints createEditProfilesLabelLayoutConstraints() {
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        gbc.fill = GridBagConstraints.NONE;
        gbc.ipadx = 0;
        gbc.ipady = 0;
        gbc.insets = new Insets(15, 0, 0, 5);
        gbc.anchor = GridBagConstraints.LINE_END;
        return gbc;
    }

    private GridBagConstraints createEditProfilesButtonLayoutConstraints() {
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        gbc.fill = GridBagConstraints.NONE;
        gbc.ipadx = 64;
        gbc.ipady = 0;
        gbc.insets = new Insets(15, 0, 0, 0);
        gbc.anchor = GridBagConstraints.CENTER;
        return gbc;
    }

    // Methods --end--
}
