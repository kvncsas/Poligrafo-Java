package classes;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import static view.DatoPersonal.txtnoiden;

/**
 *
 * @author Kevin Casas
 */
public class ConsumoBebidas {

    private static String pg1 = "-";
    private static String pg2 = "-";
    private static String pg3 = "-";
    private static String pg4 = "-";
    private static String pg5 = "-";
    private static String pg6 = "-";
    private static String pg7 = "-";
    private static String pg8 = "-";
    private static String pg9 = "-";
    private static String rpg1 = "";
    private static String rpg2 = "";
    private static String rpg3 = "";
    private static String rpg4 = "";
    private static String rpg5 = "";
    private static String rpg6 = "";
    private static String rpg7 = "";
    private static String rpg8 = "";
    private static String rpg9 = "";
    private static String con_bebidas = "-";
    private static String frecuencia_bebi = "";
    private static String tipo_bebida = "";
    private static String cantidad_oca = "";
    private static String lastvez_consumo = "";
    private static String admisionConsumoBebidas = "";
    private static String colorCategoria = "sincolor";

    public static String getColorCategoria() {
        return colorCategoria;
    }

    public static void setColorCategoria(String colorCategoria) {
        ConsumoBebidas.colorCategoria = colorCategoria;
    }

    public static String getAdmisionConsumoBebidas() {
        return admisionConsumoBebidas;
    }

    public static void setAdmisionConsumoBebidas(String admisionConsumoBebidas) {
        ConsumoBebidas.admisionConsumoBebidas = admisionConsumoBebidas;
    }

    public static String getPg1() {
        return pg1;
    }

    public static void setPg1(String pg1) {
        ConsumoBebidas.pg1 = pg1;
    }

    public static String getPg2() {
        return pg2;
    }

    public static void setPg2(String pg2) {
        ConsumoBebidas.pg2 = pg2;
    }

    public static String getPg3() {
        return pg3;
    }

    public static void setPg3(String pg3) {
        ConsumoBebidas.pg3 = pg3;
    }

    public static String getPg4() {
        return pg4;
    }

    public static void setPg4(String pg4) {
        ConsumoBebidas.pg4 = pg4;
    }

    public static String getPg5() {
        return pg5;
    }

    public static void setPg5(String pg5) {
        ConsumoBebidas.pg5 = pg5;
    }

    public static String getPg6() {
        return pg6;
    }

    public static void setPg6(String pg6) {
        ConsumoBebidas.pg6 = pg6;
    }

    public static String getPg7() {
        return pg7;
    }

    public static void setPg7(String pg7) {
        ConsumoBebidas.pg7 = pg7;
    }

    public static String getPg8() {
        return pg8;
    }

    public static void setPg8(String pg8) {
        ConsumoBebidas.pg8 = pg8;
    }

    public static String getPg9() {
        return pg9;
    }

    public static void setPg9(String pg9) {
        ConsumoBebidas.pg9 = pg9;
    }

    public static String getRpg1() {
        return rpg1;
    }

    public static void setRpg1(String rpg1) {
        ConsumoBebidas.rpg1 = rpg1;
    }

    public static String getRpg2() {
        return rpg2;
    }

    public static void setRpg2(String rpg2) {
        ConsumoBebidas.rpg2 = rpg2;
    }

    public static String getRpg3() {
        return rpg3;
    }

    public static void setRpg3(String rpg3) {
        ConsumoBebidas.rpg3 = rpg3;
    }

    public static String getRpg4() {
        return rpg4;
    }

    public static void setRpg4(String rpg4) {
        ConsumoBebidas.rpg4 = rpg4;
    }

    public static String getRpg5() {
        return rpg5;
    }

    public static void setRpg5(String rpg5) {
        ConsumoBebidas.rpg5 = rpg5;
    }

    public static String getRpg6() {
        return rpg6;
    }

    public static void setRpg6(String rpg6) {
        ConsumoBebidas.rpg6 = rpg6;
    }

    public static String getRpg7() {
        return rpg7;
    }

    public static void setRpg7(String rpg7) {
        ConsumoBebidas.rpg7 = rpg7;
    }

    public static String getRpg8() {
        return rpg8;
    }

    public static void setRpg8(String rpg8) {
        ConsumoBebidas.rpg8 = rpg8;
    }

    public static String getRpg9() {
        return rpg9;
    }

    public static void setRpg9(String rpg9) {
        ConsumoBebidas.rpg9 = rpg9;
    }

    public static String getCon_bebidas() {
        return con_bebidas;
    }

    public static void setCon_bebidas(String con_bebidas) {
        ConsumoBebidas.con_bebidas = con_bebidas;
    }

    public static String getFrecuencia_bebi() {
        return frecuencia_bebi;
    }

    public static void setFrecuencia_bebi(String frecuencia_bebi) {
        ConsumoBebidas.frecuencia_bebi = frecuencia_bebi;
    }

    public static String getTipo_bebida() {
        return tipo_bebida;
    }

    public static void setTipo_bebida(String tipo_bebida) {
        ConsumoBebidas.tipo_bebida = tipo_bebida;
    }

    public static String getCantidad_oca() {
        return cantidad_oca;
    }

    public static void setCantidad_oca(String cantidad_oca) {
        ConsumoBebidas.cantidad_oca = cantidad_oca;
    }

    public static String getLastvez_consumo() {
        return lastvez_consumo;
    }

    public static void setLastvez_consumo(String lastvez_consumo) {
        ConsumoBebidas.lastvez_consumo = lastvez_consumo;
    }

    public void update_consubebi() {
        try {
            PreparedStatement sql = Conexion.connection.prepareStatement("UPDATE datos_generales_poli "
                    + "SET con_bebidas = '" + con_bebidas + "',frecuencia_bebi = '" + frecuencia_bebi + "',"
                    + " tipo_bebida = '" + tipo_bebida + "', cantidad_oca = '" + cantidad_oca + "', lastvez_consumo = '" + lastvez_consumo + "', "
                    + "bebidaspre1 = '" + pg1 + "', expbebidaspre1 = '" + rpg1 + "', "
                    + "bebidaspre2 = '" + pg2 + "', expbebidaspre2 = '" + rpg2 + "', "
                    + "bebidaspre3 = '" + pg3 + "', expbebidaspre3 = '" + rpg3 + "', "
                    + "bebidaspre4 = '" + pg4 + "', expbebidaspre4 = '" + rpg4 + "', "
                    + "bebidaspre5 = '" + pg5 + "', expbebidaspre5= '" + rpg5 + "', "
                    + "bebidaspre6 = '" + pg6 + "', expbebidaspre6 = '" + rpg6 + "', "
                    + "bebidaspre7 = '" + pg7 + "', expbebidaspre7 = '" + rpg7 + "', "
                    + "bebidaspre8 = '" + pg8 + "', expbebidaspre8 = '" + rpg8 + "', "
                    + "bebidaspre9 = '" + pg9 + "', expbebidaspre9 = '" + rpg9 + "'  WHERE no_id = " + txtnoiden.getText() + "  ");
            sql.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "¡Error en el ingreso de datos a la base!\nPor favor solicite ayuda al equipo de desarrollo" + e);
        }
    }

    public void limpiar() {
        pg1 = "-";
        pg2 = "-";
        pg3 = "-";
        pg4 = "-";
        pg5 = "-";
        pg6 = "-";
        pg7 = "-";
        pg8 = "-";
        pg9 = "-";
        rpg1 = "";
        rpg2 = "";
        rpg3 = "";
        rpg4 = "";
        rpg5 = "";
        rpg6 = "";
        rpg7 = "";
        rpg8 = "";
        rpg9 = "";
        con_bebidas = "-";
        frecuencia_bebi = "";
        tipo_bebida = "";
        cantidad_oca = "";
        lastvez_consumo = "";
        admisionConsumoBebidas = "";
        colorCategoria = "sincolor";
    }

}
