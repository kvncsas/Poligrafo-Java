package view;

import classes.Admisiones;
import classes.DatosPrincipales;
import classes.HistoriaLaboral;
import com.inet.jortho.SpellChecker;
import icons.Thinking_uh;
import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author Kevin Casas
 */
public class HistorialLaboral extends javax.swing.JInternalFrame {

    public HistorialLaboral() {
        ((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI()).setNorthPane(null);
        initComponents();
        jScrollPane4.getVerticalScrollBar().setUnitIncrement(15);
        guiashistoria_laboral();
        Ocultos();
    }

    public void guiashistoria_laboral() {
        CorrectorOrtografia p = new CorrectorOrtografia("", jTextArea5);
        CorrectorOrtografia p1 = new CorrectorOrtografia("En cuanto a conducta laboral comentó...", txtresphistolaantes);
        CorrectorOrtografia p2 = new CorrectorOrtografia("Dijo que...", txtresphistola1);
        CorrectorOrtografia p3 = new CorrectorOrtografia("Admitió que...", txtresphistola2);
        CorrectorOrtografia p4 = new CorrectorOrtografia("Contó...", txtresphistola3);
        CorrectorOrtografia p5 = new CorrectorOrtografia("Explicó...", txtresphistola4);
        CorrectorOrtografia p6 = new CorrectorOrtografia("Afirmó...", txtresphistola5);
        CorrectorOrtografia p7 = new CorrectorOrtografia("Aclaró...", txtresphistola6);
        CorrectorOrtografia p8 = new CorrectorOrtografia("Refirió...", txtresphistola7);
        CorrectorOrtografia p9 = new CorrectorOrtografia("Manifestó...", txtresphistola8);

        SpellChecker.register(jTextArea5);
        SpellChecker.register(txtresphistolaantes);
        SpellChecker.register(txtresphistola1);
        SpellChecker.register(txtresphistola2);
        SpellChecker.register(txtresphistola3);
        SpellChecker.register(txtresphistola4);
        SpellChecker.register(txtresphistola5);
        SpellChecker.register(txtresphistola6);
        SpellChecker.register(txtresphistola7);
        SpellChecker.register(txtresphistola8);
        SpellChecker.register(txtresphistola9);
    }

    public void Ocultos() {
        sptiempolaboro.setEnabled(false);
        sptiempolaboro1.setEnabled(false);
        sptiempolaboro3.setEnabled(false);
        sptiempolaboro4.setEnabled(false);
        sptiempolaboro5.setEnabled(false);
        sptiempolaboro6.setEnabled(false);
        sptiempolaboro7.setEnabled(false);
        sptiempolaboro8.setEnabled(false);
        sptiempolaboro9.setEnabled(false);
        sptiempolaboro10.setEnabled(false);
        sptiempolaboro11.setEnabled(false);
        sptiempolaboro12.setEnabled(false);
        sptiempolaboro13.setEnabled(false);
        sptiempolaboro14.setEnabled(false);
        sptiempolaboro15.setEnabled(false);

        //empleos
        jPanel2.setVisible(false);
        jPanel3.setVisible(false);
        jPanel5.setVisible(false);
        jPanel6.setVisible(false);
        jPanel7.setVisible(false);
        jPanel8.setVisible(false);
        jPanel9.setVisible(false);
        jPanel10.setVisible(false);
        jPanel11.setVisible(false);
        jPanel12.setVisible(false);
        jPanel13.setVisible(false);
        jPanel14.setVisible(false);
        jPanel15.setVisible(false);
        jPanel16.setVisible(false);
        jPanel17.setVisible(false);

        //cbx pregunta 1
        chbxfalsirobo.setEnabled(false);
        chbxfalsifraude.setEnabled(false);
        chbxfalsiestafa.setEnabled(false);
        chbxfalsisustraccioninf.setEnabled(false);
        chbxfalspartactirre.setEnabled(false);
        chbxfalspartactirre1.setEnabled(false);

        //pre pg1
        jRadioButton18.setEnabled(false);
        txtresphistolaantes.setVisible(false);
        jLabel104.setVisible(false);

        //pg1
        jRadioButton19.setEnabled(false);
        txtresphistola1.setVisible(false);
        jLabel105.setVisible(false);

        //pg2
        jRadioButton20.setEnabled(false);
        txtresphistola2.setVisible(false);
        jLabel106.setVisible(false);

        //pg3
        jRadioButton21.setEnabled(false);
        txtresphistola3.setVisible(false);
        jLabel107.setVisible(false);

        //pg4
        jRadioButton22.setEnabled(false);
        txtresphistola4.setVisible(false);
        jLabel114.setVisible(false);

        //pg5
        jRadioButton24.setEnabled(false);
        txtresphistola6.setVisible(false);
        jLabel112.setVisible(false);

        //pg6
        jRadioButton25.setEnabled(false);
        txtresphistola7.setVisible(false);
        jLabel111.setVisible(false);

        //pg7
        jRadioButton26.setEnabled(false);
        txtresphistola8.setVisible(false);
        jLabel110.setVisible(false);

        //pg8
        jRadioButton23.setEnabled(false);
        txtresphistola5.setVisible(false);
        jLabel113.setVisible(false);

        //admi
        txtresphistola9.setVisible(false);
        jLabel109.setVisible(false);
    }

    public void ValidacionTipoExamen() {
        if (DatosPrincipales.getTipoExamen().equals("Pre-empleo")) {
            Ocultos();
        } else {

        }
    }

    String comparacion = "";
    String comparacion1 = "";
    String comparacion2 = "";
    String comparacion3 = "";
    String comparacion4 = "";
    String comparacion5 = "";
    String comparacion6 = "";
    String comparacion7 = "";
    String comparacion8 = "";
    String comparacion9 = "";
    String comparacion10 = "";
    String comparacion11 = "";
    String comparacion12 = "";
    String comparacion13 = "";
    String comparacion14 = "";

    String mesI1;
    String mesR1;
    String anioI1;
    String anioR1;
    String meses1;

    String mesI2;
    String mesR2;
    String anioI2;
    String anioR2;
    String meses2;

    String mesI3;
    String mesR3;
    String anioI3;
    String anioR3;
    String meses3;

    String mesI4;
    String mesR4;
    String anioI4;
    String anioR4;
    String meses4;

    String mesI5;
    String mesR5;
    String anioI5;
    String anioR5;
    String meses5;

    String mesI6;
    String mesR6;
    String anioI6;
    String anioR6;
    String meses6;

    String mesI7;
    String mesR7;
    String anioI7;
    String anioR7;
    String meses7;

    String mesI8;
    String mesR8;
    String anioI8;
    String anioR8;
    String meses8;

    String mesI9;
    String mesR9;
    String anioI9;
    String anioR9;
    String meses9;

    String mesI10;
    String mesR10;
    String anioI10;
    String anioR10;
    String meses10;

    String mesI11;
    String mesR11;
    String anioI11;
    String anioR11;
    String meses11;

    String mesI12;
    String mesR12;
    String anioI12;
    String anioR12;
    String meses12;

    String mesI13;
    String mesR13;
    String anioI13;
    String anioR13;
    String meses13;

    String mesI14;
    String mesR14;
    String anioI14;
    String anioR14;
    String meses14;

    String mesI15;
    String mesR15;
    String anioI15;
    String anioR15;
    String meses15;

    int anio1;
    int anio2;
    int mes1;
    int mes2;

    int anio1_2;
    int anio2_2;
    int mes1_2;
    int mes2_2;

    int anio1_3;
    int anio2_3;
    int mes1_3;
    int mes2_3;

    int anio1_4;
    int anio2_4;
    int mes1_4;
    int mes2_4;

    int anio1_5;
    int anio2_5;
    int mes1_5;
    int mes2_5;

    int anio1_6;
    int anio2_6;
    int mes1_6;
    int mes2_6;

    int anio1_7;
    int anio2_7;
    int mes1_7;
    int mes2_7;

    int anio1_8;
    int anio2_8;
    int mes1_8;
    int mes2_8;

    int anio1_9;
    int anio2_9;
    int mes1_9;
    int mes2_9;

    int anio1_10;
    int anio2_10;
    int mes1_10;
    int mes2_10;

    int anio1_11;
    int anio2_11;
    int mes1_11;
    int mes2_11;

    int anio1_12;
    int anio2_12;
    int mes1_12;
    int mes2_12;

    int anio1_13;
    int anio2_13;
    int mes1_13;
    int mes2_13;

    int anio1_14;
    int anio2_14;
    int mes1_14;
    int mes2_14;

    int anio1_15;
    int anio2_15;
    int mes1_15;
    int mes2_15;

    public void validacionfechas() {
        if (HistoriaLaboral.isVnfecha1()) {
            HistoriaLaboral.setMesingreso1(mesI1);
            HistoriaLaboral.setAnioingreso1(anioI1);
            HistoriaLaboral.setMesretiro1(mesI1);
            HistoriaLaboral.setAnioretiro1(anioR1);
            HistoriaLaboral.setMesesla1(sptiempolaboro.getText());
        } else {
            HistoriaLaboral.setMesingreso1("");
            HistoriaLaboral.setAnioingreso1("");
            HistoriaLaboral.setMesretiro1("");
            HistoriaLaboral.setAnioretiro1("");
            HistoriaLaboral.setMesesla1(sptiempolaboro.getText());
        }
        if (HistoriaLaboral.isVnfecha2()) {
            HistoriaLaboral.setMesingreso2(mesI2);
            HistoriaLaboral.setAnioingreso2(anioI2);
            HistoriaLaboral.setMesretiro2(mesI2);
            HistoriaLaboral.setAnioretiro2(anioR2);
            HistoriaLaboral.setMesesla2(sptiempolaboro1.getText());
        } else {
            HistoriaLaboral.setMesingreso2("");
            HistoriaLaboral.setAnioingreso2("");
            HistoriaLaboral.setMesretiro2("");
            HistoriaLaboral.setAnioretiro2("");
            HistoriaLaboral.setMesesla2(sptiempolaboro1.getText());
        }
        if (HistoriaLaboral.isVnfecha3()) {
            HistoriaLaboral.setMesingreso3(mesI3);
            HistoriaLaboral.setAnioingreso3(anioI3);
            HistoriaLaboral.setMesretiro3(mesI3);
            HistoriaLaboral.setAnioretiro3(anioR3);
            HistoriaLaboral.setMesesla3(sptiempolaboro3.getText());
        } else {
            HistoriaLaboral.setMesingreso3("");
            HistoriaLaboral.setAnioingreso3("");
            HistoriaLaboral.setMesretiro3("");
            HistoriaLaboral.setAnioretiro3("");
            HistoriaLaboral.setMesesla3(sptiempolaboro3.getText());
        }
        if (HistoriaLaboral.isVnfecha4()) {
            HistoriaLaboral.setMesingreso4(mesI4);
            HistoriaLaboral.setAnioingreso4(anioI4);
            HistoriaLaboral.setMesretiro4(mesI4);
            HistoriaLaboral.setAnioretiro4(anioR4);
            HistoriaLaboral.setMesesla4(sptiempolaboro4.getText());
        } else {
            HistoriaLaboral.setMesingreso4("");
            HistoriaLaboral.setAnioingreso4("");
            HistoriaLaboral.setMesretiro4("");
            HistoriaLaboral.setAnioretiro4("");
            HistoriaLaboral.setMesesla4(sptiempolaboro4.getText());
        }
        if (HistoriaLaboral.isVnfecha5()) {
            HistoriaLaboral.setMesingreso5(mesI5);
            HistoriaLaboral.setAnioingreso5(anioI5);
            HistoriaLaboral.setMesretiro5(mesI5);
            HistoriaLaboral.setAnioretiro5(anioR5);
            HistoriaLaboral.setMesesla5(sptiempolaboro5.getText());
        } else {
            HistoriaLaboral.setMesingreso5("");
            HistoriaLaboral.setAnioingreso5("");
            HistoriaLaboral.setMesretiro5("");
            HistoriaLaboral.setAnioretiro5("");
            HistoriaLaboral.setMesesla5(sptiempolaboro5.getText());
        }
        if (HistoriaLaboral.isVnfecha6()) {
            HistoriaLaboral.setMesingreso6(mesI6);
            HistoriaLaboral.setAnioingreso6(anioI6);
            HistoriaLaboral.setMesretiro6(mesI6);
            HistoriaLaboral.setAnioretiro6(anioR6);
            HistoriaLaboral.setMesesla6(sptiempolaboro6.getText());
        } else {
            HistoriaLaboral.setMesingreso6("");
            HistoriaLaboral.setAnioingreso6("");
            HistoriaLaboral.setMesretiro6("");
            HistoriaLaboral.setAnioretiro6("");
            HistoriaLaboral.setMesesla6(sptiempolaboro6.getText());
        }
        if (HistoriaLaboral.isVnfecha7()) {
            HistoriaLaboral.setMesingreso7(mesI7);
            HistoriaLaboral.setAnioingreso7(anioI7);
            HistoriaLaboral.setMesretiro7(mesI7);
            HistoriaLaboral.setAnioretiro7(anioR7);
            HistoriaLaboral.setMesesla7(sptiempolaboro7.getText());
        } else {
            HistoriaLaboral.setMesingreso7("");
            HistoriaLaboral.setAnioingreso7("");
            HistoriaLaboral.setMesretiro7("");
            HistoriaLaboral.setAnioretiro7("");
            HistoriaLaboral.setMesesla7(sptiempolaboro7.getText());
        }
        if (HistoriaLaboral.isVnfecha8()) {
            HistoriaLaboral.setMesingreso8(mesI8);
            HistoriaLaboral.setAnioingreso8(anioI8);
            HistoriaLaboral.setMesretiro8(mesI8);
            HistoriaLaboral.setAnioretiro8(anioR8);
            HistoriaLaboral.setMesesla8(sptiempolaboro8.getText());
        } else {
            HistoriaLaboral.setMesingreso8("");
            HistoriaLaboral.setAnioingreso8("");
            HistoriaLaboral.setMesretiro8("");
            HistoriaLaboral.setAnioretiro8("");
            HistoriaLaboral.setMesesla8(sptiempolaboro8.getText());
        }
        if (HistoriaLaboral.isVnfecha9()) {
            HistoriaLaboral.setMesingreso9(mesI9);
            HistoriaLaboral.setAnioingreso9(anioI9);
            HistoriaLaboral.setMesretiro9(mesI9);
            HistoriaLaboral.setAnioretiro9(anioR9);
            HistoriaLaboral.setMesesla9(sptiempolaboro9.getText());
        } else {
            HistoriaLaboral.setMesingreso9("");
            HistoriaLaboral.setAnioingreso9("");
            HistoriaLaboral.setMesretiro9("");
            HistoriaLaboral.setAnioretiro9("");
            HistoriaLaboral.setMesesla9(sptiempolaboro9.getText());
        }
        if (HistoriaLaboral.isVnfecha10()) {
            HistoriaLaboral.setMesingreso10(mesI10);
            HistoriaLaboral.setAnioingreso10(anioI10);
            HistoriaLaboral.setMesretiro10(mesI10);
            HistoriaLaboral.setAnioretiro10(anioR10);
            HistoriaLaboral.setMesesla10(sptiempolaboro10.getText());
        } else {
            HistoriaLaboral.setMesingreso10("");
            HistoriaLaboral.setAnioingreso10("");
            HistoriaLaboral.setMesretiro10("");
            HistoriaLaboral.setAnioretiro10("");
            HistoriaLaboral.setMesesla10(sptiempolaboro10.getText());
        }
        if (HistoriaLaboral.isVnfecha11()) {
            HistoriaLaboral.setMesingreso11(mesI11);
            HistoriaLaboral.setAnioingreso11(anioI11);
            HistoriaLaboral.setMesretiro11(mesI11);
            HistoriaLaboral.setAnioretiro11(anioR11);
            HistoriaLaboral.setMesesla11(sptiempolaboro11.getText());
        } else {
            HistoriaLaboral.setMesingreso11("");
            HistoriaLaboral.setAnioingreso11("");
            HistoriaLaboral.setMesretiro11("");
            HistoriaLaboral.setAnioretiro11("");
            HistoriaLaboral.setMesesla11(sptiempolaboro11.getText());
        }
        if (HistoriaLaboral.isVnfecha12()) {
            HistoriaLaboral.setMesingreso12(mesI12);
            HistoriaLaboral.setAnioingreso12(anioI12);
            HistoriaLaboral.setMesretiro12(mesI12);
            HistoriaLaboral.setAnioretiro12(anioR12);
            HistoriaLaboral.setMesesla12(sptiempolaboro12.getText());
        } else {
            HistoriaLaboral.setMesingreso12("");
            HistoriaLaboral.setAnioingreso12("");
            HistoriaLaboral.setMesretiro12("");
            HistoriaLaboral.setAnioretiro12("");
            HistoriaLaboral.setMesesla12(sptiempolaboro12.getText());
        }
        if (HistoriaLaboral.isVnfecha13()) {
            HistoriaLaboral.setMesingreso13(mesI13);
            HistoriaLaboral.setAnioingreso13(anioI13);
            HistoriaLaboral.setMesretiro13(mesI13);
            HistoriaLaboral.setAnioretiro13(anioR13);
            HistoriaLaboral.setMesesla13(sptiempolaboro13.getText());
        } else {
            HistoriaLaboral.setMesingreso13("");
            HistoriaLaboral.setAnioingreso13("");
            HistoriaLaboral.setMesretiro13("");
            HistoriaLaboral.setAnioretiro13("");
            HistoriaLaboral.setMesesla13(sptiempolaboro13.getText());
        }
        if (HistoriaLaboral.isVnfecha14()) {
            HistoriaLaboral.setMesingreso14(mesI14);
            HistoriaLaboral.setAnioingreso14(anioI14);
            HistoriaLaboral.setMesretiro14(mesI14);
            HistoriaLaboral.setAnioretiro14(anioR14);
            HistoriaLaboral.setMesesla14(sptiempolaboro14.getText());
        } else {
            HistoriaLaboral.setMesingreso14("");
            HistoriaLaboral.setAnioingreso14("");
            HistoriaLaboral.setMesretiro14("");
            HistoriaLaboral.setAnioretiro14("");
            HistoriaLaboral.setMesesla14(sptiempolaboro14.getText());
        }
        if (HistoriaLaboral.isVnfecha15()) {
            HistoriaLaboral.setMesingreso15(mesI15);
            HistoriaLaboral.setAnioingreso15(anioI15);
            HistoriaLaboral.setMesretiro15(mesI15);
            HistoriaLaboral.setAnioretiro15(anioR15);
            HistoriaLaboral.setMesesla15(sptiempolaboro15.getText());
        } else {
            HistoriaLaboral.setMesingreso15("");
            HistoriaLaboral.setAnioingreso15("");
            HistoriaLaboral.setMesretiro15("");
            HistoriaLaboral.setAnioretiro15("");
            HistoriaLaboral.setMesesla15(sptiempolaboro15.getText());
        }
    }
    


    public void limpiar() {
        jCheckBox30.setSelected(false);
        jCheckBox29.setSelected(false);
        jCheckBox51.setSelected(false);
        jCheckBox54.setSelected(false);
        jCheckBox55.setSelected(false);
        jCheckBox56.setSelected(false);
        jCheckBox57.setSelected(false);
        jCheckBox58.setSelected(false);
        jCheckBox59.setSelected(false);
        jCheckBox60.setSelected(false);
        jCheckBox61.setSelected(false);
        jCheckBox62.setSelected(false);
        jCheckBox63.setSelected(false);
        jCheckBox64.setSelected(false);
        jCheckBox65.setSelected(false);
        jCheckBox66.setSelected(false);
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
        
        jRadioButton17.setSelected(false);
        jRadioButton18.setSelected(false);
        jRadioButton19.setSelected(false);
        jRadioButton20.setSelected(false);
        jRadioButton21.setSelected(false);
        jRadioButton22.setSelected(false);
        jRadioButton23.setSelected(false);
        jRadioButton24.setSelected(false);
        jRadioButton25.setSelected(false);
        jRadioButton26.setSelected(false);

        chbxfalsirobo.setSelected(false);
        chbxfalsifraude.setSelected(false);
        chbxfalsiestafa.setSelected(false);
        chbxfalsisustraccioninf.setSelected(false);
        chbxfalspartactirre.setSelected(false);
        chbxfalspartactirre1.setSelected(false);
        
        txtdiligencielosdatosempresa.setText("");
        txtdiligencielosdatosempresa1.setText("");
        txtdiligencielosdatosempresa3.setText("");
        txtdiligencielosdatosempresa4.setText("");
        txtdiligencielosdatosempresa5.setText("");
        txtdiligencielosdatosempresa6.setText("");
        txtdiligencielosdatosempresa7.setText("");
        txtdiligencielosdatosempresa8.setText("");
        txtdiligencielosdatosempresa9.setText("");
        txtdiligencielosdatosempresa10.setText("");
        txtdiligencielosdatosempresa11.setText("");
        txtdiligencielosdatosempresa12.setText("");
        txtdiligencielosdatosempresa13.setText("");
        txtdiligencielosdatosempresa14.setText("");
        txtdiligencielosdatosempresa15.setText("");
        txtdiligencielosdatoslugar.setText("");
        txtdiligencielosdatoslugar1.setText("");
        txtdiligencielosdatoslugar3.setText("");
        txtdiligencielosdatoslugar4.setText("");
        txtdiligencielosdatoslugar5.setText("");
        txtdiligencielosdatoslugar6.setText("");
        txtdiligencielosdatoslugar7.setText("");
        txtdiligencielosdatoslugar8.setText("");
        txtdiligencielosdatoslugar9.setText("");
        txtdiligencielosdatoslugar10.setText("");
        txtdiligencielosdatoslugar11.setText("");
        txtdiligencielosdatoslugar12.setText("");
        txtdiligencielosdatoslugar13.setText("");
        txtdiligencielosdatoslugar14.setText("");
        txtdiligencielosdatoslugar15.setText("");
        txtdiligencielosdatoscargo.setText("");
        txtdiligencielosdatoscargo1.setText("");
        txtdiligencielosdatoscargo3.setText("");
        txtdiligencielosdatoscargo4.setText("");
        txtdiligencielosdatoscargo5.setText("");
        txtdiligencielosdatoscargo6.setText("");
        txtdiligencielosdatoscargo7.setText("");
        txtdiligencielosdatoscargo8.setText("");
        txtdiligencielosdatoscargo9.setText("");
        txtdiligencielosdatoscargo10.setText("");
        txtdiligencielosdatoscargo11.setText("");
        txtdiligencielosdatoscargo12.setText("");
        txtdiligencielosdatoscargo13.setText("");
        txtdiligencielosdatoscargo14.setText("");
        txtdiligencielosdatoscargo15.setText("");
        txtdiligencielosdatossalario.setText("");
        txtdiligencielosdatossalario1.setText("");
        txtdiligencielosdatossalario3.setText("");
        txtdiligencielosdatossalario4.setText("");
        txtdiligencielosdatossalario5.setText("");
        txtdiligencielosdatossalario6.setText("");
        txtdiligencielosdatossalario7.setText("");
        txtdiligencielosdatossalario8.setText("");
        txtdiligencielosdatossalario9.setText("");
        txtdiligencielosdatossalario10.setText("");
        txtdiligencielosdatossalario11.setText("");
        txtdiligencielosdatossalario12.setText("");
        txtdiligencielosdatossalario13.setText("");
        txtdiligencielosdatossalario14.setText("");
        txtdiligencielosdatossalario15.setText("");
        sptiempolaboro.setText("");
        sptiempolaboro1.setText("");
        sptiempolaboro3.setText("");
        sptiempolaboro4.setText("");
        sptiempolaboro5.setText("");
        sptiempolaboro6.setText("");
        sptiempolaboro7.setText("");
        sptiempolaboro8.setText("");
        sptiempolaboro9.setText("");
        sptiempolaboro10.setText("");
        sptiempolaboro11.setText("");
        sptiempolaboro12.setText("");
        sptiempolaboro13.setText("");
        sptiempolaboro14.setText("");
        sptiempolaboro15.setText("");
        txtdiligencielosdatosmotivo.setText("");
        txtdiligencielosdatosmotivo1.setText("");
        txtdiligencielosdatosmotivo3.setText("");
        txtdiligencielosdatosmotivo4.setText("");
        txtdiligencielosdatosmotivo5.setText("");
        txtdiligencielosdatosmotivo6.setText("");
        txtdiligencielosdatosmotivo7.setText("");
        txtdiligencielosdatosmotivo8.setText("");
        txtdiligencielosdatosmotivo9.setText("");
        txtdiligencielosdatosmotivo10.setText("");
        txtdiligencielosdatosmotivo11.setText("");
        txtdiligencielosdatosmotivo12.setText("");
        txtdiligencielosdatosmotivo13.setText("");
        txtdiligencielosdatosmotivo14.setText("");
        txtdiligencielosdatosmotivo15.setText("");
        
        jTextArea5.setText("");
        
        txtresphistolaantes.setText("");
        txtresphistola1.setText("");
        txtresphistola2.setText("");
        txtresphistola3.setText("");
        txtresphistola4.setText("");
        txtresphistola5.setText("");
        txtresphistola6.setText("");
        txtresphistola7.setText("");
        txtresphistola8.setText("");
        txtresphistola9.setText("");
        
        jScrollPane12.getVerticalScrollBar().setValue(0);
        jScrollPane4.getVerticalScrollBar().setValue(0);
    }

    Thinking_uh iconThinking_uh = new Thinking_uh();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane4 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jCheckBox29 = new javax.swing.JCheckBox();
        jCheckBox30 = new javax.swing.JCheckBox();
        jLabel186 = new javax.swing.JLabel();
        diligencielosdatosinacti = new javax.swing.JLabel();
        jRadioButton17 = new javax.swing.JRadioButton();
        jScrollPane12 = new javax.swing.JScrollPane();
        jTextArea5 = new javax.swing.JTextArea();
        cometioalgunoantes = new javax.swing.JLabel();
        jCheckBox31 = new javax.swing.JCheckBox();
        jCheckBox32 = new javax.swing.JCheckBox();
        jRadioButton18 = new javax.swing.JRadioButton();
        chbxfalsirobo = new javax.swing.JCheckBox();
        chbxfalsisustraccioninf = new javax.swing.JCheckBox();
        chbxfalsifraude = new javax.swing.JCheckBox();
        chbxfalspartactirre = new javax.swing.JCheckBox();
        chbxfalsiestafa = new javax.swing.JCheckBox();
        chbxfalspartactirre1 = new javax.swing.JCheckBox();
        txtresphistolaantes = new javax.swing.JTextField();
        jLabel104 = new javax.swing.JLabel();
        historlabopre1 = new javax.swing.JLabel();
        jRadioButton19 = new javax.swing.JRadioButton();
        jCheckBox34 = new javax.swing.JCheckBox();
        jCheckBox33 = new javax.swing.JCheckBox();
        jLabel105 = new javax.swing.JLabel();
        txtresphistola1 = new javax.swing.JTextField();
        historlabopre2 = new javax.swing.JLabel();
        jRadioButton20 = new javax.swing.JRadioButton();
        jCheckBox36 = new javax.swing.JCheckBox();
        jCheckBox35 = new javax.swing.JCheckBox();
        jLabel106 = new javax.swing.JLabel();
        txtresphistola2 = new javax.swing.JTextField();
        historlabopre3 = new javax.swing.JLabel();
        jRadioButton21 = new javax.swing.JRadioButton();
        jCheckBox38 = new javax.swing.JCheckBox();
        jCheckBox37 = new javax.swing.JCheckBox();
        jLabel107 = new javax.swing.JLabel();
        txtresphistola3 = new javax.swing.JTextField();
        jRadioButton22 = new javax.swing.JRadioButton();
        jCheckBox40 = new javax.swing.JCheckBox();
        jCheckBox39 = new javax.swing.JCheckBox();
        historlabopre4 = new javax.swing.JLabel();
        jLabel114 = new javax.swing.JLabel();
        txtresphistola4 = new javax.swing.JTextField();
        jRadioButton24 = new javax.swing.JRadioButton();
        jCheckBox44 = new javax.swing.JCheckBox();
        jCheckBox43 = new javax.swing.JCheckBox();
        historlabopre6 = new javax.swing.JLabel();
        jLabel112 = new javax.swing.JLabel();
        txtresphistola6 = new javax.swing.JTextField();
        historlabopre7 = new javax.swing.JLabel();
        jRadioButton25 = new javax.swing.JRadioButton();
        jCheckBox46 = new javax.swing.JCheckBox();
        jCheckBox45 = new javax.swing.JCheckBox();
        jLabel111 = new javax.swing.JLabel();
        txtresphistola7 = new javax.swing.JTextField();
        jRadioButton26 = new javax.swing.JRadioButton();
        jCheckBox48 = new javax.swing.JCheckBox();
        jCheckBox47 = new javax.swing.JCheckBox();
        historlabopre8_1 = new javax.swing.JLabel();
        jLabel110 = new javax.swing.JLabel();
        txtresphistola8 = new javax.swing.JTextField();
        historlabopre5 = new javax.swing.JLabel();
        jRadioButton23 = new javax.swing.JRadioButton();
        jCheckBox42 = new javax.swing.JCheckBox();
        jCheckBox41 = new javax.swing.JCheckBox();
        jCheckBox50 = new javax.swing.JCheckBox();
        jCheckBox49 = new javax.swing.JCheckBox();
        historlabopre9 = new javax.swing.JLabel();
        jLabel109 = new javax.swing.JLabel();
        txtresphistola9 = new javax.swing.JTextField();
        jLabel113 = new javax.swing.JLabel();
        txtresphistola5 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        diligencielosdatosempresa = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        diligencielosdatoslugar = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        diligencielosdatossalario = new javax.swing.JLabel();
        diligencielosdatoscargo = new javax.swing.JLabel();
        txtdiligencielosdatoscargo = new javax.swing.JTextField();
        txtdiligencielosdatosempresa = new javax.swing.JTextField();
        txtdiligencielosdatoslugar = new javax.swing.JTextField();
        txtdiligencielosdatossalario = new javax.swing.JTextField();
        diligencielosdatosferetiro1 = new javax.swing.JLabel();
        fechaingresoemp = new com.toedter.calendar.JMonthChooser();
        fechaingresoemp_a = new com.toedter.calendar.JYearChooser();
        diligencielosdatostiempo = new javax.swing.JLabel();
        sptiempolaboro = new javax.swing.JTextField();
        diligencielosdatostiempom = new javax.swing.JLabel();
        diligencielosdatosferetiro = new javax.swing.JLabel();
        diligencielosdatosmotivo = new javax.swing.JLabel();
        fecharetiroemp = new com.toedter.calendar.JMonthChooser();
        fecharetiroemp_a = new com.toedter.calendar.JYearChooser();
        jLabel29 = new javax.swing.JLabel();
        txtdiligencielosdatosmotivo = new javax.swing.JTextField();
        jCheckBox51 = new javax.swing.JCheckBox();
        jLabel13 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        diligencielosdatosempresa1 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        diligencielosdatoslugar1 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        diligencielosdatossalario1 = new javax.swing.JLabel();
        diligencielosdatoscargo1 = new javax.swing.JLabel();
        txtdiligencielosdatoscargo1 = new javax.swing.JTextField();
        txtdiligencielosdatosempresa1 = new javax.swing.JTextField();
        txtdiligencielosdatoslugar1 = new javax.swing.JTextField();
        txtdiligencielosdatossalario1 = new javax.swing.JTextField();
        diligencielosdatosferetiro2 = new javax.swing.JLabel();
        fechaingresoemp1 = new com.toedter.calendar.JMonthChooser();
        fechaingresoemp_a1 = new com.toedter.calendar.JYearChooser();
        diligencielosdatostiempo1 = new javax.swing.JLabel();
        sptiempolaboro1 = new javax.swing.JTextField();
        diligencielosdatostiempom1 = new javax.swing.JLabel();
        diligencielosdatosferetiro3 = new javax.swing.JLabel();
        diligencielosdatosmotivo1 = new javax.swing.JLabel();
        fecharetiroemp1 = new com.toedter.calendar.JMonthChooser();
        fecharetiroemp_a1 = new com.toedter.calendar.JYearChooser();
        jLabel38 = new javax.swing.JLabel();
        txtdiligencielosdatosmotivo1 = new javax.swing.JTextField();
        jCheckBox52 = new javax.swing.JCheckBox();
        jLabel14 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        diligencielosdatosempresa3 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        diligencielosdatoslugar3 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        diligencielosdatossalario3 = new javax.swing.JLabel();
        diligencielosdatoscargo3 = new javax.swing.JLabel();
        txtdiligencielosdatoscargo3 = new javax.swing.JTextField();
        txtdiligencielosdatosempresa3 = new javax.swing.JTextField();
        txtdiligencielosdatoslugar3 = new javax.swing.JTextField();
        txtdiligencielosdatossalario3 = new javax.swing.JTextField();
        diligencielosdatosferetiro6 = new javax.swing.JLabel();
        fechaingresoemp3 = new com.toedter.calendar.JMonthChooser();
        fechaingresoemp_a3 = new com.toedter.calendar.JYearChooser();
        diligencielosdatostiempo3 = new javax.swing.JLabel();
        sptiempolaboro3 = new javax.swing.JTextField();
        diligencielosdatostiempom3 = new javax.swing.JLabel();
        diligencielosdatosferetiro7 = new javax.swing.JLabel();
        diligencielosdatosmotivo3 = new javax.swing.JLabel();
        fecharetiroemp3 = new com.toedter.calendar.JMonthChooser();
        fecharetiroemp_a3 = new com.toedter.calendar.JYearChooser();
        jLabel49 = new javax.swing.JLabel();
        txtdiligencielosdatosmotivo3 = new javax.swing.JTextField();
        jCheckBox54 = new javax.swing.JCheckBox();
        jLabel16 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        diligencielosdatosempresa4 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        diligencielosdatoslugar4 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        diligencielosdatossalario4 = new javax.swing.JLabel();
        diligencielosdatoscargo4 = new javax.swing.JLabel();
        txtdiligencielosdatoscargo4 = new javax.swing.JTextField();
        txtdiligencielosdatosempresa4 = new javax.swing.JTextField();
        txtdiligencielosdatoslugar4 = new javax.swing.JTextField();
        txtdiligencielosdatossalario4 = new javax.swing.JTextField();
        diligencielosdatosferetiro8 = new javax.swing.JLabel();
        fechaingresoemp4 = new com.toedter.calendar.JMonthChooser();
        fechaingresoemp_a4 = new com.toedter.calendar.JYearChooser();
        diligencielosdatostiempo4 = new javax.swing.JLabel();
        sptiempolaboro4 = new javax.swing.JTextField();
        diligencielosdatostiempom4 = new javax.swing.JLabel();
        diligencielosdatosferetiro9 = new javax.swing.JLabel();
        diligencielosdatosmotivo4 = new javax.swing.JLabel();
        fecharetiroemp_a4 = new com.toedter.calendar.JYearChooser();
        fecharetiroemp4 = new com.toedter.calendar.JMonthChooser();
        jLabel55 = new javax.swing.JLabel();
        txtdiligencielosdatosmotivo4 = new javax.swing.JTextField();
        jCheckBox55 = new javax.swing.JCheckBox();
        jLabel17 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        diligencielosdatosempresa5 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        diligencielosdatoslugar5 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        diligencielosdatossalario5 = new javax.swing.JLabel();
        diligencielosdatoscargo5 = new javax.swing.JLabel();
        txtdiligencielosdatoscargo5 = new javax.swing.JTextField();
        txtdiligencielosdatosempresa5 = new javax.swing.JTextField();
        txtdiligencielosdatoslugar5 = new javax.swing.JTextField();
        txtdiligencielosdatossalario5 = new javax.swing.JTextField();
        diligencielosdatosferetiro10 = new javax.swing.JLabel();
        fechaingresoemp5 = new com.toedter.calendar.JMonthChooser();
        fechaingresoemp_a5 = new com.toedter.calendar.JYearChooser();
        diligencielosdatostiempo5 = new javax.swing.JLabel();
        sptiempolaboro5 = new javax.swing.JTextField();
        diligencielosdatostiempom5 = new javax.swing.JLabel();
        diligencielosdatosferetiro11 = new javax.swing.JLabel();
        diligencielosdatosmotivo5 = new javax.swing.JLabel();
        fecharetiroemp5 = new com.toedter.calendar.JMonthChooser();
        fecharetiroemp_a5 = new com.toedter.calendar.JYearChooser();
        jLabel61 = new javax.swing.JLabel();
        txtdiligencielosdatosmotivo5 = new javax.swing.JTextField();
        jCheckBox56 = new javax.swing.JCheckBox();
        jLabel18 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        diligencielosdatosempresa6 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        diligencielosdatoslugar6 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        diligencielosdatossalario6 = new javax.swing.JLabel();
        diligencielosdatoscargo6 = new javax.swing.JLabel();
        txtdiligencielosdatoscargo6 = new javax.swing.JTextField();
        txtdiligencielosdatosempresa6 = new javax.swing.JTextField();
        txtdiligencielosdatoslugar6 = new javax.swing.JTextField();
        txtdiligencielosdatossalario6 = new javax.swing.JTextField();
        diligencielosdatosferetiro12 = new javax.swing.JLabel();
        fechaingresoemp6 = new com.toedter.calendar.JMonthChooser();
        fechaingresoemp_a6 = new com.toedter.calendar.JYearChooser();
        diligencielosdatostiempo6 = new javax.swing.JLabel();
        sptiempolaboro6 = new javax.swing.JTextField();
        diligencielosdatostiempom6 = new javax.swing.JLabel();
        diligencielosdatosferetiro13 = new javax.swing.JLabel();
        diligencielosdatosmotivo6 = new javax.swing.JLabel();
        fecharetiroemp6 = new com.toedter.calendar.JMonthChooser();
        fecharetiroemp_a6 = new com.toedter.calendar.JYearChooser();
        jLabel67 = new javax.swing.JLabel();
        txtdiligencielosdatosmotivo6 = new javax.swing.JTextField();
        jCheckBox57 = new javax.swing.JCheckBox();
        jLabel19 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        diligencielosdatosempresa7 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        diligencielosdatoslugar7 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        diligencielosdatossalario7 = new javax.swing.JLabel();
        diligencielosdatoscargo7 = new javax.swing.JLabel();
        txtdiligencielosdatoscargo7 = new javax.swing.JTextField();
        txtdiligencielosdatosempresa7 = new javax.swing.JTextField();
        txtdiligencielosdatoslugar7 = new javax.swing.JTextField();
        txtdiligencielosdatossalario7 = new javax.swing.JTextField();
        diligencielosdatosferetiro14 = new javax.swing.JLabel();
        fechaingresoemp7 = new com.toedter.calendar.JMonthChooser();
        fechaingresoemp_a7 = new com.toedter.calendar.JYearChooser();
        diligencielosdatostiempo7 = new javax.swing.JLabel();
        sptiempolaboro7 = new javax.swing.JTextField();
        diligencielosdatostiempom7 = new javax.swing.JLabel();
        diligencielosdatosferetiro15 = new javax.swing.JLabel();
        diligencielosdatosmotivo7 = new javax.swing.JLabel();
        fecharetiroemp7 = new com.toedter.calendar.JMonthChooser();
        fecharetiroemp_a7 = new com.toedter.calendar.JYearChooser();
        jLabel73 = new javax.swing.JLabel();
        txtdiligencielosdatosmotivo7 = new javax.swing.JTextField();
        jCheckBox58 = new javax.swing.JCheckBox();
        jLabel20 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        diligencielosdatosempresa8 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        diligencielosdatoslugar8 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        diligencielosdatossalario8 = new javax.swing.JLabel();
        diligencielosdatoscargo8 = new javax.swing.JLabel();
        txtdiligencielosdatoscargo8 = new javax.swing.JTextField();
        txtdiligencielosdatosempresa8 = new javax.swing.JTextField();
        txtdiligencielosdatoslugar8 = new javax.swing.JTextField();
        txtdiligencielosdatossalario8 = new javax.swing.JTextField();
        diligencielosdatosferetiro16 = new javax.swing.JLabel();
        fechaingresoemp8 = new com.toedter.calendar.JMonthChooser();
        fechaingresoemp_a8 = new com.toedter.calendar.JYearChooser();
        diligencielosdatostiempo8 = new javax.swing.JLabel();
        sptiempolaboro8 = new javax.swing.JTextField();
        diligencielosdatostiempom8 = new javax.swing.JLabel();
        diligencielosdatosferetiro17 = new javax.swing.JLabel();
        diligencielosdatosmotivo8 = new javax.swing.JLabel();
        fecharetiroemp8 = new com.toedter.calendar.JMonthChooser();
        fecharetiroemp_a8 = new com.toedter.calendar.JYearChooser();
        jLabel79 = new javax.swing.JLabel();
        txtdiligencielosdatosmotivo8 = new javax.swing.JTextField();
        jCheckBox59 = new javax.swing.JCheckBox();
        jLabel21 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        diligencielosdatosempresa9 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        diligencielosdatoslugar9 = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        diligencielosdatossalario9 = new javax.swing.JLabel();
        diligencielosdatoscargo9 = new javax.swing.JLabel();
        txtdiligencielosdatoscargo9 = new javax.swing.JTextField();
        txtdiligencielosdatosempresa9 = new javax.swing.JTextField();
        txtdiligencielosdatoslugar9 = new javax.swing.JTextField();
        txtdiligencielosdatossalario9 = new javax.swing.JTextField();
        diligencielosdatosferetiro18 = new javax.swing.JLabel();
        fechaingresoemp9 = new com.toedter.calendar.JMonthChooser();
        fechaingresoemp_a9 = new com.toedter.calendar.JYearChooser();
        diligencielosdatostiempo9 = new javax.swing.JLabel();
        sptiempolaboro9 = new javax.swing.JTextField();
        diligencielosdatostiempom9 = new javax.swing.JLabel();
        diligencielosdatosferetiro19 = new javax.swing.JLabel();
        diligencielosdatosmotivo9 = new javax.swing.JLabel();
        fecharetiroemp9 = new com.toedter.calendar.JMonthChooser();
        fecharetiroemp_a9 = new com.toedter.calendar.JYearChooser();
        jLabel85 = new javax.swing.JLabel();
        txtdiligencielosdatosmotivo9 = new javax.swing.JTextField();
        jCheckBox60 = new javax.swing.JCheckBox();
        jLabel22 = new javax.swing.JLabel();
        jLabel86 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        diligencielosdatosempresa10 = new javax.swing.JLabel();
        jLabel87 = new javax.swing.JLabel();
        diligencielosdatoslugar10 = new javax.swing.JLabel();
        jLabel88 = new javax.swing.JLabel();
        jLabel89 = new javax.swing.JLabel();
        jLabel90 = new javax.swing.JLabel();
        diligencielosdatossalario10 = new javax.swing.JLabel();
        diligencielosdatoscargo10 = new javax.swing.JLabel();
        txtdiligencielosdatoscargo10 = new javax.swing.JTextField();
        txtdiligencielosdatosempresa10 = new javax.swing.JTextField();
        txtdiligencielosdatoslugar10 = new javax.swing.JTextField();
        txtdiligencielosdatossalario10 = new javax.swing.JTextField();
        diligencielosdatosferetiro20 = new javax.swing.JLabel();
        fechaingresoemp10 = new com.toedter.calendar.JMonthChooser();
        fechaingresoemp_a10 = new com.toedter.calendar.JYearChooser();
        diligencielosdatostiempo10 = new javax.swing.JLabel();
        sptiempolaboro10 = new javax.swing.JTextField();
        diligencielosdatostiempom10 = new javax.swing.JLabel();
        diligencielosdatosferetiro21 = new javax.swing.JLabel();
        diligencielosdatosmotivo10 = new javax.swing.JLabel();
        fecharetiroemp10 = new com.toedter.calendar.JMonthChooser();
        fecharetiroemp_a10 = new com.toedter.calendar.JYearChooser();
        jLabel91 = new javax.swing.JLabel();
        txtdiligencielosdatosmotivo10 = new javax.swing.JTextField();
        jCheckBox61 = new javax.swing.JCheckBox();
        jLabel23 = new javax.swing.JLabel();
        jLabel92 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        diligencielosdatosempresa11 = new javax.swing.JLabel();
        jLabel93 = new javax.swing.JLabel();
        diligencielosdatoslugar11 = new javax.swing.JLabel();
        jLabel94 = new javax.swing.JLabel();
        jLabel95 = new javax.swing.JLabel();
        jLabel96 = new javax.swing.JLabel();
        diligencielosdatossalario11 = new javax.swing.JLabel();
        diligencielosdatoscargo11 = new javax.swing.JLabel();
        txtdiligencielosdatoscargo11 = new javax.swing.JTextField();
        txtdiligencielosdatosempresa11 = new javax.swing.JTextField();
        txtdiligencielosdatoslugar11 = new javax.swing.JTextField();
        txtdiligencielosdatossalario11 = new javax.swing.JTextField();
        diligencielosdatosferetiro22 = new javax.swing.JLabel();
        fechaingresoemp11 = new com.toedter.calendar.JMonthChooser();
        fechaingresoemp_a11 = new com.toedter.calendar.JYearChooser();
        diligencielosdatostiempo11 = new javax.swing.JLabel();
        sptiempolaboro11 = new javax.swing.JTextField();
        diligencielosdatostiempom11 = new javax.swing.JLabel();
        diligencielosdatosferetiro23 = new javax.swing.JLabel();
        diligencielosdatosmotivo11 = new javax.swing.JLabel();
        fecharetiroemp11 = new com.toedter.calendar.JMonthChooser();
        fecharetiroemp_a11 = new com.toedter.calendar.JYearChooser();
        jLabel97 = new javax.swing.JLabel();
        txtdiligencielosdatosmotivo11 = new javax.swing.JTextField();
        jCheckBox62 = new javax.swing.JCheckBox();
        jLabel24 = new javax.swing.JLabel();
        jLabel98 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        diligencielosdatosempresa12 = new javax.swing.JLabel();
        jLabel99 = new javax.swing.JLabel();
        diligencielosdatoslugar12 = new javax.swing.JLabel();
        jLabel100 = new javax.swing.JLabel();
        jLabel101 = new javax.swing.JLabel();
        jLabel102 = new javax.swing.JLabel();
        diligencielosdatossalario12 = new javax.swing.JLabel();
        diligencielosdatoscargo12 = new javax.swing.JLabel();
        txtdiligencielosdatoscargo12 = new javax.swing.JTextField();
        txtdiligencielosdatosempresa12 = new javax.swing.JTextField();
        txtdiligencielosdatoslugar12 = new javax.swing.JTextField();
        txtdiligencielosdatossalario12 = new javax.swing.JTextField();
        diligencielosdatosferetiro24 = new javax.swing.JLabel();
        fechaingresoemp12 = new com.toedter.calendar.JMonthChooser();
        fechaingresoemp_a12 = new com.toedter.calendar.JYearChooser();
        diligencielosdatostiempo12 = new javax.swing.JLabel();
        sptiempolaboro12 = new javax.swing.JTextField();
        diligencielosdatostiempom12 = new javax.swing.JLabel();
        diligencielosdatosferetiro25 = new javax.swing.JLabel();
        diligencielosdatosmotivo12 = new javax.swing.JLabel();
        fecharetiroemp12 = new com.toedter.calendar.JMonthChooser();
        fecharetiroemp_a12 = new com.toedter.calendar.JYearChooser();
        jLabel103 = new javax.swing.JLabel();
        txtdiligencielosdatosmotivo12 = new javax.swing.JTextField();
        jCheckBox63 = new javax.swing.JCheckBox();
        jLabel25 = new javax.swing.JLabel();
        jLabel108 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        diligencielosdatosempresa13 = new javax.swing.JLabel();
        jLabel115 = new javax.swing.JLabel();
        diligencielosdatoslugar13 = new javax.swing.JLabel();
        jLabel116 = new javax.swing.JLabel();
        jLabel117 = new javax.swing.JLabel();
        jLabel118 = new javax.swing.JLabel();
        diligencielosdatossalario13 = new javax.swing.JLabel();
        diligencielosdatoscargo13 = new javax.swing.JLabel();
        txtdiligencielosdatoscargo13 = new javax.swing.JTextField();
        txtdiligencielosdatosempresa13 = new javax.swing.JTextField();
        txtdiligencielosdatoslugar13 = new javax.swing.JTextField();
        txtdiligencielosdatossalario13 = new javax.swing.JTextField();
        diligencielosdatosferetiro26 = new javax.swing.JLabel();
        fechaingresoemp13 = new com.toedter.calendar.JMonthChooser();
        fechaingresoemp_a13 = new com.toedter.calendar.JYearChooser();
        diligencielosdatostiempo13 = new javax.swing.JLabel();
        sptiempolaboro13 = new javax.swing.JTextField();
        diligencielosdatostiempom13 = new javax.swing.JLabel();
        diligencielosdatosferetiro27 = new javax.swing.JLabel();
        diligencielosdatosmotivo13 = new javax.swing.JLabel();
        fecharetiroemp13 = new com.toedter.calendar.JMonthChooser();
        fecharetiroemp_a13 = new com.toedter.calendar.JYearChooser();
        jLabel119 = new javax.swing.JLabel();
        txtdiligencielosdatosmotivo13 = new javax.swing.JTextField();
        jCheckBox64 = new javax.swing.JCheckBox();
        jLabel26 = new javax.swing.JLabel();
        jLabel120 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        diligencielosdatosempresa14 = new javax.swing.JLabel();
        jLabel121 = new javax.swing.JLabel();
        diligencielosdatoslugar14 = new javax.swing.JLabel();
        jLabel122 = new javax.swing.JLabel();
        jLabel123 = new javax.swing.JLabel();
        jLabel124 = new javax.swing.JLabel();
        diligencielosdatossalario14 = new javax.swing.JLabel();
        diligencielosdatoscargo14 = new javax.swing.JLabel();
        txtdiligencielosdatoscargo14 = new javax.swing.JTextField();
        txtdiligencielosdatosempresa14 = new javax.swing.JTextField();
        txtdiligencielosdatoslugar14 = new javax.swing.JTextField();
        txtdiligencielosdatossalario14 = new javax.swing.JTextField();
        diligencielosdatosferetiro28 = new javax.swing.JLabel();
        fechaingresoemp14 = new com.toedter.calendar.JMonthChooser();
        fechaingresoemp_a14 = new com.toedter.calendar.JYearChooser();
        diligencielosdatostiempo14 = new javax.swing.JLabel();
        sptiempolaboro14 = new javax.swing.JTextField();
        diligencielosdatostiempom14 = new javax.swing.JLabel();
        diligencielosdatosferetiro29 = new javax.swing.JLabel();
        diligencielosdatosmotivo14 = new javax.swing.JLabel();
        fecharetiroemp14 = new com.toedter.calendar.JMonthChooser();
        fecharetiroemp_a14 = new com.toedter.calendar.JYearChooser();
        jLabel125 = new javax.swing.JLabel();
        txtdiligencielosdatosmotivo14 = new javax.swing.JTextField();
        jCheckBox65 = new javax.swing.JCheckBox();
        jLabel126 = new javax.swing.JLabel();
        jLabel127 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        diligencielosdatosempresa15 = new javax.swing.JLabel();
        jLabel128 = new javax.swing.JLabel();
        diligencielosdatoslugar15 = new javax.swing.JLabel();
        jLabel129 = new javax.swing.JLabel();
        jLabel130 = new javax.swing.JLabel();
        jLabel131 = new javax.swing.JLabel();
        diligencielosdatossalario15 = new javax.swing.JLabel();
        diligencielosdatoscargo15 = new javax.swing.JLabel();
        txtdiligencielosdatoscargo15 = new javax.swing.JTextField();
        txtdiligencielosdatosempresa15 = new javax.swing.JTextField();
        txtdiligencielosdatoslugar15 = new javax.swing.JTextField();
        txtdiligencielosdatossalario15 = new javax.swing.JTextField();
        diligencielosdatosferetiro30 = new javax.swing.JLabel();
        fechaingresoemp15 = new com.toedter.calendar.JMonthChooser();
        fechaingresoemp_a15 = new com.toedter.calendar.JYearChooser();
        diligencielosdatostiempo15 = new javax.swing.JLabel();
        sptiempolaboro15 = new javax.swing.JTextField();
        diligencielosdatostiempom15 = new javax.swing.JLabel();
        diligencielosdatosferetiro31 = new javax.swing.JLabel();
        diligencielosdatosmotivo15 = new javax.swing.JLabel();
        fecharetiroemp15 = new com.toedter.calendar.JMonthChooser();
        fecharetiroemp_a15 = new com.toedter.calendar.JYearChooser();
        jLabel132 = new javax.swing.JLabel();
        txtdiligencielosdatosmotivo15 = new javax.swing.JTextField();
        jCheckBox66 = new javax.swing.JCheckBox();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(null);
        setMaximumSize(new java.awt.Dimension(975, 550));
        setPreferredSize(new java.awt.Dimension(975, 550));

        jScrollPane4.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane4.setBorder(null);
        jScrollPane4.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane4.setPreferredSize(new java.awt.Dimension(975, 234567890));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

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

        jLabel186.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel186.setText(" ¿Ha tenido un empleo anteriormente?");

        diligencielosdatosinacti.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        diligencielosdatosinacti.setText("Periodos de inactividad laboral");

        jRadioButton17.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton17.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jRadioButton17.setText("A");
        jRadioButton17.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButton17ItemStateChanged(evt);
            }
        });

        jTextArea5.setColumns(20);
        jTextArea5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextArea5.setLineWrap(true);
        jTextArea5.setRows(5);
        jTextArea5.setWrapStyleWord(true);
        jTextArea5.setBorder(null);
        jTextArea5.setPreferredSize(new java.awt.Dimension(730, 100));
        jTextArea5.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextArea5CaretUpdate(evt);
            }
        });
        jTextArea5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextArea5KeyTyped(evt);
            }
        });
        jScrollPane12.setViewportView(jTextArea5);

        cometioalgunoantes.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        cometioalgunoantes.setText("¿Cometió usted alguno de los siguientes actos irregulares en la(s) empresa(s) donde ha laborado?");

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

        jRadioButton18.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton18.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jRadioButton18.setText("A");
        jRadioButton18.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButton18ItemStateChanged(evt);
            }
        });

        chbxfalsirobo.setBackground(new java.awt.Color(255, 255, 255));
        chbxfalsirobo.setFont(new java.awt.Font("Segoe UI Emoji", 0, 13)); // NOI18N
        chbxfalsirobo.setText("Robo");
        chbxfalsirobo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chbxfalsiroboItemStateChanged(evt);
            }
        });

        chbxfalsisustraccioninf.setBackground(new java.awt.Color(255, 255, 255));
        chbxfalsisustraccioninf.setFont(new java.awt.Font("Segoe UI Emoji", 0, 13)); // NOI18N
        chbxfalsisustraccioninf.setText("Sustracción de información confidencial");
        chbxfalsisustraccioninf.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chbxfalsisustraccioninfItemStateChanged(evt);
            }
        });

        chbxfalsifraude.setBackground(new java.awt.Color(255, 255, 255));
        chbxfalsifraude.setFont(new java.awt.Font("Segoe UI Emoji", 0, 13)); // NOI18N
        chbxfalsifraude.setText("Fraude");
        chbxfalsifraude.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chbxfalsifraudeItemStateChanged(evt);
            }
        });

        chbxfalspartactirre.setBackground(new java.awt.Color(255, 255, 255));
        chbxfalspartactirre.setFont(new java.awt.Font("Segoe UI Emoji", 0, 13)); // NOI18N
        chbxfalspartactirre.setText("Participación en actividades irregulares");
        chbxfalspartactirre.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chbxfalspartactirreItemStateChanged(evt);
            }
        });

        chbxfalsiestafa.setBackground(new java.awt.Color(255, 255, 255));
        chbxfalsiestafa.setFont(new java.awt.Font("Segoe UI Emoji", 0, 13)); // NOI18N
        chbxfalsiestafa.setText("Estafa");
        chbxfalsiestafa.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chbxfalsiestafaItemStateChanged(evt);
            }
        });

        chbxfalspartactirre1.setBackground(new java.awt.Color(255, 255, 255));
        chbxfalspartactirre1.setFont(new java.awt.Font("Segoe UI Emoji", 0, 13)); // NOI18N
        chbxfalspartactirre1.setText("Divulgación de información confidencial");
        chbxfalspartactirre1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chbxfalspartactirre1ItemStateChanged(evt);
            }
        });

        txtresphistolaantes.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtresphistolaantes.setBorder(null);
        txtresphistolaantes.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtresphistolaantesCaretUpdate(evt);
            }
        });
        txtresphistolaantes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtresphistolaantesKeyTyped(evt);
            }
        });

        jLabel104.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        historlabopre1.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        historlabopre1.setText("¿Ha recibido usted algún memorando, sanción, multa o suspensión en alguno de sus empleos?");

        jRadioButton19.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton19.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jRadioButton19.setText("A");
        jRadioButton19.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButton19ItemStateChanged(evt);
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

        jCheckBox33.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox33.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jCheckBox33.setText("Sí");
        jCheckBox33.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox33ItemStateChanged(evt);
            }
        });

        jLabel105.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtresphistola1.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtresphistola1.setBorder(null);
        txtresphistola1.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtresphistola1CaretUpdate(evt);
            }
        });
        txtresphistola1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtresphistola1ActionPerformed(evt);
            }
        });
        txtresphistola1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtresphistola1KeyTyped(evt);
            }
        });

        historlabopre2.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        historlabopre2.setText("¿Fue llamado usted a descargos en alguno de sus empleos?");

        jRadioButton20.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton20.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jRadioButton20.setText("A");
        jRadioButton20.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButton20ItemStateChanged(evt);
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

        jCheckBox35.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox35.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jCheckBox35.setText("Sí");
        jCheckBox35.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox35ItemStateChanged(evt);
            }
        });

        jLabel106.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtresphistola2.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtresphistola2.setBorder(null);
        txtresphistola2.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtresphistola2CaretUpdate(evt);
            }
        });
        txtresphistola2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtresphistola2ActionPerformed(evt);
            }
        });
        txtresphistola2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtresphistola2KeyTyped(evt);
            }
        });

        historlabopre3.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        historlabopre3.setText("¿Fue despedido usted por deshonestidad de alguno de los empleos?");

        jRadioButton21.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton21.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jRadioButton21.setText("A");
        jRadioButton21.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButton21ItemStateChanged(evt);
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

        jCheckBox37.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox37.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jCheckBox37.setText("Sí");
        jCheckBox37.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox37ItemStateChanged(evt);
            }
        });

        jLabel107.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtresphistola3.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtresphistola3.setBorder(null);
        txtresphistola3.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtresphistola3CaretUpdate(evt);
            }
        });
        txtresphistola3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtresphistola3ActionPerformed(evt);
            }
        });
        txtresphistola3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtresphistola3KeyTyped(evt);
            }
        });

        jRadioButton22.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton22.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jRadioButton22.setText("A");
        jRadioButton22.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButton22ItemStateChanged(evt);
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

        jCheckBox39.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox39.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jCheckBox39.setText("Sí");
        jCheckBox39.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox39ItemStateChanged(evt);
            }
        });

        historlabopre4.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        historlabopre4.setText("¿Ha ayudado usted a cometer algún fraude en alguna las empresas para las que ha laborado?");

        jLabel114.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtresphistola4.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtresphistola4.setBorder(null);
        txtresphistola4.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtresphistola4CaretUpdate(evt);
            }
        });
        txtresphistola4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtresphistola4KeyTyped(evt);
            }
        });

        jRadioButton24.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton24.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jRadioButton24.setText("A");
        jRadioButton24.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButton24ItemStateChanged(evt);
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

        jCheckBox43.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox43.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jCheckBox43.setText("Sí");
        jCheckBox43.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox43ItemStateChanged(evt);
            }
        });

        historlabopre6.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        historlabopre6.setText("¿Ha usted realizado o pensado realizar algún tipo de negocio irregular que afecte alguna de las empresas en que laboró?");

        jLabel112.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtresphistola6.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtresphistola6.setBorder(null);
        txtresphistola6.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtresphistola6CaretUpdate(evt);
            }
        });
        txtresphistola6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtresphistola6KeyTyped(evt);
            }
        });

        historlabopre7.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        historlabopre7.setText("¿Se ha lucrado usted de algún negocio fraudulento en nombre de alguna de las empresas para las que ha laborado?");

        jRadioButton25.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton25.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jRadioButton25.setText("A");
        jRadioButton25.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButton25ItemStateChanged(evt);
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

        jCheckBox45.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox45.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jCheckBox45.setText("Sí");
        jCheckBox45.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox45ItemStateChanged(evt);
            }
        });

        jLabel111.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtresphistola7.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtresphistola7.setBorder(null);
        txtresphistola7.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtresphistola7CaretUpdate(evt);
            }
        });
        txtresphistola7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtresphistola7ActionPerformed(evt);
            }
        });
        txtresphistola7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtresphistola7KeyTyped(evt);
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

        jCheckBox48.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox48.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jCheckBox48.setText("No");
        jCheckBox48.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox48ItemStateChanged(evt);
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

        historlabopre8_1.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        historlabopre8_1.setText("¿Tiene usted conocimiento de actividades ilícitas realizadas en contra de las empresas para las que ha laborado?");

        jLabel110.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtresphistola8.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtresphistola8.setBorder(null);
        txtresphistola8.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtresphistola8CaretUpdate(evt);
            }
        });
        txtresphistola8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtresphistola8KeyTyped(evt);
            }
        });

        historlabopre5.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        historlabopre5.setText("¿Sabe usted de alguien que haya participado en un fraude en algunas de las empresas para las que ha laborado?");

        jRadioButton23.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton23.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jRadioButton23.setText("A");
        jRadioButton23.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButton23ItemStateChanged(evt);
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

        jCheckBox41.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox41.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jCheckBox41.setText("Sí");
        jCheckBox41.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox41ItemStateChanged(evt);
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

        jCheckBox49.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox49.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jCheckBox49.setText("Sí");
        jCheckBox49.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox49ItemStateChanged(evt);
            }
        });

        historlabopre9.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        historlabopre9.setText("¿Existe alguna admisión relevante en conducta laboral?");

        jLabel109.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtresphistola9.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtresphistola9.setBorder(null);
        txtresphistola9.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtresphistola9CaretUpdate(evt);
            }
        });
        txtresphistola9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtresphistola9ActionPerformed(evt);
            }
        });
        txtresphistola9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtresphistola9KeyTyped(evt);
            }
        });

        jLabel113.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtresphistola5.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtresphistola5.setBorder(null);
        txtresphistola5.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtresphistola5CaretUpdate(evt);
            }
        });
        txtresphistola5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtresphistola5ActionPerformed(evt);
            }
        });
        txtresphistola5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtresphistola5KeyTyped(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        diligencielosdatosempresa.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        diligencielosdatosempresa.setText("Empresa:");

        jLabel30.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        diligencielosdatoslugar.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        diligencielosdatoslugar.setText("Lugar:");

        jLabel31.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel33.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel32.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        diligencielosdatossalario.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        diligencielosdatossalario.setText("Salario:");

        diligencielosdatoscargo.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        diligencielosdatoscargo.setText("Cargo:");

        txtdiligencielosdatoscargo.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtdiligencielosdatoscargo.setBorder(null);
        txtdiligencielosdatoscargo.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtdiligencielosdatoscargoCaretUpdate(evt);
            }
        });
        txtdiligencielosdatoscargo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtdiligencielosdatoscargoKeyTyped(evt);
            }
        });

        txtdiligencielosdatosempresa.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtdiligencielosdatosempresa.setBorder(null);
        txtdiligencielosdatosempresa.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtdiligencielosdatosempresaCaretUpdate(evt);
            }
        });
        txtdiligencielosdatosempresa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtdiligencielosdatosempresaKeyTyped(evt);
            }
        });

        txtdiligencielosdatoslugar.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtdiligencielosdatoslugar.setBorder(null);
        txtdiligencielosdatoslugar.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtdiligencielosdatoslugarCaretUpdate(evt);
            }
        });
        txtdiligencielosdatoslugar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtdiligencielosdatoslugarKeyTyped(evt);
            }
        });

        txtdiligencielosdatossalario.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtdiligencielosdatossalario.setBorder(null);
        txtdiligencielosdatossalario.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtdiligencielosdatossalarioCaretUpdate(evt);
            }
        });
        txtdiligencielosdatossalario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtdiligencielosdatossalarioKeyTyped(evt);
            }
        });

        diligencielosdatosferetiro1.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        diligencielosdatosferetiro1.setText("Fecha ingreso:");

        fechaingresoemp.setMonth(0);
        fechaingresoemp.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                fechaingresoempPropertyChange(evt);
            }
        });

        fechaingresoemp_a.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                fechaingresoemp_aPropertyChange(evt);
            }
        });

        diligencielosdatostiempo.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        diligencielosdatostiempo.setText("Laboró por");

        sptiempolaboro.setFont(new java.awt.Font("Segoe UI Emoji", 0, 13)); // NOI18N
        sptiempolaboro.setBorder(null);
        sptiempolaboro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                sptiempolaboroKeyTyped(evt);
            }
        });

        diligencielosdatostiempom.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        diligencielosdatostiempom.setText("mese(s)");

        diligencielosdatosferetiro.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        diligencielosdatosferetiro.setText("Fecha retiro:");

        diligencielosdatosmotivo.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        diligencielosdatosmotivo.setText("Motivo de retiro:");

        fecharetiroemp.setMonth(0);
        fecharetiroemp.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                fecharetiroempPropertyChange(evt);
            }
        });

        fecharetiroemp_a.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                fecharetiroemp_aPropertyChange(evt);
            }
        });

        jLabel29.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtdiligencielosdatosmotivo.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtdiligencielosdatosmotivo.setBorder(null);
        txtdiligencielosdatosmotivo.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtdiligencielosdatosmotivoCaretUpdate(evt);
            }
        });
        txtdiligencielosdatosmotivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdiligencielosdatosmotivoActionPerformed(evt);
            }
        });
        txtdiligencielosdatosmotivo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtdiligencielosdatosmotivoKeyTyped(evt);
            }
        });

        jCheckBox51.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox51.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jCheckBox51.setText("El examinado no recuerda las fechas de inicio y/o de fin de su proceso en la compañía");
        jCheckBox51.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox51ItemStateChanged(evt);
            }
        });

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/plus-symbol.png"))); // NOI18N
        jLabel13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });

        jLabel27.setBackground(new java.awt.Color(255, 255, 255));
        jLabel27.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/substract.png"))); // NOI18N
        jLabel27.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel27MouseClicked(evt);
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
                        .addGap(10, 10, 10)
                        .addComponent(jCheckBox51))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(diligencielosdatosempresa)
                        .addGap(16, 16, 16)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(91, 91, 91)
                                .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtdiligencielosdatosempresa, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(diligencielosdatoslugar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtdiligencielosdatoslugar, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtdiligencielosdatoscargo, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel29, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 533, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(diligencielosdatosmotivo)
                        .addGap(18, 18, 18)
                        .addComponent(txtdiligencielosdatosmotivo, javax.swing.GroupLayout.PREFERRED_SIZE, 533, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel33, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(diligencielosdatoscargo)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(diligencielosdatosferetiro1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(fechaingresoemp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(fechaingresoemp_a, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(90, 90, 90)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(diligencielosdatossalario)
                            .addComponent(diligencielosdatosferetiro))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtdiligencielosdatossalario, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(fecharetiroemp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(fecharetiroemp_a, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(diligencielosdatostiempo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sptiempolaboro, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(diligencielosdatostiempom)
                        .addGap(82, 82, 82))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(jLabel27)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(diligencielosdatosempresa)
                                    .addComponent(txtdiligencielosdatosempresa, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(diligencielosdatoslugar)
                                    .addComponent(txtdiligencielosdatoslugar, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, 0)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(20, 20, 20)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(diligencielosdatoscargo)
                                    .addComponent(diligencielosdatossalario)
                                    .addComponent(txtdiligencielosdatoscargo, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtdiligencielosdatossalario, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, 0)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(20, 20, 20)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(fechaingresoemp_a, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(fechaingresoemp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(diligencielosdatosferetiro1))
                                            .addComponent(diligencielosdatosferetiro)
                                            .addComponent(fecharetiroemp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(fecharetiroemp_a, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(20, 20, 20)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(diligencielosdatosmotivo)
                                            .addComponent(txtdiligencielosdatosmotivo, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, 0)
                                        .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(diligencielosdatostiempo)
                                        .addComponent(sptiempolaboro, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(diligencielosdatostiempom))))
                            .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addComponent(jCheckBox51, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        diligencielosdatosempresa1.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        diligencielosdatosempresa1.setText("Empresa:");

        jLabel34.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        diligencielosdatoslugar1.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        diligencielosdatoslugar1.setText("Lugar:");

        jLabel35.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel36.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel37.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        diligencielosdatossalario1.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        diligencielosdatossalario1.setText("Salario:");

        diligencielosdatoscargo1.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        diligencielosdatoscargo1.setText("Cargo:");

        txtdiligencielosdatoscargo1.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtdiligencielosdatoscargo1.setBorder(null);
        txtdiligencielosdatoscargo1.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtdiligencielosdatoscargo1CaretUpdate(evt);
            }
        });
        txtdiligencielosdatoscargo1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtdiligencielosdatoscargo1KeyTyped(evt);
            }
        });

        txtdiligencielosdatosempresa1.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtdiligencielosdatosempresa1.setBorder(null);
        txtdiligencielosdatosempresa1.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtdiligencielosdatosempresa1CaretUpdate(evt);
            }
        });
        txtdiligencielosdatosempresa1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtdiligencielosdatosempresa1KeyTyped(evt);
            }
        });

        txtdiligencielosdatoslugar1.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtdiligencielosdatoslugar1.setBorder(null);
        txtdiligencielosdatoslugar1.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtdiligencielosdatoslugar1CaretUpdate(evt);
            }
        });
        txtdiligencielosdatoslugar1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtdiligencielosdatoslugar1KeyTyped(evt);
            }
        });

        txtdiligencielosdatossalario1.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtdiligencielosdatossalario1.setBorder(null);
        txtdiligencielosdatossalario1.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtdiligencielosdatossalario1CaretUpdate(evt);
            }
        });
        txtdiligencielosdatossalario1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtdiligencielosdatossalario1KeyTyped(evt);
            }
        });

        diligencielosdatosferetiro2.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        diligencielosdatosferetiro2.setText("Fecha ingreso:");

        fechaingresoemp1.setMonth(0);
        fechaingresoemp1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                fechaingresoemp1PropertyChange(evt);
            }
        });

        fechaingresoemp_a1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                fechaingresoemp_a1PropertyChange(evt);
            }
        });

        diligencielosdatostiempo1.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        diligencielosdatostiempo1.setText("Laboró por");

        sptiempolaboro1.setFont(new java.awt.Font("Segoe UI Emoji", 0, 13)); // NOI18N
        sptiempolaboro1.setBorder(null);
        sptiempolaboro1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                sptiempolaboro1KeyTyped(evt);
            }
        });

        diligencielosdatostiempom1.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        diligencielosdatostiempom1.setText("mese(s)");

        diligencielosdatosferetiro3.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        diligencielosdatosferetiro3.setText("Fecha retiro:");

        diligencielosdatosmotivo1.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        diligencielosdatosmotivo1.setText("Motivo de retiro:");

        fecharetiroemp1.setMonth(0);
        fecharetiroemp1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                fecharetiroemp1PropertyChange(evt);
            }
        });

        fecharetiroemp_a1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                fecharetiroemp_a1PropertyChange(evt);
            }
        });

        jLabel38.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtdiligencielosdatosmotivo1.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtdiligencielosdatosmotivo1.setBorder(null);
        txtdiligencielosdatosmotivo1.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtdiligencielosdatosmotivo1CaretUpdate(evt);
            }
        });
        txtdiligencielosdatosmotivo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdiligencielosdatosmotivo1ActionPerformed(evt);
            }
        });
        txtdiligencielosdatosmotivo1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtdiligencielosdatosmotivo1KeyTyped(evt);
            }
        });

        jCheckBox52.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox52.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jCheckBox52.setText("El examinado no recuerda las fechas de inicio y/o de fin de su proceso en la compañía");
        jCheckBox52.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox52ItemStateChanged(evt);
            }
        });

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/plus-symbol.png"))); // NOI18N
        jLabel14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });

        jLabel28.setBackground(new java.awt.Color(255, 255, 255));
        jLabel28.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/substract.png"))); // NOI18N
        jLabel28.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel28MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jCheckBox52))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(diligencielosdatosempresa1)
                        .addGap(16, 16, 16)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(91, 91, 91)
                                .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(txtdiligencielosdatosempresa1, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(diligencielosdatoslugar1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtdiligencielosdatoslugar1, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtdiligencielosdatoscargo1, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel38, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 533, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(diligencielosdatosmotivo1)
                        .addGap(18, 18, 18)
                        .addComponent(txtdiligencielosdatosmotivo1, javax.swing.GroupLayout.PREFERRED_SIZE, 533, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel36, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(diligencielosdatoscargo1)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(diligencielosdatosferetiro2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(fechaingresoemp1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(fechaingresoemp_a1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(90, 90, 90)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(diligencielosdatossalario1)
                            .addComponent(diligencielosdatosferetiro3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtdiligencielosdatossalario1, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(fecharetiroemp1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(fecharetiroemp_a1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(diligencielosdatostiempo1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sptiempolaboro1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(diligencielosdatostiempom1)
                        .addGap(82, 82, 82))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(jLabel28)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(diligencielosdatosempresa1)
                                    .addComponent(txtdiligencielosdatosempresa1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(diligencielosdatoslugar1)
                                    .addComponent(txtdiligencielosdatoslugar1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, 0)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(20, 20, 20)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(diligencielosdatoscargo1)
                                    .addComponent(diligencielosdatossalario1)
                                    .addComponent(txtdiligencielosdatoscargo1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtdiligencielosdatossalario1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, 0)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(20, 20, 20)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(fechaingresoemp_a1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(fechaingresoemp1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(diligencielosdatosferetiro2))
                                            .addComponent(diligencielosdatosferetiro3)
                                            .addComponent(fecharetiroemp1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(fecharetiroemp_a1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(20, 20, 20)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(diligencielosdatosmotivo1)
                                            .addComponent(txtdiligencielosdatosmotivo1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, 0)
                                        .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(diligencielosdatostiempo1)
                                        .addComponent(sptiempolaboro1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(diligencielosdatostiempom1))))
                            .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addComponent(jCheckBox52, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        diligencielosdatosempresa3.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        diligencielosdatosempresa3.setText("Empresa:");

        jLabel45.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        diligencielosdatoslugar3.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        diligencielosdatoslugar3.setText("Lugar:");

        jLabel46.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel47.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel48.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        diligencielosdatossalario3.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        diligencielosdatossalario3.setText("Salario:");

        diligencielosdatoscargo3.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        diligencielosdatoscargo3.setText("Cargo:");

        txtdiligencielosdatoscargo3.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtdiligencielosdatoscargo3.setBorder(null);
        txtdiligencielosdatoscargo3.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtdiligencielosdatoscargo3CaretUpdate(evt);
            }
        });
        txtdiligencielosdatoscargo3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtdiligencielosdatoscargo3KeyTyped(evt);
            }
        });

        txtdiligencielosdatosempresa3.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtdiligencielosdatosempresa3.setBorder(null);
        txtdiligencielosdatosempresa3.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtdiligencielosdatosempresa3CaretUpdate(evt);
            }
        });
        txtdiligencielosdatosempresa3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtdiligencielosdatosempresa3KeyTyped(evt);
            }
        });

        txtdiligencielosdatoslugar3.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtdiligencielosdatoslugar3.setBorder(null);
        txtdiligencielosdatoslugar3.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtdiligencielosdatoslugar3CaretUpdate(evt);
            }
        });
        txtdiligencielosdatoslugar3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtdiligencielosdatoslugar3KeyTyped(evt);
            }
        });

        txtdiligencielosdatossalario3.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtdiligencielosdatossalario3.setBorder(null);
        txtdiligencielosdatossalario3.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtdiligencielosdatossalario3CaretUpdate(evt);
            }
        });
        txtdiligencielosdatossalario3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdiligencielosdatossalario3ActionPerformed(evt);
            }
        });
        txtdiligencielosdatossalario3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtdiligencielosdatossalario3KeyTyped(evt);
            }
        });

        diligencielosdatosferetiro6.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        diligencielosdatosferetiro6.setText("Fecha ingreso:");

        fechaingresoemp3.setMonth(0);
        fechaingresoemp3.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                fechaingresoemp3PropertyChange(evt);
            }
        });

        fechaingresoemp_a3.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                fechaingresoemp_a3PropertyChange(evt);
            }
        });

        diligencielosdatostiempo3.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        diligencielosdatostiempo3.setText("Laboró por");

        sptiempolaboro3.setFont(new java.awt.Font("Segoe UI Emoji", 0, 13)); // NOI18N
        sptiempolaboro3.setBorder(null);
        sptiempolaboro3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                sptiempolaboro3KeyTyped(evt);
            }
        });

        diligencielosdatostiempom3.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        diligencielosdatostiempom3.setText("mese(s)");

        diligencielosdatosferetiro7.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        diligencielosdatosferetiro7.setText("Fecha retiro:");

        diligencielosdatosmotivo3.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        diligencielosdatosmotivo3.setText("Motivo de retiro:");

        fecharetiroemp3.setMonth(0);
        fecharetiroemp3.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                fecharetiroemp3PropertyChange(evt);
            }
        });

        fecharetiroemp_a3.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                fecharetiroemp_a3PropertyChange(evt);
            }
        });

        jLabel49.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtdiligencielosdatosmotivo3.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtdiligencielosdatosmotivo3.setBorder(null);
        txtdiligencielosdatosmotivo3.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtdiligencielosdatosmotivo3CaretUpdate(evt);
            }
        });
        txtdiligencielosdatosmotivo3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdiligencielosdatosmotivo3ActionPerformed(evt);
            }
        });
        txtdiligencielosdatosmotivo3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtdiligencielosdatosmotivo3KeyTyped(evt);
            }
        });

        jCheckBox54.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox54.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jCheckBox54.setText("El examinado no recuerda las fechas de inicio y/o de fin de su proceso en la compañía");
        jCheckBox54.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox54ItemStateChanged(evt);
            }
        });

        jLabel16.setBackground(new java.awt.Color(255, 255, 255));
        jLabel16.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/plus-symbol.png"))); // NOI18N
        jLabel16.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
        });

        jLabel50.setBackground(new java.awt.Color(255, 255, 255));
        jLabel50.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel50.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/substract.png"))); // NOI18N
        jLabel50.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel50.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel50MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jCheckBox54))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(diligencielosdatosempresa3)
                        .addGap(16, 16, 16)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(91, 91, 91)
                                .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(txtdiligencielosdatosempresa3, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(diligencielosdatoslugar3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtdiligencielosdatoslugar3, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtdiligencielosdatoscargo3, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel49, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 533, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(diligencielosdatosmotivo3)
                        .addGap(18, 18, 18)
                        .addComponent(txtdiligencielosdatosmotivo3, javax.swing.GroupLayout.PREFERRED_SIZE, 533, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel47, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(diligencielosdatoscargo3)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(diligencielosdatosferetiro6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(fechaingresoemp3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(fechaingresoemp_a3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(90, 90, 90)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(diligencielosdatossalario3)
                            .addComponent(diligencielosdatosferetiro7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtdiligencielosdatossalario3, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(fecharetiroemp3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(fecharetiroemp_a3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(diligencielosdatostiempo3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sptiempolaboro3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(diligencielosdatostiempom3)
                        .addGap(82, 82, 82))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(jLabel50)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(diligencielosdatosempresa3)
                                    .addComponent(txtdiligencielosdatosempresa3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(diligencielosdatoslugar3)
                                    .addComponent(txtdiligencielosdatoslugar3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, 0)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(20, 20, 20)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(diligencielosdatoscargo3)
                                    .addComponent(diligencielosdatossalario3)
                                    .addComponent(txtdiligencielosdatoscargo3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtdiligencielosdatossalario3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, 0)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(20, 20, 20)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(fechaingresoemp_a3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(fechaingresoemp3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(diligencielosdatosferetiro6))
                                            .addComponent(diligencielosdatosferetiro7)
                                            .addComponent(fecharetiroemp3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(fecharetiroemp_a3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(20, 20, 20)
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(diligencielosdatosmotivo3)
                                            .addComponent(txtdiligencielosdatosmotivo3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, 0)
                                        .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(diligencielosdatostiempo3)
                                        .addComponent(sptiempolaboro3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(diligencielosdatostiempom3))))
                            .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addComponent(jCheckBox54, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
        );

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        diligencielosdatosempresa4.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        diligencielosdatosempresa4.setText("Empresa:");

        jLabel51.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        diligencielosdatoslugar4.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        diligencielosdatoslugar4.setText("Lugar:");

        jLabel52.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel53.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel54.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        diligencielosdatossalario4.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        diligencielosdatossalario4.setText("Salario:");

        diligencielosdatoscargo4.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        diligencielosdatoscargo4.setText("Cargo:");

        txtdiligencielosdatoscargo4.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtdiligencielosdatoscargo4.setBorder(null);
        txtdiligencielosdatoscargo4.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtdiligencielosdatoscargo4CaretUpdate(evt);
            }
        });
        txtdiligencielosdatoscargo4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtdiligencielosdatoscargo4KeyTyped(evt);
            }
        });

        txtdiligencielosdatosempresa4.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtdiligencielosdatosempresa4.setBorder(null);
        txtdiligencielosdatosempresa4.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtdiligencielosdatosempresa4CaretUpdate(evt);
            }
        });
        txtdiligencielosdatosempresa4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtdiligencielosdatosempresa4KeyTyped(evt);
            }
        });

        txtdiligencielosdatoslugar4.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtdiligencielosdatoslugar4.setBorder(null);
        txtdiligencielosdatoslugar4.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtdiligencielosdatoslugar4CaretUpdate(evt);
            }
        });
        txtdiligencielosdatoslugar4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtdiligencielosdatoslugar4KeyTyped(evt);
            }
        });

        txtdiligencielosdatossalario4.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtdiligencielosdatossalario4.setBorder(null);
        txtdiligencielosdatossalario4.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtdiligencielosdatossalario4CaretUpdate(evt);
            }
        });
        txtdiligencielosdatossalario4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtdiligencielosdatossalario4KeyTyped(evt);
            }
        });

        diligencielosdatosferetiro8.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        diligencielosdatosferetiro8.setText("Fecha ingreso:");

        fechaingresoemp4.setMonth(0);
        fechaingresoemp4.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                fechaingresoemp4PropertyChange(evt);
            }
        });

        fechaingresoemp_a4.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                fechaingresoemp_a4PropertyChange(evt);
            }
        });

        diligencielosdatostiempo4.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        diligencielosdatostiempo4.setText("Laboró por");

        sptiempolaboro4.setFont(new java.awt.Font("Segoe UI Emoji", 0, 13)); // NOI18N
        sptiempolaboro4.setBorder(null);
        sptiempolaboro4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                sptiempolaboro4KeyTyped(evt);
            }
        });

        diligencielosdatostiempom4.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        diligencielosdatostiempom4.setText("mese(s)");

        diligencielosdatosferetiro9.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        diligencielosdatosferetiro9.setText("Fecha retiro:");

        diligencielosdatosmotivo4.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        diligencielosdatosmotivo4.setText("Motivo de retiro:");

        fecharetiroemp_a4.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                fecharetiroemp_a4PropertyChange(evt);
            }
        });

        fecharetiroemp4.setMonth(0);
        fecharetiroemp4.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                fecharetiroemp4PropertyChange(evt);
            }
        });

        jLabel55.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtdiligencielosdatosmotivo4.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtdiligencielosdatosmotivo4.setBorder(null);
        txtdiligencielosdatosmotivo4.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtdiligencielosdatosmotivo4CaretUpdate(evt);
            }
        });
        txtdiligencielosdatosmotivo4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdiligencielosdatosmotivo4ActionPerformed(evt);
            }
        });
        txtdiligencielosdatosmotivo4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtdiligencielosdatosmotivo4KeyTyped(evt);
            }
        });

        jCheckBox55.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox55.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jCheckBox55.setText("El examinado no recuerda las fechas de inicio y/o de fin de su proceso en la compañía");
        jCheckBox55.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox55ItemStateChanged(evt);
            }
        });

        jLabel17.setBackground(new java.awt.Color(255, 255, 255));
        jLabel17.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/plus-symbol.png"))); // NOI18N
        jLabel17.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel17MouseClicked(evt);
            }
        });

        jLabel56.setBackground(new java.awt.Color(255, 255, 255));
        jLabel56.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel56.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/substract.png"))); // NOI18N
        jLabel56.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel56.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel56MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jCheckBox55))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(diligencielosdatosempresa4)
                        .addGap(16, 16, 16)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(91, 91, 91)
                                .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(txtdiligencielosdatosempresa4, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(diligencielosdatoslugar4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtdiligencielosdatoslugar4, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtdiligencielosdatoscargo4, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel55, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 533, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(diligencielosdatosmotivo4)
                        .addGap(18, 18, 18)
                        .addComponent(txtdiligencielosdatosmotivo4, javax.swing.GroupLayout.PREFERRED_SIZE, 533, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel53, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(diligencielosdatoscargo4)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(diligencielosdatosferetiro8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(fechaingresoemp4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(fechaingresoemp_a4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(90, 90, 90)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(diligencielosdatossalario4)
                            .addComponent(diligencielosdatosferetiro9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtdiligencielosdatossalario4, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(fecharetiroemp4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(fecharetiroemp_a4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(diligencielosdatostiempo4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sptiempolaboro4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(diligencielosdatostiempom4)
                        .addGap(82, 82, 82))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(jLabel56)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(diligencielosdatosempresa4)
                                    .addComponent(txtdiligencielosdatosempresa4, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(diligencielosdatoslugar4)
                                    .addComponent(txtdiligencielosdatoslugar4, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, 0)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(20, 20, 20)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(diligencielosdatoscargo4)
                                    .addComponent(diligencielosdatossalario4)
                                    .addComponent(txtdiligencielosdatoscargo4, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtdiligencielosdatossalario4, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, 0)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(20, 20, 20)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(fechaingresoemp_a4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(fechaingresoemp4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(diligencielosdatosferetiro8))
                                            .addComponent(diligencielosdatosferetiro9)
                                            .addComponent(fecharetiroemp4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(fecharetiroemp_a4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(20, 20, 20)
                                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(diligencielosdatosmotivo4)
                                            .addComponent(txtdiligencielosdatosmotivo4, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, 0)
                                        .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(diligencielosdatostiempo4)
                                        .addComponent(sptiempolaboro4, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(diligencielosdatostiempom4))))
                            .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addComponent(jCheckBox55, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        diligencielosdatosempresa5.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        diligencielosdatosempresa5.setText("Empresa:");

        jLabel57.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        diligencielosdatoslugar5.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        diligencielosdatoslugar5.setText("Lugar:");

        jLabel58.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel59.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel60.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        diligencielosdatossalario5.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        diligencielosdatossalario5.setText("Salario:");

        diligencielosdatoscargo5.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        diligencielosdatoscargo5.setText("Cargo:");

        txtdiligencielosdatoscargo5.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtdiligencielosdatoscargo5.setBorder(null);
        txtdiligencielosdatoscargo5.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtdiligencielosdatoscargo5CaretUpdate(evt);
            }
        });
        txtdiligencielosdatoscargo5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtdiligencielosdatoscargo5KeyTyped(evt);
            }
        });

        txtdiligencielosdatosempresa5.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtdiligencielosdatosempresa5.setBorder(null);
        txtdiligencielosdatosempresa5.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtdiligencielosdatosempresa5CaretUpdate(evt);
            }
        });
        txtdiligencielosdatosempresa5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtdiligencielosdatosempresa5KeyTyped(evt);
            }
        });

        txtdiligencielosdatoslugar5.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtdiligencielosdatoslugar5.setBorder(null);
        txtdiligencielosdatoslugar5.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtdiligencielosdatoslugar5CaretUpdate(evt);
            }
        });
        txtdiligencielosdatoslugar5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtdiligencielosdatoslugar5KeyTyped(evt);
            }
        });

        txtdiligencielosdatossalario5.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtdiligencielosdatossalario5.setBorder(null);
        txtdiligencielosdatossalario5.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtdiligencielosdatossalario5CaretUpdate(evt);
            }
        });
        txtdiligencielosdatossalario5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtdiligencielosdatossalario5KeyTyped(evt);
            }
        });

        diligencielosdatosferetiro10.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        diligencielosdatosferetiro10.setText("Fecha ingreso:");

        fechaingresoemp5.setMonth(0);
        fechaingresoemp5.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                fechaingresoemp5PropertyChange(evt);
            }
        });

        fechaingresoemp_a5.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                fechaingresoemp_a5PropertyChange(evt);
            }
        });

        diligencielosdatostiempo5.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        diligencielosdatostiempo5.setText("Laboró por");

        sptiempolaboro5.setFont(new java.awt.Font("Segoe UI Emoji", 0, 13)); // NOI18N
        sptiempolaboro5.setBorder(null);
        sptiempolaboro5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                sptiempolaboro5KeyTyped(evt);
            }
        });

        diligencielosdatostiempom5.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        diligencielosdatostiempom5.setText("mese(s)");

        diligencielosdatosferetiro11.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        diligencielosdatosferetiro11.setText("Fecha retiro:");

        diligencielosdatosmotivo5.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        diligencielosdatosmotivo5.setText("Motivo de retiro:");

        fecharetiroemp5.setMonth(0);
        fecharetiroemp5.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                fecharetiroemp5PropertyChange(evt);
            }
        });

        fecharetiroemp_a5.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                fecharetiroemp_a5PropertyChange(evt);
            }
        });

        jLabel61.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtdiligencielosdatosmotivo5.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtdiligencielosdatosmotivo5.setBorder(null);
        txtdiligencielosdatosmotivo5.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtdiligencielosdatosmotivo5CaretUpdate(evt);
            }
        });
        txtdiligencielosdatosmotivo5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdiligencielosdatosmotivo5ActionPerformed(evt);
            }
        });
        txtdiligencielosdatosmotivo5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtdiligencielosdatosmotivo5KeyTyped(evt);
            }
        });

        jCheckBox56.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox56.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jCheckBox56.setText("El examinado no recuerda las fechas de inicio y/o de fin de su proceso en la compañía");
        jCheckBox56.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox56ItemStateChanged(evt);
            }
        });

        jLabel18.setBackground(new java.awt.Color(255, 255, 255));
        jLabel18.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/plus-symbol.png"))); // NOI18N
        jLabel18.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel18MouseClicked(evt);
            }
        });

        jLabel62.setBackground(new java.awt.Color(255, 255, 255));
        jLabel62.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel62.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/substract.png"))); // NOI18N
        jLabel62.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel62.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel62MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jCheckBox56))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(diligencielosdatosempresa5)
                        .addGap(16, 16, 16)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(91, 91, 91)
                                .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(txtdiligencielosdatosempresa5, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(diligencielosdatoslugar5, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtdiligencielosdatoslugar5, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel60, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtdiligencielosdatoscargo5, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel61, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 533, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addComponent(diligencielosdatosmotivo5)
                        .addGap(18, 18, 18)
                        .addComponent(txtdiligencielosdatosmotivo5, javax.swing.GroupLayout.PREFERRED_SIZE, 533, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel59, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(diligencielosdatoscargo5)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(diligencielosdatosferetiro10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(fechaingresoemp5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(fechaingresoemp_a5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(90, 90, 90)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(diligencielosdatossalario5)
                            .addComponent(diligencielosdatosferetiro11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtdiligencielosdatossalario5, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(fecharetiroemp5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(fecharetiroemp_a5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(diligencielosdatostiempo5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sptiempolaboro5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(diligencielosdatostiempom5)
                        .addGap(82, 82, 82))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(jLabel62)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(diligencielosdatosempresa5)
                                    .addComponent(txtdiligencielosdatosempresa5, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(diligencielosdatoslugar5)
                                    .addComponent(txtdiligencielosdatoslugar5, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, 0)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(20, 20, 20)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(diligencielosdatoscargo5)
                                    .addComponent(diligencielosdatossalario5)
                                    .addComponent(txtdiligencielosdatoscargo5, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtdiligencielosdatossalario5, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, 0)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel60, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(20, 20, 20)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(fechaingresoemp_a5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(fechaingresoemp5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(diligencielosdatosferetiro10))
                                            .addComponent(diligencielosdatosferetiro11)
                                            .addComponent(fecharetiroemp5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(fecharetiroemp_a5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(20, 20, 20)
                                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(diligencielosdatosmotivo5)
                                            .addComponent(txtdiligencielosdatosmotivo5, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, 0)
                                        .addComponent(jLabel61, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(diligencielosdatostiempo5)
                                        .addComponent(sptiempolaboro5, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(diligencielosdatostiempom5))))
                            .addComponent(jLabel62, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addComponent(jCheckBox56, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));

        diligencielosdatosempresa6.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        diligencielosdatosempresa6.setText("Empresa:");

        jLabel63.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        diligencielosdatoslugar6.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        diligencielosdatoslugar6.setText("Lugar:");

        jLabel64.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel65.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel66.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        diligencielosdatossalario6.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        diligencielosdatossalario6.setText("Salario:");

        diligencielosdatoscargo6.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        diligencielosdatoscargo6.setText("Cargo:");

        txtdiligencielosdatoscargo6.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtdiligencielosdatoscargo6.setBorder(null);
        txtdiligencielosdatoscargo6.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtdiligencielosdatoscargo6CaretUpdate(evt);
            }
        });
        txtdiligencielosdatoscargo6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtdiligencielosdatoscargo6KeyTyped(evt);
            }
        });

        txtdiligencielosdatosempresa6.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtdiligencielosdatosempresa6.setBorder(null);
        txtdiligencielosdatosempresa6.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtdiligencielosdatosempresa6CaretUpdate(evt);
            }
        });
        txtdiligencielosdatosempresa6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtdiligencielosdatosempresa6KeyTyped(evt);
            }
        });

        txtdiligencielosdatoslugar6.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtdiligencielosdatoslugar6.setBorder(null);
        txtdiligencielosdatoslugar6.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtdiligencielosdatoslugar6CaretUpdate(evt);
            }
        });
        txtdiligencielosdatoslugar6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtdiligencielosdatoslugar6KeyTyped(evt);
            }
        });

        txtdiligencielosdatossalario6.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtdiligencielosdatossalario6.setBorder(null);
        txtdiligencielosdatossalario6.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtdiligencielosdatossalario6CaretUpdate(evt);
            }
        });
        txtdiligencielosdatossalario6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtdiligencielosdatossalario6KeyTyped(evt);
            }
        });

        diligencielosdatosferetiro12.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        diligencielosdatosferetiro12.setText("Fecha ingreso:");

        fechaingresoemp6.setMonth(0);
        fechaingresoemp6.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                fechaingresoemp6PropertyChange(evt);
            }
        });

        fechaingresoemp_a6.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                fechaingresoemp_a6PropertyChange(evt);
            }
        });

        diligencielosdatostiempo6.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        diligencielosdatostiempo6.setText("Laboró por");

        sptiempolaboro6.setFont(new java.awt.Font("Segoe UI Emoji", 0, 13)); // NOI18N
        sptiempolaboro6.setBorder(null);
        sptiempolaboro6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                sptiempolaboro6KeyTyped(evt);
            }
        });

        diligencielosdatostiempom6.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        diligencielosdatostiempom6.setText("mese(s)");

        diligencielosdatosferetiro13.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        diligencielosdatosferetiro13.setText("Fecha retiro:");

        diligencielosdatosmotivo6.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        diligencielosdatosmotivo6.setText("Motivo de retiro:");

        fecharetiroemp6.setMonth(0);
        fecharetiroemp6.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                fecharetiroemp6PropertyChange(evt);
            }
        });

        fecharetiroemp_a6.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                fecharetiroemp_a6PropertyChange(evt);
            }
        });

        jLabel67.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtdiligencielosdatosmotivo6.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtdiligencielosdatosmotivo6.setBorder(null);
        txtdiligencielosdatosmotivo6.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtdiligencielosdatosmotivo6CaretUpdate(evt);
            }
        });
        txtdiligencielosdatosmotivo6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdiligencielosdatosmotivo6ActionPerformed(evt);
            }
        });
        txtdiligencielosdatosmotivo6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtdiligencielosdatosmotivo6KeyTyped(evt);
            }
        });

        jCheckBox57.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox57.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jCheckBox57.setText("El examinado no recuerda las fechas de inicio y/o de fin de su proceso en la compañía");
        jCheckBox57.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox57ItemStateChanged(evt);
            }
        });

        jLabel19.setBackground(new java.awt.Color(255, 255, 255));
        jLabel19.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/plus-symbol.png"))); // NOI18N
        jLabel19.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel19MouseClicked(evt);
            }
        });

        jLabel68.setBackground(new java.awt.Color(255, 255, 255));
        jLabel68.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel68.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/substract.png"))); // NOI18N
        jLabel68.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel68.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel68MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jCheckBox57))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(diligencielosdatosempresa6)
                        .addGap(16, 16, 16)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(jLabel63, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(91, 91, 91)
                                .addComponent(jLabel64, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(txtdiligencielosdatosempresa6, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(diligencielosdatoslugar6, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtdiligencielosdatoslugar6, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel66, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtdiligencielosdatoscargo6, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel67, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 533, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addComponent(diligencielosdatosmotivo6)
                        .addGap(18, 18, 18)
                        .addComponent(txtdiligencielosdatosmotivo6, javax.swing.GroupLayout.PREFERRED_SIZE, 533, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel65, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(diligencielosdatoscargo6)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(diligencielosdatosferetiro12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(fechaingresoemp6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(fechaingresoemp_a6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(90, 90, 90)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(diligencielosdatossalario6)
                            .addComponent(diligencielosdatosferetiro13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtdiligencielosdatossalario6, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(fecharetiroemp6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(fecharetiroemp_a6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(diligencielosdatostiempo6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sptiempolaboro6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(diligencielosdatostiempom6)
                        .addGap(82, 82, 82))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(jLabel68)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(diligencielosdatosempresa6)
                                    .addComponent(txtdiligencielosdatosempresa6, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(diligencielosdatoslugar6)
                                    .addComponent(txtdiligencielosdatoslugar6, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, 0)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel63, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel64, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(20, 20, 20)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(diligencielosdatoscargo6)
                                    .addComponent(diligencielosdatossalario6)
                                    .addComponent(txtdiligencielosdatoscargo6, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtdiligencielosdatossalario6, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, 0)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel65, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel66, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(20, 20, 20)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(fechaingresoemp_a6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(fechaingresoemp6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(diligencielosdatosferetiro12))
                                            .addComponent(diligencielosdatosferetiro13)
                                            .addComponent(fecharetiroemp6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(fecharetiroemp_a6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(20, 20, 20)
                                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(diligencielosdatosmotivo6)
                                            .addComponent(txtdiligencielosdatosmotivo6, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, 0)
                                        .addComponent(jLabel67, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(diligencielosdatostiempo6)
                                        .addComponent(sptiempolaboro6, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(diligencielosdatostiempom6))))
                            .addComponent(jLabel68, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addComponent(jCheckBox57, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
        );

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));

        diligencielosdatosempresa7.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        diligencielosdatosempresa7.setText("Empresa:");

        jLabel69.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        diligencielosdatoslugar7.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        diligencielosdatoslugar7.setText("Lugar:");

        jLabel70.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel71.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel72.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        diligencielosdatossalario7.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        diligencielosdatossalario7.setText("Salario:");

        diligencielosdatoscargo7.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        diligencielosdatoscargo7.setText("Cargo:");

        txtdiligencielosdatoscargo7.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtdiligencielosdatoscargo7.setBorder(null);
        txtdiligencielosdatoscargo7.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtdiligencielosdatoscargo7CaretUpdate(evt);
            }
        });
        txtdiligencielosdatoscargo7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtdiligencielosdatoscargo7KeyTyped(evt);
            }
        });

        txtdiligencielosdatosempresa7.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtdiligencielosdatosempresa7.setBorder(null);
        txtdiligencielosdatosempresa7.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtdiligencielosdatosempresa7CaretUpdate(evt);
            }
        });
        txtdiligencielosdatosempresa7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtdiligencielosdatosempresa7KeyTyped(evt);
            }
        });

        txtdiligencielosdatoslugar7.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtdiligencielosdatoslugar7.setBorder(null);
        txtdiligencielosdatoslugar7.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtdiligencielosdatoslugar7CaretUpdate(evt);
            }
        });
        txtdiligencielosdatoslugar7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtdiligencielosdatoslugar7KeyTyped(evt);
            }
        });

        txtdiligencielosdatossalario7.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtdiligencielosdatossalario7.setBorder(null);
        txtdiligencielosdatossalario7.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtdiligencielosdatossalario7CaretUpdate(evt);
            }
        });
        txtdiligencielosdatossalario7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtdiligencielosdatossalario7KeyTyped(evt);
            }
        });

        diligencielosdatosferetiro14.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        diligencielosdatosferetiro14.setText("Fecha ingreso:");

        fechaingresoemp7.setMonth(0);
        fechaingresoemp7.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                fechaingresoemp7PropertyChange(evt);
            }
        });

        fechaingresoemp_a7.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                fechaingresoemp_a7PropertyChange(evt);
            }
        });

        diligencielosdatostiempo7.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        diligencielosdatostiempo7.setText("Laboró por");

        sptiempolaboro7.setFont(new java.awt.Font("Segoe UI Emoji", 0, 13)); // NOI18N
        sptiempolaboro7.setBorder(null);
        sptiempolaboro7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                sptiempolaboro7KeyTyped(evt);
            }
        });

        diligencielosdatostiempom7.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        diligencielosdatostiempom7.setText("mese(s)");

        diligencielosdatosferetiro15.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        diligencielosdatosferetiro15.setText("Fecha retiro:");

        diligencielosdatosmotivo7.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        diligencielosdatosmotivo7.setText("Motivo de retiro:");

        fecharetiroemp7.setMonth(0);
        fecharetiroemp7.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                fecharetiroemp7PropertyChange(evt);
            }
        });

        fecharetiroemp_a7.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                fecharetiroemp_a7PropertyChange(evt);
            }
        });

        jLabel73.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtdiligencielosdatosmotivo7.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtdiligencielosdatosmotivo7.setBorder(null);
        txtdiligencielosdatosmotivo7.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtdiligencielosdatosmotivo7CaretUpdate(evt);
            }
        });
        txtdiligencielosdatosmotivo7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdiligencielosdatosmotivo7ActionPerformed(evt);
            }
        });
        txtdiligencielosdatosmotivo7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtdiligencielosdatosmotivo7KeyTyped(evt);
            }
        });

        jCheckBox58.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox58.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jCheckBox58.setText("El examinado no recuerda las fechas de inicio y/o de fin de su proceso en la compañía");
        jCheckBox58.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox58ItemStateChanged(evt);
            }
        });

        jLabel20.setBackground(new java.awt.Color(255, 255, 255));
        jLabel20.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/plus-symbol.png"))); // NOI18N
        jLabel20.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel20MouseClicked(evt);
            }
        });

        jLabel74.setBackground(new java.awt.Color(255, 255, 255));
        jLabel74.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel74.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/substract.png"))); // NOI18N
        jLabel74.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel74.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel74MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jCheckBox58))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(diligencielosdatosempresa7)
                        .addGap(16, 16, 16)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(jLabel69, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(91, 91, 91)
                                .addComponent(jLabel70, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(txtdiligencielosdatosempresa7, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(diligencielosdatoslugar7, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtdiligencielosdatoslugar7, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel72, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtdiligencielosdatoscargo7, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel73, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 533, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addComponent(diligencielosdatosmotivo7)
                        .addGap(18, 18, 18)
                        .addComponent(txtdiligencielosdatosmotivo7, javax.swing.GroupLayout.PREFERRED_SIZE, 533, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel71, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(diligencielosdatoscargo7)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(diligencielosdatosferetiro14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(fechaingresoemp7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(fechaingresoemp_a7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(90, 90, 90)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(diligencielosdatossalario7)
                            .addComponent(diligencielosdatosferetiro15))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtdiligencielosdatossalario7, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(fecharetiroemp7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(fecharetiroemp_a7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(diligencielosdatostiempo7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sptiempolaboro7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(diligencielosdatostiempom7)
                        .addGap(82, 82, 82))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(jLabel74)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(diligencielosdatosempresa7)
                                    .addComponent(txtdiligencielosdatosempresa7, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(diligencielosdatoslugar7)
                                    .addComponent(txtdiligencielosdatoslugar7, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, 0)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel69, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel70, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(20, 20, 20)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(diligencielosdatoscargo7)
                                    .addComponent(diligencielosdatossalario7)
                                    .addComponent(txtdiligencielosdatoscargo7, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtdiligencielosdatossalario7, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, 0)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel71, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel72, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(20, 20, 20)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel9Layout.createSequentialGroup()
                                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(fechaingresoemp_a7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(fechaingresoemp7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(diligencielosdatosferetiro14))
                                            .addComponent(diligencielosdatosferetiro15)
                                            .addComponent(fecharetiroemp7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(fecharetiroemp_a7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(20, 20, 20)
                                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(diligencielosdatosmotivo7)
                                            .addComponent(txtdiligencielosdatosmotivo7, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, 0)
                                        .addComponent(jLabel73, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(diligencielosdatostiempo7)
                                        .addComponent(sptiempolaboro7, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(diligencielosdatostiempom7))))
                            .addComponent(jLabel74, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addComponent(jCheckBox58, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
        );

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));

        diligencielosdatosempresa8.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        diligencielosdatosempresa8.setText("Empresa:");

        jLabel75.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        diligencielosdatoslugar8.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        diligencielosdatoslugar8.setText("Lugar:");

        jLabel76.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel77.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel78.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        diligencielosdatossalario8.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        diligencielosdatossalario8.setText("Salario:");

        diligencielosdatoscargo8.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        diligencielosdatoscargo8.setText("Cargo:");

        txtdiligencielosdatoscargo8.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtdiligencielosdatoscargo8.setBorder(null);
        txtdiligencielosdatoscargo8.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtdiligencielosdatoscargo8CaretUpdate(evt);
            }
        });
        txtdiligencielosdatoscargo8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtdiligencielosdatoscargo8KeyTyped(evt);
            }
        });

        txtdiligencielosdatosempresa8.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtdiligencielosdatosempresa8.setBorder(null);
        txtdiligencielosdatosempresa8.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtdiligencielosdatosempresa8CaretUpdate(evt);
            }
        });
        txtdiligencielosdatosempresa8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtdiligencielosdatosempresa8KeyTyped(evt);
            }
        });

        txtdiligencielosdatoslugar8.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtdiligencielosdatoslugar8.setBorder(null);
        txtdiligencielosdatoslugar8.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtdiligencielosdatoslugar8CaretUpdate(evt);
            }
        });
        txtdiligencielosdatoslugar8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtdiligencielosdatoslugar8KeyTyped(evt);
            }
        });

        txtdiligencielosdatossalario8.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtdiligencielosdatossalario8.setBorder(null);
        txtdiligencielosdatossalario8.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtdiligencielosdatossalario8CaretUpdate(evt);
            }
        });
        txtdiligencielosdatossalario8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtdiligencielosdatossalario8KeyTyped(evt);
            }
        });

        diligencielosdatosferetiro16.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        diligencielosdatosferetiro16.setText("Fecha ingreso:");

        fechaingresoemp8.setMonth(0);
        fechaingresoemp8.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                fechaingresoemp8PropertyChange(evt);
            }
        });

        fechaingresoemp_a8.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                fechaingresoemp_a8PropertyChange(evt);
            }
        });

        diligencielosdatostiempo8.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        diligencielosdatostiempo8.setText("Laboró por");

        sptiempolaboro8.setFont(new java.awt.Font("Segoe UI Emoji", 0, 13)); // NOI18N
        sptiempolaboro8.setBorder(null);
        sptiempolaboro8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                sptiempolaboro8KeyTyped(evt);
            }
        });

        diligencielosdatostiempom8.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        diligencielosdatostiempom8.setText("mese(s)");

        diligencielosdatosferetiro17.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        diligencielosdatosferetiro17.setText("Fecha retiro:");

        diligencielosdatosmotivo8.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        diligencielosdatosmotivo8.setText("Motivo de retiro:");

        fecharetiroemp8.setMonth(0);
        fecharetiroemp8.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                fecharetiroemp8PropertyChange(evt);
            }
        });

        fecharetiroemp_a8.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                fecharetiroemp_a8PropertyChange(evt);
            }
        });

        jLabel79.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtdiligencielosdatosmotivo8.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtdiligencielosdatosmotivo8.setBorder(null);
        txtdiligencielosdatosmotivo8.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtdiligencielosdatosmotivo8CaretUpdate(evt);
            }
        });
        txtdiligencielosdatosmotivo8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdiligencielosdatosmotivo8ActionPerformed(evt);
            }
        });
        txtdiligencielosdatosmotivo8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtdiligencielosdatosmotivo8KeyTyped(evt);
            }
        });

        jCheckBox59.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox59.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jCheckBox59.setText("El examinado no recuerda las fechas de inicio y/o de fin de su proceso en la compañía");
        jCheckBox59.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox59ItemStateChanged(evt);
            }
        });

        jLabel21.setBackground(new java.awt.Color(255, 255, 255));
        jLabel21.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/plus-symbol.png"))); // NOI18N
        jLabel21.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel21MouseClicked(evt);
            }
        });

        jLabel80.setBackground(new java.awt.Color(255, 255, 255));
        jLabel80.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel80.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/substract.png"))); // NOI18N
        jLabel80.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel80.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel80MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jCheckBox59))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(diligencielosdatosempresa8)
                        .addGap(16, 16, 16)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(jLabel75, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(91, 91, 91)
                                .addComponent(jLabel76, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(txtdiligencielosdatosempresa8, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(diligencielosdatoslugar8, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtdiligencielosdatoslugar8, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel78, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtdiligencielosdatoscargo8, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel79, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 533, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                        .addComponent(diligencielosdatosmotivo8)
                        .addGap(18, 18, 18)
                        .addComponent(txtdiligencielosdatosmotivo8, javax.swing.GroupLayout.PREFERRED_SIZE, 533, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel77, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(diligencielosdatoscargo8)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(diligencielosdatosferetiro16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(fechaingresoemp8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(fechaingresoemp_a8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(90, 90, 90)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(diligencielosdatossalario8)
                            .addComponent(diligencielosdatosferetiro17))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtdiligencielosdatossalario8, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(fecharetiroemp8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(fecharetiroemp_a8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(diligencielosdatostiempo8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sptiempolaboro8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(diligencielosdatostiempom8)
                        .addGap(82, 82, 82))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(jLabel80)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(diligencielosdatosempresa8)
                                    .addComponent(txtdiligencielosdatosempresa8, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(diligencielosdatoslugar8)
                                    .addComponent(txtdiligencielosdatoslugar8, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, 0)
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel75, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel76, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(20, 20, 20)
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(diligencielosdatoscargo8)
                                    .addComponent(diligencielosdatossalario8)
                                    .addComponent(txtdiligencielosdatoscargo8, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtdiligencielosdatossalario8, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, 0)
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel77, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel78, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(20, 20, 20)
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel10Layout.createSequentialGroup()
                                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(fechaingresoemp_a8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(fechaingresoemp8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(diligencielosdatosferetiro16))
                                            .addComponent(diligencielosdatosferetiro17)
                                            .addComponent(fecharetiroemp8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(fecharetiroemp_a8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(20, 20, 20)
                                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(diligencielosdatosmotivo8)
                                            .addComponent(txtdiligencielosdatosmotivo8, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, 0)
                                        .addComponent(jLabel79, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(diligencielosdatostiempo8)
                                        .addComponent(sptiempolaboro8, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(diligencielosdatostiempom8))))
                            .addComponent(jLabel80, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addComponent(jCheckBox59, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
        );

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));

        diligencielosdatosempresa9.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        diligencielosdatosempresa9.setText("Empresa:");

        jLabel81.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        diligencielosdatoslugar9.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        diligencielosdatoslugar9.setText("Lugar:");

        jLabel82.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel83.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel84.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        diligencielosdatossalario9.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        diligencielosdatossalario9.setText("Salario:");

        diligencielosdatoscargo9.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        diligencielosdatoscargo9.setText("Cargo:");

        txtdiligencielosdatoscargo9.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtdiligencielosdatoscargo9.setBorder(null);
        txtdiligencielosdatoscargo9.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtdiligencielosdatoscargo9CaretUpdate(evt);
            }
        });
        txtdiligencielosdatoscargo9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtdiligencielosdatoscargo9KeyTyped(evt);
            }
        });

        txtdiligencielosdatosempresa9.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtdiligencielosdatosempresa9.setBorder(null);
        txtdiligencielosdatosempresa9.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtdiligencielosdatosempresa9CaretUpdate(evt);
            }
        });
        txtdiligencielosdatosempresa9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtdiligencielosdatosempresa9KeyTyped(evt);
            }
        });

        txtdiligencielosdatoslugar9.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtdiligencielosdatoslugar9.setBorder(null);
        txtdiligencielosdatoslugar9.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtdiligencielosdatoslugar9CaretUpdate(evt);
            }
        });
        txtdiligencielosdatoslugar9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtdiligencielosdatoslugar9KeyTyped(evt);
            }
        });

        txtdiligencielosdatossalario9.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtdiligencielosdatossalario9.setBorder(null);
        txtdiligencielosdatossalario9.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtdiligencielosdatossalario9CaretUpdate(evt);
            }
        });
        txtdiligencielosdatossalario9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtdiligencielosdatossalario9KeyTyped(evt);
            }
        });

        diligencielosdatosferetiro18.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        diligencielosdatosferetiro18.setText("Fecha ingreso:");

        fechaingresoemp9.setMonth(0);
        fechaingresoemp9.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                fechaingresoemp9PropertyChange(evt);
            }
        });

        fechaingresoemp_a9.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                fechaingresoemp_a9PropertyChange(evt);
            }
        });

        diligencielosdatostiempo9.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        diligencielosdatostiempo9.setText("Laboró por");

        sptiempolaboro9.setFont(new java.awt.Font("Segoe UI Emoji", 0, 13)); // NOI18N
        sptiempolaboro9.setBorder(null);
        sptiempolaboro9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                sptiempolaboro9KeyTyped(evt);
            }
        });

        diligencielosdatostiempom9.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        diligencielosdatostiempom9.setText("mese(s)");

        diligencielosdatosferetiro19.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        diligencielosdatosferetiro19.setText("Fecha retiro:");

        diligencielosdatosmotivo9.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        diligencielosdatosmotivo9.setText("Motivo de retiro:");

        fecharetiroemp9.setMonth(0);
        fecharetiroemp9.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                fecharetiroemp9PropertyChange(evt);
            }
        });

        fecharetiroemp_a9.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                fecharetiroemp_a9PropertyChange(evt);
            }
        });

        jLabel85.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtdiligencielosdatosmotivo9.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtdiligencielosdatosmotivo9.setBorder(null);
        txtdiligencielosdatosmotivo9.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtdiligencielosdatosmotivo9CaretUpdate(evt);
            }
        });
        txtdiligencielosdatosmotivo9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdiligencielosdatosmotivo9ActionPerformed(evt);
            }
        });
        txtdiligencielosdatosmotivo9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtdiligencielosdatosmotivo9KeyTyped(evt);
            }
        });

        jCheckBox60.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox60.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jCheckBox60.setText("El examinado no recuerda las fechas de inicio y/o de fin de su proceso en la compañía");
        jCheckBox60.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox60ItemStateChanged(evt);
            }
        });

        jLabel22.setBackground(new java.awt.Color(255, 255, 255));
        jLabel22.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/plus-symbol.png"))); // NOI18N
        jLabel22.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel22MouseClicked(evt);
            }
        });

        jLabel86.setBackground(new java.awt.Color(255, 255, 255));
        jLabel86.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel86.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/substract.png"))); // NOI18N
        jLabel86.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel86.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel86MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jCheckBox60))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(diligencielosdatosempresa9)
                        .addGap(16, 16, 16)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addComponent(jLabel81, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(91, 91, 91)
                                .addComponent(jLabel82, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addComponent(txtdiligencielosdatosempresa9, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(diligencielosdatoslugar9, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtdiligencielosdatoslugar9, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel84, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtdiligencielosdatoscargo9, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel85, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 533, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                        .addComponent(diligencielosdatosmotivo9)
                        .addGap(18, 18, 18)
                        .addComponent(txtdiligencielosdatosmotivo9, javax.swing.GroupLayout.PREFERRED_SIZE, 533, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel83, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(diligencielosdatoscargo9)
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addComponent(diligencielosdatosferetiro18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(fechaingresoemp9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(fechaingresoemp_a9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(90, 90, 90)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(diligencielosdatossalario9)
                            .addComponent(diligencielosdatosferetiro19))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtdiligencielosdatossalario9, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addComponent(fecharetiroemp9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(fecharetiroemp_a9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(diligencielosdatostiempo9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sptiempolaboro9, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(diligencielosdatostiempom9)
                        .addGap(82, 82, 82))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(jLabel86)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(diligencielosdatosempresa9)
                                    .addComponent(txtdiligencielosdatosempresa9, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(diligencielosdatoslugar9)
                                    .addComponent(txtdiligencielosdatoslugar9, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, 0)
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel81, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel82, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(20, 20, 20)
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(diligencielosdatoscargo9)
                                    .addComponent(diligencielosdatossalario9)
                                    .addComponent(txtdiligencielosdatoscargo9, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtdiligencielosdatossalario9, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, 0)
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel83, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel84, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(20, 20, 20)
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel11Layout.createSequentialGroup()
                                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(fechaingresoemp_a9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(fechaingresoemp9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(diligencielosdatosferetiro18))
                                            .addComponent(diligencielosdatosferetiro19)
                                            .addComponent(fecharetiroemp9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(fecharetiroemp_a9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(20, 20, 20)
                                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(diligencielosdatosmotivo9)
                                            .addComponent(txtdiligencielosdatosmotivo9, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, 0)
                                        .addComponent(jLabel85, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(diligencielosdatostiempo9)
                                        .addComponent(sptiempolaboro9, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(diligencielosdatostiempom9))))
                            .addComponent(jLabel86, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addComponent(jCheckBox60, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
        );

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));

        diligencielosdatosempresa10.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        diligencielosdatosempresa10.setText("Empresa:");

        jLabel87.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        diligencielosdatoslugar10.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        diligencielosdatoslugar10.setText("Lugar:");

        jLabel88.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel89.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel90.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        diligencielosdatossalario10.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        diligencielosdatossalario10.setText("Salario:");

        diligencielosdatoscargo10.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        diligencielosdatoscargo10.setText("Cargo:");

        txtdiligencielosdatoscargo10.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtdiligencielosdatoscargo10.setBorder(null);
        txtdiligencielosdatoscargo10.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtdiligencielosdatoscargo10CaretUpdate(evt);
            }
        });
        txtdiligencielosdatoscargo10.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtdiligencielosdatoscargo10KeyTyped(evt);
            }
        });

        txtdiligencielosdatosempresa10.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtdiligencielosdatosempresa10.setBorder(null);
        txtdiligencielosdatosempresa10.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtdiligencielosdatosempresa10CaretUpdate(evt);
            }
        });
        txtdiligencielosdatosempresa10.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtdiligencielosdatosempresa10KeyTyped(evt);
            }
        });

        txtdiligencielosdatoslugar10.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtdiligencielosdatoslugar10.setBorder(null);
        txtdiligencielosdatoslugar10.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtdiligencielosdatoslugar10CaretUpdate(evt);
            }
        });
        txtdiligencielosdatoslugar10.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtdiligencielosdatoslugar10KeyTyped(evt);
            }
        });

        txtdiligencielosdatossalario10.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtdiligencielosdatossalario10.setBorder(null);
        txtdiligencielosdatossalario10.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtdiligencielosdatossalario10CaretUpdate(evt);
            }
        });
        txtdiligencielosdatossalario10.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtdiligencielosdatossalario10KeyTyped(evt);
            }
        });

        diligencielosdatosferetiro20.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        diligencielosdatosferetiro20.setText("Fecha ingreso:");

        fechaingresoemp10.setMonth(0);
        fechaingresoemp10.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                fechaingresoemp10PropertyChange(evt);
            }
        });

        fechaingresoemp_a10.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                fechaingresoemp_a10PropertyChange(evt);
            }
        });

        diligencielosdatostiempo10.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        diligencielosdatostiempo10.setText("Laboró por");

        sptiempolaboro10.setFont(new java.awt.Font("Segoe UI Emoji", 0, 13)); // NOI18N
        sptiempolaboro10.setBorder(null);
        sptiempolaboro10.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                sptiempolaboro10KeyTyped(evt);
            }
        });

        diligencielosdatostiempom10.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        diligencielosdatostiempom10.setText("mese(s)");

        diligencielosdatosferetiro21.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        diligencielosdatosferetiro21.setText("Fecha retiro:");

        diligencielosdatosmotivo10.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        diligencielosdatosmotivo10.setText("Motivo de retiro:");

        fecharetiroemp10.setMonth(0);
        fecharetiroemp10.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                fecharetiroemp10PropertyChange(evt);
            }
        });

        fecharetiroemp_a10.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                fecharetiroemp_a10PropertyChange(evt);
            }
        });

        jLabel91.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtdiligencielosdatosmotivo10.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtdiligencielosdatosmotivo10.setBorder(null);
        txtdiligencielosdatosmotivo10.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtdiligencielosdatosmotivo10CaretUpdate(evt);
            }
        });
        txtdiligencielosdatosmotivo10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdiligencielosdatosmotivo10ActionPerformed(evt);
            }
        });
        txtdiligencielosdatosmotivo10.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtdiligencielosdatosmotivo10KeyTyped(evt);
            }
        });

        jCheckBox61.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox61.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jCheckBox61.setText("El examinado no recuerda las fechas de inicio y/o de fin de su proceso en la compañía");
        jCheckBox61.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox61ItemStateChanged(evt);
            }
        });

        jLabel23.setBackground(new java.awt.Color(255, 255, 255));
        jLabel23.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/plus-symbol.png"))); // NOI18N
        jLabel23.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel23MouseClicked(evt);
            }
        });

        jLabel92.setBackground(new java.awt.Color(255, 255, 255));
        jLabel92.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel92.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/substract.png"))); // NOI18N
        jLabel92.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel92.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel92MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jCheckBox61))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(diligencielosdatosempresa10)
                        .addGap(16, 16, 16)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addComponent(jLabel87, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(91, 91, 91)
                                .addComponent(jLabel88, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addComponent(txtdiligencielosdatosempresa10, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(diligencielosdatoslugar10, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtdiligencielosdatoslugar10, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel90, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtdiligencielosdatoscargo10, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel91, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 533, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                        .addComponent(diligencielosdatosmotivo10)
                        .addGap(18, 18, 18)
                        .addComponent(txtdiligencielosdatosmotivo10, javax.swing.GroupLayout.PREFERRED_SIZE, 533, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel89, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(diligencielosdatoscargo10)
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addComponent(diligencielosdatosferetiro20)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(fechaingresoemp10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(fechaingresoemp_a10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(90, 90, 90)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(diligencielosdatossalario10)
                            .addComponent(diligencielosdatosferetiro21))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtdiligencielosdatossalario10, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addComponent(fecharetiroemp10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(fecharetiroemp_a10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(18, 18, 18)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(diligencielosdatostiempo10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sptiempolaboro10, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(diligencielosdatostiempom10)
                        .addGap(82, 82, 82))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                        .addComponent(jLabel23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(jLabel92)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(diligencielosdatosempresa10)
                                    .addComponent(txtdiligencielosdatosempresa10, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(diligencielosdatoslugar10)
                                    .addComponent(txtdiligencielosdatoslugar10, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, 0)
                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel87, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel88, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(20, 20, 20)
                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(diligencielosdatoscargo10)
                                    .addComponent(diligencielosdatossalario10)
                                    .addComponent(txtdiligencielosdatoscargo10, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtdiligencielosdatossalario10, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, 0)
                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel89, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel90, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(20, 20, 20)
                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel12Layout.createSequentialGroup()
                                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(fechaingresoemp_a10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(fechaingresoemp10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(diligencielosdatosferetiro20))
                                            .addComponent(diligencielosdatosferetiro21)
                                            .addComponent(fecharetiroemp10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(fecharetiroemp_a10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(20, 20, 20)
                                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(diligencielosdatosmotivo10)
                                            .addComponent(txtdiligencielosdatosmotivo10, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, 0)
                                        .addComponent(jLabel91, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(diligencielosdatostiempo10)
                                        .addComponent(sptiempolaboro10, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(diligencielosdatostiempom10))))
                            .addComponent(jLabel92, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addComponent(jCheckBox61, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
        );

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));

        diligencielosdatosempresa11.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        diligencielosdatosempresa11.setText("Empresa:");

        jLabel93.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        diligencielosdatoslugar11.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        diligencielosdatoslugar11.setText("Lugar:");

        jLabel94.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel95.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel96.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        diligencielosdatossalario11.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        diligencielosdatossalario11.setText("Salario:");

        diligencielosdatoscargo11.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        diligencielosdatoscargo11.setText("Cargo:");

        txtdiligencielosdatoscargo11.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtdiligencielosdatoscargo11.setBorder(null);
        txtdiligencielosdatoscargo11.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtdiligencielosdatoscargo11CaretUpdate(evt);
            }
        });
        txtdiligencielosdatoscargo11.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtdiligencielosdatoscargo11KeyTyped(evt);
            }
        });

        txtdiligencielosdatosempresa11.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtdiligencielosdatosempresa11.setBorder(null);
        txtdiligencielosdatosempresa11.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtdiligencielosdatosempresa11CaretUpdate(evt);
            }
        });
        txtdiligencielosdatosempresa11.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtdiligencielosdatosempresa11KeyTyped(evt);
            }
        });

        txtdiligencielosdatoslugar11.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtdiligencielosdatoslugar11.setBorder(null);
        txtdiligencielosdatoslugar11.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtdiligencielosdatoslugar11CaretUpdate(evt);
            }
        });
        txtdiligencielosdatoslugar11.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtdiligencielosdatoslugar11KeyTyped(evt);
            }
        });

        txtdiligencielosdatossalario11.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtdiligencielosdatossalario11.setBorder(null);
        txtdiligencielosdatossalario11.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtdiligencielosdatossalario11CaretUpdate(evt);
            }
        });
        txtdiligencielosdatossalario11.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtdiligencielosdatossalario11KeyTyped(evt);
            }
        });

        diligencielosdatosferetiro22.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        diligencielosdatosferetiro22.setText("Fecha ingreso:");

        fechaingresoemp11.setMonth(0);
        fechaingresoemp11.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                fechaingresoemp11PropertyChange(evt);
            }
        });

        fechaingresoemp_a11.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                fechaingresoemp_a11PropertyChange(evt);
            }
        });

        diligencielosdatostiempo11.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        diligencielosdatostiempo11.setText("Laboró por");

        sptiempolaboro11.setFont(new java.awt.Font("Segoe UI Emoji", 0, 13)); // NOI18N
        sptiempolaboro11.setBorder(null);
        sptiempolaboro11.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                sptiempolaboro11KeyTyped(evt);
            }
        });

        diligencielosdatostiempom11.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        diligencielosdatostiempom11.setText("mese(s)");

        diligencielosdatosferetiro23.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        diligencielosdatosferetiro23.setText("Fecha retiro:");

        diligencielosdatosmotivo11.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        diligencielosdatosmotivo11.setText("Motivo de retiro:");

        fecharetiroemp11.setMonth(0);
        fecharetiroemp11.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                fecharetiroemp11PropertyChange(evt);
            }
        });

        fecharetiroemp_a11.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                fecharetiroemp_a11PropertyChange(evt);
            }
        });

        jLabel97.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtdiligencielosdatosmotivo11.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtdiligencielosdatosmotivo11.setBorder(null);
        txtdiligencielosdatosmotivo11.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtdiligencielosdatosmotivo11CaretUpdate(evt);
            }
        });
        txtdiligencielosdatosmotivo11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdiligencielosdatosmotivo11ActionPerformed(evt);
            }
        });
        txtdiligencielosdatosmotivo11.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtdiligencielosdatosmotivo11KeyTyped(evt);
            }
        });

        jCheckBox62.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox62.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jCheckBox62.setText("El examinado no recuerda las fechas de inicio y/o de fin de su proceso en la compañía");
        jCheckBox62.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox62ItemStateChanged(evt);
            }
        });

        jLabel24.setBackground(new java.awt.Color(255, 255, 255));
        jLabel24.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/plus-symbol.png"))); // NOI18N
        jLabel24.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel24MouseClicked(evt);
            }
        });

        jLabel98.setBackground(new java.awt.Color(255, 255, 255));
        jLabel98.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel98.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/substract.png"))); // NOI18N
        jLabel98.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel98.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel98MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jCheckBox62))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(diligencielosdatosempresa11)
                        .addGap(16, 16, 16)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addComponent(jLabel93, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(91, 91, 91)
                                .addComponent(jLabel94, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addComponent(txtdiligencielosdatosempresa11, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(diligencielosdatoslugar11, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtdiligencielosdatoslugar11, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel96, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtdiligencielosdatoscargo11, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel97, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 533, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                        .addComponent(diligencielosdatosmotivo11)
                        .addGap(18, 18, 18)
                        .addComponent(txtdiligencielosdatosmotivo11, javax.swing.GroupLayout.PREFERRED_SIZE, 533, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel95, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(diligencielosdatoscargo11)
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addComponent(diligencielosdatosferetiro22)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(fechaingresoemp11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(fechaingresoemp_a11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(90, 90, 90)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(diligencielosdatossalario11)
                            .addComponent(diligencielosdatosferetiro23))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtdiligencielosdatossalario11, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addComponent(fecharetiroemp11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(fecharetiroemp_a11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(18, 18, 18)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(diligencielosdatostiempo11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sptiempolaboro11, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(diligencielosdatostiempom11)
                        .addGap(82, 82, 82))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                        .addComponent(jLabel24)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(jLabel98)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(diligencielosdatosempresa11)
                                    .addComponent(txtdiligencielosdatosempresa11, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(diligencielosdatoslugar11)
                                    .addComponent(txtdiligencielosdatoslugar11, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, 0)
                                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel93, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel94, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(20, 20, 20)
                                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(diligencielosdatoscargo11)
                                    .addComponent(diligencielosdatossalario11)
                                    .addComponent(txtdiligencielosdatoscargo11, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtdiligencielosdatossalario11, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, 0)
                                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel95, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel96, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(20, 20, 20)
                                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel13Layout.createSequentialGroup()
                                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(fechaingresoemp_a11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(fechaingresoemp11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(diligencielosdatosferetiro22))
                                            .addComponent(diligencielosdatosferetiro23)
                                            .addComponent(fecharetiroemp11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(fecharetiroemp_a11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(20, 20, 20)
                                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(diligencielosdatosmotivo11)
                                            .addComponent(txtdiligencielosdatosmotivo11, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, 0)
                                        .addComponent(jLabel97, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(diligencielosdatostiempo11)
                                        .addComponent(sptiempolaboro11, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(diligencielosdatostiempom11))))
                            .addComponent(jLabel98, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addComponent(jCheckBox62, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
        );

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));

        diligencielosdatosempresa12.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        diligencielosdatosempresa12.setText("Empresa:");

        jLabel99.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        diligencielosdatoslugar12.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        diligencielosdatoslugar12.setText("Lugar:");

        jLabel100.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel101.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel102.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        diligencielosdatossalario12.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        diligencielosdatossalario12.setText("Salario:");

        diligencielosdatoscargo12.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        diligencielosdatoscargo12.setText("Cargo:");

        txtdiligencielosdatoscargo12.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtdiligencielosdatoscargo12.setBorder(null);
        txtdiligencielosdatoscargo12.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtdiligencielosdatoscargo12CaretUpdate(evt);
            }
        });
        txtdiligencielosdatoscargo12.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtdiligencielosdatoscargo12KeyTyped(evt);
            }
        });

        txtdiligencielosdatosempresa12.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtdiligencielosdatosempresa12.setBorder(null);
        txtdiligencielosdatosempresa12.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtdiligencielosdatosempresa12CaretUpdate(evt);
            }
        });
        txtdiligencielosdatosempresa12.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtdiligencielosdatosempresa12KeyTyped(evt);
            }
        });

        txtdiligencielosdatoslugar12.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtdiligencielosdatoslugar12.setBorder(null);
        txtdiligencielosdatoslugar12.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtdiligencielosdatoslugar12CaretUpdate(evt);
            }
        });
        txtdiligencielosdatoslugar12.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtdiligencielosdatoslugar12KeyTyped(evt);
            }
        });

        txtdiligencielosdatossalario12.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtdiligencielosdatossalario12.setBorder(null);
        txtdiligencielosdatossalario12.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtdiligencielosdatossalario12CaretUpdate(evt);
            }
        });
        txtdiligencielosdatossalario12.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtdiligencielosdatossalario12KeyTyped(evt);
            }
        });

        diligencielosdatosferetiro24.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        diligencielosdatosferetiro24.setText("Fecha ingreso:");

        fechaingresoemp12.setMonth(0);
        fechaingresoemp12.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                fechaingresoemp12PropertyChange(evt);
            }
        });

        fechaingresoemp_a12.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                fechaingresoemp_a12PropertyChange(evt);
            }
        });

        diligencielosdatostiempo12.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        diligencielosdatostiempo12.setText("Laboró por");

        sptiempolaboro12.setFont(new java.awt.Font("Segoe UI Emoji", 0, 13)); // NOI18N
        sptiempolaboro12.setBorder(null);
        sptiempolaboro12.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                sptiempolaboro12KeyTyped(evt);
            }
        });

        diligencielosdatostiempom12.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        diligencielosdatostiempom12.setText("mese(s)");

        diligencielosdatosferetiro25.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        diligencielosdatosferetiro25.setText("Fecha retiro:");

        diligencielosdatosmotivo12.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        diligencielosdatosmotivo12.setText("Motivo de retiro:");

        fecharetiroemp12.setMonth(0);
        fecharetiroemp12.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                fecharetiroemp12PropertyChange(evt);
            }
        });

        fecharetiroemp_a12.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                fecharetiroemp_a12PropertyChange(evt);
            }
        });

        jLabel103.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtdiligencielosdatosmotivo12.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtdiligencielosdatosmotivo12.setBorder(null);
        txtdiligencielosdatosmotivo12.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtdiligencielosdatosmotivo12CaretUpdate(evt);
            }
        });
        txtdiligencielosdatosmotivo12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdiligencielosdatosmotivo12ActionPerformed(evt);
            }
        });
        txtdiligencielosdatosmotivo12.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtdiligencielosdatosmotivo12KeyTyped(evt);
            }
        });

        jCheckBox63.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox63.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jCheckBox63.setText("El examinado no recuerda las fechas de inicio y/o de fin de su proceso en la compañía");
        jCheckBox63.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox63ItemStateChanged(evt);
            }
        });

        jLabel25.setBackground(new java.awt.Color(255, 255, 255));
        jLabel25.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/plus-symbol.png"))); // NOI18N
        jLabel25.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel25MouseClicked(evt);
            }
        });

        jLabel108.setBackground(new java.awt.Color(255, 255, 255));
        jLabel108.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel108.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/substract.png"))); // NOI18N
        jLabel108.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel108.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel108MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jCheckBox63))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(diligencielosdatosempresa12)
                        .addGap(16, 16, 16)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel14Layout.createSequentialGroup()
                                .addComponent(jLabel99, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(91, 91, 91)
                                .addComponent(jLabel100, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel14Layout.createSequentialGroup()
                                .addComponent(txtdiligencielosdatosempresa12, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(diligencielosdatoslugar12, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtdiligencielosdatoslugar12, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel102, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtdiligencielosdatoscargo12, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel103, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 533, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                        .addComponent(diligencielosdatosmotivo12)
                        .addGap(18, 18, 18)
                        .addComponent(txtdiligencielosdatosmotivo12, javax.swing.GroupLayout.PREFERRED_SIZE, 533, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel101, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(diligencielosdatoscargo12)
                            .addGroup(jPanel14Layout.createSequentialGroup()
                                .addComponent(diligencielosdatosferetiro24)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(fechaingresoemp12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(fechaingresoemp_a12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(90, 90, 90)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(diligencielosdatossalario12)
                            .addComponent(diligencielosdatosferetiro25))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtdiligencielosdatossalario12, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel14Layout.createSequentialGroup()
                                .addComponent(fecharetiroemp12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(fecharetiroemp_a12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(18, 18, 18)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(diligencielosdatostiempo12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sptiempolaboro12, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(diligencielosdatostiempom12)
                        .addGap(82, 82, 82))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                        .addComponent(jLabel25)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(jLabel108)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel14Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(diligencielosdatosempresa12)
                                    .addComponent(txtdiligencielosdatosempresa12, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(diligencielosdatoslugar12)
                                    .addComponent(txtdiligencielosdatoslugar12, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, 0)
                                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel99, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel100, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(20, 20, 20)
                                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(diligencielosdatoscargo12)
                                    .addComponent(diligencielosdatossalario12)
                                    .addComponent(txtdiligencielosdatoscargo12, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtdiligencielosdatossalario12, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, 0)
                                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel101, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel102, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(20, 20, 20)
                                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel14Layout.createSequentialGroup()
                                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(fechaingresoemp_a12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(fechaingresoemp12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(diligencielosdatosferetiro24))
                                            .addComponent(diligencielosdatosferetiro25)
                                            .addComponent(fecharetiroemp12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(fecharetiroemp_a12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(20, 20, 20)
                                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(diligencielosdatosmotivo12)
                                            .addComponent(txtdiligencielosdatosmotivo12, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, 0)
                                        .addComponent(jLabel103, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(diligencielosdatostiempo12)
                                        .addComponent(sptiempolaboro12, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(diligencielosdatostiempom12))))
                            .addComponent(jLabel108, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addComponent(jCheckBox63, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
        );

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));

        diligencielosdatosempresa13.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        diligencielosdatosempresa13.setText("Empresa:");

        jLabel115.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        diligencielosdatoslugar13.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        diligencielosdatoslugar13.setText("Lugar:");

        jLabel116.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel117.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel118.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        diligencielosdatossalario13.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        diligencielosdatossalario13.setText("Salario:");

        diligencielosdatoscargo13.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        diligencielosdatoscargo13.setText("Cargo:");

        txtdiligencielosdatoscargo13.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtdiligencielosdatoscargo13.setBorder(null);
        txtdiligencielosdatoscargo13.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtdiligencielosdatoscargo13CaretUpdate(evt);
            }
        });
        txtdiligencielosdatoscargo13.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtdiligencielosdatoscargo13KeyTyped(evt);
            }
        });

        txtdiligencielosdatosempresa13.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtdiligencielosdatosempresa13.setBorder(null);
        txtdiligencielosdatosempresa13.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtdiligencielosdatosempresa13CaretUpdate(evt);
            }
        });
        txtdiligencielosdatosempresa13.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtdiligencielosdatosempresa13KeyTyped(evt);
            }
        });

        txtdiligencielosdatoslugar13.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtdiligencielosdatoslugar13.setBorder(null);
        txtdiligencielosdatoslugar13.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtdiligencielosdatoslugar13CaretUpdate(evt);
            }
        });
        txtdiligencielosdatoslugar13.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtdiligencielosdatoslugar13KeyTyped(evt);
            }
        });

        txtdiligencielosdatossalario13.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtdiligencielosdatossalario13.setBorder(null);
        txtdiligencielosdatossalario13.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtdiligencielosdatossalario13CaretUpdate(evt);
            }
        });
        txtdiligencielosdatossalario13.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtdiligencielosdatossalario13KeyTyped(evt);
            }
        });

        diligencielosdatosferetiro26.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        diligencielosdatosferetiro26.setText("Fecha ingreso:");

        fechaingresoemp13.setMonth(0);
        fechaingresoemp13.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                fechaingresoemp13PropertyChange(evt);
            }
        });

        fechaingresoemp_a13.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                fechaingresoemp_a13PropertyChange(evt);
            }
        });

        diligencielosdatostiempo13.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        diligencielosdatostiempo13.setText("Laboró por");

        sptiempolaboro13.setFont(new java.awt.Font("Segoe UI Emoji", 0, 13)); // NOI18N
        sptiempolaboro13.setBorder(null);
        sptiempolaboro13.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                sptiempolaboro13KeyTyped(evt);
            }
        });

        diligencielosdatostiempom13.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        diligencielosdatostiempom13.setText("mese(s)");

        diligencielosdatosferetiro27.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        diligencielosdatosferetiro27.setText("Fecha retiro:");

        diligencielosdatosmotivo13.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        diligencielosdatosmotivo13.setText("Motivo de retiro:");

        fecharetiroemp13.setMonth(0);
        fecharetiroemp13.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                fecharetiroemp13PropertyChange(evt);
            }
        });

        fecharetiroemp_a13.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                fecharetiroemp_a13PropertyChange(evt);
            }
        });

        jLabel119.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtdiligencielosdatosmotivo13.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtdiligencielosdatosmotivo13.setBorder(null);
        txtdiligencielosdatosmotivo13.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtdiligencielosdatosmotivo13CaretUpdate(evt);
            }
        });
        txtdiligencielosdatosmotivo13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdiligencielosdatosmotivo13ActionPerformed(evt);
            }
        });
        txtdiligencielosdatosmotivo13.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtdiligencielosdatosmotivo13KeyTyped(evt);
            }
        });

        jCheckBox64.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox64.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jCheckBox64.setText("El examinado no recuerda las fechas de inicio y/o de fin de su proceso en la compañía");
        jCheckBox64.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox64ItemStateChanged(evt);
            }
        });

        jLabel26.setBackground(new java.awt.Color(255, 255, 255));
        jLabel26.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/plus-symbol.png"))); // NOI18N
        jLabel26.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel26MouseClicked(evt);
            }
        });

        jLabel120.setBackground(new java.awt.Color(255, 255, 255));
        jLabel120.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel120.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/substract.png"))); // NOI18N
        jLabel120.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel120.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel120MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jCheckBox64))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(diligencielosdatosempresa13)
                        .addGap(16, 16, 16)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel15Layout.createSequentialGroup()
                                .addComponent(jLabel115, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(91, 91, 91)
                                .addComponent(jLabel116, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel15Layout.createSequentialGroup()
                                .addComponent(txtdiligencielosdatosempresa13, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(diligencielosdatoslugar13, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtdiligencielosdatoslugar13, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel118, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtdiligencielosdatoscargo13, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel119, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 533, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                        .addComponent(diligencielosdatosmotivo13)
                        .addGap(18, 18, 18)
                        .addComponent(txtdiligencielosdatosmotivo13, javax.swing.GroupLayout.PREFERRED_SIZE, 533, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel117, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(diligencielosdatoscargo13)
                            .addGroup(jPanel15Layout.createSequentialGroup()
                                .addComponent(diligencielosdatosferetiro26)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(fechaingresoemp13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(fechaingresoemp_a13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(90, 90, 90)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(diligencielosdatossalario13)
                            .addComponent(diligencielosdatosferetiro27))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtdiligencielosdatossalario13, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel15Layout.createSequentialGroup()
                                .addComponent(fecharetiroemp13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(fecharetiroemp_a13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(18, 18, 18)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(diligencielosdatostiempo13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sptiempolaboro13, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(diligencielosdatostiempom13)
                        .addGap(82, 82, 82))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                        .addComponent(jLabel26)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(jLabel120)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel15Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(diligencielosdatosempresa13)
                                    .addComponent(txtdiligencielosdatosempresa13, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(diligencielosdatoslugar13)
                                    .addComponent(txtdiligencielosdatoslugar13, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, 0)
                                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel115, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel116, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(20, 20, 20)
                                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(diligencielosdatoscargo13)
                                    .addComponent(diligencielosdatossalario13)
                                    .addComponent(txtdiligencielosdatoscargo13, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtdiligencielosdatossalario13, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, 0)
                                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel117, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel118, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(20, 20, 20)
                                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel15Layout.createSequentialGroup()
                                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(fechaingresoemp_a13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(fechaingresoemp13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(diligencielosdatosferetiro26))
                                            .addComponent(diligencielosdatosferetiro27)
                                            .addComponent(fecharetiroemp13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(fecharetiroemp_a13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(20, 20, 20)
                                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(diligencielosdatosmotivo13)
                                            .addComponent(txtdiligencielosdatosmotivo13, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, 0)
                                        .addComponent(jLabel119, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(diligencielosdatostiempo13)
                                        .addComponent(sptiempolaboro13, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(diligencielosdatostiempom13))))
                            .addComponent(jLabel120, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addComponent(jCheckBox64, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
        );

        jPanel16.setBackground(new java.awt.Color(255, 255, 255));

        diligencielosdatosempresa14.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        diligencielosdatosempresa14.setText("Empresa:");

        jLabel121.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        diligencielosdatoslugar14.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        diligencielosdatoslugar14.setText("Lugar:");

        jLabel122.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel123.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel124.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        diligencielosdatossalario14.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        diligencielosdatossalario14.setText("Salario:");

        diligencielosdatoscargo14.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        diligencielosdatoscargo14.setText("Cargo:");

        txtdiligencielosdatoscargo14.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtdiligencielosdatoscargo14.setBorder(null);
        txtdiligencielosdatoscargo14.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtdiligencielosdatoscargo14CaretUpdate(evt);
            }
        });
        txtdiligencielosdatoscargo14.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtdiligencielosdatoscargo14KeyTyped(evt);
            }
        });

        txtdiligencielosdatosempresa14.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtdiligencielosdatosempresa14.setBorder(null);
        txtdiligencielosdatosempresa14.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtdiligencielosdatosempresa14CaretUpdate(evt);
            }
        });
        txtdiligencielosdatosempresa14.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtdiligencielosdatosempresa14KeyTyped(evt);
            }
        });

        txtdiligencielosdatoslugar14.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtdiligencielosdatoslugar14.setBorder(null);
        txtdiligencielosdatoslugar14.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtdiligencielosdatoslugar14CaretUpdate(evt);
            }
        });
        txtdiligencielosdatoslugar14.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtdiligencielosdatoslugar14KeyTyped(evt);
            }
        });

        txtdiligencielosdatossalario14.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtdiligencielosdatossalario14.setBorder(null);
        txtdiligencielosdatossalario14.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtdiligencielosdatossalario14CaretUpdate(evt);
            }
        });
        txtdiligencielosdatossalario14.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtdiligencielosdatossalario14KeyTyped(evt);
            }
        });

        diligencielosdatosferetiro28.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        diligencielosdatosferetiro28.setText("Fecha ingreso:");

        fechaingresoemp14.setMonth(0);
        fechaingresoemp14.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                fechaingresoemp14PropertyChange(evt);
            }
        });

        fechaingresoemp_a14.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                fechaingresoemp_a14PropertyChange(evt);
            }
        });

        diligencielosdatostiempo14.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        diligencielosdatostiempo14.setText("Laboró por");

        sptiempolaboro14.setFont(new java.awt.Font("Segoe UI Emoji", 0, 13)); // NOI18N
        sptiempolaboro14.setBorder(null);
        sptiempolaboro14.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                sptiempolaboro14KeyTyped(evt);
            }
        });

        diligencielosdatostiempom14.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        diligencielosdatostiempom14.setText("mese(s)");

        diligencielosdatosferetiro29.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        diligencielosdatosferetiro29.setText("Fecha retiro:");

        diligencielosdatosmotivo14.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        diligencielosdatosmotivo14.setText("Motivo de retiro:");

        fecharetiroemp14.setMonth(0);
        fecharetiroemp14.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                fecharetiroemp14PropertyChange(evt);
            }
        });

        fecharetiroemp_a14.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                fecharetiroemp_a14PropertyChange(evt);
            }
        });

        jLabel125.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtdiligencielosdatosmotivo14.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtdiligencielosdatosmotivo14.setBorder(null);
        txtdiligencielosdatosmotivo14.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtdiligencielosdatosmotivo14CaretUpdate(evt);
            }
        });
        txtdiligencielosdatosmotivo14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdiligencielosdatosmotivo14ActionPerformed(evt);
            }
        });
        txtdiligencielosdatosmotivo14.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtdiligencielosdatosmotivo14KeyTyped(evt);
            }
        });

        jCheckBox65.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox65.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jCheckBox65.setText("El examinado no recuerda las fechas de inicio y/o de fin de su proceso en la compañía");
        jCheckBox65.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox65ItemStateChanged(evt);
            }
        });

        jLabel126.setBackground(new java.awt.Color(255, 255, 255));
        jLabel126.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        jLabel126.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/plus-symbol.png"))); // NOI18N
        jLabel126.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel126.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel126MouseClicked(evt);
            }
        });

        jLabel127.setBackground(new java.awt.Color(255, 255, 255));
        jLabel127.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel127.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/substract.png"))); // NOI18N
        jLabel127.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel127.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel127MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jCheckBox65))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(diligencielosdatosempresa14)
                        .addGap(16, 16, 16)
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel16Layout.createSequentialGroup()
                                .addComponent(jLabel121, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(91, 91, 91)
                                .addComponent(jLabel122, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel16Layout.createSequentialGroup()
                                .addComponent(txtdiligencielosdatosempresa14, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(diligencielosdatoslugar14, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtdiligencielosdatoslugar14, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel124, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtdiligencielosdatoscargo14, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel125, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 533, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                        .addComponent(diligencielosdatosmotivo14)
                        .addGap(18, 18, 18)
                        .addComponent(txtdiligencielosdatosmotivo14, javax.swing.GroupLayout.PREFERRED_SIZE, 533, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel123, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(diligencielosdatoscargo14)
                            .addGroup(jPanel16Layout.createSequentialGroup()
                                .addComponent(diligencielosdatosferetiro28)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(fechaingresoemp14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(fechaingresoemp_a14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(90, 90, 90)
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(diligencielosdatossalario14)
                            .addComponent(diligencielosdatosferetiro29))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtdiligencielosdatossalario14, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel16Layout.createSequentialGroup()
                                .addComponent(fecharetiroemp14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(fecharetiroemp_a14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(18, 18, 18)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(diligencielosdatostiempo14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sptiempolaboro14, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(diligencielosdatostiempom14)
                        .addGap(82, 82, 82))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                        .addComponent(jLabel126)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(jLabel127)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel16Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(diligencielosdatosempresa14)
                                    .addComponent(txtdiligencielosdatosempresa14, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(diligencielosdatoslugar14)
                                    .addComponent(txtdiligencielosdatoslugar14, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, 0)
                                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel121, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel122, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(20, 20, 20)
                                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(diligencielosdatoscargo14)
                                    .addComponent(diligencielosdatossalario14)
                                    .addComponent(txtdiligencielosdatoscargo14, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtdiligencielosdatossalario14, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, 0)
                                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel123, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel124, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(20, 20, 20)
                                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel16Layout.createSequentialGroup()
                                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(fechaingresoemp_a14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(fechaingresoemp14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(diligencielosdatosferetiro28))
                                            .addComponent(diligencielosdatosferetiro29)
                                            .addComponent(fecharetiroemp14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(fecharetiroemp_a14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(20, 20, 20)
                                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(diligencielosdatosmotivo14)
                                            .addComponent(txtdiligencielosdatosmotivo14, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, 0)
                                        .addComponent(jLabel125, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(diligencielosdatostiempo14)
                                        .addComponent(sptiempolaboro14, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(diligencielosdatostiempom14))))
                            .addComponent(jLabel127, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addComponent(jCheckBox65, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel126, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
        );

        jPanel17.setBackground(new java.awt.Color(255, 255, 255));

        diligencielosdatosempresa15.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        diligencielosdatosempresa15.setText("Empresa:");

        jLabel128.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        diligencielosdatoslugar15.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        diligencielosdatoslugar15.setText("Lugar:");

        jLabel129.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel130.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel131.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        diligencielosdatossalario15.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        diligencielosdatossalario15.setText("Salario:");

        diligencielosdatoscargo15.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        diligencielosdatoscargo15.setText("Cargo:");

        txtdiligencielosdatoscargo15.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtdiligencielosdatoscargo15.setBorder(null);
        txtdiligencielosdatoscargo15.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtdiligencielosdatoscargo15CaretUpdate(evt);
            }
        });
        txtdiligencielosdatoscargo15.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtdiligencielosdatoscargo15KeyTyped(evt);
            }
        });

        txtdiligencielosdatosempresa15.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtdiligencielosdatosempresa15.setBorder(null);
        txtdiligencielosdatosempresa15.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtdiligencielosdatosempresa15CaretUpdate(evt);
            }
        });
        txtdiligencielosdatosempresa15.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtdiligencielosdatosempresa15KeyTyped(evt);
            }
        });

        txtdiligencielosdatoslugar15.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtdiligencielosdatoslugar15.setBorder(null);
        txtdiligencielosdatoslugar15.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtdiligencielosdatoslugar15CaretUpdate(evt);
            }
        });
        txtdiligencielosdatoslugar15.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtdiligencielosdatoslugar15KeyTyped(evt);
            }
        });

        txtdiligencielosdatossalario15.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtdiligencielosdatossalario15.setBorder(null);
        txtdiligencielosdatossalario15.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtdiligencielosdatossalario15CaretUpdate(evt);
            }
        });
        txtdiligencielosdatossalario15.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtdiligencielosdatossalario15KeyTyped(evt);
            }
        });

        diligencielosdatosferetiro30.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        diligencielosdatosferetiro30.setText("Fecha ingreso:");

        fechaingresoemp15.setMonth(0);
        fechaingresoemp15.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                fechaingresoemp15PropertyChange(evt);
            }
        });

        fechaingresoemp_a15.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                fechaingresoemp_a15PropertyChange(evt);
            }
        });

        diligencielosdatostiempo15.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        diligencielosdatostiempo15.setText("Laboró por");

        sptiempolaboro15.setFont(new java.awt.Font("Segoe UI Emoji", 0, 13)); // NOI18N
        sptiempolaboro15.setBorder(null);
        sptiempolaboro15.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                sptiempolaboro15KeyTyped(evt);
            }
        });

        diligencielosdatostiempom15.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        diligencielosdatostiempom15.setText("mese(s)");

        diligencielosdatosferetiro31.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        diligencielosdatosferetiro31.setText("Fecha retiro:");

        diligencielosdatosmotivo15.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        diligencielosdatosmotivo15.setText("Motivo de retiro:");

        fecharetiroemp15.setMonth(0);
        fecharetiroemp15.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                fecharetiroemp15PropertyChange(evt);
            }
        });

        fecharetiroemp_a15.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                fecharetiroemp_a15PropertyChange(evt);
            }
        });

        jLabel132.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtdiligencielosdatosmotivo15.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtdiligencielosdatosmotivo15.setBorder(null);
        txtdiligencielosdatosmotivo15.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtdiligencielosdatosmotivo15CaretUpdate(evt);
            }
        });
        txtdiligencielosdatosmotivo15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdiligencielosdatosmotivo15ActionPerformed(evt);
            }
        });
        txtdiligencielosdatosmotivo15.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtdiligencielosdatosmotivo15KeyTyped(evt);
            }
        });

        jCheckBox66.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox66.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jCheckBox66.setText("El examinado no recuerda las fechas de inicio y/o de fin de su proceso en la compañía");
        jCheckBox66.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox66ItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jCheckBox66))
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addComponent(diligencielosdatosempresa15)
                        .addGap(16, 16, 16)
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel17Layout.createSequentialGroup()
                                .addComponent(jLabel128, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(91, 91, 91)
                                .addComponent(jLabel129, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel17Layout.createSequentialGroup()
                                .addComponent(txtdiligencielosdatosempresa15, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(diligencielosdatoslugar15, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtdiligencielosdatoslugar15, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel131, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtdiligencielosdatoscargo15, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel132, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 533, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                        .addComponent(diligencielosdatosmotivo15)
                        .addGap(18, 18, 18)
                        .addComponent(txtdiligencielosdatosmotivo15, javax.swing.GroupLayout.PREFERRED_SIZE, 533, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel130, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(diligencielosdatoscargo15)
                            .addGroup(jPanel17Layout.createSequentialGroup()
                                .addComponent(diligencielosdatosferetiro30)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(fechaingresoemp15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(fechaingresoemp_a15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(90, 90, 90)
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(diligencielosdatossalario15)
                            .addComponent(diligencielosdatosferetiro31))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtdiligencielosdatossalario15, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel17Layout.createSequentialGroup()
                                .addComponent(fecharetiroemp15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(fecharetiroemp_a15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(18, 18, 18)
                .addComponent(diligencielosdatostiempo15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sptiempolaboro15, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(diligencielosdatostiempom15)
                .addContainerGap(131, Short.MAX_VALUE))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(diligencielosdatosempresa15)
                    .addComponent(txtdiligencielosdatosempresa15, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(diligencielosdatoslugar15)
                    .addComponent(txtdiligencielosdatoslugar15, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel128, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel129, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(diligencielosdatoscargo15)
                    .addComponent(diligencielosdatossalario15)
                    .addComponent(txtdiligencielosdatoscargo15, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtdiligencielosdatossalario15, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel130, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel131, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(fechaingresoemp_a15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(fechaingresoemp15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(diligencielosdatosferetiro30))
                            .addComponent(diligencielosdatosferetiro31)
                            .addComponent(fecharetiroemp15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fecharetiroemp_a15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(diligencielosdatosmotivo15)
                            .addComponent(txtdiligencielosdatosmotivo15, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, 0)
                        .addComponent(jLabel132, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(diligencielosdatostiempo15)
                        .addComponent(sptiempolaboro15, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(diligencielosdatostiempom15)))
                .addGap(20, 20, 20)
                .addComponent(jCheckBox66, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel186, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(554, 554, 554)
                                .addComponent(jCheckBox30, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckBox29, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel113, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtresphistola5, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel109, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(historlabopre9)
                                    .addGap(436, 436, 436)
                                    .addComponent(jCheckBox49, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jCheckBox50, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(35, 35, 35))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(historlabopre5)
                                    .addGap(84, 84, 84)
                                    .addComponent(jCheckBox41, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jCheckBox42, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jRadioButton23))
                                .addComponent(jLabel110, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtresphistola8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(historlabopre8_1)
                                    .addGap(91, 91, 91)
                                    .addComponent(jCheckBox47, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jCheckBox48, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jRadioButton26, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel111, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtresphistola7, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(historlabopre7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGap(18, 18, 18)
                                            .addComponent(jCheckBox45, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jCheckBox46, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jRadioButton25, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jLabel112, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtresphistola6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(historlabopre6)
                                            .addGap(36, 36, 36)
                                            .addComponent(jCheckBox43, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jCheckBox44, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jRadioButton24, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel114, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtresphistola4, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(jLabel107, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(txtresphistola3, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(txtresphistola2, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(txtresphistola1, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                    .addComponent(diligencielosdatosinacti)
                                                    .addGap(694, 694, 694)
                                                    .addComponent(jRadioButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addComponent(jLabel104, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel105, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel106, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(txtresphistolaantes, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jScrollPane12, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(cometioalgunoantes)
                                                    .addGap(176, 176, 176)
                                                    .addComponent(jCheckBox31, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(jCheckBox32, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(jRadioButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(historlabopre4)
                                                    .addGap(199, 199, 199)
                                                    .addComponent(jCheckBox39, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(jCheckBox40, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(jRadioButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(historlabopre3)
                                                    .addGap(353, 353, 353)
                                                    .addComponent(jCheckBox37, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(jCheckBox38, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(jRadioButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(historlabopre2)
                                                    .addGap(407, 407, 407)
                                                    .addComponent(jCheckBox35, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(jCheckBox36, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(jRadioButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(historlabopre1, javax.swing.GroupLayout.PREFERRED_SIZE, 586, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(184, 184, 184)
                                                    .addComponent(jCheckBox33, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(jCheckBox34, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(jRadioButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                            .addComponent(txtresphistola9, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(chbxfalsiestafa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(chbxfalsirobo)
                                    .addComponent(chbxfalsifraude, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(35, 35, 35)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(chbxfalspartactirre)
                                    .addComponent(chbxfalsisustraccioninf)
                                    .addComponent(chbxfalspartactirre1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel186)
                    .addComponent(jCheckBox30, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox29, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(diligencielosdatosinacti)
                    .addComponent(jRadioButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cometioalgunoantes)
                    .addComponent(jCheckBox31, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox32, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chbxfalsirobo, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chbxfalsisustraccioninf))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chbxfalsifraude)
                    .addComponent(chbxfalspartactirre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chbxfalsiestafa)
                    .addComponent(chbxfalspartactirre1))
                .addGap(3, 3, 3)
                .addComponent(txtresphistolaantes, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel104, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(historlabopre1)
                    .addComponent(jRadioButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox34, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox33, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addComponent(txtresphistola1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel105, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(historlabopre2)
                    .addComponent(jRadioButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox36, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox35, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addComponent(txtresphistola2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel106, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(historlabopre3)
                    .addComponent(jRadioButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox38, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox37, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addComponent(txtresphistola3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel107, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox40, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox39, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(historlabopre4))
                .addGap(7, 7, 7)
                .addComponent(txtresphistola4, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel114, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton24, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox44, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox43, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(historlabopre6))
                .addGap(7, 7, 7)
                .addComponent(txtresphistola6, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel112, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(historlabopre7)
                    .addComponent(jRadioButton25, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox46, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox45, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addComponent(txtresphistola7, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel111, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton26, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox48, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox47, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(historlabopre8_1))
                .addGap(7, 7, 7)
                .addComponent(txtresphistola8, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel110, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(historlabopre5)
                    .addComponent(jRadioButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox42, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox41, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addComponent(txtresphistola5, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel113, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox50, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox49, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(historlabopre9))
                .addGap(7, 7, 7)
                .addComponent(txtresphistola9, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel109, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        jScrollPane4.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 975, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBox29ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox29ItemStateChanged
        if (jCheckBox29.isSelected()) {
            jCheckBox30.setSelected(false);
            HistoriaLaboral.setEmpleo1("nohay");
            HistoriaLaboral.setEmpleo2("nohay");
            HistoriaLaboral.setEmpleo3("nohay");
            HistoriaLaboral.setEmpleo4("nohay");
            HistoriaLaboral.setEmpleo5("nohay");
            HistoriaLaboral.setEmpleo6("nohay");
            HistoriaLaboral.setEmpleo7("nohay");
            HistoriaLaboral.setEmpleo8("nohay");
            HistoriaLaboral.setEmpleo9("nohay");
            HistoriaLaboral.setEmpleo10("nohay");
            HistoriaLaboral.setEmpleo11("nohay");
            HistoriaLaboral.setEmpleo12("nohay");
            HistoriaLaboral.setEmpleo13("nohay");
            HistoriaLaboral.setEmpleo14("nohay");
            HistoriaLaboral.setEmpleo15("nohay");
            HistoriaLaboral.setEmpleobefore("No");

            jPanel2.setVisible(false);
            jPanel3.setVisible(false);
//            jPanel4.setVisible(false);
            jPanel5.setVisible(false);
            jPanel6.setVisible(false);
            jPanel7.setVisible(false);
            jPanel8.setVisible(false);
            jPanel9.setVisible(false);
            jPanel10.setVisible(false);
            jPanel11.setVisible(false);
            jPanel12.setVisible(false);
            jPanel13.setVisible(false);
            jPanel14.setVisible(false);
            jPanel15.setVisible(false);
            jPanel16.setVisible(false);
            jPanel17.setVisible(false);

        } else {
            HistoriaLaboral.setEmpleo1("nohay");
            HistoriaLaboral.setEmpleo2("nohay");
            HistoriaLaboral.setEmpleo3("nohay");
            HistoriaLaboral.setEmpleo4("nohay");
            HistoriaLaboral.setEmpleo5("nohay");
            HistoriaLaboral.setEmpleo6("nohay");
            HistoriaLaboral.setEmpleo7("nohay");
            HistoriaLaboral.setEmpleo8("nohay");
            HistoriaLaboral.setEmpleo9("nohay");
            HistoriaLaboral.setEmpleo10("nohay");
            HistoriaLaboral.setEmpleo11("nohay");
            HistoriaLaboral.setEmpleo12("nohay");
            HistoriaLaboral.setEmpleo13("nohay");
            HistoriaLaboral.setEmpleo14("nohay");
            HistoriaLaboral.setEmpleo15("nohay");
            HistoriaLaboral.setEmpleobefore("-");

            jPanel2.setVisible(false);
            jPanel3.setVisible(false);
            jPanel5.setVisible(false);
            jPanel6.setVisible(false);
            jPanel7.setVisible(false);
            jPanel8.setVisible(false);
            jPanel9.setVisible(false);
            jPanel10.setVisible(false);
            jPanel11.setVisible(false);
            jPanel12.setVisible(false);
            jPanel13.setVisible(false);
            jPanel14.setVisible(false);
            jPanel15.setVisible(false);
            jPanel16.setVisible(false);
            jPanel17.setVisible(false);
        }
    }//GEN-LAST:event_jCheckBox29ItemStateChanged

    private void jCheckBox30ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox30ItemStateChanged

        if (jCheckBox30.isSelected()) {
            jCheckBox29.setSelected(false);
            HistoriaLaboral.setEmpleobefore("Sí");
            HistoriaLaboral.setEmpleo1("hay");
            jPanel2.setVisible(true);
            jLabel27.setVisible(false);
            jPanel3.setVisible(true);
            txtdiligencielosdatosempresa1.setEnabled(false);
            txtdiligencielosdatoslugar1.setEnabled(false);
            txtdiligencielosdatoscargo1.setEnabled(false);
            txtdiligencielosdatossalario1.setEnabled(false);
            txtdiligencielosdatosmotivo1.setEnabled(false);
            fechaingresoemp1.setEnabled(false);
            fechaingresoemp_a1.setEnabled(false);
            fecharetiroemp1.setEnabled(false);
            fecharetiroemp_a1.setEnabled(false);
            sptiempolaboro1.setEnabled(false);
            txtdiligencielosdatosmotivo1.setEnabled(false);
            jCheckBox52.setEnabled(false);
            jLabel14.setVisible(false);
            jLabel28.setVisible(false);
//            diligencielosdatosempresa.setVisible(true);
        } else {
            HistoriaLaboral.setEmpleo1("nohay");
            HistoriaLaboral.setEmpleo2("nohay");
            HistoriaLaboral.setEmpleo3("nohay");
            HistoriaLaboral.setEmpleo4("nohay");
            HistoriaLaboral.setEmpleo5("nohay");
            HistoriaLaboral.setEmpleo6("nohay");
            HistoriaLaboral.setEmpleo7("nohay");
            HistoriaLaboral.setEmpleo8("nohay");
            HistoriaLaboral.setEmpleo9("nohay");
            HistoriaLaboral.setEmpleo10("nohay");
            HistoriaLaboral.setEmpleo11("nohay");
            HistoriaLaboral.setEmpleo12("nohay");
            HistoriaLaboral.setEmpleo13("nohay");
            HistoriaLaboral.setEmpleo14("nohay");
            HistoriaLaboral.setEmpleo15("nohay");
            HistoriaLaboral.setEmpleobefore("-");

            jPanel2.setVisible(true);
            jPanel3.setVisible(true);
            jPanel5.setVisible(false);
            jPanel6.setVisible(false);
            jPanel7.setVisible(false);
            jPanel8.setVisible(false);
            jPanel9.setVisible(false);
            jPanel10.setVisible(false);
            jPanel11.setVisible(false);
            jPanel12.setVisible(false);
            jPanel13.setVisible(false);
            jPanel14.setVisible(false);
            jPanel15.setVisible(false);
            jPanel16.setVisible(false);
            jPanel17.setVisible(false);
        }
    }//GEN-LAST:event_jCheckBox30ItemStateChanged

    private void jCheckBox39ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox39ItemStateChanged
        if (jCheckBox39.isSelected()) {
            jCheckBox40.setSelected(false);
            HistoriaLaboral.setHistorlabopre4("Sí");
            txtresphistola4.setVisible(true);
            jLabel114.setVisible(true);
            jRadioButton22.setEnabled(true);
        } else {
            HistoriaLaboral.setHistorlabopre4("-");
            txtresphistola4.setVisible(false);
            jLabel114.setVisible(false);
            jRadioButton22.setEnabled(false);
            jRadioButton22.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox39ItemStateChanged

    private void jCheckBox40ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox40ItemStateChanged
        if (jCheckBox40.isSelected()) {
            jCheckBox39.setSelected(false);
            HistoriaLaboral.setHistorlabopre4("No");
            txtresphistola4.setVisible(false);
            jLabel114.setVisible(false);
            jRadioButton22.setEnabled(false);
            jRadioButton22.setSelected(false);
        } else {
            HistoriaLaboral.setHistorlabopre4("-");
            txtresphistola4.setVisible(false);
            jLabel114.setVisible(false);
            jRadioButton22.setEnabled(false);
            jRadioButton22.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox40ItemStateChanged

    private void chbxfalspartactirreItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chbxfalspartactirreItemStateChanged
        if (chbxfalspartactirre.isSelected()) {
            HistoriaLaboral.setMalacto5("hay");
        } else if (!chbxfalspartactirre.isSelected()) {
            HistoriaLaboral.setMalacto5("nohay");
        }
    }//GEN-LAST:event_chbxfalspartactirreItemStateChanged

    private void jCheckBox38ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox38ItemStateChanged
        if (jCheckBox38.isSelected()) {
            jCheckBox37.setSelected(false);
            HistoriaLaboral.setHistorlabopre3("No");
            txtresphistola3.setVisible(false);
            jLabel107.setVisible(false);
            jRadioButton21.setEnabled(false);
            jRadioButton21.setSelected(false);
        } else {
            HistoriaLaboral.setHistorlabopre3("-");
            txtresphistola3.setVisible(false);
            jLabel107.setVisible(false);
            jRadioButton21.setEnabled(false);
            jRadioButton21.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox38ItemStateChanged

    private void chbxfalsiestafaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chbxfalsiestafaItemStateChanged
        if (chbxfalsiestafa.isSelected()) {
            HistoriaLaboral.setMalacto3("hay");
        } else if (!chbxfalsiestafa.isSelected()) {
            HistoriaLaboral.setMalacto3("nohay");
        }
    }//GEN-LAST:event_chbxfalsiestafaItemStateChanged

    private void chbxfalsifraudeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chbxfalsifraudeItemStateChanged
        if (chbxfalsifraude.isSelected()) {
            HistoriaLaboral.setMalacto2("hay");
        } else if (!chbxfalsifraude.isSelected()) {
            HistoriaLaboral.setMalacto2("nohay");
        }
    }//GEN-LAST:event_chbxfalsifraudeItemStateChanged

    private void chbxfalsisustraccioninfItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chbxfalsisustraccioninfItemStateChanged
        if (chbxfalsisustraccioninf.isSelected()) {
            HistoriaLaboral.setMalacto4("hay");
        } else if (!chbxfalsisustraccioninf.isSelected()) {
            HistoriaLaboral.setMalacto4("nohay");
        }
    }//GEN-LAST:event_chbxfalsisustraccioninfItemStateChanged

    private void chbxfalsiroboItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chbxfalsiroboItemStateChanged
        if (chbxfalsirobo.isSelected()) {
            HistoriaLaboral.setMalacto1("hay");
        } else if (!chbxfalsirobo.isSelected()) {
            HistoriaLaboral.setMalacto1("nohay");
        }
    }//GEN-LAST:event_chbxfalsiroboItemStateChanged

    private void jCheckBox31ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox31ItemStateChanged
        if (jCheckBox31.isSelected()) {
            jCheckBox32.setSelected(false);
            chbxfalsirobo.setEnabled(true);
            chbxfalsifraude.setEnabled(true);
            chbxfalsiestafa.setEnabled(true);
            chbxfalsisustraccioninf.setEnabled(true);
            chbxfalspartactirre.setEnabled(true);
            chbxfalspartactirre1.setEnabled(true);
            txtresphistolaantes.setVisible(true);
            jLabel104.setVisible(true);
            HistoriaLaboral.setDidmalosactos("Sí");
            jRadioButton18.setEnabled(true);
        } else {
            HistoriaLaboral.setDidmalosactos("-");
            chbxfalsirobo.setEnabled(false);
            chbxfalsifraude.setEnabled(false);
            chbxfalsiestafa.setEnabled(false);
            chbxfalsisustraccioninf.setEnabled(false);
            chbxfalspartactirre.setEnabled(false);
            chbxfalspartactirre1.setEnabled(false);
            txtresphistolaantes.setVisible(false);
            jLabel104.setVisible(false);
            jRadioButton18.setEnabled(false);
            jRadioButton18.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox31ItemStateChanged

    private void jCheckBox32ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox32ItemStateChanged
        if (jCheckBox32.isSelected()) {
            jCheckBox31.setSelected(false);
            HistoriaLaboral.setDidmalosactos("No");
            chbxfalsirobo.setEnabled(false);
            chbxfalsifraude.setEnabled(false);
            chbxfalsiestafa.setEnabled(false);
            chbxfalsisustraccioninf.setEnabled(false);
            chbxfalspartactirre.setEnabled(false);
            chbxfalspartactirre1.setEnabled(false);
            txtresphistolaantes.setVisible(false);
            jLabel104.setVisible(false);
            jRadioButton18.setEnabled(false);
            jRadioButton18.setSelected(false);
        } else {
            HistoriaLaboral.setDidmalosactos("-");
            chbxfalsirobo.setEnabled(false);
            chbxfalsifraude.setEnabled(false);
            chbxfalsiestafa.setEnabled(false);
            chbxfalsisustraccioninf.setEnabled(false);
            chbxfalspartactirre.setEnabled(false);
            chbxfalspartactirre1.setEnabled(false);
            txtresphistolaantes.setVisible(false);
            jLabel104.setVisible(false);
            jRadioButton18.setEnabled(false);
            jRadioButton18.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox32ItemStateChanged

    private void jCheckBox33ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox33ItemStateChanged
        if (jCheckBox33.isSelected()) {
            jCheckBox34.setSelected(false);
            HistoriaLaboral.setHistorlabopre1("Sí");
            txtresphistola1.setVisible(true);
            jLabel105.setVisible(true);
            jRadioButton19.setEnabled(true);
        } else {
            HistoriaLaboral.setHistorlabopre1("-");
            txtresphistola1.setVisible(false);
            jLabel105.setVisible(false);
            jRadioButton19.setEnabled(false);
            jRadioButton19.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox33ItemStateChanged

    private void jCheckBox34ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox34ItemStateChanged
        if (jCheckBox34.isSelected()) {
            jCheckBox33.setSelected(false);
            HistoriaLaboral.setHistorlabopre1("No");
            txtresphistola1.setVisible(false);
            jLabel105.setVisible(false);
            jRadioButton19.setEnabled(false);
            jRadioButton19.setSelected(false);
        } else {
            HistoriaLaboral.setHistorlabopre1("-");
            txtresphistola1.setVisible(false);
            jLabel105.setVisible(false);
            jRadioButton19.setEnabled(false);
            jRadioButton19.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox34ItemStateChanged

    private void jCheckBox35ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox35ItemStateChanged
        if (jCheckBox35.isSelected()) {
            jCheckBox36.setSelected(false);
            txtresphistola2.setVisible(true);
            jLabel106.setVisible(true);
            HistoriaLaboral.setHistorlabopre2("Sí");
            jRadioButton20.setEnabled(true);
        } else {
            HistoriaLaboral.setHistorlabopre2("-");
            txtresphistola2.setVisible(false);
            jLabel106.setVisible(false);
            jRadioButton20.setEnabled(false);
            jRadioButton20.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox35ItemStateChanged

    private void jCheckBox36ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox36ItemStateChanged
        if (jCheckBox36.isSelected()) {
            jCheckBox35.setSelected(false);
            HistoriaLaboral.setHistorlabopre2("No");
            txtresphistola2.setVisible(false);
            jLabel106.setVisible(false);
            jRadioButton20.setEnabled(false);
            jRadioButton20.setSelected(false);
        } else {
            HistoriaLaboral.setHistorlabopre2("-");
            txtresphistola2.setVisible(false);
            jLabel106.setVisible(false);
            jRadioButton20.setEnabled(false);
            jRadioButton20.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox36ItemStateChanged

    private void jCheckBox37ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox37ItemStateChanged
        if (jCheckBox37.isSelected()) {
            jCheckBox38.setSelected(false);
            HistoriaLaboral.setHistorlabopre3("Sí");
            txtresphistola3.setVisible(true);
            jLabel107.setVisible(true);
            jRadioButton21.setEnabled(true);
        } else {
            HistoriaLaboral.setHistorlabopre3("-");
            txtresphistola3.setVisible(false);
            jLabel107.setVisible(false);
            jRadioButton21.setEnabled(false);
            jRadioButton21.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox37ItemStateChanged

    private void jCheckBox49ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox49ItemStateChanged
        if (jCheckBox49.isSelected()) {
            jCheckBox50.setSelected(false);
            txtresphistola9.setVisible(true);
            jLabel109.setVisible(true);
            
           Admisiones.setAdmHL11("hay");
     
        } else {

            txtresphistola9.setVisible(false);
            jLabel109.setVisible(false);
            Admisiones.setAdmHL11("nohay");
        }
    }//GEN-LAST:event_jCheckBox49ItemStateChanged

    private void jCheckBox50ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox50ItemStateChanged
        if (jCheckBox50.isSelected()) {
            jCheckBox49.setSelected(false);
            txtresphistola9.setVisible(false);
            jLabel109.setVisible(false);
        } else {
            txtresphistola9.setVisible(false);
            jLabel109.setVisible(false);
        }
    }//GEN-LAST:event_jCheckBox50ItemStateChanged

    private void jCheckBox41ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox41ItemStateChanged
        if (jCheckBox41.isSelected()) {
            jCheckBox42.setSelected(false);
            HistoriaLaboral.setHistorlabopre8("Sí");
            txtresphistola5.setVisible(true);
            jLabel113.setVisible(true);
            jRadioButton23.setEnabled(true);
            jRadioButton23.setVisible(true);
        } else {
            HistoriaLaboral.setHistorlabopre8("-");
            txtresphistola5.setVisible(false);
            jLabel113.setVisible(false);
            jRadioButton23.setVisible(false);
            jRadioButton23.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox41ItemStateChanged

    private void jCheckBox42ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox42ItemStateChanged
        if (jCheckBox42.isSelected()) {
            jCheckBox41.setSelected(false);
            HistoriaLaboral.setHistorlabopre8("No");
            txtresphistola5.setVisible(false);
            jLabel113.setVisible(false);
            jRadioButton23.setEnabled(false);
            jRadioButton23.setSelected(false);
        } else {
            HistoriaLaboral.setHistorlabopre8("-");
            txtresphistola5.setVisible(false);
            jLabel113.setVisible(false);
            jRadioButton23.setEnabled(false);
            jRadioButton23.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox42ItemStateChanged

    private void jCheckBox43ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox43ItemStateChanged
        if (jCheckBox43.isSelected()) {
            jCheckBox44.setSelected(false);
            HistoriaLaboral.setHistorlabopre5("Sí");
            txtresphistola6.setVisible(true);
            jLabel112.setVisible(true);
            jRadioButton24.setEnabled(true);
        } else {
            HistoriaLaboral.setHistorlabopre5("-");
            txtresphistola6.setVisible(false);
            jLabel112.setVisible(false);
            jRadioButton24.setEnabled(false);
            jRadioButton24.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox43ItemStateChanged

    private void chbxfalspartactirre1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chbxfalspartactirre1ItemStateChanged
        if (chbxfalspartactirre1.isSelected()) {
            HistoriaLaboral.setMalacto6("hay");
        } else if (!chbxfalspartactirre1.isSelected()) {
            HistoriaLaboral.setMalacto6("nohay");
        }
    }//GEN-LAST:event_chbxfalspartactirre1ItemStateChanged

    private void jCheckBox44ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox44ItemStateChanged
        if (jCheckBox44.isSelected()) {
            jCheckBox43.setSelected(false);
            HistoriaLaboral.setHistorlabopre5("No");
            txtresphistola6.setVisible(false);
            jLabel112.setVisible(false);
            jRadioButton24.setEnabled(false);
            jRadioButton24.setSelected(false);
        } else {
            HistoriaLaboral.setHistorlabopre5("-");
            txtresphistola6.setVisible(false);
            jLabel112.setVisible(false);
            jRadioButton24.setEnabled(false);
            jRadioButton24.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox44ItemStateChanged

    private void txtresphistola4CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtresphistola4CaretUpdate
        HistoriaLaboral.setExphistorlabopre4(txtresphistola4.getText());
    }//GEN-LAST:event_txtresphistola4CaretUpdate

    private void txtresphistola4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtresphistola4KeyTyped
        int k = (int) evt.getKeyChar();
        if (k == 39) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "¡No se acepta ese tipo de carácter!", "Error de datos ingresados", JOptionPane.ERROR_MESSAGE, iconThinking_uh);
        }
    }//GEN-LAST:event_txtresphistola4KeyTyped

    private void jCheckBox45ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox45ItemStateChanged
        if (jCheckBox45.isSelected()) {
            jCheckBox46.setSelected(false);
            HistoriaLaboral.setHistorlabopre6("Sí");
            txtresphistola7.setVisible(true);
            jLabel111.setVisible(true);
            jRadioButton25.setEnabled(true);
        } else {
            HistoriaLaboral.setHistorlabopre6("-");
            txtresphistola7.setVisible(false);
            jLabel111.setVisible(false);
            jRadioButton25.setEnabled(false);
            jRadioButton25.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox45ItemStateChanged

    private void txtresphistola3CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtresphistola3CaretUpdate
        HistoriaLaboral.setExphistorlabopre3(txtresphistola3.getText());
    }//GEN-LAST:event_txtresphistola3CaretUpdate

    private void txtresphistola3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtresphistola3KeyTyped
        int k = (int) evt.getKeyChar();
        if (k == 39) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "¡No se acepta ese tipo de carácter!", "Error de datos ingresados", JOptionPane.ERROR_MESSAGE, iconThinking_uh);
        }
    }//GEN-LAST:event_txtresphistola3KeyTyped

    private void jCheckBox46ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox46ItemStateChanged
        if (jCheckBox46.isSelected()) {
            jCheckBox45.setSelected(false);
            HistoriaLaboral.setHistorlabopre6("No");
            txtresphistola7.setVisible(false);
            jLabel111.setVisible(false);
            jRadioButton25.setEnabled(false);
            jRadioButton25.setSelected(false);
        } else {
            HistoriaLaboral.setHistorlabopre6("-");
            txtresphistola7.setVisible(false);
            jLabel111.setVisible(false);
            jRadioButton25.setEnabled(false);
            jRadioButton25.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox46ItemStateChanged

    private void txtresphistola2CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtresphistola2CaretUpdate
        HistoriaLaboral.setExphistorlabopre2(txtresphistola2.getText());
    }//GEN-LAST:event_txtresphistola2CaretUpdate

    private void txtresphistola2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtresphistola2KeyTyped
        int k = (int) evt.getKeyChar();
        if (k == 39) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "¡No se acepta ese tipo de carácter!", "Error de datos ingresados", JOptionPane.ERROR_MESSAGE, iconThinking_uh);
        }
    }//GEN-LAST:event_txtresphistola2KeyTyped

    private void jCheckBox47ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox47ItemStateChanged
        if (jCheckBox47.isSelected()) {
            jCheckBox48.setSelected(false);
            HistoriaLaboral.setHistorlabopre7("Sí");
            txtresphistola8.setVisible(true);
            jLabel110.setVisible(true);
            jRadioButton26.setEnabled(true);
            jRadioButton26.setVisible(true);
        } else {
            HistoriaLaboral.setHistorlabopre7("-");
            txtresphistola8.setVisible(false);
            jLabel110.setVisible(false);
            jRadioButton26.setVisible(false);
            jRadioButton26.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox47ItemStateChanged

    private void txtresphistola1CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtresphistola1CaretUpdate
        HistoriaLaboral.setExphistorlabopre1(txtresphistola1.getText());
    }//GEN-LAST:event_txtresphistola1CaretUpdate

    private void txtresphistola1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtresphistola1KeyTyped
        int k = (int) evt.getKeyChar();
        if (k == 39) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "¡No se acepta ese tipo de carácter!", "Error de datos ingresados", JOptionPane.ERROR_MESSAGE, iconThinking_uh);
        }
    }//GEN-LAST:event_txtresphistola1KeyTyped

    private void jCheckBox48ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox48ItemStateChanged
        if (jCheckBox48.isSelected()) {
            jCheckBox47.setSelected(false);
            HistoriaLaboral.setHistorlabopre7("No");
            txtresphistola8.setVisible(false);
            jLabel110.setVisible(false);
            jRadioButton26.setEnabled(false);
            jRadioButton26.setSelected(false);
        } else {
            HistoriaLaboral.setHistorlabopre7("-");
            txtresphistola8.setVisible(false);
            jLabel110.setVisible(false);
            jRadioButton26.setEnabled(false);
            jRadioButton26.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox48ItemStateChanged

    private void txtresphistola9CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtresphistola9CaretUpdate
        HistoriaLaboral.setAdmisionHistoriaLaboral(txtresphistola9.getText());
    }//GEN-LAST:event_txtresphistola9CaretUpdate

    private void txtresphistola9KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtresphistola9KeyTyped
        int k = (int) evt.getKeyChar();
        if (k == 39) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "¡No se acepta ese tipo de carácter!", "Error de datos ingresados", JOptionPane.ERROR_MESSAGE, iconThinking_uh);
        }
    }//GEN-LAST:event_txtresphistola9KeyTyped

    private void txtresphistola8CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtresphistola8CaretUpdate
        HistoriaLaboral.setExphistorlabopre7(txtresphistola8.getText());
    }//GEN-LAST:event_txtresphistola8CaretUpdate

    private void txtresphistola8KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtresphistola8KeyTyped
        int k = (int) evt.getKeyChar();
        if (k == 39) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "¡No se acepta ese tipo de carácter!", "Error de datos ingresados", JOptionPane.ERROR_MESSAGE, iconThinking_uh);
        }
    }//GEN-LAST:event_txtresphistola8KeyTyped

    private void txtresphistola7CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtresphistola7CaretUpdate
        HistoriaLaboral.setExphistorlabopre6(txtresphistola7.getText());
    }//GEN-LAST:event_txtresphistola7CaretUpdate

    private void txtresphistola7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtresphistola7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtresphistola7ActionPerformed

    private void txtresphistola7KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtresphistola7KeyTyped
        int k = (int) evt.getKeyChar();
        if (k == 39) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "¡No se acepta ese tipo de carácter!", "Error de datos ingresados", JOptionPane.ERROR_MESSAGE, iconThinking_uh);
        }
    }//GEN-LAST:event_txtresphistola7KeyTyped

    private void txtresphistola6CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtresphistola6CaretUpdate
        HistoriaLaboral.setExphistorlabopre5(txtresphistola6.getText());
    }//GEN-LAST:event_txtresphistola6CaretUpdate

    private void txtresphistola6KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtresphistola6KeyTyped
        int k = (int) evt.getKeyChar();
        if (k == 39) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "¡No se acepta ese tipo de carácter!", "Error de datos ingresados", JOptionPane.ERROR_MESSAGE, iconThinking_uh);
        }
    }//GEN-LAST:event_txtresphistola6KeyTyped

    private void txtresphistola5CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtresphistola5CaretUpdate
        HistoriaLaboral.setExphistorlabopre8(txtresphistola5.getText());
    }//GEN-LAST:event_txtresphistola5CaretUpdate

    private void txtresphistola5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtresphistola5KeyTyped
        int k = (int) evt.getKeyChar();
        if (k == 39) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "¡No se acepta ese tipo de carácter!", "Error de datos ingresados", JOptionPane.ERROR_MESSAGE, iconThinking_uh);
        }
    }//GEN-LAST:event_txtresphistola5KeyTyped

    private void txtresphistolaantesCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtresphistolaantesCaretUpdate
        HistoriaLaboral.setExpdidmalosactos(txtresphistolaantes.getText());
    }//GEN-LAST:event_txtresphistolaantesCaretUpdate

    private void txtresphistolaantesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtresphistolaantesKeyTyped
        int k = (int) evt.getKeyChar();
        if (k == 39) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "¡No se acepta ese tipo de carácter!", "Error de datos ingresados", JOptionPane.ERROR_MESSAGE, iconThinking_uh);
        }
    }//GEN-LAST:event_txtresphistolaantesKeyTyped

    private void jTextArea5CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextArea5CaretUpdate
        HistoriaLaboral.setPeriodosinacla(jTextArea5.getText());
    }//GEN-LAST:event_jTextArea5CaretUpdate

    private void jTextArea5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextArea5KeyTyped
        int k = (int) evt.getKeyChar();
        if (k == 39) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "¡No se acepta ese tipo de carácter!", "Error de datos ingresados", JOptionPane.ERROR_MESSAGE, iconThinking_uh);
        }
    }//GEN-LAST:event_jTextArea5KeyTyped

    private void txtdiligencielosdatoscargoCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtdiligencielosdatoscargoCaretUpdate
        HistoriaLaboral.setCargotrabe1(txtdiligencielosdatoscargo.getText());
    }//GEN-LAST:event_txtdiligencielosdatoscargoCaretUpdate

    private void txtdiligencielosdatosempresaCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtdiligencielosdatosempresaCaretUpdate
        HistoriaLaboral.setEmpresa1(txtdiligencielosdatosempresa.getText());
    }//GEN-LAST:event_txtdiligencielosdatosempresaCaretUpdate

    private void txtdiligencielosdatosempresaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdiligencielosdatosempresaKeyTyped
        int k = (int) evt.getKeyChar();
        if (k == 39) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "¡No se acepta ese tipo de carácter!", "Error de datos ingresados", JOptionPane.ERROR_MESSAGE, iconThinking_uh);
        }
    }//GEN-LAST:event_txtdiligencielosdatosempresaKeyTyped

    private void txtdiligencielosdatoslugarCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtdiligencielosdatoslugarCaretUpdate
        HistoriaLaboral.setLugarempresa1(txtdiligencielosdatoslugar.getText());
    }//GEN-LAST:event_txtdiligencielosdatoslugarCaretUpdate

    private void txtdiligencielosdatossalarioCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtdiligencielosdatossalarioCaretUpdate
        HistoriaLaboral.setSalariobe1(txtdiligencielosdatossalario.getText());
    }//GEN-LAST:event_txtdiligencielosdatossalarioCaretUpdate

    private void fechaingresoempPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_fechaingresoempPropertyChange

        int m = fechaingresoemp.getMonth();
        mes1 = m + 1;

        switch (mes1) {
            case 1:
                mesI1 = "Enero";
                break;
            case 2:
                mesI1 = "Febrero";
                break;
            case 3:
                mesI1 = "Marzo";
                break;
            case 4:
                mesI1 = "Abril";
                break;
            case 5:
                mesI1 = "Mayo";
                break;
            case 6:
                mesI1 = "Junio";
                break;
            case 7:
                mesI1 = "Julio";
                break;
            case 8:
                mesI1 = "Agosto";
                break;
            case 9:
                mesI1 = "Septiembre";
                break;
            case 10:
                mesI1 = "Octubre";
                break;
            case 11:
                mesI1 = "Noviembre";
                break;
            case 12:
                mesI1 = "Diciembre";
                break;
            default:
                break;
        }
    }//GEN-LAST:event_fechaingresoempPropertyChange

    private void fechaingresoemp_aPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_fechaingresoemp_aPropertyChange

        anio1 = fechaingresoemp_a.getYear();
        anioI1 = String.valueOf(anio1);

    }//GEN-LAST:event_fechaingresoemp_aPropertyChange

    private void fecharetiroempPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_fecharetiroempPropertyChange
        int m2 = fecharetiroemp.getMonth();
        mes2 = m2 + 1;
        switch (mes2) {
            case 1:
                mesR1 = "Enero";
                break;
            case 2:
                mesR1 = "Febrero";
                break;
            case 3:
                mesR1 = "Marzo";
                break;
            case 4:
                mesR1 = "Abril";
                break;
            case 5:
                mesR1 = "Mayo";
                break;
            case 6:
                mesR1 = "Junio";
                break;
            case 7:
                mesR1 = "Julio";
                break;
            case 8:
                mesR1 = "Agosto";
                break;
            case 9:
                mesR1 = "Septiembre";
                break;
            case 10:
                mesR1 = "Octubre";
                break;
            case 11:
                mesR1 = "Noviembre";
                break;
            case 12:
                mesR1 = "Diciembre";
                break;
            default:
                break;
        }

        String aa = Integer.toString(anio2);
        if (aa != null) {
            anio2 = fecharetiroemp_a.getYear();
            int dmes = 0;
            int danios;
            int r;
            int rr;
            int k;
            if (anio1 == anio2) {
                dmes = (mes2 - mes1);
            } else {
                danios = (anio2 - anio1);
                if (danios == 1) {
                    r = (12 - mes1);
                    dmes = (r + mes2);
                } else if (danios > 1) {
                    rr = ((danios - 1) * 12);
                    k = (12 - mes1);
                    dmes = (k + rr + mes2);
                }
            }
            String pp = Integer.toString(dmes);
            sptiempolaboro.setText(pp);
            meses1 = pp;
        }
    }//GEN-LAST:event_fecharetiroempPropertyChange

    private void fecharetiroemp_aPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_fecharetiroemp_aPropertyChange
        anio2 = fecharetiroemp_a.getYear();
        anioR1 = String.valueOf(anio2);
        int dmes = 0;
        int danios;
        int r;
        int rr;
        int k;
        if (anio1 == anio2) {
            dmes = (mes2 - mes1);
        } else {
            danios = (anio2 - anio1);
            if (danios == 1) {
                r = (12 - mes1);
                dmes = (r + mes2);
            } else if (danios > 1) {
                rr = ((danios - 1) * 12);
                k = (12 - mes1);
                dmes = (k + rr + mes2);
            }
        }
        String pp = Integer.toString(dmes);
        sptiempolaboro.setText(pp);
        meses1 = pp;
    }//GEN-LAST:event_fecharetiroemp_aPropertyChange

    private void txtdiligencielosdatosmotivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdiligencielosdatosmotivoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdiligencielosdatosmotivoActionPerformed

    private void jCheckBox51ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox51ItemStateChanged
        if (jCheckBox51.isSelected()) {
            fechaingresoemp.setEnabled(false);
            fecharetiroemp.setEnabled(false);
            fechaingresoemp_a.setEnabled(false);
            fecharetiroemp_a.setEnabled(false);
            sptiempolaboro.setEnabled(true);
            HistoriaLaboral.setVnfecha1(false);

        } else {
            fechaingresoemp.setEnabled(true);
            fecharetiroemp.setEnabled(true);
            fechaingresoemp_a.setEnabled(true);
            fecharetiroemp_a.setEnabled(true);
            sptiempolaboro.setEnabled(false);
            HistoriaLaboral.setVnfecha1(true);
        }
    }//GEN-LAST:event_jCheckBox51ItemStateChanged

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        //empleo2
        HistoriaLaboral.setEmpleo2("hay");
        jPanel3.setVisible(true);
        jLabel13.setVisible(false);
        jLabel27.setVisible(true);

        txtdiligencielosdatosempresa1.setEnabled(true);
        txtdiligencielosdatoslugar1.setEnabled(true);
        txtdiligencielosdatoscargo1.setEnabled(true);
        txtdiligencielosdatossalario1.setEnabled(true);
        txtdiligencielosdatosmotivo1.setEnabled(true);
        fechaingresoemp1.setEnabled(true);
        fechaingresoemp_a1.setEnabled(true);
        fecharetiroemp1.setEnabled(true);
        fecharetiroemp_a1.setEnabled(true);
        sptiempolaboro1.setEnabled(true);
        txtdiligencielosdatosmotivo1.setEnabled(true);
        jCheckBox52.setEnabled(true);
        jLabel14.setVisible(true);
        jLabel28.setVisible(false);

    }//GEN-LAST:event_jLabel13MouseClicked

    private void jLabel27MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel27MouseClicked
        //empleo2
        HistoriaLaboral.setEmpleo2("nohay");
        jPanel3.setVisible(false);
        jLabel13.setVisible(true);
        jLabel27.setVisible(false);
    }//GEN-LAST:event_jLabel27MouseClicked

    private void txtdiligencielosdatoslugarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdiligencielosdatoslugarKeyTyped
        int k = (int) evt.getKeyChar();
        if (k == 39) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "¡No se acepta ese tipo de carácter!", "Error de datos ingresados", JOptionPane.ERROR_MESSAGE, iconThinking_uh);
        }
    }//GEN-LAST:event_txtdiligencielosdatoslugarKeyTyped

    private void txtdiligencielosdatoscargoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdiligencielosdatoscargoKeyTyped
        int k = (int) evt.getKeyChar();
        if (k == 39) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "¡No se acepta ese tipo de carácter!", "Error de datos ingresados", JOptionPane.ERROR_MESSAGE, iconThinking_uh);
        }
    }//GEN-LAST:event_txtdiligencielosdatoscargoKeyTyped

    private void txtdiligencielosdatossalarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdiligencielosdatossalarioKeyTyped
        int k = (int) evt.getKeyChar();
        if (k == 39) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "¡No se acepta ese tipo de carácter!", "Error de datos ingresados", JOptionPane.ERROR_MESSAGE, iconThinking_uh);
        }
    }//GEN-LAST:event_txtdiligencielosdatossalarioKeyTyped

    private void txtdiligencielosdatosmotivoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdiligencielosdatosmotivoKeyTyped
        int k = (int) evt.getKeyChar();
        if (k == 39) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "¡No se acepta ese tipo de carácter!", "Error de datos ingresados", JOptionPane.ERROR_MESSAGE, iconThinking_uh);
        }
    }//GEN-LAST:event_txtdiligencielosdatosmotivoKeyTyped

    private void sptiempolaboroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sptiempolaboroKeyTyped
        int k = (int) evt.getKeyChar();

        if (k >= 32 && k < 48 || k > 57 && k != 127) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "¡Solamente se aceptan números!", "Error de datos ingresados", JOptionPane.ERROR_MESSAGE, iconThinking_uh);
        }
    }//GEN-LAST:event_sptiempolaboroKeyTyped

    private void txtdiligencielosdatoscargo1CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtdiligencielosdatoscargo1CaretUpdate
        HistoriaLaboral.setCargotrabe2(txtdiligencielosdatoscargo1.getText());
    }//GEN-LAST:event_txtdiligencielosdatoscargo1CaretUpdate

    private void txtdiligencielosdatoscargo1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdiligencielosdatoscargo1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdiligencielosdatoscargo1KeyTyped

    private void txtdiligencielosdatosempresa1CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtdiligencielosdatosempresa1CaretUpdate
        HistoriaLaboral.setEmpresa2(txtdiligencielosdatosempresa1.getText());
    }//GEN-LAST:event_txtdiligencielosdatosempresa1CaretUpdate

    private void txtdiligencielosdatosempresa1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdiligencielosdatosempresa1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdiligencielosdatosempresa1KeyTyped

    private void txtdiligencielosdatoslugar1CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtdiligencielosdatoslugar1CaretUpdate
        HistoriaLaboral.setLugarempresa2(txtdiligencielosdatoslugar1.getText());
    }//GEN-LAST:event_txtdiligencielosdatoslugar1CaretUpdate

    private void txtdiligencielosdatoslugar1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdiligencielosdatoslugar1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdiligencielosdatoslugar1KeyTyped

    private void txtdiligencielosdatossalario1CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtdiligencielosdatossalario1CaretUpdate
        HistoriaLaboral.setSalariobe2(txtdiligencielosdatossalario1.getText());
    }//GEN-LAST:event_txtdiligencielosdatossalario1CaretUpdate

    private void txtdiligencielosdatossalario1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdiligencielosdatossalario1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdiligencielosdatossalario1KeyTyped

    private void fechaingresoemp1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_fechaingresoemp1PropertyChange
        int m = fechaingresoemp1.getMonth();
        mes1_2 = m + 1;

        switch (mes1_2) {
            case 1:
                mesI2 = "Enero";
                break;
            case 2:
                mesI2 = "Febrero";
                break;
            case 3:
                mesI2 = "Marzo";
                break;
            case 4:
                mesI2 = "Abril";
                break;
            case 5:
                mesI2 = "Mayo";
                break;
            case 6:
                mesI2 = "Junio";
                break;
            case 7:
                mesI2 = "Julio";
                break;
            case 8:
                mesI2 = "Agosto";
                break;
            case 9:
                mesI2 = "Septiembre";
                break;
            case 10:
                mesI2 = "Octubre";
                break;
            case 11:
                mesI2 = "Noviembre";
                break;
            case 12:
                mesI2 = "Diciembre";
                break;
            default:
                break;
        }
    }//GEN-LAST:event_fechaingresoemp1PropertyChange

    private void fechaingresoemp_a1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_fechaingresoemp_a1PropertyChange
        anio1_2 = fechaingresoemp_a1.getYear();
        anioI2 = String.valueOf(anio1_2);
    }//GEN-LAST:event_fechaingresoemp_a1PropertyChange

    private void sptiempolaboro1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sptiempolaboro1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_sptiempolaboro1KeyTyped

    private void fecharetiroemp1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_fecharetiroemp1PropertyChange
        int m2 = fecharetiroemp1.getMonth();
        mes2_2 = m2 + 1;
        switch (mes2_2) {
            case 1:
                mesR2 = "Enero";
                break;
            case 2:
                mesR2 = "Febrero";
                break;
            case 3:
                mesR2 = "Marzo";
                break;
            case 4:
                mesR2 = "Abril";
                break;
            case 5:
                mesR2 = "Mayo";
                break;
            case 6:
                mesR2 = "Junio";
                break;
            case 7:
                mesR2 = "Julio";
                break;
            case 8:
                mesR2 = "Agosto";
                break;
            case 9:
                mesR2 = "Septiembre";
                break;
            case 10:
                mesR2 = "Octubre";
                break;
            case 11:
                mesR2 = "Noviembre";
                break;
            case 12:
                mesR2 = "Diciembre";
                break;
            default:
                break;
        }

        String aa = Integer.toString(anio2_2);
        if (aa != null) {
            anio2_2 = fecharetiroemp_a1.getYear();
            int dmes = 0;
            int danios;
            int r;
            int rr;
            int k;
            if (anio1_2 == anio2_2) {
                dmes = (mes2_2 - mes1_2);
            } else {
                danios = (anio2_2 - anio1_2);
                if (danios == 1) {
                    r = (12 - mes1_2);
                    dmes = (r + mes2_2);
                } else if (danios > 1) {
                    rr = ((danios - 1) * 12);
                    k = (12 - mes1_2);
                    dmes = (k + rr + mes2_2);
                }
            }
            String pp = Integer.toString(dmes);
            sptiempolaboro1.setText(pp);
            meses2 = pp;
        }
    }//GEN-LAST:event_fecharetiroemp1PropertyChange

    private void fecharetiroemp_a1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_fecharetiroemp_a1PropertyChange
        anio2_2 = fecharetiroemp_a1.getYear();
        anioR2 = String.valueOf(anio2_2);
        int dmes = 0;
        int danios;
        int r;
        int rr;
        int k;
        if (anio1_2 == anio2_2) {
            dmes = (mes2_2 - mes1_2);
        } else {
            danios = (anio2_2 - anio1_2);
            if (danios == 1) {
                r = (12 - mes1_2);
                dmes = (r + mes2_2);
            } else if (danios > 1) {
                rr = ((danios - 1) * 12);
                k = (12 - mes1_2);
                dmes = (k + rr + mes2_2);
            }
        }
        String pp = Integer.toString(dmes);
        sptiempolaboro1.setText(pp);
        meses2 = pp;
    }//GEN-LAST:event_fecharetiroemp_a1PropertyChange

    private void txtdiligencielosdatosmotivo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdiligencielosdatosmotivo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdiligencielosdatosmotivo1ActionPerformed

    private void txtdiligencielosdatosmotivo1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdiligencielosdatosmotivo1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdiligencielosdatosmotivo1KeyTyped

    private void jCheckBox52ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox52ItemStateChanged
        if (jCheckBox52.isSelected()) {
            fechaingresoemp1.setEnabled(false);
            fecharetiroemp1.setEnabled(false);
            fechaingresoemp_a1.setEnabled(false);
            fecharetiroemp_a1.setEnabled(false);
            sptiempolaboro1.setEnabled(true);
            HistoriaLaboral.setVnfecha2(false);
        } else {
            fechaingresoemp1.setEnabled(true);
            fecharetiroemp1.setEnabled(true);
            fechaingresoemp_a1.setEnabled(true);
            fecharetiroemp_a1.setEnabled(true);
            sptiempolaboro1.setEnabled(false);
            HistoriaLaboral.setVnfecha2(true);
        }
    }//GEN-LAST:event_jCheckBox52ItemStateChanged

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        HistoriaLaboral.setEmpleo3("hay");
        jPanel5.setVisible(true); //siguiente panel
        jLabel27.setVisible(false); // signo menos del anterior del anterior
        jLabel14.setVisible(false); //signo más del anterior (este)
        jLabel28.setVisible(true); //signo menos del anterior
        jLabel50.setVisible(false); //signo menos del siguiente       
    }//GEN-LAST:event_jLabel14MouseClicked

    private void jLabel28MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel28MouseClicked
        HistoriaLaboral.setEmpleo3("nohay");
        jPanel5.setVisible(false); //siguiente panel
        jLabel27.setVisible(true); // signo menos del anterior del anterior
        jLabel14.setVisible(true); //signo más del anterior (este)
        jLabel28.setVisible(false); //signo menos del anterior
        jLabel50.setVisible(true); //signo menos del siguiente      
    }//GEN-LAST:event_jLabel28MouseClicked

    private void txtdiligencielosdatoscargo3CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtdiligencielosdatoscargo3CaretUpdate
        HistoriaLaboral.setCargotrabe3(txtdiligencielosdatoscargo3.getText());
    }//GEN-LAST:event_txtdiligencielosdatoscargo3CaretUpdate

    private void txtdiligencielosdatoscargo3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdiligencielosdatoscargo3KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdiligencielosdatoscargo3KeyTyped

    private void txtdiligencielosdatosempresa3CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtdiligencielosdatosempresa3CaretUpdate
        HistoriaLaboral.setEmpresa3(txtdiligencielosdatosempresa3.getText());
    }//GEN-LAST:event_txtdiligencielosdatosempresa3CaretUpdate

    private void txtdiligencielosdatosempresa3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdiligencielosdatosempresa3KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdiligencielosdatosempresa3KeyTyped

    private void txtdiligencielosdatoslugar3CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtdiligencielosdatoslugar3CaretUpdate
        HistoriaLaboral.setLugarempresa3(txtdiligencielosdatoslugar3.getText());
    }//GEN-LAST:event_txtdiligencielosdatoslugar3CaretUpdate

    private void txtdiligencielosdatoslugar3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdiligencielosdatoslugar3KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdiligencielosdatoslugar3KeyTyped

    private void txtdiligencielosdatossalario3CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtdiligencielosdatossalario3CaretUpdate
        HistoriaLaboral.setSalariobe3(txtdiligencielosdatossalario3.getText());
    }//GEN-LAST:event_txtdiligencielosdatossalario3CaretUpdate

    private void txtdiligencielosdatossalario3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdiligencielosdatossalario3KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdiligencielosdatossalario3KeyTyped

    private void fechaingresoemp3PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_fechaingresoemp3PropertyChange
        int m = fechaingresoemp3.getMonth();
        mes1_3 = m + 1;

        switch (mes1_3) {
            case 1:
                mesI3 = "Enero";
                break;
            case 2:
                mesI3 = "Febrero";
                break;
            case 3:
                mesI3 = "Marzo";
                break;
            case 4:
                mesI3 = "Abril";
                break;
            case 5:
                mesI3 = "Mayo";
                break;
            case 6:
                mesI3 = "Junio";
                break;
            case 7:
                mesI3 = "Julio";
                break;
            case 8:
                mesI3 = "Agosto";
                break;
            case 9:
                mesI3 = "Septiembre";
                break;
            case 10:
                mesI3 = "Octubre";
                break;
            case 11:
                mesI3 = "Noviembre";
                break;
            case 12:
                mesI3 = "Diciembre";
                break;
            default:
                break;
        }
    }//GEN-LAST:event_fechaingresoemp3PropertyChange

    private void fechaingresoemp_a3PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_fechaingresoemp_a3PropertyChange
        anio1_3 = fechaingresoemp_a3.getYear();
        anioI3 = String.valueOf(anio1_3);
    }//GEN-LAST:event_fechaingresoemp_a3PropertyChange

    private void sptiempolaboro3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sptiempolaboro3KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_sptiempolaboro3KeyTyped

    private void fecharetiroemp3PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_fecharetiroemp3PropertyChange
        int m2 = fecharetiroemp3.getMonth();
        mes2_3 = m2 + 1;
        switch (mes2_3) {
            case 1:
                mesR3 = "Enero";
                break;
            case 2:
                mesR3 = "Febrero";
                break;
            case 3:
                mesR3 = "Marzo";
                break;
            case 4:
                mesR3 = "Abril";
                break;
            case 5:
                mesR3 = "Mayo";
                break;
            case 6:
                mesR3 = "Junio";
                break;
            case 7:
                mesR3 = "Julio";
                break;
            case 8:
                mesR3 = "Agosto";
                break;
            case 9:
                mesR3 = "Septiembre";
                break;
            case 10:
                mesR3 = "Octubre";
                break;
            case 11:
                mesR3 = "Noviembre";
                break;
            case 12:
                mesR3 = "Diciembre";
                break;
            default:
                break;
        }

        String aa = Integer.toString(anio2_3);
        if (aa != null) {
            anio2_3 = fecharetiroemp_a3.getYear();
            int dmes = 0;
            int danios;
            int r;
            int rr;
            int k;
            if (anio1_3 == anio2_3) {
                dmes = (mes2_3 - mes1_3);
            } else {
                danios = (anio2_3 - anio1_3);
                if (danios == 1) {
                    r = (12 - mes1_3);
                    dmes = (r + mes2_3);
                } else if (danios > 1) {
                    rr = ((danios - 1) * 12);
                    k = (12 - mes1_3);
                    dmes = (k + rr + mes2_3);
                }
            }
            String pp = Integer.toString(dmes);
            sptiempolaboro3.setText(pp);
            meses3 = pp;
        }
    }//GEN-LAST:event_fecharetiroemp3PropertyChange

    private void fecharetiroemp_a3PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_fecharetiroemp_a3PropertyChange
        anio2_3 = fecharetiroemp_a3.getYear();
        anioR3 = String.valueOf(anio2_3);
        int dmes = 0;
        int danios;
        int r;
        int rr;
        int k;
        if (anio1_3 == anio2_3) {
            dmes = (mes2_3 - mes1_3);
        } else {
            danios = (anio2_3 - anio1_3);
            if (danios == 1) {
                r = (12 - mes1_3);
                dmes = (r + mes2_3);
            } else if (danios > 1) {
                rr = ((danios - 1) * 12);
                k = (12 - mes1_3);
                dmes = (k + rr + mes2_3);
            }
        }
        String pp = Integer.toString(dmes);
        sptiempolaboro3.setText(pp);
        meses3 = pp;
    }//GEN-LAST:event_fecharetiroemp_a3PropertyChange

    private void txtdiligencielosdatosmotivo3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdiligencielosdatosmotivo3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdiligencielosdatosmotivo3ActionPerformed

    private void txtdiligencielosdatosmotivo3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdiligencielosdatosmotivo3KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdiligencielosdatosmotivo3KeyTyped

    private void jCheckBox54ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox54ItemStateChanged
        if (jCheckBox54.isSelected()) {
            fechaingresoemp3.setEnabled(false);
            fecharetiroemp3.setEnabled(false);
            fechaingresoemp_a3.setEnabled(false);
            fecharetiroemp_a3.setEnabled(false);
            sptiempolaboro3.setEnabled(true);
            HistoriaLaboral.setVnfecha3(false);
        } else {
            fechaingresoemp3.setEnabled(true);
            fecharetiroemp3.setEnabled(true);
            fechaingresoemp_a3.setEnabled(true);
            fecharetiroemp_a3.setEnabled(true);
            sptiempolaboro3.setEnabled(false);
            HistoriaLaboral.setVnfecha3(true);
        }
    }//GEN-LAST:event_jCheckBox54ItemStateChanged

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
        HistoriaLaboral.setEmpleo4("hay");
        jPanel6.setVisible(true); //siguiente panel
        jLabel28.setVisible(false); // signo menos del anterior del anterior
        jLabel16.setVisible(false); //signo más del anterior (este)
        jLabel50.setVisible(true); //signo menos del anterior
        jLabel56.setVisible(false); //signo menos del siguiente
    }//GEN-LAST:event_jLabel16MouseClicked

    private void jLabel50MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel50MouseClicked
        HistoriaLaboral.setEmpleo4("nohay");
        jPanel6.setVisible(false); //siguiente panel
        jLabel28.setVisible(true); // signo menos del anterior del anterior
        jLabel16.setVisible(true); //signo más del anterior (este)
        jLabel50.setVisible(false); //signo menos del anterior
        jLabel56.setVisible(true); //signo menos del siguiente
    }//GEN-LAST:event_jLabel50MouseClicked

    private void txtdiligencielosdatoscargo4CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtdiligencielosdatoscargo4CaretUpdate
        HistoriaLaboral.setCargotrabe4(txtdiligencielosdatoscargo4.getText());
    }//GEN-LAST:event_txtdiligencielosdatoscargo4CaretUpdate

    private void txtdiligencielosdatoscargo4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdiligencielosdatoscargo4KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdiligencielosdatoscargo4KeyTyped

    private void txtdiligencielosdatosempresa4CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtdiligencielosdatosempresa4CaretUpdate
        HistoriaLaboral.setEmpresa4(txtdiligencielosdatosempresa4.getText());
    }//GEN-LAST:event_txtdiligencielosdatosempresa4CaretUpdate

    private void txtdiligencielosdatosempresa4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdiligencielosdatosempresa4KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdiligencielosdatosempresa4KeyTyped

    private void txtdiligencielosdatoslugar4CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtdiligencielosdatoslugar4CaretUpdate
        HistoriaLaboral.setLugarempresa4(txtdiligencielosdatoslugar4.getText());
    }//GEN-LAST:event_txtdiligencielosdatoslugar4CaretUpdate

    private void txtdiligencielosdatoslugar4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdiligencielosdatoslugar4KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdiligencielosdatoslugar4KeyTyped

    private void txtdiligencielosdatossalario4CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtdiligencielosdatossalario4CaretUpdate
        HistoriaLaboral.setSalariobe4(txtdiligencielosdatossalario4.getText());
    }//GEN-LAST:event_txtdiligencielosdatossalario4CaretUpdate

    private void txtdiligencielosdatossalario4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdiligencielosdatossalario4KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdiligencielosdatossalario4KeyTyped

    private void fechaingresoemp4PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_fechaingresoemp4PropertyChange
        int m = fechaingresoemp4.getMonth();
        mes1_4 = m + 1;

        switch (mes1_4) {
            case 1:
                mesI4 = "Enero";
                break;
            case 2:
                mesI4 = "Febrero";
                break;
            case 3:
                mesI4 = "Marzo";
                break;
            case 4:
                mesI4 = "Abril";
                break;
            case 5:
                mesI4 = "Mayo";
                break;
            case 6:
                mesI4 = "Junio";
                break;
            case 7:
                mesI4 = "Julio";
                break;
            case 8:
                mesI4 = "Agosto";
                break;
            case 9:
                mesI4 = "Septiembre";
                break;
            case 10:
                mesI4 = "Octubre";
                break;
            case 11:
                mesI4 = "Noviembre";
                break;
            case 12:
                mesI4 = "Diciembre";
                break;
            default:
                break;
        }
    }//GEN-LAST:event_fechaingresoemp4PropertyChange

    private void fechaingresoemp_a4PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_fechaingresoemp_a4PropertyChange
        anio1_4 = fechaingresoemp_a4.getYear();
        anioI4 = String.valueOf(anio1_4);
    }//GEN-LAST:event_fechaingresoemp_a4PropertyChange

    private void sptiempolaboro4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sptiempolaboro4KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_sptiempolaboro4KeyTyped

    private void fecharetiroemp4PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_fecharetiroemp4PropertyChange
        int m2 = fecharetiroemp4.getMonth();
        mes2_4 = m2 + 1;
        switch (mes2_4) {
            case 1:
                mesR4 = "Enero";
                break;
            case 2:
                mesR4 = "Febrero";
                break;
            case 3:
                mesR4 = "Marzo";
                break;
            case 4:
                mesR4 = "Abril";
                break;
            case 5:
                mesR4 = "Mayo";
                break;
            case 6:
                mesR4 = "Junio";
                break;
            case 7:
                mesR4 = "Julio";
                break;
            case 8:
                mesR4 = "Agosto";
                break;
            case 9:
                mesR4 = "Septiembre";
                break;
            case 10:
                mesR4 = "Octubre";
                break;
            case 11:
                mesR4 = "Noviembre";
                break;
            case 12:
                mesR4 = "Diciembre";
                break;
            default:
                break;
        }

        String aa = Integer.toString(anio2_4);
        if (aa != null) {
            anio2_4 = fecharetiroemp_a4.getYear();
            int dmes = 0;
            int danios;
            int r;
            int rr;
            int k;
            if (anio1_4 == anio2_4) {
                dmes = (mes2_4 - mes1_4);
            } else {
                danios = (anio2_4 - anio1_4);
                if (danios == 1) {
                    r = (12 - mes1_4);
                    dmes = (r + mes2_4);
                } else if (danios > 1) {
                    rr = ((danios - 1) * 12);
                    k = (12 - mes1_4);
                    dmes = (k + rr + mes2_4);
                }
            }
            String pp = Integer.toString(dmes);
            sptiempolaboro4.setText(pp);
            meses4 = pp;
        }
    }//GEN-LAST:event_fecharetiroemp4PropertyChange

    private void fecharetiroemp_a4PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_fecharetiroemp_a4PropertyChange
      anio2_4 = fecharetiroemp_a4.getYear();
        anioR4 = String.valueOf(anio2_4);
        int dmes = 0;
        int danios;
        int r;
        int rr;
        int k;
        if (anio1_4 == anio2_4) {
            dmes = (mes2_4 - mes1_4);
        } else {
            danios = (anio2_4 - anio1_4);
            if (danios == 1) {
                r = (12 - mes1_4);
                dmes = (r + mes2_4);
            } else if (danios > 1) {
                rr = ((danios - 1) * 12);
                k = (12 - mes1_4);
                dmes = (k + rr + mes2_4);
            }
        }
        String pp = Integer.toString(dmes);
        sptiempolaboro4.setText(pp);
        meses4 = pp;
    }//GEN-LAST:event_fecharetiroemp_a4PropertyChange

    private void txtdiligencielosdatosmotivo4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdiligencielosdatosmotivo4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdiligencielosdatosmotivo4ActionPerformed

    private void txtdiligencielosdatosmotivo4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdiligencielosdatosmotivo4KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdiligencielosdatosmotivo4KeyTyped

    private void jCheckBox55ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox55ItemStateChanged
        if (jCheckBox55.isSelected()) {
            fechaingresoemp4.setEnabled(false);
            fecharetiroemp4.setEnabled(false);
            fechaingresoemp_a4.setEnabled(false);
            fecharetiroemp_a4.setEnabled(false);
            sptiempolaboro4.setEnabled(true);
            HistoriaLaboral.setVnfecha4(false);
        } else {
            fechaingresoemp4.setEnabled(true);
            fecharetiroemp4.setEnabled(true);
            fechaingresoemp_a4.setEnabled(true);
            fecharetiroemp_a4.setEnabled(true);
            sptiempolaboro4.setEnabled(false);
            HistoriaLaboral.setVnfecha4(true);
        }
    }//GEN-LAST:event_jCheckBox55ItemStateChanged

    private void jLabel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseClicked
        HistoriaLaboral.setEmpleo5("hay");
        jPanel7.setVisible(true); //siguiente panel
        jLabel50.setVisible(false); // signo menos del anterior del anterior
        jLabel17.setVisible(false); //signo más del anterior (este)
        jLabel56.setVisible(true); //signo menos del anterior
        jLabel62.setVisible(false); //signo menos del siguiente
    }//GEN-LAST:event_jLabel17MouseClicked

    private void jLabel56MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel56MouseClicked
        HistoriaLaboral.setEmpleo5("nohay");
        jPanel7.setVisible(false); //siguiente panel
        jLabel50.setVisible(true); // signo menos del anterior del anterior
        jLabel17.setVisible(true); //signo más del anterior (este)
        jLabel56.setVisible(false); //signo menos del anterior
        jLabel62.setVisible(true); //signo menos del siguiente
    }//GEN-LAST:event_jLabel56MouseClicked

    private void txtdiligencielosdatoscargo5CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtdiligencielosdatoscargo5CaretUpdate
        HistoriaLaboral.setCargotrabe5(txtdiligencielosdatoscargo5.getText());
    }//GEN-LAST:event_txtdiligencielosdatoscargo5CaretUpdate

    private void txtdiligencielosdatoscargo5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdiligencielosdatoscargo5KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdiligencielosdatoscargo5KeyTyped

    private void txtdiligencielosdatosempresa5CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtdiligencielosdatosempresa5CaretUpdate
        HistoriaLaboral.setEmpresa5(txtdiligencielosdatosempresa5.getText());
    }//GEN-LAST:event_txtdiligencielosdatosempresa5CaretUpdate

    private void txtdiligencielosdatosempresa5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdiligencielosdatosempresa5KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdiligencielosdatosempresa5KeyTyped

    private void txtdiligencielosdatoslugar5CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtdiligencielosdatoslugar5CaretUpdate
        HistoriaLaboral.setLugarempresa5(txtdiligencielosdatoslugar5.getText());
    }//GEN-LAST:event_txtdiligencielosdatoslugar5CaretUpdate

    private void txtdiligencielosdatoslugar5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdiligencielosdatoslugar5KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdiligencielosdatoslugar5KeyTyped

    private void txtdiligencielosdatossalario5CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtdiligencielosdatossalario5CaretUpdate
        HistoriaLaboral.setSalariobe5(txtdiligencielosdatossalario5.getText());
    }//GEN-LAST:event_txtdiligencielosdatossalario5CaretUpdate

    private void txtdiligencielosdatossalario5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdiligencielosdatossalario5KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdiligencielosdatossalario5KeyTyped

    private void fechaingresoemp5PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_fechaingresoemp5PropertyChange
        int m = fechaingresoemp5.getMonth();
        mes1_5 = m + 1;

        switch (mes1_5) {
            case 1:
                mesI5 = "Enero";
                break;
            case 2:
                mesI5 = "Febrero";
                break;
            case 3:
                mesI5 = "Marzo";
                break;
            case 4:
                mesI5 = "Abril";
                break;
            case 5:
                mesI5 = "Mayo";
                break;
            case 6:
                mesI5 = "Junio";
                break;
            case 7:
                mesI5 = "Julio";
                break;
            case 8:
                mesI5 = "Agosto";
                break;
            case 9:
                mesI5 = "Septiembre";
                break;
            case 10:
                mesI5 = "Octubre";
                break;
            case 11:
                mesI5 = "Noviembre";
                break;
            case 12:
                mesI5 = "Diciembre";
                break;
            default:
                break;
        }
    }//GEN-LAST:event_fechaingresoemp5PropertyChange

    private void fechaingresoemp_a5PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_fechaingresoemp_a5PropertyChange
        anio1_5 = fechaingresoemp_a5.getYear();
        anioI5 = String.valueOf(anio1_5);
    }//GEN-LAST:event_fechaingresoemp_a5PropertyChange

    private void sptiempolaboro5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sptiempolaboro5KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_sptiempolaboro5KeyTyped

    private void fecharetiroemp5PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_fecharetiroemp5PropertyChange
        int m2 = fecharetiroemp5.getMonth();
        mes2_5 = m2 + 1;
        switch (mes2_5) {
            case 1:
                mesR5 = "Enero";
                break;
            case 2:
                mesR5 = "Febrero";
                break;
            case 3:
                mesR5 = "Marzo";
                break;
            case 4:
                mesR5 = "Abril";
                break;
            case 5:
                mesR5 = "Mayo";
                break;
            case 6:
                mesR5 = "Junio";
                break;
            case 7:
                mesR5 = "Julio";
                break;
            case 8:
                mesR5 = "Agosto";
                break;
            case 9:
                mesR5 = "Septiembre";
                break;
            case 10:
                mesR5 = "Octubre";
                break;
            case 11:
                mesR5 = "Noviembre";
                break;
            case 12:
                mesR5 = "Diciembre";
                break;
            default:
                break;
        }

        String aa = Integer.toString(anio2_5);
        if (aa != null) {
            anio2_5 = fecharetiroemp_a5.getYear();
            int dmes = 0;
            int danios;
            int r;
            int rr;
            int k;
            if (anio1_5 == anio2_5) {
                dmes = (mes2_5 - mes1_5);
            } else {
                danios = (anio2_5 - anio1_5);
                if (danios == 1) {
                    r = (12 - mes1_5);
                    dmes = (r + mes2_5);
                } else if (danios > 1) {
                    rr = ((danios - 1) * 12);
                    k = (12 - mes1_5);
                    dmes = (k + rr + mes2_5);
                }
            }
            String pp = Integer.toString(dmes);
            sptiempolaboro5.setText(pp);
            meses5 = pp;
        }
    }//GEN-LAST:event_fecharetiroemp5PropertyChange

    private void fecharetiroemp_a5PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_fecharetiroemp_a5PropertyChange
        anio2_5 = fecharetiroemp_a5.getYear();
        anioR5 = String.valueOf(anio2_5);
        int dmes = 0;
        int danios;
        int r;
        int rr;
        int k;
        if (anio1_5 == anio2_5) {
            dmes = (mes2_5 - mes1_5);
        } else {
            danios = (anio2_5 - anio1_5);
            if (danios == 1) {
                r = (12 - mes1_5);
                dmes = (r + mes2_5);
            } else if (danios > 1) {
                rr = ((danios - 1) * 12);
                k = (12 - mes1_5);
                dmes = (k + rr + mes2_5);
            }
        }
        String pp = Integer.toString(dmes);
        sptiempolaboro5.setText(pp);
        meses5 = pp;
    }//GEN-LAST:event_fecharetiroemp_a5PropertyChange

    private void txtdiligencielosdatosmotivo5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdiligencielosdatosmotivo5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdiligencielosdatosmotivo5ActionPerformed

    private void txtdiligencielosdatosmotivo5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdiligencielosdatosmotivo5KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdiligencielosdatosmotivo5KeyTyped

    private void jCheckBox56ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox56ItemStateChanged
        if (jCheckBox56.isSelected()) {
            fechaingresoemp5.setEnabled(false);
            fecharetiroemp5.setEnabled(false);
            fechaingresoemp_a5.setEnabled(false);
            fecharetiroemp_a5.setEnabled(false);
            sptiempolaboro5.setEnabled(true);
            HistoriaLaboral.setVnfecha5(false);
        } else {
            fechaingresoemp5.setEnabled(true);
            fecharetiroemp5.setEnabled(true);
            fechaingresoemp_a5.setEnabled(true);
            fecharetiroemp_a5.setEnabled(true);
            sptiempolaboro5.setEnabled(false);
            HistoriaLaboral.setVnfecha5(true);
        }
    }//GEN-LAST:event_jCheckBox56ItemStateChanged

    private void jLabel18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseClicked
        HistoriaLaboral.setEmpleo6("hay");
        jPanel8.setVisible(true); //siguiente panel
        jLabel56.setVisible(false); // signo menos del anterior del anterior
        jLabel18.setVisible(false); //signo más del anterior (este)
        jLabel62.setVisible(true); //signo menos del anterior
        jLabel68.setVisible(false); //signo menos del siguiente
    }//GEN-LAST:event_jLabel18MouseClicked

    private void jLabel62MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel62MouseClicked
        HistoriaLaboral.setEmpleo6("nohay");
        jPanel8.setVisible(false); //siguiente panel
        jLabel56.setVisible(true); // signo menos del anterior del anterior
        jLabel18.setVisible(true); //signo más del anterior (este)
        jLabel62.setVisible(false); //signo menos del anterior
        jLabel68.setVisible(true); //signo menos del siguiente
    }//GEN-LAST:event_jLabel62MouseClicked

    private void txtdiligencielosdatoscargo6CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtdiligencielosdatoscargo6CaretUpdate
        HistoriaLaboral.setCargotrabe6(txtdiligencielosdatoscargo6.getText());
    }//GEN-LAST:event_txtdiligencielosdatoscargo6CaretUpdate

    private void txtdiligencielosdatoscargo6KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdiligencielosdatoscargo6KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdiligencielosdatoscargo6KeyTyped

    private void txtdiligencielosdatosempresa6CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtdiligencielosdatosempresa6CaretUpdate
        HistoriaLaboral.setEmpresa6(txtdiligencielosdatosempresa6.getText());
    }//GEN-LAST:event_txtdiligencielosdatosempresa6CaretUpdate

    private void txtdiligencielosdatosempresa6KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdiligencielosdatosempresa6KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdiligencielosdatosempresa6KeyTyped

    private void txtdiligencielosdatoslugar6CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtdiligencielosdatoslugar6CaretUpdate
        HistoriaLaboral.setLugarempresa6(txtdiligencielosdatoslugar6.getText());
    }//GEN-LAST:event_txtdiligencielosdatoslugar6CaretUpdate

    private void txtdiligencielosdatoslugar6KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdiligencielosdatoslugar6KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdiligencielosdatoslugar6KeyTyped

    private void txtdiligencielosdatossalario6CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtdiligencielosdatossalario6CaretUpdate
        HistoriaLaboral.setSalariobe6(txtdiligencielosdatossalario6.getText());
    }//GEN-LAST:event_txtdiligencielosdatossalario6CaretUpdate

    private void txtdiligencielosdatossalario6KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdiligencielosdatossalario6KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdiligencielosdatossalario6KeyTyped

    private void fechaingresoemp6PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_fechaingresoemp6PropertyChange
        int m = fechaingresoemp6.getMonth();
        mes1_6 = m + 1;

        switch (mes1_6) {
            case 1:
                mesI6 = "Enero";
                break;
            case 2:
                mesI6 = "Febrero";
                break;
            case 3:
                mesI6 = "Marzo";
                break;
            case 4:
                mesI6 = "Abril";
                break;
            case 5:
                mesI6 = "Mayo";
                break;
            case 6:
                mesI6 = "Junio";
                break;
            case 7:
                mesI6 = "Julio";
                break;
            case 8:
                mesI6 = "Agosto";
                break;
            case 9:
                mesI6 = "Septiembre";
                break;
            case 10:
                mesI6 = "Octubre";
                break;
            case 11:
                mesI6 = "Noviembre";
                break;
            case 12:
                mesI6 = "Diciembre";
                break;
            default:
                break;
        }
    }//GEN-LAST:event_fechaingresoemp6PropertyChange

    private void fechaingresoemp_a6PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_fechaingresoemp_a6PropertyChange
        anio1_6 = fechaingresoemp_a6.getYear();
        anioI6 = String.valueOf(anio1_6);
    }//GEN-LAST:event_fechaingresoemp_a6PropertyChange

    private void sptiempolaboro6KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sptiempolaboro6KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_sptiempolaboro6KeyTyped

    private void fecharetiroemp6PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_fecharetiroemp6PropertyChange
        int m2 = fecharetiroemp6.getMonth();
        mes2_6 = m2 + 1;
        switch (mes2_6) {
            case 1:
                mesR6 = "Enero";
                break;
            case 2:
                mesR6 = "Febrero";
                break;
            case 3:
                mesR6 = "Marzo";
                break;
            case 4:
                mesR6 = "Abril";
                break;
            case 5:
                mesR6 = "Mayo";
                break;
            case 6:
                mesR6 = "Junio";
                break;
            case 7:
                mesR6 = "Julio";
                break;
            case 8:
                mesR6= "Agosto";
                break;
            case 9:
                mesR6 = "Septiembre";
                break;
            case 10:
                mesR6 = "Octubre";
                break;
            case 11:
                mesR6 = "Noviembre";
                break;
            case 12:
                mesR6 = "Diciembre";
                break;
            default:
                break;
        }

        String aa = Integer.toString(anio2_6);
        if (aa != null) {
            anio2_6 = fecharetiroemp_a6.getYear();
            int dmes = 0;
            int danios;
            int r;
            int rr;
            int k;
            if (anio1_6 == anio2_6) {
                dmes = (mes2_6 - mes1_6);
            } else {
                danios = (anio2 - anio1);
                if (danios == 1) {
                    r = (12 - mes1_6);
                    dmes = (r + mes2_6);
                } else if (danios > 1) {
                    rr = ((danios - 1) * 12);
                    k = (12 - mes1_6);
                    dmes = (k + rr + mes2_6);
                }
            }
            String pp = Integer.toString(dmes);
            sptiempolaboro6.setText(pp);
            meses6 = pp;
        }
    }//GEN-LAST:event_fecharetiroemp6PropertyChange

    private void fecharetiroemp_a6PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_fecharetiroemp_a6PropertyChange
        anio2_6 = fecharetiroemp_a6.getYear();
        anioR6 = String.valueOf(anio2_6);
        int dmes = 0;
        int danios;
        int r;
        int rr;
        int k;
        if (anio1_6 == anio2_6) {
            dmes = (mes2_6 - mes1_6);
        } else {
            danios = (anio2_6 - anio1_6);
            if (danios == 1) {
                r = (12 - mes1_6);
                dmes = (r + mes2_6);
            } else if (danios > 1) {
                rr = ((danios - 1) * 12);
                k = (12 - mes1_6);
                dmes = (k + rr + mes2_6);
            }
        }
        String pp = Integer.toString(dmes);
        sptiempolaboro6.setText(pp);
        meses6 = pp;
    }//GEN-LAST:event_fecharetiroemp_a6PropertyChange

    private void txtdiligencielosdatosmotivo6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdiligencielosdatosmotivo6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdiligencielosdatosmotivo6ActionPerformed

    private void txtdiligencielosdatosmotivo6KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdiligencielosdatosmotivo6KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdiligencielosdatosmotivo6KeyTyped

    private void jCheckBox57ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox57ItemStateChanged
        if (jCheckBox57.isSelected()) {
            fechaingresoemp6.setEnabled(false);
            fecharetiroemp6.setEnabled(false);
            fechaingresoemp_a6.setEnabled(false);
            fecharetiroemp_a6.setEnabled(false);
            sptiempolaboro6.setEnabled(true);
            HistoriaLaboral.setVnfecha6(false);
        } else {
            fechaingresoemp6.setEnabled(true);
            fecharetiroemp6.setEnabled(true);
            fechaingresoemp_a6.setEnabled(true);
            fecharetiroemp_a6.setEnabled(true);
            sptiempolaboro6.setEnabled(false);
            HistoriaLaboral.setVnfecha6(true);
        }
    }//GEN-LAST:event_jCheckBox57ItemStateChanged

    private void jLabel19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseClicked
        HistoriaLaboral.setEmpleo7("hay");
        jPanel9.setVisible(true); //siguiente panel
        jLabel62.setVisible(false); // signo menos del anterior del anterior
        jLabel19.setVisible(false); //signo más del anterior (este)
        jLabel68.setVisible(true); //signo menos del anterior
        jLabel74.setVisible(false); //signo menos del siguiente
    }//GEN-LAST:event_jLabel19MouseClicked

    private void jLabel68MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel68MouseClicked
        HistoriaLaboral.setEmpleo7("nohay");
        jPanel9.setVisible(false); //siguiente panel
        jLabel62.setVisible(true); // signo menos del anterior del anterior
        jLabel19.setVisible(true); //signo más del anterior (este)
        jLabel68.setVisible(false); //signo menos del anterior
        jLabel74.setVisible(true); //signo menos del siguiente
    }//GEN-LAST:event_jLabel68MouseClicked

    private void txtdiligencielosdatoscargo7CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtdiligencielosdatoscargo7CaretUpdate
        HistoriaLaboral.setCargotrabe7(txtdiligencielosdatoscargo7.getText());
    }//GEN-LAST:event_txtdiligencielosdatoscargo7CaretUpdate

    private void txtdiligencielosdatoscargo7KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdiligencielosdatoscargo7KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdiligencielosdatoscargo7KeyTyped

    private void txtdiligencielosdatosempresa7CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtdiligencielosdatosempresa7CaretUpdate
        HistoriaLaboral.setEmpresa7(txtdiligencielosdatosempresa7.getText());
    }//GEN-LAST:event_txtdiligencielosdatosempresa7CaretUpdate

    private void txtdiligencielosdatosempresa7KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdiligencielosdatosempresa7KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdiligencielosdatosempresa7KeyTyped

    private void txtdiligencielosdatoslugar7CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtdiligencielosdatoslugar7CaretUpdate
        HistoriaLaboral.setLugarempresa7(txtdiligencielosdatoslugar7.getText());
    }//GEN-LAST:event_txtdiligencielosdatoslugar7CaretUpdate

    private void txtdiligencielosdatoslugar7KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdiligencielosdatoslugar7KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdiligencielosdatoslugar7KeyTyped

    private void txtdiligencielosdatossalario7CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtdiligencielosdatossalario7CaretUpdate
        HistoriaLaboral.setSalariobe7(txtdiligencielosdatossalario7.getText());
    }//GEN-LAST:event_txtdiligencielosdatossalario7CaretUpdate

    private void txtdiligencielosdatossalario7KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdiligencielosdatossalario7KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdiligencielosdatossalario7KeyTyped

    private void fechaingresoemp7PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_fechaingresoemp7PropertyChange
        int m = fechaingresoemp7.getMonth();
        mes1_7 = m + 1;

        switch (mes1_7) {
            case 1:
                mesI7 = "Enero";
                break;
            case 2:
                mesI7 = "Febrero";
                break;
            case 3:
                mesI7 = "Marzo";
                break;
            case 4:
                mesI7 = "Abril";
                break;
            case 5:
                mesI7 = "Mayo";
                break;
            case 6:
                mesI7 = "Junio";
                break;
            case 7:
                mesI7 = "Julio";
                break;
            case 8:
                mesI7 = "Agosto";
                break;
            case 9:
                mesI7 = "Septiembre";
                break;
            case 10:
                mesI7 = "Octubre";
                break;
            case 11:
                mesI7 = "Noviembre";
                break;
            case 12:
                mesI7 = "Diciembre";
                break;
            default:
                break;
        }
    }//GEN-LAST:event_fechaingresoemp7PropertyChange

    private void fechaingresoemp_a7PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_fechaingresoemp_a7PropertyChange
        anio1_7 = fechaingresoemp_a7.getYear();
        anioI7 = String.valueOf(anio1_7);
    }//GEN-LAST:event_fechaingresoemp_a7PropertyChange

    private void sptiempolaboro7KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sptiempolaboro7KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_sptiempolaboro7KeyTyped

    private void fecharetiroemp7PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_fecharetiroemp7PropertyChange
        int m2 = fecharetiroemp7.getMonth();
        mes2_7 = m2 + 1;
        switch (mes2_7) {
            case 1:
                mesR7 = "Enero";
                break;
            case 2:
                mesR7 = "Febrero";
                break;
            case 3:
                mesR7 = "Marzo";
                break;
            case 4:
                mesR7 = "Abril";
                break;
            case 5:
                mesR7 = "Mayo";
                break;
            case 6:
                mesR7 = "Junio";
                break;
            case 7:
                mesR7 = "Julio";
                break;
            case 8:
                mesR7 = "Agosto";
                break;
            case 9:
                mesR7 = "Septiembre";
                break;
            case 10:
                mesR7 = "Octubre";
                break;
            case 11:
                mesR7 = "Noviembre";
                break;
            case 12:
                mesR7 = "Diciembre";
                break;
            default:
                break;
        }

        String aa = Integer.toString(anio2_7);
        if (aa != null) {
            anio2_7 = fecharetiroemp_a7.getYear();
            int dmes = 0;
            int danios;
            int r;
            int rr;
            int k;
            if (anio1_7 == anio2_7) {
                dmes = (mes2_7 - mes1_7);
            } else {
                danios = (anio2_7 - anio1_7);
                if (danios == 1) {
                    r = (12 - mes1_7);
                    dmes = (r + mes2_7);
                } else if (danios > 1) {
                    rr = ((danios - 1) * 12);
                    k = (12 - mes1_7);
                    dmes = (k + rr + mes2_7);
                }
            }
            String pp = Integer.toString(dmes);
            sptiempolaboro7.setText(pp);
            meses7 = pp;
        }
    }//GEN-LAST:event_fecharetiroemp7PropertyChange

    private void fecharetiroemp_a7PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_fecharetiroemp_a7PropertyChange
        anio2_7 = fecharetiroemp_a7.getYear();
        anioR7 = String.valueOf(anio2_7);
        int dmes = 0;
        int danios;
        int r;
        int rr;
        int k;
        if (anio1_7 == anio2_7) {
            dmes = (mes2_7 - mes1_7);
        } else {
            danios = (anio2_7 - anio1_7);
            if (danios == 1) {
                r = (12 - mes1_7);
                dmes = (r + mes2_7);
            } else if (danios > 1) {
                rr = ((danios - 1) * 12);
                k = (12 - mes1_7);
                dmes = (k + rr + mes2_7);
            }
        }
        String pp = Integer.toString(dmes);
        sptiempolaboro7.setText(pp);
        meses7 = pp;
    }//GEN-LAST:event_fecharetiroemp_a7PropertyChange

    private void txtdiligencielosdatosmotivo7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdiligencielosdatosmotivo7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdiligencielosdatosmotivo7ActionPerformed

    private void txtdiligencielosdatosmotivo7KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdiligencielosdatosmotivo7KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdiligencielosdatosmotivo7KeyTyped

    private void jCheckBox58ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox58ItemStateChanged
        if (jCheckBox58.isSelected()) {
            fechaingresoemp7.setEnabled(false);
            fecharetiroemp7.setEnabled(false);
            fechaingresoemp_a7.setEnabled(false);
            fecharetiroemp_a7.setEnabled(false);
            sptiempolaboro7.setEnabled(true);
            HistoriaLaboral.setVnfecha7(false);
        } else {
            fechaingresoemp7.setEnabled(true);
            fecharetiroemp7.setEnabled(true);
            fechaingresoemp_a7.setEnabled(true);
            fecharetiroemp_a7.setEnabled(true);
            sptiempolaboro7.setEnabled(false);
            HistoriaLaboral.setVnfecha7(true);
        }
    }//GEN-LAST:event_jCheckBox58ItemStateChanged

    private void jLabel20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseClicked
        HistoriaLaboral.setEmpleo8("hay");
        jPanel10.setVisible(true); //siguiente panel
        jLabel68.setVisible(false); // signo menos del anterior del anterior
        jLabel20.setVisible(false); //signo más del anterior (este)
        jLabel74.setVisible(true); //signo menos del anterior
        jLabel80.setVisible(false); //signo menos del siguiente
    }//GEN-LAST:event_jLabel20MouseClicked

    private void jLabel74MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel74MouseClicked
        HistoriaLaboral.setEmpleo8("nohay");
        jPanel10.setVisible(false); //siguiente panel
        jLabel68.setVisible(true); // signo menos del anterior del anterior
        jLabel20.setVisible(true); //signo más del anterior (este)
        jLabel74.setVisible(false); //signo menos del anterior
        jLabel80.setVisible(true); //signo menos del siguiente
    }//GEN-LAST:event_jLabel74MouseClicked

    private void txtdiligencielosdatoscargo8CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtdiligencielosdatoscargo8CaretUpdate
        HistoriaLaboral.setCargotrabe8(txtdiligencielosdatoscargo8.getText());
    }//GEN-LAST:event_txtdiligencielosdatoscargo8CaretUpdate

    private void txtdiligencielosdatoscargo8KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdiligencielosdatoscargo8KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdiligencielosdatoscargo8KeyTyped

    private void txtdiligencielosdatosempresa8CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtdiligencielosdatosempresa8CaretUpdate
        HistoriaLaboral.setEmpresa8(txtdiligencielosdatosempresa8.getText());
    }//GEN-LAST:event_txtdiligencielosdatosempresa8CaretUpdate

    private void txtdiligencielosdatosempresa8KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdiligencielosdatosempresa8KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdiligencielosdatosempresa8KeyTyped

    private void txtdiligencielosdatoslugar8CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtdiligencielosdatoslugar8CaretUpdate
        HistoriaLaboral.setLugarempresa8(txtdiligencielosdatoslugar8.getText());
    }//GEN-LAST:event_txtdiligencielosdatoslugar8CaretUpdate

    private void txtdiligencielosdatoslugar8KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdiligencielosdatoslugar8KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdiligencielosdatoslugar8KeyTyped

    private void txtdiligencielosdatossalario8CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtdiligencielosdatossalario8CaretUpdate
        HistoriaLaboral.setSalariobe8(txtdiligencielosdatossalario8.getText());
    }//GEN-LAST:event_txtdiligencielosdatossalario8CaretUpdate

    private void txtdiligencielosdatossalario8KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdiligencielosdatossalario8KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdiligencielosdatossalario8KeyTyped

    private void fechaingresoemp8PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_fechaingresoemp8PropertyChange
        int m = fechaingresoemp8.getMonth();
        mes1_8 = m + 1;

        switch (mes1_8) {
            case 1:
                mesI8 = "Enero";
                break;
            case 2:
                mesI8 = "Febrero";
                break;
            case 3:
                mesI8 = "Marzo";
                break;
            case 4:
                mesI8 = "Abril";
                break;
            case 5:
                mesI8 = "Mayo";
                break;
            case 6:
                mesI8 = "Junio";
                break;
            case 7:
                mesI8 = "Julio";
                break;
            case 8:
                mesI8 = "Agosto";
                break;
            case 9:
                mesI8 = "Septiembre";
                break;
            case 10:
                mesI8 = "Octubre";
                break;
            case 11:
                mesI8 = "Noviembre";
                break;
            case 12:
                mesI8 = "Diciembre";
                break;
            default:
                break;
        }
    }//GEN-LAST:event_fechaingresoemp8PropertyChange

    private void fechaingresoemp_a8PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_fechaingresoemp_a8PropertyChange
        anio1_8 = fechaingresoemp_a8.getYear();
        anioI8 = String.valueOf(anio1_8);
    }//GEN-LAST:event_fechaingresoemp_a8PropertyChange

    private void sptiempolaboro8KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sptiempolaboro8KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_sptiempolaboro8KeyTyped

    private void fecharetiroemp8PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_fecharetiroemp8PropertyChange
        int m2 = fecharetiroemp8.getMonth();
        mes2_8 = m2 + 1;
        switch (mes2_8) {
            case 1:
                mesR8 = "Enero";
                break;
            case 2:
                mesR8 = "Febrero";
                break;
            case 3:
                mesR8 = "Marzo";
                break;
            case 4:
                mesR8 = "Abril";
                break;
            case 5:
                mesR8 = "Mayo";
                break;
            case 6:
                mesR8 = "Junio";
                break;
            case 7:
                mesR8 = "Julio";
                break;
            case 8:
                mesR8 = "Agosto";
                break;
            case 9:
                mesR8 = "Septiembre";
                break;
            case 10:
                mesR8 = "Octubre";
                break;
            case 11:
                mesR8 = "Noviembre";
                break;
            case 12:
                mesR8 = "Diciembre";
                break;
            default:
                break;
        }

        String aa = Integer.toString(anio2_8);
        if (aa != null) {
            anio2_8 = fecharetiroemp_a8.getYear();
            int dmes = 0;
            int danios;
            int r;
            int rr;
            int k;
            if (anio1_8 == anio2_8) {
                dmes = (mes2_8 - mes1_8);
            } else {
                danios = (anio2_8 - anio1_8);
                if (danios == 1) {
                    r = (12 - mes1_8);
                    dmes = (r + mes2_8);
                } else if (danios > 1) {
                    rr = ((danios - 1) * 12);
                    k = (12 - mes1_8);
                    dmes = (k + rr + mes2_8);
                }
            }
            String pp = Integer.toString(dmes);
            sptiempolaboro8.setText(pp);
            meses8 = pp;
        }
    }//GEN-LAST:event_fecharetiroemp8PropertyChange

    private void fecharetiroemp_a8PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_fecharetiroemp_a8PropertyChange
        anio2_8 = fecharetiroemp_a8.getYear();
        anioR8 = String.valueOf(anio2_8);
        int dmes = 0;
        int danios;
        int r;
        int rr;
        int k;
        if (anio1_8 == anio2_8) {
            dmes = (mes2_8 - mes1_8);
        } else {
            danios = (anio2_8 - anio1_8);
            if (danios == 1) {
                r = (12 - mes1_8);
                dmes = (r + mes2_8);
            } else if (danios > 1) {
                rr = ((danios - 1) * 12);
                k = (12 - mes1_8);
                dmes = (k + rr + mes2_8);
            }
        }
        String pp = Integer.toString(dmes);
        sptiempolaboro8.setText(pp);
        meses8 = pp;
    }//GEN-LAST:event_fecharetiroemp_a8PropertyChange

    private void txtdiligencielosdatosmotivo8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdiligencielosdatosmotivo8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdiligencielosdatosmotivo8ActionPerformed

    private void txtdiligencielosdatosmotivo8KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdiligencielosdatosmotivo8KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdiligencielosdatosmotivo8KeyTyped

    private void jCheckBox59ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox59ItemStateChanged
        if (jCheckBox59.isSelected()) {
            fechaingresoemp8.setEnabled(false);
            fecharetiroemp8.setEnabled(false);
            fechaingresoemp_a8.setEnabled(false);
            fecharetiroemp_a8.setEnabled(false);
            sptiempolaboro8.setEnabled(true);
            HistoriaLaboral.setVnfecha8(false);
        } else {
            fechaingresoemp8.setEnabled(true);
            fecharetiroemp8.setEnabled(true);
            fechaingresoemp_a8.setEnabled(true);
            fecharetiroemp_a8.setEnabled(true);
            sptiempolaboro8.setEnabled(false);
            HistoriaLaboral.setVnfecha8(true);
        }
    }//GEN-LAST:event_jCheckBox59ItemStateChanged

    private void jLabel21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MouseClicked
        HistoriaLaboral.setEmpleo9("hay");
        jPanel11.setVisible(true); //siguiente panel
        jLabel74.setVisible(false); // signo menos del anterior del anterior
        jLabel21.setVisible(false); //signo más del anterior (este)
        jLabel80.setVisible(true); //signo menos del anterior
        jLabel86.setVisible(false); //signo menos del siguiente
    }//GEN-LAST:event_jLabel21MouseClicked

    private void jLabel80MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel80MouseClicked
        HistoriaLaboral.setEmpleo9("nohay");
        jPanel11.setVisible(false); //siguiente panel
        jLabel74.setVisible(true); // signo menos del anterior del anterior
        jLabel21.setVisible(true); //signo más del anterior (este)
        jLabel80.setVisible(false); //signo menos del anterior
        jLabel86.setVisible(true); //signo menos del siguiente
    }//GEN-LAST:event_jLabel80MouseClicked

    private void txtdiligencielosdatoscargo9CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtdiligencielosdatoscargo9CaretUpdate
        HistoriaLaboral.setCargotrabe9(txtdiligencielosdatoscargo9.getText());
    }//GEN-LAST:event_txtdiligencielosdatoscargo9CaretUpdate

    private void txtdiligencielosdatoscargo9KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdiligencielosdatoscargo9KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdiligencielosdatoscargo9KeyTyped

    private void txtdiligencielosdatosempresa9CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtdiligencielosdatosempresa9CaretUpdate
        HistoriaLaboral.setEmpresa9(txtdiligencielosdatosempresa9.getText());
    }//GEN-LAST:event_txtdiligencielosdatosempresa9CaretUpdate

    private void txtdiligencielosdatosempresa9KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdiligencielosdatosempresa9KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdiligencielosdatosempresa9KeyTyped

    private void txtdiligencielosdatoslugar9CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtdiligencielosdatoslugar9CaretUpdate
        HistoriaLaboral.setLugarempresa9(txtdiligencielosdatoslugar9.getText());
    }//GEN-LAST:event_txtdiligencielosdatoslugar9CaretUpdate

    private void txtdiligencielosdatoslugar9KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdiligencielosdatoslugar9KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdiligencielosdatoslugar9KeyTyped

    private void txtdiligencielosdatossalario9CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtdiligencielosdatossalario9CaretUpdate
        HistoriaLaboral.setSalariobe9(txtdiligencielosdatossalario9.getText());
    }//GEN-LAST:event_txtdiligencielosdatossalario9CaretUpdate

    private void txtdiligencielosdatossalario9KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdiligencielosdatossalario9KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdiligencielosdatossalario9KeyTyped

    private void fechaingresoemp9PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_fechaingresoemp9PropertyChange
        int m = fechaingresoemp9.getMonth();
        mes1_9 = m + 1;

        switch (mes1_9) {
            case 1:
                mesI9 = "Enero";
                break;
            case 2:
                mesI9 = "Febrero";
                break;
            case 3:
                mesI9 = "Marzo";
                break;
            case 4:
                mesI9 = "Abril";
                break;
            case 5:
                mesI9 = "Mayo";
                break;
            case 6:
                mesI9 = "Junio";
                break;
            case 7:
                mesI9 = "Julio";
                break;
            case 8:
                mesI9 = "Agosto";
                break;
            case 9:
                mesI9 = "Septiembre";
                break;
            case 10:
                mesI9 = "Octubre";
                break;
            case 11:
                mesI9 = "Noviembre";
                break;
            case 12:
                mesI9 = "Diciembre";
                break;
            default:
                break;
        }
    }//GEN-LAST:event_fechaingresoemp9PropertyChange

    private void fechaingresoemp_a9PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_fechaingresoemp_a9PropertyChange
        anio1_9 = fechaingresoemp_a9.getYear();
        anioI9 = String.valueOf(anio1_9);
    }//GEN-LAST:event_fechaingresoemp_a9PropertyChange

    private void sptiempolaboro9KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sptiempolaboro9KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_sptiempolaboro9KeyTyped

    private void fecharetiroemp9PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_fecharetiroemp9PropertyChange
        int m2 = fecharetiroemp9.getMonth();
        mes2_9 = m2 + 1;
        switch (mes2_9) {
            case 1:
                mesR9 = "Enero";
                break;
            case 2:
                mesR9 = "Febrero";
                break;
            case 3:
                mesR9 = "Marzo";
                break;
            case 4:
                mesR9 = "Abril";
                break;
            case 5:
                mesR9 = "Mayo";
                break;
            case 6:
                mesR9 = "Junio";
                break;
            case 7:
                mesR9 = "Julio";
                break;
            case 8:
                mesR9 = "Agosto";
                break;
            case 9:
                mesR9 = "Septiembre";
                break;
            case 10:
                mesR9 = "Octubre";
                break;
            case 11:
                mesR9 = "Noviembre";
                break;
            case 12:
                mesR9 = "Diciembre";
                break;
            default:
                break;
        }

        String aa = Integer.toString(anio2_9);
        if (aa != null) {
            anio2_9 = fecharetiroemp_a9.getYear();
            int dmes = 0;
            int danios;
            int r;
            int rr;
            int k;
            if (anio1_9 == anio2_9) {
                dmes = (mes2_9 - mes1_9);
            } else {
                danios = (anio2_9 - anio1_9);
                if (danios == 1) {
                    r = (12 - mes1_9);
                    dmes = (r + mes2_9);
                } else if (danios > 1) {
                    rr = ((danios - 1) * 12);
                    k = (12 - mes1_9);
                    dmes = (k + rr + mes2_9);
                }
            }
            String pp = Integer.toString(dmes);
            sptiempolaboro9.setText(pp);
            meses9 = pp;
        }
    }//GEN-LAST:event_fecharetiroemp9PropertyChange

    private void fecharetiroemp_a9PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_fecharetiroemp_a9PropertyChange
        anio2_9 = fecharetiroemp_a9.getYear();
        anioR9 = String.valueOf(anio2_9);
        int dmes = 0;
        int danios;
        int r;
        int rr;
        int k;
        if (anio1_9 == anio2_9) {
            dmes = (mes2_9 - mes1_9);
        } else {
            danios = (anio2_9 - anio1_9);
            if (danios == 1) {
                r = (12 - mes1_9);
                dmes = (r + mes2_9);
            } else if (danios > 1) {
                rr = ((danios - 1) * 12);
                k = (12 - mes1_9);
                dmes = (k + rr + mes2_9);
            }
        }
        String pp = Integer.toString(dmes);
        sptiempolaboro9.setText(pp);
        meses9 = pp;
    }//GEN-LAST:event_fecharetiroemp_a9PropertyChange

    private void txtdiligencielosdatosmotivo9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdiligencielosdatosmotivo9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdiligencielosdatosmotivo9ActionPerformed

    private void txtdiligencielosdatosmotivo9KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdiligencielosdatosmotivo9KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdiligencielosdatosmotivo9KeyTyped

    private void jCheckBox60ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox60ItemStateChanged
        if (jCheckBox60.isSelected()) {
            fechaingresoemp9.setEnabled(false);
            fecharetiroemp9.setEnabled(false);
            fechaingresoemp_a9.setEnabled(false);
            fecharetiroemp_a9.setEnabled(false);
            sptiempolaboro9.setEnabled(true);
            HistoriaLaboral.setVnfecha9(false);
        } else {
            fechaingresoemp9.setEnabled(true);
            fecharetiroemp9.setEnabled(true);
            fechaingresoemp_a9.setEnabled(true);
            fecharetiroemp_a9.setEnabled(true);
            sptiempolaboro9.setEnabled(false);
            HistoriaLaboral.setVnfecha9(true);
        }
    }//GEN-LAST:event_jCheckBox60ItemStateChanged

    private void jLabel22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel22MouseClicked
        HistoriaLaboral.setEmpleo10("hay");
        jPanel12.setVisible(true); //siguiente panel
        jLabel80.setVisible(false); // signo menos del anterior del anterior
        jLabel22.setVisible(false); //signo más del anterior (este)
        jLabel86.setVisible(true); //signo menos del anterior
        jLabel92.setVisible(false); //signo menos del siguiente
    }//GEN-LAST:event_jLabel22MouseClicked

    private void jLabel86MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel86MouseClicked
        HistoriaLaboral.setEmpleo10("nohay");
        jPanel12.setVisible(false); //siguiente panel
        jLabel80.setVisible(true); // signo menos del anterior del anterior
        jLabel22.setVisible(true); //signo más del anterior (este)
        jLabel86.setVisible(false); //signo menos del anterior
        jLabel92.setVisible(true); //signo menos del siguiente
    }//GEN-LAST:event_jLabel86MouseClicked

    private void txtdiligencielosdatoscargo10CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtdiligencielosdatoscargo10CaretUpdate
        HistoriaLaboral.setCargotrabe10(txtdiligencielosdatoscargo10.getText());
    }//GEN-LAST:event_txtdiligencielosdatoscargo10CaretUpdate

    private void txtdiligencielosdatoscargo10KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdiligencielosdatoscargo10KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdiligencielosdatoscargo10KeyTyped

    private void txtdiligencielosdatosempresa10CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtdiligencielosdatosempresa10CaretUpdate
        HistoriaLaboral.setEmpresa10(txtdiligencielosdatosempresa10.getText());
    }//GEN-LAST:event_txtdiligencielosdatosempresa10CaretUpdate

    private void txtdiligencielosdatosempresa10KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdiligencielosdatosempresa10KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdiligencielosdatosempresa10KeyTyped

    private void txtdiligencielosdatoslugar10CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtdiligencielosdatoslugar10CaretUpdate
        HistoriaLaboral.setLugarempresa10(txtdiligencielosdatoslugar10.getText());
    }//GEN-LAST:event_txtdiligencielosdatoslugar10CaretUpdate

    private void txtdiligencielosdatoslugar10KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdiligencielosdatoslugar10KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdiligencielosdatoslugar10KeyTyped

    private void txtdiligencielosdatossalario10CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtdiligencielosdatossalario10CaretUpdate
        HistoriaLaboral.setSalariobe10(txtdiligencielosdatossalario10.getText());
    }//GEN-LAST:event_txtdiligencielosdatossalario10CaretUpdate

    private void txtdiligencielosdatossalario10KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdiligencielosdatossalario10KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdiligencielosdatossalario10KeyTyped

    private void fechaingresoemp10PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_fechaingresoemp10PropertyChange
        int m = fechaingresoemp10.getMonth();
        mes1_10 = m + 1;

        switch (mes1_10) {
            case 1:
                mesI10 = "Enero";
                break;
            case 2:
                mesI10 = "Febrero";
                break;
            case 3:
                mesI10 = "Marzo";
                break;
            case 4:
                mesI10 = "Abril";
                break;
            case 5:
                mesI10 = "Mayo";
                break;
            case 6:
                mesI10 = "Junio";
                break;
            case 7:
                mesI10 = "Julio";
                break;
            case 8:
                mesI10 = "Agosto";
                break;
            case 9:
                mesI10 = "Septiembre";
                break;
            case 10:
                mesI10 = "Octubre";
                break;
            case 11:
                mesI10 = "Noviembre";
                break;
            case 12:
                mesI10 = "Diciembre";
                break;
            default:
                break;
        }
    }//GEN-LAST:event_fechaingresoemp10PropertyChange

    private void fechaingresoemp_a10PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_fechaingresoemp_a10PropertyChange
        anio1_10 = fechaingresoemp_a10.getYear();
        anioI10 = String.valueOf(anio1_10);
    }//GEN-LAST:event_fechaingresoemp_a10PropertyChange

    private void sptiempolaboro10KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sptiempolaboro10KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_sptiempolaboro10KeyTyped

    private void fecharetiroemp10PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_fecharetiroemp10PropertyChange
        int m2 = fecharetiroemp10.getMonth();
        mes2_10 = m2 + 1;
        switch (mes2_10) {
            case 1:
                mesR10 = "Enero";
                break;
            case 2:
                mesR10 = "Febrero";
                break;
            case 3:
                mesR10 = "Marzo";
                break;
            case 4:
                mesR10 = "Abril";
                break;
            case 5:
                mesR10 = "Mayo";
                break;
            case 6:
                mesR10 = "Junio";
                break;
            case 7:
                mesR10 = "Julio";
                break;
            case 8:
                mesR10 = "Agosto";
                break;
            case 9:
                mesR10 = "Septiembre";
                break;
            case 10:
                mesR10 = "Octubre";
                break;
            case 11:
                mesR10 = "Noviembre";
                break;
            case 12:
                mesR10 = "Diciembre";
                break;
            default:
                break;
        }

        String aa = Integer.toString(anio2_10);
        if (aa != null) {
            anio2_10 = fecharetiroemp_a10.getYear();
            int dmes = 0;
            int danios;
            int r;
            int rr;
            int k;
            if (anio1_10 == anio2_10) {
                dmes = (mes2_10 - mes1_10);
            } else {
                danios = (anio2_10 - anio1_10);
                if (danios == 1) {
                    r = (12 - mes1_10);
                    dmes = (r + mes2_10);
                } else if (danios > 1) {
                    rr = ((danios - 1) * 12);
                    k = (12 - mes1_10);
                    dmes = (k + rr + mes2_10);
                }
            }
            String pp = Integer.toString(dmes);
            sptiempolaboro10.setText(pp);
            meses10 = pp;
        }
    }//GEN-LAST:event_fecharetiroemp10PropertyChange

    private void fecharetiroemp_a10PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_fecharetiroemp_a10PropertyChange
        anio2_10 = fecharetiroemp_a10.getYear();
        anioR10 = String.valueOf(anio2_10);
        int dmes = 0;
        int danios;
        int r;
        int rr;
        int k;
        if (anio1_10 == anio2_10) {
            dmes = (mes2_10 - mes1_10);
        } else {
            danios = (anio2_10 - anio1_10);
            if (danios == 1) {
                r = (12 - mes1_10);
                dmes = (r + mes2_10);
            } else if (danios > 1) {
                rr = ((danios - 1) * 12);
                k = (12 - mes1_10);
                dmes = (k + rr + mes2_10);
            }
        }
        String pp = Integer.toString(dmes);
        sptiempolaboro10.setText(pp);
        meses10 = pp;
    }//GEN-LAST:event_fecharetiroemp_a10PropertyChange

    private void txtdiligencielosdatosmotivo10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdiligencielosdatosmotivo10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdiligencielosdatosmotivo10ActionPerformed

    private void txtdiligencielosdatosmotivo10KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdiligencielosdatosmotivo10KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdiligencielosdatosmotivo10KeyTyped

    private void jCheckBox61ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox61ItemStateChanged
        if (jCheckBox61.isSelected()) {
            fechaingresoemp10.setEnabled(false);
            fecharetiroemp10.setEnabled(false);
            fechaingresoemp_a10.setEnabled(false);
            fecharetiroemp_a10.setEnabled(false);
            sptiempolaboro10.setEnabled(true);
            HistoriaLaboral.setVnfecha10(false);
        } else {
            fechaingresoemp10.setEnabled(true);
            fecharetiroemp10.setEnabled(true);
            fechaingresoemp_a10.setEnabled(true);
            fecharetiroemp_a10.setEnabled(true);
            sptiempolaboro10.setEnabled(false);
            HistoriaLaboral.setVnfecha10(true);
        }
    }//GEN-LAST:event_jCheckBox61ItemStateChanged

    private void jLabel23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel23MouseClicked
        HistoriaLaboral.setEmpleo11("hay");
        jPanel13.setVisible(true); //siguiente panel
        jLabel86.setVisible(false); // signo menos del anterior del anterior
        jLabel23.setVisible(false); //signo más del anterior (este)
        jLabel92.setVisible(true); //signo menos del anterior
        jLabel98.setVisible(false); //signo menos del siguiente
    }//GEN-LAST:event_jLabel23MouseClicked

    private void jLabel92MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel92MouseClicked
        HistoriaLaboral.setEmpleo11("nohay");
        jPanel13.setVisible(false); //siguiente panel
        jLabel86.setVisible(true); // signo menos del anterior del anterior
        jLabel23.setVisible(true); //signo más del anterior (este)
        jLabel92.setVisible(false); //signo menos del anterior
        jLabel98.setVisible(true); //signo menos del siguiente
    }//GEN-LAST:event_jLabel92MouseClicked

    private void txtdiligencielosdatoscargo11CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtdiligencielosdatoscargo11CaretUpdate
        HistoriaLaboral.setCargotrabe11(txtdiligencielosdatoscargo11.getText());
    }//GEN-LAST:event_txtdiligencielosdatoscargo11CaretUpdate

    private void txtdiligencielosdatoscargo11KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdiligencielosdatoscargo11KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdiligencielosdatoscargo11KeyTyped

    private void txtdiligencielosdatosempresa11CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtdiligencielosdatosempresa11CaretUpdate
        HistoriaLaboral.setEmpresa11(txtdiligencielosdatosempresa11.getText());
    }//GEN-LAST:event_txtdiligencielosdatosempresa11CaretUpdate

    private void txtdiligencielosdatosempresa11KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdiligencielosdatosempresa11KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdiligencielosdatosempresa11KeyTyped

    private void txtdiligencielosdatoslugar11CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtdiligencielosdatoslugar11CaretUpdate
        HistoriaLaboral.setLugarempresa11(txtdiligencielosdatoslugar11.getText());
    }//GEN-LAST:event_txtdiligencielosdatoslugar11CaretUpdate

    private void txtdiligencielosdatoslugar11KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdiligencielosdatoslugar11KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdiligencielosdatoslugar11KeyTyped

    private void txtdiligencielosdatossalario11CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtdiligencielosdatossalario11CaretUpdate
        HistoriaLaboral.setSalariobe11(txtdiligencielosdatossalario11.getText());
    }//GEN-LAST:event_txtdiligencielosdatossalario11CaretUpdate

    private void txtdiligencielosdatossalario11KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdiligencielosdatossalario11KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdiligencielosdatossalario11KeyTyped

    private void fechaingresoemp11PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_fechaingresoemp11PropertyChange
        int m = fechaingresoemp11.getMonth();
        mes1_11 = m + 1;

        switch (mes1_11) {
            case 1:
                mesI11 = "Enero";
                break;
            case 2:
                mesI11 = "Febrero";
                break;
            case 3:
                mesI11 = "Marzo";
                break;
            case 4:
                mesI11 = "Abril";
                break;
            case 5:
                mesI11 = "Mayo";
                break;
            case 6:
                mesI11 = "Junio";
                break;
            case 7:
                mesI11 = "Julio";
                break;
            case 8:
                mesI11 = "Agosto";
                break;
            case 9:
                mesI11 = "Septiembre";
                break;
            case 10:
                mesI11 = "Octubre";
                break;
            case 11:
                mesI11 = "Noviembre";
                break;
            case 12:
                mesI11 = "Diciembre";
                break;
            default:
                break;
        }
    }//GEN-LAST:event_fechaingresoemp11PropertyChange

    private void fechaingresoemp_a11PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_fechaingresoemp_a11PropertyChange
        anio1_11 = fechaingresoemp_a11.getYear();
        anioI11 = String.valueOf(anio1_11);
    }//GEN-LAST:event_fechaingresoemp_a11PropertyChange

    private void sptiempolaboro11KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sptiempolaboro11KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_sptiempolaboro11KeyTyped

    private void fecharetiroemp11PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_fecharetiroemp11PropertyChange
        int m2 = fecharetiroemp11.getMonth();
        mes2_11 = m2 + 1;
        switch (mes2_11) {
            case 1:
                mesR11 = "Enero";
                break;
            case 2:
                mesR11 = "Febrero";
                break;
            case 3:
                mesR11 = "Marzo";
                break;
            case 4:
                mesR11 = "Abril";
                break;
            case 5:
                mesR11 = "Mayo";
                break;
            case 6:
                mesR11 = "Junio";
                break;
            case 7:
                mesR11 = "Julio";
                break;
            case 8:
                mesR11 = "Agosto";
                break;
            case 9:
                mesR11 = "Septiembre";
                break;
            case 10:
                mesR11 = "Octubre";
                break;
            case 11:
                mesR11 = "Noviembre";
                break;
            case 12:
                mesR11 = "Diciembre";
                break;
            default:
                break;
        }

        String aa = Integer.toString(anio2_11);
        if (aa != null) {
            anio2_11 = fecharetiroemp_a11.getYear();
            int dmes = 0;
            int danios;
            int r;
            int rr;
            int k;
            if (anio1_11 == anio2_11) {
                dmes = (mes2_11 - mes1_11);
            } else {
                danios = (anio2_11 - anio1_11);
                if (danios == 1) {
                    r = (12 - mes1_11);
                    dmes = (r + mes2_11);
                } else if (danios > 1) {
                    rr = ((danios - 1) * 12);
                    k = (12 - mes1_11);
                    dmes = (k + rr + mes2_11);
                }
            }
            String pp = Integer.toString(dmes);
            sptiempolaboro11.setText(pp);
            meses11 = pp;
        }
    }//GEN-LAST:event_fecharetiroemp11PropertyChange

    private void fecharetiroemp_a11PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_fecharetiroemp_a11PropertyChange
        anio2_11 = fecharetiroemp_a11.getYear();
        anioR11 = String.valueOf(anio2_11);
        int dmes = 0;
        int danios;
        int r;
        int rr;
        int k;
        if (anio1_11 == anio2_11) {
            dmes = (mes2_11 - mes1_11);
        } else {
            danios = (anio2_11 - anio1_11);
            if (danios == 1) {
                r = (12 - mes1_11);
                dmes = (r + mes2_11);
            } else if (danios > 1) {
                rr = ((danios - 1) * 12);
                k = (12 - mes1_11);
                dmes = (k + rr + mes2_11);
            }
        }
        String pp = Integer.toString(dmes);
        sptiempolaboro11.setText(pp);
        meses11 = pp;
    }//GEN-LAST:event_fecharetiroemp_a11PropertyChange

    private void txtdiligencielosdatosmotivo11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdiligencielosdatosmotivo11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdiligencielosdatosmotivo11ActionPerformed

    private void txtdiligencielosdatosmotivo11KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdiligencielosdatosmotivo11KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdiligencielosdatosmotivo11KeyTyped

    private void jCheckBox62ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox62ItemStateChanged
        if (jCheckBox62.isSelected()) {
            fechaingresoemp11.setEnabled(false);
            fecharetiroemp11.setEnabled(false);
            fechaingresoemp_a11.setEnabled(false);
            fecharetiroemp_a11.setEnabled(false);
            sptiempolaboro11.setEnabled(true);
            HistoriaLaboral.setVnfecha11(false);
        } else {
            fechaingresoemp11.setEnabled(true);
            fecharetiroemp11.setEnabled(true);
            fechaingresoemp_a11.setEnabled(true);
            fecharetiroemp_a11.setEnabled(true);
            sptiempolaboro11.setEnabled(false);
            HistoriaLaboral.setVnfecha11(true);
        }
    }//GEN-LAST:event_jCheckBox62ItemStateChanged

    private void jLabel24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel24MouseClicked
        HistoriaLaboral.setEmpleo12("hay");
        jPanel14.setVisible(true); //siguiente panel
        jLabel92.setVisible(false); // signo menos del anterior del anterior
        jLabel24.setVisible(false); //signo más del anterior (este)
        jLabel98.setVisible(true); //signo menos del anterior
        jLabel108.setVisible(false); //signo menos del siguiente
    }//GEN-LAST:event_jLabel24MouseClicked

    private void jLabel98MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel98MouseClicked
        HistoriaLaboral.setEmpleo12("nohay");
        jPanel14.setVisible(false); //siguiente panel
        jLabel92.setVisible(true); // signo menos del anterior del anterior
        jLabel24.setVisible(true); //signo más del anterior (este)
        jLabel98.setVisible(false); //signo menos del anterior
        jLabel108.setVisible(true); //signo menos del siguiente
    }//GEN-LAST:event_jLabel98MouseClicked

    private void txtdiligencielosdatoscargo12CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtdiligencielosdatoscargo12CaretUpdate
        HistoriaLaboral.setCargotrabe12(txtdiligencielosdatoscargo12.getText());
    }//GEN-LAST:event_txtdiligencielosdatoscargo12CaretUpdate

    private void txtdiligencielosdatoscargo12KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdiligencielosdatoscargo12KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdiligencielosdatoscargo12KeyTyped

    private void txtdiligencielosdatosempresa12CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtdiligencielosdatosempresa12CaretUpdate
        HistoriaLaboral.setEmpresa12(txtdiligencielosdatosempresa12.getText());
    }//GEN-LAST:event_txtdiligencielosdatosempresa12CaretUpdate

    private void txtdiligencielosdatosempresa12KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdiligencielosdatosempresa12KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdiligencielosdatosempresa12KeyTyped

    private void txtdiligencielosdatoslugar12CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtdiligencielosdatoslugar12CaretUpdate
        HistoriaLaboral.setLugarempresa12(txtdiligencielosdatoslugar12.getText());
    }//GEN-LAST:event_txtdiligencielosdatoslugar12CaretUpdate

    private void txtdiligencielosdatoslugar12KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdiligencielosdatoslugar12KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdiligencielosdatoslugar12KeyTyped

    private void txtdiligencielosdatossalario12CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtdiligencielosdatossalario12CaretUpdate
        HistoriaLaboral.setSalariobe12(txtdiligencielosdatossalario12.getText());
    }//GEN-LAST:event_txtdiligencielosdatossalario12CaretUpdate

    private void txtdiligencielosdatossalario12KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdiligencielosdatossalario12KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdiligencielosdatossalario12KeyTyped

    private void fechaingresoemp12PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_fechaingresoemp12PropertyChange
        int m = fechaingresoemp12.getMonth();
        mes1_12 = m + 1;

        switch (mes1_12) {
            case 1:
                mesI12 = "Enero";
                break;
            case 2:
                mesI12 = "Febrero";
                break;
            case 3:
                mesI12 = "Marzo";
                break;
            case 4:
                mesI12 = "Abril";
                break;
            case 5:
                mesI12 = "Mayo";
                break;
            case 6:
                mesI12 = "Junio";
                break;
            case 7:
                mesI12 = "Julio";
                break;
            case 8:
                mesI12 = "Agosto";
                break;
            case 9:
                mesI12 = "Septiembre";
                break;
            case 10:
                mesI12 = "Octubre";
                break;
            case 11:
                mesI12 = "Noviembre";
                break;
            case 12:
                mesI12 = "Diciembre";
                break;
            default:
                break;
        }
    }//GEN-LAST:event_fechaingresoemp12PropertyChange

    private void fechaingresoemp_a12PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_fechaingresoemp_a12PropertyChange
        anio1_12 = fechaingresoemp_a12.getYear();
        anioI12 = String.valueOf(anio1_12);
    }//GEN-LAST:event_fechaingresoemp_a12PropertyChange

    private void sptiempolaboro12KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sptiempolaboro12KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_sptiempolaboro12KeyTyped

    private void fecharetiroemp12PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_fecharetiroemp12PropertyChange
        int m2 = fecharetiroemp12.getMonth();
        mes2_12 = m2 + 1;
        switch (mes2_12) {
            case 1:
                mesR12 = "Enero";
                break;
            case 2:
                mesR12 = "Febrero";
                break;
            case 3:
                mesR12 = "Marzo";
                break;
            case 4:
                mesR12 = "Abril";
                break;
            case 5:
                mesR12 = "Mayo";
                break;
            case 6:
                mesR12 = "Junio";
                break;
            case 7:
                mesR12 = "Julio";
                break;
            case 8:
                mesR12 = "Agosto";
                break;
            case 9:
                mesR12 = "Septiembre";
                break;
            case 10:
                mesR12 = "Octubre";
                break;
            case 11:
                mesR12 = "Noviembre";
                break;
            case 12:
                mesR12 = "Diciembre";
                break;
            default:
                break;
        }

        String aa = Integer.toString(anio2_12);
        if (aa != null) {
            anio2_12 = fecharetiroemp_a12.getYear();
            int dmes = 0;
            int danios;
            int r;
            int rr;
            int k;
            if (anio1_12 == anio2_12) {
                dmes = (mes2_12 - mes1_12);
            } else {
                danios = (anio2_12 - anio1_12);
                if (danios == 1) {
                    r = (12 - mes1_12);
                    dmes = (r + mes2_12);
                } else if (danios > 1) {
                    rr = ((danios - 1) * 12);
                    k = (12 - mes1_12);
                    dmes = (k + rr + mes2_12);
                }
            }
            String pp = Integer.toString(dmes);
            sptiempolaboro12.setText(pp);
            meses12 = pp;
        }
    }//GEN-LAST:event_fecharetiroemp12PropertyChange

    private void fecharetiroemp_a12PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_fecharetiroemp_a12PropertyChange
        anio2_12 = fecharetiroemp_a12.getYear();
        anioR12 = String.valueOf(anio2_12);
        int dmes = 0;
        int danios;
        int r;
        int rr;
        int k;
        if (anio1_12 == anio2_12) {
            dmes = (mes2_12 - mes1_12);
        } else {
            danios = (anio2_12 - anio1_12);
            if (danios == 1) {
                r = (12 - mes1_12);
                dmes = (r + mes2_12);
            } else if (danios > 1) {
                rr = ((danios - 1) * 12);
                k = (12 - mes1_12);
                dmes = (k + rr + mes2_12);
            }
        }
        String pp = Integer.toString(dmes);
        sptiempolaboro12.setText(pp);
        meses12 = pp;
    }//GEN-LAST:event_fecharetiroemp_a12PropertyChange

    private void txtdiligencielosdatosmotivo12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdiligencielosdatosmotivo12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdiligencielosdatosmotivo12ActionPerformed

    private void txtdiligencielosdatosmotivo12KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdiligencielosdatosmotivo12KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdiligencielosdatosmotivo12KeyTyped

    private void jCheckBox63ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox63ItemStateChanged
        if (jCheckBox63.isSelected()) {
            fechaingresoemp12.setEnabled(false);
            fecharetiroemp12.setEnabled(false);
            fechaingresoemp_a12.setEnabled(false);
            fecharetiroemp_a12.setEnabled(false);
            sptiempolaboro12.setEnabled(true);
            HistoriaLaboral.setVnfecha12(false);
        } else {
            fechaingresoemp12.setEnabled(true);
            fecharetiroemp12.setEnabled(true);
            fechaingresoemp_a12.setEnabled(true);
            fecharetiroemp_a12.setEnabled(true);
            sptiempolaboro12.setEnabled(false);
            HistoriaLaboral.setVnfecha12(true);
        }
    }//GEN-LAST:event_jCheckBox63ItemStateChanged

    private void jLabel25MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel25MouseClicked
        HistoriaLaboral.setEmpleo13("hay");
        jPanel15.setVisible(true); //siguiente panel
        jLabel98.setVisible(false); // signo menos del anterior del anterior
        jLabel25.setVisible(false); //signo más del anterior (este)
        jLabel108.setVisible(true); //signo menos del anterior
        jLabel120.setVisible(false); //signo menos del siguiente
    }//GEN-LAST:event_jLabel25MouseClicked

    private void jLabel108MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel108MouseClicked
        HistoriaLaboral.setEmpleo13("nohay");
        jPanel15.setVisible(false); //siguiente panel
        jLabel98.setVisible(true); // signo menos del anterior del anterior
        jLabel25.setVisible(true); //signo más del anterior (este)
        jLabel108.setVisible(false); //signo menos del anterior
        jLabel120.setVisible(true); //signo menos del siguiente
    }//GEN-LAST:event_jLabel108MouseClicked

    private void txtdiligencielosdatoscargo13CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtdiligencielosdatoscargo13CaretUpdate
        HistoriaLaboral.setCargotrabe13(txtdiligencielosdatoscargo13.getText());
    }//GEN-LAST:event_txtdiligencielosdatoscargo13CaretUpdate

    private void txtdiligencielosdatoscargo13KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdiligencielosdatoscargo13KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdiligencielosdatoscargo13KeyTyped

    private void txtdiligencielosdatosempresa13CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtdiligencielosdatosempresa13CaretUpdate
        HistoriaLaboral.setEmpresa13(txtdiligencielosdatosempresa13.getText());
    }//GEN-LAST:event_txtdiligencielosdatosempresa13CaretUpdate

    private void txtdiligencielosdatosempresa13KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdiligencielosdatosempresa13KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdiligencielosdatosempresa13KeyTyped

    private void txtdiligencielosdatoslugar13CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtdiligencielosdatoslugar13CaretUpdate
        HistoriaLaboral.setLugarempresa13(txtdiligencielosdatoslugar13.getText());
    }//GEN-LAST:event_txtdiligencielosdatoslugar13CaretUpdate

    private void txtdiligencielosdatoslugar13KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdiligencielosdatoslugar13KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdiligencielosdatoslugar13KeyTyped

    private void txtdiligencielosdatossalario13CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtdiligencielosdatossalario13CaretUpdate
        HistoriaLaboral.setSalariobe13(txtdiligencielosdatossalario13.getText());
    }//GEN-LAST:event_txtdiligencielosdatossalario13CaretUpdate

    private void txtdiligencielosdatossalario13KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdiligencielosdatossalario13KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdiligencielosdatossalario13KeyTyped

    private void fechaingresoemp13PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_fechaingresoemp13PropertyChange
        int m = fechaingresoemp13.getMonth();
        mes1_13 = m + 1;

        switch (mes1_13) {
            case 1:
                mesI13 = "Enero";
                break;
            case 2:
                mesI13 = "Febrero";
                break;
            case 3:
                mesI13 = "Marzo";
                break;
            case 4:
                mesI13 = "Abril";
                break;
            case 5:
                mesI13 = "Mayo";
                break;
            case 6:
                mesI13 = "Junio";
                break;
            case 7:
                mesI13 = "Julio";
                break;
            case 8:
                mesI13 = "Agosto";
                break;
            case 9:
                mesI13 = "Septiembre";
                break;
            case 10:
                mesI13 = "Octubre";
                break;
            case 11:
                mesI13 = "Noviembre";
                break;
            case 12:
                mesI13 = "Diciembre";
                break;
            default:
                break;
        }
    }//GEN-LAST:event_fechaingresoemp13PropertyChange

    private void fechaingresoemp_a13PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_fechaingresoemp_a13PropertyChange
        anio1_13 = fechaingresoemp_a13.getYear();
        anioI13 = String.valueOf(anio1_13);
    }//GEN-LAST:event_fechaingresoemp_a13PropertyChange

    private void sptiempolaboro13KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sptiempolaboro13KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_sptiempolaboro13KeyTyped

    private void fecharetiroemp13PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_fecharetiroemp13PropertyChange
        int m2 = fecharetiroemp13.getMonth();
        mes2_13 = m2 + 1;
        switch (mes2_13) {
            case 1:
                mesR13 = "Enero";
                break;
            case 2:
                mesR13 = "Febrero";
                break;
            case 3:
                mesR13 = "Marzo";
                break;
            case 4:
                mesR13 = "Abril";
                break;
            case 5:
                mesR13 = "Mayo";
                break;
            case 6:
                mesR13 = "Junio";
                break;
            case 7:
                mesR13 = "Julio";
                break;
            case 8:
                mesR13 = "Agosto";
                break;
            case 9:
                mesR13 = "Septiembre";
                break;
            case 10:
                mesR13 = "Octubre";
                break;
            case 11:
                mesR13 = "Noviembre";
                break;
            case 12:
                mesR13 = "Diciembre";
                break;
            default:
                break;
        }

        String aa = Integer.toString(anio2_13);
        if (aa != null) {
            anio2_13 = fecharetiroemp_a13.getYear();
            int dmes = 0;
            int danios;
            int r;
            int rr;
            int k;
            if (anio1_13 == anio2_13) {
                dmes = (mes2_13 - mes1_13);
            } else {
                danios = (anio2_13 - anio1_13);
                if (danios == 1) {
                    r = (12 - mes1_13);
                    dmes = (r + mes2_13);
                } else if (danios > 1) {
                    rr = ((danios - 1) * 12);
                    k = (12 - mes1_13);
                    dmes = (k + rr + mes2_13);
                }
            }
            String pp = Integer.toString(dmes);
            sptiempolaboro13.setText(pp);
            meses13 = pp;
        }
    }//GEN-LAST:event_fecharetiroemp13PropertyChange

    private void fecharetiroemp_a13PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_fecharetiroemp_a13PropertyChange
        anio2_13 = fecharetiroemp_a13.getYear();
        anioR13 = String.valueOf(anio2_13);
        int dmes = 0;
        int danios;
        int r;
        int rr;
        int k;
        if (anio1_13 == anio2_13) {
            dmes = (mes2_13 - mes1_13);
        } else {
            danios = (anio2_13 - anio1_13);
            if (danios == 1) {
                r = (12 - mes1_13);
                dmes = (r + mes2_13);
            } else if (danios > 1) {
                rr = ((danios - 1) * 12);
                k = (12 - mes1_13);
                dmes = (k + rr + mes2_13);
            }
        }
        String pp = Integer.toString(dmes);
        sptiempolaboro13.setText(pp);
        meses13 = pp;
    }//GEN-LAST:event_fecharetiroemp_a13PropertyChange

    private void txtdiligencielosdatosmotivo13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdiligencielosdatosmotivo13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdiligencielosdatosmotivo13ActionPerformed

    private void txtdiligencielosdatosmotivo13KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdiligencielosdatosmotivo13KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdiligencielosdatosmotivo13KeyTyped

    private void jCheckBox64ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox64ItemStateChanged
        if (jCheckBox64.isSelected()) {
            fechaingresoemp13.setEnabled(false);
            fecharetiroemp13.setEnabled(false);
            fechaingresoemp_a13.setEnabled(false);
            fecharetiroemp_a13.setEnabled(false);
            sptiempolaboro13.setEnabled(true);
            HistoriaLaboral.setVnfecha13(false);
        } else {
            fechaingresoemp13.setEnabled(true);
            fecharetiroemp13.setEnabled(true);
            fechaingresoemp_a13.setEnabled(true);
            fecharetiroemp_a13.setEnabled(true);
            sptiempolaboro13.setEnabled(false);
            HistoriaLaboral.setVnfecha13(true);
        }
    }//GEN-LAST:event_jCheckBox64ItemStateChanged

    private void jLabel26MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel26MouseClicked
        HistoriaLaboral.setEmpleo14("hay");
        jPanel16.setVisible(true); //siguiente panel
        jLabel108.setVisible(false); // signo menos del anterior del anterior
        jLabel26.setVisible(false); //signo más del anterior (este)
        jLabel120.setVisible(true); //signo menos del anterior
        jLabel127.setVisible(false); //signo menos del siguiente
    }//GEN-LAST:event_jLabel26MouseClicked

    private void jLabel120MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel120MouseClicked
        HistoriaLaboral.setEmpleo14("nohay");
        jPanel16.setVisible(false); //siguiente panel
        jLabel108.setVisible(true); // signo menos del anterior del anterior
        jLabel26.setVisible(true); //signo más del anterior (este)
        jLabel120.setVisible(false); //signo menos del anterior
        jLabel127.setVisible(true); //signo menos del siguiente
    }//GEN-LAST:event_jLabel120MouseClicked

    private void txtdiligencielosdatoscargo14CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtdiligencielosdatoscargo14CaretUpdate
        HistoriaLaboral.setCargotrabe14(txtdiligencielosdatoscargo14.getText());
    }//GEN-LAST:event_txtdiligencielosdatoscargo14CaretUpdate

    private void txtdiligencielosdatoscargo14KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdiligencielosdatoscargo14KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdiligencielosdatoscargo14KeyTyped

    private void txtdiligencielosdatosempresa14CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtdiligencielosdatosempresa14CaretUpdate
        HistoriaLaboral.setEmpresa14(txtdiligencielosdatosempresa14.getText());
    }//GEN-LAST:event_txtdiligencielosdatosempresa14CaretUpdate

    private void txtdiligencielosdatosempresa14KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdiligencielosdatosempresa14KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdiligencielosdatosempresa14KeyTyped

    private void txtdiligencielosdatoslugar14CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtdiligencielosdatoslugar14CaretUpdate
        HistoriaLaboral.setLugarempresa14(txtdiligencielosdatoslugar14.getText());
    }//GEN-LAST:event_txtdiligencielosdatoslugar14CaretUpdate

    private void txtdiligencielosdatoslugar14KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdiligencielosdatoslugar14KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdiligencielosdatoslugar14KeyTyped

    private void txtdiligencielosdatossalario14CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtdiligencielosdatossalario14CaretUpdate
        HistoriaLaboral.setSalariobe14(txtdiligencielosdatossalario14.getText());
    }//GEN-LAST:event_txtdiligencielosdatossalario14CaretUpdate

    private void txtdiligencielosdatossalario14KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdiligencielosdatossalario14KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdiligencielosdatossalario14KeyTyped

    private void fechaingresoemp14PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_fechaingresoemp14PropertyChange
       int m = fechaingresoemp14.getMonth();
        mes1_14 = m + 1;

        switch (mes1_14) {
            case 1:
                mesI14 = "Enero";
                break;
            case 2:
                mesI14 = "Febrero";
                break;
            case 3:
                mesI14 = "Marzo";
                break;
            case 4:
                mesI14 = "Abril";
                break;
            case 5:
                mesI14 = "Mayo";
                break;
            case 6:
                mesI14 = "Junio";
                break;
            case 7:
                mesI14 = "Julio";
                break;
            case 8:
                mesI14 = "Agosto";
                break;
            case 9:
                mesI14 = "Septiembre";
                break;
            case 10:
                mesI14 = "Octubre";
                break;
            case 11:
                mesI14 = "Noviembre";
                break;
            case 12:
                mesI14 = "Diciembre";
                break;
            default:
                break;
        }
    }//GEN-LAST:event_fechaingresoemp14PropertyChange

    private void fechaingresoemp_a14PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_fechaingresoemp_a14PropertyChange
        anio1_14 = fechaingresoemp_a14.getYear();
        anioI14 = String.valueOf(anio1_14);
    }//GEN-LAST:event_fechaingresoemp_a14PropertyChange

    private void sptiempolaboro14KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sptiempolaboro14KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_sptiempolaboro14KeyTyped

    private void fecharetiroemp14PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_fecharetiroemp14PropertyChange
        int m2 = fecharetiroemp14.getMonth();
        mes2_14 = m2 + 1;
        switch (mes2_14) {
            case 1:
                mesR14 = "Enero";
                break;
            case 2:
                mesR14 = "Febrero";
                break;
            case 3:
                mesR14 = "Marzo";
                break;
            case 4:
                mesR14 = "Abril";
                break;
            case 5:
                mesR14 = "Mayo";
                break;
            case 6:
                mesR14 = "Junio";
                break;
            case 7:
                mesR14 = "Julio";
                break;
            case 8:
                mesR14 = "Agosto";
                break;
            case 9:
                mesR14 = "Septiembre";
                break;
            case 10:
                mesR14 = "Octubre";
                break;
            case 11:
                mesR14 = "Noviembre";
                break;
            case 12:
                mesR14 = "Diciembre";
                break;
            default:
                break;
        }

        String aa = Integer.toString(anio2_14);
        if (aa != null) {
            anio2_14 = fecharetiroemp_a14.getYear();
            int dmes = 0;
            int danios;
            int r;
            int rr;
            int k;
            if (anio1_14 == anio2_14) {
                dmes = (mes2_14 - mes1_14);
            } else {
                danios = (anio2_14 - anio1_14);
                if (danios == 1) {
                    r = (12 - mes1_14);
                    dmes = (r + mes2_14);
                } else if (danios > 1) {
                    rr = ((danios - 1) * 12);
                    k = (12 - mes1_14);
                    dmes = (k + rr + mes2_14);
                }
            }
            String pp = Integer.toString(dmes);
            sptiempolaboro14.setText(pp);
            meses14 = pp;
        }
    }//GEN-LAST:event_fecharetiroemp14PropertyChange

    private void fecharetiroemp_a14PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_fecharetiroemp_a14PropertyChange
        anio2_14 = fecharetiroemp_a14.getYear();
        anioR14 = String.valueOf(anio2_14);
        int dmes = 0;
        int danios;
        int r;
        int rr;
        int k;
        if (anio1_14 == anio2_14) {
            dmes = (mes2_14 - mes1_14);
        } else {
            danios = (anio2_14 - anio1_14);
            if (danios == 1) {
                r = (12 - mes1_14);
                dmes = (r + mes2_14);
            } else if (danios > 1) {
                rr = ((danios - 1) * 12);
                k = (12 - mes1_14);
                dmes = (k + rr + mes2_14);
            }
        }
        String pp = Integer.toString(dmes);
        sptiempolaboro14.setText(pp);
        meses14 = pp;
    }//GEN-LAST:event_fecharetiroemp_a14PropertyChange

    private void txtdiligencielosdatosmotivo14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdiligencielosdatosmotivo14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdiligencielosdatosmotivo14ActionPerformed

    private void txtdiligencielosdatosmotivo14KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdiligencielosdatosmotivo14KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdiligencielosdatosmotivo14KeyTyped

    private void jCheckBox65ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox65ItemStateChanged
        if (jCheckBox65.isSelected()) {
            fechaingresoemp14.setEnabled(false);
            fecharetiroemp14.setEnabled(false);
            fechaingresoemp_a14.setEnabled(false);
            fecharetiroemp_a14.setEnabled(false);
            sptiempolaboro14.setEnabled(true);
            HistoriaLaboral.setVnfecha14(false);
        } else {
            fechaingresoemp14.setEnabled(true);
            fecharetiroemp14.setEnabled(true);
            fechaingresoemp_a14.setEnabled(true);
            fecharetiroemp_a14.setEnabled(true);
            sptiempolaboro14.setEnabled(false);
            HistoriaLaboral.setVnfecha14(true);
        }
    }//GEN-LAST:event_jCheckBox65ItemStateChanged

    private void jLabel126MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel126MouseClicked
        HistoriaLaboral.setEmpleo15("hay");
        jPanel17.setVisible(true); //siguiente panel
        jLabel120.setVisible(false); // signo menos del anterior del anterior
        jLabel126.setVisible(false); //signo más del anterior (este)
        jLabel127.setVisible(true); //signo menos de (este)
    }//GEN-LAST:event_jLabel126MouseClicked

    private void jLabel127MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel127MouseClicked
        HistoriaLaboral.setEmpleo15("nohay");
        jPanel17.setVisible(false); //siguiente panel
        jLabel120.setVisible(true); // signo menos del anterior del anterior
        jLabel126.setVisible(true); //signo más del anterior (este)
        jLabel127.setVisible(false); //signo menos de (este)
    }//GEN-LAST:event_jLabel127MouseClicked

    private void txtdiligencielosdatoscargo15CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtdiligencielosdatoscargo15CaretUpdate
        HistoriaLaboral.setCargotrabe15(txtdiligencielosdatoscargo15.getText());
    }//GEN-LAST:event_txtdiligencielosdatoscargo15CaretUpdate

    private void txtdiligencielosdatoscargo15KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdiligencielosdatoscargo15KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdiligencielosdatoscargo15KeyTyped

    private void txtdiligencielosdatosempresa15CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtdiligencielosdatosempresa15CaretUpdate
        HistoriaLaboral.setEmpresa15(txtdiligencielosdatosempresa15.getText());
    }//GEN-LAST:event_txtdiligencielosdatosempresa15CaretUpdate

    private void txtdiligencielosdatosempresa15KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdiligencielosdatosempresa15KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdiligencielosdatosempresa15KeyTyped

    private void txtdiligencielosdatoslugar15CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtdiligencielosdatoslugar15CaretUpdate
        HistoriaLaboral.setLugarempresa15(txtdiligencielosdatoslugar15.getText());
    }//GEN-LAST:event_txtdiligencielosdatoslugar15CaretUpdate

    private void txtdiligencielosdatoslugar15KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdiligencielosdatoslugar15KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdiligencielosdatoslugar15KeyTyped

    private void txtdiligencielosdatossalario15CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtdiligencielosdatossalario15CaretUpdate
        HistoriaLaboral.setSalariobe15(txtdiligencielosdatossalario15.getText());
    }//GEN-LAST:event_txtdiligencielosdatossalario15CaretUpdate

    private void txtdiligencielosdatossalario15KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdiligencielosdatossalario15KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdiligencielosdatossalario15KeyTyped

    private void fechaingresoemp15PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_fechaingresoemp15PropertyChange
        int m = fechaingresoemp15.getMonth();
        mes1_15 = m + 1;

        switch (mes1_15) {
            case 1:
                mesI15 = "Enero";
                break;
            case 2:
                mesI15 = "Febrero";
                break;
            case 3:
                mesI15 = "Marzo";
                break;
            case 4:
                mesI15 = "Abril";
                break;
            case 5:
                mesI15 = "Mayo";
                break;
            case 6:
                mesI15 = "Junio";
                break;
            case 7:
                mesI15 = "Julio";
                break;
            case 8:
                mesI15 = "Agosto";
                break;
            case 9:
                mesI15 = "Septiembre";
                break;
            case 10:
                mesI15 = "Octubre";
                break;
            case 11:
                mesI15 = "Noviembre";
                break;
            case 12:
                mesI15 = "Diciembre";
                break;
            default:
                break;
        }
    }//GEN-LAST:event_fechaingresoemp15PropertyChange

    private void fechaingresoemp_a15PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_fechaingresoemp_a15PropertyChange
        anio1_15 = fechaingresoemp_a15.getYear();
        anioI15 = String.valueOf(anio1_15);
    }//GEN-LAST:event_fechaingresoemp_a15PropertyChange

    private void sptiempolaboro15KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sptiempolaboro15KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_sptiempolaboro15KeyTyped

    private void fecharetiroemp15PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_fecharetiroemp15PropertyChange
        int m2 = fecharetiroemp15.getMonth();
        mes2_15 = m2 + 1;
        switch (mes2_15) {
            case 1:
                mesR15 = "Enero";
                break;
            case 2:
                mesR15 = "Febrero";
                break;
            case 3:
                mesR15 = "Marzo";
                break;
            case 4:
                mesR15 = "Abril";
                break;
            case 5:
                mesR15 = "Mayo";
                break;
            case 6:
                mesR15 = "Junio";
                break;
            case 7:
                mesR15 = "Julio";
                break;
            case 8:
                mesR15 = "Agosto";
                break;
            case 9:
                mesR15 = "Septiembre";
                break;
            case 10:
                mesR15 = "Octubre";
                break;
            case 11:
                mesR15 = "Noviembre";
                break;
            case 12:
                mesR15 = "Diciembre";
                break;
            default:
                break;
        }

        String aa = Integer.toString(anio2_15);
        if (aa != null) {
            anio2_15 = fecharetiroemp_a15.getYear();
            int dmes = 0;
            int danios;
            int r;
            int rr;
            int k;
            if (anio1_15 == anio2_15) {
                dmes = (mes2_15 - mes1_15);
            } else {
                danios = (anio2_15 - anio1_15);
                if (danios == 1) {
                    r = (12 - mes1_15);
                    dmes = (r + mes2_15);
                } else if (danios > 1) {
                    rr = ((danios - 1) * 12);
                    k = (12 - mes1_15);
                    dmes = (k + rr + mes2_15);
                }
            }
            String pp = Integer.toString(dmes);
            sptiempolaboro15.setText(pp);
            meses15 = pp;
        }
    }//GEN-LAST:event_fecharetiroemp15PropertyChange

    private void fecharetiroemp_a15PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_fecharetiroemp_a15PropertyChange
        anio2_15 = fecharetiroemp_a15.getYear();
        anioR15 = String.valueOf(anio2_15);
        int dmes = 0;
        int danios;
        int r;
        int rr;
        int k;
        if (anio1_15 == anio2_15) {
            dmes = (mes2_15 - mes1_15);
        } else {
            danios = (anio2_15 - anio1_15);
            if (danios == 1) {
                r = (12 - mes1_15);
                dmes = (r + mes2_15);
            } else if (danios > 1) {
                rr = ((danios - 1) * 12);
                k = (12 - mes1_15);
                dmes = (k + rr + mes2_15);
            }
        }
        String pp = Integer.toString(dmes);
        sptiempolaboro15.setText(pp);
        meses15 = pp;
    }//GEN-LAST:event_fecharetiroemp_a15PropertyChange

    private void txtdiligencielosdatosmotivo15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdiligencielosdatosmotivo15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdiligencielosdatosmotivo15ActionPerformed

    private void txtdiligencielosdatosmotivo15KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdiligencielosdatosmotivo15KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdiligencielosdatosmotivo15KeyTyped

    private void jCheckBox66ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox66ItemStateChanged
        if (jCheckBox66.isSelected()) {
            fechaingresoemp15.setEnabled(false);
            fecharetiroemp15.setEnabled(false);
            fechaingresoemp_a15.setEnabled(false);
            fecharetiroemp_a15.setEnabled(false);
            sptiempolaboro15.setEnabled(true);
            HistoriaLaboral.setVnfecha15(false);
        } else {
            fechaingresoemp15.setEnabled(true);
            fecharetiroemp15.setEnabled(true);
            fechaingresoemp_a15.setEnabled(true);
            fecharetiroemp_a15.setEnabled(true);
            sptiempolaboro15.setEnabled(false);
            HistoriaLaboral.setVnfecha15(true);
        }
    }//GEN-LAST:event_jCheckBox66ItemStateChanged

    private void txtresphistola2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtresphistola2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtresphistola2ActionPerformed

    private void txtresphistola3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtresphistola3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtresphistola3ActionPerformed

    private void txtresphistola5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtresphistola5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtresphistola5ActionPerformed

    private void txtresphistola9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtresphistola9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtresphistola9ActionPerformed

    private void txtdiligencielosdatossalario3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdiligencielosdatossalario3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdiligencielosdatossalario3ActionPerformed

    private void txtdiligencielosdatosmotivoCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtdiligencielosdatosmotivoCaretUpdate
        HistoriaLaboral.setMotivoretiro1(txtdiligencielosdatosmotivo.getText());
    }//GEN-LAST:event_txtdiligencielosdatosmotivoCaretUpdate

    private void txtdiligencielosdatosmotivo1CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtdiligencielosdatosmotivo1CaretUpdate
        HistoriaLaboral.setMotivoretiro2(txtdiligencielosdatosmotivo1.getText());
    }//GEN-LAST:event_txtdiligencielosdatosmotivo1CaretUpdate

    private void txtdiligencielosdatosmotivo3CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtdiligencielosdatosmotivo3CaretUpdate
        HistoriaLaboral.setMotivoretiro3(txtdiligencielosdatosmotivo3.getText());
    }//GEN-LAST:event_txtdiligencielosdatosmotivo3CaretUpdate

    private void txtdiligencielosdatosmotivo4CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtdiligencielosdatosmotivo4CaretUpdate
        HistoriaLaboral.setMotivoretiro4(txtdiligencielosdatosmotivo4.getText());
    }//GEN-LAST:event_txtdiligencielosdatosmotivo4CaretUpdate

    private void txtdiligencielosdatosmotivo5CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtdiligencielosdatosmotivo5CaretUpdate
        HistoriaLaboral.setMotivoretiro5(txtdiligencielosdatosmotivo5.getText());
    }//GEN-LAST:event_txtdiligencielosdatosmotivo5CaretUpdate

    private void txtdiligencielosdatosmotivo6CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtdiligencielosdatosmotivo6CaretUpdate
        HistoriaLaboral.setMotivoretiro6(txtdiligencielosdatosmotivo6.getText());
    }//GEN-LAST:event_txtdiligencielosdatosmotivo6CaretUpdate

    private void txtdiligencielosdatosmotivo7CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtdiligencielosdatosmotivo7CaretUpdate
        HistoriaLaboral.setMotivoretiro7(txtdiligencielosdatosmotivo7.getText());
    }//GEN-LAST:event_txtdiligencielosdatosmotivo7CaretUpdate

    private void txtdiligencielosdatosmotivo8CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtdiligencielosdatosmotivo8CaretUpdate
        HistoriaLaboral.setMotivoretiro8(txtdiligencielosdatosmotivo8.getText());
    }//GEN-LAST:event_txtdiligencielosdatosmotivo8CaretUpdate

    private void txtdiligencielosdatosmotivo9CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtdiligencielosdatosmotivo9CaretUpdate
        HistoriaLaboral.setMotivoretiro9(txtdiligencielosdatosmotivo9.getText());
    }//GEN-LAST:event_txtdiligencielosdatosmotivo9CaretUpdate

    private void txtdiligencielosdatosmotivo10CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtdiligencielosdatosmotivo10CaretUpdate
        HistoriaLaboral.setMotivoretiro10(txtdiligencielosdatosmotivo10.getText());
    }//GEN-LAST:event_txtdiligencielosdatosmotivo10CaretUpdate

    private void txtdiligencielosdatosmotivo11CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtdiligencielosdatosmotivo11CaretUpdate
        HistoriaLaboral.setMotivoretiro11(txtdiligencielosdatosmotivo11.getText());
    }//GEN-LAST:event_txtdiligencielosdatosmotivo11CaretUpdate

    private void txtdiligencielosdatosmotivo12CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtdiligencielosdatosmotivo12CaretUpdate
        HistoriaLaboral.setMotivoretiro12(txtdiligencielosdatosmotivo12.getText());
    }//GEN-LAST:event_txtdiligencielosdatosmotivo12CaretUpdate

    private void txtdiligencielosdatosmotivo13CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtdiligencielosdatosmotivo13CaretUpdate
        HistoriaLaboral.setMotivoretiro13(txtdiligencielosdatosmotivo13.getText());
    }//GEN-LAST:event_txtdiligencielosdatosmotivo13CaretUpdate

    private void txtdiligencielosdatosmotivo14CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtdiligencielosdatosmotivo14CaretUpdate
        HistoriaLaboral.setMotivoretiro14(txtdiligencielosdatosmotivo14.getText());
    }//GEN-LAST:event_txtdiligencielosdatosmotivo14CaretUpdate

    private void txtdiligencielosdatosmotivo15CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtdiligencielosdatosmotivo15CaretUpdate
        HistoriaLaboral.setMotivoretiro15(txtdiligencielosdatosmotivo15.getText());
    }//GEN-LAST:event_txtdiligencielosdatosmotivo15CaretUpdate

    private void jRadioButton17ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton17ItemStateChanged
       if (jRadioButton17.isSelected()){
           Admisiones.setAdmHL1("hay");
       } else {
           Admisiones.setAdmHL1("nohay");
       }
    }//GEN-LAST:event_jRadioButton17ItemStateChanged

    private void jRadioButton18ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton18ItemStateChanged
        if (jRadioButton18.isSelected()){
           Admisiones.setAdmHL2("hay");
       } else {
           Admisiones.setAdmHL2("nohay");
       }
    }//GEN-LAST:event_jRadioButton18ItemStateChanged

    private void jRadioButton19ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton19ItemStateChanged
       if (jRadioButton19.isSelected()){
           Admisiones.setAdmHL3("hay");
       } else {
           Admisiones.setAdmHL3("nohay");
       }
    }//GEN-LAST:event_jRadioButton19ItemStateChanged

    private void jRadioButton20ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton20ItemStateChanged
       if (jRadioButton20.isSelected()){
           Admisiones.setAdmHL4("hay");
       } else {
           Admisiones.setAdmHL4("nohay");
       }
    }//GEN-LAST:event_jRadioButton20ItemStateChanged

    private void jRadioButton21ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton21ItemStateChanged
       if (jRadioButton21.isSelected()){
           Admisiones.setAdmHL5("hay");
       } else {
           Admisiones.setAdmHL5("nohay");
       }
    }//GEN-LAST:event_jRadioButton21ItemStateChanged

    private void jRadioButton22ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton22ItemStateChanged
        if (jRadioButton22.isSelected()){
           Admisiones.setAdmHL6("hay");
       } else {
           Admisiones.setAdmHL6("nohay");
       }
    }//GEN-LAST:event_jRadioButton22ItemStateChanged

    private void jRadioButton24ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton24ItemStateChanged
        if (jRadioButton24.isSelected()){
           Admisiones.setAdmHL7("hay");
       } else {
           Admisiones.setAdmHL7("nohay");
       }
    }//GEN-LAST:event_jRadioButton24ItemStateChanged

    private void jRadioButton25ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton25ItemStateChanged
       if (jRadioButton25.isSelected()){
           Admisiones.setAdmHL8("hay");
       } else {
           Admisiones.setAdmHL8("nohay");
       }
    }//GEN-LAST:event_jRadioButton25ItemStateChanged

    private void jRadioButton26ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton26ItemStateChanged
       if (jRadioButton26.isSelected()){
           Admisiones.setAdmHL9("hay");
       } else {
           Admisiones.setAdmHL9("nohay");
       }
    }//GEN-LAST:event_jRadioButton26ItemStateChanged

    private void jRadioButton23ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton23ItemStateChanged
        if (jRadioButton23.isSelected()){
           Admisiones.setAdmHL10("hay");
       } else {
           Admisiones.setAdmHL10("nohay");
       }
    }//GEN-LAST:event_jRadioButton23ItemStateChanged

    private void txtresphistola1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtresphistola1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtresphistola1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox chbxfalsiestafa;
    private javax.swing.JCheckBox chbxfalsifraude;
    private javax.swing.JCheckBox chbxfalsirobo;
    private javax.swing.JCheckBox chbxfalsisustraccioninf;
    private javax.swing.JCheckBox chbxfalspartactirre;
    private javax.swing.JCheckBox chbxfalspartactirre1;
    private javax.swing.JLabel cometioalgunoantes;
    private javax.swing.JLabel diligencielosdatoscargo;
    private javax.swing.JLabel diligencielosdatoscargo1;
    private javax.swing.JLabel diligencielosdatoscargo10;
    private javax.swing.JLabel diligencielosdatoscargo11;
    private javax.swing.JLabel diligencielosdatoscargo12;
    private javax.swing.JLabel diligencielosdatoscargo13;
    private javax.swing.JLabel diligencielosdatoscargo14;
    private javax.swing.JLabel diligencielosdatoscargo15;
    private javax.swing.JLabel diligencielosdatoscargo3;
    private javax.swing.JLabel diligencielosdatoscargo4;
    private javax.swing.JLabel diligencielosdatoscargo5;
    private javax.swing.JLabel diligencielosdatoscargo6;
    private javax.swing.JLabel diligencielosdatoscargo7;
    private javax.swing.JLabel diligencielosdatoscargo8;
    private javax.swing.JLabel diligencielosdatoscargo9;
    private javax.swing.JLabel diligencielosdatosempresa;
    private javax.swing.JLabel diligencielosdatosempresa1;
    private javax.swing.JLabel diligencielosdatosempresa10;
    private javax.swing.JLabel diligencielosdatosempresa11;
    private javax.swing.JLabel diligencielosdatosempresa12;
    private javax.swing.JLabel diligencielosdatosempresa13;
    private javax.swing.JLabel diligencielosdatosempresa14;
    private javax.swing.JLabel diligencielosdatosempresa15;
    private javax.swing.JLabel diligencielosdatosempresa3;
    private javax.swing.JLabel diligencielosdatosempresa4;
    private javax.swing.JLabel diligencielosdatosempresa5;
    private javax.swing.JLabel diligencielosdatosempresa6;
    private javax.swing.JLabel diligencielosdatosempresa7;
    private javax.swing.JLabel diligencielosdatosempresa8;
    private javax.swing.JLabel diligencielosdatosempresa9;
    private javax.swing.JLabel diligencielosdatosferetiro;
    private javax.swing.JLabel diligencielosdatosferetiro1;
    private javax.swing.JLabel diligencielosdatosferetiro10;
    private javax.swing.JLabel diligencielosdatosferetiro11;
    private javax.swing.JLabel diligencielosdatosferetiro12;
    private javax.swing.JLabel diligencielosdatosferetiro13;
    private javax.swing.JLabel diligencielosdatosferetiro14;
    private javax.swing.JLabel diligencielosdatosferetiro15;
    private javax.swing.JLabel diligencielosdatosferetiro16;
    private javax.swing.JLabel diligencielosdatosferetiro17;
    private javax.swing.JLabel diligencielosdatosferetiro18;
    private javax.swing.JLabel diligencielosdatosferetiro19;
    private javax.swing.JLabel diligencielosdatosferetiro2;
    private javax.swing.JLabel diligencielosdatosferetiro20;
    private javax.swing.JLabel diligencielosdatosferetiro21;
    private javax.swing.JLabel diligencielosdatosferetiro22;
    private javax.swing.JLabel diligencielosdatosferetiro23;
    private javax.swing.JLabel diligencielosdatosferetiro24;
    private javax.swing.JLabel diligencielosdatosferetiro25;
    private javax.swing.JLabel diligencielosdatosferetiro26;
    private javax.swing.JLabel diligencielosdatosferetiro27;
    private javax.swing.JLabel diligencielosdatosferetiro28;
    private javax.swing.JLabel diligencielosdatosferetiro29;
    private javax.swing.JLabel diligencielosdatosferetiro3;
    private javax.swing.JLabel diligencielosdatosferetiro30;
    private javax.swing.JLabel diligencielosdatosferetiro31;
    private javax.swing.JLabel diligencielosdatosferetiro6;
    private javax.swing.JLabel diligencielosdatosferetiro7;
    private javax.swing.JLabel diligencielosdatosferetiro8;
    private javax.swing.JLabel diligencielosdatosferetiro9;
    private javax.swing.JLabel diligencielosdatosinacti;
    private javax.swing.JLabel diligencielosdatoslugar;
    private javax.swing.JLabel diligencielosdatoslugar1;
    private javax.swing.JLabel diligencielosdatoslugar10;
    private javax.swing.JLabel diligencielosdatoslugar11;
    private javax.swing.JLabel diligencielosdatoslugar12;
    private javax.swing.JLabel diligencielosdatoslugar13;
    private javax.swing.JLabel diligencielosdatoslugar14;
    private javax.swing.JLabel diligencielosdatoslugar15;
    private javax.swing.JLabel diligencielosdatoslugar3;
    private javax.swing.JLabel diligencielosdatoslugar4;
    private javax.swing.JLabel diligencielosdatoslugar5;
    private javax.swing.JLabel diligencielosdatoslugar6;
    private javax.swing.JLabel diligencielosdatoslugar7;
    private javax.swing.JLabel diligencielosdatoslugar8;
    private javax.swing.JLabel diligencielosdatoslugar9;
    private javax.swing.JLabel diligencielosdatosmotivo;
    private javax.swing.JLabel diligencielosdatosmotivo1;
    private javax.swing.JLabel diligencielosdatosmotivo10;
    private javax.swing.JLabel diligencielosdatosmotivo11;
    private javax.swing.JLabel diligencielosdatosmotivo12;
    private javax.swing.JLabel diligencielosdatosmotivo13;
    private javax.swing.JLabel diligencielosdatosmotivo14;
    private javax.swing.JLabel diligencielosdatosmotivo15;
    private javax.swing.JLabel diligencielosdatosmotivo3;
    private javax.swing.JLabel diligencielosdatosmotivo4;
    private javax.swing.JLabel diligencielosdatosmotivo5;
    private javax.swing.JLabel diligencielosdatosmotivo6;
    private javax.swing.JLabel diligencielosdatosmotivo7;
    private javax.swing.JLabel diligencielosdatosmotivo8;
    private javax.swing.JLabel diligencielosdatosmotivo9;
    private javax.swing.JLabel diligencielosdatossalario;
    private javax.swing.JLabel diligencielosdatossalario1;
    private javax.swing.JLabel diligencielosdatossalario10;
    private javax.swing.JLabel diligencielosdatossalario11;
    private javax.swing.JLabel diligencielosdatossalario12;
    private javax.swing.JLabel diligencielosdatossalario13;
    private javax.swing.JLabel diligencielosdatossalario14;
    private javax.swing.JLabel diligencielosdatossalario15;
    private javax.swing.JLabel diligencielosdatossalario3;
    private javax.swing.JLabel diligencielosdatossalario4;
    private javax.swing.JLabel diligencielosdatossalario5;
    private javax.swing.JLabel diligencielosdatossalario6;
    private javax.swing.JLabel diligencielosdatossalario7;
    private javax.swing.JLabel diligencielosdatossalario8;
    private javax.swing.JLabel diligencielosdatossalario9;
    private javax.swing.JLabel diligencielosdatostiempo;
    private javax.swing.JLabel diligencielosdatostiempo1;
    private javax.swing.JLabel diligencielosdatostiempo10;
    private javax.swing.JLabel diligencielosdatostiempo11;
    private javax.swing.JLabel diligencielosdatostiempo12;
    private javax.swing.JLabel diligencielosdatostiempo13;
    private javax.swing.JLabel diligencielosdatostiempo14;
    private javax.swing.JLabel diligencielosdatostiempo15;
    private javax.swing.JLabel diligencielosdatostiempo3;
    private javax.swing.JLabel diligencielosdatostiempo4;
    private javax.swing.JLabel diligencielosdatostiempo5;
    private javax.swing.JLabel diligencielosdatostiempo6;
    private javax.swing.JLabel diligencielosdatostiempo7;
    private javax.swing.JLabel diligencielosdatostiempo8;
    private javax.swing.JLabel diligencielosdatostiempo9;
    private javax.swing.JLabel diligencielosdatostiempom;
    private javax.swing.JLabel diligencielosdatostiempom1;
    private javax.swing.JLabel diligencielosdatostiempom10;
    private javax.swing.JLabel diligencielosdatostiempom11;
    private javax.swing.JLabel diligencielosdatostiempom12;
    private javax.swing.JLabel diligencielosdatostiempom13;
    private javax.swing.JLabel diligencielosdatostiempom14;
    private javax.swing.JLabel diligencielosdatostiempom15;
    private javax.swing.JLabel diligencielosdatostiempom3;
    private javax.swing.JLabel diligencielosdatostiempom4;
    private javax.swing.JLabel diligencielosdatostiempom5;
    private javax.swing.JLabel diligencielosdatostiempom6;
    private javax.swing.JLabel diligencielosdatostiempom7;
    private javax.swing.JLabel diligencielosdatostiempom8;
    private javax.swing.JLabel diligencielosdatostiempom9;
    private com.toedter.calendar.JMonthChooser fechaingresoemp;
    private com.toedter.calendar.JMonthChooser fechaingresoemp1;
    private com.toedter.calendar.JMonthChooser fechaingresoemp10;
    private com.toedter.calendar.JMonthChooser fechaingresoemp11;
    private com.toedter.calendar.JMonthChooser fechaingresoemp12;
    private com.toedter.calendar.JMonthChooser fechaingresoemp13;
    private com.toedter.calendar.JMonthChooser fechaingresoemp14;
    private com.toedter.calendar.JMonthChooser fechaingresoemp15;
    private com.toedter.calendar.JMonthChooser fechaingresoemp3;
    private com.toedter.calendar.JMonthChooser fechaingresoemp4;
    private com.toedter.calendar.JMonthChooser fechaingresoemp5;
    private com.toedter.calendar.JMonthChooser fechaingresoemp6;
    private com.toedter.calendar.JMonthChooser fechaingresoemp7;
    private com.toedter.calendar.JMonthChooser fechaingresoemp8;
    private com.toedter.calendar.JMonthChooser fechaingresoemp9;
    private com.toedter.calendar.JYearChooser fechaingresoemp_a;
    private com.toedter.calendar.JYearChooser fechaingresoemp_a1;
    private com.toedter.calendar.JYearChooser fechaingresoemp_a10;
    private com.toedter.calendar.JYearChooser fechaingresoemp_a11;
    private com.toedter.calendar.JYearChooser fechaingresoemp_a12;
    private com.toedter.calendar.JYearChooser fechaingresoemp_a13;
    private com.toedter.calendar.JYearChooser fechaingresoemp_a14;
    private com.toedter.calendar.JYearChooser fechaingresoemp_a15;
    private com.toedter.calendar.JYearChooser fechaingresoemp_a3;
    private com.toedter.calendar.JYearChooser fechaingresoemp_a4;
    private com.toedter.calendar.JYearChooser fechaingresoemp_a5;
    private com.toedter.calendar.JYearChooser fechaingresoemp_a6;
    private com.toedter.calendar.JYearChooser fechaingresoemp_a7;
    private com.toedter.calendar.JYearChooser fechaingresoemp_a8;
    private com.toedter.calendar.JYearChooser fechaingresoemp_a9;
    private com.toedter.calendar.JMonthChooser fecharetiroemp;
    private com.toedter.calendar.JMonthChooser fecharetiroemp1;
    private com.toedter.calendar.JMonthChooser fecharetiroemp10;
    private com.toedter.calendar.JMonthChooser fecharetiroemp11;
    private com.toedter.calendar.JMonthChooser fecharetiroemp12;
    private com.toedter.calendar.JMonthChooser fecharetiroemp13;
    private com.toedter.calendar.JMonthChooser fecharetiroemp14;
    private com.toedter.calendar.JMonthChooser fecharetiroemp15;
    private com.toedter.calendar.JMonthChooser fecharetiroemp3;
    private com.toedter.calendar.JMonthChooser fecharetiroemp4;
    private com.toedter.calendar.JMonthChooser fecharetiroemp5;
    private com.toedter.calendar.JMonthChooser fecharetiroemp6;
    private com.toedter.calendar.JMonthChooser fecharetiroemp7;
    private com.toedter.calendar.JMonthChooser fecharetiroemp8;
    private com.toedter.calendar.JMonthChooser fecharetiroemp9;
    private com.toedter.calendar.JYearChooser fecharetiroemp_a;
    private com.toedter.calendar.JYearChooser fecharetiroemp_a1;
    private com.toedter.calendar.JYearChooser fecharetiroemp_a10;
    private com.toedter.calendar.JYearChooser fecharetiroemp_a11;
    private com.toedter.calendar.JYearChooser fecharetiroemp_a12;
    private com.toedter.calendar.JYearChooser fecharetiroemp_a13;
    private com.toedter.calendar.JYearChooser fecharetiroemp_a14;
    private com.toedter.calendar.JYearChooser fecharetiroemp_a15;
    private com.toedter.calendar.JYearChooser fecharetiroemp_a3;
    private com.toedter.calendar.JYearChooser fecharetiroemp_a4;
    private com.toedter.calendar.JYearChooser fecharetiroemp_a5;
    private com.toedter.calendar.JYearChooser fecharetiroemp_a6;
    private com.toedter.calendar.JYearChooser fecharetiroemp_a7;
    private com.toedter.calendar.JYearChooser fecharetiroemp_a8;
    private com.toedter.calendar.JYearChooser fecharetiroemp_a9;
    private javax.swing.JLabel historlabopre1;
    private javax.swing.JLabel historlabopre2;
    private javax.swing.JLabel historlabopre3;
    private javax.swing.JLabel historlabopre4;
    private javax.swing.JLabel historlabopre5;
    private javax.swing.JLabel historlabopre6;
    private javax.swing.JLabel historlabopre7;
    private javax.swing.JLabel historlabopre8_1;
    private javax.swing.JLabel historlabopre9;
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
    private javax.swing.JCheckBox jCheckBox54;
    private javax.swing.JCheckBox jCheckBox55;
    private javax.swing.JCheckBox jCheckBox56;
    private javax.swing.JCheckBox jCheckBox57;
    private javax.swing.JCheckBox jCheckBox58;
    private javax.swing.JCheckBox jCheckBox59;
    private javax.swing.JCheckBox jCheckBox60;
    private javax.swing.JCheckBox jCheckBox61;
    private javax.swing.JCheckBox jCheckBox62;
    private javax.swing.JCheckBox jCheckBox63;
    private javax.swing.JCheckBox jCheckBox64;
    private javax.swing.JCheckBox jCheckBox65;
    private javax.swing.JCheckBox jCheckBox66;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel113;
    private javax.swing.JLabel jLabel114;
    private javax.swing.JLabel jLabel115;
    private javax.swing.JLabel jLabel116;
    private javax.swing.JLabel jLabel117;
    private javax.swing.JLabel jLabel118;
    private javax.swing.JLabel jLabel119;
    private javax.swing.JLabel jLabel120;
    private javax.swing.JLabel jLabel121;
    private javax.swing.JLabel jLabel122;
    private javax.swing.JLabel jLabel123;
    private javax.swing.JLabel jLabel124;
    private javax.swing.JLabel jLabel125;
    private javax.swing.JLabel jLabel126;
    private javax.swing.JLabel jLabel127;
    private javax.swing.JLabel jLabel128;
    private javax.swing.JLabel jLabel129;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel130;
    private javax.swing.JLabel jLabel131;
    private javax.swing.JLabel jLabel132;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel186;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
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
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JRadioButton jRadioButton17;
    private javax.swing.JRadioButton jRadioButton18;
    private javax.swing.JRadioButton jRadioButton19;
    private javax.swing.JRadioButton jRadioButton20;
    private javax.swing.JRadioButton jRadioButton21;
    private javax.swing.JRadioButton jRadioButton22;
    private javax.swing.JRadioButton jRadioButton23;
    private javax.swing.JRadioButton jRadioButton24;
    private javax.swing.JRadioButton jRadioButton25;
    private javax.swing.JRadioButton jRadioButton26;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea jTextArea5;
    private javax.swing.JTextField sptiempolaboro;
    private javax.swing.JTextField sptiempolaboro1;
    private javax.swing.JTextField sptiempolaboro10;
    private javax.swing.JTextField sptiempolaboro11;
    private javax.swing.JTextField sptiempolaboro12;
    private javax.swing.JTextField sptiempolaboro13;
    private javax.swing.JTextField sptiempolaboro14;
    private javax.swing.JTextField sptiempolaboro15;
    private javax.swing.JTextField sptiempolaboro3;
    private javax.swing.JTextField sptiempolaboro4;
    private javax.swing.JTextField sptiempolaboro5;
    private javax.swing.JTextField sptiempolaboro6;
    private javax.swing.JTextField sptiempolaboro7;
    private javax.swing.JTextField sptiempolaboro8;
    private javax.swing.JTextField sptiempolaboro9;
    private javax.swing.JTextField txtdiligencielosdatoscargo;
    private javax.swing.JTextField txtdiligencielosdatoscargo1;
    private javax.swing.JTextField txtdiligencielosdatoscargo10;
    private javax.swing.JTextField txtdiligencielosdatoscargo11;
    private javax.swing.JTextField txtdiligencielosdatoscargo12;
    private javax.swing.JTextField txtdiligencielosdatoscargo13;
    private javax.swing.JTextField txtdiligencielosdatoscargo14;
    private javax.swing.JTextField txtdiligencielosdatoscargo15;
    private javax.swing.JTextField txtdiligencielosdatoscargo3;
    private javax.swing.JTextField txtdiligencielosdatoscargo4;
    private javax.swing.JTextField txtdiligencielosdatoscargo5;
    private javax.swing.JTextField txtdiligencielosdatoscargo6;
    private javax.swing.JTextField txtdiligencielosdatoscargo7;
    private javax.swing.JTextField txtdiligencielosdatoscargo8;
    private javax.swing.JTextField txtdiligencielosdatoscargo9;
    private javax.swing.JTextField txtdiligencielosdatosempresa;
    private javax.swing.JTextField txtdiligencielosdatosempresa1;
    private javax.swing.JTextField txtdiligencielosdatosempresa10;
    private javax.swing.JTextField txtdiligencielosdatosempresa11;
    private javax.swing.JTextField txtdiligencielosdatosempresa12;
    private javax.swing.JTextField txtdiligencielosdatosempresa13;
    private javax.swing.JTextField txtdiligencielosdatosempresa14;
    private javax.swing.JTextField txtdiligencielosdatosempresa15;
    private javax.swing.JTextField txtdiligencielosdatosempresa3;
    private javax.swing.JTextField txtdiligencielosdatosempresa4;
    private javax.swing.JTextField txtdiligencielosdatosempresa5;
    private javax.swing.JTextField txtdiligencielosdatosempresa6;
    private javax.swing.JTextField txtdiligencielosdatosempresa7;
    private javax.swing.JTextField txtdiligencielosdatosempresa8;
    private javax.swing.JTextField txtdiligencielosdatosempresa9;
    private javax.swing.JTextField txtdiligencielosdatoslugar;
    private javax.swing.JTextField txtdiligencielosdatoslugar1;
    private javax.swing.JTextField txtdiligencielosdatoslugar10;
    private javax.swing.JTextField txtdiligencielosdatoslugar11;
    private javax.swing.JTextField txtdiligencielosdatoslugar12;
    private javax.swing.JTextField txtdiligencielosdatoslugar13;
    private javax.swing.JTextField txtdiligencielosdatoslugar14;
    private javax.swing.JTextField txtdiligencielosdatoslugar15;
    private javax.swing.JTextField txtdiligencielosdatoslugar3;
    private javax.swing.JTextField txtdiligencielosdatoslugar4;
    private javax.swing.JTextField txtdiligencielosdatoslugar5;
    private javax.swing.JTextField txtdiligencielosdatoslugar6;
    private javax.swing.JTextField txtdiligencielosdatoslugar7;
    private javax.swing.JTextField txtdiligencielosdatoslugar8;
    private javax.swing.JTextField txtdiligencielosdatoslugar9;
    private javax.swing.JTextField txtdiligencielosdatosmotivo;
    private javax.swing.JTextField txtdiligencielosdatosmotivo1;
    private javax.swing.JTextField txtdiligencielosdatosmotivo10;
    private javax.swing.JTextField txtdiligencielosdatosmotivo11;
    private javax.swing.JTextField txtdiligencielosdatosmotivo12;
    private javax.swing.JTextField txtdiligencielosdatosmotivo13;
    private javax.swing.JTextField txtdiligencielosdatosmotivo14;
    private javax.swing.JTextField txtdiligencielosdatosmotivo15;
    private javax.swing.JTextField txtdiligencielosdatosmotivo3;
    private javax.swing.JTextField txtdiligencielosdatosmotivo4;
    private javax.swing.JTextField txtdiligencielosdatosmotivo5;
    private javax.swing.JTextField txtdiligencielosdatosmotivo6;
    private javax.swing.JTextField txtdiligencielosdatosmotivo7;
    private javax.swing.JTextField txtdiligencielosdatosmotivo8;
    private javax.swing.JTextField txtdiligencielosdatosmotivo9;
    private javax.swing.JTextField txtdiligencielosdatossalario;
    private javax.swing.JTextField txtdiligencielosdatossalario1;
    private javax.swing.JTextField txtdiligencielosdatossalario10;
    private javax.swing.JTextField txtdiligencielosdatossalario11;
    private javax.swing.JTextField txtdiligencielosdatossalario12;
    private javax.swing.JTextField txtdiligencielosdatossalario13;
    private javax.swing.JTextField txtdiligencielosdatossalario14;
    private javax.swing.JTextField txtdiligencielosdatossalario15;
    private javax.swing.JTextField txtdiligencielosdatossalario3;
    private javax.swing.JTextField txtdiligencielosdatossalario4;
    private javax.swing.JTextField txtdiligencielosdatossalario5;
    private javax.swing.JTextField txtdiligencielosdatossalario6;
    private javax.swing.JTextField txtdiligencielosdatossalario7;
    private javax.swing.JTextField txtdiligencielosdatossalario8;
    private javax.swing.JTextField txtdiligencielosdatossalario9;
    private javax.swing.JTextField txtresphistola1;
    private javax.swing.JTextField txtresphistola2;
    private javax.swing.JTextField txtresphistola3;
    private javax.swing.JTextField txtresphistola4;
    private javax.swing.JTextField txtresphistola5;
    private javax.swing.JTextField txtresphistola6;
    private javax.swing.JTextField txtresphistola7;
    private javax.swing.JTextField txtresphistola8;
    private javax.swing.JTextField txtresphistola9;
    private javax.swing.JTextField txtresphistolaantes;
    // End of variables declaration//GEN-END:variables
}
