import java.util.ArrayList;

public class Crivello {
    private int n;
    private int partenza;
    private ArrayList<Integer> primi;

    public Crivello(int n) {
        this.n = n;
        partenza = 2;
        primi = new ArrayList<>();
        for (int i = partenza; i < n + partenza; i++) {
            primi.add(i);
        }
    }

    public void setaccia() {
        while (partenza <= Math.sqrt(n)) {
            for (int i = partenza; i < primi.size(); i++) {
                if(primi.get(i) % partenza == 0) {
                    System.out.println(primi.get(i));
                    primi.remove(primi.indexOf(primi.get(i)));
                }
            }
            partenza++;
        }
    }

    public int[] getResults() {
        int[] risultati = new int[primi.size()];
        for(int i = 0; i < primi.size(); i++) {
            risultati[i] = primi.get(i);
        }

        return risultati;
    }
}
