import javax.swing.JFrame;

/**
 * Classe che visualizza un poligono tramite un JFrame e PolygonComponent
 * @author radaelli11353
 */
public class PolygonViewer {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        
        frame.setSize(500, 500);
        frame.setTitle("Visualizzatore poligono");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        PolygonComponent component = new PolygonComponent();
        frame.add(component);
        
        frame.setVisible(true);
    }
}