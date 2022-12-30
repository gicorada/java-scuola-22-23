import java.util.Scanner;

public class Rombo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Inserisci la lunghezza del lato: ");

        while(in.hasNextInt()) {
            int n = in.nextInt();

            for(int i = 1; i<n*2; i++) {
                for(int j = 1; j<n*2; j++) {
                    if(i+j<=n || j-i >= n || j+i >= n*3 || (i>n && i-j >= n)) {
                        System.out.print(' ');
                    } else {
                        System.out.print('*');
                    }
                }
               System.out.println(); 
            }
        }
    }
}
