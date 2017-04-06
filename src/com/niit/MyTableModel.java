package com.niit;

import com.niit.sql.connectDB;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;

public class MyTableModel extends AbstractTableModel {

    int row = 0;
    String[] columnNames = {"ID", "Question", "Value", "Course", "Chose"};
    Object[][] data;

    public MyTableModel() {
        connectDB d = new connectDB();
        d.connectDB();
        ResultSet rs;

        try {
            rs = d.stmt.executeQuery("select COUNT(id) from QUESTION");
            if (rs.next()) {
                row = rs.getInt(1);
            }
            
            data = new Object[row][5];
            rs = d.stmt.executeQuery("select ID,QUESTION,VALUE,COURSE from QUESTION");
            for (int i = 0; i < row; i++) {
                if (rs.next()) {
                    for (int k = 0; k < 4; k++) {
                        data[i][k] = rs.getString(k + 1);
                        data[i][4] = false;
                    }
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString(), "！！！", 0);
        }
    }

    public int getNum(){
     int num = 0;
        for (int i = 0; i < row; i++) {
            if (data[i][4].toString().equals("true")) {
            num++;
            }
        }
        return num;
    
    }
    
    public String[] getSelect() {
        String[] s = new String[row];
        int num = 0;
        for (int i = 0; i < row; i++) {
            if (data[i][4].toString().equals("true")) {
                s[num++] = data[i][0].toString();
            }
        }
        return s;
    }

    @Override
    public String getColumnName(int column) {
        return columnNames[column];
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public int getRowCount() {   
        return data.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return data[rowIndex][columnIndex];
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return data[0][columnIndex].getClass();
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        if (columnIndex < 4) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        data[rowIndex][columnIndex] = aValue;
        fireTableCellUpdated(rowIndex, columnIndex);
    }

}
