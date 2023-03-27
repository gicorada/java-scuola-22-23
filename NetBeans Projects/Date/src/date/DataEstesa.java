package date;

/**
 *
 * @author giacomo
 */
public class DataEstesa extends DataFormattata {

    public DataEstesa(int giorno, int mese, int anno) {
        super(giorno, mese, anno);
    }

    @Override
    public String stringaFormattata() {
        String data = "";
        
        if(getGiorno() < 9) data += "0" + getGiorno();
        else data += getGiorno();
        
        data += " ";
        
        switch (getMese()) {
            case 1 -> data += "gennaio";
            case 2 -> data += "febbraio";
            case 3 -> data += "marzo";
            case 4 -> data += "aprile";
            case 5 -> data += "maggio";
            case 6 -> data += "giugno";
            case 7 -> data += "luglio";
            case 8 -> data += "agosto";
            case 9 -> data += "settembre";
            case 10 -> data += "ottobre";
            case 11 -> data += "novembre";
            case 12 -> data += "dicembre";
        }
        
        data += " " + getAnno();
        
        return data;
    }
    
}
