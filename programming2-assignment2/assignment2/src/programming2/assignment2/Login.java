/*
 * 
 * this the login form that our application begins with this form  
 * Login form check username and password entered by user with existing information
 * in User.txt file if information is correct our main page will appear  else user can't use application if user try most than 4 times ,user must re Run the application
 */
package programming2.assignment2;

/**
 * @Authors:
 * Nikolay Nikolov,, Behnaz Akbariafshar, Ali Torabi
 * Nathalie Desrosiers, Domenic Palucci
 */

//import java packages
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import programming2.assignment2.MarinaMenager;
import javax.swing.JPasswordField;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import java.io.FileReader;

//create class Login
public class Login extends JFrame{
        //declare variables
	
	private JTextField txtUser;
	private JPasswordField passwordField;
	private static int tryToLogin=1;

	/**
	 * Launch the application.
	 */
        //start the main method
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}//end of catch exception
			}//end method run
		});
	}//end of main method

	/**
	 * Create the application.
	 */
	public Login() {
		initialize();
	}//end of constructor Login

	/**
	 * Initialize the contents of the this.
	 */
	private void initialize() {
		
		this.setBounds(100, 100, 374, 207);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().setLayout(null);
		
		JLabel lblUserName = new JLabel("User Name");
		lblUserName.setBounds(31, 60, 77, 24);
		this.getContentPane().add(lblUserName);
		
		txtUser = new JTextField();
		txtUser.setColumns(12);
		txtUser.setBounds(128, 60, 155, 24);
		this.getContentPane().add(txtUser);
		
		JLabel lblPass = new JLabel("Password");
		lblPass.setBounds(31, 95, 77, 24);
		this.getContentPane().add(lblPass);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(128, 95, 155, 20);
		this.getContentPane().add(passwordField);
		
		JLabel lblWelcomToMarinabradshaw = new JLabel("Welcom TO Shining Lake Marina lease Application");
		lblWelcomToMarinabradshaw.setForeground(Color.BLUE);
		lblWelcomToMarinabradshaw.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblWelcomToMarinabradshaw.setBounds(29, 11, 319, 34);
		this.getContentPane().add(lblWelcomToMarinabradshaw);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				boolean autorized=false; 
                                String user,pass;
				try{
					//open user.txt 
                                        String filePath=new File("").getAbsolutePath();                                   
            
			               
					Scanner sc = new Scanner(new FileReader(
                                                      filePath+"\\src\\programming2\\assignment2\\user.txt"));
					//while is not end of the file check user and password
					while (sc.hasNextLine() && tryToLogin<=4) {
                                               
                                               user=sc.next();
                                               pass=sc.next();                                             
                                               
						if(user.equals(txtUser.getText()) && pass.equals(passwordField.getText())){
                                                   
                                                      	autorized=true;//if find the user and password in the file  
                                                          break;
						}
							
						            
			                  }
			                     
                                        if (autorized){
					    setVisible(false);
					    MarinaMenager main=new MarinaMenager();
					    main.setVisible(true);
					    }
                                        else if(tryToLogin>4) {
                                            System.exit(0);//close login form if user entered wrong information most than four times
                                        }
                                        else{
                                            tryToLogin++;
                                             JOptionPane.showMessageDialog(null,"username or password is not correct please try again!" );
                                        }
				       
					
				}
				
				catch(Exception e){System.out.println(e.toString());}
				
				}
		});
		btnNewButton.setBounds(166, 135, 89, 23);
		this.getContentPane().add(btnNewButton);
	}//end of method initialize()
}//end of class Login
