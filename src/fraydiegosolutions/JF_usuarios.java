/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package fraydiegosolutions;

import FuncionesFDS.funciones;
import conexionBD.Conexion;
import static conexionBD.Conexion.conn;
import java.awt.Toolkit;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author USER
 */
public class JF_usuarios extends javax.swing.JFrame {
    
    funciones funcion = new funciones();

    /**
     * Creates new form JF_usuarios
     */
    
    public JF_usuarios() {
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/imagenes/temas-importantes.png")));
    }
    
    
    public void contar(){
    int tablaReg= TablaEntradasRegulares.getRowCount();
    int tablaVis= TablaEntradasVisitantes.getRowCount();
    int tablaXD = tablaReg + tablaVis;
    
        for(int x=0; x<=tablaXD;x++){
            LabelCont.setText("No. Entradas Totales: "+x);                 
        }
  
    }
    
    public void contarVisitantes(){
    
    int tablaVis= TablaEntradasVisitantes.getRowCount();
    
        for(int x=0; x<=tablaVis;x++){
            jLabelVis.setText("No. Lectores Visitantes: "+x);                 
        }
  
    }
    
    public void contarRegulares(){
    
    int tablaReg= TablaEntradasRegulares.getRowCount();
    
        for(int x=0; x<=tablaReg;x++){
            jLabelReg.setText("No. Lectores Regulares: "+x);                 
        }
  
    }
    
    
    
    

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaEntradasVisitantes = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        id_lectorAl = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        Conbo_ActividadRegular = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldApellidoP = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldApellidoM = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtextedad = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jComboBoxactividadvis = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jComboBoxecuelavis = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaEntradasRegulares = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jDate1 = new com.toedter.calendar.JDateChooser();
        jDate2 = new com.toedter.calendar.JDateChooser();
        jLabelVis = new javax.swing.JLabel();
        jLabelReg = new javax.swing.JLabel();
        LabelCont = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registrar Asistencia");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(249, 240, 235));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TablaEntradasVisitantes.setForeground(new java.awt.Color(102, 0, 0));
        TablaEntradasVisitantes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID_Acceso", "Apellido_M", "Apellido _P", "Nombre", "Edad", "Hora Entrada", "Fecha", "Escuela", "Actividad"
            }
        ));
        TablaEntradasVisitantes.setGridColor(new java.awt.Color(252, 245, 245));
        TablaEntradasVisitantes.setSelectionBackground(new java.awt.Color(102, 0, 0));
        jScrollPane1.setViewportView(TablaEntradasVisitantes);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, 880, 140));

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 0));
        jLabel1.setText("Entrada de Lectores Regulares");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 210, 30));
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(869, 216, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 0)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 0, 0));
        jLabel9.setText("Lector Regular:");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 0, -1, 40));

        id_lectorAl.setBackground(new java.awt.Color(252, 245, 245));
        id_lectorAl.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        id_lectorAl.setForeground(new java.awt.Color(102, 0, 0));
        id_lectorAl.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        id_lectorAl.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 0, 0)));
        id_lectorAl.setSelectionColor(new java.awt.Color(153, 0, 0));
        id_lectorAl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_lectorAlActionPerformed(evt);
            }
        });
        jPanel2.add(id_lectorAl, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 220, 30));

        jButton2.setBackground(new java.awt.Color(153, 0, 0));
        jButton2.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(252, 245, 245));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/user-add-free-icon-font.png"))); // NOI18N
        jButton2.setText("ACCEDER");
        jButton2.setFocusable(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, 150, 40));

        Conbo_ActividadRegular.setBackground(new java.awt.Color(252, 245, 245));
        Conbo_ActividadRegular.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Lectura Libre", "Trabajos Escolares", "Curso" }));
        Conbo_ActividadRegular.setBorder(null);
        Conbo_ActividadRegular.setFocusable(false);
        jPanel2.add(Conbo_ActividadRegular, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 150, 30));

        jLabel10.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 0, 0));
        jLabel10.setText("Actividad");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 70, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 10, 260, 170));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 0)));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 0, 0));
        jLabel2.setText("Nombre(s)");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 8, 95, 30));

        jTextFieldNombre.setBackground(new java.awt.Color(252, 245, 245));
        jTextFieldNombre.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jTextFieldNombre.setForeground(new java.awt.Color(102, 0, 0));
        jTextFieldNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldNombre.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 0, 0)));
        jTextFieldNombre.setSelectionColor(new java.awt.Color(153, 0, 0));
        jPanel3.add(jTextFieldNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 160, 30));

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 0, 0));
        jLabel6.setText("Apellido Paterno");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, 30));

        jTextFieldApellidoP.setBackground(new java.awt.Color(252, 245, 245));
        jTextFieldApellidoP.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jTextFieldApellidoP.setForeground(new java.awt.Color(102, 0, 0));
        jTextFieldApellidoP.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldApellidoP.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 0, 0)));
        jTextFieldApellidoP.setSelectionColor(new java.awt.Color(153, 0, 0));
        jPanel3.add(jTextFieldApellidoP, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 160, 30));

        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 0, 0));
        jLabel7.setText("Apellido Materno");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, 30));

        jTextFieldApellidoM.setBackground(new java.awt.Color(252, 245, 245));
        jTextFieldApellidoM.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jTextFieldApellidoM.setForeground(new java.awt.Color(102, 0, 0));
        jTextFieldApellidoM.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldApellidoM.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 0, 0)));
        jTextFieldApellidoM.setSelectionColor(new java.awt.Color(153, 0, 0));
        jPanel3.add(jTextFieldApellidoM, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 160, 30));

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 0, 0));
        jLabel3.setText("Edad");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, 30));

        jtextedad.setBackground(new java.awt.Color(252, 245, 245));
        jtextedad.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jtextedad.setForeground(new java.awt.Color(102, 0, 0));
        jtextedad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtextedad.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 0, 0)));
        jtextedad.setSelectionColor(new java.awt.Color(153, 0, 0));
        jPanel3.add(jtextedad, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 60, 30));

        jLabel8.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 0, 0));
        jLabel8.setText("Actividad");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 80, 70, 30));

        jComboBoxactividadvis.setBackground(new java.awt.Color(252, 245, 245));
        jComboBoxactividadvis.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Lectura Libre", "Trabajos Escolares", "Curso" }));
        jComboBoxactividadvis.setBorder(null);
        jComboBoxactividadvis.setFocusable(false);
        jPanel3.add(jComboBoxactividadvis, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 80, 180, 30));

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 0, 0));
        jLabel4.setText("Escuela");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 40, 70, 30));

        jComboBoxecuelavis.setBackground(new java.awt.Color(252, 245, 245));
        jComboBoxecuelavis.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "No aplica", "Primaria Francisco I Madero", "Jardín de niños San Sebastián", "Secundaria Técnica No. 68", "Secundaria Felipe Angeles", "Secundaria Técnica No. 13", "UAEH ESAT", "UAEH ESTL" }));
        jComboBoxecuelavis.setBorder(null);
        jComboBoxecuelavis.setFocusable(false);
        jPanel3.add(jComboBoxecuelavis, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 40, 180, 30));

        jButton1.setBackground(new java.awt.Color(153, 0, 0));
        jButton1.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(252, 245, 245));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/user-add-free-icon-font.png"))); // NOI18N
        jButton1.setText("REGISTRAR");
        jButton1.setFocusable(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 120, 170, 40));

        jLabel11.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 0, 0));
        jLabel11.setText("Lector Visitante:");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 0, -1, 40));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 610, 170));

        TablaEntradasRegulares.setForeground(new java.awt.Color(102, 0, 0));
        TablaEntradasRegulares.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID_Acceso", "ID_Lector", "Apellido_M", "Apellido _P", "Nombre", "Edad", "Hora Entrada", "Fecha", "Actividad"
            }
        ));
        TablaEntradasRegulares.setGridColor(new java.awt.Color(252, 245, 245));
        TablaEntradasRegulares.setSelectionBackground(new java.awt.Color(102, 0, 0));
        jScrollPane2.setViewportView(TablaEntradasRegulares);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 880, 120));

        jLabel13.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(153, 0, 0));
        jLabel13.setText("Entrada de Lectores Visitantes ");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 210, 30));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 0)));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton3.setBackground(new java.awt.Color(102, 0, 0));
        jButton3.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/eye-free-icon-font.png"))); // NOI18N
        jButton3.setText("Mostrar");
        jButton3.setFocusable(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 10, 140, 40));

        jLabel14.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(102, 0, 0));
        jLabel14.setText("Filtrar Fecha ");
        jPanel5.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 10, 160, 40));

        jButton4.setBackground(new java.awt.Color(102, 0, 0));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/filter-free-icon-font.png"))); // NOI18N
        jButton4.setFocusable(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 10, 40, 40));

        jDate1.setBackground(new java.awt.Color(252, 245, 245));
        jDate1.setForeground(new java.awt.Color(0, 51, 102));
        jDate1.setDateFormatString("yyyy-MM-dd");
        jDate1.setFocusable(false);
        jDate1.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jPanel5.add(jDate1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, 150, 40));

        jDate2.setBackground(new java.awt.Color(252, 245, 245));
        jDate2.setForeground(new java.awt.Color(0, 51, 102));
        jDate2.setDateFormatString("yyyy-MM-dd");
        jDate2.setFocusable(false);
        jPanel5.add(jDate2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, 150, 40));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 880, 60));

        jLabelVis.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabelVis.setForeground(new java.awt.Color(153, 51, 0));
        jLabelVis.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(jLabelVis, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 400, 180, 30));

        jLabelReg.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabelReg.setForeground(new java.awt.Color(153, 51, 0));
        jLabelReg.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(jLabelReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 250, 180, 30));

        LabelCont.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        LabelCont.setForeground(new java.awt.Color(153, 51, 0));
        LabelCont.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(LabelCont, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 570, 170, 20));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, 600));

        jMenuBar1.setBorder(null);

        jMenu2.setForeground(new java.awt.Color(102, 0, 0));
        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/e-learning-free-icon-font.png"))); // NOI18N
        jMenu2.setText("Opciones ");
        jMenu2.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N

        jMenuItem2.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jMenuItem2.setForeground(new java.awt.Color(102, 0, 0));
        jMenuItem2.setText("Agregar/Editar Lector Regular ");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuBar1.add(jMenu2);

        jMenu3.setForeground(new java.awt.Color(102, 0, 0));
        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/undo-free-icon-font (1).png"))); // NOI18N
        jMenu3.setText("Regresar");
        jMenu3.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N

        jMenuItem3.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jMenuItem3.setForeground(new java.awt.Color(102, 0, 0));
        jMenuItem3.setText("Regresar a Módulo");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem3);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        
        JF_modulo modulovar = new JF_modulo();
            modulovar.setVisible(true);
            this.setVisible(false); 
           
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        
            PreparedStatement pps;
        try {
            pps = conn.prepareStatement("INSERT INTO asistencia (ID_Lector, Hora_Entrada, Fecha, Actividad) VALUES (?,CURRENT_TIME(),CURRENT_DATE(),?)");
            pps.setString(1,id_lectorAl.getText());         
            pps.setString(2, (String) Conbo_ActividadRegular.getSelectedItem());          
            pps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Datos Guardados"); 
        
        } catch (SQLException ex) {
            Logger.getLogger(JF_usuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        
         try{
       Conexion.buscarUser =false;
        String strSql = "SELECT ID_acceso, lector.ID_Lector, Apellido_Paterno_Lector, Apellido_Materno_Lector, Nombre_Lector, Edad_Lector, Hora_Entrada ,Fecha, Actividad \n" +
                        "FROM asistencia INNER JOIN lector \n" +
                        "ON asistencia.ID_Lector = lector.ID_Lector;";
        Conexion.conectar();
        Conexion.sentencia = Conexion.conn.prepareStatement(strSql);
        ResultSet objRes = Conexion.sentencia.executeQuery(strSql);    
        //System.out.println("Consulta Mostrar con exito");
        
        DefaultTableModel modelo = (DefaultTableModel) TablaEntradasRegulares.getModel();
             
        modelo.setRowCount(0);
        
        Object [] fila = new Object[9];
        while (objRes.next()){
            for (int i=0; i<9 ; i++){
                fila[i]=objRes.getObject(i+1);
                
            }     
            modelo.addRow(fila);
            TablaEntradasRegulares.setModel(modelo);
            
        }
        
        }catch (SQLException ex) {
            System.out.println(ex);
            
        }   
         
           
           try{
       Conexion.buscarUser =false;
        String strSql = "SELECT * FROM fds_basedatos.asitencias_visitante";
        Conexion.conectar();
        Conexion.sentencia = Conexion.conn.prepareStatement(strSql);
        ResultSet objRes = Conexion.sentencia.executeQuery(strSql);    
              
        DefaultTableModel modelo = (DefaultTableModel) TablaEntradasVisitantes.getModel();
             
        modelo.setRowCount(0);
        
        Object [] fila = new Object[9];
        while (objRes.next()){
            for (int i=0; i<9 ; i++){
                fila[i]=objRes.getObject(i+1);
                
            }     
            modelo.addRow(fila);
            TablaEntradasVisitantes.setModel(modelo);
            
        }
        
        }catch (SQLException ex) {
            System.out.println(ex);
            
        }
           
       contar(); 
       contarRegulares();
       contarVisitantes();
            

        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
          PreparedStatement pps;
        
        try {
            pps = conn.prepareStatement("INSERT INTO asitencias_visitante (Apellido_Paterno,Apellido_Materno,Nombre, Edad, Hora_Entrada, Fecha_acceso,escuela, Actividad) VALUES (?,?,?,?,CURRENT_TIME(),CURRENT_DATE(),?,?)");
            pps.setString(1,jTextFieldApellidoP.getText()); 
            pps.setString(2,jTextFieldApellidoM.getText()); 
            pps.setString(3,jTextFieldNombre.getText());
            pps.setString(4,jtextedad.getText());
            pps.setString(5, (String) jComboBoxecuelavis.getSelectedItem());
            pps.setString(6, (String) jComboBoxactividadvis.getSelectedItem());
               
            pps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Datos Guardados"); 
        
        
        } catch (SQLException ex) {
            Logger.getLogger(JF_usuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
            
           
        
       
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        

        
          try{
                Conexion.buscarUser =false;
                 String strSql = "SELECT * FROM asitencias_visitante Where Fecha_acceso BETWEEN '"+funcion.getFecha(jDate1)+"' AND '"+funcion.getFecha(jDate2)+"' ";
                 Conexion.conectar();
                 Conexion.sentencia = Conexion.conn.prepareStatement(strSql);
                 ResultSet objRes = Conexion.sentencia.executeQuery(strSql);    

                 DefaultTableModel modelo = (DefaultTableModel) TablaEntradasVisitantes.getModel();

                 modelo.setRowCount(0);

                 Object [] fila = new Object[9];
                 while (objRes.next()){
                     
                     for (int i=0; i<9 ; i++){
                         fila[i]=objRes.getObject(i+1);

                     }     
                     modelo.addRow(fila);
                     TablaEntradasVisitantes.setModel(modelo);

                 }
        
        }catch (SQLException ex) {
                    System.out.println(ex);
            
        } 
          
         
          
        try{
                Conexion.buscarUser =false;
                String strSql = "SELECT ID_acceso, lector.ID_Lector, Apellido_Paterno_Lector, Apellido_Materno_Lector, Nombre_Lector, Edad_Lector, Hora_Entrada ,Fecha, Escuela, Actividad \n" +
                                 "FROM asistencia INNER JOIN lector \n" +
                                 "ON asistencia.ID_Lector = lector.ID_Lector WHERE Fecha BETWEEN '"+funcion.getFecha(jDate1)+"' AND '"+funcion.getFecha(jDate2)+"';";
                Conexion.conectar();
                Conexion.sentencia = Conexion.conn.prepareStatement(strSql);
                ResultSet objRes = Conexion.sentencia.executeQuery(strSql);    
                

                 DefaultTableModel modelo = (DefaultTableModel) TablaEntradasRegulares.getModel();

                 modelo.setRowCount(0);

                 Object [] fila = new Object[10];
                 while (objRes.next()){
                     for (int i=0; i<10 ; i++){
                         fila[i]=objRes.getObject(i+1);

                     }     
                     modelo.addRow(fila);
                     TablaEntradasRegulares.setModel(modelo);

                 }
        
        }catch (SQLException ex) {
            System.out.println(ex);
            
        }  
          
          contar();
          contarRegulares();
          contarVisitantes();
             
          
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        
        Agregar_Lector modulovar = new Agregar_Lector();
            modulovar.setVisible(true);
            this.setVisible(false); 
        
        
        
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void id_lectorAlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_lectorAlActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id_lectorAlActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JF_usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JF_usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JF_usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JF_usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JF_usuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Conbo_ActividadRegular;
    private javax.swing.JLabel LabelCont;
    private javax.swing.JTable TablaEntradasRegulares;
    private javax.swing.JTable TablaEntradasVisitantes;
    private javax.swing.JTextField id_lectorAl;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBoxactividadvis;
    private javax.swing.JComboBox<String> jComboBoxecuelavis;
    private com.toedter.calendar.JDateChooser jDate1;
    private com.toedter.calendar.JDateChooser jDate2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelReg;
    private javax.swing.JLabel jLabelVis;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextFieldApellidoM;
    private javax.swing.JTextField jTextFieldApellidoP;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jtextedad;
    // End of variables declaration//GEN-END:variables
}
