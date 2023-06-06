public class ContoDeposito extends ContoCorrente {
    private double tasso;

    public ContoDeposito(double iniz, double tasso) {
        super(iniz);
        this.tasso = tasso;
    }

    public void setTasso(double tasso) {
        this.tasso = tasso;
    }

    public void addInteressi() {
        deposita(getSaldo() * tasso / 100);
    }

    @Override
    public String toString() {
        return super.toString() + ", tasso: " + tasso;
    }

    @Override
    public boolean equals(Object o) {
        if(!super.equals(o)) return false;
        ContoDeposito c = (ContoDeposito) o;
        return tasso == c.tasso;
    }

    public int hashCode() {
        return super.hashCode() + (int)tasso;
    }
}
