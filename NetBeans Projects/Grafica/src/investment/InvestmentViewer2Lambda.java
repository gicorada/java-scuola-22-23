package investment;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class InvestmentViewer2Lambda {  
    private static final int FRAME_WIDTH = 400;
    private static final int FRAME_HEIGHT = 100;

    private static final double INTEREST_RATE = 10;
    private static final double INITIAL_BALANCE = 1000;

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        BankAccount account = new BankAccount(INITIAL_BALANCE);

        JButton button = new JButton("Aggiungi interessi");
        JLabel label = new JLabel("Saldo: " + account.getBalance());
        JPanel panel = new JPanel();

        panel.add(button);
        panel.add(label);      
        frame.add(panel);


        ActionListener listener = new InterestListener2(INTEREST_RATE, label);
        button.addActionListener(event -> {
            double interest = account.getBalance() * INTEREST_RATE / 100;
            account.deposit(interest);
            label.setText("Saldo: " + account.getBalance());
            System.out.println(label.getText());
        });

        frame.setVisible(true);
    }
}

