package view;

import classes.ActiTiempoLibre;
import classes.Admisiones;
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
public class ActividadTiemLibre extends javax.swing.JInternalFrame {

    public ActividadTiemLibre() {
        ((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI()).setNorthPane(null);
        initComponents();
        novistos();
    }
    
    Thinking_uh iconThinking_uh = new Thinking_uh();

    public void novistos() {
        jRadioButton2.setVisible(false);
        jRadioButton3.setVisible(false);
        jRadioButton4.setVisible(false);
        jRadioButton5.setVisible(false);

        txtcualdelitocometio.setVisible(false);
        txtexpprivadoliber.setVisible(false);
        txtcbxprocepenal1.setVisible(false);
        txtcbxprocepenal.setVisible(false);
        txtfamiliape1.setVisible(false);
        jLabel34.setVisible(false);
        jLabel38.setVisible(false);
        jLabel37.setVisible(false);
        jLabel33.setVisible(false);
        jLabel32.setVisible(false);
        guiascasino();
    }

    public void guiascasino() {
        CorrectorOrtografia p = new CorrectorOrtografia("El examinado aseguró...", txtcualdelitocometio);
        CorrectorOrtografia p5 = new CorrectorOrtografia("Dijo...", txtcualdelitocometio1);
        CorrectorOrtografia p1 = new CorrectorOrtografia("Admitió que ha realizado...", txtexpprivadoliber);
        CorrectorOrtografia p2 = new CorrectorOrtografia("Afirmó que ha realizado...", txtcbxprocepenal1);
        CorrectorOrtografia p3 = new CorrectorOrtografia("Comentó que ha perdido dinero en apuestas...", txtcbxprocepenal);

        SpellChecker.register(txtcualdelitocometio);
        SpellChecker.register(txtcualdelitocometio1);
        SpellChecker.register(txtexpprivadoliber);
        SpellChecker.register(txtcbxprocepenal1);
        SpellChecker.register(txtcbxprocepenal);
    }
    
    public void limpiar() {
        txtcualdelitocometio1.setText("");
        txtcualdelitocometio.setText("");
        txtexpprivadoliber.setText("");
        txtcbxprocepenal1.setText("");
        txtcbxprocepenal.setText("");
        txtfamiliape1.setText("");
        jRadioButton1.setSelected(false);
        jRadioButton2.setSelected(false);
        jRadioButton3.setSelected(false);
        jRadioButton4.setSelected(false);
        jRadioButton5.setSelected(false);
        jCheckBox1.setSelected(false);
        jCheckBox2.setSelected(false);
        jCheckBox23.setSelected(false);
        jCheckBox24.setSelected(false);
        jCheckBox25.setSelected(false);
        jCheckBox26.setSelected(false);
        jCheckBox27.setSelected(false);
        jCheckBox28.setSelected(false);
        jCheckBox29.setSelected(false);
        jCheckBox30.setSelected(false);
        jScrollPane18.getVerticalScrollBar().setValue(0);
        this.setVisible(false);
    }
    
    public void resultado(){
        txtcualdelitocometio1.setText(ActiTiempoLibre.getActividadTL1());
        if (ActiTiempoLibre.getActividadTL2().equals("Sí")){
            txtcualdelitocometio.setText(ActiTiempoLibre.getActividadTL3());
            txtcualdelitocometio.setVisible(true);
            jLabel34.setVisible(true);
            jCheckBox24.setSelected(true);
            jCheckBox23.setSelected(false);
        } else if (ActiTiempoLibre.getActividadTL2().equals("No")){
            txtcualdelitocometio.setVisible(false);
            jLabel34.setVisible(false);
            jCheckBox23.setSelected(true);
            jCheckBox24.setSelected(false);
        }
        if (ActiTiempoLibre.getActividadTL4().equals("Sí")){
            txtexpprivadoliber.setText(ActiTiempoLibre.getActividadTL5());
            txtexpprivadoliber.setVisible(true);
            jLabel38.setVisible(true);
            jCheckBox26.setSelected(true);
            jCheckBox25.setSelected(false);
        } else if (ActiTiempoLibre.getActividadTL4().equals("No")){
            txtexpprivadoliber.setVisible(false);
            jLabel38.setVisible(false);
            jCheckBox25.setSelected(true);
            jCheckBox26.setSelected(false);
        }
        if (ActiTiempoLibre.getActividadTL6().equals("Sí")){
            txtcbxprocepenal1.setText(ActiTiempoLibre.getActividadTL7());
            txtcbxprocepenal1.setVisible(true);
            jLabel37.setVisible(true);
            jCheckBox28.setSelected(true);
            jCheckBox27.setSelected(false);
        } else if (ActiTiempoLibre.getActividadTL6().equals("No")){
            txtcbxprocepenal1.setVisible(false);
            jLabel37.setVisible(false);
            jCheckBox27.setSelected(true);
            jCheckBox28.setSelected(false);
        }
        if (ActiTiempoLibre.getActividadTL8().equals("Sí")){
            txtcbxprocepenal.setText(ActiTiempoLibre.getActividadTL9());
            txtcbxprocepenal.setVisible(true);
            jLabel33.setVisible(true);
            jCheckBox30.setSelected(true);
            jCheckBox29.setSelected(false);
        } else if (ActiTiempoLibre.getActividadTL8().equals("No")){
            txtcbxprocepenal.setVisible(false);
            jLabel33.setVisible(false);
            jCheckBox29.setSelected(true);
            jCheckBox30.setSelected(false);
        }
    }
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane18 = new javax.swing.JScrollPane();
        jPanel7 = new javax.swing.JPanel();
        jLabel69 = new javax.swing.JLabel();
        txtcualdelitocometio = new javax.swing.JTextField();
        jLabel128 = new javax.swing.JLabel();
        txtcbxprocepenal = new javax.swing.JTextField();
        enconpasadojud = new javax.swing.JLabel();
        jLabel132 = new javax.swing.JLabel();
        txtexpprivadoliber = new javax.swing.JTextField();
        txtcbxprocepenal1 = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jCheckBox24 = new javax.swing.JCheckBox();
        jCheckBox23 = new javax.swing.JCheckBox();
        jCheckBox25 = new javax.swing.JCheckBox();
        jCheckBox26 = new javax.swing.JCheckBox();
        jCheckBox27 = new javax.swing.JCheckBox();
        jCheckBox28 = new javax.swing.JCheckBox();
        jCheckBox29 = new javax.swing.JCheckBox();
        jCheckBox30 = new javax.swing.JCheckBox();
        jLabel35 = new javax.swing.JLabel();
        txtcualdelitocometio1 = new javax.swing.JTextField();
        jLabel70 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jLabel45 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        txtfamiliape1 = new javax.swing.JTextField();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(null);
        setPreferredSize(new java.awt.Dimension(975, 550));

        jScrollPane18.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane18.setBorder(null);
        jScrollPane18.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        jLabel69.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel69.setText("¿Asiste usted a casinos?");

        txtcualdelitocometio.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtcualdelitocometio.setBorder(null);
        txtcualdelitocometio.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtcualdelitocometioCaretUpdate(evt);
            }
        });
        txtcualdelitocometio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcualdelitocometioActionPerformed(evt);
            }
        });
        txtcualdelitocometio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcualdelitocometioKeyTyped(evt);
            }
        });

        jLabel128.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel128.setText("¿Ha realizado usted alguna apuesta en casinos?");

        txtcbxprocepenal.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtcbxprocepenal.setBorder(null);
        txtcbxprocepenal.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtcbxprocepenalCaretUpdate(evt);
            }
        });
        txtcbxprocepenal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcbxprocepenalKeyTyped(evt);
            }
        });

        enconpasadojud.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        enconpasadojud.setText("¿Ha realizado usted alguna apuesta de manera virtual?");

        jLabel132.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel132.setText("¿Ha perdido usted dinero en apuestas de casinos o virtuales?");

        txtexpprivadoliber.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
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

        txtcbxprocepenal1.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
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

        jLabel33.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel34.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel37.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel38.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jCheckBox24.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox24.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jCheckBox24.setText("Sí");
        jCheckBox24.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox24ItemStateChanged(evt);
            }
        });

        jCheckBox23.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox23.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jCheckBox23.setText("No");
        jCheckBox23.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox23ItemStateChanged(evt);
            }
        });

        jCheckBox25.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox25.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jCheckBox25.setText("No");
        jCheckBox25.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox25ItemStateChanged(evt);
            }
        });

        jCheckBox26.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox26.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jCheckBox26.setText("Sí");
        jCheckBox26.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox26ItemStateChanged(evt);
            }
        });

        jCheckBox27.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox27.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jCheckBox27.setText("No");
        jCheckBox27.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox27ItemStateChanged(evt);
            }
        });

        jCheckBox28.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox28.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jCheckBox28.setText("Sí");
        jCheckBox28.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox28ItemStateChanged(evt);
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

        jCheckBox30.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox30.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jCheckBox30.setText("Sí");
        jCheckBox30.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox30ItemStateChanged(evt);
            }
        });

        jLabel35.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtcualdelitocometio1.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtcualdelitocometio1.setBorder(null);
        txtcualdelitocometio1.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtcualdelitocometio1CaretUpdate(evt);
            }
        });
        txtcualdelitocometio1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcualdelitocometio1KeyTyped(evt);
            }
        });

        jLabel70.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel70.setText("¿Qué actividades realiza usted en el tiempo libre?");

        jRadioButton1.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton1.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jRadioButton1.setText("A");
        jRadioButton1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButton1ItemStateChanged(evt);
            }
        });

        jRadioButton2.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton2.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jRadioButton2.setText("A");
        jRadioButton2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButton2ItemStateChanged(evt);
            }
        });

        jRadioButton3.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton3.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jRadioButton3.setText("A");
        jRadioButton3.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButton3ItemStateChanged(evt);
            }
        });

        jRadioButton4.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton4.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jRadioButton4.setText("A");
        jRadioButton4.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButton4ItemStateChanged(evt);
            }
        });

        jRadioButton5.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton5.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jRadioButton5.setText("A");
        jRadioButton5.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButton5ItemStateChanged(evt);
            }
        });

        jLabel45.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel45.setText("¿Existe alguna admisión relevante en esta categoría?");

        jLabel32.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtfamiliape1.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtfamiliape1.setBorder(null);
        txtfamiliape1.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtfamiliape1CaretUpdate(evt);
            }
        });
        txtfamiliape1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtfamiliape1KeyTyped(evt);
            }
        });

        jCheckBox1.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox1.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jCheckBox1.setText("Sí");
        jCheckBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox1ItemStateChanged(evt);
            }
        });

        jCheckBox2.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox2.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jCheckBox2.setText("No");
        jCheckBox2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox2ItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel45)
                        .addGap(452, 452, 452)
                        .addComponent(jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtfamiliape1, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcbxprocepenal, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel132, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(150, 150, 150)
                        .addComponent(jCheckBox30, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox29, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel70)
                        .addGap(581, 581, 581)
                        .addComponent(jRadioButton1))
                    .addComponent(txtcualdelitocometio1, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcualdelitocometio, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel128, javax.swing.GroupLayout.PREFERRED_SIZE, 612, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(158, 158, 158)
                        .addComponent(jCheckBox26, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox25, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(txtexpprivadoliber, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(enconpasadojud, javax.swing.GroupLayout.PREFERRED_SIZE, 617, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(153, 153, 153)
                        .addComponent(jCheckBox28, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox27, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(txtcbxprocepenal1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel69, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(596, 596, 596)
                        .addComponent(jCheckBox24, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox23, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton2)))
                .addGap(30, 30, 30))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel70)
                    .addComponent(jRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addComponent(txtcualdelitocometio1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox24, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox23, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel69))
                .addGap(7, 7, 7)
                .addComponent(txtcualdelitocometio, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox26, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox25, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel128))
                .addGap(7, 7, 7)
                .addComponent(txtexpprivadoliber, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox28, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox27, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(enconpasadojud))
                .addGap(7, 7, 7)
                .addComponent(txtcbxprocepenal1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jCheckBox30, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jCheckBox29, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jRadioButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel132))
                .addGap(7, 7, 7)
                .addComponent(txtcbxprocepenal, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel45)
                    .addComponent(jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addComponent(txtfamiliape1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(137, 137, 137))
        );

        jScrollPane18.setViewportView(jPanel7);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane18, javax.swing.GroupLayout.PREFERRED_SIZE, 975, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane18)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtcbxprocepenal1CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtcbxprocepenal1CaretUpdate
        ActiTiempoLibre.setActividadTL7(txtcbxprocepenal1.getText());
    }//GEN-LAST:event_txtcbxprocepenal1CaretUpdate

    private void txtexpprivadoliberCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtexpprivadoliberCaretUpdate
        ActiTiempoLibre.setActividadTL5(txtexpprivadoliber.getText());
    }//GEN-LAST:event_txtexpprivadoliberCaretUpdate

    private void txtcbxprocepenalCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtcbxprocepenalCaretUpdate
        ActiTiempoLibre.setActividadTL9(txtcbxprocepenal.getText());
    }//GEN-LAST:event_txtcbxprocepenalCaretUpdate

    private void txtcualdelitocometioCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtcualdelitocometioCaretUpdate
        ActiTiempoLibre.setActividadTL3(txtcualdelitocometio.getText());
    }//GEN-LAST:event_txtcualdelitocometioCaretUpdate

    private void jCheckBox24ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox24ItemStateChanged
        if (jCheckBox24.isSelected()) {
            jCheckBox23.setSelected(false);
            txtcualdelitocometio.setVisible(true);
            jLabel34.setVisible(true);
            ActiTiempoLibre.setActividadTL2("Sí");
            jRadioButton2.setVisible(true);
        } else {
           ActiTiempoLibre.setActividadTL2("-");
            txtcualdelitocometio.setVisible(false);
            jLabel34.setVisible(false);
            jRadioButton2.setVisible(false);
            jRadioButton2.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox24ItemStateChanged

    private void jCheckBox23ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox23ItemStateChanged
        if (jCheckBox23.isSelected()) {
            jCheckBox24.setSelected(false);
            txtcualdelitocometio.setVisible(false);
            jLabel34.setVisible(false);
            ActiTiempoLibre.setActividadTL2("No");
            jRadioButton2.setSelected(false);
            jRadioButton2.setVisible(false);
        } else {
            txtcualdelitocometio.setVisible(false);
            jLabel34.setVisible(false);
            ActiTiempoLibre.setActividadTL2("No");
            jRadioButton2.setSelected(false);
            jRadioButton2.setVisible(false);
        }
    }//GEN-LAST:event_jCheckBox23ItemStateChanged

    private void jCheckBox25ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox25ItemStateChanged
        if (jCheckBox25.isSelected()) {
            jCheckBox26.setSelected(false);
            txtexpprivadoliber.setVisible(false);
            jLabel38.setVisible(false);
           ActiTiempoLibre.setActividadTL4("No");
            jRadioButton3.setSelected(false);
            jRadioButton3.setVisible(false);
        } else {
            txtexpprivadoliber.setVisible(false);
            jLabel38.setVisible(false);
            ActiTiempoLibre.setActividadTL4("No");
            jRadioButton1.setSelected(false);
            jRadioButton1.setVisible(false);
        }
    }//GEN-LAST:event_jCheckBox25ItemStateChanged

    private void jCheckBox26ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox26ItemStateChanged
        if (jCheckBox26.isSelected()) {
            jCheckBox25.setSelected(false);
            txtexpprivadoliber.setVisible(true);
            jLabel38.setVisible(true);
            ActiTiempoLibre.setActividadTL4("Sí");
            jRadioButton3.setVisible(true);
        } else {
            ActiTiempoLibre.setActividadTL4("-");
            txtexpprivadoliber.setVisible(false);
            jLabel38.setVisible(false);
            jRadioButton3.setVisible(false);
            jRadioButton3.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox26ItemStateChanged

    private void jCheckBox27ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox27ItemStateChanged
        if (jCheckBox27.isSelected()) {
            jCheckBox28.setSelected(false);
            txtcbxprocepenal1.setVisible(false);
            jLabel37.setVisible(false);
            ActiTiempoLibre.setActividadTL6("No");
            jRadioButton4.setSelected(false);
            jRadioButton4.setVisible(false);
        } else {
            txtcbxprocepenal1.setVisible(false);
            jLabel37.setVisible(false);
            ActiTiempoLibre.setActividadTL6("No");
            jRadioButton4.setSelected(false);
            jRadioButton4.setVisible(false);
        }
    }//GEN-LAST:event_jCheckBox27ItemStateChanged

    private void jCheckBox28ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox28ItemStateChanged
        if (jCheckBox28.isSelected()) {
            jCheckBox27.setSelected(false);
            txtcbxprocepenal1.setVisible(true);
            jLabel37.setVisible(true);
            ActiTiempoLibre.setActividadTL6("Sí");
            jRadioButton4.setVisible(true);
        } else {

            ActiTiempoLibre.setActividadTL6("-");
            txtcbxprocepenal1.setVisible(false);
            jLabel37.setVisible(false);
            jRadioButton4.setVisible(false);
            jRadioButton4.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox28ItemStateChanged

    private void jCheckBox29ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox29ItemStateChanged
        if (jCheckBox29.isSelected()) {
            jCheckBox30.setSelected(false);
            txtcbxprocepenal.setVisible(false);
            jLabel33.setVisible(false);
            ActiTiempoLibre.setActividadTL8("No");
            jRadioButton5.setSelected(false);
            jRadioButton5.setVisible(false);
        } else {
            txtcbxprocepenal.setVisible(false);
            jLabel33.setVisible(false);
            ActiTiempoLibre.setActividadTL8("No");
            jRadioButton5.setSelected(false);
            jRadioButton5.setVisible(false);
        }
    }//GEN-LAST:event_jCheckBox29ItemStateChanged

    private void jCheckBox30ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox30ItemStateChanged
        if (jCheckBox30.isSelected()) {
            jCheckBox29.setSelected(false);
            txtcbxprocepenal.setVisible(true);
            jLabel33.setVisible(true);
            ActiTiempoLibre.setActividadTL8("Sí");
            jRadioButton5.setVisible(true);
        } else {
            ActiTiempoLibre.setActividadTL8("-");
            txtcbxprocepenal.setVisible(false);
            jLabel33.setVisible(false);
            jRadioButton5.setVisible(false);
            jRadioButton5.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox30ItemStateChanged

    private void txtcualdelitocometio1CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtcualdelitocometio1CaretUpdate
       ActiTiempoLibre.setActividadTL1(txtcualdelitocometio1.getText());
    }//GEN-LAST:event_txtcualdelitocometio1CaretUpdate

    private void txtfamiliape1CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtfamiliape1CaretUpdate
        ActiTiempoLibre.setAdmisionActiTiempoLibre(txtfamiliape1.getText());
    }//GEN-LAST:event_txtfamiliape1CaretUpdate

    private void jCheckBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox1ItemStateChanged
        if (jCheckBox1.isSelected()) {
            jCheckBox2.setSelected(false);
            txtfamiliape1.setVisible(true);
            jLabel32.setVisible(true);
            Admisiones.setAdmATL6("hay");
        } else if (!jCheckBox1.isSelected()) {
            txtfamiliape1.setVisible(false);
            jLabel32.setVisible(false);
            Admisiones.setAdmATL6("nohay");
        }
    }//GEN-LAST:event_jCheckBox1ItemStateChanged

    private void jCheckBox2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox2ItemStateChanged
        if (jCheckBox2.isSelected()) {
            jCheckBox1.setSelected(false);
            txtfamiliape1.setVisible(false);
            jLabel32.setVisible(false);
            Admisiones.setAdmATL6("nohay");
        } else {
            Admisiones.setAdmATL6("nohay");
        }
    }//GEN-LAST:event_jCheckBox2ItemStateChanged

    private void txtcualdelitocometio1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcualdelitocometio1KeyTyped
        int k = (int) evt.getKeyChar();
        if (k == 39) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "¡No se acepta ese tipo de carácter!", "Error de datos ingresados", JOptionPane.ERROR_MESSAGE, iconThinking_uh);
        }
        InputMap map = txtcualdelitocometio1.getInputMap(JTextField.WHEN_FOCUSED);
//        map.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, CTRL_MASK), "null");
    }//GEN-LAST:event_txtcualdelitocometio1KeyTyped

    private void txtcualdelitocometioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcualdelitocometioKeyTyped
        int k = (int) evt.getKeyChar();
        if (k == 39) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "¡No se acepta ese tipo de carácter!", "Error de datos ingresados", JOptionPane.ERROR_MESSAGE, iconThinking_uh);
        }
        InputMap map = txtcualdelitocometio.getInputMap(JTextField.WHEN_FOCUSED);
//        map.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, CTRL_MASK), "null");
    }//GEN-LAST:event_txtcualdelitocometioKeyTyped

    private void txtexpprivadoliberKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtexpprivadoliberKeyTyped
        int k = (int) evt.getKeyChar();
        if (k == 39) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "¡No se acepta ese tipo de carácter!", "Error de datos ingresados", JOptionPane.ERROR_MESSAGE, iconThinking_uh);
        }
        InputMap map = txtexpprivadoliber.getInputMap(JTextField.WHEN_FOCUSED);
//        map.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, CTRL_MASK), "null");
    }//GEN-LAST:event_txtexpprivadoliberKeyTyped

    private void txtcbxprocepenal1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcbxprocepenal1KeyTyped
        int k = (int) evt.getKeyChar();
        if (k == 39) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "¡No se acepta ese tipo de carácter!", "Error de datos ingresados", JOptionPane.ERROR_MESSAGE, iconThinking_uh);
        }
        InputMap map = txtcbxprocepenal1.getInputMap(JTextField.WHEN_FOCUSED);
//        map.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, CTRL_MASK), "null");
    }//GEN-LAST:event_txtcbxprocepenal1KeyTyped

    private void txtcbxprocepenalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcbxprocepenalKeyTyped
        int k = (int) evt.getKeyChar();
        if (k == 39) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "¡No se acepta ese tipo de carácter!", "Error de datos ingresados", JOptionPane.ERROR_MESSAGE, iconThinking_uh);
        }
        InputMap map = txtcbxprocepenal.getInputMap(JTextField.WHEN_FOCUSED);
//        map.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, CTRL_MASK), "null");
    }//GEN-LAST:event_txtcbxprocepenalKeyTyped

    private void txtfamiliape1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtfamiliape1KeyTyped
        int k = (int) evt.getKeyChar();
        if (k == 39) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "¡No se acepta ese tipo de carácter!", "Error de datos ingresados", JOptionPane.ERROR_MESSAGE, iconThinking_uh);
        }
        InputMap map = txtfamiliape1.getInputMap(JTextField.WHEN_FOCUSED);
//        map.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, CTRL_MASK), "null");
    }//GEN-LAST:event_txtfamiliape1KeyTyped

    private void txtcualdelitocometioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcualdelitocometioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcualdelitocometioActionPerformed

    private void jRadioButton1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton1ItemStateChanged
        if (jRadioButton1.isSelected()){
            Admisiones.setAdmATL1("hay");
        } else {
            Admisiones.setAdmATL1("nohay");
        }
    }//GEN-LAST:event_jRadioButton1ItemStateChanged

    private void jRadioButton2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton2ItemStateChanged
        if (jRadioButton2.isSelected()){
            Admisiones.setAdmATL2("hay");
        } else {
            Admisiones.setAdmATL2("nohay");
        }
    }//GEN-LAST:event_jRadioButton2ItemStateChanged

    private void jRadioButton3ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton3ItemStateChanged
        if (jRadioButton3.isSelected()){
            Admisiones.setAdmATL3("hay");
        } else {
            Admisiones.setAdmATL3("nohay");
        }
    }//GEN-LAST:event_jRadioButton3ItemStateChanged

    private void jRadioButton4ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton4ItemStateChanged
        if (jRadioButton4.isSelected()){
            Admisiones.setAdmATL4("hay");
        } else {
            Admisiones.setAdmATL4("nohay");
        }
    }//GEN-LAST:event_jRadioButton4ItemStateChanged

    private void jRadioButton5ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton5ItemStateChanged
        if (jRadioButton5.isSelected()){
            Admisiones.setAdmATL5("hay");
        } else {
            Admisiones.setAdmATL5("nohay");
        }
    }//GEN-LAST:event_jRadioButton5ItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel enconpasadojud;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox23;
    private javax.swing.JCheckBox jCheckBox24;
    private javax.swing.JCheckBox jCheckBox25;
    private javax.swing.JCheckBox jCheckBox26;
    private javax.swing.JCheckBox jCheckBox27;
    private javax.swing.JCheckBox jCheckBox28;
    private javax.swing.JCheckBox jCheckBox29;
    private javax.swing.JCheckBox jCheckBox30;
    private javax.swing.JLabel jLabel128;
    private javax.swing.JLabel jLabel132;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    public static javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JScrollPane jScrollPane18;
    private javax.swing.JTextField txtcbxprocepenal;
    private javax.swing.JTextField txtcbxprocepenal1;
    private javax.swing.JTextField txtcualdelitocometio;
    private javax.swing.JTextField txtcualdelitocometio1;
    private javax.swing.JTextField txtexpprivadoliber;
    private javax.swing.JTextField txtfamiliape1;
    // End of variables declaration//GEN-END:variables
}
