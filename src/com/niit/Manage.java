package com.niit;

import com.niit.sql.addClass;
import com.niit.sql.addCourse;
import com.niit.sql.addExam;
import com.niit.sql.addQuestion;
import com.niit.sql.connectDB;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Manage extends javax.swing.JFrame {

    DateChooser classStartDate, classEndDate, examStartDate;
    DefaultTableModel model, model1;
    ResourceBundle bundle;
    JTable table1, table2;
    connectDB d;
    ArrayList al;
    MyTableModel t;
    ResultSet rs;
    Vector v;
    String path;

    public Manage(int c) {

        this.setUndecorated(true);
        if (c % 2 == 1) {
            bundle = ResourceBundle.getBundle("com.niit.source.exam_en_CN");
        } else {
            bundle = ResourceBundle.getBundle("com.niit.source.exam_en_US");
        }
        initComponents();
        if (c % 2 == 1) {
            ClassID.setText(bundle.getString("ClassID"));
            addClass.setText(bundle.getString("addClass"));
            addCourse.setText(bundle.getString("addCourse"));
            addExam.setText(bundle.getString("addClass"));
            addQuestion.setText(bundle.getString("addQuestion"));
            claseName.setText(bundle.getString("claseName"));
            courseDetail.setText(bundle.getString("courseDetail"));
            courseId.setText(bundle.getString("courseId"));
            courseName.setText(bundle.getString("courseName"));
            endDate.setText(bundle.getString("endDate"));
            examDate.setText(bundle.getString("examDate"));
            examDescribe.setText(bundle.getString("examDescribe"));
            examId.setText(bundle.getString("examId"));
            examTime.setText(bundle.getString("examTime"));
            infoname1.setText(bundle.getString("ID"));
            infoname3.setText(bundle.getString("Name"));
            infoname4.setText(bundle.getString("Class"));
            infoname5.setText(bundle.getString("Gender"));
            question.setText(bundle.getString("question"));
            questionCourse.setText(bundle.getString("questionCourse"));
            questionCurrect.setText(bundle.getString("questionCurrect"));
            questionId.setText(bundle.getString("questionId"));
            questionScore.setText(bundle.getString("questionScore"));
            save.setText(bundle.getString("save"));
            startDate.setText(bundle.getString("startDate"));

        }

        classStartDate = new DateChooser();
        classStartDate.setOpaque(false);
        classEndDate = new DateChooser();
        examStartDate = new DateChooser();
        examStartDate.setOpaque(false);
        d = new connectDB();
        d.connectDB();

        try {
            rs = d.stmt.executeQuery("select id from  student");
            while (rs.next()) {
                infostudent.addItem(rs.getString(1));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.toString(), "！！！", 0);
        }

        this.setTitle("Manager");
        this.setResizable(false);
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        student = new javax.swing.JTabbedPane()
        {          protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            ImageIcon image = new ImageIcon(getClass().getResource("/com/niit/source/web8.jpg"));
            image.setImage(image.getImage().getScaledInstance(this.getWidth(), this.getHeight(), Image.SCALE_FAST));
            image.paintIcon(this, g, 0, 0);
        }
    };
    jTabbedPane14 = new javax.swing.JTabbedPane();
    studentClass = new javax.swing.JPanel();
    ClassID = new javax.swing.JLabel();
    claseName = new javax.swing.JLabel();
    startDate = new javax.swing.JLabel();
    endDate = new javax.swing.JLabel();
    classIdText = new javax.swing.JTextField();
    classNameText = new javax.swing.JTextField();
    addClass = new javax.swing.JButton();
    studentCourse = new javax.swing.JPanel();
    courseId = new javax.swing.JLabel();
    courseIdText = new javax.swing.JTextField();
    courseName = new javax.swing.JLabel();
    courseNameText = new javax.swing.JTextField();
    courseDetail = new javax.swing.JLabel();
    courseDetailText = new javax.swing.JTextField();
    addCourse = new javax.swing.JButton();
    s3 = new javax.swing.JPanel();
    s4 = new javax.swing.JPanel();
    s5 = new javax.swing.JPanel();
    exam = new javax.swing.JTabbedPane();
    e1 = new javax.swing.JPanel();
    questionId = new javax.swing.JLabel();
    questionIdText = new javax.swing.JTextField();
    questionCourse = new javax.swing.JLabel();
    questionScore = new javax.swing.JLabel();
    questionScoreText = new javax.swing.JTextField();
    questionCurrect = new javax.swing.JLabel();
    choseCourse = new javax.swing.JComboBox();
    questionCurrectOp = new javax.swing.JComboBox();
    aText = new javax.swing.JTextField();
    A = new javax.swing.JLabel();
    B = new javax.swing.JLabel();
    bText = new javax.swing.JTextField();
    C = new javax.swing.JLabel();
    cText = new javax.swing.JTextField();
    dText = new javax.swing.JTextField();
    D = new javax.swing.JLabel();
    addQuestion = new javax.swing.JButton();
    question = new javax.swing.JLabel();
    questionText = new javax.swing.JTextField();
    e2 = new javax.swing.JPanel();
    examId = new javax.swing.JLabel();
    examIdText = new javax.swing.JTextField();
    examDate = new javax.swing.JLabel();
    examId2 = new javax.swing.JLabel();
    examTime = new javax.swing.JLabel();
    examtimeText = new javax.swing.JTextField();
    examClass = new javax.swing.JComboBox();
    examDescribe = new javax.swing.JLabel();
    addExam = new javax.swing.JButton();
    examDescribeText2 = new javax.swing.JTextField();
    e3 = new javax.swing.JPanel();
    e4 = new javax.swing.JPanel();
    e5 = new javax.swing.JPanel();
    questionId1 = new javax.swing.JLabel();
    questionCourse1 = new javax.swing.JLabel();
    questionScore1 = new javax.swing.JLabel();
    questionCurrect1 = new javax.swing.JLabel();
    A1 = new javax.swing.JLabel();
    B1 = new javax.swing.JLabel();
    C1 = new javax.swing.JLabel();
    D1 = new javax.swing.JLabel();
    question1 = new javax.swing.JLabel();
    jTextField1 = new javax.swing.JTextField();
    jTextField2 = new javax.swing.JTextField();
    jTextField3 = new javax.swing.JTextField();
    jTextField4 = new javax.swing.JTextField();
    jTextField5 = new javax.swing.JTextField();
    jTextField6 = new javax.swing.JTextField();
    jComboBox4 = new javax.swing.JComboBox();
    jComboBox3 = new javax.swing.JComboBox();
    jComboBox2 = new javax.swing.JComboBox();
    jButton1 = new javax.swing.JButton();
    jButton2 = new javax.swing.JButton();
    queryExam = new javax.swing.JTabbedPane();
    q2 = new javax.swing.JPanel();
    jComboBox1 = new javax.swing.JComboBox();
    q3 = new javax.swing.JPanel();
    stuinfo = new javax.swing.JPanel()
    {          protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        ImageIcon image = new ImageIcon(getClass().getResource("/com/niit/source/web5.png"));
        image.setImage(image.getImage().getScaledInstance(this.getWidth(), this.getHeight(), Image.SCALE_FAST));
        image.paintIcon(this, g, 0, 0);
    }
    };
    infoname = new javax.swing.JLabel();
    infoname1 = new javax.swing.JLabel();
    infoid = new javax.swing.JLabel();
    infoname3 = new javax.swing.JLabel();
    infoname4 = new javax.swing.JLabel();
    infoname5 = new javax.swing.JLabel();
    infogender = new javax.swing.JLabel();
    infoclass = new javax.swing.JLabel();
    save = new javax.swing.JButton();
    infostudent = new javax.swing.JComboBox();
    jPanel1 = new javax.swing.JPanel();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    student.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 51, 153), null));
    student.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
    student.setTabPlacement(javax.swing.JTabbedPane.LEFT);
    student.setAlignmentX(0.0F);
    student.setAlignmentY(0.0F);
    student.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
    student.setDoubleBuffered(true);
    student.setFont(new java.awt.Font("微软雅黑 Light", 1, 18)); // NOI18N

    jTabbedPane14.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
    jTabbedPane14.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
    jTabbedPane14.addComponentListener(new java.awt.event.ComponentAdapter() {
        public void componentShown(java.awt.event.ComponentEvent evt) {
            jTabbedPane14ComponentShown(evt);
        }
    });

    studentClass.setForeground(new java.awt.Color(204, 204, 0));
    studentClass.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
    studentClass.setName("ccccc"); // NOI18N
    studentClass.setOpaque(false);
    studentClass.addComponentListener(new java.awt.event.ComponentAdapter() {
        public void componentShown(java.awt.event.ComponentEvent evt) {
            studentClassComponentShown(evt);
        }
    });

    ClassID.setBackground(new java.awt.Color(0, 0, 0));
    ClassID.setFont(new java.awt.Font("微软雅黑", 0, 18)); // NOI18N
    ClassID.setText("ID");

    claseName.setFont(new java.awt.Font("微软雅黑", 0, 18)); // NOI18N
    claseName.setText("Name");

    startDate.setFont(new java.awt.Font("微软雅黑", 0, 18)); // NOI18N
    startDate.setText("StartDate");

    endDate.setFont(new java.awt.Font("微软雅黑", 0, 18)); // NOI18N
    endDate.setText("EndDate");

    classIdText.setEditable(false);
    classIdText.setFont(new java.awt.Font("微软雅黑", 0, 18)); // NOI18N
    classIdText.setText("000");
    classIdText.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            classIdTextActionPerformed(evt);
        }
    });

    classNameText.setFont(new java.awt.Font("微软雅黑", 0, 18)); // NOI18N

    addClass.setFont(new java.awt.Font("微软雅黑", 0, 18)); // NOI18N
    addClass.setText("Add");
    addClass.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            addClassActionPerformed(evt);
        }
    });

    javax.swing.GroupLayout studentClassLayout = new javax.swing.GroupLayout(studentClass);
    studentClass.setLayout(studentClassLayout);
    studentClassLayout.setHorizontalGroup(
        studentClassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(studentClassLayout.createSequentialGroup()
            .addContainerGap(180, Short.MAX_VALUE)
            .addGroup(studentClassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addComponent(claseName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ClassID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGap(39, 39, 39)
            .addGroup(studentClassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(classNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(classIdText, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addContainerGap(207, Short.MAX_VALUE))
        .addGroup(studentClassLayout.createSequentialGroup()
            .addGroup(studentClassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(studentClassLayout.createSequentialGroup()
                    .addGap(188, 188, 188)
                    .addGroup(studentClassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(startDate)
                        .addComponent(endDate)))
                .addGroup(studentClassLayout.createSequentialGroup()
                    .addGap(276, 276, 276)
                    .addComponent(addClass)))
            .addContainerGap(269, Short.MAX_VALUE))
    );
    studentClassLayout.setVerticalGroup(
        studentClassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(studentClassLayout.createSequentialGroup()
            .addGap(37, 37, 37)
            .addGroup(studentClassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(ClassID)
                .addComponent(classIdText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(30, 30, 30)
            .addGroup(studentClassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(claseName)
                .addComponent(classNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(33, 33, 33)
            .addComponent(startDate)
            .addGap(28, 28, 28)
            .addComponent(endDate)
            .addGap(53, 53, 53)
            .addComponent(addClass)
            .addContainerGap(67, Short.MAX_VALUE))
    );

    jTabbedPane14.addTab(bundle.getString("addClass"), new javax.swing.ImageIcon(getClass().getResource("/com/niit/source/ui10.png")), studentClass); // NOI18N

    studentCourse.setOpaque(false);
    studentCourse.addComponentListener(new java.awt.event.ComponentAdapter() {
        public void componentShown(java.awt.event.ComponentEvent evt) {
            studentCourseComponentShown(evt);
        }
    });

    courseId.setFont(new java.awt.Font("微软雅黑", 0, 18)); // NOI18N
    courseId.setText("ID");

    courseIdText.setEditable(false);
    courseIdText.setFont(new java.awt.Font("微软雅黑", 0, 18)); // NOI18N
    courseIdText.setText("0");
    courseIdText.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            courseIdTextActionPerformed(evt);
        }
    });

    courseName.setFont(new java.awt.Font("微软雅黑", 0, 18)); // NOI18N
    courseName.setText("Name");

    courseNameText.setFont(new java.awt.Font("微软雅黑", 0, 18)); // NOI18N
    courseNameText.setText("java");

    courseDetail.setFont(new java.awt.Font("微软雅黑", 0, 18)); // NOI18N
    courseDetail.setText("Detail");

    courseDetailText.setFont(new java.awt.Font("微软雅黑", 0, 18)); // NOI18N
    courseDetailText.setText("java world");

    addCourse.setFont(new java.awt.Font("微软雅黑", 0, 18)); // NOI18N
    addCourse.setText("Add");
    addCourse.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            addCourseActionPerformed(evt);
        }
    });

    javax.swing.GroupLayout studentCourseLayout = new javax.swing.GroupLayout(studentCourse);
    studentCourse.setLayout(studentCourseLayout);
    studentCourseLayout.setHorizontalGroup(
        studentCourseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(studentCourseLayout.createSequentialGroup()
            .addGroup(studentCourseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(studentCourseLayout.createSequentialGroup()
                    .addGap(254, 254, 254)
                    .addComponent(addCourse)
                    .addGap(0, 0, Short.MAX_VALUE))
                .addGroup(studentCourseLayout.createSequentialGroup()
                    .addGap(184, 184, 184)
                    .addGroup(studentCourseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(studentCourseLayout.createSequentialGroup()
                            .addComponent(courseDetail, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(courseDetailText, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(studentCourseLayout.createSequentialGroup()
                            .addGroup(studentCourseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(courseName)
                                .addComponent(courseId))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(studentCourseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(courseNameText, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                                .addComponent(courseIdText))))))
            .addGap(163, 163, 163))
    );
    studentCourseLayout.setVerticalGroup(
        studentCourseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(studentCourseLayout.createSequentialGroup()
            .addGap(70, 70, 70)
            .addGroup(studentCourseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(courseId)
                .addComponent(courseIdText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(33, 33, 33)
            .addGroup(studentCourseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(courseName)
                .addComponent(courseNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(40, 40, 40)
            .addGroup(studentCourseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(courseDetail)
                .addComponent(courseDetailText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
            .addComponent(addCourse)
            .addGap(43, 43, 43))
    );

    jTabbedPane14.addTab(bundle.getString("addCourse"), new javax.swing.ImageIcon(getClass().getResource("/com/niit/source/ui11.png")), studentCourse); // NOI18N

    s3.setOpaque(false);
    s3.addComponentListener(new java.awt.event.ComponentAdapter() {
        public void componentShown(java.awt.event.ComponentEvent evt) {
            s3ComponentShown(evt);
        }
    });

    javax.swing.GroupLayout s3Layout = new javax.swing.GroupLayout(s3);
    s3.setLayout(s3Layout);
    s3Layout.setHorizontalGroup(
        s3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGap(0, 614, Short.MAX_VALUE)
    );
    s3Layout.setVerticalGroup(
        s3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGap(0, 389, Short.MAX_VALUE)
    );

    jTabbedPane14.addTab(bundle.getString("AllClass"), new javax.swing.ImageIcon(getClass().getResource("/com/niit/source/ui12.png")), s3); // NOI18N

    s4.addComponentListener(new java.awt.event.ComponentAdapter() {
        public void componentShown(java.awt.event.ComponentEvent evt) {
            s4ComponentShown(evt);
        }
    });

    javax.swing.GroupLayout s4Layout = new javax.swing.GroupLayout(s4);
    s4.setLayout(s4Layout);
    s4Layout.setHorizontalGroup(
        s4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGap(0, 614, Short.MAX_VALUE)
    );
    s4Layout.setVerticalGroup(
        s4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGap(0, 389, Short.MAX_VALUE)
    );

    jTabbedPane14.addTab(bundle.getString("AllCourse"), new javax.swing.ImageIcon(getClass().getResource("/com/niit/source/ui13.png")), s4); // NOI18N

    s5.setOpaque(false);
    s5.addComponentListener(new java.awt.event.ComponentAdapter() {
        public void componentShown(java.awt.event.ComponentEvent evt) {
            s5ComponentShown(evt);
        }
    });

    javax.swing.GroupLayout s5Layout = new javax.swing.GroupLayout(s5);
    s5.setLayout(s5Layout);
    s5Layout.setHorizontalGroup(
        s5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGap(0, 614, Short.MAX_VALUE)
    );
    s5Layout.setVerticalGroup(
        s5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGap(0, 389, Short.MAX_VALUE)
    );

    jTabbedPane14.addTab(bundle.getString("AllStudent"), new javax.swing.ImageIcon(getClass().getResource("/com/niit/source/ui14.png")), s5); // NOI18N

    student.addTab(bundle.getString("class"), new javax.swing.ImageIcon(getClass().getResource("/com/niit/source/ui2.png")), jTabbedPane14); // NOI18N

    exam.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
    exam.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
    exam.setName(""); // NOI18N
    exam.addComponentListener(new java.awt.event.ComponentAdapter() {
        public void componentShown(java.awt.event.ComponentEvent evt) {
            examComponentShown(evt);
        }
    });

    e1.setFocusCycleRoot(true);
    e1.setOpaque(false);
    e1.addComponentListener(new java.awt.event.ComponentAdapter() {
        public void componentShown(java.awt.event.ComponentEvent evt) {
            e1ComponentShown(evt);
        }
    });

    questionId.setFont(new java.awt.Font("微软雅黑", 0, 18)); // NOI18N
    questionId.setText("ID");

    questionIdText.setEditable(false);
    questionIdText.setFont(new java.awt.Font("微软雅黑", 0, 18)); // NOI18N
    questionIdText.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            questionIdTextActionPerformed(evt);
        }
    });

    questionCourse.setFont(new java.awt.Font("微软雅黑", 0, 18)); // NOI18N
    questionCourse.setText("Course");

    questionScore.setFont(new java.awt.Font("微软雅黑", 0, 18)); // NOI18N
    questionScore.setText("Score");

    questionScoreText.setFont(new java.awt.Font("微软雅黑", 0, 18)); // NOI18N
    questionScoreText.setText("5");

    questionCurrect.setFont(new java.awt.Font("微软雅黑", 0, 18)); // NOI18N
    questionCurrect.setText("Correct");

    choseCourse.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
    choseCourse.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "java", "android", "sql" }));
    choseCourse.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            choseCourseActionPerformed(evt);
        }
    });

    questionCurrectOp.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
    questionCurrectOp.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "A", "B", "C", "D" }));

    aText.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N

    A.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
    A.setText("A:");

    B.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
    B.setText("B:");

    bText.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N

    C.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
    C.setText("C:");

    cText.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N

    dText.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N

    D.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
    D.setText("D:");

    addQuestion.setText("Add");
    addQuestion.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            addQuestionActionPerformed(evt);
        }
    });

    question.setFont(new java.awt.Font("微软雅黑", 0, 18)); // NOI18N
    question.setText("question:");

    questionText.setText(" ");
    questionText.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            questionTextActionPerformed(evt);
        }
    });

    javax.swing.GroupLayout e1Layout = new javax.swing.GroupLayout(e1);
    e1.setLayout(e1Layout);
    e1Layout.setHorizontalGroup(
        e1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(e1Layout.createSequentialGroup()
            .addGroup(e1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addGroup(e1Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(e1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(e1Layout.createSequentialGroup()
                            .addComponent(B)
                            .addGap(32, 32, 32)
                            .addComponent(bText, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(e1Layout.createSequentialGroup()
                            .addComponent(A)
                            .addGap(32, 32, 32)
                            .addComponent(aText, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(e1Layout.createSequentialGroup()
                            .addComponent(D)
                            .addGap(32, 32, 32)
                            .addComponent(dText, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(e1Layout.createSequentialGroup()
                            .addComponent(C)
                            .addGap(32, 32, 32)
                            .addComponent(cText, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(3, 3, 3))
                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, e1Layout.createSequentialGroup()
                    .addGap(124, 124, 124)
                    .addGroup(e1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(questionScore, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(questionId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(e1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(questionIdText, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(questionScoreText, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(62, 62, 62)
                    .addGroup(e1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(questionCurrect)
                        .addComponent(questionCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(e1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(choseCourse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(questionCurrectOp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(21, 21, 21))
                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, e1Layout.createSequentialGroup()
                    .addGap(40, 40, 40)
                    .addComponent(question)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(questionText)))
            .addGap(70, 70, 70))
        .addGroup(e1Layout.createSequentialGroup()
            .addGap(271, 271, 271)
            .addComponent(addQuestion, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    e1Layout.setVerticalGroup(
        e1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(e1Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(e1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(questionId)
                .addComponent(questionIdText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(questionCourse)
                .addComponent(choseCourse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(e1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(questionScore)
                .addComponent(questionScoreText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(questionCurrect)
                .addComponent(questionCurrectOp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(18, 18, 18)
            .addGroup(e1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(questionText, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(question))
            .addGap(18, 18, 18)
            .addGroup(e1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(aText, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(A))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(e1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(bText, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(B))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(e1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(cText, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(C))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(e1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(dText, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(D))
            .addGap(18, 18, 18)
            .addComponent(addQuestion)
            .addContainerGap(40, Short.MAX_VALUE))
    );

    exam.addTab(bundle.getString("AddQuestion"), new javax.swing.ImageIcon(getClass().getResource("/com/niit/source/ui15.png")), e1); // NOI18N

    e2.setOpaque(false);
    e2.addComponentListener(new java.awt.event.ComponentAdapter() {
        public void componentShown(java.awt.event.ComponentEvent evt) {
            e2ComponentShown(evt);
        }
    });

    examId.setFont(new java.awt.Font("微软雅黑", 0, 18)); // NOI18N
    examId.setText("examID");

    examIdText.setEditable(false);
    examIdText.setFont(new java.awt.Font("微软雅黑", 0, 18)); // NOI18N
    examIdText.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            examIdTextActionPerformed(evt);
        }
    });

    examDate.setFont(new java.awt.Font("微软雅黑", 0, 18)); // NOI18N
    examDate.setText("Date");

    examId2.setFont(new java.awt.Font("微软雅黑", 0, 18)); // NOI18N
    examId2.setText("Class");

    examTime.setFont(new java.awt.Font("微软雅黑", 0, 18)); // NOI18N
    examTime.setText("Time(min)");

    examtimeText.setFont(new java.awt.Font("微软雅黑", 0, 18)); // NOI18N
    examtimeText.setText("90");

    examClass.setFont(new java.awt.Font("微软雅黑", 0, 18)); // NOI18N
    examClass.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            examClassActionPerformed(evt);
        }
    });

    examDescribe.setFont(new java.awt.Font("微软雅黑", 0, 18)); // NOI18N
    examDescribe.setText("Detail");

    addExam.setText("Add");
    addExam.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            addExamActionPerformed(evt);
        }
    });

    javax.swing.GroupLayout e2Layout = new javax.swing.GroupLayout(e2);
    e2.setLayout(e2Layout);
    e2Layout.setHorizontalGroup(
        e2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(e2Layout.createSequentialGroup()
            .addGroup(e2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(e2Layout.createSequentialGroup()
                    .addGap(48, 48, 48)
                    .addGroup(e2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(e2Layout.createSequentialGroup()
                            .addGroup(e2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(examTime)
                                .addComponent(examId))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(e2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(examIdText)
                                .addComponent(examtimeText, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE))
                            .addGap(117, 117, 117)
                            .addGroup(e2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(e2Layout.createSequentialGroup()
                                    .addComponent(examId2)
                                    .addGap(18, 18, 18)
                                    .addComponent(examClass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(examDate)))
                        .addGroup(e2Layout.createSequentialGroup()
                            .addComponent(examDescribe)
                            .addGap(18, 18, 18)
                            .addComponent(examDescribeText2, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(e2Layout.createSequentialGroup()
                    .addGap(241, 241, 241)
                    .addComponent(addExam, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addContainerGap(101, Short.MAX_VALUE))
    );
    e2Layout.setVerticalGroup(
        e2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(e2Layout.createSequentialGroup()
            .addGap(29, 29, 29)
            .addGroup(e2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(examId)
                .addComponent(examIdText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(examDate))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(e2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(examTime)
                .addGroup(e2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(examClass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(examtimeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(examId2)))
            .addGap(18, 18, 18)
            .addGroup(e2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(examDescribe)
                .addComponent(examDescribeText2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 223, Short.MAX_VALUE)
            .addComponent(addExam))
    );

    exam.addTab(bundle.getString("AddExam"), new javax.swing.ImageIcon(getClass().getResource("/com/niit/source/ui16.png")), e2); // NOI18N

    e3.setOpaque(false);
    e3.addComponentListener(new java.awt.event.ComponentAdapter() {
        public void componentShown(java.awt.event.ComponentEvent evt) {
            e3ComponentShown(evt);
        }
    });

    javax.swing.GroupLayout e3Layout = new javax.swing.GroupLayout(e3);
    e3.setLayout(e3Layout);
    e3Layout.setHorizontalGroup(
        e3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGap(0, 614, Short.MAX_VALUE)
    );
    e3Layout.setVerticalGroup(
        e3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGap(0, 388, Short.MAX_VALUE)
    );

    exam.addTab(bundle.getString("AllQuestion"), new javax.swing.ImageIcon(getClass().getResource("/com/niit/source/ui17.png")), e3); // NOI18N

    e4.setOpaque(false);
    e4.addComponentListener(new java.awt.event.ComponentAdapter() {
        public void componentShown(java.awt.event.ComponentEvent evt) {
            e4ComponentShown(evt);
        }
    });

    javax.swing.GroupLayout e4Layout = new javax.swing.GroupLayout(e4);
    e4.setLayout(e4Layout);
    e4Layout.setHorizontalGroup(
        e4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGap(0, 614, Short.MAX_VALUE)
    );
    e4Layout.setVerticalGroup(
        e4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGap(0, 388, Short.MAX_VALUE)
    );

    exam.addTab(bundle.getString("AllExam"), new javax.swing.ImageIcon(getClass().getResource("/com/niit/source/ui18.png")), e4); // NOI18N

    e5.setFocusCycleRoot(true);
    e5.setOpaque(false);
    e5.addComponentListener(new java.awt.event.ComponentAdapter() {
        public void componentShown(java.awt.event.ComponentEvent evt) {
            e5ComponentShown(evt);
        }
    });

    questionId1.setFont(new java.awt.Font("微软雅黑", 0, 18)); // NOI18N
    questionId1.setText("ID");

    questionCourse1.setFont(new java.awt.Font("微软雅黑", 0, 18)); // NOI18N
    questionCourse1.setText("Course");

    questionScore1.setFont(new java.awt.Font("微软雅黑", 0, 18)); // NOI18N
    questionScore1.setText("Score");

    questionCurrect1.setFont(new java.awt.Font("微软雅黑", 0, 18)); // NOI18N
    questionCurrect1.setText("Correct");

    A1.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
    A1.setText("A:");

    B1.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
    B1.setText("B:");

    C1.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
    C1.setText("C:");

    D1.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
    D1.setText("D:");

    question1.setFont(new java.awt.Font("微软雅黑", 0, 18)); // NOI18N
    question1.setText("question:");

    jTextField1.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
    jTextField1.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jTextField1ActionPerformed(evt);
        }
    });

    jTextField2.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
    jTextField2.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jTextField2ActionPerformed(evt);
        }
    });

    jTextField3.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
    jTextField3.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jTextField3ActionPerformed(evt);
        }
    });

    jTextField4.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
    jTextField4.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jTextField4ActionPerformed(evt);
        }
    });

    jTextField5.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
    jTextField5.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jTextField5ActionPerformed(evt);
        }
    });

    jTextField6.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
    jTextField6.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jTextField6ActionPerformed(evt);
        }
    });

    jComboBox4.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
    jComboBox4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "A", "B", "C", "D" }));
    jComboBox4.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jComboBox4ActionPerformed(evt);
        }
    });

    jComboBox3.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
    jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "java", "android", "sql" }));
    jComboBox3.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jComboBox3ActionPerformed(evt);
        }
    });

    jComboBox2.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
    jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "chose" }));
    jComboBox2.addItemListener(new java.awt.event.ItemListener() {
        public void itemStateChanged(java.awt.event.ItemEvent evt) {
            jComboBox2ItemStateChanged(evt);
        }
    });
    jComboBox2.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jComboBox2ActionPerformed(evt);
        }
    });

    jButton1.setFont(new java.awt.Font("幼圆", 1, 14)); // NOI18N
    jButton1.setText("Delete");
    jButton1.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton1ActionPerformed(evt);
        }
    });

    jButton2.setFont(new java.awt.Font("幼圆", 1, 14)); // NOI18N
    jButton2.setText("Modify");
    jButton2.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton2ActionPerformed(evt);
        }
    });

    javax.swing.GroupLayout e5Layout = new javax.swing.GroupLayout(e5);
    e5.setLayout(e5Layout);
    e5Layout.setHorizontalGroup(
        e5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(e5Layout.createSequentialGroup()
            .addGap(40, 40, 40)
            .addGroup(e5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, e5Layout.createSequentialGroup()
                    .addGroup(e5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(e5Layout.createSequentialGroup()
                            .addComponent(A1)
                            .addGap(18, 18, 18)
                            .addComponent(jTextField3))
                        .addGroup(e5Layout.createSequentialGroup()
                            .addComponent(B1)
                            .addGap(18, 18, 18)
                            .addComponent(jTextField4))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, e5Layout.createSequentialGroup()
                            .addGap(0, 40, Short.MAX_VALUE)
                            .addGroup(e5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(e5Layout.createSequentialGroup()
                                    .addComponent(questionScore1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextField1))
                                .addGroup(e5Layout.createSequentialGroup()
                                    .addComponent(questionId1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(113, 113, 113)
                            .addGroup(e5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(questionCourse1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(questionCurrect1))
                            .addGap(33, 33, 33)
                            .addGroup(e5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(36, 36, 36))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, e5Layout.createSequentialGroup()
                            .addGroup(e5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(C1)
                                .addComponent(D1))
                            .addGap(18, 18, 18)
                            .addGroup(e5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextField6)
                                .addComponent(jTextField5))))
                    .addGap(51, 51, 51))
                .addGroup(e5Layout.createSequentialGroup()
                    .addComponent(question1)
                    .addGap(18, 18, 18)
                    .addComponent(jTextField2)
                    .addGap(56, 56, 56))))
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, e5Layout.createSequentialGroup()
            .addGap(129, 129, 129)
            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(148, 148, 148))
    );
    e5Layout.setVerticalGroup(
        e5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(e5Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(e5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(e5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(questionId1)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, e5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(questionCourse1)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGap(23, 23, 23)
            .addGroup(e5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(questionScore1)
                .addComponent(questionCurrect1)
                .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(18, 18, 18)
            .addGroup(e5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(question1)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(18, 18, Short.MAX_VALUE)
            .addGroup(e5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(A1)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(e5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(B1)
                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(e5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(C1)
                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(e5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(D1)
                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(30, 30, 30)
            .addGroup(e5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(33, 33, 33))
    );

    exam.addTab("Modify", new javax.swing.ImageIcon(getClass().getResource("/com/niit/source/ui15.png")), e5); // NOI18N

    student.addTab(bundle.getString("Exam"), new javax.swing.ImageIcon(getClass().getResource("/com/niit/source/ui6.png")), exam); // NOI18N

    queryExam.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
    queryExam.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
    queryExam.addComponentListener(new java.awt.event.ComponentAdapter() {
        public void componentShown(java.awt.event.ComponentEvent evt) {
            queryExamComponentShown(evt);
        }
    });

    q2.setOpaque(false);
    q2.addComponentListener(new java.awt.event.ComponentAdapter() {
        public void componentShown(java.awt.event.ComponentEvent evt) {
            q2ComponentShown(evt);
        }
    });

    jComboBox1.setFont(new java.awt.Font("幼圆", 0, 14)); // NOI18N
    jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Order By", "StudentID", "ExamID", "Score" }));
    jComboBox1.addItemListener(new java.awt.event.ItemListener() {
        public void itemStateChanged(java.awt.event.ItemEvent evt) {
            jComboBox1ItemStateChanged(evt);
        }
    });

    javax.swing.GroupLayout q2Layout = new javax.swing.GroupLayout(q2);
    q2.setLayout(q2Layout);
    q2Layout.setHorizontalGroup(
        q2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, q2Layout.createSequentialGroup()
            .addContainerGap(497, Short.MAX_VALUE)
            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(26, 26, 26))
    );
    q2Layout.setVerticalGroup(
        q2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(q2Layout.createSequentialGroup()
            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(0, 345, Short.MAX_VALUE))
    );

    queryExam.addTab(bundle.getString("Report"), new javax.swing.ImageIcon(getClass().getResource("/com/niit/source/ui19.png")), q2); // NOI18N

    q3.setOpaque(false);
    q3.addComponentListener(new java.awt.event.ComponentAdapter() {
        public void componentShown(java.awt.event.ComponentEvent evt) {
            q3ComponentShown(evt);
        }
    });

    stuinfo.setOpaque(false);

    infoname.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
    infoname.setText("000");

    infoname1.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
    infoname1.setText("ID:");

    infoid.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
    infoid.setText("000");

    infoname3.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
    infoname3.setText("Name:");

    infoname4.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
    infoname4.setText("Class:");

    infoname5.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
    infoname5.setText("Gender:");

    infogender.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
    infogender.setText("000");

    infoclass.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
    infoclass.setText("000");

    javax.swing.GroupLayout stuinfoLayout = new javax.swing.GroupLayout(stuinfo);
    stuinfo.setLayout(stuinfoLayout);
    stuinfoLayout.setHorizontalGroup(
        stuinfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(stuinfoLayout.createSequentialGroup()
            .addGap(40, 40, 40)
            .addGroup(stuinfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addComponent(infoname4, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(infoname1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(18, 18, 18)
            .addGroup(stuinfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addComponent(infoclass, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                .addComponent(infoid, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 118, Short.MAX_VALUE)
            .addGroup(stuinfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(infoname3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(infoname5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(18, 18, 18)
            .addGroup(stuinfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(infoname, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(infogender, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(38, 38, 38))
    );
    stuinfoLayout.setVerticalGroup(
        stuinfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(stuinfoLayout.createSequentialGroup()
            .addGap(21, 21, 21)
            .addGroup(stuinfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(infoname1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(infoid, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(infoname3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(infoname, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(stuinfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(infoname4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(infoname5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(infogender, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(infoclass, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addContainerGap(234, Short.MAX_VALUE))
    );

    save.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
    save.setText("Save");
    save.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            saveActionPerformed(evt);
        }
    });

    infostudent.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
    infostudent.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Chose" }));
    infostudent.addItemListener(new java.awt.event.ItemListener() {
        public void itemStateChanged(java.awt.event.ItemEvent evt) {
            infostudentItemStateChanged(evt);
        }
    });

    javax.swing.GroupLayout q3Layout = new javax.swing.GroupLayout(q3);
    q3.setLayout(q3Layout);
    q3Layout.setHorizontalGroup(
        q3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, q3Layout.createSequentialGroup()
            .addGap(100, 100, 100)
            .addComponent(infostudent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(save)
            .addGap(161, 161, 161))
        .addGroup(q3Layout.createSequentialGroup()
            .addGap(55, 55, 55)
            .addComponent(stuinfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(70, Short.MAX_VALUE))
    );
    q3Layout.setVerticalGroup(
        q3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(q3Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(stuinfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(q3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(infostudent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(save))
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    queryExam.addTab(bundle.getString("StudentInfo"), new javax.swing.ImageIcon(getClass().getResource("/com/niit/source/ui20.png")), q3); // NOI18N

    student.addTab(bundle.getString("Query"), new javax.swing.ImageIcon(getClass().getResource("/com/niit/source/ui7.png")), queryExam); // NOI18N

    jPanel1.addComponentListener(new java.awt.event.ComponentAdapter() {
        public void componentShown(java.awt.event.ComponentEvent evt) {
            jPanel1ComponentShown(evt);
        }
    });

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGap(0, 619, Short.MAX_VALUE)
    );
    jPanel1Layout.setVerticalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGap(0, 438, Short.MAX_VALUE)
    );

    student.addTab(bundle.getString("Exit"), new javax.swing.ImageIcon(getClass().getResource("/com/niit/source/ui5.png")), jPanel1); // NOI18N

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addComponent(student, javax.swing.GroupLayout.PREFERRED_SIZE, 817, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(0, 0, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(student)
    );

    student.getAccessibleContext().setAccessibleDescription("");

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addQuestionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addQuestionActionPerformed
        new addQuestion(questionIdText.getText(), questionText.getText(), aText.getText(), bText.getText(), cText.getText(), dText.getText(), questionCurrectOp.getSelectedItem().toString(), questionScoreText.getText(), choseCourse.getSelectedItem().toString());
    }//GEN-LAST:event_addQuestionActionPerformed

    private void addExamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addExamActionPerformed
        StringBuffer sb = new StringBuffer();
        String[] qs = t.getSelect();
        for (int i = 0; i < t.getNum(); i++) {
            if (i == 0) {
                sb.append(qs[i]);
            } else {
                sb.append(',');
                sb.append(qs[i]);
            }
        }
        new addExam(examIdText.getText(), examDescribeText2.getText(), sb.toString(), examClass.getSelectedItem().toString(), examtimeText.getText(), examStartDate.getDate());
    }//GEN-LAST:event_addExamActionPerformed

    private void choseCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choseCourseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_choseCourseActionPerformed

    private void questionIdTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_questionIdTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_questionIdTextActionPerformed

    private void questionTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_questionTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_questionTextActionPerformed

    private void examIdTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_examIdTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_examIdTextActionPerformed

    private void e1ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_e1ComponentShown
        try {
            al = new ArrayList();
            rs = d.stmt.executeQuery("select name from course");
            int i = 0;
            while (rs.next()) {
                al.add(rs.getString(1).trim());
            }
            choseCourse.setModel(new javax.swing.DefaultComboBoxModel(al.toArray()));
            rs = d.stmt.executeQuery("select max(id) from question");
            if (rs.next()) {
                questionIdText.setText(String.valueOf(Integer.valueOf(rs.getString(1).trim()) + 1));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.toString(), "！！！", 0);
        }
    }//GEN-LAST:event_e1ComponentShown

    private void e2ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_e2ComponentShown

        int i = e2.getComponentCount();
        Component[] sss = e2.getComponents();
        while (i-- > 0) {
            if (sss[i].getClass().toString().equals("class javax.swing.JScrollPane")) {
                e2.remove(e2.getComponents()[i]);
                break;
            }
        }

        examStartDate.setBounds(390, 30, 110, 60);
        examStartDate.setBackground(null);
        examStartDate.setOpaque(false);
        examStartDate.setBorder(null);
        e2.add(examStartDate);

        try {
            rs = d.stmt.executeQuery("select max(ID) from exam ");
            if (rs.next()) {
                examIdText.setText(String.valueOf(Integer.valueOf(rs.getString(1).trim()) + 1));
            }
            examClass.removeAllItems();
            rs = d.stmt.executeQuery("select id from class");
            while (rs.next()) {
                examClass.addItem(rs.getString(1));
            }
            t = new MyTableModel();
            JTable table = new JTable(t);
            JScrollPane scroll = new JScrollPane(table);
            scroll.setBounds(30, 190, 600, 160);
            e2.add(scroll);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.toString(), "！！！", 0);
        }
    }//GEN-LAST:event_e2ComponentShown

    private void q2ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_q2ComponentShown
        int i = q2.getComponentCount();
        Component[] sss = q2.getComponents();
        while (i-- > 0) {
            if (sss[i].getClass().toString().equals("class javax.swing.JScrollPane")) {
                q2.remove(q2.getComponents()[i]);
                break;
            }
        }
        table2 = new JTable();

        JScrollPane sp1 = new JScrollPane(table2);
        model1 = new DefaultTableModel();
        model1.addColumn("ID");
        model1.addColumn("Name");
        model1.addColumn("ExamID");
        model1.addColumn("Score");
        model1.addColumn("Date");
        try {
            rs = d.stmt.executeQuery("select s.ID,s.NAME,d.EXAM_ID,d.SCORE,d.EXAMDATE from STUDENT_DETAILS d inner join STUDENT s on d.STUDENT_ID=s.ID order by s.id");
            model1.setRowCount(0);
            while (rs.next()) {
                v = new Vector();
                v.add(rs.getString(1));
                v.add(rs.getString(2));
                v.add(rs.getString(3));
                v.add(rs.getString(4));
                v.add(rs.getString(5));
                model1.addRow(v);
            }
            table2.setModel(model1);
            sp1.setBounds(0, 30, 640, 340);

            //sp1.setBounds(0, 0, 640, 390);
            q2.add(sp1);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.toString(), "！！！", 0);
        }
    }//GEN-LAST:event_q2ComponentShown

    private void examComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_examComponentShown
        try {
            al = new ArrayList();
            rs = d.stmt.executeQuery("select name from course");
            int i = 0;
            while (rs.next()) {
                al.add(rs.getString(1).trim());
            }
            choseCourse.setModel(new javax.swing.DefaultComboBoxModel(al.toArray()));
            rs = d.stmt.executeQuery("select max(id) from question");
            if (rs.next()) {
                questionIdText.setText(String.valueOf(Integer.valueOf(rs.getString(1).trim()) + 1));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.toString(), "！！！", 0);
        }


    }//GEN-LAST:event_examComponentShown

    private void queryExamComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_queryExamComponentShown
        int i = q2.getComponentCount();
        Component[] sss = q2.getComponents();
        while (i-- > 0) {
            if (sss[i].getClass().toString().equals("class javax.swing.JScrollPane")) {
                q2.remove(q2.getComponents()[i]);
                break;
            }
        }

        table2 = new JTable();

        JScrollPane sp1 = new JScrollPane(table2);
        model1 = new DefaultTableModel();
        model1.addColumn("ID");
        model1.addColumn("Name");
        model1.addColumn("ExamID");
        model1.addColumn("Score");
        model1.addColumn("Date");
        try {
            rs = d.stmt.executeQuery("select s.ID,s.NAME,d.EXAM_ID,d.SCORE,d.EXAMDATE from STUDENT_DETAILS d inner join STUDENT s on d.STUDENT_ID=s.ID order by s.id");
            model1.setRowCount(0);
            while (rs.next()) {
                v = new Vector();
                v.add(rs.getString(1));
                v.add(rs.getString(2));
                v.add(rs.getString(3));
                v.add(rs.getString(4));
                v.add(rs.getString(5));
                model1.addRow(v);
            }
            table2.setModel(model1);
            sp1.setBounds(0, 30, 640, 340);
            q2.add(sp1);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.toString(), "！！！", 0);
        }
    }//GEN-LAST:event_queryExamComponentShown

    private void examClassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_examClassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_examClassActionPerformed

    private void e3ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_e3ComponentShown
        e3.removeAll();
        table1 = new JTable();
        JScrollPane sp = new JScrollPane(table1);
        model = new DefaultTableModel();
        model.addColumn("ID");
        model.addColumn("Question");
        model.addColumn("A");
        model.addColumn("B");
        model.addColumn("C");
        model.addColumn("D");
        model.addColumn("Correct");
        model.addColumn("Value");
        model.addColumn("Course");

        try {
            rs = d.stmt.executeQuery("select * from Question");
            model.setRowCount(0);
            while (rs.next()) {
                v = new Vector();
                v.add(rs.getString(1));
                v.add(rs.getString(2));
                v.add(rs.getString(3));
                v.add(rs.getString(4));
                v.add(rs.getString(5));
                v.add(rs.getString(6));
                v.add(rs.getString(7));
                v.add(rs.getString(8));
                v.add(rs.getString(9));
                model.addRow(v);
                table1.setModel(model);
                sp.setBounds(0, 0, 640, 390);
                e3.add(sp);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.toString(), "！！！", 0);
        }
    }//GEN-LAST:event_e3ComponentShown

    private void e4ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_e4ComponentShown
        e4.removeAll();
        table1 = new JTable();
        JScrollPane sp = new JScrollPane(table1);
        model = new DefaultTableModel();
        model.addColumn("ID");
        model.addColumn("Describe");
        model.addColumn("Have Question");
        model.addColumn("Class");
        model.addColumn("Time");
        model.addColumn("Date");

        try {
            rs = d.stmt.executeQuery("select * from Exam");
            model.setRowCount(0);
            while (rs.next()) {
                v = new Vector();
                v.add(rs.getString(1));
                v.add(rs.getString(2));
                v.add(rs.getString(3));
                v.add(rs.getString(4));
                v.add(rs.getString(5));
                v.add(rs.getString(6));
                model.addRow(v);
                table1.setModel(model);
                sp.setBounds(0, 0, 640, 390);
                e4.add(sp);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.toString(), "！！！", 0);
        }
    }//GEN-LAST:event_e4ComponentShown

    private void jTabbedPane14ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jTabbedPane14ComponentShown
        classStartDate.setBounds(298, 167, 110, 60);
        classStartDate.setBackground(null);
        classStartDate.setBorder(null);
        classEndDate.setBounds(298, 217, 110, 60);
        classEndDate.setBackground(null);
        classEndDate.setBorder(null);
        classEndDate.setOpaque(false);
        studentClass.add(classStartDate);
        studentClass.add(classEndDate);

        try {
            rs = d.stmt.executeQuery("select max(id) from class");
            if (rs.next()) {
                classIdText.setText(String.valueOf(Integer.valueOf(rs.getString(1).trim()) + 1));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.toString(), "！！！", 0);
        }
    }//GEN-LAST:event_jTabbedPane14ComponentShown

    private void s5ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_s5ComponentShown

        table1 = new JTable();
        JScrollPane sp = new JScrollPane(table1);
        model = new DefaultTableModel();
        model.addColumn("ID");
        model.addColumn("Name");
        model.addColumn("Gender");
        model.addColumn("Password");
        model.addColumn("Class");

        try {
            rs = d.stmt.executeQuery("select * from student");
            model.setRowCount(0);
            while (rs.next()) {
                v = new Vector();
                v.add(rs.getString(1));
                v.add(rs.getString(2));
                v.add(rs.getString(3));
                v.add(rs.getString(4));
                v.add(rs.getString(5));
                model.addRow(v);
                table1.setModel(model);
                sp.setBounds(0, 0, 640, 390);
                s5.add(sp);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.toString(), "！！！", 0);
        }
    }//GEN-LAST:event_s5ComponentShown

    private void s4ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_s4ComponentShown
        s4.removeAll();
        table1 = new JTable();
        JScrollPane sp = new JScrollPane(table1);
        model = new DefaultTableModel();
        model.addColumn("ID");
        model.addColumn("Name");
        model.addColumn("Describe");

        try {
            rs = d.stmt.executeQuery("select * from Course");
            model.setRowCount(0);
            while (rs.next()) {
                v = new Vector();
                v.add(rs.getString(1));
                v.add(rs.getString(2));
                v.add(rs.getString(3));
                model.addRow(v);
                table1.setModel(model);
                sp.setBounds(0, 0, 640, 390);
                s4.add(sp);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.toString(), "！！！", 0);
        }
    }//GEN-LAST:event_s4ComponentShown

    private void s3ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_s3ComponentShown
        s3.removeAll();
        table1 = new JTable();
        JScrollPane sp = new JScrollPane(table1);
        model = new DefaultTableModel();
        model.addColumn("ID");
        model.addColumn("Name");
        model.addColumn("Start Date");
        model.addColumn("End Date");
        try {
            rs = d.stmt.executeQuery("select * from Class");
            model.setRowCount(0);
            while (rs.next()) {
                v = new Vector();
                v.add(rs.getString(1));
                v.add(rs.getString(2));
                v.add(rs.getString(3));
                v.add(rs.getString(4));
                model.addRow(v);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.toString(), "！！！", 0);
        }
        table1.setModel(model);
        table1.setOpaque(false);
        sp.setOpaque(false);
        sp.setBounds(0, 0, 640, 390);

        s3.add(sp);
    }//GEN-LAST:event_s3ComponentShown

    private void studentCourseComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_studentCourseComponentShown
        try {
            rs = d.stmt.executeQuery("select max(id) from course");
            if (rs.next()) {
                courseIdText.setText(String.valueOf(Integer.valueOf(rs.getString(1).trim()) + 1));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.toString(), "！！！", 0);
        }
    }//GEN-LAST:event_studentCourseComponentShown

    private void addCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCourseActionPerformed
        new addCourse(courseIdText.getText(), courseNameText.getText().trim(), courseDetailText.getText().trim());
    }//GEN-LAST:event_addCourseActionPerformed

    private void studentClassComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_studentClassComponentShown
        try {
            rs = d.stmt.executeQuery("select max(id) from class");
            if (rs.next()) {
                classIdText.setText(String.valueOf(Integer.valueOf(rs.getString(1).trim()) + 1));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.toString(), "！！！", 0);
        }
    }//GEN-LAST:event_studentClassComponentShown

    private void addClassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addClassActionPerformed
        new addClass(classIdText.getText().trim(), classNameText.getText().trim(), classStartDate.getDate(), classEndDate.getDate());        // TODO add your handling code here:
    }//GEN-LAST:event_addClassActionPerformed

    private void classIdTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_classIdTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_classIdTextActionPerformed

    private void q3ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_q3ComponentShown


    }//GEN-LAST:event_q3ComponentShown

    private void infostudentItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_infostudentItemStateChanged

        if (infostudent.getSelectedIndex() != 0) {
            try {
                rs = d.stmt.executeQuery("select * from  student where id=" + infostudent.getSelectedItem().toString());
                int i = 1;
                if (rs.next()) {
                    infoid.setText(rs.getString(1));
                    infoname.setText(rs.getString(2));
                    infogender.setText(rs.getString(3));
                    infoclass.setText(rs.getString(5));
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(rootPane, ex.toString(), "！！！", 0);
            }

            stuinfo.remove(stuinfo.getComponentAt(270, 150));

            table2 = new JTable();
            JScrollPane sp1 = new JScrollPane(table2);
            sp1.setBounds(40, 100, 408, 210);
            model1 = new DefaultTableModel();
            model1.addColumn("ExamID");
            model1.addColumn("Describe");
            model1.addColumn("Score");
            model1.addColumn("Date");
            try {
                rs = d.stmt.executeQuery("select s.EXAM_ID,e.DESCRIBE,s.SCORE,s.EXAMDATE from  STUDENT_DETAILS s join EXAM e on s.EXAM_ID=e.ID where s.STUDENT_ID=" + infostudent.getSelectedItem().toString());
                model1.setRowCount(0);
                while (rs.next()) {
                    v = new Vector();
                    v.add(rs.getString(1));
                    v.add(rs.getString(2));
                    v.add(rs.getString(3));
                    v.add(rs.getString(4));
                    model1.addRow(v);
                    table2.setModel(model1);
                    stuinfo.add(sp1);
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(rootPane, ex.toString(), "！！！", 0);
            }
        }
    }//GEN-LAST:event_infostudentItemStateChanged

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        JFileChooser jfc = new JFileChooser();
        jfc.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        jfc.showDialog(new JLabel(), "选择");
        File file = jfc.getSelectedFile();
        if (file.isDirectory()) {
            path = file.getAbsolutePath() + "\\" + infoname.getText() + "_Info.png";
        } else if (file.isFile()) {
            path = file.getAbsolutePath();
        }

        File f = new File(path);
        try {
            if (!f.exists()) {
                f.createNewFile();
            }
        } catch (IOException ex) {
        }
        exportOtherShapesImage(f, this.stuinfo);
    }//GEN-LAST:event_saveActionPerformed

    private void jPanel1ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanel1ComponentShown
        System.exit(0);
    }//GEN-LAST:event_jPanel1ComponentShown

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
        int i = q2.getComponentCount();
        Component[] sss = q2.getComponents();
        while (i-- > 0) {
            if (sss[i].getClass().toString().equals("class javax.swing.JScrollPane")) {
                q2.remove(q2.getComponents()[i]);
                break;
            }
        }

        table2 = new JTable();
        JScrollPane sp1 = new JScrollPane(table2);
        model1 = new DefaultTableModel();
        model1.addColumn("ID");
        model1.addColumn("Name");
        model1.addColumn("ExamID");
        model1.addColumn("Score");
        model1.addColumn("Date");
        String sql = null;
        try {
            switch (jComboBox1.getSelectedIndex()) {
                case 0:
                    sql = "s.name";
                    break;
                case 1:
                    sql = "s.id";
                    break;
                case 2:
                    sql = "d.exam_id";
                    break;
                case 3:
                    sql = "d.score desc";
                    break;
            }
            rs = d.stmt.executeQuery("select s.ID,s.NAME,d.EXAM_ID,d.SCORE,d.EXAMDATE from STUDENT_DETAILS d inner join STUDENT s on d.STUDENT_ID=s.ID order by " + sql);
            model1.setRowCount(0);
            while (rs.next()) {
                v = new Vector();
                v.add(rs.getString(1));
                v.add(rs.getString(2));
                v.add(rs.getString(3));
                v.add(rs.getString(4));
                v.add(rs.getString(5));
                model1.addRow(v);
            }
            table2.setModel(model1);
            sp1.setBounds(0, 30, 640, 340);

            //sp1.setBounds(0, 0, 640, 390);
            q2.add(sp1);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.toString(), "！！！", 0);
        }


    }//GEN-LAST:event_jComboBox1ItemStateChanged

    private void courseIdTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_courseIdTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_courseIdTextActionPerformed

    private void e5ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_e5ComponentShown
        
        jComboBox2.setSelectedItem("chose");
        int j = jComboBox2.getItemCount();
        for(int i = 1 ;i < j;i++){
            jComboBox2.removeItemAt(1);
            System.out.println("dgfdhfhg");
        }

        try {
            String sql = "select * from question";
            rs = d.stmt.executeQuery(sql);
            while (rs.next()) {
                jComboBox2.addItem(rs.getString(1).trim());
            }
        } catch (SQLException ex) {

        }

    }//GEN-LAST:event_e5ComponentShown

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jComboBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox4ActionPerformed

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void jComboBox2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox2ItemStateChanged
        
        if(jComboBox2.getSelectedItem().equals("chose"))return;
        
        try {
            String sql = "select * from question where id = " + jComboBox2.getSelectedItem().toString().trim();
            rs = d.stmt.executeQuery(sql);
            rs.next();
            jTextField1.setText(rs.getString(8));
            jTextField2.setText(rs.getString(2));
            jTextField3.setText(rs.getString(3));
            jTextField4.setText(rs.getString(4));
            jTextField5.setText(rs.getString(5));
            jTextField6.setText(rs.getString(6));

            String course = rs.getString(9);
            for (int i = 0; i < jComboBox3.getItemCount(); i++) {
                if (course.trim().equalsIgnoreCase(jComboBox3.getItemAt(i).toString().trim())) {
                    jComboBox3.setSelectedIndex(i);
                }
            }

            String correct = rs.getString(7);
            for (int i = 0; i < jComboBox4.getItemCount(); i++) {
                if (correct.trim().equalsIgnoreCase(jComboBox4.getItemAt(i).toString().trim())) {
                    jComboBox4.setSelectedIndex(i);
                }
            }

            // TODO add your handling code here:
        } catch (SQLException ex) {
            Logger.getLogger(Manage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jComboBox2ItemStateChanged

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        String Course = "update QUESTION set COURSE = '" + jComboBox3.getSelectedItem() + "' where ID = " + jComboBox2.getSelectedItem();
        try {
            d.stmt.executeUpdate(Course);
            String Score = "update QUESTION set VALUE = '" + jTextField1.getText() + "' where ID = " + jComboBox2.getSelectedItem();
            d.stmt.executeUpdate(Score);
            String Correct = "update QUESTION set CORRECT = '" + jComboBox4.getSelectedItem() + "' where ID = " + jComboBox2.getSelectedItem();
            d.stmt.executeUpdate(Correct);
            String qst = "update QUESTION set QUESTION = '" + jTextField2.getText() + "' where ID = " + jComboBox2.getSelectedItem();
            d.stmt.executeUpdate(qst);
            String a = "update QUESTION set A = '" + jTextField3.getText() + "' where ID = " + jComboBox2.getSelectedItem();
            d.stmt.executeUpdate(a);
            String b = "update QUESTION set B = '" + jTextField4.getText() + "' where ID = " + jComboBox2.getSelectedItem();
            d.stmt.executeUpdate(b);
            String c = "update QUESTION set C = '" + jTextField5.getText() + "' where ID = " + jComboBox2.getSelectedItem();
            d.stmt.executeUpdate(c);
            String d1 = "update QUESTION set D = '" + jTextField6.getText() + "' where ID = " + jComboBox2.getSelectedItem();
            d.stmt.executeUpdate(d1);
            JOptionPane.showMessageDialog(null, "succeed!", "!!!", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            Logger.getLogger(Manage.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
        String sql = "delete from QUESTION where ID = " + jComboBox2.getSelectedItem();
        try {
            d.stmt.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Succeed!", "!!!", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            Logger.getLogger(Manage.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        jComboBox2.setSelectedItem("chose");
        int j = jComboBox2.getItemCount();
        for(int i = 1 ;i < j;i++){
            jComboBox2.removeItemAt(1);
            System.out.println("dgfdhfhg");
        }

        try {
            String sql1 = "select * from question";
            rs = d.stmt.executeQuery(sql1);
            while (rs.next()) {
                jComboBox2.addItem(rs.getString(1).trim());
            }
        } catch (SQLException ex) {

        }
    }//GEN-LAST:event_jButton1ActionPerformed

    public boolean exportOtherShapesImage(File f, JPanel panel) {
        Dimension imageSize = panel.getSize();
        BufferedImage image = new BufferedImage(imageSize.width,
                imageSize.height, BufferedImage.TYPE_4BYTE_ABGR);
        Graphics2D g = image.createGraphics();
        panel.paint(g);
        g.dispose();
        try {
            ImageIO.write(image, "png", f);
            JOptionPane.showMessageDialog(null, "succeed!", path, 1);
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        new Manage(3).setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel A;
    private javax.swing.JLabel A1;
    private javax.swing.JLabel B;
    private javax.swing.JLabel B1;
    private javax.swing.JLabel C;
    private javax.swing.JLabel C1;
    private javax.swing.JLabel ClassID;
    private javax.swing.JLabel D;
    private javax.swing.JLabel D1;
    private javax.swing.JTextField aText;
    private javax.swing.JButton addClass;
    private javax.swing.JButton addCourse;
    private javax.swing.JButton addExam;
    private javax.swing.JButton addQuestion;
    private javax.swing.JTextField bText;
    private javax.swing.JTextField cText;
    private javax.swing.JComboBox choseCourse;
    private javax.swing.JLabel claseName;
    private javax.swing.JTextField classIdText;
    private javax.swing.JTextField classNameText;
    private javax.swing.JLabel courseDetail;
    private javax.swing.JTextField courseDetailText;
    private javax.swing.JLabel courseId;
    private javax.swing.JTextField courseIdText;
    private javax.swing.JLabel courseName;
    private javax.swing.JTextField courseNameText;
    private javax.swing.JTextField dText;
    private javax.swing.JPanel e1;
    private javax.swing.JPanel e2;
    private javax.swing.JPanel e3;
    private javax.swing.JPanel e4;
    private javax.swing.JPanel e5;
    private javax.swing.JLabel endDate;
    public javax.swing.JTabbedPane exam;
    private javax.swing.JComboBox examClass;
    private javax.swing.JLabel examDate;
    private javax.swing.JLabel examDescribe;
    private javax.swing.JTextField examDescribeText2;
    private javax.swing.JLabel examId;
    private javax.swing.JLabel examId2;
    private javax.swing.JTextField examIdText;
    private javax.swing.JLabel examTime;
    private javax.swing.JTextField examtimeText;
    private javax.swing.JLabel infoclass;
    private javax.swing.JLabel infogender;
    private javax.swing.JLabel infoid;
    private javax.swing.JLabel infoname;
    private javax.swing.JLabel infoname1;
    private javax.swing.JLabel infoname3;
    private javax.swing.JLabel infoname4;
    private javax.swing.JLabel infoname5;
    private javax.swing.JComboBox infostudent;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JComboBox jComboBox4;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JTabbedPane jTabbedPane14;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JPanel q2;
    private javax.swing.JPanel q3;
    public javax.swing.JTabbedPane queryExam;
    private javax.swing.JLabel question;
    private javax.swing.JLabel question1;
    private javax.swing.JLabel questionCourse;
    private javax.swing.JLabel questionCourse1;
    private javax.swing.JLabel questionCurrect;
    private javax.swing.JLabel questionCurrect1;
    private javax.swing.JComboBox questionCurrectOp;
    private javax.swing.JLabel questionId;
    private javax.swing.JLabel questionId1;
    private javax.swing.JTextField questionIdText;
    private javax.swing.JLabel questionScore;
    private javax.swing.JLabel questionScore1;
    private javax.swing.JTextField questionScoreText;
    private javax.swing.JTextField questionText;
    private javax.swing.JPanel s3;
    private javax.swing.JPanel s4;
    private javax.swing.JPanel s5;
    private javax.swing.JButton save;
    private javax.swing.JLabel startDate;
    public javax.swing.JTabbedPane student;
    private javax.swing.JPanel studentClass;
    private javax.swing.JPanel studentCourse;
    private javax.swing.JPanel stuinfo;
    // End of variables declaration//GEN-END:variables
}
