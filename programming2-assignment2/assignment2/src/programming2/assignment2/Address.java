/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programming2.assignment2;

/**
 *
 * @author 
 */
public class Address {
    
    private String stAddress;
    private String city;
    private String province;
    private String postalCode;
    private String country;

    
   
    public Address(String stAddress, String city, String province, String postalCode, String country) {
        this.stAddress = stAddress;
        this.city = city;
        this.province = province;
        this.postalCode = postalCode;
        this.country = country;
    }
 public String getStAddress() {
        return stAddress;
    }

    /**
     * @param stAddress the stAddress to set
     */
    public void setStAddress(String stAddress) {
        this.stAddress = stAddress;
    }

    /**
     * @return the city
     */
    public String getCity() {
        return city;
    }

    /**
     * @param city the city to set
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * @return the province
     */
    public String getProvince() {
        return province;
    }

    /**
     * @param province the province to set
     */
    public void setProvince(String province) {
        this.province = province;
    }

    /**
     * @return the postalCode
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * @param postalCode the postalCode to set
     */
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    /**
     * @return the country
     */
    public String getCountry() {
        return country;
    }

    /**
     * @param country the country to set
     */
    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return  String.format("%s\t%s\t%s\t%s\t%s\t", stAddress ,city  , province ,postalCode, country );
    }
    
    
}//end class Address
