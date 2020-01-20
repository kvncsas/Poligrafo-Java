package classes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author Kevin Casas
 */
public class DatosPersonales {

    private static String lugar_exp = "";
    private static String lugar_naci = "";
    private static String fecha_nac = "";
    private static String direccion = "";
    private static String barrio = "";
    private static String localidad = "";
    private static String edad = "0";
    private static String estrato = "-";
    private static String tel_fijo = "";
    private static String tel_celular = "";
    private static String cargoactual = "";
    private static String cargoaspira = "";
    private static String areaactual = "";
    private static String areaaspira = "";
    private static String razon_novedad = "";
    private static String email = "";
    private static String genero = "";
//    private static String foto_examen;
    private static String colaborador;
    private static String meseslaborando;
    private static String admisionDatosPersonales = "";
    private static String colorCategoria = "sincolor";
    private static String validacionRegistro = "noregistrado";
    private static String rutaFoto = "";
    private static String estadoFoto = "nocargada";

    public static String getRutaFoto() {
        return rutaFoto;
    }

    public static void setRutaFoto(String rutaFoto) {
        DatosPersonales.rutaFoto = rutaFoto;
    }

    public static String getEstadoFoto() {
        return estadoFoto;
    }

    public static void setEstadoFoto(String estadoFoto) {
        DatosPersonales.estadoFoto = estadoFoto;
    }

    public static String getColaborador() {
        return colaborador;
    }

    public static void setColaborador(String colaborador) {
        DatosPersonales.colaborador = colaborador;
    }

    public static String getMeseslaborando() {
        return meseslaborando;
    }

    public static void setMeseslaborando(String meseslaborando) {
        DatosPersonales.meseslaborando = meseslaborando;
    }

    public static String getValidacionRegistro() {
        return validacionRegistro;
    }

    public static void setValidacionRegistro(String validacionRegistro) {
        DatosPersonales.validacionRegistro = validacionRegistro;
    }

    public static String getColorCategoria() {
        return colorCategoria;
    }

    public static void setColorCategoria(String colorCategoria) {
        DatosPersonales.colorCategoria = colorCategoria;
    }

    public static String getAdmisionDatosPersonales() {
        return admisionDatosPersonales;
    }

    public static void setAdmisionDatosPersonales(String admisionDatosPersonales) {
        DatosPersonales.admisionDatosPersonales = admisionDatosPersonales;
    }

    public static String getLugar_exp() {
        return lugar_exp;
    }

    public static void setLugar_exp(String lugar_exp) {
        DatosPersonales.lugar_exp = lugar_exp;
    }

    public static String getLugar_naci() {
        return lugar_naci;
    }

    public static void setLugar_naci(String lugar_naci) {
        DatosPersonales.lugar_naci = lugar_naci;
    }

    public static String getFecha_nac() {
        return fecha_nac;
    }

    public static void setFecha_nac(String fecha_nac) {
        DatosPersonales.fecha_nac = fecha_nac;
    }

    public static String getDireccion() {
        return direccion;
    }

    public static void setDireccion(String direccion) {
        DatosPersonales.direccion = direccion;
    }

    public static String getBarrio() {
        return barrio;
    }

    public static void setBarrio(String barrio) {
        DatosPersonales.barrio = barrio;
    }

    public static String getLocalidad() {
        return localidad;
    }

    public static void setLocalidad(String localidad) {
        DatosPersonales.localidad = localidad;
    }

    public static String getEdad() {
        return edad;
    }

    public static void setEdad(String edad) {
        DatosPersonales.edad = edad;
    }

    public static String getEstrato() {
        return estrato;
    }

    public static void setEstrato(String estrato) {
        DatosPersonales.estrato = estrato;
    }

    public static String getTel_fijo() {
        return tel_fijo;
    }

    public static void setTel_fijo(String tel_fijo) {
        DatosPersonales.tel_fijo = tel_fijo;
    }

    public static String getTel_celular() {
        return tel_celular;
    }

    public static void setTel_celular(String tel_celular) {
        DatosPersonales.tel_celular = tel_celular;
    }

    public static String getCargoactual() {
        return cargoactual;
    }

    public static void setCargoactual(String cargoactual) {
        DatosPersonales.cargoactual = cargoactual;
    }

    public static String getCargoaspira() {
        return cargoaspira;
    }

    public static void setCargoaspira(String cargoaspira) {
        DatosPersonales.cargoaspira = cargoaspira;
    }

    public static String getAreaactual() {
        return areaactual;
    }

    public static void setAreaactual(String areaactual) {
        DatosPersonales.areaactual = areaactual;
    }

    public static String getAreaaspira() {
        return areaaspira;
    }

    public static void setAreaaspira(String areaaspira) {
        DatosPersonales.areaaspira = areaaspira;
    }

    public static String getRazon_novedad() {
        return razon_novedad;
    }

    public static void setRazon_novedad(String razon_novedad) {
        DatosPersonales.razon_novedad = razon_novedad;
    }

    public static String getEmail() {
        return email;
    }

    public static void setEmail(String email) {
        DatosPersonales.email = email;
    }

    public static String getGenero() {
        return genero;
    }

    public static void setGenero(String genero) {
        DatosPersonales.genero = genero;
    }

    public SimpleDateFormat getDate() {
        return date;
    }

    public void setDate(SimpleDateFormat date) {
        this.date = date;
    }

    SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");
    java.util.Date fecha = new java.util.Date();
    public String fechanow = date.format(fecha);

    public void update_datosper() {

        String fechanacimiento = date.format(view.DatoPersonal.fechanaci.getDate());

        try {
            Connection con = Conexion.connection;
            Statement s = con.createStatement();
            ResultSet r = s.executeQuery("SELECT * FROM  datos_generales_poli WHERE no_id = " + DatosPrincipales.getNoIdenExaminado() + " and t_identificacion = '" + DatosPrincipales.getTipoIdenExaminado() + "' and fechacreacion = '" + fechanow + "' ");
            r.next();

            int cune = r.getRow();

            if (cune == 0) {
//                try {
//                    PreparedStatement sql = Conexion.connection.prepareStatement("EXEC SP_InsertarDatosPersonales"
//                    + " 'DatosPrincipales.getNombreExaminado()',"
//                    + " 'DatosPrincipales.getTipoIdenExaminado()',"
//                    + " DatosPrincipales.getNoIdenExaminado(),"
//                    + " 'lugar_exp', "
//                    + " 'lugar_naci', "
//                    + " 'fechanac', "
//                    + " 'direccion', "
//                    + " 'barrio', "
//                    + " 'localidad', "
//                    +" edad,"
//                    + " estrato,"
//                    + " 'tel_celular', "
//                    + " 'tel_fijo', "
//                    + " 'email', "
//                    + " 'cargoaspira', "
//                    + " 'areaaspira', "
//                    + " 'DatosPrincipales.getNombreSolicitante()', "
//                    + " 'DatosPrincipales.getCargoSolicitante()', "
//                    + " 'genero', "
//                    + " view.DatoPersonal.imagenpu, "
//                    + " GETDATE(), "
//                    + " 'DatosPrincipales.setMotivoExamen()', "
//                    + " 'DatosPrincipales.getTipoExamen()', "
//                    + " 'DatosPrincipales.getCiudadExamen()', "
//                    + " 'Incompleto' ");
//
//                    sql.executeUpdate();
//                } catch (SQLException e) {
//                    JOptionPane.showMessageDialog(null, "Es una mierda" + e);
//                }
                try {
                    PreparedStatement sql = Conexion.connection.prepareStatement("INSERT INTO datos_generales_poli "
                            + "(nombre, t_identificacion, no_id, lugar_exp, lugar_naci, fecha_naci, direccion, barrio, localidad, estrato, edad, tel_celular, tel_fijo, email, cargoaspira, "
                            + "areaaspira, cargoactual, areaactual, solicitador, cargosolicitador, genero, fechacreacion, motivoexamen, tipoexamen, ciudadexamen, estadoexamen, poligrafista)"
                            + " VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
                    sql.setString(1, DatosPrincipales.getNombreExaminado());
                    sql.setString(2, DatosPrincipales.getTipoIdenExaminado());
                    sql.setString(3, DatosPrincipales.getNoIdenExaminado());
                    sql.setString(4, lugar_exp);
                    sql.setString(5, lugar_naci);
                    sql.setString(6, fechanacimiento);
                    sql.setString(7, direccion);
                    sql.setString(8, barrio);
                    sql.setString(9, localidad);
                    sql.setString(10, estrato);
                    sql.setString(11, edad);
                    sql.setString(12, tel_celular);
                    sql.setString(13, tel_fijo);
                    sql.setString(14, email);
                    sql.setString(15, cargoaspira);
                    sql.setString(16, areaaspira);
                    sql.setString(17, cargoactual);
                    sql.setString(18, areaactual);
                    sql.setString(19, DatosPrincipales.getNombreSolicitante());
                    sql.setString(20, DatosPrincipales.getCargoSolicitante());
                    sql.setString(21, genero);
//                    sql.setBytes(20, view.DatoPersonal.imagenpu);
                    sql.setString(22, fechanow);
                    sql.setString(23, DatosPrincipales.getMotivoExamen());
                    sql.setString(24, DatosPrincipales.getTipoExamen());
                    sql.setString(25, DatosPrincipales.getCiudadExamen());
                    sql.setString(26, "Incompleto");
                    sql.setString(27, DatosPrincipales.getNombreUsuario());

                    sql.executeUpdate();
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, "¡Error en el ingreso de datos a la base!\nPor favor solicite ayuda al equipo de desarrollo" + e);
                }
            } else {
                try {

                    PreparedStatement sql = Conexion.connection.prepareStatement("UPDATE datos_generales_poli "
                            + "SET nombre = '" + DatosPrincipales.getNombreExaminado() + "', t_identificacion = '" + DatosPrincipales.getTipoIdenExaminado() + "',"
                            + " no_id = " + DatosPrincipales.getNoIdenExaminado() + ", lugar_exp = '" + lugar_exp + "',"
                            + "lugar_naci = '" + lugar_naci + "', fecha_naci = '" + fechanacimiento + "', "
                            + "direccion = '" + direccion + "', barrio = '" + barrio + "', "
                            + "localidad = '" + localidad + "', estrato = " + estrato + ", "
                            + "edad = " + edad + ", tel_celular = '" + tel_celular + "', "
                            + "tel_fijo = '" + tel_fijo + "', email = '" + email + "', "
                            + "cargoaspira = '" + cargoaspira + "', areaaspira = '" + areaaspira + "', "
                            + "cargoactual = '" + cargoactual + "', areaactual = '" + areaactual + "', "
                            + "solicitador = '" + DatosPrincipales.getNombreSolicitante() + "', cargosolicitador =  '" + DatosPrincipales.getCargoSolicitante() + "', genero = '" + genero + "', "
                            + "fechacreacion = '" + fechanow + "' WHERE no_id = " + DatosPrincipales.getNoIdenExaminado());
                    sql.executeUpdate();
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, "¡Error en el ingreso de datos a la base!\nPor favor solicite ayuda al equipo de desarrollo" + e);
                }
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void limpiar() {
        lugar_exp = "";
        lugar_naci = "";
        fecha_nac = "";
        direccion = "";
        barrio = "";
        localidad = "";
        edad = "0";
        estrato = "-";
        tel_fijo = "";
        tel_celular = "";
        cargoactual = "";
        cargoaspira = "";
        areaactual = "";
        areaaspira = "";
        razon_novedad = "";
        email = "";
        genero = "";
        admisionDatosPersonales = "";
        colorCategoria = "sincolor";
        validacionRegistro = "noregistrado";
        rutaFoto = "";
        estadoFoto = "nocargada";
        colorCategoria = "sincolor";
    }

}
