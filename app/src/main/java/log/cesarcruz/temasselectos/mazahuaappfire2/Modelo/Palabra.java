package log.cesarcruz.temasselectos.mazahuaappfire2.Modelo;

import java.io.Serializable;

public class Palabra implements Serializable {

    private String aPalabraImagen;
    private String bPalabraTexto;
    private String cPalabraTipo;
    private String dPalabraTemas;
    private String ePalabraTemasF;
    private String fPalabraDonato;
    private String gPalabraDonatoF;
    private String hPalabrax1;
    private String iPalabrax2;
    private String jPalabraAudioT;
    private String kPlabraAudioD;
    private String lPalabraAudiox1;
    private String mPalabraAudiox2;

    public Palabra() {

    }

    public Palabra(String aPalabraImagen, String bPalabraTexto, String cPalabraTipo, String dPalabraTemas, String ePalabraTemasF, String fPalabraDonato, String gPalabraDonatoF, String hPalabrax1, String iPalabrax2, String jPalabraAudioT, String kPlabraAudioD, String lPalabraAudiox1, String mPalabraAudiox2) {
        this.aPalabraImagen = aPalabraImagen;
        this.bPalabraTexto = bPalabraTexto;
        this.cPalabraTipo = cPalabraTipo;
        this.dPalabraTemas = dPalabraTemas;
        this.ePalabraTemasF = ePalabraTemasF;
        this.fPalabraDonato = fPalabraDonato;
        this.gPalabraDonatoF = gPalabraDonatoF;
        this.hPalabrax1 = hPalabrax1;
        this.iPalabrax2 = iPalabrax2;
        this.jPalabraAudioT = jPalabraAudioT;
        this.kPlabraAudioD = kPlabraAudioD;
        this.lPalabraAudiox1 = lPalabraAudiox1;
        this.mPalabraAudiox2 = mPalabraAudiox2;
    }


    public String getaPalabraImagen() {
        return aPalabraImagen;
    }

    public void setaPalabraImagen(String aPalabraImagen) {
        this.aPalabraImagen = aPalabraImagen;
    }

    public String getbPalabraTexto() {
        return bPalabraTexto;
    }

    public void setbPalabraTexto(String bPalabraTexto) {
        this.bPalabraTexto = bPalabraTexto;
    }

    public String getcPalabraTipo() {
        return cPalabraTipo;
    }

    public void setcPalabraTipo(String cPalabraTipo) {
        this.cPalabraTipo = cPalabraTipo;
    }

    public String getdPalabraTemas() {
        return dPalabraTemas;
    }

    public void setdPalabraTemas(String dPalabraTemas) {
        this.dPalabraTemas = dPalabraTemas;
    }

    public String getePalabraTemasF() {
        return ePalabraTemasF;
    }

    public void setePalabraTemasF(String ePalabraTemasF) {
        this.ePalabraTemasF = ePalabraTemasF;
    }

    public String getfPalabraDonato() {
        return fPalabraDonato;
    }

    public void setfPalabraDonato(String fPalabraDonato) {
        this.fPalabraDonato = fPalabraDonato;
    }

    public String getgPalabraDonatoF() {
        return gPalabraDonatoF;
    }

    public void setgPalabraDonatoF(String gPalabraDonatoF) {
        this.gPalabraDonatoF = gPalabraDonatoF;
    }

    public String gethPalabrax1() {
        return hPalabrax1;
    }

    public void sethPalabrax1(String hPalabrax1) {
        this.hPalabrax1 = hPalabrax1;
    }

    public String getiPalabrax2() {
        return iPalabrax2;
    }

    public void setiPalabrax2(String iPalabrax2) {
        this.iPalabrax2 = iPalabrax2;
    }

    public String getjPalabraAudioT() {
        return jPalabraAudioT;
    }

    public void setjPalabraAudioT(String jPalabraAudioT) {
        this.jPalabraAudioT = jPalabraAudioT;
    }

    public String getkPlabraAudioD() {
        return kPlabraAudioD;
    }

    public void setkPlabraAudioD(String kPlabraAudioD) {
        this.kPlabraAudioD = kPlabraAudioD;
    }

    public String getlPalabraAudiox1() {
        return lPalabraAudiox1;
    }

    public void setlPalabraAudiox1(String lPalabraAudiox1) {
        this.lPalabraAudiox1 = lPalabraAudiox1;
    }

    public String getmPalabraAudiox2() {
        return mPalabraAudiox2;
    }

    public void setmPalabraAudiox2(String mPalabraAudiox2) {
        this.mPalabraAudiox2 = mPalabraAudiox2;
    }

    @Override
    public String toString() {
        return bPalabraTexto;
    }
}
