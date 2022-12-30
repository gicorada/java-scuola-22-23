import java.util.Scanner;

/**
 * Classe che riconosce se viene inserita una vocale o una consonante
 * @author radaelli11353
 */
public class e520 {
	/**
	 * Metodo main di e520
	 * @param args Argomenti passati all'esecuzione
	 */
	public static void main(String[] args) {
		char lettera = ' ';
		
		System.out.print("Inserisci un carattere: ");
		Scanner in = new Scanner(System.in);
		

		String input = in.next().toLowerCase();

		if(input.length() == 1) {
			lettera = input.charAt(0);
			if(lettera >= 'a' && lettera <= 'z') { // a <= lettera <= z
				if(lettera == 'a' || lettera == 'e' || lettera == 'i' || lettera == 'o' || lettera == 'u') {
					System.out.println("Vowel");
				} else {
					System.out.println("Consonant");
				}
			}
		}

		
	}
}
