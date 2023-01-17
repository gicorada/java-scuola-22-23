import javax.swing.JFrame;

/**
 * Classe che visualizza una nuvola tramite un JFrame e CloudComponent
 * @author radaelli11353
 */
public class CloudViewer {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        
        frame.setSize(500, 500);
        frame.setTitle("Visualizzatore nuvola");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        CloudComponent component = new CloudComponent();
        frame.add(component);
        
        frame.setVisible(true);
    }
}