/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programming2.assignment2;

/**
 *
 * @author Domenic Palucci
 */


public class Customer {
    private int customerID;
    private String fName;
    private String lName;
    private String email;
    private String phoneNo;   
    private Address add;

    public Customer(int customerID, String fName, String lName, String email, String phoneNo, Address add) {
        this.customerID = customerID;
        this.fName = fName;
        this.lName = lName;
        this.email = email;
        this.phoneNo = phoneNo;
        this.add = add;
    }

    Customer() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getCustomerID() {
        return customerID;
    }

    public Address getAdd() {
        return add;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public void setAdd(Address add) {
        this.add = add;
    }

    /**
     * @return the first Name
     */
    
    

    public String getfName() {
        return fName;
    }

    /**
     * @param name the fName to set
     */
    public void setfName(String thefName) {
        this.fName = thefName;
    }

       /**
     * @return the last Name
     */
    public String getlName() {
        return lName;
    }

    /**
     * @param lName the lName to set
     */
    public void setlName(String lName) {
        this.lName = lName;
    } 
     
    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String theEmail) {
        this.email = theEmail;
    }

    /**
     * @return the phoneNo
     */
    public String getPhoneNo() {
        return phoneNo;
    }

    /**
     * @param phoneNo the phoneNo to set
     */
    public void setPhoneNo(String thePhoneNo) {
        this.phoneNo = thePhoneNo;
    }
    
    
    //start of main method
   // end of main method

    @Override
    public String toString() {
        String str=String.format("%d\t%s\t%s\t%s\t%s\t", customerID,fName,lName,phoneNo,email);
        String str1=this.add.toString();
        return str+str1; //
    }
    
}// end of Customer class