package prodotti;

/**
 * Classe che rappresenta una data numerica
 * @author radaelli11353
 */
public class DataNumerica extends DataFormattata {

    public DataNumerica(int giorno, int mese, int anno) {
        super(giorno, mese, anno);
    }

    @Override
    public String stringaFormattata() {
        int g = getGiorno();
        int m = getMese();
        int a = getAnno();
        
        String res = (g<10) ? "0"+g : ""+g;
        res += "/";
        res += (m<10) ? "0"+m : "" + m;
        
        return res + "/" + a;
    }
    
    /**
     * Restituisce i giorni di differenza tra le due date
     * @param o Altra data
     * @return Differenza tra i giorni, Integer.MIN_VALUE se mese o anno diverso (per il problema del numero variabile di giorni al mese
     */
    public int getDifference(DataNumerica o) {
        //Provvisorio, per il problema del numero di giorni variabile.
        //Non dovrebbe influire con l'esecuzione richesta da Alimentari, altrimenti andrebbe riscritto
        if(getAnno() != o.getAnno() || getMese() != o.getMese()) return Integer.MIN_VALUE;
        
        return compareTo(o);
    }
    
}
