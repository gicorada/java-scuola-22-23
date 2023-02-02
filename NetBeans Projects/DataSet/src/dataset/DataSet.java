/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dataset;

import java.util.Arrays;

/**
 *
 * @author gicorada
 */
public class DataSet {
    private int[] dati;
    private int dim;
    private int min;
    private int max;
    private int raddoppi;

    public DataSet(int n) {
        dati = new int[100];
        dati[0] = n;
        dim = 1;
        max = n;
        min = n;
        raddoppi = 0;
    }
    
    public void add(int n) {
        if(dim == dati.length) {
            dati = Arrays.copyOf(dati, dim*2);
            raddoppi++;
        }
        
        dati[dim++] = n;
        if(n<min) min = n;
        if(n>max) max = n;
    }
    
    public double media() {
        int somma = 0;
        for (int i = 0; i < dim; i++) {
            somma += dati[i];
        }
        return 1.0*somma/dim;
    }
    
    public double scarto(double m) {
        double somma = 0;
        double d;
        
        for (int i = 0; i < dim; i++) {
            d = dati[i] - m;
            somma += d*d;
        }
        return Math.sqrt(somma/dim);
    }
    
    public int min() {
        int minProv = dati[0];
        
        for (int i = 1; i < dim; i++) {
            if(dati[i] < minProv) minProv = dati[i];
        }
        
        return minProv;
    }
    
    public int max() {
        int maxProv = dati[0];
        
        for (int i = 1; i < dim; i++) {
            if(dati[i] > maxProv) maxProv = dati[i];
        }
        
        return maxProv;
    }
    
    public int getRaddoppi() {
        return raddoppi;
    }
}
