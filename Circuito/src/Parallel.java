import java.util.ArrayList;

public class Parallel implements Circuit {
    private final ArrayList<Circuit> parallelo;

    public Parallel() {
        parallelo = new ArrayList<>();
    }

    public void addCircuit(Circuit c) {
        parallelo.add(c);
    }

    @Override
    public double getResistance() {
        double resEq = 0;
        for (Circuit c : parallelo) {
            resEq += 1.0 / c.getResistance();
        }
        return 1.0/resEq;
    }

    @Override
    public String toString() {
        return "Parallel{" + parallelo + '}';
    }
}
