import java.awt.Graphics2D;
import java.awt.geom.Point2D;
import java.awt.geom.Line2D;

/**
 * Classe che rappresenta un poligono composto da un numero variabile di punti
 * @author radaelli11353
 */
public class Polygon {
    private Point2D.Double[] punti;
    private int nPunti;
    
    /**
     * Costruttore della classe Polygon
     * @param maxPunti Numero massimo di punti per il poligono
     */
    public Polygon(int maxPunti) {
        punti = new Point2D.Double[maxPunti];
        nPunti = 0;
    }
    
    /**
     * Metodo per aggiungere un punto al poligono
     * @param aPoint Punto da aggiungere al poligono
     */
    public void add(Point2D.Double aPoint) {
        if(nPunti >= punti.length) throw new IllegalArgumentException();
        punti[nPunti] = aPoint;
        nPunti++;
    }
    
    /**
     * Metodo che disegna il poligono in un contesto grafico
     * @param g2 Contesto grafico
     */
    public void draw(Graphics2D g2) {
        for(int i = 0; i < nPunti - 1; i++) {
            g2.draw(new Line2D.Double(punti[i].getX(), punti[i].getY(), punti[i+1].getX(), punti[i+1].getY()));
        }
        g2.draw(new Line2D.Double(punti[nPunti - 1].getX(), punti[nPunti - 1].getY(), punti[0].getX(), punti[0].getY()));
    }
}