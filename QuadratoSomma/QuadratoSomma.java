import java.util.Scanner;

public class QuadratoSomma {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Inserisci un numero intero: ");
        if(in.hasNextInt()) {
            int numero = in.nextInt();
            int dispari = 1;
            int quadrato = 0;
            int quadratoFor = 0;
            
            for(int i = 1; i <= numero*2; i+=2) {
                quadratoFor += i;
            }
            System.out.println("For: " + quadratoFor);
            
            
            while(dispari <= numero*2) {
                quadrato += dispari;
                dispari += 2;
            }
            System.out.println("While: " + quadrato);
        } else {
            System.out.println("Il valore inserito non è valido");
        }
    }
}
