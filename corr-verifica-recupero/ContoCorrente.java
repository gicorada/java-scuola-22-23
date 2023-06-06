public class ContoCorrente implements Comparable<ContoCorrente> {
    private double saldo;
    private int numero;
    private static int conta = 0;

    public ContoCorrente(double iniz) {
        if(iniz < 0) throw new IllegalArgumentException();
        saldo = iniz;
        numero = ++conta;
    }

    public void deposita(double somma) {
        if(somma <= 0) throw new IllegalArgumentException();
        saldo += somma;
    }

    public void preleva(double somma) {
        if(somma <= 0 || somma > saldo) throw new IllegalArgumentException();
        saldo += somma;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getNumero() {
        return numero;
    }

    @Override
    public String toString() {
        return "Conto " + numero + ", saldo: " + saldo;
    }

    @Override
    public boolean equals(Object o) {
        if(o == null) return false;
        if(getClass() != o.getClass()) return false;
        ContoCorrente c = (ContoCorrente) o;
        return saldo == c.saldo;
    }

    @Override
    public int hashCode() {
        return (int)saldo;
    }

    @Override
    public int compareTo(ContoCorrente c) {
        return Double.compare(saldo, c.saldo);
    } 
}
