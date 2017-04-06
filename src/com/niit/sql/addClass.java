package com.niit.sql;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class addClass {

    public addClass(String id, String name, String startDate, String endDate) {
        connectDB d = new connectDB();
        d.connectDB();
        try {
            String sql = "insert into class values(" + id + "," + "\'" + name + "\'" + "," + "\'" + startDate + "\'" + "," + "\'" + endDate + "\'" + ")";
            d.stmt.executeUpdate(sql);
               JOptionPane.showMessageDialog(null, "Succeed!", "！！！", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString(), "！！！", 0);
        }

    }
}
