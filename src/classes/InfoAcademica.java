package classes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import static view.DatoPersonal.txtnoiden;

/**
 *
 * @author Kevin Casas
 */
public class InfoAcademica {

    SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");
    java.util.Date fecha = new java.util.Date();
    public String fechanow = date.format(fecha);

    private static String primari = "";
    private static String bachille = "";

    private static String tecnic1 = "";
    private static String tecnic2 = "";
    private static String tecnic3 = "";
    private static String tecnic4 = "";

    private static String tecnol1 = "";
    private static String tecnol2 = "";
    private static String tecnol3 = "";
    private static String tecnol4 = "";

    private static String profes1 = "";
    private static String profes2 = "";
    private static String profes3 = "";
    private static String profes4 = "";
    private static String profes5 = "";

    private static String poste1 = "";
    private static String poste2 = "";
    private static String poste3 = "";
    private static String poste4 = "";
    private static String poste5 = "";

    private static String maestr1 = "";
    private static String maestr2 = "";
    private static String maestr3 = "";
    private static String maestr4 = "";

    private static String docto1 = "";
    private static String docto2 = "";

    private static String estaestudiando = "-";

    private static String tipo_escol = "";
    private static String programa = "";
    private static String nom_institucion = "";
    private static String ciudad_inst = "";
    private static String anio_inst = "";

    private static String prim_nom_institucion1 = "";
    private static String prim_ciudad_inst1 = "";
    private static String prim_anio_inst1 = "";

    private static String bachi_tipo_institucion1 = "";
    private static String bachi_nom_institucion1 = "";
    private static String bachi_ciudad_inst1 = "";
    private static String bachi_anio_inst1 = "";

    private static String tecni_tipo_escol1 = "";
    private static String tecni_programa1 = "";
    private static String tecni_nom_institucion1 = "";
    private static String tecni_ciudad_inst1 = "";
    private static String tecni_anio_inst1 = "";
    private static String tecni_tipo_escol2 = "";
    private static String tecni_programa2 = "";
    private static String tecni_nom_institucion2 = "";
    private static String tecni_ciudad_inst2 = "";
    private static String tecni_anio_inst2 = "";
    private static String tecni_tipo_escol3 = "";
    private static String tecni_programa3 = "";
    private static String tecni_nom_institucion3 = "";
    private static String tecni_ciudad_inst3 = "";
    private static String tecni_anio_inst3 = "";
    private static String tecni_tipo_escol4 = "";
    private static String tecni_programa4 = "";
    private static String tecni_nom_institucion4 = "";
    private static String tecni_ciudad_inst4 = "";
    private static String tecni_anio_inst4 = "";

    private static String tecno_tipo_escol1 = "";
    private static String tecno_programa1 = "";
    private static String tecno_nom_institucion1 = "";
    private static String tecno_ciudad_inst1 = "";
    private static String tecno_anio_inst1 = "";
    private static String tecno_tipo_escol2 = "";
    private static String tecno_programa2 = "";
    private static String tecno_nom_institucion2 = "";
    private static String tecno_ciudad_inst2 = "";
    private static String tecno_anio_inst2 = "";
    private static String tecno_tipo_escol3 = "";
    private static String tecno_programa3 = "";
    private static String tecno_nom_institucion3 = "";
    private static String tecno_ciudad_inst3 = "";
    private static String tecno_anio_inst3 = "";
    private static String tecno_tipo_escol4 = "";
    private static String tecno_programa4 = "";
    private static String tecno_nom_institucion4 = "";
    private static String tecno_ciudad_inst4 = "";
    private static String tecno_anio_inst4 = "";

    private static String profe_tipo_escol1 = "";
    private static String profe_programa1 = "";
    private static String profe_nom_institucion1 = "";
    private static String profe_ciudad_inst1 = "";
    private static String profe_anio_inst1 = "";
    private static String profe_tipo_escol2 = "";
    private static String profe_programa2 = "";
    private static String profe_nom_institucion2 = "";
    private static String profe_ciudad_inst2 = "";
    private static String profe_anio_inst2 = "";
    private static String profe_tipo_escol3 = "";
    private static String profe_programa3 = "";
    private static String profe_nom_institucion3 = "";
    private static String profe_ciudad_inst3 = "";
    private static String profe_anio_inst3 = "";
    private static String profe_tipo_escol4 = "";
    private static String profe_programa4 = "";
    private static String profe_nom_institucion4 = "";
    private static String profe_ciudad_inst4 = "";
    private static String profe_anio_inst4 = "";
    private static String profe_tipo_escol5 = "";
    private static String profe_programa5 = "";
    private static String profe_nom_institucion5 = "";
    private static String profe_ciudad_inst5 = "";
    private static String profe_anio_inst5 = "";

    private static String post_tipo_escol1 = "";
    private static String post_programa1 = "";
    private static String post_nom_institucion1 = "";
    private static String post_ciudad_inst1 = "";
    private static String post_anio_inst1 = "";
    private static String post_tipo_escol2 = "";
    private static String post_programa2 = "";
    private static String post_nom_institucion2 = "";
    private static String post_ciudad_inst2 = "";
    private static String post_anio_inst2 = "";
    private static String post_tipo_escol3 = "";
    private static String post_programa3 = "";
    private static String post_nom_institucion3 = "";
    private static String post_ciudad_inst3 = "";
    private static String post_anio_inst3 = "";
    private static String post_tipo_escol4 = "";
    private static String post_programa4 = "";
    private static String post_nom_institucion4 = "";
    private static String post_ciudad_inst4 = "";
    private static String post_anio_inst4 = "";
    private static String post_tipo_escol5 = "";
    private static String post_programa5 = "";
    private static String post_nom_institucion5 = "";
    private static String post_ciudad_inst5 = "";
    private static String post_anio_inst5 = "";

    private static String maes_tipo_escol1 = "";
    private static String maes_programa1 = "";
    private static String maes_nom_institucion1 = "";
    private static String maes_ciudad_inst1 = "";
    private static String maes_anio_inst1 = "";
    private static String maes_tipo_escol2 = "";
    private static String maes_programa2 = "";
    private static String maes_nom_institucion2 = "";
    private static String maes_ciudad_inst2 = "";
    private static String maes_anio_inst2 = "";
    private static String maes_tipo_escol3 = "";
    private static String maes_programa3 = "";
    private static String maes_nom_institucion3 = "";
    private static String maes_ciudad_inst3 = "";
    private static String maes_anio_inst3 = "";
    private static String maes_tipo_escol4 = "";
    private static String maes_programa4 = "";
    private static String maes_nom_institucion4 = "";
    private static String maes_ciudad_inst4 = "";
    private static String maes_anio_inst4 = "";

    private static String doct_tipo_escol1 = "";
    private static String doct_programa1 = "";
    private static String doct_nom_institucion1 = "";
    private static String doct_ciudad_inst1 = "";
    private static String doct_anio_inst1 = "";
    private static String doct_tipo_escol2 = "";
    private static String doct_programa2 = "";
    private static String doct_nom_institucion2 = "";
    private static String doct_ciudad_inst2 = "";
    private static String doct_anio_inst2 = "";

    private static String no_semestre = "";
    private static String nom_prog_acad = "";
    private static String nom_inst_prog_acad = "";
    private static String nom_ciudad_prog = "";
    private static String jorn_prog_acad = "";
    private static String estadoestusus = "";
    private static String explestadoestusus = "";
    private static String aniosuspension = "";

    private static String admisionInfoAcademica = "";

    private static String colorCategoria = "sincolor";

    public static String getColorCategoria() {
        return colorCategoria;
    }

    public static void setColorCategoria(String colorCategoria) {
        InfoAcademica.colorCategoria = colorCategoria;
    }

    public static String getAdmisionInfoAcademica() {
        return admisionInfoAcademica;
    }

    public static void setAdmisionInfoAcademica(String admisionInfoAcademica) {
        InfoAcademica.admisionInfoAcademica = admisionInfoAcademica;
    }

    public static String getPrim_nom_institucion1() {
        return prim_nom_institucion1;
    }

    public static void setPrim_nom_institucion1(String prim_nom_institucion1) {
        InfoAcademica.prim_nom_institucion1 = prim_nom_institucion1;
    }

    public static String getPrim_ciudad_inst1() {
        return prim_ciudad_inst1;
    }

    public static void setPrim_ciudad_inst1(String prim_ciudad_inst1) {
        InfoAcademica.prim_ciudad_inst1 = prim_ciudad_inst1;
    }

    public static String getPrim_anio_inst1() {
        return prim_anio_inst1;
    }

    public static void setPrim_anio_inst1(String prim_anio_inst1) {
        InfoAcademica.prim_anio_inst1 = prim_anio_inst1;
    }

    public static String getBachi_tipo_institucion1() {
        return bachi_tipo_institucion1;
    }

    public static void setBachi_tipo_institucion1(String bachi_tipo_institucion1) {
        InfoAcademica.bachi_tipo_institucion1 = bachi_tipo_institucion1;
    }

    public static String getBachi_nom_institucion1() {
        return bachi_nom_institucion1;
    }

    public static void setBachi_nom_institucion1(String bachi_nom_institucion1) {
        InfoAcademica.bachi_nom_institucion1 = bachi_nom_institucion1;
    }

    public static String getBachi_ciudad_inst1() {
        return bachi_ciudad_inst1;
    }

    public static void setBachi_ciudad_inst1(String bachi_ciudad_inst1) {
        InfoAcademica.bachi_ciudad_inst1 = bachi_ciudad_inst1;
    }

    public static String getBachi_anio_inst1() {
        return bachi_anio_inst1;
    }

    public static void setBachi_anio_inst1(String bachi_anio_inst1) {
        InfoAcademica.bachi_anio_inst1 = bachi_anio_inst1;
    }

    public static String getNo_semestre() {
        return no_semestre;
    }

    public static void setNo_semestre(String no_semestre) {
        InfoAcademica.no_semestre = no_semestre;
    }

    public static String getNom_prog_acad() {
        return nom_prog_acad;
    }

    public static void setNom_prog_acad(String nom_prog_acad) {
        InfoAcademica.nom_prog_acad = nom_prog_acad;
    }

    public static String getNom_inst_prog_acad() {
        return nom_inst_prog_acad;
    }

    public static void setNom_inst_prog_acad(String nom_inst_prog_acad) {
        InfoAcademica.nom_inst_prog_acad = nom_inst_prog_acad;
    }

    public static String getNom_ciudad_prog() {
        return nom_ciudad_prog;
    }

    public static void setNom_ciudad_prog(String nom_ciudad_prog) {
        InfoAcademica.nom_ciudad_prog = nom_ciudad_prog;
    }

    public static String getJorn_prog_acad() {
        return jorn_prog_acad;
    }

    public static void setJorn_prog_acad(String jorn_prog_acad) {
        InfoAcademica.jorn_prog_acad = jorn_prog_acad;
    }

    public static String getEstadoestusus() {
        return estadoestusus;
    }

    public static void setEstadoestusus(String estadoestusus) {
        InfoAcademica.estadoestusus = estadoestusus;
    }

    public static String getExplestadoestusus() {
        return explestadoestusus;
    }

    public static void setExplestadoestusus(String explestadoestusus) {
        InfoAcademica.explestadoestusus = explestadoestusus;
    }

    public static String getAniosuspension() {
        return aniosuspension;
    }

    public static void setAniosuspension(String aniosuspension) {
        InfoAcademica.aniosuspension = aniosuspension;
    }

    public static String getPrimari() {
        return primari;
    }

    public static void setPrimari(String primari) {
        InfoAcademica.primari = primari;
    }

    public static String getBachille() {
        return bachille;
    }

    public static void setBachille(String bachille) {
        InfoAcademica.bachille = bachille;
    }

    public static String getTecnic1() {
        return tecnic1;
    }

    public static void setTecnic1(String tecnic1) {
        InfoAcademica.tecnic1 = tecnic1;
    }

    public static String getTecnic2() {
        return tecnic2;
    }

    public static void setTecnic2(String tecnic2) {
        InfoAcademica.tecnic2 = tecnic2;
    }

    public static String getTecnic3() {
        return tecnic3;
    }

    public static void setTecnic3(String tecnic3) {
        InfoAcademica.tecnic3 = tecnic3;
    }

    public static String getTecnic4() {
        return tecnic4;
    }

    public static void setTecnic4(String tecnic4) {
        InfoAcademica.tecnic4 = tecnic4;
    }

    public static String getTecnol1() {
        return tecnol1;
    }

    public static void setTecnol1(String tecnol1) {
        InfoAcademica.tecnol1 = tecnol1;
    }

    public static String getTecnol2() {
        return tecnol2;
    }

    public static void setTecnol2(String tecnol2) {
        InfoAcademica.tecnol2 = tecnol2;
    }

    public static String getTecnol3() {
        return tecnol3;
    }

    public static void setTecnol3(String tecnol3) {
        InfoAcademica.tecnol3 = tecnol3;
    }

    public static String getTecnol4() {
        return tecnol4;
    }

    public static void setTecnol4(String tecnol4) {
        InfoAcademica.tecnol4 = tecnol4;
    }

    public static String getProfes1() {
        return profes1;
    }

    public static void setProfes1(String profes1) {
        InfoAcademica.profes1 = profes1;
    }

    public static String getProfes2() {
        return profes2;
    }

    public static void setProfes2(String profes2) {
        InfoAcademica.profes2 = profes2;
    }

    public static String getProfes3() {
        return profes3;
    }

    public static void setProfes3(String profes3) {
        InfoAcademica.profes3 = profes3;
    }

    public static String getProfes4() {
        return profes4;
    }

    public static void setProfes4(String profes4) {
        InfoAcademica.profes4 = profes4;
    }

    public static String getProfes5() {
        return profes5;
    }

    public static void setProfes5(String profes5) {
        InfoAcademica.profes5 = profes5;
    }

    public static String getPoste1() {
        return poste1;
    }

    public static void setPoste1(String poste1) {
        InfoAcademica.poste1 = poste1;
    }

    public static String getPoste2() {
        return poste2;
    }

    public static void setPoste2(String poste2) {
        InfoAcademica.poste2 = poste2;
    }

    public static String getPoste3() {
        return poste3;
    }

    public static void setPoste3(String poste3) {
        InfoAcademica.poste3 = poste3;
    }

    public static String getPoste4() {
        return poste4;
    }

    public static void setPoste4(String poste4) {
        InfoAcademica.poste4 = poste4;
    }

    public static String getPoste5() {
        return poste5;
    }

    public static void setPoste5(String poste5) {
        InfoAcademica.poste5 = poste5;
    }

    public static String getMaestr1() {
        return maestr1;
    }

    public static void setMaestr1(String maestr1) {
        InfoAcademica.maestr1 = maestr1;
    }

    public static String getMaestr2() {
        return maestr2;
    }

    public static void setMaestr2(String maestr2) {
        InfoAcademica.maestr2 = maestr2;
    }

    public static String getMaestr3() {
        return maestr3;
    }

    public static void setMaestr3(String maestr3) {
        InfoAcademica.maestr3 = maestr3;
    }

    public static String getMaestr4() {
        return maestr4;
    }

    public static void setMaestr4(String maestr4) {
        InfoAcademica.maestr4 = maestr4;
    }

    public static String getDocto1() {
        return docto1;
    }

    public static void setDocto1(String docto1) {
        InfoAcademica.docto1 = docto1;
    }

    public static String getDocto2() {
        return docto2;
    }

    public static void setDocto2(String docto2) {
        InfoAcademica.docto2 = docto2;
    }

    public static String getEstaestudiando() {
        return estaestudiando;
    }

    public static void setEstaestudiando(String estaestudiando) {
        InfoAcademica.estaestudiando = estaestudiando;
    }

    public static String getTipo_escol() {
        return tipo_escol;
    }

    public static void setTipo_escol(String tipo_escol) {
        InfoAcademica.tipo_escol = tipo_escol;
    }

    public static String getPrograma() {
        return programa;
    }

    public static void setPrograma(String programa) {
        InfoAcademica.programa = programa;
    }

    public static String getNom_institucion() {
        return nom_institucion;
    }

    public static void setNom_institucion(String nom_institucion) {
        InfoAcademica.nom_institucion = nom_institucion;
    }

    public static String getCiudad_inst() {
        return ciudad_inst;
    }

    public static void setCiudad_inst(String ciudad_inst) {
        InfoAcademica.ciudad_inst = ciudad_inst;
    }

    public static String getAnio_inst() {
        return anio_inst;
    }

    public static void setAnio_inst(String anio_inst) {
        InfoAcademica.anio_inst = anio_inst;
    }

    public static String getTecni_tipo_escol1() {
        return tecni_tipo_escol1;
    }

    public static void setTecni_tipo_escol1(String tecni_tipo_escol1) {
        InfoAcademica.tecni_tipo_escol1 = tecni_tipo_escol1;
    }

    public static String getTecni_programa1() {
        return tecni_programa1;
    }

    public static void setTecni_programa1(String tecni_programa1) {
        InfoAcademica.tecni_programa1 = tecni_programa1;
    }

    public static String getTecni_nom_institucion1() {
        return tecni_nom_institucion1;
    }

    public static void setTecni_nom_institucion1(String tecni_nom_institucion1) {
        InfoAcademica.tecni_nom_institucion1 = tecni_nom_institucion1;
    }

    public static String getTecni_ciudad_inst1() {
        return tecni_ciudad_inst1;
    }

    public static void setTecni_ciudad_inst1(String tecni_ciudad_inst1) {
        InfoAcademica.tecni_ciudad_inst1 = tecni_ciudad_inst1;
    }

    public static String getTecni_anio_inst1() {
        return tecni_anio_inst1;
    }

    public static void setTecni_anio_inst1(String tecni_anio_inst1) {
        InfoAcademica.tecni_anio_inst1 = tecni_anio_inst1;
    }

    public static String getTecni_tipo_escol2() {
        return tecni_tipo_escol2;
    }

    public static void setTecni_tipo_escol2(String tecni_tipo_escol2) {
        InfoAcademica.tecni_tipo_escol2 = tecni_tipo_escol2;
    }

    public static String getTecni_programa2() {
        return tecni_programa2;
    }

    public static void setTecni_programa2(String tecni_programa2) {
        InfoAcademica.tecni_programa2 = tecni_programa2;
    }

    public static String getTecni_nom_institucion2() {
        return tecni_nom_institucion2;
    }

    public static void setTecni_nom_institucion2(String tecni_nom_institucion2) {
        InfoAcademica.tecni_nom_institucion2 = tecni_nom_institucion2;
    }

    public static String getTecni_ciudad_inst2() {
        return tecni_ciudad_inst2;
    }

    public static void setTecni_ciudad_inst2(String tecni_ciudad_inst2) {
        InfoAcademica.tecni_ciudad_inst2 = tecni_ciudad_inst2;
    }

    public static String getTecni_anio_inst2() {
        return tecni_anio_inst2;
    }

    public static void setTecni_anio_inst2(String tecni_anio_inst2) {
        InfoAcademica.tecni_anio_inst2 = tecni_anio_inst2;
    }

    public static String getTecni_tipo_escol3() {
        return tecni_tipo_escol3;
    }

    public static void setTecni_tipo_escol3(String tecni_tipo_escol3) {
        InfoAcademica.tecni_tipo_escol3 = tecni_tipo_escol3;
    }

    public static String getTecni_programa3() {
        return tecni_programa3;
    }

    public static void setTecni_programa3(String tecni_programa3) {
        InfoAcademica.tecni_programa3 = tecni_programa3;
    }

    public static String getTecni_nom_institucion3() {
        return tecni_nom_institucion3;
    }

    public static void setTecni_nom_institucion3(String tecni_nom_institucion3) {
        InfoAcademica.tecni_nom_institucion3 = tecni_nom_institucion3;
    }

    public static String getTecni_ciudad_inst3() {
        return tecni_ciudad_inst3;
    }

    public static void setTecni_ciudad_inst3(String tecni_ciudad_inst3) {
        InfoAcademica.tecni_ciudad_inst3 = tecni_ciudad_inst3;
    }

    public static String getTecni_anio_inst3() {
        return tecni_anio_inst3;
    }

    public static void setTecni_anio_inst3(String tecni_anio_inst3) {
        InfoAcademica.tecni_anio_inst3 = tecni_anio_inst3;
    }

    public static String getTecni_tipo_escol4() {
        return tecni_tipo_escol4;
    }

    public static void setTecni_tipo_escol4(String tecni_tipo_escol4) {
        InfoAcademica.tecni_tipo_escol4 = tecni_tipo_escol4;
    }

    public static String getTecni_programa4() {
        return tecni_programa4;
    }

    public static void setTecni_programa4(String tecni_programa4) {
        InfoAcademica.tecni_programa4 = tecni_programa4;
    }

    public static String getTecni_nom_institucion4() {
        return tecni_nom_institucion4;
    }

    public static void setTecni_nom_institucion4(String tecni_nom_institucion4) {
        InfoAcademica.tecni_nom_institucion4 = tecni_nom_institucion4;
    }

    public static String getTecni_ciudad_inst4() {
        return tecni_ciudad_inst4;
    }

    public static void setTecni_ciudad_inst4(String tecni_ciudad_inst4) {
        InfoAcademica.tecni_ciudad_inst4 = tecni_ciudad_inst4;
    }

    public static String getTecni_anio_inst4() {
        return tecni_anio_inst4;
    }

    public static void setTecni_anio_inst4(String tecni_anio_inst4) {
        InfoAcademica.tecni_anio_inst4 = tecni_anio_inst4;
    }

    public static String getTecno_tipo_escol1() {
        return tecno_tipo_escol1;
    }

    public static void setTecno_tipo_escol1(String tecno_tipo_escol1) {
        InfoAcademica.tecno_tipo_escol1 = tecno_tipo_escol1;
    }

    public static String getTecno_programa1() {
        return tecno_programa1;
    }

    public static void setTecno_programa1(String tecno_programa1) {
        InfoAcademica.tecno_programa1 = tecno_programa1;
    }

    public static String getTecno_nom_institucion1() {
        return tecno_nom_institucion1;
    }

    public static void setTecno_nom_institucion1(String tecno_nom_institucion1) {
        InfoAcademica.tecno_nom_institucion1 = tecno_nom_institucion1;
    }

    public static String getTecno_ciudad_inst1() {
        return tecno_ciudad_inst1;
    }

    public static void setTecno_ciudad_inst1(String tecno_ciudad_inst1) {
        InfoAcademica.tecno_ciudad_inst1 = tecno_ciudad_inst1;
    }

    public static String getTecno_anio_inst1() {
        return tecno_anio_inst1;
    }

    public static void setTecno_anio_inst1(String tecno_anio_inst1) {
        InfoAcademica.tecno_anio_inst1 = tecno_anio_inst1;
    }

    public static String getTecno_tipo_escol2() {
        return tecno_tipo_escol2;
    }

    public static void setTecno_tipo_escol2(String tecno_tipo_escol2) {
        InfoAcademica.tecno_tipo_escol2 = tecno_tipo_escol2;
    }

    public static String getTecno_programa2() {
        return tecno_programa2;
    }

    public static void setTecno_programa2(String tecno_programa2) {
        InfoAcademica.tecno_programa2 = tecno_programa2;
    }

    public static String getTecno_nom_institucion2() {
        return tecno_nom_institucion2;
    }

    public static void setTecno_nom_institucion2(String tecno_nom_institucion2) {
        InfoAcademica.tecno_nom_institucion2 = tecno_nom_institucion2;
    }

    public static String getTecno_ciudad_inst2() {
        return tecno_ciudad_inst2;
    }

    public static void setTecno_ciudad_inst2(String tecno_ciudad_inst2) {
        InfoAcademica.tecno_ciudad_inst2 = tecno_ciudad_inst2;
    }

    public static String getTecno_anio_inst2() {
        return tecno_anio_inst2;
    }

    public static void setTecno_anio_inst2(String tecno_anio_inst2) {
        InfoAcademica.tecno_anio_inst2 = tecno_anio_inst2;
    }

    public static String getTecno_tipo_escol3() {
        return tecno_tipo_escol3;
    }

    public static void setTecno_tipo_escol3(String tecno_tipo_escol3) {
        InfoAcademica.tecno_tipo_escol3 = tecno_tipo_escol3;
    }

    public static String getTecno_programa3() {
        return tecno_programa3;
    }

    public static void setTecno_programa3(String tecno_programa3) {
        InfoAcademica.tecno_programa3 = tecno_programa3;
    }

    public static String getTecno_nom_institucion3() {
        return tecno_nom_institucion3;
    }

    public static void setTecno_nom_institucion3(String tecno_nom_institucion3) {
        InfoAcademica.tecno_nom_institucion3 = tecno_nom_institucion3;
    }

    public static String getTecno_ciudad_inst3() {
        return tecno_ciudad_inst3;
    }

    public static void setTecno_ciudad_inst3(String tecno_ciudad_inst3) {
        InfoAcademica.tecno_ciudad_inst3 = tecno_ciudad_inst3;
    }

    public static String getTecno_anio_inst3() {
        return tecno_anio_inst3;
    }

    public static void setTecno_anio_inst3(String tecno_anio_inst3) {
        InfoAcademica.tecno_anio_inst3 = tecno_anio_inst3;
    }

    public static String getTecno_tipo_escol4() {
        return tecno_tipo_escol4;
    }

    public static void setTecno_tipo_escol4(String tecno_tipo_escol4) {
        InfoAcademica.tecno_tipo_escol4 = tecno_tipo_escol4;
    }

    public static String getTecno_programa4() {
        return tecno_programa4;
    }

    public static void setTecno_programa4(String tecno_programa4) {
        InfoAcademica.tecno_programa4 = tecno_programa4;
    }

    public static String getTecno_nom_institucion4() {
        return tecno_nom_institucion4;
    }

    public static void setTecno_nom_institucion4(String tecno_nom_institucion4) {
        InfoAcademica.tecno_nom_institucion4 = tecno_nom_institucion4;
    }

    public static String getTecno_ciudad_inst4() {
        return tecno_ciudad_inst4;
    }

    public static void setTecno_ciudad_inst4(String tecno_ciudad_inst4) {
        InfoAcademica.tecno_ciudad_inst4 = tecno_ciudad_inst4;
    }

    public static String getTecno_anio_inst4() {
        return tecno_anio_inst4;
    }

    public static void setTecno_anio_inst4(String tecno_anio_inst4) {
        InfoAcademica.tecno_anio_inst4 = tecno_anio_inst4;
    }

    public static String getProfe_tipo_escol1() {
        return profe_tipo_escol1;
    }

    public static void setProfe_tipo_escol1(String profe_tipo_escol1) {
        InfoAcademica.profe_tipo_escol1 = profe_tipo_escol1;
    }

    public static String getProfe_programa1() {
        return profe_programa1;
    }

    public static void setProfe_programa1(String profe_programa1) {
        InfoAcademica.profe_programa1 = profe_programa1;
    }

    public static String getProfe_nom_institucion1() {
        return profe_nom_institucion1;
    }

    public static void setProfe_nom_institucion1(String profe_nom_institucion1) {
        InfoAcademica.profe_nom_institucion1 = profe_nom_institucion1;
    }

    public static String getProfe_ciudad_inst1() {
        return profe_ciudad_inst1;
    }

    public static void setProfe_ciudad_inst1(String profe_ciudad_inst1) {
        InfoAcademica.profe_ciudad_inst1 = profe_ciudad_inst1;
    }

    public static String getProfe_anio_inst1() {
        return profe_anio_inst1;
    }

    public static void setProfe_anio_inst1(String profe_anio_inst1) {
        InfoAcademica.profe_anio_inst1 = profe_anio_inst1;
    }

    public static String getProfe_tipo_escol2() {
        return profe_tipo_escol2;
    }

    public static void setProfe_tipo_escol2(String profe_tipo_escol2) {
        InfoAcademica.profe_tipo_escol2 = profe_tipo_escol2;
    }

    public static String getProfe_programa2() {
        return profe_programa2;
    }

    public static void setProfe_programa2(String profe_programa2) {
        InfoAcademica.profe_programa2 = profe_programa2;
    }

    public static String getProfe_nom_institucion2() {
        return profe_nom_institucion2;
    }

    public static void setProfe_nom_institucion2(String profe_nom_institucion2) {
        InfoAcademica.profe_nom_institucion2 = profe_nom_institucion2;
    }

    public static String getProfe_ciudad_inst2() {
        return profe_ciudad_inst2;
    }

    public static void setProfe_ciudad_inst2(String profe_ciudad_inst2) {
        InfoAcademica.profe_ciudad_inst2 = profe_ciudad_inst2;
    }

    public static String getProfe_anio_inst2() {
        return profe_anio_inst2;
    }

    public static void setProfe_anio_inst2(String profe_anio_inst2) {
        InfoAcademica.profe_anio_inst2 = profe_anio_inst2;
    }

    public static String getProfe_tipo_escol3() {
        return profe_tipo_escol3;
    }

    public static void setProfe_tipo_escol3(String profe_tipo_escol3) {
        InfoAcademica.profe_tipo_escol3 = profe_tipo_escol3;
    }

    public static String getProfe_programa3() {
        return profe_programa3;
    }

    public static void setProfe_programa3(String profe_programa3) {
        InfoAcademica.profe_programa3 = profe_programa3;
    }

    public static String getProfe_nom_institucion3() {
        return profe_nom_institucion3;
    }

    public static void setProfe_nom_institucion3(String profe_nom_institucion3) {
        InfoAcademica.profe_nom_institucion3 = profe_nom_institucion3;
    }

    public static String getProfe_ciudad_inst3() {
        return profe_ciudad_inst3;
    }

    public static void setProfe_ciudad_inst3(String profe_ciudad_inst3) {
        InfoAcademica.profe_ciudad_inst3 = profe_ciudad_inst3;
    }

    public static String getProfe_anio_inst3() {
        return profe_anio_inst3;
    }

    public static void setProfe_anio_inst3(String profe_anio_inst3) {
        InfoAcademica.profe_anio_inst3 = profe_anio_inst3;
    }

    public static String getProfe_tipo_escol4() {
        return profe_tipo_escol4;
    }

    public static void setProfe_tipo_escol4(String profe_tipo_escol4) {
        InfoAcademica.profe_tipo_escol4 = profe_tipo_escol4;
    }

    public static String getProfe_programa4() {
        return profe_programa4;
    }

    public static void setProfe_programa4(String profe_programa4) {
        InfoAcademica.profe_programa4 = profe_programa4;
    }

    public static String getProfe_nom_institucion4() {
        return profe_nom_institucion4;
    }

    public static void setProfe_nom_institucion4(String profe_nom_institucion4) {
        InfoAcademica.profe_nom_institucion4 = profe_nom_institucion4;
    }

    public static String getProfe_ciudad_inst4() {
        return profe_ciudad_inst4;
    }

    public static void setProfe_ciudad_inst4(String profe_ciudad_inst4) {
        InfoAcademica.profe_ciudad_inst4 = profe_ciudad_inst4;
    }

    public static String getProfe_anio_inst4() {
        return profe_anio_inst4;
    }

    public static void setProfe_anio_inst4(String profe_anio_inst4) {
        InfoAcademica.profe_anio_inst4 = profe_anio_inst4;
    }

    public static String getProfe_tipo_escol5() {
        return profe_tipo_escol5;
    }

    public static void setProfe_tipo_escol5(String profe_tipo_escol5) {
        InfoAcademica.profe_tipo_escol5 = profe_tipo_escol5;
    }

    public static String getProfe_programa5() {
        return profe_programa5;
    }

    public static void setProfe_programa5(String profe_programa5) {
        InfoAcademica.profe_programa5 = profe_programa5;
    }

    public static String getProfe_nom_institucion5() {
        return profe_nom_institucion5;
    }

    public static void setProfe_nom_institucion5(String profe_nom_institucion5) {
        InfoAcademica.profe_nom_institucion5 = profe_nom_institucion5;
    }

    public static String getProfe_ciudad_inst5() {
        return profe_ciudad_inst5;
    }

    public static void setProfe_ciudad_inst5(String profe_ciudad_inst5) {
        InfoAcademica.profe_ciudad_inst5 = profe_ciudad_inst5;
    }

    public static String getProfe_anio_inst5() {
        return profe_anio_inst5;
    }

    public static void setProfe_anio_inst5(String profe_anio_inst5) {
        InfoAcademica.profe_anio_inst5 = profe_anio_inst5;
    }

    public static String getPost_tipo_escol1() {
        return post_tipo_escol1;
    }

    public static void setPost_tipo_escol1(String post_tipo_escol1) {
        InfoAcademica.post_tipo_escol1 = post_tipo_escol1;
    }

    public static String getPost_programa1() {
        return post_programa1;
    }

    public static void setPost_programa1(String post_programa1) {
        InfoAcademica.post_programa1 = post_programa1;
    }

    public static String getPost_nom_institucion1() {
        return post_nom_institucion1;
    }

    public static void setPost_nom_institucion1(String post_nom_institucion1) {
        InfoAcademica.post_nom_institucion1 = post_nom_institucion1;
    }

    public static String getPost_ciudad_inst1() {
        return post_ciudad_inst1;
    }

    public static void setPost_ciudad_inst1(String post_ciudad_inst1) {
        InfoAcademica.post_ciudad_inst1 = post_ciudad_inst1;
    }

    public static String getPost_anio_inst1() {
        return post_anio_inst1;
    }

    public static void setPost_anio_inst1(String post_anio_inst1) {
        InfoAcademica.post_anio_inst1 = post_anio_inst1;
    }

    public static String getPost_tipo_escol2() {
        return post_tipo_escol2;
    }

    public static void setPost_tipo_escol2(String post_tipo_escol2) {
        InfoAcademica.post_tipo_escol2 = post_tipo_escol2;
    }

    public static String getPost_programa2() {
        return post_programa2;
    }

    public static void setPost_programa2(String post_programa2) {
        InfoAcademica.post_programa2 = post_programa2;
    }

    public static String getPost_nom_institucion2() {
        return post_nom_institucion2;
    }

    public static void setPost_nom_institucion2(String post_nom_institucion2) {
        InfoAcademica.post_nom_institucion2 = post_nom_institucion2;
    }

    public static String getPost_ciudad_inst2() {
        return post_ciudad_inst2;
    }

    public static void setPost_ciudad_inst2(String post_ciudad_inst2) {
        InfoAcademica.post_ciudad_inst2 = post_ciudad_inst2;
    }

    public static String getPost_anio_inst2() {
        return post_anio_inst2;
    }

    public static void setPost_anio_inst2(String post_anio_inst2) {
        InfoAcademica.post_anio_inst2 = post_anio_inst2;
    }

    public static String getPost_tipo_escol3() {
        return post_tipo_escol3;
    }

    public static void setPost_tipo_escol3(String post_tipo_escol3) {
        InfoAcademica.post_tipo_escol3 = post_tipo_escol3;
    }

    public static String getPost_programa3() {
        return post_programa3;
    }

    public static void setPost_programa3(String post_programa3) {
        InfoAcademica.post_programa3 = post_programa3;
    }

    public static String getPost_nom_institucion3() {
        return post_nom_institucion3;
    }

    public static void setPost_nom_institucion3(String post_nom_institucion3) {
        InfoAcademica.post_nom_institucion3 = post_nom_institucion3;
    }

    public static String getPost_ciudad_inst3() {
        return post_ciudad_inst3;
    }

    public static void setPost_ciudad_inst3(String post_ciudad_inst3) {
        InfoAcademica.post_ciudad_inst3 = post_ciudad_inst3;
    }

    public static String getPost_anio_inst3() {
        return post_anio_inst3;
    }

    public static void setPost_anio_inst3(String post_anio_inst3) {
        InfoAcademica.post_anio_inst3 = post_anio_inst3;
    }

    public static String getPost_tipo_escol4() {
        return post_tipo_escol4;
    }

    public static void setPost_tipo_escol4(String post_tipo_escol4) {
        InfoAcademica.post_tipo_escol4 = post_tipo_escol4;
    }

    public static String getPost_programa4() {
        return post_programa4;
    }

    public static void setPost_programa4(String post_programa4) {
        InfoAcademica.post_programa4 = post_programa4;
    }

    public static String getPost_nom_institucion4() {
        return post_nom_institucion4;
    }

    public static void setPost_nom_institucion4(String post_nom_institucion4) {
        InfoAcademica.post_nom_institucion4 = post_nom_institucion4;
    }

    public static String getPost_ciudad_inst4() {
        return post_ciudad_inst4;
    }

    public static void setPost_ciudad_inst4(String post_ciudad_inst4) {
        InfoAcademica.post_ciudad_inst4 = post_ciudad_inst4;
    }

    public static String getPost_anio_inst4() {
        return post_anio_inst4;
    }

    public static void setPost_anio_inst4(String post_anio_inst4) {
        InfoAcademica.post_anio_inst4 = post_anio_inst4;
    }

    public static String getPost_tipo_escol5() {
        return post_tipo_escol5;
    }

    public static void setPost_tipo_escol5(String post_tipo_escol5) {
        InfoAcademica.post_tipo_escol5 = post_tipo_escol5;
    }

    public static String getPost_programa5() {
        return post_programa5;
    }

    public static void setPost_programa5(String post_programa5) {
        InfoAcademica.post_programa5 = post_programa5;
    }

    public static String getPost_nom_institucion5() {
        return post_nom_institucion5;
    }

    public static void setPost_nom_institucion5(String post_nom_institucion5) {
        InfoAcademica.post_nom_institucion5 = post_nom_institucion5;
    }

    public static String getPost_ciudad_inst5() {
        return post_ciudad_inst5;
    }

    public static void setPost_ciudad_inst5(String post_ciudad_inst5) {
        InfoAcademica.post_ciudad_inst5 = post_ciudad_inst5;
    }

    public static String getPost_anio_inst5() {
        return post_anio_inst5;
    }

    public static void setPost_anio_inst5(String post_anio_inst5) {
        InfoAcademica.post_anio_inst5 = post_anio_inst5;
    }

    public static String getMaes_tipo_escol1() {
        return maes_tipo_escol1;
    }

    public static void setMaes_tipo_escol1(String maes_tipo_escol1) {
        InfoAcademica.maes_tipo_escol1 = maes_tipo_escol1;
    }

    public static String getMaes_programa1() {
        return maes_programa1;
    }

    public static void setMaes_programa1(String maes_programa1) {
        InfoAcademica.maes_programa1 = maes_programa1;
    }

    public static String getMaes_nom_institucion1() {
        return maes_nom_institucion1;
    }

    public static void setMaes_nom_institucion1(String maes_nom_institucion1) {
        InfoAcademica.maes_nom_institucion1 = maes_nom_institucion1;
    }

    public static String getMaes_ciudad_inst1() {
        return maes_ciudad_inst1;
    }

    public static void setMaes_ciudad_inst1(String maes_ciudad_inst1) {
        InfoAcademica.maes_ciudad_inst1 = maes_ciudad_inst1;
    }

    public static String getMaes_anio_inst1() {
        return maes_anio_inst1;
    }

    public static void setMaes_anio_inst1(String maes_anio_inst1) {
        InfoAcademica.maes_anio_inst1 = maes_anio_inst1;
    }

    public static String getMaes_tipo_escol2() {
        return maes_tipo_escol2;
    }

    public static void setMaes_tipo_escol2(String maes_tipo_escol2) {
        InfoAcademica.maes_tipo_escol2 = maes_tipo_escol2;
    }

    public static String getMaes_programa2() {
        return maes_programa2;
    }

    public static void setMaes_programa2(String maes_programa2) {
        InfoAcademica.maes_programa2 = maes_programa2;
    }

    public static String getMaes_nom_institucion2() {
        return maes_nom_institucion2;
    }

    public static void setMaes_nom_institucion2(String maes_nom_institucion2) {
        InfoAcademica.maes_nom_institucion2 = maes_nom_institucion2;
    }

    public static String getMaes_ciudad_inst2() {
        return maes_ciudad_inst2;
    }

    public static void setMaes_ciudad_inst2(String maes_ciudad_inst2) {
        InfoAcademica.maes_ciudad_inst2 = maes_ciudad_inst2;
    }

    public static String getMaes_anio_inst2() {
        return maes_anio_inst2;
    }

    public static void setMaes_anio_inst2(String maes_anio_inst2) {
        InfoAcademica.maes_anio_inst2 = maes_anio_inst2;
    }

    public static String getMaes_tipo_escol3() {
        return maes_tipo_escol3;
    }

    public static void setMaes_tipo_escol3(String maes_tipo_escol3) {
        InfoAcademica.maes_tipo_escol3 = maes_tipo_escol3;
    }

    public static String getMaes_programa3() {
        return maes_programa3;
    }

    public static void setMaes_programa3(String maes_programa3) {
        InfoAcademica.maes_programa3 = maes_programa3;
    }

    public static String getMaes_nom_institucion3() {
        return maes_nom_institucion3;
    }

    public static void setMaes_nom_institucion3(String maes_nom_institucion3) {
        InfoAcademica.maes_nom_institucion3 = maes_nom_institucion3;
    }

    public static String getMaes_ciudad_inst3() {
        return maes_ciudad_inst3;
    }

    public static void setMaes_ciudad_inst3(String maes_ciudad_inst3) {
        InfoAcademica.maes_ciudad_inst3 = maes_ciudad_inst3;
    }

    public static String getMaes_anio_inst3() {
        return maes_anio_inst3;
    }

    public static void setMaes_anio_inst3(String maes_anio_inst3) {
        InfoAcademica.maes_anio_inst3 = maes_anio_inst3;
    }

    public static String getMaes_tipo_escol4() {
        return maes_tipo_escol4;
    }

    public static void setMaes_tipo_escol4(String maes_tipo_escol4) {
        InfoAcademica.maes_tipo_escol4 = maes_tipo_escol4;
    }

    public static String getMaes_programa4() {
        return maes_programa4;
    }

    public static void setMaes_programa4(String maes_programa4) {
        InfoAcademica.maes_programa4 = maes_programa4;
    }

    public static String getMaes_nom_institucion4() {
        return maes_nom_institucion4;
    }

    public static void setMaes_nom_institucion4(String maes_nom_institucion4) {
        InfoAcademica.maes_nom_institucion4 = maes_nom_institucion4;
    }

    public static String getMaes_ciudad_inst4() {
        return maes_ciudad_inst4;
    }

    public static void setMaes_ciudad_inst4(String maes_ciudad_inst4) {
        InfoAcademica.maes_ciudad_inst4 = maes_ciudad_inst4;
    }

    public static String getMaes_anio_inst4() {
        return maes_anio_inst4;
    }

    public static void setMaes_anio_inst4(String maes_anio_inst4) {
        InfoAcademica.maes_anio_inst4 = maes_anio_inst4;
    }

    public static String getDoct_tipo_escol1() {
        return doct_tipo_escol1;
    }

    public static void setDoct_tipo_escol1(String doct_tipo_escol1) {
        InfoAcademica.doct_tipo_escol1 = doct_tipo_escol1;
    }

    public static String getDoct_programa1() {
        return doct_programa1;
    }

    public static void setDoct_programa1(String doct_programa1) {
        InfoAcademica.doct_programa1 = doct_programa1;
    }

    public static String getDoct_nom_institucion1() {
        return doct_nom_institucion1;
    }

    public static void setDoct_nom_institucion1(String doct_nom_institucion1) {
        InfoAcademica.doct_nom_institucion1 = doct_nom_institucion1;
    }

    public static String getDoct_ciudad_inst1() {
        return doct_ciudad_inst1;
    }

    public static void setDoct_ciudad_inst1(String doct_ciudad_inst1) {
        InfoAcademica.doct_ciudad_inst1 = doct_ciudad_inst1;
    }

    public static String getDoct_anio_inst1() {
        return doct_anio_inst1;
    }

    public static void setDoct_anio_inst1(String doct_anio_inst1) {
        InfoAcademica.doct_anio_inst1 = doct_anio_inst1;
    }

    public static String getDoct_tipo_escol2() {
        return doct_tipo_escol2;
    }

    public static void setDoct_tipo_escol2(String doct_tipo_escol2) {
        InfoAcademica.doct_tipo_escol2 = doct_tipo_escol2;
    }

    public static String getDoct_programa2() {
        return doct_programa2;
    }

    public static void setDoct_programa2(String doct_programa2) {
        InfoAcademica.doct_programa2 = doct_programa2;
    }

    public static String getDoct_nom_institucion2() {
        return doct_nom_institucion2;
    }

    public static void setDoct_nom_institucion2(String doct_nom_institucion2) {
        InfoAcademica.doct_nom_institucion2 = doct_nom_institucion2;
    }

    public static String getDoct_ciudad_inst2() {
        return doct_ciudad_inst2;
    }

    public static void setDoct_ciudad_inst2(String doct_ciudad_inst2) {
        InfoAcademica.doct_ciudad_inst2 = doct_ciudad_inst2;
    }

    public static String getDoct_anio_inst2() {
        return doct_anio_inst2;
    }

    public static void setDoct_anio_inst2(String doct_anio_inst2) {
        InfoAcademica.doct_anio_inst2 = doct_anio_inst2;
    }

    public void validarprimaria() {
        if ("hayprim".equals(primari)) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM  escolaridades_poli WHERE no_id = " + txtnoiden.getText() + " AND tipo_escol = 'Primaria'");
                r.next();

                int cune = r.getRow();

                if (cune == 0) {
                    try {
                        PreparedStatement sqlestud = Conexion.connection.prepareStatement("INSERT INTO escolaridades_poli "
                                + "(no_id, tipo_escol, nom_institucion, ciudad_inst, anio_inst, fechacreacion)"
                                + " VALUES (?,?,?,?,?,?)");
                        sqlestud.setString(1, txtnoiden.getText());
                        sqlestud.setString(2, "Primaria");
                        sqlestud.setString(3, prim_nom_institucion1);
                        sqlestud.setString(4, prim_ciudad_inst1);
                        sqlestud.setString(5, prim_anio_inst1);
                        sqlestud.setString(6, fechanow);
                        sqlestud.executeUpdate();
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, "¡Error! No se agregaron los datos de primaria " + e);
                    }
                } else {

                    try {
                        PreparedStatement sqlacade = Conexion.connection.prepareStatement("UPDATE escolaridades_poli "
                                + "SET tipo_escol = 'Primaria', nom_institucion = '" + prim_nom_institucion1 + "',"
                                + " ciudad_inst = '" + prim_ciudad_inst1 + "', anio_inst = '" + prim_anio_inst1 + "'  WHERE no_id = " + txtnoiden.getText() + "  AND tipo_escol = 'Primaria'");
                        sqlacade.executeUpdate();
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, "¡Error! No se actualizaron los datos de primaria " + e);
                    }
                }

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "¡Error! No se agregaron los datos de primaria 2 " + e);
            }

        } else if ("nohay".equals(primari)) {

            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM  escolaridades_poli WHERE no_id = " + txtnoiden.getText() + " AND tipo_escol = 'Primaria'");
                r.next();

                int cune = r.getRow();

                if (cune > 0) {
                    try {
                        PreparedStatement sqlacade = Conexion.connection.prepareStatement("DELETE FROM escolaridades_poli   WHERE no_id = " + txtnoiden.getText() + " AND tipo_escol = 'Primaria' ");
                        sqlacade.executeUpdate();
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, "¡Error! No se eliminaron los datos de primaria " + e);
                    }
                }
            } catch (SQLException e) {
            }
        }
    }

    public void validarbachiller() {
        if ("haybachi".equals(bachille)) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM  escolaridades_poli WHERE no_id = " + txtnoiden.getText() + " AND tipo_escol = 'Bachiller'");
                r.next();

                int cune = r.getRow();

                if (cune == 0) {
                    try {
                        PreparedStatement sqlestud = Conexion.connection.prepareStatement("INSERT INTO escolaridades_poli "
                                + "(no_id, tipo_escol, programa, nom_institucion, ciudad_inst, anio_inst, fechacreacion)"
                                + " VALUES (?,?,?,?,?,?,?)");
                        sqlestud.setString(1, txtnoiden.getText());
                        sqlestud.setString(2, "Bachiller");
                        sqlestud.setString(3, bachi_tipo_institucion1);
                        sqlestud.setString(4, bachi_nom_institucion1);
                        sqlestud.setString(5, bachi_ciudad_inst1);
                        sqlestud.setString(6, bachi_anio_inst1);
                        sqlestud.setString(7, fechanow);
                        sqlestud.executeUpdate();
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, "¡Error! No se agregaron los datos de bachiller " + e);
                    }
                } else {

                    try {
                        PreparedStatement sqlacade = Conexion.connection.prepareStatement("UPDATE escolaridades_poli "
                                + "SET tipo_escol = 'Bachiller', programa = '" + bachi_tipo_institucion1 + "', nom_institucion = '" + bachi_nom_institucion1 + "',"
                                + " ciudad_inst = '" + bachi_ciudad_inst1 + "', anio_inst = '" + bachi_anio_inst1 + "'  WHERE no_id = " + txtnoiden.getText() + "  AND tipo_escol = 'Bachiller'");
                        sqlacade.executeUpdate();
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, "¡Error! No se actualizaron los datos de bachiller " + e);
                    }

                }

            } catch (SQLException e) {

            }

        } else if ("nohay".equals(bachille)) {

            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM  escolaridades_poli WHERE no_id = " + txtnoiden.getText() + " AND tipo_escol = 'Bachiller'");
                r.next();

                int cune = r.getRow();

                if (cune > 0) {
                    try {
                        PreparedStatement sqlacade = Conexion.connection.prepareStatement("DELETE FROM escolaridades_poli   WHERE no_id = " + txtnoiden.getText() + " AND tipo_escol = 'Bachiller' ");
                        sqlacade.executeUpdate();
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, "¡Error! No se elliminaron los datos de bachiller " + e);
                    }
                }
            } catch (SQLException e) {
            }
        }
    }

    public void validartecnico() {

        //con los 4
        if ("haytecni".equals(tecnic1) && "haytecni2".equals(tecnic2) && "haytecni3".equals(tecnic3) && "haytecni4".equals(tecnic4)) {

            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM  escolaridades_poli WHERE no_id = " + txtnoiden.getText() + " AND tipo_escol = 'Técnico'");
                r.next();

                int cune = r.getRow();

                if (cune == 0) {
                    try {
                        PreparedStatement sqlestud = Conexion.connection.prepareStatement("INSERT INTO escolaridades_poli "
                                + "(no_id, tipo_escol, programa, nom_institucion, ciudad_inst, anio_inst, fechacreacion)"
                                + " VALUES (?,?,?,?,?,?,?)");
                        sqlestud.setString(1, txtnoiden.getText());
                        sqlestud.setString(2, "Técnico");
                        sqlestud.setString(3, tecni_programa1);
                        sqlestud.setString(4, tecni_nom_institucion1);
                        sqlestud.setString(5, tecni_ciudad_inst1);
                        sqlestud.setString(6, tecni_anio_inst1);
                        sqlestud.setString(7, fechanow);
                        sqlestud.executeUpdate();
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, "¡Error! No se insertaron los datos de 4 técnico(1) " + e);
                    }

                    try {
                        PreparedStatement sqlestud = Conexion.connection.prepareStatement("INSERT INTO escolaridades_poli "
                                + "(no_id, tipo_escol, programa, nom_institucion, ciudad_inst, anio_inst, fechacreacion)"
                                + " VALUES (?,?,?,?,?,?,?)");
                        sqlestud.setString(1, txtnoiden.getText());
                        sqlestud.setString(2, "Técnico");
                        sqlestud.setString(3, tecni_programa2);
                        sqlestud.setString(4, tecni_nom_institucion2);
                        sqlestud.setString(5, tecni_ciudad_inst2);
                        sqlestud.setString(6, tecni_anio_inst2);
                        sqlestud.setString(7, fechanow);
                        sqlestud.executeUpdate();
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, "¡Error! No se insertaron los datos de 4 técnico(2) " + e);
                    }

                    try {
                        PreparedStatement sqlestud = Conexion.connection.prepareStatement("INSERT INTO escolaridades_poli "
                                + "(no_id, tipo_escol, programa, nom_institucion, ciudad_inst, anio_inst, fechacreacion)"
                                + " VALUES (?,?,?,?,?,?,?)");
                        sqlestud.setString(1, txtnoiden.getText());
                        sqlestud.setString(2, "Técnico");
                        sqlestud.setString(3, tecni_programa3);
                        sqlestud.setString(4, tecni_nom_institucion3);
                        sqlestud.setString(5, tecni_ciudad_inst3);
                        sqlestud.setString(6, tecni_anio_inst3);
                        sqlestud.setString(7, fechanow);
                        sqlestud.executeUpdate();
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, "¡Error! No se insertaron los datos de 4 técnico (3) " + e);
                    }

                    try {
                        PreparedStatement sqlestud = Conexion.connection.prepareStatement("INSERT INTO escolaridades_poli "
                                + "(no_id, tipo_escol, programa, nom_institucion, ciudad_inst, anio_inst, fechacreacion)"
                                + " VALUES (?,?,?,?,?,?,?)");
                        sqlestud.setString(1, txtnoiden.getText());
                        sqlestud.setString(2, "Técnico");
                        sqlestud.setString(3, tecni_programa4);
                        sqlestud.setString(4, tecni_nom_institucion4);
                        sqlestud.setString(5, tecni_ciudad_inst4);
                        sqlestud.setString(6, tecni_anio_inst4);
                        sqlestud.setString(7, fechanow);
                        sqlestud.executeUpdate();
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, "¡Error! No se insertaron los datos de 4 técnico(4) " + e);
                    }
                } else {

                    try {
                        PreparedStatement sqlacade = Conexion.connection.prepareStatement("DELETE FROM escolaridades_poli WHERE no_id = " + txtnoiden.getText() + " AND tipo_escol = 'Técnico' ");
                        sqlacade.executeUpdate();
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, "¡Error! No se eliminaron los datos de Técnico (4) antes de update " + e);
                    }

                    try {
                        PreparedStatement sqlestud = Conexion.connection.prepareStatement("INSERT INTO escolaridades_poli "
                                + "(no_id, tipo_escol, programa, nom_institucion, ciudad_inst, anio_inst, fechacreacion)"
                                + " VALUES (?,?,?,?,?,?,?)");
                        sqlestud.setString(1, txtnoiden.getText());
                        sqlestud.setString(2, "Técnico");
                        sqlestud.setString(3, tecni_programa1);
                        sqlestud.setString(4, tecni_nom_institucion1);
                        sqlestud.setString(5, tecni_ciudad_inst1);
                        sqlestud.setString(6, tecni_anio_inst1);
                        sqlestud.setString(7, fechanow);
                        sqlestud.executeUpdate();
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, "¡Error! No se actualizaron los datos de 4 técnico(1) " + e);
                    }

                    try {
                        PreparedStatement sqlestud = Conexion.connection.prepareStatement("INSERT INTO escolaridades_poli "
                                + "(no_id, tipo_escol, programa, nom_institucion, ciudad_inst, anio_inst, fechacreacion)"
                                + " VALUES (?,?,?,?,?,?,?)");
                        sqlestud.setString(1, txtnoiden.getText());
                        sqlestud.setString(2, "Técnico");
                        sqlestud.setString(3, tecni_programa2);
                        sqlestud.setString(4, tecni_nom_institucion2);
                        sqlestud.setString(5, tecni_ciudad_inst2);
                        sqlestud.setString(6, tecni_anio_inst2);
                        sqlestud.setString(7, fechanow);
                        sqlestud.executeUpdate();
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, "¡Error! No se actualizaron los datos de 4 técnico(2) " + e);
                    }

                    try {

                        //DESDE acá cuando hay más
                        PreparedStatement sqlestud = Conexion.connection.prepareStatement("INSERT INTO escolaridades_poli "
                                + "(no_id, tipo_escol, programa, nom_institucion, ciudad_inst, anio_inst, fechacreacion)"
                                + " VALUES (?,?,?,?,?,?,?)");
                        sqlestud.setString(1, txtnoiden.getText());
                        sqlestud.setString(2, "Técnico");
                        sqlestud.setString(3, tecni_programa3);
                        sqlestud.setString(4, tecni_nom_institucion3);
                        sqlestud.setString(5, tecni_ciudad_inst3);
                        sqlestud.setString(6, tecni_anio_inst3);
                        sqlestud.setString(7, fechanow);
                        sqlestud.executeUpdate();
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, "¡Error! No se actualizaron los datos de 4 técnico(3) " + e);
                    }

                    try {

                        //DESDE acá cuando hay más
                        PreparedStatement sqlestud = Conexion.connection.prepareStatement("INSERT INTO escolaridades_poli "
                                + "(no_id, tipo_escol, programa, nom_institucion, ciudad_inst, anio_inst, fechacreacion)"
                                + " VALUES (?,?,?,?,?,?,?)");
                        sqlestud.setString(1, txtnoiden.getText());
                        sqlestud.setString(2, "Técnico");
                        sqlestud.setString(3, tecni_programa4);
                        sqlestud.setString(4, tecni_nom_institucion4);
                        sqlestud.setString(5, tecni_ciudad_inst4);
                        sqlestud.setString(6, tecni_anio_inst4);
                        sqlestud.setString(7, fechanow);
                        sqlestud.executeUpdate();
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, "¡Error! No se actualizaron los datos de 4 técnico(4) " + e);
                    }
                }
            } catch (SQLException e) {

            }

        } else //con los 3
        if ("haytecni".equals(tecnic1) && "haytecni2".equals(tecnic2) && "haytecni3".equals(tecnic3)) {
            System.out.println("debe insertar porque pasa");
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM  escolaridades_poli WHERE no_id = " + txtnoiden.getText() + " AND tipo_escol = 'Técnico'");
                r.next();

                int cune = r.getRow();

                if (cune == 0) {
                    try {

                        //DESDE acá cuando hay más
                        PreparedStatement sqlestud = Conexion.connection.prepareStatement("INSERT INTO escolaridades_poli "
                                + "(no_id, tipo_escol, programa, nom_institucion, ciudad_inst, anio_inst, fechacreacion)"
                                + " VALUES (?,?,?,?,?,?,?)");
                        sqlestud.setString(1, txtnoiden.getText());
                        sqlestud.setString(2, "Técnico");
                        sqlestud.setString(3, tecni_programa1);
                        sqlestud.setString(4, tecni_nom_institucion1);
                        sqlestud.setString(5, tecni_ciudad_inst1);
                        sqlestud.setString(6, tecni_anio_inst1);
                        sqlestud.setString(7, fechanow);
                        sqlestud.executeUpdate();
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, "¡Error! No se insertaron los datos de 3 técnico(1) " + e);
                    }

                    try {

                        //DESDE acá cuando hay más
                        PreparedStatement sqlestud = Conexion.connection.prepareStatement("INSERT INTO escolaridades_poli "
                                + "(no_id, tipo_escol, programa, nom_institucion, ciudad_inst, anio_inst, fechacreacion)"
                                + " VALUES (?,?,?,?,?,?,?)");
                        sqlestud.setString(1, txtnoiden.getText());
                        sqlestud.setString(2, "Técnico");
                        sqlestud.setString(3, tecni_programa2);
                        sqlestud.setString(4, tecni_nom_institucion2);
                        sqlestud.setString(5, tecni_ciudad_inst2);
                        sqlestud.setString(6, tecni_anio_inst2);
                        sqlestud.setString(7, fechanow);
                        sqlestud.executeUpdate();
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, "¡Error! No se insertaron los datos de 3 técnico(2) " + e);
                    }

                    try {

                        //DESDE acá cuando hay más
                        System.out.println("el maldito segundo dato");
                        PreparedStatement sqlestud = Conexion.connection.prepareStatement("INSERT INTO escolaridades_poli "
                                + "(no_id, tipo_escol, programa, nom_institucion, ciudad_inst, anio_inst, fechacreacion)"
                                + " VALUES (?,?,?,?,?,?,?)");
                        sqlestud.setString(1, txtnoiden.getText());
                        sqlestud.setString(2, "Técnico");
                        sqlestud.setString(3, tecni_programa3);
                        sqlestud.setString(4, tecni_nom_institucion3);
                        sqlestud.setString(5, tecni_ciudad_inst3);
                        sqlestud.setString(6, tecni_anio_inst3);
                        sqlestud.setString(7, fechanow);
                        sqlestud.executeUpdate();
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, "¡Error! No se insertaron los datos de 3 técnico(3) " + e);
                    }

                } else {

                    try {
                        PreparedStatement sqlacade = Conexion.connection.prepareStatement("DELETE FROM escolaridades_poli WHERE no_id = " + txtnoiden.getText() + " AND tipo_escol = 'Técnico'");
                        sqlacade.executeUpdate();
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, "¡Error! No se eliminaron los datos de Técnico (3) antes de update " + e);
                    }

                    try {

                        //DESDE acá cuando hay más
                        PreparedStatement sqlestud = Conexion.connection.prepareStatement("INSERT INTO escolaridades_poli "
                                + "(no_id, tipo_escol, programa, nom_institucion, ciudad_inst, anio_inst, fechacreacion)"
                                + " VALUES (?,?,?,?,?,?,?)");
                        sqlestud.setString(1, txtnoiden.getText());
                        sqlestud.setString(2, "Técnico");
                        sqlestud.setString(3, tecni_programa1);
                        sqlestud.setString(4, tecni_nom_institucion1);
                        sqlestud.setString(5, tecni_ciudad_inst1);
                        sqlestud.setString(6, tecni_anio_inst1);
                        sqlestud.setString(7, fechanow);
                        sqlestud.executeUpdate();
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, "¡Error! No se actualizaron los datos de 3 técnico(1) " + e);
                    }

                    try {

                        //DESDE acá cuando hay más
                        PreparedStatement sqlestud = Conexion.connection.prepareStatement("INSERT INTO escolaridades_poli "
                                + "(no_id, tipo_escol, programa, nom_institucion, ciudad_inst, anio_inst, fechacreacion)"
                                + " VALUES (?,?,?,?,?,?,?)");
                        sqlestud.setString(1, txtnoiden.getText());
                        sqlestud.setString(2, "Técnico");
                        sqlestud.setString(3, tecni_programa2);
                        sqlestud.setString(4, tecni_nom_institucion2);
                        sqlestud.setString(5, tecni_ciudad_inst2);
                        sqlestud.setString(6, tecni_anio_inst2);
                        sqlestud.setString(7, fechanow);
                        sqlestud.executeUpdate();
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, "¡Error! No se actualizaron los datos de 3 técnico(2) " + e);
                    }

                    try {

                        //DESDE acá cuando hay más
                        PreparedStatement sqlestud = Conexion.connection.prepareStatement("INSERT INTO escolaridades_poli "
                                + "(no_id, tipo_escol, programa, nom_institucion, ciudad_inst, anio_inst, fechacreacion)"
                                + " VALUES (?,?,?,?,?,?,?)");
                        sqlestud.setString(1, txtnoiden.getText());
                        sqlestud.setString(2, "Técnico");
                        sqlestud.setString(3, tecni_programa3);
                        sqlestud.setString(4, tecni_nom_institucion3);
                        sqlestud.setString(5, tecni_ciudad_inst3);
                        sqlestud.setString(6, tecni_anio_inst3);
                        sqlestud.setString(7, fechanow);
                        sqlestud.executeUpdate();
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, "¡Error! No se actualizaron los datos de 3 técnico(3) " + e);
                    }

                }

            } catch (SQLException e) {

            }

        } else //con los 2
        if ("haytecni".equals(tecnic1) && "haytecni2".equals(tecnic2)) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM  escolaridades_poli WHERE no_id = " + txtnoiden.getText() + " AND tipo_escol = 'Técnico'");
                r.next();

                int cune = r.getRow();

                if (cune == 0) {
                    try {

                        //DESDE acá cuando hay más
                        PreparedStatement sqlestud = Conexion.connection.prepareStatement("INSERT INTO escolaridades_poli "
                                + "(no_id, tipo_escol, programa, nom_institucion, ciudad_inst, anio_inst, fechacreacion)"
                                + " VALUES (?,?,?,?,?,?,?)");
                        sqlestud.setString(1, txtnoiden.getText());
                        sqlestud.setString(2, "Técnico");
                        sqlestud.setString(3, tecni_programa1);
                        sqlestud.setString(4, tecni_nom_institucion1);
                        sqlestud.setString(5, tecni_ciudad_inst1);
                        sqlestud.setString(6, tecni_anio_inst1);
                        sqlestud.setString(7, fechanow);
                        sqlestud.executeUpdate();
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, "¡Error! No se insertaron los datos de 2 técnico(1) " + e);
                    }

                    try {

                        //DESDE acá cuando hay más
                        PreparedStatement sqlestud = Conexion.connection.prepareStatement("INSERT INTO escolaridades_poli "
                                + "(no_id, tipo_escol, programa, nom_institucion, ciudad_inst, anio_inst, fechacreacion)"
                                + " VALUES (?,?,?,?,?,?,?)");
                        sqlestud.setString(1, txtnoiden.getText());
                        sqlestud.setString(2, "Técnico");
                        sqlestud.setString(3, tecni_programa2);
                        sqlestud.setString(4, tecni_nom_institucion2);
                        sqlestud.setString(5, tecni_ciudad_inst2);
                        sqlestud.setString(6, tecni_anio_inst2);
                        sqlestud.setString(7, fechanow);
                        sqlestud.executeUpdate();
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, "¡Error! No se insertaron los datos de 2 técnico(2) " + e);
                    }
                } else {

                    try {
                        PreparedStatement sqlacade = Conexion.connection.prepareStatement("DELETE FROM escolaridades_poli WHERE no_id = " + txtnoiden.getText() + " AND tipo_escol = 'Técnico'");
                        sqlacade.executeUpdate();
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, "¡Error! No se eliminaron los datos de Técnico (2) antes de update " + e);
                    }

                    try {

                        //DESDE acá cuando hay más
                        PreparedStatement sqlestud = Conexion.connection.prepareStatement("INSERT INTO escolaridades_poli "
                                + "(no_id, tipo_escol, programa, nom_institucion, ciudad_inst, anio_inst, fechacreacion)"
                                + " VALUES (?,?,?,?,?,?,?)");
                        sqlestud.setString(1, txtnoiden.getText());
                        sqlestud.setString(2, "Técnico");
                        sqlestud.setString(3, tecni_programa1);
                        sqlestud.setString(4, tecni_nom_institucion1);
                        sqlestud.setString(5, tecni_ciudad_inst1);
                        sqlestud.setString(6, tecni_anio_inst1);
                        sqlestud.setString(7, fechanow);
                        sqlestud.executeUpdate();
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, "¡Error! No se actualizaron los datos de 2 técnico(1) " + e);
                    }

                    try {

                        //DESDE acá cuando hay más
                        System.out.println("el maldito segundo dato");
                        PreparedStatement sqlestud = Conexion.connection.prepareStatement("INSERT INTO escolaridades_poli "
                                + "(no_id, tipo_escol, programa, nom_institucion, ciudad_inst, anio_inst, fechacreacion)"
                                + " VALUES (?,?,?,?,?,?,?)");
                        sqlestud.setString(1, txtnoiden.getText());
                        sqlestud.setString(2, "Técnico");
                        sqlestud.setString(3, tecni_programa2);
                        sqlestud.setString(4, tecni_nom_institucion2);
                        sqlestud.setString(5, tecni_ciudad_inst2);
                        sqlestud.setString(6, tecni_anio_inst2);
                        sqlestud.setString(7, fechanow);
                        sqlestud.executeUpdate();
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, "¡Error! No se actualizaron los datos de 2 técnico(2) " + e);
                    }

                }

            } catch (SQLException e) {

            }

        } else if ("haytecni".equals(tecnic1)) {

            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM  escolaridades_poli WHERE no_id = " + txtnoiden.getText() + " AND tipo_escol = 'Técnico'");
                r.next();

                int cune = r.getRow();

                if (cune == 0) {
                    try {

                        PreparedStatement sqlestud = Conexion.connection.prepareStatement("INSERT INTO escolaridades_poli "
                                + "(no_id, tipo_escol, programa, nom_institucion, ciudad_inst, anio_inst, fechacreacion)"
                                + " VALUES (?,?,?,?,?,?,?)");
                        sqlestud.setString(1, txtnoiden.getText());
                        sqlestud.setString(2, "Técnico");
                        sqlestud.setString(3, tecni_programa1);
                        sqlestud.setString(4, tecni_nom_institucion1);
                        sqlestud.setString(5, tecni_ciudad_inst1);
                        sqlestud.setString(6, tecni_anio_inst1);
                        sqlestud.setString(7, fechanow);
                        sqlestud.executeUpdate();
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, "¡Error! No se insertaron los datos de 1 técnico(1) " + e);
                    }
                } else {

                    try {
                        PreparedStatement sqlacade = Conexion.connection.prepareStatement("DELETE FROM escolaridades_poli WHERE no_id = " + txtnoiden.getText() + " AND tipo_escol = 'Técnico'");
                        sqlacade.executeUpdate();
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, "¡Error! No se eliminaron los datos de Técnico (1) antes de update " + e);
                    }

                    try {

                        //DESDE acá cuando hay más
                        PreparedStatement sqlestud = Conexion.connection.prepareStatement("INSERT INTO escolaridades_poli "
                                + "(no_id, tipo_escol, programa, nom_institucion, ciudad_inst, anio_inst, fechacreacion)"
                                + " VALUES (?,?,?,?,?,?,?)");
                        sqlestud.setString(1, txtnoiden.getText());
                        sqlestud.setString(2, "Técnico");
                        sqlestud.setString(3, tecni_programa1);
                        sqlestud.setString(4, tecni_nom_institucion1);
                        sqlestud.setString(5, tecni_ciudad_inst1);
                        sqlestud.setString(6, tecni_anio_inst1);
                        sqlestud.setString(7, fechanow);
                        sqlestud.executeUpdate();
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, "¡Error! No se actualizaron los datos de 1 técnico(1) " + e);
                    }

                }

            } catch (SQLException e) {

            }

        } else if ("nohay".equals(tecnic1)) {

            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM  escolaridades_poli WHERE no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();

                if (cune > 0) {
                    try {
                        PreparedStatement sqlacade = Conexion.connection.prepareStatement("DELETE FROM escolaridades_poli   WHERE no_id = " + txtnoiden.getText() + " AND tipo_escol = 'Técnico' ");
                        sqlacade.executeUpdate();
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, "¡Error! No se eliminaron los datos de técnico " + e);
                    }
                }
            } catch (SQLException e) {
            }
        }
    }

    public void validartecnologo() {

        if ("haytecno".equals(tecnol1) && "haytecno2".equals(tecnol2) && "haytecno3".equals(tecnol3) && "haytecno4".equals(tecnol4)) {

            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM  escolaridades_poli WHERE no_id = " + txtnoiden.getText() + " AND tipo_escol = 'Tecnólogo'");
                r.next();
                int cune = r.getRow();

                if (cune == 0) {
                    try {

                        PreparedStatement sqlestud = Conexion.connection.prepareStatement("INSERT INTO escolaridades_poli "
                                + "(no_id, tipo_escol, programa, nom_institucion, ciudad_inst, anio_inst, fechacreacion)"
                                + " VALUES (?,?,?,?,?,?,?)");
                        sqlestud.setString(1, txtnoiden.getText());
                        sqlestud.setString(2, "Tecnólogo");
                        sqlestud.setString(3, tecno_programa1);
                        sqlestud.setString(4, tecno_nom_institucion1);
                        sqlestud.setString(5, tecno_ciudad_inst1);
                        sqlestud.setString(6, tecno_anio_inst1);
                        sqlestud.setString(7, fechanow);
                        sqlestud.executeUpdate();
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, "¡Error! No se actualizaron los datos de técnico(1) " + e);
                    }

                    try {

                        PreparedStatement sqlestud = Conexion.connection.prepareStatement("INSERT INTO escolaridades_poli "
                                + "(no_id, tipo_escol, programa, nom_institucion, ciudad_inst, anio_inst, fechacreacion)"
                                + " VALUES (?,?,?,?,?,?,?)");
                        sqlestud.setString(1, txtnoiden.getText());
                        sqlestud.setString(2, "Tecnólogo");
                        sqlestud.setString(3, tecno_programa2);
                        sqlestud.setString(4, tecno_nom_institucion2);
                        sqlestud.setString(5, tecno_ciudad_inst2);
                        sqlestud.setString(6, tecno_anio_inst2);
                        sqlestud.setString(7, fechanow);
                        sqlestud.executeUpdate();
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, "¡Error! No se actualizaron los datos de técnico(1) " + e);
                    }

                    try {

                        PreparedStatement sqlestud = Conexion.connection.prepareStatement("INSERT INTO escolaridades_poli "
                                + "(no_id, tipo_escol, programa, nom_institucion, ciudad_inst, anio_inst, fechacreacion)"
                                + " VALUES (?,?,?,?,?,?,?)");
                        sqlestud.setString(1, txtnoiden.getText());
                        sqlestud.setString(2, "Tecnólogo");
                        sqlestud.setString(3, tecno_programa3);
                        sqlestud.setString(4, tecno_nom_institucion3);
                        sqlestud.setString(5, tecno_ciudad_inst3);
                        sqlestud.setString(6, tecno_anio_inst3);
                        sqlestud.setString(7, fechanow);
                        sqlestud.executeUpdate();
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, "¡Error! No se actualizaron los datos de técnico(1) " + e);
                    }

                    try {

                        PreparedStatement sqlestud = Conexion.connection.prepareStatement("INSERT INTO escolaridades_poli "
                                + "(no_id, tipo_escol, programa, nom_institucion, ciudad_inst, anio_inst, fechacreacion)"
                                + " VALUES (?,?,?,?,?,?,?)");
                        sqlestud.setString(1, txtnoiden.getText());
                        sqlestud.setString(2, "Tecnólogo");
                        sqlestud.setString(3, tecno_programa4);
                        sqlestud.setString(4, tecno_nom_institucion4);
                        sqlestud.setString(5, tecno_ciudad_inst4);
                        sqlestud.setString(6, tecno_anio_inst4);
                        sqlestud.setString(7, fechanow);
                        sqlestud.executeUpdate();
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, "¡Error! No se actualizaron los datos de técnico(1) " + e);
                    }
                } else {

                    try {
                        PreparedStatement sqlacade = Conexion.connection.prepareStatement("DELETE FROM escolaridades_poli WHERE no_id = " + txtnoiden.getText() + " AND tipo_escol = 'Tecnólogo'");
                        sqlacade.executeUpdate();
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, "¡Error! No se actualizaron los datos de técnico(1) " + e);
                    }

                    try {

                        PreparedStatement sqlestud = Conexion.connection.prepareStatement("INSERT INTO escolaridades_poli "
                                + "(no_id, tipo_escol, programa, nom_institucion, ciudad_inst, anio_inst, fechacreacion)"
                                + " VALUES (?,?,?,?,?,?,?)");
                        sqlestud.setString(1, txtnoiden.getText());
                        sqlestud.setString(2, "Tecnólogo");
                        sqlestud.setString(3, tecno_programa1);
                        sqlestud.setString(4, tecno_nom_institucion1);
                        sqlestud.setString(5, tecno_ciudad_inst1);
                        sqlestud.setString(6, tecno_anio_inst1);
                        sqlestud.setString(7, fechanow);
                        sqlestud.executeUpdate();
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, "¡Error! No se actualizaron los datos de técnico(1) " + e);
                    }

                    try {

                        PreparedStatement sqlestud = Conexion.connection.prepareStatement("INSERT INTO escolaridades_poli "
                                + "(no_id, tipo_escol, programa, nom_institucion, ciudad_inst, anio_inst, fechacreacion)"
                                + " VALUES (?,?,?,?,?,?,?)");
                        sqlestud.setString(1, txtnoiden.getText());
                        sqlestud.setString(2, "Tecnólogo");
                        sqlestud.setString(3, tecno_programa2);
                        sqlestud.setString(4, tecno_nom_institucion2);
                        sqlestud.setString(5, tecno_ciudad_inst2);
                        sqlestud.setString(6, tecno_anio_inst2);
                        sqlestud.setString(7, fechanow);
                        sqlestud.executeUpdate();
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, "¡Error! No se actualizaron los datos de técnico(1) " + e);
                    }

                    try {

                        PreparedStatement sqlestud = Conexion.connection.prepareStatement("INSERT INTO escolaridades_poli "
                                + "(no_id, tipo_escol, programa, nom_institucion, ciudad_inst, anio_inst, fechacreacion)"
                                + " VALUES (?,?,?,?,?,?,?)");
                        sqlestud.setString(1, txtnoiden.getText());
                        sqlestud.setString(2, "Tecnólogo");
                        sqlestud.setString(3, tecno_programa3);
                        sqlestud.setString(4, tecno_nom_institucion3);
                        sqlestud.setString(5, tecno_ciudad_inst3);
                        sqlestud.setString(6, tecno_anio_inst3);
                        sqlestud.setString(7, fechanow);
                        sqlestud.executeUpdate();
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, "¡Error! No se actualizaron los datos de técnico(1) " + e);
                    }

                    try {

                        PreparedStatement sqlestud = Conexion.connection.prepareStatement("INSERT INTO escolaridades_poli "
                                + "(no_id, tipo_escol, programa, nom_institucion, ciudad_inst, anio_inst, fechacreacion)"
                                + " VALUES (?,?,?,?,?,?,?)");
                        sqlestud.setString(1, txtnoiden.getText());
                        sqlestud.setString(2, "Tecnólogo");
                        sqlestud.setString(3, tecno_programa4);
                        sqlestud.setString(4, tecno_nom_institucion4);
                        sqlestud.setString(5, tecno_ciudad_inst4);
                        sqlestud.setString(6, tecno_anio_inst4);
                        sqlestud.setString(7, fechanow);
                        sqlestud.executeUpdate();
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, "¡Error! No se actualizaron los datos de técnico(1) " + e);
                    }
                }
            } catch (SQLException e) {
            }
        } else //con los 3
        if ("haytecno".equals(tecnol1) && "haytecno2".equals(tecnol2) && "haytecno3".equals(tecnol3)) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM  escolaridades_poli WHERE no_id = " + txtnoiden.getText() + " AND tipo_escol = 'Tecnólogo'");
                r.next();

                int cune = r.getRow();

                if (cune == 0) {
                    try {

                        //DESDE acá cuando hay más
                        PreparedStatement sqlestud = Conexion.connection.prepareStatement("INSERT INTO escolaridades_poli "
                                + "(no_id, tipo_escol, programa, nom_institucion, ciudad_inst, anio_inst, fechacreacion)"
                                + " VALUES (?,?,?,?,?,?,?)");
                        sqlestud.setString(1, txtnoiden.getText());
                        sqlestud.setString(2, "Tecnólogo");
                        sqlestud.setString(3, tecno_programa1);
                        sqlestud.setString(4, tecno_nom_institucion1);
                        sqlestud.setString(5, tecno_ciudad_inst1);
                        sqlestud.setString(6, tecno_anio_inst1);
                        sqlestud.setString(7, fechanow);
                        sqlestud.executeUpdate();
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, "¡Error! No se actualizaron los datos de técnico(1) " + e);
                    }

                    try {

                        //DESDE acá cuando hay más
                        PreparedStatement sqlestud = Conexion.connection.prepareStatement("INSERT INTO escolaridades_poli "
                                + "(no_id, tipo_escol, programa, nom_institucion, ciudad_inst, anio_inst, fechacreacion)"
                                + " VALUES (?,?,?,?,?,?,?)");
                        sqlestud.setString(1, txtnoiden.getText());
                        sqlestud.setString(2, "Tecnólogo");
                        sqlestud.setString(3, tecno_programa2);
                        sqlestud.setString(4, tecno_nom_institucion2);
                        sqlestud.setString(5, tecno_ciudad_inst2);
                        sqlestud.setString(6, tecno_anio_inst2);
                        sqlestud.setString(7, fechanow);
                        sqlestud.executeUpdate();
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, "¡Error! No se actualizaron los datos de técnico(1) " + e);
                    }

                    try {

                        PreparedStatement sqlestud = Conexion.connection.prepareStatement("INSERT INTO escolaridades_poli "
                                + "(no_id, tipo_escol, programa, nom_institucion, ciudad_inst, anio_inst, fechacreacion)"
                                + " VALUES (?,?,?,?,?,?,?)");
                        sqlestud.setString(1, txtnoiden.getText());
                        sqlestud.setString(2, "Tecnólogo");
                        sqlestud.setString(3, tecno_programa3);
                        sqlestud.setString(4, tecno_nom_institucion3);
                        sqlestud.setString(5, tecno_ciudad_inst3);
                        sqlestud.setString(6, tecno_anio_inst3);
                        sqlestud.setString(7, fechanow);
                        sqlestud.executeUpdate();
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, "¡Error! No se actualizaron los datos de técnico(1) " + e);
                    }

                } else {

                    try {
                        PreparedStatement sqlacade = Conexion.connection.prepareStatement("DELETE FROM escolaridades_poli WHERE no_id = " + txtnoiden.getText() + " AND tipo_escol = 'Tecnólogo'");
                        sqlacade.executeUpdate();
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, "¡Error! No se actualizaron los datos de técnico(1) " + e);
                    }

                    try {

                        //DESDE acá cuando hay más
                        PreparedStatement sqlestud = Conexion.connection.prepareStatement("INSERT INTO escolaridades_poli "
                                + "(no_id, tipo_escol, programa, nom_institucion, ciudad_inst, anio_inst, fechacreacion)"
                                + " VALUES (?,?,?,?,?,?,?)");
                        sqlestud.setString(1, txtnoiden.getText());
                        sqlestud.setString(2, "Tecnólogo");
                        sqlestud.setString(3, tecno_programa1);
                        sqlestud.setString(4, tecno_nom_institucion1);
                        sqlestud.setString(5, tecno_ciudad_inst1);
                        sqlestud.setString(6, tecno_anio_inst1);
                        sqlestud.setString(7, fechanow);
                        sqlestud.executeUpdate();
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, "¡Error! No se actualizaron los datos de técnico(1) " + e);
                    }

                    try {

                        //DESDE acá cuando hay más
                        PreparedStatement sqlestud = Conexion.connection.prepareStatement("INSERT INTO escolaridades_poli "
                                + "(no_id, tipo_escol, programa, nom_institucion, ciudad_inst, anio_inst, fechacreacion)"
                                + " VALUES (?,?,?,?,?,?,?)");
                        sqlestud.setString(1, txtnoiden.getText());
                        sqlestud.setString(2, "Tecnólogo");
                        sqlestud.setString(3, tecno_programa2);
                        sqlestud.setString(4, tecno_nom_institucion2);
                        sqlestud.setString(5, tecno_ciudad_inst2);
                        sqlestud.setString(6, tecno_anio_inst2);
                        sqlestud.setString(7, fechanow);
                        sqlestud.executeUpdate();
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, "¡Error! No se actualizaron los datos de técnico(1) " + e);
                    }

                    try {

                        //DESDE acá cuando hay más
                        PreparedStatement sqlestud = Conexion.connection.prepareStatement("INSERT INTO escolaridades_poli "
                                + "(no_id, tipo_escol, programa, nom_institucion, ciudad_inst, anio_inst, fechacreacion)"
                                + " VALUES (?,?,?,?,?,?,?)");
                        sqlestud.setString(1, txtnoiden.getText());
                        sqlestud.setString(2, "Tecnólogo");
                        sqlestud.setString(3, tecno_programa3);
                        sqlestud.setString(4, tecno_nom_institucion3);
                        sqlestud.setString(5, tecno_ciudad_inst3);
                        sqlestud.setString(6, tecno_anio_inst3);
                        sqlestud.setString(7, fechanow);
                        sqlestud.executeUpdate();
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, "¡Error! No se actualizaron los datos de técnico(1) " + e);
                    }
                }
            } catch (SQLException e) {

            }

        } else //con los 2
        if ("haytecno".equals(tecnol1) && "haytecno2".equals(tecnol2)) {

            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM  escolaridades_poli WHERE no_id = " + txtnoiden.getText() + " AND tipo_escol = 'Tecnólogo'");
                r.next();

                int cune = r.getRow();

                if (cune == 0) {
                    try {

                        //DESDE acá cuando hay más
                        PreparedStatement sqlestud = Conexion.connection.prepareStatement("INSERT INTO escolaridades_poli "
                                + "(no_id, tipo_escol, programa, nom_institucion, ciudad_inst, anio_inst, fechacreacion)"
                                + " VALUES (?,?,?,?,?,?,?)");
                        sqlestud.setString(1, txtnoiden.getText());
                        sqlestud.setString(2, "Tecnólogo");
                        sqlestud.setString(3, tecno_programa1);
                        sqlestud.setString(4, tecno_nom_institucion1);
                        sqlestud.setString(5, tecno_ciudad_inst1);
                        sqlestud.setString(6, tecno_anio_inst1);
                        sqlestud.setString(7, fechanow);
                        sqlestud.executeUpdate();
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, "¡Error! No se actualizaron los datos de técnico(1) " + e);
                    }

                    try {

                        //DESDE acá cuando hay más
                        PreparedStatement sqlestud = Conexion.connection.prepareStatement("INSERT INTO escolaridades_poli "
                                + "(no_id, tipo_escol, programa, nom_institucion, ciudad_inst, anio_inst, fechacreacion)"
                                + " VALUES (?,?,?,?,?,?,?)");
                        sqlestud.setString(1, txtnoiden.getText());
                        sqlestud.setString(2, "Tecnólogo");
                        sqlestud.setString(3, tecno_programa2);
                        sqlestud.setString(4, tecno_nom_institucion2);
                        sqlestud.setString(5, tecno_ciudad_inst2);
                        sqlestud.setString(6, tecno_anio_inst2);
                        sqlestud.setString(7, fechanow);
                        sqlestud.executeUpdate();
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, "¡Error! No se actualizaron los datos de técnico(1) " + e);
                    }
                } else {

                    try {
                        PreparedStatement sqlacade = Conexion.connection.prepareStatement("DELETE FROM escolaridades_poli WHERE no_id = " + txtnoiden.getText() + " AND tipo_escol = 'Tecnólogo'");
                        sqlacade.executeUpdate();
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, "4 no se actualizaron tecnico" + e);
                    }

                    try {

                        //DESDE acá cuando hay más
                        PreparedStatement sqlestud = Conexion.connection.prepareStatement("INSERT INTO escolaridades_poli "
                                + "(no_id, tipo_escol, programa, nom_institucion, ciudad_inst, anio_inst, fechacreacion)"
                                + " VALUES (?,?,?,?,?,?,?)");
                        sqlestud.setString(1, txtnoiden.getText());
                        sqlestud.setString(2, "Tecnólogo");
                        sqlestud.setString(3, tecno_programa1);
                        sqlestud.setString(4, tecno_nom_institucion1);
                        sqlestud.setString(5, tecno_ciudad_inst1);
                        sqlestud.setString(6, tecno_anio_inst1);
                        sqlestud.setString(7, fechanow);
                        sqlestud.executeUpdate();
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, "¡Error! No se actualizaron los datos de técnico(1) " + e);
                    }

                    try {

                        //DESDE acá cuando hay más
                        PreparedStatement sqlestud = Conexion.connection.prepareStatement("INSERT INTO escolaridades_poli "
                                + "(no_id, tipo_escol, programa, nom_institucion, ciudad_inst, anio_inst, fechacreacion)"
                                + " VALUES (?,?,?,?,?,?,?)");
                        sqlestud.setString(1, txtnoiden.getText());
                        sqlestud.setString(2, "Tecnólogo");
                        sqlestud.setString(3, tecno_programa2);
                        sqlestud.setString(4, tecno_nom_institucion2);
                        sqlestud.setString(5, tecno_ciudad_inst2);
                        sqlestud.setString(6, tecno_anio_inst2);
                        sqlestud.setString(7, fechanow);
                        sqlestud.executeUpdate();
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, "¡Error! No se actualizaron los datos de técnico(1) " + e);
                    }

                }

            } catch (SQLException e) {

            }

        } else if ("haytecno".equals(tecnol1)) {

            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM  escolaridades_poli WHERE no_id = " + txtnoiden.getText() + " AND tipo_escol = 'Tecnólogo'");
                r.next();

                int cune = r.getRow();

                if (cune == 0) {
                    try {

                        //DESDE acá cuando hay más
                        PreparedStatement sqlestud = Conexion.connection.prepareStatement("INSERT INTO escolaridades_poli "
                                + "(no_id, tipo_escol, programa, nom_institucion, ciudad_inst, anio_inst, fechacreacion)"
                                + " VALUES (?,?,?,?,?,?,?)");
                        sqlestud.setString(1, txtnoiden.getText());
                        sqlestud.setString(2, "Tecnólogo");
                        sqlestud.setString(3, tecno_programa1);
                        sqlestud.setString(4, tecno_nom_institucion1);
                        sqlestud.setString(5, tecno_ciudad_inst1);
                        sqlestud.setString(6, tecno_anio_inst1);
                        sqlestud.setString(7, fechanow);
                        sqlestud.executeUpdate();
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, "¡Error! No se actualizaron los datos de técnico(1) " + e);
                    }
                } else {

                    try {
                        PreparedStatement sqlacade = Conexion.connection.prepareStatement("DELETE FROM escolaridades_poli WHERE no_id = " + txtnoiden.getText() + " AND tipo_escol = 'Tecnólogo' ");
                        sqlacade.executeUpdate();
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, "4 no se actualizaron tecnico" + e);
                    }

                    try {

                        //DESDE acá cuando hay más
                        PreparedStatement sqlestud = Conexion.connection.prepareStatement("INSERT INTO escolaridades_poli "
                                + "(no_id, tipo_escol, programa, nom_institucion, ciudad_inst, anio_inst, fechacreacion)"
                                + " VALUES (?,?,?,?,?,?,?)");
                        sqlestud.setString(1, txtnoiden.getText());
                        sqlestud.setString(2, "Tecnólogo");
                        sqlestud.setString(3, tecno_programa1);
                        sqlestud.setString(4, tecno_nom_institucion1);
                        sqlestud.setString(5, tecno_ciudad_inst1);
                        sqlestud.setString(6, tecno_anio_inst1);
                        sqlestud.setString(7, fechanow);
                        sqlestud.executeUpdate();
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, "¡Error! No se actualizaron los datos de técnico(1) " + e);
                    }

                }

            } catch (SQLException e) {

            }

        } else if ("nohay".equals(tecnol1)) {

            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM  escolaridades_poli WHERE no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();

                if (cune > 0) {
                    try {
                        PreparedStatement sqlacade = Conexion.connection.prepareStatement("DELETE FROM escolaridades_poli   WHERE no_id = " + txtnoiden.getText() + " AND tipo_escol = 'Tecnólogo' ");
                        sqlacade.executeUpdate();
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, "¡Error! No se actualizaron los datos de técnico(1) " + e);
                    }
                }
            } catch (SQLException e) {

            }
        }

    }

    public void validarprofesional() {

        //con los 5
        if ("hayprof".equals(profes1) && "hayprof2".equals(profes2) && "hayprof3".equals(profes3) && "hayprof4".equals(profes4) && "hayprof5".equals(profes5)) {

            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM  escolaridades_poli WHERE no_id = " + txtnoiden.getText() + " AND tipo_escol = 'Profesional'");
                r.next();

                int cune = r.getRow();

                if (cune == 0) {
                    try {

                        //DESDE acá cuando hay más
                        PreparedStatement sqlestud = Conexion.connection.prepareStatement("INSERT INTO escolaridades_poli "
                                + "(no_id, tipo_escol, programa, nom_institucion, ciudad_inst, anio_inst, fechacreacion)"
                                + " VALUES (?,?,?,?,?,?,?)");
                        sqlestud.setString(1, txtnoiden.getText());
                        sqlestud.setString(2, "Profesional");
                        sqlestud.setString(3, profe_programa1);
                        sqlestud.setString(4, profe_nom_institucion1);
                        sqlestud.setString(5, profe_ciudad_inst1);
                        sqlestud.setString(6, profe_anio_inst1);
                        sqlestud.setString(7, fechanow);
                        sqlestud.executeUpdate();
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, "¡Error! No se actualizaron los datos de técnico(1) " + e);
                    }

                    try {

                        //DESDE acá cuando hay más
                        PreparedStatement sqlestud = Conexion.connection.prepareStatement("INSERT INTO escolaridades_poli "
                                + "(no_id, tipo_escol, programa, nom_institucion, ciudad_inst, anio_inst, fechacreacion)"
                                + " VALUES (?,?,?,?,?,?,?)");
                        sqlestud.setString(1, txtnoiden.getText());
                        sqlestud.setString(2, "Profesional");
                        sqlestud.setString(3, profe_programa2);
                        sqlestud.setString(4, profe_nom_institucion2);
                        sqlestud.setString(5, profe_ciudad_inst2);
                        sqlestud.setString(6, profe_anio_inst2);
                        sqlestud.setString(7, fechanow);
                        sqlestud.executeUpdate();
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, "¡Error! No se actualizaron los datos de técnico(1) " + e);
                    }

                    try {

                        //DESDE acá cuando hay más
                        PreparedStatement sqlestud = Conexion.connection.prepareStatement("INSERT INTO escolaridades_poli "
                                + "(no_id, tipo_escol, programa, nom_institucion, ciudad_inst, anio_inst, fechacreacion)"
                                + " VALUES (?,?,?,?,?,?,?)");
                        sqlestud.setString(1, txtnoiden.getText());
                        sqlestud.setString(2, "Profesional");
                        sqlestud.setString(3, profe_programa3);
                        sqlestud.setString(4, profe_nom_institucion3);
                        sqlestud.setString(5, profe_ciudad_inst3);
                        sqlestud.setString(6, profe_anio_inst3);
                        sqlestud.setString(7, fechanow);
                        sqlestud.executeUpdate();
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, "¡Error! No se actualizaron los datos de técnico(1) " + e);
                    }

                    try {

                        //DESDE acá cuando hay más
                        PreparedStatement sqlestud = Conexion.connection.prepareStatement("INSERT INTO escolaridades_poli "
                                + "(no_id, tipo_escol, programa, nom_institucion, ciudad_inst, anio_inst, fechacreacion)"
                                + " VALUES (?,?,?,?,?,?,?)");
                        sqlestud.setString(1, txtnoiden.getText());
                        sqlestud.setString(2, "Profesional");
                        sqlestud.setString(3, profe_programa4);
                        sqlestud.setString(4, profe_nom_institucion4);
                        sqlestud.setString(5, profe_ciudad_inst4);
                        sqlestud.setString(6, profe_anio_inst4);
                        sqlestud.setString(7, fechanow);
                        sqlestud.executeUpdate();
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, "¡Error! No se actualizaron los datos de técnico(1) " + e);
                    }

                    try {

                        //DESDE acá cuando hay más
                        PreparedStatement sqlestud = Conexion.connection.prepareStatement("INSERT INTO escolaridades_poli "
                                + "(no_id, tipo_escol, programa, nom_institucion, ciudad_inst, anio_inst, fechacreacion)"
                                + " VALUES (?,?,?,?,?,?,?)");
                        sqlestud.setString(1, txtnoiden.getText());
                        sqlestud.setString(2, "Profesional");
                        sqlestud.setString(3, profe_programa5);
                        sqlestud.setString(4, profe_nom_institucion5);
                        sqlestud.setString(5, profe_ciudad_inst5);
                        sqlestud.setString(6, profe_anio_inst5);
                        sqlestud.setString(7, fechanow);
                        sqlestud.executeUpdate();
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, "¡Error! No se actualizaron los datos de técnico(1) " + e);
                    }
                } else {

                    try {
                        PreparedStatement sqlacade = Conexion.connection.prepareStatement("DELETE FROM escolaridades_poli WHERE no_id = " + txtnoiden.getText() + " AND tipo_escol = 'Profesional'");
                        sqlacade.executeUpdate();
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, "¡Error! No se actualizaron los datos de técnico(1) " + e);
                    }

                    try {

                        //DESDE acá cuando hay más
                        PreparedStatement sqlestud = Conexion.connection.prepareStatement("INSERT INTO escolaridades_poli "
                                + "(no_id, tipo_escol, programa, nom_institucion, ciudad_inst, anio_inst, fechacreacion)"
                                + " VALUES (?,?,?,?,?,?,?)");
                        sqlestud.setString(1, txtnoiden.getText());
                        sqlestud.setString(2, "Profesional");
                        sqlestud.setString(3, profe_programa1);
                        sqlestud.setString(4, profe_nom_institucion1);
                        sqlestud.setString(5, profe_ciudad_inst1);
                        sqlestud.setString(6, profe_anio_inst1);
                        sqlestud.setString(7, fechanow);
                        sqlestud.executeUpdate();
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, "¡Error! No se actualizaron los datos de técnico(1) " + e);
                    }

                    try {

                        //DESDE acá cuando hay más
                        PreparedStatement sqlestud = Conexion.connection.prepareStatement("INSERT INTO escolaridades_poli "
                                + "(no_id, tipo_escol, programa, nom_institucion, ciudad_inst, anio_inst, fechacreacion)"
                                + " VALUES (?,?,?,?,?,?,?)");
                        sqlestud.setString(1, txtnoiden.getText());
                        sqlestud.setString(2, "Profesional");
                        sqlestud.setString(3, profe_programa2);
                        sqlestud.setString(4, profe_nom_institucion2);
                        sqlestud.setString(5, profe_ciudad_inst2);
                        sqlestud.setString(6, profe_anio_inst2);
                        sqlestud.setString(7, fechanow);
                        sqlestud.executeUpdate();
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, "¡Error! No se actualizaron los datos de técnico(1) " + e);
                    }

                    try {

                        //DESDE acá cuando hay más
                        PreparedStatement sqlestud = Conexion.connection.prepareStatement("INSERT INTO escolaridades_poli "
                                + "(no_id, tipo_escol, programa, nom_institucion, ciudad_inst, anio_inst, fechacreacion)"
                                + " VALUES (?,?,?,?,?,?,?)");
                        sqlestud.setString(1, txtnoiden.getText());
                        sqlestud.setString(2, "Profesional");
                        sqlestud.setString(3, profe_programa3);
                        sqlestud.setString(4, profe_nom_institucion3);
                        sqlestud.setString(5, profe_ciudad_inst3);
                        sqlestud.setString(6, profe_anio_inst3);
                        sqlestud.setString(7, fechanow);
                        sqlestud.executeUpdate();
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, "¡Error! No se actualizaron los datos de técnico(1) " + e);
                    }

                    try {

                        //DESDE acá cuando hay más
                        PreparedStatement sqlestud = Conexion.connection.prepareStatement("INSERT INTO escolaridades_poli "
                                + "(no_id, tipo_escol, programa, nom_institucion, ciudad_inst, anio_inst, fechacreacion)"
                                + " VALUES (?,?,?,?,?,?,?)");
                        sqlestud.setString(1, txtnoiden.getText());
                        sqlestud.setString(2, "Profesional");
                        sqlestud.setString(3, profe_programa4);
                        sqlestud.setString(4, profe_nom_institucion4);
                        sqlestud.setString(5, profe_ciudad_inst4);
                        sqlestud.setString(6, profe_anio_inst4);
                        sqlestud.setString(7, fechanow);
                        sqlestud.executeUpdate();
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, "¡Error! No se actualizaron los datos de técnico(1) " + e);
                    }

                    try {

                        //DESDE acá cuando hay más
                        PreparedStatement sqlestud = Conexion.connection.prepareStatement("INSERT INTO escolaridades_poli "
                                + "(no_id, tipo_escol, programa, nom_institucion, ciudad_inst, anio_inst, fechacreacion)"
                                + " VALUES (?,?,?,?,?,?,?)");
                        sqlestud.setString(1, txtnoiden.getText());
                        sqlestud.setString(2, "Profesional");
                        sqlestud.setString(3, profe_programa5);
                        sqlestud.setString(4, profe_nom_institucion5);
                        sqlestud.setString(5, profe_ciudad_inst5);
                        sqlestud.setString(6, profe_anio_inst5);
                        sqlestud.setString(7, fechanow);
                        sqlestud.executeUpdate();
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, "¡Error! No se actualizaron los datos de técnico(1) " + e);
                    }
                }
            } catch (SQLException e) {

            }
            //con 4
        } else if ("hayprof".equals(profes1) && "hayprof2".equals(profes2) && "hayprof3".equals(profes3) && "hayprof4".equals(profes4)) {

            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM  escolaridades_poli WHERE no_id = " + txtnoiden.getText() + " AND tipo_escol = 'Profesional'");
                r.next();

                int cune = r.getRow();

                if (cune == 0) {
                    try {

                        //DESDE acá cuando hay más
                        PreparedStatement sqlestud = Conexion.connection.prepareStatement("INSERT INTO escolaridades_poli "
                                + "(no_id, tipo_escol, programa, nom_institucion, ciudad_inst, anio_inst, fechacreacion)"
                                + " VALUES (?,?,?,?,?,?,?)");
                        sqlestud.setString(1, txtnoiden.getText());
                        sqlestud.setString(2, "Profesional");
                        sqlestud.setString(3, profe_programa1);
                        sqlestud.setString(4, profe_nom_institucion1);
                        sqlestud.setString(5, profe_ciudad_inst1);
                        sqlestud.setString(6, profe_anio_inst1);
                        sqlestud.setString(7, fechanow);
                        sqlestud.executeUpdate();
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, "¡Error! No se actualizaron los datos de técnico(1) " + e);
                    }

                    try {

                        //DESDE acá cuando hay más
                        PreparedStatement sqlestud = Conexion.connection.prepareStatement("INSERT INTO escolaridades_poli "
                                + "(no_id, tipo_escol, programa, nom_institucion, ciudad_inst, anio_inst, fechacreacion)"
                                + " VALUES (?,?,?,?,?,?,?)");
                        sqlestud.setString(1, txtnoiden.getText());
                        sqlestud.setString(2, "Profesional");
                        sqlestud.setString(3, profe_programa2);
                        sqlestud.setString(4, profe_nom_institucion2);
                        sqlestud.setString(5, profe_ciudad_inst2);
                        sqlestud.setString(6, profe_anio_inst2);
                        sqlestud.setString(7, fechanow);
                        sqlestud.executeUpdate();
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, "¡Error! No se actualizaron los datos de técnico(1) " + e);
                    }

                    try {

                        //DESDE acá cuando hay más
                        PreparedStatement sqlestud = Conexion.connection.prepareStatement("INSERT INTO escolaridades_poli "
                                + "(no_id, tipo_escol, programa, nom_institucion, ciudad_inst, anio_inst, fechacreacion)"
                                + " VALUES (?,?,?,?,?,?,?)");
                        sqlestud.setString(1, txtnoiden.getText());
                        sqlestud.setString(2, "Profesional");
                        sqlestud.setString(3, profe_programa3);
                        sqlestud.setString(4, profe_nom_institucion3);
                        sqlestud.setString(5, profe_ciudad_inst3);
                        sqlestud.setString(6, profe_anio_inst3);
                        sqlestud.setString(7, fechanow);
                        sqlestud.executeUpdate();
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, "¡Error! No se actualizaron los datos de técnico(1) " + e);
                    }

                    try {

                        //DESDE acá cuando hay más
                        PreparedStatement sqlestud = Conexion.connection.prepareStatement("INSERT INTO escolaridades_poli "
                                + "(no_id, tipo_escol, programa, nom_institucion, ciudad_inst, anio_inst, fechacreacion)"
                                + " VALUES (?,?,?,?,?,?,?)");
                        sqlestud.setString(1, txtnoiden.getText());
                        sqlestud.setString(2, "Profesional");
                        sqlestud.setString(3, profe_programa4);
                        sqlestud.setString(4, profe_nom_institucion4);
                        sqlestud.setString(5, profe_ciudad_inst4);
                        sqlestud.setString(6, profe_anio_inst4);
                        sqlestud.setString(7, fechanow);
                        sqlestud.executeUpdate();
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, "¡Error! No se actualizaron los datos de técnico(1) " + e);
                    }
                } else {

                    try {
                        PreparedStatement sqlacade = Conexion.connection.prepareStatement("DELETE FROM escolaridades_poli WHERE no_id = " + txtnoiden.getText() + " AND tipo_escol = 'Profesional'");
                        sqlacade.executeUpdate();
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, "¡Error! No se actualizaron los datos de técnico(1) " + e);
                    }

                    try {

                        //DESDE acá cuando hay más
                        PreparedStatement sqlestud = Conexion.connection.prepareStatement("INSERT INTO escolaridades_poli "
                                + "(no_id, tipo_escol, programa, nom_institucion, ciudad_inst, anio_inst, fechacreacion)"
                                + " VALUES (?,?,?,?,?,?,?)");
                        sqlestud.setString(1, txtnoiden.getText());
                        sqlestud.setString(2, "Profesional");
                        sqlestud.setString(3, profe_programa1);
                        sqlestud.setString(4, profe_nom_institucion1);
                        sqlestud.setString(5, profe_ciudad_inst1);
                        sqlestud.setString(6, profe_anio_inst1);
                        sqlestud.setString(7, fechanow);
                        sqlestud.executeUpdate();
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, "¡Error! No se actualizaron los datos de técnico(1) " + e);
                    }

                    try {

                        //DESDE acá cuando hay más
                        PreparedStatement sqlestud = Conexion.connection.prepareStatement("INSERT INTO escolaridades_poli "
                                + "(no_id, tipo_escol, programa, nom_institucion, ciudad_inst, anio_inst, fechacreacion)"
                                + " VALUES (?,?,?,?,?,?,?)");
                        sqlestud.setString(1, txtnoiden.getText());
                        sqlestud.setString(2, "Profesional");
                        sqlestud.setString(3, profe_programa2);
                        sqlestud.setString(4, profe_nom_institucion2);
                        sqlestud.setString(5, profe_ciudad_inst2);
                        sqlestud.setString(6, profe_anio_inst2);
                        sqlestud.setString(7, fechanow);
                        sqlestud.executeUpdate();
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, "¡Error! No se actualizaron los datos de técnico(1) " + e);
                    }

                    try {

                        //DESDE acá cuando hay más
                        PreparedStatement sqlestud = Conexion.connection.prepareStatement("INSERT INTO escolaridades_poli "
                                + "(no_id, tipo_escol, programa, nom_institucion, ciudad_inst, anio_inst, fechacreacion)"
                                + " VALUES (?,?,?,?,?,?,?)");
                        sqlestud.setString(1, txtnoiden.getText());
                        sqlestud.setString(2, "Profesional");
                        sqlestud.setString(3, profe_programa3);
                        sqlestud.setString(4, profe_nom_institucion3);
                        sqlestud.setString(5, profe_ciudad_inst3);
                        sqlestud.setString(6, profe_anio_inst3);
                        sqlestud.setString(7, fechanow);
                        sqlestud.executeUpdate();
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, "¡Error! No se actualizaron los datos de técnico(1) " + e);
                    }

                    try {

                        //DESDE acá cuando hay más
                        PreparedStatement sqlestud = Conexion.connection.prepareStatement("INSERT INTO escolaridades_poli "
                                + "(no_id, tipo_escol, programa, nom_institucion, ciudad_inst, anio_inst, fechacreacion)"
                                + " VALUES (?,?,?,?,?,?,?)");
                        sqlestud.setString(1, txtnoiden.getText());
                        sqlestud.setString(2, "Profesional");
                        sqlestud.setString(3, profe_programa4);
                        sqlestud.setString(4, profe_nom_institucion4);
                        sqlestud.setString(5, profe_ciudad_inst4);
                        sqlestud.setString(6, profe_anio_inst4);
                        sqlestud.setString(7, fechanow);
                        sqlestud.executeUpdate();
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, "¡Error! No se actualizaron los datos de técnico(1) " + e);
                    }
                }
            } catch (SQLException e) {

            }

        } else //con los 3
        if ("hayprof".equals(profes1) && "hayprof2".equals(profes2) && "hayprof3".equals(profes3)) {

            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM  escolaridades_poli WHERE no_id = " + txtnoiden.getText() + " AND tipo_escol = 'Profesional'");
                r.next();

                int cune = r.getRow();

                if (cune == 0) {
                    try {

                        //DESDE acá cuando hay más
                        PreparedStatement sqlestud = Conexion.connection.prepareStatement("INSERT INTO escolaridades_poli "
                                + "(no_id, tipo_escol, programa, nom_institucion, ciudad_inst, anio_inst, fechacreacion)"
                                + " VALUES (?,?,?,?,?,?,?)");
                        sqlestud.setString(1, txtnoiden.getText());
                        sqlestud.setString(2, "Profesional");
                        sqlestud.setString(3, profe_programa1);
                        sqlestud.setString(4, profe_nom_institucion1);
                        sqlestud.setString(5, profe_ciudad_inst1);
                        sqlestud.setString(6, profe_anio_inst1);
                        sqlestud.setString(7, fechanow);
                        sqlestud.executeUpdate();
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, "¡Error! No se actualizaron los datos de técnico(1) " + e);
                    }

                    try {

                        //DESDE acá cuando hay más
                        PreparedStatement sqlestud = Conexion.connection.prepareStatement("INSERT INTO escolaridades_poli "
                                + "(no_id, tipo_escol, programa, nom_institucion, ciudad_inst, anio_inst, fechacreacion)"
                                + " VALUES (?,?,?,?,?,?,?)");
                        sqlestud.setString(1, txtnoiden.getText());
                        sqlestud.setString(2, "Profesional");
                        sqlestud.setString(3, profe_programa2);
                        sqlestud.setString(4, profe_nom_institucion2);
                        sqlestud.setString(5, profe_ciudad_inst2);
                        sqlestud.setString(6, profe_anio_inst2);
                        sqlestud.setString(7, fechanow);
                        sqlestud.executeUpdate();
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, "¡Error! No se actualizaron los datos de técnico(1) " + e);
                    }

                    try {

                        //DESDE acá cuando hay más
                        PreparedStatement sqlestud = Conexion.connection.prepareStatement("INSERT INTO escolaridades_poli "
                                + "(no_id, tipo_escol, programa, nom_institucion, ciudad_inst, anio_inst, fechacreacion)"
                                + " VALUES (?,?,?,?,?,?,?)");
                        sqlestud.setString(1, txtnoiden.getText());
                        sqlestud.setString(2, "Profesional");
                        sqlestud.setString(3, profe_programa3);
                        sqlestud.setString(4, profe_nom_institucion3);
                        sqlestud.setString(5, profe_ciudad_inst3);
                        sqlestud.setString(6, profe_anio_inst3);
                        sqlestud.setString(7, fechanow);
                        sqlestud.executeUpdate();
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, "¡Error! No se actualizaron los datos de técnico(1) " + e);
                    }

                } else {

                    try {
                        PreparedStatement sqlacade = Conexion.connection.prepareStatement("DELETE FROM escolaridades_poli WHERE no_id = " + txtnoiden.getText() + " AND tipo_escol = 'Profesional'");
                        sqlacade.executeUpdate();
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, "¡Error! No se actualizaron los datos de técnico(1) " + e);
                    }

                    try {

                        //DESDE acá cuando hay más
                        PreparedStatement sqlestud = Conexion.connection.prepareStatement("INSERT INTO escolaridades_poli "
                                + "(no_id, tipo_escol, programa, nom_institucion, ciudad_inst, anio_inst, fechacreacion)"
                                + " VALUES (?,?,?,?,?,?,?)");
                        sqlestud.setString(1, txtnoiden.getText());
                        sqlestud.setString(2, "Profesional");
                        sqlestud.setString(3, profe_programa1);
                        sqlestud.setString(4, profe_nom_institucion1);
                        sqlestud.setString(5, profe_ciudad_inst1);
                        sqlestud.setString(6, profe_anio_inst1);
                        sqlestud.setString(7, fechanow);
                        sqlestud.executeUpdate();
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, "¡Error! No se actualizaron los datos de técnico(1) " + e);
                    }

                    try {
                        PreparedStatement sqlestud = Conexion.connection.prepareStatement("INSERT INTO escolaridades_poli "
                                + "(no_id, tipo_escol, programa, nom_institucion, ciudad_inst, anio_inst, fechacreacion)"
                                + " VALUES (?,?,?,?,?,?,?)");
                        sqlestud.setString(1, txtnoiden.getText());
                        sqlestud.setString(2, "Profesional");
                        sqlestud.setString(3, profe_programa2);
                        sqlestud.setString(4, profe_nom_institucion2);
                        sqlestud.setString(5, profe_ciudad_inst2);
                        sqlestud.setString(6, profe_anio_inst2);
                        sqlestud.setString(7, fechanow);
                        sqlestud.executeUpdate();
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, "¡Error! No se actualizaron los datos de técnico(1) " + e);
                    }

                    try {

                        //DESDE acá cuando hay más
                        PreparedStatement sqlestud = Conexion.connection.prepareStatement("INSERT INTO escolaridades_poli "
                                + "(no_id, tipo_escol, programa, nom_institucion, ciudad_inst, anio_inst, fechacreacion)"
                                + " VALUES (?,?,?,?,?,?,?)");
                        sqlestud.setString(1, txtnoiden.getText());
                        sqlestud.setString(2, "Profesional");
                        sqlestud.setString(3, profe_programa3);
                        sqlestud.setString(4, profe_nom_institucion3);
                        sqlestud.setString(5, profe_ciudad_inst3);
                        sqlestud.setString(6, profe_anio_inst3);
                        sqlestud.setString(7, fechanow);
                        sqlestud.executeUpdate();
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, "¡Error! No se actualizaron los datos de técnico(1) " + e);
                    }

                }

            } catch (SQLException e) {

            }

        } else //con los 2
        if ("hayprof".equals(profes1) && "hayprof2".equals(profes2)) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM  escolaridades_poli WHERE no_id = " + txtnoiden.getText() + " AND tipo_escol = 'Profesional'");
                r.next();

                int cune = r.getRow();

                if (cune == 0) {
                    try {

                        //DESDE acá cuando hay más
                        PreparedStatement sqlestud = Conexion.connection.prepareStatement("INSERT INTO escolaridades_poli "
                                + "(no_id, tipo_escol, programa, nom_institucion, ciudad_inst, anio_inst, fechacreacion)"
                                + " VALUES (?,?,?,?,?,?,?)");
                        sqlestud.setString(1, txtnoiden.getText());
                        sqlestud.setString(2, "Profesional");
                        sqlestud.setString(3, profe_programa1);
                        sqlestud.setString(4, profe_nom_institucion1);
                        sqlestud.setString(5, profe_ciudad_inst1);
                        sqlestud.setString(6, profe_anio_inst1);
                        sqlestud.setString(7, fechanow);
                        sqlestud.executeUpdate();
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, "¡Error! No se actualizaron los datos de técnico(1) " + e);
                    }

                    try {

                        //DESDE acá cuando hay más
                        PreparedStatement sqlestud = Conexion.connection.prepareStatement("INSERT INTO escolaridades_poli "
                                + "(no_id, tipo_escol, programa, nom_institucion, ciudad_inst, anio_inst, fechacreacion)"
                                + " VALUES (?,?,?,?,?,?,?)");
                        sqlestud.setString(1, txtnoiden.getText());
                        sqlestud.setString(2, "Profesional");
                        sqlestud.setString(3, profe_programa2);
                        sqlestud.setString(4, profe_nom_institucion2);
                        sqlestud.setString(5, profe_ciudad_inst2);
                        sqlestud.setString(6, profe_anio_inst2);
                        sqlestud.setString(7, fechanow);
                        sqlestud.executeUpdate();
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, "¡Error! No se actualizaron los datos de técnico(1) " + e);
                    }

                } else {

                    try {
                        PreparedStatement sqlacade = Conexion.connection.prepareStatement("DELETE FROM escolaridades_poli WHERE no_id = " + txtnoiden.getText() + " AND tipo_escol = 'Profesional'");
                        sqlacade.executeUpdate();
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, "¡Error! No se actualizaron los datos de técnico(1) " + e);
                    }

                    try {

                        //DESDE acá cuando hay más
                        PreparedStatement sqlestud = Conexion.connection.prepareStatement("INSERT INTO escolaridades_poli "
                                + "(no_id, tipo_escol, programa, nom_institucion, ciudad_inst, anio_inst, fechacreacion)"
                                + " VALUES (?,?,?,?,?,?,?)");
                        sqlestud.setString(1, txtnoiden.getText());
                        sqlestud.setString(2, "Profesional");
                        sqlestud.setString(3, profe_programa1);
                        sqlestud.setString(4, profe_nom_institucion1);
                        sqlestud.setString(5, profe_ciudad_inst1);
                        sqlestud.setString(6, profe_anio_inst1);
                        sqlestud.setString(7, fechanow);
                        sqlestud.executeUpdate();
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, "¡Error! No se actualizaron los datos de técnico(1) " + e);
                    }

                    try {

                        //DESDE acá cuando hay más
                        PreparedStatement sqlestud = Conexion.connection.prepareStatement("INSERT INTO escolaridades_poli "
                                + "(no_id, tipo_escol, programa, nom_institucion, ciudad_inst, anio_inst, fechacreacion)"
                                + " VALUES (?,?,?,?,?,?,?)");
                        sqlestud.setString(1, txtnoiden.getText());
                        sqlestud.setString(2, "Profesional");
                        sqlestud.setString(3, profe_programa2);
                        sqlestud.setString(4, profe_nom_institucion2);
                        sqlestud.setString(5, profe_ciudad_inst2);
                        sqlestud.setString(6, profe_anio_inst2);
                        sqlestud.setString(7, fechanow);
                        sqlestud.executeUpdate();
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, "¡Error! No se actualizaron los datos de técnico(1) " + e);
                    }
                }

            } catch (SQLException e) {

            }

        } else if ("hayprof".equals(profes1)) {

            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM  escolaridades_poli WHERE no_id = " + txtnoiden.getText() + " AND tipo_escol = 'Profesional'");
                r.next();

                int cune = r.getRow();

                if (cune == 0) {
                    try {

                        //DESDE acá cuando hay más
                        PreparedStatement sqlestud = Conexion.connection.prepareStatement("INSERT INTO escolaridades_poli "
                                + "(no_id, tipo_escol, programa, nom_institucion, ciudad_inst, anio_inst, fechacreacion)"
                                + " VALUES (?,?,?,?,?,?,?)");
                        sqlestud.setString(1, txtnoiden.getText());
                        sqlestud.setString(2, "Profesional");
                        sqlestud.setString(3, profe_programa1);
                        sqlestud.setString(4, profe_nom_institucion1);
                        sqlestud.setString(5, profe_ciudad_inst1);
                        sqlestud.setString(6, profe_anio_inst1);
                        sqlestud.setString(7, fechanow);
                        sqlestud.executeUpdate();
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, "¡Error! No se actualizaron los datos de técnico(1) " + e);
                    }
                } else {

                    try {
                        PreparedStatement sqlacade = Conexion.connection.prepareStatement("DELETE FROM escolaridades_poli WHERE no_id = " + txtnoiden.getText() + " AND tipo_escol = 'Profesional'");
                        sqlacade.executeUpdate();
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, "¡Error! No se actualizaron los datos de técnico(1) " + e);
                    }

                    try {

                        //DESDE acá cuando hay más
                        PreparedStatement sqlestud = Conexion.connection.prepareStatement("INSERT INTO escolaridades_poli "
                                + "(no_id, tipo_escol, programa, nom_institucion, ciudad_inst, anio_inst, fechacreacion)"
                                + " VALUES (?,?,?,?,?,?,?)");
                        sqlestud.setString(1, txtnoiden.getText());
                        sqlestud.setString(2, "Profesional");
                        sqlestud.setString(3, profe_programa2);
                        sqlestud.setString(4, profe_nom_institucion2);
                        sqlestud.setString(5, profe_ciudad_inst2);
                        sqlestud.setString(6, profe_anio_inst2);
                        sqlestud.setString(7, fechanow);
                        sqlestud.executeUpdate();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "¡Error! No se actualizaron los datos de técnico(1) " + e);
                    }

                }

            } catch (Exception e) {

            }

        } else if ("nohay".equals(profes1)) {

            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM  escolaridades_poli WHERE no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();

                if (cune > 0) {
                    try {
                        PreparedStatement sqlacade = Conexion.connection.prepareStatement("DELETE FROM escolaridades_poli   WHERE no_id = " + txtnoiden.getText() + " AND tipo_escol = 'Profesional' ");
                        sqlacade.executeUpdate();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "¡Error! No se actualizaron los datos de técnico(1) " + e);
                    }
                }
            } catch (Exception e) {

            }
            System.out.println("no hay profesional");
        }
    }

    public void validarpostgrado() {

        //con los 5
        if ("haypost".equals(poste1) && "haypost2".equals(poste2) && "haypost3".equals(poste3) && "haypost4".equals(poste4) && "haypost5".equals(poste5)) {

            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM  escolaridades_poli WHERE no_id = " + txtnoiden.getText() + " AND tipo_escol = 'Postgrado'");
                r.next();

                int cune = r.getRow();

                if (cune == 0) {
                    try {

                        //DESDE acá cuando hay más
                        PreparedStatement sqlestud = Conexion.connection.prepareStatement("INSERT INTO escolaridades_poli "
                                + "(no_id, tipo_escol, programa, nom_institucion, ciudad_inst, anio_inst, fechacreacion)"
                                + " VALUES (?,?,?,?,?,?,?)");
                        sqlestud.setString(1, txtnoiden.getText());
                        sqlestud.setString(2, "Postgrado");
                        sqlestud.setString(3, post_programa1);
                        sqlestud.setString(4, post_nom_institucion1);
                        sqlestud.setString(5, post_ciudad_inst1);
                        sqlestud.setString(6, post_anio_inst1);
                        sqlestud.setString(7, fechanow);
                        sqlestud.executeUpdate();
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, "¡Error! No se actualizaron los datos de técnico(1) " + e);
                    }

                    try {

                        //DESDE acá cuando hay más
                        PreparedStatement sqlestud = Conexion.connection.prepareStatement("INSERT INTO escolaridades_poli "
                                + "(no_id, tipo_escol, programa, nom_institucion, ciudad_inst, anio_inst, fechacreacion)"
                                + " VALUES (?,?,?,?,?,?,?)");
                        sqlestud.setString(1, txtnoiden.getText());
                        sqlestud.setString(2, "Postgrado");
                        sqlestud.setString(3, post_programa2);
                        sqlestud.setString(4, post_nom_institucion2);
                        sqlestud.setString(5, post_ciudad_inst2);
                        sqlestud.setString(6, post_anio_inst2);
                        sqlestud.setString(7, fechanow);
                        sqlestud.executeUpdate();
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, "¡Error! No se actualizaron los datos de técnico(1) " + e);
                    }

                    try {

                        //DESDE acá cuando hay más
                        PreparedStatement sqlestud = Conexion.connection.prepareStatement("INSERT INTO escolaridades_poli "
                                + "(no_id, tipo_escol, programa, nom_institucion, ciudad_inst, anio_inst, fechacreacion)"
                                + " VALUES (?,?,?,?,?,?,?)");
                        sqlestud.setString(1, txtnoiden.getText());
                        sqlestud.setString(2, "Postgrado");
                        sqlestud.setString(3, post_programa3);
                        sqlestud.setString(4, post_nom_institucion3);
                        sqlestud.setString(5, post_ciudad_inst3);
                        sqlestud.setString(6, post_anio_inst3);
                        sqlestud.setString(7, fechanow);
                        sqlestud.executeUpdate();
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, "¡Error! No se actualizaron los datos de técnico(1) " + e);
                    }

                    try {

                        //DESDE acá cuando hay más
                        PreparedStatement sqlestud = Conexion.connection.prepareStatement("INSERT INTO escolaridades_poli "
                                + "(no_id, tipo_escol, programa, nom_institucion, ciudad_inst, anio_inst, fechacreacion)"
                                + " VALUES (?,?,?,?,?,?,?)");
                        sqlestud.setString(1, txtnoiden.getText());
                        sqlestud.setString(2, "Postgrado");
                        sqlestud.setString(3, post_programa4);
                        sqlestud.setString(4, post_nom_institucion4);
                        sqlestud.setString(5, post_ciudad_inst4);
                        sqlestud.setString(6, post_anio_inst4);
                        sqlestud.setString(7, fechanow);
                        sqlestud.executeUpdate();
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, "¡Error! No se actualizaron los datos de técnico(1) " + e);
                    }

                    try {

                        //DESDE acá cuando hay más
                        PreparedStatement sqlestud = Conexion.connection.prepareStatement("INSERT INTO escolaridades_poli "
                                + "(no_id, tipo_escol, programa, nom_institucion, ciudad_inst, anio_inst, fechacreacion)"
                                + " VALUES (?,?,?,?,?,?,?)");
                        sqlestud.setString(1, txtnoiden.getText());
                        sqlestud.setString(2, "Postgrado");
                        sqlestud.setString(3, post_programa5);
                        sqlestud.setString(4, post_nom_institucion5);
                        sqlestud.setString(5, post_ciudad_inst5);
                        sqlestud.setString(6, post_anio_inst5);
                        sqlestud.setString(7, fechanow);
                        sqlestud.executeUpdate();
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, "¡Error! No se actualizaron los datos de técnico(1) " + e);
                    }
                } else {

                    try {
                        PreparedStatement sqlacade = Conexion.connection.prepareStatement("DELETE FROM escolaridades_poli WHERE no_id = " + txtnoiden.getText() + " AND tipo_escol = 'Postgrado'");
                        sqlacade.executeUpdate();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "¡Error! No se actualizaron los datos de técnico(1) " + e);
                    }

                    try {

                        //DESDE acá cuando hay más
                        PreparedStatement sqlestud = Conexion.connection.prepareStatement("INSERT INTO escolaridades_poli "
                                + "(no_id, tipo_escol, programa, nom_institucion, ciudad_inst, anio_inst, fechacreacion)"
                                + " VALUES (?,?,?,?,?,?,?)");
                        sqlestud.setString(1, txtnoiden.getText());
                        sqlestud.setString(2, "Postgrado");
                        sqlestud.setString(3, post_programa1);
                        sqlestud.setString(4, post_nom_institucion1);
                        sqlestud.setString(5, post_ciudad_inst1);
                        sqlestud.setString(6, post_anio_inst1);
                        sqlestud.setString(7, fechanow);
                        sqlestud.executeUpdate();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "¡Error! No se actualizaron los datos de técnico(1) " + e);
                    }

                    try {

                        //DESDE acá cuando hay más
                        PreparedStatement sqlestud = Conexion.connection.prepareStatement("INSERT INTO escolaridades_poli "
                                + "(no_id, tipo_escol, programa, nom_institucion, ciudad_inst, anio_inst, fechacreacion)"
                                + " VALUES (?,?,?,?,?,?,?)");
                        sqlestud.setString(1, txtnoiden.getText());
                        sqlestud.setString(2, "Postgrado");
                        sqlestud.setString(3, post_programa2);
                        sqlestud.setString(4, post_nom_institucion2);
                        sqlestud.setString(5, post_ciudad_inst2);
                        sqlestud.setString(6, post_anio_inst2);
                        sqlestud.setString(7, fechanow);
                        sqlestud.executeUpdate();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "¡Error! No se actualizaron los datos de técnico(1) " + e);
                    }

                    try {

                        //DESDE acá cuando hay más
                        PreparedStatement sqlestud = Conexion.connection.prepareStatement("INSERT INTO escolaridades_poli "
                                + "(no_id, tipo_escol, programa, nom_institucion, ciudad_inst, anio_inst, fechacreacion)"
                                + " VALUES (?,?,?,?,?,?,?)");
                        sqlestud.setString(1, txtnoiden.getText());
                        sqlestud.setString(2, "Postgrado");
                        sqlestud.setString(3, post_programa3);
                        sqlestud.setString(4, post_nom_institucion3);
                        sqlestud.setString(5, post_ciudad_inst3);
                        sqlestud.setString(6, post_anio_inst3);
                        sqlestud.setString(7, fechanow);
                        sqlestud.executeUpdate();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "¡Error! No se actualizaron los datos de técnico(1) " + e);
                    }

                    try {

                        //DESDE acá cuando hay más
                        PreparedStatement sqlestud = Conexion.connection.prepareStatement("INSERT INTO escolaridades_poli "
                                + "(no_id, tipo_escol, programa, nom_institucion, ciudad_inst, anio_inst, fechacreacion)"
                                + " VALUES (?,?,?,?,?,?,?)");
                        sqlestud.setString(1, txtnoiden.getText());
                        sqlestud.setString(2, "Postgrado");
                        sqlestud.setString(3, post_programa4);
                        sqlestud.setString(4, post_nom_institucion4);
                        sqlestud.setString(5, post_ciudad_inst4);
                        sqlestud.setString(6, post_anio_inst4);
                        sqlestud.setString(7, fechanow);
                        sqlestud.executeUpdate();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "¡Error! No se actualizaron los datos de técnico(1) " + e);
                    }

                    try {

                        //DESDE acá cuando hay más
                        PreparedStatement sqlestud = Conexion.connection.prepareStatement("INSERT INTO escolaridades_poli "
                                + "(no_id, tipo_escol, programa, nom_institucion, ciudad_inst, anio_inst, fechacreacion)"
                                + " VALUES (?,?,?,?,?,?,?)");
                        sqlestud.setString(1, txtnoiden.getText());
                        sqlestud.setString(2, "Postgrado");
                        sqlestud.setString(3, post_programa5);
                        sqlestud.setString(4, post_nom_institucion5);
                        sqlestud.setString(5, post_ciudad_inst5);
                        sqlestud.setString(6, post_anio_inst5);
                        sqlestud.setString(67, fechanow);
                        sqlestud.executeUpdate();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "¡Error! No se actualizaron los datos de técnico(1) " + e);
                    }
                }
            } catch (Exception e) {

            }
        }// con loa 4
        else if ("haypost".equals(poste1) && "haypost2".equals(poste2) && "haypost3".equals(poste3) && "haypost4".equals(poste4)) {

            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM  escolaridades_poli WHERE no_id = " + txtnoiden.getText() + " AND tipo_escol = 'Postgrado'");
                r.next();

                int cune = r.getRow();

                if (cune == 0) {
                    try {

                        //DESDE acá cuando hay más
                        PreparedStatement sqlestud = Conexion.connection.prepareStatement("INSERT INTO escolaridades_poli "
                                + "(no_id, tipo_escol, programa, nom_institucion, ciudad_inst, anio_inst, fechacreacion)"
                                + " VALUES (?,?,?,?,?,?,?)");
                        sqlestud.setString(1, txtnoiden.getText());
                        sqlestud.setString(2, "Postgrado");
                        sqlestud.setString(3, post_programa1);
                        sqlestud.setString(4, post_nom_institucion1);
                        sqlestud.setString(5, post_ciudad_inst1);
                        sqlestud.setString(6, post_anio_inst1);
                        sqlestud.setString(7, fechanow);
                        sqlestud.executeUpdate();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "¡Error! No se actualizaron los datos de técnico(1) " + e);
                    }

                    try {

                        //DESDE acá cuando hay más
                        PreparedStatement sqlestud = Conexion.connection.prepareStatement("INSERT INTO escolaridades_poli "
                                + "(no_id, tipo_escol, programa, nom_institucion, ciudad_inst, anio_inst, fechacreacion)"
                                + " VALUES (?,?,?,?,?,?,?)");
                        sqlestud.setString(1, txtnoiden.getText());
                        sqlestud.setString(2, "Postgrado");
                        sqlestud.setString(3, post_programa2);
                        sqlestud.setString(4, post_nom_institucion2);
                        sqlestud.setString(5, post_ciudad_inst2);
                        sqlestud.setString(6, post_anio_inst2);
                        sqlestud.setString(7, fechanow);
                        sqlestud.executeUpdate();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "¡Error! No se actualizaron los datos de técnico(1) " + e);
                    }

                    try {

                        //DESDE acá cuando hay más
                        PreparedStatement sqlestud = Conexion.connection.prepareStatement("INSERT INTO escolaridades_poli "
                                + "(no_id, tipo_escol, programa, nom_institucion, ciudad_inst, anio_inst, fechacreacion)"
                                + " VALUES (?,?,?,?,?,?,?)");
                        sqlestud.setString(1, txtnoiden.getText());
                        sqlestud.setString(2, "Postgrado");
                        sqlestud.setString(3, post_programa3);
                        sqlestud.setString(4, post_nom_institucion3);
                        sqlestud.setString(5, post_ciudad_inst3);
                        sqlestud.setString(6, post_anio_inst3);
                        sqlestud.setString(7, fechanow);
                        sqlestud.executeUpdate();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "¡Error! No se actualizaron los datos de técnico(1) " + e);
                    }

                    try {

                        //DESDE acá cuando hay más
                        PreparedStatement sqlestud = Conexion.connection.prepareStatement("INSERT INTO escolaridades_poli "
                                + "(no_id, tipo_escol, programa, nom_institucion, ciudad_inst, anio_inst, fechacreacion)"
                                + " VALUES (?,?,?,?,?,?,?)");
                        sqlestud.setString(1, txtnoiden.getText());
                        sqlestud.setString(2, "Postgrado");
                        sqlestud.setString(3, post_programa4);
                        sqlestud.setString(4, post_nom_institucion4);
                        sqlestud.setString(5, post_ciudad_inst4);
                        sqlestud.setString(6, post_anio_inst4);
                        sqlestud.setString(7, fechanow);
                        sqlestud.executeUpdate();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "¡Error! No se actualizaron los datos de técnico(1) " + e);
                    }
                } else {

                    try {
                        PreparedStatement sqlacade = Conexion.connection.prepareStatement("DELETE FROM escolaridades_poli WHERE no_id = " + txtnoiden.getText() + " AND tipo_escol = 'Postgrado'");
                        sqlacade.executeUpdate();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "¡Error! No se actualizaron los datos de técnico(1) " + e);
                    }

                    try {

                        //DESDE acá cuando hay más
                        PreparedStatement sqlestud = Conexion.connection.prepareStatement("INSERT INTO escolaridades_poli "
                                + "(no_id, tipo_escol, programa, nom_institucion, ciudad_inst, anio_inst, fechacreacion)"
                                + " VALUES (?,?,?,?,?,?,?)");
                        sqlestud.setString(1, txtnoiden.getText());
                        sqlestud.setString(2, "Postgrado");
                        sqlestud.setString(3, post_programa1);
                        sqlestud.setString(4, post_nom_institucion1);
                        sqlestud.setString(5, post_ciudad_inst1);
                        sqlestud.setString(6, post_anio_inst1);
                        sqlestud.setString(7, fechanow);
                        sqlestud.executeUpdate();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "¡Error! No se actualizaron los datos de técnico(1) " + e);
                    }

                    try {

                        //DESDE acá cuando hay más
                        PreparedStatement sqlestud = Conexion.connection.prepareStatement("INSERT INTO escolaridades_poli "
                                + "(no_id, tipo_escol, programa, nom_institucion, ciudad_inst, anio_inst, fechacreacion)"
                                + " VALUES (?,?,?,?,?,?,?)");
                        sqlestud.setString(1, txtnoiden.getText());
                        sqlestud.setString(2, "Postgrado");
                        sqlestud.setString(3, post_programa2);
                        sqlestud.setString(4, post_nom_institucion2);
                        sqlestud.setString(5, post_ciudad_inst2);
                        sqlestud.setString(6, post_anio_inst2);
                        sqlestud.setString(7, fechanow);
                        sqlestud.executeUpdate();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "¡Error! No se actualizaron los datos de técnico(1) " + e);
                    }

                    try {

                        //DESDE acá cuando hay más
                        PreparedStatement sqlestud = Conexion.connection.prepareStatement("INSERT INTO escolaridades_poli "
                                + "(no_id, tipo_escol, programa, nom_institucion, ciudad_inst, anio_inst, fechacreacion)"
                                + " VALUES (?,?,?,?,?,?,?)");
                        sqlestud.setString(1, txtnoiden.getText());
                        sqlestud.setString(2, "Postgrado");
                        sqlestud.setString(3, post_programa3);
                        sqlestud.setString(4, post_nom_institucion3);
                        sqlestud.setString(5, post_ciudad_inst3);
                        sqlestud.setString(6, post_anio_inst3);
                        sqlestud.setString(7, fechanow);
                        sqlestud.executeUpdate();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "¡Error! No se actualizaron los datos de técnico(1) " + e);
                    }

                    try {

                        //DESDE acá cuando hay más
                        PreparedStatement sqlestud = Conexion.connection.prepareStatement("INSERT INTO escolaridades_poli "
                                + "(no_id, tipo_escol, programa, nom_institucion, ciudad_inst, anio_inst, fechacreacion)"
                                + " VALUES (?,?,?,?,?,?,?)");
                        sqlestud.setString(1, txtnoiden.getText());
                        sqlestud.setString(2, "Postgrado");
                        sqlestud.setString(3, post_programa4);
                        sqlestud.setString(4, post_nom_institucion4);
                        sqlestud.setString(5, post_ciudad_inst4);
                        sqlestud.setString(6, post_anio_inst4);
                        sqlestud.setString(7, fechanow);
                        sqlestud.executeUpdate();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "¡Error! No se actualizaron los datos de técnico(1) " + e);
                    }
                }
            } catch (Exception e) {

            }// con los 3
        } else if ("haypost".equals(poste1) && "haypost2".equals(poste2) && "haypost3".equals(poste3)) {

            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM  escolaridades_poli WHERE no_id = " + txtnoiden.getText() + " AND tipo_escol = 'Postgrado'");
                r.next();

                int cune = r.getRow();

                if (cune == 0) {
                    try {

                        //DESDE acá cuando hay más
                        PreparedStatement sqlestud = Conexion.connection.prepareStatement("INSERT INTO escolaridades_poli "
                                + "(no_id, tipo_escol, programa, nom_institucion, ciudad_inst, anio_inst, fechacreacion)"
                                + " VALUES (?,?,?,?,?,?,?)");
                        sqlestud.setString(1, txtnoiden.getText());
                        sqlestud.setString(2, "Postgrado");
                        sqlestud.setString(3, post_programa1);
                        sqlestud.setString(4, post_nom_institucion1);
                        sqlestud.setString(5, post_ciudad_inst1);
                        sqlestud.setString(6, post_anio_inst1);
                        sqlestud.setString(7, fechanow);
                        sqlestud.executeUpdate();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "¡Error! No se actualizaron los datos de técnico(1) " + e);
                    }

                    try {

                        //DESDE acá cuando hay más
                        PreparedStatement sqlestud = Conexion.connection.prepareStatement("INSERT INTO escolaridades_poli "
                                + "(no_id, tipo_escol, programa, nom_institucion, ciudad_inst, anio_inst, fechacreacion)"
                                + " VALUES (?,?,?,?,?,?,?)");
                        sqlestud.setString(1, txtnoiden.getText());
                        sqlestud.setString(2, "Postgrado");
                        sqlestud.setString(3, post_programa2);
                        sqlestud.setString(4, post_nom_institucion2);
                        sqlestud.setString(5, post_ciudad_inst2);
                        sqlestud.setString(6, post_anio_inst2);
                        sqlestud.setString(7, fechanow);
                        sqlestud.executeUpdate();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "¡Error! No se actualizaron los datos de técnico(1) " + e);
                    }

                    try {

                        //DESDE acá cuando hay más
                        PreparedStatement sqlestud = Conexion.connection.prepareStatement("INSERT INTO escolaridades_poli "
                                + "(no_id, tipo_escol, programa, nom_institucion, ciudad_inst, anio_inst, fechacreacion)"
                                + " VALUES (?,?,?,?,?,?,?)");
                        sqlestud.setString(1, txtnoiden.getText());
                        sqlestud.setString(2, "Postgrado");
                        sqlestud.setString(3, post_programa3);
                        sqlestud.setString(4, post_nom_institucion3);
                        sqlestud.setString(5, post_ciudad_inst3);
                        sqlestud.setString(6, post_anio_inst3);
                        sqlestud.setString(7, fechanow);
                        sqlestud.executeUpdate();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "¡Error! No se actualizaron los datos de técnico(1) " + e);
                    }

                } else {

                    try {
                        PreparedStatement sqlacade = Conexion.connection.prepareStatement("DELETE FROM escolaridades_poli WHERE no_id = " + txtnoiden.getText() + " AND tipo_escol = 'Postgrado'");
                        sqlacade.executeUpdate();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "¡Error! No se actualizaron los datos de técnico(1) " + e);
                    }

                    try {

                        //DESDE acá cuando hay más
                        PreparedStatement sqlestud = Conexion.connection.prepareStatement("INSERT INTO escolaridades_poli "
                                + "(no_id, tipo_escol, programa, nom_institucion, ciudad_inst, anio_inst, fechacreacion)"
                                + " VALUES (?,?,?,?,?,?,?)");
                        sqlestud.setString(1, txtnoiden.getText());
                        sqlestud.setString(2, "Postgrado");
                        sqlestud.setString(3, post_programa1);
                        sqlestud.setString(4, post_nom_institucion1);
                        sqlestud.setString(5, post_ciudad_inst1);
                        sqlestud.setString(6, post_anio_inst1);
                        sqlestud.setString(7, fechanow);
                        sqlestud.executeUpdate();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "¡Error! No se actualizaron los datos de técnico(1) " + e);
                    }

                    try {

                        //DESDE acá cuando hay más
                        PreparedStatement sqlestud = Conexion.connection.prepareStatement("INSERT INTO escolaridades_poli "
                                + "(no_id, tipo_escol, programa, nom_institucion, ciudad_inst, anio_inst, fechacreacion)"
                                + " VALUES (?,?,?,?,?,?,?)");
                        sqlestud.setString(1, txtnoiden.getText());
                        sqlestud.setString(2, "Postgrado");
                        sqlestud.setString(3, post_programa2);
                        sqlestud.setString(4, post_nom_institucion2);
                        sqlestud.setString(5, post_ciudad_inst2);
                        sqlestud.setString(6, post_anio_inst2);
                        sqlestud.setString(7, fechanow);
                        sqlestud.executeUpdate();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "¡Error! No se actualizaron los datos de técnico(1) " + e);
                    }

                    try {

                        //DESDE acá cuando hay más
                        PreparedStatement sqlestud = Conexion.connection.prepareStatement("INSERT INTO escolaridades_poli "
                                + "(no_id, tipo_escol, programa, nom_institucion, ciudad_inst, anio_inst, fechacreacion)"
                                + " VALUES (?,?,?,?,?,?,?)");
                        sqlestud.setString(1, txtnoiden.getText());
                        sqlestud.setString(2, "Postgrado");
                        sqlestud.setString(3, post_programa3);
                        sqlestud.setString(4, post_nom_institucion3);
                        sqlestud.setString(5, post_ciudad_inst3);
                        sqlestud.setString(6, post_anio_inst3);
                        sqlestud.setString(7, fechanow);
                        sqlestud.executeUpdate();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "¡Error! No se actualizaron los datos de técnico(1) " + e);
                    }
                }
            } catch (Exception e) {

            }// con los 2
        } else if ("haypost".equals(poste1) && "haypost2".equals(poste2)) {

            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM  escolaridades_poli WHERE no_id = " + txtnoiden.getText() + " AND tipo_escol = 'Postgrado'");
                r.next();

                int cune = r.getRow();

                if (cune == 0) {
                    try {

                        //DESDE acá cuando hay más
                        PreparedStatement sqlestud = Conexion.connection.prepareStatement("INSERT INTO escolaridades_poli "
                                + "(no_id, tipo_escol, programa, nom_institucion, ciudad_inst, anio_inst, fechacreacion)"
                                + " VALUES (?,?,?,?,?,?,?)");
                        sqlestud.setString(1, txtnoiden.getText());
                        sqlestud.setString(2, "Postgrado");
                        sqlestud.setString(3, post_programa1);
                        sqlestud.setString(4, post_nom_institucion1);
                        sqlestud.setString(5, post_ciudad_inst1);
                        sqlestud.setString(6, post_anio_inst1);
                        sqlestud.setString(7, fechanow);
                        sqlestud.executeUpdate();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "¡Error! No se actualizaron los datos de técnico(1) " + e);
                    }

                    try {

                        //DESDE acá cuando hay más
                        PreparedStatement sqlestud = Conexion.connection.prepareStatement("INSERT INTO escolaridades_poli "
                                + "(no_id, tipo_escol, programa, nom_institucion, ciudad_inst, anio_inst, fechacreacion)"
                                + " VALUES (?,?,?,?,?,?,?)");
                        sqlestud.setString(1, txtnoiden.getText());
                        sqlestud.setString(2, "Postgrado");
                        sqlestud.setString(3, post_programa2);
                        sqlestud.setString(4, post_nom_institucion2);
                        sqlestud.setString(5, post_ciudad_inst2);
                        sqlestud.setString(6, post_anio_inst2);
                        sqlestud.setString(7, fechanow);
                        sqlestud.executeUpdate();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "¡Error! No se actualizaron los datos de técnico(1) " + e);
                    }
                } else {

                    try {
                        PreparedStatement sqlacade = Conexion.connection.prepareStatement("DELETE FROM escolaridades_poli WHERE no_id = " + txtnoiden.getText() + " AND tipo_escol = 'Postgrado'");
                        sqlacade.executeUpdate();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "¡Error! No se actualizaron los datos de técnico(1) " + e);
                    }

                    try {

                        //DESDE acá cuando hay más
                        PreparedStatement sqlestud = Conexion.connection.prepareStatement("INSERT INTO escolaridades_poli "
                                + "(no_id, tipo_escol, programa, nom_institucion, ciudad_inst, anio_inst, fechacreacion)"
                                + " VALUES (?,?,?,?,?,?,?)");
                        sqlestud.setString(1, txtnoiden.getText());
                        sqlestud.setString(2, "Postgrado");
                        sqlestud.setString(3, post_programa1);
                        sqlestud.setString(4, post_nom_institucion1);
                        sqlestud.setString(5, post_ciudad_inst1);
                        sqlestud.setString(6, post_anio_inst1);
                        sqlestud.setString(7, fechanow);
                        sqlestud.executeUpdate();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "¡Error! No se actualizaron los datos de técnico(1) " + e);
                    }

                    try {

                        //DESDE acá cuando hay más
                        PreparedStatement sqlestud = Conexion.connection.prepareStatement("INSERT INTO escolaridades_poli "
                                + "(no_id, tipo_escol, programa, nom_institucion, ciudad_inst, anio_inst, fechacreacion)"
                                + " VALUES (?,?,?,?,?,?,?)");
                        sqlestud.setString(1, txtnoiden.getText());
                        sqlestud.setString(2, "Postgrado");
                        sqlestud.setString(3, post_programa2);
                        sqlestud.setString(4, post_nom_institucion2);
                        sqlestud.setString(5, post_ciudad_inst2);
                        sqlestud.setString(6, post_anio_inst2);
                        sqlestud.setString(7, fechanow);
                        sqlestud.executeUpdate();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "¡Error! No se actualizaron los datos de técnico(1) " + e);
                    }
                }
            } catch (Exception e) {

            }// con 1
        } else if ("haypost".equals(poste1)) {

            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM  escolaridades_poli WHERE no_id = " + txtnoiden.getText() + " AND tipo_escol = 'Postgrado'");
                r.next();

                int cune = r.getRow();

                if (cune == 0) {
                    try {

                        //DESDE acá cuando hay más
                        PreparedStatement sqlestud = Conexion.connection.prepareStatement("INSERT INTO escolaridades_poli "
                                + "(no_id, tipo_escol, programa, nom_institucion, ciudad_inst, anio_inst, fechacreacion)"
                                + " VALUES (?,?,?,?,?,?,?)");
                        sqlestud.setString(1, txtnoiden.getText());
                        sqlestud.setString(2, "Postgrado");
                        sqlestud.setString(3, post_programa1);
                        sqlestud.setString(4, post_nom_institucion1);
                        sqlestud.setString(5, post_ciudad_inst1);
                        sqlestud.setString(6, post_anio_inst1);
                        sqlestud.setString(7, fechanow);
                        sqlestud.executeUpdate();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "¡Error! No se actualizaron los datos de técnico(1) " + e);
                    }
                } else {

                    try {
                        PreparedStatement sqlacade = Conexion.connection.prepareStatement("DELETE FROM escolaridades_poli WHERE no_id = " + txtnoiden.getText() + " AND tipo_escol = 'Postgrado'");
                        sqlacade.executeUpdate();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "¡Error! No se actualizaron los datos de técnico(1) " + e);
                    }

                    try {

                        //DESDE acá cuando hay más
                        PreparedStatement sqlestud = Conexion.connection.prepareStatement("INSERT INTO escolaridades_poli "
                                + "(no_id, tipo_escol, programa, nom_institucion, ciudad_inst, anio_inst, fechacreacion)"
                                + " VALUES (?,?,?,?,?,?,?)");
                        sqlestud.setString(1, txtnoiden.getText());
                        sqlestud.setString(2, "Postgrado");
                        sqlestud.setString(3, post_programa1);
                        sqlestud.setString(4, post_nom_institucion1);
                        sqlestud.setString(5, post_ciudad_inst1);
                        sqlestud.setString(6, post_anio_inst1);
                        sqlestud.setString(7, fechanow);
                        sqlestud.executeUpdate();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "¡Error! No se actualizaron los datos de técnico(1) " + e);
                    }
                }
            } catch (Exception e) {

            }
        } else if ("nohay".equals(poste1)) {

            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM  escolaridades_poli WHERE no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();

                if (cune > 0) {
                    try {
                        PreparedStatement sqlacade = Conexion.connection.prepareStatement("DELETE FROM escolaridades_poli   WHERE no_id = " + txtnoiden.getText() + " AND tipo_escol = 'Postgrado' ");
                        sqlacade.executeUpdate();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "¡Error! No se actualizaron los datos de técnico(1) " + e);
                    }
                }
            } catch (Exception e) {

            }
        }
    }

    public void validarmaestria() {

        if ("haymaes".equals(maestr1) && "haymaes2".equals(maestr2) && "haymaes3".equals(maestr3) && "haymaes4".equals(maestr4)) {

            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM  escolaridades_poli WHERE no_id = " + txtnoiden.getText() + " AND tipo_escol = 'Maestría'");
                r.next();
                int cune = r.getRow();

                if (cune == 0) {
                    try {

                        PreparedStatement sqlestud = Conexion.connection.prepareStatement("INSERT INTO escolaridades_poli "
                                + "(no_id, tipo_escol, programa, nom_institucion, ciudad_inst, anio_inst, fechacreacion)"
                                + " VALUES (?,?,?,?,?,?,?)");
                        sqlestud.setString(1, txtnoiden.getText());
                        sqlestud.setString(2, "Maestría");
                        sqlestud.setString(3, maes_programa1);
                        sqlestud.setString(4, maes_nom_institucion1);
                        sqlestud.setString(5, maes_ciudad_inst1);
                        sqlestud.setString(6, maes_anio_inst1);
                        sqlestud.setString(7, fechanow);
                        sqlestud.executeUpdate();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "¡Error! No se actualizaron los datos de técnico(1) " + e);
                    }

                    try {

                        PreparedStatement sqlestud = Conexion.connection.prepareStatement("INSERT INTO escolaridades_poli "
                                + "(no_id, tipo_escol, programa, nom_institucion, ciudad_inst, anio_inst, fechacreacion)"
                                + " VALUES (?,?,?,?,?,?,?)");
                        sqlestud.setString(1, txtnoiden.getText());
                        sqlestud.setString(2, "Maestría");
                        sqlestud.setString(3, maes_programa2);
                        sqlestud.setString(4, maes_nom_institucion2);
                        sqlestud.setString(5, maes_ciudad_inst2);
                        sqlestud.setString(6, maes_anio_inst2);
                        sqlestud.setString(7, fechanow);
                        sqlestud.executeUpdate();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "¡Error! No se actualizaron los datos de técnico(1) " + e);
                    }

                    try {

                        //DESDE acá cuando hay más
                        System.out.println("el maldito tercer dato");
                        PreparedStatement sqlestud = Conexion.connection.prepareStatement("INSERT INTO escolaridades_poli "
                                + "(no_id, tipo_escol, programa, nom_institucion, ciudad_inst, anio_inst, fechacreacion)"
                                + " VALUES (?,?,?,?,?,?,?)");
                        sqlestud.setString(1, txtnoiden.getText());
                        sqlestud.setString(2, "Maestría");
                        sqlestud.setString(3, maes_programa3);
                        sqlestud.setString(4, maes_nom_institucion3);
                        sqlestud.setString(5, maes_ciudad_inst3);
                        sqlestud.setString(6, maes_anio_inst3);
                        sqlestud.setString(7, fechanow);
                        sqlestud.executeUpdate();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "¡Error! No se actualizaron los datos de técnico(1) " + e);
                    }

                    try {

                        //DESDE acá cuando hay más
                        PreparedStatement sqlestud = Conexion.connection.prepareStatement("INSERT INTO escolaridades_poli "
                                + "(no_id, tipo_escol, programa, nom_institucion, ciudad_inst, anio_inst, fechacreacion)"
                                + " VALUES (?,?,?,?,?,?,?)");
                        sqlestud.setString(1, txtnoiden.getText());
                        sqlestud.setString(2, "Maestría");
                        sqlestud.setString(3, maes_programa4);
                        sqlestud.setString(4, maes_nom_institucion4);
                        sqlestud.setString(5, maes_ciudad_inst4);
                        sqlestud.setString(6, maes_anio_inst4);
                        sqlestud.setString(7, fechanow);
                        sqlestud.executeUpdate();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "¡Error! No se actualizaron los datos de técnico(1) " + e);
                    }
                } else {

                    try {
                        PreparedStatement sqlacade = Conexion.connection.prepareStatement("DELETE FROM escolaridades_poli WHERE no_id = " + txtnoiden.getText() + " AND tipo_escol = 'Maestría'");
                        sqlacade.executeUpdate();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "¡Error! No se actualizaron los datos de técnico(1) " + e);
                    }
                    try {

                        //DESDE acá cuando hay más
                        PreparedStatement sqlestud = Conexion.connection.prepareStatement("INSERT INTO escolaridades_poli "
                                + "(no_id, tipo_escol, programa, nom_institucion, ciudad_inst, anio_inst, fechacreacion)"
                                + " VALUES (?,?,?,?,?,?,?)");
                        sqlestud.setString(1, txtnoiden.getText());
                        sqlestud.setString(2, "Maestría");
                        sqlestud.setString(3, maes_programa1);
                        sqlestud.setString(4, maes_nom_institucion1);
                        sqlestud.setString(5, maes_ciudad_inst1);
                        sqlestud.setString(6, maes_anio_inst1);
                        sqlestud.setString(7, fechanow);
                        sqlestud.executeUpdate();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "¡Error! No se actualizaron los datos de técnico(1) " + e);
                    }

                    try {

                        //DESDE acá cuando hay más
                        System.out.println("el maldito segundo dato");
                        PreparedStatement sqlestud = Conexion.connection.prepareStatement("INSERT INTO escolaridades_poli "
                                + "(no_id, tipo_escol, programa, nom_institucion, ciudad_inst, anio_inst, fechacreacion)"
                                + " VALUES (?,?,?,?,?,?,?)");
                        sqlestud.setString(1, txtnoiden.getText());
                        sqlestud.setString(2, "Maestría");
                        sqlestud.setString(3, maes_programa2);
                        sqlestud.setString(4, maes_nom_institucion2);
                        sqlestud.setString(5, maes_ciudad_inst2);
                        sqlestud.setString(6, maes_anio_inst2);
                        sqlestud.setString(7, fechanow);
                        sqlestud.executeUpdate();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "¡Error! No se actualizaron los datos de técnico(1) " + e);
                    }

                    try {

                        //DESDE acá cuando hay más
                        System.out.println("el maldito tercer dato");
                        PreparedStatement sqlestud = Conexion.connection.prepareStatement("INSERT INTO escolaridades_poli "
                                + "(no_id, tipo_escol, programa, nom_institucion, ciudad_inst, anio_inst, fechacreacion)"
                                + " VALUES (?,?,?,?,?,?,?)");
                        sqlestud.setString(1, txtnoiden.getText());
                        sqlestud.setString(2, "Maestría");
                        sqlestud.setString(3, maes_programa3);
                        sqlestud.setString(4, maes_nom_institucion3);
                        sqlestud.setString(5, maes_ciudad_inst3);
                        sqlestud.setString(6, maes_anio_inst3);
                        sqlestud.setString(7, fechanow);
                        sqlestud.executeUpdate();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "¡Error! No se actualizaron los datos de técnico(1) " + e);
                    }

                    try {

                        //DESDE acá cuando hay más
                        PreparedStatement sqlestud = Conexion.connection.prepareStatement("INSERT INTO escolaridades_poli "
                                + "(no_id, tipo_escol, programa, nom_institucion, ciudad_inst, anio_inst, fechacreacion)"
                                + " VALUES (?,?,?,?,?,?,?)");
                        sqlestud.setString(1, txtnoiden.getText());
                        sqlestud.setString(2, "Maestría");
                        sqlestud.setString(3, maes_programa4);
                        sqlestud.setString(4, maes_nom_institucion4);
                        sqlestud.setString(5, maes_ciudad_inst4);
                        sqlestud.setString(6, maes_anio_inst4);
                        sqlestud.setString(7, fechanow);
                        sqlestud.executeUpdate();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "¡Error! No se actualizaron los datos de técnico(1) " + e);
                    }
                }
            } catch (Exception e) {
            }
        } else //con los 3
        if ("haymaes".equals(maestr1) && "haymaes2".equals(maestr2) && "haymaes3".equals(maestr3)) {

            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM  escolaridades_poli WHERE no_id = " + txtnoiden.getText() + " AND tipo_escol = 'Maestría'");
                r.next();
                int cune = r.getRow();

                if (cune == 0) {
                    try {

                        //DESDE acá cuando hay más
                        PreparedStatement sqlestud = Conexion.connection.prepareStatement("INSERT INTO escolaridades_poli "
                                + "(no_id, tipo_escol, programa, nom_institucion, ciudad_inst, anio_inst, fechacreacion)"
                                + " VALUES (?,?,?,?,?,?,?)");
                        sqlestud.setString(1, txtnoiden.getText());
                        sqlestud.setString(2, "Maestría");
                        sqlestud.setString(3, maes_programa1);
                        sqlestud.setString(4, maes_nom_institucion1);
                        sqlestud.setString(5, maes_ciudad_inst1);
                        sqlestud.setString(6, maes_anio_inst1);
                        sqlestud.setString(7, fechanow);
                        sqlestud.executeUpdate();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "¡Error! No se actualizaron los datos de técnico(1) " + e);
                    }

                    try {

                        //DESDE acá cuando hay más
                        PreparedStatement sqlestud = Conexion.connection.prepareStatement("INSERT INTO escolaridades_poli "
                                + "(no_id, tipo_escol, programa, nom_institucion, ciudad_inst, anio_inst, fechacreacion)"
                                + " VALUES (?,?,?,?,?,?,?)");
                        sqlestud.setString(1, txtnoiden.getText());
                        sqlestud.setString(2, "Maestría");
                        sqlestud.setString(3, maes_programa2);
                        sqlestud.setString(4, maes_nom_institucion2);
                        sqlestud.setString(5, maes_ciudad_inst2);
                        sqlestud.setString(6, maes_anio_inst2);
                        sqlestud.setString(7, fechanow);
                        sqlestud.executeUpdate();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "¡Error! No se actualizaron los datos de técnico(1) " + e);
                    }

                    try {

                        //DESDE acá cuando hay más
                        PreparedStatement sqlestud = Conexion.connection.prepareStatement("INSERT INTO escolaridades_poli "
                                + "(no_id, tipo_escol, programa, nom_institucion, ciudad_inst, anio_inst, fechacreacion)"
                                + " VALUES (?,?,?,?,?,?,?)");
                        sqlestud.setString(1, txtnoiden.getText());
                        sqlestud.setString(2, "Maestría");
                        sqlestud.setString(3, maes_programa3);
                        sqlestud.setString(4, maes_nom_institucion3);
                        sqlestud.setString(5, maes_ciudad_inst3);
                        sqlestud.setString(6, maes_anio_inst3);
                        sqlestud.setString(7, fechanow);
                        sqlestud.executeUpdate();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "¡Error! No se actualizaron los datos de técnico(1) " + e);
                    }
                } else {

                    try {
                        PreparedStatement sqlacade = Conexion.connection.prepareStatement("DELETE FROM escolaridades_poli WHERE no_id = " + txtnoiden.getText() + " AND tipo_escol = 'Maestría'");
                        sqlacade.executeUpdate();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "¡Error! No se actualizaron los datos de técnico(1) " + e);
                    }
                    try {

                        //DESDE acá cuando hay más
                        PreparedStatement sqlestud = Conexion.connection.prepareStatement("INSERT INTO escolaridades_poli "
                                + "(no_id, tipo_escol, programa, nom_institucion, ciudad_inst, anio_inst, fechacreacion)"
                                + " VALUES (?,?,?,?,?,?,?)");
                        sqlestud.setString(1, txtnoiden.getText());
                        sqlestud.setString(2, "Maestría");
                        sqlestud.setString(3, maes_programa1);
                        sqlestud.setString(4, maes_nom_institucion1);
                        sqlestud.setString(5, maes_ciudad_inst1);
                        sqlestud.setString(6, maes_anio_inst1);
                        sqlestud.setString(7, fechanow);
                        sqlestud.executeUpdate();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "¡Error! No se actualizaron los datos de técnico(1) " + e);
                    }

                    try {

                        //DESDE acá cuando hay más
                        PreparedStatement sqlestud = Conexion.connection.prepareStatement("INSERT INTO escolaridades_poli "
                                + "(no_id, tipo_escol, programa, nom_institucion, ciudad_inst, anio_inst, fechacreacion)"
                                + " VALUES (?,?,?,?,?,?,?)");
                        sqlestud.setString(1, txtnoiden.getText());
                        sqlestud.setString(2, "Maestría");
                        sqlestud.setString(3, maes_programa2);
                        sqlestud.setString(4, maes_nom_institucion2);
                        sqlestud.setString(5, maes_ciudad_inst2);
                        sqlestud.setString(6, maes_anio_inst2);
                        sqlestud.setString(7, fechanow);
                        sqlestud.executeUpdate();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "¡Error! No se actualizaron los datos de técnico(1) " + e);
                    }

                    try {

                        //DESDE acá cuando hay más
                        System.out.println("el maldito tercer dato");
                        PreparedStatement sqlestud = Conexion.connection.prepareStatement("INSERT INTO escolaridades_poli "
                                + "(no_id, tipo_escol, programa, nom_institucion, ciudad_inst, anio_inst, fechacreacion)"
                                + " VALUES (?,?,?,?,?,?,?)");
                        sqlestud.setString(1, txtnoiden.getText());
                        sqlestud.setString(2, "Maestría");
                        sqlestud.setString(3, maes_programa3);
                        sqlestud.setString(4, maes_nom_institucion3);
                        sqlestud.setString(5, maes_ciudad_inst3);
                        sqlestud.setString(6, maes_anio_inst3);
                        sqlestud.setString(7, fechanow);
                        sqlestud.executeUpdate();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "¡Error! No se actualizaron los datos de técnico(1) " + e);
                    }

                }
            } catch (Exception e) {
            } //con los 2
        } else if ("haymaes".equals(maestr1) && "haymaes2".equals(maestr2)) {

            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM  escolaridades_poli WHERE no_id = " + txtnoiden.getText() + " AND tipo_escol = 'Maestría'");
                r.next();
                int cune = r.getRow();

                if (cune == 0) {
                    try {

                        //DESDE acá cuando hay más
                        PreparedStatement sqlestud = Conexion.connection.prepareStatement("INSERT INTO escolaridades_poli "
                                + "(no_id, tipo_escol, programa, nom_institucion, ciudad_inst, anio_inst, fechacreacion)"
                                + " VALUES (?,?,?,?,?,?,?)");
                        sqlestud.setString(1, txtnoiden.getText());
                        sqlestud.setString(2, "Maestría");
                        sqlestud.setString(3, maes_programa1);
                        sqlestud.setString(4, maes_nom_institucion1);
                        sqlestud.setString(5, maes_ciudad_inst1);
                        sqlestud.setString(6, maes_anio_inst1);
                        sqlestud.setString(7, fechanow);
                        sqlestud.executeUpdate();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "¡Error! No se actualizaron los datos de técnico(1) " + e);
                    }

                    try {

                        //DESDE acá cuando hay más
                        System.out.println("el maldito segundo dato");
                        PreparedStatement sqlestud = Conexion.connection.prepareStatement("INSERT INTO escolaridades_poli "
                                + "(no_id, tipo_escol, programa, nom_institucion, ciudad_inst, anio_inst, fechacreacion)"
                                + " VALUES (?,?,?,?,?,?,?)");
                        sqlestud.setString(1, txtnoiden.getText());
                        sqlestud.setString(2, "Maestría");
                        sqlestud.setString(3, maes_programa2);
                        sqlestud.setString(4, maes_nom_institucion2);
                        sqlestud.setString(5, maes_ciudad_inst2);
                        sqlestud.setString(6, maes_anio_inst2);
                        sqlestud.setString(7, fechanow);
                        sqlestud.executeUpdate();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "¡Error! No se actualizaron los datos de técnico(1) " + e);
                    }
                } else {

                    try {
                        PreparedStatement sqlacade = Conexion.connection.prepareStatement("DELETE FROM escolaridades_poli WHERE no_id = " + txtnoiden.getText() + " AND tipo_escol = 'Maestría'");
                        sqlacade.executeUpdate();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "¡Error! No se actualizaron los datos de técnico(1) " + e);
                    }
                    try {

                        //DESDE acá cuando hay más
                        PreparedStatement sqlestud = Conexion.connection.prepareStatement("INSERT INTO escolaridades_poli "
                                + "(no_id, tipo_escol, programa, nom_institucion, ciudad_inst, anio_inst, fechacreacion)"
                                + " VALUES (?,?,?,?,?,?,?)");
                        sqlestud.setString(1, txtnoiden.getText());
                        sqlestud.setString(2, "Maestría");
                        sqlestud.setString(3, maes_programa1);
                        sqlestud.setString(4, maes_nom_institucion1);
                        sqlestud.setString(5, maes_ciudad_inst1);
                        sqlestud.setString(6, maes_anio_inst1);
                        sqlestud.setString(7, fechanow);
                        sqlestud.executeUpdate();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "¡Error! No se actualizaron los datos de técnico(1) " + e);
                    }

                    try {

                        //DESDE acá cuando hay más
                        PreparedStatement sqlestud = Conexion.connection.prepareStatement("INSERT INTO escolaridades_poli "
                                + "(no_id, tipo_escol, programa, nom_institucion, ciudad_inst, anio_inst, fechacreacion)"
                                + " VALUES (?,?,?,?,?,?,?)");
                        sqlestud.setString(1, txtnoiden.getText());
                        sqlestud.setString(2, "Maestría");
                        sqlestud.setString(3, maes_programa2);
                        sqlestud.setString(4, maes_nom_institucion2);
                        sqlestud.setString(5, maes_ciudad_inst2);
                        sqlestud.setString(6, maes_anio_inst2);
                        sqlestud.setString(7, fechanow);
                        sqlestud.executeUpdate();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "¡Error! No se actualizaron los datos de técnico(1) " + e);
                    }

                }
            } catch (Exception e) {
            }
        } else //con 1
        if ("haymaes".equals(maestr1)) {

            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM  escolaridades_poli WHERE no_id = " + txtnoiden.getText() + " AND tipo_escol = 'Maestría'");
                r.next();
                int cune = r.getRow();

                if (cune == 0) {
                    try {

                        //DESDE acá cuando hay más
                        PreparedStatement sqlestud = Conexion.connection.prepareStatement("INSERT INTO escolaridades_poli "
                                + "(no_id, tipo_escol, programa, nom_institucion, ciudad_inst, anio_inst, fechacreacion)"
                                + " VALUES (?,?,?,?,?,?,?)");
                        sqlestud.setString(1, txtnoiden.getText());
                        sqlestud.setString(2, "Maestría");
                        sqlestud.setString(3, maes_programa1);
                        sqlestud.setString(4, maes_nom_institucion1);
                        sqlestud.setString(5, maes_ciudad_inst1);
                        sqlestud.setString(6, maes_anio_inst1);
                        sqlestud.setString(7, fechanow);
                        sqlestud.executeUpdate();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "¡Error! No se actualizaron los datos de técnico(1) " + e);
                    }
                } else {

                    try {
                        PreparedStatement sqlacade = Conexion.connection.prepareStatement("DELETE FROM escolaridades_poli WHERE no_id = " + txtnoiden.getText() + " AND tipo_escol = 'Maestría'");
                        sqlacade.executeUpdate();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "¡Error! No se actualizaron los datos de técnico(1) " + e);
                    }
                    try {

                        //DESDE acá cuando hay más
                        PreparedStatement sqlestud = Conexion.connection.prepareStatement("INSERT INTO escolaridades_poli "
                                + "(no_id, tipo_escol, programa, nom_institucion, ciudad_inst, anio_inst, fechacreacion)"
                                + " VALUES (?,?,?,?,?,?,?)");
                        sqlestud.setString(1, txtnoiden.getText());
                        sqlestud.setString(2, "Maestría");
                        sqlestud.setString(3, maes_programa1);
                        sqlestud.setString(4, maes_nom_institucion1);
                        sqlestud.setString(5, maes_ciudad_inst1);
                        sqlestud.setString(6, maes_anio_inst1);
                        sqlestud.setString(7, fechanow);
                        sqlestud.executeUpdate();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "¡Error! No se actualizaron los datos de técnico(1) " + e);
                    }

                }
            } catch (Exception e) {
            }
        } else if ("nohay".equals(maestr1)) {

            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM  escolaridades_poli WHERE no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();

                if (cune > 0) {
                    try {
                        PreparedStatement sqlacade = Conexion.connection.prepareStatement("DELETE FROM escolaridades_poli   WHERE no_id = " + txtnoiden.getText() + " AND tipo_escol = 'Maestría' ");
                        sqlacade.executeUpdate();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "¡Error! No se actualizaron los datos de técnico(1) " + e);
                    }
                }
            } catch (Exception e) {

            }
        }
    }

    public void validardoctorado() {

        if ("haydocto".equals(docto1) && "haydocto2".equals(docto2)) {

            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM  escolaridades_poli WHERE no_id = " + txtnoiden.getText() + " AND tipo_escol = 'Doctorado'");
                r.next();
                int cune = r.getRow();

                if (cune == 0) {
                    try {

                        //DESDE acá cuando hay más
                        PreparedStatement sqlestud = Conexion.connection.prepareStatement("INSERT INTO escolaridades_poli "
                                + "(no_id, tipo_escol, programa, nom_institucion, ciudad_inst, anio_inst, fechacreacion)"
                                + " VALUES (?,?,?,?,?,?,?)");
                        sqlestud.setString(1, txtnoiden.getText());
                        sqlestud.setString(2, "Doctorado");
                        sqlestud.setString(3, doct_programa1);
                        sqlestud.setString(4, doct_nom_institucion1);
                        sqlestud.setString(5, doct_ciudad_inst1);
                        sqlestud.setString(6, doct_anio_inst1);
                        sqlestud.setString(7, fechanow);
                        sqlestud.executeUpdate();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "¡Error! No se actualizaron los datos de técnico(1) " + e);
                    }

                    try {

                        //DESDE acá cuando hay más
                        PreparedStatement sqlestud = Conexion.connection.prepareStatement("INSERT INTO escolaridades_poli "
                                + "(no_id, tipo_escol, programa, nom_institucion, ciudad_inst, anio_inst, fechacreacion)"
                                + " VALUES (?,?,?,?,?,?,?)");
                        sqlestud.setString(1, txtnoiden.getText());
                        sqlestud.setString(2, "Doctorado");
                        sqlestud.setString(3, doct_programa2);
                        sqlestud.setString(4, doct_nom_institucion2);
                        sqlestud.setString(5, doct_ciudad_inst2);
                        sqlestud.setString(6, doct_anio_inst2);
                        sqlestud.setString(7, fechanow);
                        sqlestud.executeUpdate();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "¡Error! No se actualizaron los datos de técnico(1) " + e);
                    }
                } else {

                    try {
                        PreparedStatement sqlacade = Conexion.connection.prepareStatement("DELETE FROM escolaridades_poli WHERE no_id = " + txtnoiden.getText() + " AND tipo_escol = 'Doctorado'");
                        sqlacade.executeUpdate();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "¡Error! No se actualizaron los datos de técnico(1) " + e);
                    }
                    try {

                        //DESDE acá cuando hay más
                        PreparedStatement sqlestud = Conexion.connection.prepareStatement("INSERT INTO escolaridades_poli "
                                + "(no_id, tipo_escol, programa, nom_institucion, ciudad_inst, anio_inst, fechacreacion)"
                                + " VALUES (?,?,?,?,?,?,?)");
                        sqlestud.setString(1, txtnoiden.getText());
                        sqlestud.setString(2, "Doctorado");
                        sqlestud.setString(3, doct_programa1);
                        sqlestud.setString(4, doct_nom_institucion1);
                        sqlestud.setString(5, doct_ciudad_inst1);
                        sqlestud.setString(6, doct_anio_inst1);
                        sqlestud.setString(7, fechanow);
                        sqlestud.executeUpdate();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "¡Error! No se actualizaron los datos de técnico(1) " + e);
                    }

                    try {

                        //DESDE acá cuando hay más
                        PreparedStatement sqlestud = Conexion.connection.prepareStatement("INSERT INTO escolaridades_poli "
                                + "(no_id, tipo_escol, programa, nom_institucion, ciudad_inst, anio_inst, fechacreacion)"
                                + " VALUES (?,?,?,?,?,?,?)");
                        sqlestud.setString(1, txtnoiden.getText());
                        sqlestud.setString(2, "Doctorado");
                        sqlestud.setString(3, doct_programa2);
                        sqlestud.setString(4, doct_nom_institucion2);
                        sqlestud.setString(5, doct_ciudad_inst2);
                        sqlestud.setString(6, doct_anio_inst2);
                        sqlestud.setString(7, fechanow);
                        sqlestud.executeUpdate();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "¡Error! No se actualizaron los datos de técnico(1) " + e);
                    }

                }
            } catch (Exception e) {
            }
        } else //con 1
        if ("haydocto".equals(docto1)) {

            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM  escolaridades_poli WHERE no_id = " + txtnoiden.getText() + " AND tipo_escol = 'Doctorado'");
                r.next();
                int cune = r.getRow();

                if (cune == 0) {
                    try {

                        //DESDE acá cuando hay más
                        PreparedStatement sqlestud = Conexion.connection.prepareStatement("INSERT INTO escolaridades_poli "
                                + "(no_id, tipo_escol, programa, nom_institucion, ciudad_inst, anio_inst, fechacreacion)"
                                + " VALUES (?,?,?,?,?,?,?)");
                        sqlestud.setString(1, txtnoiden.getText());
                        sqlestud.setString(2, "Doctorado");
                        sqlestud.setString(3, doct_programa1);
                        sqlestud.setString(4, doct_nom_institucion1);
                        sqlestud.setString(5, doct_ciudad_inst1);
                        sqlestud.setString(6, doct_anio_inst1);
                        sqlestud.setString(7, fechanow);
                        sqlestud.executeUpdate();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "¡Error! No se actualizaron los datos de técnico(1) " + e);
                    }
                } else {

                    try {
                        PreparedStatement sqlacade = Conexion.connection.prepareStatement("DELETE FROM escolaridades_poli WHERE no_id = " + txtnoiden.getText() + " AND tipo_escol = 'Doctorado'");
                        sqlacade.executeUpdate();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "¡Error! No se actualizaron los datos de técnico(1) " + e);
                    }
                    try {

                        //DESDE acá cuando hay más
                        PreparedStatement sqlestud = Conexion.connection.prepareStatement("INSERT INTO escolaridades_poli "
                                + "(no_id, tipo_escol, programa, nom_institucion, ciudad_inst, anio_inst, fechacreacion)"
                                + " VALUES (?,?,?,?,?,?,?)");
                        sqlestud.setString(1, txtnoiden.getText());
                        sqlestud.setString(2, "Doctorado");
                        sqlestud.setString(3, doct_programa1);
                        sqlestud.setString(4, doct_nom_institucion1);
                        sqlestud.setString(5, doct_ciudad_inst1);
                        sqlestud.setString(6, doct_anio_inst1);
                        sqlestud.setString(7, fechanow);
                        sqlestud.executeUpdate();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "¡Error! No se actualizaron los datos de técnico(1) " + e);
                    }

                }
            } catch (Exception e) {
            }
        } else if ("nohay".equals(docto1)) {

            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM  escolaridades_poli WHERE no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();

                if (cune > 0) {
                    try {
                        PreparedStatement sqlacade = Conexion.connection.prepareStatement("DELETE FROM escolaridades_poli   WHERE no_id = " + txtnoiden.getText() + " AND tipo_escol = 'Doctorado' ");
                        sqlacade.executeUpdate();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "¡Error! No se actualizaron los datos de técnico(1) " + e);
                    }
                }
            } catch (Exception e) {

            }
        }

    }

    public void validarsest() {
        if ("Sí".equals(estaestudiando)) {

            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM  estudiando_poli WHERE no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();

                if (cune == 0) {
                    try {
                        PreparedStatement sqlestud = Conexion.connection.prepareStatement("INSERT INTO estudiando_poli "
                                + "(no_id, no_semestre, nom_prog_acad, nom_inst_prog_acad, nom_ciudad_prog, jorn_prog_acad, estadoestusus, fechacreacion)"
                                + " VALUES (?,?,?,?,?,?,?,?)");
                        sqlestud.setString(1, txtnoiden.getText());
                        sqlestud.setString(2, no_semestre);
                        sqlestud.setString(3, nom_prog_acad);
                        sqlestud.setString(4, nom_inst_prog_acad);
                        sqlestud.setString(5, nom_ciudad_prog);
                        sqlestud.setString(6, jorn_prog_acad);
                        sqlestud.setString(7, "Estudiando");
                        sqlestud.setString(8, fechanow);
                        sqlestud.executeUpdate();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "¡Error! No se actualizaron los datos de técnico(1) " + e);
                    }

                } else {

                    try {
                        PreparedStatement sqlacade = Conexion.connection.prepareStatement("UPDATE estudiando_poli "
                                + "SET no_semestre = '" + no_semestre + "', nom_prog_acad = '" + nom_prog_acad + "', nom_inst_prog_acad = '" + nom_inst_prog_acad + "',"
                                + " nom_ciudad_prog = '" + nom_ciudad_prog + "', jorn_prog_acad = '" + jorn_prog_acad + "', estadoestusus = 'Estudiando'  WHERE no_id = " + txtnoiden.getText() + "  ");
                        sqlacade.executeUpdate();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "¡Error! No se actualizaron los datos del estado de estudiando " + e);
                    }

                }
                try {
                    PreparedStatement sqlacade = Conexion.connection.prepareStatement("UPDATE datos_generales_poli "
                            + "SET estaestudiando = 'Sí'  WHERE no_id = " + txtnoiden.getText() + " AND fechacreacion =  '" + fechanow + "' ");
                    sqlacade.executeUpdate();
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "¡Error! No se actualizó el estado de estudios " + e);
                }

            } catch (Exception e) {

            }
        } else if (("No".equals(estaestudiando) || "-".equals(estaestudiando)) && "No".equals(estadoestusus) || "-".equals(estadoestusus)) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM  estudiando_poli WHERE no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();

                if (cune > 0) {
                    try {
                        PreparedStatement sqlacade = Conexion.connection.prepareStatement("DELETE FROM estudiando_poli   WHERE no_id = " + txtnoiden.getText());
                        sqlacade.executeUpdate();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "¡Error! No se actualizaron los datos de técnico(1) " + e);
                    }
                }
            } catch (Exception e) {

            }
            try {
                PreparedStatement sqlacade = Conexion.connection.prepareStatement("UPDATE datos_generales_poli "
                        + "SET estaestudiando = 'No'  WHERE no_id = " + txtnoiden.getText() + " AND fechacreacion =  '" + fechanow + "' ");
                sqlacade.executeUpdate();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "¡Error! No se actualizó el estado de estudios " + e);
            }
        } else if ("No".equals(estaestudiando) && "Sí".equals(estadoestusus)) {

            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM  estudiando_poli WHERE no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();

                if (cune == 0) {
                    try {
                        PreparedStatement sqlestud = Conexion.connection.prepareStatement("INSERT INTO estudiando_poli "
                                + "(no_id, no_semestre, nom_prog_acad, nom_inst_prog_acad, nom_ciudad_prog, jorn_prog_acad, estadoestusus, explestadoestusus, aniosuspension, fechacreacion)"
                                + " VALUES (?,?,?,?,?,?,?,?,?,?)");
                        sqlestud.setString(1, txtnoiden.getText());
                        sqlestud.setString(2, no_semestre);
                        sqlestud.setString(3, nom_prog_acad);
                        sqlestud.setString(4, nom_institucion);
                        sqlestud.setString(5, nom_ciudad_prog);
                        sqlestud.setString(6, jorn_prog_acad);
                        sqlestud.setString(7, "Suspendido");
                        sqlestud.setString(8, estadoestusus);
                        sqlestud.setString(9, aniosuspension);
                        sqlestud.setString(10, fechanow);
                        sqlestud.executeUpdate();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "¡Error! No se actualizaron los datos de técnico(1) " + e);
                    }
                } else {
                    try {
                        PreparedStatement sqlacade = Conexion.connection.prepareStatement("UPDATE estudiando_poli "
                                + "SET no_semestre = " + no_semestre + ", nom_prog_acad = '" + nom_prog_acad + "', nom_inst_prog_acad = '" + nom_inst_prog_acad + "',"
                                + " nom_ciudad_prog = '" + nom_ciudad_prog + "', jorn_prog_acad = '" + jorn_prog_acad + "', estadoestusus = 'Suspendido', explestadoestusus  ='" + explestadoestusus + "', aniosuspension =  " + aniosuspension + " WHERE no_id = " + txtnoiden.getText() + "  ");
                        sqlacade.executeUpdate();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "¡Error! No se actualizaron los datos de técnico(1) " + e);
                    }
                }
            } catch (Exception e) {

            }
            try {
                PreparedStatement sqlacade = Conexion.connection.prepareStatement("UPDATE datos_generales_poli "
                        + "SET estaestudiando = 'No'  WHERE no_id = " + txtnoiden.getText() + " AND fechacreacion =  '" + fechanow + "' ");
                sqlacade.executeUpdate();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "¡Error! No se actualizó el estado de estudios " + e);
            }
        }
    }

    public void limpiar() {
        primari = "";
        bachille = "";
        tecnic1 = "";
        tecnic2 = "";
        tecnic3 = "";
        tecnic4 = "";
        tecnol1 = "";
        tecnol2 = "";
        tecnol3 = "";
        tecnol4 = "";

        profes1 = "";
        profes2 = "";
        profes3 = "";
        profes4 = "";
        profes5 = "";

        poste1 = "";
        poste2 = "";
        poste3 = "";
        poste4 = "";
        poste5 = "";

        maestr1 = "";
        maestr2 = "";
        maestr3 = "";
        maestr4 = "";

        docto1 = "";
        docto2 = "";

        estaestudiando = "-";

        tipo_escol = "";
        programa = "";
        nom_institucion = "";
        ciudad_inst = "";
        anio_inst = "";

        prim_nom_institucion1 = "";
        prim_ciudad_inst1 = "";
        prim_anio_inst1 = "";

        bachi_tipo_institucion1 = "";
        bachi_nom_institucion1 = "";
        bachi_ciudad_inst1 = "";
        bachi_anio_inst1 = "";

        tecni_tipo_escol1 = "";
        tecni_programa1 = "";
        tecni_nom_institucion1 = "";
        tecni_ciudad_inst1 = "";
        tecni_anio_inst1 = "";
        tecni_tipo_escol2 = "";
        tecni_programa2 = "";
        tecni_nom_institucion2 = "";
        tecni_ciudad_inst2 = "";
        tecni_anio_inst2 = "";
        tecni_tipo_escol3 = "";
        tecni_programa3 = "";
        tecni_nom_institucion3 = "";
        tecni_ciudad_inst3 = "";
        tecni_anio_inst3 = "";
        tecni_tipo_escol4 = "";
        tecni_programa4 = "";
        tecni_nom_institucion4 = "";
        tecni_ciudad_inst4 = "";
        tecni_anio_inst4 = "";

        tecno_tipo_escol1 = "";
        tecno_programa1 = "";
        tecno_nom_institucion1 = "";
        tecno_ciudad_inst1 = "";
        tecno_anio_inst1 = "";
        tecno_tipo_escol2 = "";
        tecno_programa2 = "";
        tecno_nom_institucion2 = "";
        tecno_ciudad_inst2 = "";
        tecno_anio_inst2 = "";
        tecno_tipo_escol3 = "";
        tecno_programa3 = "";
        tecno_nom_institucion3 = "";
        tecno_ciudad_inst3 = "";
        tecno_anio_inst3 = "";
        tecno_tipo_escol4 = "";
        tecno_programa4 = "";
        tecno_nom_institucion4 = "";
        tecno_ciudad_inst4 = "";
        tecno_anio_inst4 = "";

        profe_tipo_escol1 = "";
        profe_programa1 = "";
        profe_nom_institucion1 = "";
        profe_ciudad_inst1 = "";
        profe_anio_inst1 = "";
        profe_tipo_escol2 = "";
        profe_programa2 = "";
        profe_nom_institucion2 = "";
        profe_ciudad_inst2 = "";
        profe_anio_inst2 = "";
        profe_tipo_escol3 = "";
        profe_programa3 = "";
        profe_nom_institucion3 = "";
        profe_ciudad_inst3 = "";
        profe_anio_inst3 = "";
        profe_tipo_escol4 = "";
        profe_programa4 = "";
        profe_nom_institucion4 = "";
        profe_ciudad_inst4 = "";
        profe_anio_inst4 = "";
        profe_tipo_escol5 = "";
        profe_programa5 = "";
        profe_nom_institucion5 = "";
        profe_ciudad_inst5 = "";
        profe_anio_inst5 = "";

        post_tipo_escol1 = "";
        post_programa1 = "";
        post_nom_institucion1 = "";
        post_ciudad_inst1 = "";
        post_anio_inst1 = "";
        post_tipo_escol2 = "";
        post_programa2 = "";
        post_nom_institucion2 = "";
        post_ciudad_inst2 = "";
        post_anio_inst2 = "";
        post_tipo_escol3 = "";
        post_programa3 = "";
        post_nom_institucion3 = "";
        post_ciudad_inst3 = "";
        post_anio_inst3 = "";
        post_tipo_escol4 = "";
        post_programa4 = "";
        post_nom_institucion4 = "";
        post_ciudad_inst4 = "";
        post_anio_inst4 = "";
        post_tipo_escol5 = "";
        post_programa5 = "";
        post_nom_institucion5 = "";
        post_ciudad_inst5 = "";
        post_anio_inst5 = "";

        maes_tipo_escol1 = "";
        maes_programa1 = "";
        maes_nom_institucion1 = "";
        maes_ciudad_inst1 = "";
        maes_anio_inst1 = "";
        maes_tipo_escol2 = "";
        maes_programa2 = "";
        maes_nom_institucion2 = "";
        maes_ciudad_inst2 = "";
        maes_anio_inst2 = "";
        maes_tipo_escol3 = "";
        maes_programa3 = "";
        maes_nom_institucion3 = "";
        maes_ciudad_inst3 = "";
        maes_anio_inst3 = "";
        maes_tipo_escol4 = "";
        maes_programa4 = "";
        maes_nom_institucion4 = "";
        maes_ciudad_inst4 = "";
        maes_anio_inst4 = "";

        doct_tipo_escol1 = "";
        doct_programa1 = "";
        doct_nom_institucion1 = "";
        doct_ciudad_inst1 = "";
        doct_anio_inst1 = "";
        doct_tipo_escol2 = "";
        doct_programa2 = "";
        doct_nom_institucion2 = "";
        doct_ciudad_inst2 = "";
        doct_anio_inst2 = "";

        no_semestre = "";
        nom_prog_acad = "";
        nom_inst_prog_acad = "";
        nom_ciudad_prog = "";
        jorn_prog_acad = "";
        estadoestusus = "";
        explestadoestusus = "";
        aniosuspension = "";

        admisionInfoAcademica = "";
        
        colorCategoria = "sincolor";
    }

}
