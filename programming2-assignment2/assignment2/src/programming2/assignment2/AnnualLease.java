package programming2.assignment2;

import java.util.Date;
import programming2.assignment2.Lease;

/*
 * This class calculates the fee for an annual lease.
 * It is business rules that the fee are calculated
 * depending on the slip length
 * (slip width is only used to assign a boat to the slip)
 * and whether it is a covered slip (more expansive at 80$/linear foot)
 * or not (less expansive at 60$/linear foot).
 * Since boating is in Clinton Lake, Illinois, a summer activity,
 * people prefer to pay the fees while they ENJOY their boat,
 * meaning beginning May to end of September.
 * So fees are payed over a 5 months period.
 * Please note that we leave the annual leasee's boat in the water over winter.
 * Winterizing in the water keep the boat at a more consistent temperature
 * and there is less condensation in the boat throughout the winter.
 * The water area around the boat is kept aerated to prevent ice from forming.
 * Boaters choose this option because their boat winters better in the water.
 * Afterall, boats are made to be in the water!
 * Winterizing in water is included in the annual lease price.
 */
/**
 * @Authors:
 *  Nathalie Desrosiers,Ali Torabi,Behnaz Akbariafshar,  ,Nikolay Nikolov,
 * , Domenic Palucci
 */
public class AnnualLease  extends Lease{
    
    private double payMonthly;
    private double balanceDue;
    private static final double UNCOVERED_SLIP_BY_LINEAR_FOOT = 60.00;//rule
    private static final double COVERED_SLIP_BY_LINEAR_FOOT = 80.00;  //rule
    
    // reference variable 
    private int slipLenght;

    public AnnualLease(double payMonthly, double balanceDue, int slipLenght, double amount, Date startDate, Date endDate, Customer customer, Slip slip) {
        super(amount, startDate, endDate, customer, slip);
        this.payMonthly = payMonthly;
        this.balanceDue = balanceDue;
        this.slipLenght = slipLenght;
    }

    public double getPayMonthly() {
        return payMonthly;
    }

    public void setPayMonthly(double payMonthly) {
        this.payMonthly = payMonthly;
    }

    public void setBalanceDue(double balanceDue) {
        this.balanceDue = balanceDue;
    }

    public void setLenght(int lenght) {
        this.slipLenght = lenght;
    }

    public double getBalanceDue() {
        return balanceDue;
    }

    public int getLenght() {
        return slipLenght;
    }

    
    //this method calculates an uncovered slip annual lease amount 
    public double getUncoveredSlipAnnualLease(){//added by Nathalie
        double annualLeaseAmount = UNCOVERED_SLIP_BY_LINEAR_FOOT * slipLenght;
        return annualLeaseAmount;
    }//end method getUncoveredSlipAnnualLease
    
    //this method calculates a covered slip annual lease amount
    public double getCoveredSlipAnnualLease(){//added by Nathalie
        double annualLeaseAmount = COVERED_SLIP_BY_LINEAR_FOOT * lenght;
        return annualLeaseAmount;
    }//end method getCoveredSlipAnnualLease
    
    //this method allows the user to make a payment!!!!!!!!!!!!!!!!!!
    public double makeAPayment(double annualLeaseAmount){
        double paymentMade = 0.0;//
        return paymentMade;
        /*Now it's 0.0. There must be a place somewhere
         that has a 'make a payment'
        button or text field or whatever...
        !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!! */  
    }//end method makeAPayment
    
    //this method calculates the balance due
    public double getBalanceDue(double paymentMade){
        balanceDue -= paymentMade;
        return balanceDue;
    }//end method getBalanceDue
    
    @Override
    //this method return a monthly payment (prefered by most customers)
    public void calculateFee() {
        payMonthly = balanceDue / 5;        
    }//end method calculateFee
}//end class AnnualLease