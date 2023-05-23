/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timer.MovingRectangleBorders;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JComponent;

/**
 *
 * @author radaelli11353
 */
public class RectangleComponent extends JComponent{
    private static final int BOX_X = 100;
    private static final int BOX_Y = 100;
    private static final int BOX_WIDTH = 20;
    private static final int BOX_HEIGHT = 30;
    
    private Rectangle box;
    private int xMov = 1;
    private int yMov = 1;

    public RectangleComponent() {
        box = new Rectangle(BOX_X, BOX_Y, BOX_WIDTH, BOX_HEIGHT);
    }
    
    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.draw(box);
    }
    
    public void moveRectangle() {
        double x = box.getX();
        double y = box.getY();
        xMov = (x + box.getWidth() < getWidth()) ? xMov : -1;
        yMov = (y + box.getHeight() < getHeight()) ? yMov : -1;
        xMov = (x >= 0) ? xMov : 1;
        yMov = (y >= 0) ? yMov : 1;
        
        box.translate(xMov, yMov);
        repaint();
    }
}
