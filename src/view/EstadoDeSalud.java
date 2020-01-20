package view;

import classes.Admisiones;
import classes.EstadoSalud;
import com.inet.jortho.FileUserDictionary;
import com.inet.jortho.SpellChecker;
import icons.Thinking_uh;
import static java.awt.event.ActionEvent.CTRL_MASK;
import java.awt.event.KeyEvent;
import javax.swing.InputMap;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.KeyStroke;
import static view.DatoGeneral.jLabel10;
import static view.DatoGeneral.jLabel11;
import static view.DatoGeneral.jLabel12;
import static view.DatoGeneral.jLabel13;
import static view.DatoGeneral.jLabel14;
import static view.DatoGeneral.jLabel15;
import static view.DatoGeneral.jLabel18;
import static view.DatoGeneral.jLabel4;
import static view.DatoGeneral.jLabel5;
import static view.DatoGeneral.jLabel6;
import static view.DatoGeneral.jLabel7;
import static view.DatoGeneral.jLabel8;
import static view.DatoGeneral.jLabel9;

/**
 *
 * @author Kevin Casas
 */
public class EstadoDeSalud extends javax.swing.JInternalFrame {

    public EstadoDeSalud() {
        ((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI()).setNorthPane(null);
        initComponents();
        jScrollPane7.getVerticalScrollBar().setUnitIncrement(15);
        jTextArea5.setLineWrap(true);
        jTextArea5.setWrapStyleWord(true);
        SpellChecker.setUserDictionaryProvider(new FileUserDictionary());
        SpellChecker.registerDictionaries(null, null);
        nodisp();
        guiasestado_salud();
    }

    public void guiasestado_salud() {
        CorrectorOrtografia p = new CorrectorOrtografia("indicó que ha...", txtcualproblem);
        CorrectorOrtografia p1 = new CorrectorOrtografia("aseveró el examinado que hasta la fecha...", jTextArea5);
        SpellChecker.register(jTextArea5);
        SpellChecker.register(txtcualproblem);
    }

    EstadoSalud es = new EstadoSalud();
    Thinking_uh iconThinking_uh = new Thinking_uh();

    public void nodisp() {
        jLabel32.setVisible(false);
        txtcualproblem.setVisible(false);
        jTextArea5.setVisible(false);
        chbxauditivos.setEnabled(false);
        chbxneuro.setEnabled(false);
        chbxcardio.setEnabled(false);
        chbxcenrespir.setEnabled(false);
        chbxcenprofe.setEnabled(false);
        chbxtratapsico.setEnabled(false);
        chbxtratatricos.setEnabled(false);
        chbxsistemanervioso.setEnabled(false);
        chbxcancer.setEnabled(false);
        chbxdiabetes.setEnabled(false);
        chbxconsumedi.setEnabled(false);
        chbxhospitali.setEnabled(false);
        chbxcirugias.setEnabled(false);
        chbxtrysuicide.setEnabled(false);
        chbxets.setEnabled(false);
        chbxvih.setEnabled(false);
        chbxparalcuerpo.setEnabled(false);
        chbxdisauto.setEnabled(false);
        chbxesclerosispoco.setEnabled(false);
        chbxescoliosisempe.setEnabled(false);
    }

    public void limpiar() {

        jCheckBox3.setSelected(false);
        jCheckBox4.setSelected(false);
        jCheckBox5.setSelected(false);
        jCheckBox6.setSelected(false);
        jCheckBox7.setSelected(false);
        jCheckBox8.setSelected(false);
        jCheckBox9.setSelected(false);
        jCheckBox10.setSelected(false);
        jCheckBox11.setSelected(false);
        jCheckBox12.setSelected(false);

        txtcualproblem.setText("");
        jTextArea5.setText("");
        chbxauditivos.setSelected(false);
        chbxneuro.setSelected(false);
        chbxcardio.setSelected(false);
        chbxcenrespir.setSelected(false);
        chbxcenprofe.setSelected(false);
        chbxtratapsico.setSelected(false);
        chbxtratatricos.setSelected(false);
        chbxsistemanervioso.setSelected(false);
        chbxcancer.setSelected(false);
        chbxdiabetes.setSelected(false);
        chbxconsumedi.setSelected(false);
        chbxhospitali.setSelected(false);
        chbxcirugias.setSelected(false);
        chbxtrysuicide.setSelected(false);
        chbxets.setSelected(false);
        chbxvih.setSelected(false);
        chbxparalcuerpo.setSelected(false);
        chbxdisauto.setSelected(false);
        chbxesclerosispoco.setSelected(false);
        chbxescoliosisempe.setSelected(false);
        jLabel75.setVisible(true);
        jCheckBox11.setVisible(true);
        jCheckBox12.setVisible(true);
        EstadoSalud.setVisibilidadflecha("noesvisible");
        nodisp();
        
        jScrollPane7.getVerticalScrollBar().setValue(0);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane7 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel41 = new javax.swing.JLabel();
        chbxauditivos = new javax.swing.JCheckBox();
        chbxneuro = new javax.swing.JCheckBox();
        chbxconsumedi = new javax.swing.JCheckBox();
        chbxtrysuicide = new javax.swing.JCheckBox();
        chbxcirugias = new javax.swing.JCheckBox();
        chbxhospitali = new javax.swing.JCheckBox();
        chbxcenrespir = new javax.swing.JCheckBox();
        chbxets = new javax.swing.JCheckBox();
        chbxcardio = new javax.swing.JCheckBox();
        chbxvih = new javax.swing.JCheckBox();
        chbxcenprofe = new javax.swing.JCheckBox();
        chbxtratapsico = new javax.swing.JCheckBox();
        chbxtratatricos = new javax.swing.JCheckBox();
        jLabel72 = new javax.swing.JLabel();
        txtcualproblem = new javax.swing.JTextField();
        jLabel74 = new javax.swing.JLabel();
        chbxparalcuerpo = new javax.swing.JCheckBox();
        chbxsistemanervioso = new javax.swing.JCheckBox();
        chbxdisauto = new javax.swing.JCheckBox();
        chbxcancer = new javax.swing.JCheckBox();
        chbxdiabetes = new javax.swing.JCheckBox();
        chbxesclerosispoco = new javax.swing.JCheckBox();
        chbxescoliosisempe = new javax.swing.JCheckBox();
        jScrollPane12 = new javax.swing.JScrollPane();
        jTextArea5 = new javax.swing.JTextArea();
        jLabel32 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        jCheckBox6 = new javax.swing.JCheckBox();
        jCheckBox7 = new javax.swing.JCheckBox();
        jCheckBox8 = new javax.swing.JCheckBox();
        jCheckBox9 = new javax.swing.JCheckBox();
        jCheckBox10 = new javax.swing.JCheckBox();
        jCheckBox11 = new javax.swing.JCheckBox();
        jCheckBox12 = new javax.swing.JCheckBox();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(null);
        setPreferredSize(new java.awt.Dimension(975, 550));

        jScrollPane7.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane7.setBorder(null);
        jScrollPane7.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(975, 595));

        jLabel41.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel41.setText("¿Cómo es su estado de salud?");

        chbxauditivos.setBackground(new java.awt.Color(255, 255, 255));
        chbxauditivos.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        chbxauditivos.setText("Problemas auditivos");
        chbxauditivos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chbxauditivosItemStateChanged(evt);
            }
        });
        chbxauditivos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chbxauditivosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                chbxauditivosMouseEntered(evt);
            }
        });

        chbxneuro.setBackground(new java.awt.Color(255, 255, 255));
        chbxneuro.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        chbxneuro.setText("Transtornos neurológicos");
        chbxneuro.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chbxneuroItemStateChanged(evt);
            }
        });
        chbxneuro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chbxneuroMouseClicked(evt);
            }
        });

        chbxconsumedi.setBackground(new java.awt.Color(255, 255, 255));
        chbxconsumedi.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        chbxconsumedi.setText("Consumo medicamentos formulados");
        chbxconsumedi.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chbxconsumediItemStateChanged(evt);
            }
        });
        chbxconsumedi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chbxconsumediMouseClicked(evt);
            }
        });

        chbxtrysuicide.setBackground(new java.awt.Color(255, 255, 255));
        chbxtrysuicide.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        chbxtrysuicide.setText("Intentos de suicidio");
        chbxtrysuicide.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chbxtrysuicideItemStateChanged(evt);
            }
        });
        chbxtrysuicide.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chbxtrysuicideMouseClicked(evt);
            }
        });

        chbxcirugias.setBackground(new java.awt.Color(255, 255, 255));
        chbxcirugias.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        chbxcirugias.setText("Cirugías");
        chbxcirugias.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chbxcirugiasItemStateChanged(evt);
            }
        });
        chbxcirugias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chbxcirugiasMouseClicked(evt);
            }
        });

        chbxhospitali.setBackground(new java.awt.Color(255, 255, 255));
        chbxhospitali.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        chbxhospitali.setText("Hospitalizaciones");
        chbxhospitali.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chbxhospitaliItemStateChanged(evt);
            }
        });
        chbxhospitali.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chbxhospitaliMouseClicked(evt);
            }
        });

        chbxcenrespir.setBackground(new java.awt.Color(255, 255, 255));
        chbxcenrespir.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        chbxcenrespir.setText("Enfermedades respiratorias");
        chbxcenrespir.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chbxcenrespirItemStateChanged(evt);
            }
        });
        chbxcenrespir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chbxcenrespirMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                chbxcenrespirMousePressed(evt);
            }
        });

        chbxets.setBackground(new java.awt.Color(255, 255, 255));
        chbxets.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        chbxets.setText("Enfermedades de transmisión sexual");
        chbxets.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chbxetsItemStateChanged(evt);
            }
        });
        chbxets.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chbxetsMouseClicked(evt);
            }
        });

        chbxcardio.setBackground(new java.awt.Color(255, 255, 255));
        chbxcardio.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        chbxcardio.setText("Enfermedades cardiovasculares");
        chbxcardio.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chbxcardioItemStateChanged(evt);
            }
        });
        chbxcardio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chbxcardioMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                chbxcardioMousePressed(evt);
            }
        });

        chbxvih.setBackground(new java.awt.Color(255, 255, 255));
        chbxvih.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        chbxvih.setText("VIH");
        chbxvih.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chbxvihItemStateChanged(evt);
            }
        });
        chbxvih.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chbxvihMouseClicked(evt);
            }
        });

        chbxcenprofe.setBackground(new java.awt.Color(255, 255, 255));
        chbxcenprofe.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        chbxcenprofe.setText("Enfermedades profesionales");
        chbxcenprofe.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chbxcenprofeItemStateChanged(evt);
            }
        });
        chbxcenprofe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chbxcenprofeMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                chbxcenprofeMousePressed(evt);
            }
        });

        chbxtratapsico.setBackground(new java.awt.Color(255, 255, 255));
        chbxtratapsico.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        chbxtratapsico.setText("Tratamientos psicológicos");
        chbxtratapsico.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chbxtratapsicoItemStateChanged(evt);
            }
        });
        chbxtratapsico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chbxtratapsicoMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                chbxtratapsicoMousePressed(evt);
            }
        });

        chbxtratatricos.setBackground(new java.awt.Color(255, 255, 255));
        chbxtratatricos.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        chbxtratatricos.setText("Tratamientos psiquiátricos");
        chbxtratatricos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chbxtratatricosItemStateChanged(evt);
            }
        });
        chbxtratatricos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chbxtratatricosMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                chbxtratatricosMousePressed(evt);
            }
        });

        jLabel72.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel72.setText("¿Ha tenído problemas de salud que afecten su trabajo?");

        txtcualproblem.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtcualproblem.setToolTipText("");
        txtcualproblem.setBorder(null);
        txtcualproblem.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtcualproblemCaretUpdate(evt);
            }
        });
        txtcualproblem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcualproblemKeyTyped(evt);
            }
        });

        jLabel74.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel74.setText("¿Existen admisiones en su estado de salud?");

        chbxparalcuerpo.setBackground(new java.awt.Color(255, 255, 255));
        chbxparalcuerpo.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        chbxparalcuerpo.setText("Parálisis en una o más partes del cuerpo");
        chbxparalcuerpo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chbxparalcuerpoItemStateChanged(evt);
            }
        });
        chbxparalcuerpo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chbxparalcuerpoMouseClicked(evt);
            }
        });

        chbxsistemanervioso.setBackground(new java.awt.Color(255, 255, 255));
        chbxsistemanervioso.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        chbxsistemanervioso.setText("Problemas del Sistema Nervioso Autónomo");
        chbxsistemanervioso.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chbxsistemanerviosoItemStateChanged(evt);
            }
        });
        chbxsistemanervioso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chbxsistemanerviosoMouseClicked(evt);
            }
        });

        chbxdisauto.setBackground(new java.awt.Color(255, 255, 255));
        chbxdisauto.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        chbxdisauto.setText("Diagnóstico de Disautonomía");
        chbxdisauto.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chbxdisautoItemStateChanged(evt);
            }
        });
        chbxdisauto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chbxdisautoMouseClicked(evt);
            }
        });

        chbxcancer.setBackground(new java.awt.Color(255, 255, 255));
        chbxcancer.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        chbxcancer.setText("Cáncer");
        chbxcancer.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chbxcancerItemStateChanged(evt);
            }
        });
        chbxcancer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chbxcancerMouseClicked(evt);
            }
        });

        chbxdiabetes.setBackground(new java.awt.Color(255, 255, 255));
        chbxdiabetes.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        chbxdiabetes.setText("Diabetes");
        chbxdiabetes.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chbxdiabetesItemStateChanged(evt);
            }
        });
        chbxdiabetes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chbxdiabetesMouseClicked(evt);
            }
        });

        chbxesclerosispoco.setBackground(new java.awt.Color(255, 255, 255));
        chbxesclerosispoco.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        chbxesclerosispoco.setText("Esclerosis");
        chbxesclerosispoco.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chbxesclerosispocoItemStateChanged(evt);
            }
        });
        chbxesclerosispoco.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chbxesclerosispocoMouseClicked(evt);
            }
        });

        chbxescoliosisempe.setBackground(new java.awt.Color(255, 255, 255));
        chbxescoliosisempe.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        chbxescoliosisempe.setText("Escoliosis");
        chbxescoliosisempe.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chbxescoliosisempeItemStateChanged(evt);
            }
        });
        chbxescoliosisempe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chbxescoliosisempeMouseClicked(evt);
            }
        });

        jTextArea5.setColumns(20);
        jTextArea5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextArea5.setRows(5);
        jTextArea5.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextArea5CaretUpdate(evt);
            }
        });
        jTextArea5.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                jTextArea5InputMethodTextChanged(evt);
            }
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
        });
        jTextArea5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextArea5KeyTyped(evt);
            }
        });
        jScrollPane12.setViewportView(jTextArea5);

        jLabel32.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel75.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel75.setText("¿Cumple la persona evaluada con las condiciones para presentar el examen de poligrafía?");

        jCheckBox3.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox3.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jCheckBox3.setText("Excelente");
        jCheckBox3.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox3ItemStateChanged(evt);
            }
        });

        jCheckBox4.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox4.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jCheckBox4.setText("Bueno");
        jCheckBox4.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox4ItemStateChanged(evt);
            }
        });

        jCheckBox5.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox5.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jCheckBox5.setText("Regular");
        jCheckBox5.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox5ItemStateChanged(evt);
            }
        });

        jCheckBox6.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox6.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jCheckBox6.setText("Malo");
        jCheckBox6.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox6ItemStateChanged(evt);
            }
        });

        jCheckBox7.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox7.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jCheckBox7.setText("No");
        jCheckBox7.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox7ItemStateChanged(evt);
            }
        });

        jCheckBox8.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox8.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jCheckBox8.setText("Sí");
        jCheckBox8.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox8ItemStateChanged(evt);
            }
        });

        jCheckBox9.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox9.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jCheckBox9.setText("Sí");
        jCheckBox9.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox9ItemStateChanged(evt);
            }
        });

        jCheckBox10.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox10.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jCheckBox10.setText("No");
        jCheckBox10.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox10ItemStateChanged(evt);
            }
        });

        jCheckBox11.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox11.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jCheckBox11.setText("No");
        jCheckBox11.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox11ItemStateChanged(evt);
            }
        });

        jCheckBox12.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox12.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jCheckBox12.setText("Sí");
        jCheckBox12.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox12ItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtcualproblem, javax.swing.GroupLayout.PREFERRED_SIZE, 731, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel41)
                                .addGap(138, 138, 138)
                                .addComponent(jCheckBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckBox5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckBox6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel72)
                                    .addGap(480, 480, 480)
                                    .addComponent(jCheckBox8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jCheckBox7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel74)
                                    .addGap(552, 552, 552)
                                    .addComponent(jCheckBox9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jCheckBox10, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel75)
                                    .addGap(273, 273, 273)
                                    .addComponent(jCheckBox12, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jCheckBox11, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel32, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane12, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addGap(30, 30, 30))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chbxtratatricos)
                            .addComponent(chbxtratapsico)
                            .addComponent(chbxcenprofe, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chbxcenrespir)
                            .addComponent(chbxcardio)
                            .addComponent(chbxneuro)
                            .addComponent(chbxauditivos)
                            .addComponent(chbxdiabetes)
                            .addComponent(chbxcancer)
                            .addComponent(chbxsistemanervioso))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chbxesclerosispoco)
                            .addComponent(chbxdisauto)
                            .addComponent(chbxescoliosisempe)
                            .addComponent(chbxparalcuerpo)
                            .addComponent(chbxvih)
                            .addComponent(chbxets)
                            .addComponent(chbxtrysuicide)
                            .addComponent(chbxcirugias)
                            .addComponent(chbxhospitali)
                            .addComponent(chbxconsumedi))
                        .addGap(198, 198, 198))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel41)
                    .addComponent(jCheckBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox5, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox6, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel72)
                    .addComponent(jCheckBox8, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox7, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addComponent(txtcualproblem, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel74)
                    .addComponent(jCheckBox9, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox10, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chbxauditivos)
                    .addComponent(chbxconsumedi))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chbxneuro)
                    .addComponent(chbxhospitali))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chbxcardio)
                    .addComponent(chbxcirugias))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chbxcenrespir)
                    .addComponent(chbxtrysuicide))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chbxcenprofe)
                    .addComponent(chbxets))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chbxtratapsico)
                    .addComponent(chbxvih))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chbxtratatricos)
                    .addComponent(chbxparalcuerpo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chbxsistemanervioso)
                    .addComponent(chbxdisauto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chbxcancer)
                    .addComponent(chbxesclerosispoco))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chbxdiabetes)
                    .addComponent(chbxescoliosisempe))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel75)
                    .addComponent(jCheckBox12, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox11, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        txtcualproblem.getAccessibleContext().setAccessibleName("");

        jScrollPane7.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 975, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 975, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 550, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextArea5InputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_jTextArea5InputMethodTextChanged

    }//GEN-LAST:event_jTextArea5InputMethodTextChanged

    private void txtcualproblemCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtcualproblemCaretUpdate
        EstadoSalud.setProb_salud_descrip(txtcualproblem.getText());
    }//GEN-LAST:event_txtcualproblemCaretUpdate

    private void jTextArea5CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextArea5CaretUpdate
        EstadoSalud.setAdmisionEstadoSalud(jTextArea5.getText());
    }//GEN-LAST:event_jTextArea5CaretUpdate

    private void chbxcardioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chbxcardioMousePressed

    }//GEN-LAST:event_chbxcardioMousePressed

    private void chbxcenrespirMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chbxcenrespirMousePressed

    }//GEN-LAST:event_chbxcenrespirMousePressed

    private void chbxcenprofeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chbxcenprofeMousePressed

    }//GEN-LAST:event_chbxcenprofeMousePressed

    private void chbxtratapsicoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chbxtratapsicoMousePressed

    }//GEN-LAST:event_chbxtratapsicoMousePressed

    private void chbxtratatricosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chbxtratatricosMousePressed

    }//GEN-LAST:event_chbxtratatricosMousePressed

    private void chbxauditivosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chbxauditivosMouseClicked


    }//GEN-LAST:event_chbxauditivosMouseClicked

    private void chbxneuroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chbxneuroMouseClicked

    }//GEN-LAST:event_chbxneuroMouseClicked

    private void chbxcardioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chbxcardioMouseClicked

    }//GEN-LAST:event_chbxcardioMouseClicked

    private void chbxcenrespirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chbxcenrespirMouseClicked

    }//GEN-LAST:event_chbxcenrespirMouseClicked

    private void chbxcenprofeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chbxcenprofeMouseClicked

    }//GEN-LAST:event_chbxcenprofeMouseClicked

    private void chbxtratapsicoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chbxtratapsicoMouseClicked

    }//GEN-LAST:event_chbxtratapsicoMouseClicked

    private void chbxtratatricosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chbxtratatricosMouseClicked

    }//GEN-LAST:event_chbxtratatricosMouseClicked

    private void chbxsistemanerviosoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chbxsistemanerviosoMouseClicked

    }//GEN-LAST:event_chbxsistemanerviosoMouseClicked

    private void chbxcancerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chbxcancerMouseClicked

    }//GEN-LAST:event_chbxcancerMouseClicked

    private void chbxdiabetesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chbxdiabetesMouseClicked

    }//GEN-LAST:event_chbxdiabetesMouseClicked

    private void chbxconsumediMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chbxconsumediMouseClicked

    }//GEN-LAST:event_chbxconsumediMouseClicked

    private void chbxhospitaliMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chbxhospitaliMouseClicked

    }//GEN-LAST:event_chbxhospitaliMouseClicked

    private void chbxcirugiasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chbxcirugiasMouseClicked

    }//GEN-LAST:event_chbxcirugiasMouseClicked

    private void chbxtrysuicideMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chbxtrysuicideMouseClicked

    }//GEN-LAST:event_chbxtrysuicideMouseClicked

    private void chbxetsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chbxetsMouseClicked

    }//GEN-LAST:event_chbxetsMouseClicked

    private void chbxvihMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chbxvihMouseClicked

    }//GEN-LAST:event_chbxvihMouseClicked

    private void chbxparalcuerpoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chbxparalcuerpoMouseClicked

    }//GEN-LAST:event_chbxparalcuerpoMouseClicked

    private void chbxdisautoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chbxdisautoMouseClicked

    }//GEN-LAST:event_chbxdisautoMouseClicked

    private void chbxesclerosispocoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chbxesclerosispocoMouseClicked

    }//GEN-LAST:event_chbxesclerosispocoMouseClicked

    private void chbxescoliosisempeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chbxescoliosisempeMouseClicked

    }//GEN-LAST:event_chbxescoliosisempeMouseClicked

    private void chbxauditivosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chbxauditivosMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_chbxauditivosMouseEntered

    private void chbxauditivosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chbxauditivosItemStateChanged
        if (chbxauditivos.isSelected()) {
            EstadoSalud.setTipoproblema1("hay");
        } else if (!chbxauditivos.isSelected()) {
            EstadoSalud.setTipoproblema1("nohay");
        }
    }//GEN-LAST:event_chbxauditivosItemStateChanged

    private void chbxneuroItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chbxneuroItemStateChanged
        if (chbxneuro.isSelected()) {
            EstadoSalud.setTipoproblema2("hay");
        } else if (!chbxneuro.isSelected()) {
            EstadoSalud.setTipoproblema2("nohay");
        }
    }//GEN-LAST:event_chbxneuroItemStateChanged

    private void chbxcardioItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chbxcardioItemStateChanged
        if (chbxcardio.isSelected()) {
            EstadoSalud.setTipoproblema3("hay");
        } else if (!chbxcardio.isSelected()) {
            EstadoSalud.setTipoproblema3("nohay");
        }
    }//GEN-LAST:event_chbxcardioItemStateChanged

    private void chbxcenrespirItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chbxcenrespirItemStateChanged
        if (chbxcenrespir.isSelected()) {
            EstadoSalud.setTipoproblema4("hay");
        } else if (!chbxcenrespir.isSelected()) {
            EstadoSalud.setTipoproblema4("nohay");
        }
    }//GEN-LAST:event_chbxcenrespirItemStateChanged

    private void chbxcenprofeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chbxcenprofeItemStateChanged
        if (chbxcenprofe.isSelected()) {
            EstadoSalud.setTipoproblema5("hay");
        } else if (!chbxcenprofe.isSelected()) {
            EstadoSalud.setTipoproblema5("nohay");
        }
    }//GEN-LAST:event_chbxcenprofeItemStateChanged

    private void chbxtratapsicoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chbxtratapsicoItemStateChanged
        if (chbxtratapsico.isSelected()) {
            EstadoSalud.setTipoproblema6("hay");
        } else if (!chbxtratapsico.isSelected()) {
            EstadoSalud.setTipoproblema6("nohay");
        }
    }//GEN-LAST:event_chbxtratapsicoItemStateChanged

    private void chbxtratatricosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chbxtratatricosItemStateChanged
        if (chbxtratatricos.isSelected()) {
            EstadoSalud.setTipoproblema7("hay");
        } else if (!chbxtratatricos.isSelected()) {
            EstadoSalud.setTipoproblema7("nohay");
        }
    }//GEN-LAST:event_chbxtratatricosItemStateChanged

    private void chbxsistemanerviosoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chbxsistemanerviosoItemStateChanged
        if (chbxsistemanervioso.isSelected()) {
            EstadoSalud.setTipoproblema8("hay");
        } else if (!chbxsistemanervioso.isSelected()) {
            EstadoSalud.setTipoproblema8("nohay");
        }
    }//GEN-LAST:event_chbxsistemanerviosoItemStateChanged

    private void chbxcancerItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chbxcancerItemStateChanged
        if (chbxcancer.isSelected()) {
            EstadoSalud.setTipoproblema9("hay");
        } else if (!chbxcancer.isSelected()) {
            EstadoSalud.setTipoproblema9("nohay");
        }
    }//GEN-LAST:event_chbxcancerItemStateChanged

    private void chbxdiabetesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chbxdiabetesItemStateChanged
        if (chbxdiabetes.isSelected()) {
            EstadoSalud.setTipoproblema10("hay");
        } else if (!chbxdiabetes.isSelected()) {
            EstadoSalud.setTipoproblema10("nohay");
        }
    }//GEN-LAST:event_chbxdiabetesItemStateChanged

    private void chbxconsumediItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chbxconsumediItemStateChanged
        if (chbxconsumedi.isSelected()) {
            EstadoSalud.setTipoproblema11("hay");
        } else if (!chbxconsumedi.isSelected()) {
            EstadoSalud.setTipoproblema11("nohay");
        }
    }//GEN-LAST:event_chbxconsumediItemStateChanged

    private void chbxhospitaliItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chbxhospitaliItemStateChanged
        if (chbxhospitali.isSelected()) {
            EstadoSalud.setTipoproblema12("hay");
        } else if (!chbxhospitali.isSelected()) {
            EstadoSalud.setTipoproblema12("nohay");
        }
    }//GEN-LAST:event_chbxhospitaliItemStateChanged

    private void chbxcirugiasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chbxcirugiasItemStateChanged
        if (chbxcirugias.isSelected()) {
            EstadoSalud.setTipoproblema13("hay");
        } else if (!chbxcirugias.isSelected()) {
            EstadoSalud.setTipoproblema13("nohay");
        }
    }//GEN-LAST:event_chbxcirugiasItemStateChanged

    private void chbxtrysuicideItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chbxtrysuicideItemStateChanged
        if (chbxtrysuicide.isSelected()) {
            EstadoSalud.setTipoproblema14("hay");
        } else if (!chbxtrysuicide.isSelected()) {
            EstadoSalud.setTipoproblema14("nohay");
        }
    }//GEN-LAST:event_chbxtrysuicideItemStateChanged

    private void chbxetsItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chbxetsItemStateChanged
        if (chbxets.isSelected()) {
            EstadoSalud.setTipoproblema15("hay");
        } else if (!chbxets.isSelected()) {
            EstadoSalud.setTipoproblema15("nohay");
        }
    }//GEN-LAST:event_chbxetsItemStateChanged

    private void chbxvihItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chbxvihItemStateChanged
        if (chbxvih.isSelected()) {
            EstadoSalud.setTipoproblema16("hay");
        } else if (!chbxvih.isSelected()) {
            EstadoSalud.setTipoproblema16("nohay");
        }
    }//GEN-LAST:event_chbxvihItemStateChanged

    private void chbxparalcuerpoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chbxparalcuerpoItemStateChanged
        if (chbxparalcuerpo.isSelected()) {
            EstadoSalud.setTipoproblema17("hay");
        } else if (!chbxparalcuerpo.isSelected()) {
            EstadoSalud.setTipoproblema17("nohay");
        }
    }//GEN-LAST:event_chbxparalcuerpoItemStateChanged

    private void chbxdisautoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chbxdisautoItemStateChanged
        if (chbxdisauto.isSelected()) {
            EstadoSalud.setTipoproblema18("hay");
        } else if (!chbxdisauto.isSelected()) {
            EstadoSalud.setTipoproblema18("nohay");
        }
    }//GEN-LAST:event_chbxdisautoItemStateChanged

    private void chbxesclerosispocoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chbxesclerosispocoItemStateChanged
        if (chbxesclerosispoco.isSelected()) {
            EstadoSalud.setTipoproblema19("hay");
        } else if (!chbxesclerosispoco.isSelected()) {
            EstadoSalud.setTipoproblema19("nohay");
        }
    }//GEN-LAST:event_chbxesclerosispocoItemStateChanged

    private void chbxescoliosisempeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chbxescoliosisempeItemStateChanged
        if (chbxescoliosisempe.isSelected()) {
            EstadoSalud.setTipoproblema20("hay");
        } else if (!chbxescoliosisempe.isSelected()) {
            EstadoSalud.setTipoproblema20("nohay");
        }
    }//GEN-LAST:event_chbxescoliosisempeItemStateChanged

    private void jCheckBox3ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox3ItemStateChanged
        if (jCheckBox3.isSelected()) {
            EstadoSalud.setEstado_salud("excelente");
            jCheckBox4.setSelected(false);
            jCheckBox5.setSelected(false);
            jCheckBox6.setSelected(false);
        } else if ((!jCheckBox3.isSelected())) {
            EstadoSalud.setEstado_salud("-");
        }
    }//GEN-LAST:event_jCheckBox3ItemStateChanged

    private void jCheckBox4ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox4ItemStateChanged
        if (jCheckBox4.isSelected()) {
            EstadoSalud.setEstado_salud("bueno");
            jCheckBox3.setSelected(false);
            jCheckBox5.setSelected(false);
            jCheckBox6.setSelected(false);
        } else if ((!jCheckBox4.isSelected())) {
            EstadoSalud.setEstado_salud("-");
        }
    }//GEN-LAST:event_jCheckBox4ItemStateChanged

    private void jCheckBox5ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox5ItemStateChanged
        if (jCheckBox5.isSelected()) {
            EstadoSalud.setEstado_salud("regular");
            jCheckBox3.setSelected(false);
            jCheckBox4.setSelected(false);
            jCheckBox6.setSelected(false);
        } else if ((!jCheckBox5.isSelected())) {
            EstadoSalud.setEstado_salud("-");
        }
    }//GEN-LAST:event_jCheckBox5ItemStateChanged

    private void jCheckBox6ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox6ItemStateChanged
        if (jCheckBox6.isSelected()) {
            EstadoSalud.setEstado_salud("malo");
            jCheckBox3.setSelected(false);
            jCheckBox5.setSelected(false);
            jCheckBox4.setSelected(false);
        } else if ((!jCheckBox6.isSelected())) {
            EstadoSalud.setEstado_salud("-");
        }
    }//GEN-LAST:event_jCheckBox6ItemStateChanged

    private void jCheckBox7ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox7ItemStateChanged
        if (jCheckBox7.isSelected()) {
            jCheckBox8.setSelected(false);
            EstadoSalud.setProb_salud("No");
            jLabel32.setVisible(false);
            txtcualproblem.setVisible(false);
        } else {
            EstadoSalud.setProb_salud("-");
            txtcualproblem.setVisible(false);
            jLabel32.setVisible(false);
        }
    }//GEN-LAST:event_jCheckBox7ItemStateChanged

    private void jCheckBox8ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox8ItemStateChanged
        if (jCheckBox8.isSelected()) {
            jCheckBox7.setSelected(false);
            EstadoSalud.setProb_salud("Sí");
            jLabel32.setVisible(true);
            txtcualproblem.setVisible(true);
        } else {
            EstadoSalud.setProb_salud("-");
            txtcualproblem.setVisible(false);
            jLabel32.setVisible(false);
        }

    }//GEN-LAST:event_jCheckBox8ItemStateChanged

    private void jCheckBox9ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox9ItemStateChanged
        if (jCheckBox9.isSelected()) {
            jCheckBox10.setSelected(false);
            Admisiones.setAdmES("hay");
            jTextArea5.setVisible(true);
            chbxauditivos.setEnabled(true);
            chbxneuro.setEnabled(true);
            chbxcardio.setEnabled(true);
            chbxcenrespir.setEnabled(true);
            chbxcenprofe.setEnabled(true);
            chbxtratapsico.setEnabled(true);
            chbxtratatricos.setEnabled(true);
            chbxsistemanervioso.setEnabled(true);
            chbxcancer.setEnabled(true);
            chbxdiabetes.setEnabled(true);
            chbxconsumedi.setEnabled(true);
            chbxhospitali.setEnabled(true);
            chbxcirugias.setEnabled(true);
            chbxtrysuicide.setEnabled(true);
            chbxets.setEnabled(true);
            chbxvih.setEnabled(true);
            chbxparalcuerpo.setEnabled(true);
            chbxdisauto.setEnabled(true);
            chbxesclerosispoco.setEnabled(true);
            chbxescoliosisempe.setEnabled(true);
        } else {
            Admisiones.setAdmES("nohay");
            jTextArea5.setVisible(false);
            chbxauditivos.setEnabled(false);
            chbxneuro.setEnabled(false);
            chbxcardio.setEnabled(false);
            chbxcenrespir.setEnabled(false);
            chbxcenprofe.setEnabled(false);
            chbxtratapsico.setEnabled(false);
            chbxtratatricos.setEnabled(false);
            chbxsistemanervioso.setEnabled(false);
            chbxcancer.setEnabled(false);
            chbxdiabetes.setEnabled(false);
            chbxconsumedi.setEnabled(false);
            chbxhospitali.setEnabled(false);
            chbxcirugias.setEnabled(false);
            chbxtrysuicide.setEnabled(false);
            chbxets.setEnabled(false);
            chbxvih.setEnabled(false);
            chbxparalcuerpo.setEnabled(false);
            chbxdisauto.setEnabled(false);
            chbxesclerosispoco.setEnabled(false);
            chbxescoliosisempe.setEnabled(false);
        }
    }//GEN-LAST:event_jCheckBox9ItemStateChanged

    private void jCheckBox10ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox10ItemStateChanged
        if (jCheckBox10.isSelected()) {
            jCheckBox9.setSelected(false);
            Admisiones.setAdmES("nohay");
            jTextArea5.setVisible(false);
            chbxauditivos.setEnabled(false);
            chbxneuro.setEnabled(false);
            chbxcardio.setEnabled(false);
            chbxcenrespir.setEnabled(false);
            chbxcenprofe.setEnabled(false);
            chbxtratapsico.setEnabled(false);
            chbxtratatricos.setEnabled(false);
            chbxsistemanervioso.setEnabled(false);
            chbxcancer.setEnabled(false);
            chbxdiabetes.setEnabled(false);
            chbxconsumedi.setEnabled(false);
            chbxhospitali.setEnabled(false);
            chbxcirugias.setEnabled(false);
            chbxtrysuicide.setEnabled(false);
            chbxets.setEnabled(false);
            chbxvih.setEnabled(false);
            chbxparalcuerpo.setEnabled(false);
            chbxdisauto.setEnabled(false);
            chbxesclerosispoco.setEnabled(false);
            chbxescoliosisempe.setEnabled(false);
        } else {
            Admisiones.setAdmES("nohay");
            jTextArea5.setVisible(false);
            chbxauditivos.setEnabled(false);
            chbxneuro.setEnabled(false);
            chbxcardio.setEnabled(false);
            chbxcenrespir.setEnabled(false);
            chbxcenprofe.setEnabled(false);
            chbxtratapsico.setEnabled(false);
            chbxtratatricos.setEnabled(false);
            chbxsistemanervioso.setEnabled(false);
            chbxcancer.setEnabled(false);
            chbxdiabetes.setEnabled(false);
            chbxconsumedi.setEnabled(false);
            chbxhospitali.setEnabled(false);
            chbxcirugias.setEnabled(false);
            chbxtrysuicide.setEnabled(false);
            chbxets.setEnabled(false);
            chbxvih.setEnabled(false);
            chbxparalcuerpo.setEnabled(false);
            chbxdisauto.setEnabled(false);
            chbxesclerosispoco.setEnabled(false);
            chbxescoliosisempe.setEnabled(false);
        }
    }//GEN-LAST:event_jCheckBox10ItemStateChanged

    private void jCheckBox11ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox11ItemStateChanged
        if (jCheckBox11.isSelected()) {
            DatoGeneral.fechaderecha.setVisible(false);
            EstadoSalud.setVisibilidadflecha("noesvisible");
        }
    }//GEN-LAST:event_jCheckBox11ItemStateChanged

    private void jCheckBox12ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox12ItemStateChanged
        if (jCheckBox12.isSelected()) {
            EstadoSalud.setVisibilidadflecha("esvisible");
            jLabel75.setVisible(false);
            jCheckBox11.setVisible(false);
            jCheckBox11.setSelected(false);
            jCheckBox12.setVisible(false);
            DatoGeneral.fechaderecha.setVisible(true);
            jLabel4.setEnabled(true);
            jLabel10.setEnabled(true);
            jLabel5.setEnabled(true);
            jLabel13.setEnabled(true);
            jLabel6.setEnabled(true);
            jLabel7.setEnabled(true);
            jLabel8.setEnabled(true);
            jLabel9.setEnabled(true);
            jLabel11.setEnabled(true);
            jLabel12.setEnabled(true);
            jLabel14.setEnabled(true);
            jLabel15.setEnabled(true);
            jLabel18.setEnabled(true);
        } else {
            DatoGeneral.fechaderecha.setVisible(false);
            EstadoSalud.setVisibilidadflecha("noesvisible");
        }
    }//GEN-LAST:event_jCheckBox12ItemStateChanged

    private void txtcualproblemKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcualproblemKeyTyped
        int k = (int) evt.getKeyChar();
        if (k == 39) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "¡No se acepta ese tipo de carácter!", "Error de datos ingresados", JOptionPane.ERROR_MESSAGE, iconThinking_uh);
        }
        InputMap map = txtcualproblem.getInputMap(JTextField.WHEN_FOCUSED);
//        map.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, CTRL_MASK), "null");
    }//GEN-LAST:event_txtcualproblemKeyTyped

    private void jTextArea5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextArea5KeyTyped
        int k = (int) evt.getKeyChar();
        if (k == 39) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "¡No se acepta ese tipo de carácter!", "Error de datos ingresados", JOptionPane.ERROR_MESSAGE, iconThinking_uh);
        }
        InputMap map = jTextArea5.getInputMap(JTextField.WHEN_FOCUSED);
//        map.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, CTRL_MASK), "null");
    }//GEN-LAST:event_jTextArea5KeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox chbxauditivos;
    private javax.swing.JCheckBox chbxcancer;
    private javax.swing.JCheckBox chbxcardio;
    private javax.swing.JCheckBox chbxcenprofe;
    private javax.swing.JCheckBox chbxcenrespir;
    private javax.swing.JCheckBox chbxcirugias;
    private javax.swing.JCheckBox chbxconsumedi;
    private javax.swing.JCheckBox chbxdiabetes;
    private javax.swing.JCheckBox chbxdisauto;
    private javax.swing.JCheckBox chbxesclerosispoco;
    private javax.swing.JCheckBox chbxescoliosisempe;
    private javax.swing.JCheckBox chbxets;
    private javax.swing.JCheckBox chbxhospitali;
    private javax.swing.JCheckBox chbxneuro;
    private javax.swing.JCheckBox chbxparalcuerpo;
    private javax.swing.JCheckBox chbxsistemanervioso;
    private javax.swing.JCheckBox chbxtratapsico;
    private javax.swing.JCheckBox chbxtratatricos;
    private javax.swing.JCheckBox chbxtrysuicide;
    private javax.swing.JCheckBox chbxvih;
    private javax.swing.JCheckBox jCheckBox10;
    private javax.swing.JCheckBox jCheckBox11;
    private javax.swing.JCheckBox jCheckBox12;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JCheckBox jCheckBox7;
    private javax.swing.JCheckBox jCheckBox8;
    private javax.swing.JCheckBox jCheckBox9;
    private javax.swing.JLabel jLabel32;
    public static javax.swing.JLabel jLabel41;
    public static javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTextArea jTextArea5;
    private javax.swing.JTextField txtcualproblem;
    // End of variables declaration//GEN-END:variables

}
