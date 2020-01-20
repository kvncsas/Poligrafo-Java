package view;

import classes.Admisiones;
import classes.InfoAcademica;
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
public class InformacionAcademica extends javax.swing.JInternalFrame {

    public InformacionAcademica() {
        ((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI()).setNorthPane(null);
        initComponents();
        indisponibles();
        jScrollPane2.getVerticalScrollBar().setUnitIncrement(15);
        //validadordatos();
    }

//      SpellChecker.register(jTextArea2);
    public void indisponibles() {
        jPanel2.setVisible(false);
        jPanel3.setVisible(false);
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
        jPanel18.setVisible(false);
        jPanel19.setVisible(false);
        jPanel20.setVisible(false);
        jPanel21.setVisible(false);
        jPanel22.setVisible(false);
        jPanel23.setVisible(false);
        jPanel24.setVisible(false);
        jPanel25.setVisible(false);
        jPanel26.setVisible(false);
        jPanel27.setVisible(false);
        jPanel28.setVisible(false);

        jPanel5.setVisible(false);
        jLabel138.setVisible(false);

        jCheckBox3.setVisible(false);
        jCheckBox4.setVisible(false);
        jPanel7.setVisible(false);
        jPanel6.setVisible(false);
        jPanel1.setVisible(false);

        nombreuniversidad1.setVisible(false);
        txtnombreuniversidad1.setVisible(false);
        jLabel169.setVisible(false);
        ciudaduniversidad1.setVisible(false);

        txtfamiliape1.setVisible(false);
        jLabel170.setVisible(false);
        CorrectorOrtografia p = new CorrectorOrtografia("Debido a...", txtexplsusestu);
        //primaria

        txtanio_primaria.setVisible(false);

        //bachiller
//        jLabel160.setVisible(false);
        //
        jLabel56.setVisible(false);
        jLabel57.setVisible(false);
        jLabel58.setVisible(false);
        jLabel59.setVisible(false);
        suspendioestu.setVisible(false);
//        cbxsuspendioes.setVisible(false);
        txtexplsusestu.setVisible(false);
        nosemestre.setVisible(false);
        spsemestre.setVisible(false);
        nombreprogacade.setVisible(false);
        txtnombreprogacade.setVisible(false);
        nombreuniversidad.setVisible(false);
        txtnombreuniversidad.setVisible(false);
        ciudaduniversidad.setVisible(false);
        txtciudaduniversidad.setVisible(false);
        jornadauniversidad.setVisible(false);
        cbxjornadauniver.setVisible(false);
    }

    Thinking_uh iconThinking_uh = new Thinking_uh();

    public void limpiar() {
        chbxprimaria.setSelected(false);
        chbxbachillerato.setSelected(false);
        chbxtecnico.setSelected(false);
        chbxtecnologo.setSelected(false);
        chbxprofesional.setSelected(false);
        chbxpostgrado.setSelected(false);
        chbxmaestria.setSelected(false);
        chbxdoctorado.setSelected(false);

        txtni_primaria.setText("");
        txtciudad_primaria.setText("");
        txtanio_primaria.setText("");
        
        txttipo_bachi.setText("");
        txtni_bachi.setText("");
        txtciudad_bachi.setText("");
        txtanio_bachi.setText("");
        
        txtpa_tecni.setText("");
        txtni_tecni.setText("");
        txtciudad_tecni.setText("");
        txtanio_tecni.setText("");
        txtpa_tecni1.setText("");
        txtni_tecni1.setText("");
        txtciudad_tecni1.setText("");
        txtanio_tecni1.setText("");
        txtpa_tecni2.setText("");
        txtni_tecni2.setText("");
        txtciudad_tecni2.setText("");
        txtanio_tecni2.setText("");
        txtpa_tecni3.setText("");
        txtni_tecni3.setText("");
        txtciudad_tecni3.setText("");
        txtanio_tecni3.setText("");
        txtpa_tecni4.setText("");
        txtni_tecni4.setText("");
        txtciudad_tecni4.setText("");
        txtanio_tecni4.setText("");
        txtpa_tecni5.setText("");
        txtni_tecni5.setText("");
        txtciudad_tecni5.setText("");
        txtanio_tecni5.setText("");
        txtpa_tecni6.setText("");
        txtni_tecni6.setText("");
        txtciudad_tecni6.setText("");
        txtanio_tecni6.setText("");
        txtpa_tecni7.setText("");
        txtni_tecni7.setText("");
        txtciudad_tecni7.setText("");
        txtanio_tecni7.setText("");
        txtpa_tecni8.setText("");
        txtni_tecni8.setText("");
        txtciudad_tecni8.setText("");
        txtanio_tecni8.setText("");
        txtpa_tecni9.setText("");
        txtni_tecni9.setText("");
        txtciudad_tecni9.setText("");
        txtanio_tecni9.setText("");
        txtpa_tecni10.setText("");
        txtni_tecni10.setText("");
        txtciudad_tecni10.setText("");
        txtanio_tecni10.setText("");
        txtpa_tecni11.setText("");
        txtni_tecni11.setText("");
        txtciudad_tecni11.setText("");
        txtanio_tecni11.setText("");
        txtpa_tecni12.setText("");
        txtni_tecni12.setText("");
        txtciudad_tecni12.setText("");
        txtanio_tecni12.setText("");
        txtpa_tecni13.setText("");
        txtni_tecni13.setText("");
        txtciudad_tecni13.setText("");
        txtanio_tecni13.setText("");
        txtpa_tecni14.setText("");
        txtni_tecni14.setText("");
        txtciudad_tecni14.setText("");
        txtanio_tecni14.setText("");
        txtpa_tecni15.setText("");
        txtni_tecni15.setText("");
        txtciudad_tecni15.setText("");
        txtanio_tecni15.setText("");
        txtpa_tecni16.setText("");
        txtni_tecni16.setText("");
        txtciudad_tecni16.setText("");
        txtanio_tecni16.setText("");
        txtpa_tecni17.setText("");
        txtni_tecni17.setText("");
        txtciudad_tecni17.setText("");
        txtanio_tecni17.setText("");
        txtpa_tecni18.setText("");
        txtni_tecni18.setText("");
        txtciudad_tecni18.setText("");
        txtanio_tecni18.setText("");
        txtpa_tecni19.setText("");
        txtni_tecni19.setText("");
        txtciudad_tecni19.setText("");
        txtanio_tecni19.setText("");
        txtpa_tecni20.setText("");
        txtni_tecni20.setText("");
        txtciudad_tecni20.setText("");
        txtanio_tecni20.setText("");
        txtpa_tecni21.setText("");
        txtni_tecni21.setText("");
        txtciudad_tecni21.setText("");
        txtanio_tecni21.setText("");
        txtpa_tecni22.setText("");
        txtni_tecni22.setText("");
        txtciudad_tecni22.setText("");
        txtanio_tecni22.setText("");
        txtpa_tecni23.setText("");
        txtni_tecni23.setText("");
        txtciudad_tecni23.setText("");
        txtanio_tecni23.setText("");

        txtnombreprogacade.setText("");
        txtnombreuniversidad.setText("");
        txtciudaduniversidad.setText("");
        cbxjornadauniver.setSelectedItem("Seleccione");
         txtnombreuniversidad1.setText("");
        txtexplsusestu.setText("");
        txtfamiliape1.setText(""); 
        
        jCheckBox1.setSelected(false);
        jCheckBox2.setSelected(false);
        jCheckBox3.setSelected(false);
        jCheckBox4.setSelected(false);
        jCheckBox5.setSelected(false);
        jCheckBox6.setSelected(false);
        
        spsemestre.setValue(0);
        
        jScrollPane2.getVerticalScrollBar().setValue(0);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel4 = new javax.swing.JPanel();
        jLabel76 = new javax.swing.JLabel();
        chbxprimaria = new javax.swing.JCheckBox();
        chbxbachillerato = new javax.swing.JCheckBox();
        chbxtecnico = new javax.swing.JCheckBox();
        chbxtecnologo = new javax.swing.JCheckBox();
        chbxprofesional = new javax.swing.JCheckBox();
        chbxmaestria = new javax.swing.JCheckBox();
        chbxpostgrado = new javax.swing.JCheckBox();
        jLabel98 = new javax.swing.JLabel();
        suspendioestu = new javax.swing.JLabel();
        chbxdoctorado = new javax.swing.JCheckBox();
        jLabel170 = new javax.swing.JLabel();
        txtfamiliape1 = new javax.swing.JTextField();
        jLabel171 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        jCheckBox6 = new javax.swing.JCheckBox();
        jPanel1 = new javax.swing.JPanel();
        jLabel45 = new javax.swing.JLabel();
        txtanio_tecni = new javax.swing.JTextField();
        anio_tecni = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        txtciudad_tecni = new javax.swing.JTextField();
        ciudad_tecni = new javax.swing.JLabel();
        pa_tecni = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        txtpa_tecni = new javax.swing.JTextField();
        ni_tecni = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        txtni_tecni = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel138 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel60 = new javax.swing.JLabel();
        txtanio_bachi = new javax.swing.JTextField();
        jLabel54 = new javax.swing.JLabel();
        txtni_bachi = new javax.swing.JTextField();
        ni_bachi = new javax.swing.JLabel();
        anio_bachi = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        txtciudad_bachi = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        txttipo_bachi = new javax.swing.JTextField();
        tipo_bachi = new javax.swing.JLabel();
        ciudad_bachi = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        txtanio_primaria = new javax.swing.JTextField();
        anio_primaria = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        txtciudad_primaria = new javax.swing.JTextField();
        ciudad_primaria = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        txtni_primaria = new javax.swing.JTextField();
        ni_primaria1 = new javax.swing.JLabel();
        ni_primaria = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        txtexplsusestu = new javax.swing.JTextField();
        nosemestre = new javax.swing.JLabel();
        spsemestre = new javax.swing.JSpinner();
        nombreprogacade = new javax.swing.JLabel();
        txtnombreprogacade = new javax.swing.JTextField();
        nombreuniversidad = new javax.swing.JLabel();
        jornadauniversidad = new javax.swing.JLabel();
        cbxjornadauniver = new javax.swing.JComboBox<>();
        txtnombreuniversidad = new javax.swing.JTextField();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        nombreuniversidad1 = new javax.swing.JLabel();
        jLabel169 = new javax.swing.JLabel();
        txtnombreuniversidad1 = new javax.swing.JTextField();
        ciudaduniversidad1 = new javax.swing.JLabel();
        txtciudaduniversidad = new javax.swing.JTextField();
        jLabel59 = new javax.swing.JLabel();
        ciudaduniversidad = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel46 = new javax.swing.JLabel();
        txtanio_tecni1 = new javax.swing.JTextField();
        anio_tecni1 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        txtciudad_tecni1 = new javax.swing.JTextField();
        ciudad_tecni1 = new javax.swing.JLabel();
        pa_tecni1 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        txtpa_tecni1 = new javax.swing.JTextField();
        ni_tecni1 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        txtni_tecni1 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel139 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel47 = new javax.swing.JLabel();
        txtanio_tecni2 = new javax.swing.JTextField();
        anio_tecni2 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        txtciudad_tecni2 = new javax.swing.JTextField();
        ciudad_tecni2 = new javax.swing.JLabel();
        pa_tecni2 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        txtpa_tecni2 = new javax.swing.JTextField();
        ni_tecni2 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        txtni_tecni2 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel140 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel48 = new javax.swing.JLabel();
        txtanio_tecni3 = new javax.swing.JTextField();
        anio_tecni3 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        txtciudad_tecni3 = new javax.swing.JTextField();
        ciudad_tecni3 = new javax.swing.JLabel();
        pa_tecni3 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        txtpa_tecni3 = new javax.swing.JTextField();
        ni_tecni3 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        txtni_tecni3 = new javax.swing.JTextField();
        jPanel9 = new javax.swing.JPanel();
        jLabel49 = new javax.swing.JLabel();
        txtanio_tecni4 = new javax.swing.JTextField();
        anio_tecni4 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        txtciudad_tecni4 = new javax.swing.JTextField();
        ciudad_tecni4 = new javax.swing.JLabel();
        pa_tecni4 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        txtpa_tecni4 = new javax.swing.JTextField();
        ni_tecni4 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        txtni_tecni4 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel142 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel50 = new javax.swing.JLabel();
        txtanio_tecni5 = new javax.swing.JTextField();
        anio_tecni5 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        txtciudad_tecni5 = new javax.swing.JTextField();
        ciudad_tecni5 = new javax.swing.JLabel();
        pa_tecni5 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        txtpa_tecni5 = new javax.swing.JTextField();
        ni_tecni5 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        txtni_tecni5 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel143 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel52 = new javax.swing.JLabel();
        txtanio_tecni6 = new javax.swing.JTextField();
        anio_tecni6 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        txtciudad_tecni6 = new javax.swing.JTextField();
        ciudad_tecni6 = new javax.swing.JLabel();
        pa_tecni6 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        txtpa_tecni6 = new javax.swing.JTextField();
        ni_tecni6 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        txtni_tecni6 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel144 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel68 = new javax.swing.JLabel();
        txtanio_tecni7 = new javax.swing.JTextField();
        anio_tecni7 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        txtciudad_tecni7 = new javax.swing.JTextField();
        ciudad_tecni7 = new javax.swing.JLabel();
        pa_tecni7 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        txtpa_tecni7 = new javax.swing.JTextField();
        ni_tecni7 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        txtni_tecni7 = new javax.swing.JTextField();
        jPanel13 = new javax.swing.JPanel();
        jLabel72 = new javax.swing.JLabel();
        txtanio_tecni8 = new javax.swing.JTextField();
        anio_tecni8 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        txtciudad_tecni8 = new javax.swing.JTextField();
        ciudad_tecni8 = new javax.swing.JLabel();
        pa_tecni8 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        txtpa_tecni8 = new javax.swing.JTextField();
        ni_tecni8 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        txtni_tecni8 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel146 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jLabel77 = new javax.swing.JLabel();
        txtanio_tecni9 = new javax.swing.JTextField();
        anio_tecni9 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        txtciudad_tecni9 = new javax.swing.JTextField();
        ciudad_tecni9 = new javax.swing.JLabel();
        pa_tecni9 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        txtpa_tecni9 = new javax.swing.JTextField();
        ni_tecni9 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        txtni_tecni9 = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel147 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jLabel81 = new javax.swing.JLabel();
        txtanio_tecni10 = new javax.swing.JTextField();
        anio_tecni10 = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        txtciudad_tecni10 = new javax.swing.JTextField();
        ciudad_tecni10 = new javax.swing.JLabel();
        pa_tecni10 = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        txtpa_tecni10 = new javax.swing.JTextField();
        ni_tecni10 = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        txtni_tecni10 = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jLabel148 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jLabel85 = new javax.swing.JLabel();
        txtanio_tecni11 = new javax.swing.JTextField();
        anio_tecni11 = new javax.swing.JLabel();
        jLabel86 = new javax.swing.JLabel();
        txtciudad_tecni11 = new javax.swing.JTextField();
        ciudad_tecni11 = new javax.swing.JLabel();
        pa_tecni11 = new javax.swing.JLabel();
        jLabel87 = new javax.swing.JLabel();
        txtpa_tecni11 = new javax.swing.JTextField();
        ni_tecni11 = new javax.swing.JLabel();
        jLabel88 = new javax.swing.JLabel();
        txtni_tecni11 = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jLabel149 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        jLabel89 = new javax.swing.JLabel();
        txtanio_tecni12 = new javax.swing.JTextField();
        anio_tecni12 = new javax.swing.JLabel();
        jLabel90 = new javax.swing.JLabel();
        txtciudad_tecni12 = new javax.swing.JTextField();
        ciudad_tecni12 = new javax.swing.JLabel();
        pa_tecni12 = new javax.swing.JLabel();
        jLabel91 = new javax.swing.JLabel();
        txtpa_tecni12 = new javax.swing.JTextField();
        ni_tecni12 = new javax.swing.JLabel();
        jLabel92 = new javax.swing.JLabel();
        txtni_tecni12 = new javax.swing.JTextField();
        jPanel18 = new javax.swing.JPanel();
        jLabel93 = new javax.swing.JLabel();
        txtanio_tecni13 = new javax.swing.JTextField();
        anio_tecni13 = new javax.swing.JLabel();
        jLabel94 = new javax.swing.JLabel();
        txtciudad_tecni13 = new javax.swing.JTextField();
        ciudad_tecni13 = new javax.swing.JLabel();
        pa_tecni13 = new javax.swing.JLabel();
        jLabel95 = new javax.swing.JLabel();
        txtpa_tecni13 = new javax.swing.JTextField();
        ni_tecni13 = new javax.swing.JLabel();
        jLabel96 = new javax.swing.JLabel();
        txtni_tecni13 = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jLabel151 = new javax.swing.JLabel();
        jPanel19 = new javax.swing.JPanel();
        jLabel97 = new javax.swing.JLabel();
        txtanio_tecni14 = new javax.swing.JTextField();
        anio_tecni14 = new javax.swing.JLabel();
        jLabel99 = new javax.swing.JLabel();
        txtciudad_tecni14 = new javax.swing.JTextField();
        ciudad_tecni14 = new javax.swing.JLabel();
        pa_tecni14 = new javax.swing.JLabel();
        jLabel100 = new javax.swing.JLabel();
        txtpa_tecni14 = new javax.swing.JTextField();
        ni_tecni14 = new javax.swing.JLabel();
        jLabel101 = new javax.swing.JLabel();
        txtni_tecni14 = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jLabel152 = new javax.swing.JLabel();
        jPanel20 = new javax.swing.JPanel();
        jLabel102 = new javax.swing.JLabel();
        txtanio_tecni15 = new javax.swing.JTextField();
        anio_tecni15 = new javax.swing.JLabel();
        jLabel103 = new javax.swing.JLabel();
        txtciudad_tecni15 = new javax.swing.JTextField();
        ciudad_tecni15 = new javax.swing.JLabel();
        pa_tecni15 = new javax.swing.JLabel();
        jLabel104 = new javax.swing.JLabel();
        txtpa_tecni15 = new javax.swing.JTextField();
        ni_tecni15 = new javax.swing.JLabel();
        jLabel105 = new javax.swing.JLabel();
        txtni_tecni15 = new javax.swing.JTextField();
        jLabel106 = new javax.swing.JLabel();
        jLabel153 = new javax.swing.JLabel();
        jPanel21 = new javax.swing.JPanel();
        jLabel107 = new javax.swing.JLabel();
        txtanio_tecni16 = new javax.swing.JTextField();
        anio_tecni16 = new javax.swing.JLabel();
        jLabel108 = new javax.swing.JLabel();
        txtciudad_tecni16 = new javax.swing.JTextField();
        ciudad_tecni16 = new javax.swing.JLabel();
        pa_tecni16 = new javax.swing.JLabel();
        jLabel109 = new javax.swing.JLabel();
        txtpa_tecni16 = new javax.swing.JTextField();
        ni_tecni16 = new javax.swing.JLabel();
        jLabel110 = new javax.swing.JLabel();
        txtni_tecni16 = new javax.swing.JTextField();
        jLabel111 = new javax.swing.JLabel();
        jLabel154 = new javax.swing.JLabel();
        jPanel22 = new javax.swing.JPanel();
        jLabel112 = new javax.swing.JLabel();
        txtanio_tecni17 = new javax.swing.JTextField();
        anio_tecni17 = new javax.swing.JLabel();
        jLabel113 = new javax.swing.JLabel();
        txtciudad_tecni17 = new javax.swing.JTextField();
        ciudad_tecni17 = new javax.swing.JLabel();
        pa_tecni17 = new javax.swing.JLabel();
        jLabel114 = new javax.swing.JLabel();
        txtpa_tecni17 = new javax.swing.JTextField();
        ni_tecni17 = new javax.swing.JLabel();
        jLabel115 = new javax.swing.JLabel();
        txtni_tecni17 = new javax.swing.JTextField();
        jPanel23 = new javax.swing.JPanel();
        jLabel117 = new javax.swing.JLabel();
        txtanio_tecni18 = new javax.swing.JTextField();
        anio_tecni18 = new javax.swing.JLabel();
        jLabel118 = new javax.swing.JLabel();
        txtciudad_tecni18 = new javax.swing.JTextField();
        ciudad_tecni18 = new javax.swing.JLabel();
        pa_tecni18 = new javax.swing.JLabel();
        jLabel119 = new javax.swing.JLabel();
        txtpa_tecni18 = new javax.swing.JTextField();
        ni_tecni18 = new javax.swing.JLabel();
        jLabel120 = new javax.swing.JLabel();
        txtni_tecni18 = new javax.swing.JTextField();
        jLabel121 = new javax.swing.JLabel();
        jLabel156 = new javax.swing.JLabel();
        jPanel24 = new javax.swing.JPanel();
        jLabel122 = new javax.swing.JLabel();
        txtanio_tecni19 = new javax.swing.JTextField();
        anio_tecni19 = new javax.swing.JLabel();
        jLabel123 = new javax.swing.JLabel();
        txtciudad_tecni19 = new javax.swing.JTextField();
        ciudad_tecni19 = new javax.swing.JLabel();
        pa_tecni19 = new javax.swing.JLabel();
        jLabel124 = new javax.swing.JLabel();
        txtpa_tecni19 = new javax.swing.JTextField();
        ni_tecni19 = new javax.swing.JLabel();
        jLabel125 = new javax.swing.JLabel();
        txtni_tecni19 = new javax.swing.JTextField();
        jLabel126 = new javax.swing.JLabel();
        jLabel157 = new javax.swing.JLabel();
        jPanel25 = new javax.swing.JPanel();
        jLabel127 = new javax.swing.JLabel();
        txtanio_tecni20 = new javax.swing.JTextField();
        anio_tecni20 = new javax.swing.JLabel();
        jLabel128 = new javax.swing.JLabel();
        txtciudad_tecni20 = new javax.swing.JTextField();
        ciudad_tecni20 = new javax.swing.JLabel();
        pa_tecni20 = new javax.swing.JLabel();
        jLabel129 = new javax.swing.JLabel();
        txtpa_tecni20 = new javax.swing.JTextField();
        ni_tecni20 = new javax.swing.JLabel();
        jLabel130 = new javax.swing.JLabel();
        txtni_tecni20 = new javax.swing.JTextField();
        jLabel131 = new javax.swing.JLabel();
        jLabel158 = new javax.swing.JLabel();
        jPanel26 = new javax.swing.JPanel();
        jLabel132 = new javax.swing.JLabel();
        txtanio_tecni21 = new javax.swing.JTextField();
        anio_tecni21 = new javax.swing.JLabel();
        jLabel133 = new javax.swing.JLabel();
        txtciudad_tecni21 = new javax.swing.JTextField();
        ciudad_tecni21 = new javax.swing.JLabel();
        pa_tecni21 = new javax.swing.JLabel();
        jLabel134 = new javax.swing.JLabel();
        txtpa_tecni21 = new javax.swing.JTextField();
        ni_tecni21 = new javax.swing.JLabel();
        jLabel135 = new javax.swing.JLabel();
        txtni_tecni21 = new javax.swing.JTextField();
        jPanel27 = new javax.swing.JPanel();
        jLabel137 = new javax.swing.JLabel();
        txtanio_tecni22 = new javax.swing.JTextField();
        anio_tecni22 = new javax.swing.JLabel();
        jLabel160 = new javax.swing.JLabel();
        txtciudad_tecni22 = new javax.swing.JTextField();
        ciudad_tecni22 = new javax.swing.JLabel();
        pa_tecni22 = new javax.swing.JLabel();
        jLabel161 = new javax.swing.JLabel();
        txtpa_tecni22 = new javax.swing.JTextField();
        ni_tecni22 = new javax.swing.JLabel();
        jLabel162 = new javax.swing.JLabel();
        txtni_tecni22 = new javax.swing.JTextField();
        jLabel163 = new javax.swing.JLabel();
        jLabel164 = new javax.swing.JLabel();
        jPanel28 = new javax.swing.JPanel();
        jLabel165 = new javax.swing.JLabel();
        txtanio_tecni23 = new javax.swing.JTextField();
        anio_tecni23 = new javax.swing.JLabel();
        jLabel166 = new javax.swing.JLabel();
        txtciudad_tecni23 = new javax.swing.JTextField();
        ciudad_tecni23 = new javax.swing.JLabel();
        pa_tecni23 = new javax.swing.JLabel();
        jLabel167 = new javax.swing.JLabel();
        txtpa_tecni23 = new javax.swing.JTextField();
        ni_tecni23 = new javax.swing.JLabel();
        jLabel168 = new javax.swing.JLabel();
        txtni_tecni23 = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(null);
        setPreferredSize(new java.awt.Dimension(975, 550));

        jScrollPane2.setBorder(null);
        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setPreferredSize(new java.awt.Dimension(975, 999));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setName(""); // NOI18N
        jPanel4.setPreferredSize(new java.awt.Dimension(975, 2448));

        jLabel76.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel76.setText("Seleccione todos sus niveles de escolaridad culminados:");

        chbxprimaria.setBackground(new java.awt.Color(255, 255, 255));
        chbxprimaria.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        chbxprimaria.setText("Primaria");
        chbxprimaria.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chbxprimariaItemStateChanged(evt);
            }
        });

        chbxbachillerato.setBackground(new java.awt.Color(255, 255, 255));
        chbxbachillerato.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        chbxbachillerato.setText("Bachillerato");
        chbxbachillerato.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chbxbachilleratoItemStateChanged(evt);
            }
        });

        chbxtecnico.setBackground(new java.awt.Color(255, 255, 255));
        chbxtecnico.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        chbxtecnico.setText("Técnico");
        chbxtecnico.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chbxtecnicoItemStateChanged(evt);
            }
        });

        chbxtecnologo.setBackground(new java.awt.Color(255, 255, 255));
        chbxtecnologo.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        chbxtecnologo.setText("Tecnólogo");
        chbxtecnologo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chbxtecnologoItemStateChanged(evt);
            }
        });

        chbxprofesional.setBackground(new java.awt.Color(255, 255, 255));
        chbxprofesional.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        chbxprofesional.setText("Profesional");
        chbxprofesional.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chbxprofesionalItemStateChanged(evt);
            }
        });

        chbxmaestria.setBackground(new java.awt.Color(255, 255, 255));
        chbxmaestria.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        chbxmaestria.setText("Maestría");
        chbxmaestria.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chbxmaestriaItemStateChanged(evt);
            }
        });

        chbxpostgrado.setBackground(new java.awt.Color(255, 255, 255));
        chbxpostgrado.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        chbxpostgrado.setText("Postgrado");
        chbxpostgrado.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chbxpostgradoItemStateChanged(evt);
            }
        });

        jLabel98.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel98.setText("¿Se encuentra usted estudiando?");

        suspendioestu.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        suspendioestu.setText("¿Suspendió sus estudios?");

        chbxdoctorado.setBackground(new java.awt.Color(255, 255, 255));
        chbxdoctorado.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        chbxdoctorado.setText("Doctorado");
        chbxdoctorado.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chbxdoctoradoItemStateChanged(evt);
            }
        });

        jLabel170.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

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

        jLabel171.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel171.setText("¿Existen admisiones en esta categoría?");

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

        jCheckBox5.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox5.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jCheckBox5.setText("Sí");
        jCheckBox5.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox5ItemStateChanged(evt);
            }
        });

        jCheckBox6.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox6.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jCheckBox6.setText("No");
        jCheckBox6.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox6ItemStateChanged(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel45.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtanio_tecni.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtanio_tecni.setBorder(null);
        txtanio_tecni.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtanio_tecniCaretUpdate(evt);
            }
        });
        txtanio_tecni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtanio_tecniKeyTyped(evt);
            }
        });

        anio_tecni.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        anio_tecni.setText("Año:");

        jLabel35.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtciudad_tecni.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtciudad_tecni.setBorder(null);
        txtciudad_tecni.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtciudad_tecniCaretUpdate(evt);
            }
        });
        txtciudad_tecni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtciudad_tecniKeyTyped(evt);
            }
        });

        ciudad_tecni.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        ciudad_tecni.setText("Ciudad donde se expidió el título:");

        pa_tecni.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        pa_tecni.setText("Programa académico:");

        jLabel34.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtpa_tecni.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtpa_tecni.setBorder(null);
        txtpa_tecni.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtpa_tecniCaretUpdate(evt);
            }
        });
        txtpa_tecni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpa_tecniActionPerformed(evt);
            }
        });
        txtpa_tecni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtpa_tecniKeyTyped(evt);
            }
        });

        ni_tecni.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        ni_tecni.setText("Nombre institución:");

        jLabel55.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtni_tecni.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtni_tecni.setBorder(null);
        txtni_tecni.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtni_tecniCaretUpdate(evt);
            }
        });
        txtni_tecni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtni_tecniKeyTyped(evt);
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

        jLabel138.setBackground(new java.awt.Color(255, 255, 255));
        jLabel138.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel138.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/substract.png"))); // NOI18N
        jLabel138.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel138.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel138MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(pa_tecni)
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtpa_tecni, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(ni_tecni))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(ciudad_tecni)
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel35, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                            .addComponent(txtciudad_tecni))
                        .addGap(18, 18, 18)
                        .addComponent(anio_tecni)))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtanio_tecni, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel55, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                    .addComponent(txtni_tecni))
                .addGap(17, 17, 17)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel138)
                .addGap(19, 19, 19))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtpa_tecni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pa_tecni)
                            .addComponent(ni_tecni))
                        .addGap(0, 0, 0)
                        .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtciudad_tecni, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ciudad_tecni)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtni_tecni, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtanio_tecni, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(anio_tecni))
                        .addGap(0, 0, 0)
                        .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0)
                .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel138, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        jLabel60.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtanio_bachi.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtanio_bachi.setBorder(null);
        txtanio_bachi.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtanio_bachiCaretUpdate(evt);
            }
        });
        txtanio_bachi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtanio_bachiActionPerformed(evt);
            }
        });
        txtanio_bachi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtanio_bachiKeyTyped(evt);
            }
        });

        jLabel54.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtni_bachi.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtni_bachi.setBorder(null);
        txtni_bachi.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtni_bachiCaretUpdate(evt);
            }
        });
        txtni_bachi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtni_bachiKeyTyped(evt);
            }
        });

        ni_bachi.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        ni_bachi.setText("Nombre institución:");

        anio_bachi.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        anio_bachi.setText("Año:");

        jLabel33.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtciudad_bachi.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtciudad_bachi.setBorder(null);
        txtciudad_bachi.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtciudad_bachiCaretUpdate(evt);
            }
        });
        txtciudad_bachi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtciudad_bachiKeyTyped(evt);
            }
        });

        jLabel32.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txttipo_bachi.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txttipo_bachi.setBorder(null);
        txttipo_bachi.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txttipo_bachiCaretUpdate(evt);
            }
        });
        txttipo_bachi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttipo_bachiActionPerformed(evt);
            }
        });
        txttipo_bachi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txttipo_bachiKeyTyped(evt);
            }
        });

        tipo_bachi.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        tipo_bachi.setText("Tipo de bachiller:");

        ciudad_bachi.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        ciudad_bachi.setText("Ciudad donde se expidió el título:");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(ciudad_bachi)
                        .addGap(12, 12, 12)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtciudad_bachi, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel33, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(anio_bachi))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(tipo_bachi, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txttipo_bachi, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(ni_bachi, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtni_bachi, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtanio_bachi)
                        .addComponent(jLabel60, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(92, 92, 92))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tipo_bachi)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(txtni_bachi, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txttipo_bachi, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ni_bachi)))
                        .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtciudad_bachi, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ciudad_bachi)
                        .addComponent(anio_bachi))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(txtanio_bachi, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(jLabel60, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0)
                .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        jLabel31.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtanio_primaria.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtanio_primaria.setBorder(null);
        txtanio_primaria.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtanio_primariaCaretUpdate(evt);
            }
        });
        txtanio_primaria.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtanio_primariaKeyTyped(evt);
            }
        });

        anio_primaria.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        anio_primaria.setText("Año:");

        jLabel30.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtciudad_primaria.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtciudad_primaria.setBorder(null);
        txtciudad_primaria.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtciudad_primariaCaretUpdate(evt);
            }
        });
        txtciudad_primaria.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtciudad_primariaKeyTyped(evt);
            }
        });

        ciudad_primaria.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        ciudad_primaria.setText("Ciudad:");

        jLabel29.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtni_primaria.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtni_primaria.setBorder(null);
        txtni_primaria.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtni_primariaCaretUpdate(evt);
            }
        });
        txtni_primaria.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtni_primariaKeyTyped(evt);
            }
        });

        ni_primaria1.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        ni_primaria1.setForeground(new java.awt.Color(204, 0, 0));
        ni_primaria1.setText("(Solo diligenciar en caso de no ser bachiller)");

        ni_primaria.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        ni_primaria.setText("Nombre institución:");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ni_primaria1)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(ni_primaria)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(txtni_primaria, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(22, 22, 22)
                .addComponent(ciudad_primaria)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtciudad_primaria, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(anio_primaria)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtanio_primaria)
                    .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(256, 256, 256))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(ni_primaria1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ni_primaria)
                            .addComponent(ciudad_primaria)
                            .addComponent(txtni_primaria, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtanio_primaria, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtciudad_primaria, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(anio_primaria))
                        .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15))
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        txtexplsusestu.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtexplsusestu.setBorder(null);
        txtexplsusestu.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtexplsusestuCaretUpdate(evt);
            }
        });
        txtexplsusestu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtexplsusestuKeyTyped(evt);
            }
        });

        nosemestre.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        nosemestre.setText("Semestre número:");

        spsemestre.setFont(new java.awt.Font("Segoe UI Emoji", 0, 10)); // NOI18N
        spsemestre.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
                spsemestreCaretPositionChanged(evt);
            }
        });
        spsemestre.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                spsemestrePropertyChange(evt);
            }
        });
        spsemestre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                spsemestreKeyTyped(evt);
            }
        });

        nombreprogacade.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        nombreprogacade.setText("Nombre programa académico:");

        txtnombreprogacade.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtnombreprogacade.setBorder(null);
        txtnombreprogacade.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtnombreprogacadeCaretUpdate(evt);
            }
        });
        txtnombreprogacade.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnombreprogacadeKeyTyped(evt);
            }
        });

        nombreuniversidad.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        nombreuniversidad.setText("Nombre institución:");

        jornadauniversidad.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jornadauniversidad.setText("Jornada:");

        cbxjornadauniver.setFont(new java.awt.Font("Segoe UI Emoji", 0, 13)); // NOI18N
        cbxjornadauniver.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Única", "Mañana", "Tarde", "Cada 15 días", "Fines de semana", "Virtual" }));
        cbxjornadauniver.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxjornadauniverItemStateChanged(evt);
            }
        });

        txtnombreuniversidad.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtnombreuniversidad.setBorder(null);
        txtnombreuniversidad.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtnombreuniversidadCaretUpdate(evt);
            }
        });
        txtnombreuniversidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnombreuniversidadKeyTyped(evt);
            }
        });

        jLabel56.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel57.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel58.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        nombreuniversidad1.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        nombreuniversidad1.setText("Año suspensión:");

        jLabel169.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtnombreuniversidad1.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtnombreuniversidad1.setBorder(null);
        txtnombreuniversidad1.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtnombreuniversidad1CaretUpdate(evt);
            }
        });
        txtnombreuniversidad1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombreuniversidad1ActionPerformed(evt);
            }
        });
        txtnombreuniversidad1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnombreuniversidad1KeyTyped(evt);
            }
        });

        ciudaduniversidad1.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        ciudaduniversidad1.setText("Explicación:");

        txtciudaduniversidad.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtciudaduniversidad.setBorder(null);
        txtciudaduniversidad.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtciudaduniversidadCaretUpdate(evt);
            }
        });
        txtciudaduniversidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtciudaduniversidadKeyTyped(evt);
            }
        });

        jLabel59.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        ciudaduniversidad.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        ciudaduniversidad.setText("Ciudad institución:");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nombreuniversidad)
                            .addComponent(nosemestre))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(spsemestre, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(87, 87, 87)
                                .addComponent(nombreprogacade)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtnombreprogacade, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel169, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtnombreuniversidad1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtnombreuniversidad, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ciudaduniversidad, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(txtciudaduniversidad, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jornadauniversidad, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cbxjornadauniver, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(nombreuniversidad1)
                        .addGap(156, 156, 156)
                        .addComponent(ciudaduniversidad1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel56, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtexplsusestu, javax.swing.GroupLayout.PREFERRED_SIZE, 565, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(30, 30, 30))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nosemestre)
                    .addComponent(spsemestre, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombreprogacade)
                    .addComponent(txtnombreprogacade, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreuniversidad)
                    .addComponent(txtnombreuniversidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jornadauniversidad)
                    .addComponent(cbxjornadauniver, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ciudaduniversidad)
                    .addComponent(txtciudaduniversidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtexplsusestu, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ciudaduniversidad1))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtnombreuniversidad1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nombreuniversidad1))
                        .addGap(0, 0, 0)
                        .addComponent(jLabel169, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0)
                .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel46.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtanio_tecni1.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtanio_tecni1.setBorder(null);
        txtanio_tecni1.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtanio_tecni1CaretUpdate(evt);
            }
        });
        txtanio_tecni1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtanio_tecni1KeyTyped(evt);
            }
        });

        anio_tecni1.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        anio_tecni1.setText("Año:");

        jLabel36.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtciudad_tecni1.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtciudad_tecni1.setBorder(null);
        txtciudad_tecni1.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtciudad_tecni1CaretUpdate(evt);
            }
        });
        txtciudad_tecni1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtciudad_tecni1KeyTyped(evt);
            }
        });

        ciudad_tecni1.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        ciudad_tecni1.setText("Ciudad donde se expidió el título:");

        pa_tecni1.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        pa_tecni1.setText("Programa académico:");

        jLabel37.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtpa_tecni1.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtpa_tecni1.setBorder(null);
        txtpa_tecni1.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtpa_tecni1CaretUpdate(evt);
            }
        });
        txtpa_tecni1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpa_tecni1ActionPerformed(evt);
            }
        });
        txtpa_tecni1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtpa_tecni1KeyTyped(evt);
            }
        });

        ni_tecni1.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        ni_tecni1.setText("Nombre institución:");

        jLabel61.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtni_tecni1.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtni_tecni1.setBorder(null);
        txtni_tecni1.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtni_tecni1CaretUpdate(evt);
            }
        });
        txtni_tecni1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtni_tecni1KeyTyped(evt);
            }
        });

        jLabel15.setBackground(new java.awt.Color(255, 255, 255));
        jLabel15.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/plus-symbol.png"))); // NOI18N
        jLabel15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });

        jLabel139.setBackground(new java.awt.Color(255, 255, 255));
        jLabel139.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel139.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/substract.png"))); // NOI18N
        jLabel139.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel139.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel139MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(pa_tecni1)
                        .addGap(12, 12, 12)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel37, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(txtpa_tecni1))
                        .addGap(18, 18, 18)
                        .addComponent(ni_tecni1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(ciudad_tecni1)
                        .addGap(12, 12, 12)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel36, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                            .addComponent(txtciudad_tecni1))
                        .addGap(18, 18, 18)
                        .addComponent(anio_tecni1)))
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtanio_tecni1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel61, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtni_tecni1)))
                .addGap(17, 17, 17)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel139)
                .addGap(19, 19, 19))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtpa_tecni1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pa_tecni1)
                            .addComponent(ni_tecni1))
                        .addGap(0, 0, 0)
                        .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtciudad_tecni1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ciudad_tecni1)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtni_tecni1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel61, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtanio_tecni1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(anio_tecni1))
                        .addGap(0, 0, 0)
                        .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0)
                .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel139, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel47.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtanio_tecni2.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtanio_tecni2.setBorder(null);
        txtanio_tecni2.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtanio_tecni2CaretUpdate(evt);
            }
        });
        txtanio_tecni2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtanio_tecni2KeyTyped(evt);
            }
        });

        anio_tecni2.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        anio_tecni2.setText("Año:");

        jLabel38.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtciudad_tecni2.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtciudad_tecni2.setBorder(null);
        txtciudad_tecni2.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtciudad_tecni2CaretUpdate(evt);
            }
        });
        txtciudad_tecni2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtciudad_tecni2KeyTyped(evt);
            }
        });

        ciudad_tecni2.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        ciudad_tecni2.setText("Ciudad donde se expidió el título:");

        pa_tecni2.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        pa_tecni2.setText("Programa académico:");

        jLabel39.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtpa_tecni2.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtpa_tecni2.setBorder(null);
        txtpa_tecni2.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtpa_tecni2CaretUpdate(evt);
            }
        });
        txtpa_tecni2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpa_tecni2ActionPerformed(evt);
            }
        });
        txtpa_tecni2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtpa_tecni2KeyTyped(evt);
            }
        });

        ni_tecni2.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        ni_tecni2.setText("Nombre institución:");

        jLabel62.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtni_tecni2.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtni_tecni2.setBorder(null);
        txtni_tecni2.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtni_tecni2CaretUpdate(evt);
            }
        });
        txtni_tecni2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtni_tecni2KeyTyped(evt);
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

        jLabel140.setBackground(new java.awt.Color(255, 255, 255));
        jLabel140.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel140.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/substract.png"))); // NOI18N
        jLabel140.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel140.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel140MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(pa_tecni2)
                        .addGap(12, 12, 12)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel39, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(txtpa_tecni2))
                        .addGap(18, 18, 18)
                        .addComponent(ni_tecni2))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(ciudad_tecni2)
                        .addGap(12, 12, 12)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(txtciudad_tecni2, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(anio_tecni2)))))
                .addGap(12, 12, 12)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtanio_tecni2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel62, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtni_tecni2)))
                .addGap(17, 17, 17)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel140)
                .addGap(19, 19, 19))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtpa_tecni2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pa_tecni2)
                            .addComponent(ni_tecni2))
                        .addGap(0, 0, 0)
                        .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtciudad_tecni2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ciudad_tecni2)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(txtni_tecni2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel62, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtanio_tecni2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(anio_tecni2))
                        .addGap(0, 0, 0)
                        .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0)
                .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel140, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));

        jLabel48.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtanio_tecni3.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtanio_tecni3.setBorder(null);
        txtanio_tecni3.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtanio_tecni3CaretUpdate(evt);
            }
        });
        txtanio_tecni3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtanio_tecni3KeyTyped(evt);
            }
        });

        anio_tecni3.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        anio_tecni3.setText("Año:");

        jLabel40.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtciudad_tecni3.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtciudad_tecni3.setBorder(null);
        txtciudad_tecni3.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtciudad_tecni3CaretUpdate(evt);
            }
        });
        txtciudad_tecni3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtciudad_tecni3KeyTyped(evt);
            }
        });

        ciudad_tecni3.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        ciudad_tecni3.setText("Ciudad donde se expidió el título:");

        pa_tecni3.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        pa_tecni3.setText("Programa académico:");

        jLabel41.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtpa_tecni3.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtpa_tecni3.setBorder(null);
        txtpa_tecni3.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtpa_tecni3CaretUpdate(evt);
            }
        });
        txtpa_tecni3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpa_tecni3ActionPerformed(evt);
            }
        });
        txtpa_tecni3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtpa_tecni3KeyTyped(evt);
            }
        });

        ni_tecni3.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        ni_tecni3.setText("Nombre institución:");

        jLabel63.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtni_tecni3.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtni_tecni3.setBorder(null);
        txtni_tecni3.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtni_tecni3CaretUpdate(evt);
            }
        });
        txtni_tecni3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtni_tecni3KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(pa_tecni3)
                        .addGap(12, 12, 12)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel41, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(txtpa_tecni3))
                        .addGap(18, 18, 18)
                        .addComponent(ni_tecni3))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(ciudad_tecni3)
                        .addGap(12, 12, 12)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(txtciudad_tecni3, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(anio_tecni3)))))
                .addGap(12, 12, 12)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtanio_tecni3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel63, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtni_tecni3)))
                .addGap(90, 90, 90))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtpa_tecni3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pa_tecni3)
                            .addComponent(ni_tecni3))
                        .addGap(0, 0, 0)
                        .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtciudad_tecni3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ciudad_tecni3)))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(txtni_tecni3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel63, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtanio_tecni3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(anio_tecni3))
                        .addGap(0, 0, 0)
                        .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0)
                .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));

        jLabel49.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtanio_tecni4.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtanio_tecni4.setBorder(null);
        txtanio_tecni4.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtanio_tecni4CaretUpdate(evt);
            }
        });
        txtanio_tecni4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtanio_tecni4ActionPerformed(evt);
            }
        });
        txtanio_tecni4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtanio_tecni4KeyTyped(evt);
            }
        });

        anio_tecni4.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        anio_tecni4.setText("Año:");

        jLabel42.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtciudad_tecni4.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtciudad_tecni4.setBorder(null);
        txtciudad_tecni4.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtciudad_tecni4CaretUpdate(evt);
            }
        });
        txtciudad_tecni4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtciudad_tecni4KeyTyped(evt);
            }
        });

        ciudad_tecni4.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        ciudad_tecni4.setText("Ciudad donde se expidió el título:");

        pa_tecni4.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        pa_tecni4.setText("Programa académico:");

        jLabel43.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtpa_tecni4.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtpa_tecni4.setBorder(null);
        txtpa_tecni4.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtpa_tecni4CaretUpdate(evt);
            }
        });
        txtpa_tecni4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpa_tecni4ActionPerformed(evt);
            }
        });
        txtpa_tecni4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtpa_tecni4KeyTyped(evt);
            }
        });

        ni_tecni4.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        ni_tecni4.setText("Nombre institución:");

        jLabel64.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtni_tecni4.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtni_tecni4.setBorder(null);
        txtni_tecni4.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtni_tecni4CaretUpdate(evt);
            }
        });
        txtni_tecni4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtni_tecni4KeyTyped(evt);
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

        jLabel142.setBackground(new java.awt.Color(255, 255, 255));
        jLabel142.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel142.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/substract.png"))); // NOI18N
        jLabel142.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel142.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel142MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(pa_tecni4)
                        .addGap(12, 12, 12)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel43, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(txtpa_tecni4))
                        .addGap(18, 18, 18)
                        .addComponent(ni_tecni4))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(ciudad_tecni4)
                        .addGap(12, 12, 12)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(txtciudad_tecni4, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(anio_tecni4)))))
                .addGap(12, 12, 12)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtanio_tecni4, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel64, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtni_tecni4)))
                .addGap(17, 17, 17)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel142)
                .addGap(19, 19, 19))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtpa_tecni4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pa_tecni4)
                            .addComponent(ni_tecni4))
                        .addGap(0, 0, 0)
                        .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtciudad_tecni4, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ciudad_tecni4)))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(txtni_tecni4, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel64, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtanio_tecni4, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(anio_tecni4))
                        .addGap(0, 0, 0)
                        .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0)
                .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel142, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));

        jLabel50.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtanio_tecni5.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtanio_tecni5.setBorder(null);
        txtanio_tecni5.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtanio_tecni5CaretUpdate(evt);
            }
        });
        txtanio_tecni5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtanio_tecni5KeyTyped(evt);
            }
        });

        anio_tecni5.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        anio_tecni5.setText("Año:");

        jLabel44.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtciudad_tecni5.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtciudad_tecni5.setBorder(null);
        txtciudad_tecni5.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtciudad_tecni5CaretUpdate(evt);
            }
        });
        txtciudad_tecni5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtciudad_tecni5KeyTyped(evt);
            }
        });

        ciudad_tecni5.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        ciudad_tecni5.setText("Ciudad donde se expidió el título:");

        pa_tecni5.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        pa_tecni5.setText("Programa académico:");

        jLabel51.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtpa_tecni5.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtpa_tecni5.setBorder(null);
        txtpa_tecni5.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtpa_tecni5CaretUpdate(evt);
            }
        });
        txtpa_tecni5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpa_tecni5ActionPerformed(evt);
            }
        });
        txtpa_tecni5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtpa_tecni5KeyTyped(evt);
            }
        });

        ni_tecni5.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        ni_tecni5.setText("Nombre institución:");

        jLabel65.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtni_tecni5.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtni_tecni5.setBorder(null);
        txtni_tecni5.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtni_tecni5CaretUpdate(evt);
            }
        });
        txtni_tecni5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtni_tecni5KeyTyped(evt);
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

        jLabel143.setBackground(new java.awt.Color(255, 255, 255));
        jLabel143.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel143.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/substract.png"))); // NOI18N
        jLabel143.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel143.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel143MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(pa_tecni5)
                        .addGap(12, 12, 12)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel51, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(txtpa_tecni5))
                        .addGap(18, 18, 18)
                        .addComponent(ni_tecni5))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(ciudad_tecni5)
                        .addGap(12, 12, 12)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(txtciudad_tecni5, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(anio_tecni5)))))
                .addGap(12, 12, 12)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtanio_tecni5, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel65, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtni_tecni5)))
                .addGap(17, 17, 17)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel143)
                .addGap(19, 19, 19))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtpa_tecni5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pa_tecni5)
                            .addComponent(ni_tecni5))
                        .addGap(0, 0, 0)
                        .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtciudad_tecni5, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ciudad_tecni5)))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(txtni_tecni5, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel65, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtanio_tecni5, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(anio_tecni5))
                        .addGap(0, 0, 0)
                        .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0)
                .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel143, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));

        jLabel52.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtanio_tecni6.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtanio_tecni6.setBorder(null);
        txtanio_tecni6.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtanio_tecni6CaretUpdate(evt);
            }
        });
        txtanio_tecni6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtanio_tecni6KeyTyped(evt);
            }
        });

        anio_tecni6.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        anio_tecni6.setText("Año:");

        jLabel53.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtciudad_tecni6.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtciudad_tecni6.setBorder(null);
        txtciudad_tecni6.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtciudad_tecni6CaretUpdate(evt);
            }
        });
        txtciudad_tecni6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtciudad_tecni6KeyTyped(evt);
            }
        });

        ciudad_tecni6.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        ciudad_tecni6.setText("Ciudad donde se expidió el título:");

        pa_tecni6.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        pa_tecni6.setText("Programa académico:");

        jLabel66.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtpa_tecni6.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtpa_tecni6.setBorder(null);
        txtpa_tecni6.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtpa_tecni6CaretUpdate(evt);
            }
        });
        txtpa_tecni6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpa_tecni6ActionPerformed(evt);
            }
        });
        txtpa_tecni6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtpa_tecni6KeyTyped(evt);
            }
        });

        ni_tecni6.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        ni_tecni6.setText("Nombre institución:");

        jLabel67.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtni_tecni6.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtni_tecni6.setBorder(null);
        txtni_tecni6.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtni_tecni6CaretUpdate(evt);
            }
        });
        txtni_tecni6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtni_tecni6KeyTyped(evt);
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

        jLabel144.setBackground(new java.awt.Color(255, 255, 255));
        jLabel144.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel144.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/substract.png"))); // NOI18N
        jLabel144.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel144.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel144MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(pa_tecni6)
                        .addGap(12, 12, 12)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel66, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(txtpa_tecni6))
                        .addGap(18, 18, 18)
                        .addComponent(ni_tecni6))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(ciudad_tecni6)
                        .addGap(12, 12, 12)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addComponent(txtciudad_tecni6, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(anio_tecni6)))))
                .addGap(12, 12, 12)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtanio_tecni6, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel67, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtni_tecni6)))
                .addGap(17, 17, 17)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel144)
                .addGap(19, 19, 19))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtpa_tecni6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pa_tecni6)
                            .addComponent(ni_tecni6))
                        .addGap(0, 0, 0)
                        .addComponent(jLabel66, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtciudad_tecni6, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ciudad_tecni6)))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(txtni_tecni6, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel67, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtanio_tecni6, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(anio_tecni6))
                        .addGap(0, 0, 0)
                        .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0)
                .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel144, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));

        jLabel68.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtanio_tecni7.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtanio_tecni7.setBorder(null);
        txtanio_tecni7.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtanio_tecni7CaretUpdate(evt);
            }
        });
        txtanio_tecni7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtanio_tecni7KeyTyped(evt);
            }
        });

        anio_tecni7.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        anio_tecni7.setText("Año:");

        jLabel69.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtciudad_tecni7.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtciudad_tecni7.setBorder(null);
        txtciudad_tecni7.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtciudad_tecni7CaretUpdate(evt);
            }
        });
        txtciudad_tecni7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtciudad_tecni7KeyTyped(evt);
            }
        });

        ciudad_tecni7.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        ciudad_tecni7.setText("Ciudad donde se expidió el título:");

        pa_tecni7.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        pa_tecni7.setText("Programa académico:");

        jLabel70.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtpa_tecni7.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtpa_tecni7.setBorder(null);
        txtpa_tecni7.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtpa_tecni7CaretUpdate(evt);
            }
        });
        txtpa_tecni7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpa_tecni7ActionPerformed(evt);
            }
        });
        txtpa_tecni7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtpa_tecni7KeyTyped(evt);
            }
        });

        ni_tecni7.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        ni_tecni7.setText("Nombre institución:");

        jLabel71.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtni_tecni7.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtni_tecni7.setBorder(null);
        txtni_tecni7.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtni_tecni7CaretUpdate(evt);
            }
        });
        txtni_tecni7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtni_tecni7KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(pa_tecni7)
                        .addGap(12, 12, 12)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel70, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(txtpa_tecni7))
                        .addGap(18, 18, 18)
                        .addComponent(ni_tecni7))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(ciudad_tecni7)
                        .addGap(12, 12, 12)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel69, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addComponent(txtciudad_tecni7, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(anio_tecni7)))))
                .addGap(12, 12, 12)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtanio_tecni7, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel68, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel71, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtni_tecni7)))
                .addGap(90, 90, 90))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtpa_tecni7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pa_tecni7)
                            .addComponent(ni_tecni7))
                        .addGap(0, 0, 0)
                        .addComponent(jLabel70, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtciudad_tecni7, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ciudad_tecni7)))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(txtni_tecni7, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel71, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtanio_tecni7, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(anio_tecni7))
                        .addGap(0, 0, 0)
                        .addComponent(jLabel68, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0)
                .addComponent(jLabel69, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));

        jLabel72.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtanio_tecni8.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtanio_tecni8.setBorder(null);
        txtanio_tecni8.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtanio_tecni8CaretUpdate(evt);
            }
        });
        txtanio_tecni8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtanio_tecni8KeyTyped(evt);
            }
        });

        anio_tecni8.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        anio_tecni8.setText("Año:");

        jLabel73.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtciudad_tecni8.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtciudad_tecni8.setBorder(null);
        txtciudad_tecni8.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtciudad_tecni8CaretUpdate(evt);
            }
        });
        txtciudad_tecni8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtciudad_tecni8ActionPerformed(evt);
            }
        });
        txtciudad_tecni8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtciudad_tecni8KeyTyped(evt);
            }
        });

        ciudad_tecni8.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        ciudad_tecni8.setText("Ciudad donde se expidió el título:");

        pa_tecni8.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        pa_tecni8.setText("Programa académico:");

        jLabel74.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtpa_tecni8.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtpa_tecni8.setBorder(null);
        txtpa_tecni8.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtpa_tecni8CaretUpdate(evt);
            }
        });
        txtpa_tecni8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpa_tecni8ActionPerformed(evt);
            }
        });
        txtpa_tecni8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtpa_tecni8KeyTyped(evt);
            }
        });

        ni_tecni8.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        ni_tecni8.setText("Nombre institución:");

        jLabel75.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtni_tecni8.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtni_tecni8.setBorder(null);
        txtni_tecni8.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtni_tecni8CaretUpdate(evt);
            }
        });
        txtni_tecni8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtni_tecni8KeyTyped(evt);
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

        jLabel146.setBackground(new java.awt.Color(255, 255, 255));
        jLabel146.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel146.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/substract.png"))); // NOI18N
        jLabel146.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel146.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel146MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(pa_tecni8)
                        .addGap(12, 12, 12)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel74, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(txtpa_tecni8))
                        .addGap(18, 18, 18)
                        .addComponent(ni_tecni8))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(ciudad_tecni8)
                        .addGap(12, 12, 12)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel73, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addComponent(txtciudad_tecni8, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(anio_tecni8)))))
                .addGap(12, 12, 12)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtanio_tecni8, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel72, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel75, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtni_tecni8)))
                .addGap(17, 17, 17)
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel146)
                .addGap(19, 19, 19))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtpa_tecni8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pa_tecni8)
                            .addComponent(ni_tecni8))
                        .addGap(0, 0, 0)
                        .addComponent(jLabel74, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtciudad_tecni8, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ciudad_tecni8)))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(txtni_tecni8, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel75, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtanio_tecni8, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(anio_tecni8))
                        .addGap(0, 0, 0)
                        .addComponent(jLabel72, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0)
                .addComponent(jLabel73, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel146, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));

        jLabel77.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtanio_tecni9.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtanio_tecni9.setBorder(null);
        txtanio_tecni9.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtanio_tecni9CaretUpdate(evt);
            }
        });
        txtanio_tecni9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtanio_tecni9KeyTyped(evt);
            }
        });

        anio_tecni9.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        anio_tecni9.setText("Año:");

        jLabel78.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtciudad_tecni9.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtciudad_tecni9.setBorder(null);
        txtciudad_tecni9.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtciudad_tecni9CaretUpdate(evt);
            }
        });
        txtciudad_tecni9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtciudad_tecni9KeyTyped(evt);
            }
        });

        ciudad_tecni9.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        ciudad_tecni9.setText("Ciudad donde se expidió el título:");

        pa_tecni9.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        pa_tecni9.setText("Programa académico:");

        jLabel79.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtpa_tecni9.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtpa_tecni9.setBorder(null);
        txtpa_tecni9.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtpa_tecni9CaretUpdate(evt);
            }
        });
        txtpa_tecni9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpa_tecni9ActionPerformed(evt);
            }
        });
        txtpa_tecni9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtpa_tecni9KeyTyped(evt);
            }
        });

        ni_tecni9.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        ni_tecni9.setText("Nombre institución:");

        jLabel80.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtni_tecni9.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtni_tecni9.setBorder(null);
        txtni_tecni9.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtni_tecni9CaretUpdate(evt);
            }
        });
        txtni_tecni9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtni_tecni9KeyTyped(evt);
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

        jLabel147.setBackground(new java.awt.Color(255, 255, 255));
        jLabel147.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel147.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/substract.png"))); // NOI18N
        jLabel147.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel147.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel147MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(pa_tecni9)
                        .addGap(12, 12, 12)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel79, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(txtpa_tecni9))
                        .addGap(18, 18, 18)
                        .addComponent(ni_tecni9))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(ciudad_tecni9)
                        .addGap(12, 12, 12)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel78, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel14Layout.createSequentialGroup()
                                .addComponent(txtciudad_tecni9, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(anio_tecni9)))))
                .addGap(12, 12, 12)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtanio_tecni9, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel77, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel80, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtni_tecni9)))
                .addGap(17, 17, 17)
                .addComponent(jLabel23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel147)
                .addGap(19, 19, 19))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtpa_tecni9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pa_tecni9)
                            .addComponent(ni_tecni9))
                        .addGap(0, 0, 0)
                        .addComponent(jLabel79, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtciudad_tecni9, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ciudad_tecni9)))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(txtni_tecni9, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel80, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtanio_tecni9, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(anio_tecni9))
                        .addGap(0, 0, 0)
                        .addComponent(jLabel77, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0)
                .addComponent(jLabel78, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel147, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));

        jLabel81.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtanio_tecni10.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtanio_tecni10.setBorder(null);
        txtanio_tecni10.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtanio_tecni10CaretUpdate(evt);
            }
        });
        txtanio_tecni10.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtanio_tecni10KeyTyped(evt);
            }
        });

        anio_tecni10.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        anio_tecni10.setText("Año:");

        jLabel82.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtciudad_tecni10.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtciudad_tecni10.setBorder(null);
        txtciudad_tecni10.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtciudad_tecni10CaretUpdate(evt);
            }
        });
        txtciudad_tecni10.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtciudad_tecni10KeyTyped(evt);
            }
        });

        ciudad_tecni10.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        ciudad_tecni10.setText("Ciudad donde se expidió el título:");

        pa_tecni10.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        pa_tecni10.setText("Programa académico:");

        jLabel83.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtpa_tecni10.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtpa_tecni10.setBorder(null);
        txtpa_tecni10.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtpa_tecni10CaretUpdate(evt);
            }
        });
        txtpa_tecni10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpa_tecni10ActionPerformed(evt);
            }
        });
        txtpa_tecni10.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtpa_tecni10KeyTyped(evt);
            }
        });

        ni_tecni10.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        ni_tecni10.setText("Nombre institución:");

        jLabel84.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtni_tecni10.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtni_tecni10.setBorder(null);
        txtni_tecni10.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtni_tecni10CaretUpdate(evt);
            }
        });
        txtni_tecni10.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtni_tecni10KeyTyped(evt);
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

        jLabel148.setBackground(new java.awt.Color(255, 255, 255));
        jLabel148.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel148.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/substract.png"))); // NOI18N
        jLabel148.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel148.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel148MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(pa_tecni10)
                        .addGap(12, 12, 12)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel83, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(txtpa_tecni10))
                        .addGap(18, 18, 18)
                        .addComponent(ni_tecni10))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(ciudad_tecni10)
                        .addGap(12, 12, 12)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel82, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel15Layout.createSequentialGroup()
                                .addComponent(txtciudad_tecni10, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(anio_tecni10)))))
                .addGap(12, 12, 12)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtanio_tecni10, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel81, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel84, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtni_tecni10)))
                .addGap(17, 17, 17)
                .addComponent(jLabel24)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel148)
                .addGap(19, 19, 19))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtpa_tecni10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pa_tecni10)
                            .addComponent(ni_tecni10))
                        .addGap(0, 0, 0)
                        .addComponent(jLabel83, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtciudad_tecni10, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ciudad_tecni10)))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(txtni_tecni10, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel84, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtanio_tecni10, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(anio_tecni10))
                        .addGap(0, 0, 0)
                        .addComponent(jLabel81, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0)
                .addComponent(jLabel82, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel148, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel16.setBackground(new java.awt.Color(255, 255, 255));

        jLabel85.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtanio_tecni11.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtanio_tecni11.setBorder(null);
        txtanio_tecni11.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtanio_tecni11CaretUpdate(evt);
            }
        });
        txtanio_tecni11.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtanio_tecni11KeyTyped(evt);
            }
        });

        anio_tecni11.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        anio_tecni11.setText("Año:");

        jLabel86.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtciudad_tecni11.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtciudad_tecni11.setBorder(null);
        txtciudad_tecni11.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtciudad_tecni11CaretUpdate(evt);
            }
        });
        txtciudad_tecni11.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtciudad_tecni11KeyTyped(evt);
            }
        });

        ciudad_tecni11.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        ciudad_tecni11.setText("Ciudad donde se expidió el título:");

        pa_tecni11.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        pa_tecni11.setText("Programa académico:");

        jLabel87.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtpa_tecni11.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtpa_tecni11.setBorder(null);
        txtpa_tecni11.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtpa_tecni11CaretUpdate(evt);
            }
        });
        txtpa_tecni11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpa_tecni11ActionPerformed(evt);
            }
        });
        txtpa_tecni11.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtpa_tecni11KeyTyped(evt);
            }
        });

        ni_tecni11.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        ni_tecni11.setText("Nombre institución:");

        jLabel88.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtni_tecni11.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtni_tecni11.setBorder(null);
        txtni_tecni11.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtni_tecni11CaretUpdate(evt);
            }
        });
        txtni_tecni11.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtni_tecni11KeyTyped(evt);
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

        jLabel149.setBackground(new java.awt.Color(255, 255, 255));
        jLabel149.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel149.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/substract.png"))); // NOI18N
        jLabel149.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel149.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel149MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(pa_tecni11)
                        .addGap(12, 12, 12)
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel87, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(txtpa_tecni11))
                        .addGap(18, 18, 18)
                        .addComponent(ni_tecni11))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(ciudad_tecni11)
                        .addGap(12, 12, 12)
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel86, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel16Layout.createSequentialGroup()
                                .addComponent(txtciudad_tecni11, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(anio_tecni11)))))
                .addGap(12, 12, 12)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtanio_tecni11, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel85, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel88, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtni_tecni11)))
                .addGap(17, 17, 17)
                .addComponent(jLabel25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel149)
                .addGap(19, 19, 19))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtpa_tecni11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pa_tecni11)
                            .addComponent(ni_tecni11))
                        .addGap(0, 0, 0)
                        .addComponent(jLabel87, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtciudad_tecni11, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ciudad_tecni11)))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(txtni_tecni11, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel88, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtanio_tecni11, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(anio_tecni11))
                        .addGap(0, 0, 0)
                        .addComponent(jLabel85, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0)
                .addComponent(jLabel86, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel149, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel17.setBackground(new java.awt.Color(255, 255, 255));

        jLabel89.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtanio_tecni12.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtanio_tecni12.setBorder(null);
        txtanio_tecni12.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtanio_tecni12CaretUpdate(evt);
            }
        });
        txtanio_tecni12.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtanio_tecni12KeyTyped(evt);
            }
        });

        anio_tecni12.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        anio_tecni12.setText("Año:");

        jLabel90.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtciudad_tecni12.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtciudad_tecni12.setBorder(null);
        txtciudad_tecni12.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtciudad_tecni12CaretUpdate(evt);
            }
        });
        txtciudad_tecni12.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtciudad_tecni12KeyTyped(evt);
            }
        });

        ciudad_tecni12.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        ciudad_tecni12.setText("Ciudad donde se expidió el título:");

        pa_tecni12.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        pa_tecni12.setText("Programa académico:");

        jLabel91.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtpa_tecni12.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtpa_tecni12.setBorder(null);
        txtpa_tecni12.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtpa_tecni12CaretUpdate(evt);
            }
        });
        txtpa_tecni12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpa_tecni12ActionPerformed(evt);
            }
        });
        txtpa_tecni12.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtpa_tecni12KeyTyped(evt);
            }
        });

        ni_tecni12.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        ni_tecni12.setText("Nombre institución:");

        jLabel92.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtni_tecni12.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtni_tecni12.setBorder(null);
        txtni_tecni12.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtni_tecni12CaretUpdate(evt);
            }
        });
        txtni_tecni12.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtni_tecni12KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addComponent(pa_tecni12)
                        .addGap(12, 12, 12)
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel91, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(txtpa_tecni12))
                        .addGap(18, 18, 18)
                        .addComponent(ni_tecni12))
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addComponent(ciudad_tecni12)
                        .addGap(12, 12, 12)
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel90, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel17Layout.createSequentialGroup()
                                .addComponent(txtciudad_tecni12, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(anio_tecni12)))))
                .addGap(12, 12, 12)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtanio_tecni12, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel89, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel92, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtni_tecni12)))
                .addGap(90, 90, 90))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtpa_tecni12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pa_tecni12)
                            .addComponent(ni_tecni12))
                        .addGap(0, 0, 0)
                        .addComponent(jLabel91, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtciudad_tecni12, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ciudad_tecni12)))
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addComponent(txtni_tecni12, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel92, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtanio_tecni12, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(anio_tecni12))
                        .addGap(0, 0, 0)
                        .addComponent(jLabel89, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0)
                .addComponent(jLabel90, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel18.setBackground(new java.awt.Color(255, 255, 255));

        jLabel93.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtanio_tecni13.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtanio_tecni13.setBorder(null);
        txtanio_tecni13.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtanio_tecni13CaretUpdate(evt);
            }
        });
        txtanio_tecni13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtanio_tecni13ActionPerformed(evt);
            }
        });
        txtanio_tecni13.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtanio_tecni13KeyTyped(evt);
            }
        });

        anio_tecni13.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        anio_tecni13.setText("Año:");

        jLabel94.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtciudad_tecni13.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtciudad_tecni13.setBorder(null);
        txtciudad_tecni13.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtciudad_tecni13CaretUpdate(evt);
            }
        });
        txtciudad_tecni13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtciudad_tecni13ActionPerformed(evt);
            }
        });
        txtciudad_tecni13.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtciudad_tecni13KeyTyped(evt);
            }
        });

        ciudad_tecni13.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        ciudad_tecni13.setText("Ciudad donde se expidió el título:");

        pa_tecni13.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        pa_tecni13.setText("Programa académico:");

        jLabel95.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtpa_tecni13.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtpa_tecni13.setBorder(null);
        txtpa_tecni13.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtpa_tecni13CaretUpdate(evt);
            }
        });
        txtpa_tecni13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpa_tecni13ActionPerformed(evt);
            }
        });
        txtpa_tecni13.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtpa_tecni13KeyTyped(evt);
            }
        });

        ni_tecni13.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        ni_tecni13.setText("Nombre institución:");

        jLabel96.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtni_tecni13.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtni_tecni13.setBorder(null);
        txtni_tecni13.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtni_tecni13CaretUpdate(evt);
            }
        });
        txtni_tecni13.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtni_tecni13KeyTyped(evt);
            }
        });

        jLabel27.setBackground(new java.awt.Color(255, 255, 255));
        jLabel27.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/plus-symbol.png"))); // NOI18N
        jLabel27.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel27MouseClicked(evt);
            }
        });

        jLabel151.setBackground(new java.awt.Color(255, 255, 255));
        jLabel151.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel151.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/substract.png"))); // NOI18N
        jLabel151.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel151.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel151MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addComponent(pa_tecni13)
                        .addGap(12, 12, 12)
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel95, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(txtpa_tecni13))
                        .addGap(18, 18, 18)
                        .addComponent(ni_tecni13))
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addComponent(ciudad_tecni13)
                        .addGap(12, 12, 12)
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel94, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel18Layout.createSequentialGroup()
                                .addComponent(txtciudad_tecni13, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(anio_tecni13)))))
                .addGap(12, 12, 12)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtanio_tecni13, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel93, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel96, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtni_tecni13)))
                .addGap(17, 17, 17)
                .addComponent(jLabel27)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel151)
                .addGap(19, 19, 19))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtpa_tecni13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pa_tecni13)
                            .addComponent(ni_tecni13))
                        .addGap(0, 0, 0)
                        .addComponent(jLabel95, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtciudad_tecni13, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ciudad_tecni13)))
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addComponent(txtni_tecni13, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel96, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtanio_tecni13, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(anio_tecni13))
                        .addGap(0, 0, 0)
                        .addComponent(jLabel93, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0)
                .addComponent(jLabel94, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel151, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel19.setBackground(new java.awt.Color(255, 255, 255));

        jLabel97.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtanio_tecni14.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtanio_tecni14.setBorder(null);
        txtanio_tecni14.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtanio_tecni14CaretUpdate(evt);
            }
        });
        txtanio_tecni14.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtanio_tecni14KeyTyped(evt);
            }
        });

        anio_tecni14.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        anio_tecni14.setText("Año:");

        jLabel99.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtciudad_tecni14.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtciudad_tecni14.setBorder(null);
        txtciudad_tecni14.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtciudad_tecni14CaretUpdate(evt);
            }
        });
        txtciudad_tecni14.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtciudad_tecni14KeyTyped(evt);
            }
        });

        ciudad_tecni14.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        ciudad_tecni14.setText("Ciudad donde se expidió el título:");

        pa_tecni14.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        pa_tecni14.setText("Programa académico:");

        jLabel100.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtpa_tecni14.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtpa_tecni14.setBorder(null);
        txtpa_tecni14.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtpa_tecni14CaretUpdate(evt);
            }
        });
        txtpa_tecni14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpa_tecni14ActionPerformed(evt);
            }
        });
        txtpa_tecni14.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtpa_tecni14KeyTyped(evt);
            }
        });

        ni_tecni14.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        ni_tecni14.setText("Nombre institución:");

        jLabel101.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtni_tecni14.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtni_tecni14.setBorder(null);
        txtni_tecni14.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtni_tecni14CaretUpdate(evt);
            }
        });
        txtni_tecni14.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtni_tecni14KeyTyped(evt);
            }
        });

        jLabel28.setBackground(new java.awt.Color(255, 255, 255));
        jLabel28.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/plus-symbol.png"))); // NOI18N
        jLabel28.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel28MouseClicked(evt);
            }
        });

        jLabel152.setBackground(new java.awt.Color(255, 255, 255));
        jLabel152.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel152.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/substract.png"))); // NOI18N
        jLabel152.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel152.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel152MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addComponent(pa_tecni14)
                        .addGap(12, 12, 12)
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel100, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(txtpa_tecni14))
                        .addGap(18, 18, 18)
                        .addComponent(ni_tecni14))
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addComponent(ciudad_tecni14)
                        .addGap(12, 12, 12)
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel99, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel19Layout.createSequentialGroup()
                                .addComponent(txtciudad_tecni14, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(anio_tecni14)))))
                .addGap(12, 12, 12)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtanio_tecni14, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel97, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel101, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtni_tecni14)))
                .addGap(17, 17, 17)
                .addComponent(jLabel28)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel152)
                .addGap(19, 19, 19))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtpa_tecni14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pa_tecni14)
                            .addComponent(ni_tecni14))
                        .addGap(0, 0, 0)
                        .addComponent(jLabel100, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtciudad_tecni14, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ciudad_tecni14)))
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addComponent(txtni_tecni14, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel101, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtanio_tecni14, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(anio_tecni14))
                        .addGap(0, 0, 0)
                        .addComponent(jLabel97, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0)
                .addComponent(jLabel99, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel152, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel20.setBackground(new java.awt.Color(255, 255, 255));

        jLabel102.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtanio_tecni15.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtanio_tecni15.setBorder(null);
        txtanio_tecni15.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtanio_tecni15CaretUpdate(evt);
            }
        });
        txtanio_tecni15.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtanio_tecni15KeyTyped(evt);
            }
        });

        anio_tecni15.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        anio_tecni15.setText("Año:");

        jLabel103.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtciudad_tecni15.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtciudad_tecni15.setBorder(null);
        txtciudad_tecni15.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtciudad_tecni15CaretUpdate(evt);
            }
        });
        txtciudad_tecni15.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtciudad_tecni15KeyTyped(evt);
            }
        });

        ciudad_tecni15.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        ciudad_tecni15.setText("Ciudad donde se expidió el título:");

        pa_tecni15.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        pa_tecni15.setText("Programa académico:");

        jLabel104.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtpa_tecni15.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtpa_tecni15.setBorder(null);
        txtpa_tecni15.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtpa_tecni15CaretUpdate(evt);
            }
        });
        txtpa_tecni15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpa_tecni15ActionPerformed(evt);
            }
        });
        txtpa_tecni15.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtpa_tecni15KeyTyped(evt);
            }
        });

        ni_tecni15.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        ni_tecni15.setText("Nombre institución:");

        jLabel105.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtni_tecni15.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtni_tecni15.setBorder(null);
        txtni_tecni15.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtni_tecni15CaretUpdate(evt);
            }
        });
        txtni_tecni15.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtni_tecni15KeyTyped(evt);
            }
        });

        jLabel106.setBackground(new java.awt.Color(255, 255, 255));
        jLabel106.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        jLabel106.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/plus-symbol.png"))); // NOI18N
        jLabel106.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel106.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel106MouseClicked(evt);
            }
        });

        jLabel153.setBackground(new java.awt.Color(255, 255, 255));
        jLabel153.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel153.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/substract.png"))); // NOI18N
        jLabel153.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel153.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel153MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addComponent(pa_tecni15)
                        .addGap(12, 12, 12)
                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel104, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(txtpa_tecni15))
                        .addGap(18, 18, 18)
                        .addComponent(ni_tecni15))
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addComponent(ciudad_tecni15)
                        .addGap(12, 12, 12)
                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel103, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel20Layout.createSequentialGroup()
                                .addComponent(txtciudad_tecni15, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(anio_tecni15)))))
                .addGap(12, 12, 12)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtanio_tecni15, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel102, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel105, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtni_tecni15)))
                .addGap(17, 17, 17)
                .addComponent(jLabel106)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel153)
                .addGap(19, 19, 19))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtpa_tecni15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pa_tecni15)
                            .addComponent(ni_tecni15))
                        .addGap(0, 0, 0)
                        .addComponent(jLabel104, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtciudad_tecni15, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ciudad_tecni15)))
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addComponent(txtni_tecni15, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel105, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtanio_tecni15, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(anio_tecni15))
                        .addGap(0, 0, 0)
                        .addComponent(jLabel102, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0)
                .addComponent(jLabel103, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel106, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel153, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel21.setBackground(new java.awt.Color(255, 255, 255));

        jLabel107.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtanio_tecni16.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtanio_tecni16.setBorder(null);
        txtanio_tecni16.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtanio_tecni16CaretUpdate(evt);
            }
        });
        txtanio_tecni16.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtanio_tecni16KeyTyped(evt);
            }
        });

        anio_tecni16.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        anio_tecni16.setText("Año:");

        jLabel108.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtciudad_tecni16.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtciudad_tecni16.setBorder(null);
        txtciudad_tecni16.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtciudad_tecni16CaretUpdate(evt);
            }
        });
        txtciudad_tecni16.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtciudad_tecni16KeyTyped(evt);
            }
        });

        ciudad_tecni16.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        ciudad_tecni16.setText("Ciudad donde se expidió el título:");

        pa_tecni16.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        pa_tecni16.setText("Programa académico:");

        jLabel109.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtpa_tecni16.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtpa_tecni16.setBorder(null);
        txtpa_tecni16.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtpa_tecni16CaretUpdate(evt);
            }
        });
        txtpa_tecni16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpa_tecni16ActionPerformed(evt);
            }
        });
        txtpa_tecni16.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtpa_tecni16KeyTyped(evt);
            }
        });

        ni_tecni16.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        ni_tecni16.setText("Nombre institución:");

        jLabel110.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtni_tecni16.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtni_tecni16.setBorder(null);
        txtni_tecni16.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtni_tecni16CaretUpdate(evt);
            }
        });
        txtni_tecni16.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtni_tecni16KeyTyped(evt);
            }
        });

        jLabel111.setBackground(new java.awt.Color(255, 255, 255));
        jLabel111.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        jLabel111.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/plus-symbol.png"))); // NOI18N
        jLabel111.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel111.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel111MouseClicked(evt);
            }
        });

        jLabel154.setBackground(new java.awt.Color(255, 255, 255));
        jLabel154.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel154.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/substract.png"))); // NOI18N
        jLabel154.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel154.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel154MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addComponent(pa_tecni16)
                        .addGap(12, 12, 12)
                        .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel109, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(txtpa_tecni16))
                        .addGap(18, 18, 18)
                        .addComponent(ni_tecni16))
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addComponent(ciudad_tecni16)
                        .addGap(12, 12, 12)
                        .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel108, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel21Layout.createSequentialGroup()
                                .addComponent(txtciudad_tecni16, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(anio_tecni16)))))
                .addGap(12, 12, 12)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtanio_tecni16, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel107, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel110, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtni_tecni16)))
                .addGap(17, 17, 17)
                .addComponent(jLabel111)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel154)
                .addGap(19, 19, 19))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtpa_tecni16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pa_tecni16)
                            .addComponent(ni_tecni16))
                        .addGap(0, 0, 0)
                        .addComponent(jLabel109, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtciudad_tecni16, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ciudad_tecni16)))
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addComponent(txtni_tecni16, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel110, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtanio_tecni16, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(anio_tecni16))
                        .addGap(0, 0, 0)
                        .addComponent(jLabel107, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0)
                .addComponent(jLabel108, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel111, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel154, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel22.setBackground(new java.awt.Color(255, 255, 255));

        jLabel112.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtanio_tecni17.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtanio_tecni17.setBorder(null);
        txtanio_tecni17.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtanio_tecni17CaretUpdate(evt);
            }
        });
        txtanio_tecni17.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtanio_tecni17KeyTyped(evt);
            }
        });

        anio_tecni17.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        anio_tecni17.setText("Año:");

        jLabel113.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtciudad_tecni17.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtciudad_tecni17.setBorder(null);
        txtciudad_tecni17.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtciudad_tecni17CaretUpdate(evt);
            }
        });
        txtciudad_tecni17.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtciudad_tecni17KeyTyped(evt);
            }
        });

        ciudad_tecni17.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        ciudad_tecni17.setText("Ciudad donde se expidió el título:");

        pa_tecni17.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        pa_tecni17.setText("Programa académico:");

        jLabel114.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtpa_tecni17.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtpa_tecni17.setBorder(null);
        txtpa_tecni17.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtpa_tecni17CaretUpdate(evt);
            }
        });
        txtpa_tecni17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpa_tecni17ActionPerformed(evt);
            }
        });
        txtpa_tecni17.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtpa_tecni17KeyTyped(evt);
            }
        });

        ni_tecni17.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        ni_tecni17.setText("Nombre institución:");

        jLabel115.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtni_tecni17.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtni_tecni17.setBorder(null);
        txtni_tecni17.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtni_tecni17CaretUpdate(evt);
            }
        });
        txtni_tecni17.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtni_tecni17KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addComponent(pa_tecni17)
                        .addGap(12, 12, 12)
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel114, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(txtpa_tecni17))
                        .addGap(18, 18, 18)
                        .addComponent(ni_tecni17))
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addComponent(ciudad_tecni17)
                        .addGap(12, 12, 12)
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel113, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel22Layout.createSequentialGroup()
                                .addComponent(txtciudad_tecni17, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(anio_tecni17)))))
                .addGap(12, 12, 12)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtanio_tecni17, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel112, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel115, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtni_tecni17)))
                .addGap(90, 90, 90))
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtpa_tecni17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pa_tecni17)
                            .addComponent(ni_tecni17))
                        .addGap(0, 0, 0)
                        .addComponent(jLabel114, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtciudad_tecni17, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ciudad_tecni17)))
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addComponent(txtni_tecni17, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel115, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtanio_tecni17, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(anio_tecni17))
                        .addGap(0, 0, 0)
                        .addComponent(jLabel112, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0)
                .addComponent(jLabel113, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel23.setBackground(new java.awt.Color(255, 255, 255));

        jLabel117.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtanio_tecni18.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtanio_tecni18.setBorder(null);
        txtanio_tecni18.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtanio_tecni18CaretUpdate(evt);
            }
        });
        txtanio_tecni18.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtanio_tecni18KeyTyped(evt);
            }
        });

        anio_tecni18.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        anio_tecni18.setText("Año:");

        jLabel118.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtciudad_tecni18.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtciudad_tecni18.setBorder(null);
        txtciudad_tecni18.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtciudad_tecni18CaretUpdate(evt);
            }
        });
        txtciudad_tecni18.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtciudad_tecni18KeyTyped(evt);
            }
        });

        ciudad_tecni18.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        ciudad_tecni18.setText("Ciudad donde se expidió el título:");

        pa_tecni18.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        pa_tecni18.setText("Programa académico:");

        jLabel119.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtpa_tecni18.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtpa_tecni18.setBorder(null);
        txtpa_tecni18.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtpa_tecni18CaretUpdate(evt);
            }
        });
        txtpa_tecni18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpa_tecni18ActionPerformed(evt);
            }
        });
        txtpa_tecni18.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtpa_tecni18KeyTyped(evt);
            }
        });

        ni_tecni18.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        ni_tecni18.setText("Nombre institución:");

        jLabel120.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtni_tecni18.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtni_tecni18.setBorder(null);
        txtni_tecni18.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtni_tecni18CaretUpdate(evt);
            }
        });
        txtni_tecni18.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtni_tecni18KeyTyped(evt);
            }
        });

        jLabel121.setBackground(new java.awt.Color(255, 255, 255));
        jLabel121.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        jLabel121.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/plus-symbol.png"))); // NOI18N
        jLabel121.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel121.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel121MouseClicked(evt);
            }
        });

        jLabel156.setBackground(new java.awt.Color(255, 255, 255));
        jLabel156.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel156.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/substract.png"))); // NOI18N
        jLabel156.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel156.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel156MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addComponent(pa_tecni18)
                        .addGap(12, 12, 12)
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel119, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(txtpa_tecni18))
                        .addGap(18, 18, 18)
                        .addComponent(ni_tecni18))
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addComponent(ciudad_tecni18)
                        .addGap(12, 12, 12)
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel118, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel23Layout.createSequentialGroup()
                                .addComponent(txtciudad_tecni18, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(anio_tecni18)))))
                .addGap(12, 12, 12)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtanio_tecni18, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel117, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel120, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtni_tecni18)))
                .addGap(17, 17, 17)
                .addComponent(jLabel121)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel156)
                .addGap(19, 19, 19))
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtpa_tecni18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pa_tecni18)
                            .addComponent(ni_tecni18))
                        .addGap(0, 0, 0)
                        .addComponent(jLabel119, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtciudad_tecni18, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ciudad_tecni18)))
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addComponent(txtni_tecni18, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel120, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtanio_tecni18, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(anio_tecni18))
                        .addGap(0, 0, 0)
                        .addComponent(jLabel117, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0)
                .addComponent(jLabel118, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel121, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel156, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel24.setBackground(new java.awt.Color(255, 255, 255));

        jLabel122.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtanio_tecni19.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtanio_tecni19.setBorder(null);
        txtanio_tecni19.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtanio_tecni19CaretUpdate(evt);
            }
        });
        txtanio_tecni19.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtanio_tecni19KeyTyped(evt);
            }
        });

        anio_tecni19.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        anio_tecni19.setText("Año:");

        jLabel123.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtciudad_tecni19.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtciudad_tecni19.setBorder(null);
        txtciudad_tecni19.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtciudad_tecni19CaretUpdate(evt);
            }
        });
        txtciudad_tecni19.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtciudad_tecni19KeyTyped(evt);
            }
        });

        ciudad_tecni19.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        ciudad_tecni19.setText("Ciudad donde se expidió el título:");

        pa_tecni19.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        pa_tecni19.setText("Programa académico:");

        jLabel124.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtpa_tecni19.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtpa_tecni19.setBorder(null);
        txtpa_tecni19.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtpa_tecni19CaretUpdate(evt);
            }
        });
        txtpa_tecni19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpa_tecni19ActionPerformed(evt);
            }
        });
        txtpa_tecni19.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtpa_tecni19KeyTyped(evt);
            }
        });

        ni_tecni19.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        ni_tecni19.setText("Nombre institución:");

        jLabel125.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtni_tecni19.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtni_tecni19.setBorder(null);
        txtni_tecni19.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtni_tecni19CaretUpdate(evt);
            }
        });
        txtni_tecni19.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtni_tecni19KeyTyped(evt);
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

        jLabel157.setBackground(new java.awt.Color(255, 255, 255));
        jLabel157.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel157.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/substract.png"))); // NOI18N
        jLabel157.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel157.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel157MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addComponent(pa_tecni19)
                        .addGap(12, 12, 12)
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel124, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(txtpa_tecni19))
                        .addGap(18, 18, 18)
                        .addComponent(ni_tecni19))
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addComponent(ciudad_tecni19)
                        .addGap(12, 12, 12)
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel123, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel24Layout.createSequentialGroup()
                                .addComponent(txtciudad_tecni19, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(anio_tecni19)))))
                .addGap(12, 12, 12)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtanio_tecni19, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel122, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel125, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtni_tecni19)))
                .addGap(17, 17, 17)
                .addComponent(jLabel126)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel157)
                .addGap(19, 19, 19))
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtpa_tecni19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pa_tecni19)
                            .addComponent(ni_tecni19))
                        .addGap(0, 0, 0)
                        .addComponent(jLabel124, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtciudad_tecni19, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ciudad_tecni19)))
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addComponent(txtni_tecni19, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel125, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtanio_tecni19, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(anio_tecni19))
                        .addGap(0, 0, 0)
                        .addComponent(jLabel122, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0)
                .addComponent(jLabel123, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel126, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel157, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel25.setBackground(new java.awt.Color(255, 255, 255));

        jLabel127.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtanio_tecni20.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtanio_tecni20.setBorder(null);
        txtanio_tecni20.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtanio_tecni20CaretUpdate(evt);
            }
        });
        txtanio_tecni20.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtanio_tecni20KeyTyped(evt);
            }
        });

        anio_tecni20.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        anio_tecni20.setText("Año:");

        jLabel128.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtciudad_tecni20.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtciudad_tecni20.setBorder(null);
        txtciudad_tecni20.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtciudad_tecni20CaretUpdate(evt);
            }
        });
        txtciudad_tecni20.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtciudad_tecni20KeyTyped(evt);
            }
        });

        ciudad_tecni20.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        ciudad_tecni20.setText("Ciudad donde se expidió el título:");

        pa_tecni20.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        pa_tecni20.setText("Programa académico:");

        jLabel129.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtpa_tecni20.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtpa_tecni20.setBorder(null);
        txtpa_tecni20.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtpa_tecni20CaretUpdate(evt);
            }
        });
        txtpa_tecni20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpa_tecni20ActionPerformed(evt);
            }
        });
        txtpa_tecni20.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtpa_tecni20KeyTyped(evt);
            }
        });

        ni_tecni20.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        ni_tecni20.setText("Nombre institución:");

        jLabel130.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtni_tecni20.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtni_tecni20.setBorder(null);
        txtni_tecni20.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtni_tecni20CaretUpdate(evt);
            }
        });
        txtni_tecni20.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtni_tecni20KeyTyped(evt);
            }
        });

        jLabel131.setBackground(new java.awt.Color(255, 255, 255));
        jLabel131.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        jLabel131.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/plus-symbol.png"))); // NOI18N
        jLabel131.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel131.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel131MouseClicked(evt);
            }
        });

        jLabel158.setBackground(new java.awt.Color(255, 255, 255));
        jLabel158.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel158.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/substract.png"))); // NOI18N
        jLabel158.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel158.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel158MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addComponent(pa_tecni20)
                        .addGap(12, 12, 12)
                        .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel129, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(txtpa_tecni20))
                        .addGap(18, 18, 18)
                        .addComponent(ni_tecni20))
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addComponent(ciudad_tecni20)
                        .addGap(12, 12, 12)
                        .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel128, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel25Layout.createSequentialGroup()
                                .addComponent(txtciudad_tecni20, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(anio_tecni20)))))
                .addGap(12, 12, 12)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtanio_tecni20, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel127, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel130, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtni_tecni20)))
                .addGap(17, 17, 17)
                .addComponent(jLabel131)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel158)
                .addGap(19, 19, 19))
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtpa_tecni20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pa_tecni20)
                            .addComponent(ni_tecni20))
                        .addGap(0, 0, 0)
                        .addComponent(jLabel129, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtciudad_tecni20, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ciudad_tecni20)))
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addComponent(txtni_tecni20, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel130, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtanio_tecni20, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(anio_tecni20))
                        .addGap(0, 0, 0)
                        .addComponent(jLabel127, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0)
                .addComponent(jLabel128, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel131, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel158, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel26.setBackground(new java.awt.Color(255, 255, 255));

        jLabel132.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtanio_tecni21.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtanio_tecni21.setBorder(null);
        txtanio_tecni21.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtanio_tecni21CaretUpdate(evt);
            }
        });
        txtanio_tecni21.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtanio_tecni21KeyTyped(evt);
            }
        });

        anio_tecni21.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        anio_tecni21.setText("Año:");

        jLabel133.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtciudad_tecni21.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtciudad_tecni21.setBorder(null);
        txtciudad_tecni21.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtciudad_tecni21CaretUpdate(evt);
            }
        });
        txtciudad_tecni21.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtciudad_tecni21KeyTyped(evt);
            }
        });

        ciudad_tecni21.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        ciudad_tecni21.setText("Ciudad donde se expidió el título:");

        pa_tecni21.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        pa_tecni21.setText("Programa académico:");

        jLabel134.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtpa_tecni21.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtpa_tecni21.setBorder(null);
        txtpa_tecni21.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtpa_tecni21CaretUpdate(evt);
            }
        });
        txtpa_tecni21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpa_tecni21ActionPerformed(evt);
            }
        });
        txtpa_tecni21.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtpa_tecni21KeyTyped(evt);
            }
        });

        ni_tecni21.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        ni_tecni21.setText("Nombre institución:");

        jLabel135.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtni_tecni21.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtni_tecni21.setBorder(null);
        txtni_tecni21.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtni_tecni21CaretUpdate(evt);
            }
        });
        txtni_tecni21.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtni_tecni21KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel26Layout.createSequentialGroup()
                        .addComponent(pa_tecni21)
                        .addGap(12, 12, 12)
                        .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel134, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(txtpa_tecni21))
                        .addGap(18, 18, 18)
                        .addComponent(ni_tecni21))
                    .addGroup(jPanel26Layout.createSequentialGroup()
                        .addComponent(ciudad_tecni21)
                        .addGap(12, 12, 12)
                        .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel133, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel26Layout.createSequentialGroup()
                                .addComponent(txtciudad_tecni21, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(anio_tecni21)))))
                .addGap(12, 12, 12)
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtanio_tecni21, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel132, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel135, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtni_tecni21)))
                .addGap(90, 90, 90))
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel26Layout.createSequentialGroup()
                        .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtpa_tecni21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pa_tecni21)
                            .addComponent(ni_tecni21))
                        .addGap(0, 0, 0)
                        .addComponent(jLabel134, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtciudad_tecni21, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ciudad_tecni21)))
                    .addGroup(jPanel26Layout.createSequentialGroup()
                        .addComponent(txtni_tecni21, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel135, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtanio_tecni21, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(anio_tecni21))
                        .addGap(0, 0, 0)
                        .addComponent(jLabel132, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0)
                .addComponent(jLabel133, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel27.setBackground(new java.awt.Color(255, 255, 255));

        jLabel137.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtanio_tecni22.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtanio_tecni22.setBorder(null);
        txtanio_tecni22.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtanio_tecni22CaretUpdate(evt);
            }
        });
        txtanio_tecni22.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtanio_tecni22KeyTyped(evt);
            }
        });

        anio_tecni22.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        anio_tecni22.setText("Año:");

        jLabel160.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtciudad_tecni22.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtciudad_tecni22.setBorder(null);
        txtciudad_tecni22.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtciudad_tecni22CaretUpdate(evt);
            }
        });
        txtciudad_tecni22.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtciudad_tecni22KeyTyped(evt);
            }
        });

        ciudad_tecni22.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        ciudad_tecni22.setText("Ciudad donde se expidió el título:");

        pa_tecni22.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        pa_tecni22.setText("Programa académico:");

        jLabel161.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtpa_tecni22.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtpa_tecni22.setBorder(null);
        txtpa_tecni22.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtpa_tecni22CaretUpdate(evt);
            }
        });
        txtpa_tecni22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpa_tecni22ActionPerformed(evt);
            }
        });
        txtpa_tecni22.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtpa_tecni22KeyTyped(evt);
            }
        });

        ni_tecni22.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        ni_tecni22.setText("Nombre institución:");

        jLabel162.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtni_tecni22.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtni_tecni22.setBorder(null);
        txtni_tecni22.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtni_tecni22CaretUpdate(evt);
            }
        });
        txtni_tecni22.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtni_tecni22KeyTyped(evt);
            }
        });

        jLabel163.setBackground(new java.awt.Color(255, 255, 255));
        jLabel163.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        jLabel163.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/plus-symbol.png"))); // NOI18N
        jLabel163.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel163.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel163MouseClicked(evt);
            }
        });

        jLabel164.setBackground(new java.awt.Color(255, 255, 255));
        jLabel164.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel164.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/substract.png"))); // NOI18N
        jLabel164.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel164.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel164MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel27Layout.createSequentialGroup()
                        .addComponent(pa_tecni22)
                        .addGap(12, 12, 12)
                        .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel161, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(txtpa_tecni22))
                        .addGap(18, 18, 18)
                        .addComponent(ni_tecni22))
                    .addGroup(jPanel27Layout.createSequentialGroup()
                        .addComponent(ciudad_tecni22)
                        .addGap(12, 12, 12)
                        .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel160, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel27Layout.createSequentialGroup()
                                .addComponent(txtciudad_tecni22, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(anio_tecni22)))))
                .addGap(12, 12, 12)
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtanio_tecni22, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel137, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel162, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtni_tecni22)))
                .addGap(17, 17, 17)
                .addComponent(jLabel163)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel164)
                .addGap(19, 19, 19))
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel27Layout.createSequentialGroup()
                        .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtpa_tecni22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pa_tecni22)
                            .addComponent(ni_tecni22))
                        .addGap(0, 0, 0)
                        .addComponent(jLabel161, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtciudad_tecni22, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ciudad_tecni22)))
                    .addGroup(jPanel27Layout.createSequentialGroup()
                        .addComponent(txtni_tecni22, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel162, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtanio_tecni22, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(anio_tecni22))
                        .addGap(0, 0, 0)
                        .addComponent(jLabel137, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0)
                .addComponent(jLabel160, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel163, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel164, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel28.setBackground(new java.awt.Color(255, 255, 255));

        jLabel165.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtanio_tecni23.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtanio_tecni23.setBorder(null);
        txtanio_tecni23.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtanio_tecni23CaretUpdate(evt);
            }
        });
        txtanio_tecni23.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtanio_tecni23KeyTyped(evt);
            }
        });

        anio_tecni23.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        anio_tecni23.setText("Año:");

        jLabel166.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtciudad_tecni23.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtciudad_tecni23.setBorder(null);
        txtciudad_tecni23.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtciudad_tecni23CaretUpdate(evt);
            }
        });
        txtciudad_tecni23.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtciudad_tecni23KeyTyped(evt);
            }
        });

        ciudad_tecni23.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        ciudad_tecni23.setText("Ciudad donde se expidió el título:");

        pa_tecni23.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        pa_tecni23.setText("Programa académico:");

        jLabel167.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtpa_tecni23.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtpa_tecni23.setBorder(null);
        txtpa_tecni23.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtpa_tecni23CaretUpdate(evt);
            }
        });
        txtpa_tecni23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpa_tecni23ActionPerformed(evt);
            }
        });
        txtpa_tecni23.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtpa_tecni23KeyTyped(evt);
            }
        });

        ni_tecni23.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        ni_tecni23.setText("Nombre institución:");

        jLabel168.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtni_tecni23.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtni_tecni23.setBorder(null);
        txtni_tecni23.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtni_tecni23CaretUpdate(evt);
            }
        });
        txtni_tecni23.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtni_tecni23KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel28Layout.createSequentialGroup()
                        .addComponent(pa_tecni23)
                        .addGap(12, 12, 12)
                        .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel167, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(txtpa_tecni23))
                        .addGap(18, 18, 18)
                        .addComponent(ni_tecni23))
                    .addGroup(jPanel28Layout.createSequentialGroup()
                        .addComponent(ciudad_tecni23)
                        .addGap(12, 12, 12)
                        .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel166, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel28Layout.createSequentialGroup()
                                .addComponent(txtciudad_tecni23, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(anio_tecni23)))))
                .addGap(12, 12, 12)
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtanio_tecni23, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel165, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel168, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtni_tecni23)))
                .addGap(90, 90, 90))
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel28Layout.createSequentialGroup()
                        .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtpa_tecni23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pa_tecni23)
                            .addComponent(ni_tecni23))
                        .addGap(0, 0, 0)
                        .addComponent(jLabel167, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtciudad_tecni23, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ciudad_tecni23)))
                    .addGroup(jPanel28Layout.createSequentialGroup()
                        .addComponent(txtni_tecni23, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel168, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtanio_tecni23, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(anio_tecni23))
                        .addGap(0, 0, 0)
                        .addComponent(jLabel165, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0)
                .addComponent(jLabel166, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addComponent(jLabel171)
                            .addGap(571, 571, 571)
                            .addComponent(jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jCheckBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(txtfamiliape1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel170, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addGap(97, 97, 97)
                            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(chbxprimaria, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel98)
                                .addComponent(suspendioestu))
                            .addGap(20, 20, 20)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addComponent(jCheckBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jCheckBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addComponent(jCheckBox5, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jCheckBox6, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chbxtecnico, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(chbxbachillerato, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                                .addComponent(chbxtecnologo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(chbxprofesional, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(chbxpostgrado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(chbxmaestria, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(chbxdoctorado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addComponent(jLabel76, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(22, 22, 22))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel76)
                .addGap(30, 30, 30)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chbxprimaria, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chbxbachillerato, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chbxtecnico, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chbxtecnologo, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chbxprofesional, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chbxpostgrado, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chbxmaestria, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jPanel26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chbxdoctorado, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addComponent(jPanel28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox5, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox6, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel98))
                .addGap(24, 24, 24)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(suspendioestu)
                    .addComponent(jCheckBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel171))
                .addGap(7, 7, 7)
                .addComponent(txtfamiliape1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel170, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        jScrollPane2.setViewportView(jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 975, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 550, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        InfoAcademica.setTecnic2("haytecni2");

        jPanel2.setVisible(true);

        jLabel14.setVisible(false);
        jLabel139.setVisible(false);
        jLabel138.setVisible(true);
    }//GEN-LAST:event_jLabel14MouseClicked

    private void chbxdoctoradoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chbxdoctoradoItemStateChanged
        if (chbxdoctorado.isSelected()) {
            InfoAcademica.setDocto1("haydocto");
            jPanel27.setVisible(true);
            jLabel163.setVisible(true);
            jLabel164.setVisible(false);

        } else {
            InfoAcademica.setDocto1("nohay");
            InfoAcademica.setDocto2("nohay");
            jPanel27.setVisible(false);
            jPanel28.setVisible(false);

        }
    }//GEN-LAST:event_chbxdoctoradoItemStateChanged

    private void txttipo_bachiCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txttipo_bachiCaretUpdate
        InfoAcademica.setBachi_tipo_institucion1(txttipo_bachi.getText());
    }//GEN-LAST:event_txttipo_bachiCaretUpdate

    private void txtnombreuniversidadCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtnombreuniversidadCaretUpdate
        InfoAcademica.setNom_institucion(txtnombreuniversidad.getText());
    }//GEN-LAST:event_txtnombreuniversidadCaretUpdate

    private void txtpa_tecniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpa_tecniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpa_tecniActionPerformed

    private void txtpa_tecniCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtpa_tecniCaretUpdate
        InfoAcademica.setTecni_programa1(txtpa_tecni.getText());
    }//GEN-LAST:event_txtpa_tecniCaretUpdate

    private void cbxjornadauniverItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxjornadauniverItemStateChanged
        InfoAcademica.setJorn_prog_acad(cbxjornadauniver.getSelectedItem().toString());
    }//GEN-LAST:event_cbxjornadauniverItemStateChanged

    private void txtnombreprogacadeCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtnombreprogacadeCaretUpdate
        InfoAcademica.setNom_prog_acad(txtnombreprogacade.getText());
    }//GEN-LAST:event_txtnombreprogacadeCaretUpdate

    private void spsemestreCaretPositionChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_spsemestreCaretPositionChanged


    }//GEN-LAST:event_spsemestreCaretPositionChanged

    private void txtexplsusestuCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtexplsusestuCaretUpdate
        InfoAcademica.setExplestadoestusus(txtexplsusestu.getText());
    }//GEN-LAST:event_txtexplsusestuCaretUpdate

    private void txtciudad_tecniCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtciudad_tecniCaretUpdate
        InfoAcademica.setTecni_ciudad_inst1(txtciudad_tecni.getText());
    }//GEN-LAST:event_txtciudad_tecniCaretUpdate

    private void txtni_tecniCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtni_tecniCaretUpdate
        InfoAcademica.setTecni_nom_institucion1(txtni_tecni.getText());
    }//GEN-LAST:event_txtni_tecniCaretUpdate

    private void txtanio_tecniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtanio_tecniKeyTyped
        int k = (int) evt.getKeyChar();

        if (k >= 32 && k < 48 || k > 57 && k != 127) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "¡Solamente se aceptan números!", "Error de datos ingresados", JOptionPane.ERROR_MESSAGE, iconThinking_uh);
        }
    }//GEN-LAST:event_txtanio_tecniKeyTyped

    private void txtanio_tecniCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtanio_tecniCaretUpdate
        InfoAcademica.setTecni_anio_inst1(txtanio_tecni.getText());
    }//GEN-LAST:event_txtanio_tecniCaretUpdate

    private void txtciudad_bachiCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtciudad_bachiCaretUpdate
        InfoAcademica.setBachi_ciudad_inst1(txtciudad_bachi.getText());
    }//GEN-LAST:event_txtciudad_bachiCaretUpdate

    private void txtni_bachiCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtni_bachiCaretUpdate
        InfoAcademica.setBachi_nom_institucion1(txtni_bachi.getText());
    }//GEN-LAST:event_txtni_bachiCaretUpdate

    private void txtanio_bachiKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtanio_bachiKeyTyped
        int k = (int) evt.getKeyChar();

        if (k >= 32 && k < 48 || k > 57 && k != 127) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "¡Solamente se aceptan números!", "Error de datos ingresados", JOptionPane.ERROR_MESSAGE, iconThinking_uh);
        }
    }//GEN-LAST:event_txtanio_bachiKeyTyped

    private void txtanio_bachiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtanio_bachiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtanio_bachiActionPerformed

    private void txtanio_bachiCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtanio_bachiCaretUpdate
        InfoAcademica.setBachi_anio_inst1(txtanio_bachi.getText());
    }//GEN-LAST:event_txtanio_bachiCaretUpdate

    private void txtanio_primariaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtanio_primariaKeyTyped
        int k = (int) evt.getKeyChar();

        if (k >= 32 && k < 48 || k > 57 && k != 127) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "¡Solamente se aceptan números!", "Error de datos ingresados", JOptionPane.ERROR_MESSAGE, iconThinking_uh);
        }
    }//GEN-LAST:event_txtanio_primariaKeyTyped

    private void txtanio_primariaCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtanio_primariaCaretUpdate
        InfoAcademica.setPrim_anio_inst1(txtanio_primaria.getText());
    }//GEN-LAST:event_txtanio_primariaCaretUpdate

    private void txtciudad_primariaCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtciudad_primariaCaretUpdate
        InfoAcademica.setPrim_ciudad_inst1(txtciudad_primaria.getText());
    }//GEN-LAST:event_txtciudad_primariaCaretUpdate

    private void txtni_primariaCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtni_primariaCaretUpdate
        InfoAcademica.setPrim_nom_institucion1(txtni_primaria.getText());
    }//GEN-LAST:event_txtni_primariaCaretUpdate

    private void chbxpostgradoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chbxpostgradoItemStateChanged
        if (chbxpostgrado.isSelected()) {
            InfoAcademica.setPoste1("haypost");
            jPanel18.setVisible(true);
            jLabel27.setVisible(true);
            jLabel151.setVisible(false);

        } else {
            InfoAcademica.setPoste1("nohay");
            InfoAcademica.setPoste2("nohay");
            InfoAcademica.setPoste3("nohay");
            InfoAcademica.setPoste4("nohay");
            InfoAcademica.setPoste5("nohay");
            jPanel18.setVisible(false);
            jPanel19.setVisible(false);
            jPanel20.setVisible(false);
            jPanel21.setVisible(false);
            jPanel22.setVisible(false);
        }
    }//GEN-LAST:event_chbxpostgradoItemStateChanged

    private void chbxmaestriaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chbxmaestriaItemStateChanged
        if (chbxmaestria.isSelected()) {
            InfoAcademica.setMaestr1("haymaes");
            jPanel23.setVisible(true);
            jLabel121.setVisible(true);
            jLabel156.setVisible(false);

        } else {
            InfoAcademica.setMaestr1("nohay");
            InfoAcademica.setMaestr2("nohay");
            InfoAcademica.setMaestr3("nohay");
            InfoAcademica.setMaestr4("nohay");
            jPanel23.setVisible(false);
            jPanel24.setVisible(false);
            jPanel25.setVisible(false);
            jPanel26.setVisible(false);
        }
    }//GEN-LAST:event_chbxmaestriaItemStateChanged

    private void chbxprofesionalItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chbxprofesionalItemStateChanged

        if (chbxprofesional.isSelected()) {
            InfoAcademica.setProfes1("hayprof");
            jPanel13.setVisible(true);
            jLabel22.setVisible(true);
            jLabel146.setVisible(false);
        } else {
            InfoAcademica.setProfes1("nohay");
            InfoAcademica.setProfes2("nohay");
            InfoAcademica.setProfes3("nohay");
            InfoAcademica.setProfes4("nohay");
            InfoAcademica.setProfes5("nohay");
            jPanel13.setVisible(false);
            jPanel14.setVisible(false);
            jPanel15.setVisible(false);
            jPanel16.setVisible(false);
            jPanel17.setVisible(false);
        }
    }//GEN-LAST:event_chbxprofesionalItemStateChanged

    private void chbxtecnologoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chbxtecnologoItemStateChanged
        if (chbxtecnologo.isSelected()) {
            InfoAcademica.setTecnol1("haytecno");
            jPanel9.setVisible(true);
            jLabel142.setVisible(false);
        } else {
            InfoAcademica.setTecnol1("nohay");
            InfoAcademica.setTecnol2("nohay");
            InfoAcademica.setTecnol3("nohay");
            InfoAcademica.setTecnol4("nohay");
            jPanel9.setVisible(false);
            jPanel10.setVisible(false);
            jPanel11.setVisible(false);
            jPanel12.setVisible(false);
        }
    }//GEN-LAST:event_chbxtecnologoItemStateChanged

    private void chbxtecnicoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chbxtecnicoItemStateChanged
        if (chbxtecnico.isSelected()) {
            InfoAcademica.setTecnic1("haytecni");
            jPanel1.setVisible(true);
            pa_tecni.setVisible(true);
            txtpa_tecni.setVisible(true);
            jLabel34.setVisible(true);
            ni_tecni.setVisible(true);
            txtni_tecni.setVisible(true);
            jLabel55.setVisible(true);
            ciudad_tecni.setVisible(true);
            txtciudad_tecni.setVisible(true);
            jLabel35.setVisible(true);
            anio_tecni.setVisible(true);
            txtanio_tecni.setVisible(true);
            jLabel45.setVisible(true);

            jLabel14.setVisible(true);
        } else {
            InfoAcademica.setTecnic1("nohay");
            InfoAcademica.setTecnic2("nohay");
            InfoAcademica.setTecnic3("nohay");
            InfoAcademica.setTecnic4("nohay");
            jPanel1.setVisible(false);
            pa_tecni.setVisible(false);
            txtpa_tecni.setVisible(false);
            jLabel34.setVisible(false);
            ni_tecni.setVisible(false);
            txtni_tecni.setVisible(false);
            jLabel55.setVisible(false);
            ciudad_tecni.setVisible(false);
            txtciudad_tecni.setVisible(false);
            jLabel35.setVisible(false);
            anio_tecni.setVisible(false);
            txtanio_tecni.setVisible(false);
            jLabel45.setVisible(false);
            jLabel14.setVisible(false);

            //espacios
            jPanel1.setVisible(false);
            jPanel2.setVisible(false);
            jPanel3.setVisible(false);
            jPanel8.setVisible(false);
            jLabel138.setVisible(false);
        }
    }//GEN-LAST:event_chbxtecnicoItemStateChanged

    private void chbxbachilleratoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chbxbachilleratoItemStateChanged
        if (chbxbachillerato.isSelected()) {
            InfoAcademica.setBachille("haybachi");
            jLabel32.setVisible(true);
            jLabel54.setVisible(true);
            jLabel33.setVisible(true);
            jLabel60.setVisible(true);
            tipo_bachi.setVisible(true);
            txttipo_bachi.setVisible(true);
            ni_bachi.setVisible(true);
            txtni_bachi.setVisible(true);
            ciudad_bachi.setVisible(true);
            txtciudad_bachi.setVisible(true);
            anio_bachi.setVisible(true);
            txtanio_bachi.setVisible(true);
            jPanel6.setVisible(true);
        } else {
            InfoAcademica.setBachille("nohay");
            jLabel32.setVisible(false);
            jLabel54.setVisible(false);
            jLabel33.setVisible(false);
            jLabel60.setVisible(false);
            tipo_bachi.setVisible(false);
            txttipo_bachi.setVisible(false);
            ni_bachi.setVisible(false);
            txtni_bachi.setVisible(false);
            ciudad_bachi.setVisible(false);
            txtciudad_bachi.setVisible(false);
            anio_bachi.setVisible(false);
            txtanio_bachi.setVisible(false);
            jPanel6.setVisible(false);
        }
    }//GEN-LAST:event_chbxbachilleratoItemStateChanged

    private void chbxprimariaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chbxprimariaItemStateChanged
        if (chbxprimaria.isSelected()) {
            InfoAcademica.setPrimari("hayprim");
            ni_primaria.setVisible(true);
            txtni_primaria.setVisible(true);
            ciudad_primaria.setVisible(true);
            txtciudad_primaria.setVisible(true);
            anio_primaria.setVisible(true);
            txtanio_primaria.setVisible(true);
            jLabel29.setVisible(true);
            jLabel30.setVisible(true);
            jLabel31.setVisible(true);
            jPanel7.setVisible(true);
        } else {
            InfoAcademica.setPrimari("nohay");
            ni_primaria.setVisible(false);
            txtni_primaria.setVisible(false);
            ciudad_primaria.setVisible(false);
            txtciudad_primaria.setVisible(false);
            anio_primaria.setVisible(false);
            txtanio_primaria.setVisible(false);
            jLabel29.setVisible(false);
            jLabel30.setVisible(false);
            jLabel31.setVisible(false);
            jPanel7.setVisible(false);
        }
    }//GEN-LAST:event_chbxprimariaItemStateChanged

    private void spsemestrePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_spsemestrePropertyChange
        InfoAcademica.setNo_semestre(spsemestre.getValue().toString());
    }//GEN-LAST:event_spsemestrePropertyChange

    private void txtnombreuniversidad1CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtnombreuniversidad1CaretUpdate
        InfoAcademica.setAniosuspension(txtnombreuniversidad1.getText());
    }//GEN-LAST:event_txtnombreuniversidad1CaretUpdate

    private void txtfamiliape1CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtfamiliape1CaretUpdate
        InfoAcademica.setAdmisionInfoAcademica(txtfamiliape1.getText());
    }//GEN-LAST:event_txtfamiliape1CaretUpdate

    private void jCheckBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox1ItemStateChanged
        if (jCheckBox1.isSelected()) {
            jCheckBox2.setSelected(false);
            txtfamiliape1.setVisible(true);
            jLabel170.setVisible(true);
            Admisiones.setAdmInfoAca("hay");
        } else {
            txtfamiliape1.setVisible(false);
            jLabel170.setVisible(false);
            Admisiones.setAdmInfoAca("nohay");
        }
    }//GEN-LAST:event_jCheckBox1ItemStateChanged

    private void jCheckBox2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox2ItemStateChanged
        if (jCheckBox2.isSelected()) {
            jCheckBox1.setSelected(false);
            txtfamiliape1.setVisible(false);
            jLabel170.setVisible(false);
            Admisiones.setAdmInfoAca("nohay");
        }
    }//GEN-LAST:event_jCheckBox2ItemStateChanged

    private void jCheckBox3ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox3ItemStateChanged
        if (jCheckBox3.isSelected()) {
            jPanel5.setVisible(true);
            jCheckBox4.setSelected(false);
            InfoAcademica.setEstadoestusus("Sí");
            jLabel56.setVisible(true);
            jLabel57.setVisible(true);
            jLabel58.setVisible(true);
            jLabel59.setVisible(true);
            txtexplsusestu.setVisible(true);
            nosemestre.setVisible(true);
            spsemestre.setVisible(true);
            nombreprogacade.setVisible(true);
            txtnombreprogacade.setVisible(true);
            nombreuniversidad.setVisible(true);
            txtnombreuniversidad.setVisible(true);
            ciudaduniversidad.setVisible(true);
            txtciudaduniversidad.setVisible(true);
            jornadauniversidad.setVisible(true);
            cbxjornadauniver.setVisible(true);
            nombreuniversidad1.setVisible(true);
            txtnombreuniversidad1.setVisible(true);
            jLabel169.setVisible(true);
            ciudaduniversidad1.setVisible(true);
        } else {
            jPanel5.setVisible(false);
            InfoAcademica.setEstadoestusus("-");
            jLabel56.setVisible(false);
            jLabel57.setVisible(false);
            jLabel58.setVisible(false);
            jLabel59.setVisible(false);
            txtexplsusestu.setVisible(false);
            nosemestre.setVisible(false);
            spsemestre.setVisible(false);
            nombreprogacade.setVisible(false);
            txtnombreprogacade.setVisible(false);
            nombreuniversidad.setVisible(false);
            txtnombreuniversidad.setVisible(false);
            ciudaduniversidad.setVisible(false);
            txtciudaduniversidad.setVisible(false);
            jornadauniversidad.setVisible(false);
            cbxjornadauniver.setVisible(false);
            nombreuniversidad1.setVisible(false);
            txtnombreuniversidad1.setVisible(false);
            jLabel169.setVisible(false);
            ciudaduniversidad1.setVisible(false);
        }
    }//GEN-LAST:event_jCheckBox3ItemStateChanged

    private void jCheckBox5ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox5ItemStateChanged
        if (jCheckBox5.isSelected()) {
            jPanel5.setVisible(true);
            suspendioestu.setVisible(false);
            jCheckBox3.setVisible(false);
            jCheckBox3.setSelected(false);
            jCheckBox4.setVisible(false);
            jCheckBox4.setSelected(false);
            InfoAcademica.setEstaestudiando("Sí");
            InfoAcademica.setEstadoestusus("No");
          
            jCheckBox6.setSelected(false);
            jLabel56.setVisible(false);
            jLabel57.setVisible(true);
            jLabel58.setVisible(true);
            jLabel59.setVisible(true);
//            cbxsuspendioes.setVisible(false);
            nosemestre.setVisible(true);
            spsemestre.setVisible(true);
            nombreprogacade.setVisible(true);
            txtnombreprogacade.setVisible(true);
            nombreuniversidad.setVisible(true);
            txtnombreuniversidad.setVisible(true);
            ciudaduniversidad.setVisible(true);
            txtciudaduniversidad.setVisible(true);
            jornadauniversidad.setVisible(true);
            cbxjornadauniver.setVisible(true);
            nombreuniversidad1.setVisible(false);
            txtnombreuniversidad1.setVisible(false);
            jLabel169.setVisible(false);
            ciudaduniversidad1.setVisible(false);
        } else {
            suspendioestu.setVisible(false);
            jCheckBox3.setVisible(false);
            jCheckBox3.setSelected(false);
            jCheckBox4.setVisible(false);
            jCheckBox4.setSelected(false);
            nombreuniversidad1.setVisible(false);
            txtnombreuniversidad1.setVisible(false);
            jLabel169.setVisible(false);
            ciudaduniversidad1.setVisible(false);
            InfoAcademica.setEstaestudiando("-");
            jLabel56.setVisible(false);
            jLabel57.setVisible(false);
            jLabel58.setVisible(false);
            jLabel59.setVisible(false);
//            cbxsuspendioes.setVisible(true);
            txtexplsusestu.setVisible(false);
            nosemestre.setVisible(false);
            spsemestre.setVisible(false);
            nombreprogacade.setVisible(false);
            txtnombreprogacade.setVisible(false);
            nombreuniversidad.setVisible(false);
            txtnombreuniversidad.setVisible(false);
            ciudaduniversidad.setVisible(false);
            txtciudaduniversidad.setVisible(false);
            jornadauniversidad.setVisible(false);
            cbxjornadauniver.setVisible(false);
            jPanel5.setVisible(false);
        }
    }//GEN-LAST:event_jCheckBox5ItemStateChanged

    private void jCheckBox6ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox6ItemStateChanged
        if (jCheckBox6.isSelected()) {
            suspendioestu.setVisible(true);
            jCheckBox3.setVisible(true);
            jCheckBox3.setSelected(false);
            jCheckBox4.setVisible(true);
            jCheckBox4.setSelected(false);
            jPanel5.setVisible(false);
            jCheckBox5.setSelected(false);
            nombreuniversidad1.setVisible(false);
            txtnombreuniversidad1.setVisible(false);
            jLabel169.setVisible(false);
            ciudaduniversidad1.setVisible(false);
            InfoAcademica.setEstaestudiando("No");
            jLabel56.setVisible(false);
            jLabel57.setVisible(false);
            jLabel58.setVisible(false);
            jLabel59.setVisible(false);
//            cbxsuspendioes.setVisible(true);
            txtexplsusestu.setVisible(false);
            nosemestre.setVisible(false);
            spsemestre.setVisible(false);
            nombreprogacade.setVisible(false);
            txtnombreprogacade.setVisible(false);
            nombreuniversidad.setVisible(false);
            txtnombreuniversidad.setVisible(false);
            ciudaduniversidad.setVisible(false);
            txtciudaduniversidad.setVisible(false);
            jornadauniversidad.setVisible(false);
            cbxjornadauniver.setVisible(false);
        } else {
            suspendioestu.setVisible(false);
            jCheckBox3.setVisible(false);
            jCheckBox3.setSelected(false);
            jCheckBox4.setVisible(false);
            jCheckBox4.setSelected(false);
            jPanel5.setVisible(false);
            nombreuniversidad1.setVisible(false);
            txtnombreuniversidad1.setVisible(false);
            jLabel169.setVisible(false);
            ciudaduniversidad1.setVisible(false);
            InfoAcademica.setEstaestudiando("-");
            jLabel56.setVisible(false);
            jLabel57.setVisible(false);
            jLabel58.setVisible(false);
            jLabel59.setVisible(false);
//            cbxsuspendioes.setVisible(true);
            txtexplsusestu.setVisible(false);
            nosemestre.setVisible(false);
            spsemestre.setVisible(false);
            nombreprogacade.setVisible(false);
            txtnombreprogacade.setVisible(false);
            nombreuniversidad.setVisible(false);
            txtnombreuniversidad.setVisible(false);
            ciudaduniversidad.setVisible(false);
            txtciudaduniversidad.setVisible(false);
            jornadauniversidad.setVisible(false);
            cbxjornadauniver.setVisible(false);
        }


    }//GEN-LAST:event_jCheckBox6ItemStateChanged

    private void spsemestreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_spsemestreKeyTyped
        int k = (int) evt.getKeyChar();

        if (k >= 32 && k < 48 || k > 57 && k != 127) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "¡Solamente se aceptan números!", "Error de datos ingresados", JOptionPane.ERROR_MESSAGE, iconThinking_uh);
        }
        InputMap map = spsemestre.getInputMap(JTextField.WHEN_FOCUSED);
//        map.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, CTRL_MASK), "null");
    }//GEN-LAST:event_spsemestreKeyTyped

    private void jLabel138MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel138MouseClicked
        InfoAcademica.setTecnic2("nohay");

        jPanel2.setVisible(false);

        jLabel14.setVisible(true);
        jLabel138.setVisible(false);
    }//GEN-LAST:event_jLabel138MouseClicked

    private void txtnombreprogacadeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnombreprogacadeKeyTyped
        int k = (int) evt.getKeyChar();
        if (k == 39) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "¡No se acepta ese tipo de carácter!", "Error de datos ingresados", JOptionPane.ERROR_MESSAGE, iconThinking_uh);
        }
        InputMap map = txtnombreprogacade.getInputMap(JTextField.WHEN_FOCUSED);
//        map.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, CTRL_MASK), "null");
    }//GEN-LAST:event_txtnombreprogacadeKeyTyped

    private void txtnombreuniversidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnombreuniversidadKeyTyped
        int k = (int) evt.getKeyChar();
        if (k == 39) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "¡No se acepta ese tipo de carácter!", "Error de datos ingresados", JOptionPane.ERROR_MESSAGE, iconThinking_uh);
        }
        InputMap map = txtnombreuniversidad.getInputMap(JTextField.WHEN_FOCUSED);
//        map.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, CTRL_MASK), "null");
    }//GEN-LAST:event_txtnombreuniversidadKeyTyped

    private void txtexplsusestuKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtexplsusestuKeyTyped
        int k = (int) evt.getKeyChar();
        if (k == 39) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "¡No se acepta ese tipo de carácter!", "Error de datos ingresados", JOptionPane.ERROR_MESSAGE, iconThinking_uh);
        }
        InputMap map = txtexplsusestu.getInputMap(JTextField.WHEN_FOCUSED);
//        map.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, CTRL_MASK), "null");
    }//GEN-LAST:event_txtexplsusestuKeyTyped

    private void txtfamiliape1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtfamiliape1KeyTyped
        int k = (int) evt.getKeyChar();
        if (k == 39) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "¡No se acepta ese tipo de carácter!", "Error de datos ingresados", JOptionPane.ERROR_MESSAGE, iconThinking_uh);
        }
        InputMap map = txtfamiliape1.getInputMap(JTextField.WHEN_FOCUSED);
//        map.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, CTRL_MASK), "null");
    }//GEN-LAST:event_txtfamiliape1KeyTyped

    private void txtni_primariaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtni_primariaKeyTyped
        int k = (int) evt.getKeyChar();
        if (k == 39) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "¡No se acepta ese tipo de carácter!", "Error de datos ingresados", JOptionPane.ERROR_MESSAGE, iconThinking_uh);
        }
    }//GEN-LAST:event_txtni_primariaKeyTyped

    private void txtciudad_primariaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtciudad_primariaKeyTyped
        int k = (int) evt.getKeyChar();
        if (k == 39) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "¡No se acepta ese tipo de carácter!", "Error de datos ingresados", JOptionPane.ERROR_MESSAGE, iconThinking_uh);
        }
    }//GEN-LAST:event_txtciudad_primariaKeyTyped

    private void txttipo_bachiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttipo_bachiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttipo_bachiActionPerformed

    private void txttipo_bachiKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttipo_bachiKeyTyped
        int k = (int) evt.getKeyChar();
        if (k == 39) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "¡No se acepta ese tipo de carácter!", "Error de datos ingresados", JOptionPane.ERROR_MESSAGE, iconThinking_uh);
        }
    }//GEN-LAST:event_txttipo_bachiKeyTyped

    private void txtni_bachiKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtni_bachiKeyTyped
        int k = (int) evt.getKeyChar();
        if (k == 39) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "¡No se acepta ese tipo de carácter!", "Error de datos ingresados", JOptionPane.ERROR_MESSAGE, iconThinking_uh);
        }
    }//GEN-LAST:event_txtni_bachiKeyTyped

    private void txtciudad_bachiKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtciudad_bachiKeyTyped
        int k = (int) evt.getKeyChar();
        if (k == 39) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "¡No se acepta ese tipo de carácter!", "Error de datos ingresados", JOptionPane.ERROR_MESSAGE, iconThinking_uh);
        }
    }//GEN-LAST:event_txtciudad_bachiKeyTyped

    private void txtpa_tecniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpa_tecniKeyTyped
        int k = (int) evt.getKeyChar();
        if (k == 39) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "¡No se acepta ese tipo de carácter!", "Error de datos ingresados", JOptionPane.ERROR_MESSAGE, iconThinking_uh);
        }
    }//GEN-LAST:event_txtpa_tecniKeyTyped

    private void txtni_tecniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtni_tecniKeyTyped
        int k = (int) evt.getKeyChar();
        if (k == 39) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "¡No se acepta ese tipo de carácter!", "Error de datos ingresados", JOptionPane.ERROR_MESSAGE, iconThinking_uh);
        }
    }//GEN-LAST:event_txtni_tecniKeyTyped

    private void txtnombreuniversidad1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombreuniversidad1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnombreuniversidad1ActionPerformed

    private void txtnombreuniversidad1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnombreuniversidad1KeyTyped
        int k = (int) evt.getKeyChar();

        if (k >= 32 && k < 48 || k > 57 && k != 127) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "¡Solamente se aceptan números!", "Error de datos ingresados", JOptionPane.ERROR_MESSAGE, iconThinking_uh);
        }
        InputMap map = txtnombreuniversidad1.getInputMap(JTextField.WHEN_FOCUSED);
//        map.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, CTRL_MASK), "null");
    }//GEN-LAST:event_txtnombreuniversidad1KeyTyped

    private void txtciudaduniversidadCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtciudaduniversidadCaretUpdate
        InfoAcademica.setCiudad_inst(txtciudaduniversidad.getText());
    }//GEN-LAST:event_txtciudaduniversidadCaretUpdate

    private void txtciudaduniversidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtciudaduniversidadKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtciudaduniversidadKeyTyped

    private void txtciudad_tecniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtciudad_tecniKeyTyped
        int k = (int) evt.getKeyChar();
        if (k == 39) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "¡No se acepta ese tipo de carácter!", "Error de datos ingresados", JOptionPane.ERROR_MESSAGE, iconThinking_uh);
        }
    }//GEN-LAST:event_txtciudad_tecniKeyTyped

    private void txtanio_tecni1CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtanio_tecni1CaretUpdate
        InfoAcademica.setTecni_anio_inst2(txtanio_tecni1.getText());
    }//GEN-LAST:event_txtanio_tecni1CaretUpdate

    private void txtanio_tecni1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtanio_tecni1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtanio_tecni1KeyTyped

    private void txtciudad_tecni1CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtciudad_tecni1CaretUpdate
        InfoAcademica.setTecni_ciudad_inst2(txtciudad_tecni1.getText());
    }//GEN-LAST:event_txtciudad_tecni1CaretUpdate

    private void txtciudad_tecni1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtciudad_tecni1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtciudad_tecni1KeyTyped

    private void txtpa_tecni1CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtpa_tecni1CaretUpdate
        InfoAcademica.setTecni_programa2(txtpa_tecni1.getText());
    }//GEN-LAST:event_txtpa_tecni1CaretUpdate

    private void txtpa_tecni1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpa_tecni1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpa_tecni1ActionPerformed

    private void txtpa_tecni1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpa_tecni1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpa_tecni1KeyTyped

    private void txtni_tecni1CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtni_tecni1CaretUpdate
        InfoAcademica.setTecni_nom_institucion2(txtni_tecni1.getText());
    }//GEN-LAST:event_txtni_tecni1CaretUpdate

    private void txtni_tecni1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtni_tecni1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtni_tecni1KeyTyped

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        InfoAcademica.setTecnic3("haytecni3");

        jPanel3.setVisible(true);

        jLabel15.setVisible(false);
        jLabel139.setVisible(true);
        jLabel138.setVisible(false);
        jLabel140.setVisible(false);
    }//GEN-LAST:event_jLabel15MouseClicked

    private void jLabel139MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel139MouseClicked
        InfoAcademica.setTecnic3("nohay");

        jPanel3.setVisible(false);

        jLabel15.setVisible(true);
        jLabel138.setVisible(true);
        jLabel139.setVisible(false);
    }//GEN-LAST:event_jLabel139MouseClicked

    private void txtanio_tecni2CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtanio_tecni2CaretUpdate
        InfoAcademica.setTecni_anio_inst3(txtanio_tecni2.getText());
    }//GEN-LAST:event_txtanio_tecni2CaretUpdate

    private void txtanio_tecni2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtanio_tecni2KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtanio_tecni2KeyTyped

    private void txtciudad_tecni2CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtciudad_tecni2CaretUpdate
        InfoAcademica.setTecni_ciudad_inst3(txtciudad_tecni2.getText());
    }//GEN-LAST:event_txtciudad_tecni2CaretUpdate

    private void txtciudad_tecni2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtciudad_tecni2KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtciudad_tecni2KeyTyped

    private void txtpa_tecni2CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtpa_tecni2CaretUpdate
        InfoAcademica.setTecni_programa3(txtpa_tecni2.getText());
    }//GEN-LAST:event_txtpa_tecni2CaretUpdate

    private void txtpa_tecni2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpa_tecni2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpa_tecni2ActionPerformed

    private void txtpa_tecni2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpa_tecni2KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpa_tecni2KeyTyped

    private void txtni_tecni2CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtni_tecni2CaretUpdate
        InfoAcademica.setTecni_nom_institucion3(txtni_tecni2.getText());
    }//GEN-LAST:event_txtni_tecni2CaretUpdate

    private void txtni_tecni2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtni_tecni2KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtni_tecni2KeyTyped

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
        InfoAcademica.setTecnic4("haytecni4");

        jPanel8.setVisible(true);

        jLabel16.setVisible(false);
        jLabel140.setVisible(true);
        jLabel139.setVisible(false);
    }//GEN-LAST:event_jLabel16MouseClicked

    private void jLabel140MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel140MouseClicked
        InfoAcademica.setTecnic4("nohay");

        jPanel8.setVisible(false);

        jLabel16.setVisible(true);
        jLabel139.setVisible(true);
        jLabel140.setVisible(false);
    }//GEN-LAST:event_jLabel140MouseClicked

    private void txtanio_tecni3CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtanio_tecni3CaretUpdate
        InfoAcademica.setTecni_anio_inst4(txtanio_tecni3.getText());
    }//GEN-LAST:event_txtanio_tecni3CaretUpdate

    private void txtanio_tecni3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtanio_tecni3KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtanio_tecni3KeyTyped

    private void txtciudad_tecni3CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtciudad_tecni3CaretUpdate
        InfoAcademica.setTecni_ciudad_inst4(txtciudad_tecni3.getText());
    }//GEN-LAST:event_txtciudad_tecni3CaretUpdate

    private void txtciudad_tecni3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtciudad_tecni3KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtciudad_tecni3KeyTyped

    private void txtpa_tecni3CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtpa_tecni3CaretUpdate
        InfoAcademica.setTecni_programa4(txtpa_tecni3.getText());
    }//GEN-LAST:event_txtpa_tecni3CaretUpdate

    private void txtpa_tecni3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpa_tecni3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpa_tecni3ActionPerformed

    private void txtpa_tecni3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpa_tecni3KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpa_tecni3KeyTyped

    private void txtni_tecni3CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtni_tecni3CaretUpdate
        InfoAcademica.setTecni_nom_institucion4(txtni_tecni3.getText());
    }//GEN-LAST:event_txtni_tecni3CaretUpdate

    private void txtni_tecni3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtni_tecni3KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtni_tecni3KeyTyped

    private void txtanio_tecni4CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtanio_tecni4CaretUpdate
        InfoAcademica.setTecno_anio_inst1(txtanio_tecni4.getText());
    }//GEN-LAST:event_txtanio_tecni4CaretUpdate

    private void txtanio_tecni4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtanio_tecni4KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtanio_tecni4KeyTyped

    private void txtciudad_tecni4CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtciudad_tecni4CaretUpdate
        InfoAcademica.setTecno_ciudad_inst1(txtciudad_tecni4.getText());
    }//GEN-LAST:event_txtciudad_tecni4CaretUpdate

    private void txtciudad_tecni4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtciudad_tecni4KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtciudad_tecni4KeyTyped

    private void txtpa_tecni4CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtpa_tecni4CaretUpdate
        InfoAcademica.setTecno_programa1(txtpa_tecni4.getText());
    }//GEN-LAST:event_txtpa_tecni4CaretUpdate

    private void txtpa_tecni4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpa_tecni4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpa_tecni4ActionPerformed

    private void txtpa_tecni4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpa_tecni4KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpa_tecni4KeyTyped

    private void txtni_tecni4CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtni_tecni4CaretUpdate
        InfoAcademica.setTecno_nom_institucion1(txtni_tecni4.getText());
    }//GEN-LAST:event_txtni_tecni4CaretUpdate

    private void txtni_tecni4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtni_tecni4KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtni_tecni4KeyTyped

    private void jLabel18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseClicked
        InfoAcademica.setTecnol2("haytecno2");

        jPanel10.setVisible(true);

        jLabel18.setVisible(false);
        jLabel143.setVisible(false);
        jLabel142.setVisible(true);
    }//GEN-LAST:event_jLabel18MouseClicked

    private void jLabel142MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel142MouseClicked
        InfoAcademica.setTecnol2("nohay");

        jPanel10.setVisible(false);

        jLabel18.setVisible(true);
        jLabel143.setVisible(true);
        jLabel142.setVisible(false);
    }//GEN-LAST:event_jLabel142MouseClicked

    private void txtanio_tecni5CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtanio_tecni5CaretUpdate
        InfoAcademica.setTecno_anio_inst2(txtanio_tecni5.getText());
    }//GEN-LAST:event_txtanio_tecni5CaretUpdate

    private void txtanio_tecni5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtanio_tecni5KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtanio_tecni5KeyTyped

    private void txtciudad_tecni5CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtciudad_tecni5CaretUpdate
        InfoAcademica.setTecno_ciudad_inst2(txtciudad_tecni5.getText());
    }//GEN-LAST:event_txtciudad_tecni5CaretUpdate

    private void txtciudad_tecni5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtciudad_tecni5KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtciudad_tecni5KeyTyped

    private void txtpa_tecni5CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtpa_tecni5CaretUpdate
        InfoAcademica.setTecno_programa2(txtpa_tecni5.getText());
    }//GEN-LAST:event_txtpa_tecni5CaretUpdate

    private void txtpa_tecni5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpa_tecni5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpa_tecni5ActionPerformed

    private void txtpa_tecni5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpa_tecni5KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpa_tecni5KeyTyped

    private void txtni_tecni5CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtni_tecni5CaretUpdate
        InfoAcademica.setTecno_nom_institucion2(txtni_tecni5.getText());
    }//GEN-LAST:event_txtni_tecni5CaretUpdate

    private void txtni_tecni5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtni_tecni5KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtni_tecni5KeyTyped

    private void jLabel19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseClicked
        InfoAcademica.setTecnol3("haytecno3");

        jPanel11.setVisible(true);

        jLabel19.setVisible(false);
        jLabel142.setVisible(false);
        jLabel143.setVisible(true);
        jLabel144.setVisible(false);
    }//GEN-LAST:event_jLabel19MouseClicked

    private void jLabel143MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel143MouseClicked
        InfoAcademica.setTecnol3("nohay");

        jPanel11.setVisible(false);

        jLabel19.setVisible(true);
        jLabel142.setVisible(true);
        jLabel143.setVisible(false);
        jLabel144.setVisible(true);
    }//GEN-LAST:event_jLabel143MouseClicked

    private void txtanio_tecni6CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtanio_tecni6CaretUpdate
        InfoAcademica.setTecno_anio_inst3(txtanio_tecni6.getText());
    }//GEN-LAST:event_txtanio_tecni6CaretUpdate

    private void txtanio_tecni6KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtanio_tecni6KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtanio_tecni6KeyTyped

    private void txtciudad_tecni6CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtciudad_tecni6CaretUpdate
        InfoAcademica.setTecno_ciudad_inst3(txtciudad_tecni6.getText());
    }//GEN-LAST:event_txtciudad_tecni6CaretUpdate

    private void txtciudad_tecni6KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtciudad_tecni6KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtciudad_tecni6KeyTyped

    private void txtpa_tecni6CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtpa_tecni6CaretUpdate
        InfoAcademica.setTecno_programa3(txtpa_tecni6.getText());
    }//GEN-LAST:event_txtpa_tecni6CaretUpdate

    private void txtpa_tecni6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpa_tecni6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpa_tecni6ActionPerformed

    private void txtpa_tecni6KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpa_tecni6KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpa_tecni6KeyTyped

    private void txtni_tecni6CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtni_tecni6CaretUpdate
        InfoAcademica.setTecno_nom_institucion3(txtni_tecni6.getText());
    }//GEN-LAST:event_txtni_tecni6CaretUpdate

    private void txtni_tecni6KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtni_tecni6KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtni_tecni6KeyTyped

    private void jLabel20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseClicked
        InfoAcademica.setTecnol4("haytecno4");

        jPanel12.setVisible(true);

        jLabel20.setVisible(false);
        jLabel143.setVisible(false);
        jLabel144.setVisible(true);
    }//GEN-LAST:event_jLabel20MouseClicked

    private void jLabel144MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel144MouseClicked
        InfoAcademica.setTecnol4("nohay");

        jPanel12.setVisible(false);

        jLabel20.setVisible(true);
        jLabel143.setVisible(true);
        jLabel144.setVisible(false);
    }//GEN-LAST:event_jLabel144MouseClicked

    private void txtanio_tecni7CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtanio_tecni7CaretUpdate
        InfoAcademica.setTecno_anio_inst4(txtanio_tecni7.getText());
    }//GEN-LAST:event_txtanio_tecni7CaretUpdate

    private void txtanio_tecni7KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtanio_tecni7KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtanio_tecni7KeyTyped

    private void txtciudad_tecni7CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtciudad_tecni7CaretUpdate
        InfoAcademica.setTecno_ciudad_inst4(txtciudad_tecni7.getText());
    }//GEN-LAST:event_txtciudad_tecni7CaretUpdate

    private void txtciudad_tecni7KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtciudad_tecni7KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtciudad_tecni7KeyTyped

    private void txtpa_tecni7CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtpa_tecni7CaretUpdate
        InfoAcademica.setTecno_programa4(txtpa_tecni7.getText());
    }//GEN-LAST:event_txtpa_tecni7CaretUpdate

    private void txtpa_tecni7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpa_tecni7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpa_tecni7ActionPerformed

    private void txtpa_tecni7KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpa_tecni7KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpa_tecni7KeyTyped

    private void txtni_tecni7CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtni_tecni7CaretUpdate
        InfoAcademica.setTecno_nom_institucion4(txtni_tecni7.getText());
    }//GEN-LAST:event_txtni_tecni7CaretUpdate

    private void txtni_tecni7KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtni_tecni7KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtni_tecni7KeyTyped

    private void txtanio_tecni8CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtanio_tecni8CaretUpdate
        InfoAcademica.setProfe_anio_inst1(txtanio_tecni8.getText());
    }//GEN-LAST:event_txtanio_tecni8CaretUpdate

    private void txtanio_tecni8KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtanio_tecni8KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtanio_tecni8KeyTyped

    private void txtciudad_tecni8CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtciudad_tecni8CaretUpdate
        InfoAcademica.setProfe_ciudad_inst1(txtciudad_tecni8.getText());
    }//GEN-LAST:event_txtciudad_tecni8CaretUpdate

    private void txtciudad_tecni8KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtciudad_tecni8KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtciudad_tecni8KeyTyped

    private void txtpa_tecni8CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtpa_tecni8CaretUpdate
        InfoAcademica.setProfe_programa1(txtpa_tecni8.getText());
    }//GEN-LAST:event_txtpa_tecni8CaretUpdate

    private void txtpa_tecni8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpa_tecni8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpa_tecni8ActionPerformed

    private void txtpa_tecni8KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpa_tecni8KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpa_tecni8KeyTyped

    private void txtni_tecni8CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtni_tecni8CaretUpdate
        InfoAcademica.setProfe_nom_institucion1(txtni_tecni8.getText());
    }//GEN-LAST:event_txtni_tecni8CaretUpdate

    private void txtni_tecni8KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtni_tecni8KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtni_tecni8KeyTyped

    private void jLabel22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel22MouseClicked
        InfoAcademica.setProfes2("hayprof2");

        jPanel14.setVisible(true);

        jLabel22.setVisible(false);
        jLabel146.setVisible(true);
        jLabel147.setVisible(false);
    }//GEN-LAST:event_jLabel22MouseClicked

    private void jLabel146MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel146MouseClicked
        InfoAcademica.setProfes2("nohay");

        jPanel14.setVisible(false);

        jLabel22.setVisible(true);
        jLabel146.setVisible(false);
        jLabel147.setVisible(true);
    }//GEN-LAST:event_jLabel146MouseClicked

    private void txtanio_tecni9CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtanio_tecni9CaretUpdate
        InfoAcademica.setProfe_anio_inst2(txtanio_tecni9.getText());
    }//GEN-LAST:event_txtanio_tecni9CaretUpdate

    private void txtanio_tecni9KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtanio_tecni9KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtanio_tecni9KeyTyped

    private void txtciudad_tecni9CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtciudad_tecni9CaretUpdate
        InfoAcademica.setProfe_ciudad_inst2(txtciudad_tecni9.getText());
    }//GEN-LAST:event_txtciudad_tecni9CaretUpdate

    private void txtciudad_tecni9KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtciudad_tecni9KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtciudad_tecni9KeyTyped

    private void txtpa_tecni9CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtpa_tecni9CaretUpdate
        InfoAcademica.setProfe_programa2(txtpa_tecni9.getText());
    }//GEN-LAST:event_txtpa_tecni9CaretUpdate

    private void txtpa_tecni9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpa_tecni9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpa_tecni9ActionPerformed

    private void txtpa_tecni9KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpa_tecni9KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpa_tecni9KeyTyped

    private void txtni_tecni9CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtni_tecni9CaretUpdate
        InfoAcademica.setProfe_nom_institucion2(txtni_tecni9.getText());
    }//GEN-LAST:event_txtni_tecni9CaretUpdate

    private void txtni_tecni9KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtni_tecni9KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtni_tecni9KeyTyped

    private void jLabel23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel23MouseClicked
        InfoAcademica.setProfes3("hayprof3");

        jPanel15.setVisible(true);

        jLabel23.setVisible(false);
        jLabel147.setVisible(true);
        jLabel148.setVisible(false);
        jLabel146.setVisible(false);
    }//GEN-LAST:event_jLabel23MouseClicked

    private void jLabel147MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel147MouseClicked
        InfoAcademica.setProfes3("nohay");

        jPanel15.setVisible(false);

        jLabel23.setVisible(true);
        jLabel147.setVisible(false);
        jLabel148.setVisible(true);
        jLabel146.setVisible(true);
    }//GEN-LAST:event_jLabel147MouseClicked

    private void txtanio_tecni10CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtanio_tecni10CaretUpdate
        InfoAcademica.setProfe_anio_inst3(txtanio_tecni10.getText());
    }//GEN-LAST:event_txtanio_tecni10CaretUpdate

    private void txtanio_tecni10KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtanio_tecni10KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtanio_tecni10KeyTyped

    private void txtciudad_tecni10CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtciudad_tecni10CaretUpdate
        InfoAcademica.setProfe_ciudad_inst3(txtciudad_tecni10.getText());
    }//GEN-LAST:event_txtciudad_tecni10CaretUpdate

    private void txtciudad_tecni10KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtciudad_tecni10KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtciudad_tecni10KeyTyped

    private void txtpa_tecni10CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtpa_tecni10CaretUpdate
        InfoAcademica.setProfe_programa3(txtpa_tecni10.getText());
    }//GEN-LAST:event_txtpa_tecni10CaretUpdate

    private void txtpa_tecni10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpa_tecni10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpa_tecni10ActionPerformed

    private void txtpa_tecni10KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpa_tecni10KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpa_tecni10KeyTyped

    private void txtni_tecni10CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtni_tecni10CaretUpdate
        InfoAcademica.setProfe_nom_institucion3(txtni_tecni10.getText());
    }//GEN-LAST:event_txtni_tecni10CaretUpdate

    private void txtni_tecni10KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtni_tecni10KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtni_tecni10KeyTyped

    private void jLabel24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel24MouseClicked
        InfoAcademica.setProfes4("hayprof4");

        jPanel16.setVisible(true);

        jLabel24.setVisible(false);
        jLabel148.setVisible(true);
        jLabel149.setVisible(false);
       jLabel147.setVisible(false);
    }//GEN-LAST:event_jLabel24MouseClicked

    private void jLabel148MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel148MouseClicked
        InfoAcademica.setProfes4("nohay");

        jPanel16.setVisible(false);

        jLabel24.setVisible(true);
        jLabel148.setVisible(false);
        jLabel149.setVisible(true);
        jLabel147.setVisible(true);
    }//GEN-LAST:event_jLabel148MouseClicked

    private void txtanio_tecni11CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtanio_tecni11CaretUpdate
        InfoAcademica.setProfe_anio_inst4(txtanio_tecni11.getText());
    }//GEN-LAST:event_txtanio_tecni11CaretUpdate

    private void txtanio_tecni11KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtanio_tecni11KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtanio_tecni11KeyTyped

    private void txtciudad_tecni11CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtciudad_tecni11CaretUpdate
        InfoAcademica.setProfe_ciudad_inst4(txtciudad_tecni11.getText());
    }//GEN-LAST:event_txtciudad_tecni11CaretUpdate

    private void txtciudad_tecni11KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtciudad_tecni11KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtciudad_tecni11KeyTyped

    private void txtpa_tecni11CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtpa_tecni11CaretUpdate
        InfoAcademica.setProfe_programa4(txtpa_tecni11.getText());
    }//GEN-LAST:event_txtpa_tecni11CaretUpdate

    private void txtpa_tecni11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpa_tecni11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpa_tecni11ActionPerformed

    private void txtpa_tecni11KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpa_tecni11KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpa_tecni11KeyTyped

    private void txtni_tecni11CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtni_tecni11CaretUpdate
        InfoAcademica.setProfe_nom_institucion4(txtni_tecni11.getText());
    }//GEN-LAST:event_txtni_tecni11CaretUpdate

    private void txtni_tecni11KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtni_tecni11KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtni_tecni11KeyTyped

    private void jLabel25MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel25MouseClicked
        InfoAcademica.setProfes5("hayprof5");

        jPanel17.setVisible(true);

        jLabel25.setVisible(false);
        jLabel147.setVisible(false);
        jLabel148.setVisible(false);
        jLabel149.setVisible(true);
    }//GEN-LAST:event_jLabel25MouseClicked

    private void jLabel149MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel149MouseClicked
        InfoAcademica.setProfes5("nohay");

        jPanel17.setVisible(false);

        jLabel25.setVisible(true);
        jLabel148.setVisible(true);
        jLabel149.setVisible(false);
    }//GEN-LAST:event_jLabel149MouseClicked

    private void txtanio_tecni12CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtanio_tecni12CaretUpdate
        InfoAcademica.setProfe_anio_inst5(txtanio_tecni12.getText());
    }//GEN-LAST:event_txtanio_tecni12CaretUpdate

    private void txtanio_tecni12KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtanio_tecni12KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtanio_tecni12KeyTyped

    private void txtciudad_tecni12CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtciudad_tecni12CaretUpdate
        InfoAcademica.setProfe_ciudad_inst5(txtciudad_tecni12.getText());
    }//GEN-LAST:event_txtciudad_tecni12CaretUpdate

    private void txtciudad_tecni12KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtciudad_tecni12KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtciudad_tecni12KeyTyped

    private void txtpa_tecni12CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtpa_tecni12CaretUpdate
        InfoAcademica.setProfe_programa5(txtpa_tecni12.getText());
    }//GEN-LAST:event_txtpa_tecni12CaretUpdate

    private void txtpa_tecni12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpa_tecni12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpa_tecni12ActionPerformed

    private void txtpa_tecni12KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpa_tecni12KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpa_tecni12KeyTyped

    private void txtni_tecni12CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtni_tecni12CaretUpdate
        InfoAcademica.setProfe_nom_institucion5(txtni_tecni12.getText());
    }//GEN-LAST:event_txtni_tecni12CaretUpdate

    private void txtni_tecni12KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtni_tecni12KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtni_tecni12KeyTyped

    private void txtanio_tecni13CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtanio_tecni13CaretUpdate
        InfoAcademica.setPost_anio_inst1(txtanio_tecni13.getText());
    }//GEN-LAST:event_txtanio_tecni13CaretUpdate

    private void txtanio_tecni13KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtanio_tecni13KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtanio_tecni13KeyTyped

    private void txtciudad_tecni13CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtciudad_tecni13CaretUpdate
        InfoAcademica.setPost_ciudad_inst1(txtciudad_tecni13.getText());
    }//GEN-LAST:event_txtciudad_tecni13CaretUpdate

    private void txtciudad_tecni13KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtciudad_tecni13KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtciudad_tecni13KeyTyped

    private void txtpa_tecni13CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtpa_tecni13CaretUpdate
        InfoAcademica.setPost_programa1(txtpa_tecni13.getText());
    }//GEN-LAST:event_txtpa_tecni13CaretUpdate

    private void txtpa_tecni13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpa_tecni13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpa_tecni13ActionPerformed

    private void txtpa_tecni13KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpa_tecni13KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpa_tecni13KeyTyped

    private void txtni_tecni13CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtni_tecni13CaretUpdate
        InfoAcademica.setPost_nom_institucion1(txtni_tecni13.getText());
    }//GEN-LAST:event_txtni_tecni13CaretUpdate

    private void txtni_tecni13KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtni_tecni13KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtni_tecni13KeyTyped

    private void jLabel27MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel27MouseClicked
        InfoAcademica.setPoste2("haypost2");
        jPanel19.setVisible(true);

        jLabel27.setVisible(false);
        jLabel151.setVisible(true);
        jLabel152.setVisible(false);
    }//GEN-LAST:event_jLabel27MouseClicked

    private void jLabel151MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel151MouseClicked
        InfoAcademica.setPoste2("nohay");
        jPanel19.setVisible(false);

        jLabel27.setVisible(true);
        jLabel151.setVisible(false);
        jLabel152.setVisible(true);
    }//GEN-LAST:event_jLabel151MouseClicked

    private void txtanio_tecni14CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtanio_tecni14CaretUpdate
        InfoAcademica.setPost_anio_inst2(txtanio_tecni14.getText());
    }//GEN-LAST:event_txtanio_tecni14CaretUpdate

    private void txtanio_tecni14KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtanio_tecni14KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtanio_tecni14KeyTyped

    private void txtciudad_tecni14CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtciudad_tecni14CaretUpdate
        InfoAcademica.setPost_ciudad_inst2(txtciudad_tecni14.getText());
    }//GEN-LAST:event_txtciudad_tecni14CaretUpdate

    private void txtciudad_tecni14KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtciudad_tecni14KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtciudad_tecni14KeyTyped

    private void txtpa_tecni14CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtpa_tecni14CaretUpdate
        InfoAcademica.setPost_programa2(txtpa_tecni14.getText());
    }//GEN-LAST:event_txtpa_tecni14CaretUpdate

    private void txtpa_tecni14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpa_tecni14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpa_tecni14ActionPerformed

    private void txtpa_tecni14KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpa_tecni14KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpa_tecni14KeyTyped

    private void txtni_tecni14CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtni_tecni14CaretUpdate
        InfoAcademica.setPost_nom_institucion2(txtni_tecni14.getText());
    }//GEN-LAST:event_txtni_tecni14CaretUpdate

    private void txtni_tecni14KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtni_tecni14KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtni_tecni14KeyTyped

    private void jLabel28MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel28MouseClicked
        InfoAcademica.setPoste3("haypost3");
        jPanel20.setVisible(true);

        jLabel28.setVisible(false);
        jLabel152.setVisible(true);
        jLabel153.setVisible(false);
        jLabel151.setVisible(false);
    }//GEN-LAST:event_jLabel28MouseClicked

    private void jLabel152MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel152MouseClicked
        InfoAcademica.setPoste3("nohay");
        jPanel20.setVisible(false);

        jLabel28.setVisible(true);
        jLabel152.setVisible(false);
        jLabel153.setVisible(true);
        jLabel151.setVisible(true);
        
    }//GEN-LAST:event_jLabel152MouseClicked

    private void txtanio_tecni15CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtanio_tecni15CaretUpdate
        InfoAcademica.setPost_anio_inst3(txtanio_tecni15.getText());
    }//GEN-LAST:event_txtanio_tecni15CaretUpdate

    private void txtanio_tecni15KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtanio_tecni15KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtanio_tecni15KeyTyped

    private void txtciudad_tecni15CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtciudad_tecni15CaretUpdate
        InfoAcademica.setPost_ciudad_inst3(txtciudad_tecni15.getText());
    }//GEN-LAST:event_txtciudad_tecni15CaretUpdate

    private void txtciudad_tecni15KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtciudad_tecni15KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtciudad_tecni15KeyTyped

    private void txtpa_tecni15CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtpa_tecni15CaretUpdate
        InfoAcademica.setPost_programa3(txtpa_tecni15.getText());
    }//GEN-LAST:event_txtpa_tecni15CaretUpdate

    private void txtpa_tecni15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpa_tecni15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpa_tecni15ActionPerformed

    private void txtpa_tecni15KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpa_tecni15KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpa_tecni15KeyTyped

    private void txtni_tecni15CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtni_tecni15CaretUpdate
        InfoAcademica.setPost_nom_institucion3(txtni_tecni15.getText());
    }//GEN-LAST:event_txtni_tecni15CaretUpdate

    private void txtni_tecni15KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtni_tecni15KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtni_tecni15KeyTyped

    private void jLabel106MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel106MouseClicked
        InfoAcademica.setPoste4("haypost4");
        jPanel21.setVisible(true);

        jLabel106.setVisible(false);
        jLabel153.setVisible(true);
        jLabel154.setVisible(false);
        jLabel151.setVisible(false);
        jLabel152.setVisible(false);
    }//GEN-LAST:event_jLabel106MouseClicked

    private void jLabel153MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel153MouseClicked
        
        InfoAcademica.setPoste4("nohay");
        jPanel21.setVisible(false);

        jLabel106.setVisible(true);
        jLabel153.setVisible(false);
        jLabel154.setVisible(true);
        jLabel152.setVisible(true);
    }//GEN-LAST:event_jLabel153MouseClicked

    private void txtanio_tecni16CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtanio_tecni16CaretUpdate
        InfoAcademica.setPost_anio_inst4(txtanio_tecni16.getText());
    }//GEN-LAST:event_txtanio_tecni16CaretUpdate

    private void txtanio_tecni16KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtanio_tecni16KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtanio_tecni16KeyTyped

    private void txtciudad_tecni16CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtciudad_tecni16CaretUpdate
        InfoAcademica.setPost_ciudad_inst4(txtciudad_tecni16.getText());
    }//GEN-LAST:event_txtciudad_tecni16CaretUpdate

    private void txtciudad_tecni16KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtciudad_tecni16KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtciudad_tecni16KeyTyped

    private void txtpa_tecni16CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtpa_tecni16CaretUpdate
        InfoAcademica.setPost_programa4(txtpa_tecni16.getText());
    }//GEN-LAST:event_txtpa_tecni16CaretUpdate

    private void txtpa_tecni16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpa_tecni16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpa_tecni16ActionPerformed

    private void txtpa_tecni16KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpa_tecni16KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpa_tecni16KeyTyped

    private void txtni_tecni16CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtni_tecni16CaretUpdate
        InfoAcademica.setPost_nom_institucion4(txtni_tecni16.getText());
    }//GEN-LAST:event_txtni_tecni16CaretUpdate

    private void txtni_tecni16KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtni_tecni16KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtni_tecni16KeyTyped

    private void jLabel111MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel111MouseClicked
        InfoAcademica.setPoste5("haypost5");
        jPanel22.setVisible(true);

        jLabel111.setVisible(false);
        jLabel152.setVisible(false);
        jLabel153.setVisible(false);
        jLabel154.setVisible(true);
        
    }//GEN-LAST:event_jLabel111MouseClicked

    private void jLabel154MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel154MouseClicked
        InfoAcademica.setPoste5("nohay");
        jPanel22.setVisible(false);

        jLabel111.setVisible(true);
        jLabel153.setVisible(true);
        jLabel154.setVisible(false);
    }//GEN-LAST:event_jLabel154MouseClicked

    private void txtanio_tecni17CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtanio_tecni17CaretUpdate
        InfoAcademica.setPost_anio_inst5(txtanio_tecni17.getText());
    }//GEN-LAST:event_txtanio_tecni17CaretUpdate

    private void txtanio_tecni17KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtanio_tecni17KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtanio_tecni17KeyTyped

    private void txtciudad_tecni17CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtciudad_tecni17CaretUpdate
        InfoAcademica.setPost_ciudad_inst5(txtciudad_tecni17.getText());
    }//GEN-LAST:event_txtciudad_tecni17CaretUpdate

    private void txtciudad_tecni17KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtciudad_tecni17KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtciudad_tecni17KeyTyped

    private void txtpa_tecni17CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtpa_tecni17CaretUpdate
        InfoAcademica.setPost_programa5(txtpa_tecni17.getText());
    }//GEN-LAST:event_txtpa_tecni17CaretUpdate

    private void txtpa_tecni17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpa_tecni17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpa_tecni17ActionPerformed

    private void txtpa_tecni17KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpa_tecni17KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpa_tecni17KeyTyped

    private void txtni_tecni17CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtni_tecni17CaretUpdate
        InfoAcademica.setPost_nom_institucion5(txtni_tecni14.getText());
    }//GEN-LAST:event_txtni_tecni17CaretUpdate

    private void txtni_tecni17KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtni_tecni17KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtni_tecni17KeyTyped

    private void txtanio_tecni18CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtanio_tecni18CaretUpdate
        InfoAcademica.setMaes_anio_inst1(txtanio_tecni18.getText());
    }//GEN-LAST:event_txtanio_tecni18CaretUpdate

    private void txtanio_tecni18KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtanio_tecni18KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtanio_tecni18KeyTyped

    private void txtciudad_tecni18CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtciudad_tecni18CaretUpdate
        InfoAcademica.setMaes_ciudad_inst1(txtciudad_tecni18.getText());
    }//GEN-LAST:event_txtciudad_tecni18CaretUpdate

    private void txtciudad_tecni18KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtciudad_tecni18KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtciudad_tecni18KeyTyped

    private void txtpa_tecni18CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtpa_tecni18CaretUpdate
        InfoAcademica.setMaes_programa1(txtpa_tecni18.getText());
    }//GEN-LAST:event_txtpa_tecni18CaretUpdate

    private void txtpa_tecni18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpa_tecni18ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpa_tecni18ActionPerformed

    private void txtpa_tecni18KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpa_tecni18KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpa_tecni18KeyTyped

    private void txtni_tecni18CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtni_tecni18CaretUpdate
        InfoAcademica.setMaes_nom_institucion1(txtni_tecni18.getText());
    }//GEN-LAST:event_txtni_tecni18CaretUpdate

    private void txtni_tecni18KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtni_tecni18KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtni_tecni18KeyTyped

    private void jLabel121MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel121MouseClicked
        InfoAcademica.setMaestr2("haymaes2");
        jPanel24.setVisible(true);
        
        jLabel121.setVisible(false);
        jLabel156.setVisible(true);
        jLabel157.setVisible(false);
    }//GEN-LAST:event_jLabel121MouseClicked

    private void jLabel156MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel156MouseClicked
        InfoAcademica.setMaestr2("nohay");
        jPanel24.setVisible(false);
        
        jLabel121.setVisible(true);
        jLabel156.setVisible(false);
        jLabel157.setVisible(true);
    }//GEN-LAST:event_jLabel156MouseClicked

    private void txtanio_tecni19CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtanio_tecni19CaretUpdate
        InfoAcademica.setMaes_anio_inst2(txtanio_tecni19.getText());
    }//GEN-LAST:event_txtanio_tecni19CaretUpdate

    private void txtanio_tecni19KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtanio_tecni19KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtanio_tecni19KeyTyped

    private void txtciudad_tecni19CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtciudad_tecni19CaretUpdate
        InfoAcademica.setMaes_ciudad_inst2(txtciudad_tecni19.getText());
    }//GEN-LAST:event_txtciudad_tecni19CaretUpdate

    private void txtciudad_tecni19KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtciudad_tecni19KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtciudad_tecni19KeyTyped

    private void txtpa_tecni19CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtpa_tecni19CaretUpdate
        InfoAcademica.setMaes_programa2(txtpa_tecni19.getText());
    }//GEN-LAST:event_txtpa_tecni19CaretUpdate

    private void txtpa_tecni19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpa_tecni19ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpa_tecni19ActionPerformed

    private void txtpa_tecni19KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpa_tecni19KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpa_tecni19KeyTyped

    private void txtni_tecni19CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtni_tecni19CaretUpdate
        InfoAcademica.setMaes_nom_institucion2(txtni_tecni19.getText());
    }//GEN-LAST:event_txtni_tecni19CaretUpdate

    private void txtni_tecni19KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtni_tecni19KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtni_tecni19KeyTyped

    private void jLabel126MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel126MouseClicked
        InfoAcademica.setMaestr3("haymaes3");
        jPanel25.setVisible(true);
        
        jLabel126.setVisible(false);
        jLabel157.setVisible(true);
        jLabel158.setVisible(false);
        jLabel156.setVisible(false);
    }//GEN-LAST:event_jLabel126MouseClicked

    private void jLabel157MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel157MouseClicked
        InfoAcademica.setMaestr3("nohay");
        jPanel25.setVisible(false);
        
        jLabel126.setVisible(true);
        jLabel157.setVisible(false);
        jLabel158.setVisible(true);
        jLabel156.setVisible(true);
    }//GEN-LAST:event_jLabel157MouseClicked

    private void txtanio_tecni20CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtanio_tecni20CaretUpdate
        InfoAcademica.setMaes_anio_inst3(txtanio_tecni20.getText());
    }//GEN-LAST:event_txtanio_tecni20CaretUpdate

    private void txtanio_tecni20KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtanio_tecni20KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtanio_tecni20KeyTyped

    private void txtciudad_tecni20CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtciudad_tecni20CaretUpdate
        InfoAcademica.setMaes_ciudad_inst3(txtciudad_tecni20.getText());
    }//GEN-LAST:event_txtciudad_tecni20CaretUpdate

    private void txtciudad_tecni20KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtciudad_tecni20KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtciudad_tecni20KeyTyped

    private void txtpa_tecni20CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtpa_tecni20CaretUpdate
        InfoAcademica.setMaes_programa3(txtpa_tecni20.getText());
    }//GEN-LAST:event_txtpa_tecni20CaretUpdate

    private void txtpa_tecni20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpa_tecni20ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpa_tecni20ActionPerformed

    private void txtpa_tecni20KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpa_tecni20KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpa_tecni20KeyTyped

    private void txtni_tecni20CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtni_tecni20CaretUpdate
        InfoAcademica.setMaes_nom_institucion3(txtni_tecni20.getText());
    }//GEN-LAST:event_txtni_tecni20CaretUpdate

    private void txtni_tecni20KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtni_tecni20KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtni_tecni20KeyTyped

    private void jLabel131MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel131MouseClicked
        InfoAcademica.setMaestr4("haymaes4");
        jPanel26.setVisible(true);
        
        jLabel131.setVisible(false);
        jLabel156.setVisible(false);
        jLabel157.setVisible(false);
        jLabel158.setVisible(true);
    }//GEN-LAST:event_jLabel131MouseClicked

    private void jLabel158MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel158MouseClicked
        InfoAcademica.setMaestr4("nohay");
        jPanel26.setVisible(false);
        
        jLabel131.setVisible(true);
        jLabel158.setVisible(false);
        jLabel157.setVisible(true);
    }//GEN-LAST:event_jLabel158MouseClicked

    private void txtanio_tecni21CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtanio_tecni21CaretUpdate
        InfoAcademica.setMaes_anio_inst4(txtanio_tecni21.getText());
    }//GEN-LAST:event_txtanio_tecni21CaretUpdate

    private void txtanio_tecni21KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtanio_tecni21KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtanio_tecni21KeyTyped

    private void txtciudad_tecni21CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtciudad_tecni21CaretUpdate
        InfoAcademica.setMaes_ciudad_inst4(txtciudad_tecni21.getText());
    }//GEN-LAST:event_txtciudad_tecni21CaretUpdate

    private void txtciudad_tecni21KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtciudad_tecni21KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtciudad_tecni21KeyTyped

    private void txtpa_tecni21CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtpa_tecni21CaretUpdate
        InfoAcademica.setMaes_programa4(txtpa_tecni21.getText());
    }//GEN-LAST:event_txtpa_tecni21CaretUpdate

    private void txtpa_tecni21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpa_tecni21ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpa_tecni21ActionPerformed

    private void txtpa_tecni21KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpa_tecni21KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpa_tecni21KeyTyped

    private void txtni_tecni21CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtni_tecni21CaretUpdate
        InfoAcademica.setMaes_nom_institucion4(txtni_tecni21.getText());
    }//GEN-LAST:event_txtni_tecni21CaretUpdate

    private void txtni_tecni21KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtni_tecni21KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtni_tecni21KeyTyped

    private void txtanio_tecni22CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtanio_tecni22CaretUpdate
        InfoAcademica.setDoct_anio_inst1(txtanio_tecni22.getText());
    }//GEN-LAST:event_txtanio_tecni22CaretUpdate

    private void txtanio_tecni22KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtanio_tecni22KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtanio_tecni22KeyTyped

    private void txtciudad_tecni22CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtciudad_tecni22CaretUpdate
        InfoAcademica.setDoct_ciudad_inst1(txtciudad_tecni22.getText());
    }//GEN-LAST:event_txtciudad_tecni22CaretUpdate

    private void txtciudad_tecni22KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtciudad_tecni22KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtciudad_tecni22KeyTyped

    private void txtpa_tecni22CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtpa_tecni22CaretUpdate
        InfoAcademica.setDoct_programa1(txtpa_tecni22.getText());
    }//GEN-LAST:event_txtpa_tecni22CaretUpdate

    private void txtpa_tecni22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpa_tecni22ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpa_tecni22ActionPerformed

    private void txtpa_tecni22KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpa_tecni22KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpa_tecni22KeyTyped

    private void txtni_tecni22CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtni_tecni22CaretUpdate
        InfoAcademica.setDoct_nom_institucion1(txtni_tecni22.getText());
    }//GEN-LAST:event_txtni_tecni22CaretUpdate

    private void txtni_tecni22KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtni_tecni22KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtni_tecni22KeyTyped

    private void jLabel163MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel163MouseClicked
        InfoAcademica.setDocto2("haydocto2");
        jPanel28.setVisible(true);
        jLabel163.setVisible(false);
        jLabel164.setVisible(true);
    }//GEN-LAST:event_jLabel163MouseClicked

    private void jLabel164MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel164MouseClicked
        InfoAcademica.setDocto2("nohay");
        jPanel28.setVisible(false);
        jLabel163.setVisible(true);
        jLabel164.setVisible(false);
    }//GEN-LAST:event_jLabel164MouseClicked

    private void txtanio_tecni23CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtanio_tecni23CaretUpdate
        InfoAcademica.setDoct_anio_inst2(txtanio_tecni23.getText());
    }//GEN-LAST:event_txtanio_tecni23CaretUpdate

    private void txtanio_tecni23KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtanio_tecni23KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtanio_tecni23KeyTyped

    private void txtciudad_tecni23CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtciudad_tecni23CaretUpdate
        InfoAcademica.setDoct_ciudad_inst1(txtciudad_tecni22.getText());
    }//GEN-LAST:event_txtciudad_tecni23CaretUpdate

    private void txtciudad_tecni23KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtciudad_tecni23KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtciudad_tecni23KeyTyped

    private void txtpa_tecni23CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtpa_tecni23CaretUpdate
        InfoAcademica.setDoct_programa2(txtpa_tecni23.getText());
    }//GEN-LAST:event_txtpa_tecni23CaretUpdate

    private void txtpa_tecni23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpa_tecni23ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpa_tecni23ActionPerformed

    private void txtpa_tecni23KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpa_tecni23KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpa_tecni23KeyTyped

    private void txtni_tecni23CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtni_tecni23CaretUpdate
        InfoAcademica.setDoct_nom_institucion2(txtni_tecni23.getText());
    }//GEN-LAST:event_txtni_tecni23CaretUpdate

    private void txtni_tecni23KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtni_tecni23KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtni_tecni23KeyTyped

    private void jCheckBox4ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox4ItemStateChanged
        if (jCheckBox4.isSelected()) {
            InfoAcademica.setEstadoestusus("No");
            jCheckBox3.setSelected(false);
            jLabel56.setVisible(false);
            jLabel57.setVisible(false);
            jLabel58.setVisible(false);
            jLabel59.setVisible(false);
            txtexplsusestu.setVisible(false);
            nosemestre.setVisible(false);
            spsemestre.setVisible(false);
            nombreprogacade.setVisible(false);
            txtnombreprogacade.setVisible(false);
            nombreuniversidad.setVisible(false);
            txtnombreuniversidad.setVisible(false);
            ciudaduniversidad.setVisible(false);
            txtciudaduniversidad.setVisible(false);
            jornadauniversidad.setVisible(false);
            cbxjornadauniver.setVisible(false);
            nombreuniversidad1.setVisible(false);
            txtnombreuniversidad1.setVisible(false);
            jLabel169.setVisible(false);
            ciudaduniversidad1.setVisible(false);
        } else {
            jPanel5.setVisible(false);
            InfoAcademica.setEstadoestusus("-");
            jLabel56.setVisible(false);
            jLabel57.setVisible(false);
            jLabel58.setVisible(false);
            jLabel59.setVisible(false);
            txtexplsusestu.setVisible(false);
            nosemestre.setVisible(false);
            spsemestre.setVisible(false);
            nombreprogacade.setVisible(false);
            txtnombreprogacade.setVisible(false);
            nombreuniversidad.setVisible(false);
            txtnombreuniversidad.setVisible(false);
            ciudaduniversidad.setVisible(false);
            txtciudaduniversidad.setVisible(false);
            jornadauniversidad.setVisible(false);
            cbxjornadauniver.setVisible(false);
            nombreuniversidad1.setVisible(false);
            txtnombreuniversidad1.setVisible(false);
            jLabel169.setVisible(false);
            ciudaduniversidad1.setVisible(false);
        }
    }//GEN-LAST:event_jCheckBox4ItemStateChanged

    private void txtanio_tecni4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtanio_tecni4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtanio_tecni4ActionPerformed

    private void txtanio_tecni13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtanio_tecni13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtanio_tecni13ActionPerformed

    private void txtciudad_tecni13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtciudad_tecni13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtciudad_tecni13ActionPerformed

    private void txtciudad_tecni8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtciudad_tecni8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtciudad_tecni8ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel anio_bachi;
    private javax.swing.JLabel anio_primaria;
    private javax.swing.JLabel anio_tecni;
    private javax.swing.JLabel anio_tecni1;
    private javax.swing.JLabel anio_tecni10;
    private javax.swing.JLabel anio_tecni11;
    private javax.swing.JLabel anio_tecni12;
    private javax.swing.JLabel anio_tecni13;
    private javax.swing.JLabel anio_tecni14;
    private javax.swing.JLabel anio_tecni15;
    private javax.swing.JLabel anio_tecni16;
    private javax.swing.JLabel anio_tecni17;
    private javax.swing.JLabel anio_tecni18;
    private javax.swing.JLabel anio_tecni19;
    private javax.swing.JLabel anio_tecni2;
    private javax.swing.JLabel anio_tecni20;
    private javax.swing.JLabel anio_tecni21;
    private javax.swing.JLabel anio_tecni22;
    private javax.swing.JLabel anio_tecni23;
    private javax.swing.JLabel anio_tecni3;
    private javax.swing.JLabel anio_tecni4;
    private javax.swing.JLabel anio_tecni5;
    private javax.swing.JLabel anio_tecni6;
    private javax.swing.JLabel anio_tecni7;
    private javax.swing.JLabel anio_tecni8;
    private javax.swing.JLabel anio_tecni9;
    private javax.swing.JComboBox<String> cbxjornadauniver;
    private javax.swing.JCheckBox chbxbachillerato;
    private javax.swing.JCheckBox chbxdoctorado;
    private javax.swing.JCheckBox chbxmaestria;
    private javax.swing.JCheckBox chbxpostgrado;
    private javax.swing.JCheckBox chbxprimaria;
    private javax.swing.JCheckBox chbxprofesional;
    private javax.swing.JCheckBox chbxtecnico;
    private javax.swing.JCheckBox chbxtecnologo;
    private javax.swing.JLabel ciudad_bachi;
    private javax.swing.JLabel ciudad_primaria;
    private javax.swing.JLabel ciudad_tecni;
    private javax.swing.JLabel ciudad_tecni1;
    private javax.swing.JLabel ciudad_tecni10;
    private javax.swing.JLabel ciudad_tecni11;
    private javax.swing.JLabel ciudad_tecni12;
    private javax.swing.JLabel ciudad_tecni13;
    private javax.swing.JLabel ciudad_tecni14;
    private javax.swing.JLabel ciudad_tecni15;
    private javax.swing.JLabel ciudad_tecni16;
    private javax.swing.JLabel ciudad_tecni17;
    private javax.swing.JLabel ciudad_tecni18;
    private javax.swing.JLabel ciudad_tecni19;
    private javax.swing.JLabel ciudad_tecni2;
    private javax.swing.JLabel ciudad_tecni20;
    private javax.swing.JLabel ciudad_tecni21;
    private javax.swing.JLabel ciudad_tecni22;
    private javax.swing.JLabel ciudad_tecni23;
    private javax.swing.JLabel ciudad_tecni3;
    private javax.swing.JLabel ciudad_tecni4;
    private javax.swing.JLabel ciudad_tecni5;
    private javax.swing.JLabel ciudad_tecni6;
    private javax.swing.JLabel ciudad_tecni7;
    private javax.swing.JLabel ciudad_tecni8;
    private javax.swing.JLabel ciudad_tecni9;
    private javax.swing.JLabel ciudaduniversidad;
    private javax.swing.JLabel ciudaduniversidad1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
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
    private javax.swing.JLabel jLabel130;
    private javax.swing.JLabel jLabel131;
    private javax.swing.JLabel jLabel132;
    private javax.swing.JLabel jLabel133;
    private javax.swing.JLabel jLabel134;
    private javax.swing.JLabel jLabel135;
    private javax.swing.JLabel jLabel137;
    private javax.swing.JLabel jLabel138;
    private javax.swing.JLabel jLabel139;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel140;
    private javax.swing.JLabel jLabel142;
    private javax.swing.JLabel jLabel143;
    private javax.swing.JLabel jLabel144;
    private javax.swing.JLabel jLabel146;
    private javax.swing.JLabel jLabel147;
    private javax.swing.JLabel jLabel148;
    private javax.swing.JLabel jLabel149;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel151;
    private javax.swing.JLabel jLabel152;
    private javax.swing.JLabel jLabel153;
    private javax.swing.JLabel jLabel154;
    private javax.swing.JLabel jLabel156;
    private javax.swing.JLabel jLabel157;
    private javax.swing.JLabel jLabel158;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel160;
    private javax.swing.JLabel jLabel161;
    private javax.swing.JLabel jLabel162;
    private javax.swing.JLabel jLabel163;
    private javax.swing.JLabel jLabel164;
    private javax.swing.JLabel jLabel165;
    private javax.swing.JLabel jLabel166;
    private javax.swing.JLabel jLabel167;
    private javax.swing.JLabel jLabel168;
    private javax.swing.JLabel jLabel169;
    private javax.swing.JLabel jLabel170;
    public static javax.swing.JLabel jLabel171;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
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
    public static javax.swing.JLabel jLabel98;
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
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel jornadauniversidad;
    private javax.swing.JLabel ni_bachi;
    private javax.swing.JLabel ni_primaria;
    private javax.swing.JLabel ni_primaria1;
    private javax.swing.JLabel ni_tecni;
    private javax.swing.JLabel ni_tecni1;
    private javax.swing.JLabel ni_tecni10;
    private javax.swing.JLabel ni_tecni11;
    private javax.swing.JLabel ni_tecni12;
    private javax.swing.JLabel ni_tecni13;
    private javax.swing.JLabel ni_tecni14;
    private javax.swing.JLabel ni_tecni15;
    private javax.swing.JLabel ni_tecni16;
    private javax.swing.JLabel ni_tecni17;
    private javax.swing.JLabel ni_tecni18;
    private javax.swing.JLabel ni_tecni19;
    private javax.swing.JLabel ni_tecni2;
    private javax.swing.JLabel ni_tecni20;
    private javax.swing.JLabel ni_tecni21;
    private javax.swing.JLabel ni_tecni22;
    private javax.swing.JLabel ni_tecni23;
    private javax.swing.JLabel ni_tecni3;
    private javax.swing.JLabel ni_tecni4;
    private javax.swing.JLabel ni_tecni5;
    private javax.swing.JLabel ni_tecni6;
    private javax.swing.JLabel ni_tecni7;
    private javax.swing.JLabel ni_tecni8;
    private javax.swing.JLabel ni_tecni9;
    private javax.swing.JLabel nombreprogacade;
    private javax.swing.JLabel nombreuniversidad;
    private javax.swing.JLabel nombreuniversidad1;
    private javax.swing.JLabel nosemestre;
    private javax.swing.JLabel pa_tecni;
    private javax.swing.JLabel pa_tecni1;
    private javax.swing.JLabel pa_tecni10;
    private javax.swing.JLabel pa_tecni11;
    private javax.swing.JLabel pa_tecni12;
    private javax.swing.JLabel pa_tecni13;
    private javax.swing.JLabel pa_tecni14;
    private javax.swing.JLabel pa_tecni15;
    private javax.swing.JLabel pa_tecni16;
    private javax.swing.JLabel pa_tecni17;
    private javax.swing.JLabel pa_tecni18;
    private javax.swing.JLabel pa_tecni19;
    private javax.swing.JLabel pa_tecni2;
    private javax.swing.JLabel pa_tecni20;
    private javax.swing.JLabel pa_tecni21;
    private javax.swing.JLabel pa_tecni22;
    private javax.swing.JLabel pa_tecni23;
    private javax.swing.JLabel pa_tecni3;
    private javax.swing.JLabel pa_tecni4;
    private javax.swing.JLabel pa_tecni5;
    private javax.swing.JLabel pa_tecni6;
    private javax.swing.JLabel pa_tecni7;
    private javax.swing.JLabel pa_tecni8;
    private javax.swing.JLabel pa_tecni9;
    private javax.swing.JSpinner spsemestre;
    private javax.swing.JLabel suspendioestu;
    private javax.swing.JLabel tipo_bachi;
    private javax.swing.JTextField txtanio_bachi;
    private javax.swing.JTextField txtanio_primaria;
    private javax.swing.JTextField txtanio_tecni;
    private javax.swing.JTextField txtanio_tecni1;
    private javax.swing.JTextField txtanio_tecni10;
    private javax.swing.JTextField txtanio_tecni11;
    private javax.swing.JTextField txtanio_tecni12;
    private javax.swing.JTextField txtanio_tecni13;
    private javax.swing.JTextField txtanio_tecni14;
    private javax.swing.JTextField txtanio_tecni15;
    private javax.swing.JTextField txtanio_tecni16;
    private javax.swing.JTextField txtanio_tecni17;
    private javax.swing.JTextField txtanio_tecni18;
    private javax.swing.JTextField txtanio_tecni19;
    private javax.swing.JTextField txtanio_tecni2;
    private javax.swing.JTextField txtanio_tecni20;
    private javax.swing.JTextField txtanio_tecni21;
    private javax.swing.JTextField txtanio_tecni22;
    private javax.swing.JTextField txtanio_tecni23;
    private javax.swing.JTextField txtanio_tecni3;
    private javax.swing.JTextField txtanio_tecni4;
    private javax.swing.JTextField txtanio_tecni5;
    private javax.swing.JTextField txtanio_tecni6;
    private javax.swing.JTextField txtanio_tecni7;
    private javax.swing.JTextField txtanio_tecni8;
    private javax.swing.JTextField txtanio_tecni9;
    private javax.swing.JTextField txtciudad_bachi;
    private javax.swing.JTextField txtciudad_primaria;
    private javax.swing.JTextField txtciudad_tecni;
    private javax.swing.JTextField txtciudad_tecni1;
    private javax.swing.JTextField txtciudad_tecni10;
    private javax.swing.JTextField txtciudad_tecni11;
    private javax.swing.JTextField txtciudad_tecni12;
    private javax.swing.JTextField txtciudad_tecni13;
    private javax.swing.JTextField txtciudad_tecni14;
    private javax.swing.JTextField txtciudad_tecni15;
    private javax.swing.JTextField txtciudad_tecni16;
    private javax.swing.JTextField txtciudad_tecni17;
    private javax.swing.JTextField txtciudad_tecni18;
    private javax.swing.JTextField txtciudad_tecni19;
    private javax.swing.JTextField txtciudad_tecni2;
    private javax.swing.JTextField txtciudad_tecni20;
    private javax.swing.JTextField txtciudad_tecni21;
    private javax.swing.JTextField txtciudad_tecni22;
    private javax.swing.JTextField txtciudad_tecni23;
    private javax.swing.JTextField txtciudad_tecni3;
    private javax.swing.JTextField txtciudad_tecni4;
    private javax.swing.JTextField txtciudad_tecni5;
    private javax.swing.JTextField txtciudad_tecni6;
    private javax.swing.JTextField txtciudad_tecni7;
    private javax.swing.JTextField txtciudad_tecni8;
    private javax.swing.JTextField txtciudad_tecni9;
    private javax.swing.JTextField txtciudaduniversidad;
    private javax.swing.JTextField txtexplsusestu;
    private javax.swing.JTextField txtfamiliape1;
    private javax.swing.JTextField txtni_bachi;
    private javax.swing.JTextField txtni_primaria;
    private javax.swing.JTextField txtni_tecni;
    private javax.swing.JTextField txtni_tecni1;
    private javax.swing.JTextField txtni_tecni10;
    private javax.swing.JTextField txtni_tecni11;
    private javax.swing.JTextField txtni_tecni12;
    private javax.swing.JTextField txtni_tecni13;
    private javax.swing.JTextField txtni_tecni14;
    private javax.swing.JTextField txtni_tecni15;
    private javax.swing.JTextField txtni_tecni16;
    private javax.swing.JTextField txtni_tecni17;
    private javax.swing.JTextField txtni_tecni18;
    private javax.swing.JTextField txtni_tecni19;
    private javax.swing.JTextField txtni_tecni2;
    private javax.swing.JTextField txtni_tecni20;
    private javax.swing.JTextField txtni_tecni21;
    private javax.swing.JTextField txtni_tecni22;
    private javax.swing.JTextField txtni_tecni23;
    private javax.swing.JTextField txtni_tecni3;
    private javax.swing.JTextField txtni_tecni4;
    private javax.swing.JTextField txtni_tecni5;
    private javax.swing.JTextField txtni_tecni6;
    private javax.swing.JTextField txtni_tecni7;
    private javax.swing.JTextField txtni_tecni8;
    private javax.swing.JTextField txtni_tecni9;
    private javax.swing.JTextField txtnombreprogacade;
    private javax.swing.JTextField txtnombreuniversidad;
    private javax.swing.JTextField txtnombreuniversidad1;
    private javax.swing.JTextField txtpa_tecni;
    private javax.swing.JTextField txtpa_tecni1;
    private javax.swing.JTextField txtpa_tecni10;
    private javax.swing.JTextField txtpa_tecni11;
    private javax.swing.JTextField txtpa_tecni12;
    private javax.swing.JTextField txtpa_tecni13;
    private javax.swing.JTextField txtpa_tecni14;
    private javax.swing.JTextField txtpa_tecni15;
    private javax.swing.JTextField txtpa_tecni16;
    private javax.swing.JTextField txtpa_tecni17;
    private javax.swing.JTextField txtpa_tecni18;
    private javax.swing.JTextField txtpa_tecni19;
    private javax.swing.JTextField txtpa_tecni2;
    private javax.swing.JTextField txtpa_tecni20;
    private javax.swing.JTextField txtpa_tecni21;
    private javax.swing.JTextField txtpa_tecni22;
    private javax.swing.JTextField txtpa_tecni23;
    private javax.swing.JTextField txtpa_tecni3;
    private javax.swing.JTextField txtpa_tecni4;
    private javax.swing.JTextField txtpa_tecni5;
    private javax.swing.JTextField txtpa_tecni6;
    private javax.swing.JTextField txtpa_tecni7;
    private javax.swing.JTextField txtpa_tecni8;
    private javax.swing.JTextField txtpa_tecni9;
    private javax.swing.JTextField txttipo_bachi;
    // End of variables declaration//GEN-END:variables
}
