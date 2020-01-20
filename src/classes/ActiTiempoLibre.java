package classes;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Kevin Casas
 */
public class ActiTiempoLibre {

    private static String actividadTL1 = "";
    private static String actividadTL2 = "-";
    private static String actividadTL3 = "";
    private static String actividadTL4 = "-";
    private static String actividadTL5 = "";
    private static String actividadTL6 = "-";
    private static String actividadTL7 = "";
    private static String actividadTL8 = "-";
    private static String actividadTL9 = "";
    private static String admisionActiTiempoLibre = "";
    private static String colorCategoria = "sincolor";

    public static String getColorCategoria() {
        return colorCategoria;
    }

    public static void setColorCategoria(String colorCategoria) {
        ActiTiempoLibre.colorCategoria = colorCategoria;
    }

    public static String getAdmisionActiTiempoLibre() {
        return admisionActiTiempoLibre;
    }

    public static void setAdmisionActiTiempoLibre(String admisionActiTiempoLibre) {
        ActiTiempoLibre.admisionActiTiempoLibre = admisionActiTiempoLibre;
    }

    public static String getActividadTL1() {
        return actividadTL1;
    }

    public static void setActividadTL1(String actividadTL1) {
        ActiTiempoLibre.actividadTL1 = actividadTL1;
    }

    public static String getActividadTL2() {
        return actividadTL2;
    }

    public static void setActividadTL2(String actividadTL2) {
        ActiTiempoLibre.actividadTL2 = actividadTL2;
    }

    public static String getActividadTL3() {
        return actividadTL3;
    }

    public static void setActividadTL3(String actividadTL3) {
        ActiTiempoLibre.actividadTL3 = actividadTL3;
    }

    public static String getActividadTL4() {
        return actividadTL4;
    }

    public static void setActividadTL4(String actividadTL4) {
        ActiTiempoLibre.actividadTL4 = actividadTL4;
    }

    public static String getActividadTL5() {
        return actividadTL5;
    }

    public static void setActividadTL5(String actividadTL5) {
        ActiTiempoLibre.actividadTL5 = actividadTL5;
    }

    public static String getActividadTL6() {
        return actividadTL6;
    }

    public static void setActividadTL6(String actividadTL6) {
        ActiTiempoLibre.actividadTL6 = actividadTL6;
    }

    public static String getActividadTL7() {
        return actividadTL7;
    }

    public static void setActividadTL7(String actividadTL7) {
        ActiTiempoLibre.actividadTL7 = actividadTL7;
    }

    public static String getActividadTL8() {
        return actividadTL8;
    }

    public static void setActividadTL8(String actividadTL8) {
        ActiTiempoLibre.actividadTL8 = actividadTL8;
    }

    public static String getActividadTL9() {
        return actividadTL9;
    }

    public static void setActividadTL9(String actividadTL9) {
        ActiTiempoLibre.actividadTL9 = actividadTL9;
    }

    public void update_consujuegos() {

        try {

            PreparedStatement sql = Conexion.connection.prepareStatement("UPDATE datos_generales_poli "
                    + "SET juegpg1 = '" + actividadTL1 + "',"
                    + " juegpg2 = '" + actividadTL2 + "', expjuegpg2 = '" + actividadTL3 + "',"
                    + "juegpg3 = '" + actividadTL4 + "', expjuegpg3 = '" + actividadTL5 + "', "
                    + "juegpg4 = '" + actividadTL6 + "', expjuegpg4 = '" + actividadTL7 + "', "
                    + "juegpg5 = '" + actividadTL8 + "', expjuegpg5 = '" + actividadTL9 + "'  WHERE no_id = " + DatosPrincipales.getNoIdenExaminado());
            sql.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "¡Error en el ingreso de datos a la base!\nPor favor solicite ayuda al equipo de desarrollo" + e);
        }
    }

    public void limpiar() {
        actividadTL1 = "";
        actividadTL2 = "-";
        actividadTL3 = "";
        actividadTL4 = "-";
        actividadTL5 = "";
        actividadTL6 = "-";
        actividadTL7 = "";
        actividadTL8 = "-";
        actividadTL9 = "";
        admisionActiTiempoLibre = "";
        colorCategoria = "sincolor";
    }

}
