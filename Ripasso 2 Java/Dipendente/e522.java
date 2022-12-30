import java.util.Scanner;

public class e522 {
	public static void main(String[] args) {
		Dipendente test = new Dipendente("Test", 10.00);
		Scanner in = new Scanner(System.in);
		
		System.out.print("Inserisci il numero di ore lavorate la settimana scorsa: ");
		double ore = in.nextDouble();
		
		System.out.println(test.calcolaSalario(ore));
	}
}
