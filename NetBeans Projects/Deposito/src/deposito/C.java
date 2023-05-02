package deposito;

/**
 * Classe che simula un contenitore generico
 * @author radaelli11353
 */
public abstract class C implements Comparable<C> {
    String id;

    public C(String id) {
        this.id = id;
    }
    
    public abstract String getNome();

    @Override
    public abstract int compareTo(C o);

    @Override
    public String toString() {
        return "C{" + "id=" + id + '}';
    }
}
