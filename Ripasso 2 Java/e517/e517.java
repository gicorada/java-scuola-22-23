import java.util.Scanner;

public class e517 {
	public static void main(String[] args) {
		double n1, n2, n3, max;
		Scanner in = new Scanner(System.in);
		System.out.print("Inserisci tre numeri decimali, con i decimali separati da virgola: ");
		n1 = in.nextDouble();
		n2 = in.nextDouble();
		n3 = in.nextDouble();

		max = n1;
		if(!(n1 > n2 && n1 > n3)) {
			if (n2 > n3) {
				max = n2;
			} else {
				max = n3;
			}
		}

		System.out.println(max);
	}
}