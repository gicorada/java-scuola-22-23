import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import javax.swing.JComponent;

public class GrigliaComponent extends JComponent{
	Persona pers;
	public GrigliaComponent() {
		pers = new Persona(200, 200);
		for(int i = 1; i <= 100; i++) {
			pers.move();
		}

	}

	public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        
		Line2D.Double lineao = new Line2D.Double(0, 1, 400, 1);
		Line2D.Double lineav = new Line2D.Double(1, 0, 1, 430);

		for(int i = 1; i <= 20; i++) {
			lineao.setLine(0, i*20, 400, i*20);
			lineav.setLine(i*20, 0, i*20, 400);
			g2.draw(lineao);
			g2.draw(lineav);
		}

		pers.drawPersona(g2);
    }
}
