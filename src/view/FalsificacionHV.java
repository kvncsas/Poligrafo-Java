package view;

import classes.Admisiones;
import classes.DatosPrincipales;
import classes.Falsificacion;
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
public class FalsificacionHV extends javax.swing.JInternalFrame {

    public FalsificacionHV() {
        ((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI()).setNorthPane(null);
        initComponents();
        nodisponiblesingreso();
        //validaingreso();
        jScrollPane1.getVerticalScrollBar().setUnitIncrement(15);
        guiasfalsificacion();
    }

    public void validaingreso() {
        if (DatosPrincipales.getTipoExamen().equals("Ingreso")) {
            nodisponiblesingreso();
        }
    }

    public void guiasfalsificacion() {
        CorrectorOrtografia p = new CorrectorOrtografia("Afirmó...", txtdatosfalsospre25);
        CorrectorOrtografia pp = new CorrectorOrtografia("El examinado expresó...", txtdatosfalsospre27);
        CorrectorOrtografia ppp = new CorrectorOrtografia("La persona refirió...", txtdatosfalsospre28);
        CorrectorOrtografia p1 = new CorrectorOrtografia("Aseguró...", txtdatosfalsospre1);
        CorrectorOrtografia p2 = new CorrectorOrtografia("Comentó...", txtdatosfalsospre2);
        CorrectorOrtografia p3 = new CorrectorOrtografia("Afirmó...", txtdatosfalsospre3);
        CorrectorOrtografia p4 = new CorrectorOrtografia("Contó...", txtdatosfalsospre4);
        CorrectorOrtografia p5 = new CorrectorOrtografia("Mencionó...", txtdatosfalsospre5);
        CorrectorOrtografia p6 = new CorrectorOrtografia("Explicó...", txtdatosfalsospre6);
        CorrectorOrtografia p7 = new CorrectorOrtografia("Aclaró...", txtdatosfalsospre7);
        CorrectorOrtografia p8 = new CorrectorOrtografia("Dijo que...", txtdatosfalsospre8);
        CorrectorOrtografia p9 = new CorrectorOrtografia("Admitió que...", txtdatosfalsospre9);
        CorrectorOrtografia p10 = new CorrectorOrtografia("Refirió...", txtdatosfalsospre10);
        CorrectorOrtografia p11 = new CorrectorOrtografia("Expresó...", txtdatosfalsospre11);
        CorrectorOrtografia p12 = new CorrectorOrtografia("Sostuvo que...", txtdatosfalsospre12);
        CorrectorOrtografia p13 = new CorrectorOrtografia("Manifestó...", txtdatosfalsospre13);
        CorrectorOrtografia p14 = new CorrectorOrtografia("Dijo...", txtdatosfalsospre14);
        CorrectorOrtografia p16 = new CorrectorOrtografia("Comentó...", txtdatosfalsospre16);
        CorrectorOrtografia p17 = new CorrectorOrtografia("Explicó que...", txtdatosfalsospre17);
        CorrectorOrtografia p18 = new CorrectorOrtografia("Mencionó que...", txtdatosfalsospre18);
        CorrectorOrtografia p19 = new CorrectorOrtografia("Contó que...", txtdatosfalsospre19);
        CorrectorOrtografia p24 = new CorrectorOrtografia("Aseguró que...", txtdatosfalsospre24);

        //operativos
        CorrectorOrtografia p25 = new CorrectorOrtografia("Aseguró que...", txtcompacti3);
        CorrectorOrtografia p26 = new CorrectorOrtografia("Afirmó que..", txtcompacti4);
        CorrectorOrtografia p27 = new CorrectorOrtografia("Contó...", txtcompacti5);
        CorrectorOrtografia p28 = new CorrectorOrtografia("Mencionó que...", txtcompacti6);
        CorrectorOrtografia p29 = new CorrectorOrtografia("Explicó...", txtcompacti7);
        CorrectorOrtografia p30 = new CorrectorOrtografia("Aclaró...", txtcompacti8);
        CorrectorOrtografia p31 = new CorrectorOrtografia("Dijo...", txtcompacti9);
        CorrectorOrtografia p32 = new CorrectorOrtografia("Admitió...", txtcompacti10);
        CorrectorOrtografia p33 = new CorrectorOrtografia("Refirió...", txtcompacti11);
        CorrectorOrtografia p34 = new CorrectorOrtografia("Expresó...", txtcompacti12);
        CorrectorOrtografia p35 = new CorrectorOrtografia("Sostuvo...", txtcompacti13);
        CorrectorOrtografia p36 = new CorrectorOrtografia("Manifestó...", txtcompacti14);

        //admitivos
        CorrectorOrtografia p37 = new CorrectorOrtografia("Aseguró que...", txtcompacti15);
        CorrectorOrtografia p38 = new CorrectorOrtografia("Contó...", txtcompacti16);
        CorrectorOrtografia p39 = new CorrectorOrtografia("Mencionó que...", txtcompacti17);
        CorrectorOrtografia p40 = new CorrectorOrtografia("Explicó que...", txtcompacti18);
        CorrectorOrtografia p41 = new CorrectorOrtografia("Dijo...", txtcompacti19);
        CorrectorOrtografia p42 = new CorrectorOrtografia("Aclaró que...", txtcompacti20);
        CorrectorOrtografia p43 = new CorrectorOrtografia("Expresó que...", txtcompacti21);
        CorrectorOrtografia p44 = new CorrectorOrtografia("Manifestó...", txtcompacti22);

        SpellChecker.register(txtdatosfalsospre1);
        SpellChecker.register(txtdatosfalsospre2);
        SpellChecker.register(txtdatosfalsospre3);
        SpellChecker.register(txtdatosfalsospre4);
        SpellChecker.register(txtdatosfalsospre5);
        SpellChecker.register(txtdatosfalsospre6);
        SpellChecker.register(txtdatosfalsospre7);
        SpellChecker.register(txtdatosfalsospre9);
        SpellChecker.register(txtdatosfalsospre10);
        SpellChecker.register(txtdatosfalsospre11);
        SpellChecker.register(txtdatosfalsospre12);
        SpellChecker.register(txtdatosfalsospre13);
        SpellChecker.register(txtdatosfalsospre14);
        SpellChecker.register(txtdatosfalsospre16);
        SpellChecker.register(txtdatosfalsospre17);
        SpellChecker.register(txtdatosfalsospre18);
        SpellChecker.register(txtdatosfalsospre19);
        SpellChecker.register(txtdatosfalsospre24);
        SpellChecker.register(txtdatosfalsospre25);
    }

    public void ValidacionTipoExamen() {
        if (DatosPrincipales.getTipoExamen().equals("Pre-empleo")) {
            jPanel3.setVisible(false);
            jPanel1.setVisible(true);
            jPanel2.setVisible(false);
            jPanel4.setVisible(false);
            jPanel5.setVisible(false);
            jPanel6.setVisible(false);
        } else if (DatosPrincipales.getTipoExamen().equals("Rutina (operaciones)")) {
            jPanel1.setVisible(false);
            jPanel2.setVisible(true);
            jPanel6.setVisible(false);
            jPanel3.setVisible(true);
            jPanel5.setVisible(true);
            jPanel4.setVisible(false);
            pgrutinas();
        } else if (DatosPrincipales.getTipoExamen().equals("Rutina (admitivos)")) {
    
            txtcompacti15.setVisible(true);
            jLabel74.setVisible(true);
            jPanel1.setVisible(false);
            jPanel2.setVisible(false);
            jPanel3.setVisible(true);
            jPanel4.setVisible(true);
            jPanel5.setVisible(true);
            jPanel6.setVisible(false);
            pgrutinas();
        } else if (DatosPrincipales.getTipoExamen().equals("Específico")) {

        }
    }

    public void pgrutinas() {
        txtcompacti3.setVisible(false);
        txtcompacti4.setVisible(false);
        txtcompacti5.setVisible(false);
        txtcompacti6.setVisible(false);
        txtcompacti7.setVisible(false);
        txtcompacti8.setVisible(false);
        txtcompacti9.setVisible(false);
        txtcompacti10.setVisible(false);
        txtcompacti11.setVisible(false);
        txtcompacti12.setVisible(false);
        txtcompacti13.setVisible(false);
        txtcompacti14.setVisible(false);
        txtcompacti17.setVisible(false);
        txtcompacti18.setVisible(false);
        txtcompacti19.setVisible(false);
        txtcompacti20.setVisible(false);
        txtcompacti21.setVisible(false);
        txtcompacti22.setVisible(false);
        txtdatosfalsospre1.setVisible(false);
        txtdatosfalsospre2.setVisible(false);
        txtdatosfalsospre3.setVisible(false);
        txtdatosfalsospre4.setVisible(false);
        txtdatosfalsospre5.setVisible(false);
        txtdatosfalsospre6.setVisible(false);
        txtdatosfalsospre7.setVisible(false);
        txtdatosfalsospre8.setVisible(false);
        txtdatosfalsospre9.setVisible(false);
        txtdatosfalsospre10.setVisible(false);
        txtdatosfalsospre11.setVisible(false);
        txtdatosfalsospre12.setVisible(false);
        txtdatosfalsospre13.setVisible(false);
        txtdatosfalsospre14.setVisible(false);
        txtdatosfalsospre16.setVisible(false);
        txtdatosfalsospre17.setVisible(false);
        txtdatosfalsospre18.setVisible(false);
        txtdatosfalsospre19.setVisible(false);
        txtdatosfalsospre24.setVisible(false);
        txtdatosfalsospre26.setVisible(false);

        jLabel62.setVisible(false);
        jLabel63.setVisible(false);
        jLabel64.setVisible(false);
        jLabel65.setVisible(false);
        jLabel66.setVisible(false);
        jLabel67.setVisible(false);
        jLabel68.setVisible(false);
        jLabel69.setVisible(false);
        jLabel70.setVisible(false);
        jLabel71.setVisible(false);
        jLabel72.setVisible(false);
        jLabel73.setVisible(false);
        jLabel76.setVisible(false);
        jLabel77.setVisible(false);
        jLabel78.setVisible(false);
        jLabel79.setVisible(false);
        jLabel80.setVisible(false);
        jLabel81.setVisible(false);
        jLabel38.setVisible(false);
        jLabel37.setVisible(false);
        jLabel36.setVisible(false);
        jLabel32.setVisible(false);
        jLabel33.setVisible(false);
        jLabel34.setVisible(false);
        jLabel35.setVisible(false);
        jLabel48.setVisible(false);
        jLabel47.setVisible(false);
        jLabel45.setVisible(false);
        jLabel46.setVisible(false);
        jLabel44.setVisible(false);
        jLabel43.setVisible(false);
        jLabel42.setVisible(false);
        jLabel40.setVisible(false);
        jLabel55.setVisible(false);
        jLabel54.setVisible(false);
        jLabel53.setVisible(false);
        jLabel56.setVisible(false);
        jLabel57.setVisible(false);

        jRadioButton15.setVisible(false);
        jRadioButton20.setVisible(false);
        jRadioButton21.setVisible(false);
        jRadioButton22.setVisible(false);
        jRadioButton23.setVisible(false);
        jRadioButton25.setVisible(false);
        jRadioButton26.setVisible(false);
        jRadioButton27.setVisible(false);
        jRadioButton28.setVisible(false);
        jRadioButton29.setVisible(false);
        jRadioButton30.setVisible(false);
        jRadioButton31.setVisible(false);
        jRadioButton34.setVisible(false);
        jRadioButton35.setVisible(false);
        jRadioButton36.setVisible(false);
        jRadioButton37.setVisible(false);
        jRadioButton38.setVisible(false);
        jRadioButton39.setVisible(false);
        jRadioButton1.setVisible(false);
        jRadioButton2.setVisible(false);
        jRadioButton3.setVisible(false);
        jRadioButton4.setVisible(false);
        jRadioButton5.setVisible(false);
        jRadioButton6.setVisible(false);
        jRadioButton7.setVisible(false);
        jRadioButton9.setVisible(false);
        jRadioButton8.setVisible(false);
        jRadioButton10.setVisible(false);
        jRadioButton11.setVisible(false);
        jRadioButton12.setVisible(false);
        jRadioButton13.setVisible(false);
        jRadioButton14.setVisible(false);
        jRadioButton16.setVisible(false);
        jRadioButton17.setVisible(false);
        jRadioButton18.setVisible(false);
        jRadioButton19.setVisible(false);
        jRadioButton24.setVisible(false);
    }

    public void nodisponiblesingreso() {
        txtdatosfalsospre27.setVisible(false);
        jLabel58.setVisible(false);
        txtdatosfalsospre28.setVisible(false);
        jLabel59.setVisible(false);
        txtdatosfalsospre26.setVisible(false);
        jLabel57.setVisible(false);

        jLabel39.setVisible(false);

        chbxcertiaca.setVisible(false);
        chbxcertilabo.setVisible(false);
        chbxdocperso.setVisible(false);
        chbxrefpers.setVisible(false);
        chbxcertante.setVisible(false);
        chbxinforentre.setVisible(false);
        chbxinforhv.setVisible(false);
        chbxinforentrepoli.setVisible(false);

        txtdatosfalsospre25.setVisible(false);

    }

    public void limpiar() {
        jCheckBox30.setSelected(false);
        jCheckBox29.setSelected(false);        
        jCheckBox81.setSelected(false);        
        jCheckBox82.setSelected(false);        
        jCheckBox83.setSelected(false);        
        jCheckBox84.setSelected(false);        
        jCheckBox85.setSelected(false);        
        jCheckBox86.setSelected(false);        
        jCheckBox87.setSelected(false);        
        jCheckBox88.setSelected(false);        
        jCheckBox89.setSelected(false);        
        jCheckBox90.setSelected(false);        
        jCheckBox91.setSelected(false);        
        jCheckBox92.setSelected(false);        
        jCheckBox93.setSelected(false);        
        jCheckBox94.setSelected(false);        
        jCheckBox95.setSelected(false);        
        jCheckBox96.setSelected(false);        
        jCheckBox97.setSelected(false);        
        jCheckBox98.setSelected(false);        
        jCheckBox99.setSelected(false);        
        jCheckBox100.setSelected(false);        
        jCheckBox101.setSelected(false);        
        jCheckBox102.setSelected(false);        
        jCheckBox103.setSelected(false);        
        jCheckBox104.setSelected(false);        
        jCheckBox105.setSelected(false);        
        jCheckBox106.setSelected(false);        
        jCheckBox107.setSelected(false);        
        jCheckBox108.setSelected(false);        
        jCheckBox109.setSelected(false);        
        jCheckBox110.setSelected(false);        
        jCheckBox115.setSelected(false);        
        jCheckBox116.setSelected(false);        
        jCheckBox117.setSelected(false);        
        jCheckBox118.setSelected(false);        
        jCheckBox119.setSelected(false);        
        jCheckBox120.setSelected(false);        
        jCheckBox121.setSelected(false);        
        jCheckBox122.setSelected(false);        
        jCheckBox123.setSelected(false);        
        jCheckBox124.setSelected(false);        
        jCheckBox125.setSelected(false);        
        jCheckBox126.setSelected(false);        
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
        jCheckBox48.setSelected(false);        
        jCheckBox49.setSelected(false);        
        jCheckBox50.setSelected(false);        
        jCheckBox51.setSelected(false);        
        jCheckBox52.setSelected(false);        
        jCheckBox53.setSelected(false);        
        jCheckBox54.setSelected(false);        
        jCheckBox55.setSelected(false);        
        jCheckBox56.setSelected(false);        
        jCheckBox57.setSelected(false);        
        jCheckBox58.setSelected(false);        
        jCheckBox61.setSelected(false);        
        jCheckBox62.setSelected(false);        
        jCheckBox63.setSelected(false);        
        jCheckBox64.setSelected(false);        
        jCheckBox65.setSelected(false);        
        jCheckBox66.setSelected(false);        
        jCheckBox67.setSelected(false);        
        jCheckBox68.setSelected(false);        
        jCheckBox77.setSelected(false);        
        jCheckBox78.setSelected(false);        
        jCheckBox79.setSelected(false);        
        jCheckBox80.setSelected(false);
        
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
        jRadioButton11.setSelected(false);        
        jRadioButton12.setSelected(false);        
        jRadioButton13.setSelected(false);        
        jRadioButton14.setSelected(false);        
        jRadioButton15.setSelected(false);        
        jRadioButton16.setSelected(false);        
        jRadioButton17.setSelected(false);        
        jRadioButton18.setSelected(false);        
        jRadioButton19.setSelected(false);        
        jRadioButton24.setSelected(false);        
        
        chbxcertiaca.setSelected(false);
        chbxcertilabo.setSelected(false);
        chbxdocperso.setSelected(false);
        chbxrefpers.setSelected(false);
        chbxcertante.setSelected(false);
        chbxinforentre.setSelected(false);
        chbxinforhv.setSelected(false);
        chbxinforentrepoli.setSelected(false);
        
        chbxbodegueros1.setSelected(false);        
        chbxbodegueros2.setSelected(false);        
        chbxbodegueros3.setSelected(false);        
        chbxbodegueros4.setSelected(false);        
        chbxbodegueros7.setSelected(false);        
        chbxbodegueros8.setSelected(false);        
        chbxbodegueros5.setSelected(false);        
        chbxbodegueros6.setSelected(false);        
        chbxbodegueros7.setSelected(false);
        
        txtdatosfalsospre1.setText("");
        txtdatosfalsospre2.setText("");
        txtdatosfalsospre3.setText("");
        txtdatosfalsospre4.setText("");
        txtdatosfalsospre5.setText("");
        txtdatosfalsospre6.setText("");
        txtdatosfalsospre7.setText("");
        txtdatosfalsospre8.setText("");
        txtdatosfalsospre9.setText("");
        txtdatosfalsospre10.setText("");
        txtdatosfalsospre11.setText("");
        txtdatosfalsospre12.setText("");
        txtdatosfalsospre13.setText("");    
        txtdatosfalsospre14.setText("");
        txtdatosfalsospre16.setText("");
        txtdatosfalsospre17.setText("");
        txtdatosfalsospre18.setText("");
        txtdatosfalsospre19.setText("");
        txtdatosfalsospre24.setText("");
        txtdatosfalsospre25.setText("");
        txtdatosfalsospre26.setText("");
        txtdatosfalsospre27.setText("");
        txtdatosfalsospre28.setText("");
        
        txtcompacti1.setText("");           
        txtcompacti2.setText("");           
        txtcompacti3.setText("");           
        txtcompacti4.setText("");           
        txtcompacti5.setText("");           
        txtcompacti6.setText("");           
        txtcompacti7.setText("");           
        txtcompacti8.setText("");           
        txtcompacti9.setText("");           
        txtcompacti10.setText("");           
        txtcompacti11.setText("");           
        txtcompacti12.setText("");           
        txtcompacti13.setText("");           
        txtcompacti14.setText("");           
        txtcompacti15.setText("");           
        txtcompacti16.setText("");           
        txtcompacti17.setText("");           
        txtcompacti18.setText("");           
        txtcompacti19.setText("");           
        txtcompacti20.setText("");           
        txtcompacti21.setText("");           
        txtcompacti22.setText("");       
        
        jScrollPane1.getVerticalScrollBar().setValue(0);
    }

    Thinking_uh iconThinking_uh = new Thinking_uh();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel13 = new javax.swing.JPanel();
        jLabel57 = new javax.swing.JLabel();
        txtdatosfalsospre26 = new javax.swing.JTextField();
        datosfalsospre15 = new javax.swing.JLabel();
        jCheckBox79 = new javax.swing.JCheckBox();
        jCheckBox80 = new javax.swing.JCheckBox();
        jPanel1 = new javax.swing.JPanel();
        txtdatosfalsospre25 = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        jCheckBox82 = new javax.swing.JCheckBox();
        jLabel59 = new javax.swing.JLabel();
        txtdatosfalsospre28 = new javax.swing.JTextField();
        datosfalsospre26 = new javax.swing.JLabel();
        jCheckBox83 = new javax.swing.JCheckBox();
        jCheckBox84 = new javax.swing.JCheckBox();
        jLabel210 = new javax.swing.JLabel();
        chbxcertiaca = new javax.swing.JCheckBox();
        chbxinforentre = new javax.swing.JCheckBox();
        chbxinforhv = new javax.swing.JCheckBox();
        chbxcertante = new javax.swing.JCheckBox();
        chbxcertilabo = new javax.swing.JCheckBox();
        chbxdocperso = new javax.swing.JCheckBox();
        chbxinforentrepoli = new javax.swing.JCheckBox();
        chbxrefpers = new javax.swing.JCheckBox();
        jLabel58 = new javax.swing.JLabel();
        txtdatosfalsospre27 = new javax.swing.JTextField();
        datosfalsospre25 = new javax.swing.JLabel();
        jCheckBox81 = new javax.swing.JCheckBox();
        jCheckBox30 = new javax.swing.JCheckBox();
        jCheckBox29 = new javax.swing.JCheckBox();
        jPanel3 = new javax.swing.JPanel();
        chbxbodegueros3 = new javax.swing.JCheckBox();
        chbxbodegueros4 = new javax.swing.JCheckBox();
        chbxbodegueros5 = new javax.swing.JCheckBox();
        chbxbodegueros6 = new javax.swing.JCheckBox();
        chbxbodegueros7 = new javax.swing.JCheckBox();
        txtcompacti1 = new javax.swing.JTextField();
        txtcompacti2 = new javax.swing.JTextField();
        chbxbodegueros8 = new javax.swing.JCheckBox();
        chbxbodegueros9 = new javax.swing.JCheckBox();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel138 = new javax.swing.JLabel();
        jLabel139 = new javax.swing.JLabel();
        chbxbodegueros1 = new javax.swing.JCheckBox();
        chbxbodegueros2 = new javax.swing.JCheckBox();
        jPanel2 = new javax.swing.JPanel();
        datosfalsospre27 = new javax.swing.JLabel();
        jCheckBox85 = new javax.swing.JCheckBox();
        jCheckBox86 = new javax.swing.JCheckBox();
        datosfalsospre31 = new javax.swing.JLabel();
        datosfalsospre32 = new javax.swing.JLabel();
        datosfalsospre34 = new javax.swing.JLabel();
        datosfalsospre35 = new javax.swing.JLabel();
        datosfalsospre36 = new javax.swing.JLabel();
        datosfalsospre37 = new javax.swing.JLabel();
        datosfalsospre38 = new javax.swing.JLabel();
        datosfalsospre39 = new javax.swing.JLabel();
        datosfalsospre40 = new javax.swing.JLabel();
        jRadioButton22 = new javax.swing.JRadioButton();
        jCheckBox93 = new javax.swing.JCheckBox();
        jCheckBox94 = new javax.swing.JCheckBox();
        jRadioButton23 = new javax.swing.JRadioButton();
        jCheckBox95 = new javax.swing.JCheckBox();
        jCheckBox96 = new javax.swing.JCheckBox();
        jRadioButton25 = new javax.swing.JRadioButton();
        jCheckBox97 = new javax.swing.JCheckBox();
        jCheckBox98 = new javax.swing.JCheckBox();
        jRadioButton26 = new javax.swing.JRadioButton();
        jCheckBox99 = new javax.swing.JCheckBox();
        jCheckBox100 = new javax.swing.JCheckBox();
        jRadioButton27 = new javax.swing.JRadioButton();
        jCheckBox101 = new javax.swing.JCheckBox();
        jCheckBox102 = new javax.swing.JCheckBox();
        jRadioButton28 = new javax.swing.JRadioButton();
        jCheckBox103 = new javax.swing.JCheckBox();
        jCheckBox104 = new javax.swing.JCheckBox();
        jRadioButton29 = new javax.swing.JRadioButton();
        jCheckBox105 = new javax.swing.JCheckBox();
        jCheckBox106 = new javax.swing.JCheckBox();
        jRadioButton30 = new javax.swing.JRadioButton();
        jCheckBox107 = new javax.swing.JCheckBox();
        jCheckBox108 = new javax.swing.JCheckBox();
        jRadioButton31 = new javax.swing.JRadioButton();
        jCheckBox109 = new javax.swing.JCheckBox();
        jCheckBox110 = new javax.swing.JCheckBox();
        jLabel65 = new javax.swing.JLabel();
        txtcompacti6 = new javax.swing.JTextField();
        jLabel66 = new javax.swing.JLabel();
        txtcompacti7 = new javax.swing.JTextField();
        jLabel67 = new javax.swing.JLabel();
        txtcompacti8 = new javax.swing.JTextField();
        jLabel68 = new javax.swing.JLabel();
        txtcompacti9 = new javax.swing.JTextField();
        jLabel69 = new javax.swing.JLabel();
        txtcompacti10 = new javax.swing.JTextField();
        jLabel70 = new javax.swing.JLabel();
        txtcompacti11 = new javax.swing.JTextField();
        jLabel71 = new javax.swing.JLabel();
        txtcompacti12 = new javax.swing.JTextField();
        jLabel72 = new javax.swing.JLabel();
        txtcompacti13 = new javax.swing.JTextField();
        jLabel73 = new javax.swing.JLabel();
        txtcompacti14 = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jLabel62 = new javax.swing.JLabel();
        txtcompacti3 = new javax.swing.JTextField();
        datosfalsospre28 = new javax.swing.JLabel();
        jCheckBox88 = new javax.swing.JCheckBox();
        jCheckBox87 = new javax.swing.JCheckBox();
        jRadioButton15 = new javax.swing.JRadioButton();
        jLabel64 = new javax.swing.JLabel();
        txtcompacti5 = new javax.swing.JTextField();
        datosfalsospre30 = new javax.swing.JLabel();
        jCheckBox92 = new javax.swing.JCheckBox();
        jCheckBox91 = new javax.swing.JCheckBox();
        jRadioButton21 = new javax.swing.JRadioButton();
        jLabel63 = new javax.swing.JLabel();
        txtcompacti4 = new javax.swing.JTextField();
        datosfalsospre29 = new javax.swing.JLabel();
        jCheckBox90 = new javax.swing.JCheckBox();
        jCheckBox89 = new javax.swing.JCheckBox();
        jRadioButton20 = new javax.swing.JRadioButton();
        jPanel4 = new javax.swing.JPanel();
        datosfalsospre41 = new javax.swing.JLabel();
        datosfalsospre42 = new javax.swing.JLabel();
        datosfalsospre43 = new javax.swing.JLabel();
        datosfalsospre44 = new javax.swing.JLabel();
        datosfalsospre45 = new javax.swing.JLabel();
        datosfalsospre46 = new javax.swing.JLabel();
        datosfalsospre47 = new javax.swing.JLabel();
        datosfalsospre48 = new javax.swing.JLabel();
        jRadioButton34 = new javax.swing.JRadioButton();
        jCheckBox115 = new javax.swing.JCheckBox();
        jCheckBox116 = new javax.swing.JCheckBox();
        jRadioButton35 = new javax.swing.JRadioButton();
        jCheckBox117 = new javax.swing.JCheckBox();
        jCheckBox118 = new javax.swing.JCheckBox();
        jRadioButton36 = new javax.swing.JRadioButton();
        jCheckBox119 = new javax.swing.JCheckBox();
        jCheckBox120 = new javax.swing.JCheckBox();
        jRadioButton37 = new javax.swing.JRadioButton();
        jCheckBox121 = new javax.swing.JCheckBox();
        jCheckBox122 = new javax.swing.JCheckBox();
        jCheckBox123 = new javax.swing.JCheckBox();
        jCheckBox124 = new javax.swing.JCheckBox();
        jRadioButton38 = new javax.swing.JRadioButton();
        jCheckBox125 = new javax.swing.JCheckBox();
        jCheckBox126 = new javax.swing.JCheckBox();
        jRadioButton39 = new javax.swing.JRadioButton();
        jLabel74 = new javax.swing.JLabel();
        txtcompacti15 = new javax.swing.JTextField();
        jLabel75 = new javax.swing.JLabel();
        txtcompacti16 = new javax.swing.JTextField();
        jLabel76 = new javax.swing.JLabel();
        txtcompacti17 = new javax.swing.JTextField();
        jLabel77 = new javax.swing.JLabel();
        txtcompacti18 = new javax.swing.JTextField();
        jLabel78 = new javax.swing.JLabel();
        txtcompacti19 = new javax.swing.JTextField();
        jLabel79 = new javax.swing.JLabel();
        txtcompacti20 = new javax.swing.JTextField();
        jLabel80 = new javax.swing.JLabel();
        txtcompacti21 = new javax.swing.JTextField();
        jLabel81 = new javax.swing.JLabel();
        txtcompacti22 = new javax.swing.JTextField();
        datosfalsospre50 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        datosfalsospre1 = new javax.swing.JLabel();
        datosfalsospre2 = new javax.swing.JLabel();
        datosfalsospre3 = new javax.swing.JLabel();
        datosfalsospre4 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        txtdatosfalsospre1 = new javax.swing.JTextField();
        txtdatosfalsospre2 = new javax.swing.JTextField();
        txtdatosfalsospre3 = new javax.swing.JTextField();
        txtdatosfalsospre4 = new javax.swing.JTextField();
        jCheckBox31 = new javax.swing.JCheckBox();
        jCheckBox32 = new javax.swing.JCheckBox();
        jCheckBox33 = new javax.swing.JCheckBox();
        jCheckBox34 = new javax.swing.JCheckBox();
        jCheckBox35 = new javax.swing.JCheckBox();
        jCheckBox36 = new javax.swing.JCheckBox();
        jCheckBox37 = new javax.swing.JCheckBox();
        jCheckBox38 = new javax.swing.JCheckBox();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jCheckBox42 = new javax.swing.JCheckBox();
        jCheckBox43 = new javax.swing.JCheckBox();
        jCheckBox44 = new javax.swing.JCheckBox();
        jCheckBox45 = new javax.swing.JCheckBox();
        jCheckBox46 = new javax.swing.JCheckBox();
        datosfalsospre5 = new javax.swing.JLabel();
        datosfalsospre6 = new javax.swing.JLabel();
        datosfalsospre7 = new javax.swing.JLabel();
        datosfalsospre8 = new javax.swing.JLabel();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        jRadioButton7 = new javax.swing.JRadioButton();
        jRadioButton9 = new javax.swing.JRadioButton();
        jLabel48 = new javax.swing.JLabel();
        txtdatosfalsospre5 = new javax.swing.JTextField();
        txtdatosfalsospre6 = new javax.swing.JTextField();
        txtdatosfalsospre7 = new javax.swing.JTextField();
        txtdatosfalsospre8 = new javax.swing.JTextField();
        jCheckBox39 = new javax.swing.JCheckBox();
        jCheckBox40 = new javax.swing.JCheckBox();
        jCheckBox41 = new javax.swing.JCheckBox();
        jCheckBox47 = new javax.swing.JCheckBox();
        jCheckBox48 = new javax.swing.JCheckBox();
        jCheckBox49 = new javax.swing.JCheckBox();
        jCheckBox50 = new javax.swing.JCheckBox();
        jCheckBox51 = new javax.swing.JCheckBox();
        jCheckBox52 = new javax.swing.JCheckBox();
        jCheckBox53 = new javax.swing.JCheckBox();
        jCheckBox54 = new javax.swing.JCheckBox();
        datosfalsospre9 = new javax.swing.JLabel();
        datosfalsospre12 = new javax.swing.JLabel();
        datosfalsospre10 = new javax.swing.JLabel();
        datosfalsospre11 = new javax.swing.JLabel();
        jRadioButton8 = new javax.swing.JRadioButton();
        jRadioButton10 = new javax.swing.JRadioButton();
        jRadioButton11 = new javax.swing.JRadioButton();
        jRadioButton12 = new javax.swing.JRadioButton();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        txtdatosfalsospre9 = new javax.swing.JTextField();
        txtdatosfalsospre10 = new javax.swing.JTextField();
        txtdatosfalsospre11 = new javax.swing.JTextField();
        txtdatosfalsospre12 = new javax.swing.JTextField();
        jCheckBox55 = new javax.swing.JCheckBox();
        jCheckBox56 = new javax.swing.JCheckBox();
        jCheckBox57 = new javax.swing.JCheckBox();
        jCheckBox58 = new javax.swing.JCheckBox();
        datosfalsospre14 = new javax.swing.JLabel();
        datosfalsospre13 = new javax.swing.JLabel();
        jRadioButton13 = new javax.swing.JRadioButton();
        jRadioButton14 = new javax.swing.JRadioButton();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        txtdatosfalsospre13 = new javax.swing.JTextField();
        txtdatosfalsospre14 = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        jCheckBox61 = new javax.swing.JCheckBox();
        jCheckBox62 = new javax.swing.JCheckBox();
        jCheckBox63 = new javax.swing.JCheckBox();
        jCheckBox64 = new javax.swing.JCheckBox();
        jCheckBox65 = new javax.swing.JCheckBox();
        jCheckBox66 = new javax.swing.JCheckBox();
        jCheckBox67 = new javax.swing.JCheckBox();
        jCheckBox68 = new javax.swing.JCheckBox();
        datosfalsospre16 = new javax.swing.JLabel();
        datosfalsospre17 = new javax.swing.JLabel();
        datosfalsospre18 = new javax.swing.JLabel();
        datosfalsospre19 = new javax.swing.JLabel();
        jRadioButton16 = new javax.swing.JRadioButton();
        jRadioButton17 = new javax.swing.JRadioButton();
        jRadioButton18 = new javax.swing.JRadioButton();
        jRadioButton19 = new javax.swing.JRadioButton();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        txtdatosfalsospre16 = new javax.swing.JTextField();
        txtdatosfalsospre17 = new javax.swing.JTextField();
        txtdatosfalsospre18 = new javax.swing.JTextField();
        txtdatosfalsospre19 = new javax.swing.JTextField();
        jCheckBox77 = new javax.swing.JCheckBox();
        jCheckBox78 = new javax.swing.JCheckBox();
        datosfalsospre24 = new javax.swing.JLabel();
        jRadioButton24 = new javax.swing.JRadioButton();
        jLabel56 = new javax.swing.JLabel();
        txtdatosfalsospre24 = new javax.swing.JTextField();
        datosfalsospre20 = new javax.swing.JLabel();
        datosfalsospre21 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(null);
        setPreferredSize(new java.awt.Dimension(975, 550));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));

        jLabel57.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtdatosfalsospre26.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtdatosfalsospre26.setBorder(null);
        txtdatosfalsospre26.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtdatosfalsospre26CaretUpdate(evt);
            }
        });
        txtdatosfalsospre26.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtdatosfalsospre26KeyTyped(evt);
            }
        });

        datosfalsospre15.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        datosfalsospre15.setText("¿Existe alguna admisión relevante en esta categoría?");

        jCheckBox79.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox79.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jCheckBox79.setText("Sí");
        jCheckBox79.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox79ItemStateChanged(evt);
            }
        });

        jCheckBox80.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox80.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jCheckBox80.setText("No");
        jCheckBox80.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox80ItemStateChanged(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        txtdatosfalsospre25.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtdatosfalsospre25.setBorder(null);
        txtdatosfalsospre25.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtdatosfalsospre25CaretUpdate(evt);
            }
        });
        txtdatosfalsospre25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdatosfalsospre25ActionPerformed(evt);
            }
        });
        txtdatosfalsospre25.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtdatosfalsospre25KeyTyped(evt);
            }
        });

        jLabel39.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jCheckBox82.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox82.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jCheckBox82.setText("No");
        jCheckBox82.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox82ItemStateChanged(evt);
            }
        });

        jLabel59.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtdatosfalsospre28.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtdatosfalsospre28.setBorder(null);
        txtdatosfalsospre28.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtdatosfalsospre28CaretUpdate(evt);
            }
        });
        txtdatosfalsospre28.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtdatosfalsospre28KeyTyped(evt);
            }
        });

        datosfalsospre26.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        datosfalsospre26.setText("¿Ha sobornado a alguien para obtener de manera irregular alguno de los documentos ya mencionados?");

        jCheckBox83.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox83.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jCheckBox83.setText("Sí");
        jCheckBox83.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox83ItemStateChanged(evt);
            }
        });

        jCheckBox84.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox84.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jCheckBox84.setText("No");
        jCheckBox84.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox84ItemStateChanged(evt);
            }
        });

        jLabel210.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel210.setText("¿Ha suministrado usted alguna información falsa en este proceso de selección con TP?");

        chbxcertiaca.setBackground(new java.awt.Color(255, 255, 255));
        chbxcertiaca.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        chbxcertiaca.setText("Certificaciones académicas");
        chbxcertiaca.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chbxcertiacaItemStateChanged(evt);
            }
        });
        chbxcertiaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chbxcertiacaActionPerformed(evt);
            }
        });

        chbxinforentre.setBackground(new java.awt.Color(255, 255, 255));
        chbxinforentre.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        chbxinforentre.setText("Información suministrada en la entrevista");
        chbxinforentre.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chbxinforentreItemStateChanged(evt);
            }
        });
        chbxinforentre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chbxinforentreActionPerformed(evt);
            }
        });

        chbxinforhv.setBackground(new java.awt.Color(255, 255, 255));
        chbxinforhv.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        chbxinforhv.setText("Información suministrada en la hoja de vida");
        chbxinforhv.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chbxinforhvItemStateChanged(evt);
            }
        });
        chbxinforhv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chbxinforhvActionPerformed(evt);
            }
        });

        chbxcertante.setBackground(new java.awt.Color(255, 255, 255));
        chbxcertante.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        chbxcertante.setText("Certificaciones de antecedentes");
        chbxcertante.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chbxcertanteItemStateChanged(evt);
            }
        });
        chbxcertante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chbxcertanteActionPerformed(evt);
            }
        });

        chbxcertilabo.setBackground(new java.awt.Color(255, 255, 255));
        chbxcertilabo.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        chbxcertilabo.setText("Certificaciones laborales");
        chbxcertilabo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chbxcertilaboItemStateChanged(evt);
            }
        });
        chbxcertilabo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chbxcertilaboActionPerformed(evt);
            }
        });

        chbxdocperso.setBackground(new java.awt.Color(255, 255, 255));
        chbxdocperso.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        chbxdocperso.setText("Documentación personal");
        chbxdocperso.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chbxdocpersoItemStateChanged(evt);
            }
        });
        chbxdocperso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chbxdocpersoActionPerformed(evt);
            }
        });

        chbxinforentrepoli.setBackground(new java.awt.Color(255, 255, 255));
        chbxinforentrepoli.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        chbxinforentrepoli.setText("Información suministrada en la entrevista de poligrafía");
        chbxinforentrepoli.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chbxinforentrepoliItemStateChanged(evt);
            }
        });
        chbxinforentrepoli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chbxinforentrepoliActionPerformed(evt);
            }
        });

        chbxrefpers.setBackground(new java.awt.Color(255, 255, 255));
        chbxrefpers.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        chbxrefpers.setText("Referencias personales");
        chbxrefpers.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chbxrefpersItemStateChanged(evt);
            }
        });
        chbxrefpers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chbxrefpersActionPerformed(evt);
            }
        });

        jLabel58.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtdatosfalsospre27.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtdatosfalsospre27.setBorder(null);
        txtdatosfalsospre27.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtdatosfalsospre27CaretUpdate(evt);
            }
        });
        txtdatosfalsospre27.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtdatosfalsospre27KeyTyped(evt);
            }
        });

        datosfalsospre25.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        datosfalsospre25.setText("¿Ha falsificado o adulterado algún documento que soporta su hoja de vida?");

        jCheckBox81.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox81.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jCheckBox81.setText("Sí");
        jCheckBox81.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox81ItemStateChanged(evt);
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtdatosfalsospre25, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(chbxcertiaca)
                                        .addComponent(chbxcertilabo, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(chbxdocperso, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(chbxrefpers))
                                .addGap(22, 22, 22)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(chbxinforhv)
                                    .addComponent(chbxcertante)
                                    .addComponent(chbxinforentrepoli)
                                    .addComponent(chbxinforentre)))
                            .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel210)
                                .addGap(301, 301, 301)
                                .addComponent(jCheckBox30, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckBox29, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(datosfalsospre26)
                                    .addGap(191, 191, 191)
                                    .addComponent(jCheckBox83, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jCheckBox84, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(txtdatosfalsospre28, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(datosfalsospre25)
                                    .addGap(365, 365, 365)
                                    .addComponent(jCheckBox81, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jCheckBox82, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(txtdatosfalsospre27, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(30, 30, 30))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel210)
                    .addComponent(jCheckBox30, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox29, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chbxcertiaca)
                    .addComponent(chbxcertante))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chbxinforentre)
                    .addComponent(chbxcertilabo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chbxinforhv)
                    .addComponent(chbxdocperso))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chbxinforentrepoli)
                    .addComponent(chbxrefpers))
                .addGap(5, 5, 5)
                .addComponent(txtdatosfalsospre25, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(datosfalsospre25)
                    .addComponent(jCheckBox81, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox82, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addComponent(txtdatosfalsospre27, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(datosfalsospre26)
                    .addComponent(jCheckBox83, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox84, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addComponent(txtdatosfalsospre28, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        chbxbodegueros3.setBackground(new java.awt.Color(255, 255, 255));
        chbxbodegueros3.setFont(new java.awt.Font("Segoe UI Emoji", 0, 13)); // NOI18N
        chbxbodegueros3.setText("Descargos");

        chbxbodegueros4.setBackground(new java.awt.Color(255, 255, 255));
        chbxbodegueros4.setFont(new java.awt.Font("Segoe UI Emoji", 0, 13)); // NOI18N
        chbxbodegueros4.setText("Llamados de atención verbal");

        chbxbodegueros5.setBackground(new java.awt.Color(255, 255, 255));
        chbxbodegueros5.setFont(new java.awt.Font("Segoe UI Emoji", 0, 13)); // NOI18N
        chbxbodegueros5.setText("Pasar por alto los protocolos o políticas de seguridad de la empresa.");

        chbxbodegueros6.setBackground(new java.awt.Color(255, 255, 255));
        chbxbodegueros6.setFont(new java.awt.Font("Segoe UI Emoji", 0, 13)); // NOI18N
        chbxbodegueros6.setText("Llegar tarde.");

        chbxbodegueros7.setBackground(new java.awt.Color(255, 255, 255));
        chbxbodegueros7.setFont(new java.awt.Font("Segoe UI Emoji", 0, 13)); // NOI18N
        chbxbodegueros7.setText("Inasistencia Injustificada.");

        txtcompacti1.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtcompacti1.setBorder(null);

        txtcompacti2.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtcompacti2.setBorder(null);

        chbxbodegueros8.setBackground(new java.awt.Color(255, 255, 255));
        chbxbodegueros8.setFont(new java.awt.Font("Segoe UI Emoji", 0, 13)); // NOI18N
        chbxbodegueros8.setText("Sanciones");

        chbxbodegueros9.setBackground(new java.awt.Color(255, 255, 255));
        chbxbodegueros9.setFont(new java.awt.Font("Segoe UI Emoji", 0, 13)); // NOI18N
        chbxbodegueros9.setText("Suspensiones");

        jLabel60.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel61.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel138.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel138.setText("Durante su trabajo en Teleperformance, ha recibido:");

        jLabel139.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel139.setText("Irregularidades desde el puesto de trabajo:");

        chbxbodegueros1.setBackground(new java.awt.Color(255, 255, 255));
        chbxbodegueros1.setFont(new java.awt.Font("Segoe UI Emoji", 0, 13)); // NOI18N
        chbxbodegueros1.setText("Action Form");

        chbxbodegueros2.setBackground(new java.awt.Color(255, 255, 255));
        chbxbodegueros2.setFont(new java.awt.Font("Segoe UI Emoji", 0, 13)); // NOI18N
        chbxbodegueros2.setText("Memorandos");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chbxbodegueros1)
                            .addComponent(chbxbodegueros2))
                        .addGap(60, 60, 60)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chbxbodegueros3)
                            .addComponent(chbxbodegueros4))
                        .addGap(60, 60, 60)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chbxbodegueros9)
                            .addComponent(chbxbodegueros8)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chbxbodegueros6)
                            .addComponent(chbxbodegueros5)
                            .addComponent(chbxbodegueros7)))
                    .addComponent(jLabel60, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel61, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel139)
                    .addComponent(jLabel138)
                    .addComponent(txtcompacti2, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcompacti1, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel138)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chbxbodegueros1)
                    .addComponent(chbxbodegueros3)
                    .addComponent(chbxbodegueros8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chbxbodegueros2)
                    .addComponent(chbxbodegueros4)
                    .addComponent(chbxbodegueros9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtcompacti1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel60, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(jLabel139)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chbxbodegueros5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chbxbodegueros6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chbxbodegueros7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtcompacti2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel61, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        datosfalsospre27.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        datosfalsospre27.setText("¿Tiene usted acceso a información bancaria del cliente?");

        jCheckBox85.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox85.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jCheckBox85.setText("Sí");
        jCheckBox85.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox85ItemStateChanged(evt);
            }
        });

        jCheckBox86.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox86.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jCheckBox86.setText("No");
        jCheckBox86.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox86ItemStateChanged(evt);
            }
        });

        datosfalsospre31.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        datosfalsospre31.setText("¿Ha sustraído o sacado de la operación algún dato confidencial de los usuarios que atiende en Teleperformance?");

        datosfalsospre32.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        datosfalsospre32.setText("¿Ha buscado en los aplicativos de TP o del cliente información de algún amigo, familiar, conocido o suya?");

        datosfalsospre34.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        datosfalsospre34.setText("¿Ha realizado captura de pantalla de la información personal o bancaria de los usuarios que atiende en Teleperformance?");

        datosfalsospre35.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        datosfalsospre35.setText("¿Ha memorizado alguna información sensible o privilegiada del usuario que atiende en Teleperformance?");

        datosfalsospre36.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        datosfalsospre36.setText("¿Ha suministrado usted login o claves de aplicativos de Teleperformance?");

        datosfalsospre37.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        datosfalsospre37.setText("¿Ha suplantado en Teleperformance a algún cliente? ");

        datosfalsospre38.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        datosfalsospre38.setText("¿Sabe usted con certeza de alguien que haya sacado información sensible de Teleperformance?");

        datosfalsospre39.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        datosfalsospre39.setText("¿Ha realizado malas prácticas para alterar sus métricas o KPI? ");

        datosfalsospre40.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        datosfalsospre40.setText("¿Sabe usted de alguien en Teleperformance que haya recibido algún beneficio por medio de fraudes en Teleperformance?");

        jRadioButton22.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton22.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jRadioButton22.setText("A");
        jRadioButton22.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButton22ItemStateChanged(evt);
            }
        });

        jCheckBox93.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox93.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jCheckBox93.setText("No");
        jCheckBox93.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox93ItemStateChanged(evt);
            }
        });

        jCheckBox94.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox94.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jCheckBox94.setText("Sí");
        jCheckBox94.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox94ItemStateChanged(evt);
            }
        });

        jRadioButton23.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton23.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jRadioButton23.setText("A");
        jRadioButton23.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButton23ItemStateChanged(evt);
            }
        });

        jCheckBox95.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox95.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jCheckBox95.setText("No");
        jCheckBox95.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox95ItemStateChanged(evt);
            }
        });

        jCheckBox96.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox96.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jCheckBox96.setText("Sí");
        jCheckBox96.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox96ItemStateChanged(evt);
            }
        });

        jRadioButton25.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton25.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jRadioButton25.setText("A");
        jRadioButton25.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButton25ItemStateChanged(evt);
            }
        });

        jCheckBox97.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox97.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jCheckBox97.setText("No");
        jCheckBox97.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox97ItemStateChanged(evt);
            }
        });

        jCheckBox98.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox98.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jCheckBox98.setText("Sí");
        jCheckBox98.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox98ItemStateChanged(evt);
            }
        });

        jRadioButton26.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton26.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jRadioButton26.setText("A");
        jRadioButton26.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButton26ItemStateChanged(evt);
            }
        });

        jCheckBox99.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox99.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jCheckBox99.setText("No");
        jCheckBox99.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox99ItemStateChanged(evt);
            }
        });

        jCheckBox100.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox100.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jCheckBox100.setText("Sí");
        jCheckBox100.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox100ItemStateChanged(evt);
            }
        });

        jRadioButton27.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton27.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jRadioButton27.setText("A");
        jRadioButton27.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButton27ItemStateChanged(evt);
            }
        });

        jCheckBox101.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox101.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jCheckBox101.setText("No");
        jCheckBox101.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox101ItemStateChanged(evt);
            }
        });

        jCheckBox102.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox102.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jCheckBox102.setText("Sí");
        jCheckBox102.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox102ItemStateChanged(evt);
            }
        });

        jRadioButton28.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton28.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jRadioButton28.setText("A");
        jRadioButton28.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButton28ItemStateChanged(evt);
            }
        });

        jCheckBox103.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox103.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jCheckBox103.setText("No");
        jCheckBox103.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox103ItemStateChanged(evt);
            }
        });

        jCheckBox104.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox104.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jCheckBox104.setText("Sí");
        jCheckBox104.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox104ItemStateChanged(evt);
            }
        });

        jRadioButton29.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton29.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jRadioButton29.setText("A");
        jRadioButton29.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButton29ItemStateChanged(evt);
            }
        });

        jCheckBox105.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox105.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jCheckBox105.setText("No");
        jCheckBox105.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox105ItemStateChanged(evt);
            }
        });

        jCheckBox106.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox106.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jCheckBox106.setText("Sí");
        jCheckBox106.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox106ItemStateChanged(evt);
            }
        });

        jRadioButton30.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton30.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jRadioButton30.setText("A");
        jRadioButton30.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButton30ItemStateChanged(evt);
            }
        });

        jCheckBox107.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox107.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jCheckBox107.setText("No");
        jCheckBox107.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox107ItemStateChanged(evt);
            }
        });

        jCheckBox108.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox108.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jCheckBox108.setText("Sí");
        jCheckBox108.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox108ItemStateChanged(evt);
            }
        });

        jRadioButton31.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton31.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jRadioButton31.setText("A");
        jRadioButton31.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButton31ItemStateChanged(evt);
            }
        });

        jCheckBox109.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox109.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jCheckBox109.setText("No");
        jCheckBox109.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox109ItemStateChanged(evt);
            }
        });

        jCheckBox110.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox110.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jCheckBox110.setText("Sí");
        jCheckBox110.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox110ItemStateChanged(evt);
            }
        });

        jLabel65.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtcompacti6.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtcompacti6.setBorder(null);
        txtcompacti6.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtcompacti6CaretUpdate(evt);
            }
        });

        jLabel66.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtcompacti7.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtcompacti7.setBorder(null);
        txtcompacti7.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtcompacti7CaretUpdate(evt);
            }
        });

        jLabel67.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtcompacti8.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtcompacti8.setBorder(null);
        txtcompacti8.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtcompacti8CaretUpdate(evt);
            }
        });

        jLabel68.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtcompacti9.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtcompacti9.setBorder(null);
        txtcompacti9.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtcompacti9CaretUpdate(evt);
            }
        });

        jLabel69.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtcompacti10.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtcompacti10.setBorder(null);
        txtcompacti10.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtcompacti10CaretUpdate(evt);
            }
        });

        jLabel70.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtcompacti11.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtcompacti11.setBorder(null);
        txtcompacti11.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtcompacti11CaretUpdate(evt);
            }
        });

        jLabel71.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtcompacti12.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtcompacti12.setBorder(null);
        txtcompacti12.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtcompacti12CaretUpdate(evt);
            }
        });

        jLabel72.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtcompacti13.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtcompacti13.setBorder(null);
        txtcompacti13.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtcompacti13CaretUpdate(evt);
            }
        });

        jLabel73.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtcompacti14.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtcompacti14.setBorder(null);
        txtcompacti14.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtcompacti14CaretUpdate(evt);
            }
        });

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        jLabel62.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtcompacti3.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtcompacti3.setBorder(null);
        txtcompacti3.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtcompacti3CaretUpdate(evt);
            }
        });

        datosfalsospre28.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        datosfalsospre28.setText("¿Ha sustraído algún dato de tarjetas bancarias (Crédito o Débito) de los usuarios que atiende en Teleperformance?");

        jCheckBox88.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox88.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jCheckBox88.setText("Sí");
        jCheckBox88.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox88ItemStateChanged(evt);
            }
        });

        jCheckBox87.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox87.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jCheckBox87.setText("No");
        jCheckBox87.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox87ItemStateChanged(evt);
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

        jLabel64.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtcompacti5.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtcompacti5.setBorder(null);
        txtcompacti5.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtcompacti5CaretUpdate(evt);
            }
        });

        datosfalsospre30.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        datosfalsospre30.setText("¿Ha realizado usted fraudes con productos financieros de los usuarios que atiende en Teleperformance?");

        jCheckBox92.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox92.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jCheckBox92.setText("Sí");
        jCheckBox92.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox92ItemStateChanged(evt);
            }
        });

        jCheckBox91.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox91.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jCheckBox91.setText("No");
        jCheckBox91.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox91ItemStateChanged(evt);
            }
        });

        jRadioButton21.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton21.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jRadioButton21.setText("A");
        jRadioButton21.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButton21ItemStateChanged(evt);
            }
        });

        jLabel63.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtcompacti4.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtcompacti4.setBorder(null);
        txtcompacti4.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtcompacti4CaretUpdate(evt);
            }
        });

        datosfalsospre29.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        datosfalsospre29.setText("¿Ha sustraído algún pin o clave de productos bancarios de los usuarios que atiende en Teleperformance?");

        jCheckBox90.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox90.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jCheckBox90.setText("Sí");
        jCheckBox90.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox90ItemStateChanged(evt);
            }
        });

        jCheckBox89.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox89.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jCheckBox89.setText("No");
        jCheckBox89.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox89ItemStateChanged(evt);
            }
        });

        jRadioButton20.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton20.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jRadioButton20.setText("A");
        jRadioButton20.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButton20ItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel63, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel62, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtcompacti3, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                            .addComponent(datosfalsospre29)
                            .addGap(132, 132, 132)
                            .addComponent(jCheckBox90, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jCheckBox89, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jRadioButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(txtcompacti4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtcompacti5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                            .addComponent(datosfalsospre30)
                            .addGap(140, 140, 140)
                            .addComponent(jCheckBox92, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jCheckBox91, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jRadioButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel64, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(datosfalsospre28, javax.swing.GroupLayout.PREFERRED_SIZE, 735, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(jCheckBox88, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox87, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(datosfalsospre28)
                    .addComponent(jRadioButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox88, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox87, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addComponent(txtcompacti3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel62, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(datosfalsospre29)
                    .addComponent(jRadioButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox90, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox89, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addComponent(txtcompacti4, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel63, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(datosfalsospre30)
                    .addComponent(jRadioButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox92, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox91, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addComponent(txtcompacti5, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel64, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtcompacti6, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel73, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtcompacti14, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel72, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtcompacti13, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel71, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtcompacti12, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel70, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtcompacti11, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel69, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtcompacti10, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel68, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtcompacti9, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel67, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel66, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel65, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(datosfalsospre40)
                            .addGap(33, 33, 33)
                            .addComponent(jCheckBox110, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jCheckBox109, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jRadioButton31, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jRadioButton26, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(datosfalsospre35)
                                    .addGap(132, 132, 132)
                                    .addComponent(jCheckBox100, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jCheckBox99, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(datosfalsospre34)
                                    .addGap(35, 35, 35)
                                    .addComponent(jCheckBox98, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jCheckBox97, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jRadioButton25, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(txtcompacti8, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addComponent(datosfalsospre36)
                            .addGap(324, 324, 324)
                            .addComponent(jCheckBox102, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jCheckBox101, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jRadioButton27, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addComponent(datosfalsospre37, javax.swing.GroupLayout.PREFERRED_SIZE, 513, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(257, 257, 257)
                            .addComponent(jCheckBox104, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jCheckBox103, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jRadioButton28, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addComponent(datosfalsospre38, javax.swing.GroupLayout.PREFERRED_SIZE, 612, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(158, 158, 158)
                            .addComponent(jCheckBox106, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jCheckBox105, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jRadioButton29, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addComponent(datosfalsospre39, javax.swing.GroupLayout.PREFERRED_SIZE, 614, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(156, 156, 156)
                            .addComponent(jCheckBox108, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jCheckBox107, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jRadioButton30, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(datosfalsospre31)
                            .addGap(86, 86, 86)
                            .addComponent(jCheckBox94, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jCheckBox93, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jRadioButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(datosfalsospre32)
                            .addGap(132, 132, 132)
                            .addComponent(jCheckBox96, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jCheckBox95, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jRadioButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(txtcompacti7, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(datosfalsospre27, javax.swing.GroupLayout.PREFERRED_SIZE, 769, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox85, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox86, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30))
            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(datosfalsospre27)
                    .addComponent(jCheckBox85, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox86, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(datosfalsospre31)
                    .addComponent(jRadioButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox94, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox93, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addComponent(txtcompacti6, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel65, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(datosfalsospre32)
                    .addComponent(jRadioButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox96, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox95, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addComponent(txtcompacti7, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel66, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(datosfalsospre34)
                    .addComponent(jRadioButton25, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox98, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox97, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addComponent(txtcompacti8, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel67, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(datosfalsospre35)
                    .addComponent(jRadioButton26, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox100, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox99, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addComponent(txtcompacti9, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel68, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(datosfalsospre36)
                    .addComponent(jRadioButton27, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox102, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox101, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addComponent(txtcompacti10, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel69, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton28, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox104, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox103, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(datosfalsospre37))
                .addGap(7, 7, 7)
                .addComponent(txtcompacti11, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel70, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(datosfalsospre38)
                    .addComponent(jRadioButton29, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox106, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox105, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addComponent(txtcompacti12, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel71, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(datosfalsospre39)
                    .addComponent(jRadioButton30, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox108, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox107, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addComponent(txtcompacti13, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel72, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(datosfalsospre40)
                    .addComponent(jRadioButton31, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox110, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox109, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addComponent(txtcompacti14, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel73, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        datosfalsospre41.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        datosfalsospre41.setText("¿Cuáles son las principales funciones de su cargo en Teleperformance?");

        datosfalsospre42.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        datosfalsospre42.setText("Una persona deshonesta en el cargo que usted ocupa en Teleperformance, ¿qué tipo de actos ilícitos o deshonestos podría realizar?");

        datosfalsospre43.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        datosfalsospre43.setText("¿Ha realizado usted fraudes en Teleperformance?");

        datosfalsospre44.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        datosfalsospre44.setText("¿Ha sustraído o sacado de Teleperformance datos confidenciales de alguno de los colaboradores de la empresa?:");

        datosfalsospre45.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        datosfalsospre45.setText("¿Le ha dado usted uso indebido a los aplicativos a los cuales tiene acceso en Teleperformance?");

        datosfalsospre46.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        datosfalsospre46.setText("¿Ha abusado usted de los beneficios que le brinda Teleperformance?");

        datosfalsospre47.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        datosfalsospre47.setText("¿Se ha apropiado usted en Teleperformance de algún activo fijo, información, insumos, suministros o alguna");

        datosfalsospre48.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        datosfalsospre48.setText("¿Ha realizado malas prácticas para alterar resultados sobre su labor?");

        jRadioButton34.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton34.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jRadioButton34.setText("A");
        jRadioButton34.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButton34ItemStateChanged(evt);
            }
        });

        jCheckBox115.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox115.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jCheckBox115.setText("No");
        jCheckBox115.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox115ItemStateChanged(evt);
            }
        });
        jCheckBox115.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox115ActionPerformed(evt);
            }
        });

        jCheckBox116.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox116.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jCheckBox116.setText("Sí");
        jCheckBox116.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox116ItemStateChanged(evt);
            }
        });
        jCheckBox116.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox116ActionPerformed(evt);
            }
        });

        jRadioButton35.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton35.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jRadioButton35.setText("A");
        jRadioButton35.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButton35ItemStateChanged(evt);
            }
        });

        jCheckBox117.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox117.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jCheckBox117.setText("No");
        jCheckBox117.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox117ItemStateChanged(evt);
            }
        });
        jCheckBox117.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox117ActionPerformed(evt);
            }
        });

        jCheckBox118.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox118.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jCheckBox118.setText("Sí");
        jCheckBox118.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox118ItemStateChanged(evt);
            }
        });
        jCheckBox118.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox118ActionPerformed(evt);
            }
        });

        jRadioButton36.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton36.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jRadioButton36.setText("A");
        jRadioButton36.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButton36ItemStateChanged(evt);
            }
        });

        jCheckBox119.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox119.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jCheckBox119.setText("No");
        jCheckBox119.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox119ItemStateChanged(evt);
            }
        });
        jCheckBox119.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox119ActionPerformed(evt);
            }
        });

        jCheckBox120.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox120.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jCheckBox120.setText("Sí");
        jCheckBox120.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox120ItemStateChanged(evt);
            }
        });
        jCheckBox120.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox120ActionPerformed(evt);
            }
        });

        jRadioButton37.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton37.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jRadioButton37.setText("A");
        jRadioButton37.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButton37ItemStateChanged(evt);
            }
        });

        jCheckBox121.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox121.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jCheckBox121.setText("No");
        jCheckBox121.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox121ItemStateChanged(evt);
            }
        });
        jCheckBox121.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox121ActionPerformed(evt);
            }
        });

        jCheckBox122.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox122.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jCheckBox122.setText("Sí");
        jCheckBox122.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox122ItemStateChanged(evt);
            }
        });
        jCheckBox122.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox122ActionPerformed(evt);
            }
        });

        jCheckBox123.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox123.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jCheckBox123.setText("Sí");
        jCheckBox123.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox123ItemStateChanged(evt);
            }
        });
        jCheckBox123.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox123ActionPerformed(evt);
            }
        });

        jCheckBox124.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox124.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jCheckBox124.setText("No");
        jCheckBox124.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox124ItemStateChanged(evt);
            }
        });
        jCheckBox124.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox124ActionPerformed(evt);
            }
        });

        jRadioButton38.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton38.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jRadioButton38.setText("A");
        jRadioButton38.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButton38ItemStateChanged(evt);
            }
        });

        jCheckBox125.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox125.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jCheckBox125.setText("Sí");
        jCheckBox125.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox125ItemStateChanged(evt);
            }
        });
        jCheckBox125.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox125ActionPerformed(evt);
            }
        });

        jCheckBox126.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox126.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jCheckBox126.setText("No");
        jCheckBox126.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox126ItemStateChanged(evt);
            }
        });
        jCheckBox126.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox126ActionPerformed(evt);
            }
        });

        jRadioButton39.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton39.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jRadioButton39.setText("A");
        jRadioButton39.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButton39ItemStateChanged(evt);
            }
        });

        jLabel74.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtcompacti15.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtcompacti15.setBorder(null);
        txtcompacti15.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtcompacti15CaretUpdate(evt);
            }
        });

        jLabel75.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtcompacti16.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtcompacti16.setBorder(null);
        txtcompacti16.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtcompacti16CaretUpdate(evt);
            }
        });

        jLabel76.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtcompacti17.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtcompacti17.setBorder(null);
        txtcompacti17.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtcompacti17CaretUpdate(evt);
            }
        });

        jLabel77.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtcompacti18.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtcompacti18.setBorder(null);
        txtcompacti18.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtcompacti18CaretUpdate(evt);
            }
        });

        jLabel78.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtcompacti19.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtcompacti19.setBorder(null);
        txtcompacti19.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtcompacti19CaretUpdate(evt);
            }
        });

        jLabel79.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtcompacti20.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtcompacti20.setBorder(null);
        txtcompacti20.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtcompacti20CaretUpdate(evt);
            }
        });

        jLabel80.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtcompacti21.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtcompacti21.setBorder(null);
        txtcompacti21.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtcompacti21CaretUpdate(evt);
            }
        });

        jLabel81.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtcompacti22.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtcompacti22.setBorder(null);
        txtcompacti22.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtcompacti22CaretUpdate(evt);
            }
        });

        datosfalsospre50.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        datosfalsospre50.setText(" herramienta de trabajo sin previa autorización?");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(txtcompacti17, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(datosfalsospre41, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                    .addComponent(datosfalsospre47, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGap(64, 64, 64)
                                    .addComponent(jCheckBox125, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jCheckBox126, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jRadioButton39, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel81, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtcompacti22, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(datosfalsospre50)
                                        .addComponent(jLabel75, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtcompacti16, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                                        .addComponent(datosfalsospre46)
                                                        .addGap(354, 354, 354)
                                                        .addComponent(jCheckBox123, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jCheckBox124, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                                        .addComponent(datosfalsospre48)
                                                        .addGap(355, 355, 355)
                                                        .addComponent(jCheckBox122, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jCheckBox121, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                                        .addComponent(datosfalsospre45)
                                                        .addGap(199, 199, 199)
                                                        .addComponent(jCheckBox120, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jCheckBox119, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                                        .addComponent(datosfalsospre44)
                                                        .addGap(86, 86, 86)
                                                        .addComponent(jCheckBox118, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jCheckBox117, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(0, 0, 0)
                                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jRadioButton37, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jRadioButton38, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jRadioButton36, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addComponent(jRadioButton35, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addComponent(jLabel76, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel77, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtcompacti18, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel79, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtcompacti20, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel80, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtcompacti21, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel78, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtcompacti19, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addComponent(datosfalsospre43, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGap(472, 472, 472)
                                                .addComponent(jCheckBox116, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jCheckBox115, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jRadioButton34, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(datosfalsospre42, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel74, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txtcompacti15, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(0, 0, Short.MAX_VALUE))))
                        .addGap(30, 30, 30))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(datosfalsospre41)
                .addGap(7, 7, 7)
                .addComponent(txtcompacti15, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel74, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(datosfalsospre42)
                .addGap(7, 7, 7)
                .addComponent(txtcompacti16, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel75, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(datosfalsospre43)
                    .addComponent(jRadioButton34, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox116, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox115, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addComponent(txtcompacti17, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel76, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(datosfalsospre44)
                    .addComponent(jRadioButton35, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox118, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox117, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addComponent(txtcompacti18, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel77, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(datosfalsospre45)
                    .addComponent(jRadioButton36, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox120, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox119, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addComponent(txtcompacti19, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel78, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(datosfalsospre48)
                    .addComponent(jRadioButton37, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox122, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox121, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addComponent(txtcompacti20, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel79, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(datosfalsospre46)
                    .addComponent(jRadioButton38, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox123, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox124, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addComponent(txtcompacti21, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel80, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(datosfalsospre47)
                    .addComponent(jRadioButton39, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox126, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox125, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addComponent(datosfalsospre50)
                .addGap(7, 7, 7)
                .addComponent(txtcompacti22, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel81, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jLabel32.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel36.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel37.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel38.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        datosfalsospre1.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        datosfalsospre1.setText("¿Ha suministrado usted información de contacto de compañeros de trabajo con fines ilícitos?");

        datosfalsospre2.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        datosfalsospre2.setText("¿Ha suministrado usted información privilegiada de Teleperformance a personas no autorizadas?");

        datosfalsospre3.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        datosfalsospre3.setText("¿Ha suministrado usted información de la seguridad física de las sedes u operaciones de Teleperformance para");

        datosfalsospre4.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        datosfalsospre4.setText("¿Ha suministrado usted información de Teleperformance a la competencia?");

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

        txtdatosfalsospre1.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtdatosfalsospre1.setBorder(null);
        txtdatosfalsospre1.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtdatosfalsospre1CaretUpdate(evt);
            }
        });

        txtdatosfalsospre2.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtdatosfalsospre2.setBorder(null);
        txtdatosfalsospre2.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtdatosfalsospre2CaretUpdate(evt);
            }
        });
        txtdatosfalsospre2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdatosfalsospre2ActionPerformed(evt);
            }
        });

        txtdatosfalsospre3.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtdatosfalsospre3.setBorder(null);
        txtdatosfalsospre3.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtdatosfalsospre3CaretUpdate(evt);
            }
        });

        txtdatosfalsospre4.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtdatosfalsospre4.setBorder(null);
        txtdatosfalsospre4.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtdatosfalsospre4CaretUpdate(evt);
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

        jCheckBox37.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox37.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jCheckBox37.setText("No");
        jCheckBox37.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox37ItemStateChanged(evt);
            }
        });

        jCheckBox38.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox38.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jCheckBox38.setText("Sí");
        jCheckBox38.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox38ItemStateChanged(evt);
            }
        });

        jLabel33.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel34.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel35.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

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

        datosfalsospre5.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        datosfalsospre5.setText("¿Ha pasado usted por alto las políticas, procedimientos y normas de Teleperformance?");

        datosfalsospre6.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        datosfalsospre6.setText("¿Ha participado o ha sido cómplice de alguna actividad fraudulenta en Teleperformance?");

        datosfalsospre7.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        datosfalsospre7.setText("¿Se ha puesto usted de acuerdo con personas internas o externas de la empresa para realizar");

        datosfalsospre8.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        datosfalsospre8.setText("¿Sabe usted con seguridad quien ha realizado actividades fraudulentas en Teleperformance?");

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

        jRadioButton7.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton7.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jRadioButton7.setText("A");
        jRadioButton7.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButton7ItemStateChanged(evt);
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

        jLabel48.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtdatosfalsospre5.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtdatosfalsospre5.setBorder(null);
        txtdatosfalsospre5.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtdatosfalsospre5CaretUpdate(evt);
            }
        });

        txtdatosfalsospre6.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtdatosfalsospre6.setBorder(null);
        txtdatosfalsospre6.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtdatosfalsospre6CaretUpdate(evt);
            }
        });

        txtdatosfalsospre7.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtdatosfalsospre7.setBorder(null);
        txtdatosfalsospre7.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtdatosfalsospre7CaretUpdate(evt);
            }
        });

        txtdatosfalsospre8.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtdatosfalsospre8.setBorder(null);
        txtdatosfalsospre8.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtdatosfalsospre8CaretUpdate(evt);
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

        jCheckBox49.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox49.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jCheckBox49.setText("No");
        jCheckBox49.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox49ItemStateChanged(evt);
            }
        });

        jCheckBox50.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox50.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jCheckBox50.setText("Sí");
        jCheckBox50.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox50ItemStateChanged(evt);
            }
        });

        jCheckBox51.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox51.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jCheckBox51.setText("No");
        jCheckBox51.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox51ItemStateChanged(evt);
            }
        });

        jCheckBox52.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox52.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jCheckBox52.setText("Sí");
        jCheckBox52.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox52ItemStateChanged(evt);
            }
        });

        jCheckBox53.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox53.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jCheckBox53.setText("No");
        jCheckBox53.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox53ItemStateChanged(evt);
            }
        });

        jCheckBox54.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox54.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jCheckBox54.setText("Sí");
        jCheckBox54.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox54ItemStateChanged(evt);
            }
        });

        datosfalsospre9.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        datosfalsospre9.setText("¿Sospecha usted de alguien que ha realizado actividades fraudulentas en Teleperformance?");

        datosfalsospre12.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        datosfalsospre12.setText("¿Usted ha sido contactado por un ex colaborador de TP para realizar fraudes en Teleperformance?");

        datosfalsospre10.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        datosfalsospre10.setText("¿A usted le han propuesto cometer fraudes en contra de Teleperformance?");

        datosfalsospre11.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        datosfalsospre11.setText("¿Ha aceptado usted propuestas para cometer fraudes en contra de Teleperformance?");

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

        jLabel44.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel45.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel46.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel47.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtdatosfalsospre9.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtdatosfalsospre9.setBorder(null);
        txtdatosfalsospre9.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtdatosfalsospre9CaretUpdate(evt);
            }
        });

        txtdatosfalsospre10.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtdatosfalsospre10.setBorder(null);
        txtdatosfalsospre10.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtdatosfalsospre10CaretUpdate(evt);
            }
        });

        txtdatosfalsospre11.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtdatosfalsospre11.setBorder(null);
        txtdatosfalsospre11.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtdatosfalsospre11CaretUpdate(evt);
            }
        });

        txtdatosfalsospre12.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtdatosfalsospre12.setBorder(null);
        txtdatosfalsospre12.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtdatosfalsospre12CaretUpdate(evt);
            }
        });

        jCheckBox55.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox55.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jCheckBox55.setText("No");
        jCheckBox55.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox55ItemStateChanged(evt);
            }
        });

        jCheckBox56.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox56.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jCheckBox56.setText("Sí");
        jCheckBox56.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox56ItemStateChanged(evt);
            }
        });

        jCheckBox57.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox57.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jCheckBox57.setText("No");
        jCheckBox57.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox57ItemStateChanged(evt);
            }
        });

        jCheckBox58.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox58.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jCheckBox58.setText("Sí");
        jCheckBox58.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox58ItemStateChanged(evt);
            }
        });

        datosfalsospre14.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        datosfalsospre14.setText("¿Usted ha aceptado propuestas de personas internas o externas para cometer fraudes en contra de Teleperformance?");

        datosfalsospre13.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        datosfalsospre13.setText("¿Usted ha sido coaccionado, presionado, amenazado por un superior para realizar fraudes en Teleperformance?");

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

        jLabel42.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel43.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtdatosfalsospre13.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtdatosfalsospre13.setBorder(null);
        txtdatosfalsospre13.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtdatosfalsospre13CaretUpdate(evt);
            }
        });

        txtdatosfalsospre14.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtdatosfalsospre14.setBorder(null);
        txtdatosfalsospre14.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtdatosfalsospre14CaretUpdate(evt);
            }
        });

        jLabel40.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jCheckBox61.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox61.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jCheckBox61.setText("No");
        jCheckBox61.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox61ItemStateChanged(evt);
            }
        });

        jCheckBox62.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox62.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jCheckBox62.setText("Sí");
        jCheckBox62.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox62ItemStateChanged(evt);
            }
        });

        jCheckBox63.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox63.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jCheckBox63.setText("No");
        jCheckBox63.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox63ItemStateChanged(evt);
            }
        });

        jCheckBox64.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox64.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jCheckBox64.setText("Sí");
        jCheckBox64.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox64ItemStateChanged(evt);
            }
        });

        jCheckBox65.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox65.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jCheckBox65.setText("No");
        jCheckBox65.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox65ItemStateChanged(evt);
            }
        });

        jCheckBox66.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox66.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jCheckBox66.setText("Sí");
        jCheckBox66.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox66ItemStateChanged(evt);
            }
        });

        jCheckBox67.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox67.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jCheckBox67.setText("No");
        jCheckBox67.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox67ItemStateChanged(evt);
            }
        });

        jCheckBox68.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox68.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jCheckBox68.setText("Sí");
        jCheckBox68.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox68ItemStateChanged(evt);
            }
        });

        datosfalsospre16.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        datosfalsospre16.setText("¿Usted ha recibido propuestas de personas internas o externas para cometer fraudes en Teleperformance?");

        datosfalsospre17.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        datosfalsospre17.setText("¿Ha realizado usted propuestas para cometer fraudes en Teleperformance?");

        datosfalsospre18.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        datosfalsospre18.setText("¿Ha utilizado su cargo en Teleperformance para beneficiarse o beneficiar a terceros de manera ilícita?");

        datosfalsospre19.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        datosfalsospre19.setText("¿Ha cometido usted algún robo en Teleperformance?");

        jRadioButton16.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton16.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jRadioButton16.setText("A");
        jRadioButton16.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButton16ItemStateChanged(evt);
            }
        });

        jRadioButton17.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton17.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jRadioButton17.setText("A");
        jRadioButton17.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButton17ItemStateChanged(evt);
            }
        });

        jRadioButton18.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton18.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jRadioButton18.setText("A");
        jRadioButton18.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButton18ItemStateChanged(evt);
            }
        });

        jRadioButton19.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton19.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jRadioButton19.setText("A");
        jRadioButton19.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButton19ItemStateChanged(evt);
            }
        });

        jLabel53.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel54.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel55.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtdatosfalsospre16.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtdatosfalsospre16.setBorder(null);
        txtdatosfalsospre16.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtdatosfalsospre16CaretUpdate(evt);
            }
        });

        txtdatosfalsospre17.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtdatosfalsospre17.setBorder(null);
        txtdatosfalsospre17.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtdatosfalsospre17CaretUpdate(evt);
            }
        });

        txtdatosfalsospre18.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtdatosfalsospre18.setBorder(null);
        txtdatosfalsospre18.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtdatosfalsospre18CaretUpdate(evt);
            }
        });

        txtdatosfalsospre19.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtdatosfalsospre19.setBorder(null);
        txtdatosfalsospre19.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtdatosfalsospre19CaretUpdate(evt);
            }
        });

        jCheckBox77.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox77.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jCheckBox77.setText("No");
        jCheckBox77.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox77ItemStateChanged(evt);
            }
        });

        jCheckBox78.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox78.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jCheckBox78.setText("Sí");
        jCheckBox78.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox78ItemStateChanged(evt);
            }
        });

        datosfalsospre24.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        datosfalsospre24.setText("¿Sabe usted de alguien que haya cometido algún robo en Teleperformance?");

        jRadioButton24.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton24.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jRadioButton24.setText("A");
        jRadioButton24.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButton24ItemStateChanged(evt);
            }
        });

        jLabel56.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtdatosfalsospre24.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtdatosfalsospre24.setBorder(null);
        txtdatosfalsospre24.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtdatosfalsospre24CaretUpdate(evt);
            }
        });

        datosfalsospre20.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        datosfalsospre20.setText(" actividades fraudulentas en Teleperformance?");

        datosfalsospre21.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        datosfalsospre21.setText(" la comisión de actividades delictivas?");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jRadioButton16)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel5Layout.createSequentialGroup()
                                    .addComponent(datosfalsospre18, javax.swing.GroupLayout.PREFERRED_SIZE, 685, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(85, 85, 85)
                                    .addComponent(jCheckBox66, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, 0)
                                    .addComponent(jCheckBox65, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, Short.MAX_VALUE))
                                .addGroup(jPanel5Layout.createSequentialGroup()
                                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                            .addComponent(datosfalsospre17, javax.swing.GroupLayout.PREFERRED_SIZE, 526, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(244, 244, 244)
                                            .addComponent(jCheckBox64, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(0, 0, 0)
                                            .addComponent(jCheckBox63, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                            .addComponent(datosfalsospre16, javax.swing.GroupLayout.PREFERRED_SIZE, 694, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(76, 76, 76)
                                            .addComponent(jCheckBox62, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(0, 0, 0)
                                            .addComponent(jCheckBox61, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jRadioButton17, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jRadioButton18, javax.swing.GroupLayout.Alignment.TRAILING)))
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addComponent(datosfalsospre3, javax.swing.GroupLayout.PREFERRED_SIZE, 684, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(86, 86, 86)
                            .addComponent(jCheckBox36, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(jCheckBox35, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jRadioButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                            .addGap(0, 0, Short.MAX_VALUE)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                    .addComponent(datosfalsospre19, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(363, 363, 363)
                                    .addComponent(jCheckBox68, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, 0)
                                    .addComponent(jCheckBox67, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jRadioButton19))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                    .addComponent(datosfalsospre4, javax.swing.GroupLayout.PREFERRED_SIZE, 694, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(76, 76, 76)
                                    .addComponent(jCheckBox38, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, 0)
                                    .addComponent(jCheckBox37, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jRadioButton4))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                    .addComponent(datosfalsospre7, javax.swing.GroupLayout.PREFERRED_SIZE, 682, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(88, 88, 88)
                                    .addComponent(jCheckBox44, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, 0)
                                    .addComponent(jCheckBox43, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jRadioButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel56, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtdatosfalsospre19, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtdatosfalsospre18, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtdatosfalsospre17, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtdatosfalsospre16, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel55, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel54, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel53, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel40, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel43, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                    .addComponent(datosfalsospre12, javax.swing.GroupLayout.PREFERRED_SIZE, 678, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(92, 92, 92)
                                    .addComponent(jCheckBox54, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, 0)
                                    .addComponent(jCheckBox53, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jRadioButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(txtdatosfalsospre12, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtdatosfalsospre11, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtdatosfalsospre10, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtdatosfalsospre9, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel47, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel45, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel46, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel44, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtdatosfalsospre8, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtdatosfalsospre7, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtdatosfalsospre6, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel48, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel35, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel37, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel36, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtdatosfalsospre3, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                    .addComponent(datosfalsospre2, javax.swing.GroupLayout.PREFERRED_SIZE, 731, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(39, 39, 39)
                                    .addComponent(jCheckBox34, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, 0)
                                    .addComponent(jCheckBox33, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jRadioButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(txtdatosfalsospre2, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtdatosfalsospre4, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel38, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtdatosfalsospre1, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                    .addComponent(datosfalsospre5, javax.swing.GroupLayout.PREFERRED_SIZE, 681, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(89, 89, 89)
                                    .addComponent(jCheckBox40, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, 0)
                                    .addComponent(jCheckBox39, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jRadioButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(txtdatosfalsospre5, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                    .addComponent(datosfalsospre13, javax.swing.GroupLayout.PREFERRED_SIZE, 695, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(75, 75, 75)
                                    .addComponent(jCheckBox56, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, 0)
                                    .addComponent(jCheckBox55, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jRadioButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(txtdatosfalsospre13, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                    .addComponent(datosfalsospre14, javax.swing.GroupLayout.PREFERRED_SIZE, 738, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(32, 32, 32)
                                    .addComponent(jCheckBox58, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, 0)
                                    .addComponent(jCheckBox57, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jRadioButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(txtdatosfalsospre14, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                    .addComponent(datosfalsospre24, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(270, 270, 270)
                                    .addComponent(jCheckBox78, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, 0)
                                    .addComponent(jCheckBox77, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jRadioButton24, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(txtdatosfalsospre24, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                    .addComponent(datosfalsospre6, javax.swing.GroupLayout.PREFERRED_SIZE, 617, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(153, 153, 153)
                                    .addComponent(jCheckBox42, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, 0)
                                    .addComponent(jCheckBox41, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jRadioButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                    .addComponent(datosfalsospre11, javax.swing.GroupLayout.PREFERRED_SIZE, 626, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(144, 144, 144)
                                    .addComponent(jCheckBox52, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, 0)
                                    .addComponent(jCheckBox51, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jRadioButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                    .addComponent(datosfalsospre10, javax.swing.GroupLayout.PREFERRED_SIZE, 588, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(182, 182, 182)
                                    .addComponent(jCheckBox50, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, 0)
                                    .addComponent(jCheckBox49, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jRadioButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                    .addComponent(datosfalsospre9, javax.swing.GroupLayout.PREFERRED_SIZE, 690, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(80, 80, 80)
                                    .addComponent(jCheckBox48, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, 0)
                                    .addComponent(jCheckBox47, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jRadioButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel42, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                    .addComponent(datosfalsospre8, javax.swing.GroupLayout.PREFERRED_SIZE, 728, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(42, 42, 42)
                                    .addComponent(jCheckBox46, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, 0)
                                    .addComponent(jCheckBox45, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jRadioButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                    .addComponent(datosfalsospre1, javax.swing.GroupLayout.PREFERRED_SIZE, 741, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(29, 29, 29)
                                    .addComponent(jCheckBox32, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, 0)
                                    .addComponent(jCheckBox31, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(datosfalsospre21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(datosfalsospre20, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(30, 30, 30))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(datosfalsospre1)
                    .addComponent(jCheckBox32, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox31, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addComponent(txtdatosfalsospre1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(datosfalsospre2)
                    .addComponent(jCheckBox34, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox33, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addComponent(txtdatosfalsospre2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(datosfalsospre3)
                    .addComponent(jRadioButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox35, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox36, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addComponent(datosfalsospre21)
                .addGap(7, 7, 7)
                .addComponent(txtdatosfalsospre3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(datosfalsospre4)
                    .addComponent(jRadioButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox37, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox38, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addComponent(txtdatosfalsospre4, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(datosfalsospre5)
                    .addComponent(jRadioButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox39, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox40, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addComponent(txtdatosfalsospre5, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox41, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox42, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(datosfalsospre6))
                .addGap(7, 7, 7)
                .addComponent(txtdatosfalsospre6, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(datosfalsospre7)
                    .addComponent(jCheckBox44, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox43, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addComponent(datosfalsospre20)
                .addGap(7, 7, 7)
                .addComponent(txtdatosfalsospre7, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox45, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox46, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(datosfalsospre8))
                .addGap(7, 7, 7)
                .addComponent(txtdatosfalsospre8, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(datosfalsospre9)
                    .addComponent(jRadioButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox48, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox47, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addComponent(txtdatosfalsospre9, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(datosfalsospre10)
                    .addComponent(jCheckBox50, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox49, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addComponent(txtdatosfalsospre10, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(datosfalsospre11)
                    .addComponent(jCheckBox52, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox51, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addComponent(txtdatosfalsospre11, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(datosfalsospre12)
                    .addComponent(jCheckBox54, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox53, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addComponent(txtdatosfalsospre12, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(datosfalsospre13)
                            .addComponent(jRadioButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBox55, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBox56, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addComponent(txtdatosfalsospre13, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41))
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jRadioButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jCheckBox57, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jCheckBox58, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(datosfalsospre14)))
                .addGap(7, 7, 7)
                .addComponent(txtdatosfalsospre14, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(datosfalsospre16)
                            .addComponent(jRadioButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBox61, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBox62, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addComponent(txtdatosfalsospre16, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jCheckBox64, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jCheckBox63, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jRadioButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(datosfalsospre17)))
                .addGap(7, 7, 7)
                .addComponent(txtdatosfalsospre17, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox66, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox65, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(datosfalsospre18))
                .addGap(7, 7, 7)
                .addComponent(txtdatosfalsospre18, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox67, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox68, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(datosfalsospre19))
                .addGap(7, 7, 7)
                .addComponent(txtdatosfalsospre19, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox78, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox77, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton24, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(datosfalsospre24))
                .addGap(7, 7, 7)
                .addComponent(txtdatosfalsospre24, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtdatosfalsospre26, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addComponent(datosfalsospre15)
                                .addGap(482, 482, 482)
                                .addComponent(jCheckBox79, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jCheckBox80, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(datosfalsospre15)
                    .addComponent(jCheckBox79, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox80, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtdatosfalsospre26, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        jScrollPane1.setViewportView(jPanel13);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 975, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 975, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 550, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void chbxcertiacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chbxcertiacaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chbxcertiacaActionPerformed

    private void chbxinforentreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chbxinforentreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chbxinforentreActionPerformed

    private void chbxinforhvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chbxinforhvActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chbxinforhvActionPerformed

    private void chbxcertanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chbxcertanteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chbxcertanteActionPerformed

    private void chbxcertilaboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chbxcertilaboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chbxcertilaboActionPerformed

    private void chbxdocpersoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chbxdocpersoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chbxdocpersoActionPerformed

    private void chbxinforentrepoliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chbxinforentrepoliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chbxinforentrepoliActionPerformed

    private void chbxrefpersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chbxrefpersActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chbxrefpersActionPerformed

    private void txtdatosfalsospre25CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtdatosfalsospre25CaretUpdate
        Falsificacion.setExphvfalsifi(txtdatosfalsospre25.getText());
    }//GEN-LAST:event_txtdatosfalsospre25CaretUpdate

    private void chbxcertiacaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chbxcertiacaItemStateChanged
        if (chbxcertiaca.isSelected()) {
            Falsificacion.setTi_falsificacion1("hay");
        } else if (!chbxcertiaca.isSelected()) {
            Falsificacion.setTi_falsificacion1("nohay");
        }
    }//GEN-LAST:event_chbxcertiacaItemStateChanged

    private void chbxcertilaboItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chbxcertilaboItemStateChanged
        if (chbxcertilabo.isSelected()) {
            Falsificacion.setTi_falsificacion2("hay");
        } else if (!chbxcertilabo.isSelected()) {
            Falsificacion.setTi_falsificacion2("nohay");
        }
    }//GEN-LAST:event_chbxcertilaboItemStateChanged

    private void chbxdocpersoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chbxdocpersoItemStateChanged
        if (chbxdocperso.isSelected()) {
            Falsificacion.setTi_falsificacion3("hay");
        } else if (!chbxdocperso.isSelected()) {
            Falsificacion.setTi_falsificacion3("nohay");
        }
    }//GEN-LAST:event_chbxdocpersoItemStateChanged

    private void chbxrefpersItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chbxrefpersItemStateChanged
        if (chbxrefpers.isSelected()) {
            Falsificacion.setTi_falsificacion4("hay");
        } else if (!chbxrefpers.isSelected()) {
            Falsificacion.setTi_falsificacion4("nohay");
        }
    }//GEN-LAST:event_chbxrefpersItemStateChanged

    private void chbxcertanteItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chbxcertanteItemStateChanged
        if (chbxcertante.isSelected()) {
            Falsificacion.setTi_falsificacion5("hay");
        } else if (!chbxcertante.isSelected()) {
            Falsificacion.setTi_falsificacion5("nohay");
        }
    }//GEN-LAST:event_chbxcertanteItemStateChanged

    private void chbxinforentreItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chbxinforentreItemStateChanged
        if (chbxinforentre.isSelected()) {
            Falsificacion.setTi_falsificacion6("hay");
        } else if (!chbxinforentre.isSelected()) {
            Falsificacion.setTi_falsificacion6("nohay");
        }
    }//GEN-LAST:event_chbxinforentreItemStateChanged

    private void chbxinforhvItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chbxinforhvItemStateChanged
        if (chbxinforhv.isSelected()) {
            Falsificacion.setTi_falsificacion7("hay");
        } else if (!chbxinforhv.isSelected()) {
            Falsificacion.setTi_falsificacion7("nohay");
        }
    }//GEN-LAST:event_chbxinforhvItemStateChanged

    private void chbxinforentrepoliItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chbxinforentrepoliItemStateChanged
        if (chbxinforentrepoli.isSelected()) {
            Falsificacion.setTi_falsificacion8("hay");
        } else if (!chbxinforentrepoli.isSelected()) {
            Falsificacion.setTi_falsificacion8("nohay");
        }
    }//GEN-LAST:event_chbxinforentrepoliItemStateChanged

    private void jCheckBox30ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox30ItemStateChanged
        if (jCheckBox30.isSelected()) {
            jCheckBox29.setSelected(false);
            Falsificacion.setHvfalsifi("Sí");
            Admisiones.setAdmF1("hay");
            txtdatosfalsospre25.setVisible(true);
            chbxcertiaca.setVisible(true);
            chbxcertilabo.setVisible(true);
            chbxdocperso.setVisible(true);
            chbxrefpers.setVisible(true);
            chbxcertante.setVisible(true);
            chbxinforentre.setVisible(true);
            chbxinforhv.setVisible(true);
            chbxinforentrepoli.setVisible(true);
            jLabel39.setVisible(true);
        } else {
            Falsificacion.setHvfalsifi("-");
            Admisiones.setAdmF1("nohay");
            txtdatosfalsospre25.setVisible(false);
            chbxcertiaca.setVisible(false);
            chbxcertilabo.setVisible(false);
            chbxdocperso.setVisible(false);
            chbxrefpers.setVisible(false);
            chbxcertante.setVisible(false);
            chbxinforentre.setVisible(false);
            chbxinforhv.setVisible(false);
            chbxinforentrepoli.setVisible(false);
            jLabel39.setVisible(false);
        }
    }//GEN-LAST:event_jCheckBox30ItemStateChanged

    private void jCheckBox29ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox29ItemStateChanged
        if (jCheckBox29.isSelected()) {
            jCheckBox30.setSelected(false);
            Falsificacion.setHvfalsifi("No");
            Admisiones.setAdmF1("nohay");
            txtdatosfalsospre25.setVisible(false);
            chbxcertiaca.setVisible(false);
            chbxcertilabo.setVisible(false);
            chbxdocperso.setVisible(false);
            chbxrefpers.setVisible(false);
            chbxcertante.setVisible(false);
            chbxinforentre.setVisible(false);
            chbxinforhv.setVisible(false);
            chbxinforentrepoli.setVisible(false);
            jLabel39.setVisible(false);
        } else {
            Falsificacion.setHvfalsifi("-");
            Admisiones.setAdmF1("nohay");
            txtdatosfalsospre25.setVisible(false);
            chbxcertiaca.setVisible(false);
            chbxcertilabo.setVisible(false);
            chbxdocperso.setVisible(false);
            chbxrefpers.setVisible(false);
            chbxcertante.setVisible(false);
            chbxinforentre.setVisible(false);
            chbxinforhv.setVisible(false);
            chbxinforentrepoli.setVisible(false);
            jLabel39.setVisible(false);
        }
    }//GEN-LAST:event_jCheckBox29ItemStateChanged

    private void jCheckBox31ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox31ItemStateChanged
        if (jCheckBox31.isSelected()) {
            jCheckBox32.setSelected(false);
            Falsificacion.setPgrutina1("No");
            txtdatosfalsospre1.setVisible(false);
            jLabel38.setVisible(false);
            jRadioButton1.setVisible(false);
            jRadioButton1.setSelected(false);

        } else {
            Falsificacion.setPgrutina1("-");
            txtdatosfalsospre1.setVisible(false);
            jLabel38.setVisible(false);
            jRadioButton1.setVisible(false);
            jRadioButton1.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox31ItemStateChanged

    private void jCheckBox32ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox32ItemStateChanged
        if (jCheckBox32.isSelected()) {
            jCheckBox31.setSelected(false);
            txtdatosfalsospre1.setVisible(true);
            jLabel38.setVisible(true);
            Falsificacion.setPgrutina1("Sí");
            jRadioButton1.setVisible(true);
        } else {
            Falsificacion.setPgrutina1("-");
            txtdatosfalsospre1.setVisible(false);
            jLabel38.setVisible(false);
            jRadioButton1.setVisible(false);
            jRadioButton1.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox32ItemStateChanged

    private void jCheckBox33ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox33ItemStateChanged
        if (jCheckBox33.isSelected()) {
            jCheckBox34.setSelected(false);
            Falsificacion.setPgrutina2("No");
            txtdatosfalsospre2.setVisible(false);
            jLabel37.setVisible(false);
            jRadioButton15.setVisible(false);
            jRadioButton15.setSelected(false);

        } else {
            Falsificacion.setPgrutina2("-");
            txtdatosfalsospre2.setVisible(false);
            jLabel37.setVisible(false);
            jRadioButton15.setVisible(false);
            jRadioButton15.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox33ItemStateChanged

    private void jCheckBox34ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox34ItemStateChanged
        if (jCheckBox34.isSelected()) {
            jCheckBox33.setSelected(false);
            txtdatosfalsospre2.setVisible(true);
            jLabel37.setVisible(true);
            Falsificacion.setPgrutina2("Sí");
            jRadioButton2.setVisible(true);
        } else {
            Falsificacion.setPgrutina2("-");
            txtdatosfalsospre2.setVisible(false);
            jLabel37.setVisible(false);
            jRadioButton2.setVisible(false);
            jRadioButton2.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox34ItemStateChanged

    private void jCheckBox35ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox35ItemStateChanged
        if (jCheckBox35.isSelected()) {
            jCheckBox36.setSelected(false);
            Falsificacion.setPgrutina3("No");
            txtdatosfalsospre3.setVisible(false);
            jLabel36.setVisible(false);
            jRadioButton3.setVisible(false);
            jRadioButton3.setSelected(false);

        } else {
            Falsificacion.setPgrutina3("-");
            txtdatosfalsospre3.setVisible(false);
            jLabel36.setVisible(false);
            jRadioButton3.setVisible(false);
            jRadioButton3.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox35ItemStateChanged

    private void jCheckBox36ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox36ItemStateChanged
        if (jCheckBox36.isSelected()) {
            jCheckBox35.setSelected(false);
            txtdatosfalsospre3.setVisible(true);
            jLabel36.setVisible(true);
            Falsificacion.setPgrutina3("Sí");
            jRadioButton3.setVisible(true);
        } else {
            Falsificacion.setPgrutina3("-");
            txtdatosfalsospre3.setVisible(false);
            jLabel36.setVisible(false);
            jRadioButton3.setVisible(false);
            jRadioButton3.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox36ItemStateChanged

    private void jCheckBox37ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox37ItemStateChanged
        if (jCheckBox37.isSelected()) {
            jCheckBox38.setSelected(false);
            Falsificacion.setPgrutina4("No");
            txtdatosfalsospre4.setVisible(false);
            jLabel32.setVisible(false);
            jRadioButton4.setVisible(false);
            jRadioButton4.setSelected(false);

        } else {
            Falsificacion.setPgrutina4("-");
            txtdatosfalsospre4.setVisible(false);
            jLabel32.setVisible(false);
            jRadioButton4.setVisible(false);
            jRadioButton4.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox37ItemStateChanged

    private void jCheckBox38ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox38ItemStateChanged
        if (jCheckBox38.isSelected()) {
            jCheckBox37.setSelected(false);
            txtdatosfalsospre4.setVisible(true);
            jLabel32.setVisible(true);
            Falsificacion.setPgrutina4("Sí");
            jRadioButton4.setVisible(true);
        } else {
            Falsificacion.setPgrutina4("-");
            txtdatosfalsospre4.setVisible(false);
            jLabel32.setVisible(false);
            jRadioButton4.setVisible(false);
            jRadioButton4.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox38ItemStateChanged

    private void jCheckBox39ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox39ItemStateChanged
        if (jCheckBox39.isSelected()) {
            jCheckBox40.setSelected(false);
            Falsificacion.setPgrutina5("No");
            txtdatosfalsospre5.setVisible(false);
            jLabel33.setVisible(false);
            jRadioButton5.setVisible(false);
            jRadioButton5.setSelected(false);

        } else {
            Falsificacion.setPgrutina5("-");
            txtdatosfalsospre5.setVisible(false);
            jLabel33.setVisible(false);
            jRadioButton5.setVisible(false);
            jRadioButton5.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox39ItemStateChanged

    private void jCheckBox40ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox40ItemStateChanged
        if (jCheckBox40.isSelected()) {
            jCheckBox39.setSelected(false);
            txtdatosfalsospre5.setVisible(true);
            jLabel33.setVisible(true);
            Falsificacion.setPgrutina5("Sí");
            jRadioButton5.setVisible(true);
        } else {
            Falsificacion.setPgrutina5("-");
            txtdatosfalsospre5.setVisible(false);
            jLabel33.setVisible(false);
            jRadioButton5.setVisible(false);
            jRadioButton5.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox40ItemStateChanged

    private void jCheckBox41ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox41ItemStateChanged
        if (jCheckBox41.isSelected()) {
            jCheckBox42.setSelected(false);
            Falsificacion.setPgrutina6("No");
            txtdatosfalsospre6.setVisible(false);
            jLabel34.setVisible(false);
            jRadioButton6.setVisible(false);
            jRadioButton6.setSelected(false);

        } else {
            Falsificacion.setPgrutina6("-");
            txtdatosfalsospre6.setVisible(false);
            jLabel34.setVisible(false);
            jRadioButton6.setVisible(false);
            jRadioButton6.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox41ItemStateChanged

    private void jCheckBox42ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox42ItemStateChanged
        if (jCheckBox42.isSelected()) {
            jCheckBox41.setSelected(false);
            txtdatosfalsospre6.setVisible(true);
            jLabel34.setVisible(true);
            Falsificacion.setPgrutina6("Sí");
            jRadioButton6.setVisible(true);
        } else {
            Falsificacion.setPgrutina6("-");
            txtdatosfalsospre6.setVisible(false);
            jLabel34.setVisible(false);
            jRadioButton6.setVisible(false);
            jRadioButton6.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox42ItemStateChanged

    private void jCheckBox43ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox43ItemStateChanged
        if (jCheckBox43.isSelected()) {
            jCheckBox44.setSelected(false);
            Falsificacion.setPgrutina7("No");
            txtdatosfalsospre7.setVisible(false);
            jLabel35.setVisible(false);
            jRadioButton7.setVisible(false);
            jRadioButton7.setSelected(false);

        } else {
            Falsificacion.setPgrutina7("-");
            txtdatosfalsospre7.setVisible(false);
            jLabel35.setVisible(false);
            jRadioButton7.setVisible(false);
            jRadioButton7.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox43ItemStateChanged

    private void jCheckBox44ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox44ItemStateChanged
        if (jCheckBox44.isSelected()) {
            jCheckBox43.setSelected(false);
            txtdatosfalsospre7.setVisible(true);
            jLabel35.setVisible(true);
            Falsificacion.setPgrutina7("Sí");
            jRadioButton7.setVisible(true);
        } else {
            Falsificacion.setPgrutina7("-");
            txtdatosfalsospre7.setVisible(false);
            jLabel35.setVisible(false);
            jRadioButton7.setVisible(false);
            jRadioButton7.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox44ItemStateChanged

    private void jCheckBox45ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox45ItemStateChanged
        if (jCheckBox45.isSelected()) {
            jCheckBox46.setSelected(false);
            Falsificacion.setPgrutina8("No");
            txtdatosfalsospre8.setVisible(false);
            jLabel48.setVisible(false);
            jRadioButton9.setVisible(false);
            jRadioButton9.setSelected(false);

        } else {
            Falsificacion.setPgrutina8("-");
            txtdatosfalsospre8.setVisible(false);
            jLabel48.setVisible(false);
            jRadioButton9.setVisible(false);
            jRadioButton9.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox45ItemStateChanged

    private void jCheckBox46ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox46ItemStateChanged
        if (jCheckBox46.isSelected()) {
            jCheckBox45.setSelected(false);
            txtdatosfalsospre8.setVisible(true);
            jLabel48.setVisible(true);
            Falsificacion.setPgrutina8("Sí");
            jRadioButton9.setVisible(true);
        } else {
            Falsificacion.setPgrutina8("-");
            txtdatosfalsospre8.setVisible(false);
            jLabel48.setVisible(false);
            jRadioButton9.setVisible(false);
            jRadioButton9.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox46ItemStateChanged

    private void jCheckBox47ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox47ItemStateChanged
        if (jCheckBox47.isSelected()) {
            jCheckBox48.setSelected(false);
            Falsificacion.setPgrutina9("No");
            txtdatosfalsospre9.setVisible(false);
            jLabel47.setVisible(false);
            jRadioButton8.setVisible(false);
            jRadioButton8.setSelected(false);

        } else {
            Falsificacion.setPgrutina9("-");
            txtdatosfalsospre9.setVisible(false);
            jLabel47.setVisible(false);
            jRadioButton8.setVisible(false);
            jRadioButton8.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox47ItemStateChanged

    private void jCheckBox48ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox48ItemStateChanged
        if (jCheckBox48.isSelected()) {
            jCheckBox47.setSelected(false);
            txtdatosfalsospre9.setVisible(true);
            jLabel47.setVisible(true);
            Falsificacion.setPgrutina9("Sí");
            jRadioButton8.setVisible(true);
        } else {
            Falsificacion.setPgrutina9("-");
            txtdatosfalsospre9.setVisible(false);
            jLabel47.setVisible(false);
            jRadioButton8.setVisible(false);
            jRadioButton8.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox48ItemStateChanged

    private void jCheckBox49ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox49ItemStateChanged
        if (jCheckBox49.isSelected()) {
            jCheckBox50.setSelected(false);
            Falsificacion.setPgrutina10("No");
            txtdatosfalsospre10.setVisible(false);
            jLabel45.setVisible(false);
            jRadioButton10.setVisible(false);
            jRadioButton10.setSelected(false);

        } else {
            Falsificacion.setPgrutina10("-");
            txtdatosfalsospre10.setVisible(false);
            jLabel45.setVisible(false);
            jRadioButton10.setVisible(false);
            jRadioButton10.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox49ItemStateChanged

    private void jCheckBox50ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox50ItemStateChanged
        if (jCheckBox50.isSelected()) {
            jCheckBox49.setSelected(false);
            txtdatosfalsospre10.setVisible(true);
            jLabel45.setVisible(true);
            Falsificacion.setPgrutina10("Sí");
            jRadioButton10.setVisible(true);
        } else {
            Falsificacion.setPgrutina10("-");
            txtdatosfalsospre10.setVisible(false);
            jLabel45.setVisible(false);
            jRadioButton10.setVisible(false);
            jRadioButton10.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox50ItemStateChanged

    private void jCheckBox51ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox51ItemStateChanged
        if (jCheckBox51.isSelected()) {
            jCheckBox52.setSelected(false);
            Falsificacion.setPgrutina11("No");
            txtdatosfalsospre11.setVisible(false);
            jLabel46.setVisible(false);
            jRadioButton11.setVisible(false);
            jRadioButton11.setSelected(false);

        } else {
            Falsificacion.setPgrutina11("-");
            txtdatosfalsospre11.setVisible(false);
            jLabel46.setVisible(false);
            jRadioButton11.setVisible(false);
            jRadioButton11.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox51ItemStateChanged

    private void jCheckBox52ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox52ItemStateChanged
        if (jCheckBox52.isSelected()) {
            jCheckBox51.setSelected(false);
            txtdatosfalsospre11.setVisible(true);
            jLabel46.setVisible(true);
            Falsificacion.setPgrutina11("Sí");
            jRadioButton11.setVisible(true);
        } else {
            Falsificacion.setPgrutina11("-");
            txtdatosfalsospre11.setVisible(false);
            jLabel46.setVisible(false);
            jRadioButton11.setVisible(false);
            jRadioButton11.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox52ItemStateChanged

    private void jCheckBox53ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox53ItemStateChanged
        if (jCheckBox53.isSelected()) {
            jCheckBox54.setSelected(false);
            Falsificacion.setPgrutina12("No");
            txtdatosfalsospre12.setVisible(false);
            jLabel44.setVisible(false);
            jRadioButton12.setVisible(false);
            jRadioButton12.setSelected(false);

        } else {
            Falsificacion.setPgrutina12("-");
            txtdatosfalsospre12.setVisible(false);
            jLabel44.setVisible(false);
            jRadioButton12.setVisible(false);
            jRadioButton12.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox53ItemStateChanged

    private void jCheckBox54ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox54ItemStateChanged
        if (jCheckBox54.isSelected()) {
            jCheckBox53.setSelected(false);
            txtdatosfalsospre12.setVisible(true);
            jLabel44.setVisible(true);
            Falsificacion.setPgrutina12("Sí");
            jRadioButton12.setVisible(true);
        } else {
            Falsificacion.setPgrutina12("-");
            txtdatosfalsospre12.setVisible(false);
            jLabel44.setVisible(false);
            jRadioButton12.setVisible(false);
            jRadioButton12.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox54ItemStateChanged

    private void jCheckBox55ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox55ItemStateChanged
        if (jCheckBox55.isSelected()) {
            jCheckBox56.setSelected(false);
            Falsificacion.setPgrutina13("No");
            txtdatosfalsospre13.setVisible(false);
            jLabel43.setVisible(false);
            jRadioButton13.setVisible(false);
            jRadioButton13.setSelected(false);

        } else {
            Falsificacion.setPgrutina13("-");
            txtdatosfalsospre13.setVisible(false);
            jLabel43.setVisible(false);
            jRadioButton13.setVisible(false);
            jRadioButton13.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox55ItemStateChanged

    private void jCheckBox56ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox56ItemStateChanged
        if (jCheckBox56.isSelected()) {
            jCheckBox55.setSelected(false);
            txtdatosfalsospre13.setVisible(true);
            jLabel43.setVisible(true);
            Falsificacion.setPgrutina13("Sí");
            jRadioButton13.setVisible(true);
        } else {
            Falsificacion.setPgrutina13("-");
            txtdatosfalsospre13.setVisible(false);
            jLabel43.setVisible(false);
            jRadioButton13.setVisible(false);
            jRadioButton13.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox56ItemStateChanged

    private void jCheckBox57ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox57ItemStateChanged
        if (jCheckBox57.isSelected()) {
            jCheckBox58.setSelected(false);
            Falsificacion.setPgrutina14("No");
            txtdatosfalsospre14.setVisible(false);
            jLabel42.setVisible(false);
            jRadioButton14.setVisible(false);
            jRadioButton14.setSelected(false);

        } else {
            Falsificacion.setPgrutina14("-");
            txtdatosfalsospre14.setVisible(false);
            jLabel42.setVisible(false);
            jRadioButton14.setVisible(false);
            jRadioButton14.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox57ItemStateChanged

    private void jCheckBox58ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox58ItemStateChanged
        if (jCheckBox58.isSelected()) {
            jCheckBox57.setSelected(false);
            txtdatosfalsospre14.setVisible(true);
            jLabel42.setVisible(true);
            Falsificacion.setPgrutina14("Sí");
            jRadioButton14.setVisible(true);
        } else {
            Falsificacion.setPgrutina14("-");
            txtdatosfalsospre14.setVisible(false);
            jLabel42.setVisible(false);
            jRadioButton14.setVisible(false);
            jRadioButton14.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox58ItemStateChanged

    private void jCheckBox61ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox61ItemStateChanged
        if (jCheckBox61.isSelected()) {
            jCheckBox62.setSelected(false);
            Falsificacion.setPgrutina15("No");
            txtdatosfalsospre16.setVisible(false);
            jLabel40.setVisible(false);
            jRadioButton16.setVisible(false);
            jRadioButton16.setSelected(false);

        } else {
            Falsificacion.setPgrutina15("-");
            txtdatosfalsospre16.setVisible(false);
            jLabel40.setVisible(false);
            jRadioButton16.setVisible(false);
            jRadioButton16.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox61ItemStateChanged

    private void jCheckBox62ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox62ItemStateChanged
        if (jCheckBox62.isSelected()) {
            jCheckBox61.setSelected(false);
            txtdatosfalsospre16.setVisible(true);
            jLabel40.setVisible(true);
            Falsificacion.setPgrutina15("Sí");
            jRadioButton16.setVisible(true);
        } else {
            Falsificacion.setPgrutina15("-");
            txtdatosfalsospre16.setVisible(false);
            jLabel40.setVisible(false);
            jRadioButton16.setVisible(false);
            jRadioButton16.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox62ItemStateChanged

    private void jCheckBox63ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox63ItemStateChanged
        if (jCheckBox63.isSelected()) {
            jCheckBox64.setSelected(false);
           Falsificacion.setPgrutina16("No");
            txtdatosfalsospre17.setVisible(false);
            jLabel55.setVisible(false);
            jRadioButton17.setVisible(false);
            jRadioButton17.setSelected(false);

        } else {
           Falsificacion.setPgrutina16("-");
            txtdatosfalsospre17.setVisible(false);
            jLabel55.setVisible(false);
            jRadioButton17.setVisible(false);
            jRadioButton17.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox63ItemStateChanged

    private void jCheckBox64ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox64ItemStateChanged
        if (jCheckBox64.isSelected()) {
            jCheckBox63.setSelected(false);
            txtdatosfalsospre17.setVisible(true);
            jLabel55.setVisible(true);
            Falsificacion.setPgrutina16("Sí");
            jRadioButton17.setVisible(true);
        } else {
            Falsificacion.setPgrutina16("-");
            txtdatosfalsospre17.setVisible(false);
            jLabel55.setVisible(false);
            jRadioButton17.setVisible(false);
            jRadioButton17.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox64ItemStateChanged

    private void jCheckBox65ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox65ItemStateChanged
        if (jCheckBox65.isSelected()) {
            jCheckBox66.setSelected(false);
            Falsificacion.setPgrutina17("No");
            txtdatosfalsospre18.setVisible(false);
            jLabel54.setVisible(false);
            jRadioButton18.setVisible(false);
            jRadioButton18.setSelected(false);

        } else {
            Falsificacion.setPgrutina17("-");
            txtdatosfalsospre18.setVisible(false);
            jLabel54.setVisible(false);
            jRadioButton18.setVisible(false);
            jRadioButton18.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox65ItemStateChanged

    private void jCheckBox66ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox66ItemStateChanged
        if (jCheckBox66.isSelected()) {
            jCheckBox65.setSelected(false);
            txtdatosfalsospre18.setVisible(true);
            jLabel54.setVisible(true);
            Falsificacion.setPgrutina17("Sí");
            jRadioButton18.setVisible(true);
        } else {
            Falsificacion.setPgrutina17("-");
            txtdatosfalsospre18.setVisible(false);
            jLabel54.setVisible(false);
            jRadioButton18.setVisible(false);
            jRadioButton18.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox66ItemStateChanged

    private void jCheckBox67ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox67ItemStateChanged
        if (jCheckBox67.isSelected()) {
            jCheckBox68.setSelected(false);
            Falsificacion.setPgrutina18("No");
            txtdatosfalsospre19.setVisible(false);
            jLabel53.setVisible(false);
            jRadioButton19.setVisible(false);
            jRadioButton19.setSelected(false);

        } else {
            Falsificacion.setPgrutina18("-");
            txtdatosfalsospre19.setVisible(false);
            jLabel53.setVisible(false);
            jRadioButton19.setVisible(false);
            jRadioButton19.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox67ItemStateChanged

    private void jCheckBox68ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox68ItemStateChanged
        if (jCheckBox68.isSelected()) {
            jCheckBox67.setSelected(false);
            txtdatosfalsospre19.setVisible(true);
            jLabel53.setVisible(true);
            Falsificacion.setPgrutina18("Sí");
            jRadioButton19.setVisible(true);
        } else {
            Falsificacion.setPgrutina18("-");
            txtdatosfalsospre19.setVisible(false);
            jLabel53.setVisible(false);
            jRadioButton19.setVisible(false);
            jRadioButton19.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox68ItemStateChanged

    private void jCheckBox77ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox77ItemStateChanged
        if (jCheckBox77.isSelected()) {
            jCheckBox78.setSelected(false);
            Falsificacion.setPgrutina19("No");
            txtdatosfalsospre24.setVisible(false);
            jLabel56.setVisible(false);
            jRadioButton24.setVisible(false);
            jRadioButton24.setSelected(false);

        } else {
            Falsificacion.setPgrutina19("-");
            txtdatosfalsospre24.setVisible(false);
            jLabel56.setVisible(false);
            jRadioButton24.setVisible(false);
            jRadioButton24.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox77ItemStateChanged

    private void jCheckBox78ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox78ItemStateChanged
        if (jCheckBox78.isSelected()) {
            jCheckBox77.setSelected(false);
            txtdatosfalsospre24.setVisible(true);
            jLabel56.setVisible(true);
            Falsificacion.setPgrutina19("Sí");
            jRadioButton24.setVisible(true);
        } else {
            Falsificacion.setPgrutina19("-");
            txtdatosfalsospre24.setVisible(false);
            jLabel56.setVisible(false);
            jRadioButton24.setVisible(false);
            jRadioButton24.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox78ItemStateChanged

    private void jCheckBox79ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox79ItemStateChanged
        if (jCheckBox79.isSelected()) {
            jCheckBox80.setSelected(false);
            txtdatosfalsospre26.setVisible(true);
            jLabel57.setVisible(true);
            Admisiones.setAdmF42("hay");
        } else {
            txtdatosfalsospre26.setVisible(false);
            jLabel57.setVisible(false);
            Admisiones.setAdmF42("nohay");
        }
    }//GEN-LAST:event_jCheckBox79ItemStateChanged

    private void jCheckBox80ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox80ItemStateChanged
        if (jCheckBox80.isSelected()) {
            jCheckBox79.setSelected(false);
            txtdatosfalsospre26.setVisible(false);
            jLabel57.setVisible(false);
            Admisiones.setAdmF42("nohay");
        } else {
            txtdatosfalsospre26.setVisible(false);
            jLabel57.setVisible(false);
            Admisiones.setAdmF42("nohay");
        }
    }//GEN-LAST:event_jCheckBox80ItemStateChanged

    private void jCheckBox81ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox81ItemStateChanged
        if (jCheckBox81.isSelected()) {
            jCheckBox82.setSelected(false);
            txtdatosfalsospre27.setVisible(true);
            jLabel58.setVisible(true);
            Falsificacion.setDatosfalsospre1("Sí");
            Admisiones.setAdmF2("hay");
        } else {
            Falsificacion.setDatosfalsospre1("-");
            Admisiones.setAdmF2("nohay");
            txtdatosfalsospre27.setVisible(false);
            jLabel58.setVisible(false);
        }
    }//GEN-LAST:event_jCheckBox81ItemStateChanged

    private void jCheckBox82ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox82ItemStateChanged
        if (jCheckBox82.isSelected()) {
            jCheckBox81.setSelected(false);
            txtdatosfalsospre27.setVisible(false);
            Admisiones.setAdmF2("nohay");
            Falsificacion.setDatosfalsospre1("No");
        } else {
            Falsificacion.setDatosfalsospre1("-");
            Admisiones.setAdmF2("nohay");
            txtdatosfalsospre27.setVisible(false);
            jLabel58.setVisible(false);
        }
    }//GEN-LAST:event_jCheckBox82ItemStateChanged

    private void jCheckBox83ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox83ItemStateChanged
        if (jCheckBox83.isSelected()) {
            jCheckBox84.setSelected(false);
            txtdatosfalsospre28.setVisible(true);
            jLabel59.setVisible(true);
            Falsificacion.setDatosfalsospre2("Sí");
            Admisiones.setAdmF3("hay");
        } else {
            Falsificacion.setDatosfalsospre2("-");
            Admisiones.setAdmF3("nohay");
            txtdatosfalsospre28.setVisible(false);
            jLabel59.setVisible(false);
        }
    }//GEN-LAST:event_jCheckBox83ItemStateChanged

    private void jCheckBox84ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox84ItemStateChanged
        if (jCheckBox84.isSelected()) {
            jCheckBox83.setSelected(false);
            txtdatosfalsospre28.setVisible(false);
            jLabel59.setVisible(false);
            Falsificacion.setDatosfalsospre2("No");
            Admisiones.setAdmF3("nohay");
        } else {
            txtdatosfalsospre28.setVisible(false);
            jLabel59.setVisible(false);
            Falsificacion.setDatosfalsospre2("-");
            Admisiones.setAdmF3("nohay");
        }
    }//GEN-LAST:event_jCheckBox84ItemStateChanged

    private void txtdatosfalsospre25KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdatosfalsospre25KeyTyped
        int k = (int) evt.getKeyChar();
        if (k == 39) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "¡No se acepta ese tipo de carácter!", "Error de datos ingresados", JOptionPane.ERROR_MESSAGE, iconThinking_uh);
        }
        InputMap map = txtdatosfalsospre25.getInputMap(JTextField.WHEN_FOCUSED);
//        map.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, CTRL_MASK), "null");
    }//GEN-LAST:event_txtdatosfalsospre25KeyTyped

    private void txtdatosfalsospre27KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdatosfalsospre27KeyTyped
        int k = (int) evt.getKeyChar();
        if (k == 39) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "¡No se acepta ese tipo de carácter!", "Error de datos ingresados", JOptionPane.ERROR_MESSAGE, iconThinking_uh);
        }
        InputMap map = txtdatosfalsospre27.getInputMap(JTextField.WHEN_FOCUSED);
//        map.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, CTRL_MASK), "null");
    }//GEN-LAST:event_txtdatosfalsospre27KeyTyped

    private void txtdatosfalsospre28KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdatosfalsospre28KeyTyped
        int k = (int) evt.getKeyChar();
        if (k == 39) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "¡No se acepta ese tipo de carácter!", "Error de datos ingresados", JOptionPane.ERROR_MESSAGE, iconThinking_uh);
        }
        InputMap map = txtdatosfalsospre28.getInputMap(JTextField.WHEN_FOCUSED);
//        map.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, CTRL_MASK), "null");
    }//GEN-LAST:event_txtdatosfalsospre28KeyTyped

    private void txtdatosfalsospre26KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdatosfalsospre26KeyTyped
        int k = (int) evt.getKeyChar();
        if (k == 39) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "¡No se acepta ese tipo de carácter!", "Error de datos ingresados", JOptionPane.ERROR_MESSAGE, iconThinking_uh);
        }
        InputMap map = txtdatosfalsospre26.getInputMap(JTextField.WHEN_FOCUSED);
//        map.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, CTRL_MASK), "null");
    }//GEN-LAST:event_txtdatosfalsospre26KeyTyped

    private void txtdatosfalsospre27CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtdatosfalsospre27CaretUpdate
        Falsificacion.setExpdatosfalsospre1(txtdatosfalsospre27.getText());
    }//GEN-LAST:event_txtdatosfalsospre27CaretUpdate

    private void txtdatosfalsospre28CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtdatosfalsospre28CaretUpdate
        Falsificacion.setExpdatosfalsospre2(txtdatosfalsospre28.getText());
    }//GEN-LAST:event_txtdatosfalsospre28CaretUpdate

    private void txtdatosfalsospre26CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtdatosfalsospre26CaretUpdate
        Falsificacion.setAdmisionFalsificacion(txtdatosfalsospre26.getText());
    }//GEN-LAST:event_txtdatosfalsospre26CaretUpdate

    private void jCheckBox85ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox85ItemStateChanged
        if (jCheckBox85.isSelected()) {
            jCheckBox86.setSelected(false);
            jPanel6.setVisible(true);
            Falsificacion.setPgrutinaope1_("Sí");
        } else {
            Falsificacion.setPgrutinaope1_("-");
            jPanel6.setVisible(false);
            
        }
    }//GEN-LAST:event_jCheckBox85ItemStateChanged

    private void jCheckBox86ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox86ItemStateChanged
        if (jCheckBox86.isSelected()) {
            jCheckBox85.setSelected(false);
            jPanel6.setVisible(false);
            Falsificacion.setPgrutinaope1_("No");
        } else {
            Falsificacion.setPgrutinaope1_("-");
            jPanel6.setVisible(false);
        }
    }//GEN-LAST:event_jCheckBox86ItemStateChanged

    private void jCheckBox87ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox87ItemStateChanged
        if (jCheckBox87.isSelected()) {
            jCheckBox88.setSelected(false);
            Falsificacion.setPgrutinaope1("No");
            txtcompacti3.setVisible(false);
            jLabel62.setVisible(false);
            jRadioButton15.setVisible(false);
            jRadioButton15.setSelected(false);

        } else {
            Falsificacion.setPgrutinaope1("-");
            txtcompacti3.setVisible(false);
            jLabel62.setVisible(false);
            jRadioButton15.setVisible(false);
            jRadioButton15.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox87ItemStateChanged

    private void jCheckBox88ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox88ItemStateChanged
        if (jCheckBox88.isSelected()) {
            jCheckBox87.setSelected(false);
            txtcompacti3.setVisible(true);
            jLabel62.setVisible(true);
            Falsificacion.setPgrutinaope1("Sí");
            jRadioButton15.setVisible(true);
        } else {
            Falsificacion.setPgrutinaope1("-");
            txtcompacti3.setVisible(false);
            jLabel62.setVisible(false);
            jRadioButton15.setVisible(false);
            jRadioButton15.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox88ItemStateChanged

    private void jCheckBox89ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox89ItemStateChanged
        if (jCheckBox89.isSelected()) {
            jCheckBox90.setSelected(false);
            Falsificacion.setPgrutinaope2("No");
            txtcompacti4.setVisible(false);
            jLabel63.setVisible(false);
            jRadioButton20.setVisible(false);
            jRadioButton20.setSelected(false);

        } else {
            Falsificacion.setPgrutinaope2("-");
            txtcompacti4.setVisible(false);
            jLabel63.setVisible(false);
            jRadioButton20.setVisible(false);
            jRadioButton20.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox89ItemStateChanged

    private void jCheckBox90ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox90ItemStateChanged
        if (jCheckBox90.isSelected()) {
            jCheckBox89.setSelected(false);
            txtcompacti4.setVisible(true);
            jLabel63.setVisible(true);
            Falsificacion.setPgrutinaope2("Sí");
            jRadioButton20.setVisible(true);
        } else {
            Falsificacion.setPgrutinaope2("-");
            txtcompacti4.setVisible(false);
            jLabel63.setVisible(false);
            jRadioButton20.setVisible(false);
            jRadioButton20.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox90ItemStateChanged

    private void jCheckBox91ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox91ItemStateChanged
        if (jCheckBox91.isSelected()) {
            jCheckBox92.setSelected(false);
            Falsificacion.setPgrutinaope3("No");
            txtcompacti5.setVisible(false);
            jLabel64.setVisible(false);
            jRadioButton21.setVisible(false);
            jRadioButton21.setSelected(false);

        } else {
            Falsificacion.setPgrutinaope3("-");
            txtcompacti5.setVisible(false);
            jLabel64.setVisible(false);
            jRadioButton21.setVisible(false);
            jRadioButton21.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox91ItemStateChanged

    private void jCheckBox92ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox92ItemStateChanged
        if (jCheckBox92.isSelected()) {
            jCheckBox91.setSelected(false);
            txtcompacti5.setVisible(true);
            jLabel64.setVisible(true);
            Falsificacion.setPgrutinaope3("Sí");
            jRadioButton21.setVisible(true);
        } else {
            Falsificacion.setPgrutinaope3("-");
            txtcompacti5.setVisible(false);
            jLabel64.setVisible(false);
            jRadioButton21.setVisible(false);
            jRadioButton21.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox92ItemStateChanged

    private void jCheckBox93ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox93ItemStateChanged
        if (jCheckBox93.isSelected()) {
            jCheckBox94.setSelected(false);
            Falsificacion.setPgrutinaope4("No");
            txtcompacti6.setVisible(false);
            jLabel65.setVisible(false);
            jRadioButton22.setVisible(false);
            jRadioButton22.setSelected(false);

        } else {
            Falsificacion.setPgrutinaope4("-");
            txtcompacti6.setVisible(false);
            jLabel65.setVisible(false);
            jRadioButton22.setVisible(false);
            jRadioButton22.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox93ItemStateChanged

    private void jCheckBox94ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox94ItemStateChanged
        if (jCheckBox94.isSelected()) {
            jCheckBox93.setSelected(false);
            txtcompacti6.setVisible(true);
            jLabel65.setVisible(true);
            Falsificacion.setPgrutinaope4("Sí");
            jRadioButton22.setVisible(true);
        } else {
            Falsificacion.setPgrutinaope4("-");
            txtcompacti6.setVisible(false);
            jLabel65.setVisible(false);
            jRadioButton22.setVisible(false);
            jRadioButton22.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox94ItemStateChanged

    private void jCheckBox95ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox95ItemStateChanged
        if (jCheckBox95.isSelected()) {
            jCheckBox96.setSelected(false);
            Falsificacion.setPgrutinaope5("No");
            txtcompacti7.setVisible(false);
            jLabel66.setVisible(false);
            jRadioButton23.setVisible(false);
            jRadioButton23.setSelected(false);

        } else {
            Falsificacion.setPgrutinaope5("-");
            txtcompacti7.setVisible(false);
            jLabel66.setVisible(false);
            jRadioButton23.setVisible(false);
            jRadioButton23.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox95ItemStateChanged

    private void jCheckBox96ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox96ItemStateChanged
        if (jCheckBox96.isSelected()) {
            jCheckBox95.setSelected(false);
            txtcompacti7.setVisible(true);
            jLabel66.setVisible(true);
            Falsificacion.setPgrutinaope5("Sí");
            jRadioButton23.setVisible(true);
        } else {
            Falsificacion.setPgrutinaope5("-");
            txtcompacti7.setVisible(false);
            jLabel66.setVisible(false);
            jRadioButton23.setVisible(false);
            jRadioButton23.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox96ItemStateChanged

    private void jCheckBox97ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox97ItemStateChanged
        if (jCheckBox97.isSelected()) {
            jCheckBox98.setSelected(false);
            Falsificacion.setPgrutinaope6("No");
            txtcompacti8.setVisible(false);
            jLabel67.setVisible(false);
            jRadioButton25.setVisible(false);
            jRadioButton25.setSelected(false);

        } else {
            Falsificacion.setPgrutinaope6("-");
            txtcompacti8.setVisible(false);
            jLabel67.setVisible(false);
            jRadioButton25.setVisible(false);
            jRadioButton25.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox97ItemStateChanged

    private void jCheckBox98ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox98ItemStateChanged
        if (jCheckBox98.isSelected()) {
            jCheckBox97.setSelected(false);
            txtcompacti8.setVisible(true);
            jLabel67.setVisible(true);
            Falsificacion.setPgrutinaope6("Sí");
            jRadioButton25.setVisible(true);
        } else {
            Falsificacion.setPgrutinaope6("-");
            txtcompacti8.setVisible(false);
            jLabel67.setVisible(false);
            jRadioButton25.setVisible(false);
            jRadioButton25.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox98ItemStateChanged

    private void jCheckBox99ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox99ItemStateChanged
        if (jCheckBox99.isSelected()) {
            jCheckBox100.setSelected(false);
            Falsificacion.setPgrutinaope7("No");
            txtcompacti9.setVisible(false);
            jLabel68.setVisible(false);
            jRadioButton26.setVisible(false);
            jRadioButton26.setSelected(false);

        } else {
            Falsificacion.setPgrutinaope7("-");
            txtcompacti9.setVisible(false);
            jLabel68.setVisible(false);
            jRadioButton26.setVisible(false);
            jRadioButton26.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox99ItemStateChanged

    private void jCheckBox100ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox100ItemStateChanged
        if (jCheckBox100.isSelected()) {
            jCheckBox99.setSelected(false);
            txtcompacti9.setVisible(true);
            jLabel68.setVisible(true);
            Falsificacion.setPgrutinaope7("Sí");
            jRadioButton26.setVisible(true);
        } else {
            Falsificacion.setPgrutinaope7("-");
            txtcompacti9.setVisible(false);
            jLabel68.setVisible(false);
            jRadioButton26.setVisible(false);
            jRadioButton26.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox100ItemStateChanged

    private void jCheckBox101ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox101ItemStateChanged
        if (jCheckBox101.isSelected()) {
            jCheckBox102.setSelected(false);
            Falsificacion.setPgrutinaope8("No");
            txtcompacti10.setVisible(false);
            jLabel69.setVisible(false);
            jRadioButton27.setVisible(false);
            jRadioButton27.setSelected(false);

        } else {
            Falsificacion.setPgrutinaope8("-");
            txtcompacti10.setVisible(false);
            jLabel69.setVisible(false);
            jRadioButton27.setVisible(false);
            jRadioButton27.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox101ItemStateChanged

    private void jCheckBox102ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox102ItemStateChanged
        if (jCheckBox102.isSelected()) {
            jCheckBox101.setSelected(false);
            txtcompacti10.setVisible(true);
            jLabel69.setVisible(true);
            Falsificacion.setPgrutinaope8("Sí");
            jRadioButton27.setVisible(true);
        } else {
            Falsificacion.setPgrutinaope8("-");
            txtcompacti10.setVisible(false);
            jLabel69.setVisible(false);
            jRadioButton27.setVisible(false);
            jRadioButton27.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox102ItemStateChanged

    private void jCheckBox103ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox103ItemStateChanged
        if (jCheckBox103.isSelected()) {
            jCheckBox104.setSelected(false);
            Falsificacion.setPgrutinaope9("No");
            txtcompacti11.setVisible(false);
            jLabel70.setVisible(false);
            jRadioButton28.setVisible(false);
            jRadioButton28.setSelected(false);

        } else {
            Falsificacion.setPgrutinaope9("-");
            txtcompacti11.setVisible(false);
            jLabel70.setVisible(false);
            jRadioButton28.setVisible(false);
            jRadioButton28.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox103ItemStateChanged

    private void jCheckBox104ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox104ItemStateChanged
        if (jCheckBox104.isSelected()) {
            jCheckBox103.setSelected(false);
            txtcompacti11.setVisible(true);
            jLabel70.setVisible(true);
            Falsificacion.setPgrutinaope9("Sí");
            jRadioButton28.setVisible(true);
        } else {
            Falsificacion.setPgrutinaope9("-");
            txtcompacti11.setVisible(false);
            jLabel70.setVisible(false);
            jRadioButton28.setVisible(false);
            jRadioButton28.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox104ItemStateChanged

    private void jCheckBox105ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox105ItemStateChanged
        if (jCheckBox105.isSelected()) {
            jCheckBox106.setSelected(false);
            Falsificacion.setPgrutinaope10("No");
            txtcompacti12.setVisible(false);
            jLabel71.setVisible(false);
            jRadioButton29.setVisible(false);
            jRadioButton29.setSelected(false);

        } else {
            Falsificacion.setPgrutinaope10("-");
            txtcompacti12.setVisible(false);
            jLabel71.setVisible(false);
            jRadioButton29.setVisible(false);
            jRadioButton29.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox105ItemStateChanged

    private void jCheckBox106ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox106ItemStateChanged
        if (jCheckBox106.isSelected()) {
            jCheckBox105.setSelected(false);
            txtcompacti12.setVisible(true);
            jLabel71.setVisible(true);
            Falsificacion.setPgrutinaope10("Sí");
            jRadioButton29.setVisible(true);
        } else {
            Falsificacion.setPgrutinaope10("-");
            txtcompacti12.setVisible(false);
            jLabel71.setVisible(false);
            jRadioButton29.setVisible(false);
            jRadioButton29.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox106ItemStateChanged

    private void jCheckBox107ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox107ItemStateChanged
        if (jCheckBox107.isSelected()) {
            jCheckBox108.setSelected(false);
            Falsificacion.setPgrutinaope11("No");
            txtcompacti13.setVisible(false);
            jLabel72.setVisible(false);
            jRadioButton30.setVisible(false);
            jRadioButton30.setSelected(false);

        } else {
            Falsificacion.setPgrutinaope11("-");
            txtcompacti13.setVisible(false);
            jLabel72.setVisible(false);
            jRadioButton30.setVisible(false);
            jRadioButton30.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox107ItemStateChanged

    private void jCheckBox108ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox108ItemStateChanged
        if (jCheckBox108.isSelected()) {
            jCheckBox107.setSelected(false);
            txtcompacti13.setVisible(true);
            jLabel72.setVisible(true);
            Falsificacion.setPgrutinaope11("Sí");
            jRadioButton30.setVisible(true);
        } else {
            Falsificacion.setPgrutinaope11("-");
            txtcompacti13.setVisible(false);
            jLabel72.setVisible(false);
            jRadioButton30.setVisible(false);
            jRadioButton30.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox108ItemStateChanged

    private void jCheckBox109ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox109ItemStateChanged
        if (jCheckBox109.isSelected()) {
            jCheckBox110.setSelected(false);
            Falsificacion.setPgrutinaope12("No");
            txtcompacti14.setVisible(false);
            jLabel73.setVisible(false);
            jRadioButton31.setVisible(false);
            jRadioButton31.setSelected(false);

        } else {
            Falsificacion.setPgrutinaope12("-");
            txtcompacti14.setVisible(false);
            jLabel73.setVisible(false);
            jRadioButton31.setVisible(false);
            jRadioButton31.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox109ItemStateChanged

    private void jCheckBox110ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox110ItemStateChanged
        if (jCheckBox110.isSelected()) {
            jCheckBox109.setSelected(false);
            txtcompacti14.setVisible(true);
            jLabel73.setVisible(true);
            Falsificacion.setPgrutinaope12("Sí");
            jRadioButton31.setVisible(true);
        } else {
            Falsificacion.setPgrutinaope12("-");
            txtcompacti14.setVisible(false);
            jLabel73.setVisible(false);
            jRadioButton31.setVisible(false);
            jRadioButton31.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox110ItemStateChanged

    private void jCheckBox115ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox115ItemStateChanged
        if (jCheckBox115.isSelected()) {
            jCheckBox116.setSelected(false);
            Falsificacion.setPgrutinaadmi3("No");
            txtcompacti17.setVisible(false);
            jLabel76.setVisible(false);
            jRadioButton34.setVisible(false);
            jRadioButton34.setSelected(false);

        } else {
            Falsificacion.setPgrutinaadmi3("-");
            txtcompacti17.setVisible(false);
            jLabel76.setVisible(false);
            jRadioButton34.setVisible(false);
            jRadioButton34.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox115ItemStateChanged

    private void jCheckBox115ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox115ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox115ActionPerformed

    private void jCheckBox116ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox116ItemStateChanged
        if (jCheckBox116.isSelected()) {
            jCheckBox115.setSelected(false);
            txtcompacti17.setVisible(true);
            jLabel76.setVisible(true);
            Falsificacion.setPgrutinaadmi3("Sí");
            jRadioButton34.setVisible(true);
        } else {
            Falsificacion.setPgrutinaadmi3("-");
            txtcompacti17.setVisible(false);
            jLabel76.setVisible(false);
            jRadioButton34.setVisible(false);
            jRadioButton34.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox116ItemStateChanged

    private void jCheckBox116ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox116ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox116ActionPerformed

    private void jCheckBox117ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox117ItemStateChanged
        if (jCheckBox117.isSelected()) {
            jCheckBox118.setSelected(false);
            Falsificacion.setPgrutinaadmi4("No");
            txtcompacti18.setVisible(false);
            jLabel77.setVisible(false);
            jRadioButton35.setVisible(false);
            jRadioButton35.setSelected(false);

        } else {
            Falsificacion.setPgrutinaadmi4("-");
            txtcompacti18.setVisible(false);
            jLabel77.setVisible(false);
            jRadioButton35.setVisible(false);
            jRadioButton35.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox117ItemStateChanged

    private void jCheckBox117ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox117ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox117ActionPerformed

    private void jCheckBox118ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox118ItemStateChanged
        if (jCheckBox118.isSelected()) {
            jCheckBox117.setSelected(false);
            txtcompacti18.setVisible(true);
            jLabel77.setVisible(true);
            Falsificacion.setPgrutinaadmi4("Sí");
            jRadioButton35.setVisible(true);
        } else {
            Falsificacion.setPgrutinaadmi4("-");
            txtcompacti18.setVisible(false);
            jLabel77.setVisible(false);
            jRadioButton35.setVisible(false);
            jRadioButton35.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox118ItemStateChanged

    private void jCheckBox118ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox118ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox118ActionPerformed

    private void jCheckBox119ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox119ItemStateChanged
        if (jCheckBox119.isSelected()) {
            jCheckBox120.setSelected(false);
            Falsificacion.setPgrutinaadmi5("No");
            txtcompacti19.setVisible(false);
            jLabel78.setVisible(false);
            jRadioButton36.setVisible(false);
            jRadioButton36.setSelected(false);

        } else {
            Falsificacion.setPgrutinaadmi5("-");
            txtcompacti19.setVisible(false);
            jLabel78.setVisible(false);
            jRadioButton36.setVisible(false);
            jRadioButton36.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox119ItemStateChanged

    private void jCheckBox119ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox119ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox119ActionPerformed

    private void jCheckBox120ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox120ItemStateChanged
        if (jCheckBox120.isSelected()) {
            jCheckBox119.setSelected(false);
            txtcompacti19.setVisible(true);
            jLabel78.setVisible(true);
            Falsificacion.setPgrutinaadmi5("Sí");
            jRadioButton36.setVisible(true);
        } else {
            Falsificacion.setPgrutinaadmi5("-");
            txtcompacti19.setVisible(false);
            jLabel78.setVisible(false);
            jRadioButton36.setVisible(false);
            jRadioButton36.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox120ItemStateChanged

    private void jCheckBox120ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox120ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox120ActionPerformed

    private void jCheckBox121ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox121ItemStateChanged
        if (jCheckBox121.isSelected()) {
            jCheckBox122.setSelected(false);
            Falsificacion.setPgrutinaadmi6("No");
            txtcompacti20.setVisible(false);
            jLabel79.setVisible(false);
            jRadioButton37.setVisible(false);
            jRadioButton37.setSelected(false);

        } else {
            Falsificacion.setPgrutinaadmi6("-");
            txtcompacti20.setVisible(false);
            jLabel79.setVisible(false);
            jRadioButton37.setVisible(false);
            jRadioButton37.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox121ItemStateChanged

    private void jCheckBox121ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox121ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox121ActionPerformed

    private void jCheckBox122ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox122ItemStateChanged
        if (jCheckBox122.isSelected()) {
            jCheckBox121.setSelected(false);
            txtcompacti20.setVisible(true);
            jLabel79.setVisible(true);
            Falsificacion.setPgrutinaadmi6("Sí");
            jRadioButton37.setVisible(true);
        } else {
            Falsificacion.setPgrutinaadmi6("-");
            txtcompacti20.setVisible(false);
            jLabel79.setVisible(false);
            jRadioButton37.setVisible(false);
            jRadioButton37.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox122ItemStateChanged

    private void jCheckBox122ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox122ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox122ActionPerformed

    private void jCheckBox123ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox123ItemStateChanged
        if (jCheckBox123.isSelected()) {
            jCheckBox124.setSelected(false);
            txtcompacti21.setVisible(true);
            jLabel80.setVisible(true);
            Falsificacion.setPgrutinaadmi7("Sí");
            jRadioButton38.setVisible(true);
        } else {
            Falsificacion.setPgrutinaadmi7("-");
            txtcompacti21.setVisible(false);
            jLabel80.setVisible(false);
            jRadioButton38.setVisible(false);
            jRadioButton38.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox123ItemStateChanged

    private void jCheckBox123ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox123ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox123ActionPerformed

    private void jCheckBox124ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox124ItemStateChanged
        if (jCheckBox124.isSelected()) {
            jCheckBox123.setSelected(false);
            Falsificacion.setPgrutinaadmi7("No");
            txtcompacti21.setVisible(false);
            jLabel80.setVisible(false);
            jRadioButton38.setVisible(false);
            jRadioButton38.setSelected(false);

        } else {
            Falsificacion.setPgrutinaadmi7("-");
            txtcompacti21.setVisible(false);
            jLabel80.setVisible(false);
            jRadioButton38.setVisible(false);
            jRadioButton38.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox124ItemStateChanged

    private void jCheckBox124ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox124ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox124ActionPerformed

    private void jCheckBox125ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox125ItemStateChanged
        if (jCheckBox125.isSelected()) {
            jCheckBox126.setSelected(false);
            txtcompacti22.setVisible(true);
            jLabel81.setVisible(true);
            Falsificacion.setPgrutinaadmi8("Sí");
            jRadioButton39.setVisible(true);
        } else {
            Falsificacion.setPgrutinaadmi8("-");
            txtcompacti22.setVisible(false);
            jLabel81.setVisible(false);
            jRadioButton39.setVisible(false);
            jRadioButton39.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox125ItemStateChanged

    private void jCheckBox125ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox125ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox125ActionPerformed

    private void jCheckBox126ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox126ItemStateChanged
        if (jCheckBox126.isSelected()) {
            jCheckBox125.setSelected(false);
            Falsificacion.setPgrutinaadmi8("No");
            txtcompacti22.setVisible(false);
            jLabel81.setVisible(false);
            jRadioButton39.setVisible(false);
            jRadioButton39.setSelected(false);

        } else {
            Falsificacion.setPgrutinaadmi8("-");
            txtcompacti22.setVisible(false);
            jLabel81.setVisible(false);
            jRadioButton39.setVisible(false);
            jRadioButton39.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox126ItemStateChanged

    private void jCheckBox126ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox126ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox126ActionPerformed

    private void txtdatosfalsospre2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdatosfalsospre2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdatosfalsospre2ActionPerformed

    private void txtdatosfalsospre25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdatosfalsospre25ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdatosfalsospre25ActionPerformed

    private void jRadioButton15ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton15ItemStateChanged
        if (jRadioButton15.isSelected()) {
            Admisiones.setAdmF4("hay");
        } else {
            Admisiones.setAdmF4("nohay");
        }
    }//GEN-LAST:event_jRadioButton15ItemStateChanged

    private void jRadioButton20ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton20ItemStateChanged
        if (jRadioButton20.isSelected()) {
            Admisiones.setAdmF5("hay");
        } else {
            Admisiones.setAdmF5("nohay");
        }
    }//GEN-LAST:event_jRadioButton20ItemStateChanged

    private void jRadioButton21ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton21ItemStateChanged
        if (jRadioButton21.isSelected()) {
            Admisiones.setAdmF6("hay");
        } else {
            Admisiones.setAdmF6("nohay");
        }
    }//GEN-LAST:event_jRadioButton21ItemStateChanged

    private void jRadioButton22ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton22ItemStateChanged
        if (jRadioButton22.isSelected()) {
            Admisiones.setAdmF7("hay");
        } else {
            Admisiones.setAdmF7("nohay");
        }
    }//GEN-LAST:event_jRadioButton22ItemStateChanged

    private void jRadioButton23ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton23ItemStateChanged
        if (jRadioButton23.isSelected()) {
            Admisiones.setAdmF8("hay");
        } else {
            Admisiones.setAdmF8("nohay");
        }
    }//GEN-LAST:event_jRadioButton23ItemStateChanged

    private void jRadioButton25ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton25ItemStateChanged
        if (jRadioButton25.isSelected()) {
            Admisiones.setAdmF9("hay");
        } else {
            Admisiones.setAdmF9("nohay");
        }
    }//GEN-LAST:event_jRadioButton25ItemStateChanged

    private void jRadioButton26ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton26ItemStateChanged
        if (jRadioButton26.isSelected()) {
            Admisiones.setAdmF10("hay");
        } else {
            Admisiones.setAdmF10("nohay");
        }
    }//GEN-LAST:event_jRadioButton26ItemStateChanged

    private void jRadioButton27ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton27ItemStateChanged
        if (jRadioButton27.isSelected()) {
            Admisiones.setAdmF11("hay");
        } else {
            Admisiones.setAdmF11("nohay");
        }
    }//GEN-LAST:event_jRadioButton27ItemStateChanged

    private void jRadioButton28ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton28ItemStateChanged
        if (jRadioButton28.isSelected()) {
            Admisiones.setAdmF12("hay");
        } else {
            Admisiones.setAdmF12("nohay");
        }
    }//GEN-LAST:event_jRadioButton28ItemStateChanged

    private void jRadioButton29ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton29ItemStateChanged
        if (jRadioButton29.isSelected()) {
            Admisiones.setAdmF13("hay");
        } else {
            Admisiones.setAdmF13("nohay");
        }
    }//GEN-LAST:event_jRadioButton29ItemStateChanged

    private void jRadioButton30ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton30ItemStateChanged
        if (jRadioButton30.isSelected()) {
            Admisiones.setAdmF14("hay");
        } else {
            Admisiones.setAdmF14("nohay");
        }
    }//GEN-LAST:event_jRadioButton30ItemStateChanged

    private void jRadioButton31ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton31ItemStateChanged
        if (jRadioButton31.isSelected()) {
            Admisiones.setAdmF15("hay");
        } else {
            Admisiones.setAdmF15("nohay");
        }
    }//GEN-LAST:event_jRadioButton31ItemStateChanged

    private void jRadioButton34ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton34ItemStateChanged
        if (jRadioButton34.isSelected()) {
            Admisiones.setAdmF17("hay");
        } else {
            Admisiones.setAdmF17("nohay");
        }
    }//GEN-LAST:event_jRadioButton34ItemStateChanged

    private void jRadioButton35ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton35ItemStateChanged
        if (jRadioButton35.isSelected()) {
            Admisiones.setAdmF18("hay");
        } else {
            Admisiones.setAdmF18("nohay");
        }
    }//GEN-LAST:event_jRadioButton35ItemStateChanged

    private void jRadioButton36ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton36ItemStateChanged
        if (jRadioButton36.isSelected()) {
            Admisiones.setAdmF19("hay");
        } else {
            Admisiones.setAdmF19("nohay");
        }
    }//GEN-LAST:event_jRadioButton36ItemStateChanged

    private void jRadioButton37ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton37ItemStateChanged
        if (jRadioButton37.isSelected()) {
            Admisiones.setAdmF20("hay");
        } else {
            Admisiones.setAdmF20("nohay");
        }
    }//GEN-LAST:event_jRadioButton37ItemStateChanged

    private void jRadioButton38ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton38ItemStateChanged
        if (jRadioButton38.isSelected()) {
            Admisiones.setAdmF21("hay");
        } else {
            Admisiones.setAdmF21("nohay");
        }
    }//GEN-LAST:event_jRadioButton38ItemStateChanged

    private void jRadioButton39ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton39ItemStateChanged
        if (jRadioButton39.isSelected()) {
            Admisiones.setAdmF22("hay");
        } else {
            Admisiones.setAdmF22("nohay");
        }
    }//GEN-LAST:event_jRadioButton39ItemStateChanged

    private void jRadioButton1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton1ItemStateChanged
        if (jRadioButton1.isSelected()) {
            Admisiones.setAdmF23("hay");
        } else {
            Admisiones.setAdmF23("nohay");
        }
    }//GEN-LAST:event_jRadioButton1ItemStateChanged

    private void jRadioButton2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton2ItemStateChanged
        if (jRadioButton2.isSelected()) {
            Admisiones.setAdmF24("hay");
        } else {
            Admisiones.setAdmF24("nohay");
        }
    }//GEN-LAST:event_jRadioButton2ItemStateChanged

    private void jRadioButton3ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton3ItemStateChanged
        if (jRadioButton3.isSelected()) {
            Admisiones.setAdmF25("hay");
        } else {
            Admisiones.setAdmF25("nohay");
        }
    }//GEN-LAST:event_jRadioButton3ItemStateChanged

    private void jRadioButton4ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton4ItemStateChanged
        if (jRadioButton4.isSelected()) {
            Admisiones.setAdmF26("hay");
        } else {
            Admisiones.setAdmF26("nohay");
        }
    }//GEN-LAST:event_jRadioButton4ItemStateChanged

    private void jRadioButton5ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton5ItemStateChanged
        if (jRadioButton5.isSelected()) {
            Admisiones.setAdmF27("hay");
        } else {
            Admisiones.setAdmF27("nohay");
        }
    }//GEN-LAST:event_jRadioButton5ItemStateChanged

    private void jRadioButton6ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton6ItemStateChanged
        if (jRadioButton6.isSelected()) {
            Admisiones.setAdmF28("hay");
        } else {
            Admisiones.setAdmF28("nohay");
        }
    }//GEN-LAST:event_jRadioButton6ItemStateChanged

    private void jRadioButton7ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton7ItemStateChanged
        if (jRadioButton7.isSelected()) {
            Admisiones.setAdmF29("hay");
        } else {
            Admisiones.setAdmF29("nohay");
        }
    }//GEN-LAST:event_jRadioButton7ItemStateChanged

    private void jRadioButton9ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton9ItemStateChanged
        if (jRadioButton9.isSelected()) {
            Admisiones.setAdmF30("hay");
        } else {
            Admisiones.setAdmF30("nohay");
        }
    }//GEN-LAST:event_jRadioButton9ItemStateChanged

    private void jRadioButton8ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton8ItemStateChanged
        if (jRadioButton8.isSelected()) {
            Admisiones.setAdmF31("hay");
        } else {
            Admisiones.setAdmF31("nohay");
        }
    }//GEN-LAST:event_jRadioButton8ItemStateChanged

    private void jRadioButton10ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton10ItemStateChanged
        if (jRadioButton10.isSelected()) {
            Admisiones.setAdmF32("hay");
        } else {
            Admisiones.setAdmF32("nohay");
        }
    }//GEN-LAST:event_jRadioButton10ItemStateChanged

    private void jRadioButton11ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton11ItemStateChanged
        if (jRadioButton11.isSelected()) {
            Admisiones.setAdmF33("hay");
        } else {
            Admisiones.setAdmF33("nohay");
        }
    }//GEN-LAST:event_jRadioButton11ItemStateChanged

    private void jRadioButton12ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton12ItemStateChanged
        if (jRadioButton12.isSelected()) {
            Admisiones.setAdmF34("hay");
        } else {
            Admisiones.setAdmF34("nohay");
        }
    }//GEN-LAST:event_jRadioButton12ItemStateChanged

    private void jRadioButton13ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton13ItemStateChanged
        if (jRadioButton13.isSelected()) {
            Admisiones.setAdmF35("hay");
        } else {
            Admisiones.setAdmF35("nohay");
        }
    }//GEN-LAST:event_jRadioButton13ItemStateChanged

    private void jRadioButton14ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton14ItemStateChanged
        if (jRadioButton14.isSelected()) {
            Admisiones.setAdmF36("hay");
        } else {
            Admisiones.setAdmF36("nohay");
        }
    }//GEN-LAST:event_jRadioButton14ItemStateChanged

    private void jRadioButton16ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton16ItemStateChanged
        if (jRadioButton16.isSelected()) {
            Admisiones.setAdmF37("hay");
        } else {
            Admisiones.setAdmF37("nohay");
        }
    }//GEN-LAST:event_jRadioButton16ItemStateChanged

    private void jRadioButton17ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton17ItemStateChanged
        if (jRadioButton17.isSelected()) {
            Admisiones.setAdmF38("hay");
        } else {
            Admisiones.setAdmF38("nohay");
        }
    }//GEN-LAST:event_jRadioButton17ItemStateChanged

    private void jRadioButton18ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton18ItemStateChanged
        if (jRadioButton18.isSelected()) {
            Admisiones.setAdmF39("hay");
        } else {
            Admisiones.setAdmF39("nohay");
        }
    }//GEN-LAST:event_jRadioButton18ItemStateChanged

    private void jRadioButton19ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton19ItemStateChanged
        if (jRadioButton19.isSelected()) {
            Admisiones.setAdmF40("hay");
        } else {
            Admisiones.setAdmF40("nohay");
        }
    }//GEN-LAST:event_jRadioButton19ItemStateChanged

    private void jRadioButton24ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton24ItemStateChanged
        if (jRadioButton24.isSelected()) {
            Admisiones.setAdmF41("hay");
        } else {
            Admisiones.setAdmF41("nohay");
        }
    }//GEN-LAST:event_jRadioButton24ItemStateChanged

    private void txtcompacti3CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtcompacti3CaretUpdate
        Falsificacion.setRpgrutinaope1(txtcompacti3.getText());
    }//GEN-LAST:event_txtcompacti3CaretUpdate

    private void txtcompacti4CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtcompacti4CaretUpdate
        Falsificacion.setRpgrutinaope2(txtcompacti4.getText());
    }//GEN-LAST:event_txtcompacti4CaretUpdate

    private void txtcompacti5CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtcompacti5CaretUpdate
        Falsificacion.setRpgrutinaope3(txtcompacti5.getText());
    }//GEN-LAST:event_txtcompacti5CaretUpdate

    private void txtcompacti6CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtcompacti6CaretUpdate
        Falsificacion.setRpgrutinaope4(txtcompacti6.getText());
    }//GEN-LAST:event_txtcompacti6CaretUpdate

    private void txtcompacti7CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtcompacti7CaretUpdate
        Falsificacion.setRpgrutinaope5(txtcompacti7.getText());
    }//GEN-LAST:event_txtcompacti7CaretUpdate

    private void txtcompacti8CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtcompacti8CaretUpdate
        Falsificacion.setRpgrutinaope6(txtcompacti8.getText());
    }//GEN-LAST:event_txtcompacti8CaretUpdate

    private void txtcompacti9CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtcompacti9CaretUpdate
        Falsificacion.setRpgrutinaope7(txtcompacti9.getText());
    }//GEN-LAST:event_txtcompacti9CaretUpdate

    private void txtcompacti10CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtcompacti10CaretUpdate
        Falsificacion.setRpgrutinaope8(txtcompacti10.getText());
    }//GEN-LAST:event_txtcompacti10CaretUpdate

    private void txtcompacti11CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtcompacti11CaretUpdate
        Falsificacion.setRpgrutinaope9(txtcompacti11.getText());
    }//GEN-LAST:event_txtcompacti11CaretUpdate

    private void txtcompacti12CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtcompacti12CaretUpdate
        Falsificacion.setRpgrutinaope10(txtcompacti12.getText());
    }//GEN-LAST:event_txtcompacti12CaretUpdate

    private void txtcompacti13CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtcompacti13CaretUpdate
        Falsificacion.setRpgrutinaope11(txtcompacti13.getText());
    }//GEN-LAST:event_txtcompacti13CaretUpdate

    private void txtcompacti14CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtcompacti14CaretUpdate
        Falsificacion.setRpgrutinaope12(txtcompacti14.getText());
    }//GEN-LAST:event_txtcompacti14CaretUpdate

    private void txtcompacti15CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtcompacti15CaretUpdate
        Falsificacion.setPgrutinaadmi1(txtcompacti15.getText());
    }//GEN-LAST:event_txtcompacti15CaretUpdate

    private void txtcompacti16CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtcompacti16CaretUpdate
        Falsificacion.setPgrutinaadmi2(txtcompacti16.getText());
    }//GEN-LAST:event_txtcompacti16CaretUpdate

    private void txtcompacti17CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtcompacti17CaretUpdate
        Falsificacion.setRpgrutinaadmi3(txtcompacti17.getText());
    }//GEN-LAST:event_txtcompacti17CaretUpdate

    private void txtcompacti18CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtcompacti18CaretUpdate
        Falsificacion.setRpgrutinaadmi4(txtcompacti18.getText());
    }//GEN-LAST:event_txtcompacti18CaretUpdate

    private void txtcompacti19CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtcompacti19CaretUpdate
        Falsificacion.setRpgrutinaadmi5(txtcompacti19.getText());;
    }//GEN-LAST:event_txtcompacti19CaretUpdate

    private void txtcompacti20CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtcompacti20CaretUpdate
        Falsificacion.setRpgrutinaadmi6(txtcompacti20.getText());
    }//GEN-LAST:event_txtcompacti20CaretUpdate

    private void txtcompacti21CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtcompacti21CaretUpdate
        Falsificacion.setRpgrutinaadmi7(txtcompacti21.getText());
    }//GEN-LAST:event_txtcompacti21CaretUpdate

    private void txtcompacti22CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtcompacti22CaretUpdate
        Falsificacion.setRpgrutinaadmi8(txtcompacti22.getText());
    }//GEN-LAST:event_txtcompacti22CaretUpdate

    private void txtdatosfalsospre1CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtdatosfalsospre1CaretUpdate
        Falsificacion.setRpgrutina1(txtdatosfalsospre1.getText());
    }//GEN-LAST:event_txtdatosfalsospre1CaretUpdate

    private void txtdatosfalsospre2CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtdatosfalsospre2CaretUpdate
        Falsificacion.setRpgrutina2(txtdatosfalsospre2.getText());
    }//GEN-LAST:event_txtdatosfalsospre2CaretUpdate

    private void txtdatosfalsospre3CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtdatosfalsospre3CaretUpdate
        Falsificacion.setRpgrutina3(txtdatosfalsospre3.getText());
    }//GEN-LAST:event_txtdatosfalsospre3CaretUpdate

    private void txtdatosfalsospre4CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtdatosfalsospre4CaretUpdate
        Falsificacion.setRpgrutina4(txtdatosfalsospre4.getText());
    }//GEN-LAST:event_txtdatosfalsospre4CaretUpdate

    private void txtdatosfalsospre5CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtdatosfalsospre5CaretUpdate
        Falsificacion.setRpgrutina5(txtdatosfalsospre5.getText());
    }//GEN-LAST:event_txtdatosfalsospre5CaretUpdate

    private void txtdatosfalsospre6CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtdatosfalsospre6CaretUpdate
        Falsificacion.setRpgrutina6(txtdatosfalsospre6.getText());
    }//GEN-LAST:event_txtdatosfalsospre6CaretUpdate

    private void txtdatosfalsospre7CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtdatosfalsospre7CaretUpdate
        Falsificacion.setRpgrutina7(txtdatosfalsospre7.getText());
    }//GEN-LAST:event_txtdatosfalsospre7CaretUpdate

    private void txtdatosfalsospre8CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtdatosfalsospre8CaretUpdate
        Falsificacion.setRpgrutina8(txtdatosfalsospre8.getText());
    }//GEN-LAST:event_txtdatosfalsospre8CaretUpdate

    private void txtdatosfalsospre9CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtdatosfalsospre9CaretUpdate
        Falsificacion.setRpgrutina9(txtdatosfalsospre9.getText());
    }//GEN-LAST:event_txtdatosfalsospre9CaretUpdate

    private void txtdatosfalsospre10CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtdatosfalsospre10CaretUpdate
        Falsificacion.setRpgrutina10(txtdatosfalsospre10.getText());
    }//GEN-LAST:event_txtdatosfalsospre10CaretUpdate

    private void txtdatosfalsospre11CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtdatosfalsospre11CaretUpdate
        Falsificacion.setRpgrutina11(txtdatosfalsospre11.getText());
    }//GEN-LAST:event_txtdatosfalsospre11CaretUpdate

    private void txtdatosfalsospre12CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtdatosfalsospre12CaretUpdate
        Falsificacion.setRpgrutina12(txtdatosfalsospre12.getText());
    }//GEN-LAST:event_txtdatosfalsospre12CaretUpdate

    private void txtdatosfalsospre13CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtdatosfalsospre13CaretUpdate
        Falsificacion.setRpgrutina13(txtdatosfalsospre13.getText());
    }//GEN-LAST:event_txtdatosfalsospre13CaretUpdate

    private void txtdatosfalsospre14CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtdatosfalsospre14CaretUpdate
        Falsificacion.setRpgrutina14(txtdatosfalsospre14.getText());
    }//GEN-LAST:event_txtdatosfalsospre14CaretUpdate

    private void txtdatosfalsospre16CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtdatosfalsospre16CaretUpdate
        Falsificacion.setRpgrutina15(txtdatosfalsospre16.getText());
    }//GEN-LAST:event_txtdatosfalsospre16CaretUpdate

    private void txtdatosfalsospre17CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtdatosfalsospre17CaretUpdate
        Falsificacion.setRpgrutina16(txtdatosfalsospre17.getText());
    }//GEN-LAST:event_txtdatosfalsospre17CaretUpdate

    private void txtdatosfalsospre18CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtdatosfalsospre18CaretUpdate
        Falsificacion.setRpgrutina17(txtdatosfalsospre18.getText());
    }//GEN-LAST:event_txtdatosfalsospre18CaretUpdate

    private void txtdatosfalsospre19CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtdatosfalsospre19CaretUpdate
        Falsificacion.setRpgrutina18(txtdatosfalsospre19.getText());
    }//GEN-LAST:event_txtdatosfalsospre19CaretUpdate

    private void txtdatosfalsospre24CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtdatosfalsospre24CaretUpdate
        Falsificacion.setRpgrutina19(txtdatosfalsospre24.getText());
    }//GEN-LAST:event_txtdatosfalsospre24CaretUpdate


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox chbxbodegueros1;
    private javax.swing.JCheckBox chbxbodegueros2;
    private javax.swing.JCheckBox chbxbodegueros3;
    private javax.swing.JCheckBox chbxbodegueros4;
    private javax.swing.JCheckBox chbxbodegueros5;
    private javax.swing.JCheckBox chbxbodegueros6;
    private javax.swing.JCheckBox chbxbodegueros7;
    private javax.swing.JCheckBox chbxbodegueros8;
    private javax.swing.JCheckBox chbxbodegueros9;
    private javax.swing.JCheckBox chbxcertante;
    private javax.swing.JCheckBox chbxcertiaca;
    private javax.swing.JCheckBox chbxcertilabo;
    private javax.swing.JCheckBox chbxdocperso;
    private javax.swing.JCheckBox chbxinforentre;
    private javax.swing.JCheckBox chbxinforentrepoli;
    private javax.swing.JCheckBox chbxinforhv;
    private javax.swing.JCheckBox chbxrefpers;
    private javax.swing.JLabel datosfalsospre1;
    private javax.swing.JLabel datosfalsospre10;
    private javax.swing.JLabel datosfalsospre11;
    private javax.swing.JLabel datosfalsospre12;
    private javax.swing.JLabel datosfalsospre13;
    private javax.swing.JLabel datosfalsospre14;
    private javax.swing.JLabel datosfalsospre15;
    private javax.swing.JLabel datosfalsospre16;
    private javax.swing.JLabel datosfalsospre17;
    private javax.swing.JLabel datosfalsospre18;
    private javax.swing.JLabel datosfalsospre19;
    private javax.swing.JLabel datosfalsospre2;
    private javax.swing.JLabel datosfalsospre20;
    private javax.swing.JLabel datosfalsospre21;
    private javax.swing.JLabel datosfalsospre24;
    private javax.swing.JLabel datosfalsospre25;
    private javax.swing.JLabel datosfalsospre26;
    private javax.swing.JLabel datosfalsospre27;
    private javax.swing.JLabel datosfalsospre28;
    private javax.swing.JLabel datosfalsospre29;
    private javax.swing.JLabel datosfalsospre3;
    private javax.swing.JLabel datosfalsospre30;
    private javax.swing.JLabel datosfalsospre31;
    private javax.swing.JLabel datosfalsospre32;
    private javax.swing.JLabel datosfalsospre34;
    private javax.swing.JLabel datosfalsospre35;
    private javax.swing.JLabel datosfalsospre36;
    private javax.swing.JLabel datosfalsospre37;
    private javax.swing.JLabel datosfalsospre38;
    private javax.swing.JLabel datosfalsospre39;
    private javax.swing.JLabel datosfalsospre4;
    private javax.swing.JLabel datosfalsospre40;
    private javax.swing.JLabel datosfalsospre41;
    private javax.swing.JLabel datosfalsospre42;
    private javax.swing.JLabel datosfalsospre43;
    private javax.swing.JLabel datosfalsospre44;
    private javax.swing.JLabel datosfalsospre45;
    private javax.swing.JLabel datosfalsospre46;
    private javax.swing.JLabel datosfalsospre47;
    private javax.swing.JLabel datosfalsospre48;
    private javax.swing.JLabel datosfalsospre5;
    private javax.swing.JLabel datosfalsospre50;
    private javax.swing.JLabel datosfalsospre6;
    private javax.swing.JLabel datosfalsospre7;
    private javax.swing.JLabel datosfalsospre8;
    private javax.swing.JLabel datosfalsospre9;
    private javax.swing.JCheckBox jCheckBox100;
    private javax.swing.JCheckBox jCheckBox101;
    private javax.swing.JCheckBox jCheckBox102;
    private javax.swing.JCheckBox jCheckBox103;
    private javax.swing.JCheckBox jCheckBox104;
    private javax.swing.JCheckBox jCheckBox105;
    private javax.swing.JCheckBox jCheckBox106;
    private javax.swing.JCheckBox jCheckBox107;
    private javax.swing.JCheckBox jCheckBox108;
    private javax.swing.JCheckBox jCheckBox109;
    private javax.swing.JCheckBox jCheckBox110;
    private javax.swing.JCheckBox jCheckBox115;
    private javax.swing.JCheckBox jCheckBox116;
    private javax.swing.JCheckBox jCheckBox117;
    private javax.swing.JCheckBox jCheckBox118;
    private javax.swing.JCheckBox jCheckBox119;
    private javax.swing.JCheckBox jCheckBox120;
    private javax.swing.JCheckBox jCheckBox121;
    private javax.swing.JCheckBox jCheckBox122;
    private javax.swing.JCheckBox jCheckBox123;
    private javax.swing.JCheckBox jCheckBox124;
    private javax.swing.JCheckBox jCheckBox125;
    private javax.swing.JCheckBox jCheckBox126;
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
    private javax.swing.JCheckBox jCheckBox61;
    private javax.swing.JCheckBox jCheckBox62;
    private javax.swing.JCheckBox jCheckBox63;
    private javax.swing.JCheckBox jCheckBox64;
    private javax.swing.JCheckBox jCheckBox65;
    private javax.swing.JCheckBox jCheckBox66;
    private javax.swing.JCheckBox jCheckBox67;
    private javax.swing.JCheckBox jCheckBox68;
    private javax.swing.JCheckBox jCheckBox77;
    private javax.swing.JCheckBox jCheckBox78;
    private javax.swing.JCheckBox jCheckBox79;
    private javax.swing.JCheckBox jCheckBox80;
    private javax.swing.JCheckBox jCheckBox81;
    private javax.swing.JCheckBox jCheckBox82;
    private javax.swing.JCheckBox jCheckBox83;
    private javax.swing.JCheckBox jCheckBox84;
    private javax.swing.JCheckBox jCheckBox85;
    private javax.swing.JCheckBox jCheckBox86;
    private javax.swing.JCheckBox jCheckBox87;
    private javax.swing.JCheckBox jCheckBox88;
    private javax.swing.JCheckBox jCheckBox89;
    private javax.swing.JCheckBox jCheckBox90;
    private javax.swing.JCheckBox jCheckBox91;
    private javax.swing.JCheckBox jCheckBox92;
    private javax.swing.JCheckBox jCheckBox93;
    private javax.swing.JCheckBox jCheckBox94;
    private javax.swing.JCheckBox jCheckBox95;
    private javax.swing.JCheckBox jCheckBox96;
    private javax.swing.JCheckBox jCheckBox97;
    private javax.swing.JCheckBox jCheckBox98;
    private javax.swing.JCheckBox jCheckBox99;
    private javax.swing.JLabel jLabel138;
    private javax.swing.JLabel jLabel139;
    private javax.swing.JLabel jLabel210;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton10;
    private javax.swing.JRadioButton jRadioButton11;
    private javax.swing.JRadioButton jRadioButton12;
    private javax.swing.JRadioButton jRadioButton13;
    private javax.swing.JRadioButton jRadioButton14;
    private javax.swing.JRadioButton jRadioButton15;
    private javax.swing.JRadioButton jRadioButton16;
    private javax.swing.JRadioButton jRadioButton17;
    private javax.swing.JRadioButton jRadioButton18;
    private javax.swing.JRadioButton jRadioButton19;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton20;
    private javax.swing.JRadioButton jRadioButton21;
    private javax.swing.JRadioButton jRadioButton22;
    private javax.swing.JRadioButton jRadioButton23;
    private javax.swing.JRadioButton jRadioButton24;
    private javax.swing.JRadioButton jRadioButton25;
    private javax.swing.JRadioButton jRadioButton26;
    private javax.swing.JRadioButton jRadioButton27;
    private javax.swing.JRadioButton jRadioButton28;
    private javax.swing.JRadioButton jRadioButton29;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton30;
    private javax.swing.JRadioButton jRadioButton31;
    private javax.swing.JRadioButton jRadioButton34;
    private javax.swing.JRadioButton jRadioButton35;
    private javax.swing.JRadioButton jRadioButton36;
    private javax.swing.JRadioButton jRadioButton37;
    private javax.swing.JRadioButton jRadioButton38;
    private javax.swing.JRadioButton jRadioButton39;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JRadioButton jRadioButton8;
    private javax.swing.JRadioButton jRadioButton9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtcompacti1;
    private javax.swing.JTextField txtcompacti10;
    private javax.swing.JTextField txtcompacti11;
    private javax.swing.JTextField txtcompacti12;
    private javax.swing.JTextField txtcompacti13;
    private javax.swing.JTextField txtcompacti14;
    private javax.swing.JTextField txtcompacti15;
    private javax.swing.JTextField txtcompacti16;
    private javax.swing.JTextField txtcompacti17;
    private javax.swing.JTextField txtcompacti18;
    private javax.swing.JTextField txtcompacti19;
    private javax.swing.JTextField txtcompacti2;
    private javax.swing.JTextField txtcompacti20;
    private javax.swing.JTextField txtcompacti21;
    private javax.swing.JTextField txtcompacti22;
    private javax.swing.JTextField txtcompacti3;
    private javax.swing.JTextField txtcompacti4;
    private javax.swing.JTextField txtcompacti5;
    private javax.swing.JTextField txtcompacti6;
    private javax.swing.JTextField txtcompacti7;
    private javax.swing.JTextField txtcompacti8;
    private javax.swing.JTextField txtcompacti9;
    private javax.swing.JTextField txtdatosfalsospre1;
    private javax.swing.JTextField txtdatosfalsospre10;
    private javax.swing.JTextField txtdatosfalsospre11;
    private javax.swing.JTextField txtdatosfalsospre12;
    private javax.swing.JTextField txtdatosfalsospre13;
    private javax.swing.JTextField txtdatosfalsospre14;
    private javax.swing.JTextField txtdatosfalsospre16;
    private javax.swing.JTextField txtdatosfalsospre17;
    private javax.swing.JTextField txtdatosfalsospre18;
    private javax.swing.JTextField txtdatosfalsospre19;
    private javax.swing.JTextField txtdatosfalsospre2;
    private javax.swing.JTextField txtdatosfalsospre24;
    private javax.swing.JTextField txtdatosfalsospre25;
    private javax.swing.JTextField txtdatosfalsospre26;
    private javax.swing.JTextField txtdatosfalsospre27;
    private javax.swing.JTextField txtdatosfalsospre28;
    private javax.swing.JTextField txtdatosfalsospre3;
    private javax.swing.JTextField txtdatosfalsospre4;
    private javax.swing.JTextField txtdatosfalsospre5;
    private javax.swing.JTextField txtdatosfalsospre6;
    private javax.swing.JTextField txtdatosfalsospre7;
    private javax.swing.JTextField txtdatosfalsospre8;
    private javax.swing.JTextField txtdatosfalsospre9;
    // End of variables declaration//GEN-END:variables
}
