/*
 * The CheckingAccount class extends the BanckAccount
 */
package programming2_bankaccounts;

/**
 *
 * @author teacher
 */
public abstract class CheckingAccount extends BankAccount{

    public CheckingAccount(int anAccountNumber, String aName, double aBalance) {
        super(anAccountNumber, aName, aBalance);
    } // end constructor CheckingAccount
    
    /**
     * 
     * @param amount 
     */
    public abstract void writeCheck(double amount );
    
} // end class CheckingAccount
