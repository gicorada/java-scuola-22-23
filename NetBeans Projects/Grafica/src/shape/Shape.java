package shape;

import java.awt.Graphics2D;

/**
 *
 * @author radaelli11353
 */
public abstract class Shape implements Comparable<Shape> {
    	private double x, y;

	public Shape(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public abstract double width();
    	public abstract double height();
    	public double posX() {
		return x;
	}
    	public double posY() {
		return y;
	}
    
    	public abstract void draw(Graphics2D g2);
    
    	@Override
    	public int compareTo(Shape o) {
    	    return Double.compare(width() * height(), o.width() * o.height());
    	}
}
