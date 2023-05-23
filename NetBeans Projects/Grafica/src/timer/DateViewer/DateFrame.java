/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timer.DateViewer;

import javax.swing.JFrame;
import javax.swing.Timer;

/**
 *
 * @author radaelli11353
 */
public class DateFrame extends JFrame {
    private static final int FRAME_WIDTH = 300;
    private static final int FRAME_HEIGHT = 400;
    
    private DateComponent scene;
    
    public DateFrame() {
        scene = new DateComponent();
        add(scene);
        
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
                
        final int DELAY = 100;
        Timer t = new Timer(DELAY, e -> {
            scene.repaint();
        });
        t.start();
    }
}
