package deposito;

/**
 * Classe che simula una lattina contenente liquido
 * @author radaelli11335
 */
public class L extends C {
    private double quantita;
    private String nome;

    public L(double quantita, String nome, String id) {
        super(id);
        this.quantita = quantita;
        this.nome = nome;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public int compareTo(C o) {
        if(o.toString().contains("B{quantita=")) return -1;
        L l = (L) o;
        return Double.compare(quantita, l.quantita);
    }

    @Override
    public String toString() {
        return "L{" + "quantita=" + quantita + ", nome=" + nome + '}';
    }
    
    
}
