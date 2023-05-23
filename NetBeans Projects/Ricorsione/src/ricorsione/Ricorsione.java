package ricorsione;

/**
 * Collezione di metodi ricorsivi
 * @author radaelli11353
 */
public class Ricorsione {
    /**
     * metodo statico ricorsivo che conta quanti numeri dispari sono presenti
     * in un array di interi
     * @param x array di interi
     * @param pos posizione dell'ultimo elemento
     * @return quanti numeri dispari sono presenti nell'array
     */
    public static int contaDispari(int[] x, int pos) {
        if(pos < 0) return 0;
        int contatore = (x[pos] % 2 == 1) ? 1 : 0;

        return contatore + contaDispari(x, pos - 1);
    }
    
    /**
     * metodo statico ricorsivo che restituisce la somma degli elementi
     * di un array di interi
     * @param x array di interi
     * @param pos posizione dell'ultimo elemento
     * @return somma degli elementi dell'array
     */
    public static int somma(int[] x, int pos) {
        if(pos < 0) return 0;
        int contatore = x[pos];

        return contatore + somma(x, pos - 1);
    }
    
    /**
     * metodo statico ricorsivo che verifica se una stringa x è contenuta
     * nella stringa y
     * @param x stringa che deve essere contenuta
     * @param y stringa che deve contenere
     * @param pos posizione iniziale
     * @return x è contenuta in y
     */
    public static boolean cerca(String x, String y, int pos) {
        if (y.length() - pos < x.length()) return false;

        if (y.substring(pos, pos + x.length()).equals(x)) {
            return true;
        }

        return cerca(x, y, pos + 1);
    }
    
    
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6};
        System.out.println(contaDispari(array, array.length - 1));
        System.out.println(somma(array, array.length - 1));
        System.out.println(cerca("Test", "Testare", 0));
    }
}
