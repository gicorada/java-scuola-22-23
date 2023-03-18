import java.util.ArrayList;

public class Videoteca {
    private ArrayList<Videogioco> giochi = new ArrayList<>();

    public Videoteca() {}

    public void addVideogioco(Videogioco videogioco) {
        giochi.add(videogioco);
    }

    public int trova(String c, int k) {
        int validi = 0;
        for(Videogioco gioco : giochi) {
            if(gioco.getCasaProduttrice().equals(c) && gioco.getPrezzo() > k) {
                validi++;
            }
        }

        return validi;
    }

    public ArrayList<Videogioco> trova(String c) {
        ArrayList<Videogioco> validi = new ArrayList<>();

        for(Videogioco gioco : giochi) {
            if(gioco.getCasaProduttrice().equals(c)) {
                validi.add(gioco);
            }
        }

        return validi;
    }
}