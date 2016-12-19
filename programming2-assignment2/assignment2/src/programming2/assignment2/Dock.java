/*
 * Contains all the characteristics and functionality of dock structures
 * holded by Bradshow Marina company
 */
package marina;

/**
 *
 * @author Nikolay Nikolov
 */
public class Dock {
    
    private String dockID;

    /**
     * Get the value of dockID
     *
     * @return the value of dockID
     */
    public String getDockID() {
        return dockID;
    }

    /**
     * Set the value of dockID
     *
     * @param dockID new value of dockID
     */
    public void setDockID(String dockID) {
        this.dockID = dockID;
    }

    private boolean electrified;

    /**
     * Get the value of electrified
     *
     * @return the value of electrified
     */
    public boolean isElectrified() {
        return electrified;
    }

    /**
     * Set the value of electrified
     *
     * @param electricity new value of electrified
     */
    public void setElectrified(boolean electricity) {
        this.electrified = electricity;
    }

    private boolean waterSuplied;

    /**
     * Get the value of waterSuplied
     *
     * @return the value of waterSuplied
     */
    public boolean isWaterSuplied() {
        return waterSuplied;
    }

    /**
     * Set the value of waterSuplied
     *
     * @param waterSuplied new value of waterSuplied
     */
    public void setWaterSuplied(boolean waterSuplied) {
        this.waterSuplied = waterSuplied;
    }

    private String schema;

    /**
     * Get the value of schema
     *
     * @return the value of schema
     */
    public String getSchema() {
        return schema;
    }

    /**
     * Set the value of schema
     *
     * @param schema new value of schema
     */
    public void setSchema(String schema) {
        this.schema = schema;
    }
    
    public void addSlipToDock(String SlipID){
        
    }
    
    public void removeSlipToDock(String SlipID){
        
    }
}
