import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Point2D;

/**
 * Classe che rappresenta una nuvola composta da punti.
 * La nuvola può contenere al masssimo 100 punti
 * @author radaelli11353
 */
public class Cloud {
    public static final int DIAMETRO = 5;
    private Point2D.Double[] punti;
    private int nPunti;
    
    /**
     * Costruttore della classe Cloud
     */
    public Cloud() {
        punti = new Point2D.Double[100];
        nPunti = 0;
    }
    
    /**
     * Metodo per aggiungere un punto alla nuvola
     * @param aPoint Punto da aggiungere alla nuvola
     */
    public void add(Point2D.Double aPoint) {
        if(nPunti >= punti.length) throw new IllegalArgumentException();
        punti[nPunti] = aPoint;
        nPunti++;
    }
    
    /**
     * Metodo che disegna la nuvola in un contesto grafico
     * @param g2 Contesto grafico
     */
    public void draw(Graphics2D g2) {
        for(int i = 0; i < nPunti; i++) {
            g2.fill(new Ellipse2D.Double(punti[i].getX(), punti[i].getY(), DIAMETRO, DIAMETRO));
        }
    }
}