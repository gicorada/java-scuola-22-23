import java.util.ArrayList;
import java.util.Collections;

public class Filiale {
    private ArrayList<ContoCorrente> conti;

    public Filiale() {
        conti = new ArrayList<>();
    }

    public void add(ContoCorrente c) {
        conti.add(c);
    }

    public void remove(int num) {
        for(ContoCorrente c : conti) {
            if(c.getNumero() == num) {
                conti.remove(c);
                break;
            }
        }
    }

    @Override
    public String toString() {
        String text = "";

        Collections.sort(conti);

        for(ContoCorrente c : conti) {
            text += c + "\n";
        }

        return text;
    }
}
