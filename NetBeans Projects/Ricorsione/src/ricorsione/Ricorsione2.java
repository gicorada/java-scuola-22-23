package ricorsione;

import java.util.ArrayList;

/**
 * Collezione 2 di metodi ricorsivi utilizzata per gli esercizi per il 6/6/23
 * @author radaelli11353
 */
public class Ricorsione2 {
    public static ArrayList<Integer> scomposizioneFattoriPrimi(int n) {
        ArrayList<Integer> fattori = new ArrayList<>();
        scomposizioneFattoriPrimi(n, fattori);
        return fattori;
    }

    public static void scomposizioneFattoriPrimi(int n, ArrayList<Integer> x) {
        if(n == 1) return;
        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                x.add(i);
                n = n / i;
                break;
            }
        }
        
        if (n > 1) {
            scomposizioneFattoriPrimi(n, x);
        }
    }
    
    public static String reverse(String text) {
        if (text.length() <= 1) {
            return text;
        }
        //return reverse(text.substring(1)) + text.charAt(0);
        //return reverse(text, text.length() - 1);
        char[] b = text.toCharArray();
        reverse(b, 0);
        return String.valueOf(b);
    }

    public static String reverse(String text, int index) {
        if(index == 0) return String.valueOf(text.charAt(index));
        return text.charAt(index) + reverse(text, index-1);
    }

    public static void reverse(char[] x, int pos) {
        int l = x.length;
        if(pos < l/2) {
            char tmp = x[pos];
            x[pos] = x[l - 1 - pos];
            x[l - 1 - pos] = tmp;
            reverse(x, pos + 1);
        }
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
