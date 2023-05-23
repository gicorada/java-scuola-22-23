/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package investment;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author radaelli11353
 */
class InterestListener1 implements ActionListener {
    private static final double INITIAL_BALANCE = 1000;
    private final BankAccount account;
    private final double INTEREST_RATE;

    public InterestListener1(double interest) {
        account = new BankAccount(INITIAL_BALANCE);
        INTEREST_RATE = interest;
    }
    
    @Override
    public void actionPerformed(ActionEvent event) {
        double interest = account.getBalance() * INTEREST_RATE / 100;
        account.deposit(interest);
        System.out.println("saldo: " + account.getBalance());
    }            
}
