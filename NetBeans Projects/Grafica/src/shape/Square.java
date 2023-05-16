package shape;

import java.awt.Graphics2D;
import java.awt.Rectangle;

/**
 *
 * @author radaelli11353
 */
public class Square extends Shape {
    private double l;

    public Square(double x, double y, double l) {
        super(x, y);
        this.l = l;
    }

    @Override
    public double width() {
        return l;
    }

    @Override
    public double height() {
        return l;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.l) ^ (Double.doubleToLongBits(this.l) >>> 32));
        hash = 97 * hash + super.hashCode();
        return hash;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        if (getClass() != o.getClass()) return false;
        Square s = (Square) o;
        return l == s.l;
    } 

    @Override
    public void draw(Graphics2D g2) {
        Rectangle r = new Rectangle((int)posX(), (int)posY(), (int)width(), (int)height());
        
        g2.draw(r);
    }
}
