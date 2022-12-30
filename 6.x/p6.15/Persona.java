import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

/**
 * Persona
 */
public class Persona {
	private int x;
	private int y;
	public static final int RAGGIO = 5;
	
	public Persona(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void move() {
		int rand = (int)((Math.random() * 4) + 1);
		if(rand == 1) {
			//N
			y -= 20;
		} else if(rand == 2) {
			//E
			x += 20;
		} else if(rand == 3) {
			//S
			y += 20;
		} else if(rand == 4) {
			//W
			x -= 20;
		}
	}
	
	public void drawPersona(Graphics2D g2) {
		Ellipse2D.Double persona = new Ellipse2D.Double(x - RAGGIO, y - RAGGIO, RAGGIO*2, RAGGIO*2);
        g2.fill(persona);
    }
}