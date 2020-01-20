package view;

import classes.AccionesExamen;
import classes.ActiTiempoLibre;
import classes.AntecedentesJudiciales;
import icons.*;
import java.awt.Color;
import java.awt.FlowLayout;
import static java.awt.event.ActionEvent.CTRL_MASK;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.InputMap;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.KeyStroke;
import classes.Conexion;
import classes.ConsumoBebidas;
import classes.ConsumoSustancias;
import classes.DatosPersonales;
import classes.DatosPrincipales;
import classes.EstadoSalud;
import classes.Falsificacion;
import classes.HistoriaLaboral;
import classes.InfoAcademica;
import classes.InfoFamiliar;
import classes.InfoFinanciera;
import classes.PlanesInfiltracion;
import classes.TecnicaYPreguntas;
import classes.VinculosPersonas;
import static view.MenuPrincipal.na;

/**
 *
 * @author Kevin Casas
 */
public class Consulta extends javax.swing.JInternalFrame {

    public Consulta() {
        ((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI()).setNorthPane(null);
        initComponents();
        setLayout(new FlowLayout());
    }

    public void limpiar() {
        txtnumiden.setText("");
        cbxtipoiden.setSelectedItem("Seleccione");
    }
    Question iconQuestion = new Question();
    Shocked iconShocked = new Shocked();
    Thinking iconThinking = new Thinking();
    Thinking_uh iconThinking_uh = new Thinking_uh();
    Warning iconWarning = new Warning();
    Checked iconChecked = new Checked();
    Close iconClose = new Close();
    Sad iconSad = new Sad();

    ActiTiempoLibre atl = new ActiTiempoLibre();
//    AccionesExamen aex = new AccionesExamen();
    AntecedentesJudiciales aj = new AntecedentesJudiciales();
    ConsumoBebidas cb = new ConsumoBebidas();
    ConsumoSustancias cs = new ConsumoSustancias();
    DatosPersonales dp = new DatosPersonales();
    DatosPrincipales dpr = new DatosPrincipales();
    EstadoSalud es = new EstadoSalud();
    Falsificacion fa = new Falsificacion();
    HistoriaLaboral hl = new HistoriaLaboral();
    InfoAcademica ia = new InfoAcademica();
    InfoFamiliar infa = new InfoFamiliar();
    InfoFinanciera infi = new InfoFinanciera();
    PlanesInfiltracion pi = new PlanesInfiltracion();
    TecnicaYPreguntas typ = new TecnicaYPreguntas();
    TemaInvestigacion tin = new TemaInvestigacion();
    VinculosPersonas vp = new VinculosPersonas();

    public void buscarDatos() {
        Buscador bs = new Buscador();

        if (DatosPrincipales.getNoIdenExaminado().equals("") || DatosPrincipales.getTipoIdenExaminado().equals("")) {
            JOptionPane.showMessageDialog(null, "¡Debe completar los 2 campos de búsqueda!", "Validación de parámetros", JOptionPane.DEFAULT_OPTION, iconThinking_uh);

        } else {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM  datos_generales_poli WHERE no_id = " + DatosPrincipales.getNoIdenExaminado() + " and t_identificacion = '" + DatosPrincipales.getTipoIdenExaminado() + "'");
                r.next();
                int cantidadr = 0;
                int quantity = r.getRow();
                while (r.next()) {
                    cantidadr++;
                }
                int cantidR = cantidadr + 1;
                System.out.println("La persona tiene " + cantidadr + " más el 1 ess " + cantidR + " registros");
                System.out.println("La persona tiene " + quantity + " registros");
                bs.tipobuscador = "consultas";
                if (cantidR > 1 && quantity == 1) {

                    JOptionPane.showMessageDialog(null, "La persona tiene " + cantidR + " registros");
                    bs.listarRegistros();
                    bs.setVisible(true);

                } else if (cantidadr == 0 && quantity == 1) {

                    JOptionPane.showMessageDialog(null, "La persona tiene un registro");
                    DatoGeneral dage = new DatoGeneral();
                    DatoPersonal daper = new DatoPersonal();

                    MenuPrincipal.na.add(dage);
                    dage.show();

                    DatoGeneral.paratodo.add(daper);
                    daper.show();

                    String tipo_examen = "";
                    String motivo_examen = "";

                    try {
                        PreparedStatement sql = Conexion.connection.prepareStatement("SELECT * FROM datos_generales_poli WHERE no_id = " + DatosPrincipales.getNoIdenExaminado() + " and t_identificacion = '" + DatosPrincipales.getTipoIdenExaminado() + "'");
                        ResultSet rs = sql.executeQuery();
                        rs.next();

                        tipo_examen = rs.getString("tipoexamen");
                        motivo_examen = rs.getString("motivoexamen");

                        DatosPrincipales.setNombreExaminado(rs.getString("nombre"));
                        DatosPrincipales.setTipoIdenExaminado(rs.getString("t_identificacion"));
                        DatosPrincipales.setNoIdenExaminado(rs.getString("no_id"));
                        DatosPersonales.setLugar_exp(rs.getString("lugar_exp"));
                        DatosPersonales.setLugar_naci(rs.getString("lugar_naci"));
                        DatosPersonales.setFecha_nac(rs.getString("fecha_naci"));
                        DatosPersonales.setDireccion(rs.getString("direccion"));
                        DatosPersonales.setBarrio(rs.getString("barrio"));
                        DatosPersonales.setLocalidad(rs.getString("localidad"));
                        DatosPersonales.setEdad(rs.getString("edad"));
                        DatosPersonales.setEstrato(rs.getString("estrato"));
                        DatosPersonales.setTel_fijo(rs.getString("tel_fijo"));
                        DatosPersonales.setTel_celular(rs.getString("tel_celular"));
                        DatosPersonales.setCargoactual(rs.getString("cargoactual"));
                        DatosPersonales.setCargoaspira(rs.getString("cargoaspira"));
                        DatosPersonales.setAreaactual(rs.getString("areaactual"));
                        DatosPersonales.setAreaaspira(rs.getString("areaaspira"));
                        DatosPersonales.setRazon_novedad(rs.getString("razon_novedad"));
                        DatosPersonales.setEmail(rs.getString("email"));
                        DatosPrincipales.setNombreSolicitante(rs.getString("solicitador"));
                        DatosPrincipales.setCargoSolicitante(rs.getString("cargosolicitador"));
                        DatosPrincipales.setNombreUsuario(rs.getString("poligrafista"));
                        DatosPersonales.setGenero(rs.getString("genero"));
//                        DatosPersonales.setFoto_Examen(rs.getString("foto_examen"));
                        EstadoSalud.setEstado_salud(rs.getString("estado_salud"));
                        EstadoSalud.setProb_salud(rs.getString("prob_salud"));
                        EstadoSalud.setProb_salud_descrip(rs.getString("prob_salud_descrip"));
                        InfoFamiliar.setEstado_civil(rs.getString("estado_civil"));
                        InfoFamiliar.setDijovivir(rs.getString("dijovivir"));
                        InfoFamiliar.setFamiliares_aparte(rs.getString("familiares_aparte"));
                        InfoFamiliar.setNom_pareja(rs.getString("nom_pareja"));
                        InfoFamiliar.setFami_ries_soci(rs.getString("fami_ries_soci"));
                        InfoFamiliar.setExpli_fami_ries(rs.getString("expli_fami_ries"));
                        InfoAcademica.setEstaestudiando(rs.getString("estaestudiando"));
                        InfoFinanciera.setSitua_economica(rs.getString("situa_economica"));
                        InfoFinanciera.setTiene_ingre_men(rs.getString("tiene_ingre_men"));
                        InfoFinanciera.setSostiene_eco(rs.getString("sostiene_eco"));
                        InfoFinanciera.setAct_lab_inde(rs.getString("act_lab_inde"));
                        InfoFinanciera.setLabores_indep(rs.getString("labores_indep"));
                        InfoFinanciera.setLiquida_cesan(rs.getString("liquida_cesan"));
                        InfoFinanciera.setCantidad_liquida_cesan(rs.getString("cantidad_liquida_cesan"));
                        InfoFinanciera.setTiene_ahorros(rs.getString("tiene_ahorros"));
                        InfoFinanciera.setCant_ahorros(rs.getString("cant_ahorros"));
                        InfoFinanciera.setApoyo_padres(rs.getString("apoyo_padres"));
                        InfoFinanciera.setDesc_apoyo_padres(rs.getString("desc_apoyo_padres"));
                        InfoFinanciera.setIng_pareja(rs.getString("ing_pareja"));
                        InfoFinanciera.setTotal_ingresos_pareja(rs.getString("total_ingresos_pareja"));
                        InfoFinanciera.setHadembargo(rs.getString("hadembargo"));
                        InfoFinanciera.setExplhadembargo(rs.getString("explhadembargo"));
                        InfoFinanciera.setReportadocr(rs.getString("reportadocr"));
                        InfoFinanciera.setExpreportadocr(rs.getString("expreportadocr"));
                        InfoFinanciera.setTieneobligafinan(rs.getString("tieneobligafinan"));
                        InfoFinanciera.setExploblifinanc(rs.getString("exploblifinanc"));
                        InfoFinanciera.setTienedeuda(rs.getString("tienedeuda"));
                        InfoFinanciera.setExptienedeuda(rs.getString("exptienedeuda"));
                        InfoFinanciera.setGastos_mensuales(rs.getString("gastos_mensuales"));
                        InfoFinanciera.setTienepropi(rs.getString("tienepropi"));
                        InfoFinanciera.setExptienepropi(rs.getString("exptienepropi"));
                        ActiTiempoLibre.setActividadTL1(rs.getString("juegpg1"));
                        ActiTiempoLibre.setActividadTL2(rs.getString("juegpg2"));
                        ActiTiempoLibre.setActividadTL3(rs.getString("expjuegpg2"));
                        ActiTiempoLibre.setActividadTL4(rs.getString("juegpg3"));
                        ActiTiempoLibre.setActividadTL5(rs.getString("expjuegpg3"));
                        ActiTiempoLibre.setActividadTL6(rs.getString("juegpg4"));
                        ActiTiempoLibre.setActividadTL7(rs.getString("expjuegpg4"));
                        ActiTiempoLibre.setActividadTL8(rs.getString("juegpg5"));
                        ActiTiempoLibre.setActividadTL9(rs.getString("expjuegpg5"));
                        ConsumoBebidas.setCon_bebidas(rs.getString("con_bebidas"));
                        ConsumoBebidas.setFrecuencia_bebi(rs.getString("frecuencia_bebi"));
                        ConsumoBebidas.setTipo_bebida(rs.getString("tipo_bebida"));
                        ConsumoBebidas.setCantidad_oca(rs.getString("cantidad_oca"));
                        ConsumoBebidas.setLastvez_consumo(rs.getString("lastvez_consumo"));
                        ConsumoBebidas.setPg1(rs.getString("bebidaspre1"));
                        ConsumoBebidas.setRpg1(rs.getString("expbebidaspre1"));
                        ConsumoBebidas.setPg2(rs.getString("bebidaspre2"));
                        ConsumoBebidas.setRpg2(rs.getString("expbebidaspre2"));
                        ConsumoBebidas.setPg3(rs.getString("bebidaspre3"));
                        ConsumoBebidas.setRpg3(rs.getString("expbebidaspre3"));
                        ConsumoBebidas.setPg4(rs.getString("bebidaspre4"));
                        ConsumoBebidas.setRpg4(rs.getString("expbebidaspre4"));
                        ConsumoBebidas.setPg5(rs.getString("bebidaspre5"));
                        ConsumoBebidas.setRpg5(rs.getString("expbebidaspre5"));
                        ConsumoBebidas.setPg6(rs.getString("bebidaspre6"));
                        ConsumoBebidas.setRpg6(rs.getString("expbebidaspre6"));
                        ConsumoBebidas.setPg7(rs.getString("bebidaspre7"));
                        ConsumoBebidas.setRpg7(rs.getString("expbebidaspre7"));
                        ConsumoBebidas.setPg8(rs.getString("bebidaspre8"));
                        ConsumoBebidas.setRpg8(rs.getString("expbebidaspre8"));
                        ConsumoBebidas.setPg9(rs.getString("bebidaspre9"));
                        ConsumoBebidas.setRpg9(rs.getString("expbebidaspre9"));
                        ConsumoSustancias.setHaconsumido(rs.getString("haconsumido"));
                        ConsumoSustancias.setExphaconsumido(rs.getString("exphaconsumido"));
                        ConsumoSustancias.setDrogaspregun1(rs.getString("drogaspregun1"));
                        ConsumoSustancias.setExpdrogaspregun1(rs.getString("expdrogaspregun1"));
                        ConsumoSustancias.setDrogaspregun2(rs.getString("drogaspregun2"));
                        ConsumoSustancias.setExpdrogaspregun2(rs.getString("expdrogaspregun2"));
                        ConsumoSustancias.setDrogaspregun3(rs.getString("drogaspregun3"));
                        ConsumoSustancias.setExpdrogaspregun3(rs.getString("expdrogaspregun3"));
                        ConsumoSustancias.setDrogaspregun4(rs.getString("drogaspregun4"));
                        ConsumoSustancias.setExpdrogaspregun4(rs.getString("expdrogaspregun4"));
                        ConsumoSustancias.setHaparticipado(rs.getString("haparticinarco"));
                        ConsumoSustancias.setExphaparticipado(rs.getString("exphaparticipado"));
                        ConsumoSustancias.setDrogaspregun5(rs.getString("drogaspregun5"));
                        ConsumoSustancias.setExpdrogaspregun5(rs.getString("expdrogaspregun5"));
                        ConsumoSustancias.setDrogaspregun6(rs.getString("drogaspregun6"));
                        ConsumoSustancias.setExpdrogaspregun6(rs.getString("expdrogaspregun6"));
                        ConsumoSustancias.setDrogaspregun7(rs.getString("drogaspregun7"));
                        ConsumoSustancias.setExpdrogaspregun7(rs.getString("expdrogaspregun7"));
                        ConsumoSustancias.setDrogaspregun8(rs.getString("drogaspregun8"));
                        ConsumoSustancias.setExpdrogaspregun8(rs.getString("expdrogaspregun8"));
                        ConsumoSustancias.setDrogaspregun9(rs.getString("drogaspregun9"));
                        ConsumoSustancias.setExpdrogaspregun9(rs.getString("expdrogaspregun9"));
                        ConsumoSustancias.setDrogaspregun10(rs.getString("drogaspregun10"));
                        ConsumoSustancias.setExpdrogaspregun10(rs.getString("expdrogaspregun10"));
                        ConsumoSustancias.setDrogaspregun11(rs.getString("drogaspregun11"));
                        ConsumoSustancias.setExpdrogaspregun11(rs.getString("expdrogaspregun11"));
                        ConsumoSustancias.setDrogaspregun12(rs.getString("drogaspregun12"));
                        ConsumoSustancias.setExpdrogaspregun12(rs.getString("expdrogaspregun12"));
                        ConsumoSustancias.setDrogaspregun13(rs.getString("drogaspregun13"));
                        ConsumoSustancias.setExpdrogaspregun13(rs.getString("expdrogaspregun13"));
                        AntecedentesJudiciales.setPg1(rs.getString("antecejupre1"));
                        AntecedentesJudiciales.setRpg1(rs.getString("expantecejupre1"));
                        AntecedentesJudiciales.setPg2(rs.getString("antecejupre2"));
                        AntecedentesJudiciales.setRpg2(rs.getString("expantecejupre2"));
                        AntecedentesJudiciales.setPg3(rs.getString("antecejupre3"));
                        AntecedentesJudiciales.setRpg3(rs.getString("expantecejupre3"));
                        AntecedentesJudiciales.setPg4(rs.getString("antecejupre4"));
                        AntecedentesJudiciales.setRpg4(rs.getString("expantecejupre4"));
                        AntecedentesJudiciales.setPg5(rs.getString("expantecejupre5"));
                        AntecedentesJudiciales.setPg6(rs.getString("antecejupre6"));
                        AntecedentesJudiciales.setRpg6(rs.getString("expantecejupre6"));
                        AntecedentesJudiciales.setPg7(rs.getString("antecejupre7"));
                        AntecedentesJudiciales.setRpg7(rs.getString("expantecejupre7"));
                        AntecedentesJudiciales.setPg8(rs.getString("antecejupre8"));
                        AntecedentesJudiciales.setRpg8(rs.getString("expantecejupre8"));
                        AntecedentesJudiciales.setPg9(rs.getString("antecejupre9"));
                        AntecedentesJudiciales.setRpg9(rs.getString("expantecejupre9"));
                        AntecedentesJudiciales.setPg10(rs.getString("antecejupre10"));
                        AntecedentesJudiciales.setRpg10(rs.getString("expantecejupre10"));
                        AntecedentesJudiciales.setPg11(rs.getString("antecejupre11"));
                        AntecedentesJudiciales.setRpg11(rs.getString("expantecejupre11"));
                        AntecedentesJudiciales.setPg12(rs.getString("antecejupre12"));
                        AntecedentesJudiciales.setRpg12(rs.getString("expantecejupre12"));
                        VinculosPersonas.setVinculosmargenley(rs.getString("vinculosmargenley"));
                        VinculosPersonas.setExptipovinculos(rs.getString("exptipovinculos"));
                        VinculosPersonas.setActdelictpre1(rs.getString("actdelictpre1"));
                        VinculosPersonas.setExpactdelictpre1(rs.getString("expactdelictpre1"));
                        VinculosPersonas.setActdelictpre2(rs.getString("actdelictpre2"));
                        VinculosPersonas.setExpactdelictpre2(rs.getString("expactdelictpre2"));
                        VinculosPersonas.setActdelictpre3(rs.getString("actdelictpre3"));
                        VinculosPersonas.setExpactdelictpre3(rs.getString("expactdelictpre3"));
                        VinculosPersonas.setActdelictpre4(rs.getString("actdelictpre4"));
                        VinculosPersonas.setExpactdelictpre4(rs.getString("expactdelictpre4"));
                        VinculosPersonas.setActdelictpre5(rs.getString("actdelictpre5"));
                        VinculosPersonas.setExpactdelictpre5(rs.getString("expactdelictpre5"));
                        VinculosPersonas.setActdelictpre6(rs.getString("actdelictpre6"));
                        VinculosPersonas.setExpactdelictpre6(rs.getString("expactdelictpre6"));
                        VinculosPersonas.setActdelictpre7(rs.getString("actdelictpre7"));
                        VinculosPersonas.setExpactdelictpre7(rs.getString("expactdelictpre7"));
                        Falsificacion.setHvfalsifi(rs.getString("hvfalsifi"));
                        Falsificacion.setExphvfalsifi(rs.getString("exphvfalsifi"));
                        Falsificacion.setDatosfalsospre1(rs.getString("datosfalsospre1"));
                        Falsificacion.setExpdatosfalsospre1(rs.getString("expdatosfalsospre1"));
                        Falsificacion.setDatosfalsospre2(rs.getString("datosfalsospre2"));
                        Falsificacion.setExpdatosfalsospre2(rs.getString("expdatosfalsospre2"));
                        Falsificacion.setPgrutinaope1_(rs.getString("pgrutinaope1_"));
                        Falsificacion.setPgrutinaope1(rs.getString("pgrutinaope1"));
                        Falsificacion.setRpgrutinaope1(rs.getString("rpgrutinaope1"));
                        Falsificacion.setPgrutinaope2(rs.getString("pgrutinaope2"));
                        Falsificacion.setRpgrutinaope2(rs.getString("rpgrutinaope2"));
                        Falsificacion.setPgrutinaope3(rs.getString("pgrutinaope3"));
                        Falsificacion.setRpgrutinaope3(rs.getString("rpgrutinaope3"));
                        Falsificacion.setPgrutinaope4(rs.getString("pgrutinaope4"));
                        Falsificacion.setRpgrutinaope4(rs.getString("rpgrutinaope4"));
                        Falsificacion.setPgrutinaope5(rs.getString("pgrutinaope5"));
                        Falsificacion.setRpgrutinaope5(rs.getString("rpgrutinaope5"));
                        Falsificacion.setPgrutinaope6(rs.getString("pgrutinaope6"));
                        Falsificacion.setRpgrutinaope6(rs.getString("rpgrutinaope6"));
                        Falsificacion.setPgrutinaope7(rs.getString("pgrutinaope7"));
                        Falsificacion.setRpgrutinaope7(rs.getString("rpgrutinaope7"));
                        Falsificacion.setPgrutinaope8(rs.getString("pgrutinaope8"));
                        Falsificacion.setRpgrutinaope8(rs.getString("rpgrutinaope8"));
                        Falsificacion.setPgrutinaope9(rs.getString("pgrutinaope9"));
                        Falsificacion.setRpgrutinaope9(rs.getString("rpgrutinaope9"));
                        Falsificacion.setPgrutinaope10(rs.getString("pgrutinaope10"));
                        Falsificacion.setRpgrutinaope10(rs.getString("rpgrutinaope10"));
                        Falsificacion.setPgrutinaope11(rs.getString("pgrutinaope11"));
                        Falsificacion.setRpgrutinaope11(rs.getString("rpgrutinaope11"));
                        Falsificacion.setPgrutinaope12(rs.getString("pgrutinaope12"));
                        Falsificacion.setRpgrutinaope12(rs.getString("rpgrutinaope12"));
                        Falsificacion.setPgrutinaadmi1(rs.getString("pgrutinaadmi1"));
                        Falsificacion.setPgrutinaadmi2(rs.getString("pgrutinaadmi2"));
//Falsificacion.setRp(rs.getString("rpgrutinaadmi2"));
                        Falsificacion.setPgrutinaadmi3(rs.getString("pgrutinaadmi3"));
                        Falsificacion.setRpgrutinaadmi3(rs.getString("rpgrutinaadmi3"));
                        Falsificacion.setPgrutinaadmi4(rs.getString("pgrutinaadmi4"));
                        Falsificacion.setRpgrutinaadmi4(rs.getString("rpgrutinaadmi4"));
                        Falsificacion.setPgrutinaadmi5(rs.getString("pgrutinaadmi5"));
                        Falsificacion.setRpgrutinaadmi5(rs.getString("rpgrutinaadmi5"));
                        Falsificacion.setPgrutinaadmi6(rs.getString("pgrutinaadmi6"));
                        Falsificacion.setRpgrutinaadmi6(rs.getString("rpgrutinaadmi6"));
                        Falsificacion.setPgrutinaadmi7(rs.getString("pgrutinaadmi7"));
                        Falsificacion.setRpgrutinaadmi7(rs.getString("rpgrutinaadmi7"));
                        Falsificacion.setPgrutinaadmi8(rs.getString("pgrutinaadmi8"));
                        Falsificacion.setRpgrutinaadmi8(rs.getString("rpgrutinaadmi8"));
                        Falsificacion.setPgrutina1(rs.getString("pgrutina1"));
                        Falsificacion.setRpgrutina1(rs.getString("rpgrutina1"));
                        Falsificacion.setPgrutina2(rs.getString("pgrutina2"));
                        Falsificacion.setRpgrutina2(rs.getString("rpgrutina2"));
                        Falsificacion.setPgrutina3(rs.getString("pgrutina3"));
                        Falsificacion.setRpgrutina3(rs.getString("rpgrutina3"));
                        Falsificacion.setPgrutina4(rs.getString("pgrutina4"));
                        Falsificacion.setRpgrutina4(rs.getString("rpgrutina4"));
                        Falsificacion.setPgrutina5(rs.getString("pgrutina5"));
                        Falsificacion.setRpgrutina5(rs.getString("rpgrutina5"));
                        Falsificacion.setPgrutina6(rs.getString("pgrutina6"));
                        Falsificacion.setRpgrutina6(rs.getString("rpgrutina6"));
                        Falsificacion.setPgrutina7(rs.getString("pgrutina7"));
                        Falsificacion.setRpgrutina7(rs.getString("rpgrutina7"));
                        Falsificacion.setPgrutina8(rs.getString("pgrutina8"));
                        Falsificacion.setRpgrutina8(rs.getString("rpgrutina8"));
                        Falsificacion.setPgrutina9(rs.getString("pgrutina9"));
                        Falsificacion.setRpgrutina9(rs.getString("rpgrutina9"));
                        Falsificacion.setPgrutina10(rs.getString("pgrutina10"));
                        Falsificacion.setRpgrutina10(rs.getString("rpgrutina10"));
                        Falsificacion.setPgrutina11(rs.getString("pgrutina11"));
                        Falsificacion.setRpgrutina11(rs.getString("rpgrutina11"));
                        Falsificacion.setPgrutina12(rs.getString("pgrutina12"));
                        Falsificacion.setRpgrutina12(rs.getString("rpgrutina12"));
                        Falsificacion.setPgrutina13(rs.getString("pgrutina13"));
                        Falsificacion.setRpgrutina13(rs.getString("rpgrutina13"));
                        Falsificacion.setPgrutina14(rs.getString("pgrutina14"));
                        Falsificacion.setRpgrutina14(rs.getString("rpgrutina14"));
                        Falsificacion.setPgrutina15(rs.getString("pgrutina15"));
                        Falsificacion.setRpgrutina15(rs.getString("rpgrutina15"));
                        Falsificacion.setPgrutina16(rs.getString("pgrutina16"));
                        Falsificacion.setRpgrutina16(rs.getString("rpgrutina16"));
                        Falsificacion.setPgrutina17(rs.getString("pgrutina17"));
                        Falsificacion.setRpgrutina17(rs.getString("rpgrutina17"));
                        Falsificacion.setPgrutina18(rs.getString("pgrutina18"));
                        Falsificacion.setRpgrutina18(rs.getString("rpgrutina18"));
                        Falsificacion.setPgrutina19(rs.getString("pgrutina19"));
                        Falsificacion.setRpgrutina19(rs.getString("rpgrutina19"));
                        HistoriaLaboral.setEmpleobefore(rs.getString("empleobefore"));
                        HistoriaLaboral.setPeriodosinacla(rs.getString("periodosinacla"));
                        HistoriaLaboral.setDidmalosactos(rs.getString("didmalosactos"));
                        HistoriaLaboral.setExpdidmalosactos(rs.getString("expdidmalosactos"));
                        HistoriaLaboral.setHistorlabopre1(rs.getString("historlabopre1"));
                        HistoriaLaboral.setExphistorlabopre1(rs.getString("exphistorlabopre1"));
                        HistoriaLaboral.setHistorlabopre2(rs.getString("historlabopre2"));
                        HistoriaLaboral.setExphistorlabopre2(rs.getString("exphistorlabopre2"));
                        HistoriaLaboral.setHistorlabopre3(rs.getString("historlabopre3"));
                        HistoriaLaboral.setExphistorlabopre3(rs.getString("exphistorlabopre3"));
                        HistoriaLaboral.setHistorlabopre4(rs.getString("historlabopre4"));
                        HistoriaLaboral.setExphistorlabopre4(rs.getString("exphistorlabopre4"));
                        HistoriaLaboral.setHistorlabopre5(rs.getString("historlabopre5"));
                        HistoriaLaboral.setExphistorlabopre5(rs.getString("exphistorlabopre5"));
                        HistoriaLaboral.setHistorlabopre6(rs.getString("historlabopre6"));
                        HistoriaLaboral.setExphistorlabopre6(rs.getString("exphistorlabopre6"));
                        HistoriaLaboral.setHistorlabopre7(rs.getString("historlabopre7"));
                        HistoriaLaboral.setExphistorlabopre7(rs.getString("exphistorlabopre7"));
                        HistoriaLaboral.setHistorlabopre8(rs.getString("historlabopre8"));
                        HistoriaLaboral.setExphistorlabopre8(rs.getString("exphistorlabopre8"));
                        PlanesInfiltracion.setPlaninfilpre1(rs.getString("planinfilpre1"));
                        PlanesInfiltracion.setExpplaninfilpre1(rs.getString("expplaninfilpre1"));
                        PlanesInfiltracion.setPlaninfilpre2(rs.getString("planinfilpre2"));
                        PlanesInfiltracion.setExpplaninfilpre2(rs.getString("expplaninfilpre2"));
                        PlanesInfiltracion.setPlaninfilpre3(rs.getString("planinfilpre3"));
                        PlanesInfiltracion.setExpplaninfilpre3(rs.getString("expplaninfilpre3"));
                        PlanesInfiltracion.setPlaninfilpre4(rs.getString("planinfilpre4"));
                        PlanesInfiltracion.setExpplaninfilpre4(rs.getString("expplaninfilpre4"));
                        PlanesInfiltracion.setComoseentero(rs.getString("comoseentero"));

                        TecnicaYPreguntas.setRq(rs.getString("rq"));
                        TecnicaYPreguntas.setAdmisiones(rs.getString("admisiones"));
                        TecnicaYPreguntas.setAdmisionPostTest(rs.getString("admisiones_pt"));
                        TecnicaYPreguntas.setTecnicaExamen(rs.getString("tipotecnica"));
                        TecnicaYPreguntas.setSistemaUtilizadoExamen(rs.getString("sistemaExamen"));
                        TecnicaYPreguntas.setDiagnosticoExamen(rs.getString("diagnostico"));
                        DatosPrincipales.setDireccionExamen(rs.getString("direccionexamen"));
                        DatosPrincipales.setCiudadExamen(rs.getString("ciudadexamen"));
                        TecnicaYPreguntas.setEstadoExamen(rs.getString("estadoexamen"));
                        TecnicaYPreguntas.setNombreExamen(rs.getString("nombreExamen"));
                        TecnicaYPreguntas.setColor(rs.getString("color"));
                        TecnicaYPreguntas.setColormalo(rs.getString("estadocolor"));
                        TecnicaYPreguntas.setNotasft(rs.getString("notasft"));
//                        TecnicaYPreguntas.setFechacreacion(rs.getString("fechacreacion"));

                        //validación campos de estadistica
                        ConsumoSustancias duc = new ConsumoSustancias();
                        duc.validacionresultado();

                        DatoPersonal.txtnombre.setText(rs.getString("nombre"));
                        DatoPersonal.cbxtipoiden.setSelectedItem(rs.getString("t_identificacion"));
                        DatoPersonal.txtnoiden.setText(rs.getString("no_id"));
                        DatoPersonal.txtexpedidos.setText(rs.getString("lugar_exp"));
                        DatoPersonal.txtlugarnaci.setText(rs.getString("lugar_naci"));
                        DatoPersonal.fechanaci.setDate(rs.getDate("fecha_naci"));
                        DatoPersonal.txtdireccion.setText(rs.getString("direccion"));
                        DatoPersonal.txtbarrio.setText(rs.getString("barrio"));
                        DatoPersonal.txtlocalidad.setText(rs.getString("localidad"));
                        DatoPersonal.cbxestrato.setSelectedItem(rs.getString("estrato"));
                        DatoPersonal.txtedad.setText(rs.getString("edad"));
                        DatoPersonal.txttelcelu.setText(rs.getString("tel_celular"));
                        DatoPersonal.txttelfijo.setText(rs.getString("tel_fijo"));
                        DatoPersonal.txtemail.setText(rs.getString("email"));
                        DatoPersonal.txtcargoactual.setText(rs.getString("cargoactual"));
                        DatoPersonal.txtareaactual.setText(rs.getString("areaactual"));
                        DatoPersonal.txtcargoaspira.setText(rs.getString("cargoaspira"));
                        DatoPersonal.txtareaaspira.setText(rs.getString("areaaspira"));
                        DatoPersonal.txtpersonasolicitante.setText(rs.getString("solicitador"));
                        String g = rs.getString("genero");
                        if (g.equals("Masculino")) {
                            DatoPersonal.chbxmasculino.setSelected(true);
                        } else if (g.equals("Femenino")) {
                            DatoPersonal.chbxfemenino.setSelected(true);
                        }
                        //xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
                        //validación inicio de Pre.empleo
                        if ("Ingreso".equals(motivo_examen) && "Pre-empleo".equals(tipo_examen)) {

                            this.setVisible(false);

                            if (dage.isVisible()) {

                                JOptionPane.showMessageDialog(null, "¡Datos generales ya se encuentra en uso!", "Validación de parámetros", JOptionPane.DEFAULT_OPTION, iconThinking_uh);

                            } else if (!dage.isVisible()) {

                                int anchoprograma = (na.getWidth());
                                int altoprograma = (na.getHeight());
                                dage.setSize(anchoprograma, altoprograma);
                                MenuPrincipal.na.add(dage);
                                dage.show();
                                DatoGeneral.tituloexamenpre.setText("Examen Pre-Empleo");
                                DatoGeneral.paratodo.add(daper);
                                daper.show();
                                DatosPrincipales.setTipoExamen(tipo_examen);
                                DatoPersonal.jPanel1.setVisible(false);
                                DatoGeneral.btnTerminar.setVisible(false);
                                DatoGeneral.btneditar.setVisible(false);
                                DatoPersonal.txtpersonasolicitante.setText(DatosPrincipales.getNombreSolicitante());
                                DatoPersonal.txtcargosolicitante.setText(DatosPrincipales.getCargoSolicitante());
                                MenuPrincipal.jPanel9.setVisible(false);
                                MenuPrincipal.jPanel10.setVisible(false);
                            }

//                            DatoPersonal.txtareaaspira.setText(txtareaexaminado.getText());
                            DatoPersonal.jPanel1.setVisible(false);
                            DatoPersonal.jPanel3.setVisible(true);

                            DatoGeneral.jLabel2.setVisible(true);//Datos personales
                            DatoGeneral.jLabel3.setVisible(true);//Estado de salud
                            DatoGeneral.jLabel4.setVisible(true);//Info familiar
                            DatoGeneral.jLabel10.setVisible(true);//Info académica
                            DatoGeneral.jLabel5.setVisible(true);//Info financiera
                            DatoGeneral.jLabel13.setVisible(true);//Actvidades tiempo libre
                            DatoGeneral.jLabel6.setVisible(true);//Consumo bebidas
                            DatoGeneral.jLabel7.setVisible(true);//Consumo sustancias
                            DatoGeneral.jLabel8.setVisible(true);//Antecendentes
                            DatoGeneral.jLabel9.setVisible(true);//Vinculos personas
                            DatoGeneral.jLabel11.setVisible(true);//Falsificacion /  Conducta laboral
                            DatoGeneral.jLabel11.setText("Falsificacion");//Falsificacion  Conducta laboral
                            DatoGeneral.jLabel12.setVisible(true);//Historia laboral
                            DatoGeneral.jLabel14.setVisible(true);//Planes infiltracion
                            DatoGeneral.jLabel18.setVisible(false);//Tema bajo investigación
                            DatoGeneral.jLabel15.setVisible(true);//Tecnica empleada
//                            DatoGeneral.jLabel16.setVisible(false);//Admisiones

                            DatoGeneral.jLabel2.setEnabled(true);//Datos personales
                            DatoGeneral.jLabel3.setEnabled(true);//Estado de salud
                            DatoGeneral.jLabel4.setEnabled(false);//Info familiar
                            DatoGeneral.jLabel10.setEnabled(false);//Info académica
                            DatoGeneral.jLabel5.setEnabled(false);//Info financiera
                            DatoGeneral.jLabel13.setEnabled(false);//Actvidades tiempo libre
                            DatoGeneral.jLabel6.setEnabled(false);//Consumo bebidas
                            DatoGeneral.jLabel7.setEnabled(false);//Consumo sustancias
                            DatoGeneral.jLabel8.setEnabled(false);//Antecendentes
                            DatoGeneral.jLabel9.setEnabled(false);//Vinculos personas
                            DatoGeneral.jLabel11.setEnabled(false);//Falsificacion /  Conducta laboral
                            DatoGeneral.jLabel12.setEnabled(false);//Historia laboral
                            DatoGeneral.jLabel14.setEnabled(false);//Planes infiltracion
                            DatoGeneral.jLabel18.setEnabled(false);//Tema bajo investigación
                            DatoGeneral.jLabel15.setEnabled(true);//Tecnica empleada
//                            DatoGeneral.jLabel16.setEnabled(false);//Admisiones

                            DatoGeneral.jLabel2.setForeground(Color.red);//Datos personales
                            DatoGeneral.jLabel3.setForeground(Color.black);//Estado de salud
                            DatoGeneral.jLabel4.setForeground(Color.black);//Info familiar
                            DatoGeneral.jLabel10.setForeground(Color.black);//Info académica
                            DatoGeneral.jLabel5.setForeground(Color.black);//Info financiera
                            DatoGeneral.jLabel13.setForeground(Color.black);//Actvidades tiempo libre
                            DatoGeneral.jLabel6.setForeground(Color.black);//Consumo bebidas
                            DatoGeneral.jLabel7.setForeground(Color.black);//Consumo sustancias
                            DatoGeneral.jLabel8.setForeground(Color.black);//Antecendentes
                            DatoGeneral.jLabel9.setForeground(Color.black);//Vinculos personas
                            DatoGeneral.jLabel11.setForeground(Color.black);//Falsificacion /  Conducta laboral
                            DatoGeneral.jLabel12.setForeground(Color.black);//Historia laboral
                            DatoGeneral.jLabel14.setForeground(Color.black);//Planes infiltracion
                            DatoGeneral.jLabel18.setForeground(Color.black);//Tema bajo investigación
                            DatoGeneral.jLabel15.setForeground(Color.black);//Tecnica empleada
//                            DatoGeneral.jLabel16.setForeground(Color.black);//Admisiones

                            DatoGeneral.fechaizquierda.setVisible(false);
                            DatoGeneral.fechaderecha.setVisible(true);
                            DatoPersonal.cargoactual.setVisible(false);
                            DatoPersonal.txtcargoactual.setVisible(false);
                            DatoPersonal.rtxtcargoactual.setVisible(false);
                            DatoPersonal.areaactual.setVisible(false);
                            DatoPersonal.txtareaactual.setVisible(false);
                            DatoPersonal.rtxtareaactual.setVisible(false);
                            DatoPersonal.cargoaspira.setVisible(true);
                            DatoPersonal.txtcargoaspira.setVisible(true);
                            DatoPersonal.rtxtcargoaspira.setVisible(true);
                            DatoPersonal.areaaspira.setVisible(true);
                            DatoPersonal.txtareaaspira.setVisible(true);
                            DatoPersonal.rtxtareaaspira.setVisible(true);
                            DatoPersonal.personasolicitante.setVisible(true);
                            DatoPersonal.rtxtpersonasolicitante.setVisible(true);

                            DatoGeneral.tituloexamenpre.setVisible(true);
                            DatoGeneral.btnsave.setVisible(true);

                        } else //validación inicio de Rutina operaciones
                        if (("Procedimiento".equals(motivo_examen) && "Rutina (operaciones)".equals(tipo_examen)) || ("Ascenso".equals(motivo_examen) && "Rutina (operaciones)".equals(tipo_examen))) {

                            this.setVisible(false);

                            if (dage.isVisible()) {

                                JOptionPane.showMessageDialog(null, "¡Datos generales ya se encuentra en uso!", "Validación de parámetros", JOptionPane.DEFAULT_OPTION, iconThinking_uh);

                            } else if (!dage.isVisible()) {

                                int anchoprograma = (na.getWidth());
                                int altoprograma = (na.getHeight());
                                dage.setSize(anchoprograma, altoprograma);
                                MenuPrincipal.na.add(dage);
                                dage.show();

                                DatoGeneral.paratodo.add(daper);
                                daper.show();
                                DatosPrincipales.setTipoExamen(tipo_examen);
                                DatoGeneral.btnTerminar.setVisible(false);
                                DatoGeneral.btneditar.setVisible(false);
                                DatoPersonal.txtpersonasolicitante.setText(DatosPrincipales.getNombreSolicitante());
                                DatoPersonal.txtcargosolicitante.setText(DatosPrincipales.getCargoSolicitante());
                                MenuPrincipal.jPanel9.setVisible(false);
                                MenuPrincipal.jPanel10.setVisible(false);

                                if ("Procedimiento".equals(motivo_examen)) {
                                    DatoGeneral.tituloexamenpre.setText("Examen Rutina Operaciones (procedimiento)");
                                    DatoPersonal.jPanel1.setVisible(true);
                                    DatoPersonal.jPanel3.setVisible(false);
                                    DatoPersonal.cargoactual.setVisible(true);
                                    DatoPersonal.txtcargoactual.setVisible(true);
                                    DatoPersonal.rtxtcargoactual.setVisible(true);
                                    DatoPersonal.areaactual.setVisible(true);
                                    DatoPersonal.txtareaactual.setVisible(true);
                                    DatoPersonal.rtxtareaactual.setVisible(true);
                                    DatoPersonal.cargoaspira.setVisible(false);
                                    DatoPersonal.txtcargoaspira.setVisible(false);
                                    DatoPersonal.rtxtcargoaspira.setVisible(false);
                                    DatoPersonal.areaaspira.setVisible(false);
                                    DatoPersonal.txtareaaspira.setVisible(false);
                                    DatoPersonal.rtxtareaaspira.setVisible(false);
                                } else if ("Ascenso".equals(motivo_examen)) {
                                    DatoGeneral.tituloexamenpre.setText("Examen Rutina Operaciones (ascenso)");
                                    DatoPersonal.jPanel1.setVisible(true);
                                    DatoPersonal.jPanel3.setVisible(true);
                                    DatoPersonal.cargoactual.setVisible(true);
                                    DatoPersonal.txtcargoactual.setVisible(true);
                                    DatoPersonal.rtxtcargoactual.setVisible(true);
                                    DatoPersonal.areaactual.setVisible(true);
                                    DatoPersonal.txtareaactual.setVisible(true);
                                    DatoPersonal.rtxtareaactual.setVisible(true);
                                    DatoPersonal.cargoaspira.setVisible(true);
                                    DatoPersonal.txtcargoaspira.setVisible(true);
                                    DatoPersonal.rtxtcargoaspira.setVisible(true);
                                    DatoPersonal.areaaspira.setVisible(true);
                                    DatoPersonal.txtareaaspira.setVisible(true);
                                    DatoPersonal.rtxtareaaspira.setVisible(true);
                                }
                            }

//                            DatoPersonal.txtareaaspira.setText(txtareaexaminado.getText());
                            DatoGeneral.jLabel2.setVisible(true);//Datos personales
                            DatoGeneral.jLabel3.setVisible(true);//Estado de salud
                            DatoGeneral.jLabel4.setVisible(true);//Info familiar
                            DatoGeneral.jLabel10.setVisible(true);//Info académica
                            DatoGeneral.jLabel5.setVisible(true);//Info financiera
                            DatoGeneral.jLabel13.setVisible(true);//Actvidades tiempo libre
                            DatoGeneral.jLabel6.setVisible(true);//Consumo bebidas
                            DatoGeneral.jLabel7.setVisible(true);//Consumo sustancias
                            DatoGeneral.jLabel8.setVisible(true);//Antecendentes
                            DatoGeneral.jLabel9.setVisible(true);//Vinculos personas
                            DatoGeneral.jLabel11.setVisible(true);//Falsificacion /  Conducta laboral
                            DatoGeneral.jLabel12.setVisible(false);//Historia laboral
                            DatoGeneral.jLabel11.setText("Conducta laboral");//Historia laboral
                            DatoGeneral.jLabel14.setVisible(false);//Planes infiltracion
                            DatoGeneral.jLabel18.setVisible(false);//Tema bajo investigación
                            DatoGeneral.jLabel15.setVisible(true);//Tecnica empleada
//                            DatoGeneral.jLabel16.setVisible(false);//Admisiones

                            DatoGeneral.jLabel2.setEnabled(true);//Datos personales
                            DatoGeneral.jLabel3.setEnabled(true);//Estado de salud
                            DatoGeneral.jLabel4.setEnabled(false);//Info familiar
                            DatoGeneral.jLabel10.setEnabled(false);//Info académica
                            DatoGeneral.jLabel5.setEnabled(false);//Info financiera
                            DatoGeneral.jLabel13.setEnabled(false);//Actvidades tiempo libre
                            DatoGeneral.jLabel6.setEnabled(false);//Consumo bebidas
                            DatoGeneral.jLabel7.setEnabled(false);//Consumo sustancias
                            DatoGeneral.jLabel8.setEnabled(false);//Antecendentes
                            DatoGeneral.jLabel9.setEnabled(false);//Vinculos personas
                            DatoGeneral.jLabel11.setEnabled(false);//Falsificacion /  Conducta laboral
                            DatoGeneral.jLabel12.setEnabled(false);//Historia laboral
                            DatoGeneral.jLabel14.setEnabled(false);//Planes infiltracion
                            DatoGeneral.jLabel18.setEnabled(false);//Tema bajo investigación
                            DatoGeneral.jLabel15.setEnabled(false);//Tecnica empleada
//                            DatoGeneral.jLabel16.setEnabled(false);//Admisiones

                            DatoGeneral.jLabel2.setForeground(Color.red);//Datos personales
                            DatoGeneral.jLabel3.setForeground(Color.black);//Estado de salud
                            DatoGeneral.jLabel4.setForeground(Color.black);//Info familiar
                            DatoGeneral.jLabel10.setForeground(Color.black);//Info académica
                            DatoGeneral.jLabel5.setForeground(Color.black);//Info financiera
                            DatoGeneral.jLabel13.setForeground(Color.black);//Actvidades tiempo libre
                            DatoGeneral.jLabel6.setForeground(Color.black);//Consumo bebidas
                            DatoGeneral.jLabel7.setForeground(Color.black);//Consumo sustancias
                            DatoGeneral.jLabel8.setForeground(Color.black);//Antecendentes
                            DatoGeneral.jLabel9.setForeground(Color.black);//Vinculos personas
                            DatoGeneral.jLabel11.setForeground(Color.black);//Falsificacion /  Conducta laboral
                            DatoGeneral.jLabel12.setForeground(Color.black);//Historia laboral
                            DatoGeneral.jLabel14.setForeground(Color.black);//Planes infiltracion
                            DatoGeneral.jLabel18.setForeground(Color.black);//Tema bajo investigación
                            DatoGeneral.jLabel15.setForeground(Color.black);//Tecnica empleada
//                            DatoGeneral.jLabel16.setForeground(Color.black);//Admisiones

                            DatoGeneral.fechaizquierda.setVisible(false);
                            DatoGeneral.fechaderecha.setVisible(true);

                        } else //validación inicio de Rutina administrativos
                        if (("Procedimiento".equals(motivo_examen) && "Rutina (admitivos)".equals(tipo_examen)) || ("Ascenso".equals(tipo_examen) && "Rutina (admitivos)".equals(tipo_examen))) {

                            this.setVisible(false);

                            if (dage.isVisible()) {

                                JOptionPane.showMessageDialog(null, "¡Datos generales ya se encuentra en uso!", "Validación de parámetros", JOptionPane.DEFAULT_OPTION, iconThinking_uh);

                            } else if (!dage.isVisible()) {

                                int anchoprograma = (na.getWidth());
                                int altoprograma = (na.getHeight());
                                dage.setSize(anchoprograma, altoprograma);
                                MenuPrincipal.na.add(dage);
                                dage.show();

                                DatoGeneral.paratodo.add(daper);
                                daper.show();
                                DatosPrincipales.setTipoExamen(tipo_examen);
                                DatoGeneral.btnTerminar.setVisible(false);
                                DatoGeneral.btneditar.setVisible(false);
                                DatoPersonal.txtpersonasolicitante.setText(DatosPrincipales.getNombreSolicitante());
                                DatoPersonal.txtcargosolicitante.setText(DatosPrincipales.getCargoSolicitante());
                                MenuPrincipal.jPanel9.setVisible(false);
                                MenuPrincipal.jPanel10.setVisible(false);

                                if ((motivo_examen).equals("Procedimiento")) {
                                    DatoGeneral.tituloexamenpre.setText("Examen Rutina Administrativos (procedimiento)");
                                    DatoPersonal.jPanel1.setVisible(true);
                                    DatoPersonal.jPanel3.setVisible(false);
                                    DatoPersonal.cargoactual.setVisible(true);
                                    DatoPersonal.txtcargoactual.setVisible(true);
                                    DatoPersonal.rtxtcargoactual.setVisible(true);
                                    DatoPersonal.areaactual.setVisible(true);
                                    DatoPersonal.txtareaactual.setVisible(true);
                                    DatoPersonal.rtxtareaactual.setVisible(true);
                                    DatoPersonal.cargoaspira.setVisible(false);
                                    DatoPersonal.txtcargoaspira.setVisible(false);
                                    DatoPersonal.rtxtcargoaspira.setVisible(false);
                                    DatoPersonal.areaaspira.setVisible(false);
                                    DatoPersonal.txtareaaspira.setVisible(false);
                                    DatoPersonal.rtxtareaaspira.setVisible(false);
                                } else if ((motivo_examen).equals("Ascenso")) {
                                    DatoGeneral.tituloexamenpre.setText("Examen Rutina Administrativos (ascenso)");
                                    DatoPersonal.jPanel1.setVisible(true);
                                    DatoPersonal.jPanel3.setVisible(true);
                                    DatoPersonal.cargoactual.setVisible(true);
                                    DatoPersonal.txtcargoactual.setVisible(true);
                                    DatoPersonal.rtxtcargoactual.setVisible(true);
                                    DatoPersonal.areaactual.setVisible(true);
                                    DatoPersonal.txtareaactual.setVisible(true);
                                    DatoPersonal.rtxtareaactual.setVisible(true);
                                    DatoPersonal.cargoaspira.setVisible(true);
                                    DatoPersonal.txtcargoaspira.setVisible(true);
                                    DatoPersonal.rtxtcargoaspira.setVisible(true);
                                    DatoPersonal.areaaspira.setVisible(true);
                                    DatoPersonal.txtareaaspira.setVisible(true);
                                    DatoPersonal.rtxtareaaspira.setVisible(true);
                                }
                            }

//                            DatoPersonal.txtareaaspira.setText(txtareaexaminado.getText());
                            DatoGeneral.jLabel2.setVisible(true);//Datos personales
                            DatoGeneral.jLabel3.setVisible(true);//Estado de salud
                            DatoGeneral.jLabel4.setVisible(true);//Info familiar
                            DatoGeneral.jLabel10.setVisible(true);//Info académica
                            DatoGeneral.jLabel5.setVisible(true);//Info financiera
                            DatoGeneral.jLabel13.setVisible(true);//Actvidades tiempo libre
                            DatoGeneral.jLabel6.setVisible(true);//Consumo bebidas
                            DatoGeneral.jLabel7.setVisible(true);//Consumo sustancias
                            DatoGeneral.jLabel8.setVisible(true);//Antecendentes
                            DatoGeneral.jLabel9.setVisible(true);//Vinculos personas
                            DatoGeneral.jLabel11.setVisible(true);//Falsificacion /  Conducta laboral
                            DatoGeneral.jLabel12.setVisible(false);//Historia laboral
                            DatoGeneral.jLabel11.setText("Conducta laboral");//Historia laboral
                            DatoGeneral.jLabel14.setVisible(false);//Planes infiltracion
                            DatoGeneral.jLabel18.setVisible(false);//Tema bajo investigación
                            DatoGeneral.jLabel15.setVisible(true);//Tecnica empleada
//                            DatoGeneral.jLabel16.setVisible(false);//Admisiones

                            DatoGeneral.jLabel2.setEnabled(true);//Datos personales
                            DatoGeneral.jLabel3.setEnabled(true);//Estado de salud
                            DatoGeneral.jLabel4.setEnabled(false);//Info familiar
                            DatoGeneral.jLabel10.setEnabled(false);//Info académica
                            DatoGeneral.jLabel5.setEnabled(false);//Info financiera
                            DatoGeneral.jLabel13.setEnabled(false);//Actvidades tiempo libre
                            DatoGeneral.jLabel6.setEnabled(false);//Consumo bebidas
                            DatoGeneral.jLabel7.setEnabled(false);//Consumo sustancias
                            DatoGeneral.jLabel8.setEnabled(false);//Antecendentes
                            DatoGeneral.jLabel9.setEnabled(false);//Vinculos personas
                            DatoGeneral.jLabel11.setEnabled(false);//Falsificacion /  Conducta laboral
                            DatoGeneral.jLabel12.setEnabled(false);//Historia laboral
                            DatoGeneral.jLabel14.setEnabled(false);//Planes infiltracion
                            DatoGeneral.jLabel18.setEnabled(false);//Tema bajo investigación
                            DatoGeneral.jLabel15.setEnabled(false);//Tecnica empleada
//                            DatoGeneral.jLabel16.setEnabled(false);//Admisiones

                            DatoGeneral.jLabel2.setForeground(Color.red);//Datos personales
                            DatoGeneral.jLabel3.setForeground(Color.black);//Estado de salud
                            DatoGeneral.jLabel4.setForeground(Color.black);//Info familiar
                            DatoGeneral.jLabel10.setForeground(Color.black);//Info académica
                            DatoGeneral.jLabel5.setForeground(Color.black);//Info financiera
                            DatoGeneral.jLabel13.setForeground(Color.black);//Actvidades tiempo libre
                            DatoGeneral.jLabel6.setForeground(Color.black);//Consumo bebidas
                            DatoGeneral.jLabel7.setForeground(Color.black);//Consumo sustancias
                            DatoGeneral.jLabel8.setForeground(Color.black);//Antecendentes
                            DatoGeneral.jLabel9.setForeground(Color.black);//Vinculos personas
                            DatoGeneral.jLabel11.setForeground(Color.black);//Falsificacion /  Conducta laboral
                            DatoGeneral.jLabel12.setForeground(Color.black);//Historia laboral
                            DatoGeneral.jLabel14.setForeground(Color.black);//Planes infiltracion
                            DatoGeneral.jLabel18.setForeground(Color.black);//Tema bajo investigación
//                            DatoGeneral.jLabel16.setForeground(Color.black);//Tecnica empleada
                            DatoGeneral.jLabel15.setForeground(Color.black);//Admisiones

                            DatoGeneral.fechaizquierda.setVisible(false);
                            DatoGeneral.fechaderecha.setVisible(true);
                            DatoPersonal.personasolicitante.setVisible(true);
                            DatoPersonal.rtxtpersonasolicitante.setVisible(true);

                        } else //validación inicio de Específico
                        if ("Caso específico".equals(motivo_examen) && "Específico".equals(tipo_examen)) {

                            this.setVisible(false);

                            if (dage.isVisible()) {

                                JOptionPane.showMessageDialog(null, "¡Datos generales ya se encuentra en uso!", "Validación de parámetros", JOptionPane.DEFAULT_OPTION, iconThinking_uh);

                            } else if (!dage.isVisible()) {

                                MenuPrincipal.na.add(dage);
                                dage.show();
                                DatoGeneral.tituloexamenpre.setText("Examen Específico");
                                DatoGeneral.paratodo.add(daper);
                                daper.show();
                                DatosPrincipales.setTipoExamen(tipo_examen);
                                DatoGeneral.btnTerminar.setVisible(false);
                                DatoGeneral.btneditar.setVisible(false);
                                DatoPersonal.txtpersonasolicitante.setText(DatosPrincipales.getNombreSolicitante());
                                DatoPersonal.txtcargosolicitante.setText(DatosPrincipales.getCargoSolicitante());
//                                DatoPersonal.txtareaactual.setText(txtareaexaminado.getText());
                                MenuPrincipal.jPanel9.setVisible(false);
                                MenuPrincipal.jPanel10.setVisible(false);

                            }

                            DatoGeneral.jLabel2.setVisible(true);//Datos personales
                            DatoGeneral.jLabel3.setVisible(true);//Estado de salud
                            DatoGeneral.jLabel4.setVisible(true);//Info familiar
                            DatoGeneral.jLabel10.setVisible(true);//Info académica
                            DatoGeneral.jLabel5.setVisible(true);//Info financiera
                            DatoGeneral.jLabel13.setVisible(false);//Actvidades tiempo libre
                            DatoGeneral.jLabel6.setVisible(true);//Consumo bebidas
                            DatoGeneral.jLabel7.setVisible(true);//Consumo sustancias
                            DatoGeneral.jLabel8.setVisible(true);//Antecendentes
                            DatoGeneral.jLabel9.setVisible(true);//Vinculos personas
                            DatoGeneral.jLabel11.setVisible(false);//Falsificacion /  Conducta laboral
                            DatoGeneral.jLabel12.setVisible(false);//Historia laboral
                            DatoGeneral.jLabel14.setVisible(false);//Planes infiltracion
                            DatoGeneral.jLabel18.setVisible(true);//Tema bajo investigación
                            DatoGeneral.jLabel15.setVisible(true);//Tecnica empleada
//                            DatoGeneral.jLabel16.setVisible(false);//Admisiones

                            DatoGeneral.jLabel2.setForeground(Color.red);
                            DatoGeneral.jLabel3.setForeground(Color.black);
                            DatoGeneral.jLabel4.setForeground(Color.black);
                            DatoGeneral.jLabel10.setForeground(Color.black);
                            DatoGeneral.jLabel5.setForeground(Color.black);
                            DatoGeneral.jLabel6.setForeground(Color.black);
                            DatoGeneral.jLabel7.setForeground(Color.black);
                            DatoGeneral.jLabel8.setForeground(Color.black);
                            DatoGeneral.jLabel9.setForeground(Color.black);
                            DatoGeneral.jLabel18.setForeground(Color.black);
                            DatoGeneral.jLabel15.setForeground(Color.black);

                            DatoGeneral.jLabel2.setEnabled(true);//Datos personales
                            DatoGeneral.jLabel3.setEnabled(true);//Estado de salud
                            DatoGeneral.jLabel4.setEnabled(false);//Info familiar
                            DatoGeneral.jLabel10.setEnabled(false);//Info académica
                            DatoGeneral.jLabel5.setEnabled(false);//Info financiera
                            DatoGeneral.jLabel13.setEnabled(false);//Actvidades tiempo libre
                            DatoGeneral.jLabel6.setEnabled(false);//Consumo bebidas
                            DatoGeneral.jLabel7.setEnabled(false);//Consumo sustancias
                            DatoGeneral.jLabel8.setEnabled(false);//Antecendentes
                            DatoGeneral.jLabel9.setEnabled(false);//Vinculos personas
                            DatoGeneral.jLabel11.setEnabled(false);//Falsificacion /  Conducta laboral
                            DatoGeneral.jLabel12.setEnabled(false);//Historia laboral
                            DatoGeneral.jLabel14.setEnabled(false);//Planes infiltracion
                            DatoGeneral.jLabel18.setEnabled(false);//Tema bajo investigación
                            DatoGeneral.jLabel15.setEnabled(false);//Tecnica empleada
//                            DatoGeneral.jLabel16.setEnabled(false);//Admisiones

                            DatoPersonal.jPanel1.setVisible(true);
                            DatoPersonal.jPanel3.setVisible(false);
                            DatoGeneral.fechaizquierda.setVisible(false);
                            DatoGeneral.fechaderecha.setVisible(true);
                            DatoPersonal.cargoactual.setVisible(true);
                            DatoPersonal.txtcargoactual.setVisible(true);
                            DatoPersonal.rtxtcargoactual.setVisible(true);
                            DatoPersonal.areaactual.setVisible(true);
                            DatoPersonal.txtareaactual.setVisible(true);
                            DatoPersonal.rtxtareaactual.setVisible(true);
                            DatoPersonal.cargoaspira.setVisible(false);
                            DatoPersonal.txtcargoaspira.setVisible(false);
                            DatoPersonal.rtxtcargoaspira.setVisible(false);
                            DatoPersonal.areaaspira.setVisible(false);
                            DatoPersonal.txtareaaspira.setVisible(false);
                            DatoPersonal.rtxtareaaspira.setVisible(false);
                            DatoPersonal.personasolicitante.setVisible(true);
                            DatoPersonal.rtxtpersonasolicitante.setVisible(true);

                        }

                        DatoPersonal.txtnombre.setText(DatosPrincipales.getNombreExaminado());
                        DatoPersonal.cbxtipoiden.setSelectedItem(DatosPrincipales.getTipoIdenExaminado());
                        DatoPersonal.txtnoiden.setText(DatosPrincipales.getNoIdenExaminado());
                        DatosPrincipales.setTipoExamen(tipo_examen);
                        DatosPrincipales.setMotivoExamen(motivo_examen);

                        //xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null, "Error al buscar: " + ex.getMessage());
                    }
                } else if (cantidadr == 0 && quantity < 1) {
                    JOptionPane.showMessageDialog(null, "¡La persona no tiene registro de exámenes!", "Consulta de datos", JOptionPane.INFORMATION_MESSAGE);
                }
            } catch (Exception e) {

            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        txtnumiden = new javax.swing.JTextField();
        tituloexamenpre = new javax.swing.JLabel();
        jPanel22 = new javax.swing.JPanel();
        jLabel70 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel50 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        cbxtipoiden = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(null);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel19.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel19.setText("Número de Identificación:");

        txtnumiden.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtnumiden.setBorder(null);
        txtnumiden.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtnumidenCaretUpdate(evt);
            }
        });
        txtnumiden.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnumidenKeyTyped(evt);
            }
        });

        tituloexamenpre.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        tituloexamenpre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloexamenpre.setText("Consulta de datos");

        jPanel22.setBackground(java.awt.Color.red);
        jPanel22.setForeground(new java.awt.Color(255, 255, 255));
        jPanel22.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel22.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanel22MouseMoved(evt);
            }
        });
        jPanel22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel22MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel22MouseExited(evt);
            }
        });

        jLabel70.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/multiply.png"))); // NOI18N
        jLabel70.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel70MouseMoved(evt);
            }
        });
        jLabel70.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel70MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel70MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel70)
                .addGap(11, 11, 11))
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel70)
                .addContainerGap())
        );

        jLabel29.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jPanel9.setBackground(new java.awt.Color(0, 0, 0));
        jPanel9.setForeground(new java.awt.Color(255, 255, 255));
        jPanel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel9.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanel9MouseMoved(evt);
            }
        });
        jPanel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel9MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel9MouseExited(evt);
            }
        });

        jLabel50.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/little magnifier.png"))); // NOI18N
        jLabel50.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel50MouseMoved(evt);
            }
        });
        jLabel50.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel50MouseExited(evt);
            }
        });

        jLabel47.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(255, 255, 255));
        jLabel47.setText("Buscar");
        jLabel47.setAlignmentX(1.0F);
        jLabel47.setAlignmentY(1.0F);
        jLabel47.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel47MouseMoved(evt);
            }
        });
        jLabel47.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel47MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel50)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel47)
                .addGap(51, 51, 51))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel47)
                    .addComponent(jLabel50))
                .addContainerGap())
        );

        jLabel20.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel20.setText("Tipo de Identificación:");

        cbxtipoiden.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        cbxtipoiden.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "CC", "TI", "CE", "PEP", "PASS" }));
        cbxtipoiden.setBorder(null);
        cbxtipoiden.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cbxtipoiden.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxtipoidenItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tituloexamenpre, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel19)
                                .addGap(28, 28, 28)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                    .addComponent(txtnumiden, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                    .addComponent(cbxtipoiden, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(208, 208, 208)
                                .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel20))))
                .addGap(11, 11, 11))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(tituloexamenpre)
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel19)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtnumiden, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(cbxtipoiden, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel70MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel70MouseMoved
        jPanel22.setBackground(Color.decode("#D50000"));
    }//GEN-LAST:event_jLabel70MouseMoved

    private void jLabel70MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel70MouseExited
        jPanel22.setBackground(Color.red);
    }//GEN-LAST:event_jLabel70MouseExited

    private void jPanel22MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel22MouseMoved
        jPanel22.setBackground(Color.decode("#D50000"));
    }//GEN-LAST:event_jPanel22MouseMoved

    private void jPanel22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel22MouseClicked
        int resp = JOptionPane.showConfirmDialog(null, "¿Esta seguro?", "Alerta!", JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE);
        if (resp == 0) {
            limpiar();
            this.setVisible(false);
        }
    }//GEN-LAST:event_jPanel22MouseClicked

    private void jPanel22MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel22MouseExited
        jPanel22.setBackground(Color.red);
    }//GEN-LAST:event_jPanel22MouseExited

    private void jPanel9MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel9MouseMoved
        jPanel9.setBackground(Color.DARK_GRAY);
    }//GEN-LAST:event_jPanel9MouseMoved

    private void jPanel9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel9MouseExited
        jPanel9.setBackground(Color.black);
    }//GEN-LAST:event_jPanel9MouseExited

    private void jPanel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel9MouseClicked
        buscarDatos();
    }//GEN-LAST:event_jPanel9MouseClicked

    private void txtnumidenKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnumidenKeyTyped
        if ((int) evt.getKeyChar() == KeyEvent.VK_ENTER) {
            buscarDatos();
        }

        int k = (int) evt.getKeyChar();

        if (k >= 32 && k < 48 || k > 57 && k != 127) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "¡Solamente se aceptan números!", "Error de datos ingresados", JOptionPane.ERROR_MESSAGE, iconThinking_uh);
        }

        InputMap map = txtnumiden.getInputMap(JTextField.WHEN_FOCUSED);
        map.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, CTRL_MASK), "null");
    }//GEN-LAST:event_txtnumidenKeyTyped

    private void txtnumidenCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtnumidenCaretUpdate
        DatosPrincipales.setNoIdenExaminado(txtnumiden.getText());
    }//GEN-LAST:event_txtnumidenCaretUpdate

    private void cbxtipoidenItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxtipoidenItemStateChanged
        DatosPrincipales.setTipoIdenExaminado(cbxtipoiden.getSelectedItem().toString());
    }//GEN-LAST:event_cbxtipoidenItemStateChanged

    private void jLabel70MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel70MouseClicked
        int resp = JOptionPane.showConfirmDialog(null, "¿Esta seguro?", "Alerta!", JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE);
        if (resp == 0) {
            limpiar();
            this.setVisible(false);
        }
    }//GEN-LAST:event_jLabel70MouseClicked

    private void jLabel47MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel47MouseMoved
        jPanel9.setBackground(Color.DARK_GRAY);
    }//GEN-LAST:event_jLabel47MouseMoved

    private void jLabel50MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel50MouseMoved
        jPanel9.setBackground(Color.DARK_GRAY);
    }//GEN-LAST:event_jLabel50MouseMoved

    private void jLabel47MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel47MouseExited
        jPanel9.setBackground(Color.BLACK);
    }//GEN-LAST:event_jLabel47MouseExited

    private void jLabel50MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel50MouseExited
        jPanel9.setBackground(Color.BLACK);
    }//GEN-LAST:event_jLabel50MouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JComboBox<String> cbxtipoiden;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel tituloexamenpre;
    public static javax.swing.JTextField txtnumiden;
    // End of variables declaration//GEN-END:variables

}
