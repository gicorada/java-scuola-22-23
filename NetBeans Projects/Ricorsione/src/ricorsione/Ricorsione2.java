package ricorsione;

import java.util.ArrayList;

/**
 * Collezione 2 di metodi ricorsivi utilizzata per gli esercizi per il 6/6/23
 * @author radaelli11353
 */
public class Ricorsione2 {
    public static ArrayList<Integer> scomposizioneFattoriPrimi(int n) {
        ArrayList<Integer> fattori = new ArrayList<>();
        
        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                fattori.add(i);
                n = n / i;
                break;
            }
        }
        
        if (n > 1) {
            fattori.addAll(scomposizioneFattoriPrimi(n));
        }
        
        return fattori;
    }
    
    public static String reverse(String text) {
        if (text.length() <= 1) {
            return text;
        }
        return reverse(text.substring(1)) + text.charAt(0);
    }
    
    
    public static void main(String[] args) {
        int numero = 4;
        ArrayList<Integer> fattoriPrimi = scomposizioneFattoriPrimi(numero);
        
        System.out.println("Fattori primi di " + numero + ":");
        for (int fattore : fattoriPrimi) {
            System.out.println(fattore);
        }
        
        System.out.println("----------------------");
        
        String input = "Hello!";
        String reversed = reverse(input);
        
        System.out.println("Originale: " + input);
        System.out.println("Invertita: " + reversed);
    }
}
