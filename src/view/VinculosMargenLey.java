package view;

import classes.Admisiones;
import classes.DatosPrincipales;
import classes.VinculosPersonas;
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
public class VinculosMargenLey extends javax.swing.JInternalFrame {

    public VinculosMargenLey() {
        ((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI()).setNorthPane(null);
        initComponents();
        noseeingreso();
        //validaingreso();
        jScrollPane6.getVerticalScrollBar().setUnitIncrement(15);
        guiasvinculos();
    }

    public void validaingreso() {
        if (DatosPrincipales.getTipoExamen().equals("Ingreso")) {
            noseeingreso();
        }
    }

    public void guiasvinculos() {
        CorrectorOrtografia p = new CorrectorOrtografia("Comentó que...", txtexplivinculosper);
        CorrectorOrtografia p5 = new CorrectorOrtografia("Manifestó que...", txtactpermal1);
        CorrectorOrtografia p1 = new CorrectorOrtografia("Dijo que...", txtactpermal);
        CorrectorOrtografia p2 = new CorrectorOrtografia("Contó haber estado comprometido en actividades ilícitas...", txtcompacti);
        CorrectorOrtografia p3 = new CorrectorOrtografia("Expresó haber recibido propuestas para realizar actividades ilícitas...", txtprodelict);
        CorrectorOrtografia p4 = new CorrectorOrtografia("Refirió haber participado en actividades ilícitas...", txtpartici);
        CorrectorOrtografia p6 = new CorrectorOrtografia("Aclaró...", txtpartici1);
        CorrectorOrtografia p7 = new CorrectorOrtografia("Afirmó...", txtpartici2);

        SpellChecker.register(txtexplivinculosper);
        SpellChecker.register(txtactpermal);
        SpellChecker.register(txtcompacti);
        SpellChecker.register(txtprodelict);
        SpellChecker.register(txtpartici);
    }

    public void noseeingreso() {
        jPanel1.setVisible(false);
        
        jRadioButton6.setVisible(false);
        jRadioButton2.setVisible(false);
        jRadioButton3.setVisible(false);
        jRadioButton4.setVisible(false);
        jRadioButton5.setVisible(false);
        jRadioButton9.setVisible(false);
        jRadioButton8.setVisible(false);
        txtactpermal1.setVisible(false);
        jLabel38.setVisible(false);
        txtpartici1.setVisible(false);
        jLabel39.setVisible(false);
        txtpartici2.setVisible(false);
        jLabel40.setVisible(false);
        txtpartici3.setVisible(false);
        jLabel41.setVisible(false);

        txtpartici.setVisible(false);
        jLabel32.setVisible(false);
        jLabel33.setVisible(false);
        jLabel34.setVisible(false);
        jLabel35.setVisible(false);

        chbxladrones.setEnabled(false);
        chbxraponeros.setEnabled(false);
        chbxfleteros.setEnabled(false);
        chbxapartmenteros.setEnabled(false);
        chbxbodegueros.setEnabled(false);
        chbxestafadores.setEnabled(false);
        chbxsuplantador.setEnabled(false);
        chbxescopolamineros.setEnabled(false);
        chbxestafastel.setEnabled(false);
        chbxasesinos.setEnabled(false);
        chbxvioladores.setEnabled(false);
        chbxextorcio.setEnabled(false);
        chbxsecuestradores.setEnabled(false);
        chbxnarcotrafi.setEnabled(false);
        chbxmicrotrafic.setEnabled(false);
        chbxguerrille.setEnabled(false);
        chbxbandascri.setEnabled(false);
        chbxparamili.setEnabled(false);
        chbxcorruptos.setEnabled(false);
        chbxclonadorestar.setEnabled(false);
        chbxciberdelincuentes.setEnabled(false);
        chbxfraudestarcre.setEnabled(false);
        chbxcomprabd.setEnabled(false);
        chbxsuplantacionid.setEnabled(false);
        chbxfraudetiquetes.setEnabled(false);
        chbxescaperos.setEnabled(false);
        chbxhackers.setEnabled(false);
        chbxpiratas.setEnabled(false);
        chbxfraudesbanc.setEnabled(false);
        txtexplivinculosper.setVisible(false);
        txtexplivinculosper.setVisible(false);
        txtexplivinculosper.show(false);

        txtprodelict.setVisible(false);
        txtactpermal.setVisible(false);
        txtcompacti.setVisible(false);
        
        jLabel136.setVisible(false);
        jCheckBox37.setVisible(false);
        jCheckBox38.setVisible(false);
    }

    public void limpiar() {
        chbxladrones.setSelected(false);
        chbxraponeros.setSelected(false);
        chbxfleteros.setSelected(false);
        chbxapartmenteros.setSelected(false);
        chbxbodegueros.setSelected(false);
        chbxestafadores.setSelected(false);
        chbxsuplantador.setSelected(false);
        chbxescopolamineros.setSelected(false);
        chbxestafastel.setSelected(false);
        chbxasesinos.setSelected(false);
        chbxvioladores.setSelected(false);
        chbxextorcio.setSelected(false);
        chbxsecuestradores.setSelected(false);
        chbxnarcotrafi.setSelected(false);
        chbxmicrotrafic.setSelected(false);
        chbxguerrille.setSelected(false);
        chbxbandascri.setSelected(false);
        chbxparamili.setSelected(false);
        chbxcorruptos.setSelected(false);
        chbxclonadorestar.setSelected(false);
        chbxciberdelincuentes.setSelected(false);
        chbxfraudestarcre.setSelected(false);
        chbxcomprabd.setSelected(false);
        chbxsuplantacionid.setSelected(false);
        chbxfraudetiquetes.setSelected(false);
        chbxescaperos.setSelected(false);
        chbxhackers.setSelected(false);
        chbxpiratas.setSelected(false);
        chbxfraudesbanc.setSelected(false);
        
        jCheckBox47.setSelected(false);
        jCheckBox29.setSelected(false);
        jCheckBox31.setSelected(false);
        jCheckBox32.setSelected(false);
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
        
        jRadioButton2.setSelected(false);
        jRadioButton3.setSelected(false);
        jRadioButton4.setSelected(false);
        jRadioButton5.setSelected(false);
        jRadioButton6.setSelected(false);
        jRadioButton9.setSelected(false);
        jRadioButton8.setSelected(false);

        txtexplivinculosper.setText("");
        txtactpermal1.setText("");
        txtactpermal.setText("");
        txtcompacti.setText("");
        txtprodelict.setText("");
        txtpartici.setText("");
        txtpartici1.setText("");
        txtpartici2.setText("");
        txtpartici3.setText("");
        
        jScrollPane12.getVerticalScrollBar().setValue(0);
        jScrollPane6.getVerticalScrollBar().setValue(0);
    }

    Thinking_uh iconThinking_uh = new Thinking_uh();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane6 = new javax.swing.JScrollPane();
        jPanel8 = new javax.swing.JPanel();
        jLabel134 = new javax.swing.JLabel();
        chbxladrones = new javax.swing.JCheckBox();
        chbxvioladores = new javax.swing.JCheckBox();
        chbxciberdelincuentes = new javax.swing.JCheckBox();
        chbxraponeros = new javax.swing.JCheckBox();
        chbxasesinos = new javax.swing.JCheckBox();
        chbxmicrotrafic = new javax.swing.JCheckBox();
        chbxsuplantador = new javax.swing.JCheckBox();
        chbxextorcio = new javax.swing.JCheckBox();
        chbxfraudestarcre = new javax.swing.JCheckBox();
        chbxguerrille = new javax.swing.JCheckBox();
        chbxfleteros = new javax.swing.JCheckBox();
        chbxsecuestradores = new javax.swing.JCheckBox();
        chbxclonadorestar = new javax.swing.JCheckBox();
        chbxparamili = new javax.swing.JCheckBox();
        chbxbandascri = new javax.swing.JCheckBox();
        chbxbodegueros = new javax.swing.JCheckBox();
        chbxsuplantacionid = new javax.swing.JCheckBox();
        chbxcomprabd = new javax.swing.JCheckBox();
        chbxcorruptos = new javax.swing.JCheckBox();
        chbxapartmenteros = new javax.swing.JCheckBox();
        chbxestafadores = new javax.swing.JCheckBox();
        chbxescopolamineros = new javax.swing.JCheckBox();
        chbxnarcotrafi = new javax.swing.JCheckBox();
        chbxfraudetiquetes = new javax.swing.JCheckBox();
        chbxescaperos = new javax.swing.JCheckBox();
        chbxhackers = new javax.swing.JCheckBox();
        chbxpiratas = new javax.swing.JCheckBox();
        chbxfraudesbanc = new javax.swing.JCheckBox();
        chbxestafastel = new javax.swing.JCheckBox();
        jLabel135 = new javax.swing.JLabel();
        txtcompacti = new javax.swing.JTextField();
        jLabel137 = new javax.swing.JLabel();
        txtprodelict = new javax.swing.JTextField();
        jScrollPane12 = new javax.swing.JScrollPane();
        txtexplivinculosper = new javax.swing.JTextArea();
        jLabel140 = new javax.swing.JLabel();
        txtpartici = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jCheckBox29 = new javax.swing.JCheckBox();
        jCheckBox31 = new javax.swing.JCheckBox();
        jCheckBox32 = new javax.swing.JCheckBox();
        jCheckBox33 = new javax.swing.JCheckBox();
        jCheckBox34 = new javax.swing.JCheckBox();
        jCheckBox35 = new javax.swing.JCheckBox();
        jCheckBox36 = new javax.swing.JCheckBox();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jLabel38 = new javax.swing.JLabel();
        txtactpermal1 = new javax.swing.JTextField();
        jLabel141 = new javax.swing.JLabel();
        jCheckBox39 = new javax.swing.JCheckBox();
        jCheckBox40 = new javax.swing.JCheckBox();
        jRadioButton6 = new javax.swing.JRadioButton();
        jLabel39 = new javax.swing.JLabel();
        txtpartici1 = new javax.swing.JTextField();
        jLabel142 = new javax.swing.JLabel();
        jCheckBox41 = new javax.swing.JCheckBox();
        jCheckBox42 = new javax.swing.JCheckBox();
        jLabel40 = new javax.swing.JLabel();
        txtpartici2 = new javax.swing.JTextField();
        jLabel143 = new javax.swing.JLabel();
        jCheckBox43 = new javax.swing.JCheckBox();
        jCheckBox44 = new javax.swing.JCheckBox();
        jRadioButton8 = new javax.swing.JRadioButton();
        jLabel41 = new javax.swing.JLabel();
        txtpartici3 = new javax.swing.JTextField();
        jLabel144 = new javax.swing.JLabel();
        jCheckBox45 = new javax.swing.JCheckBox();
        jCheckBox46 = new javax.swing.JCheckBox();
        jRadioButton9 = new javax.swing.JRadioButton();
        jCheckBox47 = new javax.swing.JCheckBox();
        jPanel1 = new javax.swing.JPanel();
        jLabel136 = new javax.swing.JLabel();
        txtactpermal = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        jCheckBox38 = new javax.swing.JCheckBox();
        jCheckBox37 = new javax.swing.JCheckBox();
        jRadioButton2 = new javax.swing.JRadioButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(null);
        setPreferredSize(new java.awt.Dimension(975, 550));

        jScrollPane6.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane6.setBorder(null);
        jScrollPane6.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));

        jLabel134.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel134.setText("¿Ha estado usted involucrado con alguna de esas actividades ilícitas?");

        chbxladrones.setBackground(new java.awt.Color(255, 255, 255));
        chbxladrones.setFont(new java.awt.Font("Segoe UI Emoji", 0, 13)); // NOI18N
        chbxladrones.setText("Ladrones");
        chbxladrones.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chbxladronesItemStateChanged(evt);
            }
        });

        chbxvioladores.setBackground(new java.awt.Color(255, 255, 255));
        chbxvioladores.setFont(new java.awt.Font("Segoe UI Emoji", 0, 13)); // NOI18N
        chbxvioladores.setText("Violadores");
        chbxvioladores.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chbxvioladoresItemStateChanged(evt);
            }
        });

        chbxciberdelincuentes.setBackground(new java.awt.Color(255, 255, 255));
        chbxciberdelincuentes.setFont(new java.awt.Font("Segoe UI Emoji", 0, 13)); // NOI18N
        chbxciberdelincuentes.setText("Ciberdelincuentes");
        chbxciberdelincuentes.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chbxciberdelincuentesItemStateChanged(evt);
            }
        });

        chbxraponeros.setBackground(new java.awt.Color(255, 255, 255));
        chbxraponeros.setFont(new java.awt.Font("Segoe UI Emoji", 0, 13)); // NOI18N
        chbxraponeros.setText("Raponeros");
        chbxraponeros.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chbxraponerosItemStateChanged(evt);
            }
        });

        chbxasesinos.setBackground(new java.awt.Color(255, 255, 255));
        chbxasesinos.setFont(new java.awt.Font("Segoe UI Emoji", 0, 13)); // NOI18N
        chbxasesinos.setText("Asesinos/sicarios");
        chbxasesinos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chbxasesinosItemStateChanged(evt);
            }
        });

        chbxmicrotrafic.setBackground(new java.awt.Color(255, 255, 255));
        chbxmicrotrafic.setFont(new java.awt.Font("Segoe UI Emoji", 0, 13)); // NOI18N
        chbxmicrotrafic.setText("Microtraficantes");
        chbxmicrotrafic.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chbxmicrotraficItemStateChanged(evt);
            }
        });

        chbxsuplantador.setBackground(new java.awt.Color(255, 255, 255));
        chbxsuplantador.setFont(new java.awt.Font("Segoe UI Emoji", 0, 13)); // NOI18N
        chbxsuplantador.setText("Suplantadores");
        chbxsuplantador.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chbxsuplantadorItemStateChanged(evt);
            }
        });

        chbxextorcio.setBackground(new java.awt.Color(255, 255, 255));
        chbxextorcio.setFont(new java.awt.Font("Segoe UI Emoji", 0, 13)); // NOI18N
        chbxextorcio.setText("Extorsionistas");
        chbxextorcio.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chbxextorcioItemStateChanged(evt);
            }
        });

        chbxfraudestarcre.setBackground(new java.awt.Color(255, 255, 255));
        chbxfraudestarcre.setFont(new java.awt.Font("Segoe UI Emoji", 0, 13)); // NOI18N
        chbxfraudestarcre.setText("Fraudes con tarjetas de crédito");
        chbxfraudestarcre.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chbxfraudestarcreItemStateChanged(evt);
            }
        });

        chbxguerrille.setBackground(new java.awt.Color(255, 255, 255));
        chbxguerrille.setFont(new java.awt.Font("Segoe UI Emoji", 0, 13)); // NOI18N
        chbxguerrille.setText("Guerrilleros");
        chbxguerrille.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chbxguerrilleItemStateChanged(evt);
            }
        });

        chbxfleteros.setBackground(new java.awt.Color(255, 255, 255));
        chbxfleteros.setFont(new java.awt.Font("Segoe UI Emoji", 0, 13)); // NOI18N
        chbxfleteros.setText("Fleteros");
        chbxfleteros.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chbxfleterosItemStateChanged(evt);
            }
        });

        chbxsecuestradores.setBackground(new java.awt.Color(255, 255, 255));
        chbxsecuestradores.setFont(new java.awt.Font("Segoe UI Emoji", 0, 13)); // NOI18N
        chbxsecuestradores.setText("Secuestradores");
        chbxsecuestradores.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chbxsecuestradoresItemStateChanged(evt);
            }
        });

        chbxclonadorestar.setBackground(new java.awt.Color(255, 255, 255));
        chbxclonadorestar.setFont(new java.awt.Font("Segoe UI Emoji", 0, 13)); // NOI18N
        chbxclonadorestar.setText("Clonadores de tarjetas");
        chbxclonadorestar.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chbxclonadorestarItemStateChanged(evt);
            }
        });

        chbxparamili.setBackground(new java.awt.Color(255, 255, 255));
        chbxparamili.setFont(new java.awt.Font("Segoe UI Emoji", 0, 13)); // NOI18N
        chbxparamili.setText("Paramilitares");
        chbxparamili.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chbxparamiliItemStateChanged(evt);
            }
        });

        chbxbandascri.setBackground(new java.awt.Color(255, 255, 255));
        chbxbandascri.setFont(new java.awt.Font("Segoe UI Emoji", 0, 13)); // NOI18N
        chbxbandascri.setText("Bandas criminales");
        chbxbandascri.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chbxbandascriItemStateChanged(evt);
            }
        });

        chbxbodegueros.setBackground(new java.awt.Color(255, 255, 255));
        chbxbodegueros.setFont(new java.awt.Font("Segoe UI Emoji", 0, 13)); // NOI18N
        chbxbodegueros.setText("Bodegueros");
        chbxbodegueros.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chbxbodeguerosItemStateChanged(evt);
            }
        });

        chbxsuplantacionid.setBackground(new java.awt.Color(255, 255, 255));
        chbxsuplantacionid.setFont(new java.awt.Font("Segoe UI Emoji", 0, 13)); // NOI18N
        chbxsuplantacionid.setText("Suplantación de identidades");
        chbxsuplantacionid.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chbxsuplantacionidItemStateChanged(evt);
            }
        });

        chbxcomprabd.setBackground(new java.awt.Color(255, 255, 255));
        chbxcomprabd.setFont(new java.awt.Font("Segoe UI Emoji", 0, 13)); // NOI18N
        chbxcomprabd.setText("Compra de bases de datos");
        chbxcomprabd.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chbxcomprabdItemStateChanged(evt);
            }
        });

        chbxcorruptos.setBackground(new java.awt.Color(255, 255, 255));
        chbxcorruptos.setFont(new java.awt.Font("Segoe UI Emoji", 0, 13)); // NOI18N
        chbxcorruptos.setText("Corruptos");
        chbxcorruptos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chbxcorruptosItemStateChanged(evt);
            }
        });

        chbxapartmenteros.setBackground(new java.awt.Color(255, 255, 255));
        chbxapartmenteros.setFont(new java.awt.Font("Segoe UI Emoji", 0, 13)); // NOI18N
        chbxapartmenteros.setText("Apartamenteros");
        chbxapartmenteros.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chbxapartmenterosItemStateChanged(evt);
            }
        });

        chbxestafadores.setBackground(new java.awt.Color(255, 255, 255));
        chbxestafadores.setFont(new java.awt.Font("Segoe UI Emoji", 0, 13)); // NOI18N
        chbxestafadores.setText("Estafadores");
        chbxestafadores.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chbxestafadoresItemStateChanged(evt);
            }
        });

        chbxescopolamineros.setBackground(new java.awt.Color(255, 255, 255));
        chbxescopolamineros.setFont(new java.awt.Font("Segoe UI Emoji", 0, 13)); // NOI18N
        chbxescopolamineros.setText("Personas que realizan actividades con escopolamina o burundanga");
        chbxescopolamineros.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chbxescopolaminerosItemStateChanged(evt);
            }
        });

        chbxnarcotrafi.setBackground(new java.awt.Color(255, 255, 255));
        chbxnarcotrafi.setFont(new java.awt.Font("Segoe UI Emoji", 0, 13)); // NOI18N
        chbxnarcotrafi.setText("Narcotraficantes");
        chbxnarcotrafi.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chbxnarcotrafiItemStateChanged(evt);
            }
        });

        chbxfraudetiquetes.setBackground(new java.awt.Color(255, 255, 255));
        chbxfraudetiquetes.setFont(new java.awt.Font("Segoe UI Emoji", 0, 13)); // NOI18N
        chbxfraudetiquetes.setText("Fraude con tiquetes o millas");
        chbxfraudetiquetes.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chbxfraudetiquetesItemStateChanged(evt);
            }
        });

        chbxescaperos.setBackground(new java.awt.Color(255, 255, 255));
        chbxescaperos.setFont(new java.awt.Font("Segoe UI Emoji", 0, 13)); // NOI18N
        chbxescaperos.setText("Escaperos");
        chbxescaperos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chbxescaperosItemStateChanged(evt);
            }
        });

        chbxhackers.setBackground(new java.awt.Color(255, 255, 255));
        chbxhackers.setFont(new java.awt.Font("Segoe UI Emoji", 0, 13)); // NOI18N
        chbxhackers.setText("Hackers");
        chbxhackers.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chbxhackersItemStateChanged(evt);
            }
        });

        chbxpiratas.setBackground(new java.awt.Color(255, 255, 255));
        chbxpiratas.setFont(new java.awt.Font("Segoe UI Emoji", 0, 13)); // NOI18N
        chbxpiratas.setText("Piratas Informáticos");
        chbxpiratas.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chbxpiratasItemStateChanged(evt);
            }
        });

        chbxfraudesbanc.setBackground(new java.awt.Color(255, 255, 255));
        chbxfraudesbanc.setFont(new java.awt.Font("Segoe UI Emoji", 0, 13)); // NOI18N
        chbxfraudesbanc.setText("Fraudes bancarios");
        chbxfraudesbanc.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chbxfraudesbancItemStateChanged(evt);
            }
        });

        chbxestafastel.setBackground(new java.awt.Color(255, 255, 255));
        chbxestafastel.setFont(new java.awt.Font("Segoe UI Emoji", 0, 13)); // NOI18N
        chbxestafastel.setText("Estafas telefónicas");
        chbxestafastel.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chbxestafastelItemStateChanged(evt);
            }
        });

        jLabel135.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel135.setText("¿Tiene o ha tenido vínculos con personas al margen de la ley?");

        txtcompacti.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtcompacti.setBorder(null);
        txtcompacti.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtcompactiCaretUpdate(evt);
            }
        });
        txtcompacti.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcompactiKeyTyped(evt);
            }
        });

        jLabel137.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel137.setText("¿Ha recibido usted propuestas para realizar alguna actividad delictiva?");

        txtprodelict.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtprodelict.setBorder(null);
        txtprodelict.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtprodelictCaretUpdate(evt);
            }
        });
        txtprodelict.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtprodelictKeyTyped(evt);
            }
        });

        txtexplivinculosper.setColumns(20);
        txtexplivinculosper.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtexplivinculosper.setLineWrap(true);
        txtexplivinculosper.setRows(5);
        txtexplivinculosper.setWrapStyleWord(true);
        txtexplivinculosper.setBorder(null);
        txtexplivinculosper.setPreferredSize(new java.awt.Dimension(730, 100));
        txtexplivinculosper.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtexplivinculosperCaretUpdate(evt);
            }
        });
        txtexplivinculosper.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtexplivinculosperKeyTyped(evt);
            }
        });
        jScrollPane12.setViewportView(txtexplivinculosper);

        jLabel140.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel140.setText("¿Ha participado usted en alguna actividad ilícita?");

        txtpartici.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtpartici.setBorder(null);
        txtpartici.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtparticiCaretUpdate(evt);
            }
        });
        txtpartici.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtparticiKeyTyped(evt);
            }
        });

        jLabel32.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel34.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel35.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

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

        jLabel38.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtactpermal1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtactpermal1.setBorder(null);
        txtactpermal1.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtactpermal1CaretUpdate(evt);
            }
        });
        txtactpermal1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtactpermal1KeyTyped(evt);
            }
        });

        jLabel141.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel141.setText("¿Sabe usted con seguridad de alguien que haya estado involucrado en alguna actividad delictiva?");

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

        jRadioButton6.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton6.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jRadioButton6.setText("A");
        jRadioButton6.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButton6ItemStateChanged(evt);
            }
        });

        jLabel39.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtpartici1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtpartici1.setBorder(null);
        txtpartici1.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtpartici1CaretUpdate(evt);
            }
        });
        txtpartici1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtpartici1KeyTyped(evt);
            }
        });

        jLabel142.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel142.setText("¿Algún miembro de su familia ha estado preso en una cárcel?");

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

        jLabel40.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtpartici2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtpartici2.setBorder(null);
        txtpartici2.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtpartici2CaretUpdate(evt);
            }
        });
        txtpartici2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpartici2ActionPerformed(evt);
            }
        });
        txtpartici2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtpartici2KeyTyped(evt);
            }
        });

        jLabel143.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel143.setText("¿Algún amigo o compañero de trabajo ha estado preso en una cárcel?");

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

        jRadioButton8.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton8.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jRadioButton8.setText("A");
        jRadioButton8.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButton8ItemStateChanged(evt);
            }
        });

        jLabel41.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtpartici3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtpartici3.setBorder(null);
        txtpartici3.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtpartici3CaretUpdate(evt);
            }
        });
        txtpartici3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtpartici3KeyTyped(evt);
            }
        });

        jLabel144.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel144.setText("¿Existe alguna admisión relevante en esta categoría?");

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

        jRadioButton9.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton9.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jRadioButton9.setText("A");
        jRadioButton9.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButton9ItemStateChanged(evt);
            }
        });

        jCheckBox47.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox47.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jCheckBox47.setText("Tuvo o tiene");
        jCheckBox47.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox47ItemStateChanged(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel136.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel136.setText("¿Esa(s) persona(s) actualmente realizan alguna actividad delictiva?");

        txtactpermal.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtactpermal.setBorder(null);
        txtactpermal.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtactpermalCaretUpdate(evt);
            }
        });
        txtactpermal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtactpermalKeyTyped(evt);
            }
        });

        jLabel33.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jCheckBox38.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox38.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jCheckBox38.setText("No");
        jCheckBox38.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox38ItemStateChanged(evt);
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

        jRadioButton2.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton2.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jRadioButton2.setText("A");
        jRadioButton2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButton2ItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtactpermal)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel136)
                        .addGap(372, 372, 372)
                        .addComponent(jCheckBox37, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox38, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel136)
                    .addComponent(jCheckBox37, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox38, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addComponent(txtactpermal, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel35, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel38, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel39, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel40, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtpartici2)
                    .addComponent(txtpartici)
                    .addComponent(txtprodelict)
                    .addComponent(txtcompacti)
                    .addComponent(txtactpermal1)
                    .addComponent(txtpartici1)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel143)
                        .addGap(343, 343, 343)
                        .addComponent(jCheckBox43, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox44, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel140)
                        .addGap(475, 475, 475)
                        .addComponent(jCheckBox35, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox36, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel137)
                        .addGap(345, 345, 345)
                        .addComponent(jCheckBox33, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox34, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel134)
                        .addGap(352, 352, 352)
                        .addComponent(jCheckBox31, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox32, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chbxasesinos)
                            .addComponent(chbxmicrotrafic)
                            .addComponent(chbxnarcotrafi)
                            .addComponent(chbxextorcio)
                            .addComponent(chbxsecuestradores)
                            .addComponent(chbxestafastel)
                            .addComponent(chbxvioladores))
                        .addGap(53, 53, 53)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chbxbandascri)
                            .addComponent(chbxguerrille)
                            .addComponent(chbxparamili)
                            .addComponent(chbxcorruptos)
                            .addComponent(chbxclonadorestar)
                            .addComponent(chbxciberdelincuentes)
                            .addComponent(chbxfraudestarcre))
                        .addGap(7, 7, 7)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chbxfraudetiquetes)
                            .addComponent(chbxsuplantacionid)
                            .addComponent(chbxescaperos)
                            .addComponent(chbxhackers)
                            .addComponent(chbxpiratas)
                            .addComponent(chbxfraudesbanc)
                            .addComponent(chbxcomprabd)))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel141)
                        .addGap(179, 179, 179)
                        .addComponent(jCheckBox39, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox40, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel142)
                        .addGap(397, 397, 397)
                        .addComponent(jCheckBox41, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox42, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel8Layout.createSequentialGroup()
                            .addComponent(jLabel135, javax.swing.GroupLayout.PREFERRED_SIZE, 654, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(82, 82, 82)
                            .addComponent(jCheckBox47, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jCheckBox29, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chbxsuplantador)
                            .addComponent(chbxescopolamineros)
                            .addComponent(chbxestafadores)
                            .addComponent(chbxbodegueros)
                            .addComponent(chbxapartmenteros)
                            .addComponent(chbxfleteros)
                            .addComponent(chbxraponeros)
                            .addComponent(chbxladrones)
                            .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel8Layout.createSequentialGroup()
                            .addComponent(jLabel144)
                            .addGap(452, 452, 452)
                            .addComponent(jCheckBox45, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jCheckBox46, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel41, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtpartici3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox29, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox47, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel135))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(chbxladrones)
                        .addComponent(chbxestafastel))
                    .addComponent(chbxguerrille)
                    .addComponent(chbxcomprabd))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chbxraponeros, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chbxasesinos, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chbxbandascri)
                    .addComponent(chbxsuplantacionid))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chbxfleteros)
                    .addComponent(chbxvioladores)
                    .addComponent(chbxparamili, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chbxfraudetiquetes))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(chbxapartmenteros)
                        .addComponent(chbxextorcio)
                        .addComponent(chbxcorruptos))
                    .addComponent(chbxescaperos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(chbxbodegueros)
                        .addComponent(chbxsecuestradores)
                        .addComponent(chbxclonadorestar))
                    .addComponent(chbxhackers))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(chbxestafadores)
                        .addComponent(chbxnarcotrafi)
                        .addComponent(chbxciberdelincuentes))
                    .addComponent(chbxpiratas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chbxsuplantador)
                    .addComponent(chbxmicrotrafic)
                    .addComponent(chbxfraudestarcre)
                    .addComponent(chbxfraudesbanc))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chbxescopolamineros)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel141)
                    .addComponent(jCheckBox39, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox40, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addComponent(txtactpermal1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel134)
                    .addComponent(jCheckBox31, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox32, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addComponent(txtcompacti, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox33, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox34, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel137))
                .addGap(7, 7, 7)
                .addComponent(txtprodelict, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jCheckBox35, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jCheckBox36, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jRadioButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel140))
                .addGap(7, 7, 7)
                .addComponent(txtpartici, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jCheckBox41, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jCheckBox42, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jRadioButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel142))
                .addGap(7, 7, 7)
                .addComponent(txtpartici1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jCheckBox43, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jCheckBox44, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jRadioButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel143))
                .addGap(7, 7, 7)
                .addComponent(txtpartici2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox45, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox46, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel144))
                .addGap(7, 7, 7)
                .addComponent(txtpartici3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        jScrollPane6.setViewportView(jPanel8);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 975, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 975, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 550, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtprodelictCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtprodelictCaretUpdate
        VinculosPersonas.setExpactdelictpre4(txtprodelict.getText());
    }//GEN-LAST:event_txtprodelictCaretUpdate

    private void txtactpermalCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtactpermalCaretUpdate
        VinculosPersonas.setExpactdelictpre2(txtactpermal.getText());
    }//GEN-LAST:event_txtactpermalCaretUpdate

    private void txtcompactiCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtcompactiCaretUpdate
        VinculosPersonas.setExpactdelictpre3(txtcompacti.getText());
    }//GEN-LAST:event_txtcompactiCaretUpdate

    private void txtexplivinculosperCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtexplivinculosperCaretUpdate
        VinculosPersonas.setExptipovinculos(txtexplivinculosper.getText());
    }//GEN-LAST:event_txtexplivinculosperCaretUpdate

    private void txtparticiCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtparticiCaretUpdate
        VinculosPersonas.setExpactdelictpre5(txtpartici.getText());
    }//GEN-LAST:event_txtparticiCaretUpdate

    private void chbxladronesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chbxladronesItemStateChanged
        if (chbxladrones.isSelected()) {
            VinculosPersonas.setTipovinculo1("hay");
        } else if (!chbxladrones.isSelected()) {
            VinculosPersonas.setTipovinculo1("nohay");
        }
    }//GEN-LAST:event_chbxladronesItemStateChanged

    private void chbxraponerosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chbxraponerosItemStateChanged
        if (chbxraponeros.isSelected()) {
            VinculosPersonas.setTipovinculo2("hay");
        } else if (!chbxraponeros.isSelected()) {
            VinculosPersonas.setTipovinculo2("nohay");
        }
    }//GEN-LAST:event_chbxraponerosItemStateChanged

    private void chbxfleterosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chbxfleterosItemStateChanged
        if (chbxfleteros.isSelected()) {
            VinculosPersonas.setTipovinculo3("hay");
        } else if (!chbxfleteros.isSelected()) {
            VinculosPersonas.setTipovinculo3("nohay");
        }
    }//GEN-LAST:event_chbxfleterosItemStateChanged

    private void chbxapartmenterosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chbxapartmenterosItemStateChanged
        if (chbxapartmenteros.isSelected()) {
            VinculosPersonas.setTipovinculo4("hay");
        } else if (!chbxapartmenteros.isSelected()) {
            VinculosPersonas.setTipovinculo4("nohay");
        }
    }//GEN-LAST:event_chbxapartmenterosItemStateChanged

    private void chbxbodeguerosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chbxbodeguerosItemStateChanged
        if (chbxbodegueros.isSelected()) {
            VinculosPersonas.setTipovinculo5("hay");
        } else if (!chbxbodegueros.isSelected()) {
            VinculosPersonas.setTipovinculo5("nohay");
        }
    }//GEN-LAST:event_chbxbodeguerosItemStateChanged

    private void chbxestafadoresItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chbxestafadoresItemStateChanged
        if (chbxestafadores.isSelected()) {
            VinculosPersonas.setTipovinculo6("hay");
        } else if (!chbxestafadores.isSelected()) {
            VinculosPersonas.setTipovinculo6("nohay");
        }
    }//GEN-LAST:event_chbxestafadoresItemStateChanged

    private void chbxsuplantadorItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chbxsuplantadorItemStateChanged
        if (chbxsuplantador.isSelected()) {
            VinculosPersonas.setTipovinculo7("hay");
        } else if (!chbxsuplantador.isSelected()) {
            VinculosPersonas.setTipovinculo7("nohay");
        }
    }//GEN-LAST:event_chbxsuplantadorItemStateChanged

    private void chbxescopolaminerosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chbxescopolaminerosItemStateChanged
        if (chbxescopolamineros.isSelected()) {
            VinculosPersonas.setTipovinculo8("hay");
        } else if (!chbxescopolamineros.isSelected()) {
            VinculosPersonas.setTipovinculo8("nohay");
        }
    }//GEN-LAST:event_chbxescopolaminerosItemStateChanged

    private void chbxestafastelItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chbxestafastelItemStateChanged
        if (chbxestafastel.isSelected()) {
            VinculosPersonas.setTipovinculo9("hay");
        } else if (!chbxestafastel.isSelected()) {
            VinculosPersonas.setTipovinculo9("nohay");
        }
    }//GEN-LAST:event_chbxestafastelItemStateChanged

    private void chbxasesinosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chbxasesinosItemStateChanged
        if (chbxasesinos.isSelected()) {
            VinculosPersonas.setTipovinculo10("hay");
        } else if (!chbxasesinos.isSelected()) {
            VinculosPersonas.setTipovinculo10("nohay");
        }
    }//GEN-LAST:event_chbxasesinosItemStateChanged

    private void chbxvioladoresItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chbxvioladoresItemStateChanged
        if (chbxvioladores.isSelected()) {
            VinculosPersonas.setTipovinculo11("hay");
        } else if (!chbxvioladores.isSelected()) {
            VinculosPersonas.setTipovinculo11("nohay");
        }
    }//GEN-LAST:event_chbxvioladoresItemStateChanged

    private void chbxextorcioItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chbxextorcioItemStateChanged
        if (chbxextorcio.isSelected()) {
            VinculosPersonas.setTipovinculo12("hay");
        } else if (!chbxextorcio.isSelected()) {
            VinculosPersonas.setTipovinculo12("nohay");
        }
    }//GEN-LAST:event_chbxextorcioItemStateChanged

    private void chbxsecuestradoresItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chbxsecuestradoresItemStateChanged
        if (chbxsecuestradores.isSelected()) {
            VinculosPersonas.setTipovinculo13("hay");
        } else if (!chbxsecuestradores.isSelected()) {
            VinculosPersonas.setTipovinculo13("nohay");
        }
    }//GEN-LAST:event_chbxsecuestradoresItemStateChanged

    private void chbxnarcotrafiItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chbxnarcotrafiItemStateChanged
        if (chbxnarcotrafi.isSelected()) {
            VinculosPersonas.setTipovinculo14("hay");
        } else if (!chbxnarcotrafi.isSelected()) {
            VinculosPersonas.setTipovinculo14("nohay");
        }
    }//GEN-LAST:event_chbxnarcotrafiItemStateChanged

    private void chbxmicrotraficItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chbxmicrotraficItemStateChanged
        if (chbxmicrotrafic.isSelected()) {
            VinculosPersonas.setTipovinculo15("hay");
        } else if (!chbxmicrotrafic.isSelected()) {
            VinculosPersonas.setTipovinculo15("nohay");
        }
    }//GEN-LAST:event_chbxmicrotraficItemStateChanged

    private void chbxguerrilleItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chbxguerrilleItemStateChanged
        if (chbxguerrille.isSelected()) {
            VinculosPersonas.setTipovinculo16("hay");
        } else if (!chbxguerrille.isSelected()) {
            VinculosPersonas.setTipovinculo16("nohay");
        }
    }//GEN-LAST:event_chbxguerrilleItemStateChanged

    private void chbxbandascriItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chbxbandascriItemStateChanged
        if (chbxbandascri.isSelected()) {
            VinculosPersonas.setTipovinculo17("hay");
        } else if (!chbxbandascri.isSelected()) {
            VinculosPersonas.setTipovinculo17("nohay");
        }
    }//GEN-LAST:event_chbxbandascriItemStateChanged

    private void chbxparamiliItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chbxparamiliItemStateChanged
        if (chbxparamili.isSelected()) {
            VinculosPersonas.setTipovinculo18("hay");
        } else if (!chbxparamili.isSelected()) {
            VinculosPersonas.setTipovinculo18("nohay");
        }
    }//GEN-LAST:event_chbxparamiliItemStateChanged

    private void chbxcorruptosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chbxcorruptosItemStateChanged
        if (chbxcorruptos.isSelected()) {
            VinculosPersonas.setTipovinculo19("hay");
        } else if (!chbxcorruptos.isSelected()) {
            VinculosPersonas.setTipovinculo19("nohay");
        }
    }//GEN-LAST:event_chbxcorruptosItemStateChanged

    private void chbxclonadorestarItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chbxclonadorestarItemStateChanged
        if (chbxclonadorestar.isSelected()) {
            VinculosPersonas.setTipovinculo20("hay");
        } else if (!chbxclonadorestar.isSelected()) {
            VinculosPersonas.setTipovinculo20("nohay");
        }
    }//GEN-LAST:event_chbxclonadorestarItemStateChanged

    private void chbxciberdelincuentesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chbxciberdelincuentesItemStateChanged
        if (chbxciberdelincuentes.isSelected()) {
            VinculosPersonas.setTipovinculo21("hay");
        } else if (!chbxciberdelincuentes.isSelected()) {
            VinculosPersonas.setTipovinculo21("nohay");
        }
    }//GEN-LAST:event_chbxciberdelincuentesItemStateChanged

    private void chbxfraudestarcreItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chbxfraudestarcreItemStateChanged
        if (chbxfraudestarcre.isSelected()) {
            VinculosPersonas.setTipovinculo22("hay");
        } else if (!chbxfraudestarcre.isSelected()) {
            VinculosPersonas.setTipovinculo22("nohay");
        }
    }//GEN-LAST:event_chbxfraudestarcreItemStateChanged

    private void chbxcomprabdItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chbxcomprabdItemStateChanged
        if (chbxcomprabd.isSelected()) {
            VinculosPersonas.setTipovinculo23("hay");
        } else if (!chbxcomprabd.isSelected()) {
            VinculosPersonas.setTipovinculo23("nohay");
        }
    }//GEN-LAST:event_chbxcomprabdItemStateChanged

    private void chbxsuplantacionidItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chbxsuplantacionidItemStateChanged
        if (chbxsuplantacionid.isSelected()) {
            VinculosPersonas.setTipovinculo24("hay");
        } else if (!chbxsuplantacionid.isSelected()) {
            VinculosPersonas.setTipovinculo24("nohay");
        }
    }//GEN-LAST:event_chbxsuplantacionidItemStateChanged

    private void chbxfraudetiquetesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chbxfraudetiquetesItemStateChanged
        if (chbxfraudetiquetes.isSelected()) {
            VinculosPersonas.setTipovinculo25("hay");
        } else if (!chbxfraudetiquetes.isSelected()) {
            VinculosPersonas.setTipovinculo25("nohay");
        }
    }//GEN-LAST:event_chbxfraudetiquetesItemStateChanged

    private void chbxescaperosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chbxescaperosItemStateChanged
        if (chbxescaperos.isSelected()) {
            VinculosPersonas.setTipovinculo26("hay");
        } else if (!chbxescaperos.isSelected()) {
            VinculosPersonas.setTipovinculo26("nohay");
        }
    }//GEN-LAST:event_chbxescaperosItemStateChanged

    private void chbxhackersItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chbxhackersItemStateChanged
        if (chbxhackers.isSelected()) {
            VinculosPersonas.setTipovinculo27("hay");
        } else if (!chbxhackers.isSelected()) {
            VinculosPersonas.setTipovinculo27("nohay");
        }
    }//GEN-LAST:event_chbxhackersItemStateChanged

    private void chbxpiratasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chbxpiratasItemStateChanged
        if (chbxpiratas.isSelected()) {
            VinculosPersonas.setTipovinculo28("hay");
        } else if (!chbxpiratas.isSelected()) {
            VinculosPersonas.setTipovinculo28("nohay");
        }
    }//GEN-LAST:event_chbxpiratasItemStateChanged

    private void chbxfraudesbancItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chbxfraudesbancItemStateChanged
        if (chbxfraudesbanc.isSelected()) {
            VinculosPersonas.setTipovinculo29("hay");
        } else if (!chbxfraudesbanc.isSelected()) {
            VinculosPersonas.setTipovinculo29("nohay");
        }
    }//GEN-LAST:event_chbxfraudesbancItemStateChanged

    private void jCheckBox29ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox29ItemStateChanged
        if (jCheckBox29.isSelected()) {
            jCheckBox47.setSelected(false);
            Admisiones.setAdmVPML1("nohay");
            VinculosPersonas.setVinculosmargenley("No");
            txtexplivinculosper.setVisible(false);
            chbxladrones.setEnabled(false);
            chbxraponeros.setEnabled(false);
            chbxfleteros.setEnabled(false);
            chbxapartmenteros.setEnabled(false);
            chbxbodegueros.setEnabled(false);
            chbxestafadores.setEnabled(false);
            chbxsuplantador.setEnabled(false);
            chbxescopolamineros.setEnabled(false);
            chbxestafastel.setEnabled(false);
            chbxasesinos.setEnabled(false);
            chbxvioladores.setEnabled(false);
            chbxextorcio.setEnabled(false);
            chbxsecuestradores.setEnabled(false);
            chbxnarcotrafi.setEnabled(false);
            chbxmicrotrafic.setEnabled(false);
            chbxguerrille.setEnabled(false);
            chbxbandascri.setEnabled(false);
            chbxparamili.setEnabled(false);
            chbxcorruptos.setEnabled(false);
            chbxclonadorestar.setEnabled(false);
            chbxciberdelincuentes.setEnabled(false);
            chbxfraudestarcre.setEnabled(false);
            chbxcomprabd.setEnabled(false);
            chbxsuplantacionid.setEnabled(false);
            chbxfraudetiquetes.setEnabled(false);
            chbxescaperos.setEnabled(false);
            chbxhackers.setEnabled(false);
            chbxpiratas.setEnabled(false);
            chbxfraudesbanc.setEnabled(false);
        } else {
            Admisiones.setAdmVPML1("nohay");
            VinculosPersonas.setVinculosmargenley("-");
            txtexplivinculosper.setVisible(false);
            chbxladrones.setEnabled(false);
            chbxraponeros.setEnabled(false);
            chbxfleteros.setEnabled(false);
            chbxapartmenteros.setEnabled(false);
            chbxbodegueros.setEnabled(false);
            chbxestafadores.setEnabled(false);
            chbxsuplantador.setEnabled(false);
            chbxescopolamineros.setEnabled(false);
            chbxestafastel.setEnabled(false);
            chbxasesinos.setEnabled(false);
            chbxvioladores.setEnabled(false);
            chbxextorcio.setEnabled(false);
            chbxsecuestradores.setEnabled(false);
            chbxnarcotrafi.setEnabled(false);
            chbxmicrotrafic.setEnabled(false);
            chbxguerrille.setEnabled(false);
            chbxbandascri.setEnabled(false);
            chbxparamili.setEnabled(false);
            chbxcorruptos.setEnabled(false);
            chbxclonadorestar.setEnabled(false);
            chbxciberdelincuentes.setEnabled(false);
            chbxfraudestarcre.setEnabled(false);
            chbxcomprabd.setEnabled(false);
            chbxsuplantacionid.setEnabled(false);
            chbxfraudetiquetes.setEnabled(false);
            chbxescaperos.setEnabled(false);
            chbxhackers.setEnabled(false);
            chbxpiratas.setEnabled(false);
            chbxfraudesbanc.setEnabled(false);
        }

//        if (jCheckBox5.isSelected()) {
//            jCheckBox6.setSelected(false);
//            txtsalariodeven.setVisible(false);
//            jLabel67.setVisible(false);
//            fina = "No";
//            setFinanc(fina);
//            jRadioButton1.setSelected(false);
//            jRadioButton1.setVisible(false);
//        } else {
//            txtsalariodeven.setVisible(false);
//            jLabel67.setVisible(false);
//            fina = "-";
//            setFinanc(fina);
//            jRadioButton1.setSelected(false);
//            jRadioButton1.setVisible(false);
//        }
    }//GEN-LAST:event_jCheckBox29ItemStateChanged

    private void jCheckBox31ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox31ItemStateChanged
        if (jCheckBox31.isSelected()) {
            jCheckBox32.setSelected(false);
            VinculosPersonas.setActdelictpre3("Sí");
            txtcompacti.setVisible(true);
            jLabel34.setVisible(true);
            jRadioButton3.setVisible(true);
        } else {
            VinculosPersonas.setActdelictpre3("-");
            txtcompacti.setVisible(false);
            jLabel34.setVisible(false);
            jRadioButton3.setVisible(false);
            jRadioButton3.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox31ItemStateChanged

    private void jCheckBox32ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox32ItemStateChanged
        if (jCheckBox32.isSelected()) {
            jCheckBox31.setSelected(false);
            VinculosPersonas.setActdelictpre3("No");
            txtcompacti.setVisible(false);
            jLabel34.setVisible(false);
            jRadioButton3.setVisible(false);
            jRadioButton3.setSelected(false);
        } else {
            VinculosPersonas.setActdelictpre3("-");
            txtcompacti.setVisible(false);
            jLabel34.setVisible(false);
            jRadioButton3.setVisible(false);
            jRadioButton3.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox32ItemStateChanged

    private void jCheckBox33ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox33ItemStateChanged
        if (jCheckBox33.isSelected()) {
            jCheckBox34.setSelected(false);
            VinculosPersonas.setActdelictpre4("Sí");
            txtprodelict.setVisible(true);
            jLabel32.setVisible(true);
            jRadioButton4.setVisible(true);
        } else {
            VinculosPersonas.setActdelictpre4("-");
            txtprodelict.setVisible(false);
            jLabel32.setVisible(false);
            jRadioButton4.setVisible(false);
            jRadioButton4.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox33ItemStateChanged

    private void jCheckBox34ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox34ItemStateChanged
        if (jCheckBox34.isSelected()) {
            jCheckBox33.setSelected(false);
            VinculosPersonas.setActdelictpre4("No");
            txtprodelict.setVisible(false);
            jLabel32.setVisible(false);
            jRadioButton4.setVisible(false);
            jRadioButton4.setSelected(false);
        } else {
                        VinculosPersonas.setActdelictpre4("-");
            txtprodelict.setVisible(false);
            jLabel32.setVisible(false);
            jRadioButton4.setVisible(false);
            jRadioButton4.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox34ItemStateChanged

    private void jCheckBox35ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox35ItemStateChanged
        if (jCheckBox35.isSelected()) {
            jCheckBox36.setSelected(false);
                        VinculosPersonas.setActdelictpre5("Sí");

            txtpartici.setVisible(true);
            jLabel35.setVisible(true);
            jRadioButton5.setVisible(true);
        } else {
            VinculosPersonas.setActdelictpre5("-");
            txtpartici.setVisible(false);
            jLabel35.setVisible(false);
            jRadioButton5.setVisible(false);
            jRadioButton5.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox35ItemStateChanged

    private void jCheckBox36ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox36ItemStateChanged
        if (jCheckBox36.isSelected()) {
            jCheckBox35.setSelected(false);
            VinculosPersonas.setActdelictpre5("No");
            txtpartici.setVisible(false);
            jLabel35.setVisible(false);
            jRadioButton5.setVisible(false);
            jRadioButton5.setSelected(false);
        } else {
            VinculosPersonas.setActdelictpre5("-");
            txtpartici.setVisible(false);
            jLabel35.setVisible(false);
            jRadioButton5.setVisible(false);
            jRadioButton5.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox36ItemStateChanged

    private void jCheckBox37ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox37ItemStateChanged
        if (jCheckBox37.isSelected()) {
            jCheckBox38.setSelected(false);
            VinculosPersonas.setActdelictpre2("Sí");
            txtactpermal.setVisible(true);
            jLabel33.setVisible(true);
            jRadioButton2.setVisible(true);
        } else {
            VinculosPersonas.setActdelictpre2("-");
            txtactpermal.setVisible(false);
            jLabel33.setVisible(false);
            jRadioButton2.setVisible(false);
            jRadioButton2.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox37ItemStateChanged

    private void jCheckBox38ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox38ItemStateChanged
        if (jCheckBox38.isSelected()) {
            jCheckBox37.setSelected(false);
            VinculosPersonas.setActdelictpre2("No");
            txtactpermal.setVisible(false);
            jLabel33.setVisible(false);
            jRadioButton2.setVisible(false);
            jRadioButton2.setSelected(false);
        } else {
            VinculosPersonas.setActdelictpre2("-");
            txtactpermal.setVisible(false);
            jLabel33.setVisible(false);
            jRadioButton2.setVisible(false);
            jRadioButton2.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox38ItemStateChanged

    private void txtactpermal1CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtactpermal1CaretUpdate
        VinculosPersonas.setExpactdelictpre1(txtactpermal1.getText());
    }//GEN-LAST:event_txtactpermal1CaretUpdate

    private void jCheckBox39ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox39ItemStateChanged
        if (jCheckBox39.isSelected()) {
            jCheckBox40.setSelected(false);
            jRadioButton6.setVisible(true);
            txtactpermal1.setVisible(true);
            jLabel38.setVisible(true);
            VinculosPersonas.setActdelictpre1("Sí");
            jPanel1.setVisible(true);
            jLabel136.setVisible(true);
        jCheckBox37.setVisible(true);
        jCheckBox38.setVisible(true);
        } else {
            jPanel1.setVisible(false);
            VinculosPersonas.setActdelictpre1("-");
            jRadioButton6.setSelected(false);
            jRadioButton6.setVisible(false);
            txtactpermal1.setVisible(false);
            jLabel38.setVisible(false);
           jLabel136.setVisible(false);
        jCheckBox37.setVisible(false);
        jCheckBox38.setVisible(false);
        }
    }//GEN-LAST:event_jCheckBox39ItemStateChanged

    private void jCheckBox40ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox40ItemStateChanged
        if (jCheckBox40.isSelected()) {
            jPanel1.setVisible(false);
            jCheckBox39.setSelected(false);
            jRadioButton6.setVisible(false);
            jRadioButton6.setSelected(false);
            txtactpermal1.setVisible(false);
            jLabel38.setVisible(false);
            VinculosPersonas.setActdelictpre1("No");
          jLabel136.setVisible(false);
        jCheckBox37.setVisible(false);
        jCheckBox38.setVisible(false);
        } else {
            jPanel1.setVisible(false);
            VinculosPersonas.setActdelictpre1("-");
            jRadioButton6.setSelected(false);
            jRadioButton6.setVisible(false);
            txtactpermal1.setVisible(false);
            jLabel38.setVisible(false);
          jLabel136.setVisible(false);
        jCheckBox37.setVisible(false);
        jCheckBox38.setVisible(false);
        }
    }//GEN-LAST:event_jCheckBox40ItemStateChanged

    private void txtpartici1CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtpartici1CaretUpdate
        VinculosPersonas.setExpactdelictpre6(txtpartici1.getText());
    }//GEN-LAST:event_txtpartici1CaretUpdate

    private void jCheckBox41ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox41ItemStateChanged
        if (jCheckBox41.isSelected()) {
            jCheckBox42.setSelected(false);
            jRadioButton9.setVisible(true);
            VinculosPersonas.setActdelictpre6("Sí");
            txtpartici1.setVisible(true);
            jLabel39.setVisible(true);
        } else {
            VinculosPersonas.setActdelictpre6("-");
            jRadioButton9.setSelected(false);
            jRadioButton9.setVisible(false);
            txtpartici1.setVisible(false);
            jLabel39.setVisible(false);
        }
    }//GEN-LAST:event_jCheckBox41ItemStateChanged

    private void jCheckBox42ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox42ItemStateChanged
        if (jCheckBox42.isSelected()) {
            jCheckBox41.setSelected(false);
            jRadioButton9.setSelected(false);
            jRadioButton9.setVisible(false);
            txtpartici1.setVisible(false);
            jLabel39.setVisible(false);
            VinculosPersonas.setActdelictpre6("No");
        } else {
            VinculosPersonas.setActdelictpre6("-");
            jRadioButton9.setSelected(false);
            jRadioButton9.setVisible(false);
            txtpartici1.setVisible(false);
            jLabel39.setVisible(false);
        }
    }//GEN-LAST:event_jCheckBox42ItemStateChanged

    private void txtpartici2CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtpartici2CaretUpdate
        VinculosPersonas.setExpactdelictpre7(txtpartici2.getText());
    }//GEN-LAST:event_txtpartici2CaretUpdate

    private void jCheckBox43ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox43ItemStateChanged
        if (jCheckBox43.isSelected()) {
            jCheckBox44.setSelected(false);
            jRadioButton8.setVisible(true);
            txtpartici2.setVisible(true);
            jLabel40.setVisible(true);
            VinculosPersonas.setActdelictpre7("Sí");
        } else {
            VinculosPersonas.setActdelictpre7("-");
            jRadioButton8.setSelected(false);
            jRadioButton8.setVisible(false);
            txtpartici2.setVisible(false);
            jLabel40.setVisible(false);
        }
    }//GEN-LAST:event_jCheckBox43ItemStateChanged

    private void jCheckBox44ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox44ItemStateChanged
        if (jCheckBox44.isSelected()) {
            jCheckBox43.setSelected(false);
            jRadioButton8.setSelected(false);
            jRadioButton8.setVisible(false);
            txtpartici2.setVisible(false);
            jLabel40.setVisible(false);
            VinculosPersonas.setActdelictpre7("No");
        } else {
            VinculosPersonas.setActdelictpre7("-");
            jRadioButton8.setSelected(false);
            jRadioButton8.setVisible(false);
            txtpartici2.setVisible(false);
            jLabel40.setVisible(false);
        }
    }//GEN-LAST:event_jCheckBox44ItemStateChanged

    private void txtpartici3CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtpartici3CaretUpdate
        VinculosPersonas.setAdmisionVinculosPersonas(txtpartici3.getText());
    }//GEN-LAST:event_txtpartici3CaretUpdate

    private void jCheckBox45ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox45ItemStateChanged
        if (jCheckBox45.isSelected()) {
            jCheckBox46.setSelected(false);
            txtpartici3.setVisible(true);
            jLabel41.setVisible(true);
            Admisiones.setAdmVPML9("hay");
        } else {
            txtpartici3.setVisible(false);
            jLabel41.setVisible(false);
            Admisiones.setAdmVPML9("nohay");
        }
    }//GEN-LAST:event_jCheckBox45ItemStateChanged

    private void jCheckBox46ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox46ItemStateChanged
        if (jCheckBox46.isSelected()) {
            jCheckBox45.setSelected(false);
            txtpartici3.setVisible(false);
            jLabel41.setVisible(false);
            Admisiones.setAdmVPML9("nohay");
        } else {
            txtpartici3.setVisible(false);
            jLabel41.setVisible(false);
            Admisiones.setAdmVPML9("nohay");
        }
    }//GEN-LAST:event_jCheckBox46ItemStateChanged

    private void txtexplivinculosperKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtexplivinculosperKeyTyped
        int k = (int) evt.getKeyChar();
        if (k == 39) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "¡No se acepta ese tipo de carácter!", "Error de datos ingresados", JOptionPane.ERROR_MESSAGE, iconThinking_uh);
        }
        InputMap map = txtexplivinculosper.getInputMap(JTextField.WHEN_FOCUSED);
//        map.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, CTRL_MASK), "null");
    }//GEN-LAST:event_txtexplivinculosperKeyTyped

    private void txtactpermal1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtactpermal1KeyTyped
        int k = (int) evt.getKeyChar();
        if (k == 39) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "¡No se acepta ese tipo de carácter!", "Error de datos ingresados", JOptionPane.ERROR_MESSAGE, iconThinking_uh);
        }
        InputMap map = txtactpermal1.getInputMap(JTextField.WHEN_FOCUSED);
//        map.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, CTRL_MASK), "null");
    }//GEN-LAST:event_txtactpermal1KeyTyped

    private void txtactpermalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtactpermalKeyTyped
        int k = (int) evt.getKeyChar();
        if (k == 39) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "¡No se acepta ese tipo de carácter!", "Error de datos ingresados", JOptionPane.ERROR_MESSAGE, iconThinking_uh);
        }
        InputMap map = txtactpermal.getInputMap(JTextField.WHEN_FOCUSED);
//        map.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, CTRL_MASK), "null");
    }//GEN-LAST:event_txtactpermalKeyTyped

    private void txtcompactiKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcompactiKeyTyped
        int k = (int) evt.getKeyChar();
        if (k == 39) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "¡No se acepta ese tipo de carácter!", "Error de datos ingresados", JOptionPane.ERROR_MESSAGE, iconThinking_uh);
        }
        InputMap map = txtcompacti.getInputMap(JTextField.WHEN_FOCUSED);
//        map.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, CTRL_MASK), "null");
    }//GEN-LAST:event_txtcompactiKeyTyped

    private void txtprodelictKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtprodelictKeyTyped
        int k = (int) evt.getKeyChar();
        if (k == 39) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "¡No se acepta ese tipo de carácter!", "Error de datos ingresados", JOptionPane.ERROR_MESSAGE, iconThinking_uh);
        }
        InputMap map = txtprodelict.getInputMap(JTextField.WHEN_FOCUSED);
//        map.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, CTRL_MASK), "null");
    }//GEN-LAST:event_txtprodelictKeyTyped

    private void txtparticiKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtparticiKeyTyped
        int k = (int) evt.getKeyChar();
        if (k == 39) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "¡No se acepta ese tipo de carácter!", "Error de datos ingresados", JOptionPane.ERROR_MESSAGE, iconThinking_uh);
        }
        InputMap map = txtpartici.getInputMap(JTextField.WHEN_FOCUSED);
//        map.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, CTRL_MASK), "null");
    }//GEN-LAST:event_txtparticiKeyTyped

    private void txtpartici1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpartici1KeyTyped
        int k = (int) evt.getKeyChar();
        if (k == 39) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "¡No se acepta ese tipo de carácter!", "Error de datos ingresados", JOptionPane.ERROR_MESSAGE, iconThinking_uh);
        }
        InputMap map = txtpartici1.getInputMap(JTextField.WHEN_FOCUSED);
//        map.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, CTRL_MASK), "null");
    }//GEN-LAST:event_txtpartici1KeyTyped

    private void txtpartici2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpartici2KeyTyped
        int k = (int) evt.getKeyChar();
        if (k == 39) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "¡No se acepta ese tipo de carácter!", "Error de datos ingresados", JOptionPane.ERROR_MESSAGE, iconThinking_uh);
        }
        InputMap map = txtpartici2.getInputMap(JTextField.WHEN_FOCUSED);
//        map.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, CTRL_MASK), "null");
    }//GEN-LAST:event_txtpartici2KeyTyped

    private void txtpartici3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpartici3KeyTyped
        int k = (int) evt.getKeyChar();
        if (k == 39) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "¡No se acepta ese tipo de carácter!", "Error de datos ingresados", JOptionPane.ERROR_MESSAGE, iconThinking_uh);
        }
        InputMap map = txtpartici3.getInputMap(JTextField.WHEN_FOCUSED);
//        map.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, CTRL_MASK), "null");
    }//GEN-LAST:event_txtpartici3KeyTyped

    private void jCheckBox47ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox47ItemStateChanged
        if (jCheckBox47.isSelected()) {
            jCheckBox29.setSelected(false);
            VinculosPersonas.setVinculosmargenley("Sí");
            Admisiones.setAdmVPML1("hay");
            txtexplivinculosper.setVisible(true);
            chbxladrones.setEnabled(true);
            chbxraponeros.setEnabled(true);
            chbxfleteros.setEnabled(true);
            chbxapartmenteros.setEnabled(true);
            chbxbodegueros.setEnabled(true);
            chbxestafadores.setEnabled(true);
            chbxsuplantador.setEnabled(true);
            chbxescopolamineros.setEnabled(true);
            chbxestafastel.setEnabled(true);
            chbxasesinos.setEnabled(true);
            chbxvioladores.setEnabled(true);
            chbxextorcio.setEnabled(true);
            chbxsecuestradores.setEnabled(true);
            chbxnarcotrafi.setEnabled(true);
            chbxmicrotrafic.setEnabled(true);
            chbxguerrille.setEnabled(true);
            chbxbandascri.setEnabled(true);
            chbxparamili.setEnabled(true);
            chbxcorruptos.setEnabled(true);
            chbxclonadorestar.setEnabled(true);
            chbxciberdelincuentes.setEnabled(true);
            chbxfraudestarcre.setEnabled(true);
            chbxcomprabd.setEnabled(true);
            chbxsuplantacionid.setEnabled(true);
            chbxfraudetiquetes.setEnabled(true);
            chbxescaperos.setEnabled(true);
            chbxhackers.setEnabled(true);
            chbxpiratas.setEnabled(true);
            chbxfraudesbanc.setEnabled(true);
        } else {
            VinculosPersonas.setVinculosmargenley("-");
            Admisiones.setAdmVPML1("nohay");
            txtexplivinculosper.setVisible(false);
            chbxladrones.setEnabled(false);
            chbxraponeros.setEnabled(false);
            chbxfleteros.setEnabled(false);
            chbxapartmenteros.setEnabled(false);
            chbxbodegueros.setEnabled(false);
            chbxestafadores.setEnabled(false);
            chbxsuplantador.setEnabled(false);
            chbxescopolamineros.setEnabled(false);
            chbxestafastel.setEnabled(false);
            chbxasesinos.setEnabled(false);
            chbxvioladores.setEnabled(false);
            chbxextorcio.setEnabled(false);
            chbxsecuestradores.setEnabled(false);
            chbxnarcotrafi.setEnabled(false);
            chbxmicrotrafic.setEnabled(false);
            chbxguerrille.setEnabled(false);
            chbxbandascri.setEnabled(false);
            chbxparamili.setEnabled(false);
            chbxcorruptos.setEnabled(false);
            chbxclonadorestar.setEnabled(false);
            chbxciberdelincuentes.setEnabled(false);
            chbxfraudestarcre.setEnabled(false);
            chbxcomprabd.setEnabled(false);
            chbxsuplantacionid.setEnabled(false);
            chbxfraudetiquetes.setEnabled(false);
            chbxescaperos.setEnabled(false);
            chbxhackers.setEnabled(false);
            chbxpiratas.setEnabled(false);
            chbxfraudesbanc.setEnabled(false);
        }

    }//GEN-LAST:event_jCheckBox47ItemStateChanged

    private void jRadioButton6ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton6ItemStateChanged
        if (jRadioButton6.isSelected()) {
            Admisiones.setAdmVPML2("hay");
        } else {
            Admisiones.setAdmVPML2("nohay");
        }
    }//GEN-LAST:event_jRadioButton6ItemStateChanged

    private void jRadioButton2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton2ItemStateChanged
        if (jRadioButton2.isSelected()) {
            Admisiones.setAdmVPML3("hay");
        } else {
            Admisiones.setAdmVPML3("nohay");
        }
    }//GEN-LAST:event_jRadioButton2ItemStateChanged

    private void jRadioButton3ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton3ItemStateChanged
        if (jRadioButton3.isSelected()) {
            Admisiones.setAdmVPML4("hay");
        } else {
            Admisiones.setAdmVPML4("nohay");
        }
    }//GEN-LAST:event_jRadioButton3ItemStateChanged

    private void jRadioButton4ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton4ItemStateChanged
        if (jRadioButton4.isSelected()) {
            Admisiones.setAdmVPML5("hay");
        } else {
            Admisiones.setAdmVPML5("nohay");
        }
    }//GEN-LAST:event_jRadioButton4ItemStateChanged

    private void jRadioButton5ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton5ItemStateChanged
        if (jRadioButton5.isSelected()) {
            Admisiones.setAdmVPML6("hay");
        } else {
            Admisiones.setAdmVPML6("nohay");
        }
    }//GEN-LAST:event_jRadioButton5ItemStateChanged

    private void jRadioButton9ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton9ItemStateChanged
        if (jRadioButton9.isSelected()) {
            Admisiones.setAdmVPML7("hay");
        } else {
            Admisiones.setAdmVPML7("nohay");
        }
    }//GEN-LAST:event_jRadioButton9ItemStateChanged

    private void jRadioButton8ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton8ItemStateChanged
        if (jRadioButton8.isSelected()) {
            Admisiones.setAdmVPML8("hay");
        } else {
            Admisiones.setAdmVPML8("nohay");
        }
    }//GEN-LAST:event_jRadioButton8ItemStateChanged

    private void txtpartici2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpartici2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpartici2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox chbxapartmenteros;
    private javax.swing.JCheckBox chbxasesinos;
    private javax.swing.JCheckBox chbxbandascri;
    private javax.swing.JCheckBox chbxbodegueros;
    private javax.swing.JCheckBox chbxciberdelincuentes;
    private javax.swing.JCheckBox chbxclonadorestar;
    private javax.swing.JCheckBox chbxcomprabd;
    private javax.swing.JCheckBox chbxcorruptos;
    private javax.swing.JCheckBox chbxescaperos;
    private javax.swing.JCheckBox chbxescopolamineros;
    private javax.swing.JCheckBox chbxestafadores;
    private javax.swing.JCheckBox chbxestafastel;
    private javax.swing.JCheckBox chbxextorcio;
    private javax.swing.JCheckBox chbxfleteros;
    private javax.swing.JCheckBox chbxfraudesbanc;
    private javax.swing.JCheckBox chbxfraudestarcre;
    private javax.swing.JCheckBox chbxfraudetiquetes;
    private javax.swing.JCheckBox chbxguerrille;
    private javax.swing.JCheckBox chbxhackers;
    private javax.swing.JCheckBox chbxladrones;
    private javax.swing.JCheckBox chbxmicrotrafic;
    private javax.swing.JCheckBox chbxnarcotrafi;
    private javax.swing.JCheckBox chbxparamili;
    private javax.swing.JCheckBox chbxpiratas;
    private javax.swing.JCheckBox chbxraponeros;
    private javax.swing.JCheckBox chbxsecuestradores;
    private javax.swing.JCheckBox chbxsuplantacionid;
    private javax.swing.JCheckBox chbxsuplantador;
    private javax.swing.JCheckBox chbxvioladores;
    private javax.swing.JCheckBox jCheckBox29;
    private javax.swing.JCheckBox jCheckBox31;
    private javax.swing.JCheckBox jCheckBox32;
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
    private javax.swing.JLabel jLabel134;
    private javax.swing.JLabel jLabel135;
    private javax.swing.JLabel jLabel136;
    private javax.swing.JLabel jLabel137;
    private javax.swing.JLabel jLabel140;
    private javax.swing.JLabel jLabel141;
    private javax.swing.JLabel jLabel142;
    private javax.swing.JLabel jLabel143;
    private javax.swing.JLabel jLabel144;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JRadioButton jRadioButton8;
    private javax.swing.JRadioButton jRadioButton9;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTextField txtactpermal;
    private javax.swing.JTextField txtactpermal1;
    private javax.swing.JTextField txtcompacti;
    private javax.swing.JTextArea txtexplivinculosper;
    private javax.swing.JTextField txtpartici;
    private javax.swing.JTextField txtpartici1;
    private javax.swing.JTextField txtpartici2;
    private javax.swing.JTextField txtpartici3;
    private javax.swing.JTextField txtprodelict;
    // End of variables declaration//GEN-END:variables
}
