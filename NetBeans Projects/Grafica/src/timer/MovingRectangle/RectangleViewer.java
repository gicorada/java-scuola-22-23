/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timer.MovingRectangle;

import timer.MovingRectangleBorders.RectangleFrame;
import javax.swing.JFrame;

/**
 *
 * @author radaelli11353
 */
public class RectangleViewer {
    public static void main(String[] args) {
        JFrame frame = new RectangleFrame();
        frame.setTitle("An animated rectangle");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    
}
