import java.util.Scanner;

/**
 * Classe ApproxRunner
 */
public class ApproxRunner {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("Inserisci il primo numero 'a': ");
		double a = in.nextDouble();

		System.out.print("Inserisci il secondo numero 'n': ");
		double n = in.nextDouble();

		System.out.print("Inserisci Epsilon (precisione)");
		double epsilon = in.nextDouble();

		ApproxGenerator gen = new ApproxGenerator(a, n, epsilon);

		do {
			System.out.println(gen.next());
		} while(gen.hasNext());

		System.out.println("^^ Approssimazione migliore");
	}
}