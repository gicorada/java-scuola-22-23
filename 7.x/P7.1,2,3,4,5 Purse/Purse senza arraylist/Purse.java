import java.util.Arrays;

/**
 * Classe che simula un borsellino
 * @author radaelli11353
 */
public class Purse {
    private String[] coins;
    private int actualSize;
    
    /**
     * Costruttore
     * @param dim Quantità massima di monete inseribili nel borsellino
     */
    public Purse(int dim) {
        coins = new String[dim];
        actualSize = 0;
    }
    
    /**
     * Metodo che aggiunge una moneta al borsellino
     * @param coinName Nome della moneta
     */
    public void addCoin(String coinName) {
        coins[actualSize] = coinName;
        actualSize++;
    }
    
    /**
     * Metodo che inverte gli elementi presenti nel borsellino
     */
    public void reverse() {
        String[] oldCoins = new String[actualSize];
        oldCoins = Arrays.copyOf(coins, actualSize);
        for(int i = 0; i < actualSize; i++) {
            coins[i] = oldCoins[actualSize - i - 1];
        }
    }
    
    /**
     * Metodo che restituisce il numero di valori presenti nel borsellino
     * @return Numero di valori presenti nel borsellino
     */
    public int getSize() {
        return actualSize;
    }
    
    /**
     * Metodo che restituisce il valore di una moneta alla posizione 'i'
     * @param i Posizione del valore richiesto
     * @return Valore (String) alla posizione 'i'
     */
    public String getCoinValue(int i) {
        if(i >= actualSize || i < 0) throw new IllegalArgumentException("La moneta all'index" + i + "non è presente nel borsellino");
        return coins[i];
    }
    
    /**
     * Metodo che imposta la moneta ad una posizione 'i' ad un valore 'value'
     * @param i Posizione in cui inserire il valore
     * @param value Valore (String) da inserire nel borsellino
     */
    public void setCoinValue(int i, String value) {
        if(i >= actualSize || i < 0) throw new IllegalArgumentException("La moneta all'index" + i + "non è presente nel borsellino");
        coins[i] = value;
    }
    
    /**
     * Metodo che svuota il borsellino
     */
    public void clear() {
        for(int i = 0; i < actualSize; i++) {
            coins[i] = "";
        }
    }
    
    /**
     * Metodo che sposta le monete contenute in un altro borsellino
     * nel borsellino attuale
     * @param other Altro borsellino che viene svuotato
     */
    public void transfer(Purse other) {
        for(int i = 0; i < other.actualSize; i++) {
            coins[actualSize + i] = other.coins[i];
        }
        actualSize += other.actualSize;
        other.clear();
    }
    
    /**
     * Metodo che confronta (per contenuto e posizione del contenuto) due borsellini
     * @param other Altro borsellino con cui viene confrontato l'attuale
     * @return True se i due borsellini contengono le stesse monete nella stessa posizione, false se non soddisfano queste condizioni
     */
    public boolean sameContents(Purse other) {
        if(this.actualSize == other.actualSize) {
            for(int i = 0; i < actualSize; i++) {
                if(coins[i] != other.coins[i]) return false;
            }
            return true;
        }
        return false;
    }

    /**
     * Metodo che confronta (per contenuto) due borsellini
     * @param other Altro borsellino con cui viene confrontato l'attuale
     * @return True se i due borsellini contengono le stesse monete, false se non soddisfa questa condizione
     */
    public boolean sameCoins(Purse other) {
        if(this.actualSize == other.actualSize) {
            String[] copy = new String[actualSize];
            for(int i = 0; i < actualSize; i++) {
                copy[i] = other.coins[i];
            }

            for(String coin : this.coins) {
                for(int i = 0; i < actualSize; i++) {
                    if(coin == other.coins[i]) {
                        copy[i] = "";
                        break;
                    }
                }
            }
            for(String coin : copy) {
                if(coin != "") return false; 
            }
            return true;
        }
        return false;
    }
    
    /**
     * Metodo toString che restituisce i valori delle monente nel borsellino
     * @return Testo che indica le monete contenute nel borsellino
     */
    @Override
    public String toString() {
        String text = "Purse[";
        
        for(int i = 0; i < actualSize; i++) {
            if(i != 0) text += ",";  
            text += coins[i];
        }

        text += "]";

        return text;
    }
}
