package com.niit;

import com.niit.sql.connectDB;
import com.niit.sql.getPaper;
import java.awt.Graphics;
import java.awt.Image;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.Vector;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Student extends javax.swing.JFrame implements Runnable {

    DefaultTableModel model;
    JTable table;
    connectDB db;
    ResultSet rs;
    Vector v;
    static String id2, examid2;
    int i = -1, sum, min;
    String[] qtText, a, b, c, d, value, answer, key, course;
    private Image image;
    ResourceBundle bundle;

    public Student(String id1, int c) {
        id2 = id1;
        db = new connectDB();
        db.connectDB();
        this.setUndecorated(true);
        if (c % 2 == 1) {
            bundle = ResourceBundle.getBundle("com.niit.source.exam_en_CN");
        }else 
            bundle = ResourceBundle.getBundle("com.niit.source.exam_en_US");
        
        initComponents();

        if (c % 2 == 1) {
            bundle = ResourceBundle.getBundle("com.niit.source.exam_en_CN");
            Class.setText(bundle.getString("Class"));
            Name.setText(bundle.getString("Name"));
            Female.setText(bundle.getString("Female"));
            Man.setText(bundle.getString("Man"));
            back.setText(bundle.getString("back"));
            classname.setText(bundle.getString("classname"));
            com.setText(bundle.getString("com"));
            describe.setText(bundle.getString("describe"));
            examSubmit.setText(bundle.getString("examSubmit"));
            gener.setText(bundle.getString("gener"));
            id.setText(bundle.getString("id"));
            next.setText(bundle.getString("next"));
            now.setText(bundle.getString("now"));
            ok.setText(bundle.getString("ok"));
            pass.setText(bundle.getString("pass"));
            question.setText(bundle.getString("question"));
            time.setText(bundle.getString("time"));
            title.setText(bundle.getString("title"));
            update.setText(bundle.getString("update"));

        }

        this.setDefaultCloseOperation(3);
        this.setLocationRelativeTo(null);
        this.setResizable(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        chem = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        cmExam = new javax.swing.JComboBox();
        ok = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        exam = new javax.swing.JTabbedPane()
        {          protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            ImageIcon image = new ImageIcon(getClass().getResource("/com/niit/source/web2.png"));
            image.setImage(image.getImage().getScaledInstance(this.getWidth(), this.getHeight(), Image.SCALE_FAST));
            image.paintIcon(this, g, 0, 0);
        }
    };
    personal = new javax.swing.JPanel();
    id = new javax.swing.JLabel();
    idText = new javax.swing.JLabel();
    Class = new javax.swing.JLabel();
    classname = new javax.swing.JLabel();
    Name = new javax.swing.JLabel();
    pass = new javax.swing.JLabel();
    nameText = new javax.swing.JTextField();
    Man = new javax.swing.JRadioButton();
    Female = new javax.swing.JRadioButton();
    pass1 = new javax.swing.JPasswordField();
    gener = new javax.swing.JLabel();
    com = new javax.swing.JLabel();
    pass2 = new javax.swing.JPasswordField();
    update = new javax.swing.JButton();
    score = new javax.swing.JPanel();
    exampanel = new javax.swing.JPanel();
    jScrollPane1 = new javax.swing.JScrollPane();
    question = new javax.swing.JTextArea();
    opa = new javax.swing.JRadioButton();
    opb = new javax.swing.JRadioButton();
    opc = new javax.swing.JRadioButton();
    opd = new javax.swing.JRadioButton();
    now = new javax.swing.JLabel();
    back = new javax.swing.JButton();
    examSubmit = new javax.swing.JButton();
    next = new javax.swing.JButton();
    title = new javax.swing.JLabel();
    time = new javax.swing.JLabel();
    describe = new javax.swing.JLabel();
    jLabel4 = new javax.swing.JLabel();
    jPanel1 = new javax.swing.JPanel();

    chem.setBounds(new java.awt.Rectangle(400, 300, 278, 202));

    jLabel1.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
    jLabel1.setText("ExamID:");

    cmExam.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N

    ok.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
    ok.setText("OK");
    ok.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            okActionPerformed(evt);
        }
    });

    jLabel2.setFont(new java.awt.Font("微软雅黑", 0, 18)); // NOI18N
    jLabel2.setText("Chose the Exam:");

    javax.swing.GroupLayout chemLayout = new javax.swing.GroupLayout(chem.getContentPane());
    chem.getContentPane().setLayout(chemLayout);
    chemLayout.setHorizontalGroup(
        chemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(chemLayout.createSequentialGroup()
            .addGroup(chemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(chemLayout.createSequentialGroup()
                    .addGap(69, 69, 69)
                    .addGroup(chemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1)
                        .addComponent(jLabel2)))
                .addGroup(chemLayout.createSequentialGroup()
                    .addGap(163, 163, 163)
                    .addComponent(cmExam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(chemLayout.createSequentialGroup()
                    .addGap(106, 106, 106)
                    .addComponent(ok)))
            .addContainerGap(69, Short.MAX_VALUE))
    );
    chemLayout.setVerticalGroup(
        chemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(chemLayout.createSequentialGroup()
            .addContainerGap(40, Short.MAX_VALUE)
            .addComponent(jLabel2)
            .addGap(27, 27, 27)
            .addGroup(chemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(cmExam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel1))
            .addGap(30, 30, 30)
            .addComponent(ok)
            .addGap(29, 29, 29))
    );

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    exam.setBackground(new java.awt.Color(102, 0, 255));
    exam.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
    exam.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
    exam.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N

    personal.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
    personal.setOpaque(false);
    personal.addComponentListener(new java.awt.event.ComponentAdapter() {
        public void componentShown(java.awt.event.ComponentEvent evt) {
            personalComponentShown(evt);
        }
    });

    id.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
    id.setText("ID:");

    idText.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
    idText.setText("000");

    Class.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
    Class.setText("Class:");

    classname.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
    classname.setText("000");

    Name.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
    Name.setText("Name:");

    pass.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
    pass.setText("Password:");

    nameText.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
    nameText.setText("000");

    buttonGroup1.add(Man);
    Man.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
    Man.setSelected(true);
    Man.setText("Man");
    Man.setOpaque(false);

    buttonGroup1.add(Female);
    Female.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
    Female.setText("Female");
    Female.setOpaque(false);

    pass1.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
    pass1.setText("00000000");

    gener.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
    gener.setText("Gender:");

    com.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
    com.setText("Confirm:");

    pass2.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
    pass2.setText("00000000");

    update.setFont(new java.awt.Font("幼圆", 1, 14)); // NOI18N
    update.setText("Update");
    update.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            updateActionPerformed(evt);
        }
    });

    javax.swing.GroupLayout personalLayout = new javax.swing.GroupLayout(personal);
    personal.setLayout(personalLayout);
    personalLayout.setHorizontalGroup(
        personalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(personalLayout.createSequentialGroup()
            .addGap(201, 201, 201)
            .addGroup(personalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addComponent(com)
                .addComponent(pass)
                .addComponent(Name)
                .addComponent(Class)
                .addComponent(id)
                .addComponent(gener))
            .addGap(18, 18, 18)
            .addGroup(personalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(idText)
                .addComponent(classname)
                .addGroup(personalLayout.createSequentialGroup()
                    .addComponent(Man)
                    .addGap(18, 18, 18)
                    .addComponent(Female))
                .addGroup(personalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(pass2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                    .addComponent(pass1, javax.swing.GroupLayout.Alignment.LEADING))
                .addComponent(nameText, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addContainerGap(204, Short.MAX_VALUE))
    );
    personalLayout.setVerticalGroup(
        personalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(personalLayout.createSequentialGroup()
            .addContainerGap()
            .addGroup(personalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(id)
                .addComponent(idText))
            .addGap(18, 18, 18)
            .addGroup(personalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(Class)
                .addComponent(classname))
            .addGap(18, 18, 18)
            .addGroup(personalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(Name)
                .addComponent(nameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(18, 18, 18)
            .addGroup(personalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(gener)
                .addComponent(Man)
                .addComponent(Female))
            .addGap(18, 18, 18)
            .addGroup(personalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(pass)
                .addComponent(pass1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(18, 18, 18)
            .addGroup(personalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(com)
                .addComponent(pass2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
            .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(34, 34, 34))
    );

    exam.addTab(bundle.getString("Personal"), new javax.swing.ImageIcon(getClass().getResource("/com/niit/source/ui21.png")), personal); // NOI18N

    score.setFont(new java.awt.Font("微软雅黑", 1, 14)); // NOI18N
    score.addComponentListener(new java.awt.event.ComponentAdapter() {
        public void componentShown(java.awt.event.ComponentEvent evt) {
            scoreComponentShown(evt);
        }
    });

    javax.swing.GroupLayout scoreLayout = new javax.swing.GroupLayout(score);
    score.setLayout(scoreLayout);
    scoreLayout.setHorizontalGroup(
        scoreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGap(0, 641, Short.MAX_VALUE)
    );
    scoreLayout.setVerticalGroup(
        scoreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGap(0, 357, Short.MAX_VALUE)
    );

    exam.addTab(bundle.getString("Report"), new javax.swing.ImageIcon(getClass().getResource("/com/niit/source/ui22.png")), score); // NOI18N

    exampanel.setFont(new java.awt.Font("微软雅黑", 1, 14)); // NOI18N
    exampanel.setOpaque(false);
    exampanel.addComponentListener(new java.awt.event.ComponentAdapter() {
        public void componentShown(java.awt.event.ComponentEvent evt) {
            exampanelComponentShown(evt);
        }
    });

    question.setColumns(20);
    question.setFont(new java.awt.Font("微软雅黑 Light", 0, 14)); // NOI18N
    question.setRows(2);
    question.setText("question\n");
    question.setToolTipText("");
    question.setDisabledTextColor(new java.awt.Color(0, 0, 0));
    question.setEnabled(false);
    jScrollPane1.setViewportView(question);

    buttonGroup2.add(opa);
    opa.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
    opa.setText("A:");
    opa.setOpaque(false);
    opa.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            opaActionPerformed(evt);
        }
    });

    buttonGroup2.add(opb);
    opb.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
    opb.setText("B:");
    opb.setOpaque(false);
    opb.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            opbActionPerformed(evt);
        }
    });

    buttonGroup2.add(opc);
    opc.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
    opc.setText("C:");
    opc.setOpaque(false);
    opc.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            opcActionPerformed(evt);
        }
    });

    buttonGroup2.add(opd);
    opd.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
    opd.setText("D:");
    opd.setOpaque(false);
    opd.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            opdActionPerformed(evt);
        }
    });

    now.setFont(new java.awt.Font("微软雅黑", 0, 18)); // NOI18N
    now.setText("1/10");

    back.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
    back.setText("Back");
    back.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            backActionPerformed(evt);
        }
    });

    examSubmit.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
    examSubmit.setText("Submit");
    examSubmit.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            examSubmitActionPerformed(evt);
        }
    });

    next.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
    next.setText("Next");
    next.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            nextActionPerformed(evt);
        }
    });

    title.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
    title.setText("1 : (5)");

    time.setFont(new java.awt.Font("幼圆", 1, 18)); // NOI18N
    time.setText("00:00");

    describe.setFont(new java.awt.Font("微软雅黑", 0, 18)); // NOI18N
    describe.setText("Describe");

    jLabel4.setFont(new java.awt.Font("微软雅黑", 0, 18)); // NOI18N
    jLabel4.setText("time:");

    javax.swing.GroupLayout exampanelLayout = new javax.swing.GroupLayout(exampanel);
    exampanel.setLayout(exampanelLayout);
    exampanelLayout.setHorizontalGroup(
        exampanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(exampanelLayout.createSequentialGroup()
            .addGap(215, 215, 215)
            .addComponent(back)
            .addGap(18, 18, 18)
            .addComponent(examSubmit)
            .addGap(18, 18, 18)
            .addComponent(next)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 130, Short.MAX_VALUE)
            .addComponent(now)
            .addContainerGap())
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, exampanelLayout.createSequentialGroup()
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(exampanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, exampanelLayout.createSequentialGroup()
                    .addComponent(describe, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(107, 107, 107)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(time, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap())
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, exampanelLayout.createSequentialGroup()
                    .addGroup(exampanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 491, Short.MAX_VALUE)
                        .addGroup(exampanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(title)
                            .addGroup(exampanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(opa, javax.swing.GroupLayout.DEFAULT_SIZE, 491, Short.MAX_VALUE)
                                .addComponent(opb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(opc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(opd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGap(65, 65, 65))))
    );
    exampanelLayout.setVerticalGroup(
        exampanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(exampanelLayout.createSequentialGroup()
            .addGroup(exampanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(describe)
                .addComponent(jLabel4)
                .addComponent(time))
            .addGap(15, 15, 15)
            .addComponent(title)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(opa)
            .addGap(18, 18, 18)
            .addComponent(opb)
            .addGap(18, 18, 18)
            .addComponent(opc)
            .addGap(18, 18, 18)
            .addComponent(opd)
            .addGroup(exampanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(exampanelLayout.createSequentialGroup()
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(exampanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(back, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(examSubmit)
                        .addComponent(next))
                    .addGap(49, 49, 49))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, exampanelLayout.createSequentialGroup()
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(now)
                    .addGap(37, 37, 37))))
    );

    exam.addTab(bundle.getString("Exam"), new javax.swing.ImageIcon(getClass().getResource("/com/niit/source/23.png")), exampanel); // NOI18N

    jPanel1.setOpaque(false);
    jPanel1.addComponentListener(new java.awt.event.ComponentAdapter() {
        public void componentShown(java.awt.event.ComponentEvent evt) {
            jPanel1ComponentShown(evt);
        }
    });

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGap(0, 641, Short.MAX_VALUE)
    );
    jPanel1Layout.setVerticalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGap(0, 357, Short.MAX_VALUE)
    );

    exam.addTab(bundle.getString("Exit"), new javax.swing.ImageIcon(getClass().getResource("/com/niit/source/24.png")), jPanel1); // NOI18N

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(exam)
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(exam)
    );

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void scoreComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_scoreComponentShown
        score.removeAll();
        table = new JTable();
        JScrollPane sp1 = new JScrollPane(table);
        model = new DefaultTableModel();
        model.addColumn("ExamID");
        model.addColumn("Describe");
        model.addColumn("Score");
        model.addColumn("Date");
        try {

            rs = db.stmt.executeQuery("select  EXAM_ID,e.DESCRIBE, SCORE,d.EXAMDATE from STUDENT_DETAILS d join EXAM e on EXAM_ID=ID where d.STUDENT_ID=" + id2);
            model.setRowCount(0);
            while (rs.next()) {
                v = new Vector();
                v.add(rs.getString(1));
                v.add(rs.getString(2));
                v.add(rs.getString(3));
                v.add(rs.getString(4));
                model.addRow(v);
                table.setModel(model);
                sp1.setBounds(0, 0, 679, 362);
                score.add(sp1);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.toString(), "！！！", 0);
        }
    }//GEN-LAST:event_scoreComponentShown

    private void personalComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_personalComponentShown
        try {
            rs = db.stmt.executeQuery("select * from student where id =" + id2);
            while (rs.next()) {
                idText.setText(rs.getString(1));
                nameText.setText(rs.getString(2));
                if (rs.getString(3).equals("F")) {
                    Man.setSelected(true);
                } else {
                    Female.setSelected(true);
                }
                pass1.setText(rs.getString(4));
                pass2.setText(rs.getString(4));
                classname.setText(rs.getString(5));;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.toString(), "！！！", 0);
        }

    }//GEN-LAST:event_personalComponentShown

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        if (pass1.getText().equals(pass2.getText())) {
            String sql;
            try {
                if (Man.isSelected()) {
                    sql = "update student set name=" + "\'" + nameText.getText() + "\'" + "," + "gender=\'M\'" + "," + "passwords=" + "\'" + pass1.getText() + "\'" + "where id =" + id2;
                } else {
                    sql = "update student set name=" + "\'" + nameText.getText() + "\'" + "," + "gender=\'F\'" + "," + "passwords=" + "\'" + pass1.getText() + "\'" + "where id =" + id2;
                }
                db.stmt.executeUpdate(sql);
                JOptionPane.showMessageDialog(rootPane, "Succeed!", "！！！", JOptionPane.INFORMATION_MESSAGE);
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex.toString(), "！！！", 0);
            }
        } else {
            JOptionPane.showMessageDialog(null, "password not same!", "！！！", 0);
        }

    }//GEN-LAST:event_updateActionPerformed

    private void exampanelComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_exampanelComponentShown

        try {
            cmExam.removeAllItems();
            rs = db.stmt.executeQuery("select EXAM_ID from STUDENT_DETAILS where STUDENT_ID=" + id2 + "and EXAMDATE>GETDATE()-1 and SCORE=-1");
            while (rs.next()) {
                cmExam.addItem(rs.getString(1));
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.toString(), "！！！", 0);
        }

        if (cmExam.getItemCount() > 0) {
            chem.setLocationRelativeTo(null);
            chem.show();
        } else {
            JLabel l1 = new JLabel("                            You don't have an exam today.    ");
            l1.setFont(new java.awt.Font("微软雅黑", 0, 20));
            exam.setComponentAt(2, l1);
        }
    }//GEN-LAST:event_exampanelComponentShown

    private void nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextActionPerformed
        if (++i < sum) {
            buttonGroup2.clearSelection();
            if (key[i] == "A") {
                opa.setSelected(true);
            } else if (key[i] == "B") {
                opb.setSelected(true);
            } else if (key[i] == "C") {
                opc.setSelected(true);
            } else if (key[i] == "D") {
                opd.setSelected(true);
            }

            title.setText(i + 1 + ":" + course[i] + "(" + value[i] + ")");
            question.setText(qtText[i]);
            opa.setText("A:" + a[i]);
            opb.setText("B:" + b[i]);
            opc.setText("C:" + c[i]);
            opd.setText("D:" + d[i]);
            now.setText(i + 1 + "/" + sum);
        } else {
            i--;
            JOptionPane.showMessageDialog(null, "This is the last question", "final", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_nextActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        if (--i > -1) {

            buttonGroup2.clearSelection();
            if (key[i] == "A") {
                opa.setSelected(true);
            } else if (key[i] == "B") {
                opb.setSelected(true);
            } else if (key[i] == "C") {
                opc.setSelected(true);
            } else if (key[i] == "D") {
                opd.setSelected(true);
            }

            title.setText(i + 1 + ":" + course[i] + "(" + value[i] + ")");
            question.setText(qtText[i]);
            opa.setText("A:" + a[i]);
            opb.setText("B:" + b[i]);
            opc.setText("C:" + c[i]);
            opd.setText("D:" + d[i]);
            now.setText(i + 1 + "/" + sum);
        } else {
            i++;
            JOptionPane.showMessageDialog(null, "This is the first question", "final", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_backActionPerformed

    private void examSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_examSubmitActionPerformed
        int score = 0, fill = 0;
        for (int x = 0; x < sum; x++) {
            fill += Integer.valueOf(value[x]);
            if (answer[x].equalsIgnoreCase(key[x])) {
                score += Integer.valueOf(value[x]);
            }
        }
        JOptionPane.showMessageDialog(null, "Your score is " + score + "\n" + "The fill is " + fill, "Score", JOptionPane.INFORMATION_MESSAGE);

        try {
            db.stmt.execute("update STUDENT_DETAILS set SCORE=" + score + ",EXAMDATE=GETDATE() where STUDENT_ID=" + id2 + "and EXAM_ID=" + examid2);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.toString(), "！！！", 0);
        }
        JLabel l = new JLabel("       May the joy and happiness around you today and always.    ");
        l.setFont(new java.awt.Font("微软雅黑", 0, 20));
        exam.setComponentAt(2, l);

    }//GEN-LAST:event_examSubmitActionPerformed

    private void opaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opaActionPerformed
        key[i] = "A";
    }//GEN-LAST:event_opaActionPerformed

    private void opbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opbActionPerformed
        key[i] = "B";
    }//GEN-LAST:event_opbActionPerformed

    private void opcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcActionPerformed
        key[i] = "C";
    }//GEN-LAST:event_opcActionPerformed

    private void opdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opdActionPerformed
        key[i] = "D";
    }//GEN-LAST:event_opdActionPerformed

    private void okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okActionPerformed

        examid2 = cmExam.getSelectedItem().toString();
        chem.show(false);
        getPaper p = new getPaper(examid2);
        qtText = p.getQuestionText();
        a = p.getA();
        b = p.getB();
        c = p.getC();
        d = p.getD();
        value = p.getValue();
        answer = p.getAnswer();
        course = p.getCourse();
        describe.setText(p.getDescribe());
        min = Integer.valueOf(p.getTime());
        key = new String[answer.length];
        sum = qtText.length;
        if (++i < sum) {
            title.setText(i + 1 + ":" + course[i] + "(" + value[i] + ")");
            question.setText(qtText[i]);
            opa.setText("A:" + a[i]);
            opb.setText("B:" + b[i]);
            opc.setText("C:" + c[i]);
            opd.setText("D:" + d[i]);
            now.setText(i + 1 + "/" + sum);

            Thread th = new Thread(this);
            th.start();
        } else {
            i--;
            JOptionPane.showMessageDialog(null, "This is the last question", "final", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_okActionPerformed

    private void jPanel1ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanel1ComponentShown
        System.exit(0);
    }//GEN-LAST:event_jPanel1ComponentShown

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Class;
    private javax.swing.JRadioButton Female;
    private javax.swing.JRadioButton Man;
    private javax.swing.JLabel Name;
    private javax.swing.JButton back;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JDialog chem;
    private javax.swing.JLabel classname;
    private javax.swing.JComboBox cmExam;
    private javax.swing.JLabel com;
    private javax.swing.JLabel describe;
    private javax.swing.JTabbedPane exam;
    private javax.swing.JButton examSubmit;
    private javax.swing.JPanel exampanel;
    private javax.swing.JLabel gener;
    private javax.swing.JLabel id;
    private javax.swing.JLabel idText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameText;
    private javax.swing.JButton next;
    private javax.swing.JLabel now;
    private javax.swing.JButton ok;
    private javax.swing.JRadioButton opa;
    private javax.swing.JRadioButton opb;
    private javax.swing.JRadioButton opc;
    private javax.swing.JRadioButton opd;
    private javax.swing.JLabel pass;
    private javax.swing.JPasswordField pass1;
    private javax.swing.JPasswordField pass2;
    private javax.swing.JPanel personal;
    private javax.swing.JTextArea question;
    private javax.swing.JPanel score;
    private javax.swing.JLabel time;
    private javax.swing.JLabel title;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables

    @Override
    public void run() {
        for (int m = min - 1; m >= 0; m--) {
            for (int sec = 59; sec >= 0; sec--) {
                time.setText(m + ":" + sec);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    System.out.println(ex.toString());
                }
            }
        }
        JOptionPane.showMessageDialog(exampanel, "Time out!", "sorry", 1);
        int score = 0, fill = 0;
        for (int x = 0; x < sum; x++) {
            fill += Integer.valueOf(value[x]);
            if (answer[x].equalsIgnoreCase(key[x])) {
                score += Integer.valueOf(value[x]);
            }
        }
        JOptionPane.showMessageDialog(null, "Your score is " + score + "\n" + "The fill is " + fill, "Score", JOptionPane.INFORMATION_MESSAGE);
        try {
            db.stmt.execute("update STUDENT_DETAILS set SCORE=" + score + ",EXAMDATE=GETDATE() where STUDENT_ID=" + id2 + "and EXAM_ID=" + examid2);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.toString(), "！！！", 0);
        }
        JLabel l = new JLabel("       May the joy and happiness around you today and always.    ");
        l.setFont(new java.awt.Font("微软雅黑", 0, 20));
        exam.setComponentAt(2, l);
    }
}
