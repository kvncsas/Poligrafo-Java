package view;

import java.awt.Color;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author Kevin Casas
 */
public class AcercaDe extends javax.swing.JFrame {

    Icon M = new ImageIcon(getClass().getResource("/images/pluma.png"));
    Image icon = new ImageIcon(getClass().getResource("/images/pluma.png")).getImage();

    public AcercaDe() {
        initComponents();
        this.setIconImage(icon);
        this.setLocationRelativeTo(null);
    }

    public void goToURL(String URL) {
        if (java.awt.Desktop.isDesktopSupported()) {
            java.awt.Desktop desktop = java.awt.Desktop.getDesktop();
            if (desktop.isSupported(java.awt.Desktop.Action.BROWSE)) {
                try {
                    java.net.URI uri = new java.net.URI(URL);
                    desktop.browse(uri);
                } catch (Exception e) {
                }
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        tituloexamenpre = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnsave = new javax.swing.JPanel();
        jLabel51 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setTitle("Acerca de Poligrafía Teleperformance");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        tituloexamenpre.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        tituloexamenpre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloexamenpre.setText("Poligrafía Teleperformance 1.0");

        jLabel3.setFont(new java.awt.Font("Segoe UI Emoji", 0, 16)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Desarrollado por Kevin Fajardo Casas");

        jLabel4.setFont(new java.awt.Font("Segoe UI Emoji", 0, 16)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("del equipo de HR Analytics 2019.");

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/nerd.png"))); // NOI18N

        btnsave.setBackground(new java.awt.Color(255, 102, 0));
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

        jLabel51.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/man-thinking-about-love.png"))); // NOI18N
        jLabel51.setToolTipText("Guardar y finalizar");
        jLabel51.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel51MouseMoved(evt);
            }
        });
        jLabel51.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel51MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel51MouseExited(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Contactar");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnsaveLayout = new javax.swing.GroupLayout(btnsave);
        btnsave.setLayout(btnsaveLayout);
        btnsaveLayout.setHorizontalGroup(
            btnsaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnsaveLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel51)
                .addGap(7, 7, 7)
                .addComponent(jLabel2)
                .addGap(10, 10, 10))
        );
        btnsaveLayout.setVerticalGroup(
            btnsaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnsaveLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(btnsaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel51)
                    .addComponent(jLabel2))
                .addGap(7, 7, 7))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(tituloexamenpre, javax.swing.GroupLayout.DEFAULT_SIZE, 429, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnsave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(158, 158, 158))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(tituloexamenpre)
                .addGap(35, 35, 35)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(20, 20, 20)
                .addComponent(btnsave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel51MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel51MouseMoved
//        btnsave.setBackground(Color.decode("#1B5E20"));
    }//GEN-LAST:event_jLabel51MouseMoved

    private void jLabel51MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel51MouseExited
//        btnsave.setBackground(Color.decode("#59AC3F"));
    }//GEN-LAST:event_jLabel51MouseExited

    private void btnsaveMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsaveMouseMoved
//        btnsave.setBackground(Color.decode("#1B5E20"));
    }//GEN-LAST:event_btnsaveMouseMoved

    private void btnsaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsaveMouseClicked
        goToURL("https://www.linkedin.com/in/kvncsas/");
    }//GEN-LAST:event_btnsaveMouseClicked

    private void btnsaveMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsaveMouseExited
//        btnsave.setBackground(Color.decode("#59AC3F"));
    }//GEN-LAST:event_btnsaveMouseExited

    private void jLabel51MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel51MouseClicked
        goToURL("https://www.linkedin.com/in/kvncsas/");
    }//GEN-LAST:event_jLabel51MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        goToURL("https://www.linkedin.com/in/kvncsas/");
    }//GEN-LAST:event_jLabel2MouseClicked

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
            java.util.logging.Logger.getLogger(AcercaDe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AcercaDe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AcercaDe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AcercaDe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AcercaDe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnsave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel tituloexamenpre;
    // End of variables declaration//GEN-END:variables
}
