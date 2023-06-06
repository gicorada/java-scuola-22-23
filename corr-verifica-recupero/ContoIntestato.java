public class ContoIntestato extends ContoCorrente {
    private String nome;

    public ContoIntestato(double iniz, String nome) {
        super(iniz);
        this.nome = nome;
    }

    @Override
    public String toString() {
        return super.toString() + " intestato a " + nome;
    }

    @Override
    public boolean equals(Object o) {
        if(!super.equals(o)) return false;
        ContoIntestato c = (ContoIntestato) o;
        return nome.equals(c.nome);
    }

    @Override
    public int hashCode() {
        return super.hashCode() + nome.hashCode();
    }
}
