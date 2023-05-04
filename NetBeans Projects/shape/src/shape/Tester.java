package shape;

import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

/**
 *
 * @author radaelli11353
 */
public class Tester extends JComponent{
    public static void main(String[] args) {
        Shape c1 = new Circle(2, 3, 1);
        Shape c2 = new Circle(2, 3, 1);
        
        System.out.println(c1.posX() + ", " +c1.posY());
        System.out.println(c1.width() + ", " +c1.height());
        System.out.println(c1.equals(c2));
        
        ((Circle) c2).setRadius(2);
        System.out.println(c2.posX() + ", " + c2.posY());
    }
    
    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        
        Shape s1 = new Circle(88, 200, 50);
	Shape s2 = new Square(200, 100, 100);
	Shape s3 = new TriangoloRettangolo(200, 100, 100, 100);

	s1.draw(g2);
	s2.draw(g2);
	s3.draw(g2);
    }
}
