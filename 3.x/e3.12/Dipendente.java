/**
 * Classe che gestisce stipendio e nome dei dipendenti
 * @author radaelli11353
 */

public class Dipendente {
    String nome;
    double stipendio;
    /**
     * Costruttore
     * @param n Nome dipendente
     * @param s Stipendio dipendente
     */
    public Dipendente(String n, double s) {
        nome = n;
        stipendio = s;
    }

    /**
     * Metodo getter per il nome del dipendente
     * @return Nome dipendente
     */
    public String getNome() {
        return nome;
    }

    /**
     * Metodo getter per lo stipendio del dipendente
     * @return Stipendio dipendente
     */
    public double getStipendio() {
        return stipendio;
    }

    /**
     * Metodo che aumenta lo stipendio del dipendente
     * @param percentuale Percentuale di aumento dello stipendio
     */
    public void aumentaStipendio(double percentuale) {
        stipendio += stipendio * (percentuale/100);
    }
    
    
    /**
     * Metodo di test
     */
    public static void Test() {
        Dipendente test = new Dipendente("Cognome, Nome", 20000);
        System.out.println("Nome: " + test.getNome());
        System.out.println("Stipendio: " + test.getStipendio());
        test.aumentaStipendio(10);
        System.out.println("Stipendio: " + test.getStipendio());
    }

    /**
     * Metodo main che richiama il metodo di test
     */
    public static void main(String[] args) {
        Test();
    }
}