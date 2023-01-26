/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testsamevalues;

import java.util.Arrays;

/**
 *
 * @author gicorada
 */
public class Elenco {
    int[] values;

    public Elenco(int maxDim) {
        values = new int[maxDim];
    }
    
    public int size() {
        return values.length;
    }
    
    public void set(int i, int value) {
        values[i] = value;
    }
    
    public int get(int i) {
        return values[i];
    }
    
    public boolean sameValuesGiacomo(Elenco other) {
        if(other.size() != this.size()) return false;
        int dim = this.size();
        int[] tmp = Arrays.copyOf(other.values, dim);
        boolean trovato = false;
        
        for(int x : values) {
            trovato = false;
            for(int i = 0; i < dim; i++) {
                if(x == tmp[i]) {
                    trovato = true;
                    tmp[i] = Integer.MAX_VALUE;
                    break;
                }
            }
            if(!trovato) return false;
        }
        
        return true;
    }
    
    public boolean sameValuesSort(Elenco other) {
        if(other == null) return false;
        if(other.size() != this.size()) return false;
        
        int[] t = this.values.clone();
        int[] o = other.values.clone();
        
        Arrays.sort(t);
        Arrays.sort(o);
        
        for(int i = 0; i < this.size(); i++) {
            if(t[i] != o[i]) return false;
        }
        
        return true;
    }
    
    
    
    
    public boolean sameValuesProf(Elenco other) {
        if(other.size() != this.size()) return false;
        int dim = this.size();
        int[] tmp = Arrays.copyOf(other.values, dim);
        boolean trovato = false;
        
        for(int i = 0; i < dim; i++) {
            for(int j = i; j < dim; j++) {
                if(values[i] == tmp[j]) {
                    int k = tmp[j];
                    tmp[j] = tmp[i];
                    tmp[i] = k;
                    trovato = true;
                    break;
                }
            }
            
            if(!trovato) return false;
        }
        
        return true;
    }
}
