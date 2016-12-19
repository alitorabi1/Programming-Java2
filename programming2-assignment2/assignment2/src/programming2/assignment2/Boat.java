package programming2.assignment2;
import java.util.logging.FileHandler;
import java.util.logging.Logger;

/*
 * To handle and management Boats.
 * This class has two subclasses called Sailboat and Powerboat.
 */

/**
 *
 * @author Behnaz-Domenic-Nathaly-Nikolay-Ali
 */
public class Boat {

    public Boat() {
    }

    public Boat(String stateRegistrationNumber, String length, String manufacture, String year, int customerID) {
    	setStateRegistrationNumber(stateRegistrationNumber);
    	setLength(length);
    	setManufacture(manufacture);
    	setYear(year);
    	setcustomerID(customerID);
    }

    Logger log = Logger.getLogger("MarinaLog");
    FileHandler fileHandler;  

    private String stateRegistrationNumber;

    private String length;

    private String manufacture;

    private String year;

    private int customerID;

    
    /**
     * Get the value of customerID
     *
     * @return the value of customerID
     */
    public int getcustomerID() {
        return customerID;
    }

    /**
     * Set the value of customerID
     *
     * @param thecustomerID new value of customerID
     */
    public void setcustomerID(int thecustomerID) {
        this.customerID = thecustomerID;
    }

    /**
     * Get the value of year
     *
     * @return the value of year
     */
    public String getYear() {
        return year;
    }

    /**
     * Set the value of year
     *
     * @param theYear new value of year
     */
    public void setYear(String theYear) {
        this.year = theYear;
    }

    /**
     * Get the value of manufacture
     *
     * @return the value of manufacture
     */
    public String getManufacture() {
        return manufacture;
    }

    /**
     * Set the value of manufacture
     *
     * @param theManufacture new value of manufacture
     */
    public void setManufacture(String theManufacture) {
        this.manufacture = theManufacture;
    }

    /**
     * Get the value of length
     *
     * @return the value of length
     */
    public String getLength() {
        return length;
    }

    /**
     * Set the value of length
     *
     * @param theLength new value of length
     */
    public void setLength(String theLength) {
        this.length = theLength;
    }

    /**
     * Get the value of stateRegistrationNumber
     *
     * @return the value of stateRegistrationNumber
     */
    public String getStateRegistrationNumber() {
        return stateRegistrationNumber;
    }

    /**
     * Set the value of stateRegistrationNumber
     *
     * @param stateRegNumber new value of stateRegistrationNumber
     */
    public void setStateRegistrationNumber(String stateRegNumber) {
        this.stateRegistrationNumber = stateRegNumber;
    }

    /**
     * Assign boat(s) to customerID
     */
    public void assignBoatTocustomerID() {
//    	Customer customer;
//    	customer.setBoat(this.getStateRegistrationNumber());
    }

    /**
     * Assign boat(s) to customerID
     */
    public void assignBoatToSlip() {
//        Slip slip;
//        slip.setBoat(this.getStateRegistrationNumber());
    }

    /**
     * Assign boat(s) to customerID
     */
    public void removingBoatFromSlip() {
//      Slip slip;
//      slip.removeBoat(this.getStateRegistrationNumber());
    }
}
