import java.util.Random;

public class DieSimulator {
	Random generator;
	public DieSimulator() {
		generator = new Random();
	}

	public int tira() {
		return generator.nextInt(6) + 1;
	}
}