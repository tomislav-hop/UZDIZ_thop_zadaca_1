/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thop_zadaca_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import thop_zadaca_2.iterator.Iterator;
import thop_zadaca_2.iterator.PocetniPodaci;
import thop_zadaca_2.iterator.PocetniPodatak;

/**
 *
 * @author Tomislav
 */
public class Thop_zadaca_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String datotekaPodataka = args[0];
        CitanjeDatoteka cd = new CitanjeDatoteka();
        String sadrzajDatoteke = cd.citanjeDatoteke(datotekaPodataka);
        ProvjeraPodataka pp = new ProvjeraPodataka();
        List<Podatak> ispravniPodaci = pp.provjeri_i_spremi_podatke(sadrzajDatoteke);
        System.out.println("**************************************************");
        System.out.println("ISPIS ZAPISA KOJI SU U MEMORIJI");
        
        //int velicinaPolja = ispravniPodaci.size();
        //System.out.println("Velicina: " + velicinaPolja);
        
        ///PocetniPodatak pomocnoPolje[] = new PocetniPodatak[velicinaPolja];
        
        
        PocetniPodaci pocPod = new PocetniPodaci();
        
        int i = 0;
        for (Podatak p : ispravniPodaci) {
            PocetniPodatak pomocniPodatak = new PocetniPodatak();
            pomocniPodatak.setTipZapisa(p.getTipZapisa());
            pomocniPodatak.setSifra(p.getSifra());
            pomocniPodatak.setRoditelj(p.getRoditelj());
            pomocniPodatak.setKoordinate(p.getKoordinate());
            pomocniPodatak.setBoja(p.getBoja());         
            pomocniPodatak.setStatus(p.isStatus());
            pomocniPodatak.setPrestup(p.isPrestup());
            
            pocPod.addPodatak(pomocniPodatak);
            
            /*PocetniPodatak pomocniPodatak = new PocetniPodatak();
            pomocniPodatak.setTipZapisa(p.getTipZapisa());
            pomocniPodatak.setSifra(p.getSifra());
            pomocniPodatak.setRoditelj(p.getRoditelj());
            pomocniPodatak.setKoordinate(p.getKoordinate());
            pomocniPodatak.setBoja(p.getBoja());         
            pomocniPodatak.setStatus(p.isStatus());
            pomocniPodatak.setPrestup(p.isPrestup());
            
            pomocnoPolje[i]=pomocniPodatak;*/
                    
            /*pomocnoPolje[i].setTipZapisa(p.getTipZapisa());
            pomocnoPolje[i].setSifra(p.getSifra());
            pomocnoPolje[i].setRoditelj(p.getRoditelj());
            pomocnoPolje[i].setKoordinate(p.getKoordinate());
            pomocnoPolje[i].setBoja(p.getBoja());         
            pomocnoPolje[i].setStatus(p.isStatus());
            pomocnoPolje[i].setPrestup(p.isPrestup());*/
            i++;     
            System.out.println(p);
        }

        //PocetniPodaci podaciIterator = new PocetniPodaci();;
        /*for(Iterator iter = pocPod.getIterator(); iter.hasNext();)
        {
            String test = (String)iter.next();
            System.out.println("STA JE OVO: " + test);
        }*/
        
        pocPod.ispisPodataka();
        
        while (true) {
            try {
                System.out.println("**************************************************");
                System.out.println("Odaberite sljedeći korak: ");
                System.out.println(""
                        + "1 - pregled stanja, "
                        + "2 - pregled jednostavnih elemenata u presjeku, "
                        + "3 - promjena statusa elementa, "
                        + "4 - ukupne površine boja, "
                        + "5 - učitavanje dodatne datoteke, "
                        + "6 - vlastita funkcionalnost, "
                        + "0 - izlaz iz programa");
                System.out.print("Unos: (1/2/3/4/5/6/0): ");
                //Runtime.getRuntime().exec("cls");
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                int odabir = Integer.parseInt(br.readLine());
                if (odabir == 1) {
                    System.out.println("Odabran broj 1");
                } else if (odabir == 2) {
                    System.out.println("Odabran broj 2");
                } else if (odabir == 3) {
                    System.out.println("Odabran broj 3");
                } else if (odabir == 4) {
                    System.out.println("Odabran broj 4");
                } else if (odabir == 5) {
                    System.out.println("Odabran broj 5");
                    String novaDatoteka = br.readLine();
                    String sadrzajNoveDatoteke = cd.citanjeDatoteke(novaDatoteka);
                    System.out.println(sadrzajNoveDatoteke);
                } else if (odabir == 6) {
                    System.out.println("Odabran broj 6");
                } else if (odabir == 0) {
                    System.out.println("Odabran broj 0, IZLAZ!");
                    break;
                } else {
                    System.out.println("Ne postoji taj korak!");
                }
            } catch (IOException ex) {
                Logger.getLogger(Thop_zadaca_2.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        /*Podatak glavniPodatak = new Podatak(1, 1, "GLAVNI PODATAK", 1);

         Podatak drugi = new Podatak(1, 1, "ispod glavni PODATAK", 1);
         Podatak drugi2 = new Podatak(1, 1, "ispid glavni PODATAK2", 1);

         Podatak treci = new Podatak(1, 1, "ispod drugi PODATAK", 1);
         Podatak treci2 = new Podatak(1, 1, "ispod drugi PODATAK2", 1);

         glavniPodatak.add(drugi);
         glavniPodatak.add(drugi2);

         drugi.add(treci);
         drugi.add(treci2);
         System.out.println("ISPIS GLAVNOG PODATKA");
         System.out.println(glavniPodatak);

        
         System.out.println("ISPIS SVIH PODATAKA");
         for (Podatak p : glavniPodatak.getPodpodaci()) {
         System.out.println(p);
         for (Podatak p2 : p.getPodpodaci()) {
         System.out.println(p2);
         }
         }*/
    }
}
