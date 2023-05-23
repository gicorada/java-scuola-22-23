/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timer.MovingRectangleBorders;

import javax.swing.JFrame;
import javax.swing.Timer;

/**
 *
 * @author radaelli11353
 */
public class RectangleFrame extends JFrame {
    public static final int FRAME_WIDTH = 300;
    public static final int FRAME_HEIGHT = 400;
    
    private RectangleComponent scene;
    
    public RectangleFrame() {
        scene = new RectangleComponent();
        add(scene);
        
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
                
        final int DELAY = 100;
        Timer t = new Timer(DELAY, e -> {
            scene.moveRectangle();
        });
        t.start();
    }
    
}
