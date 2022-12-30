/**
 * Test
 */
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		DataSet dati = new DataSet();
		Scanner in = new Scanner(System.in);

		while(dati.getSum() <= 100) {
			System.out.print("Inserisci un valore: ");
			if(in.hasNextDouble()) {
				dati.add(in.nextDouble());
			}
			System.out.println("Media: " + dati.getAverage() + "; Minore: " + dati.getSmallest() + "; Maggiore: " + dati.getLargest() + "; Range: " + dati.getRange() );
		}
	}
} 
