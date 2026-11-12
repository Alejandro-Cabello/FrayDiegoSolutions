/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package fraydiegosolutions;

import conexionBD.Conexion;
import static conexionBD.Conexion.conectar;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;



/**
 *
 * @author USER
 */
public class JF_acceso extends javax.swing.JFrame {

    /**
     * Creates new form JF_acceso
     */
    public JF_acceso() {
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/imagenes/temas-importantes.png")));
    }
    
    public void ingresar() {
        Connection conn = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        String User = TxtUser.getText();
        String Pass = TxtPass.getText();
        if (User.equals("") || Pass.equals("")) {
            JOptionPane.showMessageDialog(this, "Uno o mas campos estan vacios. Favor de llenarlos.");
        } else {
            try {
                conn = conectar();
                pst = conn.prepareStatement("select username, pass from login where username='" + User
                        + "' and pass ='" + Pass + "'");
                rs = pst.executeQuery();
                if (rs.next()) {
                    this.dispose();
                    new JF_modulo().setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(this, "Credenciales incorrectas. Vuelve a intentar de nuevo.");
                }
            } catch (SQLException e) {
                System.err.print(e.toString());
                JOptionPane.showMessageDialog(this, "Ocurrio un error inesperado.\nFavor comunicarse con el administrador.");
            }
        }
    }
    
    
    
    
    
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        TxtUser = new javax.swing.JTextField();
        Button_Ver = new javax.swing.JButton();
        Button_Ocultar = new javax.swing.JButton();
        TxtPass = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("FrayDiego Solutions");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(246, 233, 225));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TxtUser.setBackground(new java.awt.Color(252, 245, 245));
        TxtUser.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        TxtUser.setForeground(new java.awt.Color(153, 0, 0));
        TxtUser.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtUser.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 0, 0)));
        jPanel1.add(TxtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 240, 40));

        Button_Ver.setBackground(new java.awt.Color(102, 0, 0));
        Button_Ver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/eye-free-icon-font.png"))); // NOI18N
        Button_Ver.setFocusable(false);
        Button_Ver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Button_VerMouseClicked(evt);
            }
        });
        jPanel1.add(Button_Ver, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 190, 40, 40));

        Button_Ocultar.setBackground(new java.awt.Color(102, 0, 0));
        Button_Ocultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ADD1.png"))); // NOI18N
        Button_Ocultar.setFocusable(false);
        Button_Ocultar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Button_OcultarMouseClicked(evt);
            }
        });
        jPanel1.add(Button_Ocultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 190, 40, 40));

        TxtPass.setBackground(new java.awt.Color(252, 245, 245));
        TxtPass.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        TxtPass.setForeground(new java.awt.Color(102, 0, 0));
        TxtPass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtPass.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 0, 0)));
        TxtPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtPassActionPerformed(evt);
            }
        });
        jPanel1.add(TxtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 240, 40));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/libro-abierto mini.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, 40, 70));

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setText("FrayDiego     Solutions ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 400, 60));

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 0, 0));
        jLabel2.setText("Bienvenid@ a la biblioteca Fray Diego De Rodriguez ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 90, 380, 30));

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 51, 0));
        jLabel3.setText("Usuario");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 90, 40));

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 51, 0));
        jLabel4.setText("Clave");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 70, 40));

        jButton1.setBackground(new java.awt.Color(153, 0, 0));
        jButton1.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(252, 245, 245));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/user-free-icon-font.png"))); // NOI18N
        jButton1.setText("Acceder");
        jButton1.setFocusable(false);
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, 290, 40));

        jButton2.setBackground(new java.awt.Color(0, 51, 102));
        jButton2.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(252, 245, 245));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/settings-free-icon-font.png"))); // NOI18N
        jButton2.setFocusable(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 140, 40, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 326, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void TxtPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtPassActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        Modificar_Usuario modificUs = new Modificar_Usuario();
            modificUs.setVisible(true);
            this.setVisible(false); 
                 
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        /*JF_modulo modulovar = new JF_modulo();
            modulovar.setVisible(true);
            this.setVisible(false); */
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void Button_OcultarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_OcultarMouseClicked
        if(MouseEvent.BUTTON1 == evt.getButton()){
            TxtPass.setEchoChar('•');
            Button_Ocultar.setVisible(false);
            Button_Ver.setVisible(true);
        }
    }//GEN-LAST:event_Button_OcultarMouseClicked

    private void Button_VerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_VerMouseClicked
        if(MouseEvent.BUTTON1 == evt.getButton()){
            TxtPass.setEchoChar((char)0);
            Button_Ocultar.setVisible(true);
            Button_Ver.setVisible(false);
        }
    }//GEN-LAST:event_Button_VerMouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        if(MouseEvent.BUTTON1 == evt.getButton()){
            ingresar();
        }
        TxtPass.setText("");
    }//GEN-LAST:event_jButton1MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws UnsupportedLookAndFeelException {
        
         Conexion conexion = new Conexion();
         conexion.conectar();  
         
         
         Color color = new Color (199,118,83);
         UIManager.put("nimbusBase",color);
         UIManager.put("control",new Color(252,245,245));
         UIManager.put("Table.alternateRowColor", new Color(250,232,213));
         
         UIManager.put("nimbusSelectionBackground",new Color(153,51,0));
  
            try {
                    for ( javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {   
                        if ("Nimbus".equals(info.getName())) { 
                                javax.swing.UIManager.setLookAndFeel(info.getClassName());
                           break;
                        }
                   }
            } catch (ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
                    Logger.getLogger(JF_acceso.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        
         
         
         
         
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
            java.util.logging.Logger.getLogger(JF_acceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JF_acceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JF_acceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JF_acceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JF_acceso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button_Ocultar;
    private javax.swing.JButton Button_Ver;
    private javax.swing.JPasswordField TxtPass;
    private javax.swing.JTextField TxtUser;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
