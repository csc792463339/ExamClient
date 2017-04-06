package com.niit;

import com.niit.sql.connectDB;
import java.awt.AWTException;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import org.jvnet.substance.SubstanceLookAndFeel;
import org.jvnet.substance.skin.CremeCoffeeSkin;

public class Login extends JFrame implements ActionListener, MouseListener {

    protected JPanel LPanel1;
    protected JPanel LPanel2;
    protected JTextField Ltext;
    protected JPasswordField Lkey;
    protected JButton Llogin;
    protected JLabel Lregist;
    protected JLabel Llanuage;
    public ResourceBundle bundle;
    protected JCheckBox LremKey;
    static int change = 0;
    private Image image;
    private File file;
    private JLabel exit;

    public Login() {

        this.setTitle("NIIT EXAM SYSTEM");
        this.setDefaultCloseOperation(3);
        this.setSize(545, 264);
        this.setLocationRelativeTo(null);
        this.setResizable(false);

        if (change % 2 == 0) {
            bundle = ResourceBundle.getBundle("com.niit.source.exam_en_US");
        } else {
            bundle = ResourceBundle.getBundle("com.niit.source.exam_en_CN");
        }

        file = new File("account");
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException ex) {
                 JOptionPane.showMessageDialog(rootPane, ex.toString(), "！！！", 0);
            }
        }

        try {
            FileReader fr = new FileReader(file);
            char[] info = new char[10];
            fr.read(info);
            if (info.length != 0) {
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }

        Ltext = new JTextField();
        Ltext.setBounds(50, 90, 270, 35);
        try {
            FileReader fr = new FileReader(file);
            char[] info = new char[10];
            fr.read(info);
            if (info.length != 0) {
                Ltext.setText(String.valueOf(info).trim());
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (Ltext.getText().isEmpty()) {
            Ltext.setText(bundle.getString("username"));
            Ltext.setFont(new Font("微软雅黑 Light", Font.PLAIN, 15));
            Ltext.setForeground(Color.gray);
        }
        Ltext.addMouseListener(this);
        Ltext.addKeyListener(new KeyListener() {

            @Override
            public void keyTyped(KeyEvent e) {
                if (Ltext.getText().equals("Account")) {
                    Ltext.setText(null);
                    Ltext.setForeground(Color.BLACK);
                }
            }

            @Override
            public void keyPressed(KeyEvent e) {
                if (Ltext.getText().equals("Account")) {
                    Ltext.setText(null);
                    Ltext.setForeground(Color.BLACK);
                }
                if (e.getKeyCode() == 10) {
                    Lkey.setText(null);
                    Lkey.requestFocus();
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
                if (Ltext.getText().equals("Account")) {
                    Ltext.setText(null);
                    Ltext.setForeground(Color.BLACK);
                }
            }
        });
        Lkey = new JPasswordField();

        Lkey.setText("000000");
        Lkey.setEchoChar('●');
        Lkey.setForeground(Color.black);
        Lkey.setBounds(50, 130, 270, 35);
        Lkey.addKeyListener(new KeyListener() {

            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == 10) {
                    try {
                        Robot r = new Robot();
                        r.mouseMove(Toolkit.getDefaultToolkit().getScreenSize().width / 2, Toolkit.getDefaultToolkit().getScreenSize().height / 2 + 55);
                        r.mousePress(InputEvent.BUTTON1_MASK);
                        r.mouseRelease(InputEvent.BUTTON1_MASK);
                    } catch (AWTException ex) {
                        Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });

        Llogin = new JButton();
        Llogin.setText(bundle.getString("login"));
        Llogin.setFont(new Font("微软雅黑", Font.PLAIN, 20));
        Llogin.setBackground(new Color(238, 134, 144));
        Llogin.setForeground(new Color(26, 27, 28));
        Llogin.setBounds(235, 200, 85, 35);
        Llogin.addActionListener(this);
        Llogin.addMouseListener(this);

        Lregist = new JLabel();
        Lregist.setText(bundle.getString("Regist"));
        Lregist.setFont(new Font("微软雅黑 Light", Font.PLAIN, 20));
        Lregist.setForeground(Color.WHITE);
        Lregist.setBounds(376, 33, 100, 30);
        Lregist.addMouseListener(this);

        Llanuage = new JLabel();
        Llanuage.setText("Lanuage");
        Llanuage.setBounds(375, 70, 90, 20);
        Llanuage.setFont(new Font("Berlin Sans FB", Font.PLAIN, 16));
        Llanuage.setForeground(Color.pink);
        Llanuage.addMouseListener(this);

        LremKey = new JCheckBox();
        LremKey.setText(bundle.getString("Rember"));
        LremKey.setFont(new Font("微软雅黑 Light", Font.PLAIN, 15));
        LremKey.setBounds(50, 210, 132, 15);
        LremKey.setForeground(Color.WHITE);
        LremKey.setFocusPainted(false);

        LremKey.setOpaque(false);
        LremKey.addMouseListener(this);

        Lkey.addFocusListener(new FocusListener() {

            @Override
            public void focusGained(FocusEvent e) {
                if (!Ltext.getText().equals("Account")) {
                    Lkey.setText(null);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {

            }
        });

        exit = new JLabel();
        exit.setBounds(520, 5, 22, 22);
        exit.setIcon(new ImageIcon(getClass().getResource("/com/niit/source/close.png")));
        exit.addMouseListener(this);
        this.add(exit);

        this.add(Lkey);
        this.add(Llogin);
        this.add(Lregist);
        this.add(Llanuage);
        this.add(LremKey);
        this.add(Ltext);

        JPanel contentPane = new JPanel() {
            @Override
            public void paint(Graphics g) {
                ImageIcon icon = new ImageIcon(getClass().getResource("/com/niit/source/login.jpg"));
                image = icon.getImage();
                g.drawImage(image, 0, 0, null);
            }
        };

        this.add(contentPane);
        this.setUndecorated(true);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        //   JFrame.setDefaultLookAndFeelDecorated(true);
        JDialog.setDefaultLookAndFeelDecorated(true);
        SubstanceLookAndFeel.setSkin(new CremeCoffeeSkin());
        Login l = new Login();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == Llogin) {
            if (Ltext.getText().isEmpty() || Lkey.getText().isEmpty()) {
                JOptionPane.showMessageDialog(rootPane, "请先输入账号和密码", "！！！", 2);
            } else {
                if (LremKey.isSelected()) {
                    try {
                        FileWriter fw = new FileWriter(file);
                        fw.write(Ltext.getText().trim().toCharArray());
                        fw.flush();
                    } catch (IOException ex) {
                        Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } else {
                    try {
                        FileWriter fw = new FileWriter(file);
                        fw.write("");
                        fw.flush();
                    } catch (IOException ex) {
                        Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                if (Ltext.getText().equals("admin")) {
                    if (Lkey.getText().equals("admin")) {
                        new Manage(change).setVisible(true);
                        this.dispose();

                    } else {
                        JOptionPane.showMessageDialog(rootPane, "密码错误", "！！！", 0);
                    }
                } else {
                    try {
                        connectDB d = new connectDB();
                        d.connectDB();
                        ResultSet rs = d.stmt.executeQuery("select passwords from student where id=" + Ltext.getText());
                        rs.next();
                        if (rs.getString(1).equals(Lkey.getText().trim())) {
                            Student s=new Student(Ltext.getText(),change);
                        //    s.setUndecorated(true);
                            s.setVisible(true);
                             this.dispose();
                        } else {
                            JOptionPane.showMessageDialog(rootPane, "密码错误", "！！！", 0);
                        }
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(rootPane, "账号未注册", "！！！", 0);
                    }
                }
            }
        }

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == Llanuage) {

            if (++change % 2 == 0) {
                bundle = ResourceBundle.getBundle("com.niit.source.exam_en_US");
                Llogin.setText(bundle.getString("login"));
                Lregist.setText(bundle.getString("Regist"));
                LremKey.setText(bundle.getString("Rember"));

            } else {
                bundle = ResourceBundle.getBundle("com.niit.source.exam_en_CN");

                Llogin.setText(bundle.getString("login"));
                Lregist.setText(bundle.getString("Regist"));
                LremKey.setText(bundle.getString("Rember"));
            }

        } else if (e.getSource() == Lregist) {

            new Regist(change).show();
        } else if (e.getSource() == exit) {

            this.dispose();
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
        if (e.getSource() == Ltext) {

            if (Ltext.getText().equals(bundle.getString("username"))) {
                Ltext.setText(null);
                Ltext.setForeground(Color.BLACK);

            }
        } else if (e.getSource() == Lkey) {
            Lkey.setText(null);

        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        setCursor(12);

    }

    @Override
    public void mouseExited(MouseEvent e) {
        setCursor(0);
    }
}
