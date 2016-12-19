package programming2.assignment2;
import java.io.FileWriter;
import java.io.IOException;

import java.util.logging.*;

import javax.swing.JOptionPane;

/*
 * To manage ordering and requests for sail boats
 * This class extends Boat
 */

/**
 * @Authors:
 *  Ali Torabi,Behnaz Akbariafshar,  ,Nikolay Nikolov,
 * Nathalie Desrosiers, Domenic Palucci
 */

public class Sailboat extends Boat{

    public Sailboat() {
    }
    
    public Sailboat(String stateRegNo, String length, String manufacture, String year, int customerID) {
        super(stateRegNo, length, manufacture, year, customerID);
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

    public void addSailboat(){
      try {
          // the output read to be stored in the file addboat.txt
          FileWriter outFile = new FileWriter("addboat.txt", true);

          // configure the logger with handler
          fileHandler = new FileHandler("src/marina.log");
          log.addHandler(fileHandler);
          log.setLevel(Level.ALL);
          
          outFile.write(super.getcustomerID() + " "); // customerID
          outFile.write(super.getStateRegistrationNumber() + " "); // stateRegNo
          outFile.write(super.getManufacture() + " "); // manufacture
          outFile.write(super.getYear() + " "); // year
          outFile.write(super.getLength() + " "); // length
          
          outFile.write("SailBoat: ");
          outFile.write(getNumberSails() + " "); // numberOfSails
          outFile.write(getKeelDepth() + " "); //keelDepth
          
          outFile.write("Motor Type: ");
          outFile.write(getMotorType()); // Motor Type
          outFile.write("\r\n");

          outFile.close();
          JOptionPane.showMessageDialog(null, "A sailboat assigned to customerID: " + super.getcustomerID(), "Adding boat message", JOptionPane.INFORMATION_MESSAGE);
      } catch (IOException ex) {
          JOptionPane.showMessageDialog(null, "File not found!");
    	  log.log(Level.WARNING, "An exception is occured in class Sailboat: ", ex.getMessage());
      }
  }  
}
