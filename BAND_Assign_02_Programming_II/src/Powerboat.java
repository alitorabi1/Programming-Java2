/*
 * To manage ordering and requests for power boats
 * This class extends Boat
 */

/**
 *
 * @author Ali Torabi
 */
public class Powerboat extends Boat{

    public Powerboat() {
    }
    
    private String numberEngines;

    private String fuelType;

    /**
     * Get the value of fuelType
     *
     * @return the value of fuelType
     */
    public String getFuelType() {
        return fuelType;
    }

    /**
     * Set the value of fuelType
     *
     * @param fuelTyp new value of fuelType
     */
    public void setFuelType(String fuelTyp) {
        this.fuelType = fuelTyp;
    }

    /**
     * Get the value of numberEngines
     *
     * @return the value of numberEngines
     */
    public String getNumberEngines() {
        return numberEngines;
    }

    /**
     * Set the value of numberEngines
     *
     * @param numEngines new value of numberEngines
     */
    public void setNumberEngines(String numEngines) {
        this.numberEngines = numEngines;
    }

}
