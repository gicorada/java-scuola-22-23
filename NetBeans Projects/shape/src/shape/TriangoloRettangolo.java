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

    public TriangoloRettangolo(double b, double h, double x, double y) {
        super(x, y);
	this.b = b;
        this.h = h;
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
        Line2D.Double altezza = new Line2D.Double(posX(), posY(), posX(), posY()+height());
        Line2D.Double base = new Line2D.Double(posX(), posY()+height(), posX()+width(), posY()+height());
        Line2D.Double ipotenusa = new Line2D.Double(posX(), posY(), posX()+width(), posY()+height());
        
        g2.draw(altezza);
        g2.draw(base);
        g2.draw(ipotenusa);
    }
    
}
