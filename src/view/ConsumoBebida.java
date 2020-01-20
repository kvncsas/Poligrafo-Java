package view;

import classes.Admisiones;
import classes.ConsumoBebidas;
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
public class ConsumoBebida extends javax.swing.JInternalFrame {

    public ConsumoBebida() {
        ((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI()).setNorthPane(null);
        initComponents();
        novisibles();
        jScrollPane17.getVerticalScrollBar().setUnitIncrement(15);
        guiascon_bebidas();
    }

    public void guiascon_bebidas() {
        CorrectorOrtografia p1 = new CorrectorOrtografia("(nombre de la bebida)", txtlastvezconsu1);
        CorrectorOrtografia p2 = new CorrectorOrtografia("Cantidad máxima por ocasión es de...", spcantidadocasion);
        CorrectorOrtografia p3 = new CorrectorOrtografia("La última vez que consumió fue...", txtlastvezconsu);
        CorrectorOrtografia p4 = new CorrectorOrtografia("Expresó haber llegado a trabajar bajo los efectos de alcohol...", txtbebidaspregun1);
        CorrectorOrtografia p5 = new CorrectorOrtografia("Manifestó haber faltado a trabajar por estar bajo los efectos de alcohol...", txtbebidaspregun2);
        CorrectorOrtografia p6 = new CorrectorOrtografia("Contó haber consumido bebidas alcohólicas antes de ingresar al trabajo...", txtbebidaspregun3);
        CorrectorOrtografia p7 = new CorrectorOrtografia("Refirió haber consumido bebidas alcohólicas en horario laboral...", txtbebidaspregun4);
        CorrectorOrtografia p8 = new CorrectorOrtografia("Comentó haber consumido en su lugar de trabajo sin autorización...", txtbebidaspregun5);
        CorrectorOrtografia p9 = new CorrectorOrtografia("Afirmó que ha tenido dificultades en sus empleos anteriores a causa del consumo de licor...", txtbebidaspregun6);
        CorrectorOrtografia p10 = new CorrectorOrtografia("Dijo haber tenido problemas generales a causa de bebidas alcohólicas...", txtbebidaspregun7);
        CorrectorOrtografia p11 = new CorrectorOrtografia("Aclaró haber tenido problemas de alcoholismo...", txtbebidaspregun8);
        CorrectorOrtografia p12 = new CorrectorOrtografia("Ha estado involucrado en accidentes por consumo de este tipo de bebidas...", txtbebidaspregun9);

        SpellChecker.register(txtlastvezconsu1);
        SpellChecker.register(spcantidadocasion);
        SpellChecker.register(txtlastvezconsu);
        SpellChecker.register(txtbebidaspregun1);
        SpellChecker.register(txtbebidaspregun2);
        SpellChecker.register(txtbebidaspregun3);
        SpellChecker.register(txtbebidaspregun4);
        SpellChecker.register(txtbebidaspregun5);
        SpellChecker.register(txtbebidaspregun6);
        SpellChecker.register(txtbebidaspregun7);
        SpellChecker.register(txtbebidaspregun8);
        SpellChecker.register(txtbebidaspregun9);
    }

    public void novisibles() {
        jRadioButton3.setVisible(false);
        jRadioButton4.setVisible(false);
        jRadioButton5.setVisible(false);
        jRadioButton6.setVisible(false);
        jRadioButton7.setVisible(false);
        jRadioButton8.setVisible(false);
        jRadioButton9.setVisible(false);
        jRadioButton10.setVisible(false);
        jRadioButton11.setVisible(false);

        frecuenciabebida.setVisible(false);
        txtfrecuenciabebida.setVisible(false);
        tipobebida.setVisible(false);
        txttipobebida.setVisible(false);
        txtlastvezconsu1.setVisible(false);
        cantidadocasion.setVisible(false);
        spcantidadocasion.setVisible(false);
        lastvezconsu.setVisible(false);
        txtlastvezconsu.setVisible(false);
        txtbebidaspregun1.setVisible(false);
        txtbebidaspregun2.setVisible(false);
        txtbebidaspregun3.setVisible(false);
        txtbebidaspregun4.setVisible(false);
        txtbebidaspregun5.setVisible(false);
        txtbebidaspregun6.setVisible(false);
        txtbebidaspregun7.setVisible(false);
        txtbebidaspregun8.setVisible(false);

        jLabel32.setVisible(false);
        jLabel33.setVisible(false);
        jLabel34.setVisible(false);
        jLabel36.setVisible(false);
        jLabel37.setVisible(false);
        jLabel35.setVisible(false);
        jLabel42.setVisible(false);
        jLabel41.setVisible(false);
        jLabel40.setVisible(false);
        jLabel39.setVisible(false);
        jLabel38.setVisible(false);

        jLabel46.setVisible(false);
        txtfamiliape1.setVisible(false);
        jLabel44.setVisible(false);
        txtbebidaspregun9.setVisible(false);

        jPanel1.setVisible(false);
    }

    public void limpiar() {
        txtfrecuenciabebida.setSelectedItem("Seleccione");
        txttipobebida.setSelectedItem("Seleccione");

        txtlastvezconsu1.setText("");
        spcantidadocasion.setText("");
        txtlastvezconsu.setText("");
        txtbebidaspregun1.setText("");
        txtbebidaspregun2.setText("");
        txtbebidaspregun3.setText("");
        txtbebidaspregun4.setText("");
        txtbebidaspregun5.setText("");
        txtbebidaspregun6.setText("");
        txtbebidaspregun7.setText("");
        txtbebidaspregun8.setText("");
        txtbebidaspregun9.setText("");
        txtfamiliape1.setText("");
        
        jCheckBox29.setSelected(false);
        jCheckBox30.setSelected(false);
        jCheckBox1.setSelected(false);
        jCheckBox2.setSelected(false);
        jCheckBox33.setSelected(false);
        jCheckBox34.setSelected(false);
        jCheckBox35.setSelected(false);
        jCheckBox36.setSelected(false);
        jCheckBox37.setSelected(false);
        jCheckBox38.setSelected(false);
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
        
        
        jScrollPane17.getVerticalScrollBar().setValue(0);
    }
    
    public void resultado() {
            
            if (ConsumoBebidas.getCon_bebidas().equals("Sí")){
                jPanel1.setVisible(true);
                txtfrecuenciabebida.setSelectedItem(ConsumoBebidas.getFrecuencia_bebi());
                txttipobebida.setSelectedItem(ConsumoBebidas.getTipo_bebida());
                spcantidadocasion.setText(ConsumoBebidas.getCantidad_oca());
                txtlastvezconsu.setText(ConsumoBebidas.getLastvez_consumo());
                
            } else if (ConsumoBebidas.getCon_bebidas().equals("No")){
                jPanel1.setVisible(false);
            }
            
            if (ConsumoBebidas.getPg1().equals("Sí")){
                jCheckBox33.setSelected(true);
                jCheckBox34.setSelected(false);
                jLabel36.setVisible(true);
                txtbebidaspregun1.setVisible(true);
                txtbebidaspregun1.setText(ConsumoBebidas.getRpg1());
            } else if (ConsumoBebidas.getPg1().equals("No")){
                jCheckBox33.setSelected(false);
                jCheckBox34.setSelected(true);
                jLabel36.setVisible(false);
                txtbebidaspregun1.setVisible(false);
            }
            
            if (ConsumoBebidas.getPg2().equals("Sí")){
                jCheckBox35.setSelected(true);
                jCheckBox36.setSelected(false);
                jLabel37.setVisible(true);
                txtbebidaspregun2.setVisible(true);
                txtbebidaspregun2.setText(ConsumoBebidas.getRpg2());
            } else if (ConsumoBebidas.getPg2().equals("No")){
                jCheckBox35.setSelected(false);
                jCheckBox36.setSelected(true);
                jLabel37.setVisible(false);
                txtbebidaspregun2.setVisible(false);
            }
            
            if (ConsumoBebidas.getPg3().equals("Sí")){
                jCheckBox37.setSelected(true);
                jCheckBox38.setSelected(false);
                jLabel35.setVisible(true);
                txtbebidaspregun3.setVisible(true);
                txtbebidaspregun3.setText(ConsumoBebidas.getRpg3());
            } else if (ConsumoBebidas.getPg3().equals("No")){
                jCheckBox37.setSelected(false);
                jCheckBox38.setSelected(true);
                jLabel35.setVisible(false);
                txtbebidaspregun3.setVisible(false);
            }
            
            if (ConsumoBebidas.getPg4().equals("Sí")){
                jCheckBox39.setSelected(true);
                jCheckBox40.setSelected(false);
                jLabel42.setVisible(true);
                txtbebidaspregun4.setVisible(true);
                txtbebidaspregun4.setText(ConsumoBebidas.getRpg4());
            } else if (ConsumoBebidas.getPg4().equals("No")){
                jCheckBox39.setSelected(false);
                jCheckBox40.setSelected(true);
                jLabel42.setVisible(false);
                txtbebidaspregun4.setVisible(false);
            }
            
            if (ConsumoBebidas.getPg5().equals("Sí")){
                jCheckBox41.setSelected(true);
                jCheckBox42.setSelected(false);
                jLabel41.setVisible(true);
                txtbebidaspregun5.setVisible(true);
                txtbebidaspregun5.setText(ConsumoBebidas.getRpg5());
            } else if (ConsumoBebidas.getPg5().equals("No")){
                jCheckBox41.setSelected(false);
                jCheckBox42.setSelected(true);
                jLabel41.setVisible(false);
                txtbebidaspregun5.setVisible(false);
            }
            
            if (ConsumoBebidas.getPg6().equals("Sí")){
                jCheckBox43.setSelected(true);
                jCheckBox44.setSelected(false);
                jLabel40.setVisible(true);
                txtbebidaspregun6.setVisible(true);
                txtbebidaspregun6.setText(ConsumoBebidas.getRpg6());
            } else if (ConsumoBebidas.getPg6().equals("No")){
                jCheckBox43.setSelected(false);
                jCheckBox44.setSelected(true);
                jLabel40.setVisible(false);
                txtbebidaspregun6.setVisible(false);
            }
            
            if (ConsumoBebidas.getPg7().equals("Sí")){
                jCheckBox45.setSelected(true);
                jCheckBox46.setSelected(false);
                jLabel39.setVisible(true);
                txtbebidaspregun7.setVisible(true);
                txtbebidaspregun7.setText(ConsumoBebidas.getRpg7());
            } else if (ConsumoBebidas.getPg7().equals("No")){
                jCheckBox45.setSelected(false);
                jCheckBox46.setSelected(true);
                jLabel39.setVisible(false);
                txtbebidaspregun7.setVisible(false);
            }
            
            if (ConsumoBebidas.getPg8().equals("Sí")){
                jCheckBox47.setSelected(true);
                jCheckBox48.setSelected(false);
                jLabel38.setVisible(true);
                txtbebidaspregun8.setVisible(true);
                txtbebidaspregun8.setText(ConsumoBebidas.getRpg8());
            } else if (ConsumoBebidas.getPg8().equals("No")){
                jCheckBox47.setSelected(false);
                jCheckBox48.setSelected(true);
                jLabel38.setVisible(false);
                txtbebidaspregun8.setVisible(false);
            }
            
            if (ConsumoBebidas.getPg9().equals("Sí")){
                jCheckBox49.setSelected(true);
                jCheckBox50.setSelected(false);
                jLabel44.setVisible(true);
                txtbebidaspregun9.setVisible(true);
                txtbebidaspregun9.setText(ConsumoBebidas.getRpg9());
            } else if (ConsumoBebidas.getPg9().equals("No")){
                jCheckBox49.setSelected(false);
                jCheckBox50.setSelected(true);
                jLabel44.setVisible(false);
                txtbebidaspregun9.setVisible(false);
            }
                    
    }

    Thinking_uh iconThinking_uh = new Thinking_uh();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane17 = new javax.swing.JScrollPane();
        jPanel5 = new javax.swing.JPanel();
        jLabel55 = new javax.swing.JLabel();
        bebidaspregun1 = new javax.swing.JLabel();
        txtbebidaspregun1 = new javax.swing.JTextField();
        bebidaspregun2 = new javax.swing.JLabel();
        txtbebidaspregun2 = new javax.swing.JTextField();
        bebidaspregun6 = new javax.swing.JLabel();
        bebidaspregun3 = new javax.swing.JLabel();
        txtbebidaspregun3 = new javax.swing.JTextField();
        txtbebidaspregun4 = new javax.swing.JTextField();
        txtbebidaspregun5 = new javax.swing.JTextField();
        bebidaspregun4 = new javax.swing.JLabel();
        bebidaspregun5_1 = new javax.swing.JLabel();
        bebidaspregun8 = new javax.swing.JLabel();
        bebidaspregun7 = new javax.swing.JLabel();
        txtbebidaspregun7 = new javax.swing.JTextField();
        txtbebidaspregun8 = new javax.swing.JTextField();
        txtbebidaspregun6 = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        bebidaspregun9 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        txtbebidaspregun9 = new javax.swing.JTextField();
        jLabel144 = new javax.swing.JLabel();
        jLabel145 = new javax.swing.JLabel();
        jLabel146 = new javax.swing.JLabel();
        jLabel147 = new javax.swing.JLabel();
        jLabel148 = new javax.swing.JLabel();
        jLabel149 = new javax.swing.JLabel();
        jLabel150 = new javax.swing.JLabel();
        jLabel151 = new javax.swing.JLabel();
        jCheckBox30 = new javax.swing.JCheckBox();
        jCheckBox29 = new javax.swing.JCheckBox();
        jCheckBox33 = new javax.swing.JCheckBox();
        jCheckBox34 = new javax.swing.JCheckBox();
        jCheckBox35 = new javax.swing.JCheckBox();
        jCheckBox36 = new javax.swing.JCheckBox();
        jCheckBox37 = new javax.swing.JCheckBox();
        jCheckBox38 = new javax.swing.JCheckBox();
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
        jCheckBox49 = new javax.swing.JCheckBox();
        jCheckBox50 = new javax.swing.JCheckBox();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        jRadioButton7 = new javax.swing.JRadioButton();
        jRadioButton8 = new javax.swing.JRadioButton();
        jRadioButton9 = new javax.swing.JRadioButton();
        jRadioButton10 = new javax.swing.JRadioButton();
        jRadioButton11 = new javax.swing.JRadioButton();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        txtfamiliape1 = new javax.swing.JTextField();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jPanel1 = new javax.swing.JPanel();
        txtfrecuenciabebida = new javax.swing.JComboBox<>();
        txttipobebida = new javax.swing.JComboBox<>();
        txtlastvezconsu1 = new javax.swing.JTextField();
        spcantidadocasion = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        frecuenciabebida = new javax.swing.JLabel();
        tipobebida = new javax.swing.JLabel();
        cantidadocasion = new javax.swing.JLabel();
        lastvezconsu = new javax.swing.JLabel();
        txtlastvezconsu = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(null);
        setPreferredSize(new java.awt.Dimension(975, 550));

        jScrollPane17.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane17.setBorder(null);
        jScrollPane17.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane17.setPreferredSize(new java.awt.Dimension(975, 550));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jLabel55.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel55.setText("Consume usted bebidas alcohólicas: ");

        bebidaspregun1.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        bebidaspregun1.setText("¿Ha llegado usted a trabajar bajos los efectos de las bebidas alcohólicas?");

        txtbebidaspregun1.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtbebidaspregun1.setBorder(null);
        txtbebidaspregun1.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtbebidaspregun1CaretUpdate(evt);
            }
        });
        txtbebidaspregun1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtbebidaspregun1KeyTyped(evt);
            }
        });

        bebidaspregun2.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        bebidaspregun2.setText("¿Ha faltado usted a trabajar por estar bajo efectos de bebidas alcohólicas sin autorización?");

        txtbebidaspregun2.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtbebidaspregun2.setBorder(null);
        txtbebidaspregun2.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtbebidaspregun2CaretUpdate(evt);
            }
        });
        txtbebidaspregun2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtbebidaspregun2KeyTyped(evt);
            }
        });

        bebidaspregun6.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        bebidaspregun6.setText("¿Ha tenido usted problemas laborales a causa del consumo de alcohol?");

        bebidaspregun3.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        bebidaspregun3.setText("¿Ha consumido usted bebidas alcohólicas antes de ingresar a su jornada laboral sin autorización?");

        txtbebidaspregun3.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtbebidaspregun3.setBorder(null);
        txtbebidaspregun3.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtbebidaspregun3CaretUpdate(evt);
            }
        });
        txtbebidaspregun3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtbebidaspregun3KeyTyped(evt);
            }
        });

        txtbebidaspregun4.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtbebidaspregun4.setBorder(null);
        txtbebidaspregun4.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtbebidaspregun4CaretUpdate(evt);
            }
        });
        txtbebidaspregun4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtbebidaspregun4KeyTyped(evt);
            }
        });

        txtbebidaspregun5.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtbebidaspregun5.setBorder(null);
        txtbebidaspregun5.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtbebidaspregun5CaretUpdate(evt);
            }
        });
        txtbebidaspregun5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtbebidaspregun5KeyTyped(evt);
            }
        });

        bebidaspregun4.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        bebidaspregun4.setText("¿Ha consumido usted bebidas alcohólicas en horario laboral sin autorización?");

        bebidaspregun5_1.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        bebidaspregun5_1.setText("¿Ha consumido usted bebidas alcohólicas en su lugar de trabajo sin autorización?");

        bebidaspregun8.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        bebidaspregun8.setText("¿Ha tenido usted problemas de alcoholismo?");

        bebidaspregun7.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        bebidaspregun7.setText("¿Ha tenido usted problemas generales (familiares, legales, sociales) a causa del consumo de alcohol?");

        txtbebidaspregun7.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtbebidaspregun7.setBorder(null);
        txtbebidaspregun7.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtbebidaspregun7CaretUpdate(evt);
            }
        });
        txtbebidaspregun7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtbebidaspregun7KeyTyped(evt);
            }
        });

        txtbebidaspregun8.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtbebidaspregun8.setBorder(null);
        txtbebidaspregun8.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtbebidaspregun8CaretUpdate(evt);
            }
        });
        txtbebidaspregun8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtbebidaspregun8KeyTyped(evt);
            }
        });

        txtbebidaspregun6.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtbebidaspregun6.setBorder(null);
        txtbebidaspregun6.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtbebidaspregun6CaretUpdate(evt);
            }
        });
        txtbebidaspregun6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtbebidaspregun6KeyTyped(evt);
            }
        });

        jLabel35.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel36.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel37.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel38.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel39.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel40.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel41.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel42.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        bebidaspregun9.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        bebidaspregun9.setText("¿Ha estado usted involucrado en accidentes de tránsito por consumo de licor?");

        jLabel44.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtbebidaspregun9.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtbebidaspregun9.setBorder(null);
        txtbebidaspregun9.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtbebidaspregun9CaretUpdate(evt);
            }
        });
        txtbebidaspregun9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtbebidaspregun9KeyTyped(evt);
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

        jCheckBox39.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox39.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jCheckBox39.setText("Sí");
        jCheckBox39.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox39ItemStateChanged(evt);
            }
        });

        jCheckBox40.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox40.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jCheckBox40.setText("No");
        jCheckBox40.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox40ItemStateChanged(evt);
            }
        });

        jCheckBox41.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox41.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jCheckBox41.setText("Sí");
        jCheckBox41.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox41ItemStateChanged(evt);
            }
        });

        jCheckBox42.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox42.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jCheckBox42.setText("No");
        jCheckBox42.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox42ItemStateChanged(evt);
            }
        });

        jCheckBox43.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox43.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jCheckBox43.setText("Sí");
        jCheckBox43.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox43ItemStateChanged(evt);
            }
        });

        jCheckBox44.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox44.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jCheckBox44.setText("No");
        jCheckBox44.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox44ItemStateChanged(evt);
            }
        });

        jCheckBox45.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox45.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jCheckBox45.setText("Sí");
        jCheckBox45.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox45ItemStateChanged(evt);
            }
        });

        jCheckBox46.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox46.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jCheckBox46.setText("No");
        jCheckBox46.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox46ItemStateChanged(evt);
            }
        });

        jCheckBox47.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox47.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jCheckBox47.setText("Sí");
        jCheckBox47.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox47ItemStateChanged(evt);
            }
        });

        jCheckBox48.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox48.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jCheckBox48.setText("No");
        jCheckBox48.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox48ItemStateChanged(evt);
            }
        });

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

        jRadioButton3.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton3.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jRadioButton3.setText("A");
        jRadioButton3.setPreferredSize(new java.awt.Dimension(35, 16));
        jRadioButton3.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButton3ItemStateChanged(evt);
            }
        });

        jRadioButton4.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton4.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jRadioButton4.setText("A");
        jRadioButton4.setPreferredSize(new java.awt.Dimension(35, 16));
        jRadioButton4.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButton4ItemStateChanged(evt);
            }
        });

        jRadioButton5.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton5.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jRadioButton5.setText("A");
        jRadioButton5.setPreferredSize(new java.awt.Dimension(35, 16));
        jRadioButton5.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButton5ItemStateChanged(evt);
            }
        });

        jRadioButton6.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton6.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jRadioButton6.setText("A");
        jRadioButton6.setPreferredSize(new java.awt.Dimension(35, 16));
        jRadioButton6.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButton6ItemStateChanged(evt);
            }
        });

        jRadioButton7.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton7.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jRadioButton7.setText("A");
        jRadioButton7.setPreferredSize(new java.awt.Dimension(35, 16));
        jRadioButton7.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButton7ItemStateChanged(evt);
            }
        });

        jRadioButton8.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton8.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jRadioButton8.setText("A");
        jRadioButton8.setPreferredSize(new java.awt.Dimension(35, 16));
        jRadioButton8.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButton8ItemStateChanged(evt);
            }
        });

        jRadioButton9.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton9.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jRadioButton9.setText("A");
        jRadioButton9.setPreferredSize(new java.awt.Dimension(35, 16));
        jRadioButton9.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButton9ItemStateChanged(evt);
            }
        });

        jRadioButton10.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton10.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jRadioButton10.setText("A");
        jRadioButton10.setPreferredSize(new java.awt.Dimension(35, 16));
        jRadioButton10.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButton10ItemStateChanged(evt);
            }
        });

        jRadioButton11.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton11.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jRadioButton11.setText("A");
        jRadioButton11.setPreferredSize(new java.awt.Dimension(35, 16));
        jRadioButton11.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButton11ItemStateChanged(evt);
            }
        });

        jLabel45.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel45.setText("¿Existe alguna admisión relevante en esta categoría?");

        jLabel46.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

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

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        txtfrecuenciabebida.setFont(new java.awt.Font("Segoe UI Emoji", 0, 13)); // NOI18N
        txtfrecuenciabebida.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Diario", "Semanal", "Mensual", "Trimestral", "Semestral", "Anual", "Único consumo" }));
        txtfrecuenciabebida.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                txtfrecuenciabebidaItemStateChanged(evt);
            }
        });

        txttipobebida.setFont(new java.awt.Font("Segoe UI Emoji", 0, 13)); // NOI18N
        txttipobebida.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Cerveza", "Tequila", "Whisky", "Coñac", "Vodka", "Ron", "Ginebra", "Chicha", "Canelazo", "Otro" }));
        txttipobebida.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                txttipobebidaItemStateChanged(evt);
            }
        });

        txtlastvezconsu1.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtlastvezconsu1.setBorder(null);
        txtlastvezconsu1.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtlastvezconsu1CaretUpdate(evt);
            }
        });
        txtlastvezconsu1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtlastvezconsu1KeyTyped(evt);
            }
        });

        spcantidadocasion.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        spcantidadocasion.setBorder(null);
        spcantidadocasion.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                spcantidadocasionCaretUpdate(evt);
            }
        });
        spcantidadocasion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                spcantidadocasionKeyTyped(evt);
            }
        });

        jLabel32.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel33.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel34.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        frecuenciabebida.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        frecuenciabebida.setText("Frecuencia de bebida:");

        tipobebida.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        tipobebida.setText("Tipo de bebida");

        cantidadocasion.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        cantidadocasion.setText("Cantidad por ocasión:");

        lastvezconsu.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        lastvezconsu.setText("Última vez de consumo:");

        txtlastvezconsu.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtlastvezconsu.setBorder(null);
        txtlastvezconsu.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtlastvezconsuCaretUpdate(evt);
            }
        });
        txtlastvezconsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtlastvezconsuActionPerformed(evt);
            }
        });
        txtlastvezconsu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtlastvezconsuKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cantidadocasion)
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel33, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(2, 2, 2)
                                    .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(txtlastvezconsu1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(spcantidadocasion, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(128, 128, 128)
                                .addComponent(lastvezconsu)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtlastvezconsu, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(frecuenciabebida)
                        .addGap(23, 23, 23)
                        .addComponent(txtfrecuenciabebida, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(tipobebida)
                        .addGap(18, 18, 18)
                        .addComponent(txttipobebida, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(117, 117, 117))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(frecuenciabebida)
                        .addComponent(txtfrecuenciabebida, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tipobebida)
                        .addComponent(txttipobebida, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtlastvezconsu1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cantidadocasion)
                        .addComponent(spcantidadocasion, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtlastvezconsu, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lastvezconsu)))
                .addGap(0, 0, 0)
                .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel45)
                        .addGap(452, 452, 452)
                        .addComponent(jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                            .addComponent(jLabel55)
                            .addGap(547, 547, 547)
                            .addComponent(jCheckBox30, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jCheckBox29, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(35, 35, 35))
                        .addComponent(txtbebidaspregun1, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel37, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtbebidaspregun2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(bebidaspregun2, javax.swing.GroupLayout.PREFERRED_SIZE, 574, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(196, 196, 196)
                                .addComponent(jCheckBox35, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckBox36, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButton4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel151, javax.swing.GroupLayout.PREFERRED_SIZE, 654, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel150, javax.swing.GroupLayout.PREFERRED_SIZE, 654, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel149, javax.swing.GroupLayout.PREFERRED_SIZE, 654, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel148, javax.swing.GroupLayout.PREFERRED_SIZE, 654, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel147, javax.swing.GroupLayout.PREFERRED_SIZE, 654, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel146, javax.swing.GroupLayout.PREFERRED_SIZE, 654, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel145, javax.swing.GroupLayout.PREFERRED_SIZE, 654, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel144, javax.swing.GroupLayout.PREFERRED_SIZE, 654, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(bebidaspregun3)
                                .addGap(180, 180, 180)
                                .addComponent(jCheckBox37, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckBox38, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButton5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtbebidaspregun3, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(bebidaspregun4, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(277, 277, 277)
                                .addComponent(jCheckBox39, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckBox40, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButton6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtbebidaspregun4, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(bebidaspregun5_1, javax.swing.GroupLayout.PREFERRED_SIZE, 506, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(264, 264, 264)
                                .addComponent(jCheckBox41, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckBox42, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButton7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtbebidaspregun5, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addComponent(bebidaspregun6, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(277, 277, 277)
                            .addComponent(jCheckBox43, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jCheckBox44, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jRadioButton9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(txtbebidaspregun6, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(bebidaspregun7)
                                .addGap(163, 163, 163)
                                .addComponent(jCheckBox45, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckBox46, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButton8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtbebidaspregun7, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addComponent(bebidaspregun8, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(277, 277, 277)
                            .addComponent(jCheckBox47, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jCheckBox48, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jRadioButton10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(txtbebidaspregun8, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addComponent(bebidaspregun9, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(277, 277, 277)
                            .addComponent(jCheckBox49, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jCheckBox50, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jRadioButton11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(txtbebidaspregun9, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtfamiliape1, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addComponent(bebidaspregun1, javax.swing.GroupLayout.PREFERRED_SIZE, 628, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(142, 142, 142)
                            .addComponent(jCheckBox33, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jCheckBox34, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jRadioButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(30, 30, 30))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox30, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox29, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel55))
                .addGap(25, 25, 25)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox33, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox34, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bebidaspregun1))
                .addGap(7, 7, 7)
                .addComponent(txtbebidaspregun1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel144, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox35, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox36, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bebidaspregun2))
                .addGap(7, 7, 7)
                .addComponent(txtbebidaspregun2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jLabel145, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox37, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox38, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bebidaspregun3))
                .addGap(7, 7, 7)
                .addComponent(txtbebidaspregun3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel146, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jCheckBox39, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jCheckBox40, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jRadioButton6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(bebidaspregun4))
                .addGap(7, 7, 7)
                .addComponent(txtbebidaspregun4, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel147, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jCheckBox41, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jCheckBox42, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jRadioButton7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(bebidaspregun5_1))
                .addGap(7, 7, 7)
                .addComponent(txtbebidaspregun5, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jLabel148, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jCheckBox43, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jCheckBox44, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jRadioButton9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(bebidaspregun6))
                .addGap(7, 7, 7)
                .addComponent(txtbebidaspregun6, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel149, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jCheckBox45, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jCheckBox46, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jRadioButton8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(bebidaspregun7))
                .addGap(7, 7, 7)
                .addComponent(txtbebidaspregun7, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel150, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jCheckBox47, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jCheckBox48, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jRadioButton10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(bebidaspregun8, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addComponent(txtbebidaspregun8, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel151, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jCheckBox49, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jCheckBox50, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jRadioButton11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(bebidaspregun9, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addComponent(txtbebidaspregun9, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel45)
                    .addComponent(jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addComponent(txtfamiliape1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane17.setViewportView(jPanel5);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 975, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 550, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jScrollPane17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txttipobebidaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_txttipobebidaItemStateChanged

        String v = txttipobebida.getSelectedItem().toString();
        if ("Otro".equals(v)) {
            ConsumoBebidas.setTipo_bebida(txttipobebida.getSelectedItem().toString());
            txtlastvezconsu1.setVisible(true);
            jLabel32.setVisible(true);
        } else if (!"Otro".equals(v)) {
            txtlastvezconsu1.setVisible(false);
            jLabel32.setVisible(false);
        }
    }//GEN-LAST:event_txttipobebidaItemStateChanged

    private void txtlastvezconsu1CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtlastvezconsu1CaretUpdate
        ConsumoBebidas.setTipo_bebida(txtlastvezconsu1.getText());
    }//GEN-LAST:event_txtlastvezconsu1CaretUpdate

    private void txtlastvezconsuCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtlastvezconsuCaretUpdate
        ConsumoBebidas.setLastvez_consumo(txtlastvezconsu.getText());
    }//GEN-LAST:event_txtlastvezconsuCaretUpdate

    private void txtbebidaspregun1CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtbebidaspregun1CaretUpdate
        ConsumoBebidas.setRpg1(txtbebidaspregun1.getText());
    }//GEN-LAST:event_txtbebidaspregun1CaretUpdate

    private void txtbebidaspregun2CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtbebidaspregun2CaretUpdate
        ConsumoBebidas.setRpg2(txtbebidaspregun2.getText());
    }//GEN-LAST:event_txtbebidaspregun2CaretUpdate

    private void txtbebidaspregun3CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtbebidaspregun3CaretUpdate
        ConsumoBebidas.setRpg3(txtbebidaspregun3.getText());
    }//GEN-LAST:event_txtbebidaspregun3CaretUpdate

    private void txtbebidaspregun4CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtbebidaspregun4CaretUpdate
        ConsumoBebidas.setRpg4(txtbebidaspregun4.getText());
    }//GEN-LAST:event_txtbebidaspregun4CaretUpdate

    private void txtbebidaspregun5CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtbebidaspregun5CaretUpdate
        ConsumoBebidas.setRpg5(txtbebidaspregun5.getText());
    }//GEN-LAST:event_txtbebidaspregun5CaretUpdate

    private void txtbebidaspregun6CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtbebidaspregun6CaretUpdate
        ConsumoBebidas.setRpg6(txtbebidaspregun6.getText());
    }//GEN-LAST:event_txtbebidaspregun6CaretUpdate

    private void txtbebidaspregun7CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtbebidaspregun7CaretUpdate
        ConsumoBebidas.setRpg7(txtbebidaspregun7.getText());
    }//GEN-LAST:event_txtbebidaspregun7CaretUpdate

    private void txtbebidaspregun8CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtbebidaspregun8CaretUpdate
        ConsumoBebidas.setRpg8(txtbebidaspregun8.getText());
    }//GEN-LAST:event_txtbebidaspregun8CaretUpdate

    private void spcantidadocasionCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_spcantidadocasionCaretUpdate
        ConsumoBebidas.setCantidad_oca(spcantidadocasion.getText());
    }//GEN-LAST:event_spcantidadocasionCaretUpdate

    private void txtbebidaspregun9CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtbebidaspregun9CaretUpdate
        ConsumoBebidas.setRpg9(txtbebidaspregun9.getText());
    }//GEN-LAST:event_txtbebidaspregun9CaretUpdate

    private void jCheckBox30ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox30ItemStateChanged
        if (jCheckBox30.isSelected()) {
            jCheckBox29.setSelected(false);
            frecuenciabebida.setVisible(true);
            txtfrecuenciabebida.setVisible(true);
            tipobebida.setVisible(true);
            txttipobebida.setVisible(true);
            cantidadocasion.setVisible(true);
            spcantidadocasion.setVisible(true);
            lastvezconsu.setVisible(true);
            txtlastvezconsu.setVisible(true);

            jLabel33.setVisible(true);
            jLabel34.setVisible(true);

            jPanel1.setVisible(true);
            ConsumoBebidas.setCon_bebidas("Sí");
        } else {
            ConsumoBebidas.setCon_bebidas("-");
            frecuenciabebida.setVisible(false);
            txtfrecuenciabebida.setVisible(false);
            tipobebida.setVisible(false);
            txttipobebida.setVisible(false);
            cantidadocasion.setVisible(false);
            spcantidadocasion.setVisible(false);
            lastvezconsu.setVisible(false);
            txtlastvezconsu.setVisible(false);
            jLabel32.setVisible(false);
            jLabel33.setVisible(false);
            jLabel34.setVisible(false);
            jPanel1.setVisible(false);
        }
    }//GEN-LAST:event_jCheckBox30ItemStateChanged

    private void jCheckBox29ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox29ItemStateChanged
        if (jCheckBox29.isSelected()) {
            jCheckBox30.setSelected(false);
            frecuenciabebida.setVisible(false);
            txtfrecuenciabebida.setVisible(false);
            tipobebida.setVisible(false);
            txttipobebida.setVisible(false);
            cantidadocasion.setVisible(false);
            spcantidadocasion.setVisible(false);
            lastvezconsu.setVisible(false);
            txtlastvezconsu.setVisible(false);
            jLabel32.setVisible(false);
            jLabel33.setVisible(false);
            jLabel34.setVisible(false);
            jPanel1.setVisible(false);
            ConsumoBebidas.setCon_bebidas("No");
            ConsumoBebidas.setCon_bebidas("No");
            ConsumoBebidas.setPg1("No");
            ConsumoBebidas.setPg2("No");
            ConsumoBebidas.setPg3("No");
            ConsumoBebidas.setPg4("No");
            ConsumoBebidas.setPg5("No");
            ConsumoBebidas.setPg6("No");
            ConsumoBebidas.setPg7("No");
            ConsumoBebidas.setPg8("No");
            ConsumoBebidas.setPg9("No");
            ConsumoBebidas.setRpg1("");
            ConsumoBebidas.setRpg2("");
            ConsumoBebidas.setRpg3("");
            ConsumoBebidas.setRpg4("");
            ConsumoBebidas.setRpg5("");
            ConsumoBebidas.setRpg6("");
            ConsumoBebidas.setRpg7("");
            ConsumoBebidas.setRpg8("");
            ConsumoBebidas.setRpg9("");
            jCheckBox34.setSelected(true);
            jCheckBox36.setSelected(true);
            jCheckBox38.setSelected(true);
            jCheckBox40.setSelected(true);
            jCheckBox42.setSelected(true);
            jCheckBox44.setSelected(true);
            jCheckBox46.setSelected(true);
            jCheckBox48.setSelected(true);
            jCheckBox50.setSelected(true);
        } else {
            frecuenciabebida.setVisible(false);
            txtfrecuenciabebida.setVisible(false);
            tipobebida.setVisible(false);
            txttipobebida.setVisible(false);
            cantidadocasion.setVisible(false);
            spcantidadocasion.setVisible(false);
            lastvezconsu.setVisible(false);
            txtlastvezconsu.setVisible(false);
            jLabel32.setVisible(false);
            jLabel33.setVisible(false);
            jLabel34.setVisible(false);
            jPanel1.setVisible(false);
            ConsumoBebidas.setCon_bebidas("No");
            ConsumoBebidas.setPg1("No");
            ConsumoBebidas.setPg2("No");
            ConsumoBebidas.setPg3("No");
            ConsumoBebidas.setPg4("No");
            ConsumoBebidas.setPg5("No");
            ConsumoBebidas.setPg6("No");
            ConsumoBebidas.setPg7("No");
            ConsumoBebidas.setPg8("No");
            ConsumoBebidas.setPg9("No");
            ConsumoBebidas.setRpg1("");
            ConsumoBebidas.setRpg2("");
            ConsumoBebidas.setRpg3("");
            ConsumoBebidas.setRpg4("");
            ConsumoBebidas.setRpg5("");
            ConsumoBebidas.setRpg6("");
            ConsumoBebidas.setRpg7("");
            ConsumoBebidas.setRpg8("");
            ConsumoBebidas.setRpg9("");
        }
    }//GEN-LAST:event_jCheckBox29ItemStateChanged

    private void jCheckBox33ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox33ItemStateChanged
        if (jCheckBox33.isSelected()) {
            jCheckBox34.setSelected(false);
            txtbebidaspregun1.setVisible(true);
            jLabel36.setVisible(true);
            ConsumoBebidas.setPg1("Sí");
            jRadioButton3.setVisible(true);
        } else {
            ConsumoBebidas.setPg1("-");
            txtbebidaspregun1.setVisible(false);
            jLabel36.setVisible(false);
            jRadioButton3.setVisible(false);
            jRadioButton3.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox33ItemStateChanged

    private void jCheckBox34ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox34ItemStateChanged
        if (jCheckBox34.isSelected()) {
            jCheckBox33.setSelected(false);
            txtbebidaspregun1.setVisible(false);
            jLabel36.setVisible(false);
            ConsumoBebidas.setPg1("No");
            jRadioButton3.setSelected(false);
            jRadioButton3.setVisible(false);
        } else {
            txtbebidaspregun1.setVisible(false);
            jLabel36.setVisible(false);
            ConsumoBebidas.setPg1("-");
            jRadioButton3.setSelected(false);
            jRadioButton3.setVisible(false);
        }
    }//GEN-LAST:event_jCheckBox34ItemStateChanged

    private void jCheckBox35ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox35ItemStateChanged
        if (jCheckBox35.isSelected()) {
            jCheckBox36.setSelected(false);
            txtbebidaspregun2.setVisible(true);
            jLabel37.setVisible(true);
            ConsumoBebidas.setPg2("Sí");
            jRadioButton4.setVisible(true);
        } else {
            ConsumoBebidas.setPg2("-");
            txtbebidaspregun2.setVisible(false);
            jLabel37.setVisible(false);
            jRadioButton4.setVisible(false);
            jRadioButton4.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox35ItemStateChanged

    private void jCheckBox36ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox36ItemStateChanged
        if (jCheckBox36.isSelected()) {
            jCheckBox35.setSelected(false);
            txtbebidaspregun2.setVisible(false);
            jLabel37.setVisible(false);
            ConsumoBebidas.setPg2("No");
            jRadioButton4.setSelected(false);
            jRadioButton4.setVisible(false);
        } else {
            txtbebidaspregun2.setVisible(false);
            jLabel37.setVisible(false);
            ConsumoBebidas.setPg2("-");
            jRadioButton4.setSelected(false);
            jRadioButton4.setVisible(false);
        }
    }//GEN-LAST:event_jCheckBox36ItemStateChanged

    private void jCheckBox37ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox37ItemStateChanged
        if (jCheckBox37.isSelected()) {
            jCheckBox38.setSelected(false);
            txtbebidaspregun3.setVisible(true);
            jLabel35.setVisible(true);
            ConsumoBebidas.setPg3("Sí");
            jRadioButton5.setVisible(true);
        } else {
            ConsumoBebidas.setPg3("-");
            txtbebidaspregun3.setVisible(false);
            jLabel35.setVisible(false);
            jRadioButton5.setVisible(false);
            jRadioButton5.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox37ItemStateChanged

    private void jCheckBox38ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox38ItemStateChanged
        if (jCheckBox38.isSelected()) {
            jCheckBox39.setSelected(false);
            txtbebidaspregun3.setVisible(false);
            jLabel35.setVisible(false);
            ConsumoBebidas.setPg3("No");
            jRadioButton5.setSelected(false);
            jRadioButton5.setVisible(false);
        } else {
            txtbebidaspregun3.setVisible(false);
            jLabel35.setVisible(false);
            ConsumoBebidas.setPg3("-");
            jRadioButton5.setSelected(false);
            jRadioButton5.setVisible(false);
        }
    }//GEN-LAST:event_jCheckBox38ItemStateChanged

    private void jCheckBox39ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox39ItemStateChanged
        if (jCheckBox39.isSelected()) {
            jCheckBox40.setSelected(false);
            txtbebidaspregun4.setVisible(true);
            jLabel42.setVisible(true);
            ConsumoBebidas.setPg4("Sí");
            jRadioButton6.setVisible(true);
        } else {
            ConsumoBebidas.setPg4("-");
            txtbebidaspregun4.setVisible(false);
            jLabel42.setVisible(false);
            jRadioButton6.setVisible(false);
            jRadioButton6.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox39ItemStateChanged

    private void jCheckBox40ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox40ItemStateChanged
        if (jCheckBox40.isSelected()) {
            jCheckBox39.setSelected(false);
            txtbebidaspregun4.setVisible(false);
            jLabel42.setVisible(false);
            ConsumoBebidas.setPg4("No");
            jRadioButton6.setSelected(false);
            jRadioButton6.setVisible(false);
        } else {
            txtbebidaspregun4.setVisible(false);
            jLabel42.setVisible(false);
            ConsumoBebidas.setPg4("-");
            jRadioButton6.setSelected(false);
            jRadioButton6.setVisible(false);
        }
    }//GEN-LAST:event_jCheckBox40ItemStateChanged

    private void jCheckBox41ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox41ItemStateChanged
        if (jCheckBox41.isSelected()) {
            jCheckBox42.setSelected(false);
            txtbebidaspregun5.setVisible(true);
            jLabel41.setVisible(true);
            ConsumoBebidas.setPg5("Sí");
            jRadioButton7.setVisible(true);
        } else {
            ConsumoBebidas.setPg5("-");
            txtbebidaspregun5.setVisible(false);
            jLabel41.setVisible(false);
            jRadioButton7.setVisible(false);
            jRadioButton7.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox41ItemStateChanged

    private void jCheckBox42ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox42ItemStateChanged
        if (jCheckBox42.isSelected()) {
            jCheckBox41.setSelected(false);
            txtbebidaspregun5.setVisible(false);
            jLabel41.setVisible(false);
            ConsumoBebidas.setPg5("No");
            jRadioButton7.setVisible(false);
            jRadioButton7.setSelected(false);
        } else {
            txtbebidaspregun5.setVisible(false);
            jLabel41.setVisible(false);
            ConsumoBebidas.setPg5("-");
            jRadioButton7.setVisible(false);
            jRadioButton7.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox42ItemStateChanged

    private void jCheckBox43ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox43ItemStateChanged
        if (jCheckBox43.isSelected()) {
            jCheckBox44.setSelected(false);
            txtbebidaspregun6.setVisible(true);
            jLabel40.setVisible(true);
            ConsumoBebidas.setPg6("Sí");
            jRadioButton9.setVisible(true);
        } else {
            ConsumoBebidas.setPg6("-");
            txtbebidaspregun6.setVisible(false);
            jLabel40.setVisible(false);
            jRadioButton9.setVisible(false);
            jRadioButton9.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox43ItemStateChanged

    private void jCheckBox44ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox44ItemStateChanged
        if (jCheckBox44.isSelected()) {
            jCheckBox43.setSelected(false);
            txtbebidaspregun6.setVisible(false);
            jLabel40.setVisible(false);
            ConsumoBebidas.setPg6("No");
            jRadioButton9.setSelected(false);
            jRadioButton9.setVisible(false);
        } else {
            txtbebidaspregun6.setVisible(false);
            jLabel40.setVisible(false);
            ConsumoBebidas.setPg6("-");
            jRadioButton9.setSelected(false);
            jRadioButton9.setVisible(false);
        }
    }//GEN-LAST:event_jCheckBox44ItemStateChanged

    private void jCheckBox45ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox45ItemStateChanged
        if (jCheckBox45.isSelected()) {
            jCheckBox46.setSelected(false);
            txtbebidaspregun7.setVisible(true);
            jLabel39.setVisible(true);
            ConsumoBebidas.setPg7("Sí");
            jRadioButton8.setVisible(true);
        } else {
            ConsumoBebidas.setPg7("-");
            txtbebidaspregun7.setVisible(false);
            jLabel39.setVisible(false);
            jRadioButton8.setVisible(false);
            jRadioButton8.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox45ItemStateChanged

    private void jCheckBox46ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox46ItemStateChanged
        if (jCheckBox46.isSelected()) {
            jCheckBox45.setSelected(false);
            txtbebidaspregun7.setVisible(false);
            jLabel39.setVisible(false);
            ConsumoBebidas.setPg7("No");
            jRadioButton8.setSelected(false);
            jRadioButton8.setVisible(false);
        } else {
            txtbebidaspregun7.setVisible(false);
            jLabel39.setVisible(false);
            ConsumoBebidas.setPg7("-");
            jRadioButton8.setSelected(false);
            jRadioButton8.setVisible(false);
        }
    }//GEN-LAST:event_jCheckBox46ItemStateChanged

    private void jCheckBox47ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox47ItemStateChanged
        if (jCheckBox47.isSelected()) {
            jCheckBox48.setSelected(false);
            txtbebidaspregun8.setVisible(true);
            jLabel38.setVisible(true);
            ConsumoBebidas.setPg8("Sí");
            jRadioButton10.setVisible(true);
        } else {
            ConsumoBebidas.setPg8("-");
            txtbebidaspregun8.setVisible(false);
            jLabel38.setVisible(false);
            jRadioButton10.setVisible(false);
            jRadioButton10.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox47ItemStateChanged

    private void jCheckBox48ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox48ItemStateChanged
        if (jCheckBox48.isSelected()) {
            jCheckBox47.setSelected(false);
            txtbebidaspregun8.setVisible(false);
            jLabel38.setVisible(false);
            ConsumoBebidas.setPg8("No");
            jRadioButton10.setVisible(false);
            jRadioButton10.setSelected(false);
        } else {
            txtbebidaspregun8.setVisible(false);
            jLabel38.setVisible(false);
            ConsumoBebidas.setPg8("-");
            jRadioButton10.setVisible(false);
            jRadioButton10.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox48ItemStateChanged

    private void jCheckBox49ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox49ItemStateChanged
        if (jCheckBox49.isSelected()) {
            jCheckBox50.setSelected(false);
            ConsumoBebidas.setPg9("Sí");
            jLabel44.setVisible(true);
            txtbebidaspregun9.setVisible(true);
            jRadioButton11.setVisible(true);
        } else {
            ConsumoBebidas.setPg9("-");
            jLabel44.setVisible(false);
            txtbebidaspregun9.setVisible(false);
            jRadioButton11.setVisible(false);
            jRadioButton11.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox49ItemStateChanged

    private void jCheckBox50ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox50ItemStateChanged

        if (jCheckBox50.isSelected()) {
            jCheckBox49.setSelected(false);
            ConsumoBebidas.setPg9("No");
            jLabel44.setVisible(false);
            txtbebidaspregun9.setVisible(false);
            jRadioButton11.setVisible(false);
            jRadioButton11.setSelected(false);
        } else {
            ConsumoBebidas.setPg9("-");
            jLabel44.setVisible(false);
            txtbebidaspregun9.setVisible(false);
            jRadioButton11.setVisible(false);
            jRadioButton11.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox50ItemStateChanged

    private void txtfrecuenciabebidaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_txtfrecuenciabebidaItemStateChanged
        ConsumoBebidas.setFrecuencia_bebi(txtfrecuenciabebida.getSelectedItem().toString());
    }//GEN-LAST:event_txtfrecuenciabebidaItemStateChanged

    private void txtfamiliape1CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtfamiliape1CaretUpdate
        ConsumoBebidas.setAdmisionConsumoBebidas(txtfamiliape1.getText());
    }//GEN-LAST:event_txtfamiliape1CaretUpdate

    private void jCheckBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox1ItemStateChanged
        if (jCheckBox1.isSelected()) {
            jCheckBox2.setSelected(false);
            txtfamiliape1.setVisible(true);
            jLabel46.setVisible(true);
            Admisiones.setAdmCBA10("hay");
        } else if (!jCheckBox1.isSelected()) {
            Admisiones.setAdmCBA10("nohay");
            txtfamiliape1.setVisible(false);
            jLabel46.setVisible(false);
        }
    }//GEN-LAST:event_jCheckBox1ItemStateChanged

    private void jCheckBox2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox2ItemStateChanged
        if (jCheckBox2.isSelected()) {
            jCheckBox1.setSelected(false);
            txtfamiliape1.setVisible(false);
            jLabel46.setVisible(false);
            Admisiones.setAdmCBA10("nohay");
        } else {
            Admisiones.setAdmCBA10("nohay");
        }
    }//GEN-LAST:event_jCheckBox2ItemStateChanged

    private void txtlastvezconsu1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtlastvezconsu1KeyTyped
        int k = (int) evt.getKeyChar();
        if (k == 39) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "¡No se acepta ese tipo de carácter!", "Error de datos ingresados", JOptionPane.ERROR_MESSAGE, iconThinking_uh);
        }
        InputMap map = txtlastvezconsu1.getInputMap(JTextField.WHEN_FOCUSED);
//        map.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, CTRL_MASK), "null");
    }//GEN-LAST:event_txtlastvezconsu1KeyTyped

    private void spcantidadocasionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_spcantidadocasionKeyTyped
        int k = (int) evt.getKeyChar();
        if (k == 39) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "¡No se acepta ese tipo de carácter!", "Error de datos ingresados", JOptionPane.ERROR_MESSAGE, iconThinking_uh);
        }
        InputMap map = spcantidadocasion.getInputMap(JTextField.WHEN_FOCUSED);
//        map.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, CTRL_MASK), "null");
    }//GEN-LAST:event_spcantidadocasionKeyTyped

    private void txtlastvezconsuKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtlastvezconsuKeyTyped
        int k = (int) evt.getKeyChar();
        if (k == 39) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "¡No se acepta ese tipo de carácter!", "Error de datos ingresados", JOptionPane.ERROR_MESSAGE, iconThinking_uh);
        }
        InputMap map = txtlastvezconsu.getInputMap(JTextField.WHEN_FOCUSED);
//        map.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, CTRL_MASK), "null");
    }//GEN-LAST:event_txtlastvezconsuKeyTyped

    private void txtbebidaspregun1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbebidaspregun1KeyTyped
        int k = (int) evt.getKeyChar();
        if (k == 39) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "¡No se acepta ese tipo de carácter!", "Error de datos ingresados", JOptionPane.ERROR_MESSAGE, iconThinking_uh);
        }
        InputMap map = txtbebidaspregun1.getInputMap(JTextField.WHEN_FOCUSED);
//        map.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, CTRL_MASK), "null");
    }//GEN-LAST:event_txtbebidaspregun1KeyTyped

    private void txtbebidaspregun2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbebidaspregun2KeyTyped
        int k = (int) evt.getKeyChar();
        if (k == 39) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "¡No se acepta ese tipo de carácter!", "Error de datos ingresados", JOptionPane.ERROR_MESSAGE, iconThinking_uh);
        }
        InputMap map = txtbebidaspregun2.getInputMap(JTextField.WHEN_FOCUSED);
//        map.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, CTRL_MASK), "null");
    }//GEN-LAST:event_txtbebidaspregun2KeyTyped

    private void txtbebidaspregun3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbebidaspregun3KeyTyped
        int k = (int) evt.getKeyChar();
        if (k == 39) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "¡No se acepta ese tipo de carácter!", "Error de datos ingresados", JOptionPane.ERROR_MESSAGE, iconThinking_uh);
        }
        InputMap map = txtbebidaspregun3.getInputMap(JTextField.WHEN_FOCUSED);
//        map.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, CTRL_MASK), "null");
    }//GEN-LAST:event_txtbebidaspregun3KeyTyped

    private void txtbebidaspregun4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbebidaspregun4KeyTyped
        int k = (int) evt.getKeyChar();
        if (k == 39) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "¡No se acepta ese tipo de carácter!", "Error de datos ingresados", JOptionPane.ERROR_MESSAGE, iconThinking_uh);
        }
        InputMap map = txtbebidaspregun4.getInputMap(JTextField.WHEN_FOCUSED);
//        map.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, CTRL_MASK), "null");
    }//GEN-LAST:event_txtbebidaspregun4KeyTyped

    private void txtbebidaspregun5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbebidaspregun5KeyTyped
        int k = (int) evt.getKeyChar();
        if (k == 39) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "¡No se acepta ese tipo de carácter!", "Error de datos ingresados", JOptionPane.ERROR_MESSAGE, iconThinking_uh);
        }
        InputMap map = txtbebidaspregun5.getInputMap(JTextField.WHEN_FOCUSED);
//        map.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, CTRL_MASK), "null");
    }//GEN-LAST:event_txtbebidaspregun5KeyTyped

    private void txtbebidaspregun6KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbebidaspregun6KeyTyped
        int k = (int) evt.getKeyChar();
        if (k == 39) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "¡No se acepta ese tipo de carácter!", "Error de datos ingresados", JOptionPane.ERROR_MESSAGE, iconThinking_uh);
        }
        InputMap map = txtbebidaspregun6.getInputMap(JTextField.WHEN_FOCUSED);
//        map.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, CTRL_MASK), "null");
    }//GEN-LAST:event_txtbebidaspregun6KeyTyped

    private void txtbebidaspregun7KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbebidaspregun7KeyTyped
        int k = (int) evt.getKeyChar();
        if (k == 39) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "¡No se acepta ese tipo de carácter!", "Error de datos ingresados", JOptionPane.ERROR_MESSAGE, iconThinking_uh);
        }
        InputMap map = txtbebidaspregun7.getInputMap(JTextField.WHEN_FOCUSED);
//        map.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, CTRL_MASK), "null");
    }//GEN-LAST:event_txtbebidaspregun7KeyTyped

    private void txtbebidaspregun8KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbebidaspregun8KeyTyped
        int k = (int) evt.getKeyChar();
        if (k == 39) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "¡No se acepta ese tipo de carácter!", "Error de datos ingresados", JOptionPane.ERROR_MESSAGE, iconThinking_uh);
        }
        InputMap map = txtbebidaspregun8.getInputMap(JTextField.WHEN_FOCUSED);
//        map.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, CTRL_MASK), "null");
    }//GEN-LAST:event_txtbebidaspregun8KeyTyped

    private void txtbebidaspregun9KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbebidaspregun9KeyTyped
        int k = (int) evt.getKeyChar();
        if (k == 39) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "¡No se acepta ese tipo de carácter!", "Error de datos ingresados", JOptionPane.ERROR_MESSAGE, iconThinking_uh);
        }
        InputMap map = txtbebidaspregun9.getInputMap(JTextField.WHEN_FOCUSED);
//        map.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, CTRL_MASK), "null");
    }//GEN-LAST:event_txtbebidaspregun9KeyTyped

    private void txtfamiliape1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtfamiliape1KeyTyped
        int k = (int) evt.getKeyChar();
        if (k == 39) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "¡No se acepta ese tipo de carácter!", "Error de datos ingresados", JOptionPane.ERROR_MESSAGE, iconThinking_uh);
        }
        InputMap map = txtfamiliape1.getInputMap(JTextField.WHEN_FOCUSED);
//        map.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, CTRL_MASK), "null");
    }//GEN-LAST:event_txtfamiliape1KeyTyped

    private void jRadioButton7ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton7ItemStateChanged
        if (jRadioButton7.isSelected()) {
            Admisiones.setAdmCBA5("hay");
        } else {
            Admisiones.setAdmCBA5("nohay");
        }
    }//GEN-LAST:event_jRadioButton7ItemStateChanged

    private void jRadioButton9ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton9ItemStateChanged
        if (jRadioButton9.isSelected()) {
            Admisiones.setAdmCBA6("hay");
        } else {
            Admisiones.setAdmCBA6("nohay");
        }
    }//GEN-LAST:event_jRadioButton9ItemStateChanged

    private void jRadioButton8ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton8ItemStateChanged
        if (jRadioButton8.isSelected()) {
            Admisiones.setAdmCBA7("hay");
        } else {
            Admisiones.setAdmCBA7("nohay");
        }
    }//GEN-LAST:event_jRadioButton8ItemStateChanged

    private void jRadioButton10ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton10ItemStateChanged
        if (jRadioButton10.isSelected()) {
            Admisiones.setAdmCBA8("hay");
        } else {
            Admisiones.setAdmCBA8("nohay");
        }
    }//GEN-LAST:event_jRadioButton10ItemStateChanged

    private void jRadioButton11ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton11ItemStateChanged
        if (jRadioButton11.isSelected()) {
            Admisiones.setAdmCBA9("hay");
        } else {
            Admisiones.setAdmCBA9("nohay");
        }
    }//GEN-LAST:event_jRadioButton11ItemStateChanged

    private void txtlastvezconsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtlastvezconsuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtlastvezconsuActionPerformed

    private void jRadioButton3ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton3ItemStateChanged
      if (jRadioButton3.isSelected()) {
            Admisiones.setAdmCBA1("hay");
        } else {
            Admisiones.setAdmCBA1("nohay");
        }
    }//GEN-LAST:event_jRadioButton3ItemStateChanged

    private void jRadioButton4ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton4ItemStateChanged
       if (jRadioButton4.isSelected()) {
            Admisiones.setAdmCBA2("hay");
        } else {
            Admisiones.setAdmCBA2("nohay");
        }
    }//GEN-LAST:event_jRadioButton4ItemStateChanged

    private void jRadioButton5ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton5ItemStateChanged
   if (jRadioButton5.isSelected()) {
            Admisiones.setAdmCBA3("hay");
        } else {
            Admisiones.setAdmCBA3("nohay");
        }
    }//GEN-LAST:event_jRadioButton5ItemStateChanged

    private void jRadioButton6ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton6ItemStateChanged
      if (jRadioButton6.isSelected()) {
            Admisiones.setAdmCBA4("hay");
        } else {
            Admisiones.setAdmCBA4("nohay");
        }
    }//GEN-LAST:event_jRadioButton6ItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bebidaspregun1;
    private javax.swing.JLabel bebidaspregun2;
    private javax.swing.JLabel bebidaspregun3;
    private javax.swing.JLabel bebidaspregun4;
    private javax.swing.JLabel bebidaspregun5_1;
    private javax.swing.JLabel bebidaspregun6;
    private javax.swing.JLabel bebidaspregun7;
    private javax.swing.JLabel bebidaspregun8;
    private javax.swing.JLabel bebidaspregun9;
    private javax.swing.JLabel cantidadocasion;
    private javax.swing.JLabel frecuenciabebida;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox29;
    private javax.swing.JCheckBox jCheckBox30;
    private javax.swing.JCheckBox jCheckBox33;
    private javax.swing.JCheckBox jCheckBox34;
    private javax.swing.JCheckBox jCheckBox35;
    private javax.swing.JCheckBox jCheckBox36;
    private javax.swing.JCheckBox jCheckBox37;
    private javax.swing.JCheckBox jCheckBox38;
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
    private javax.swing.JLabel jLabel144;
    private javax.swing.JLabel jLabel145;
    private javax.swing.JLabel jLabel146;
    private javax.swing.JLabel jLabel147;
    private javax.swing.JLabel jLabel148;
    private javax.swing.JLabel jLabel149;
    private javax.swing.JLabel jLabel150;
    private javax.swing.JLabel jLabel151;
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
    private javax.swing.JLabel jLabel44;
    public static javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JRadioButton jRadioButton10;
    private javax.swing.JRadioButton jRadioButton11;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JRadioButton jRadioButton8;
    private javax.swing.JRadioButton jRadioButton9;
    private javax.swing.JScrollPane jScrollPane17;
    private javax.swing.JLabel lastvezconsu;
    private javax.swing.JTextField spcantidadocasion;
    private javax.swing.JLabel tipobebida;
    private javax.swing.JTextField txtbebidaspregun1;
    private javax.swing.JTextField txtbebidaspregun2;
    private javax.swing.JTextField txtbebidaspregun3;
    private javax.swing.JTextField txtbebidaspregun4;
    private javax.swing.JTextField txtbebidaspregun5;
    private javax.swing.JTextField txtbebidaspregun6;
    private javax.swing.JTextField txtbebidaspregun7;
    private javax.swing.JTextField txtbebidaspregun8;
    private javax.swing.JTextField txtbebidaspregun9;
    private javax.swing.JTextField txtfamiliape1;
    private javax.swing.JComboBox<String> txtfrecuenciabebida;
    private javax.swing.JTextField txtlastvezconsu;
    private javax.swing.JTextField txtlastvezconsu1;
    private javax.swing.JComboBox<String> txttipobebida;
    // End of variables declaration//GEN-END:variables
}
