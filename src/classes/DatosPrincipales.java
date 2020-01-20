package classes;

import icons.Close;
import icons.Happier;
import icons.Location;
import icons.Noti1;
import icons.Noti2;
import java.awt.Color;
import view.DatoGeneral;

/**
 *
 * @author Kevin Casas
 */
public class DatosPrincipales {

    private static String nombreUsuario = "";
    private static String rolUsuario = "";
    private static String contraUsuario = "";
    private static String ccmsUsuario = "";
    private static String siteExamen = "";
    private static String ciudadExamen = "";
    private static String direccionExamen = "";
    private static String opcionExamen = "";
    private static String tipoExamen = "ninguno";
    private static String motivoExamen = "";
    private static String nombreExaminado = "";
    private static String tipoIdenExaminado = "";
    private static String noIdenExaminado = "";
    private static String nombreSolicitante = "";
    private static String cargoSolicitante = "";

    public static String getCcmsUsuario() {
        return ccmsUsuario;
    }

    public static void setCcmsUsuario(String ccmsUsuario) {
        DatosPrincipales.ccmsUsuario = ccmsUsuario;
    }

    public static String getContraUsuario() {
        return contraUsuario;
    }

    public static void setContraUsuario(String contraUsuario) {
        DatosPrincipales.contraUsuario = contraUsuario;
    }

    public static String getTipoExamen() {
        return tipoExamen;
    }

    public static void setTipoExamen(String tipoExamen) {
        DatosPrincipales.tipoExamen = tipoExamen;
    }

    public static String getMotivoExamen() {
        return motivoExamen;
    }

    public static void setMotivoExamen(String motivoExamen) {
        DatosPrincipales.motivoExamen = motivoExamen;
    }

    public static String getNombreExaminado() {
        return nombreExaminado;
    }

    public static void setNombreExaminado(String nombreExaminado) {
        DatosPrincipales.nombreExaminado = nombreExaminado;
    }

    public static String getTipoIdenExaminado() {
        return tipoIdenExaminado;
    }

    public static void setTipoIdenExaminado(String tipoIdenExaminado) {
        DatosPrincipales.tipoIdenExaminado = tipoIdenExaminado;
    }

    public static String getNoIdenExaminado() {
        return noIdenExaminado;
    }

    public static void setNoIdenExaminado(String noIdenExaminado) {
        DatosPrincipales.noIdenExaminado = noIdenExaminado;
    }

    public static String getNombreSolicitante() {
        return nombreSolicitante;
    }

    public static void setNombreSolicitante(String nombreSolicitante) {
        DatosPrincipales.nombreSolicitante = nombreSolicitante;
    }

    public static String getCargoSolicitante() {
        return cargoSolicitante;
    }

    public static void setCargoSolicitante(String cargoSolicitante) {
        DatosPrincipales.cargoSolicitante = cargoSolicitante;
    }

    public static String getNombreUsuario() {
        return nombreUsuario;
    }

    public static void setNombreUsuario(String nombreUsuario) {
        DatosPrincipales.nombreUsuario = nombreUsuario;
    }

    public static String getRolUsuario() {
        return rolUsuario;
    }

    public static void setRolUsuario(String rolUsuario) {
        DatosPrincipales.rolUsuario = rolUsuario;
    }

    public static String getSiteExamen() {
        return siteExamen;
    }

    public static void setSiteExamen(String siteExamen) {
        DatosPrincipales.siteExamen = siteExamen;
    }

    public static String getCiudadExamen() {
        return ciudadExamen;
    }

    public static void setCiudadExamen(String ciudadExamen) {
        DatosPrincipales.ciudadExamen = ciudadExamen;
    }

    public static String getDireccionExamen() {
        return direccionExamen;
    }

    public static void setDireccionExamen(String direccionExamen) {
        DatosPrincipales.direccionExamen = direccionExamen;
    }

    public static String getOpcionExamen() {
        return opcionExamen;
    }

    public static void setOpcionExamen(String opcionExamen) {
        DatosPrincipales.opcionExamen = opcionExamen;
    }

    Close iconClose = new Close();
    Happier iconHappy = new Happier();
    Location iconLocation = new Location();
    Noti1 iconNoti1 = new Noti1();
    Noti2 iconNoti2 = new Noti2();
    static int contador_notifi = 0;

    public void limpiar() {
        nombreUsuario = "";
        rolUsuario = "";
        contraUsuario = "";
        ccmsUsuario = "";
        siteExamen = "";
        ciudadExamen = "";
        direccionExamen = "";
        opcionExamen = "";
        tipoExamen = "ninguno";
        motivoExamen = "";
        nombreExaminado = "";
        tipoIdenExaminado = "";
        noIdenExaminado = "";
        nombreSolicitante = "";
        cargoSolicitante = "";
    }

}
