package deposito;

/**
 * Classe con utilità
 * @author radaelli11353
 */
public class Utils {
    public static C[] filtra(C[] T, String liq) {
        int counter = 0;
        for(C el : T) {
            if(!el.getNome().equals(liq)) counter++;
        }
        C[] filtered = new C[counter];
        counter = 0;
        
        for(C el : T) {
            if(!el.getNome().equals(liq)) filtered[counter++] = el;
        }
        return filtered;
    }
    
}
