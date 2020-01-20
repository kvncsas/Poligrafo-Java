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
public class HistoriaLaboral {

    private static String empleobefore = "-";
    private static String periodosinacla = "";
    private static String didmalosactos = "-";
    private static String expdidmalosactos = "";
    private static String historlabopre1 = "-";
    private static String exphistorlabopre1 = "";
    private static String historlabopre2 = "-";
    private static String exphistorlabopre2 = "";
    private static String historlabopre3 = "-";
    private static String exphistorlabopre3 = "";
    private static String historlabopre4 = "-";
    private static String exphistorlabopre4 = "";
    private static String historlabopre5 = "-";
    private static String exphistorlabopre5 = "";
    private static String historlabopre6 = "-";
    private static String exphistorlabopre6 = "";
    private static String historlabopre7 = "-";
    private static String exphistorlabopre7 = "";
    private static String historlabopre8 = "-";
    private static String exphistorlabopre8 = "";

    private static String admisionHistoriaLaboral = "";

    private static boolean vnfecha1 = true;
    private static boolean vnfecha2 = true;
    private static boolean vnfecha3 = true;
    private static boolean vnfecha4 = true;
    private static boolean vnfecha5 = true;
    private static boolean vnfecha6 = true;
    private static boolean vnfecha7 = true;
    private static boolean vnfecha8 = true;
    private static boolean vnfecha9 = true;
    private static boolean vnfecha10 = true;
    private static boolean vnfecha11 = true;
    private static boolean vnfecha12 = true;
    private static boolean vnfecha13 = true;
    private static boolean vnfecha14 = true;
    private static boolean vnfecha15 = true;

    private static String empleo1 = "";
    private static String empleo2 = "";
    private static String empleo3 = "";
    private static String empleo4 = "";
    private static String empleo5 = "";
    private static String empleo6 = "";
    private static String empleo7 = "";
    private static String empleo8 = "";
    private static String empleo9 = "";
    private static String empleo10 = "";
    private static String empleo11 = "";
    private static String empleo12 = "";
    private static String empleo13 = "";
    private static String empleo14 = "";
    private static String empleo15 = "";

    private static String empresa1 = "";
    private static String lugarempresa1 = "";
    private static String cargotrabe1 = "";
    private static String salariobe1 = "";
    private static String mesesla1 = "";
    private static String mesingreso1 = "";
    private static String anioingreso1 = "";
    private static String mesretiro1 = "";
    private static String anioretiro1 = "";
    private static String motivoretiro1 = "";

    private static String empresa2 = "";
    private static String lugarempresa2 = "";
    private static String cargotrabe2 = "";
    private static String salariobe2 = "";
    private static String mesesla2 = "";
    private static String mesingreso2 = "";
    private static String anioingreso2 = "";
    private static String mesretiro2 = "";
    private static String anioretiro2 = "";
    private static String motivoretiro2 = "";

    private static String empresa3 = "";
    private static String lugarempresa3 = "";
    private static String cargotrabe3 = "";
    private static String salariobe3 = "";
    private static String mesesla3 = "";
    private static String mesingreso3 = "";
    private static String anioingreso3 = "";
    private static String mesretiro3 = "";
    private static String anioretiro3 = "";
    private static String motivoretiro3 = "";

    private static String empresa4 = "";
    private static String lugarempresa4 = "";
    private static String cargotrabe4 = "";
    private static String salariobe4 = "";
    private static String mesesla4 = "";
    private static String mesingreso4 = "";
    private static String anioingreso4 = "";
    private static String mesretiro4 = "";
    private static String anioretiro4 = "";
    private static String motivoretiro4 = "";

    private static String empresa5 = "";
    private static String lugarempresa5 = "";
    private static String cargotrabe5 = "";
    private static String salariobe5 = "";
    private static String mesesla5 = "";
    private static String mesingreso5 = "";
    private static String anioingreso5 = "";
    private static String mesretiro5 = "";
    private static String anioretiro5 = "";
    private static String motivoretiro5 = "";

    private static String empresa6 = "";
    private static String lugarempresa6 = "";
    private static String cargotrabe6 = "";
    private static String salariobe6 = "";
    private static String mesesla6 = "";
    private static String mesingreso6 = "";
    private static String anioingreso6 = "";
    private static String mesretiro6 = "";
    private static String anioretiro6 = "";
    private static String motivoretiro6 = "";

    private static String empresa7 = "";
    private static String lugarempresa7 = "";
    private static String cargotrabe7 = "";
    private static String salariobe7 = "";
    private static String mesesla7 = "";
    private static String mesingreso7 = "";
    private static String anioingreso7 = "";
    private static String mesretiro7 = "";
    private static String anioretiro7 = "";
    private static String motivoretiro7 = "";

    private static String empresa8 = "";
    private static String lugarempresa8 = "";
    private static String cargotrabe8 = "";
    private static String salariobe8 = "";
    private static String mesesla8 = "";
    private static String mesingreso8 = "";
    private static String anioingreso8 = "";
    private static String mesretiro8 = "";
    private static String anioretiro8 = "";
    private static String motivoretiro8 = "";

    private static String empresa9 = "";
    private static String lugarempresa9 = "";
    private static String cargotrabe9 = "";
    private static String salariobe9 = "";
    private static String mesesla9 = "";
    private static String mesingreso9 = "";
    private static String anioingreso9 = "";
    private static String mesretiro9 = "";
    private static String anioretiro9 = "";
    private static String motivoretiro9 = "";

    private static String empresa10 = "";
    private static String lugarempresa10 = "";
    private static String cargotrabe10 = "";
    private static String salariobe10 = "";
    private static String mesesla10 = "";
    private static String mesingreso10 = "";
    private static String anioingreso10 = "";
    private static String mesretiro10 = "";
    private static String anioretiro10 = "";
    private static String motivoretiro10 = "";

    private static String empresa11 = "";
    private static String lugarempresa11 = "";
    private static String cargotrabe11 = "";
    private static String salariobe11 = "";
    private static String mesesla11 = "";
    private static String mesingreso11 = "";
    private static String anioingreso11 = "";
    private static String mesretiro11 = "";
    private static String anioretiro11 = "";
    private static String motivoretiro11 = "";

    private static String empresa12 = "";
    private static String lugarempresa12 = "";
    private static String cargotrabe12 = "";
    private static String salariobe12 = "";
    private static String mesesla12 = "";
    private static String mesingreso12 = "";
    private static String anioingreso12 = "";
    private static String mesretiro12 = "";
    private static String anioretiro12 = "";
    private static String motivoretiro12 = "";

    private static String empresa13 = "";
    private static String lugarempresa13 = "";
    private static String cargotrabe13 = "";
    private static String salariobe13 = "";
    private static String mesesla13 = "";
    private static String mesingreso13 = "";
    private static String anioingreso13 = "";
    private static String mesretiro13 = "";
    private static String anioretiro13 = "";
    private static String motivoretiro13 = "";

    private static String empresa14 = "";
    private static String lugarempresa14 = "";
    private static String cargotrabe14 = "";
    private static String salariobe14 = "";
    private static String mesesla14 = "";
    private static String mesingreso14 = "";
    private static String anioingreso14 = "";
    private static String mesretiro14 = "";
    private static String anioretiro14 = "";
    private static String motivoretiro14 = "";

    private static String empresa15 = "";
    private static String lugarempresa15 = "";
    private static String cargotrabe15 = "";
    private static String salariobe15 = "";
    private static String mesesla15 = "";
    private static String mesingreso15 = "";
    private static String anioingreso15 = "";
    private static String mesretiro15 = "";
    private static String anioretiro15 = "";
    private static String motivoretiro15 = "";

    private static String malacto1 = "";
    private static String malacto2 = "";
    private static String malacto3 = "";
    private static String malacto4 = "";
    private static String malacto5 = "";
    private static String malacto6 = "";

    private static String colorCategoria = "sincolor";

    public static String getColorCategoria() {
        return colorCategoria;
    }

    public static void setColorCategoria(String colorCategoria) {
        HistoriaLaboral.colorCategoria = colorCategoria;
    }

    public static boolean isVnfecha1() {
        return vnfecha1;
    }

    public static void setVnfecha1(boolean vnfecha1) {
        HistoriaLaboral.vnfecha1 = vnfecha1;
    }

    public static boolean isVnfecha2() {
        return vnfecha2;
    }

    public static void setVnfecha2(boolean vnfecha2) {
        HistoriaLaboral.vnfecha2 = vnfecha2;
    }

    public static boolean isVnfecha3() {
        return vnfecha3;
    }

    public static void setVnfecha3(boolean vnfecha3) {
        HistoriaLaboral.vnfecha3 = vnfecha3;
    }

    public static boolean isVnfecha4() {
        return vnfecha4;
    }

    public static void setVnfecha4(boolean vnfecha4) {
        HistoriaLaboral.vnfecha4 = vnfecha4;
    }

    public static boolean isVnfecha5() {
        return vnfecha5;
    }

    public static void setVnfecha5(boolean vnfecha5) {
        HistoriaLaboral.vnfecha5 = vnfecha5;
    }

    public static boolean isVnfecha6() {
        return vnfecha6;
    }

    public static void setVnfecha6(boolean vnfecha6) {
        HistoriaLaboral.vnfecha6 = vnfecha6;
    }

    public static boolean isVnfecha7() {
        return vnfecha7;
    }

    public static void setVnfecha7(boolean vnfecha7) {
        HistoriaLaboral.vnfecha7 = vnfecha7;
    }

    public static boolean isVnfecha8() {
        return vnfecha8;
    }

    public static void setVnfecha8(boolean vnfecha8) {
        HistoriaLaboral.vnfecha8 = vnfecha8;
    }

    public static boolean isVnfecha9() {
        return vnfecha9;
    }

    public static void setVnfecha9(boolean vnfecha9) {
        HistoriaLaboral.vnfecha9 = vnfecha9;
    }

    public static boolean isVnfecha10() {
        return vnfecha10;
    }

    public static void setVnfecha10(boolean vnfecha10) {
        HistoriaLaboral.vnfecha10 = vnfecha10;
    }

    public static boolean isVnfecha11() {
        return vnfecha11;
    }

    public static void setVnfecha11(boolean vnfecha11) {
        HistoriaLaboral.vnfecha11 = vnfecha11;
    }

    public static boolean isVnfecha12() {
        return vnfecha12;
    }

    public static void setVnfecha12(boolean vnfecha12) {
        HistoriaLaboral.vnfecha12 = vnfecha12;
    }

    public static boolean isVnfecha13() {
        return vnfecha13;
    }

    public static void setVnfecha13(boolean vnfecha13) {
        HistoriaLaboral.vnfecha13 = vnfecha13;
    }

    public static boolean isVnfecha14() {
        return vnfecha14;
    }

    public static void setVnfecha14(boolean vnfecha14) {
        HistoriaLaboral.vnfecha14 = vnfecha14;
    }

    public static boolean isVnfecha15() {
        return vnfecha15;
    }

    public static void setVnfecha15(boolean vnfecha15) {
        HistoriaLaboral.vnfecha15 = vnfecha15;
    }

    public static String getAdmisionHistoriaLaboral() {
        return admisionHistoriaLaboral;
    }

    public static void setAdmisionHistoriaLaboral(String admisionHistoriaLaboral) {
        HistoriaLaboral.admisionHistoriaLaboral = admisionHistoriaLaboral;
    }

    public static String getEmpleo1() {
        return empleo1;
    }

    public static void setEmpleo1(String empleo1) {
        HistoriaLaboral.empleo1 = empleo1;
    }

    public static String getEmpleo2() {
        return empleo2;
    }

    public static void setEmpleo2(String empleo2) {
        HistoriaLaboral.empleo2 = empleo2;
    }

    public static String getEmpleo3() {
        return empleo3;
    }

    public static void setEmpleo3(String empleo3) {
        HistoriaLaboral.empleo3 = empleo3;
    }

    public static String getEmpleo4() {
        return empleo4;
    }

    public static void setEmpleo4(String empleo4) {
        HistoriaLaboral.empleo4 = empleo4;
    }

    public static String getEmpleo5() {
        return empleo5;
    }

    public static void setEmpleo5(String empleo5) {
        HistoriaLaboral.empleo5 = empleo5;
    }

    public static String getEmpleo6() {
        return empleo6;
    }

    public static void setEmpleo6(String empleo6) {
        HistoriaLaboral.empleo6 = empleo6;
    }

    public static String getEmpleo7() {
        return empleo7;
    }

    public static void setEmpleo7(String empleo7) {
        HistoriaLaboral.empleo7 = empleo7;
    }

    public static String getEmpleo8() {
        return empleo8;
    }

    public static void setEmpleo8(String empleo8) {
        HistoriaLaboral.empleo8 = empleo8;
    }

    public static String getEmpleo9() {
        return empleo9;
    }

    public static void setEmpleo9(String empleo9) {
        HistoriaLaboral.empleo9 = empleo9;
    }

    public static String getEmpleo10() {
        return empleo10;
    }

    public static void setEmpleo10(String empleo10) {
        HistoriaLaboral.empleo10 = empleo10;
    }

    public static String getEmpleo11() {
        return empleo11;
    }

    public static void setEmpleo11(String empleo11) {
        HistoriaLaboral.empleo11 = empleo11;
    }

    public static String getEmpleo12() {
        return empleo12;
    }

    public static void setEmpleo12(String empleo12) {
        HistoriaLaboral.empleo12 = empleo12;
    }

    public static String getEmpleo13() {
        return empleo13;
    }

    public static void setEmpleo13(String empleo13) {
        HistoriaLaboral.empleo13 = empleo13;
    }

    public static String getEmpleo14() {
        return empleo14;
    }

    public static void setEmpleo14(String empleo14) {
        HistoriaLaboral.empleo14 = empleo14;
    }

    public static String getEmpleo15() {
        return empleo15;
    }

    public static void setEmpleo15(String empleo15) {
        HistoriaLaboral.empleo15 = empleo15;
    }

    public static String getEmpleobefore() {
        return empleobefore;
    }

    public static void setEmpleobefore(String empleobefore) {
        HistoriaLaboral.empleobefore = empleobefore;
    }

    public static String getPeriodosinacla() {
        return periodosinacla;
    }

    public static void setPeriodosinacla(String periodosinacla) {
        HistoriaLaboral.periodosinacla = periodosinacla;
    }

    public static String getDidmalosactos() {
        return didmalosactos;
    }

    public static void setDidmalosactos(String didmalosactos) {
        HistoriaLaboral.didmalosactos = didmalosactos;
    }

    public static String getExpdidmalosactos() {
        return expdidmalosactos;
    }

    public static void setExpdidmalosactos(String expdidmalosactos) {
        HistoriaLaboral.expdidmalosactos = expdidmalosactos;
    }

    public static String getHistorlabopre1() {
        return historlabopre1;
    }

    public static void setHistorlabopre1(String historlabopre1) {
        HistoriaLaboral.historlabopre1 = historlabopre1;
    }

    public static String getExphistorlabopre1() {
        return exphistorlabopre1;
    }

    public static void setExphistorlabopre1(String exphistorlabopre1) {
        HistoriaLaboral.exphistorlabopre1 = exphistorlabopre1;
    }

    public static String getHistorlabopre2() {
        return historlabopre2;
    }

    public static void setHistorlabopre2(String historlabopre2) {
        HistoriaLaboral.historlabopre2 = historlabopre2;
    }

    public static String getExphistorlabopre2() {
        return exphistorlabopre2;
    }

    public static void setExphistorlabopre2(String exphistorlabopre2) {
        HistoriaLaboral.exphistorlabopre2 = exphistorlabopre2;
    }

    public static String getHistorlabopre3() {
        return historlabopre3;
    }

    public static void setHistorlabopre3(String historlabopre3) {
        HistoriaLaboral.historlabopre3 = historlabopre3;
    }

    public static String getExphistorlabopre3() {
        return exphistorlabopre3;
    }

    public static void setExphistorlabopre3(String exphistorlabopre3) {
        HistoriaLaboral.exphistorlabopre3 = exphistorlabopre3;
    }

    public static String getHistorlabopre4() {
        return historlabopre4;
    }

    public static void setHistorlabopre4(String historlabopre4) {
        HistoriaLaboral.historlabopre4 = historlabopre4;
    }

    public static String getExphistorlabopre4() {
        return exphistorlabopre4;
    }

    public static void setExphistorlabopre4(String exphistorlabopre4) {
        HistoriaLaboral.exphistorlabopre4 = exphistorlabopre4;
    }

    public static String getHistorlabopre5() {
        return historlabopre5;
    }

    public static void setHistorlabopre5(String historlabopre5) {
        HistoriaLaboral.historlabopre5 = historlabopre5;
    }

    public static String getExphistorlabopre5() {
        return exphistorlabopre5;
    }

    public static void setExphistorlabopre5(String exphistorlabopre5) {
        HistoriaLaboral.exphistorlabopre5 = exphistorlabopre5;
    }

    public static String getHistorlabopre6() {
        return historlabopre6;
    }

    public static void setHistorlabopre6(String historlabopre6) {
        HistoriaLaboral.historlabopre6 = historlabopre6;
    }

    public static String getExphistorlabopre6() {
        return exphistorlabopre6;
    }

    public static void setExphistorlabopre6(String exphistorlabopre6) {
        HistoriaLaboral.exphistorlabopre6 = exphistorlabopre6;
    }

    public static String getHistorlabopre7() {
        return historlabopre7;
    }

    public static void setHistorlabopre7(String historlabopre7) {
        HistoriaLaboral.historlabopre7 = historlabopre7;
    }

    public static String getExphistorlabopre7() {
        return exphistorlabopre7;
    }

    public static void setExphistorlabopre7(String exphistorlabopre7) {
        HistoriaLaboral.exphistorlabopre7 = exphistorlabopre7;
    }

    public static String getHistorlabopre8() {
        return historlabopre8;
    }

    public static void setHistorlabopre8(String historlabopre8) {
        HistoriaLaboral.historlabopre8 = historlabopre8;
    }

    public static String getExphistorlabopre8() {
        return exphistorlabopre8;
    }

    public static void setExphistorlabopre8(String exphistorlabopre8) {
        HistoriaLaboral.exphistorlabopre8 = exphistorlabopre8;
    }

    public static String getEmpresa1() {
        return empresa1;
    }

    public static void setEmpresa1(String empresa1) {
        HistoriaLaboral.empresa1 = empresa1;
    }

    public static String getLugarempresa1() {
        return lugarempresa1;
    }

    public static void setLugarempresa1(String lugarempresa1) {
        HistoriaLaboral.lugarempresa1 = lugarempresa1;
    }

    public static String getCargotrabe1() {
        return cargotrabe1;
    }

    public static void setCargotrabe1(String cargotrabe1) {
        HistoriaLaboral.cargotrabe1 = cargotrabe1;
    }

    public static String getSalariobe1() {
        return salariobe1;
    }

    public static void setSalariobe1(String salariobe1) {
        HistoriaLaboral.salariobe1 = salariobe1;
    }

    public static String getMesesla1() {
        return mesesla1;
    }

    public static void setMesesla1(String mesesla1) {
        HistoriaLaboral.mesesla1 = mesesla1;
    }

    public static String getMesingreso1() {
        return mesingreso1;
    }

    public static void setMesingreso1(String mesingreso1) {
        HistoriaLaboral.mesingreso1 = mesingreso1;
    }

    public static String getAnioingreso1() {
        return anioingreso1;
    }

    public static void setAnioingreso1(String anioingreso1) {
        HistoriaLaboral.anioingreso1 = anioingreso1;
    }

    public static String getMesretiro1() {
        return mesretiro1;
    }

    public static void setMesretiro1(String mesretiro1) {
        HistoriaLaboral.mesretiro1 = mesretiro1;
    }

    public static String getAnioretiro1() {
        return anioretiro1;
    }

    public static void setAnioretiro1(String anioretiro1) {
        HistoriaLaboral.anioretiro1 = anioretiro1;
    }

    public static String getMotivoretiro1() {
        return motivoretiro1;
    }

    public static void setMotivoretiro1(String motivoretiro1) {
        HistoriaLaboral.motivoretiro1 = motivoretiro1;
    }

    public static String getEmpresa2() {
        return empresa2;
    }

    public static void setEmpresa2(String empresa2) {
        HistoriaLaboral.empresa2 = empresa2;
    }

    public static String getLugarempresa2() {
        return lugarempresa2;
    }

    public static void setLugarempresa2(String lugarempresa2) {
        HistoriaLaboral.lugarempresa2 = lugarempresa2;
    }

    public static String getCargotrabe2() {
        return cargotrabe2;
    }

    public static void setCargotrabe2(String cargotrabe2) {
        HistoriaLaboral.cargotrabe2 = cargotrabe2;
    }

    public static String getSalariobe2() {
        return salariobe2;
    }

    public static void setSalariobe2(String salariobe2) {
        HistoriaLaboral.salariobe2 = salariobe2;
    }

    public static String getMesesla2() {
        return mesesla2;
    }

    public static void setMesesla2(String mesesla2) {
        HistoriaLaboral.mesesla2 = mesesla2;
    }

    public static String getMesingreso2() {
        return mesingreso2;
    }

    public static void setMesingreso2(String mesingreso2) {
        HistoriaLaboral.mesingreso2 = mesingreso2;
    }

    public static String getAnioingreso2() {
        return anioingreso2;
    }

    public static void setAnioingreso2(String anioingreso2) {
        HistoriaLaboral.anioingreso2 = anioingreso2;
    }

    public static String getMesretiro2() {
        return mesretiro2;
    }

    public static void setMesretiro2(String mesretiro2) {
        HistoriaLaboral.mesretiro2 = mesretiro2;
    }

    public static String getAnioretiro2() {
        return anioretiro2;
    }

    public static void setAnioretiro2(String anioretiro2) {
        HistoriaLaboral.anioretiro2 = anioretiro2;
    }

    public static String getMotivoretiro2() {
        return motivoretiro2;
    }

    public static void setMotivoretiro2(String motivoretiro2) {
        HistoriaLaboral.motivoretiro2 = motivoretiro2;
    }

    public static String getEmpresa3() {
        return empresa3;
    }

    public static void setEmpresa3(String empresa3) {
        HistoriaLaboral.empresa3 = empresa3;
    }

    public static String getLugarempresa3() {
        return lugarempresa3;
    }

    public static void setLugarempresa3(String lugarempresa3) {
        HistoriaLaboral.lugarempresa3 = lugarempresa3;
    }

    public static String getCargotrabe3() {
        return cargotrabe3;
    }

    public static void setCargotrabe3(String cargotrabe3) {
        HistoriaLaboral.cargotrabe3 = cargotrabe3;
    }

    public static String getSalariobe3() {
        return salariobe3;
    }

    public static void setSalariobe3(String salariobe3) {
        HistoriaLaboral.salariobe3 = salariobe3;
    }

    public static String getMesesla3() {
        return mesesla3;
    }

    public static void setMesesla3(String mesesla3) {
        HistoriaLaboral.mesesla3 = mesesla3;
    }

    public static String getMesingreso3() {
        return mesingreso3;
    }

    public static void setMesingreso3(String mesingreso3) {
        HistoriaLaboral.mesingreso3 = mesingreso3;
    }

    public static String getAnioingreso3() {
        return anioingreso3;
    }

    public static void setAnioingreso3(String anioingreso3) {
        HistoriaLaboral.anioingreso3 = anioingreso3;
    }

    public static String getMesretiro3() {
        return mesretiro3;
    }

    public static void setMesretiro3(String mesretiro3) {
        HistoriaLaboral.mesretiro3 = mesretiro3;
    }

    public static String getAnioretiro3() {
        return anioretiro3;
    }

    public static void setAnioretiro3(String anioretiro3) {
        HistoriaLaboral.anioretiro3 = anioretiro3;
    }

    public static String getMotivoretiro3() {
        return motivoretiro3;
    }

    public static void setMotivoretiro3(String motivoretiro3) {
        HistoriaLaboral.motivoretiro3 = motivoretiro3;
    }

    public static String getEmpresa4() {
        return empresa4;
    }

    public static void setEmpresa4(String empresa4) {
        HistoriaLaboral.empresa4 = empresa4;
    }

    public static String getLugarempresa4() {
        return lugarempresa4;
    }

    public static void setLugarempresa4(String lugarempresa4) {
        HistoriaLaboral.lugarempresa4 = lugarempresa4;
    }

    public static String getCargotrabe4() {
        return cargotrabe4;
    }

    public static void setCargotrabe4(String cargotrabe4) {
        HistoriaLaboral.cargotrabe4 = cargotrabe4;
    }

    public static String getSalariobe4() {
        return salariobe4;
    }

    public static void setSalariobe4(String salariobe4) {
        HistoriaLaboral.salariobe4 = salariobe4;
    }

    public static String getMesesla4() {
        return mesesla4;
    }

    public static void setMesesla4(String mesesla4) {
        HistoriaLaboral.mesesla4 = mesesla4;
    }

    public static String getMesingreso4() {
        return mesingreso4;
    }

    public static void setMesingreso4(String mesingreso4) {
        HistoriaLaboral.mesingreso4 = mesingreso4;
    }

    public static String getAnioingreso4() {
        return anioingreso4;
    }

    public static void setAnioingreso4(String anioingreso4) {
        HistoriaLaboral.anioingreso4 = anioingreso4;
    }

    public static String getMesretiro4() {
        return mesretiro4;
    }

    public static void setMesretiro4(String mesretiro4) {
        HistoriaLaboral.mesretiro4 = mesretiro4;
    }

    public static String getAnioretiro4() {
        return anioretiro4;
    }

    public static void setAnioretiro4(String anioretiro4) {
        HistoriaLaboral.anioretiro4 = anioretiro4;
    }

    public static String getMotivoretiro4() {
        return motivoretiro4;
    }

    public static void setMotivoretiro4(String motivoretiro4) {
        HistoriaLaboral.motivoretiro4 = motivoretiro4;
    }

    public static String getEmpresa5() {
        return empresa5;
    }

    public static void setEmpresa5(String empresa5) {
        HistoriaLaboral.empresa5 = empresa5;
    }

    public static String getLugarempresa5() {
        return lugarempresa5;
    }

    public static void setLugarempresa5(String lugarempresa5) {
        HistoriaLaboral.lugarempresa5 = lugarempresa5;
    }

    public static String getCargotrabe5() {
        return cargotrabe5;
    }

    public static void setCargotrabe5(String cargotrabe5) {
        HistoriaLaboral.cargotrabe5 = cargotrabe5;
    }

    public static String getSalariobe5() {
        return salariobe5;
    }

    public static void setSalariobe5(String salariobe5) {
        HistoriaLaboral.salariobe5 = salariobe5;
    }

    public static String getMesesla5() {
        return mesesla5;
    }

    public static void setMesesla5(String mesesla5) {
        HistoriaLaboral.mesesla5 = mesesla5;
    }

    public static String getMesingreso5() {
        return mesingreso5;
    }

    public static void setMesingreso5(String mesingreso5) {
        HistoriaLaboral.mesingreso5 = mesingreso5;
    }

    public static String getAnioingreso5() {
        return anioingreso5;
    }

    public static void setAnioingreso5(String anioingreso5) {
        HistoriaLaboral.anioingreso5 = anioingreso5;
    }

    public static String getMesretiro5() {
        return mesretiro5;
    }

    public static void setMesretiro5(String mesretiro5) {
        HistoriaLaboral.mesretiro5 = mesretiro5;
    }

    public static String getAnioretiro5() {
        return anioretiro5;
    }

    public static void setAnioretiro5(String anioretiro5) {
        HistoriaLaboral.anioretiro5 = anioretiro5;
    }

    public static String getMotivoretiro5() {
        return motivoretiro5;
    }

    public static void setMotivoretiro5(String motivoretiro5) {
        HistoriaLaboral.motivoretiro5 = motivoretiro5;
    }

    public static String getEmpresa6() {
        return empresa6;
    }

    public static void setEmpresa6(String empresa6) {
        HistoriaLaboral.empresa6 = empresa6;
    }

    public static String getLugarempresa6() {
        return lugarempresa6;
    }

    public static void setLugarempresa6(String lugarempresa6) {
        HistoriaLaboral.lugarempresa6 = lugarempresa6;
    }

    public static String getCargotrabe6() {
        return cargotrabe6;
    }

    public static void setCargotrabe6(String cargotrabe6) {
        HistoriaLaboral.cargotrabe6 = cargotrabe6;
    }

    public static String getSalariobe6() {
        return salariobe6;
    }

    public static void setSalariobe6(String salariobe6) {
        HistoriaLaboral.salariobe6 = salariobe6;
    }

    public static String getMesesla6() {
        return mesesla6;
    }

    public static void setMesesla6(String mesesla6) {
        HistoriaLaboral.mesesla6 = mesesla6;
    }

    public static String getMesingreso6() {
        return mesingreso6;
    }

    public static void setMesingreso6(String mesingreso6) {
        HistoriaLaboral.mesingreso6 = mesingreso6;
    }

    public static String getAnioingreso6() {
        return anioingreso6;
    }

    public static void setAnioingreso6(String anioingreso6) {
        HistoriaLaboral.anioingreso6 = anioingreso6;
    }

    public static String getMesretiro6() {
        return mesretiro6;
    }

    public static void setMesretiro6(String mesretiro6) {
        HistoriaLaboral.mesretiro6 = mesretiro6;
    }

    public static String getAnioretiro6() {
        return anioretiro6;
    }

    public static void setAnioretiro6(String anioretiro6) {
        HistoriaLaboral.anioretiro6 = anioretiro6;
    }

    public static String getMotivoretiro6() {
        return motivoretiro6;
    }

    public static void setMotivoretiro6(String motivoretiro6) {
        HistoriaLaboral.motivoretiro6 = motivoretiro6;
    }

    public static String getEmpresa7() {
        return empresa7;
    }

    public static void setEmpresa7(String empresa7) {
        HistoriaLaboral.empresa7 = empresa7;
    }

    public static String getLugarempresa7() {
        return lugarempresa7;
    }

    public static void setLugarempresa7(String lugarempresa7) {
        HistoriaLaboral.lugarempresa7 = lugarempresa7;
    }

    public static String getCargotrabe7() {
        return cargotrabe7;
    }

    public static void setCargotrabe7(String cargotrabe7) {
        HistoriaLaboral.cargotrabe7 = cargotrabe7;
    }

    public static String getSalariobe7() {
        return salariobe7;
    }

    public static void setSalariobe7(String salariobe7) {
        HistoriaLaboral.salariobe7 = salariobe7;
    }

    public static String getMesesla7() {
        return mesesla7;
    }

    public static void setMesesla7(String mesesla7) {
        HistoriaLaboral.mesesla7 = mesesla7;
    }

    public static String getMesingreso7() {
        return mesingreso7;
    }

    public static void setMesingreso7(String mesingreso7) {
        HistoriaLaboral.mesingreso7 = mesingreso7;
    }

    public static String getAnioingreso7() {
        return anioingreso7;
    }

    public static void setAnioingreso7(String anioingreso7) {
        HistoriaLaboral.anioingreso7 = anioingreso7;
    }

    public static String getMesretiro7() {
        return mesretiro7;
    }

    public static void setMesretiro7(String mesretiro7) {
        HistoriaLaboral.mesretiro7 = mesretiro7;
    }

    public static String getAnioretiro7() {
        return anioretiro7;
    }

    public static void setAnioretiro7(String anioretiro7) {
        HistoriaLaboral.anioretiro7 = anioretiro7;
    }

    public static String getMotivoretiro7() {
        return motivoretiro7;
    }

    public static void setMotivoretiro7(String motivoretiro7) {
        HistoriaLaboral.motivoretiro7 = motivoretiro7;
    }

    public static String getEmpresa8() {
        return empresa8;
    }

    public static void setEmpresa8(String empresa8) {
        HistoriaLaboral.empresa8 = empresa8;
    }

    public static String getLugarempresa8() {
        return lugarempresa8;
    }

    public static void setLugarempresa8(String lugarempresa8) {
        HistoriaLaboral.lugarempresa8 = lugarempresa8;
    }

    public static String getCargotrabe8() {
        return cargotrabe8;
    }

    public static void setCargotrabe8(String cargotrabe8) {
        HistoriaLaboral.cargotrabe8 = cargotrabe8;
    }

    public static String getSalariobe8() {
        return salariobe8;
    }

    public static void setSalariobe8(String salariobe8) {
        HistoriaLaboral.salariobe8 = salariobe8;
    }

    public static String getMesesla8() {
        return mesesla8;
    }

    public static void setMesesla8(String mesesla8) {
        HistoriaLaboral.mesesla8 = mesesla8;
    }

    public static String getMesingreso8() {
        return mesingreso8;
    }

    public static void setMesingreso8(String mesingreso8) {
        HistoriaLaboral.mesingreso8 = mesingreso8;
    }

    public static String getAnioingreso8() {
        return anioingreso8;
    }

    public static void setAnioingreso8(String anioingreso8) {
        HistoriaLaboral.anioingreso8 = anioingreso8;
    }

    public static String getMesretiro8() {
        return mesretiro8;
    }

    public static void setMesretiro8(String mesretiro8) {
        HistoriaLaboral.mesretiro8 = mesretiro8;
    }

    public static String getAnioretiro8() {
        return anioretiro8;
    }

    public static void setAnioretiro8(String anioretiro8) {
        HistoriaLaboral.anioretiro8 = anioretiro8;
    }

    public static String getMotivoretiro8() {
        return motivoretiro8;
    }

    public static void setMotivoretiro8(String motivoretiro8) {
        HistoriaLaboral.motivoretiro8 = motivoretiro8;
    }

    public static String getEmpresa9() {
        return empresa9;
    }

    public static void setEmpresa9(String empresa9) {
        HistoriaLaboral.empresa9 = empresa9;
    }

    public static String getLugarempresa9() {
        return lugarempresa9;
    }

    public static void setLugarempresa9(String lugarempresa9) {
        HistoriaLaboral.lugarempresa9 = lugarempresa9;
    }

    public static String getCargotrabe9() {
        return cargotrabe9;
    }

    public static void setCargotrabe9(String cargotrabe9) {
        HistoriaLaboral.cargotrabe9 = cargotrabe9;
    }

    public static String getSalariobe9() {
        return salariobe9;
    }

    public static void setSalariobe9(String salariobe9) {
        HistoriaLaboral.salariobe9 = salariobe9;
    }

    public static String getMesesla9() {
        return mesesla9;
    }

    public static void setMesesla9(String mesesla9) {
        HistoriaLaboral.mesesla9 = mesesla9;
    }

    public static String getMesingreso9() {
        return mesingreso9;
    }

    public static void setMesingreso9(String mesingreso9) {
        HistoriaLaboral.mesingreso9 = mesingreso9;
    }

    public static String getAnioingreso9() {
        return anioingreso9;
    }

    public static void setAnioingreso9(String anioingreso9) {
        HistoriaLaboral.anioingreso9 = anioingreso9;
    }

    public static String getMesretiro9() {
        return mesretiro9;
    }

    public static void setMesretiro9(String mesretiro9) {
        HistoriaLaboral.mesretiro9 = mesretiro9;
    }

    public static String getAnioretiro9() {
        return anioretiro9;
    }

    public static void setAnioretiro9(String anioretiro9) {
        HistoriaLaboral.anioretiro9 = anioretiro9;
    }

    public static String getMotivoretiro9() {
        return motivoretiro9;
    }

    public static void setMotivoretiro9(String motivoretiro9) {
        HistoriaLaboral.motivoretiro9 = motivoretiro9;
    }

    public static String getEmpresa10() {
        return empresa10;
    }

    public static void setEmpresa10(String empresa10) {
        HistoriaLaboral.empresa10 = empresa10;
    }

    public static String getLugarempresa10() {
        return lugarempresa10;
    }

    public static void setLugarempresa10(String lugarempresa10) {
        HistoriaLaboral.lugarempresa10 = lugarempresa10;
    }

    public static String getCargotrabe10() {
        return cargotrabe10;
    }

    public static void setCargotrabe10(String cargotrabe10) {
        HistoriaLaboral.cargotrabe10 = cargotrabe10;
    }

    public static String getSalariobe10() {
        return salariobe10;
    }

    public static void setSalariobe10(String salariobe10) {
        HistoriaLaboral.salariobe10 = salariobe10;
    }

    public static String getMesesla10() {
        return mesesla10;
    }

    public static void setMesesla10(String mesesla10) {
        HistoriaLaboral.mesesla10 = mesesla10;
    }

    public static String getMesingreso10() {
        return mesingreso10;
    }

    public static void setMesingreso10(String mesingreso10) {
        HistoriaLaboral.mesingreso10 = mesingreso10;
    }

    public static String getAnioingreso10() {
        return anioingreso10;
    }

    public static void setAnioingreso10(String anioingreso10) {
        HistoriaLaboral.anioingreso10 = anioingreso10;
    }

    public static String getMesretiro10() {
        return mesretiro10;
    }

    public static void setMesretiro10(String mesretiro10) {
        HistoriaLaboral.mesretiro10 = mesretiro10;
    }

    public static String getAnioretiro10() {
        return anioretiro10;
    }

    public static void setAnioretiro10(String anioretiro10) {
        HistoriaLaboral.anioretiro10 = anioretiro10;
    }

    public static String getMotivoretiro10() {
        return motivoretiro10;
    }

    public static void setMotivoretiro10(String motivoretiro10) {
        HistoriaLaboral.motivoretiro10 = motivoretiro10;
    }

    public static String getEmpresa11() {
        return empresa11;
    }

    public static void setEmpresa11(String empresa11) {
        HistoriaLaboral.empresa11 = empresa11;
    }

    public static String getLugarempresa11() {
        return lugarempresa11;
    }

    public static void setLugarempresa11(String lugarempresa11) {
        HistoriaLaboral.lugarempresa11 = lugarempresa11;
    }

    public static String getCargotrabe11() {
        return cargotrabe11;
    }

    public static void setCargotrabe11(String cargotrabe11) {
        HistoriaLaboral.cargotrabe11 = cargotrabe11;
    }

    public static String getSalariobe11() {
        return salariobe11;
    }

    public static void setSalariobe11(String salariobe11) {
        HistoriaLaboral.salariobe11 = salariobe11;
    }

    public static String getMesesla11() {
        return mesesla11;
    }

    public static void setMesesla11(String mesesla11) {
        HistoriaLaboral.mesesla11 = mesesla11;
    }

    public static String getMesingreso11() {
        return mesingreso11;
    }

    public static void setMesingreso11(String mesingreso11) {
        HistoriaLaboral.mesingreso11 = mesingreso11;
    }

    public static String getAnioingreso11() {
        return anioingreso11;
    }

    public static void setAnioingreso11(String anioingreso11) {
        HistoriaLaboral.anioingreso11 = anioingreso11;
    }

    public static String getMesretiro11() {
        return mesretiro11;
    }

    public static void setMesretiro11(String mesretiro11) {
        HistoriaLaboral.mesretiro11 = mesretiro11;
    }

    public static String getAnioretiro11() {
        return anioretiro11;
    }

    public static void setAnioretiro11(String anioretiro11) {
        HistoriaLaboral.anioretiro11 = anioretiro11;
    }

    public static String getMotivoretiro11() {
        return motivoretiro11;
    }

    public static void setMotivoretiro11(String motivoretiro11) {
        HistoriaLaboral.motivoretiro11 = motivoretiro11;
    }

    public static String getEmpresa12() {
        return empresa12;
    }

    public static void setEmpresa12(String empresa12) {
        HistoriaLaboral.empresa12 = empresa12;
    }

    public static String getLugarempresa12() {
        return lugarempresa12;
    }

    public static void setLugarempresa12(String lugarempresa12) {
        HistoriaLaboral.lugarempresa12 = lugarempresa12;
    }

    public static String getCargotrabe12() {
        return cargotrabe12;
    }

    public static void setCargotrabe12(String cargotrabe12) {
        HistoriaLaboral.cargotrabe12 = cargotrabe12;
    }

    public static String getSalariobe12() {
        return salariobe12;
    }

    public static void setSalariobe12(String salariobe12) {
        HistoriaLaboral.salariobe12 = salariobe12;
    }

    public static String getMesesla12() {
        return mesesla12;
    }

    public static void setMesesla12(String mesesla12) {
        HistoriaLaboral.mesesla12 = mesesla12;
    }

    public static String getMesingreso12() {
        return mesingreso12;
    }

    public static void setMesingreso12(String mesingreso12) {
        HistoriaLaboral.mesingreso12 = mesingreso12;
    }

    public static String getAnioingreso12() {
        return anioingreso12;
    }

    public static void setAnioingreso12(String anioingreso12) {
        HistoriaLaboral.anioingreso12 = anioingreso12;
    }

    public static String getMesretiro12() {
        return mesretiro12;
    }

    public static void setMesretiro12(String mesretiro12) {
        HistoriaLaboral.mesretiro12 = mesretiro12;
    }

    public static String getAnioretiro12() {
        return anioretiro12;
    }

    public static void setAnioretiro12(String anioretiro12) {
        HistoriaLaboral.anioretiro12 = anioretiro12;
    }

    public static String getMotivoretiro12() {
        return motivoretiro12;
    }

    public static void setMotivoretiro12(String motivoretiro12) {
        HistoriaLaboral.motivoretiro12 = motivoretiro12;
    }

    public static String getEmpresa13() {
        return empresa13;
    }

    public static void setEmpresa13(String empresa13) {
        HistoriaLaboral.empresa13 = empresa13;
    }

    public static String getLugarempresa13() {
        return lugarempresa13;
    }

    public static void setLugarempresa13(String lugarempresa13) {
        HistoriaLaboral.lugarempresa13 = lugarempresa13;
    }

    public static String getCargotrabe13() {
        return cargotrabe13;
    }

    public static void setCargotrabe13(String cargotrabe13) {
        HistoriaLaboral.cargotrabe13 = cargotrabe13;
    }

    public static String getSalariobe13() {
        return salariobe13;
    }

    public static void setSalariobe13(String salariobe13) {
        HistoriaLaboral.salariobe13 = salariobe13;
    }

    public static String getMesesla13() {
        return mesesla13;
    }

    public static void setMesesla13(String mesesla13) {
        HistoriaLaboral.mesesla13 = mesesla13;
    }

    public static String getMesingreso13() {
        return mesingreso13;
    }

    public static void setMesingreso13(String mesingreso13) {
        HistoriaLaboral.mesingreso13 = mesingreso13;
    }

    public static String getAnioingreso13() {
        return anioingreso13;
    }

    public static void setAnioingreso13(String anioingreso13) {
        HistoriaLaboral.anioingreso13 = anioingreso13;
    }

    public static String getMesretiro13() {
        return mesretiro13;
    }

    public static void setMesretiro13(String mesretiro13) {
        HistoriaLaboral.mesretiro13 = mesretiro13;
    }

    public static String getAnioretiro13() {
        return anioretiro13;
    }

    public static void setAnioretiro13(String anioretiro13) {
        HistoriaLaboral.anioretiro13 = anioretiro13;
    }

    public static String getMotivoretiro13() {
        return motivoretiro13;
    }

    public static void setMotivoretiro13(String motivoretiro13) {
        HistoriaLaboral.motivoretiro13 = motivoretiro13;
    }

    public static String getEmpresa14() {
        return empresa14;
    }

    public static void setEmpresa14(String empresa14) {
        HistoriaLaboral.empresa14 = empresa14;
    }

    public static String getLugarempresa14() {
        return lugarempresa14;
    }

    public static void setLugarempresa14(String lugarempresa14) {
        HistoriaLaboral.lugarempresa14 = lugarempresa14;
    }

    public static String getCargotrabe14() {
        return cargotrabe14;
    }

    public static void setCargotrabe14(String cargotrabe14) {
        HistoriaLaboral.cargotrabe14 = cargotrabe14;
    }

    public static String getSalariobe14() {
        return salariobe14;
    }

    public static void setSalariobe14(String salariobe14) {
        HistoriaLaboral.salariobe14 = salariobe14;
    }

    public static String getMesesla14() {
        return mesesla14;
    }

    public static void setMesesla14(String mesesla14) {
        HistoriaLaboral.mesesla14 = mesesla14;
    }

    public static String getMesingreso14() {
        return mesingreso14;
    }

    public static void setMesingreso14(String mesingreso14) {
        HistoriaLaboral.mesingreso14 = mesingreso14;
    }

    public static String getAnioingreso14() {
        return anioingreso14;
    }

    public static void setAnioingreso14(String anioingreso14) {
        HistoriaLaboral.anioingreso14 = anioingreso14;
    }

    public static String getMesretiro14() {
        return mesretiro14;
    }

    public static void setMesretiro14(String mesretiro14) {
        HistoriaLaboral.mesretiro14 = mesretiro14;
    }

    public static String getAnioretiro14() {
        return anioretiro14;
    }

    public static void setAnioretiro14(String anioretiro14) {
        HistoriaLaboral.anioretiro14 = anioretiro14;
    }

    public static String getMotivoretiro14() {
        return motivoretiro14;
    }

    public static void setMotivoretiro14(String motivoretiro14) {
        HistoriaLaboral.motivoretiro14 = motivoretiro14;
    }

    public static String getEmpresa15() {
        return empresa15;
    }

    public static void setEmpresa15(String empresa15) {
        HistoriaLaboral.empresa15 = empresa15;
    }

    public static String getLugarempresa15() {
        return lugarempresa15;
    }

    public static void setLugarempresa15(String lugarempresa15) {
        HistoriaLaboral.lugarempresa15 = lugarempresa15;
    }

    public static String getCargotrabe15() {
        return cargotrabe15;
    }

    public static void setCargotrabe15(String cargotrabe15) {
        HistoriaLaboral.cargotrabe15 = cargotrabe15;
    }

    public static String getSalariobe15() {
        return salariobe15;
    }

    public static void setSalariobe15(String salariobe15) {
        HistoriaLaboral.salariobe15 = salariobe15;
    }

    public static String getMesesla15() {
        return mesesla15;
    }

    public static void setMesesla15(String mesesla15) {
        HistoriaLaboral.mesesla15 = mesesla15;
    }

    public static String getMesingreso15() {
        return mesingreso15;
    }

    public static void setMesingreso15(String mesingreso15) {
        HistoriaLaboral.mesingreso15 = mesingreso15;
    }

    public static String getAnioingreso15() {
        return anioingreso15;
    }

    public static void setAnioingreso15(String anioingreso15) {
        HistoriaLaboral.anioingreso15 = anioingreso15;
    }

    public static String getMesretiro15() {
        return mesretiro15;
    }

    public static void setMesretiro15(String mesretiro15) {
        HistoriaLaboral.mesretiro15 = mesretiro15;
    }

    public static String getAnioretiro15() {
        return anioretiro15;
    }

    public static void setAnioretiro15(String anioretiro15) {
        HistoriaLaboral.anioretiro15 = anioretiro15;
    }

    public static String getMotivoretiro15() {
        return motivoretiro15;
    }

    public static void setMotivoretiro15(String motivoretiro15) {
        HistoriaLaboral.motivoretiro15 = motivoretiro15;
    }

    public static String getMalacto1() {
        return malacto1;
    }

    public static void setMalacto1(String malacto1) {
        HistoriaLaboral.malacto1 = malacto1;
    }

    public static String getMalacto2() {
        return malacto2;
    }

    public static void setMalacto2(String malacto2) {
        HistoriaLaboral.malacto2 = malacto2;
    }

    public static String getMalacto3() {
        return malacto3;
    }

    public static void setMalacto3(String malacto3) {
        HistoriaLaboral.malacto3 = malacto3;
    }

    public static String getMalacto4() {
        return malacto4;
    }

    public static void setMalacto4(String malacto4) {
        HistoriaLaboral.malacto4 = malacto4;
    }

    public static String getMalacto5() {
        return malacto5;
    }

    public static void setMalacto5(String malacto5) {
        HistoriaLaboral.malacto5 = malacto5;
    }

    public static String getMalacto6() {
        return malacto6;
    }

    public static void setMalacto6(String malacto6) {
        HistoriaLaboral.malacto6 = malacto6;
    }

    SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");
    java.util.Date fecha = new java.util.Date();
    public String fechanow = date.format(fecha);

    public void validarhistorial() {
        //1
        if (malacto1.equals("hay")) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM histo_actos_poli  WHERE histo_malacto = 'Robo' AND  no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune < 1) {
                    try {
                        PreparedStatement sqlins = Conexion.connection.prepareStatement("INSERT INTO histo_actos_poli "
                                + "(no_id, histo_malacto, fechacreacion)"
                                + " VALUES (?,?,?)");
                        sqlins.setString(1, txtnoiden.getText());
                        sqlins.setString(2, "Robo");
                        sqlins.setString(3, fechanow);
                        sqlins.executeUpdate();
                    } catch (SQLException e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (malacto1.equals("nohay")) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM histo_actos_poli  WHERE histo_malacto = 'Robo' AND no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune > 0) {
                    try {
                        PreparedStatement sqlpsiup = Conexion.connection.prepareStatement("DELETE FROM histo_actos_poli WHERE histo_malacto = 'Robo' AND no_id = " + txtnoiden.getText());
                        sqlpsiup.executeUpdate();
                    } catch (SQLException e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        //2
        if (malacto2.equals("hay")) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM histo_actos_poli  WHERE histo_malacto = 'Fraude' AND  no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune < 1) {
                    try {
                        PreparedStatement sqlins = Conexion.connection.prepareStatement("INSERT INTO histo_actos_poli "
                                + "(no_id, histo_malacto, fechacreacion)"
                                + " VALUES (?,?,?)");
                        sqlins.setString(1, txtnoiden.getText());
                        sqlins.setString(2, "Fraude");
                        sqlins.setString(3, fechanow);
                        sqlins.executeUpdate();
                    } catch (SQLException e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (malacto2.equals("nohay")) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM histo_actos_poli  WHERE histo_malacto = 'Fraude' AND no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune > 0) {
                    try {
                        PreparedStatement sqlpsiup = Conexion.connection.prepareStatement("DELETE FROM histo_actos_poli WHERE histo_malacto = 'Fraude' AND no_id = " + txtnoiden.getText());
                        sqlpsiup.executeUpdate();
                    } catch (SQLException e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        //3
        if (malacto3.equals("hay")) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM histo_actos_poli  WHERE histo_malacto = 'Estafa' AND  no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune < 1) {
                    try {
                        PreparedStatement sqlins = Conexion.connection.prepareStatement("INSERT INTO histo_actos_poli "
                                + "(no_id, histo_malacto, fechacreacion)"
                                + " VALUES (?,?,?)");
                        sqlins.setString(1, txtnoiden.getText());
                        sqlins.setString(2, "Estafa");
                        sqlins.setString(3, fechanow);
                        sqlins.executeUpdate();
                    } catch (SQLException e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (malacto3.equals("nohay")) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM histo_actos_poli  WHERE histo_malacto = 'Estafa' AND no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune > 0) {
                    try {
                        PreparedStatement sqlpsiup = Conexion.connection.prepareStatement("DELETE FROM histo_actos_poli WHERE histo_malacto = 'Estafa' AND no_id = " + txtnoiden.getText());
                        sqlpsiup.executeUpdate();
                    } catch (SQLException e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        //4
        if (malacto4.equals("hay")) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM histo_actos_poli  WHERE histo_malacto = 'Sustracción de información confidencial' AND  no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune < 1) {
                    try {
                        PreparedStatement sqlins = Conexion.connection.prepareStatement("INSERT INTO histo_actos_poli "
                                + "(no_id, histo_malacto, fechacreacion)"
                                + " VALUES (?,?,?)");
                        sqlins.setString(1, txtnoiden.getText());
                        sqlins.setString(2, "Sustracción de información confidencial");
                        sqlins.setString(3, fechanow);
                        sqlins.executeUpdate();
                    } catch (SQLException e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (malacto4.equals("nohay")) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM histo_actos_poli  WHERE histo_malacto = 'Sustracción de información confidencial' AND no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune > 0) {
                    try {
                        PreparedStatement sqlpsiup = Conexion.connection.prepareStatement("DELETE FROM histo_actos_poli WHERE histo_malacto = 'Sustracción de información confidencial' AND no_id = " + txtnoiden.getText());
                        sqlpsiup.executeUpdate();
                    } catch (SQLException e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        //5
        if (malacto5.equals("hay")) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM histo_actos_poli  WHERE histo_malacto = 'Participación en actividades irregulares' AND  no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune < 1) {
                    try {
                        PreparedStatement sqlins = Conexion.connection.prepareStatement("INSERT INTO histo_actos_poli "
                                + "(no_id, histo_malacto, fechacreacion)"
                                + " VALUES (?,?,?)");
                        sqlins.setString(1, txtnoiden.getText());
                        sqlins.setString(2, "Participación en actividades irregulares");
                        sqlins.setString(3, fechanow);
                        sqlins.executeUpdate();
                    } catch (SQLException e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (malacto5.equals("nohay")) {
            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM histo_actos_poli  WHERE histo_malacto = 'Participación en actividades irregulares' AND no_id = " + txtnoiden.getText());
                r.next();

                int cune = r.getRow();
                if (cune > 0) {
                    try {
                        PreparedStatement sqlpsiup = Conexion.connection.prepareStatement("DELETE FROM histo_actos_poli WHERE histo_malacto = 'Participación en actividades irregulares' AND no_id = " + txtnoiden.getText());
                        sqlpsiup.executeUpdate();
                    } catch (SQLException e) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void validarhistorialtrabajo() {

        //Empleo 1
        if ("hay".equals(empleo1)) {

            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM  empleos_poli WHERE no_id = " + txtnoiden.getText() + " AND num_trabajo = 1 ");
                r.next();
                int cune = r.getRow();

                if (cune == 0) {
                    try {
                        PreparedStatement sqlestud = Conexion.connection.prepareStatement("INSERT INTO empleos_poli "
                                + "(no_id, num_trabajo, empresa, mesesla, lugarempresa, cargotrabe, salariobe, mesingreso, anioingreso, mesretiro, anioretiro, motivoretiro, fechacreacion)"
                                + " VALUES (?,1,?,?,?,?,?,?,?,?,?,?,?)");
                        sqlestud.setString(1, DatosPrincipales.getNoIdenExaminado());
                        sqlestud.setString(2, empresa1);
                        sqlestud.setString(3, mesesla1);
                        sqlestud.setString(4, lugarempresa1);
                        sqlestud.setString(5, cargotrabe1);
                        sqlestud.setString(6, salariobe1);
                        sqlestud.setString(7, mesingreso1);
                        sqlestud.setString(8, anioingreso1);
                        sqlestud.setString(9, mesretiro1);
                        sqlestud.setString(10, anioretiro1);
                        sqlestud.setString(11, motivoretiro1);
                        sqlestud.setString(12, fechanow);
                        sqlestud.executeUpdate();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "¡Error! No se actualizaron los datos de trabajo " + e);
                    }
                } else {

                    try {
                        PreparedStatement sqlacade = Conexion.connection.prepareStatement("DELETE FROM empleos_poli WHERE no_id = " + txtnoiden.getText() + " AND num_trabajo = 1 ");
                        sqlacade.executeUpdate();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "¡Error! No se actualizaron los datos de trabajo " + e);
                    }
                    try {
                        PreparedStatement sqlestud = Conexion.connection.prepareStatement("INSERT INTO empleos_poli "
                                + "(no_id, num_trabajo, empresa, mesesla, lugarempresa, cargotrabe, salariobe, mesingreso, anioingreso, mesretiro, anioretiro, motivoretiro, fechacreacion)"
                                + " VALUES (?,1,?,?,?,?,?,?,?,?,?,?,?)");
                        sqlestud.setString(1, DatosPrincipales.getNoIdenExaminado());
                        sqlestud.setString(2, empresa1);
                        sqlestud.setString(3, mesesla1);
                        sqlestud.setString(4, lugarempresa1);
                        sqlestud.setString(5, cargotrabe1);
                        sqlestud.setString(6, salariobe1);
                        sqlestud.setString(7, mesingreso1);
                        sqlestud.setString(8, anioingreso1);
                        sqlestud.setString(9, mesretiro1);
                        sqlestud.setString(10, anioretiro1);
                        sqlestud.setString(11, motivoretiro1);
                        sqlestud.setString(12, fechanow);
                        sqlestud.executeUpdate();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "¡Error! No se actualizaron los datos de trabajo " + e);
                    }

                }
            } catch (Exception e) {
            }
        } else if ("nohay".equals(empleo1)) {

            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM  empleos_poli WHERE no_id = " + DatosPrincipales.getNoIdenExaminado() + " AND num_trabajo = 1 ");
                r.next();

                int cune = r.getRow();

                if (cune > 0) {
                    try {
                        PreparedStatement sqlacade = Conexion.connection.prepareStatement("DELETE FROM empleos_poli   WHERE no_id = " + DatosPrincipales.getNoIdenExaminado() + " AND num_trabajo = 1 ");
                        sqlacade.executeUpdate();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "¡Error! No se actualizaron los datos de trabajo " + e);
                    }
                }
            } catch (Exception e) {

            }
        }

        //Empleo 2
        if ("hay".equals(empleo2)) {

            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM  empleos_poli WHERE no_id = " + txtnoiden.getText() + " AND num_trabajo = 2 ");
                r.next();
                int cune = r.getRow();

                if (cune == 0) {
                    try {
                        PreparedStatement sqlestud = Conexion.connection.prepareStatement("INSERT INTO empleos_poli "
                                + "(no_id, num_trabajo, empresa, mesesla, lugarempresa, cargotrabe, salariobe, mesingreso, anioingreso, mesretiro, anioretiro, motivoretiro, fechacreacion)"
                                + " VALUES (?,2,?,?,?,?,?,?,?,?,?,?,?)");
                        sqlestud.setString(1, DatosPrincipales.getNoIdenExaminado());
                        sqlestud.setString(2, empresa2);
                        sqlestud.setString(3, mesesla2);
                        sqlestud.setString(4, lugarempresa2);
                        sqlestud.setString(5, cargotrabe2);
                        sqlestud.setString(6, salariobe2);
                        sqlestud.setString(7, mesingreso2);
                        sqlestud.setString(8, anioingreso2);
                        sqlestud.setString(9, mesretiro2);
                        sqlestud.setString(10, anioretiro2);
                        sqlestud.setString(11, motivoretiro2);
                        sqlestud.setString(12, fechanow);
                        sqlestud.executeUpdate();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "¡Error! No se actualizaron los datos de trabajo " + e);
                    }
                } else {

                    try {
                        PreparedStatement sqlacade = Conexion.connection.prepareStatement("DELETE FROM empleos_poli WHERE no_id = " + txtnoiden.getText() + " AND num_trabajo = 2 ");
                        sqlacade.executeUpdate();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "¡Error! No se actualizaron los datos de trabajo " + e);
                    }
                    try {
                        PreparedStatement sqlestud = Conexion.connection.prepareStatement("INSERT INTO empleos_poli "
                                + "(no_id, num_trabajo, empresa, mesesla, lugarempresa, cargotrabe, salariobe, mesingreso, anioingreso, mesretiro, anioretiro, motivoretiro, fechacreacion)"
                                + " VALUES (?,2,?,?,?,?,?,?,?,?,?,?,?)");
                        sqlestud.setString(1, DatosPrincipales.getNoIdenExaminado());
                        sqlestud.setString(2, empresa2);
                        sqlestud.setString(3, mesesla2);
                        sqlestud.setString(4, lugarempresa2);
                        sqlestud.setString(5, cargotrabe2);
                        sqlestud.setString(6, salariobe2);
                        sqlestud.setString(7, mesingreso2);
                        sqlestud.setString(8, anioingreso2);
                        sqlestud.setString(9, mesretiro2);
                        sqlestud.setString(10, anioretiro2);
                        sqlestud.setString(11, motivoretiro2);
                        sqlestud.setString(12, fechanow);
                        sqlestud.executeUpdate();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "¡Error! No se actualizaron los datos de trabajo " + e);
                    }

                }
            } catch (Exception e) {
            }
        } else if ("nohay".equals(empleo2)) {

            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM  empleos_poli WHERE no_id = " + DatosPrincipales.getNoIdenExaminado() + " AND num_trabajo = 2 ");
                r.next();

                int cune = r.getRow();

                if (cune > 0) {
                    try {
                        PreparedStatement sqlacade = Conexion.connection.prepareStatement("DELETE FROM empleos_poli   WHERE no_id = " + DatosPrincipales.getNoIdenExaminado() + " AND num_trabajo = 2 ");
                        sqlacade.executeUpdate();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "¡Error! No se actualizaron los datos de trabajo " + e);
                    }
                }
            } catch (Exception e) {

            }
        }

        //Empleo 3
        if ("hay".equals(empleo3)) {

            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM  empleos_poli WHERE no_id = " + txtnoiden.getText() + " AND num_trabajo = 3 ");
                r.next();
                int cune = r.getRow();

                if (cune == 0) {
                    try {
                        PreparedStatement sqlestud = Conexion.connection.prepareStatement("INSERT INTO empleos_poli "
                                + "(no_id, num_trabajo, empresa, mesesla, lugarempresa, cargotrabe, salariobe, mesingreso, anioingreso, mesretiro, anioretiro, motivoretiro, fechacreacion)"
                                + " VALUES (?,3,?,?,?,?,?,?,?,?,?,?,?)");
                        sqlestud.setString(1, DatosPrincipales.getNoIdenExaminado());
                        sqlestud.setString(2, empresa3);
                        sqlestud.setString(3, mesesla3);
                        sqlestud.setString(4, lugarempresa3);
                        sqlestud.setString(5, cargotrabe3);
                        sqlestud.setString(6, salariobe3);
                        sqlestud.setString(7, mesingreso3);
                        sqlestud.setString(8, anioingreso3);
                        sqlestud.setString(9, mesretiro3);
                        sqlestud.setString(10, anioretiro3);
                        sqlestud.setString(11, motivoretiro3);
                        sqlestud.setString(12, fechanow);
                        sqlestud.executeUpdate();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "¡Error! No se actualizaron los datos de trabajo " + e);
                    }
                } else {

                    try {
                        PreparedStatement sqlacade = Conexion.connection.prepareStatement("DELETE FROM empleos_poli WHERE no_id = " + txtnoiden.getText() + " AND num_trabajo = 3 ");
                        sqlacade.executeUpdate();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "¡Error! No se actualizaron los datos de trabajo " + e);
                    }
                    try {
                        PreparedStatement sqlestud = Conexion.connection.prepareStatement("INSERT INTO empleos_poli "
                                + "(no_id, num_trabajo, empresa, mesesla, lugarempresa, cargotrabe, salariobe, mesingreso, anioingreso, mesretiro, anioretiro, motivoretiro, fechacreacion)"
                                + " VALUES (?,3,?,?,?,?,?,?,?,?,?,?,?)");
                        sqlestud.setString(1, DatosPrincipales.getNoIdenExaminado());
                        sqlestud.setString(2, empresa3);
                        sqlestud.setString(3, mesesla3);
                        sqlestud.setString(4, lugarempresa3);
                        sqlestud.setString(5, cargotrabe3);
                        sqlestud.setString(6, salariobe3);
                        sqlestud.setString(7, mesingreso3);
                        sqlestud.setString(8, anioingreso3);
                        sqlestud.setString(9, mesretiro3);
                        sqlestud.setString(10, anioretiro3);
                        sqlestud.setString(11, motivoretiro3);
                        sqlestud.setString(12, fechanow);
                        sqlestud.executeUpdate();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "¡Error! No se actualizaron los datos de trabajo " + e);
                    }

                }
            } catch (Exception e) {
            }
        } else if ("nohay".equals(empleo3)) {

            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM  empleos_poli WHERE no_id = " + DatosPrincipales.getNoIdenExaminado() + " AND num_trabajo = 3 ");
                r.next();

                int cune = r.getRow();

                if (cune > 0) {
                    try {
                        PreparedStatement sqlacade = Conexion.connection.prepareStatement("DELETE FROM empleos_poli   WHERE no_id = " + DatosPrincipales.getNoIdenExaminado() + " AND num_trabajo = 3 ");
                        sqlacade.executeUpdate();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "¡Error! No se actualizaron los datos de trabajo " + e);
                    }
                }
            } catch (Exception e) {

            }
        }
        //Empleo 4
        if ("hay".equals(empleo4)) {

            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM  empleos_poli WHERE no_id = " + txtnoiden.getText() + " AND num_trabajo = 4 ");
                r.next();
                int cune = r.getRow();

                if (cune == 0) {
                    try {
                        PreparedStatement sqlestud = Conexion.connection.prepareStatement("INSERT INTO empleos_poli "
                                + "(no_id, num_trabajo, empresa, mesesla, lugarempresa, cargotrabe, salariobe, mesingreso, anioingreso, mesretiro, anioretiro, motivoretiro, fechacreacion)"
                                + " VALUES (?,4,?,?,?,?,?,?,?,?,?,?,?)");
                        sqlestud.setString(1, DatosPrincipales.getNoIdenExaminado());
                        sqlestud.setString(2, empresa4);
                        sqlestud.setString(3, mesesla4);
                        sqlestud.setString(4, lugarempresa4);
                        sqlestud.setString(5, cargotrabe4);
                        sqlestud.setString(6, salariobe4);
                        sqlestud.setString(7, mesingreso4);
                        sqlestud.setString(8, anioingreso4);
                        sqlestud.setString(9, mesretiro4);
                        sqlestud.setString(10, anioretiro4);
                        sqlestud.setString(11, motivoretiro4);
                        sqlestud.setString(12, fechanow);
                        sqlestud.executeUpdate();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "¡Error! No se actualizaron los datos de trabajo " + e);
                    }
                } else {

                    try {
                        PreparedStatement sqlacade = Conexion.connection.prepareStatement("DELETE FROM empleos_poli WHERE no_id = " + txtnoiden.getText() + " AND num_trabajo = 4 ");
                        sqlacade.executeUpdate();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "¡Error! No se actualizaron los datos de trabajo " + e);
                    }
                    try {
                        PreparedStatement sqlestud = Conexion.connection.prepareStatement("INSERT INTO empleos_poli "
                                + "(no_id, num_trabajo, empresa, mesesla, lugarempresa, cargotrabe, salariobe, mesingreso, anioingreso, mesretiro, anioretiro, motivoretiro, fechacreacion)"
                                + " VALUES (?,4,?,?,?,?,?,?,?,?,?,?,?)");
                        sqlestud.setString(1, DatosPrincipales.getNoIdenExaminado());
                        sqlestud.setString(2, empresa4);
                        sqlestud.setString(3, mesesla4);
                        sqlestud.setString(4, lugarempresa4);
                        sqlestud.setString(5, cargotrabe4);
                        sqlestud.setString(6, salariobe4);
                        sqlestud.setString(7, mesingreso4);
                        sqlestud.setString(8, anioingreso4);
                        sqlestud.setString(9, mesretiro4);
                        sqlestud.setString(10, anioretiro4);
                        sqlestud.setString(11, motivoretiro4);
                        sqlestud.setString(12, fechanow);
                        sqlestud.executeUpdate();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "¡Error! No se actualizaron los datos de trabajo " + e);
                    }

                }
            } catch (Exception e) {
            }
        } else if ("nohay".equals(empleo1)) {

            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM  empleos_poli WHERE no_id = " + DatosPrincipales.getNoIdenExaminado() + " AND num_trabajo = 4 ");
                r.next();

                int cune = r.getRow();

                if (cune > 0) {
                    try {
                        PreparedStatement sqlacade = Conexion.connection.prepareStatement("DELETE FROM empleos_poli   WHERE no_id = " + DatosPrincipales.getNoIdenExaminado() + " AND num_trabajo = 4 ");
                        sqlacade.executeUpdate();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "¡Error! No se actualizaron los datos de trabajo " + e);
                    }
                }
            } catch (Exception e) {

            }
        }
        //Empleo 5
        if ("hay".equals(empleo5)) {

            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM  empleos_poli WHERE no_id = " + txtnoiden.getText() + " AND num_trabajo = 5 ");
                r.next();
                int cune = r.getRow();

                if (cune == 0) {
                    try {
                        PreparedStatement sqlestud = Conexion.connection.prepareStatement("INSERT INTO empleos_poli "
                                + "(no_id, num_trabajo, empresa, mesesla, lugarempresa, cargotrabe, salariobe, mesingreso, anioingreso, mesretiro, anioretiro, motivoretiro, fechacreacion)"
                                + " VALUES (?,5,?,?,?,?,?,?,?,?,?,?,?)");
                        sqlestud.setString(1, DatosPrincipales.getNoIdenExaminado());
                        sqlestud.setString(2, empresa5);
                        sqlestud.setString(3, mesesla5);
                        sqlestud.setString(4, lugarempresa5);
                        sqlestud.setString(5, cargotrabe5);
                        sqlestud.setString(6, salariobe5);
                        sqlestud.setString(7, mesingreso5);
                        sqlestud.setString(8, anioingreso5);
                        sqlestud.setString(9, mesretiro5);
                        sqlestud.setString(10, anioretiro5);
                        sqlestud.setString(11, motivoretiro5);
                        sqlestud.setString(12, fechanow);
                        sqlestud.executeUpdate();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "¡Error! No se actualizaron los datos de trabajo " + e);
                    }
                } else {

                    try {
                        PreparedStatement sqlacade = Conexion.connection.prepareStatement("DELETE FROM empleos_poli WHERE no_id = " + txtnoiden.getText() + " AND num_trabajo = 5 ");
                        sqlacade.executeUpdate();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "¡Error! No se actualizaron los datos de trabajo " + e);
                    }
                    try {
                        PreparedStatement sqlestud = Conexion.connection.prepareStatement("INSERT INTO empleos_poli "
                                + "(no_id, num_trabajo, empresa, mesesla, lugarempresa, cargotrabe, salariobe, mesingreso, anioingreso, mesretiro, anioretiro, motivoretiro, fechacreacion)"
                                + " VALUES (?,5,?,?,?,?,?,?,?,?,?,?,?)");
                        sqlestud.setString(1, DatosPrincipales.getNoIdenExaminado());
                        sqlestud.setString(2, empresa5);
                        sqlestud.setString(3, mesesla5);
                        sqlestud.setString(4, lugarempresa5);
                        sqlestud.setString(5, cargotrabe5);
                        sqlestud.setString(6, salariobe5);
                        sqlestud.setString(7, mesingreso5);
                        sqlestud.setString(8, anioingreso5);
                        sqlestud.setString(9, mesretiro5);
                        sqlestud.setString(10, anioretiro5);
                        sqlestud.setString(11, motivoretiro5);
                        sqlestud.setString(12, fechanow);
                        sqlestud.executeUpdate();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "¡Error! No se actualizaron los datos de trabajo " + e);
                    }

                }
            } catch (Exception e) {
            }
        } else if ("nohay".equals(empleo5)) {

            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM  empleos_poli WHERE no_id = " + DatosPrincipales.getNoIdenExaminado() + " AND num_trabajo = 5 ");
                r.next();

                int cune = r.getRow();

                if (cune > 0) {
                    try {
                        PreparedStatement sqlacade = Conexion.connection.prepareStatement("DELETE FROM empleos_poli   WHERE no_id = " + DatosPrincipales.getNoIdenExaminado() + " AND num_trabajo = 5 ");
                        sqlacade.executeUpdate();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "¡Error! No se actualizaron los datos de trabajo " + e);
                    }
                }
            } catch (Exception e) {

            }
        }

        //Empleo 6
        if ("hay".equals(empleo6)) {

            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM  empleos_poli WHERE no_id = " + txtnoiden.getText() + " AND num_trabajo = 6 ");
                r.next();
                int cune = r.getRow();

                if (cune == 0) {
                    try {
                        PreparedStatement sqlestud = Conexion.connection.prepareStatement("INSERT INTO empleos_poli "
                                + "(no_id, num_trabajo, empresa, mesesla, lugarempresa, cargotrabe, salariobe, mesingreso, anioingreso, mesretiro, anioretiro, motivoretiro, fechacreacion)"
                                + " VALUES (?,6,?,?,?,?,?,?,?,?,?,?,?)");
                        sqlestud.setString(1, DatosPrincipales.getNoIdenExaminado());
                        sqlestud.setString(2, empresa6);
                        sqlestud.setString(3, mesesla6);
                        sqlestud.setString(4, lugarempresa6);
                        sqlestud.setString(5, cargotrabe6);
                        sqlestud.setString(6, salariobe6);
                        sqlestud.setString(7, mesingreso6);
                        sqlestud.setString(8, anioingreso6);
                        sqlestud.setString(9, mesretiro6);
                        sqlestud.setString(10, anioretiro6);
                        sqlestud.setString(11, motivoretiro6);
                        sqlestud.setString(12, fechanow);
                        sqlestud.executeUpdate();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "¡Error! No se actualizaron los datos de trabajo " + e);
                    }
                } else {

                    try {
                        PreparedStatement sqlacade = Conexion.connection.prepareStatement("DELETE FROM empleos_poli WHERE no_id = " + txtnoiden.getText() + " AND num_trabajo = 6 ");
                        sqlacade.executeUpdate();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "¡Error! No se actualizaron los datos de trabajo " + e);
                    }
                    try {
                        PreparedStatement sqlestud = Conexion.connection.prepareStatement("INSERT INTO empleos_poli "
                                + "(no_id, num_trabajo, empresa, mesesla, lugarempresa, cargotrabe, salariobe, mesingreso, anioingreso, mesretiro, anioretiro, motivoretiro, fechacreacion)"
                                + " VALUES (?,6,?,?,?,?,?,?,?,?,?,?,?)");
                        sqlestud.setString(1, DatosPrincipales.getNoIdenExaminado());
                        sqlestud.setString(2, empresa6);
                        sqlestud.setString(3, mesesla6);
                        sqlestud.setString(4, lugarempresa6);
                        sqlestud.setString(5, cargotrabe6);
                        sqlestud.setString(6, salariobe6);
                        sqlestud.setString(7, mesingreso6);
                        sqlestud.setString(8, anioingreso6);
                        sqlestud.setString(9, mesretiro6);
                        sqlestud.setString(10, anioretiro6);
                        sqlestud.setString(11, motivoretiro6);
                        sqlestud.setString(12, fechanow);
                        sqlestud.executeUpdate();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "¡Error! No se actualizaron los datos de trabajo " + e);
                    }

                }
            } catch (Exception e) {
            }
        } else if ("nohay".equals(empleo6)) {

            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM  empleos_poli WHERE no_id = " + DatosPrincipales.getNoIdenExaminado() + " AND num_trabajo = 6 ");
                r.next();

                int cune = r.getRow();

                if (cune > 0) {
                    try {
                        PreparedStatement sqlacade = Conexion.connection.prepareStatement("DELETE FROM empleos_poli   WHERE no_id = " + DatosPrincipales.getNoIdenExaminado() + " AND num_trabajo = 6 ");
                        sqlacade.executeUpdate();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "¡Error! No se actualizaron los datos de trabajo " + e);
                    }
                }
            } catch (Exception e) {

            }
        }

        //Empleo 7
        if ("hay".equals(empleo7)) {

            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM  empleos_poli WHERE no_id = " + txtnoiden.getText() + " AND num_trabajo = 7 ");
                r.next();
                int cune = r.getRow();

                if (cune == 0) {
                    try {
                        PreparedStatement sqlestud = Conexion.connection.prepareStatement("INSERT INTO empleos_poli "
                                + "(no_id, num_trabajo, empresa, mesesla, lugarempresa, cargotrabe, salariobe, mesingreso, anioingreso, mesretiro, anioretiro, motivoretiro, fechacreacion)"
                                + " VALUES (?,7,?,?,?,?,?,?,?,?,?,?,?)");
                        sqlestud.setString(1, DatosPrincipales.getNoIdenExaminado());
                        sqlestud.setString(2, empresa7);
                        sqlestud.setString(3, mesesla7);
                        sqlestud.setString(4, lugarempresa7);
                        sqlestud.setString(5, cargotrabe7);
                        sqlestud.setString(6, salariobe7);
                        sqlestud.setString(7, mesingreso7);
                        sqlestud.setString(8, anioingreso7);
                        sqlestud.setString(9, mesretiro7);
                        sqlestud.setString(10, anioretiro7);
                        sqlestud.setString(11, motivoretiro7);
                        sqlestud.setString(12, fechanow);
                        sqlestud.executeUpdate();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "¡Error! No se actualizaron los datos de trabajo " + e);
                    }
                } else {

                    try {
                        PreparedStatement sqlacade = Conexion.connection.prepareStatement("DELETE FROM empleos_poli WHERE no_id = " + txtnoiden.getText() + " AND num_trabajo = 7 ");
                        sqlacade.executeUpdate();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "¡Error! No se actualizaron los datos de trabajo " + e);
                    }
                    try {
                        PreparedStatement sqlestud = Conexion.connection.prepareStatement("INSERT INTO empleos_poli "
                                + "(no_id, num_trabajo, empresa, mesesla, lugarempresa, cargotrabe, salariobe, mesingreso, anioingreso, mesretiro, anioretiro, motivoretiro, fechacreacion)"
                                + " VALUES (?,7,?,?,?,?,?,?,?,?,?,?,?)");
                        sqlestud.setString(1, DatosPrincipales.getNoIdenExaminado());
                        sqlestud.setString(2, empresa7);
                        sqlestud.setString(3, mesesla7);
                        sqlestud.setString(4, lugarempresa7);
                        sqlestud.setString(5, cargotrabe7);
                        sqlestud.setString(6, salariobe7);
                        sqlestud.setString(7, mesingreso7);
                        sqlestud.setString(8, anioingreso7);
                        sqlestud.setString(9, mesretiro7);
                        sqlestud.setString(10, anioretiro7);
                        sqlestud.setString(11, motivoretiro7);
                        sqlestud.setString(12, fechanow);
                        sqlestud.executeUpdate();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "¡Error! No se actualizaron los datos de trabajo " + e);
                    }

                }
            } catch (Exception e) {
            }
        } else if ("nohay".equals(empleo7)) {

            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM  empleos_poli WHERE no_id = " + DatosPrincipales.getNoIdenExaminado() + " AND num_trabajo = 7 ");
                r.next();

                int cune = r.getRow();

                if (cune > 0) {
                    try {
                        PreparedStatement sqlacade = Conexion.connection.prepareStatement("DELETE FROM empleos_poli   WHERE no_id = " + DatosPrincipales.getNoIdenExaminado() + " AND num_trabajo = 7 ");
                        sqlacade.executeUpdate();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "¡Error! No se actualizaron los datos de trabajo " + e);
                    }
                }
            } catch (Exception e) {

            }
        }

        //Empleo 8
        if ("hay".equals(empleo8)) {

            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM  empleos_poli WHERE no_id = " + txtnoiden.getText() + " AND num_trabajo = 8 ");
                r.next();
                int cune = r.getRow();

                if (cune == 0) {
                    try {
                        PreparedStatement sqlestud = Conexion.connection.prepareStatement("INSERT INTO empleos_poli "
                                + "(no_id, num_trabajo, empresa, mesesla, lugarempresa, cargotrabe, salariobe, mesingreso, anioingreso, mesretiro, anioretiro, motivoretiro, fechacreacion)"
                                + " VALUES (?,8,?,?,?,?,?,?,?,?,?,?,?)");
                        sqlestud.setString(1, DatosPrincipales.getNoIdenExaminado());
                        sqlestud.setString(2, empresa8);
                        sqlestud.setString(3, mesesla8);
                        sqlestud.setString(4, lugarempresa8);
                        sqlestud.setString(5, cargotrabe8);
                        sqlestud.setString(6, salariobe8);
                        sqlestud.setString(7, mesingreso8);
                        sqlestud.setString(8, anioingreso8);
                        sqlestud.setString(9, mesretiro8);
                        sqlestud.setString(10, anioretiro8);
                        sqlestud.setString(11, motivoretiro8);
                        sqlestud.setString(12, fechanow);
                        sqlestud.executeUpdate();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "¡Error! No se actualizaron los datos de trabajo " + e);
                    }
                } else {

                    try {
                        PreparedStatement sqlacade = Conexion.connection.prepareStatement("DELETE FROM empleos_poli WHERE no_id = " + txtnoiden.getText() + " AND num_trabajo = 8 ");
                        sqlacade.executeUpdate();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "¡Error! No se actualizaron los datos de trabajo " + e);
                    }
                    try {
                        PreparedStatement sqlestud = Conexion.connection.prepareStatement("INSERT INTO empleos_poli "
                                + "(no_id, num_trabajo, empresa, mesesla, lugarempresa, cargotrabe, salariobe, mesingreso, anioingreso, mesretiro, anioretiro, motivoretiro, fechacreacion)"
                                + " VALUES (?,8,?,?,?,?,?,?,?,?,?,?,?)");
                        sqlestud.setString(1, DatosPrincipales.getNoIdenExaminado());
                        sqlestud.setString(2, empresa8);
                        sqlestud.setString(3, mesesla8);
                        sqlestud.setString(4, lugarempresa8);
                        sqlestud.setString(5, cargotrabe8);
                        sqlestud.setString(6, salariobe8);
                        sqlestud.setString(7, mesingreso8);
                        sqlestud.setString(8, anioingreso8);
                        sqlestud.setString(9, mesretiro8);
                        sqlestud.setString(10, anioretiro8);
                        sqlestud.setString(11, motivoretiro8);
                        sqlestud.setString(12, fechanow);
                        sqlestud.executeUpdate();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "¡Error! No se actualizaron los datos de trabajo " + e);
                    }

                }
            } catch (Exception e) {
            }
        } else if ("nohay".equals(empleo8)) {

            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM  empleos_poli WHERE no_id = " + DatosPrincipales.getNoIdenExaminado() + " AND num_trabajo = 8 ");
                r.next();

                int cune = r.getRow();

                if (cune > 0) {
                    try {
                        PreparedStatement sqlacade = Conexion.connection.prepareStatement("DELETE FROM empleos_poli   WHERE no_id = " + DatosPrincipales.getNoIdenExaminado() + " AND num_trabajo = 8 ");
                        sqlacade.executeUpdate();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "¡Error! No se actualizaron los datos de trabajo " + e);
                    }
                }
            } catch (Exception e) {

            }
        }

        //Empleo 9
        if ("hay".equals(empleo9)) {

            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM  empleos_poli WHERE no_id = " + txtnoiden.getText() + " AND num_trabajo = 9 ");
                r.next();
                int cune = r.getRow();

                if (cune == 0) {
                    try {
                        PreparedStatement sqlestud = Conexion.connection.prepareStatement("INSERT INTO empleos_poli "
                                + "(no_id, num_trabajo, empresa, mesesla, lugarempresa, cargotrabe, salariobe, mesingreso, anioingreso, mesretiro, anioretiro, motivoretiro, fechacreacion)"
                                + " VALUES (?,9,?,?,?,?,?,?,?,?,?,?,?)");
                        sqlestud.setString(1, DatosPrincipales.getNoIdenExaminado());
                        sqlestud.setString(2, empresa9);
                        sqlestud.setString(3, mesesla9);
                        sqlestud.setString(4, lugarempresa9);
                        sqlestud.setString(5, cargotrabe9);
                        sqlestud.setString(6, salariobe9);
                        sqlestud.setString(7, mesingreso9);
                        sqlestud.setString(8, anioingreso9);
                        sqlestud.setString(9, mesretiro9);
                        sqlestud.setString(10, anioretiro9);
                        sqlestud.setString(11, motivoretiro9);
                        sqlestud.setString(12, fechanow);
                        sqlestud.executeUpdate();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "¡Error! No se actualizaron los datos de trabajo " + e);
                    }
                } else {

                    try {
                        PreparedStatement sqlacade = Conexion.connection.prepareStatement("DELETE FROM empleos_poli WHERE no_id = " + txtnoiden.getText() + " AND num_trabajo = 9 ");
                        sqlacade.executeUpdate();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "¡Error! No se actualizaron los datos de trabajo " + e);
                    }
                    try {
                        PreparedStatement sqlestud = Conexion.connection.prepareStatement("INSERT INTO empleos_poli "
                                + "(no_id, num_trabajo, empresa, mesesla, lugarempresa, cargotrabe, salariobe, mesingreso, anioingreso, mesretiro, anioretiro, motivoretiro, fechacreacion)"
                                + " VALUES (?,9,?,?,?,?,?,?,?,?,?,?,?)");
                        sqlestud.setString(1, DatosPrincipales.getNoIdenExaminado());
                        sqlestud.setString(2, empresa9);
                        sqlestud.setString(3, mesesla9);
                        sqlestud.setString(4, lugarempresa9);
                        sqlestud.setString(5, cargotrabe9);
                        sqlestud.setString(6, salariobe9);
                        sqlestud.setString(7, mesingreso9);
                        sqlestud.setString(8, anioingreso9);
                        sqlestud.setString(9, mesretiro9);
                        sqlestud.setString(10, anioretiro9);
                        sqlestud.setString(11, motivoretiro9);
                        sqlestud.setString(12, fechanow);
                        sqlestud.executeUpdate();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "¡Error! No se actualizaron los datos de trabajo " + e);
                    }

                }
            } catch (Exception e) {
            }
        } else if ("nohay".equals(empleo9)) {

            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM  empleos_poli WHERE no_id = " + DatosPrincipales.getNoIdenExaminado() + " AND num_trabajo = 9 ");
                r.next();

                int cune = r.getRow();

                if (cune > 0) {
                    try {
                        PreparedStatement sqlacade = Conexion.connection.prepareStatement("DELETE FROM empleos_poli   WHERE no_id = " + DatosPrincipales.getNoIdenExaminado() + " AND num_trabajo = 9 ");
                        sqlacade.executeUpdate();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "¡Error! No se actualizaron los datos de trabajo " + e);
                    }
                }
            } catch (Exception e) {

            }
        }

        //Empleo 10
        if ("hay".equals(empleo10)) {

            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM  empleos_poli WHERE no_id = " + txtnoiden.getText() + " AND num_trabajo = 10 ");
                r.next();
                int cune = r.getRow();

                if (cune == 0) {
                    try {
                        PreparedStatement sqlestud = Conexion.connection.prepareStatement("INSERT INTO empleos_poli "
                                + "(no_id, num_trabajo, empresa, mesesla, lugarempresa, cargotrabe, salariobe, mesingreso, anioingreso, mesretiro, anioretiro, motivoretiro, fechacreacion)"
                                + " VALUES (?,10,?,?,?,?,?,?,?,?,?,?,?)");
                        sqlestud.setString(1, DatosPrincipales.getNoIdenExaminado());
                        sqlestud.setString(2, empresa10);
                        sqlestud.setString(3, mesesla10);
                        sqlestud.setString(4, lugarempresa10);
                        sqlestud.setString(5, cargotrabe10);
                        sqlestud.setString(6, salariobe10);
                        sqlestud.setString(7, mesingreso10);
                        sqlestud.setString(8, anioingreso10);
                        sqlestud.setString(9, mesretiro10);
                        sqlestud.setString(10, anioretiro10);
                        sqlestud.setString(11, motivoretiro10);
                        sqlestud.setString(12, fechanow);
                        sqlestud.executeUpdate();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "¡Error! No se actualizaron los datos de trabajo " + e);
                    }
                } else {

                    try {
                        PreparedStatement sqlacade = Conexion.connection.prepareStatement("DELETE FROM empleos_poli WHERE no_id = " + txtnoiden.getText() + " AND num_trabajo = 10 ");
                        sqlacade.executeUpdate();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "¡Error! No se actualizaron los datos de trabajo " + e);
                    }
                    try {
                        PreparedStatement sqlestud = Conexion.connection.prepareStatement("INSERT INTO empleos_poli "
                                + "(no_id, num_trabajo, empresa, mesesla, lugarempresa, cargotrabe, salariobe, mesingreso, anioingreso, mesretiro, anioretiro, motivoretiro, fechacreacion)"
                                + " VALUES (?,10,?,?,?,?,?,?,?,?,?,?,?)");
                        sqlestud.setString(1, DatosPrincipales.getNoIdenExaminado());
                        sqlestud.setString(2, empresa10);
                        sqlestud.setString(3, mesesla10);
                        sqlestud.setString(4, lugarempresa10);
                        sqlestud.setString(5, cargotrabe10);
                        sqlestud.setString(6, salariobe10);
                        sqlestud.setString(7, mesingreso10);
                        sqlestud.setString(8, anioingreso10);
                        sqlestud.setString(9, mesretiro10);
                        sqlestud.setString(10, anioretiro10);
                        sqlestud.setString(11, motivoretiro10);
                        sqlestud.setString(12, fechanow);
                        sqlestud.executeUpdate();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "¡Error! No se actualizaron los datos de trabajo " + e);
                    }

                }
            } catch (Exception e) {
            }
        } else if ("nohay".equals(empleo10)) {

            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM  empleos_poli WHERE no_id = " + DatosPrincipales.getNoIdenExaminado() + " AND num_trabajo = 10 ");
                r.next();

                int cune = r.getRow();

                if (cune > 0) {
                    try {
                        PreparedStatement sqlacade = Conexion.connection.prepareStatement("DELETE FROM empleos_poli   WHERE no_id = " + DatosPrincipales.getNoIdenExaminado() + " AND num_trabajo = 10 ");
                        sqlacade.executeUpdate();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "¡Error! No se actualizaron los datos de trabajo " + e);
                    }
                }
            } catch (Exception e) {

            }
        }

        //Empleo 11
        if ("hay".equals(empleo11)) {

            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM  empleos_poli WHERE no_id = " + txtnoiden.getText() + " AND num_trabajo = 11 ");
                r.next();
                int cune = r.getRow();

                if (cune == 0) {
                    try {
                        PreparedStatement sqlestud = Conexion.connection.prepareStatement("INSERT INTO empleos_poli "
                                + "(no_id, num_trabajo, empresa, mesesla, lugarempresa, cargotrabe, salariobe, mesingreso, anioingreso, mesretiro, anioretiro, motivoretiro, fechacreacion)"
                                + " VALUES (?,11,?,?,?,?,?,?,?,?,?,?,?)");
                        sqlestud.setString(1, DatosPrincipales.getNoIdenExaminado());
                        sqlestud.setString(2, empresa11);
                        sqlestud.setString(3, mesesla11);
                        sqlestud.setString(4, lugarempresa11);
                        sqlestud.setString(5, cargotrabe11);
                        sqlestud.setString(6, salariobe11);
                        sqlestud.setString(7, mesingreso11);
                        sqlestud.setString(8, anioingreso11);
                        sqlestud.setString(9, mesretiro11);
                        sqlestud.setString(10, anioretiro11);
                        sqlestud.setString(11, motivoretiro11);
                        sqlestud.setString(12, fechanow);
                        sqlestud.executeUpdate();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "¡Error! No se actualizaron los datos de trabajo " + e);
                    }
                } else {

                    try {
                        PreparedStatement sqlacade = Conexion.connection.prepareStatement("DELETE FROM empleos_poli WHERE no_id = " + txtnoiden.getText() + " AND num_trabajo = 11 ");
                        sqlacade.executeUpdate();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "¡Error! No se actualizaron los datos de trabajo " + e);
                    }
                    try {
                        PreparedStatement sqlestud = Conexion.connection.prepareStatement("INSERT INTO empleos_poli "
                                + "(no_id, num_trabajo, empresa, mesesla, lugarempresa, cargotrabe, salariobe, mesingreso, anioingreso, mesretiro, anioretiro, motivoretiro, fechacreacion)"
                                + " VALUES (?,11,?,?,?,?,?,?,?,?,?,?,?)");
                        sqlestud.setString(1, DatosPrincipales.getNoIdenExaminado());
                        sqlestud.setString(2, empresa11);
                        sqlestud.setString(3, mesesla11);
                        sqlestud.setString(4, lugarempresa11);
                        sqlestud.setString(5, cargotrabe11);
                        sqlestud.setString(6, salariobe11);
                        sqlestud.setString(7, mesingreso11);
                        sqlestud.setString(8, anioingreso11);
                        sqlestud.setString(9, mesretiro11);
                        sqlestud.setString(10, anioretiro11);
                        sqlestud.setString(11, motivoretiro11);
                        sqlestud.setString(12, fechanow);
                        sqlestud.executeUpdate();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "¡Error! No se actualizaron los datos de trabajo " + e);
                    }

                }
            } catch (Exception e) {
            }
        } else if ("nohay".equals(empleo11)) {

            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM  empleos_poli WHERE no_id = " + DatosPrincipales.getNoIdenExaminado() + " AND num_trabajo = 11 ");
                r.next();

                int cune = r.getRow();

                if (cune > 0) {
                    try {
                        PreparedStatement sqlacade = Conexion.connection.prepareStatement("DELETE FROM empleos_poli   WHERE no_id = " + DatosPrincipales.getNoIdenExaminado() + " AND num_trabajo = 11 ");
                        sqlacade.executeUpdate();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "¡Error! No se actualizaron los datos de trabajo " + e);
                    }
                }
            } catch (Exception e) {

            }
        }

        //Empleo 12
        if ("hay".equals(empleo12)) {

            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM  empleos_poli WHERE no_id = " + txtnoiden.getText() + " AND num_trabajo = 12 ");
                r.next();
                int cune = r.getRow();

                if (cune == 0) {
                    try {
                        PreparedStatement sqlestud = Conexion.connection.prepareStatement("INSERT INTO empleos_poli "
                                + "(no_id, num_trabajo, empresa, mesesla, lugarempresa, cargotrabe, salariobe, mesingreso, anioingreso, mesretiro, anioretiro, motivoretiro, fechacreacion)"
                                + " VALUES (?,12,?,?,?,?,?,?,?,?,?,?,?)");
                        sqlestud.setString(1, DatosPrincipales.getNoIdenExaminado());
                        sqlestud.setString(2, empresa12);
                        sqlestud.setString(3, mesesla12);
                        sqlestud.setString(4, lugarempresa12);
                        sqlestud.setString(5, cargotrabe12);
                        sqlestud.setString(6, salariobe12);
                        sqlestud.setString(7, mesingreso12);
                        sqlestud.setString(8, anioingreso12);
                        sqlestud.setString(9, mesretiro12);
                        sqlestud.setString(10, anioretiro12);
                        sqlestud.setString(11, motivoretiro12);
                        sqlestud.setString(12, fechanow);
                        sqlestud.executeUpdate();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "¡Error! No se actualizaron los datos de trabajo " + e);
                    }
                } else {

                    try {
                        PreparedStatement sqlacade = Conexion.connection.prepareStatement("DELETE FROM empleos_poli WHERE no_id = " + txtnoiden.getText() + " AND num_trabajo = 12 ");
                        sqlacade.executeUpdate();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "¡Error! No se actualizaron los datos de trabajo " + e);
                    }
                    try {
                        PreparedStatement sqlestud = Conexion.connection.prepareStatement("INSERT INTO empleos_poli "
                                + "(no_id, num_trabajo, empresa, mesesla, lugarempresa, cargotrabe, salariobe, mesingreso, anioingreso, mesretiro, anioretiro, motivoretiro, fechacreacion)"
                                + " VALUES (?,12,?,?,?,?,?,?,?,?,?,?,?)");
                        sqlestud.setString(1, DatosPrincipales.getNoIdenExaminado());
                        sqlestud.setString(2, empresa12);
                        sqlestud.setString(3, mesesla12);
                        sqlestud.setString(4, lugarempresa12);
                        sqlestud.setString(5, cargotrabe12);
                        sqlestud.setString(6, salariobe12);
                        sqlestud.setString(7, mesingreso12);
                        sqlestud.setString(8, anioingreso12);
                        sqlestud.setString(9, mesretiro12);
                        sqlestud.setString(10, anioretiro12);
                        sqlestud.setString(11, motivoretiro12);
                        sqlestud.setString(12, fechanow);
                        sqlestud.executeUpdate();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "¡Error! No se actualizaron los datos de trabajo " + e);
                    }

                }
            } catch (Exception e) {
            }
        } else if ("nohay".equals(empleo12)) {

            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM  empleos_poli WHERE no_id = " + DatosPrincipales.getNoIdenExaminado() + " AND num_trabajo = 12 ");
                r.next();

                int cune = r.getRow();

                if (cune > 0) {
                    try {
                        PreparedStatement sqlacade = Conexion.connection.prepareStatement("DELETE FROM empleos_poli   WHERE no_id = " + DatosPrincipales.getNoIdenExaminado() + " AND num_trabajo = 12 ");
                        sqlacade.executeUpdate();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "¡Error! No se actualizaron los datos de trabajo " + e);
                    }
                }
            } catch (Exception e) {

            }
        }

        //Empleo 13
        if ("hay".equals(empleo13)) {

            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM  empleos_poli WHERE no_id = " + txtnoiden.getText() + " AND num_trabajo = 13 ");
                r.next();
                int cune = r.getRow();

                if (cune == 0) {
                    try {
                        PreparedStatement sqlestud = Conexion.connection.prepareStatement("INSERT INTO empleos_poli "
                                + "(no_id, num_trabajo, empresa, mesesla, lugarempresa, cargotrabe, salariobe, mesingreso, anioingreso, mesretiro, anioretiro, motivoretiro, fechacreacion)"
                                + " VALUES (?,13,?,?,?,?,?,?,?,?,?,?,?)");
                        sqlestud.setString(1, DatosPrincipales.getNoIdenExaminado());
                        sqlestud.setString(2, empresa13);
                        sqlestud.setString(3, mesesla13);
                        sqlestud.setString(4, lugarempresa13);
                        sqlestud.setString(5, cargotrabe13);
                        sqlestud.setString(6, salariobe13);
                        sqlestud.setString(7, mesingreso13);
                        sqlestud.setString(8, anioingreso13);
                        sqlestud.setString(9, mesretiro13);
                        sqlestud.setString(10, anioretiro13);
                        sqlestud.setString(11, motivoretiro13);
                        sqlestud.setString(12, fechanow);
                        sqlestud.executeUpdate();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "¡Error! No se actualizaron los datos de trabajo " + e);
                    }
                } else {

                    try {
                        PreparedStatement sqlacade = Conexion.connection.prepareStatement("DELETE FROM empleos_poli WHERE no_id = " + txtnoiden.getText() + " AND num_trabajo = 13 ");
                        sqlacade.executeUpdate();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "¡Error! No se actualizaron los datos de trabajo " + e);
                    }
                    try {
                        PreparedStatement sqlestud = Conexion.connection.prepareStatement("INSERT INTO empleos_poli "
                                + "(no_id, num_trabajo, empresa, mesesla, lugarempresa, cargotrabe, salariobe, mesingreso, anioingreso, mesretiro, anioretiro, motivoretiro, fechacreacion)"
                                + " VALUES (?,13,?,?,?,?,?,?,?,?,?,?,?)");
                        sqlestud.setString(1, DatosPrincipales.getNoIdenExaminado());
                        sqlestud.setString(2, empresa13);
                        sqlestud.setString(3, mesesla13);
                        sqlestud.setString(4, lugarempresa13);
                        sqlestud.setString(5, cargotrabe13);
                        sqlestud.setString(6, salariobe13);
                        sqlestud.setString(7, mesingreso13);
                        sqlestud.setString(8, anioingreso13);
                        sqlestud.setString(9, mesretiro13);
                        sqlestud.setString(10, anioretiro13);
                        sqlestud.setString(11, motivoretiro13);
                        sqlestud.setString(12, fechanow);
                        sqlestud.executeUpdate();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "¡Error! No se actualizaron los datos de trabajo " + e);
                    }

                }
            } catch (Exception e) {
            }
        } else if ("nohay".equals(empleo13)) {

            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM  empleos_poli WHERE no_id = " + DatosPrincipales.getNoIdenExaminado() + " AND num_trabajo = 13 ");
                r.next();

                int cune = r.getRow();

                if (cune > 0) {
                    try {
                        PreparedStatement sqlacade = Conexion.connection.prepareStatement("DELETE FROM empleos_poli   WHERE no_id = " + DatosPrincipales.getNoIdenExaminado() + " AND num_trabajo = 13 ");
                        sqlacade.executeUpdate();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "¡Error! No se actualizaron los datos de trabajo " + e);
                    }
                }
            } catch (Exception e) {

            }
        }

        //Empleo 14
        if ("hay".equals(empleo14)) {

            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM  empleos_poli WHERE no_id = " + txtnoiden.getText() + " AND num_trabajo = 14 ");
                r.next();
                int cune = r.getRow();

                if (cune == 0) {
                    try {
                        PreparedStatement sqlestud = Conexion.connection.prepareStatement("INSERT INTO empleos_poli "
                                + "(no_id, num_trabajo, empresa, mesesla, lugarempresa, cargotrabe, salariobe, mesingreso, anioingreso, mesretiro, anioretiro, motivoretiro, fechacreacion)"
                                + " VALUES (?,14,?,?,?,?,?,?,?,?,?,?,?)");
                        sqlestud.setString(1, DatosPrincipales.getNoIdenExaminado());
                        sqlestud.setString(2, empresa14);
                        sqlestud.setString(3, mesesla14);
                        sqlestud.setString(4, lugarempresa14);
                        sqlestud.setString(5, cargotrabe14);
                        sqlestud.setString(6, salariobe14);
                        sqlestud.setString(7, mesingreso14);
                        sqlestud.setString(8, anioingreso14);
                        sqlestud.setString(9, mesretiro14);
                        sqlestud.setString(10, anioretiro14);
                        sqlestud.setString(11, motivoretiro14);
                        sqlestud.setString(12, fechanow);
                        sqlestud.executeUpdate();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "¡Error! No se actualizaron los datos de trabajo " + e);
                    }
                } else {

                    try {
                        PreparedStatement sqlacade = Conexion.connection.prepareStatement("DELETE FROM empleos_poli WHERE no_id = " + txtnoiden.getText() + " AND num_trabajo = 14 ");
                        sqlacade.executeUpdate();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "¡Error! No se actualizaron los datos de trabajo " + e);
                    }
                    try {
                        PreparedStatement sqlestud = Conexion.connection.prepareStatement("INSERT INTO empleos_poli "
                                + "(no_id, num_trabajo, empresa, mesesla, lugarempresa, cargotrabe, salariobe, mesingreso, anioingreso, mesretiro, anioretiro, motivoretiro, fechacreacion)"
                                + " VALUES (?,14,?,?,?,?,?,?,?,?,?,?,?)");
                        sqlestud.setString(1, DatosPrincipales.getNoIdenExaminado());
                        sqlestud.setString(2, empresa14);
                        sqlestud.setString(3, mesesla14);
                        sqlestud.setString(4, lugarempresa14);
                        sqlestud.setString(5, cargotrabe14);
                        sqlestud.setString(6, salariobe14);
                        sqlestud.setString(7, mesingreso14);
                        sqlestud.setString(8, anioingreso14);
                        sqlestud.setString(9, mesretiro14);
                        sqlestud.setString(10, anioretiro14);
                        sqlestud.setString(11, motivoretiro14);
                        sqlestud.setString(12, fechanow);
                        sqlestud.executeUpdate();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "¡Error! No se actualizaron los datos de trabajo " + e);
                    }

                }
            } catch (Exception e) {
            }
        } else if ("nohay".equals(empleo14)) {

            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM  empleos_poli WHERE no_id = " + DatosPrincipales.getNoIdenExaminado() + " AND num_trabajo = 14 ");
                r.next();

                int cune = r.getRow();

                if (cune > 0) {
                    try {
                        PreparedStatement sqlacade = Conexion.connection.prepareStatement("DELETE FROM empleos_poli   WHERE no_id = " + DatosPrincipales.getNoIdenExaminado() + " AND num_trabajo = 14 ");
                        sqlacade.executeUpdate();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "¡Error! No se actualizaron los datos de trabajo " + e);
                    }
                }
            } catch (Exception e) {

            }
        }

        //Empleo 15
        if ("hay".equals(empleo15)) {

            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM  empleos_poli WHERE no_id = " + txtnoiden.getText() + " AND num_trabajo = 15 ");
                r.next();
                int cune = r.getRow();

                if (cune == 0) {
                    try {
                        PreparedStatement sqlestud = Conexion.connection.prepareStatement("INSERT INTO empleos_poli "
                                + "(no_id, num_trabajo, empresa, mesesla, lugarempresa, cargotrabe, salariobe, mesingreso, anioingreso, mesretiro, anioretiro, motivoretiro, fechacreacion)"
                                + " VALUES (?,15,?,?,?,?,?,?,?,?,?,?,?)");
                        sqlestud.setString(1, DatosPrincipales.getNoIdenExaminado());
                        sqlestud.setString(2, empresa15);
                        sqlestud.setString(3, mesesla15);
                        sqlestud.setString(4, lugarempresa15);
                        sqlestud.setString(5, cargotrabe15);
                        sqlestud.setString(6, salariobe15);
                        sqlestud.setString(7, mesingreso15);
                        sqlestud.setString(8, anioingreso15);
                        sqlestud.setString(9, mesretiro15);
                        sqlestud.setString(10, anioretiro15);
                        sqlestud.setString(11, motivoretiro15);
                        sqlestud.setString(12, fechanow);
                        sqlestud.executeUpdate();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "¡Error! No se actualizaron los datos de trabajo " + e);
                    }
                } else {

                    try {
                        PreparedStatement sqlacade = Conexion.connection.prepareStatement("DELETE FROM empleos_poli WHERE no_id = " + txtnoiden.getText() + " AND num_trabajo = 15 ");
                        sqlacade.executeUpdate();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "¡Error! No se actualizaron los datos de trabajo " + e);
                    }
                    try {
                        PreparedStatement sqlestud = Conexion.connection.prepareStatement("INSERT INTO empleos_poli "
                                + "(no_id, num_trabajo, empresa, mesesla, lugarempresa, cargotrabe, salariobe, mesingreso, anioingreso, mesretiro, anioretiro, motivoretiro, fechacreacion)"
                                + " VALUES (?,15,?,?,?,?,?,?,?,?,?,?,?)");
                        sqlestud.setString(1, DatosPrincipales.getNoIdenExaminado());
                        sqlestud.setString(2, empresa15);
                        sqlestud.setString(3, mesesla15);
                        sqlestud.setString(4, lugarempresa15);
                        sqlestud.setString(5, cargotrabe15);
                        sqlestud.setString(6, salariobe15);
                        sqlestud.setString(7, mesingreso15);
                        sqlestud.setString(8, anioingreso15);
                        sqlestud.setString(9, mesretiro15);
                        sqlestud.setString(10, anioretiro15);
                        sqlestud.setString(11, motivoretiro15);
                        sqlestud.setString(12, fechanow);
                        sqlestud.executeUpdate();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "¡Error! No se actualizaron los datos de trabajo " + e);
                    }

                }
            } catch (Exception e) {
            }
        } else if ("nohay".equals(empleo15)) {

            try {
                Connection con = Conexion.connection;
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("SELECT * FROM  empleos_poli WHERE no_id = " + DatosPrincipales.getNoIdenExaminado() + " AND num_trabajo = 15 ");
                r.next();

                int cune = r.getRow();

                if (cune > 0) {
                    try {
                        PreparedStatement sqlacade = Conexion.connection.prepareStatement("DELETE FROM empleos_poli   WHERE no_id = " + DatosPrincipales.getNoIdenExaminado() + " AND num_trabajo = 15 ");
                        sqlacade.executeUpdate();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "¡Error! No se actualizaron los datos de trabajo " + e);
                    }
                }
            } catch (Exception e) {

            }
        }

    }

    public void update_histlabo() {
        try {
            PreparedStatement sql = Conexion.connection.prepareStatement("UPDATE datos_generales_poli "
                    + "SET empleobefore = '" + empleobefore + "', periodosinacla = '" + periodosinacla + "',"
                    + " didmalosactos = '" + didmalosactos + "', expdidmalosactos = '" + periodosinacla + "',"
                    + "historlabopre1 = '" + historlabopre1 + "', exphistorlabopre1 = '" + exphistorlabopre1 + "', "
                    + "historlabopre2 = '" + historlabopre2 + "', exphistorlabopre2 = '" + exphistorlabopre2 + "', "
                    + "historlabopre3 = '" + historlabopre3 + "', exphistorlabopre3 = '" + exphistorlabopre3 + "', "
                    + "historlabopre4= '" + historlabopre4 + "', exphistorlabopre4 = '" + exphistorlabopre4 + "', "
                    + "historlabopre5 = '" + historlabopre5 + "', exphistorlabopre5 = '" + exphistorlabopre5 + "', "
                    + "historlabopre6 = '" + historlabopre6 + "', exphistorlabopre6 = '" + exphistorlabopre6 + "', "
                    + "historlabopre7 = '" + historlabopre7 + "', exphistorlabopre7 = '" + exphistorlabopre7 + "',"
                    + "historlabopre8 = '" + historlabopre8 + "', exphistorlabopre8 = '" + exphistorlabopre8 + "'  WHERE no_id = " + txtnoiden.getText() + "  ");

            sql.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "¡Error en el ingreso de datos a la base!\nPor favor solicite ayuda al equipo de desarrollo" + e);
        }
    }

    public void limpiar() {
        empleobefore = "-";
        periodosinacla = "";
        didmalosactos = "-";
        expdidmalosactos = "";
        historlabopre1 = "-";
        exphistorlabopre1 = "";
        historlabopre2 = "-";
        exphistorlabopre2 = "";
        historlabopre3 = "-";
        exphistorlabopre3 = "";
        historlabopre4 = "-";
        exphistorlabopre4 = "";
        historlabopre5 = "-";
        exphistorlabopre5 = "";
        historlabopre6 = "-";
        exphistorlabopre6 = "";
        historlabopre7 = "-";
        exphistorlabopre7 = "";
        historlabopre8 = "-";
        exphistorlabopre8 = "";

        admisionHistoriaLaboral = "";

        vnfecha1 = true;
        vnfecha2 = true;
        vnfecha3 = true;
        vnfecha4 = true;
        vnfecha5 = true;
        vnfecha6 = true;
        vnfecha7 = true;
        vnfecha8 = true;
        vnfecha9 = true;
        vnfecha10 = true;
        vnfecha11 = true;
        vnfecha12 = true;
        vnfecha13 = true;
        vnfecha14 = true;
        vnfecha15 = true;

        empleo1 = "";
        empleo2 = "";
        empleo3 = "";
        empleo4 = "";
        empleo5 = "";
        empleo6 = "";
        empleo7 = "";
        empleo8 = "";
        empleo9 = "";
        empleo10 = "";
        empleo11 = "";
        empleo12 = "";
        empleo13 = "";
        empleo14 = "";
        empleo15 = "";

        empresa1 = "";
        lugarempresa1 = "";
        cargotrabe1 = "";
        salariobe1 = "";
        mesesla1 = "";
        mesingreso1 = "";
        anioingreso1 = "";
        mesretiro1 = "";
        anioretiro1 = "";
        motivoretiro1 = "";

        empresa2 = "";
        lugarempresa2 = "";
        cargotrabe2 = "";
        salariobe2 = "";
        mesesla2 = "";
        mesingreso2 = "";
        anioingreso2 = "";
        mesretiro2 = "";
        anioretiro2 = "";
        motivoretiro2 = "";

        empresa3 = "";
        lugarempresa3 = "";
        cargotrabe3 = "";
        salariobe3 = "";
        mesesla3 = "";
        mesingreso3 = "";
        anioingreso3 = "";
        mesretiro3 = "";
        anioretiro3 = "";
        motivoretiro3 = "";

        empresa4 = "";
        lugarempresa4 = "";
        cargotrabe4 = "";
        salariobe4 = "";
        mesesla4 = "";
        mesingreso4 = "";
        anioingreso4 = "";
        mesretiro4 = "";
        anioretiro4 = "";
        motivoretiro4 = "";

        empresa5 = "";
        lugarempresa5 = "";
        cargotrabe5 = "";
        salariobe5 = "";
        mesesla5 = "";
        mesingreso5 = "";
        anioingreso5 = "";
        mesretiro5 = "";
        anioretiro5 = "";
        motivoretiro5 = "";

        empresa6 = "";
        lugarempresa6 = "";
        cargotrabe6 = "";
        salariobe6 = "";
        mesesla6 = "";
        mesingreso6 = "";
        anioingreso6 = "";
        mesretiro6 = "";
        anioretiro6 = "";
        motivoretiro6 = "";

        empresa7 = "";
        lugarempresa7 = "";
        cargotrabe7 = "";
        salariobe7 = "";
        mesesla7 = "";
        mesingreso7 = "";
        anioingreso7 = "";
        mesretiro7 = "";
        anioretiro7 = "";
        motivoretiro7 = "";

        empresa8 = "";
        lugarempresa8 = "";
        cargotrabe8 = "";
        salariobe8 = "";
        mesesla8 = "";
        mesingreso8 = "";
        anioingreso8 = "";
        mesretiro8 = "";
        anioretiro8 = "";
        motivoretiro8 = "";

        empresa9 = "";
        lugarempresa9 = "";
        cargotrabe9 = "";
        salariobe9 = "";
        mesesla9 = "";
        mesingreso9 = "";
        anioingreso9 = "";
        mesretiro9 = "";
        anioretiro9 = "";
        motivoretiro9 = "";

        empresa10 = "";
        lugarempresa10 = "";
        cargotrabe10 = "";
        salariobe10 = "";
        mesesla10 = "";
        mesingreso10 = "";
        anioingreso10 = "";
        mesretiro10 = "";
        anioretiro10 = "";
        motivoretiro10 = "";

        empresa11 = "";
        lugarempresa11 = "";
        cargotrabe11 = "";
        salariobe11 = "";
        mesesla11 = "";
        mesingreso11 = "";
        anioingreso11 = "";
        mesretiro11 = "";
        anioretiro11 = "";
        motivoretiro11 = "";

        empresa12 = "";
        lugarempresa12 = "";
        cargotrabe12 = "";
        salariobe12 = "";
        mesesla12 = "";
        mesingreso12 = "";
        anioingreso12 = "";
        mesretiro12 = "";
        anioretiro12 = "";
        motivoretiro12 = "";

        empresa13 = "";

        lugarempresa13 = "";
        cargotrabe13 = "";
        salariobe13 = "";
        mesesla13 = "";
        mesingreso13 = "";
        anioingreso13 = "";
        mesretiro13 = "";
        anioretiro13 = "";
        motivoretiro13 = "";

        empresa14 = "";
        lugarempresa14 = "";
        cargotrabe14 = "";
        salariobe14 = "";
        mesesla14 = "";
        mesingreso14 = "";
        anioingreso14 = "";
        mesretiro14 = "";
        anioretiro14 = "";
        motivoretiro14 = "";

        empresa15 = "";
        lugarempresa15 = "";
        cargotrabe15 = "";
        salariobe15 = "";
        mesesla15 = "";
        mesingreso15 = "";
        anioingreso15 = "";
        mesretiro15 = "";
        anioretiro15 = "";
        motivoretiro15 = "";

        malacto1 = "";
        malacto2 = "";
        malacto3 = "";
        malacto4 = "";
        malacto5 = "";
        malacto6 = "";
        
        colorCategoria = "sincolor";
    }

}
