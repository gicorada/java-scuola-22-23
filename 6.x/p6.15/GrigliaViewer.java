import javax.swing.JFrame;

public class GrigliaViewer {
	public static void main(String[] args) {
        JFrame frame = new JFrame();
        
        frame.setSize(400, 430);
        frame.setTitle("Circles");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        GrigliaComponent component = new GrigliaComponent();

		component.repaint();
        frame.add(component);
        
        frame.setVisible(true);
    }
}
