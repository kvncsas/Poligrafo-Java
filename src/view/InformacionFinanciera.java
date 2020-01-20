package view;

import classes.Admisiones;
import classes.InfoFinanciera;
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
public class InformacionFinanciera extends javax.swing.JInternalFrame {

    public InformacionFinanciera() {
        ((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI()).setNorthPane(null);
        initComponents();
        indispuestos();
        jScrollPane16.getVerticalScrollBar().setUnitIncrement(15);
        guiasinfo_finan();
    }

    public void guiasinfo_finan() {
        CorrectorOrtografia p1 = new CorrectorOrtografia("(explicación) se sostiene económicamente con...", txtsalariodeven);
        CorrectorOrtografia p2 = new CorrectorOrtografia("Recibe un ingreso adicional a su salario...", txtactilaboexpli);
        CorrectorOrtografia p3 = new CorrectorOrtografia("Afirmó...", txtliquidacion);
        CorrectorOrtografia p4 = new CorrectorOrtografia("Aseguró tener...", txtahorros);
        CorrectorOrtografia p5 = new CorrectorOrtografia("Aclaró que recibe...", txtcantapoyopadres);
        CorrectorOrtografia p6 = new CorrectorOrtografia("Explicó que...", txtparejaingresos);
        CorrectorOrtografia p7 = new CorrectorOrtografia("Contó...", txtparejaingresos1);
        CorrectorOrtografia p13 = new CorrectorOrtografia("Escriba la propiedad", txtexpfincara1);
        CorrectorOrtografia p14 = new CorrectorOrtografia("Escriba la obligación", txtexpfincara2);
        CorrectorOrtografia p12 = new CorrectorOrtografia("Afirmó...", txtparejaingresos2);
        CorrectorOrtografia p9 = new CorrectorOrtografia("Mencionó...", txtgastosmensuales1);
        CorrectorOrtografia p10 = new CorrectorOrtografia("Como gastos mensuales reportó la suma de...", txtgastosmensuales);
        CorrectorOrtografia p11 = new CorrectorOrtografia("Comentó que actualmente tiene...", txtexpfincara);
        CorrectorOrtografia p15 = new CorrectorOrtografia("Dijo...", txtparejaingresos3);

        SpellChecker.register(txtsalariodeven);
        SpellChecker.register(txtactilaboexpli);
        SpellChecker.register(txtliquidacion);
        SpellChecker.register(txtahorros);
        SpellChecker.register(txtcantapoyopadres);
        SpellChecker.register(txtparejaingresos);
        SpellChecker.register(txtparejaingresos1);
        SpellChecker.register(txtparejaingresos2);
        SpellChecker.register(txtgastosmensuales1);
        SpellChecker.register(txtgastosmensuales);
        SpellChecker.register(txtexpfincara);
        SpellChecker.register(txtparejaingresos3);
    }

    public void indispuestos() {
        chbxlibreinver.setEnabled(false);
        chbxhipote.setEnabled(false);
        chbxvehiculo.setEnabled(false);
        chbxgotagota.setEnabled(false);
        chbxpernatural.setEnabled(false);
        chbxtarjcredi.setEnabled(false);
        chbxvehiculos2.setEnabled(false);

        jLabel32.setVisible(false);
        txtfamiliape1.setVisible(false);
        jLabel61.setVisible(false);
        txtparejaingresos3.setVisible(false);
        chbxotros.setVisible(false);
        jLabel66.setVisible(false);
        txtexpfincara1.setVisible(false);

        txtexpfincara2.setVisible(false);
        jLabel68.setVisible(false);

        jRadioButton1.setSelected(false);
        jRadioButton2.setSelected(false);
        jRadioButton3.setSelected(false);
        jRadioButton4.setSelected(false);
        jRadioButton5.setSelected(false);
        jRadioButton6.setSelected(false);
        jRadioButton7.setSelected(false);
        jRadioButton8.setSelected(false);
        jRadioButton9.setSelected(false);
        jRadioButton10.setSelected(false);

        jRadioButton1.setVisible(false);
        jRadioButton2.setVisible(false);
        jRadioButton3.setVisible(false);
        jRadioButton4.setVisible(false);
        jRadioButton5.setVisible(false);
        jRadioButton6.setVisible(false);
        jRadioButton9.setVisible(false);

        txtsalariodeven.setVisible(false);
        jLabel67.setVisible(false);
        txtsalariodeven.setVisible(false);
        txtactilaboexpli.setVisible(false);
        txtliquidacion.setVisible(false);
        txtahorros.setVisible(false);
        txtcantapoyopadres.setVisible(false);
        txtparejaingresos.setVisible(false);
        txtgastosmensuales1.setVisible(false);
        chbxfincaraiz.setVisible(false);
        txtexpfincara.setVisible(false);
        chbxvehiculos.setVisible(false);
        jLabel62.setVisible(false);
        jLabel63.setVisible(false);
        jLabel64.setVisible(false);
        jLabel65.setVisible(false);
        jLabel60.setVisible(false);
        jLabel58.setVisible(false);
        jLabel56.setVisible(false);
        jLabel55.setVisible(false);
        jLabel51.setVisible(false);
        txtparejaingresos1.setVisible(false);
        txtparejaingresos2.setVisible(false);

        jRadioButton7.setVisible(false);
        jRadioButton8.setVisible(false);
        jRadioButton10.setVisible(false);
    }

    public void limpiar() {
        jCheckBox1.setSelected(false);
        jCheckBox2.setSelected(false);
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
        jCheckBox13.setSelected(false);
        jCheckBox14.setSelected(false);
        jCheckBox15.setSelected(false);
        jCheckBox16.setSelected(false);
        jCheckBox17.setSelected(false);
        jCheckBox18.setSelected(false);
        jCheckBox19.setSelected(false);
        jCheckBox20.setSelected(false);
        jCheckBox21.setSelected(false);
        jCheckBox22.setSelected(false);
        jCheckBox23.setSelected(false);
        jCheckBox24.setSelected(false);
        jCheckBox25.setSelected(false);
        jCheckBox27.setSelected(false);
        jCheckBox28.setSelected(false);
        
        chbxvehiculos2.setSelected(false);

        chbxlibreinver.setSelected(false);
        chbxhipote.setSelected(false);
        chbxvehiculo.setSelected(false);
        chbxgotagota.setSelected(false);
        chbxpernatural.setSelected(false);
        chbxtarjcredi.setSelected(false);
        chbxfincaraiz.setSelected(false);
        chbxvehiculos.setSelected(false);
        chbxotros.setSelected(false);

        txtsalariodeven.setText("");
        txtactilaboexpli.setText("");
        txtliquidacion.setText("");
        txtahorros.setText("");
        txtcantapoyopadres.setText("");
        txtparejaingresos.setText("");
        txtparejaingresos1.setText("");
        txtparejaingresos2.setText("");
        txtgastosmensuales1.setText("");
        txtgastosmensuales.setText("");
        txtexpfincara.setText("");
        txtexpfincara2.setText("");
        txtexpfincara1.setText("");
        
        jScrollPane16.getVerticalScrollBar().setValue(0);
    }

    Thinking_uh iconThinking_uh = new Thinking_uh();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane16 = new javax.swing.JScrollPane();
        jPanel10 = new javax.swing.JPanel();
        jLabel46 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        chbxlibreinver = new javax.swing.JCheckBox();
        chbxhipote = new javax.swing.JCheckBox();
        chbxgotagota = new javax.swing.JCheckBox();
        chbxvehiculo = new javax.swing.JCheckBox();
        chbxpernatural = new javax.swing.JCheckBox();
        chbxtarjcredi = new javax.swing.JCheckBox();
        suparejatieneingresos = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        txtactilaboexpli = new javax.swing.JTextField();
        jLabel106 = new javax.swing.JLabel();
        txtliquidacion = new javax.swing.JTextField();
        txtahorros = new javax.swing.JTextField();
        jLabel107 = new javax.swing.JLabel();
        jLabel108 = new javax.swing.JLabel();
        txtcantapoyopadres = new javax.swing.JTextField();
        txtparejaingresos = new javax.swing.JTextField();
        txtgastosmensuales = new javax.swing.JTextField();
        jLabel57 = new javax.swing.JLabel();
        chbxfincaraiz = new javax.swing.JCheckBox();
        chbxvehiculos = new javax.swing.JCheckBox();
        txtexpfincara = new javax.swing.JTextField();
        txtgastosmensuales1 = new javax.swing.JTextField();
        suparejatieneingresos1 = new javax.swing.JLabel();
        suparejatieneingresos2 = new javax.swing.JLabel();
        txtparejaingresos1 = new javax.swing.JTextField();
        txtparejaingresos2 = new javax.swing.JTextField();
        jLabel51 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        txtsalariodeven = new javax.swing.JTextField();
        jLabel67 = new javax.swing.JLabel();
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
        jCheckBox13 = new javax.swing.JCheckBox();
        jCheckBox14 = new javax.swing.JCheckBox();
        jCheckBox15 = new javax.swing.JCheckBox();
        jCheckBox16 = new javax.swing.JCheckBox();
        jCheckBox17 = new javax.swing.JCheckBox();
        jCheckBox18 = new javax.swing.JCheckBox();
        jCheckBox19 = new javax.swing.JCheckBox();
        jCheckBox20 = new javax.swing.JCheckBox();
        jCheckBox21 = new javax.swing.JCheckBox();
        jCheckBox22 = new javax.swing.JCheckBox();
        jCheckBox23 = new javax.swing.JCheckBox();
        jCheckBox24 = new javax.swing.JCheckBox();
        jCheckBox25 = new javax.swing.JCheckBox();
        jLabel45 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jLabel32 = new javax.swing.JLabel();
        txtfamiliape1 = new javax.swing.JTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        jRadioButton9 = new javax.swing.JRadioButton();
        suparejatieneingresos3 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        txtparejaingresos3 = new javax.swing.JTextField();
        jCheckBox27 = new javax.swing.JCheckBox();
        jCheckBox28 = new javax.swing.JCheckBox();
        chbxotros = new javax.swing.JCheckBox();
        jLabel66 = new javax.swing.JLabel();
        txtexpfincara1 = new javax.swing.JTextField();
        chbxvehiculos2 = new javax.swing.JCheckBox();
        jLabel68 = new javax.swing.JLabel();
        txtexpfincara2 = new javax.swing.JTextField();
        jRadioButton7 = new javax.swing.JRadioButton();
        jRadioButton8 = new javax.swing.JRadioButton();
        jRadioButton10 = new javax.swing.JRadioButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(null);
        setPreferredSize(new java.awt.Dimension(975, 550));

        jScrollPane16.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane16.setBorder(null);
        jScrollPane16.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane16.setPreferredSize(new java.awt.Dimension(975, 550));

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));

        jLabel46.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel46.setText("¿Cuál es su situación económica actual?");

        jLabel52.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel52.setText("¿Tiene usted ingresos mensuales?");

        jLabel54.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel54.setText("¿Tiene usted actividades laborales independientes?");

        jLabel59.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel59.setText("¿Tiene usted obligaciones financieras?");

        chbxlibreinver.setBackground(new java.awt.Color(255, 255, 255));
        chbxlibreinver.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        chbxlibreinver.setText("Prestamos de libre inversión");
        chbxlibreinver.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chbxlibreinverItemStateChanged(evt);
            }
        });

        chbxhipote.setBackground(new java.awt.Color(255, 255, 255));
        chbxhipote.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        chbxhipote.setText("Prestamos hipotecarios");
        chbxhipote.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chbxhipoteItemStateChanged(evt);
            }
        });

        chbxgotagota.setBackground(new java.awt.Color(255, 255, 255));
        chbxgotagota.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        chbxgotagota.setText("Préstamo gota a gota");
        chbxgotagota.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chbxgotagotaItemStateChanged(evt);
            }
        });

        chbxvehiculo.setBackground(new java.awt.Color(255, 255, 255));
        chbxvehiculo.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        chbxvehiculo.setText("Préstamo para vehículo");
        chbxvehiculo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chbxvehiculoItemStateChanged(evt);
            }
        });

        chbxpernatural.setBackground(new java.awt.Color(255, 255, 255));
        chbxpernatural.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        chbxpernatural.setText("Prestamos persona natural");
        chbxpernatural.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chbxpernaturalItemStateChanged(evt);
            }
        });

        chbxtarjcredi.setBackground(new java.awt.Color(255, 255, 255));
        chbxtarjcredi.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        chbxtarjcredi.setText("Tarjetas de credito");
        chbxtarjcredi.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chbxtarjcrediItemStateChanged(evt);
            }
        });

        suparejatieneingresos.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        suparejatieneingresos.setText("¿Su pareja tiene ingresos?");

        jLabel48.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel48.setText("Gastos mensuales:");

        txtactilaboexpli.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtactilaboexpli.setBorder(null);
        txtactilaboexpli.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtactilaboexpliCaretUpdate(evt);
            }
        });
        txtactilaboexpli.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtactilaboexpliKeyTyped(evt);
            }
        });

        jLabel106.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel106.setText("¿Tiene usted liquidación de algún empleo?");

        txtliquidacion.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtliquidacion.setBorder(null);
        txtliquidacion.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtliquidacionCaretUpdate(evt);
            }
        });
        txtliquidacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtliquidacionKeyTyped(evt);
            }
        });

        txtahorros.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtahorros.setBorder(null);
        txtahorros.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtahorrosCaretUpdate(evt);
            }
        });
        txtahorros.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtahorrosKeyTyped(evt);
            }
        });

        jLabel107.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel107.setText("¿Tiene usted ahorros?");

        jLabel108.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel108.setText("¿Recibe usted apoyo financiero de sus padres?");

        txtcantapoyopadres.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtcantapoyopadres.setBorder(null);
        txtcantapoyopadres.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtcantapoyopadresCaretUpdate(evt);
            }
        });
        txtcantapoyopadres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcantapoyopadresActionPerformed(evt);
            }
        });
        txtcantapoyopadres.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcantapoyopadresKeyTyped(evt);
            }
        });

        txtparejaingresos.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtparejaingresos.setBorder(null);
        txtparejaingresos.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtparejaingresosCaretUpdate(evt);
            }
        });
        txtparejaingresos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtparejaingresosKeyTyped(evt);
            }
        });

        txtgastosmensuales.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtgastosmensuales.setBorder(null);
        txtgastosmensuales.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtgastosmensualesCaretUpdate(evt);
            }
        });
        txtgastosmensuales.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtgastosmensualesKeyTyped(evt);
            }
        });

        jLabel57.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel57.setText("¿Tiene usted propiedades?");

        chbxfincaraiz.setBackground(new java.awt.Color(255, 255, 255));
        chbxfincaraiz.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        chbxfincaraiz.setText("Finca raíz");
        chbxfincaraiz.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chbxfincaraizItemStateChanged(evt);
            }
        });

        chbxvehiculos.setBackground(new java.awt.Color(255, 255, 255));
        chbxvehiculos.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        chbxvehiculos.setText("Vehículos");
        chbxvehiculos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chbxvehiculosItemStateChanged(evt);
            }
        });

        txtexpfincara.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtexpfincara.setBorder(null);
        txtexpfincara.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtexpfincaraCaretUpdate(evt);
            }
        });
        txtexpfincara.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtexpfincaraKeyTyped(evt);
            }
        });

        txtgastosmensuales1.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtgastosmensuales1.setBorder(null);
        txtgastosmensuales1.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtgastosmensuales1CaretUpdate(evt);
            }
        });
        txtgastosmensuales1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtgastosmensuales1KeyTyped(evt);
            }
        });

        suparejatieneingresos1.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        suparejatieneingresos1.setText("¿Ha tenido usted algún embargo?");

        suparejatieneingresos2.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        suparejatieneingresos2.setText("¿Ha sido usted reportado negativamente en centrales de riesgo?");

        txtparejaingresos1.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtparejaingresos1.setBorder(null);
        txtparejaingresos1.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtparejaingresos1CaretUpdate(evt);
            }
        });
        txtparejaingresos1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtparejaingresos1KeyTyped(evt);
            }
        });

        txtparejaingresos2.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtparejaingresos2.setBorder(null);
        txtparejaingresos2.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtparejaingresos2CaretUpdate(evt);
            }
        });
        txtparejaingresos2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtparejaingresos2KeyTyped(evt);
            }
        });

        jLabel51.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel53.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel55.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel56.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel58.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel60.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel62.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel63.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel64.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel65.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtsalariodeven.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtsalariodeven.setBorder(null);
        txtsalariodeven.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtsalariodevenCaretUpdate(evt);
            }
        });
        txtsalariodeven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsalariodevenActionPerformed(evt);
            }
        });
        txtsalariodeven.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtsalariodevenKeyTyped(evt);
            }
        });

        jLabel67.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jCheckBox3.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox3.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jCheckBox3.setText("Buena");
        jCheckBox3.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox3ItemStateChanged(evt);
            }
        });

        jCheckBox4.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox4.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jCheckBox4.setText("Regular");
        jCheckBox4.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox4ItemStateChanged(evt);
            }
        });

        jCheckBox5.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox5.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jCheckBox5.setText("No");
        jCheckBox5.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox5ItemStateChanged(evt);
            }
        });

        jCheckBox6.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox6.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jCheckBox6.setText("Sí");
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
        jCheckBox9.setText("No");
        jCheckBox9.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox9ItemStateChanged(evt);
            }
        });

        jCheckBox10.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox10.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jCheckBox10.setText("Sí");
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

        jCheckBox13.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox13.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jCheckBox13.setText("No");
        jCheckBox13.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox13ItemStateChanged(evt);
            }
        });

        jCheckBox14.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox14.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jCheckBox14.setText("Sí");
        jCheckBox14.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox14ItemStateChanged(evt);
            }
        });

        jCheckBox15.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox15.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jCheckBox15.setText("No");
        jCheckBox15.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox15ItemStateChanged(evt);
            }
        });

        jCheckBox16.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox16.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jCheckBox16.setText("Sí");
        jCheckBox16.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox16ItemStateChanged(evt);
            }
        });

        jCheckBox17.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox17.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jCheckBox17.setText("No");
        jCheckBox17.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox17ItemStateChanged(evt);
            }
        });

        jCheckBox18.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox18.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jCheckBox18.setText("Sí");
        jCheckBox18.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox18ItemStateChanged(evt);
            }
        });

        jCheckBox19.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox19.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jCheckBox19.setText("No");
        jCheckBox19.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox19ItemStateChanged(evt);
            }
        });

        jCheckBox20.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox20.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jCheckBox20.setText("Sí");
        jCheckBox20.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox20ItemStateChanged(evt);
            }
        });

        jCheckBox21.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox21.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jCheckBox21.setText("No");
        jCheckBox21.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox21ItemStateChanged(evt);
            }
        });

        jCheckBox22.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox22.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jCheckBox22.setText("Sí");
        jCheckBox22.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox22ItemStateChanged(evt);
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

        jCheckBox24.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox24.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jCheckBox24.setText("Sí");
        jCheckBox24.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox24ItemStateChanged(evt);
            }
        });

        jCheckBox25.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox25.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jCheckBox25.setText("Mala");
        jCheckBox25.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox25ItemStateChanged(evt);
            }
        });

        jLabel45.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel45.setText("¿Existe alguna admisión en esta categoría?");

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

        jRadioButton6.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton6.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jRadioButton6.setText("A");
        jRadioButton6.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButton6ItemStateChanged(evt);
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

        suparejatieneingresos3.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        suparejatieneingresos3.setText("¿Tiene usted alguna deuda en mora?");

        jLabel61.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtparejaingresos3.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtparejaingresos3.setBorder(null);
        txtparejaingresos3.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtparejaingresos3CaretUpdate(evt);
            }
        });
        txtparejaingresos3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtparejaingresos3ActionPerformed(evt);
            }
        });
        txtparejaingresos3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtparejaingresos3KeyTyped(evt);
            }
        });

        jCheckBox27.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox27.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jCheckBox27.setText("Sí");
        jCheckBox27.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox27ItemStateChanged(evt);
            }
        });

        jCheckBox28.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox28.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jCheckBox28.setText("No");
        jCheckBox28.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox28ItemStateChanged(evt);
            }
        });

        chbxotros.setBackground(new java.awt.Color(255, 255, 255));
        chbxotros.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        chbxotros.setText("Otros");
        chbxotros.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chbxotrosItemStateChanged(evt);
            }
        });

        jLabel66.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtexpfincara1.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtexpfincara1.setBorder(null);
        txtexpfincara1.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtexpfincara1CaretUpdate(evt);
            }
        });
        txtexpfincara1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtexpfincara1KeyTyped(evt);
            }
        });

        chbxvehiculos2.setBackground(new java.awt.Color(255, 255, 255));
        chbxvehiculos2.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        chbxvehiculos2.setText("Otros");
        chbxvehiculos2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chbxvehiculos2ItemStateChanged(evt);
            }
        });

        jLabel68.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtexpfincara2.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtexpfincara2.setBorder(null);
        txtexpfincara2.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtexpfincara2CaretUpdate(evt);
            }
        });
        txtexpfincara2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtexpfincara2KeyTyped(evt);
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

        jRadioButton10.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton10.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jRadioButton10.setText("A");
        jRadioButton10.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButton10ItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel55, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel10Layout.createSequentialGroup()
                            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel60, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel65, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel64, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel63, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel62, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtgastosmensuales1, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtexpfincara, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel67, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel10Layout.createSequentialGroup()
                                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(chbxhipote)
                                        .addComponent(chbxlibreinver))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(chbxgotagota)
                                        .addComponent(chbxvehiculo))
                                    .addGap(22, 22, 22)
                                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(chbxpernatural)
                                        .addComponent(chbxtarjcredi))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel68, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtexpfincara2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(chbxvehiculos2)))
                                .addGroup(jPanel10Layout.createSequentialGroup()
                                    .addComponent(jLabel46)
                                    .addGap(115, 115, 115)
                                    .addComponent(jCheckBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jCheckBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(27, 27, 27)
                                    .addComponent(jCheckBox25, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel10Layout.createSequentialGroup()
                                        .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(415, 415, 415)
                                        .addComponent(jCheckBox6, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jCheckBox5, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jRadioButton1))
                                    .addComponent(txtsalariodeven, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel10Layout.createSequentialGroup()
                                    .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(415, 415, 415)
                                    .addComponent(jCheckBox8, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jCheckBox7, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jRadioButton2))
                                .addComponent(txtactilaboexpli, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel10Layout.createSequentialGroup()
                                    .addComponent(jLabel106, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(415, 415, 415)
                                    .addComponent(jCheckBox10, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jCheckBox9, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jRadioButton3))
                                .addComponent(txtliquidacion, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel10Layout.createSequentialGroup()
                                    .addComponent(jLabel107, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(415, 415, 415)
                                    .addComponent(jCheckBox12, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jCheckBox11, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jRadioButton4))
                                .addComponent(txtahorros, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel10Layout.createSequentialGroup()
                                    .addComponent(jLabel108, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(415, 415, 415)
                                    .addComponent(jCheckBox14, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jCheckBox13, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jRadioButton5))
                                .addComponent(txtcantapoyopadres, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtparejaingresos, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel10Layout.createSequentialGroup()
                                    .addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(415, 415, 415)
                                    .addComponent(jCheckBox22, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jCheckBox21, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jRadioButton9))
                                .addComponent(txtparejaingresos2, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel10Layout.createSequentialGroup()
                                    .addComponent(jLabel57)
                                    .addGap(609, 609, 609)
                                    .addComponent(jCheckBox24, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jCheckBox23, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel10Layout.createSequentialGroup()
                                    .addComponent(jLabel48)
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel53, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtgastosmensuales, javax.swing.GroupLayout.PREFERRED_SIZE, 784, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(txtparejaingresos1, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel61, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel10Layout.createSequentialGroup()
                                    .addComponent(chbxfincaraiz)
                                    .addGap(18, 18, 18)
                                    .addComponent(chbxvehiculos)
                                    .addGap(18, 18, 18)
                                    .addComponent(chbxotros)
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel66, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtexpfincara1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel10Layout.createSequentialGroup()
                                    .addComponent(suparejatieneingresos3, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(415, 415, 415)
                                    .addComponent(jCheckBox27, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jCheckBox28, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jRadioButton10))
                                .addComponent(txtparejaingresos3, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel10Layout.createSequentialGroup()
                                    .addComponent(jLabel45)
                                    .addGap(512, 512, 512)
                                    .addComponent(jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jCheckBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(txtfamiliape1, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel10Layout.createSequentialGroup()
                                    .addComponent(suparejatieneingresos, javax.swing.GroupLayout.PREFERRED_SIZE, 770, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jCheckBox16, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, 0)
                                    .addComponent(jCheckBox15, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jRadioButton6)))
                            .addGap(0, 0, Short.MAX_VALUE)))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(suparejatieneingresos1, javax.swing.GroupLayout.PREFERRED_SIZE, 770, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox18, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jCheckBox17, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton7))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(suparejatieneingresos2, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(292, 292, 292)
                        .addComponent(jCheckBox20, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jCheckBox19, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton8)))
                .addGap(30, 30, 30))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel46)
                    .addComponent(jCheckBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox25, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jCheckBox6, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jCheckBox5, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addComponent(txtsalariodeven, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel67, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jCheckBox8, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jCheckBox7, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jRadioButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addComponent(txtactilaboexpli, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel62, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jCheckBox10, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jCheckBox9, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jRadioButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel106, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addComponent(txtliquidacion, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel63, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jCheckBox12, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jCheckBox11, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jRadioButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel107, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addComponent(txtahorros, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel64, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jCheckBox14, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jCheckBox13, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jRadioButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel108, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addComponent(txtcantapoyopadres, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel65, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jCheckBox16, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jCheckBox15, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jRadioButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(suparejatieneingresos, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addComponent(txtparejaingresos, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel60, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jCheckBox18, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jCheckBox17, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jRadioButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(suparejatieneingresos1))
                .addGap(7, 7, 7)
                .addComponent(txtparejaingresos1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                                .addComponent(txtparejaingresos2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25)
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jRadioButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jCheckBox21, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jCheckBox22, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(5, 5, 5)
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(chbxlibreinver)
                                    .addComponent(chbxvehiculo)
                                    .addComponent(chbxpernatural)
                                    .addComponent(chbxvehiculos2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(chbxhipote)
                                    .addComponent(chbxgotagota)
                                    .addComponent(chbxtarjcredi)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                                .addComponent(txtexpfincara2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jLabel68, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(5, 5, 5)
                        .addComponent(txtgastosmensuales1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(suparejatieneingresos3)
                            .addComponent(jCheckBox28, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBox27, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRadioButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addComponent(txtparejaingresos3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel61, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel48)
                            .addComponent(txtgastosmensuales, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, 0)
                        .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jCheckBox24, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jCheckBox23, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel57))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(chbxfincaraiz, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(chbxvehiculos, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(chbxotros, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(txtexpfincara1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jLabel66, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(5, 5, 5)
                        .addComponent(txtexpfincara, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel45)
                            .addComponent(jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addComponent(txtfamiliape1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jCheckBox19, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jCheckBox20, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(suparejatieneingresos2)
                        .addComponent(jRadioButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane16.setViewportView(jPanel10);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 975, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 550, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jScrollPane16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtcantapoyopadresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcantapoyopadresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcantapoyopadresActionPerformed

    private void chbxfincaraizItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chbxfincaraizItemStateChanged
        if (chbxfincaraiz.isSelected()) {
            InfoFinanciera.setPropiedad_exa1("hay");
        } else if (!chbxfincaraiz.isSelected()) {
            InfoFinanciera.setPropiedad_exa1("nohay");
        }
    }//GEN-LAST:event_chbxfincaraizItemStateChanged

    private void chbxvehiculosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chbxvehiculosItemStateChanged
        if (chbxvehiculos.isSelected()) {
            InfoFinanciera.setPropiedad_exa2("hay");
        } else if (!chbxvehiculos.isSelected()) {
            InfoFinanciera.setPropiedad_exa2("nohay");
        }
    }//GEN-LAST:event_chbxvehiculosItemStateChanged

    private void txtactilaboexpliCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtactilaboexpliCaretUpdate
        InfoFinanciera.setLabores_indep(txtactilaboexpli.getText());
    }//GEN-LAST:event_txtactilaboexpliCaretUpdate

    private void txtliquidacionCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtliquidacionCaretUpdate
        InfoFinanciera.setCantidad_liquida_cesan(txtliquidacion.getText());
    }//GEN-LAST:event_txtliquidacionCaretUpdate

    private void txtahorrosCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtahorrosCaretUpdate
        InfoFinanciera.setCant_ahorros(txtahorros.getText());
    }//GEN-LAST:event_txtahorrosCaretUpdate

    private void txtcantapoyopadresCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtcantapoyopadresCaretUpdate
        InfoFinanciera.setDesc_apoyo_padres(txtcantapoyopadres.getText());
    }//GEN-LAST:event_txtcantapoyopadresCaretUpdate

    private void txtparejaingresosCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtparejaingresosCaretUpdate
        InfoFinanciera.setTotal_ingresos_pareja(txtparejaingresos.getText());
    }//GEN-LAST:event_txtparejaingresosCaretUpdate

    private void txtgastosmensualesCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtgastosmensualesCaretUpdate
        InfoFinanciera.setGastos_mensuales(txtgastosmensuales.getText());
    }//GEN-LAST:event_txtgastosmensualesCaretUpdate

    private void txtparejaingresos1CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtparejaingresos1CaretUpdate
        InfoFinanciera.setExplhadembargo(txtparejaingresos1.getText());
    }//GEN-LAST:event_txtparejaingresos1CaretUpdate

    private void txtparejaingresos2CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtparejaingresos2CaretUpdate
        InfoFinanciera.setExpreportadocr(txtparejaingresos2.getText());
    }//GEN-LAST:event_txtparejaingresos2CaretUpdate

    private void txtsalariodevenCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtsalariodevenCaretUpdate
        InfoFinanciera.setSostiene_eco(txtsalariodeven.getText());
    }//GEN-LAST:event_txtsalariodevenCaretUpdate

    private void txtsalariodevenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsalariodevenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsalariodevenActionPerformed

    private void txtgastosmensuales1CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtgastosmensuales1CaretUpdate
        InfoFinanciera.setExploblifinanc(txtgastosmensuales1.getText());
    }//GEN-LAST:event_txtgastosmensuales1CaretUpdate

    private void txtexpfincaraCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtexpfincaraCaretUpdate
        InfoFinanciera.setExptienepropi(txtexpfincara.getText());
    }//GEN-LAST:event_txtexpfincaraCaretUpdate

    private void chbxlibreinverItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chbxlibreinverItemStateChanged
        if (chbxlibreinver.isSelected()) {
            InfoFinanciera.setObligacion_finan1("hay");
        } else if (!chbxlibreinver.isSelected()) {
            InfoFinanciera.setObligacion_finan1("nohay");
        }
    }//GEN-LAST:event_chbxlibreinverItemStateChanged

    private void chbxvehiculoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chbxvehiculoItemStateChanged
        if (chbxvehiculo.isSelected()) {
            InfoFinanciera.setObligacion_finan3("hay");
        } else if (!chbxvehiculo.isSelected()) {
            InfoFinanciera.setObligacion_finan3("nohay");
        }
    }//GEN-LAST:event_chbxvehiculoItemStateChanged

    private void chbxhipoteItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chbxhipoteItemStateChanged
        if (chbxhipote.isSelected()) {
            InfoFinanciera.setObligacion_finan2("hay");
        } else if (!chbxhipote.isSelected()) {
            InfoFinanciera.setObligacion_finan2("nohay");
        }
    }//GEN-LAST:event_chbxhipoteItemStateChanged

    private void chbxgotagotaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chbxgotagotaItemStateChanged
        if (chbxgotagota.isSelected()) {
            InfoFinanciera.setObligacion_finan4("hay");
        } else if (!chbxgotagota.isSelected()) {
            InfoFinanciera.setObligacion_finan4("nohay");
        }
    }//GEN-LAST:event_chbxgotagotaItemStateChanged

    private void chbxpernaturalItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chbxpernaturalItemStateChanged
        if (chbxpernatural.isSelected()) {
            InfoFinanciera.setObligacion_finan5("hay");
        } else if (!chbxpernatural.isSelected()) {
            InfoFinanciera.setObligacion_finan5("nohay");
        }
    }//GEN-LAST:event_chbxpernaturalItemStateChanged

    private void chbxtarjcrediItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chbxtarjcrediItemStateChanged
        if (chbxtarjcredi.isSelected()) {
            InfoFinanciera.setObligacion_finan6("hay");
        } else if (!chbxtarjcredi.isSelected()) {
            InfoFinanciera.setObligacion_finan6("nohay");
        }
    }//GEN-LAST:event_chbxtarjcrediItemStateChanged

    private void jCheckBox3ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox3ItemStateChanged
        if (jCheckBox3.isSelected()) {
            InfoFinanciera.setSitua_economica("buena");
            jCheckBox4.setSelected(false);
            jCheckBox25.setSelected(false);
        } else {
            InfoFinanciera.setSitua_economica("-");
        }
    }//GEN-LAST:event_jCheckBox3ItemStateChanged

    private void jCheckBox4ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox4ItemStateChanged
        if (jCheckBox4.isSelected()) {
            jCheckBox3.setSelected(false);
            jCheckBox25.setSelected(false);
            InfoFinanciera.setSitua_economica("regular");
        } else {
            InfoFinanciera.setSitua_economica("-");
        }
    }//GEN-LAST:event_jCheckBox4ItemStateChanged

    private void jCheckBox5ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox5ItemStateChanged
        if (jCheckBox5.isSelected()) {
            jCheckBox6.setSelected(false);
            txtsalariodeven.setVisible(true);
            jLabel67.setVisible(true);
            InfoFinanciera.setTiene_ingre_men("No");
            jRadioButton1.setVisible(true);
        } else {
            InfoFinanciera.setTiene_ingre_men("-");
            txtsalariodeven.setVisible(false);
            jLabel67.setVisible(false);
            jRadioButton1.setVisible(false);
            jRadioButton1.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox5ItemStateChanged

    private void jCheckBox6ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox6ItemStateChanged
        if (jCheckBox6.isSelected()) {
            jCheckBox5.setSelected(false);
            txtsalariodeven.setVisible(true);
            jLabel67.setVisible(true);
            InfoFinanciera.setTiene_ingre_men("Sí");
            jRadioButton1.setVisible(true);
        } else {
            InfoFinanciera.setTiene_ingre_men("-");
            txtsalariodeven.setVisible(false);
            jLabel67.setVisible(false);
            jRadioButton1.setVisible(false);
            jRadioButton1.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox6ItemStateChanged

    private void jCheckBox7ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox7ItemStateChanged
        if (jCheckBox7.isSelected()) {
            jCheckBox8.setSelected(false);
            InfoFinanciera.setAct_lab_inde("No");
            jLabel62.setVisible(false);
            txtactilaboexpli.setVisible(false);
            jRadioButton2.setVisible(false);
            jRadioButton2.setSelected(false);
        } else {
            InfoFinanciera.setAct_lab_inde("-");
            jLabel62.setVisible(false);
            txtactilaboexpli.setVisible(false);
            jRadioButton2.setVisible(false);
            jRadioButton2.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox7ItemStateChanged

    private void jCheckBox8ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox8ItemStateChanged
        if (jCheckBox8.isSelected()) {
            jCheckBox7.setSelected(false);
            InfoFinanciera.setAct_lab_inde("Sí");
            jLabel62.setVisible(true);
            txtactilaboexpli.setVisible(true);
            jRadioButton2.setVisible(true);
        } else {
            InfoFinanciera.setAct_lab_inde("-");
            jLabel62.setVisible(false);
            txtactilaboexpli.setVisible(false);
            jRadioButton2.setVisible(false);
            jRadioButton2.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox8ItemStateChanged

    private void jCheckBox9ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox9ItemStateChanged
        if (jCheckBox9.isSelected()) {
            jCheckBox10.setSelected(false);
            InfoFinanciera.setLiquida_cesan("No");
            txtliquidacion.setVisible(false);
            jLabel63.setVisible(false);
            jRadioButton3.setVisible(false);
            jRadioButton3.setSelected(false);
        } else {
            InfoFinanciera.setLiquida_cesan("-");
            txtliquidacion.setVisible(false);
            jLabel63.setVisible(false);
            jRadioButton3.setVisible(false);
            jRadioButton3.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox9ItemStateChanged

    private void jCheckBox10ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox10ItemStateChanged
        if (jCheckBox10.isSelected()) {
            jCheckBox9.setSelected(false);
            InfoFinanciera.setLiquida_cesan("Sí");
            txtliquidacion.setVisible(true);
            jLabel63.setVisible(true);
            jRadioButton3.setVisible(true);
        } else {
            InfoFinanciera.setLiquida_cesan("-");
            txtliquidacion.setVisible(true);
            jLabel63.setVisible(true);
            jRadioButton3.setVisible(false);
            jRadioButton3.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox10ItemStateChanged

    private void jCheckBox11ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox11ItemStateChanged
        if (jCheckBox11.isSelected()) {
            jCheckBox12.setSelected(false);
            InfoFinanciera.setTiene_ahorros("No");
            txtahorros.setVisible(false);
            jLabel64.setVisible(false);
            jRadioButton4.setVisible(false);
            jRadioButton4.setSelected(false);
        } else {
            InfoFinanciera.setTiene_ahorros("-");
            txtahorros.setVisible(false);
            jLabel64.setVisible(false);
            jRadioButton4.setVisible(false);
            jRadioButton4.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox11ItemStateChanged

    private void jCheckBox12ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox12ItemStateChanged
        if (jCheckBox12.isSelected()) {
            jCheckBox11.setSelected(false);
            InfoFinanciera.setTiene_ahorros("Sí");
            txtahorros.setVisible(true);
            jLabel64.setVisible(true);
            jRadioButton4.setVisible(true);
        } else {
            jCheckBox11.setSelected(false);
            InfoFinanciera.setTiene_ahorros("-");
            txtahorros.setVisible(false);
            jLabel64.setVisible(false);
            jRadioButton4.setVisible(false);
            jRadioButton4.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox12ItemStateChanged

    private void jCheckBox13ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox13ItemStateChanged
        if (jCheckBox13.isSelected()) {
            InfoFinanciera.setApoyo_padres("No");
            txtcantapoyopadres.setVisible(false);
            jLabel65.setVisible(false);
            jCheckBox14.setSelected(false);
            jRadioButton4.setVisible(false);
            jRadioButton4.setSelected(false);
        } else {
            InfoFinanciera.setApoyo_padres("-");
            txtcantapoyopadres.setVisible(false);
            jLabel65.setVisible(false);
            jRadioButton5.setVisible(false);
            jRadioButton5.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox13ItemStateChanged

    private void jCheckBox14ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox14ItemStateChanged
        if (jCheckBox14.isSelected()) {
            InfoFinanciera.setApoyo_padres("Sí");
            txtcantapoyopadres.setVisible(true);
            jLabel65.setVisible(true);
            jCheckBox13.setSelected(false);
            jRadioButton5.setVisible(true);
        } else {
            InfoFinanciera.setApoyo_padres("-");
            txtcantapoyopadres.setVisible(false);
            jLabel65.setVisible(false);
            jCheckBox13.setSelected(false);
            jRadioButton5.setVisible(false);
            jRadioButton5.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox14ItemStateChanged

    private void jCheckBox15ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox15ItemStateChanged
        if (jCheckBox15.isSelected()) {
            jCheckBox16.setSelected(false);
            InfoFinanciera.setIng_pareja("No");
            txtparejaingresos.setVisible(false);
            jLabel60.setVisible(false);
            jRadioButton6.setVisible(false);
            jRadioButton6.setSelected(false);
        } else {
            InfoFinanciera.setIng_pareja("-");
            txtparejaingresos.setVisible(false);
            jLabel60.setVisible(false);
            jRadioButton6.setVisible(false);
            jRadioButton6.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox15ItemStateChanged

    private void jCheckBox16ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox16ItemStateChanged
        if (jCheckBox16.isSelected()) {
            jCheckBox15.setSelected(false);
            InfoFinanciera.setIng_pareja("Sí");
            txtparejaingresos.setVisible(true);
            jLabel60.setVisible(true);
            jRadioButton6.setVisible(true);
        } else {
            InfoFinanciera.setIng_pareja("-");
            txtparejaingresos.setVisible(false);
            jLabel60.setVisible(false);
            jRadioButton6.setVisible(false);
            jRadioButton6.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox16ItemStateChanged

    private void jCheckBox17ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox17ItemStateChanged
        if (jCheckBox17.isSelected()) {
            jCheckBox18.setSelected(false);
            txtparejaingresos1.setVisible(false);
            jLabel58.setVisible(false);
            InfoFinanciera.setHadembargo("No");
            Admisiones.setAdmInfoFinan7("nohay");
            jRadioButton7.setVisible(false);
            jRadioButton7.setSelected(false);
        } else {
            jCheckBox18.setSelected(false);
            txtparejaingresos1.setVisible(false);
            jLabel58.setVisible(false);
            InfoFinanciera.setHadembargo("-");
            Admisiones.setAdmInfoFinan7("nohay");
            jRadioButton7.setVisible(false);
            jRadioButton7.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox17ItemStateChanged

    private void jCheckBox18ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox18ItemStateChanged
        if (jCheckBox18.isSelected()) {
            jCheckBox17.setSelected(false);
            txtparejaingresos1.setVisible(true);
            jLabel58.setVisible(true);
            InfoFinanciera.setHadembargo("Sí");
            Admisiones.setAdmInfoFinan7("hay");
            jRadioButton7.setVisible(true);
        } else {
            Admisiones.setAdmInfoFinan7("nohay");
            txtparejaingresos1.setVisible(true);
            jLabel58.setVisible(true);
            InfoFinanciera.setHadembargo("-");
            jRadioButton7.setVisible(false);
            jRadioButton7.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox18ItemStateChanged

    private void jCheckBox19ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox19ItemStateChanged
        if (jCheckBox19.isSelected()) {
            jCheckBox20.setSelected(false);
            txtparejaingresos2.setVisible(false);
            jLabel56.setVisible(false);
            InfoFinanciera.setReportadocr("No");
            jRadioButton8.setVisible(false);
            jRadioButton8.setSelected(false);
        } else {
            txtparejaingresos2.setVisible(false);
            jLabel56.setVisible(false);
            InfoFinanciera.setReportadocr("-");
            jRadioButton8.setVisible(false);
            jRadioButton8.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox19ItemStateChanged

    private void jCheckBox20ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox20ItemStateChanged
        if (jCheckBox20.isSelected()) {
            jCheckBox19.setSelected(false);
            txtparejaingresos2.setVisible(true);
            jLabel56.setVisible(true);
            InfoFinanciera.setReportadocr("Sí");
            Admisiones.setAdmInfoFinan8("hay");
            jRadioButton8.setVisible(true);
        } else {
            txtparejaingresos2.setVisible(false);
            jLabel56.setVisible(false);
            InfoFinanciera.setReportadocr("-");
            Admisiones.setAdmInfoFinan8("nohay");
            jRadioButton8.setVisible(false);
            jRadioButton8.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox20ItemStateChanged

    private void jCheckBox21ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox21ItemStateChanged
        if (jCheckBox21.isSelected()) {
            jCheckBox22.setSelected(false);
            InfoFinanciera.setTieneobligafinan("No");
            txtgastosmensuales1.setVisible(false);
            jLabel55.setVisible(false);
            jRadioButton9.setVisible(false);
            jRadioButton9.setSelected(false);
            chbxlibreinver.setEnabled(false);
            chbxhipote.setEnabled(false);
            chbxvehiculo.setEnabled(false);
            chbxgotagota.setEnabled(false);
            chbxpernatural.setEnabled(false);
            chbxtarjcredi.setEnabled(false);
            chbxvehiculos2.setEnabled(false);
        } else {
            InfoFinanciera.setTieneobligafinan("-");
            txtgastosmensuales1.setVisible(false);
            jLabel55.setVisible(false);
            jRadioButton9.setVisible(false);
            jRadioButton9.setSelected(false);
            chbxlibreinver.setEnabled(false);
            chbxhipote.setEnabled(false);
            chbxvehiculo.setEnabled(false);
            chbxgotagota.setEnabled(false);
            chbxpernatural.setEnabled(false);
            chbxtarjcredi.setEnabled(false);
            chbxvehiculos2.setEnabled(false);
        }
    }//GEN-LAST:event_jCheckBox21ItemStateChanged

    private void jCheckBox22ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox22ItemStateChanged
        if (jCheckBox22.isSelected()) {
            jCheckBox21.setSelected(false);
            InfoFinanciera.setTieneobligafinan("Sí");
            txtgastosmensuales1.setVisible(true);
            jLabel55.setVisible(true);
            jRadioButton9.setVisible(true);
            chbxlibreinver.setEnabled(true);
            chbxhipote.setEnabled(true);
            chbxvehiculo.setEnabled(true);
            chbxgotagota.setEnabled(true);
            chbxpernatural.setEnabled(true);
            chbxtarjcredi.setEnabled(true);
            chbxvehiculos2.setEnabled(true);
        } else {
            chbxlibreinver.setEnabled(false);
            chbxhipote.setEnabled(false);
            chbxvehiculo.setEnabled(false);
            chbxgotagota.setEnabled(false);
            chbxpernatural.setEnabled(false);
            chbxtarjcredi.setEnabled(false);
            chbxvehiculos2.setEnabled(false);
            InfoFinanciera.setTieneobligafinan("-");
            txtgastosmensuales1.setVisible(false);
            jLabel55.setVisible(false);
            jRadioButton9.setVisible(false);
            jRadioButton9.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox22ItemStateChanged

    private void jCheckBox23ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox23ItemStateChanged
        if (jCheckBox23.isSelected()) {
            jCheckBox24.setSelected(false);
            InfoFinanciera.setTienepropi("No");
            chbxfincaraiz.setVisible(false);
            chbxfincaraiz.setSelected(false);
            chbxvehiculos.setVisible(false);
            chbxvehiculos.setSelected(false);
            txtexpfincara.setVisible(false);
            jLabel51.setVisible(false);
            chbxotros.setVisible(false);
            chbxotros.setSelected(false);
            jLabel66.setVisible(false);
            txtexpfincara1.setVisible(false);
        } else {
            InfoFinanciera.setTienepropi("-");
            chbxfincaraiz.setVisible(false);
            chbxfincaraiz.setSelected(false);
            chbxvehiculos.setVisible(false);
            chbxvehiculos.setSelected(false);
            txtexpfincara.setVisible(false);
            jLabel51.setVisible(false);
            chbxotros.setVisible(false);
            chbxotros.setSelected(false);
            jLabel66.setVisible(false);
            txtexpfincara1.setVisible(false);
        }
    }//GEN-LAST:event_jCheckBox23ItemStateChanged

    private void jCheckBox24ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox24ItemStateChanged
        if (jCheckBox24.isSelected()) {
            jCheckBox23.setSelected(false);
            InfoFinanciera.setTienepropi("Sí");
            chbxfincaraiz.setVisible(true);
            chbxvehiculos.setVisible(true);
            chbxotros.setVisible(true);
            txtexpfincara.setVisible(true);
            jLabel51.setVisible(true);
        } else {
            InfoFinanciera.setTienepropi("-");
            chbxfincaraiz.setVisible(false);
            chbxfincaraiz.setSelected(false);
            chbxvehiculos.setVisible(false);
            chbxvehiculos.setSelected(false);
            txtexpfincara.setVisible(false);
            jLabel51.setVisible(false);
            chbxotros.setVisible(false);
            chbxotros.setSelected(false);
            jLabel66.setVisible(false);
            txtexpfincara1.setVisible(false);
        }
    }//GEN-LAST:event_jCheckBox24ItemStateChanged

    private void jCheckBox25ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox25ItemStateChanged
        if (jCheckBox25.isSelected()) {
            jCheckBox3.setSelected(false);
            jCheckBox4.setSelected(false);
            InfoFinanciera.setSitua_economica("mala");
        } else {
            InfoFinanciera.setSitua_economica("-");
        }
    }//GEN-LAST:event_jCheckBox25ItemStateChanged

    private void jCheckBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox1ItemStateChanged
        if (jCheckBox1.isSelected()) {
            jCheckBox2.setSelected(false);
            txtfamiliape1.setVisible(true);
            jLabel32.setVisible(true);
            Admisiones.setAdmInfoFinan11("hay");
        } else if (!jCheckBox1.isSelected()) {
            txtfamiliape1.setVisible(false);
            jLabel32.setVisible(false);
            Admisiones.setAdmInfoFinan11("nohay");
        }
    }//GEN-LAST:event_jCheckBox1ItemStateChanged

    private void jCheckBox2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox2ItemStateChanged
        if (jCheckBox2.isSelected()) {
            jCheckBox1.setSelected(false);
            txtfamiliape1.setVisible(false);
            jLabel32.setVisible(false);
            Admisiones.setAdmInfoFinan11("nohay");
        } else {
            Admisiones.setAdmInfoFinan11("nohay");
        }
    }//GEN-LAST:event_jCheckBox2ItemStateChanged

    private void txtfamiliape1CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtfamiliape1CaretUpdate
        InfoFinanciera.setAdmisionInfoFinanciera(txtfamiliape1.getText());
    }//GEN-LAST:event_txtfamiliape1CaretUpdate

    private void txtparejaingresos3CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtparejaingresos3CaretUpdate
        InfoFinanciera.setExptienedeuda(txtparejaingresos3.getText());
    }//GEN-LAST:event_txtparejaingresos3CaretUpdate

    private void jCheckBox27ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox27ItemStateChanged
        if (jCheckBox27.isSelected()) {
            jLabel61.setVisible(true);
            txtparejaingresos3.setVisible(true);
                InfoFinanciera.setTienedeuda("Sí");
            jCheckBox28.setSelected(false);
            Admisiones.setAdmInfoFinan10("hay");
            jRadioButton10.setVisible(true);
        } else {
            jLabel61.setVisible(false);
            txtparejaingresos3.setVisible(false);
            InfoFinanciera.setTienedeuda("-");
            Admisiones.setAdmInfoFinan10("nohay");
            jRadioButton10.setVisible(false);
            jRadioButton10.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox27ItemStateChanged

    private void jCheckBox28ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox28ItemStateChanged
        if (jCheckBox28.isSelected()) {
            txtparejaingresos3.setVisible(false);
            jLabel61.setVisible(false);
            InfoFinanciera.setTienedeuda("No");
            jCheckBox27.setSelected(false);
            Admisiones.setAdmInfoFinan10("nohay");
            jRadioButton10.setVisible(false);
            jRadioButton10.setSelected(false);
        } else {
            txtparejaingresos3.setVisible(false);
            jLabel61.setVisible(false);
            InfoFinanciera.setTienedeuda("-");
            Admisiones.setAdmInfoFinan10("nohay");
            jRadioButton10.setVisible(false);
            jRadioButton10.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox28ItemStateChanged

    private void chbxotrosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chbxotrosItemStateChanged
        if (chbxotros.isSelected()) {
            jLabel66.setVisible(true);
            txtexpfincara1.setVisible(true);
            InfoFinanciera.setPropiedad_exa3("hay");
        } else {
            InfoFinanciera.setPropiedad_exa3("nohay");
            jLabel66.setVisible(false);
            txtexpfincara1.setVisible(false);
        }
    }//GEN-LAST:event_chbxotrosItemStateChanged

    private void txtexpfincara1CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtexpfincara1CaretUpdate
        InfoFinanciera.setPropiedad_exa3_o(txtexpfincara1.getText());
    }//GEN-LAST:event_txtexpfincara1CaretUpdate

    private void chbxvehiculos2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chbxvehiculos2ItemStateChanged
        if (chbxvehiculos2.isSelected()) {
            InfoFinanciera.setObligacion_finan7("hay");
            txtexpfincara2.setVisible(true);
            jLabel68.setVisible(true);
        } else {
            InfoFinanciera.setObligacion_finan7("nohay");
            txtexpfincara2.setVisible(false);
            jLabel68.setVisible(false);
        }
    }//GEN-LAST:event_chbxvehiculos2ItemStateChanged

    private void txtexpfincara2CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtexpfincara2CaretUpdate
        InfoFinanciera.setObligacion_finan7_o(txtexpfincara2.getText());
    }//GEN-LAST:event_txtexpfincara2CaretUpdate

    private void txtsalariodevenKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsalariodevenKeyTyped
        int k = (int) evt.getKeyChar();
        if (k == 39) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "¡No se acepta ese tipo de carácter!", "Error de datos ingresados", JOptionPane.ERROR_MESSAGE, iconThinking_uh);
        }
        InputMap map = txtsalariodeven.getInputMap(JTextField.WHEN_FOCUSED);
//        map.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, CTRL_MASK), "null");
    }//GEN-LAST:event_txtsalariodevenKeyTyped

    private void txtactilaboexpliKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtactilaboexpliKeyTyped
        int k = (int) evt.getKeyChar();
        if (k == 39) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "¡No se acepta ese tipo de carácter!", "Error de datos ingresados", JOptionPane.ERROR_MESSAGE, iconThinking_uh);
        }
        InputMap map = txtactilaboexpli.getInputMap(JTextField.WHEN_FOCUSED);
//        map.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, CTRL_MASK), "null");
    }//GEN-LAST:event_txtactilaboexpliKeyTyped

    private void txtliquidacionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtliquidacionKeyTyped
        int k = (int) evt.getKeyChar();
        if (k == 39) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "¡No se acepta ese tipo de carácter!", "Error de datos ingresados", JOptionPane.ERROR_MESSAGE, iconThinking_uh);
        }
        InputMap map = txtliquidacion.getInputMap(JTextField.WHEN_FOCUSED);
//        map.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, CTRL_MASK), "null");
    }//GEN-LAST:event_txtliquidacionKeyTyped

    private void txtahorrosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtahorrosKeyTyped
        int k = (int) evt.getKeyChar();
        if (k == 39) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "¡No se acepta ese tipo de carácter!", "Error de datos ingresados", JOptionPane.ERROR_MESSAGE, iconThinking_uh);
        }
        InputMap map = txtahorros.getInputMap(JTextField.WHEN_FOCUSED);
//        map.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, CTRL_MASK), "null");
    }//GEN-LAST:event_txtahorrosKeyTyped

    private void txtcantapoyopadresKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcantapoyopadresKeyTyped
        int k = (int) evt.getKeyChar();
        if (k == 39) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "¡No se acepta ese tipo de carácter!", "Error de datos ingresados", JOptionPane.ERROR_MESSAGE, iconThinking_uh);
        }
        InputMap map = txtcantapoyopadres.getInputMap(JTextField.WHEN_FOCUSED);
//        map.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, CTRL_MASK), "null");
    }//GEN-LAST:event_txtcantapoyopadresKeyTyped

    private void txtparejaingresosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtparejaingresosKeyTyped
        int k = (int) evt.getKeyChar();
        if (k == 39) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "¡No se acepta ese tipo de carácter!", "Error de datos ingresados", JOptionPane.ERROR_MESSAGE, iconThinking_uh);
        }
        InputMap map = txtparejaingresos.getInputMap(JTextField.WHEN_FOCUSED);
//        map.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, CTRL_MASK), "null");
    }//GEN-LAST:event_txtparejaingresosKeyTyped

    private void txtparejaingresos1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtparejaingresos1KeyTyped
        int k = (int) evt.getKeyChar();
        if (k == 39) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "¡No se acepta ese tipo de carácter!", "Error de datos ingresados", JOptionPane.ERROR_MESSAGE, iconThinking_uh);
        }
        InputMap map = txtparejaingresos1.getInputMap(JTextField.WHEN_FOCUSED);
//        map.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, CTRL_MASK), "null");
    }//GEN-LAST:event_txtparejaingresos1KeyTyped

    private void txtparejaingresos2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtparejaingresos2KeyTyped
        int k = (int) evt.getKeyChar();
        if (k == 39) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "¡No se acepta ese tipo de carácter!", "Error de datos ingresados", JOptionPane.ERROR_MESSAGE, iconThinking_uh);
        }
        InputMap map = txtparejaingresos2.getInputMap(JTextField.WHEN_FOCUSED);
//        map.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, CTRL_MASK), "null");
    }//GEN-LAST:event_txtparejaingresos2KeyTyped

    private void txtgastosmensuales1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtgastosmensuales1KeyTyped
        int k = (int) evt.getKeyChar();
        if (k == 39) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "¡No se acepta ese tipo de carácter!", "Error de datos ingresados", JOptionPane.ERROR_MESSAGE, iconThinking_uh);
        }
        InputMap map = txtgastosmensuales1.getInputMap(JTextField.WHEN_FOCUSED);
//        map.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, CTRL_MASK), "null");
    }//GEN-LAST:event_txtgastosmensuales1KeyTyped

    private void txtexpfincara2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtexpfincara2KeyTyped
        int k = (int) evt.getKeyChar();
        if (k == 39) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "¡No se acepta ese tipo de carácter!", "Error de datos ingresados", JOptionPane.ERROR_MESSAGE, iconThinking_uh);
        }
        InputMap map = txtexpfincara2.getInputMap(JTextField.WHEN_FOCUSED);
//        map.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, CTRL_MASK), "null");
    }//GEN-LAST:event_txtexpfincara2KeyTyped

    private void txtparejaingresos3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtparejaingresos3KeyTyped
        int k = (int) evt.getKeyChar();
        if (k == 39) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "¡No se acepta ese tipo de carácter!", "Error de datos ingresados", JOptionPane.ERROR_MESSAGE, iconThinking_uh);
        }
        InputMap map = txtparejaingresos3.getInputMap(JTextField.WHEN_FOCUSED);
//        map.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, CTRL_MASK), "null");
    }//GEN-LAST:event_txtparejaingresos3KeyTyped

    private void txtgastosmensualesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtgastosmensualesKeyTyped
        int k = (int) evt.getKeyChar();
        if (k == 39) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "¡No se acepta ese tipo de carácter!", "Error de datos ingresados", JOptionPane.ERROR_MESSAGE, iconThinking_uh);
        }
        InputMap map = txtgastosmensuales.getInputMap(JTextField.WHEN_FOCUSED);
//        map.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, CTRL_MASK), "null");
    }//GEN-LAST:event_txtgastosmensualesKeyTyped

    private void txtexpfincara1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtexpfincara1KeyTyped
        int k = (int) evt.getKeyChar();
        if (k == 39) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "¡No se acepta ese tipo de carácter!", "Error de datos ingresados", JOptionPane.ERROR_MESSAGE, iconThinking_uh);
        }
        InputMap map = txtexpfincara1.getInputMap(JTextField.WHEN_FOCUSED);
//        map.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, CTRL_MASK), "null");
    }//GEN-LAST:event_txtexpfincara1KeyTyped

    private void txtexpfincaraKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtexpfincaraKeyTyped
        int k = (int) evt.getKeyChar();
        if (k == 39) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "¡No se acepta ese tipo de carácter!", "Error de datos ingresados", JOptionPane.ERROR_MESSAGE, iconThinking_uh);
        }
        InputMap map = txtexpfincara.getInputMap(JTextField.WHEN_FOCUSED);
//        map.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, CTRL_MASK), "null");
    }//GEN-LAST:event_txtexpfincaraKeyTyped

    private void txtfamiliape1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtfamiliape1KeyTyped
        int k = (int) evt.getKeyChar();
        if (k == 39) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "¡No se acepta ese tipo de carácter!", "Error de datos ingresados", JOptionPane.ERROR_MESSAGE, iconThinking_uh);
        }
        InputMap map = txtfamiliape1.getInputMap(JTextField.WHEN_FOCUSED);
//        map.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, CTRL_MASK), "null");
    }//GEN-LAST:event_txtfamiliape1KeyTyped

    private void jRadioButton1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton1ItemStateChanged
        if (jRadioButton1.isSelected()) {
            Admisiones.setAdmInfoFinan1("hay");
        } else {
            Admisiones.setAdmInfoFinan1("nohay");
        }
    }//GEN-LAST:event_jRadioButton1ItemStateChanged

    private void jRadioButton2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton2ItemStateChanged
        if (jRadioButton2.isSelected()) {
            Admisiones.setAdmInfoFinan2("hay");
        } else {
            Admisiones.setAdmInfoFinan2("nohay");
        }
    }//GEN-LAST:event_jRadioButton2ItemStateChanged

    private void jRadioButton3ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton3ItemStateChanged
        if (jRadioButton3.isSelected()) {
            Admisiones.setAdmInfoFinan3("hay");
        } else {
            Admisiones.setAdmInfoFinan3("nohay");
        }
    }//GEN-LAST:event_jRadioButton3ItemStateChanged

    private void jRadioButton4ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton4ItemStateChanged
        if (jRadioButton4.isSelected()) {
            Admisiones.setAdmInfoFinan4("hay");
        } else {
            Admisiones.setAdmInfoFinan4("nohay");
        }
    }//GEN-LAST:event_jRadioButton4ItemStateChanged

    private void jRadioButton5ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton5ItemStateChanged
        if (jRadioButton5.isSelected()) {
            Admisiones.setAdmInfoFinan5("hay");
        } else {
            Admisiones.setAdmInfoFinan5("nohay");
        }
    }//GEN-LAST:event_jRadioButton5ItemStateChanged

    private void jRadioButton6ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton6ItemStateChanged
        if (jRadioButton6.isSelected()) {
            Admisiones.setAdmInfoFinan6("hay");
        } else {
            Admisiones.setAdmInfoFinan6("nohay");
        }
    }//GEN-LAST:event_jRadioButton6ItemStateChanged

    private void jRadioButton9ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton9ItemStateChanged
        if (jRadioButton9.isSelected()) {
            Admisiones.setAdmInfoFinan9("hay");
        } else {
            Admisiones.setAdmInfoFinan9("nohay");
        }
    }//GEN-LAST:event_jRadioButton9ItemStateChanged

    private void jRadioButton7ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton7ItemStateChanged
        if (jRadioButton7.isSelected()) {
            Admisiones.setAdmInfoFinan7("hay");
        } else {
            Admisiones.setAdmInfoFinan7("nohay");
        }
    }//GEN-LAST:event_jRadioButton7ItemStateChanged

    private void jRadioButton8ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton8ItemStateChanged
        if (jRadioButton8.isSelected()) {
            Admisiones.setAdmInfoFinan8("hay");
        } else {
            Admisiones.setAdmInfoFinan8("nohay");
        }
    }//GEN-LAST:event_jRadioButton8ItemStateChanged

    private void jRadioButton10ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton10ItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton10ItemStateChanged

    private void txtparejaingresos3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtparejaingresos3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtparejaingresos3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox chbxfincaraiz;
    private javax.swing.JCheckBox chbxgotagota;
    private javax.swing.JCheckBox chbxhipote;
    private javax.swing.JCheckBox chbxlibreinver;
    private javax.swing.JCheckBox chbxotros;
    private javax.swing.JCheckBox chbxpernatural;
    private javax.swing.JCheckBox chbxtarjcredi;
    private javax.swing.JCheckBox chbxvehiculo;
    private javax.swing.JCheckBox chbxvehiculos;
    private javax.swing.JCheckBox chbxvehiculos2;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox10;
    private javax.swing.JCheckBox jCheckBox11;
    private javax.swing.JCheckBox jCheckBox12;
    private javax.swing.JCheckBox jCheckBox13;
    private javax.swing.JCheckBox jCheckBox14;
    private javax.swing.JCheckBox jCheckBox15;
    private javax.swing.JCheckBox jCheckBox16;
    private javax.swing.JCheckBox jCheckBox17;
    private javax.swing.JCheckBox jCheckBox18;
    private javax.swing.JCheckBox jCheckBox19;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox20;
    private javax.swing.JCheckBox jCheckBox21;
    private javax.swing.JCheckBox jCheckBox22;
    private javax.swing.JCheckBox jCheckBox23;
    private javax.swing.JCheckBox jCheckBox24;
    private javax.swing.JCheckBox jCheckBox25;
    private javax.swing.JCheckBox jCheckBox27;
    private javax.swing.JCheckBox jCheckBox28;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JCheckBox jCheckBox7;
    private javax.swing.JCheckBox jCheckBox8;
    private javax.swing.JCheckBox jCheckBox9;
    public static javax.swing.JLabel jLabel106;
    public static javax.swing.JLabel jLabel107;
    public static javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel32;
    public static javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel51;
    public static javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    public static javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    public static javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton10;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JRadioButton jRadioButton8;
    private javax.swing.JRadioButton jRadioButton9;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JLabel suparejatieneingresos;
    private javax.swing.JLabel suparejatieneingresos1;
    private javax.swing.JLabel suparejatieneingresos2;
    private javax.swing.JLabel suparejatieneingresos3;
    private javax.swing.JTextField txtactilaboexpli;
    private javax.swing.JTextField txtahorros;
    private javax.swing.JTextField txtcantapoyopadres;
    private javax.swing.JTextField txtexpfincara;
    private javax.swing.JTextField txtexpfincara1;
    private javax.swing.JTextField txtexpfincara2;
    private javax.swing.JTextField txtfamiliape1;
    private javax.swing.JTextField txtgastosmensuales;
    private javax.swing.JTextField txtgastosmensuales1;
    private javax.swing.JTextField txtliquidacion;
    private javax.swing.JTextField txtparejaingresos;
    private javax.swing.JTextField txtparejaingresos1;
    private javax.swing.JTextField txtparejaingresos2;
    private javax.swing.JTextField txtparejaingresos3;
    private javax.swing.JTextField txtsalariodeven;
    // End of variables declaration//GEN-END:variables
}
