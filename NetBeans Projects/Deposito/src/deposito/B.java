package deposito;

/**
 * Classe che simula un bidone contenente liquido
 * @author radaelli11353
 */
public class B extends C {
    private double quantita;
    private String nome;

    public B(double quantita, String nome, String id) {
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
        if(o.toString().contains("L{quantita=")) return 1;
        B b = (B) o;
        return Double.compare(quantita, b.quantita);
    }

    @Override
    public String toString() {
        return "B{" + "quantita=" + quantita + ", nome=" + nome + '}';
    }
    
    
}
