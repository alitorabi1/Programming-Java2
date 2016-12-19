package programming2.assignment2;

/**
 * in this formClass user can add new customer
 * all fiels has a validator
 * if all information validate Customer add to Customerdata.txt file and the other form will opened for adding information
 * of customers's boat
	 */
/**
 * @Authors:
 *  Nathalie Desrosiers,Ali Torabi,Behnaz Akbariafshar  ,Nikolay Nikolov,
 * , Domenic Palucci
 */

/**
 * CustomerIDCreator.txt keeps last ID of Customer
 * CustomerData.txt  keeps our customers Information
 */
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class AddNewCustomer extends JFrame {

	
	private JTextField txtFirstName;
	private JTextField txtLastName;
	private JTextField txtPhoneNo;
	private JTextField txtEmail;
	private JTextField txtStreet;
	private JTextField txtPostalCode;
        private JTextField txtCity;
        private JTextField txtID;
        private String state;
        private Customer cust;
        private Icon check;
        private Icon mark ;
        private JLabel fValidatorL ;
         private JLabel lValidatorL ;//label to validate last name
         private JLabel pValidatorL ;//label to validate phone number
         private JLabel eValidatorL;//label to validate e-mail
         private JLabel sValidatorL ;//label to validate street
        private JLabel cValidatorL ;//label to validate city name
          private JLabel zValidatorL;

	/**
	 * Launch the application.
	 */
	
	/**
	 * Create the application.
	 */
	public AddNewCustomer() {
                super();
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
                String[] states = { "AL", "AK","AZ","AR","CA","CO","CT","DE","FL","GA","HI","ID","IL" };
                String[] province = { "AB", "BC" ,"MB","NB","NL","NT","NS","NU","ON","PE","QC","SK","YT"};
		
                
            fValidatorL = new JLabel("");    //label to validate first name
         lValidatorL = new JLabel("");//label to validate last name
        pValidatorL = new JLabel("");//label to validate phone number
         eValidatorL = new JLabel("");//label to validate e-mail
        sValidatorL = new JLabel("");//label to validate street
        cValidatorL = new JLabel("");//label to validate city name
         zValidatorL = new JLabel("");//label to validate postal code
                
               
                check = new ImageIcon(getClass().getResource("check.gif"));
                mark = new ImageIcon(getClass().getResource("redxmark.gif"));
               
                
                
            
		this.setTitle("Marina New Customer");
		this.setBounds(0, 0, 498, 502);
		//this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().setLayout(null);
		
		JLabel lblFirstName = new JLabel("First Name");
		lblFirstName.setBounds(10, 49, 77, 24);
		this.getContentPane().add(lblFirstName);
		
		txtFirstName = new JTextField();
		txtFirstName.setBounds(107, 49, 155, 24);
		this.getContentPane().add(txtFirstName);
		txtFirstName.setColumns(12);
		 JLabel fValidatorL = new JLabel("");
                 fValidatorL.setBounds(272, 49, 155, 24);
		this.getContentPane().add(fValidatorL);
                 
		JLabel lblLastName = new JLabel("Last Name");
		lblLastName.setBounds(10, 84, 77, 24);
		this.getContentPane().add(lblLastName);
		lValidatorL.setBounds(263, 84, 180, 24);
		this.getContentPane().add(lValidatorL);
                
		txtLastName = new JTextField();
		txtLastName.setColumns(12);
		txtLastName.setBounds(107, 84, 155, 24);
		this.getContentPane().add(txtLastName);
                
                
                
		
		JLabel lblPhoneNo = new JLabel("Phone No");
		lblPhoneNo.setBounds(10, 123, 77, 24);
		this.getContentPane().add(lblPhoneNo);
		
		txtPhoneNo = new JTextField();
		txtPhoneNo.setColumns(12);
		txtPhoneNo.setBounds(107, 123, 155, 24);
		this.getContentPane().add(txtPhoneNo);
                 pValidatorL.setBounds(263, 123, 180, 24);
		this.getContentPane().add(pValidatorL);
		
		JLabel lblEmailAddress = new JLabel("Email Address");
		lblEmailAddress.setBounds(10, 158, 98, 24);
		this.getContentPane().add(lblEmailAddress);
		
		txtEmail = new JTextField();
		txtEmail.setColumns(12);
		txtEmail.setBounds(107, 154, 155, 24);
		this.getContentPane().add(txtEmail);
                eValidatorL.setBounds(263,154, 180, 24);
		this.getContentPane().add(eValidatorL);
		
		JLabel lblAdd = new JLabel("Address");
		lblAdd.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblAdd.setBounds(10, 198, 111, 24);
		this.getContentPane().add(lblAdd);
		
		JLabel lblStreet = new JLabel("Street");
		lblStreet.setBounds(10, 224, 77, 24);
		this.getContentPane().add(lblStreet);
                sValidatorL.setBounds(308,198, 164, 24);
		this.getContentPane().add(sValidatorL);
		
		txtStreet = new JTextField();
		txtStreet.setColumns(12);
		txtStreet.setBounds(56, 224, 401, 24);
		this.getContentPane().add(txtStreet);
		
		JLabel lblCity = new JLabel("City");
		lblCity.setBounds(10, 271, 77, 24);
		this.getContentPane().add(lblCity);
                cValidatorL.setBounds(124,252, 104, 20);
		this.getContentPane().add(cValidatorL);
		
		txtCity = new JTextField();
		txtCity.setColumns(12);
		txtCity.setBounds(61, 271, 134, 24);
		this.getContentPane().add(txtCity);
                
                
                
		
		JLabel lblCountry = new JLabel("Country");
		lblCountry.setBounds(10, 320, 77, 24);
		this.getContentPane().add(lblCountry);
		
		
		JLabel lblProvince = new JLabel("Province");
		
		lblProvince.setBounds(10, 364, 77, 24);
		this.getContentPane().add(lblProvince);
		
		JComboBox cmbProvince = new JComboBox(province);
		cmbProvince.setVisible(true);
		cmbProvince.setBounds(97, 366, 111, 20);
                cmbProvince.setSelectedIndex(0);
                this.getContentPane().add(cmbProvince);
		
		
		JComboBox cmbStates = new JComboBox(states);
		cmbStates.setVisible(false);
                cmbStates.setSelectedIndex(0);
		cmbStates.setBounds(97, 366, 111, 20);
		this.getContentPane().add(cmbStates);
		
		
		String[] countryStr = { "Canada", "US" };
		
		 state=cmbStates.getSelectedItem().toString();
		JComboBox cmbCountry = new JComboBox(countryStr);
                cmbCountry.setSelectedIndex(0);
		cmbCountry.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {				
				if(cmbCountry.getSelectedIndex()==1){
                                    cmbStates.setVisible(true);cmbProvince.setVisible(false);
                                    lblProvince.setText("State");
                                    state=cmbStates.getSelectedItem().toString();
                                }
				if(cmbCountry.getSelectedIndex()==0){
                                    cmbProvince.setVisible(true); 
                                    cmbStates.setVisible(false);
                                    lblProvince.setText("Province");
                                     state=cmbProvince.getSelectedItem().toString();
                                }
			}
		});
		
		cmbCountry.setBounds(97, 322, 111, 20);
		
		
		this.getContentPane().add(cmbCountry);
		
		JLabel lblPostalCode = new JLabel("Postal Code");
		lblPostalCode.setBounds(242, 271, 98, 24);
		this.getContentPane().add(lblPostalCode);
		
		txtPostalCode = new JTextField();
		txtPostalCode.setColumns(12);
		txtPostalCode.setBounds(323, 271, 134, 24);
		this.getContentPane().add(txtPostalCode);
                zValidatorL.setBounds(334,248, 125, 24);
                 cValidatorL.setBounds(124,252, 104, 20);
		this.getContentPane().add(cValidatorL);
		this.getContentPane().add(zValidatorL);
		JButton btnNewButton = new JButton("Add New Customer");
		btnNewButton.setBounds(76, 409, 146, 35);
		this.getContentPane().add(btnNewButton);
                
               /**
                * When add Button click event Happen all information about
                * customer write into file and form AddBoat opens for register information about
                * customer's Boat
                */
		btnNewButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
                    int CustId=0;
                  
                    
		  try{
                    

                      
                      
                 if(validFormInformation()){ 
                     //read last customerId  from CustomerIDCreater.txt
                      String filePath=new File("").getAbsolutePath();       
                         Scanner sc = new Scanner(new FileReader(
                                                      filePath+"\\src\\programming2\\assignment2\\CustomerIDCreater.txt"));
			  CustId=sc.nextInt();
                          sc.close();
                          CustId++;//increment CustomerID for new customer
                          txtID.setText(String.format("%d",CustId));
                          
                          //write customer Object into  CustomerData.txt 
			FileWriter outFile=new FileWriter(filePath+"\\src\\programming2\\assignment2\\CustomerData.txt",true);
			 
			  Address add;
                          add=new Address(txtStreet.getText(),txtCity.getText(),state , txtPostalCode.getText(),cmbCountry.getSelectedItem().toString() );
                          System.out.println(add.toString());
                          cust=new Customer(CustId, txtFirstName.getText(), txtLastName.getText(), txtEmail.getText(), txtPhoneNo.getText(), add);
                          System.out.println(cust.toString());
			  outFile.write(cust.toString());
                          outFile.write("\r\n");
                          outFile.close();
                         
                            
                          
			PrintWriter pw=new PrintWriter(filePath+"\\src\\programming2\\assignment2\\CustomerIDCreater.txt");    
                         pw.println(CustId);
                         System.out.println(CustId);
                         pw.close();
                        
                      //strCustomerID static variable in  BoatGui class
                       BoatGUI.strCustomerID=String.valueOf(CustId);
                         
                        setVisible(false);
                        System.out.println("boat");
                         BoatGUI boatg=new BoatGUI(true);
                   }  //end of if valid    
                  }//end of try
                   catch(Exception e){
                                    System.out.println(e.toString());
                   }
			       
				
		}//end of actionperformed method 
	});//end of Action listener for button add Customer
                
                
                
                
		
		JButton btnReset = new JButton("Reset");
		btnReset.setBounds(257, 409, 125, 35);
		this.getContentPane().add(btnReset);
                ResetButtonHandler reset=new ResetButtonHandler();
                btnReset.addActionListener(reset);
		
		JLabel lblCustomerid = new JLabel("CustomerID");
		lblCustomerid.setBounds(10, 11, 77, 24);
		this.getContentPane().add(lblCustomerid);
		
		txtID = new JTextField();
		txtID.setEditable(false);
		txtID.setColumns(12);
		txtID.setBounds(107, 11, 155, 24);
		this.getContentPane().add(txtID);
		
	
		

            
		
		
		
	
		
	}
        
        

//method to validate first name

public  boolean validateFirstName(String txtFirstName){
   if(txtFirstName.length()<1)return false;
   if(txtFirstName.matches("[A-z][a-zA-Z]*") ) return true;
    return false;

}//end method validateFirstName
                        


//method to validate last name

public  boolean validateLastName(String txtLastName){

if(txtLastName.matches("[A-z][a-zA-Z]*") ) return true;
else return false;
}//end method validateFirstName
                        




//method for phone number validation

public boolean validatePhoneNumber(String txtPhoneNo){
                     
//if statements on single line for readability sake
//validate phone numbers of format "1234567890"
if(txtPhoneNo.length()<1)return false;

  
  
      
  
  if (txtPhoneNo.matches("||d{10}") ) return true;
//validate phone numbers with -,.or spaces
  else if (txtPhoneNo.matches("||d{3}[-||.||s]||d{3}[-||.||s]||d{4}") ) return true;
//validate phone numbers with extensions length from 3 to 6
  else if (txtPhoneNo.matches("||d{3}-||d{3}-||d{4}||x|(ext)||d{3,6}") ) return true;
//validate phone numbers with (area code in braces)
  else if (txtPhoneNo.matches("||(||d{3}||)-||d{3}-||d{4}") )return true;
  int num=0;
try{
   num=(Integer.parseInt(txtPhoneNo));return true;}
catch(Exception e){return false;}
//return false if nothing matches the input
   return false;

}//end method phoneNumberValidator
                                



//method for email address validation

public boolean validateEmail(String txtEmail){

 if(txtEmail.length()<1)return false;
   String emailPattern =  "^[_A-Za-z0-9-]+(||.[_A-Za-z0-9-]+)*@[A-­Za-z0-9-]+(||.[A-Za-z0-9-]+)*(||.[A-Za-z­]{2,})$";

   Pattern pattern = Pattern.compile(emailPattern);
   Matcher matcher = pattern.matcher(txtEmail);
  if(matcher.matches() ){
       return true;
  }
  else{
      return false;
  }
}
public  boolean validatePostalCode(String txtpostal){
  if(txtpostal.length()<3)return false;
 return true;

}//end m
/**
 * validFormInformation validate all textfield in the form if all information is not empty 
 * and valid it returns true
 * @return boolean
 */

public boolean validFormInformation(){
    boolean valid=true;
    
          
                       //Action performed to first name!!!!!!!!!!!!!!!!!!!!!!
                      if(validateFirstName(txtFirstName.getText())){
                           fValidatorL.setIcon(check);
                           
                       }//end if true statement
                       else{
                            fValidatorL.setIcon(mark);
                            valid=false;
                           
                        }//end else false statement


                      
                      //Action performed to last name!!!!!!!!!!!!!!!!!!!!!!!
                    if(validateLastName(txtLastName.getText())){
                        lValidatorL.setIcon(check);
                     }//end if true statement
                     else{
                         lValidatorL.setIcon(mark);
                         valid=false;
                     }//end else false statement
                      
                     //Action performed to phone number!!!!!!!!!!!!!!!!!!!!
                       if(validatePhoneNumber(txtPhoneNo.getText())){
                            pValidatorL.setIcon(check);
                        }//end if true statement
                        else{
                           pValidatorL.setIcon(mark);
                           valid=false;
                         }//end else false statement
 
                      
                      //Action performed to e-mail!!!!!!!!!!!!!!!!!

                    if(validateEmail(txtEmail.getText())){
                              eValidatorL.setIcon(check);
                              
                     }//end if true statement
                       else{
                          eValidatorL.setIcon(mark);
                          valid=false;
                         }//end else false statement
                      
                      //method for street address validation
//this ones only check if something is writen
                      int txtStreetLength = txtStreet.getText().length();
                         if (txtStreetLength > 3) {
                                sValidatorL.setIcon(check);
                            }//end if true statement
                             else{
                                    sValidatorL.setIcon(mark);
                                    valid=false;
                              }//end else false statement

                      //Action performed to city name!!!!!!!!!!!!!!!!!!!!!!!!!!!
                       if(validateCityName(txtCity.getText())    ){
                                     cValidatorL.setIcon(check);
                          }//end if true statement
                        else{
                               cValidatorL.setIcon(mark);
                               valid=false;
                          }//end else false statement

                      
                       
                        if(validatePostalCode(txtPostalCode.getText())){
                              zValidatorL.setIcon(check);
                              
                     }//end if true statement
                       else{
                          zValidatorL.setIcon(mark);
                          valid=false;
                         }//end else false statement
                       return valid;
    
    
    
}




//method to validate city name

public static boolean validateCityName(String city){
boolean cityStatus = false;
 if(city.length()<1)return false;
if(city.matches("[A-z][a-zA-Z]*") ) return true;
else return false;

}//end method validateFirstName
                        








 


//create class 'Reset' button handler
private class ResetButtonHandler implements ActionListener{
     public void actionPerformed(ActionEvent event){
//reset all text fields
             txtFirstName.setText("");
             txtLastName.setText("");                    
              txtPhoneNo.setText("");
              txtEmail.setText("");
               txtStreet.setText("");
              txtPostalCode.setText("");
               txtCity.setText("");
               txtID.setText("");  
              

    }//end actionPerformed
}//end method ResetButtonHandler
}//end of class
