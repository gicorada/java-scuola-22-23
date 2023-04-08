package prodotti;

/**
 *
 * @author giacomo
 */
public class NonAlimentari extends Prodotti {
    String materiale;

    public NonAlimentari(int codiceBarre, String descrizione, double prezzo, String materiale) {
        super(codiceBarre, descrizione, prezzo);
        this.materiale = materiale;
    }
    
    @Override
    public void applicaSconto() {
        if(materiale.equalsIgnoreCase("carta") || materiale.equalsIgnoreCase("plastica") || materiale.equalsIgnoreCase("vetro")) {
            setPrezzo(getPrezzo() - getPrezzo()* 0.1);
        }
    }
    
}
