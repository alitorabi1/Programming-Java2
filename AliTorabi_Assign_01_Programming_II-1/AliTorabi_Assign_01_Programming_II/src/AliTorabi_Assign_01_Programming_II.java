
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ali Torabi
 */
public class AliTorabi_Assign_01_Programming_II extends JFrame{

    private static final int WIDTH=400;
    private static final int HEIGHT=300;
    private static final int WIDTH_X=300;
    private static final int HEIGHT_Y=300;
    private JLabel nameL, messageL;
    private JTextField nameTF, messageTF;
    private JButton showMessageB,exitB;
    private showMessageButtonHandler cbHandler;
    private ExitButtonHandler ebHandler;

    public AliTorabi_Assign_01_Programming_II(){
         //set title
         setTitle("Greeting Message");
         
         //declare a refrence variable of the containor
         Container pane;
         //get the method getContentPane
         pane=getContentPane();
         
         pane.setLayout(new GridLayout(3,2));
         
        nameL = new JLabel("Please enter your name: ",SwingConstants.RIGHT);
        messageL = new JLabel("Greeting message is: ",SwingConstants.RIGHT);
        //add label to the pane  container
          
        //initialazie textfield variable
        nameTF = new JTextField(5);
        messageTF = new JTextField(5);
        messageTF.setEditable(false);
           
        //initialize button obj and set text for button two JButton
        showMessageB=new JButton("Message");
        cbHandler=new showMessageButtonHandler();
        showMessageB.addActionListener(cbHandler);
          
        exitB=new JButton("Exit");
        ebHandler=new ExitButtonHandler();
        exitB.addActionListener(ebHandler);
           
        pane.add(nameL);
        pane.add(nameTF);
        pane.add(messageL);
        pane.add(messageTF);
          
        pane.add(showMessageB);
        pane.add(exitB);

        //declare ActionListenerObject
        setSize(WIDTH,HEIGHT);
        setLocation(WIDTH_X, HEIGHT_Y);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
     }//end constractor
    // main method
    public static void main(String[] args){
//        System.out.println("Please enter your name: ");
//        name = input.nextLine();
        
        AliTorabi_Assign_01_Programming_II aliTorabi_Assign_01_Programming_II = new AliTorabi_Assign_01_Programming_II();
        //processing phase
    }
    private class showMessageButtonHandler implements  ActionListener{
        public void actionPerformed(ActionEvent e){
            //add code for calculating the area and perimeter
            
            //create double variables
            int hour;
            String name = "";
            String message = "";
            //using the getText() from textfields object to retrive the string and 
            //then converted to double value

            // 
            Calendar cal = Calendar.getInstance();
            /* from the calendar instance you can extract 
                year, month, day, hour, ...
            */
            hour = cal.get(Calendar.HOUR_OF_DAY);

            // determine whether it is morning
            if(hour < 12) {
                message = "Good Morning ";
            }
            if(hour >= 12){
                hour = hour - 12;
                if(hour < 6)
                    message = "Good afternoon ";
                if(hour >= 6)
                    message = "Good evening ";
            }
            
            celsius = (5.0 / 9.0) * (fahrenheit – 32);
            
            name = nameTF.getText();
            
            //showMessage
            message = message.concat(name);
            
            //setText() required the arg to be string
            //in this case we need to convert the value of the variable area to String
            messageTF.setBackground(Color.green);
            messageTF.setForeground(Color.red);
            messageTF.setText(" "+message);
        }
        
    }
    //create class
    private  class ExitButtonHandler implements ActionListener{
        public void actionPerformed(ActionEvent e){
            System.exit(0);
        }
    }
    
} //end class GreetingsApp
