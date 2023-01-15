public class ExpGenerator implements Sequence<Double>{
	private double x, nuovo, old, potenza, fattoriale;
	private int n;
	public static final double EPSILON = 1E-6;

	public ExpGenerator(double x) {
		this.x = x;
		nuovo = 1;
		old = 0;
		potenza = 1;
		fattoriale = 1;
		n = 0;
	}

	public boolean hasNext() {
		return Math.abs(nuovo-old) >= EPSILON;
	}

	public Double next() {
		if(!hasNext()) throw new IllegalArgumentException();
		old = nuovo;
		n++;
		potenza *= x;
		fattoriale *= n;
		nuovo = old + potenza/fattoriale;
		return old; 
	}
	
}