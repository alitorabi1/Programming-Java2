
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
6. Write a program that calculates and prints the monthly paycheck for an employee. 
The net pay is calculated after taking the following deductions:

Federal Income Tax: 	15%
State Tax: 		3.5%
Social Security Tax: 	5.75%
Medicare/Medicaid Tax: 	2.75%
Pension Plan: 		5%
Health Insurance: 	$75.00

Your program should prompt the user to input the gross amount and the employee name. 
The output will be stored in a file. Format your output to have two decimal places. 
A sample output follows:

Bill Robinson
Gross Amount: 		$ 3575.00
Federal Tax: 		$ 536.25
State Tax: 		$ 125.13
Social Security Tax: 	$ 205.56
Medicare/Medicaid Tax: 	$ 98.31
Pension Plan: 		$ 178.75
Health Insurance: 	$ 75.00
Net Pay: 		$ 2356.00
 */

/**
 *
 * @author Ali Torabi
 */
public class Day3_Exercise2 {
    //main method
    public static void main(String[] args) throws FileNotFoundException{
        // Create and associate the scanner to the input source
        final double insurance = 75.00;
        double fTax, sTax, ssTax, mTax, pPlan, deductions;
        double cfTax, csTax, cssTax, cmTax, cpPlan, gAmount, netPay;
        String firstName; // variable to store First Name
        String lastName; // variable to store Last Name

        String filePath = new File("").getAbsolutePath();
        Scanner inFile;
        try {
            inFile = new Scanner(new FileReader(filePath + "\\src\\EmpData\\inData2.txt"));
        
            // the output read to be stored in the file employeeOutData.txt
            PrintWriter outFile = new PrintWriter("src/EmpData/outData2.txt");

            firstName = inFile.next(); // get the firstName
            lastName = inFile.next(); // get the lastName
            gAmount = inFile.nextDouble(); // get the hoursWorked
            fTax = inFile.nextDouble(); // get the hoursWorked
            sTax = inFile.nextDouble(); // get the hoursWorked
            ssTax = inFile.nextDouble(); // get the hoursWorked
            mTax = inFile.nextDouble(); // get the hoursWorked
            pPlan = inFile.nextDouble(); // get the hoursWorked
            
            cfTax = fTax * gAmount;
            csTax = sTax * gAmount;
            cssTax = ssTax * gAmount;
            cmTax = mTax * gAmount;
            cpPlan = pPlan * gAmount;
            deductions = (cfTax + csTax + cssTax + cmTax + cpPlan) / 100 + insurance;
            netPay = gAmount - deductions;
            
//Bill Robinson
//Gross Amount: 		$ 3575.00
//Federal Tax: 		$ 536.25
//State Tax: 		$ 125.13
//Social Security Tax: 	$ 205.56
//Medicare/Medicaid Tax: 	$ 98.31
//Pension Plan: 		$ 178.75
//Health Insurance: 	$ 75.00
//Net Pay: 		$ 2356.00
            outFile.println(firstName + " " + lastName);
            outFile.printf("Gross Amount: \t\t$%.2f%n", gAmount);
            outFile.printf("Federal Tax: \t\t$%.2f%n", fTax);
            outFile.printf("State Tax: \t\t$%.2f%n", sTax);
            outFile.printf("Social Security Tax: \t\t$%.2f%n", ssTax);
            outFile.printf("Medicare/Medicaid Tax: \t\t$%.2f%n", mTax);
            outFile.printf("Pension Plan: \t\t$%.2f%n", pPlan);
            outFile.printf("Health Insurance: \t\t$%.2f%n", insurance);
            outFile.printf("Net Pay: \t\t$%.2f%n", netPay);
            
            // Close the input and the output files
            inFile.close();
            outFile.close();
            System.out.println("Data writes successfully in file.");
        } catch (FileNotFoundException ex) {
            // do something with the ex or handle this case
            System.out.println("File not found, check file location");
        } catch (StringIndexOutOfBoundsException ob) {
            // do something with the ex or handle this case
            System.out.println("File not found, check file location");
        }
        // output the data
    } // end main method
    
} // end class EmployeeDataApp
