/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package elenco;

import java.util.Arrays;

/**
 *
 * @author gicorada
 * @param <T> Tipo di dati
 */
public class Elenco <T> {
    private T[] elenco;
    private int dim;
    
    public void add(T elemento) {
        if(dim == elenco.length) {
            elenco = Arrays.copyOf(elenco, dim*2);
        }
        
        elenco[dim++] = elemento;
    }
}
