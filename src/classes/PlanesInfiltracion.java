package classes;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import static view.DatoPersonal.txtnoiden;

/**
 *
 * @author Kevin Casas
 */
public class PlanesInfiltracion {

    private static String planinfilpre1 = "-";
    private static String planinfilpre2 = "-";
    private static String planinfilpre3 = "-";
    private static String planinfilpre4 = "-";
    private static String expplaninfilpre1 = "";
    private static String expplaninfilpre2 = "";
    private static String expplaninfilpre3 = "";
    private static String expplaninfilpre4 = "";
    private static String comoseentero = "-";
    private static String admisionesPlanesInfiltracion = "";
    private static String colorCategoria = "sincolor";

    public static String getColorCategoria() {
        return colorCategoria;
    }

    public static void setColorCategoria(String colorCategoria) {
        PlanesInfiltracion.colorCategoria = colorCategoria;
    }

    public static String getAdmisionesPlanesInfiltracion() {
        return admisionesPlanesInfiltracion;
    }

    public static void setAdmisionesPlanesInfiltracion(String admisionesPlanesInfiltracion) {
        PlanesInfiltracion.admisionesPlanesInfiltracion = admisionesPlanesInfiltracion;
    }

    public static String getPlaninfilpre1() {
        return planinfilpre1;
    }

    public static void setPlaninfilpre1(String planinfilpre1) {
        PlanesInfiltracion.planinfilpre1 = planinfilpre1;
    }

    public static String getPlaninfilpre2() {
        return planinfilpre2;
    }

    public static void setPlaninfilpre2(String planinfilpre2) {
        PlanesInfiltracion.planinfilpre2 = planinfilpre2;
    }

    public static String getPlaninfilpre3() {
        return planinfilpre3;
    }

    public static void setPlaninfilpre3(String planinfilpre3) {
        PlanesInfiltracion.planinfilpre3 = planinfilpre3;
    }

    public static String getPlaninfilpre4() {
        return planinfilpre4;
    }

    public static void setPlaninfilpre4(String planinfilpre4) {
        PlanesInfiltracion.planinfilpre4 = planinfilpre4;
    }

    public static String getExpplaninfilpre1() {
        return expplaninfilpre1;
    }

    public static void setExpplaninfilpre1(String expplaninfilpre1) {
        PlanesInfiltracion.expplaninfilpre1 = expplaninfilpre1;
    }

    public static String getExpplaninfilpre2() {
        return expplaninfilpre2;
    }

    public static void setExpplaninfilpre2(String expplaninfilpre2) {
        PlanesInfiltracion.expplaninfilpre2 = expplaninfilpre2;
    }

    public static String getExpplaninfilpre3() {
        return expplaninfilpre3;
    }

    public static void setExpplaninfilpre3(String expplaninfilpre3) {
        PlanesInfiltracion.expplaninfilpre3 = expplaninfilpre3;
    }

    public static String getExpplaninfilpre4() {
        return expplaninfilpre4;
    }

    public static void setExpplaninfilpre4(String expplaninfilpre4) {
        PlanesInfiltracion.expplaninfilpre4 = expplaninfilpre4;
    }

    public static String getComoseentero() {
        return comoseentero;
    }

    public static void setComoseentero(String comoseentero) {
        PlanesInfiltracion.comoseentero = comoseentero;
    }

    public void update_planesinfil() {
        try {
            PreparedStatement sql = Conexion.connection.prepareStatement("UPDATE datos_generales_poli "
                    + "SET planinfilpre1 = '" + planinfilpre1 + "', expplaninfilpre1 = '" + expplaninfilpre1 + "',"
                    + "planinfilpre2 = '" + planinfilpre2 + "', expplaninfilpre2 = '" + expplaninfilpre2 + "',"
                    + "planinfilpre3 = '" + planinfilpre3 + "', expplaninfilpre3 = '" + expplaninfilpre3 + "',"
                    + "planinfilpre4 = '" + planinfilpre4 + "', expplaninfilpre4 = '" + expplaninfilpre4 + "',"
                    + " comoseentero  = '" + comoseentero + "'  WHERE no_id = " + txtnoiden.getText());
            sql.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "¡Error en el ingreso de datos a la base!\nPor favor solicite ayuda al equipo de desarrollo" + e);
        }
    }

    public void limpiar() {
        planinfilpre1 = "-";
        planinfilpre2 = "-";
        planinfilpre3 = "-";
        planinfilpre4 = "-";
        expplaninfilpre1 = "";
        expplaninfilpre2 = "";
        expplaninfilpre3 = "";
        expplaninfilpre4 = "";
        comoseentero = "-";
        admisionesPlanesInfiltracion = "";
        colorCategoria = "sincolor";
    }

}
