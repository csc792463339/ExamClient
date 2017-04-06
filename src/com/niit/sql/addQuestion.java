package com.niit.sql;

import java.sql.SQLException;
import javax.swing.JOptionPane;

public class addQuestion {

    public addQuestion(String id, String question, String a, String b, String c, String d, String correct, String values, String course) {

        connectDB db = new connectDB();
        db.connectDB();
        try {
            String sql = "insert into question values(" + id + "," + "\'" + question + "\'" + "," + "\'" + a + "\'" + "," + "\'" + b + "\'" + "," + "\'" + c + "\'" + "," + "\'" + d + "\'" + "," + "\'" + correct + "\'" + "," + "\'" + values + "\'" + "," + "\'" + course + "\'" + ")";

            db.stmt.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Succeed!", "！！！", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString(), "！！！", 0);
        }

    }

}
