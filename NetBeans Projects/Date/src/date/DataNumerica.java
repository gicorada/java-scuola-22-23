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
        /*String giornoFormattato = "";
        String meseFormattato = "";
        
        if(getGiorno() < 10) giornoFormattato = "0";
        giornoFormattato += getGiorno();
        
        if(getMese() < 10) meseFormattato = "0";
        meseFormattato += getMese();
        
        return giornoFormattato + "/" + meseFormattato + "/" + getAnno();
        */
        
        int g = getGiorno();
        int m = getMese();
        int a = getAnno();
        
        String res = (g<10) ? "0"+g : ""+g;
        res += "/";
        res += (m<10) ? "0"+m : "" + m;
        
        return res + a;
    }
    
}
