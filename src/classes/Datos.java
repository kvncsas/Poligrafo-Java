package sininternet;

/**
 *
 * @author Kevin Casas
 */
public class Datos {
    
    private String nombre;
    private String tipoid;
    private String noid;
    private String tipoexamen;
    private String motivoexamen;
    private String estadoexamen;
    private String fechaexamen;
    private static String hayNotificacion;
    
    public Datos(){}

    public Datos(String nombre, String tipoid, String noid, String tipoexamen, String motivoexamen, String estadoexamen, String fechaexamen) {
        this.nombre = nombre;
        this.tipoid = tipoid;
        this.noid = noid;
        this.tipoexamen = tipoexamen;
        this.motivoexamen = motivoexamen;
        this.estadoexamen = estadoexamen;
        this.fechaexamen = fechaexamen;
    }

    public static String getHayNotificacion() {
        return hayNotificacion;
    }

    public static void setHayNotificacion(String hayNotificacion) {
        Datos.hayNotificacion = hayNotificacion;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoid() {
        return tipoid;
    }

    public void setTipoid(String tipoid) {
        this.tipoid = tipoid;
    }

    public String getNoid() {
        return noid;
    }

    public void setNoid(String noid) {
        this.noid = noid;
    }

    public String getTipoexamen() {
        return tipoexamen;
    }

    public void setTipoexamen(String tipoexamen) {
        this.tipoexamen = tipoexamen;
    }

    public String getMotivoexamen() {
        return motivoexamen;
    }

    public void setMotivoexamen(String motivoexamen) {
        this.motivoexamen = motivoexamen;
    }

    public String getEstadoexamen() {
        return estadoexamen;
    }

    public void setEstadoexamen(String estadoexamen) {
        this.estadoexamen = estadoexamen;
    }

    public String getFechaexamen() {
        return fechaexamen;
    }

    public void setFechaexamen(String fechaexamen) {
        this.fechaexamen = fechaexamen;
    }
    
}
