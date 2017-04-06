package com.niit.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class connectDB {

    public Connection con;
    public Statement stmt;

    public void connectDB() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;DatabaseName=EXAM";
            String user = "sa";
            String password = "123";
            con = DriverManager.getConnection(url, user, password);
// stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);        
    stmt = con.createStatement();
        } catch (Exception ex) {
            System.out.println("Connection failed!");
           JOptionPane.showMessageDialog(null, ex.toString(),"Error!!!", JOptionPane.ERROR_MESSAGE);
        }
    }
}
