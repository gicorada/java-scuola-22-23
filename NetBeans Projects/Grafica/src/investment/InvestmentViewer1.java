package investment;

import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class InvestmentViewer1 {  
    private static final int FRAME_WIDTH = 120;
    private static final int FRAME_HEIGHT = 60;

    private static final double INTEREST_RATE = 10;
    private static final double INITIAL_BALANCE = 1000;

    public static void main(String[] args) {  
        JFrame frame = new JFrame();
        frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JButton button = new JButton("Aggiungi interessi");
        frame.add(button);
     
        ActionListener listener = new InterestListener1(INTEREST_RATE);
        button.addActionListener(listener);

        frame.setVisible(true);
   }
}

