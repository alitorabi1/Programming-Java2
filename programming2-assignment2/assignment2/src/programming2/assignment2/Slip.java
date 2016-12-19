
package programming2.assignment2;

/**
 * @Authors:
 *  Nikolay Nikolov,Behnaz Akbariafshar, Ali Torabi ,
 * Nathalie Desrosiers, Domenic Palucci
 */

/*
 * Contains all the characteristics and functionality of slip places
 * holded by  Marina company
 */



public class Slip {
    private String slipID;
    private String dockID;
    private String leaseID;
    private double width;
    private double lenght;
    private double depth;
    private boolean electrified;
    private boolean waterSuplied;
    private double dailyPrice;
    private double annualPrice;

    public void leaseSlip(){
        
    }
    public String getSlipID() {
        return slipID;
    }

    public void setSlipID(String slipID) {
        this.slipID = slipID;
    }

    public String getDockID() {
        return dockID;
    }

    public void setDockID(String dockID) {
        this.dockID = dockID;
    }

    public String getLeaseID() {
        return leaseID;
    }

    public void setLeaseID(String leaseID) {
        this.leaseID = leaseID;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLenght() {
        return lenght;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }

    public double getDepth() {
        return depth;
    }

    public void setDepth(double depth) {
        this.depth = depth;
    }

    public boolean isElectrified() {
        return electrified;
    }

    public void setElectrified(boolean electrified) {
        this.electrified = electrified;
    }

    public boolean isWaterSuplied() {
        return waterSuplied;
    }

    public void setWaterSuplied(boolean waterSuplied) {
        this.waterSuplied = waterSuplied;
    }

    public double getDalyPrice() {
        return dailyPrice;
    }

    public void setDalyPrice(double dalyPrice) {
        this.dailyPrice = dalyPrice;
    }

    public double getAnnualPrice() {
        return annualPrice;
    }

    public void setAnnualPrice(double annualPrice) {
        this.annualPrice = annualPrice;
    }
    
}
