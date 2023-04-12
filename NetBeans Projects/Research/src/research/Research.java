/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package research;

/**
 *
 * @author gicorada
 */
public class Research {
    
    public static <T extends Comparable> int sequenziale(T oggetto, T[] array) {
        for(int i = 0; i < array.length; i++) {
            if(oggetto.compareTo(array[i]) == 0) return i;
        }
        return -1;
    }
    
    public static <T extends Comparable> int binario(T oggetto, T[] array) {
        int primo = 0; //Primo elemento della parte selezionata
        int ultimo = array.length - 1; //Ultimo elemento della parte selezionata
        int medio; //Elemento centrale, idealmente l'elemento cercato
        while(primo <= ultimo) {
            medio = (primo + ultimo) / 2;
            T ogMedio = array[medio];
            
            if(oggetto.compareTo(ogMedio) < 0) ultimo = medio -1;
            else {
                if(oggetto.compareTo(ogMedio) > 0) {
                    primo = medio + 1;
                }
                else return medio;
            }
        }
        
        return -1;
    }
    
}
