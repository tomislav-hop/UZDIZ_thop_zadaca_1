/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thop_zadaca_2.iterator;

/**
 *
 * @author Tomislav
 */
public class PocetniPodatak {

    private int tipZapisa;
    private int sifra;
    private int roditelj;
    private String koordinate;
    private String boja;
    private boolean status;
    private boolean prestup;

    public PocetniPodatak() {
    }

    public PocetniPodatak(int tipZapisa, int sifra, int roditelj, String koordinate, String boja, boolean status, boolean prestup) {
        this.tipZapisa = tipZapisa;
        this.sifra = sifra;
        this.roditelj = roditelj;
        this.koordinate = koordinate;
        this.boja = boja;
        this.status = status;
        this.prestup = prestup;
    }

    public int getTipZapisa() {
        return tipZapisa;
    }

    public void setTipZapisa(int tipZapisa) {
        this.tipZapisa = tipZapisa;
    }

    public int getSifra() {
        return sifra;
    }

    public void setSifra(int sifra) {
        this.sifra = sifra;
    }

    public int getRoditelj() {
        return roditelj;
    }

    public void setRoditelj(int roditelj) {
        this.roditelj = roditelj;
    }

    public String getKoordinate() {
        return koordinate;
    }

    public void setKoordinate(String koordinate) {
        this.koordinate = koordinate;
    }

    public String getBoja() {
        return boja;
    }

    public void setBoja(String boja) {
        this.boja = boja;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public boolean isPrestup() {
        return prestup;
    }

    public void setPrestup(boolean prestup) {
        this.prestup = prestup;
    }

}
