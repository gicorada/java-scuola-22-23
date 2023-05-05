package shape;

import javax.swing.JFrame;

/**
 *
 * @author radaelli11353
 */
public class ShapesViewer {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        
        frame.setSize(600, 600);
        frame.setTitle("Circles");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Tester component = new Tester();
        frame.add(component);
        
        frame.setVisible(true);
    }
} 
