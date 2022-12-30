import java.util.Scanner;

public class e523 {
	public static void main(String[] args) {
		double groceries;
		int perc;
		
		Scanner in = new Scanner(System.in);
		System.out.print("Inserisci l'importo della spesa, con i decimali separati con la virgola: ");
		groceries = in.nextDouble();
		
		if (groceries < 10) {perc = 0;}
		else if (groceries < 60) {perc = 8;}
		else if (groceries < 150) {perc = 10;}
		else if (groceries < 210) {perc = 12;}
		else {perc = 14;}

		groceries -= groceries*perc/100;
		System.out.println(groceries);
	}
}