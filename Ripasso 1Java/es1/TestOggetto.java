import java.util.Scanner;

public class TestOggetto {
	public static void main(String[] args) {
		ProvaOggetto prova = new ProvaOggetto(); //costruito l'oggetto
		System.out.println(prova.getEsempio());

		ProvaOggetto prova2 = new ProvaOggetto(20); //costruisco l'oggetto con parametri	
		System.out.println(prova2.getEsempio());

		Scanner in = new Scanner(System.in);
		ProvaOggetto prova3 = new ProvaOggetto(in.nextInt());
		System.out.println(prova3.getEsempio());
	}
}
