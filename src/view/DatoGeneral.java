package view;

import classes.PlanesInfiltracion;
import classes.InfoFamiliar;
import classes.HistoriaLaboral;
import classes.ConsumoSustancias;
import classes.ActiTiempoLibre;
import classes.DatosPersonales;
import classes.TecnicaYPreguntas;
import classes.ConsumoBebidas;
import classes.AccionesExamen;
import classes.Admisiones;
import classes.InfoFinanciera;
import classes.Conexion;
import classes.VinculosPersonas;
import classes.Falsificacion;
import classes.EstadoSalud;
import classes.AntecedentesJudiciales;
import classes.DatosPrincipales;
import classes.InfoAcademica;
//import classes.Limpiar;
//import classes.LimpiarView;
import classes.TemaBajo;
import icons.*;
import javax.swing.JOptionPane;
import java.awt.Color;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JInternalFrame;
import static view.MenuPrincipal.na;

/**
 *
 * @author Kevin Casas
 */
public class DatoGeneral extends javax.swing.JInternalFrame {

    public DatoGeneral() {
        initComponents();
        ((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI()).setNorthPane(null);
        componentes_datos();
    }
    AccionesExamen aex = new AccionesExamen();
    ActiTiempoLibre atl = new ActiTiempoLibre();
    AntecedentesJudiciales aj = new AntecedentesJudiciales();
    ConsumoBebidas cb = new ConsumoBebidas();
    ConsumoSustancias cs = new ConsumoSustancias();
    DatosPersonales dp = new DatosPersonales();
    EstadoSalud es = new EstadoSalud();
    Falsificacion fa = new Falsificacion();
    HistoriaLaboral hl = new HistoriaLaboral();
    InfoAcademica ia = new InfoAcademica();
    InfoFamiliar infa = new InfoFamiliar();
    InfoFinanciera infi = new InfoFinanciera();
    PlanesInfiltracion pi = new PlanesInfiltracion();
    TecnicaYPreguntas typ = new TecnicaYPreguntas();
    VinculosPersonas vp = new VinculosPersonas();

    SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");
    java.util.Date fecha = new java.util.Date();
    public String fechanow = date.format(fecha);

    Novedad nove = new Novedad();
    DatoPersonal daper = new DatoPersonal();
    EstadoDeSalud estsalud = new EstadoDeSalud();
    InformacionFamiliar inforfami = new InformacionFamiliar();
    InformacionAcademica infoaca = new InformacionAcademica();
    InformacionFinanciera infofinan = new InformacionFinanciera();
    ActividadTiemLibre casino = new ActividadTiemLibre();
    ConsumoBebida consbebidas = new ConsumoBebida();
    ConsumoSustancia consustan = new ConsumoSustancia();
    Antecedente antece = new Antecedente();
    TemaInvestigacion temain = new TemaInvestigacion();
    VinculosMargenLey vinculos = new VinculosMargenLey();
    FalsificacionHV falsifi = new FalsificacionHV();
    HistorialLaboral histlabo = new HistorialLaboral();
    PlanInfiltracion planinfil = new PlanInfiltracion();
    TecnicaYVerificacion tecp = new TecnicaYVerificacion();

    List iconList = new List();
    Question iconQuestion = new Question();
    Happier iconHappy = new Happier();
    ErrorI iconError = new ErrorI();
    Warning iconWarning = new Warning();
    Shocked iconShocked = new Shocked();
    Thinking iconThinking = new Thinking();
    Thinking_uh iconThinking_uh = new Thinking_uh();
    Noti1 iconNoti1 = new Noti1();
    Noti2 iconNoti2 = new Noti2();
    String tiempolab;
    int nummotivo = 0;

    // si es emplado mayor a 6 meses
    String[] mayor6Meses = {
        "Ingreso",
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

    public void nombreExamen() {
        String nombreDocumento;
        String n = null;
        String m = null;
        String nombreP = null;
        String nombreA = null;

        SimpleDateFormat days = new SimpleDateFormat("ddMMyy");
        java.util.Date fechaa = new java.util.Date();
        String diaa = days.format(fechaa);

        String sTexto = DatosPrincipales.getNombreUsuario();
        StringTokenizer stPalabras = new StringTokenizer(sTexto);
        ArrayList<String> nom = new ArrayList<>();
        while (stPalabras.hasMoreTokens()) {
            String sPalabra = stPalabras.nextToken();
            nom.add(sPalabra.substring(0, 1));
        }

        String sTextos = DatosPersonales.getAreaaspira();
        StringTokenizer stPalabrass = new StringTokenizer(sTextos);
        ArrayList<String> nomA = new ArrayList<>();
        while (stPalabrass.hasMoreTokens()) {
            String sPalabras = stPalabrass.nextToken();
            nomA.add(sPalabras.substring(0, 1));
        }

        String noeP = (String.valueOf(nom));
        String noeA = (String.valueOf(nomA));

        String nombP = noeP.trim().replace("[", "");
        String nombP2 = nombP.trim().replace("]", "");
        String nombP3 = nombP2.trim().replace(",", "");
        String nombP4 = nombP3.trim().replace(" ", "");
        String nombA = noeA.trim().replace("[", "");
        String nombA2 = nombA.trim().replace("]", "");
        String nombA3 = nombA2.trim().replace(",", "");
        String nombA4 = nombA3.trim().replace(" ", "");

        nombreP = nombP4;
        nombreA = nombA4;

        System.out.println("el tipo esssss " + DatosPrincipales.getTipoExamen());

        if (DatosPrincipales.getTipoExamen().equals("Pre-empleo")) {
            n = "PRE";
        } else if (DatosPrincipales.getTipoExamen().equals("Rutina (operaciones)")) {
            n = "RUT";
        } else if (DatosPrincipales.getTipoExamen().equals("Rutina (admitivos)")) {
            n = "RUT ADMO";
        } else if (DatosPrincipales.getTipoExamen().equals("Específico")) {
            n = "ESP";
        }

        if (DatosPrincipales.getCiudadExamen().equals("Bogotá")) {
            m = "BOG";
        } else if (DatosPrincipales.getCiudadExamen().equals("Bogotá - Zona Franca")) {
            m = "BOG";
        } else if (DatosPrincipales.getCiudadExamen().equals("Medellín")) {
            m = "MED";
        }

        nombreDocumento = DatosPrincipales.getTipoIdenExaminado() + "" + DatosPrincipales.getNoIdenExaminado() + " " + DatosPrincipales.getNombreExaminado().toUpperCase() + " " + n + " " + nombreA + " " + diaa + " " + nombreP;

        TecnicaYPreguntas.setNombreExamen(nombreDocumento);
    }

    public void limpiarTodo() {
        nombreExamen.setText("");
        System.out.println("cleaning each fucking component");
        atl.limpiar();
        aj.limpiar();
        cb.limpiar();
        cs.limpiar();
        dp.limpiar();
        es.limpiar();
        fa.limpiar();
        hl.limpiar();
        ia.limpiar();
        infa.limpiar();
        infi.limpiar();
        pi.limpiar();
        typ.limpiar();
        vp.limpiar();
        CreacionExamen.limpiar_e();

        DatoPersonal.limpiar();
        daper.limpiarFoto();
        estsalud.limpiar();
        inforfami.limpiar();
        infoaca.limpiar();
        infofinan.limpiar();
        casino.limpiar();
        consbebidas.limpiar();
        consustan.limpiar();
        antece.limpiar();
        temain.limpiar();
        vinculos.limpiar();
        falsifi.limpiar();
        histlabo.limpiar();
        planinfil.limpiar();
        tecp.limpiar();
        componentes_datos();

        daper.setEnabled(true);
        estsalud.setEnabled(false);
        inforfami.setEnabled(false);
        infoaca.setEnabled(false);
        infofinan.setEnabled(false);
        casino.setEnabled(false);
        consbebidas.setEnabled(false);
        consustan.setEnabled(false);
        antece.setEnabled(false);
        temain.setEnabled(false);
        vinculos.setEnabled(false);
        falsifi.setEnabled(false);
        histlabo.setEnabled(false);
        planinfil.setEnabled(false);
        tecp.setEnabled(false);
    }

    public void resultadoTodo() {

    }

    public void actualizarTodo() {

    }

    public void validarColor() {
        DatoGeneral.jLabel15.setForeground(java.awt.Color.black);
        if (ActiTiempoLibre.getColorCategoria().equals("con")) {
            DatoGeneral.jLabel13.setForeground(java.awt.Color.decode("#00a80d"));
        } else {
            DatoGeneral.jLabel13.setForeground(java.awt.Color.black);
        }
        if (AntecedentesJudiciales.getColorCategoria().equals("con")) {
            DatoGeneral.jLabel8.setForeground(java.awt.Color.decode("#00a80d"));
        } else {
            DatoGeneral.jLabel8.setForeground(java.awt.Color.black);
        }
        if (ConsumoBebidas.getColorCategoria().equals("con")) {
            DatoGeneral.jLabel6.setForeground(java.awt.Color.decode("#00a80d"));
        } else {
            DatoGeneral.jLabel6.setForeground(java.awt.Color.black);
        }
        if (ConsumoSustancias.getColorCategoria().equals("con")) {
            DatoGeneral.jLabel7.setForeground(java.awt.Color.decode("#00a80d"));
        } else {
            DatoGeneral.jLabel7.setForeground(java.awt.Color.black);
        }
        if (DatosPersonales.getColorCategoria().equals("con")) {
            DatoGeneral.jLabel2.setForeground(java.awt.Color.decode("#00a80d"));
        } else {
            DatoGeneral.jLabel2.setForeground(java.awt.Color.black);
        }
        if (EstadoSalud.getColorCategoria().equals("con")) {
            DatoGeneral.jLabel3.setForeground(java.awt.Color.decode("#00a80d"));
        } else {
            DatoGeneral.jLabel3.setForeground(java.awt.Color.black);
        }
        if (Falsificacion.getColorCategoria().equals("con")) {
            DatoGeneral.jLabel11.setForeground(java.awt.Color.decode("#00a80d"));
        } else {
            DatoGeneral.jLabel11.setForeground(java.awt.Color.black);
        }
        if (HistoriaLaboral.getColorCategoria().equals("con")) {
            DatoGeneral.jLabel12.setForeground(java.awt.Color.decode("#00a80d"));
        } else {
            DatoGeneral.jLabel12.setForeground(java.awt.Color.black);
        }
        if (InfoAcademica.getColorCategoria().equals("con")) {
            DatoGeneral.jLabel10.setForeground(java.awt.Color.decode("#00a80d"));
        } else {
            DatoGeneral.jLabel10.setForeground(java.awt.Color.black);
        }
        if (InfoFamiliar.getColorCategoria().equals("con")) {
            DatoGeneral.jLabel4.setForeground(java.awt.Color.decode("#00a80d"));
        } else {
            DatoGeneral.jLabel4.setForeground(java.awt.Color.black);
        }
        if (InfoFinanciera.getColorCategoria().equals("con")) {
            DatoGeneral.jLabel5.setForeground(java.awt.Color.decode("#00a80d"));
        } else {
            DatoGeneral.jLabel5.setForeground(java.awt.Color.black);
        }
        if (PlanesInfiltracion.getColorCategoria().equals("con")) {
            DatoGeneral.jLabel14.setForeground(java.awt.Color.decode("#00a80d"));
        } else {
            DatoGeneral.jLabel14.setForeground(java.awt.Color.black);
        }
        if (TemaBajo.getColorCategoria().equals("con")) {
            DatoGeneral.jLabel18.setForeground(java.awt.Color.decode("#00a80d"));
        } else {
            DatoGeneral.jLabel18.setForeground(java.awt.Color.black);
        }
        if (VinculosPersonas.getColorCategoria().equals("con")) {
            DatoGeneral.jLabel9.setForeground(java.awt.Color.decode("#00a80d"));
        } else {
            DatoGeneral.jLabel9.setForeground(java.awt.Color.black);
        }
    }

    public void validarEstado() {
        //pre empleooooooooooooooooooooo
        if (DatosPrincipales.getTipoExamen().equals("Pre-empleo")) {
            if (!ActiTiempoLibre.getColorCategoria().equals("con")) {
                JOptionPane.showMessageDialog(null, "¡Debe completar 'Actividades en tiempo libre' para terminar el examen!", "Validación de datos", JOptionPane.ERROR_MESSAGE, iconError);
            }
            if (!AntecedentesJudiciales.getColorCategoria().equals("con")) {
                JOptionPane.showMessageDialog(null, "¡Debe completar 'Antecedentes y anotaciones judiciales' para terminar el examen!", "Validación de datos", JOptionPane.ERROR_MESSAGE, iconError);
            }
            if (!ConsumoBebidas.getColorCategoria().equals("con")) {
                JOptionPane.showMessageDialog(null, "¡Debe completar 'Consumo de bebidas alcohólicas' para terminar el examen!", "Validación de datos", JOptionPane.ERROR_MESSAGE, iconError);
            }
            if (!ConsumoSustancias.getColorCategoria().equals("con")) {
                JOptionPane.showMessageDialog(null, "¡Debe completar 'Consumo de sustancias psicoactivas' para terminar el examen!", "Validación de datos", JOptionPane.ERROR_MESSAGE, iconError);
            }
            if (!DatosPersonales.getColorCategoria().equals("con")) {
                JOptionPane.showMessageDialog(null, "¡Debe completar 'Datos personales' para terminar el examen!", "Validación de datos", JOptionPane.ERROR_MESSAGE, iconError);
            }
            if (!EstadoSalud.getColorCategoria().equals("con")) {
                JOptionPane.showMessageDialog(null, "¡Debe completar 'Estado de salud' para terminar el examen!", "Validación de datos", JOptionPane.ERROR_MESSAGE, iconError);
            }
            if (!Falsificacion.getColorCategoria().equals("con")) {
                JOptionPane.showMessageDialog(null, "¡Debe completar 'Falsificación' para terminar el examen!", "Validación de datos", JOptionPane.ERROR_MESSAGE, iconError);
            }
            if (!HistoriaLaboral.getColorCategoria().equals("con")) {
                JOptionPane.showMessageDialog(null, "¡Debe completar 'Historia laboral' para terminar el examen!", "Validación de datos", JOptionPane.ERROR_MESSAGE, iconError);
            }
            if (!InfoAcademica.getColorCategoria().equals("con")) {
                JOptionPane.showMessageDialog(null, "¡Debe completar 'Información académica' para terminar el examen!", "Validación de datos", JOptionPane.ERROR_MESSAGE, iconError);
            }
            if (!InfoFamiliar.getColorCategoria().equals("con")) {
                JOptionPane.showMessageDialog(null, "¡Debe completar 'Información familiar' para terminar el examen!", "Validación de datos", JOptionPane.ERROR_MESSAGE, iconError);
            }
            if (!InfoFinanciera.getColorCategoria().equals("con")) {
                JOptionPane.showMessageDialog(null, "¡Debe completar 'Información financiera' para terminar el examen!", "Validación de datos", JOptionPane.ERROR_MESSAGE, iconError);
            }
            if (!PlanesInfiltracion.getColorCategoria().equals("con")) {
                JOptionPane.showMessageDialog(null, "¡Debe completar 'Planes de infiltración' para terminar el examen!", "Validación de datos", JOptionPane.ERROR_MESSAGE, iconError);
            }
            if (!TemaBajo.getColorCategoria().equals("con")) {
                JOptionPane.showMessageDialog(null, "¡Debe completar 'Tema bajo investigación' para terminar el examen!", "Validación de datos", JOptionPane.ERROR_MESSAGE, iconError);
            }
            if (!VinculosPersonas.getColorCategoria().equals("con")) {
                JOptionPane.showMessageDialog(null, "¡Debe completar 'Vínculos con personas al margen de la ley' para terminar el examen!", "Validación de datos", JOptionPane.ERROR_MESSAGE, iconError);
            }
        } else //Rutina operacioneeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeees
        if (DatosPrincipales.getTipoExamen().equals("Rutina (operaciones)")) {

            if (!ActiTiempoLibre.getColorCategoria().equals("con")) {
                JOptionPane.showMessageDialog(null, "¡Debe completar 'Actividades en tiempo libre' para terminar el examen!", "Validación de datos", JOptionPane.ERROR_MESSAGE, iconError);
            }
            if (!AntecedentesJudiciales.getColorCategoria().equals("con")) {
                JOptionPane.showMessageDialog(null, "¡Debe completar 'Antecedentes y anotaciones judiciales' para terminar el examen!", "Validación de datos", JOptionPane.ERROR_MESSAGE, iconError);
            }
            if (!ConsumoBebidas.getColorCategoria().equals("con")) {
                JOptionPane.showMessageDialog(null, "¡Debe completar 'Consumo de bebidas alcohólicas' para terminar el examen!", "Validación de datos", JOptionPane.ERROR_MESSAGE, iconError);
            }
            if (!ConsumoSustancias.getColorCategoria().equals("con")) {
                JOptionPane.showMessageDialog(null, "¡Debe completar 'Consumo de sustancias psicoactivas' para terminar el examen!", "Validación de datos", JOptionPane.ERROR_MESSAGE, iconError);
            }
            if (!DatosPersonales.getColorCategoria().equals("con")) {
                JOptionPane.showMessageDialog(null, "¡Debe completar 'Datos personales' para terminar el examen!", "Validación de datos", JOptionPane.ERROR_MESSAGE, iconError);
            }
            if (!EstadoSalud.getColorCategoria().equals("con")) {
                JOptionPane.showMessageDialog(null, "¡Debe completar 'Estado de salud' para terminar el examen!", "Validación de datos", JOptionPane.ERROR_MESSAGE, iconError);
            }
            if (!Falsificacion.getColorCategoria().equals("con")) {
                JOptionPane.showMessageDialog(null, "¡Debe completar 'Conducta laboral' para terminar el examen!", "Validación de datos", JOptionPane.ERROR_MESSAGE, iconError);
            }

            if (!InfoAcademica.getColorCategoria().equals("con")) {
                JOptionPane.showMessageDialog(null, "¡Debe completar 'Información académica' para terminar el examen!", "Validación de datos", JOptionPane.ERROR_MESSAGE, iconError);
            }
            if (!InfoFamiliar.getColorCategoria().equals("con")) {
                JOptionPane.showMessageDialog(null, "¡Debe completar 'Información familiar' para terminar el examen!", "Validación de datos", JOptionPane.ERROR_MESSAGE, iconError);
            }
            if (!InfoFinanciera.getColorCategoria().equals("con")) {
                JOptionPane.showMessageDialog(null, "¡Debe completar 'Información financiera' para terminar el examen!", "Validación de datos", JOptionPane.ERROR_MESSAGE, iconError);
            }

            if (!VinculosPersonas.getColorCategoria().equals("con")) {
                JOptionPane.showMessageDialog(null, "¡Debe completar 'Vínculos con personas al margen de la ley' para terminar el examen!", "Validación de datos", JOptionPane.ERROR_MESSAGE, iconError);
            }

        } else //Rutina administrativooooooooooooooooooooooooooooooooooooooooooooooos
        if (DatosPrincipales.getTipoExamen().equals("Rutina (admitivos)")) {

            if (!ActiTiempoLibre.getColorCategoria().equals("con")) {
                JOptionPane.showMessageDialog(null, "¡Debe completar 'Actividades en tiempo libre' para terminar el examen!", "Validación de datos", JOptionPane.ERROR_MESSAGE, iconError);
            }
            if (!AntecedentesJudiciales.getColorCategoria().equals("con")) {
                JOptionPane.showMessageDialog(null, "¡Debe completar 'Antecedentes y anotaciones judiciales' para terminar el examen!", "Validación de datos", JOptionPane.ERROR_MESSAGE, iconError);
            }
            if (!ConsumoBebidas.getColorCategoria().equals("con")) {
                JOptionPane.showMessageDialog(null, "¡Debe completar 'Consumo de bebidas alcohólicas' para terminar el examen!", "Validación de datos", JOptionPane.ERROR_MESSAGE, iconError);
            }
            if (!ConsumoSustancias.getColorCategoria().equals("con")) {
                JOptionPane.showMessageDialog(null, "¡Debe completar 'Consumo de sustancias psicoactivas' para terminar el examen!", "Validación de datos", JOptionPane.ERROR_MESSAGE, iconError);
            }
            if (!DatosPersonales.getColorCategoria().equals("con")) {
                JOptionPane.showMessageDialog(null, "¡Debe completar 'Datos personales' para terminar el examen!", "Validación de datos", JOptionPane.ERROR_MESSAGE, iconError);
            }
            if (!EstadoSalud.getColorCategoria().equals("con")) {
                JOptionPane.showMessageDialog(null, "¡Debe completar 'Estado de salud' para terminar el examen!", "Validación de datos", JOptionPane.ERROR_MESSAGE, iconError);
            }
            if (!Falsificacion.getColorCategoria().equals("con")) {
                JOptionPane.showMessageDialog(null, "¡Debe completar 'Conducta laboral' para terminar el examen!", "Validación de datos", JOptionPane.ERROR_MESSAGE, iconError);
            }

            if (!InfoAcademica.getColorCategoria().equals("con")) {
                JOptionPane.showMessageDialog(null, "¡Debe completar 'Información académica' para terminar el examen!", "Validación de datos", JOptionPane.ERROR_MESSAGE, iconError);
            }
            if (!InfoFamiliar.getColorCategoria().equals("con")) {
                JOptionPane.showMessageDialog(null, "¡Debe completar 'Información familiar' para terminar el examen!", "Validación de datos", JOptionPane.ERROR_MESSAGE, iconError);
            }
            if (!InfoFinanciera.getColorCategoria().equals("con")) {
                JOptionPane.showMessageDialog(null, "¡Debe completar 'Información financiera' para terminar el examen!", "Validación de datos", JOptionPane.ERROR_MESSAGE, iconError);
            }

            if (!VinculosPersonas.getColorCategoria().equals("con")) {
                JOptionPane.showMessageDialog(null, "¡Debe completar 'Vínculos con personas al margen de la ley' para terminar el examen!", "Validación de datos", JOptionPane.ERROR_MESSAGE, iconError);
            }

        } else //Especificooooooooooooooooooooooooooooooooooooooooooo
        if (DatosPrincipales.getTipoExamen().equals("Específico")) {
            if (!AntecedentesJudiciales.getColorCategoria().equals("con")) {
                JOptionPane.showMessageDialog(null, "¡Debe completar 'Antecedentes y anotaciones judiciales' para terminar el examen!", "Validación de datos", JOptionPane.ERROR_MESSAGE, iconError);
            }
            if (!ConsumoBebidas.getColorCategoria().equals("con")) {
                JOptionPane.showMessageDialog(null, "¡Debe completar 'Consumo de bebidas alcohólicas' para terminar el examen!", "Validación de datos", JOptionPane.ERROR_MESSAGE, iconError);
            }
            if (!ConsumoSustancias.getColorCategoria().equals("con")) {
                JOptionPane.showMessageDialog(null, "¡Debe completar 'Consumo de sustancias psicoactivas' para terminar el examen!", "Validación de datos", JOptionPane.ERROR_MESSAGE, iconError);
            }
            if (!DatosPersonales.getColorCategoria().equals("con")) {
                JOptionPane.showMessageDialog(null, "¡Debe completar 'Datos personales' para terminar el examen!", "Validación de datos", JOptionPane.ERROR_MESSAGE, iconError);
            }
            if (!EstadoSalud.getColorCategoria().equals("con")) {
                JOptionPane.showMessageDialog(null, "¡Debe completar 'Estado de salud' para terminar el examen!", "Validación de datos", JOptionPane.ERROR_MESSAGE, iconError);
            }
            if (!InfoAcademica.getColorCategoria().equals("con")) {
                JOptionPane.showMessageDialog(null, "¡Debe completar 'Información académica' para terminar el examen!", "Validación de datos", JOptionPane.ERROR_MESSAGE, iconError);
            }
            if (!InfoFamiliar.getColorCategoria().equals("con")) {
                JOptionPane.showMessageDialog(null, "¡Debe completar 'Información familiar' para terminar el examen!", "Validación de datos", JOptionPane.ERROR_MESSAGE, iconError);
            }
            if (!InfoFinanciera.getColorCategoria().equals("con")) {
                JOptionPane.showMessageDialog(null, "¡Debe completar 'Información financiera' para terminar el examen!", "Validación de datos", JOptionPane.ERROR_MESSAGE, iconError);
            }
            if (!TemaBajo.getColorCategoria().equals("con")) {
                JOptionPane.showMessageDialog(null, "¡Debe completar 'Tema bajo investigación' para terminar el examen!", "Validación de datos", JOptionPane.ERROR_MESSAGE, iconError);
            }
            if (!VinculosPersonas.getColorCategoria().equals("con")) {
                JOptionPane.showMessageDialog(null, "¡Debe completar 'Vínculos con personas al margen de la ley' para terminar el examen!", "Validación de datos", JOptionPane.ERROR_MESSAGE, iconError);
            }
        }
    }

    public void componentes_datos() {

        paratodo.add(estsalud);
        estsalud.show(false);
        paratodo.add(inforfami);
        inforfami.show(false);
        paratodo.add(infoaca);
        infoaca.show(false);
        paratodo.add(casino);
        casino.show(false);
        paratodo.add(infofinan);
        infofinan.show(false);
        paratodo.add(consbebidas);
        consbebidas.show(false);
        paratodo.add(consustan);
        consustan.show(false);
        paratodo.add(antece);
        antece.show(false);
        paratodo.add(temain);
        temain.show(false);
        paratodo.add(vinculos);
        vinculos.show(false);
        paratodo.add(falsifi);
        falsifi.show(false);
        paratodo.add(histlabo);
        histlabo.show(false);
        paratodo.add(planinfil);
        planinfil.show(false);
        paratodo.add(tecp);
        tecp.show(false);
    }

    public void terminarExamen() {

        System.out.println("exam is shutting down");
        System.out.println("ya lo vi bitch");
        this.setVisible(false);
        MenuPrincipal.jPanel10.setVisible(true);
        MenuPrincipal.jPanel9.setVisible(true);
        DatoGeneral.paratodo.removeAll();
        MenuPrincipal.na.remove(this);
        limpiarTodo();

    }

    public void cambiarExamen() {
        if (DatosPersonales.getValidacionRegistro().equals("noregistrado")) {
            JOptionPane.showMessageDialog(null, "¡Debe guardar los datos básicos primero!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
        } else {
            int changeexam = JOptionPane.showConfirmDialog(null, "¿Está seguro de cambiar el tipo de examen?", "Cambio de tipo de examen", JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE);
            if (changeexam == 0) {

                String[] motivoexa = mayor6Meses;

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
                    JOptionPane.showMessageDialog(null, "¡Cambio de examen cancelado!", "Cambio de tipo de examen", JOptionPane.DEFAULT_OPTION, iconThinking_uh);
                } else {

                    String tipoexam = (String) JOptionPane.showInputDialog(null, "¿Cuál es el tipo de examen de polígrafo? ", "Tipo de examen", JOptionPane.DEFAULT_OPTION, iconList, tipoexma, tipoexma[0]);

                    //validación inicio de examen
                    if (tipoexam == null || tipoexam.equals("")) {
                        JOptionPane.showMessageDialog(null, "¡Cambio de examen cancelado!", "Cambio de tipo de examen", JOptionPane.DEFAULT_OPTION, iconThinking_uh);
                    } else //validación inicio de Pre.empleo
                    if ("Ingreso".equals(tipodemotivo) && "Pre-empleo".equals(tipoexam)) {

                        try {
                            PreparedStatement sqlacade = Conexion.connection.prepareStatement("UPDATE datos_generales_poli "
                                    + "SET tipoexamen = 'Pre-empleo', motivoexamen = 'Ingreso'  WHERE t_identificacion = '" + DatosPrincipales.getTipoIdenExaminado() + "' AND no_id = " + DatosPrincipales.getNoIdenExaminado() + " AND  motivoexamen = '" + DatosPrincipales.getMotivoExamen() + "' AND tipoexamen = '" + DatosPrincipales.getTipoExamen() + "'");
                            sqlacade.executeUpdate();

                            DatosPrincipales.setTipoExamen(tipoexam);
                            DatosPrincipales.setMotivoExamen(tipodemotivo);

                            DatoPersonal.jPanel1.setVisible(false);
                            DatoPersonal.jPanel3.setVisible(true);

                            tituloexamenpre.setText("Examen Pre-empleo");
                            nombreExamen();
                            nombreExamen.setText("Nombre examen: " + TecnicaYPreguntas.getNombreExamen());

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
                            DatoGeneral.jLabel11.setText("Falsificacion");//Falsificacion  Conducta laboral
                            DatoGeneral.jLabel12.setVisible(true);//Historia laboral
                            DatoGeneral.jLabel14.setVisible(true);//Planes infiltracion
                            DatoGeneral.jLabel18.setVisible(false);//Tema bajo investigación
                            DatoGeneral.jLabel15.setVisible(true);//Tecnica empleada
//                            DatoGeneral.jLabel16.setVisible(false);//Admisiones  

                            validarColor();
                            DatoGeneral.jLabel2.setForeground(Color.red);//Datos personales

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

                            JOptionPane.showMessageDialog(null, "¡Examen cambiado!\nRecuerde llenar los datos de acuerdo al nuevo formato de examen", "Terminación de prueba examinado", JOptionPane.INFORMATION_MESSAGE);

                        } catch (SQLException e) {
                            JOptionPane.showMessageDialog(null, "¡Error al actualizar los datos del examen!\nPor favor solicite ayuda al equipo de desarrollo " + e);
                        }

                    } else //validación inicio de Rutina operaciones
                    if (("Procedimiento".equals(tipodemotivo) && "Rutina (operaciones)".equals(tipoexam)) || ("Ascenso".equals(tipodemotivo) && "Rutina (operaciones)".equals(tipoexam))) {
                        try {
                            PreparedStatement sqlacade = Conexion.connection.prepareStatement("UPDATE datos_generales_poli "
                                    + "SET tipoexamen = '" + tipoexam + "', motivoexamen = '" + tipodemotivo + "'  WHERE t_identificacion = '" + DatosPrincipales.getTipoIdenExaminado() + "' AND no_id = " + DatosPrincipales.getNoIdenExaminado() + " AND  motivoexamen = '" + DatosPrincipales.getMotivoExamen() + "' AND tipoexamen = '" + DatosPrincipales.getTipoExamen() + "'");
                            sqlacade.executeUpdate();

                            DatosPrincipales.setTipoExamen(tipoexam);
                            DatosPrincipales.setMotivoExamen(tipodemotivo);
                            if ("Procedimiento".equals(tipodemotivo)) {
                                DatoGeneral.tituloexamenpre.setText("Examen Rutina Operaciones (procedimiento)");
                                nombreExamen();
                                nombreExamen.setText("Nombre examen: " + TecnicaYPreguntas.getNombreExamen());
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
                            } else if ("Ascenso".equals(tipodemotivo)) {
                                DatoGeneral.tituloexamenpre.setText("Examen Rutina Operaciones (ascenso)");
                                nombreExamen();
                                nombreExamen.setText("Nombre examen: " + TecnicaYPreguntas.getNombreExamen());
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

                            JOptionPane.showMessageDialog(null, "¡Examen cambiado!\nRecuerde llenar los datos de acuerdo al nuevo formato de examen", "Terminación de prueba examinado", JOptionPane.INFORMATION_MESSAGE);

                        } catch (SQLException e) {
                            JOptionPane.showMessageDialog(null, "¡Error al actualizar los datos del examen!\nPor favor solicite ayuda al equipo de desarrollo " + e);
                        }

                    } else //validación inicio de Rutina administrativos
                    if (("Procedimiento".equals(tipodemotivo) && "Rutina (admitivos)".equals(tipoexam)) || ("Ascenso".equals(tipodemotivo) && "Rutina (admitivos)".equals(tipoexam))) {
                        try {
                            PreparedStatement sqlacade = Conexion.connection.prepareStatement("UPDATE datos_generales_poli "
                                    + "SET tipoexamen = '" + tipoexam + "', motivoexamen = '" + tipodemotivo + "'  WHERE t_identificacion = '" + DatosPrincipales.getTipoIdenExaminado() + "' AND no_id = " + DatosPrincipales.getNoIdenExaminado() + " AND  motivoexamen = '" + DatosPrincipales.getMotivoExamen() + "' AND tipoexamen = '" + DatosPrincipales.getTipoExamen() + "'");
                            sqlacade.executeUpdate();
                            DatosPrincipales.setTipoExamen(tipoexam);
                            DatosPrincipales.setMotivoExamen(tipodemotivo);

                            if ("Procedimiento".equals(tipodemotivo)) {
                                DatoGeneral.tituloexamenpre.setText("Examen Rutina Administrativos (procedimiento)");
                                nombreExamen();
                                nombreExamen.setText("Nombre examen: " + TecnicaYPreguntas.getNombreExamen());
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
                            } else if ("Ascenso".equals(tipodemotivo)) {
                                DatoGeneral.tituloexamenpre.setText("Examen Rutina Administrativos (ascenso)");
                                nombreExamen();
                                nombreExamen.setText("Nombre examen: " + TecnicaYPreguntas.getNombreExamen());
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
                        } catch (SQLException e) {
                            JOptionPane.showMessageDialog(null, "¡Error al actualizar los datos del examen!\nPor favor solicite ayuda al equipo de desarrollo " + e);
                        }
                    } else //validación inicio de Específico
                    if ("Caso específico".equals(tipodemotivo) && "Específico".equals(tipoexam)) {
                        try {
                            PreparedStatement sqlacade = Conexion.connection.prepareStatement("UPDATE datos_generales_poli "
                                    + "SET tipoexamen = 'Específico', motivoexamen = 'Caso específico'  WHERE t_identificacion = '" + DatosPrincipales.getTipoIdenExaminado() + "' AND no_id = " + DatosPrincipales.getNoIdenExaminado() + " AND  motivoexamen = '" + DatosPrincipales.getMotivoExamen() + "' AND tipoexamen = '" + DatosPrincipales.getTipoExamen() + "'");
                            sqlacade.executeUpdate();

                            DatosPrincipales.setTipoExamen(tipoexam);
                            DatosPrincipales.setMotivoExamen(tipodemotivo);

                            tituloexamenpre.setText("Examen Específico");
                            nombreExamen();
                            nombreExamen.setText("Nombre examen: " + TecnicaYPreguntas.getNombreExamen());

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

                            validarColor();
                            DatoGeneral.jLabel2.setForeground(Color.red);//Datos personales

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
                            DatoPersonal.personasolicitante.setVisible(true);
                            DatoPersonal.rtxtpersonasolicitante.setVisible(true);

                            JOptionPane.showMessageDialog(null, "¡Examen cambiado!\nRecuerde llenar los datos de acuerdo al nuevo formato de examen", "Terminación de prueba examinado", JOptionPane.INFORMATION_MESSAGE);

                        } catch (SQLException e) {
                            JOptionPane.showMessageDialog(null, "¡Error al actualizar los datos del examen!\nPor favor solicite ayuda al equipo de desarrollo " + e);
                        }
                    }
                }
            }
        }
    }

    public void guardarexamen() {
        if (DatosPersonales.getValidacionRegistro().equals("noregistrado")) {
            JOptionPane.showMessageDialog(null, "¡Debe guardar los datos básicos primero!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
        } else {
            String validador = TecnicaYVerificacion.cbxestaaplicandoinf.getSelectedItem().toString();
            if ("Conconexion".equals(classes.Conexion.importante)) {
                JDialog.setDefaultLookAndFeelDecorated(true);

                if (validador.equals("Seleccione")) {
                    int resp = JOptionPane.showConfirmDialog(null, "¿Desea detener el examen de polígrafo?", "Finalización de examen", JOptionPane.YES_NO_OPTION, JOptionPane.DEFAULT_OPTION, iconWarning);
                    if (resp == 0) {
                        Object[] selectionValues = {"Incompleto", "Novedad"};
                        String initialSelection = "Incompleto";
                        Object selection = JOptionPane.showInputDialog(null, "Seleccione una opcion para el examen",
                                "Option examen", JOptionPane.QUESTION_MESSAGE, null, selectionValues, initialSelection);
                        System.out.println(selection);
                        if (selection != null) {
                            try {
                                Connection con = Conexion.connection;
                                Statement s = con.createStatement();
                                ResultSet r = s.executeQuery("SELECT * FROM datos_generales_poli  WHERE fechacreacion = '" + fechanow + "' AND t_identificacion = '" + DatosPrincipales.getTipoIdenExaminado() + "' AND  no_id = " + DatosPrincipales.getNoIdenExaminado());
                                r.next();
                                int cune = r.getRow();
                                if (cune > 0) {

                                    try {
                                        PreparedStatement sqlacade = Conexion.connection.prepareStatement("UPDATE datos_generales_poli "
                                                + "SET estadoexamen = '" + selection + "'  WHERE t_identificacion = '" + DatosPrincipales.getTipoIdenExaminado() + "' AND no_id = " + DatosPrincipales.getNoIdenExaminado() + " AND motivoexamen = '" + DatosPrincipales.getMotivoExamen() + "' AND tipoexamen = '" + DatosPrincipales.getTipoExamen() + "'");
                                        sqlacade.executeUpdate();

                                    } catch (SQLException e) {
                                        JOptionPane.showMessageDialog(null, "¡Error en el ingreso de datos a la base!\nPor favor solicite ayuda al equipo de desarrollo" + e);
                                    }
                                } else {
                                    JOptionPane.showMessageDialog(null, "¡Error en el ingreso de datos a la base!\nPor favor solicite ayuda al equipo de desarrollo", "Edición de preguntas", JOptionPane.ERROR_MESSAGE);
                                }
                            } catch (SQLException ex) {
                                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
                            }

                            if (selection.equals("Novedad")) {

////                        DatoGeneral.paratodo.removeAll();
//                        MenuPrincipal.na.remove(this);
////                        limpiartodo();
//                        MenuPrincipal.na.add(nove);
//                        nove.show();
//                        CentrarVentana(nove);
//                        
                                NovedadExamen nv = new NovedadExamen();
//                        MenuPrincipal.na.remove(nv);
                                MenuPrincipal.na.add(nv);
                                NovedadExamen.cbxidennovedad.setSelectedItem(DatosPrincipales.getTipoIdenExaminado());
                                NovedadExamen.txtidennovedad.setText(DatosPrincipales.getNoIdenExaminado());
                                NovedadExamen.txtnomnovedad.setText(DatosPrincipales.getNombreExaminado());
                                NovedadExamen.cbxtipoexmnovedad.setSelectedItem(DatosPrincipales.getTipoExamen().toString());
                                NovedadExamen.cbxmotivoexam.setSelectedItem(DatosPrincipales.getMotivoExamen().toString());
                                NovedadExamen.txtcampactnove.setText(DatosPersonales.getAreaactual());
                                NovedadExamen.txtcargactnove.setText(DatosPersonales.getCargoactual());
                                NovedadExamen.txtcampaspnove.setText(DatosPersonales.getAreaaspira());
                                NovedadExamen.txtcargoaspnove.setText(DatosPersonales.getCargoaspira());
                                NovedadExamen.txtsolicinovedad.setText(DatosPrincipales.getNombreSolicitante());

                                this.setVisible(false);

                                nv.show();
                                CentrarVentana(nv);
                            } else if (selection.equals("Incompleto")) {
                                terminarExamen();
                            }
                        }
                    } else if (!validador.equals("Seleccione")) {
                    }
                } else if ("Sinconexion".equals(classes.Conexion.importante)) {
                    if (validador.equals("Seleccione")) {
                        int resp = JOptionPane.showConfirmDialog(null, "¿Desea detener el examen de polígrafo?\nTenga en cuenta que se guardarán los datos y deberá generar una novedad", "Finalización de examen", JOptionPane.YES_NO_OPTION, JOptionPane.DEFAULT_OPTION, iconWarning);
                        if (resp == 0) {
                            Object[] selectionValues = {"Incompleto", "Novedad"};
                            String initialSelection = "Incompleto";
                            Object selection = JOptionPane.showInputDialog(null, "Seleccione una opcion para el examen",
                                    "Zoo", JOptionPane.QUESTION_MESSAGE, null, selectionValues, initialSelection);
                            System.out.println(selection);

                            TecnicaYPreguntas.setEstadoExamen(selection.toString());
                            String dir = System.getProperty("user.dir");
                            File ruta = new File(dir + "\\registro");
                            Desconectado des = new Desconectado();
                            des.ingresarRegistro(ruta);
                        }
                    }
                }
            }
        }
    }

    public void cancelarexamen() {
        if ("nuevo".equals(DatosPrincipales.getOpcionExamen())) {
            int salir = JOptionPane.showConfirmDialog(null, "¿Desea cancelar y cerrar el examen?", "Cancelación de creación de examen", JOptionPane.YES_NO_OPTION, JOptionPane.DEFAULT_OPTION, iconShocked);
            if (salir == 0) {
                int cacn = JOptionPane.showConfirmDialog(null, "Tenga en cuenta que la información suministrada se perderá\n ¿Está seguro?", "Cancelación de creación de examen", JOptionPane.YES_NO_OPTION, JOptionPane.DEFAULT_OPTION, iconWarning);
                if (cacn == 0) {
                    if ("Conconexion".equals(classes.Conexion.importante)) {

                        if (!DatosPersonales.getValidacionRegistro().equals("noregistrado")) {
                            try {
                                PreparedStatement sqlpsiup = Conexion.connection.prepareStatement("DELETE FROM datos_generales_poli WHERE  no_id = " + DatosPrincipales.getNoIdenExaminado() + " AND t_identificacion = '" + DatosPrincipales.getTipoIdenExaminado() + "' AND tipoexamen = '" + DatosPrincipales.getTipoExamen() + "' AND motivoexamen = '" + DatosPrincipales.getMotivoExamen() + "'");
                                sqlpsiup.executeUpdate();
                            } catch (SQLException e) {
                            }
                        }
                    }

                    this.setVisible(false);
                    MenuPrincipal.jPanel10.setVisible(true);
                    MenuPrincipal.jPanel9.setVisible(true);

                    DatoGeneral.paratodo.removeAll();
                    MenuPrincipal.na.remove(this);
                    limpiarTodo();

                }
            }
        } else {
            int salir = JOptionPane.showConfirmDialog(null, "¿Desea cancelar y cerrar la busqueda de datos del examinado?", "Cancelación de busqueda de registro", JOptionPane.YES_NO_OPTION, JOptionPane.DEFAULT_OPTION, iconShocked);
            if (salir == 0) {
                this.setVisible(false);
                MenuPrincipal.jPanel10.setVisible(true);
                MenuPrincipal.jPanel9.setVisible(true);

                DatoGeneral.paratodo.removeAll();
                MenuPrincipal.na.remove(this);
                limpiarTodo();

            }
        }
    }

    public void flechas() {

        System.out.println("el tipo de examen essss " + DatosPrincipales.getTipoExamen());
        System.out.println("el tipo de opcion examen essss " + DatosPrincipales.getOpcionExamen());

        if (DatosPrincipales.getOpcionExamen().equals("consulta")) {

        } else if (DatosPrincipales.getOpcionExamen().equals("nuevo")) {
            //pre empleooooooooooooooooooooo
            if (DatosPrincipales.getTipoExamen().equals("Pre-empleo")) {
                if (daper.isEnabled()) {
                    Date fechavacia = DatoPersonal.fechanaci.getDate();
                    int age = Integer.parseInt(DatosPersonales.getEdad());
                    if (DatosPersonales.getEstrato().equals("-")) {
                        JOptionPane.showMessageDialog(null, "¡Seleccione el estrato del examinado!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else if (age < 17 || age > 70) {
                        JOptionPane.showMessageDialog(null, "¡La edad no se admite!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else if (DatoPersonal.cbxtipoiden.getSelectedItem().equals("Seleccione") || fechavacia == null || (DatoPersonal.txtnombre.getText().equals("") || "".equals(DatoPersonal.txtnombre.getText())) || (DatoPersonal.txtnoiden.getText().equals("") || "".equals(DatoPersonal.txtnoiden.getText())) || (DatoPersonal.txtexpedidos.getText().equals("") || "".equals(DatoPersonal.txtexpedidos.getText())) || (DatoPersonal.txtlugarnaci.getText().equals("") || "".equals(DatoPersonal.txtlugarnaci.getText())) || (DatoPersonal.txtdireccion.getText().equals("") || "".equals(DatoPersonal.txtdireccion.getText())) || (DatoPersonal.txtcargoaspira.getText().equals("") || "".equals(DatoPersonal.txtcargoaspira.getText())) || (DatoPersonal.txtareaaspira.getText().equals("") || "".equals(DatoPersonal.txtareaaspira.getText())) || (DatoPersonal.txtpersonasolicitante.getText().equals("") || "".equals(DatoPersonal.txtpersonasolicitante.getText())) || (DatoPersonal.txtcargosolicitante.getText().equals("") || "".equals(DatoPersonal.txtcargosolicitante.getText()))) {
                        JOptionPane.showMessageDialog(null, "¡Debe completar todos los parámetros para registrar los datos!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else if (DatosPersonales.getGenero().equals("-") || DatosPersonales.getGenero().equals("") || DatosPersonales.getGenero() == null) {
                        JOptionPane.showMessageDialog(null, "¡El género no ha sido seleccionado!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else {

                        nombreExamen();
                        nombreExamen.setText(TecnicaYPreguntas.getNombreExamen());
                        DatosPersonales.setColorCategoria("con");
                        daper.setVisible(false);
                        daper.setEnabled(false);
                        estsalud.setVisible(true);
                        estsalud.setEnabled(true);
                        DatoGeneral.jLabel2.setForeground(Color.decode("#00a80d"));
                        validarColor();
                        jLabel3.setForeground(Color.red);

                        DatoGeneral.fechaizquierda.setVisible(true);
                        if ("noesvisible".equals(EstadoSalud.getVisibilidadflecha())) {
                            DatoGeneral.fechaderecha.setVisible(false);
                        } else if ("esvisible".equals(EstadoSalud.getVisibilidadflecha())) {
                            DatoGeneral.fechaderecha.setVisible(true);
                        }

                        if ("Sinconexion".equals(classes.Conexion.importante)) {
                            btnsave.setVisible(true);
                            DatosPersonales.setValidacionRegistro("registrado");
                        } else if ("Conconexion".equals(classes.Conexion.importante)) {
                            if ("nuevo".equals(DatosPrincipales.getOpcionExamen())) {
                                dp.update_datosper();
                                DatosPersonales.setValidacionRegistro("registrado");

                            }
                        }
                    }
                } else if (estsalud.isEnabled()) {

                    if (EstadoSalud.getEstado_salud().equals("-") || EstadoSalud.getEstado_salud().equals("")) {
                        JOptionPane.showMessageDialog(null, "¡Debe elegir el estado de salud para continuar!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else if (EstadoSalud.getProb_salud().equals("-") || EstadoSalud.getProb_salud().equals("")) {
                        JOptionPane.showMessageDialog(null, "¡Debe completar todos los parámetros para continuar con el examen!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else {
                        EstadoSalud.setColorCategoria("con");
                        estsalud.setVisible(false);
                        estsalud.setEnabled(false);
                        inforfami.setVisible(true);
                        inforfami.setEnabled(true);
                        DatoGeneral.fechaizquierda.setVisible(true);
                        DatoGeneral.fechaderecha.setVisible(true);
                        validarColor();
                        jLabel4.setForeground(Color.red);

                        if ("Sinconexion".equals(classes.Conexion.importante)) {

                        } else if ("Conconexion".equals(classes.Conexion.importante)) {
                            if ("nuevo".equals(DatosPrincipales.getOpcionExamen())) {
                                es.update_estadosalud();
                                es.validarestadosalud();

                            }
                        }
                    }

                } else if (inforfami.isEnabled()) {
                    if (InfoFamiliar.getEstado_civil().equals("") || InfoFamiliar.getEstado_civil().equals("-")) {
                        JOptionPane.showMessageDialog(null, "¡Debe elegir el estado civil para continuar!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else if (InfoFamiliar.getFami_ries_soci().equals("") || InfoFamiliar.getFami_ries_soci().equals("-")) {
                        JOptionPane.showMessageDialog(null, "¡Debe completar todos los parámetros para continuar con el examen!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else {
                        InfoFamiliar.setColorCategoria("con");
                        inforfami.setVisible(false);
                        inforfami.setEnabled(false);
                        infoaca.setVisible(true);
                        infoaca.setEnabled(true);
                        DatoGeneral.fechaizquierda.setVisible(true);
                        DatoGeneral.fechaderecha.setVisible(true);
                        validarColor();
                        jLabel10.setForeground(Color.red);

                        if ("Sinconexion".equals(classes.Conexion.importante)) {

                        } else if ("Conconexion".equals(classes.Conexion.importante)) {
                            if ("nuevo".equals(DatosPrincipales.getOpcionExamen())) {
                                infa.update_infofami();
                                infa.validarfamiliaridad();

                                Admisiones adms = new Admisiones();
                                adms.admsInfoFami();
                            }
                        }
                    }
                } else if (infoaca.isEnabled()) {
                    if (InfoAcademica.getEstaestudiando().equals("-")) {
                        JOptionPane.showMessageDialog(null, "¡Debe completar todos los parámetros para continuar con el examen!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else {
                        InfoAcademica.setColorCategoria("con");
                        infoaca.setVisible(false);
                        infoaca.setEnabled(false);
                        infofinan.setVisible(true);
                        infofinan.setEnabled(true);
                        DatoGeneral.fechaizquierda.setVisible(true);
                        DatoGeneral.fechaderecha.setVisible(true);
                        validarColor();
                        jLabel5.setForeground(Color.red);

                        if ("Sinconexion".equals(classes.Conexion.importante)) {

                        } else if ("Conconexion".equals(classes.Conexion.importante)) {
                            if ("nuevo".equals(DatosPrincipales.getOpcionExamen())) {
                                ia.validarprimaria();
                                ia.validarbachiller();
                                ia.validartecnico();
                                ia.validartecnologo();
                                ia.validarprofesional();
                                ia.validarpostgrado();
                                ia.validarmaestria();
                                ia.validardoctorado();
                                ia.validarsest();

                            }
                        }
                    }

                } else if (infofinan.isEnabled()) {
                    if (InfoFinanciera.getSostiene_eco().equals("-") || InfoFinanciera.getSostiene_eco().equals("")) {
                        JOptionPane.showMessageDialog(null, "¡Debe elegir completar el sostenimiento económico para continuar!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else if (InfoFinanciera.getSitua_economica().equals("-")) {
                        JOptionPane.showMessageDialog(null, "¡Debe elegir la situación económica para continuar!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else if (InfoFinanciera.getGastos_mensuales().equals("")) {
                        JOptionPane.showMessageDialog(null, "¡Debe completar los gastos mensuales para continuar!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else if (InfoFinanciera.getAct_lab_inde().equals("-")
                            || InfoFinanciera.getLiquida_cesan().equals("-")
                            || InfoFinanciera.getTiene_ahorros().equals("-")
                            || InfoFinanciera.getApoyo_padres().equals("-")
                            || InfoFinanciera.getIng_pareja().equals("-")
                            || InfoFinanciera.getHadembargo().equals("-")
                            || InfoFinanciera.getReportadocr().equals("-")
                            || InfoFinanciera.getTieneobligafinan().equals("-")
                            || InfoFinanciera.getTienedeuda().equals("-")
                            || InfoFinanciera.getTienepropi().equals("-")) {
                        JOptionPane.showMessageDialog(null, "¡Debe completar todos los parámetros para continuar con el examen!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else {
                        InfoFinanciera.setColorCategoria("con");
                        infofinan.setVisible(false);
                        infofinan.setEnabled(false);
                        casino.setVisible(true);
                        casino.setEnabled(true);
                        DatoGeneral.fechaizquierda.setVisible(true);
                        DatoGeneral.fechaderecha.setVisible(true);
                        validarColor();
                        jLabel13.setForeground(Color.red);

                        if ("Sinconexion".equals(classes.Conexion.importante)) {

                        } else if ("Conconexion".equals(classes.Conexion.importante)) {
                            if ("nuevo".equals(DatosPrincipales.getOpcionExamen())) {
                                infi.update_infofinan();
                                infi.validacionesfinancieras();

                            }
                        }
                    }
                } else if (casino.isEnabled()) {
                    if (ActiTiempoLibre.getActividadTL1().equals("")
                            || ActiTiempoLibre.getActividadTL2().equals("-")
                            || ActiTiempoLibre.getActividadTL4().equals("-")
                            || ActiTiempoLibre.getActividadTL6().equals("-")
                            || ActiTiempoLibre.getActividadTL8().equals("-")) {
                        JOptionPane.showMessageDialog(null, "¡Debe completar todos los parámetros para continuar con el examen!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else {
                        ActiTiempoLibre.setColorCategoria("con");
                        casino.setVisible(false);
                        casino.setEnabled(false);
                        consbebidas.setVisible(true);
                        consbebidas.setEnabled(true);
                        DatoGeneral.fechaizquierda.setVisible(true);
                        DatoGeneral.fechaderecha.setVisible(true);
                        validarColor();
                        jLabel6.setForeground(Color.red);

                        if ("Sinconexion".equals(classes.Conexion.importante)) {

                        } else if ("Conconexion".equals(classes.Conexion.importante)) {
                            if ("nuevo".equals(DatosPrincipales.getOpcionExamen())) {
                                atl.update_consujuegos();

                            }
                        }
                    }
                } else if (consbebidas.isEnabled()) {
                    if (ConsumoBebidas.getCon_bebidas().equals("-")
                            || ConsumoBebidas.getPg1().equals("-")
                            || ConsumoBebidas.getPg2().equals("-")
                            || ConsumoBebidas.getPg3().equals("-")
                            || ConsumoBebidas.getPg4().equals("-")
                            || ConsumoBebidas.getPg5().equals("-")
                            || ConsumoBebidas.getPg6().equals("-")
                            || ConsumoBebidas.getPg7().equals("-")
                            || ConsumoBebidas.getPg8().equals("-")
                            || ConsumoBebidas.getPg9().equals("-")) {
                        JOptionPane.showMessageDialog(null, "¡Debe completar todos los parámetros para continuar con el examen!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else {
                        ConsumoBebidas.setColorCategoria("con");
                        consustan.ValidacionTipoExamen();
                        consbebidas.setVisible(false);
                        consbebidas.setEnabled(false);
                        consustan.setVisible(true);
                        consustan.setEnabled(true);
                        DatoGeneral.fechaizquierda.setVisible(true);
                        DatoGeneral.fechaderecha.setVisible(true);
                        validarColor();
                        jLabel7.setForeground(Color.red);

                        if ("Sinconexion".equals(classes.Conexion.importante)) {

                        } else if ("Conconexion".equals(classes.Conexion.importante)) {
                            if ("nuevo".equals(DatosPrincipales.getOpcionExamen())) {
                                cb.update_consubebi();

                            }
                        }
                    }
                } else if (consustan.isEnabled()) {
                    if (ConsumoSustancias.getDrogaspregun1().equals("-")
                            || ConsumoSustancias.getDrogaspregun2().equals("-")
                            || ConsumoSustancias.getDrogaspregun3().equals("-")
                            || ConsumoSustancias.getDrogaspregun4().equals("-")
                            || ConsumoSustancias.getDrogaspregun5().equals("-")
                            || ConsumoSustancias.getDrogaspregun6().equals("-")
                            || ConsumoSustancias.getDrogaspregun7().equals("-")
                            || ConsumoSustancias.getHaconsumido().equals("-")
                            || ConsumoSustancias.getHaparticipado().equals("-")) {
                        JOptionPane.showMessageDialog(null, "¡Debe completar todos los parámetros para continuar con el examen!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else {
                        ConsumoSustancias.setColorCategoria("con");
                        consustan.setVisible(false);
                        consustan.setEnabled(false);
                        antece.setVisible(true);
                        antece.setEnabled(true);
                        DatoGeneral.fechaizquierda.setVisible(true);
                        DatoGeneral.fechaderecha.setVisible(true);
                        validarColor();
                        jLabel8.setForeground(Color.red);

                        if ("Sinconexion".equals(classes.Conexion.importante)) {

                        } else if ("Conconexion".equals(classes.Conexion.importante)) {
                            if ("nuevo".equals(DatosPrincipales.getOpcionExamen())) {
                                cs.update_consusus();
                                cs.validaciondrogas();

                            }
                        }
                    }
                } else if (antece.isEnabled()) {
                    if (AntecedentesJudiciales.getPg1().equals("-")
                            || AntecedentesJudiciales.getPg2().equals("-")
                            || AntecedentesJudiciales.getPg3().equals("-")
                            || AntecedentesJudiciales.getPg4().equals("-")
                            || AntecedentesJudiciales.getPg5().equals("")
                            || AntecedentesJudiciales.getPg6().equals("-")
                            || AntecedentesJudiciales.getPg7().equals("-")
                            || AntecedentesJudiciales.getPg8().equals("-")
                            || AntecedentesJudiciales.getPg9().equals("-")
                            || AntecedentesJudiciales.getPg10().equals("-")
                            || AntecedentesJudiciales.getPg11().equals("-")
                            || AntecedentesJudiciales.getPg12().equals("-")) {
                        JOptionPane.showMessageDialog(null, "¡Debe completar todos los parámetros para continuar con el examen!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else {
                        AntecedentesJudiciales.setColorCategoria("con");
                        antece.setVisible(false);
                        antece.setEnabled(false);
                        vinculos.setVisible(true);
                        vinculos.setEnabled(true);
                        DatoGeneral.fechaizquierda.setVisible(true);
                        DatoGeneral.fechaderecha.setVisible(true);
                        validarColor();
                        jLabel9.setForeground(Color.red);

                        if ("Sinconexion".equals(classes.Conexion.importante)) {

                        } else if ("Conconexion".equals(classes.Conexion.importante)) {
                            if ("nuevo".equals(DatosPrincipales.getOpcionExamen())) {
                                aj.update_antece();

                            }
                        }
                    }
                } else if (vinculos.isEnabled()) {
                    if (VinculosPersonas.getVinculosmargenley().equals("-")
                            || VinculosPersonas.getActdelictpre1().equals("-")
                            //                            || VinculosPersonas.getActdelictpre2().equals("-")
                            || VinculosPersonas.getActdelictpre3().equals("-")
                            || VinculosPersonas.getActdelictpre4().equals("-")
                            || VinculosPersonas.getActdelictpre5().equals("-")
                            || VinculosPersonas.getActdelictpre6().equals("-")
                            || VinculosPersonas.getActdelictpre7().equals("-")) {
                        JOptionPane.showMessageDialog(null, "¡Debe completar todos los parámetros para continuar con el examen!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else {
                        VinculosPersonas.setColorCategoria("con");
                        vinculos.setVisible(false);
                        vinculos.setEnabled(false);
                        falsifi.ValidacionTipoExamen();
                        falsifi.setVisible(true);
                        falsifi.setEnabled(true);
                        DatoGeneral.fechaizquierda.setVisible(true);
                        DatoGeneral.fechaderecha.setVisible(true);
                        validarColor();
                        jLabel11.setForeground(Color.red);

                        if ("Sinconexion".equals(classes.Conexion.importante)) {

                        } else if ("Conconexion".equals(classes.Conexion.importante)) {
                            if ("nuevo".equals(DatosPrincipales.getOpcionExamen())) {
                                vp.update_vinculos();
                                vp.validarmalosactos();

                            }
                        }
                    }
                } else if (falsifi.isEnabled()) {
                    if (Falsificacion.getHvfalsifi().equals("-")
                            || Falsificacion.getDatosfalsospre1().equals("-")
                            || Falsificacion.getDatosfalsospre2().equals("-")) {
                        JOptionPane.showMessageDialog(null, "¡Debe completar todos los parámetros para continuar con el examen!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else {
                        Falsificacion.setColorCategoria("con");
                        falsifi.setVisible(false);
                        falsifi.setEnabled(false);
                        histlabo.ValidacionTipoExamen();
                        histlabo.setVisible(true);
                        histlabo.setEnabled(true);
                        DatoGeneral.fechaizquierda.setVisible(true);
                        DatoGeneral.fechaderecha.setVisible(true);
                        validarColor();
                        jLabel12.setForeground(Color.red);

                        if ("Sinconexion".equals(classes.Conexion.importante)) {

                        } else if ("Conconexion".equals(classes.Conexion.importante)) {
                            if ("nuevo".equals(DatosPrincipales.getOpcionExamen())) {
                                fa.update_falsifi();
                                fa.validarfalsificacion();

                            }
                        }
                    }
                } else if (histlabo.isEnabled()) {
                    if (HistoriaLaboral.getEmpleobefore().equals("-")
                            || HistoriaLaboral.getDidmalosactos().equals("-")
                            || HistoriaLaboral.getHistorlabopre1().equals("-")
                            || HistoriaLaboral.getHistorlabopre2().equals("-")
                            || HistoriaLaboral.getHistorlabopre3().equals("-")
                            || HistoriaLaboral.getHistorlabopre4().equals("-")
                            || HistoriaLaboral.getHistorlabopre5().equals("-")
                            || HistoriaLaboral.getHistorlabopre6().equals("-")
                            || HistoriaLaboral.getHistorlabopre7().equals("-")
                            || HistoriaLaboral.getHistorlabopre8().equals("-")) {
                        JOptionPane.showMessageDialog(null, "¡Debe completar todos los parámetros para continuar con el examen!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else {
                        HistoriaLaboral.setColorCategoria("con");
                        histlabo.setVisible(false);
                        histlabo.setEnabled(false);
                        planinfil.setVisible(true);
                        planinfil.setEnabled(true);
                        fechaderecha.setVisible(true);
                        DatoGeneral.fechaizquierda.setVisible(true);
                        validarColor();
                        jLabel14.setForeground(Color.red);

                        if ("Sinconexion".equals(classes.Conexion.importante)) {

                        } else if ("Conconexion".equals(classes.Conexion.importante)) {
                            if ("nuevo".equals(DatosPrincipales.getOpcionExamen())) {
                                hl.update_histlabo();
                                hl.validarhistorial();
                                hl.validarhistorialtrabajo();

                                histlabo.validacionfechas();
                            }
                        }
                    }
                } else if (planinfil.isEnabled()) {
                    if (PlanesInfiltracion.getComoseentero().equals("-")
                            || PlanesInfiltracion.getPlaninfilpre1().equals("-")
                            || PlanesInfiltracion.getPlaninfilpre2().equals("-")
                            || PlanesInfiltracion.getPlaninfilpre3().equals("-")
                            || PlanesInfiltracion.getPlaninfilpre4().equals("-")) {
                        JOptionPane.showMessageDialog(null, "¡Debe completar todos los parámetros para continuar con el examen!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else {
                        PlanesInfiltracion.setColorCategoria("con");
                        tecp.setVisible(true);
                        tecp.setEnabled(true);
                        planinfil.setVisible(false);
                        planinfil.setEnabled(false);
                        fechaderecha.setVisible(false);
                        DatoGeneral.fechaizquierda.setVisible(true);
                        validarColor();
                        jLabel15.setForeground(Color.red);

                        if ("Sinconexion".equals(classes.Conexion.importante)) {

                        } else if ("Conconexion".equals(classes.Conexion.importante)) {
                            if ("nuevo".equals(DatosPrincipales.getOpcionExamen())) {
                                pi.update_planesinfil();

                            }
                        }
                    }
                }
            } else //Rutina operacioneeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeees
            if (DatosPrincipales.getTipoExamen().equals("Rutina (operaciones)")) {
                if (daper.isEnabled()) {
                    Date fechavacia = DatoPersonal.fechanaci.getDate();
                    int age = Integer.parseInt(DatosPersonales.getEdad());
                    if (DatosPersonales.getEstrato().equals("-")) {
                        JOptionPane.showMessageDialog(null, "¡Seleccione el estrato del examinado!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else if (age < 17 || age > 70) {
                        JOptionPane.showMessageDialog(null, "¡La edad no se admite!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else if (DatosPersonales.getGenero().equals("-")) {
                        JOptionPane.showMessageDialog(null, "¡El género no ha sido seleccionado!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else if (DatosPrincipales.getMotivoExamen().equals("Procedimiento") && (DatoPersonal.cbxtipoiden.getSelectedItem().equals("Seleccione") || fechavacia == null || DatoPersonal.txtnombre.getText().equals("") || DatoPersonal.txtnoiden.getText().equals("") || DatoPersonal.txtexpedidos.getText().equals("") || DatoPersonal.txtlugarnaci.getText().equals("") || DatoPersonal.txtdireccion.getText().equals("") || DatoPersonal.txtcargoactual.getText().equals("") || DatoPersonal.txtareaactual.getText().equals("") || DatoPersonal.txtpersonasolicitante.getText().equals("") || DatoPersonal.txtcargosolicitante.getText().equals(""))) {

                        JOptionPane.showMessageDialog(null, "¡Debe completar todos los parámetros para registrar los datos!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);

                    } else if (DatosPrincipales.getMotivoExamen().equals("Ascenso") && (DatoPersonal.cbxtipoiden.getSelectedItem().equals("Seleccione") || fechavacia == null || (DatoPersonal.txtnombre.getText().equals("") || "".equals(DatoPersonal.txtnombre.getText())) || (DatoPersonal.txtnoiden.getText().equals("") || "".equals(DatoPersonal.txtnoiden.getText())) || (DatoPersonal.txtexpedidos.getText().equals("") || "".equals(DatoPersonal.txtexpedidos.getText())) || (DatoPersonal.txtlugarnaci.getText().equals("") || "".equals(DatoPersonal.txtlugarnaci.getText())) || (DatoPersonal.txtdireccion.getText().equals("") || "".equals(DatoPersonal.txtdireccion.getText())) || (DatoPersonal.txtcargoaspira.getText().equals("") || "".equals(DatoPersonal.txtcargoaspira.getText())) || (DatoPersonal.txtareaaspira.getText().equals("") || "".equals(DatoPersonal.txtareaaspira.getText())) || (DatoPersonal.txtcargoactual.getText().equals("") || "".equals(DatoPersonal.txtcargoactual.getText())) || (DatoPersonal.txtareaactual.getText().equals("") || "".equals(DatoPersonal.txtareaactual.getText())) || (DatoPersonal.txtpersonasolicitante.getText().equals("") || "".equals(DatoPersonal.txtpersonasolicitante.getText())) || (DatoPersonal.txtcargosolicitante.getText().equals("") || "".equals(DatoPersonal.txtcargosolicitante.getText())))) {

                        JOptionPane.showMessageDialog(null, "¡Debe completar todos los parámetros para registrar los datos!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);

                    } else {

                        nombreExamen();
                        nombreExamen.setText(TecnicaYPreguntas.getNombreExamen());
                        daper.setVisible(false);
                        daper.setEnabled(false);
                        estsalud.setVisible(true);
                        estsalud.setEnabled(true);

                        DatoGeneral.fechaizquierda.setVisible(true);
                        if ("noesvisible".equals(EstadoSalud.getVisibilidadflecha())) {
                            DatoGeneral.fechaderecha.setVisible(false);
                        } else if ("esvisible".equals(EstadoSalud.getVisibilidadflecha())) {
                            DatoGeneral.fechaderecha.setVisible(true);
                        }

                        if ("Sinconexion".equals(classes.Conexion.importante)) {
                            btnsave.setVisible(true);
                        } else if ("Conconexion".equals(classes.Conexion.importante)) {
                            if ("nuevo".equals(DatosPrincipales.getOpcionExamen())) {
                                dp.update_datosper();
                                DatosPersonales.setColorCategoria("con");
                                DatosPersonales.setValidacionRegistro("registrado");
                                validarColor();
                                jLabel3.setForeground(Color.red);
                            }
                        }
                    }
                } else if (estsalud.isEnabled()) {

                    if (EstadoSalud.getEstado_salud().equals("-") || EstadoSalud.getEstado_salud().equals("")) {
                        JOptionPane.showMessageDialog(null, "¡Debe elegir el estado de salud para continuar!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else if (EstadoSalud.getProb_salud().equals("-") || EstadoSalud.getProb_salud().equals("")) {
                        JOptionPane.showMessageDialog(null, "¡Debe completar todos los parámetros para continuar con el examen!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else {
                        estsalud.setVisible(false);
                        estsalud.setEnabled(false);
                        inforfami.setVisible(true);
                        inforfami.setEnabled(true);
                        DatoGeneral.fechaizquierda.setVisible(true);
                        DatoGeneral.fechaderecha.setVisible(true);

                        if ("Sinconexion".equals(classes.Conexion.importante)) {

                        } else if ("Conconexion".equals(classes.Conexion.importante)) {
                            if ("nuevo".equals(DatosPrincipales.getOpcionExamen())) {
                                es.update_estadosalud();
                                es.validarestadosalud();
                                EstadoSalud.setColorCategoria("con");
                                validarColor();
                                jLabel4.setForeground(Color.red);
                            }
                        }
                    }

                } else if (inforfami.isEnabled()) {
                    if (InfoFamiliar.getEstado_civil().equals("") || InfoFamiliar.getEstado_civil().equals("-")) {
                        JOptionPane.showMessageDialog(null, "¡Debe elegir el estado civil para continuar!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else if (InfoFamiliar.getFami_ries_soci().equals("") || InfoFamiliar.getFami_ries_soci().equals("-")) {
                        JOptionPane.showMessageDialog(null, "¡Debe completar todos los parámetros para continuar con el examen!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else {
                        inforfami.setVisible(false);
                        inforfami.setEnabled(false);
                        infoaca.setVisible(true);
                        infoaca.setEnabled(true);
                        DatoGeneral.fechaizquierda.setVisible(true);
                        DatoGeneral.fechaderecha.setVisible(true);

                        if ("Sinconexion".equals(classes.Conexion.importante)) {

                        } else if ("Conconexion".equals(classes.Conexion.importante)) {
                            if ("nuevo".equals(DatosPrincipales.getOpcionExamen())) {
                                infa.update_infofami();
                                infa.validarfamiliaridad();
                                InfoFamiliar.setColorCategoria("con");
                                Admisiones adms = new Admisiones();
                                validarColor();
                                jLabel10.setForeground(Color.red);
                                adms.admsInfoFami();
                            }
                        }
                    }
                } else if (infoaca.isEnabled()) {
                    if (InfoAcademica.getEstaestudiando().equals("-")) {
                        JOptionPane.showMessageDialog(null, "¡Debe completar todos los parámetros para continuar con el examen!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else {
                        infoaca.setVisible(false);
                        infoaca.setEnabled(false);
                        infofinan.setVisible(true);
                        infofinan.setEnabled(true);
                        DatoGeneral.fechaizquierda.setVisible(true);
                        DatoGeneral.fechaderecha.setVisible(true);

                        if ("Sinconexion".equals(classes.Conexion.importante)) {

                        } else if ("Conconexion".equals(classes.Conexion.importante)) {
                            if ("nuevo".equals(DatosPrincipales.getOpcionExamen())) {
                                ia.validarprimaria();
                                ia.validarbachiller();
                                ia.validartecnico();
                                ia.validartecnologo();
                                ia.validarprofesional();
                                ia.validarpostgrado();
                                ia.validarmaestria();
                                ia.validardoctorado();
                                ia.validarsest();
                                InfoAcademica.setColorCategoria("con");
                                validarColor();
                                jLabel5.setForeground(Color.red);
                            }
                        }
                    }

                } else if (infofinan.isEnabled()) {
                    if (InfoFinanciera.getSitua_economica().equals("-")) {
                        JOptionPane.showMessageDialog(null, "¡Debe elegir la situación económica para continuar!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else if (InfoFinanciera.getGastos_mensuales().equals("")) {
                        JOptionPane.showMessageDialog(null, "¡Debe completar los gastos mensuales para continuar!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else if (InfoFinanciera.getAct_lab_inde().equals("-")
                            || InfoFinanciera.getLiquida_cesan().equals("-")
                            || InfoFinanciera.getTiene_ahorros().equals("-")
                            || InfoFinanciera.getApoyo_padres().equals("-")
                            || InfoFinanciera.getIng_pareja().equals("-")
                            || InfoFinanciera.getHadembargo().equals("-")
                            || InfoFinanciera.getReportadocr().equals("-")
                            || InfoFinanciera.getTieneobligafinan().equals("-")
                            || InfoFinanciera.getTienedeuda().equals("-")
                            || InfoFinanciera.getTienepropi().equals("-")) {
                        JOptionPane.showMessageDialog(null, "¡Debe completar todos los parámetros para continuar con el examen!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else {
                        infofinan.setVisible(false);
                        infofinan.setEnabled(false);
                        casino.setVisible(true);
                        casino.setEnabled(true);
                        DatoGeneral.fechaizquierda.setVisible(true);
                        DatoGeneral.fechaderecha.setVisible(true);

                        if ("Sinconexion".equals(classes.Conexion.importante)) {

                        } else if ("Conconexion".equals(classes.Conexion.importante)) {
                            if ("nuevo".equals(DatosPrincipales.getOpcionExamen())) {
                                infi.update_infofinan();
                                infi.validacionesfinancieras();
                                InfoFinanciera.setColorCategoria("con");
                                validarColor();
                                jLabel13.setForeground(Color.red);
                            }
                        }
                    }
                } else if (casino.isEnabled()) {
                    if (ActiTiempoLibre.getActividadTL1().equals("")
                            || ActiTiempoLibre.getActividadTL2().equals("-")
                            || ActiTiempoLibre.getActividadTL4().equals("-")
                            || ActiTiempoLibre.getActividadTL6().equals("-")
                            || ActiTiempoLibre.getActividadTL8().equals("-")) {
                        JOptionPane.showMessageDialog(null, "¡Debe completar todos los parámetros para continuar con el examen!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else {
                        casino.setVisible(false);
                        casino.setEnabled(false);
                        consbebidas.setVisible(true);
                        consbebidas.setEnabled(true);
                        DatoGeneral.fechaizquierda.setVisible(true);
                        DatoGeneral.fechaderecha.setVisible(true);

                        if ("Sinconexion".equals(classes.Conexion.importante)) {

                        } else if ("Conconexion".equals(classes.Conexion.importante)) {
                            if ("nuevo".equals(DatosPrincipales.getOpcionExamen())) {
                                atl.update_consujuegos();

                                ActiTiempoLibre.setColorCategoria("con");
                                validarColor();
                                jLabel6.setForeground(Color.red);
                            }
                        }
                    }
                } else if (consbebidas.isEnabled()) {
                    if (ConsumoBebidas.getCon_bebidas().equals("-")
                            || ConsumoBebidas.getPg1().equals("-")
                            || ConsumoBebidas.getPg2().equals("-")
                            || ConsumoBebidas.getPg3().equals("-")
                            || ConsumoBebidas.getPg4().equals("-")
                            || ConsumoBebidas.getPg5().equals("-")
                            || ConsumoBebidas.getPg6().equals("-")
                            || ConsumoBebidas.getPg7().equals("-")
                            || ConsumoBebidas.getPg8().equals("-")
                            || ConsumoBebidas.getPg9().equals("-")) {
                        JOptionPane.showMessageDialog(null, "¡Debe completar todos los parámetros para continuar con el examen!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else {
                        consustan.ValidacionTipoExamen();
                        consbebidas.setVisible(false);
                        consbebidas.setEnabled(false);
                        consustan.setVisible(true);
                        consustan.setEnabled(true);
                        DatoGeneral.fechaizquierda.setVisible(true);
                        DatoGeneral.fechaderecha.setVisible(true);

                        if ("Sinconexion".equals(classes.Conexion.importante)) {

                        } else if ("Conconexion".equals(classes.Conexion.importante)) {
                            if ("nuevo".equals(DatosPrincipales.getOpcionExamen())) {
                                cb.update_consubebi();
                                ConsumoBebidas.setColorCategoria("con");
                                validarColor();
                                jLabel7.setForeground(Color.red);
                            }
                        }
                    }
                } else if (consustan.isEnabled()) {
                    if (ConsumoSustancias.getDrogaspregun1().equals("-")
                            || ConsumoSustancias.getDrogaspregun2().equals("-")
                            || ConsumoSustancias.getDrogaspregun3().equals("-")
                            || ConsumoSustancias.getDrogaspregun4().equals("-")
                            || ConsumoSustancias.getDrogaspregun5().equals("-")
                            || ConsumoSustancias.getDrogaspregun6().equals("-")
                            || ConsumoSustancias.getDrogaspregun7().equals("-")
                            || ConsumoSustancias.getHaconsumido().equals("-")
                            || ConsumoSustancias.getHaparticipado().equals("-")) {
                        JOptionPane.showMessageDialog(null, "¡Debe completar todos los parámetros para continuar con el examen!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else {
                        consustan.setVisible(false);
                        consustan.setEnabled(false);
                        antece.setVisible(true);
                        antece.setEnabled(true);
                        DatoGeneral.fechaizquierda.setVisible(true);
                        DatoGeneral.fechaderecha.setVisible(true);

                        if ("Sinconexion".equals(classes.Conexion.importante)) {

                        } else if ("Conconexion".equals(classes.Conexion.importante)) {
                            if ("nuevo".equals(DatosPrincipales.getOpcionExamen())) {
                                cs.update_consusus();
                                cs.validaciondrogas();
                                ConsumoSustancias.setColorCategoria("con");
                                validarColor();
                                jLabel8.setForeground(Color.red);
                            }
                        }
                    }
                } else if (antece.isEnabled()) {
                    if (AntecedentesJudiciales.getPg1().equals("-")
                            || AntecedentesJudiciales.getPg2().equals("-")
                            || AntecedentesJudiciales.getPg3().equals("-")
                            || AntecedentesJudiciales.getPg4().equals("-")
                            || AntecedentesJudiciales.getPg5().equals("")
                            || AntecedentesJudiciales.getPg6().equals("-")
                            || AntecedentesJudiciales.getPg7().equals("-")
                            || AntecedentesJudiciales.getPg8().equals("-")
                            || AntecedentesJudiciales.getPg9().equals("-")
                            || AntecedentesJudiciales.getPg10().equals("-")
                            || AntecedentesJudiciales.getPg11().equals("-")
                            || AntecedentesJudiciales.getPg12().equals("-")) {
                        JOptionPane.showMessageDialog(null, "¡Debe completar todos los parámetros para continuar con el examen!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else {

                        antece.setVisible(false);
                        antece.setEnabled(false);
                        vinculos.setVisible(true);
                        vinculos.setEnabled(true);
                        DatoGeneral.fechaizquierda.setVisible(true);
                        DatoGeneral.fechaderecha.setVisible(true);

                        if ("Sinconexion".equals(classes.Conexion.importante)) {

                        } else if ("Conconexion".equals(classes.Conexion.importante)) {
                            if ("nuevo".equals(DatosPrincipales.getOpcionExamen())) {
                                aj.update_antece();
                                AntecedentesJudiciales.setColorCategoria("con");
                                validarColor();
                                jLabel9.setForeground(Color.red);
                            }
                        }
                    }
                } else if (vinculos.isEnabled()) {
                    if (VinculosPersonas.getVinculosmargenley().equals("-")
                            || VinculosPersonas.getActdelictpre1().equals("-")
                            //                            || VinculosPersonas.getActdelictpre2().equals("-")
                            || VinculosPersonas.getActdelictpre3().equals("-")
                            || VinculosPersonas.getActdelictpre4().equals("-")
                            || VinculosPersonas.getActdelictpre5().equals("-")
                            || VinculosPersonas.getActdelictpre6().equals("-")
                            || VinculosPersonas.getActdelictpre7().equals("-")) {
                        JOptionPane.showMessageDialog(null, "¡Debe completar todos los parámetros para continuar con el examen!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else {
                        vinculos.setVisible(false);
                        vinculos.setEnabled(false);
                        falsifi.ValidacionTipoExamen();
                        falsifi.setVisible(true);
                        falsifi.setEnabled(true);
                        DatoGeneral.fechaizquierda.setVisible(true);
                        DatoGeneral.fechaderecha.setVisible(true);

                        if ("Sinconexion".equals(classes.Conexion.importante)) {

                        } else if ("Conconexion".equals(classes.Conexion.importante)) {
                            if ("nuevo".equals(DatosPrincipales.getOpcionExamen())) {
                                vp.update_vinculos();
                                vp.validarmalosactos();
                                VinculosPersonas.setColorCategoria("con");
                                validarColor();
                                jLabel11.setForeground(Color.red);
                            }
                        }
                    }
                } else if (falsifi.isEnabled()) {
                    if (Falsificacion.getPgrutinaope1_().equals("Sí") && (Falsificacion.getPgrutinaope1().equals("") || Falsificacion.getPgrutinaope1().equals("-") || Falsificacion.getPgrutinaope2().equals("-") || Falsificacion.getPgrutinaope2().equals("") || Falsificacion.getPgrutinaope3().equals("-") || Falsificacion.getPgrutinaope3().equals(""))) //                          
                    {
                        JOptionPane.showMessageDialog(null, "¡Debe completar las preguntas de datos bancarios para continuar con el examen!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else if (Falsificacion.getPgrutinaope4().equals("")
                            || Falsificacion.getPgrutinaope5().equals("")
                            || Falsificacion.getPgrutinaope6().equals("")
                            || Falsificacion.getPgrutinaope7().equals("")
                            || Falsificacion.getPgrutinaope8().equals("")
                            || Falsificacion.getPgrutinaope9().equals("")
                            || Falsificacion.getPgrutinaope10().equals("")
                            || Falsificacion.getPgrutinaope11().equals("")
                            || Falsificacion.getPgrutinaope12().equals("")
                            || Falsificacion.getPgrutina1().equals("")
                            || Falsificacion.getPgrutina2().equals("")
                            || Falsificacion.getPgrutina3().equals("")
                            || Falsificacion.getPgrutina4().equals("")
                            || Falsificacion.getPgrutina5().equals("")
                            || Falsificacion.getPgrutina6().equals("")
                            || Falsificacion.getPgrutina7().equals("")
                            || Falsificacion.getPgrutina8().equals("")
                            || Falsificacion.getPgrutina9().equals("")
                            || Falsificacion.getPgrutina10().equals("")
                            || Falsificacion.getPgrutina11().equals("")
                            || Falsificacion.getPgrutina12().equals("")
                            || Falsificacion.getPgrutina13().equals("")
                            || Falsificacion.getPgrutina14().equals("")
                            || Falsificacion.getPgrutina15().equals("")
                            || Falsificacion.getPgrutina16().equals("")
                            || Falsificacion.getPgrutina17().equals("")
                            || Falsificacion.getPgrutina18().equals("")
                            || Falsificacion.getPgrutina19().equals("")
                            || Falsificacion.getPgrutinaope4().equals("-")
                            || Falsificacion.getPgrutinaope5().equals("-")
                            || Falsificacion.getPgrutinaope6().equals("-")
                            || Falsificacion.getPgrutinaope7().equals("-")
                            || Falsificacion.getPgrutinaope8().equals("-")
                            || Falsificacion.getPgrutinaope9().equals("-")
                            || Falsificacion.getPgrutinaope10().equals("-")
                            || Falsificacion.getPgrutinaope11().equals("-")
                            || Falsificacion.getPgrutinaope12().equals("-")
                            || Falsificacion.getPgrutina1().equals("-")
                            || Falsificacion.getPgrutina2().equals("-")
                            || Falsificacion.getPgrutina3().equals("-")
                            || Falsificacion.getPgrutina4().equals("-")
                            || Falsificacion.getPgrutina5().equals("-")
                            || Falsificacion.getPgrutina6().equals("-")
                            || Falsificacion.getPgrutina7().equals("-")
                            || Falsificacion.getPgrutina8().equals("-")
                            || Falsificacion.getPgrutina9().equals("-")
                            || Falsificacion.getPgrutina10().equals("-")
                            || Falsificacion.getPgrutina11().equals("-")
                            || Falsificacion.getPgrutina12().equals("-")
                            || Falsificacion.getPgrutina13().equals("-")
                            || Falsificacion.getPgrutina14().equals("-")
                            || Falsificacion.getPgrutina15().equals("-")
                            || Falsificacion.getPgrutina16().equals("-")
                            || Falsificacion.getPgrutina17().equals("-")
                            || Falsificacion.getPgrutina18().equals("-")
                            || Falsificacion.getPgrutina19().equals("-")) {

                        JOptionPane.showMessageDialog(null, "¡Debe completar todos los parámetros para continuar con el examen!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else {
                        falsifi.setVisible(false);
                        falsifi.setEnabled(false);
//                        tecp.ValidacionTipoExamen();
                        tecp.setVisible(true);
                        tecp.setEnabled(true);
                        planinfil.setVisible(false);
                        planinfil.setEnabled(false);
                        fechaderecha.setVisible(false);
                        DatoGeneral.fechaizquierda.setVisible(true);

                        if ("Sinconexion".equals(classes.Conexion.importante)) {

                        } else if ("Conconexion".equals(classes.Conexion.importante)) {
                            if ("nuevo".equals(DatosPrincipales.getOpcionExamen())) {
                                pi.update_planesinfil();
                                PlanesInfiltracion.setColorCategoria("con");
                                validarColor();
                                jLabel15.setForeground(Color.red);
                            }
                        }
                    }
                }
            } else //Rutina administrativooooooooooooooooooooooooooooooooooooooooooooooos
            if (DatosPrincipales.getTipoExamen().equals("Rutina (admitivos)")) {

                if (daper.isEnabled()) {
                    Date fechavacia = DatoPersonal.fechanaci.getDate();
                    int age = Integer.parseInt(DatosPersonales.getEdad());
                    if (DatosPersonales.getEstrato().equals("-")) {
                        JOptionPane.showMessageDialog(null, "¡Seleccione el estrato del examinado!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else if (age < 17 || age > 70) {
                        JOptionPane.showMessageDialog(null, "¡La edad no se admite!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else if (DatosPersonales.getGenero().equals("-")) {
                        JOptionPane.showMessageDialog(null, "¡El género no ha sido seleccionado!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else {
                        if (DatosPrincipales.getMotivoExamen().equals("Procedimiento")) {
                            if (DatoPersonal.cbxtipoiden.getSelectedItem().equals("Seleccione") || fechavacia == null || DatoPersonal.txtnombre.getText().equals("") || DatoPersonal.txtnoiden.getText().equals("") || DatoPersonal.txtexpedidos.getText().equals("") || DatoPersonal.txtlugarnaci.getText().equals("") || DatoPersonal.txtdireccion.getText().equals("") || DatoPersonal.txtcargoactual.getText().equals("") || DatoPersonal.txtareaactual.getText().equals("") || DatoPersonal.txtpersonasolicitante.getText().equals("") || DatoPersonal.txtcargosolicitante.getText().equals("")) {
                                JOptionPane.showMessageDialog(null, "¡Debe completar todos los parámetros para registrar los datos!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                            }
                        } else if (DatosPrincipales.getMotivoExamen().equals("Ascenso")) {
                            if (DatoPersonal.cbxtipoiden.getSelectedItem().equals("Seleccione") || fechavacia == null || (DatoPersonal.txtnombre.getText().equals("") || "".equals(DatoPersonal.txtnombre.getText())) || (DatoPersonal.txtnoiden.getText().equals("") || "".equals(DatoPersonal.txtnoiden.getText())) || (DatoPersonal.txtexpedidos.getText().equals("") || "".equals(DatoPersonal.txtexpedidos.getText())) || (DatoPersonal.txtlugarnaci.getText().equals("") || "".equals(DatoPersonal.txtlugarnaci.getText())) || (DatoPersonal.txtdireccion.getText().equals("") || "".equals(DatoPersonal.txtdireccion.getText())) || (DatoPersonal.txtcargoaspira.getText().equals("") || "".equals(DatoPersonal.txtcargoaspira.getText())) || (DatoPersonal.txtareaaspira.getText().equals("") || "".equals(DatoPersonal.txtareaaspira.getText())) || (DatoPersonal.txtcargoactual.getText().equals("") || "".equals(DatoPersonal.txtcargoactual.getText())) || (DatoPersonal.txtareaactual.getText().equals("") || "".equals(DatoPersonal.txtareaactual.getText())) || (DatoPersonal.txtpersonasolicitante.getText().equals("") || "".equals(DatoPersonal.txtpersonasolicitante.getText())) || (DatoPersonal.txtcargosolicitante.getText().equals("") || "".equals(DatoPersonal.txtcargosolicitante.getText()))) {
                                JOptionPane.showMessageDialog(null, "¡Debe completar todos los parámetros para registrar los datos!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                            }
                        }
                        nombreExamen();
                        nombreExamen.setText(TecnicaYPreguntas.getNombreExamen());
                        DatosPersonales.setColorCategoria("con");
                        daper.setVisible(false);
                        daper.setEnabled(false);
                        estsalud.setVisible(true);
                        estsalud.setEnabled(true);

                        DatoGeneral.fechaizquierda.setVisible(true);
                        if ("noesvisible".equals(EstadoSalud.getVisibilidadflecha())) {
                            DatoGeneral.fechaderecha.setVisible(false);
                        } else if ("esvisible".equals(EstadoSalud.getVisibilidadflecha())) {
                            DatoGeneral.fechaderecha.setVisible(true);
                        }

                        if ("Sinconexion".equals(classes.Conexion.importante)) {
                            btnsave.setVisible(true);
                        } else if ("Conconexion".equals(classes.Conexion.importante)) {
                            if ("nuevo".equals(DatosPrincipales.getOpcionExamen())) {
                                dp.update_datosper();
                                DatosPersonales.setColorCategoria("con");
                                DatosPersonales.setValidacionRegistro("registrado");
                                validarColor();
                                jLabel3.setForeground(Color.red);
                            }
                        }
                    }
                } else if (estsalud.isEnabled()) {

                    if (EstadoSalud.getEstado_salud().equals("-") || EstadoSalud.getEstado_salud().equals("")) {
                        JOptionPane.showMessageDialog(null, "¡Debe elegir el estado de salud para continuar!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else if (EstadoSalud.getProb_salud().equals("-") || EstadoSalud.getProb_salud().equals("")) {
                        JOptionPane.showMessageDialog(null, "¡Debe completar todos los parámetros para continuar con el examen!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else {
                        estsalud.setVisible(false);
                        estsalud.setEnabled(false);
                        inforfami.setVisible(true);
                        inforfami.setEnabled(true);
                        DatoGeneral.fechaizquierda.setVisible(true);
                        DatoGeneral.fechaderecha.setVisible(true);

                        if ("Sinconexion".equals(classes.Conexion.importante)) {

                        } else if ("Conconexion".equals(classes.Conexion.importante)) {
                            if ("nuevo".equals(DatosPrincipales.getOpcionExamen())) {
                                es.update_estadosalud();
                                es.validarestadosalud();
                                EstadoSalud.setColorCategoria("con");
                                validarColor();
                                jLabel4.setForeground(Color.red);
                            }
                        }
                    }

                } else if (inforfami.isEnabled()) {
                    if (InfoFamiliar.getEstado_civil().equals("") || InfoFamiliar.getEstado_civil().equals("-")) {
                        JOptionPane.showMessageDialog(null, "¡Debe elegir el estado civil para continuar!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else if (InfoFamiliar.getFami_ries_soci().equals("") || InfoFamiliar.getFami_ries_soci().equals("-")) {
                        JOptionPane.showMessageDialog(null, "¡Debe completar todos los parámetros para continuar con el examen!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else {
                        inforfami.setVisible(false);
                        inforfami.setEnabled(false);
                        infoaca.setVisible(true);
                        infoaca.setEnabled(true);
                        DatoGeneral.fechaizquierda.setVisible(true);
                        DatoGeneral.fechaderecha.setVisible(true);

                        if ("Sinconexion".equals(classes.Conexion.importante)) {

                        } else if ("Conconexion".equals(classes.Conexion.importante)) {
                            if ("nuevo".equals(DatosPrincipales.getOpcionExamen())) {
                                infa.update_infofami();
                                infa.validarfamiliaridad();
                                InfoFamiliar.setColorCategoria("con");
                                validarColor();
                                jLabel10.setForeground(Color.red);
                                Admisiones adms = new Admisiones();
                                adms.admsInfoFami();
                            }
                        }
                    }
                } else if (infoaca.isEnabled()) {
                    if (InfoAcademica.getEstaestudiando().equals("-")) {
                        JOptionPane.showMessageDialog(null, "¡Debe completar todos los parámetros para continuar con el examen!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else {
                        infoaca.setVisible(false);
                        infoaca.setEnabled(false);
                        infofinan.setVisible(true);
                        infofinan.setEnabled(true);
                        DatoGeneral.fechaizquierda.setVisible(true);
                        DatoGeneral.fechaderecha.setVisible(true);

                        if ("Sinconexion".equals(classes.Conexion.importante)) {

                        } else if ("Conconexion".equals(classes.Conexion.importante)) {
                            if ("nuevo".equals(DatosPrincipales.getOpcionExamen())) {
                                ia.validarprimaria();
                                ia.validarbachiller();
                                ia.validartecnico();
                                ia.validartecnologo();
                                ia.validarprofesional();
                                ia.validarpostgrado();
                                ia.validarmaestria();
                                ia.validardoctorado();
                                ia.validarsest();
                                InfoAcademica.setColorCategoria("con");
                                validarColor();
                                jLabel5.setForeground(Color.red);
                            }
                        }
                    }

                } else if (infofinan.isEnabled()) {
                    if (InfoFinanciera.getSitua_economica().equals("-")) {
                        JOptionPane.showMessageDialog(null, "¡Debe elegir la situación económica para continuar!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else if (InfoFinanciera.getGastos_mensuales().equals("")) {
                        JOptionPane.showMessageDialog(null, "¡Debe completar los gastos mensuales para continuar!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else if (InfoFinanciera.getAct_lab_inde().equals("-")
                            || InfoFinanciera.getLiquida_cesan().equals("-")
                            || InfoFinanciera.getTiene_ahorros().equals("-")
                            || InfoFinanciera.getApoyo_padres().equals("-")
                            || InfoFinanciera.getIng_pareja().equals("-")
                            || InfoFinanciera.getHadembargo().equals("-")
                            || InfoFinanciera.getReportadocr().equals("-")
                            || InfoFinanciera.getTieneobligafinan().equals("-")
                            || InfoFinanciera.getTienedeuda().equals("-")
                            || InfoFinanciera.getTienepropi().equals("-")) {
                        JOptionPane.showMessageDialog(null, "¡Debe completar todos los parámetros para continuar con el examen!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else {
                        infofinan.setVisible(false);
                        infofinan.setEnabled(false);
                        casino.setVisible(true);
                        casino.setEnabled(true);
                        DatoGeneral.fechaizquierda.setVisible(true);
                        DatoGeneral.fechaderecha.setVisible(true);

                        if ("Sinconexion".equals(classes.Conexion.importante)) {

                        } else if ("Conconexion".equals(classes.Conexion.importante)) {
                            if ("nuevo".equals(DatosPrincipales.getOpcionExamen())) {
                                infi.update_infofinan();
                                infi.validacionesfinancieras();
                                InfoFinanciera.setColorCategoria("con");
                                validarColor();
                                jLabel13.setForeground(Color.red);
                            }
                        }
                    }
                } else if (casino.isEnabled()) {
                    if (ActiTiempoLibre.getActividadTL1().equals("")
                            || ActiTiempoLibre.getActividadTL2().equals("-")
                            || ActiTiempoLibre.getActividadTL4().equals("-")
                            || ActiTiempoLibre.getActividadTL6().equals("-")
                            || ActiTiempoLibre.getActividadTL8().equals("-")) {
                        JOptionPane.showMessageDialog(null, "¡Debe completar todos los parámetros para continuar con el examen!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else {
                        casino.setVisible(false);
                        casino.setEnabled(false);
                        consbebidas.setVisible(true);
                        consbebidas.setEnabled(true);
                        DatoGeneral.fechaizquierda.setVisible(true);
                        DatoGeneral.fechaderecha.setVisible(true);

                        if ("Sinconexion".equals(classes.Conexion.importante)) {

                        } else if ("Conconexion".equals(classes.Conexion.importante)) {
                            if ("nuevo".equals(DatosPrincipales.getOpcionExamen())) {
                                atl.update_consujuegos();
                                ActiTiempoLibre.setColorCategoria("con");
                                validarColor();
                                jLabel6.setForeground(Color.red);
                            }
                        }
                    }
                } else if (consbebidas.isEnabled()) {
                    if (ConsumoBebidas.getCon_bebidas().equals("-")
                            || ConsumoBebidas.getPg1().equals("-")
                            || ConsumoBebidas.getPg2().equals("-")
                            || ConsumoBebidas.getPg3().equals("-")
                            || ConsumoBebidas.getPg4().equals("-")
                            || ConsumoBebidas.getPg5().equals("-")
                            || ConsumoBebidas.getPg6().equals("-")
                            || ConsumoBebidas.getPg7().equals("-")
                            || ConsumoBebidas.getPg8().equals("-")
                            || ConsumoBebidas.getPg9().equals("-")) {
                        JOptionPane.showMessageDialog(null, "¡Debe completar todos los parámetros para continuar con el examen!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else {
                        consustan.ValidacionTipoExamen();
                        consbebidas.setVisible(false);
                        consbebidas.setEnabled(false);
                        consustan.setVisible(true);
                        consustan.setEnabled(true);
                        DatoGeneral.fechaizquierda.setVisible(true);
                        DatoGeneral.fechaderecha.setVisible(true);

                        if ("Sinconexion".equals(classes.Conexion.importante)) {

                        } else if ("Conconexion".equals(classes.Conexion.importante)) {
                            if ("nuevo".equals(DatosPrincipales.getOpcionExamen())) {
                                cb.update_consubebi();
                                ConsumoBebidas.setColorCategoria("con");
                                validarColor();
                                jLabel7.setForeground(Color.red);
                            }
                        }
                    }
                } else if (consustan.isEnabled()) {
                    if (ConsumoSustancias.getDrogaspregun1().equals("-")
                            || ConsumoSustancias.getDrogaspregun2().equals("-")
                            || ConsumoSustancias.getDrogaspregun3().equals("-")
                            || ConsumoSustancias.getDrogaspregun4().equals("-")
                            || ConsumoSustancias.getDrogaspregun5().equals("-")
                            || ConsumoSustancias.getDrogaspregun6().equals("-")
                            || ConsumoSustancias.getDrogaspregun7().equals("-")
                            || ConsumoSustancias.getHaconsumido().equals("-")
                            || ConsumoSustancias.getHaparticipado().equals("-")) {
                        JOptionPane.showMessageDialog(null, "¡Debe completar todos los parámetros para continuar con el examen!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else {
                        consustan.setVisible(false);
                        consustan.setEnabled(false);
                        antece.setVisible(true);
                        antece.setEnabled(true);
                        DatoGeneral.fechaizquierda.setVisible(true);
                        DatoGeneral.fechaderecha.setVisible(true);

                        if ("Sinconexion".equals(classes.Conexion.importante)) {

                        } else if ("Conconexion".equals(classes.Conexion.importante)) {
                            if ("nuevo".equals(DatosPrincipales.getOpcionExamen())) {
                                cs.update_consusus();
                                cs.validaciondrogas();
                                ConsumoSustancias.setColorCategoria("con");
                                validarColor();
                                jLabel8.setForeground(Color.red);
                            }
                        }
                    }
                } else if (antece.isEnabled()) {
                    if (AntecedentesJudiciales.getPg1().equals("-")
                            || AntecedentesJudiciales.getPg2().equals("-")
                            || AntecedentesJudiciales.getPg3().equals("-")
                            || AntecedentesJudiciales.getPg4().equals("-")
                            || AntecedentesJudiciales.getPg5().equals("")
                            || AntecedentesJudiciales.getPg6().equals("-")
                            || AntecedentesJudiciales.getPg7().equals("-")
                            || AntecedentesJudiciales.getPg8().equals("-")
                            || AntecedentesJudiciales.getPg9().equals("-")
                            || AntecedentesJudiciales.getPg10().equals("-")
                            || AntecedentesJudiciales.getPg11().equals("-")
                            || AntecedentesJudiciales.getPg12().equals("-")) {
                        JOptionPane.showMessageDialog(null, "¡Debe completar todos los parámetros para continuar con el examen!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else {

                        antece.setVisible(false);
                        antece.setEnabled(false);
                        vinculos.setVisible(true);
                        vinculos.setEnabled(true);
                        DatoGeneral.fechaizquierda.setVisible(true);
                        DatoGeneral.fechaderecha.setVisible(true);

                        if ("Sinconexion".equals(classes.Conexion.importante)) {

                        } else if ("Conconexion".equals(classes.Conexion.importante)) {
                            if ("nuevo".equals(DatosPrincipales.getOpcionExamen())) {
                                aj.update_antece();
                                AntecedentesJudiciales.setColorCategoria("con");
                                validarColor();
                                jLabel9.setForeground(Color.red);
                            }
                        }
                    }
                } else if (vinculos.isEnabled()) {
                    if (VinculosPersonas.getVinculosmargenley().equals("-")
                            || VinculosPersonas.getActdelictpre1().equals("-")
                            //                            || VinculosPersonas.getActdelictpre2().equals("-")
                            || VinculosPersonas.getActdelictpre3().equals("-")
                            || VinculosPersonas.getActdelictpre4().equals("-")
                            || VinculosPersonas.getActdelictpre5().equals("-")
                            || VinculosPersonas.getActdelictpre6().equals("-")
                            || VinculosPersonas.getActdelictpre7().equals("-")) {
                        JOptionPane.showMessageDialog(null, "¡Debe completar todos los parámetros para continuar con el examen!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else {
                        vinculos.setVisible(false);
                        vinculos.setEnabled(false);
                        falsifi.ValidacionTipoExamen();
                        falsifi.setVisible(true);
                        falsifi.setEnabled(true);
                        DatoGeneral.fechaizquierda.setVisible(true);
                        DatoGeneral.fechaderecha.setVisible(true);

                        if ("Sinconexion".equals(classes.Conexion.importante)) {

                        } else if ("Conconexion".equals(classes.Conexion.importante)) {
                            if ("nuevo".equals(DatosPrincipales.getOpcionExamen())) {
                                vp.update_vinculos();
                                vp.validarmalosactos();
                                VinculosPersonas.setColorCategoria("con");
                                validarColor();
                                jLabel11.setForeground(Color.red);
                            }
                        }
                    }
                } else if (falsifi.isEnabled()) {
                    if (Falsificacion.getPgrutinaadmi1().equals("")
                            || Falsificacion.getPgrutinaadmi2().equals("")
                            || Falsificacion.getPgrutinaadmi3().equals("")
                            || Falsificacion.getPgrutinaadmi4().equals("")
                            || Falsificacion.getPgrutinaadmi5().equals("")
                            || Falsificacion.getPgrutinaadmi6().equals("")
                            || Falsificacion.getPgrutinaadmi7().equals("")
                            || Falsificacion.getPgrutinaadmi8().equals("")
                            || Falsificacion.getPgrutina1().equals("")
                            || Falsificacion.getPgrutina2().equals("")
                            || Falsificacion.getPgrutina3().equals("")
                            || Falsificacion.getPgrutina4().equals("")
                            || Falsificacion.getPgrutina5().equals("")
                            || Falsificacion.getPgrutina6().equals("")
                            || Falsificacion.getPgrutina7().equals("")
                            || Falsificacion.getPgrutina8().equals("")
                            || Falsificacion.getPgrutina9().equals("")
                            || Falsificacion.getPgrutina10().equals("")
                            || Falsificacion.getPgrutina11().equals("")
                            || Falsificacion.getPgrutina12().equals("")
                            || Falsificacion.getPgrutina13().equals("")
                            || Falsificacion.getPgrutina14().equals("")
                            || Falsificacion.getPgrutina15().equals("")
                            || Falsificacion.getPgrutina16().equals("")
                            || Falsificacion.getPgrutina17().equals("")
                            || Falsificacion.getPgrutina18().equals("")
                            || Falsificacion.getPgrutina19().equals("")
                            || Falsificacion.getPgrutinaadmi1().equals("-")
                            || Falsificacion.getPgrutinaadmi2().equals("-")
                            || Falsificacion.getPgrutinaadmi3().equals("-")
                            || Falsificacion.getPgrutinaadmi4().equals("-")
                            || Falsificacion.getPgrutinaadmi5().equals("-")
                            || Falsificacion.getPgrutinaadmi6().equals("-")
                            || Falsificacion.getPgrutinaadmi7().equals("-")
                            || Falsificacion.getPgrutinaadmi8().equals("-")
                            || Falsificacion.getPgrutina1().equals("-")
                            || Falsificacion.getPgrutina2().equals("-")
                            || Falsificacion.getPgrutina3().equals("-")
                            || Falsificacion.getPgrutina4().equals("-")
                            || Falsificacion.getPgrutina5().equals("-")
                            || Falsificacion.getPgrutina6().equals("-")
                            || Falsificacion.getPgrutina7().equals("-")
                            || Falsificacion.getPgrutina8().equals("-")
                            || Falsificacion.getPgrutina9().equals("-")
                            || Falsificacion.getPgrutina10().equals("-")
                            || Falsificacion.getPgrutina11().equals("-")
                            || Falsificacion.getPgrutina12().equals("-")
                            || Falsificacion.getPgrutina13().equals("-")
                            || Falsificacion.getPgrutina14().equals("-")
                            || Falsificacion.getPgrutina15().equals("-")
                            || Falsificacion.getPgrutina16().equals("-")
                            || Falsificacion.getPgrutina17().equals("-")
                            || Falsificacion.getPgrutina18().equals("-")
                            || Falsificacion.getPgrutina19().equals("-")) {

                        System.out.println("1- " + Falsificacion.getPgrutinaadmi1());
                        System.out.println("2- " + Falsificacion.getPgrutinaadmi2());
                        System.out.println("3- " + Falsificacion.getPgrutinaadmi3());
                        System.out.println("4- " + Falsificacion.getPgrutinaadmi4());
                        System.out.println("5- " + Falsificacion.getPgrutinaadmi5());
                        System.out.println("6- " + Falsificacion.getPgrutinaadmi6());
                        System.out.println("7- " + Falsificacion.getPgrutinaadmi7());
                        System.out.println("8- " + Falsificacion.getPgrutinaadmi8());
                        System.out.println("1-- " + Falsificacion.getPgrutina1());
                        System.out.println("2-- " + Falsificacion.getPgrutina2());
                        System.out.println("3-- " + Falsificacion.getPgrutina3());
                        System.out.println("4-- " + Falsificacion.getPgrutina4());
                        System.out.println("5-- " + Falsificacion.getPgrutina5());
                        System.out.println("6-- " + Falsificacion.getPgrutina6());
                        System.out.println("7-- " + Falsificacion.getPgrutina7());
                        System.out.println("8-- " + Falsificacion.getPgrutina8());
                        System.out.println("9-- " + Falsificacion.getPgrutina9());
                        System.out.println("10-- " + Falsificacion.getPgrutina10());
                        System.out.println("11-- " + Falsificacion.getPgrutina11());
                        System.out.println("12-- " + Falsificacion.getPgrutina12());
                        System.out.println("13-- " + Falsificacion.getPgrutina13());
                        System.out.println("14-- " + Falsificacion.getPgrutina14());
                        System.out.println("15-- " + Falsificacion.getPgrutina15());
                        System.out.println("16-- " + Falsificacion.getPgrutina16());
                        System.out.println("17-- " + Falsificacion.getPgrutina17());
                        System.out.println("18-- " + Falsificacion.getPgrutina18());
                        System.out.println("19-- " + Falsificacion.getPgrutina19());
                        System.out.println("1 " + Falsificacion.getPgrutinaadmi1());
                        System.out.println("2 " + Falsificacion.getPgrutinaadmi2());
                        System.out.println("3 " + Falsificacion.getPgrutinaadmi3());
                        System.out.println("4 " + Falsificacion.getPgrutinaadmi4());
                        System.out.println("5 " + Falsificacion.getPgrutinaadmi5());
                        System.out.println("6 " + Falsificacion.getPgrutinaadmi6());
                        System.out.println("7 " + Falsificacion.getPgrutinaadmi7());
                        System.out.println("8 " + Falsificacion.getPgrutinaadmi8());

                        JOptionPane.showMessageDialog(null, "¡Debe completar todos los parámetros para continuar con el examen!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else {
                        falsifi.setVisible(false);
                        falsifi.setEnabled(false);

                        tecp.setVisible(true);
                        tecp.setEnabled(true);
                        fechaderecha.setVisible(false);
                        DatoGeneral.fechaizquierda.setVisible(true);

                        if ("Sinconexion".equals(classes.Conexion.importante)) {

                        } else if ("Conconexion".equals(classes.Conexion.importante)) {
                            if ("nuevo".equals(DatosPrincipales.getOpcionExamen())) {
                                pi.update_planesinfil();
                                Falsificacion.setColorCategoria("con");
                                validarColor();
                                jLabel15.setForeground(Color.red);
                            }
                        }
                    }
                }

            } else //Especificooooooooooooooooooooooooooooooooooooooooooo
            if (DatosPrincipales.getTipoExamen().equals("Específico")) {
                System.out.println("triplehijueputa life");
                if (daper.isEnabled()) {
                    Date fechavacia = DatoPersonal.fechanaci.getDate();
                    int age = Integer.parseInt(DatosPersonales.getEdad());
                    if (DatosPersonales.getEstrato().equals("-")) {
                        JOptionPane.showMessageDialog(null, "¡Seleccione el estrato del examinado!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else if (age < 17 || age > 70) {
                        JOptionPane.showMessageDialog(null, "¡La edad no se admite!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else if (DatoPersonal.cbxtipoiden.getSelectedItem().equals("Seleccione") || fechavacia == null || (DatoPersonal.txtnombre.getText().equals("") || "".equals(DatoPersonal.txtnombre.getText())) || (DatoPersonal.txtnoiden.getText().equals("") || "".equals(DatoPersonal.txtnoiden.getText())) || (DatoPersonal.txtexpedidos.getText().equals("") || "".equals(DatoPersonal.txtexpedidos.getText())) || (DatoPersonal.txtlugarnaci.getText().equals("") || "".equals(DatoPersonal.txtlugarnaci.getText())) || (DatoPersonal.txtdireccion.getText().equals("") || "".equals(DatoPersonal.txtdireccion.getText())) || (DatoPersonal.txtpersonasolicitante.getText().equals("") || "".equals(DatoPersonal.txtpersonasolicitante.getText())) || (DatoPersonal.txtcargosolicitante.getText().equals("") || "".equals(DatoPersonal.txtcargosolicitante.getText())) || (DatoPersonal.txtareaactual.getText().equals("") || "".equals(DatoPersonal.txtareaactual.getText())) || (DatoPersonal.txtcargoactual.getText().equals("") || "".equals(DatoPersonal.txtcargoactual.getText()))) {
                        JOptionPane.showMessageDialog(null, "¡Debe completar todos los parámetros para registrar los datos!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else if (DatosPersonales.getGenero().equals("-") || DatosPersonales.getGenero().equals("") || DatosPersonales.getGenero() == null) {
                        JOptionPane.showMessageDialog(null, "¡El género no ha sido seleccionado!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else {

                        nombreExamen();
                        nombreExamen.setText(TecnicaYPreguntas.getNombreExamen());
                        DatosPersonales.setColorCategoria("con");
                        daper.setVisible(false);
                        daper.setEnabled(false);
                        estsalud.setVisible(true);
                        estsalud.setEnabled(true);

                        DatoGeneral.fechaizquierda.setVisible(true);
                        if ("noesvisible".equals(EstadoSalud.getVisibilidadflecha())) {
                            DatoGeneral.fechaderecha.setVisible(false);
                        } else if ("esvisible".equals(EstadoSalud.getVisibilidadflecha())) {
                            DatoGeneral.fechaderecha.setVisible(true);
                        }

                        if ("Sinconexion".equals(classes.Conexion.importante)) {
                            btnsave.setVisible(true);
                        } else if ("Conconexion".equals(classes.Conexion.importante)) {
                            if ("nuevo".equals(DatosPrincipales.getOpcionExamen())) {
                                dp.update_datosper();
                                DatosPersonales.setColorCategoria("con");
                                DatosPersonales.setValidacionRegistro("registrado");
                                validarColor();
                                jLabel3.setForeground(Color.red);
                            }
                        }
                    }
                } else if (estsalud.isEnabled()) {

                    if (EstadoSalud.getEstado_salud().equals("-") || EstadoSalud.getEstado_salud().equals("")) {
                        JOptionPane.showMessageDialog(null, "¡Debe elegir el estado de salud para continuar!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else if (EstadoSalud.getProb_salud().equals("-") || EstadoSalud.getProb_salud().equals("")) {
                        JOptionPane.showMessageDialog(null, "¡Debe completar todos los parámetros para continuar con el examen!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else {
                        estsalud.setVisible(false);
                        estsalud.setEnabled(false);
                        inforfami.setVisible(true);
                        inforfami.setEnabled(true);
                        DatoGeneral.fechaizquierda.setVisible(true);
                        DatoGeneral.fechaderecha.setVisible(true);

                        if ("Sinconexion".equals(classes.Conexion.importante)) {

                        } else if ("Conconexion".equals(classes.Conexion.importante)) {
                            if ("nuevo".equals(DatosPrincipales.getOpcionExamen())) {
                                es.update_estadosalud();
                                es.validarestadosalud();
                                EstadoSalud.setColorCategoria("con");
                                validarColor();
                                jLabel4.setForeground(Color.red);
                            }
                        }
                    }

                } else if (inforfami.isEnabled()) {
                    if (InfoFamiliar.getEstado_civil().equals("") || InfoFamiliar.getEstado_civil().equals("-")) {
                        JOptionPane.showMessageDialog(null, "¡Debe elegir el estado civil para continuar!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else if (InfoFamiliar.getFami_ries_soci().equals("") || InfoFamiliar.getFami_ries_soci().equals("-")) {
                        JOptionPane.showMessageDialog(null, "¡Debe completar todos los parámetros para continuar con el examen!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else {
                        inforfami.setVisible(false);
                        inforfami.setEnabled(false);
                        infoaca.setVisible(true);
                        infoaca.setEnabled(true);
                        DatoGeneral.fechaizquierda.setVisible(true);
                        DatoGeneral.fechaderecha.setVisible(true);

                        if ("Sinconexion".equals(classes.Conexion.importante)) {

                        } else if ("Conconexion".equals(classes.Conexion.importante)) {
                            if ("nuevo".equals(DatosPrincipales.getOpcionExamen())) {
                                infa.update_infofami();
                                infa.validarfamiliaridad();
                                InfoAcademica.setColorCategoria("con");
                                validarColor();
                                jLabel10.setForeground(Color.red);
                                Admisiones adms = new Admisiones();
                                adms.admsInfoFami();
                            }
                        }
                    }
                } else if (infoaca.isEnabled()) {
                    if (InfoAcademica.getEstaestudiando().equals("-")) {
                        JOptionPane.showMessageDialog(null, "¡Debe completar todos los parámetros para continuar con el examen!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else {
                        infoaca.setVisible(false);
                        infoaca.setEnabled(false);
                        infofinan.setVisible(true);
                        infofinan.setEnabled(true);
                        DatoGeneral.fechaizquierda.setVisible(true);
                        DatoGeneral.fechaderecha.setVisible(true);

                        if ("Sinconexion".equals(classes.Conexion.importante)) {

                        } else if ("Conconexion".equals(classes.Conexion.importante)) {
                            if ("nuevo".equals(DatosPrincipales.getOpcionExamen())) {
                                ia.validarprimaria();
                                ia.validarbachiller();
                                ia.validartecnico();
                                ia.validartecnologo();
                                ia.validarprofesional();
                                ia.validarpostgrado();
                                ia.validarmaestria();
                                ia.validardoctorado();
                                ia.validarsest();
                                InfoFinanciera.setColorCategoria("con");
                                validarColor();
                                jLabel5.setForeground(Color.red);
                            }
                        }
                    }

                } else if (infofinan.isEnabled()) {
                    if (InfoFinanciera.getSitua_economica().equals("-")) {
                        JOptionPane.showMessageDialog(null, "¡Debe elegir la situación económica para continuar!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else if (InfoFinanciera.getGastos_mensuales().equals("")) {
                        JOptionPane.showMessageDialog(null, "¡Debe completar los gastos mensuales para continuar!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else if (InfoFinanciera.getAct_lab_inde().equals("-")
                            || InfoFinanciera.getLiquida_cesan().equals("-")
                            || InfoFinanciera.getTiene_ahorros().equals("-")
                            || InfoFinanciera.getApoyo_padres().equals("-")
                            || InfoFinanciera.getIng_pareja().equals("-")
                            || InfoFinanciera.getHadembargo().equals("-")
                            || InfoFinanciera.getReportadocr().equals("-")
                            || InfoFinanciera.getTieneobligafinan().equals("-")
                            || InfoFinanciera.getTienedeuda().equals("-")
                            || InfoFinanciera.getTienepropi().equals("-")) {
                        JOptionPane.showMessageDialog(null, "¡Debe completar todos los parámetros para continuar con el examen!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else {
                        infofinan.setVisible(false);
                        infofinan.setEnabled(false);
                        consbebidas.setVisible(true);
                        consbebidas.setEnabled(true);
                        DatoGeneral.fechaizquierda.setVisible(true);
                        DatoGeneral.fechaderecha.setVisible(true);

                        if ("Sinconexion".equals(classes.Conexion.importante)) {

                        } else if ("Conconexion".equals(classes.Conexion.importante)) {
                            if ("nuevo".equals(DatosPrincipales.getOpcionExamen())) {
                                atl.update_consujuegos();
                                ActiTiempoLibre.setColorCategoria("con");
                                validarColor();
                                jLabel6.setForeground(Color.red);
                            }
                        }
                    }
                } else if (consbebidas.isEnabled()) {
                    if (ConsumoBebidas.getCon_bebidas().equals("-")
                            || ConsumoBebidas.getPg1().equals("-")
                            || ConsumoBebidas.getPg2().equals("-")
                            || ConsumoBebidas.getPg3().equals("-")
                            || ConsumoBebidas.getPg4().equals("-")
                            || ConsumoBebidas.getPg5().equals("-")
                            || ConsumoBebidas.getPg6().equals("-")
                            || ConsumoBebidas.getPg7().equals("-")
                            || ConsumoBebidas.getPg8().equals("-")
                            || ConsumoBebidas.getPg9().equals("-")) {
                        JOptionPane.showMessageDialog(null, "¡Debe completar todos los parámetros para continuar con el examen!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else {
                        consustan.ValidacionTipoExamen();
                        consbebidas.setVisible(false);
                        consbebidas.setEnabled(false);
                        consustan.setVisible(true);
                        consustan.setEnabled(true);
                        DatoGeneral.fechaizquierda.setVisible(true);
                        DatoGeneral.fechaderecha.setVisible(true);

                        if ("Sinconexion".equals(classes.Conexion.importante)) {

                        } else if ("Conconexion".equals(classes.Conexion.importante)) {
                            if ("nuevo".equals(DatosPrincipales.getOpcionExamen())) {
                                cb.update_consubebi();
                                ConsumoBebidas.setColorCategoria("con");
                                validarColor();
                                jLabel7.setForeground(Color.red);
                            }
                        }
                    }
                } else if (consustan.isEnabled()) {
                    if (ConsumoSustancias.getDrogaspregun1().equals("-")
                            || ConsumoSustancias.getDrogaspregun2().equals("-")
                            || ConsumoSustancias.getDrogaspregun3().equals("-")
                            || ConsumoSustancias.getDrogaspregun4().equals("-")
                            || ConsumoSustancias.getDrogaspregun5().equals("-")
                            || ConsumoSustancias.getDrogaspregun6().equals("-")
                            || ConsumoSustancias.getDrogaspregun7().equals("-")
                            || ConsumoSustancias.getDrogaspregun8().equals("-")
                            || ConsumoSustancias.getDrogaspregun9().equals("-")
                            || ConsumoSustancias.getDrogaspregun10().equals("-")
                            || ConsumoSustancias.getDrogaspregun11().equals("-")
                            || ConsumoSustancias.getDrogaspregun12().equals("-")
                            || ConsumoSustancias.getDrogaspregun13().equals("-")
                            || ConsumoSustancias.getHaconsumido().equals("-")
                            || ConsumoSustancias.getHaparticipado().equals("-")) {
                        JOptionPane.showMessageDialog(null, "¡Debe completar todos los parámetros para continuar con el examen!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else {
                        consustan.setVisible(false);
                        consustan.setEnabled(false);
                        antece.setVisible(true);
                        antece.setEnabled(true);
                        DatoGeneral.fechaizquierda.setVisible(true);
                        DatoGeneral.fechaderecha.setVisible(true);

                        if ("Sinconexion".equals(classes.Conexion.importante)) {

                        } else if ("Conconexion".equals(classes.Conexion.importante)) {
                            if ("nuevo".equals(DatosPrincipales.getOpcionExamen())) {
                                cs.update_consusus();
                                cs.validaciondrogas();
                                ConsumoSustancias.setColorCategoria("con");
                                validarColor();
                                jLabel8.setForeground(Color.red);
                            }
                        }
                    }
                } else if (antece.isEnabled()) {
                    if (AntecedentesJudiciales.getPg1().equals("-")
                            || AntecedentesJudiciales.getPg2().equals("-")
                            || AntecedentesJudiciales.getPg3().equals("-")
                            || AntecedentesJudiciales.getPg4().equals("-")
                            || AntecedentesJudiciales.getPg5().equals("")
                            || AntecedentesJudiciales.getPg6().equals("-")
                            || AntecedentesJudiciales.getPg7().equals("-")
                            || AntecedentesJudiciales.getPg8().equals("-")
                            || AntecedentesJudiciales.getPg9().equals("-")
                            || AntecedentesJudiciales.getPg10().equals("-")
                            || AntecedentesJudiciales.getPg11().equals("-")
                            || AntecedentesJudiciales.getPg12().equals("-")) {
                        JOptionPane.showMessageDialog(null, "¡Debe completar todos los parámetros para continuar con el examen!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else {

                        antece.setVisible(false);
                        antece.setEnabled(false);
                        vinculos.setVisible(true);
                        vinculos.setEnabled(true);
                        DatoGeneral.fechaizquierda.setVisible(true);
                        DatoGeneral.fechaderecha.setVisible(true);

                        if ("Sinconexion".equals(classes.Conexion.importante)) {

                        } else if ("Conconexion".equals(classes.Conexion.importante)) {
                            if ("nuevo".equals(DatosPrincipales.getOpcionExamen())) {
                                aj.update_antece();
                                AntecedentesJudiciales.setColorCategoria("con");
                                validarColor();
                                jLabel9.setForeground(Color.red);
                            }
                        }
                    }
                } else if (vinculos.isEnabled()) {
                    if (VinculosPersonas.getVinculosmargenley().equals("-")
                            || VinculosPersonas.getActdelictpre1().equals("-")
                            //                            || VinculosPersonas.getActdelictpre2().equals("-")
                            || VinculosPersonas.getActdelictpre3().equals("-")
                            || VinculosPersonas.getActdelictpre4().equals("-")
                            || VinculosPersonas.getActdelictpre5().equals("-")
                            || VinculosPersonas.getActdelictpre6().equals("-")
                            || VinculosPersonas.getActdelictpre7().equals("-")) {
                        JOptionPane.showMessageDialog(null, "¡Debe completar todos los parámetros para continuar con el examen!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else {
                        vinculos.setVisible(false);
                        vinculos.setEnabled(false);
                        temain.setVisible(true);
                        temain.setEnabled(true);
                        DatoGeneral.fechaizquierda.setVisible(true);
                        DatoGeneral.fechaderecha.setVisible(true);

                        if ("Sinconexion".equals(classes.Conexion.importante)) {

                        } else if ("Conconexion".equals(classes.Conexion.importante)) {
                            if ("nuevo".equals(DatosPrincipales.getOpcionExamen())) {
                                vp.update_vinculos();
                                vp.validarmalosactos();
                                VinculosPersonas.setColorCategoria("con");
                                validarColor();
                                jLabel18.setForeground(Color.red);
                            }
                        }
                    }
                } else if (temain.isEnabled()) {
                    if (TemaBajo.getPg1().equals("") || TemaBajo.getPg2().equals("") || TemaBajo.getPg4().equals("")) {
                        JOptionPane.showMessageDialog(null, "¡Debe completar todos los parámetros para continuar con el examen!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else {
                        temain.setVisible(false);
                        temain.setEnabled(false);
                        tecp.setVisible(true);
                        tecp.setEnabled(true);
                        fechaderecha.setVisible(false);
                        DatoGeneral.fechaizquierda.setVisible(true);
                        validarColor();
                        jLabel15.setForeground(Color.red);

                        if ("Sinconexion".equals(classes.Conexion.importante)) {

                        } else if ("Conconexion".equals(classes.Conexion.importante)) {
                            if ("nuevo".equals(DatosPrincipales.getOpcionExamen())) {
                                pi.update_planesinfil();
                                PlanesInfiltracion.setColorCategoria("con");
                                validarColor();
                                jLabel15.setForeground(Color.red);
                            }
                        }
                    }
                }
            }

        }
    }

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

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        tituloexamenpre = new javax.swing.JLabel();
        paratodo = new javax.swing.JDesktopPane();
        fechaderecha = new javax.swing.JLabel();
        fechaizquierda = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnsave = new javax.swing.JPanel();
        jLabel51 = new javax.swing.JLabel();
        jPanel21 = new javax.swing.JPanel();
        jLabel70 = new javax.swing.JLabel();
        btncancelar = new javax.swing.JPanel();
        jLabel68 = new javax.swing.JLabel();
        btneditar = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        btndescargarexamen = new javax.swing.JPanel();
        jLabel58 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        btnTerminar = new javax.swing.JButton();
        nombreExamen = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(null);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1366, 768));

        jDesktopPane1.setBackground(new java.awt.Color(255, 255, 255));
        jDesktopPane1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("FORMULARIO DE PREGUNTAS");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Datos personales");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Estado de salud");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Información familiar");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Información financiera");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Consumo de bebidas alcohólicas");
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Consumo de sustancias psicoactivas");
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Antecedentes y anotaciones judiciales");
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("Vínculos con personas al margen de la ley");
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setText("Información académica");
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setText("Falsificación");
        jLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel12.setText("Historia laboral");
        jLabel12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel14.setText("Planes de infiltración");
        jLabel14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });

        tituloexamenpre.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        tituloexamenpre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloexamenpre.setText("Examen Pre-Empleo");

        paratodo.setBackground(new java.awt.Color(255, 255, 255));
        paratodo.setPreferredSize(new java.awt.Dimension(816, 467));

        javax.swing.GroupLayout paratodoLayout = new javax.swing.GroupLayout(paratodo);
        paratodo.setLayout(paratodoLayout);
        paratodoLayout.setHorizontalGroup(
            paratodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 975, Short.MAX_VALUE)
        );
        paratodoLayout.setVerticalGroup(
            paratodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 550, Short.MAX_VALUE)
        );

        fechaderecha.setBackground(new java.awt.Color(255, 255, 255));
        fechaderecha.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        fechaderecha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/arrow-pointing-to-right.png"))); // NOI18N
        fechaderecha.setToolTipText("Siguiente");
        fechaderecha.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        fechaderecha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fechaderechaMouseClicked(evt);
            }
        });

        fechaizquierda.setBackground(new java.awt.Color(255, 255, 255));
        fechaizquierda.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        fechaizquierda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/left-arrow.png"))); // NOI18N
        fechaizquierda.setToolTipText("Atrás");
        fechaizquierda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        fechaizquierda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fechaizquierdaMouseClicked(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel15.setText("Técnica empleada y preguntas relevantes");
        jLabel15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel13.setText("Actividades en tiempo libre");
        jLabel13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel18.setText("Tema bajo investigación");
        jLabel18.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel18MouseClicked(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        btnsave.setBackground(new java.awt.Color(89, 172, 63));
        btnsave.setForeground(new java.awt.Color(255, 255, 255));
        btnsave.setToolTipText("Guardar y finalizar");
        btnsave.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnsave.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnsaveMouseMoved(evt);
            }
        });
        btnsave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnsaveMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnsaveMouseExited(evt);
            }
        });

        jLabel51.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/save.png"))); // NOI18N
        jLabel51.setToolTipText("Guardar y finalizar");
        jLabel51.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel51MouseMoved(evt);
            }
        });
        jLabel51.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel51MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel51MouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnsaveLayout = new javax.swing.GroupLayout(btnsave);
        btnsave.setLayout(btnsaveLayout);
        btnsaveLayout.setHorizontalGroup(
            btnsaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnsaveLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel51)
                .addGap(7, 7, 7))
        );
        btnsaveLayout.setVerticalGroup(
            btnsaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnsaveLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel51)
                .addGap(7, 7, 7))
        );

        jPanel21.setBackground(java.awt.Color.orange);
        jPanel21.setForeground(new java.awt.Color(255, 255, 255));
        jPanel21.setToolTipText("Cambiar examen");
        jPanel21.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel21.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanel21MouseMoved(evt);
            }
        });
        jPanel21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel21MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel21MouseExited(evt);
            }
        });

        jLabel70.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/exchange.png"))); // NOI18N
        jLabel70.setToolTipText("Cambiar examen");
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

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel70)
                .addGap(7, 7, 7))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel21Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel70)
                .addGap(7, 7, 7))
        );

        btncancelar.setBackground(java.awt.Color.red);
        btncancelar.setForeground(new java.awt.Color(255, 255, 255));
        btncancelar.setToolTipText("Cancelar y cerrar");
        btncancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btncancelar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btncancelarMouseMoved(evt);
            }
        });
        btncancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btncancelarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btncancelarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btncancelarMouseExited(evt);
            }
        });

        jLabel68.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/multiply.png"))); // NOI18N
        jLabel68.setToolTipText("Cancelar y cerrar");
        jLabel68.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel68MouseMoved(evt);
            }
        });
        jLabel68.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel68MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel68MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel68MouseExited(evt);
            }
        });

        javax.swing.GroupLayout btncancelarLayout = new javax.swing.GroupLayout(btncancelar);
        btncancelar.setLayout(btncancelarLayout);
        btncancelarLayout.setHorizontalGroup(
            btncancelarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btncancelarLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel68)
                .addGap(7, 7, 7))
        );
        btncancelarLayout.setVerticalGroup(
            btncancelarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btncancelarLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel68)
                .addGap(7, 7, 7))
        );

        btneditar.setBackground(new java.awt.Color(0, 0, 255));
        btneditar.setToolTipText("Editar datos");
        btneditar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btneditar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btneditarMouseMoved(evt);
            }
        });
        btneditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btneditarMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btneditarMouseExited(evt);
            }
        });

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/edit.png"))); // NOI18N

        javax.swing.GroupLayout btneditarLayout = new javax.swing.GroupLayout(btneditar);
        btneditar.setLayout(btneditarLayout);
        btneditarLayout.setHorizontalGroup(
            btneditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btneditarLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel17)
                .addGap(7, 7, 7))
        );
        btneditarLayout.setVerticalGroup(
            btneditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btneditarLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(7, 7, 7))
        );

        btndescargarexamen.setBackground(new java.awt.Color(0, 0, 0));
        btndescargarexamen.setForeground(new java.awt.Color(255, 255, 255));
        btndescargarexamen.setToolTipText("Previsualizar examen");
        btndescargarexamen.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btndescargarexamen.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btndescargarexamenMouseMoved(evt);
            }
        });
        btndescargarexamen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btndescargarexamenMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btndescargarexamenMouseExited(evt);
            }
        });

        jLabel58.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pdf-file.png"))); // NOI18N
        jLabel58.setToolTipText("Previsualizar examen");
        jLabel58.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel58MouseClicked(evt);
            }
        });

        jLabel81.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel81.setForeground(new java.awt.Color(255, 255, 255));
        jLabel81.setText("    Ver");
        jLabel81.setToolTipText("Previsualizar examen");
        jLabel81.setAlignmentX(1.0F);
        jLabel81.setAlignmentY(1.0F);
        jLabel81.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel81MouseClicked(evt);
            }
        });

        jLabel82.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel82.setForeground(new java.awt.Color(255, 255, 255));
        jLabel82.setText(" examen");
        jLabel82.setToolTipText("Previsualizar examen");
        jLabel82.setAlignmentX(1.0F);
        jLabel82.setAlignmentY(1.0F);
        jLabel82.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel82MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btndescargarexamenLayout = new javax.swing.GroupLayout(btndescargarexamen);
        btndescargarexamen.setLayout(btndescargarexamenLayout);
        btndescargarexamenLayout.setHorizontalGroup(
            btndescargarexamenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btndescargarexamenLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(btndescargarexamenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(btndescargarexamenLayout.createSequentialGroup()
                        .addComponent(jLabel81, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel82, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE))
                .addContainerGap())
        );
        btndescargarexamenLayout.setVerticalGroup(
            btndescargarexamenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btndescargarexamenLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(btndescargarexamenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel58, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(btndescargarexamenLayout.createSequentialGroup()
                        .addComponent(jLabel81)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel82)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnsave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btncancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btneditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btndescargarexamen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(75, 75, 75))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btndescargarexamen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btneditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btncancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnsave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66))
        );

        btnTerminar.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        btnTerminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/completed-tasks.png"))); // NOI18N
        btnTerminar.setText("Terminar Examen");
        btnTerminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTerminarActionPerformed(evt);
            }
        });

        nombreExamen.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N

        jDesktopPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel8, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel9, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel10, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel11, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel12, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel14, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(tituloexamenpre, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(paratodo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(fechaderecha, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(fechaizquierda, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel15, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel13, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel18, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jPanel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel19, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel20, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(btnTerminar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(nombreExamen, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(fechaizquierda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(paratodo, javax.swing.GroupLayout.PREFERRED_SIZE, 975, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(nombreExamen, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTerminar)))
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fechaderecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(11, 11, 11))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addComponent(tituloexamenpre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(tituloexamenpre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(fechaderecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jDesktopPane1Layout.createSequentialGroup()
                                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)
                                .addComponent(fechaizquierda, javax.swing.GroupLayout.PREFERRED_SIZE, 553, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jDesktopPane1Layout.createSequentialGroup()
                                .addComponent(paratodo, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnTerminar)
                                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(nombreExamen, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(5, 5, 5)))))
                        .addContainerGap(22, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnsaveMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsaveMouseMoved
        btnsave.setBackground(Color.decode("#1B5E20"));
    }//GEN-LAST:event_btnsaveMouseMoved

    private void btnsaveMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsaveMouseExited
        btnsave.setBackground(Color.decode("#59AC3F"));
    }//GEN-LAST:event_btnsaveMouseExited

    private void jLabel51MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel51MouseMoved
        btnsave.setBackground(Color.decode("#1B5E20"));
    }//GEN-LAST:event_jLabel51MouseMoved

    private void jLabel51MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel51MouseExited
        btnsave.setBackground(Color.decode("#59AC3F"));
    }//GEN-LAST:event_jLabel51MouseExited

    private void jLabel68MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel68MouseMoved
        btncancelar.setBackground(Color.decode("#D50000"));
    }//GEN-LAST:event_jLabel68MouseMoved

    private void jLabel68MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel68MouseExited
        btncancelar.setBackground(Color.red);
    }//GEN-LAST:event_jLabel68MouseExited

    private void btncancelarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncancelarMouseMoved
        btncancelar.setBackground(Color.decode("#D50000"));
    }//GEN-LAST:event_btncancelarMouseMoved

    private void btncancelarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncancelarMouseExited
        btncancelar.setBackground(Color.red);
    }//GEN-LAST:event_btncancelarMouseExited

    private void jLabel70MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel70MouseMoved
        jPanel21.setBackground(Color.decode("#F9A825"));
    }//GEN-LAST:event_jLabel70MouseMoved

    private void jLabel70MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel70MouseExited
        jPanel21.setBackground(Color.orange);
    }//GEN-LAST:event_jLabel70MouseExited

    private void jPanel21MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel21MouseMoved
        jPanel21.setBackground(Color.decode("#F9A825"));
    }//GEN-LAST:event_jPanel21MouseMoved

    private void jPanel21MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel21MouseExited
        jPanel21.setBackground(Color.orange);
    }//GEN-LAST:event_jPanel21MouseExited

    private void jPanel21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel21MouseClicked
        cambiarExamen();
    }//GEN-LAST:event_jPanel21MouseClicked

    private void jLabel70MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel70MouseClicked
        cambiarExamen();
    }//GEN-LAST:event_jLabel70MouseClicked

    private void btncancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncancelarMouseClicked
        cancelarexamen();
    }//GEN-LAST:event_btncancelarMouseClicked

    private void btndescargarexamenMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btndescargarexamenMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_btndescargarexamenMouseMoved

    private void btndescargarexamenMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btndescargarexamenMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btndescargarexamenMouseExited

    private void fechaderechaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fechaderechaMouseClicked
        flechas();
    }//GEN-LAST:event_fechaderechaMouseClicked

    private void fechaizquierdaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fechaizquierdaMouseClicked

        //pre empleooooooooooooooooooooo
        if (DatosPrincipales.getTipoExamen().equals("Pre-empleo")) {
            if (estsalud.isEnabled() && !daper.isEnabled()) {
                estsalud.setVisible(false);
                estsalud.setEnabled(false);
                daper.setVisible(true);
                daper.setEnabled(true);
                DatoGeneral.fechaizquierda.setVisible(false);
                DatoGeneral.fechaderecha.setVisible(true);
                validarColor();
                DatoGeneral.jLabel2.setForeground(Color.red);

            } else if (inforfami.isEnabled() && !estsalud.isEnabled()) {

                inforfami.setVisible(false);
                inforfami.setEnabled(false);
                estsalud.setVisible(true);
                estsalud.setEnabled(true);
                validarColor();
                jLabel3.setForeground(Color.red);
                DatoGeneral.fechaizquierda.setVisible(true);
                DatoGeneral.fechaderecha.setVisible(true);
            } else if (infoaca.isEnabled() && !inforfami.isEnabled()) {

                infoaca.setVisible(false);
                infoaca.setEnabled(false);
                inforfami.setVisible(true);
                inforfami.setEnabled(true);
                DatoGeneral.fechaizquierda.setVisible(true);
                DatoGeneral.fechaderecha.setVisible(true);
                validarColor();
                jLabel4.setForeground(Color.red);
            } else if (infofinan.isEnabled() && !infoaca.isEnabled()) {

                infofinan.setVisible(false);
                infofinan.setEnabled(false);
                infoaca.setVisible(true);
                infoaca.setEnabled(true);
                DatoGeneral.fechaizquierda.setVisible(true);
                DatoGeneral.fechaderecha.setVisible(true);
                validarColor();
                jLabel10.setForeground(Color.red);
            } else if (casino.isEnabled() && !infofinan.isEnabled()) {

                casino.setVisible(false);
                casino.setEnabled(false);
                infofinan.setVisible(true);
                infofinan.setEnabled(true);
                DatoGeneral.fechaizquierda.setVisible(true);
                DatoGeneral.fechaderecha.setVisible(true);
                validarColor();
                jLabel5.setForeground(Color.red);
            } else if (consbebidas.isEnabled() && !casino.isEnabled()) {

                consbebidas.setVisible(false);
                consbebidas.setEnabled(false);
                casino.setVisible(true);
                casino.setEnabled(true);
                DatoGeneral.fechaizquierda.setVisible(true);
                DatoGeneral.fechaderecha.setVisible(true);
                validarColor();
                jLabel13.setForeground(Color.red);
            } else if (consustan.isEnabled() && !consbebidas.isEnabled()) {
                consustan.setVisible(false);
                consustan.setEnabled(false);
                consbebidas.setVisible(true);
                consbebidas.setEnabled(true);
                DatoGeneral.fechaizquierda.setVisible(true);
                DatoGeneral.fechaderecha.setVisible(true);
                validarColor();
                jLabel6.setForeground(Color.red);
            } else if (antece.isEnabled() && !consustan.isEnabled()) {
                antece.setVisible(false);
                antece.setEnabled(false);
                consustan.setVisible(true);
                consustan.setEnabled(true);
                DatoGeneral.fechaizquierda.setVisible(true);
                DatoGeneral.fechaderecha.setVisible(true);
                validarColor();
                jLabel7.setForeground(Color.red);
            } else if (vinculos.isEnabled() && !antece.isEnabled()) {
                vinculos.setVisible(false);
                vinculos.setEnabled(false);
                antece.setVisible(true);
                antece.setEnabled(true);
                DatoGeneral.fechaizquierda.setVisible(true);
                DatoGeneral.fechaderecha.setVisible(true);
                validarColor();
                jLabel8.setForeground(Color.red);
            } else if (falsifi.isEnabled() && !vinculos.isEnabled()) {
                falsifi.setVisible(false);
                falsifi.setEnabled(false);
                vinculos.setVisible(true);
                vinculos.setEnabled(true);
                fechaderecha.setVisible(true);
                DatoGeneral.fechaizquierda.setVisible(true);
                validarColor();
                jLabel9.setForeground(Color.red);
            } else if (histlabo.isEnabled() && !falsifi.isEnabled()) {
                histlabo.setVisible(false);
                histlabo.setEnabled(false);
                falsifi.setVisible(true);
                falsifi.setEnabled(true);
                DatoGeneral.fechaizquierda.setVisible(true);
                DatoGeneral.fechaderecha.setVisible(true);
                validarColor();
                jLabel11.setForeground(Color.red);
            } else if (planinfil.isEnabled() && !histlabo.isEnabled()) {
                planinfil.setVisible(false);
                planinfil.setEnabled(false);
                histlabo.setVisible(true);
                histlabo.setEnabled(true);
                DatoGeneral.fechaizquierda.setVisible(true);
                DatoGeneral.fechaderecha.setVisible(true);
                DatoGeneral.fechaderecha.setVisible(true);
                validarColor();
                jLabel12.setForeground(Color.red);
            } else if (tecp.isEnabled()) {
                tecp.setVisible(false);
                tecp.setEnabled(false);
                planinfil.setVisible(true);
                planinfil.setEnabled(true);
                fechaderecha.setVisible(true);
                DatoGeneral.fechaizquierda.setVisible(true);
                validarColor();
                jLabel14.setForeground(Color.red);
            }
        } else //Rutina operacioneeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeees
        if (DatosPrincipales.getTipoExamen().equals("Rutina (operaciones)")) {
            if (estsalud.isEnabled() && !daper.isEnabled()) {
                estsalud.setVisible(false);
                estsalud.setEnabled(false);
                daper.setVisible(true);
                daper.setEnabled(true);
                DatoGeneral.fechaizquierda.setVisible(false);
                DatoGeneral.fechaderecha.setVisible(true);
                validarColor();
                DatoGeneral.jLabel2.setForeground(Color.red);

            } else if (inforfami.isEnabled() && !estsalud.isEnabled()) {

                inforfami.setVisible(false);
                inforfami.setEnabled(false);
                estsalud.setVisible(true);
                estsalud.setEnabled(true);
                validarColor();
                jLabel3.setForeground(Color.red);
                DatoGeneral.fechaizquierda.setVisible(true);
                DatoGeneral.fechaderecha.setVisible(true);
            } else if (infoaca.isEnabled() && !inforfami.isEnabled()) {

                infoaca.setVisible(false);
                infoaca.setEnabled(false);
                inforfami.setVisible(true);
                inforfami.setEnabled(true);
                DatoGeneral.fechaizquierda.setVisible(true);
                DatoGeneral.fechaderecha.setVisible(true);
                validarColor();
                jLabel4.setForeground(Color.red);
            } else if (infofinan.isEnabled() && !infoaca.isEnabled()) {

                infofinan.setVisible(false);
                infofinan.setEnabled(false);
                infoaca.setVisible(true);
                infoaca.setEnabled(true);
                DatoGeneral.fechaizquierda.setVisible(true);
                DatoGeneral.fechaderecha.setVisible(true);
                validarColor();
                jLabel10.setForeground(Color.red);
            } else if (casino.isEnabled() && !infofinan.isEnabled()) {

                casino.setVisible(false);
                casino.setEnabled(false);
                infofinan.setVisible(true);
                infofinan.setEnabled(true);
                DatoGeneral.fechaizquierda.setVisible(true);
                DatoGeneral.fechaderecha.setVisible(true);
                validarColor();
                jLabel5.setForeground(Color.red);
            } else if (consbebidas.isEnabled() && !casino.isEnabled()) {

                consbebidas.setVisible(false);
                consbebidas.setEnabled(false);
                casino.setVisible(true);
                casino.setEnabled(true);
                DatoGeneral.fechaizquierda.setVisible(true);
                DatoGeneral.fechaderecha.setVisible(true);
                validarColor();
                jLabel13.setForeground(Color.red);
            } else if (consustan.isEnabled() && !consbebidas.isEnabled()) {
                consustan.setVisible(false);
                consustan.setEnabled(false);
                consbebidas.setVisible(true);
                consbebidas.setEnabled(true);
                DatoGeneral.fechaizquierda.setVisible(true);
                DatoGeneral.fechaderecha.setVisible(true);
                validarColor();
                jLabel6.setForeground(Color.red);
            } else if (antece.isEnabled() && !consustan.isEnabled()) {
                antece.setVisible(false);
                antece.setEnabled(false);
                consustan.setVisible(true);
                consustan.setEnabled(true);
                DatoGeneral.fechaizquierda.setVisible(true);
                DatoGeneral.fechaderecha.setVisible(true);
                validarColor();
                jLabel7.setForeground(Color.red);
            } else if (vinculos.isEnabled() && !antece.isEnabled()) {
                vinculos.setVisible(false);
                vinculos.setEnabled(false);
                antece.setVisible(true);
                antece.setEnabled(true);
                DatoGeneral.fechaizquierda.setVisible(true);
                DatoGeneral.fechaderecha.setVisible(true);
                validarColor();
                jLabel8.setForeground(Color.red);
            } else if (falsifi.isEnabled() && !vinculos.isEnabled()) {
                falsifi.setVisible(false);
                falsifi.setEnabled(false);
                vinculos.setVisible(true);
                vinculos.setEnabled(true);
                fechaderecha.setVisible(true);
                DatoGeneral.fechaizquierda.setVisible(true);
                validarColor();
                jLabel9.setForeground(Color.red);
            } else if (tecp.isEnabled()) {
                tecp.setVisible(false);
                tecp.setEnabled(false);
                falsifi.setVisible(true);
                falsifi.setEnabled(true);
                fechaderecha.setVisible(true);
                DatoGeneral.fechaizquierda.setVisible(true);
                validarColor();
                jLabel14.setForeground(Color.red);
            }
        } else //Rutina operacioneeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeees
        if (DatosPrincipales.getTipoExamen().equals("Rutina (admitivos)")) {
            if (estsalud.isEnabled() && !daper.isEnabled()) {
                estsalud.setVisible(false);
                estsalud.setEnabled(false);
                daper.setVisible(true);
                daper.setEnabled(true);
                DatoGeneral.fechaizquierda.setVisible(false);
                DatoGeneral.fechaderecha.setVisible(true);
                validarColor();
                DatoGeneral.jLabel2.setForeground(Color.red);

            } else if (inforfami.isEnabled() && !estsalud.isEnabled()) {

                inforfami.setVisible(false);
                inforfami.setEnabled(false);
                estsalud.setVisible(true);
                estsalud.setEnabled(true);
                validarColor();
                jLabel3.setForeground(Color.red);
                DatoGeneral.fechaizquierda.setVisible(true);
                DatoGeneral.fechaderecha.setVisible(true);
            } else if (infoaca.isEnabled() && !inforfami.isEnabled()) {

                infoaca.setVisible(false);
                infoaca.setEnabled(false);
                inforfami.setVisible(true);
                inforfami.setEnabled(true);
                DatoGeneral.fechaizquierda.setVisible(true);
                DatoGeneral.fechaderecha.setVisible(true);
                validarColor();
                jLabel4.setForeground(Color.red);
            } else if (infofinan.isEnabled() && !infoaca.isEnabled()) {

                infofinan.setVisible(false);
                infofinan.setEnabled(false);
                infoaca.setVisible(true);
                infoaca.setEnabled(true);
                DatoGeneral.fechaizquierda.setVisible(true);
                DatoGeneral.fechaderecha.setVisible(true);
                validarColor();
                jLabel10.setForeground(Color.red);
            } else if (casino.isEnabled() && !infofinan.isEnabled()) {

                casino.setVisible(false);
                casino.setEnabled(false);
                infofinan.setVisible(true);
                infofinan.setEnabled(true);
                DatoGeneral.fechaizquierda.setVisible(true);
                DatoGeneral.fechaderecha.setVisible(true);
                validarColor();
                jLabel5.setForeground(Color.red);
            } else if (consbebidas.isEnabled() && !casino.isEnabled()) {

                consbebidas.setVisible(false);
                consbebidas.setEnabled(false);
                casino.setVisible(true);
                casino.setEnabled(true);
                DatoGeneral.fechaizquierda.setVisible(true);
                DatoGeneral.fechaderecha.setVisible(true);
                validarColor();
                jLabel13.setForeground(Color.red);
            } else if (consustan.isEnabled() && !consbebidas.isEnabled()) {
                consustan.setVisible(false);
                consustan.setEnabled(false);
                consbebidas.setVisible(true);
                consbebidas.setEnabled(true);
                DatoGeneral.fechaizquierda.setVisible(true);
                DatoGeneral.fechaderecha.setVisible(true);
                validarColor();
                jLabel6.setForeground(Color.red);
            } else if (antece.isEnabled() && !consustan.isEnabled()) {
                antece.setVisible(false);
                antece.setEnabled(false);
                consustan.setVisible(true);
                consustan.setEnabled(true);
                DatoGeneral.fechaizquierda.setVisible(true);
                DatoGeneral.fechaderecha.setVisible(true);
                validarColor();
                jLabel7.setForeground(Color.red);
            } else if (vinculos.isEnabled() && !antece.isEnabled()) {
                vinculos.setVisible(false);
                vinculos.setEnabled(false);
                antece.setVisible(true);
                antece.setEnabled(true);
                DatoGeneral.fechaizquierda.setVisible(true);
                DatoGeneral.fechaderecha.setVisible(true);
                validarColor();
                jLabel8.setForeground(Color.red);
            } else if (falsifi.isEnabled() && !vinculos.isEnabled()) {
                falsifi.setVisible(false);
                falsifi.setEnabled(false);
                vinculos.setVisible(true);
                vinculos.setEnabled(true);
                fechaderecha.setVisible(true);
                DatoGeneral.fechaizquierda.setVisible(true);
                validarColor();
                jLabel9.setForeground(Color.red);
            } else if (tecp.isEnabled()) {
                tecp.setVisible(false);
                tecp.setEnabled(false);
                falsifi.setVisible(true);
                falsifi.setEnabled(true);
                fechaderecha.setVisible(true);
                DatoGeneral.fechaizquierda.setVisible(true);
                validarColor();
                jLabel14.setForeground(Color.red);
            }
        } else //Especificooooooooooooooooooooooooooooooooooooooooooo
        if (DatosPrincipales.getTipoExamen().equals("Específico")) {
            if (estsalud.isEnabled() && !daper.isEnabled()) {
                estsalud.setVisible(false);
                estsalud.setEnabled(false);
                daper.setVisible(true);
                daper.setEnabled(true);
                DatoGeneral.fechaizquierda.setVisible(false);
                DatoGeneral.fechaderecha.setVisible(true);
                validarColor();
                DatoGeneral.jLabel2.setForeground(Color.red);

            } else if (inforfami.isEnabled() && !estsalud.isEnabled()) {

                inforfami.setVisible(false);
                inforfami.setEnabled(false);
                estsalud.setVisible(true);
                estsalud.setEnabled(true);
                validarColor();
                jLabel3.setForeground(Color.red);
                DatoGeneral.fechaizquierda.setVisible(true);
                DatoGeneral.fechaderecha.setVisible(true);
            } else if (infoaca.isEnabled() && !inforfami.isEnabled()) {

                infoaca.setVisible(false);
                infoaca.setEnabled(false);
                inforfami.setVisible(true);
                inforfami.setEnabled(true);
                DatoGeneral.fechaizquierda.setVisible(true);
                DatoGeneral.fechaderecha.setVisible(true);
                validarColor();
                jLabel4.setForeground(Color.red);
            } else if (infofinan.isEnabled() && !infoaca.isEnabled()) {

                infofinan.setVisible(false);
                infofinan.setEnabled(false);
                infoaca.setVisible(true);
                infoaca.setEnabled(true);
                DatoGeneral.fechaizquierda.setVisible(true);
                DatoGeneral.fechaderecha.setVisible(true);
                validarColor();
                jLabel10.setForeground(Color.red);
            } else if (consbebidas.isEnabled() && !infofinan.isEnabled()) {

                consbebidas.setVisible(false);
                consbebidas.setEnabled(false);
                infofinan.setVisible(true);
                infofinan.setEnabled(true);
                DatoGeneral.fechaizquierda.setVisible(true);
                DatoGeneral.fechaderecha.setVisible(true);
                validarColor();
                jLabel5.setForeground(Color.red);
            } else if (consustan.isEnabled() && !consbebidas.isEnabled()) {
                consustan.setVisible(false);
                consustan.setEnabled(false);
                consbebidas.setVisible(true);
                consbebidas.setEnabled(true);
                DatoGeneral.fechaizquierda.setVisible(true);
                DatoGeneral.fechaderecha.setVisible(true);
                validarColor();
                jLabel6.setForeground(Color.red);
            } else if (antece.isEnabled() && !consustan.isEnabled()) {
                antece.setVisible(false);
                antece.setEnabled(false);
                consustan.setVisible(true);
                consustan.setEnabled(true);
                DatoGeneral.fechaizquierda.setVisible(true);
                DatoGeneral.fechaderecha.setVisible(true);
                validarColor();
                jLabel7.setForeground(Color.red);
            } else if (vinculos.isEnabled() && !antece.isEnabled()) {
                vinculos.setVisible(false);
                vinculos.setEnabled(false);
                antece.setVisible(true);
                antece.setEnabled(true);
                DatoGeneral.fechaizquierda.setVisible(true);
                DatoGeneral.fechaderecha.setVisible(true);
                validarColor();
                jLabel8.setForeground(Color.red);
            } else if (temain.isEnabled() && !vinculos.isEnabled()) {
                temain.setVisible(false);
                temain.setEnabled(false);
                vinculos.setVisible(true);
                vinculos.setEnabled(true);
                fechaderecha.setVisible(true);
                DatoGeneral.fechaizquierda.setVisible(true);
                validarColor();
                jLabel9.setForeground(Color.red);
            } else if (tecp.isEnabled()) {
                tecp.setVisible(false);
                tecp.setEnabled(false);
                temain.setVisible(true);
                temain.setEnabled(true);
                fechaderecha.setVisible(true);
                DatoGeneral.fechaizquierda.setVisible(true);
                validarColor();
                jLabel18.setForeground(Color.red);
            }
        }
    }//GEN-LAST:event_fechaizquierdaMouseClicked

    private void jLabel68MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel68MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel68MouseEntered

    private void btncancelarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncancelarMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btncancelarMouseEntered

    private void btnsaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsaveMouseClicked
        guardarexamen();
    }//GEN-LAST:event_btnsaveMouseClicked

    private void btndescargarexamenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btndescargarexamenMouseClicked
        try {
            aex.verExamen();

        } catch (IOException ex) {
            Logger.getLogger(DatoGeneral.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btndescargarexamenMouseClicked

    private void jLabel81MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel81MouseClicked
        try {
            aex.verExamen();

        } catch (IOException ex) {
            Logger.getLogger(DatoGeneral.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabel81MouseClicked

    private void jLabel82MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel82MouseClicked
        try {
            aex.verExamen();

        } catch (IOException ex) {
            Logger.getLogger(DatoGeneral.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabel82MouseClicked

    private void jLabel58MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel58MouseClicked
        try {
            aex.verExamen();

        } catch (IOException ex) {
            Logger.getLogger(DatoGeneral.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabel58MouseClicked

    private void jLabel51MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel51MouseClicked
        guardarexamen();
    }//GEN-LAST:event_jLabel51MouseClicked

    private void jLabel68MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel68MouseClicked
        cancelarexamen();
    }//GEN-LAST:event_jLabel68MouseClicked

    private void btneditarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btneditarMouseMoved
        btneditar.setBackground(Color.decode("#06007d"));
    }//GEN-LAST:event_btneditarMouseMoved

    private void btneditarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btneditarMouseExited
        btneditar.setBackground(Color.BLUE);
    }//GEN-LAST:event_btneditarMouseExited

    private void btneditarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btneditarMouseClicked
        int changeexam = JOptionPane.showConfirmDialog(null, "¿Está seguro de actualizar los datos del examen?\nRecuerde que debe volver a cargar la foto al formulario y el examen al sistema web", "Actualizar examen", JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE);
        if (changeexam == 0) {

        }
    }//GEN-LAST:event_btneditarMouseClicked

    private void btnTerminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTerminarActionPerformed

//        this.setVisible(false);
//        MenuPrincipal.jPanel10.setVisible(true);
//        MenuPrincipal.jPanel9.setVisible(true);
//
//        DatoGeneral.paratodo.removeAll();
//        MenuPrincipal.na.remove(this);
//        limpiarTodo();
        tecp.finalizarExamen();
        if (TecnicaYPreguntas.getFinalizar().equals("Sí")) {
            terminarExamen();
        } else {
            System.out.println("por puto no se finaliza");
        }

    }//GEN-LAST:event_btnTerminarActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        //pre empleooooooooooooooooooooo

        if (DatosPrincipales.getTipoExamen().equals("Pre-empleo")) {
            if (daper.isEnabled()) {
                JOptionPane.showMessageDialog(null, "¡Ya se encuentra en uso!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);

            } else if (estsalud.isEnabled()) {

                estsalud.setVisible(false);
                estsalud.setEnabled(false);
                daper.setVisible(true);
                daper.setEnabled(true);
                DatoGeneral.fechaizquierda.setVisible(false);
                DatoGeneral.fechaderecha.setVisible(true);
                validarColor();
                jLabel2.setForeground(Color.red);

            } else if (inforfami.isEnabled()) {

                inforfami.setVisible(false);
                inforfami.setEnabled(false);
                daper.setVisible(true);
                daper.setEnabled(true);
                DatoGeneral.fechaizquierda.setVisible(false);
                DatoGeneral.fechaderecha.setVisible(true);
                validarColor();
                jLabel2.setForeground(Color.red);

            } else if (infoaca.isEnabled()) {

                infoaca.setVisible(false);
                infoaca.setEnabled(false);
                daper.setVisible(true);
                daper.setEnabled(true);
                DatoGeneral.fechaizquierda.setVisible(false);
                DatoGeneral.fechaderecha.setVisible(true);
                validarColor();
                jLabel2.setForeground(Color.red);

            } else if (infofinan.isEnabled()) {

                infofinan.setVisible(false);
                infofinan.setEnabled(false);
                daper.setVisible(true);
                daper.setEnabled(true);
                DatoGeneral.fechaizquierda.setVisible(false);
                DatoGeneral.fechaderecha.setVisible(true);
                validarColor();
                jLabel2.setForeground(Color.red);

            } else if (casino.isEnabled()) {

                casino.setVisible(false);
                casino.setEnabled(false);
                daper.setVisible(true);
                daper.setEnabled(true);
                DatoGeneral.fechaizquierda.setVisible(false);
                DatoGeneral.fechaderecha.setVisible(true);
                validarColor();
                jLabel2.setForeground(Color.red);

            } else if (consbebidas.isEnabled()) {

                consustan.ValidacionTipoExamen();
                consbebidas.setVisible(false);
                consbebidas.setEnabled(false);
                daper.setVisible(true);
                daper.setEnabled(true);
                DatoGeneral.fechaizquierda.setVisible(false);
                DatoGeneral.fechaderecha.setVisible(true);
                validarColor();
                jLabel2.setForeground(Color.red);

            } else if (consustan.isEnabled()) {

                consustan.setVisible(false);
                consustan.setEnabled(false);
                daper.setVisible(true);
                daper.setEnabled(true);
                DatoGeneral.fechaizquierda.setVisible(false);
                DatoGeneral.fechaderecha.setVisible(true);
                validarColor();
                jLabel2.setForeground(Color.red);

            } else if (antece.isEnabled()) {

                antece.setVisible(false);
                antece.setEnabled(false);
                daper.setVisible(true);
                daper.setEnabled(true);
                DatoGeneral.fechaizquierda.setVisible(false);
                DatoGeneral.fechaderecha.setVisible(true);
                validarColor();
                jLabel2.setForeground(Color.red);

            } else if (vinculos.isEnabled()) {

                vinculos.setVisible(false);
                vinculos.setEnabled(false);
                falsifi.ValidacionTipoExamen();
                daper.setVisible(true);
                daper.setEnabled(true);
                DatoGeneral.fechaizquierda.setVisible(false);
                DatoGeneral.fechaderecha.setVisible(true);
                validarColor();
                jLabel2.setForeground(Color.red);

            } else if (falsifi.isEnabled()) {

                falsifi.setVisible(false);
                falsifi.setEnabled(false);
                histlabo.ValidacionTipoExamen();
                daper.setVisible(true);
                daper.setEnabled(true);
                DatoGeneral.fechaizquierda.setVisible(false);
                DatoGeneral.fechaderecha.setVisible(true);
                validarColor();
                jLabel2.setForeground(Color.red);

            } else if (histlabo.isEnabled()) {

                histlabo.setVisible(false);
                histlabo.setEnabled(false);
                daper.setVisible(true);
                daper.setEnabled(true);
                DatoGeneral.fechaizquierda.setVisible(false);
                DatoGeneral.fechaderecha.setVisible(true);
                validarColor();
                jLabel2.setForeground(Color.red);

            } else if (planinfil.isEnabled()) {

                tecp.setVisible(true);
                tecp.setEnabled(true);
                daper.setVisible(true);
                daper.setEnabled(true);
                DatoGeneral.fechaizquierda.setVisible(false);
                DatoGeneral.fechaderecha.setVisible(true);
                validarColor();
                jLabel2.setForeground(Color.red);

            }
        } else //Rutina operacioneeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeees
        if (DatosPrincipales.getTipoExamen().equals("Rutina (operaciones)")) {
            if (daper.isEnabled()) {
                JOptionPane.showMessageDialog(null, "¡Ya se encuentra en uso!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);

            } else if (estsalud.isEnabled()) {

                estsalud.setVisible(false);
                estsalud.setEnabled(false);
                daper.setVisible(true);
                daper.setEnabled(true);
                DatoGeneral.fechaizquierda.setVisible(false);
                DatoGeneral.fechaderecha.setVisible(true);
                validarColor();
                jLabel2.setForeground(Color.red);

            } else if (inforfami.isEnabled()) {

                inforfami.setVisible(false);
                inforfami.setEnabled(false);
                daper.setVisible(true);
                daper.setEnabled(true);
                DatoGeneral.fechaizquierda.setVisible(false);
                DatoGeneral.fechaderecha.setVisible(true);
                validarColor();
                jLabel2.setForeground(Color.red);

            } else if (infoaca.isEnabled()) {

                infoaca.setVisible(false);
                infoaca.setEnabled(false);
                daper.setVisible(true);
                daper.setEnabled(true);
                DatoGeneral.fechaizquierda.setVisible(false);
                DatoGeneral.fechaderecha.setVisible(true);
                validarColor();
                jLabel2.setForeground(Color.red);

            } else if (infofinan.isEnabled()) {

                infofinan.setVisible(false);
                infofinan.setEnabled(false);
                daper.setVisible(true);
                daper.setEnabled(true);
                DatoGeneral.fechaizquierda.setVisible(false);
                DatoGeneral.fechaderecha.setVisible(true);
                validarColor();
                jLabel2.setForeground(Color.red);

            } else if (casino.isEnabled()) {

                casino.setVisible(false);
                casino.setEnabled(false);
                daper.setVisible(true);
                daper.setEnabled(true);
                DatoGeneral.fechaizquierda.setVisible(false);
                DatoGeneral.fechaderecha.setVisible(true);
                validarColor();
                jLabel2.setForeground(Color.red);

            } else if (consbebidas.isEnabled()) {

                consustan.ValidacionTipoExamen();
                consbebidas.setVisible(false);
                consbebidas.setEnabled(false);
                daper.setVisible(true);
                daper.setEnabled(true);
                DatoGeneral.fechaizquierda.setVisible(false);
                DatoGeneral.fechaderecha.setVisible(true);
                validarColor();
                jLabel2.setForeground(Color.red);

            } else if (consustan.isEnabled()) {

                consustan.setVisible(false);
                consustan.setEnabled(false);
                daper.setVisible(true);
                daper.setEnabled(true);
                DatoGeneral.fechaizquierda.setVisible(false);
                DatoGeneral.fechaderecha.setVisible(true);
                validarColor();
                jLabel2.setForeground(Color.red);

            } else if (antece.isEnabled()) {

                antece.setVisible(false);
                antece.setEnabled(false);
                daper.setVisible(true);
                daper.setEnabled(true);
                DatoGeneral.fechaizquierda.setVisible(false);
                DatoGeneral.fechaderecha.setVisible(true);
                validarColor();
                jLabel2.setForeground(Color.red);

            } else if (vinculos.isEnabled()) {

                vinculos.setVisible(false);
                vinculos.setEnabled(false);
                falsifi.ValidacionTipoExamen();
                daper.setVisible(true);
                daper.setEnabled(true);
                DatoGeneral.fechaizquierda.setVisible(false);
                DatoGeneral.fechaderecha.setVisible(true);
                validarColor();
                jLabel2.setForeground(Color.red);

            } else if (falsifi.isEnabled()) {

                falsifi.setVisible(false);
                falsifi.setEnabled(false);
//                        tecp.ValidacionTipoExamen();
                daper.setVisible(true);
                daper.setEnabled(true);
                DatoGeneral.fechaizquierda.setVisible(false);
                DatoGeneral.fechaderecha.setVisible(true);
                validarColor();
                jLabel2.setForeground(Color.red);
            }
        } else //Rutina administrativooooooooooooooooooooooooooooooooooooooooooooooos
        if (DatosPrincipales.getTipoExamen().equals("Rutina (admitivos)")) {
            if (daper.isEnabled()) {
                JOptionPane.showMessageDialog(null, "¡Ya se encuentra en uso!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);

            } else if (estsalud.isEnabled()) {

                estsalud.setVisible(false);
                estsalud.setEnabled(false);
                daper.setVisible(true);
                daper.setEnabled(true);
                DatoGeneral.fechaizquierda.setVisible(false);
                DatoGeneral.fechaderecha.setVisible(true);
                validarColor();
                jLabel2.setForeground(Color.red);

            } else if (inforfami.isEnabled()) {

                inforfami.setVisible(false);
                inforfami.setEnabled(false);
                daper.setVisible(true);
                daper.setEnabled(true);
                DatoGeneral.fechaizquierda.setVisible(false);
                DatoGeneral.fechaderecha.setVisible(true);
                validarColor();
                jLabel2.setForeground(Color.red);

            } else if (infoaca.isEnabled()) {

                infoaca.setVisible(false);
                infoaca.setEnabled(false);
                daper.setVisible(true);
                daper.setEnabled(true);
                DatoGeneral.fechaizquierda.setVisible(false);
                DatoGeneral.fechaderecha.setVisible(true);
                validarColor();
                jLabel2.setForeground(Color.red);

            } else if (infofinan.isEnabled()) {

                infofinan.setVisible(false);
                infofinan.setEnabled(false);
                daper.setVisible(true);
                daper.setEnabled(true);
                DatoGeneral.fechaizquierda.setVisible(false);
                DatoGeneral.fechaderecha.setVisible(true);
                validarColor();
                jLabel2.setForeground(Color.red);

            } else if (casino.isEnabled()) {

                casino.setVisible(false);
                casino.setEnabled(false);
                daper.setVisible(true);
                daper.setEnabled(true);
                DatoGeneral.fechaizquierda.setVisible(false);
                DatoGeneral.fechaderecha.setVisible(true);
                validarColor();
                jLabel2.setForeground(Color.red);

            } else if (consbebidas.isEnabled()) {

                consustan.ValidacionTipoExamen();
                consbebidas.setVisible(false);
                consbebidas.setEnabled(false);
                daper.setVisible(true);
                daper.setEnabled(true);
                DatoGeneral.fechaizquierda.setVisible(false);
                DatoGeneral.fechaderecha.setVisible(true);
                validarColor();
                jLabel2.setForeground(Color.red);

            } else if (consustan.isEnabled()) {

                consustan.setVisible(false);
                consustan.setEnabled(false);
                daper.setVisible(true);
                daper.setEnabled(true);
                DatoGeneral.fechaizquierda.setVisible(false);
                DatoGeneral.fechaderecha.setVisible(true);
                validarColor();
                jLabel2.setForeground(Color.red);

            } else if (antece.isEnabled()) {

                antece.setVisible(false);
                antece.setEnabled(false);
                daper.setVisible(true);
                daper.setEnabled(true);
                DatoGeneral.fechaizquierda.setVisible(false);
                DatoGeneral.fechaderecha.setVisible(true);
                validarColor();
                jLabel2.setForeground(Color.red);

            } else if (vinculos.isEnabled()) {

                vinculos.setVisible(false);
                vinculos.setEnabled(false);
                daper.setVisible(true);
                daper.setEnabled(true);
                DatoGeneral.fechaizquierda.setVisible(false);
                DatoGeneral.fechaderecha.setVisible(true);
                validarColor();
                jLabel2.setForeground(Color.red);

            } else if (falsifi.isEnabled()) {

                falsifi.setVisible(false);
                falsifi.setEnabled(false);
                histlabo.ValidacionTipoExamen();
                daper.setVisible(true);
                daper.setEnabled(true);
                DatoGeneral.fechaizquierda.setVisible(false);
                DatoGeneral.fechaderecha.setVisible(true);
                validarColor();
                jLabel2.setForeground(Color.red);

            } else if (histlabo.isEnabled()) {

                histlabo.setVisible(false);
                histlabo.setEnabled(false);
                daper.setVisible(true);
                daper.setEnabled(true);
                DatoGeneral.fechaizquierda.setVisible(false);
                DatoGeneral.fechaderecha.setVisible(true);
                validarColor();
                jLabel2.setForeground(Color.red);

            } else if (planinfil.isEnabled()) {

                tecp.setVisible(true);
                tecp.setEnabled(true);
                daper.setVisible(true);
                daper.setEnabled(true);
                DatoGeneral.fechaizquierda.setVisible(false);
                DatoGeneral.fechaderecha.setVisible(true);
                validarColor();
                jLabel2.setForeground(Color.red);
            }
        } else //Especificooooooooooooooooooooooooooooooooooooooooooo
        if (DatosPrincipales.getTipoExamen().equals("Específico")) {
            if (daper.isEnabled()) {
                JOptionPane.showMessageDialog(null, "¡Ya se encuentra en uso!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);

            } else if (estsalud.isEnabled()) {

                estsalud.setVisible(false);
                estsalud.setEnabled(false);
                daper.setVisible(true);
                daper.setEnabled(true);
                DatoGeneral.fechaizquierda.setVisible(false);
                DatoGeneral.fechaderecha.setVisible(true);
                validarColor();
                jLabel2.setForeground(Color.red);

            } else if (inforfami.isEnabled()) {

                inforfami.setVisible(false);
                inforfami.setEnabled(false);
                daper.setVisible(true);
                daper.setEnabled(true);
                DatoGeneral.fechaizquierda.setVisible(false);
                DatoGeneral.fechaderecha.setVisible(true);
                validarColor();
                jLabel2.setForeground(Color.red);

            } else if (infoaca.isEnabled()) {

                infoaca.setVisible(false);
                infoaca.setEnabled(false);
                daper.setVisible(true);
                daper.setEnabled(true);
                DatoGeneral.fechaizquierda.setVisible(false);
                DatoGeneral.fechaderecha.setVisible(true);
                validarColor();
                jLabel2.setForeground(Color.red);

            } else if (infofinan.isEnabled()) {

                infofinan.setVisible(false);
                infofinan.setEnabled(false);
                daper.setVisible(true);
                daper.setEnabled(true);
                DatoGeneral.fechaizquierda.setVisible(false);
                DatoGeneral.fechaderecha.setVisible(true);
                validarColor();
                jLabel2.setForeground(Color.red);

            } else if (consbebidas.isEnabled()) {

                consustan.ValidacionTipoExamen();
                consbebidas.setVisible(false);
                consbebidas.setEnabled(false);
                daper.setVisible(true);
                daper.setEnabled(true);
                DatoGeneral.fechaizquierda.setVisible(false);
                DatoGeneral.fechaderecha.setVisible(true);
                validarColor();
                jLabel2.setForeground(Color.red);

            } else if (consustan.isEnabled()) {

                consustan.setVisible(false);
                consustan.setEnabled(false);
                daper.setVisible(true);
                daper.setEnabled(true);
                DatoGeneral.fechaizquierda.setVisible(false);
                DatoGeneral.fechaderecha.setVisible(true);
                validarColor();
                jLabel2.setForeground(Color.red);

            } else if (antece.isEnabled()) {

                antece.setVisible(false);
                antece.setEnabled(false);
                daper.setVisible(true);
                daper.setEnabled(true);
                DatoGeneral.fechaizquierda.setVisible(false);
                DatoGeneral.fechaderecha.setVisible(true);
                validarColor();
                jLabel2.setForeground(Color.red);

            } else if (vinculos.isEnabled()) {

                vinculos.setVisible(false);
                vinculos.setEnabled(false);
                daper.setVisible(true);
                daper.setEnabled(true);
                DatoGeneral.fechaizquierda.setVisible(false);
                DatoGeneral.fechaderecha.setVisible(true);
                validarColor();
                jLabel2.setForeground(Color.red);

            } else if (temain.isEnabled()) {

                temain.setVisible(false);
                temain.setEnabled(false);
                daper.setVisible(true);
                daper.setEnabled(true);
                DatoGeneral.fechaizquierda.setVisible(false);
                DatoGeneral.fechaderecha.setVisible(true);
                validarColor();
                jLabel2.setForeground(Color.red);
            }
        }
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        //pre empleooooooooooooooooooooo
        if (DatosPrincipales.getTipoExamen().equals("Pre-empleo")) {
            if (daper.isEnabled()) {
                Date fechavacia = DatoPersonal.fechanaci.getDate();
                int age = Integer.parseInt(DatosPersonales.getEdad());
                if (DatosPersonales.getEstrato().equals("-")) {
                    JOptionPane.showMessageDialog(null, "¡Seleccione el estrato del examinado!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                } else if (age < 17 || age > 70) {
                    JOptionPane.showMessageDialog(null, "¡La edad no se admite!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                } else if (DatoPersonal.cbxtipoiden.getSelectedItem().equals("Seleccione") || fechavacia == null || (DatoPersonal.txtnombre.getText().equals("") || "".equals(DatoPersonal.txtnombre.getText())) || (DatoPersonal.txtnoiden.getText().equals("") || "".equals(DatoPersonal.txtnoiden.getText())) || (DatoPersonal.txtexpedidos.getText().equals("") || "".equals(DatoPersonal.txtexpedidos.getText())) || (DatoPersonal.txtlugarnaci.getText().equals("") || "".equals(DatoPersonal.txtlugarnaci.getText())) || (DatoPersonal.txtdireccion.getText().equals("") || "".equals(DatoPersonal.txtdireccion.getText())) || (DatoPersonal.txtcargoaspira.getText().equals("") || "".equals(DatoPersonal.txtcargoaspira.getText())) || (DatoPersonal.txtareaaspira.getText().equals("") || "".equals(DatoPersonal.txtareaaspira.getText())) || (DatoPersonal.txtpersonasolicitante.getText().equals("") || "".equals(DatoPersonal.txtpersonasolicitante.getText())) || (DatoPersonal.txtcargosolicitante.getText().equals("") || "".equals(DatoPersonal.txtcargosolicitante.getText()))) {
                    JOptionPane.showMessageDialog(null, "¡Debe completar todos los parámetros para registrar los datos!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                } else if (DatosPersonales.getGenero().equals("-") || DatosPersonales.getGenero().equals("") || DatosPersonales.getGenero() == null) {
                    JOptionPane.showMessageDialog(null, "¡El género no ha sido seleccionado!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                } else {

                    nombreExamen();
                    nombreExamen.setText("Nombre examen: " + TecnicaYPreguntas.getNombreExamen());
                    DatosPersonales.setColorCategoria("con");
                    daper.setVisible(false);
                    daper.setEnabled(false);
                    estsalud.setVisible(true);
                    estsalud.setEnabled(true);
                    validarColor();
                    jLabel3.setForeground(Color.red);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    if ("noesvisible".equals(EstadoSalud.getVisibilidadflecha())) {
                        DatoGeneral.fechaderecha.setVisible(false);
                    } else if ("esvisible".equals(EstadoSalud.getVisibilidadflecha())) {
                        DatoGeneral.fechaderecha.setVisible(true);
                    }

                    if ("Sinconexion".equals(classes.Conexion.importante)) {
                        btnsave.setVisible(true);
                        DatosPersonales.setValidacionRegistro("registrado");
                    } else if ("Conconexion".equals(classes.Conexion.importante)) {
                        if ("nuevo".equals(DatosPrincipales.getOpcionExamen())) {
                            dp.update_datosper();
                            DatosPersonales.setValidacionRegistro("registrado");

                        }
                    }
                }
            } else if (estsalud.isEnabled()) {
                JOptionPane.showMessageDialog(null, "¡Ya se encuentra en uso!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);

            } else if (inforfami.isEnabled()) {

                inforfami.setVisible(false);
                inforfami.setEnabled(false);
                estsalud.setVisible(true);
                estsalud.setEnabled(true);
                validarColor();
                jLabel3.setForeground(Color.red);
                DatoGeneral.fechaizquierda.setVisible(true);
                if ("noesvisible".equals(EstadoSalud.getVisibilidadflecha())) {
                    DatoGeneral.fechaderecha.setVisible(false);
                } else if ("esvisible".equals(EstadoSalud.getVisibilidadflecha())) {
                    DatoGeneral.fechaderecha.setVisible(true);
                }

            } else if (infoaca.isEnabled()) {

                infoaca.setVisible(false);
                infoaca.setEnabled(false);
                estsalud.setVisible(true);
                estsalud.setEnabled(true);
                validarColor();
                jLabel3.setForeground(Color.red);
                DatoGeneral.fechaizquierda.setVisible(true);
                if ("noesvisible".equals(EstadoSalud.getVisibilidadflecha())) {
                    DatoGeneral.fechaderecha.setVisible(false);
                } else if ("esvisible".equals(EstadoSalud.getVisibilidadflecha())) {
                    DatoGeneral.fechaderecha.setVisible(true);
                }

            } else if (infofinan.isEnabled()) {

                infofinan.setVisible(false);
                infofinan.setEnabled(false);
                estsalud.setVisible(true);
                estsalud.setEnabled(true);
                validarColor();
                jLabel3.setForeground(Color.red);
                DatoGeneral.fechaizquierda.setVisible(true);
                if ("noesvisible".equals(EstadoSalud.getVisibilidadflecha())) {
                    DatoGeneral.fechaderecha.setVisible(false);
                } else if ("esvisible".equals(EstadoSalud.getVisibilidadflecha())) {
                    DatoGeneral.fechaderecha.setVisible(true);
                }

            } else if (casino.isEnabled()) {

                casino.setVisible(false);
                casino.setEnabled(false);
                estsalud.setVisible(true);
                estsalud.setEnabled(true);
                validarColor();
                jLabel3.setForeground(Color.red);
                DatoGeneral.fechaizquierda.setVisible(true);
                if ("noesvisible".equals(EstadoSalud.getVisibilidadflecha())) {
                    DatoGeneral.fechaderecha.setVisible(false);
                } else if ("esvisible".equals(EstadoSalud.getVisibilidadflecha())) {
                    DatoGeneral.fechaderecha.setVisible(true);
                }
            } else if (consbebidas.isEnabled()) {

                consustan.ValidacionTipoExamen();
                consbebidas.setVisible(false);
                consbebidas.setEnabled(false);
                estsalud.setVisible(true);
                estsalud.setEnabled(true);
                validarColor();
                jLabel3.setForeground(Color.red);
                DatoGeneral.fechaizquierda.setVisible(true);
                if ("noesvisible".equals(EstadoSalud.getVisibilidadflecha())) {
                    DatoGeneral.fechaderecha.setVisible(false);
                } else if ("esvisible".equals(EstadoSalud.getVisibilidadflecha())) {
                    DatoGeneral.fechaderecha.setVisible(true);
                }

            } else if (consustan.isEnabled()) {

                consustan.setVisible(false);
                consustan.setEnabled(false);
                estsalud.setVisible(true);
                estsalud.setEnabled(true);
                validarColor();
                jLabel3.setForeground(Color.red);
                DatoGeneral.fechaizquierda.setVisible(true);
                if ("noesvisible".equals(EstadoSalud.getVisibilidadflecha())) {
                    DatoGeneral.fechaderecha.setVisible(false);
                } else if ("esvisible".equals(EstadoSalud.getVisibilidadflecha())) {
                    DatoGeneral.fechaderecha.setVisible(true);
                }

            } else if (antece.isEnabled()) {

                antece.setVisible(false);
                antece.setEnabled(false);
                estsalud.setVisible(true);
                estsalud.setEnabled(true);
                validarColor();
                jLabel3.setForeground(Color.red);
                DatoGeneral.fechaizquierda.setVisible(true);
                if ("noesvisible".equals(EstadoSalud.getVisibilidadflecha())) {
                    DatoGeneral.fechaderecha.setVisible(false);
                } else if ("esvisible".equals(EstadoSalud.getVisibilidadflecha())) {
                    DatoGeneral.fechaderecha.setVisible(true);
                }

            } else if (vinculos.isEnabled()) {

                vinculos.setVisible(false);
                vinculos.setEnabled(false);
                falsifi.ValidacionTipoExamen();
                estsalud.setVisible(true);
                estsalud.setEnabled(true);
                validarColor();
                jLabel3.setForeground(Color.red);
                DatoGeneral.fechaizquierda.setVisible(true);
                if ("noesvisible".equals(EstadoSalud.getVisibilidadflecha())) {
                    DatoGeneral.fechaderecha.setVisible(false);
                } else if ("esvisible".equals(EstadoSalud.getVisibilidadflecha())) {
                    DatoGeneral.fechaderecha.setVisible(true);
                }

            } else if (falsifi.isEnabled()) {

                falsifi.setVisible(false);
                falsifi.setEnabled(false);
                histlabo.ValidacionTipoExamen();
                estsalud.setVisible(true);
                estsalud.setEnabled(true);
                validarColor();
                jLabel3.setForeground(Color.red);
                DatoGeneral.fechaizquierda.setVisible(true);
                if ("noesvisible".equals(EstadoSalud.getVisibilidadflecha())) {
                    DatoGeneral.fechaderecha.setVisible(false);
                } else if ("esvisible".equals(EstadoSalud.getVisibilidadflecha())) {
                    DatoGeneral.fechaderecha.setVisible(true);
                }
            } else if (histlabo.isEnabled()) {

                histlabo.setVisible(false);
                histlabo.setEnabled(false);
                estsalud.setVisible(true);
                estsalud.setEnabled(true);
                validarColor();
                jLabel3.setForeground(Color.red);
                DatoGeneral.fechaizquierda.setVisible(true);
                if ("noesvisible".equals(EstadoSalud.getVisibilidadflecha())) {
                    DatoGeneral.fechaderecha.setVisible(false);
                } else if ("esvisible".equals(EstadoSalud.getVisibilidadflecha())) {
                    DatoGeneral.fechaderecha.setVisible(true);
                }

            } else if (planinfil.isEnabled()) {

                tecp.setVisible(true);
                tecp.setEnabled(true);
                estsalud.setVisible(true);
                estsalud.setEnabled(true);
                validarColor();
                jLabel3.setForeground(Color.red);
                DatoGeneral.fechaizquierda.setVisible(true);
                if ("noesvisible".equals(EstadoSalud.getVisibilidadflecha())) {
                    DatoGeneral.fechaderecha.setVisible(false);
                } else if ("esvisible".equals(EstadoSalud.getVisibilidadflecha())) {
                    DatoGeneral.fechaderecha.setVisible(true);
                }
            }
        } else //Rutina operacioneeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeees
        if (DatosPrincipales.getTipoExamen().equals("Rutina (operaciones)")) {
            if (daper.isEnabled()) {
                Date fechavacia = DatoPersonal.fechanaci.getDate();
                int age = Integer.parseInt(DatosPersonales.getEdad());
                if (DatosPersonales.getEstrato().equals("-")) {
                    JOptionPane.showMessageDialog(null, "¡Seleccione el estrato del examinado!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                } else if (age < 17 || age > 70) {
                    JOptionPane.showMessageDialog(null, "¡La edad no se admite!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                } else if (DatosPersonales.getGenero().equals("-")) {
                    JOptionPane.showMessageDialog(null, "¡El género no ha sido seleccionado!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                } else if (DatosPrincipales.getMotivoExamen().equals("Procedimiento") && (DatoPersonal.cbxtipoiden.getSelectedItem().equals("Seleccione") || fechavacia == null || DatoPersonal.txtnombre.getText().equals("") || DatoPersonal.txtnoiden.getText().equals("") || DatoPersonal.txtexpedidos.getText().equals("") || DatoPersonal.txtlugarnaci.getText().equals("") || DatoPersonal.txtdireccion.getText().equals("") || DatoPersonal.txtcargoactual.getText().equals("") || DatoPersonal.txtareaactual.getText().equals("") || DatoPersonal.txtpersonasolicitante.getText().equals("") || DatoPersonal.txtcargosolicitante.getText().equals(""))) {

                    JOptionPane.showMessageDialog(null, "¡Debe completar todos los parámetros para registrar los datos!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);

                } else if (DatosPrincipales.getMotivoExamen().equals("Ascenso") && (DatoPersonal.cbxtipoiden.getSelectedItem().equals("Seleccione") || fechavacia == null || (DatoPersonal.txtnombre.getText().equals("") || "".equals(DatoPersonal.txtnombre.getText())) || (DatoPersonal.txtnoiden.getText().equals("") || "".equals(DatoPersonal.txtnoiden.getText())) || (DatoPersonal.txtexpedidos.getText().equals("") || "".equals(DatoPersonal.txtexpedidos.getText())) || (DatoPersonal.txtlugarnaci.getText().equals("") || "".equals(DatoPersonal.txtlugarnaci.getText())) || (DatoPersonal.txtdireccion.getText().equals("") || "".equals(DatoPersonal.txtdireccion.getText())) || (DatoPersonal.txtcargoaspira.getText().equals("") || "".equals(DatoPersonal.txtcargoaspira.getText())) || (DatoPersonal.txtareaaspira.getText().equals("") || "".equals(DatoPersonal.txtareaaspira.getText())) || (DatoPersonal.txtcargoactual.getText().equals("") || "".equals(DatoPersonal.txtcargoactual.getText())) || (DatoPersonal.txtareaactual.getText().equals("") || "".equals(DatoPersonal.txtareaactual.getText())) || (DatoPersonal.txtpersonasolicitante.getText().equals("") || "".equals(DatoPersonal.txtpersonasolicitante.getText())) || (DatoPersonal.txtcargosolicitante.getText().equals("") || "".equals(DatoPersonal.txtcargosolicitante.getText())))) {

                    JOptionPane.showMessageDialog(null, "¡Debe completar todos los parámetros para registrar los datos!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);

                } else {

                    nombreExamen();
                    nombreExamen.setText("Nombre examen: " + TecnicaYPreguntas.getNombreExamen());

                    daper.setVisible(false);
                    daper.setEnabled(false);
                    estsalud.setVisible(true);
                    estsalud.setEnabled(true);
                    validarColor();
                    jLabel3.setForeground(Color.red);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    if ("noesvisible".equals(EstadoSalud.getVisibilidadflecha())) {
                        DatoGeneral.fechaderecha.setVisible(false);
                    } else if ("esvisible".equals(EstadoSalud.getVisibilidadflecha())) {
                        DatoGeneral.fechaderecha.setVisible(true);
                    }

                    if ("Sinconexion".equals(classes.Conexion.importante)) {
                        btnsave.setVisible(true);
                    } else if ("Conconexion".equals(classes.Conexion.importante)) {
                        if ("nuevo".equals(DatosPrincipales.getOpcionExamen())) {
                            dp.update_datosper();
                            DatosPersonales.setColorCategoria("con");
                            DatosPersonales.setValidacionRegistro("registrado");
                        }
                    }
                }
            } else if (estsalud.isEnabled()) {
                JOptionPane.showMessageDialog(null, "¡Ya se encuentra en uso!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);

            } else if (inforfami.isEnabled()) {

                inforfami.setVisible(false);
                inforfami.setEnabled(false);
                estsalud.setVisible(true);
                estsalud.setEnabled(true);
                validarColor();
                jLabel3.setForeground(Color.red);
                DatoGeneral.fechaizquierda.setVisible(true);
                if ("noesvisible".equals(EstadoSalud.getVisibilidadflecha())) {
                    DatoGeneral.fechaderecha.setVisible(false);
                } else if ("esvisible".equals(EstadoSalud.getVisibilidadflecha())) {
                    DatoGeneral.fechaderecha.setVisible(true);
                }
            } else if (infoaca.isEnabled()) {

                infoaca.setVisible(false);
                infoaca.setEnabled(false);
                estsalud.setVisible(true);
                estsalud.setEnabled(true);
                validarColor();
                jLabel3.setForeground(Color.red);
                DatoGeneral.fechaizquierda.setVisible(true);
                if ("noesvisible".equals(EstadoSalud.getVisibilidadflecha())) {
                    DatoGeneral.fechaderecha.setVisible(false);
                } else if ("esvisible".equals(EstadoSalud.getVisibilidadflecha())) {
                    DatoGeneral.fechaderecha.setVisible(true);
                }

            } else if (infofinan.isEnabled()) {

                infofinan.setVisible(false);
                infofinan.setEnabled(false);
                estsalud.setVisible(true);
                estsalud.setEnabled(true);
                validarColor();
                jLabel3.setForeground(Color.red);
                DatoGeneral.fechaizquierda.setVisible(true);
                if ("noesvisible".equals(EstadoSalud.getVisibilidadflecha())) {
                    DatoGeneral.fechaderecha.setVisible(false);
                } else if ("esvisible".equals(EstadoSalud.getVisibilidadflecha())) {
                    DatoGeneral.fechaderecha.setVisible(true);
                }

            } else if (casino.isEnabled()) {

                casino.setVisible(false);
                casino.setEnabled(false);
                estsalud.setVisible(true);
                estsalud.setEnabled(true);
                validarColor();
                jLabel3.setForeground(Color.red);
                DatoGeneral.fechaizquierda.setVisible(true);
                if ("noesvisible".equals(EstadoSalud.getVisibilidadflecha())) {
                    DatoGeneral.fechaderecha.setVisible(false);
                } else if ("esvisible".equals(EstadoSalud.getVisibilidadflecha())) {
                    DatoGeneral.fechaderecha.setVisible(true);
                }

            } else if (consbebidas.isEnabled()) {

                consustan.ValidacionTipoExamen();
                consbebidas.setVisible(false);
                consbebidas.setEnabled(false);
                estsalud.setVisible(true);
                estsalud.setEnabled(true);
                validarColor();
                jLabel3.setForeground(Color.red);
                DatoGeneral.fechaizquierda.setVisible(true);
                if ("noesvisible".equals(EstadoSalud.getVisibilidadflecha())) {
                    DatoGeneral.fechaderecha.setVisible(false);
                } else if ("esvisible".equals(EstadoSalud.getVisibilidadflecha())) {
                    DatoGeneral.fechaderecha.setVisible(true);
                }

            } else if (consustan.isEnabled()) {

                consustan.setVisible(false);
                consustan.setEnabled(false);
                estsalud.setVisible(true);
                estsalud.setEnabled(true);
                validarColor();
                jLabel3.setForeground(Color.red);
                DatoGeneral.fechaizquierda.setVisible(true);
                if ("noesvisible".equals(EstadoSalud.getVisibilidadflecha())) {
                    DatoGeneral.fechaderecha.setVisible(false);
                } else if ("esvisible".equals(EstadoSalud.getVisibilidadflecha())) {
                    DatoGeneral.fechaderecha.setVisible(true);
                }

            } else if (antece.isEnabled()) {

                antece.setVisible(false);
                antece.setEnabled(false);
                estsalud.setVisible(true);
                estsalud.setEnabled(true);
                validarColor();
                jLabel3.setForeground(Color.red);
                DatoGeneral.fechaizquierda.setVisible(true);
                if ("noesvisible".equals(EstadoSalud.getVisibilidadflecha())) {
                    DatoGeneral.fechaderecha.setVisible(false);
                } else if ("esvisible".equals(EstadoSalud.getVisibilidadflecha())) {
                    DatoGeneral.fechaderecha.setVisible(true);
                }

            } else if (vinculos.isEnabled()) {

                vinculos.setVisible(false);
                vinculos.setEnabled(false);
                falsifi.ValidacionTipoExamen();
                estsalud.setVisible(true);
                estsalud.setEnabled(true);
                validarColor();
                jLabel3.setForeground(Color.red);
                DatoGeneral.fechaizquierda.setVisible(true);
                if ("noesvisible".equals(EstadoSalud.getVisibilidadflecha())) {
                    DatoGeneral.fechaderecha.setVisible(false);
                } else if ("esvisible".equals(EstadoSalud.getVisibilidadflecha())) {
                    DatoGeneral.fechaderecha.setVisible(true);
                }

            } else if (falsifi.isEnabled()) {

                falsifi.setVisible(false);
                falsifi.setEnabled(false);
//                        tecp.ValidacionTipoExamen();
                estsalud.setVisible(true);
                estsalud.setEnabled(true);
                validarColor();
                jLabel3.setForeground(Color.red);
                DatoGeneral.fechaizquierda.setVisible(true);
                if ("noesvisible".equals(EstadoSalud.getVisibilidadflecha())) {
                    DatoGeneral.fechaderecha.setVisible(false);
                } else if ("esvisible".equals(EstadoSalud.getVisibilidadflecha())) {
                    DatoGeneral.fechaderecha.setVisible(true);
                }
            }
        } else //Rutina administrativooooooooooooooooooooooooooooooooooooooooooooooos
        if (DatosPrincipales.getTipoExamen().equals("Rutina (admitivos)")) {

            if (daper.isEnabled()) {
                Date fechavacia = DatoPersonal.fechanaci.getDate();
                int age = Integer.parseInt(DatosPersonales.getEdad());
                if (DatosPersonales.getEstrato().equals("-")) {
                    JOptionPane.showMessageDialog(null, "¡Seleccione el estrato del examinado!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                } else if (age < 17 || age > 70) {
                    JOptionPane.showMessageDialog(null, "¡La edad no se admite!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                } else if (DatosPersonales.getGenero().equals("-")) {
                    JOptionPane.showMessageDialog(null, "¡El género no ha sido seleccionado!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                } else {
                    if (DatosPrincipales.getMotivoExamen().equals("Procedimiento")) {
                        if (DatoPersonal.cbxtipoiden.getSelectedItem().equals("Seleccione") || fechavacia == null || DatoPersonal.txtnombre.getText().equals("") || DatoPersonal.txtnoiden.getText().equals("") || DatoPersonal.txtexpedidos.getText().equals("") || DatoPersonal.txtlugarnaci.getText().equals("") || DatoPersonal.txtdireccion.getText().equals("") || DatoPersonal.txtcargoactual.getText().equals("") || DatoPersonal.txtareaactual.getText().equals("") || DatoPersonal.txtpersonasolicitante.getText().equals("") || DatoPersonal.txtcargosolicitante.getText().equals("")) {
                            JOptionPane.showMessageDialog(null, "¡Debe completar todos los parámetros para registrar los datos!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                        }
                    } else if (DatosPrincipales.getMotivoExamen().equals("Ascenso")) {
                        if (DatoPersonal.cbxtipoiden.getSelectedItem().equals("Seleccione") || fechavacia == null || (DatoPersonal.txtnombre.getText().equals("") || "".equals(DatoPersonal.txtnombre.getText())) || (DatoPersonal.txtnoiden.getText().equals("") || "".equals(DatoPersonal.txtnoiden.getText())) || (DatoPersonal.txtexpedidos.getText().equals("") || "".equals(DatoPersonal.txtexpedidos.getText())) || (DatoPersonal.txtlugarnaci.getText().equals("") || "".equals(DatoPersonal.txtlugarnaci.getText())) || (DatoPersonal.txtdireccion.getText().equals("") || "".equals(DatoPersonal.txtdireccion.getText())) || (DatoPersonal.txtcargoaspira.getText().equals("") || "".equals(DatoPersonal.txtcargoaspira.getText())) || (DatoPersonal.txtareaaspira.getText().equals("") || "".equals(DatoPersonal.txtareaaspira.getText())) || (DatoPersonal.txtcargoactual.getText().equals("") || "".equals(DatoPersonal.txtcargoactual.getText())) || (DatoPersonal.txtareaactual.getText().equals("") || "".equals(DatoPersonal.txtareaactual.getText())) || (DatoPersonal.txtpersonasolicitante.getText().equals("") || "".equals(DatoPersonal.txtpersonasolicitante.getText())) || (DatoPersonal.txtcargosolicitante.getText().equals("") || "".equals(DatoPersonal.txtcargosolicitante.getText()))) {
                            JOptionPane.showMessageDialog(null, "¡Debe completar todos los parámetros para registrar los datos!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                        }
                    }
                    nombreExamen();
                    nombreExamen.setText("Nombre examen: " + TecnicaYPreguntas.getNombreExamen());
                    daper.setVisible(false);
                    daper.setEnabled(false);
                    estsalud.setVisible(true);
                    estsalud.setEnabled(true);
                    validarColor();
                    jLabel3.setForeground(Color.red);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    if ("noesvisible".equals(EstadoSalud.getVisibilidadflecha())) {
                        DatoGeneral.fechaderecha.setVisible(false);
                    } else if ("esvisible".equals(EstadoSalud.getVisibilidadflecha())) {
                        DatoGeneral.fechaderecha.setVisible(true);
                    }
                    if ("Sinconexion".equals(classes.Conexion.importante)) {
                        btnsave.setVisible(true);
                    } else if ("Conconexion".equals(classes.Conexion.importante)) {
                        if ("nuevo".equals(DatosPrincipales.getOpcionExamen())) {
                            dp.update_datosper();
                            DatosPersonales.setColorCategoria("con");
                            DatosPersonales.setValidacionRegistro("registrado");
                        }
                    }
                }
            } else if (estsalud.isEnabled()) {

                if (EstadoSalud.getEstado_salud().equals("-") || EstadoSalud.getEstado_salud().equals("")) {
                    JOptionPane.showMessageDialog(null, "¡Ya se encuentra en uso!!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);

                } else if (inforfami.isEnabled()) {

                    inforfami.setVisible(false);
                    inforfami.setEnabled(false);
                    estsalud.setVisible(true);
                    estsalud.setEnabled(true);
                    validarColor();
                    jLabel3.setForeground(Color.red);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    if ("noesvisible".equals(EstadoSalud.getVisibilidadflecha())) {
                        DatoGeneral.fechaderecha.setVisible(false);
                    } else if ("esvisible".equals(EstadoSalud.getVisibilidadflecha())) {
                        DatoGeneral.fechaderecha.setVisible(true);
                    }

                } else if (infoaca.isEnabled()) {

                    infoaca.setVisible(false);
                    infoaca.setEnabled(false);
                    estsalud.setVisible(true);
                    estsalud.setEnabled(true);
                    validarColor();
                    jLabel3.setForeground(Color.red);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    if ("noesvisible".equals(EstadoSalud.getVisibilidadflecha())) {
                        DatoGeneral.fechaderecha.setVisible(false);
                    } else if ("esvisible".equals(EstadoSalud.getVisibilidadflecha())) {
                        DatoGeneral.fechaderecha.setVisible(true);
                    }

                } else if (infofinan.isEnabled()) {

                    infofinan.setVisible(false);
                    infofinan.setEnabled(false);
                    estsalud.setVisible(true);
                    estsalud.setEnabled(true);
                    validarColor();
                    jLabel3.setForeground(Color.red);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    if ("noesvisible".equals(EstadoSalud.getVisibilidadflecha())) {
                        DatoGeneral.fechaderecha.setVisible(false);
                    } else if ("esvisible".equals(EstadoSalud.getVisibilidadflecha())) {
                        DatoGeneral.fechaderecha.setVisible(true);
                    }

                } else if (casino.isEnabled()) {

                    casino.setVisible(false);
                    casino.setEnabled(false);
                    estsalud.setVisible(true);
                    estsalud.setEnabled(true);
                    validarColor();
                    jLabel3.setForeground(Color.red);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    if ("noesvisible".equals(EstadoSalud.getVisibilidadflecha())) {
                        DatoGeneral.fechaderecha.setVisible(false);
                    } else if ("esvisible".equals(EstadoSalud.getVisibilidadflecha())) {
                        DatoGeneral.fechaderecha.setVisible(true);
                    }

                } else if (consbebidas.isEnabled()) {

                    consustan.ValidacionTipoExamen();
                    consbebidas.setVisible(false);
                    consbebidas.setEnabled(false);
                    estsalud.setVisible(true);
                    estsalud.setEnabled(true);
                    validarColor();
                    jLabel3.setForeground(Color.red);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    if ("noesvisible".equals(EstadoSalud.getVisibilidadflecha())) {
                        DatoGeneral.fechaderecha.setVisible(false);
                    } else if ("esvisible".equals(EstadoSalud.getVisibilidadflecha())) {
                        DatoGeneral.fechaderecha.setVisible(true);
                    }

                } else if (consustan.isEnabled()) {

                    consustan.setVisible(false);
                    consustan.setEnabled(false);
                    estsalud.setVisible(true);
                    estsalud.setEnabled(true);
                    validarColor();
                    jLabel3.setForeground(Color.red);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    if ("noesvisible".equals(EstadoSalud.getVisibilidadflecha())) {
                        DatoGeneral.fechaderecha.setVisible(false);
                    } else if ("esvisible".equals(EstadoSalud.getVisibilidadflecha())) {
                        DatoGeneral.fechaderecha.setVisible(true);
                    }

                } else if (antece.isEnabled()) {

                    antece.setVisible(false);
                    antece.setEnabled(false);
                    estsalud.setVisible(true);
                    estsalud.setEnabled(true);
                    validarColor();
                    jLabel3.setForeground(Color.red);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    if ("noesvisible".equals(EstadoSalud.getVisibilidadflecha())) {
                        DatoGeneral.fechaderecha.setVisible(false);
                    } else if ("esvisible".equals(EstadoSalud.getVisibilidadflecha())) {
                        DatoGeneral.fechaderecha.setVisible(true);
                    }

                } else if (vinculos.isEnabled()) {

                    vinculos.setVisible(false);
                    vinculos.setEnabled(false);
                    estsalud.setVisible(true);
                    estsalud.setEnabled(true);
                    validarColor();
                    jLabel3.setForeground(Color.red);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    if ("noesvisible".equals(EstadoSalud.getVisibilidadflecha())) {
                        DatoGeneral.fechaderecha.setVisible(false);
                    } else if ("esvisible".equals(EstadoSalud.getVisibilidadflecha())) {
                        DatoGeneral.fechaderecha.setVisible(true);
                    }

                } else if (falsifi.isEnabled()) {

                    falsifi.setVisible(false);
                    falsifi.setEnabled(false);
                    histlabo.ValidacionTipoExamen();
                    estsalud.setVisible(true);
                    estsalud.setEnabled(true);
                    validarColor();
                    jLabel3.setForeground(Color.red);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    if ("noesvisible".equals(EstadoSalud.getVisibilidadflecha())) {
                        DatoGeneral.fechaderecha.setVisible(false);
                    } else if ("esvisible".equals(EstadoSalud.getVisibilidadflecha())) {
                        DatoGeneral.fechaderecha.setVisible(true);
                    }

                } else if (histlabo.isEnabled()) {

                    histlabo.setVisible(false);
                    histlabo.setEnabled(false);
                    estsalud.setVisible(true);
                    estsalud.setEnabled(true);
                    validarColor();
                    jLabel3.setForeground(Color.red);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    if ("noesvisible".equals(EstadoSalud.getVisibilidadflecha())) {
                        DatoGeneral.fechaderecha.setVisible(false);
                    } else if ("esvisible".equals(EstadoSalud.getVisibilidadflecha())) {
                        DatoGeneral.fechaderecha.setVisible(true);
                    }

                } else if (planinfil.isEnabled()) {

                    planinfil.setVisible(false);
                    planinfil.setEnabled(false);
                    estsalud.setVisible(true);
                    estsalud.setEnabled(true);
                    validarColor();
                    jLabel3.setForeground(Color.red);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    if ("noesvisible".equals(EstadoSalud.getVisibilidadflecha())) {
                        DatoGeneral.fechaderecha.setVisible(false);
                    } else if ("esvisible".equals(EstadoSalud.getVisibilidadflecha())) {
                        DatoGeneral.fechaderecha.setVisible(true);
                    }
                }
            } else //Especificooooooooooooooooooooooooooooooooooooooooooo
            if (DatosPrincipales.getTipoExamen().equals("Específico")) {
                if (daper.isEnabled()) {
                    Date fechavacia = DatoPersonal.fechanaci.getDate();
                    int age = Integer.parseInt(DatosPersonales.getEdad());
                    if (DatosPersonales.getEstrato().equals("-")) {
                        JOptionPane.showMessageDialog(null, "¡Seleccione el estrato del examinado!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else if (age < 17 || age > 70) {
                        JOptionPane.showMessageDialog(null, "¡La edad no se admite!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else if (DatoPersonal.cbxtipoiden.getSelectedItem().equals("Seleccione") || fechavacia == null || (DatoPersonal.txtnombre.getText().equals("") || "".equals(DatoPersonal.txtnombre.getText())) || (DatoPersonal.txtnoiden.getText().equals("") || "".equals(DatoPersonal.txtnoiden.getText())) || (DatoPersonal.txtexpedidos.getText().equals("") || "".equals(DatoPersonal.txtexpedidos.getText())) || (DatoPersonal.txtlugarnaci.getText().equals("") || "".equals(DatoPersonal.txtlugarnaci.getText())) || (DatoPersonal.txtdireccion.getText().equals("") || "".equals(DatoPersonal.txtdireccion.getText())) || (DatoPersonal.txtpersonasolicitante.getText().equals("") || "".equals(DatoPersonal.txtpersonasolicitante.getText())) || (DatoPersonal.txtcargosolicitante.getText().equals("") || "".equals(DatoPersonal.txtcargosolicitante.getText())) || (DatoPersonal.txtareaactual.getText().equals("") || "".equals(DatoPersonal.txtareaactual.getText())) || (DatoPersonal.txtcargoactual.getText().equals("") || "".equals(DatoPersonal.txtcargoactual.getText()))) {
                        JOptionPane.showMessageDialog(null, "¡Debe completar todos los parámetros para registrar los datos!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else if (DatosPersonales.getGenero().equals("-") || DatosPersonales.getGenero().equals("") || DatosPersonales.getGenero() == null) {
                        JOptionPane.showMessageDialog(null, "¡El género no ha sido seleccionado!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else {

                        nombreExamen();
                        nombreExamen.setText("Nombre examen: " + TecnicaYPreguntas.getNombreExamen());
                        daper.setVisible(false);
                        daper.setEnabled(false);
                        estsalud.setVisible(true);
                        estsalud.setEnabled(true);
                        validarColor();
                        jLabel3.setForeground(Color.red);
                        DatoGeneral.fechaizquierda.setVisible(true);
                        if ("noesvisible".equals(EstadoSalud.getVisibilidadflecha())) {
                            DatoGeneral.fechaderecha.setVisible(false);
                        } else if ("esvisible".equals(EstadoSalud.getVisibilidadflecha())) {
                            DatoGeneral.fechaderecha.setVisible(true);
                        }

                        if ("Sinconexion".equals(classes.Conexion.importante)) {
                            btnsave.setVisible(true);
                        } else if ("Conconexion".equals(classes.Conexion.importante)) {
                            if ("nuevo".equals(DatosPrincipales.getOpcionExamen())) {
                                dp.update_datosper();
                                DatosPersonales.setColorCategoria("con");
                                DatosPersonales.setValidacionRegistro("registrado");
                            }
                        }
                    }
                } else if (estsalud.isEnabled()) {

                    if (EstadoSalud.getEstado_salud().equals("-") || EstadoSalud.getEstado_salud().equals("")) {

                        JOptionPane.showMessageDialog(null, "¡Ya se encuentra en uso!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);

                    } else if (inforfami.isEnabled()) {

                        inforfami.setVisible(false);
                        inforfami.setEnabled(false);
                        estsalud.setVisible(true);
                        estsalud.setEnabled(true);
                        validarColor();
                        jLabel3.setForeground(Color.red);
                        DatoGeneral.fechaizquierda.setVisible(true);
                        if ("noesvisible".equals(EstadoSalud.getVisibilidadflecha())) {
                            DatoGeneral.fechaderecha.setVisible(false);
                        } else if ("esvisible".equals(EstadoSalud.getVisibilidadflecha())) {
                            DatoGeneral.fechaderecha.setVisible(true);
                        }

                    } else if (infoaca.isEnabled()) {

                        infoaca.setVisible(false);
                        infoaca.setEnabled(false);
                        estsalud.setVisible(true);
                        estsalud.setEnabled(true);
                        validarColor();
                        jLabel3.setForeground(Color.red);
                        DatoGeneral.fechaizquierda.setVisible(true);
                        if ("noesvisible".equals(EstadoSalud.getVisibilidadflecha())) {
                            DatoGeneral.fechaderecha.setVisible(false);
                        } else if ("esvisible".equals(EstadoSalud.getVisibilidadflecha())) {
                            DatoGeneral.fechaderecha.setVisible(true);
                        }

                    } else if (infofinan.isEnabled()) {

                        infofinan.setVisible(false);
                        infofinan.setEnabled(false);
                        estsalud.setVisible(true);
                        estsalud.setEnabled(true);
                        validarColor();
                        jLabel3.setForeground(Color.red);
                        DatoGeneral.fechaizquierda.setVisible(true);
                        if ("noesvisible".equals(EstadoSalud.getVisibilidadflecha())) {
                            DatoGeneral.fechaderecha.setVisible(false);
                        } else if ("esvisible".equals(EstadoSalud.getVisibilidadflecha())) {
                            DatoGeneral.fechaderecha.setVisible(true);
                        }

                    } else if (consbebidas.isEnabled()) {

                        consustan.ValidacionTipoExamen();
                        consbebidas.setVisible(false);
                        consbebidas.setEnabled(false);
                        estsalud.setVisible(true);
                        estsalud.setEnabled(true);
                        validarColor();
                        jLabel3.setForeground(Color.red);
                        DatoGeneral.fechaizquierda.setVisible(true);
                        if ("noesvisible".equals(EstadoSalud.getVisibilidadflecha())) {
                            DatoGeneral.fechaderecha.setVisible(false);
                        } else if ("esvisible".equals(EstadoSalud.getVisibilidadflecha())) {
                            DatoGeneral.fechaderecha.setVisible(true);
                        }

                    } else if (consustan.isEnabled()) {

                        consustan.setVisible(false);
                        consustan.setEnabled(false);
                        estsalud.setVisible(true);
                        estsalud.setEnabled(true);
                        validarColor();
                        jLabel3.setForeground(Color.red);
                        DatoGeneral.fechaizquierda.setVisible(true);
                        if ("noesvisible".equals(EstadoSalud.getVisibilidadflecha())) {
                            DatoGeneral.fechaderecha.setVisible(false);
                        } else if ("esvisible".equals(EstadoSalud.getVisibilidadflecha())) {
                            DatoGeneral.fechaderecha.setVisible(true);
                        }

                    } else if (antece.isEnabled()) {

                        antece.setVisible(false);
                        antece.setEnabled(false);
                        estsalud.setVisible(true);
                        estsalud.setEnabled(true);
                        validarColor();
                        jLabel3.setForeground(Color.red);
                        DatoGeneral.fechaizquierda.setVisible(true);
                        if ("noesvisible".equals(EstadoSalud.getVisibilidadflecha())) {
                            DatoGeneral.fechaderecha.setVisible(false);
                        } else if ("esvisible".equals(EstadoSalud.getVisibilidadflecha())) {
                            DatoGeneral.fechaderecha.setVisible(true);
                        }

                    } else if (vinculos.isEnabled()) {

                        vinculos.setVisible(false);
                        vinculos.setEnabled(false);
                        estsalud.setVisible(true);
                        estsalud.setEnabled(true);
                        validarColor();
                        jLabel3.setForeground(Color.red);
                        DatoGeneral.fechaizquierda.setVisible(true);
                        if ("noesvisible".equals(EstadoSalud.getVisibilidadflecha())) {
                            DatoGeneral.fechaderecha.setVisible(false);
                        } else if ("esvisible".equals(EstadoSalud.getVisibilidadflecha())) {
                            DatoGeneral.fechaderecha.setVisible(true);
                        }

                    } else if (temain.isEnabled()) {

                        temain.setVisible(false);
                        temain.setEnabled(false);
                        estsalud.setVisible(true);
                        estsalud.setEnabled(true);
                        validarColor();
                        jLabel3.setForeground(Color.red);
                        DatoGeneral.fechaizquierda.setVisible(true);
                        if ("noesvisible".equals(EstadoSalud.getVisibilidadflecha())) {
                            DatoGeneral.fechaderecha.setVisible(false);
                        } else if ("esvisible".equals(EstadoSalud.getVisibilidadflecha())) {
                            DatoGeneral.fechaderecha.setVisible(true);

                        }
                    }
                }
            }
        }

    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        //pre empleooooooooooooooooooooo
        if (DatosPersonales.getValidacionRegistro().equals("noregistrado")) {
            JOptionPane.showMessageDialog(null, "¡Debe guardar los datos básicos primero!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
        } else if (!EstadoSalud.getVisibilidadflecha().equals("esvisible")) {
            JOptionPane.showMessageDialog(null, "¡No apto en estado de salud!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
        } else {
            if (DatosPrincipales.getTipoExamen().equals("Pre-empleo")) {
                if (daper.isEnabled()) {
                    Date fechavacia = DatoPersonal.fechanaci.getDate();
                    int age = Integer.parseInt(DatosPersonales.getEdad());
                    if (DatosPersonales.getEstrato().equals("-")) {
                        JOptionPane.showMessageDialog(null, "¡Seleccione el estrato del examinado!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else if (age < 17 || age > 70) {
                        JOptionPane.showMessageDialog(null, "¡La edad no se admite!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else if (DatoPersonal.cbxtipoiden.getSelectedItem().equals("Seleccione") || fechavacia == null || (DatoPersonal.txtnombre.getText().equals("") || "".equals(DatoPersonal.txtnombre.getText())) || (DatoPersonal.txtnoiden.getText().equals("") || "".equals(DatoPersonal.txtnoiden.getText())) || (DatoPersonal.txtexpedidos.getText().equals("") || "".equals(DatoPersonal.txtexpedidos.getText())) || (DatoPersonal.txtlugarnaci.getText().equals("") || "".equals(DatoPersonal.txtlugarnaci.getText())) || (DatoPersonal.txtdireccion.getText().equals("") || "".equals(DatoPersonal.txtdireccion.getText())) || (DatoPersonal.txtcargoaspira.getText().equals("") || "".equals(DatoPersonal.txtcargoaspira.getText())) || (DatoPersonal.txtareaaspira.getText().equals("") || "".equals(DatoPersonal.txtareaaspira.getText())) || (DatoPersonal.txtpersonasolicitante.getText().equals("") || "".equals(DatoPersonal.txtpersonasolicitante.getText())) || (DatoPersonal.txtcargosolicitante.getText().equals("") || "".equals(DatoPersonal.txtcargosolicitante.getText()))) {
                        JOptionPane.showMessageDialog(null, "¡Debe completar todos los parámetros para registrar los datos!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else if (DatosPersonales.getGenero().equals("-") || DatosPersonales.getGenero().equals("") || DatosPersonales.getGenero() == null) {
                        JOptionPane.showMessageDialog(null, "¡El género no ha sido seleccionado!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else {

                        nombreExamen();
                        nombreExamen.setText("Nombre examen: " + TecnicaYPreguntas.getNombreExamen());
                        DatosPersonales.setColorCategoria("con");
                        daper.setVisible(false);
                        daper.setEnabled(false);
                        inforfami.setVisible(true);
                        inforfami.setEnabled(true);
                        DatoGeneral.fechaizquierda.setVisible(true);
                        DatoGeneral.fechaderecha.setVisible(true);
                        validarColor();
                        jLabel4.setForeground(Color.red);

                        if ("Sinconexion".equals(classes.Conexion.importante)) {
                            btnsave.setVisible(true);
                            DatosPersonales.setValidacionRegistro("registrado");
                        } else if ("Conconexion".equals(classes.Conexion.importante)) {
                            if ("nuevo".equals(DatosPrincipales.getOpcionExamen())) {
                                dp.update_datosper();
                                DatosPersonales.setValidacionRegistro("registrado");

                            }
                        }
                    }
                } else if (estsalud.isEnabled()) {

                    if (EstadoSalud.getEstado_salud().equals("-") || EstadoSalud.getEstado_salud().equals("")) {
                        JOptionPane.showMessageDialog(null, "¡Debe elegir el estado de salud para continuar!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else if (EstadoSalud.getProb_salud().equals("-") || EstadoSalud.getProb_salud().equals("")) {
                        JOptionPane.showMessageDialog(null, "¡Debe completar todos los parámetros para continuar con el examen!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else {
                        EstadoSalud.setColorCategoria("con");
                        estsalud.setVisible(false);
                        estsalud.setEnabled(false);
                        inforfami.setVisible(true);
                        inforfami.setEnabled(true);
                        DatoGeneral.fechaizquierda.setVisible(true);
                        DatoGeneral.fechaderecha.setVisible(true);
                        validarColor();
                        jLabel4.setForeground(Color.red);
                        if ("Sinconexion".equals(classes.Conexion.importante)) {

                        } else if ("Conconexion".equals(classes.Conexion.importante)) {
                            if ("nuevo".equals(DatosPrincipales.getOpcionExamen())) {
                                es.update_estadosalud();
                                es.validarestadosalud();

                            }
                        }
                    }

                } else if (inforfami.isEnabled()) {
                    JOptionPane.showMessageDialog(null, "¡Ya se encuentra en uso!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);

                } else if (infoaca.isEnabled()) {

                    infoaca.setVisible(false);
                    infoaca.setEnabled(false);
                    inforfami.setVisible(true);
                    inforfami.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel4.setForeground(Color.red);

                } else if (infofinan.isEnabled()) {

                    infofinan.setVisible(false);
                    infofinan.setEnabled(false);
                    inforfami.setVisible(true);
                    inforfami.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel4.setForeground(Color.red);

                } else if (casino.isEnabled()) {

                    casino.setVisible(false);
                    casino.setEnabled(false);
                    inforfami.setVisible(true);
                    inforfami.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel4.setForeground(Color.red);

                } else if (consbebidas.isEnabled()) {

                    consustan.ValidacionTipoExamen();
                    consbebidas.setVisible(false);
                    consbebidas.setEnabled(false);
                    inforfami.setVisible(true);
                    inforfami.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel4.setForeground(Color.red);

                } else if (consustan.isEnabled()) {

                    consustan.setVisible(false);
                    consustan.setEnabled(false);
                    inforfami.setVisible(true);
                    inforfami.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel4.setForeground(Color.red);

                } else if (antece.isEnabled()) {

                    antece.setVisible(false);
                    antece.setEnabled(false);
                    inforfami.setVisible(true);
                    inforfami.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel4.setForeground(Color.red);

                } else if (vinculos.isEnabled()) {

                    vinculos.setVisible(false);
                    vinculos.setEnabled(false);
                    inforfami.setVisible(true);
                    inforfami.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel4.setForeground(Color.red);

                } else if (falsifi.isEnabled()) {

                    falsifi.setVisible(false);
                    falsifi.setEnabled(false);
                    histlabo.ValidacionTipoExamen();
                    inforfami.setVisible(true);
                    inforfami.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel4.setForeground(Color.red);

                } else if (histlabo.isEnabled()) {

                    histlabo.setVisible(false);
                    histlabo.setEnabled(false);
                    inforfami.setVisible(true);
                    inforfami.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel4.setForeground(Color.red);

                } else if (planinfil.isEnabled()) {

                    planinfil.setVisible(false);
                    planinfil.setEnabled(false);
                    inforfami.setVisible(true);
                    inforfami.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel4.setForeground(Color.red);

                }

            } else //Rutina operacioneeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeees
            if (DatosPrincipales.getTipoExamen().equals("Rutina (operaciones)")) {
                if (daper.isEnabled()) {
                    Date fechavacia = DatoPersonal.fechanaci.getDate();
                    int age = Integer.parseInt(DatosPersonales.getEdad());
                    if (DatosPersonales.getEstrato().equals("-")) {
                        JOptionPane.showMessageDialog(null, "¡Seleccione el estrato del examinado!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else if (age < 17 || age > 70) {
                        JOptionPane.showMessageDialog(null, "¡La edad no se admite!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else if (DatosPersonales.getGenero().equals("-")) {
                        JOptionPane.showMessageDialog(null, "¡El género no ha sido seleccionado!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else if (DatosPrincipales.getMotivoExamen().equals("Procedimiento") && (DatoPersonal.cbxtipoiden.getSelectedItem().equals("Seleccione") || fechavacia == null || DatoPersonal.txtnombre.getText().equals("") || DatoPersonal.txtnoiden.getText().equals("") || DatoPersonal.txtexpedidos.getText().equals("") || DatoPersonal.txtlugarnaci.getText().equals("") || DatoPersonal.txtdireccion.getText().equals("") || DatoPersonal.txtcargoactual.getText().equals("") || DatoPersonal.txtareaactual.getText().equals("") || DatoPersonal.txtpersonasolicitante.getText().equals("") || DatoPersonal.txtcargosolicitante.getText().equals(""))) {

                        JOptionPane.showMessageDialog(null, "¡Debe completar todos los parámetros para registrar los datos!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);

                    } else if (DatosPrincipales.getMotivoExamen().equals("Ascenso") && (DatoPersonal.cbxtipoiden.getSelectedItem().equals("Seleccione") || fechavacia == null || (DatoPersonal.txtnombre.getText().equals("") || "".equals(DatoPersonal.txtnombre.getText())) || (DatoPersonal.txtnoiden.getText().equals("") || "".equals(DatoPersonal.txtnoiden.getText())) || (DatoPersonal.txtexpedidos.getText().equals("") || "".equals(DatoPersonal.txtexpedidos.getText())) || (DatoPersonal.txtlugarnaci.getText().equals("") || "".equals(DatoPersonal.txtlugarnaci.getText())) || (DatoPersonal.txtdireccion.getText().equals("") || "".equals(DatoPersonal.txtdireccion.getText())) || (DatoPersonal.txtcargoaspira.getText().equals("") || "".equals(DatoPersonal.txtcargoaspira.getText())) || (DatoPersonal.txtareaaspira.getText().equals("") || "".equals(DatoPersonal.txtareaaspira.getText())) || (DatoPersonal.txtcargoactual.getText().equals("") || "".equals(DatoPersonal.txtcargoactual.getText())) || (DatoPersonal.txtareaactual.getText().equals("") || "".equals(DatoPersonal.txtareaactual.getText())) || (DatoPersonal.txtpersonasolicitante.getText().equals("") || "".equals(DatoPersonal.txtpersonasolicitante.getText())) || (DatoPersonal.txtcargosolicitante.getText().equals("") || "".equals(DatoPersonal.txtcargosolicitante.getText())))) {

                        JOptionPane.showMessageDialog(null, "¡Debe completar todos los parámetros para registrar los datos!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);

                    } else {

                        nombreExamen();
                        nombreExamen.setText("Nombre examen: " + TecnicaYPreguntas.getNombreExamen());

                        daper.setVisible(false);
                        daper.setEnabled(false);
                        inforfami.setVisible(true);
                        inforfami.setEnabled(true);
                        DatoGeneral.fechaizquierda.setVisible(true);
                        DatoGeneral.fechaderecha.setVisible(true);
                        validarColor();
                        jLabel4.setForeground(Color.red);

                        DatoGeneral.fechaizquierda.setVisible(true);
                        if ("noesvisible".equals(EstadoSalud.getVisibilidadflecha())) {
                            DatoGeneral.fechaderecha.setVisible(false);
                        } else if ("esvisible".equals(EstadoSalud.getVisibilidadflecha())) {
                            DatoGeneral.fechaderecha.setVisible(true);
                        }

                        if ("Sinconexion".equals(classes.Conexion.importante)) {
                            btnsave.setVisible(true);
                        } else if ("Conconexion".equals(classes.Conexion.importante)) {
                            if ("nuevo".equals(DatosPrincipales.getOpcionExamen())) {
                                dp.update_datosper();
                                DatosPersonales.setColorCategoria("con");
                                DatosPersonales.setValidacionRegistro("registrado");
                            }
                        }
                    }
                } else if (estsalud.isEnabled()) {

                    if (EstadoSalud.getEstado_salud().equals("-") || EstadoSalud.getEstado_salud().equals("")) {
                        JOptionPane.showMessageDialog(null, "¡Debe elegir el estado de salud para continuar!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else if (EstadoSalud.getProb_salud().equals("-") || EstadoSalud.getProb_salud().equals("")) {
                        JOptionPane.showMessageDialog(null, "¡Debe completar todos los parámetros para continuar con el examen!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else {
                        estsalud.setVisible(false);
                        estsalud.setEnabled(false);
                        inforfami.setVisible(true);
                        inforfami.setEnabled(true);
                        DatoGeneral.fechaizquierda.setVisible(true);
                        DatoGeneral.fechaderecha.setVisible(true);
                        validarColor();
                        jLabel4.setForeground(Color.red);

                        if ("Sinconexion".equals(classes.Conexion.importante)) {

                        } else if ("Conconexion".equals(classes.Conexion.importante)) {
                            if ("nuevo".equals(DatosPrincipales.getOpcionExamen())) {
                                es.update_estadosalud();
                                es.validarestadosalud();
                                EstadoSalud.setColorCategoria("con");
                            }
                        }
                    }

                } else if (inforfami.isEnabled()) {
                    if (InfoFamiliar.getEstado_civil().equals("") || InfoFamiliar.getEstado_civil().equals("-")) {

                        JOptionPane.showMessageDialog(null, "¡Ya se encuentra en uso!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);

                    } else if (infoaca.isEnabled()) {

                        infoaca.setVisible(false);
                        infoaca.setEnabled(false);
                        inforfami.setVisible(true);
                        inforfami.setEnabled(true);
                        DatoGeneral.fechaizquierda.setVisible(true);
                        DatoGeneral.fechaderecha.setVisible(true);
                        validarColor();
                        jLabel4.setForeground(Color.red);

                    } else if (infofinan.isEnabled()) {

                        infofinan.setVisible(false);
                        infofinan.setEnabled(false);
                        inforfami.setVisible(true);
                        inforfami.setEnabled(true);
                        DatoGeneral.fechaizquierda.setVisible(true);
                        DatoGeneral.fechaderecha.setVisible(true);
                        validarColor();
                        jLabel4.setForeground(Color.red);

                    } else if (casino.isEnabled()) {

                        casino.setVisible(false);
                        casino.setEnabled(false);
                        inforfami.setVisible(true);
                        inforfami.setEnabled(true);
                        DatoGeneral.fechaizquierda.setVisible(true);
                        DatoGeneral.fechaderecha.setVisible(true);
                        validarColor();
                        jLabel4.setForeground(Color.red);

                    } else if (consbebidas.isEnabled()) {

                        consustan.ValidacionTipoExamen();
                        consbebidas.setVisible(false);
                        consbebidas.setEnabled(false);
                        inforfami.setVisible(true);
                        inforfami.setEnabled(true);
                        DatoGeneral.fechaizquierda.setVisible(true);
                        DatoGeneral.fechaderecha.setVisible(true);
                        validarColor();
                        jLabel4.setForeground(Color.red);

                    } else if (consustan.isEnabled()) {

                        consustan.setVisible(false);
                        consustan.setEnabled(false);
                        inforfami.setVisible(true);
                        inforfami.setEnabled(true);
                        DatoGeneral.fechaizquierda.setVisible(true);
                        DatoGeneral.fechaderecha.setVisible(true);
                        validarColor();
                        jLabel4.setForeground(Color.red);

                    } else if (antece.isEnabled()) {

                        antece.setVisible(false);
                        antece.setEnabled(false);
                        inforfami.setVisible(true);
                        inforfami.setEnabled(true);
                        DatoGeneral.fechaizquierda.setVisible(true);
                        DatoGeneral.fechaderecha.setVisible(true);
                        validarColor();
                        jLabel4.setForeground(Color.red);

                    } else if (vinculos.isEnabled()) {

                        vinculos.setVisible(false);
                        vinculos.setEnabled(false);
                        falsifi.ValidacionTipoExamen();
                        inforfami.setVisible(true);
                        inforfami.setEnabled(true);
                        DatoGeneral.fechaizquierda.setVisible(true);
                        DatoGeneral.fechaderecha.setVisible(true);
                        validarColor();
                        jLabel4.setForeground(Color.red);

                    } else if (falsifi.isEnabled()) {

                        falsifi.setVisible(false);
                        falsifi.setEnabled(false);
//                        tecp.ValidacionTipoExamen();
                        inforfami.setVisible(true);
                        inforfami.setEnabled(true);
                        DatoGeneral.fechaizquierda.setVisible(true);
                        DatoGeneral.fechaderecha.setVisible(true);
                        validarColor();
                        jLabel4.setForeground(Color.red);

                    }

                } else //Rutina administrativooooooooooooooooooooooooooooooooooooooooooooooos
                if (DatosPrincipales.getTipoExamen().equals("Rutina (admitivos)")) {

                    if (daper.isEnabled()) {
                        Date fechavacia = DatoPersonal.fechanaci.getDate();
                        int age = Integer.parseInt(DatosPersonales.getEdad());
                        if (DatosPersonales.getEstrato().equals("-")) {
                            JOptionPane.showMessageDialog(null, "¡Seleccione el estrato del examinado!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                        } else if (age < 17 || age > 70) {
                            JOptionPane.showMessageDialog(null, "¡La edad no se admite!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                        } else if (DatosPersonales.getGenero().equals("-")) {
                            JOptionPane.showMessageDialog(null, "¡El género no ha sido seleccionado!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                        } else {
                            if (DatosPrincipales.getMotivoExamen().equals("Procedimiento")) {
                                if (DatoPersonal.cbxtipoiden.getSelectedItem().equals("Seleccione") || fechavacia == null || DatoPersonal.txtnombre.getText().equals("") || DatoPersonal.txtnoiden.getText().equals("") || DatoPersonal.txtexpedidos.getText().equals("") || DatoPersonal.txtlugarnaci.getText().equals("") || DatoPersonal.txtdireccion.getText().equals("") || DatoPersonal.txtcargoactual.getText().equals("") || DatoPersonal.txtareaactual.getText().equals("") || DatoPersonal.txtpersonasolicitante.getText().equals("") || DatoPersonal.txtcargosolicitante.getText().equals("")) {
                                    JOptionPane.showMessageDialog(null, "¡Debe completar todos los parámetros para registrar los datos!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                                }
                            } else if (DatosPrincipales.getMotivoExamen().equals("Ascenso")) {
                                if (DatoPersonal.cbxtipoiden.getSelectedItem().equals("Seleccione") || fechavacia == null || (DatoPersonal.txtnombre.getText().equals("") || "".equals(DatoPersonal.txtnombre.getText())) || (DatoPersonal.txtnoiden.getText().equals("") || "".equals(DatoPersonal.txtnoiden.getText())) || (DatoPersonal.txtexpedidos.getText().equals("") || "".equals(DatoPersonal.txtexpedidos.getText())) || (DatoPersonal.txtlugarnaci.getText().equals("") || "".equals(DatoPersonal.txtlugarnaci.getText())) || (DatoPersonal.txtdireccion.getText().equals("") || "".equals(DatoPersonal.txtdireccion.getText())) || (DatoPersonal.txtcargoaspira.getText().equals("") || "".equals(DatoPersonal.txtcargoaspira.getText())) || (DatoPersonal.txtareaaspira.getText().equals("") || "".equals(DatoPersonal.txtareaaspira.getText())) || (DatoPersonal.txtcargoactual.getText().equals("") || "".equals(DatoPersonal.txtcargoactual.getText())) || (DatoPersonal.txtareaactual.getText().equals("") || "".equals(DatoPersonal.txtareaactual.getText())) || (DatoPersonal.txtpersonasolicitante.getText().equals("") || "".equals(DatoPersonal.txtpersonasolicitante.getText())) || (DatoPersonal.txtcargosolicitante.getText().equals("") || "".equals(DatoPersonal.txtcargosolicitante.getText()))) {
                                    JOptionPane.showMessageDialog(null, "¡Debe completar todos los parámetros para registrar los datos!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                                }
                            }
                            nombreExamen();
                            nombreExamen.setText("Nombre examen: " + TecnicaYPreguntas.getNombreExamen());
                            daper.setVisible(false);
                            daper.setEnabled(false);
                            estsalud.setVisible(true);
                            estsalud.setEnabled(true);
                            validarColor();
                            jLabel3.setForeground(Color.red);
                            DatoGeneral.fechaizquierda.setVisible(true);
                            if ("noesvisible".equals(EstadoSalud.getVisibilidadflecha())) {
                                DatoGeneral.fechaderecha.setVisible(false);
                            } else if ("esvisible".equals(EstadoSalud.getVisibilidadflecha())) {
                                DatoGeneral.fechaderecha.setVisible(true);
                            }

                            if ("Sinconexion".equals(classes.Conexion.importante)) {
                                btnsave.setVisible(true);
                            } else if ("Conconexion".equals(classes.Conexion.importante)) {
                                if ("nuevo".equals(DatosPrincipales.getOpcionExamen())) {
                                    dp.update_datosper();
                                    DatosPersonales.setColorCategoria("con");
                                    DatosPersonales.setValidacionRegistro("registrado");
                                }
                            }
                        }
                    } else if (estsalud.isEnabled()) {

                        if (EstadoSalud.getEstado_salud().equals("-") || EstadoSalud.getEstado_salud().equals("")) {
                            JOptionPane.showMessageDialog(null, "¡Debe elegir el estado de salud para continuar!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                        } else if (EstadoSalud.getProb_salud().equals("-") || EstadoSalud.getProb_salud().equals("")) {
                            JOptionPane.showMessageDialog(null, "¡Debe completar todos los parámetros para continuar con el examen!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                        } else {
                            estsalud.setVisible(false);
                            estsalud.setEnabled(false);
                            inforfami.setVisible(true);
                            inforfami.setEnabled(true);
                            DatoGeneral.fechaizquierda.setVisible(true);
                            DatoGeneral.fechaderecha.setVisible(true);
                            validarColor();
                            jLabel4.setForeground(Color.red);

                            if ("Sinconexion".equals(classes.Conexion.importante)) {

                            } else if ("Conconexion".equals(classes.Conexion.importante)) {
                                if ("nuevo".equals(DatosPrincipales.getOpcionExamen())) {
                                    es.update_estadosalud();
                                    es.validarestadosalud();
                                    EstadoSalud.setColorCategoria("con");
                                }
                            }
                        }

                    } else if (inforfami.isEnabled()) {
                        if (InfoFamiliar.getEstado_civil().equals("") || InfoFamiliar.getEstado_civil().equals("-")) {

                            JOptionPane.showMessageDialog(null, "¡Ya se encuentra en uso!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);

                        } else if (infoaca.isEnabled()) {

                            infoaca.setVisible(false);
                            infoaca.setEnabled(false);
                            inforfami.setVisible(true);
                            inforfami.setEnabled(true);
                            DatoGeneral.fechaizquierda.setVisible(true);
                            DatoGeneral.fechaderecha.setVisible(true);
                            validarColor();
                            jLabel4.setForeground(Color.red);

                        } else if (infofinan.isEnabled()) {

                            infofinan.setVisible(false);
                            infofinan.setEnabled(false);
                            inforfami.setVisible(true);
                            inforfami.setEnabled(true);
                            DatoGeneral.fechaizquierda.setVisible(true);
                            DatoGeneral.fechaderecha.setVisible(true);
                            validarColor();
                            jLabel4.setForeground(Color.red);

                        } else if (casino.isEnabled()) {

                            casino.setVisible(false);
                            casino.setEnabled(false);
                            inforfami.setVisible(true);
                            inforfami.setEnabled(true);
                            DatoGeneral.fechaizquierda.setVisible(true);
                            DatoGeneral.fechaderecha.setVisible(true);
                            validarColor();
                            jLabel4.setForeground(Color.red);

                        } else if (consbebidas.isEnabled()) {

                            consustan.ValidacionTipoExamen();
                            consbebidas.setVisible(false);
                            consbebidas.setEnabled(false);
                            inforfami.setVisible(true);
                            inforfami.setEnabled(true);
                            DatoGeneral.fechaizquierda.setVisible(true);
                            DatoGeneral.fechaderecha.setVisible(true);
                            validarColor();
                            jLabel4.setForeground(Color.red);

                        } else if (consustan.isEnabled()) {

                            consustan.setVisible(false);
                            consustan.setEnabled(false);
                            inforfami.setVisible(true);
                            inforfami.setEnabled(true);
                            DatoGeneral.fechaizquierda.setVisible(true);
                            DatoGeneral.fechaderecha.setVisible(true);
                            validarColor();
                            jLabel4.setForeground(Color.red);

                        } else if (antece.isEnabled()) {

                            antece.setVisible(false);
                            antece.setEnabled(false);
                            inforfami.setVisible(true);
                            inforfami.setEnabled(true);
                            DatoGeneral.fechaizquierda.setVisible(true);
                            DatoGeneral.fechaderecha.setVisible(true);
                            validarColor();
                            jLabel4.setForeground(Color.red);

                        } else if (vinculos.isEnabled()) {

                            vinculos.setVisible(false);
                            vinculos.setEnabled(false);
                            falsifi.ValidacionTipoExamen();
                            inforfami.setVisible(true);
                            inforfami.setEnabled(true);
                            DatoGeneral.fechaizquierda.setVisible(true);
                            DatoGeneral.fechaderecha.setVisible(true);
                            validarColor();
                            jLabel4.setForeground(Color.red);

                        } else if (falsifi.isEnabled()) {

                            falsifi.setVisible(false);
                            falsifi.setEnabled(false);
                            histlabo.ValidacionTipoExamen();
                            inforfami.setVisible(true);
                            inforfami.setEnabled(true);
                            DatoGeneral.fechaizquierda.setVisible(true);
                            DatoGeneral.fechaderecha.setVisible(true);
                            validarColor();
                            jLabel4.setForeground(Color.red);

                        } else if (histlabo.isEnabled()) {

                            histlabo.setVisible(false);
                            histlabo.setEnabled(false);
                            inforfami.setVisible(true);
                            inforfami.setEnabled(true);
                            DatoGeneral.fechaizquierda.setVisible(true);
                            DatoGeneral.fechaderecha.setVisible(true);
                            validarColor();
                            jLabel4.setForeground(Color.red);

                        } else if (planinfil.isEnabled()) {

                            planinfil.setVisible(false);
                            planinfil.setEnabled(false);
                            inforfami.setVisible(true);
                            inforfami.setEnabled(true);
                            DatoGeneral.fechaizquierda.setVisible(true);
                            DatoGeneral.fechaderecha.setVisible(true);
                            validarColor();
                            jLabel4.setForeground(Color.red);

                        }

                    } else //Especificooooooooooooooooooooooooooooooooooooooooooo
                    if (DatosPrincipales.getTipoExamen().equals("Específico")) {
                        if (daper.isEnabled()) {
                            Date fechavacia = DatoPersonal.fechanaci.getDate();
                            int age = Integer.parseInt(DatosPersonales.getEdad());
                            if (DatosPersonales.getEstrato().equals("-")) {
                                JOptionPane.showMessageDialog(null, "¡Seleccione el estrato del examinado!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                            } else if (age < 17 || age > 70) {
                                JOptionPane.showMessageDialog(null, "¡La edad no se admite!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                            } else if (DatoPersonal.cbxtipoiden.getSelectedItem().equals("Seleccione") || fechavacia == null || (DatoPersonal.txtnombre.getText().equals("") || "".equals(DatoPersonal.txtnombre.getText())) || (DatoPersonal.txtnoiden.getText().equals("") || "".equals(DatoPersonal.txtnoiden.getText())) || (DatoPersonal.txtexpedidos.getText().equals("") || "".equals(DatoPersonal.txtexpedidos.getText())) || (DatoPersonal.txtlugarnaci.getText().equals("") || "".equals(DatoPersonal.txtlugarnaci.getText())) || (DatoPersonal.txtdireccion.getText().equals("") || "".equals(DatoPersonal.txtdireccion.getText())) || (DatoPersonal.txtpersonasolicitante.getText().equals("") || "".equals(DatoPersonal.txtpersonasolicitante.getText())) || (DatoPersonal.txtcargosolicitante.getText().equals("") || "".equals(DatoPersonal.txtcargosolicitante.getText())) || (DatoPersonal.txtareaactual.getText().equals("") || "".equals(DatoPersonal.txtareaactual.getText())) || (DatoPersonal.txtcargoactual.getText().equals("") || "".equals(DatoPersonal.txtcargoactual.getText()))) {
                                JOptionPane.showMessageDialog(null, "¡Debe completar todos los parámetros para registrar los datos!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                            } else if (DatosPersonales.getGenero().equals("-") || DatosPersonales.getGenero().equals("") || DatosPersonales.getGenero() == null) {
                                JOptionPane.showMessageDialog(null, "¡El género no ha sido seleccionado!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                            } else {

                                nombreExamen();
                                nombreExamen.setText("Nombre examen: " + TecnicaYPreguntas.getNombreExamen());
                                daper.setVisible(false);
                                daper.setEnabled(false);
                                inforfami.setVisible(true);
                                inforfami.setEnabled(true);
                                DatoGeneral.fechaizquierda.setVisible(true);
                                DatoGeneral.fechaderecha.setVisible(true);
                                validarColor();
                                jLabel4.setForeground(Color.red);

                                if ("Sinconexion".equals(classes.Conexion.importante)) {
                                    btnsave.setVisible(true);
                                } else if ("Conconexion".equals(classes.Conexion.importante)) {
                                    if ("nuevo".equals(DatosPrincipales.getOpcionExamen())) {
                                        dp.update_datosper();
                                        DatosPersonales.setColorCategoria("con");
                                        DatosPersonales.setValidacionRegistro("registrado");
                                    }
                                }
                            }
                        } else if (estsalud.isEnabled()) {

                            if (EstadoSalud.getEstado_salud().equals("-") || EstadoSalud.getEstado_salud().equals("")) {
                                JOptionPane.showMessageDialog(null, "¡Debe elegir el estado de salud para continuar!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                            } else if (EstadoSalud.getProb_salud().equals("-") || EstadoSalud.getProb_salud().equals("")) {
                                JOptionPane.showMessageDialog(null, "¡Debe completar todos los parámetros para continuar con el examen!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                            } else {
                                estsalud.setVisible(false);
                                estsalud.setEnabled(false);
                                inforfami.setVisible(true);
                                inforfami.setEnabled(true);
                                DatoGeneral.fechaizquierda.setVisible(true);
                                DatoGeneral.fechaderecha.setVisible(true);
                                validarColor();
                                jLabel4.setForeground(Color.red);

                                if ("Sinconexion".equals(classes.Conexion.importante)) {

                                } else if ("Conconexion".equals(classes.Conexion.importante)) {
                                    if ("nuevo".equals(DatosPrincipales.getOpcionExamen())) {
                                        es.update_estadosalud();
                                        es.validarestadosalud();
                                        EstadoSalud.setColorCategoria("con");
                                    }
                                }
                            }

                        } else if (inforfami.isEnabled()) {
                            if (InfoFamiliar.getEstado_civil().equals("") || InfoFamiliar.getEstado_civil().equals("-")) {

                                JOptionPane.showMessageDialog(null, "¡Ya se encuentra en uso!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);

                            } else if (infoaca.isEnabled()) {

                                infoaca.setVisible(false);
                                infoaca.setEnabled(false);
                                inforfami.setVisible(true);
                                inforfami.setEnabled(true);
                                DatoGeneral.fechaizquierda.setVisible(true);
                                DatoGeneral.fechaderecha.setVisible(true);
                                validarColor();
                                jLabel4.setForeground(Color.red);

                            } else if (infofinan.isEnabled()) {

                                infofinan.setVisible(false);
                                infofinan.setEnabled(false);
                                inforfami.setVisible(true);
                                inforfami.setEnabled(true);
                                DatoGeneral.fechaizquierda.setVisible(true);
                                DatoGeneral.fechaderecha.setVisible(true);
                                validarColor();
                                jLabel4.setForeground(Color.red);

                            } else if (consbebidas.isEnabled()) {

                                consustan.ValidacionTipoExamen();
                                consbebidas.setVisible(false);
                                consbebidas.setEnabled(false);
                                inforfami.setVisible(true);
                                inforfami.setEnabled(true);
                                DatoGeneral.fechaizquierda.setVisible(true);
                                DatoGeneral.fechaderecha.setVisible(true);
                                validarColor();
                                jLabel4.setForeground(Color.red);

                            } else if (consustan.isEnabled()) {

                                consustan.setVisible(false);
                                consustan.setEnabled(false);
                                inforfami.setVisible(true);
                                inforfami.setEnabled(true);
                                DatoGeneral.fechaizquierda.setVisible(true);
                                DatoGeneral.fechaderecha.setVisible(true);
                                validarColor();
                                jLabel4.setForeground(Color.red);

                            } else if (antece.isEnabled()) {

                                antece.setVisible(false);
                                antece.setEnabled(false);
                                inforfami.setVisible(true);
                                inforfami.setEnabled(true);
                                DatoGeneral.fechaizquierda.setVisible(true);
                                DatoGeneral.fechaderecha.setVisible(true);
                                validarColor();
                                jLabel4.setForeground(Color.red);

                            } else if (vinculos.isEnabled()) {

                                vinculos.setVisible(false);
                                vinculos.setEnabled(false);
                                inforfami.setVisible(true);
                                inforfami.setEnabled(true);
                                DatoGeneral.fechaizquierda.setVisible(true);
                                DatoGeneral.fechaderecha.setVisible(true);
                                validarColor();
                                jLabel4.setForeground(Color.red);

                            } else if (temain.isEnabled()) {

                                temain.setVisible(false);
                                temain.setEnabled(false);
                                inforfami.setVisible(true);
                                inforfami.setEnabled(true);
                                DatoGeneral.fechaizquierda.setVisible(true);
                                DatoGeneral.fechaderecha.setVisible(true);
                                validarColor();
                                jLabel4.setForeground(Color.red);

                            }
                        }
                    }
                }
            }
        }
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        //pre empleooooooooooooooooooooo
        if (DatosPersonales.getValidacionRegistro().equals("noregistrado")) {
            JOptionPane.showMessageDialog(null, "¡Debe guardar los datos básicos primero!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
        } else if (!EstadoSalud.getVisibilidadflecha().equals("esvisible")) {
            JOptionPane.showMessageDialog(null, "¡No apto en estado de salud!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
        } else {
            if (DatosPrincipales.getTipoExamen().equals("Pre-empleo")) {
                if (daper.isEnabled()) {
                    Date fechavacia = DatoPersonal.fechanaci.getDate();
                    int age = Integer.parseInt(DatosPersonales.getEdad());
                    if (DatosPersonales.getEstrato().equals("-")) {
                        JOptionPane.showMessageDialog(null, "¡Seleccione el estrato del examinado!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else if (age < 17 || age > 70) {
                        JOptionPane.showMessageDialog(null, "¡La edad no se admite!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else if (DatoPersonal.cbxtipoiden.getSelectedItem().equals("Seleccione") || fechavacia == null || (DatoPersonal.txtnombre.getText().equals("") || "".equals(DatoPersonal.txtnombre.getText())) || (DatoPersonal.txtnoiden.getText().equals("") || "".equals(DatoPersonal.txtnoiden.getText())) || (DatoPersonal.txtexpedidos.getText().equals("") || "".equals(DatoPersonal.txtexpedidos.getText())) || (DatoPersonal.txtlugarnaci.getText().equals("") || "".equals(DatoPersonal.txtlugarnaci.getText())) || (DatoPersonal.txtdireccion.getText().equals("") || "".equals(DatoPersonal.txtdireccion.getText())) || (DatoPersonal.txtcargoaspira.getText().equals("") || "".equals(DatoPersonal.txtcargoaspira.getText())) || (DatoPersonal.txtareaaspira.getText().equals("") || "".equals(DatoPersonal.txtareaaspira.getText())) || (DatoPersonal.txtpersonasolicitante.getText().equals("") || "".equals(DatoPersonal.txtpersonasolicitante.getText())) || (DatoPersonal.txtcargosolicitante.getText().equals("") || "".equals(DatoPersonal.txtcargosolicitante.getText()))) {
                        JOptionPane.showMessageDialog(null, "¡Debe completar todos los parámetros para registrar los datos!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else if (DatosPersonales.getGenero().equals("-") || DatosPersonales.getGenero().equals("") || DatosPersonales.getGenero() == null) {
                        JOptionPane.showMessageDialog(null, "¡El género no ha sido seleccionado!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else {

                        nombreExamen();
                        nombreExamen.setText("Nombre examen: " + TecnicaYPreguntas.getNombreExamen());
                        DatosPersonales.setColorCategoria("con");
                        daper.setVisible(false);
                        daper.setEnabled(false);
                        infoaca.setVisible(true);
                        infoaca.setEnabled(true);
                        DatoGeneral.fechaizquierda.setVisible(true);
                        DatoGeneral.fechaderecha.setVisible(true);
                        validarColor();
                        jLabel10.setForeground(Color.red);

                        if ("Sinconexion".equals(classes.Conexion.importante)) {
                            btnsave.setVisible(true);
                            DatosPersonales.setValidacionRegistro("registrado");
                        } else if ("Conconexion".equals(classes.Conexion.importante)) {
                            if ("nuevo".equals(DatosPrincipales.getOpcionExamen())) {
                                dp.update_datosper();
                                DatosPersonales.setValidacionRegistro("registrado");

                            }
                        }
                    }
                } else if (estsalud.isEnabled()) {

                    if (EstadoSalud.getEstado_salud().equals("-") || EstadoSalud.getEstado_salud().equals("")) {
                        JOptionPane.showMessageDialog(null, "¡Debe elegir el estado de salud para continuar!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else if (EstadoSalud.getProb_salud().equals("-") || EstadoSalud.getProb_salud().equals("")) {
                        JOptionPane.showMessageDialog(null, "¡Debe completar todos los parámetros para continuar con el examen!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else {
                        EstadoSalud.setColorCategoria("con");
                        estsalud.setVisible(false);
                        estsalud.setEnabled(false);
                        infoaca.setVisible(true);
                        infoaca.setEnabled(true);
                        DatoGeneral.fechaizquierda.setVisible(true);
                        DatoGeneral.fechaderecha.setVisible(true);
                        validarColor();
                        jLabel10.setForeground(Color.red);
                        if ("Sinconexion".equals(classes.Conexion.importante)) {

                        } else if ("Conconexion".equals(classes.Conexion.importante)) {
                            if ("nuevo".equals(DatosPrincipales.getOpcionExamen())) {
                                es.update_estadosalud();
                                es.validarestadosalud();

                            }
                        }
                    }

                } else if (inforfami.isEnabled()) {

                    InfoFamiliar.setColorCategoria("con");
                    inforfami.setVisible(false);
                    inforfami.setEnabled(false);
                    daper.setVisible(true);
                    daper.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(false);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel2.setForeground(Color.red);

                } else if (infoaca.isEnabled()) {
                    JOptionPane.showMessageDialog(null, "¡Ya se encuentra en uso!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);

                } else if (infofinan.isEnabled()) {

                    infofinan.setVisible(false);
                    infofinan.setEnabled(false);
                    infoaca.setVisible(true);
                    infoaca.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel10.setForeground(Color.red);

                } else if (casino.isEnabled()) {

                    casino.setVisible(false);
                    casino.setEnabled(false);
                    infoaca.setVisible(true);
                    infoaca.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel10.setForeground(Color.red);

                } else if (consbebidas.isEnabled()) {

                    ConsumoBebidas.setColorCategoria("con");
                    consustan.ValidacionTipoExamen();
                    consbebidas.setVisible(false);
                    consbebidas.setEnabled(false);
                    infoaca.setVisible(true);
                    infoaca.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel10.setForeground(Color.red);

                } else if (consustan.isEnabled()) {

                    consustan.setVisible(false);
                    consustan.setEnabled(false);
                    infoaca.setVisible(true);
                    infoaca.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel10.setForeground(Color.red);

                } else if (antece.isEnabled()) {

                    antece.setVisible(false);
                    antece.setEnabled(false);
                    infoaca.setVisible(true);
                    infoaca.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel10.setForeground(Color.red);

                } else if (vinculos.isEnabled()) {

                    vinculos.setVisible(false);
                    vinculos.setEnabled(false);
                    infoaca.setVisible(true);
                    infoaca.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel10.setForeground(Color.red);

                } else if (falsifi.isEnabled()) {

                    falsifi.setVisible(false);
                    falsifi.setEnabled(false);
                    histlabo.ValidacionTipoExamen();
                    infoaca.setVisible(true);
                    infoaca.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel10.setForeground(Color.red);

                } else if (histlabo.isEnabled()) {

                    histlabo.setVisible(false);
                    histlabo.setEnabled(false);
                    infoaca.setVisible(true);
                    infoaca.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel10.setForeground(Color.red);

                } else if (planinfil.isEnabled()) {

                    planinfil.setVisible(false);
                    planinfil.setEnabled(false);
                    infoaca.setVisible(true);
                    infoaca.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel10.setForeground(Color.red);
                }
            } else //Rutina operacioneeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeees
            if (DatosPrincipales.getTipoExamen().equals("Rutina (operaciones)")) {
                if (daper.isEnabled()) {
                    Date fechavacia = DatoPersonal.fechanaci.getDate();
                    int age = Integer.parseInt(DatosPersonales.getEdad());
                    if (DatosPersonales.getEstrato().equals("-")) {
                        JOptionPane.showMessageDialog(null, "¡Seleccione el estrato del examinado!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else if (age < 17 || age > 70) {
                        JOptionPane.showMessageDialog(null, "¡La edad no se admite!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else if (DatosPersonales.getGenero().equals("-")) {
                        JOptionPane.showMessageDialog(null, "¡El género no ha sido seleccionado!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else if (DatosPrincipales.getMotivoExamen().equals("Procedimiento") && (DatoPersonal.cbxtipoiden.getSelectedItem().equals("Seleccione") || fechavacia == null || DatoPersonal.txtnombre.getText().equals("") || DatoPersonal.txtnoiden.getText().equals("") || DatoPersonal.txtexpedidos.getText().equals("") || DatoPersonal.txtlugarnaci.getText().equals("") || DatoPersonal.txtdireccion.getText().equals("") || DatoPersonal.txtcargoactual.getText().equals("") || DatoPersonal.txtareaactual.getText().equals("") || DatoPersonal.txtpersonasolicitante.getText().equals("") || DatoPersonal.txtcargosolicitante.getText().equals(""))) {

                        JOptionPane.showMessageDialog(null, "¡Debe completar todos los parámetros para registrar los datos!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);

                    } else if (DatosPrincipales.getMotivoExamen().equals("Ascenso") && (DatoPersonal.cbxtipoiden.getSelectedItem().equals("Seleccione") || fechavacia == null || (DatoPersonal.txtnombre.getText().equals("") || "".equals(DatoPersonal.txtnombre.getText())) || (DatoPersonal.txtnoiden.getText().equals("") || "".equals(DatoPersonal.txtnoiden.getText())) || (DatoPersonal.txtexpedidos.getText().equals("") || "".equals(DatoPersonal.txtexpedidos.getText())) || (DatoPersonal.txtlugarnaci.getText().equals("") || "".equals(DatoPersonal.txtlugarnaci.getText())) || (DatoPersonal.txtdireccion.getText().equals("") || "".equals(DatoPersonal.txtdireccion.getText())) || (DatoPersonal.txtcargoaspira.getText().equals("") || "".equals(DatoPersonal.txtcargoaspira.getText())) || (DatoPersonal.txtareaaspira.getText().equals("") || "".equals(DatoPersonal.txtareaaspira.getText())) || (DatoPersonal.txtcargoactual.getText().equals("") || "".equals(DatoPersonal.txtcargoactual.getText())) || (DatoPersonal.txtareaactual.getText().equals("") || "".equals(DatoPersonal.txtareaactual.getText())) || (DatoPersonal.txtpersonasolicitante.getText().equals("") || "".equals(DatoPersonal.txtpersonasolicitante.getText())) || (DatoPersonal.txtcargosolicitante.getText().equals("") || "".equals(DatoPersonal.txtcargosolicitante.getText())))) {

                        JOptionPane.showMessageDialog(null, "¡Debe completar todos los parámetros para registrar los datos!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);

                    } else {

                        nombreExamen();
                        nombreExamen.setText("Nombre examen: " + TecnicaYPreguntas.getNombreExamen());

                        daper.setVisible(false);
                        daper.setEnabled(false);
                        infoaca.setVisible(true);
                        infoaca.setEnabled(true);
                        DatoGeneral.fechaizquierda.setVisible(true);
                        DatoGeneral.fechaderecha.setVisible(true);
                        validarColor();
                        jLabel10.setForeground(Color.red);

                        DatoGeneral.fechaizquierda.setVisible(true);
                        if ("noesvisible".equals(EstadoSalud.getVisibilidadflecha())) {
                            DatoGeneral.fechaderecha.setVisible(false);
                        } else if ("esvisible".equals(EstadoSalud.getVisibilidadflecha())) {
                            DatoGeneral.fechaderecha.setVisible(true);
                        }

                        if ("Sinconexion".equals(classes.Conexion.importante)) {
                            btnsave.setVisible(true);
                        } else if ("Conconexion".equals(classes.Conexion.importante)) {
                            if ("nuevo".equals(DatosPrincipales.getOpcionExamen())) {
                                dp.update_datosper();
                                DatosPersonales.setColorCategoria("con");
                                DatosPersonales.setValidacionRegistro("registrado");
                            }
                        }
                    }
                } else if (estsalud.isEnabled()) {

                    if (EstadoSalud.getEstado_salud().equals("-") || EstadoSalud.getEstado_salud().equals("")) {
                        JOptionPane.showMessageDialog(null, "¡Debe elegir el estado de salud para continuar!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else if (EstadoSalud.getProb_salud().equals("-") || EstadoSalud.getProb_salud().equals("")) {
                        JOptionPane.showMessageDialog(null, "¡Debe completar todos los parámetros para continuar con el examen!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else {
                        estsalud.setVisible(false);
                        estsalud.setEnabled(false);
                        infoaca.setVisible(true);
                        infoaca.setEnabled(true);
                        DatoGeneral.fechaizquierda.setVisible(true);
                        DatoGeneral.fechaderecha.setVisible(true);
                        validarColor();
                        jLabel10.setForeground(Color.red);
                        if ("Sinconexion".equals(classes.Conexion.importante)) {

                        } else if ("Conconexion".equals(classes.Conexion.importante)) {
                            if ("nuevo".equals(DatosPrincipales.getOpcionExamen())) {
                                es.update_estadosalud();
                                es.validarestadosalud();
                                EstadoSalud.setColorCategoria("con");
                            }
                        }
                    }

                } else if (inforfami.isEnabled()) {

                    inforfami.setVisible(false);
                    inforfami.setEnabled(false);
                    daper.setVisible(true);
                    daper.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(false);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel2.setForeground(Color.red);

                } else if (infoaca.isEnabled()) {

                    JOptionPane.showMessageDialog(null, "¡Ya se encuentra en uso!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);

                } else if (infofinan.isEnabled()) {

                    infofinan.setVisible(false);
                    infofinan.setEnabled(false);
                    infoaca.setVisible(true);
                    infoaca.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel10.setForeground(Color.red);

                } else if (casino.isEnabled()) {

                    casino.setVisible(false);
                    casino.setEnabled(false);
                    infoaca.setVisible(true);
                    infoaca.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel10.setForeground(Color.red);

                } else if (consbebidas.isEnabled()) {

                    consustan.ValidacionTipoExamen();
                    consbebidas.setVisible(false);
                    consbebidas.setEnabled(false);
                    infoaca.setVisible(true);
                    infoaca.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel10.setForeground(Color.red);

                } else if (consustan.isEnabled()) {

                    consustan.setVisible(false);
                    consustan.setEnabled(false);
                    infoaca.setVisible(true);
                    infoaca.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel10.setForeground(Color.red);

                } else if (antece.isEnabled()) {

                    antece.setVisible(false);
                    antece.setEnabled(false);
                    infoaca.setVisible(true);
                    infoaca.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel10.setForeground(Color.red);

                } else if (vinculos.isEnabled()) {

                    vinculos.setVisible(false);
                    vinculos.setEnabled(false);
                    falsifi.ValidacionTipoExamen();
                    infoaca.setVisible(true);
                    infoaca.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel10.setForeground(Color.red);

                } else if (falsifi.isEnabled()) {

                    falsifi.setVisible(false);
                    falsifi.setEnabled(false);
//                        tecp.ValidacionTipoExamen();
                    infoaca.setVisible(true);
                    infoaca.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel10.setForeground(Color.red);
                }
            } else //Rutina administrativooooooooooooooooooooooooooooooooooooooooooooooos
            if (DatosPrincipales.getTipoExamen().equals("Rutina (admitivos)")) {

                if (daper.isEnabled()) {
                    Date fechavacia = DatoPersonal.fechanaci.getDate();
                    int age = Integer.parseInt(DatosPersonales.getEdad());
                    if (DatosPersonales.getEstrato().equals("-")) {
                        JOptionPane.showMessageDialog(null, "¡Seleccione el estrato del examinado!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else if (age < 17 || age > 70) {
                        JOptionPane.showMessageDialog(null, "¡La edad no se admite!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else if (DatosPersonales.getGenero().equals("-")) {
                        JOptionPane.showMessageDialog(null, "¡El género no ha sido seleccionado!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else {
                        if (DatosPrincipales.getMotivoExamen().equals("Procedimiento")) {
                            if (DatoPersonal.cbxtipoiden.getSelectedItem().equals("Seleccione") || fechavacia == null || DatoPersonal.txtnombre.getText().equals("") || DatoPersonal.txtnoiden.getText().equals("") || DatoPersonal.txtexpedidos.getText().equals("") || DatoPersonal.txtlugarnaci.getText().equals("") || DatoPersonal.txtdireccion.getText().equals("") || DatoPersonal.txtcargoactual.getText().equals("") || DatoPersonal.txtareaactual.getText().equals("") || DatoPersonal.txtpersonasolicitante.getText().equals("") || DatoPersonal.txtcargosolicitante.getText().equals("")) {
                                JOptionPane.showMessageDialog(null, "¡Debe completar todos los parámetros para registrar los datos!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                            }
                        } else if (DatosPrincipales.getMotivoExamen().equals("Ascenso")) {
                            if (DatoPersonal.cbxtipoiden.getSelectedItem().equals("Seleccione") || fechavacia == null || (DatoPersonal.txtnombre.getText().equals("") || "".equals(DatoPersonal.txtnombre.getText())) || (DatoPersonal.txtnoiden.getText().equals("") || "".equals(DatoPersonal.txtnoiden.getText())) || (DatoPersonal.txtexpedidos.getText().equals("") || "".equals(DatoPersonal.txtexpedidos.getText())) || (DatoPersonal.txtlugarnaci.getText().equals("") || "".equals(DatoPersonal.txtlugarnaci.getText())) || (DatoPersonal.txtdireccion.getText().equals("") || "".equals(DatoPersonal.txtdireccion.getText())) || (DatoPersonal.txtcargoaspira.getText().equals("") || "".equals(DatoPersonal.txtcargoaspira.getText())) || (DatoPersonal.txtareaaspira.getText().equals("") || "".equals(DatoPersonal.txtareaaspira.getText())) || (DatoPersonal.txtcargoactual.getText().equals("") || "".equals(DatoPersonal.txtcargoactual.getText())) || (DatoPersonal.txtareaactual.getText().equals("") || "".equals(DatoPersonal.txtareaactual.getText())) || (DatoPersonal.txtpersonasolicitante.getText().equals("") || "".equals(DatoPersonal.txtpersonasolicitante.getText())) || (DatoPersonal.txtcargosolicitante.getText().equals("") || "".equals(DatoPersonal.txtcargosolicitante.getText()))) {
                                JOptionPane.showMessageDialog(null, "¡Debe completar todos los parámetros para registrar los datos!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                            }
                        }
                        nombreExamen();
                        nombreExamen.setText("Nombre examen: " + TecnicaYPreguntas.getNombreExamen());
                        daper.setVisible(false);
                        daper.setEnabled(false);
                        infoaca.setVisible(true);
                        infoaca.setEnabled(true);
                        DatoGeneral.fechaizquierda.setVisible(true);
                        DatoGeneral.fechaderecha.setVisible(true);
                        validarColor();
                        jLabel10.setForeground(Color.red);
                        if ("Sinconexion".equals(classes.Conexion.importante)) {
                            btnsave.setVisible(true);
                        } else if ("Conconexion".equals(classes.Conexion.importante)) {
                            if ("nuevo".equals(DatosPrincipales.getOpcionExamen())) {
                                dp.update_datosper();
                                DatosPersonales.setColorCategoria("con");
                                DatosPersonales.setValidacionRegistro("registrado");
                            }
                        }
                    }
                } else if (estsalud.isEnabled()) {

                    estsalud.setVisible(false);
                    estsalud.setEnabled(false);
                    infoaca.setVisible(true);
                    infoaca.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel10.setForeground(Color.red);

                } else if (inforfami.isEnabled()) {

                    inforfami.setVisible(false);
                    inforfami.setEnabled(false);
                    daper.setVisible(true);
                    daper.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(false);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel2.setForeground(Color.red);

                } else if (infoaca.isEnabled()) {
                    JOptionPane.showMessageDialog(null, "¡Ya se encuentra en uso!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);

                } else if (infofinan.isEnabled()) {

                    infofinan.setVisible(false);
                    infofinan.setEnabled(false);
                    infoaca.setVisible(true);
                    infoaca.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel10.setForeground(Color.red);

                } else if (casino.isEnabled()) {

                    casino.setVisible(false);
                    casino.setEnabled(false);
                    infoaca.setVisible(true);
                    infoaca.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel10.setForeground(Color.red);

                } else if (consbebidas.isEnabled()) {

                    consustan.ValidacionTipoExamen();
                    consbebidas.setVisible(false);
                    consbebidas.setEnabled(false);
                    infoaca.setVisible(true);
                    infoaca.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel10.setForeground(Color.red);

                } else if (consustan.isEnabled()) {

                    consustan.setVisible(false);
                    consustan.setEnabled(false);
                    infoaca.setVisible(true);
                    infoaca.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel10.setForeground(Color.red);

                } else if (antece.isEnabled()) {

                    antece.setVisible(false);
                    antece.setEnabled(false);
                    infoaca.setVisible(true);
                    infoaca.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel10.setForeground(Color.red);

                } else if (vinculos.isEnabled()) {

                    vinculos.setVisible(false);
                    vinculos.setEnabled(false);
                    falsifi.ValidacionTipoExamen();
                    infoaca.setVisible(true);
                    infoaca.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel10.setForeground(Color.red);

                } else if (falsifi.isEnabled()) {

                    falsifi.setVisible(false);
                    falsifi.setEnabled(false);
                    histlabo.ValidacionTipoExamen();
                    infoaca.setVisible(true);
                    infoaca.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel10.setForeground(Color.red);

                } else if (histlabo.isEnabled()) {

                    histlabo.setVisible(false);
                    histlabo.setEnabled(false);
                    infoaca.setVisible(true);
                    infoaca.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel10.setForeground(Color.red);

                } else if (planinfil.isEnabled()) {

                    planinfil.setVisible(false);
                    planinfil.setEnabled(false);
                    infoaca.setVisible(true);
                    infoaca.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel10.setForeground(Color.red);

                }

            } else //Especificooooooooooooooooooooooooooooooooooooooooooo
            if (DatosPrincipales.getTipoExamen().equals("Específico")) {
                if (daper.isEnabled()) {
                    Date fechavacia = DatoPersonal.fechanaci.getDate();
                    int age = Integer.parseInt(DatosPersonales.getEdad());
                    if (DatosPersonales.getEstrato().equals("-")) {
                        JOptionPane.showMessageDialog(null, "¡Seleccione el estrato del examinado!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else if (age < 17 || age > 70) {
                        JOptionPane.showMessageDialog(null, "¡La edad no se admite!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else if (DatoPersonal.cbxtipoiden.getSelectedItem().equals("Seleccione") || fechavacia == null || (DatoPersonal.txtnombre.getText().equals("") || "".equals(DatoPersonal.txtnombre.getText())) || (DatoPersonal.txtnoiden.getText().equals("") || "".equals(DatoPersonal.txtnoiden.getText())) || (DatoPersonal.txtexpedidos.getText().equals("") || "".equals(DatoPersonal.txtexpedidos.getText())) || (DatoPersonal.txtlugarnaci.getText().equals("") || "".equals(DatoPersonal.txtlugarnaci.getText())) || (DatoPersonal.txtdireccion.getText().equals("") || "".equals(DatoPersonal.txtdireccion.getText())) || (DatoPersonal.txtpersonasolicitante.getText().equals("") || "".equals(DatoPersonal.txtpersonasolicitante.getText())) || (DatoPersonal.txtcargosolicitante.getText().equals("") || "".equals(DatoPersonal.txtcargosolicitante.getText())) || (DatoPersonal.txtareaactual.getText().equals("") || "".equals(DatoPersonal.txtareaactual.getText())) || (DatoPersonal.txtcargoactual.getText().equals("") || "".equals(DatoPersonal.txtcargoactual.getText()))) {
                        JOptionPane.showMessageDialog(null, "¡Debe completar todos los parámetros para registrar los datos!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else if (DatosPersonales.getGenero().equals("-") || DatosPersonales.getGenero().equals("") || DatosPersonales.getGenero() == null) {
                        JOptionPane.showMessageDialog(null, "¡El género no ha sido seleccionado!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else {

                        nombreExamen();
                        nombreExamen.setText("Nombre examen: " + TecnicaYPreguntas.getNombreExamen());
                        daper.setVisible(false);
                        daper.setEnabled(false);
                        infoaca.setVisible(true);
                        infoaca.setEnabled(true);
                        DatoGeneral.fechaizquierda.setVisible(true);
                        DatoGeneral.fechaderecha.setVisible(true);
                        validarColor();
                        jLabel10.setForeground(Color.red);

                        if ("Sinconexion".equals(classes.Conexion.importante)) {
                            btnsave.setVisible(true);
                        } else if ("Conconexion".equals(classes.Conexion.importante)) {
                            if ("nuevo".equals(DatosPrincipales.getOpcionExamen())) {
                                dp.update_datosper();
                                DatosPersonales.setColorCategoria("con");
                                DatosPersonales.setValidacionRegistro("registrado");
                            }
                        }
                    }
                } else if (estsalud.isEnabled()) {

                    if (EstadoSalud.getEstado_salud().equals("-") || EstadoSalud.getEstado_salud().equals("")) {
                        JOptionPane.showMessageDialog(null, "¡Debe elegir el estado de salud para continuar!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else if (EstadoSalud.getProb_salud().equals("-") || EstadoSalud.getProb_salud().equals("")) {
                        JOptionPane.showMessageDialog(null, "¡Debe completar todos los parámetros para continuar con el examen!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else {
                        estsalud.setVisible(false);
                        estsalud.setEnabled(false);
                        infoaca.setVisible(true);
                        infoaca.setEnabled(true);
                        DatoGeneral.fechaizquierda.setVisible(true);
                        DatoGeneral.fechaderecha.setVisible(true);
                        validarColor();
                        jLabel10.setForeground(Color.red);

                        if ("Sinconexion".equals(classes.Conexion.importante)) {

                        } else if ("Conconexion".equals(classes.Conexion.importante)) {
                            if ("nuevo".equals(DatosPrincipales.getOpcionExamen())) {
                                es.update_estadosalud();
                                es.validarestadosalud();
                                EstadoSalud.setColorCategoria("con");
                            }
                        }
                    }

                } else if (inforfami.isEnabled()) {

                    inforfami.setVisible(false);
                    inforfami.setEnabled(false);
                    daper.setVisible(true);
                    daper.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(false);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel2.setForeground(Color.red);

                } else if (infoaca.isEnabled()) {
                    JOptionPane.showMessageDialog(null, "¡Ya se encuentra en uso!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);

                } else if (infofinan.isEnabled()) {

                    infofinan.setVisible(false);
                    infofinan.setEnabled(false);
                    infoaca.setVisible(true);
                    infoaca.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel10.setForeground(Color.red);

                } else if (consbebidas.isEnabled()) {

                    consustan.ValidacionTipoExamen();
                    consbebidas.setVisible(false);
                    consbebidas.setEnabled(false);
                    infoaca.setVisible(true);
                    infoaca.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel10.setForeground(Color.red);

                } else if (consustan.isEnabled()) {

                    consustan.setVisible(false);
                    consustan.setEnabled(false);
                    infoaca.setVisible(true);
                    infoaca.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel10.setForeground(Color.red);

                } else if (antece.isEnabled()) {

                    antece.setVisible(false);
                    antece.setEnabled(false);
                    infoaca.setVisible(true);
                    infoaca.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel10.setForeground(Color.red);

                } else if (vinculos.isEnabled()) {

                    vinculos.setVisible(false);
                    vinculos.setEnabled(false);
                    infoaca.setVisible(true);
                    infoaca.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel10.setForeground(Color.red);

                } else if (temain.isEnabled()) {

                    temain.setVisible(false);
                    temain.setEnabled(false);
                    infoaca.setVisible(true);
                    infoaca.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel10.setForeground(Color.red);

                }
            }
        }
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        //pre empleooooooooooooooooooooo
        if (DatosPersonales.getValidacionRegistro().equals("noregistrado")) {
            JOptionPane.showMessageDialog(null, "¡Debe guardar los datos básicos primero!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
        } else if (!EstadoSalud.getVisibilidadflecha().equals("esvisible")) {
            JOptionPane.showMessageDialog(null, "¡No apto en estado de salud!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
        } else {
            if (DatosPrincipales.getTipoExamen().equals("Pre-empleo")) {
                if (daper.isEnabled()) {
                    Date fechavacia = DatoPersonal.fechanaci.getDate();
                    int age = Integer.parseInt(DatosPersonales.getEdad());
                    if (DatosPersonales.getEstrato().equals("-")) {
                        JOptionPane.showMessageDialog(null, "¡Seleccione el estrato del examinado!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else if (age < 17 || age > 70) {
                        JOptionPane.showMessageDialog(null, "¡La edad no se admite!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else if (DatoPersonal.cbxtipoiden.getSelectedItem().equals("Seleccione") || fechavacia == null || (DatoPersonal.txtnombre.getText().equals("") || "".equals(DatoPersonal.txtnombre.getText())) || (DatoPersonal.txtnoiden.getText().equals("") || "".equals(DatoPersonal.txtnoiden.getText())) || (DatoPersonal.txtexpedidos.getText().equals("") || "".equals(DatoPersonal.txtexpedidos.getText())) || (DatoPersonal.txtlugarnaci.getText().equals("") || "".equals(DatoPersonal.txtlugarnaci.getText())) || (DatoPersonal.txtdireccion.getText().equals("") || "".equals(DatoPersonal.txtdireccion.getText())) || (DatoPersonal.txtcargoaspira.getText().equals("") || "".equals(DatoPersonal.txtcargoaspira.getText())) || (DatoPersonal.txtareaaspira.getText().equals("") || "".equals(DatoPersonal.txtareaaspira.getText())) || (DatoPersonal.txtpersonasolicitante.getText().equals("") || "".equals(DatoPersonal.txtpersonasolicitante.getText())) || (DatoPersonal.txtcargosolicitante.getText().equals("") || "".equals(DatoPersonal.txtcargosolicitante.getText()))) {
                        JOptionPane.showMessageDialog(null, "¡Debe completar todos los parámetros para registrar los datos!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else if (DatosPersonales.getGenero().equals("-") || DatosPersonales.getGenero().equals("") || DatosPersonales.getGenero() == null) {
                        JOptionPane.showMessageDialog(null, "¡El género no ha sido seleccionado!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else {

                        nombreExamen();
                        nombreExamen.setText("Nombre examen: " + TecnicaYPreguntas.getNombreExamen());
                        DatosPersonales.setColorCategoria("con");
                        daper.setVisible(false);
                        daper.setEnabled(false);
                        infofinan.setVisible(true);
                        infofinan.setEnabled(true);
                        DatoGeneral.fechaizquierda.setVisible(true);
                        DatoGeneral.fechaderecha.setVisible(true);
                        validarColor();
                        jLabel5.setForeground(Color.red);

                        if ("Sinconexion".equals(classes.Conexion.importante)) {
                            btnsave.setVisible(true);
                            DatosPersonales.setValidacionRegistro("registrado");
                        } else if ("Conconexion".equals(classes.Conexion.importante)) {
                            if ("nuevo".equals(DatosPrincipales.getOpcionExamen())) {
                                dp.update_datosper();
                                DatosPersonales.setValidacionRegistro("registrado");

                            }
                        }
                    }
                } else if (estsalud.isEnabled()) {

                    if (EstadoSalud.getEstado_salud().equals("-") || EstadoSalud.getEstado_salud().equals("")) {
                        JOptionPane.showMessageDialog(null, "¡Debe elegir el estado de salud para continuar!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else if (EstadoSalud.getProb_salud().equals("-") || EstadoSalud.getProb_salud().equals("")) {
                        JOptionPane.showMessageDialog(null, "¡Debe completar todos los parámetros para continuar con el examen!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else {
                        EstadoSalud.setColorCategoria("con");
                        estsalud.setVisible(false);
                        estsalud.setEnabled(false);
                        infofinan.setVisible(true);
                        infofinan.setEnabled(true);
                        DatoGeneral.fechaizquierda.setVisible(true);
                        DatoGeneral.fechaderecha.setVisible(true);
                        validarColor();
                        jLabel5.setForeground(Color.red);
                        if ("Sinconexion".equals(classes.Conexion.importante)) {

                        } else if ("Conconexion".equals(classes.Conexion.importante)) {
                            if ("nuevo".equals(DatosPrincipales.getOpcionExamen())) {
                                es.update_estadosalud();
                                es.validarestadosalud();

                            }
                        }
                    }

                } else if (inforfami.isEnabled()) {

                    inforfami.setVisible(false);
                    inforfami.setEnabled(false);
                    infofinan.setVisible(true);
                    infofinan.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel5.setForeground(Color.red);

                } else if (infoaca.isEnabled()) {

                    infoaca.setVisible(false);
                    infoaca.setEnabled(false);
                    infofinan.setVisible(true);
                    infofinan.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel5.setForeground(Color.red);

                } else if (infofinan.isEnabled()) {
                    JOptionPane.showMessageDialog(null, "¡Ya se encuntra en uso!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);

                } else if (casino.isEnabled()) {

                    casino.setVisible(false);
                    casino.setEnabled(false);
                    infofinan.setVisible(true);
                    infofinan.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel5.setForeground(Color.red);

                } else if (consbebidas.isEnabled()) {

                    consustan.ValidacionTipoExamen();
                    consbebidas.setVisible(false);
                    consbebidas.setEnabled(false);
                    infofinan.setVisible(true);
                    infofinan.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel5.setForeground(Color.red);

                } else if (consustan.isEnabled()) {

                    consustan.setVisible(false);
                    consustan.setEnabled(false);
                    infofinan.setVisible(true);
                    infofinan.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel5.setForeground(Color.red);

                } else if (antece.isEnabled()) {

                    antece.setVisible(false);
                    antece.setEnabled(false);
                    infofinan.setVisible(true);
                    infofinan.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel5.setForeground(Color.red);

                } else if (vinculos.isEnabled()) {

                    vinculos.setVisible(false);
                    vinculos.setEnabled(false);
                    infofinan.setVisible(true);
                    infofinan.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel5.setForeground(Color.red);

                } else if (falsifi.isEnabled()) {

                    falsifi.setVisible(false);
                    falsifi.setEnabled(false);
                    histlabo.ValidacionTipoExamen();
                    infofinan.setVisible(true);
                    infofinan.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel5.setForeground(Color.red);

                } else if (histlabo.isEnabled()) {

                    histlabo.setVisible(false);
                    histlabo.setEnabled(false);
                    infofinan.setVisible(true);
                    infofinan.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel5.setForeground(Color.red);

                } else if (planinfil.isEnabled()) {

                    planinfil.setVisible(false);
                    planinfil.setEnabled(false);
                    infofinan.setVisible(true);
                    infofinan.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel5.setForeground(Color.red);

                }
            } else //Rutina operacioneeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeees
            if (DatosPrincipales.getTipoExamen().equals("Rutina (operaciones)")) {
                if (daper.isEnabled()) {
                    Date fechavacia = DatoPersonal.fechanaci.getDate();
                    int age = Integer.parseInt(DatosPersonales.getEdad());
                    if (DatosPersonales.getEstrato().equals("-")) {
                        JOptionPane.showMessageDialog(null, "¡Seleccione el estrato del examinado!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else if (age < 17 || age > 70) {
                        JOptionPane.showMessageDialog(null, "¡La edad no se admite!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else if (DatosPersonales.getGenero().equals("-")) {
                        JOptionPane.showMessageDialog(null, "¡El género no ha sido seleccionado!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else if (DatosPrincipales.getMotivoExamen().equals("Procedimiento") && (DatoPersonal.cbxtipoiden.getSelectedItem().equals("Seleccione") || fechavacia == null || DatoPersonal.txtnombre.getText().equals("") || DatoPersonal.txtnoiden.getText().equals("") || DatoPersonal.txtexpedidos.getText().equals("") || DatoPersonal.txtlugarnaci.getText().equals("") || DatoPersonal.txtdireccion.getText().equals("") || DatoPersonal.txtcargoactual.getText().equals("") || DatoPersonal.txtareaactual.getText().equals("") || DatoPersonal.txtpersonasolicitante.getText().equals("") || DatoPersonal.txtcargosolicitante.getText().equals(""))) {

                        JOptionPane.showMessageDialog(null, "¡Debe completar todos los parámetros para registrar los datos!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);

                    } else if (DatosPrincipales.getMotivoExamen().equals("Ascenso") && (DatoPersonal.cbxtipoiden.getSelectedItem().equals("Seleccione") || fechavacia == null || (DatoPersonal.txtnombre.getText().equals("") || "".equals(DatoPersonal.txtnombre.getText())) || (DatoPersonal.txtnoiden.getText().equals("") || "".equals(DatoPersonal.txtnoiden.getText())) || (DatoPersonal.txtexpedidos.getText().equals("") || "".equals(DatoPersonal.txtexpedidos.getText())) || (DatoPersonal.txtlugarnaci.getText().equals("") || "".equals(DatoPersonal.txtlugarnaci.getText())) || (DatoPersonal.txtdireccion.getText().equals("") || "".equals(DatoPersonal.txtdireccion.getText())) || (DatoPersonal.txtcargoaspira.getText().equals("") || "".equals(DatoPersonal.txtcargoaspira.getText())) || (DatoPersonal.txtareaaspira.getText().equals("") || "".equals(DatoPersonal.txtareaaspira.getText())) || (DatoPersonal.txtcargoactual.getText().equals("") || "".equals(DatoPersonal.txtcargoactual.getText())) || (DatoPersonal.txtareaactual.getText().equals("") || "".equals(DatoPersonal.txtareaactual.getText())) || (DatoPersonal.txtpersonasolicitante.getText().equals("") || "".equals(DatoPersonal.txtpersonasolicitante.getText())) || (DatoPersonal.txtcargosolicitante.getText().equals("") || "".equals(DatoPersonal.txtcargosolicitante.getText())))) {

                        JOptionPane.showMessageDialog(null, "¡Debe completar todos los parámetros para registrar los datos!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);

                    } else {

                        nombreExamen();
                        nombreExamen.setText("Nombre examen: " + TecnicaYPreguntas.getNombreExamen());

                        daper.setVisible(false);
                        daper.setEnabled(false);
                        infofinan.setVisible(true);
                        infofinan.setEnabled(true);
                        DatoGeneral.fechaizquierda.setVisible(true);
                        DatoGeneral.fechaderecha.setVisible(true);
                        validarColor();
                        jLabel5.setForeground(Color.red);

                        DatoGeneral.fechaizquierda.setVisible(true);
                        if ("noesvisible".equals(EstadoSalud.getVisibilidadflecha())) {
                            DatoGeneral.fechaderecha.setVisible(false);
                        } else if ("esvisible".equals(EstadoSalud.getVisibilidadflecha())) {
                            DatoGeneral.fechaderecha.setVisible(true);
                        }

                        if ("Sinconexion".equals(classes.Conexion.importante)) {
                            btnsave.setVisible(true);
                        } else if ("Conconexion".equals(classes.Conexion.importante)) {
                            if ("nuevo".equals(DatosPrincipales.getOpcionExamen())) {
                                dp.update_datosper();
                                DatosPersonales.setColorCategoria("con");
                                DatosPersonales.setValidacionRegistro("registrado");
                            }
                        }
                    }
                } else if (estsalud.isEnabled()) {

                    if (EstadoSalud.getEstado_salud().equals("-") || EstadoSalud.getEstado_salud().equals("")) {
                        JOptionPane.showMessageDialog(null, "¡Debe elegir el estado de salud para continuar!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else if (EstadoSalud.getProb_salud().equals("-") || EstadoSalud.getProb_salud().equals("")) {
                        JOptionPane.showMessageDialog(null, "¡Debe completar todos los parámetros para continuar con el examen!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else {
                        estsalud.setVisible(false);
                        estsalud.setEnabled(false);
                        infofinan.setVisible(true);
                        infofinan.setEnabled(true);
                        DatoGeneral.fechaizquierda.setVisible(true);
                        DatoGeneral.fechaderecha.setVisible(true);
                        validarColor();
                        jLabel5.setForeground(Color.red);

                        if ("Sinconexion".equals(classes.Conexion.importante)) {

                        } else if ("Conconexion".equals(classes.Conexion.importante)) {
                            if ("nuevo".equals(DatosPrincipales.getOpcionExamen())) {
                                es.update_estadosalud();
                                es.validarestadosalud();
                                EstadoSalud.setColorCategoria("con");
                            }
                        }
                    }

                } else if (inforfami.isEnabled()) {

                    inforfami.setVisible(false);
                    inforfami.setEnabled(false);
                    infofinan.setVisible(true);
                    infofinan.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel5.setForeground(Color.red);

                } else if (infoaca.isEnabled()) {

                    infoaca.setVisible(false);
                    infoaca.setEnabled(false);
                    infofinan.setVisible(true);
                    infofinan.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel5.setForeground(Color.red);

                } else if (infofinan.isEnabled()) {
                    JOptionPane.showMessageDialog(null, "¡Ya se encuentra en uso!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);

                } else if (casino.isEnabled()) {

                    casino.setVisible(false);
                    casino.setEnabled(false);
                    infofinan.setVisible(true);
                    infofinan.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel5.setForeground(Color.red);

                } else if (consbebidas.isEnabled()) {

                    consustan.ValidacionTipoExamen();
                    consbebidas.setVisible(false);
                    consbebidas.setEnabled(false);
                    infofinan.setVisible(true);
                    infofinan.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel5.setForeground(Color.red);

                } else if (consustan.isEnabled()) {

                    consustan.setVisible(false);
                    consustan.setEnabled(false);
                    infofinan.setVisible(true);
                    infofinan.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel5.setForeground(Color.red);

                } else if (antece.isEnabled()) {

                    antece.setVisible(false);
                    antece.setEnabled(false);
                    infofinan.setVisible(true);
                    infofinan.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel5.setForeground(Color.red);

                } else if (vinculos.isEnabled()) {

                    vinculos.setVisible(false);
                    vinculos.setEnabled(false);
                    falsifi.ValidacionTipoExamen();
                    infofinan.setVisible(true);
                    infofinan.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel5.setForeground(Color.red);

                } else if (falsifi.isEnabled()) {

                    falsifi.setVisible(false);
                    falsifi.setEnabled(false);
//                        tecp.ValidacionTipoExamen();
                    infofinan.setVisible(true);
                    infofinan.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel5.setForeground(Color.red);

                }
            } else //Rutina administrativooooooooooooooooooooooooooooooooooooooooooooooos
            if (DatosPrincipales.getTipoExamen().equals("Rutina (admitivos)")) {

                if (daper.isEnabled()) {
                    Date fechavacia = DatoPersonal.fechanaci.getDate();
                    int age = Integer.parseInt(DatosPersonales.getEdad());
                    if (DatosPersonales.getEstrato().equals("-")) {
                        JOptionPane.showMessageDialog(null, "¡Seleccione el estrato del examinado!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else if (age < 17 || age > 70) {
                        JOptionPane.showMessageDialog(null, "¡La edad no se admite!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else if (DatosPersonales.getGenero().equals("-")) {
                        JOptionPane.showMessageDialog(null, "¡El género no ha sido seleccionado!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else {
                        if (DatosPrincipales.getMotivoExamen().equals("Procedimiento")) {
                            if (DatoPersonal.cbxtipoiden.getSelectedItem().equals("Seleccione") || fechavacia == null || DatoPersonal.txtnombre.getText().equals("") || DatoPersonal.txtnoiden.getText().equals("") || DatoPersonal.txtexpedidos.getText().equals("") || DatoPersonal.txtlugarnaci.getText().equals("") || DatoPersonal.txtdireccion.getText().equals("") || DatoPersonal.txtcargoactual.getText().equals("") || DatoPersonal.txtareaactual.getText().equals("") || DatoPersonal.txtpersonasolicitante.getText().equals("") || DatoPersonal.txtcargosolicitante.getText().equals("")) {
                                JOptionPane.showMessageDialog(null, "¡Debe completar todos los parámetros para registrar los datos!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                            }
                        } else if (DatosPrincipales.getMotivoExamen().equals("Ascenso")) {
                            if (DatoPersonal.cbxtipoiden.getSelectedItem().equals("Seleccione") || fechavacia == null || (DatoPersonal.txtnombre.getText().equals("") || "".equals(DatoPersonal.txtnombre.getText())) || (DatoPersonal.txtnoiden.getText().equals("") || "".equals(DatoPersonal.txtnoiden.getText())) || (DatoPersonal.txtexpedidos.getText().equals("") || "".equals(DatoPersonal.txtexpedidos.getText())) || (DatoPersonal.txtlugarnaci.getText().equals("") || "".equals(DatoPersonal.txtlugarnaci.getText())) || (DatoPersonal.txtdireccion.getText().equals("") || "".equals(DatoPersonal.txtdireccion.getText())) || (DatoPersonal.txtcargoaspira.getText().equals("") || "".equals(DatoPersonal.txtcargoaspira.getText())) || (DatoPersonal.txtareaaspira.getText().equals("") || "".equals(DatoPersonal.txtareaaspira.getText())) || (DatoPersonal.txtcargoactual.getText().equals("") || "".equals(DatoPersonal.txtcargoactual.getText())) || (DatoPersonal.txtareaactual.getText().equals("") || "".equals(DatoPersonal.txtareaactual.getText())) || (DatoPersonal.txtpersonasolicitante.getText().equals("") || "".equals(DatoPersonal.txtpersonasolicitante.getText())) || (DatoPersonal.txtcargosolicitante.getText().equals("") || "".equals(DatoPersonal.txtcargosolicitante.getText()))) {
                                JOptionPane.showMessageDialog(null, "¡Debe completar todos los parámetros para registrar los datos!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                            }
                        }
                        nombreExamen();
                        nombreExamen.setText("Nombre examen: " + TecnicaYPreguntas.getNombreExamen());
                        infofinan.setVisible(true);
                        infofinan.setEnabled(true);
                        DatoGeneral.fechaizquierda.setVisible(true);
                        DatoGeneral.fechaderecha.setVisible(true);
                        validarColor();
                        jLabel5.setForeground(Color.red);
                        DatoGeneral.fechaizquierda.setVisible(true);
                        if ("noesvisible".equals(EstadoSalud.getVisibilidadflecha())) {
                            DatoGeneral.fechaderecha.setVisible(false);
                        } else if ("esvisible".equals(EstadoSalud.getVisibilidadflecha())) {
                            DatoGeneral.fechaderecha.setVisible(true);
                        }

                        if ("Sinconexion".equals(classes.Conexion.importante)) {
                            btnsave.setVisible(true);
                        } else if ("Conconexion".equals(classes.Conexion.importante)) {
                            if ("nuevo".equals(DatosPrincipales.getOpcionExamen())) {
                                dp.update_datosper();
                                DatosPersonales.setColorCategoria("con");
                                DatosPersonales.setValidacionRegistro("registrado");
                            }
                        }
                    }
                } else if (estsalud.isEnabled()) {

                    if (EstadoSalud.getEstado_salud().equals("-") || EstadoSalud.getEstado_salud().equals("")) {
                        JOptionPane.showMessageDialog(null, "¡Debe elegir el estado de salud para continuar!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else if (EstadoSalud.getProb_salud().equals("-") || EstadoSalud.getProb_salud().equals("")) {
                        JOptionPane.showMessageDialog(null, "¡Debe completar todos los parámetros para continuar con el examen!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else {
                        estsalud.setVisible(false);
                        estsalud.setEnabled(false);
                        infofinan.setVisible(true);
                        infofinan.setEnabled(true);
                        DatoGeneral.fechaizquierda.setVisible(true);
                        DatoGeneral.fechaderecha.setVisible(true);
                        validarColor();
                        jLabel5.setForeground(Color.red);

                        if ("Sinconexion".equals(classes.Conexion.importante)) {

                        } else if ("Conconexion".equals(classes.Conexion.importante)) {
                            if ("nuevo".equals(DatosPrincipales.getOpcionExamen())) {
                                es.update_estadosalud();
                                es.validarestadosalud();
                                EstadoSalud.setColorCategoria("con");
                            }
                        }
                    }

                } else if (inforfami.isEnabled()) {

                    inforfami.setVisible(false);
                    inforfami.setEnabled(false);
                    infofinan.setVisible(true);
                    infofinan.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel5.setForeground(Color.red);

                } else if (infoaca.isEnabled()) {

                    infoaca.setVisible(false);
                    infoaca.setEnabled(false);
                    infofinan.setVisible(true);
                    infofinan.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel5.setForeground(Color.red);

                } else if (infofinan.isEnabled()) {
                    JOptionPane.showMessageDialog(null, "¡Ya se encuentra en uso!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);

                } else if (casino.isEnabled()) {

                    casino.setVisible(false);
                    casino.setEnabled(false);
                    infofinan.setVisible(true);
                    infofinan.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel5.setForeground(Color.red);

                } else if (consbebidas.isEnabled()) {

                    consustan.ValidacionTipoExamen();
                    consbebidas.setVisible(false);
                    consbebidas.setEnabled(false);
                    infofinan.setVisible(true);
                    infofinan.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel5.setForeground(Color.red);

                } else if (consustan.isEnabled()) {

                    consustan.setVisible(false);
                    consustan.setEnabled(false);
                    infofinan.setVisible(true);
                    infofinan.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel5.setForeground(Color.red);

                } else if (antece.isEnabled()) {

                    antece.setVisible(false);
                    antece.setEnabled(false);
                    infofinan.setVisible(true);
                    infofinan.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel5.setForeground(Color.red);

                } else if (vinculos.isEnabled()) {

                    vinculos.setVisible(false);
                    vinculos.setEnabled(false);
                    falsifi.ValidacionTipoExamen();
                    infofinan.setVisible(true);
                    infofinan.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel5.setForeground(Color.red);

                } else if (falsifi.isEnabled()) {

                    falsifi.setVisible(false);
                    falsifi.setEnabled(false);
                    histlabo.ValidacionTipoExamen();
                    infofinan.setVisible(true);
                    infofinan.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel5.setForeground(Color.red);

                } else if (histlabo.isEnabled()) {

                    histlabo.setVisible(false);
                    histlabo.setEnabled(false);
                    infofinan.setVisible(true);
                    infofinan.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel5.setForeground(Color.red);

                } else if (planinfil.isEnabled()) {

                    planinfil.setVisible(false);
                    planinfil.setEnabled(false);
                    infofinan.setVisible(true);
                    infofinan.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel5.setForeground(Color.red);
                }

            } else //Especificooooooooooooooooooooooooooooooooooooooooooo
            if (DatosPrincipales.getTipoExamen().equals("Específico")) {
                if (daper.isEnabled()) {
                    Date fechavacia = DatoPersonal.fechanaci.getDate();
                    int age = Integer.parseInt(DatosPersonales.getEdad());
                    if (DatosPersonales.getEstrato().equals("-")) {
                        JOptionPane.showMessageDialog(null, "¡Seleccione el estrato del examinado!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else if (age < 17 || age > 70) {
                        JOptionPane.showMessageDialog(null, "¡La edad no se admite!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else if (DatoPersonal.cbxtipoiden.getSelectedItem().equals("Seleccione") || fechavacia == null || (DatoPersonal.txtnombre.getText().equals("") || "".equals(DatoPersonal.txtnombre.getText())) || (DatoPersonal.txtnoiden.getText().equals("") || "".equals(DatoPersonal.txtnoiden.getText())) || (DatoPersonal.txtexpedidos.getText().equals("") || "".equals(DatoPersonal.txtexpedidos.getText())) || (DatoPersonal.txtlugarnaci.getText().equals("") || "".equals(DatoPersonal.txtlugarnaci.getText())) || (DatoPersonal.txtdireccion.getText().equals("") || "".equals(DatoPersonal.txtdireccion.getText())) || (DatoPersonal.txtpersonasolicitante.getText().equals("") || "".equals(DatoPersonal.txtpersonasolicitante.getText())) || (DatoPersonal.txtcargosolicitante.getText().equals("") || "".equals(DatoPersonal.txtcargosolicitante.getText())) || (DatoPersonal.txtareaactual.getText().equals("") || "".equals(DatoPersonal.txtareaactual.getText())) || (DatoPersonal.txtcargoactual.getText().equals("") || "".equals(DatoPersonal.txtcargoactual.getText()))) {
                        JOptionPane.showMessageDialog(null, "¡Debe completar todos los parámetros para registrar los datos!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else if (DatosPersonales.getGenero().equals("-") || DatosPersonales.getGenero().equals("") || DatosPersonales.getGenero() == null) {
                        JOptionPane.showMessageDialog(null, "¡El género no ha sido seleccionado!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else {

                        nombreExamen();
                        nombreExamen.setText("Nombre examen: " + TecnicaYPreguntas.getNombreExamen());
                        daper.setVisible(false);
                        daper.setEnabled(false);
                        infofinan.setVisible(true);
                        infofinan.setEnabled(true);
                        DatoGeneral.fechaizquierda.setVisible(true);
                        DatoGeneral.fechaderecha.setVisible(true);
                        validarColor();
                        jLabel5.setForeground(Color.red);

                        if ("Sinconexion".equals(classes.Conexion.importante)) {
                            btnsave.setVisible(true);
                        } else if ("Conconexion".equals(classes.Conexion.importante)) {
                            if ("nuevo".equals(DatosPrincipales.getOpcionExamen())) {
                                dp.update_datosper();
                                DatosPersonales.setColorCategoria("con");
                                DatosPersonales.setValidacionRegistro("registrado");
                            }
                        }
                    }
                } else if (estsalud.isEnabled()) {

                    if (EstadoSalud.getEstado_salud().equals("-") || EstadoSalud.getEstado_salud().equals("")) {
                        JOptionPane.showMessageDialog(null, "¡Debe elegir el estado de salud para continuar!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else if (EstadoSalud.getProb_salud().equals("-") || EstadoSalud.getProb_salud().equals("")) {
                        JOptionPane.showMessageDialog(null, "¡Debe completar todos los parámetros para continuar con el examen!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else {
                        estsalud.setVisible(false);
                        estsalud.setEnabled(false);
                        infofinan.setVisible(true);
                        infofinan.setEnabled(true);
                        DatoGeneral.fechaizquierda.setVisible(true);
                        DatoGeneral.fechaderecha.setVisible(true);
                        validarColor();
                        jLabel5.setForeground(Color.red);

                        if ("Sinconexion".equals(classes.Conexion.importante)) {

                        } else if ("Conconexion".equals(classes.Conexion.importante)) {
                            if ("nuevo".equals(DatosPrincipales.getOpcionExamen())) {
                                es.update_estadosalud();
                                es.validarestadosalud();
                                EstadoSalud.setColorCategoria("con");
                            }
                        }
                    }

                } else if (inforfami.isEnabled()) {

                    inforfami.setVisible(false);
                    inforfami.setEnabled(false);
                    infofinan.setVisible(true);
                    infofinan.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel5.setForeground(Color.red);

                } else if (infoaca.isEnabled()) {

                    infoaca.setVisible(false);
                    infoaca.setEnabled(false);
                    infofinan.setVisible(true);
                    infofinan.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel5.setForeground(Color.red);

                } else if (infofinan.isEnabled()) {
                    JOptionPane.showMessageDialog(null, "¡Ya se encuentra en uso!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);

                } else if (consbebidas.isEnabled()) {

                    consustan.ValidacionTipoExamen();
                    consbebidas.setVisible(false);
                    consbebidas.setEnabled(false);
                    infofinan.setVisible(true);
                    infofinan.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel5.setForeground(Color.red);

                } else if (consustan.isEnabled()) {

                    consustan.setVisible(false);
                    consustan.setEnabled(false);
                    infofinan.setVisible(true);
                    infofinan.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel5.setForeground(Color.red);

                } else if (antece.isEnabled()) {

                    antece.setVisible(false);
                    antece.setEnabled(false);
                    infofinan.setVisible(true);
                    infofinan.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel5.setForeground(Color.red);

                } else if (vinculos.isEnabled()) {

                    vinculos.setVisible(false);
                    vinculos.setEnabled(false);
                    infofinan.setVisible(true);
                    infofinan.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel5.setForeground(Color.red);

                } else if (temain.isEnabled()) {

                    temain.setVisible(false);
                    temain.setEnabled(false);
                    infofinan.setVisible(true);
                    infofinan.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel5.setForeground(Color.red);

                }
            }
        }
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        //pre empleooooooooooooooooooooo
        if (DatosPersonales.getValidacionRegistro().equals("noregistrado")) {
            JOptionPane.showMessageDialog(null, "¡Debe guardar los datos básicos primero!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
        } else if (!EstadoSalud.getVisibilidadflecha().equals("esvisible")) {
            JOptionPane.showMessageDialog(null, "¡No apto en estado de salud!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
        } else {
            if (DatosPrincipales.getTipoExamen().equals("Pre-empleo")) {
                if (daper.isEnabled()) {
                    Date fechavacia = DatoPersonal.fechanaci.getDate();
                    int age = Integer.parseInt(DatosPersonales.getEdad());
                    if (DatosPersonales.getEstrato().equals("-")) {
                        JOptionPane.showMessageDialog(null, "¡Seleccione el estrato del examinado!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else if (age < 17 || age > 70) {
                        JOptionPane.showMessageDialog(null, "¡La edad no se admite!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else if (DatoPersonal.cbxtipoiden.getSelectedItem().equals("Seleccione") || fechavacia == null || (DatoPersonal.txtnombre.getText().equals("") || "".equals(DatoPersonal.txtnombre.getText())) || (DatoPersonal.txtnoiden.getText().equals("") || "".equals(DatoPersonal.txtnoiden.getText())) || (DatoPersonal.txtexpedidos.getText().equals("") || "".equals(DatoPersonal.txtexpedidos.getText())) || (DatoPersonal.txtlugarnaci.getText().equals("") || "".equals(DatoPersonal.txtlugarnaci.getText())) || (DatoPersonal.txtdireccion.getText().equals("") || "".equals(DatoPersonal.txtdireccion.getText())) || (DatoPersonal.txtcargoaspira.getText().equals("") || "".equals(DatoPersonal.txtcargoaspira.getText())) || (DatoPersonal.txtareaaspira.getText().equals("") || "".equals(DatoPersonal.txtareaaspira.getText())) || (DatoPersonal.txtpersonasolicitante.getText().equals("") || "".equals(DatoPersonal.txtpersonasolicitante.getText())) || (DatoPersonal.txtcargosolicitante.getText().equals("") || "".equals(DatoPersonal.txtcargosolicitante.getText()))) {
                        JOptionPane.showMessageDialog(null, "¡Debe completar todos los parámetros para registrar los datos!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else if (DatosPersonales.getGenero().equals("-") || DatosPersonales.getGenero().equals("") || DatosPersonales.getGenero() == null) {
                        JOptionPane.showMessageDialog(null, "¡El género no ha sido seleccionado!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else {

                        nombreExamen();
                        nombreExamen.setText("Nombre examen: " + TecnicaYPreguntas.getNombreExamen());
                        DatosPersonales.setColorCategoria("con");
                        daper.setVisible(false);
                        daper.setEnabled(false);
                        casino.setVisible(true);
                        casino.setEnabled(true);
                        DatoGeneral.fechaizquierda.setVisible(true);
                        DatoGeneral.fechaderecha.setVisible(true);
                        validarColor();
                        jLabel13.setForeground(Color.red);

                        if ("Sinconexion".equals(classes.Conexion.importante)) {
                            btnsave.setVisible(true);
                            DatosPersonales.setValidacionRegistro("registrado");
                        } else if ("Conconexion".equals(classes.Conexion.importante)) {
                            if ("nuevo".equals(DatosPrincipales.getOpcionExamen())) {
                                dp.update_datosper();
                                DatosPersonales.setValidacionRegistro("registrado");

                            }
                        }
                    }
                } else if (estsalud.isEnabled()) {

                    if (EstadoSalud.getEstado_salud().equals("-") || EstadoSalud.getEstado_salud().equals("")) {
                        JOptionPane.showMessageDialog(null, "¡Debe elegir el estado de salud para continuar!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else if (EstadoSalud.getProb_salud().equals("-") || EstadoSalud.getProb_salud().equals("")) {
                        JOptionPane.showMessageDialog(null, "¡Debe completar todos los parámetros para continuar con el examen!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else {
                        EstadoSalud.setColorCategoria("con");
                        estsalud.setVisible(false);
                        estsalud.setEnabled(false);
                        casino.setVisible(true);
                        casino.setEnabled(true);
                        DatoGeneral.fechaizquierda.setVisible(true);
                        DatoGeneral.fechaderecha.setVisible(true);
                        validarColor();
                        jLabel13.setForeground(Color.red);
                        if ("Sinconexion".equals(classes.Conexion.importante)) {

                        } else if ("Conconexion".equals(classes.Conexion.importante)) {
                            if ("nuevo".equals(DatosPrincipales.getOpcionExamen())) {
                                es.update_estadosalud();
                                es.validarestadosalud();

                            }
                        }
                    }

                } else if (inforfami.isEnabled()) {

                    inforfami.setVisible(false);
                    inforfami.setEnabled(false);
                    casino.setVisible(true);
                    casino.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel13.setForeground(Color.red);

                } else if (infoaca.isEnabled()) {

                    infoaca.setVisible(false);
                    infoaca.setEnabled(false);
                    casino.setVisible(true);
                    casino.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel13.setForeground(Color.red);

                } else if (infofinan.isEnabled()) {

                    infofinan.setVisible(false);
                    infofinan.setEnabled(false);
                    casino.setVisible(true);
                    casino.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel13.setForeground(Color.red);

                } else if (casino.isEnabled()) {

                    JOptionPane.showMessageDialog(null, "¡Ya se encuentra en uso!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);

                } else if (consbebidas.isEnabled()) {

                    consustan.ValidacionTipoExamen();
                    consbebidas.setVisible(false);
                    consbebidas.setEnabled(false);
                    casino.setVisible(true);
                    casino.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel13.setForeground(Color.red);

                } else if (consustan.isEnabled()) {

                    consustan.setVisible(false);
                    consustan.setEnabled(false);
                    casino.setVisible(true);
                    casino.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel13.setForeground(Color.red);

                } else if (antece.isEnabled()) {

                    antece.setVisible(false);
                    antece.setEnabled(false);
                    casino.setVisible(true);
                    casino.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel13.setForeground(Color.red);

                } else if (vinculos.isEnabled()) {

                    vinculos.setVisible(false);
                    vinculos.setEnabled(false);
                    casino.setVisible(true);
                    casino.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel13.setForeground(Color.red);

                } else if (falsifi.isEnabled()) {

                    falsifi.setVisible(false);
                    falsifi.setEnabled(false);
                    histlabo.ValidacionTipoExamen();
                    casino.setVisible(true);
                    casino.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel13.setForeground(Color.red);

                } else if (histlabo.isEnabled()) {

                    histlabo.setVisible(false);
                    histlabo.setEnabled(false);
                    casino.setVisible(true);
                    casino.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel13.setForeground(Color.red);

                } else if (planinfil.isEnabled()) {

                    planinfil.setVisible(false);
                    planinfil.setEnabled(false);
                    casino.setVisible(true);
                    casino.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel13.setForeground(Color.red);

                }
            } else //Rutina operacioneeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeees
            if (DatosPrincipales.getTipoExamen().equals("Rutina (operaciones)")) {
                if (daper.isEnabled()) {
                    Date fechavacia = DatoPersonal.fechanaci.getDate();
                    int age = Integer.parseInt(DatosPersonales.getEdad());
                    if (DatosPersonales.getEstrato().equals("-")) {
                        JOptionPane.showMessageDialog(null, "¡Seleccione el estrato del examinado!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else if (age < 17 || age > 70) {
                        JOptionPane.showMessageDialog(null, "¡La edad no se admite!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else if (DatosPersonales.getGenero().equals("-")) {
                        JOptionPane.showMessageDialog(null, "¡El género no ha sido seleccionado!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else if (DatosPrincipales.getMotivoExamen().equals("Procedimiento") && (DatoPersonal.cbxtipoiden.getSelectedItem().equals("Seleccione") || fechavacia == null || DatoPersonal.txtnombre.getText().equals("") || DatoPersonal.txtnoiden.getText().equals("") || DatoPersonal.txtexpedidos.getText().equals("") || DatoPersonal.txtlugarnaci.getText().equals("") || DatoPersonal.txtdireccion.getText().equals("") || DatoPersonal.txtcargoactual.getText().equals("") || DatoPersonal.txtareaactual.getText().equals("") || DatoPersonal.txtpersonasolicitante.getText().equals("") || DatoPersonal.txtcargosolicitante.getText().equals(""))) {

                        JOptionPane.showMessageDialog(null, "¡Debe completar todos los parámetros para registrar los datos!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);

                    } else if (DatosPrincipales.getMotivoExamen().equals("Ascenso") && (DatoPersonal.cbxtipoiden.getSelectedItem().equals("Seleccione") || fechavacia == null || (DatoPersonal.txtnombre.getText().equals("") || "".equals(DatoPersonal.txtnombre.getText())) || (DatoPersonal.txtnoiden.getText().equals("") || "".equals(DatoPersonal.txtnoiden.getText())) || (DatoPersonal.txtexpedidos.getText().equals("") || "".equals(DatoPersonal.txtexpedidos.getText())) || (DatoPersonal.txtlugarnaci.getText().equals("") || "".equals(DatoPersonal.txtlugarnaci.getText())) || (DatoPersonal.txtdireccion.getText().equals("") || "".equals(DatoPersonal.txtdireccion.getText())) || (DatoPersonal.txtcargoaspira.getText().equals("") || "".equals(DatoPersonal.txtcargoaspira.getText())) || (DatoPersonal.txtareaaspira.getText().equals("") || "".equals(DatoPersonal.txtareaaspira.getText())) || (DatoPersonal.txtcargoactual.getText().equals("") || "".equals(DatoPersonal.txtcargoactual.getText())) || (DatoPersonal.txtareaactual.getText().equals("") || "".equals(DatoPersonal.txtareaactual.getText())) || (DatoPersonal.txtpersonasolicitante.getText().equals("") || "".equals(DatoPersonal.txtpersonasolicitante.getText())) || (DatoPersonal.txtcargosolicitante.getText().equals("") || "".equals(DatoPersonal.txtcargosolicitante.getText())))) {

                        JOptionPane.showMessageDialog(null, "¡Debe completar todos los parámetros para registrar los datos!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);

                    } else {

                        nombreExamen();
                        nombreExamen.setText("Nombre examen: " + TecnicaYPreguntas.getNombreExamen());

                        daper.setVisible(false);
                        daper.setEnabled(false);
                        casino.setVisible(true);
                        casino.setEnabled(true);
                        DatoGeneral.fechaizquierda.setVisible(true);
                        DatoGeneral.fechaderecha.setVisible(true);
                        validarColor();
                        jLabel13.setForeground(Color.red);

                        if ("Sinconexion".equals(classes.Conexion.importante)) {
                            btnsave.setVisible(true);
                        } else if ("Conconexion".equals(classes.Conexion.importante)) {
                            if ("nuevo".equals(DatosPrincipales.getOpcionExamen())) {
                                dp.update_datosper();
                                DatosPersonales.setColorCategoria("con");
                                DatosPersonales.setValidacionRegistro("registrado");
                            }
                        }
                    }
                } else if (estsalud.isEnabled()) {

                    if (EstadoSalud.getEstado_salud().equals("-") || EstadoSalud.getEstado_salud().equals("")) {
                        JOptionPane.showMessageDialog(null, "¡Debe elegir el estado de salud para continuar!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else if (EstadoSalud.getProb_salud().equals("-") || EstadoSalud.getProb_salud().equals("")) {
                        JOptionPane.showMessageDialog(null, "¡Debe completar todos los parámetros para continuar con el examen!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else {
                        estsalud.setVisible(false);
                        estsalud.setEnabled(false);
                        casino.setVisible(true);
                        casino.setEnabled(true);
                        DatoGeneral.fechaizquierda.setVisible(true);
                        DatoGeneral.fechaderecha.setVisible(true);
                        validarColor();
                        jLabel13.setForeground(Color.red);

                        if ("Sinconexion".equals(classes.Conexion.importante)) {

                        } else if ("Conconexion".equals(classes.Conexion.importante)) {
                            if ("nuevo".equals(DatosPrincipales.getOpcionExamen())) {
                                es.update_estadosalud();
                                es.validarestadosalud();
                                EstadoSalud.setColorCategoria("con");
                            }
                        }
                    }

                } else if (inforfami.isEnabled()) {

                    inforfami.setVisible(false);
                    inforfami.setEnabled(false);
                    casino.setVisible(true);
                    casino.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel13.setForeground(Color.red);

                } else if (infoaca.isEnabled()) {

                    infoaca.setVisible(false);
                    infoaca.setEnabled(false);
                    casino.setVisible(true);
                    casino.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel13.setForeground(Color.red);

                } else if (infofinan.isEnabled()) {

                    infofinan.setVisible(false);
                    infofinan.setEnabled(false);
                    casino.setVisible(true);
                    casino.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel13.setForeground(Color.red);

                } else if (casino.isEnabled()) {

                    JOptionPane.showMessageDialog(null, "¡Ya se encuentra en uso!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);

                } else if (consbebidas.isEnabled()) {

                    consustan.ValidacionTipoExamen();
                    consbebidas.setVisible(false);
                    consbebidas.setEnabled(false);
                    casino.setVisible(true);
                    casino.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel13.setForeground(Color.red);

                } else if (consustan.isEnabled()) {

                    consustan.setVisible(false);
                    consustan.setEnabled(false);
                    casino.setVisible(true);
                    casino.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel13.setForeground(Color.red);

                } else if (antece.isEnabled()) {

                    antece.setVisible(false);
                    antece.setEnabled(false);
                    casino.setVisible(true);
                    casino.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel13.setForeground(Color.red);

                } else if (vinculos.isEnabled()) {

                    vinculos.setVisible(false);
                    vinculos.setEnabled(false);
                    falsifi.ValidacionTipoExamen();
                    casino.setVisible(true);
                    casino.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel13.setForeground(Color.red);

                } else if (falsifi.isEnabled()) {

                    falsifi.setVisible(false);
                    falsifi.setEnabled(false);
//                        tecp.ValidacionTipoExamen();
                    casino.setVisible(true);
                    casino.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel13.setForeground(Color.red);

                }
            } else //Rutina administrativooooooooooooooooooooooooooooooooooooooooooooooos
            if (DatosPrincipales.getTipoExamen().equals("Rutina (admitivos)")) {

                if (daper.isEnabled()) {
                    Date fechavacia = DatoPersonal.fechanaci.getDate();
                    int age = Integer.parseInt(DatosPersonales.getEdad());
                    if (DatosPersonales.getEstrato().equals("-")) {
                        JOptionPane.showMessageDialog(null, "¡Seleccione el estrato del examinado!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else if (age < 17 || age > 70) {
                        JOptionPane.showMessageDialog(null, "¡La edad no se admite!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else if (DatosPersonales.getGenero().equals("-")) {
                        JOptionPane.showMessageDialog(null, "¡El género no ha sido seleccionado!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else {
                        if (DatosPrincipales.getMotivoExamen().equals("Procedimiento")) {
                            if (DatoPersonal.cbxtipoiden.getSelectedItem().equals("Seleccione") || fechavacia == null || DatoPersonal.txtnombre.getText().equals("") || DatoPersonal.txtnoiden.getText().equals("") || DatoPersonal.txtexpedidos.getText().equals("") || DatoPersonal.txtlugarnaci.getText().equals("") || DatoPersonal.txtdireccion.getText().equals("") || DatoPersonal.txtcargoactual.getText().equals("") || DatoPersonal.txtareaactual.getText().equals("") || DatoPersonal.txtpersonasolicitante.getText().equals("") || DatoPersonal.txtcargosolicitante.getText().equals("")) {
                                JOptionPane.showMessageDialog(null, "¡Debe completar todos los parámetros para registrar los datos!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                            }
                        } else if (DatosPrincipales.getMotivoExamen().equals("Ascenso")) {
                            if (DatoPersonal.cbxtipoiden.getSelectedItem().equals("Seleccione") || fechavacia == null || (DatoPersonal.txtnombre.getText().equals("") || "".equals(DatoPersonal.txtnombre.getText())) || (DatoPersonal.txtnoiden.getText().equals("") || "".equals(DatoPersonal.txtnoiden.getText())) || (DatoPersonal.txtexpedidos.getText().equals("") || "".equals(DatoPersonal.txtexpedidos.getText())) || (DatoPersonal.txtlugarnaci.getText().equals("") || "".equals(DatoPersonal.txtlugarnaci.getText())) || (DatoPersonal.txtdireccion.getText().equals("") || "".equals(DatoPersonal.txtdireccion.getText())) || (DatoPersonal.txtcargoaspira.getText().equals("") || "".equals(DatoPersonal.txtcargoaspira.getText())) || (DatoPersonal.txtareaaspira.getText().equals("") || "".equals(DatoPersonal.txtareaaspira.getText())) || (DatoPersonal.txtcargoactual.getText().equals("") || "".equals(DatoPersonal.txtcargoactual.getText())) || (DatoPersonal.txtareaactual.getText().equals("") || "".equals(DatoPersonal.txtareaactual.getText())) || (DatoPersonal.txtpersonasolicitante.getText().equals("") || "".equals(DatoPersonal.txtpersonasolicitante.getText())) || (DatoPersonal.txtcargosolicitante.getText().equals("") || "".equals(DatoPersonal.txtcargosolicitante.getText()))) {
                                JOptionPane.showMessageDialog(null, "¡Debe completar todos los parámetros para registrar los datos!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                            }
                        }
                        nombreExamen();
                        nombreExamen.setText("Nombre examen: " + TecnicaYPreguntas.getNombreExamen());
                        daper.setVisible(false);
                        daper.setEnabled(false);
                        casino.setVisible(true);
                        casino.setEnabled(true);
                        DatoGeneral.fechaizquierda.setVisible(true);
                        DatoGeneral.fechaderecha.setVisible(true);
                        validarColor();
                        jLabel13.setForeground(Color.red);

                        if ("Sinconexion".equals(classes.Conexion.importante)) {
                            btnsave.setVisible(true);
                        } else if ("Conconexion".equals(classes.Conexion.importante)) {
                            if ("nuevo".equals(DatosPrincipales.getOpcionExamen())) {
                                dp.update_datosper();
                                DatosPersonales.setColorCategoria("con");
                                DatosPersonales.setValidacionRegistro("registrado");
                            }
                        }
                    }
                } else if (estsalud.isEnabled()) {

                    if (EstadoSalud.getEstado_salud().equals("-") || EstadoSalud.getEstado_salud().equals("")) {
                        JOptionPane.showMessageDialog(null, "¡Debe elegir el estado de salud para continuar!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else if (EstadoSalud.getProb_salud().equals("-") || EstadoSalud.getProb_salud().equals("")) {
                        JOptionPane.showMessageDialog(null, "¡Debe completar todos los parámetros para continuar con el examen!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else {
                        estsalud.setVisible(false);
                        estsalud.setEnabled(false);
                        casino.setVisible(true);
                        casino.setEnabled(true);
                        DatoGeneral.fechaizquierda.setVisible(true);
                        DatoGeneral.fechaderecha.setVisible(true);
                        validarColor();
                        jLabel13.setForeground(Color.red);

                        if ("Sinconexion".equals(classes.Conexion.importante)) {

                        } else if ("Conconexion".equals(classes.Conexion.importante)) {
                            if ("nuevo".equals(DatosPrincipales.getOpcionExamen())) {
                                es.update_estadosalud();
                                es.validarestadosalud();
                                EstadoSalud.setColorCategoria("con");
                            }
                        }
                    }

                } else if (inforfami.isEnabled()) {

                    inforfami.setVisible(false);
                    inforfami.setEnabled(false);
                    casino.setVisible(true);
                    casino.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel13.setForeground(Color.red);

                } else if (infoaca.isEnabled()) {

                    infoaca.setVisible(false);
                    infoaca.setEnabled(false);
                    casino.setVisible(true);
                    casino.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel13.setForeground(Color.red);

                } else if (infofinan.isEnabled()) {

                    infofinan.setVisible(false);
                    infofinan.setEnabled(false);
                    casino.setVisible(true);
                    casino.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel13.setForeground(Color.red);

                } else if (casino.isEnabled()) {
                    JOptionPane.showMessageDialog(null, "¡Ya se encuentra en uso!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);

                } else if (consbebidas.isEnabled()) {

                    consustan.ValidacionTipoExamen();
                    consbebidas.setVisible(false);
                    consbebidas.setEnabled(false);
                    casino.setVisible(true);
                    casino.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel13.setForeground(Color.red);

                } else if (consustan.isEnabled()) {

                    consustan.setVisible(false);
                    consustan.setEnabled(false);
                    casino.setVisible(true);
                    casino.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel13.setForeground(Color.red);

                } else if (antece.isEnabled()) {

                    antece.setVisible(false);
                    antece.setEnabled(false);
                    casino.setVisible(true);
                    casino.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel13.setForeground(Color.red);

                } else if (vinculos.isEnabled()) {

                    vinculos.setVisible(false);
                    vinculos.setEnabled(false);
                    falsifi.ValidacionTipoExamen();
                    casino.setVisible(true);
                    casino.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel13.setForeground(Color.red);

                } else if (falsifi.isEnabled()) {

                    falsifi.setVisible(false);
                    falsifi.setEnabled(false);
                    histlabo.ValidacionTipoExamen();
                    casino.setVisible(true);
                    casino.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel13.setForeground(Color.red);

                } else if (histlabo.isEnabled()) {

                    histlabo.setVisible(false);
                    histlabo.setEnabled(false);
                    casino.setVisible(true);
                    casino.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel13.setForeground(Color.red);

                } else if (planinfil.isEnabled()) {

                    planinfil.setVisible(false);
                    planinfil.setEnabled(false);
                    casino.setVisible(true);
                    casino.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel13.setForeground(Color.red);
                }

            } else //Especificooooooooooooooooooooooooooooooooooooooooooo
            if (DatosPrincipales.getTipoExamen().equals("Específico")) {
                if (daper.isEnabled()) {
                    Date fechavacia = DatoPersonal.fechanaci.getDate();
                    int age = Integer.parseInt(DatosPersonales.getEdad());
                    if (DatosPersonales.getEstrato().equals("-")) {
                        JOptionPane.showMessageDialog(null, "¡Seleccione el estrato del examinado!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else if (age < 17 || age > 70) {
                        JOptionPane.showMessageDialog(null, "¡La edad no se admite!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else if (DatoPersonal.cbxtipoiden.getSelectedItem().equals("Seleccione") || fechavacia == null || (DatoPersonal.txtnombre.getText().equals("") || "".equals(DatoPersonal.txtnombre.getText())) || (DatoPersonal.txtnoiden.getText().equals("") || "".equals(DatoPersonal.txtnoiden.getText())) || (DatoPersonal.txtexpedidos.getText().equals("") || "".equals(DatoPersonal.txtexpedidos.getText())) || (DatoPersonal.txtlugarnaci.getText().equals("") || "".equals(DatoPersonal.txtlugarnaci.getText())) || (DatoPersonal.txtdireccion.getText().equals("") || "".equals(DatoPersonal.txtdireccion.getText())) || (DatoPersonal.txtpersonasolicitante.getText().equals("") || "".equals(DatoPersonal.txtpersonasolicitante.getText())) || (DatoPersonal.txtcargosolicitante.getText().equals("") || "".equals(DatoPersonal.txtcargosolicitante.getText())) || (DatoPersonal.txtareaactual.getText().equals("") || "".equals(DatoPersonal.txtareaactual.getText())) || (DatoPersonal.txtcargoactual.getText().equals("") || "".equals(DatoPersonal.txtcargoactual.getText()))) {
                        JOptionPane.showMessageDialog(null, "¡Debe completar todos los parámetros para registrar los datos!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else if (DatosPersonales.getGenero().equals("-") || DatosPersonales.getGenero().equals("") || DatosPersonales.getGenero() == null) {
                        JOptionPane.showMessageDialog(null, "¡El género no ha sido seleccionado!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else {

                        nombreExamen();
                        nombreExamen.setText("Nombre examen: " + TecnicaYPreguntas.getNombreExamen());
                        daper.setVisible(false);
                        daper.setEnabled(false);
                        casino.setVisible(true);
                        casino.setEnabled(true);
                        DatoGeneral.fechaizquierda.setVisible(true);
                        DatoGeneral.fechaderecha.setVisible(true);
                        validarColor();
                        jLabel13.setForeground(Color.red);

                        if ("Sinconexion".equals(classes.Conexion.importante)) {
                            btnsave.setVisible(true);
                        } else if ("Conconexion".equals(classes.Conexion.importante)) {
                            if ("nuevo".equals(DatosPrincipales.getOpcionExamen())) {
                                dp.update_datosper();
                                DatosPersonales.setColorCategoria("con");
                                DatosPersonales.setValidacionRegistro("registrado");
                            }
                        }
                    }
                } else if (estsalud.isEnabled()) {

                    if (EstadoSalud.getEstado_salud().equals("-") || EstadoSalud.getEstado_salud().equals("")) {
                        JOptionPane.showMessageDialog(null, "¡Debe elegir el estado de salud para continuar!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else if (EstadoSalud.getProb_salud().equals("-") || EstadoSalud.getProb_salud().equals("")) {
                        JOptionPane.showMessageDialog(null, "¡Debe completar todos los parámetros para continuar con el examen!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else {
                        estsalud.setVisible(false);
                        estsalud.setEnabled(false);
                        casino.setVisible(true);
                        casino.setEnabled(true);
                        DatoGeneral.fechaizquierda.setVisible(true);
                        DatoGeneral.fechaderecha.setVisible(true);
                        validarColor();
                        jLabel13.setForeground(Color.red);

                        if ("Sinconexion".equals(classes.Conexion.importante)) {

                        } else if ("Conconexion".equals(classes.Conexion.importante)) {
                            if ("nuevo".equals(DatosPrincipales.getOpcionExamen())) {
                                es.update_estadosalud();
                                es.validarestadosalud();
                                EstadoSalud.setColorCategoria("con");
                            }
                        }
                    }

                } else if (inforfami.isEnabled()) {

                    inforfami.setVisible(false);
                    inforfami.setEnabled(false);
                    casino.setVisible(true);
                    casino.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel13.setForeground(Color.red);

                } else if (infoaca.isEnabled()) {

                    infoaca.setVisible(false);
                    infoaca.setEnabled(false);
                    casino.setVisible(true);
                    casino.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel13.setForeground(Color.red);

                } else if (infofinan.isEnabled()) {

                    infofinan.setVisible(false);
                    infofinan.setEnabled(false);
                    casino.setVisible(true);
                    casino.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel13.setForeground(Color.red);

                } else if (consbebidas.isEnabled()) {

                    consustan.ValidacionTipoExamen();
                    consbebidas.setVisible(false);
                    consbebidas.setEnabled(false);
                    casino.setVisible(true);
                    casino.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel13.setForeground(Color.red);

                } else if (consustan.isEnabled()) {

                    consustan.setVisible(false);
                    consustan.setEnabled(false);
                    casino.setVisible(true);
                    casino.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel13.setForeground(Color.red);

                } else if (antece.isEnabled()) {

                    antece.setVisible(false);
                    antece.setEnabled(false);
                    casino.setVisible(true);
                    casino.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel13.setForeground(Color.red);

                } else if (vinculos.isEnabled()) {

                    vinculos.setVisible(false);
                    vinculos.setEnabled(false);
                    casino.setVisible(true);
                    casino.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel13.setForeground(Color.red);

                } else if (temain.isEnabled()) {

                    temain.setVisible(false);
                    temain.setEnabled(false);
                    casino.setVisible(true);
                    casino.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel13.setForeground(Color.red);

                }
            }
        }
    }//GEN-LAST:event_jLabel13MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        //pre empleooooooooooooooooooooo
        if (DatosPersonales.getValidacionRegistro().equals("noregistrado")) {
            JOptionPane.showMessageDialog(null, "¡Debe guardar los datos básicos primero!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
        } else if (!EstadoSalud.getVisibilidadflecha().equals("esvisible")) {
            JOptionPane.showMessageDialog(null, "¡No apto en estado de salud!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
        } else {
            if (DatosPrincipales.getTipoExamen().equals("Pre-empleo")) {
                if (daper.isEnabled()) {
                    Date fechavacia = DatoPersonal.fechanaci.getDate();
                    int age = Integer.parseInt(DatosPersonales.getEdad());
                    if (DatosPersonales.getEstrato().equals("-")) {
                        JOptionPane.showMessageDialog(null, "¡Seleccione el estrato del examinado!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else if (age < 17 || age > 70) {
                        JOptionPane.showMessageDialog(null, "¡La edad no se admite!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else if (DatoPersonal.cbxtipoiden.getSelectedItem().equals("Seleccione") || fechavacia == null || (DatoPersonal.txtnombre.getText().equals("") || "".equals(DatoPersonal.txtnombre.getText())) || (DatoPersonal.txtnoiden.getText().equals("") || "".equals(DatoPersonal.txtnoiden.getText())) || (DatoPersonal.txtexpedidos.getText().equals("") || "".equals(DatoPersonal.txtexpedidos.getText())) || (DatoPersonal.txtlugarnaci.getText().equals("") || "".equals(DatoPersonal.txtlugarnaci.getText())) || (DatoPersonal.txtdireccion.getText().equals("") || "".equals(DatoPersonal.txtdireccion.getText())) || (DatoPersonal.txtcargoaspira.getText().equals("") || "".equals(DatoPersonal.txtcargoaspira.getText())) || (DatoPersonal.txtareaaspira.getText().equals("") || "".equals(DatoPersonal.txtareaaspira.getText())) || (DatoPersonal.txtpersonasolicitante.getText().equals("") || "".equals(DatoPersonal.txtpersonasolicitante.getText())) || (DatoPersonal.txtcargosolicitante.getText().equals("") || "".equals(DatoPersonal.txtcargosolicitante.getText()))) {
                        JOptionPane.showMessageDialog(null, "¡Debe completar todos los parámetros para registrar los datos!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else if (DatosPersonales.getGenero().equals("-") || DatosPersonales.getGenero().equals("") || DatosPersonales.getGenero() == null) {
                        JOptionPane.showMessageDialog(null, "¡El género no ha sido seleccionado!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else {

                        nombreExamen();
                        nombreExamen.setText("Nombre examen: " + TecnicaYPreguntas.getNombreExamen());
                        DatosPersonales.setColorCategoria("con");
                        daper.setVisible(false);
                        daper.setEnabled(false);
                        consbebidas.setVisible(true);
                        consbebidas.setEnabled(true);
                        DatoGeneral.fechaizquierda.setVisible(true);
                        DatoGeneral.fechaderecha.setVisible(true);
                        validarColor();
                        jLabel6.setForeground(Color.red);

                        if ("Sinconexion".equals(classes.Conexion.importante)) {
                            btnsave.setVisible(true);
                            DatosPersonales.setValidacionRegistro("registrado");
                        } else if ("Conconexion".equals(classes.Conexion.importante)) {
                            if ("nuevo".equals(DatosPrincipales.getOpcionExamen())) {
                                dp.update_datosper();
                                DatosPersonales.setValidacionRegistro("registrado");

                            }
                        }
                    }
                } else if (estsalud.isEnabled()) {

                    if (EstadoSalud.getEstado_salud().equals("-") || EstadoSalud.getEstado_salud().equals("")) {
                        JOptionPane.showMessageDialog(null, "¡Debe elegir el estado de salud para continuar!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else if (EstadoSalud.getProb_salud().equals("-") || EstadoSalud.getProb_salud().equals("")) {
                        JOptionPane.showMessageDialog(null, "¡Debe completar todos los parámetros para continuar con el examen!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else {
                        EstadoSalud.setColorCategoria("con");
                        estsalud.setVisible(false);
                        estsalud.setEnabled(false);
                        consbebidas.setVisible(true);
                        consbebidas.setEnabled(true);
                        DatoGeneral.fechaizquierda.setVisible(true);
                        DatoGeneral.fechaderecha.setVisible(true);
                        validarColor();
                        jLabel6.setForeground(Color.red);
                        if ("Sinconexion".equals(classes.Conexion.importante)) {

                        } else if ("Conconexion".equals(classes.Conexion.importante)) {
                            if ("nuevo".equals(DatosPrincipales.getOpcionExamen())) {
                                es.update_estadosalud();
                                es.validarestadosalud();

                            }
                        }
                    }

                } else if (inforfami.isEnabled()) {

                    inforfami.setVisible(false);
                    inforfami.setEnabled(false);
                    consbebidas.setVisible(true);
                    consbebidas.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel6.setForeground(Color.red);

                } else if (infoaca.isEnabled()) {

                    infoaca.setVisible(false);
                    infoaca.setEnabled(false);
                    consbebidas.setVisible(true);
                    consbebidas.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel6.setForeground(Color.red);

                } else if (infofinan.isEnabled()) {

                    infofinan.setVisible(false);
                    infofinan.setEnabled(false);
                    consbebidas.setVisible(true);
                    consbebidas.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel6.setForeground(Color.red);

                } else if (casino.isEnabled()) {

                    casino.setVisible(false);
                    casino.setEnabled(false);
                    consbebidas.setVisible(true);
                    consbebidas.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel6.setForeground(Color.red);

                } else if (consbebidas.isEnabled()) {

                    JOptionPane.showMessageDialog(null, "¡Ya se encuentra en uso!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);

                } else if (consustan.isEnabled()) {

                    consustan.setVisible(false);
                    consustan.setEnabled(false);
                    consbebidas.setVisible(true);
                    consbebidas.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel6.setForeground(Color.red);

                } else if (antece.isEnabled()) {

                    antece.setVisible(false);
                    antece.setEnabled(false);
                    consbebidas.setVisible(true);
                    consbebidas.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel6.setForeground(Color.red);

                } else if (vinculos.isEnabled()) {

                    vinculos.setVisible(false);
                    vinculos.setEnabled(false);
                    consbebidas.setVisible(true);
                    consbebidas.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel6.setForeground(Color.red);

                } else if (falsifi.isEnabled()) {

                    falsifi.setVisible(false);
                    falsifi.setEnabled(false);
                    histlabo.ValidacionTipoExamen();
                    consbebidas.setVisible(true);
                    consbebidas.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel6.setForeground(Color.red);

                } else if (histlabo.isEnabled()) {

                    histlabo.setVisible(false);
                    histlabo.setEnabled(false);
                    consbebidas.setVisible(true);
                    consbebidas.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel6.setForeground(Color.red);

                } else if (planinfil.isEnabled()) {

                    planinfil.setVisible(false);
                    planinfil.setEnabled(false);
                    consbebidas.setVisible(true);
                    consbebidas.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel6.setForeground(Color.red);
                }
            } else //Rutina operacioneeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeees
            if (DatosPrincipales.getTipoExamen().equals("Rutina (operaciones)")) {
                if (daper.isEnabled()) {
                    Date fechavacia = DatoPersonal.fechanaci.getDate();
                    int age = Integer.parseInt(DatosPersonales.getEdad());
                    if (DatosPersonales.getEstrato().equals("-")) {
                        JOptionPane.showMessageDialog(null, "¡Seleccione el estrato del examinado!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else if (age < 17 || age > 70) {
                        JOptionPane.showMessageDialog(null, "¡La edad no se admite!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else if (DatosPersonales.getGenero().equals("-")) {
                        JOptionPane.showMessageDialog(null, "¡El género no ha sido seleccionado!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else if (DatosPrincipales.getMotivoExamen().equals("Procedimiento") && (DatoPersonal.cbxtipoiden.getSelectedItem().equals("Seleccione") || fechavacia == null || DatoPersonal.txtnombre.getText().equals("") || DatoPersonal.txtnoiden.getText().equals("") || DatoPersonal.txtexpedidos.getText().equals("") || DatoPersonal.txtlugarnaci.getText().equals("") || DatoPersonal.txtdireccion.getText().equals("") || DatoPersonal.txtcargoactual.getText().equals("") || DatoPersonal.txtareaactual.getText().equals("") || DatoPersonal.txtpersonasolicitante.getText().equals("") || DatoPersonal.txtcargosolicitante.getText().equals(""))) {

                        JOptionPane.showMessageDialog(null, "¡Debe completar todos los parámetros para registrar los datos!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);

                    } else if (DatosPrincipales.getMotivoExamen().equals("Ascenso") && (DatoPersonal.cbxtipoiden.getSelectedItem().equals("Seleccione") || fechavacia == null || (DatoPersonal.txtnombre.getText().equals("") || "".equals(DatoPersonal.txtnombre.getText())) || (DatoPersonal.txtnoiden.getText().equals("") || "".equals(DatoPersonal.txtnoiden.getText())) || (DatoPersonal.txtexpedidos.getText().equals("") || "".equals(DatoPersonal.txtexpedidos.getText())) || (DatoPersonal.txtlugarnaci.getText().equals("") || "".equals(DatoPersonal.txtlugarnaci.getText())) || (DatoPersonal.txtdireccion.getText().equals("") || "".equals(DatoPersonal.txtdireccion.getText())) || (DatoPersonal.txtcargoaspira.getText().equals("") || "".equals(DatoPersonal.txtcargoaspira.getText())) || (DatoPersonal.txtareaaspira.getText().equals("") || "".equals(DatoPersonal.txtareaaspira.getText())) || (DatoPersonal.txtcargoactual.getText().equals("") || "".equals(DatoPersonal.txtcargoactual.getText())) || (DatoPersonal.txtareaactual.getText().equals("") || "".equals(DatoPersonal.txtareaactual.getText())) || (DatoPersonal.txtpersonasolicitante.getText().equals("") || "".equals(DatoPersonal.txtpersonasolicitante.getText())) || (DatoPersonal.txtcargosolicitante.getText().equals("") || "".equals(DatoPersonal.txtcargosolicitante.getText())))) {

                        JOptionPane.showMessageDialog(null, "¡Debe completar todos los parámetros para registrar los datos!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);

                    } else {

                        nombreExamen();
                        nombreExamen.setText("Nombre examen: " + TecnicaYPreguntas.getNombreExamen());

                        daper.setVisible(false);
                        daper.setEnabled(false);
                        consbebidas.setVisible(true);
                        consbebidas.setEnabled(true);
                        DatoGeneral.fechaizquierda.setVisible(true);
                        DatoGeneral.fechaderecha.setVisible(true);
                        validarColor();
                        jLabel6.setForeground(Color.red);

                        if ("Sinconexion".equals(classes.Conexion.importante)) {
                            btnsave.setVisible(true);
                        } else if ("Conconexion".equals(classes.Conexion.importante)) {
                            if ("nuevo".equals(DatosPrincipales.getOpcionExamen())) {
                                dp.update_datosper();
                                DatosPersonales.setColorCategoria("con");
                                DatosPersonales.setValidacionRegistro("registrado");
                            }
                        }
                    }
                } else if (estsalud.isEnabled()) {

                    if (EstadoSalud.getEstado_salud().equals("-") || EstadoSalud.getEstado_salud().equals("")) {
                        JOptionPane.showMessageDialog(null, "¡Debe elegir el estado de salud para continuar!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else if (EstadoSalud.getProb_salud().equals("-") || EstadoSalud.getProb_salud().equals("")) {
                        JOptionPane.showMessageDialog(null, "¡Debe completar todos los parámetros para continuar con el examen!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else {
                        estsalud.setVisible(false);
                        estsalud.setEnabled(false);
                        consbebidas.setVisible(true);
                        consbebidas.setEnabled(true);
                        DatoGeneral.fechaizquierda.setVisible(true);
                        DatoGeneral.fechaderecha.setVisible(true);
                        validarColor();
                        jLabel6.setForeground(Color.red);

                        if ("Sinconexion".equals(classes.Conexion.importante)) {

                        } else if ("Conconexion".equals(classes.Conexion.importante)) {
                            if ("nuevo".equals(DatosPrincipales.getOpcionExamen())) {
                                es.update_estadosalud();
                                es.validarestadosalud();
                                EstadoSalud.setColorCategoria("con");
                            }
                        }
                    }

                } else if (inforfami.isEnabled()) {

                    inforfami.setVisible(false);
                    inforfami.setEnabled(false);
                    consbebidas.setVisible(true);
                    consbebidas.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel6.setForeground(Color.red);

                } else if (infoaca.isEnabled()) {

                    infoaca.setVisible(false);
                    infoaca.setEnabled(false);
                    consbebidas.setVisible(true);
                    consbebidas.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel6.setForeground(Color.red);

                } else if (infofinan.isEnabled()) {

                    infofinan.setVisible(false);
                    infofinan.setEnabled(false);
                    consbebidas.setVisible(true);
                    consbebidas.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel6.setForeground(Color.red);

                } else if (casino.isEnabled()) {

                    casino.setVisible(false);
                    casino.setEnabled(false);
                    consbebidas.setVisible(true);
                    consbebidas.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel6.setForeground(Color.red);

                } else if (consbebidas.isEnabled()) {

                    JOptionPane.showMessageDialog(null, "¡Ya se encuentra en uso!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);

                } else if (consustan.isEnabled()) {

                    consustan.setVisible(false);
                    consustan.setEnabled(false);
                    consbebidas.setVisible(true);
                    consbebidas.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel6.setForeground(Color.red);

                } else if (antece.isEnabled()) {

                    antece.setVisible(false);
                    antece.setEnabled(false);
                    consbebidas.setVisible(true);
                    consbebidas.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel6.setForeground(Color.red);

                } else if (vinculos.isEnabled()) {

                    vinculos.setVisible(false);
                    vinculos.setEnabled(false);
                    falsifi.ValidacionTipoExamen();
                    consbebidas.setVisible(true);
                    consbebidas.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel6.setForeground(Color.red);

                } else if (falsifi.isEnabled()) {

                    falsifi.setVisible(false);
                    falsifi.setEnabled(false);
//                        tecp.ValidacionTipoExamen();
                    consbebidas.setVisible(true);
                    consbebidas.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel6.setForeground(Color.red);
                }
            } else //Rutina administrativooooooooooooooooooooooooooooooooooooooooooooooos
            if (DatosPrincipales.getTipoExamen().equals("Rutina (admitivos)")) {

                if (daper.isEnabled()) {
                    Date fechavacia = DatoPersonal.fechanaci.getDate();
                    int age = Integer.parseInt(DatosPersonales.getEdad());
                    if (DatosPersonales.getEstrato().equals("-")) {
                        JOptionPane.showMessageDialog(null, "¡Seleccione el estrato del examinado!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else if (age < 17 || age > 70) {
                        JOptionPane.showMessageDialog(null, "¡La edad no se admite!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else if (DatosPersonales.getGenero().equals("-")) {
                        JOptionPane.showMessageDialog(null, "¡El género no ha sido seleccionado!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else {
                        if (DatosPrincipales.getMotivoExamen().equals("Procedimiento")) {
                            if (DatoPersonal.cbxtipoiden.getSelectedItem().equals("Seleccione") || fechavacia == null || DatoPersonal.txtnombre.getText().equals("") || DatoPersonal.txtnoiden.getText().equals("") || DatoPersonal.txtexpedidos.getText().equals("") || DatoPersonal.txtlugarnaci.getText().equals("") || DatoPersonal.txtdireccion.getText().equals("") || DatoPersonal.txtcargoactual.getText().equals("") || DatoPersonal.txtareaactual.getText().equals("") || DatoPersonal.txtpersonasolicitante.getText().equals("") || DatoPersonal.txtcargosolicitante.getText().equals("")) {
                                JOptionPane.showMessageDialog(null, "¡Debe completar todos los parámetros para registrar los datos!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                            }
                        } else if (DatosPrincipales.getMotivoExamen().equals("Ascenso")) {
                            if (DatoPersonal.cbxtipoiden.getSelectedItem().equals("Seleccione") || fechavacia == null || (DatoPersonal.txtnombre.getText().equals("") || "".equals(DatoPersonal.txtnombre.getText())) || (DatoPersonal.txtnoiden.getText().equals("") || "".equals(DatoPersonal.txtnoiden.getText())) || (DatoPersonal.txtexpedidos.getText().equals("") || "".equals(DatoPersonal.txtexpedidos.getText())) || (DatoPersonal.txtlugarnaci.getText().equals("") || "".equals(DatoPersonal.txtlugarnaci.getText())) || (DatoPersonal.txtdireccion.getText().equals("") || "".equals(DatoPersonal.txtdireccion.getText())) || (DatoPersonal.txtcargoaspira.getText().equals("") || "".equals(DatoPersonal.txtcargoaspira.getText())) || (DatoPersonal.txtareaaspira.getText().equals("") || "".equals(DatoPersonal.txtareaaspira.getText())) || (DatoPersonal.txtcargoactual.getText().equals("") || "".equals(DatoPersonal.txtcargoactual.getText())) || (DatoPersonal.txtareaactual.getText().equals("") || "".equals(DatoPersonal.txtareaactual.getText())) || (DatoPersonal.txtpersonasolicitante.getText().equals("") || "".equals(DatoPersonal.txtpersonasolicitante.getText())) || (DatoPersonal.txtcargosolicitante.getText().equals("") || "".equals(DatoPersonal.txtcargosolicitante.getText()))) {
                                JOptionPane.showMessageDialog(null, "¡Debe completar todos los parámetros para registrar los datos!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                            }
                        }
                        nombreExamen();
                        nombreExamen.setText("Nombre examen: " + TecnicaYPreguntas.getNombreExamen());
                        daper.setVisible(false);
                        daper.setEnabled(false);
                        consbebidas.setVisible(true);
                        consbebidas.setEnabled(true);
                        DatoGeneral.fechaizquierda.setVisible(true);
                        DatoGeneral.fechaderecha.setVisible(true);
                        validarColor();
                        jLabel6.setForeground(Color.red);
                        DatoGeneral.fechaizquierda.setVisible(true);
                        if ("noesvisible".equals(EstadoSalud.getVisibilidadflecha())) {
                            DatoGeneral.fechaderecha.setVisible(false);
                        } else if ("esvisible".equals(EstadoSalud.getVisibilidadflecha())) {
                            DatoGeneral.fechaderecha.setVisible(true);
                        }

                        if ("Sinconexion".equals(classes.Conexion.importante)) {
                            btnsave.setVisible(true);
                        } else if ("Conconexion".equals(classes.Conexion.importante)) {
                            if ("nuevo".equals(DatosPrincipales.getOpcionExamen())) {
                                dp.update_datosper();
                                DatosPersonales.setColorCategoria("con");
                                DatosPersonales.setValidacionRegistro("registrado");
                            }
                        }
                    }
                } else if (estsalud.isEnabled()) {

                    if (EstadoSalud.getEstado_salud().equals("-") || EstadoSalud.getEstado_salud().equals("")) {
                        JOptionPane.showMessageDialog(null, "¡Debe elegir el estado de salud para continuar!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else if (EstadoSalud.getProb_salud().equals("-") || EstadoSalud.getProb_salud().equals("")) {
                        JOptionPane.showMessageDialog(null, "¡Debe completar todos los parámetros para continuar con el examen!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else {
                        estsalud.setVisible(false);
                        estsalud.setEnabled(false);
                        consbebidas.setVisible(true);
                        consbebidas.setEnabled(true);
                        DatoGeneral.fechaizquierda.setVisible(true);
                        DatoGeneral.fechaderecha.setVisible(true);
                        validarColor();
                        jLabel6.setForeground(Color.red);

                        if ("Sinconexion".equals(classes.Conexion.importante)) {

                        } else if ("Conconexion".equals(classes.Conexion.importante)) {
                            if ("nuevo".equals(DatosPrincipales.getOpcionExamen())) {
                                es.update_estadosalud();
                                es.validarestadosalud();
                                EstadoSalud.setColorCategoria("con");
                            }
                        }
                    }

                } else if (inforfami.isEnabled()) {

                    inforfami.setVisible(false);
                    inforfami.setEnabled(false);
                    consbebidas.setVisible(true);
                    consbebidas.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel6.setForeground(Color.red);

                } else if (infoaca.isEnabled()) {

                    infoaca.setVisible(false);
                    infoaca.setEnabled(false);
                    consbebidas.setVisible(true);
                    consbebidas.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel6.setForeground(Color.red);

                } else if (infofinan.isEnabled()) {

                    infofinan.setVisible(false);
                    infofinan.setEnabled(false);
                    consbebidas.setVisible(true);
                    consbebidas.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel6.setForeground(Color.red);

                } else if (casino.isEnabled()) {

                    casino.setVisible(false);
                    casino.setEnabled(false);
                    consbebidas.setVisible(true);
                    consbebidas.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel6.setForeground(Color.red);

                } else if (consbebidas.isEnabled()) {

                    consustan.ValidacionTipoExamen();
                    consbebidas.setVisible(false);
                    consbebidas.setEnabled(false);
                    consbebidas.setVisible(true);
                    consbebidas.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel6.setForeground(Color.red);

                } else if (consustan.isEnabled()) {

                    consustan.setVisible(false);
                    consustan.setEnabled(false);
                    consbebidas.setVisible(true);
                    consbebidas.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel6.setForeground(Color.red);

                } else if (antece.isEnabled()) {

                    antece.setVisible(false);
                    antece.setEnabled(false);
                    consbebidas.setVisible(true);
                    consbebidas.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel6.setForeground(Color.red);

                } else if (vinculos.isEnabled()) {

                    vinculos.setVisible(false);
                    vinculos.setEnabled(false);
                    falsifi.ValidacionTipoExamen();
                    consbebidas.setVisible(true);
                    consbebidas.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel6.setForeground(Color.red);

                } else if (falsifi.isEnabled()) {

                    falsifi.setVisible(false);
                    falsifi.setEnabled(false);
                    histlabo.ValidacionTipoExamen();
                    consbebidas.setVisible(true);
                    consbebidas.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel6.setForeground(Color.red);

                } else if (histlabo.isEnabled()) {

                    histlabo.setVisible(false);
                    histlabo.setEnabled(false);
                    consbebidas.setVisible(true);
                    consbebidas.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel6.setForeground(Color.red);

                } else if (planinfil.isEnabled()) {

                    planinfil.setVisible(false);
                    planinfil.setEnabled(false);
                    consbebidas.setVisible(true);
                    consbebidas.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel6.setForeground(Color.red);

                }

            } else //Especificooooooooooooooooooooooooooooooooooooooooooo
            if (DatosPrincipales.getTipoExamen().equals("Específico")) {
                if (daper.isEnabled()) {
                    Date fechavacia = DatoPersonal.fechanaci.getDate();
                    int age = Integer.parseInt(DatosPersonales.getEdad());
                    if (DatosPersonales.getEstrato().equals("-")) {
                        JOptionPane.showMessageDialog(null, "¡Seleccione el estrato del examinado!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else if (age < 17 || age > 70) {
                        JOptionPane.showMessageDialog(null, "¡La edad no se admite!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else if (DatoPersonal.cbxtipoiden.getSelectedItem().equals("Seleccione") || fechavacia == null || (DatoPersonal.txtnombre.getText().equals("") || "".equals(DatoPersonal.txtnombre.getText())) || (DatoPersonal.txtnoiden.getText().equals("") || "".equals(DatoPersonal.txtnoiden.getText())) || (DatoPersonal.txtexpedidos.getText().equals("") || "".equals(DatoPersonal.txtexpedidos.getText())) || (DatoPersonal.txtlugarnaci.getText().equals("") || "".equals(DatoPersonal.txtlugarnaci.getText())) || (DatoPersonal.txtdireccion.getText().equals("") || "".equals(DatoPersonal.txtdireccion.getText())) || (DatoPersonal.txtpersonasolicitante.getText().equals("") || "".equals(DatoPersonal.txtpersonasolicitante.getText())) || (DatoPersonal.txtcargosolicitante.getText().equals("") || "".equals(DatoPersonal.txtcargosolicitante.getText())) || (DatoPersonal.txtareaactual.getText().equals("") || "".equals(DatoPersonal.txtareaactual.getText())) || (DatoPersonal.txtcargoactual.getText().equals("") || "".equals(DatoPersonal.txtcargoactual.getText()))) {
                        JOptionPane.showMessageDialog(null, "¡Debe completar todos los parámetros para registrar los datos!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else if (DatosPersonales.getGenero().equals("-") || DatosPersonales.getGenero().equals("") || DatosPersonales.getGenero() == null) {
                        JOptionPane.showMessageDialog(null, "¡El género no ha sido seleccionado!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else {

                        nombreExamen();
                        nombreExamen.setText("Nombre examen: " + TecnicaYPreguntas.getNombreExamen());
                        daper.setVisible(false);
                        daper.setEnabled(false);
                        consbebidas.setVisible(true);
                        consbebidas.setEnabled(true);
                        DatoGeneral.fechaizquierda.setVisible(true);
                        DatoGeneral.fechaderecha.setVisible(true);
                        validarColor();
                        jLabel6.setForeground(Color.red);

                        if ("Sinconexion".equals(classes.Conexion.importante)) {
                            btnsave.setVisible(true);
                        } else if ("Conconexion".equals(classes.Conexion.importante)) {
                            if ("nuevo".equals(DatosPrincipales.getOpcionExamen())) {
                                dp.update_datosper();
                                DatosPersonales.setColorCategoria("con");
                                DatosPersonales.setValidacionRegistro("registrado");
                            }
                        }
                    }
                } else if (estsalud.isEnabled()) {

                    if (EstadoSalud.getEstado_salud().equals("-") || EstadoSalud.getEstado_salud().equals("")) {
                        JOptionPane.showMessageDialog(null, "¡Debe elegir el estado de salud para continuar!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else if (EstadoSalud.getProb_salud().equals("-") || EstadoSalud.getProb_salud().equals("")) {
                        JOptionPane.showMessageDialog(null, "¡Debe completar todos los parámetros para continuar con el examen!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else {
                        estsalud.setVisible(false);
                        estsalud.setEnabled(false);
                        consbebidas.setVisible(true);
                        consbebidas.setEnabled(true);
                        DatoGeneral.fechaizquierda.setVisible(true);
                        DatoGeneral.fechaderecha.setVisible(true);
                        validarColor();
                        jLabel6.setForeground(Color.red);

                        if ("Sinconexion".equals(classes.Conexion.importante)) {

                        } else if ("Conconexion".equals(classes.Conexion.importante)) {
                            if ("nuevo".equals(DatosPrincipales.getOpcionExamen())) {
                                es.update_estadosalud();
                                es.validarestadosalud();
                                EstadoSalud.setColorCategoria("con");
                            }
                        }
                    }

                } else if (inforfami.isEnabled()) {

                    inforfami.setVisible(false);
                    inforfami.setEnabled(false);
                    consbebidas.setVisible(true);
                    consbebidas.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel6.setForeground(Color.red);

                } else if (infoaca.isEnabled()) {

                    infoaca.setVisible(false);
                    infoaca.setEnabled(false);
                    consbebidas.setVisible(true);
                    consbebidas.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel6.setForeground(Color.red);

                } else if (infofinan.isEnabled()) {

                    infofinan.setVisible(false);
                    infofinan.setEnabled(false);
                    consbebidas.setVisible(true);
                    consbebidas.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel6.setForeground(Color.red);

                } else if (consbebidas.isEnabled()) {

                    JOptionPane.showMessageDialog(null, "¡Ya se encuentra en uso!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);

                } else if (consustan.isEnabled()) {

                    consustan.setVisible(false);
                    consustan.setEnabled(false);
                    consbebidas.setVisible(true);
                    consbebidas.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel6.setForeground(Color.red);

                } else if (antece.isEnabled()) {

                    antece.setVisible(false);
                    antece.setEnabled(false);
                    consbebidas.setVisible(true);
                    consbebidas.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel6.setForeground(Color.red);

                } else if (vinculos.isEnabled()) {

                    vinculos.setVisible(false);
                    vinculos.setEnabled(false);
                    consbebidas.setVisible(true);
                    consbebidas.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel6.setForeground(Color.red);

                } else if (temain.isEnabled()) {

                    temain.setVisible(false);
                    temain.setEnabled(false);
                    consbebidas.setVisible(true);
                    consbebidas.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel6.setForeground(Color.red);

                }
            }
        }
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        //pre empleooooooooooooooooooooo
        if (DatosPersonales.getValidacionRegistro().equals("noregistrado")) {
            JOptionPane.showMessageDialog(null, "¡Debe guardar los datos básicos primero!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
        } else if (!EstadoSalud.getVisibilidadflecha().equals("esvisible")) {
            JOptionPane.showMessageDialog(null, "¡No apto en estado de salud!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
        } else {
            if (DatosPrincipales.getTipoExamen().equals("Pre-empleo")) {
                if (daper.isEnabled()) {
                    Date fechavacia = DatoPersonal.fechanaci.getDate();
                    int age = Integer.parseInt(DatosPersonales.getEdad());
                    if (DatosPersonales.getEstrato().equals("-")) {
                        JOptionPane.showMessageDialog(null, "¡Seleccione el estrato del examinado!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else if (age < 17 || age > 70) {
                        JOptionPane.showMessageDialog(null, "¡La edad no se admite!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else if (DatoPersonal.cbxtipoiden.getSelectedItem().equals("Seleccione") || fechavacia == null || (DatoPersonal.txtnombre.getText().equals("") || "".equals(DatoPersonal.txtnombre.getText())) || (DatoPersonal.txtnoiden.getText().equals("") || "".equals(DatoPersonal.txtnoiden.getText())) || (DatoPersonal.txtexpedidos.getText().equals("") || "".equals(DatoPersonal.txtexpedidos.getText())) || (DatoPersonal.txtlugarnaci.getText().equals("") || "".equals(DatoPersonal.txtlugarnaci.getText())) || (DatoPersonal.txtdireccion.getText().equals("") || "".equals(DatoPersonal.txtdireccion.getText())) || (DatoPersonal.txtcargoaspira.getText().equals("") || "".equals(DatoPersonal.txtcargoaspira.getText())) || (DatoPersonal.txtareaaspira.getText().equals("") || "".equals(DatoPersonal.txtareaaspira.getText())) || (DatoPersonal.txtpersonasolicitante.getText().equals("") || "".equals(DatoPersonal.txtpersonasolicitante.getText())) || (DatoPersonal.txtcargosolicitante.getText().equals("") || "".equals(DatoPersonal.txtcargosolicitante.getText()))) {
                        JOptionPane.showMessageDialog(null, "¡Debe completar todos los parámetros para registrar los datos!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else if (DatosPersonales.getGenero().equals("-") || DatosPersonales.getGenero().equals("") || DatosPersonales.getGenero() == null) {
                        JOptionPane.showMessageDialog(null, "¡El género no ha sido seleccionado!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else {

                        nombreExamen();
                        nombreExamen.setText("Nombre examen: " + TecnicaYPreguntas.getNombreExamen());
                        DatosPersonales.setColorCategoria("con");
                        daper.setVisible(false);
                        daper.setEnabled(false);
                        consustan.setVisible(true);
                        consustan.setEnabled(true);
                        DatoGeneral.fechaizquierda.setVisible(true);
                        DatoGeneral.fechaderecha.setVisible(true);
                        validarColor();
                        jLabel7.setForeground(Color.red);

                        if ("Sinconexion".equals(classes.Conexion.importante)) {
                            btnsave.setVisible(true);
                            DatosPersonales.setValidacionRegistro("registrado");
                        } else if ("Conconexion".equals(classes.Conexion.importante)) {
                            if ("nuevo".equals(DatosPrincipales.getOpcionExamen())) {
                                dp.update_datosper();
                                DatosPersonales.setValidacionRegistro("registrado");

                            }
                        }
                    }
                } else if (estsalud.isEnabled()) {

                    if (EstadoSalud.getEstado_salud().equals("-") || EstadoSalud.getEstado_salud().equals("")) {
                        JOptionPane.showMessageDialog(null, "¡Debe elegir el estado de salud para continuar!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else if (EstadoSalud.getProb_salud().equals("-") || EstadoSalud.getProb_salud().equals("")) {
                        JOptionPane.showMessageDialog(null, "¡Debe completar todos los parámetros para continuar con el examen!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else {
                        EstadoSalud.setColorCategoria("con");
                        estsalud.setVisible(false);
                        estsalud.setEnabled(false);
                        consustan.setVisible(true);
                        consustan.setEnabled(true);
                        DatoGeneral.fechaizquierda.setVisible(true);
                        DatoGeneral.fechaderecha.setVisible(true);
                        validarColor();
                        jLabel7.setForeground(Color.red);
                        if ("Sinconexion".equals(classes.Conexion.importante)) {

                        } else if ("Conconexion".equals(classes.Conexion.importante)) {
                            if ("nuevo".equals(DatosPrincipales.getOpcionExamen())) {
                                es.update_estadosalud();
                                es.validarestadosalud();

                            }
                        }
                    }

                } else if (inforfami.isEnabled()) {

                    inforfami.setVisible(false);
                    inforfami.setEnabled(false);
                    consustan.setVisible(true);
                    consustan.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel7.setForeground(Color.red);

                } else if (infoaca.isEnabled()) {

                    infoaca.setVisible(false);
                    infoaca.setEnabled(false);
                    consustan.setVisible(true);
                    consustan.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel7.setForeground(Color.red);

                } else if (infofinan.isEnabled()) {

                    infofinan.setVisible(false);
                    infofinan.setEnabled(false);
                    consustan.setVisible(true);
                    consustan.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel7.setForeground(Color.red);

                } else if (casino.isEnabled()) {

                    casino.setVisible(false);
                    casino.setEnabled(false);
                    consustan.setVisible(true);
                    consustan.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel7.setForeground(Color.red);

                } else if (consbebidas.isEnabled()) {

                    consustan.ValidacionTipoExamen();
                    consbebidas.setVisible(false);
                    consbebidas.setEnabled(false);
                    consustan.setVisible(true);
                    consustan.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel7.setForeground(Color.red);

                } else if (consustan.isEnabled()) {

                    JOptionPane.showMessageDialog(null, "¡Ya se encuentra en uso!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);

                } else if (antece.isEnabled()) {

                    antece.setVisible(false);
                    antece.setEnabled(false);
                    consustan.setVisible(true);
                    consustan.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel7.setForeground(Color.red);

                } else if (vinculos.isEnabled()) {

                    vinculos.setVisible(false);
                    vinculos.setEnabled(false);
                    consustan.setVisible(true);
                    consustan.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel7.setForeground(Color.red);

                } else if (falsifi.isEnabled()) {

                    falsifi.setVisible(false);
                    falsifi.setEnabled(false);
                    histlabo.ValidacionTipoExamen();
                    consustan.setVisible(true);
                    consustan.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel7.setForeground(Color.red);

                } else if (histlabo.isEnabled()) {

                    histlabo.setVisible(false);
                    histlabo.setEnabled(false);
                    consustan.setVisible(true);
                    consustan.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel7.setForeground(Color.red);

                } else if (planinfil.isEnabled()) {

                    planinfil.setVisible(false);
                    planinfil.setEnabled(false);
                    consustan.setVisible(true);
                    consustan.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel7.setForeground(Color.red);

                }
            } else //Rutina operacioneeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeees
            if (DatosPrincipales.getTipoExamen().equals("Rutina (operaciones)")) {
                if (daper.isEnabled()) {
                    Date fechavacia = DatoPersonal.fechanaci.getDate();
                    int age = Integer.parseInt(DatosPersonales.getEdad());
                    if (DatosPersonales.getEstrato().equals("-")) {
                        JOptionPane.showMessageDialog(null, "¡Seleccione el estrato del examinado!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else if (age < 17 || age > 70) {
                        JOptionPane.showMessageDialog(null, "¡La edad no se admite!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else if (DatosPersonales.getGenero().equals("-")) {
                        JOptionPane.showMessageDialog(null, "¡El género no ha sido seleccionado!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else if (DatosPrincipales.getMotivoExamen().equals("Procedimiento") && (DatoPersonal.cbxtipoiden.getSelectedItem().equals("Seleccione") || fechavacia == null || DatoPersonal.txtnombre.getText().equals("") || DatoPersonal.txtnoiden.getText().equals("") || DatoPersonal.txtexpedidos.getText().equals("") || DatoPersonal.txtlugarnaci.getText().equals("") || DatoPersonal.txtdireccion.getText().equals("") || DatoPersonal.txtcargoactual.getText().equals("") || DatoPersonal.txtareaactual.getText().equals("") || DatoPersonal.txtpersonasolicitante.getText().equals("") || DatoPersonal.txtcargosolicitante.getText().equals(""))) {

                        JOptionPane.showMessageDialog(null, "¡Debe completar todos los parámetros para registrar los datos!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);

                    } else if (DatosPrincipales.getMotivoExamen().equals("Ascenso") && (DatoPersonal.cbxtipoiden.getSelectedItem().equals("Seleccione") || fechavacia == null || (DatoPersonal.txtnombre.getText().equals("") || "".equals(DatoPersonal.txtnombre.getText())) || (DatoPersonal.txtnoiden.getText().equals("") || "".equals(DatoPersonal.txtnoiden.getText())) || (DatoPersonal.txtexpedidos.getText().equals("") || "".equals(DatoPersonal.txtexpedidos.getText())) || (DatoPersonal.txtlugarnaci.getText().equals("") || "".equals(DatoPersonal.txtlugarnaci.getText())) || (DatoPersonal.txtdireccion.getText().equals("") || "".equals(DatoPersonal.txtdireccion.getText())) || (DatoPersonal.txtcargoaspira.getText().equals("") || "".equals(DatoPersonal.txtcargoaspira.getText())) || (DatoPersonal.txtareaaspira.getText().equals("") || "".equals(DatoPersonal.txtareaaspira.getText())) || (DatoPersonal.txtcargoactual.getText().equals("") || "".equals(DatoPersonal.txtcargoactual.getText())) || (DatoPersonal.txtareaactual.getText().equals("") || "".equals(DatoPersonal.txtareaactual.getText())) || (DatoPersonal.txtpersonasolicitante.getText().equals("") || "".equals(DatoPersonal.txtpersonasolicitante.getText())) || (DatoPersonal.txtcargosolicitante.getText().equals("") || "".equals(DatoPersonal.txtcargosolicitante.getText())))) {

                        JOptionPane.showMessageDialog(null, "¡Debe completar todos los parámetros para registrar los datos!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);

                    } else {

                        nombreExamen();
                        nombreExamen.setText("Nombre examen: " + TecnicaYPreguntas.getNombreExamen());

                        daper.setVisible(false);
                        daper.setEnabled(false);
                        consustan.setVisible(true);
                        consustan.setEnabled(true);
                        DatoGeneral.fechaizquierda.setVisible(true);
                        DatoGeneral.fechaderecha.setVisible(true);
                        validarColor();
                        jLabel7.setForeground(Color.red);

                        DatoGeneral.fechaizquierda.setVisible(true);
                        if ("noesvisible".equals(EstadoSalud.getVisibilidadflecha())) {
                            DatoGeneral.fechaderecha.setVisible(false);
                        } else if ("esvisible".equals(EstadoSalud.getVisibilidadflecha())) {
                            DatoGeneral.fechaderecha.setVisible(true);
                        }

                        if ("Sinconexion".equals(classes.Conexion.importante)) {
                            btnsave.setVisible(true);
                        } else if ("Conconexion".equals(classes.Conexion.importante)) {
                            if ("nuevo".equals(DatosPrincipales.getOpcionExamen())) {
                                dp.update_datosper();
                                DatosPersonales.setColorCategoria("con");
                                DatosPersonales.setValidacionRegistro("registrado");
                            }
                        }
                    }
                } else if (estsalud.isEnabled()) {

                    if (EstadoSalud.getEstado_salud().equals("-") || EstadoSalud.getEstado_salud().equals("")) {
                        JOptionPane.showMessageDialog(null, "¡Debe elegir el estado de salud para continuar!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else if (EstadoSalud.getProb_salud().equals("-") || EstadoSalud.getProb_salud().equals("")) {
                        JOptionPane.showMessageDialog(null, "¡Debe completar todos los parámetros para continuar con el examen!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else {
                        estsalud.setVisible(false);
                        estsalud.setEnabled(false);
                        consustan.setVisible(true);
                        consustan.setEnabled(true);
                        DatoGeneral.fechaizquierda.setVisible(true);
                        DatoGeneral.fechaderecha.setVisible(true);
                        validarColor();
                        jLabel7.setForeground(Color.red);

                        if ("Sinconexion".equals(classes.Conexion.importante)) {

                        } else if ("Conconexion".equals(classes.Conexion.importante)) {
                            if ("nuevo".equals(DatosPrincipales.getOpcionExamen())) {
                                es.update_estadosalud();
                                es.validarestadosalud();
                                EstadoSalud.setColorCategoria("con");
                            }
                        }
                    }

                } else if (inforfami.isEnabled()) {

                    inforfami.setVisible(false);
                    inforfami.setEnabled(false);
                    consustan.setVisible(true);
                    consustan.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel7.setForeground(Color.red);

                } else if (infoaca.isEnabled()) {

                    infoaca.setVisible(false);
                    infoaca.setEnabled(false);
                    consustan.setVisible(true);
                    consustan.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel7.setForeground(Color.red);

                } else if (infofinan.isEnabled()) {

                    infofinan.setVisible(false);
                    infofinan.setEnabled(false);
                    consustan.setVisible(true);
                    consustan.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel7.setForeground(Color.red);

                } else if (casino.isEnabled()) {

                    casino.setVisible(false);
                    casino.setEnabled(false);
                    consustan.setVisible(true);
                    consustan.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel7.setForeground(Color.red);

                } else if (consbebidas.isEnabled()) {

                    consustan.ValidacionTipoExamen();
                    consbebidas.setVisible(false);
                    consbebidas.setEnabled(false);
                    consustan.setVisible(true);
                    consustan.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel7.setForeground(Color.red);

                } else if (consustan.isEnabled()) {

                    JOptionPane.showMessageDialog(null, "¡Ya se encuentra en uso!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);

                } else if (antece.isEnabled()) {

                    antece.setVisible(false);
                    antece.setEnabled(false);
                    consustan.setVisible(true);
                    consustan.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel7.setForeground(Color.red);

                } else if (vinculos.isEnabled()) {

                    vinculos.setVisible(false);
                    vinculos.setEnabled(false);
                    falsifi.ValidacionTipoExamen();
                    consustan.setVisible(true);
                    consustan.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel7.setForeground(Color.red);

                } else if (falsifi.isEnabled()) {

                    falsifi.setVisible(false);
                    falsifi.setEnabled(false);
//                        tecp.ValidacionTipoExamen();
                    consustan.setVisible(true);
                    consustan.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel7.setForeground(Color.red);
                }

            } else //Rutina administrativooooooooooooooooooooooooooooooooooooooooooooooos
            if (DatosPrincipales.getTipoExamen().equals("Rutina (admitivos)")) {

                if (daper.isEnabled()) {
                    Date fechavacia = DatoPersonal.fechanaci.getDate();
                    int age = Integer.parseInt(DatosPersonales.getEdad());
                    if (DatosPersonales.getEstrato().equals("-")) {
                        JOptionPane.showMessageDialog(null, "¡Seleccione el estrato del examinado!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else if (age < 17 || age > 70) {
                        JOptionPane.showMessageDialog(null, "¡La edad no se admite!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else if (DatosPersonales.getGenero().equals("-")) {
                        JOptionPane.showMessageDialog(null, "¡El género no ha sido seleccionado!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else {
                        if (DatosPrincipales.getMotivoExamen().equals("Procedimiento")) {
                            if (DatoPersonal.cbxtipoiden.getSelectedItem().equals("Seleccione") || fechavacia == null || DatoPersonal.txtnombre.getText().equals("") || DatoPersonal.txtnoiden.getText().equals("") || DatoPersonal.txtexpedidos.getText().equals("") || DatoPersonal.txtlugarnaci.getText().equals("") || DatoPersonal.txtdireccion.getText().equals("") || DatoPersonal.txtcargoactual.getText().equals("") || DatoPersonal.txtareaactual.getText().equals("") || DatoPersonal.txtpersonasolicitante.getText().equals("") || DatoPersonal.txtcargosolicitante.getText().equals("")) {
                                JOptionPane.showMessageDialog(null, "¡Debe completar todos los parámetros para registrar los datos!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                            }
                        } else if (DatosPrincipales.getMotivoExamen().equals("Ascenso")) {
                            if (DatoPersonal.cbxtipoiden.getSelectedItem().equals("Seleccione") || fechavacia == null || (DatoPersonal.txtnombre.getText().equals("") || "".equals(DatoPersonal.txtnombre.getText())) || (DatoPersonal.txtnoiden.getText().equals("") || "".equals(DatoPersonal.txtnoiden.getText())) || (DatoPersonal.txtexpedidos.getText().equals("") || "".equals(DatoPersonal.txtexpedidos.getText())) || (DatoPersonal.txtlugarnaci.getText().equals("") || "".equals(DatoPersonal.txtlugarnaci.getText())) || (DatoPersonal.txtdireccion.getText().equals("") || "".equals(DatoPersonal.txtdireccion.getText())) || (DatoPersonal.txtcargoaspira.getText().equals("") || "".equals(DatoPersonal.txtcargoaspira.getText())) || (DatoPersonal.txtareaaspira.getText().equals("") || "".equals(DatoPersonal.txtareaaspira.getText())) || (DatoPersonal.txtcargoactual.getText().equals("") || "".equals(DatoPersonal.txtcargoactual.getText())) || (DatoPersonal.txtareaactual.getText().equals("") || "".equals(DatoPersonal.txtareaactual.getText())) || (DatoPersonal.txtpersonasolicitante.getText().equals("") || "".equals(DatoPersonal.txtpersonasolicitante.getText())) || (DatoPersonal.txtcargosolicitante.getText().equals("") || "".equals(DatoPersonal.txtcargosolicitante.getText()))) {
                                JOptionPane.showMessageDialog(null, "¡Debe completar todos los parámetros para registrar los datos!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                            }
                        }
                        nombreExamen();
                        nombreExamen.setText("Nombre examen: " + TecnicaYPreguntas.getNombreExamen());
                        daper.setVisible(false);
                        daper.setEnabled(false);
                        consustan.setVisible(true);
                        consustan.setEnabled(true);
                        DatoGeneral.fechaizquierda.setVisible(true);
                        DatoGeneral.fechaderecha.setVisible(true);
                        validarColor();
                        jLabel7.setForeground(Color.red);

                        if ("Sinconexion".equals(classes.Conexion.importante)) {
                            btnsave.setVisible(true);
                        } else if ("Conconexion".equals(classes.Conexion.importante)) {
                            if ("nuevo".equals(DatosPrincipales.getOpcionExamen())) {
                                dp.update_datosper();
                                DatosPersonales.setColorCategoria("con");
                                DatosPersonales.setValidacionRegistro("registrado");
                            }
                        }
                    }
                } else if (estsalud.isEnabled()) {

                    if (EstadoSalud.getEstado_salud().equals("-") || EstadoSalud.getEstado_salud().equals("")) {
                        JOptionPane.showMessageDialog(null, "¡Debe elegir el estado de salud para continuar!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else if (EstadoSalud.getProb_salud().equals("-") || EstadoSalud.getProb_salud().equals("")) {
                        JOptionPane.showMessageDialog(null, "¡Debe completar todos los parámetros para continuar con el examen!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else {
                        estsalud.setVisible(false);
                        estsalud.setEnabled(false);
                        consustan.setVisible(true);
                        consustan.setEnabled(true);
                        DatoGeneral.fechaizquierda.setVisible(true);
                        DatoGeneral.fechaderecha.setVisible(true);
                        validarColor();
                        jLabel7.setForeground(Color.red);

                        if ("Sinconexion".equals(classes.Conexion.importante)) {

                        } else if ("Conconexion".equals(classes.Conexion.importante)) {
                            if ("nuevo".equals(DatosPrincipales.getOpcionExamen())) {
                                es.update_estadosalud();
                                es.validarestadosalud();
                                EstadoSalud.setColorCategoria("con");
                            }
                        }
                    }

                } else if (inforfami.isEnabled()) {

                    inforfami.setVisible(false);
                    inforfami.setEnabled(false);
                    consustan.setVisible(true);
                    consustan.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel7.setForeground(Color.red);

                } else if (infoaca.isEnabled()) {

                    infoaca.setVisible(false);
                    infoaca.setEnabled(false);
                    consustan.setVisible(true);
                    consustan.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel7.setForeground(Color.red);

                } else if (infofinan.isEnabled()) {

                    infofinan.setVisible(false);
                    infofinan.setEnabled(false);
                    consustan.setVisible(true);
                    consustan.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel7.setForeground(Color.red);

                } else if (casino.isEnabled()) {

                    casino.setVisible(false);
                    casino.setEnabled(false);
                    consustan.setVisible(true);
                    consustan.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel7.setForeground(Color.red);

                } else if (consbebidas.isEnabled()) {

                    consustan.ValidacionTipoExamen();
                    consbebidas.setVisible(false);
                    consbebidas.setEnabled(false);
                    consustan.setVisible(true);
                    consustan.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel7.setForeground(Color.red);

                } else if (consustan.isEnabled()) {
                    JOptionPane.showMessageDialog(null, "¡Ya se encuentra en uso!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);

                } else if (antece.isEnabled()) {

                    antece.setVisible(false);
                    antece.setEnabled(false);
                    consustan.setVisible(true);
                    consustan.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel7.setForeground(Color.red);

                } else if (vinculos.isEnabled()) {

                    vinculos.setVisible(false);
                    vinculos.setEnabled(false);
                    falsifi.ValidacionTipoExamen();
                    consustan.setVisible(true);
                    consustan.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel7.setForeground(Color.red);

                } else if (falsifi.isEnabled()) {

                    falsifi.setVisible(false);
                    falsifi.setEnabled(false);
                    histlabo.ValidacionTipoExamen();
                    consustan.setVisible(true);
                    consustan.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel7.setForeground(Color.red);

                } else if (histlabo.isEnabled()) {

                    histlabo.setVisible(false);
                    histlabo.setEnabled(false);
                    consustan.setVisible(true);
                    consustan.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel7.setForeground(Color.red);

                } else if (planinfil.isEnabled()) {

                    planinfil.setVisible(false);
                    planinfil.setEnabled(false);
                    consustan.setVisible(true);
                    consustan.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel7.setForeground(Color.red);
                }

            } else //Especificooooooooooooooooooooooooooooooooooooooooooo
            if (DatosPrincipales.getTipoExamen().equals("Específico")) {
                if (daper.isEnabled()) {
                    Date fechavacia = DatoPersonal.fechanaci.getDate();
                    int age = Integer.parseInt(DatosPersonales.getEdad());
                    if (DatosPersonales.getEstrato().equals("-")) {
                        JOptionPane.showMessageDialog(null, "¡Seleccione el estrato del examinado!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else if (age < 17 || age > 70) {
                        JOptionPane.showMessageDialog(null, "¡La edad no se admite!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else if (DatoPersonal.cbxtipoiden.getSelectedItem().equals("Seleccione") || fechavacia == null || (DatoPersonal.txtnombre.getText().equals("") || "".equals(DatoPersonal.txtnombre.getText())) || (DatoPersonal.txtnoiden.getText().equals("") || "".equals(DatoPersonal.txtnoiden.getText())) || (DatoPersonal.txtexpedidos.getText().equals("") || "".equals(DatoPersonal.txtexpedidos.getText())) || (DatoPersonal.txtlugarnaci.getText().equals("") || "".equals(DatoPersonal.txtlugarnaci.getText())) || (DatoPersonal.txtdireccion.getText().equals("") || "".equals(DatoPersonal.txtdireccion.getText())) || (DatoPersonal.txtpersonasolicitante.getText().equals("") || "".equals(DatoPersonal.txtpersonasolicitante.getText())) || (DatoPersonal.txtcargosolicitante.getText().equals("") || "".equals(DatoPersonal.txtcargosolicitante.getText())) || (DatoPersonal.txtareaactual.getText().equals("") || "".equals(DatoPersonal.txtareaactual.getText())) || (DatoPersonal.txtcargoactual.getText().equals("") || "".equals(DatoPersonal.txtcargoactual.getText()))) {
                        JOptionPane.showMessageDialog(null, "¡Debe completar todos los parámetros para registrar los datos!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else if (DatosPersonales.getGenero().equals("-") || DatosPersonales.getGenero().equals("") || DatosPersonales.getGenero() == null) {
                        JOptionPane.showMessageDialog(null, "¡El género no ha sido seleccionado!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else {

                        nombreExamen();
                        nombreExamen.setText("Nombre examen: " + TecnicaYPreguntas.getNombreExamen());
                        daper.setVisible(false);
                        daper.setEnabled(false);
                        consustan.setVisible(true);
                        consustan.setEnabled(true);
                        DatoGeneral.fechaizquierda.setVisible(true);
                        DatoGeneral.fechaderecha.setVisible(true);
                        validarColor();
                        jLabel7.setForeground(Color.red);

                        if ("Sinconexion".equals(classes.Conexion.importante)) {
                            btnsave.setVisible(true);
                        } else if ("Conconexion".equals(classes.Conexion.importante)) {
                            if ("nuevo".equals(DatosPrincipales.getOpcionExamen())) {
                                dp.update_datosper();
                                DatosPersonales.setColorCategoria("con");
                                DatosPersonales.setValidacionRegistro("registrado");
                            }
                        }
                    }
                } else if (estsalud.isEnabled()) {

                    if (EstadoSalud.getEstado_salud().equals("-") || EstadoSalud.getEstado_salud().equals("")) {
                        JOptionPane.showMessageDialog(null, "¡Debe elegir el estado de salud para continuar!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else if (EstadoSalud.getProb_salud().equals("-") || EstadoSalud.getProb_salud().equals("")) {
                        JOptionPane.showMessageDialog(null, "¡Debe completar todos los parámetros para continuar con el examen!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else {
                        estsalud.setVisible(false);
                        estsalud.setEnabled(false);
                        consustan.setVisible(true);
                        consustan.setEnabled(true);
                        DatoGeneral.fechaizquierda.setVisible(true);
                        DatoGeneral.fechaderecha.setVisible(true);
                        validarColor();
                        jLabel7.setForeground(Color.red);

                        if ("Sinconexion".equals(classes.Conexion.importante)) {

                        } else if ("Conconexion".equals(classes.Conexion.importante)) {
                            if ("nuevo".equals(DatosPrincipales.getOpcionExamen())) {
                                es.update_estadosalud();
                                es.validarestadosalud();
                                EstadoSalud.setColorCategoria("con");
                            }
                        }
                    }

                } else if (inforfami.isEnabled()) {

                    inforfami.setEnabled(false);
                    consustan.setVisible(true);
                    consustan.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel7.setForeground(Color.red);

                } else if (infoaca.isEnabled()) {

                    infoaca.setVisible(false);
                    infoaca.setEnabled(false);
                    consustan.setVisible(true);
                    consustan.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel7.setForeground(Color.red);

                } else if (infofinan.isEnabled()) {

                    infofinan.setVisible(false);
                    infofinan.setEnabled(false);
                    consustan.setVisible(true);
                    consustan.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel7.setForeground(Color.red);

                } else if (consbebidas.isEnabled()) {

                    consustan.ValidacionTipoExamen();
                    consbebidas.setVisible(false);
                    consbebidas.setEnabled(false);
                    consustan.setVisible(true);
                    consustan.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel7.setForeground(Color.red);

                } else if (consustan.isEnabled()) {

                    JOptionPane.showMessageDialog(null, "¡Ya se encuentra en uso!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);

                } else if (antece.isEnabled()) {

                    antece.setVisible(false);
                    antece.setEnabled(false);
                    consustan.setVisible(true);
                    consustan.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel7.setForeground(Color.red);

                } else if (vinculos.isEnabled()) {

                    vinculos.setVisible(false);
                    vinculos.setEnabled(false);
                    consustan.setVisible(true);
                    consustan.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel7.setForeground(Color.red);

                } else if (temain.isEnabled()) {

                    temain.setVisible(false);
                    temain.setEnabled(false);
                    consustan.setVisible(true);
                    consustan.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel7.setForeground(Color.red);

                }
            }
        }
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        //pre empleooooooooooooooooooooo
        if (DatosPersonales.getValidacionRegistro().equals("noregistrado")) {
            JOptionPane.showMessageDialog(null, "¡Debe guardar los datos básicos primero!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
        } else if (!EstadoSalud.getVisibilidadflecha().equals("esvisible")) {
            JOptionPane.showMessageDialog(null, "¡No apto en estado de salud!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
        } else {
            if (DatosPrincipales.getTipoExamen().equals("Pre-empleo")) {
                if (daper.isEnabled()) {
                    Date fechavacia = DatoPersonal.fechanaci.getDate();
                    int age = Integer.parseInt(DatosPersonales.getEdad());
                    if (DatosPersonales.getEstrato().equals("-")) {
                        JOptionPane.showMessageDialog(null, "¡Seleccione el estrato del examinado!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else if (age < 17 || age > 70) {
                        JOptionPane.showMessageDialog(null, "¡La edad no se admite!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else if (DatoPersonal.cbxtipoiden.getSelectedItem().equals("Seleccione") || fechavacia == null || (DatoPersonal.txtnombre.getText().equals("") || "".equals(DatoPersonal.txtnombre.getText())) || (DatoPersonal.txtnoiden.getText().equals("") || "".equals(DatoPersonal.txtnoiden.getText())) || (DatoPersonal.txtexpedidos.getText().equals("") || "".equals(DatoPersonal.txtexpedidos.getText())) || (DatoPersonal.txtlugarnaci.getText().equals("") || "".equals(DatoPersonal.txtlugarnaci.getText())) || (DatoPersonal.txtdireccion.getText().equals("") || "".equals(DatoPersonal.txtdireccion.getText())) || (DatoPersonal.txtcargoaspira.getText().equals("") || "".equals(DatoPersonal.txtcargoaspira.getText())) || (DatoPersonal.txtareaaspira.getText().equals("") || "".equals(DatoPersonal.txtareaaspira.getText())) || (DatoPersonal.txtpersonasolicitante.getText().equals("") || "".equals(DatoPersonal.txtpersonasolicitante.getText())) || (DatoPersonal.txtcargosolicitante.getText().equals("") || "".equals(DatoPersonal.txtcargosolicitante.getText()))) {
                        JOptionPane.showMessageDialog(null, "¡Debe completar todos los parámetros para registrar los datos!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else if (DatosPersonales.getGenero().equals("-") || DatosPersonales.getGenero().equals("") || DatosPersonales.getGenero() == null) {
                        JOptionPane.showMessageDialog(null, "¡El género no ha sido seleccionado!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else {

                        nombreExamen();
                        nombreExamen.setText("Nombre examen: " + TecnicaYPreguntas.getNombreExamen());
                        DatosPersonales.setColorCategoria("con");
                        daper.setVisible(false);
                        daper.setEnabled(false);
                        antece.setVisible(true);
                        antece.setEnabled(true);
                        DatoGeneral.fechaizquierda.setVisible(true);
                        DatoGeneral.fechaderecha.setVisible(true);
                        validarColor();
                        jLabel8.setForeground(Color.red);

                        if ("Sinconexion".equals(classes.Conexion.importante)) {
                            btnsave.setVisible(true);
                            DatosPersonales.setValidacionRegistro("registrado");
                        } else if ("Conconexion".equals(classes.Conexion.importante)) {
                            if ("nuevo".equals(DatosPrincipales.getOpcionExamen())) {
                                dp.update_datosper();
                                DatosPersonales.setValidacionRegistro("registrado");

                            }
                        }
                    }
                } else if (estsalud.isEnabled()) {

                    if (EstadoSalud.getEstado_salud().equals("-") || EstadoSalud.getEstado_salud().equals("")) {
                        JOptionPane.showMessageDialog(null, "¡Debe elegir el estado de salud para continuar!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else if (EstadoSalud.getProb_salud().equals("-") || EstadoSalud.getProb_salud().equals("")) {
                        JOptionPane.showMessageDialog(null, "¡Debe completar todos los parámetros para continuar con el examen!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else {
                        EstadoSalud.setColorCategoria("con");
                        estsalud.setVisible(false);
                        estsalud.setEnabled(false);
                        antece.setVisible(true);
                        antece.setEnabled(true);
                        DatoGeneral.fechaizquierda.setVisible(true);
                        DatoGeneral.fechaderecha.setVisible(true);
                        validarColor();
                        jLabel8.setForeground(Color.red);
                        if ("Sinconexion".equals(classes.Conexion.importante)) {

                        } else if ("Conconexion".equals(classes.Conexion.importante)) {
                            if ("nuevo".equals(DatosPrincipales.getOpcionExamen())) {
                                es.update_estadosalud();
                                es.validarestadosalud();

                            }
                        }
                    }

                } else if (inforfami.isEnabled()) {

                    inforfami.setVisible(false);
                    inforfami.setEnabled(false);
                    antece.setVisible(true);
                    antece.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel8.setForeground(Color.red);

                } else if (infoaca.isEnabled()) {

                    infoaca.setVisible(false);
                    infoaca.setEnabled(false);
                    antece.setVisible(true);
                    antece.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel8.setForeground(Color.red);

                } else if (infofinan.isEnabled()) {

                    infofinan.setVisible(false);
                    infofinan.setEnabled(false);
                    antece.setVisible(true);
                    antece.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel8.setForeground(Color.red);

                } else if (casino.isEnabled()) {

                    casino.setVisible(false);
                    casino.setEnabled(false);
                    antece.setVisible(true);
                    antece.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel8.setForeground(Color.red);

                } else if (consbebidas.isEnabled()) {

                    consustan.ValidacionTipoExamen();
                    consbebidas.setVisible(false);
                    consbebidas.setEnabled(false);
                    antece.setVisible(true);
                    antece.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel8.setForeground(Color.red);

                } else if (consustan.isEnabled()) {

                    consustan.setVisible(false);
                    consustan.setEnabled(false);
                    antece.setVisible(true);
                    antece.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel8.setForeground(Color.red);

                } else if (antece.isEnabled()) {

                    JOptionPane.showMessageDialog(null, "¡Ya se encuentra en uso!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);

                } else if (vinculos.isEnabled()) {

                    vinculos.setVisible(false);
                    vinculos.setEnabled(false);
                    antece.setVisible(true);
                    antece.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel8.setForeground(Color.red);

                } else if (falsifi.isEnabled()) {

                    falsifi.setVisible(false);
                    falsifi.setEnabled(false);
                    histlabo.ValidacionTipoExamen();
                    antece.setVisible(true);
                    antece.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel8.setForeground(Color.red);

                } else if (histlabo.isEnabled()) {

                    histlabo.setVisible(false);
                    histlabo.setEnabled(false);
                    antece.setVisible(true);
                    antece.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel8.setForeground(Color.red);

                } else if (planinfil.isEnabled()) {

                    planinfil.setVisible(false);
                    planinfil.setEnabled(false);
                    antece.setVisible(true);
                    antece.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel8.setForeground(Color.red);

                }
            } else //Rutina operacioneeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeees
            if (DatosPrincipales.getTipoExamen().equals("Rutina (operaciones)")) {
                if (daper.isEnabled()) {
                    Date fechavacia = DatoPersonal.fechanaci.getDate();
                    int age = Integer.parseInt(DatosPersonales.getEdad());
                    if (DatosPersonales.getEstrato().equals("-")) {
                        JOptionPane.showMessageDialog(null, "¡Seleccione el estrato del examinado!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else if (age < 17 || age > 70) {
                        JOptionPane.showMessageDialog(null, "¡La edad no se admite!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else if (DatosPersonales.getGenero().equals("-")) {
                        JOptionPane.showMessageDialog(null, "¡El género no ha sido seleccionado!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else if (DatosPrincipales.getMotivoExamen().equals("Procedimiento") && (DatoPersonal.cbxtipoiden.getSelectedItem().equals("Seleccione") || fechavacia == null || DatoPersonal.txtnombre.getText().equals("") || DatoPersonal.txtnoiden.getText().equals("") || DatoPersonal.txtexpedidos.getText().equals("") || DatoPersonal.txtlugarnaci.getText().equals("") || DatoPersonal.txtdireccion.getText().equals("") || DatoPersonal.txtcargoactual.getText().equals("") || DatoPersonal.txtareaactual.getText().equals("") || DatoPersonal.txtpersonasolicitante.getText().equals("") || DatoPersonal.txtcargosolicitante.getText().equals(""))) {

                        JOptionPane.showMessageDialog(null, "¡Debe completar todos los parámetros para registrar los datos!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);

                    } else if (DatosPrincipales.getMotivoExamen().equals("Ascenso") && (DatoPersonal.cbxtipoiden.getSelectedItem().equals("Seleccione") || fechavacia == null || (DatoPersonal.txtnombre.getText().equals("") || "".equals(DatoPersonal.txtnombre.getText())) || (DatoPersonal.txtnoiden.getText().equals("") || "".equals(DatoPersonal.txtnoiden.getText())) || (DatoPersonal.txtexpedidos.getText().equals("") || "".equals(DatoPersonal.txtexpedidos.getText())) || (DatoPersonal.txtlugarnaci.getText().equals("") || "".equals(DatoPersonal.txtlugarnaci.getText())) || (DatoPersonal.txtdireccion.getText().equals("") || "".equals(DatoPersonal.txtdireccion.getText())) || (DatoPersonal.txtcargoaspira.getText().equals("") || "".equals(DatoPersonal.txtcargoaspira.getText())) || (DatoPersonal.txtareaaspira.getText().equals("") || "".equals(DatoPersonal.txtareaaspira.getText())) || (DatoPersonal.txtcargoactual.getText().equals("") || "".equals(DatoPersonal.txtcargoactual.getText())) || (DatoPersonal.txtareaactual.getText().equals("") || "".equals(DatoPersonal.txtareaactual.getText())) || (DatoPersonal.txtpersonasolicitante.getText().equals("") || "".equals(DatoPersonal.txtpersonasolicitante.getText())) || (DatoPersonal.txtcargosolicitante.getText().equals("") || "".equals(DatoPersonal.txtcargosolicitante.getText())))) {

                        JOptionPane.showMessageDialog(null, "¡Debe completar todos los parámetros para registrar los datos!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);

                    } else {

                        nombreExamen();
                        nombreExamen.setText("Nombre examen: " + TecnicaYPreguntas.getNombreExamen());

                        daper.setVisible(false);
                        daper.setEnabled(false);
                        antece.setVisible(true);
                        antece.setEnabled(true);
                        DatoGeneral.fechaizquierda.setVisible(true);
                        DatoGeneral.fechaderecha.setVisible(true);
                        validarColor();
                        jLabel8.setForeground(Color.red);

                        if ("Sinconexion".equals(classes.Conexion.importante)) {
                            btnsave.setVisible(true);
                        } else if ("Conconexion".equals(classes.Conexion.importante)) {
                            if ("nuevo".equals(DatosPrincipales.getOpcionExamen())) {
                                dp.update_datosper();
                                DatosPersonales.setColorCategoria("con");
                                DatosPersonales.setValidacionRegistro("registrado");
                            }
                        }
                    }
                } else if (estsalud.isEnabled()) {

                    if (EstadoSalud.getEstado_salud().equals("-") || EstadoSalud.getEstado_salud().equals("")) {
                        JOptionPane.showMessageDialog(null, "¡Debe elegir el estado de salud para continuar!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else if (EstadoSalud.getProb_salud().equals("-") || EstadoSalud.getProb_salud().equals("")) {
                        JOptionPane.showMessageDialog(null, "¡Debe completar todos los parámetros para continuar con el examen!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else {
                        estsalud.setVisible(false);
                        estsalud.setEnabled(false);
                        antece.setVisible(true);
                        antece.setEnabled(true);
                        DatoGeneral.fechaizquierda.setVisible(true);
                        DatoGeneral.fechaderecha.setVisible(true);
                        validarColor();
                        jLabel8.setForeground(Color.red);

                        if ("Sinconexion".equals(classes.Conexion.importante)) {

                        } else if ("Conconexion".equals(classes.Conexion.importante)) {
                            if ("nuevo".equals(DatosPrincipales.getOpcionExamen())) {
                                es.update_estadosalud();
                                es.validarestadosalud();
                                EstadoSalud.setColorCategoria("con");
                            }
                        }
                    }

                } else if (inforfami.isEnabled()) {

                    inforfami.setVisible(false);
                    inforfami.setEnabled(false);
                    antece.setVisible(true);
                    antece.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel8.setForeground(Color.red);

                } else if (infoaca.isEnabled()) {

                    infoaca.setVisible(false);
                    infoaca.setEnabled(false);
                    antece.setVisible(true);
                    antece.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel8.setForeground(Color.red);

                } else if (infofinan.isEnabled()) {

                    infofinan.setVisible(false);
                    infofinan.setEnabled(false);
                    antece.setVisible(true);
                    antece.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel8.setForeground(Color.red);

                } else if (casino.isEnabled()) {

                    casino.setVisible(false);
                    casino.setEnabled(false);
                    antece.setVisible(true);
                    antece.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel8.setForeground(Color.red);

                } else if (consbebidas.isEnabled()) {

                    consustan.ValidacionTipoExamen();
                    consbebidas.setVisible(false);
                    consbebidas.setEnabled(false);
                    antece.setVisible(true);
                    antece.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel8.setForeground(Color.red);

                } else if (consustan.isEnabled()) {

                    consustan.setVisible(false);
                    consustan.setEnabled(false);
                    antece.setVisible(true);
                    antece.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel8.setForeground(Color.red);

                } else if (antece.isEnabled()) {
                    JOptionPane.showMessageDialog(null, "¡Ya se encuentra en uso!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);

                } else if (vinculos.isEnabled()) {

                    vinculos.setVisible(false);
                    vinculos.setEnabled(false);
                    falsifi.ValidacionTipoExamen();
                    antece.setVisible(true);
                    antece.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel8.setForeground(Color.red);

                } else if (falsifi.isEnabled()) {

                    falsifi.setVisible(false);
                    falsifi.setEnabled(false);
//                        tecp.ValidacionTipoExamen();
                    antece.setVisible(true);
                    antece.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel8.setForeground(Color.red);

                }
            } else //Rutina administrativooooooooooooooooooooooooooooooooooooooooooooooos
            if (DatosPrincipales.getTipoExamen().equals("Rutina (admitivos)")) {

                if (daper.isEnabled()) {
                    Date fechavacia = DatoPersonal.fechanaci.getDate();
                    int age = Integer.parseInt(DatosPersonales.getEdad());
                    if (DatosPersonales.getEstrato().equals("-")) {
                        JOptionPane.showMessageDialog(null, "¡Seleccione el estrato del examinado!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else if (age < 17 || age > 70) {
                        JOptionPane.showMessageDialog(null, "¡La edad no se admite!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else if (DatosPersonales.getGenero().equals("-")) {
                        JOptionPane.showMessageDialog(null, "¡El género no ha sido seleccionado!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else {
                        if (DatosPrincipales.getMotivoExamen().equals("Procedimiento")) {
                            if (DatoPersonal.cbxtipoiden.getSelectedItem().equals("Seleccione") || fechavacia == null || DatoPersonal.txtnombre.getText().equals("") || DatoPersonal.txtnoiden.getText().equals("") || DatoPersonal.txtexpedidos.getText().equals("") || DatoPersonal.txtlugarnaci.getText().equals("") || DatoPersonal.txtdireccion.getText().equals("") || DatoPersonal.txtcargoactual.getText().equals("") || DatoPersonal.txtareaactual.getText().equals("") || DatoPersonal.txtpersonasolicitante.getText().equals("") || DatoPersonal.txtcargosolicitante.getText().equals("")) {
                                JOptionPane.showMessageDialog(null, "¡Debe completar todos los parámetros para registrar los datos!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                            }
                        } else if (DatosPrincipales.getMotivoExamen().equals("Ascenso")) {
                            if (DatoPersonal.cbxtipoiden.getSelectedItem().equals("Seleccione") || fechavacia == null || (DatoPersonal.txtnombre.getText().equals("") || "".equals(DatoPersonal.txtnombre.getText())) || (DatoPersonal.txtnoiden.getText().equals("") || "".equals(DatoPersonal.txtnoiden.getText())) || (DatoPersonal.txtexpedidos.getText().equals("") || "".equals(DatoPersonal.txtexpedidos.getText())) || (DatoPersonal.txtlugarnaci.getText().equals("") || "".equals(DatoPersonal.txtlugarnaci.getText())) || (DatoPersonal.txtdireccion.getText().equals("") || "".equals(DatoPersonal.txtdireccion.getText())) || (DatoPersonal.txtcargoaspira.getText().equals("") || "".equals(DatoPersonal.txtcargoaspira.getText())) || (DatoPersonal.txtareaaspira.getText().equals("") || "".equals(DatoPersonal.txtareaaspira.getText())) || (DatoPersonal.txtcargoactual.getText().equals("") || "".equals(DatoPersonal.txtcargoactual.getText())) || (DatoPersonal.txtareaactual.getText().equals("") || "".equals(DatoPersonal.txtareaactual.getText())) || (DatoPersonal.txtpersonasolicitante.getText().equals("") || "".equals(DatoPersonal.txtpersonasolicitante.getText())) || (DatoPersonal.txtcargosolicitante.getText().equals("") || "".equals(DatoPersonal.txtcargosolicitante.getText()))) {
                                JOptionPane.showMessageDialog(null, "¡Debe completar todos los parámetros para registrar los datos!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                            }
                        }
                        nombreExamen();
                        nombreExamen.setText("Nombre examen: " + TecnicaYPreguntas.getNombreExamen());
                        daper.setVisible(false);
                        daper.setEnabled(false);
                        antece.setVisible(true);
                        antece.setEnabled(true);
                        DatoGeneral.fechaizquierda.setVisible(true);
                        DatoGeneral.fechaderecha.setVisible(true);
                        validarColor();
                        jLabel8.setForeground(Color.red);
                        if ("Sinconexion".equals(classes.Conexion.importante)) {
                            btnsave.setVisible(true);
                        } else if ("Conconexion".equals(classes.Conexion.importante)) {
                            if ("nuevo".equals(DatosPrincipales.getOpcionExamen())) {
                                dp.update_datosper();
                                DatosPersonales.setColorCategoria("con");
                                DatosPersonales.setValidacionRegistro("registrado");
                            }
                        }
                    }
                } else if (estsalud.isEnabled()) {

                    if (EstadoSalud.getEstado_salud().equals("-") || EstadoSalud.getEstado_salud().equals("")) {
                        JOptionPane.showMessageDialog(null, "¡Debe elegir el estado de salud para continuar!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else if (EstadoSalud.getProb_salud().equals("-") || EstadoSalud.getProb_salud().equals("")) {
                        JOptionPane.showMessageDialog(null, "¡Debe completar todos los parámetros para continuar con el examen!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else {
                        estsalud.setVisible(false);
                        estsalud.setEnabled(false);
                        antece.setVisible(true);
                        antece.setEnabled(true);
                        DatoGeneral.fechaizquierda.setVisible(true);
                        DatoGeneral.fechaderecha.setVisible(true);
                        validarColor();
                        jLabel8.setForeground(Color.red);

                        if ("Sinconexion".equals(classes.Conexion.importante)) {

                        } else if ("Conconexion".equals(classes.Conexion.importante)) {
                            if ("nuevo".equals(DatosPrincipales.getOpcionExamen())) {
                                es.update_estadosalud();
                                es.validarestadosalud();
                                EstadoSalud.setColorCategoria("con");
                            }
                        }
                    }

                } else if (inforfami.isEnabled()) {

                    inforfami.setVisible(false);
                    inforfami.setEnabled(false);
                    antece.setVisible(true);
                    antece.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel8.setForeground(Color.red);

                } else if (infoaca.isEnabled()) {

                    infoaca.setVisible(false);
                    infoaca.setEnabled(false);
                    antece.setVisible(true);
                    antece.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel8.setForeground(Color.red);

                } else if (infofinan.isEnabled()) {

                    infofinan.setVisible(false);
                    infofinan.setEnabled(false);
                    antece.setVisible(true);
                    antece.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel8.setForeground(Color.red);

                } else if (casino.isEnabled()) {

                    casino.setVisible(false);
                    casino.setEnabled(false);
                    antece.setVisible(true);
                    antece.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel8.setForeground(Color.red);

                } else if (consbebidas.isEnabled()) {

                    consustan.ValidacionTipoExamen();
                    consbebidas.setVisible(false);
                    consbebidas.setEnabled(false);
                    antece.setVisible(true);
                    antece.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel8.setForeground(Color.red);

                } else if (consustan.isEnabled()) {

                    consustan.setVisible(false);
                    consustan.setEnabled(false);
                    antece.setVisible(true);
                    antece.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel8.setForeground(Color.red);

                } else if (antece.isEnabled()) {
                    JOptionPane.showMessageDialog(null, "¡Ya se encuentra en uso!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);

                } else if (vinculos.isEnabled()) {

                    vinculos.setVisible(false);
                    vinculos.setEnabled(false);
                    falsifi.ValidacionTipoExamen();
                    antece.setVisible(true);
                    antece.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel8.setForeground(Color.red);

                } else if (falsifi.isEnabled()) {

                    falsifi.setVisible(false);
                    falsifi.setEnabled(false);
                    histlabo.ValidacionTipoExamen();
                    antece.setVisible(true);
                    antece.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel8.setForeground(Color.red);

                } else if (histlabo.isEnabled()) {

                    histlabo.setVisible(false);
                    histlabo.setEnabled(false);
                    antece.setVisible(true);
                    antece.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel8.setForeground(Color.red);

                } else if (planinfil.isEnabled()) {

                    planinfil.setVisible(false);
                    planinfil.setEnabled(false);
                    antece.setVisible(true);
                    antece.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel8.setForeground(Color.red);
                }

            } else //Especificooooooooooooooooooooooooooooooooooooooooooo
            if (DatosPrincipales.getTipoExamen().equals("Específico")) {
                if (daper.isEnabled()) {
                    Date fechavacia = DatoPersonal.fechanaci.getDate();
                    int age = Integer.parseInt(DatosPersonales.getEdad());
                    if (DatosPersonales.getEstrato().equals("-")) {
                        JOptionPane.showMessageDialog(null, "¡Seleccione el estrato del examinado!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else if (age < 17 || age > 70) {
                        JOptionPane.showMessageDialog(null, "¡La edad no se admite!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else if (DatoPersonal.cbxtipoiden.getSelectedItem().equals("Seleccione") || fechavacia == null || (DatoPersonal.txtnombre.getText().equals("") || "".equals(DatoPersonal.txtnombre.getText())) || (DatoPersonal.txtnoiden.getText().equals("") || "".equals(DatoPersonal.txtnoiden.getText())) || (DatoPersonal.txtexpedidos.getText().equals("") || "".equals(DatoPersonal.txtexpedidos.getText())) || (DatoPersonal.txtlugarnaci.getText().equals("") || "".equals(DatoPersonal.txtlugarnaci.getText())) || (DatoPersonal.txtdireccion.getText().equals("") || "".equals(DatoPersonal.txtdireccion.getText())) || (DatoPersonal.txtpersonasolicitante.getText().equals("") || "".equals(DatoPersonal.txtpersonasolicitante.getText())) || (DatoPersonal.txtcargosolicitante.getText().equals("") || "".equals(DatoPersonal.txtcargosolicitante.getText())) || (DatoPersonal.txtareaactual.getText().equals("") || "".equals(DatoPersonal.txtareaactual.getText())) || (DatoPersonal.txtcargoactual.getText().equals("") || "".equals(DatoPersonal.txtcargoactual.getText()))) {
                        JOptionPane.showMessageDialog(null, "¡Debe completar todos los parámetros para registrar los datos!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else if (DatosPersonales.getGenero().equals("-") || DatosPersonales.getGenero().equals("") || DatosPersonales.getGenero() == null) {
                        JOptionPane.showMessageDialog(null, "¡El género no ha sido seleccionado!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else {

                        nombreExamen();
                        nombreExamen.setText("Nombre examen: " + TecnicaYPreguntas.getNombreExamen());
                        daper.setVisible(false);
                        daper.setEnabled(false);
                        antece.setVisible(true);
                        antece.setEnabled(true);
                        DatoGeneral.fechaizquierda.setVisible(true);
                        DatoGeneral.fechaderecha.setVisible(true);
                        validarColor();
                        jLabel8.setForeground(Color.red);

                        if ("Sinconexion".equals(classes.Conexion.importante)) {
                            btnsave.setVisible(true);
                        } else if ("Conconexion".equals(classes.Conexion.importante)) {
                            if ("nuevo".equals(DatosPrincipales.getOpcionExamen())) {
                                dp.update_datosper();
                                DatosPersonales.setColorCategoria("con");
                                DatosPersonales.setValidacionRegistro("registrado");
                            }
                        }
                    }
                } else if (estsalud.isEnabled()) {

                    if (EstadoSalud.getEstado_salud().equals("-") || EstadoSalud.getEstado_salud().equals("")) {
                        JOptionPane.showMessageDialog(null, "¡Debe elegir el estado de salud para continuar!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else if (EstadoSalud.getProb_salud().equals("-") || EstadoSalud.getProb_salud().equals("")) {
                        JOptionPane.showMessageDialog(null, "¡Debe completar todos los parámetros para continuar con el examen!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else {
                        estsalud.setVisible(false);
                        estsalud.setEnabled(false);
                        antece.setVisible(true);
                        antece.setEnabled(true);
                        DatoGeneral.fechaizquierda.setVisible(true);
                        DatoGeneral.fechaderecha.setVisible(true);
                        validarColor();
                        jLabel8.setForeground(Color.red);

                        if ("Sinconexion".equals(classes.Conexion.importante)) {

                        } else if ("Conconexion".equals(classes.Conexion.importante)) {
                            if ("nuevo".equals(DatosPrincipales.getOpcionExamen())) {
                                es.update_estadosalud();
                                es.validarestadosalud();
                                EstadoSalud.setColorCategoria("con");
                            }
                        }
                    }

                } else if (inforfami.isEnabled()) {

                    inforfami.setVisible(false);
                    inforfami.setEnabled(false);
                    antece.setVisible(true);
                    antece.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel8.setForeground(Color.red);

                } else if (infoaca.isEnabled()) {

                    infoaca.setVisible(false);
                    infoaca.setEnabled(false);
                    antece.setVisible(true);
                    antece.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel8.setForeground(Color.red);

                } else if (infofinan.isEnabled()) {

                    infofinan.setVisible(false);
                    infofinan.setEnabled(false);
                    antece.setVisible(true);
                    antece.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel8.setForeground(Color.red);

                } else if (consbebidas.isEnabled()) {

                    consustan.ValidacionTipoExamen();
                    consbebidas.setVisible(false);
                    consbebidas.setEnabled(false);
                    antece.setVisible(true);
                    antece.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel8.setForeground(Color.red);

                } else if (consustan.isEnabled()) {

                    consustan.setVisible(false);
                    consustan.setEnabled(false);
                    antece.setVisible(true);
                    antece.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel8.setForeground(Color.red);

                } else if (antece.isEnabled()) {
                    JOptionPane.showMessageDialog(null, "¡Ya se encuentra en uso!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);

                } else if (vinculos.isEnabled()) {

                    vinculos.setVisible(false);
                    vinculos.setEnabled(false);
                    antece.setVisible(true);
                    antece.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel8.setForeground(Color.red);

                } else if (temain.isEnabled()) {

                    temain.setVisible(false);
                    temain.setEnabled(false);
                    antece.setVisible(true);
                    antece.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel8.setForeground(Color.red);

                }
            }

        }
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        //pre empleooooooooooooooooooooo
        if (DatosPersonales.getValidacionRegistro().equals("noregistrado")) {
            JOptionPane.showMessageDialog(null, "¡Debe guardar los datos básicos primero!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
        } else if (!EstadoSalud.getVisibilidadflecha().equals("esvisible")) {
            JOptionPane.showMessageDialog(null, "¡No apto en estado de salud!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
        } else {
            if (DatosPrincipales.getTipoExamen().equals("Pre-empleo")) {
                if (daper.isEnabled()) {
                    Date fechavacia = DatoPersonal.fechanaci.getDate();
                    int age = Integer.parseInt(DatosPersonales.getEdad());
                    if (DatosPersonales.getEstrato().equals("-")) {
                        JOptionPane.showMessageDialog(null, "¡Seleccione el estrato del examinado!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else if (age < 17 || age > 70) {
                        JOptionPane.showMessageDialog(null, "¡La edad no se admite!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else if (DatoPersonal.cbxtipoiden.getSelectedItem().equals("Seleccione") || fechavacia == null || (DatoPersonal.txtnombre.getText().equals("") || "".equals(DatoPersonal.txtnombre.getText())) || (DatoPersonal.txtnoiden.getText().equals("") || "".equals(DatoPersonal.txtnoiden.getText())) || (DatoPersonal.txtexpedidos.getText().equals("") || "".equals(DatoPersonal.txtexpedidos.getText())) || (DatoPersonal.txtlugarnaci.getText().equals("") || "".equals(DatoPersonal.txtlugarnaci.getText())) || (DatoPersonal.txtdireccion.getText().equals("") || "".equals(DatoPersonal.txtdireccion.getText())) || (DatoPersonal.txtcargoaspira.getText().equals("") || "".equals(DatoPersonal.txtcargoaspira.getText())) || (DatoPersonal.txtareaaspira.getText().equals("") || "".equals(DatoPersonal.txtareaaspira.getText())) || (DatoPersonal.txtpersonasolicitante.getText().equals("") || "".equals(DatoPersonal.txtpersonasolicitante.getText())) || (DatoPersonal.txtcargosolicitante.getText().equals("") || "".equals(DatoPersonal.txtcargosolicitante.getText()))) {
                        JOptionPane.showMessageDialog(null, "¡Debe completar todos los parámetros para registrar los datos!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else if (DatosPersonales.getGenero().equals("-") || DatosPersonales.getGenero().equals("") || DatosPersonales.getGenero() == null) {
                        JOptionPane.showMessageDialog(null, "¡El género no ha sido seleccionado!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else {

                        nombreExamen();
                        nombreExamen.setText("Nombre examen: " + TecnicaYPreguntas.getNombreExamen());
                        DatosPersonales.setColorCategoria("con");
                        daper.setVisible(false);
                        daper.setEnabled(false);
                        vinculos.setVisible(true);
                        vinculos.setEnabled(true);
                        DatoGeneral.fechaizquierda.setVisible(true);
                        DatoGeneral.fechaderecha.setVisible(true);
                        validarColor();
                        jLabel9.setForeground(Color.red);

                        if ("Sinconexion".equals(classes.Conexion.importante)) {
                            btnsave.setVisible(true);
                            DatosPersonales.setValidacionRegistro("registrado");
                        } else if ("Conconexion".equals(classes.Conexion.importante)) {
                            if ("nuevo".equals(DatosPrincipales.getOpcionExamen())) {
                                dp.update_datosper();
                                DatosPersonales.setValidacionRegistro("registrado");

                            }
                        }
                    }
                } else if (estsalud.isEnabled()) {

                    if (EstadoSalud.getEstado_salud().equals("-") || EstadoSalud.getEstado_salud().equals("")) {
                        JOptionPane.showMessageDialog(null, "¡Debe elegir el estado de salud para continuar!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else if (EstadoSalud.getProb_salud().equals("-") || EstadoSalud.getProb_salud().equals("")) {
                        JOptionPane.showMessageDialog(null, "¡Debe completar todos los parámetros para continuar con el examen!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else {
                        EstadoSalud.setColorCategoria("con");
                        estsalud.setVisible(false);
                        estsalud.setEnabled(false);
                        vinculos.setVisible(true);
                        vinculos.setEnabled(true);
                        DatoGeneral.fechaizquierda.setVisible(true);
                        DatoGeneral.fechaderecha.setVisible(true);
                        validarColor();
                        jLabel9.setForeground(Color.red);
                        if ("Sinconexion".equals(classes.Conexion.importante)) {

                        } else if ("Conconexion".equals(classes.Conexion.importante)) {
                            if ("nuevo".equals(DatosPrincipales.getOpcionExamen())) {
                                es.update_estadosalud();
                                es.validarestadosalud();

                            }
                        }
                    }

                } else if (inforfami.isEnabled()) {

                    inforfami.setVisible(false);
                    inforfami.setEnabled(false);
                    vinculos.setVisible(true);
                    vinculos.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel9.setForeground(Color.red);

                } else if (infoaca.isEnabled()) {

                    infoaca.setVisible(false);
                    infoaca.setEnabled(false);
                    vinculos.setVisible(true);
                    vinculos.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel9.setForeground(Color.red);

                } else if (infofinan.isEnabled()) {

                    infofinan.setVisible(false);
                    infofinan.setEnabled(false);
                    vinculos.setVisible(true);
                    vinculos.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel9.setForeground(Color.red);

                } else if (casino.isEnabled()) {

                    casino.setVisible(false);
                    casino.setEnabled(false);
                    vinculos.setVisible(true);
                    vinculos.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel9.setForeground(Color.red);

                } else if (consbebidas.isEnabled()) {

                    consustan.ValidacionTipoExamen();
                    consbebidas.setVisible(false);
                    consbebidas.setEnabled(false);
                    vinculos.setVisible(true);
                    vinculos.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel9.setForeground(Color.red);

                } else if (consustan.isEnabled()) {

                    consustan.setVisible(false);
                    consustan.setEnabled(false);
                    vinculos.setVisible(true);
                    vinculos.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel9.setForeground(Color.red);

                } else if (antece.isEnabled()) {

                    antece.setVisible(false);
                    antece.setEnabled(false);
                    vinculos.setVisible(true);
                    vinculos.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel9.setForeground(Color.red);

                } else if (vinculos.isEnabled()) {

                    JOptionPane.showMessageDialog(null, "¡Ya se encuentra en uso!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);

                } else if (falsifi.isEnabled()) {

                    falsifi.setVisible(false);
                    falsifi.setEnabled(false);
                    histlabo.ValidacionTipoExamen();
                    vinculos.setVisible(true);
                    vinculos.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel9.setForeground(Color.red);

                } else if (histlabo.isEnabled()) {

                    histlabo.setVisible(false);
                    histlabo.setEnabled(false);
                    vinculos.setVisible(true);
                    vinculos.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel9.setForeground(Color.red);

                } else if (planinfil.isEnabled()) {

                    planinfil.setVisible(false);
                    planinfil.setEnabled(false);
                    vinculos.setVisible(true);
                    vinculos.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel9.setForeground(Color.red);

                }
            } else //Rutina operacioneeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeees
            if (DatosPrincipales.getTipoExamen().equals("Rutina (operaciones)")) {
                if (daper.isEnabled()) {
                    Date fechavacia = DatoPersonal.fechanaci.getDate();
                    int age = Integer.parseInt(DatosPersonales.getEdad());
                    if (DatosPersonales.getEstrato().equals("-")) {
                        JOptionPane.showMessageDialog(null, "¡Seleccione el estrato del examinado!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else if (age < 17 || age > 70) {
                        JOptionPane.showMessageDialog(null, "¡La edad no se admite!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else if (DatosPersonales.getGenero().equals("-")) {
                        JOptionPane.showMessageDialog(null, "¡El género no ha sido seleccionado!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else if (DatosPrincipales.getMotivoExamen().equals("Procedimiento") && (DatoPersonal.cbxtipoiden.getSelectedItem().equals("Seleccione") || fechavacia == null || DatoPersonal.txtnombre.getText().equals("") || DatoPersonal.txtnoiden.getText().equals("") || DatoPersonal.txtexpedidos.getText().equals("") || DatoPersonal.txtlugarnaci.getText().equals("") || DatoPersonal.txtdireccion.getText().equals("") || DatoPersonal.txtcargoactual.getText().equals("") || DatoPersonal.txtareaactual.getText().equals("") || DatoPersonal.txtpersonasolicitante.getText().equals("") || DatoPersonal.txtcargosolicitante.getText().equals(""))) {

                        JOptionPane.showMessageDialog(null, "¡Debe completar todos los parámetros para registrar los datos!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);

                    } else if (DatosPrincipales.getMotivoExamen().equals("Ascenso") && (DatoPersonal.cbxtipoiden.getSelectedItem().equals("Seleccione") || fechavacia == null || (DatoPersonal.txtnombre.getText().equals("") || "".equals(DatoPersonal.txtnombre.getText())) || (DatoPersonal.txtnoiden.getText().equals("") || "".equals(DatoPersonal.txtnoiden.getText())) || (DatoPersonal.txtexpedidos.getText().equals("") || "".equals(DatoPersonal.txtexpedidos.getText())) || (DatoPersonal.txtlugarnaci.getText().equals("") || "".equals(DatoPersonal.txtlugarnaci.getText())) || (DatoPersonal.txtdireccion.getText().equals("") || "".equals(DatoPersonal.txtdireccion.getText())) || (DatoPersonal.txtcargoaspira.getText().equals("") || "".equals(DatoPersonal.txtcargoaspira.getText())) || (DatoPersonal.txtareaaspira.getText().equals("") || "".equals(DatoPersonal.txtareaaspira.getText())) || (DatoPersonal.txtcargoactual.getText().equals("") || "".equals(DatoPersonal.txtcargoactual.getText())) || (DatoPersonal.txtareaactual.getText().equals("") || "".equals(DatoPersonal.txtareaactual.getText())) || (DatoPersonal.txtpersonasolicitante.getText().equals("") || "".equals(DatoPersonal.txtpersonasolicitante.getText())) || (DatoPersonal.txtcargosolicitante.getText().equals("") || "".equals(DatoPersonal.txtcargosolicitante.getText())))) {

                        JOptionPane.showMessageDialog(null, "¡Debe completar todos los parámetros para registrar los datos!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);

                    } else {

                        nombreExamen();
                        nombreExamen.setText("Nombre examen: " + TecnicaYPreguntas.getNombreExamen());

                        daper.setVisible(false);
                        daper.setEnabled(false);
                        vinculos.setVisible(true);
                        vinculos.setEnabled(true);
                        DatoGeneral.fechaizquierda.setVisible(true);
                        DatoGeneral.fechaderecha.setVisible(true);
                        validarColor();
                        jLabel9.setForeground(Color.red);

                        if ("Sinconexion".equals(classes.Conexion.importante)) {
                            btnsave.setVisible(true);
                        } else if ("Conconexion".equals(classes.Conexion.importante)) {
                            if ("nuevo".equals(DatosPrincipales.getOpcionExamen())) {
                                dp.update_datosper();
                                DatosPersonales.setColorCategoria("con");
                                DatosPersonales.setValidacionRegistro("registrado");
                            }
                        }
                    }
                } else if (estsalud.isEnabled()) {

                    if (EstadoSalud.getEstado_salud().equals("-") || EstadoSalud.getEstado_salud().equals("")) {
                        JOptionPane.showMessageDialog(null, "¡Debe elegir el estado de salud para continuar!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else if (EstadoSalud.getProb_salud().equals("-") || EstadoSalud.getProb_salud().equals("")) {
                        JOptionPane.showMessageDialog(null, "¡Debe completar todos los parámetros para continuar con el examen!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else {
                        estsalud.setVisible(false);
                        estsalud.setEnabled(false);
                        vinculos.setVisible(true);
                        vinculos.setEnabled(true);
                        DatoGeneral.fechaizquierda.setVisible(true);
                        DatoGeneral.fechaderecha.setVisible(true);
                        validarColor();
                        jLabel9.setForeground(Color.red);

                        if ("Sinconexion".equals(classes.Conexion.importante)) {

                        } else if ("Conconexion".equals(classes.Conexion.importante)) {
                            if ("nuevo".equals(DatosPrincipales.getOpcionExamen())) {
                                es.update_estadosalud();
                                es.validarestadosalud();
                                EstadoSalud.setColorCategoria("con");
                            }
                        }
                    }

                } else if (inforfami.isEnabled()) {

                    inforfami.setVisible(false);
                    inforfami.setEnabled(false);
                    vinculos.setVisible(true);
                    vinculos.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel9.setForeground(Color.red);

                } else if (infoaca.isEnabled()) {

                    infoaca.setVisible(false);
                    infoaca.setEnabled(false);
                    vinculos.setVisible(true);
                    vinculos.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel9.setForeground(Color.red);

                } else if (infofinan.isEnabled()) {

                    infofinan.setVisible(false);
                    infofinan.setEnabled(false);
                    vinculos.setVisible(true);
                    vinculos.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel9.setForeground(Color.red);

                } else if (casino.isEnabled()) {

                    casino.setVisible(false);
                    casino.setEnabled(false);
                    vinculos.setVisible(true);
                    vinculos.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel9.setForeground(Color.red);

                } else if (consbebidas.isEnabled()) {

                    consustan.ValidacionTipoExamen();
                    consbebidas.setVisible(false);
                    consbebidas.setEnabled(false);
                    vinculos.setVisible(true);
                    vinculos.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel9.setForeground(Color.red);

                } else if (consustan.isEnabled()) {

                    consustan.setVisible(false);
                    consustan.setEnabled(false);
                    vinculos.setVisible(true);
                    vinculos.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel9.setForeground(Color.red);

                } else if (antece.isEnabled()) {

                    antece.setVisible(false);
                    antece.setEnabled(false);
                    vinculos.setVisible(true);
                    vinculos.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel9.setForeground(Color.red);

                } else if (vinculos.isEnabled()) {
                    JOptionPane.showMessageDialog(null, "¡Ya se encuentra en uso!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);

                } else if (falsifi.isEnabled()) {

                    falsifi.setVisible(false);
                    falsifi.setEnabled(false);
//                        tecp.ValidacionTipoExamen();
                    vinculos.setVisible(true);
                    vinculos.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel9.setForeground(Color.red);

                }
            } else //Rutina administrativooooooooooooooooooooooooooooooooooooooooooooooos
            if (DatosPrincipales.getTipoExamen().equals("Rutina (admitivos)")) {

                if (daper.isEnabled()) {
                    Date fechavacia = DatoPersonal.fechanaci.getDate();
                    int age = Integer.parseInt(DatosPersonales.getEdad());
                    if (DatosPersonales.getEstrato().equals("-")) {
                        JOptionPane.showMessageDialog(null, "¡Seleccione el estrato del examinado!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else if (age < 17 || age > 70) {
                        JOptionPane.showMessageDialog(null, "¡La edad no se admite!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else if (DatosPersonales.getGenero().equals("-")) {
                        JOptionPane.showMessageDialog(null, "¡El género no ha sido seleccionado!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else {
                        if (DatosPrincipales.getMotivoExamen().equals("Procedimiento")) {
                            if (DatoPersonal.cbxtipoiden.getSelectedItem().equals("Seleccione") || fechavacia == null || DatoPersonal.txtnombre.getText().equals("") || DatoPersonal.txtnoiden.getText().equals("") || DatoPersonal.txtexpedidos.getText().equals("") || DatoPersonal.txtlugarnaci.getText().equals("") || DatoPersonal.txtdireccion.getText().equals("") || DatoPersonal.txtcargoactual.getText().equals("") || DatoPersonal.txtareaactual.getText().equals("") || DatoPersonal.txtpersonasolicitante.getText().equals("") || DatoPersonal.txtcargosolicitante.getText().equals("")) {
                                JOptionPane.showMessageDialog(null, "¡Debe completar todos los parámetros para registrar los datos!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                            }
                        } else if (DatosPrincipales.getMotivoExamen().equals("Ascenso")) {
                            if (DatoPersonal.cbxtipoiden.getSelectedItem().equals("Seleccione") || fechavacia == null || (DatoPersonal.txtnombre.getText().equals("") || "".equals(DatoPersonal.txtnombre.getText())) || (DatoPersonal.txtnoiden.getText().equals("") || "".equals(DatoPersonal.txtnoiden.getText())) || (DatoPersonal.txtexpedidos.getText().equals("") || "".equals(DatoPersonal.txtexpedidos.getText())) || (DatoPersonal.txtlugarnaci.getText().equals("") || "".equals(DatoPersonal.txtlugarnaci.getText())) || (DatoPersonal.txtdireccion.getText().equals("") || "".equals(DatoPersonal.txtdireccion.getText())) || (DatoPersonal.txtcargoaspira.getText().equals("") || "".equals(DatoPersonal.txtcargoaspira.getText())) || (DatoPersonal.txtareaaspira.getText().equals("") || "".equals(DatoPersonal.txtareaaspira.getText())) || (DatoPersonal.txtcargoactual.getText().equals("") || "".equals(DatoPersonal.txtcargoactual.getText())) || (DatoPersonal.txtareaactual.getText().equals("") || "".equals(DatoPersonal.txtareaactual.getText())) || (DatoPersonal.txtpersonasolicitante.getText().equals("") || "".equals(DatoPersonal.txtpersonasolicitante.getText())) || (DatoPersonal.txtcargosolicitante.getText().equals("") || "".equals(DatoPersonal.txtcargosolicitante.getText()))) {
                                JOptionPane.showMessageDialog(null, "¡Debe completar todos los parámetros para registrar los datos!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                            }
                        }
                        nombreExamen();
                        nombreExamen.setText("Nombre examen: " + TecnicaYPreguntas.getNombreExamen());
                        daper.setVisible(false);
                        daper.setEnabled(false);
                        vinculos.setVisible(true);
                        vinculos.setEnabled(true);
                        DatoGeneral.fechaizquierda.setVisible(true);
                        DatoGeneral.fechaderecha.setVisible(true);
                        validarColor();
                        jLabel9.setForeground(Color.red);

                        if ("Sinconexion".equals(classes.Conexion.importante)) {
                            btnsave.setVisible(true);
                        } else if ("Conconexion".equals(classes.Conexion.importante)) {
                            if ("nuevo".equals(DatosPrincipales.getOpcionExamen())) {
                                dp.update_datosper();
                                DatosPersonales.setColorCategoria("con");
                                DatosPersonales.setValidacionRegistro("registrado");
                            }
                        }
                    }
                } else if (estsalud.isEnabled()) {

                    if (EstadoSalud.getEstado_salud().equals("-") || EstadoSalud.getEstado_salud().equals("")) {
                        JOptionPane.showMessageDialog(null, "¡Debe elegir el estado de salud para continuar!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else if (EstadoSalud.getProb_salud().equals("-") || EstadoSalud.getProb_salud().equals("")) {
                        JOptionPane.showMessageDialog(null, "¡Debe completar todos los parámetros para continuar con el examen!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else {
                        estsalud.setVisible(false);
                        estsalud.setEnabled(false);
                        vinculos.setVisible(true);
                        vinculos.setEnabled(true);
                        DatoGeneral.fechaizquierda.setVisible(true);
                        DatoGeneral.fechaderecha.setVisible(true);
                        validarColor();
                        jLabel9.setForeground(Color.red);

                        if ("Sinconexion".equals(classes.Conexion.importante)) {

                        } else if ("Conconexion".equals(classes.Conexion.importante)) {
                            if ("nuevo".equals(DatosPrincipales.getOpcionExamen())) {
                                es.update_estadosalud();
                                es.validarestadosalud();
                                EstadoSalud.setColorCategoria("con");
                            }
                        }
                    }

                } else if (inforfami.isEnabled()) {

                    inforfami.setVisible(false);
                    inforfami.setEnabled(false);
                    vinculos.setVisible(true);
                    vinculos.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel9.setForeground(Color.red);

                } else if (infoaca.isEnabled()) {

                    infoaca.setVisible(false);
                    infoaca.setEnabled(false);
                    vinculos.setVisible(true);
                    vinculos.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel9.setForeground(Color.red);

                } else if (infofinan.isEnabled()) {

                    infofinan.setVisible(false);
                    infofinan.setEnabled(false);
                    vinculos.setVisible(true);
                    vinculos.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel9.setForeground(Color.red);

                } else if (casino.isEnabled()) {

                    casino.setVisible(false);
                    casino.setEnabled(false);
                    vinculos.setVisible(true);
                    vinculos.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel9.setForeground(Color.red);

                } else if (consbebidas.isEnabled()) {

                    consustan.ValidacionTipoExamen();
                    consbebidas.setVisible(false);
                    consbebidas.setEnabled(false);
                    vinculos.setVisible(true);
                    vinculos.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel9.setForeground(Color.red);

                } else if (consustan.isEnabled()) {

                    consustan.setVisible(false);
                    consustan.setEnabled(false);
                    vinculos.setVisible(true);
                    vinculos.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel9.setForeground(Color.red);

                } else if (antece.isEnabled()) {

                    antece.setVisible(false);
                    antece.setEnabled(false);
                    vinculos.setVisible(true);
                    vinculos.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel9.setForeground(Color.red);

                } else if (vinculos.isEnabled()) {
                    JOptionPane.showMessageDialog(null, "¡Ya se encuentra en uso!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);

                } else if (falsifi.isEnabled()) {

                    falsifi.setVisible(false);
                    falsifi.setEnabled(false);
                    histlabo.ValidacionTipoExamen();
                    vinculos.setVisible(true);
                    vinculos.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel9.setForeground(Color.red);

                } else if (histlabo.isEnabled()) {

                    histlabo.setVisible(false);
                    histlabo.setEnabled(false);
                    vinculos.setVisible(true);
                    vinculos.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel9.setForeground(Color.red);

                } else if (planinfil.isEnabled()) {

                    planinfil.setVisible(false);
                    planinfil.setEnabled(false);
                    vinculos.setVisible(true);
                    vinculos.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel9.setForeground(Color.red);

                }

            } else //Especificooooooooooooooooooooooooooooooooooooooooooo
            if (DatosPrincipales.getTipoExamen().equals("Específico")) {
                if (daper.isEnabled()) {
                    Date fechavacia = DatoPersonal.fechanaci.getDate();
                    int age = Integer.parseInt(DatosPersonales.getEdad());
                    if (DatosPersonales.getEstrato().equals("-")) {
                        JOptionPane.showMessageDialog(null, "¡Seleccione el estrato del examinado!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else if (age < 17 || age > 70) {
                        JOptionPane.showMessageDialog(null, "¡La edad no se admite!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else if (DatoPersonal.cbxtipoiden.getSelectedItem().equals("Seleccione") || fechavacia == null || (DatoPersonal.txtnombre.getText().equals("") || "".equals(DatoPersonal.txtnombre.getText())) || (DatoPersonal.txtnoiden.getText().equals("") || "".equals(DatoPersonal.txtnoiden.getText())) || (DatoPersonal.txtexpedidos.getText().equals("") || "".equals(DatoPersonal.txtexpedidos.getText())) || (DatoPersonal.txtlugarnaci.getText().equals("") || "".equals(DatoPersonal.txtlugarnaci.getText())) || (DatoPersonal.txtdireccion.getText().equals("") || "".equals(DatoPersonal.txtdireccion.getText())) || (DatoPersonal.txtpersonasolicitante.getText().equals("") || "".equals(DatoPersonal.txtpersonasolicitante.getText())) || (DatoPersonal.txtcargosolicitante.getText().equals("") || "".equals(DatoPersonal.txtcargosolicitante.getText())) || (DatoPersonal.txtareaactual.getText().equals("") || "".equals(DatoPersonal.txtareaactual.getText())) || (DatoPersonal.txtcargoactual.getText().equals("") || "".equals(DatoPersonal.txtcargoactual.getText()))) {
                        JOptionPane.showMessageDialog(null, "¡Debe completar todos los parámetros para registrar los datos!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else if (DatosPersonales.getGenero().equals("-") || DatosPersonales.getGenero().equals("") || DatosPersonales.getGenero() == null) {
                        JOptionPane.showMessageDialog(null, "¡El género no ha sido seleccionado!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else {

                        nombreExamen();
                        nombreExamen.setText("Nombre examen: " + TecnicaYPreguntas.getNombreExamen());
                        daper.setVisible(false);
                        daper.setEnabled(false);
                        vinculos.setVisible(true);
                        vinculos.setEnabled(true);
                        DatoGeneral.fechaizquierda.setVisible(true);
                        DatoGeneral.fechaderecha.setVisible(true);
                        validarColor();
                        jLabel9.setForeground(Color.red);

                        if ("Sinconexion".equals(classes.Conexion.importante)) {
                            btnsave.setVisible(true);
                        } else if ("Conconexion".equals(classes.Conexion.importante)) {
                            if ("nuevo".equals(DatosPrincipales.getOpcionExamen())) {
                                dp.update_datosper();
                                DatosPersonales.setColorCategoria("con");
                                DatosPersonales.setValidacionRegistro("registrado");
                            }
                        }
                    }
                } else if (estsalud.isEnabled()) {

                    if (EstadoSalud.getEstado_salud().equals("-") || EstadoSalud.getEstado_salud().equals("")) {
                        JOptionPane.showMessageDialog(null, "¡Debe elegir el estado de salud para continuar!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else if (EstadoSalud.getProb_salud().equals("-") || EstadoSalud.getProb_salud().equals("")) {
                        JOptionPane.showMessageDialog(null, "¡Debe completar todos los parámetros para continuar con el examen!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else {
                        estsalud.setVisible(false);
                        estsalud.setEnabled(false);
                        vinculos.setVisible(true);
                        vinculos.setEnabled(true);
                        DatoGeneral.fechaizquierda.setVisible(true);
                        DatoGeneral.fechaderecha.setVisible(true);
                        validarColor();
                        jLabel9.setForeground(Color.red);

                        if ("Sinconexion".equals(classes.Conexion.importante)) {

                        } else if ("Conconexion".equals(classes.Conexion.importante)) {
                            if ("nuevo".equals(DatosPrincipales.getOpcionExamen())) {
                                es.update_estadosalud();
                                es.validarestadosalud();
                                EstadoSalud.setColorCategoria("con");
                            }
                        }
                    }

                } else if (inforfami.isEnabled()) {

                    inforfami.setVisible(false);
                    inforfami.setEnabled(false);
                    vinculos.setVisible(true);
                    vinculos.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel9.setForeground(Color.red);

                } else if (infoaca.isEnabled()) {

                    infoaca.setVisible(false);
                    infoaca.setEnabled(false);
                    vinculos.setVisible(true);
                    vinculos.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel9.setForeground(Color.red);

                } else if (infofinan.isEnabled()) {

                    infofinan.setVisible(false);
                    infofinan.setEnabled(false);
                    vinculos.setVisible(true);
                    vinculos.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel9.setForeground(Color.red);

                    if ("Sinconexion".equals(classes.Conexion.importante)) {

                    } else if ("Conconexion".equals(classes.Conexion.importante)) {
                        if ("nuevo".equals(DatosPrincipales.getOpcionExamen())) {
                            atl.update_consujuegos();
                            ActiTiempoLibre.setColorCategoria("con");
                        }
                    }
                }
            } else if (consbebidas.isEnabled()) {

                consustan.ValidacionTipoExamen();
                consbebidas.setVisible(false);
                consbebidas.setEnabled(false);
                vinculos.setVisible(true);
                vinculos.setEnabled(true);
                DatoGeneral.fechaizquierda.setVisible(true);
                DatoGeneral.fechaderecha.setVisible(true);
                validarColor();
                jLabel9.setForeground(Color.red);

            } else if (consustan.isEnabled()) {

                consustan.setVisible(false);
                consustan.setEnabled(false);
                vinculos.setVisible(true);
                vinculos.setEnabled(true);
                DatoGeneral.fechaizquierda.setVisible(true);
                DatoGeneral.fechaderecha.setVisible(true);
                validarColor();
                jLabel9.setForeground(Color.red);

            } else if (antece.isEnabled()) {

                antece.setVisible(false);
                antece.setEnabled(false);
                vinculos.setVisible(true);
                vinculos.setEnabled(true);
                DatoGeneral.fechaizquierda.setVisible(true);
                DatoGeneral.fechaderecha.setVisible(true);
                validarColor();
                jLabel9.setForeground(Color.red);

            } else if (vinculos.isEnabled()) {
                JOptionPane.showMessageDialog(null, "¡Ya se encuentra en uso!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);

            } else if (temain.isEnabled()) {

                temain.setVisible(false);
                temain.setEnabled(false);
                vinculos.setVisible(true);
                vinculos.setEnabled(true);
                DatoGeneral.fechaizquierda.setVisible(true);
                DatoGeneral.fechaderecha.setVisible(true);
                validarColor();
                jLabel9.setForeground(Color.red);

            }
        }
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        //pre empleooooooooooooooooooooo
        if (DatosPersonales.getValidacionRegistro().equals("noregistrado")) {
            JOptionPane.showMessageDialog(null, "¡Debe guardar los datos básicos primero!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
        } else if (!EstadoSalud.getVisibilidadflecha().equals("esvisible")) {
            JOptionPane.showMessageDialog(null, "¡No apto en estado de salud!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
        } else {
            if (DatosPrincipales.getTipoExamen().equals("Pre-empleo")) {
                if (daper.isEnabled()) {
                    Date fechavacia = DatoPersonal.fechanaci.getDate();
                    int age = Integer.parseInt(DatosPersonales.getEdad());
                    if (DatosPersonales.getEstrato().equals("-")) {
                        JOptionPane.showMessageDialog(null, "¡Seleccione el estrato del examinado!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else if (age < 17 || age > 70) {
                        JOptionPane.showMessageDialog(null, "¡La edad no se admite!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else if (DatoPersonal.cbxtipoiden.getSelectedItem().equals("Seleccione") || fechavacia == null || (DatoPersonal.txtnombre.getText().equals("") || "".equals(DatoPersonal.txtnombre.getText())) || (DatoPersonal.txtnoiden.getText().equals("") || "".equals(DatoPersonal.txtnoiden.getText())) || (DatoPersonal.txtexpedidos.getText().equals("") || "".equals(DatoPersonal.txtexpedidos.getText())) || (DatoPersonal.txtlugarnaci.getText().equals("") || "".equals(DatoPersonal.txtlugarnaci.getText())) || (DatoPersonal.txtdireccion.getText().equals("") || "".equals(DatoPersonal.txtdireccion.getText())) || (DatoPersonal.txtcargoaspira.getText().equals("") || "".equals(DatoPersonal.txtcargoaspira.getText())) || (DatoPersonal.txtareaaspira.getText().equals("") || "".equals(DatoPersonal.txtareaaspira.getText())) || (DatoPersonal.txtpersonasolicitante.getText().equals("") || "".equals(DatoPersonal.txtpersonasolicitante.getText())) || (DatoPersonal.txtcargosolicitante.getText().equals("") || "".equals(DatoPersonal.txtcargosolicitante.getText()))) {
                        JOptionPane.showMessageDialog(null, "¡Debe completar todos los parámetros para registrar los datos!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else if (DatosPersonales.getGenero().equals("-") || DatosPersonales.getGenero().equals("") || DatosPersonales.getGenero() == null) {
                        JOptionPane.showMessageDialog(null, "¡El género no ha sido seleccionado!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else {

                        nombreExamen();
                        nombreExamen.setText("Nombre examen: " + TecnicaYPreguntas.getNombreExamen());
                        DatosPersonales.setColorCategoria("con");
                        daper.setVisible(false);
                        daper.setEnabled(false);
                        falsifi.ValidacionTipoExamen();
                        falsifi.setVisible(true);
                        falsifi.setEnabled(true);
                        DatoGeneral.fechaizquierda.setVisible(true);
                        DatoGeneral.fechaderecha.setVisible(true);
                        validarColor();
                        jLabel11.setForeground(Color.red);

                        if ("Sinconexion".equals(classes.Conexion.importante)) {
                            btnsave.setVisible(true);
                            DatosPersonales.setValidacionRegistro("registrado");
                        } else if ("Conconexion".equals(classes.Conexion.importante)) {
                            if ("nuevo".equals(DatosPrincipales.getOpcionExamen())) {
                                dp.update_datosper();
                                DatosPersonales.setValidacionRegistro("registrado");

                            }
                        }
                    }
                } else if (estsalud.isEnabled()) {

                    if (EstadoSalud.getEstado_salud().equals("-") || EstadoSalud.getEstado_salud().equals("")) {
                        JOptionPane.showMessageDialog(null, "¡Debe elegir el estado de salud para continuar!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else if (EstadoSalud.getProb_salud().equals("-") || EstadoSalud.getProb_salud().equals("")) {
                        JOptionPane.showMessageDialog(null, "¡Debe completar todos los parámetros para continuar con el examen!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else {
                        EstadoSalud.setColorCategoria("con");
                        estsalud.setVisible(false);
                        estsalud.setEnabled(false);
                        falsifi.ValidacionTipoExamen();
                        falsifi.setVisible(true);
                        falsifi.setEnabled(true);
                        DatoGeneral.fechaizquierda.setVisible(true);
                        DatoGeneral.fechaderecha.setVisible(true);
                        validarColor();
                        jLabel11.setForeground(Color.red);
                        if ("Sinconexion".equals(classes.Conexion.importante)) {

                        } else if ("Conconexion".equals(classes.Conexion.importante)) {
                            if ("nuevo".equals(DatosPrincipales.getOpcionExamen())) {
                                es.update_estadosalud();
                                es.validarestadosalud();

                            }
                        }
                    }

                } else if (inforfami.isEnabled()) {

                    inforfami.setVisible(false);
                    inforfami.setEnabled(false);
                    falsifi.ValidacionTipoExamen();
                    falsifi.setVisible(true);
                    falsifi.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel11.setForeground(Color.red);

                } else if (infoaca.isEnabled()) {

                    infoaca.setVisible(false);
                    infoaca.setEnabled(false);
                    falsifi.ValidacionTipoExamen();
                    falsifi.setVisible(true);
                    falsifi.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel11.setForeground(Color.red);

                } else if (infofinan.isEnabled()) {

                    infofinan.setVisible(false);
                    infofinan.setEnabled(false);
                    falsifi.ValidacionTipoExamen();
                    falsifi.setVisible(true);
                    falsifi.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel11.setForeground(Color.red);

                } else if (casino.isEnabled()) {

                    casino.setVisible(false);
                    casino.setEnabled(false);
                    falsifi.ValidacionTipoExamen();
                    falsifi.setVisible(true);
                    falsifi.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel11.setForeground(Color.red);

                } else if (consbebidas.isEnabled()) {

                    consustan.ValidacionTipoExamen();
                    consbebidas.setVisible(false);
                    consbebidas.setEnabled(false);
                    falsifi.ValidacionTipoExamen();
                    falsifi.setVisible(true);
                    falsifi.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel11.setForeground(Color.red);

                } else if (consustan.isEnabled()) {

                    consustan.setVisible(false);
                    consustan.setEnabled(false);
                    falsifi.ValidacionTipoExamen();
                    falsifi.setVisible(true);
                    falsifi.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel11.setForeground(Color.red);

                } else if (antece.isEnabled()) {

                    antece.setVisible(false);
                    antece.setEnabled(false);
                    falsifi.ValidacionTipoExamen();
                    falsifi.setVisible(true);
                    falsifi.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel11.setForeground(Color.red);

                } else if (vinculos.isEnabled()) {

                    vinculos.setVisible(false);
                    vinculos.setEnabled(false);
                    falsifi.ValidacionTipoExamen();
                    falsifi.setVisible(true);
                    falsifi.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel11.setForeground(Color.red);

                } else if (falsifi.isEnabled()) {
                    JOptionPane.showMessageDialog(null, "¡Ya se encuentra en uso!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);

                } else if (histlabo.isEnabled()) {

                    histlabo.setEnabled(false);
                    falsifi.ValidacionTipoExamen();
                    falsifi.setVisible(true);
                    falsifi.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel11.setForeground(Color.red);

                } else if (planinfil.isEnabled()) {

                    planinfil.setVisible(false);
                    planinfil.setEnabled(false);
                    falsifi.ValidacionTipoExamen();
                    falsifi.setVisible(true);
                    falsifi.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel11.setForeground(Color.red);

                }
            } else //Rutina operacioneeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeees
            if (DatosPrincipales.getTipoExamen().equals("Rutina (operaciones)")) {
                if (daper.isEnabled()) {
                    Date fechavacia = DatoPersonal.fechanaci.getDate();
                    int age = Integer.parseInt(DatosPersonales.getEdad());
                    if (DatosPersonales.getEstrato().equals("-")) {
                        JOptionPane.showMessageDialog(null, "¡Seleccione el estrato del examinado!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else if (age < 17 || age > 70) {
                        JOptionPane.showMessageDialog(null, "¡La edad no se admite!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else if (DatosPersonales.getGenero().equals("-")) {
                        JOptionPane.showMessageDialog(null, "¡El género no ha sido seleccionado!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else if (DatosPrincipales.getMotivoExamen().equals("Procedimiento") && (DatoPersonal.cbxtipoiden.getSelectedItem().equals("Seleccione") || fechavacia == null || DatoPersonal.txtnombre.getText().equals("") || DatoPersonal.txtnoiden.getText().equals("") || DatoPersonal.txtexpedidos.getText().equals("") || DatoPersonal.txtlugarnaci.getText().equals("") || DatoPersonal.txtdireccion.getText().equals("") || DatoPersonal.txtcargoactual.getText().equals("") || DatoPersonal.txtareaactual.getText().equals("") || DatoPersonal.txtpersonasolicitante.getText().equals("") || DatoPersonal.txtcargosolicitante.getText().equals(""))) {

                        JOptionPane.showMessageDialog(null, "¡Debe completar todos los parámetros para registrar los datos!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);

                    } else if (DatosPrincipales.getMotivoExamen().equals("Ascenso") && (DatoPersonal.cbxtipoiden.getSelectedItem().equals("Seleccione") || fechavacia == null || (DatoPersonal.txtnombre.getText().equals("") || "".equals(DatoPersonal.txtnombre.getText())) || (DatoPersonal.txtnoiden.getText().equals("") || "".equals(DatoPersonal.txtnoiden.getText())) || (DatoPersonal.txtexpedidos.getText().equals("") || "".equals(DatoPersonal.txtexpedidos.getText())) || (DatoPersonal.txtlugarnaci.getText().equals("") || "".equals(DatoPersonal.txtlugarnaci.getText())) || (DatoPersonal.txtdireccion.getText().equals("") || "".equals(DatoPersonal.txtdireccion.getText())) || (DatoPersonal.txtcargoaspira.getText().equals("") || "".equals(DatoPersonal.txtcargoaspira.getText())) || (DatoPersonal.txtareaaspira.getText().equals("") || "".equals(DatoPersonal.txtareaaspira.getText())) || (DatoPersonal.txtcargoactual.getText().equals("") || "".equals(DatoPersonal.txtcargoactual.getText())) || (DatoPersonal.txtareaactual.getText().equals("") || "".equals(DatoPersonal.txtareaactual.getText())) || (DatoPersonal.txtpersonasolicitante.getText().equals("") || "".equals(DatoPersonal.txtpersonasolicitante.getText())) || (DatoPersonal.txtcargosolicitante.getText().equals("") || "".equals(DatoPersonal.txtcargosolicitante.getText())))) {

                        JOptionPane.showMessageDialog(null, "¡Debe completar todos los parámetros para registrar los datos!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);

                    } else {

                        nombreExamen();
                        nombreExamen.setText("Nombre examen: " + TecnicaYPreguntas.getNombreExamen());

                        daper.setVisible(false);
                        daper.setEnabled(false);
                        falsifi.ValidacionTipoExamen();
                        falsifi.setVisible(true);
                        falsifi.setEnabled(true);
                        DatoGeneral.fechaizquierda.setVisible(true);
                        DatoGeneral.fechaderecha.setVisible(true);
                        validarColor();
                        jLabel11.setForeground(Color.red);

                        if ("Sinconexion".equals(classes.Conexion.importante)) {
                            btnsave.setVisible(true);
                        } else if ("Conconexion".equals(classes.Conexion.importante)) {
                            if ("nuevo".equals(DatosPrincipales.getOpcionExamen())) {
                                dp.update_datosper();
                                DatosPersonales.setColorCategoria("con");
                                DatosPersonales.setValidacionRegistro("registrado");
                            }
                        }
                    }
                } else if (estsalud.isEnabled()) {

                    if (EstadoSalud.getEstado_salud().equals("-") || EstadoSalud.getEstado_salud().equals("")) {
                        JOptionPane.showMessageDialog(null, "¡Debe elegir el estado de salud para continuar!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else if (EstadoSalud.getProb_salud().equals("-") || EstadoSalud.getProb_salud().equals("")) {
                        JOptionPane.showMessageDialog(null, "¡Debe completar todos los parámetros para continuar con el examen!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else {
                        estsalud.setVisible(false);
                        estsalud.setEnabled(false);
                        falsifi.ValidacionTipoExamen();
                        falsifi.setVisible(true);
                        falsifi.setEnabled(true);
                        DatoGeneral.fechaizquierda.setVisible(true);
                        DatoGeneral.fechaderecha.setVisible(true);
                        validarColor();
                        jLabel11.setForeground(Color.red);

                        if ("Sinconexion".equals(classes.Conexion.importante)) {

                        } else if ("Conconexion".equals(classes.Conexion.importante)) {
                            if ("nuevo".equals(DatosPrincipales.getOpcionExamen())) {
                                es.update_estadosalud();
                                es.validarestadosalud();
                                EstadoSalud.setColorCategoria("con");
                            }
                        }
                    }

                } else if (inforfami.isEnabled()) {

                    inforfami.setVisible(false);
                    inforfami.setEnabled(false);
                    falsifi.ValidacionTipoExamen();
                    falsifi.setVisible(true);
                    falsifi.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel11.setForeground(Color.red);

                } else if (infoaca.isEnabled()) {

                    infoaca.setVisible(false);
                    infoaca.setEnabled(false);
                    falsifi.ValidacionTipoExamen();
                    falsifi.setVisible(true);
                    falsifi.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel11.setForeground(Color.red);

                } else if (infofinan.isEnabled()) {

                    infofinan.setVisible(false);
                    infofinan.setEnabled(false);
                    falsifi.ValidacionTipoExamen();
                    falsifi.setVisible(true);
                    falsifi.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel11.setForeground(Color.red);

                } else if (casino.isEnabled()) {

                    casino.setVisible(false);
                    casino.setEnabled(false);
                    falsifi.ValidacionTipoExamen();
                    falsifi.setVisible(true);
                    falsifi.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel11.setForeground(Color.red);

                } else if (consbebidas.isEnabled()) {

                    consustan.ValidacionTipoExamen();
                    consbebidas.setVisible(false);
                    consbebidas.setEnabled(false);
                    falsifi.ValidacionTipoExamen();
                    falsifi.setVisible(true);
                    falsifi.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel11.setForeground(Color.red);

                } else if (consustan.isEnabled()) {

                    consustan.setVisible(false);
                    consustan.setEnabled(false);
                    falsifi.ValidacionTipoExamen();
                    falsifi.setVisible(true);
                    falsifi.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel11.setForeground(Color.red);

                } else if (antece.isEnabled()) {

                    antece.setVisible(false);
                    antece.setEnabled(false);
                    falsifi.ValidacionTipoExamen();
                    falsifi.setVisible(true);
                    falsifi.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel11.setForeground(Color.red);

                } else if (vinculos.isEnabled()) {

                    vinculos.setVisible(false);
                    vinculos.setEnabled(false);
                    falsifi.ValidacionTipoExamen();
                    falsifi.setVisible(true);
                    falsifi.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel11.setForeground(Color.red);

                } else if (falsifi.isEnabled()) {

                    JOptionPane.showMessageDialog(null, "¡Ya se encuentra en uso!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);

                }
            } else //Rutina administrativooooooooooooooooooooooooooooooooooooooooooooooos
            if (DatosPrincipales.getTipoExamen().equals("Rutina (admitivos)")) {

                if (daper.isEnabled()) {
                    Date fechavacia = DatoPersonal.fechanaci.getDate();
                    int age = Integer.parseInt(DatosPersonales.getEdad());
                    if (DatosPersonales.getEstrato().equals("-")) {
                        JOptionPane.showMessageDialog(null, "¡Seleccione el estrato del examinado!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else if (age < 17 || age > 70) {
                        JOptionPane.showMessageDialog(null, "¡La edad no se admite!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else if (DatosPersonales.getGenero().equals("-")) {
                        JOptionPane.showMessageDialog(null, "¡El género no ha sido seleccionado!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else {
                        if (DatosPrincipales.getMotivoExamen().equals("Procedimiento")) {
                            if (DatoPersonal.cbxtipoiden.getSelectedItem().equals("Seleccione") || fechavacia == null || DatoPersonal.txtnombre.getText().equals("") || DatoPersonal.txtnoiden.getText().equals("") || DatoPersonal.txtexpedidos.getText().equals("") || DatoPersonal.txtlugarnaci.getText().equals("") || DatoPersonal.txtdireccion.getText().equals("") || DatoPersonal.txtcargoactual.getText().equals("") || DatoPersonal.txtareaactual.getText().equals("") || DatoPersonal.txtpersonasolicitante.getText().equals("") || DatoPersonal.txtcargosolicitante.getText().equals("")) {
                                JOptionPane.showMessageDialog(null, "¡Debe completar todos los parámetros para registrar los datos!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                            }
                        } else if (DatosPrincipales.getMotivoExamen().equals("Ascenso")) {
                            if (DatoPersonal.cbxtipoiden.getSelectedItem().equals("Seleccione") || fechavacia == null || (DatoPersonal.txtnombre.getText().equals("") || "".equals(DatoPersonal.txtnombre.getText())) || (DatoPersonal.txtnoiden.getText().equals("") || "".equals(DatoPersonal.txtnoiden.getText())) || (DatoPersonal.txtexpedidos.getText().equals("") || "".equals(DatoPersonal.txtexpedidos.getText())) || (DatoPersonal.txtlugarnaci.getText().equals("") || "".equals(DatoPersonal.txtlugarnaci.getText())) || (DatoPersonal.txtdireccion.getText().equals("") || "".equals(DatoPersonal.txtdireccion.getText())) || (DatoPersonal.txtcargoaspira.getText().equals("") || "".equals(DatoPersonal.txtcargoaspira.getText())) || (DatoPersonal.txtareaaspira.getText().equals("") || "".equals(DatoPersonal.txtareaaspira.getText())) || (DatoPersonal.txtcargoactual.getText().equals("") || "".equals(DatoPersonal.txtcargoactual.getText())) || (DatoPersonal.txtareaactual.getText().equals("") || "".equals(DatoPersonal.txtareaactual.getText())) || (DatoPersonal.txtpersonasolicitante.getText().equals("") || "".equals(DatoPersonal.txtpersonasolicitante.getText())) || (DatoPersonal.txtcargosolicitante.getText().equals("") || "".equals(DatoPersonal.txtcargosolicitante.getText()))) {
                                JOptionPane.showMessageDialog(null, "¡Debe completar todos los parámetros para registrar los datos!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                            }
                        }
                        nombreExamen();
                        nombreExamen.setText("Nombre examen: " + TecnicaYPreguntas.getNombreExamen());
                        daper.setVisible(false);
                        daper.setEnabled(false);
                        falsifi.ValidacionTipoExamen();
                        falsifi.setVisible(true);
                        falsifi.setEnabled(true);
                        DatoGeneral.fechaizquierda.setVisible(true);
                        DatoGeneral.fechaderecha.setVisible(true);
                        validarColor();
                        jLabel11.setForeground(Color.red);

                        if ("Sinconexion".equals(classes.Conexion.importante)) {
                            btnsave.setVisible(true);
                        } else if ("Conconexion".equals(classes.Conexion.importante)) {
                            if ("nuevo".equals(DatosPrincipales.getOpcionExamen())) {
                                dp.update_datosper();
                                DatosPersonales.setColorCategoria("con");
                                DatosPersonales.setValidacionRegistro("registrado");
                            }
                        }
                    }
                } else if (estsalud.isEnabled()) {

                    if (EstadoSalud.getEstado_salud().equals("-") || EstadoSalud.getEstado_salud().equals("")) {
                        JOptionPane.showMessageDialog(null, "¡Debe elegir el estado de salud para continuar!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else if (EstadoSalud.getProb_salud().equals("-") || EstadoSalud.getProb_salud().equals("")) {
                        JOptionPane.showMessageDialog(null, "¡Debe completar todos los parámetros para continuar con el examen!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else {
                        estsalud.setVisible(false);
                        estsalud.setEnabled(false);
                        falsifi.ValidacionTipoExamen();
                        falsifi.setVisible(true);
                        falsifi.setEnabled(true);
                        DatoGeneral.fechaizquierda.setVisible(true);
                        DatoGeneral.fechaderecha.setVisible(true);
                        validarColor();
                        jLabel11.setForeground(Color.red);

                        if ("Sinconexion".equals(classes.Conexion.importante)) {

                        } else if ("Conconexion".equals(classes.Conexion.importante)) {
                            if ("nuevo".equals(DatosPrincipales.getOpcionExamen())) {
                                es.update_estadosalud();
                                es.validarestadosalud();
                                EstadoSalud.setColorCategoria("con");
                            }
                        }
                    }

                } else if (inforfami.isEnabled()) {

                    inforfami.setVisible(false);
                    inforfami.setEnabled(false);
                    falsifi.ValidacionTipoExamen();
                    falsifi.setVisible(true);
                    falsifi.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel11.setForeground(Color.red);

                } else if (infoaca.isEnabled()) {

                    infoaca.setVisible(false);
                    infoaca.setEnabled(false);
                    falsifi.ValidacionTipoExamen();
                    falsifi.setVisible(true);
                    falsifi.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel11.setForeground(Color.red);

                } else if (infofinan.isEnabled()) {

                    infofinan.setVisible(false);
                    infofinan.setEnabled(false);
                    falsifi.ValidacionTipoExamen();
                    falsifi.setVisible(true);
                    falsifi.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel11.setForeground(Color.red);

                } else if (casino.isEnabled()) {

                    casino.setVisible(false);
                    casino.setEnabled(false);
                    falsifi.ValidacionTipoExamen();
                    falsifi.setVisible(true);
                    falsifi.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel11.setForeground(Color.red);

                } else if (consbebidas.isEnabled()) {

                    consustan.ValidacionTipoExamen();
                    consbebidas.setVisible(false);
                    consbebidas.setEnabled(false);
                    falsifi.ValidacionTipoExamen();
                    falsifi.setVisible(true);
                    falsifi.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel11.setForeground(Color.red);
                    if ("Sinconexion".equals(classes.Conexion.importante)) {

                    } else if (consustan.isEnabled()) {

                        consustan.setVisible(false);
                        consustan.setEnabled(false);
                        falsifi.ValidacionTipoExamen();
                        falsifi.setVisible(true);
                        falsifi.setEnabled(true);
                        DatoGeneral.fechaizquierda.setVisible(true);
                        DatoGeneral.fechaderecha.setVisible(true);
                        validarColor();
                        jLabel11.setForeground(Color.red);

                    } else if (antece.isEnabled()) {

                        antece.setVisible(false);
                        antece.setEnabled(false);
                        falsifi.ValidacionTipoExamen();
                        falsifi.setVisible(true);
                        falsifi.setEnabled(true);
                        DatoGeneral.fechaizquierda.setVisible(true);
                        DatoGeneral.fechaderecha.setVisible(true);
                        validarColor();
                        jLabel11.setForeground(Color.red);

                    } else if (vinculos.isEnabled()) {

                        vinculos.setVisible(false);
                        vinculos.setEnabled(false);
                        falsifi.ValidacionTipoExamen();
                        falsifi.setVisible(true);
                        falsifi.setEnabled(true);
                        DatoGeneral.fechaizquierda.setVisible(true);
                        DatoGeneral.fechaderecha.setVisible(true);
                        validarColor();
                        jLabel11.setForeground(Color.red);

                    } else if (falsifi.isEnabled()) {

                        JOptionPane.showMessageDialog(null, "¡Ya se encuentra en uso!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);

                    } else if (histlabo.isEnabled()) {

                        histlabo.setVisible(false);
                        histlabo.setEnabled(false);
                        falsifi.ValidacionTipoExamen();
                        falsifi.setVisible(true);
                        falsifi.setEnabled(true);
                        DatoGeneral.fechaizquierda.setVisible(true);
                        DatoGeneral.fechaderecha.setVisible(true);
                        validarColor();
                        jLabel11.setForeground(Color.red);

                    } else if (planinfil.isEnabled()) {

                        planinfil.setVisible(false);
                        planinfil.setEnabled(false);
                        falsifi.ValidacionTipoExamen();
                        falsifi.setVisible(true);
                        falsifi.setEnabled(true);
                        DatoGeneral.fechaizquierda.setVisible(true);
                        DatoGeneral.fechaderecha.setVisible(true);
                        validarColor();
                        jLabel11.setForeground(Color.red);

                    }

                } else //Especificooooooooooooooooooooooooooooooooooooooooooo
                if (DatosPrincipales.getTipoExamen().equals("Específico")) {
                    if (daper.isEnabled()) {
                        Date fechavacia = DatoPersonal.fechanaci.getDate();
                        int age = Integer.parseInt(DatosPersonales.getEdad());
                        if (DatosPersonales.getEstrato().equals("-")) {
                            JOptionPane.showMessageDialog(null, "¡Seleccione el estrato del examinado!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                        } else if (age < 17 || age > 70) {
                            JOptionPane.showMessageDialog(null, "¡La edad no se admite!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                        } else if (DatoPersonal.cbxtipoiden.getSelectedItem().equals("Seleccione") || fechavacia == null || (DatoPersonal.txtnombre.getText().equals("") || "".equals(DatoPersonal.txtnombre.getText())) || (DatoPersonal.txtnoiden.getText().equals("") || "".equals(DatoPersonal.txtnoiden.getText())) || (DatoPersonal.txtexpedidos.getText().equals("") || "".equals(DatoPersonal.txtexpedidos.getText())) || (DatoPersonal.txtlugarnaci.getText().equals("") || "".equals(DatoPersonal.txtlugarnaci.getText())) || (DatoPersonal.txtdireccion.getText().equals("") || "".equals(DatoPersonal.txtdireccion.getText())) || (DatoPersonal.txtpersonasolicitante.getText().equals("") || "".equals(DatoPersonal.txtpersonasolicitante.getText())) || (DatoPersonal.txtcargosolicitante.getText().equals("") || "".equals(DatoPersonal.txtcargosolicitante.getText())) || (DatoPersonal.txtareaactual.getText().equals("") || "".equals(DatoPersonal.txtareaactual.getText())) || (DatoPersonal.txtcargoactual.getText().equals("") || "".equals(DatoPersonal.txtcargoactual.getText()))) {
                            JOptionPane.showMessageDialog(null, "¡Debe completar todos los parámetros para registrar los datos!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                        } else if (DatosPersonales.getGenero().equals("-") || DatosPersonales.getGenero().equals("") || DatosPersonales.getGenero() == null) {
                            JOptionPane.showMessageDialog(null, "¡El género no ha sido seleccionado!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                        } else {

                            nombreExamen();
                            nombreExamen.setText("Nombre examen: " + TecnicaYPreguntas.getNombreExamen());
                            daper.setVisible(false);
                            daper.setEnabled(false);
                            falsifi.ValidacionTipoExamen();
                            falsifi.setVisible(true);
                            falsifi.setEnabled(true);
                            DatoGeneral.fechaizquierda.setVisible(true);
                            DatoGeneral.fechaderecha.setVisible(true);
                            validarColor();
                            jLabel11.setForeground(Color.red);

                            if ("Sinconexion".equals(classes.Conexion.importante)) {
                                btnsave.setVisible(true);
                            } else if ("Conconexion".equals(classes.Conexion.importante)) {
                                if ("nuevo".equals(DatosPrincipales.getOpcionExamen())) {
                                    dp.update_datosper();
                                    DatosPersonales.setColorCategoria("con");
                                    DatosPersonales.setValidacionRegistro("registrado");
                                }
                            }
                        }
                    } else if (estsalud.isEnabled()) {

                        if (EstadoSalud.getEstado_salud().equals("-") || EstadoSalud.getEstado_salud().equals("")) {
                            JOptionPane.showMessageDialog(null, "¡Debe elegir el estado de salud para continuar!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                        } else if (EstadoSalud.getProb_salud().equals("-") || EstadoSalud.getProb_salud().equals("")) {
                            JOptionPane.showMessageDialog(null, "¡Debe completar todos los parámetros para continuar con el examen!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                        } else {
                            estsalud.setVisible(false);
                            estsalud.setEnabled(false);
                            falsifi.ValidacionTipoExamen();
                            falsifi.setVisible(true);
                            falsifi.setEnabled(true);
                            DatoGeneral.fechaizquierda.setVisible(true);
                            DatoGeneral.fechaderecha.setVisible(true);
                            validarColor();
                            jLabel11.setForeground(Color.red);

                            if ("Sinconexion".equals(classes.Conexion.importante)) {

                            } else if ("Conconexion".equals(classes.Conexion.importante)) {
                                if ("nuevo".equals(DatosPrincipales.getOpcionExamen())) {
                                    es.update_estadosalud();
                                    es.validarestadosalud();
                                    EstadoSalud.setColorCategoria("con");
                                }
                            }
                        }

                    } else if (inforfami.isEnabled()) {

                        inforfami.setVisible(false);
                        inforfami.setEnabled(false);
                        falsifi.ValidacionTipoExamen();
                        falsifi.setVisible(true);
                        falsifi.setEnabled(true);
                        DatoGeneral.fechaizquierda.setVisible(true);
                        DatoGeneral.fechaderecha.setVisible(true);
                        validarColor();
                        jLabel11.setForeground(Color.red);

                    }
                } else if (infoaca.isEnabled()) {

                    infoaca.setVisible(false);
                    infoaca.setEnabled(false);
                    falsifi.ValidacionTipoExamen();
                    falsifi.setVisible(true);
                    falsifi.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel11.setForeground(Color.red);

                } else if (infofinan.isEnabled()) {

                    infofinan.setVisible(false);
                    infofinan.setEnabled(false);
                    falsifi.ValidacionTipoExamen();
                    falsifi.setVisible(true);
                    falsifi.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel11.setForeground(Color.red);

                } else if (consbebidas.isEnabled()) {

                    consustan.ValidacionTipoExamen();
                    consbebidas.setVisible(false);
                    consbebidas.setEnabled(false);
                    falsifi.ValidacionTipoExamen();
                    falsifi.setVisible(true);
                    falsifi.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel11.setForeground(Color.red);

                } else if (consustan.isEnabled()) {

                    consustan.setVisible(false);
                    consustan.setEnabled(false);
                    falsifi.ValidacionTipoExamen();
                    falsifi.setVisible(true);
                    falsifi.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel11.setForeground(Color.red);

                } else if (antece.isEnabled()) {

                    antece.setVisible(false);
                    antece.setEnabled(false);
                    falsifi.ValidacionTipoExamen();
                    falsifi.setVisible(true);
                    falsifi.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel11.setForeground(Color.red);

                } else if (vinculos.isEnabled()) {

                    vinculos.setVisible(false);
                    vinculos.setEnabled(false);
                    falsifi.ValidacionTipoExamen();
                    falsifi.setVisible(true);
                    falsifi.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel11.setForeground(Color.red);

                } else if (temain.isEnabled()) {

                    temain.setVisible(false);
                    temain.setEnabled(false);
                    falsifi.ValidacionTipoExamen();
                    falsifi.setVisible(true);
                    falsifi.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel11.setForeground(Color.red);

                }
            }
        }
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        //pre empleooooooooooooooooooooo
        if (DatosPersonales.getValidacionRegistro().equals("noregistrado")) {
            JOptionPane.showMessageDialog(null, "¡Debe guardar los datos básicos primero!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
        } else if (!EstadoSalud.getVisibilidadflecha().equals("esvisible")) {
            JOptionPane.showMessageDialog(null, "¡No apto en estado de salud!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
        } else {
            if (DatosPrincipales.getTipoExamen().equals("Pre-empleo")) {
                if (daper.isEnabled()) {
                    Date fechavacia = DatoPersonal.fechanaci.getDate();
                    int age = Integer.parseInt(DatosPersonales.getEdad());
                    if (DatosPersonales.getEstrato().equals("-")) {
                        JOptionPane.showMessageDialog(null, "¡Seleccione el estrato del examinado!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else if (age < 17 || age > 70) {
                        JOptionPane.showMessageDialog(null, "¡La edad no se admite!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else if (DatoPersonal.cbxtipoiden.getSelectedItem().equals("Seleccione") || fechavacia == null || (DatoPersonal.txtnombre.getText().equals("") || "".equals(DatoPersonal.txtnombre.getText())) || (DatoPersonal.txtnoiden.getText().equals("") || "".equals(DatoPersonal.txtnoiden.getText())) || (DatoPersonal.txtexpedidos.getText().equals("") || "".equals(DatoPersonal.txtexpedidos.getText())) || (DatoPersonal.txtlugarnaci.getText().equals("") || "".equals(DatoPersonal.txtlugarnaci.getText())) || (DatoPersonal.txtdireccion.getText().equals("") || "".equals(DatoPersonal.txtdireccion.getText())) || (DatoPersonal.txtcargoaspira.getText().equals("") || "".equals(DatoPersonal.txtcargoaspira.getText())) || (DatoPersonal.txtareaaspira.getText().equals("") || "".equals(DatoPersonal.txtareaaspira.getText())) || (DatoPersonal.txtpersonasolicitante.getText().equals("") || "".equals(DatoPersonal.txtpersonasolicitante.getText())) || (DatoPersonal.txtcargosolicitante.getText().equals("") || "".equals(DatoPersonal.txtcargosolicitante.getText()))) {
                        JOptionPane.showMessageDialog(null, "¡Debe completar todos los parámetros para registrar los datos!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else if (DatosPersonales.getGenero().equals("-") || DatosPersonales.getGenero().equals("") || DatosPersonales.getGenero() == null) {
                        JOptionPane.showMessageDialog(null, "¡El género no ha sido seleccionado!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else {

                        nombreExamen();
                        nombreExamen.setText("Nombre examen: " + TecnicaYPreguntas.getNombreExamen());
                        DatosPersonales.setColorCategoria("con");
                        daper.setVisible(false);
                        daper.setEnabled(false);
                        histlabo.ValidacionTipoExamen();
                        histlabo.setVisible(true);
                        histlabo.setEnabled(true);
                        DatoGeneral.fechaizquierda.setVisible(true);
                        DatoGeneral.fechaderecha.setVisible(true);
                        validarColor();
                        jLabel12.setForeground(Color.red);

                        if ("Sinconexion".equals(classes.Conexion.importante)) {
                            btnsave.setVisible(true);
                            DatosPersonales.setValidacionRegistro("registrado");
                        } else if ("Conconexion".equals(classes.Conexion.importante)) {
                            if ("nuevo".equals(DatosPrincipales.getOpcionExamen())) {
                                dp.update_datosper();
                                DatosPersonales.setValidacionRegistro("registrado");

                            }
                        }
                    }
                } else if (estsalud.isEnabled()) {

                    if (EstadoSalud.getEstado_salud().equals("-") || EstadoSalud.getEstado_salud().equals("")) {
                        JOptionPane.showMessageDialog(null, "¡Debe elegir el estado de salud para continuar!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else if (EstadoSalud.getProb_salud().equals("-") || EstadoSalud.getProb_salud().equals("")) {
                        JOptionPane.showMessageDialog(null, "¡Debe completar todos los parámetros para continuar con el examen!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else {
                        EstadoSalud.setColorCategoria("con");
                        estsalud.setVisible(false);
                        estsalud.setEnabled(false);
                        histlabo.ValidacionTipoExamen();
                        histlabo.setVisible(true);
                        histlabo.setEnabled(true);
                        DatoGeneral.fechaizquierda.setVisible(true);
                        DatoGeneral.fechaderecha.setVisible(true);
                        validarColor();
                        jLabel12.setForeground(Color.red);
                        if ("Sinconexion".equals(classes.Conexion.importante)) {

                        } else if ("Conconexion".equals(classes.Conexion.importante)) {
                            if ("nuevo".equals(DatosPrincipales.getOpcionExamen())) {
                                es.update_estadosalud();
                                es.validarestadosalud();

                            }
                        }
                    }

                } else if (inforfami.isEnabled()) {

                    inforfami.setVisible(false);
                    inforfami.setEnabled(false);
                    histlabo.ValidacionTipoExamen();
                    histlabo.setVisible(true);
                    histlabo.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel12.setForeground(Color.red);

                } else if (infoaca.isEnabled()) {

                    infoaca.setVisible(false);
                    infoaca.setEnabled(false);
                    histlabo.ValidacionTipoExamen();
                    histlabo.setVisible(true);
                    histlabo.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel12.setForeground(Color.red);

                } else if (infofinan.isEnabled()) {

                    infofinan.setVisible(false);
                    infofinan.setEnabled(false);
                    histlabo.ValidacionTipoExamen();
                    histlabo.setVisible(true);
                    histlabo.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel12.setForeground(Color.red);

                } else if (casino.isEnabled()) {

                    casino.setVisible(false);
                    casino.setEnabled(false);
                    histlabo.ValidacionTipoExamen();
                    histlabo.setVisible(true);
                    histlabo.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel12.setForeground(Color.red);

                } else if (consbebidas.isEnabled()) {

                    consustan.ValidacionTipoExamen();
                    consbebidas.setVisible(false);
                    consbebidas.setEnabled(false);
                    histlabo.ValidacionTipoExamen();
                    histlabo.setVisible(true);
                    histlabo.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel12.setForeground(Color.red);

                } else if (consustan.isEnabled()) {

                    consustan.setVisible(false);
                    consustan.setEnabled(false);
                    histlabo.ValidacionTipoExamen();
                    histlabo.setVisible(true);
                    histlabo.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel12.setForeground(Color.red);

                } else if (antece.isEnabled()) {

                    antece.setVisible(false);
                    antece.setEnabled(false);
                    histlabo.ValidacionTipoExamen();
                    histlabo.setVisible(true);
                    histlabo.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel12.setForeground(Color.red);

                } else if (vinculos.isEnabled()) {

                    vinculos.setVisible(false);
                    vinculos.setEnabled(false);
                    histlabo.ValidacionTipoExamen();
                    histlabo.setVisible(true);
                    histlabo.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel12.setForeground(Color.red);

                } else if (falsifi.isEnabled()) {

                    falsifi.setVisible(false);
                    falsifi.setEnabled(false);
                    histlabo.ValidacionTipoExamen();
                    histlabo.setVisible(true);
                    histlabo.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel12.setForeground(Color.red);

                } else if (histlabo.isEnabled()) {
                    JOptionPane.showMessageDialog(null, "¡Ya se encuentra en uso!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);

                } else if (planinfil.isEnabled()) {

                    planinfil.setVisible(false);
                    planinfil.setEnabled(false);
                    histlabo.ValidacionTipoExamen();
                    histlabo.setVisible(true);
                    histlabo.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel12.setForeground(Color.red);

                }
            } else //Rutina operacioneeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeees
            if (DatosPrincipales.getTipoExamen().equals("Rutina (operaciones)")) {
                if (daper.isEnabled()) {
                    Date fechavacia = DatoPersonal.fechanaci.getDate();
                    int age = Integer.parseInt(DatosPersonales.getEdad());
                    if (DatosPersonales.getEstrato().equals("-")) {
                        JOptionPane.showMessageDialog(null, "¡Seleccione el estrato del examinado!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else if (age < 17 || age > 70) {
                        JOptionPane.showMessageDialog(null, "¡La edad no se admite!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else if (DatosPersonales.getGenero().equals("-")) {
                        JOptionPane.showMessageDialog(null, "¡El género no ha sido seleccionado!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else if (DatosPrincipales.getMotivoExamen().equals("Procedimiento") && (DatoPersonal.cbxtipoiden.getSelectedItem().equals("Seleccione") || fechavacia == null || DatoPersonal.txtnombre.getText().equals("") || DatoPersonal.txtnoiden.getText().equals("") || DatoPersonal.txtexpedidos.getText().equals("") || DatoPersonal.txtlugarnaci.getText().equals("") || DatoPersonal.txtdireccion.getText().equals("") || DatoPersonal.txtcargoactual.getText().equals("") || DatoPersonal.txtareaactual.getText().equals("") || DatoPersonal.txtpersonasolicitante.getText().equals("") || DatoPersonal.txtcargosolicitante.getText().equals(""))) {

                        JOptionPane.showMessageDialog(null, "¡Debe completar todos los parámetros para registrar los datos!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);

                    } else if (DatosPrincipales.getMotivoExamen().equals("Ascenso") && (DatoPersonal.cbxtipoiden.getSelectedItem().equals("Seleccione") || fechavacia == null || (DatoPersonal.txtnombre.getText().equals("") || "".equals(DatoPersonal.txtnombre.getText())) || (DatoPersonal.txtnoiden.getText().equals("") || "".equals(DatoPersonal.txtnoiden.getText())) || (DatoPersonal.txtexpedidos.getText().equals("") || "".equals(DatoPersonal.txtexpedidos.getText())) || (DatoPersonal.txtlugarnaci.getText().equals("") || "".equals(DatoPersonal.txtlugarnaci.getText())) || (DatoPersonal.txtdireccion.getText().equals("") || "".equals(DatoPersonal.txtdireccion.getText())) || (DatoPersonal.txtcargoaspira.getText().equals("") || "".equals(DatoPersonal.txtcargoaspira.getText())) || (DatoPersonal.txtareaaspira.getText().equals("") || "".equals(DatoPersonal.txtareaaspira.getText())) || (DatoPersonal.txtcargoactual.getText().equals("") || "".equals(DatoPersonal.txtcargoactual.getText())) || (DatoPersonal.txtareaactual.getText().equals("") || "".equals(DatoPersonal.txtareaactual.getText())) || (DatoPersonal.txtpersonasolicitante.getText().equals("") || "".equals(DatoPersonal.txtpersonasolicitante.getText())) || (DatoPersonal.txtcargosolicitante.getText().equals("") || "".equals(DatoPersonal.txtcargosolicitante.getText())))) {

                        JOptionPane.showMessageDialog(null, "¡Debe completar todos los parámetros para registrar los datos!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);

                    } else {

                        nombreExamen();
                        nombreExamen.setText("Nombre examen: " + TecnicaYPreguntas.getNombreExamen());

                        daper.setVisible(false);
                        daper.setEnabled(false);
                        inforfami.setVisible(true);
                        inforfami.setEnabled(true);
                        DatoGeneral.fechaizquierda.setVisible(true);
                        DatoGeneral.fechaderecha.setVisible(true);
                        validarColor();
                        jLabel4.setForeground(Color.red);

                        DatoGeneral.fechaizquierda.setVisible(true);
                        if ("noesvisible".equals(EstadoSalud.getVisibilidadflecha())) {
                            DatoGeneral.fechaderecha.setVisible(false);
                        } else if ("esvisible".equals(EstadoSalud.getVisibilidadflecha())) {
                            DatoGeneral.fechaderecha.setVisible(true);
                        }

                        if ("Sinconexion".equals(classes.Conexion.importante)) {
                            btnsave.setVisible(true);
                        } else if ("Conconexion".equals(classes.Conexion.importante)) {
                            if ("nuevo".equals(DatosPrincipales.getOpcionExamen())) {
                                dp.update_datosper();
                                DatosPersonales.setColorCategoria("con");
                                DatosPersonales.setValidacionRegistro("registrado");
                            }
                        }
                    }
                } else if (estsalud.isEnabled()) {

                    if (EstadoSalud.getEstado_salud().equals("-") || EstadoSalud.getEstado_salud().equals("")) {
                        JOptionPane.showMessageDialog(null, "¡Debe elegir el estado de salud para continuar!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else if (EstadoSalud.getProb_salud().equals("-") || EstadoSalud.getProb_salud().equals("")) {
                        JOptionPane.showMessageDialog(null, "¡Debe completar todos los parámetros para continuar con el examen!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else {
                        estsalud.setVisible(false);
                        estsalud.setEnabled(false);
                        inforfami.setVisible(true);
                        inforfami.setEnabled(true);
                        DatoGeneral.fechaizquierda.setVisible(true);
                        DatoGeneral.fechaderecha.setVisible(true);
                        validarColor();
                        jLabel4.setForeground(Color.red);

                        if ("Sinconexion".equals(classes.Conexion.importante)) {

                        } else if ("Conconexion".equals(classes.Conexion.importante)) {
                            if ("nuevo".equals(DatosPrincipales.getOpcionExamen())) {
                                es.update_estadosalud();
                                es.validarestadosalud();
                                EstadoSalud.setColorCategoria("con");
                            }
                        }
                    }

                } else if (inforfami.isEnabled()) {

                    inforfami.setVisible(false);
                    inforfami.setEnabled(false);
                    daper.setVisible(true);
                    daper.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(false);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel2.setForeground(Color.red);

                } else if (infoaca.isEnabled()) {
                    if (InfoAcademica.getEstaestudiando().equals("-")) {
                        JOptionPane.showMessageDialog(null, "¡Debe completar todos los parámetros para continuar con el examen!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else {
                        infoaca.setVisible(false);
                        infoaca.setEnabled(false);
                        inforfami.setVisible(true);
                        inforfami.setEnabled(true);
                        DatoGeneral.fechaizquierda.setVisible(true);
                        DatoGeneral.fechaderecha.setVisible(true);
                        validarColor();
                        jLabel4.setForeground(Color.red);
                    }
                } else if (infofinan.isEnabled()) {

                    infofinan.setVisible(false);
                    infofinan.setEnabled(false);
                    inforfami.setVisible(true);
                    inforfami.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel4.setForeground(Color.red);

                } else if (casino.isEnabled()) {

                    casino.setVisible(false);
                    casino.setEnabled(false);
                    inforfami.setVisible(true);
                    inforfami.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel4.setForeground(Color.red);

                } else if (consbebidas.isEnabled()) {

                    consustan.ValidacionTipoExamen();
                    consbebidas.setVisible(false);
                    consbebidas.setEnabled(false);
                    inforfami.setVisible(true);
                    inforfami.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel4.setForeground(Color.red);

                } else if (consustan.isEnabled()) {

                    consustan.setVisible(false);
                    consustan.setEnabled(false);
                    inforfami.setVisible(true);
                    inforfami.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel4.setForeground(Color.red);

                } else if (antece.isEnabled()) {

                    antece.setVisible(false);
                    antece.setEnabled(false);
                    inforfami.setVisible(true);
                    inforfami.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel4.setForeground(Color.red);

                } else if (vinculos.isEnabled()) {

                    vinculos.setVisible(false);
                    vinculos.setEnabled(false);
                    falsifi.ValidacionTipoExamen();
                    inforfami.setVisible(true);
                    inforfami.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel4.setForeground(Color.red);

                } else if (falsifi.isEnabled()) {

                    falsifi.setVisible(false);
                    falsifi.setEnabled(false);
//                        tecp.ValidacionTipoExamen();
                    inforfami.setVisible(true);
                    inforfami.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel4.setForeground(Color.red);

                }
            } else //Rutina administrativooooooooooooooooooooooooooooooooooooooooooooooos
            if (DatosPrincipales.getTipoExamen().equals("Rutina (admitivos)")) {

                if (daper.isEnabled()) {
                    Date fechavacia = DatoPersonal.fechanaci.getDate();
                    int age = Integer.parseInt(DatosPersonales.getEdad());
                    if (DatosPersonales.getEstrato().equals("-")) {
                        JOptionPane.showMessageDialog(null, "¡Seleccione el estrato del examinado!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else if (age < 17 || age > 70) {
                        JOptionPane.showMessageDialog(null, "¡La edad no se admite!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else if (DatosPersonales.getGenero().equals("-")) {
                        JOptionPane.showMessageDialog(null, "¡El género no ha sido seleccionado!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else {
                        if (DatosPrincipales.getMotivoExamen().equals("Procedimiento")) {
                            if (DatoPersonal.cbxtipoiden.getSelectedItem().equals("Seleccione") || fechavacia == null || DatoPersonal.txtnombre.getText().equals("") || DatoPersonal.txtnoiden.getText().equals("") || DatoPersonal.txtexpedidos.getText().equals("") || DatoPersonal.txtlugarnaci.getText().equals("") || DatoPersonal.txtdireccion.getText().equals("") || DatoPersonal.txtcargoactual.getText().equals("") || DatoPersonal.txtareaactual.getText().equals("") || DatoPersonal.txtpersonasolicitante.getText().equals("") || DatoPersonal.txtcargosolicitante.getText().equals("")) {
                                JOptionPane.showMessageDialog(null, "¡Debe completar todos los parámetros para registrar los datos!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                            }
                        } else if (DatosPrincipales.getMotivoExamen().equals("Ascenso")) {
                            if (DatoPersonal.cbxtipoiden.getSelectedItem().equals("Seleccione") || fechavacia == null || (DatoPersonal.txtnombre.getText().equals("") || "".equals(DatoPersonal.txtnombre.getText())) || (DatoPersonal.txtnoiden.getText().equals("") || "".equals(DatoPersonal.txtnoiden.getText())) || (DatoPersonal.txtexpedidos.getText().equals("") || "".equals(DatoPersonal.txtexpedidos.getText())) || (DatoPersonal.txtlugarnaci.getText().equals("") || "".equals(DatoPersonal.txtlugarnaci.getText())) || (DatoPersonal.txtdireccion.getText().equals("") || "".equals(DatoPersonal.txtdireccion.getText())) || (DatoPersonal.txtcargoaspira.getText().equals("") || "".equals(DatoPersonal.txtcargoaspira.getText())) || (DatoPersonal.txtareaaspira.getText().equals("") || "".equals(DatoPersonal.txtareaaspira.getText())) || (DatoPersonal.txtcargoactual.getText().equals("") || "".equals(DatoPersonal.txtcargoactual.getText())) || (DatoPersonal.txtareaactual.getText().equals("") || "".equals(DatoPersonal.txtareaactual.getText())) || (DatoPersonal.txtpersonasolicitante.getText().equals("") || "".equals(DatoPersonal.txtpersonasolicitante.getText())) || (DatoPersonal.txtcargosolicitante.getText().equals("") || "".equals(DatoPersonal.txtcargosolicitante.getText()))) {
                                JOptionPane.showMessageDialog(null, "¡Debe completar todos los parámetros para registrar los datos!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                            }
                        }
                        nombreExamen();
                        nombreExamen.setText("Nombre examen: " + TecnicaYPreguntas.getNombreExamen());
                        daper.setVisible(false);
                        daper.setEnabled(false);
                        estsalud.setVisible(true);
                        estsalud.setEnabled(true);
                        validarColor();
                        jLabel3.setForeground(Color.red);
                        DatoGeneral.fechaizquierda.setVisible(true);
                        if ("noesvisible".equals(EstadoSalud.getVisibilidadflecha())) {
                            DatoGeneral.fechaderecha.setVisible(false);
                        } else if ("esvisible".equals(EstadoSalud.getVisibilidadflecha())) {
                            DatoGeneral.fechaderecha.setVisible(true);
                        }

                        if ("Sinconexion".equals(classes.Conexion.importante)) {
                            btnsave.setVisible(true);
                        } else if ("Conconexion".equals(classes.Conexion.importante)) {
                            if ("nuevo".equals(DatosPrincipales.getOpcionExamen())) {
                                dp.update_datosper();
                                DatosPersonales.setColorCategoria("con");
                                DatosPersonales.setValidacionRegistro("registrado");
                            }
                        }
                    }
                } else if (estsalud.isEnabled()) {

                    if (EstadoSalud.getEstado_salud().equals("-") || EstadoSalud.getEstado_salud().equals("")) {
                        JOptionPane.showMessageDialog(null, "¡Debe elegir el estado de salud para continuar!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else if (EstadoSalud.getProb_salud().equals("-") || EstadoSalud.getProb_salud().equals("")) {
                        JOptionPane.showMessageDialog(null, "¡Debe completar todos los parámetros para continuar con el examen!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else {
                        estsalud.setVisible(false);
                        estsalud.setEnabled(false);
                        inforfami.setVisible(true);
                        inforfami.setEnabled(true);
                        DatoGeneral.fechaizquierda.setVisible(true);
                        DatoGeneral.fechaderecha.setVisible(true);
                        validarColor();
                        jLabel4.setForeground(Color.red);

                        if ("Sinconexion".equals(classes.Conexion.importante)) {

                        } else if ("Conconexion".equals(classes.Conexion.importante)) {
                            if ("nuevo".equals(DatosPrincipales.getOpcionExamen())) {
                                es.update_estadosalud();
                                es.validarestadosalud();
                                EstadoSalud.setColorCategoria("con");
                            }
                        }
                    }

                } else if (inforfami.isEnabled()) {

                    inforfami.setVisible(false);
                    inforfami.setEnabled(false);
                    daper.setVisible(true);
                    daper.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(false);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel2.setForeground(Color.red);

                } else if (infoaca.isEnabled()) {

                    infoaca.setVisible(false);
                    infoaca.setEnabled(false);
                    inforfami.setVisible(true);
                    inforfami.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel4.setForeground(Color.red);

                } else if (infofinan.isEnabled()) {

                    infofinan.setVisible(false);
                    infofinan.setEnabled(false);
                    inforfami.setVisible(true);
                    inforfami.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel4.setForeground(Color.red);

                } else if (casino.isEnabled()) {

                    casino.setVisible(false);
                    casino.setEnabled(false);
                    inforfami.setVisible(true);
                    inforfami.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel4.setForeground(Color.red);

                } else if (consbebidas.isEnabled()) {

                    consustan.ValidacionTipoExamen();
                    consbebidas.setVisible(false);
                    consbebidas.setEnabled(false);
                    inforfami.setVisible(true);
                    inforfami.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel4.setForeground(Color.red);

                } else if (consustan.isEnabled()) {

                    consustan.setVisible(false);
                    consustan.setEnabled(false);
                    inforfami.setVisible(true);
                    inforfami.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel4.setForeground(Color.red);

                } else if (antece.isEnabled()) {

                    antece.setVisible(false);
                    antece.setEnabled(false);
                    inforfami.setVisible(true);
                    inforfami.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel4.setForeground(Color.red);

                } else if (vinculos.isEnabled()) {

                    vinculos.setVisible(false);
                    vinculos.setEnabled(false);
                    falsifi.ValidacionTipoExamen();
                    inforfami.setVisible(true);
                    inforfami.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel4.setForeground(Color.red);

                } else if (falsifi.isEnabled()) {

                    falsifi.setVisible(false);
                    falsifi.setEnabled(false);
                    histlabo.ValidacionTipoExamen();
                    inforfami.setVisible(true);
                    inforfami.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel4.setForeground(Color.red);

                } else if (histlabo.isEnabled()) {

                    histlabo.setVisible(false);
                    histlabo.setEnabled(false);
                    inforfami.setVisible(true);
                    inforfami.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel4.setForeground(Color.red);

                } else if (planinfil.isEnabled()) {

                    planinfil.setVisible(false);
                    planinfil.setEnabled(false);
                    inforfami.setVisible(true);
                    inforfami.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel4.setForeground(Color.red);

                }

            } else //Especificooooooooooooooooooooooooooooooooooooooooooo
            if (DatosPrincipales.getTipoExamen().equals("Específico")) {
                if (daper.isEnabled()) {
                    Date fechavacia = DatoPersonal.fechanaci.getDate();
                    int age = Integer.parseInt(DatosPersonales.getEdad());
                    if (DatosPersonales.getEstrato().equals("-")) {
                        JOptionPane.showMessageDialog(null, "¡Seleccione el estrato del examinado!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else if (age < 17 || age > 70) {
                        JOptionPane.showMessageDialog(null, "¡La edad no se admite!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else if (DatoPersonal.cbxtipoiden.getSelectedItem().equals("Seleccione") || fechavacia == null || (DatoPersonal.txtnombre.getText().equals("") || "".equals(DatoPersonal.txtnombre.getText())) || (DatoPersonal.txtnoiden.getText().equals("") || "".equals(DatoPersonal.txtnoiden.getText())) || (DatoPersonal.txtexpedidos.getText().equals("") || "".equals(DatoPersonal.txtexpedidos.getText())) || (DatoPersonal.txtlugarnaci.getText().equals("") || "".equals(DatoPersonal.txtlugarnaci.getText())) || (DatoPersonal.txtdireccion.getText().equals("") || "".equals(DatoPersonal.txtdireccion.getText())) || (DatoPersonal.txtpersonasolicitante.getText().equals("") || "".equals(DatoPersonal.txtpersonasolicitante.getText())) || (DatoPersonal.txtcargosolicitante.getText().equals("") || "".equals(DatoPersonal.txtcargosolicitante.getText())) || (DatoPersonal.txtareaactual.getText().equals("") || "".equals(DatoPersonal.txtareaactual.getText())) || (DatoPersonal.txtcargoactual.getText().equals("") || "".equals(DatoPersonal.txtcargoactual.getText()))) {
                        JOptionPane.showMessageDialog(null, "¡Debe completar todos los parámetros para registrar los datos!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else if (DatosPersonales.getGenero().equals("-") || DatosPersonales.getGenero().equals("") || DatosPersonales.getGenero() == null) {
                        JOptionPane.showMessageDialog(null, "¡El género no ha sido seleccionado!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else {

                        nombreExamen();
                        nombreExamen.setText("Nombre examen: " + TecnicaYPreguntas.getNombreExamen());
                        daper.setVisible(false);
                        daper.setEnabled(false);
                        inforfami.setVisible(true);
                        inforfami.setEnabled(true);
                        DatoGeneral.fechaizquierda.setVisible(true);
                        DatoGeneral.fechaderecha.setVisible(true);
                        validarColor();
                        jLabel4.setForeground(Color.red);

                        if ("Sinconexion".equals(classes.Conexion.importante)) {
                            btnsave.setVisible(true);
                        } else if ("Conconexion".equals(classes.Conexion.importante)) {
                            if ("nuevo".equals(DatosPrincipales.getOpcionExamen())) {
                                dp.update_datosper();
                                DatosPersonales.setColorCategoria("con");
                                DatosPersonales.setValidacionRegistro("registrado");
                            }
                        }
                    }
                } else if (estsalud.isEnabled()) {

                    if (EstadoSalud.getEstado_salud().equals("-") || EstadoSalud.getEstado_salud().equals("")) {
                        JOptionPane.showMessageDialog(null, "¡Debe elegir el estado de salud para continuar!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else if (EstadoSalud.getProb_salud().equals("-") || EstadoSalud.getProb_salud().equals("")) {
                        JOptionPane.showMessageDialog(null, "¡Debe completar todos los parámetros para continuar con el examen!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else {
                        estsalud.setVisible(false);
                        estsalud.setEnabled(false);
                        inforfami.setVisible(true);
                        inforfami.setEnabled(true);
                        DatoGeneral.fechaizquierda.setVisible(true);
                        DatoGeneral.fechaderecha.setVisible(true);
                        validarColor();
                        jLabel4.setForeground(Color.red);

                        if ("Sinconexion".equals(classes.Conexion.importante)) {

                        } else if ("Conconexion".equals(classes.Conexion.importante)) {
                            if ("nuevo".equals(DatosPrincipales.getOpcionExamen())) {
                                es.update_estadosalud();
                                es.validarestadosalud();
                                EstadoSalud.setColorCategoria("con");
                            }
                        }
                    }

                } else if (inforfami.isEnabled()) {

                    inforfami.setVisible(false);
                    inforfami.setEnabled(false);
                    daper.setVisible(true);
                    daper.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(false);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel2.setForeground(Color.red);

                } else if (infoaca.isEnabled()) {

                    infoaca.setVisible(false);
                    infoaca.setEnabled(false);
                    inforfami.setVisible(true);
                    inforfami.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel4.setForeground(Color.red);

                } else if (infofinan.isEnabled()) {

                    infofinan.setVisible(false);
                    infofinan.setEnabled(false);
                    inforfami.setVisible(true);
                    inforfami.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel4.setForeground(Color.red);

                } else if (consbebidas.isEnabled()) {

                    consustan.ValidacionTipoExamen();
                    consbebidas.setVisible(false);
                    consbebidas.setEnabled(false);
                    inforfami.setVisible(true);
                    inforfami.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel4.setForeground(Color.red);

                } else if (consustan.isEnabled()) {

                    consustan.setVisible(false);
                    consustan.setEnabled(false);
                    inforfami.setVisible(true);
                    inforfami.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel4.setForeground(Color.red);

                } else if (antece.isEnabled()) {

                    antece.setVisible(false);
                    antece.setEnabled(false);
                    inforfami.setVisible(true);
                    inforfami.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel4.setForeground(Color.red);

                } else if (vinculos.isEnabled()) {

                    vinculos.setVisible(false);
                    vinculos.setEnabled(false);
                    inforfami.setVisible(true);
                    inforfami.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel4.setForeground(Color.red);

                } else if (temain.isEnabled()) {

                    temain.setVisible(false);
                    temain.setEnabled(false);
                    inforfami.setVisible(true);
                    inforfami.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel4.setForeground(Color.red);
                }
            }
        }
    }//GEN-LAST:event_jLabel12MouseClicked

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        //pre empleooooooooooooooooooooo
        if (DatosPersonales.getValidacionRegistro().equals("noregistrado")) {
            JOptionPane.showMessageDialog(null, "¡Debe guardar los datos básicos primero!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
        } else if (!EstadoSalud.getVisibilidadflecha().equals("esvisible")) {
            JOptionPane.showMessageDialog(null, "¡No apto en estado de salud!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
        } else {
            if (DatosPrincipales.getTipoExamen().equals("Pre-empleo")) {
                if (daper.isEnabled()) {
                    Date fechavacia = DatoPersonal.fechanaci.getDate();
                    int age = Integer.parseInt(DatosPersonales.getEdad());
                    if (DatosPersonales.getEstrato().equals("-")) {
                        JOptionPane.showMessageDialog(null, "¡Seleccione el estrato del examinado!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else if (age < 17 || age > 70) {
                        JOptionPane.showMessageDialog(null, "¡La edad no se admite!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else if (DatoPersonal.cbxtipoiden.getSelectedItem().equals("Seleccione") || fechavacia == null || (DatoPersonal.txtnombre.getText().equals("") || "".equals(DatoPersonal.txtnombre.getText())) || (DatoPersonal.txtnoiden.getText().equals("") || "".equals(DatoPersonal.txtnoiden.getText())) || (DatoPersonal.txtexpedidos.getText().equals("") || "".equals(DatoPersonal.txtexpedidos.getText())) || (DatoPersonal.txtlugarnaci.getText().equals("") || "".equals(DatoPersonal.txtlugarnaci.getText())) || (DatoPersonal.txtdireccion.getText().equals("") || "".equals(DatoPersonal.txtdireccion.getText())) || (DatoPersonal.txtcargoaspira.getText().equals("") || "".equals(DatoPersonal.txtcargoaspira.getText())) || (DatoPersonal.txtareaaspira.getText().equals("") || "".equals(DatoPersonal.txtareaaspira.getText())) || (DatoPersonal.txtpersonasolicitante.getText().equals("") || "".equals(DatoPersonal.txtpersonasolicitante.getText())) || (DatoPersonal.txtcargosolicitante.getText().equals("") || "".equals(DatoPersonal.txtcargosolicitante.getText()))) {
                        JOptionPane.showMessageDialog(null, "¡Debe completar todos los parámetros para registrar los datos!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else if (DatosPersonales.getGenero().equals("-") || DatosPersonales.getGenero().equals("") || DatosPersonales.getGenero() == null) {
                        JOptionPane.showMessageDialog(null, "¡El género no ha sido seleccionado!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else {

                        nombreExamen();
                        nombreExamen.setText("Nombre examen: " + TecnicaYPreguntas.getNombreExamen());
                        DatosPersonales.setColorCategoria("con");
                        daper.setVisible(false);
                        daper.setEnabled(false);
                        planinfil.setVisible(true);
                        planinfil.setEnabled(true);
                        DatoGeneral.fechaizquierda.setVisible(true);
                        DatoGeneral.fechaderecha.setVisible(true);
                        validarColor();
                        jLabel14.setForeground(Color.red);

                        if ("Sinconexion".equals(classes.Conexion.importante)) {
                            btnsave.setVisible(true);
                            DatosPersonales.setValidacionRegistro("registrado");
                        } else if ("Conconexion".equals(classes.Conexion.importante)) {
                            if ("nuevo".equals(DatosPrincipales.getOpcionExamen())) {
                                dp.update_datosper();
                                DatosPersonales.setValidacionRegistro("registrado");

                            }
                        }
                    }
                } else if (estsalud.isEnabled()) {

                    if (EstadoSalud.getEstado_salud().equals("-") || EstadoSalud.getEstado_salud().equals("")) {
                        JOptionPane.showMessageDialog(null, "¡Debe elegir el estado de salud para continuar!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else if (EstadoSalud.getProb_salud().equals("-") || EstadoSalud.getProb_salud().equals("")) {
                        JOptionPane.showMessageDialog(null, "¡Debe completar todos los parámetros para continuar con el examen!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else {
                        EstadoSalud.setColorCategoria("con");
                        estsalud.setVisible(false);
                        estsalud.setEnabled(false);
                        planinfil.setVisible(true);
                        planinfil.setEnabled(true);
                        DatoGeneral.fechaizquierda.setVisible(true);
                        DatoGeneral.fechaderecha.setVisible(true);
                        validarColor();
                        jLabel14.setForeground(Color.red);
                        if ("Sinconexion".equals(classes.Conexion.importante)) {

                        } else if ("Conconexion".equals(classes.Conexion.importante)) {
                            if ("nuevo".equals(DatosPrincipales.getOpcionExamen())) {
                                es.update_estadosalud();
                                es.validarestadosalud();

                            }
                        }
                    }

                } else if (inforfami.isEnabled()) {

                    inforfami.setVisible(false);
                    inforfami.setEnabled(false);
                    planinfil.setVisible(true);
                    planinfil.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel14.setForeground(Color.red);

                } else if (infoaca.isEnabled()) {

                    infoaca.setVisible(false);
                    infoaca.setEnabled(false);
                    planinfil.setVisible(true);
                    planinfil.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel14.setForeground(Color.red);

                } else if (infofinan.isEnabled()) {

                    infofinan.setVisible(false);
                    infofinan.setEnabled(false);
                    planinfil.setVisible(true);
                    planinfil.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel14.setForeground(Color.red);

                } else if (casino.isEnabled()) {

                    casino.setVisible(false);
                    casino.setEnabled(false);
                    planinfil.setVisible(true);
                    planinfil.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel14.setForeground(Color.red);

                } else if (consbebidas.isEnabled()) {

                    consustan.ValidacionTipoExamen();
                    consbebidas.setVisible(false);
                    consbebidas.setEnabled(false);
                    planinfil.setVisible(true);
                    planinfil.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel14.setForeground(Color.red);

                } else if (consustan.isEnabled()) {

                    consustan.setVisible(false);
                    consustan.setEnabled(false);
                    planinfil.setVisible(true);
                    planinfil.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel14.setForeground(Color.red);

                } else if (antece.isEnabled()) {

                    antece.setVisible(false);
                    antece.setEnabled(false);
                    planinfil.setVisible(true);
                    planinfil.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel14.setForeground(Color.red);

                } else if (vinculos.isEnabled()) {

                    vinculos.setVisible(false);
                    vinculos.setEnabled(false);
                    planinfil.setVisible(true);
                    planinfil.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel14.setForeground(Color.red);

                } else if (falsifi.isEnabled()) {

                    falsifi.setVisible(false);
                    falsifi.setEnabled(false);
                    planinfil.setVisible(true);
                    planinfil.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel14.setForeground(Color.red);

                } else if (histlabo.isEnabled()) {

                    histlabo.setVisible(false);
                    histlabo.setEnabled(false);
                    planinfil.setVisible(true);
                    planinfil.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel14.setForeground(Color.red);

                } else if (planinfil.isEnabled()) {
                    JOptionPane.showMessageDialog(null, "¡Ya se encuentra en uso!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);

                }
            } else //Rutina operacioneeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeees
            if (DatosPrincipales.getTipoExamen().equals("Rutina (operaciones)")) {
                if (daper.isEnabled()) {
                    Date fechavacia = DatoPersonal.fechanaci.getDate();
                    int age = Integer.parseInt(DatosPersonales.getEdad());
                    if (DatosPersonales.getEstrato().equals("-")) {
                        JOptionPane.showMessageDialog(null, "¡Seleccione el estrato del examinado!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else if (age < 17 || age > 70) {
                        JOptionPane.showMessageDialog(null, "¡La edad no se admite!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else if (DatosPersonales.getGenero().equals("-")) {
                        JOptionPane.showMessageDialog(null, "¡El género no ha sido seleccionado!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else if (DatosPrincipales.getMotivoExamen().equals("Procedimiento") && (DatoPersonal.cbxtipoiden.getSelectedItem().equals("Seleccione") || fechavacia == null || DatoPersonal.txtnombre.getText().equals("") || DatoPersonal.txtnoiden.getText().equals("") || DatoPersonal.txtexpedidos.getText().equals("") || DatoPersonal.txtlugarnaci.getText().equals("") || DatoPersonal.txtdireccion.getText().equals("") || DatoPersonal.txtcargoactual.getText().equals("") || DatoPersonal.txtareaactual.getText().equals("") || DatoPersonal.txtpersonasolicitante.getText().equals("") || DatoPersonal.txtcargosolicitante.getText().equals(""))) {

                        JOptionPane.showMessageDialog(null, "¡Debe completar todos los parámetros para registrar los datos!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);

                    } else if (DatosPrincipales.getMotivoExamen().equals("Ascenso") && (DatoPersonal.cbxtipoiden.getSelectedItem().equals("Seleccione") || fechavacia == null || (DatoPersonal.txtnombre.getText().equals("") || "".equals(DatoPersonal.txtnombre.getText())) || (DatoPersonal.txtnoiden.getText().equals("") || "".equals(DatoPersonal.txtnoiden.getText())) || (DatoPersonal.txtexpedidos.getText().equals("") || "".equals(DatoPersonal.txtexpedidos.getText())) || (DatoPersonal.txtlugarnaci.getText().equals("") || "".equals(DatoPersonal.txtlugarnaci.getText())) || (DatoPersonal.txtdireccion.getText().equals("") || "".equals(DatoPersonal.txtdireccion.getText())) || (DatoPersonal.txtcargoaspira.getText().equals("") || "".equals(DatoPersonal.txtcargoaspira.getText())) || (DatoPersonal.txtareaaspira.getText().equals("") || "".equals(DatoPersonal.txtareaaspira.getText())) || (DatoPersonal.txtcargoactual.getText().equals("") || "".equals(DatoPersonal.txtcargoactual.getText())) || (DatoPersonal.txtareaactual.getText().equals("") || "".equals(DatoPersonal.txtareaactual.getText())) || (DatoPersonal.txtpersonasolicitante.getText().equals("") || "".equals(DatoPersonal.txtpersonasolicitante.getText())) || (DatoPersonal.txtcargosolicitante.getText().equals("") || "".equals(DatoPersonal.txtcargosolicitante.getText())))) {

                        JOptionPane.showMessageDialog(null, "¡Debe completar todos los parámetros para registrar los datos!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);

                    } else {

                        nombreExamen();
                        nombreExamen.setText("Nombre examen: " + TecnicaYPreguntas.getNombreExamen());

                        daper.setVisible(false);
                        daper.setEnabled(false);
                        planinfil.setVisible(true);
                        planinfil.setEnabled(true);
                        DatoGeneral.fechaizquierda.setVisible(true);
                        DatoGeneral.fechaderecha.setVisible(true);
                        validarColor();
                        jLabel14.setForeground(Color.red);

                        if ("Sinconexion".equals(classes.Conexion.importante)) {
                            btnsave.setVisible(true);
                        } else if ("Conconexion".equals(classes.Conexion.importante)) {
                            if ("nuevo".equals(DatosPrincipales.getOpcionExamen())) {
                                dp.update_datosper();
                                DatosPersonales.setColorCategoria("con");
                                DatosPersonales.setValidacionRegistro("registrado");
                            }
                        }
                    }
                } else if (estsalud.isEnabled()) {

                    if (EstadoSalud.getEstado_salud().equals("-") || EstadoSalud.getEstado_salud().equals("")) {
                        JOptionPane.showMessageDialog(null, "¡Debe elegir el estado de salud para continuar!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else if (EstadoSalud.getProb_salud().equals("-") || EstadoSalud.getProb_salud().equals("")) {
                        JOptionPane.showMessageDialog(null, "¡Debe completar todos los parámetros para continuar con el examen!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else {
                        estsalud.setVisible(false);
                        estsalud.setEnabled(false);
                        inforfami.setVisible(true);
                        inforfami.setEnabled(true);
                        DatoGeneral.fechaizquierda.setVisible(true);
                        DatoGeneral.fechaderecha.setVisible(true);
                        validarColor();
                        jLabel4.setForeground(Color.red);

                        if ("Sinconexion".equals(classes.Conexion.importante)) {

                        } else if ("Conconexion".equals(classes.Conexion.importante)) {
                            if ("nuevo".equals(DatosPrincipales.getOpcionExamen())) {
                                es.update_estadosalud();
                                es.validarestadosalud();
                                EstadoSalud.setColorCategoria("con");
                            }
                        }
                    }

                } else if (inforfami.isEnabled()) {

                    inforfami.setVisible(false);
                    inforfami.setEnabled(false);
                    daper.setVisible(true);
                    daper.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(false);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel2.setForeground(Color.red);

                } else if (infoaca.isEnabled()) {

                    infoaca.setVisible(false);
                    infoaca.setEnabled(false);
                    inforfami.setVisible(true);
                    inforfami.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel4.setForeground(Color.red);

                } else if (infofinan.isEnabled()) {

                    infofinan.setVisible(false);
                    infofinan.setEnabled(false);
                    inforfami.setVisible(true);
                    inforfami.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel4.setForeground(Color.red);

                } else if (casino.isEnabled()) {

                    casino.setVisible(false);
                    casino.setEnabled(false);
                    inforfami.setVisible(true);
                    inforfami.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel4.setForeground(Color.red);

                } else if (consbebidas.isEnabled()) {

                    consustan.ValidacionTipoExamen();
                    consbebidas.setVisible(false);
                    consbebidas.setEnabled(false);
                    inforfami.setVisible(true);
                    inforfami.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel4.setForeground(Color.red);

                } else if (consustan.isEnabled()) {

                    consustan.setVisible(false);
                    consustan.setEnabled(false);
                    inforfami.setVisible(true);
                    inforfami.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel4.setForeground(Color.red);

                } else if (antece.isEnabled()) {

                    antece.setVisible(false);
                    antece.setEnabled(false);
                    inforfami.setVisible(true);
                    inforfami.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel4.setForeground(Color.red);

                } else if (vinculos.isEnabled()) {

                    vinculos.setVisible(false);
                    vinculos.setEnabled(false);
                    falsifi.ValidacionTipoExamen();
                    inforfami.setVisible(true);
                    inforfami.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel4.setForeground(Color.red);

                } else if (falsifi.isEnabled()) {

                    falsifi.setVisible(false);
                    falsifi.setEnabled(false);
//                        tecp.ValidacionTipoExamen();
                    inforfami.setVisible(true);
                    inforfami.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel4.setForeground(Color.red);

                }
            } else //Rutina administrativooooooooooooooooooooooooooooooooooooooooooooooos
            if (DatosPrincipales.getTipoExamen().equals("Rutina (admitivos)")) {

                if (daper.isEnabled()) {
                    Date fechavacia = DatoPersonal.fechanaci.getDate();
                    int age = Integer.parseInt(DatosPersonales.getEdad());
                    if (DatosPersonales.getEstrato().equals("-")) {
                        JOptionPane.showMessageDialog(null, "¡Seleccione el estrato del examinado!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else if (age < 17 || age > 70) {
                        JOptionPane.showMessageDialog(null, "¡La edad no se admite!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else if (DatosPersonales.getGenero().equals("-")) {
                        JOptionPane.showMessageDialog(null, "¡El género no ha sido seleccionado!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else {
                        if (DatosPrincipales.getMotivoExamen().equals("Procedimiento")) {
                            if (DatoPersonal.cbxtipoiden.getSelectedItem().equals("Seleccione") || fechavacia == null || DatoPersonal.txtnombre.getText().equals("") || DatoPersonal.txtnoiden.getText().equals("") || DatoPersonal.txtexpedidos.getText().equals("") || DatoPersonal.txtlugarnaci.getText().equals("") || DatoPersonal.txtdireccion.getText().equals("") || DatoPersonal.txtcargoactual.getText().equals("") || DatoPersonal.txtareaactual.getText().equals("") || DatoPersonal.txtpersonasolicitante.getText().equals("") || DatoPersonal.txtcargosolicitante.getText().equals("")) {
                                JOptionPane.showMessageDialog(null, "¡Debe completar todos los parámetros para registrar los datos!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                            }
                        } else if (DatosPrincipales.getMotivoExamen().equals("Ascenso")) {
                            if (DatoPersonal.cbxtipoiden.getSelectedItem().equals("Seleccione") || fechavacia == null || (DatoPersonal.txtnombre.getText().equals("") || "".equals(DatoPersonal.txtnombre.getText())) || (DatoPersonal.txtnoiden.getText().equals("") || "".equals(DatoPersonal.txtnoiden.getText())) || (DatoPersonal.txtexpedidos.getText().equals("") || "".equals(DatoPersonal.txtexpedidos.getText())) || (DatoPersonal.txtlugarnaci.getText().equals("") || "".equals(DatoPersonal.txtlugarnaci.getText())) || (DatoPersonal.txtdireccion.getText().equals("") || "".equals(DatoPersonal.txtdireccion.getText())) || (DatoPersonal.txtcargoaspira.getText().equals("") || "".equals(DatoPersonal.txtcargoaspira.getText())) || (DatoPersonal.txtareaaspira.getText().equals("") || "".equals(DatoPersonal.txtareaaspira.getText())) || (DatoPersonal.txtcargoactual.getText().equals("") || "".equals(DatoPersonal.txtcargoactual.getText())) || (DatoPersonal.txtareaactual.getText().equals("") || "".equals(DatoPersonal.txtareaactual.getText())) || (DatoPersonal.txtpersonasolicitante.getText().equals("") || "".equals(DatoPersonal.txtpersonasolicitante.getText())) || (DatoPersonal.txtcargosolicitante.getText().equals("") || "".equals(DatoPersonal.txtcargosolicitante.getText()))) {
                                JOptionPane.showMessageDialog(null, "¡Debe completar todos los parámetros para registrar los datos!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                            }
                        }
                        nombreExamen();
                        nombreExamen.setText("Nombre examen: " + TecnicaYPreguntas.getNombreExamen());
                        daper.setVisible(false);
                        daper.setEnabled(false);
                        estsalud.setVisible(true);
                        estsalud.setEnabled(true);
                        validarColor();
                        jLabel3.setForeground(Color.red);
                        DatoGeneral.fechaizquierda.setVisible(true);
                        if ("noesvisible".equals(EstadoSalud.getVisibilidadflecha())) {
                            DatoGeneral.fechaderecha.setVisible(false);
                        } else if ("esvisible".equals(EstadoSalud.getVisibilidadflecha())) {
                            DatoGeneral.fechaderecha.setVisible(true);
                        }

                        if ("Sinconexion".equals(classes.Conexion.importante)) {
                            btnsave.setVisible(true);
                        } else if ("Conconexion".equals(classes.Conexion.importante)) {
                            if ("nuevo".equals(DatosPrincipales.getOpcionExamen())) {
                                dp.update_datosper();
                                DatosPersonales.setColorCategoria("con");
                                DatosPersonales.setValidacionRegistro("registrado");
                            }
                        }
                    }
                } else if (estsalud.isEnabled()) {

                    if (EstadoSalud.getEstado_salud().equals("-") || EstadoSalud.getEstado_salud().equals("")) {
                        JOptionPane.showMessageDialog(null, "¡Debe elegir el estado de salud para continuar!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else if (EstadoSalud.getProb_salud().equals("-") || EstadoSalud.getProb_salud().equals("")) {
                        JOptionPane.showMessageDialog(null, "¡Debe completar todos los parámetros para continuar con el examen!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else {
                        estsalud.setVisible(false);
                        estsalud.setEnabled(false);
                        inforfami.setVisible(true);
                        inforfami.setEnabled(true);
                        DatoGeneral.fechaizquierda.setVisible(true);
                        DatoGeneral.fechaderecha.setVisible(true);
                        validarColor();
                        jLabel4.setForeground(Color.red);

                        if ("Sinconexion".equals(classes.Conexion.importante)) {

                        } else if ("Conconexion".equals(classes.Conexion.importante)) {
                            if ("nuevo".equals(DatosPrincipales.getOpcionExamen())) {
                                es.update_estadosalud();
                                es.validarestadosalud();
                                EstadoSalud.setColorCategoria("con");
                            }
                        }
                    }

                } else if (inforfami.isEnabled()) {

                    inforfami.setVisible(false);
                    inforfami.setEnabled(false);
                    daper.setVisible(true);
                    daper.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(false);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel2.setForeground(Color.red);

                } else if (infoaca.isEnabled()) {

                    infoaca.setVisible(false);
                    infoaca.setEnabled(false);
                    inforfami.setVisible(true);
                    inforfami.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel4.setForeground(Color.red);

                } else if (infofinan.isEnabled()) {

                    infofinan.setVisible(false);
                    infofinan.setEnabled(false);
                    inforfami.setVisible(true);
                    inforfami.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel4.setForeground(Color.red);

                } else if (casino.isEnabled()) {

                    casino.setVisible(false);
                    casino.setEnabled(false);
                    inforfami.setVisible(true);
                    inforfami.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel4.setForeground(Color.red);

                } else if (consbebidas.isEnabled()) {

                    consustan.ValidacionTipoExamen();
                    consbebidas.setVisible(false);
                    consbebidas.setEnabled(false);
                    inforfami.setVisible(true);
                    inforfami.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel4.setForeground(Color.red);

                } else if (consustan.isEnabled()) {

                    consustan.setVisible(false);
                    consustan.setEnabled(false);
                    inforfami.setVisible(true);
                    inforfami.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel4.setForeground(Color.red);

                } else if (antece.isEnabled()) {

                    antece.setVisible(false);
                    antece.setEnabled(false);
                    inforfami.setVisible(true);
                    inforfami.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel4.setForeground(Color.red);

                } else if (vinculos.isEnabled()) {

                    vinculos.setVisible(false);
                    vinculos.setEnabled(false);
                    falsifi.ValidacionTipoExamen();
                    inforfami.setVisible(true);
                    inforfami.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel4.setForeground(Color.red);

                } else if (falsifi.isEnabled()) {

                    falsifi.setVisible(false);
                    falsifi.setEnabled(false);
                    histlabo.ValidacionTipoExamen();
                    inforfami.setVisible(true);
                    inforfami.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel4.setForeground(Color.red);

                } else if (histlabo.isEnabled()) {

                    histlabo.setVisible(false);
                    histlabo.setEnabled(false);
                    inforfami.setVisible(true);
                    inforfami.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel4.setForeground(Color.red);

                } else if (planinfil.isEnabled()) {
                    JOptionPane.showMessageDialog(null, "¡Ya se encuentra en uso!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);

                }

            } else //Especificooooooooooooooooooooooooooooooooooooooooooo
            if (DatosPrincipales.getTipoExamen().equals("Específico")) {
                if (daper.isEnabled()) {
                    Date fechavacia = DatoPersonal.fechanaci.getDate();
                    int age = Integer.parseInt(DatosPersonales.getEdad());
                    if (DatosPersonales.getEstrato().equals("-")) {
                        JOptionPane.showMessageDialog(null, "¡Seleccione el estrato del examinado!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else if (age < 17 || age > 70) {
                        JOptionPane.showMessageDialog(null, "¡La edad no se admite!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else if (DatoPersonal.cbxtipoiden.getSelectedItem().equals("Seleccione") || fechavacia == null || (DatoPersonal.txtnombre.getText().equals("") || "".equals(DatoPersonal.txtnombre.getText())) || (DatoPersonal.txtnoiden.getText().equals("") || "".equals(DatoPersonal.txtnoiden.getText())) || (DatoPersonal.txtexpedidos.getText().equals("") || "".equals(DatoPersonal.txtexpedidos.getText())) || (DatoPersonal.txtlugarnaci.getText().equals("") || "".equals(DatoPersonal.txtlugarnaci.getText())) || (DatoPersonal.txtdireccion.getText().equals("") || "".equals(DatoPersonal.txtdireccion.getText())) || (DatoPersonal.txtpersonasolicitante.getText().equals("") || "".equals(DatoPersonal.txtpersonasolicitante.getText())) || (DatoPersonal.txtcargosolicitante.getText().equals("") || "".equals(DatoPersonal.txtcargosolicitante.getText())) || (DatoPersonal.txtareaactual.getText().equals("") || "".equals(DatoPersonal.txtareaactual.getText())) || (DatoPersonal.txtcargoactual.getText().equals("") || "".equals(DatoPersonal.txtcargoactual.getText()))) {
                        JOptionPane.showMessageDialog(null, "¡Debe completar todos los parámetros para registrar los datos!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else if (DatosPersonales.getGenero().equals("-") || DatosPersonales.getGenero().equals("") || DatosPersonales.getGenero() == null) {
                        JOptionPane.showMessageDialog(null, "¡El género no ha sido seleccionado!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else {

                        nombreExamen();
                        nombreExamen.setText("Nombre examen: " + TecnicaYPreguntas.getNombreExamen());
                        daper.setVisible(false);
                        daper.setEnabled(false);
                        inforfami.setVisible(true);
                        inforfami.setEnabled(true);
                        DatoGeneral.fechaizquierda.setVisible(true);
                        DatoGeneral.fechaderecha.setVisible(true);
                        validarColor();
                        jLabel4.setForeground(Color.red);

                        if ("Sinconexion".equals(classes.Conexion.importante)) {
                            btnsave.setVisible(true);
                        } else if ("Conconexion".equals(classes.Conexion.importante)) {
                            if ("nuevo".equals(DatosPrincipales.getOpcionExamen())) {
                                dp.update_datosper();
                                DatosPersonales.setColorCategoria("con");
                                DatosPersonales.setValidacionRegistro("registrado");
                            }
                        }
                    }
                } else if (estsalud.isEnabled()) {

                    if (EstadoSalud.getEstado_salud().equals("-") || EstadoSalud.getEstado_salud().equals("")) {
                        JOptionPane.showMessageDialog(null, "¡Debe elegir el estado de salud para continuar!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else if (EstadoSalud.getProb_salud().equals("-") || EstadoSalud.getProb_salud().equals("")) {
                        JOptionPane.showMessageDialog(null, "¡Debe completar todos los parámetros para continuar con el examen!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else {
                        estsalud.setVisible(false);
                        estsalud.setEnabled(false);
                        inforfami.setVisible(true);
                        inforfami.setEnabled(true);
                        DatoGeneral.fechaizquierda.setVisible(true);
                        DatoGeneral.fechaderecha.setVisible(true);
                        validarColor();
                        jLabel4.setForeground(Color.red);

                        if ("Sinconexion".equals(classes.Conexion.importante)) {

                        } else if ("Conconexion".equals(classes.Conexion.importante)) {
                            if ("nuevo".equals(DatosPrincipales.getOpcionExamen())) {
                                es.update_estadosalud();
                                es.validarestadosalud();
                                EstadoSalud.setColorCategoria("con");
                            }
                        }
                    }

                } else if (inforfami.isEnabled()) {

                    inforfami.setVisible(false);
                    inforfami.setEnabled(false);
                    daper.setVisible(true);
                    daper.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(false);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel2.setForeground(Color.red);

                } else if (infoaca.isEnabled()) {

                    infoaca.setVisible(false);
                    infoaca.setEnabled(false);
                    inforfami.setVisible(true);
                    inforfami.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel4.setForeground(Color.red);

                } else if (infofinan.isEnabled()) {

                    infofinan.setVisible(false);
                    infofinan.setEnabled(false);
                    inforfami.setVisible(true);
                    inforfami.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel4.setForeground(Color.red);

                } else if (consbebidas.isEnabled()) {

                    consustan.ValidacionTipoExamen();
                    consbebidas.setVisible(false);
                    consbebidas.setEnabled(false);
                    inforfami.setVisible(true);
                    inforfami.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel4.setForeground(Color.red);

                } else if (consustan.isEnabled()) {

                    consustan.setVisible(false);
                    consustan.setEnabled(false);
                    inforfami.setVisible(true);
                    inforfami.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel4.setForeground(Color.red);

                } else if (antece.isEnabled()) {

                    antece.setVisible(false);
                    antece.setEnabled(false);
                    inforfami.setVisible(true);
                    inforfami.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel4.setForeground(Color.red);

                } else if (vinculos.isEnabled()) {

                    vinculos.setVisible(false);
                    vinculos.setEnabled(false);
                    inforfami.setVisible(true);
                    inforfami.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel4.setForeground(Color.red);

                } else if (temain.isEnabled()) {

                    temain.setVisible(false);
                    temain.setEnabled(false);
                    inforfami.setVisible(true);
                    inforfami.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel4.setForeground(Color.red);

                }
            }
        }
    }//GEN-LAST:event_jLabel14MouseClicked

    private void jLabel18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseClicked
        //Especificooooooooooooooooooooooooooooooooooooooooooo
        if (DatosPrincipales.getTipoExamen().equals("Específico")) {
            if (daper.isEnabled()) {
                Date fechavacia = DatoPersonal.fechanaci.getDate();
                int age = Integer.parseInt(DatosPersonales.getEdad());
                if (DatosPersonales.getEstrato().equals("-")) {
                    JOptionPane.showMessageDialog(null, "¡Seleccione el estrato del examinado!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                } else if (age < 17 || age > 70) {
                    JOptionPane.showMessageDialog(null, "¡La edad no se admite!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                } else if (DatoPersonal.cbxtipoiden.getSelectedItem().equals("Seleccione") || fechavacia == null || (DatoPersonal.txtnombre.getText().equals("") || "".equals(DatoPersonal.txtnombre.getText())) || (DatoPersonal.txtnoiden.getText().equals("") || "".equals(DatoPersonal.txtnoiden.getText())) || (DatoPersonal.txtexpedidos.getText().equals("") || "".equals(DatoPersonal.txtexpedidos.getText())) || (DatoPersonal.txtlugarnaci.getText().equals("") || "".equals(DatoPersonal.txtlugarnaci.getText())) || (DatoPersonal.txtdireccion.getText().equals("") || "".equals(DatoPersonal.txtdireccion.getText())) || (DatoPersonal.txtpersonasolicitante.getText().equals("") || "".equals(DatoPersonal.txtpersonasolicitante.getText())) || (DatoPersonal.txtcargosolicitante.getText().equals("") || "".equals(DatoPersonal.txtcargosolicitante.getText())) || (DatoPersonal.txtareaactual.getText().equals("") || "".equals(DatoPersonal.txtareaactual.getText())) || (DatoPersonal.txtcargoactual.getText().equals("") || "".equals(DatoPersonal.txtcargoactual.getText()))) {
                    JOptionPane.showMessageDialog(null, "¡Debe completar todos los parámetros para registrar los datos!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                } else if (DatosPersonales.getGenero().equals("-") || DatosPersonales.getGenero().equals("") || DatosPersonales.getGenero() == null) {
                    JOptionPane.showMessageDialog(null, "¡El género no ha sido seleccionado!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                } else {

                    nombreExamen();
                    nombreExamen.setText("Nombre examen: " + TecnicaYPreguntas.getNombreExamen());
                    daper.setVisible(false);
                    daper.setEnabled(false);
                    temain.setVisible(true);
                    temain.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel18.setForeground(Color.red);

                    if ("Sinconexion".equals(classes.Conexion.importante)) {
                        btnsave.setVisible(true);
                    } else if ("Conconexion".equals(classes.Conexion.importante)) {
                        if ("nuevo".equals(DatosPrincipales.getOpcionExamen())) {
                            dp.update_datosper();
                            DatosPersonales.setColorCategoria("con");
                            DatosPersonales.setValidacionRegistro("registrado");
                        }
                    }
                }
            } else if (estsalud.isEnabled()) {

                if (EstadoSalud.getEstado_salud().equals("-") || EstadoSalud.getEstado_salud().equals("")) {
                    JOptionPane.showMessageDialog(null, "¡Debe elegir el estado de salud para continuar!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                } else if (EstadoSalud.getProb_salud().equals("-") || EstadoSalud.getProb_salud().equals("")) {
                    JOptionPane.showMessageDialog(null, "¡Debe completar todos los parámetros para continuar con el examen!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                } else {
                    estsalud.setVisible(false);
                    estsalud.setEnabled(false);
                    temain.setVisible(true);
                    temain.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(true);
                    validarColor();
                    jLabel18.setForeground(Color.red);

                    if ("Sinconexion".equals(classes.Conexion.importante)) {

                    } else if ("Conconexion".equals(classes.Conexion.importante)) {
                        if ("nuevo".equals(DatosPrincipales.getOpcionExamen())) {
                            es.update_estadosalud();
                            es.validarestadosalud();
                            EstadoSalud.setColorCategoria("con");
                        }
                    }
                }

            } else if (inforfami.isEnabled()) {

                inforfami.setVisible(false);
                inforfami.setEnabled(false);
                temain.setVisible(true);
                temain.setEnabled(true);
                DatoGeneral.fechaizquierda.setVisible(true);
                DatoGeneral.fechaderecha.setVisible(true);
                validarColor();
                jLabel18.setForeground(Color.red);

            } else if (infoaca.isEnabled()) {

                infoaca.setVisible(false);
                infoaca.setEnabled(false);
                temain.setVisible(true);
                temain.setEnabled(true);
                DatoGeneral.fechaizquierda.setVisible(true);
                DatoGeneral.fechaderecha.setVisible(true);
                validarColor();
                jLabel18.setForeground(Color.red);

            } else if (infofinan.isEnabled()) {

                infofinan.setVisible(false);
                infofinan.setEnabled(false);
                temain.setVisible(true);
                temain.setEnabled(true);
                DatoGeneral.fechaizquierda.setVisible(true);
                DatoGeneral.fechaderecha.setVisible(true);
                validarColor();
                jLabel18.setForeground(Color.red);

            } else if (consbebidas.isEnabled()) {

                consustan.ValidacionTipoExamen();
                consbebidas.setVisible(false);
                consbebidas.setEnabled(false);
                temain.setVisible(true);
                temain.setEnabled(true);
                DatoGeneral.fechaizquierda.setVisible(true);
                DatoGeneral.fechaderecha.setVisible(true);
                validarColor();
                jLabel18.setForeground(Color.red);

            } else if (consustan.isEnabled()) {

                consustan.setVisible(false);
                consustan.setEnabled(false);
                temain.setVisible(true);
                temain.setEnabled(true);
                DatoGeneral.fechaizquierda.setVisible(true);
                DatoGeneral.fechaderecha.setVisible(true);
                validarColor();
                jLabel18.setForeground(Color.red);

            } else if (antece.isEnabled()) {

                antece.setVisible(false);
                antece.setEnabled(false);
                temain.setVisible(true);
                temain.setEnabled(true);
                DatoGeneral.fechaizquierda.setVisible(true);
                DatoGeneral.fechaderecha.setVisible(true);
                validarColor();
                jLabel18.setForeground(Color.red);

            } else if (vinculos.isEnabled()) {

                vinculos.setVisible(false);
                vinculos.setEnabled(false);
                temain.setVisible(true);
                temain.setEnabled(true);
                DatoGeneral.fechaizquierda.setVisible(true);
                DatoGeneral.fechaderecha.setVisible(true);
                validarColor();
                jLabel18.setForeground(Color.red);

            } else if (temain.isEnabled()) {
                JOptionPane.showMessageDialog(null, "¡Ya se encuentra en uso!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);

            }
        }
    }//GEN-LAST:event_jLabel18MouseClicked

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        //pre empleooooooooooooooooooooo
        if (DatosPersonales.getValidacionRegistro().equals("noregistrado")) {
            JOptionPane.showMessageDialog(null, "¡Debe guardar los datos básicos primero!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
        } else if (!EstadoSalud.getVisibilidadflecha().equals("esvisible")) {
            JOptionPane.showMessageDialog(null, "¡No apto en estado de salud!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
        } else {
            if (DatosPrincipales.getTipoExamen().equals("Pre-empleo")) {
                if (daper.isEnabled()) {
                    Date fechavacia = DatoPersonal.fechanaci.getDate();
                    int age = Integer.parseInt(DatosPersonales.getEdad());
                    if (DatosPersonales.getEstrato().equals("-")) {
                        JOptionPane.showMessageDialog(null, "¡Seleccione el estrato del examinado!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else if (age < 17 || age > 70) {
                        JOptionPane.showMessageDialog(null, "¡La edad no se admite!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else if (DatoPersonal.cbxtipoiden.getSelectedItem().equals("Seleccione") || fechavacia == null || (DatoPersonal.txtnombre.getText().equals("") || "".equals(DatoPersonal.txtnombre.getText())) || (DatoPersonal.txtnoiden.getText().equals("") || "".equals(DatoPersonal.txtnoiden.getText())) || (DatoPersonal.txtexpedidos.getText().equals("") || "".equals(DatoPersonal.txtexpedidos.getText())) || (DatoPersonal.txtlugarnaci.getText().equals("") || "".equals(DatoPersonal.txtlugarnaci.getText())) || (DatoPersonal.txtdireccion.getText().equals("") || "".equals(DatoPersonal.txtdireccion.getText())) || (DatoPersonal.txtcargoaspira.getText().equals("") || "".equals(DatoPersonal.txtcargoaspira.getText())) || (DatoPersonal.txtareaaspira.getText().equals("") || "".equals(DatoPersonal.txtareaaspira.getText())) || (DatoPersonal.txtpersonasolicitante.getText().equals("") || "".equals(DatoPersonal.txtpersonasolicitante.getText())) || (DatoPersonal.txtcargosolicitante.getText().equals("") || "".equals(DatoPersonal.txtcargosolicitante.getText()))) {
                        JOptionPane.showMessageDialog(null, "¡Debe completar todos los parámetros para registrar los datos!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else if (DatosPersonales.getGenero().equals("-") || DatosPersonales.getGenero().equals("") || DatosPersonales.getGenero() == null) {
                        JOptionPane.showMessageDialog(null, "¡El género no ha sido seleccionado!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else {

                        nombreExamen();
                        nombreExamen.setText("Nombre examen: " + TecnicaYPreguntas.getNombreExamen());
                        DatosPersonales.setColorCategoria("con");
                        daper.setVisible(false);
                        daper.setEnabled(false);
                        tecp.setVisible(true);
                        tecp.setEnabled(true);
                        DatoGeneral.fechaizquierda.setVisible(true);
                        DatoGeneral.fechaderecha.setVisible(false);
                        validarColor();
                        jLabel15.setForeground(Color.red);

                        if ("Sinconexion".equals(classes.Conexion.importante)) {
                            btnsave.setVisible(true);
                            DatosPersonales.setValidacionRegistro("registrado");
                        } else if ("Conconexion".equals(classes.Conexion.importante)) {
                            if ("nuevo".equals(DatosPrincipales.getOpcionExamen())) {
                                dp.update_datosper();
                                DatosPersonales.setValidacionRegistro("registrado");

                            }
                        }
                    }
                } else if (estsalud.isEnabled()) {

                    if (EstadoSalud.getEstado_salud().equals("-") || EstadoSalud.getEstado_salud().equals("")) {
                        JOptionPane.showMessageDialog(null, "¡Debe elegir el estado de salud para continuar!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else if (EstadoSalud.getProb_salud().equals("-") || EstadoSalud.getProb_salud().equals("")) {
                        JOptionPane.showMessageDialog(null, "¡Debe completar todos los parámetros para continuar con el examen!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else {
                        EstadoSalud.setColorCategoria("con");
                        estsalud.setVisible(false);
                        estsalud.setEnabled(false);
                        tecp.setVisible(true);
                        tecp.setEnabled(true);
                        DatoGeneral.fechaizquierda.setVisible(true);
                        DatoGeneral.fechaderecha.setVisible(false);
                        validarColor();
                        jLabel15.setForeground(Color.red);
                        if ("Sinconexion".equals(classes.Conexion.importante)) {

                        } else if ("Conconexion".equals(classes.Conexion.importante)) {
                            if ("nuevo".equals(DatosPrincipales.getOpcionExamen())) {
                                es.update_estadosalud();
                                es.validarestadosalud();

                            }
                        }
                    }

                } else if (inforfami.isEnabled()) {

                    inforfami.setVisible(false);
                    inforfami.setEnabled(false);
                    tecp.setVisible(true);
                    tecp.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(false);
                    validarColor();
                    jLabel15.setForeground(Color.red);

                } else if (infoaca.isEnabled()) {

                    infoaca.setVisible(false);
                    infoaca.setEnabled(false);
                    tecp.setVisible(true);
                    tecp.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(false);
                    validarColor();
                    jLabel15.setForeground(Color.red);

                } else if (infofinan.isEnabled()) {

                    infofinan.setVisible(false);
                    infofinan.setEnabled(false);
                    tecp.setVisible(true);
                    tecp.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(false);
                    validarColor();
                    jLabel15.setForeground(Color.red);

                } else if (casino.isEnabled()) {

                    casino.setVisible(false);
                    casino.setEnabled(false);
                    tecp.setVisible(true);
                    tecp.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(false);
                    validarColor();
                    jLabel15.setForeground(Color.red);

                } else if (consbebidas.isEnabled()) {

                    consustan.ValidacionTipoExamen();
                    consbebidas.setVisible(false);
                    consbebidas.setEnabled(false);
                    tecp.setVisible(true);
                    tecp.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(false);
                    validarColor();
                    jLabel15.setForeground(Color.red);

                } else if (consustan.isEnabled()) {

                    consustan.setVisible(false);
                    consustan.setEnabled(false);
                    tecp.setVisible(true);
                    tecp.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(false);
                    validarColor();
                    jLabel15.setForeground(Color.red);

                } else if (antece.isEnabled()) {

                    antece.setVisible(false);
                    antece.setEnabled(false);
                    tecp.setVisible(true);
                    tecp.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(false);
                    validarColor();
                    jLabel15.setForeground(Color.red);

                } else if (vinculos.isEnabled()) {

                    vinculos.setVisible(false);
                    vinculos.setEnabled(false);
                    tecp.setVisible(true);
                    tecp.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(false);
                    validarColor();
                    jLabel15.setForeground(Color.red);

                } else if (falsifi.isEnabled()) {

                    falsifi.setVisible(false);
                    falsifi.setEnabled(false);
                    histlabo.ValidacionTipoExamen();
                    tecp.setVisible(true);
                    tecp.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(false);
                    validarColor();
                    jLabel15.setForeground(Color.red);

                } else if (histlabo.isEnabled()) {

                    histlabo.setVisible(false);
                    histlabo.setEnabled(false);
                    tecp.setVisible(true);
                    tecp.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(false);
                    validarColor();
                    jLabel15.setForeground(Color.red);

                } else if (planinfil.isEnabled()) {

                    planinfil.setVisible(false);
                    planinfil.setEnabled(false);
                    tecp.setVisible(true);
                    tecp.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(false);
                    validarColor();
                    jLabel15.setForeground(Color.red);
                }

            } else //Rutina operacioneeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeees
            if (DatosPrincipales.getTipoExamen().equals("Rutina (operaciones)")) {
                if (daper.isEnabled()) {
                    Date fechavacia = DatoPersonal.fechanaci.getDate();
                    int age = Integer.parseInt(DatosPersonales.getEdad());
                    if (DatosPersonales.getEstrato().equals("-")) {
                        JOptionPane.showMessageDialog(null, "¡Seleccione el estrato del examinado!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else if (age < 17 || age > 70) {
                        JOptionPane.showMessageDialog(null, "¡La edad no se admite!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else if (DatosPersonales.getGenero().equals("-")) {
                        JOptionPane.showMessageDialog(null, "¡El género no ha sido seleccionado!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else if (DatosPrincipales.getMotivoExamen().equals("Procedimiento") && (DatoPersonal.cbxtipoiden.getSelectedItem().equals("Seleccione") || fechavacia == null || DatoPersonal.txtnombre.getText().equals("") || DatoPersonal.txtnoiden.getText().equals("") || DatoPersonal.txtexpedidos.getText().equals("") || DatoPersonal.txtlugarnaci.getText().equals("") || DatoPersonal.txtdireccion.getText().equals("") || DatoPersonal.txtcargoactual.getText().equals("") || DatoPersonal.txtareaactual.getText().equals("") || DatoPersonal.txtpersonasolicitante.getText().equals("") || DatoPersonal.txtcargosolicitante.getText().equals(""))) {

                        JOptionPane.showMessageDialog(null, "¡Debe completar todos los parámetros para registrar los datos!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);

                    } else if (DatosPrincipales.getMotivoExamen().equals("Ascenso") && (DatoPersonal.cbxtipoiden.getSelectedItem().equals("Seleccione") || fechavacia == null || (DatoPersonal.txtnombre.getText().equals("") || "".equals(DatoPersonal.txtnombre.getText())) || (DatoPersonal.txtnoiden.getText().equals("") || "".equals(DatoPersonal.txtnoiden.getText())) || (DatoPersonal.txtexpedidos.getText().equals("") || "".equals(DatoPersonal.txtexpedidos.getText())) || (DatoPersonal.txtlugarnaci.getText().equals("") || "".equals(DatoPersonal.txtlugarnaci.getText())) || (DatoPersonal.txtdireccion.getText().equals("") || "".equals(DatoPersonal.txtdireccion.getText())) || (DatoPersonal.txtcargoaspira.getText().equals("") || "".equals(DatoPersonal.txtcargoaspira.getText())) || (DatoPersonal.txtareaaspira.getText().equals("") || "".equals(DatoPersonal.txtareaaspira.getText())) || (DatoPersonal.txtcargoactual.getText().equals("") || "".equals(DatoPersonal.txtcargoactual.getText())) || (DatoPersonal.txtareaactual.getText().equals("") || "".equals(DatoPersonal.txtareaactual.getText())) || (DatoPersonal.txtpersonasolicitante.getText().equals("") || "".equals(DatoPersonal.txtpersonasolicitante.getText())) || (DatoPersonal.txtcargosolicitante.getText().equals("") || "".equals(DatoPersonal.txtcargosolicitante.getText())))) {

                        JOptionPane.showMessageDialog(null, "¡Debe completar todos los parámetros para registrar los datos!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);

                    } else {

                        nombreExamen();
                        nombreExamen.setText("Nombre examen: " + TecnicaYPreguntas.getNombreExamen());

                        daper.setVisible(false);
                        daper.setEnabled(false);
                        tecp.setVisible(true);
                        tecp.setEnabled(true);
                        DatoGeneral.fechaizquierda.setVisible(true);
                        DatoGeneral.fechaderecha.setVisible(false);
                        validarColor();
                        jLabel15.setForeground(Color.red);

                        if ("Sinconexion".equals(classes.Conexion.importante)) {
                            btnsave.setVisible(true);
                        } else if ("Conconexion".equals(classes.Conexion.importante)) {
                            if ("nuevo".equals(DatosPrincipales.getOpcionExamen())) {
                                dp.update_datosper();
                                DatosPersonales.setColorCategoria("con");
                                DatosPersonales.setValidacionRegistro("registrado");
                            }
                        }
                    }
                } else if (estsalud.isEnabled()) {

                    if (EstadoSalud.getEstado_salud().equals("-") || EstadoSalud.getEstado_salud().equals("")) {
                        JOptionPane.showMessageDialog(null, "¡Debe elegir el estado de salud para continuar!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else if (EstadoSalud.getProb_salud().equals("-") || EstadoSalud.getProb_salud().equals("")) {
                        JOptionPane.showMessageDialog(null, "¡Debe completar todos los parámetros para continuar con el examen!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else {
                        estsalud.setVisible(false);
                        estsalud.setEnabled(false);
                        tecp.setVisible(true);
                        tecp.setEnabled(true);
                        DatoGeneral.fechaizquierda.setVisible(true);
                        DatoGeneral.fechaderecha.setVisible(false);
                        validarColor();
                        jLabel15.setForeground(Color.red);

                        if ("Sinconexion".equals(classes.Conexion.importante)) {

                        } else if ("Conconexion".equals(classes.Conexion.importante)) {
                            if ("nuevo".equals(DatosPrincipales.getOpcionExamen())) {
                                es.update_estadosalud();
                                es.validarestadosalud();
                                EstadoSalud.setColorCategoria("con");
                            }
                        }
                    }

                } else if (inforfami.isEnabled()) {

                    inforfami.setVisible(false);
                    inforfami.setEnabled(false);
                    tecp.setVisible(true);
                    tecp.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(false);
                    validarColor();
                    jLabel15.setForeground(Color.red);

                } else if (infoaca.isEnabled()) {

                    infoaca.setVisible(false);
                    infoaca.setEnabled(false);
                    tecp.setVisible(true);
                    tecp.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(false);
                    validarColor();
                    jLabel15.setForeground(Color.red);

                } else if (infofinan.isEnabled()) {

                    infofinan.setVisible(false);
                    infofinan.setEnabled(false);
                    tecp.setVisible(true);
                    tecp.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(false);
                    validarColor();
                    jLabel15.setForeground(Color.red);

                } else if (casino.isEnabled()) {

                    casino.setVisible(false);
                    casino.setEnabled(false);
                    tecp.setVisible(true);
                    tecp.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(false);
                    validarColor();

                } else if (consbebidas.isEnabled()) {

                    consustan.ValidacionTipoExamen();
                    consbebidas.setVisible(false);
                    consbebidas.setEnabled(false);
                    tecp.setVisible(true);
                    tecp.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(false);
                    validarColor();
                    jLabel15.setForeground(Color.red);

                } else if (consustan.isEnabled()) {

                    consustan.setVisible(false);
                    consustan.setEnabled(false);
                    tecp.setVisible(true);
                    tecp.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(false);
                    validarColor();
                    jLabel15.setForeground(Color.red);

                } else if (antece.isEnabled()) {

                    antece.setVisible(false);
                    antece.setEnabled(false);
                    tecp.setVisible(true);
                    tecp.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(false);
                    validarColor();
                    jLabel15.setForeground(Color.red);

                } else if (vinculos.isEnabled()) {

                    vinculos.setVisible(false);
                    vinculos.setEnabled(false);
                    falsifi.ValidacionTipoExamen();
                    tecp.setVisible(true);
                    tecp.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(false);
                    validarColor();
                    jLabel15.setForeground(Color.red);

                } else if (falsifi.isEnabled()) {

                    falsifi.setVisible(false);
                    falsifi.setEnabled(false);
//                        tecp.ValidacionTipoExamen();
                    tecp.setVisible(true);
                    tecp.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(false);
                    validarColor();
                    jLabel15.setForeground(Color.red);
                }
            } else //Rutina administrativooooooooooooooooooooooooooooooooooooooooooooooos
            if (DatosPrincipales.getTipoExamen().equals("Rutina (admitivos)")) {

                if (daper.isEnabled()) {
                    Date fechavacia = DatoPersonal.fechanaci.getDate();
                    int age = Integer.parseInt(DatosPersonales.getEdad());
                    if (DatosPersonales.getEstrato().equals("-")) {
                        JOptionPane.showMessageDialog(null, "¡Seleccione el estrato del examinado!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else if (age < 17 || age > 70) {
                        JOptionPane.showMessageDialog(null, "¡La edad no se admite!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else if (DatosPersonales.getGenero().equals("-")) {
                        JOptionPane.showMessageDialog(null, "¡El género no ha sido seleccionado!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else {
                        if (DatosPrincipales.getMotivoExamen().equals("Procedimiento")) {
                            if (DatoPersonal.cbxtipoiden.getSelectedItem().equals("Seleccione") || fechavacia == null || DatoPersonal.txtnombre.getText().equals("") || DatoPersonal.txtnoiden.getText().equals("") || DatoPersonal.txtexpedidos.getText().equals("") || DatoPersonal.txtlugarnaci.getText().equals("") || DatoPersonal.txtdireccion.getText().equals("") || DatoPersonal.txtcargoactual.getText().equals("") || DatoPersonal.txtareaactual.getText().equals("") || DatoPersonal.txtpersonasolicitante.getText().equals("") || DatoPersonal.txtcargosolicitante.getText().equals("")) {
                                JOptionPane.showMessageDialog(null, "¡Debe completar todos los parámetros para registrar los datos!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                            }
                        } else if (DatosPrincipales.getMotivoExamen().equals("Ascenso")) {
                            if (DatoPersonal.cbxtipoiden.getSelectedItem().equals("Seleccione") || fechavacia == null || (DatoPersonal.txtnombre.getText().equals("") || "".equals(DatoPersonal.txtnombre.getText())) || (DatoPersonal.txtnoiden.getText().equals("") || "".equals(DatoPersonal.txtnoiden.getText())) || (DatoPersonal.txtexpedidos.getText().equals("") || "".equals(DatoPersonal.txtexpedidos.getText())) || (DatoPersonal.txtlugarnaci.getText().equals("") || "".equals(DatoPersonal.txtlugarnaci.getText())) || (DatoPersonal.txtdireccion.getText().equals("") || "".equals(DatoPersonal.txtdireccion.getText())) || (DatoPersonal.txtcargoaspira.getText().equals("") || "".equals(DatoPersonal.txtcargoaspira.getText())) || (DatoPersonal.txtareaaspira.getText().equals("") || "".equals(DatoPersonal.txtareaaspira.getText())) || (DatoPersonal.txtcargoactual.getText().equals("") || "".equals(DatoPersonal.txtcargoactual.getText())) || (DatoPersonal.txtareaactual.getText().equals("") || "".equals(DatoPersonal.txtareaactual.getText())) || (DatoPersonal.txtpersonasolicitante.getText().equals("") || "".equals(DatoPersonal.txtpersonasolicitante.getText())) || (DatoPersonal.txtcargosolicitante.getText().equals("") || "".equals(DatoPersonal.txtcargosolicitante.getText()))) {
                                JOptionPane.showMessageDialog(null, "¡Debe completar todos los parámetros para registrar los datos!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                            }
                        }
                        nombreExamen();
                        nombreExamen.setText("Nombre examen: " + TecnicaYPreguntas.getNombreExamen());
                        daper.setVisible(false);
                        daper.setEnabled(false);
                        tecp.setVisible(true);
                        tecp.setEnabled(true);
                        DatoGeneral.fechaizquierda.setVisible(true);
                        DatoGeneral.fechaderecha.setVisible(false);
                        validarColor();
                        jLabel15.setForeground(Color.red);

                        if ("Sinconexion".equals(classes.Conexion.importante)) {
                            btnsave.setVisible(true);
                        } else if ("Conconexion".equals(classes.Conexion.importante)) {
                            if ("nuevo".equals(DatosPrincipales.getOpcionExamen())) {
                                dp.update_datosper();
                                DatosPersonales.setColorCategoria("con");
                                DatosPersonales.setValidacionRegistro("registrado");
                            }
                        }
                    }
                } else if (estsalud.isEnabled()) {

                    if (EstadoSalud.getEstado_salud().equals("-") || EstadoSalud.getEstado_salud().equals("")) {
                        JOptionPane.showMessageDialog(null, "¡Debe elegir el estado de salud para continuar!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else if (EstadoSalud.getProb_salud().equals("-") || EstadoSalud.getProb_salud().equals("")) {
                        JOptionPane.showMessageDialog(null, "¡Debe completar todos los parámetros para continuar con el examen!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else {
                        estsalud.setVisible(false);
                        estsalud.setEnabled(false);
                        tecp.setVisible(true);
                        tecp.setEnabled(true);
                        DatoGeneral.fechaizquierda.setVisible(true);
                        DatoGeneral.fechaderecha.setVisible(false);
                        validarColor();
                        jLabel15.setForeground(Color.red);
                        if ("Sinconexion".equals(classes.Conexion.importante)) {

                        } else if ("Conconexion".equals(classes.Conexion.importante)) {
                            if ("nuevo".equals(DatosPrincipales.getOpcionExamen())) {
                                es.update_estadosalud();
                                es.validarestadosalud();
                                EstadoSalud.setColorCategoria("con");
                            }
                        }
                    }

                } else if (inforfami.isEnabled()) {

                    inforfami.setVisible(false);
                    inforfami.setEnabled(false);
                    tecp.setVisible(true);
                    tecp.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(false);
                    validarColor();
                    jLabel15.setForeground(Color.red);

                } else if (infoaca.isEnabled()) {

                    infoaca.setVisible(false);
                    infoaca.setEnabled(false);
                    tecp.setVisible(true);
                    tecp.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(false);
                    validarColor();
                    jLabel15.setForeground(Color.red);

                } else if (infofinan.isEnabled()) {

                    infofinan.setVisible(false);
                    infofinan.setEnabled(false);
                    tecp.setVisible(true);
                    tecp.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(false);
                    validarColor();
                    jLabel15.setForeground(Color.red);

                } else if (casino.isEnabled()) {

                    casino.setVisible(false);
                    casino.setEnabled(false);
                    tecp.setVisible(true);
                    tecp.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(false);
                    validarColor();
                    jLabel15.setForeground(Color.red);

                } else if (consbebidas.isEnabled()) {

                    consustan.ValidacionTipoExamen();
                    consbebidas.setVisible(false);
                    consbebidas.setEnabled(false);
                    tecp.setVisible(true);
                    tecp.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(false);
                    validarColor();
                    jLabel15.setForeground(Color.red);

                } else if (consustan.isEnabled()) {

                    consustan.setVisible(false);
                    consustan.setEnabled(false);
                    tecp.setVisible(true);
                    tecp.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(false);
                    validarColor();
                    jLabel15.setForeground(Color.red);

                } else if (antece.isEnabled()) {

                    antece.setVisible(false);
                    antece.setEnabled(false);
                    tecp.setVisible(true);
                    tecp.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(false);
                    validarColor();
                    jLabel15.setForeground(Color.red);

                } else if (vinculos.isEnabled()) {

                    vinculos.setVisible(false);
                    vinculos.setEnabled(false);
                    falsifi.ValidacionTipoExamen();
                    tecp.setVisible(true);
                    tecp.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(false);
                    validarColor();
                    jLabel15.setForeground(Color.red);

                } else if (falsifi.isEnabled()) {

                    falsifi.setVisible(false);
                    falsifi.setEnabled(false);
                    histlabo.ValidacionTipoExamen();
                    tecp.setVisible(true);
                    tecp.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(false);
                    validarColor();
                    jLabel15.setForeground(Color.red);

                } else if (histlabo.isEnabled()) {

                    histlabo.setVisible(false);
                    histlabo.setEnabled(false);
                    tecp.setVisible(true);
                    tecp.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(false);
                    validarColor();
                    jLabel15.setForeground(Color.red);

                } else if (planinfil.isEnabled()) {

                    planinfil.setVisible(false);
                    planinfil.setEnabled(false);
                    tecp.setVisible(true);
                    tecp.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(false);
                    validarColor();
                    jLabel15.setForeground(Color.red);
                }
            } else //Especificooooooooooooooooooooooooooooooooooooooooooo
            if (DatosPrincipales.getTipoExamen().equals("Específico")) {
                if (daper.isEnabled()) {
                    Date fechavacia = DatoPersonal.fechanaci.getDate();
                    int age = Integer.parseInt(DatosPersonales.getEdad());
                    if (DatosPersonales.getEstrato().equals("-")) {
                        JOptionPane.showMessageDialog(null, "¡Seleccione el estrato del examinado!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else if (age < 17 || age > 70) {
                        JOptionPane.showMessageDialog(null, "¡La edad no se admite!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else if (DatoPersonal.cbxtipoiden.getSelectedItem().equals("Seleccione") || fechavacia == null || (DatoPersonal.txtnombre.getText().equals("") || "".equals(DatoPersonal.txtnombre.getText())) || (DatoPersonal.txtnoiden.getText().equals("") || "".equals(DatoPersonal.txtnoiden.getText())) || (DatoPersonal.txtexpedidos.getText().equals("") || "".equals(DatoPersonal.txtexpedidos.getText())) || (DatoPersonal.txtlugarnaci.getText().equals("") || "".equals(DatoPersonal.txtlugarnaci.getText())) || (DatoPersonal.txtdireccion.getText().equals("") || "".equals(DatoPersonal.txtdireccion.getText())) || (DatoPersonal.txtpersonasolicitante.getText().equals("") || "".equals(DatoPersonal.txtpersonasolicitante.getText())) || (DatoPersonal.txtcargosolicitante.getText().equals("") || "".equals(DatoPersonal.txtcargosolicitante.getText())) || (DatoPersonal.txtareaactual.getText().equals("") || "".equals(DatoPersonal.txtareaactual.getText())) || (DatoPersonal.txtcargoactual.getText().equals("") || "".equals(DatoPersonal.txtcargoactual.getText()))) {
                        JOptionPane.showMessageDialog(null, "¡Debe completar todos los parámetros para registrar los datos!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else if (DatosPersonales.getGenero().equals("-") || DatosPersonales.getGenero().equals("") || DatosPersonales.getGenero() == null) {
                        JOptionPane.showMessageDialog(null, "¡El género no ha sido seleccionado!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else {

                        nombreExamen();
                        nombreExamen.setText("Nombre examen: " + TecnicaYPreguntas.getNombreExamen());
                        daper.setVisible(false);
                        daper.setEnabled(false);
                        tecp.setVisible(true);
                        tecp.setEnabled(true);
                        DatoGeneral.fechaizquierda.setVisible(true);
                        DatoGeneral.fechaderecha.setVisible(false);
                        validarColor();
                        jLabel15.setForeground(Color.red);

                        if ("Sinconexion".equals(classes.Conexion.importante)) {
                            btnsave.setVisible(true);
                        } else if ("Conconexion".equals(classes.Conexion.importante)) {
                            if ("nuevo".equals(DatosPrincipales.getOpcionExamen())) {
                                dp.update_datosper();
                                DatosPersonales.setColorCategoria("con");
                                DatosPersonales.setValidacionRegistro("registrado");
                            }
                        }
                    }
                } else if (estsalud.isEnabled()) {

                    if (EstadoSalud.getEstado_salud().equals("-") || EstadoSalud.getEstado_salud().equals("")) {
                        JOptionPane.showMessageDialog(null, "¡Debe elegir el estado de salud para continuar!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else if (EstadoSalud.getProb_salud().equals("-") || EstadoSalud.getProb_salud().equals("")) {
                        JOptionPane.showMessageDialog(null, "¡Debe completar todos los parámetros para continuar con el examen!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE, iconError);
                    } else {
                        estsalud.setVisible(false);
                        estsalud.setEnabled(false);
                        tecp.setVisible(true);
                        tecp.setEnabled(true);
                        DatoGeneral.fechaizquierda.setVisible(true);
                        DatoGeneral.fechaderecha.setVisible(false);
                        validarColor();
                        jLabel15.setForeground(Color.red);

                        if ("Sinconexion".equals(classes.Conexion.importante)) {

                        } else if ("Conconexion".equals(classes.Conexion.importante)) {
                            if ("nuevo".equals(DatosPrincipales.getOpcionExamen())) {
                                es.update_estadosalud();
                                es.validarestadosalud();
                                EstadoSalud.setColorCategoria("con");
                            }
                        }
                    }

                } else if (inforfami.isEnabled()) {

                    inforfami.setVisible(false);
                    inforfami.setEnabled(false);
                    tecp.setVisible(true);
                    tecp.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(false);
                    validarColor();
                    jLabel15.setForeground(Color.red);

                } else if (infoaca.isEnabled()) {

                    infoaca.setVisible(false);
                    infoaca.setEnabled(false);
                    tecp.setVisible(true);
                    tecp.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(false);
                    validarColor();
                    jLabel15.setForeground(Color.red);

                } else if (infofinan.isEnabled()) {

                    infofinan.setVisible(false);
                    infofinan.setEnabled(false);
                    tecp.setVisible(true);
                    tecp.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(false);
                    validarColor();
                    jLabel15.setForeground(Color.red);

                } else if (consbebidas.isEnabled()) {

                    consustan.ValidacionTipoExamen();
                    consbebidas.setVisible(false);
                    consbebidas.setEnabled(false);
                    tecp.setVisible(true);
                    tecp.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(false);
                    validarColor();
                    jLabel15.setForeground(Color.red);

                } else if (consustan.isEnabled()) {

                    consustan.setVisible(false);
                    consustan.setEnabled(false);
                    tecp.setVisible(true);
                    tecp.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(false);
                    validarColor();
                    jLabel15.setForeground(Color.red);

                } else if (antece.isEnabled()) {

                    antece.setVisible(false);
                    antece.setEnabled(false);
                    tecp.setVisible(true);
                    tecp.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(false);
                    validarColor();
                    jLabel15.setForeground(Color.red);

                } else if (vinculos.isEnabled()) {

                    vinculos.setVisible(false);
                    vinculos.setEnabled(false);
                    tecp.setVisible(true);
                    tecp.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(false);
                    validarColor();
                    jLabel15.setForeground(Color.red);

                } else if (temain.isEnabled()) {

                    temain.setVisible(false);
                    temain.setEnabled(false);
                    tecp.setVisible(true);
                    tecp.setEnabled(true);
                    DatoGeneral.fechaizquierda.setVisible(true);
                    DatoGeneral.fechaderecha.setVisible(false);
                    validarColor();
                    jLabel15.setForeground(Color.red);

                    if ("Sinconexion".equals(classes.Conexion.importante)) {

                    } else if ("Conconexion".equals(classes.Conexion.importante)) {
                        if ("nuevo".equals(DatosPrincipales.getOpcionExamen())) {
                            pi.update_planesinfil();
                            PlanesInfiltracion.setColorCategoria("con");
                        }
                    }
                }
            }
        }
    }//GEN-LAST:event_jLabel15MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton btnTerminar;
    private javax.swing.JPanel btncancelar;
    private javax.swing.JPanel btndescargarexamen;
    public static javax.swing.JPanel btneditar;
    public static javax.swing.JPanel btnsave;
    public static javax.swing.JLabel fechaderecha;
    public static javax.swing.JLabel fechaizquierda;
    public javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    public static javax.swing.JLabel jLabel10;
    public static javax.swing.JLabel jLabel11;
    public static javax.swing.JLabel jLabel12;
    public static javax.swing.JLabel jLabel13;
    public static javax.swing.JLabel jLabel14;
    public static javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    public static javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    public static javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    public static javax.swing.JLabel jLabel3;
    public static javax.swing.JLabel jLabel4;
    public static javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel58;
    public static javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel68;
    public static javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    public static javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    public static javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    public static javax.swing.JPanel jPanel21;
    private javax.swing.JLabel nombreExamen;
    public static javax.swing.JDesktopPane paratodo;
    public static javax.swing.JLabel tituloexamenpre;
    // End of variables declaration//GEN-END:variables
}
