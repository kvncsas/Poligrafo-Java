package classes;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import static view.DatoPersonal.txtnoiden;

/**
 *
 * @author Kevin Casas
 */
public class AntecedentesJudiciales {

    private static String pg1 = "-";
    private static String pg2 = "-";
    private static String pg3 = "-";
    private static String pg4 = "-";
    private static String pg5 = "";
    private static String pg6 = "-";
    private static String pg7 = "-";
    private static String pg8 = "-";
    private static String pg9 = "-";
    private static String pg10 = "-";
    private static String pg11 = "-";
    private static String pg12 = "-";
    private static String rpg1 = "";
    private static String rpg2 = "";
    private static String rpg3 = "";
    private static String rpg4 = "";
    private static String rpg6 = "";
    private static String rpg7 = "";
    private static String rpg8 = "";
    private static String rpg9 = "";
    private static String rpg10 = "";
    private static String rpg11 = "";
    private static String rpg12 = "";
    private static String admisionAntecendentes = "";
    private static String colorCategoria = "sincolor";

    public static String getColorCategoria() {
        return colorCategoria;
    }

    public static void setColorCategoria(String colorCategoria) {
        AntecedentesJudiciales.colorCategoria = colorCategoria;
    }

    public static String getAdmisionAntecendentes() {
        return admisionAntecendentes;
    }

    public static void setAdmisionAntecendentes(String admisionAntecendentes) {
        AntecedentesJudiciales.admisionAntecendentes = admisionAntecendentes;
    }

    public static String getPg1() {
        return pg1;
    }

    public static void setPg1(String pg1) {
        AntecedentesJudiciales.pg1 = pg1;
    }

    public static String getPg2() {
        return pg2;
    }

    public static void setPg2(String pg2) {
        AntecedentesJudiciales.pg2 = pg2;
    }

    public static String getPg3() {
        return pg3;
    }

    public static void setPg3(String pg3) {
        AntecedentesJudiciales.pg3 = pg3;
    }

    public static String getPg4() {
        return pg4;
    }

    public static void setPg4(String pg4) {
        AntecedentesJudiciales.pg4 = pg4;
    }

    public static String getPg5() {
        return pg5;
    }

    public static void setPg5(String pg5) {
        AntecedentesJudiciales.pg5 = pg5;
    }

    public static String getPg6() {
        return pg6;
    }

    public static void setPg6(String pg6) {
        AntecedentesJudiciales.pg6 = pg6;
    }

    public static String getPg7() {
        return pg7;
    }

    public static void setPg7(String pg7) {
        AntecedentesJudiciales.pg7 = pg7;
    }

    public static String getPg8() {
        return pg8;
    }

    public static void setPg8(String pg8) {
        AntecedentesJudiciales.pg8 = pg8;
    }

    public static String getPg9() {
        return pg9;
    }

    public static void setPg9(String pg9) {
        AntecedentesJudiciales.pg9 = pg9;
    }

    public static String getPg10() {
        return pg10;
    }

    public static void setPg10(String pg10) {
        AntecedentesJudiciales.pg10 = pg10;
    }

    public static String getPg11() {
        return pg11;
    }

    public static void setPg11(String pg11) {
        AntecedentesJudiciales.pg11 = pg11;
    }

    public static String getPg12() {
        return pg12;
    }

    public static void setPg12(String pg12) {
        AntecedentesJudiciales.pg12 = pg12;
    }

    public static String getRpg1() {
        return rpg1;
    }

    public static void setRpg1(String rpg1) {
        AntecedentesJudiciales.rpg1 = rpg1;
    }

    public static String getRpg2() {
        return rpg2;
    }

    public static void setRpg2(String rpg2) {
        AntecedentesJudiciales.rpg2 = rpg2;
    }

    public static String getRpg3() {
        return rpg3;
    }

    public static void setRpg3(String rpg3) {
        AntecedentesJudiciales.rpg3 = rpg3;
    }

    public static String getRpg4() {
        return rpg4;
    }

    public static void setRpg4(String rpg4) {
        AntecedentesJudiciales.rpg4 = rpg4;
    }

    public static String getRpg6() {
        return rpg6;
    }

    public static void setRpg6(String rpg6) {
        AntecedentesJudiciales.rpg6 = rpg6;
    }

    public static String getRpg7() {
        return rpg7;
    }

    public static void setRpg7(String rpg7) {
        AntecedentesJudiciales.rpg7 = rpg7;
    }

    public static String getRpg8() {
        return rpg8;
    }

    public static void setRpg8(String rpg8) {
        AntecedentesJudiciales.rpg8 = rpg8;
    }

    public static String getRpg9() {
        return rpg9;
    }

    public static void setRpg9(String rpg9) {
        AntecedentesJudiciales.rpg9 = rpg9;
    }

    public static String getRpg10() {
        return rpg10;
    }

    public static void setRpg10(String rpg10) {
        AntecedentesJudiciales.rpg10 = rpg10;
    }

    public static String getRpg11() {
        return rpg11;
    }

    public static void setRpg11(String rpg11) {
        AntecedentesJudiciales.rpg11 = rpg11;
    }

    public static String getRpg12() {
        return rpg12;
    }

    public static void setRpg12(String rpg12) {
        AntecedentesJudiciales.rpg12 = rpg12;
    }

    public void update_antece() {
        try {
            PreparedStatement sql = Conexion.connection.prepareStatement("UPDATE datos_generales_poli "
                    + "SET antecejupre1 = '" + pg1 + "', expantecejupre1 = '" + rpg1 + "',"
                    + " antecejupre2 = '" + pg2 + "', expantecejupre2 = '" + rpg2 + "',"
                    + "antecejupre3 = '" + pg3 + "', expantecejupre3 = '" + rpg3 + "', "
                    + "antecejupre4 = '" + pg4 + "', expantecejupre4 = '" + rpg4 + "', "
                    + "expantecejupre5 = '" + pg5 + "', "
                    + "antecejupre6 = '" + pg6 + "', expantecejupre6 = '" + rpg6 + "', "
                    + "antecejupre7 = '" + pg7 + "', expantecejupre7 = '" + rpg7 + "', "
                    + "antecejupre8 = '" + pg8 + "', expantecejupre8 = '" + rpg8 + "', "
                    + "antecejupre9 = '" + pg9 + "', expantecejupre9 = '" + rpg9 + "', "
                    + "antecejupre10 = '" + pg10 + "', expantecejupre10 = '" + rpg10 + "',  "
                    + "antecejupre11 = '" + pg11 + "', expantecejupre11 = '" + rpg11 + "', "
                    + "antecejupre12 = '" + pg12 + "', expantecejupre12 = '" + rpg12 + "' WHERE no_id = " + txtnoiden.getText() + "  ");
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
        pg5 = "";
        pg6 = "-";
        pg7 = "-";
        pg8 = "-";
        pg9 = "-";
        pg10 = "-";
        pg11 = "-";
        pg12 = "-";
        rpg1 = "";
        rpg2 = "";
        rpg3 = "";
        rpg4 = "";
        rpg6 = "";
        rpg7 = "";
        rpg8 = "";
        rpg9 = "";
        rpg10 = "";
        rpg11 = "";
        rpg12 = "";
        admisionAntecendentes = "";
        colorCategoria = "sincolor";
    }

}
