package view;

import classes.Conexion;
import classes.DatosPrincipales;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import org.apache.commons.codec.digest.DigestUtils;

/**
 *
 * @author Kevin Casas
 */
public class CambioContraseña extends javax.swing.JFrame {

    Icon M = new ImageIcon(getClass().getResource("/images/pluma.png"));
    Image icon = new ImageIcon(getClass().getResource("/images/pluma.png")).getImage();

    public CambioContraseña() {
        initComponents();
        this.setIconImage(icon);
        this.setLocationRelativeTo(null);
        txtcontra2.setEnabled(false);
        txtcontra3.setEnabled(false);
    }

    public void compconactual() {
        String q = txtcontra1.getText();
        String pas = DigestUtils.md5Hex(q);
        if (pas.equals(DatosPrincipales.getContraUsuario())) {
            txtcontra2.setEnabled(true);
            txtcontra3.setEnabled(true);
            txtcontra2.grabFocus();
            txtcontra1.setEnabled(false);
        } else {
            JOptionPane.showMessageDialog(null, "¡La contraseña ingresada no coincide con la registrada!", "Validación de contraseña", JOptionPane.ERROR_MESSAGE);
            txtcontra1.setText("");
            txtcontra1.grabFocus();
        }
    }

    public void cambiar() {

        String con1, con2, con3;
        String c1, c2, c3;
        con1 = txtcontra1.getText();
        con2 = txtcontra2.getText();
        con3 = txtcontra3.getText();
        c1 = DigestUtils.md5Hex(con1);
        c2 = DigestUtils.md5Hex(con2);
        c3 = DigestUtils.md5Hex(con3);

        if (c2.equals(c3)) {
            if (c1.equals(DatosPrincipales.getContraUsuario())) {
                try {
                    PreparedStatement sql = Conexion.connection.prepareStatement("UPDATE usuarios_polig SET contra = '" + c3 + "' WHERE ccms = " + DatosPrincipales.getCcmsUsuario() + " and rol = '" + DatosPrincipales.getRolUsuario() + "' ");
                    sql.executeUpdate();
                    DatosPrincipales.setContraUsuario(c3);
                    JOptionPane.showMessageDialog(null, "¡Se actualizó la contraseña!");
                    this.dispose();
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, "¡Se produjo un error en el cambio de contraseña!\n La consulta no se ejecutó\n Consulte al equipo de Desarrollo" + e, "Error en el aplicativo", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "¡La contraseña actual no coincide con la registrada!", "Validación de contraseña", JOptionPane.ERROR_MESSAGE);
                txtcontra1.setText("");
            }

        } else {
            JOptionPane.showMessageDialog(null, "¡Las contraseñas ingresadas no coinciden!", "Validación de contraseña", JOptionPane.ERROR_MESSAGE);
            txtcontra3.setText("");
            txtcontra3.grabFocus();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        tituloexamenpre = new javax.swing.JLabel();
        btnsave = new javax.swing.JPanel();
        jLabel51 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel22 = new javax.swing.JPanel();
        jLabel70 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        txtcontra1 = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        txtcontra2 = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        txtcontra3 = new javax.swing.JTextField();

        setTitle("Contraseña");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        tituloexamenpre.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        tituloexamenpre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloexamenpre.setText("Actualización de contraseña");

        btnsave.setBackground(new java.awt.Color(89, 172, 63));
        btnsave.setForeground(new java.awt.Color(255, 255, 255));
        btnsave.setToolTipText("Guardar y finalizar");
        btnsave.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnsave.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnsaveMouseMoved(evt);
            }
        });
        btnsave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnsaveMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnsaveMouseExited(evt);
            }
        });

        jLabel51.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/save.png"))); // NOI18N
        jLabel51.setToolTipText("Guardar y finalizar");
        jLabel51.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel51MouseMoved(evt);
            }
        });
        jLabel51.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel51MouseExited(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Guardar");

        javax.swing.GroupLayout btnsaveLayout = new javax.swing.GroupLayout(btnsave);
        btnsave.setLayout(btnsaveLayout);
        btnsaveLayout.setHorizontalGroup(
            btnsaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnsaveLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel51)
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        btnsaveLayout.setVerticalGroup(
            btnsaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnsaveLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(btnsaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel51)
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel22.setBackground(java.awt.Color.red);
        jPanel22.setForeground(new java.awt.Color(255, 255, 255));
        jPanel22.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel22.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanel22MouseMoved(evt);
            }
        });
        jPanel22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel22MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel22MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel22MouseExited(evt);
            }
        });

        jLabel70.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/multiply.png"))); // NOI18N
        jLabel70.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel70MouseMoved(evt);
            }
        });
        jLabel70.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel70MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel70MouseExited(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Cancelar");
        jLabel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel2MouseMoved(evt);
            }
        });
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel2MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel70)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel70))
                .addContainerGap())
        );

        jLabel3.setFont(new java.awt.Font("Segoe UI Emoji", 0, 16)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Escriba su contraseña actual:");

        jLabel4.setFont(new java.awt.Font("Segoe UI Emoji", 0, 16)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Escriba su contraseña nueva:");

        jLabel5.setFont(new java.awt.Font("Segoe UI Emoji", 0, 16)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Vuelva a escribir su contraseña nueva:");

        jLabel29.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtcontra1.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtcontra1.setBorder(null);
        txtcontra1.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtcontra1CaretUpdate(evt);
            }
        });
        txtcontra1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcontra1ActionPerformed(evt);
            }
        });
        txtcontra1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcontra1KeyTyped(evt);
            }
        });

        jLabel30.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtcontra2.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtcontra2.setBorder(null);
        txtcontra2.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtcontra2CaretUpdate(evt);
            }
        });
        txtcontra2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcontra2KeyTyped(evt);
            }
        });

        jLabel31.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtcontra3.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtcontra3.setBorder(null);
        txtcontra3.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtcontra3CaretUpdate(evt);
            }
        });
        txtcontra3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcontra3ActionPerformed(evt);
            }
        });
        txtcontra3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcontra3KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(btnsave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
            .addComponent(tituloexamenpre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcontra1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcontra2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcontra3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(80, 80, 80))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(tituloexamenpre)
                .addGap(40, 40, 40)
                .addComponent(jLabel3)
                .addGap(10, 10, 10)
                .addComponent(txtcontra1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel4)
                .addGap(10, 10, 10)
                .addComponent(txtcontra2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel5)
                .addGap(10, 10, 10)
                .addComponent(txtcontra3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnsave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel70MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel70MouseMoved
jPanel22.setBackground(Color.decode("#D50000"));
    }//GEN-LAST:event_jLabel70MouseMoved

    private void jLabel70MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel70MouseClicked

    }//GEN-LAST:event_jLabel70MouseClicked

    private void jLabel70MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel70MouseExited
jPanel22.setBackground(Color.red);
    }//GEN-LAST:event_jLabel70MouseExited

    private void jPanel22MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel22MouseMoved
jPanel22.setBackground(Color.decode("#D50000"));
    }//GEN-LAST:event_jPanel22MouseMoved

    private void jPanel22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel22MouseClicked
        txtcontra1.setText("");
        txtcontra2.setText("");
        txtcontra3.setText("");
        txtcontra1.grabFocus();
        this.setVisible(false);
    }//GEN-LAST:event_jPanel22MouseClicked

    private void jPanel22MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel22MouseExited
jPanel22.setBackground(Color.red);
    }//GEN-LAST:event_jPanel22MouseExited

    private void btnsaveMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsaveMouseExited
        btnsave.setBackground(Color.decode("#59AC3F"));
    }//GEN-LAST:event_btnsaveMouseExited

    private void btnsaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsaveMouseClicked
        cambiar();
    }//GEN-LAST:event_btnsaveMouseClicked

    private void btnsaveMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsaveMouseMoved
        btnsave.setBackground(Color.decode("#1B5E20"));
    }//GEN-LAST:event_btnsaveMouseMoved

    private void jLabel51MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel51MouseExited
        btnsave.setBackground(Color.decode("#59AC3F"));
    }//GEN-LAST:event_jLabel51MouseExited

    private void jLabel51MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel51MouseMoved
        btnsave.setBackground(Color.decode("#1B5E20"));
    }//GEN-LAST:event_jLabel51MouseMoved

    private void jPanel22MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel22MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel22MouseEntered

    private void txtcontra1CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtcontra1CaretUpdate

    }//GEN-LAST:event_txtcontra1CaretUpdate

    private void txtcontra1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcontra1KeyTyped

    }//GEN-LAST:event_txtcontra1KeyTyped

    private void txtcontra2CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtcontra2CaretUpdate
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcontra2CaretUpdate

    private void txtcontra2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcontra2KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcontra2KeyTyped

    private void txtcontra3CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtcontra3CaretUpdate
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcontra3CaretUpdate

    private void txtcontra3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcontra3KeyTyped
        
    }//GEN-LAST:event_txtcontra3KeyTyped

    private void txtcontra1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcontra1ActionPerformed
        evt.setSource((char) KeyEvent.VK_CLEAR);
        compconactual();
    }//GEN-LAST:event_txtcontra1ActionPerformed

    private void txtcontra3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcontra3ActionPerformed
        evt.setSource((char) KeyEvent.VK_CLEAR);
        cambiar();
    }//GEN-LAST:event_txtcontra3ActionPerformed

    private void jLabel2MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseMoved
       jPanel22.setBackground(Color.decode("#D50000"));
    }//GEN-LAST:event_jLabel2MouseMoved

    private void jLabel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseExited
      jPanel22.setBackground(Color.red);
    }//GEN-LAST:event_jLabel2MouseExited

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
            java.util.logging.Logger.getLogger(CambioContraseña.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CambioContraseña.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CambioContraseña.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CambioContraseña.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CambioContraseña().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JPanel btnsave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JLabel tituloexamenpre;
    public static javax.swing.JTextField txtcontra1;
    public static javax.swing.JTextField txtcontra2;
    public static javax.swing.JTextField txtcontra3;
    // End of variables declaration//GEN-END:variables
}
