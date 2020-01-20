package view;

import classes.TemaBajo;
import com.inet.jortho.SpellChecker;
import icons.Thinking_uh;
import java.awt.Color;
import static java.awt.event.ActionEvent.CTRL_MASK;
import java.awt.event.KeyEvent;
import javax.swing.BorderFactory;
import javax.swing.InputMap;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.KeyStroke;

/**
 *
 * @author Kevin Casas
 */
public class TemaInvestigacion extends javax.swing.JInternalFrame {

    public TemaInvestigacion() {
        ((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI()).setNorthPane(null);
        initComponents();
        jScrollPane18.getVerticalScrollBar().setUnitIncrement(15);
        guiasantecedentes();
    }

    public void guiasantecedentes() {
//        CorrectorOrtografia p2 = new CorrectorOrtografia("Manifestó...", txtexpprivadoliber1);

        SpellChecker.register(txtcualdelitocometio);
        SpellChecker.register(txtexpprivadoliber);
        SpellChecker.register(txtexpprivadoliber1);

        String textoPreguntas = "¿Cuál es el motivo por el cual usted se encuentra hoy en examen de polígrafo?\n\n"
                + "¿Qué sabe usted de ese hecho?\n\n"
                + "¿Qué hizo usted el día de los hechos?\n\n"
                + "¿Sabe usted con seguridad quien XXXXXX?\n\n"
                + "¿Sospecha usted de alguien que XXXXXX?\n\n"
                + "¿Sabía usted con anterioridad que este XXXXXX iba a suceder?\n\n"
                + "¿Recibió usted alguna propuesta para cometer XXXXXX?\n\n"
                + "¿Se puso usted de acuerdo con alguien para XXXXXX?\n\n"
                + "¿Cuál cree que es el motivo por el cual una persona puede XXXXXX?\n\n"
                + "¿Usted recibió algún beneficio producto de XXXXXX?\n\n"
                + "¿Tuvo usted contacto con XXXXXX?\n\n"
                + "¿Vio usted a alguien XXXXXX?\n\n"
                + "¿Bajo su poder tiene XXXXXX?\n\n"
                + "¿Fue usted quien XXXXXX?\n\n"
                + "¿Participo usted de alguna manera en el XXXXXX?\n\n"
                + "¿Alguien puede afirmar que es usted la persona que XXXXXX?\n\n"
                + "¿Cuál es su hipótesis con relación XXXXXX?";

        jEditorPane1.setText(textoPreguntas);
        jEditorPane1.setBorder(BorderFactory.createLineBorder(Color.white));
    }
    
    public void tomarTemaBajo(){
        TemaBajo.setTemaBajo(jEditorPane1.getText());
    }

    public void limpiar() {
        txtcualdelitocometio.setText("");
        txtexpprivadoliber.setText("");
        txtexpprivadoliber1.setText("");
        txtcbxprocepenal1.setText("");
        
        guiasantecedentes();
    
        chbxbodegueros1.setSelected(false);
        chbxbodegueros2.setSelected(false);
        chbxbodegueros3.setSelected(false);
        chbxbodegueros4.setSelected(false);
        chbxbodegueros8.setSelected(false);
        chbxbodegueros9.setSelected(false);
        
        jScrollPane1.getVerticalScrollBar().setValue(0);
        jScrollPane18.getVerticalScrollBar().setValue(0);
    }

    Thinking_uh iconThinking_uh = new Thinking_uh();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane18 = new javax.swing.JScrollPane();
        jPanel7 = new javax.swing.JPanel();
        jLabel69 = new javax.swing.JLabel();
        txtcualdelitocometio = new javax.swing.JTextField();
        jLabel128 = new javax.swing.JLabel();
        jLabel129 = new javax.swing.JLabel();
        jLabel130 = new javax.swing.JLabel();
        enconpasadojud = new javax.swing.JLabel();
        jLabel132 = new javax.swing.JLabel();
        txtexpprivadoliber = new javax.swing.JTextField();
        txtcbxprocepenal1 = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        txtexpprivadoliber1 = new javax.swing.JTextField();
        jLabel131 = new javax.swing.JLabel();
        chbxbodegueros1 = new javax.swing.JCheckBox();
        chbxbodegueros2 = new javax.swing.JCheckBox();
        chbxbodegueros3 = new javax.swing.JCheckBox();
        chbxbodegueros4 = new javax.swing.JCheckBox();
        chbxbodegueros8 = new javax.swing.JCheckBox();
        chbxbodegueros9 = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(null);
        setPreferredSize(new java.awt.Dimension(975, 550));

        jScrollPane18.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane18.setBorder(null);
        jScrollPane18.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        jLabel69.setFont(new java.awt.Font("Segoe UI Emoji", 1, 16)); // NOI18N
        jLabel69.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel69.setText("TRAYECTORIA DENTRO DE LA EMPRESA ");

        txtcualdelitocometio.setFont(new java.awt.Font("Segoe UI Emoji", 0, 13)); // NOI18N
        txtcualdelitocometio.setBorder(null);
        txtcualdelitocometio.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtcualdelitocometioCaretUpdate(evt);
            }
        });
        txtcualdelitocometio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcualdelitocometioKeyTyped(evt);
            }
        });

        jLabel128.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel128.setText("1. ¿Cuál es su horario laboral? ¿qué días labora?");

        jLabel129.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel129.setText("3. ¿Durante el tiempo que lleva en la empresa ha recibido algún memorando, action form,");

        jLabel130.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel130.setText("descargos, sanciones, suspensiones o llamados de atención verbal? ¿consultó su pasado judicial?");

        enconpasadojud.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        enconpasadojud.setText("4. ¿Cuál es la función principal dentro de su cargo?");

        jLabel132.setFont(new java.awt.Font("Segoe UI Emoji", 1, 16)); // NOI18N
        jLabel132.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel132.setText("TEMA BAJO INVESTIGACIÓN");

        txtexpprivadoliber.setFont(new java.awt.Font("Segoe UI Emoji", 0, 13)); // NOI18N
        txtexpprivadoliber.setBorder(null);
        txtexpprivadoliber.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtexpprivadoliberCaretUpdate(evt);
            }
        });
        txtexpprivadoliber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtexpprivadoliberKeyTyped(evt);
            }
        });

        txtcbxprocepenal1.setFont(new java.awt.Font("Segoe UI Emoji", 0, 13)); // NOI18N
        txtcbxprocepenal1.setBorder(null);
        txtcbxprocepenal1.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtcbxprocepenal1CaretUpdate(evt);
            }
        });
        txtcbxprocepenal1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcbxprocepenal1KeyTyped(evt);
            }
        });

        jLabel34.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel37.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel38.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel41.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtexpprivadoliber1.setFont(new java.awt.Font("Segoe UI Emoji", 0, 13)); // NOI18N
        txtexpprivadoliber1.setBorder(null);
        txtexpprivadoliber1.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtexpprivadoliber1CaretUpdate(evt);
            }
        });
        txtexpprivadoliber1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtexpprivadoliber1KeyTyped(evt);
            }
        });

        jLabel131.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel131.setText("2. ¿Quién es su jefe inmediato?");

        chbxbodegueros1.setBackground(new java.awt.Color(255, 255, 255));
        chbxbodegueros1.setFont(new java.awt.Font("Segoe UI Emoji", 0, 13)); // NOI18N
        chbxbodegueros1.setText("Action Form");
        chbxbodegueros1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chbxbodegueros1ActionPerformed(evt);
            }
        });

        chbxbodegueros2.setBackground(new java.awt.Color(255, 255, 255));
        chbxbodegueros2.setFont(new java.awt.Font("Segoe UI Emoji", 0, 13)); // NOI18N
        chbxbodegueros2.setText("Memorandos");
        chbxbodegueros2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chbxbodegueros2ActionPerformed(evt);
            }
        });

        chbxbodegueros3.setBackground(new java.awt.Color(255, 255, 255));
        chbxbodegueros3.setFont(new java.awt.Font("Segoe UI Emoji", 0, 13)); // NOI18N
        chbxbodegueros3.setText("Descargos");
        chbxbodegueros3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chbxbodegueros3ActionPerformed(evt);
            }
        });

        chbxbodegueros4.setBackground(new java.awt.Color(255, 255, 255));
        chbxbodegueros4.setFont(new java.awt.Font("Segoe UI Emoji", 0, 13)); // NOI18N
        chbxbodegueros4.setText("Llamados de atención verbal");
        chbxbodegueros4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chbxbodegueros4ActionPerformed(evt);
            }
        });

        chbxbodegueros8.setBackground(new java.awt.Color(255, 255, 255));
        chbxbodegueros8.setFont(new java.awt.Font("Segoe UI Emoji", 0, 13)); // NOI18N
        chbxbodegueros8.setText("Sanciones");
        chbxbodegueros8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chbxbodegueros8ActionPerformed(evt);
            }
        });

        chbxbodegueros9.setBackground(new java.awt.Color(255, 255, 255));
        chbxbodegueros9.setFont(new java.awt.Font("Segoe UI Emoji", 0, 13)); // NOI18N
        chbxbodegueros9.setText("Suspensiones");
        chbxbodegueros9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chbxbodegueros9ActionPerformed(evt);
            }
        });

        jEditorPane1.setBorder(null);
        jEditorPane1.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jEditorPane1.setPreferredSize(new java.awt.Dimension(915, 16));
        jScrollPane1.setViewportView(jEditorPane1);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(txtexpprivadoliber1, javax.swing.GroupLayout.PREFERRED_SIZE, 730, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel131)
                                .addGap(55, 55, 55))
                            .addComponent(txtexpprivadoliber, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(30, Short.MAX_VALUE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel69, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel7Layout.createSequentialGroup()
                                    .addComponent(jLabel129)
                                    .addGap(0, 0, Short.MAX_VALUE)))
                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addComponent(jLabel41, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel34, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel37, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel38, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtcualdelitocometio, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 915, Short.MAX_VALUE)
                                .addComponent(txtcbxprocepenal1, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel132, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel128, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 548, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(enconpasadojud, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel7Layout.createSequentialGroup()
                                    .addGap(10, 10, 10)
                                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel7Layout.createSequentialGroup()
                                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(chbxbodegueros1)
                                                .addComponent(chbxbodegueros2))
                                            .addGap(60, 60, 60)
                                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(chbxbodegueros3)
                                                .addComponent(chbxbodegueros4))
                                            .addGap(60, 60, 60)
                                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(chbxbodegueros9)
                                                .addComponent(chbxbodegueros8)))
                                        .addComponent(jLabel130)))))
                        .addGap(30, 30, 30))))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel69)
                .addGap(25, 25, 25)
                .addComponent(jLabel128)
                .addGap(7, 7, 7)
                .addComponent(txtcualdelitocometio, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(jLabel131)
                .addGap(7, 7, 7)
                .addComponent(txtexpprivadoliber, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(jLabel129)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel130)
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chbxbodegueros1)
                    .addComponent(chbxbodegueros3)
                    .addComponent(chbxbodegueros8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chbxbodegueros2)
                    .addComponent(chbxbodegueros4)
                    .addComponent(chbxbodegueros9))
                .addGap(10, 10, 10)
                .addComponent(txtexpprivadoliber1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(enconpasadojud)
                .addGap(7, 7, 7)
                .addComponent(txtcbxprocepenal1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel132)
                .addGap(25, 25, 25)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        jScrollPane18.setViewportView(jPanel7);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 975, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane18, javax.swing.GroupLayout.PREFERRED_SIZE, 975, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 550, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane18, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void chbxbodegueros9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chbxbodegueros9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chbxbodegueros9ActionPerformed

    private void chbxbodegueros8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chbxbodegueros8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chbxbodegueros8ActionPerformed

    private void chbxbodegueros4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chbxbodegueros4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chbxbodegueros4ActionPerformed

    private void chbxbodegueros3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chbxbodegueros3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chbxbodegueros3ActionPerformed

    private void chbxbodegueros2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chbxbodegueros2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chbxbodegueros2ActionPerformed

    private void chbxbodegueros1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chbxbodegueros1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chbxbodegueros1ActionPerformed

    private void txtexpprivadoliber1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtexpprivadoliber1KeyTyped
        int k = (int) evt.getKeyChar();
        if (k == 39) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "¡No se acepta ese tipo de carácter!", "Error de datos ingresados", JOptionPane.ERROR_MESSAGE, iconThinking_uh);
        }
        InputMap map = txtexpprivadoliber1.getInputMap(JTextField.WHEN_FOCUSED);
//        map.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, CTRL_MASK), "null");
    }//GEN-LAST:event_txtexpprivadoliber1KeyTyped

    private void txtexpprivadoliber1CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtexpprivadoliber1CaretUpdate
TemaBajo.setPg3(txtexpprivadoliber1.getText());     
    }//GEN-LAST:event_txtexpprivadoliber1CaretUpdate

    private void txtcbxprocepenal1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcbxprocepenal1KeyTyped
        int k = (int) evt.getKeyChar();
        if (k == 39) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "¡No se acepta ese tipo de carácter!", "Error de datos ingresados", JOptionPane.ERROR_MESSAGE, iconThinking_uh);
        }
        InputMap map = txtcbxprocepenal1.getInputMap(JTextField.WHEN_FOCUSED);
//        map.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, CTRL_MASK), "null");
    }//GEN-LAST:event_txtcbxprocepenal1KeyTyped

    private void txtcbxprocepenal1CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtcbxprocepenal1CaretUpdate
        TemaBajo.setPg4(txtcbxprocepenal1.getText());
    }//GEN-LAST:event_txtcbxprocepenal1CaretUpdate

    private void txtexpprivadoliberKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtexpprivadoliberKeyTyped
        int k = (int) evt.getKeyChar();
        if (k == 39) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "¡No se acepta ese tipo de carácter!", "Error de datos ingresados", JOptionPane.ERROR_MESSAGE, iconThinking_uh);
        }
        InputMap map = txtexpprivadoliber.getInputMap(JTextField.WHEN_FOCUSED);
//        map.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, CTRL_MASK), "null");
    }//GEN-LAST:event_txtexpprivadoliberKeyTyped

    private void txtexpprivadoliberCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtexpprivadoliberCaretUpdate
        TemaBajo.setPg2(txtexpprivadoliber.getText());
    }//GEN-LAST:event_txtexpprivadoliberCaretUpdate

    private void txtcualdelitocometioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcualdelitocometioKeyTyped
        int k = (int) evt.getKeyChar();
        if (k == 39) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "¡No se acepta ese tipo de carácter!", "Error de datos ingresados", JOptionPane.ERROR_MESSAGE, iconThinking_uh);
        }
        InputMap map = txtcualdelitocometio.getInputMap(JTextField.WHEN_FOCUSED);
//        map.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, CTRL_MASK), "null");
    }//GEN-LAST:event_txtcualdelitocometioKeyTyped

    private void txtcualdelitocometioCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtcualdelitocometioCaretUpdate
        TemaBajo.setPg1(txtcualdelitocometio.getText());
    }//GEN-LAST:event_txtcualdelitocometioCaretUpdate


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox chbxbodegueros1;
    private javax.swing.JCheckBox chbxbodegueros2;
    private javax.swing.JCheckBox chbxbodegueros3;
    private javax.swing.JCheckBox chbxbodegueros4;
    private javax.swing.JCheckBox chbxbodegueros8;
    private javax.swing.JCheckBox chbxbodegueros9;
    private javax.swing.JLabel enconpasadojud;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel128;
    private javax.swing.JLabel jLabel129;
    private javax.swing.JLabel jLabel130;
    private javax.swing.JLabel jLabel131;
    private javax.swing.JLabel jLabel132;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane18;
    private javax.swing.JTextField txtcbxprocepenal1;
    private javax.swing.JTextField txtcualdelitocometio;
    private javax.swing.JTextField txtexpprivadoliber;
    private javax.swing.JTextField txtexpprivadoliber1;
    // End of variables declaration//GEN-END:variables
}
