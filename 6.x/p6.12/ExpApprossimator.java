/**
 Metodo che calcola e^x
 @author radaelli11353
 */
public class ExpApprossimator implements Sequence<Double> {
	private double term;
	private double x;
	private int n;

	/**
	 Costruttore parametrico completo
	 @param x Valore a cui elevare e
	*/
	public ExpApprossimator(double x) {
		term = 1;
		this.x = x;
		n = 1;
	}
	
	/**
	 Metodo che calcola il valore successivo nella sequenza
	 @return Addendo successivo nella sequenza
	*/
	public Double next() {
		term = term*x/n;
		n++;
		return term;
	}

	/**
	 Metodo che verifica se la precisione 1E-9 (arbitraria) è stata raggiunta
	 @return Vero o falso in base alle approssimazioni eseguite
	*/
	public boolean hasNext() {
		return term > 1E-9;
	}
}