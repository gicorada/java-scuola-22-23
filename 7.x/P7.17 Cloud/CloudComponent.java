import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.awt.geom.Point2D;
import java.util.Random;

/**
 * Classe che estende JComponent per creare un componente Cloud
 * @author radaelli11353
 */
public class CloudComponent extends JComponent {
    /**
     * Metodo paintComponent che si occupa di disegnare una nuvola
     * @param g Contesto grafico
     */
    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        Random generator = new Random();
        Cloud nuvola = new Cloud();
        
        for(int i = 0; i < 100; i++) {
            nuvola.add(new Point2D.Double(generator.nextDouble()*400, generator.nextDouble()*400));
        }
        
        nuvola.draw(g2);
    }
}