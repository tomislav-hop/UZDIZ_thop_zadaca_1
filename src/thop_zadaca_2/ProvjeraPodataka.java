/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thop_zadaca_2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Tomislav
 */
public class ProvjeraPodataka {

    public ProvjeraPodataka() {
    }

    public List<Podatak> provjeri_i_spremi_podatke(String sadrzajDatoteke) {
        List<Podatak> ispravniPodaci = new ArrayList<>();

        int brojacIshodisnih = 0;

        String stringPoEnterima[] = sadrzajDatoteke.split("\\r?\\n");
        System.out.println("**************************************************");
        for (int i = 0; i < stringPoEnterima.length; i++) {
            String stringPoTabovima[] = stringPoEnterima[i].split("\\r?\\t");
            String provjera = provjeraKoordinata(stringPoTabovima[3]);

            if (Integer.parseInt(stringPoTabovima[1]) == Integer.parseInt(stringPoTabovima[2])) {
                brojacIshodisnih++;
            }
            if (brojacIshodisnih == 1) {
                if (provjera.equals("OK")) {
                    if (provjeraSifre(ispravniPodaci, Integer.parseInt(stringPoTabovima[1]))) {
                        if (provjeraRoditelja(ispravniPodaci, Integer.parseInt(stringPoTabovima[1]), Integer.parseInt(stringPoTabovima[2]))) {
                            System.out.println("Red broj " + i + " " + provjera);
                            Podatak podatak = new Podatak(Integer.parseInt(stringPoTabovima[0]), Integer.parseInt(stringPoTabovima[1]), Integer.parseInt(stringPoTabovima[2]), stringPoTabovima[3], stringPoTabovima[4], true);
                            ispravniPodaci.add(podatak);
                        } else {
                            System.out.println("Red broj " + i + " Ne postoji roditelj");
                        }
                    } else {
                        System.out.println("Red broj " + i + " Šifra već postoji u podacima");
                    }
                } else {
                    System.out.println("Red broj " + i + " " + provjera);
                }
            }
            else
            {
                System.out.println("Red broj " + i + " Već postoji ishodišni element");
                brojacIshodisnih--;
            }
        }

        return ispravniPodaci;
    }

    private String provjeraKoordinata(String koordinateZaProvjeru) {

        String[] koordinate = koordinateZaProvjeru.split(",");
        String provjera = "";
        if (koordinate.length == 3) {
            provjera = "OK";
        } else if (koordinate.length == 4) {
            provjera = "OK";
        } else if (koordinate.length % 2 == 0) {
            provjera = "OK";
        } else {
            provjera = "Ne odgovara jer je broj koordinata " + koordinate.length;
        }
        return provjera;
    }

    /**
     *
     * @param lista
     * @param sifra
     * @return true ako ne postoji šifra u listi ili false ako postoji šifra u
     * listi
     */
    private boolean provjeraSifre(List<Podatak> lista, int sifra) {
        for (Podatak p : lista) {
            //System.out.println(p);
            if (p.getSifra() == sifra) {
                return false;
            }
        }
        return true;
    }

    /**
     *
     * @param lista
     * @param roditelj
     * @return true ako postoji roditelj u listi ili ako je to početni vraća
     * false ako ne postoji roditelj u listi
     */
    private boolean provjeraRoditelja(List<Podatak> lista, int sifra, int roditelj) {
        if (sifra == roditelj) {
            return true;
        } else {
            for (Podatak p : lista) {
                if (p.getSifra() == roditelj) {
                    return true;
                }
            }
            return false;
        }
    }
}
