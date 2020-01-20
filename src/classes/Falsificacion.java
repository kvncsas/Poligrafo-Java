package classes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import view.DatoGeneral;
import static view.DatoPersonal.txtnoiden;

/**
 *
 * @author Kevin Casas
 */
public class Falsificacion {

    private static String ti_falsificacion1 = "";
    private static String ti_falsificacion2 = "";
    private static String ti_falsificacion3 = "";
    private static String ti_falsificacion4 = "";
    private static String ti_falsificacion5 = "";
    private static String ti_falsificacion6 = "";
    private static String ti_falsificacion7 = "";
    private static String ti_falsificacion8 = "";
    private static String hvfalsifi = "-";
    private static String exphvfalsifi = "";
    private static String datosfalsospre1 = "-";
    private static String datosfalsospre2 = "-";
    private static String expdatosfalsospre1 = "";
    private static String expdatosfalsospre2 = "";

    private static String pgrutinaope1_ = "";
    private static String pgrutinaope1 = "";
    private static String pgrutinaope2 = "";
    private static String pgrutinaope3 = "";
    private static String pgrutinaope4 = "";
    private static String pgrutinaope5 = "";
    private static String pgrutinaope6 = "";
    private static String pgrutinaope7 = "";
    private static String pgrutinaope8 = "";
    private static String pgrutinaope9 = "";
    private static String pgrutinaope10 = "";
    private static String pgrutinaope11 = "";
    private static String pgrutinaope12 = "";
    private static String rpgrutinaope1 = "";
    private static String rpgrutinaope2 = "";
    private static String rpgrutinaope3 = "";
    private static String rpgrutinaope4 = "";
    private static String rpgrutinaope5 = "";
    private static String rpgrutinaope6 = "";
    private static String rpgrutinaope7 = "";
    private static String rpgrutinaope8 = "";
    private static String rpgrutinaope9 = "";
    private static String rpgrutinaope10 = "";
    private static String rpgrutinaope11 = "";
    private static String rpgrutinaope12 = "";

    private static String pgrutinaadmi1 = "";
    private static String pgrutinaadmi2 = "";
    private static String pgrutinaadmi3 = "";
    private static String pgrutinaadmi4 = "";
    private static String pgrutinaadmi5 = "";
    private static String pgrutinaadmi6 = "";
    private static String pgrutinaadmi7 = "";
    private static String pgrutinaadmi8 = "";
    private static String rpgrutinaadmi3 = "";
    private static String rpgrutinaadmi4 = "";
    private static String rpgrutinaadmi5 = "";
    private static String rpgrutinaadmi6 = "";
    private static String rpgrutinaadmi7 = "";
    private static String rpgrutinaadmi8 = "";

    private static String pgrutina1 = "";
    private static String pgrutina2 = "";
    private static String pgrutina3 = "";
    private static String pgrutina4 = "";
    private static String pgrutina5 = "";
    private static String pgrutina6 = "";
    private static String pgrutina7 = "";
    private static String pgrutina8 = "";
    private static String pgrutina9 = "";
    private static String pgrutina10 = "";
    private static String pgrutina11 = "";
    private static String pgrutina12 = "";
    private static String pgrutina13 = "";
    private static String pgrutina14 = "";
    private static String pgrutina15 = "";
    private static String pgrutina16 = "";
    private static String pgrutina17 = "";
    private static String pgrutina18 = "";
    private static String pgrutina19 = "";
    private static String rpgrutina1 = "";
    private static String rpgrutina2 = "";
    private static String rpgrutina3 = "";
    private static String rpgrutina4 = "";
    private static String rpgrutina5 = "";
    private static String rpgrutina6 = "";
    private static String rpgrutina7 = "";
    private static String rpgrutina8 = "";
    private static String rpgrutina9 = "";
    private static String rpgrutina10 = "";
    private static String rpgrutina11 = "";
    private static String rpgrutina12 = "";
    private static String rpgrutina13 = "";
    private static String rpgrutina14 = "";
    private static String rpgrutina15 = "";
    private static String rpgrutina16 = "";
    private static String rpgrutina17 = "";
    private static String rpgrutina18 = "";
    private static String rpgrutina19 = "";

    private static String admisionFalsificacion = "";

    private static String colorCategoria = "sincolor";

    public static String getPgrutinaope1_() {
        return pgrutinaope1_;
    }

    public static void setPgrutinaope1_(String pgrutinaope1_) {
        Falsificacion.pgrutinaope1_ = pgrutinaope1_;
    }

    public static String getRpgrutinaope1() {
        return rpgrutinaope1;
    }

    public static void setRpgrutinaope1(String rpgrutinaope1) {
        Falsificacion.rpgrutinaope1 = rpgrutinaope1;
    }

    public static String getRpgrutinaope2() {
        return rpgrutinaope2;
    }

    public static void setRpgrutinaope2(String rpgrutinaope2) {
        Falsificacion.rpgrutinaope2 = rpgrutinaope2;
    }

    public static String getRpgrutinaope3() {
        return rpgrutinaope3;
    }

    public static void setRpgrutinaope3(String rpgrutinaope3) {
        Falsificacion.rpgrutinaope3 = rpgrutinaope3;
    }

    public static String getRpgrutinaope4() {
        return rpgrutinaope4;
    }

    public static void setRpgrutinaope4(String rpgrutinaope4) {
        Falsificacion.rpgrutinaope4 = rpgrutinaope4;
    }

    public static String getRpgrutinaope5() {
        return rpgrutinaope5;
    }

    public static void setRpgrutinaope5(String rpgrutinaope5) {
        Falsificacion.rpgrutinaope5 = rpgrutinaope5;
    }

    public static String getRpgrutinaope6() {
        return rpgrutinaope6;
    }

    public static void setRpgrutinaope6(String rpgrutinaope6) {
        Falsificacion.rpgrutinaope6 = rpgrutinaope6;
    }

    public static String getRpgrutinaope7() {
        return rpgrutinaope7;
    }

    public static void setRpgrutinaope7(String rpgrutinaope7) {
        Falsificacion.rpgrutinaope7 = rpgrutinaope7;
    }

    public static String getRpgrutinaope8() {
        return rpgrutinaope8;
    }

    public static void setRpgrutinaope8(String rpgrutinaope8) {
        Falsificacion.rpgrutinaope8 = rpgrutinaope8;
    }

    public static String getRpgrutinaope9() {
        return rpgrutinaope9;
    }

    public static void setRpgrutinaope9(String rpgrutinaope9) {
        Falsificacion.rpgrutinaope9 = rpgrutinaope9;
    }

    public static String getRpgrutinaope10() {
        return rpgrutinaope10;
    }

    public static void setRpgrutinaope10(String rpgrutinaope10) {
        Falsificacion.rpgrutinaope10 = rpgrutinaope10;
    }

    public static String getRpgrutinaope11() {
        return rpgrutinaope11;
    }

    public static void setRpgrutinaope11(String rpgrutinaope11) {
        Falsificacion.rpgrutinaope11 = rpgrutinaope11;
    }

    public static String getRpgrutinaope12() {
        return rpgrutinaope12;
    }

    public static void setRpgrutinaope12(String rpgrutinaope12) {
        Falsificacion.rpgrutinaope12 = rpgrutinaope12;
    }

    public static String getRpgrutinaadmi3() {
        return rpgrutinaadmi3;
    }

    public static void setRpgrutinaadmi3(String rpgrutinaadmi3) {
        Falsificacion.rpgrutinaadmi3 = rpgrutinaadmi3;
    }

    public static String getRpgrutinaadmi4() {
        return rpgrutinaadmi4;
    }

    public static void setRpgrutinaadmi4(String rpgrutinaadmi4) {
        Falsificacion.rpgrutinaadmi4 = rpgrutinaadmi4;
    }

    public static String getRpgrutinaadmi5() {
        return rpgrutinaadmi5;
    }

    public static void setRpgrutinaadmi5(String rpgrutinaadmi5) {
        Falsificacion.rpgrutinaadmi5 = rpgrutinaadmi5;
    }

    public static String getRpgrutinaadmi6() {
        return rpgrutinaadmi6;
    }

    public static void setRpgrutinaadmi6(String rpgrutinaadmi6) {
        Falsificacion.rpgrutinaadmi6 = rpgrutinaadmi6;
    }

    public static String getRpgrutinaadmi7() {
        return rpgrutinaadmi7;
    }

    public static void setRpgrutinaadmi7(String rpgrutinaadmi7) {
        Falsificacion.rpgrutinaadmi7 = rpgrutinaadmi7;
    }

    public static String getRpgrutinaadmi8() {
        return rpgrutinaadmi8;
    }

    public static void setRpgrutinaadmi8(String rpgrutinaadmi8) {
        Falsificacion.rpgrutinaadmi8 = rpgrutinaadmi8;
    }

    public static String getPgrutina1() {
        return pgrutina1;
    }

    public static void setPgrutina1(String pgrutina1) {
        Falsificacion.pgrutina1 = pgrutina1;
    }

    public static String getPgrutina2() {
        return pgrutina2;
    }

    public static void setPgrutina2(String pgrutina2) {
        Falsificacion.pgrutina2 = pgrutina2;
    }

    public static String getPgrutina3() {
        return pgrutina3;
    }

    public static void setPgrutina3(String pgrutina3) {
        Falsificacion.pgrutina3 = pgrutina3;
    }

    public static String getPgrutina4() {
        return pgrutina4;
    }

    public static void setPgrutina4(String pgrutina4) {
        Falsificacion.pgrutina4 = pgrutina4;
    }

    public static String getPgrutina5() {
        return pgrutina5;
    }

    public static void setPgrutina5(String pgrutina5) {
        Falsificacion.pgrutina5 = pgrutina5;
    }

    public static String getPgrutina6() {
        return pgrutina6;
    }

    public static void setPgrutina6(String pgrutina6) {
        Falsificacion.pgrutina6 = pgrutina6;
    }

    public static String getPgrutina7() {
        return pgrutina7;
    }

    public static void setPgrutina7(String pgrutina7) {
        Falsificacion.pgrutina7 = pgrutina7;
    }

    public static String getPgrutina8() {
        return pgrutina8;
    }

    public static void setPgrutina8(String pgrutina8) {
        Falsificacion.pgrutina8 = pgrutina8;
    }

    public static String getPgrutina9() {
        return pgrutina9;
    }

    public static void setPgrutina9(String pgrutina9) {
        Falsificacion.pgrutina9 = pgrutina9;
    }

    public static String getPgrutina10() {
        return pgrutina10;
    }

    public static void setPgrutina10(String pgrutina10) {
        Falsificacion.pgrutina10 = pgrutina10;
    }

    public static String getPgrutina11() {
        return pgrutina11;
    }

    public static void setPgrutina11(String pgrutina11) {
        Falsificacion.pgrutina11 = pgrutina11;
    }

    public static String getPgrutina12() {
        return pgrutina12;
    }

    public static void setPgrutina12(String pgrutina12) {
        Falsificacion.pgrutina12 = pgrutina12;
    }

    public static String getPgrutina13() {
        return pgrutina13;
    }

    public static void setPgrutina13(String pgrutina13) {
        Falsificacion.pgrutina13 = pgrutina13;
    }

    public static String getPgrutina14() {
        return pgrutina14;
    }

    public static void setPgrutina14(String pgrutina14) {
        Falsificacion.pgrutina14 = pgrutina14;
    }

    public static String getPgrutina15() {
        return pgrutina15;
    }

    public static void setPgrutina15(String pgrutina15) {
        Falsificacion.pgrutina15 = pgrutina15;
    }

    public static String getPgrutina16() {
        return pgrutina16;
    }

    public static void setPgrutina16(String pgrutina16) {
        Falsificacion.pgrutina16 = pgrutina16;
    }

    public static String getPgrutina17() {
        return pgrutina17;
    }

    public static void setPgrutina17(String pgrutina17) {
        Falsificacion.pgrutina17 = pgrutina17;
    }

    public static String getPgrutina18() {
        return pgrutina18;
    }

    public static void setPgrutina18(String pgrutina18) {
        Falsificacion.pgrutina18 = pgrutina18;
    }

    public static String getRpgrutina1() {
        return rpgrutina1;
    }

    public static void setRpgrutina1(String rpgrutina1) {
        Falsificacion.rpgrutina1 = rpgrutina1;
    }

    public static String getRpgrutina2() {
        return rpgrutina2;
    }

    public static void setRpgrutina2(String rpgrutina2) {
        Falsificacion.rpgrutina2 = rpgrutina2;
    }

    public static String getRpgrutina3() {
        return rpgrutina3;
    }

    public static void setRpgrutina3(String rpgrutina3) {
        Falsificacion.rpgrutina3 = rpgrutina3;
    }

    public static String getRpgrutina4() {
        return rpgrutina4;
    }

    public static void setRpgrutina4(String rpgrutina4) {
        Falsificacion.rpgrutina4 = rpgrutina4;
    }

    public static String getRpgrutina5() {
        return rpgrutina5;
    }

    public static void setRpgrutina5(String rpgrutina5) {
        Falsificacion.rpgrutina5 = rpgrutina5;
    }

    public static String getRpgrutina6() {
        return rpgrutina6;
    }

    public static void setRpgrutina6(String rpgrutina6) {
        Falsificacion.rpgrutina6 = rpgrutina6;
    }

    public static String getRpgrutina7() {
        return rpgrutina7;
    }

    public static void setRpgrutina7(String rpgrutina7) {
        Falsificacion.rpgrutina7 = rpgrutina7;
    }

    public static String getRpgrutina8() {
        return rpgrutina8;
    }

    public static void setRpgrutina8(String rpgrutina8) {
        Falsificacion.rpgrutina8 = rpgrutina8;
    }

    public static String getRpgrutina9() {
        return rpgrutina9;
    }

    public static void setRpgrutina9(String rpgrutina9) {
        Falsificacion.rpgrutina9 = rpgrutina9;
    }

    public static String getRpgrutina10() {
        return rpgrutina10;
    }

    public static void setRpgrutina10(String rpgrutina10) {
        Falsificacion.rpgrutina10 = rpgrutina10;
    }

    public static String getRpgrutina11() {
        return rpgrutina11;
    }

    public static void setRpgrutina11(String rpgrutina11) {
        Falsificacion.rpgrutina11 = rpgrutina11;
    }

    public static String getRpgrutina12() {
        return rpgrutina12;
    }

    public static void setRpgrutina12(String rpgrutina12) {
        Falsificacion.rpgrutina12 = rpgrutina12;
    }

    public static String getRpgrutina13() {
        return rpgrutina13;
    }

    public static void setRpgrutina13(String rpgrutina13) {
        Falsificacion.rpgrutina13 = rpgrutina13;
    }

    public static String getRpgrutina14() {
        return rpgrutina14;
    }

    public static void setRpgrutina14(String rpgrutina14) {
        Falsificacion.rpgrutina14 = rpgrutina14;
    }

    public static String getRpgrutina15() {
        return rpgrutina15;
    }

    public static void setRpgrutina15(String rpgrutina15) {
        Falsificacion.rpgrutina15 = rpgrutina15;
    }

    public static String getRpgrutina16() {
        return rpgrutina16;
    }

    public static void setRpgrutina16(String rpgrutina16) {
        Falsificacion.rpgrutina16 = rpgrutina16;
    }

    public static String getRpgrutina17() {
        return rpgrutina17;
    }

    public static void setRpgrutina17(String rpgrutina17) {
        Falsificacion.rpgrutina17 = rpgrutina17;
    }

    public static String getRpgrutina18() {
        return rpgrutina18;
    }

    public static void setRpgrutina18(String rpgrutina18) {
        Falsificacion.rpgrutina18 = rpgrutina18;
    }

    public static String getPgrutina19() {
        return pgrutina19;
    }

    public static void setPgrutina19(String pgrutina19) {
        Falsificacion.pgrutina19 = pgrutina19;
    }

    public static String getRpgrutina19() {
        return rpgrutina19;
    }

    public static void setRpgrutina19(String rpgrutina19) {
        Falsificacion.rpgrutina19 = rpgrutina19;
    }

    public static String getPgrutinaadmi1() {
        return pgrutinaadmi1;
    }

    public static void setPgrutinaadmi1(String pgrutinaadmi1) {
        Falsificacion.pgrutinaadmi1 = pgrutinaadmi1;
    }

    public static String getPgrutinaadmi2() {
        return pgrutinaadmi2;
    }

    public static void setPgrutinaadmi2(String pgrutinaadmi2) {
        Falsificacion.pgrutinaadmi2 = pgrutinaadmi2;
    }

    public static String getPgrutinaadmi3() {
        return pgrutinaadmi3;
    }

    public static void setPgrutinaadmi3(String pgrutinaadmi3) {
        Falsificacion.pgrutinaadmi3 = pgrutinaadmi3;
    }

    public static String getPgrutinaadmi4() {
        return pgrutinaadmi4;
    }

    public static void setPgrutinaadmi4(String pgrutinaadmi4) {
        Falsificacion.pgrutinaadmi4 = pgrutinaadmi4;
    }

    public static String getPgrutinaadmi5() {
        return pgrutinaadmi5;
    }

    public static void setPgrutinaadmi5(String pgrutinaadmi5) {
        Falsificacion.pgrutinaadmi5 = pgrutinaadmi5;
    }

    public static String getPgrutinaadmi6() {
        return pgrutinaadmi6;
    }

    public static void setPgrutinaadmi6(String pgrutinaadmi6) {
        Falsificacion.pgrutinaadmi6 = pgrutinaadmi6;
    }

    public static String getPgrutinaadmi7() {
        return pgrutinaadmi7;
    }

    public static void setPgrutinaadmi7(String pgrutinaadmi7) {
        Falsificacion.pgrutinaadmi7 = pgrutinaadmi7;
    }

    public static String getPgrutinaadmi8() {
        return pgrutinaadmi8;
    }

    public static void setPgrutinaadmi8(String pgrutinaadmi8) {
        Falsificacion.pgrutinaadmi8 = pgrutinaadmi8;
    }

    public static String getPgrutinaope1() {
        return pgrutinaope1;
    }

    public static void setPgrutinaope1(String pgrutinaope1) {
        Falsificacion.pgrutinaope1 = pgrutinaope1;
    }

    public static String getPgrutinaope2() {
        return pgrutinaope2;
    }

    public static void setPgrutinaope2(String pgrutinaope2) {
        Falsificacion.pgrutinaope2 = pgrutinaope2;
    }

    public static String getPgrutinaope3() {
        return pgrutinaope3;
    }

    public static void setPgrutinaope3(String pgrutinaope3) {
        Falsificacion.pgrutinaope3 = pgrutinaope3;
    }

    public static String getPgrutinaope4() {
        return pgrutinaope4;
    }

    public static void setPgrutinaope4(String pgrutinaope4) {
        Falsificacion.pgrutinaope4 = pgrutinaope4;
    }

    public static String getPgrutinaope5() {
        return pgrutinaope5;
    }

    public static void setPgrutinaope5(String pgrutinaope5) {
        Falsificacion.pgrutinaope5 = pgrutinaope5;
    }

    public static String getPgrutinaope6() {
        return pgrutinaope6;
    }

    public static void setPgrutinaope6(String pgrutinaope6) {
        Falsificacion.pgrutinaope6 = pgrutinaope6;
    }

    public static String getPgrutinaope7() {
        return pgrutinaope7;
    }

    public static void setPgrutinaope7(String pgrutinaope7) {
        Falsificacion.pgrutinaope7 = pgrutinaope7;
    }

    public static String getPgrutinaope8() {
        return pgrutinaope8;
    }

    public static void setPgrutinaope8(String pgrutinaope8) {
        Falsificacion.pgrutinaope8 = pgrutinaope8;
    }

    public static String getPgrutinaope9() {
        return pgrutinaope9;
    }

    public static void setPgrutinaope9(String pgrutinaope9) {
        Falsificacion.pgrutinaope9 = pgrutinaope9;
    }

    public static String getPgrutinaope10() {
        return pgrutinaope10;
    }

    public static void setPgrutinaope10(String pgrutinaope10) {
        Falsificacion.pgrutinaope10 = pgrutinaope10;
    }

    public static String getPgrutinaope11() {
        return pgrutinaope11;
    }

    public static void setPgrutinaope11(String pgrutinaope11) {
        Falsificacion.pgrutinaope11 = pgrutinaope11;
    }

    public static String getPgrutinaope12() {
        return pgrutinaope12;
    }

    public static void setPgrutinaope12(String pgrutinaope12) {
        Falsificacion.pgrutinaope12 = pgrutinaope12;
    }

    public static String getColorCategoria() {
        return colorCategoria;
    }

    public static void setColorCategoria(String colorCategoria) {
        Falsificacion.colorCategoria = colorCategoria;
    }

    public static String getAdmisionFalsificacion() {
        return admisionFalsificacion;
    }

    public static void setAdmisionFalsificacion(String admisionFalsificacion) {
        Falsificacion.admisionFalsificacion = admisionFalsificacion;
    }

    public static String getTi_falsificacion1() {
        return ti_falsificacion1;
    }

    public static void setTi_falsificacion1(String ti_falsificacion1) {
        Falsificacion.ti_falsificacion1 = ti_falsificacion1;
    }

    public static String getTi_falsificacion2() {
        return ti_falsificacion2;
    }

    public static void setTi_falsificacion2(String ti_falsificacion2) {
        Falsificacion.ti_falsificacion2 = ti_falsificacion2;
    }

    public static String getTi_falsificacion3() {
        return ti_falsificacion3;
    }

    public static void setTi_falsificacion3(String ti_falsificacion3) {
        Falsificacion.ti_falsificacion3 = ti_falsificacion3;
    }

    public static String getTi_falsificacion4() {
        return ti_falsificacion4;
    }

    public static void setTi_falsificacion4(String ti_falsificacion4) {
        Falsificacion.ti_falsificacion4 = ti_falsificacion4;
    }

    public static String getTi_falsificacion5() {
        return ti_falsificacion5;
    }

    public static void setTi_falsificacion5(String ti_falsificacion5) {
        Falsificacion.ti_falsificacion5 = ti_falsificacion5;
    }

    public static String getTi_falsificacion6() {
        return ti_falsificacion6;
    }

    public static void setTi_falsificacion6(String ti_falsificacion6) {
        Falsificacion.ti_falsificacion6 = ti_falsificacion6;
    }

    public static String getTi_falsificacion7() {
        return ti_falsificacion7;
    }

    public static void setTi_falsificacion7(String ti_falsificacion7) {
        Falsificacion.ti_falsificacion7 = ti_falsificacion7;
    }

    public static String getTi_falsificacion8() {
        return ti_falsificacion8;
    }

    public static void setTi_falsificacion8(String ti_falsificacion8) {
        Falsificacion.ti_falsificacion8 = ti_falsificacion8;
    }

    public static String getHvfalsifi() {
        return hvfalsifi;
    }

    public static void setHvfalsifi(String hvfalsifi) {
        Falsificacion.hvfalsifi = hvfalsifi;
    }

    public static String getExphvfalsifi() {
        return exphvfalsifi;
    }

    public static void setExphvfalsifi(String exphvfalsifi) {
        Falsificacion.exphvfalsifi = exphvfalsifi;
    }

    public static String getDatosfalsospre1() {
        return datosfalsospre1;
    }

    public static void setDatosfalsospre1(String datosfalsospre1) {
        Falsificacion.datosfalsospre1 = datosfalsospre1;
    }

    public static String getDatosfalsospre2() {
        return datosfalsospre2;
    }

    public static void setDatosfalsospre2(String datosfalsospre2) {
        Falsificacion.datosfalsospre2 = datosfalsospre2;
    }

    public static String getExpdatosfalsospre1() {
        return expdatosfalsospre1;
    }

    public static void setExpdatosfalsospre1(String expdatosfalsospre1) {
        Falsificacion.expdatosfalsospre1 = expdatosfalsospre1;
    }

    public static String getExpdatosfalsospre2() {
        return expdatosfalsospre2;
    }

    public static void setExpdatosfalsospre2(String expdatosfalsospre2) {
        Falsificacion.expdatosfalsospre2 = expdatosfalsospre2;
    }

    SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");
    java.util.Date fecha = new java.util.Date();
    public String fechanow = date.format(fecha);

    public void validarfalsificacion() {
        //validación check box  FalsificacionHV de datos
        //1
        if (ti_falsificacion1.equals("hay")) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM irregluhv_poli  WHERE ti_falsificacion = 'Certificaciones académicas' AND  no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune < 1) {
                    try {
                        PreparedStatement sqlins = Conexion.connection.prepareStatement("INSERT INTO irregluhv_poli "
                                + "(no_id, ti_falsificacion, fechacreacion)"
                                + " VALUES (?,?,?)");
                        sqlins.setString(1, txtnoiden.getText());
                        sqlins.setString(2, "Certificaciones académicas");
                        sqlins.setString(3, fechanow);
                        sqlins.executeUpdate();
                    } catch (SQLException e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (ti_falsificacion1.equals("nohay")) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM irregluhv_poli  WHERE ti_falsificacion = 'Certificaciones académicas' AND no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune > 0) {
                    try {
                        PreparedStatement sqlpsiup = Conexion.connection.prepareStatement("DELETE FROM irregluhv_poli WHERE ti_falsificacion = 'Certificaciones académicas' AND no_id = " + txtnoiden.getText());
                        sqlpsiup.executeUpdate();
                    } catch (SQLException e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        //2
        if (ti_falsificacion2.equals("hay")) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM irregluhv_poli  WHERE ti_falsificacion = 'Certificaciones laborales' AND  no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune < 1) {
                    try {
                        PreparedStatement sqlins = Conexion.connection.prepareStatement("INSERT INTO irregluhv_poli "
                                + "(no_id, ti_falsificacion, fechacreacion)"
                                + " VALUES (?,?,?)");
                        sqlins.setString(1, txtnoiden.getText());
                        sqlins.setString(2, "Certificaciones laborales");
                        sqlins.setString(3, fechanow);
                        sqlins.executeUpdate();
                    } catch (SQLException e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (ti_falsificacion2.equals("nohay")) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM irregluhv_poli  WHERE ti_falsificacion = 'Certificaciones laborales' AND no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune > 0) {
                    try {
                        PreparedStatement sqlpsiup = Conexion.connection.prepareStatement("DELETE FROM irregluhv_poli WHERE ti_falsificacion = 'Certificaciones laborales' AND no_id = " + txtnoiden.getText());
                        sqlpsiup.executeUpdate();
                    } catch (SQLException e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        //3
        if (ti_falsificacion3.equals("hay")) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM irregluhv_poli  WHERE ti_falsificacion = 'Documentación personal' AND  no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune < 1) {
                    try {
                        PreparedStatement sqlins = Conexion.connection.prepareStatement("INSERT INTO irregluhv_poli "
                                + "(no_id, ti_falsificacion, fechacreacion)"
                                + " VALUES (?,?,?)");
                        sqlins.setString(1, txtnoiden.getText());
                        sqlins.setString(2, "Documentación personal");
                        sqlins.setString(3, fechanow);
                        sqlins.executeUpdate();
                    } catch (SQLException e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (ti_falsificacion3.equals("nohay")) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM irregluhv_poli  WHERE ti_falsificacion = 'Documentación personal' AND no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune > 0) {
                    try {
                        PreparedStatement sqlpsiup = Conexion.connection.prepareStatement("DELETE FROM irregluhv_poli WHERE ti_falsificacion = 'Documentación personal' AND no_id = " + txtnoiden.getText());
                        sqlpsiup.executeUpdate();
                    } catch (SQLException e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        //4
        if (ti_falsificacion4.equals("hay")) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM irregluhv_poli  WHERE ti_falsificacion = 'Referencias personales' AND  no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune < 1) {
                    try {
                        PreparedStatement sqlins = Conexion.connection.prepareStatement("INSERT INTO irregluhv_poli "
                                + "(no_id, ti_falsificacion, fechacreacion)"
                                + " VALUES (?,?,?)");
                        sqlins.setString(1, txtnoiden.getText());
                        sqlins.setString(2, "Referencias personales");
                        sqlins.setString(3, fechanow);
                        sqlins.executeUpdate();
                    } catch (SQLException e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (ti_falsificacion4.equals("nohay")) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM irregluhv_poli  WHERE ti_falsificacion = 'Referencias personales' AND no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune > 0) {
                    try {
                        PreparedStatement sqlpsiup = Conexion.connection.prepareStatement("DELETE FROM irregluhv_poli WHERE ti_falsificacion = 'Referencias personales' AND no_id = " + txtnoiden.getText());
                        sqlpsiup.executeUpdate();
                    } catch (SQLException e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        //5
        if (ti_falsificacion5.equals("hay")) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM irregluhv_poli  WHERE ti_falsificacion = 'Certificaciones de antecedentes' AND  no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune < 1) {
                    try {
                        PreparedStatement sqlins = Conexion.connection.prepareStatement("INSERT INTO irregluhv_poli "
                                + "(no_id, ti_falsificacion, fechacreacion)"
                                + " VALUES (?,?,?)");
                        sqlins.setString(1, txtnoiden.getText());
                        sqlins.setString(2, "Certificaciones de antecedentes");
                        sqlins.setString(3, fechanow);
                        sqlins.executeUpdate();
                    } catch (SQLException e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (ti_falsificacion5.equals("nohay")) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM irregluhv_poli  WHERE ti_falsificacion = 'Certificaciones de antecedentes' AND no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune > 0) {
                    try {
                        PreparedStatement sqlpsiup = Conexion.connection.prepareStatement("DELETE FROM irregluhv_poli WHERE ti_falsificacion = 'Certificaciones de antecedentes' AND no_id = " + txtnoiden.getText());
                        sqlpsiup.executeUpdate();
                    } catch (SQLException e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        //6 
        if (ti_falsificacion6.equals("hay")) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM irregluhv_poli  WHERE ti_falsificacion = 'Información entrevista' AND  no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune < 1) {
                    try {
                        PreparedStatement sqlins = Conexion.connection.prepareStatement("INSERT INTO irregluhv_poli "
                                + "(no_id, ti_falsificacion, fechacreacion)"
                                + " VALUES (?,?,?)");
                        sqlins.setString(1, txtnoiden.getText());
                        sqlins.setString(2, "Información entrevista");
                        sqlins.setString(3, fechanow);
                        sqlins.executeUpdate();
                    } catch (SQLException e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (ti_falsificacion6.equals("nohay")) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM irregluhv_poli  WHERE ti_falsificacion = 'Información entrevista' AND no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune > 0) {
                    try {
                        PreparedStatement sqlpsiup = Conexion.connection.prepareStatement("DELETE FROM irregluhv_poli WHERE ti_falsificacion = 'Información entrevista'  AND no_id = " + txtnoiden.getText());
                        sqlpsiup.executeUpdate();
                    } catch (SQLException e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        //7
        if (ti_falsificacion7.equals("hay")) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM irregluhv_poli  WHERE ti_falsificacion = 'Información hoja de vida' AND  no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune < 1) {
                    try {
                        PreparedStatement sqlins = Conexion.connection.prepareStatement("INSERT INTO irregluhv_poli "
                                + "(no_id, ti_falsificacion, fechacreacion)"
                                + " VALUES (?,?,?)");
                        sqlins.setString(1, txtnoiden.getText());
                        sqlins.setString(2, "Información hoja de vida");
                        sqlins.setString(3, fechanow);
                        sqlins.executeUpdate();
                    } catch (SQLException e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (ti_falsificacion7.equals("nohay")) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM irregluhv_poli  WHERE ti_falsificacion = 'Información hoja de vida' AND no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune > 0) {
                    try {
                        PreparedStatement sqlpsiup = Conexion.connection.prepareStatement("DELETE FROM irregluhv_poli WHERE ti_falsificacion = 'Información hoja de vida' AND no_id = " + txtnoiden.getText());
                        sqlpsiup.executeUpdate();
                    } catch (SQLException e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        //8
        if (ti_falsificacion8.equals("hay")) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM irregluhv_poli  WHERE ti_falsificacion = 'Información entrevista poligrafia' AND  no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune < 1) {
                    try {
                        PreparedStatement sqlins = Conexion.connection.prepareStatement("INSERT INTO irregluhv_poli "
                                + "(no_id, ti_falsificacion, fechacreacion)"
                                + " VALUES (?,?,?)");
                        sqlins.setString(1, txtnoiden.getText());
                        sqlins.setString(2, "Información entrevista poligrafia");
                        sqlins.setString(3, fechanow);
                        sqlins.executeUpdate();
                    } catch (SQLException e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (ti_falsificacion8.equals("nohay")) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM irregluhv_poli  WHERE ti_falsificacion = 'Información entrevista poligrafia' AND no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune > 0) {
                    try {
                        PreparedStatement sqlpsiup = Conexion.connection.prepareStatement("DELETE FROM irregluhv_poli WHERE ti_falsificacion = 'Información entrevista poligrafia' AND no_id = " + txtnoiden.getText());
                        sqlpsiup.executeUpdate();
                    } catch (SQLException e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void update_falsifi() {
        try {
            PreparedStatement sql = Conexion.connection.prepareStatement("UPDATE datos_generales_poli "
                    + "SET hvfalsifi  = '" + hvfalsifi + "', exphvfalsifi = '" + exphvfalsifi + "' ,  "
                    + " datosfalsospre1  = '" + datosfalsospre1 + "', expdatosfalsospre1 = '" + expdatosfalsospre1 + "'  ,  "
                    + "datosfalsospre2  = '" + datosfalsospre2 + "', expdatosfalsospre2 = '" + expdatosfalsospre2 + "' , "
                    + "pgrutinaope1_  = '" + pgrutinaope1_ + "', "
                    + " pgrutinaope1  = '" + pgrutinaope1 + "', rpgrutinaope1 = '" + rpgrutinaope1 + "'  ,  "
                    + " pgrutinaope2  = '" + pgrutinaope2 + "', rpgrutinaope2 = '" + rpgrutinaope2 + "'  ,  "
                    + " pgrutinaope3  = '" + pgrutinaope3 + "', rpgrutinaope3 = '" + rpgrutinaope3 + "'  ,  "
                    + " pgrutinaope4  = '" + pgrutinaope4 + "', rpgrutinaope4 = '" + rpgrutinaope4 + "'  ,  "
                    + " pgrutinaope5  = '" + pgrutinaope5 + "', rpgrutinaope5 = '" + rpgrutinaope5 + "'  ,  "
                    + " pgrutinaope6  = '" + pgrutinaope6 + "', rpgrutinaope6 = '" + rpgrutinaope6 + "'  ,  "
                    + " pgrutinaope7  = '" + pgrutinaope7 + "', rpgrutinaope7 = '" + rpgrutinaope7 + "'  ,  "
                    + " pgrutinaope8  = '" + pgrutinaope8 + "', rpgrutinaope8 = '" + rpgrutinaope8 + "'  ,  "
                    + " pgrutinaope9  = '" + pgrutinaope9 + "', rpgrutinaope9 = '" + rpgrutinaope9 + "'  ,  "
                    + " pgrutinaope10  = '" + pgrutinaope10 + "', rpgrutinaope10 = '" + rpgrutinaope10 + "'  ,  "
                    + " pgrutinaope11  = '" + pgrutinaope11 + "', rpgrutinaope11 = '" + rpgrutinaope11 + "'  ,  "
                    + " pgrutinaope12 = '" + pgrutinaope12 + "', rpgrutinaope12 = '" + rpgrutinaope12 + "'  ,  "
                    + " pgrutinaadmi1 = '" + pgrutinaadmi1 + "', pgrutinaadmi2 = '" + pgrutinaadmi2 + "',  "
                    + " pgrutinaadmi3 = '" + pgrutinaadmi3 + "', rpgrutinaadmi3 = '" + rpgrutinaadmi3 + "'  ,  "
                    + " pgrutinaadmi4 = '" + pgrutinaadmi4 + "', rpgrutinaadmi4 = '" + rpgrutinaadmi4 + "'  ,  "
                    + " pgrutinaadmi5 = '" + pgrutinaadmi5 + "', rpgrutinaadmi5 = '" + rpgrutinaadmi5 + "'  ,  "
                    + " pgrutinaadmi6 = '" + pgrutinaadmi6 + "', rpgrutinaadmi6 = '" + rpgrutinaadmi6 + "'  ,  "
                    + " pgrutinaadmi7 = '" + pgrutinaadmi7 + "', rpgrutinaadmi7 = '" + rpgrutinaadmi7 + "'  ,  "
                    + " pgrutinaadmi8 = '" + pgrutinaadmi8 + "', rpgrutinaadmi8 = '" + rpgrutinaadmi8 + "'  ,  "
                    + " pgrutina1 = '" + pgrutina1 + "', rpgrutina1 = '" + rpgrutina1 + "'  ,  "
                    + " pgrutina2 = '" + pgrutina2 + "', rpgrutina2 = '" + rpgrutina2 + "'  ,  "
                    + " pgrutina3 = '" + pgrutina3 + "', rpgrutina3 = '" + rpgrutina3 + "'  ,  "
                    + " pgrutina4 = '" + pgrutina4 + "', rpgrutina4 = '" + rpgrutina4 + "'  ,  "
                    + " pgrutina5 = '" + pgrutina5 + "', rpgrutina5 = '" + rpgrutina5 + "'  ,  "
                    + " pgrutina6 = '" + pgrutina6 + "', rpgrutina6 = '" + rpgrutina6 + "'  ,  "
                    + " pgrutina7 = '" + pgrutina7 + "', rpgrutina7 = '" + rpgrutina7 + "'  ,  "
                    + " pgrutina8 = '" + pgrutina8 + "', rpgrutina8 = '" + rpgrutina8 + "'  ,  "
                    + " pgrutina9 = '" + pgrutina9 + "', rpgrutina9 = '" + rpgrutina9 + "'  ,  "
                    + " pgrutina10 = '" + pgrutina10 + "', rpgrutina10 = '" + rpgrutina10 + "'  ,  "
                    + " pgrutina11 = '" + pgrutina11 + "', rpgrutina11 = '" + rpgrutina11 + "'  ,  "
                    + " pgrutina12 = '" + pgrutina12 + "', rpgrutina12 = '" + rpgrutina12 + "'  ,  "
                    + " pgrutina13 = '" + pgrutina13 + "', rpgrutina13 = '" + rpgrutina13 + "'  ,  "
                    + " pgrutina14 = '" + pgrutina14 + "', rpgrutina14 = '" + rpgrutina14 + "'  ,  "
                    + " pgrutina15 = '" + pgrutina15 + "', rpgrutina15 = '" + rpgrutina15 + "'  ,  "
                    + " pgrutina16 = '" + pgrutina16 + "', rpgrutina16 = '" + rpgrutina16 + "'  ,  "
                    + " pgrutina17 = '" + pgrutina17 + "', rpgrutina17 = '" + rpgrutina17 + "'  ,  "
                    + " pgrutina18 = '" + pgrutina18 + "', rpgrutina18 = '" + rpgrutina18 + "'  ,  "
                    + " pgrutina19 = '" + pgrutina19 + "', rpgrutina19 = '" + rpgrutina19 + "' WHERE no_id = " + DatosPrincipales.getNoIdenExaminado() + " AND t_identificacion = '" + DatosPrincipales.getTipoIdenExaminado() + "'  ");
            sql.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "¡Error en el ingreso de datos a la base!\nPor favor solicite ayuda al equipo de desarrollo" + e);
        }
    }

    public void limpiar() {
        ti_falsificacion1 = "";
        ti_falsificacion2 = "";
        ti_falsificacion3 = "";
        ti_falsificacion4 = "";
        ti_falsificacion5 = "";
        ti_falsificacion6 = "";
        ti_falsificacion7 = "";
        ti_falsificacion8 = "";
        hvfalsifi = "-";
        exphvfalsifi = "";
        datosfalsospre1 = "-";
        datosfalsospre2 = "-";
        expdatosfalsospre1 = "";
        expdatosfalsospre2 = "";
        pgrutinaope1_ = "";
        pgrutinaope1 = "";
        pgrutinaope2 = "";
        pgrutinaope3 = "";
        pgrutinaope4 = "";
        pgrutinaope5 = "";
        pgrutinaope6 = "";
        pgrutinaope7 = "";
        pgrutinaope8 = "";
        pgrutinaope9 = "";
        pgrutinaope10 = "";
        pgrutinaope11 = "";
        pgrutinaope12 = "";
        rpgrutinaope1 = "";
        rpgrutinaope2 = "";
        rpgrutinaope3 = "";
        rpgrutinaope4 = "";
        rpgrutinaope5 = "";
        rpgrutinaope6 = "";
        rpgrutinaope7 = "";
        rpgrutinaope8 = "";
        rpgrutinaope9 = "";
        rpgrutinaope10 = "";
        rpgrutinaope11 = "";
        rpgrutinaope12 = "";
        pgrutinaadmi1 = "";
        pgrutinaadmi2 = "";
        pgrutinaadmi3 = "";
        pgrutinaadmi4 = "";
        pgrutinaadmi5 = "";
        pgrutinaadmi6 = "";
        pgrutinaadmi7 = "";
        pgrutinaadmi8 = "";
        rpgrutinaadmi3 = "";
        rpgrutinaadmi4 = "";
        rpgrutinaadmi5 = "";
        rpgrutinaadmi6 = "";
        rpgrutinaadmi7 = "";
        rpgrutinaadmi8 = "";
        pgrutina1 = "";
        pgrutina2 = "";
        pgrutina3 = "";
        pgrutina4 = "";
        pgrutina5 = "";
        pgrutina6 = "";
        pgrutina7 = "";
        pgrutina8 = "";
        pgrutina9 = "";
        pgrutina10 = "";
        pgrutina11 = "";
        pgrutina12 = "";
        pgrutina13 = "";
        pgrutina14 = "";
        pgrutina15 = "";
        pgrutina16 = "";
        pgrutina17 = "";
        pgrutina18 = "";
        pgrutina19 = "";
        rpgrutina1 = "";
        rpgrutina2 = "";
        rpgrutina3 = "";
        rpgrutina4 = "";
        rpgrutina5 = "";
        rpgrutina6 = "";
        rpgrutina7 = "";
        rpgrutina8 = "";
        rpgrutina9 = "";
        rpgrutina10 = "";
        rpgrutina11 = "";
        rpgrutina12 = "";
        rpgrutina13 = "";
        rpgrutina14 = "";
        rpgrutina15 = "";
        rpgrutina16 = "";
        rpgrutina17 = "";
        rpgrutina18 = "";
        rpgrutina19 = "";
        colorCategoria = "sincolor";
    }

}
