import java.awt.Graphics2D;
import java.awt.geom.Point2D;
import java.awt.geom.Line2D;

/**
 Classe che rappresenta lo stato di una lampadina
 @author radaelli11353
*/
public class Polygon {
    public static final int DIAMETRO = 5;
    private Point2D.Double[] punti;
    private int nPunti;
    
    public Polygon() {
        punti = new Point2D.Double[100];
        nPunti = 0;
    }
    
    public void add(Point2D.Double aPoint) {
        if(nPunti >= punti.length) throw new IllegalArgumentException();
        punti[nPunti] = aPoint;
        nPunti++;
    }
    
    public void draw(Graphics2D g2) {
        for(int i = 0; i < nPunti - 1; i++) {
            Line2D.Double linea = new Line2D.Double(punti[i].getX(), punti[i].getY(), punti[i+1].getX(), punti[i+1].getY());
            g2.draw(linea);
        }
        g2.draw(new Line2D.Double(punti[nPunti - 1].getX(), punti[nPunti - 1].getY(), punti[0].getX(), punti[0].getY()));
    }
}