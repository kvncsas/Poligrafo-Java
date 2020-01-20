package view;

import classes.AccionesExamen;
import classes.Admisiones;
import com.inet.jortho.SpellChecker;
import icons.*;
import static java.awt.event.ActionEvent.CTRL_MASK;
import java.awt.event.KeyEvent;
import java.sql.PreparedStatement;
import javax.swing.InputMap;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.KeyStroke;
import classes.Conexion;
import classes.DatosPrincipales;
//import classes.Limpiar;
import classes.TecnicaYPreguntas;
import java.awt.Color;
import java.io.File;
import java.io.FileInputStream;

/**
 *
 * @author Kevin Fajardo Casas
 */
public class TecnicaYVerificacion extends javax.swing.JInternalFrame {

    public TecnicaYVerificacion() {
        ((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI()).setNorthPane(null);
        initComponents();
        jScrollPane1.getVerticalScrollBar().setUnitIncrement(15);
        //datos_generales.fechaderecha.setVisible(false);
        noverlos();
        corrector();
    }

    public void corrector() {
        SpellChecker.register(txtnomevaluado);
        SpellChecker.register(txtnomevaluado1);
        r1.setText("¿Ha cometído usted algún robo en algunos de sus empleos anteriores?");
        r2.setText("¿Ha participado usted en alguna actividad delictiva?");
        r3.setText("¿Planeó usted algún acto ilícito en contra de Teleperformance?");
        r4.setText("¿Suministró usted algúna información falsa para ingresar a este empleo?");
    }

    Question iconQuestion = new Question();
    Shocked iconShocked = new Shocked();
    Thinking iconThinking = new Thinking();
    Thinking_uh iconThinking_uh = new Thinking_uh();
    Warning iconWarning = new Warning();
    Checked iconChecked = new Checked();
    Close iconClose = new Close();
    Sad iconSad = new Sad();
    ErrorI iconError = new ErrorI();
    
    

    public void noverlos() {
        chbxamarillo16.setVisible(false);
        jButton1.setVisible(false);
        //fase sucesiva

        estaaplicandoinf66.setVisible(false);
        cbxsistemaexam1.setVisible(false);
        estaaplicandoinf67.setVisible(false);
        r1_fs.setVisible(false);
        r1_sub1.setVisible(false);
        jButton12.setVisible(false);
        r2_fs.setVisible(false);
        r2_sub1.setVisible(false);
        jButton13.setVisible(false);
        r3_fs.setVisible(false);
        r3_sub1.setVisible(false);
        jButton14.setVisible(false);
        jRadioButton14.setVisible(false);
        jRadioButton15.setVisible(false);

        jRadioButton8.setVisible(false);
        jRadioButton9.setVisible(false);

        estaaplicandoinf61.setVisible(false);
        cbxsistemaexam.setVisible(false);
        //DLST
        //sub a
        srdesubtest.setVisible(false);
        estaaplicandoinf1.setVisible(false);
        jLabel14.setVisible(false);
        jLabel160.setVisible(false);
        estaaplicandoinf47.setVisible(false);
        r1_sub.setVisible(false);
        jButton5.setVisible(false);
        jLabel162.setVisible(false);
        estaaplicandoinf48.setVisible(false);
        r2_sub.setVisible(false);
        jButton6.setVisible(false);
        jLabel161.setVisible(false);
        estaaplicandoinf53.setVisible(false);
        chbxamarillo5.setVisible(false);
        estaaplicandoinf32.setVisible(false);
        chbxamarillo4.setVisible(false);
        estaaplicandoinf31.setVisible(false);
        chbxamarillo3.setVisible(false);
        estaaplicandoinf28.setVisible(false);
        chbxamarillo1.setVisible(false);
        estaaplicandoinf30.setVisible(false);
        chbxamarillo2.setVisible(false);
        jLabel166.setVisible(false); //espacio

        //sub b
        estaaplicandoinf8.setVisible(false);
        jLabel13.setVisible(false);
        jLabel16.setVisible(false);
        jLabel165.setVisible(false);
        estaaplicandoinf49.setVisible(false);
        r3_sub.setVisible(false);
        jButton7.setVisible(false);
        jLabel163.setVisible(false);
        estaaplicandoinf50.setVisible(false);
        r4_sub.setVisible(false);
        jButton8.setVisible(false);
        jLabel164.setVisible(false);
        estaaplicandoinf54.setVisible(false);
        estaaplicandoinf55sdd.setVisible(false);
        chbxamarillo6.setVisible(false);
        estaaplicandoinf56.setVisible(false);
        chbxamarillo7.setVisible(false);
        estaaplicandoinf57.setVisible(false);
        chbxamarillo8.setVisible(false);
        estaaplicandoinf58.setVisible(false);
        chbxamarillo9.setVisible(false);
        estaaplicandoinf59.setVisible(false);
        chbxamarillo10.setVisible(false);
        jLabel167.setVisible(false);

        //sub c
        estaaplicandoinf11.setVisible(false);
        jLabel15.setVisible(false);
        jLabel170.setVisible(false);
        estaaplicandoinf51.setVisible(false);
        r5_sub.setVisible(false);
        jButton9.setVisible(false);
        jLabel169.setVisible(false);
        estaaplicandoinf52.setVisible(false);
        r6_sub.setVisible(false);
        jButton10.setVisible(false);
        jLabel168.setVisible(false);
        estaaplicandoinf60.setVisible(false);
        estaaplicandoinf61sd.setVisible(false);
        chbxamarillo11.setVisible(false);
        estaaplicandoinf62.setVisible(false);
        chbxamarillo12.setVisible(false);
        estaaplicandoinf63.setVisible(false);
        chbxamarillo13.setVisible(false);
        estaaplicandoinf64.setVisible(false);
        chbxamarillo14.setVisible(false);
        estaaplicandoinf65.setVisible(false);
        chbxamarillo15.setVisible(false);

        //AFMGQT V2 4R
        estaaplicandoinf34.setVisible(false);
        r1.setVisible(false);
        jButton1.setVisible(false);
        jLabel142.setVisible(false);
        estaaplicandoinf35.setVisible(false);
        r2.setVisible(false);
        jButton2.setVisible(false);
        jLabel143.setVisible(false);
        estaaplicandoinf36.setVisible(false);
        r3.setVisible(false);
        jButton3.setVisible(false);
        jLabel147.setVisible(false);
        estaaplicandoinf37.setVisible(false);
        r4.setVisible(false);
        jButton4.setVisible(false);
        jLabel145.setVisible(false);
//        jLabel30.setVisible(false);
        jLabel148.setVisible(false);
        //diagnostico
        estaaplicandoinf14.setVisible(false);
        jLabel144.setVisible(false);
        //1
        estaaplicandoinf15ppp.setVisible(false);
        jRadioButton1.setVisible(false);
        estaaplicandoinf20.setVisible(false);
        jCheckBox1.setVisible(false);
        estaaplicandoinf21.setVisible(false);

        jCheckBox2.setVisible(false);
        estaaplicandoinf22.setVisible(false);
        jCheckBox3.setVisible(false);
        estaaplicandoinf23.setVisible(false);
        jCheckBox4.setVisible(false);
        jLabel149.setVisible(false);
        //2
        estaaplicandoinf16.setVisible(false);
        jRadioButton2.setVisible(false);
        estaaplicandoinf24.setVisible(false);
        jCheckBox5.setVisible(false);
        estaaplicandoinf25.setVisible(false);
        jCheckBox6.setVisible(false);
        estaaplicandoinf26.setVisible(false);
        jCheckBox7.setVisible(false);
        estaaplicandoinf27.setVisible(false);
        jCheckBox8.setVisible(false);
        jLabel150.setVisible(false);
        //3
        estaaplicandoinf17.setVisible(false);
        jRadioButton3.setVisible(false);
        jLabel151.setVisible(false);
        //4
        estaaplicandoinf18.setVisible(false);
        jRadioButton4.setVisible(false);
        jLabel152.setVisible(false);
        //5
        estaaplicandoinf19.setVisible(false);
        jRadioButton5.setVisible(false);
        estaaplicandoinf38.setVisible(false);
        jCheckBox13.setVisible(false);
        estaaplicandoinf39.setVisible(false);
        jCheckBox14.setVisible(false);
        estaaplicandoinf40.setVisible(false);
        jCheckBox15.setVisible(false);
        estaaplicandoinf41.setVisible(false);
        jCheckBox16.setVisible(false);
        jLabel154.setVisible(false);
//        jLabel31.setVisible(false);
        //admisiones
        estaaplicandoinf43.setVisible(false);
        jRadioButton6.setVisible(false);
        jRadioButton7.setVisible(false);
        jLabel155.setVisible(false);
        txtnomevaluado.setVisible(false);
        jLabel29.setVisible(false);
        jLabel156.setVisible(false);
        //notas postetst
        estaaplicandoinf44.setVisible(false);
        jLabel159.setVisible(false);
        txtnomevaluado1.setVisible(false);
        jLabel32.setVisible(false);
        jLabel158.setVisible(false);
        //color
        estaaplicandoinf29.setVisible(false);
        rojo.setVisible(false);
        chbxrojo.setVisible(false);
        verde.setVisible(false);
        chbxverde.setVisible(false);
    }

    public void goToURL(String URL) {
        if (java.awt.Desktop.isDesktopSupported()) {
            java.awt.Desktop desktop = java.awt.Desktop.getDesktop();
            if (desktop.isSupported(java.awt.Desktop.Action.BROWSE)) {
                try {
                    java.net.URI uri = new java.net.URI(URL);
                    desktop.browse(uri);
                } catch (Exception e) {
                }
            }
        }
    }

    public void limpiar() {

        DatoGeneral.jLabel2.setForeground(Color.black);//Datos personales
        DatoGeneral.jLabel3.setForeground(Color.black);//Estado de salud
        DatoGeneral.jLabel4.setForeground(Color.black);//Info familiar
        DatoGeneral.jLabel10.setForeground(Color.black);//Info académica
        DatoGeneral.jLabel5.setForeground(Color.black);//Info financiera
        DatoGeneral.jLabel13.setForeground(Color.black);//Actvidades tiempo libre
        DatoGeneral.jLabel6.setForeground(Color.black);//Consumo bebidas
        DatoGeneral.jLabel7.setForeground(Color.black);//Consumo sustancias
        DatoGeneral.jLabel8.setForeground(Color.black);//Antecendentes
        DatoGeneral.jLabel9.setForeground(Color.black);//Vinculos personas
        DatoGeneral.jLabel11.setForeground(Color.black);//Falsificacion /  Conducta laboral
        DatoGeneral.jLabel12.setForeground(Color.black);//Historia laboral
        DatoGeneral.jLabel14.setForeground(Color.black);//Planes infiltracion
        DatoGeneral.jLabel18.setForeground(Color.black);//Tema bajo investigación
        DatoGeneral.jLabel15.setForeground(Color.black);//Tecnica empleada
//        DatoGeneral.jLabel16.setForeground(Color.black);//Admisiones

        DatoGeneral.jLabel2.setVisible(false);//Datos personales
        DatoGeneral.jLabel3.setVisible(false);//Estado de salud
        DatoGeneral.jLabel4.setVisible(false);//Info familiar
        DatoGeneral.jLabel10.setVisible(false);//Info académica
        DatoGeneral.jLabel5.setVisible(false);//Info financiera
        DatoGeneral.jLabel13.setVisible(false);//Actvidades tiempo libre
        DatoGeneral.jLabel6.setVisible(false);//Consumo bebidas
        DatoGeneral.jLabel7.setVisible(false);//Consumo sustancias
        DatoGeneral.jLabel8.setVisible(false);//Antecendentes
        DatoGeneral.jLabel9.setVisible(true);//Vinculos personas
        DatoGeneral.jLabel11.setVisible(false);//Falsificacion /  Conducta laboral
        DatoGeneral.jLabel11.setText("Falsificación");//Falsificacion /  Conducta laboral
        DatoGeneral.jLabel12.setVisible(false);//Historia laboral
        DatoGeneral.jLabel14.setVisible(false);//Planes infiltracion
        DatoGeneral.jLabel18.setVisible(false);//Tema bajo investigación
//        DatoGeneral.jLabel16.setVisible(false);//Tecnica empleada
        DatoGeneral.jLabel15.setVisible(false);//Admisiones

        cbxestaaplicandoinf.setSelectedItem("Seleccione");
        cbxsistemaexam.setSelectedItem("Lafayette");
        cbxsistemaexam1.setSelectedItem("Seleccione");

        r1.setText("¿Ha cometído usted algún robo en algunos de sus empleos anteriores?");
        r2.setText("¿Ha participado usted en alguna actividad delictiva?");
        r3.setText("¿Planeó usted algún acto ilícito en contra de Teleperformance?");
        r4.setText("¿Suministró usted algúna información falsa para ingresar a este empleo?");

        r1_sub.setText("¿Cometió usted algún robo en alguno de sus empleos?");
        r2_sub.setText("¿Ha participado usted en alguna actividad delictiva?");
        r3_sub.setText("¿Ha participado usted en fraude en contra de Teleperformance?");
        r4_sub.setText("¿Ha recibido usted propuestas para cometer fraudes en Teleperformance?");
        r5_sub.setText("¿Ha participado usted en fraude en contra de Teleperformance?");
        r6_sub.setText("¿Ha recibido usted propuestas para cometer fraudes en Teleperformance?");

        cbxestaaplicandoinf.setSelectedItem("Seleccione");
        jRadioButton1.setSelected(false);
        jRadioButton2.setSelected(false);
        jRadioButton3.setSelected(false);
        jRadioButton4.setSelected(false);
        jRadioButton5.setSelected(false);
        jCheckBox1.setSelected(false);
        jCheckBox2.setSelected(false);
        jCheckBox3.setSelected(false);
        jCheckBox4.setSelected(false);
        jCheckBox5.setSelected(false);
        jCheckBox6.setSelected(false);
        jCheckBox7.setSelected(false);
        jCheckBox8.setSelected(false);
        jCheckBox13.setSelected(false);
        jCheckBox14.setSelected(false);
        jCheckBox15.setSelected(false);
        jCheckBox16.setSelected(false);

        jRadioButton6.setSelected(false);
        jRadioButton7.setSelected(false);
        txtnomevaluado.setText("");
        txtnomevaluado1.setText("");
        chbxamarillo5.setSelected(false);
        chbxamarillo4.setSelected(false);
        chbxamarillo3.setSelected(false);
        chbxamarillo1.setSelected(false);
        chbxamarillo2.setSelected(false);
        chbxamarillo6.setSelected(false);
        chbxamarillo7.setSelected(false);
        chbxamarillo8.setSelected(false);
        chbxamarillo9.setSelected(false);
        chbxamarillo10.setSelected(false);
        chbxamarillo11.setSelected(false);
        chbxamarillo12.setSelected(false);
        chbxamarillo13.setSelected(false);
        chbxamarillo14.setSelected(false);
        chbxamarillo15.setSelected(false);

        chbxrojo.setSelected(false);
        chbxverde.setSelected(false);

        cbxsistemaexam.setSelectedItem("-");
        
        jScrollPane1.getVerticalScrollBar().setValue(0);

    }

    public void finalizarExamen() {

        if (TecnicaYPreguntas.getDiagnosticoExamen().equals("SR") && (!jCheckBox1.isSelected() && !jCheckBox2.isSelected() && !jCheckBox3.isSelected() && !jCheckBox4.isSelected())) {

            JOptionPane.showMessageDialog(null, "¡Debe completar el diagnóstico SR para finalizar el examen!", "Terminación de prueba examinado", JOptionPane.ERROR_MESSAGE, iconError);

        } else if (TecnicaYPreguntas.getDiagnosticoExamen().equals("INC") && (!jCheckBox13.isSelected() && !jCheckBox14.isSelected() && !jCheckBox15.isSelected() && !jCheckBox16.isSelected())) {

            JOptionPane.showMessageDialog(null, "¡Debe completar el diagnóstico INC para finalizar el examen!", "Terminación de prueba examinado", JOptionPane.ERROR_MESSAGE, iconError);

        } else if (TecnicaYPreguntas.getColor().equals("")) {

            JOptionPane.showMessageDialog(null, "¡Debe seleccionar el color para finalizar el examen!", "Terminación de prueba examinado", JOptionPane.ERROR_MESSAGE);

        } else if (TecnicaYPreguntas.getColor().equals("Rojo") && TecnicaYPreguntas.getColormalo().equals("")) {

            JOptionPane.showMessageDialog(null, "¡Debe seleccionar el por qué del color rojo para finalizar el examen!", "Terminación de prueba examinado", JOptionPane.ERROR_MESSAGE);

        } else if ((TecnicaYPreguntas.getDiagnosticoExamen().equals("NO") && txtnomevaluado1.getText().equals("")) || (TecnicaYPreguntas.getDiagnosticoExamen().equals("PNC") && txtnomevaluado1.getText().equals(""))) {

            JOptionPane.showMessageDialog(null, "¡Debe diligenciar las notas fase del test para finalizar el examen!", "Terminación de prueba examinado", JOptionPane.ERROR_MESSAGE);

        } else if (estaaplicandoinf8.isVisible() && TecnicaYPreguntas.getTecnicaExamen().equals("AFMGQT V2 4R") && TecnicaYPreguntas.getResultado_sub_a().equals("")) {

            JOptionPane.showMessageDialog(null, "¡Debe seleccionar el resultado en el SUB TEST A para continuar con el examen!", "Terminación de prueba examinado", JOptionPane.ERROR_MESSAGE);

        } else if (estaaplicandoinf11.isVisible() && TecnicaYPreguntas.getTecnicaExamen().equals("AFMGQT V2 4R") && TecnicaYPreguntas.getResultado_sub_b().equals("")) {

            JOptionPane.showMessageDialog(null, "¡Debe seleccionar el resultado en el SUB TEST B para continuar con el examen!", "Terminación de prueba examinado", JOptionPane.ERROR_MESSAGE);

        } else if ((estaaplicandoinf1.isVisible() && estaaplicandoinf8.isVisible() && estaaplicandoinf11.isVisible()) && TecnicaYPreguntas.getTecnicaExamen().equals("AFMGQT V2 4R") && (TecnicaYPreguntas.getResultado_sub_a().equals("") && TecnicaYPreguntas.getResultado_sub_b().equals("") && TecnicaYPreguntas.getResultado_sub_c().equals(""))) {

            JOptionPane.showMessageDialog(null, "¡Debe seleccionar los resultados en los SUB TEST A, B y C para continuar con el examen!", "Terminación de prueba examinado", JOptionPane.ERROR_MESSAGE);

        } else {

            TecnicaYPreguntas.setR1(r1.getText());
            TecnicaYPreguntas.setR2(r2.getText());
            TecnicaYPreguntas.setR3(r3.getText());
            TecnicaYPreguntas.setR4(r4.getText());
            TecnicaYPreguntas.setR_1(r1_sub.getText());
            TecnicaYPreguntas.setR_2(r2_sub.getText());
            TecnicaYPreguntas.setR_3(r3_sub.getText());
            TecnicaYPreguntas.setR_4(r4_sub.getText());
            TecnicaYPreguntas.setR_5(r5_sub.getText());
            TecnicaYPreguntas.setR_6(r6_sub.getText());
            TecnicaYPreguntas.setFsr1(r1_sub1.getText());
            TecnicaYPreguntas.setFsr2(r2_sub1.getText());
            TecnicaYPreguntas.setFsr3(r3_sub1.getText());

            String preguntasexam = "";

            if (TecnicaYPreguntas.getTecnicaExamen().equals("DLST")) {
                if (!TecnicaYPreguntas.getResultado_sub_a().equals("") && !TecnicaYPreguntas.getResultado_sub_b().equals("") && !TecnicaYPreguntas.getResultado_sub_c().equals("")) {
                    preguntasexam = "SUB TEST A\nR-1 " + TecnicaYPreguntas.getR_1() + ";"
                            + " R-2 " + TecnicaYPreguntas.getR_2() + ";\n\n"
                            + "SUB TEST B\nR-3 " + TecnicaYPreguntas.getR_3() + ";"
                            + " R-4 " + TecnicaYPreguntas.getR_4() + ";\n\n"
                            + "SUB TEST C\nR-5 " + TecnicaYPreguntas.getR_5() + ";"
                            + " R-6 " + TecnicaYPreguntas.getR_6() + ".";
                } else if (!TecnicaYPreguntas.getResultado_sub_a().equals("") && !TecnicaYPreguntas.getResultado_sub_b().equals("")) {
                    preguntasexam = "SUB TEST A\nR-1 " + TecnicaYPreguntas.getR_1() + ";"
                            + " R-2 " + TecnicaYPreguntas.getR_2() + ";\n\n"
                            + "SUB TEST B\nR-3 " + TecnicaYPreguntas.getR_3() + ";"
                            + " R-4 " + TecnicaYPreguntas.getR_4() + ".";
                } else if (!TecnicaYPreguntas.getResultado_sub_a().equals("")) {
                    preguntasexam = "SUB TEST A\nR-1 " + TecnicaYPreguntas.getR_1() + ";"
                            + " R-2 " + TecnicaYPreguntas.getR_2() + "";
                }
                TecnicaYPreguntas.setPreguntasExamen(preguntasexam);
            } else if (TecnicaYPreguntas.getTecnicaExamen().equals("AFMGQT V2 4R")) {
                preguntasexam = "R-1 " + TecnicaYPreguntas.getR1() + "; R-2 " + TecnicaYPreguntas.getR2() + "; R-3 " + TecnicaYPreguntas.getR3() + "; R-4 " + TecnicaYPreguntas.getR4() + ".";
                TecnicaYPreguntas.setPreguntasExamen(preguntasexam);
            }

            try {
                AccionesExamen acex = new AccionesExamen();
                acex.guardarExamen();

                if ("Conconexion".equals(classes.Conexion.importante)) {
                    System.out.println("entro a la ultima update");

                    PreparedStatement sqlacade = Conexion.connection.prepareStatement("UPDATE datos_generales_poli "
                            + "SET rq = '" + preguntasexam + "' , admisiones = '"+TecnicaYPreguntas.getAdmisiones()+"' ,nombreExamen = '" + TecnicaYPreguntas.getNombreExamen() + "', tipotecnica = '" + TecnicaYPreguntas.getTecnicaExamen() + "', sistemaExamen = '" + TecnicaYPreguntas.getSistemaUtilizadoExamen() + "', diagnostico = '" + TecnicaYPreguntas.getDiagnosticoExamen() + "', estadoexamen = 'Terminado', color = '" + TecnicaYPreguntas.getColor() + "', estadocolor = '" + TecnicaYPreguntas.getColormalo() + "', notasft = '" + TecnicaYPreguntas.getNotasft() + "'  WHERE no_id = " + DatosPrincipales.getNoIdenExaminado() + " and t_identificacion = '" + DatosPrincipales.getTipoIdenExaminado() + " ' and  tipoexamen = '" + DatosPrincipales.getTipoExamen() + "' and motivoexamen = '" + DatosPrincipales.getMotivoExamen() + "'  ");

                    sqlacade.executeUpdate();
                }
                JOptionPane.showMessageDialog(null, "¡Examen finalizado!", "Terminación de prueba examinado", JOptionPane.INFORMATION_MESSAGE);
                JOptionPane.showMessageDialog(null, "¡Cargue el examen realizado al aplicativo web!", "Terminación de prueba examinado", JOptionPane.INFORMATION_MESSAGE);
          
                 TecnicaYPreguntas.setFinalizar("Sí");
                
                goToURL("https://hranalytics.teleperformance.co/poligrafia/vistas/poligrafistas/cargarExam.php");
                
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "¡Error! No se guardaron los datos del examen" + e);
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        estaaplicandoinf = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel12 = new javax.swing.JPanel();
        cbxestaaplicandoinf = new javax.swing.JComboBox<>();
        estaaplicandoinf1 = new javax.swing.JLabel();
        r1 = new javax.swing.JLabel();
        r2 = new javax.swing.JLabel();
        r3 = new javax.swing.JLabel();
        r4 = new javax.swing.JLabel();
        estaaplicandoinf8 = new javax.swing.JLabel();
        estaaplicandoinf11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        estaaplicandoinf14 = new javax.swing.JLabel();
        estaaplicandoinf15ppp = new javax.swing.JLabel();
        estaaplicandoinf16 = new javax.swing.JLabel();
        estaaplicandoinf17 = new javax.swing.JLabel();
        estaaplicandoinf18 = new javax.swing.JLabel();
        estaaplicandoinf19 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        estaaplicandoinf20 = new javax.swing.JLabel();
        estaaplicandoinf21 = new javax.swing.JLabel();
        estaaplicandoinf22 = new javax.swing.JLabel();
        estaaplicandoinf23 = new javax.swing.JLabel();
        estaaplicandoinf24 = new javax.swing.JLabel();
        estaaplicandoinf25 = new javax.swing.JLabel();
        estaaplicandoinf26 = new javax.swing.JLabel();
        estaaplicandoinf27 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        jCheckBox6 = new javax.swing.JCheckBox();
        jCheckBox7 = new javax.swing.JCheckBox();
        jCheckBox8 = new javax.swing.JCheckBox();
        estaaplicandoinf29 = new javax.swing.JLabel();
        rojo = new javax.swing.JLabel();
        verde = new javax.swing.JLabel();
        chbxrojo = new javax.swing.JCheckBox();
        chbxverde = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        estaaplicandoinf34 = new javax.swing.JLabel();
        estaaplicandoinf35 = new javax.swing.JLabel();
        estaaplicandoinf36 = new javax.swing.JLabel();
        estaaplicandoinf37 = new javax.swing.JLabel();
        jCheckBox13 = new javax.swing.JCheckBox();
        estaaplicandoinf38 = new javax.swing.JLabel();
        estaaplicandoinf39 = new javax.swing.JLabel();
        jCheckBox14 = new javax.swing.JCheckBox();
        estaaplicandoinf40 = new javax.swing.JLabel();
        jCheckBox15 = new javax.swing.JCheckBox();
        estaaplicandoinf41 = new javax.swing.JLabel();
        jCheckBox16 = new javax.swing.JCheckBox();
        estaaplicandoinf43 = new javax.swing.JLabel();
        estaaplicandoinf44 = new javax.swing.JLabel();
        jRadioButton6 = new javax.swing.JRadioButton();
        jRadioButton7 = new javax.swing.JRadioButton();
        jLabel29 = new javax.swing.JLabel();
        txtnomevaluado = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        txtnomevaluado1 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        estaaplicandoinf47 = new javax.swing.JLabel();
        r1_sub = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        estaaplicandoinf48 = new javax.swing.JLabel();
        r2_sub = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        estaaplicandoinf49 = new javax.swing.JLabel();
        estaaplicandoinf50 = new javax.swing.JLabel();
        r4_sub = new javax.swing.JLabel();
        r3_sub = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        estaaplicandoinf51 = new javax.swing.JLabel();
        estaaplicandoinf52 = new javax.swing.JLabel();
        r6_sub = new javax.swing.JLabel();
        r5_sub = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        estaaplicandoinf28 = new javax.swing.JLabel();
        estaaplicandoinf30 = new javax.swing.JLabel();
        estaaplicandoinf31 = new javax.swing.JLabel();
        estaaplicandoinf32 = new javax.swing.JLabel();
        srdesubtest = new javax.swing.JLabel();
        estaaplicandoinf53 = new javax.swing.JLabel();
        chbxamarillo1 = new javax.swing.JCheckBox();
        chbxamarillo2 = new javax.swing.JCheckBox();
        chbxamarillo3 = new javax.swing.JCheckBox();
        chbxamarillo4 = new javax.swing.JCheckBox();
        chbxamarillo5 = new javax.swing.JCheckBox();
        estaaplicandoinf54 = new javax.swing.JLabel();
        estaaplicandoinf55sdd = new javax.swing.JLabel();
        chbxamarillo6 = new javax.swing.JCheckBox();
        estaaplicandoinf56 = new javax.swing.JLabel();
        chbxamarillo7 = new javax.swing.JCheckBox();
        estaaplicandoinf57 = new javax.swing.JLabel();
        chbxamarillo8 = new javax.swing.JCheckBox();
        estaaplicandoinf58 = new javax.swing.JLabel();
        chbxamarillo9 = new javax.swing.JCheckBox();
        estaaplicandoinf59 = new javax.swing.JLabel();
        chbxamarillo10 = new javax.swing.JCheckBox();
        estaaplicandoinf60 = new javax.swing.JLabel();
        estaaplicandoinf61sd = new javax.swing.JLabel();
        chbxamarillo11 = new javax.swing.JCheckBox();
        estaaplicandoinf62 = new javax.swing.JLabel();
        chbxamarillo12 = new javax.swing.JCheckBox();
        estaaplicandoinf63 = new javax.swing.JLabel();
        chbxamarillo13 = new javax.swing.JCheckBox();
        estaaplicandoinf64 = new javax.swing.JLabel();
        chbxamarillo14 = new javax.swing.JCheckBox();
        estaaplicandoinf65 = new javax.swing.JLabel();
        chbxamarillo15 = new javax.swing.JCheckBox();
        jLabel141 = new javax.swing.JLabel();
        jLabel142 = new javax.swing.JLabel();
        jLabel143 = new javax.swing.JLabel();
        jLabel144 = new javax.swing.JLabel();
        jLabel145 = new javax.swing.JLabel();
        jLabel146 = new javax.swing.JLabel();
        jLabel148 = new javax.swing.JLabel();
        jLabel147 = new javax.swing.JLabel();
        jLabel149 = new javax.swing.JLabel();
        jLabel150 = new javax.swing.JLabel();
        jLabel151 = new javax.swing.JLabel();
        jLabel152 = new javax.swing.JLabel();
        jLabel154 = new javax.swing.JLabel();
        jLabel155 = new javax.swing.JLabel();
        jLabel156 = new javax.swing.JLabel();
        jLabel158 = new javax.swing.JLabel();
        jLabel159 = new javax.swing.JLabel();
        jLabel160 = new javax.swing.JLabel();
        jLabel161 = new javax.swing.JLabel();
        jLabel162 = new javax.swing.JLabel();
        jLabel163 = new javax.swing.JLabel();
        jLabel164 = new javax.swing.JLabel();
        jLabel165 = new javax.swing.JLabel();
        jLabel166 = new javax.swing.JLabel();
        jLabel167 = new javax.swing.JLabel();
        jLabel168 = new javax.swing.JLabel();
        jLabel169 = new javax.swing.JLabel();
        jLabel170 = new javax.swing.JLabel();
        estaaplicandoinf2 = new javax.swing.JLabel();
        jLabel172 = new javax.swing.JLabel();
        estaaplicandoinf61 = new javax.swing.JLabel();
        cbxsistemaexam = new javax.swing.JComboBox<>();
        jRadioButton8 = new javax.swing.JRadioButton();
        jRadioButton9 = new javax.swing.JRadioButton();
        estaaplicandoinf66 = new javax.swing.JLabel();
        cbxsistemaexam1 = new javax.swing.JComboBox<>();
        estaaplicandoinf67 = new javax.swing.JLabel();
        r1_fs = new javax.swing.JLabel();
        r1_sub1 = new javax.swing.JLabel();
        r2_fs = new javax.swing.JLabel();
        r2_sub1 = new javax.swing.JLabel();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jRadioButton14 = new javax.swing.JRadioButton();
        jRadioButton15 = new javax.swing.JRadioButton();
        chbxamarillo16 = new javax.swing.JCheckBox();
        r3_fs = new javax.swing.JLabel();
        r3_sub1 = new javax.swing.JLabel();
        jButton14 = new javax.swing.JButton();

        estaaplicandoinf.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        estaaplicandoinf.setText("¿Qué tipo de técnica se utilizará en este examen de polígrafo?");

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(null);
        setPreferredSize(new java.awt.Dimension(975, 550));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel12MouseClicked(evt);
            }
        });

        cbxestaaplicandoinf.setFont(new java.awt.Font("Segoe UI Emoji", 0, 13)); // NOI18N
        cbxestaaplicandoinf.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "AFMGQT V2 4R", "DLST" }));
        cbxestaaplicandoinf.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxestaaplicandoinfItemStateChanged(evt);
            }
        });

        estaaplicandoinf1.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        estaaplicandoinf1.setText("SUB TEST A");

        r1.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        r1.setText("¿Ha cometído usted algún robo en algunos de sus empleos anteriores?");

        r2.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        r2.setText("¿Ha participado usted en alguna actividad delictiva?");

        r3.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        r3.setText("¿Planeó usted algún acto ilícito en contra de Teleperformance?");

        r4.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        r4.setText("¿Suministró usted algúna información falsa para ingresar a este empleo?");

        estaaplicandoinf8.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        estaaplicandoinf8.setText("SUB TEST B");

        estaaplicandoinf11.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        estaaplicandoinf11.setText("SUB TEST C");

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/plus-symbol.png"))); // NOI18N
        jLabel13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });

        estaaplicandoinf14.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        estaaplicandoinf14.setText("Diagnóstico:");

        estaaplicandoinf15ppp.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        estaaplicandoinf15ppp.setText("SR");

        estaaplicandoinf16.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        estaaplicandoinf16.setText("NSR");

        estaaplicandoinf17.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        estaaplicandoinf17.setText("NO");

        estaaplicandoinf18.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        estaaplicandoinf18.setText("PNC");

        estaaplicandoinf19.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        estaaplicandoinf19.setText("INC");

        jRadioButton1.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButton1ItemStateChanged(evt);
            }
        });

        jRadioButton2.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButton2ItemStateChanged(evt);
            }
        });

        jRadioButton3.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton3.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButton3ItemStateChanged(evt);
            }
        });

        jRadioButton4.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton4.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButton4ItemStateChanged(evt);
            }
        });

        jRadioButton5.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton5.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButton5ItemStateChanged(evt);
            }
        });

        estaaplicandoinf20.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        estaaplicandoinf20.setText("R-1");

        estaaplicandoinf21.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        estaaplicandoinf21.setText("R-2");

        estaaplicandoinf22.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        estaaplicandoinf22.setText("R-3");

        estaaplicandoinf23.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        estaaplicandoinf23.setText("R-4");

        estaaplicandoinf24.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        estaaplicandoinf24.setText("R-1");

        estaaplicandoinf25.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        estaaplicandoinf25.setText("R-2");

        estaaplicandoinf26.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        estaaplicandoinf26.setText("R-3");

        estaaplicandoinf27.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        estaaplicandoinf27.setText("R-4");

        jCheckBox1.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox1ItemStateChanged(evt);
            }
        });
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jCheckBox2.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox2ItemStateChanged(evt);
            }
        });

        jCheckBox3.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox3.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox3ItemStateChanged(evt);
            }
        });

        jCheckBox4.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox4.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox4ItemStateChanged(evt);
            }
        });

        jCheckBox5.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox5.setEnabled(false);

        jCheckBox6.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox6.setEnabled(false);

        jCheckBox7.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox7.setEnabled(false);

        jCheckBox8.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox8.setEnabled(false);

        estaaplicandoinf29.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        estaaplicandoinf29.setText("Color:");

        rojo.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        rojo.setText("Rojo");

        verde.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        verde.setText("Verde");

        chbxrojo.setBackground(new java.awt.Color(255, 255, 255));
        chbxrojo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chbxrojoItemStateChanged(evt);
            }
        });

        chbxverde.setBackground(new java.awt.Color(255, 255, 255));
        chbxverde.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chbxverdeItemStateChanged(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jButton1.setText("Editar R-1");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jButton2.setText("Editar R-2");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jButton3.setText("Editar R-3");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jButton4.setText("Editar R-4");
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        estaaplicandoinf34.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        estaaplicandoinf34.setText("R-1.");

        estaaplicandoinf35.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        estaaplicandoinf35.setText("R-2.");

        estaaplicandoinf36.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        estaaplicandoinf36.setText("R-3.");

        estaaplicandoinf37.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        estaaplicandoinf37.setText("R-4.");

        jCheckBox13.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox13.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox13ItemStateChanged(evt);
            }
        });
        jCheckBox13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox13ActionPerformed(evt);
            }
        });

        estaaplicandoinf38.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        estaaplicandoinf38.setText("R-1");

        estaaplicandoinf39.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        estaaplicandoinf39.setText("R-2");

        jCheckBox14.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox14.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox14ItemStateChanged(evt);
            }
        });

        estaaplicandoinf40.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        estaaplicandoinf40.setText("R-3");

        jCheckBox15.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox15.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox15ItemStateChanged(evt);
            }
        });

        estaaplicandoinf41.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        estaaplicandoinf41.setText("R-4");

        jCheckBox16.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox16.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox16ItemStateChanged(evt);
            }
        });

        estaaplicandoinf43.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        estaaplicandoinf43.setText("Admisiones Post-test");

        estaaplicandoinf44.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        estaaplicandoinf44.setText("Notas fase del test");

        jRadioButton6.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton6.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jRadioButton6.setText("Sí");
        jRadioButton6.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButton6ItemStateChanged(evt);
            }
        });

        jRadioButton7.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton7.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jRadioButton7.setText("No");
        jRadioButton7.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButton7ItemStateChanged(evt);
            }
        });

        jLabel29.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtnomevaluado.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtnomevaluado.setBorder(null);
        txtnomevaluado.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtnomevaluadoCaretUpdate(evt);
            }
        });
        txtnomevaluado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnomevaluadoActionPerformed(evt);
            }
        });
        txtnomevaluado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnomevaluadoKeyTyped(evt);
            }
        });

        jLabel32.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtnomevaluado1.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtnomevaluado1.setBorder(null);
        txtnomevaluado1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnomevaluado1ActionPerformed(evt);
            }
        });
        txtnomevaluado1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnomevaluado1KeyTyped(evt);
            }
        });

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/plus-symbol.png"))); // NOI18N
        jLabel14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });

        jLabel15.setBackground(new java.awt.Color(255, 255, 255));
        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/substract.png"))); // NOI18N
        jLabel15.setToolTipText("");
        jLabel15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });

        jLabel16.setBackground(new java.awt.Color(255, 255, 255));
        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/substract.png"))); // NOI18N
        jLabel16.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
        });

        estaaplicandoinf47.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        estaaplicandoinf47.setText("R-1.");

        r1_sub.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        r1_sub.setText("¿Cometió usted algún robo en alguno de sus empleos?");

        jButton5.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jButton5.setText("Editar R-1");
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        estaaplicandoinf48.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        estaaplicandoinf48.setText("R-2.");

        r2_sub.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        r2_sub.setText("¿Ha participado usted en alguna actividad delictiva?");

        jButton6.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jButton6.setText("Editar R-2");
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        estaaplicandoinf49.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        estaaplicandoinf49.setText("R-3.");

        estaaplicandoinf50.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        estaaplicandoinf50.setText("R-4.");

        r4_sub.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        r4_sub.setText("¿Ha recibido usted propuestas para cometer fraudes en Teleperformance?");

        r3_sub.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        r3_sub.setText("¿Ha participado usted en fraude en contra de Teleperformance?");

        jButton7.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jButton7.setText("Editar R-3");
        jButton7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jButton8.setText("Editar R-4");
        jButton8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        estaaplicandoinf51.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        estaaplicandoinf51.setText("R-5.");

        estaaplicandoinf52.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        estaaplicandoinf52.setText("R-6.");

        r6_sub.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        r6_sub.setText("¿Ha recibido usted propuestas para cometer fraudes en Teleperformance?");

        r5_sub.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        r5_sub.setText("¿Ha participado usted en fraude en contra de Teleperformance?");

        jButton9.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jButton9.setText("Editar R-5");
        jButton9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jButton10.setText("Editar R-6");
        jButton10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        estaaplicandoinf28.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        estaaplicandoinf28.setText("PNC");

        estaaplicandoinf30.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        estaaplicandoinf30.setText("INC");

        estaaplicandoinf31.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        estaaplicandoinf31.setText("NO");

        estaaplicandoinf32.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        estaaplicandoinf32.setText("NSR");

        srdesubtest.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        srdesubtest.setText("SR");

        estaaplicandoinf53.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        estaaplicandoinf53.setText("Resultado:");

        chbxamarillo1.setBackground(new java.awt.Color(255, 255, 255));
        chbxamarillo1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chbxamarillo1ItemStateChanged(evt);
            }
        });

        chbxamarillo2.setBackground(new java.awt.Color(255, 255, 255));
        chbxamarillo2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chbxamarillo2ItemStateChanged(evt);
            }
        });

        chbxamarillo3.setBackground(new java.awt.Color(255, 255, 255));
        chbxamarillo3.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chbxamarillo3ItemStateChanged(evt);
            }
        });

        chbxamarillo4.setBackground(new java.awt.Color(255, 255, 255));
        chbxamarillo4.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chbxamarillo4ItemStateChanged(evt);
            }
        });

        chbxamarillo5.setBackground(new java.awt.Color(255, 255, 255));
        chbxamarillo5.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chbxamarillo5ItemStateChanged(evt);
            }
        });

        estaaplicandoinf54.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        estaaplicandoinf54.setText("Resultado:");

        estaaplicandoinf55sdd.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        estaaplicandoinf55sdd.setText("SR");

        chbxamarillo6.setBackground(new java.awt.Color(255, 255, 255));
        chbxamarillo6.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chbxamarillo6ItemStateChanged(evt);
            }
        });

        estaaplicandoinf56.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        estaaplicandoinf56.setText("NSR");

        chbxamarillo7.setBackground(new java.awt.Color(255, 255, 255));
        chbxamarillo7.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chbxamarillo7ItemStateChanged(evt);
            }
        });

        estaaplicandoinf57.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        estaaplicandoinf57.setText("NO");

        chbxamarillo8.setBackground(new java.awt.Color(255, 255, 255));
        chbxamarillo8.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chbxamarillo8ItemStateChanged(evt);
            }
        });

        estaaplicandoinf58.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        estaaplicandoinf58.setText("PNC");

        chbxamarillo9.setBackground(new java.awt.Color(255, 255, 255));
        chbxamarillo9.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chbxamarillo9ItemStateChanged(evt);
            }
        });

        estaaplicandoinf59.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        estaaplicandoinf59.setText("INC");

        chbxamarillo10.setBackground(new java.awt.Color(255, 255, 255));
        chbxamarillo10.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chbxamarillo10ItemStateChanged(evt);
            }
        });

        estaaplicandoinf60.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        estaaplicandoinf60.setText("Resultado:");

        estaaplicandoinf61sd.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        estaaplicandoinf61sd.setText("SR");

        chbxamarillo11.setBackground(new java.awt.Color(255, 255, 255));
        chbxamarillo11.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chbxamarillo11ItemStateChanged(evt);
            }
        });

        estaaplicandoinf62.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        estaaplicandoinf62.setText("NSR");

        chbxamarillo12.setBackground(new java.awt.Color(255, 255, 255));
        chbxamarillo12.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chbxamarillo12ItemStateChanged(evt);
            }
        });

        estaaplicandoinf63.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        estaaplicandoinf63.setText("NO");

        chbxamarillo13.setBackground(new java.awt.Color(255, 255, 255));
        chbxamarillo13.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chbxamarillo13ItemStateChanged(evt);
            }
        });

        estaaplicandoinf64.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        estaaplicandoinf64.setText("PNC");

        chbxamarillo14.setBackground(new java.awt.Color(255, 255, 255));
        chbxamarillo14.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chbxamarillo14ItemStateChanged(evt);
            }
        });

        estaaplicandoinf65.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        estaaplicandoinf65.setText("INC");

        chbxamarillo15.setBackground(new java.awt.Color(255, 255, 255));
        chbxamarillo15.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chbxamarillo15ItemStateChanged(evt);
            }
        });

        estaaplicandoinf2.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        estaaplicandoinf2.setText("¿Qué tipo de técnica se utilizará en este examen de polígrafo?");

        estaaplicandoinf61.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        estaaplicandoinf61.setText("¿Cuál fue el sistema de polígrafo utilizado en la prueba?");

        cbxsistemaexam.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        cbxsistemaexam.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Lafayette", "Axcinton", "Stoelting", "Limestone" }));
        cbxsistemaexam.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxsistemaexamItemStateChanged(evt);
            }
        });
        cbxsistemaexam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxsistemaexamActionPerformed(evt);
            }
        });

        jRadioButton8.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton8.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jRadioButton8.setText("Sí");
        jRadioButton8.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButton8ItemStateChanged(evt);
            }
        });

        jRadioButton9.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton9.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jRadioButton9.setText("No");
        jRadioButton9.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButton9ItemStateChanged(evt);
            }
        });

        estaaplicandoinf66.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        estaaplicandoinf66.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        estaaplicandoinf66.setText("Tecnica");

        cbxsistemaexam1.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        cbxsistemaexam1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "DLST", "ZCTFEDERAL", "FASE USTED" }));
        cbxsistemaexam1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxsistemaexam1ItemStateChanged(evt);
            }
        });
        cbxsistemaexam1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxsistemaexam1ActionPerformed(evt);
            }
        });

        estaaplicandoinf67.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        estaaplicandoinf67.setText("Sub Test A");

        r1_fs.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        r1_fs.setText("R-1.");

        r1_sub1.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        r1_sub1.setText("¿Cometió usted algún robo en alguno de sus empleos?");

        r2_fs.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        r2_fs.setText("R-2.");

        r2_sub1.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        r2_sub1.setText("¿Ha participado usted en alguna actividad delictiva?");

        jButton12.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jButton12.setText("Editar R-1");
        jButton12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton13.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jButton13.setText("Editar R-2");
        jButton13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jRadioButton14.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton14.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jRadioButton14.setText("Por gráficas");
        jRadioButton14.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButton14ItemStateChanged(evt);
            }
        });
        jRadioButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton14ActionPerformed(evt);
            }
        });

        jRadioButton15.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton15.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jRadioButton15.setText("Por admisiones relevantes");
        jRadioButton15.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButton15ItemStateChanged(evt);
            }
        });
        jRadioButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton15ActionPerformed(evt);
            }
        });

        chbxamarillo16.setBackground(new java.awt.Color(255, 255, 255));
        chbxamarillo16.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        chbxamarillo16.setText("Fase sucesiva");
        chbxamarillo16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        chbxamarillo16.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chbxamarillo16ItemStateChanged(evt);
            }
        });

        r3_fs.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        r3_fs.setText("R-3.");

        r3_sub1.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        r3_sub1.setText("¿Ha participado usted en fraude en contra de Teleperformance?");

        jButton14.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jButton14.setText("Editar R-3");
        jButton14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel32, javax.swing.GroupLayout.DEFAULT_SIZE, 915, Short.MAX_VALUE)
                    .addComponent(txtnomevaluado1, javax.swing.GroupLayout.DEFAULT_SIZE, 915, Short.MAX_VALUE)
                    .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, 915, Short.MAX_VALUE)
                    .addComponent(txtnomevaluado, javax.swing.GroupLayout.DEFAULT_SIZE, 915, Short.MAX_VALUE)
                    .addComponent(jLabel156, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel159, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel145, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel148, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(estaaplicandoinf67, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addComponent(estaaplicandoinf11)
                                .addGap(27, 27, 27)
                                .addComponent(jLabel15))
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addComponent(estaaplicandoinf2, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbxestaaplicandoinf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(estaaplicandoinf14)
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(estaaplicandoinf16, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                                    .addComponent(estaaplicandoinf17, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                                    .addComponent(estaaplicandoinf18, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                                    .addComponent(estaaplicandoinf19, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                                    .addComponent(estaaplicandoinf15ppp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(28, 28, 28)
                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jRadioButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jRadioButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
                                    .addComponent(jRadioButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
                                    .addComponent(jRadioButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
                                    .addComponent(jRadioButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(20, 20, 20)
                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel12Layout.createSequentialGroup()
                                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel12Layout.createSequentialGroup()
                                                .addComponent(estaaplicandoinf24, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jCheckBox5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(20, 20, 20)
                                                .addComponent(estaaplicandoinf25, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                                                .addComponent(estaaplicandoinf20, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(20, 20, 20)
                                                .addComponent(estaaplicandoinf21, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(jPanel12Layout.createSequentialGroup()
                                                .addComponent(jCheckBox6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(20, 20, 20)
                                                .addComponent(estaaplicandoinf26, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel12Layout.createSequentialGroup()
                                                .addComponent(jCheckBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(20, 20, 20)
                                                .addComponent(estaaplicandoinf22, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jCheckBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jCheckBox7, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(20, 20, 20)
                                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel12Layout.createSequentialGroup()
                                                .addComponent(estaaplicandoinf23, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jCheckBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel12Layout.createSequentialGroup()
                                                .addComponent(estaaplicandoinf27, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jCheckBox8, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                                        .addComponent(estaaplicandoinf38, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jCheckBox13, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(21, 21, 21)
                                        .addComponent(estaaplicandoinf39, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jCheckBox14, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(estaaplicandoinf40, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jCheckBox15, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(22, 22, 22)
                                        .addComponent(estaaplicandoinf41, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jCheckBox16, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addComponent(estaaplicandoinf1)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel14))
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(estaaplicandoinf53)
                                .addGap(35, 35, 35)
                                .addComponent(srdesubtest, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(chbxamarillo5, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(estaaplicandoinf32, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(chbxamarillo4, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(estaaplicandoinf31, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(chbxamarillo3, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(estaaplicandoinf28, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(chbxamarillo1, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(estaaplicandoinf30, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(chbxamarillo2, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addComponent(estaaplicandoinf8)
                                .addGap(31, 31, 31)
                                .addComponent(jLabel13)
                                .addGap(33, 33, 33)
                                .addComponent(jLabel16))
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel142, javax.swing.GroupLayout.PREFERRED_SIZE, 654, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel12Layout.createSequentialGroup()
                                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(estaaplicandoinf36, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(estaaplicandoinf35, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                                            .addComponent(estaaplicandoinf37, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(estaaplicandoinf34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(r3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(r2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(r4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(r1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 573, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(10, 10, 10)
                                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jButton1)
                                            .addComponent(jButton2)
                                            .addComponent(jButton3)))
                                    .addComponent(jLabel143, javax.swing.GroupLayout.PREFERRED_SIZE, 654, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel147, javax.swing.GroupLayout.PREFERRED_SIZE, 654, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addComponent(estaaplicandoinf44)
                                .addGap(77, 77, 77)
                                .addComponent(jRadioButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel155, javax.swing.GroupLayout.PREFERRED_SIZE, 654, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel172, javax.swing.GroupLayout.PREFERRED_SIZE, 654, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel168, javax.swing.GroupLayout.PREFERRED_SIZE, 654, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel169, javax.swing.GroupLayout.PREFERRED_SIZE, 654, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel170, javax.swing.GroupLayout.PREFERRED_SIZE, 654, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel167, javax.swing.GroupLayout.PREFERRED_SIZE, 654, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel164, javax.swing.GroupLayout.PREFERRED_SIZE, 654, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel163, javax.swing.GroupLayout.PREFERRED_SIZE, 654, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel165, javax.swing.GroupLayout.PREFERRED_SIZE, 654, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel166, javax.swing.GroupLayout.PREFERRED_SIZE, 654, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel161, javax.swing.GroupLayout.PREFERRED_SIZE, 654, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel162, javax.swing.GroupLayout.PREFERRED_SIZE, 654, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel160, javax.swing.GroupLayout.PREFERRED_SIZE, 654, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel154, javax.swing.GroupLayout.PREFERRED_SIZE, 654, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel152, javax.swing.GroupLayout.PREFERRED_SIZE, 654, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel151, javax.swing.GroupLayout.PREFERRED_SIZE, 654, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel150, javax.swing.GroupLayout.PREFERRED_SIZE, 654, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel149, javax.swing.GroupLayout.PREFERRED_SIZE, 654, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel144, javax.swing.GroupLayout.PREFERRED_SIZE, 654, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel146, javax.swing.GroupLayout.PREFERRED_SIZE, 654, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel141, javax.swing.GroupLayout.PREFERRED_SIZE, 654, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addComponent(estaaplicandoinf51)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(r5_sub, javax.swing.GroupLayout.PREFERRED_SIZE, 573, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(jButton9))
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addComponent(estaaplicandoinf49)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(r3_sub, javax.swing.GroupLayout.PREFERRED_SIZE, 573, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(jButton7))
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addComponent(estaaplicandoinf47)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(r1_sub, javax.swing.GroupLayout.PREFERRED_SIZE, 573, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(jButton5))
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addComponent(estaaplicandoinf48)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(r2_sub, javax.swing.GroupLayout.PREFERRED_SIZE, 573, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(jButton6))
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addComponent(estaaplicandoinf50)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel12Layout.createSequentialGroup()
                                        .addComponent(estaaplicandoinf54)
                                        .addGap(35, 35, 35)
                                        .addComponent(estaaplicandoinf55sdd, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(chbxamarillo6, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(33, 33, 33)
                                        .addComponent(estaaplicandoinf56, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(chbxamarillo7, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(33, 33, 33)
                                        .addComponent(estaaplicandoinf57, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(chbxamarillo8, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(33, 33, 33)
                                        .addComponent(estaaplicandoinf58, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(chbxamarillo9, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(33, 33, 33)
                                        .addComponent(estaaplicandoinf59, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(chbxamarillo10, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel12Layout.createSequentialGroup()
                                        .addComponent(r4_sub, javax.swing.GroupLayout.PREFERRED_SIZE, 573, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(10, 10, 10)
                                        .addComponent(jButton8))))
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addComponent(estaaplicandoinf52)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel12Layout.createSequentialGroup()
                                        .addComponent(estaaplicandoinf60)
                                        .addGap(35, 35, 35)
                                        .addComponent(estaaplicandoinf61sd, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(chbxamarillo11, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(33, 33, 33)
                                        .addComponent(estaaplicandoinf62, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(chbxamarillo12, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(33, 33, 33)
                                        .addComponent(estaaplicandoinf63, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(chbxamarillo13, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(33, 33, 33)
                                        .addComponent(estaaplicandoinf64, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(chbxamarillo14, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(33, 33, 33)
                                        .addComponent(estaaplicandoinf65, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(chbxamarillo15, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel12Layout.createSequentialGroup()
                                        .addComponent(r6_sub, javax.swing.GroupLayout.PREFERRED_SIZE, 573, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(10, 10, 10)
                                        .addComponent(jButton10))))
                            .addComponent(jLabel158, javax.swing.GroupLayout.PREFERRED_SIZE, 587, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addComponent(estaaplicandoinf29)
                                .addGap(55, 55, 55)
                                .addComponent(rojo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(chbxrojo)
                                .addGap(29, 29, 29)
                                .addComponent(verde)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(chbxverde)
                                .addGap(102, 102, 102)
                                .addComponent(jRadioButton14)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButton15))
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addComponent(r1_fs)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(r1_sub1, javax.swing.GroupLayout.PREFERRED_SIZE, 573, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(jButton12))
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(estaaplicandoinf66, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(estaaplicandoinf61, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(3, 3, 3)
                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cbxsistemaexam, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cbxsistemaexam1, 0, 196, Short.MAX_VALUE)))
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addComponent(estaaplicandoinf43)
                                .addGap(60, 60, 60)
                                .addComponent(jRadioButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel12Layout.createSequentialGroup()
                                    .addComponent(r3_fs)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(r3_sub1, javax.swing.GroupLayout.PREFERRED_SIZE, 573, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(10, 10, 10)
                                    .addComponent(jButton14))
                                .addGroup(jPanel12Layout.createSequentialGroup()
                                    .addComponent(r2_fs)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(r2_sub1, javax.swing.GroupLayout.PREFERRED_SIZE, 573, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(10, 10, 10)
                                    .addComponent(jButton13))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(30, 30, 30))
            .addComponent(chbxamarillo16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(estaaplicandoinf2)
                    .addComponent(cbxestaaplicandoinf, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel141, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(r1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(estaaplicandoinf34, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(jLabel142, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(r2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(estaaplicandoinf35, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(jLabel143, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(r3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3)
                    .addComponent(estaaplicandoinf36, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(jLabel147, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(estaaplicandoinf37, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(r4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton4)))
                .addGap(0, 0, 0)
                .addComponent(jLabel145, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jLabel148, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel146, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(estaaplicandoinf14, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel144, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(estaaplicandoinf15ppp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(estaaplicandoinf20, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(estaaplicandoinf21, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(estaaplicandoinf22, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(estaaplicandoinf23, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jCheckBox2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(jLabel149, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(estaaplicandoinf16, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(estaaplicandoinf24, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(estaaplicandoinf25, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(estaaplicandoinf26, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(estaaplicandoinf27, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jCheckBox5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(jLabel150, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(estaaplicandoinf17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(jLabel151, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(estaaplicandoinf18, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(jLabel152, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(estaaplicandoinf19, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(estaaplicandoinf38, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(estaaplicandoinf39, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(estaaplicandoinf40, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(estaaplicandoinf41, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jCheckBox14, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jCheckBox13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jCheckBox15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jCheckBox16, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(jLabel154, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jLabel158, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(estaaplicandoinf1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(jLabel160, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(r1_sub, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5)
                    .addComponent(estaaplicandoinf47, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(jLabel162, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(r2_sub, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6)
                    .addComponent(estaaplicandoinf48, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(jLabel161, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(estaaplicandoinf28, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(estaaplicandoinf53, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(srdesubtest, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(chbxamarillo5, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(estaaplicandoinf32, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chbxamarillo4, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(estaaplicandoinf31, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chbxamarillo3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chbxamarillo1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(estaaplicandoinf30, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chbxamarillo2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(jLabel166, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(estaaplicandoinf8, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(jLabel165, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(r3_sub, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7)
                    .addComponent(estaaplicandoinf49, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(jLabel163, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(r4_sub, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8)
                    .addComponent(estaaplicandoinf50, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(jLabel164, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(estaaplicandoinf58, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(estaaplicandoinf54, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(estaaplicandoinf55sdd, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(chbxamarillo6, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(estaaplicandoinf56, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chbxamarillo7, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(estaaplicandoinf57, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chbxamarillo8, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chbxamarillo9, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(estaaplicandoinf59, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chbxamarillo10, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(jLabel167, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(estaaplicandoinf11, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(jLabel170, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(r5_sub, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton9)
                    .addComponent(estaaplicandoinf51, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(jLabel169, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(r6_sub, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton10)
                    .addComponent(estaaplicandoinf52, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(jLabel168, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(estaaplicandoinf64, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(estaaplicandoinf60, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(estaaplicandoinf61sd, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(chbxamarillo11, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(estaaplicandoinf62, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chbxamarillo12, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(estaaplicandoinf63, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chbxamarillo13, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chbxamarillo14, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(estaaplicandoinf65, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chbxamarillo15, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addComponent(chbxamarillo16, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(estaaplicandoinf43, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jRadioButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jRadioButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0)
                .addComponent(jLabel155, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txtnomevaluado, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel156, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(estaaplicandoinf44, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(jLabel159, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txtnomevaluado1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel172, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(estaaplicandoinf61)
                    .addComponent(cbxsistemaexam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(estaaplicandoinf66)
                    .addComponent(cbxsistemaexam1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(estaaplicandoinf67)
                .addGap(18, 18, 18)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(r1_sub1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton12)
                    .addComponent(r1_fs, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(r2_sub1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton13)
                    .addComponent(r2_fs, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(r3_sub1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton14)
                    .addComponent(r3_fs, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chbxrojo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jRadioButton14)
                                .addComponent(jRadioButton15))
                            .addComponent(verde, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chbxverde, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rojo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(estaaplicandoinf29, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(24, 24, 24))
        );

        jScrollPane1.setViewportView(jPanel12);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 975, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane1))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 550, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel12MouseClicked
        System.out.println("el módulo 12 ha sido elegido");
    }//GEN-LAST:event_jPanel12MouseClicked

    private void cbxestaaplicandoinfItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxestaaplicandoinfItemStateChanged
        String v = cbxestaaplicandoinf.getSelectedItem().toString();
        String d = cbxsistemaexam.getSelectedItem().toString();
        TecnicaYPreguntas.setTecnicaExamen(v);
        TecnicaYPreguntas.setSistemaUtilizadoExamen(d);
        if ("AFMGQT V2 4R".equals(v)) {
            DatoGeneral.btnTerminar.setVisible(true);
            jButton1.setVisible(true);
            chbxamarillo16.setVisible(true);
            TecnicaYPreguntas.setV_sub_a("nohay");
            TecnicaYPreguntas.setV_sub_b("nohay");
            TecnicaYPreguntas.setV_sub_c("nohay");
            estaaplicandoinf44.setVisible(true);
            txtnomevaluado1.setVisible(true);
            jLabel32.setVisible(true);
            jLabel159.setVisible(true);
            jLabel158.setVisible(true);
            chbxamarillo16.setVisible(true);
            DatoGeneral.btnsave.setVisible(false);
//            DatoGeneral.jLabel16.setVisible(true);
            DatoGeneral.jPanel21.setVisible(false);
            estaaplicandoinf61.setVisible(true);
            cbxsistemaexam.setVisible(true);
            //DLST
            //sub a
            srdesubtest.setVisible(false);
            estaaplicandoinf1.setVisible(false);
            jLabel14.setVisible(false);
            jLabel160.setVisible(false);
            estaaplicandoinf47.setVisible(false);
            r1_sub.setVisible(false);
            jButton5.setVisible(false);
            jLabel162.setVisible(false);
            estaaplicandoinf48.setVisible(false);
            r2_sub.setVisible(false);
            jButton6.setVisible(false);
            jLabel161.setVisible(false);
            estaaplicandoinf53.setVisible(false);
            chbxamarillo5.setVisible(false);
            estaaplicandoinf32.setVisible(false);
            chbxamarillo4.setVisible(false);
            estaaplicandoinf31.setVisible(false);
            chbxamarillo3.setVisible(false);
            estaaplicandoinf28.setVisible(false);
            chbxamarillo1.setVisible(false);
            estaaplicandoinf30.setVisible(false);
            chbxamarillo2.setVisible(false);
            jLabel166.setVisible(false); //espacio

            //sub b
            estaaplicandoinf8.setVisible(false);
            jLabel13.setVisible(false);
            jLabel16.setVisible(false);
            jLabel165.setVisible(false);
            estaaplicandoinf49.setVisible(false);
            r3_sub.setVisible(false);
            jButton7.setVisible(false);
            jLabel163.setVisible(false);
            estaaplicandoinf50.setVisible(false);
            r4_sub.setVisible(false);
            jButton8.setVisible(false);
            jLabel164.setVisible(false);
            estaaplicandoinf54.setVisible(false);
            estaaplicandoinf55sdd.setVisible(false);
            chbxamarillo6.setVisible(false);
            estaaplicandoinf56.setVisible(false);
            chbxamarillo7.setVisible(false);
            estaaplicandoinf57.setVisible(false);
            chbxamarillo8.setVisible(false);
            estaaplicandoinf58.setVisible(false);
            chbxamarillo9.setVisible(false);
            estaaplicandoinf59.setVisible(false);
            chbxamarillo10.setVisible(false);
            jLabel167.setVisible(false);

            //sub c
            estaaplicandoinf11.setVisible(false);
            jLabel15.setVisible(false);
            jLabel170.setVisible(false);
            estaaplicandoinf51.setVisible(false);
            r5_sub.setVisible(false);
            jButton9.setVisible(false);
            jLabel169.setVisible(false);
            estaaplicandoinf52.setVisible(false);
            r6_sub.setVisible(false);
            jButton10.setVisible(false);
            jLabel168.setVisible(false);
            estaaplicandoinf60.setVisible(false);
            estaaplicandoinf61sd.setVisible(false);
            chbxamarillo11.setVisible(false);
            estaaplicandoinf62.setVisible(false);
            chbxamarillo12.setVisible(false);
            estaaplicandoinf63.setVisible(false);
            chbxamarillo13.setVisible(false);
            estaaplicandoinf64.setVisible(false);
            chbxamarillo14.setVisible(false);
            estaaplicandoinf65.setVisible(false);
            chbxamarillo15.setVisible(false);


            //AFMGQT V2 4R
            estaaplicandoinf34.setVisible(true);
            r1.setVisible(true);
            jButton1.setVisible(true);
            jLabel142.setVisible(true);
            estaaplicandoinf35.setVisible(true);
            r2.setVisible(true);
            jButton2.setVisible(true);
            jLabel143.setVisible(true);
            estaaplicandoinf36.setVisible(true);
            r3.setVisible(true);
            jButton3.setVisible(true);
            jLabel147.setVisible(true);
            estaaplicandoinf37.setVisible(true);
            r4.setVisible(true);
            jButton4.setVisible(true);
            jLabel145.setVisible(true);
//            jLabel30.setVisible(true);
            jLabel148.setVisible(true);
            //diagnostico
            estaaplicandoinf14.setVisible(true);
            jLabel144.setVisible(true);
            //1
            estaaplicandoinf15ppp.setVisible(true);
            jRadioButton1.setVisible(true);
            estaaplicandoinf20.setVisible(false);
            jCheckBox1.setVisible(false);
            estaaplicandoinf21.setVisible(false);
            jCheckBox2.setVisible(false);
            estaaplicandoinf22.setVisible(false);
            jCheckBox3.setVisible(false);
            estaaplicandoinf23.setVisible(false);
            jCheckBox4.setVisible(false);
            jLabel149.setVisible(true);
            //2
            estaaplicandoinf16.setVisible(true);
            jRadioButton2.setVisible(true);
            estaaplicandoinf24.setVisible(false);
            jCheckBox5.setVisible(false);
            estaaplicandoinf25.setVisible(false);
            jCheckBox6.setVisible(false);
            estaaplicandoinf26.setVisible(false);
            jCheckBox7.setVisible(false);
            estaaplicandoinf27.setVisible(false);
            jCheckBox8.setVisible(false);
            jLabel150.setVisible(true);
            //3
            estaaplicandoinf17.setVisible(true);
            jRadioButton3.setVisible(true);
            jLabel151.setVisible(true);
            //4
            estaaplicandoinf18.setVisible(true);
            jRadioButton4.setVisible(true);
            jLabel152.setVisible(true);
            //5
            estaaplicandoinf19.setVisible(true);
            jRadioButton5.setVisible(true);
            estaaplicandoinf38.setVisible(false);
            jCheckBox13.setVisible(false);
            estaaplicandoinf39.setVisible(false);
            jCheckBox14.setVisible(false);
            estaaplicandoinf40.setVisible(false);
            jCheckBox15.setVisible(false);
            estaaplicandoinf41.setVisible(false);
            jCheckBox16.setVisible(false);
            jLabel154.setVisible(true);
//            jLabel31.setVisible(true);
            //admisiones
            estaaplicandoinf43.setVisible(true);
            jRadioButton6.setVisible(true);
            jRadioButton7.setVisible(true);
            jLabel155.setVisible(false);
            txtnomevaluado.setVisible(false);
            jLabel29.setVisible(false);
            jLabel156.setVisible(true);

            //color
            estaaplicandoinf29.setVisible(true);
            rojo.setVisible(true);
            chbxrojo.setVisible(true);
            verde.setVisible(true);
            chbxverde.setVisible(true);

        } else if ("Seleccione".equals(v)) {
            DatoGeneral.btnTerminar.setVisible(false);
            TecnicaYPreguntas.setEstado_fs("nohay");
            noverlos();
            TecnicaYPreguntas.setV_sub_a("nohay");
            TecnicaYPreguntas.setV_sub_b("nohay");
            TecnicaYPreguntas.setV_sub_c("nohay");
//            DatoGeneral.jLabel16.setVisible(false);
            DatoGeneral.btnsave.setVisible(true);
            DatoGeneral.jPanel21.setVisible(true);
        } else if ("DLST".equals(v)) {
            DatoGeneral.btnTerminar.setVisible(true);
            jButton1.setVisible(true);
            chbxamarillo16.setVisible(true);
            TecnicaYPreguntas.setV_sub_a("hay");
            estaaplicandoinf44.setVisible(true);
            txtnomevaluado1.setVisible(true);
            jLabel32.setVisible(true);
            jLabel159.setVisible(true);
            jLabel158.setVisible(true);
            chbxamarillo16.setVisible(true);
//            DatoGeneral.jLabel16.setVisible(true);
            DatoGeneral.btnsave.setVisible(false);
            DatoGeneral.jPanel21.setVisible(false);
            estaaplicandoinf61.setVisible(true);
            cbxsistemaexam.setVisible(true);
            //DLST
            //sub a
            srdesubtest.setVisible(true);
            estaaplicandoinf1.setVisible(true);
            jLabel14.setVisible(true);
            jLabel160.setVisible(true);
            estaaplicandoinf47.setVisible(true);
            r1_sub.setVisible(true);
            jButton5.setVisible(true);
            jLabel162.setVisible(true);
            estaaplicandoinf48.setVisible(true);
            r2_sub.setVisible(true);
            jButton6.setVisible(true);
            jLabel161.setVisible(true);
            estaaplicandoinf53.setVisible(true);
            chbxamarillo5.setVisible(true);
            estaaplicandoinf32.setVisible(true);
            chbxamarillo4.setVisible(true);
            estaaplicandoinf31.setVisible(true);
            chbxamarillo3.setVisible(true);
            estaaplicandoinf28.setVisible(true);
            chbxamarillo1.setVisible(true);
            estaaplicandoinf30.setVisible(true);
            chbxamarillo2.setVisible(true);
            jLabel166.setVisible(true); //espacio

            //sub b
            estaaplicandoinf8.setVisible(false);
            jLabel13.setVisible(false);
            jLabel16.setVisible(false);
            jLabel165.setVisible(false);
            estaaplicandoinf49.setVisible(false);
            r3_sub.setVisible(false);
            jButton7.setVisible(false);
            jLabel163.setVisible(false);
            estaaplicandoinf50.setVisible(false);
            r4_sub.setVisible(false);
            jButton8.setVisible(false);
            jLabel164.setVisible(false);
            estaaplicandoinf54.setVisible(false);
            estaaplicandoinf55sdd.setVisible(false);
            chbxamarillo6.setVisible(false);
            estaaplicandoinf56.setVisible(false);
            chbxamarillo7.setVisible(false);
            estaaplicandoinf57.setVisible(false);
            chbxamarillo8.setVisible(false);
            estaaplicandoinf58.setVisible(false);
            chbxamarillo9.setVisible(false);
            estaaplicandoinf59.setVisible(false);
            chbxamarillo10.setVisible(false);
            jLabel167.setVisible(false);

            //sub c
            estaaplicandoinf11.setVisible(false);
            jLabel15.setVisible(false);
            jLabel170.setVisible(false);
            estaaplicandoinf51.setVisible(false);
            r5_sub.setVisible(false);
            jButton9.setVisible(false);
            jLabel169.setVisible(false);
            estaaplicandoinf52.setVisible(false);
            r6_sub.setVisible(false);
            jButton10.setVisible(false);
            jLabel168.setVisible(false);
            estaaplicandoinf60.setVisible(false);
            estaaplicandoinf61sd.setVisible(false);
            chbxamarillo11.setVisible(false);
            estaaplicandoinf62.setVisible(false);
            chbxamarillo12.setVisible(false);
            estaaplicandoinf63.setVisible(false);
            chbxamarillo13.setVisible(false);
            estaaplicandoinf64.setVisible(false);
            chbxamarillo14.setVisible(false);
            estaaplicandoinf65.setVisible(false);
            chbxamarillo15.setVisible(false);

            //AFMGQT V2 4R
            estaaplicandoinf34.setVisible(false);
            r1.setVisible(false);
            jButton1.setVisible(false);
            jLabel142.setVisible(false);
            estaaplicandoinf35.setVisible(false);
            r2.setVisible(false);
            jButton2.setVisible(false);
            jLabel143.setVisible(false);
            estaaplicandoinf36.setVisible(false);
            r3.setVisible(false);
            jButton3.setVisible(false);
            jLabel147.setVisible(false);
            estaaplicandoinf37.setVisible(false);
            r4.setVisible(false);
            jButton4.setVisible(false);
            jLabel145.setVisible(false);
//            jLabel30.setVisible(false);
            jLabel148.setVisible(false);
            //diagnostico
            estaaplicandoinf14.setVisible(false);
            jLabel144.setVisible(false);
            //1
            estaaplicandoinf15ppp.setVisible(false);
            jRadioButton1.setVisible(false);
            estaaplicandoinf20.setVisible(false);
            jCheckBox1.setVisible(false);
            estaaplicandoinf21.setVisible(false);

            jCheckBox2.setVisible(false);
            estaaplicandoinf22.setVisible(false);
            jCheckBox3.setVisible(false);
            estaaplicandoinf23.setVisible(false);
            jCheckBox4.setVisible(false);
            jLabel149.setVisible(false);
            //2
            estaaplicandoinf16.setVisible(false);
            jRadioButton2.setVisible(false);
            estaaplicandoinf24.setVisible(false);
            jCheckBox5.setVisible(false);
            estaaplicandoinf25.setVisible(false);
            jCheckBox6.setVisible(false);
            estaaplicandoinf26.setVisible(false);
            jCheckBox7.setVisible(false);
            estaaplicandoinf27.setVisible(false);
            jCheckBox8.setVisible(false);
            jLabel150.setVisible(false);
            //3
            estaaplicandoinf17.setVisible(false);
            jRadioButton3.setVisible(false);
            jLabel151.setVisible(false);
            //4
            estaaplicandoinf18.setVisible(false);
            jRadioButton4.setVisible(false);
            jLabel152.setVisible(false);
            //5
            estaaplicandoinf19.setVisible(false);
            jRadioButton5.setVisible(false);
            estaaplicandoinf38.setVisible(false);
            jCheckBox13.setVisible(false);
            estaaplicandoinf39.setVisible(false);
            jCheckBox14.setVisible(false);
            estaaplicandoinf40.setVisible(false);
            jCheckBox15.setVisible(false);
            estaaplicandoinf41.setVisible(false);
            jCheckBox16.setVisible(false);
            jLabel154.setVisible(false);
//            jLabel31.setVisible(false);
            //admisiones
            estaaplicandoinf43.setVisible(false);
            jRadioButton6.setVisible(false);
            jRadioButton7.setVisible(false);
            jLabel155.setVisible(false);
            txtnomevaluado.setVisible(false);
            jLabel29.setVisible(false);
            jLabel156.setVisible(false);

            //color
            estaaplicandoinf29.setVisible(true);
            rojo.setVisible(true);
            chbxrojo.setVisible(true);
            verde.setVisible(true);
            chbxverde.setVisible(true);
        }
    }//GEN-LAST:event_cbxestaaplicandoinfItemStateChanged

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        jLabel13.setVisible(false);
        jLabel16.setVisible(false);
//sub c
        TecnicaYPreguntas.setV_sub_c("hay");
        estaaplicandoinf11.setVisible(true);
        jLabel15.setVisible(true);
        jLabel170.setVisible(true);
        estaaplicandoinf51.setVisible(true);
        r5_sub.setVisible(true);
        jButton9.setVisible(true);
        jLabel169.setVisible(true);
        estaaplicandoinf52.setVisible(true);
        r6_sub.setVisible(true);
        jButton10.setVisible(true);
        jLabel168.setVisible(true);
        estaaplicandoinf60.setVisible(true);
        estaaplicandoinf61sd.setVisible(true);
        chbxamarillo11.setVisible(true);
        estaaplicandoinf62.setVisible(true);
        chbxamarillo12.setVisible(true);
        estaaplicandoinf63.setVisible(true);
        chbxamarillo13.setVisible(true);
        estaaplicandoinf64.setVisible(true);
        chbxamarillo14.setVisible(true);
        estaaplicandoinf65.setVisible(true);
        chbxamarillo15.setVisible(true);
    }//GEN-LAST:event_jLabel13MouseClicked

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String pr = JOptionPane.showInputDialog(null, "Digite la nueva pregunta");
        if (pr.equals("")) {
            JOptionPane.showMessageDialog(null, "¡Debe introducir una pregunta!", "Edición de preguntas", JOptionPane.ERROR_MESSAGE);
        } else {
            r1.setText(pr);
            JOptionPane.showMessageDialog(null, "¡Pregunta editada!  :D", "Edición de preguntas", JOptionPane.INFORMATION_MESSAGE);
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String pr = JOptionPane.showInputDialog(null, "Digite la nueva pregunta");
        if (pr.equals("")) {
            JOptionPane.showMessageDialog(null, "¡Debe introducir una pregunta!", "Edición de preguntas", JOptionPane.ERROR_MESSAGE);
        } else {
            r2.setText(pr);
            JOptionPane.showMessageDialog(null, "¡Pregunta editada!  :D", "Edición de preguntas", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String pr = JOptionPane.showInputDialog(null, "Digite la nueva pregunta");
        if (pr.equals("")) {
            JOptionPane.showMessageDialog(null, "¡Debe introducir una pregunta!", "Edición de preguntas", JOptionPane.ERROR_MESSAGE);
        } else {
            r3.setText(pr);
            JOptionPane.showMessageDialog(null, "¡Pregunta editada!  :D", "Edición de preguntas", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        String pr = JOptionPane.showInputDialog(null, "Digite la nueva pregunta");
        if (pr.equals("")) {
            JOptionPane.showMessageDialog(null, "¡Debe introducir una pregunta!", "Edición de preguntas", JOptionPane.ERROR_MESSAGE);
        } else {
            r4.setText(pr);
            JOptionPane.showMessageDialog(null, "¡Pregunta editada!  :D", "Edición de preguntas", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jRadioButton2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton2ItemStateChanged
        if (jRadioButton2.isSelected()) {
            TecnicaYPreguntas.setDiagnosticoExamen("NSR");
            jRadioButton1.setSelected(false);
            estaaplicandoinf20.setVisible(false);
            estaaplicandoinf21.setVisible(false);
            estaaplicandoinf22.setVisible(false);
            estaaplicandoinf23.setVisible(false);
            jCheckBox1.setVisible(false);
            jCheckBox2.setVisible(false);
            jCheckBox3.setVisible(false);
            jCheckBox4.setVisible(false);
            jRadioButton3.setSelected(false);
            jRadioButton4.setSelected(false);
            jRadioButton5.setSelected(false);
            jCheckBox5.setSelected(true);
            jCheckBox6.setSelected(true);
            jCheckBox7.setSelected(true);
            jCheckBox8.setSelected(true);
            jCheckBox5.setVisible(true);
            jCheckBox6.setVisible(true);
            jCheckBox7.setVisible(true);
            jCheckBox8.setVisible(true);
            estaaplicandoinf24.setVisible(true);
            estaaplicandoinf25.setVisible(true);
            estaaplicandoinf26.setVisible(true);
            estaaplicandoinf27.setVisible(true);

            estaaplicandoinf44.setVisible(false);
            txtnomevaluado1.setVisible(false);
            jLabel32.setVisible(false);
            jLabel159.setVisible(false);
            jLabel158.setVisible(false);

        } else {
            TecnicaYPreguntas.setDiagnosticoExamen("");
            jCheckBox5.setSelected(false);
            jCheckBox6.setSelected(false);
            jCheckBox7.setSelected(false);
            jCheckBox8.setSelected(false);
            jCheckBox5.setVisible(false);
            jCheckBox6.setVisible(false);
            jCheckBox7.setVisible(false);
            jCheckBox8.setVisible(false);
            estaaplicandoinf24.setVisible(false);
            estaaplicandoinf25.setVisible(false);
            estaaplicandoinf26.setVisible(false);
            estaaplicandoinf27.setVisible(false);
        }
    }//GEN-LAST:event_jRadioButton2ItemStateChanged

    private void jRadioButton1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton1ItemStateChanged
        if (jRadioButton1.isSelected()) {
            jRadioButton2.setSelected(false);
            jRadioButton3.setSelected(false);
            jRadioButton4.setSelected(false);
            jRadioButton5.setSelected(false);

            estaaplicandoinf20.setVisible(true);
            estaaplicandoinf21.setVisible(true);
            estaaplicandoinf22.setVisible(true);
            estaaplicandoinf23.setVisible(true);
            jCheckBox1.setVisible(true);
            jCheckBox2.setVisible(true);
            jCheckBox3.setVisible(true);
            jCheckBox4.setVisible(true);

            jCheckBox5.setSelected(false);
            jCheckBox6.setSelected(false);
            jCheckBox7.setSelected(false);
            jCheckBox8.setSelected(false);
            jCheckBox5.setVisible(false);
            jCheckBox6.setVisible(false);
            jCheckBox7.setVisible(false);
            jCheckBox8.setVisible(false);
            estaaplicandoinf24.setVisible(false);
            estaaplicandoinf25.setVisible(false);
            estaaplicandoinf26.setVisible(false);
            estaaplicandoinf27.setVisible(false);

            estaaplicandoinf38.setVisible(false);
            estaaplicandoinf39.setVisible(false);
            estaaplicandoinf40.setVisible(false);
            estaaplicandoinf41.setVisible(false);
            jCheckBox13.setVisible(false);
            jCheckBox14.setVisible(false);
            jCheckBox15.setVisible(false);
            jCheckBox16.setVisible(false);
            jCheckBox13.setSelected(false);
            jCheckBox14.setSelected(false);
            jCheckBox15.setSelected(false);
            jCheckBox16.setSelected(false);

            TecnicaYPreguntas.setDiagnosticoExamen("SR");

        } else {
            TecnicaYPreguntas.setDiagnosticoExamen("");
            jRadioButton2.setSelected(false);
            jRadioButton3.setSelected(false);
            jRadioButton4.setSelected(false);
            jRadioButton5.setSelected(false);

            estaaplicandoinf20.setVisible(false);
            estaaplicandoinf21.setVisible(false);
            estaaplicandoinf22.setVisible(false);
            estaaplicandoinf23.setVisible(false);
            jCheckBox1.setVisible(false);
            jCheckBox2.setVisible(false);
            jCheckBox3.setVisible(false);
            jCheckBox4.setVisible(false);

            jCheckBox5.setSelected(false);
            jCheckBox6.setSelected(false);
            jCheckBox7.setSelected(false);
            jCheckBox8.setSelected(false);
            jCheckBox5.setVisible(false);
            jCheckBox6.setVisible(false);
            jCheckBox7.setVisible(false);
            jCheckBox8.setVisible(false);
            estaaplicandoinf24.setVisible(false);
            estaaplicandoinf25.setVisible(false);
            estaaplicandoinf26.setVisible(false);
            estaaplicandoinf27.setVisible(false);

            estaaplicandoinf38.setVisible(false);
            estaaplicandoinf39.setVisible(false);
            estaaplicandoinf40.setVisible(false);
            estaaplicandoinf41.setVisible(false);
            jCheckBox13.setVisible(false);
            jCheckBox14.setVisible(false);
            jCheckBox15.setVisible(false);
            jCheckBox16.setVisible(false);
            jCheckBox13.setSelected(false);
            jCheckBox14.setSelected(false);
            jCheckBox15.setSelected(false);
            jCheckBox16.setSelected(false);
        }
    }//GEN-LAST:event_jRadioButton1ItemStateChanged

    private void jCheckBox13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox13ActionPerformed

    private void jRadioButton5ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton5ItemStateChanged
        if (jRadioButton5.isSelected()) {
            TecnicaYPreguntas.setDiagnosticoExamen("INC");
            jRadioButton2.setSelected(false);
            jRadioButton1.setSelected(false);
            jRadioButton3.setSelected(false);
            jRadioButton4.setSelected(false);
            estaaplicandoinf38.setVisible(true);
            estaaplicandoinf39.setVisible(true);
            estaaplicandoinf40.setVisible(true);
            estaaplicandoinf41.setVisible(true);
            jCheckBox13.setVisible(true);
            jCheckBox14.setVisible(true);
            jCheckBox15.setVisible(true);
            jCheckBox16.setVisible(true);

            estaaplicandoinf20.setVisible(false);
            estaaplicandoinf21.setVisible(false);
            estaaplicandoinf22.setVisible(false);
            estaaplicandoinf23.setVisible(false);
            jCheckBox1.setVisible(false);
            jCheckBox2.setVisible(false);
            jCheckBox3.setVisible(false);
            jCheckBox4.setVisible(false);

            jCheckBox5.setSelected(false);
            jCheckBox6.setSelected(false);
            jCheckBox7.setSelected(false);
            jCheckBox8.setSelected(false);
            jCheckBox5.setVisible(false);
            jCheckBox6.setVisible(false);
            jCheckBox7.setVisible(false);
            jCheckBox8.setVisible(false);
            estaaplicandoinf24.setVisible(false);
            estaaplicandoinf25.setVisible(false);
            estaaplicandoinf26.setVisible(false);
            estaaplicandoinf27.setVisible(false);

            estaaplicandoinf44.setVisible(false);
            txtnomevaluado1.setVisible(false);
            jLabel32.setVisible(false);
            jLabel159.setVisible(false);
            jLabel158.setVisible(false);
        } else {
            TecnicaYPreguntas.setDiagnosticoExamen("");
            jRadioButton2.setSelected(false);
            jRadioButton1.setSelected(false);
            jRadioButton3.setSelected(false);
            jRadioButton4.setSelected(false);
            estaaplicandoinf38.setVisible(false);
            estaaplicandoinf39.setVisible(false);
            estaaplicandoinf40.setVisible(false);
            estaaplicandoinf41.setVisible(false);
            jCheckBox13.setVisible(false);
            jCheckBox14.setVisible(false);
            jCheckBox15.setVisible(false);
            jCheckBox16.setVisible(false);

            estaaplicandoinf20.setVisible(false);
            estaaplicandoinf21.setVisible(false);
            estaaplicandoinf22.setVisible(false);
            estaaplicandoinf23.setVisible(false);
            jCheckBox1.setVisible(false);
            jCheckBox2.setVisible(false);
            jCheckBox3.setVisible(false);
            jCheckBox4.setVisible(false);

            jCheckBox5.setSelected(false);
            jCheckBox6.setSelected(false);
            jCheckBox7.setSelected(false);
            jCheckBox8.setSelected(false);
            jCheckBox5.setVisible(false);
            jCheckBox6.setVisible(false);
            jCheckBox7.setVisible(false);
            jCheckBox8.setVisible(false);
            estaaplicandoinf24.setVisible(false);
            estaaplicandoinf25.setVisible(false);
            estaaplicandoinf26.setVisible(false);
            estaaplicandoinf27.setVisible(false);
        }
    }//GEN-LAST:event_jRadioButton5ItemStateChanged

    private void jRadioButton3ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton3ItemStateChanged
        if (jRadioButton3.isSelected()) {
            TecnicaYPreguntas.setDiagnosticoExamen("NO");
            jRadioButton2.setSelected(false);
            jRadioButton1.setSelected(false);
            jRadioButton4.setSelected(false);
            jRadioButton5.setSelected(false);
        } else {
            TecnicaYPreguntas.setDiagnosticoExamen("");
        }

    }//GEN-LAST:event_jRadioButton3ItemStateChanged

    private void jRadioButton4ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton4ItemStateChanged
        if (jRadioButton4.isSelected()) {
            TecnicaYPreguntas.setDiagnosticoExamen("PNC");
            jRadioButton2.setSelected(false);
            jRadioButton1.setSelected(false);
            jRadioButton3.setSelected(false);
            jRadioButton5.setSelected(false);
        } else {
            TecnicaYPreguntas.setDiagnosticoExamen("");
        }
    }//GEN-LAST:event_jRadioButton4ItemStateChanged

    private void jRadioButton6ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton6ItemStateChanged
        if (jRadioButton6.isSelected()) {
            jRadioButton7.setSelected(false);
            txtnomevaluado.setVisible(true);
            jLabel29.setVisible(true);
            jLabel155.setVisible(true);
            Admisiones.setAdmTYP("hay");
        } else if (!jRadioButton6.isSelected()) {
            Admisiones.setAdmTYP("nohay");
            jRadioButton7.setSelected(false);
            txtnomevaluado.setVisible(false);
            jLabel29.setVisible(false);
            jLabel155.setVisible(false);
        }
    }//GEN-LAST:event_jRadioButton6ItemStateChanged

    private void jRadioButton7ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton7ItemStateChanged
        if (jRadioButton7.isSelected()) {
            jRadioButton6.setSelected(false);
            txtnomevaluado.setVisible(false);
            jLabel29.setVisible(false);
            jLabel155.setVisible(false);
            Admisiones.setAdmTYP("nohay");
        } else if (!jRadioButton7.isSelected()) {
            jRadioButton6.setSelected(false);
            txtnomevaluado.setVisible(false);
            jLabel29.setVisible(false);
            jLabel155.setVisible(false);
            Admisiones.setAdmTYP("nohay");
        }
    }//GEN-LAST:event_jRadioButton7ItemStateChanged

    private void txtnomevaluado1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnomevaluado1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnomevaluado1ActionPerformed

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        jLabel14.setVisible(false);
        //sub b
        TecnicaYPreguntas.setV_sub_b("hay");
        estaaplicandoinf8.setVisible(true);
        jLabel13.setVisible(true);
        jLabel16.setVisible(true);
        jLabel165.setVisible(true);
        estaaplicandoinf49.setVisible(true);
        r3_sub.setVisible(true);
        jButton7.setVisible(true);
        jLabel163.setVisible(true);
        estaaplicandoinf50.setVisible(true);
        r4_sub.setVisible(true);
        jButton8.setVisible(true);
        jLabel164.setVisible(true);
        estaaplicandoinf54.setVisible(true);
        estaaplicandoinf55sdd.setVisible(true);
        chbxamarillo6.setVisible(true);
        estaaplicandoinf56.setVisible(true);
        chbxamarillo7.setVisible(true);
        estaaplicandoinf57.setVisible(true);
        chbxamarillo8.setVisible(true);
        estaaplicandoinf58.setVisible(true);
        chbxamarillo9.setVisible(true);
        estaaplicandoinf59.setVisible(true);
        chbxamarillo10.setVisible(true);
        jLabel167.setVisible(true);
    }//GEN-LAST:event_jLabel14MouseClicked

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        jLabel13.setVisible(true);
        jLabel16.setVisible(true);
        //sub c
        TecnicaYPreguntas.setV_sub_c("nohay");
        estaaplicandoinf11.setVisible(false);
        jLabel15.setVisible(false);
        jLabel170.setVisible(false);
        estaaplicandoinf51.setVisible(false);
        r5_sub.setVisible(false);
        jButton9.setVisible(false);
        jLabel169.setVisible(false);
        estaaplicandoinf52.setVisible(false);
        r6_sub.setVisible(false);
        jButton10.setVisible(false);
        jLabel168.setVisible(false);
        estaaplicandoinf60.setVisible(false);
        estaaplicandoinf61sd.setVisible(false);
        chbxamarillo11.setVisible(false);
        estaaplicandoinf62.setVisible(false);
        chbxamarillo12.setVisible(false);
        estaaplicandoinf63.setVisible(false);
        chbxamarillo13.setVisible(false);
        estaaplicandoinf64.setVisible(false);
        chbxamarillo14.setVisible(false);
        estaaplicandoinf65.setVisible(false);
        chbxamarillo15.setVisible(false);
    }//GEN-LAST:event_jLabel15MouseClicked

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
        jLabel14.setVisible(true);
        //sub b
        TecnicaYPreguntas.setV_sub_b("nohay");
        estaaplicandoinf8.setVisible(false);
        jLabel13.setVisible(false);
        jLabel16.setVisible(false);
        jLabel165.setVisible(false);
        estaaplicandoinf49.setVisible(false);
        r3_sub.setVisible(false);
        jButton7.setVisible(false);
        jLabel163.setVisible(false);
        estaaplicandoinf50.setVisible(false);
        r4_sub.setVisible(false);
        jButton8.setVisible(false);
        jLabel164.setVisible(false);
        estaaplicandoinf54.setVisible(false);
        estaaplicandoinf55sdd.setVisible(false);
        chbxamarillo6.setVisible(false);
        estaaplicandoinf56.setVisible(false);
        chbxamarillo7.setVisible(false);
        estaaplicandoinf57.setVisible(false);
        chbxamarillo8.setVisible(false);
        estaaplicandoinf58.setVisible(false);
        chbxamarillo9.setVisible(false);
        estaaplicandoinf59.setVisible(false);
        chbxamarillo10.setVisible(false);
        jLabel167.setVisible(false);

    }//GEN-LAST:event_jLabel16MouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        String pr = JOptionPane.showInputDialog(null, "Digite la nueva pregunta");
        if (pr.equals("")) {
            JOptionPane.showMessageDialog(null, "¡Debe introducir una pregunta!", "Edición de preguntas", JOptionPane.ERROR_MESSAGE);
        } else {
            r1_sub.setText(pr);
            JOptionPane.showMessageDialog(null, "¡Pregunta editada!  :D", "Edición de preguntas", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        String pr = JOptionPane.showInputDialog(null, "Digite la nueva pregunta");
        if (pr.equals("")) {
            JOptionPane.showMessageDialog(null, "¡Debe introducir una pregunta!", "Edición de preguntas", JOptionPane.ERROR_MESSAGE);
        } else {
            r2_sub.setText(pr);
            JOptionPane.showMessageDialog(null, "¡Pregunta editada!  :D", "Edición de preguntas", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        String pr = JOptionPane.showInputDialog(null, "Digite la nueva pregunta");
        if (pr.equals("")) {
            JOptionPane.showMessageDialog(null, "¡Debe introducir una pregunta!", "Edición de preguntas", JOptionPane.ERROR_MESSAGE);
        } else {
            r3_sub.setText(pr);
            JOptionPane.showMessageDialog(null, "¡Pregunta editada!  :D", "Edición de preguntas", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        String pr = JOptionPane.showInputDialog(null, "Digite la nueva pregunta");
        if (pr.equals("")) {
            JOptionPane.showMessageDialog(null, "¡Debe introducir una pregunta!", "Edición de preguntas", JOptionPane.ERROR_MESSAGE);
        } else {
            r4_sub.setText(pr);
            JOptionPane.showMessageDialog(null, "¡Pregunta editada!  :D", "Edición de preguntas", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        String pr = JOptionPane.showInputDialog(null, "Digite la nueva pregunta");
        if (pr.equals("")) {
            JOptionPane.showMessageDialog(null, "¡Debe introducir una pregunta!", "Edición de preguntas", JOptionPane.ERROR_MESSAGE);
        } else {
            r5_sub.setText(pr);
            JOptionPane.showMessageDialog(null, "¡Pregunta editada!  :D", "Edición de preguntas", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        String pr = JOptionPane.showInputDialog(null, "Digite la nueva pregunta");
        if (pr.equals("")) {
            JOptionPane.showMessageDialog(null, "¡Debe introducir una pregunta!", "Edición de preguntas", JOptionPane.ERROR_MESSAGE);
        } else {
            r6_sub.setText(pr);
            JOptionPane.showMessageDialog(null, "¡Pregunta editada!  :D", "Edición de preguntas", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jButton10ActionPerformed

    private void chbxrojoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chbxrojoItemStateChanged
        if (chbxrojo.isSelected()) {
            chbxverde.setSelected(false);
            jRadioButton14.setVisible(true);
            jRadioButton15.setVisible(true);
            TecnicaYPreguntas.setColor("Rojo");
        }
    }//GEN-LAST:event_chbxrojoItemStateChanged

    private void chbxverdeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chbxverdeItemStateChanged
        if (chbxverde.isSelected()) {
            chbxrojo.setSelected(false);
            jRadioButton14.setVisible(false);
            jRadioButton15.setVisible(false);
            TecnicaYPreguntas.setColor("Verde");
        }
    }//GEN-LAST:event_chbxverdeItemStateChanged

    private void cbxsistemaexamItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxsistemaexamItemStateChanged
        String d = cbxsistemaexam.getSelectedItem().toString();
        TecnicaYPreguntas.setSistemaUtilizadoExamen(d);
    }//GEN-LAST:event_cbxsistemaexamItemStateChanged

    private void cbxsistemaexamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxsistemaexamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxsistemaexamActionPerformed

    private void txtnomevaluadoCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtnomevaluadoCaretUpdate
        TecnicaYPreguntas.setAdmisionTYP(txtnomevaluado.getText());
    }//GEN-LAST:event_txtnomevaluadoCaretUpdate

    private void jRadioButton8ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton8ItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton8ItemStateChanged

    private void jRadioButton9ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton9ItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton9ItemStateChanged

    private void txtnomevaluadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnomevaluadoKeyTyped
        int k = (int) evt.getKeyChar();
        if (k == 39) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "¡No se acepta ese tipo de carácter!", "Error de datos ingresados", JOptionPane.ERROR_MESSAGE, iconThinking_uh);
        }
        InputMap map = txtnomevaluado.getInputMap(JTextField.WHEN_FOCUSED);
//        map.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, CTRL_MASK), "null");
    }//GEN-LAST:event_txtnomevaluadoKeyTyped

    private void txtnomevaluado1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnomevaluado1KeyTyped
        int k = (int) evt.getKeyChar();
        if (k == 39) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "¡No se acepta ese tipo de carácter!", "Error de datos ingresados", JOptionPane.ERROR_MESSAGE, iconThinking_uh);
        }
        InputMap map = txtnomevaluado1.getInputMap(JTextField.WHEN_FOCUSED);
//        map.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, CTRL_MASK), "null");
    }//GEN-LAST:event_txtnomevaluado1KeyTyped

    private void txtnomevaluadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnomevaluadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnomevaluadoActionPerformed

    private void cbxsistemaexam1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxsistemaexam1ItemStateChanged
        String t = cbxsistemaexam1.getSelectedItem().toString();
        if (t.equals("DLST")) {
            r1_fs.setVisible(true);
            r1_sub1.setVisible(true);
            jButton12.setVisible(true);
            r2_fs.setVisible(true);
            r2_sub1.setVisible(true);
            jButton13.setVisible(true);
            r3_fs.setVisible(false);
            r3_sub1.setVisible(false);
            jButton14.setVisible(false);
        } else if (t.equals("ZCTFEDERAL")) {
            r1_fs.setVisible(true);
            r1_sub1.setVisible(true);
            jButton12.setVisible(true);
            r2_fs.setVisible(true);
            r2_sub1.setVisible(true);
            jButton13.setVisible(true);
            r3_fs.setVisible(true);
            r3_sub1.setVisible(true);
            jButton14.setVisible(true);
        } else if (t.equals("FASE USTED")) {
            r1_fs.setVisible(true);
            r1_sub1.setVisible(true);
            jButton12.setVisible(true);
            r2_fs.setVisible(true);
            r2_sub1.setVisible(true);
            jButton13.setVisible(true);
            r3_fs.setVisible(true);
            r3_sub1.setVisible(true);
            jButton14.setVisible(true);
        } else if (t.equals("Seleccione")) {
            r1_fs.setVisible(false);
            r1_sub1.setVisible(false);
            jButton12.setVisible(false);
            r2_fs.setVisible(false);
            r2_sub1.setVisible(false);
            jButton13.setVisible(false);
            r3_fs.setVisible(false);
            r3_sub1.setVisible(false);
            jButton14.setVisible(false);
        }
    }//GEN-LAST:event_cbxsistemaexam1ItemStateChanged

    private void cbxsistemaexam1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxsistemaexam1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxsistemaexam1ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        String pr = JOptionPane.showInputDialog(null, "Digite la nueva pregunta");
        if (pr.equals("")) {
            JOptionPane.showMessageDialog(null, "¡Debe introducir una pregunta!", "Edición de preguntas", JOptionPane.ERROR_MESSAGE);
        } else {
            r1_sub1.setText(pr);
            JOptionPane.showMessageDialog(null, "¡Pregunta editada!  :D", "Edición de preguntas", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        String pr = JOptionPane.showInputDialog(null, "Digite la nueva pregunta");
        if (pr.equals("")) {
            JOptionPane.showMessageDialog(null, "¡Debe introducir una pregunta!", "Edición de preguntas", JOptionPane.ERROR_MESSAGE);
        } else {
            r2_sub1.setText(pr);
            JOptionPane.showMessageDialog(null, "¡Pregunta editada!  :D", "Edición de preguntas", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jRadioButton14ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton14ItemStateChanged
        if (jRadioButton14.isSelected()) {
            jRadioButton15.setSelected(false);
            TecnicaYPreguntas.setColormalo("Por gráficas");
        } else {
            TecnicaYPreguntas.setColormalo("");
        }
    }//GEN-LAST:event_jRadioButton14ItemStateChanged

    private void jRadioButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton14ActionPerformed

    private void jRadioButton15ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton15ItemStateChanged
        if (jRadioButton15.isSelected()) {
            jRadioButton14.setSelected(false);
            TecnicaYPreguntas.setColormalo("Por admisiones relevantes");
        } else {
            TecnicaYPreguntas.setColormalo("");
        }
    }//GEN-LAST:event_jRadioButton15ItemStateChanged

    private void jRadioButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton15ActionPerformed

    private void jCheckBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox1ItemStateChanged
        if (jCheckBox1.isSelected()) {
            TecnicaYPreguntas.setSr_r1("Sí");
        } else {
            TecnicaYPreguntas.setSr_r1("No");
        }
    }//GEN-LAST:event_jCheckBox1ItemStateChanged

    private void jCheckBox2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox2ItemStateChanged
        if (jCheckBox2.isSelected()) {
            TecnicaYPreguntas.setSr_r2("Sí");
        } else {
            TecnicaYPreguntas.setSr_r2("No");
        }
    }//GEN-LAST:event_jCheckBox2ItemStateChanged

    private void jCheckBox3ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox3ItemStateChanged
        if (jCheckBox3.isSelected()) {
            TecnicaYPreguntas.setSr_r3("Sí");
        } else {
            TecnicaYPreguntas.setSr_r3("No");
        }
    }//GEN-LAST:event_jCheckBox3ItemStateChanged

    private void jCheckBox4ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox4ItemStateChanged
        if (jCheckBox4.isSelected()) {
            TecnicaYPreguntas.setSr_r4("Sí");
        } else {
            TecnicaYPreguntas.setSr_r4("No");
        }
    }//GEN-LAST:event_jCheckBox4ItemStateChanged

    private void jCheckBox13ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox13ItemStateChanged
        if (jCheckBox13.isSelected()) {
            TecnicaYPreguntas.setInc_r1("Sí");
        } else {
            TecnicaYPreguntas.setInc_r1("No");
        }
    }//GEN-LAST:event_jCheckBox13ItemStateChanged

    private void jCheckBox14ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox14ItemStateChanged
        if (jCheckBox14.isSelected()) {
            TecnicaYPreguntas.setInc_r2("Sí");
        } else {
            TecnicaYPreguntas.setInc_r2("No");
        }
    }//GEN-LAST:event_jCheckBox14ItemStateChanged

    private void jCheckBox15ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox15ItemStateChanged
        if (jCheckBox15.isSelected()) {
            TecnicaYPreguntas.setInc_r3("Sí");
        } else {
            TecnicaYPreguntas.setInc_r3("No");
        }
    }//GEN-LAST:event_jCheckBox15ItemStateChanged

    private void jCheckBox16ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox16ItemStateChanged
        if (jCheckBox16.isSelected()) {
            TecnicaYPreguntas.setInc_r4("Sí");
        } else {
            TecnicaYPreguntas.setInc_r4("No");
        }
    }//GEN-LAST:event_jCheckBox16ItemStateChanged

    private void chbxamarillo16ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chbxamarillo16ItemStateChanged
        if (chbxamarillo16.isSelected()) {
            estaaplicandoinf66.setVisible(true);
            cbxsistemaexam1.setVisible(true);
            TecnicaYPreguntas.setEstado_fs("hay");
        } else {
            TecnicaYPreguntas.setEstado_fs("nohay");
            estaaplicandoinf66.setVisible(false);
            cbxsistemaexam1.setVisible(false);
            r1_fs.setVisible(false);
            r1_sub1.setVisible(false);
            jButton12.setVisible(false);
            r2_fs.setVisible(false);
            r2_sub1.setVisible(false);
            jButton13.setVisible(false);
            r3_fs.setVisible(false);
            r3_sub1.setVisible(false);
            jButton14.setVisible(false);
        }
    }//GEN-LAST:event_chbxamarillo16ItemStateChanged

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        String pr = JOptionPane.showInputDialog(null, "Digite la nueva pregunta");
        if (pr.equals("")) {
            JOptionPane.showMessageDialog(null, "¡Debe introducir una pregunta!", "Edición de preguntas", JOptionPane.ERROR_MESSAGE);
        } else {
            r3_sub1.setText(pr);
            JOptionPane.showMessageDialog(null, "¡Pregunta editada!  :D", "Edición de preguntas", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jButton14ActionPerformed

    private void chbxamarillo5ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chbxamarillo5ItemStateChanged
        if (chbxamarillo5.isSelected()) {
            TecnicaYPreguntas.setResultado_sub_a("SR");
            chbxamarillo4.setSelected(false);
            chbxamarillo3.setSelected(false);
            chbxamarillo2.setSelected(false);
            chbxamarillo1.setSelected(false);
        } else {
            TecnicaYPreguntas.setResultado_sub_a("");
        }

    }//GEN-LAST:event_chbxamarillo5ItemStateChanged

    private void chbxamarillo4ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chbxamarillo4ItemStateChanged
        if (chbxamarillo4.isSelected()) {
            TecnicaYPreguntas.setResultado_sub_a("NSR");
            chbxamarillo5.setSelected(false);
            chbxamarillo3.setSelected(false);
            chbxamarillo2.setSelected(false);
            chbxamarillo1.setSelected(false);
        } else {
            TecnicaYPreguntas.setResultado_sub_a("");
        }
    }//GEN-LAST:event_chbxamarillo4ItemStateChanged

    private void chbxamarillo3ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chbxamarillo3ItemStateChanged
        if (chbxamarillo3.isSelected()) {
            TecnicaYPreguntas.setResultado_sub_a("NO");
            chbxamarillo4.setSelected(false);
            chbxamarillo5.setSelected(false);
            chbxamarillo2.setSelected(false);
            chbxamarillo1.setSelected(false);
        } else {
            TecnicaYPreguntas.setResultado_sub_a("");
        }
    }//GEN-LAST:event_chbxamarillo3ItemStateChanged

    private void chbxamarillo1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chbxamarillo1ItemStateChanged
        if (chbxamarillo1.isSelected()) {
            TecnicaYPreguntas.setResultado_sub_a("PNC");
            chbxamarillo4.setSelected(false);
            chbxamarillo3.setSelected(false);
            chbxamarillo2.setSelected(false);
            chbxamarillo5.setSelected(false);
        } else {
            TecnicaYPreguntas.setResultado_sub_a("");
        }
    }//GEN-LAST:event_chbxamarillo1ItemStateChanged

    private void chbxamarillo2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chbxamarillo2ItemStateChanged
        if (chbxamarillo2.isSelected()) {
            TecnicaYPreguntas.setResultado_sub_a("INC");
            chbxamarillo4.setSelected(false);
            chbxamarillo3.setSelected(false);
            chbxamarillo5.setSelected(false);
            chbxamarillo1.setSelected(false);
        } else {
            TecnicaYPreguntas.setResultado_sub_a("");
        }
    }//GEN-LAST:event_chbxamarillo2ItemStateChanged

    private void chbxamarillo6ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chbxamarillo6ItemStateChanged
        if (chbxamarillo6.isSelected()) {
            TecnicaYPreguntas.setResultado_sub_b("SR");
            chbxamarillo7.setSelected(false);
            chbxamarillo8.setSelected(false);
            chbxamarillo9.setSelected(false);
            chbxamarillo10.setSelected(false);
        } else {
            TecnicaYPreguntas.setResultado_sub_b("");
        }
    }//GEN-LAST:event_chbxamarillo6ItemStateChanged

    private void chbxamarillo7ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chbxamarillo7ItemStateChanged
        if (chbxamarillo7.isSelected()) {
            TecnicaYPreguntas.setResultado_sub_b("NSR");
            chbxamarillo6.setSelected(false);
            chbxamarillo8.setSelected(false);
            chbxamarillo9.setSelected(false);
            chbxamarillo10.setSelected(false);
        } else {
            TecnicaYPreguntas.setResultado_sub_b("");
        }
    }//GEN-LAST:event_chbxamarillo7ItemStateChanged

    private void chbxamarillo8ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chbxamarillo8ItemStateChanged
        if (chbxamarillo8.isSelected()) {
            TecnicaYPreguntas.setResultado_sub_b("NO");
            chbxamarillo7.setSelected(false);
            chbxamarillo6.setSelected(false);
            chbxamarillo9.setSelected(false);
            chbxamarillo10.setSelected(false);
        } else {
            TecnicaYPreguntas.setResultado_sub_b("");
        }
    }//GEN-LAST:event_chbxamarillo8ItemStateChanged

    private void chbxamarillo9ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chbxamarillo9ItemStateChanged
        if (chbxamarillo9.isSelected()) {
            TecnicaYPreguntas.setResultado_sub_b("PNC");
            chbxamarillo7.setSelected(false);
            chbxamarillo8.setSelected(false);
            chbxamarillo6.setSelected(false);
            chbxamarillo10.setSelected(false);
        } else {
            TecnicaYPreguntas.setResultado_sub_b("");
        }
    }//GEN-LAST:event_chbxamarillo9ItemStateChanged

    private void chbxamarillo10ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chbxamarillo10ItemStateChanged
        if (chbxamarillo10.isSelected()) {
            TecnicaYPreguntas.setResultado_sub_b("INC");
            chbxamarillo7.setSelected(false);
            chbxamarillo8.setSelected(false);
            chbxamarillo9.setSelected(false);
            chbxamarillo6.setSelected(false);
        } else {
            TecnicaYPreguntas.setResultado_sub_b("");
        }
    }//GEN-LAST:event_chbxamarillo10ItemStateChanged

    private void chbxamarillo11ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chbxamarillo11ItemStateChanged
        if (chbxamarillo11.isSelected()) {
            TecnicaYPreguntas.setResultado_sub_c("SR");
            chbxamarillo12.setSelected(false);
            chbxamarillo13.setSelected(false);
            chbxamarillo14.setSelected(false);
            chbxamarillo15.setSelected(false);
        } else {
            TecnicaYPreguntas.setResultado_sub_c("");
        }
    }//GEN-LAST:event_chbxamarillo11ItemStateChanged

    private void chbxamarillo12ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chbxamarillo12ItemStateChanged
        if (chbxamarillo12.isSelected()) {
            TecnicaYPreguntas.setResultado_sub_c("NSR");
            chbxamarillo11.setSelected(false);
            chbxamarillo13.setSelected(false);
            chbxamarillo14.setSelected(false);
            chbxamarillo15.setSelected(false);
        } else {
            TecnicaYPreguntas.setResultado_sub_c("");
        }
    }//GEN-LAST:event_chbxamarillo12ItemStateChanged

    private void chbxamarillo13ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chbxamarillo13ItemStateChanged
        if (chbxamarillo13.isSelected()) {
            TecnicaYPreguntas.setResultado_sub_c("NO");
            chbxamarillo12.setSelected(false);
            chbxamarillo11.setSelected(false);
            chbxamarillo14.setSelected(false);
            chbxamarillo15.setSelected(false);
        } else {
            TecnicaYPreguntas.setResultado_sub_c("");
        }
    }//GEN-LAST:event_chbxamarillo13ItemStateChanged

    private void chbxamarillo14ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chbxamarillo14ItemStateChanged
        if (chbxamarillo14.isSelected()) {
            TecnicaYPreguntas.setResultado_sub_c("PNC");
            chbxamarillo12.setSelected(false);
            chbxamarillo13.setSelected(false);
            chbxamarillo11.setSelected(false);
            chbxamarillo15.setSelected(false);
        } else {
            TecnicaYPreguntas.setResultado_sub_c("");
        }
    }//GEN-LAST:event_chbxamarillo14ItemStateChanged

    private void chbxamarillo15ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chbxamarillo15ItemStateChanged
        if (chbxamarillo15.isSelected()) {
            TecnicaYPreguntas.setResultado_sub_c("INC");
            chbxamarillo12.setSelected(false);
            chbxamarillo13.setSelected(false);
            chbxamarillo14.setSelected(false);
            chbxamarillo11.setSelected(false);
        } else {
            TecnicaYPreguntas.setResultado_sub_c("");
        }
    }//GEN-LAST:event_chbxamarillo15ItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JComboBox<String> cbxestaaplicandoinf;
    private javax.swing.JComboBox<String> cbxsistemaexam;
    private javax.swing.JComboBox<String> cbxsistemaexam1;
    private javax.swing.JCheckBox chbxamarillo1;
    private javax.swing.JCheckBox chbxamarillo10;
    private javax.swing.JCheckBox chbxamarillo11;
    private javax.swing.JCheckBox chbxamarillo12;
    private javax.swing.JCheckBox chbxamarillo13;
    private javax.swing.JCheckBox chbxamarillo14;
    private javax.swing.JCheckBox chbxamarillo15;
    private javax.swing.JCheckBox chbxamarillo16;
    private javax.swing.JCheckBox chbxamarillo2;
    private javax.swing.JCheckBox chbxamarillo3;
    private javax.swing.JCheckBox chbxamarillo4;
    private javax.swing.JCheckBox chbxamarillo5;
    private javax.swing.JCheckBox chbxamarillo6;
    private javax.swing.JCheckBox chbxamarillo7;
    private javax.swing.JCheckBox chbxamarillo8;
    private javax.swing.JCheckBox chbxamarillo9;
    private javax.swing.JCheckBox chbxrojo;
    private javax.swing.JCheckBox chbxverde;
    private javax.swing.JLabel estaaplicandoinf;
    private javax.swing.JLabel estaaplicandoinf1;
    private javax.swing.JLabel estaaplicandoinf11;
    private javax.swing.JLabel estaaplicandoinf14;
    private javax.swing.JLabel estaaplicandoinf15ppp;
    private javax.swing.JLabel estaaplicandoinf16;
    private javax.swing.JLabel estaaplicandoinf17;
    private javax.swing.JLabel estaaplicandoinf18;
    private javax.swing.JLabel estaaplicandoinf19;
    private javax.swing.JLabel estaaplicandoinf2;
    private javax.swing.JLabel estaaplicandoinf20;
    private javax.swing.JLabel estaaplicandoinf21;
    private javax.swing.JLabel estaaplicandoinf22;
    private javax.swing.JLabel estaaplicandoinf23;
    private javax.swing.JLabel estaaplicandoinf24;
    private javax.swing.JLabel estaaplicandoinf25;
    private javax.swing.JLabel estaaplicandoinf26;
    private javax.swing.JLabel estaaplicandoinf27;
    private javax.swing.JLabel estaaplicandoinf28;
    private javax.swing.JLabel estaaplicandoinf29;
    private javax.swing.JLabel estaaplicandoinf30;
    private javax.swing.JLabel estaaplicandoinf31;
    private javax.swing.JLabel estaaplicandoinf32;
    private javax.swing.JLabel estaaplicandoinf34;
    private javax.swing.JLabel estaaplicandoinf35;
    private javax.swing.JLabel estaaplicandoinf36;
    private javax.swing.JLabel estaaplicandoinf37;
    private javax.swing.JLabel estaaplicandoinf38;
    private javax.swing.JLabel estaaplicandoinf39;
    private javax.swing.JLabel estaaplicandoinf40;
    private javax.swing.JLabel estaaplicandoinf41;
    private javax.swing.JLabel estaaplicandoinf43;
    private javax.swing.JLabel estaaplicandoinf44;
    private javax.swing.JLabel estaaplicandoinf47;
    private javax.swing.JLabel estaaplicandoinf48;
    private javax.swing.JLabel estaaplicandoinf49;
    private javax.swing.JLabel estaaplicandoinf50;
    private javax.swing.JLabel estaaplicandoinf51;
    private javax.swing.JLabel estaaplicandoinf52;
    private javax.swing.JLabel estaaplicandoinf53;
    private javax.swing.JLabel estaaplicandoinf54;
    private javax.swing.JLabel estaaplicandoinf55sdd;
    private javax.swing.JLabel estaaplicandoinf56;
    private javax.swing.JLabel estaaplicandoinf57;
    private javax.swing.JLabel estaaplicandoinf58;
    private javax.swing.JLabel estaaplicandoinf59;
    private javax.swing.JLabel estaaplicandoinf60;
    private javax.swing.JLabel estaaplicandoinf61;
    private javax.swing.JLabel estaaplicandoinf61sd;
    private javax.swing.JLabel estaaplicandoinf62;
    private javax.swing.JLabel estaaplicandoinf63;
    private javax.swing.JLabel estaaplicandoinf64;
    private javax.swing.JLabel estaaplicandoinf65;
    private javax.swing.JLabel estaaplicandoinf66;
    private javax.swing.JLabel estaaplicandoinf67;
    private javax.swing.JLabel estaaplicandoinf8;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox13;
    private javax.swing.JCheckBox jCheckBox14;
    private javax.swing.JCheckBox jCheckBox15;
    private javax.swing.JCheckBox jCheckBox16;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JCheckBox jCheckBox7;
    private javax.swing.JCheckBox jCheckBox8;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel141;
    private javax.swing.JLabel jLabel142;
    private javax.swing.JLabel jLabel143;
    private javax.swing.JLabel jLabel144;
    private javax.swing.JLabel jLabel145;
    private javax.swing.JLabel jLabel146;
    private javax.swing.JLabel jLabel147;
    private javax.swing.JLabel jLabel148;
    private javax.swing.JLabel jLabel149;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel150;
    private javax.swing.JLabel jLabel151;
    private javax.swing.JLabel jLabel152;
    private javax.swing.JLabel jLabel154;
    private javax.swing.JLabel jLabel155;
    private javax.swing.JLabel jLabel156;
    private javax.swing.JLabel jLabel158;
    private javax.swing.JLabel jLabel159;
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
    private javax.swing.JLabel jLabel172;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton14;
    private javax.swing.JRadioButton jRadioButton15;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JRadioButton jRadioButton8;
    private javax.swing.JRadioButton jRadioButton9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel r1;
    private javax.swing.JLabel r1_fs;
    private javax.swing.JLabel r1_sub;
    private javax.swing.JLabel r1_sub1;
    private javax.swing.JLabel r2;
    private javax.swing.JLabel r2_fs;
    private javax.swing.JLabel r2_sub;
    private javax.swing.JLabel r2_sub1;
    private javax.swing.JLabel r3;
    private javax.swing.JLabel r3_fs;
    private javax.swing.JLabel r3_sub;
    private javax.swing.JLabel r3_sub1;
    private javax.swing.JLabel r4;
    private javax.swing.JLabel r4_sub;
    private javax.swing.JLabel r5_sub;
    private javax.swing.JLabel r6_sub;
    private javax.swing.JLabel rojo;
    private javax.swing.JLabel srdesubtest;
    private javax.swing.JTextField txtnomevaluado;
    public static javax.swing.JTextField txtnomevaluado1;
    private javax.swing.JLabel verde;
    // End of variables declaration//GEN-END:variables
}
