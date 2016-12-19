package alitorabi_assign_01_programming_ii;

// This class uses these imported classes
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * class: TempConversion.java
 * This program shows a GUI that is used to convert the temperature from Fahrenheit to Celsius and from Celsius to Fahrenheit.
 * When the user enters the temperature in the text field adjacent to the label Temp in Celsius: and presses the Enter key, 
 * the program displays the equivalent temperature in the text field adjacent to the label Temp in Fahrenheit: Similarly, 
 * when the user enters the temperature in Fahrenheit and presses the Enter key, the program displays the equivalent temperature in Celsius.
 * state information includes:
 * <ul>The inputs:
 * <li>Temperature in Fahrenheit or
 * <li>Temperature in Celsius
 * <ul>The output:
 * <li>Temperature in Celsius if the input is Fahrenheit
 * <li>Temperature in Fahrenheit if the input is Celsius
 *
 * @author      Ali Torabi
 * @version     1.0
 * @since	2 May 2016
 */
public class TempConversion extends JFrame{
    // named data members within the class TempConversion
    private static final int WIDTH = 500;
    private static final int HEIGHT = 70;
    private JLabel celsiusL, fahrenheitL;
    private JTextField celsiusTF, fahrenheitTF;
    private CelsHandler cHandler;
    private FahrHandler fHandler;
    private final double THIRTY_TWO = 32;
    private final double NINE_ON_FIVE = 9.0/5.0;
    private final double FIVE_ON_NINE = 5.0/9.0;
    private double celsius, fahrenheit;

    /**
     * constructor with parameters
     */
    public TempConversion(){
        //set title
        setTitle("Temperature Conversion");
         
        //declare a refrence variable of the containor
        Container pane;
        //get the method getContentPane
        pane=getContentPane();
        
        //defining the grid layout
        pane.setLayout(new GridLayout(1,4));
        
        //initialazie label variables
        celsiusL = new JLabel("Celsius:",SwingConstants.RIGHT);
        fahrenheitL = new JLabel("Fahrenheit:",SwingConstants.RIGHT);
          
        //initialazie textfield variables
        celsiusTF = new JTextField(5);
        fahrenheitTF = new JTextField(5);
           
        //initialize handlers and action listeners
        cHandler=new CelsHandler();
        celsiusTF.addActionListener(cHandler);
        fHandler=new FahrHandler();
        fahrenheitTF.addActionListener(fHandler);
           
        //adding labels and textfields to the container
        pane.add(celsiusL);
        pane.add(celsiusTF);
        pane.add(fahrenheitL);
        pane.add(fahrenheitTF);
    } // end of constractor

    /**
    * create the class CelsHandler to handle the event generator 
    * by pressing enter key
    * CelsHandler class is created on the top of the interface ActionListener
    *
    */
    private class CelsHandler implements  ActionListener{
        public void actionPerformed(ActionEvent e){
            //using the getText() from textfields object to retrive the string and 
            //then assign it to celsius
            celsius = Double.parseDouble(celsiusTF.getText());

            // Calculate the temperature in fahrenheit
            fahrenheit = NINE_ON_FIVE * celsius + THIRTY_TWO;
            
            //setText()
            fahrenheitTF.setText(String.format("%.2f", fahrenheit));
        } // end actionPerformed
    }// end class CelsHandler

    /**
    * create the class FahrHandler to handle the event generator 
    * by pressing enter key
    * FahrHandler class is created on the top of the interface ActionListener
    *
    */
    private class FahrHandler implements  ActionListener{
        public void actionPerformed(ActionEvent e){
            //using the getText() from textfields object to retrive the string and 
            //then assign it to fahrenheit
            fahrenheit = Double.parseDouble(fahrenheitTF.getText());

            // Calculate the temperature in celsius
            celsius = FIVE_ON_NINE * (fahrenheit - THIRTY_TWO);
            
            //setText()
            celsiusTF.setText(String.format("%.2f", celsius));
        } // end actionPerformed
    }// end class FahrHandler

    /**
     * main method begins execution of class TempConversion
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TempConversion tempConversion = new TempConversion();
        tempConversion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tempConversion.setSize(WIDTH,HEIGHT);
        tempConversion.setVisible(true);
    }// end method main
}//end class TempConversion
