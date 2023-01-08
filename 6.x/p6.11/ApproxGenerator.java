/**
 * Classe ApproxGenerator
 * @author radaelli11353
 */
public class ApproxGenerator implements Sequence<Double> {
	private double a;
	private double n;
	private double epsilon;
	private double x, previousx = 1;

	/**
	 * Costruttore parametrico completo
	 * @param a Primo numero
	 * @param n Secondo numero
	 * @param epsilon Approssimazione accettabile
	 */
	public ApproxGenerator(double a, double n, double epsilon) {
		this.a = a;
		this.n = n;
		this.epsilon = epsilon;
	}
	
	public Double next() {
		x = /* = previousx - (Math.pow(previousx, (n-1)) - a)/*/(n * Math.pow(previousx, (n-1)));
		return x;
	}

	public boolean hasNext() {
		return Math.pow(x, n) > epsilon;
	}
}