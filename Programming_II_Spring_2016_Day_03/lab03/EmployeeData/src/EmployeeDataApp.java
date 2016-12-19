
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * Suppose an input file, say employeeData.txt, consists
 * of the following data:
 *          John Smith 45 15.50
 * The file consists of an employee's name, the number of 
 * hours the employee worked and pay rate.
 * Read and store the data into file employeeOutData.txt.
 */

/**
 *
 * @author Ali Torabi
 */
public class EmployeeDataApp {
    //main method
    public static void main(String[] args) throws FileNotFoundException{
        // Create and associate the scanner to the input source
        String filePath = new File("").getAbsolutePath();
        Scanner inFile;
        try {
            inFile = new Scanner(new FileReader(filePath + "\\src\\EmpData\\employeeData.txt"));
        
            // the output read to be stored in the file employeeOutData.txt
            PrintWriter outFile = new PrintWriter("src/EmpData/employeeOutData.txt");

            String firstName; // variable to store First Name
            String lastName; // variable to store Last Name
            double hoursWorked; // variable to store hours Worked
            double payRate; // variable to store pay rate
            double wages; // variable to store wages

            firstName = inFile.next(); // get the firstName
            lastName = inFile.next(); // get the lastName
            hoursWorked = inFile.nextDouble(); // get the hoursWorked
            payRate = inFile.nextDouble(); // get the payRate

            wages = hoursWorked * payRate; // calculate the wages
            outFile.println("Employee Name: " + firstName + " " + lastName);
            outFile.println("Hours worked: " + hoursWorked);
            outFile.println("Pay rate: " + payRate);
            outFile.println("Employee wages: " + wages);

            // Close the input and the output files
            inFile.close();
            outFile.close();
            System.out.println("Data writes successfully in file.");
        } catch (FileNotFoundException ex) {
            // do something with the ex or handle this case
            System.out.println("File not found, check file location");
        }
        // output the data
    } // end main method
    
public EmployeeDataApp() {
        
    }

} // end class EmployeeDataApp
