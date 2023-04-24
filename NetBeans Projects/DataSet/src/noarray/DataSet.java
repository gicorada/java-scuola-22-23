/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package noarray;

import java.util.Arrays;

/**
 *
 * @author gicorada
 */
public class DataSet <T extends Misurabile> {
    private int dim;
    private T min;
    private T max;
    private double somma = 0;

    public DataSet(T n) {
        max = n;
        min = n;
        somma = n.getMisura();
        dim++;
    }
    
    public void add(T n) {
        if(n.getMisura() < min.getMisura()) min = n;
        if(n.getMisura() > min.getMisura()) max = n;
        somma += n.getMisura();
        dim++;
    }
    
    public double media() {
        return 1.0*somma/dim;
    }
    
    public T min() {
        return min;
    }
    
    public T max() {
        return max;
    }
    
    public double getScarto() {
        return max.getMisura() - min.getMisura();
    }
}
