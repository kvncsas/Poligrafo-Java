package view;

import classes.Admisiones;
import classes.ConsumoSustancias;
import classes.DatosPrincipales;
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
public class ConsumoSustancia extends javax.swing.JInternalFrame {

    public ConsumoSustancia() {
        ((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI()).setNorthPane(null);
        initComponents();
        //validaingreso();
        jScrollPane3.getVerticalScrollBar().setUnitIncrement(15);
        guiascon_sustancias();
    }

    public void ValidacionTipoExamen() {
        if (DatosPrincipales.getTipoExamen().equals("Pre-empleo")) {
            unvisiblesingreso();
            jPanel2.setVisible(false);

        } else if (DatosPrincipales.getTipoExamen().equals("Rutina (operaciones)")) {
            unvisiblesingreso();
            txtdrogaspregun3.setVisible(false);
            jLabel42.setVisible(false);
            txtdrogaspregun4.setVisible(false);
            jLabel43.setVisible(false);
            txtdrogaspregun5.setVisible(false);
            jLabel44.setVisible(false);
            txtdrogaspregun6.setVisible(false);
            jLabel38.setVisible(false);
            txtdrogaspregun7.setVisible(false);
            jLabel40.setVisible(false);
            txtdrogaspregun8.setVisible(false);
            jLabel39.setVisible(false);
        } else if (DatosPrincipales.getTipoExamen().equals("Rutina (admitivos)")) {
            unvisiblesingreso();
            txtdrogaspregun3.setVisible(false);
            jLabel42.setVisible(false);
            txtdrogaspregun4.setVisible(false);
            jLabel43.setVisible(false);
            txtdrogaspregun5.setVisible(false);
            jLabel44.setVisible(false);
            txtdrogaspregun6.setVisible(false);
            jLabel38.setVisible(false);
            txtdrogaspregun7.setVisible(false);
            jLabel40.setVisible(false);
            txtdrogaspregun8.setVisible(false);
            jLabel39.setVisible(false);
        } else if (DatosPrincipales.getTipoExamen().equals("Específico")) {
            unvisiblesingreso();
            jPanel2.setVisible(false);
            txtdrogaspregun3.setVisible(false);
            txtdrogaspregun4.setVisible(false);
            txtdrogaspregun5.setVisible(false);
            txtdrogaspregun6.setVisible(false);
            txtdrogaspregun7.setVisible(false);
            txtdrogaspregun8.setVisible(false);
            jLabel42.setVisible(false);
            jLabel43.setVisible(false);
            jLabel44.setVisible(false);
            jLabel38.setVisible(false);
            jLabel39.setVisible(false);
            jLabel40.setVisible(false);
            jRadioButton10.setVisible(false);
            jRadioButton11.setVisible(false);
            jRadioButton12.setVisible(false);
            jRadioButton13.setVisible(false);
            jRadioButton14.setVisible(false);
            jRadioButton15.setVisible(false);
        }
    }

    public void guiascon_sustancias() {
        CorrectorOrtografia p1 = new CorrectorOrtografia("Explicó haber consumido...", txtdrogaspregun9);
        CorrectorOrtografia p2 = new CorrectorOrtografia("Comentó haber consumido en su horario laboral...", txtdrogaspregun1);
        CorrectorOrtografia p3 = new CorrectorOrtografia("Afirmó haber consumido sustancias psicoactivas en su lugar de trabajo...", txtdrogaspregun14);
        CorrectorOrtografia p4 = new CorrectorOrtografia("Contó haber llegado bajo efectos de este tipo de sustancias a laborar...", txtdrogaspregun15);
        CorrectorOrtografia p5 = new CorrectorOrtografia("Mencionó haber faltado al trabajo por estar bajo los efectos...", txtdrogaspregun2);
        CorrectorOrtografia p6 = new CorrectorOrtografia("Aclaró que ha participado en actividades relacionadas con el narcotráfico, como...", txtdrogaspregun10);
        CorrectorOrtografia p7 = new CorrectorOrtografia("Dijo haber estado relacionado con personas involucradas en actos...", txtdrogaspregun16);
        CorrectorOrtografia p8 = new CorrectorOrtografia("Indicó que...", txtdrogaspregun11);
        CorrectorOrtografia p9 = new CorrectorOrtografia("Dijo que...", txtdrogaspregun12);
        CorrectorOrtografia p16 = new CorrectorOrtografia("Escriba nombre de droga", txtexpfincara1);
        CorrectorOrtografia p10 = new CorrectorOrtografia("Explicó que...", txtdrogaspregun3);
        CorrectorOrtografia p11 = new CorrectorOrtografia("Expresó que...", txtdrogaspregun4);
        CorrectorOrtografia p12 = new CorrectorOrtografia("Sostuvo...", txtdrogaspregun5);
        CorrectorOrtografia p13 = new CorrectorOrtografia("Manifestó...", txtdrogaspregun6);
        CorrectorOrtografia p14 = new CorrectorOrtografia("Mencionó que...", txtdrogaspregun7);
        CorrectorOrtografia p15 = new CorrectorOrtografia("Contó...", txtdrogaspregun8);

        SpellChecker.register(txtdrogaspregun9);
        SpellChecker.register(txtdrogaspregun1);
        SpellChecker.register(txtdrogaspregun14);
        SpellChecker.register(txtdrogaspregun15);
        SpellChecker.register(txtdrogaspregun2);
        SpellChecker.register(txtdrogaspregun10);
        SpellChecker.register(txtdrogaspregun16);
        SpellChecker.register(txtdrogaspregun11);
        SpellChecker.register(txtdrogaspregun12);
        SpellChecker.register(txtdrogaspregun3);
        SpellChecker.register(txtdrogaspregun4);
        SpellChecker.register(txtdrogaspregun5);
        SpellChecker.register(txtdrogaspregun6);
        SpellChecker.register(txtdrogaspregun7);
        SpellChecker.register(txtdrogaspregun8);
    }

    public void unvisiblesingreso() {
        jPanel1.setVisible(false);
        chbxsiembra.setEnabled(false);
        cbxfabricacion.setEnabled(false);
        cbxexportacion.setEnabled(false);
        cbxinsumos.setEnabled(false);
        cbxinsumos2.setEnabled(false);
        cbxrecoleccion.setEnabled(false);
        cbxtransporte.setEnabled(false);
        cbxcomercializacion.setEnabled(false);
        cbxinsumos1.setEnabled(false);
        cbxrecoleccion1.setEnabled(false);
        cbxrecoleccion2.setEnabled(false);
        chbxheroina1.setVisible(false);
        chbxheroina2.setVisible(false);
        chbxheroina3.setVisible(false);
        frecconsumolast7.setVisible(false);
        txtfrecuenciabebida7.setVisible(false);
        frecconsumolast8.setVisible(false);
        txtfrecuenciabebida8.setVisible(false);
        txtexpfincara1.setVisible(false);
        jLabel66.setVisible(false);
        frecconsumolast9.setVisible(false);
        txtfrecuenciabebida9.setVisible(false);

        txtdrogaspregun17.setVisible(false);
        jLabel50.setVisible(false);
        jRadioButton2.setVisible(false);
        jRadioButton3.setVisible(false);
        jRadioButton4.setVisible(false);
        jRadioButton5.setVisible(false);
        jRadioButton7.setVisible(false);
        jRadioButton8.setVisible(false);
        jRadioButton9.setVisible(false);

        jRadioButton10.setVisible(false);
        jRadioButton11.setVisible(false);
        jRadioButton12.setVisible(false);
        jRadioButton13.setVisible(false);
        jRadioButton14.setVisible(false);
        jRadioButton15.setVisible(false);

        txtdrogaspregun10.setVisible(false);
        jLabel164.setVisible(false);
        txtdrogaspregun16.setVisible(false);
        jLabel49.setVisible(false);

        txtdrogaspregun15.setVisible(false);
        jLabel48.setVisible(false);

        txtdrogaspregun14.setVisible(false);
        jLabel47.setVisible(false);

        jLabel32.setVisible(false);
        jLabel37.setVisible(false);
        jLabel46.setVisible(false);
        jLabel45.setVisible(false);
        jLabel41.setVisible(false);
        jLabel36.setVisible(false);

        frecconsumolast2.setVisible(false);
        txtfrecuenciabebida1.setVisible(false);

        frecconsumolast6.setVisible(false);
        txtfrecuenciabebida.setVisible(false);

        frecconsumolast5.setVisible(false);
        txtfrecuenciabebida2.setVisible(false);

        frecconsumolast4.setVisible(false);
        txtfrecuenciabebida3.setVisible(false);

        frecconsumolast3.setVisible(false);
        txtfrecuenciabebida4.setVisible(false);

        frecconsumolast1.setVisible(false);
        txtfrecuenciabebida5.setVisible(false);

        txtdrogaspregun11.setVisible(false);
        txtdrogaspregun12.setVisible(false);
        chbxmarihuana.setVisible(false);
        chbxcocaina.setVisible(false);
        chbxbazuco.setVisible(false);
        chbxlds.setVisible(false);
        chbxextasis.setVisible(false);
        chbxheroina.setVisible(false);
        txtdrogaspregun9.setVisible(false);
        txtdrogaspregun1.setVisible(false);
        txtdrogaspregun2.setVisible(false);
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
        jCheckBox39.setSelected(false);
        jCheckBox40.setSelected(false);
        jCheckBox55.setSelected(false);
        jCheckBox56.setSelected(false);
        jCheckBox41.setSelected(false);
        jCheckBox42.setSelected(false);
        jCheckBox43.setSelected(false);
        jCheckBox44.setSelected(false);
        jCheckBox59.setSelected(false);
        jCheckBox60.setSelected(false);
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
        jCheckBox57.setSelected(false);
        jCheckBox58.setSelected(false);
        
        jRadioButton2.setSelected(false);
        jRadioButton3.setSelected(false);
        jRadioButton4.setSelected(false);
        jRadioButton5.setSelected(false);
        jRadioButton7.setSelected(false);
        jRadioButton8.setSelected(false);
        jRadioButton9.setSelected(false);
        jRadioButton10.setSelected(false);
        jRadioButton11.setSelected(false);
        jRadioButton12.setSelected(false);
        jRadioButton13.setSelected(false);
        jRadioButton14.setSelected(false);
        jRadioButton15.setSelected(false);

        txtfrecuenciabebida1.setSelectedItem("Seleccione");
        txtfrecuenciabebida.setSelectedItem("Seleccione");
        txtfrecuenciabebida2.setSelectedItem("Seleccione");
        txtfrecuenciabebida3.setSelectedItem("Seleccione");
        txtfrecuenciabebida4.setSelectedItem("Seleccione");
        txtfrecuenciabebida5.setSelectedItem("Seleccione");
        txtfrecuenciabebida7.setSelectedItem("Seleccione");
        txtfrecuenciabebida8.setSelectedItem("Seleccione");
        txtfrecuenciabebida9.setSelectedItem("Seleccione");

        txtdrogaspregun9.setText("");
        txtdrogaspregun1.setText("");
        txtdrogaspregun14.setText("");
        txtdrogaspregun15.setText("");
        txtdrogaspregun2.setText("");
        txtdrogaspregun10.setText("");
        txtdrogaspregun16.setText("");
        txtdrogaspregun11.setText("");
        txtdrogaspregun12.setText("");
        txtdrogaspregun3.setText("");
        txtdrogaspregun4.setText("");
        txtdrogaspregun5.setText("");
        txtdrogaspregun6.setText("");
        txtdrogaspregun7.setText("");
        txtdrogaspregun8.setText("");
        txtdrogaspregun10.setText("");
        txtdrogaspregun16.setText("");

        chbxmarihuana.setSelected(false);
        chbxcocaina.setSelected(false);
        chbxbazuco.setSelected(false);
        chbxlds.setSelected(false);
        chbxextasis.setSelected(false);
        chbxheroina.setSelected(false);
        chbxheroina1.setSelected(false);
        chbxheroina2.setSelected(false);
        chbxheroina3.setSelected(false);

        chbxsiembra.setSelected(false);
        cbxrecoleccion.setSelected(false);
        cbxfabricacion.setSelected(false);
        cbxtransporte.setSelected(false);
        cbxexportacion.setSelected(false);
        cbxcomercializacion.setSelected(false);
        cbxinsumos.setSelected(false);
        cbxinsumos1.setSelected(false);
        cbxinsumos2.setSelected(false);
        cbxrecoleccion1.setSelected(false);
        cbxrecoleccion2.setSelected(false);
        
        jScrollPane3.getVerticalScrollBar().setValue(0);
    }
    
    public void resultado() {
        if (ConsumoSustancias.getHaconsumido().equals("Sí")){
            jCheckBox30.setSelected(true);
            jCheckBox29.setSelected(false);
            Admisiones.setAdmCSS1("hay");
            jPanel1.setVisible(true);
            
            txtdrogaspregun9.setText(ConsumoSustancias.getExphaconsumido());
            
          if (ConsumoSustancias.getTipodroga1().equals("hay")){
            chbxmarihuana.setSelected(true);
            txtfrecuenciabebida1.setSelectedItem(ConsumoSustancias.getFrecuencia_droga1());
          }
          if (ConsumoSustancias.getTipodroga2().equals("hay")){
            chbxcocaina.setSelected(true);
            txtfrecuenciabebida.setSelectedItem(ConsumoSustancias.getFrecuencia_droga2());
          }
          if (ConsumoSustancias.getTipodroga3().equals("hay")){
            chbxbazuco.setSelected(true);
            txtfrecuenciabebida2.setSelectedItem(ConsumoSustancias.getFrecuencia_droga3());
          }
          if (ConsumoSustancias.getTipodroga4().equals("hay")){
            chbxlds.setSelected(true);
            txtfrecuenciabebida3.setSelectedItem(ConsumoSustancias.getFrecuencia_droga4());
          }
          if (ConsumoSustancias.getTipodroga5().equals("hay")){
            chbxextasis.setSelected(true);
            txtfrecuenciabebida4.setSelectedItem(ConsumoSustancias.getFrecuencia_droga5());
          }
//          if (ConsumoSustancias.getTipodroga6().equals("hay")){
//            chbxmarihuana.setSelected(true);
//            txtfrecuenciabebida6.setSelectedItem(ConsumoSustancias.getFrecuencia_droga6());
//          }
          if (ConsumoSustancias.getTipodroga7().equals("hay")){
            chbxheroina.setSelected(true);
            txtfrecuenciabebida5.setSelectedItem(ConsumoSustancias.getFrecuencia_droga7());
          }
          if (ConsumoSustancias.getTipodroga8().equals("hay")){
            chbxheroina1.setSelected(true);
            txtfrecuenciabebida7.setSelectedItem(ConsumoSustancias.getFrecuencia_droga8());
          }
          if (ConsumoSustancias.getTipodroga9().equals("hay")){
            chbxheroina2.setSelected(true);
            txtfrecuenciabebida8.setSelectedItem(ConsumoSustancias.getFrecuencia_droga9());
          }
          if (ConsumoSustancias.getTipodroga10().equals("hay")){
            chbxheroina3.setSelected(true);
            txtfrecuenciabebida9.setSelectedItem(ConsumoSustancias.getFrecuencia_droga10());
          }
            
        } else if (ConsumoSustancias.getHaconsumido().equals("No")){
            jCheckBox30.setSelected(true);
            jCheckBox29.setSelected(false);
            Admisiones.setAdmCSS1("nohay");
            jPanel1.setVisible(false);
        }
        
        if (ConsumoSustancias.getDrogaspregun1().equals("Sí")){
            
        } else if (ConsumoSustancias.getDrogaspregun1().equals("No")){
            
        }
        
        
    }

    Thinking_uh iconThinking_uh = new Thinking_uh();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        jPanel6 = new javax.swing.JPanel();
        jLabel64 = new javax.swing.JLabel();
        drogaspregun1_1 = new javax.swing.JLabel();
        drogaspregun1_2 = new javax.swing.JLabel();
        activrelanarcomundo = new javax.swing.JLabel();
        txtdrogaspregun1 = new javax.swing.JTextField();
        drogaspregun2 = new javax.swing.JLabel();
        chbxsiembra = new javax.swing.JCheckBox();
        cbxrecoleccion = new javax.swing.JCheckBox();
        cbxfabricacion = new javax.swing.JCheckBox();
        cbxtransporte = new javax.swing.JCheckBox();
        cbxexportacion = new javax.swing.JCheckBox();
        cbxcomercializacion = new javax.swing.JCheckBox();
        cbxinsumos = new javax.swing.JCheckBox();
        txtdrogaspregun2 = new javax.swing.JTextField();
        txtdrogaspregun10 = new javax.swing.JTextField();
        cbxinsumos1 = new javax.swing.JCheckBox();
        cbxinsumos2 = new javax.swing.JCheckBox();
        drogaspregun9 = new javax.swing.JLabel();
        txtdrogaspregun11 = new javax.swing.JTextField();
        drogaspregun10 = new javax.swing.JLabel();
        txtdrogaspregun12 = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        drogaspregun1_3 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        txtdrogaspregun14 = new javax.swing.JTextField();
        jLabel48 = new javax.swing.JLabel();
        txtdrogaspregun15 = new javax.swing.JTextField();
        activrelanarcomundo1 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        txtdrogaspregun16 = new javax.swing.JTextField();
        jLabel141 = new javax.swing.JLabel();
        jLabel151 = new javax.swing.JLabel();
        jLabel152 = new javax.swing.JLabel();
        jLabel153 = new javax.swing.JLabel();
        jLabel154 = new javax.swing.JLabel();
        jLabel155 = new javax.swing.JLabel();
        jLabel156 = new javax.swing.JLabel();
        jLabel164 = new javax.swing.JLabel();
        jCheckBox30 = new javax.swing.JCheckBox();
        jCheckBox29 = new javax.swing.JCheckBox();
        jCheckBox31 = new javax.swing.JCheckBox();
        jCheckBox32 = new javax.swing.JCheckBox();
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
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton7 = new javax.swing.JRadioButton();
        jRadioButton8 = new javax.swing.JRadioButton();
        jRadioButton9 = new javax.swing.JRadioButton();
        cbxrecoleccion1 = new javax.swing.JCheckBox();
        cbxrecoleccion2 = new javax.swing.JCheckBox();
        jCheckBox55 = new javax.swing.JCheckBox();
        jCheckBox56 = new javax.swing.JCheckBox();
        jLabel50 = new javax.swing.JLabel();
        txtdrogaspregun17 = new javax.swing.JTextField();
        drogaspregun11 = new javax.swing.JLabel();
        jCheckBox57 = new javax.swing.JCheckBox();
        jCheckBox58 = new javax.swing.JCheckBox();
        jPanel1 = new javax.swing.JPanel();
        chbxlds = new javax.swing.JCheckBox();
        chbxheroina = new javax.swing.JCheckBox();
        chbxheroina1 = new javax.swing.JCheckBox();
        chbxheroina2 = new javax.swing.JCheckBox();
        chbxheroina3 = new javax.swing.JCheckBox();
        jLabel66 = new javax.swing.JLabel();
        txtexpfincara1 = new javax.swing.JTextField();
        frecconsumolast7 = new javax.swing.JLabel();
        txtfrecuenciabebida7 = new javax.swing.JComboBox<>();
        frecconsumolast8 = new javax.swing.JLabel();
        txtfrecuenciabebida8 = new javax.swing.JComboBox<>();
        frecconsumolast9 = new javax.swing.JLabel();
        txtfrecuenciabebida9 = new javax.swing.JComboBox<>();
        frecconsumolast1 = new javax.swing.JLabel();
        frecconsumolast2 = new javax.swing.JLabel();
        frecconsumolast3 = new javax.swing.JLabel();
        frecconsumolast4 = new javax.swing.JLabel();
        frecconsumolast5 = new javax.swing.JLabel();
        frecconsumolast6 = new javax.swing.JLabel();
        txtfrecuenciabebida = new javax.swing.JComboBox<>();
        txtfrecuenciabebida1 = new javax.swing.JComboBox<>();
        txtfrecuenciabebida2 = new javax.swing.JComboBox<>();
        txtfrecuenciabebida3 = new javax.swing.JComboBox<>();
        txtfrecuenciabebida4 = new javax.swing.JComboBox<>();
        txtfrecuenciabebida5 = new javax.swing.JComboBox<>();
        chbxmarihuana = new javax.swing.JCheckBox();
        chbxbazuco = new javax.swing.JCheckBox();
        chbxextasis = new javax.swing.JCheckBox();
        chbxcocaina = new javax.swing.JCheckBox();
        txtdrogaspregun9 = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel158 = new javax.swing.JLabel();
        jLabel159 = new javax.swing.JLabel();
        jLabel160 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel161 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel162 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jCheckBox45 = new javax.swing.JCheckBox();
        jCheckBox46 = new javax.swing.JCheckBox();
        jCheckBox47 = new javax.swing.JCheckBox();
        jCheckBox48 = new javax.swing.JCheckBox();
        jCheckBox49 = new javax.swing.JCheckBox();
        jCheckBox50 = new javax.swing.JCheckBox();
        jCheckBox51 = new javax.swing.JCheckBox();
        jCheckBox52 = new javax.swing.JCheckBox();
        jCheckBox53 = new javax.swing.JCheckBox();
        jCheckBox54 = new javax.swing.JCheckBox();
        jCheckBox60 = new javax.swing.JCheckBox();
        jCheckBox59 = new javax.swing.JCheckBox();
        jRadioButton10 = new javax.swing.JRadioButton();
        jRadioButton11 = new javax.swing.JRadioButton();
        jRadioButton12 = new javax.swing.JRadioButton();
        jRadioButton13 = new javax.swing.JRadioButton();
        jRadioButton14 = new javax.swing.JRadioButton();
        jRadioButton15 = new javax.swing.JRadioButton();
        drogaspregun3 = new javax.swing.JLabel();
        drogaspregun4 = new javax.swing.JLabel();
        drogaspregun5 = new javax.swing.JLabel();
        drogaspregun7 = new javax.swing.JLabel();
        drogaspregun6 = new javax.swing.JLabel();
        drogaspregun8 = new javax.swing.JLabel();
        txtdrogaspregun3 = new javax.swing.JTextField();
        txtdrogaspregun4 = new javax.swing.JTextField();
        txtdrogaspregun5 = new javax.swing.JTextField();
        txtdrogaspregun6 = new javax.swing.JTextField();
        txtdrogaspregun7 = new javax.swing.JTextField();
        txtdrogaspregun8 = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(null);
        setPreferredSize(new java.awt.Dimension(975, 550));

        jScrollPane3.setBorder(null);
        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane3.setPreferredSize(new java.awt.Dimension(975, 550));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        jLabel64.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel64.setText("¿Ha consumido usted drogas ilegales?");

        drogaspregun1_1.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        drogaspregun1_1.setText("¿Ha consumido usted alguna droga ilegal en su lugar de trabajo?");

        drogaspregun1_2.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        drogaspregun1_2.setText("¿Ha consumido usted alguna droga ilegal en su horario laboral?");

        activrelanarcomundo.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        activrelanarcomundo.setText("¿Ha participado usted en actividades relacionadas con el narcotráfico?");

        txtdrogaspregun1.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtdrogaspregun1.setBorder(null);
        txtdrogaspregun1.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtdrogaspregun1CaretUpdate(evt);
            }
        });
        txtdrogaspregun1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtdrogaspregun1KeyTyped(evt);
            }
        });

        drogaspregun2.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        drogaspregun2.setText("¿Ha faltado usted a trabajar por estar bajo efectos de alguna droga ilegal?");

        chbxsiembra.setBackground(new java.awt.Color(255, 255, 255));
        chbxsiembra.setFont(new java.awt.Font("Yu Gothic UI", 0, 13)); // NOI18N
        chbxsiembra.setText("Siembra");
        chbxsiembra.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chbxsiembraItemStateChanged(evt);
            }
        });

        cbxrecoleccion.setBackground(new java.awt.Color(255, 255, 255));
        cbxrecoleccion.setFont(new java.awt.Font("Yu Gothic UI", 0, 13)); // NOI18N
        cbxrecoleccion.setText("Recolección");
        cbxrecoleccion.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxrecoleccionItemStateChanged(evt);
            }
        });

        cbxfabricacion.setBackground(new java.awt.Color(255, 255, 255));
        cbxfabricacion.setFont(new java.awt.Font("Yu Gothic UI", 0, 13)); // NOI18N
        cbxfabricacion.setText("Fabricación");
        cbxfabricacion.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxfabricacionItemStateChanged(evt);
            }
        });

        cbxtransporte.setBackground(new java.awt.Color(255, 255, 255));
        cbxtransporte.setFont(new java.awt.Font("Yu Gothic UI", 0, 13)); // NOI18N
        cbxtransporte.setText("Transporte");
        cbxtransporte.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxtransporteItemStateChanged(evt);
            }
        });

        cbxexportacion.setBackground(new java.awt.Color(255, 255, 255));
        cbxexportacion.setFont(new java.awt.Font("Yu Gothic UI", 0, 13)); // NOI18N
        cbxexportacion.setText("Exportación");
        cbxexportacion.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxexportacionItemStateChanged(evt);
            }
        });

        cbxcomercializacion.setBackground(new java.awt.Color(255, 255, 255));
        cbxcomercializacion.setFont(new java.awt.Font("Yu Gothic UI", 0, 13)); // NOI18N
        cbxcomercializacion.setText("Comercialización");
        cbxcomercializacion.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxcomercializacionItemStateChanged(evt);
            }
        });

        cbxinsumos.setBackground(new java.awt.Color(255, 255, 255));
        cbxinsumos.setFont(new java.awt.Font("Yu Gothic UI", 0, 13)); // NOI18N
        cbxinsumos.setText("Insumos");
        cbxinsumos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxinsumosItemStateChanged(evt);
            }
        });

        txtdrogaspregun2.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtdrogaspregun2.setBorder(null);
        txtdrogaspregun2.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtdrogaspregun2CaretUpdate(evt);
            }
        });
        txtdrogaspregun2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtdrogaspregun2KeyTyped(evt);
            }
        });

        txtdrogaspregun10.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtdrogaspregun10.setBorder(null);
        txtdrogaspregun10.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtdrogaspregun10CaretUpdate(evt);
            }
        });
        txtdrogaspregun10.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtdrogaspregun10KeyTyped(evt);
            }
        });

        cbxinsumos1.setBackground(new java.awt.Color(255, 255, 255));
        cbxinsumos1.setFont(new java.awt.Font("Yu Gothic UI", 0, 13)); // NOI18N
        cbxinsumos1.setText("Almacenamiento");
        cbxinsumos1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxinsumos1ItemStateChanged(evt);
            }
        });

        cbxinsumos2.setBackground(new java.awt.Color(255, 255, 255));
        cbxinsumos2.setFont(new java.awt.Font("Yu Gothic UI", 0, 13)); // NOI18N
        cbxinsumos2.setText("Recibir beneficios");
        cbxinsumos2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxinsumos2ItemStateChanged(evt);
            }
        });

        drogaspregun9.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        drogaspregun9.setText("¿Alguien de su familia ha realizado alguna actividad con drogas ilegales?");

        txtdrogaspregun11.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtdrogaspregun11.setBorder(null);
        txtdrogaspregun11.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtdrogaspregun11CaretUpdate(evt);
            }
        });
        txtdrogaspregun11.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtdrogaspregun11KeyTyped(evt);
            }
        });

        drogaspregun10.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        drogaspregun10.setText("¿Alguien de su círculo social ha realizado alguna actividad con drogas ilegales?");

        txtdrogaspregun12.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtdrogaspregun12.setBorder(null);
        txtdrogaspregun12.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtdrogaspregun12CaretUpdate(evt);
            }
        });
        txtdrogaspregun12.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtdrogaspregun12KeyTyped(evt);
            }
        });

        jLabel36.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel37.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel41.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel45.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel46.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        drogaspregun1_3.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        drogaspregun1_3.setText("¿Ha llegado usted a laborar bajo los efectos de alguna droga ilegal?");

        jLabel47.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtdrogaspregun14.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtdrogaspregun14.setBorder(null);
        txtdrogaspregun14.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtdrogaspregun14CaretUpdate(evt);
            }
        });
        txtdrogaspregun14.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtdrogaspregun14KeyTyped(evt);
            }
        });

        jLabel48.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtdrogaspregun15.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtdrogaspregun15.setBorder(null);
        txtdrogaspregun15.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtdrogaspregun15CaretUpdate(evt);
            }
        });
        txtdrogaspregun15.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtdrogaspregun15KeyTyped(evt);
            }
        });

        activrelanarcomundo1.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        activrelanarcomundo1.setText("¿Ha estado usted relacionado con personas involucradas en actos de narcotráfico o lavado de activos?");

        jLabel49.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtdrogaspregun16.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtdrogaspregun16.setBorder(null);
        txtdrogaspregun16.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtdrogaspregun16CaretUpdate(evt);
            }
        });
        txtdrogaspregun16.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtdrogaspregun16KeyTyped(evt);
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

        cbxrecoleccion1.setBackground(new java.awt.Color(255, 255, 255));
        cbxrecoleccion1.setFont(new java.awt.Font("Yu Gothic UI", 0, 13)); // NOI18N
        cbxrecoleccion1.setText("Procesamiento");
        cbxrecoleccion1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxrecoleccion1ItemStateChanged(evt);
            }
        });

        cbxrecoleccion2.setBackground(new java.awt.Color(255, 255, 255));
        cbxrecoleccion2.setFont(new java.awt.Font("Yu Gothic UI", 0, 13)); // NOI18N
        cbxrecoleccion2.setText("Estudio de suelo para cultivar la droga");
        cbxrecoleccion2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxrecoleccion2ItemStateChanged(evt);
            }
        });

        jCheckBox55.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox55.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jCheckBox55.setText("Sí");
        jCheckBox55.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox55ItemStateChanged(evt);
            }
        });

        jCheckBox56.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox56.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jCheckBox56.setText("No");
        jCheckBox56.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox56ItemStateChanged(evt);
            }
        });

        jLabel50.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtdrogaspregun17.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtdrogaspregun17.setBorder(null);
        txtdrogaspregun17.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtdrogaspregun17CaretUpdate(evt);
            }
        });
        txtdrogaspregun17.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtdrogaspregun17KeyTyped(evt);
            }
        });

        drogaspregun11.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        drogaspregun11.setText("¿Existe alguna admisión relevante en esta categoría?");

        jCheckBox57.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox57.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jCheckBox57.setText("Sí");
        jCheckBox57.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox57ItemStateChanged(evt);
            }
        });

        jCheckBox58.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox58.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jCheckBox58.setText("No");
        jCheckBox58.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox58ItemStateChanged(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        chbxlds.setBackground(new java.awt.Color(255, 255, 255));
        chbxlds.setFont(new java.awt.Font("Yu Gothic UI", 0, 13)); // NOI18N
        chbxlds.setText("LDS (Trips, ácidos)");
        chbxlds.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chbxldsItemStateChanged(evt);
            }
        });

        chbxheroina.setBackground(new java.awt.Color(255, 255, 255));
        chbxheroina.setFont(new java.awt.Font("Yu Gothic UI", 0, 13)); // NOI18N
        chbxheroina.setText("Heroína");
        chbxheroina.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chbxheroinaItemStateChanged(evt);
            }
        });

        chbxheroina1.setBackground(new java.awt.Color(255, 255, 255));
        chbxheroina1.setFont(new java.awt.Font("Yu Gothic UI", 0, 13)); // NOI18N
        chbxheroina1.setText("Popper");
        chbxheroina1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chbxheroina1ItemStateChanged(evt);
            }
        });

        chbxheroina2.setBackground(new java.awt.Color(255, 255, 255));
        chbxheroina2.setFont(new java.awt.Font("Yu Gothic UI", 0, 13)); // NOI18N
        chbxheroina2.setText("Dick");
        chbxheroina2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chbxheroina2ItemStateChanged(evt);
            }
        });

        chbxheroina3.setBackground(new java.awt.Color(255, 255, 255));
        chbxheroina3.setFont(new java.awt.Font("Yu Gothic UI", 0, 13)); // NOI18N
        chbxheroina3.setText("Otro");
        chbxheroina3.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chbxheroina3ItemStateChanged(evt);
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

        frecconsumolast7.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        frecconsumolast7.setText("Frecuencia de consumo:");
        frecconsumolast7.setPreferredSize(new java.awt.Dimension(175, 25));

        txtfrecuenciabebida7.setFont(new java.awt.Font("Segoe UI Emoji", 0, 13)); // NOI18N
        txtfrecuenciabebida7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Diario", "Semanal", "Mensual", "Trimestral", "Semestral", "Anual", "Único consumo" }));
        txtfrecuenciabebida7.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                txtfrecuenciabebida7ItemStateChanged(evt);
            }
        });

        frecconsumolast8.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        frecconsumolast8.setText("Frecuencia de consumo:");
        frecconsumolast8.setPreferredSize(new java.awt.Dimension(175, 25));

        txtfrecuenciabebida8.setFont(new java.awt.Font("Segoe UI Emoji", 0, 13)); // NOI18N
        txtfrecuenciabebida8.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Diario", "Semanal", "Mensual", "Trimestral", "Semestral", "Anual", "Único consumo" }));
        txtfrecuenciabebida8.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                txtfrecuenciabebida8ItemStateChanged(evt);
            }
        });
        txtfrecuenciabebida8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfrecuenciabebida8ActionPerformed(evt);
            }
        });

        frecconsumolast9.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        frecconsumolast9.setText("Frecuencia de consumo:");
        frecconsumolast9.setPreferredSize(new java.awt.Dimension(175, 25));

        txtfrecuenciabebida9.setFont(new java.awt.Font("Segoe UI Emoji", 0, 13)); // NOI18N
        txtfrecuenciabebida9.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Diario", "Semanal", "Mensual", "Trimestral", "Semestral", "Anual", "Único consumo" }));
        txtfrecuenciabebida9.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                txtfrecuenciabebida9ItemStateChanged(evt);
            }
        });

        frecconsumolast1.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        frecconsumolast1.setText("Frecuencia de consumo:");
        frecconsumolast1.setPreferredSize(new java.awt.Dimension(175, 25));

        frecconsumolast2.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        frecconsumolast2.setText("Frecuencia de consumo:");
        frecconsumolast2.setPreferredSize(new java.awt.Dimension(175, 25));

        frecconsumolast3.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        frecconsumolast3.setText("Frecuencia de consumo:");
        frecconsumolast3.setPreferredSize(new java.awt.Dimension(175, 25));

        frecconsumolast4.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        frecconsumolast4.setText("Frecuencia de consumo:");
        frecconsumolast4.setMaximumSize(new java.awt.Dimension(175, 25));
        frecconsumolast4.setMinimumSize(new java.awt.Dimension(175, 25));
        frecconsumolast4.setPreferredSize(new java.awt.Dimension(175, 25));

        frecconsumolast5.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        frecconsumolast5.setText("Frecuencia de consumo:");
        frecconsumolast5.setPreferredSize(new java.awt.Dimension(175, 25));

        frecconsumolast6.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        frecconsumolast6.setText("Frecuencia de consumo:");
        frecconsumolast6.setPreferredSize(new java.awt.Dimension(175, 25));

        txtfrecuenciabebida.setFont(new java.awt.Font("Segoe UI Emoji", 0, 13)); // NOI18N
        txtfrecuenciabebida.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Diario", "Semanal", "Mensual", "Trimestral", "Semestral", "Anual", "Único consumo" }));
        txtfrecuenciabebida.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                txtfrecuenciabebidaItemStateChanged(evt);
            }
        });

        txtfrecuenciabebida1.setFont(new java.awt.Font("Segoe UI Emoji", 0, 13)); // NOI18N
        txtfrecuenciabebida1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Diario", "Semanal", "Mensual", "Trimestral", "Semestral", "Anual", "Único consumo" }));
        txtfrecuenciabebida1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                txtfrecuenciabebida1ItemStateChanged(evt);
            }
        });

        txtfrecuenciabebida2.setFont(new java.awt.Font("Segoe UI Emoji", 0, 13)); // NOI18N
        txtfrecuenciabebida2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Diario", "Semanal", "Mensual", "Trimestral", "Semestral", "Anual", "Único consumo" }));
        txtfrecuenciabebida2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                txtfrecuenciabebida2ItemStateChanged(evt);
            }
        });

        txtfrecuenciabebida3.setFont(new java.awt.Font("Segoe UI Emoji", 0, 13)); // NOI18N
        txtfrecuenciabebida3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Diario", "Semanal", "Mensual", "Trimestral", "Semestral", "Anual", "Único consumo" }));
        txtfrecuenciabebida3.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                txtfrecuenciabebida3ItemStateChanged(evt);
            }
        });

        txtfrecuenciabebida4.setFont(new java.awt.Font("Segoe UI Emoji", 0, 13)); // NOI18N
        txtfrecuenciabebida4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Diario", "Semanal", "Mensual", "Trimestral", "Semestral", "Anual", "Único consumo" }));
        txtfrecuenciabebida4.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                txtfrecuenciabebida4ItemStateChanged(evt);
            }
        });

        txtfrecuenciabebida5.setFont(new java.awt.Font("Segoe UI Emoji", 0, 13)); // NOI18N
        txtfrecuenciabebida5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Diario", "Semanal", "Mensual", "Trimestral", "Semestral", "Anual", "Único consumo" }));
        txtfrecuenciabebida5.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                txtfrecuenciabebida5ItemStateChanged(evt);
            }
        });

        chbxmarihuana.setBackground(new java.awt.Color(255, 255, 255));
        chbxmarihuana.setFont(new java.awt.Font("Yu Gothic UI", 0, 13)); // NOI18N
        chbxmarihuana.setText("Marihuana");
        chbxmarihuana.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chbxmarihuanaItemStateChanged(evt);
            }
        });

        chbxbazuco.setBackground(new java.awt.Color(255, 255, 255));
        chbxbazuco.setFont(new java.awt.Font("Yu Gothic UI", 0, 13)); // NOI18N
        chbxbazuco.setText("Bazuco");
        chbxbazuco.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chbxbazucoItemStateChanged(evt);
            }
        });

        chbxextasis.setBackground(new java.awt.Color(255, 255, 255));
        chbxextasis.setFont(new java.awt.Font("Yu Gothic UI", 0, 13)); // NOI18N
        chbxextasis.setText("Éxtasis");
        chbxextasis.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chbxextasisItemStateChanged(evt);
            }
        });

        chbxcocaina.setBackground(new java.awt.Color(255, 255, 255));
        chbxcocaina.setFont(new java.awt.Font("Yu Gothic UI", 0, 13)); // NOI18N
        chbxcocaina.setText("Cocaína (perico, crack, dama blanca, nieve)");
        chbxcocaina.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chbxcocainaItemStateChanged(evt);
            }
        });

        txtdrogaspregun9.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtdrogaspregun9.setBorder(null);
        txtdrogaspregun9.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtdrogaspregun9CaretUpdate(evt);
            }
        });
        txtdrogaspregun9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtdrogaspregun9KeyTyped(evt);
            }
        });

        jLabel32.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(chbxmarihuana, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(101, 101, 101)
                                .addComponent(frecconsumolast2, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(chbxheroina1, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(101, 101, 101)
                                .addComponent(frecconsumolast7, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(chbxheroina2, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(101, 101, 101)
                                .addComponent(frecconsumolast8, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(chbxheroina3)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel66, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtexpfincara1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(101, 101, 101)
                                .addComponent(frecconsumolast9, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(chbxextasis, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(101, 101, 101)
                                .addComponent(frecconsumolast3, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(chbxheroina, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(101, 101, 101)
                                .addComponent(frecconsumolast1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(chbxcocaina, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
                                        .addComponent(chbxbazuco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(chbxlds, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(101, 101, 101)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(frecconsumolast6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(frecconsumolast5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(frecconsumolast4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(59, 59, 59)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtfrecuenciabebida2, 0, 281, Short.MAX_VALUE)
                            .addComponent(txtfrecuenciabebida1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtfrecuenciabebida, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtfrecuenciabebida3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtfrecuenciabebida4, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtfrecuenciabebida5, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtfrecuenciabebida7, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtfrecuenciabebida8, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtfrecuenciabebida9, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtdrogaspregun9, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(30, 30, 30))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chbxmarihuana)
                    .addComponent(frecconsumolast2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtfrecuenciabebida1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtfrecuenciabebida, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(frecconsumolast6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chbxcocaina))
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chbxbazuco)
                    .addComponent(frecconsumolast5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtfrecuenciabebida2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(chbxlds)
                            .addComponent(txtfrecuenciabebida3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(frecconsumolast4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chbxextasis)
                    .addComponent(frecconsumolast3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtfrecuenciabebida4, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chbxheroina)
                    .addComponent(frecconsumolast1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtfrecuenciabebida5, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chbxheroina1)
                    .addComponent(frecconsumolast7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtfrecuenciabebida7, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(frecconsumolast8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(chbxheroina2)
                        .addComponent(txtfrecuenciabebida8, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(chbxheroina3)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtfrecuenciabebida9, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(frecconsumolast9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(txtexpfincara1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel66, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15)
                .addComponent(txtdrogaspregun9, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel38.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel39.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel40.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel42.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel43.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel44.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

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

        jCheckBox53.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox53.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jCheckBox53.setText("Sí");
        jCheckBox53.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox53ItemStateChanged(evt);
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

        jCheckBox60.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox60.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jCheckBox60.setText("Sí");
        jCheckBox60.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox60ItemStateChanged(evt);
            }
        });

        jCheckBox59.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox59.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jCheckBox59.setText("No");
        jCheckBox59.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox59ItemStateChanged(evt);
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

        jRadioButton11.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton11.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jRadioButton11.setText("A");
        jRadioButton11.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButton11ItemStateChanged(evt);
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

        jRadioButton13.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton13.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jRadioButton13.setText("A");
        jRadioButton13.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButton13ItemStateChanged(evt);
            }
        });

        jRadioButton14.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton14.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jRadioButton14.setText("A");
        jRadioButton14.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButton14ItemStateChanged(evt);
            }
        });

        jRadioButton15.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton15.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jRadioButton15.setText("A");
        jRadioButton15.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButton15ItemStateChanged(evt);
            }
        });

        drogaspregun3.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        drogaspregun3.setText("¿Ha consumido usted drogas ilegales antes de ingresar a su turno laboral en Teleperformance?");

        drogaspregun4.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        drogaspregun4.setText("¿Ha consumido usted alguna droga ilegal en break u hora de almuerzo?");

        drogaspregun5.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        drogaspregun5.setText("¿Ha vendido usted alguna droga ilegal a sus compañeros de trabajo en Teleperformance?");

        drogaspregun7.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        drogaspregun7.setText("¿Ha visto usted a alguien de Teleperformance vendiendo alguna droga ilegal?");

        drogaspregun6.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        drogaspregun6.setText("¿Le ha guardado usted alguna droga ilegal a sus compañeros de trabajo en Teleperformance?");

        drogaspregun8.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        drogaspregun8.setText("¿Ha visto usted a alguien de Teleperformance realizando alguna actividad con drogas ilegales?");

        txtdrogaspregun3.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtdrogaspregun3.setBorder(null);
        txtdrogaspregun3.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtdrogaspregun3CaretUpdate(evt);
            }
        });

        txtdrogaspregun4.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtdrogaspregun4.setBorder(null);
        txtdrogaspregun4.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtdrogaspregun4CaretUpdate(evt);
            }
        });

        txtdrogaspregun5.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtdrogaspregun5.setBorder(null);
        txtdrogaspregun5.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtdrogaspregun5CaretUpdate(evt);
            }
        });

        txtdrogaspregun6.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtdrogaspregun6.setBorder(null);
        txtdrogaspregun6.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtdrogaspregun6CaretUpdate(evt);
            }
        });

        txtdrogaspregun7.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtdrogaspregun7.setBorder(null);
        txtdrogaspregun7.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtdrogaspregun7CaretUpdate(evt);
            }
        });

        txtdrogaspregun8.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtdrogaspregun8.setBorder(null);
        txtdrogaspregun8.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtdrogaspregun8CaretUpdate(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(drogaspregun8)
                        .addGap(198, 198, 198)
                        .addComponent(jCheckBox53, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox54, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtdrogaspregun8, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel162, javax.swing.GroupLayout.PREFERRED_SIZE, 654, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel161, javax.swing.GroupLayout.PREFERRED_SIZE, 654, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel160, javax.swing.GroupLayout.PREFERRED_SIZE, 654, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel159, javax.swing.GroupLayout.PREFERRED_SIZE, 654, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel158, javax.swing.GroupLayout.PREFERRED_SIZE, 654, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(drogaspregun6)
                        .addGap(200, 200, 200)
                        .addComponent(jCheckBox49, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox50, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtdrogaspregun6, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(drogaspregun7, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(280, 280, 280)
                        .addComponent(jCheckBox51, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox52, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(drogaspregun5)
                        .addGap(226, 226, 226)
                        .addComponent(jCheckBox47, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox48, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtdrogaspregun5, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(drogaspregun3)
                        .addGap(193, 193, 193)
                        .addComponent(jCheckBox60, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox59, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtdrogaspregun3, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(drogaspregun4)
                        .addGap(332, 332, 332)
                        .addComponent(jCheckBox45, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox46, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtdrogaspregun4, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtdrogaspregun7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jCheckBox60, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jCheckBox59, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(drogaspregun3)
                        .addComponent(jRadioButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(7, 7, 7)
                .addComponent(txtdrogaspregun3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel158, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jCheckBox45, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jCheckBox46, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jRadioButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(drogaspregun4))
                .addGap(7, 7, 7)
                .addComponent(txtdrogaspregun4, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel159, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jCheckBox47, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jCheckBox48, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jRadioButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(drogaspregun5))
                .addGap(7, 7, 7)
                .addComponent(txtdrogaspregun5, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel160, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jCheckBox49, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jCheckBox50, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jRadioButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(drogaspregun6))
                .addGap(7, 7, 7)
                .addComponent(txtdrogaspregun6, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel161, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox51, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox52, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(drogaspregun7))
                .addGap(7, 7, 7)
                .addComponent(txtdrogaspregun7, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel162, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jCheckBox53, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jCheckBox54, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jRadioButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(drogaspregun8))
                .addGap(7, 7, 7)
                .addComponent(txtdrogaspregun8, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel64)
                        .addGap(538, 538, 538)
                        .addComponent(jCheckBox30, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox29, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(drogaspregun11)
                        .addGap(455, 455, 455)
                        .addComponent(jCheckBox57, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox58, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtdrogaspregun17, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(activrelanarcomundo)
                        .addGap(346, 346, 346)
                        .addComponent(jCheckBox39, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox40, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cbxrecoleccion2)
                    .addComponent(jLabel164, javax.swing.GroupLayout.PREFERRED_SIZE, 654, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel153, javax.swing.GroupLayout.PREFERRED_SIZE, 654, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel155, javax.swing.GroupLayout.PREFERRED_SIZE, 654, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel156, javax.swing.GroupLayout.PREFERRED_SIZE, 654, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel154, javax.swing.GroupLayout.PREFERRED_SIZE, 654, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel152, javax.swing.GroupLayout.PREFERRED_SIZE, 654, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel151, javax.swing.GroupLayout.PREFERRED_SIZE, 654, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel141, javax.swing.GroupLayout.PREFERRED_SIZE, 654, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtdrogaspregun10, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(drogaspregun1_1)
                        .addGap(374, 374, 374)
                        .addComponent(jCheckBox33, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox34, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(txtdrogaspregun14, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(drogaspregun1_3)
                        .addGap(360, 360, 360)
                        .addComponent(jCheckBox35, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox36, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(txtdrogaspregun15, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(drogaspregun10)
                        .addGap(295, 295, 295)
                        .addComponent(jCheckBox43, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox44, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtdrogaspregun12, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chbxsiembra)
                            .addComponent(cbxrecoleccion))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbxfabricacion)
                            .addComponent(cbxtransporte))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbxexportacion)
                            .addComponent(cbxcomercializacion))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbxinsumos)
                            .addComponent(cbxinsumos1))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbxinsumos2)
                            .addComponent(cbxrecoleccion1)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(drogaspregun9)
                        .addGap(332, 332, 332)
                        .addComponent(jCheckBox41, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox42, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtdrogaspregun11, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(drogaspregun2)
                        .addGap(320, 320, 320)
                        .addComponent(jCheckBox37, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox38, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtdrogaspregun2, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(drogaspregun1_2)
                        .addGap(382, 382, 382)
                        .addComponent(jCheckBox31, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox32, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtdrogaspregun1, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel6Layout.createSequentialGroup()
                            .addComponent(activrelanarcomundo1)
                            .addGap(148, 148, 148)
                            .addComponent(jCheckBox55, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jCheckBox56, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jRadioButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtdrogaspregun16, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel49, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel64)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox30, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBox29, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1)))
                .addGap(25, 25, 25)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jCheckBox31, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jCheckBox32, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jRadioButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(drogaspregun1_2))
                .addGap(7, 7, 7)
                .addComponent(txtdrogaspregun1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel141, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jCheckBox33, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jCheckBox34, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jRadioButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(drogaspregun1_1))
                .addGap(7, 7, 7)
                .addComponent(txtdrogaspregun14, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel153, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jCheckBox35, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jCheckBox36, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jRadioButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(drogaspregun1_3))
                .addGap(7, 7, 7)
                .addComponent(txtdrogaspregun15, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel151, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jCheckBox37, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jCheckBox38, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jRadioButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(drogaspregun2))
                .addGap(7, 7, 7)
                .addComponent(txtdrogaspregun2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel155, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jCheckBox39, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jCheckBox40, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(activrelanarcomundo))
                .addGap(15, 15, 15)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chbxsiembra)
                    .addComponent(cbxfabricacion)
                    .addComponent(cbxexportacion)
                    .addComponent(cbxinsumos)
                    .addComponent(cbxinsumos2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxrecoleccion)
                    .addComponent(cbxtransporte)
                    .addComponent(cbxcomercializacion)
                    .addComponent(cbxinsumos1)
                    .addComponent(cbxrecoleccion1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbxrecoleccion2)
                .addGap(0, 0, 0)
                .addComponent(jLabel164, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txtdrogaspregun10, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel152, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(activrelanarcomundo1)
                    .addComponent(jRadioButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox56, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox55, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addComponent(txtdrogaspregun16, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel154, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jCheckBox41, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jCheckBox42, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jRadioButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(drogaspregun9))
                .addGap(7, 7, 7)
                .addComponent(txtdrogaspregun11, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel156, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jCheckBox43, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jCheckBox44, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jRadioButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(drogaspregun10))
                .addGap(7, 7, 7)
                .addComponent(txtdrogaspregun12, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jCheckBox57, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jCheckBox58, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(drogaspregun11))
                .addGap(7, 7, 7)
                .addComponent(txtdrogaspregun17, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        jScrollPane3.setViewportView(jPanel6);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 975, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 550, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtdrogaspregun9CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtdrogaspregun9CaretUpdate
        ConsumoSustancias.setExphaconsumido(txtdrogaspregun9.getText());
    }//GEN-LAST:event_txtdrogaspregun9CaretUpdate

    private void txtdrogaspregun1CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtdrogaspregun1CaretUpdate
        ConsumoSustancias.setExpdrogaspregun1(txtdrogaspregun1.getText());
    }//GEN-LAST:event_txtdrogaspregun1CaretUpdate

    private void txtdrogaspregun10CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtdrogaspregun10CaretUpdate
        ConsumoSustancias.setExphaparticipado(txtdrogaspregun10.getText());
    }//GEN-LAST:event_txtdrogaspregun10CaretUpdate

    private void txtdrogaspregun2CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtdrogaspregun2CaretUpdate
        ConsumoSustancias.setExpdrogaspregun4(txtdrogaspregun2.getText());
    }//GEN-LAST:event_txtdrogaspregun2CaretUpdate

    private void txtfrecuenciabebidaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_txtfrecuenciabebidaItemStateChanged
        ConsumoSustancias.setFrecuencia_droga2(txtfrecuenciabebida.getSelectedItem().toString());
    }//GEN-LAST:event_txtfrecuenciabebidaItemStateChanged

    private void txtfrecuenciabebida1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_txtfrecuenciabebida1ItemStateChanged
        ConsumoSustancias.setFrecuencia_droga1(txtfrecuenciabebida1.getSelectedItem().toString());
    }//GEN-LAST:event_txtfrecuenciabebida1ItemStateChanged

    private void txtfrecuenciabebida2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_txtfrecuenciabebida2ItemStateChanged
        ConsumoSustancias.setFrecuencia_droga3(txtfrecuenciabebida2.getSelectedItem().toString());
    }//GEN-LAST:event_txtfrecuenciabebida2ItemStateChanged

    private void txtfrecuenciabebida3ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_txtfrecuenciabebida3ItemStateChanged
        ConsumoSustancias.setFrecuencia_droga4(txtfrecuenciabebida3.getSelectedItem().toString());
    }//GEN-LAST:event_txtfrecuenciabebida3ItemStateChanged

    private void txtfrecuenciabebida4ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_txtfrecuenciabebida4ItemStateChanged
        ConsumoSustancias.setFrecuencia_droga5(txtfrecuenciabebida4.getSelectedItem().toString());
    }//GEN-LAST:event_txtfrecuenciabebida4ItemStateChanged

    private void txtfrecuenciabebida5ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_txtfrecuenciabebida5ItemStateChanged
        ConsumoSustancias.setFrecuencia_droga6(txtfrecuenciabebida5.getSelectedItem().toString());
    }//GEN-LAST:event_txtfrecuenciabebida5ItemStateChanged

    private void chbxmarihuanaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chbxmarihuanaItemStateChanged
        if (chbxmarihuana.isSelected()) {
            frecconsumolast2.setVisible(true);
            txtfrecuenciabebida1.setVisible(true);
            ConsumoSustancias.setTipodroga1("hay");
        } else if (!chbxmarihuana.isSelected()) {
            ConsumoSustancias.setTipodroga1("nohay");
            frecconsumolast2.setVisible(false);
            txtfrecuenciabebida1.setVisible(false);
        }
    }//GEN-LAST:event_chbxmarihuanaItemStateChanged

    private void chbxcocainaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chbxcocainaItemStateChanged
        if (chbxcocaina.isSelected()) {
            ConsumoSustancias.setTipodroga2("hay");
            frecconsumolast6.setVisible(true);
            txtfrecuenciabebida.setVisible(true);
        } else if (!chbxcocaina.isSelected()) {
            ConsumoSustancias.setTipodroga2("nohay");
            frecconsumolast6.setVisible(false);
            txtfrecuenciabebida.setVisible(false);
        }
    }//GEN-LAST:event_chbxcocainaItemStateChanged

    private void chbxbazucoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chbxbazucoItemStateChanged
        if (chbxbazuco.isSelected()) {
            ConsumoSustancias.setTipodroga3("hay");
            frecconsumolast5.setVisible(true);
            txtfrecuenciabebida2.setVisible(true);
        } else if (!chbxbazuco.isSelected()) {
            ConsumoSustancias.setTipodroga3("nohay");
            frecconsumolast5.setVisible(false);
            txtfrecuenciabebida2.setVisible(false);
        }
    }//GEN-LAST:event_chbxbazucoItemStateChanged

    private void chbxldsItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chbxldsItemStateChanged
        if (chbxlds.isSelected()) {
            ConsumoSustancias.setTipodroga4("hay");
            frecconsumolast4.setVisible(true);
            txtfrecuenciabebida3.setVisible(true);
        } else if (!chbxlds.isSelected()) {
            ConsumoSustancias.setTipodroga4("nohay");
            frecconsumolast4.setVisible(false);
            txtfrecuenciabebida3.setVisible(false);
        }
    }//GEN-LAST:event_chbxldsItemStateChanged

    private void chbxextasisItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chbxextasisItemStateChanged
        if (chbxextasis.isSelected()) {
            ConsumoSustancias.setTipodroga5("hay");
            frecconsumolast3.setVisible(true);
            txtfrecuenciabebida4.setVisible(true);
        } else if (!chbxextasis.isSelected()) {
            ConsumoSustancias.setTipodroga5("nohay");
            frecconsumolast3.setVisible(false);
            txtfrecuenciabebida4.setVisible(false);
        }
    }//GEN-LAST:event_chbxextasisItemStateChanged

    private void chbxheroinaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chbxheroinaItemStateChanged
        if (chbxheroina.isSelected()) {
            ConsumoSustancias.setTipodroga6("hay");
            frecconsumolast1.setVisible(true);
            txtfrecuenciabebida5.setVisible(true);
        } else if (!chbxheroina.isSelected()) {
            ConsumoSustancias.setTipodroga6("nohay");
            frecconsumolast1.setVisible(false);
            txtfrecuenciabebida5.setVisible(false);
        }
    }//GEN-LAST:event_chbxheroinaItemStateChanged

    private void txtdrogaspregun11CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtdrogaspregun11CaretUpdate
        ConsumoSustancias.setExpdrogaspregun6(txtdrogaspregun11.getText());
    }//GEN-LAST:event_txtdrogaspregun11CaretUpdate

    private void txtdrogaspregun12CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtdrogaspregun12CaretUpdate
        ConsumoSustancias.setExpdrogaspregun7(txtdrogaspregun12.getText());
    }//GEN-LAST:event_txtdrogaspregun12CaretUpdate

    private void txtdrogaspregun14CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtdrogaspregun14CaretUpdate
        ConsumoSustancias.setExpdrogaspregun2(txtdrogaspregun14.getText());
    }//GEN-LAST:event_txtdrogaspregun14CaretUpdate

    private void txtdrogaspregun15CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtdrogaspregun15CaretUpdate
        ConsumoSustancias.setExpdrogaspregun3(txtdrogaspregun15.getText());
    }//GEN-LAST:event_txtdrogaspregun15CaretUpdate

    private void txtdrogaspregun16CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtdrogaspregun16CaretUpdate
        ConsumoSustancias.setExpdrogaspregun5(txtdrogaspregun16.getText());
    }//GEN-LAST:event_txtdrogaspregun16CaretUpdate

    private void chbxsiembraItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chbxsiembraItemStateChanged
        if (chbxsiembra.isSelected()) {
            ConsumoSustancias.setTi_partici1("hay");
        } else if (!chbxsiembra.isSelected()) {
            ConsumoSustancias.setTi_partici1("nohay");
        }
    }//GEN-LAST:event_chbxsiembraItemStateChanged

    private void cbxrecoleccionItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxrecoleccionItemStateChanged
        if (cbxrecoleccion.isSelected()) {
            ConsumoSustancias.setTi_partici2("hay");
        } else if (!cbxrecoleccion.isSelected()) {
            ConsumoSustancias.setTi_partici2("nohay");
        }
    }//GEN-LAST:event_cbxrecoleccionItemStateChanged

    private void cbxfabricacionItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxfabricacionItemStateChanged
        if (cbxfabricacion.isSelected()) {
            ConsumoSustancias.setTi_partici3("hay");
        } else if (!cbxfabricacion.isSelected()) {
            ConsumoSustancias.setTi_partici3("nohay");
        }
    }//GEN-LAST:event_cbxfabricacionItemStateChanged

    private void cbxtransporteItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxtransporteItemStateChanged
        if (cbxtransporte.isSelected()) {
            ConsumoSustancias.setTi_partici4("hay");
        } else if (!cbxtransporte.isSelected()) {
            ConsumoSustancias.setTi_partici4("nohay");
        }
    }//GEN-LAST:event_cbxtransporteItemStateChanged

    private void cbxexportacionItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxexportacionItemStateChanged
        if (cbxexportacion.isSelected()) {
            ConsumoSustancias.setTi_partici5("hay");
        } else if (!cbxexportacion.isSelected()) {
            ConsumoSustancias.setTi_partici5("nohay");
        }
    }//GEN-LAST:event_cbxexportacionItemStateChanged

    private void cbxcomercializacionItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxcomercializacionItemStateChanged
        if (cbxcomercializacion.isSelected()) {
            ConsumoSustancias.setTi_partici6("hay");
        } else if (!cbxcomercializacion.isSelected()) {
            ConsumoSustancias.setTi_partici6("nohay");
        }
    }//GEN-LAST:event_cbxcomercializacionItemStateChanged

    private void cbxinsumosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxinsumosItemStateChanged
        if (cbxinsumos.isSelected()) {
            ConsumoSustancias.setTi_partici7("hay");
        } else if (!cbxinsumos.isSelected()) {
            ConsumoSustancias.setTi_partici7("nohay");
        }
    }//GEN-LAST:event_cbxinsumosItemStateChanged

    private void cbxinsumos1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxinsumos1ItemStateChanged
        if (cbxinsumos1.isSelected()) {
            ConsumoSustancias.setTi_partici8("hay");
        } else if (!cbxinsumos1.isSelected()) {
            ConsumoSustancias.setTi_partici8("nohay");
        }
    }//GEN-LAST:event_cbxinsumos1ItemStateChanged

    private void cbxinsumos2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxinsumos2ItemStateChanged
        if (cbxinsumos2.isSelected()) {
            ConsumoSustancias.setTi_partici9("hay");
        } else if (!cbxinsumos2.isSelected()) {
            ConsumoSustancias.setTi_partici9("nohay");
        }
    }//GEN-LAST:event_cbxinsumos2ItemStateChanged

    private void jCheckBox30ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox30ItemStateChanged
        if (jCheckBox30.isSelected()) {
            jPanel1.setVisible(true);
            jCheckBox29.setSelected(false);
            ConsumoSustancias.setHaconsumido("Sí");
            Admisiones.setAdmCSS1("hay");
            txtdrogaspregun9.setVisible(true);
            chbxmarihuana.setVisible(true);
            chbxcocaina.setVisible(true);
            chbxbazuco.setVisible(true);
            chbxlds.setVisible(true);
            chbxextasis.setVisible(true);
            chbxheroina.setVisible(true);
            chbxheroina1.setVisible(true);
            chbxheroina2.setVisible(true);
            chbxheroina3.setVisible(true);
            jLabel32.setVisible(true);
        } else {
            ConsumoSustancias.setHaconsumido("-");
            Admisiones.setAdmCSS1("nohay");
            jPanel1.setVisible(false);
            txtdrogaspregun9.setVisible(false);
            chbxmarihuana.setVisible(false);
            chbxcocaina.setVisible(false);
            chbxbazuco.setVisible(false);
            chbxlds.setVisible(false);
            chbxextasis.setVisible(false);
            chbxheroina.setVisible(false);
            chbxheroina1.setVisible(false);
            chbxheroina2.setVisible(false);
            chbxheroina3.setVisible(false);
            jLabel32.setVisible(false);
        }
    }//GEN-LAST:event_jCheckBox30ItemStateChanged

    private void jCheckBox29ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox29ItemStateChanged
        if (jCheckBox29.isSelected()) {
            jCheckBox30.setSelected(false);
            Admisiones.setAdmCSS1("nohay");
            ConsumoSustancias.setHaconsumido("No");
            jPanel1.setVisible(false);

            txtdrogaspregun9.setVisible(false);
            chbxmarihuana.setVisible(false);
            chbxcocaina.setVisible(false);
            chbxbazuco.setVisible(false);
            chbxlds.setVisible(false);
            chbxextasis.setVisible(false);
            chbxheroina.setVisible(false);
            jLabel32.setVisible(false);

            ConsumoSustancias.setDrogaspregun1("No");
            ConsumoSustancias.setDrogaspregun2("No");
            ConsumoSustancias.setDrogaspregun3("No");
            ConsumoSustancias.setDrogaspregun4("No");
            ConsumoSustancias.setHaparticipado("No");
            ConsumoSustancias.setDrogaspregun5("No");
            ConsumoSustancias.setDrogaspregun6("No");
            ConsumoSustancias.setDrogaspregun7("No");
            ConsumoSustancias.setDrogaspregun8("No");
            ConsumoSustancias.setDrogaspregun9("No");
            ConsumoSustancias.setDrogaspregun10("No");
            ConsumoSustancias.setDrogaspregun11("No");
            ConsumoSustancias.setDrogaspregun12("No");
            ConsumoSustancias.setDrogaspregun13("No");

            jCheckBox32.setSelected(true);
            jCheckBox34.setSelected(true);
            jCheckBox36.setSelected(true);
            jCheckBox38.setSelected(true);
            jCheckBox40.setSelected(true);
            jCheckBox42.setSelected(true);
            jCheckBox56.setSelected(true);
            jCheckBox44.setSelected(true);
            jCheckBox59.setSelected(true);
            jCheckBox46.setSelected(true);
            jCheckBox48.setSelected(true);
            jCheckBox50.setSelected(true);
            jCheckBox52.setSelected(true);
            jCheckBox54.setSelected(true);

        } else {
            ConsumoSustancias.setHaconsumido("-");
            Admisiones.setAdmCSS1("nohay");
            jPanel1.setVisible(false);
            txtdrogaspregun9.setVisible(false);
            chbxmarihuana.setVisible(false);
            chbxcocaina.setVisible(false);
            chbxbazuco.setVisible(false);
            chbxlds.setVisible(false);
            chbxextasis.setVisible(false);
            chbxheroina.setVisible(false);
            jLabel32.setVisible(false);
        }
    }//GEN-LAST:event_jCheckBox29ItemStateChanged

    private void jCheckBox31ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox31ItemStateChanged
        if (jCheckBox31.isSelected()) {
            jCheckBox32.setSelected(false);
            ConsumoSustancias.setDrogaspregun1("Sí");
            txtdrogaspregun1.setVisible(true);
            jLabel37.setVisible(true);
            jRadioButton2.setVisible(true);
        } else {
            ConsumoSustancias.setDrogaspregun1("-");
            txtdrogaspregun1.setVisible(false);
            jLabel37.setVisible(false);
            jRadioButton2.setVisible(false);
            jRadioButton2.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox31ItemStateChanged

    private void jCheckBox32ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox32ItemStateChanged
        if (jCheckBox32.isSelected()) {
            jCheckBox31.setSelected(false);
            ConsumoSustancias.setDrogaspregun1("No");
            txtdrogaspregun1.setVisible(false);
            jLabel37.setVisible(false);
            jRadioButton2.setVisible(false);
            jRadioButton2.setSelected(false);
        } else {
            ConsumoSustancias.setDrogaspregun1("-");
            txtdrogaspregun1.setVisible(false);
            jLabel37.setVisible(false);
            jRadioButton2.setVisible(false);
            jRadioButton2.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox32ItemStateChanged

    private void jCheckBox33ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox33ItemStateChanged
        if (jCheckBox33.isSelected()) {
            jCheckBox34.setSelected(false);
            ConsumoSustancias.setDrogaspregun2("Sí");
            txtdrogaspregun14.setVisible(true);
            jLabel47.setVisible(true);
            jRadioButton3.setVisible(true);
        } else {
            ConsumoSustancias.setDrogaspregun2("-");
            txtdrogaspregun14.setVisible(false);
            jLabel47.setVisible(false);
            jRadioButton3.setVisible(false);
            jRadioButton3.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox33ItemStateChanged

    private void jCheckBox34ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox34ItemStateChanged
        if (jCheckBox34.isSelected()) {
            jCheckBox33.setSelected(false);
            ConsumoSustancias.setDrogaspregun2("No");
            txtdrogaspregun14.setVisible(false);
            jLabel47.setVisible(false);
            jRadioButton3.setVisible(false);
            jRadioButton3.setSelected(false);
        } else {
            ConsumoSustancias.setDrogaspregun2("-");
            txtdrogaspregun14.setVisible(false);
            jLabel47.setVisible(false);
            jRadioButton3.setVisible(false);
            jRadioButton3.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox34ItemStateChanged

    private void jCheckBox35ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox35ItemStateChanged
        if (jCheckBox35.isSelected()) {
            jCheckBox36.setSelected(false);
            ConsumoSustancias.setDrogaspregun3("Sí");
            txtdrogaspregun15.setVisible(true);
            jLabel48.setVisible(true);
            jRadioButton4.setVisible(true);
        } else {
            ConsumoSustancias.setDrogaspregun3("-");
            txtdrogaspregun15.setVisible(false);
            jLabel48.setVisible(false);
            jRadioButton4.setVisible(false);
            jRadioButton4.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox35ItemStateChanged

    private void jCheckBox36ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox36ItemStateChanged
        if (jCheckBox36.isSelected()) {
            jCheckBox35.setSelected(false);
            ConsumoSustancias.setDrogaspregun3("No");
            txtdrogaspregun15.setVisible(false);
            jLabel48.setVisible(false);
            jRadioButton4.setVisible(false);
            jRadioButton4.setSelected(false);
        } else {
            ConsumoSustancias.setDrogaspregun3("-");
            txtdrogaspregun15.setVisible(false);
            jLabel48.setVisible(false);
            jRadioButton4.setVisible(false);
            jRadioButton4.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox36ItemStateChanged

    private void jCheckBox37ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox37ItemStateChanged
        if (jCheckBox37.isSelected()) {
            jCheckBox38.setSelected(false);
            ConsumoSustancias.setDrogaspregun4("Sí");
            txtdrogaspregun2.setVisible(true);
            jLabel36.setVisible(true);
            jRadioButton5.setVisible(true);
        } else {
            ConsumoSustancias.setDrogaspregun4("-");
            txtdrogaspregun2.setVisible(false);
            jLabel36.setVisible(false);
            jRadioButton5.setVisible(false);
            jRadioButton5.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox37ItemStateChanged

    private void jCheckBox38ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox38ItemStateChanged
        if (jCheckBox38.isSelected()) {
            jCheckBox37.setSelected(false);
            ConsumoSustancias.setDrogaspregun4("No");
            txtdrogaspregun2.setVisible(false);
            jLabel36.setVisible(false);
            jRadioButton5.setVisible(false);
            jRadioButton5.setSelected(false);
        } else {
            ConsumoSustancias.setDrogaspregun4("-");
            txtdrogaspregun2.setVisible(false);
            jLabel36.setVisible(false);
            jRadioButton5.setVisible(false);
            jRadioButton5.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox38ItemStateChanged

    private void jCheckBox39ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox39ItemStateChanged
        if (jCheckBox39.isSelected()) {
            jCheckBox40.setSelected(false);
            ConsumoSustancias.setHaparticipado("Sí");
            Admisiones.setAdmCSS6("hay");
            jLabel46.setVisible(true);
            jLabel164.setVisible(true);
            txtdrogaspregun10.setVisible(true);
            chbxsiembra.setEnabled(true);
            cbxfabricacion.setEnabled(true);
            cbxexportacion.setEnabled(true);
            cbxinsumos.setEnabled(true);
            cbxinsumos2.setEnabled(true);
            cbxrecoleccion.setEnabled(true);
            cbxtransporte.setEnabled(true);
            cbxcomercializacion.setEnabled(true);
            cbxinsumos1.setEnabled(true);
            cbxrecoleccion1.setEnabled(true);
            cbxrecoleccion2.setEnabled(true);
        } else {
            Admisiones.setAdmCSS6("nohay");
            chbxsiembra.setEnabled(false);
            cbxfabricacion.setEnabled(false);
            cbxexportacion.setEnabled(false);
            cbxinsumos.setEnabled(false);
            cbxinsumos2.setEnabled(false);
            cbxrecoleccion.setEnabled(false);
            cbxtransporte.setEnabled(false);
            cbxcomercializacion.setEnabled(false);
            cbxinsumos1.setEnabled(false);
            cbxrecoleccion1.setEnabled(false);
            cbxrecoleccion2.setEnabled(false);
            ConsumoSustancias.setHaparticipado("-");
            jLabel46.setVisible(false);
            jLabel164.setVisible(false);
            txtdrogaspregun10.setVisible(false);
        }
    }//GEN-LAST:event_jCheckBox39ItemStateChanged

    private void jCheckBox40ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox40ItemStateChanged
        if (jCheckBox40.isSelected()) {
            jCheckBox39.setSelected(false);
            ConsumoSustancias.setHaparticipado("No");
            jLabel46.setVisible(false);
            Admisiones.setAdmCSS6("nohay");
            jLabel164.setVisible(false);
            txtdrogaspregun10.setVisible(false);
            chbxsiembra.setEnabled(false);
            cbxfabricacion.setEnabled(false);
            cbxexportacion.setEnabled(false);
            cbxinsumos.setEnabled(false);
            cbxinsumos2.setEnabled(false);
            cbxrecoleccion.setEnabled(false);
            cbxtransporte.setEnabled(false);
            cbxcomercializacion.setEnabled(false);
            cbxinsumos1.setEnabled(false);
            cbxrecoleccion1.setEnabled(false);
            cbxrecoleccion2.setEnabled(false);
        } else {
            Admisiones.setAdmCSS6("nohay");
            ConsumoSustancias.setHaparticipado("-");
            jLabel46.setVisible(false);
            jLabel164.setVisible(false);
            txtdrogaspregun10.setVisible(false);
            chbxsiembra.setEnabled(false);
            cbxfabricacion.setEnabled(false);
            cbxexportacion.setEnabled(false);
            cbxinsumos.setEnabled(false);
            cbxinsumos2.setEnabled(false);
            cbxrecoleccion.setEnabled(false);
            cbxtransporte.setEnabled(false);
            cbxcomercializacion.setEnabled(false);
            cbxinsumos1.setEnabled(false);
            cbxrecoleccion1.setEnabled(false);
            cbxrecoleccion2.setEnabled(false);
        }
    }//GEN-LAST:event_jCheckBox40ItemStateChanged

    private void jCheckBox41ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox41ItemStateChanged
        if (jCheckBox41.isSelected()) {
            jCheckBox42.setSelected(false);
            ConsumoSustancias.setDrogaspregun6("Sí");
            txtdrogaspregun11.setVisible(true);
            jLabel45.setVisible(true);
            jRadioButton8.setVisible(true);
        } else {
            ConsumoSustancias.setDrogaspregun6("-");
            txtdrogaspregun11.setVisible(false);
            jLabel45.setVisible(false);
            jRadioButton8.setVisible(false);
            jRadioButton8.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox41ItemStateChanged

    private void jCheckBox42ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox42ItemStateChanged
        if (jCheckBox42.isSelected()) {
            jCheckBox41.setSelected(false);
            ConsumoSustancias.setDrogaspregun6("No");
            txtdrogaspregun11.setVisible(false);
            jLabel45.setVisible(false);
            jRadioButton8.setVisible(false);
            jRadioButton8.setSelected(false);
        } else {
            ConsumoSustancias.setDrogaspregun6("-");
            txtdrogaspregun11.setVisible(false);
            jLabel45.setVisible(false);
            jRadioButton8.setVisible(false);
            jRadioButton8.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox42ItemStateChanged

    private void jCheckBox43ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox43ItemStateChanged
        if (jCheckBox43.isSelected()) {
            jCheckBox44.setSelected(false);
            ConsumoSustancias.setDrogaspregun7("Sí");
            txtdrogaspregun12.setVisible(true);
            jLabel41.setVisible(true);
            jRadioButton9.setVisible(true);
            jRadioButton9.setSelected(false);
        } else {
            ConsumoSustancias.setDrogaspregun7("-");
            txtdrogaspregun12.setVisible(false);
            jLabel41.setVisible(false);
            jRadioButton9.setVisible(false);
            jRadioButton9.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox43ItemStateChanged

    private void jCheckBox44ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox44ItemStateChanged
        if (jCheckBox44.isSelected()) {
            jCheckBox43.setSelected(false);
            ConsumoSustancias.setDrogaspregun7("No");
            txtdrogaspregun12.setVisible(false);
            jLabel41.setVisible(false);
            jRadioButton9.setVisible(false);
            jRadioButton9.setSelected(false);
        } else {
            ConsumoSustancias.setDrogaspregun7("-");
            txtdrogaspregun12.setVisible(false);
            jLabel41.setVisible(false);
            jRadioButton9.setVisible(false);
            jRadioButton9.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox44ItemStateChanged

    private void jCheckBox45ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox45ItemStateChanged
        if (jCheckBox45.isSelected()) {
            jCheckBox46.setSelected(false);
            ConsumoSustancias.setDrogaspregun9("Sí");
            txtdrogaspregun4.setVisible(true);
            jLabel43.setVisible(true);
            jRadioButton11.setVisible(true);
        } else {
            ConsumoSustancias.setDrogaspregun9("-");
            txtdrogaspregun4.setVisible(false);
            jLabel43.setVisible(false);
            jRadioButton11.setVisible(false);
            jRadioButton11.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox45ItemStateChanged

    private void jCheckBox46ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox46ItemStateChanged
        if (jCheckBox46.isSelected()) {
            jCheckBox45.setSelected(false);
            ConsumoSustancias.setDrogaspregun9("No");
            txtdrogaspregun4.setVisible(false);
            jLabel43.setVisible(false);
            jRadioButton11.setVisible(false);
            jRadioButton11.setSelected(false);
        } else {
            ConsumoSustancias.setDrogaspregun9("-");
            txtdrogaspregun4.setVisible(false);
            jLabel43.setVisible(false);
            jRadioButton11.setVisible(false);
            jRadioButton11.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox46ItemStateChanged

    private void jCheckBox47ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox47ItemStateChanged
        if (jCheckBox47.isSelected()) {
            jCheckBox48.setSelected(false);
            ConsumoSustancias.setDrogaspregun10("Sí");
            txtdrogaspregun5.setVisible(true);
            jLabel44.setVisible(true);
            jRadioButton12.setVisible(true);
        } else {
            ConsumoSustancias.setDrogaspregun10("-");
            txtdrogaspregun5.setVisible(false);
            jLabel44.setVisible(false);
            jRadioButton12.setVisible(false);
            jRadioButton12.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox47ItemStateChanged

    private void jCheckBox48ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox48ItemStateChanged
        if (jCheckBox48.isSelected()) {
            jCheckBox47.setSelected(false);
            ConsumoSustancias.setDrogaspregun10("No");
            txtdrogaspregun5.setVisible(false);
            jLabel44.setVisible(false);
            jRadioButton12.setVisible(false);
            jRadioButton12.setSelected(false);
        } else {
            ConsumoSustancias.setDrogaspregun10("-");
            txtdrogaspregun5.setVisible(false);
            jLabel44.setVisible(false);
            jRadioButton12.setVisible(false);
            jRadioButton12.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox48ItemStateChanged

    private void jCheckBox49ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox49ItemStateChanged
        if (jCheckBox49.isSelected()) {
            jCheckBox50.setSelected(false);
            ConsumoSustancias.setDrogaspregun11("Sí");
            txtdrogaspregun6.setVisible(true);
            jLabel38.setVisible(true);
            jRadioButton13.setVisible(true);
        } else {
            ConsumoSustancias.setDrogaspregun11("-");
            txtdrogaspregun6.setVisible(false);
            jLabel38.setVisible(false);
            jRadioButton13.setVisible(false);
            jRadioButton13.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox49ItemStateChanged

    private void jCheckBox50ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox50ItemStateChanged
        if (jCheckBox50.isSelected()) {
            jCheckBox49.setSelected(false);
            ConsumoSustancias.setDrogaspregun11("No");
            txtdrogaspregun6.setVisible(false);
            jLabel38.setVisible(false);
            jRadioButton13.setVisible(false);
            jRadioButton13.setSelected(false);
        } else {
            ConsumoSustancias.setDrogaspregun11("-");
            txtdrogaspregun6.setVisible(false);
            jLabel38.setVisible(false);
            jRadioButton13.setVisible(false);
            jRadioButton13.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox50ItemStateChanged

    private void jCheckBox51ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox51ItemStateChanged
        if (jCheckBox51.isSelected()) {
            jCheckBox52.setSelected(false);
            ConsumoSustancias.setDrogaspregun12("Sí");
            txtdrogaspregun7.setVisible(true);
            jLabel40.setVisible(true);
            jRadioButton14.setVisible(true);
        } else {
            ConsumoSustancias.setDrogaspregun12("-");
            txtdrogaspregun7.setVisible(false);
            jLabel40.setVisible(false);
            jRadioButton14.setVisible(false);
            jRadioButton14.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox51ItemStateChanged

    private void jCheckBox52ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox52ItemStateChanged
        if (jCheckBox52.isSelected()) {
            jCheckBox51.setSelected(false);
            ConsumoSustancias.setDrogaspregun12("No");
            txtdrogaspregun7.setVisible(false);
            jLabel40.setVisible(false);
            jRadioButton14.setVisible(false);
            jRadioButton14.setSelected(false);
        } else {
            ConsumoSustancias.setDrogaspregun12("-");
            txtdrogaspregun7.setVisible(false);
            jLabel40.setVisible(false);
            jRadioButton14.setVisible(false);
            jRadioButton14.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox52ItemStateChanged

    private void jCheckBox53ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox53ItemStateChanged
        if (jCheckBox53.isSelected()) {
            jCheckBox54.setSelected(false);
            ConsumoSustancias.setDrogaspregun13("Sí");
            txtdrogaspregun8.setVisible(true);
            jLabel39.setVisible(true);
            jRadioButton15.setVisible(true);
        } else {
            ConsumoSustancias.setDrogaspregun13("-");
            txtdrogaspregun8.setVisible(false);
            jLabel39.setVisible(false);
            jRadioButton15.setVisible(false);
            jRadioButton15.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox53ItemStateChanged

    private void jCheckBox54ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox54ItemStateChanged
        if (jCheckBox54.isSelected()) {
            jCheckBox53.setSelected(false);
            ConsumoSustancias.setDrogaspregun13("No");
            txtdrogaspregun8.setVisible(false);
            jLabel39.setVisible(false);
            jRadioButton15.setVisible(false);
            jRadioButton15.setSelected(false);
        } else {
            ConsumoSustancias.setDrogaspregun13("-");
            txtdrogaspregun8.setVisible(false);
            jLabel39.setVisible(false);
            jRadioButton15.setVisible(false);
            jRadioButton15.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox54ItemStateChanged

    private void chbxheroina1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chbxheroina1ItemStateChanged
        if (chbxheroina1.isSelected()) {
            frecconsumolast7.setVisible(true);
            txtfrecuenciabebida7.setVisible(true);
            ConsumoSustancias.setTipodroga8("hay");
        } else {
            ConsumoSustancias.setTipodroga8("nohay");
            frecconsumolast7.setVisible(false);
            txtfrecuenciabebida7.setVisible(false);
        }
    }//GEN-LAST:event_chbxheroina1ItemStateChanged

    private void chbxheroina2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chbxheroina2ItemStateChanged
        if (chbxheroina2.isSelected()) {
            frecconsumolast8.setVisible(true);
            txtfrecuenciabebida8.setVisible(true);
            ConsumoSustancias.setTipodroga9("hay");
        } else {
            ConsumoSustancias.setTipodroga9("nohay");
            frecconsumolast8.setVisible(false);
            txtfrecuenciabebida8.setVisible(false);
        }
    }//GEN-LAST:event_chbxheroina2ItemStateChanged

    private void chbxheroina3ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chbxheroina3ItemStateChanged
        if (chbxheroina3.isSelected()) {
            txtexpfincara1.setVisible(true);
            jLabel66.setVisible(true);
            frecconsumolast9.setVisible(true);
            txtfrecuenciabebida9.setVisible(true);
            ConsumoSustancias.setTipodroga10("hay");
        } else {
            ConsumoSustancias.setTipodroga10("nohay");
            txtexpfincara1.setVisible(false);
            jLabel66.setVisible(false);
            frecconsumolast9.setVisible(false);
            txtfrecuenciabebida9.setVisible(false);
        }

    }//GEN-LAST:event_chbxheroina3ItemStateChanged

    private void txtexpfincara1CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtexpfincara1CaretUpdate
        ConsumoSustancias.setTipodrog10(txtexpfincara1.getText());
    }//GEN-LAST:event_txtexpfincara1CaretUpdate

    private void txtfrecuenciabebida7ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_txtfrecuenciabebida7ItemStateChanged
        ConsumoSustancias.setFrecuencia_droga8(txtfrecuenciabebida7.getSelectedItem().toString());
    }//GEN-LAST:event_txtfrecuenciabebida7ItemStateChanged

    private void txtfrecuenciabebida8ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_txtfrecuenciabebida8ItemStateChanged
        ConsumoSustancias.setFrecuencia_droga9(txtfrecuenciabebida8.getSelectedItem().toString());
    }//GEN-LAST:event_txtfrecuenciabebida8ItemStateChanged

    private void txtfrecuenciabebida9ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_txtfrecuenciabebida9ItemStateChanged
        ConsumoSustancias.setFrecuencia_droga10(txtfrecuenciabebida9.getSelectedItem().toString());
    }//GEN-LAST:event_txtfrecuenciabebida9ItemStateChanged

    private void cbxrecoleccion1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxrecoleccion1ItemStateChanged
        if (cbxrecoleccion1.isSelected()) {
            ConsumoSustancias.setTi_partici10("hay");
        } else {
            ConsumoSustancias.setTi_partici10("nohay");
        }
    }//GEN-LAST:event_cbxrecoleccion1ItemStateChanged

    private void cbxrecoleccion2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxrecoleccion2ItemStateChanged
        if (cbxrecoleccion2.isSelected()) {
            ConsumoSustancias.setTi_partici11("hay");
        } else {
            ConsumoSustancias.setTi_partici11("nohay");
        }
    }//GEN-LAST:event_cbxrecoleccion2ItemStateChanged

    private void jCheckBox55ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox55ItemStateChanged
        if (jCheckBox55.isSelected()) {
            jCheckBox56.setSelected(false);
            ConsumoSustancias.setDrogaspregun5("Sí");
            txtdrogaspregun16.setVisible(true);
            jLabel49.setVisible(true);
            jRadioButton7.setVisible(true);
        } else {
            ConsumoSustancias.setDrogaspregun5("-");
            txtdrogaspregun16.setVisible(false);
            jLabel49.setVisible(false);
            jRadioButton7.setVisible(false);
            jRadioButton7.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox55ItemStateChanged

    private void jCheckBox56ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox56ItemStateChanged

        if (jCheckBox56.isSelected()) {
            jCheckBox55.setSelected(false);
            ConsumoSustancias.setDrogaspregun5("No");
            txtdrogaspregun16.setVisible(false);
            jLabel49.setVisible(false);
            jRadioButton7.setVisible(false);
            jRadioButton7.setSelected(false);
        } else {
            ConsumoSustancias.setDrogaspregun5("-");
            txtdrogaspregun16.setVisible(false);
            jLabel49.setVisible(false);
            jRadioButton7.setVisible(false);
            jRadioButton7.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox56ItemStateChanged

    private void txtdrogaspregun17CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtdrogaspregun17CaretUpdate
        ConsumoSustancias.setAdmisionConsumoSustancias(txtdrogaspregun17.getText());
    }//GEN-LAST:event_txtdrogaspregun17CaretUpdate

    private void jCheckBox57ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox57ItemStateChanged
        if (jCheckBox57.isSelected()) {
            jCheckBox58.setSelected(false);
            jLabel50.setVisible(true);
            txtdrogaspregun17.setVisible(true);
            Admisiones.setAdmCSS16("hay");
        } else {
            Admisiones.setAdmCSS16("nohay");
        }
    }//GEN-LAST:event_jCheckBox57ItemStateChanged

    private void jCheckBox58ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox58ItemStateChanged
        if (jCheckBox58.isSelected()) {
            jCheckBox57.setSelected(false);
            jLabel50.setVisible(false);
            txtdrogaspregun17.setVisible(false);
            Admisiones.setAdmCSS10("nohay");
        } else {
            Admisiones.setAdmCSS10("nohay");
        }
    }//GEN-LAST:event_jCheckBox58ItemStateChanged

    private void txtexpfincara1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtexpfincara1KeyTyped
        int k = (int) evt.getKeyChar();
        if (k == 39) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "¡No se acepta ese tipo de carácter!", "Error de datos ingresados", JOptionPane.ERROR_MESSAGE, iconThinking_uh);
        }
        InputMap map = txtexpfincara1.getInputMap(JTextField.WHEN_FOCUSED);
//        map.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, CTRL_MASK), "null");
    }//GEN-LAST:event_txtexpfincara1KeyTyped

    private void txtdrogaspregun17KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdrogaspregun17KeyTyped
        int k = (int) evt.getKeyChar();
        if (k == 39) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "¡No se acepta ese tipo de carácter!", "Error de datos ingresados", JOptionPane.ERROR_MESSAGE, iconThinking_uh);
        }
        InputMap map = txtdrogaspregun17.getInputMap(JTextField.WHEN_FOCUSED);
//        map.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, CTRL_MASK), "null");
    }//GEN-LAST:event_txtdrogaspregun17KeyTyped

    private void txtdrogaspregun12KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdrogaspregun12KeyTyped
        int k = (int) evt.getKeyChar();
        if (k == 39) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "¡No se acepta ese tipo de carácter!", "Error de datos ingresados", JOptionPane.ERROR_MESSAGE, iconThinking_uh);
        }
        InputMap map = txtdrogaspregun12.getInputMap(JTextField.WHEN_FOCUSED);
//        map.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, CTRL_MASK), "null");
    }//GEN-LAST:event_txtdrogaspregun12KeyTyped

    private void txtdrogaspregun11KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdrogaspregun11KeyTyped
        int k = (int) evt.getKeyChar();
        if (k == 39) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "¡No se acepta ese tipo de carácter!", "Error de datos ingresados", JOptionPane.ERROR_MESSAGE, iconThinking_uh);
        }
        InputMap map = txtdrogaspregun11.getInputMap(JTextField.WHEN_FOCUSED);
//        map.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, CTRL_MASK), "null");
    }//GEN-LAST:event_txtdrogaspregun11KeyTyped

    private void txtdrogaspregun16KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdrogaspregun16KeyTyped
        int k = (int) evt.getKeyChar();
        if (k == 39) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "¡No se acepta ese tipo de carácter!", "Error de datos ingresados", JOptionPane.ERROR_MESSAGE, iconThinking_uh);
        }
        InputMap map = txtdrogaspregun16.getInputMap(JTextField.WHEN_FOCUSED);
//        map.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, CTRL_MASK), "null");
    }//GEN-LAST:event_txtdrogaspregun16KeyTyped

    private void txtdrogaspregun10KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdrogaspregun10KeyTyped
        int k = (int) evt.getKeyChar();
        if (k == 39) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "¡No se acepta ese tipo de carácter!", "Error de datos ingresados", JOptionPane.ERROR_MESSAGE, iconThinking_uh);
        }
        InputMap map = txtdrogaspregun10.getInputMap(JTextField.WHEN_FOCUSED);
//        map.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, CTRL_MASK), "null");
    }//GEN-LAST:event_txtdrogaspregun10KeyTyped

    private void txtdrogaspregun9KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdrogaspregun9KeyTyped
        int k = (int) evt.getKeyChar();
        if (k == 39) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "¡No se acepta ese tipo de carácter!", "Error de datos ingresados", JOptionPane.ERROR_MESSAGE, iconThinking_uh);
        }
        InputMap map = txtdrogaspregun9.getInputMap(JTextField.WHEN_FOCUSED);
//        map.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, CTRL_MASK), "null");
    }//GEN-LAST:event_txtdrogaspregun9KeyTyped

    private void txtdrogaspregun1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdrogaspregun1KeyTyped
        int k = (int) evt.getKeyChar();
        if (k == 39) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "¡No se acepta ese tipo de carácter!", "Error de datos ingresados", JOptionPane.ERROR_MESSAGE, iconThinking_uh);
        }
        InputMap map = txtdrogaspregun1.getInputMap(JTextField.WHEN_FOCUSED);
//        map.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, CTRL_MASK), "null");
    }//GEN-LAST:event_txtdrogaspregun1KeyTyped

    private void txtdrogaspregun14KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdrogaspregun14KeyTyped
        int k = (int) evt.getKeyChar();
        if (k == 39) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "¡No se acepta ese tipo de carácter!", "Error de datos ingresados", JOptionPane.ERROR_MESSAGE, iconThinking_uh);
        }
        InputMap map = txtdrogaspregun14.getInputMap(JTextField.WHEN_FOCUSED);
//        map.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, CTRL_MASK), "null");
    }//GEN-LAST:event_txtdrogaspregun14KeyTyped

    private void txtdrogaspregun15KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdrogaspregun15KeyTyped
        int k = (int) evt.getKeyChar();
        if (k == 39) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "¡No se acepta ese tipo de carácter!", "Error de datos ingresados", JOptionPane.ERROR_MESSAGE, iconThinking_uh);
        }
        InputMap map = txtdrogaspregun15.getInputMap(JTextField.WHEN_FOCUSED);
//        map.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, CTRL_MASK), "null");
    }//GEN-LAST:event_txtdrogaspregun15KeyTyped

    private void txtdrogaspregun2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdrogaspregun2KeyTyped
        int k = (int) evt.getKeyChar();
        if (k == 39) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "¡No se acepta ese tipo de carácter!", "Error de datos ingresados", JOptionPane.ERROR_MESSAGE, iconThinking_uh);
        }
        InputMap map = txtdrogaspregun2.getInputMap(JTextField.WHEN_FOCUSED);
//        map.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, CTRL_MASK), "null");
    }//GEN-LAST:event_txtdrogaspregun2KeyTyped

    private void txtfrecuenciabebida8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfrecuenciabebida8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfrecuenciabebida8ActionPerformed

    private void jRadioButton2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton2ItemStateChanged
        if (jRadioButton2.isSelected()) {
            Admisiones.setAdmCSS2("hay");
        } else {
            Admisiones.setAdmCSS2("nohay");
        }
    }//GEN-LAST:event_jRadioButton2ItemStateChanged

    private void jRadioButton3ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton3ItemStateChanged
        if (jRadioButton3.isSelected()) {
            Admisiones.setAdmCSS3("hay");
        } else {
            Admisiones.setAdmCSS3("nohay");
        }
    }//GEN-LAST:event_jRadioButton3ItemStateChanged

    private void jRadioButton4ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton4ItemStateChanged
        if (jRadioButton4.isSelected()) {
            Admisiones.setAdmCSS4("hay");
        } else {
            Admisiones.setAdmCSS4("nohay");
        }
    }//GEN-LAST:event_jRadioButton4ItemStateChanged

    private void jRadioButton5ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton5ItemStateChanged
        if (jRadioButton5.isSelected()) {
            Admisiones.setAdmCSS5("hay");
        } else {
            Admisiones.setAdmCSS5("nohay");
        }
    }//GEN-LAST:event_jRadioButton5ItemStateChanged

    private void jRadioButton7ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton7ItemStateChanged
        if (jRadioButton7.isSelected()) {
            Admisiones.setAdmCSS7("hay");
        } else {
            Admisiones.setAdmCSS7("nohay");
        }
    }//GEN-LAST:event_jRadioButton7ItemStateChanged

    private void jRadioButton8ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton8ItemStateChanged
        if (jRadioButton8.isSelected()) {
            Admisiones.setAdmCSS8("hay");
        } else {
            Admisiones.setAdmCSS8("nohay");
        }
    }//GEN-LAST:event_jRadioButton8ItemStateChanged

    private void jRadioButton9ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton9ItemStateChanged
        if (jRadioButton9.isSelected()) {
            Admisiones.setAdmCSS9("hay");
        } else {
            Admisiones.setAdmCSS9("nohay");
        }
    }//GEN-LAST:event_jRadioButton9ItemStateChanged

    private void jCheckBox59ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox59ItemStateChanged
        if (jCheckBox59.isSelected()) {
            jCheckBox60.setSelected(false);
            ConsumoSustancias.setDrogaspregun8("No");
            txtdrogaspregun3.setVisible(false);
            jLabel42.setVisible(false);
            jRadioButton10.setVisible(false);
            jRadioButton10.setSelected(false);
        } else {
            ConsumoSustancias.setDrogaspregun8("-");
            txtdrogaspregun3.setVisible(false);
            jLabel42.setVisible(false);
            jRadioButton10.setVisible(false);
            jRadioButton10.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox59ItemStateChanged

    private void jCheckBox60ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox60ItemStateChanged
        if (jCheckBox60.isSelected()) {
            jCheckBox59.setSelected(false);
            ConsumoSustancias.setDrogaspregun8("Sí");
            txtdrogaspregun3.setVisible(true);
            jLabel42.setVisible(true);
            jRadioButton10.setVisible(true);
        } else {
            ConsumoSustancias.setDrogaspregun8("-");
            txtdrogaspregun3.setVisible(false);
            jLabel42.setVisible(false);
            jRadioButton10.setVisible(false);
            jRadioButton10.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox60ItemStateChanged

    private void txtdrogaspregun3CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtdrogaspregun3CaretUpdate
        ConsumoSustancias.setExpdrogaspregun8(txtdrogaspregun3.getText());
    }//GEN-LAST:event_txtdrogaspregun3CaretUpdate

    private void txtdrogaspregun4CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtdrogaspregun4CaretUpdate
        ConsumoSustancias.setExpdrogaspregun9(txtdrogaspregun4.getText());
    }//GEN-LAST:event_txtdrogaspregun4CaretUpdate

    private void txtdrogaspregun5CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtdrogaspregun5CaretUpdate
        ConsumoSustancias.setExpdrogaspregun10(txtdrogaspregun5.getText());
    }//GEN-LAST:event_txtdrogaspregun5CaretUpdate

    private void txtdrogaspregun6CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtdrogaspregun6CaretUpdate
        ConsumoSustancias.setExpdrogaspregun11(txtdrogaspregun6.getText());
    }//GEN-LAST:event_txtdrogaspregun6CaretUpdate

    private void txtdrogaspregun7CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtdrogaspregun7CaretUpdate
        ConsumoSustancias.setExpdrogaspregun12(txtdrogaspregun7.getText());
    }//GEN-LAST:event_txtdrogaspregun7CaretUpdate

    private void txtdrogaspregun8CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtdrogaspregun8CaretUpdate
        ConsumoSustancias.setExpdrogaspregun13(txtdrogaspregun8.getText());
    }//GEN-LAST:event_txtdrogaspregun8CaretUpdate

    private void jRadioButton10ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton10ItemStateChanged
        if (jRadioButton10.isSelected()) {
            Admisiones.setAdmCSS10("hay");
        } else {
            Admisiones.setAdmCSS10("nohay");
        }
    }//GEN-LAST:event_jRadioButton10ItemStateChanged

    private void jRadioButton11ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton11ItemStateChanged
        if (jRadioButton11.isSelected()) {
            Admisiones.setAdmCSS11("hay");
        } else {
            Admisiones.setAdmCSS11("nohay");
        }
    }//GEN-LAST:event_jRadioButton11ItemStateChanged

    private void jRadioButton12ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton12ItemStateChanged
        if (jRadioButton12.isSelected()) {
            Admisiones.setAdmCSS12("hay");
        } else {
            Admisiones.setAdmCSS12("nohay");
        }
    }//GEN-LAST:event_jRadioButton12ItemStateChanged

    private void jRadioButton13ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton13ItemStateChanged
        if (jRadioButton13.isSelected()) {
            Admisiones.setAdmCSS13("hay");
        } else {
            Admisiones.setAdmCSS13("nohay");
        }
    }//GEN-LAST:event_jRadioButton13ItemStateChanged

    private void jRadioButton14ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton14ItemStateChanged
        if (jRadioButton14.isSelected()) {
            Admisiones.setAdmCSS14("hay");
        } else {
            Admisiones.setAdmCSS14("nohay");
        }
    }//GEN-LAST:event_jRadioButton14ItemStateChanged

    private void jRadioButton15ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton15ItemStateChanged
        if (jRadioButton15.isSelected()) {
            Admisiones.setAdmCSS15("hay");
        } else {
            Admisiones.setAdmCSS15("nohay");
        }
    }//GEN-LAST:event_jRadioButton15ItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel activrelanarcomundo;
    private javax.swing.JLabel activrelanarcomundo1;
    private javax.swing.JCheckBox cbxcomercializacion;
    private javax.swing.JCheckBox cbxexportacion;
    private javax.swing.JCheckBox cbxfabricacion;
    private javax.swing.JCheckBox cbxinsumos;
    private javax.swing.JCheckBox cbxinsumos1;
    private javax.swing.JCheckBox cbxinsumos2;
    private javax.swing.JCheckBox cbxrecoleccion;
    private javax.swing.JCheckBox cbxrecoleccion1;
    private javax.swing.JCheckBox cbxrecoleccion2;
    private javax.swing.JCheckBox cbxtransporte;
    private javax.swing.JCheckBox chbxbazuco;
    private javax.swing.JCheckBox chbxcocaina;
    private javax.swing.JCheckBox chbxextasis;
    private javax.swing.JCheckBox chbxheroina;
    private javax.swing.JCheckBox chbxheroina1;
    private javax.swing.JCheckBox chbxheroina2;
    private javax.swing.JCheckBox chbxheroina3;
    private javax.swing.JCheckBox chbxlds;
    private javax.swing.JCheckBox chbxmarihuana;
    private javax.swing.JCheckBox chbxsiembra;
    private javax.swing.JLabel drogaspregun10;
    private javax.swing.JLabel drogaspregun11;
    private javax.swing.JLabel drogaspregun1_1;
    private javax.swing.JLabel drogaspregun1_2;
    private javax.swing.JLabel drogaspregun1_3;
    private javax.swing.JLabel drogaspregun2;
    private javax.swing.JLabel drogaspregun3;
    private javax.swing.JLabel drogaspregun4;
    private javax.swing.JLabel drogaspregun5;
    private javax.swing.JLabel drogaspregun6;
    private javax.swing.JLabel drogaspregun7;
    private javax.swing.JLabel drogaspregun8;
    private javax.swing.JLabel drogaspregun9;
    private javax.swing.JLabel frecconsumolast1;
    private javax.swing.JLabel frecconsumolast2;
    private javax.swing.JLabel frecconsumolast3;
    private javax.swing.JLabel frecconsumolast4;
    private javax.swing.JLabel frecconsumolast5;
    private javax.swing.JLabel frecconsumolast6;
    private javax.swing.JLabel frecconsumolast7;
    private javax.swing.JLabel frecconsumolast8;
    private javax.swing.JLabel frecconsumolast9;
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
    private javax.swing.JCheckBox jCheckBox55;
    private javax.swing.JCheckBox jCheckBox56;
    private javax.swing.JCheckBox jCheckBox57;
    private javax.swing.JCheckBox jCheckBox58;
    private javax.swing.JCheckBox jCheckBox59;
    private javax.swing.JCheckBox jCheckBox60;
    private javax.swing.JLabel jLabel141;
    private javax.swing.JLabel jLabel151;
    private javax.swing.JLabel jLabel152;
    private javax.swing.JLabel jLabel153;
    private javax.swing.JLabel jLabel154;
    private javax.swing.JLabel jLabel155;
    private javax.swing.JLabel jLabel156;
    private javax.swing.JLabel jLabel158;
    private javax.swing.JLabel jLabel159;
    private javax.swing.JLabel jLabel160;
    private javax.swing.JLabel jLabel161;
    private javax.swing.JLabel jLabel162;
    private javax.swing.JLabel jLabel164;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JRadioButton jRadioButton10;
    private javax.swing.JRadioButton jRadioButton11;
    private javax.swing.JRadioButton jRadioButton12;
    private javax.swing.JRadioButton jRadioButton13;
    private javax.swing.JRadioButton jRadioButton14;
    private javax.swing.JRadioButton jRadioButton15;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JRadioButton jRadioButton8;
    private javax.swing.JRadioButton jRadioButton9;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField txtdrogaspregun1;
    private javax.swing.JTextField txtdrogaspregun10;
    private javax.swing.JTextField txtdrogaspregun11;
    private javax.swing.JTextField txtdrogaspregun12;
    private javax.swing.JTextField txtdrogaspregun14;
    private javax.swing.JTextField txtdrogaspregun15;
    private javax.swing.JTextField txtdrogaspregun16;
    private javax.swing.JTextField txtdrogaspregun17;
    private javax.swing.JTextField txtdrogaspregun2;
    private javax.swing.JTextField txtdrogaspregun3;
    private javax.swing.JTextField txtdrogaspregun4;
    private javax.swing.JTextField txtdrogaspregun5;
    private javax.swing.JTextField txtdrogaspregun6;
    private javax.swing.JTextField txtdrogaspregun7;
    private javax.swing.JTextField txtdrogaspregun8;
    private javax.swing.JTextField txtdrogaspregun9;
    private javax.swing.JTextField txtexpfincara1;
    private javax.swing.JComboBox<String> txtfrecuenciabebida;
    private javax.swing.JComboBox<String> txtfrecuenciabebida1;
    private javax.swing.JComboBox<String> txtfrecuenciabebida2;
    private javax.swing.JComboBox<String> txtfrecuenciabebida3;
    private javax.swing.JComboBox<String> txtfrecuenciabebida4;
    private javax.swing.JComboBox<String> txtfrecuenciabebida5;
    private javax.swing.JComboBox<String> txtfrecuenciabebida7;
    private javax.swing.JComboBox<String> txtfrecuenciabebida8;
    private javax.swing.JComboBox<String> txtfrecuenciabebida9;
    // End of variables declaration//GEN-END:variables
}
