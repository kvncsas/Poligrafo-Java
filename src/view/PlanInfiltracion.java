package view;

import classes.Admisiones;
import classes.PlanesInfiltracion;
import com.inet.jortho.SpellChecker;
import icons.Thinking_uh;
import static java.awt.event.ActionEvent.CTRL_MASK;
import java.awt.event.KeyEvent;
import javax.swing.InputMap;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.KeyStroke;

/**
 *
 * @author Kevin Casas
 */
public class PlanInfiltracion extends javax.swing.JInternalFrame {

    public PlanInfiltracion() {
        ((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI()).setNorthPane(null);
        initComponents();

        //datos_generales.fechaderecha.setVisible(false);
        novisiblesplanes();
        guiasplanes_infil();
    }

    public void novisiblesplanes() {
        jLabel32.setVisible(false);
        txtestaaplicandoinf.setVisible(false);
        txtestaaplicandoinf1.setVisible(false);
        jLabel33.setVisible(false);
        txtestaaplicandoinf2.setVisible(false);
        jLabel34.setVisible(false);
        txtestaaplicandoinf3.setVisible(false);
        jLabel35.setVisible(false);
        txtestaaplicandoinf.setVisible(false);
        jLabel32.setVisible(false);
        txtestaaplicandoinf4.setVisible(false);
        jLabel36.setVisible(false);
    }

    public void guiasplanes_infil() {
        CorrectorOrtografia p = new CorrectorOrtografia("Manifestó...", txtestaaplicandoinf1);
        CorrectorOrtografia p1 = new CorrectorOrtografia("Expresó...", txtestaaplicandoinf2);
        CorrectorOrtografia p2 = new CorrectorOrtografia("Sostuvo...", txtestaaplicandoinf3);
        CorrectorOrtografia p3 = new CorrectorOrtografia("Dijo estar aplicando...", txtestaaplicandoinf);
        SpellChecker.register(txtestaaplicandoinf);
    }

    public void limpiar() {
        jCheckBox29.setSelected(false);
        jCheckBox30.setSelected(false);
        jCheckBox31.setSelected(false);
        jCheckBox32.setSelected(false);
        jCheckBox33.setSelected(false);
        jCheckBox34.setSelected(false);
        jCheckBox35.setSelected(false);
        jCheckBox36.setSelected(false);
        jCheckBox37.setSelected(false);
        jCheckBox38.setSelected(false);
        
        txtestaaplicandoinf.setText("");
        txtestaaplicandoinf1.setText("");
        txtestaaplicandoinf2.setText("");
        txtestaaplicandoinf3.setText("");
        txtestaaplicandoinf4.setText("");
        
        chbxradiowtf.setSelected(false);
        chbxamigosva.setSelected(false);
        chbxfamiliaresva.setSelected(false);
        chbxinternetva.setSelected(false);
        chbxreferidova.setSelected(false);
        chbxredessociales.setSelected(false);
        chbxferias.setSelected(false);
        chbxbolsas.setSelected(false);
        
        
    }

    Thinking_uh iconThinking_uh = new Thinking_uh();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel12 = new javax.swing.JPanel();
        comoseentero = new javax.swing.JLabel();
        chbxradiowtf = new javax.swing.JCheckBox();
        chbxamigosva = new javax.swing.JCheckBox();
        chbxredessociales = new javax.swing.JCheckBox();
        chbxfamiliaresva = new javax.swing.JCheckBox();
        chbxferias = new javax.swing.JCheckBox();
        chbxinternetva = new javax.swing.JCheckBox();
        chbxreferidova = new javax.swing.JCheckBox();
        estaaplicandoinf = new javax.swing.JLabel();
        chbxbolsas = new javax.swing.JCheckBox();
        jLabel32 = new javax.swing.JLabel();
        txtestaaplicandoinf = new javax.swing.JTextField();
        jCheckBox30 = new javax.swing.JCheckBox();
        jCheckBox29 = new javax.swing.JCheckBox();
        estaaplicandoinf1 = new javax.swing.JLabel();
        jCheckBox31 = new javax.swing.JCheckBox();
        jCheckBox32 = new javax.swing.JCheckBox();
        jLabel33 = new javax.swing.JLabel();
        txtestaaplicandoinf1 = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        txtestaaplicandoinf2 = new javax.swing.JTextField();
        estaaplicandoinf2 = new javax.swing.JLabel();
        jCheckBox33 = new javax.swing.JCheckBox();
        jCheckBox34 = new javax.swing.JCheckBox();
        jLabel35 = new javax.swing.JLabel();
        txtestaaplicandoinf3 = new javax.swing.JTextField();
        estaaplicandoinf3 = new javax.swing.JLabel();
        jCheckBox35 = new javax.swing.JCheckBox();
        jCheckBox36 = new javax.swing.JCheckBox();
        jLabel36 = new javax.swing.JLabel();
        txtestaaplicandoinf4 = new javax.swing.JTextField();
        estaaplicandoinf4 = new javax.swing.JLabel();
        jCheckBox37 = new javax.swing.JCheckBox();
        jCheckBox38 = new javax.swing.JCheckBox();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(null);
        setPreferredSize(new java.awt.Dimension(975, 550));

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.setPreferredSize(new java.awt.Dimension(975, 550));
        jPanel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel12MouseClicked(evt);
            }
        });

        comoseentero.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        comoseentero.setText("¿Cómo se enteró de la vacante?");

        chbxradiowtf.setBackground(new java.awt.Color(255, 255, 255));
        chbxradiowtf.setFont(new java.awt.Font("Segoe UI Emoji", 0, 13)); // NOI18N
        chbxradiowtf.setText("Emisora de radio");
        chbxradiowtf.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chbxradiowtfItemStateChanged(evt);
            }
        });

        chbxamigosva.setBackground(new java.awt.Color(255, 255, 255));
        chbxamigosva.setFont(new java.awt.Font("Segoe UI Emoji", 0, 13)); // NOI18N
        chbxamigosva.setText("Amigos");
        chbxamigosva.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chbxamigosvaItemStateChanged(evt);
            }
        });

        chbxredessociales.setBackground(new java.awt.Color(255, 255, 255));
        chbxredessociales.setFont(new java.awt.Font("Segoe UI Emoji", 0, 13)); // NOI18N
        chbxredessociales.setText("Redes sociales");
        chbxredessociales.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chbxredessocialesItemStateChanged(evt);
            }
        });

        chbxfamiliaresva.setBackground(new java.awt.Color(255, 255, 255));
        chbxfamiliaresva.setFont(new java.awt.Font("Segoe UI Emoji", 0, 13)); // NOI18N
        chbxfamiliaresva.setText("Familiares");
        chbxfamiliaresva.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chbxfamiliaresvaItemStateChanged(evt);
            }
        });

        chbxferias.setBackground(new java.awt.Color(255, 255, 255));
        chbxferias.setFont(new java.awt.Font("Segoe UI Emoji", 0, 13)); // NOI18N
        chbxferias.setText("Ferias");
        chbxferias.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chbxferiasItemStateChanged(evt);
            }
        });

        chbxinternetva.setBackground(new java.awt.Color(255, 255, 255));
        chbxinternetva.setFont(new java.awt.Font("Segoe UI Emoji", 0, 13)); // NOI18N
        chbxinternetva.setText("Página de Internet TP");
        chbxinternetva.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chbxinternetvaItemStateChanged(evt);
            }
        });

        chbxreferidova.setBackground(new java.awt.Color(255, 255, 255));
        chbxreferidova.setFont(new java.awt.Font("Segoe UI Emoji", 0, 13)); // NOI18N
        chbxreferidova.setText("Referido por alguien de TP");
        chbxreferidova.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chbxreferidovaItemStateChanged(evt);
            }
        });

        estaaplicandoinf.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        estaaplicandoinf.setText("¿Planeó usted ingresar a Teleperformance para cometer algún acto ilícito o fraude?");

        chbxbolsas.setBackground(new java.awt.Color(255, 255, 255));
        chbxbolsas.setFont(new java.awt.Font("Segoe UI Emoji", 0, 13)); // NOI18N
        chbxbolsas.setText("Bolsas de empleo");
        chbxbolsas.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chbxbolsasItemStateChanged(evt);
            }
        });

        jLabel32.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtestaaplicandoinf.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtestaaplicandoinf.setBorder(null);
        txtestaaplicandoinf.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtestaaplicandoinfCaretUpdate(evt);
            }
        });
        txtestaaplicandoinf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtestaaplicandoinfActionPerformed(evt);
            }
        });
        txtestaaplicandoinf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtestaaplicandoinfKeyTyped(evt);
            }
        });

        jCheckBox30.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox30.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jCheckBox30.setText("Sí");
        jCheckBox30.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox30ItemStateChanged(evt);
            }
        });

        jCheckBox29.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox29.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jCheckBox29.setText("No");
        jCheckBox29.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox29ItemStateChanged(evt);
            }
        });

        estaaplicandoinf1.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        estaaplicandoinf1.setText("¿Recibió usted alguna propuesta para sacar bases de datos o información confidencial de Teleperformance?");

        jCheckBox31.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox31.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jCheckBox31.setText("Sí");
        jCheckBox31.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox31ItemStateChanged(evt);
            }
        });

        jCheckBox32.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox32.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jCheckBox32.setText("No");
        jCheckBox32.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox32ItemStateChanged(evt);
            }
        });

        jLabel33.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtestaaplicandoinf1.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtestaaplicandoinf1.setBorder(null);
        txtestaaplicandoinf1.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtestaaplicandoinf1CaretUpdate(evt);
            }
        });
        txtestaaplicandoinf1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtestaaplicandoinf1ActionPerformed(evt);
            }
        });
        txtestaaplicandoinf1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtestaaplicandoinf1KeyTyped(evt);
            }
        });

        jLabel34.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtestaaplicandoinf2.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtestaaplicandoinf2.setBorder(null);
        txtestaaplicandoinf2.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtestaaplicandoinf2CaretUpdate(evt);
            }
        });
        txtestaaplicandoinf2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtestaaplicandoinf2ActionPerformed(evt);
            }
        });
        txtestaaplicandoinf2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtestaaplicandoinf2KeyTyped(evt);
            }
        });

        estaaplicandoinf2.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        estaaplicandoinf2.setText("¿Recibió usted alguna propuesta para cometer algún fraude en contra de Teleperformance?");

        jCheckBox33.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox33.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jCheckBox33.setText("Sí");
        jCheckBox33.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox33ItemStateChanged(evt);
            }
        });

        jCheckBox34.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox34.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jCheckBox34.setText("No");
        jCheckBox34.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox34ItemStateChanged(evt);
            }
        });

        jLabel35.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtestaaplicandoinf3.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtestaaplicandoinf3.setBorder(null);
        txtestaaplicandoinf3.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtestaaplicandoinf3CaretUpdate(evt);
            }
        });
        txtestaaplicandoinf3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtestaaplicandoinf3ActionPerformed(evt);
            }
        });
        txtestaaplicandoinf3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtestaaplicandoinf3KeyTyped(evt);
            }
        });

        estaaplicandoinf3.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        estaaplicandoinf3.setText("¿Se puso usted de acuerdo con alguien para cometer algún ilícito o fraude en Teleperformance?");

        jCheckBox35.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox35.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jCheckBox35.setText("Sí");
        jCheckBox35.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox35ItemStateChanged(evt);
            }
        });

        jCheckBox36.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox36.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jCheckBox36.setText("No");
        jCheckBox36.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox36ItemStateChanged(evt);
            }
        });

        jLabel36.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtestaaplicandoinf4.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtestaaplicandoinf4.setBorder(null);
        txtestaaplicandoinf4.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtestaaplicandoinf4CaretUpdate(evt);
            }
        });
        txtestaaplicandoinf4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtestaaplicandoinf4ActionPerformed(evt);
            }
        });
        txtestaaplicandoinf4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtestaaplicandoinf4KeyTyped(evt);
            }
        });

        estaaplicandoinf4.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        estaaplicandoinf4.setText("¿Existe alguna admisión relevante en este tema?");

        jCheckBox37.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox37.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jCheckBox37.setText("Sí");
        jCheckBox37.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox37ItemStateChanged(evt);
            }
        });

        jCheckBox38.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox38.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jCheckBox38.setText("No");
        jCheckBox38.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox38ItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel12Layout.createSequentialGroup()
                            .addComponent(estaaplicandoinf1)
                            .addGap(153, 153, 153)
                            .addComponent(jCheckBox31, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jCheckBox32, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(txtestaaplicandoinf1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel12Layout.createSequentialGroup()
                            .addComponent(estaaplicandoinf2)
                            .addGap(249, 249, 249)
                            .addComponent(jCheckBox33, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jCheckBox34, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(txtestaaplicandoinf2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel12Layout.createSequentialGroup()
                            .addComponent(estaaplicandoinf3)
                            .addGap(224, 224, 224)
                            .addComponent(jCheckBox35, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jCheckBox36, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtestaaplicandoinf3, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel35, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chbxradiowtf)
                            .addComponent(chbxamigosva)
                            .addComponent(chbxfamiliaresva)
                            .addComponent(chbxinternetva))
                        .addGap(133, 133, 133)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chbxferias)
                            .addComponent(chbxredessociales)
                            .addComponent(chbxreferidova)
                            .addComponent(chbxbolsas)))
                    .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel12Layout.createSequentialGroup()
                            .addComponent(estaaplicandoinf4)
                            .addGap(512, 512, 512)
                            .addComponent(jCheckBox37, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jCheckBox38, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtestaaplicandoinf4, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel36, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(comoseentero)
                    .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel12Layout.createSequentialGroup()
                            .addComponent(estaaplicandoinf)
                            .addGap(302, 302, 302)
                            .addComponent(jCheckBox30, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jCheckBox29, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtestaaplicandoinf, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel32, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(30, 30, 30))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox31, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox32, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(estaaplicandoinf1))
                .addGap(7, 7, 7)
                .addComponent(txtestaaplicandoinf1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox33, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox34, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(estaaplicandoinf2))
                .addGap(7, 7, 7)
                .addComponent(txtestaaplicandoinf2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox35, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox36, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(estaaplicandoinf3))
                .addGap(7, 7, 7)
                .addComponent(txtestaaplicandoinf3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox30, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox29, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(estaaplicandoinf))
                .addGap(7, 7, 7)
                .addComponent(txtestaaplicandoinf, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(comoseentero)
                .addGap(7, 7, 7)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chbxreferidova)
                    .addComponent(chbxradiowtf))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chbxamigosva)
                    .addComponent(chbxredessociales))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chbxfamiliaresva)
                    .addComponent(chbxferias))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chbxinternetva)
                    .addComponent(chbxbolsas))
                .addGap(15, 15, 15)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox37, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox38, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(estaaplicandoinf4))
                .addGap(7, 7, 7)
                .addComponent(txtestaaplicandoinf4, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 975, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 550, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel12MouseClicked

    }//GEN-LAST:event_jPanel12MouseClicked

    private void chbxradiowtfItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chbxradiowtfItemStateChanged
        if (chbxradiowtf.isSelected()) {
            chbxamigosva.setSelected(false);
            chbxfamiliaresva.setSelected(false);
            chbxinternetva.setSelected(false);
            chbxreferidova.setSelected(false);
            chbxredessociales.setSelected(false);
            chbxferias.setSelected(false);
            chbxbolsas.setSelected(false);
            PlanesInfiltracion.setComoseentero("Radio");
        } else {
            PlanesInfiltracion.setComoseentero("-");
        }

        
    }//GEN-LAST:event_chbxradiowtfItemStateChanged

    private void chbxamigosvaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chbxamigosvaItemStateChanged
        if (chbxamigosva.isSelected()) {
            chbxradiowtf.setSelected(false);
            chbxfamiliaresva.setSelected(false);
            chbxinternetva.setSelected(false);
            chbxreferidova.setSelected(false);
            chbxredessociales.setSelected(false);
            chbxferias.setSelected(false);
            chbxbolsas.setSelected(false);
            PlanesInfiltracion.setComoseentero("Amigos");
        } else {
            PlanesInfiltracion.setComoseentero("-");
        }
        
    }//GEN-LAST:event_chbxamigosvaItemStateChanged

    private void chbxfamiliaresvaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chbxfamiliaresvaItemStateChanged
        if (chbxfamiliaresva.isSelected()) {
            chbxradiowtf.setSelected(false);
            chbxamigosva.setSelected(false);
            chbxinternetva.setSelected(false);
            chbxreferidova.setSelected(false);
            chbxredessociales.setSelected(false);
            chbxferias.setSelected(false);
            chbxbolsas.setSelected(false);
            PlanesInfiltracion.setComoseentero("Familiares");
        } else {
            PlanesInfiltracion.setComoseentero("-");
        }
        
    }//GEN-LAST:event_chbxfamiliaresvaItemStateChanged

    private void chbxinternetvaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chbxinternetvaItemStateChanged
        if (chbxinternetva.isSelected()) {
            chbxradiowtf.setSelected(false);
            chbxamigosva.setSelected(false);
            chbxfamiliaresva.setSelected(false);
            chbxreferidova.setSelected(false);
            chbxredessociales.setSelected(false);
            chbxferias.setSelected(false);
            chbxbolsas.setSelected(false);
            PlanesInfiltracion.setComoseentero("Página de internet");
        } else {
            PlanesInfiltracion.setComoseentero("-");
        }
        
    }//GEN-LAST:event_chbxinternetvaItemStateChanged

    private void chbxreferidovaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chbxreferidovaItemStateChanged
        if (chbxreferidova.isSelected()) {
            chbxradiowtf.setSelected(false);
            chbxamigosva.setSelected(false);
            chbxfamiliaresva.setSelected(false);
            chbxinternetva.setSelected(false);
            chbxredessociales.setSelected(false);
            chbxferias.setSelected(false);
            chbxbolsas.setSelected(false);
            PlanesInfiltracion.setComoseentero("Referido alguien TP");
        } else {
            PlanesInfiltracion.setComoseentero("-");
        }
        
    }//GEN-LAST:event_chbxreferidovaItemStateChanged

    private void chbxredessocialesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chbxredessocialesItemStateChanged
        if (chbxredessociales.isSelected()) {
            chbxradiowtf.setSelected(false);
            chbxamigosva.setSelected(false);
            chbxfamiliaresva.setSelected(false);
            chbxinternetva.setSelected(false);
            chbxreferidova.setSelected(false);
            chbxferias.setSelected(false);
            chbxbolsas.setSelected(false);
            PlanesInfiltracion.setComoseentero("Redes sociales");
        } else {
            PlanesInfiltracion.setComoseentero("-");
        }
        
    }//GEN-LAST:event_chbxredessocialesItemStateChanged

    private void chbxferiasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chbxferiasItemStateChanged
        if (chbxferias.isSelected()) {
            chbxradiowtf.setSelected(false);
            chbxamigosva.setSelected(false);
            chbxfamiliaresva.setSelected(false);
            chbxinternetva.setSelected(false);
            chbxredessociales.setSelected(false);
            chbxreferidova.setSelected(false);
            chbxbolsas.setSelected(false);
            PlanesInfiltracion.setComoseentero("Ferias");
        } else {
            PlanesInfiltracion.setComoseentero("-");
        }
        
    }//GEN-LAST:event_chbxferiasItemStateChanged

    private void chbxbolsasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chbxbolsasItemStateChanged
        if (chbxbolsas.isSelected()) {
            chbxradiowtf.setSelected(false);
            chbxamigosva.setSelected(false);
            chbxfamiliaresva.setSelected(false);
            chbxinternetva.setSelected(false);
            chbxredessociales.setSelected(false);
            chbxferias.setSelected(false);
            chbxreferidova.setSelected(false);
            PlanesInfiltracion.setComoseentero("Bolsas de empleo");
        } else {
            PlanesInfiltracion.setComoseentero("-");
        }
        
    }//GEN-LAST:event_chbxbolsasItemStateChanged

    private void txtestaaplicandoinfCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtestaaplicandoinfCaretUpdate
        PlanesInfiltracion.setExpplaninfilpre4(txtestaaplicandoinf.getText());
    }//GEN-LAST:event_txtestaaplicandoinfCaretUpdate

    private void txtestaaplicandoinfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtestaaplicandoinfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtestaaplicandoinfActionPerformed

    private void jCheckBox30ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox30ItemStateChanged
        if (jCheckBox30.isSelected()) {
            jCheckBox29.setSelected(false);
            txtestaaplicandoinf.setVisible(true);
            jLabel32.setVisible(true);
            PlanesInfiltracion.setPlaninfilpre4("Sí");
            Admisiones.setAdmPI4("nohay");
        } else {
            PlanesInfiltracion.setPlaninfilpre4("-");
            Admisiones.setAdmPI4("nohay");
            txtestaaplicandoinf.setVisible(false);
            jLabel32.setVisible(false);
        }
    }//GEN-LAST:event_jCheckBox30ItemStateChanged

    private void jCheckBox29ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox29ItemStateChanged
        if (jCheckBox29.isSelected()) {
            jCheckBox30.setSelected(false);
            jLabel32.setVisible(false);
            txtestaaplicandoinf.setVisible(false);
           PlanesInfiltracion.setPlaninfilpre4("No");
           Admisiones.setAdmPI4("nohay");
        } else {
            jLabel32.setVisible(false);
            txtestaaplicandoinf.setVisible(false);
            PlanesInfiltracion.setPlaninfilpre4("-");
            Admisiones.setAdmPI4("nohay");
        }
    }//GEN-LAST:event_jCheckBox29ItemStateChanged

    private void jCheckBox31ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox31ItemStateChanged
        if (jCheckBox31.isSelected()) {
            jCheckBox32.setSelected(false);
            jLabel33.setVisible(true);
            txtestaaplicandoinf1.setVisible(true);
            PlanesInfiltracion.setPlaninfilpre1("Sí");
            Admisiones.setAdmPI1("hay");
        } else {
            jLabel33.setVisible(false);
            txtestaaplicandoinf1.setVisible(false);
            PlanesInfiltracion.setPlaninfilpre1("-");
            Admisiones.setAdmPI1("nohay");
        }
    }//GEN-LAST:event_jCheckBox31ItemStateChanged

    private void jCheckBox32ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox32ItemStateChanged
        if (jCheckBox32.isSelected()) {
            jCheckBox31.setSelected(false);
            jLabel33.setVisible(false);
            txtestaaplicandoinf1.setVisible(false);
           PlanesInfiltracion.setPlaninfilpre1("No");
           Admisiones.setAdmPI1("nohay");
        } else {
            jLabel33.setVisible(false);
            txtestaaplicandoinf1.setVisible(false);
            PlanesInfiltracion.setPlaninfilpre1("-");
            Admisiones.setAdmPI1("nohay");
        }
    }//GEN-LAST:event_jCheckBox32ItemStateChanged

    private void txtestaaplicandoinf1CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtestaaplicandoinf1CaretUpdate
        PlanesInfiltracion.setExpplaninfilpre1(txtestaaplicandoinf1.getText());
    }//GEN-LAST:event_txtestaaplicandoinf1CaretUpdate

    private void txtestaaplicandoinf1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtestaaplicandoinf1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtestaaplicandoinf1ActionPerformed

    private void txtestaaplicandoinf2CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtestaaplicandoinf2CaretUpdate
        PlanesInfiltracion.setExpplaninfilpre2(txtestaaplicandoinf2.getText());
    }//GEN-LAST:event_txtestaaplicandoinf2CaretUpdate

    private void txtestaaplicandoinf2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtestaaplicandoinf2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtestaaplicandoinf2ActionPerformed

    private void jCheckBox33ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox33ItemStateChanged
        if (jCheckBox33.isSelected()) {
            jCheckBox34.setSelected(false);
            jLabel34.setVisible(true);
            txtestaaplicandoinf2.setVisible(true);
            PlanesInfiltracion.setPlaninfilpre2("Sí");
            Admisiones.setAdmPI2("hay");
        } else {
            jLabel34.setVisible(false);
            txtestaaplicandoinf2.setVisible(false);
            PlanesInfiltracion.setPlaninfilpre2("-");
            Admisiones.setAdmPI2("nohay");
        }
    }//GEN-LAST:event_jCheckBox33ItemStateChanged

    private void jCheckBox34ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox34ItemStateChanged
        if (jCheckBox34.isSelected()) {
            jCheckBox33.setSelected(false);
            jLabel34.setVisible(false);
            txtestaaplicandoinf2.setVisible(false);
            PlanesInfiltracion.setPlaninfilpre2("No");
            Admisiones.setAdmPI2("nohay");
        } else {
            jLabel34.setVisible(false);
            txtestaaplicandoinf2.setVisible(false);
            PlanesInfiltracion.setPlaninfilpre2("-");
            Admisiones.setAdmPI2("nohay");
        }
    }//GEN-LAST:event_jCheckBox34ItemStateChanged

    private void txtestaaplicandoinf3CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtestaaplicandoinf3CaretUpdate
        PlanesInfiltracion.setExpplaninfilpre3(txtestaaplicandoinf3.getText());
    }//GEN-LAST:event_txtestaaplicandoinf3CaretUpdate

    private void txtestaaplicandoinf3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtestaaplicandoinf3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtestaaplicandoinf3ActionPerformed

    private void jCheckBox35ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox35ItemStateChanged
        if (jCheckBox35.isSelected()) {
            jCheckBox36.setSelected(false);
            jLabel35.setVisible(true);
            txtestaaplicandoinf3.setVisible(true);
            PlanesInfiltracion.setPlaninfilpre3("Sí");
            Admisiones.setAdmPI3("hay");
        } else {
            jLabel35.setVisible(false);
            txtestaaplicandoinf3.setVisible(false);
            PlanesInfiltracion.setPlaninfilpre3("-");
            Admisiones.setAdmPI3("nohay");
        }
    }//GEN-LAST:event_jCheckBox35ItemStateChanged

    private void jCheckBox36ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox36ItemStateChanged
        if (jCheckBox36.isSelected()) {
            jCheckBox35.setSelected(false);
            jLabel35.setVisible(false);
            txtestaaplicandoinf3.setVisible(false);
           PlanesInfiltracion.setPlaninfilpre3("No");
           Admisiones.setAdmPI3("nohay");
        } else {
            jLabel35.setVisible(false);
            txtestaaplicandoinf3.setVisible(false);
            PlanesInfiltracion.setPlaninfilpre1("-");
            Admisiones.setAdmPI3("nohay");
        }
    }//GEN-LAST:event_jCheckBox36ItemStateChanged

    private void txtestaaplicandoinf4CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtestaaplicandoinf4CaretUpdate
        PlanesInfiltracion.setAdmisionesPlanesInfiltracion(txtestaaplicandoinf4.getText());
    }//GEN-LAST:event_txtestaaplicandoinf4CaretUpdate

    private void txtestaaplicandoinf4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtestaaplicandoinf4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtestaaplicandoinf4ActionPerformed

    private void jCheckBox37ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox37ItemStateChanged
        if (jCheckBox37.isSelected()) {
            jCheckBox38.setSelected(false);
            txtestaaplicandoinf4.setVisible(true);
            jLabel36.setVisible(true);
            Admisiones.setAdmPI5("hay");
        } else {
            txtestaaplicandoinf4.setVisible(false);
            jLabel36.setVisible(false);
            Admisiones.setAdmPI5("nohay");
        }
    }//GEN-LAST:event_jCheckBox37ItemStateChanged

    private void jCheckBox38ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox38ItemStateChanged
        if (jCheckBox38.isSelected()) {
            jCheckBox37.setSelected(false);
            txtestaaplicandoinf4.setVisible(false);
            jLabel36.setVisible(false);
            Admisiones.setAdmPI5("nohay");
        } else {
            txtestaaplicandoinf4.setVisible(false);
            jLabel36.setVisible(false);
            Admisiones.setAdmPI5("nohay");
        }
    }//GEN-LAST:event_jCheckBox38ItemStateChanged

    private void txtestaaplicandoinf1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtestaaplicandoinf1KeyTyped
        int k = (int) evt.getKeyChar();
        if (k == 39) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "¡No se acepta ese tipo de carácter!", "Error de datos ingresados", JOptionPane.ERROR_MESSAGE, iconThinking_uh);
        }
        InputMap map = txtestaaplicandoinf1.getInputMap(JTextField.WHEN_FOCUSED);
//        map.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, CTRL_MASK), "null");
    }//GEN-LAST:event_txtestaaplicandoinf1KeyTyped

    private void txtestaaplicandoinf2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtestaaplicandoinf2KeyTyped
        int k = (int) evt.getKeyChar();
        if (k == 39) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "¡No se acepta ese tipo de carácter!", "Error de datos ingresados", JOptionPane.ERROR_MESSAGE, iconThinking_uh);
        }
        InputMap map = txtestaaplicandoinf2.getInputMap(JTextField.WHEN_FOCUSED);
//        map.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, CTRL_MASK), "null");
    }//GEN-LAST:event_txtestaaplicandoinf2KeyTyped

    private void txtestaaplicandoinf3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtestaaplicandoinf3KeyTyped
        int k = (int) evt.getKeyChar();
        if (k == 39) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "¡No se acepta ese tipo de carácter!", "Error de datos ingresados", JOptionPane.ERROR_MESSAGE, iconThinking_uh);
        }
        InputMap map = txtestaaplicandoinf3.getInputMap(JTextField.WHEN_FOCUSED);
//        map.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, CTRL_MASK), "null");
    }//GEN-LAST:event_txtestaaplicandoinf3KeyTyped

    private void txtestaaplicandoinfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtestaaplicandoinfKeyTyped
        int k = (int) evt.getKeyChar();
        if (k == 39) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "¡No se acepta ese tipo de carácter!", "Error de datos ingresados", JOptionPane.ERROR_MESSAGE, iconThinking_uh);
        }
        InputMap map = txtestaaplicandoinf.getInputMap(JTextField.WHEN_FOCUSED);
//        map.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, CTRL_MASK), "null");
    }//GEN-LAST:event_txtestaaplicandoinfKeyTyped

    private void txtestaaplicandoinf4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtestaaplicandoinf4KeyTyped
        int k = (int) evt.getKeyChar();
        if (k == 39) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "¡No se acepta ese tipo de carácter!", "Error de datos ingresados", JOptionPane.ERROR_MESSAGE, iconThinking_uh);
        }
        InputMap map = txtestaaplicandoinf4.getInputMap(JTextField.WHEN_FOCUSED);
//        map.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, CTRL_MASK), "null");
    }//GEN-LAST:event_txtestaaplicandoinf4KeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox chbxamigosva;
    private javax.swing.JCheckBox chbxbolsas;
    private javax.swing.JCheckBox chbxfamiliaresva;
    private javax.swing.JCheckBox chbxferias;
    private javax.swing.JCheckBox chbxinternetva;
    private javax.swing.JCheckBox chbxradiowtf;
    private javax.swing.JCheckBox chbxredessociales;
    private javax.swing.JCheckBox chbxreferidova;
    private javax.swing.JLabel comoseentero;
    private javax.swing.JLabel estaaplicandoinf;
    private javax.swing.JLabel estaaplicandoinf1;
    private javax.swing.JLabel estaaplicandoinf2;
    private javax.swing.JLabel estaaplicandoinf3;
    private javax.swing.JLabel estaaplicandoinf4;
    private javax.swing.JCheckBox jCheckBox29;
    private javax.swing.JCheckBox jCheckBox30;
    private javax.swing.JCheckBox jCheckBox31;
    private javax.swing.JCheckBox jCheckBox32;
    private javax.swing.JCheckBox jCheckBox33;
    private javax.swing.JCheckBox jCheckBox34;
    private javax.swing.JCheckBox jCheckBox35;
    private javax.swing.JCheckBox jCheckBox36;
    private javax.swing.JCheckBox jCheckBox37;
    private javax.swing.JCheckBox jCheckBox38;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JTextField txtestaaplicandoinf;
    private javax.swing.JTextField txtestaaplicandoinf1;
    private javax.swing.JTextField txtestaaplicandoinf2;
    private javax.swing.JTextField txtestaaplicandoinf3;
    private javax.swing.JTextField txtestaaplicandoinf4;
    // End of variables declaration//GEN-END:variables
}
