import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Point2D;

/**
 Classe che rappresenta lo stato di una lampadina
 @author radaelli11353
*/
public class Cloud {
    public static final int DIAMETRO = 5;
    private Point2D.Double[] punti;
    private int nPunti;
    
    public Cloud() {
        punti = new Point2D.Double[100];
        nPunti = 0;
    }
    
    public void add(Point2D.Double aPoint) {
        if(nPunti >= punti.length) throw new IllegalArgumentException();
        punti[nPunti] = aPoint;
        nPunti++;
    }
    
    public void draw(Graphics2D g2) {
        for(int i = 0; i < nPunti; i++) {
            Ellipse2D.Double punto = new Ellipse2D.Double(punti[i].getX(), punti[i].getY(), DIAMETRO, DIAMETRO);
            g2.setColor(Color.RED);
            g2.draw(punto);
            g2.fill(punto);
        }
    }
}