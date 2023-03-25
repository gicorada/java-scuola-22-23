public class Videogioco {
    private final String titolo;
    private final String casaProduttrice;
    private final String piattaforma;
    private final double prezzo;

    public Videogioco(String titolo, String casaProduttrice, String piattaforma, double prezzo) {
        this.titolo = titolo;
        this.casaProduttrice = casaProduttrice;
        this.piattaforma = piattaforma;
        this.prezzo = prezzo;
    }

    public String getTitolo() {
        return titolo;
    }

    public String getCasaProduttrice() {
        return casaProduttrice;
    }

    public String getPiattaforma() {
        return piattaforma;
    }

    public double getPrezzo() {
        return prezzo;
    }

    @Override
    public String toString() {
        return titolo + " di " + casaProduttrice + " per " + piattaforma + ", " + prezzo + "€";
    }
}
