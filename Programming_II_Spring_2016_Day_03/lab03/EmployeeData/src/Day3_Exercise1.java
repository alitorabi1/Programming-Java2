
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
The numbers in the first line represent the length and width, respectively, of a rectangle. 
The number in the second line represents the radius of a circle. 
The third line contains the first name, last name, and the age of a person. 
The first number in the fourth line is the savings account balance at the beginning of the month 
and the second number is the interest rate per year. 
(Assume that p ¼ 3.1416.) 
The fifth line contains an uppercase letter between A and Y (inclusive). 
Write statements so that after the program executes, the contents of the file outData.txt 
are as shown below. If necessary, declare additional variables. 
Your statements should be general enough so that if the content of the input file changes 
and the program is run again (without editing and recompiling), it outputs the appropriate results.
 */

/**
 *
 * @author Ali Torabi
 */
public class Day3_Exercise1 {
    //main method
    public static void main(String[] args) throws FileNotFoundException{
        // Create and associate the scanner to the input source
        String filePath = new File("").getAbsolutePath();
        Scanner inFile;
        try {
            inFile = new Scanner(new FileReader(filePath + "\\src\\EmpData\\inData.txt"));
        
            // the output read to be stored in the file employeeOutData.txt
            PrintWriter outFile = new PrintWriter("src/EmpData/outData.txt");

            // The numbers in the first line represent the length and width, respectively, of a rectangle. 
            double length, width; // variable to store length and width
            // The number in the second line represents the radius of a circle. 
            double radius, cArea, circumference; // variable to store length and width
            final double PI = 3.1416;
            // The third line contains the first name, last name, and the age of a person. 
            String firstName; // variable to store First Name
            String lastName; // variable to store Last Name
            int age;
            // The first number in the fourth line is the savings account balance at the beginning of the month 
            double balanceAtFirstDayOfMonth, finalBalance; // variable to store savings account balance at the beginning of the month
            // the second number is the interest rate per year. 
            double interestRate; // variable to interest rate
            // The fifth line contains an uppercase letter between A and Y (inclusive). 
            String letter;
            double area, perimeter;

            length = inFile.nextDouble(); // get the hoursWorked
            width = inFile.nextDouble(); // get the payRate
            radius = inFile.nextDouble(); // get the hoursWorked
            firstName = inFile.next(); // get the firstName
            lastName = inFile.next(); // get the lastName
            age = inFile.nextInt(); // get the age
            balanceAtFirstDayOfMonth = inFile.nextDouble(); // get the payRate
            interestRate = inFile.nextDouble(); // get the payRate
            letter = inFile.next(); // get the payRate
            
            area = length * width;
            perimeter = 2 * (length + width);

            cArea = PI * Math.pow(radius, 2);
            circumference = 2 * PI * radius;
            
            finalBalance = balanceAtFirstDayOfMonth + (balanceAtFirstDayOfMonth * interestRate / 100 /12); // calculate the wages

            int charValue = letter.charAt(0);
            String nextLetter = String.valueOf( (char) (charValue + 1));
//Rectangle:
//Length = 10.20, width = 5.35, area = 54.57, parameter = 31.10
            outFile.println("Rectangle:");
            outFile.printf("Length = %.2f, width = %.2f, area = %.2f, perimeter = %.2f", length, width, area, perimeter);
            outFile.println();
//Circle:
//Radius = 15.60, area = 764.54, circumference = 98.02
            outFile.printf("Radius = %.2f, area = %.2f, circumference = %.2f" , radius, cArea, circumference);
            outFile.println();
//Name: Randy Gill, age: 31
//Beginning balance = $18500.00, interest rate = 3.50
//Balance at the end of the month = $18553.96
            outFile.println("Name: " + firstName + " " + lastName + ", age: " + age);
            outFile.printf("Beginning balance = $%.2f, interest rate = %.2f%n", balanceAtFirstDayOfMonth, interestRate);
            outFile.printf("Balance at the end of the month = $%.2f%n", finalBalance);
//The character that comes after A in the ASCII set is B
            outFile.println("The character that comes after " + letter + " in the ASCII set is " + nextLetter);
            
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
