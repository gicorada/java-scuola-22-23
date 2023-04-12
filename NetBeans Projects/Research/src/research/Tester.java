/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package research;

/**
 *
 * @author gicorada
 */
public class Tester {
    public static void main(String[] args) {
        int dim = 500000;
        Integer[] lista = new Integer[dim];
        
        for (int i = 0; i < dim; i++) {
            lista[i] = i;
            
        }
        
        for (int i = 0; i < dim; i++) {
            if(Research.sequenziale(i, lista) != Research.binario(i, lista)) {
                System.out.println("ERRORE CON " + i);
            }
            
            if(i % 10000 == 0) System.out.println("Arrivato a " + i);
        }
    }
}
