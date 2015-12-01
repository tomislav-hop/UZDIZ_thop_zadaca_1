/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thop_zadaca_2.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Tomislav
 */
public class PocetniPodaci implements Container {

    public List<PocetniPodatak> pocetni_podaci = new ArrayList<>();
    
    public void addPodatak(PocetniPodatak podatak)
    {
        this.pocetni_podaci.add(podatak);
    }
    
    public void ispisPodataka()
    {
        //Iterator iter = new PodatakIterator();
        //PocetniPodatak poc = (PocetniPodatak)iter.next();
        
        for(Iterator iter = new PodatakIterator(); iter.hasNext();)
        {
            PocetniPodatak poc = (PocetniPodatak)iter.next();
            System.out.println("TEST: " + poc.getTipZapisa() + "  " + poc.getSifra());
        }
        
        //for(i)
        
        /*for(Iterator iter = new PodatakIterator().getIterator(); iter.hasNext();)
        {
            String test = (String)iter.next();
            System.out.println("STA JE OVO: " + test);
        }*/
    }

    @Override
    public Iterator getIterator() {

        return new PodatakIterator();
    }

    private class PodatakIterator implements Iterator {

        int index;
        
        @Override
        public boolean hasNext() {
            if (index < pocetni_podaci.size()) {
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            if (this.hasNext()) {
                return pocetni_podaci.get(index++);
            }
            return null;
        }
    }
}
