package date;

/**
 *
 * @author giacomo
 */
public class DataNumerica extends DataFormattata {

    public DataNumerica(int giorno, int mese, int anno) {
        super(giorno, mese, anno);
    }

    @Override
    public String stringaFormattata() {
        String giornoFormattato = "";
        String meseFormattato = "";
        //String annoFormattato = "";
        
        if(getGiorno() < 9) giornoFormattato = "0" + getGiorno();
        else giornoFormattato += getGiorno();
        
        if(getMese() < 9) meseFormattato = "0" + getMese();
        else meseFormattato += getMese();
        
        return giornoFormattato + "/" + meseFormattato + "/" + getAnno();
    }
    
}
