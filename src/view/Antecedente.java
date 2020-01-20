package view;

import classes.Admisiones;
import classes.AntecedentesJudiciales;
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
public class Antecedente extends javax.swing.JInternalFrame {

    public Antecedente() {
        ((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI()).setNorthPane(null);
        initComponents();
        jScrollPane18.getVerticalScrollBar().setUnitIncrement(15);
        novistos();
        guiasantecedentes();
    }

    public void guiasantecedentes() {
        CorrectorOrtografia p = new CorrectorOrtografia("En cuanto a delitos admitió...", txtcualdelitocometio);
        CorrectorOrtografia p1 = new CorrectorOrtografia("Manifestó que ha estado privado de la libertad...", txtexpprivadoliber);
        CorrectorOrtografia p2 = new CorrectorOrtografia("Manifestó...", txtexpprivadoliber1);
        CorrectorOrtografia p3 = new CorrectorOrtografia("Aseveró que ha estado retenido...", txtcbxentpoli);
        CorrectorOrtografia p4 = new CorrectorOrtografia("expresó que lo consultó por última vez...", cbxpasadojud);
        CorrectorOrtografia p5 = new CorrectorOrtografia("Donde encontró...", txtcbxprocepenal1);
        CorrectorOrtografia p6 = new CorrectorOrtografia("Indicó que...", txtcbxprocepenal);
        CorrectorOrtografia p7 = new CorrectorOrtografia("Afirmó registrar...", txtcbxprocepenal2);
        CorrectorOrtografia p8 = new CorrectorOrtografia("Sostuvo que...", txtdemandasc);
        CorrectorOrtografia p9 = new CorrectorOrtografia("A la vez aseguró que hasta la fecha ha entablado...", txtdemandasc1);
        CorrectorOrtografia p10 = new CorrectorOrtografia("No autorizó consultar sus antecedentes judiciales...", txtcbxprocepenal3);
        CorrectorOrtografia p11 = new CorrectorOrtografia("Expresó que...", txtdemandasc2);

        SpellChecker.register(txtcualdelitocometio);
        SpellChecker.register(txtexpprivadoliber);
        SpellChecker.register(txtexpprivadoliber1);
        SpellChecker.register(txtcbxentpoli);
        SpellChecker.register(cbxpasadojud);
        SpellChecker.register(txtcbxprocepenal1);
        SpellChecker.register(txtcbxprocepenal);
        SpellChecker.register(txtcbxprocepenal2);
        SpellChecker.register(txtdemandasc);
        SpellChecker.register(txtdemandasc1);
    }

    public void novistos() {
        jRadioButton1.setVisible(false);
        jRadioButton2.setVisible(false);
        jRadioButton3.setVisible(false);
        jRadioButton4.setVisible(false);
        jRadioButton6.setVisible(false);
        jRadioButton7.setVisible(false);
        jRadioButton11.setVisible(false);
        jRadioButton8.setVisible(false);
        jRadioButton9.setVisible(false);
        jRadioButton10.setVisible(false);
        jRadioButton12.setVisible(false);

        txtcbxprocepenal3.setVisible(false);
        jLabel42.setVisible(false);
        txtdemandasc2.setVisible(false);
        jLabel43.setVisible(false);
        txtdemandasc3.setVisible(false);
        jLabel44.setVisible(false);

        txtcualdelitocometio.setVisible(false);
        txtexpprivadoliber.setVisible(false);
        txtcbxentpoli.setVisible(false);
        txtcbxprocepenal1.setVisible(false);
        txtcbxprocepenal.setVisible(false);
        txtdemandasc.setVisible(false);
        jLabel34.setVisible(false);
        jLabel38.setVisible(false);
        jLabel35.setVisible(false);
        jLabel37.setVisible(false);
        jLabel33.setVisible(false);
        jLabel32.setVisible(false);

        txtexpprivadoliber1.setVisible(false);
        jLabel41.setVisible(false);
        txtcbxprocepenal2.setVisible(false);
        jLabel39.setVisible(false);
        txtdemandasc1.setVisible(false);
        jLabel40.setVisible(false);
    }

    public void limpiar() {
        txtcualdelitocometio.setText("");
        txtexpprivadoliber.setText("");
        txtexpprivadoliber1.setText("");
        txtcbxentpoli.setText("");
        cbxpasadojud.setText("");
        txtcbxprocepenal1.setText("");
        txtcbxprocepenal.setText("");
        txtcbxprocepenal3.setText("");
        txtcbxprocepenal2.setText("");
        txtdemandasc.setText("");
        txtdemandasc1.setText("");
        txtdemandasc2.setText("");
        txtdemandasc3.setText("");

        jCheckBox29.setSelected(false);
        jCheckBox30.setSelected(false);
        jCheckBox31.setSelected(false);
        jCheckBox32.setSelected(false);
        jCheckBox33.setSelected(false);
        jCheckBox34.setSelected(false);
        jCheckBox35.setSelected(false);
        jCheckBox36.setSelected(false);
        jCheckBox39.setSelected(false);
        jCheckBox40.setSelected(false);
        jCheckBox41.setSelected(false);
        jCheckBox42.setSelected(false);
        jCheckBox43.setSelected(false);
        jCheckBox44.setSelected(false);
        jCheckBox45.setSelected(false);
        jCheckBox46.setSelected(false);
        jCheckBox47.setSelected(false);
        jCheckBox48.setSelected(false);
        jCheckBox49.setSelected(false);
        jCheckBox50.setSelected(false);
        jCheckBox51.setSelected(false);
        jCheckBox52.setSelected(false);
        jCheckBox53.setSelected(false);
        jCheckBox54.setSelected(false);

        jRadioButton1.setSelected(false);
        jRadioButton2.setSelected(false);
        jRadioButton3.setSelected(false);
        jRadioButton4.setSelected(false);
        jRadioButton6.setSelected(false);
        jRadioButton7.setSelected(false);
        jRadioButton11.setSelected(false);
        jRadioButton8.setSelected(false);
        jRadioButton9.setSelected(false);
        jRadioButton10.setSelected(false);
        jRadioButton12.setSelected(false);

        novistos();
        jScrollPane18.getVerticalScrollBar().setValue(0);
        this.setVisible(false);

    }

    public void resultado() {
        if (AntecedentesJudiciales.getPg1().equals("Sí")) {
            jCheckBox30.setSelected(true);
            jCheckBox29.setSelected(false);
            txtcualdelitocometio.setVisible(true);
            jLabel34.setVisible(true);
            txtcualdelitocometio.setText(AntecedentesJudiciales.getRpg1());
        } else if (AntecedentesJudiciales.getPg1().equals("No")) {
            jCheckBox30.setSelected(false);
            jCheckBox29.setSelected(true);
            txtcualdelitocometio.setVisible(false);
            jLabel34.setVisible(false);
        }
        if (AntecedentesJudiciales.getPg2().equals("Sí")) {
            jCheckBox32.setSelected(true);
            jCheckBox31.setSelected(false);
            txtexpprivadoliber.setVisible(true);
            jLabel38.setVisible(true);
            txtexpprivadoliber.setText(AntecedentesJudiciales.getRpg2());
        } else if (AntecedentesJudiciales.getPg2().equals("No")) {
            jCheckBox32.setSelected(false);
            jCheckBox31.setSelected(true);
            txtexpprivadoliber.setVisible(false);
            jLabel38.setVisible(false);
        }
        if (AntecedentesJudiciales.getPg3().equals("Sí")) {
            jCheckBox34.setSelected(true);
            jCheckBox33.setSelected(false);
            txtexpprivadoliber1.setVisible(true);
            jLabel41.setVisible(true);
            txtexpprivadoliber1.setText(AntecedentesJudiciales.getRpg3());
        } else if (AntecedentesJudiciales.getPg3().equals("No")) {
            jCheckBox34.setSelected(false);
            jCheckBox33.setSelected(true);
            txtexpprivadoliber1.setVisible(false);
            jLabel41.setVisible(false);
        }
        if (AntecedentesJudiciales.getPg4().equals("Sí")) {
            jCheckBox36.setSelected(true);
            jCheckBox35.setSelected(false);
            txtcbxentpoli.setVisible(true);
            jLabel35.setVisible(true);
            txtcbxentpoli.setText(AntecedentesJudiciales.getRpg4());
        } else if (AntecedentesJudiciales.getPg4().equals("No")) {
            jCheckBox36.setSelected(false);
            jCheckBox35.setSelected(true);
            txtcbxentpoli.setVisible(false);
            jLabel35.setVisible(false);
        }
        cbxpasadojud.setText(AntecedentesJudiciales.getPg5());
        
        if (AntecedentesJudiciales.getPg6().equals("Sí")) {
            jCheckBox40.setSelected(true);
            jCheckBox39.setSelected(false);
            txtcbxprocepenal1.setVisible(true);
            jLabel37.setVisible(true);
            txtcbxprocepenal1.setText(AntecedentesJudiciales.getRpg6());
        } else if (AntecedentesJudiciales.getPg6().equals("No")) {
            jCheckBox40.setSelected(false);
            jCheckBox39.setSelected(true);
            txtcbxprocepenal1.setVisible(false);
            jLabel37.setVisible(false);
        }
        if (AntecedentesJudiciales.getPg7().equals("Sí")) {
            jCheckBox42.setSelected(true);
            jCheckBox41.setSelected(false);
            txtcbxprocepenal.setVisible(true);
            jLabel33.setVisible(true);
            txtcbxprocepenal.setText(AntecedentesJudiciales.getRpg7());
        } else if (AntecedentesJudiciales.getPg7().equals("No")) {
            jCheckBox42.setSelected(false);
            jCheckBox41.setSelected(true);
            txtcbxprocepenal.setVisible(false);
            jLabel33.setVisible(false);
        }
        if (AntecedentesJudiciales.getPg8().equals("Sí")) {
            jCheckBox49.setSelected(true);
            jCheckBox50.setSelected(false);
            txtcbxprocepenal3.setVisible(true);
            jLabel42.setVisible(true);
            txtcbxprocepenal3.setText(AntecedentesJudiciales.getRpg8());
        } else if (AntecedentesJudiciales.getPg8().equals("No")) {
            jCheckBox49.setSelected(false);
            jCheckBox50.setSelected(true);
            txtcbxprocepenal3.setVisible(false);
            jLabel42.setVisible(false);
        }
        if (AntecedentesJudiciales.getPg9().equals("Sí")) {
            jCheckBox44.setSelected(true);
            jCheckBox43.setSelected(false);
            txtcbxprocepenal2.setVisible(true);
            jLabel39.setVisible(true);
            txtcbxprocepenal2.setText(AntecedentesJudiciales.getRpg9());
        } else if (AntecedentesJudiciales.getPg9().equals("No")) {
            jCheckBox44.setSelected(false);
            jCheckBox43.setSelected(true);
            txtcbxprocepenal2.setVisible(false);
            jLabel39.setVisible(false);
        }
        if (AntecedentesJudiciales.getPg10().equals("Sí")) {
            jCheckBox46.setSelected(true);
            jCheckBox45.setSelected(false);
            txtdemandasc.setVisible(true);
            jLabel32.setVisible(true);
            txtdemandasc.setText(AntecedentesJudiciales.getRpg10());
        } else if (AntecedentesJudiciales.getPg10().equals("No")) {
            jCheckBox46.setSelected(false);
            jCheckBox45.setSelected(true);
            txtdemandasc.setVisible(false);
            jLabel32.setVisible(false);
        }
        if (AntecedentesJudiciales.getPg11().equals("Sí")) {
            jCheckBox48.setSelected(true);
            jCheckBox47.setSelected(false);
            txtdemandasc1.setVisible(true);
            jLabel40.setVisible(true);
            txtdemandasc1.setText(AntecedentesJudiciales.getRpg11());
        } else if (AntecedentesJudiciales.getPg11().equals("No")) {
            jCheckBox48.setSelected(false);
            jCheckBox47.setSelected(true);
            txtdemandasc1.setVisible(false);
            jLabel40.setVisible(false);
        }
        if (AntecedentesJudiciales.getPg12().equals("Sí")) {
            jCheckBox51.setSelected(true);
            jCheckBox52.setSelected(false);
            txtdemandasc2.setVisible(true);
            jLabel43.setVisible(true);
            txtdemandasc2.setText(AntecedentesJudiciales.getRpg12());
        } else if (AntecedentesJudiciales.getPg12().equals("No")) {
            jCheckBox51.setSelected(false);
            jCheckBox52.setSelected(true);
            txtdemandasc2.setVisible(false);
            jLabel43.setVisible(false);
        }
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
        txtcbxprocepenal = new javax.swing.JTextField();
        jLabel130 = new javax.swing.JLabel();
        enconpasadojud = new javax.swing.JLabel();
        jLabel132 = new javax.swing.JLabel();
        txtcbxentpoli = new javax.swing.JTextField();
        jLabel133 = new javax.swing.JLabel();
        txtdemandasc = new javax.swing.JTextField();
        txtexpprivadoliber = new javax.swing.JTextField();
        txtcbxprocepenal1 = new javax.swing.JTextField();
        cbxpasadojud = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel134 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        txtcbxprocepenal2 = new javax.swing.JTextField();
        jLabel135 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        txtdemandasc1 = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        txtexpprivadoliber1 = new javax.swing.JTextField();
        jLabel131 = new javax.swing.JLabel();
        jCheckBox30 = new javax.swing.JCheckBox();
        jCheckBox29 = new javax.swing.JCheckBox();
        jCheckBox31 = new javax.swing.JCheckBox();
        jCheckBox32 = new javax.swing.JCheckBox();
        jCheckBox33 = new javax.swing.JCheckBox();
        jCheckBox34 = new javax.swing.JCheckBox();
        jCheckBox35 = new javax.swing.JCheckBox();
        jCheckBox36 = new javax.swing.JCheckBox();
        jCheckBox39 = new javax.swing.JCheckBox();
        jCheckBox40 = new javax.swing.JCheckBox();
        jCheckBox41 = new javax.swing.JCheckBox();
        jCheckBox42 = new javax.swing.JCheckBox();
        jCheckBox43 = new javax.swing.JCheckBox();
        jCheckBox44 = new javax.swing.JCheckBox();
        jCheckBox45 = new javax.swing.JCheckBox();
        jCheckBox46 = new javax.swing.JCheckBox();
        jCheckBox47 = new javax.swing.JCheckBox();
        jCheckBox48 = new javax.swing.JCheckBox();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        jRadioButton7 = new javax.swing.JRadioButton();
        jRadioButton8 = new javax.swing.JRadioButton();
        jRadioButton9 = new javax.swing.JRadioButton();
        jRadioButton10 = new javax.swing.JRadioButton();
        jLabel42 = new javax.swing.JLabel();
        txtcbxprocepenal3 = new javax.swing.JTextField();
        jLabel136 = new javax.swing.JLabel();
        jCheckBox49 = new javax.swing.JCheckBox();
        jCheckBox50 = new javax.swing.JCheckBox();
        jRadioButton11 = new javax.swing.JRadioButton();
        jLabel43 = new javax.swing.JLabel();
        txtdemandasc2 = new javax.swing.JTextField();
        jLabel137 = new javax.swing.JLabel();
        jCheckBox51 = new javax.swing.JCheckBox();
        jCheckBox52 = new javax.swing.JCheckBox();
        jRadioButton12 = new javax.swing.JRadioButton();
        jLabel44 = new javax.swing.JLabel();
        txtdemandasc3 = new javax.swing.JTextField();
        jLabel138 = new javax.swing.JLabel();
        jCheckBox53 = new javax.swing.JCheckBox();
        jCheckBox54 = new javax.swing.JCheckBox();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(null);
        setPreferredSize(new java.awt.Dimension(975, 550));

        jScrollPane18.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane18.setBorder(null);
        jScrollPane18.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        jLabel69.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel69.setText("¿Ha cometido alguna actividad delictiva? ¿Cuál delito cometió?");

        txtcualdelitocometio.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
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
        jLabel128.setText("¿Ha estado usted privado de la libertad?");

        jLabel129.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel129.setText("¿Ha estado usted retenido en entidades policiales (CAI), UPJ, URI por infringir la ley?");

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

        jLabel130.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel130.setText("¿Cuándo fue la última vez que usted consultó su pasado judicial?");

        enconpasadojud.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        enconpasadojud.setText("¿Tiene usted alguna anotación en su pasado judicial?");

        jLabel132.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel132.setText("¿Ha iniciado usted algún proceso penal, civil o administrativo?");

        txtcbxentpoli.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtcbxentpoli.setBorder(null);
        txtcbxentpoli.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtcbxentpoliCaretUpdate(evt);
            }
        });
        txtcbxentpoli.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcbxentpoliKeyTyped(evt);
            }
        });

        jLabel133.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel133.setText("¿Alguien ha iniciado algún proceso judicial en su contra?");

        txtdemandasc.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtdemandasc.setBorder(null);
        txtdemandasc.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtdemandascCaretUpdate(evt);
            }
        });
        txtdemandasc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdemandascActionPerformed(evt);
            }
        });
        txtdemandasc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtdemandascKeyTyped(evt);
            }
        });

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

        cbxpasadojud.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        cbxpasadojud.setBorder(null);
        cbxpasadojud.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                cbxpasadojudCaretUpdate(evt);
            }
        });
        cbxpasadojud.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cbxpasadojudKeyTyped(evt);
            }
        });

        jLabel32.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel33.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel34.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel35.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel36.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel37.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel38.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel134.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel134.setText("¿Tiene usted anotaciones judiciales fuera del país?");

        jLabel39.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtcbxprocepenal2.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtcbxprocepenal2.setBorder(null);
        txtcbxprocepenal2.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtcbxprocepenal2CaretUpdate(evt);
            }
        });
        txtcbxprocepenal2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcbxprocepenal2KeyTyped(evt);
            }
        });

        jLabel135.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel135.setText("¿Ha entablado usted demandas en contra de alguna persona o empresa?");

        jLabel40.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtdemandasc1.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtdemandasc1.setBorder(null);
        txtdemandasc1.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtdemandasc1CaretUpdate(evt);
            }
        });
        txtdemandasc1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtdemandasc1KeyTyped(evt);
            }
        });

        jLabel41.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtexpprivadoliber1.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
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
        jLabel131.setText("¿Algún miembro de su familia ha estado detenido?");

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

        jCheckBox31.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox31.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jCheckBox31.setText("No");
        jCheckBox31.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox31ItemStateChanged(evt);
            }
        });

        jCheckBox32.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox32.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jCheckBox32.setText("Sí");
        jCheckBox32.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox32ItemStateChanged(evt);
            }
        });

        jCheckBox33.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox33.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jCheckBox33.setText("No");
        jCheckBox33.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox33ItemStateChanged(evt);
            }
        });

        jCheckBox34.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox34.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jCheckBox34.setText("Sí");
        jCheckBox34.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox34ItemStateChanged(evt);
            }
        });

        jCheckBox35.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox35.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jCheckBox35.setText("No");
        jCheckBox35.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox35ItemStateChanged(evt);
            }
        });

        jCheckBox36.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox36.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jCheckBox36.setText("Sí");
        jCheckBox36.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox36ItemStateChanged(evt);
            }
        });

        jCheckBox39.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox39.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jCheckBox39.setText("No");
        jCheckBox39.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox39ItemStateChanged(evt);
            }
        });

        jCheckBox40.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox40.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jCheckBox40.setText("Sí");
        jCheckBox40.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox40ItemStateChanged(evt);
            }
        });

        jCheckBox41.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox41.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jCheckBox41.setText("No");
        jCheckBox41.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox41ItemStateChanged(evt);
            }
        });

        jCheckBox42.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox42.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jCheckBox42.setText("Sí");
        jCheckBox42.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox42ItemStateChanged(evt);
            }
        });

        jCheckBox43.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox43.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jCheckBox43.setText("No");
        jCheckBox43.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox43ItemStateChanged(evt);
            }
        });

        jCheckBox44.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox44.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jCheckBox44.setText("Sí");
        jCheckBox44.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox44ItemStateChanged(evt);
            }
        });

        jCheckBox45.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox45.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jCheckBox45.setText("No");
        jCheckBox45.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox45ItemStateChanged(evt);
            }
        });

        jCheckBox46.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox46.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jCheckBox46.setText("Sí");
        jCheckBox46.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox46ItemStateChanged(evt);
            }
        });

        jCheckBox47.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox47.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jCheckBox47.setText("No");
        jCheckBox47.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox47ItemStateChanged(evt);
            }
        });

        jCheckBox48.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox48.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jCheckBox48.setText("Sí");
        jCheckBox48.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox48ItemStateChanged(evt);
            }
        });

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

        jRadioButton6.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton6.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jRadioButton6.setText("A");
        jRadioButton6.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButton6ItemStateChanged(evt);
            }
        });

        jRadioButton7.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton7.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jRadioButton7.setText("A");
        jRadioButton7.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButton7ItemStateChanged(evt);
            }
        });

        jRadioButton8.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton8.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jRadioButton8.setText("A");
        jRadioButton8.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButton8ItemStateChanged(evt);
            }
        });

        jRadioButton9.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton9.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jRadioButton9.setText("A");
        jRadioButton9.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButton9ItemStateChanged(evt);
            }
        });

        jRadioButton10.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton10.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jRadioButton10.setText("A");
        jRadioButton10.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButton10ItemStateChanged(evt);
            }
        });

        jLabel42.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtcbxprocepenal3.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtcbxprocepenal3.setBorder(null);
        txtcbxprocepenal3.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtcbxprocepenal3CaretUpdate(evt);
            }
        });
        txtcbxprocepenal3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcbxprocepenal3ActionPerformed(evt);
            }
        });
        txtcbxprocepenal3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcbxprocepenal3KeyTyped(evt);
            }
        });

        jLabel136.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel136.setText("¿Autoriza usted consultar sus antecedentes judiciales?");

        jCheckBox49.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox49.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jCheckBox49.setText("Sí");
        jCheckBox49.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox49ItemStateChanged(evt);
            }
        });

        jCheckBox50.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox50.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jCheckBox50.setText("No");
        jCheckBox50.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox50ItemStateChanged(evt);
            }
        });

        jRadioButton11.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton11.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jRadioButton11.setText("A");
        jRadioButton11.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButton11ItemStateChanged(evt);
            }
        });

        jLabel43.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtdemandasc2.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtdemandasc2.setBorder(null);
        txtdemandasc2.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtdemandasc2CaretUpdate(evt);
            }
        });
        txtdemandasc2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtdemandasc2KeyTyped(evt);
            }
        });

        jLabel137.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel137.setText("¿Ha visitado usted alguna cárcel?");

        jCheckBox51.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox51.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jCheckBox51.setText("Sí");
        jCheckBox51.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox51ItemStateChanged(evt);
            }
        });

        jCheckBox52.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox52.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jCheckBox52.setText("No");
        jCheckBox52.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox52ItemStateChanged(evt);
            }
        });

        jRadioButton12.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton12.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jRadioButton12.setText("A");
        jRadioButton12.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButton12ItemStateChanged(evt);
            }
        });

        jLabel44.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtdemandasc3.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtdemandasc3.setBorder(null);
        txtdemandasc3.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtdemandasc3CaretUpdate(evt);
            }
        });
        txtdemandasc3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdemandasc3ActionPerformed(evt);
            }
        });
        txtdemandasc3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtdemandasc3KeyTyped(evt);
            }
        });

        jLabel138.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel138.setText("¿Existe alguna admisión relevante en esta categoría?");

        jCheckBox53.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox53.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jCheckBox53.setText("Sí");
        jCheckBox53.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox53ItemStateChanged(evt);
            }
        });
        jCheckBox53.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox53ActionPerformed(evt);
            }
        });

        jCheckBox54.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox54.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jCheckBox54.setText("No");
        jCheckBox54.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox54ItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel138)
                        .addGap(452, 452, 452)
                        .addComponent(jCheckBox53, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox54, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxpasadojud, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel130)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel136)
                        .addGap(442, 442, 442)
                        .addComponent(jCheckBox49, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox50, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtcbxprocepenal3, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel7Layout.createSequentialGroup()
                            .addComponent(jLabel69, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(291, 291, 291)
                            .addComponent(jCheckBox30, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jCheckBox29, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(txtcualdelitocometio, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel7Layout.createSequentialGroup()
                            .addComponent(jLabel128, javax.swing.GroupLayout.PREFERRED_SIZE, 548, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(222, 222, 222)
                            .addComponent(jCheckBox32, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jCheckBox31, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jRadioButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(txtexpprivadoliber, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel131)
                        .addGap(461, 461, 461)
                        .addComponent(jCheckBox34, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox33, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtexpprivadoliber1, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcbxentpoli, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel129)
                        .addGap(259, 259, 259)
                        .addComponent(jCheckBox36, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox35, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtcbxprocepenal1, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(enconpasadojud)
                        .addGap(449, 449, 449)
                        .addComponent(jCheckBox40, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox39, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtcbxprocepenal, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel132)
                        .addGap(394, 394, 394)
                        .addComponent(jCheckBox42, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox41, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtdemandasc, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel133)
                        .addGap(428, 428, 428)
                        .addComponent(jCheckBox46, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox45, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel135)
                        .addGap(324, 324, 324)
                        .addComponent(jCheckBox48, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox47, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtdemandasc1, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel137)
                        .addGap(569, 569, 569)
                        .addComponent(jCheckBox51, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox52, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtdemandasc2, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel134)
                        .addGap(468, 468, 468)
                        .addComponent(jCheckBox44, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox43, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtcbxprocepenal2, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtdemandasc3, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox29, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox30, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel69))
                .addGap(7, 7, 7)
                .addComponent(txtcualdelitocometio, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox32, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox31, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel128))
                .addGap(7, 7, 7)
                .addComponent(txtexpprivadoliber, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jCheckBox34, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jCheckBox33, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jRadioButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel131))
                .addGap(7, 7, 7)
                .addComponent(txtexpprivadoliber1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel129)
                    .addComponent(jCheckBox36, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox35, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addComponent(txtcbxentpoli, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(jLabel130)
                .addGap(7, 7, 7)
                .addComponent(cbxpasadojud, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox39, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox40, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(enconpasadojud))
                .addGap(7, 7, 7)
                .addComponent(txtcbxprocepenal1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel132)
                    .addComponent(jCheckBox42, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox41, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addComponent(txtcbxprocepenal, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jCheckBox49, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jCheckBox50, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jRadioButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel136))
                .addGap(7, 7, 7)
                .addComponent(txtcbxprocepenal3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jCheckBox44, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jCheckBox43, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jRadioButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel134))
                .addGap(7, 7, 7)
                .addComponent(txtcbxprocepenal2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox46, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox45, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel133))
                .addGap(7, 7, 7)
                .addComponent(txtdemandasc, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel135)
                    .addComponent(jCheckBox48, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox47, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addComponent(txtdemandasc1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jCheckBox51, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jCheckBox52, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jRadioButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel137))
                .addGap(7, 7, 7)
                .addComponent(txtdemandasc2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jCheckBox53, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jCheckBox54, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel138))
                .addGap(6, 6, 6)
                .addComponent(txtdemandasc3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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

    private void jCheckBox54ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox54ItemStateChanged
        if (jCheckBox54.isSelected()) {
            txtdemandasc3.setVisible(false);
            jLabel44.setVisible(false);
            jCheckBox53.setSelected(false);
            Admisiones.setAdmAJ13("nohay");
        } else {
            txtdemandasc3.setVisible(false);
            jLabel44.setVisible(false);
            Admisiones.setAdmAJ13("nohay");
        }
    }//GEN-LAST:event_jCheckBox54ItemStateChanged

    private void jCheckBox53ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox53ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox53ActionPerformed

    private void jCheckBox53ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox53ItemStateChanged
        if (jCheckBox53.isSelected()) {

            txtdemandasc3.setVisible(true);
            jLabel44.setVisible(true);
            jCheckBox54.setSelected(false);
            Admisiones.setAdmAJ13("hay");
        } else {
            txtdemandasc3.setVisible(false);
            jLabel44.setVisible(false);
            Admisiones.setAdmAJ13("nohay");
        }
    }//GEN-LAST:event_jCheckBox53ItemStateChanged

    private void txtdemandasc3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdemandasc3KeyTyped
        int k = (int) evt.getKeyChar();
        if (k == 39) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "¡No se acepta ese tipo de carácter!", "Error de datos ingresados", JOptionPane.ERROR_MESSAGE, iconThinking_uh);
        }
        InputMap map = txtdemandasc3.getInputMap(JTextField.WHEN_FOCUSED);
//        map.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, CTRL_MASK), "null");
    }//GEN-LAST:event_txtdemandasc3KeyTyped

    private void txtdemandasc3CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtdemandasc3CaretUpdate
        AntecedentesJudiciales.setAdmisionAntecendentes(txtdemandasc3.getText());
    }//GEN-LAST:event_txtdemandasc3CaretUpdate

    private void jCheckBox52ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox52ItemStateChanged
        if (jCheckBox52.isSelected()) {
            txtdemandasc2.setVisible(false);
            jLabel43.setVisible(false);
            jCheckBox51.setSelected(false);
            jRadioButton12.setVisible(false);
            jRadioButton12.setSelected(false);
            AntecedentesJudiciales.setPg12("No");
        } else {
            AntecedentesJudiciales.setPg12("-");
            txtdemandasc2.setVisible(false);
            jLabel43.setVisible(false);
            jRadioButton12.setVisible(false);
            jRadioButton12.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox52ItemStateChanged

    private void jCheckBox51ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox51ItemStateChanged
        if (jCheckBox51.isSelected()) {
            txtdemandasc2.setVisible(true);
            jLabel43.setVisible(true);
            jCheckBox52.setSelected(false);
            jRadioButton12.setVisible(true);
            AntecedentesJudiciales.setPg12("Sí");
        } else {
            AntecedentesJudiciales.setPg12("-");
            txtdemandasc2.setVisible(false);
            jLabel43.setVisible(false);
            jRadioButton12.setVisible(false);
            jRadioButton12.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox51ItemStateChanged

    private void txtdemandasc2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdemandasc2KeyTyped
        int k = (int) evt.getKeyChar();
        if (k == 39) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "¡No se acepta ese tipo de carácter!", "Error de datos ingresados", JOptionPane.ERROR_MESSAGE, iconThinking_uh);
        }
        InputMap map = txtdemandasc2.getInputMap(JTextField.WHEN_FOCUSED);
//        map.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, CTRL_MASK), "null");
    }//GEN-LAST:event_txtdemandasc2KeyTyped

    private void txtdemandasc2CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtdemandasc2CaretUpdate
        AntecedentesJudiciales.setRpg12(txtdemandasc2.getText());
    }//GEN-LAST:event_txtdemandasc2CaretUpdate

    private void jCheckBox50ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox50ItemStateChanged
        if (jCheckBox50.isSelected()) {
            jCheckBox49.setSelected(false);
            txtcbxprocepenal3.setVisible(true);
            jLabel42.setVisible(true);
            AntecedentesJudiciales.setPg8("No");
            jRadioButton11.setVisible(true);;
        } else {
            txtcbxprocepenal3.setVisible(false);
            jLabel42.setVisible(false);
            AntecedentesJudiciales.setPg8("-");
            jRadioButton11.setVisible(false);
            jRadioButton11.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox50ItemStateChanged

    private void jCheckBox49ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox49ItemStateChanged
        if (jCheckBox49.isSelected()) {
            jCheckBox50.setSelected(false);
            txtcbxprocepenal3.setVisible(false);
            AntecedentesJudiciales.setPg8("Sí");
            jLabel42.setVisible(false);
            jRadioButton11.setVisible(false);
            jRadioButton11.setSelected(false);
        } else {
            AntecedentesJudiciales.setPg8("-");
            txtcbxprocepenal3.setVisible(false);
            jLabel42.setVisible(false);
            jRadioButton11.setVisible(false);
            jRadioButton11.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox49ItemStateChanged

    private void txtcbxprocepenal3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcbxprocepenal3KeyTyped
        int k = (int) evt.getKeyChar();
        if (k == 39) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "¡No se acepta ese tipo de carácter!", "Error de datos ingresados", JOptionPane.ERROR_MESSAGE, iconThinking_uh);
        }
        InputMap map = txtcbxprocepenal3.getInputMap(JTextField.WHEN_FOCUSED);
//        map.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, CTRL_MASK), "null");
    }//GEN-LAST:event_txtcbxprocepenal3KeyTyped

    private void txtcbxprocepenal3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcbxprocepenal3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcbxprocepenal3ActionPerformed

    private void txtcbxprocepenal3CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtcbxprocepenal3CaretUpdate
        AntecedentesJudiciales.setRpg8(txtcbxprocepenal3.getText());
    }//GEN-LAST:event_txtcbxprocepenal3CaretUpdate

    private void jCheckBox48ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox48ItemStateChanged
        if (jCheckBox48.isSelected()) {
            jCheckBox47.setSelected(false);
            txtdemandasc1.setVisible(true);
            jLabel40.setVisible(true);
            AntecedentesJudiciales.setPg11("Sí");
            jRadioButton10.setVisible(true);
        } else {
            AntecedentesJudiciales.setPg11("-");
            txtdemandasc1.setVisible(false);
            jLabel40.setVisible(false);
            jRadioButton10.setVisible(false);
            jRadioButton10.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox48ItemStateChanged

    private void jCheckBox47ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox47ItemStateChanged
        if (jCheckBox47.isSelected()) {
            jCheckBox48.setSelected(false);
            AntecedentesJudiciales.setPg11("Sí");
            txtdemandasc1.setVisible(false);
            jLabel40.setVisible(false);
            jRadioButton10.setVisible(false);
            jRadioButton10.setSelected(false);
        } else {
            AntecedentesJudiciales.setPg11("-");
            txtdemandasc1.setVisible(false);
            jLabel40.setVisible(false);
            jRadioButton10.setVisible(false);
            jRadioButton10.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox47ItemStateChanged

    private void jCheckBox46ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox46ItemStateChanged
        if (jCheckBox46.isSelected()) {
            jCheckBox45.setSelected(false);
            txtdemandasc.setVisible(true);
            jLabel32.setVisible(true);
            AntecedentesJudiciales.setPg10("Sí");
            jRadioButton9.setVisible(true);
        } else {
            AntecedentesJudiciales.setPg10("-");
            txtdemandasc.setVisible(false);
            jLabel32.setVisible(false);
            jRadioButton9.setVisible(false);
            jRadioButton9.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox46ItemStateChanged

    private void jCheckBox45ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox45ItemStateChanged
        if (jCheckBox45.isSelected()) {
            jCheckBox46.setSelected(false);
            AntecedentesJudiciales.setPg10("No");
            txtdemandasc.setVisible(false);
            jLabel32.setVisible(false);
            jRadioButton9.setVisible(false);
            jRadioButton9.setSelected(false);
        } else {
            AntecedentesJudiciales.setPg10("-");
            txtdemandasc.setVisible(false);
            jLabel32.setVisible(false);
            jRadioButton9.setVisible(false);
            jRadioButton9.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox45ItemStateChanged

    private void jCheckBox44ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox44ItemStateChanged
        if (jCheckBox44.isSelected()) {
            jCheckBox43.setSelected(false);
            txtcbxprocepenal2.setVisible(true);
            jLabel39.setVisible(true);
            AntecedentesJudiciales.setPg9("Sí");
            jRadioButton8.setVisible(true);
        } else {
            AntecedentesJudiciales.setPg9("-");
            txtcbxprocepenal2.setVisible(false);
            jLabel39.setVisible(false);
            jRadioButton8.setVisible(false);
            jRadioButton8.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox44ItemStateChanged

    private void jCheckBox43ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox43ItemStateChanged
        if (jCheckBox43.isSelected()) {
            jCheckBox44.setSelected(false);
            AntecedentesJudiciales.setPg9("No");
            txtcbxprocepenal2.setVisible(false);
            jLabel39.setVisible(false);
            jRadioButton8.setVisible(false);
            jRadioButton8.setSelected(false);
        } else {
            AntecedentesJudiciales.setPg9("-");
            txtcbxprocepenal2.setVisible(false);
            jLabel39.setVisible(false);
            jRadioButton8.setVisible(false);
            jRadioButton8.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox43ItemStateChanged

    private void jCheckBox42ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox42ItemStateChanged
        if (jCheckBox42.isSelected()) {
            jCheckBox41.setSelected(false);
            txtcbxprocepenal.setVisible(true);
            jLabel33.setVisible(true);
            AntecedentesJudiciales.setPg7("Sí");
            jRadioButton7.setVisible(true);
        } else {
            AntecedentesJudiciales.setPg7("-");
            txtcbxprocepenal.setVisible(false);
            jLabel33.setVisible(false);
            jRadioButton7.setVisible(false);
            jRadioButton7.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox42ItemStateChanged

    private void jCheckBox41ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox41ItemStateChanged
        if (jCheckBox41.isSelected()) {
            jCheckBox42.setSelected(false);
            AntecedentesJudiciales.setPg7("No");
            txtcbxprocepenal.setVisible(false);
            jLabel33.setVisible(false);
            jRadioButton7.setVisible(false);
            jRadioButton7.setSelected(false);
        } else {
            AntecedentesJudiciales.setPg7("-");
            txtcbxprocepenal.setVisible(false);
            jLabel33.setVisible(false);
            jRadioButton7.setVisible(false);
            jRadioButton7.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox41ItemStateChanged

    private void jCheckBox40ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox40ItemStateChanged
        if (jCheckBox40.isSelected()) {
            jCheckBox39.setSelected(false);
            txtcbxprocepenal1.setVisible(true);
            jLabel37.setVisible(true);
            AntecedentesJudiciales.setPg6("Sí");
            jRadioButton6.setVisible(true);
        } else {
            AntecedentesJudiciales.setPg6("-");
            txtcbxprocepenal1.setVisible(false);
            jLabel37.setVisible(false);
            jRadioButton6.setVisible(false);
            jRadioButton6.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox40ItemStateChanged

    private void jCheckBox39ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox39ItemStateChanged
        if (jCheckBox39.isSelected()) {
            jCheckBox40.setSelected(false);
            AntecedentesJudiciales.setPg6("No");
            txtcbxprocepenal1.setVisible(false);
            jLabel37.setVisible(false);
            jRadioButton6.setVisible(false);
            jRadioButton6.setSelected(false);
        } else {
            AntecedentesJudiciales.setPg6("-");
            txtcbxprocepenal1.setVisible(false);
            jLabel37.setVisible(false);
            jRadioButton6.setVisible(false);
            jRadioButton6.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox39ItemStateChanged

    private void jCheckBox36ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox36ItemStateChanged
        if (jCheckBox36.isSelected()) {
            jCheckBox35.setSelected(false);
            txtcbxentpoli.setVisible(true);
            jLabel35.setVisible(true);
            AntecedentesJudiciales.setPg4("Sí");
            jRadioButton4.setVisible(true);
        } else {
            AntecedentesJudiciales.setPg4("-");
            txtcbxentpoli.setVisible(false);
            jLabel35.setVisible(false);
            jRadioButton4.setVisible(false);
            jRadioButton4.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox36ItemStateChanged

    private void jCheckBox35ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox35ItemStateChanged
        if (jCheckBox35.isSelected()) {
            jCheckBox36.setSelected(false);
            AntecedentesJudiciales.setPg4("No");
            txtcbxentpoli.setVisible(false);
            jLabel35.setVisible(false);
            jRadioButton4.setVisible(false);
            jRadioButton4.setSelected(false);
        } else {
            AntecedentesJudiciales.setPg4("-");
            txtcbxentpoli.setVisible(false);
            jLabel35.setVisible(false);
            jRadioButton4.setVisible(false);
            jRadioButton4.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox35ItemStateChanged

    private void jCheckBox34ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox34ItemStateChanged
        if (jCheckBox34.isSelected()) {
            jCheckBox33.setSelected(false);
            txtexpprivadoliber1.setVisible(true);
            jLabel41.setVisible(true);
            AntecedentesJudiciales.setPg3("Sí");
            jRadioButton3.setVisible(true);
        } else {
            AntecedentesJudiciales.setPg3("-");
            txtexpprivadoliber1.setVisible(false);
            jLabel41.setVisible(false);
            jRadioButton3.setVisible(false);
            jRadioButton3.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox34ItemStateChanged

    private void jCheckBox33ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox33ItemStateChanged
        if (jCheckBox33.isSelected()) {
            jCheckBox34.setSelected(false);
            AntecedentesJudiciales.setPg3("No");
            txtexpprivadoliber1.setVisible(false);
            jLabel41.setVisible(false);
            jRadioButton3.setVisible(false);
            jRadioButton3.setSelected(false);
        } else {
            AntecedentesJudiciales.setPg3("-");
            txtexpprivadoliber1.setVisible(false);
            jLabel41.setVisible(false);
            jRadioButton3.setVisible(false);
            jRadioButton3.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox33ItemStateChanged

    private void jCheckBox32ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox32ItemStateChanged
        if (jCheckBox32.isSelected()) {
            jCheckBox31.setSelected(false);
            txtexpprivadoliber.setVisible(true);
            jLabel38.setVisible(true);
            AntecedentesJudiciales.setPg2("Sí");
            jRadioButton2.setVisible(true);
        } else {
            AntecedentesJudiciales.setPg2("-");
            txtexpprivadoliber.setVisible(false);
            jLabel38.setVisible(false);
            jRadioButton2.setVisible(false);
            jRadioButton2.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox32ItemStateChanged

    private void jCheckBox31ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox31ItemStateChanged
        if (jCheckBox31.isSelected()) {
            jCheckBox32.setSelected(false);
            AntecedentesJudiciales.setPg2("No");
            txtexpprivadoliber.setVisible(false);
            jLabel38.setVisible(false);
            jRadioButton2.setVisible(false);
            jRadioButton2.setSelected(false);
        } else {
            AntecedentesJudiciales.setPg2("-");
            txtexpprivadoliber.setVisible(false);
            jLabel38.setVisible(false);
            jRadioButton2.setVisible(false);
            jRadioButton2.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox31ItemStateChanged

    private void jCheckBox29ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox29ItemStateChanged
        if (jCheckBox29.isSelected()) {
            jCheckBox30.setSelected(false);
            AntecedentesJudiciales.setPg1("No");
            txtcualdelitocometio.setVisible(false);
            jLabel34.setVisible(false);
            jRadioButton1.setSelected(false);
            jRadioButton1.setVisible(false);
        } else {
            AntecedentesJudiciales.setPg1("-");
            txtcualdelitocometio.setVisible(false);
            jLabel34.setVisible(false);
            jRadioButton1.setSelected(false);
            jRadioButton1.setVisible(false);
        }
    }//GEN-LAST:event_jCheckBox29ItemStateChanged

    private void jCheckBox30ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox30ItemStateChanged
        if (jCheckBox30.isSelected()) {
            jCheckBox29.setSelected(false);
            txtcualdelitocometio.setVisible(true);
            jLabel34.setVisible(true);
            AntecedentesJudiciales.setPg1("Sí");
            jRadioButton1.setVisible(true);
        } else {
            AntecedentesJudiciales.setPg1("-");
            txtcualdelitocometio.setVisible(false);
            jLabel34.setVisible(false);
            jRadioButton1.setVisible(false);
            jRadioButton1.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox30ItemStateChanged

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
        AntecedentesJudiciales.setRpg3(txtexpprivadoliber1.getText());
    }//GEN-LAST:event_txtexpprivadoliber1CaretUpdate

    private void txtdemandasc1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdemandasc1KeyTyped
        int k = (int) evt.getKeyChar();
        if (k == 39) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "¡No se acepta ese tipo de carácter!", "Error de datos ingresados", JOptionPane.ERROR_MESSAGE, iconThinking_uh);
        }
        InputMap map = txtdemandasc1.getInputMap(JTextField.WHEN_FOCUSED);
//        map.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, CTRL_MASK), "null");
    }//GEN-LAST:event_txtdemandasc1KeyTyped

    private void txtdemandasc1CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtdemandasc1CaretUpdate
        AntecedentesJudiciales.setRpg11(txtdemandasc1.getText());
    }//GEN-LAST:event_txtdemandasc1CaretUpdate

    private void txtcbxprocepenal2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcbxprocepenal2KeyTyped
        int k = (int) evt.getKeyChar();
        if (k == 39) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "¡No se acepta ese tipo de carácter!", "Error de datos ingresados", JOptionPane.ERROR_MESSAGE, iconThinking_uh);
        }
        InputMap map = txtcbxprocepenal2.getInputMap(JTextField.WHEN_FOCUSED);
//        map.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, CTRL_MASK), "null");
    }//GEN-LAST:event_txtcbxprocepenal2KeyTyped

    private void txtcbxprocepenal2CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtcbxprocepenal2CaretUpdate
        AntecedentesJudiciales.setRpg9(txtcbxprocepenal2.getText());
    }//GEN-LAST:event_txtcbxprocepenal2CaretUpdate

    private void cbxpasadojudKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cbxpasadojudKeyTyped
        int k = (int) evt.getKeyChar();
        if (k == 39) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "¡No se acepta ese tipo de carácter!", "Error de datos ingresados", JOptionPane.ERROR_MESSAGE, iconThinking_uh);
        }
        InputMap map = txtcbxprocepenal2.getInputMap(JTextField.WHEN_FOCUSED);
//        map.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, CTRL_MASK), "null");
    }//GEN-LAST:event_cbxpasadojudKeyTyped

    private void cbxpasadojudCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_cbxpasadojudCaretUpdate
        AntecedentesJudiciales.setPg5(cbxpasadojud.getText());
    }//GEN-LAST:event_cbxpasadojudCaretUpdate

    private void txtcbxprocepenal1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcbxprocepenal1KeyTyped
        int k = (int) evt.getKeyChar();
        if (k == 39) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "¡No se acepta ese tipo de carácter!", "Error de datos ingresados", JOptionPane.ERROR_MESSAGE, iconThinking_uh);
        }
        InputMap map = txtcbxprocepenal1.getInputMap(JTextField.WHEN_FOCUSED);
////        map.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, CTRL_MASK), "null");
    }//GEN-LAST:event_txtcbxprocepenal1KeyTyped

    private void txtcbxprocepenal1CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtcbxprocepenal1CaretUpdate
        AntecedentesJudiciales.setRpg6(txtcbxprocepenal1.getText());
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
        AntecedentesJudiciales.setRpg2(txtexpprivadoliber.getText());
    }//GEN-LAST:event_txtexpprivadoliberCaretUpdate

    private void txtdemandascKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdemandascKeyTyped
        int k = (int) evt.getKeyChar();
        if (k == 39) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "¡No se acepta ese tipo de carácter!", "Error de datos ingresados", JOptionPane.ERROR_MESSAGE, iconThinking_uh);
        }
        InputMap map = txtdemandasc.getInputMap(JTextField.WHEN_FOCUSED);
//        map.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, CTRL_MASK), "null");
    }//GEN-LAST:event_txtdemandascKeyTyped

    private void txtdemandascCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtdemandascCaretUpdate
        AntecedentesJudiciales.setRpg10(txtdemandasc.getText());
    }//GEN-LAST:event_txtdemandascCaretUpdate

    private void txtcbxentpoliKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcbxentpoliKeyTyped
        int k = (int) evt.getKeyChar();
        if (k == 39) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "¡No se acepta ese tipo de carácter!", "Error de datos ingresados", JOptionPane.ERROR_MESSAGE, iconThinking_uh);
        }
        InputMap map = txtcbxentpoli.getInputMap(JTextField.WHEN_FOCUSED);
//        map.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, CTRL_MASK), "null");
    }//GEN-LAST:event_txtcbxentpoliKeyTyped

    private void txtcbxentpoliCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtcbxentpoliCaretUpdate
        AntecedentesJudiciales.setRpg4(txtcbxentpoli.getText());
    }//GEN-LAST:event_txtcbxentpoliCaretUpdate

    private void txtcbxprocepenalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcbxprocepenalKeyTyped
        int k = (int) evt.getKeyChar();
        if (k == 39) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "¡No se acepta ese tipo de carácter!", "Error de datos ingresados", JOptionPane.ERROR_MESSAGE, iconThinking_uh);
        }
        InputMap map = txtcbxprocepenal.getInputMap(JTextField.WHEN_FOCUSED);
//        map.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, CTRL_MASK), "null");
    }//GEN-LAST:event_txtcbxprocepenalKeyTyped

    private void txtcbxprocepenalCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtcbxprocepenalCaretUpdate
        AntecedentesJudiciales.setRpg7(txtcbxprocepenal.getText());
    }//GEN-LAST:event_txtcbxprocepenalCaretUpdate

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
        AntecedentesJudiciales.setRpg1(txtcualdelitocometio.getText());
    }//GEN-LAST:event_txtcualdelitocometioCaretUpdate

    private void txtdemandasc3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdemandasc3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdemandasc3ActionPerformed

    private void jRadioButton1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton1ItemStateChanged
        if (jRadioButton1.isSelected()) {
            Admisiones.setAdmAJ1("hay");
        } else {
            Admisiones.setAdmAJ1("nohay");
        }
    }//GEN-LAST:event_jRadioButton1ItemStateChanged

    private void jRadioButton2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton2ItemStateChanged
        if (jRadioButton2.isSelected()) {
            Admisiones.setAdmAJ2("hay");
        } else {
            Admisiones.setAdmAJ2("nohay");
        }
    }//GEN-LAST:event_jRadioButton2ItemStateChanged

    private void jRadioButton3ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton3ItemStateChanged
        if (jRadioButton3.isSelected()) {
            Admisiones.setAdmAJ3("hay");
        } else {
            Admisiones.setAdmAJ3("nohay");
        }
    }//GEN-LAST:event_jRadioButton3ItemStateChanged

    private void jRadioButton4ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton4ItemStateChanged
        if (jRadioButton4.isSelected()) {
            Admisiones.setAdmAJ4("hay");
        } else {
            Admisiones.setAdmAJ4("nohay");
        }
    }//GEN-LAST:event_jRadioButton4ItemStateChanged

    private void jRadioButton6ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton6ItemStateChanged
        if (jRadioButton6.isSelected()) {
            Admisiones.setAdmAJ6("hay");
        } else {
            Admisiones.setAdmAJ6("nohay");
        }
    }//GEN-LAST:event_jRadioButton6ItemStateChanged

    private void jRadioButton7ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton7ItemStateChanged
        if (jRadioButton7.isSelected()) {
            Admisiones.setAdmAJ7("hay");
        } else {
            Admisiones.setAdmAJ7("nohay");
        }
    }//GEN-LAST:event_jRadioButton7ItemStateChanged

    private void jRadioButton11ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton11ItemStateChanged
        if (jRadioButton11.isSelected()) {
            Admisiones.setAdmAJ8("hay");
        } else {
            Admisiones.setAdmAJ8("nohay");
        }
    }//GEN-LAST:event_jRadioButton11ItemStateChanged

    private void jRadioButton8ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton8ItemStateChanged
        if (jRadioButton8.isSelected()) {
            Admisiones.setAdmAJ9("hay");
        } else {
            Admisiones.setAdmAJ9("nohay");
        }
    }//GEN-LAST:event_jRadioButton8ItemStateChanged

    private void jRadioButton9ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton9ItemStateChanged
        if (jRadioButton9.isSelected()) {
            Admisiones.setAdmAJ10("hay");
        } else {
            Admisiones.setAdmAJ10("nohay");
        }
    }//GEN-LAST:event_jRadioButton9ItemStateChanged

    private void jRadioButton10ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton10ItemStateChanged
        if (jRadioButton10.isSelected()) {
            Admisiones.setAdmAJ11("hay");
        } else {
            Admisiones.setAdmAJ11("nohay");
        }
    }//GEN-LAST:event_jRadioButton10ItemStateChanged

    private void jRadioButton12ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton12ItemStateChanged
        if (jRadioButton12.isSelected()) {
            Admisiones.setAdmAJ12("hay");
        } else {
            Admisiones.setAdmAJ12("nohay");
        }
    }//GEN-LAST:event_jRadioButton12ItemStateChanged

    private void txtdemandascActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdemandascActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdemandascActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cbxpasadojud;
    private javax.swing.JLabel enconpasadojud;
    private javax.swing.JCheckBox jCheckBox29;
    private javax.swing.JCheckBox jCheckBox30;
    private javax.swing.JCheckBox jCheckBox31;
    private javax.swing.JCheckBox jCheckBox32;
    private javax.swing.JCheckBox jCheckBox33;
    private javax.swing.JCheckBox jCheckBox34;
    private javax.swing.JCheckBox jCheckBox35;
    private javax.swing.JCheckBox jCheckBox36;
    private javax.swing.JCheckBox jCheckBox39;
    private javax.swing.JCheckBox jCheckBox40;
    private javax.swing.JCheckBox jCheckBox41;
    private javax.swing.JCheckBox jCheckBox42;
    private javax.swing.JCheckBox jCheckBox43;
    private javax.swing.JCheckBox jCheckBox44;
    private javax.swing.JCheckBox jCheckBox45;
    private javax.swing.JCheckBox jCheckBox46;
    private javax.swing.JCheckBox jCheckBox47;
    private javax.swing.JCheckBox jCheckBox48;
    private javax.swing.JCheckBox jCheckBox49;
    private javax.swing.JCheckBox jCheckBox50;
    private javax.swing.JCheckBox jCheckBox51;
    private javax.swing.JCheckBox jCheckBox52;
    private javax.swing.JCheckBox jCheckBox53;
    private javax.swing.JCheckBox jCheckBox54;
    private javax.swing.JLabel jLabel128;
    private javax.swing.JLabel jLabel129;
    private javax.swing.JLabel jLabel130;
    private javax.swing.JLabel jLabel131;
    private javax.swing.JLabel jLabel132;
    private javax.swing.JLabel jLabel133;
    private javax.swing.JLabel jLabel134;
    private javax.swing.JLabel jLabel135;
    private javax.swing.JLabel jLabel136;
    private javax.swing.JLabel jLabel137;
    private javax.swing.JLabel jLabel138;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton10;
    private javax.swing.JRadioButton jRadioButton11;
    private javax.swing.JRadioButton jRadioButton12;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JRadioButton jRadioButton8;
    private javax.swing.JRadioButton jRadioButton9;
    private javax.swing.JScrollPane jScrollPane18;
    private javax.swing.JTextField txtcbxentpoli;
    private javax.swing.JTextField txtcbxprocepenal;
    private javax.swing.JTextField txtcbxprocepenal1;
    private javax.swing.JTextField txtcbxprocepenal2;
    private javax.swing.JTextField txtcbxprocepenal3;
    private javax.swing.JTextField txtcualdelitocometio;
    private javax.swing.JTextField txtdemandasc;
    private javax.swing.JTextField txtdemandasc1;
    private javax.swing.JTextField txtdemandasc2;
    private javax.swing.JTextField txtdemandasc3;
    private javax.swing.JTextField txtexpprivadoliber;
    private javax.swing.JTextField txtexpprivadoliber1;
    // End of variables declaration//GEN-END:variables
}
