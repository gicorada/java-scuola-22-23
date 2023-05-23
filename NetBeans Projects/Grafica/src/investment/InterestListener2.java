/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package investment;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;

/**
 *
 * @author radaelli11353
 */
class InterestListener2 implements ActionListener {
    private static final double INITIAL_BALANCE = 1000;
    private BankAccount account;
    private final double INTEREST_RATE;
    private final JLabel label;

    public InterestListener2(double interest, JLabel label) {
        account = new BankAccount(INITIAL_BALANCE);
        INTEREST_RATE = interest;
        this.label = label;
    }
    
    @Override
    public void actionPerformed(ActionEvent event) {
        double interest = account.getBalance() * INTEREST_RATE / 100;
        account.deposit(interest);
        label.setText("Saldo: " + account.getBalance());
        System.out.println(label.getText());
    }            
}
