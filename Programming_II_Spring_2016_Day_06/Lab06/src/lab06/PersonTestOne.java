/*
 * Testing class Person
 */
package lab06;

/**
 *
 * @author Ali Torabi
 */
public class PersonTestOne {
        /**
     * main method begins execution of class TempConversion
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create to instances of Person
        Person personObj1 = new Person();
        Person personObj2 = new Person("John", "Smith");
        System.out.println("The person name (personObj1) is: " + personObj1);
        System.out.println("The person name (personObj2) is: " + personObj2);
        
        // set the name to Ali Torabi
        personObj1.setName("Ali", "Torabi");
        System.out.println("The person name (personObj1) is: " + personObj1);
    }

}
