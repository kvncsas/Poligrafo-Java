package classes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import view.DatoGeneral;
import static view.DatoPersonal.txtnoiden;

/**
 *
 * @author Kevin Casas
 */
public class ConsumoSustancias {

    private static String tipodroga1 = "";
    private static String tipodroga2 = "";
    private static String tipodroga3 = "";
    private static String tipodroga4 = "";
    private static String tipodroga5 = "";
    private static String tipodroga6 = "";
    private static String tipodroga7 = "";
    private static String tipodroga8 = "";
    private static String tipodroga9 = "";
    private static String tipodroga10 = "";
    private static String tipodrog10 = "";
    private static String frecuencia_droga1 = "";
    private static String frecuencia_droga2 = "";
    private static String frecuencia_droga3 = "";
    private static String frecuencia_droga4 = "";
    private static String frecuencia_droga5 = "";
    private static String frecuencia_droga6 = "";
    private static String frecuencia_droga7 = "";
    private static String frecuencia_droga8 = "";
    private static String frecuencia_droga9 = "";
    private static String frecuencia_droga10 = "";
    private static String ti_partici1 = "";
    private static String ti_partici2 = "";
    private static String ti_partici3 = "";
    private static String ti_partici4 = "";
    private static String ti_partici5 = "";
    private static String ti_partici6 = "";
    private static String ti_partici7 = "";
    private static String ti_partici8 = "";
    private static String ti_partici9 = "";
    private static String ti_partici10 = "";
    private static String ti_partici11 = "";
    private static String haconsumido = "-";
    private static String haparticipado = "-";
    private static String exphaparticipado = "";
    private static String exphaconsumido = "";
    private static String drogaspregun1 = "-";
    private static String drogaspregun2 = "-";
    private static String drogaspregun3 = "-";
    private static String drogaspregun4 = "-";
    private static String drogaspregun5 = "-";
    private static String drogaspregun6 = "-";
    private static String drogaspregun7 = "-";
    private static String drogaspregun8 = "-";
    private static String drogaspregun9 = "-";
    private static String drogaspregun10 = "-";
    private static String drogaspregun11 = "-";
    private static String drogaspregun12 = "-";
    private static String drogaspregun13 = "-";
    private static String expdrogaspregun1 = "";
    private static String expdrogaspregun2 = "";
    private static String expdrogaspregun3 = "";
    private static String expdrogaspregun4 = "";
    private static String expdrogaspregun5 = "";
    private static String expdrogaspregun6 = "";
    private static String expdrogaspregun7 = "";
    private static String expdrogaspregun8 = "";
    private static String expdrogaspregun9 = "";
    private static String expdrogaspregun10 = "";
    private static String expdrogaspregun11 = "";
    private static String expdrogaspregun12 = "";
    private static String expdrogaspregun13 = "";
    private static String admisionConsumoSustancias = "";
    private static String colorCategoria = "sincolor";

    public static String getTipodroga1() {
        return tipodroga1;
    }

    public static void setTipodroga1(String tipodroga1) {
        ConsumoSustancias.tipodroga1 = tipodroga1;
    }

    public static String getTipodroga2() {
        return tipodroga2;
    }

    public static void setTipodroga2(String tipodroga2) {
        ConsumoSustancias.tipodroga2 = tipodroga2;
    }

    public static String getTipodroga3() {
        return tipodroga3;
    }

    public static void setTipodroga3(String tipodroga3) {
        ConsumoSustancias.tipodroga3 = tipodroga3;
    }

    public static String getTipodroga4() {
        return tipodroga4;
    }

    public static void setTipodroga4(String tipodroga4) {
        ConsumoSustancias.tipodroga4 = tipodroga4;
    }

    public static String getTipodroga5() {
        return tipodroga5;
    }

    public static void setTipodroga5(String tipodroga5) {
        ConsumoSustancias.tipodroga5 = tipodroga5;
    }

    public static String getTipodroga6() {
        return tipodroga6;
    }

    public static void setTipodroga6(String tipodroga6) {
        ConsumoSustancias.tipodroga6 = tipodroga6;
    }

    public static String getTipodroga7() {
        return tipodroga7;
    }

    public static void setTipodroga7(String tipodroga7) {
        ConsumoSustancias.tipodroga7 = tipodroga7;
    }

    public static String getTipodroga8() {
        return tipodroga8;
    }

    public static void setTipodroga8(String tipodroga8) {
        ConsumoSustancias.tipodroga8 = tipodroga8;
    }

    public static String getTipodroga9() {
        return tipodroga9;
    }

    public static void setTipodroga9(String tipodroga9) {
        ConsumoSustancias.tipodroga9 = tipodroga9;
    }

    public static String getTipodroga10() {
        return tipodroga10;
    }

    public static void setTipodroga10(String tipodroga10) {
        ConsumoSustancias.tipodroga10 = tipodroga10;
    }

    public static String getTipodrog10() {
        return tipodrog10;
    }

    public static void setTipodrog10(String tipodrog10) {
        ConsumoSustancias.tipodrog10 = tipodrog10;
    }

    public static String getFrecuencia_droga1() {
        return frecuencia_droga1;
    }

    public static void setFrecuencia_droga1(String frecuencia_droga1) {
        ConsumoSustancias.frecuencia_droga1 = frecuencia_droga1;
    }

    public static String getFrecuencia_droga2() {
        return frecuencia_droga2;
    }

    public static void setFrecuencia_droga2(String frecuencia_droga2) {
        ConsumoSustancias.frecuencia_droga2 = frecuencia_droga2;
    }

    public static String getFrecuencia_droga3() {
        return frecuencia_droga3;
    }

    public static void setFrecuencia_droga3(String frecuencia_droga3) {
        ConsumoSustancias.frecuencia_droga3 = frecuencia_droga3;
    }

    public static String getFrecuencia_droga4() {
        return frecuencia_droga4;
    }

    public static void setFrecuencia_droga4(String frecuencia_droga4) {
        ConsumoSustancias.frecuencia_droga4 = frecuencia_droga4;
    }

    public static String getFrecuencia_droga5() {
        return frecuencia_droga5;
    }

    public static void setFrecuencia_droga5(String frecuencia_droga5) {
        ConsumoSustancias.frecuencia_droga5 = frecuencia_droga5;
    }

    public static String getFrecuencia_droga6() {
        return frecuencia_droga6;
    }

    public static void setFrecuencia_droga6(String frecuencia_droga6) {
        ConsumoSustancias.frecuencia_droga6 = frecuencia_droga6;
    }

    public static String getFrecuencia_droga7() {
        return frecuencia_droga7;
    }

    public static void setFrecuencia_droga7(String frecuencia_droga7) {
        ConsumoSustancias.frecuencia_droga7 = frecuencia_droga7;
    }

    public static String getFrecuencia_droga8() {
        return frecuencia_droga8;
    }

    public static void setFrecuencia_droga8(String frecuencia_droga8) {
        ConsumoSustancias.frecuencia_droga8 = frecuencia_droga8;
    }

    public static String getFrecuencia_droga9() {
        return frecuencia_droga9;
    }

    public static void setFrecuencia_droga9(String frecuencia_droga9) {
        ConsumoSustancias.frecuencia_droga9 = frecuencia_droga9;
    }

    public static String getFrecuencia_droga10() {
        return frecuencia_droga10;
    }

    public static void setFrecuencia_droga10(String frecuencia_droga10) {
        ConsumoSustancias.frecuencia_droga10 = frecuencia_droga10;
    }

    public static String getTi_partici1() {
        return ti_partici1;
    }

    public static void setTi_partici1(String ti_partici1) {
        ConsumoSustancias.ti_partici1 = ti_partici1;
    }

    public static String getTi_partici2() {
        return ti_partici2;
    }

    public static void setTi_partici2(String ti_partici2) {
        ConsumoSustancias.ti_partici2 = ti_partici2;
    }

    public static String getTi_partici3() {
        return ti_partici3;
    }

    public static void setTi_partici3(String ti_partici3) {
        ConsumoSustancias.ti_partici3 = ti_partici3;
    }

    public static String getTi_partici4() {
        return ti_partici4;
    }

    public static void setTi_partici4(String ti_partici4) {
        ConsumoSustancias.ti_partici4 = ti_partici4;
    }

    public static String getTi_partici5() {
        return ti_partici5;
    }

    public static void setTi_partici5(String ti_partici5) {
        ConsumoSustancias.ti_partici5 = ti_partici5;
    }

    public static String getTi_partici6() {
        return ti_partici6;
    }

    public static void setTi_partici6(String ti_partici6) {
        ConsumoSustancias.ti_partici6 = ti_partici6;
    }

    public static String getTi_partici7() {
        return ti_partici7;
    }

    public static void setTi_partici7(String ti_partici7) {
        ConsumoSustancias.ti_partici7 = ti_partici7;
    }

    public static String getTi_partici8() {
        return ti_partici8;
    }

    public static void setTi_partici8(String ti_partici8) {
        ConsumoSustancias.ti_partici8 = ti_partici8;
    }

    public static String getTi_partici9() {
        return ti_partici9;
    }

    public static void setTi_partici9(String ti_partici9) {
        ConsumoSustancias.ti_partici9 = ti_partici9;
    }

    public static String getTi_partici10() {
        return ti_partici10;
    }

    public static void setTi_partici10(String ti_partici10) {
        ConsumoSustancias.ti_partici10 = ti_partici10;
    }

    public static String getTi_partici11() {
        return ti_partici11;
    }

    public static void setTi_partici11(String ti_partici11) {
        ConsumoSustancias.ti_partici11 = ti_partici11;
    }

    public static String getHaconsumido() {
        return haconsumido;
    }

    public static void setHaconsumido(String haconsumido) {
        ConsumoSustancias.haconsumido = haconsumido;
    }

    public static String getHaparticipado() {
        return haparticipado;
    }

    public static void setHaparticipado(String haparticipado) {
        ConsumoSustancias.haparticipado = haparticipado;
    }

    public static String getExphaparticipado() {
        return exphaparticipado;
    }

    public static void setExphaparticipado(String exphaparticipado) {
        ConsumoSustancias.exphaparticipado = exphaparticipado;
    }

    public static String getExphaconsumido() {
        return exphaconsumido;
    }

    public static void setExphaconsumido(String exphaconsumido) {
        ConsumoSustancias.exphaconsumido = exphaconsumido;
    }

    public static String getDrogaspregun1() {
        return drogaspregun1;
    }

    public static void setDrogaspregun1(String drogaspregun1) {
        ConsumoSustancias.drogaspregun1 = drogaspregun1;
    }

    public static String getDrogaspregun2() {
        return drogaspregun2;
    }

    public static void setDrogaspregun2(String drogaspregun2) {
        ConsumoSustancias.drogaspregun2 = drogaspregun2;
    }

    public static String getDrogaspregun3() {
        return drogaspregun3;
    }

    public static void setDrogaspregun3(String drogaspregun3) {
        ConsumoSustancias.drogaspregun3 = drogaspregun3;
    }

    public static String getDrogaspregun4() {
        return drogaspregun4;
    }

    public static void setDrogaspregun4(String drogaspregun4) {
        ConsumoSustancias.drogaspregun4 = drogaspregun4;
    }

    public static String getDrogaspregun5() {
        return drogaspregun5;
    }

    public static void setDrogaspregun5(String drogaspregun5) {
        ConsumoSustancias.drogaspregun5 = drogaspregun5;
    }

    public static String getDrogaspregun6() {
        return drogaspregun6;
    }

    public static void setDrogaspregun6(String drogaspregun6) {
        ConsumoSustancias.drogaspregun6 = drogaspregun6;
    }

    public static String getDrogaspregun7() {
        return drogaspregun7;
    }

    public static void setDrogaspregun7(String drogaspregun7) {
        ConsumoSustancias.drogaspregun7 = drogaspregun7;
    }

    public static String getDrogaspregun8() {
        return drogaspregun8;
    }

    public static void setDrogaspregun8(String drogaspregun8) {
        ConsumoSustancias.drogaspregun8 = drogaspregun8;
    }

    public static String getDrogaspregun9() {
        return drogaspregun9;
    }

    public static void setDrogaspregun9(String drogaspregun9) {
        ConsumoSustancias.drogaspregun9 = drogaspregun9;
    }

    public static String getDrogaspregun10() {
        return drogaspregun10;
    }

    public static void setDrogaspregun10(String drogaspregun10) {
        ConsumoSustancias.drogaspregun10 = drogaspregun10;
    }

    public static String getDrogaspregun11() {
        return drogaspregun11;
    }

    public static void setDrogaspregun11(String drogaspregun11) {
        ConsumoSustancias.drogaspregun11 = drogaspregun11;
    }

    public static String getDrogaspregun12() {
        return drogaspregun12;
    }

    public static void setDrogaspregun12(String drogaspregun12) {
        ConsumoSustancias.drogaspregun12 = drogaspregun12;
    }

    public static String getDrogaspregun13() {
        return drogaspregun13;
    }

    public static void setDrogaspregun13(String drogaspregun13) {
        ConsumoSustancias.drogaspregun13 = drogaspregun13;
    }

    public static String getExpdrogaspregun1() {
        return expdrogaspregun1;
    }

    public static void setExpdrogaspregun1(String expdrogaspregun1) {
        ConsumoSustancias.expdrogaspregun1 = expdrogaspregun1;
    }

    public static String getExpdrogaspregun2() {
        return expdrogaspregun2;
    }

    public static void setExpdrogaspregun2(String expdrogaspregun2) {
        ConsumoSustancias.expdrogaspregun2 = expdrogaspregun2;
    }

    public static String getExpdrogaspregun3() {
        return expdrogaspregun3;
    }

    public static void setExpdrogaspregun3(String expdrogaspregun3) {
        ConsumoSustancias.expdrogaspregun3 = expdrogaspregun3;
    }

    public static String getExpdrogaspregun4() {
        return expdrogaspregun4;
    }

    public static void setExpdrogaspregun4(String expdrogaspregun4) {
        ConsumoSustancias.expdrogaspregun4 = expdrogaspregun4;
    }

    public static String getExpdrogaspregun5() {
        return expdrogaspregun5;
    }

    public static void setExpdrogaspregun5(String expdrogaspregun5) {
        ConsumoSustancias.expdrogaspregun5 = expdrogaspregun5;
    }

    public static String getExpdrogaspregun6() {
        return expdrogaspregun6;
    }

    public static void setExpdrogaspregun6(String expdrogaspregun6) {
        ConsumoSustancias.expdrogaspregun6 = expdrogaspregun6;
    }

    public static String getExpdrogaspregun7() {
        return expdrogaspregun7;
    }

    public static void setExpdrogaspregun7(String expdrogaspregun7) {
        ConsumoSustancias.expdrogaspregun7 = expdrogaspregun7;
    }

    public static String getExpdrogaspregun8() {
        return expdrogaspregun8;
    }

    public static void setExpdrogaspregun8(String expdrogaspregun8) {
        ConsumoSustancias.expdrogaspregun8 = expdrogaspregun8;
    }

    public static String getExpdrogaspregun9() {
        return expdrogaspregun9;
    }

    public static void setExpdrogaspregun9(String expdrogaspregun9) {
        ConsumoSustancias.expdrogaspregun9 = expdrogaspregun9;
    }

    public static String getExpdrogaspregun10() {
        return expdrogaspregun10;
    }

    public static void setExpdrogaspregun10(String expdrogaspregun10) {
        ConsumoSustancias.expdrogaspregun10 = expdrogaspregun10;
    }

    public static String getExpdrogaspregun11() {
        return expdrogaspregun11;
    }

    public static void setExpdrogaspregun11(String expdrogaspregun11) {
        ConsumoSustancias.expdrogaspregun11 = expdrogaspregun11;
    }

    public static String getExpdrogaspregun12() {
        return expdrogaspregun12;
    }

    public static void setExpdrogaspregun12(String expdrogaspregun12) {
        ConsumoSustancias.expdrogaspregun12 = expdrogaspregun12;
    }

    public static String getExpdrogaspregun13() {
        return expdrogaspregun13;
    }

    public static void setExpdrogaspregun13(String expdrogaspregun13) {
        ConsumoSustancias.expdrogaspregun13 = expdrogaspregun13;
    }

    public static String getAdmisionConsumoSustancias() {
        return admisionConsumoSustancias;
    }

    public static void setAdmisionConsumoSustancias(String admisionConsumoSustancias) {
        ConsumoSustancias.admisionConsumoSustancias = admisionConsumoSustancias;
    }

    public static String getColorCategoria() {
        return colorCategoria;
    }

    public static void setColorCategoria(String colorCategoria) {
        ConsumoSustancias.colorCategoria = colorCategoria;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getFechanow() {
        return fechanow;
    }

    public void setFechanow(String fechanow) {
        this.fechanow = fechanow;
    }


    
    SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");
    java.util.Date fecha = new java.util.Date();
    public String fechanow = date.format(fecha);

    public void validaciondrogas() {
        //validaciones check box
        //1
        if ("hay".equals(tipodroga1)) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM drogas_pers_poli  WHERE tipodroga = 'Marihuana' AND  no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune < 1) {
                    try {
                        PreparedStatement sqlins = Conexion.connection.prepareStatement("INSERT INTO drogas_pers_poli "
                                + "(no_id, tipodroga, frecuencia_droga, fechacreacion)"
                                + " VALUES (?,?,?,?)");
                        sqlins.setString(1, txtnoiden.getText());
                        sqlins.setString(2, "Marihuana");
                        sqlins.setString(3, frecuencia_droga1);
                        sqlins.setString(4, fechanow);
                        sqlins.executeUpdate();
                    } catch (Exception e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if ("nohay".equals(tipodroga1)) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM drogas_pers_poli  WHERE tipodroga = 'Marihuana' AND no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune > 0) {
                    try {
                        PreparedStatement sqlpsiup = Conexion.connection.prepareStatement("DELETE FROM drogas_pers_poli WHERE tipodroga = 'Marihuana' AND no_id = " + txtnoiden.getText());
                        sqlpsiup.executeUpdate();
                    } catch (Exception e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        //2
        if ("hay".equals(tipodroga2)) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM drogas_pers_poli  WHERE tipodroga = 'Cocaína' AND  no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune < 1) {
                    try {
                        PreparedStatement sqlins = Conexion.connection.prepareStatement("INSERT INTO drogas_pers_poli "
                                + "(no_id, tipodroga, frecuencia_droga, fechacreacion)"
                                + " VALUES (?,?,?,?)");
                        sqlins.setString(1, txtnoiden.getText());
                        sqlins.setString(2, "Cocaína");
                        sqlins.setString(3, frecuencia_droga2);
                        sqlins.setString(4, fechanow);
                        sqlins.executeUpdate();
                    } catch (Exception e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if ("nohay".equals(tipodroga2)) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM drogas_pers_poli  WHERE tipodroga = 'Cocaína' AND no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune > 0) {
                    try {
                        PreparedStatement sqlpsiup = Conexion.connection.prepareStatement("DELETE FROM drogas_pers_poli WHERE tipodroga = 'Cocaína' AND no_id = " + txtnoiden.getText());
                        sqlpsiup.executeUpdate();
                    } catch (Exception e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        //3
        if ("hay".equals(tipodroga3)) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM drogas_pers_poli  WHERE tipodroga = 'Bazuco' AND  no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune < 1) {
                    try {
                        PreparedStatement sqlins = Conexion.connection.prepareStatement("INSERT INTO drogas_pers_poli "
                                + "(no_id, tipodroga, frecuencia_droga, fechacreacion)"
                                + " VALUES (?,?,?,?)");
                        sqlins.setString(1, txtnoiden.getText());
                        sqlins.setString(2, "Bazuco");
                        sqlins.setString(3, frecuencia_droga3);
                        sqlins.setString(4, fechanow);
                        sqlins.executeUpdate();
                    } catch (Exception e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if ("nohay".equals(tipodroga3)) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM drogas_pers_poli  WHERE tipodroga = 'Bazuco' AND no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune > 0) {
                    try {
                        PreparedStatement sqlpsiup = Conexion.connection.prepareStatement("DELETE FROM drogas_pers_poli WHERE tipodroga = 'Bazuco' AND no_id = " + txtnoiden.getText());
                        sqlpsiup.executeUpdate();
                    } catch (Exception e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        //4
        if ("hay".equals(tipodroga4)) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM drogas_pers_poli  WHERE tipodroga = 'LDS' AND  no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune < 1) {
                    try {
                        PreparedStatement sqlins = Conexion.connection.prepareStatement("INSERT INTO drogas_pers_poli "
                                + "(no_id, tipodroga, frecuencia_droga, fechacreacion)"
                                + " VALUES (?,?,?,?)");
                        sqlins.setString(1, txtnoiden.getText());
                        sqlins.setString(2, "LDS");
                        sqlins.setString(3, frecuencia_droga4);
                        sqlins.setString(4, fechanow);
                        sqlins.executeUpdate();
                    } catch (Exception e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if ("nohay".equals(tipodroga4)) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM drogas_pers_poli  WHERE tipodroga = 'LDS' AND no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune > 0) {
                    try {
                        PreparedStatement sqlpsiup = Conexion.connection.prepareStatement("DELETE FROM drogas_pers_poli WHERE tipodroga = 'LDS' AND no_id = " + txtnoiden.getText());
                        sqlpsiup.executeUpdate();
                    } catch (Exception e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        //5
        if ("hay".equals(tipodroga5)) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM drogas_pers_poli  WHERE tipodroga = 'Éxtasis' AND  no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune < 1) {
                    try {
                        PreparedStatement sqlins = Conexion.connection.prepareStatement("INSERT INTO drogas_pers_poli "
                                + "(no_id, tipodroga, frecuencia_droga, fechacreacion)"
                                + " VALUES (?,?,?,?)");
                        sqlins.setString(1, txtnoiden.getText());
                        sqlins.setString(2, "Éxtasis");
                        sqlins.setString(3, frecuencia_droga5);
                        sqlins.setString(4, fechanow);
                        sqlins.executeUpdate();
                    } catch (Exception e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if ("nohay".equals(tipodroga5)) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM drogas_pers_poli  WHERE tipodroga = 'Éxtasis' AND no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune > 0) {
                    try {
                        PreparedStatement sqlpsiup = Conexion.connection.prepareStatement("DELETE FROM drogas_pers_poli WHERE tipodroga = 'Éxtasis' AND no_id = " + txtnoiden.getText());
                        sqlpsiup.executeUpdate();
                    } catch (Exception e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        //6
        if ("hay".equals(tipodroga6)) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM drogas_pers_poli  WHERE tipodroga = 'Heroína' AND  no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune < 1) {
                    try {
                        PreparedStatement sqlins = Conexion.connection.prepareStatement("INSERT INTO drogas_pers_poli "
                                + "(no_id, tipodroga, frecuencia_droga, fechacreacion)"
                                + " VALUES (?,?,?,?)");
                        sqlins.setString(1, txtnoiden.getText());
                        sqlins.setString(2, "Heroína");
                        sqlins.setString(3, frecuencia_droga6);
                        sqlins.setString(4, fechanow);
                        sqlins.executeUpdate();
                    } catch (Exception e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if ("nohay".equals(tipodroga6)) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM drogas_pers_poli  WHERE tipodroga = 'Heroína' AND no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune > 0) {
                    try {
                        PreparedStatement sqlpsiup = Conexion.connection.prepareStatement("DELETE FROM drogas_pers_poli WHERE tipodroga = 'Heroína' AND no_id = " + txtnoiden.getText());
                        sqlpsiup.executeUpdate();
                    } catch (Exception e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        //7
        if ("hay".equals(tipodroga7)) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM drogas_pers_poli  WHERE tipodroga = 'Medicamentos psiquiátricos' AND  no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune < 1) {
                    try {
                        PreparedStatement sqlins = Conexion.connection.prepareStatement("INSERT INTO drogas_pers_poli "
                                + "(no_id, tipodroga, frecuencia_droga, fechacreacion)"
                                + " VALUES (?,?,?,?)");
                        sqlins.setString(1, txtnoiden.getText());
                        sqlins.setString(2, "Medicamentos psiquiátricos");
                        sqlins.setString(3, frecuencia_droga7);
                        sqlins.setString(4, fechanow);
                        sqlins.executeUpdate();
                    } catch (Exception e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if ("nohay".equals(tipodroga7)) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM drogas_pers_poli  WHERE tipodroga = 'Medicamentos psiquiátricos' AND no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune > 0) {
                    try {
                        PreparedStatement sqlpsiup = Conexion.connection.prepareStatement("DELETE FROM drogas_pers_poli WHERE tipodroga = 'Medicamentos psiquiátricos' AND no_id = " + txtnoiden.getText());
                        sqlpsiup.executeUpdate();
                    } catch (Exception e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        //8
        if ("hay".equals(tipodroga8)) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM drogas_pers_poli  WHERE tipodroga = 'Popper' AND  no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune < 1) {
                    try {
                        PreparedStatement sqlins = Conexion.connection.prepareStatement("INSERT INTO drogas_pers_poli "
                                + "(no_id, tipodroga, frecuencia_droga, fechacreacion)"
                                + " VALUES (?,?,?,?)");
                        sqlins.setString(1, txtnoiden.getText());
                        sqlins.setString(2, "Popper");
                        sqlins.setString(3, frecuencia_droga8);
                        sqlins.setString(4, fechanow);
                        sqlins.executeUpdate();
                    } catch (Exception e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if ("nohay".equals(tipodroga8)) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM drogas_pers_poli  WHERE tipodroga = 'Popper' AND no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune > 0) {
                    try {
                        PreparedStatement sqlpsiup = Conexion.connection.prepareStatement("DELETE FROM drogas_pers_poli WHERE tipodroga = 'Popper' AND no_id = " + txtnoiden.getText());
                        sqlpsiup.executeUpdate();
                    } catch (Exception e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        //9
        if ("hay".equals(tipodroga9)) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM drogas_pers_poli  WHERE tipodroga = 'Dick' AND  no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune < 1) {
                    try {
                        PreparedStatement sqlins = Conexion.connection.prepareStatement("INSERT INTO drogas_pers_poli "
                                + "(no_id, tipodroga, frecuencia_droga, fechacreacion)"
                                + " VALUES (?,?,?,?)");
                        sqlins.setString(1, txtnoiden.getText());
                        sqlins.setString(2, "Dick");
                        sqlins.setString(3, frecuencia_droga9);
                        sqlins.setString(4, fechanow);
                        sqlins.executeUpdate();
                    } catch (Exception e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if ("nohay".equals(tipodroga9)) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM drogas_pers_poli  WHERE tipodroga = 'Dick' AND no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune > 0) {
                    try {
                        PreparedStatement sqlpsiup = Conexion.connection.prepareStatement("DELETE FROM drogas_pers_poli WHERE tipodroga = 'Dick' AND no_id = " + txtnoiden.getText());
                        sqlpsiup.executeUpdate();
                    } catch (Exception e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        //10 otro
        if ("hay".equals(tipodroga10)) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM drogas_pers_poli  WHERE tipodroga = '" + tipodrog10 + "' AND  no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune < 1) {
                    try {
                        PreparedStatement sqlins = Conexion.connection.prepareStatement("INSERT INTO drogas_pers_poli "
                                + "(no_id, tipodroga, frecuencia_droga, fechacreacion)"
                                + " VALUES (?,?,?,?)");
                        sqlins.setString(1, txtnoiden.getText());
                        sqlins.setString(2, tipodrog10);
                        sqlins.setString(3, frecuencia_droga10);
                        sqlins.setString(4, fechanow);
                        sqlins.executeUpdate();
                    } catch (Exception e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if ("nohay".equals(tipodroga10)) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM drogas_pers_poli  WHERE tipodroga = '" + tipodrog10 + "' AND no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune > 0) {
                    try {
                        PreparedStatement sqlpsiup = Conexion.connection.prepareStatement("DELETE FROM drogas_pers_poli WHERE tipodroga = '" + tipodrog10 + "' AND no_id = " + txtnoiden.getText());
                        sqlpsiup.executeUpdate();
                    } catch (Exception e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        //validaciones combox narcotrafico
        //1
        if ("hay".equals(ti_partici1)) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM particinarco_poli  WHERE ti_partici = 'Siembra' AND  no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune < 1) {
                    try {
                        PreparedStatement sqlins = Conexion.connection.prepareStatement("INSERT INTO particinarco_poli "
                                + "(no_id, ti_partici, fechacreacion)"
                                + " VALUES (?,?,?)");
                        sqlins.setString(1, txtnoiden.getText());
                        sqlins.setString(2, "Siembra");
                        sqlins.setString(3, fechanow);
                        sqlins.executeUpdate();
                    } catch (Exception e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if ("nohay".equals(ti_partici1)) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM particinarco_poli  WHERE ti_partici = 'Siembra' AND no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune > 0) {
                    try {
                        PreparedStatement sqlpsiup = Conexion.connection.prepareStatement("DELETE FROM particinarco_poli WHERE ti_partici = 'Siembra' AND no_id = " + txtnoiden.getText());
                        sqlpsiup.executeUpdate();
                    } catch (Exception e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        //2
        if ("hay".equals(ti_partici2)) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM particinarco_poli  WHERE ti_partici = 'Recolección' AND  no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune < 1) {
                    try {
                        PreparedStatement sqlins = Conexion.connection.prepareStatement("INSERT INTO particinarco_poli "
                                + "(no_id, ti_partici, fechacreacion)"
                                + " VALUES (?,?,?)");
                        sqlins.setString(1, txtnoiden.getText());
                        sqlins.setString(2, "Recolección");
                        sqlins.setString(3, fechanow);
                        sqlins.executeUpdate();
                    } catch (Exception e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if ("nohay".equals(ti_partici2)) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM particinarco_poli  WHERE ti_partici = 'Recolección' AND no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune > 0) {
                    try {
                        PreparedStatement sqlpsiup = Conexion.connection.prepareStatement("DELETE FROM particinarco_poli WHERE ti_partici = 'Recolección' AND no_id = " + txtnoiden.getText());
                        sqlpsiup.executeUpdate();
                    } catch (Exception e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        //3
        if ("hay".equals(ti_partici3)) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM particinarco_poli  WHERE ti_partici = 'Fabricación' AND  no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune < 1) {
                    try {
                        PreparedStatement sqlins = Conexion.connection.prepareStatement("INSERT INTO particinarco_poli "
                                + "(no_id, ti_partici, fechacreacion)"
                                + " VALUES (?,?,?)");
                        sqlins.setString(1, txtnoiden.getText());
                        sqlins.setString(2, "Fabricación");
                        sqlins.setString(3, fechanow);
                        sqlins.executeUpdate();
                    } catch (Exception e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if ("nohay".equals(ti_partici3)) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM particinarco_poli  WHERE ti_partici = 'Fabricación' AND no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune > 0) {
                    try {
                        PreparedStatement sqlpsiup = Conexion.connection.prepareStatement("DELETE FROM particinarco_poli WHERE ti_partici = 'Fabricación' AND no_id = " + txtnoiden.getText());
                        sqlpsiup.executeUpdate();
                    } catch (Exception e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        //4
        if ("hay".equals(ti_partici4)) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM particinarco_poli  WHERE ti_partici = 'Transporte' AND  no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune < 1) {
                    try {
                        PreparedStatement sqlins = Conexion.connection.prepareStatement("INSERT INTO particinarco_poli "
                                + "(no_id, ti_partici, fechacreacion)"
                                + " VALUES (?,?,?)");
                        sqlins.setString(1, txtnoiden.getText());
                        sqlins.setString(2, "Transporte");
                        sqlins.setString(3, fechanow);
                        sqlins.executeUpdate();
                    } catch (Exception e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if ("nohay".equals(ti_partici4)) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM particinarco_poli  WHERE ti_partici = 'Transporte' AND no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune > 0) {
                    try {
                        PreparedStatement sqlpsiup = Conexion.connection.prepareStatement("DELETE FROM particinarco_poli WHERE ti_partici = 'Transporte' AND no_id = " + txtnoiden.getText());
                        sqlpsiup.executeUpdate();
                    } catch (Exception e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        //5
        if ("hay".equals(ti_partici5)) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM particinarco_poli  WHERE ti_partici = 'Exportación' AND  no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune < 1) {
                    try {
                        PreparedStatement sqlins = Conexion.connection.prepareStatement("INSERT INTO particinarco_poli "
                                + "(no_id, ti_partici, fechacreacion)"
                                + " VALUES (?,?,?)");
                        sqlins.setString(1, txtnoiden.getText());
                        sqlins.setString(2, "Exportación");
                        sqlins.setString(3, fechanow);
                        sqlins.executeUpdate();
                    } catch (Exception e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if ("nohay".equals(ti_partici5)) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM particinarco_poli  WHERE ti_partici = 'Exportación' AND no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune > 0) {
                    try {
                        PreparedStatement sqlpsiup = Conexion.connection.prepareStatement("DELETE FROM particinarco_poli WHERE ti_partici = 'Exportación' AND no_id = " + txtnoiden.getText());
                        sqlpsiup.executeUpdate();
                    } catch (Exception e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        //6
        if ("hay".equals(ti_partici6)) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM particinarco_poli  WHERE ti_partici = 'Comercialización' AND  no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune < 1) {
                    try {
                        PreparedStatement sqlins = Conexion.connection.prepareStatement("INSERT INTO particinarco_poli "
                                + "(no_id, ti_partici, fechacreacion)"
                                + " VALUES (?,?,?)");
                        sqlins.setString(1, txtnoiden.getText());
                        sqlins.setString(2, "Comercialización");
                        sqlins.setString(3, fechanow);
                        sqlins.executeUpdate();
                    } catch (Exception e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if ("nohay".equals(ti_partici6)) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM particinarco_poli  WHERE ti_partici = 'Comercialización' AND no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune > 0) {
                    try {
                        PreparedStatement sqlpsiup = Conexion.connection.prepareStatement("DELETE FROM particinarco_poli WHERE ti_partici = 'Comercialización' AND no_id = " + txtnoiden.getText());
                        sqlpsiup.executeUpdate();
                    } catch (Exception e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        //7
        if ("hay".equals(ti_partici7)) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM particinarco_poli  WHERE ti_partici = 'Insumos' AND  no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune < 1) {
                    try {
                        PreparedStatement sqlins = Conexion.connection.prepareStatement("INSERT INTO particinarco_poli "
                                + "(no_id, ti_partici, fechacreacion)"
                                + " VALUES (?,?,?)");
                        sqlins.setString(1, txtnoiden.getText());
                        sqlins.setString(2, "Insumos");
                        sqlins.setString(3, fechanow);
                        sqlins.executeUpdate();
                    } catch (Exception e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if ("nohay".equals(ti_partici7)) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM particinarco_poli  WHERE ti_partici = 'Insumos' AND no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune > 0) {
                    try {
                        PreparedStatement sqlpsiup = Conexion.connection.prepareStatement("DELETE FROM particinarco_poli WHERE ti_partici = 'Insumos' AND no_id = " + txtnoiden.getText());
                        sqlpsiup.executeUpdate();
                    } catch (Exception e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        //8
        if ("hay".equals(ti_partici8)) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM particinarco_poli  WHERE ti_partici = 'Almacenamiento' AND  no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune < 1) {
                    try {
                        PreparedStatement sqlins = Conexion.connection.prepareStatement("INSERT INTO particinarco_poli "
                                + "(no_id, ti_partici, fechacreacion)"
                                + " VALUES (?,?,?)");
                        sqlins.setString(1, txtnoiden.getText());
                        sqlins.setString(2, "Almacenamiento");
                        sqlins.setString(3, fechanow);
                        sqlins.executeUpdate();
                    } catch (Exception e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if ("nohay".equals(ti_partici8)) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM particinarco_poli  WHERE ti_partici = 'Almacenamiento' AND no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune > 0) {
                    try {
                        PreparedStatement sqlpsiup = Conexion.connection.prepareStatement("DELETE FROM particinarco_poli WHERE ti_partici = 'Almacenamiento' AND no_id = " + txtnoiden.getText());
                        sqlpsiup.executeUpdate();
                    } catch (Exception e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        //9
        if ("hay".equals(ti_partici9)) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM particinarco_poli  WHERE ti_partici = 'Recibir beneficios' AND  no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune < 1) {
                    try {
                        PreparedStatement sqlins = Conexion.connection.prepareStatement("INSERT INTO particinarco_poli "
                                + "(no_id, ti_partici, fechacreacion)"
                                + " VALUES (?,?,?)");
                        sqlins.setString(1, txtnoiden.getText());
                        sqlins.setString(2, "Recibir beneficios");
                        sqlins.setString(3, fechanow);
                        sqlins.executeUpdate();
                    } catch (Exception e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if ("nohay".equals(ti_partici9)) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM particinarco_poli  WHERE ti_partici = 'Recibir beneficios' AND no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune > 0) {
                    try {
                        PreparedStatement sqlpsiup = Conexion.connection.prepareStatement("DELETE FROM particinarco_poli WHERE ti_partici = 'Recibir beneficios' AND no_id = " + txtnoiden.getText());
                        sqlpsiup.executeUpdate();
                    } catch (Exception e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        //10
        if ("hay".equals(ti_partici10)) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM particinarco_poli  WHERE ti_partici = 'Procesamiento' AND  no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune < 1) {
                    try {
                        PreparedStatement sqlins = Conexion.connection.prepareStatement("INSERT INTO particinarco_poli "
                                + "(no_id, ti_partici, fechacreacion)"
                                + " VALUES (?,?,?)");
                        sqlins.setString(1, txtnoiden.getText());
                        sqlins.setString(2, "Procesamiento");
                        sqlins.setString(3, fechanow);
                        sqlins.executeUpdate();
                    } catch (Exception e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if ("nohay".equals(ti_partici10)) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM particinarco_poli  WHERE ti_partici = 'Procesamiento' AND no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune > 0) {
                    try {
                        PreparedStatement sqlpsiup = Conexion.connection.prepareStatement("DELETE FROM particinarco_poli WHERE ti_partici = 'Procesamiento' AND no_id = " + txtnoiden.getText());
                        sqlpsiup.executeUpdate();
                    } catch (Exception e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        //11
        if ("hay".equals(ti_partici11)) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM particinarco_poli  WHERE ti_partici = 'Estudio de suelo para cultivar la droga' AND  no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune < 1) {
                    try {
                        PreparedStatement sqlins = Conexion.connection.prepareStatement("INSERT INTO particinarco_poli "
                                + "(no_id, ti_partici, fechacreacion)"
                                + " VALUES (?,?,?)");
                        sqlins.setString(1, txtnoiden.getText());
                        sqlins.setString(2, "Estudio de suelo para cultivar la droga");
                        sqlins.setString(3, fechanow);
                        sqlins.executeUpdate();
                    } catch (Exception e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if ("nohay".equals(ti_partici11)) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM particinarco_poli  WHERE ti_partici = 'Estudio de suelo para cultivar la droga' AND no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune > 0) {
                    try {
                        PreparedStatement sqlpsiup = Conexion.connection.prepareStatement("DELETE FROM particinarco_poli WHERE ti_partici = 'Estudio de suelo para cultivar la droga' AND no_id = " + txtnoiden.getText());
                        sqlpsiup.executeUpdate();
                    } catch (Exception e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    
    //resultados consultaaaaaaaaaaaaaaaaaaaa

    public void validacionresultado() {
        //validaciones check box
        //1

        try {
            Connection con = Conexion.connection;
            Statement s = con.createStatement();
            ResultSet r = s.executeQuery("SELECT * FROM drogas_pers_poli  WHERE tipodroga = 'Marihuana' AND  no_id = " + DatosPrincipales.getNoIdenExaminado());
            r.next();
            String frecuencia_droga = r.getString("frecuencia_droga");

            int cune = r.getRow();
            if (cune > 0) {
                tipodroga1 = "hay";
                frecuencia_droga1 = frecuencia_droga;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
        }

        //2
        try {
            Connection con = Conexion.connection;
            Statement s = con.createStatement();
            ResultSet r = s.executeQuery("SELECT * FROM drogas_pers_poli  WHERE tipodroga = 'Marihuana' AND  no_id = " + DatosPrincipales.getNoIdenExaminado());
            r.next();
            String frecuencia_droga = r.getString("frecuencia_droga");

            int cune = r.getRow();
            if (cune > 0) {
                tipodroga2 = "hay";
                frecuencia_droga2 = frecuencia_droga;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
        }

        //3
        try {
            Connection con = Conexion.connection;
            Statement s = con.createStatement();
            ResultSet r = s.executeQuery("SELECT * FROM drogas_pers_poli  WHERE tipodroga = 'Bazuco' AND  no_id = " + DatosPrincipales.getNoIdenExaminado());
            r.next();
            String frecuencia_droga = r.getString("frecuencia_droga");

            int cune = r.getRow();
            if (cune > 0) {
                tipodroga3 = "hay";
                frecuencia_droga3 = frecuencia_droga;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
        }

        //4
        try {
            Connection con = Conexion.connection;
            Statement s = con.createStatement();
            ResultSet r = s.executeQuery("SELECT * FROM drogas_pers_poli  WHERE tipodroga = 'LDS' AND  no_id = " + DatosPrincipales.getNoIdenExaminado());
            r.next();
            String frecuencia_droga = r.getString("frecuencia_droga");

            int cune = r.getRow();
            if (cune > 0) {
                tipodroga4 = "hay";
                frecuencia_droga4 = frecuencia_droga;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
        }

        //5
        try {
            Connection con = Conexion.connection;
            Statement s = con.createStatement();
            ResultSet r = s.executeQuery("SELECT * FROM drogas_pers_poli  WHERE tipodroga = 'Éxtasis' AND  no_id = " + DatosPrincipales.getNoIdenExaminado());
            r.next();
            String frecuencia_droga = r.getString("frecuencia_droga");

            int cune = r.getRow();
            if (cune > 0) {
                tipodroga5 = "hay";
                frecuencia_droga5 = frecuencia_droga;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
        }

        //6
        try {
            Connection con = Conexion.connection;
            Statement s = con.createStatement();
            ResultSet r = s.executeQuery("SELECT * FROM drogas_pers_poli  WHERE tipodroga = 'Heroína' AND  no_id = " + DatosPrincipales.getNoIdenExaminado());
            r.next();
            String frecuencia_droga = r.getString("frecuencia_droga");

            int cune = r.getRow();
            if (cune > 0) {
                tipodroga6 = "hay";
                frecuencia_droga6 = frecuencia_droga;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
        }

        //7
        try {
            Connection con = Conexion.connection;
            Statement s = con.createStatement();
            ResultSet r = s.executeQuery("SELECT * FROM drogas_pers_poli  WHERE tipodroga = 'Medicamentos psiquiátricos' AND  no_id = " + DatosPrincipales.getNoIdenExaminado());
            r.next();
            String frecuencia_droga = r.getString("frecuencia_droga");

            int cune = r.getRow();
            if (cune > 0) {
                tipodroga7 = "hay";
                frecuencia_droga7 = frecuencia_droga;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
        }

        //8
        try {
            Connection con = Conexion.connection;
            Statement s = con.createStatement();
            ResultSet r = s.executeQuery("SELECT * FROM drogas_pers_poli  WHERE tipodroga = 'Popper' AND  no_id = " + DatosPrincipales.getNoIdenExaminado());
            r.next();
            String frecuencia_droga = r.getString("frecuencia_droga");

            int cune = r.getRow();
            if (cune > 0) {
                tipodroga8 = "hay";
                frecuencia_droga8 = frecuencia_droga;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
        }

        //9
        try {
            Connection con = Conexion.connection;
            Statement s = con.createStatement();
            ResultSet r = s.executeQuery("SELECT * FROM drogas_pers_poli  WHERE tipodroga = 'Dick' AND  no_id = " + DatosPrincipales.getNoIdenExaminado());
            r.next();
            String frecuencia_droga = r.getString("frecuencia_droga");

            int cune = r.getRow();
            if (cune > 0) {
                tipodroga9 = "hay";
                frecuencia_droga9 = frecuencia_droga;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
        }

        //10
        try {
            Connection con = Conexion.connection;
            Statement s = con.createStatement();
            ResultSet r = s.executeQuery("SELECT * FROM particinarco_poli  WHERE (ti_partici != 'Siembra'\n"
                    + " AND ti_partici != 'Recolección'\n"
                    + " AND ti_partici != 'Fabricación'\n"
                    + " AND ti_partici != 'Transporte'\n"
                    + " AND ti_partici != 'Exportación'\n"
                    + " AND ti_partici != 'Comercialización'\n"
                    + " AND ti_partici != 'Insumos'\n"
                    + " AND ti_partici != 'Almacenamiento'\n"
                    + " AND ti_partici != 'Recibir beneficios'\n"
                    + "  ) AND  no_id = " + DatosPrincipales.getNoIdenExaminado());
            r.next();
            String tipodroga = r.getString("tipodroga");
            String frecuencia_droga = r.getString("frecuencia_droga");

            int cune = r.getRow();
            if (cune > 0) {
                tipodroga10 = "hay";
                tipodrog10 = tipodroga;
                frecuencia_droga10 = frecuencia_droga;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //validaciones combox narcotrafico
        //1
        
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM particinarco_poli  WHERE ti_partici = 'Siembra' AND  no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune > 1) {
                    try {
                        PreparedStatement sqlins = Conexion.connection.prepareStatement("INSERT INTO particinarco_poli "
                                + "(no_id, ti_partici, fechacreacion)"
                                + " VALUES (?,?,?)");
                        sqlins.setString(1, txtnoiden.getText());
                        sqlins.setString(2, "Siembra");
                        sqlins.setString(3, fechanow);
                        sqlins.executeUpdate();
                    } catch (Exception e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
       

        //2
        if ("hay".equals(ti_partici2)) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM particinarco_poli  WHERE ti_partici = 'Recolección' AND  no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune < 1) {
                    try {
                        PreparedStatement sqlins = Conexion.connection.prepareStatement("INSERT INTO particinarco_poli "
                                + "(no_id, ti_partici, fechacreacion)"
                                + " VALUES (?,?,?)");
                        sqlins.setString(1, txtnoiden.getText());
                        sqlins.setString(2, "Recolección");
                        sqlins.setString(3, fechanow);
                        sqlins.executeUpdate();
                    } catch (Exception e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if ("nohay".equals(ti_partici2)) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM particinarco_poli  WHERE ti_partici = 'Recolección' AND no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune > 0) {
                    try {
                        PreparedStatement sqlpsiup = Conexion.connection.prepareStatement("DELETE FROM particinarco_poli WHERE ti_partici = 'Recolección' AND no_id = " + txtnoiden.getText());
                        sqlpsiup.executeUpdate();
                    } catch (Exception e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        //3
        if ("hay".equals(ti_partici3)) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM particinarco_poli  WHERE ti_partici = 'Fabricación' AND  no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune < 1) {
                    try {
                        PreparedStatement sqlins = Conexion.connection.prepareStatement("INSERT INTO particinarco_poli "
                                + "(no_id, ti_partici, fechacreacion)"
                                + " VALUES (?,?,?)");
                        sqlins.setString(1, txtnoiden.getText());
                        sqlins.setString(2, "Fabricación");
                        sqlins.setString(3, fechanow);
                        sqlins.executeUpdate();
                    } catch (Exception e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if ("nohay".equals(ti_partici3)) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM particinarco_poli  WHERE ti_partici = 'Fabricación' AND no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune > 0) {
                    try {
                        PreparedStatement sqlpsiup = Conexion.connection.prepareStatement("DELETE FROM particinarco_poli WHERE ti_partici = 'Fabricación' AND no_id = " + txtnoiden.getText());
                        sqlpsiup.executeUpdate();
                    } catch (Exception e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        //4
        if ("hay".equals(ti_partici4)) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM particinarco_poli  WHERE ti_partici = 'Transporte' AND  no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune < 1) {
                    try {
                        PreparedStatement sqlins = Conexion.connection.prepareStatement("INSERT INTO particinarco_poli "
                                + "(no_id, ti_partici, fechacreacion)"
                                + " VALUES (?,?,?)");
                        sqlins.setString(1, txtnoiden.getText());
                        sqlins.setString(2, "Transporte");
                        sqlins.setString(3, fechanow);
                        sqlins.executeUpdate();
                    } catch (Exception e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if ("nohay".equals(ti_partici4)) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM particinarco_poli  WHERE ti_partici = 'Transporte' AND no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune > 0) {
                    try {
                        PreparedStatement sqlpsiup = Conexion.connection.prepareStatement("DELETE FROM particinarco_poli WHERE ti_partici = 'Transporte' AND no_id = " + txtnoiden.getText());
                        sqlpsiup.executeUpdate();
                    } catch (Exception e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        //5
        if ("hay".equals(ti_partici5)) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM particinarco_poli  WHERE ti_partici = 'Exportación' AND  no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune < 1) {
                    try {
                        PreparedStatement sqlins = Conexion.connection.prepareStatement("INSERT INTO particinarco_poli "
                                + "(no_id, ti_partici, fechacreacion)"
                                + " VALUES (?,?,?)");
                        sqlins.setString(1, txtnoiden.getText());
                        sqlins.setString(2, "Exportación");
                        sqlins.setString(3, fechanow);
                        sqlins.executeUpdate();
                    } catch (Exception e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if ("nohay".equals(ti_partici5)) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM particinarco_poli  WHERE ti_partici = 'Exportación' AND no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune > 0) {
                    try {
                        PreparedStatement sqlpsiup = Conexion.connection.prepareStatement("DELETE FROM particinarco_poli WHERE ti_partici = 'Exportación' AND no_id = " + txtnoiden.getText());
                        sqlpsiup.executeUpdate();
                    } catch (Exception e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        //6
        if ("hay".equals(ti_partici6)) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM particinarco_poli  WHERE ti_partici = 'Comercialización' AND  no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune < 1) {
                    try {
                        PreparedStatement sqlins = Conexion.connection.prepareStatement("INSERT INTO particinarco_poli "
                                + "(no_id, ti_partici, fechacreacion)"
                                + " VALUES (?,?,?)");
                        sqlins.setString(1, txtnoiden.getText());
                        sqlins.setString(2, "Comercialización");
                        sqlins.setString(3, fechanow);
                        sqlins.executeUpdate();
                    } catch (Exception e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if ("nohay".equals(ti_partici6)) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM particinarco_poli  WHERE ti_partici = 'Comercialización' AND no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune > 0) {
                    try {
                        PreparedStatement sqlpsiup = Conexion.connection.prepareStatement("DELETE FROM particinarco_poli WHERE ti_partici = 'Comercialización' AND no_id = " + txtnoiden.getText());
                        sqlpsiup.executeUpdate();
                    } catch (Exception e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        //7
        if ("hay".equals(ti_partici7)) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM particinarco_poli  WHERE ti_partici = 'Insumos' AND  no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune < 1) {
                    try {
                        PreparedStatement sqlins = Conexion.connection.prepareStatement("INSERT INTO particinarco_poli "
                                + "(no_id, ti_partici, fechacreacion)"
                                + " VALUES (?,?,?)");
                        sqlins.setString(1, txtnoiden.getText());
                        sqlins.setString(2, "Insumos");
                        sqlins.setString(3, fechanow);
                        sqlins.executeUpdate();
                    } catch (Exception e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if ("nohay".equals(ti_partici7)) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM particinarco_poli  WHERE ti_partici = 'Insumos' AND no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune > 0) {
                    try {
                        PreparedStatement sqlpsiup = Conexion.connection.prepareStatement("DELETE FROM particinarco_poli WHERE ti_partici = 'Insumos' AND no_id = " + txtnoiden.getText());
                        sqlpsiup.executeUpdate();
                    } catch (Exception e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        //8
        if ("hay".equals(ti_partici8)) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM particinarco_poli  WHERE ti_partici = 'Almacenamiento' AND  no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune < 1) {
                    try {
                        PreparedStatement sqlins = Conexion.connection.prepareStatement("INSERT INTO particinarco_poli "
                                + "(no_id, ti_partici, fechacreacion)"
                                + " VALUES (?,?,?)");
                        sqlins.setString(1, txtnoiden.getText());
                        sqlins.setString(2, "Almacenamiento");
                        sqlins.setString(3, fechanow);
                        sqlins.executeUpdate();
                    } catch (Exception e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if ("nohay".equals(ti_partici8)) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM particinarco_poli  WHERE ti_partici = 'Almacenamiento' AND no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune > 0) {
                    try {
                        PreparedStatement sqlpsiup = Conexion.connection.prepareStatement("DELETE FROM particinarco_poli WHERE ti_partici = 'Almacenamiento' AND no_id = " + txtnoiden.getText());
                        sqlpsiup.executeUpdate();
                    } catch (Exception e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        //9
        if ("hay".equals(ti_partici9)) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM particinarco_poli  WHERE ti_partici = 'Recibir beneficios' AND  no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune < 1) {
                    try {
                        PreparedStatement sqlins = Conexion.connection.prepareStatement("INSERT INTO particinarco_poli "
                                + "(no_id, ti_partici, fechacreacion)"
                                + " VALUES (?,?,?)");
                        sqlins.setString(1, txtnoiden.getText());
                        sqlins.setString(2, "Recibir beneficios");
                        sqlins.setString(3, fechanow);
                        sqlins.executeUpdate();
                    } catch (Exception e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if ("nohay".equals(ti_partici9)) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM particinarco_poli  WHERE ti_partici = 'Recibir beneficios' AND no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune > 0) {
                    try {
                        PreparedStatement sqlpsiup = Conexion.connection.prepareStatement("DELETE FROM particinarco_poli WHERE ti_partici = 'Recibir beneficios' AND no_id = " + txtnoiden.getText());
                        sqlpsiup.executeUpdate();
                    } catch (Exception e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        //10
        if ("hay".equals(ti_partici10)) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM particinarco_poli  WHERE ti_partici = 'Procesamiento' AND  no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune < 1) {
                    try {
                        PreparedStatement sqlins = Conexion.connection.prepareStatement("INSERT INTO particinarco_poli "
                                + "(no_id, ti_partici, fechacreacion)"
                                + " VALUES (?,?,?)");
                        sqlins.setString(1, txtnoiden.getText());
                        sqlins.setString(2, "Procesamiento");
                        sqlins.setString(3, fechanow);
                        sqlins.executeUpdate();
                    } catch (Exception e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if ("nohay".equals(ti_partici10)) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM particinarco_poli  WHERE ti_partici = 'Procesamiento' AND no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune > 0) {
                    try {
                        PreparedStatement sqlpsiup = Conexion.connection.prepareStatement("DELETE FROM particinarco_poli WHERE ti_partici = 'Procesamiento' AND no_id = " + txtnoiden.getText());
                        sqlpsiup.executeUpdate();
                    } catch (Exception e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        //11
        if ("hay".equals(ti_partici11)) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM particinarco_poli  WHERE ti_partici = 'Estudio de suelo para cultivar la droga' AND  no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune < 1) {
                    try {
                        PreparedStatement sqlins = Conexion.connection.prepareStatement("INSERT INTO particinarco_poli "
                                + "(no_id, ti_partici, fechacreacion)"
                                + " VALUES (?,?,?)");
                        sqlins.setString(1, txtnoiden.getText());
                        sqlins.setString(2, "Estudio de suelo para cultivar la droga");
                        sqlins.setString(3, fechanow);
                        sqlins.executeUpdate();
                    } catch (Exception e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if ("nohay".equals(ti_partici11)) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM particinarco_poli  WHERE ti_partici = 'Estudio de suelo para cultivar la droga' AND no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune > 0) {
                    try {
                        PreparedStatement sqlpsiup = Conexion.connection.prepareStatement("DELETE FROM particinarco_poli WHERE ti_partici = 'Estudio de suelo para cultivar la droga' AND no_id = " + txtnoiden.getText());
                        sqlpsiup.executeUpdate();
                    } catch (Exception e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void update_consusus() {
        try {
            PreparedStatement sql = Conexion.connection.prepareStatement("UPDATE datos_generales_poli "
                    + "SET haconsumido = '" + haconsumido + "', exphaconsumido = '" + exphaconsumido + "',"
                    + " drogaspregun1 = '" + drogaspregun1 + "', expdrogaspregun1 = '" + expdrogaspregun1 + "',"
                    + " drogaspregun2 = '" + drogaspregun2 + "', expdrogaspregun2 = '" + expdrogaspregun2 + "',"
                    + " drogaspregun3 = '" + drogaspregun3 + "', expdrogaspregun3 = '" + expdrogaspregun3 + "',"
                    + " drogaspregun4 = '" + drogaspregun4 + "', expdrogaspregun4 = '" + expdrogaspregun4 + "',"
                    + "haparticinarco = '" + haparticipado + "', exphaparticipado = '" + exphaparticipado + "', "
                    + " drogaspregun5 = '" + drogaspregun5 + "', expdrogaspregun5 = '" + expdrogaspregun5 + "',"
                    + " drogaspregun6 = '" + drogaspregun6 + "', expdrogaspregun6 = '" + expdrogaspregun6 + "',"
                    + " drogaspregun7 = '" + drogaspregun7 + "', expdrogaspregun7 = '" + expdrogaspregun7 + "',"
                    + " drogaspregun8 = '" + drogaspregun8 + "', expdrogaspregun8 = '" + expdrogaspregun8 + "',"
                    + " drogaspregun9 = '" + drogaspregun9 + "', expdrogaspregun9 = '" + expdrogaspregun9 + "',"
                    + " drogaspregun10 = '" + drogaspregun10 + "', expdrogaspregun10 = '" + expdrogaspregun10 + "',"
                    + " drogaspregun11 = '" + drogaspregun11 + "', expdrogaspregun11 = '" + expdrogaspregun11 + "',"
                    + " drogaspregun12 = '" + drogaspregun12 + "', expdrogaspregun12 = '" + expdrogaspregun12 + "',"
                    + "drogaspregun13 = '" + drogaspregun13 + "', expdrogaspregun13 = '" + expdrogaspregun13 + "' WHERE no_id = " + txtnoiden.getText());
            sql.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "¡Error en el ingreso de datos a la base!\nPor favor solicite ayuda al equipo de desarrollo" + e);
        }
    }

    public void limpiar() {
        tipodroga1 = "";
        tipodroga2 = "";
        tipodroga3 = "";
        tipodroga4 = "";
        tipodroga5 = "";
        tipodroga6 = "";
        tipodroga7 = "";
        tipodroga8 = "";
        tipodroga9 = "";
        tipodroga10 = "";
        tipodrog10 = "";
        frecuencia_droga1 = "";
        frecuencia_droga2 = "";
        frecuencia_droga3 = "";
        frecuencia_droga4 = "";
        frecuencia_droga5 = "";
        frecuencia_droga6 = "";
        frecuencia_droga7 = "";
        frecuencia_droga8 = "";
        frecuencia_droga9 = "";
        frecuencia_droga10 = "";
        ti_partici1 = "";
        ti_partici2 = "";
        ti_partici3 = "";
        ti_partici4 = "";
        ti_partici5 = "";
        ti_partici6 = "";
        ti_partici7 = "";
        ti_partici8 = "";
        ti_partici9 = "";
        ti_partici10 = "";
        ti_partici11 = "";
        haconsumido = "-";
        haparticipado = "-";
        exphaparticipado = "";
        exphaconsumido = "";
        drogaspregun1 = "-";
        drogaspregun2 = "-";
        drogaspregun3 = "-";
        drogaspregun4 = "-";
        drogaspregun5 = "-";
        drogaspregun6 = "-";
        drogaspregun7 = "-";
        drogaspregun8 = "-";
        drogaspregun9 = "-";
        drogaspregun10 = "-";
        drogaspregun11 = "-";
        drogaspregun12 = "-";
        drogaspregun13 = "-";
        expdrogaspregun1 = "";
        expdrogaspregun2 = "";
        expdrogaspregun3 = "";
        expdrogaspregun4 = "";
        expdrogaspregun5 = "";
        expdrogaspregun6 = "";
        expdrogaspregun7 = "";
        expdrogaspregun8 = "";
        expdrogaspregun9 = "";
        expdrogaspregun10 = "";
        expdrogaspregun11 = "";
        expdrogaspregun12 = "";
        expdrogaspregun13 = "";
        admisionConsumoSustancias = "";
        colorCategoria = "sincolor";
    }

}
