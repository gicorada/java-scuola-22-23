import java.util.ArrayList;

public class Serial implements Circuit {
    private final ArrayList<Circuit> serie;

    public Serial() {
        serie = new ArrayList<>();
    }

    public void addCircuit(Circuit c) {
        serie.add(c);
    }

    @Override
    public double getResistance() {
        double resEq = 0;
        for (Circuit c : serie) {
            resEq += c.getResistance();
        }
        return resEq;
    }

    @Override
    public String toString() {
        return "Serial{" + serie + '}';
    }
}
