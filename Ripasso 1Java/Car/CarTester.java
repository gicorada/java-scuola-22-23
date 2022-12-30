/**
 * Classe di test per Car.java
 */
public class CarTester {
	/**
	 * Metodo main della classe di test
	 * @param args Argomenti del metodo main
	 */
	public static void main(String[] args) {
		Car prova = new Car(2);
		prova.addGas(50);
		prova.drive(20);
		System.out.println(prova.getGasInTank());
	}
}
