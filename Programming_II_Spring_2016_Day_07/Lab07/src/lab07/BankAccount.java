/*
 * Declare an Abstract class named BankAccounts */
package lab07;

/**
 *
 * @author student
 */
public abstract class BankAccount {
    protected int accountNumber;
    protected String name;
    protected double balance;

    /**
     * 
     * @param accountNumber
     * @param name
     * @param balance 
     */
    public BankAccount(int accountNumber, String name, double balance) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balance;
    }

    /**
     * 
     * @return accountNumber
     */
    public int getAccountNumber() {
        return accountNumber;
    }

    /**
     * 
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 
     * @param theName 
     */
    public void setName(String theName) {
        this.name = theName;
    }

    /**
     * 
     * @return balance
     */
    public double getBalance() {
        return balance;
    }

    /**
     * 
     * @param amount 
     */
    public void widthdraw(double amount){
        balance = balance - amount;
    }

    /**
     * 
     * @param amount 
     */
    public void deposit(double amount){
        balance = balance + amount;
    }
    
    /**
     * 
     */
    public abstract void createMonthlyStatement();

    @Override
    public String toString() {
        return "BankAccounts{" + "accountNumber=" + accountNumber + ", name=" + name + ", balance=" + balance + '}';
    }
}
