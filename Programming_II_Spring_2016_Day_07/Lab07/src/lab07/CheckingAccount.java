/*
 * This class extends from the BankAccounts */
package lab07;

/**
 *
 * @author student
 */
public abstract class CheckingAccount extends BankAccount{
    
    /**
     * 
     * @param accountNumber
     * @param name
     * @param balance 
     */
    public CheckingAccount(int accountNumber, String name, double balance) {
        super(accountNumber, name, balance);
    }
    
    /**
     * 
     * @param amount 
     */
    public abstract void writeCheck(double amount);
}
