package classes;

import icons.Warning;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Kevin Casas
 */
public class Conexion {

    public static Connection connection;
    public static String importante = null;

    public Conexion() {

        //String server="TPCV359-85.teleperformance.co\\SQL2016STD,5081";
//        String server ="10.160.103.85:5081";
//        String usu="casas.5";
//        String contra="READset7771";
        try {
            Class.forName("net.sourceforge.jtds.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:jtds:sqlserver://10.160.103.85:5081/HR_Analytics", "HRDevelopment", "Aplicaciones2020");
//            Class.forName("net.sourceforge.jtds.jdbc.Driver");
//            connection = DriverManager.getConnection ("jdbc:jtds:sqlserver://localhost;databaseName=HR_Analytics","666","666"); 
            if (connection != null) {
                connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
                System.out.println("Conectado!!!!!!!");
                importante = "Conconexion";
            } else {
                System.out.println("Error de Conexión");
            }
        } catch (SQLException ex) {
            int val = JOptionPane.showConfirmDialog(null, "¡No hay conexión al servidor!\n\n El aplicativo activará el modo offline y  los datos de los exámenes se guardarán localmente,           \n una vez el usuario vuelva a ingresar con la conexión establecida, se le notificará del cargue\n de la información de los exámenes realizados.\n Si desea continuar debe tener en cuenta que no se podrán buscar registros y debe utilizar\n el usuario específico para tener acceso.\n\n¿Desea continuar?\n\n", "Activación de modo offline", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, iconWarning);
            if (val == 0) {
                System.out.println("No hay conexión, Modo offline activo");
                importante = "Sinconexion";
            } else if (val == 1) {
                System.exit(0);
            }
        } catch (ClassNotFoundException exe) {
        }
    }

    public static Conexion getInstance() {
        return conexionHolder.INSTANCE;
    }

    public static class conexionHolder {
        private static final Conexion INSTANCE = new Conexion();
    }

    Warning iconWarning = new Warning();
}
