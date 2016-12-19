/*
 * To manage ordering and requests for sail boats
 * This class extends Boat
 */

/**
 *
 * @author Ali Torabi
 */
public class Sailboat extends Boat{

    public Sailboat() {
    }
    
    private String keelDepth;

    private String numberSails;

    private String motorType;

    /**
     * Get the value of motorType
     *
     * @return the value of motorType
     */
    public String getMotorType() {
        return motorType;
    }

    /**
     * Set the value of motorType
     *
     * @param motoType new value of motorType
     */
    public void setMotorType(String motoType) {
        this.motorType = motoType;
    }

    /**
     * Get the value of numberSails
     *
     * @return the value of numberSails
     */
    public String getNumberSails() {
        return numberSails;
    }

    /**
     * Set the value of numberSails
     *
     * @param numSails new value of numberSails
     */
    public void setNumberSails(String numSails) {
        this.numberSails = numSails;
    }

    /**
     * Get the value of keelDepth
     *
     * @return the value of keelDepth
     */
    public String getKeelDepth() {
        return keelDepth;
    }

    /**
     * Set the value of keelDepth
     *
     * @param kDepth new value of keelDepth
     */
    public void setKeelDepth(String kDepth) {
        this.keelDepth = kDepth;
    }

}
