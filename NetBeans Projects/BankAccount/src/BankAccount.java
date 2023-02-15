import java.util.ArrayList;

public class BankAccount {  
    private double balance;
    private ArrayList<Double> movements;
    
    //*** INIZIO METODI FORNITI DAL LIBRO ***
    /**
      Constructs a bank account with a zero balance.
    */
    public BankAccount() {   
        balance = 0;
        movements = new ArrayList<>();
    }

    /**
      Deposits money into the bank account.
      @param amount the amount to deposit
    */
    public void deposit(double amount) {  
        movements.add(amount);
        balance = balance + amount;
    }

    /**
      Withdraws money from the bank account.
      @param amount the amount to withdraw
    */
    public void withdraw(double amount)
    {   
        movements.add(-amount);
        balance = balance - amount;
    }

    /**
      Gets the current balance of the bank account.
      @return the current balance
    */
    public double getBalance() {   
        return balance;
    }
    
    //*** FINE METODI FORNITI DAL LIBRO ***
    
    public ArrayList<Double> getStatement() {
        return movements;
    }
    
    public void clearStatement() {
        movements.clear();
    }
}


