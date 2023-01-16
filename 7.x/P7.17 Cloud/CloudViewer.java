import javax.swing.JFrame;

/**
 Classe che visualizza una lampadina tramite un JFrame e LampadinaComponent
 @author radaelli11353
*/
public class CloudViewer {
    /**
     Metodo main di LampadinaViewer
     @param args Argomenti passati all'esecuzione del programma
    */
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