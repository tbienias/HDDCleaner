package edu.hda.hddcleaner.ui;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class HomePageTableModel extends AbstractTableModel {

    private String[] columnNames = {"Auswahl", "Dateiname", "Pfad"};
    private ArrayList<ArrayList<Object>> data;

    public HomePageTableModel() {
        this.data = new ArrayList<ArrayList<Object>>();
    }

    public HomePageTableModel(ArrayList<ArrayList<Object>> files) {
        this.data = new ArrayList<ArrayList<Object>>();
        this.data.addAll(files);
    }

    public int getColumnCount() {
        return columnNames.length;
    }

    public int getRowCount() {
        return data.size();
    }

    public String getColumnName(int col) {
        return columnNames[col];
    }

    public Object getValueAt(int row, int col) {
        return data.get(row).get(col);
    }

    public Class getColumnClass(int c) {
        return getValueAt(0, c).getClass();
    }

    public boolean isCellEditable(int row, int col) {
        if (col == 0) {
            return true;
        } else {
            return false;
        }
    }

    public void setValueAt(Object value, int row, int col) {
        data.get(row).set(col, value);
        fireTableCellUpdated(row, col);
    }
}
