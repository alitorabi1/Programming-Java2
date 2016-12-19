/*
 * Declare an Abstract class named BankAccount
 */
package programming2_bankaccounts;

/**
 *
 * @author teacher
 */
public abstract class BankAccount {
   // decalre variables
    protected int accountNumber;
    protected String name;
    protected double balance;

    public BankAccount(int anAccountNumber, String aName, double aBalance) {
        this.accountNumber = anAccountNumber;
        this.name = aName;
        this.balance = aBalance;
    } // end constructor BankAccount

    /**
     * @return the accountNumber
     */
    public int getAccountNumber() {
        return accountNumber;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param theName the name to set
     */
    public void setName(String theName) {
        this.name = theName;
    }

    /**
     * @return the balance
     */
    public double getBalance() {
        return balance;
    } 
    
    /**
     * @param amount the amount to set
     * withdraw method
     */
    public void withdraw(double amount) {
        balance = balance - amount;
    } // end method withdraw
    
    /**
     * @param amount the amount to set
     * withdraw method
     */
    public void deposit(double amount) {
        balance = balance + amount;
    } //end method deposit
    
    // create the abstract method createMonthlyStatement
    public abstract void createMonthlyStatement();
    
    @Override
    public String toString() {
        return name + " " + accountNumber + " Balance : $" 
                + String.format("%.2f", balance);
    }
}// end class BankAccount
