/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package fraydiegosolutions;


import conexionBD.Conexion;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author USER
 */
public class JF_cursos extends javax.swing.JFrame {

    Conexion objasCli = new Conexion();
    Connection conn = objasCli.conectar();
    
    
    public JF_cursos() {
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/imagenes/temas-importantes.png")));
    }
    
    
    public void eliminaractividad() throws SQLException{
        int fila = jTactividades.getSelectedRow();
        String valor = jTactividades.getValueAt(fila, 0).toString();  
        try {
            PreparedStatement eliminar = conn.prepareStatement("DELETE FROM cursos_actividades WHERE ID_Curso = '"+valor+"' ");
             eliminar.executeUpdate();
             mostraractividad();
        }catch(Exception ex ){
            JOptionPane.showMessageDialog(null,ex+ "No se logró el Registro");
        }
    }
    
    public void eliminarlectorcurso() throws SQLException{
        int fila = jTcursos.getSelectedRow();
        String valor = jTcursos.getValueAt(fila, 0).toString();  
        try {
            PreparedStatement eliminar = conn.prepareStatement("DELETE FROM lector_curso WHERE ID_Curso = '"+valor+"' ");
             eliminar.executeUpdate();           
        }catch(Exception ex ){
            JOptionPane.showMessageDialog(null,ex+ "No se logró el Registro");
        }
    }
    
    public void mostraractividad() throws SQLException{
        
        try{
            Conexion.buscarActividad =false;
            String strSql = "select * from cursos_actividades";
            Conexion.conectar();
            Conexion.sentencia = Conexion.conn.prepareStatement(strSql);
            ResultSet objRes = Conexion.sentencia.executeQuery(strSql);    

            DefaultTableModel modelo = (DefaultTableModel) jTactividades.getModel();
            modelo.setRowCount(0);

            Object [] fila = new Object[4];
                while (objRes.next()){
                    for (int i=0; i<4 ; i++){
                        fila[i]=objRes.getObject(i+1);                       
                    }     
                    modelo.addRow(fila);
                    jTactividades.setModel(modelo);
                }
            }catch(SQLException ex) {   
                System.out.println(ex);
            }
    }
    
    

    
    public void actualizarAct(){
        
       int fila = jTactividades.getSelectedRow();
       
       int ident= Integer.parseInt(this.jTactividades.getValueAt(fila,0).toString());
       String ActividadV = jTactividades.getValueAt(fila, 1).toString();
       
        try {
            
           PreparedStatement modificar = conn.prepareStatement("UPDATE cursos_actividades SET Actividades = '"+ActividadV+"' WHERE ID_Curso = '"+ident+"' ");  
           
           modificar.executeUpdate(); 
           mostraractividad();
           
        } catch (SQLException e) {
            
          JOptionPane.showMessageDialog(null,e+ "No se logró Actualizar el Registro");  
        }
    }
    
    
    
   
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTcursos = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTactividades = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jComboBox_curso = new javax.swing.JComboBox<>();
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jButtonlimpiar = new javax.swing.JButton();
        jTextField_Actividad = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButtonActualizar = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Actividades y Cursos");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(249, 240, 235));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTcursos.setForeground(new java.awt.Color(102, 0, 0));
        jTcursos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Curso", "ID Lector", "Apellido P.L", "Apellido M.L", "Nombre Lector", "Edad", "Escuela", "Curso"
            }
        ));
        jTcursos.setSelectionBackground(new java.awt.Color(102, 0, 0));
        jScrollPane1.setViewportView(jTcursos);
        if (jTcursos.getColumnModel().getColumnCount() > 0) {
            jTcursos.getColumnModel().getColumn(0).setPreferredWidth(30);
            jTcursos.getColumnModel().getColumn(1).setPreferredWidth(30);
            jTcursos.getColumnModel().getColumn(5).setPreferredWidth(30);
            jTcursos.getColumnModel().getColumn(7).setPreferredWidth(100);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 820, 160));

        jTactividades.setForeground(new java.awt.Color(102, 0, 0));
        jTactividades.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Actividades", "Fecha", "Curso"
            }
        ));
        jTactividades.setRowHeight(30);
        jTactividades.setSelectionBackground(new java.awt.Color(102, 0, 0));
        jScrollPane2.setViewportView(jTactividades);
        if (jTactividades.getColumnModel().getColumnCount() > 0) {
            jTactividades.getColumnModel().getColumn(0).setPreferredWidth(10);
            jTactividades.getColumnModel().getColumn(1).setPreferredWidth(450);
            jTactividades.getColumnModel().getColumn(2).setPreferredWidth(30);
            jTactividades.getColumnModel().getColumn(3).setPreferredWidth(50);
        }

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 820, 190));

        jPanel2.setBackground(new java.awt.Color(255, 253, 253));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 0));
        jLabel1.setText("Curso");

        jComboBox_curso.setBackground(new java.awt.Color(252, 245, 245));
        jComboBox_curso.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jComboBox_curso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Circulo de Lectura", "Manualidades", "Dibujo y Pintura", "Otras Actividades" }));
        jComboBox_curso.setBorder(null);
        jComboBox_curso.setFocusable(false);
        jComboBox_curso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_cursoActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(102, 0, 0));
        jButton4.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/filter-free-icon-font.png"))); // NOI18N
        jButton4.setFocusable(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(153, 0, 0));
        jButton3.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(252, 245, 245));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/search-free-icon-font.png"))); // NOI18N
        jButton3.setText(" Todos");
        jButton3.setFocusable(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox_curso, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox_curso)
                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 470, 60));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 0)));

        jButtonlimpiar.setBackground(new java.awt.Color(102, 0, 0));
        jButtonlimpiar.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jButtonlimpiar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonlimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/broom-free-icon-font.png"))); // NOI18N
        jButtonlimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonlimpiarActionPerformed(evt);
            }
        });

        jTextField_Actividad.setBackground(new java.awt.Color(252, 245, 245));
        jTextField_Actividad.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField_Actividad.setForeground(new java.awt.Color(102, 0, 0));
        jTextField_Actividad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField_Actividad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 0)));
        jTextField_Actividad.setSelectionColor(new java.awt.Color(102, 0, 0));

        jButton2.setBackground(new java.awt.Color(102, 0, 0));
        jButton2.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(252, 245, 245));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/edit-free-icon-font.png"))); // NOI18N
        jButton2.setText("Guardar ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonlimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField_Actividad, javax.swing.GroupLayout.PREFERRED_SIZE, 575, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField_Actividad)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonlimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 820, 60));

        jButton5.setBackground(new java.awt.Color(0, 51, 102));
        jButton5.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(252, 245, 245));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/delete-user-free-icon-font.png"))); // NOI18N
        jButton5.setText("Borrar");
        jButton5.setBorder(null);
        jButton5.setBorderPainted(false);
        jButton5.setFocusPainted(false);
        jButton5.setFocusable(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 30, 110, 40));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 130, -1, -1));

        jPanel5.setBackground(new java.awt.Color(255, 253, 253));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 0)));

        jButton1.setBackground(new java.awt.Color(153, 0, 0));
        jButton1.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/eye-free-icon-font.png"))); // NOI18N
        jButton1.setText(" Mostrar Actividades");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButtonActualizar.setBackground(new java.awt.Color(102, 0, 0));
        jButtonActualizar.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jButtonActualizar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/refresh-free-icon-font.png"))); // NOI18N
        jButtonActualizar.setText(" Actualizar ");
        jButtonActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonActualizarActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(0, 51, 102));
        jButton6.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/time-delete-free-icon-font.png"))); // NOI18N
        jButton6.setText("Borrar ");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 281, Short.MAX_VALUE)
                .addComponent(jButtonActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 520, 820, -1));

        jMenu1.setBorder(null);
        jMenu1.setForeground(new java.awt.Color(102, 0, 0));
        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/e-learning-free-icon-font.png"))); // NOI18N
        jMenu1.setText(" Opciones   ");
        jMenu1.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N

        jMenu4.setForeground(new java.awt.Color(102, 0, 0));
        jMenu4.setText(" Lector Regular");
        jMenu4.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N

        jMenuItem3.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jMenuItem3.setForeground(new java.awt.Color(102, 0, 0));
        jMenuItem3.setText("Agregar a Curso");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem3);

        jMenu1.add(jMenu4);

        jMenuBar1.add(jMenu1);

        jMenu2.setBorder(null);
        jMenu2.setForeground(new java.awt.Color(102, 0, 0));
        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/undo-free-icon-font (1).png"))); // NOI18N
        jMenu2.setText("Regresar");
        jMenu2.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N

        jMenuItem1.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jMenuItem1.setForeground(new java.awt.Color(102, 0, 0));
        jMenuItem1.setText("Regresar a Módulo");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 863, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 590, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
          
        JF_modulo modulovar = new JF_modulo();
            modulovar.setVisible(true);
            this.setVisible(false); 
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        
        Agregar_Curso_Lector ventanavar = new Agregar_Curso_Lector(); 
        ventanavar.setVisible(true);
        this.setVisible(false); 
        
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
          
        try {
            PreparedStatement pps = conn.prepareStatement("INSERT INTO cursos_actividades (Actividades,Fecha_Actividad, curso) VALUES(?,CURRENT_DATE(),?)");
            pps.setString(1,jTextField_Actividad.getText());         
            pps.setString(2, (String) jComboBox_curso.getSelectedItem());
            pps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Datos Guardados");

        } catch (SQLException ex) {
            Logger.getLogger(JF_cursos.class.getName()).log(Level.SEVERE, null, ex);
        }
     
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jComboBox_cursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_cursoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox_cursoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
        try {     
            mostraractividad();
        } catch (SQLException ex) {
            Logger.getLogger(JF_cursos.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       
        
     try{
       Conexion.buscarActividad =false;
        String strSql = "SELECT ID_curso, lector.ID_Lector, Apellido_Paterno_Lector, Apellido_Materno_Lector, Nombre_Lector, Edad_Lector, Escuela, Curso \n" +
                        "FROM lector INNER JOIN lector_curso \n" +
                        "ON lector.ID_Lector=lector_curso.ID_Lector;";
        Conexion.conectar();
        Conexion.sentencia = Conexion.conn.prepareStatement(strSql);
        ResultSet objRes = Conexion.sentencia.executeQuery(strSql);    
        //System.out.println("Consulta Mostrar con exito");
        
        DefaultTableModel modelo = (DefaultTableModel) jTcursos.getModel();
             
        modelo.setRowCount(0);
        
        Object [] fila = new Object[8];
        while (objRes.next()){
            for (int i=0; i<8 ; i++){
                fila[i]=objRes.getObject(i+1);
                
            }     
            modelo.addRow(fila);
            jTcursos.setModel(modelo);
            
        }
        
        }catch (SQLException ex) {
            System.out.println(ex);
            
        }   
        
        
        
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        
        
        try{
       Conexion.buscarActividad =false;
        String strSql = "SELECT ID_curso, lector.ID_Lector, Apellido_Paterno_Lector, Apellido_Materno_Lector, Nombre_Lector, Edad_Lector, Escuela, Curso \n" +
                        "FROM lector INNER JOIN lector_curso \n" +
                        "ON lector.ID_Lector=lector_curso.ID_Lector WHERE Curso LIKE '%"+jComboBox_curso.getSelectedItem()+"%';";
        Conexion.conectar();
        Conexion.sentencia = Conexion.conn.prepareStatement(strSql);
        ResultSet objRes = Conexion.sentencia.executeQuery(strSql);    
        //System.out.println("Consulta Mostrar con exito");
        
        DefaultTableModel modelo = (DefaultTableModel) jTcursos.getModel();
             
        modelo.setRowCount(0);
        
        Object [] fila = new Object[8];
        while (objRes.next()){
            for (int i=0; i<8 ; i++){
                fila[i]=objRes.getObject(i+1);
                //modelo.addRow(fila);
                //tabla.setModel(modelo);
            }     
            modelo.addRow(fila);
            jTcursos.setModel(modelo);
            
        }
        
        }catch (SQLException ex) {
            System.out.println(ex);
            
        }   
        
        
        
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
            
        try {
            eliminaractividad();
        } catch (SQLException ex) {
            Logger.getLogger(JF_cursos.class.getName()).log(Level.SEVERE, null, ex);
        }
        
     
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButtonlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonlimpiarActionPerformed
        jTextField_Actividad.setText("");    
    }//GEN-LAST:event_jButtonlimpiarActionPerformed

    private void jButtonActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonActualizarActionPerformed
        
       actualizarAct(); 
  
    }//GEN-LAST:event_jButtonActualizarActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
             
        try {
            eliminarlectorcurso();
        } catch (SQLException ex) {
            Logger.getLogger(JF_cursos.class.getName()).log(Level.SEVERE, null, ex);
        }
                
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(JF_cursos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JF_cursos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JF_cursos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JF_cursos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JF_cursos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButtonActualizar;
    private javax.swing.JButton jButtonlimpiar;
    private javax.swing.JComboBox<String> jComboBox_curso;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTactividades;
    private javax.swing.JTable jTcursos;
    private javax.swing.JTextField jTextField_Actividad;
    // End of variables declaration//GEN-END:variables
}
