import java.util.Scanner;

/**
 * Classe di test per PrimeGenerator
 * @author radaelli11353
 */
public class Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Inserisci un numero: ");
        int max = in.nextInt();
        PrimeGenerator primi = new PrimeGenerator(max);

        while(primi.hasNext()) {
            System.out.println(primi.next());
        }
        
    }
}
