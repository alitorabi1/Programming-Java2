import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *3. Design and implement a GUI program to compare two strings and display the larger one.
 * @author Ali Torabi
 */
public class Exercise3 extends JFrame{
    
    //named Constant will be use within the 
    //class Rectangle AppOne
    private static final int WIDTH=400;
    private static final int HEIGHT=300;
    private static final int WIDTH_X=300;
    private static final int HEIGHT_Y=300;
    private JLabel string1L, string2L, resultL;
    private JTextField string1TF, string2TF, resultTF;
    private JButton calculateB,exitB;
    private CalculateButtonHandler cbHandler;
    private ExitButtonHandler ebHandler;
     
    public Exercise3(){
        //set title
        setTitle("comparing two strings");
         
        //declare a refrence variable of the containor
        Container pane;
        //get the method getContentPane
        pane=getContentPane();
         
        pane.setLayout(new GridLayout(4,2));
        
        string1L = new JLabel("Enter first string:",SwingConstants.RIGHT);
        string2L = new JLabel("Enter first string:",SwingConstants.RIGHT);
        resultL = new JLabel("The large one is:",SwingConstants.RIGHT);
          
        //initialazie textfield variable
        string1TF = new JTextField(5);
        string2TF = new JTextField(5);
        resultTF = new JTextField(5);

        resultTF.setEditable(false);
           
        //initialize button obj and set text for button two JButton
        calculateB=new JButton("Calculate");
        cbHandler=new CalculateButtonHandler();
        calculateB.addActionListener(cbHandler);
          
        exitB=new JButton("Exit");
        ebHandler=new ExitButtonHandler();
        exitB.addActionListener(ebHandler);
           
        pane.add(string1L);
        pane.add(string1TF);
        pane.add(string2L);
        pane.add(string2TF);
        pane.add(resultL);
        pane.add(resultTF);
          
        pane.add(calculateB);
        pane.add(exitB);

        //declare ActionListenerObject
        setSize(WIDTH,HEIGHT);
        setLocation(WIDTH_X, HEIGHT_Y);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
     }//end constractor

    //main method
    public static void main(String[] args){
        Exercise3 exercise3 = new Exercise3();
    }
    /* create the class CalculateButtonHandler to handle the event generator 
    *by clockng button calculateB
    * CalculateButtonHandler class is created on the top of the interface ActionListener
    *
    */
    private class CalculateButtonHandler implements  ActionListener{
        public void actionPerformed(ActionEvent e){
            //using the getText() from textfields object to retrive the string and 
            //then assign the larger string it to a variable
            String result;
            
            result = (string1TF.getText().length() > string2TF.getText().length()) ? string1TF.getText(): string2TF.getText();
            
            //setText() required the arg to be string
            //in this case we need to convert the value of the variable area to String
            resultTF.setText(""+result);
        }
        
    }
    //create class
    private  class ExitButtonHandler implements ActionListener{
        public void actionPerformed(ActionEvent e){
            System.exit(0);
        }
    }
}//end class
