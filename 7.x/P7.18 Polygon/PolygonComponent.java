import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.awt.geom.Point2D;

/**
 * Classe che estende JComponent per creare un componente Cloud
 * @author radaelli11353
 */
public class PolygonComponent extends JComponent {
    /**
     * Metodo paintComponent che si occupa di disegnare un poligono
     * @param g Contesto grafico
     */
    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        
        Polygon quadrato = new Polygon(4);
        Polygon pentagono = new Polygon(5);
        
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