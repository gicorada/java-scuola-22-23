import java.awt.Graphics2D;
import java.awt.geom.Point2D;
import java.awt.geom.Line2D;

/**
 * Classe che rappresenta un grafico a barrecomposto da un numero variabile di dati
 * @author radaelli11353
 */
public class Chart {
    private int[] valori;
    private int nValori;
    
    /**
     * Costruttore della classe Chart
     * @param maxValori Numero massimo di valori del grafico
     */
    public Chart(int maxValori) {
        valori = new int[maxValori];
        nValori = 0;
    }
    
    /**
     * Metodo per aggiungere un dato al grafico
     * @param valore Valore da aggiungere al grafico
     */
    public void add(int valore) {
        if(nValori >= valori.length) throw new IllegalArgumentException();
        valori[nValori] = valore;
        nValori++;
    }
    
    /**
     * Metodo che disegna il grafico in un contesto grafico
     * @param g2 Contesto grafico
     */
    public void draw(Graphics2D g2) {
        for(int i = 0; i < nValori; i++) {
            g2.draw(new Line2D.Double(10+i*10, 450, 10+i*10, 450-valori[i]));
        }
    }
}