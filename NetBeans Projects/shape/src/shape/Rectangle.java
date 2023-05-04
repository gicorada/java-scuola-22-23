package shape;

/**
 *
 * @author radaelli11353
 */
public class Rectangle extends Shape {
    private double x;
    private double y;
    private double w;
    private double h;

    public Rectangle(double x, double y, double w, double h) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
    }

    @Override
    public double width() {
        return w;
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
        int hash = 5;
        hash = 37 * hash + this.x;
        hash = 37 * hash + this.y;
        hash = 37 * hash + this.w;
        hash = 37 * hash + this.h;
        return hash;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        if (getClass() != o.getClass()) return false;
        Rectangle r = (Rectangle) o;
        return Double.compare(r, r.w) && Double.compare(h, r.h) && Double.compare(x, r.x) && Double.compare(y, r.y);
    } 
}
