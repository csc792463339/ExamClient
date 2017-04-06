/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.niit.sql;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class getPaper {

    static int i = 0;
    connectDB db;
    ResultSet rs;
    String describe, time;
    String[] question, answer, qtext, a, b, c, d, value,course;

    public getPaper(String id) {
        db = new connectDB();
        db.connectDB();
        try {
            rs = db.stmt.executeQuery("select * from EXAM where id=" + id);
            rs.next();
            describe = rs.getString(2);
            question = rs.getString(3).split(",");
            time = rs.getString(5);
            answer = new String[question.length];
            qtext = new String[question.length];
            a = new String[question.length];
            b = new String[question.length];
            c = new String[question.length];
            d = new String[question.length];
            value = new String[question.length];
            course=new String[question.length];

            for (i = 0; i < question.length; i++) {
                rs = db.stmt.executeQuery("select * from QUESTION where id=" + question[i]);
                rs.next();
                qtext[i] = rs.getString(2);
                a[i] = rs.getString(3);
                b[i] = rs.getString(4);
                c[i] = rs.getString(5);
                d[i] = rs.getString(6);
                answer[i] = rs.getString(7);
                value[i] = rs.getString(8);
                course[i]=rs.getString(9);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString(), "ERROR!", JOptionPane.ERROR_MESSAGE);
        }
    }

    public String getDescribe() {
        return describe;
    }

    public String getTime() {
        return time;
    }

    public String[] getQuestion() {
        return question;
    }

    public String[] getAnswer() {
        return answer;
    }

    public String[] getQuestionText() {
        return qtext;
    }

    public String[] getA() {
        return a;
    }

    public String[] getB() {
        return b;
    }

    public String[] getC() {
        return c;
    }

    public String[] getD() {
        return d;
    }

    public String[] getValue() {
        return value;
    }

    public String[] getCourse() {
        return course;
    }

}
