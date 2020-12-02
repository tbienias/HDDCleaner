package edu.hda.hddcleaner.main;

import edu.hda.hddcleaner.ui.MainWindow;

public class HDDCleaner {

    public static void main(String[] args) {
        System.out.println("HDDCleaner::main()");
        MainWindow gui = new MainWindow();
        gui.setSize(800, 600);
        gui.setVisible(true);
    }
}
