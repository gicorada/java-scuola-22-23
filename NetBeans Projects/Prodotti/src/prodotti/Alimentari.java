package prodotti;

/**
 * Classe che rappresenta Prodotti alimentari
 * @author radaelli11353
 */
public class Alimentari extends Prodotti {
    private DataNumerica scadenza;
    static DataNumerica oggi;
    
    public Alimentari(int codiceBarre, String descrizione, double prezzo, DataNumerica scadenza) {
        super(codiceBarre, descrizione, prezzo);
        this.scadenza = scadenza;
    }
    
    //Necessario per impostare data di oggi a tutti gli Alimentari
    public Alimentari() {
        super(0, "", 0);
    }
    
    /**
     * Metodo che aggiorna la data del giorno attuale
     * @param oggi Nuova data
     */
    public void setDate(DataFormattata oggi) {
        Alimentari.oggi = (DataNumerica) oggi;
    }

    @Override
    public void applicaSconto() {
        int delta = scadenza.getDifference(oggi);
        if(delta > -10 && delta < 0) {
            setPrezzo(getPrezzo() - getPrezzo()* 0.2);
        }
    }
    
    @Override
    public String toString() {
        return "Alimentari[" + getDescrizione() + ", " + getPrezzo() + "€, scade il " + scadenza.stringaFormattata() + ", codice a barre " + getCodiceBarre() + "]";
    }
}
