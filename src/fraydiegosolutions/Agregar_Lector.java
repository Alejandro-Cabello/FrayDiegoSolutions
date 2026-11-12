/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package fraydiegosolutions;

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
public class Agregar_Lector extends javax.swing.JFrame {

    /**
     * Creates new form Agregar_Lector
     */
    public Agregar_Lector() {
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/imagenes/temas-importantes.png")));
    }

    
    public void actualizarAct(){
        
       int fila = jTableLectores.getSelectedRow();
       
       int ident= Integer.parseInt(this.jTableLectores.getValueAt(fila,0).toString());
       String tApellidoP = jTableLectores.getValueAt(fila, 1).toString();
       String tApellidoM = jTableLectores.getValueAt(fila, 2).toString();
       String tnombre = jTableLectores.getValueAt(fila, 3).toString();
       String tEdad = jTableLectores.getValueAt(fila, 4).toString();
       String tTelefono = jTableLectores.getValueAt(fila, 5).toString();
       
       
        try {
            
           PreparedStatement modificar = conn.prepareStatement("UPDATE lector SET Apellido_Paterno_Lector = '"+tApellidoP +"',Apellido_Materno_Lector = '"+tApellidoM +"',Nombre_Lector = '"+tnombre +"',Edad_Lector = '"+tEdad+"', Telefono_Lector = '"+tTelefono+"'  WHERE ID_Lector = '"+ident+"' ");            
           modificar.executeUpdate(); 
                 
        } catch (SQLException e) {
            
          JOptionPane.showMessageDialog(null,e+ "No se logró Actualizar el Registro");  
        }
    }
    
   
    
    
    /*public void eliminarlector() throws SQLException{
        int fila = jTableLectores.getSelectedRow();
        String valor = jTableLectores.getValueAt(fila, 0).toString();  
        try {
            PreparedStatement eliminar = conn.prepareStatement("DELETE FROM lector WHERE ID_Curso = '"+valor+"' ");
             eliminar.executeUpdate();           
        }catch(Exception ex ){
            JOptionPane.showMessageDialog(null,ex+ "No se logró el Registro");
        }
    }*/
    
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jTextFieldApellidom = new javax.swing.JTextField();
        jTextFieldID = new javax.swing.JTextField();
        jTextFieldedad = new javax.swing.JTextField();
        jTextFieldnombre = new javax.swing.JTextField();
        jTextFieldcp = new javax.swing.JTextField();
        jTextFieldtelefono = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldcalle = new javax.swing.JTextField();
        jTextFieldnocalle = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextFieldApellidop1 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jTextFieldapellidofam2 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextFieldnombrefam = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTextFieldapellidoFam = new javax.swing.JTextField();
        jTextFieldtelefonofam = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableLectores = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jButtonmodificar = new javax.swing.JButton();
        jButtonmostrar = new javax.swing.JButton();
        jButtonvolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Lector Regular");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(252, 245, 245));

        jPanel2.setBackground(new java.awt.Color(255, 253, 253));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 0)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextFieldApellidom.setBackground(new java.awt.Color(252, 245, 245));
        jTextFieldApellidom.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jTextFieldApellidom.setForeground(new java.awt.Color(102, 0, 0));
        jTextFieldApellidom.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldApellidom.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 0)));
        jPanel2.add(jTextFieldApellidom, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 130, 31));

        jTextFieldID.setBackground(new java.awt.Color(252, 245, 245));
        jTextFieldID.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jTextFieldID.setForeground(new java.awt.Color(102, 0, 0));
        jTextFieldID.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldID.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 0)));
        jPanel2.add(jTextFieldID, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 130, 31));

        jTextFieldedad.setBackground(new java.awt.Color(252, 245, 245));
        jTextFieldedad.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jTextFieldedad.setForeground(new java.awt.Color(102, 0, 0));
        jTextFieldedad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldedad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 0)));
        jTextFieldedad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldedadActionPerformed(evt);
            }
        });
        jPanel2.add(jTextFieldedad, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, 130, 31));

        jTextFieldnombre.setBackground(new java.awt.Color(252, 245, 245));
        jTextFieldnombre.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jTextFieldnombre.setForeground(new java.awt.Color(102, 0, 0));
        jTextFieldnombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldnombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 0)));
        jPanel2.add(jTextFieldnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 130, 31));

        jTextFieldcp.setBackground(new java.awt.Color(252, 245, 245));
        jTextFieldcp.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jTextFieldcp.setForeground(new java.awt.Color(102, 0, 0));
        jTextFieldcp.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldcp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 0)));
        jPanel2.add(jTextFieldcp, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 50, 130, 31));

        jTextFieldtelefono.setBackground(new java.awt.Color(252, 245, 245));
        jTextFieldtelefono.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jTextFieldtelefono.setForeground(new java.awt.Color(102, 0, 0));
        jTextFieldtelefono.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldtelefono.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 0)));
        jPanel2.add(jTextFieldtelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 10, 130, 31));

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 0));
        jLabel1.setText("Identificador (ID)");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 110, 30));

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 0, 0));
        jLabel2.setText("Apellido Materno");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 110, 30));

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 0, 0));
        jLabel3.setText("Nombre");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, 50, 30));

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 0, 0));
        jLabel4.setText("Edad");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, 50, 30));

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 0, 0));
        jLabel5.setText("Teléfono");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, 60, 30));

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 0, 0));
        jLabel6.setText("Codigo Postal");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 50, 90, 30));

        jTextFieldcalle.setBackground(new java.awt.Color(252, 245, 245));
        jTextFieldcalle.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jTextFieldcalle.setForeground(new java.awt.Color(102, 0, 0));
        jTextFieldcalle.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldcalle.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 0)));
        jTextFieldcalle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldcalleActionPerformed(evt);
            }
        });
        jPanel2.add(jTextFieldcalle, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 90, 130, 31));

        jTextFieldnocalle.setBackground(new java.awt.Color(252, 245, 245));
        jTextFieldnocalle.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jTextFieldnocalle.setForeground(new java.awt.Color(102, 0, 0));
        jTextFieldnocalle.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldnocalle.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 0)));
        jPanel2.add(jTextFieldnocalle, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 130, 130, 31));

        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 0, 0));
        jLabel7.setText("Nombre de Calle");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 90, 110, 30));

        jLabel8.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(153, 0, 0));
        jLabel8.setText("Número de calle");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 130, 110, 30));

        jButton1.setBackground(new java.awt.Color(153, 0, 0));
        jButton1.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/user-add-free-icon-font.png"))); // NOI18N
        jButton1.setText("Confirmar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 170, 130, 40));

        jTextFieldApellidop1.setBackground(new java.awt.Color(252, 245, 245));
        jTextFieldApellidop1.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jTextFieldApellidop1.setForeground(new java.awt.Color(102, 0, 0));
        jTextFieldApellidop1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldApellidop1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 0)));
        jPanel2.add(jTextFieldApellidop1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, 130, 31));

        jLabel15.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(153, 0, 0));
        jLabel15.setText("Apellido Paterno");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 110, 30));

        jButton3.setBackground(new java.awt.Color(153, 51, 0));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/broom-free-icon-font.png"))); // NOI18N
        jButton3.setFocusable(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 170, 40, 40));

        jPanel3.setBackground(new java.awt.Color(255, 253, 253));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 0)));

        jTextFieldapellidofam2.setBackground(new java.awt.Color(252, 245, 245));
        jTextFieldapellidofam2.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jTextFieldapellidofam2.setForeground(new java.awt.Color(102, 0, 0));
        jTextFieldapellidofam2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldapellidofam2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 0)));

        jLabel9.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(153, 0, 0));
        jLabel9.setText("Familiar Lector");

        jLabel10.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 0, 0));
        jLabel10.setText("Apellido P.");

        jTextFieldnombrefam.setBackground(new java.awt.Color(252, 245, 245));
        jTextFieldnombrefam.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jTextFieldnombrefam.setForeground(new java.awt.Color(102, 0, 0));
        jTextFieldnombrefam.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldnombrefam.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 0)));

        jLabel11.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 0, 0));
        jLabel11.setText("Nombre");

        jLabel12.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(102, 0, 0));
        jLabel12.setText("Apellido M.");

        jTextFieldapellidoFam.setBackground(new java.awt.Color(252, 245, 245));
        jTextFieldapellidoFam.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jTextFieldapellidoFam.setForeground(new java.awt.Color(102, 0, 0));
        jTextFieldapellidoFam.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldapellidoFam.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 0)));

        jTextFieldtelefonofam.setBackground(new java.awt.Color(252, 245, 245));
        jTextFieldtelefonofam.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jTextFieldtelefonofam.setForeground(new java.awt.Color(102, 0, 0));
        jTextFieldtelefonofam.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldtelefonofam.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 0)));

        jLabel13.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(102, 0, 0));
        jLabel13.setText("Teléfono");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextFieldnombrefam, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                            .addComponent(jTextFieldapellidofam2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldapellidoFam)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldtelefonofam, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldapellidoFam, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldapellidofam2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldnombrefam, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldtelefonofam, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jTableLectores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Apellido P", "Apellido M", "Nombre", "Edad", "Teléfono", "C.P", "Calle", "No. Calle", "Apellido P.F", "Apellido M.F", "Nombre F", "Teléfono F"
            }
        ));
        jScrollPane1.setViewportView(jTableLectores);

        jPanel4.setBackground(new java.awt.Color(255, 253, 253));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 0)));

        jButtonmodificar.setBackground(new java.awt.Color(102, 0, 0));
        jButtonmodificar.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jButtonmodificar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonmodificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/edit-free-icon-font.png"))); // NOI18N
        jButtonmodificar.setText("Modificar Lector");
        jButtonmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonmodificarActionPerformed(evt);
            }
        });

        jButtonmostrar.setBackground(new java.awt.Color(153, 0, 0));
        jButtonmostrar.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jButtonmostrar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonmostrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/eye-free-icon-font.png"))); // NOI18N
        jButtonmostrar.setText("Mostrar Lectores");
        jButtonmostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonmostrarActionPerformed(evt);
            }
        });

        jButtonvolver.setBackground(new java.awt.Color(0, 51, 102));
        jButtonvolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/undo-free-icon-font.png"))); // NOI18N
        jButtonvolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonvolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonvolver, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonmostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonmodificar, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonvolver, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonmodificar)
                        .addComponent(jButtonmostrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 573, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 480));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldcalleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldcalleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldcalleActionPerformed

    private void jButtonmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonmodificarActionPerformed
      
        actualizarAct();
          
    }//GEN-LAST:event_jButtonmodificarActionPerformed

    private void jButtonvolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonvolverActionPerformed
       
        
        JF_usuarios modulovar = new JF_usuarios();      // esta clase permite el cambio de de ventana
        modulovar.setVisible(true);
        this.setVisible(false);
        
        
        
    }//GEN-LAST:event_jButtonvolverActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        

     
        try {
            PreparedStatement pps1 = conn.prepareStatement("INSERT INTO localidad_lector (id_localidad, Codigo_Postal) VALUES(?,?)");
            pps1.setString(1, jTextFieldID.getText());
            pps1.setString(2, jTextFieldcp.getText());           
            pps1.executeUpdate(); 
            
        } catch (SQLException ex) {
            Logger.getLogger(Agregar_Lector.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        try {
            PreparedStatement pps2 = conn.prepareStatement("INSERT INTO direccion_usuarios (id_Direccion, Nombre_Calle, Numero_Calle) VALUES (?,?,?)");
            
            pps2.setString(1, jTextFieldID.getText());
            pps2.setString(2, jTextFieldcalle.getText());
            pps2.setString(3, jTextFieldnocalle.getText());
            
            
            pps2.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Agregar_Lector.class.getName()).log(Level.SEVERE, null, ex);
        }
        
         
        try {
            PreparedStatement pps3;
            pps3 = conn.prepareStatement("INSERT INTO familiar_lector (id_familiar, Apellido_Paterno_familiar, Apellido_Materno_familiar,Nombre_Familiar,Telefono_Familiar) VALUES (?,?,?,?,?)");
                
                pps3.setString(1, jTextFieldID.getText());
                pps3.setString(2, jTextFieldapellidoFam.getText());
                pps3.setString(3, jTextFieldapellidofam2.getText());
                pps3.setString(4, jTextFieldnombrefam.getText());
                pps3.setString(5, jTextFieldtelefonofam.getText());
                
                
                pps3.executeUpdate();
 
        } catch (SQLException ex) {
            Logger.getLogger(Agregar_Lector.class.getName()).log(Level.SEVERE, null, ex);
        }
            
   
        
        
        try {
 
            PreparedStatement pps = conn.prepareStatement("INSERT INTO lector (ID_Lector, Apellido_Paterno_Lector, Apellido_Materno_Lector, Nombre_Lector, Edad_Lector, Telefono_Lector, id_localidad, id_Direccion, id_familiar) VALUES (?,?,?,?,?,?,?,?,?)");
            
                pps.setString(1, jTextFieldID.getText());
                pps.setString(2, jTextFieldApellidop1.getText());
                pps.setString(3, jTextFieldApellidom.getText());
                pps.setString(4, jTextFieldnombre.getText());
                pps.setString(5, jTextFieldedad.getText());
                pps.setString(6, jTextFieldtelefono.getText());
                pps.setString(7, jTextFieldID.getText());
                pps.setString(8, jTextFieldID.getText());
                pps.setString(9, jTextFieldID.getText());
                
                
            
            pps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Datos Guardados");
            
        } catch (SQLException ex) {
            Logger.getLogger(Agregar_Lector.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        String prestamosD = "3";
        String prestamos = "0";
        
        try {
            PreparedStatement pps4 = conn.prepareStatement("INSERT INTO historial (id_lector, prestamos_disponibles, Prestamos_totales) VALUES(?,?)");
            pps4.setString(1, jTextFieldID.getText());
            pps4.setString(2, prestamosD);
            pps4.setString(3, prestamos);           
            pps4.executeUpdate(); 
            
        } catch (SQLException ex) {
            Logger.getLogger(Agregar_Lector.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextFieldedadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldedadActionPerformed

        String condicionXd = jTextFieldedad.getText();
        int condicion = Integer.parseInt(condicionXd);
        
        if(condicion<12){
        
             jTextFieldapellidoFam.setEditable(false);
             jTextFieldapellidofam2.setEditable(false);
             jTextFieldnombrefam.setEditable(false);
             jTextFieldtelefonofam.setEditable(false);
        }
            
    }//GEN-LAST:event_jTextFieldedadActionPerformed

    private void jButtonmostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonmostrarActionPerformed
       
   try{
       Conexion.buscarActividad =false;
        String strSql = "SELECT ID_Lector, Apellido_Paterno_Lector, Apellido_Materno_Lector, Nombre_Lector, Edad_Lector, Telefono_Lector, localidad_lector.Codigo_Postal, direccion_usuarios.Nombre_Calle, direccion_usuarios.Numero_Calle, familiar_lector.Apellido_Paterno_familiar, familiar_lector.Apellido_Materno_familiar, familiar_lector.Nombre_Familiar, familiar_lector.Telefono_Familiar\n" +
                        "FROM lector \n" +
                            "INNER JOIN localidad_lector ON lector.id_localidad = localidad_lector.id_localidad\n" +
                            "INNER JOIN direccion_usuarios ON lector.id_Direccion = direccion_usuarios.id_Direccion\n" +
                            "INNER JOIN familiar_lector ON lector.id_Familiar = familiar_lector.id_familiar";
        Conexion.conectar();
        Conexion.sentencia = Conexion.conn.prepareStatement(strSql);
        ResultSet objRes = Conexion.sentencia.executeQuery(strSql);    
        System.out.println("Consulta Mostrar con exito");
        
        DefaultTableModel modelo = (DefaultTableModel) jTableLectores.getModel();
             
        modelo.setRowCount(0);
        
        Object [] fila = new Object[13];
        while (objRes.next()){
            for (int i=0; i<13 ; i++){
                fila[i]=objRes.getObject(i+1);
                
            }     
            modelo.addRow(fila);
            jTableLectores.setModel(modelo);
            
        }
        
        }catch (SQLException ex) {
            System.out.println(ex);
            
        }  
  
        
    }//GEN-LAST:event_jButtonmostrarActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    
        jTextFieldID.setText("");
        jTextFieldApellidop1.setText("");
        jTextFieldApellidom.setText("");
        jTextFieldnombre.setText("");
        jTextFieldedad.setText("");
        jTextFieldtelefono.setText("");
        jTextFieldcp.setText("");
        jTextFieldcalle.setText("");
        jTextFieldnocalle.setText("");
        jTextFieldapellidoFam.setText("");
        jTextFieldapellidofam2.setText("");
        jTextFieldnombrefam.setText("");
        jTextFieldtelefonofam.setText("");
 
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(Agregar_Lector.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Agregar_Lector.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Agregar_Lector.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Agregar_Lector.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Agregar_Lector().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButtonmodificar;
    private javax.swing.JButton jButtonmostrar;
    private javax.swing.JButton jButtonvolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableLectores;
    private javax.swing.JTextField jTextFieldApellidom;
    private javax.swing.JTextField jTextFieldApellidop1;
    private javax.swing.JTextField jTextFieldID;
    private javax.swing.JTextField jTextFieldapellidoFam;
    private javax.swing.JTextField jTextFieldapellidofam2;
    private javax.swing.JTextField jTextFieldcalle;
    private javax.swing.JTextField jTextFieldcp;
    private javax.swing.JTextField jTextFieldedad;
    private javax.swing.JTextField jTextFieldnocalle;
    private javax.swing.JTextField jTextFieldnombre;
    private javax.swing.JTextField jTextFieldnombrefam;
    private javax.swing.JTextField jTextFieldtelefono;
    private javax.swing.JTextField jTextFieldtelefonofam;
    // End of variables declaration//GEN-END:variables
}
