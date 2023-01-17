import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

/**
 * Classe che estende JComponent per creare un componente Chart
 * @author radaelli11353
*/
public class ChartComponent extends JComponent {
    /**
     * Metodo paintComponent che si occupa di disegnare un grafico a barre
     * @param g Contesto grafico
     */
    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        
        Chart grafico = new Chart(15);
        
        grafico.add(150);
        grafico.add(300);
        grafico.add(50);
        grafico.add(150);
        grafico.add(250);
        
        grafico.draw(g2);
    }
}