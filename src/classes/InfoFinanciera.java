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
public class InfoFinanciera {

    private static String situa_economica = "-";
    private static String tiene_ingre_men = "-";
    private static String sostiene_eco = "";
    private static String act_lab_inde = "-";
    private static String labores_indep = "";
    private static String liquida_cesan = "-";
    private static String cantidad_liquida_cesan = "";
    private static String tiene_ahorros = "-";
    private static String cant_ahorros = "";
    private static String apoyo_padres = "-";
    private static String desc_apoyo_padres = "";
    private static String ing_pareja = "-";
    private static String total_ingresos_pareja = "";
    private static String hadembargo = "-";
    private static String explhadembargo = "";
    private static String reportadocr = "-";
    private static String expreportadocr = "";
    private static String tieneobligafinan = "-";
    private static String exploblifinanc = "";
    private static String tienedeuda = "-";
    private static String exptienedeuda = "";
    private static String gastos_mensuales = "";
    private static String tienepropi = "-";
    private static String exptienepropi = "";
    private static String admisionInfoFinanciera = "";

    private static String obligacion_finan1 = "nohay";
    private static String obligacion_finan2 = "nohay";
    private static String obligacion_finan3 = "nohay";
    private static String obligacion_finan4 = "nohay";
    private static String obligacion_finan5 = "nohay";
    private static String obligacion_finan6 = "nohay";
    private static String obligacion_finan7 = "nohay";
    private static String obligacion_finan7_o = "nohay";

    private static String propiedad_exa1 = "";
    private static String propiedad_exa2 = "";
    private static String propiedad_exa3 = "";
    private static String propiedad_exa3_o = "";

    private static String colorCategoria = "sincolor";

    public static String getColorCategoria() {
        return colorCategoria;
    }

    public static void setColorCategoria(String colorCategoria) {
        InfoFinanciera.colorCategoria = colorCategoria;
    }

    public static String getAdmisionInfoFinanciera() {
        return admisionInfoFinanciera;
    }

    public static void setAdmisionInfoFinanciera(String admisionInfoFinanciera) {
        InfoFinanciera.admisionInfoFinanciera = admisionInfoFinanciera;
    }

    public static String getObligacion_finan7_o() {
        return obligacion_finan7_o;
    }

    public static void setObligacion_finan7_o(String obligacion_finan7_o) {
        InfoFinanciera.obligacion_finan7_o = obligacion_finan7_o;
    }

    public static String getPropiedad_exa3_o() {
        return propiedad_exa3_o;
    }

    public static void setPropiedad_exa3_o(String propiedad_exa3_o) {
        InfoFinanciera.propiedad_exa3_o = propiedad_exa3_o;
    }

    public static String getObligacion_finan1() {
        return obligacion_finan1;
    }

    public static void setObligacion_finan1(String obligacion_finan1) {
        InfoFinanciera.obligacion_finan1 = obligacion_finan1;
    }

    public static String getObligacion_finan2() {
        return obligacion_finan2;
    }

    public static void setObligacion_finan2(String obligacion_finan2) {
        InfoFinanciera.obligacion_finan2 = obligacion_finan2;
    }

    public static String getObligacion_finan3() {
        return obligacion_finan3;
    }

    public static void setObligacion_finan3(String obligacion_finan3) {
        InfoFinanciera.obligacion_finan3 = obligacion_finan3;
    }

    public static String getObligacion_finan4() {
        return obligacion_finan4;
    }

    public static void setObligacion_finan4(String obligacion_finan4) {
        InfoFinanciera.obligacion_finan4 = obligacion_finan4;
    }

    public static String getObligacion_finan5() {
        return obligacion_finan5;
    }

    public static void setObligacion_finan5(String obligacion_finan5) {
        InfoFinanciera.obligacion_finan5 = obligacion_finan5;
    }

    public static String getObligacion_finan6() {
        return obligacion_finan6;
    }

    public static void setObligacion_finan6(String obligacion_finan6) {
        InfoFinanciera.obligacion_finan6 = obligacion_finan6;
    }

    public static String getObligacion_finan7() {
        return obligacion_finan7;
    }

    public static void setObligacion_finan7(String obligacion_finan7) {
        InfoFinanciera.obligacion_finan7 = obligacion_finan7;
    }

    public static String getPropiedad_exa1() {
        return propiedad_exa1;
    }

    public static void setPropiedad_exa1(String propiedad_exa1) {
        InfoFinanciera.propiedad_exa1 = propiedad_exa1;
    }

    public static String getPropiedad_exa2() {
        return propiedad_exa2;
    }

    public static void setPropiedad_exa2(String propiedad_exa2) {
        InfoFinanciera.propiedad_exa2 = propiedad_exa2;
    }

    public static String getPropiedad_exa3() {
        return propiedad_exa3;
    }

    public static void setPropiedad_exa3(String propiedad_exa3) {
        InfoFinanciera.propiedad_exa3 = propiedad_exa3;
    }

    public static String getSitua_economica() {
        return situa_economica;
    }

    public static void setSitua_economica(String situa_economica) {
        InfoFinanciera.situa_economica = situa_economica;
    }

    public static String getTiene_ingre_men() {
        return tiene_ingre_men;
    }

    public static void setTiene_ingre_men(String tiene_ingre_men) {
        InfoFinanciera.tiene_ingre_men = tiene_ingre_men;
    }

    public static String getSostiene_eco() {
        return sostiene_eco;
    }

    public static void setSostiene_eco(String sostiene_eco) {
        InfoFinanciera.sostiene_eco = sostiene_eco;
    }

    public static String getAct_lab_inde() {
        return act_lab_inde;
    }

    public static void setAct_lab_inde(String act_lab_inde) {
        InfoFinanciera.act_lab_inde = act_lab_inde;
    }

    public static String getLabores_indep() {
        return labores_indep;
    }

    public static void setLabores_indep(String labores_indep) {
        InfoFinanciera.labores_indep = labores_indep;
    }

    public static String getLiquida_cesan() {
        return liquida_cesan;
    }

    public static void setLiquida_cesan(String liquida_cesan) {
        InfoFinanciera.liquida_cesan = liquida_cesan;
    }

    public static String getCantidad_liquida_cesan() {
        return cantidad_liquida_cesan;
    }

    public static void setCantidad_liquida_cesan(String cantidad_liquida_cesan) {
        InfoFinanciera.cantidad_liquida_cesan = cantidad_liquida_cesan;
    }

    public static String getTiene_ahorros() {
        return tiene_ahorros;
    }

    public static void setTiene_ahorros(String tiene_ahorros) {
        InfoFinanciera.tiene_ahorros = tiene_ahorros;
    }

    public static String getCant_ahorros() {
        return cant_ahorros;
    }

    public static void setCant_ahorros(String cant_ahorros) {
        InfoFinanciera.cant_ahorros = cant_ahorros;
    }

    public static String getApoyo_padres() {
        return apoyo_padres;
    }

    public static void setApoyo_padres(String apoyo_padres) {
        InfoFinanciera.apoyo_padres = apoyo_padres;
    }

    public static String getDesc_apoyo_padres() {
        return desc_apoyo_padres;
    }

    public static void setDesc_apoyo_padres(String desc_apoyo_padres) {
        InfoFinanciera.desc_apoyo_padres = desc_apoyo_padres;
    }

    public static String getIng_pareja() {
        return ing_pareja;
    }

    public static void setIng_pareja(String ing_pareja) {
        InfoFinanciera.ing_pareja = ing_pareja;
    }

    public static String getTotal_ingresos_pareja() {
        return total_ingresos_pareja;
    }

    public static void setTotal_ingresos_pareja(String total_ingresos_pareja) {
        InfoFinanciera.total_ingresos_pareja = total_ingresos_pareja;
    }

    public static String getHadembargo() {
        return hadembargo;
    }

    public static void setHadembargo(String hadembargo) {
        InfoFinanciera.hadembargo = hadembargo;
    }

    public static String getExplhadembargo() {
        return explhadembargo;
    }

    public static void setExplhadembargo(String explhadembargo) {
        InfoFinanciera.explhadembargo = explhadembargo;
    }

    public static String getReportadocr() {
        return reportadocr;
    }

    public static void setReportadocr(String reportadocr) {
        InfoFinanciera.reportadocr = reportadocr;
    }

    public static String getExpreportadocr() {
        return expreportadocr;
    }

    public static void setExpreportadocr(String expreportadocr) {
        InfoFinanciera.expreportadocr = expreportadocr;
    }

    public static String getTieneobligafinan() {
        return tieneobligafinan;
    }

    public static void setTieneobligafinan(String tieneobligafinan) {
        InfoFinanciera.tieneobligafinan = tieneobligafinan;
    }

    public static String getExploblifinanc() {
        return exploblifinanc;
    }

    public static void setExploblifinanc(String exploblifinanc) {
        InfoFinanciera.exploblifinanc = exploblifinanc;
    }

    public static String getTienedeuda() {
        return tienedeuda;
    }

    public static void setTienedeuda(String tienedeuda) {
        InfoFinanciera.tienedeuda = tienedeuda;
    }

    public static String getExptienedeuda() {
        return exptienedeuda;
    }

    public static void setExptienedeuda(String exptienedeuda) {
        InfoFinanciera.exptienedeuda = exptienedeuda;
    }

    public static String getGastos_mensuales() {
        return gastos_mensuales;
    }

    public static void setGastos_mensuales(String gastos_mensuales) {
        InfoFinanciera.gastos_mensuales = gastos_mensuales;
    }

    public static String getTienepropi() {
        return tienepropi;
    }

    public static void setTienepropi(String tienepropi) {
        InfoFinanciera.tienepropi = tienepropi;
    }

    public static String getExptienepropi() {
        return exptienepropi;
    }

    public static void setExptienepropi(String exptienepropi) {
        InfoFinanciera.exptienepropi = exptienepropi;
    }

    SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");
    java.util.Date fecha = new java.util.Date();
    public String fechanow = date.format(fecha);

    public void validacionesfinancieras() {
        //Validaciones de combobox
        //cbx1
        if (obligacion_finan1.equals("hay")) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM o_financieras_poli  WHERE obligacion_finan = 'Prestamos libre inversión' AND  no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune < 1) {
                    try {
                        PreparedStatement sqlins = Conexion.connection.prepareStatement("INSERT INTO o_financieras_poli "
                                + "(no_id, obligacion_finan, fechacreacion)"
                                + " VALUES (?,?,?)");
                        sqlins.setString(1, txtnoiden.getText());
                        sqlins.setString(2, "Prestamos libre inversión");
                        sqlins.setString(3, fechanow);
                        sqlins.executeUpdate();
                    } catch (SQLException e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (obligacion_finan1.equals("nohay")) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM o_financieras_poli  WHERE obligacion_finan = 'Prestamos libre inversión' AND no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune > 0) {
                    try {
                        PreparedStatement sqlpsiup = Conexion.connection.prepareStatement("DELETE FROM o_financieras_poli WHERE obligacion_finan = 'Prestamos libre inversión' AND no_id = " + txtnoiden.getText());
                        sqlpsiup.executeUpdate();
                    } catch (SQLException e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        //cbx2
        if (obligacion_finan2.equals("hay")) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM o_financieras_poli  WHERE obligacion_finan = 'Prestamos hipotecarios' AND  no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune < 1) {
                    try {
                        PreparedStatement sqlins = Conexion.connection.prepareStatement("INSERT INTO o_financieras_poli "
                                + "(no_id, obligacion_finan, fechacreacion)"
                                + " VALUES (?,?,?)");
                        sqlins.setString(1, txtnoiden.getText());
                        sqlins.setString(2, "Prestamos hipotecarios");
                        sqlins.setString(3, fechanow);
                        sqlins.executeUpdate();
                    } catch (SQLException e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (obligacion_finan2.equals("nohay")) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM o_financieras_poli  WHERE obligacion_finan = 'Prestamos hipotecarios' AND no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune > 0) {
                    try {
                        PreparedStatement sqlpsiup = Conexion.connection.prepareStatement("DELETE FROM o_financieras_poli WHERE obligacion_finan = 'Prestamos hipotecarios' AND no_id = " + txtnoiden.getText());
                        sqlpsiup.executeUpdate();
                    } catch (SQLException e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        //cbx3
        if (obligacion_finan3.equals("hay")) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM o_financieras_poli  WHERE obligacion_finan = 'Préstamo para vehículo' AND  no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune < 1) {
                    try {
                        PreparedStatement sqlins = Conexion.connection.prepareStatement("INSERT INTO o_financieras_poli "
                                + "(no_id, obligacion_finan, fechacreacion)"
                                + " VALUES (?,?,?)");
                        sqlins.setString(1, txtnoiden.getText());
                        sqlins.setString(2, "Préstamo para vehículo");
                        sqlins.setString(3, fechanow);
                        sqlins.executeUpdate();
                    } catch (SQLException e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (obligacion_finan3.equals("nohay")) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM o_financieras_poli  WHERE obligacion_finan = 'Préstamo para vehículo' AND no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune > 0) {
                    try {
                        PreparedStatement sqlpsiup = Conexion.connection.prepareStatement("DELETE FROM o_financieras_poli WHERE obligacion_finan = 'Préstamo para vehículo' AND no_id = " + txtnoiden.getText());
                        sqlpsiup.executeUpdate();
                    } catch (SQLException e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        //cbx4
        if (obligacion_finan4.equals("hay")) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM o_financieras_poli  WHERE obligacion_finan = 'Préstamo gota a gota' AND  no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune < 1) {
                    try {
                        PreparedStatement sqlins = Conexion.connection.prepareStatement("INSERT INTO o_financieras_poli "
                                + "(no_id, obligacion_finan, fechacreacion)"
                                + " VALUES (?,?,?)");
                        sqlins.setString(1, txtnoiden.getText());
                        sqlins.setString(2, "Préstamo gota a gota");
                        sqlins.setString(3, fechanow);
                        sqlins.executeUpdate();
                    } catch (SQLException e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (obligacion_finan4.equals("nohay")) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM o_financieras_poli  WHERE obligacion_finan = 'Préstamo gota a gota' AND no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune > 0) {
                    try {
                        PreparedStatement sqlpsiup = Conexion.connection.prepareStatement("DELETE FROM o_financieras_poli WHERE obligacion_finan = 'Préstamo gota a gota' AND no_id = " + txtnoiden.getText());
                        sqlpsiup.executeUpdate();
                    } catch (SQLException e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        //cbx5
        if (obligacion_finan5.equals("hay")) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM o_financieras_poli  WHERE obligacion_finan = 'Prestamos persona natural' AND  no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune < 1) {
                    try {
                        PreparedStatement sqlins = Conexion.connection.prepareStatement("INSERT INTO o_financieras_poli "
                                + "(no_id, obligacion_finan, fechacreacion)"
                                + " VALUES (?,?,?)");
                        sqlins.setString(1, txtnoiden.getText());
                        sqlins.setString(2, "Prestamos persona natural");
                        sqlins.setString(3, fechanow);
                        sqlins.executeUpdate();
                    } catch (SQLException e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (obligacion_finan5.equals("nohay")) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM o_financieras_poli  WHERE obligacion_finan = 'Prestamos persona natural' AND no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune > 0) {
                    try {
                        PreparedStatement sqlpsiup = Conexion.connection.prepareStatement("DELETE FROM o_financieras_poli WHERE obligacion_finan = 'Prestamos persona natural' AND no_id = " + txtnoiden.getText());
                        sqlpsiup.executeUpdate();
                    } catch (SQLException e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        //cbx6
        if (obligacion_finan6.equals("hay")) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM o_financieras_poli  WHERE obligacion_finan = 'Tarjetas de credito' AND  no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune < 1) {
                    try {
                        PreparedStatement sqlins = Conexion.connection.prepareStatement("INSERT INTO o_financieras_poli "
                                + "(no_id, obligacion_finan, fechacreacion)"
                                + " VALUES (?,?,?)");
                        sqlins.setString(1, txtnoiden.getText());
                        sqlins.setString(2, "Tarjetas de credito");
                        sqlins.setString(3, fechanow);
                        sqlins.executeUpdate();
                    } catch (SQLException e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (obligacion_finan6.equals("nohay")) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM o_financieras_poli  WHERE obligacion_finan = 'Tarjetas de credito' AND no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune > 0) {
                    try {
                        PreparedStatement sqlpsiup = Conexion.connection.prepareStatement("DELETE FROM o_financieras_poli WHERE obligacion_finan = 'Tarjetas de credito' AND no_id = " + txtnoiden.getText());
                        sqlpsiup.executeUpdate();
                    } catch (SQLException e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        //cbx7
        if (obligacion_finan7.equals("hay")) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM o_financieras_poli  WHERE obligacion_finan = '" + obligacion_finan7_o + "' AND  no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune < 1) {
                    try {
                        PreparedStatement sqlins = Conexion.connection.prepareStatement("INSERT INTO o_financieras_poli "
                                + "(no_id, obligacion_finan, fechacreacion)"
                                + " VALUES (?,?,?)");
                        sqlins.setString(1, txtnoiden.getText());
                        sqlins.setString(2, obligacion_finan7_o);
                        sqlins.setString(3, fechanow);
                        sqlins.executeUpdate();
                    } catch (SQLException e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (obligacion_finan7.equals("nohay")) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM o_financieras_poli  WHERE obligacion_finan = 'Prestamos libre inversión' or "
                        + "obligacion_finan = 'Prestamos hipotecarios' or "
                        + "obligacion_finan = 'Préstamo para vehículo' or "
                        + "obligacion_finan = 'Préstamo gota a gota' or "
                        + "obligacion_finan = 'Prestamos persona natural' or "
                        + "obligacion_finan = 'Tarjetas de credito' AND no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune < 1) {
                    try {
                        PreparedStatement sqlpsiup = Conexion.connection.prepareStatement("DELETE FROM o_financieras_poli WHERE obligacion_finan != 'Prestamos libre inversión' and "
                                + "obligacion_finan != 'Prestamos hipotecarios' and "
                                + "obligacion_finan != 'Préstamo para vehículo' and "
                                + "obligacion_finan != 'Préstamo gota a gota' and "
                                + "obligacion_finan != 'Prestamos persona natural' and "
                                + "obligacion_finan != 'Tarjetas de credito' AND no_id = " + txtnoiden.getText());
                        sqlpsiup.executeUpdate();
                    } catch (SQLException e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        //cbx propiedades
        //cbx 1
        if (propiedad_exa1.equals("hay")) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM propiedades_poli  WHERE propiedad_exa = 'Finca raíz' AND  no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune < 1) {
                    try {
                        PreparedStatement sqlins = Conexion.connection.prepareStatement("INSERT INTO propiedades_poli "
                                + "(no_id, propiedad_exa, fechacreacion)"
                                + " VALUES (?,?,?)");
                        sqlins.setString(1, txtnoiden.getText());
                        sqlins.setString(2, "Finca raíz");
                        sqlins.setString(3, fechanow);
                        sqlins.executeUpdate();
                    } catch (SQLException e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (propiedad_exa1.equals("nohay")) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM propiedades_poli  WHERE propiedad_exa = 'Finca raíz' AND no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune > 0) {
                    try {
                        PreparedStatement sqlpsiup = Conexion.connection.prepareStatement("DELETE FROM propiedades_poli WHERE propiedad_exa != 'Finca raíz' AND no_id = " + txtnoiden.getText());
                        sqlpsiup.executeUpdate();
                    } catch (SQLException e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        //cbx 2
        if (propiedad_exa2.equals("hay")) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM propiedades_poli  WHERE propiedad_exa = 'Vehículos' AND  no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune < 1) {
                    try {
                        PreparedStatement sqlins = Conexion.connection.prepareStatement("INSERT INTO propiedades_poli "
                                + "(no_id, propiedad_exa, fechacreacion)"
                                + " VALUES (?,?,?)");
                        sqlins.setString(1, txtnoiden.getText());
                        sqlins.setString(2, "Vehículos");
                        sqlins.setString(3, fechanow);
                        sqlins.executeUpdate();
                    } catch (SQLException e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (propiedad_exa2.equals("nohay")) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM propiedades_poli  WHERE propiedad_exa = 'Vehículos' AND no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune > 0) {
                    try {
                        PreparedStatement sqlpsiup = Conexion.connection.prepareStatement("DELETE FROM propiedades_poli WHERE propiedad_exa = 'Vehículos' AND no_id = " + txtnoiden.getText());
                        sqlpsiup.executeUpdate();
                    } catch (SQLException e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        //cbx 3
        if (propiedad_exa3.equals("hay")) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM propiedades_poli  WHERE propiedad_exa = '" + propiedad_exa3_o + "' AND  no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune < 1) {
                    try {
                        PreparedStatement sqlins = Conexion.connection.prepareStatement("INSERT INTO propiedades_poli "
                                + "(no_id, propiedad_exa, fechacreacion)"
                                + " VALUES (?,?,?)");
                        sqlins.setString(1, txtnoiden.getText());
                        sqlins.setString(2, propiedad_exa3_o);
                        sqlins.setString(3, fechanow);
                        sqlins.executeUpdate();
                    } catch (SQLException e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (propiedad_exa3.equals("nohay")) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM propiedades_poli  WHERE propiedad_exa = 'Finca raíz' or propiedad_exa = 'Vehículos' AND no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune > 0) {
                    try {
                        PreparedStatement sqlpsiup = Conexion.connection.prepareStatement("DELETE FROM propiedades_poli WHERE propiedad_exa != 'Finca raíz' and propiedad_exa != 'Vehículos' AND no_id = " + txtnoiden.getText());
                        sqlpsiup.executeUpdate();
                    } catch (SQLException e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void update_infofinan() {
        try {
            PreparedStatement sql = Conexion.connection.prepareStatement("UPDATE datos_generales_poli "
                    + "SET situa_economica = '" + situa_economica + "', tiene_ingre_men = '" + tiene_ingre_men + "',"
                    + "sostiene_eco = '" + sostiene_eco + "' ,act_lab_inde = '" + act_lab_inde + "',"
                    + "labores_indep = '" + labores_indep + "', liquida_cesan = '" + liquida_cesan + "', "
                    + "cantidad_liquida_cesan = '" + cantidad_liquida_cesan + "', tiene_ahorros = '" + tiene_ahorros + "', "
                    + "cant_ahorros = '" + cant_ahorros + "', apoyo_padres = '" + apoyo_padres + "', "
                    + "desc_apoyo_padres = '" + desc_apoyo_padres + "', ing_pareja = '" + ing_pareja + "', "
                    + "total_ingresos_pareja = '" + total_ingresos_pareja + "', hadembargo = '" + hadembargo + "', explhadembargo ='" + explhadembargo + "' ,reportadocr = '" + reportadocr + "', expreportadocr = '" + expreportadocr + "', tieneobligafinan = '" + tieneobligafinan + "', "
                    + "tienedeuda = '" + tienedeuda + "', exptienedeuda = '" + exptienedeuda + "', "
                    + "exploblifinanc = '" + exploblifinanc + "', gastos_mensuales = '" + gastos_mensuales + "', tienepropi = '" + tienepropi + "' , exptienepropi = '" + exptienepropi + "'  WHERE no_id = " + txtnoiden.getText() + " and t_identificacion = '" + DatosPrincipales.getTipoIdenExaminado() + "' and fechacreacion = '" + fechanow + "' and tipoexamen = '" + DatosPrincipales.getTipoExamen() + "'");
            sql.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "¡Error en el ingreso de datos a la base!\nPor favor solicite ayuda al equipo de desarrollo" + e);
        }
    }

    public void limpiar() {
        situa_economica = "-";
        tiene_ingre_men = "-";
        sostiene_eco = "";
        act_lab_inde = "-";
        labores_indep = "";
        liquida_cesan = "-";
        cantidad_liquida_cesan = "";
        tiene_ahorros = "-";
        cant_ahorros = "";
        apoyo_padres = "-";
        desc_apoyo_padres = "";
        ing_pareja = "-";
        total_ingresos_pareja = "";
        hadembargo = "-";
        explhadembargo = "";
        reportadocr = "-";
        expreportadocr = "";
        tieneobligafinan = "-";
        exploblifinanc = "";
        tienedeuda = "-";
        exptienedeuda = "";
        gastos_mensuales = "";
        tienepropi = "-";
        exptienepropi = "";
        admisionInfoFinanciera = "";

        obligacion_finan1 = "nohay";
        obligacion_finan2 = "nohay";
        obligacion_finan3 = "nohay";
        obligacion_finan4 = "nohay";
        obligacion_finan5 = "nohay";
        obligacion_finan6 = "nohay";
        obligacion_finan7 = "nohay";
        obligacion_finan7_o = "nohay";

        propiedad_exa1 = "";
        propiedad_exa2 = "";
        propiedad_exa3 = "";
        propiedad_exa3_o = "";
        
        colorCategoria = "sincolor";
    }
}
