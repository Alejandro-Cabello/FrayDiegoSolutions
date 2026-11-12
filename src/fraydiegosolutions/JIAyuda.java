
package fraydiegosolutions;

import java.awt.Toolkit;

public class JIAyuda extends javax.swing.JFrame {

    public JIAyuda() {
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/imagenes/temas-importantes.png")));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(249, 240, 235));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 0));
        jLabel1.setText("Usabilidad Del Sistema");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 270, 40));

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(252, 245, 245));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("Fray Diego Solutions es una herramienta auxiliar\npara le gestión, organización y agilización de\nactividades de la biblioteca.\n\nMódulo; es el menú principal del sistema y te  permite\nacceder a los menús funcionales:\n\n-  Libros: Para la consulta de materiales bibliográficos,\n   agregación de nuevos libros, eliminación o modificación\n   de los existentes.\n\n-  Entradas: Registro de entradas de visitantes y Lectores\n   Frecuentes de la biblioteca; este menú permite agregar\n   nuevos lectores regulares por identificación.\n\n-  Prestamos: Permite consultar la existencia del material\n   Bibliográficos para su préstamo a lectores regulares y\n   registrar el préstamo con para metros visibles como su\n   fecha y préstamo y devolución.\n\n-  Actividades y Cursos: Permite gestionar a Lectores que\n   toman un curso vacacional, asi mismo permite listar las\n   actividades de los cursos y notas adicionales que el\n   usuario requiera. \n");
        jTextArea1.setBorder(null);
        jTextArea1.setFocusable(false);
        jTextArea1.setSelectionColor(new java.awt.Color(102, 0, 0));
        jScrollPane2.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 370, 180));

        jButton1.setBackground(new java.awt.Color(0, 51, 102));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/undo-free-icon-font.png"))); // NOI18N
        jButton1.setFocusable(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 40, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 267, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        JF_modulo modulovar = new JF_modulo();      // esta clase permite el cambio de de ventana
        modulovar.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JIAyuda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
