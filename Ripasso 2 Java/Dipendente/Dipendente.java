/**
 * Classe che simula un dipendente
 * @author radaelli11353
 */
public class Dipendente {
	private String nome;
	private double paga;

	/**
	 * Costruttore parametrico completo
	 * @param nome Nome dipendente
	 * @param paga Paga dipendente
	 */
	public Dipendente(String nome, double paga) {
		this.nome = nome;
		this.paga = paga;
	}

	/**
	 * Costruttore che inizializza gli attributi a valori di base
	 */
	public Dipendente() {
		this("Undefined", 0.0);
	}

	@Override
	public String toString() {
		return "Nome: " + nome + ", paga oraria: " + paga;
	}

	/**
	 * Metodo che calcola il salario della settimana precedente.
	 * Sopra le 40 ore, le ore sono considerate di straordinario
     * @param ore Ore lavorate
     */
	public double calcolaSalario(double ore) {
        if(ore <= 40) {
            return ore * paga;
        } else {
            double salario = 40 * paga;
            ore -= 40;
            return salario + (ore * paga * 1.5);
        }
    }
}
