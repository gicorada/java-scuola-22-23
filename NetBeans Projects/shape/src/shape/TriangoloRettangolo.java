package shape;

import java.awt.Graphics2D;
import java.awt.geom.Line2D;

/**
 *
 * @author radaelli11353
 */
public class TriangoloRettangolo extends Shape {
    private double b;
    private double h;
    private double x;
    private double y;

    public TriangoloRettangolo(double b, double h, double x, double y) {
        this.b = b;
        this.h = h;
        this.x = x;
        this.y = y;
    }

    @Override
    public double width() {
        return b;
    }

    @Override
    public double height() {
        return h;
    }

    @Override
    public double posX() {
        return x;
    }

    @Override
    public double posY() {
        return y;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + (int) (Double.doubleToLongBits(this.b) ^ (Double.doubleToLongBits(this.b) >>> 32));
        hash = 53 * hash + (int) (Double.doubleToLongBits(this.h) ^ (Double.doubleToLongBits(this.h) >>> 32));
        hash = 53 * hash + (int) (Double.doubleToLongBits(this.x) ^ (Double.doubleToLongBits(this.x) >>> 32));
        hash = 53 * hash + (int) (Double.doubleToLongBits(this.y) ^ (Double.doubleToLongBits(this.y) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final TriangoloRettangolo other = (TriangoloRettangolo) obj;
        if (Double.doubleToLongBits(this.b) != Double.doubleToLongBits(other.b)) {
            return false;
        }
        if (Double.doubleToLongBits(this.h) != Double.doubleToLongBits(other.h)) {
            return false;
        }
        if (Double.doubleToLongBits(this.x) != Double.doubleToLongBits(other.x)) {
            return false;
        }
        return Double.doubleToLongBits(this.y) == Double.doubleToLongBits(other.y);
    }
    
    @Override
    public void draw(Graphics2D g2) {
        Line2D.Double altezza = new Line2D.Double(x, y, x, y+h);
        Line2D.Double base = new Line2D.Double(x, y+h, x+b, y+h);
        Line2D.Double ipotenusa = new Line2D.Double(x, y, x+b, y+h);
        
        g2.draw(altezza);
        g2.draw(base);
        g2.draw(ipotenusa);
    }
    
}
