import javax.swing.JFrame;

/**
 * Classe che visualizza un grafico a barre tramite un JFrame e ChartComponent
 * @author radaelli11353
*/
public class ChartViewer {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        
        frame.setSize(500, 500);
        frame.setTitle("Visualizzatore grafico a barre");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        ChartComponent component = new ChartComponent();
        frame.add(component);
        
        frame.setVisible(true);
    }
}