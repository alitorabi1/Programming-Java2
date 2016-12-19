/*
 * Additional program that input Height and width
* and displays the perimeter
 */
package addition;

/*import java extension package or class*/
import javax.swing.JOptionPane;


/**
 *
 * @author Ali Torabi
 */
public class AdditionApp2 {
    
    private static double getArea(double height, double width) {
        return (height * width);
    }
    // calculate perimeter
    private static double getPerimeter(double height, double width) {
        return 2 * (height + width);
    }
    
    public static void main(String[] args) {
        /* 1) Declaration phase */
        String heightStr; // the first string  entered by user
        String widthStr; // the second string  entered by user
        double height; // first converted number toadd
        double width; // second converted number toadd
        double perimeter; // perimeter of heightStr and widthStr
        double area; // perimeter of heightStr and widthStr
        /* 2) initialisation phase */
        // read first number from user as string
        heightStr = JOptionPane.showInputDialog("Enter height");
        // read second number from user as string
        widthStr = JOptionPane.showInputDialog("Enter width");
        /* 3) Processing phase */
        //convert numbers from String to double
        height = Double.parseDouble(heightStr);
        width = Double.parseDouble(widthStr);
        // calculate Area
        
        /* 4) Termination (output) phase */
        JOptionPane.showMessageDialog(null, "The perimeter is: " + getPerimeter(height, width), "Perimeter result", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "The Area is: " + getArea(height, width), "Perimeter result", JOptionPane.INFORMATION_MESSAGE);
// Terminate application
        System.exit(0);
    } // end main method
} // end class AdditionApp
