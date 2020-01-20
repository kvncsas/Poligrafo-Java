package classes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import view.DatoGeneral;
import static view.DatoPersonal.txtnoiden;

/**
 *
 * @author Kevin Casas
 */
public class EstadoSalud {
    
    private static String estado_salud = "";
    private static String prob_salud = "";
    private static String prob_salud_descrip = "";
    private static String tipoproblema1 = "nohay";
    private static String tipoproblema2 = "nohay";
    private static String tipoproblema3 = "nohay";
    private static String tipoproblema4 = "nohay";
    private static String tipoproblema5 = "nohay";
    private static String tipoproblema6 = "nohay";
    private static String tipoproblema7 = "nohay";
    private static String tipoproblema8 = "nohay";
    private static String tipoproblema9 = "nohay";
    private static String tipoproblema10 = "nohay";
    private static String tipoproblema11 = "nohay";
    private static String tipoproblema12 = "nohay";
    private static String tipoproblema13 = "nohay";
    private static String tipoproblema14 = "nohay";
    private static String tipoproblema15 = "nohay";
    private static String tipoproblema16 = "nohay";
    private static String tipoproblema17 = "nohay";
    private static String tipoproblema18 = "nohay";
    private static String tipoproblema19 = "nohay";
    private static String tipoproblema20 = "nohay";
    private static String visibilidadflecha = "noesvisible";
    private static String admisionEstadoSalud = "";
    private static String colorCategoria = "sincolor";

    public static String getColorCategoria() {
        return colorCategoria;
    }

    public static void setColorCategoria(String colorCategoria) {
        EstadoSalud.colorCategoria = colorCategoria;
    }
    
    public static String getAdmisionEstadoSalud() {
        return admisionEstadoSalud;
    }

    public static void setAdmisionEstadoSalud(String admisionEstadoSalud) {
        EstadoSalud.admisionEstadoSalud = admisionEstadoSalud;
    }

    public static String getEstado_salud() {
        return estado_salud;
    }

    public static void setEstado_salud(String estado_salud) {
        EstadoSalud.estado_salud = estado_salud;
    }

    public static String getProb_salud() {
        return prob_salud;
    }

    public static void setProb_salud(String prob_salud) {
        EstadoSalud.prob_salud = prob_salud;
    }

    public static String getProb_salud_descrip() {
        return prob_salud_descrip;
    }

    public static void setProb_salud_descrip(String prob_salud_descrip) {
        EstadoSalud.prob_salud_descrip = prob_salud_descrip;
    }

    public static String getTipoproblema1() {
        return tipoproblema1;
    }

    public static void setTipoproblema1(String tipoproblema1) {
        EstadoSalud.tipoproblema1 = tipoproblema1;
    }

    public static String getTipoproblema2() {
        return tipoproblema2;
    }

    public static void setTipoproblema2(String tipoproblema2) {
        EstadoSalud.tipoproblema2 = tipoproblema2;
    }

    public static String getTipoproblema3() {
        return tipoproblema3;
    }

    public static void setTipoproblema3(String tipoproblema3) {
        EstadoSalud.tipoproblema3 = tipoproblema3;
    }

    public static String getTipoproblema4() {
        return tipoproblema4;
    }

    public static void setTipoproblema4(String tipoproblema4) {
        EstadoSalud.tipoproblema4 = tipoproblema4;
    }

    public static String getTipoproblema5() {
        return tipoproblema5;
    }

    public static void setTipoproblema5(String tipoproblema5) {
        EstadoSalud.tipoproblema5 = tipoproblema5;
    }

    public static String getTipoproblema6() {
        return tipoproblema6;
    }

    public static void setTipoproblema6(String tipoproblema6) {
        EstadoSalud.tipoproblema6 = tipoproblema6;
    }

    public static String getTipoproblema7() {
        return tipoproblema7;
    }

    public static void setTipoproblema7(String tipoproblema7) {
        EstadoSalud.tipoproblema7 = tipoproblema7;
    }

    public static String getTipoproblema8() {
        return tipoproblema8;
    }

    public static void setTipoproblema8(String tipoproblema8) {
        EstadoSalud.tipoproblema8 = tipoproblema8;
    }

    public static String getTipoproblema9() {
        return tipoproblema9;
    }

    public static void setTipoproblema9(String tipoproblema9) {
        EstadoSalud.tipoproblema9 = tipoproblema9;
    }

    public static String getTipoproblema10() {
        return tipoproblema10;
    }

    public static void setTipoproblema10(String tipoproblema10) {
        EstadoSalud.tipoproblema10 = tipoproblema10;
    }

    public static String getTipoproblema11() {
        return tipoproblema11;
    }

    public static void setTipoproblema11(String tipoproblema11) {
        EstadoSalud.tipoproblema11 = tipoproblema11;
    }

    public static String getTipoproblema12() {
        return tipoproblema12;
    }

    public static void setTipoproblema12(String tipoproblema12) {
        EstadoSalud.tipoproblema12 = tipoproblema12;
    }

    public static String getTipoproblema13() {
        return tipoproblema13;
    }

    public static void setTipoproblema13(String tipoproblema13) {
        EstadoSalud.tipoproblema13 = tipoproblema13;
    }

    public static String getTipoproblema14() {
        return tipoproblema14;
    }

    public static void setTipoproblema14(String tipoproblema14) {
        EstadoSalud.tipoproblema14 = tipoproblema14;
    }

    public static String getTipoproblema15() {
        return tipoproblema15;
    }

    public static void setTipoproblema15(String tipoproblema15) {
        EstadoSalud.tipoproblema15 = tipoproblema15;
    }

    public static String getTipoproblema16() {
        return tipoproblema16;
    }

    public static void setTipoproblema16(String tipoproblema16) {
        EstadoSalud.tipoproblema16 = tipoproblema16;
    }

    public static String getTipoproblema17() {
        return tipoproblema17;
    }

    public static void setTipoproblema17(String tipoproblema17) {
        EstadoSalud.tipoproblema17 = tipoproblema17;
    }

    public static String getTipoproblema18() {
        return tipoproblema18;
    }

    public static void setTipoproblema18(String tipoproblema18) {
        EstadoSalud.tipoproblema18 = tipoproblema18;
    }

    public static String getTipoproblema19() {
        return tipoproblema19;
    }

    public static void setTipoproblema19(String tipoproblema19) {
        EstadoSalud.tipoproblema19 = tipoproblema19;
    }

    public static String getTipoproblema20() {
        return tipoproblema20;
    }

    public static void setTipoproblema20(String tipoproblema20) {
        EstadoSalud.tipoproblema20 = tipoproblema20;
    }

    public static String getVisibilidadflecha() {
        return visibilidadflecha;
    }

    public static void setVisibilidadflecha(String visibilidadflecha) {
        EstadoSalud.visibilidadflecha = visibilidadflecha;
    }
    
    public void validarestadosalud(){
        //1
        if (tipoproblema1.equals("hay")) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM psiquiatricos_poli  WHERE tipoproblema = 'Problemas auditivos' AND  no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune < 1) {
                    try {
                        PreparedStatement sqlins = Conexion.connection.prepareStatement("INSERT INTO psiquiatricos_poli "
                                + "(no_id, tipoproblema, fechacreacion)"
                                + " VALUES (?,?,GETDATE())");
                        sqlins.setString(1, txtnoiden.getText());
                        sqlins.setString(2, "Problemas auditivos");
                        sqlins.executeUpdate();
                    } catch (SQLException e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (tipoproblema1.equals("nohay")) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM psiquiatricos_poli  WHERE tipoproblema = 'Problemas auditivos' AND no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune > 0) {
                    try {
                        PreparedStatement sqlpsiup = Conexion.connection.prepareStatement("DELETE FROM psiquiatricos_poli WHERE tipoproblema = 'Problemas auditivos' AND no_id = " + txtnoiden.getText());
                        sqlpsiup.executeUpdate();
                    } catch (SQLException e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        //2
        //Edgar
        if (tipoproblema2.equals("hay")) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM psiquiatricos_poli  WHERE tipoproblema = 'Transtornos neurológicos' AND  no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune < 1) {
                    try {
                        PreparedStatement sqlins = Conexion.connection.prepareStatement("INSERT INTO psiquiatricos_poli "
                                + "(no_id, tipoproblema, fechacreacion)"
                                + " VALUES (?,?,GETDATE())");
                        sqlins.setString(1, txtnoiden.getText());
                        sqlins.setString(2, "Transtornos neurológicos");
                        sqlins.executeUpdate();
                    } catch (SQLException e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (tipoproblema2.equals("nohay")) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM psiquiatricos_poli  WHERE tipoproblema = 'Transtornos neurológicos' AND no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune > 0) {
                    try {
                        PreparedStatement sqlpsiup = Conexion.connection.prepareStatement("DELETE FROM psiquiatricos_poli WHERE tipoproblema = 'Transtornos neurológicos' AND no_id = " + txtnoiden.getText());
                        sqlpsiup.executeUpdate();
                    } catch (SQLException e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        //3
        if (tipoproblema3.equals("hay")) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM psiquiatricos_poli  WHERE tipoproblema = 'Enfermedades cardiovasculares' AND  no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune < 1) {
                    try {
                        PreparedStatement sqlins = Conexion.connection.prepareStatement("INSERT INTO psiquiatricos_poli "
                                + "(no_id, tipoproblema, fechacreacion)"
                                + " VALUES (?,?,GETDATE())");
                        sqlins.setString(1, txtnoiden.getText());
                        sqlins.setString(2, "Enfermedades cardiovasculares");
                        sqlins.executeUpdate();
                    } catch (SQLException e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (tipoproblema3.equals("nohay")) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM psiquiatricos_poli  WHERE tipoproblema = 'Enfermedades cardiovasculares' AND no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune > 0) {
                    try {
                        PreparedStatement sqlpsiup = Conexion.connection.prepareStatement("DELETE FROM psiquiatricos_poli WHERE tipoproblema = 'Enfermedades cardiovasculares' AND no_id = " + txtnoiden.getText());
                        sqlpsiup.executeUpdate();
                    } catch (SQLException e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        //4
        if (tipoproblema4.equals("hay")) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM psiquiatricos_poli  WHERE tipoproblema = 'Enfermedades respiratorias' AND  no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune < 1) {
                    try {
                        PreparedStatement sqlins = Conexion.connection.prepareStatement("INSERT INTO psiquiatricos_poli "
                                + "(no_id, tipoproblema, fechacreacion)"
                                + " VALUES (?,?,GETDATE())");
                        sqlins.setString(1, txtnoiden.getText());
                        sqlins.setString(2, "Enfermedades respiratorias");
                        sqlins.executeUpdate();
                    } catch (SQLException e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (tipoproblema4.equals("nohay")) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM psiquiatricos_poli  WHERE tipoproblema = 'Enfermedades respiratorias' AND no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune > 0) {
                    try {
                        PreparedStatement sqlpsiup = Conexion.connection.prepareStatement("DELETE FROM psiquiatricos_poli WHERE tipoproblema = 'Enfermedades respiratorias' AND no_id = " + txtnoiden.getText());
                        sqlpsiup.executeUpdate();
                    } catch (SQLException e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        //5
        if (tipoproblema5.equals("hay")) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM psiquiatricos_poli  WHERE tipoproblema = 'Enfermedades profesionales' AND  no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune < 1) {
                    try {
                        PreparedStatement sqlins = Conexion.connection.prepareStatement("INSERT INTO psiquiatricos_poli "
                                + "(no_id, tipoproblema, fechacreacion)"
                                + " VALUES (?,?,GETDATE())");
                        sqlins.setString(1, txtnoiden.getText());
                        sqlins.setString(2, "Enfermedades profesionales");
                        sqlins.executeUpdate();
                    } catch (SQLException e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (tipoproblema5.equals("nohay")) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM psiquiatricos_poli  WHERE tipoproblema = 'Enfermedades profesionales' AND no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune > 0) {
                    try {
                        PreparedStatement sqlpsiup = Conexion.connection.prepareStatement("DELETE FROM psiquiatricos_poli WHERE tipoproblema = 'Enfermedades profesionales' AND no_id = " + txtnoiden.getText());
                        sqlpsiup.executeUpdate();
                    } catch (SQLException e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        //6
        if (tipoproblema6.equals("hay")) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM psiquiatricos_poli  WHERE tipoproblema = 'Tratamientos psicológicos' AND  no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune < 1) {
                    try {
                        PreparedStatement sqlins = Conexion.connection.prepareStatement("INSERT INTO psiquiatricos_poli "
                                + "(no_id, tipoproblema, fechacreacion)"
                                + " VALUES (?,?,GETDATE())");
                        sqlins.setString(1, txtnoiden.getText());
                        sqlins.setString(2, "Tratamientos psicológicos");
                        sqlins.executeUpdate();
                    } catch (SQLException e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (tipoproblema6.equals("nohay")) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM psiquiatricos_poli  WHERE tipoproblema = 'Tratamientos psicológicos' AND no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune > 0) {
                    try {
                        PreparedStatement sqlpsiup = Conexion.connection.prepareStatement("DELETE FROM psiquiatricos_poli WHERE tipoproblema = 'Tratamientos psicológicos' AND no_id = " + txtnoiden.getText());
                        sqlpsiup.executeUpdate();
                    } catch (SQLException e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        //7
        if (tipoproblema7.equals("hay")) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM psiquiatricos_poli  WHERE tipoproblema = 'Tratamientos psiquiátricos' AND  no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune < 1) {
                    try {
                        PreparedStatement sqlins = Conexion.connection.prepareStatement("INSERT INTO psiquiatricos_poli "
                                + "(no_id, tipoproblema, fechacreacion)"
                                + " VALUES (?,?,GETDATE())");
                        sqlins.setString(1, txtnoiden.getText());
                        sqlins.setString(2, "Tratamientos psiquiátricos");
                        sqlins.executeUpdate();
                    } catch (SQLException e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (tipoproblema7.equals("nohay")) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM psiquiatricos_poli  WHERE tipoproblema = 'Tratamientos psiquiátricos' AND no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune > 0) {
                    try {
                        PreparedStatement sqlpsiup = Conexion.connection.prepareStatement("DELETE FROM psiquiatricos_poli WHERE tipoproblema = 'Tratamientos psiquiátricos' AND no_id = " + txtnoiden.getText());
                        sqlpsiup.executeUpdate();
                    } catch (SQLException e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        //8
        if (tipoproblema8.equals("hay")) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM psiquiatricos_poli  WHERE tipoproblema = 'Problemas Sistema Nervioso' AND  no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune < 1) {
                    try {
                        PreparedStatement sqlins = Conexion.connection.prepareStatement("INSERT INTO psiquiatricos_poli "
                                + "(no_id, tipoproblema, fechacreacion)"
                                + " VALUES (?,?,GETDATE())");
                        sqlins.setString(1, txtnoiden.getText());
                        sqlins.setString(2, "Problemas Sistema Nervioso");
                        sqlins.executeUpdate();
                    } catch (SQLException e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (tipoproblema8.equals("nohay")) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM psiquiatricos_poli  WHERE tipoproblema = 'Problemas Sistema Nervioso' AND no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune > 0) {
                    try {
                        PreparedStatement sqlpsiup = Conexion.connection.prepareStatement("DELETE FROM psiquiatricos_poli WHERE tipoproblema = 'Problemas Sistema Nervioso' AND no_id = " + txtnoiden.getText());
                        sqlpsiup.executeUpdate();
                    } catch (SQLException e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        //9
        if (tipoproblema9.equals("hay")) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM psiquiatricos_poli  WHERE tipoproblema = 'Cáncer' AND  no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune < 1) {
                    try {
                        PreparedStatement sqlins = Conexion.connection.prepareStatement("INSERT INTO psiquiatricos_poli "
                                + "(no_id, tipoproblema, fechacreacion)"
                                + " VALUES (?,?,GETDATE())");
                        sqlins.setString(1, txtnoiden.getText());
                        sqlins.setString(2, "Cáncer");
                        sqlins.executeUpdate();
                    } catch (SQLException e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (tipoproblema9.equals("nohay")) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM psiquiatricos_poli  WHERE tipoproblema = 'Cáncer' AND no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune > 0) {
                    try {
                        PreparedStatement sqlpsiup = Conexion.connection.prepareStatement("DELETE FROM psiquiatricos_poli WHERE tipoproblema = 'Cáncer' AND no_id = " + txtnoiden.getText());
                        sqlpsiup.executeUpdate();
                    } catch (SQLException e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        //10
        if (tipoproblema10.equals("hay")) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM psiquiatricos_poli  WHERE tipoproblema = 'Diabetes' AND  no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune < 1) {
                    try {
                        PreparedStatement sqlins = Conexion.connection.prepareStatement("INSERT INTO psiquiatricos_poli "
                                + "(no_id, tipoproblema, fechacreacion)"
                                + " VALUES (?,?,GETDATE())");
                        sqlins.setString(1, txtnoiden.getText());
                        sqlins.setString(2, "Diabetes");
                        sqlins.executeUpdate();
                    } catch (SQLException e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (tipoproblema10.equals("nohay")) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM psiquiatricos_poli  WHERE tipoproblema = 'Diabetes' AND no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune > 0) {
                    try {
                        PreparedStatement sqlpsiup = Conexion.connection.prepareStatement("DELETE FROM psiquiatricos_poli WHERE tipoproblema = 'Diabetes' AND no_id = " + txtnoiden.getText());
                        sqlpsiup.executeUpdate();
                    } catch (SQLException e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        //11
        if (tipoproblema11.equals("hay")) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM psiquiatricos_poli  WHERE tipoproblema = 'Consumo medicamentos formulados' AND  no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune < 1) {
                    try {
                        PreparedStatement sqlins = Conexion.connection.prepareStatement("INSERT INTO psiquiatricos_poli "
                                + "(no_id, tipoproblema, fechacreacion)"
                                + " VALUES (?,?,GETDATE())");
                        sqlins.setString(1, txtnoiden.getText());
                        sqlins.setString(2, "Consumo medicamentos formulados");
                        sqlins.executeUpdate();
                    } catch (SQLException e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (tipoproblema11.equals("nohay")) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM psiquiatricos_poli  WHERE tipoproblema = 'Consumo medicamentos formulados' AND no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune > 0) {
                    try {
                        PreparedStatement sqlpsiup = Conexion.connection.prepareStatement("DELETE FROM psiquiatricos_poli WHERE tipoproblema = 'Consumo medicamentos formulados' AND no_id = " + txtnoiden.getText());
                        sqlpsiup.executeUpdate();
                    } catch (SQLException e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        //12
        if (tipoproblema12.equals("hay")) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM psiquiatricos_poli  WHERE tipoproblema = 'Hospitalizaciones' AND  no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune < 1) {
                    try {
                        PreparedStatement sqlins = Conexion.connection.prepareStatement("INSERT INTO psiquiatricos_poli "
                                + "(no_id, tipoproblema, fechacreacion)"
                                + " VALUES (?,?,GETDATE())");
                        sqlins.setString(1, txtnoiden.getText());
                        sqlins.setString(2, "Hospitalizaciones");
                        sqlins.executeUpdate();
                    } catch (SQLException e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (tipoproblema12.equals("nohay")) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM psiquiatricos_poli  WHERE tipoproblema = 'Hospitalizaciones' AND no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune > 0) {
                    try {
                        PreparedStatement sqlpsiup = Conexion.connection.prepareStatement("DELETE FROM psiquiatricos_poli WHERE tipoproblema = 'Hospitalizaciones' AND no_id = " + txtnoiden.getText());
                        sqlpsiup.executeUpdate();
                    } catch (SQLException e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        //13
        if (tipoproblema13.equals("hay")) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM psiquiatricos_poli  WHERE tipoproblema = 'Cirugías' AND  no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune < 1) {
                    try {
                        PreparedStatement sqlins = Conexion.connection.prepareStatement("INSERT INTO psiquiatricos_poli "
                                + "(no_id, tipoproblema, fechacreacion)"
                                + " VALUES (?,?,GETDATE())");
                        sqlins.setString(1, txtnoiden.getText());
                        sqlins.setString(2, "Cirugías");
                        sqlins.executeUpdate();
                    } catch (SQLException e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (tipoproblema13.equals("nohay")) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM psiquiatricos_poli  WHERE tipoproblema = 'Cirugías' AND no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune > 0) {
                    try {
                        PreparedStatement sqlpsiup = Conexion.connection.prepareStatement("DELETE FROM psiquiatricos_poli WHERE tipoproblema = 'Cirugías' AND no_id = " + txtnoiden.getText());
                        sqlpsiup.executeUpdate();
                    } catch (SQLException e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        //14
        if (tipoproblema14.equals("hay")) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM psiquiatricos_poli  WHERE tipoproblema = 'Intentos de suicidio' AND  no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune < 1) {
                    try {
                        PreparedStatement sqlins = Conexion.connection.prepareStatement("INSERT INTO psiquiatricos_poli "
                                + "(no_id, tipoproblema, fechacreacion)"
                                + " VALUES (?,?,GETDATE())");
                        sqlins.setString(1, txtnoiden.getText());
                        sqlins.setString(2, "Intentos de suicidio");
                        sqlins.executeUpdate();
                    } catch (SQLException e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (tipoproblema14.equals("nohay")) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM psiquiatricos_poli  WHERE tipoproblema = 'Intentos de suicidio' AND no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune > 0) {
                    try {
                        PreparedStatement sqlpsiup = Conexion.connection.prepareStatement("DELETE FROM psiquiatricos_poli WHERE tipoproblema = 'Intentos de suicidio' AND no_id = " + txtnoiden.getText());
                        sqlpsiup.executeUpdate();
                    } catch (SQLException e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        //15
        if (tipoproblema15.equals("hay")) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM psiquiatricos_poli  WHERE tipoproblema = 'Enfermedades de transmisión sexual' AND  no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune < 1) {
                    try {
                        PreparedStatement sqlins = Conexion.connection.prepareStatement("INSERT INTO psiquiatricos_poli "
                                + "(no_id, tipoproblema, fechacreacion)"
                                + " VALUES (?,?,GETDATE())");
                        sqlins.setString(1, txtnoiden.getText());
                        sqlins.setString(2, "Enfermedades de transmisión sexual");
                        sqlins.executeUpdate();
                    } catch (SQLException e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (tipoproblema15.equals("nohay")) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM psiquiatricos_poli  WHERE tipoproblema = 'Enfermedades de transmisión sexual' AND no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune > 0) {
                    try {
                        PreparedStatement sqlpsiup = Conexion.connection.prepareStatement("DELETE FROM psiquiatricos_poli WHERE tipoproblema = 'Enfermedades de transmisión sexual' AND no_id = " + txtnoiden.getText());
                        sqlpsiup.executeUpdate();
                    } catch (SQLException e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        //16
        if (tipoproblema16.equals("hay")) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM psiquiatricos_poli  WHERE tipoproblema = 'VIH' AND  no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune < 1) {
                    try {
                        PreparedStatement sqlins = Conexion.connection.prepareStatement("INSERT INTO psiquiatricos_poli "
                                + "(no_id, tipoproblema, fechacreacion)"
                                + " VALUES (?,?,GETDATE())");
                        sqlins.setString(1, txtnoiden.getText());
                        sqlins.setString(2, "VIH");
                        sqlins.executeUpdate();
                    } catch (SQLException e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (tipoproblema16.equals("nohay")) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM psiquiatricos_poli  WHERE tipoproblema = 'VIH' AND no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune > 0) {
                    try {
                        PreparedStatement sqlpsiup = Conexion.connection.prepareStatement("DELETE FROM psiquiatricos_poli WHERE tipoproblema = 'VIH' AND no_id = " + txtnoiden.getText());
                        sqlpsiup.executeUpdate();
                    } catch (SQLException e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        //17
        if (tipoproblema17.equals("hay")) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM psiquiatricos_poli  WHERE tipoproblema = 'Parálisis en una o más partes del cuerpo' AND  no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune < 1) {
                    try {
                        PreparedStatement sqlins = Conexion.connection.prepareStatement("INSERT INTO psiquiatricos_poli "
                                + "(no_id, tipoproblema, fechacreacion)"
                                + " VALUES (?,?,GETDATE())");
                        sqlins.setString(1, txtnoiden.getText());
                        sqlins.setString(2, "Parálisis en una o más partes del cuerpo");
                        sqlins.executeUpdate();
                    } catch (SQLException e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (tipoproblema17.equals("nohay")) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM psiquiatricos_poli  WHERE tipoproblema = 'Parálisis en una o más partes del cuerpo' AND no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune > 0) {
                    try {
                        PreparedStatement sqlpsiup = Conexion.connection.prepareStatement("DELETE FROM psiquiatricos_poli WHERE tipoproblema = 'Parálisis en una o más partes del cuerpo' AND no_id = " + txtnoiden.getText());
                        sqlpsiup.executeUpdate();
                    } catch (SQLException e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        //18
        if (tipoproblema18.equals("hay")) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM psiquiatricos_poli  WHERE tipoproblema = 'Diagnóstico de Disautonomía' AND  no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune < 1) {
                    try {
                        PreparedStatement sqlins = Conexion.connection.prepareStatement("INSERT INTO psiquiatricos_poli "
                                + "(no_id, tipoproblema, fechacreacion)"
                                + " VALUES (?,?,GETDATE())");
                        sqlins.setString(1, txtnoiden.getText());
                        sqlins.setString(2, "Diagnóstico de Disautonomía");
                        sqlins.executeUpdate();
                    } catch (SQLException e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (tipoproblema18.equals("nohay")) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM psiquiatricos_poli  WHERE tipoproblema = 'Diagnóstico de Disautonomía' AND no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune > 0) {
                    try {
                        PreparedStatement sqlpsiup = Conexion.connection.prepareStatement("DELETE FROM psiquiatricos_poli WHERE tipoproblema = 'Diagnóstico de Disautonomía' AND no_id = " + txtnoiden.getText());
                        sqlpsiup.executeUpdate();
                    } catch (SQLException e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        //19
        if (tipoproblema19.equals("hay")) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM psiquiatricos_poli  WHERE tipoproblema = 'Esclerosis' AND  no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune < 1) {
                    try {
                        PreparedStatement sqlins = Conexion.connection.prepareStatement("INSERT INTO psiquiatricos_poli "
                                + "(no_id, tipoproblema, fechacreacion)"
                                + " VALUES (?,?,GETDATE())");
                        sqlins.setString(1, txtnoiden.getText());
                        sqlins.setString(2, "Esclerosis");
                        sqlins.executeUpdate();
                    } catch (SQLException e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (tipoproblema19.equals("nohay")) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM psiquiatricos_poli  WHERE tipoproblema = 'Esclerosis' AND no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune > 0) {
                    try {
                        PreparedStatement sqlpsiup = Conexion.connection.prepareStatement("DELETE FROM psiquiatricos_poli WHERE tipoproblema = 'Esclerosis' AND no_id = " + txtnoiden.getText());
                        sqlpsiup.executeUpdate();
                    } catch (SQLException e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        //20
        if (tipoproblema20.equals("hay")) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM psiquiatricos_poli  WHERE tipoproblema = 'Escoliosis' AND  no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune < 1) {
                    try {
                        PreparedStatement sqlins = Conexion.connection.prepareStatement("INSERT INTO psiquiatricos_poli "
                                + "(no_id, tipoproblema, fechacreacion)"
                                + " VALUES (?,?,GETDATE())");
                        sqlins.setString(1, txtnoiden.getText());
                        sqlins.setString(2, "Escoliosis");
                        sqlins.executeUpdate();
                    } catch (SQLException e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (tipoproblema20.equals("nohay")) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM psiquiatricos_poli  WHERE tipoproblema = 'Escoliosis' AND no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune > 0) {
                    try {
                        PreparedStatement sqlpsiup = Conexion.connection.prepareStatement("DELETE FROM psiquiatricos_poli WHERE tipoproblema = 'Escoliosis' AND no_id = " + txtnoiden.getText());
                        sqlpsiup.executeUpdate();
                    } catch (SQLException e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
            
    }
    
    public void update_estadosalud() {
        try {
            PreparedStatement sql = Conexion.connection.prepareStatement("UPDATE datos_generales_poli "
                    + "SET estado_salud = '" + estado_salud + "', prob_salud = '" + prob_salud + "',"
                    + " prob_salud_descrip = '" + prob_salud_descrip + "' WHERE no_id = " + txtnoiden.getText() + "  ");
            sql.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "¡Error en el ingreso de datos a la base!\nPor favor solicite ayuda al equipo de desarrollo" + e);
        }
    }
    
    public void limpiar(){
        estado_salud = "";
    prob_salud = "";
    prob_salud_descrip = "";
    tipoproblema1 = "nohay";
    tipoproblema2 = "nohay";
    tipoproblema3 = "nohay";
    tipoproblema4 = "nohay";
    tipoproblema5 = "nohay";
    tipoproblema6 = "nohay";
    tipoproblema7 = "nohay";
    tipoproblema8 = "nohay";
    tipoproblema9 = "nohay";
    tipoproblema10 = "nohay";
    tipoproblema11 = "nohay";
    tipoproblema12 = "nohay";
    tipoproblema13 = "nohay";
    tipoproblema14 = "nohay";
    tipoproblema15 = "nohay";
    tipoproblema16 = "nohay";
    tipoproblema17 = "nohay";
    tipoproblema18 = "nohay";
    tipoproblema19 = "nohay";
    tipoproblema20 = "nohay";
    visibilidadflecha = "noesvisible";
    admisionEstadoSalud = "";
    colorCategoria = "sincolor";
    }
    
}
