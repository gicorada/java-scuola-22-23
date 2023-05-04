package shape;

/**
 *
 * @author radaelli11353
 */
public abstract class Shape implements Comparable<Shape> {
    public abstract double width();
    public abstract double height();
    public abstract double posX();
    public abstract double posY();
    
    @Override
    public int compareTo(Shape o) {
        return Double.compare(width() * height(), o.width() * o.height());
    }
}
