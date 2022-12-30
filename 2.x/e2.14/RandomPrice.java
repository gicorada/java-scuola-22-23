import java.util.Random;

public class RandomPrice {
	Random generator;
	public RandomPrice() {
		generator = new Random();
	}

	public String generaStr() {
		int dollari = generator.nextInt(10) + 10;
		int cent = generator.nextInt(95);
		return dollari + "." + cent;
	}

	public double genera() {
		return generator.nextDouble()*9.95 + 10;

	}
}