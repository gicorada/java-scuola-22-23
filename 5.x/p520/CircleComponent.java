import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import javax.swing.JComponent;

public class CircleComponent extends JComponent {
    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        
        Circle c1 = new Circle(88, 200, 50);
		Circle c2 = new Circle(200, 100, 100);

		c1.drawCircle(g2, c2);
    }
} 
