package programming2.assignment2;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;

import javax.swing.JOptionPane;



/*
 * To manage ordering and requests for power boats
 * This class extends Boat
 */

/**
 *
 * @author Behnaz-Domenic-Nathaly-Nikolay-Ali
 */
public class Powerboat extends Boat{

    public Powerboat() {
    }

    public Powerboat(String stateRegNo, String length, String manufacture, String year, int customerID) {
        super(stateRegNo, length, manufacture, year, customerID);
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

    public void addPowerboat(){
        try {
            // the output read to be stored in the file addboat.txt
            FileWriter outFile = new FileWriter("src\\programming2\\assignment2\\addboat.txt", true);

            // configure the logger with handler
            fileHandler = new FileHandler("src/marina.log");
            log.addHandler(fileHandler);
            log.setLevel(Level.ALL);
            
            outFile.write(super.getcustomerID() + " "); // customerID
            outFile.write(super.getStateRegistrationNumber() + " "); // stateRegNo
            outFile.write(super.getManufacture() + " "); // manufacture
            outFile.write(super.getYear() + " "); // year
            outFile.write(super.getLength() + " "); // length
            
            outFile.write(" "); // PowerBoat
            outFile.write(getNumberEngines() + " "); // numberOfEngines
            outFile.write(" "); // Fuel Type
            outFile.write(getFuelType()); // Fuel Type
            outFile.write("\r\n");

            outFile.close();
            JOptionPane.showMessageDialog(null, "A powerboat assigned to customerID: " + super.getcustomerID(), "Adding boat message", JOptionPane.INFORMATION_MESSAGE);
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "File not found!");
            log.log(Level.WARNING, "An exception is occured in class Powerboat: ", ex.getMessage());
        }
    }  
}
