/*
 * To handle and management Boats.
 * Because a boat must be either a sailboat or a powerboat, 
 * the Boat class is an abstract class (shown in italics), 
 * meaning it is only used for inheritance.
 */

/**
 *
 * @author Ali Torabi
 */
public abstract class Boat {

    public Boat() {}
    
    private String stateRegistrationNumber;

    private String length;

    private String manufacture;

    private String year;

    private String customer;

    /**
     * Get the value of customer
     *
     * @return the value of customer
     */
    public String getCustomer() {
        return customer;
    }

    /**
     * Set the value of customer
     *
     * @param theCustomer new value of customer
     */
    public void setCustomer(String theCustomer) {
        this.customer = theCustomer;
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
     * Assign boat(s) to customer
     */
    public void assignBoatToCustomer() {
        // Todo codes
        
        
    }
}
