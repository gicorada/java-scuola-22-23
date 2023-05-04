package shape;

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
        int hash = 3;
        hash = 59 * hash + this.xc;
        hash = 59 * hash + this.yc;
        hash = 59 * hash + this.r;
        return hash;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        if (getClass() != o.getClass()) return false;
        Circle c = (Circle) o;
        return Double.compare(xc, c.xc) && Double.compare(yc, c.yc) && Double.compare(r, c.r);
    }
}
