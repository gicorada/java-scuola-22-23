package deposito;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Classe di test
 * @author radaelli11353
 */
public class Tester {
    public static void main(String[] args) {
        Scanner file = new Scanner(System.in);
        
        C[] T = new C[20];
        int counter = 0;
        
        while(file.hasNextLine()) {
            String[] elements = file.nextLine().split(":");
            
            if(counter == T.length) T = Arrays.copyOf(T, T.length * 2);
            char type = elements[0].toLowerCase().charAt(0);
            String nome = elements[1];
            double quantita = Double.parseDouble(elements[2]);
            
            if(type == 'l') T[counter++] = new L(quantita, nome, Integer.toString(counter));
            else if(type == 'b') T[counter++] = new B(quantita, nome, Integer.toString(counter));
        }
        
        T = Arrays.copyOf(T, counter);
                
        System.out.println(Arrays.toString(Utils.filtra(T, "acqua")));
    }
    
}
