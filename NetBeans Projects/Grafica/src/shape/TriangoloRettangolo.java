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

    public TriangoloRettangolo(double x, double y, double b, double h) {
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
        hash = 53 * hash + super.hashCode();
        return hash;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TriangoloRettangolo t = (TriangoloRettangolo) o;
        if (Double.doubleToLongBits(b) != Double.doubleToLongBits(t.b)) {
            return false;
        }
        return Double.doubleToLongBits(h) != Double.doubleToLongBits(t.h);
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
