import java.util.Scanner;

/**
 * Classe che controlla se il numero della carta di credito è plausibile
 * @author radaelli11353
 */
public class CardConvalidator {
    public static void main(String[] args) {
        int sommaPari = 0, sommaDispari = 0, somma;

        Scanner in = new Scanner(System.in);
        int cardNumber = in.nextInt();

        for(int i = 7; i >= 0; i--) {
            int valore = Integer.parseInt(String.valueOf(Integer.toString(cardNumber).charAt(i)));
            if(i%2 == 1) {
                sommaDispari += valore;
            } else {
                int value = Integer.parseInt(String.valueOf(Integer.toString(cardNumber).charAt(i))) * 2;
                for(int j = 0; j < Integer.toString(value).length(); j++) {
                    sommaPari += value;
                }
            }
        }

        System.out.println("D: " + sommaDispari);
        System.out.println("P: " + sommaPari);
        
        somma = sommaPari + sommaDispari;

        if(somma % 10 == 0) {
            System.out.println("Il numero inserito è valido");
        } else {
            System.out.println("Il numero inserito non è valido. La cifra di controllo dovrebbe essere " + (Integer.parseInt(String.valueOf(Integer.toString(cardNumber).charAt(7))) - somma % 10));
        }
    }
} 
