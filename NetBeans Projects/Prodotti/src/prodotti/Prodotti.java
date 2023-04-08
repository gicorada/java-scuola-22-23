package prodotti;

import java.util.Objects;



/**
 * Class Prodotti
 */
public class Prodotti {
    private int codiceBarre;
    private String descrizione;
    private double prezzo;

    public Prodotti(int codiceBarre, String descrizione, double prezzo) {
        this.codiceBarre = codiceBarre;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
    }
    
    /**
     * Get the value of codiceBarre
     * @return the value of codiceBarre
     */
    public int getCodiceBarre () {
        return codiceBarre;
    }

    /**
     * Get the value of descrizione
     * @return the value of descrizione
     */
    public String getDescrizione () {
        return descrizione;
    }

    /**
     * Get the value of prezzo
     * @return the value of prezzo
     */
    public double getPrezzo () {
        return prezzo;
    }
    
    protected void setPrezzo(double nuovoPrezzo) {
        prezzo = nuovoPrezzo;
    }

    /**
     * Diminuisce il prezzo del prodotto del 5%
     */
    public void applicaSconto() {
        prezzo = prezzo - prezzo * 0.05;
    }


    /**
     * 
     * @return       String
     */
    @Override
    public String toString() {
        return "Prodotto[descrizione: " + descrizione + ", prezzo:" + prezzo + ", codice a barre:" + codiceBarre;
    }


    /**
     * @param o
     * @return       boolean
     */
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
