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
public class InfoFamiliar {

    private static String estado_civil = "";
    private static String dijovivir = "";
    private static String familiares_aparte = "";
    private static String nom_pareja = "";
    private static String fami_ries_soci = "";
    private static String expli_fami_ries = "";
    private static String tpersona1 = "";
    private static String tpersona2 = "";
    private static String tpersona3 = "";
    private static String tpersona4 = "";
    private static String tpersona5 = "";
    private static String tpersona6 = "";
    private static String tpersona7 = "";
    private static String tpersona8 = "";
    private static String tpersona9 = "";
    private static String tpersona10 = "";
    private static String tpersona11 = "";
    private static String tpersona12 = "";
    private static String tpersona13 = "";
    private static String tpersona14 = "";
    private static String tpersona15 = "";
    private static String tpersona16 = "";
    private static String tpersona17 = "";
    private static String tpersona18 = "";
    private static String tpersona19 = "";
    private static String tpersona20 = "";
    private static String tpersona21 = "";
    private static String tpersona22 = "";
    private static String tpersona23 = "";
    private static String tpersona24 = "";
    private static String tpersona25 = "";
    private static String tpersona26 = "";
    private static String tpersona27 = "";
    private static String tpersona28 = "";
    private static String tpersona29 = "";
    private static String tpersona30 = "";
    private static String tpersona31 = "";
    private static String tpersona32 = "";
    private static String tpersona33 = "";
    private static String tpersona34 = "";
    private static String tpersona35 = "";
    private static String tpersona36 = "";
    private static String tpersona37 = "";
    private static String tpersona38 = "";
    private static String tpersona39 = "";
    private static String tpersona40 = "";
    private static String tpersona41 = "";
    private static String tpersona42 = "";
    private static String tpersona43 = "";
    private static String tpersona44 = "";
    private static String tpersona45 = "";
    private static String tpersona46 = "";
    private static String tpersona47 = "";
    private static String tpersona48 = "";
    private static String tpersona49 = "";
    private static String cpersona1 = "";
    private static String cpersona2 = "";
    private static String cpersona3 = "";
    private static String cpersona4 = "";
    private static String cpersona5 = "";
    private static String cpersona6 = "";
    private static String cpersona7 = "";
    private static String cpersona8 = "";
    private static String cpersona9 = "";
    private static String cpersona10 = "";
    private static String cpersona11 = "";
    private static String cpersona12 = "";
    private static String cpersona13 = "";
    private static String cpersona14 = "";
    private static String cpersona15 = "";
    private static String cpersona16 = "";
    private static String cpersona17 = "";
    private static String cpersona18 = "";
    private static String cpersona19 = "";
    private static String cpersona20 = "";
    private static String cpersona21 = "";
    private static String cpersona22 = "";
    private static String admisionInfoFamiliar = "";
    private static String colorCategoria = "sincolor";

    public static String getColorCategoria() {
        return colorCategoria;
    }

    public static void setColorCategoria(String colorCategoria) {
        InfoFamiliar.colorCategoria = colorCategoria;
    }

    public static String getAdmisionInfoFamiliar() {
        return admisionInfoFamiliar;
    }

    public static void setAdmisionInfoFamiliar(String admisionInfoFamiliar) {
        InfoFamiliar.admisionInfoFamiliar = admisionInfoFamiliar;
    }

    public static String getEstado_civil() {
        return estado_civil;
    }

    public static void setEstado_civil(String estado_civil) {
        InfoFamiliar.estado_civil = estado_civil;
    }

    public static String getDijovivir() {
        return dijovivir;
    }

    public static void setDijovivir(String dijovivir) {
        InfoFamiliar.dijovivir = dijovivir;
    }

    public static String getFamiliares_aparte() {
        return familiares_aparte;
    }

    public static void setFamiliares_aparte(String familiares_aparte) {
        InfoFamiliar.familiares_aparte = familiares_aparte;
    }

    public static String getNom_pareja() {
        return nom_pareja;
    }

    public static void setNom_pareja(String nom_pareja) {
        InfoFamiliar.nom_pareja = nom_pareja;
    }

    public static String getFami_ries_soci() {
        return fami_ries_soci;
    }

    public static void setFami_ries_soci(String fami_ries_soci) {
        InfoFamiliar.fami_ries_soci = fami_ries_soci;
    }

    public static String getExpli_fami_ries() {
        return expli_fami_ries;
    }

    public static void setExpli_fami_ries(String expli_fami_ries) {
        InfoFamiliar.expli_fami_ries = expli_fami_ries;
    }

    public static String getTpersona1() {
        return tpersona1;
    }

    public static void setTpersona1(String tpersona1) {
        InfoFamiliar.tpersona1 = tpersona1;
    }

    public static String getTpersona2() {
        return tpersona2;
    }

    public static void setTpersona2(String tpersona2) {
        InfoFamiliar.tpersona2 = tpersona2;
    }

    public static String getTpersona3() {
        return tpersona3;
    }

    public static void setTpersona3(String tpersona3) {
        InfoFamiliar.tpersona3 = tpersona3;
    }

    public static String getTpersona4() {
        return tpersona4;
    }

    public static void setTpersona4(String tpersona4) {
        InfoFamiliar.tpersona4 = tpersona4;
    }

    public static String getTpersona5() {
        return tpersona5;
    }

    public static void setTpersona5(String tpersona5) {
        InfoFamiliar.tpersona5 = tpersona5;
    }

    public static String getTpersona6() {
        return tpersona6;
    }

    public static void setTpersona6(String tpersona6) {
        InfoFamiliar.tpersona6 = tpersona6;
    }

    public static String getTpersona7() {
        return tpersona7;
    }

    public static void setTpersona7(String tpersona7) {
        InfoFamiliar.tpersona7 = tpersona7;
    }

    public static String getTpersona8() {
        return tpersona8;
    }

    public static void setTpersona8(String tpersona8) {
        InfoFamiliar.tpersona8 = tpersona8;
    }

    public static String getTpersona9() {
        return tpersona9;
    }

    public static void setTpersona9(String tpersona9) {
        InfoFamiliar.tpersona9 = tpersona9;
    }

    public static String getTpersona10() {
        return tpersona10;
    }

    public static void setTpersona10(String tpersona10) {
        InfoFamiliar.tpersona10 = tpersona10;
    }

    public static String getTpersona11() {
        return tpersona11;
    }

    public static void setTpersona11(String tpersona11) {
        InfoFamiliar.tpersona11 = tpersona11;
    }

    public static String getTpersona12() {
        return tpersona12;
    }

    public static void setTpersona12(String tpersona12) {
        InfoFamiliar.tpersona12 = tpersona12;
    }

    public static String getTpersona13() {
        return tpersona13;
    }

    public static void setTpersona13(String tpersona13) {
        InfoFamiliar.tpersona13 = tpersona13;
    }

    public static String getTpersona14() {
        return tpersona14;
    }

    public static void setTpersona14(String tpersona14) {
        InfoFamiliar.tpersona14 = tpersona14;
    }

    public static String getTpersona15() {
        return tpersona15;
    }

    public static void setTpersona15(String tpersona15) {
        InfoFamiliar.tpersona15 = tpersona15;
    }

    public static String getTpersona16() {
        return tpersona16;
    }

    public static void setTpersona16(String tpersona16) {
        InfoFamiliar.tpersona16 = tpersona16;
    }

    public static String getTpersona17() {
        return tpersona17;
    }

    public static void setTpersona17(String tpersona17) {
        InfoFamiliar.tpersona17 = tpersona17;
    }

    public static String getTpersona18() {
        return tpersona18;
    }

    public static void setTpersona18(String tpersona18) {
        InfoFamiliar.tpersona18 = tpersona18;
    }

    public static String getTpersona19() {
        return tpersona19;
    }

    public static void setTpersona19(String tpersona19) {
        InfoFamiliar.tpersona19 = tpersona19;
    }

    public static String getTpersona20() {
        return tpersona20;
    }

    public static void setTpersona20(String tpersona20) {
        InfoFamiliar.tpersona20 = tpersona20;
    }

    public static String getTpersona21() {
        return tpersona21;
    }

    public static void setTpersona21(String tpersona21) {
        InfoFamiliar.tpersona21 = tpersona21;
    }

    public static String getTpersona22() {
        return tpersona22;
    }

    public static void setTpersona22(String tpersona22) {
        InfoFamiliar.tpersona22 = tpersona22;
    }

    public static String getTpersona23() {
        return tpersona23;
    }

    public static void setTpersona23(String tpersona23) {
        InfoFamiliar.tpersona23 = tpersona23;
    }

    public static String getTpersona24() {
        return tpersona24;
    }

    public static void setTpersona24(String tpersona24) {
        InfoFamiliar.tpersona24 = tpersona24;
    }

    public static String getTpersona25() {
        return tpersona25;
    }

    public static void setTpersona25(String tpersona25) {
        InfoFamiliar.tpersona25 = tpersona25;
    }

    public static String getTpersona26() {
        return tpersona26;
    }

    public static void setTpersona26(String tpersona26) {
        InfoFamiliar.tpersona26 = tpersona26;
    }

    public static String getTpersona27() {
        return tpersona27;
    }

    public static void setTpersona27(String tpersona27) {
        InfoFamiliar.tpersona27 = tpersona27;
    }

    public static String getTpersona28() {
        return tpersona28;
    }

    public static void setTpersona28(String tpersona28) {
        InfoFamiliar.tpersona28 = tpersona28;
    }

    public static String getTpersona29() {
        return tpersona29;
    }

    public static void setTpersona29(String tpersona29) {
        InfoFamiliar.tpersona29 = tpersona29;
    }

    public static String getTpersona30() {
        return tpersona30;
    }

    public static void setTpersona30(String tpersona30) {
        InfoFamiliar.tpersona30 = tpersona30;
    }

    public static String getTpersona31() {
        return tpersona31;
    }

    public static void setTpersona31(String tpersona31) {
        InfoFamiliar.tpersona31 = tpersona31;
    }

    public static String getTpersona32() {
        return tpersona32;
    }

    public static void setTpersona32(String tpersona32) {
        InfoFamiliar.tpersona32 = tpersona32;
    }

    public static String getTpersona33() {
        return tpersona33;
    }

    public static void setTpersona33(String tpersona33) {
        InfoFamiliar.tpersona33 = tpersona33;
    }

    public static String getTpersona34() {
        return tpersona34;
    }

    public static void setTpersona34(String tpersona34) {
        InfoFamiliar.tpersona34 = tpersona34;
    }

    public static String getTpersona35() {
        return tpersona35;
    }

    public static void setTpersona35(String tpersona35) {
        InfoFamiliar.tpersona35 = tpersona35;
    }

    public static String getTpersona36() {
        return tpersona36;
    }

    public static void setTpersona36(String tpersona36) {
        InfoFamiliar.tpersona36 = tpersona36;
    }

    public static String getTpersona37() {
        return tpersona37;
    }

    public static void setTpersona37(String tpersona37) {
        InfoFamiliar.tpersona37 = tpersona37;
    }

    public static String getTpersona38() {
        return tpersona38;
    }

    public static void setTpersona38(String tpersona38) {
        InfoFamiliar.tpersona38 = tpersona38;
    }

    public static String getTpersona39() {
        return tpersona39;
    }

    public static void setTpersona39(String tpersona39) {
        InfoFamiliar.tpersona39 = tpersona39;
    }

    public static String getTpersona40() {
        return tpersona40;
    }

    public static void setTpersona40(String tpersona40) {
        InfoFamiliar.tpersona40 = tpersona40;
    }

    public static String getTpersona41() {
        return tpersona41;
    }

    public static void setTpersona41(String tpersona41) {
        InfoFamiliar.tpersona41 = tpersona41;
    }

    public static String getTpersona42() {
        return tpersona42;
    }

    public static void setTpersona42(String tpersona42) {
        InfoFamiliar.tpersona42 = tpersona42;
    }

    public static String getTpersona43() {
        return tpersona43;
    }

    public static void setTpersona43(String tpersona43) {
        InfoFamiliar.tpersona43 = tpersona43;
    }

    public static String getTpersona44() {
        return tpersona44;
    }

    public static void setTpersona44(String tpersona44) {
        InfoFamiliar.tpersona44 = tpersona44;
    }

    public static String getTpersona45() {
        return tpersona45;
    }

    public static void setTpersona45(String tpersona45) {
        InfoFamiliar.tpersona45 = tpersona45;
    }

    public static String getTpersona46() {
        return tpersona46;
    }

    public static void setTpersona46(String tpersona46) {
        InfoFamiliar.tpersona46 = tpersona46;
    }

    public static String getTpersona47() {
        return tpersona47;
    }

    public static void setTpersona47(String tpersona47) {
        InfoFamiliar.tpersona47 = tpersona47;
    }

    public static String getTpersona48() {
        return tpersona48;
    }

    public static void setTpersona48(String tpersona48) {
        InfoFamiliar.tpersona48 = tpersona48;
    }

    public static String getTpersona49() {
        return tpersona49;
    }

    public static void setTpersona49(String tpersona49) {
        InfoFamiliar.tpersona49 = tpersona49;
    }

    public static String getCpersona1() {
        return cpersona1;
    }

    public static void setCpersona1(String cpersona1) {
        InfoFamiliar.cpersona1 = cpersona1;
    }

    public static String getCpersona2() {
        return cpersona2;
    }

    public static void setCpersona2(String cpersona2) {
        InfoFamiliar.cpersona2 = cpersona2;
    }

    public static String getCpersona3() {
        return cpersona3;
    }

    public static void setCpersona3(String cpersona3) {
        InfoFamiliar.cpersona3 = cpersona3;
    }

    public static String getCpersona4() {
        return cpersona4;
    }

    public static void setCpersona4(String cpersona4) {
        InfoFamiliar.cpersona4 = cpersona4;
    }

    public static String getCpersona5() {
        return cpersona5;
    }

    public static void setCpersona5(String cpersona5) {
        InfoFamiliar.cpersona5 = cpersona5;
    }

    public static String getCpersona6() {
        return cpersona6;
    }

    public static void setCpersona6(String cpersona6) {
        InfoFamiliar.cpersona6 = cpersona6;
    }

    public static String getCpersona7() {
        return cpersona7;
    }

    public static void setCpersona7(String cpersona7) {
        InfoFamiliar.cpersona7 = cpersona7;
    }

    public static String getCpersona8() {
        return cpersona8;
    }

    public static void setCpersona8(String cpersona8) {
        InfoFamiliar.cpersona8 = cpersona8;
    }

    public static String getCpersona9() {
        return cpersona9;
    }

    public static void setCpersona9(String cpersona9) {
        InfoFamiliar.cpersona9 = cpersona9;
    }

    public static String getCpersona10() {
        return cpersona10;
    }

    public static void setCpersona10(String cpersona10) {
        InfoFamiliar.cpersona10 = cpersona10;
    }

    public static String getCpersona11() {
        return cpersona11;
    }

    public static void setCpersona11(String cpersona11) {
        InfoFamiliar.cpersona11 = cpersona11;
    }

    public static String getCpersona12() {
        return cpersona12;
    }

    public static void setCpersona12(String cpersona12) {
        InfoFamiliar.cpersona12 = cpersona12;
    }

    public static String getCpersona13() {
        return cpersona13;
    }

    public static void setCpersona13(String cpersona13) {
        InfoFamiliar.cpersona13 = cpersona13;
    }

    public static String getCpersona14() {
        return cpersona14;
    }

    public static void setCpersona14(String cpersona14) {
        InfoFamiliar.cpersona14 = cpersona14;
    }

    public static String getCpersona15() {
        return cpersona15;
    }

    public static void setCpersona15(String cpersona15) {
        InfoFamiliar.cpersona15 = cpersona15;
    }

    public static String getCpersona16() {
        return cpersona16;
    }

    public static void setCpersona16(String cpersona16) {
        InfoFamiliar.cpersona16 = cpersona16;
    }

    public static String getCpersona17() {
        return cpersona17;
    }

    public static void setCpersona17(String cpersona17) {
        InfoFamiliar.cpersona17 = cpersona17;
    }

    public static String getCpersona18() {
        return cpersona18;
    }

    public static void setCpersona18(String cpersona18) {
        InfoFamiliar.cpersona18 = cpersona18;
    }

    public static String getCpersona19() {
        return cpersona19;
    }

    public static void setCpersona19(String cpersona19) {
        InfoFamiliar.cpersona19 = cpersona19;
    }

    public static String getCpersona20() {
        return cpersona20;
    }

    public static void setCpersona20(String cpersona20) {
        InfoFamiliar.cpersona20 = cpersona20;
    }

    public static String getCpersona21() {
        return cpersona21;
    }

    public static void setCpersona21(String cpersona21) {
        InfoFamiliar.cpersona21 = cpersona21;
    }

    public static String getCpersona22() {
        return cpersona22;
    }

    public static void setCpersona22(String cpersona22) {
        InfoFamiliar.cpersona22 = cpersona22;
    }

    SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");
    java.util.Date fecha = new java.util.Date();
    public String fechanow = date.format(fecha);

    public void validarfamiliaridad() {
        //1
        if ("hay".equals(tpersona1)) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM vivecon_poli  WHERE tpersona = 'Amigos' AND  no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune > 0) {
                    try {
                        PreparedStatement sqlfami = Conexion.connection.prepareStatement("UPDATE vivecon_poli "
                                + "SET cpersona = '" + cpersona1 + "' WHERE  tpersona = 'Amigos' AND no_id = " + txtnoiden.getText() + "  ");
                        sqlfami.executeUpdate();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "¡Error en el ingreso de datos a la base!\nPor favor solicite ayuda al equipo de desarrollo" + e);
                    }
                } else if (cune < 1) {
                    try {
                        PreparedStatement sqlins = Conexion.connection.prepareStatement("INSERT INTO vivecon_poli "
                                + "(no_id, tpersona, cpersona, fechacreacion)"
                                + " VALUES (?,?,?,?)");
                        sqlins.setString(1, txtnoiden.getText());
                        sqlins.setString(2, "Amigos");
                        sqlins.setString(3, cpersona1);
                        sqlins.setString(4, fechanow);
                        sqlins.executeUpdate();
                    } catch (Exception e) {
//                            JOptionPane.showMessageDialog(null, "nooooo se insertaron en salud" + e);
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else if ("nohay".equals(tpersona1)) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM vivecon_poli  WHERE tpersona = 'Amigos' AND no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune > 0) {
                    try {
                        PreparedStatement sqlpsiup = Conexion.connection.prepareStatement("DELETE FROM vivecon_poli WHERE tpersona = 'Amigos' AND no_id = " + txtnoiden.getText());
                        sqlpsiup.executeUpdate();
                    } catch (Exception e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        //2
        if ("hay".equals(tpersona2)) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM vivecon_poli  WHERE tpersona = 'Abuelos' AND  no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune > 0) {
                    try {
                        PreparedStatement sqlfami = Conexion.connection.prepareStatement("UPDATE vivecon_poli "
                                + "SET cpersona = '" + cpersona2 + "' WHERE tpersona = 'Abuelos' AND no_id = " + txtnoiden.getText() + "  ");
                        sqlfami.executeUpdate();
                    } catch (Exception e) {
                    }
                } else if (cune < 1) {
                    try {
                        PreparedStatement sqlins = Conexion.connection.prepareStatement("INSERT INTO vivecon_poli "
                                + "(no_id, tpersona, cpersona, fechacreacion)"
                                + " VALUES (?,?,?,?)");
                        sqlins.setString(1, txtnoiden.getText());
                        sqlins.setString(2, "Abuelos");
                        sqlins.setString(3, cpersona2);
                        sqlins.setString(4, fechanow);
                        sqlins.executeUpdate();
                    } catch (Exception e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else if ("nohay".equals(tpersona2)) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM vivecon_poli  WHERE tpersona = 'Abuelos' AND no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune > 0) {
                    try {
                        PreparedStatement sqlpsiup = Conexion.connection.prepareStatement("DELETE FROM vivecon_poli WHERE tpersona = 'Abuelos' AND no_id = " + txtnoiden.getText());
                        sqlpsiup.executeUpdate();
                    } catch (Exception e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        //3
        if ("hay".equals(tpersona3)) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM vivecon_poli  WHERE tpersona = 'Cuñado' AND  no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune > 0) {
                    try {
                        PreparedStatement sqlfami = Conexion.connection.prepareStatement("UPDATE vivecon_poli "
                                + "SET cpersona = '" + cpersona3 + "' WHERE tpersona = 'Cuñado' AND  no_id = " + txtnoiden.getText() + "  ");
                        sqlfami.executeUpdate();
                    } catch (Exception e) {
                    }
                } else if (cune < 1) {
                    try {
                        PreparedStatement sqlins = Conexion.connection.prepareStatement("INSERT INTO vivecon_poli "
                                + "(no_id, tpersona, cpersona, fechacreacion)"
                                + " VALUES (?,?,?,?)");
                        sqlins.setString(1, txtnoiden.getText());
                        sqlins.setString(2, "Cuñado");
                        sqlins.setString(3, cpersona3);
                        sqlins.setString(4, fechanow);
                        sqlins.executeUpdate();
                    } catch (Exception e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else if ("nohay".equals(tpersona3)) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM vivecon_poli  WHERE tpersona = 'Cuñado' AND no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune > 0) {
                    try {
                        PreparedStatement sqlpsiup = Conexion.connection.prepareStatement("DELETE FROM vivecon_poli WHERE tpersona = 'Cuñado' AND no_id = " + txtnoiden.getText());
                        sqlpsiup.executeUpdate();
                    } catch (Exception e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        //4
        if ("hay".equals(tpersona4)) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM vivecon_poli  WHERE tpersona = 'Cuñada' AND  no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune > 0) {
                    try {
                        PreparedStatement sqlfami = Conexion.connection.prepareStatement("UPDATE vivecon_poli "
                                + "SET cpersona = '" + cpersona4 + "' WHERE tpersona = 'Cuñada' AND  no_id = " + txtnoiden.getText() + "  ");
                        sqlfami.executeUpdate();
                    } catch (Exception e) {
                    }
                } else if (cune < 1) {
                    try {
                        PreparedStatement sqlins = Conexion.connection.prepareStatement("INSERT INTO vivecon_poli "
                                + "(no_id, tpersona, cpersona, fechacreacion)"
                                + " VALUES (?,?,?,?)");
                        sqlins.setString(1, txtnoiden.getText());
                        sqlins.setString(2, "Cuñada");
                        sqlins.setString(3, cpersona4);
                        sqlins.setString(4, fechanow);
                        sqlins.executeUpdate();
                    } catch (Exception e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else if ("nohay".equals(tpersona4)) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM vivecon_poli  WHERE tpersona = 'Cuñada' AND no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune > 0) {
                    try {
                        PreparedStatement sqlpsiup = Conexion.connection.prepareStatement("DELETE FROM vivecon_poli WHERE tpersona = 'Cuñada' AND no_id = " + txtnoiden.getText());
                        sqlpsiup.executeUpdate();
                    } catch (Exception e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        //5
        if ("hay".equals(tpersona5)) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM vivecon_poli  WHERE tpersona = 'Cuñados' AND  no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune < 1) {
                    try {
                        PreparedStatement sqlins = Conexion.connection.prepareStatement("INSERT INTO vivecon_poli "
                                + "(no_id, tpersona, cpersona, fechacreacion)"
                                + " VALUES (?,?,?,?)");
                        sqlins.setString(1, txtnoiden.getText());
                        sqlins.setString(2, "Cuñados");
                        sqlins.setString(3, "2");
                        sqlins.setString(4, fechanow);
                        sqlins.executeUpdate();
                    } catch (Exception e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else if ("nohay".equals(tpersona5)) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM vivecon_poli  WHERE tpersona = 'Cuñados' AND no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune > 0) {
                    try {
                        PreparedStatement sqlpsiup = Conexion.connection.prepareStatement("DELETE FROM vivecon_poli WHERE tpersona = 'Cuñados' AND no_id = " + txtnoiden.getText());
                        sqlpsiup.executeUpdate();
                    } catch (Exception e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        //6
        if ("hay".equals(tpersona6)) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM vivecon_poli  WHERE tpersona = 'Compañeros' AND  no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune > 0) {
                    try {
                        PreparedStatement sqlfami = Conexion.connection.prepareStatement("UPDATE vivecon_poli "
                                + "SET cpersona = '" + cpersona5 + "' WHERE tpersona = 'Compañeros' AND  no_id = " + txtnoiden.getText() + "  ");
                        sqlfami.executeUpdate();
                    } catch (Exception e) {
                    }
                } else if (cune < 1) {
                    try {
                        PreparedStatement sqlins = Conexion.connection.prepareStatement("INSERT INTO vivecon_poli "
                                + "(no_id, tpersona, cpersona, fechacreacion)"
                                + " VALUES (?,?,?,?)");
                        sqlins.setString(1, txtnoiden.getText());
                        sqlins.setString(2, "Compañeros");
                        sqlins.setString(3, cpersona5);
                        sqlins.setString(4, fechanow);
                        sqlins.executeUpdate();
                    } catch (Exception e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else if ("nohay".equals(tpersona6)) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM vivecon_poli  WHERE tpersona = 'Compañeros' AND no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune > 0) {
                    try {
                        PreparedStatement sqlpsiup = Conexion.connection.prepareStatement("DELETE FROM vivecon_poli WHERE tpersona = 'Compañeros' AND no_id = " + txtnoiden.getText());
                        sqlpsiup.executeUpdate();
                    } catch (Exception e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        //7
        if ("hay".equals(tpersona7)) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM vivecon_poli  WHERE tpersona = 'Esposo' AND  no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune < 1) {
                    try {
                        PreparedStatement sqlins = Conexion.connection.prepareStatement("INSERT INTO vivecon_poli "
                                + "(no_id, tpersona, cpersona, fechacreacion)"
                                + " VALUES (?,?,?,?)");
                        sqlins.setString(1, txtnoiden.getText());
                        sqlins.setString(2, "Esposo");
                        sqlins.setString(3, "1");
                        sqlins.setString(4, fechanow);
                        sqlins.executeUpdate();
                    } catch (Exception e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else if ("nohay".equals(tpersona7)) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM vivecon_poli  WHERE tpersona = 'Esposo' AND no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune > 0) {
                    try {
                        PreparedStatement sqlpsiup = Conexion.connection.prepareStatement("DELETE FROM vivecon_poli WHERE tpersona = 'Esposo' AND no_id = " + txtnoiden.getText());
                        sqlpsiup.executeUpdate();
                    } catch (Exception e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        //8
        if ("hay".equals(tpersona8)) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM vivecon_poli  WHERE tpersona = 'Esposa' AND  no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune < 1) {
                    try {
                        PreparedStatement sqlins = Conexion.connection.prepareStatement("INSERT INTO vivecon_poli "
                                + "(no_id, tpersona, cpersona, fechacreacion)"
                                + " VALUES (?,?,?,?)");
                        sqlins.setString(1, txtnoiden.getText());
                        sqlins.setString(2, "Esposa");
                        sqlins.setString(3, "1");
                        sqlins.setString(4, fechanow);
                        sqlins.executeUpdate();
                    } catch (Exception e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else if ("nohay".equals(tpersona8)) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM vivecon_poli  WHERE tpersona = 'Esposa' AND no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune > 0) {
                    try {
                        PreparedStatement sqlpsiup = Conexion.connection.prepareStatement("DELETE FROM vivecon_poli WHERE tpersona = 'Esposa' AND no_id = " + txtnoiden.getText());
                        sqlpsiup.executeUpdate();
                    } catch (Exception e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        //9
        if ("hay".equals(tpersona9)) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM vivecon_poli  WHERE tpersona = 'Esposo de tío' AND  no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune < 1) {
                    try {
                        PreparedStatement sqlins = Conexion.connection.prepareStatement("INSERT INTO vivecon_poli "
                                + "(no_id, tpersona, cpersona, fechacreacion)"
                                + " VALUES (?,?,?,?)");
                        sqlins.setString(1, txtnoiden.getText());
                        sqlins.setString(2, "Esposo de tío");
                        sqlins.setString(3, "1");
                        sqlins.setString(4, fechanow);
                        sqlins.executeUpdate();
                    } catch (Exception e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else if ("nohay".equals(tpersona9)) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM vivecon_poli  WHERE tpersona = 'Esposo de tío' AND no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune > 0) {
                    try {
                        PreparedStatement sqlpsiup = Conexion.connection.prepareStatement("DELETE FROM vivecon_poli WHERE tpersona = 'Esposo de tío' AND no_id = " + txtnoiden.getText());
                        sqlpsiup.executeUpdate();
                    } catch (Exception e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        //10
        if ("hay".equals(tpersona10)) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM vivecon_poli  WHERE tpersona = 'Esposo de tía' AND  no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune < 1) {
                    try {
                        PreparedStatement sqlins = Conexion.connection.prepareStatement("INSERT INTO vivecon_poli "
                                + "(no_id, tpersona, cpersona, fechacreacion)"
                                + " VALUES (?,?,?,?)");
                        sqlins.setString(1, txtnoiden.getText());
                        sqlins.setString(2, "Esposo de tía");
                        sqlins.setString(3, "1");
                        sqlins.setString(4, fechanow);
                        sqlins.executeUpdate();
                    } catch (Exception e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else if ("nohay".equals(tpersona10)) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM vivecon_poli  WHERE tpersona = 'Esposo de tía' AND no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune > 0) {
                    try {
                        PreparedStatement sqlpsiup = Conexion.connection.prepareStatement("DELETE FROM vivecon_poli WHERE tpersona = 'Esposo de tía' AND no_id = " + txtnoiden.getText());
                        sqlpsiup.executeUpdate();
                    } catch (Exception e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        //11
        if ("hay".equals(tpersona11)) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM vivecon_poli  WHERE tpersona = 'Familia cuñado' AND  no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune < 1) {
                    try {
                        PreparedStatement sqlins = Conexion.connection.prepareStatement("INSERT INTO vivecon_poli "
                                + "(no_id, tpersona, cpersona, fechacreacion)"
                                + " VALUES (?,?,?,?)");
                        sqlins.setString(1, txtnoiden.getText());
                        sqlins.setString(2, "Familia cuñado");
                        sqlins.setString(3, "1");
                        sqlins.setString(4, fechanow);
                        sqlins.executeUpdate();
                    } catch (Exception e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else if ("nohay".equals(tpersona11)) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM vivecon_poli  WHERE tpersona = 'Familia cuñado' AND no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune > 0) {
                    try {
                        PreparedStatement sqlpsiup = Conexion.connection.prepareStatement("DELETE FROM vivecon_poli WHERE tpersona = 'Familia cuñado' AND no_id = " + txtnoiden.getText());
                        sqlpsiup.executeUpdate();
                    } catch (Exception e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        //12
        if ("hay".equals(tpersona12)) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM vivecon_poli  WHERE tpersona = 'Familia primo' AND  no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune < 1) {
                    try {
                        PreparedStatement sqlins = Conexion.connection.prepareStatement("INSERT INTO vivecon_poli "
                                + "(no_id, tpersona, cpersona, fechacreacion)"
                                + " VALUES (?,?,?,?)");
                        sqlins.setString(1, txtnoiden.getText());
                        sqlins.setString(2, "Familia primo");
                        sqlins.setString(3, "1");
                        sqlins.setString(4, fechanow);
                        sqlins.executeUpdate();
                    } catch (Exception e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else if ("nohay".equals(tpersona12)) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM vivecon_poli  WHERE tpersona = 'Familia primo' AND no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune > 0) {
                    try {
                        PreparedStatement sqlpsiup = Conexion.connection.prepareStatement("DELETE FROM vivecon_poli WHERE tpersona = 'Familia primo' AND no_id = " + txtnoiden.getText());
                        sqlpsiup.executeUpdate();
                    } catch (Exception e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        //13
        if ("hay".equals(tpersona13)) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM vivecon_poli  WHERE tpersona = 'Hijos' AND  no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune < 1) {
                    try {
                        PreparedStatement sqlins = Conexion.connection.prepareStatement("INSERT INTO vivecon_poli "
                                + "(no_id, tpersona, cpersona, fechacreacion)"
                                + " VALUES (?,?,?,?)");
                        sqlins.setString(1, txtnoiden.getText());
                        sqlins.setString(2, "Hijos");
                        sqlins.setString(3, "2");
                        sqlins.setString(4, fechanow);
                        sqlins.executeUpdate();
                    } catch (Exception e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else if ("nohay".equals(tpersona13)) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM vivecon_poli  WHERE tpersona = 'Hijos' AND no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune > 0) {
                    try {
                        PreparedStatement sqlpsiup = Conexion.connection.prepareStatement("DELETE FROM vivecon_poli WHERE tpersona = 'Hijos' AND no_id = " + txtnoiden.getText());
                        sqlpsiup.executeUpdate();
                    } catch (Exception e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        //14
        if ("hay".equals(tpersona14)) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM vivecon_poli  WHERE tpersona = 'Hijo' AND  no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune > 0) {
                    try {
                        PreparedStatement sqlfami = Conexion.connection.prepareStatement("UPDATE vivecon_poli "
                                + "SET cpersona = '" + cpersona6 + "' WHERE tpersona = 'Hijo' AND  no_id = " + txtnoiden.getText());
                        sqlfami.executeUpdate();
                    } catch (Exception e) {
                    }
                } else if (cune < 1) {
                    try {
                        PreparedStatement sqlins = Conexion.connection.prepareStatement("INSERT INTO vivecon_poli "
                                + "(no_id, tpersona, cpersona, fechacreacion)"
                                + " VALUES (?,?,?,?)");
                        sqlins.setString(1, txtnoiden.getText());
                        sqlins.setString(2, "Hijo");
                        sqlins.setString(3, cpersona6);
                        sqlins.setString(4, fechanow);
                        sqlins.executeUpdate();
                    } catch (Exception e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else if ("nohay".equals(tpersona14)) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM vivecon_poli  WHERE tpersona = 'Hijo' AND no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune > 0) {
                    try {
                        PreparedStatement sqlpsiup = Conexion.connection.prepareStatement("DELETE FROM vivecon_poli WHERE tpersona = 'Hijo' AND no_id = " + txtnoiden.getText());
                        sqlpsiup.executeUpdate();
                    } catch (Exception e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        //15
        if ("hay".equals(tpersona15)) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM vivecon_poli  WHERE tpersona = 'Hija' AND  no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune > 0) {
                    try {
                        PreparedStatement sqlfami = Conexion.connection.prepareStatement("UPDATE vivecon_poli "
                                + "SET cpersona = '" + cpersona7 + "' WHERE tpersona = 'Hija' AND  no_id = " + txtnoiden.getText() + "  ");
                        sqlfami.executeUpdate();
                    } catch (Exception e) {
                    }
                } else if (cune < 1) {
                    try {
                        PreparedStatement sqlins = Conexion.connection.prepareStatement("INSERT INTO vivecon_poli "
                                + "(no_id, tpersona, cpersona, fechacreacion)"
                                + " VALUES (?,?,?,?)");
                        sqlins.setString(1, txtnoiden.getText());
                        sqlins.setString(2, "Hija");
                        sqlins.setString(3, cpersona7);
                        sqlins.setString(4, fechanow);
                        sqlins.executeUpdate();
                    } catch (Exception e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else if ("nohay".equals(tpersona15)) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM vivecon_poli  WHERE tpersona = 'Hija' AND no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune > 0) {
                    try {
                        PreparedStatement sqlpsiup = Conexion.connection.prepareStatement("DELETE FROM vivecon_poli WHERE tpersona = 'Hija' AND no_id = " + txtnoiden.getText());
                        sqlpsiup.executeUpdate();
                    } catch (Exception e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        //16
        if ("hay".equals(tpersona16)) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM vivecon_poli  WHERE tpersona = 'Hijastro' AND  no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune > 0) {
                    try {
                        PreparedStatement sqlfami = Conexion.connection.prepareStatement("UPDATE vivecon_poli "
                                + "SET cpersona = '" + cpersona8 + "' WHERE  tpersona = 'Hijastro' AND  no_id = " + txtnoiden.getText() + "  ");
                        sqlfami.executeUpdate();
                    } catch (Exception e) {
                    }
                } else if (cune < 1) {
                    try {
                        PreparedStatement sqlins = Conexion.connection.prepareStatement("INSERT INTO vivecon_poli "
                                + "(no_id, tpersona, cpersona, fechacreacion)"
                                + " VALUES (?,?,?,?)");
                        sqlins.setString(1, txtnoiden.getText());
                        sqlins.setString(2, "Hijastro");
                        sqlins.setString(3, cpersona8);
                        sqlins.setString(4, fechanow);
                        sqlins.executeUpdate();
                    } catch (Exception e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else if ("nohay".equals(tpersona16)) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM vivecon_poli  WHERE tpersona = 'Hijastro' AND no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune > 0) {
                    try {
                        PreparedStatement sqlpsiup = Conexion.connection.prepareStatement("DELETE FROM vivecon_poli WHERE tpersona = 'Hijastro' AND no_id = " + txtnoiden.getText());
                        sqlpsiup.executeUpdate();
                    } catch (Exception e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        //17
        if ("hay".equals(tpersona17)) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM vivecon_poli  WHERE tpersona = 'Hijastra' AND  no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune > 0) {
                    try {
                        PreparedStatement sqlfami = Conexion.connection.prepareStatement("UPDATE vivecon_poli "
                                + "SET cpersona = '" + cpersona9 + "' WHERE tpersona = 'Hijastra' AND  no_id = " + txtnoiden.getText() + "  ");
                        sqlfami.executeUpdate();
                    } catch (Exception e) {
                    }
                } else if (cune < 1) {
                    try {
                        PreparedStatement sqlins = Conexion.connection.prepareStatement("INSERT INTO vivecon_poli "
                                + "(no_id, tpersona, cpersona, fechacreacion)"
                                + " VALUES (?,?,?,?)");
                        sqlins.setString(1, txtnoiden.getText());
                        sqlins.setString(2, "Hijastra");
                        sqlins.setString(3, cpersona9);
                        sqlins.setString(4, fechanow);
                        sqlins.executeUpdate();
                    } catch (Exception e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else if ("nohay".equals(tpersona17)) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM vivecon_poli  WHERE tpersona = 'Hijastra' AND no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune > 0) {
                    try {
                        PreparedStatement sqlpsiup = Conexion.connection.prepareStatement("DELETE FROM vivecon_poli WHERE tpersona = 'Hijastra' AND no_id = " + txtnoiden.getText());
                        sqlpsiup.executeUpdate();
                    } catch (Exception e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        //18
        if ("hay".equals(tpersona18)) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM vivecon_poli  WHERE tpersona = 'Hermana' AND  no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune > 0) {
                    try {
                        PreparedStatement sqlfami = Conexion.connection.prepareStatement("UPDATE vivecon_poli "
                                + "SET cpersona = '" + cpersona10 + "' WHERE tpersona = 'Hermana' AND  no_id = " + txtnoiden.getText() + "  ");
                        sqlfami.executeUpdate();
                    } catch (Exception e) {
                    }
                } else if (cune < 1) {
                    try {
                        PreparedStatement sqlins = Conexion.connection.prepareStatement("INSERT INTO vivecon_poli "
                                + "(no_id, tpersona, cpersona, fechacreacion)"
                                + " VALUES (?,?,?,?)");
                        sqlins.setString(1, txtnoiden.getText());
                        sqlins.setString(2, "Hermana");
                        sqlins.setString(3, cpersona10);
                        sqlins.setString(4, fechanow);
                        sqlins.executeUpdate();
                    } catch (Exception e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else if ("nohay".equals(tpersona18)) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM vivecon_poli  WHERE tpersona = 'Hermana' AND no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune > 0) {
                    try {
                        PreparedStatement sqlpsiup = Conexion.connection.prepareStatement("DELETE FROM vivecon_poli WHERE tpersona = 'Hermana' AND no_id = " + txtnoiden.getText());
                        sqlpsiup.executeUpdate();
                    } catch (Exception e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        //19
        if ("hay".equals(tpersona19)) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM vivecon_poli  WHERE tpersona = 'Hermano' AND  no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune > 0) {
                    try {
                        PreparedStatement sqlfami = Conexion.connection.prepareStatement("UPDATE vivecon_poli "
                                + "SET cpersona = '" + cpersona11 + "' WHERE tpersona = 'Hermano' AND no_id = " + txtnoiden.getText() + "  ");
                        sqlfami.executeUpdate();
                    } catch (Exception e) {
                    }
                } else if (cune < 1) {
                    try {
                        PreparedStatement sqlins = Conexion.connection.prepareStatement("INSERT INTO vivecon_poli "
                                + "(no_id, tpersona, cpersona, fechacreacion)"
                                + " VALUES (?,?,?,?)");
                        sqlins.setString(1, txtnoiden.getText());
                        sqlins.setString(2, "Hermano");
                        sqlins.setString(3, cpersona11);
                        sqlins.setString(4, fechanow);
                        sqlins.executeUpdate();
                    } catch (Exception e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else if ("nohay".equals(tpersona19)) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM vivecon_poli  WHERE tpersona = 'Hermano' AND no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune > 0) {
                    try {
                        PreparedStatement sqlpsiup = Conexion.connection.prepareStatement("DELETE FROM vivecon_poli WHERE tpersona = 'Hermano' AND no_id = " + txtnoiden.getText());
                        sqlpsiup.executeUpdate();
                    } catch (Exception e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        //20
        if ("hay".equals(tpersona20)) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM vivecon_poli  WHERE tpersona = 'Hermanastro' AND  no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune > 0) {
                    try {
                        PreparedStatement sqlfami = Conexion.connection.prepareStatement("UPDATE vivecon_poli "
                                + "SET cpersona = '" + cpersona12 + "' WHERE tpersona = 'Hermanastro' AND  no_id = " + txtnoiden.getText() + "  ");
                        sqlfami.executeUpdate();
                    } catch (Exception e) {
                    }
                } else if (cune < 1) {
                    try {
                        PreparedStatement sqlins = Conexion.connection.prepareStatement("INSERT INTO vivecon_poli "
                                + "(no_id, tpersona, cpersona, fechacreacion)"
                                + " VALUES (?,?,?,?)");
                        sqlins.setString(1, txtnoiden.getText());
                        sqlins.setString(2, "Hermanastro");
                        sqlins.setString(3, cpersona12);
                        sqlins.setString(4, fechanow);
                        sqlins.executeUpdate();
                    } catch (Exception e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else if ("nohay".equals(tpersona20)) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM vivecon_poli  WHERE tpersona = 'Hermanastro' AND no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune > 0) {
                    try {
                        PreparedStatement sqlpsiup = Conexion.connection.prepareStatement("DELETE FROM vivecon_poli WHERE tpersona = 'Hermanastro' AND no_id = " + txtnoiden.getText());
                        sqlpsiup.executeUpdate();
                    } catch (Exception e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        //21
        if ("hay".equals(tpersona21)) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM vivecon_poli  WHERE tpersona = 'Hermanastra' AND  no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune > 0) {
                    try {
                        PreparedStatement sqlfami = Conexion.connection.prepareStatement("UPDATE vivecon_poli "
                                + "SET cpersona = '" + cpersona13 + "' WHERE tpersona = 'Hermanastra' AND no_id = " + txtnoiden.getText() + "  ");
                        sqlfami.executeUpdate();
                    } catch (Exception e) {
                    }
                } else if (cune < 1) {
                    try {
                        PreparedStatement sqlins = Conexion.connection.prepareStatement("INSERT INTO vivecon_poli "
                                + "(no_id, tpersona, cpersona, fechacreacion)"
                                + " VALUES (?,?,?,?)");
                        sqlins.setString(1, txtnoiden.getText());
                        sqlins.setString(2, "Hermanastra");
                        sqlins.setString(3, cpersona13);
                        sqlins.setString(4, fechanow);
                        sqlins.executeUpdate();
                    } catch (Exception e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else if ("nohay".equals(tpersona21)) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM vivecon_poli  WHERE tpersona = 'Hermanastra' AND no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune > 0) {
                    try {
                        PreparedStatement sqlpsiup = Conexion.connection.prepareStatement("DELETE FROM vivecon_poli WHERE tpersona = 'Hermanastra' AND no_id = " + txtnoiden.getText());
                        sqlpsiup.executeUpdate();
                    } catch (Exception e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        //22
        if ("hay".equals(tpersona22)) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM vivecon_poli  WHERE tpersona = 'Hermano adoptivo' AND  no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune > 0) {
                    try {
                        PreparedStatement sqlfami = Conexion.connection.prepareStatement("UPDATE vivecon_poli "
                                + "SET cpersona = '" + cpersona14 + "' WHERE no_id = " + txtnoiden.getText() + "  ");
                        sqlfami.executeUpdate();
                    } catch (Exception e) {
                    }
                } else if (cune < 1) {
                    try {
                        PreparedStatement sqlins = Conexion.connection.prepareStatement("INSERT INTO vivecon_poli "
                                + "(no_id, tpersona, cpersona, fechacreacion)"
                                + " VALUES (?,?,?,?)");
                        sqlins.setString(1, txtnoiden.getText());
                        sqlins.setString(2, "Hermano adoptivo");
                        sqlins.setString(3, cpersona14);
                        sqlins.setString(4, fechanow);
                        sqlins.executeUpdate();
                    } catch (Exception e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else if ("nohay".equals(tpersona22)) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM vivecon_poli  WHERE tpersona = 'Hermano adoptivo' AND no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune > 0) {
                    try {
                        PreparedStatement sqlpsiup = Conexion.connection.prepareStatement("DELETE FROM vivecon_poli WHERE tpersona = 'Hermano adoptivo' AND no_id = " + txtnoiden.getText());
                        sqlpsiup.executeUpdate();
                    } catch (Exception e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        //23
        if ("hay".equals(tpersona23)) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM vivecon_poli  WHERE tpersona = 'Hermana adoptiva' AND  no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune > 0) {
                    try {
                        PreparedStatement sqlfami = Conexion.connection.prepareStatement("UPDATE vivecon_poli "
                                + "SET cpersona = '" + cpersona15 + "' WHERE no_id = " + txtnoiden.getText() + "  ");
                        sqlfami.executeUpdate();
                    } catch (Exception e) {
                    }
                } else if (cune < 1) {
                    try {
                        PreparedStatement sqlins = Conexion.connection.prepareStatement("INSERT INTO vivecon_poli "
                                + "(no_id, tpersona, cpersona, fechacreacion)"
                                + " VALUES (?,?,?,?)");
                        sqlins.setString(1, txtnoiden.getText());
                        sqlins.setString(2, "Hermana adoptiva");
                        sqlins.setString(3, cpersona15);
                        sqlins.setString(4, fechanow);
                        sqlins.executeUpdate();
                    } catch (Exception e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else if ("nohay".equals(tpersona23)) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM vivecon_poli  WHERE tpersona = 'Hermana adoptiva' AND no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune > 0) {
                    try {
                        PreparedStatement sqlpsiup = Conexion.connection.prepareStatement("DELETE FROM vivecon_poli WHERE tpersona = 'Hermana adoptiva' AND no_id = " + txtnoiden.getText());
                        sqlpsiup.executeUpdate();
                    } catch (Exception e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        //24
        if ("hay".equals(tpersona24)) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM vivecon_poli  WHERE tpersona = 'Madre biológica' AND  no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune < 1) {
                    try {
                        PreparedStatement sqlins = Conexion.connection.prepareStatement("INSERT INTO vivecon_poli "
                                + "(no_id, tpersona, cpersona, fechacreacion)"
                                + " VALUES (?,?,?,?)");
                        sqlins.setString(1, txtnoiden.getText());
                        sqlins.setString(2, "Madre biológica");
                        sqlins.setString(3, "1");
                        sqlins.setString(4, fechanow);
                        sqlins.executeUpdate();
                    } catch (Exception e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else if ("nohay".equals(tpersona24)) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM vivecon_poli  WHERE tpersona = 'Madre biológica' AND no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune > 0) {
                    try {
                        PreparedStatement sqlpsiup = Conexion.connection.prepareStatement("DELETE FROM vivecon_poli WHERE tpersona = 'Madre biológica' AND no_id = " + txtnoiden.getText());
                        sqlpsiup.executeUpdate();
                    } catch (Exception e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        //25
        if ("hay".equals(tpersona25)) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM vivecon_poli  WHERE tpersona = 'Madre adoptiva' AND  no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune < 1) {
                    try {
                        PreparedStatement sqlins = Conexion.connection.prepareStatement("INSERT INTO vivecon_poli "
                                + "(no_id, tpersona, cpersona, fechacreacion)"
                                + " VALUES (?,?,?,?)");
                        sqlins.setString(1, txtnoiden.getText());
                        sqlins.setString(2, "Madre adoptiva");
                        sqlins.setString(3, "1");
                        sqlins.setString(4, fechanow);
                        sqlins.executeUpdate();
                    } catch (Exception e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else if ("nohay".equals(tpersona25)) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM vivecon_poli  WHERE tpersona = 'Madre adoptiva' AND no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune > 0) {
                    try {
                        PreparedStatement sqlpsiup = Conexion.connection.prepareStatement("DELETE FROM vivecon_poli WHERE tpersona = 'Madre adoptiva' AND no_id = " + txtnoiden.getText());
                        sqlpsiup.executeUpdate();
                    } catch (Exception e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        //26
        if ("hay".equals(tpersona26)) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM vivecon_poli  WHERE tpersona = 'Madre de su hijo' AND  no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune < 1) {
                    try {
                        PreparedStatement sqlins = Conexion.connection.prepareStatement("INSERT INTO vivecon_poli "
                                + "(no_id, tpersona, cpersona, fechacreacion)"
                                + " VALUES (?,?,?,?)");
                        sqlins.setString(1, txtnoiden.getText());
                        sqlins.setString(2, "Madre de su hijo");
                        sqlins.setString(3, "1");
                        sqlins.setString(4, fechanow);
                        sqlins.executeUpdate();
                    } catch (Exception e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else if ("nohay".equals(tpersona26)) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM vivecon_poli  WHERE tpersona = 'Madre de su hijo' AND no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune > 0) {
                    try {
                        PreparedStatement sqlpsiup = Conexion.connection.prepareStatement("DELETE FROM vivecon_poli WHERE tpersona = 'Madre de su hijo' AND no_id = " + txtnoiden.getText());
                        sqlpsiup.executeUpdate();
                    } catch (Exception e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        //27
        if ("hay".equals(tpersona27)) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM vivecon_poli  WHERE tpersona = 'Solo' AND  no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune < 1) {
                    try {
                        PreparedStatement sqlins = Conexion.connection.prepareStatement("INSERT INTO vivecon_poli "
                                + "(no_id, tpersona, cpersona, fechacreacion)"
                                + " VALUES (?,?,?,?)");
                        sqlins.setString(1, txtnoiden.getText());
                        sqlins.setString(2, "Solo");
                        sqlins.setString(3, "");
                        sqlins.setString(4, fechanow);
                        sqlins.executeUpdate();
                    } catch (Exception e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else if ("nohay".equals(tpersona27)) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM vivecon_poli  WHERE tpersona = 'Solo' AND no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune > 0) {
                    try {
                        PreparedStatement sqlpsiup = Conexion.connection.prepareStatement("DELETE FROM vivecon_poli WHERE tpersona = 'Solo' AND no_id = " + txtnoiden.getText());
                        sqlpsiup.executeUpdate();
                    } catch (Exception e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        //28
        if ("hay".equals(tpersona28)) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM vivecon_poli  WHERE tpersona = 'Nuera' AND  no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune < 1) {
                    try {
                        PreparedStatement sqlins = Conexion.connection.prepareStatement("INSERT INTO vivecon_poli "
                                + "(no_id, tpersona, cpersona, fechacreacion)"
                                + " VALUES (?,?,?,?)");
                        sqlins.setString(1, txtnoiden.getText());
                        sqlins.setString(2, "Nuera");
                        sqlins.setString(3, "1");
                        sqlins.setString(4, fechanow);
                        sqlins.executeUpdate();
                    } catch (Exception e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else if ("nohay".equals(tpersona28)) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM vivecon_poli  WHERE tpersona = 'Nuera' AND no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune > 0) {
                    try {
                        PreparedStatement sqlpsiup = Conexion.connection.prepareStatement("DELETE FROM vivecon_poli WHERE tpersona = 'Nuera' AND no_id = " + txtnoiden.getText());
                        sqlpsiup.executeUpdate();
                    } catch (Exception e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        //29
        if ("hay".equals(tpersona29)) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM vivecon_poli  WHERE tpersona = 'Padre biológico' AND  no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune < 1) {
                    try {
                        PreparedStatement sqlins = Conexion.connection.prepareStatement("INSERT INTO vivecon_poli "
                                + "(no_id, tpersona, cpersona, fechacreacion)"
                                + " VALUES (?,?,?,?)");
                        sqlins.setString(1, txtnoiden.getText());
                        sqlins.setString(2, "Padre biológico");
                        sqlins.setString(3, "1");
                        sqlins.setString(4, fechanow);
                        sqlins.executeUpdate();
                    } catch (Exception e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else if ("nohay".equals(tpersona29)) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM vivecon_poli  WHERE tpersona = 'Padre biológico' AND no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune > 0) {
                    try {
                        PreparedStatement sqlpsiup = Conexion.connection.prepareStatement("DELETE FROM vivecon_poli WHERE tpersona = 'Padre biológico' AND no_id = " + txtnoiden.getText());
                        sqlpsiup.executeUpdate();
                    } catch (Exception e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        //30
        if ("hay".equals(tpersona30)) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM vivecon_poli  WHERE tpersona = 'Padre adoptivo' AND  no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune < 1) {
                    try {
                        PreparedStatement sqlins = Conexion.connection.prepareStatement("INSERT INTO vivecon_poli "
                                + "(no_id, tpersona, cpersona, fechacreacion)"
                                + " VALUES (?,?,?,?)");
                        sqlins.setString(1, txtnoiden.getText());
                        sqlins.setString(2, "Padre adoptivo");
                        sqlins.setString(3, "1");
                        sqlins.setString(4, fechanow);
                        sqlins.executeUpdate();
                    } catch (Exception e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else if ("nohay".equals(tpersona30)) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM vivecon_poli  WHERE tpersona = 'Padre adoptivo' AND no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune > 0) {
                    try {
                        PreparedStatement sqlpsiup = Conexion.connection.prepareStatement("DELETE FROM vivecon_poli WHERE tpersona = 'Padre adoptivo' AND no_id = " + txtnoiden.getText());
                        sqlpsiup.executeUpdate();
                    } catch (Exception e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        //31
        if ("hay".equals(tpersona31)) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM vivecon_poli  WHERE tpersona = 'Padre de su hijo' AND  no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune < 1) {
                    try {
                        PreparedStatement sqlins = Conexion.connection.prepareStatement("INSERT INTO vivecon_poli "
                                + "(no_id, tpersona, cpersona, fechacreacion)"
                                + " VALUES (?,?,?,?)");
                        sqlins.setString(1, txtnoiden.getText());
                        sqlins.setString(2, "Padre de su hijo");
                        sqlins.setString(3, "1");
                        sqlins.setString(4, fechanow);
                        sqlins.executeUpdate();
                    } catch (Exception e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else if ("nohay".equals(tpersona31)) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM vivecon_poli  WHERE tpersona = 'Padre de su hijo' AND no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune > 0) {
                    try {
                        PreparedStatement sqlpsiup = Conexion.connection.prepareStatement("DELETE FROM vivecon_poli WHERE tpersona = 'Padre de su hijo' AND no_id = " + txtnoiden.getText());
                        sqlpsiup.executeUpdate();
                    } catch (Exception e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        //32
        if ("hay".equals(tpersona32)) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM vivecon_poli  WHERE tpersona = 'Padres biológicos' AND  no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune < 1) {
                    try {
                        PreparedStatement sqlins = Conexion.connection.prepareStatement("INSERT INTO vivecon_poli "
                                + "(no_id, tpersona, cpersona, fechacreacion)"
                                + " VALUES (?,?,?,?)");
                        sqlins.setString(1, txtnoiden.getText());
                        sqlins.setString(2, "Padres biológicos");
                        sqlins.setString(3, "2");
                        sqlins.setString(4, fechanow);
                        sqlins.executeUpdate();
                    } catch (Exception e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else if ("nohay".equals(tpersona32)) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM vivecon_poli  WHERE tpersona = 'Padres biológicos' AND no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune > 0) {
                    try {
                        PreparedStatement sqlpsiup = Conexion.connection.prepareStatement("DELETE FROM vivecon_poli WHERE tpersona = 'Padres biológicos' AND no_id = " + txtnoiden.getText());
                        sqlpsiup.executeUpdate();
                    } catch (Exception e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        //33
        if ("hay".equals(tpersona33)) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM vivecon_poli  WHERE tpersona = 'Padres adoptivos' AND  no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune < 1) {
                    try {
                        PreparedStatement sqlins = Conexion.connection.prepareStatement("INSERT INTO vivecon_poli "
                                + "(no_id, tpersona, cpersona, fechacreacion)"
                                + " VALUES (?,?,?,?)");
                        sqlins.setString(1, txtnoiden.getText());
                        sqlins.setString(2, "Padres adoptivos");
                        sqlins.setString(3, "2");
                        sqlins.setString(4, fechanow);
                        sqlins.executeUpdate();
                    } catch (Exception e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else if ("nohay".equals(tpersona33)) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM vivecon_poli  WHERE tpersona = 'Padres adoptivos' AND no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune > 0) {
                    try {
                        PreparedStatement sqlpsiup = Conexion.connection.prepareStatement("DELETE FROM vivecon_poli WHERE tpersona = 'Padres adoptivos' AND no_id = " + txtnoiden.getText());
                        sqlpsiup.executeUpdate();
                    } catch (Exception e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        //34
        if ("hay".equals(tpersona34)) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM vivecon_poli  WHERE tpersona = 'Padrastro/Madrastra' AND  no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune < 1) {
                    try {
                        PreparedStatement sqlins = Conexion.connection.prepareStatement("INSERT INTO vivecon_poli "
                                + "(no_id, tpersona, cpersona, fechacreacion)"
                                + " VALUES (?,?,?,?)");
                        sqlins.setString(1, txtnoiden.getText());
                        sqlins.setString(2, "Padrastro/Madrastra");
                        sqlins.setString(3, "1");
                        sqlins.setString(4, fechanow);
                        sqlins.executeUpdate();
                    } catch (Exception e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else if ("nohay".equals(tpersona34)) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM vivecon_poli  WHERE tpersona = 'Padrastro/Madrastra' AND no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune > 0) {
                    try {
                        PreparedStatement sqlpsiup = Conexion.connection.prepareStatement("DELETE FROM vivecon_poli WHERE tpersona = 'Padrastro/Madrastra' AND no_id = " + txtnoiden.getText());
                        sqlpsiup.executeUpdate();
                    } catch (Exception e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        //35
        if ("hay".equals(tpersona35)) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM vivecon_poli  WHERE tpersona = 'Pareja mujer' AND  no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune < 1) {
                    try {
                        PreparedStatement sqlins = Conexion.connection.prepareStatement("INSERT INTO vivecon_poli "
                                + "(no_id, tpersona, cpersona, fechacreacion)"
                                + " VALUES (?,?,?,?)");
                        sqlins.setString(1, txtnoiden.getText());
                        sqlins.setString(2, "Pareja mujer");
                        sqlins.setString(3, "1");
                        sqlins.setString(4, fechanow);
                        sqlins.executeUpdate();
                    } catch (Exception e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else if ("nohay".equals(tpersona35)) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM vivecon_poli  WHERE tpersona = 'Pareja mujer' AND no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune > 0) {
                    try {
                        PreparedStatement sqlpsiup = Conexion.connection.prepareStatement("DELETE FROM vivecon_poli WHERE tpersona = 'Pareja mujer' AND no_id = " + txtnoiden.getText());
                        sqlpsiup.executeUpdate();
                    } catch (Exception e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        //36
        if ("hay".equals(tpersona36)) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM vivecon_poli  WHERE tpersona = 'Pareja hombre' AND  no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune < 1) {
                    try {
                        PreparedStatement sqlins = Conexion.connection.prepareStatement("INSERT INTO vivecon_poli "
                                + "(no_id, tpersona, cpersona, fechacreacion)"
                                + " VALUES (?,?,?,?)");
                        sqlins.setString(1, txtnoiden.getText());
                        sqlins.setString(2, "Pareja hombre");
                        sqlins.setString(3, "1");
                        sqlins.setString(4, fechanow);
                        sqlins.executeUpdate();
                    } catch (Exception e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else if ("nohay".equals(tpersona36)) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM vivecon_poli  WHERE tpersona = 'Pareja hombre' AND no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune > 0) {
                    try {
                        PreparedStatement sqlpsiup = Conexion.connection.prepareStatement("DELETE FROM vivecon_poli WHERE tpersona = 'Pareja hombre' AND no_id = " + txtnoiden.getText());
                        sqlpsiup.executeUpdate();
                    } catch (Exception e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        //37
        if ("hay".equals(tpersona37)) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM vivecon_poli  WHERE tpersona = 'Primos' AND  no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune < 1) {
                    try {
                        PreparedStatement sqlins = Conexion.connection.prepareStatement("INSERT INTO vivecon_poli "
                                + "(no_id, tpersona, cpersona, fechacreacion)"
                                + " VALUES (?,?,?,?)");
                        sqlins.setString(1, txtnoiden.getText());
                        sqlins.setString(2, "Primos");
                        sqlins.setString(3, "2");
                        sqlins.setString(4, fechanow);
                        sqlins.executeUpdate();
                    } catch (Exception e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else if ("nohay".equals(tpersona37)) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM vivecon_poli  WHERE tpersona = 'Primos' AND no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune > 0) {
                    try {
                        PreparedStatement sqlpsiup = Conexion.connection.prepareStatement("DELETE FROM vivecon_poli WHERE tpersona = 'Primos' AND no_id = " + txtnoiden.getText());
                        sqlpsiup.executeUpdate();
                    } catch (Exception e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        //38
        if ("hay".equals(tpersona38)) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM vivecon_poli  WHERE tpersona = 'Primo' AND  no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune > 0) {
                    try {
                        PreparedStatement sqlfami = Conexion.connection.prepareStatement("UPDATE vivecon_poli "
                                + "SET cpersona = '" + cpersona16 + "' WHERE tpersona = 'Primo' AND  no_id = " + txtnoiden.getText() + "  ");
                        sqlfami.executeUpdate();
                    } catch (Exception e) {
                    }
                } else if (cune < 1) {
                    try {
                        PreparedStatement sqlins = Conexion.connection.prepareStatement("INSERT INTO vivecon_poli "
                                + "(no_id, tpersona, cpersona, fechacreacion)"
                                + " VALUES (?,?,?,?)");
                        sqlins.setString(1, txtnoiden.getText());
                        sqlins.setString(2, "Primo");
                        sqlins.setString(3, cpersona16);
                        sqlins.setString(4, fechanow);
                        sqlins.executeUpdate();
                    } catch (Exception e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else if ("nohay".equals(tpersona38)) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM vivecon_poli  WHERE tpersona = 'Primo' AND no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune > 0) {
                    try {
                        PreparedStatement sqlpsiup = Conexion.connection.prepareStatement("DELETE FROM vivecon_poli WHERE tpersona = 'Primo' AND no_id = " + txtnoiden.getText());
                        sqlpsiup.executeUpdate();
                    } catch (Exception e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        //39
        if ("hay".equals(tpersona39)) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM vivecon_poli  WHERE tpersona = 'Prima' AND  no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune > 0) {
                    try {
                        PreparedStatement sqlfami = Conexion.connection.prepareStatement("UPDATE vivecon_poli "
                                + "SET cpersona = '" + cpersona17 + "' WHERE tpersona = 'Prima' AND no_id = " + txtnoiden.getText() + "  ");
                        sqlfami.executeUpdate();
                    } catch (Exception e) {
                    }
                } else if (cune < 1) {
                    try {
                        PreparedStatement sqlins = Conexion.connection.prepareStatement("INSERT INTO vivecon_poli "
                                + "(no_id, tpersona, cpersona, fechacreacion)"
                                + " VALUES (?,?,?,?)");
                        sqlins.setString(1, txtnoiden.getText());
                        sqlins.setString(2, "Prima");
                        sqlins.setString(3, cpersona17);
                        sqlins.setString(4, fechanow);
                        sqlins.executeUpdate();
                    } catch (Exception e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else if ("nohay".equals(tpersona39)) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM vivecon_poli  WHERE tpersona = 'Prima' AND no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune > 0) {
                    try {
                        PreparedStatement sqlpsiup = Conexion.connection.prepareStatement("DELETE FROM vivecon_poli WHERE tpersona = 'Prima' AND no_id = " + txtnoiden.getText());
                        sqlpsiup.executeUpdate();
                    } catch (Exception e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        //40
        if ("hay".equals(tpersona40)) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM vivecon_poli  WHERE tpersona = 'Sobrino' AND  no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune > 0) {
                    try {
                        PreparedStatement sqlfami = Conexion.connection.prepareStatement("UPDATE vivecon_poli "
                                + "SET cpersona = '" + cpersona18 + "' WHERE tpersona = 'Sobrino' AND  no_id = " + txtnoiden.getText() + "  ");
                        sqlfami.executeUpdate();
                    } catch (Exception e) {
                    }
                } else if (cune < 1) {
                    try {
                        PreparedStatement sqlins = Conexion.connection.prepareStatement("INSERT INTO vivecon_poli "
                                + "(no_id, tpersona, cpersona, fechacreacion)"
                                + " VALUES (?,?,?,?)");
                        sqlins.setString(1, txtnoiden.getText());
                        sqlins.setString(2, "Sobrino");
                        sqlins.setString(3, cpersona18);
                        sqlins.setString(4, fechanow);
                        sqlins.executeUpdate();
                    } catch (Exception e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else if ("nohay".equals(tpersona40)) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM vivecon_poli  WHERE tpersona = 'Sobrino' AND no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune > 0) {
                    try {
                        PreparedStatement sqlpsiup = Conexion.connection.prepareStatement("DELETE FROM vivecon_poli WHERE tpersona = 'Sobrino' AND no_id = " + txtnoiden.getText());
                        sqlpsiup.executeUpdate();
                    } catch (Exception e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        //41
        if ("hay".equals(tpersona41)) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM vivecon_poli  WHERE tpersona = 'Sobrina' AND  no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune > 0) {
                    try {
                        PreparedStatement sqlfami = Conexion.connection.prepareStatement("UPDATE vivecon_poli "
                                + "SET cpersona = '" + cpersona19 + "' WHERE tpersona = 'Sobrina' AND no_id = " + txtnoiden.getText() + "  ");
                        sqlfami.executeUpdate();
                    } catch (Exception e) {
                    }
                } else if (cune < 1) {
                    try {
                        PreparedStatement sqlins = Conexion.connection.prepareStatement("INSERT INTO vivecon_poli "
                                + "(no_id, tpersona, cpersona, fechacreacion)"
                                + " VALUES (?,?,?,'GETDATE()')");
                        sqlins.setString(1, txtnoiden.getText());
                        sqlins.setString(2, "Sobrina");
                        sqlins.setString(3, cpersona19);
                        sqlins.executeUpdate();
                    } catch (Exception e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else if ("nohay".equals(tpersona41)) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM vivecon_poli  WHERE tpersona = 'Sobrina' AND no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune > 0) {
                    try {
                        PreparedStatement sqlpsiup = Conexion.connection.prepareStatement("DELETE FROM vivecon_poli WHERE tpersona = 'Sobrina' AND no_id = " + txtnoiden.getText());
                        sqlpsiup.executeUpdate();
                    } catch (Exception e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        //42
        if ("hay".equals(tpersona42)) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM vivecon_poli  WHERE tpersona = 'Sorbrinos' AND  no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune < 1) {
                    try {
                        PreparedStatement sqlins = Conexion.connection.prepareStatement("INSERT INTO vivecon_poli "
                                + "(no_id, tpersona, cpersona, fechacreacion)"
                                + " VALUES (?,?,?,?)");
                        sqlins.setString(1, txtnoiden.getText());
                        sqlins.setString(2, "Sobrinos");
                        sqlins.setString(3, "2");
                        sqlins.setString(4, fechanow);
                        sqlins.executeUpdate();
                    } catch (Exception e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else if ("nohay".equals(tpersona42)) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM vivecon_poli  WHERE tpersona = 'Sobrinos' AND no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune > 0) {
                    try {
                        PreparedStatement sqlpsiup = Conexion.connection.prepareStatement("DELETE FROM vivecon_poli WHERE tpersona = 'Sobrinos' AND no_id = " + txtnoiden.getText());
                        sqlpsiup.executeUpdate();
                    } catch (Exception e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        //43
        if ("hay".equals(tpersona43)) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM vivecon_poli  WHERE tpersona = 'Nieto' AND  no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune > 0) {
                    try {
                        PreparedStatement sqlfami = Conexion.connection.prepareStatement("UPDATE vivecon_poli "
                                + "SET cpersona = '" + cpersona20 + "' WHERE tpersona = 'Nieto' AND  no_id = " + txtnoiden.getText() + "  ");
                        sqlfami.executeUpdate();
                    } catch (Exception e) {
                    }
                } else if (cune < 1) {
                    try {
                        PreparedStatement sqlins = Conexion.connection.prepareStatement("INSERT INTO vivecon_poli "
                                + "(no_id, tpersona, cpersona, fechacreacion)"
                                + " VALUES (?,?,?,?)");
                        sqlins.setString(1, txtnoiden.getText());
                        sqlins.setString(2, "Nieto");
                        sqlins.setString(3, cpersona20);
                        sqlins.setString(4, fechanow);
                        sqlins.executeUpdate();
                    } catch (Exception e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else if ("nohay".equals(tpersona43)) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM vivecon_poli  WHERE tpersona = 'Nieto' AND no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune > 0) {
                    try {
                        PreparedStatement sqlpsiup = Conexion.connection.prepareStatement("DELETE FROM vivecon_poli WHERE tpersona = 'Nieto' AND no_id = " + txtnoiden.getText());
                        sqlpsiup.executeUpdate();
                    } catch (Exception e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        //44
        if ("hay".equals(tpersona44)) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM vivecon_poli  WHERE tpersona = 'Suegro' AND  no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune < 1) {
                    try {
                        PreparedStatement sqlins = Conexion.connection.prepareStatement("INSERT INTO vivecon_poli "
                                + "(no_id, tpersona, cpersona, fechacreacion)"
                                + " VALUES (?,?,?,?)");
                        sqlins.setString(1, txtnoiden.getText());
                        sqlins.setString(2, "Suegro");
                        sqlins.setString(3, "1");
                        sqlins.setString(4, fechanow);
                        sqlins.executeUpdate();
                    } catch (Exception e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else if ("nohay".equals(tpersona44)) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM vivecon_poli  WHERE tpersona = 'Suegro' AND no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune > 0) {
                    try {
                        PreparedStatement sqlpsiup = Conexion.connection.prepareStatement("DELETE FROM vivecon_poli WHERE tpersona = 'Suegro' AND no_id = " + txtnoiden.getText());
                        sqlpsiup.executeUpdate();
                    } catch (Exception e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        //45
        if ("hay".equals(tpersona45)) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM vivecon_poli  WHERE tpersona = 'Suegra' AND  no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune < 1) {
                    try {
                        PreparedStatement sqlins = Conexion.connection.prepareStatement("INSERT INTO vivecon_poli "
                                + "(no_id, tpersona, cpersona, fechacreacion)"
                                + " VALUES (?,?,?,?)");
                        sqlins.setString(1, txtnoiden.getText());
                        sqlins.setString(2, "Suegra");
                        sqlins.setString(3, "1");
                        sqlins.setString(4, fechanow);
                        sqlins.executeUpdate();
                    } catch (Exception e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else if ("nohay".equals(tpersona45)) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM vivecon_poli  WHERE tpersona = 'Suegra' AND no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune > 0) {
                    try {
                        PreparedStatement sqlpsiup = Conexion.connection.prepareStatement("DELETE FROM vivecon_poli WHERE tpersona = 'Suegra' AND no_id = " + txtnoiden.getText());
                        sqlpsiup.executeUpdate();
                    } catch (Exception e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        //46
        if ("hay".equals(tpersona46)) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM vivecon_poli  WHERE tpersona = 'Suegros' AND  no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune < 1) {
                    try {
                        PreparedStatement sqlins = Conexion.connection.prepareStatement("INSERT INTO vivecon_poli "
                                + "(no_id, tpersona, cpersona, fechacreacion)"
                                + " VALUES (?,?,?,?)");
                        sqlins.setString(1, txtnoiden.getText());
                        sqlins.setString(2, "Suegros");
                        sqlins.setString(3, "2");
                        sqlins.setString(4, fechanow);
                        sqlins.executeUpdate();
                    } catch (Exception e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else if ("nohay".equals(tpersona46)) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM vivecon_poli  WHERE tpersona = 'Suegros' AND no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune > 0) {
                    try {
                        PreparedStatement sqlpsiup = Conexion.connection.prepareStatement("DELETE FROM vivecon_poli WHERE tpersona = 'Suegros' AND no_id = " + txtnoiden.getText());
                        sqlpsiup.executeUpdate();
                    } catch (Exception e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        //47
        if ("hay".equals(tpersona47)) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM vivecon_poli  WHERE tpersona = 'Tío' AND  no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune > 0) {
                    try {
                        PreparedStatement sqlfami = Conexion.connection.prepareStatement("UPDATE vivecon_poli "
                                + "SET cpersona = '" + cpersona21 + "' WHERE tpersona = 'Tío' AND no_id = " + txtnoiden.getText() + "  ");
                        sqlfami.executeUpdate();
                    } catch (Exception e) {
                    }
                } else if (cune < 1) {
                    try {
                        PreparedStatement sqlins = Conexion.connection.prepareStatement("INSERT INTO vivecon_poli "
                                + "(no_id, tpersona, cpersona, fechacreacion)"
                                + " VALUES (?,?,?,?)");
                        sqlins.setString(1, txtnoiden.getText());
                        sqlins.setString(2, "Tío");
                        sqlins.setString(3, cpersona21);
                        sqlins.setString(4, fechanow);
                        sqlins.executeUpdate();
                    } catch (Exception e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else if ("nohay".equals(tpersona47)) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM vivecon_poli  WHERE tpersona = 'Tío' AND no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune > 0) {
                    try {
                        PreparedStatement sqlpsiup = Conexion.connection.prepareStatement("DELETE FROM vivecon_poli WHERE tpersona = 'Tío' AND no_id = " + txtnoiden.getText());
                        sqlpsiup.executeUpdate();
                    } catch (Exception e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        //48
        if ("hay".equals(tpersona48)) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM vivecon_poli  WHERE tpersona = 'Tía' AND  no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune > 0) {
                    try {
                        PreparedStatement sqlfami = Conexion.connection.prepareStatement("UPDATE vivecon_poli "
                                + "SET cpersona = '" + cpersona22 + "' WHERE tpersona = 'Tía' AND no_id = " + txtnoiden.getText() + "  ");
                        sqlfami.executeUpdate();
                    } catch (Exception e) {
                    }
                } else if (cune < 1) {
                    try {
                        PreparedStatement sqlins = Conexion.connection.prepareStatement("INSERT INTO vivecon_poli "
                                + "(no_id, tpersona, cpersona, fechacreacion)"
                                + " VALUES (?,?,?,?)");
                        sqlins.setString(1, txtnoiden.getText());
                        sqlins.setString(2, "Tía");
                        sqlins.setString(3, cpersona22);
                        sqlins.setString(4, fechanow);
                        sqlins.executeUpdate();
                    } catch (Exception e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else if ("nohay".equals(tpersona48)) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM vivecon_poli  WHERE tpersona = 'Tía' AND no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune > 0) {
                    try {
                        PreparedStatement sqlpsiup = Conexion.connection.prepareStatement("DELETE FROM vivecon_poli WHERE tpersona = 'Tía' AND no_id = " + txtnoiden.getText());
                        sqlpsiup.executeUpdate();
                    } catch (Exception e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        //49
        if ("hay".equals(tpersona49)) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM vivecon_poli  WHERE tpersona = 'Yerno' AND  no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune < 1) {
                    try {
                        PreparedStatement sqlins = Conexion.connection.prepareStatement("INSERT INTO vivecon_poli "
                                + "(no_id, tpersona, cpersona, fechacreacion)"
                                + " VALUES (?,?,?,?)");
                        sqlins.setString(1, txtnoiden.getText());
                        sqlins.setString(2, "Yerno");
                        sqlins.setString(3, "1");
                        sqlins.setString(4, fechanow);
                        sqlins.executeUpdate();
                    } catch (Exception e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else if ("nohay".equals(tpersona49)) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM vivecon_poli  WHERE tpersona = 'Yerno' AND no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune > 0) {
                    try {
                        PreparedStatement sqlpsiup = Conexion.connection.prepareStatement("DELETE FROM vivecon_poli WHERE tpersona = 'Yerno' AND no_id = " + txtnoiden.getText());
                        sqlpsiup.executeUpdate();
                    } catch (Exception e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void update_infofami() {
        try {
            PreparedStatement sqlfami = Conexion.connection.prepareStatement("UPDATE datos_generales_poli "
                    + "SET estado_civil = '" + estado_civil + "', dijovivir = '" + dijovivir + "',"
                    + " familiares_aparte = '" + familiares_aparte + "', nom_pareja = '" + nom_pareja + "',"
                    + "fami_ries_soci = '" + fami_ries_soci + "', expli_fami_ries = '" + expli_fami_ries + "' WHERE no_id = " + DatosPrincipales.getNoIdenExaminado() + " and t_identificacion = '" + DatosPrincipales.getTipoIdenExaminado() + "' and fechacreacion = '" + fechanow + "' and tipoexamen = '" + DatosPrincipales.getTipoExamen() + "'");
            sqlfami.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "¡Error en el ingreso de datos a la base!\nPor favor solicite ayuda al equipo de desarrollo" + e);
        }
    }

    public void limpiar() {
        estado_civil = "";
        dijovivir = "";
        familiares_aparte = "";
        nom_pareja = "";
        fami_ries_soci = "";
        expli_fami_ries = "";
        tpersona1 = "";
        tpersona2 = "";
        tpersona3 = "";
        tpersona4 = "";
        tpersona5 = "";
        tpersona6 = "";
        tpersona7 = "";
        tpersona8 = "";
        tpersona9 = "";
        tpersona10 = "";
        tpersona11 = "";
        tpersona12 = "";
        tpersona13 = "";
        tpersona14 = "";
        tpersona15 = "";
        tpersona16 = "";
        tpersona17 = "";
        tpersona18 = "";
        tpersona19 = "";
        tpersona20 = "";
        tpersona21 = "";
        tpersona22 = "";
        tpersona23 = "";
        tpersona24 = "";
        tpersona25 = "";
        tpersona26 = "";
        tpersona27 = "";
        tpersona28 = "";
        tpersona29 = "";
        tpersona30 = "";
        tpersona31 = "";
        tpersona32 = "";
        tpersona33 = "";
        tpersona34 = "";
        tpersona35 = "";
        tpersona36 = "";
        tpersona37 = "";
        tpersona38 = "";
        tpersona39 = "";
        tpersona40 = "";
        tpersona41 = "";
        tpersona42 = "";
        tpersona43 = "";
        tpersona44 = "";
        tpersona45 = "";
        tpersona46 = "";
        tpersona47 = "";
        tpersona48 = "";
        tpersona49 = "";
        cpersona1 = "";
        cpersona2 = "";
        cpersona3 = "";
        cpersona4 = "";
        cpersona5 = "";
        cpersona6 = "";
        cpersona7 = "";
        cpersona8 = "";
        cpersona9 = "";
        cpersona10 = "";
        cpersona11 = "";
        cpersona12 = "";
        cpersona13 = "";
        cpersona14 = "";
        cpersona15 = "";
        cpersona16 = "";
        cpersona17 = "";
        cpersona18 = "";
        cpersona19 = "";
        cpersona20 = "";
        cpersona21 = "";
        cpersona22 = "";
        admisionInfoFamiliar = "";
        colorCategoria = "sincolor";
    }

}
