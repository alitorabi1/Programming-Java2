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
 *1. Design a GUI program to find the weighted average of four test scores. The four test scores and their respective weights are given in the following format:
testscore1 weight1
...
For example, the sample data is as follows:
75 	0.20
95 	0.35
85 	0.15
65 	0.30

The user is supposed to enter the data and press a Calculate button. The program must display the weighted average.

 * @author Ali Torabi
 */
public class Exercise1  extends JFrame{
    
    //named Constant will be use within the 
    //class Rectangle AppOne
    private static final int WIDTH=400;
    private static final int HEIGHT=300;
    private static final int WIDTH_X=300;
    private static final int HEIGHT_Y=300;
    private JLabel grade1L, grade2L, grade3L, grade4L, wAverageL, percentageL;
    private JTextField grade1TF, grade2TF, grade3TF, grade4TF, weight1TF, weight2TF, weight3TF, weight4TF, wAverageTF;
    private JButton calculateB,exitB;
    private CalculateButtonHandler cbHandler;
    private ExitButtonHandler ebHandler;
     
    public Exercise1(){
         //set title
         setTitle("Calculate the weighted average of four test scores");
         
         //declare a refrence variable of the containor
         Container pane;
         //get the method getContentPane
         pane=getContentPane();
         
         pane.setLayout(new GridLayout(6,3));
         
        grade1L = new JLabel("Enter grade1:",SwingConstants.RIGHT);
        grade2L = new JLabel("Enter grade2:",SwingConstants.RIGHT);
        grade3L = new JLabel("Enter grade3:",SwingConstants.RIGHT);
        grade4L = new JLabel("Enter grade4:",SwingConstants.RIGHT);
        wAverageL = new JLabel("The weighted average:",SwingConstants.RIGHT);
        //add label to the pane  container
          
        //initialazie textfield variable
        grade1TF = new JTextField(5);
        grade2TF = new JTextField(5);
        grade3TF = new JTextField(5);
        grade4TF = new JTextField(5);

        weight1TF = new JTextField(5);
        weight2TF = new JTextField(5);
        weight3TF = new JTextField(5);
        weight4TF = new JTextField(5);
        wAverageTF = new JTextField(5);
        percentageL = new JLabel("Percent",SwingConstants.CENTER);
        wAverageTF.setEditable(false);
           
        //initialize button obj and set text for button two JButton
        calculateB=new JButton("Calculate");
        cbHandler=new CalculateButtonHandler();
        calculateB.addActionListener(cbHandler);
          
        exitB=new JButton("Exit");
        ebHandler=new ExitButtonHandler();
        exitB.addActionListener(ebHandler);
           
        pane.add(grade1L);
        pane.add(grade1TF);
        pane.add(weight1TF);
        pane.add(grade2L);
        pane.add(grade2TF);
        pane.add(weight2TF);
        pane.add(grade3L);
        pane.add(grade3TF);
        pane.add(weight3TF);
        pane.add(grade4L);
        pane.add(grade4TF);
        pane.add(weight4TF);
        pane.add(wAverageL);
        pane.add(wAverageTF);
        pane.add(percentageL);
          
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
        Exercise1 exercise1 = new Exercise1();
    }
    /* create the class CalculateButtonHandler to handle the event generator 
    *by clockng button calculateB
    * CalculateButtonHandler class is created on the top of the interface ActionListener
    *
    */
    private class CalculateButtonHandler implements  ActionListener{
        public void actionPerformed(ActionEvent e){
            //add code for calculating the area and perimeter
            
            //create double variables
            double grade1, grade2, grade3, grade4, weight1, weight2, weight3, weight4, wAverage;
            //using the getText() from textfields object to retrive the string and 
            //then converted to double value
            
            grade1 = Double.parseDouble(grade1TF.getText());
            grade2 = Double.parseDouble(grade2TF.getText());
            grade3 = Double.parseDouble(grade3TF.getText());
            grade4 = Double.parseDouble(grade4TF.getText());

            weight1 = Double.parseDouble(weight1TF.getText());
            weight2 = Double.parseDouble(weight2TF.getText());
            weight3 = Double.parseDouble(weight3TF.getText());
            weight4 = Double.parseDouble(weight4TF.getText());
            
            //calculate the weighted average
            wAverage = ((grade1 * weight1) + (grade2 * weight2) + (grade3 * weight3) + (grade4 * weight4)) / 100;
            
            //setText() required the arg to be string
            //in this case we need to convert the value of the variable area to String
            wAverageTF.setText(""+wAverage);
        }
        
    }
    //create class
    private  class ExitButtonHandler implements ActionListener{
        public void actionPerformed(ActionEvent e){
            System.exit(0);
        }
    }
}//end class
