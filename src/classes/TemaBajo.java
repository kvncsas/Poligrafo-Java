package classes;

/**
 *
 * @author Kevin Casas
 */
public class TemaBajo {

    private static String pg1 = "";
    private static String pg2 = "";
    private static String pg3 = "";
    private static String pg4 = "";
    private static String sancion1 = "-";
    private static String sancion2 = "-";
    private static String sancion3 = "-";
    private static String sancion4 = "-";
    private static String sancion5 = "-";
    private static String sancion6 = "-";
    private static String temaBajo = "";
    private static String colorCategoria = "sincolor";

    public static String getColorCategoria() {
        return colorCategoria;
    }

    public static void setColorCategoria(String colorCategoria) {
        TemaBajo.colorCategoria = colorCategoria;
    }
    
    

    public static String getPg1() {
        return pg1;
    }

    public static void setPg1(String pg1) {
        TemaBajo.pg1 = pg1;
    }

    public static String getPg2() {
        return pg2;
    }

    public static void setPg2(String pg2) {
        TemaBajo.pg2 = pg2;
    }

    public static String getPg3() {
        return pg3;
    }

    public static void setPg3(String pg3) {
        TemaBajo.pg3 = pg3;
    }

    public static String getPg4() {
        return pg4;
    }

    public static void setPg4(String pg4) {
        TemaBajo.pg4 = pg4;
    }

    public static String getTemaBajo() {
        return temaBajo;
    }

    public static void setTemaBajo(String temaBajo) {
        TemaBajo.temaBajo = temaBajo;
    }

    public static String getSancion1() {
        return sancion1;
    }

    public static void setSancion1(String sancion1) {
        TemaBajo.sancion1 = sancion1;
    }

    public static String getSancion2() {
        return sancion2;
    }

    public static void setSancion2(String sancion2) {
        TemaBajo.sancion2 = sancion2;
    }

    public static String getSancion3() {
        return sancion3;
    }

    public static void setSancion3(String sancion3) {
        TemaBajo.sancion3 = sancion3;
    }

    public static String getSancion4() {
        return sancion4;
    }

    public static void setSancion4(String sancion4) {
        TemaBajo.sancion4 = sancion4;
    }

    public static String getSancion5() {
        return sancion5;
    }

    public static void setSancion5(String sancion5) {
        TemaBajo.sancion5 = sancion5;
    }

    public static String getSancion6() {
        return sancion6;
    }

    public static void setSancion6(String sancion6) {
        TemaBajo.sancion6 = sancion6;
    }

    public void limpiar() {
        pg1 = "";
        pg2 = "";
        pg3 = "";
        pg4 = "";
        sancion1 = "-";
        sancion2 = "-";
        sancion3 = "-";
        sancion4 = "-";
        sancion5 = "-";
        sancion6 = "-";
        temaBajo = "";
        colorCategoria = "sincolor";
    }

}
