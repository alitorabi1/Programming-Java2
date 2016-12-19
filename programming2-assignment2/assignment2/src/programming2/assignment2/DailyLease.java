
package programming2.assignment2;
import java.util.Date;

/*
 * This class calculate the fee for a daily slip use.
 * It is a business law that the rate for a daily use is fixed,
 * meaning the length of the slip does not matter.
 * There is no special offered if leaser use it
 * on a longer period (say an entire month).
 * No covered slip are offered for daily lease.
 */


/**
 * @Authors:
 *  Nathalie Desrosiers,Ali Torabi,Behnaz Akbariafshar,  ,Nikolay Nikolov,
 * , Domenic Palucci
 */
public class DailyLease extends Lease{
   private int numberOfDays;
   private static final double DAILY_RATE = 35.00;//added by Nathalie

    public void setNumberOfDays(int numberOfDays) {
       
        this.numberOfDays=getEndDate()-getStartDate();
    }//end method setNumberOfDays

    public DailyLease(double amount, Date endDate) {
        super(amount, endDate);
        
    }//end method DailyLease(amount, endDate)

    public DailyLease(double amount, Date startDate, Date endDate) {
        super(amount, startDate, endDate);
    }//end method DailyLease(amount, startDate, endDate)

    @Override
    public void calculateFee() {
        super(amount) = numberOfDays * DAILY_RATE;//added by Nathalie        
    }//end overriding method calculateFee
}//end class DailyLease