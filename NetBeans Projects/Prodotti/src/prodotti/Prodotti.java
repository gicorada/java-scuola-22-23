package prodotti;

import java.util.Objects;

/**
 * Classe che rappresenta Prodotti generici
 * @author radaelli11353
 */
public class Prodotti {
    private final int codiceBarre;
    private final String descrizione;
    private double prezzo;

    public Prodotti(int codiceBarre, String descrizione, double prezzo) {
        this.codiceBarre = codiceBarre;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
    }
    
    /**
     * Ritorna il valore di codiceBarre
     * @return valore di codiceBarre
     */
    public int getCodiceBarre () {
        return codiceBarre;
    }

    /**
     * Ritorna la descrizione
     * @return descrizione
     */
    public String getDescrizione () {
        return descrizione;
    }

    /**
     * Ritorna il prezzo
     * @return prezzo
     */
    public double getPrezzo () {
        return prezzo;
    }
    
    /**
     * Modifica il prezzo
     * @param nuovoPrezzo Prezzo nuovo
     */
    protected void setPrezzo(double nuovoPrezzo) {
        prezzo = nuovoPrezzo;
    }

    /**
     * Diminuisce il prezzo del prodotto del 5%
     */
    public void applicaSconto() {
        prezzo = prezzo - prezzo * 0.05;
    }

    @Override
    public String toString() {
        return "Prodotto[" + descrizione + ", prezzo:" + prezzo + ", codice a barre:" + codiceBarre + "]";
    }

    @Override
    public boolean equals(Object o) {
        if(o == null) return false;
        if(!(o instanceof Prodotti)) return false;
        Prodotti p = (Prodotti) o;
        return descrizione.equals(p.descrizione) && prezzo == p.prezzo && codiceBarre == p.codiceBarre;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + this.codiceBarre;
        hash = 29 * hash + Objects.hashCode(this.descrizione);
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.prezzo) ^ (Double.doubleToLongBits(this.prezzo) >>> 32));
        return hash;
    }
}
