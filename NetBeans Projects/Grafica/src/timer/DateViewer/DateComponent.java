/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timer.DateViewer;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.Date;
import javax.swing.JComponent;

/**
 *
 * @author radaelli11353
 */
public class DateComponent extends JComponent {
    private Date now;

    public DateComponent() {
        now = new Date();
    }
    
    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        recalculateDate();
        g2.drawString(now.toString(), 100, 100);
    }
    
    public void recalculateDate() {
        now = new Date();
    }
}
