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
public class VinculosPersonas {

    private static String vinculosmargenley = "-";
    private static String exptipovinculos = "";
    private static String actdelictpre1 = "-";
    private static String expactdelictpre1 = "";
    private static String actdelictpre2 = "-";
    private static String expactdelictpre2 = "";
    private static String actdelictpre3 = "-";
    private static String expactdelictpre3 = "";
    private static String actdelictpre4 = "-";
    private static String expactdelictpre4 = "";
    private static String actdelictpre5 = "-";
    private static String expactdelictpre5 = "";
    private static String actdelictpre6 = "-";
    private static String expactdelictpre6 = "";
    private static String actdelictpre7 = "-";
    private static String expactdelictpre7 = "";

    private static String tipovinculo1 = "";
    private static String tipovinculo2 = "";
    private static String tipovinculo3 = "";
    private static String tipovinculo4 = "";
    private static String tipovinculo5 = "";
    private static String tipovinculo6 = "";
    private static String tipovinculo7 = "";
    private static String tipovinculo8 = "";
    private static String tipovinculo9 = "";
    private static String tipovinculo10 = "";
    private static String tipovinculo11 = "";
    private static String tipovinculo12 = "";
    private static String tipovinculo13 = "";
    private static String tipovinculo14 = "";
    private static String tipovinculo15 = "";
    private static String tipovinculo16 = "";
    private static String tipovinculo17 = "";
    private static String tipovinculo18 = "";
    private static String tipovinculo19 = "";
    private static String tipovinculo20 = "";
    private static String tipovinculo21 = "";
    private static String tipovinculo22 = "";
    private static String tipovinculo23 = "";
    private static String tipovinculo24 = "";
    private static String tipovinculo25 = "";
    private static String tipovinculo26 = "";
    private static String tipovinculo27 = "";
    private static String tipovinculo28 = "";
    private static String tipovinculo29 = "";

    private static String admisionVinculosPersonas = "";

    private static String colorCategoria = "sincolor";

    public static String getColorCategoria() {
        return colorCategoria;
    }

    public static void setColorCategoria(String colorCategoria) {
        VinculosPersonas.colorCategoria = colorCategoria;
    }

    public static String getAdmisionVinculosPersonas() {
        return admisionVinculosPersonas;
    }

    public static void setAdmisionVinculosPersonas(String admisionVinculosPersonas) {
        VinculosPersonas.admisionVinculosPersonas = admisionVinculosPersonas;
    }

    public static String getVinculosmargenley() {
        return vinculosmargenley;
    }

    public static void setVinculosmargenley(String vinculosmargenley) {
        VinculosPersonas.vinculosmargenley = vinculosmargenley;
    }

    public static String getExptipovinculos() {
        return exptipovinculos;
    }

    public static void setExptipovinculos(String exptipovinculos) {
        VinculosPersonas.exptipovinculos = exptipovinculos;
    }

    public static String getActdelictpre1() {
        return actdelictpre1;
    }

    public static void setActdelictpre1(String actdelictpre1) {
        VinculosPersonas.actdelictpre1 = actdelictpre1;
    }

    public static String getExpactdelictpre1() {
        return expactdelictpre1;
    }

    public static void setExpactdelictpre1(String expactdelictpre1) {
        VinculosPersonas.expactdelictpre1 = expactdelictpre1;
    }

    public static String getActdelictpre2() {
        return actdelictpre2;
    }

    public static void setActdelictpre2(String actdelictpre2) {
        VinculosPersonas.actdelictpre2 = actdelictpre2;
    }

    public static String getExpactdelictpre2() {
        return expactdelictpre2;
    }

    public static void setExpactdelictpre2(String expactdelictpre2) {
        VinculosPersonas.expactdelictpre2 = expactdelictpre2;
    }

    public static String getActdelictpre3() {
        return actdelictpre3;
    }

    public static void setActdelictpre3(String actdelictpre3) {
        VinculosPersonas.actdelictpre3 = actdelictpre3;
    }

    public static String getExpactdelictpre3() {
        return expactdelictpre3;
    }

    public static void setExpactdelictpre3(String expactdelictpre3) {
        VinculosPersonas.expactdelictpre3 = expactdelictpre3;
    }

    public static String getActdelictpre4() {
        return actdelictpre4;
    }

    public static void setActdelictpre4(String actdelictpre4) {
        VinculosPersonas.actdelictpre4 = actdelictpre4;
    }

    public static String getExpactdelictpre4() {
        return expactdelictpre4;
    }

    public static void setExpactdelictpre4(String expactdelictpre4) {
        VinculosPersonas.expactdelictpre4 = expactdelictpre4;
    }

    public static String getActdelictpre5() {
        return actdelictpre5;
    }

    public static void setActdelictpre5(String actdelictpre5) {
        VinculosPersonas.actdelictpre5 = actdelictpre5;
    }

    public static String getExpactdelictpre5() {
        return expactdelictpre5;
    }

    public static void setExpactdelictpre5(String expactdelictpre5) {
        VinculosPersonas.expactdelictpre5 = expactdelictpre5;
    }

    public static String getActdelictpre6() {
        return actdelictpre6;
    }

    public static void setActdelictpre6(String actdelictpre6) {
        VinculosPersonas.actdelictpre6 = actdelictpre6;
    }

    public static String getExpactdelictpre6() {
        return expactdelictpre6;
    }

    public static void setExpactdelictpre6(String expactdelictpre6) {
        VinculosPersonas.expactdelictpre6 = expactdelictpre6;
    }

    public static String getActdelictpre7() {
        return actdelictpre7;
    }

    public static void setActdelictpre7(String actdelictpre7) {
        VinculosPersonas.actdelictpre7 = actdelictpre7;
    }

    public static String getExpactdelictpre7() {
        return expactdelictpre7;
    }

    public static void setExpactdelictpre7(String expactdelictpre7) {
        VinculosPersonas.expactdelictpre7 = expactdelictpre7;
    }

    public static String getTipovinculo1() {
        return tipovinculo1;
    }

    public static void setTipovinculo1(String tipovinculo1) {
        VinculosPersonas.tipovinculo1 = tipovinculo1;
    }

    public static String getTipovinculo2() {
        return tipovinculo2;
    }

    public static void setTipovinculo2(String tipovinculo2) {
        VinculosPersonas.tipovinculo2 = tipovinculo2;
    }

    public static String getTipovinculo3() {
        return tipovinculo3;
    }

    public static void setTipovinculo3(String tipovinculo3) {
        VinculosPersonas.tipovinculo3 = tipovinculo3;
    }

    public static String getTipovinculo4() {
        return tipovinculo4;
    }

    public static void setTipovinculo4(String tipovinculo4) {
        VinculosPersonas.tipovinculo4 = tipovinculo4;
    }

    public static String getTipovinculo5() {
        return tipovinculo5;
    }

    public static void setTipovinculo5(String tipovinculo5) {
        VinculosPersonas.tipovinculo5 = tipovinculo5;
    }

    public static String getTipovinculo6() {
        return tipovinculo6;
    }

    public static void setTipovinculo6(String tipovinculo6) {
        VinculosPersonas.tipovinculo6 = tipovinculo6;
    }

    public static String getTipovinculo7() {
        return tipovinculo7;
    }

    public static void setTipovinculo7(String tipovinculo7) {
        VinculosPersonas.tipovinculo7 = tipovinculo7;
    }

    public static String getTipovinculo8() {
        return tipovinculo8;
    }

    public static void setTipovinculo8(String tipovinculo8) {
        VinculosPersonas.tipovinculo8 = tipovinculo8;
    }

    public static String getTipovinculo9() {
        return tipovinculo9;
    }

    public static void setTipovinculo9(String tipovinculo9) {
        VinculosPersonas.tipovinculo9 = tipovinculo9;
    }

    public static String getTipovinculo10() {
        return tipovinculo10;
    }

    public static void setTipovinculo10(String tipovinculo10) {
        VinculosPersonas.tipovinculo10 = tipovinculo10;
    }

    public static String getTipovinculo11() {
        return tipovinculo11;
    }

    public static void setTipovinculo11(String tipovinculo11) {
        VinculosPersonas.tipovinculo11 = tipovinculo11;
    }

    public static String getTipovinculo12() {
        return tipovinculo12;
    }

    public static void setTipovinculo12(String tipovinculo12) {
        VinculosPersonas.tipovinculo12 = tipovinculo12;
    }

    public static String getTipovinculo13() {
        return tipovinculo13;
    }

    public static void setTipovinculo13(String tipovinculo13) {
        VinculosPersonas.tipovinculo13 = tipovinculo13;
    }

    public static String getTipovinculo14() {
        return tipovinculo14;
    }

    public static void setTipovinculo14(String tipovinculo14) {
        VinculosPersonas.tipovinculo14 = tipovinculo14;
    }

    public static String getTipovinculo15() {
        return tipovinculo15;
    }

    public static void setTipovinculo15(String tipovinculo15) {
        VinculosPersonas.tipovinculo15 = tipovinculo15;
    }

    public static String getTipovinculo16() {
        return tipovinculo16;
    }

    public static void setTipovinculo16(String tipovinculo16) {
        VinculosPersonas.tipovinculo16 = tipovinculo16;
    }

    public static String getTipovinculo17() {
        return tipovinculo17;
    }

    public static void setTipovinculo17(String tipovinculo17) {
        VinculosPersonas.tipovinculo17 = tipovinculo17;
    }

    public static String getTipovinculo18() {
        return tipovinculo18;
    }

    public static void setTipovinculo18(String tipovinculo18) {
        VinculosPersonas.tipovinculo18 = tipovinculo18;
    }

    public static String getTipovinculo19() {
        return tipovinculo19;
    }

    public static void setTipovinculo19(String tipovinculo19) {
        VinculosPersonas.tipovinculo19 = tipovinculo19;
    }

    public static String getTipovinculo20() {
        return tipovinculo20;
    }

    public static void setTipovinculo20(String tipovinculo20) {
        VinculosPersonas.tipovinculo20 = tipovinculo20;
    }

    public static String getTipovinculo21() {
        return tipovinculo21;
    }

    public static void setTipovinculo21(String tipovinculo21) {
        VinculosPersonas.tipovinculo21 = tipovinculo21;
    }

    public static String getTipovinculo22() {
        return tipovinculo22;
    }

    public static void setTipovinculo22(String tipovinculo22) {
        VinculosPersonas.tipovinculo22 = tipovinculo22;
    }

    public static String getTipovinculo23() {
        return tipovinculo23;
    }

    public static void setTipovinculo23(String tipovinculo23) {
        VinculosPersonas.tipovinculo23 = tipovinculo23;
    }

    public static String getTipovinculo24() {
        return tipovinculo24;
    }

    public static void setTipovinculo24(String tipovinculo24) {
        VinculosPersonas.tipovinculo24 = tipovinculo24;
    }

    public static String getTipovinculo25() {
        return tipovinculo25;
    }

    public static void setTipovinculo25(String tipovinculo25) {
        VinculosPersonas.tipovinculo25 = tipovinculo25;
    }

    public static String getTipovinculo26() {
        return tipovinculo26;
    }

    public static void setTipovinculo26(String tipovinculo26) {
        VinculosPersonas.tipovinculo26 = tipovinculo26;
    }

    public static String getTipovinculo27() {
        return tipovinculo27;
    }

    public static void setTipovinculo27(String tipovinculo27) {
        VinculosPersonas.tipovinculo27 = tipovinculo27;
    }

    public static String getTipovinculo28() {
        return tipovinculo28;
    }

    public static void setTipovinculo28(String tipovinculo28) {
        VinculosPersonas.tipovinculo28 = tipovinculo28;
    }

    public static String getTipovinculo29() {
        return tipovinculo29;
    }

    public static void setTipovinculo29(String tipovinculo29) {
        VinculosPersonas.tipovinculo29 = tipovinculo29;
    }

    SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");
    java.util.Date fecha = new java.util.Date();
    public String fechanow = date.format(fecha);

    public void validarmalosactos() {
        //check box de vinculos con malas personas
        //1
        if (tipovinculo1.equals("hay")) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM vincu_margenley_poli  WHERE tipovinculo = 'Ladrones' AND  no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune < 1) {
                    try {
                        PreparedStatement sqlins = Conexion.connection.prepareStatement("INSERT INTO vincu_margenley_poli "
                                + "(no_id, tipovinculo, fechacreacion)"
                                + " VALUES (?,?,?)");
                        sqlins.setString(1, txtnoiden.getText());
                        sqlins.setString(2, "Ladrones");
                        sqlins.setString(3, fechanow);
                        sqlins.executeUpdate();
                    } catch (SQLException e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (tipovinculo1.equals("nohay")) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM vincu_margenley_poli  WHERE tipovinculo = 'Ladrones' AND no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune > 0) {
                    try {
                        PreparedStatement sqlpsiup = Conexion.connection.prepareStatement("DELETE FROM vincu_margenley_poli WHERE tipovinculo = 'Ladrones' AND no_id = " + txtnoiden.getText());
                        sqlpsiup.executeUpdate();
                    } catch (Exception e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        //2
        if (tipovinculo2.equals("hay")) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM vincu_margenley_poli  WHERE tipovinculo = 'Raponeros' AND  no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune < 1) {
                    try {
                        PreparedStatement sqlins = Conexion.connection.prepareStatement("INSERT INTO vincu_margenley_poli "
                                + "(no_id, tipovinculo, fechacreacion)"
                                + " VALUES (?,?,?)");
                        sqlins.setString(1, txtnoiden.getText());
                        sqlins.setString(2, "Raponeros");
                        sqlins.setString(3, fechanow);
                        sqlins.executeUpdate();
                    } catch (Exception e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (tipovinculo2.equals("nohay")) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM vincu_margenley_poli  WHERE tipovinculo = 'Raponeros' AND no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune > 0) {
                    try {
                        PreparedStatement sqlpsiup = Conexion.connection.prepareStatement("DELETE FROM vincu_margenley_poli WHERE tipovinculo = 'Raponeros' AND no_id = " + txtnoiden.getText());
                        sqlpsiup.executeUpdate();
                    } catch (Exception e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        //3
        if (tipovinculo3.equals("hay")) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM vincu_margenley_poli  WHERE tipovinculo = 'Fleteros' AND  no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune < 1) {
                    try {
                        PreparedStatement sqlins = Conexion.connection.prepareStatement("INSERT INTO vincu_margenley_poli "
                                + "(no_id, tipovinculo, fechacreacion)"
                                + " VALUES (?,?,?)");
                        sqlins.setString(1, txtnoiden.getText());
                        sqlins.setString(2, "Fleteros");
                        sqlins.setString(3, fechanow);
                        sqlins.executeUpdate();
                    } catch (Exception e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (tipovinculo3.equals("nohay")) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM vincu_margenley_poli  WHERE tipovinculo = 'Fleteros' AND no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune > 0) {
                    try {
                        PreparedStatement sqlpsiup = Conexion.connection.prepareStatement("DELETE FROM vincu_margenley_poli WHERE tipovinculo = 'Fleteros' AND no_id = " + txtnoiden.getText());
                        sqlpsiup.executeUpdate();
                    } catch (Exception e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        //4
        if (tipovinculo4.equals("hay")) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM vincu_margenley_poli  WHERE tipovinculo = 'Apartamenteros' AND  no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune < 1) {
                    try {
                        PreparedStatement sqlins = Conexion.connection.prepareStatement("INSERT INTO vincu_margenley_poli "
                                + "(no_id, tipovinculo, fechacreacion)"
                                + " VALUES (?,?,?)");
                        sqlins.setString(1, txtnoiden.getText());
                        sqlins.setString(2, "Apartamenteros");
                        sqlins.setString(3, fechanow);
                        sqlins.executeUpdate();
                    } catch (Exception e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (tipovinculo4.equals("nohay")) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM vincu_margenley_poli  WHERE tipovinculo = 'Apartamenteros' AND no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune > 0) {
                    try {
                        PreparedStatement sqlpsiup = Conexion.connection.prepareStatement("DELETE FROM vincu_margenley_poli WHERE tipovinculo = 'Apartamenteros' AND no_id = " + txtnoiden.getText());
                        sqlpsiup.executeUpdate();
                    } catch (Exception e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        //5
        if (tipovinculo5.equals("hay")) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM vincu_margenley_poli  WHERE tipovinculo = 'Bodegueros' AND  no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune < 1) {
                    try {
                        PreparedStatement sqlins = Conexion.connection.prepareStatement("INSERT INTO vincu_margenley_poli "
                                + "(no_id, tipovinculo, fechacreacion)"
                                + " VALUES (?,?,?)");
                        sqlins.setString(1, txtnoiden.getText());
                        sqlins.setString(2, "Bodegueros");
                        sqlins.setString(3, fechanow);
                        sqlins.executeUpdate();
                    } catch (Exception e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (tipovinculo5.equals("nohay")) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM vincu_margenley_poli  WHERE tipovinculo = 'Bodegueros' AND no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune > 0) {
                    try {
                        PreparedStatement sqlpsiup = Conexion.connection.prepareStatement("DELETE FROM vincu_margenley_poli WHERE tipovinculo = 'Bodegueros' AND no_id = " + txtnoiden.getText());
                        sqlpsiup.executeUpdate();
                    } catch (Exception e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        //6
        if (tipovinculo6.equals("hay")) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM vincu_margenley_poli  WHERE tipovinculo = 'Estafadores' AND  no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune < 1) {
                    try {
                        PreparedStatement sqlins = Conexion.connection.prepareStatement("INSERT INTO vincu_margenley_poli "
                                + "(no_id, tipovinculo, fechacreacion)"
                                + " VALUES (?,?,?)");
                        sqlins.setString(1, txtnoiden.getText());
                        sqlins.setString(2, "Estafadores");
                        sqlins.setString(3, fechanow);
                        sqlins.executeUpdate();
                    } catch (Exception e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (tipovinculo6.equals("nohay")) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM vincu_margenley_poli  WHERE tipovinculo = 'Estafadores' AND no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune > 0) {
                    try {
                        PreparedStatement sqlpsiup = Conexion.connection.prepareStatement("DELETE FROM vincu_margenley_poli WHERE tipovinculo = 'Estafadores' AND no_id = " + txtnoiden.getText());
                        sqlpsiup.executeUpdate();
                    } catch (Exception e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        //7
        if (tipovinculo7.equals("hay")) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM vincu_margenley_poli  WHERE tipovinculo = 'Suplantadores' AND  no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune < 1) {
                    try {
                        PreparedStatement sqlins = Conexion.connection.prepareStatement("INSERT INTO vincu_margenley_poli "
                                + "(no_id, tipovinculo, fechacreacion)"
                                + " VALUES (?,?,?)");
                        sqlins.setString(1, txtnoiden.getText());
                        sqlins.setString(2, "Suplantadores");
                        sqlins.setString(3, fechanow);
                        sqlins.executeUpdate();
                    } catch (Exception e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (tipovinculo7.equals("nohay")) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM vincu_margenley_poli  WHERE tipovinculo = 'Suplantadores' AND no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune > 0) {
                    try {
                        PreparedStatement sqlpsiup = Conexion.connection.prepareStatement("DELETE FROM vincu_margenley_poli WHERE tipovinculo = 'Suplantadores' AND no_id = " + txtnoiden.getText());
                        sqlpsiup.executeUpdate();
                    } catch (Exception e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        //8
        if (tipovinculo8.equals("hay")) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM vincu_margenley_poli  WHERE tipovinculo = 'pra escopolamina' AND  no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune < 1) {
                    try {
                        PreparedStatement sqlins = Conexion.connection.prepareStatement("INSERT INTO vincu_margenley_poli "
                                + "(no_id, tipovinculo, fechacreacion)"
                                + " VALUES (?,?,?)");
                        sqlins.setString(1, txtnoiden.getText());
                        sqlins.setString(2, "pra escopolamina");
                        sqlins.setString(3, fechanow);
                        sqlins.executeUpdate();
                    } catch (Exception e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (tipovinculo8.equals("nohay")) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM vincu_margenley_poli  WHERE tipovinculo = 'pra escopolamina' AND no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune > 0) {
                    try {
                        PreparedStatement sqlpsiup = Conexion.connection.prepareStatement("DELETE FROM vincu_margenley_poli WHERE tipovinculo = 'pra escopolamina' AND no_id = " + txtnoiden.getText());
                        sqlpsiup.executeUpdate();
                    } catch (Exception e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        //9
        if (tipovinculo9.equals("hay")) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM vincu_margenley_poli  WHERE tipovinculo = 'Estafas telefónicas' AND  no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune < 1) {
                    try {
                        PreparedStatement sqlins = Conexion.connection.prepareStatement("INSERT INTO vincu_margenley_poli "
                                + "(no_id, tipovinculo, fechacreacion)"
                                + " VALUES (?,?,?)");
                        sqlins.setString(1, txtnoiden.getText());
                        sqlins.setString(2, "Estafas telefónicas");
                        sqlins.setString(3, fechanow);
                        sqlins.executeUpdate();
                    } catch (Exception e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (tipovinculo9.equals("nohay")) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM vincu_margenley_poli  WHERE tipovinculo = 'Estafas telefónicas' AND no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune > 0) {
                    try {
                        PreparedStatement sqlpsiup = Conexion.connection.prepareStatement("DELETE FROM vincu_margenley_poli WHERE tipovinculo = 'Estafas telefónicas' AND no_id = " + txtnoiden.getText());
                        sqlpsiup.executeUpdate();
                    } catch (Exception e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        //10
        if (tipovinculo10.equals("hay")) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM vincu_margenley_poli  WHERE tipovinculo = 'Asesinos' AND  no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune < 1) {
                    try {
                        PreparedStatement sqlins = Conexion.connection.prepareStatement("INSERT INTO vincu_margenley_poli "
                                + "(no_id, tipovinculo, fechacreacion)"
                                + " VALUES (?,?,?)");
                        sqlins.setString(1, txtnoiden.getText());
                        sqlins.setString(2, "Asesinos");
                        sqlins.setString(3, fechanow);
                        sqlins.executeUpdate();
                    } catch (Exception e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (tipovinculo10.equals("nohay")) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM vincu_margenley_poli  WHERE tipovinculo = 'Asesinos' AND no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune > 0) {
                    try {
                        PreparedStatement sqlpsiup = Conexion.connection.prepareStatement("DELETE FROM vincu_margenley_poli WHERE tipovinculo = 'Asesinos' AND no_id = " + txtnoiden.getText());
                        sqlpsiup.executeUpdate();
                    } catch (Exception e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        //11
        if (tipovinculo11.equals("hay")) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM vincu_margenley_poli  WHERE tipovinculo = 'Violadores' AND  no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune < 1) {
                    try {
                        PreparedStatement sqlins = Conexion.connection.prepareStatement("INSERT INTO vincu_margenley_poli "
                                + "(no_id, tipovinculo, fechacreacion)"
                                + " VALUES (?,?,?)");
                        sqlins.setString(1, txtnoiden.getText());
                        sqlins.setString(2, "Violadores");
                        sqlins.setString(3, fechanow);
                        sqlins.executeUpdate();
                    } catch (Exception e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (tipovinculo11.equals("nohay")) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM vincu_margenley_poli  WHERE tipovinculo = 'Violadores' AND no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune > 0) {
                    try {
                        PreparedStatement sqlpsiup = Conexion.connection.prepareStatement("DELETE FROM vincu_margenley_poli WHERE tipovinculo = 'Violadores' AND no_id = " + txtnoiden.getText());
                        sqlpsiup.executeUpdate();
                    } catch (Exception e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        //12
        if (tipovinculo12.equals("hay")) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM vincu_margenley_poli  WHERE tipovinculo = 'Extorsionistas' AND  no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune < 1) {
                    try {
                        PreparedStatement sqlins = Conexion.connection.prepareStatement("INSERT INTO vincu_margenley_poli "
                                + "(no_id, tipovinculo, fechacreacion)"
                                + " VALUES (?,?,?)");
                        sqlins.setString(1, txtnoiden.getText());
                        sqlins.setString(2, "Extorsionistas");
                        sqlins.setString(3, fechanow);
                        sqlins.executeUpdate();
                    } catch (Exception e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (tipovinculo12.equals("nohay")) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM vincu_margenley_poli  WHERE tipovinculo = 'Extorsionistas' AND no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune > 0) {
                    try {
                        PreparedStatement sqlpsiup = Conexion.connection.prepareStatement("DELETE FROM vincu_margenley_poli WHERE tipovinculo = 'Extorsionistas' AND no_id = " + txtnoiden.getText());
                        sqlpsiup.executeUpdate();
                    } catch (Exception e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        //13
        if (tipovinculo13.equals("hay")) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM vincu_margenley_poli  WHERE tipovinculo = 'Secuestradores' AND  no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune < 1) {
                    try {
                        PreparedStatement sqlins = Conexion.connection.prepareStatement("INSERT INTO vincu_margenley_poli "
                                + "(no_id, tipovinculo, fechacreacion)"
                                + " VALUES (?,?,?)");
                        sqlins.setString(1, txtnoiden.getText());
                        sqlins.setString(2, "Secuestradores");
                        sqlins.setString(3, fechanow);
                        sqlins.executeUpdate();
                    } catch (Exception e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (tipovinculo13.equals("nohay")) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM vincu_margenley_poli  WHERE tipovinculo = 'Secuestradores' AND no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune > 0) {
                    try {
                        PreparedStatement sqlpsiup = Conexion.connection.prepareStatement("DELETE FROM vincu_margenley_poli WHERE tipovinculo = 'Secuestradores' AND no_id = " + txtnoiden.getText());
                        sqlpsiup.executeUpdate();
                    } catch (Exception e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        //14
        if (tipovinculo14.equals("hay")) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM vincu_margenley_poli  WHERE tipovinculo = 'Narcotraficantes' AND  no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune < 1) {
                    try {
                        PreparedStatement sqlins = Conexion.connection.prepareStatement("INSERT INTO vincu_margenley_poli "
                                + "(no_id, tipovinculo, fechacreacion)"
                                + " VALUES (?,?,?)");
                        sqlins.setString(1, txtnoiden.getText());
                        sqlins.setString(2, "Narcotraficantes");
                        sqlins.setString(3, fechanow);
                        sqlins.executeUpdate();
                    } catch (Exception e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (tipovinculo14.equals("nohay")) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM vincu_margenley_poli  WHERE tipovinculo = 'Narcotraficantes' AND no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune > 0) {
                    try {
                        PreparedStatement sqlpsiup = Conexion.connection.prepareStatement("DELETE FROM vincu_margenley_poli WHERE tipovinculo = 'Narcotraficantes' AND no_id = " + txtnoiden.getText());
                        sqlpsiup.executeUpdate();
                    } catch (Exception e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        //15
        if (tipovinculo15.equals("hay")) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM vincu_margenley_poli  WHERE tipovinculo = 'Microtraficantes' AND  no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune < 1) {
                    try {
                        PreparedStatement sqlins = Conexion.connection.prepareStatement("INSERT INTO vincu_margenley_poli "
                                + "(no_id, tipovinculo, fechacreacion)"
                                + " VALUES (?,?,?)");
                        sqlins.setString(1, txtnoiden.getText());
                        sqlins.setString(2, "Microtraficantes");
                        sqlins.setString(3, fechanow);
                        sqlins.executeUpdate();
                    } catch (Exception e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (tipovinculo15.equals("nohay")) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM vincu_margenley_poli  WHERE tipovinculo = 'Microtraficantes' AND no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune > 0) {
                    try {
                        PreparedStatement sqlpsiup = Conexion.connection.prepareStatement("DELETE FROM vincu_margenley_poli WHERE tipovinculo = 'Microtraficantes' AND no_id = " + txtnoiden.getText());
                        sqlpsiup.executeUpdate();
                    } catch (Exception e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        //16
        if (tipovinculo16.equals("hay")) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM vincu_margenley_poli  WHERE tipovinculo = 'Guerrilleros' AND  no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune < 1) {
                    try {
                        PreparedStatement sqlins = Conexion.connection.prepareStatement("INSERT INTO vincu_margenley_poli "
                                + "(no_id, tipovinculo, fechacreacion)"
                                + " VALUES (?,?,?)");
                        sqlins.setString(1, txtnoiden.getText());
                        sqlins.setString(2, "Guerrilleros");
                        sqlins.setString(3, fechanow);
                        sqlins.executeUpdate();
                    } catch (Exception e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (tipovinculo16.equals("nohay")) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM vincu_margenley_poli  WHERE tipovinculo = 'Guerrilleros' AND no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune > 0) {
                    try {
                        PreparedStatement sqlpsiup = Conexion.connection.prepareStatement("DELETE FROM vincu_margenley_poli WHERE tipovinculo = 'Guerrilleros' AND no_id = " + txtnoiden.getText());
                        sqlpsiup.executeUpdate();
                    } catch (Exception e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        //17
        if (tipovinculo17.equals("hay")) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM vincu_margenley_poli  WHERE tipovinculo = 'Bandas criminales' AND  no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune < 1) {
                    try {
                        PreparedStatement sqlins = Conexion.connection.prepareStatement("INSERT INTO vincu_margenley_poli "
                                + "(no_id, tipovinculo, fechacreacion)"
                                + " VALUES (?,?,?)");
                        sqlins.setString(1, txtnoiden.getText());
                        sqlins.setString(2, "Bandas criminales");
                        sqlins.setString(3, fechanow);
                        sqlins.executeUpdate();
                    } catch (Exception e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (tipovinculo17.equals("nohay")) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM vincu_margenley_poli  WHERE tipovinculo = 'Bandas criminales' AND no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune > 0) {
                    try {
                        PreparedStatement sqlpsiup = Conexion.connection.prepareStatement("DELETE FROM vincu_margenley_poli WHERE tipovinculo = 'Bandas criminales' AND no_id = " + txtnoiden.getText());
                        sqlpsiup.executeUpdate();
                    } catch (Exception e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        //18
        if (tipovinculo18.equals("hay")) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM vincu_margenley_poli  WHERE tipovinculo = 'Paramilitares' AND  no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune < 1) {
                    try {
                        PreparedStatement sqlins = Conexion.connection.prepareStatement("INSERT INTO vincu_margenley_poli "
                                + "(no_id, tipovinculo, fechacreacion)"
                                + " VALUES (?,?,?)");
                        sqlins.setString(1, txtnoiden.getText());
                        sqlins.setString(2, "Paramilitares");
                        sqlins.setString(3, fechanow);
                        sqlins.executeUpdate();
                    } catch (Exception e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (tipovinculo18.equals("nohay")) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM vincu_margenley_poli  WHERE tipovinculo = 'Paramilitares' AND no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune > 0) {
                    try {
                        PreparedStatement sqlpsiup = Conexion.connection.prepareStatement("DELETE FROM vincu_margenley_poli WHERE tipovinculo = 'Paramilitares' AND no_id = " + txtnoiden.getText());
                        sqlpsiup.executeUpdate();
                    } catch (Exception e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        //19
        if (tipovinculo19.equals("hay")) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM vincu_margenley_poli  WHERE tipovinculo = 'Corruptos' AND  no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune < 1) {
                    try {
                        PreparedStatement sqlins = Conexion.connection.prepareStatement("INSERT INTO vincu_margenley_poli "
                                + "(no_id, tipovinculo, fechacreacion)"
                                + " VALUES (?,?,?)");
                        sqlins.setString(1, txtnoiden.getText());
                        sqlins.setString(2, "Corruptos");
                        sqlins.setString(3, fechanow);
                        sqlins.executeUpdate();
                    } catch (Exception e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (tipovinculo19.equals("nohay")) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM vincu_margenley_poli  WHERE tipovinculo = 'Corruptos' AND no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune > 0) {
                    try {
                        PreparedStatement sqlpsiup = Conexion.connection.prepareStatement("DELETE FROM vincu_margenley_poli WHERE tipovinculo = 'Corruptos' AND no_id = " + txtnoiden.getText());
                        sqlpsiup.executeUpdate();
                    } catch (Exception e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        //20
        if (tipovinculo20.equals("hay")) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM vincu_margenley_poli  WHERE tipovinculo = 'Clonadores de tarjetas' AND  no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune < 1) {
                    try {
                        PreparedStatement sqlins = Conexion.connection.prepareStatement("INSERT INTO vincu_margenley_poli "
                                + "(no_id, tipovinculo, fechacreacion)"
                                + " VALUES (?,?,?)");
                        sqlins.setString(1, txtnoiden.getText());
                        sqlins.setString(2, "Clonadores de tarjetas");
                        sqlins.setString(3, fechanow);
                        sqlins.executeUpdate();
                    } catch (Exception e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (tipovinculo20.equals("nohay")) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM vincu_margenley_poli  WHERE tipovinculo = 'Clonadores de tarjetas' AND no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune > 0) {
                    try {
                        PreparedStatement sqlpsiup = Conexion.connection.prepareStatement("DELETE FROM vincu_margenley_poli WHERE tipovinculo = 'Clonadores de tarjetas' AND no_id = " + txtnoiden.getText());
                        sqlpsiup.executeUpdate();
                    } catch (Exception e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        //21
        if (tipovinculo21.equals("hay")) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM vincu_margenley_poli  WHERE tipovinculo = 'Ciberdelincuentes' AND  no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune < 1) {
                    try {
                        PreparedStatement sqlins = Conexion.connection.prepareStatement("INSERT INTO vincu_margenley_poli "
                                + "(no_id, tipovinculo, fechacreacion)"
                                + " VALUES (?,?,?)");
                        sqlins.setString(1, txtnoiden.getText());
                        sqlins.setString(2, "Ciberdelincuentes");
                        sqlins.setString(3, fechanow);
                        sqlins.executeUpdate();
                    } catch (Exception e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (tipovinculo21.equals("nohay")) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM vincu_margenley_poli  WHERE tipovinculo = 'Ciberdelincuentes' AND no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune > 0) {
                    try {
                        PreparedStatement sqlpsiup = Conexion.connection.prepareStatement("DELETE FROM vincu_margenley_poli WHERE tipovinculo = 'Ciberdelincuentes' AND no_id = " + txtnoiden.getText());
                        sqlpsiup.executeUpdate();
                    } catch (Exception e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        //22
        if (tipovinculo22.equals("hay")) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM vincu_margenley_poli  WHERE tipovinculo = 'Fraudes tarjeta crédito' AND  no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune < 1) {
                    try {
                        PreparedStatement sqlins = Conexion.connection.prepareStatement("INSERT INTO vincu_margenley_poli "
                                + "(no_id, tipovinculo, fechacreacion)"
                                + " VALUES (?,?,?)");
                        sqlins.setString(1, txtnoiden.getText());
                        sqlins.setString(2, "Fraudes tarjeta crédito");
                        sqlins.setString(3, fechanow);
                        sqlins.executeUpdate();
                    } catch (Exception e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (tipovinculo22.equals("nohay")) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM vincu_margenley_poli  WHERE tipovinculo = 'Fraudes tarjeta crédito' AND no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune > 0) {
                    try {
                        PreparedStatement sqlpsiup = Conexion.connection.prepareStatement("DELETE FROM vincu_margenley_poli WHERE tipovinculo = 'Fraudes tarjeta crédito' AND no_id = " + txtnoiden.getText());
                        sqlpsiup.executeUpdate();
                    } catch (Exception e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        //23
        if (tipovinculo23.equals("hay")) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM vincu_margenley_poli  WHERE tipovinculo = 'Compra BD' AND  no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune < 1) {
                    try {
                        PreparedStatement sqlins = Conexion.connection.prepareStatement("INSERT INTO vincu_margenley_poli "
                                + "(no_id, tipovinculo, fechacreacion)"
                                + " VALUES (?,?,?)");
                        sqlins.setString(1, txtnoiden.getText());
                        sqlins.setString(2, "Compra BD");
                        sqlins.setString(3, fechanow);
                        sqlins.executeUpdate();
                    } catch (Exception e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (tipovinculo23.equals("nohay")) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM vincu_margenley_poli  WHERE tipovinculo = 'Compra BD' AND no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune > 0) {
                    try {
                        PreparedStatement sqlpsiup = Conexion.connection.prepareStatement("DELETE FROM vincu_margenley_poli WHERE tipovinculo = 'Compra BD' AND no_id = " + txtnoiden.getText());
                        sqlpsiup.executeUpdate();
                    } catch (Exception e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        //24
        if (tipovinculo24.equals("hay")) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM vincu_margenley_poli  WHERE tipovinculo = 'Suplantación identidad' AND  no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune < 1) {
                    try {
                        PreparedStatement sqlins = Conexion.connection.prepareStatement("INSERT INTO vincu_margenley_poli "
                                + "(no_id, tipovinculo, fechacreacion)"
                                + " VALUES (?,?,?)");
                        sqlins.setString(1, txtnoiden.getText());
                        sqlins.setString(2, "Suplantación identidad");
                        sqlins.setString(3, fechanow);
                        sqlins.executeUpdate();
                    } catch (Exception e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (tipovinculo24.equals("nohay")) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM vincu_margenley_poli  WHERE tipovinculo = 'Suplantación identidad' AND no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune > 0) {
                    try {
                        PreparedStatement sqlpsiup = Conexion.connection.prepareStatement("DELETE FROM vincu_margenley_poli WHERE tipovinculo = 'Suplantación identidad' AND no_id = " + txtnoiden.getText());
                        sqlpsiup.executeUpdate();
                    } catch (Exception e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        //25
        if (tipovinculo25.equals("hay")) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM vincu_margenley_poli  WHERE tipovinculo = 'Fraude con tiquetes' AND  no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune < 1) {
                    try {
                        PreparedStatement sqlins = Conexion.connection.prepareStatement("INSERT INTO vincu_margenley_poli "
                                + "(no_id, tipovinculo, fechacreacion)"
                                + " VALUES (?,?,?)");
                        sqlins.setString(1, txtnoiden.getText());
                        sqlins.setString(2, "Fraude con tiquetes");
                        sqlins.setString(3, fechanow);
                        sqlins.executeUpdate();
                    } catch (Exception e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (tipovinculo25.equals("nohay")) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM vincu_margenley_poli  WHERE tipovinculo = 'Fraude con tiquetes' AND no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune > 0) {
                    try {
                        PreparedStatement sqlpsiup = Conexion.connection.prepareStatement("DELETE FROM vincu_margenley_poli WHERE tipovinculo = 'Fraude con tiquetes' AND no_id = " + txtnoiden.getText());
                        sqlpsiup.executeUpdate();
                    } catch (Exception e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        //26
        if (tipovinculo26.equals("hay")) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM vincu_margenley_poli  WHERE tipovinculo = 'Escaperos' AND  no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune < 1) {
                    try {
                        PreparedStatement sqlins = Conexion.connection.prepareStatement("INSERT INTO vincu_margenley_poli "
                                + "(no_id, tipovinculo, fechacreacion)"
                                + " VALUES (?,?,?)");
                        sqlins.setString(1, txtnoiden.getText());
                        sqlins.setString(2, "Escaperos");
                        sqlins.setString(3, fechanow);
                        sqlins.executeUpdate();
                    } catch (Exception e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (tipovinculo26.equals("nohay")) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM vincu_margenley_poli  WHERE tipovinculo = 'Escaperos' AND no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune > 0) {
                    try {
                        PreparedStatement sqlpsiup = Conexion.connection.prepareStatement("DELETE FROM vincu_margenley_poli WHERE tipovinculo = 'Escaperos' AND no_id = " + txtnoiden.getText());
                        sqlpsiup.executeUpdate();
                    } catch (Exception e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        //27
        if (tipovinculo27.equals("hay")) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM vincu_margenley_poli  WHERE tipovinculo = 'Hackers' AND  no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune < 1) {
                    try {
                        PreparedStatement sqlins = Conexion.connection.prepareStatement("INSERT INTO vincu_margenley_poli "
                                + "(no_id, tipovinculo, fechacreacion)"
                                + " VALUES (?,?,?)");
                        sqlins.setString(1, txtnoiden.getText());
                        sqlins.setString(2, "Hackers");
                        sqlins.setString(3, fechanow);
                        sqlins.executeUpdate();
                    } catch (Exception e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (tipovinculo27.equals("nohay")) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM vincu_margenley_poli  WHERE tipovinculo = 'Hackers' AND no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune > 0) {
                    try {
                        PreparedStatement sqlpsiup = Conexion.connection.prepareStatement("DELETE FROM vincu_margenley_poli WHERE tipovinculo = 'Hackers' AND no_id = " + txtnoiden.getText());
                        sqlpsiup.executeUpdate();
                    } catch (Exception e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        //28
        if (tipovinculo28.equals("hay")) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM vincu_margenley_poli  WHERE tipovinculo = 'Piratas informáticos' AND  no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune < 1) {
                    try {
                        PreparedStatement sqlins = Conexion.connection.prepareStatement("INSERT INTO vincu_margenley_poli "
                                + "(no_id, tipovinculo, fechacreacion)"
                                + " VALUES (?,?,?)");
                        sqlins.setString(1, txtnoiden.getText());
                        sqlins.setString(2, "Piratas informáticos");
                        sqlins.setString(3, fechanow);
                        sqlins.executeUpdate();
                    } catch (Exception e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (tipovinculo28.equals("nohay")) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM vincu_margenley_poli  WHERE tipovinculo = 'Piratas informáticos' AND no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune > 0) {
                    try {
                        PreparedStatement sqlpsiup = Conexion.connection.prepareStatement("DELETE FROM vincu_margenley_poli WHERE tipovinculo = 'Piratas informáticos' AND no_id = " + txtnoiden.getText());
                        sqlpsiup.executeUpdate();
                    } catch (Exception e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        //29
        if (tipovinculo29.equals("hay")) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM vincu_margenley_poli  WHERE tipovinculo = 'Fraudes bancarios' AND  no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune < 1) {
                    try {
                        PreparedStatement sqlins = Conexion.connection.prepareStatement("INSERT INTO vincu_margenley_poli "
                                + "(no_id, tipovinculo, fechacreacion)"
                                + " VALUES (?,?,?)");
                        sqlins.setString(1, txtnoiden.getText());
                        sqlins.setString(2, "Fraudes bancarios");
                        sqlins.setString(3, fechanow);
                        sqlins.executeUpdate();
                    } catch (Exception e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (tipovinculo29.equals("nohay")) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM vincu_margenley_poli  WHERE tipovinculo = 'Fraudes bancarios' AND no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune > 0) {
                    try {
                        PreparedStatement sqlpsiup = Conexion.connection.prepareStatement("DELETE FROM vincu_margenley_poli WHERE tipovinculo = 'Fraudes bancarios' AND no_id = " + txtnoiden.getText());
                        sqlpsiup.executeUpdate();
                    } catch (Exception e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void update_vinculos() {
        try {
            PreparedStatement sql = Conexion.connection.prepareStatement("UPDATE datos_generales_poli "
                    + "SET vinculosmargenley = '" + vinculosmargenley + "', exptipovinculos = '" + exptipovinculos + "',"
                    + " actdelictpre1 = '" + actdelictpre1 + "', expactdelictpre1 = '" + expactdelictpre1 + "',"
                    + " actdelictpre2 = '" + actdelictpre2 + "', expactdelictpre2 = '" + expactdelictpre2 + "',"
                    + "actdelictpre3 = '" + actdelictpre3 + "', expactdelictpre3 = '" + expactdelictpre3 + "', "
                    + "actdelictpre4 = '" + actdelictpre4 + "', expactdelictpre4 = '" + expactdelictpre4 + "', "
                    + "actdelictpre5  = '" + actdelictpre5 + "', expactdelictpre5 = '" + expactdelictpre5 + "', "
                    + "actdelictpre6  = '" + actdelictpre6 + "', expactdelictpre6 = '" + expactdelictpre6 + "', "
                    + "actdelictpre7  = '" + actdelictpre7 + "', expactdelictpre7 = '" + expactdelictpre7 + "'  WHERE no_id = " + txtnoiden.getText() + "  ");
            sql.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "¡Error en el ingreso de datos a la base!\nPor favor solicite ayuda al equipo de desarrollo" + e);
        }
    }

    public void limpiar() {
        vinculosmargenley = "-";
        exptipovinculos = "";
        actdelictpre1 = "-";
        expactdelictpre1 = "";
        actdelictpre2 = "-";
        expactdelictpre2 = "";
        actdelictpre3 = "-";
        expactdelictpre3 = "";
        actdelictpre4 = "-";
        expactdelictpre4 = "";
        actdelictpre5 = "-";
        expactdelictpre5 = "";
        actdelictpre6 = "-";
        expactdelictpre6 = "";
        actdelictpre7 = "-";
        expactdelictpre7 = "";

        tipovinculo1 = "";
        tipovinculo2 = "";
        tipovinculo3 = "";
        tipovinculo4 = "";
        tipovinculo5 = "";
        tipovinculo6 = "";
        tipovinculo7 = "";
        tipovinculo8 = "";
        tipovinculo9 = "";
        tipovinculo10 = "";
        tipovinculo11 = "";
        tipovinculo12 = "";
        tipovinculo13 = "";
        tipovinculo14 = "";
        tipovinculo15 = "";
        tipovinculo16 = "";
        tipovinculo17 = "";
        tipovinculo18 = "";
        tipovinculo19 = "";
        tipovinculo20 = "";
        tipovinculo21 = "";
        tipovinculo22 = "";
        tipovinculo23 = "";
        tipovinculo24 = "";
        tipovinculo25 = "";
        tipovinculo26 = "";
        tipovinculo27 = "";
        tipovinculo28 = "";
        tipovinculo29 = "";

        admisionVinculosPersonas = "";
        
        colorCategoria = "sincolor";
    }

}
