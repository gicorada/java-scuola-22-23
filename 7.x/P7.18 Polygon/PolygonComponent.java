import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.awt.geom.Point2D;
import java.util.Random;

/**
 Classe che estende JComponent per creare un componente Lampadina
 @author radaelli11353
*/
public class PolygonComponent extends JComponent {
    /**
     Metodo paintComponent che si occupa di disegnare una lampadina
     @param g Contesto grafico di Graphics
    */
    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        
        Polygon quadrato = new Polygon();
        Polygon pentagono = new Polygon();
        
        quadrato.add(new Point2D.Double(0, 0));
        quadrato.add(new Point2D.Double(50, 0));
        quadrato.add(new Point2D.Double(50, 50));
        quadrato.add(new Point2D.Double(0, 50));

        pentagono.add(new Point2D.Double(100, 100));
        pentagono.add(new Point2D.Double(70, 80));
        pentagono.add(new Point2D.Double(50, 50));
        pentagono.add(new Point2D.Double(150, 70));
        pentagono.add(new Point2D.Double(120, 100));
        
        quadrato.draw(g2);
        pentagono.draw(g2);
    }
}