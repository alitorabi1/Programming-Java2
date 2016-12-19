/*
 * Additional program that input two numbers
* and displays their sum
 */
package addition;

/*import java extension package or class*/
import javax.swing.JOptionPane;


/**
 *
 * @author Ali Torabi
 */
public class AdditionApp {
    
    public static void main(String[] args) {
        /* 1) Declaration phase */
        String firstNumber; // the first string  entered by user
        String secondNumber; // the second string  entered by user
        double number1; // first converted number toadd
        double number2; // second converted number toadd
        double sum; // sum of number1 and number2
        /* 2) initialisation phase */
        // read first number from user as string
        firstNumber = JOptionPane.showInputDialog("Enter first number");
        // read second number from user as string
        secondNumber = JOptionPane.showInputDialog("Enter second number");
        /* 3) Processing phase */
        //convert numbers from String to double
        number1 = Double.parseDouble(firstNumber);
        number2 = Double.parseDouble(secondNumber);
        // adding numbers
        sum = number1 + number2;
        /* 4) Termination (output) phase */
        JOptionPane.showMessageDialog(null, "The sum is: " + sum, "Addition result", JOptionPane.INFORMATION_MESSAGE);
// Terminate application
        System.exit(0);
    } // end main method
} // end class AdditionApp
