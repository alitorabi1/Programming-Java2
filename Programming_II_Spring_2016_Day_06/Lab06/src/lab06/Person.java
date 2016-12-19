/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab06;

/**
 *
 * @author student
 */
public class Person {

    public String firstName;
    public String lastName;

    /**
     * default constructor
     *  to initialize the firstName and the lastName to an empty String
     */
    public Person(){
        firstName = "";
        lastName = "";
    }
    /**
     * constructor with parameters
     * set firstName and lastName according to the parameters
     * @param fName the firstName to set
     * @param lName the lastName to set
     * 
     */
    public Person(String fName, String lName){
//        this.firstName = fName;
//        this.lastName = lName;
        setName(fName, lName);
    } // end parameterized constructor
    
    @Override
    public String toString(){
        return (firstName + " " + lastName);
    }
    
    /**
     * Method to set the firstName and lastName according to
     * the parameters
     * postcondition: firstName = fName and lastName = lName
    */
    public void setName(String fName, String lName){
        this.setFirstName(fName);
        this.setLastName(lName);
    } // end setName

    public String getFirstName(){
        return firstName;
    } // end getFirstName

    public String getLastName(){
        return lastName;
    } // end getLastName

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    } // end setFirstName

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    } // end setLastName
    
}
