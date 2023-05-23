/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timer.DateViewer;

import javax.swing.JFrame;

/**
 *
 * @author radaelli11353
 */
public class DateViewer {
    public static void main(String[] args) {
        JFrame frame = new DateFrame();
        frame.setTitle("Date and Hour");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

