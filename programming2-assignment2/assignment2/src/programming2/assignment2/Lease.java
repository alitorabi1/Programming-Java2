package programming2.assignment2;
import java.util.Date;

/*
 * this abstract lease class, 
 * 
 */

/**
 *
 * @author Group programing 2 
 */
public abstract class Lease {
    private double amount;
    private Date startDate;
    private Date endDate;
    private Customer customer;
    private Slip slip;
    
     public Lease(double amount,Date startDate,Date endDate,Customer customer,Slip slip ){
         
          startDate=new Date();          
          setAmount(amount);  
          setStartDate(startDate);        
          setEndDate(endDate);
          setCustomer(customer);
          setSlip(slip);

     }
     
     public void setCustomer(Customer customer) {
        this.customer = customer;
    }
      public void setSlip(Slip slip) {
        this.slip = slip;
    }
     
    public void setAmount(double amount) {
        this.amount = amount;
    }
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public double getAmount() {
        return amount;
    }

    public Date getStartDate() {
        return startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

     
    /**
     * this abstract method must be define in subclass
     */
    public abstract void calculateFee();
    
}
