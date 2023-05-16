package shape;

import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

/**
 *
 * @author radaelli11353
 */
public class Circle extends Shape {
    private double r;

    public Circle(double xc, double yc, double r) {
        super(xc-r, yc-r);
        this.r = r;
    }
    
    public void setRadius(double r) {
        this.r = r;
    }

    @Override
    public double width() {
        return r*2;
    }

    @Override
    public double height() {
        return r*2;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 83 * hash + (int) (Double.doubleToLongBits(this.r) ^ (Double.doubleToLongBits(this.r) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        if (getClass() != o.getClass()) return false;
        Circle c = (Circle) o;
        return r == c.r;
    }
    
    @Override
    public void draw(Graphics2D g2) {
        Ellipse2D.Double e = new Ellipse2D.Double(posX(), posY(), width(), height());
        
        g2.draw(e);
    }
}
