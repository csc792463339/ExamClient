package com.niit.sql;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class addCourse {

    public addCourse(String id, String name, String datail) {

        connectDB d = new connectDB();
        d.connectDB();
        try {
            String sql = "insert into course values(" + id + "," + "\'" + name + "\'" + "," + "\'" + datail + "\'" + ")";
            d.stmt.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Succeed!", "！！！", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString(), "！！！", 0);
        }

    }
}
