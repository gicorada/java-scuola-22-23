/**
 * Classe che genera una sequenza composta da soli numeri primi
 * Esercizio 6.9 Eserciziario Vecchio
 * @author radaelli11353
 */
public class PrimeGenerator implements Sequence<Integer> {
    private int max;
    private int i = 1;
    /**
     * Costruttore parametrico completo
     * @param max Numero massimo che deve essere stampato
     */
	public PrimeGenerator(int max) {
        this.max = max;
	}
	
    /**
     * Metodo che restituisce il numero successivo nella sequenza dei numeri primi
     * @return Numero successivo nella sequenza
     */
	public Integer next() {
		int counter = 0;
        int j = 1;

        while(j <= i && counter <= 2)
        {
            counter = 0;
            if(i % j == 0)
            {
                counter++;
            }
            j++;
        }
        
        return Integer.MIN_VALUE;
	}

    public boolean hasNext() {
        return true;
    }
}