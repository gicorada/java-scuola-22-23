/**
 * Classe che genera una sequenza composta da soli numeri primi
 * Esercizio 6.9 Eserciziario Vecchio
 * @author radaelli11353
 */
public class PrimeGenerator implements Sequence<Integer> {
    private int max;
    private int attuale;

    /**
     * Costruttore parametrico completo
     * @param max Numero massimo che deve essere stampato
     */
    public PrimeGenerator(int max) {
        this.max = max;
        attuale = 2;
    }
    
    /**
     * Metodo che restituisce il numero successivo nella sequenza dei numeri primi
     * @return Numero successivo nella sequenza
     */
    public Integer next() {
        while (true) {
            boolean primo = true;

            for (int i = 2; i < attuale; i++) {
                if (attuale % i == 0) {
                    primo = false;
                }
            }

            if (primo) {
                int prossimo = attuale;
                attuale++;
                return prossimo;
            }
            attuale++;
        }
    }

    public boolean hasNext() {
        return attuale < max;
    }
}