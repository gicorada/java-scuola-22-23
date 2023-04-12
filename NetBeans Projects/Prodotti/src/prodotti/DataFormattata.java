package prodotti;

/**
 * Classe che rappresenta una data senza fornire metodi per la formattazione
 * @author radaelli11353
 */
public abstract class DataFormattata implements Comparable<DataFormattata> {
    private int giorno;
    private int mese;
    private int anno;

    public DataFormattata(int giorno, int mese, int anno) {
        if(giorno >= 1 && giorno <= 31) this.giorno = giorno;
        else throw new IllegalArgumentException("Il numero del giorno non è valido");
        if(mese >= 1 && mese <= 12) this.mese = mese;
        else throw new IllegalArgumentException("Il numero del mese non è valido");
        this.anno = anno;
    }

    protected int getGiorno() {
        return giorno;
    }

    protected int getMese() {
        return mese;
    }

    protected int getAnno() {
        return anno;
    }
    
    @Override
    public int compareTo(DataFormattata o) {
        if(this.anno != o.anno) return this.anno - o.anno;
        if(this.mese != o.mese) return this.mese - o.mese;
        return this.giorno - o.giorno;
    }
    
    
    public abstract String stringaFormattata();
}
