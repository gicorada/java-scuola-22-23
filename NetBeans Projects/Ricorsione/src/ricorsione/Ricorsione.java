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
    private static int contaDispari(int[] x, int pos) {
        if(pos < 0) return 0;
        return ((x[pos] % 2 == 1) ? 1 : 0) + contaDispari(x, pos - 1); 
    }

    public static int contaDispari(int[] x) {
        return contaDispari(x, x.length - 1);
    }

    /**
     * metodo statico ricorsivo che restituisce la somma degli elementi
     * di un array di interi
     * @param x array di interi
     * @param pos posizione dell'ultimo elemento
     * @return somma degli elementi dell'array
     */
    private static int somma(int[] x, int pos) {
        if(pos < 0) return 0;
        return x[pos] + somma(x, pos - 1);
    }

    public static int somma(int[] x) {
        return somma(x, x.length - 1);
    }

    /**
     * metodo statico ricorsivo che verifica se una stringa x è contenuta
     * nella stringa y
     * @param x stringa che deve essere contenuta
     * @param y stringa che deve contenere
     * @param pos posizione iniziale
     * @return x è contenuta in y
     */
    private static boolean cerca(String x, String y, int pos) {
        if (y.length() - pos < x.length()) return false;

        if (y.substring(pos, pos + x.length()).equals(x)) {
            return true;
        }

        return cerca(x, y, pos + 1);
    }

    public static boolean cerca(String x, String y) {
        return cerca(x, y, 0);
    }

    public static int potenzaS(int a, int b) {
        if(b==0) return 1;
        else if(a%b == 0) {
            int parz = potenzaS(a, b/2);
            return parz * parz;
        }
        return potenzaS(a, b-1);
    }

    public static int potenzaD(int a, int b) {
        if(b == 0) return 1;
        return a * potenzaD(a, b-1);
    }


    public static <T extends Comparable> int binSearch(T[] x, T el) {
        int min = 0;
        int max = x.length -1;
        while(min <= max) {
            int med = (max+min)/2;
            int tmp = el.compareTo(x[med]);
            if(tmp == 0) return med;
            if(tmp < 0) max = med - 1;
            if(tmp > 0) min = med + 1;
        }
        return -1;
    }


    public static void main(String[] args) {
        int[] array = {1, 6, 4, 5};
        System.out.println(contaDispari(array));
        System.out.println(somma(array));
        System.out.println(cerca("Test", "Testare"));

        System.out.println(binSearch());


        int base = 2, esponente = 30;

        ////////
        long startTimeD = System.nanoTime();
        potenzaD(base, esponente);
        long endTimeD = System.nanoTime();

        long timeElapsedD = endTimeD - startTimeD;
        System.out.print("D time: " + timeElapsedD + " ns");

        ////////

        long startTimeS = System.nanoTime();
        potenzaS(base, esponente);
        long endTimeS = System.nanoTime();

        long timeElapsedS = endTimeS - startTimeS;
        System.out.println(" - S time: " + timeElapsedS + " ns");

        System.out.println("Best time: " + ((timeElapsedD > timeElapsedS) ? "Smart" : "Dumb"));


        ////////
    }
}
