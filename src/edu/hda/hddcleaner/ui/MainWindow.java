package edu.hda.hddcleaner.ui;

import edu.hda.hddcleaner.ui.TabbedPane;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainWindow extends JFrame {
    // Attributes --begin--
    private Color guiMainBackgroundColor;
    private JPanel mainPanel;
    private JLabel headLineLabel;
    // Attributes --end--

    // Methods --begin--
    public MainWindow() {
        super("Festplattenreiniger beta 0.1");
        System.out.println("FestplattenreinigerGraphicalUserInterfaceMainWindow::FestplattenreinigerGraphicalUserInterfaceMainWindow()");
        initGUIMainBackgroundColor();
        initMainPanel();
        this.getContentPane().add(this.mainPanel);
    }

    private void initGUIMainBackgroundColor() {
        System.out.println("FestplattenreinigerGraphicalUserInterfaceMainWindow::initGUIMainBackgroundColor()");
        this.guiMainBackgroundColor = new Color(160, 192, 217);
    }

    private void initMainPanel() {
        System.out.println("FestplattenreinigerGraphicalUserInterfaceMainWindow::initMainPanel()");
        this.initHeadLineLabel();

        this.mainPanel = new JPanel();
        this.mainPanel.setBackground(this.guiMainBackgroundColor);

        // Layout --begin--
        this.mainPanel.setLayout(new GridBagLayout());       
        this.mainPanel.add(this.headLineLabel, this.createLabelLayoutConstraints());
        this.mainPanel.add(new TabbedPane(), this.createTabbedPaneLayoutConstraints());
        // Layout --end--
    }

    private void initHeadLineLabel() {
        System.out.println("FestplattenreinigerGraphicalUserInterfaceMainWindow::initHeadLineLabel()");
        this.headLineLabel = new JLabel("Festplattenreiniger", new ImageIcon("icons/festplatte.jpg"), JLabel.LEFT);
        this.headLineLabel.setHorizontalTextPosition(JLabel.LEFT);
        this.headLineLabel.setFont(new Font("Calirbi", Font.BOLD, 18));
        this.headLineLabel.setForeground(Color.WHITE);
    }

    private GridBagConstraints createLabelLayoutConstraints() {
        System.out.println("FestplattenreinigerGraphicalUserInterfaceMainWindow::createLabelLayoutContraints()");
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;//GridBagConstraints.RELATIVE;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.ipadx = 0;
        gbc.ipady = 0;
        gbc.insets = new Insets(5, 10, 0, 0);
        gbc.anchor = GridBagConstraints.PAGE_START;
//        gbc.weightx = 1.0;
//        gbc.weighty = 1.0;
        return gbc;
    }

    private GridBagConstraints createTabbedPaneLayoutConstraints() {
        System.out.println("FestplattenreinigerGraphicalUserInterfaceMainWindow::createTabbedPaneLayoutConstraints()");
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
    // Methods --end--
}

