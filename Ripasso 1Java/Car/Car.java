/**
 * Una classe che simula un'automobile
 * @author radaelli11353
 */
public class Car{
	private double resa;
	private double carburante;

	/**
	 * Costruttore dell'oggetto Car
	 * @param r resa
	 */
	public Car(double r) {
		resa = r;
		carburante = 10;
	}

	/**
	 * Metodo che simula la guida dell'automobile per tot km
	 * @param km chilometri percorsi
	 */
	public void drive(double km) {
		if (km/resa > carburante) throw new IllegalArgumentException(); {
			carburante -= km/resa;
		}
	}

	/**
	 * Getter che simula la misurazione del carburante
	 * @return Quantità di carburante rimanente
	 */
	public double getGasInTank() {
		return carburante;
	}

	/**
	 * Setter che simula l'inserimento nel serbatoio di una certa quantità di carburante
	 * @param c Carburante inserito nel serbatoio
	 */
	public void addGas(double c) {
		if(c<0) throw new IllegalArgumentException(); {
			carburante += c;
		}
	}
}