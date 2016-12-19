/*
 * The SavingAccount extends the BankAccount class 
 */
package programming2_bankaccounts;

/**
 *
 * @author teacher
 */
public class SavingAccount extends BankAccount {
    private static final double INTEREST_RATE = 0.03;
    protected double interestRate;
    
    public SavingAccount(int anAccountNumber, String aName, double aBalance) {
        super(anAccountNumber, aName, aBalance);
        interestRate = INTEREST_RATE;
    }
    
    public SavingAccount(int anAccountNumber, String aName, double aBalance, double intRate) {
        super(anAccountNumber, aName, aBalance);
        setInterestRate(intRate);
    }
    
    public double getInterestRate() {
        return interestRate;
    }
    
    public void setInterestRate(double rate) {
        interestRate = rate;
    }
    
    public void postInterest() {
        balance = balance + (balance * interestRate);
    }
        
    public void createMonthlyStatement() {
        postInterest();
    }
    
    public String toString() {
        return "Savings account: " + getName() 
                + "\t ACCT#" + getAccountNumber() 
                + "\tBalance: $" + String.format("%.2f", getBalance()) ;
    }        
}
