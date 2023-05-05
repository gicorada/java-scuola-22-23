package shape;

import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

/**
 *
 * @author radaelli11353
 */
public class Circle extends Shape {
    private double xc;
    private double yc;
    private double r;

    public Circle(double xc, double yc, double r) {
        this.xc = xc;
        this.yc = yc;
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
    public double posX() {
        return xc - r;
    }

    @Override
    public double posY() {
        return yc - r;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 83 * hash + (int) (Double.doubleToLongBits(this.xc) ^ (Double.doubleToLongBits(this.xc) >>> 32));
        hash = 83 * hash + (int) (Double.doubleToLongBits(this.yc) ^ (Double.doubleToLongBits(this.yc) >>> 32));
        hash = 83 * hash + (int) (Double.doubleToLongBits(this.r) ^ (Double.doubleToLongBits(this.r) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        if (getClass() != o.getClass()) return false;
        Circle c = (Circle) o;
        return Double.compare(xc, c.xc) == 0 && Double.compare(yc, c.yc) == 0 && Double.compare(r, c.r) == 0;
    }
    
    @Override
    public void draw(Graphics2D g2) {
        Ellipse2D.Double e = new Ellipse2D.Double(xc-r, yc-r, r*2, r*2);
        
        g2.draw(e);
    }
}
