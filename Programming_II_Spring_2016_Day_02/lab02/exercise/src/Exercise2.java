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
 *2. Write a GUI program that converts seconds to years, weeks, days, hours, and minutes. 
 * For this problem, assume 1 year is 365 days.

 * @author Ali Torabi
 */
public class Exercise2 extends JFrame{
    
    //named Constant will be use within the 
    //class Rectangle AppOne
    private static final int WIDTH=400;
    private static final int HEIGHT=300;
    private static final int WIDTH_X=300;
    private static final int HEIGHT_Y=300;
    private JLabel secondsL, yearsL, weeksL, daysL, hoursL, minutesL;
    private JTextField secondsTF, yearsTF, weeksTF, daysTF, hoursTF, minutesTF;
    private JButton calculateB,exitB;
    private CalculateButtonHandler cbHandler;
    private ExitButtonHandler ebHandler;
     
    public Exercise2(){
        //set title
        setTitle("converts seconds to years, weeks, days, hours, and minutes");
         
        //declare a refrence variable of the containor
        Container pane;
        //get the method getContentPane
        pane=getContentPane();
         
        pane.setLayout(new GridLayout(7,2));
        
        secondsL = new JLabel("Enter seconds:",SwingConstants.RIGHT);
        yearsL = new JLabel("years:",SwingConstants.RIGHT);
        weeksL = new JLabel("weeks:",SwingConstants.RIGHT);
        daysL = new JLabel("days:",SwingConstants.RIGHT);
        hoursL = new JLabel("hours:",SwingConstants.RIGHT);
        minutesL = new JLabel("minutes:",SwingConstants.RIGHT);
        //add label to the pane  container
          
        //initialazie textfield variable
        secondsTF = new JTextField(5);
        yearsTF = new JTextField(5);
        weeksTF = new JTextField(5);
        daysTF = new JTextField(5);
        hoursTF = new JTextField(5);
        minutesTF = new JTextField(5);

        yearsTF.setEditable(false);
        weeksTF.setEditable(false);
        daysTF.setEditable(false);
        hoursTF.setEditable(false);
        minutesTF.setEditable(false);
           
        //initialize button obj and set text for button two JButton
        calculateB=new JButton("Calculate");
        cbHandler=new CalculateButtonHandler();
        calculateB.addActionListener(cbHandler);
          
        exitB=new JButton("Exit");
        ebHandler=new ExitButtonHandler();
        exitB.addActionListener(ebHandler);
           
        pane.add(secondsL);
        pane.add(secondsTF);
        pane.add(yearsL);
        pane.add(yearsTF);
        pane.add(weeksL);
        pane.add(weeksTF);
        pane.add(daysL);
        pane.add(daysTF);
        pane.add(hoursL);
        pane.add(hoursTF);
        pane.add(minutesL);
        pane.add(minutesTF);
          
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
        Exercise2 exercise2 = new Exercise2();
    }
    /* create the class CalculateButtonHandler to handle the event generator 
    *by clockng button calculateB
    * CalculateButtonHandler class is created on the top of the interface ActionListener
    *
    */
    private class CalculateButtonHandler implements  ActionListener{
        public void actionPerformed(ActionEvent e){
            //create double variables
            double seconds, years, weeks, days, hours, minutes;
            //using the getText() from textfields object to retrive the string and 
            //then converted to double value
            
            seconds = Double.parseDouble(secondsTF.getText());
            
            //converts seconds to years, weeks, days, hours, and minutes
            years = seconds / 31536000;
            weeks = seconds / 604800;
            days = seconds / 86400;
            hours = seconds / 3600;
            minutes = seconds / 60;
            
            //setText() required the arg to be string
            //in this case we need to convert the value of the variable area to String
            yearsTF.setText(""+years);
            weeksTF.setText(""+weeks);
            daysTF.setText(""+days);
            hoursTF.setText(""+hours);
            minutesTF.setText(""+minutes);
        }
        
    }
    //create class
    private  class ExitButtonHandler implements ActionListener{
        public void actionPerformed(ActionEvent e){
            System.exit(0);
        }
    }
}//end class
