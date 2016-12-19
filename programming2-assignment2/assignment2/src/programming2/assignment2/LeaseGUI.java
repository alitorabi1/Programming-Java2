package programming2.assignment2;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JRadioButton;

import javax.swing.border.TitledBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JSeparator;

public class LeaseGUI {

	private JFrame frmLeaseABoat;

   

	private JRadioButton rdbtnDaily;
	private JRadioButton rdbtnAnnual;
        private  ButtonGroup group ;
	private JTextField fromTF;
	public static JTextField toTF;

	public static JLabel lblSlip;
	public static JTextField aPriceTF;
	
	public static JLabel lblPrice;
	private JTextField txtStartDate;
	private JTextField textField;
	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the application.
	 */
	public LeaseGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
         public JFrame getFrmLeaseABoat() {
        return frmLeaseABoat;
    }
         
     public String firstWord(String str, char delimeter) {
          return str.substring(0, str.indexOf(delimeter));
}
     
         
	private void initialize() {
		String filePath=new File("").getAbsolutePath(); 
	       //Scanner sc = new Scanner(new File(filePath+"\\src\\programming2\\assignment2\\CustomerData.txt"));
	       // sc.close();
		
		
		frmLeaseABoat = new JFrame();
		frmLeaseABoat.getContentPane().setBackground(Color.WHITE);
		frmLeaseABoat.setTitle("Lease a boat");
		frmLeaseABoat.setBounds(100, 100, 506, 478);
		//frmLeaseABoat.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmLeaseABoat.getContentPane().setLayout(null);
		
		JLabel lblCustomer = new JLabel("Customer");
		lblCustomer.setBounds(22, 11, 66, 24);
		frmLeaseABoat.getContentPane().add(lblCustomer);
		String[] ss = new String[20];
		String[] bb = new String[20];
		int cntr = 0;
		try{
			Scanner sc = new Scanner(new File(filePath+"\\src\\programming2\\assignment2\\CustomerData.txt"));
			while(sc.hasNext() && cntr < 20){
				ss[cntr] =  sc.nextInt() + "  " + sc.next() + "  " + sc.next() + "\n";
				sc.nextLine();
				cntr++;
				//comboCustomer.addItem(ss);
			}
			sc.close();
		}
		catch(Exception e){
	          System.out.println(e);
		}
		JComboBox comboCustomer = new JComboBox(ss);
		comboCustomer.setBounds(115, 13, 285, 24);
		frmLeaseABoat.getContentPane().add(comboCustomer);
                
               
                        
                
                
		
		JLabel lblBoat = new JLabel("Boat(s)");
		lblBoat.setBounds(22, 63, 54, 14);
		frmLeaseABoat.getContentPane().add(lblBoat);
		
		cntr = 0;
		try{
			Scanner sb = new Scanner(new File(filePath+"\\src\\programming2\\assignment2\\addboat.txt"));
			while(sb.hasNext() && cntr < 20){
                            
                                int boatCustId=sb.nextInt();
                                bb[cntr] =  boatCustId + "  " + sb.next() + "  " + sb.next() + "\n";
				sb.nextLine();
				cntr++;
				//comboCustomer.addItem(ss);
			}
			sb.close();
		}
		catch(Exception e){
	          System.out.println(e);
		}
		JComboBox boatCustomer = new JComboBox(bb);
		boatCustomer.setBounds(115, 60, 285, 24);
		frmLeaseABoat.getContentPane().add(boatCustomer);
		
		JButton btnChooseSlip = new JButton("Slip");
		btnChooseSlip.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
//				
				FormSelectSlip boat = new FormSelectSlip();
                                //boat.setAlwaysOnTop(true);
				boat.setVisible(true);
			}
		});
		btnChooseSlip.setBounds(22, 109, 59, 23);
		frmLeaseABoat.getContentPane().add(btnChooseSlip);
		
                 comboCustomer.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
                           
                           try{ 
                            for(int i=0;i<boatCustomer.getItemCount()-1;i++){
                                
                                String str1=firstWord(comboCustomer.getSelectedItem().toString(),' ');
                                String str2=firstWord(boatCustomer.getItemAt(i).toString(),' ');
                                if(str1.equals(str2)){
                                    boatCustomer.setSelectedIndex(i);
                                    break;
                                    
                                    
                                }
                            }
                        }
                         catch(Exception ex){
                               
                                JOptionPane.showMessageDialog(null,"You have a error","Error Occured", JOptionPane.ERROR_MESSAGE);
                         }  
                        }
                });
                
                
                
		lblSlip = new JLabel("");
		lblSlip.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		lblSlip.setBackground(Color.WHITE);
		lblSlip.setBounds(115, 109, 285, 23);
		frmLeaseABoat.getContentPane().add(lblSlip);
		  group = new ButtonGroup();
		rdbtnDaily = new JRadioButton("Daily");
                group.add(rdbtnDaily);
		rdbtnDaily.setSelected(true);
		rdbtnDaily.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				rdbtnDaily.setSelected(true);
				rdbtnAnnual.setSelected(false);
				fromTF.setEnabled(true);
				toTF.setEnabled(true);
				aPriceTF.setEditable(false);
			}
		});
		rdbtnDaily.setBackground(Color.WHITE);
		rdbtnDaily.setBounds(22, 151, 80, 23);
		frmLeaseABoat.getContentPane().add(rdbtnDaily);
		
		rdbtnAnnual = new JRadioButton("Annual");
                 group.add(rdbtnAnnual);
		rdbtnAnnual.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				rdbtnDaily.setSelected(false);
				rdbtnAnnual.setSelected(true);
				fromTF.setEnabled(false);
				toTF.setEnabled(false);
				aPriceTF.setEditable(true);
			}
		});
		rdbtnAnnual.setBackground(Color.WHITE);
		rdbtnAnnual.setBounds(99, 151, 73, 23);
		frmLeaseABoat.getContentPane().add(rdbtnAnnual);
                
               
		
		JButton btnPrice = new JButton("Calculate the Price");
		
		btnPrice.setBounds(22, 292, 173, 24);
		frmLeaseABoat.getContentPane().add(btnPrice);
		
		JLabel lblPrice = new JLabel("");
		lblPrice.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		lblPrice.setBackground(Color.LIGHT_GRAY);
		lblPrice.setBounds(224, 292, 94, 24);
		frmLeaseABoat.getContentPane().add(lblPrice);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.setBounds(101, 349, 94, 23);
		frmLeaseABoat.getContentPane().add(btnAdd);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnCancel.setBounds(224, 349, 94, 23);
		frmLeaseABoat.getContentPane().add(btnCancel);
		
		JLabel lblFrom = new JLabel("No Days:");
		lblFrom.setBounds(29, 230, 57, 14);
		frmLeaseABoat.getContentPane().add(lblFrom);
		
		fromTF = new JTextField();
		fromTF.setBounds(95, 227, 80, 20);
		frmLeaseABoat.getContentPane().add(fromTF);
		fromTF.setColumns(10);
		
		JLabel lblTo = new JLabel("Price:");
		lblTo.setBounds(208, 230, 46, 14);
		frmLeaseABoat.getContentPane().add(lblTo);
		
		toTF = new JTextField();
		toTF.setBounds(256, 227, 80, 20);
		frmLeaseABoat.getContentPane().add(toTF);
		toTF.setColumns(10);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(22, 279, 386, 2);
		frmLeaseABoat.getContentPane().add(separator);
		
		JLabel label = new JLabel("( $ )");
		label.setBounds(328, 297, 46, 14);
		frmLeaseABoat.getContentPane().add(label);
		
		aPriceTF = new JTextField();
		aPriceTF.setColumns(10);
		aPriceTF.setBounds(256, 253, 80, 20);
		frmLeaseABoat.getContentPane().add(aPriceTF);
		
		JLabel label_1 = new JLabel("Price:");
		label_1.setBounds(208, 256, 46, 14);
		frmLeaseABoat.getContentPane().add(label_1);
		
		JLabel lblStartDate = new JLabel("StartDate");
		lblStartDate.setBounds(22, 186, 66, 14);
		frmLeaseABoat.getContentPane().add(lblStartDate);
		
		Date c=new Date();
		Calendar current=Calendar.getInstance();
                
		txtStartDate = new JTextField();
                //txtStartDate.setText();
		txtStartDate.setColumns(10);
		txtStartDate.setBounds(92, 183, 80, 20);
		frmLeaseABoat.getContentPane().add(txtStartDate);
		
		JLabel lblEnddate = new JLabel("EndDate");
		lblEnddate.setBounds(206, 186, 66, 14);
		frmLeaseABoat.getContentPane().add(lblEnddate);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(256, 182, 80, 20);
		frmLeaseABoat.getContentPane().add(textField);
		
		btnPrice.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double noDays = 0;
				double price = 0;
				try{
					noDays = Double.parseDouble(fromTF.getText()==""?"0":fromTF.getText());
					price = Double.parseDouble(toTF.getText() == ""?"0":toTF.getText());
				} catch(Exception e){
					noDays = 0;
					price = 0;
				}
				if (rdbtnDaily.isSelected()){
					lblPrice.setText("" + (price * noDays));
				}else {
					try{
						price = Double.parseDouble(aPriceTF.getText()==""?"":aPriceTF.getText());
					} catch(Exception e){
						price = 0;
					}
					LeaseGUI.lblPrice.setText("" + price);
				}
			}
		});
                
                
                
	}
}
