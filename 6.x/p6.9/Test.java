import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Inserisci un numero: ");
		int max = in.nextInt();
		PrimeGenerator primi = new PrimeGenerator(max);

		while(primi.hasNext()) {
			int numero = primi.next();
			if(numero != 0) System.out.println(numero);
		}
		
	}
}
