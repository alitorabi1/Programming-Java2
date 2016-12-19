/*
 * The CertificateOfDeposit extends the BankAccount class 
 */
package programming2_bankaccounts;

/**
 *
 * @author teacher
 */
public class CertificateOfDeposit extends BankAccount {
    
    // private named constants
    private static final double INTEREST_RATE = 0.05;    
    private static final int NUMBER_OF_MATURITY_MONTHS = 6;

    private double interestRate;
    private int maturityMonths;   
    private int cdMonth;        // Certificate of Deposit
    
    public CertificateOfDeposit(int anAccountNumber, String aName, double aBalance) {
        super(anAccountNumber, aName, aBalance);
        interestRate = INTEREST_RATE;
        maturityMonths = 0;
        cdMonth = 0;
    }
    
    public CertificateOfDeposit(int anAccountNumber, String aName, double aBalance,
            double anInterestRate, int aMaturityMonths) {
        super(anAccountNumber, aName, aBalance);
        interestRate = anInterestRate;
        maturityMonths = aMaturityMonths;
        cdMonth = 0;
    }
    
    public double getInterestRate() {
        return interestRate;
    }
    public void setInterestRate(double rate) {
        interestRate = rate;
    }
    
    public double getCurrentCDMonth() {
        return cdMonth;
    }
    
    public void setCurrentCDMonth(int month) {
        cdMonth = month;
    }

    public double getMaturityMonths() {
        return maturityMonths;
    }
            
    public void setMaturityMonths(int month) {
        maturityMonths = month;
    }
            
    public void postInterest() {
        balance = balance + (balance * interestRate);
    }
    
    public void withdraw(double amount) {
        // no withdraw until maturity
    }
    
    public void withdraw() {
        if (cdMonth > maturityMonths) {
            balance = 0;
        }
        else {
            System.out.println("Certificate of Deposit (CD) has not been matured. No withdrawal.");
        }
    } // end method withdraw
    
    public void createMonthlyStatement() {
        postInterest();
        cdMonth++;
    }
    
    public String toString() {
        return "Certificate of Deposit: " 
                + getName() + "\t ACCT#" +
                getAccountNumber() + "\tBalance: $"
                + String.format("%.2f", getBalance() );                
    }
        
} // end class CertificateOfDeposit
