package view;

import classes.Admisiones;
import classes.InfoFamiliar;
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
public class InformacionFamiliar extends javax.swing.JInternalFrame {

    public InformacionFamiliar() {
        ((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI()).setNorthPane(null);
        initComponents();
        jScrollPane5.getVerticalScrollBar().setUnitIncrement(15);
        jTextArea2.setLineWrap(true);
        jTextArea2.setWrapStyleWord(true);
        jTextArea3.setLineWrap(true);
        jTextArea3.setWrapStyleWord(true);
        deshaabilitaados();
        guiasinfo_fami();
    }

    Thinking_uh iconThinking_uh = new Thinking_uh();
    Admisiones adms = new Admisiones();

    public void guiasinfo_fami() {
        CorrectorOrtografia p = new CorrectorOrtografia("El examinado dijo vivir...", jTextArea2);
        CorrectorOrtografia p1 = new CorrectorOrtografia("Como familiares que no viven con ", jTextArea3);
        CorrectorOrtografia p2 = new CorrectorOrtografia("(no diligenciar en caso de no tener una relación sentimental)", txtrelacioncon);
        CorrectorOrtografia p3 = new CorrectorOrtografia("Aseguró que su núcleo primario y/o extenso...", txtfamiliape);
        SpellChecker.register(jTextArea2);
        SpellChecker.register(jTextArea3);
        SpellChecker.register(txtrelacioncon);
        SpellChecker.register(txtfamiliape);
    }

    public void deshaabilitaados() {
        jLabel32.setVisible(false);
        txtfamiliape1.setVisible(false);
        jLabel31.setVisible(false);
        txtfamiliape.setVisible(false);
        spinamigos.setVisible(false);
        spinabuelos.setVisible(false);
        spincunado.setVisible(false);
        spincunadas.setVisible(false);
        spincompadres.setVisible(false);
        spinhijos.setVisible(false);
        spinhijas.setVisible(false);
        spinhijastros.setVisible(false);
        spinhijastras.setVisible(false);
        spinhermanas.setVisible(false);
        spinhermanos.setVisible(false);
        spinhermanastros.setVisible(false);
        spinhermanastras.setVisible(false);
        spinhermanadoptivo.setVisible(false);
        spinhermanadoptiva.setVisible(false);
        spinprimos.setVisible(false);
        spinprimas.setVisible(false);
        spinsobrinos.setVisible(false);
        spinsobrinas.setVisible(false);
        spinnietos.setVisible(false);
        spintios.setVisible(false);
        spintias.setVisible(false);
        txtfamiliape.setVisible(false);
    }

    public void limpiar() {
        jCheckBox1.setSelected(false);
        jCheckBox2.setSelected(false);
        jCheckBox3.setSelected(false);
        jCheckBox4.setSelected(false);
        jCheckBox6.setSelected(false);
        jCheckBox7.setSelected(false);
        jCheckBox8.setSelected(false);
        jCheckBox9.setSelected(false);
        jCheckBox10.setSelected(false);
        jCheckBox11.setSelected(false);
        jRadioButton1.setSelected(false);
        jRadioButton2.setSelected(false);
        jTextArea2.setText("");
        rbamigos.setSelected(false);
        rbabuelos.setSelected(false);
        rbcunados1.setSelected(false);
        rbcunados8.setSelected(false);
        rbcunados.setSelected(false);
        rbcunados3.setSelected(false);
        rbcunados2.setSelected(false);
        rbcunados4.setSelected(false);
        rbcunados5.setSelected(false);
        rbcunados6.setSelected(false);
        rbcunados7.setSelected(false);
        rbfamicunado.setSelected(false);
        rbhijos.setSelected(false);
        rbhijos1.setSelected(false);
        rbhijos2.setSelected(false);
        rbhijastros.setSelected(false);
        rbhijastros1.setSelected(false);
        rbhermanos1.setSelected(false);
        rbhermanos.setSelected(false);
        rbhermanastros.setSelected(false);
        rbhermanastros1.setSelected(false);
        rbhermanadop.setSelected(false);
        rbhermanadop1.setSelected(false);
        rbmadrebio.setSelected(false);
        rbmadreadop.setSelected(false);
        rbmadreadop1.setSelected(false);
        rbsolo.setSelected(false);
        rbnuera.setSelected(false);
        rbpadrebio.setSelected(false);
        rbpadreadop.setSelected(false);
        rbpadreadop1.setSelected(false);
        rbpadresbio.setSelected(false);
        rbpadresadop.setSelected(false);
        rbpadrastros.setSelected(false);
        rbparemujer.setSelected(false);
        rbparehombre.setSelected(false);
        rbprimos2.setSelected(false);
        rbprimos1.setSelected(false);
        rbprimos.setSelected(false);
        rbsobrinos.setSelected(false);
        rbsobrinos1.setSelected(false);
        rbsobrinos2.setSelected(false);
        rbnietos.setSelected(false);
        rbsuegros.setSelected(false);
        rbsuegros1.setSelected(false);
        rbsuegros2.setSelected(false);
        rbtutioelv.setSelected(false);
        rbtutioelv1.setSelected(false);
        rbyerno.setSelected(false);

        spinamigos.setValue(0);
        spinabuelos.setValue(0);
        spincunado.setValue(0);
        spincunadas.setValue(0);
        spincompadres.setValue(0);
        spinhijos.setValue(0);
        spinhijas.setValue(0);
        spinhijastros.setValue(0);
        spinhijastras.setValue(0);
        spinhermanas.setValue(0);
        spinhermanos.setValue(0);
        spinhermanastros.setValue(0);
        spinhermanastras.setValue(0);
        spinhermanadoptivo.setValue(0);
        spinhermanadoptiva.setValue(0);
        spinprimos.setValue(0);
        spinprimas.setValue(0);
        spinsobrinos.setValue(0);
        spinsobrinas.setValue(0);
        spinnietos.setValue(0);
        spintios.setValue(0);
        spintias.setValue(0);

        jTextArea3.setText("");
        txtrelacioncon.setText("");
        txtfamiliape.setText("");
        
        jScrollPane10.getVerticalScrollBar().setValue(0);
        jScrollPane5.getVerticalScrollBar().setValue(0);
        jScrollPane9.getVerticalScrollBar().setValue(0);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane5 = new javax.swing.JScrollPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        rbamigos = new javax.swing.JRadioButton();
        rbabuelos = new javax.swing.JRadioButton();
        rbpadreadop = new javax.swing.JRadioButton();
        rbhermanadop = new javax.swing.JRadioButton();
        rbcunados = new javax.swing.JRadioButton();
        rbnietos = new javax.swing.JRadioButton();
        rbfamicunado = new javax.swing.JRadioButton();
        rbsobrinos = new javax.swing.JRadioButton();
        rbpadresadop = new javax.swing.JRadioButton();
        rbpadresbio = new javax.swing.JRadioButton();
        rbhijos = new javax.swing.JRadioButton();
        rbhijastros = new javax.swing.JRadioButton();
        rbhermanastros = new javax.swing.JRadioButton();
        rbpadrastros = new javax.swing.JRadioButton();
        rbmadreadop = new javax.swing.JRadioButton();
        rbhermanos = new javax.swing.JRadioButton();
        rbparemujer = new javax.swing.JRadioButton();
        rbparehombre = new javax.swing.JRadioButton();
        rbsuegros = new javax.swing.JRadioButton();
        rbmadrebio = new javax.swing.JRadioButton();
        rbnuera = new javax.swing.JRadioButton();
        rbpadrebio = new javax.swing.JRadioButton();
        rbsolo = new javax.swing.JRadioButton();
        rbprimos = new javax.swing.JRadioButton();
        rbyerno = new javax.swing.JRadioButton();
        rbtutioelv = new javax.swing.JRadioButton();
        relacioncon = new javax.swing.JLabel();
        txtrelacioncon = new javax.swing.JTextField();
        txtfamiliape = new javax.swing.JTextField();
        rbcunados1 = new javax.swing.JRadioButton();
        rbcunados2 = new javax.swing.JRadioButton();
        rbcunados3 = new javax.swing.JRadioButton();
        rbcunados4 = new javax.swing.JRadioButton();
        rbcunados5 = new javax.swing.JRadioButton();
        rbcunados6 = new javax.swing.JRadioButton();
        rbcunados7 = new javax.swing.JRadioButton();
        rbhijos1 = new javax.swing.JRadioButton();
        rbhijos2 = new javax.swing.JRadioButton();
        rbhijastros1 = new javax.swing.JRadioButton();
        rbhermanos1 = new javax.swing.JRadioButton();
        rbhermanastros1 = new javax.swing.JRadioButton();
        rbhermanadop1 = new javax.swing.JRadioButton();
        rbmadreadop1 = new javax.swing.JRadioButton();
        rbpadreadop1 = new javax.swing.JRadioButton();
        rbprimos1 = new javax.swing.JRadioButton();
        rbprimos2 = new javax.swing.JRadioButton();
        rbsobrinos1 = new javax.swing.JRadioButton();
        rbsobrinos2 = new javax.swing.JRadioButton();
        rbsuegros1 = new javax.swing.JRadioButton();
        rbsuegros2 = new javax.swing.JRadioButton();
        rbtutioelv1 = new javax.swing.JRadioButton();
        rbcunados8 = new javax.swing.JRadioButton();
        jScrollPane10 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jLabel53 = new javax.swing.JLabel();
        spincompadres = new javax.swing.JSpinner();
        spinhijas = new javax.swing.JSpinner();
        spinamigos = new javax.swing.JSpinner();
        spinabuelos = new javax.swing.JSpinner();
        spincunado = new javax.swing.JSpinner();
        spincunadas = new javax.swing.JSpinner();
        spinhermanadoptiva = new javax.swing.JSpinner();
        spinhermanadoptivo = new javax.swing.JSpinner();
        spinhermanastras = new javax.swing.JSpinner();
        spinhermanastros = new javax.swing.JSpinner();
        spinhermanos = new javax.swing.JSpinner();
        spinhermanas = new javax.swing.JSpinner();
        spinhijastras = new javax.swing.JSpinner();
        spinhijastros = new javax.swing.JSpinner();
        spinhijos = new javax.swing.JSpinner();
        spinnietos = new javax.swing.JSpinner();
        spintias = new javax.swing.JSpinner();
        spintios = new javax.swing.JSpinner();
        spinprimos = new javax.swing.JSpinner();
        spinprimas = new javax.swing.JSpinner();
        spinsobrinos = new javax.swing.JSpinner();
        spinsobrinas = new javax.swing.JSpinner();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        txtfamiliape1 = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox6 = new javax.swing.JCheckBox();
        jCheckBox7 = new javax.swing.JCheckBox();
        jCheckBox8 = new javax.swing.JCheckBox();
        jCheckBox9 = new javax.swing.JCheckBox();
        jCheckBox10 = new javax.swing.JCheckBox();
        jCheckBox11 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(null);
        setPreferredSize(new java.awt.Dimension(975, 550));

        jScrollPane5.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane5.setBorder(null);
        jScrollPane5.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel28.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel28.setText("¿Cuál es su estado civil?");

        jLabel42.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel42.setText("El examinado dijo vivir:");

        jLabel43.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel43.setText("Relación sentimental con:");

        jLabel44.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel44.setText("¿Cree que su familia representa un riesgo para la sociedad o para usted mismo?");

        rbamigos.setBackground(new java.awt.Color(255, 255, 255));
        rbamigos.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        rbamigos.setText("Amigo(s)");
        rbamigos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rbamigosItemStateChanged(evt);
            }
        });
        rbamigos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbamigosMouseClicked(evt);
            }
        });

        rbabuelos.setBackground(new java.awt.Color(255, 255, 255));
        rbabuelos.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        rbabuelos.setText("Abuelo(s)");
        rbabuelos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rbabuelosItemStateChanged(evt);
            }
        });

        rbpadreadop.setBackground(new java.awt.Color(255, 255, 255));
        rbpadreadop.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        rbpadreadop.setText("Padre Adoptivo");
        rbpadreadop.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rbpadreadopItemStateChanged(evt);
            }
        });

        rbhermanadop.setBackground(new java.awt.Color(255, 255, 255));
        rbhermanadop.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        rbhermanadop.setText("Hermano(s) Adoptivo(s)");
        rbhermanadop.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rbhermanadopItemStateChanged(evt);
            }
        });

        rbcunados.setBackground(new java.awt.Color(255, 255, 255));
        rbcunados.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        rbcunados.setText("Cuñados");
        rbcunados.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rbcunadosItemStateChanged(evt);
            }
        });

        rbnietos.setBackground(new java.awt.Color(255, 255, 255));
        rbnietos.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        rbnietos.setText("Nieto(s)");
        rbnietos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rbnietosItemStateChanged(evt);
            }
        });

        rbfamicunado.setBackground(new java.awt.Color(255, 255, 255));
        rbfamicunado.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        rbfamicunado.setText("Familia Primo(a)");
        rbfamicunado.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rbfamicunadoItemStateChanged(evt);
            }
        });

        rbsobrinos.setBackground(new java.awt.Color(255, 255, 255));
        rbsobrinos.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        rbsobrinos.setText("Sobrino(s)");
        rbsobrinos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rbsobrinosItemStateChanged(evt);
            }
        });

        rbpadresadop.setBackground(new java.awt.Color(255, 255, 255));
        rbpadresadop.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        rbpadresadop.setText("Padres Adoptivos");
        rbpadresadop.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rbpadresadopItemStateChanged(evt);
            }
        });

        rbpadresbio.setBackground(new java.awt.Color(255, 255, 255));
        rbpadresbio.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        rbpadresbio.setText("Padres Biológicos");
        rbpadresbio.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rbpadresbioItemStateChanged(evt);
            }
        });

        rbhijos.setBackground(new java.awt.Color(255, 255, 255));
        rbhijos.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        rbhijos.setText("Hijos");
        rbhijos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rbhijosItemStateChanged(evt);
            }
        });

        rbhijastros.setBackground(new java.awt.Color(255, 255, 255));
        rbhijastros.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        rbhijastros.setText("Hijastro(s)");
        rbhijastros.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rbhijastrosItemStateChanged(evt);
            }
        });

        rbhermanastros.setBackground(new java.awt.Color(255, 255, 255));
        rbhermanastros.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        rbhermanastros.setText("Hermanastro(s)");
        rbhermanastros.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rbhermanastrosItemStateChanged(evt);
            }
        });

        rbpadrastros.setBackground(new java.awt.Color(255, 255, 255));
        rbpadrastros.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        rbpadrastros.setText("Padrastro/Madrastra ");
        rbpadrastros.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rbpadrastrosItemStateChanged(evt);
            }
        });

        rbmadreadop.setBackground(new java.awt.Color(255, 255, 255));
        rbmadreadop.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        rbmadreadop.setText("Madre Adoptiva");
        rbmadreadop.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rbmadreadopItemStateChanged(evt);
            }
        });

        rbhermanos.setBackground(new java.awt.Color(255, 255, 255));
        rbhermanos.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        rbhermanos.setText("Hermano(s)");
        rbhermanos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rbhermanosItemStateChanged(evt);
            }
        });

        rbparemujer.setBackground(new java.awt.Color(255, 255, 255));
        rbparemujer.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        rbparemujer.setText("Pareja Mujer");
        rbparemujer.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rbparemujerItemStateChanged(evt);
            }
        });

        rbparehombre.setBackground(new java.awt.Color(255, 255, 255));
        rbparehombre.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        rbparehombre.setText("Pareja Hombre");
        rbparehombre.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rbparehombreItemStateChanged(evt);
            }
        });

        rbsuegros.setBackground(new java.awt.Color(255, 255, 255));
        rbsuegros.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        rbsuegros.setText("Suegro");
        rbsuegros.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rbsuegrosItemStateChanged(evt);
            }
        });

        rbmadrebio.setBackground(new java.awt.Color(255, 255, 255));
        rbmadrebio.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        rbmadrebio.setText("Madre Biológica");
        rbmadrebio.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rbmadrebioItemStateChanged(evt);
            }
        });

        rbnuera.setBackground(new java.awt.Color(255, 255, 255));
        rbnuera.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        rbnuera.setText("Nuera");
        rbnuera.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rbnueraItemStateChanged(evt);
            }
        });

        rbpadrebio.setBackground(new java.awt.Color(255, 255, 255));
        rbpadrebio.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        rbpadrebio.setText("Padre Biológico");
        rbpadrebio.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rbpadrebioItemStateChanged(evt);
            }
        });

        rbsolo.setBackground(new java.awt.Color(255, 255, 255));
        rbsolo.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        rbsolo.setText("Solo");
        rbsolo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rbsoloItemStateChanged(evt);
            }
        });

        rbprimos.setBackground(new java.awt.Color(255, 255, 255));
        rbprimos.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        rbprimos.setText("Prima(s)");
        rbprimos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rbprimosItemStateChanged(evt);
            }
        });

        rbyerno.setBackground(new java.awt.Color(255, 255, 255));
        rbyerno.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        rbyerno.setText("Yerno");
        rbyerno.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rbyernoItemStateChanged(evt);
            }
        });

        rbtutioelv.setBackground(new java.awt.Color(255, 255, 255));
        rbtutioelv.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        rbtutioelv.setText("Tío(s)");
        rbtutioelv.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rbtutioelvItemStateChanged(evt);
            }
        });

        relacioncon.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        relacioncon.setText("Sostiene una relación con:");

        txtrelacioncon.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtrelacioncon.setBorder(null);
        txtrelacioncon.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtrelacionconCaretUpdate(evt);
            }
        });
        txtrelacioncon.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtrelacionconKeyTyped(evt);
            }
        });

        txtfamiliape.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtfamiliape.setBorder(null);
        txtfamiliape.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtfamiliapeCaretUpdate(evt);
            }
        });
        txtfamiliape.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtfamiliapeKeyTyped(evt);
            }
        });

        rbcunados1.setBackground(new java.awt.Color(255, 255, 255));
        rbcunados1.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        rbcunados1.setText("Cuñado(s)");
        rbcunados1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rbcunados1ItemStateChanged(evt);
            }
        });

        rbcunados2.setBackground(new java.awt.Color(255, 255, 255));
        rbcunados2.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        rbcunados2.setText("Esposo");
        rbcunados2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rbcunados2ItemStateChanged(evt);
            }
        });

        rbcunados3.setBackground(new java.awt.Color(255, 255, 255));
        rbcunados3.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        rbcunados3.setText("Compañero(s) ap.");
        rbcunados3.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rbcunados3ItemStateChanged(evt);
            }
        });

        rbcunados4.setBackground(new java.awt.Color(255, 255, 255));
        rbcunados4.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        rbcunados4.setText("Esposa");
        rbcunados4.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rbcunados4ItemStateChanged(evt);
            }
        });

        rbcunados5.setBackground(new java.awt.Color(255, 255, 255));
        rbcunados5.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        rbcunados5.setText("Esposo de Tío");
        rbcunados5.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rbcunados5ItemStateChanged(evt);
            }
        });

        rbcunados6.setBackground(new java.awt.Color(255, 255, 255));
        rbcunados6.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        rbcunados6.setText("Esposo de Tía");
        rbcunados6.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rbcunados6ItemStateChanged(evt);
            }
        });

        rbcunados7.setBackground(new java.awt.Color(255, 255, 255));
        rbcunados7.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        rbcunados7.setText("Familia Cuñado(a)");
        rbcunados7.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rbcunados7ItemStateChanged(evt);
            }
        });

        rbhijos1.setBackground(new java.awt.Color(255, 255, 255));
        rbhijos1.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        rbhijos1.setText("Hijo(s)");
        rbhijos1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rbhijos1ItemStateChanged(evt);
            }
        });

        rbhijos2.setBackground(new java.awt.Color(255, 255, 255));
        rbhijos2.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        rbhijos2.setText("Hija(s)");
        rbhijos2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rbhijos2ItemStateChanged(evt);
            }
        });

        rbhijastros1.setBackground(new java.awt.Color(255, 255, 255));
        rbhijastros1.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        rbhijastros1.setText("Hijastra(s)");
        rbhijastros1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rbhijastros1ItemStateChanged(evt);
            }
        });

        rbhermanos1.setBackground(new java.awt.Color(255, 255, 255));
        rbhermanos1.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        rbhermanos1.setText("Hermana(s)");
        rbhermanos1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rbhermanos1ItemStateChanged(evt);
            }
        });

        rbhermanastros1.setBackground(new java.awt.Color(255, 255, 255));
        rbhermanastros1.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        rbhermanastros1.setText("Hermanastra(s)");
        rbhermanastros1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rbhermanastros1ItemStateChanged(evt);
            }
        });

        rbhermanadop1.setBackground(new java.awt.Color(255, 255, 255));
        rbhermanadop1.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        rbhermanadop1.setText("Hermana(s) Adoptiva(s)");
        rbhermanadop1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rbhermanadop1ItemStateChanged(evt);
            }
        });

        rbmadreadop1.setBackground(new java.awt.Color(255, 255, 255));
        rbmadreadop1.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        rbmadreadop1.setText("Madre de su Hijo (a)");
        rbmadreadop1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rbmadreadop1ItemStateChanged(evt);
            }
        });

        rbpadreadop1.setBackground(new java.awt.Color(255, 255, 255));
        rbpadreadop1.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        rbpadreadop1.setText("Padre de su hijo(a)");
        rbpadreadop1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rbpadreadop1ItemStateChanged(evt);
            }
        });

        rbprimos1.setBackground(new java.awt.Color(255, 255, 255));
        rbprimos1.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        rbprimos1.setText("Primo(s)");
        rbprimos1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rbprimos1ItemStateChanged(evt);
            }
        });

        rbprimos2.setBackground(new java.awt.Color(255, 255, 255));
        rbprimos2.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        rbprimos2.setText("Primos");
        rbprimos2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rbprimos2ItemStateChanged(evt);
            }
        });

        rbsobrinos1.setBackground(new java.awt.Color(255, 255, 255));
        rbsobrinos1.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        rbsobrinos1.setText("Sobrina(s)");
        rbsobrinos1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rbsobrinos1ItemStateChanged(evt);
            }
        });

        rbsobrinos2.setBackground(new java.awt.Color(255, 255, 255));
        rbsobrinos2.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        rbsobrinos2.setText("Sobrinos");
        rbsobrinos2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rbsobrinos2ItemStateChanged(evt);
            }
        });

        rbsuegros1.setBackground(new java.awt.Color(255, 255, 255));
        rbsuegros1.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        rbsuegros1.setText("Suegra");
        rbsuegros1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rbsuegros1ItemStateChanged(evt);
            }
        });

        rbsuegros2.setBackground(new java.awt.Color(255, 255, 255));
        rbsuegros2.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        rbsuegros2.setText("Suegros");
        rbsuegros2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rbsuegros2ItemStateChanged(evt);
            }
        });

        rbtutioelv1.setBackground(new java.awt.Color(255, 255, 255));
        rbtutioelv1.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        rbtutioelv1.setText("Tía(s)");
        rbtutioelv1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rbtutioelv1ItemStateChanged(evt);
            }
        });

        rbcunados8.setBackground(new java.awt.Color(255, 255, 255));
        rbcunados8.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        rbcunados8.setText("Cuñada(s)");
        rbcunados8.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rbcunados8ItemStateChanged(evt);
            }
        });

        jTextArea3.setColumns(20);
        jTextArea3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextArea3.setRows(5);
        jTextArea3.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextArea3CaretUpdate(evt);
            }
        });
        jTextArea3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextArea3KeyTyped(evt);
            }
        });
        jScrollPane10.setViewportView(jTextArea3);

        jLabel53.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel53.setText("Como familiares que no viven con el(la) mencionó a:");

        spincompadres.setFont(new java.awt.Font("Segoe UI Emoji", 0, 10)); // NOI18N
        spincompadres.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                spincompadresPropertyChange(evt);
            }
        });

        spinhijas.setFont(new java.awt.Font("Segoe UI Emoji", 0, 10)); // NOI18N
        spinhijas.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                spinhijasPropertyChange(evt);
            }
        });

        spinamigos.setFont(new java.awt.Font("Segoe UI Emoji", 0, 10)); // NOI18N
        spinamigos.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                spinamigosPropertyChange(evt);
            }
        });

        spinabuelos.setFont(new java.awt.Font("Segoe UI Emoji", 0, 10)); // NOI18N
        spinabuelos.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                spinabuelosPropertyChange(evt);
            }
        });

        spincunado.setFont(new java.awt.Font("Segoe UI Emoji", 0, 10)); // NOI18N
        spincunado.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                spincunadoPropertyChange(evt);
            }
        });

        spincunadas.setFont(new java.awt.Font("Segoe UI Emoji", 0, 10)); // NOI18N
        spincunadas.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                spincunadasPropertyChange(evt);
            }
        });

        spinhermanadoptiva.setFont(new java.awt.Font("Segoe UI Emoji", 0, 10)); // NOI18N
        spinhermanadoptiva.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                spinhermanadoptivaPropertyChange(evt);
            }
        });

        spinhermanadoptivo.setFont(new java.awt.Font("Segoe UI Emoji", 0, 10)); // NOI18N
        spinhermanadoptivo.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                spinhermanadoptivoPropertyChange(evt);
            }
        });

        spinhermanastras.setFont(new java.awt.Font("Segoe UI Emoji", 0, 10)); // NOI18N
        spinhermanastras.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                spinhermanastrasPropertyChange(evt);
            }
        });

        spinhermanastros.setFont(new java.awt.Font("Segoe UI Emoji", 0, 10)); // NOI18N
        spinhermanastros.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                spinhermanastrosPropertyChange(evt);
            }
        });

        spinhermanos.setFont(new java.awt.Font("Segoe UI Emoji", 0, 10)); // NOI18N
        spinhermanos.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                spinhermanosPropertyChange(evt);
            }
        });

        spinhermanas.setFont(new java.awt.Font("Segoe UI Emoji", 0, 10)); // NOI18N
        spinhermanas.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                spinhermanasPropertyChange(evt);
            }
        });

        spinhijastras.setFont(new java.awt.Font("Segoe UI Emoji", 0, 10)); // NOI18N
        spinhijastras.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                spinhijastrasPropertyChange(evt);
            }
        });

        spinhijastros.setFont(new java.awt.Font("Segoe UI Emoji", 0, 10)); // NOI18N
        spinhijastros.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                spinhijastrosPropertyChange(evt);
            }
        });

        spinhijos.setFont(new java.awt.Font("Segoe UI Emoji", 0, 10)); // NOI18N
        spinhijos.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                spinhijosPropertyChange(evt);
            }
        });

        spinnietos.setFont(new java.awt.Font("Segoe UI Emoji", 0, 10)); // NOI18N
        spinnietos.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                spinnietosPropertyChange(evt);
            }
        });

        spintias.setFont(new java.awt.Font("Segoe UI Emoji", 0, 10)); // NOI18N
        spintias.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                spintiasPropertyChange(evt);
            }
        });

        spintios.setFont(new java.awt.Font("Segoe UI Emoji", 0, 10)); // NOI18N
        spintios.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                spintiosPropertyChange(evt);
            }
        });

        spinprimos.setFont(new java.awt.Font("Segoe UI Emoji", 0, 10)); // NOI18N
        spinprimos.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                spinprimosPropertyChange(evt);
            }
        });

        spinprimas.setFont(new java.awt.Font("Segoe UI Emoji", 0, 10)); // NOI18N
        spinprimas.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                spinprimasPropertyChange(evt);
            }
        });

        spinsobrinos.setFont(new java.awt.Font("Segoe UI Emoji", 0, 10)); // NOI18N
        spinsobrinos.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                spinsobrinosPropertyChange(evt);
            }
        });

        spinsobrinas.setFont(new java.awt.Font("Segoe UI Emoji", 0, 10)); // NOI18N
        spinsobrinas.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                spinsobrinasPropertyChange(evt);
            }
        });

        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextArea2.setRows(5);
        jTextArea2.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextArea2CaretUpdate(evt);
            }
        });
        jTextArea2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextArea2KeyTyped(evt);
            }
        });
        jScrollPane9.setViewportView(jTextArea2);

        jLabel30.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel31.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel32.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtfamiliape1.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtfamiliape1.setBorder(null);
        txtfamiliape1.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtfamiliape1CaretUpdate(evt);
            }
        });
        txtfamiliape1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfamiliape1ActionPerformed(evt);
            }
        });
        txtfamiliape1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtfamiliape1KeyTyped(evt);
            }
        });

        jLabel45.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel45.setText("¿Existen admisiones relevantes en esta categoría?");

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

        jCheckBox6.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox6.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jCheckBox6.setText("Soltero");
        jCheckBox6.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox6ItemStateChanged(evt);
            }
        });

        jCheckBox7.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox7.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jCheckBox7.setText("Casado");
        jCheckBox7.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox7ItemStateChanged(evt);
            }
        });

        jCheckBox8.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox8.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jCheckBox8.setText("Divorciado");
        jCheckBox8.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox8ItemStateChanged(evt);
            }
        });

        jCheckBox9.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox9.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jCheckBox9.setText("Viudo");
        jCheckBox9.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox9ItemStateChanged(evt);
            }
        });

        jCheckBox10.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox10.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jCheckBox10.setText("Unión libre");
        jCheckBox10.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox10ItemStateChanged(evt);
            }
        });

        jCheckBox11.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox11.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jCheckBox11.setText("Unión marital");
        jCheckBox11.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox11ItemStateChanged(evt);
            }
        });

        jCheckBox3.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox3.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jCheckBox3.setText("Sí");
        jCheckBox3.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox3ItemStateChanged(evt);
            }
        });

        jCheckBox4.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox4.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jCheckBox4.setText("No");
        jCheckBox4.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox4ItemStateChanged(evt);
            }
        });

        jRadioButton1.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton1.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jRadioButton1.setText("Adm");
        jRadioButton1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButton1ItemStateChanged(evt);
            }
        });

        jRadioButton2.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton2.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jRadioButton2.setText("Adm");
        jRadioButton2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButton2ItemStateChanged(evt);
            }
        });
        jRadioButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtfamiliape, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane9)
                            .addComponent(jScrollPane10, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel31, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel32, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(txtfamiliape1, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(relacioncon)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtrelacioncon, javax.swing.GroupLayout.PREFERRED_SIZE, 739, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(722, 722, 722)
                                        .addComponent(jLabel43))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addComponent(jLabel53)
                                                .addGap(513, 513, 513)
                                                .addComponent(jRadioButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(rbcunados)
                                                    .addComponent(rbcunados2)
                                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                                        .addComponent(rbcunados8)
                                                        .addGap(44, 44, 44)
                                                        .addComponent(spincunadas, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                                        .addComponent(rbcunados1)
                                                        .addGap(42, 42, 42)
                                                        .addComponent(spincunado, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                                        .addComponent(rbabuelos)
                                                        .addGap(46, 46, 46)
                                                        .addComponent(spinabuelos, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                                        .addComponent(rbamigos)
                                                        .addGap(48, 48, 48)
                                                        .addComponent(spinamigos, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                                        .addComponent(rbcunados3)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(spincompadres, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addComponent(rbhijos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(rbfamicunado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(rbcunados7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(rbcunados6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(rbcunados5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(rbcunados4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addGap(45, 45, 45)
                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(rbmadrebio)
                                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                                        .addComponent(rbhermanastros1)
                                                        .addGap(46, 46, 46)
                                                        .addComponent(spinhermanastras, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                                        .addComponent(rbhermanastros)
                                                        .addGap(46, 46, 46)
                                                        .addComponent(spinhermanastros, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                                        .addComponent(rbhermanadop1)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(spinhermanadoptiva, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                                        .addComponent(rbhermanadop)
                                                        .addGap(0, 0, 0)
                                                        .addComponent(spinhermanadoptivo, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(rbhijastros)
                                                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                .addComponent(rbhermanos1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(rbhermanos, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                                                                .addComponent(rbhijastros1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                                .addGap(18, 18, 18)
                                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                    .addComponent(spinhermanas, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                    .addComponent(spinhermanos, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                    .addComponent(spinhijastras, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                                .addGap(18, 18, 18)
                                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                    .addComponent(spinhijas, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                    .addComponent(spinhijastros, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                    .addComponent(spinhijos, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(rbhijos2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(rbhijos1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addComponent(rbmadreadop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addGap(89, 89, 89)
                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(rbprimos2)
                                                    .addComponent(rbparemujer)
                                                    .addComponent(rbpadrastros)
                                                    .addComponent(rbmadreadop1)
                                                    .addComponent(rbnuera)
                                                    .addComponent(rbpadrebio)
                                                    .addComponent(rbpadreadop)
                                                    .addComponent(rbpadreadop1)
                                                    .addComponent(rbpadresbio)
                                                    .addComponent(rbpadresadop)
                                                    .addComponent(rbparehombre)
                                                    .addComponent(rbsolo))
                                                .addGap(64, 64, 64)
                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                            .addComponent(rbsuegros2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(rbsuegros1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(rbsobrinos2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(rbsuegros, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(rbsobrinos1, javax.swing.GroupLayout.Alignment.LEADING))
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(spinsobrinas, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                            .addComponent(rbyerno, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(rbnietos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(rbtutioelv, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(rbtutioelv1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(spinnietos, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(spintios, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(spintias, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                            .addComponent(rbprimos1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(rbprimos, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(rbsobrinos))
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(spinsobrinos, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(spinprimos, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(spinprimas, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel44)
                                        .addGap(292, 292, 292)
                                        .addComponent(jCheckBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jCheckBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel45)
                                        .addGap(478, 478, 478)
                                        .addComponent(jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jCheckBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel42, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel28)
                                        .addGap(52, 52, 52)
                                        .addComponent(jCheckBox6)
                                        .addGap(37, 37, 37)
                                        .addComponent(jCheckBox8)
                                        .addGap(35, 35, 35)
                                        .addComponent(jCheckBox10)
                                        .addGap(18, 18, 18)
                                        .addComponent(jCheckBox7)
                                        .addGap(35, 35, 35)
                                        .addComponent(jCheckBox9)
                                        .addGap(35, 35, 35)
                                        .addComponent(jCheckBox11)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(30, 30, 30))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jCheckBox7)
                        .addComponent(jCheckBox9)
                        .addComponent(jCheckBox11))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel28)
                        .addComponent(jCheckBox6)
                        .addComponent(jCheckBox8)
                        .addComponent(jCheckBox10)))
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel42)
                    .addComponent(jRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbamigos)
                            .addComponent(spinamigos, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbabuelos)
                            .addComponent(spinabuelos, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbcunados1)
                            .addComponent(spincunado, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbcunados8)
                            .addComponent(spincunadas, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbcunados)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbcunados3)
                            .addComponent(spincompadres, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbcunados2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbcunados4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbcunados5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbcunados6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbcunados7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbfamicunado))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbhijos1)
                            .addComponent(spinhijos, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbhijos2)
                            .addComponent(spinhijas, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbhijastros)
                            .addComponent(spinhijastros, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbhijastros1)
                            .addComponent(spinhijastras, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbhermanos1)
                            .addComponent(spinhermanas, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbhermanos)
                            .addComponent(spinhermanos, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbhermanastros)
                            .addComponent(spinhermanastros, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbhermanastros1)
                            .addComponent(spinhermanastras, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbhermanadop)
                            .addComponent(spinhermanadoptivo, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbhermanadop1)
                            .addComponent(spinhermanadoptiva, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbmadrebio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbmadreadop))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbprimos)
                            .addComponent(spinprimas, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(69, 69, 69)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbnietos, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spinnietos, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbprimos1)
                            .addComponent(spinprimos, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbsobrinos)
                            .addComponent(spinsobrinos, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbsobrinos1)
                            .addComponent(spinsobrinas, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbsobrinos2)
                        .addGap(20, 20, 20)
                        .addComponent(rbsuegros)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbsuegros1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbsuegros2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbtutioelv)
                            .addComponent(spintios, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbtutioelv1)
                            .addComponent(spintias, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbyerno))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(rbmadreadop1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbsolo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbnuera)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbpadrebio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbpadreadop)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbpadreadop1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbpadresbio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbpadresadop)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbpadrastros)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbparemujer)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbparehombre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbprimos2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbhijos)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel53)
                    .addComponent(jRadioButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(relacioncon)
                    .addComponent(txtrelacioncon, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jCheckBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jCheckBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel44))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtfamiliape, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel45)
                    .addComponent(jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtfamiliape1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        jScrollPane5.setViewportView(jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 975, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane5))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 523, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbamigosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rbamigosItemStateChanged
        if (rbamigos.isSelected()) {
            spinamigos.setVisible(true);
           
            InfoFamiliar.setTpersona1("hay");
        } else {
            spinamigos.setVisible(false);
            InfoFamiliar.setTpersona1("nohay");
        }
    }//GEN-LAST:event_rbamigosItemStateChanged

    private void rbabuelosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rbabuelosItemStateChanged
        if (rbabuelos.isSelected()) {
            spinabuelos.setVisible(true);
            InfoFamiliar.setTpersona2("hay");
        } else {
            spinabuelos.setVisible(false);
            InfoFamiliar.setTpersona2("nohay");
        }
    }//GEN-LAST:event_rbabuelosItemStateChanged

    private void rbcunados1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rbcunados1ItemStateChanged
        if (rbcunados1.isSelected()) {
            spincunado.setVisible(true);
            InfoFamiliar.setTpersona3("hay");
        } else {
            spincunado.setVisible(false);
            InfoFamiliar.setTpersona3("nohay");
        }
    }//GEN-LAST:event_rbcunados1ItemStateChanged

    private void rbcunados8ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rbcunados8ItemStateChanged

        if (rbcunados8.isSelected()) {
            spincunadas.setVisible(true);
            InfoFamiliar.setTpersona4("hay");
        } else {
            spincunadas.setVisible(false);
            InfoFamiliar.setTpersona4("nohay");
        }
    }//GEN-LAST:event_rbcunados8ItemStateChanged

    private void rbcunados3ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rbcunados3ItemStateChanged
        if (rbcunados3.isSelected()) {
            spincompadres.setVisible(true);
            InfoFamiliar.setTpersona6("hay");
        } else {
            spincompadres.setVisible(false);
            InfoFamiliar.setTpersona6("nohay");
        }
    }//GEN-LAST:event_rbcunados3ItemStateChanged

    private void rbhijos1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rbhijos1ItemStateChanged
        if (rbhijos1.isSelected()) {
            spinhijos.setVisible(true);
            InfoFamiliar.setTpersona14("hay");
        } else {
            spinhijos.setVisible(false);
            InfoFamiliar.setTpersona14("nohay");
        }
    }//GEN-LAST:event_rbhijos1ItemStateChanged

    private void rbhijos2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rbhijos2ItemStateChanged
        if (rbhijos2.isSelected()) {
            spinhijas.setVisible(true);
            InfoFamiliar.setTpersona15("hay");
        } else {
            spinhijas.setVisible(false);
            InfoFamiliar.setTpersona15("nohay");
        }
    }//GEN-LAST:event_rbhijos2ItemStateChanged

    private void rbhijastrosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rbhijastrosItemStateChanged
        if (rbhijastros.isSelected()) {
            spinhijastros.setVisible(true);
            InfoFamiliar.setTpersona16("hay");
        } else {
            spinhijastros.setVisible(false);
            InfoFamiliar.setTpersona16("nohay");
        }
    }//GEN-LAST:event_rbhijastrosItemStateChanged

    private void rbhijastros1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rbhijastros1ItemStateChanged
        if (rbhijastros1.isSelected()) {
            spinhijastras.setVisible(true);
            InfoFamiliar.setTpersona17("hay");
        } else {
            spinhijastras.setVisible(false);
            InfoFamiliar.setTpersona17("nohay");
        }
    }//GEN-LAST:event_rbhijastros1ItemStateChanged

    private void rbhermanos1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rbhermanos1ItemStateChanged
        if (rbhermanos1.isSelected()) {
            spinhermanas.setVisible(true);
            InfoFamiliar.setTpersona18("hay");
        } else {
            spinhermanas.setVisible(false);
            InfoFamiliar.setTpersona18("nohay");
        }
    }//GEN-LAST:event_rbhermanos1ItemStateChanged

    private void rbhermanosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rbhermanosItemStateChanged
        if (rbhermanos.isSelected()) {
            spinhermanos.setVisible(true);
            InfoFamiliar.setTpersona19("hay");
        } else {
            spinhermanos.setVisible(false);
            InfoFamiliar.setTpersona19("nohay");
        }
    }//GEN-LAST:event_rbhermanosItemStateChanged

    private void rbhermanastrosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rbhermanastrosItemStateChanged
        if (rbhermanastros.isSelected()) {
            spinhermanastros.setVisible(true);
            InfoFamiliar.setTpersona20("hay");
        } else {
            spinhermanastros.setVisible(false);
            InfoFamiliar.setTpersona20("nohay");
        }
    }//GEN-LAST:event_rbhermanastrosItemStateChanged

    private void rbhermanastros1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rbhermanastros1ItemStateChanged
        if (rbhermanastros1.isSelected()) {
            spinhermanastras.setVisible(true);
            InfoFamiliar.setTpersona21("hay");
        } else {
            spinhermanastras.setVisible(false);
            InfoFamiliar.setTpersona21("nohay");
        }
    }//GEN-LAST:event_rbhermanastros1ItemStateChanged

    private void rbhermanadopItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rbhermanadopItemStateChanged
        if (rbhermanadop.isSelected()) {
            spinhermanadoptivo.setVisible(true);
            InfoFamiliar.setTpersona22("hay");
        } else {
            spinhermanadoptivo.setVisible(false);
            InfoFamiliar.setTpersona22("nohay");
        }
    }//GEN-LAST:event_rbhermanadopItemStateChanged

    private void rbhermanadop1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rbhermanadop1ItemStateChanged
        if (rbhermanadop1.isSelected()) {
            spinhermanadoptiva.setVisible(true);
            InfoFamiliar.setTpersona23("hay");
        } else {
            spinhermanadoptiva.setVisible(false);
            InfoFamiliar.setTpersona23("nohay");
        }
    }//GEN-LAST:event_rbhermanadop1ItemStateChanged

    private void rbprimos1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rbprimos1ItemStateChanged
        if (rbprimos1.isSelected()) {
            spinprimos.setVisible(true);
            InfoFamiliar.setTpersona38("hay");
        } else {
            spinprimos.setVisible(false);
            InfoFamiliar.setTpersona38("nohay");
        }
    }//GEN-LAST:event_rbprimos1ItemStateChanged

    private void rbprimosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rbprimosItemStateChanged
        if (rbprimos.isSelected()) {
            spinprimas.setVisible(true);
            InfoFamiliar.setTpersona39("hay");
        } else {
            spinprimas.setVisible(false);
            InfoFamiliar.setTpersona39("nohay");
        }
    }//GEN-LAST:event_rbprimosItemStateChanged

    private void rbsobrinosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rbsobrinosItemStateChanged
        if (rbsobrinos.isSelected()) {
            spinsobrinos.setVisible(true);
            InfoFamiliar.setTpersona40("hay");
        } else {
            spinsobrinos.setVisible(false);
            InfoFamiliar.setTpersona40("nohay");
        }
    }//GEN-LAST:event_rbsobrinosItemStateChanged

    private void rbsobrinos1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rbsobrinos1ItemStateChanged
        if (rbsobrinos1.isSelected()) {
            spinsobrinas.setVisible(true);
            InfoFamiliar.setTpersona41("hay");
        } else {
            spinsobrinas.setVisible(false);
            InfoFamiliar.setTpersona41("nohay");
        }
    }//GEN-LAST:event_rbsobrinos1ItemStateChanged

    private void rbnietosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rbnietosItemStateChanged
        if (rbnietos.isSelected()) {
            spinnietos.setVisible(true);
            InfoFamiliar.setTpersona43("hay");
        } else {
            spinnietos.setVisible(false);
            InfoFamiliar.setTpersona43("nohay");
        }
    }//GEN-LAST:event_rbnietosItemStateChanged

    private void rbtutioelvItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rbtutioelvItemStateChanged
        if (rbtutioelv.isSelected()) {
            spintios.setVisible(true);
            InfoFamiliar.setTpersona47("hay");
        } else {
            spintios.setVisible(false);
            InfoFamiliar.setTpersona47("nohay");
        }
    }//GEN-LAST:event_rbtutioelvItemStateChanged

    private void rbtutioelv1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rbtutioelv1ItemStateChanged
        if (rbtutioelv1.isSelected()) {
            spintias.setVisible(true);
            InfoFamiliar.setTpersona48("hay");
        } else {
            spintias.setVisible(false);
            InfoFamiliar.setTpersona48("nohay");
        }
    }//GEN-LAST:event_rbtutioelv1ItemStateChanged

    private void txtfamiliapeCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtfamiliapeCaretUpdate
        InfoFamiliar.setExpli_fami_ries(txtfamiliape.getText());
    }//GEN-LAST:event_txtfamiliapeCaretUpdate

    private void jTextArea2CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextArea2CaretUpdate
        InfoFamiliar.setDijovivir(jTextArea2.getText());
    }//GEN-LAST:event_jTextArea2CaretUpdate

    private void jTextArea3CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextArea3CaretUpdate
        InfoFamiliar.setFamiliares_aparte(jTextArea3.getText());
    }//GEN-LAST:event_jTextArea3CaretUpdate

    private void txtrelacionconCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtrelacionconCaretUpdate
        InfoFamiliar.setNom_pareja(txtrelacioncon.getText());
    }//GEN-LAST:event_txtrelacionconCaretUpdate

    private void rbamigosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbamigosMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_rbamigosMouseClicked

    private void spinamigosPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_spinamigosPropertyChange
        String lk = spinamigos.getValue().toString();
        InfoFamiliar.setCpersona1(lk);
    }//GEN-LAST:event_spinamigosPropertyChange

    private void spinabuelosPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_spinabuelosPropertyChange
        String lk = spinabuelos.getValue().toString();
        InfoFamiliar.setCpersona2(lk);
    }//GEN-LAST:event_spinabuelosPropertyChange

    private void spincunadoPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_spincunadoPropertyChange
        String lk = spincunado.getValue().toString();
        InfoFamiliar.setCpersona3(lk);
    }//GEN-LAST:event_spincunadoPropertyChange

    private void spincunadasPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_spincunadasPropertyChange
        String lk = spincunadas.getValue().toString();
        InfoFamiliar.setCpersona4(lk);
    }//GEN-LAST:event_spincunadasPropertyChange

    private void spincompadresPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_spincompadresPropertyChange
        String lk = spincompadres.getValue().toString();
        InfoFamiliar.setCpersona5(lk);
    }//GEN-LAST:event_spincompadresPropertyChange

    private void spinhijosPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_spinhijosPropertyChange
        String lk = spinhijos.getValue().toString();
        InfoFamiliar.setCpersona6(lk);
    }//GEN-LAST:event_spinhijosPropertyChange

    private void spinhijasPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_spinhijasPropertyChange
        String lk = spinhijas.getValue().toString();
        InfoFamiliar.setCpersona7(lk);
    }//GEN-LAST:event_spinhijasPropertyChange

    private void spinhijastrosPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_spinhijastrosPropertyChange
        String lk = spinhijastros.getValue().toString();
        InfoFamiliar.setCpersona8(lk);
    }//GEN-LAST:event_spinhijastrosPropertyChange

    private void spinhijastrasPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_spinhijastrasPropertyChange
        String lk = spinhijastras.getValue().toString();
        InfoFamiliar.setCpersona9(lk);
    }//GEN-LAST:event_spinhijastrasPropertyChange

    private void spinhermanasPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_spinhermanasPropertyChange
        String lk = spinhermanas.getValue().toString();
        InfoFamiliar.setCpersona10(lk);
    }//GEN-LAST:event_spinhermanasPropertyChange

    private void spinhermanosPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_spinhermanosPropertyChange
        String lk = spinhermanos.getValue().toString();
        InfoFamiliar.setCpersona11(lk);
    }//GEN-LAST:event_spinhermanosPropertyChange

    private void spinhermanastrosPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_spinhermanastrosPropertyChange
        String lk = spinhermanastros.getValue().toString();
        InfoFamiliar.setCpersona12(lk);
    }//GEN-LAST:event_spinhermanastrosPropertyChange

    private void spinhermanastrasPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_spinhermanastrasPropertyChange
        String lk = spinhermanastras.getValue().toString();
        InfoFamiliar.setCpersona13(lk);
    }//GEN-LAST:event_spinhermanastrasPropertyChange

    private void spinhermanadoptivoPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_spinhermanadoptivoPropertyChange
        String lk = spinhermanadoptivo.getValue().toString();
        InfoFamiliar.setCpersona14(lk);
    }//GEN-LAST:event_spinhermanadoptivoPropertyChange

    private void spinprimosPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_spinprimosPropertyChange
        String lk = spinprimos.getValue().toString();
        InfoFamiliar.setCpersona16(lk);
    }//GEN-LAST:event_spinprimosPropertyChange

    private void spinprimasPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_spinprimasPropertyChange
        String lk = spinprimas.getValue().toString();
        InfoFamiliar.setCpersona17(lk);
    }//GEN-LAST:event_spinprimasPropertyChange

    private void spinsobrinosPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_spinsobrinosPropertyChange
        String lk = spinsobrinos.getValue().toString();
        InfoFamiliar.setCpersona18(lk);
    }//GEN-LAST:event_spinsobrinosPropertyChange

    private void spinsobrinasPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_spinsobrinasPropertyChange
        String lk = spinsobrinas.getValue().toString();
        InfoFamiliar.setCpersona19(lk);
    }//GEN-LAST:event_spinsobrinasPropertyChange

    private void spinhermanadoptivaPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_spinhermanadoptivaPropertyChange
        String lk = spinhermanadoptiva.getValue().toString();
        InfoFamiliar.setCpersona15(lk);
    }//GEN-LAST:event_spinhermanadoptivaPropertyChange

    private void spinnietosPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_spinnietosPropertyChange
        String lk = spinnietos.getValue().toString();
        InfoFamiliar.setCpersona20(lk);
    }//GEN-LAST:event_spinnietosPropertyChange

    private void spintiosPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_spintiosPropertyChange
        String lk = spintios.getValue().toString();
        InfoFamiliar.setCpersona21(lk);
    }//GEN-LAST:event_spintiosPropertyChange

    private void spintiasPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_spintiasPropertyChange
        String lk = spintias.getValue().toString();
        InfoFamiliar.setCpersona22(lk);
    }//GEN-LAST:event_spintiasPropertyChange

    private void rbcunadosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rbcunadosItemStateChanged
        if (rbcunados.isSelected()) {
            InfoFamiliar.setTpersona5("hay");
        } else {
            InfoFamiliar.setTpersona5("nohay");
        }
    }//GEN-LAST:event_rbcunadosItemStateChanged

    private void rbcunados2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rbcunados2ItemStateChanged
        if (rbcunados2.isSelected()) {
            InfoFamiliar.setTpersona7("hay");
        } else {
            InfoFamiliar.setTpersona7("nohay");
        }
    }//GEN-LAST:event_rbcunados2ItemStateChanged

    private void rbcunados4ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rbcunados4ItemStateChanged
        if (rbcunados4.isSelected()) {
            InfoFamiliar.setTpersona8("hay");
        } else {
           InfoFamiliar.setTpersona8("nohay");
        }
    }//GEN-LAST:event_rbcunados4ItemStateChanged

    private void rbcunados5ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rbcunados5ItemStateChanged
        if (rbcunados5.isSelected()) {
            InfoFamiliar.setTpersona9("hay");
        } else {
            InfoFamiliar.setTpersona9("nohay");
        }
    }//GEN-LAST:event_rbcunados5ItemStateChanged

    private void rbcunados6ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rbcunados6ItemStateChanged
        if (rbcunados6.isSelected()) {
            InfoFamiliar.setTpersona10("hay");
        } else {
            InfoFamiliar.setTpersona10("nohay");
        }
    }//GEN-LAST:event_rbcunados6ItemStateChanged

    private void rbcunados7ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rbcunados7ItemStateChanged
        if (rbcunados7.isSelected()) {
            InfoFamiliar.setTpersona11("hay");
        } else {
            InfoFamiliar.setTpersona11("hay");
        }
    }//GEN-LAST:event_rbcunados7ItemStateChanged

    private void rbfamicunadoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rbfamicunadoItemStateChanged
        if (rbfamicunado.isSelected()) {
            InfoFamiliar.setTpersona12("hay");
        } else {
            InfoFamiliar.setTpersona12("nohay");
        }
    }//GEN-LAST:event_rbfamicunadoItemStateChanged

    private void rbhijosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rbhijosItemStateChanged
        if (rbhijos.isSelected()) {
            InfoFamiliar.setTpersona13("hay");
        } else {
            InfoFamiliar.setTpersona13("nohay");
        }
    }//GEN-LAST:event_rbhijosItemStateChanged

    private void rbmadrebioItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rbmadrebioItemStateChanged
        if (rbmadrebio.isSelected()) {
            InfoFamiliar.setTpersona24("hay");
        } else {
            InfoFamiliar.setTpersona24("nohay");
        }
    }//GEN-LAST:event_rbmadrebioItemStateChanged

    private void rbmadreadopItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rbmadreadopItemStateChanged
        if (rbmadreadop.isSelected()) {
            InfoFamiliar.setTpersona25("hay");
        } else {
            InfoFamiliar.setTpersona25("nohay");
        }
    }//GEN-LAST:event_rbmadreadopItemStateChanged

    private void rbmadreadop1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rbmadreadop1ItemStateChanged
        if (rbmadreadop1.isSelected()) {
            InfoFamiliar.setTpersona26("hay");
        } else {
            InfoFamiliar.setTpersona26("nohay");
        }
    }//GEN-LAST:event_rbmadreadop1ItemStateChanged

    private void rbsoloItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rbsoloItemStateChanged
        if (rbsolo.isSelected()) {
            InfoFamiliar.setTpersona27("hay");
        } else {
            InfoFamiliar.setTpersona27("nohay");        }
    }//GEN-LAST:event_rbsoloItemStateChanged

    private void rbnueraItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rbnueraItemStateChanged
        if (rbnuera.isSelected()) {
            InfoFamiliar.setTpersona28("hay");
        } else {
            InfoFamiliar.setTpersona28("nohay");
        }
    }//GEN-LAST:event_rbnueraItemStateChanged

    private void rbpadrebioItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rbpadrebioItemStateChanged
        if (rbpadrebio.isSelected()) {
            InfoFamiliar.setTpersona29("hay");
        } else {
            InfoFamiliar.setTpersona29("nohay");
        }
    }//GEN-LAST:event_rbpadrebioItemStateChanged

    private void rbpadreadopItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rbpadreadopItemStateChanged
        if (rbpadreadop.isSelected()) {
            InfoFamiliar.setTpersona30("hay");
        } else {
            InfoFamiliar.setTpersona30("nohay");
        }
    }//GEN-LAST:event_rbpadreadopItemStateChanged

    private void rbpadreadop1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rbpadreadop1ItemStateChanged
        if (rbpadreadop1.isSelected()) {
            InfoFamiliar.setTpersona31("hay");
        } else {
            InfoFamiliar.setTpersona31("nohay");
        }
    }//GEN-LAST:event_rbpadreadop1ItemStateChanged

    private void rbpadresbioItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rbpadresbioItemStateChanged
        if (rbpadresbio.isSelected()) {
            InfoFamiliar.setTpersona32("hay");
        } else {
            InfoFamiliar.setTpersona32("nohay");
        }
    }//GEN-LAST:event_rbpadresbioItemStateChanged

    private void rbpadresadopItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rbpadresadopItemStateChanged
        if (rbpadresadop.isSelected()) {
            InfoFamiliar.setTpersona33("hay");
        } else {
            InfoFamiliar.setTpersona33("nohay");
        }
    }//GEN-LAST:event_rbpadresadopItemStateChanged

    private void rbpadrastrosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rbpadrastrosItemStateChanged
        if (rbpadrastros.isSelected()) {
            InfoFamiliar.setTpersona34("hay");
        } else {
            InfoFamiliar.setTpersona34("nohay");
        }
    }//GEN-LAST:event_rbpadrastrosItemStateChanged

    private void rbparemujerItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rbparemujerItemStateChanged
        if (rbparemujer.isSelected()) {
            InfoFamiliar.setTpersona35("hay");
        } else {
            InfoFamiliar.setTpersona35("nohay");
        }
    }//GEN-LAST:event_rbparemujerItemStateChanged

    private void rbparehombreItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rbparehombreItemStateChanged
        if (rbparehombre.isSelected()) {
            InfoFamiliar.setTpersona36("hay");
        } else {
            InfoFamiliar.setTpersona36("nohay");
        }
    }//GEN-LAST:event_rbparehombreItemStateChanged

    private void rbprimos2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rbprimos2ItemStateChanged
        if (rbprimos2.isSelected()) {
            InfoFamiliar.setTpersona37("hay");
        } else {
            InfoFamiliar.setTpersona37("nohay");
        }
    }//GEN-LAST:event_rbprimos2ItemStateChanged

    private void rbsobrinos2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rbsobrinos2ItemStateChanged
        if (rbsobrinos2.isSelected()) {
            InfoFamiliar.setTpersona42("hay");
        } else {
            InfoFamiliar.setTpersona42("nohay");
        }
    }//GEN-LAST:event_rbsobrinos2ItemStateChanged

    private void rbsuegrosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rbsuegrosItemStateChanged
        if (rbsuegros.isSelected()) {
            InfoFamiliar.setTpersona44("hay");
        } else {
            InfoFamiliar.setTpersona44("nohay");
        }
    }//GEN-LAST:event_rbsuegrosItemStateChanged

    private void rbsuegros1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rbsuegros1ItemStateChanged
        if (rbsuegros1.isSelected()) {
            InfoFamiliar.setTpersona45("hay");
        } else {
            InfoFamiliar.setTpersona45("nohay");
        }
    }//GEN-LAST:event_rbsuegros1ItemStateChanged

    private void rbsuegros2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rbsuegros2ItemStateChanged
        if (rbsuegros2.isSelected()) {
            InfoFamiliar.setTpersona46("hay");
        } else {
            InfoFamiliar.setTpersona46("nohay");
        }
    }//GEN-LAST:event_rbsuegros2ItemStateChanged

    private void rbyernoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rbyernoItemStateChanged
        if (rbyerno.isSelected()) {
            InfoFamiliar.setTpersona49("hay");
        } else {
            InfoFamiliar.setTpersona49("nohay");
        }
    }//GEN-LAST:event_rbyernoItemStateChanged

    private void txtfamiliape1CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtfamiliape1CaretUpdate
        InfoFamiliar.setAdmisionInfoFamiliar(txtfamiliape1.getText());
    }//GEN-LAST:event_txtfamiliape1CaretUpdate

    private void jCheckBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox1ItemStateChanged
        if (jCheckBox1.isSelected()) {
            jCheckBox2.setSelected(false);
            txtfamiliape1.setVisible(true);
            jLabel32.setVisible(true);
            Admisiones.setAdmInfoFami4("hay");
        } else if (!jCheckBox1.isSelected()) {
            txtfamiliape1.setVisible(false);
            jLabel32.setVisible(false);
            Admisiones.setAdmInfoFami4("nohay");
        }
    }//GEN-LAST:event_jCheckBox1ItemStateChanged

    private void jCheckBox2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox2ItemStateChanged
        if (jCheckBox2.isSelected()) {
            jCheckBox1.setSelected(false);
            txtfamiliape1.setVisible(false);
            jLabel32.setVisible(false);
        }
    }//GEN-LAST:event_jCheckBox2ItemStateChanged

    private void jCheckBox3ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox3ItemStateChanged
        if (jCheckBox3.isSelected()) {
            jCheckBox4.setSelected(false);
            InfoFamiliar.setFami_ries_soci("Sí");
            txtfamiliape.setVisible(true);
            jLabel31.setVisible(true);
            Admisiones.setAdmInfoFami3("hay");
        } else {
            InfoFamiliar.setFami_ries_soci("-");
            txtfamiliape.setVisible(false);
            jLabel31.setVisible(false);
            Admisiones.setAdmInfoFami3("nohay");
        }
    }//GEN-LAST:event_jCheckBox3ItemStateChanged

    private void jCheckBox4ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox4ItemStateChanged
        if (jCheckBox4.isSelected()) {
            InfoFamiliar.setFami_ries_soci("No");
            jCheckBox3.setSelected(false);
            txtfamiliape.setVisible(false);
            jLabel31.setVisible(false);
            Admisiones.setAdmInfoFami3("nohay");
        } else {
            InfoFamiliar.setFami_ries_soci("-");
            txtfamiliape.setVisible(false);
            jLabel31.setVisible(false);
            Admisiones.setAdmInfoFami3("nohay");
        }
    }//GEN-LAST:event_jCheckBox4ItemStateChanged

    private void jCheckBox6ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox6ItemStateChanged
        if (jCheckBox6.isSelected()) {
            jCheckBox7.setSelected(false);
            jCheckBox8.setSelected(false);
            jCheckBox9.setSelected(false);
            jCheckBox10.setSelected(false);
            jCheckBox11.setSelected(false);
            InfoFamiliar.setEstado_civil("soltero");
        } else {
            InfoFamiliar.setEstado_civil("-");
        }
    }//GEN-LAST:event_jCheckBox6ItemStateChanged

    private void jCheckBox7ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox7ItemStateChanged
        if (jCheckBox7.isSelected()) {
            jCheckBox6.setSelected(false);
            jCheckBox8.setSelected(false);
            jCheckBox9.setSelected(false);
            jCheckBox10.setSelected(false);
            jCheckBox11.setSelected(false);
            InfoFamiliar.setEstado_civil("casado");
        } else {
            InfoFamiliar.setEstado_civil("-");
        }
    }//GEN-LAST:event_jCheckBox7ItemStateChanged

    private void jCheckBox8ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox8ItemStateChanged
        if (jCheckBox8.isSelected()) {
            jCheckBox7.setSelected(false);
            jCheckBox6.setSelected(false);
            jCheckBox9.setSelected(false);
            jCheckBox10.setSelected(false);
            jCheckBox11.setSelected(false);
            InfoFamiliar.setEstado_civil("divorciado");
        } else {
            InfoFamiliar.setEstado_civil("-");
        }
    }//GEN-LAST:event_jCheckBox8ItemStateChanged

    private void jCheckBox9ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox9ItemStateChanged
        if (jCheckBox9.isSelected()) {
            jCheckBox7.setSelected(false);
            jCheckBox8.setSelected(false);
            jCheckBox6.setSelected(false);
            jCheckBox10.setSelected(false);
            jCheckBox11.setSelected(false);
            InfoFamiliar.setEstado_civil("viudo");
        } else {
            InfoFamiliar.setEstado_civil("-");
        }
    }//GEN-LAST:event_jCheckBox9ItemStateChanged

    private void jCheckBox10ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox10ItemStateChanged
        if (jCheckBox10.isSelected()) {
            jCheckBox7.setSelected(false);
            jCheckBox8.setSelected(false);
            jCheckBox9.setSelected(false);
            jCheckBox6.setSelected(false);
            jCheckBox11.setSelected(false);
            InfoFamiliar.setEstado_civil("unión libre");
        } else {
            InfoFamiliar.setEstado_civil("-");
        }
    }//GEN-LAST:event_jCheckBox10ItemStateChanged

    private void jCheckBox11ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox11ItemStateChanged
        if (jCheckBox11.isSelected()) {
            jCheckBox7.setSelected(false);
            jCheckBox8.setSelected(false);
            jCheckBox9.setSelected(false);
            jCheckBox10.setSelected(false);
            jCheckBox6.setSelected(false);
            InfoFamiliar.setEstado_civil("unión marital");
        } else {
           InfoFamiliar.setEstado_civil("-");
        }
    }//GEN-LAST:event_jCheckBox11ItemStateChanged

    private void jTextArea2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextArea2KeyTyped
        int k = (int) evt.getKeyChar();
        if (k == 39) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "¡No se acepta ese tipo de carácter!", "Error de datos ingresados", JOptionPane.ERROR_MESSAGE, iconThinking_uh);
        }
        InputMap map = jTextArea2.getInputMap(JTextField.WHEN_FOCUSED);
//        map.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, CTRL_MASK), "null");
    }//GEN-LAST:event_jTextArea2KeyTyped

    private void jTextArea3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextArea3KeyTyped
        int k = (int) evt.getKeyChar();
        if (k == 39) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "¡No se acepta ese tipo de carácter!", "Error de datos ingresados", JOptionPane.ERROR_MESSAGE, iconThinking_uh);
        }
        InputMap map = jTextArea3.getInputMap(JTextField.WHEN_FOCUSED);
//        map.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, CTRL_MASK), "null");
    }//GEN-LAST:event_jTextArea3KeyTyped

    private void txtrelacionconKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtrelacionconKeyTyped
        int k = (int) evt.getKeyChar();
        if (k == 39) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "¡No se acepta ese tipo de carácter!", "Error de datos ingresados", JOptionPane.ERROR_MESSAGE, iconThinking_uh);
        }
        InputMap map = txtrelacioncon.getInputMap(JTextField.WHEN_FOCUSED);
//        map.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, CTRL_MASK), "null");
    }//GEN-LAST:event_txtrelacionconKeyTyped

    private void txtfamiliapeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtfamiliapeKeyTyped
        int k = (int) evt.getKeyChar();
        if (k == 39) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "¡No se acepta ese tipo de carácter!", "Error de datos ingresados", JOptionPane.ERROR_MESSAGE, iconThinking_uh);
        }
        InputMap map = txtfamiliape.getInputMap(JTextField.WHEN_FOCUSED);
//        map.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, CTRL_MASK), "null");
    }//GEN-LAST:event_txtfamiliapeKeyTyped

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
        if (jRadioButton1.isSelected()){
            Admisiones.setAdmInfoFami1("hay");
        } else {
            Admisiones.setAdmInfoFami1("nohay");
        }
    }//GEN-LAST:event_jRadioButton1ItemStateChanged

    private void txtfamiliape1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfamiliape1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfamiliape1ActionPerformed

    private void jRadioButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton2MouseClicked
        
    }//GEN-LAST:event_jRadioButton2MouseClicked

    private void jRadioButton2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton2ItemStateChanged
        if (jRadioButton2.isSelected()){
            Admisiones.setAdmInfoFami2("hay");
        } else {
            Admisiones.setAdmInfoFami2("nohay");
        }
    }//GEN-LAST:event_jRadioButton2ItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox10;
    private javax.swing.JCheckBox jCheckBox11;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JCheckBox jCheckBox7;
    private javax.swing.JCheckBox jCheckBox8;
    private javax.swing.JCheckBox jCheckBox9;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    public static javax.swing.JLabel jLabel44;
    public static javax.swing.JLabel jLabel45;
    public static javax.swing.JLabel jLabel53;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JRadioButton rbabuelos;
    private javax.swing.JRadioButton rbamigos;
    private javax.swing.JRadioButton rbcunados;
    private javax.swing.JRadioButton rbcunados1;
    private javax.swing.JRadioButton rbcunados2;
    private javax.swing.JRadioButton rbcunados3;
    private javax.swing.JRadioButton rbcunados4;
    private javax.swing.JRadioButton rbcunados5;
    private javax.swing.JRadioButton rbcunados6;
    private javax.swing.JRadioButton rbcunados7;
    private javax.swing.JRadioButton rbcunados8;
    private javax.swing.JRadioButton rbfamicunado;
    private javax.swing.JRadioButton rbhermanadop;
    private javax.swing.JRadioButton rbhermanadop1;
    private javax.swing.JRadioButton rbhermanastros;
    private javax.swing.JRadioButton rbhermanastros1;
    private javax.swing.JRadioButton rbhermanos;
    private javax.swing.JRadioButton rbhermanos1;
    private javax.swing.JRadioButton rbhijastros;
    private javax.swing.JRadioButton rbhijastros1;
    private javax.swing.JRadioButton rbhijos;
    private javax.swing.JRadioButton rbhijos1;
    private javax.swing.JRadioButton rbhijos2;
    private javax.swing.JRadioButton rbmadreadop;
    private javax.swing.JRadioButton rbmadreadop1;
    private javax.swing.JRadioButton rbmadrebio;
    private javax.swing.JRadioButton rbnietos;
    private javax.swing.JRadioButton rbnuera;
    private javax.swing.JRadioButton rbpadrastros;
    private javax.swing.JRadioButton rbpadreadop;
    private javax.swing.JRadioButton rbpadreadop1;
    private javax.swing.JRadioButton rbpadrebio;
    private javax.swing.JRadioButton rbpadresadop;
    private javax.swing.JRadioButton rbpadresbio;
    private javax.swing.JRadioButton rbparehombre;
    private javax.swing.JRadioButton rbparemujer;
    private javax.swing.JRadioButton rbprimos;
    private javax.swing.JRadioButton rbprimos1;
    private javax.swing.JRadioButton rbprimos2;
    private javax.swing.JRadioButton rbsobrinos;
    private javax.swing.JRadioButton rbsobrinos1;
    private javax.swing.JRadioButton rbsobrinos2;
    private javax.swing.JRadioButton rbsolo;
    private javax.swing.JRadioButton rbsuegros;
    private javax.swing.JRadioButton rbsuegros1;
    private javax.swing.JRadioButton rbsuegros2;
    private javax.swing.JRadioButton rbtutioelv;
    private javax.swing.JRadioButton rbtutioelv1;
    private javax.swing.JRadioButton rbyerno;
    public static javax.swing.JLabel relacioncon;
    private javax.swing.JSpinner spinabuelos;
    private javax.swing.JSpinner spinamigos;
    private javax.swing.JSpinner spincompadres;
    private javax.swing.JSpinner spincunadas;
    private javax.swing.JSpinner spincunado;
    private javax.swing.JSpinner spinhermanadoptiva;
    private javax.swing.JSpinner spinhermanadoptivo;
    private javax.swing.JSpinner spinhermanas;
    private javax.swing.JSpinner spinhermanastras;
    private javax.swing.JSpinner spinhermanastros;
    private javax.swing.JSpinner spinhermanos;
    private javax.swing.JSpinner spinhijas;
    private javax.swing.JSpinner spinhijastras;
    private javax.swing.JSpinner spinhijastros;
    private javax.swing.JSpinner spinhijos;
    private javax.swing.JSpinner spinnietos;
    private javax.swing.JSpinner spinprimas;
    private javax.swing.JSpinner spinprimos;
    private javax.swing.JSpinner spinsobrinas;
    private javax.swing.JSpinner spinsobrinos;
    private javax.swing.JSpinner spintias;
    private javax.swing.JSpinner spintios;
    private javax.swing.JTextField txtfamiliape;
    private javax.swing.JTextField txtfamiliape1;
    private javax.swing.JTextField txtrelacioncon;
    // End of variables declaration//GEN-END:variables
}
