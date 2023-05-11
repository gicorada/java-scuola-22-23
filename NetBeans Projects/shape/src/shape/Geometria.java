package shape;

import java.util.ArrayList;
import java.util.Random;
import java.awt.Graphics2D;

public class Geometria {
	private ArrayList<Shape> elementi;

	public Geometria() {
		elementi = new ArrayList<>();
	}
	
	public void riempiACaso(int size) {
		Random r = new Random();

		for(int i = 0; i < size; i++) {
			int s = r.nextInt(3);
			
			double x = r.nextDouble()*300;
			double y = r.nextDouble()*300;

			switch(s) {
				case 0: 
					//circle
					double raggio = r.nextDouble()*30;
					elementi.add(new Circle(x, y, raggio));
					break;
				case 1:
					//square
					double lato = r.nextDouble()*40;
					elementi.add(new Square(lato, x, y));
					break;
				case 2:
					//triangolo
					double base = r.nextDouble()*30;
					double altezza = r.nextDouble()*30;
					elementi.add(new TriangoloRettangolo(base, altezza, x, y));
					break;
			}
		}
	}

	public void draw(Graphics2D g2) {
		for(Shape s : elementi) s.draw(g2);
	}
}
