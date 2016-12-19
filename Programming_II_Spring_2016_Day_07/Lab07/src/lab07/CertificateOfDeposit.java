/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab07;

/**
 *
 * @author student
 */
public class CertificateOfDeposit extends BankAccount {

    private static final double INTEREST_RATE = 0.05 ;
    private static final int NUMBER_OF_MATURITY_MONTHS = 6 ;
    private int maturityMonths;
    private double interestRate;
    private int cdMonth;
    

    public CertificateOfDeposit(int accountNumber, String name, double balance) {
        super(accountNumber, name, balance);
    }


    /**
     * Get the value of INTEREST_RATE
     *
     * @return the value of INTEREST_RATE
     */
    public double getInterestRate() {
        return INTEREST_RATE;
    }

    /**
     * Get the value of NUMBER_OF_MATURITY_MONTHS
     *
     * @return the value of NUMBER_OF_MATURITY_MONTHS
     */
    public static int getNUMBER_OF_MATURITY_MONTHS() {
        return NUMBER_OF_MATURITY_MONTHS;
    }
    
    
    @Override
    public void createMonthlyStatement() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
