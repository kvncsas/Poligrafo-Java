package view;

import classes.AccionesExamen;
import classes.Conexion;
import classes.DatosPersonales;
import classes.DatosPrincipales;
import icons.Checked;
import icons.Close;
import icons.Happier;
import icons.List;
import icons.Question;
import icons.Sad;
import icons.Shocked;
import icons.Thinking;
import icons.Thinking_uh;
import icons.Warning;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.Toolkit;
import static java.awt.event.ActionEvent.CTRL_MASK;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import javax.swing.InputMap;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.KeyStroke;
import static view.MenuPrincipal.fecha;
//import static view.Menu.fecha;
import static view.MenuPrincipal.na;

/**
 *
 * @author Kevin Casas
 */
public class CreacionExamen extends javax.swing.JInternalFrame {

    public CreacionExamen() {
        ((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI()).setNorthPane(null);
        initComponents();
        txtfechadeexam.setText(fecha());
        setLayout(new FlowLayout());
    }

    // si es emplado mayor a 6 meses
    String[] mayor6Meses = {
        "Procedimiento",
        "Ascenso",
        "Caso específico"
    };

    //si no ha trabajado
    String[] emplNuevo = {
        "Ingreso",
        "Caso específico"
    };

    //si es empleado pero menor a 6 meses
    String[] menor6Meses = {
        "Ingreso",
        "Procedimiento",
        "Caso específico"
    };

    //todos los tipos de examen en caso de empleado mayor a 6 meses
    String[] todosTiposE = {
        "Pre-empleo",
        "Rutina (operaciones)",
        "Rutina (admitivos)",
        "Específico"
    };

    //en caso de ingreso
    String[] tipoIngreso = {
        "Pre-empleo"
    };

    //en caso de procedimiento y ascenso
    String[] tipoProcedimiento = {
        "Rutina (operaciones)",
        "Rutina (admitivos)",};

    //en caso de procedimiento y 
    String[] tipoEspecifico = {
        "Específico"
    };

    String tiempolab;

    DatoGeneral dage = new DatoGeneral();
    DatoPersonal daper = new DatoPersonal();
    EstadoDeSalud estsalud = new EstadoDeSalud();
    InformacionFamiliar inforfami = new InformacionFamiliar();
    InformacionAcademica infoaca = new InformacionAcademica();
    InformacionFinanciera infofinan = new InformacionFinanciera();
    ConsumoBebida consbebidas = new ConsumoBebida();
    ConsumoSustancia consustan = new ConsumoSustancia();
    Antecedente antece = new Antecedente();
    VinculosMargenLey vinculos = new VinculosMargenLey();
    FalsificacionHV falsifi = new FalsificacionHV();
    HistorialLaboral histlabo = new HistorialLaboral();
    PlanInfiltracion planinfil = new PlanInfiltracion();
    Novedad nove = new Novedad();
    int nummotivo = 0;
    

    public void limpiar() {
        txtnomevaluado.setText("");
        cbxtipoiden.setSelectedItem("Seleccione");
        txtnoidexaminado.setText("");
        txtareaexaminado.setText("");
        txtnomsolicitante.setText("");
        txtcargosolicitante.setText("");
        txtnomevaluado.grabFocus();
        limpiar_e();
    }
    public static void limpiar_e() {
        txtnomevaluado.setText("");
        
        cbxtipoiden.setSelectedItem("Seleccione");
        txtnoidexaminado.setText("");
        txtareaexaminado.setText("");
        txtnomsolicitante.setText("");
        txtcargosolicitante.setText("");
        txtnomevaluado.grabFocus();
    }

    List iconList = new List();
    Question iconQuestion = new Question();
    Happier iconHappy = new Happier();
    Shocked iconShocked = new Shocked();
    Thinking iconThinking = new Thinking();
    Thinking_uh iconThinking_uh = new Thinking_uh();
    Warning iconWarning = new Warning();
    Checked iconChecked = new Checked();
    Close iconClose = new Close();
    Sad iconSad = new Sad();

    public void CentrarVentana(JInternalFrame internalframe) {
        int x = (na.getWidth() / 2) - internalframe.getWidth() / 2;
        int y = (na.getHeight() / 2) - internalframe.getHeight() / 2;
        if (internalframe.isShowing()) {
            internalframe.setLocation(x, y);
        } else {
            na.add(internalframe);
            internalframe.setLocation(x, y);
            internalframe.show();
        }
    }

    public void iniciarCreacionExamen() {
        System.out.println("mierdaaaaaaaaaaaaaaaaaaaaa");
        SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");
        java.util.Date fecha = new java.util.Date();
        String fechanow = date.format(fecha);
        Buscador bs = new Buscador();

        if ("Conconexion".equals(classes.Conexion.importante)) {
            System.out.println("holy shit!!!!");
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                System.out.println("Se intent´o hace pidsfnsjdf la consuklta!!!!");
                System.out.println("The fucking ID is "+DatosPrincipales.getNoIdenExaminado());
                System.out.println("The fucking ID's type is "+DatosPrincipales.getTipoIdenExaminado());
                ResultSet r = s.executeQuery("SELECT * FROM  datos_generales_poli WHERE no_id = " + DatosPrincipales.getNoIdenExaminado() + " and t_identificacion = '" + DatosPrincipales.getTipoIdenExaminado() + "' ");
                r.next();
                System.out.println("damn yo");
                int cantR = 0;
                int cantiR = 0;
                int quantity = r.getRow();
                while (r.next()) {
                    cantR++;
                }

                cantiR = cantR + 1;
                System.out.println("la cantidad resulta while :   " + cantR);
                System.out.println("la cantidad resulta  quantity:   " + quantity);
                bs.tipoid_creacion = (String) cbxtipoiden.getSelectedItem();
                bs.tipobuscador = "creacion";
                if (cantR > 0 && quantity == 1) {
                    int verR = JOptionPane.showConfirmDialog(null, "¡Hay " + cantiR + " registros de esa persona!\n ¿Desea ver los exámenes registrados?", "Registro de datos examinado", JOptionPane.YES_NO_OPTION, JOptionPane.DEFAULT_OPTION, iconShocked);
                    if (verR == 0) {
                        bs.listarRegistros2();
                        bs.setVisible(true);
                    } else {
                        empezarExamen();
                    }

                } else if (cantR == 0 && quantity == 1) {
                    try {
                        Statement s2 = con.createStatement();
                        ResultSet r2 = s2.executeQuery("SELECT estadoexamen, fechacreacion FROM  datos_generales_poli WHERE no_id = " + txtnoidexaminado.getText() + " and t_identificacion = '" + cbxtipoiden.getSelectedItem() + "' ");
                        r2.next();
                        String estExam = r2.getString("estadoexamen");//validar el tipo de examen
                        String estFechaC = r2.getString("fechacreacion");//validar el tipo de examen

                        if (estExam.equals("Completo") && estFechaC.equals(fechanow)) {
                            int ans = JOptionPane.showConfirmDialog(null, "¡La persona presentó un examen completo el día de hoy!\n ¿Desea verlo y editar los datos?", "Validación de datos examinado", JOptionPane.YES_NO_OPTION, JOptionPane.DEFAULT_OPTION, iconQuestion);
                            if (ans == 0) {

                            } else {
                                JOptionPane.showMessageDialog(daper, "Los datos se actualizarán con la información a ingresar");
                                empezarExamen();
                            }
                        } else if (estExam.equals("Incompleto") && estFechaC.equals(fechanow)) {
                            int ans = JOptionPane.showConfirmDialog(null, "¡La persona presentó un examen incompleto el día de hoy!\n ¿Desea verlo y editar los datos?", "Validación de datos examinado", JOptionPane.YES_NO_OPTION, JOptionPane.DEFAULT_OPTION, iconQuestion);
                            if (ans == 0) {

                            } else {
                                JOptionPane.showMessageDialog(daper, "Los datos se actualizarán con la información a ingresar");
                                empezarExamen();
                            }
                        } else {
                            switch (estExam) {
                                case "Novedad": {
                                    int ans = JOptionPane.showConfirmDialog(null, "¡La persona presenta una novedad!\n ¿Desea verla?", "Validación de datos examinado", JOptionPane.YES_NO_OPTION, JOptionPane.DEFAULT_OPTION, iconQuestion);
                                    if (ans == 0) {
                                        this.setVisible(false);
                                        MenuPrincipal.na.add(nove);
                                        nove.show();
                                        CentrarVentana(nove);
                                    } else {
                                        empezarExamen();
                                    }
                                    break;
                                }
                                case "Completo": {
                                    int ans = JOptionPane.showConfirmDialog(null, "¡La persona presenta un examen completo!\n ¿Desea verlo?", "Validación de datos examinado", JOptionPane.YES_NO_OPTION, JOptionPane.DEFAULT_OPTION, iconQuestion);
                                    if (ans == 0) {

                                    } else {
                                        empezarExamen();
                                    }
                                    break;
                                }
                                case "Incompleto": {
                                    int ans = JOptionPane.showConfirmDialog(null, "¡La persona presenta un examen incompleto!\n ¿Desea verlo?", "Validación de datos examinado", JOptionPane.YES_NO_OPTION, JOptionPane.DEFAULT_OPTION, iconQuestion);
                                    if (ans == 0) {

                                    } else {
                                        empezarExamen();
                                    }
                                    break;
                                }

                                default:
                                    break;
                            }
                        }
                    } catch (HeadlessException | SQLException e) {
                    }
                } else if (cantR == 0 && quantity == 0) {
                    System.out.println("jueputa debe psa rpor acsdjfsdjifh");

                    empezarExamen();
                }
            } catch (HeadlessException | SQLException e) {
            }
        } else if ("Sinconexion".equals(classes.Conexion.importante)) {
            empezarExamen();
        }
    }

    public void empezarExamen() {
        if (CreacionExamen.txtnomsolicitante.getText().equals("") || CreacionExamen.txtcargosolicitante.getText().equals("") || CreacionExamen.txtnomevaluado.getText().equals("") || CreacionExamen.cbxtipoiden.getSelectedItem().equals("Seleccione") || CreacionExamen.txtnoidexaminado.getText().equals("") || CreacionExamen.txtareaexaminado.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "¡Debe completar todos los parámetros para registrar los datos!", "Registro de datos examinado", JOptionPane.DEFAULT_OPTION, iconThinking_uh);
        } else {

            int resp = JOptionPane.showConfirmDialog(null, "¿Se presentó a la cita agendada para el examen de polígrafo?", "Alerta!", JOptionPane.YES_NO_OPTION, JOptionPane.DEFAULT_OPTION, iconQuestion);
            if (resp == 1) {
                this.setVisible(false);
                MenuPrincipal.na.add(nove);
                nove.show();
                CentrarVentana(nove);

//                        novedad.txtidennovedad
                DatosPrincipales.setNombreExaminado(txtnomevaluado.getText());
                Novedad.txtnomnovedad.setText(DatosPrincipales.getNombreExaminado());

                DatosPrincipales.setTipoIdenExaminado(cbxtipoiden.getSelectedItem().toString());
                Novedad.cbxidennovedad.setSelectedItem(DatosPrincipales.getTipoIdenExaminado());

                DatosPrincipales.setNoIdenExaminado(txtnoidexaminado.getText());
                Novedad.txtidennovedad.setText(DatosPrincipales.getNoIdenExaminado());

                Novedad.txtsolicinovedad.setText(DatosPrincipales.getNombreSolicitante());

            } else {

                int se = JOptionPane.showConfirmDialog(null, "¿Ha presentado algún examen de polígrafo?", "Creación de examen", JOptionPane.YES_NO_OPTION, JOptionPane.DEFAULT_OPTION, iconQuestion);
                if (se == 0) {
                    int pre = JOptionPane.showConfirmDialog(null, "¿El examen de Polígrafo fue para Teleperformance o Teledatos? ", "Validación de examen", JOptionPane.YES_NO_OPTION, JOptionPane.DEFAULT_OPTION, iconQuestion);
                    if (pre == 0) {
                        String tiempoexamen = (String) JOptionPane.showInputDialog(null, "¿Hace cuánto lo presento?", "Creación nuevo examinado", JOptionPane.DEFAULT_OPTION, iconQuestion, null, "");
                    }
                }
                int seguir = JOptionPane.showConfirmDialog(null, "Actualmente ¿es colaborador de Teleperformance Colombia SAS o Teledatos Zona Franca?", "Creación de examen", JOptionPane.YES_NO_OPTION, JOptionPane.DEFAULT_OPTION, iconQuestion);
                if (seguir == 0) {
                    String[] tiexa = {
                        "De 0 - 3 meses",
                        "De 3 - 6 meses",
                        "De 6 - 12 meses",
                        "Más de 12 meses"
                    };

                    tiempolab = (String) JOptionPane.showInputDialog(null, "¿Cuánto tiempo lleva laborando? ", "Tiempo laborando", JOptionPane.DEFAULT_OPTION, iconQuestion, tiexa, tiexa[0]);

                    if ("De 0 - 3 meses".equals(tiempolab)) {
                        nummotivo = 2;
                    } else if ("De 3 - 6 meses".equals(tiempolab)) {
                        nummotivo = 2;
                    } else if ("De 6 - 12 meses".equals(tiempolab)) {
                        nummotivo = 3;
                    } else if ("Más de 12 meses".equals(tiempolab)) {
                        nummotivo = 3;
                    }
                }
                String[] motivoexa = null;

                if (seguir == 1) {
                    motivoexa = emplNuevo;
                } else if (seguir == 0 && nummotivo == 2) {
                    motivoexa = menor6Meses;
                } else if (seguir == 0 && nummotivo == 3) {
                    motivoexa = mayor6Meses;
                }

                if (seguir == 0 && tiempolab == null) {
                    JOptionPane.showMessageDialog(null, "¡Ingreso de datos cancelados!", "Creación nuevo examinado", JOptionPane.DEFAULT_OPTION, iconThinking_uh);
                } else {

                    String tipodemotivo = (String) JOptionPane.showInputDialog(null, "¿Cuál es el motivo por el cual realiza el examen de polígrafo? ", "Tipo de motivo", JOptionPane.DEFAULT_OPTION, iconList, motivoexa, motivoexa[0]);

                    String[] tipoexma = null;

                    if ("Ingreso".equals(tipodemotivo)) {
                        tipoexma = tipoIngreso;
                    } else if ("Procedimiento".equals(tipodemotivo) || "Ascenso".equals(tipodemotivo)) {
                        tipoexma = tipoProcedimiento;
                    } else if ("Caso específico".equals(tipodemotivo)) {
                        tipoexma = tipoEspecifico;
                    }

                    if (tipodemotivo == null || tipodemotivo.equals("")) {
                        JOptionPane.showMessageDialog(null, "¡Ingreso de datos cancelados!", "Creación nuevo examinado", JOptionPane.DEFAULT_OPTION, iconThinking_uh);
                    } else {

                        String tipoexam = (String) JOptionPane.showInputDialog(null, "¿Cuál es el tipo de examen de polígrafo? ", "Tipo de examen", JOptionPane.DEFAULT_OPTION, iconList, tipoexma, tipoexma[0]);
                        
                        DatosPrincipales.setMotivoExamen(tipodemotivo);
                        //validación inicio de examen
                        if (tipoexam == null || tipoexam.equals("")) {
                            JOptionPane.showMessageDialog(null, "¡Ingreso de datos cancelados!", "Creación nuevo examinado", JOptionPane.DEFAULT_OPTION, iconThinking_uh);
                        } else //validación inicio de Pre.empleo
                        if ("Ingreso".equals(tipodemotivo) && "Pre-empleo".equals(tipoexam)) {

                            this.setVisible(false);

                            if (dage.isVisible()) {

                                JOptionPane.showMessageDialog(null, "¡Datos generales ya se encuentra en uso!", "Validación de parámetros", JOptionPane.DEFAULT_OPTION, iconThinking_uh);

                            } else if (!dage.isVisible()) {

                                int anchoprograma = (na.getWidth());
                                int altoprograma = (na.getHeight());
                                dage.setSize(anchoprograma, altoprograma);
                                MenuPrincipal.na.add(dage);
                                dage.show();
                                DatoGeneral.tituloexamenpre.setText("Examen Pre-Empleo");
                                DatoGeneral.paratodo.add(daper);
                                daper.show();
                                DatosPrincipales.setTipoExamen(tipoexam);
                                DatoPersonal.jPanel1.setVisible(false);
                                DatoGeneral.btnTerminar.setVisible(false);
                                DatoGeneral.btneditar.setVisible(false);
                                DatoPersonal.txtpersonasolicitante.setText(DatosPrincipales.getNombreSolicitante());
                                DatoPersonal.txtcargosolicitante.setText(DatosPrincipales.getCargoSolicitante());
                                MenuPrincipal.jPanel9.setVisible(false);
                                MenuPrincipal.jPanel10.setVisible(false);
                            }

                            DatoPersonal.txtareaaspira.setText(txtareaexaminado.getText());
                            DatoPersonal.jPanel1.setVisible(false);
                            DatoPersonal.jPanel3.setVisible(true);

                            DatoGeneral.jLabel2.setVisible(true);//Datos personales
                            DatoGeneral.jLabel3.setVisible(true);//Estado de salud
                            DatoGeneral.jLabel4.setVisible(true);//Info familiar
                            DatoGeneral.jLabel10.setVisible(true);//Info académica
                            DatoGeneral.jLabel5.setVisible(true);//Info financiera
                            DatoGeneral.jLabel13.setVisible(true);//Actvidades tiempo libre
                            DatoGeneral.jLabel6.setVisible(true);//Consumo bebidas
                            DatoGeneral.jLabel7.setVisible(true);//Consumo sustancias
                            DatoGeneral.jLabel8.setVisible(true);//Antecendentes
                            DatoGeneral.jLabel9.setVisible(true);//Vinculos personas
                            DatoGeneral.jLabel11.setVisible(true);//Falsificacion /  Conducta laboral
                            DatoGeneral.jLabel11.setText("Falsificación");//Falsificacion  Conducta laboral
                            DatoGeneral.jLabel12.setVisible(true);//Historia laboral
                            DatoGeneral.jLabel14.setVisible(true);//Planes infiltracion
                            DatoGeneral.jLabel18.setVisible(false);//Tema bajo investigación
                            DatoGeneral.jLabel15.setVisible(true);//Tecnica empleada
//                            DatoGeneral.jLabel16.setVisible(false);//Admisiones

                            DatoGeneral.jLabel2.setEnabled(true);//Datos personales
                            DatoGeneral.jLabel3.setEnabled(true);//Estado de salud
                            DatoGeneral.jLabel4.setEnabled(false);//Info familiar
                            DatoGeneral.jLabel10.setEnabled(false);//Info académica
                            DatoGeneral.jLabel5.setEnabled(false);//Info financiera
                            DatoGeneral.jLabel13.setEnabled(false);//Actvidades tiempo libre
                            DatoGeneral.jLabel6.setEnabled(false);//Consumo bebidas
                            DatoGeneral.jLabel7.setEnabled(false);//Consumo sustancias
                            DatoGeneral.jLabel8.setEnabled(false);//Antecendentes
                            DatoGeneral.jLabel9.setEnabled(false);//Vinculos personas
                            DatoGeneral.jLabel11.setEnabled(false);//Falsificacion /  Conducta laboral
                            DatoGeneral.jLabel12.setEnabled(false);//Historia laboral
                            DatoGeneral.jLabel14.setEnabled(false);//Planes infiltracion
                            DatoGeneral.jLabel18.setEnabled(false);//Tema bajo investigación
                            DatoGeneral.jLabel15.setEnabled(true);//Tecnica empleada
//                            DatoGeneral.jLabel16.setEnabled(false);//Admisiones

                            DatoGeneral.jLabel2.setForeground(Color.red);//Datos personales
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
//                            DatoGeneral.jLabel16.setForeground(Color.black);//Admisiones

                            DatoGeneral.fechaizquierda.setVisible(false);
                            DatoGeneral.fechaderecha.setVisible(true);
                            DatoPersonal.cargoactual.setVisible(false);
                            DatoPersonal.txtcargoactual.setVisible(false);
                            DatoPersonal.rtxtcargoactual.setVisible(false);
                            DatoPersonal.areaactual.setVisible(false);
                            DatoPersonal.txtareaactual.setVisible(false);
                            DatoPersonal.rtxtareaactual.setVisible(false);
                            DatoPersonal.cargoaspira.setVisible(true);
                            DatoPersonal.txtcargoaspira.setVisible(true);
                            DatoPersonal.rtxtcargoaspira.setVisible(true);
                            DatoPersonal.areaaspira.setVisible(true);
                            DatoPersonal.txtareaaspira.setVisible(true);
                            DatoPersonal.rtxtareaaspira.setVisible(true);
                            DatoPersonal.personasolicitante.setVisible(true);
                            DatoPersonal.rtxtpersonasolicitante.setVisible(true);

                            DatoGeneral.tituloexamenpre.setVisible(true);
                            DatoGeneral.btnsave.setVisible(true);

                        } else //validación inicio de Rutina operaciones
                        if (("Procedimiento".equals(tipodemotivo) && "Rutina (operaciones)".equals(tipoexam)) || ("Ascenso".equals(tipodemotivo) && "Rutina (operaciones)".equals(tipoexam))) {

                            this.setVisible(false);

                            if (dage.isVisible()) {

                                JOptionPane.showMessageDialog(null, "¡Datos generales ya se encuentra en uso!", "Validación de parámetros", JOptionPane.DEFAULT_OPTION, iconThinking_uh);
                                
                            } else if (!dage.isVisible()) {

                                int anchoprograma = (na.getWidth());
                                int altoprograma = (na.getHeight());
                                dage.setSize(anchoprograma, altoprograma);
                                MenuPrincipal.na.add(dage);
                                dage.show();

                                DatoGeneral.paratodo.add(daper);
                                daper.show();
                                DatosPrincipales.setTipoExamen(tipoexam);
                                DatoGeneral.btnTerminar.setVisible(false);
                                DatoGeneral.btneditar.setVisible(false);
                                DatoPersonal.txtpersonasolicitante.setText(DatosPrincipales.getNombreSolicitante());
                                DatoPersonal.txtcargosolicitante.setText(DatosPrincipales.getCargoSolicitante());
                                MenuPrincipal.jPanel9.setVisible(false);
                                MenuPrincipal.jPanel10.setVisible(false);

                                if ("Procedimiento".equals(tipodemotivo)) {
                                    DatoGeneral.tituloexamenpre.setText("Examen Rutina Operaciones (procedimiento)");
                                    DatoPersonal.jPanel1.setVisible(true);
                                    DatoPersonal.jPanel3.setVisible(false);
                                    DatoPersonal.cargoactual.setVisible(true);
                                    DatoPersonal.txtcargoactual.setVisible(true);
                                    DatoPersonal.txtareaactual.setText(txtareaexaminado.getText());
                                    DatoPersonal.rtxtcargoactual.setVisible(true);
                                    DatoPersonal.areaactual.setVisible(true);
                                    DatoPersonal.txtareaactual.setVisible(true);
                                    DatoPersonal.rtxtareaactual.setVisible(true);
                                    DatoPersonal.cargoaspira.setVisible(false);
                                    DatoPersonal.txtcargoaspira.setVisible(false);
                                    DatoPersonal.rtxtcargoaspira.setVisible(false);
                                    DatoPersonal.areaaspira.setVisible(false);
                                    DatoPersonal.txtareaaspira.setVisible(false);
                                    DatoPersonal.rtxtareaaspira.setVisible(false);
                                } else if ("Ascenso".equals(tipodemotivo)) {
                                    DatoGeneral.tituloexamenpre.setText("Examen Rutina Operaciones (ascenso)");
                                    DatoPersonal.jPanel1.setVisible(true);
                                    DatoPersonal.jPanel3.setVisible(true);
                                    DatoPersonal.cargoactual.setVisible(true);
                                    DatoPersonal.txtcargoactual.setVisible(true);
                                    DatoPersonal.rtxtcargoactual.setVisible(true);
                                    DatoPersonal.areaactual.setVisible(true);
                                    DatoPersonal.txtareaactual.setVisible(true);
                                    DatoPersonal.txtareaactual.setText(txtareaexaminado.getText());
                                    DatoPersonal.rtxtareaactual.setVisible(true);
                                    DatoPersonal.cargoaspira.setVisible(true);
                                    DatoPersonal.txtcargoaspira.setVisible(true);
                                    DatoPersonal.rtxtcargoaspira.setVisible(true);
                                    DatoPersonal.areaaspira.setVisible(true);
                                    DatoPersonal.txtareaaspira.setVisible(true);
                                    DatoPersonal.rtxtareaaspira.setVisible(true);
                                }
                            }

                            

                            DatoGeneral.jLabel2.setVisible(true);//Datos personales
                            DatoGeneral.jLabel3.setVisible(true);//Estado de salud
                            DatoGeneral.jLabel4.setVisible(true);//Info familiar
                            DatoGeneral.jLabel10.setVisible(true);//Info académica
                            DatoGeneral.jLabel5.setVisible(true);//Info financiera
                            DatoGeneral.jLabel13.setVisible(true);//Actvidades tiempo libre
                            DatoGeneral.jLabel6.setVisible(true);//Consumo bebidas
                            DatoGeneral.jLabel7.setVisible(true);//Consumo sustancias
                            DatoGeneral.jLabel8.setVisible(true);//Antecendentes
                            DatoGeneral.jLabel9.setVisible(true);//Vinculos personas
                            DatoGeneral.jLabel11.setVisible(true);//Falsificacion /  Conducta laboral
                            DatoGeneral.jLabel12.setVisible(false);//Historia laboral
                            DatoGeneral.jLabel11.setText("Conducta laboral");//Historia laboral
                            DatoGeneral.jLabel14.setVisible(false);//Planes infiltracion
                            DatoGeneral.jLabel18.setVisible(false);//Tema bajo investigación
                            DatoGeneral.jLabel15.setVisible(true);//Tecnica empleada
//                            DatoGeneral.jLabel16.setVisible(false);//Admisiones

                            DatoGeneral.jLabel2.setEnabled(true);//Datos personales
                            DatoGeneral.jLabel3.setEnabled(true);//Estado de salud
                            DatoGeneral.jLabel4.setEnabled(false);//Info familiar
                            DatoGeneral.jLabel10.setEnabled(false);//Info académica
                            DatoGeneral.jLabel5.setEnabled(false);//Info financiera
                            DatoGeneral.jLabel13.setEnabled(false);//Actvidades tiempo libre
                            DatoGeneral.jLabel6.setEnabled(false);//Consumo bebidas
                            DatoGeneral.jLabel7.setEnabled(false);//Consumo sustancias
                            DatoGeneral.jLabel8.setEnabled(false);//Antecendentes
                            DatoGeneral.jLabel9.setEnabled(false);//Vinculos personas
                            DatoGeneral.jLabel11.setEnabled(false);//Falsificacion /  Conducta laboral
                            DatoGeneral.jLabel12.setEnabled(false);//Historia laboral
                            DatoGeneral.jLabel14.setEnabled(false);//Planes infiltracion
                            DatoGeneral.jLabel18.setEnabled(false);//Tema bajo investigación
                            DatoGeneral.jLabel15.setEnabled(false);//Tecnica empleada
//                            DatoGeneral.jLabel16.setEnabled(false);//Admisiones

                            DatoGeneral.jLabel2.setForeground(Color.red);//Datos personales
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
//                            DatoGeneral.jLabel16.setForeground(Color.black);//Admisiones

                            DatoGeneral.fechaizquierda.setVisible(false);
                            DatoGeneral.fechaderecha.setVisible(true);

                        } else //validación inicio de Rutina administrativos
                        if (("Procedimiento".equals(tipodemotivo) && "Rutina (admitivos)".equals(tipoexam)) || ("Ascenso".equals(tipodemotivo) && "Rutina (admitivos)".equals(tipoexam))) {

                            this.setVisible(false);

                            if (dage.isVisible()) {

                                JOptionPane.showMessageDialog(null, "¡Datos generales ya se encuentra en uso!", "Validación de parámetros", JOptionPane.DEFAULT_OPTION, iconThinking_uh);

                            } else if (!dage.isVisible()) {

                                int anchoprograma = (na.getWidth());
                                int altoprograma = (na.getHeight());
                                dage.setSize(anchoprograma, altoprograma);
                                MenuPrincipal.na.add(dage);
                                dage.show();

                                DatoGeneral.paratodo.add(daper);
                                daper.show();
                                DatosPrincipales.setTipoExamen(tipoexam);
                                DatoGeneral.btnTerminar.setVisible(false);
                                DatoGeneral.btneditar.setVisible(false);
                                DatoPersonal.txtpersonasolicitante.setText(DatosPrincipales.getNombreSolicitante());
                                DatoPersonal.txtcargosolicitante.setText(DatosPrincipales.getCargoSolicitante());
                                MenuPrincipal.jPanel9.setVisible(false);
                                MenuPrincipal.jPanel10.setVisible(false);

                                if ((tipodemotivo).equals("Procedimiento")) {
                                    DatoGeneral.tituloexamenpre.setText("Examen Rutina Administrativos (procedimiento)");
                                    DatoPersonal.jPanel1.setVisible(true);
                                    DatoPersonal.jPanel3.setVisible(false);
                                    DatoPersonal.cargoactual.setVisible(true);
                                    DatoPersonal.txtcargoactual.setVisible(true);
                                    DatoPersonal.rtxtcargoactual.setVisible(true);
                                    DatoPersonal.areaactual.setVisible(true);
                                    DatoPersonal.txtareaactual.setVisible(true);
                                    DatoPersonal.rtxtareaactual.setVisible(true);
                                    DatoPersonal.cargoaspira.setVisible(false);
                                    DatoPersonal.txtcargoaspira.setVisible(false);
                                    DatoPersonal.rtxtcargoaspira.setVisible(false);
                                    DatoPersonal.areaaspira.setVisible(false);
                                    DatoPersonal.txtareaaspira.setVisible(false);
                                    DatoPersonal.rtxtareaaspira.setVisible(false);
                                    DatoPersonal.txtareaactual.setText(txtareaexaminado.getText());
                                } else if ((tipodemotivo).equals("Ascenso")) {
                                    DatoGeneral.tituloexamenpre.setText("Examen Rutina Administrativos (ascenso)");
                                    DatoPersonal.jPanel1.setVisible(true);
                                    DatoPersonal.jPanel3.setVisible(true);
                                    DatoPersonal.cargoactual.setVisible(true);
                                    DatoPersonal.txtcargoactual.setVisible(true);
                                    DatoPersonal.rtxtcargoactual.setVisible(true);
                                    DatoPersonal.areaactual.setVisible(true);
                                    DatoPersonal.txtareaactual.setVisible(true);
                                    DatoPersonal.rtxtareaactual.setVisible(true);
                                    DatoPersonal.cargoaspira.setVisible(true);
                                    DatoPersonal.txtcargoaspira.setVisible(true);
                                    DatoPersonal.rtxtcargoaspira.setVisible(true);
                                    DatoPersonal.areaaspira.setVisible(true);
                                    DatoPersonal.txtareaaspira.setVisible(true);
                                    DatoPersonal.rtxtareaaspira.setVisible(true);
                                    DatoPersonal.txtareaactual.setText(txtareaexaminado.getText());
                                }
                            }

                            

                            DatoGeneral.jLabel2.setVisible(true);//Datos personales
                            DatoGeneral.jLabel3.setVisible(true);//Estado de salud
                            DatoGeneral.jLabel4.setVisible(true);//Info familiar
                            DatoGeneral.jLabel10.setVisible(true);//Info académica
                            DatoGeneral.jLabel5.setVisible(true);//Info financiera
                            DatoGeneral.jLabel13.setVisible(true);//Actvidades tiempo libre
                            DatoGeneral.jLabel6.setVisible(true);//Consumo bebidas
                            DatoGeneral.jLabel7.setVisible(true);//Consumo sustancias
                            DatoGeneral.jLabel8.setVisible(true);//Antecendentes
                            DatoGeneral.jLabel9.setVisible(true);//Vinculos personas
                            DatoGeneral.jLabel11.setVisible(true);//Falsificacion /  Conducta laboral
                            DatoGeneral.jLabel12.setVisible(false);//Historia laboral
                            DatoGeneral.jLabel11.setText("Conducta laboral");//Historia laboral
                            DatoGeneral.jLabel14.setVisible(false);//Planes infiltracion
                            DatoGeneral.jLabel18.setVisible(false);//Tema bajo investigación
                            DatoGeneral.jLabel15.setVisible(true);//Tecnica empleada
//                            DatoGeneral.jLabel16.setVisible(false);//Admisiones

                            DatoGeneral.jLabel2.setEnabled(true);//Datos personales
                            DatoGeneral.jLabel3.setEnabled(true);//Estado de salud
                            DatoGeneral.jLabel4.setEnabled(false);//Info familiar
                            DatoGeneral.jLabel10.setEnabled(false);//Info académica
                            DatoGeneral.jLabel5.setEnabled(false);//Info financiera
                            DatoGeneral.jLabel13.setEnabled(false);//Actvidades tiempo libre
                            DatoGeneral.jLabel6.setEnabled(false);//Consumo bebidas
                            DatoGeneral.jLabel7.setEnabled(false);//Consumo sustancias
                            DatoGeneral.jLabel8.setEnabled(false);//Antecendentes
                            DatoGeneral.jLabel9.setEnabled(false);//Vinculos personas
                            DatoGeneral.jLabel11.setEnabled(false);//Falsificacion /  Conducta laboral
                            DatoGeneral.jLabel12.setEnabled(false);//Historia laboral
                            DatoGeneral.jLabel14.setEnabled(false);//Planes infiltracion
                            DatoGeneral.jLabel18.setEnabled(false);//Tema bajo investigación
                            DatoGeneral.jLabel15.setEnabled(false);//Tecnica empleada
//                            DatoGeneral.jLabel16.setEnabled(false);//Admisiones

                            DatoGeneral.jLabel2.setForeground(Color.red);//Datos personales
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
//                            DatoGeneral.jLabel16.setForeground(Color.black);//Tecnica empleada
                            DatoGeneral.jLabel15.setForeground(Color.black);//Admisiones

                            DatoGeneral.fechaizquierda.setVisible(false);
                            DatoGeneral.fechaderecha.setVisible(true);
                            DatoPersonal.personasolicitante.setVisible(true);
                            DatoPersonal.rtxtpersonasolicitante.setVisible(true);

                        } else //validación inicio de Específico
                        if ("Caso específico".equals(tipodemotivo) && "Específico".equals(tipoexam)) {

                            this.setVisible(false);

                            if (dage.isVisible()) {

                                JOptionPane.showMessageDialog(null, "¡Datos generales ya se encuentra en uso!", "Validación de parámetros", JOptionPane.DEFAULT_OPTION, iconThinking_uh);

                            } else if (!dage.isVisible()) {

                                MenuPrincipal.na.add(dage);
                                dage.show();
                                DatoGeneral.tituloexamenpre.setText("Examen Específico");
                                DatoGeneral.paratodo.add(daper);
                                daper.show();
                                DatosPrincipales.setTipoExamen(tipoexam);
                                DatoGeneral.btnTerminar.setVisible(false);
                                DatoGeneral.btneditar.setVisible(false);
                                DatoPersonal.txtpersonasolicitante.setText(DatosPrincipales.getNombreSolicitante());
                                DatoPersonal.txtcargosolicitante.setText(DatosPrincipales.getCargoSolicitante());
                                DatoPersonal.txtareaactual.setText(txtareaexaminado.getText());
                                MenuPrincipal.jPanel9.setVisible(false);
                                MenuPrincipal.jPanel10.setVisible(false);

                            }

                            DatoGeneral.jLabel2.setVisible(true);//Datos personales
                            DatoGeneral.jLabel3.setVisible(true);//Estado de salud
                            DatoGeneral.jLabel4.setVisible(true);//Info familiar
                            DatoGeneral.jLabel10.setVisible(true);//Info académica
                            DatoGeneral.jLabel5.setVisible(true);//Info financiera
                            DatoGeneral.jLabel13.setVisible(false);//Actvidades tiempo libre
                            DatoGeneral.jLabel6.setVisible(true);//Consumo bebidas
                            DatoGeneral.jLabel7.setVisible(true);//Consumo sustancias
                            DatoGeneral.jLabel8.setVisible(true);//Antecendentes
                            DatoGeneral.jLabel9.setVisible(true);//Vinculos personas
                            DatoGeneral.jLabel11.setVisible(false);//Falsificacion /  Conducta laboral
                            DatoGeneral.jLabel12.setVisible(false);//Historia laboral
                            DatoGeneral.jLabel14.setVisible(false);//Planes infiltracion
                            DatoGeneral.jLabel18.setVisible(true);//Tema bajo investigación
                            DatoGeneral.jLabel15.setVisible(true);//Tecnica empleada
//                            DatoGeneral.jLabel16.setVisible(false);//Admisiones

                            DatoGeneral.jLabel2.setForeground(Color.red);
                            DatoGeneral.jLabel3.setForeground(Color.black);
                            DatoGeneral.jLabel4.setForeground(Color.black);
                            DatoGeneral.jLabel10.setForeground(Color.black);
                            DatoGeneral.jLabel5.setForeground(Color.black);
                            DatoGeneral.jLabel6.setForeground(Color.black);
                            DatoGeneral.jLabel7.setForeground(Color.black);
                            DatoGeneral.jLabel8.setForeground(Color.black);
                            DatoGeneral.jLabel9.setForeground(Color.black);
                            DatoGeneral.jLabel18.setForeground(Color.black);
                            DatoGeneral.jLabel15.setForeground(Color.black);
                            
                            DatoGeneral.jLabel2.setEnabled(true);//Datos personales
                            DatoGeneral.jLabel3.setEnabled(true);//Estado de salud
                            DatoGeneral.jLabel4.setEnabled(false);//Info familiar
                            DatoGeneral.jLabel10.setEnabled(false);//Info académica
                            DatoGeneral.jLabel5.setEnabled(false);//Info financiera
                            DatoGeneral.jLabel13.setEnabled(false);//Actvidades tiempo libre
                            DatoGeneral.jLabel6.setEnabled(false);//Consumo bebidas
                            DatoGeneral.jLabel7.setEnabled(false);//Consumo sustancias
                            DatoGeneral.jLabel8.setEnabled(false);//Antecendentes
                            DatoGeneral.jLabel9.setEnabled(false);//Vinculos personas
                            DatoGeneral.jLabel11.setEnabled(false);//Falsificacion /  Conducta laboral
                            DatoGeneral.jLabel12.setEnabled(false);//Historia laboral
                            DatoGeneral.jLabel14.setEnabled(false);//Planes infiltracion
                            DatoGeneral.jLabel18.setEnabled(false);//Tema bajo investigación
                            DatoGeneral.jLabel15.setEnabled(false);//Tecnica empleada
//                            DatoGeneral.jLabel16.setEnabled(false);//Admisiones

                            DatoPersonal.jPanel1.setVisible(true);
                            DatoPersonal.jPanel3.setVisible(false);
                            DatoGeneral.fechaizquierda.setVisible(false);
                            DatoGeneral.fechaderecha.setVisible(true);
                            DatoPersonal.cargoactual.setVisible(true);
                            DatoPersonal.txtcargoactual.setVisible(true);
                            DatoPersonal.rtxtcargoactual.setVisible(true);
                            DatoPersonal.areaactual.setVisible(true);
                            DatoPersonal.txtareaactual.setVisible(true);
                            DatoPersonal.rtxtareaactual.setVisible(true);
                            DatoPersonal.cargoaspira.setVisible(false);
                            DatoPersonal.txtcargoaspira.setVisible(false);
                            DatoPersonal.rtxtcargoaspira.setVisible(false);
                            DatoPersonal.areaaspira.setVisible(false);
                            DatoPersonal.txtareaaspira.setVisible(false);
                            DatoPersonal.rtxtareaaspira.setVisible(false);
                            DatoPersonal.personasolicitante.setVisible(true);
                            DatoPersonal.rtxtpersonasolicitante.setVisible(true);

                        }

                        DatoPersonal.txtnombre.setText(DatosPrincipales.getNombreExaminado());
                        DatoPersonal.cbxtipoiden.setSelectedItem(DatosPrincipales.getTipoIdenExaminado());
                        DatoPersonal.txtnoiden.setText(DatosPrincipales.getNoIdenExaminado());
                        DatosPrincipales.setTipoExamen(tipoexam);
                        DatosPrincipales.setMotivoExamen(tipodemotivo);

                    }
                }
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        cbxtipoiden = new javax.swing.JComboBox<>();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        txtfechadeexam = new javax.swing.JTextField();
        txtnomevaluado = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        txtnoidexaminado = new javax.swing.JTextField();
        txtareaexaminado = new javax.swing.JTextField();
        tituloexamenpre = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel50 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jPanel22 = new javax.swing.JPanel();
        jLabel70 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        place = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        txtnomsolicitante = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        txtcargosolicitante = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(null);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel16.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel16.setText("Tipo de Identificación:");

        cbxtipoiden.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        cbxtipoiden.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "CC", "TI", "CE", "PEP", "PASS" }));
        cbxtipoiden.setBorder(null);
        cbxtipoiden.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cbxtipoiden.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxtipoidenItemStateChanged(evt);
            }
        });
        cbxtipoiden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxtipoidenActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel17.setText("Número de Identificación:");

        jLabel18.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel18.setText("Campaña o Área:");

        jLabel19.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel19.setText("Nombre del Evaluado:");

        jLabel21.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel21.setText("Fecha de realización del examen:");

        txtfechadeexam.setEditable(false);
        txtfechadeexam.setBackground(new java.awt.Color(255, 255, 255));
        txtfechadeexam.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtfechadeexam.setBorder(null);

        txtnomevaluado.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtnomevaluado.setBorder(null);
        txtnomevaluado.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtnomevaluadoCaretUpdate(evt);
            }
        });
        txtnomevaluado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnomevaluadoKeyTyped(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel22.setText("Ciudad de realización del examen:");

        txtnoidexaminado.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtnoidexaminado.setBorder(null);
        txtnoidexaminado.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtnoidexaminadoCaretUpdate(evt);
            }
        });
        txtnoidexaminado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnoidexaminadoKeyTyped(evt);
            }
        });

        txtareaexaminado.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtareaexaminado.setBorder(null);
        txtareaexaminado.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtareaexaminadoCaretUpdate(evt);
            }
        });
        txtareaexaminado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtareaexaminadoKeyTyped(evt);
            }
        });

        tituloexamenpre.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        tituloexamenpre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloexamenpre.setText("Creación de nuevo examen");

        jPanel9.setBackground(new java.awt.Color(0, 0, 0));
        jPanel9.setForeground(new java.awt.Color(255, 255, 255));
        jPanel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel9.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanel9MouseMoved(evt);
            }
        });
        jPanel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel9MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel9MouseExited(evt);
            }
        });

        jLabel50.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/right-arrow.png"))); // NOI18N
        jLabel50.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel50MouseMoved(evt);
            }
        });
        jLabel50.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel50MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel50MouseExited(evt);
            }
        });

        jLabel47.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(255, 255, 255));
        jLabel47.setText("Siguiente");
        jLabel47.setAlignmentX(1.0F);
        jLabel47.setAlignmentY(1.0F);
        jLabel47.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel47MouseMoved(evt);
            }
        });
        jLabel47.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel47MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel47MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel50)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel47)
                .addGap(47, 47, 47))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel47)
                    .addComponent(jLabel50))
                .addContainerGap())
        );

        jPanel22.setBackground(java.awt.Color.red);
        jPanel22.setForeground(new java.awt.Color(255, 255, 255));
        jPanel22.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel22.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanel22MouseMoved(evt);
            }
        });
        jPanel22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel22MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel22MouseExited(evt);
            }
        });

        jLabel70.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/multiply.png"))); // NOI18N
        jLabel70.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel70MouseMoved(evt);
            }
        });
        jLabel70.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel70MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel70MouseExited(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Cancelar");
        jLabel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel1MouseMoved(evt);
            }
        });
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel1MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel70)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel70)
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        place.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        place.setText("site");

        jLabel29.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel30.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel31.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel20.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel20.setText("Nombre del Solicitante:");

        jLabel32.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtnomsolicitante.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtnomsolicitante.setBorder(null);
        txtnomsolicitante.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtnomsolicitanteCaretUpdate(evt);
            }
        });
        txtnomsolicitante.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnomsolicitanteKeyTyped(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel23.setText("Cargo del Solicitante:");

        jLabel33.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtcargosolicitante.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtcargosolicitante.setBorder(null);
        txtcargosolicitante.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtcargosolicitanteCaretUpdate(evt);
            }
        });
        txtcargosolicitante.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcargosolicitanteKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel23)
                        .addGap(116, 116, 116)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtcargosolicitante, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel20)
                        .addGap(103, 103, 103)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtnomsolicitante, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel16)
                    .addComponent(jLabel17)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel21)
                        .addGap(47, 47, 47)
                        .addComponent(txtfechadeexam, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(202, 202, 202)
                            .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel19)
                                .addComponent(jLabel18)
                                .addComponent(jLabel22))
                            .addGap(39, 39, 39)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtareaexaminado, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtnomevaluado, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(place, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel30, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtnoidexaminado, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cbxtipoiden, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(tituloexamenpre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(40, 40, 40))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(tituloexamenpre)
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(txtfechadeexam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19)
                    .addComponent(txtnomevaluado, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(cbxtipoiden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(txtnoidexaminado, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(txtareaexaminado, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtnomsolicitante, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20))
                .addGap(0, 0, 0)
                .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel23)
                    .addComponent(txtcargosolicitante, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(place))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbxtipoidenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxtipoidenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxtipoidenActionPerformed

    private void jPanel9MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel9MouseMoved
jPanel9.setBackground(Color.DARK_GRAY);
    }//GEN-LAST:event_jPanel9MouseMoved

    private void jPanel9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel9MouseExited
jPanel9.setBackground(Color.BLACK);
    }//GEN-LAST:event_jPanel9MouseExited

    private void jLabel70MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel70MouseMoved
jPanel22.setBackground(Color.decode("#D50000"));
    }//GEN-LAST:event_jLabel70MouseMoved

    private void jLabel70MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel70MouseClicked
        int resp = JOptionPane.showConfirmDialog(null, "¿Esta seguro?", "Alerta!", JOptionPane.YES_NO_OPTION, JOptionPane.DEFAULT_OPTION, iconThinking);
        if (resp == 0) {
            limpiar_e();
            this.setVisible(false);
            MenuPrincipal.jPanel9.setVisible(true);
            MenuPrincipal.jPanel10.setVisible(true);
        }
    }//GEN-LAST:event_jLabel70MouseClicked

    private void jLabel70MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel70MouseExited
jPanel22.setBackground(Color.red);
    }//GEN-LAST:event_jLabel70MouseExited

    private void jPanel22MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel22MouseMoved
 jPanel22.setBackground(Color.decode("#D50000"));
    }//GEN-LAST:event_jPanel22MouseMoved

    private void jPanel22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel22MouseClicked
        int resp = JOptionPane.showConfirmDialog(null, "¿Esta seguro?", "Alerta!", JOptionPane.YES_NO_OPTION, JOptionPane.DEFAULT_OPTION, iconThinking);
        if (resp == 0) {
            limpiar_e();
            this.setVisible(false);
            MenuPrincipal.jPanel9.setVisible(true);
            MenuPrincipal.jPanel10.setVisible(true);
        }
    }//GEN-LAST:event_jPanel22MouseClicked

    private void jPanel22MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel22MouseExited
jPanel22.setBackground(Color.red);
    }//GEN-LAST:event_jPanel22MouseExited

    private void jPanel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel9MouseClicked
        iniciarCreacionExamen();
    }//GEN-LAST:event_jPanel9MouseClicked

    private void txtnoidexaminadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnoidexaminadoKeyTyped
        int k = (int) evt.getKeyChar();

        //validación para números
        if (k >= 32 && k < 48 || k > 57 && k != 127) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "¡Solamente se aceptan números!", "Error de datos ingresados", JOptionPane.ERROR_MESSAGE, iconThinking_uh);
        }

        InputMap map = txtnoidexaminado.getInputMap(JTextField.WHEN_FOCUSED);
        map.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, CTRL_MASK), "null");
    }//GEN-LAST:event_txtnoidexaminadoKeyTyped

    private void txtnomevaluadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnomevaluadoKeyTyped
        int k = (int) evt.getKeyChar();

        //validación para letras
        if (k > 32 && k < 65 || k > 90 && k < 97 || k > 165 && k != 225 && k != 233 && k != 237 && k != 241 && k != 243 && k != 250 && k != 193 && k != 209 && k != 201 && k != 205 && k != 211 && k != 218) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "¡No se acepta ese tipo de carácter!", "Error de datos ingresados", JOptionPane.ERROR_MESSAGE, iconThinking_uh);
        }

        InputMap map = txtnomevaluado.getInputMap(JTextField.WHEN_FOCUSED);
        map.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, CTRL_MASK), "null");
    }//GEN-LAST:event_txtnomevaluadoKeyTyped

    private void txtareaexaminadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtareaexaminadoKeyTyped
        if ((int) evt.getKeyChar() == KeyEvent.VK_ENTER) {
            iniciarCreacionExamen();
        }
        //validación para letras y números
        int k = (int) evt.getKeyChar();

        if (k > 32 && k < 65 && k != 44 && k != 45 && k != 46 && k != 47 && k != 48 && k != 49 && k != 50 && k != 51 && k != 52 && k != 53 && k != 54 && k != 55 && k != 56 && k != 57 && k != 58 && k != 59 || k > 90 && k < 97 || k > 165 && k != 225 && k != 233 && k != 237 && k != 241 && k != 243 && k != 250 && k != 193 && k != 209 && k != 201 && k != 205 && k != 211 && k != 218) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "¡No se acepta ese tipo de carácter!", "Error de datos ingresados", JOptionPane.ERROR_MESSAGE, iconThinking_uh);
        }

        InputMap map = txtareaexaminado.getInputMap(JTextField.WHEN_FOCUSED);
    }//GEN-LAST:event_txtareaexaminadoKeyTyped

    private void txtnomevaluadoCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtnomevaluadoCaretUpdate
        DatosPrincipales.setNombreExaminado(txtnomevaluado.getText());
    }//GEN-LAST:event_txtnomevaluadoCaretUpdate

    private void cbxtipoidenItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxtipoidenItemStateChanged
        DatosPrincipales.setTipoIdenExaminado(cbxtipoiden.getSelectedItem().toString());
    }//GEN-LAST:event_cbxtipoidenItemStateChanged

    private void txtnoidexaminadoCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtnoidexaminadoCaretUpdate
        DatosPrincipales.setNoIdenExaminado(txtnoidexaminado.getText());
    }//GEN-LAST:event_txtnoidexaminadoCaretUpdate

    private void txtareaexaminadoCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtareaexaminadoCaretUpdate

    }//GEN-LAST:event_txtareaexaminadoCaretUpdate

    private void txtnomsolicitanteCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtnomsolicitanteCaretUpdate
        DatosPrincipales.setNombreSolicitante(txtnomsolicitante.getText());
    }//GEN-LAST:event_txtnomsolicitanteCaretUpdate

    private void txtnomsolicitanteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnomsolicitanteKeyTyped
        int k = (int) evt.getKeyChar();

        //validación para letras
        if (k > 32 && k < 65 || k > 90 && k < 97 || k > 165 && k != 225 && k != 233 && k != 237 && k != 241 && k != 243 && k != 250 && k != 193 && k != 209 && k != 201 && k != 205 && k != 211 && k != 218) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "¡No se acepta ese tipo de carácter!", "Error de datos ingresados", JOptionPane.ERROR_MESSAGE, iconThinking_uh);
        }
    }//GEN-LAST:event_txtnomsolicitanteKeyTyped

    private void txtcargosolicitanteCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtcargosolicitanteCaretUpdate
        DatosPrincipales.setCargoSolicitante(txtcargosolicitante.getText());
    }//GEN-LAST:event_txtcargosolicitanteCaretUpdate

    private void txtcargosolicitanteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcargosolicitanteKeyTyped
        if ((int) evt.getKeyChar() == KeyEvent.VK_ENTER) {
            iniciarCreacionExamen();
        }
        int k = (int) evt.getKeyChar();

        //validación para letras
        if (k > 32 && k < 65 || k > 90 && k < 97 || k > 165 && k != 225 && k != 233 && k != 237 && k != 241 && k != 243 && k != 250 && k != 193 && k != 209 && k != 201 && k != 205 && k != 211 && k != 218) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "¡No se acepta ese tipo de carácter!", "Error de datos ingresados", JOptionPane.ERROR_MESSAGE, iconThinking_uh);
        }
    }//GEN-LAST:event_txtcargosolicitanteKeyTyped

    private void jLabel47MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel47MouseMoved
        jPanel9.setBackground(Color.DARK_GRAY);
    }//GEN-LAST:event_jLabel47MouseMoved

    private void jLabel50MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel50MouseMoved
        jPanel9.setBackground(Color.DARK_GRAY);
    }//GEN-LAST:event_jLabel50MouseMoved

    private void jLabel50MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel50MouseExited
       jPanel9.setBackground(Color.BLACK);
    }//GEN-LAST:event_jLabel50MouseExited

    private void jLabel47MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel47MouseExited
       jPanel9.setBackground(Color.BLACK);
    }//GEN-LAST:event_jLabel47MouseExited

    private void jLabel1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseMoved
       jPanel22.setBackground(Color.decode("#D50000"));
    }//GEN-LAST:event_jLabel1MouseMoved

    private void jLabel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseExited
  jPanel22.setBackground(Color.red);
    }//GEN-LAST:event_jLabel1MouseExited

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        int resp = JOptionPane.showConfirmDialog(null, "¿Esta seguro?", "Alerta!", JOptionPane.YES_NO_OPTION, JOptionPane.DEFAULT_OPTION, iconThinking);
        if (resp == 0) {
            limpiar_e();
            this.setVisible(false);
            MenuPrincipal.jPanel9.setVisible(true);
            MenuPrincipal.jPanel10.setVisible(true);
        }
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel47MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel47MouseClicked
       iniciarCreacionExamen();
    }//GEN-LAST:event_jLabel47MouseClicked

    private void jLabel50MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel50MouseClicked
        iniciarCreacionExamen();
    }//GEN-LAST:event_jLabel50MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JComboBox<String> cbxtipoiden;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel9;
    public static javax.swing.JLabel place;
    private javax.swing.JLabel tituloexamenpre;
    public static javax.swing.JTextField txtareaexaminado;
    public static javax.swing.JTextField txtcargosolicitante;
    public static javax.swing.JTextField txtfechadeexam;
    public static javax.swing.JTextField txtnoidexaminado;
    public static javax.swing.JTextField txtnomevaluado;
    public static javax.swing.JTextField txtnomsolicitante;
    // End of variables declaration//GEN-END:variables
}
