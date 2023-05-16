package investment;

import java.awt.event.ActionEvent;
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
      
        BankAccount account = new BankAccount(INITIAL_BALANCE);

        JButton button = new JButton("Aggiungi interessi");
        frame.add(button);

        class InterestListener implements ActionListener {
            public void actionPerformed(ActionEvent event) {
                double interest = account.getBalance() * INTEREST_RATE / 100;
                account.deposit(interest);
                System.out.println("saldo: " + account.getBalance());
            }            
        }
     
        ActionListener listener = new InterestListener();
        button.addActionListener(listener);

        frame.setVisible(true);
   }
}

