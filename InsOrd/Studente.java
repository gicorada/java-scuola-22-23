public class Studente implements Comparable<Studente>{
    private String nome;
    private String cognome;
    private double media;
    private int eta;

    public Studente(String nome, String cognome, double media, int eta) {
        this.nome = nome;
        this.cognome = cognome;
        this.media = media;
        this.eta = eta;
    }

    @Override
    public int compareTo(Studente o) {
        if(this.cognome.equals(o.cognome)) return this.nome.compareTo(o.nome);
        return this.cognome.compareTo(o.cognome);
    }

    @Override
    public String toString() {
        return nome + " " + cognome + " media=" + media + " eta=" + eta;
    }
}
