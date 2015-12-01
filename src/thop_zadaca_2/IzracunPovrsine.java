/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thop_zadaca_2;

/**
 *
 * @author Tomislav
 */
public class IzracunPovrsine {

    public IzracunPovrsine() {
    }
    
    public float izracunajPovrsinu (int[] x, int[] y, int brojTocaka )
    {
        float povrsina = 0;
        int j = brojTocaka -1;
        
        for(int i=0; i<brojTocaka; i++)
        {
            povrsina = povrsina + (x[j]+x[i])*(y[j]-y[i]);
            j = i;
        }
        
        povrsina = Math.abs(povrsina/2);
        return povrsina;
    }
    
}
