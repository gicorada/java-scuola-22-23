package date;

/**
 *
 * @author giacomo
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
        if(anno >= o.getAnno() && mese >= o.getMese() && giorno > o.getGiorno()) {
            return 1;
        } else if(anno == o.getAnno() && mese == o.getMese() && giorno == o.getGiorno()) {
            return 0;
        } else return -1;
    }
    
    
    public abstract String stringaFormattata();
}
