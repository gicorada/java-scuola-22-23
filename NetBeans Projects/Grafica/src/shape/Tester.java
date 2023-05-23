package shape;

import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

/**
 *
 * @author radaelli11353
 */
public class Tester extends JComponent{
    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        
        Geometria geom = new Geometria();

	geom.riempiACaso(10);

	geom.draw(g2);
    }
}
