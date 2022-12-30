import java.util.Scanner;
import java.util.Random;

public class E67 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random generator = new Random();
        int i, j;
        System.out.print("Inserisci una parola di almeno tre lettere: ");
        String word = in.next();

        for(int k = 0; k < word.length(); k++) {
            String first, middle, last;
            i = generator.nextInt(word.length() - 2);
            
            do {
                j = generator.nextInt(word.length() - 1);
            } while (j<=i);

            first = word.substring(0, i);
            middle = word.substring(i + 1, j);
            last = word.substring(j + 1, word.length());

            word = first + word.charAt(j) + middle + word.charAt(i) + last;
        }
         System.out.println("La parola originale con alcune lettere invertite varie volte è: " + word);
    }
} 
