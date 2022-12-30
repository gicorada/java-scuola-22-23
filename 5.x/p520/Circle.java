import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

public class Circle {
	private int x;
	private int y;
	private double raggio;
	
	public Circle(int x, int y, double raggio) {
		this.x = x;
		this.y = y;
		this.raggio = raggio;
	}

	public double getRaggio() {
		return raggio;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public boolean intersects(Circle other) {
		return (distanza(x, y, other.getX(), other.getY()) <= (raggio + other.getRaggio()));
	}

	private static double distanza(int xa, int ya, int xb, int yb) {
        double dx, dy;
        dx = xa - xb;
        dy = ya - yb;
        return Math.sqrt(dx*dx + dy*dy);
    }

	public void drawCircle(Graphics2D g2, Circle other) {
		Ellipse2D.Double cerchio1 = new Ellipse2D.Double(x - raggio, y - raggio, raggio*2, raggio*2);
		Ellipse2D.Double cerchio2 = new Ellipse2D.Double(other.getX() - other.getRaggio(), other.getY() - other.getRaggio(), other.getRaggio()*2, other.getRaggio()*2);
        if(this.intersects(other)) {
            g2.setColor(Color.RED);
            g2.fill(cerchio1);
			g2.fill(cerchio2);
        } else {
            g2.setColor(Color.GREEN);
            g2.fill(cerchio1);
			g2.fill(cerchio2);
        }
    }
}