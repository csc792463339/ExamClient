package com.niit.sql;

import java.sql.SQLException;
import javax.swing.JOptionPane;

public class addExam {

    public addExam(String id, String desc, String question,String classes,String time,String date) {
        
        connectDB d = new connectDB();
        d.connectDB();
        try {
          String sql = "insert into exam values(" + id + "," + "\'" + desc + "\'" + "," + "\'" + question + "\'" + "," + "\'" + classes + "\'" + "," +"\'"+ time + "\'"+"," + "\'" + date + "\'" + ")";
          d.stmt.executeUpdate(sql);
          JOptionPane.showMessageDialog(null, "Succeed!", "！！！", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString(), "！！！", 0);
        }

    }
}
