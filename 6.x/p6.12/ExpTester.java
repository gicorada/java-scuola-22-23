import java.util.Scanner;

/**
 Classe che esegue il test dell'uso della funzione ExpApprossimator
 @author radaelli11353
*/
public class ExpTester {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("Inserisci il valore di x");
		double x = in.nextDouble();

		ExpApprossimator gen = new ExpApprossimator(x);

		double sum = 1;
		while(gen.hasNext()) {
			sum += gen.next();
		}

		System.out.println(sum);
	}	
}