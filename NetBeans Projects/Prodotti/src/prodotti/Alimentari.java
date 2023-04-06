package prodotti;

import java.util.Date;



/**
 *
 * @author giacomo
 */
public class Alimentari extends Prodotti {
    Date scadenza;
    
    public Alimentari(int codiceBarre, String descrizione, double prezzo, Date scadenza) {
        super(codiceBarre, descrizione, prezzo);
        this.scadenza = scadenza;
    }

    @Override
    public void applicaSconto() {
        //condizione da implementare
        if(true) {
            setPrezzo(getPrezzo() - getPrezzo()* 0.2);
        }
    }
    
    
    
    
}
