package com.niit;

import com.niit.sql.connectDB;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Regist extends JFrame {

    private javax.swing.ButtonGroup gender;
    private javax.swing.JButton sumbit;
    private javax.swing.JComboBox classes;
    private javax.swing.JLabel name;
    private javax.swing.JLabel id;
    private javax.swing.JLabel batch;
    private javax.swing.JLabel password;
    private javax.swing.JLabel conpass;
    private javax.swing.JRadioButton woman;
    private javax.swing.JRadioButton man;
    private javax.swing.JTextField tname;
    private javax.swing.JTextField tid;
    private javax.swing.JPasswordField tpass;
    private javax.swing.JPasswordField tconpass;
    private JPanel p1;

    public ResourceBundle b;

    public Regist(int c) {

        connectDB d = new connectDB();
        ResultSet rs;
        d.connectDB();

        this.setDefaultCloseOperation(2);
        this.setTitle("NIIT");
        this.setResizable(false);
        this.setSize(330, 320);
        this.setLocationRelativeTo(null);
        this.setLayout(null);

        if (++c % 2 == 0) {
            b = ResourceBundle.getBundle("com.niit.source.exam_en_CN");
        } else {
            b = ResourceBundle.getBundle("com.niit.source.exam_en_US");
        }
        classes = new JComboBox();
        classes.setBounds(160, 90, 50, 20);
        name = new JLabel(b.getString("name"));
        name.setBounds(90, 30, 50, 20);
        id = new JLabel(b.getString("id"));
        id.setBounds(90, 60, 50, 20);
        batch = new JLabel(b.getString("class"));
        batch.setBounds(90, 90, 50, 20);
        password = new JLabel(b.getString("password"));
        password.setBounds(90, 150, 70, 20);
        conpass = new JLabel(b.getString("confirmpassword"));
        conpass.setBounds(90, 180, 70, 20);
        woman = new JRadioButton(b.getString("woman"));

        man = new JRadioButton(b.getString("man"));
        woman.setBounds(160, 120, 90, 20);
        man.setBounds(85, 120, 60, 20);
        man.setSelected(true);

        gender = new ButtonGroup();
        gender.add(man);
        gender.add(woman);

        tname = new JTextField();
        tname.setText("");
        tname.setBounds(160, 30, 80, 20);
        tid = new JTextField();
        tid.setBounds(160, 60, 50, 20);
        tid.setEditable(false);
        tid.setText("");
        tpass = new JPasswordField();
        tpass.setBounds(160, 150, 80, 20);
        tpass.setText("");
        tpass.setEchoChar('●');
        tconpass = new JPasswordField();
        tconpass.setBounds(160, 180, 80, 20);
        tconpass.setEchoChar('●');
        tconpass.setText("");

        sumbit = new JButton(b.getString("submit"));
        sumbit.setBounds(120, 220, 80, 20);

        sumbit.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                if (!(tpass.getText().equals(tconpass.getText()))) {
                    JOptionPane.showMessageDialog(null, b.getString("notsame"), b.getString("wrong"), JOptionPane.ERROR_MESSAGE);
                } else {
                    try {
                        String sql = "insert into Student values(" + "\'" + tid.getText().trim() + "\'" + "," + "\'" + tname.getText().trim() + "\'" + "," + "\'" + ((woman.isSelected()) ? ("F") : ("M")) + "\'" + "," + "\'" + tpass.getText() + "\'" + "," + "\'" + classes.getSelectedItem().toString() + "\'" + ")";
                        d.stmt.executeUpdate(sql);
                        JOptionPane.showMessageDialog(null, "successed!", b.getString("wrong"), 1);
                    } catch (SQLException ex) {
                        System.out.println(ex.getErrorCode());
                        switch (ex.getErrorCode()) {
                            case 2627:
                                JOptionPane.showMessageDialog(null, "ID 已被注册", b.getString("wrong"), JOptionPane.ERROR_MESSAGE);
                                break;
                            case 547:
                                JOptionPane.showMessageDialog(null, "Cannot be empty", b.getString("wrong"), JOptionPane.ERROR_MESSAGE);
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, ex.toString(), b.getString("wrong"), JOptionPane.ERROR_MESSAGE);
                        }
                    }

                }
            }
        });

        try {
            String sql = "select max(id) from student";
            rs = d.stmt.executeQuery(sql);
            if (rs.next()) {
                tid.setText(Integer.valueOf(rs.getString(1).trim()) + 1 + "");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.toString(), "！！！", 0);
        }

        this.add(tid);
        this.add(batch);
        this.add(classes);
        this.add(password);
        this.add(tpass);
        this.add(conpass);
        this.add(tconpass);
        this.add(woman);
        this.add(man);
        this.add(sumbit);
        this.add(name);
        this.add(tname);
        this.add(id);

        this.setVisible(true);

        try {
            String sql = "select id from class";
            rs = d.stmt.executeQuery(sql);

            while (rs.next()) {
                classes.addItem(rs.getString(1));
            }
        } catch (Exception ex) {
            System.out.println("Error Occured in addDeptIDs");
        }
    }

}
