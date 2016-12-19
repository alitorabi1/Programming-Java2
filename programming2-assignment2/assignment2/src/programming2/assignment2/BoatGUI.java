package programming2.assignment2;

/**
 * To handle and management Boats.
 * This class has two subclasses called Sailboat and Powerboat.
 */

/**
 *
 * @author Behnaz-Domenic-Nathaly-Nikolay-Ali
 */
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class BoatGUI extends Boat {

	private JFrame frmAddABoat;
	private JTextField manufactureTF;
	private JTextField yearTF;
	private JTextField lengthTF;
	private JTextField stateRegNoTF;
	private JTextField numberOfSailsTF;
	private JTextField keelDepthTF;
	private JTextField numberOfEnginesTF;
	public  JTextField customerIDTF;
	
	private JLabel lblNumberOfSails;
	private JLabel lblKeelDepth;
	private JLabel lblNumberOfEngines;
	private JLabel lblNewLabel;
	private JLabel lblManufacture;
	private JLabel lblYear;
	private JLabel lblLength;
	private JLabel lblState;
	public  JLabel lblCustomerid;
	private JRadioButton rdbtnSailBoat;
	private JRadioButton rdbtnPowerBoat;
	private JRadioButton rdbtnNoEngine;
	private JRadioButton rdbtnInBoardEngine;
	private JRadioButton rdbtnOutboardEngine;
	private JRadioButton rdbtnGasolineFuel;
	private JRadioButton rdbtnDieselFuel;

	public static  String strCustomerID;

	/**
	 * Launch the application.
	 */
	
	/**
	 * Create the application.
	 */
	public BoatGUI() {
		super();
		initialize();
	}

	public BoatGUI(boolean visibility) {
		super();
		BoatGUI window = new BoatGUI();
		window.frmAddABoat.setVisible(visibility);
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAddABoat = new JFrame();
		//frmAddABoat.getContentPane().setBackground(Color.WHITE);
		frmAddABoat.setTitle("Add a boat");
		frmAddABoat.setBounds(100, 100, 547, 350);
		
		frmAddABoat.getContentPane().setLayout(null);
		
		lblNewLabel = new JLabel("Shining Lake Marina");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		//lblNewLabel.setForeground(new Color(34, 139, 34));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 28));
		lblNewLabel.setBounds(62, 11, 356, 34);
		frmAddABoat.getContentPane().add(lblNewLabel);
		
		lblManufacture = new JLabel("Manufacture");
		lblManufacture.setBounds(24, 91, 77, 14);
		frmAddABoat.getContentPane().add(lblManufacture);
		
		lblYear = new JLabel("Year");
		lblYear.setBounds(62, 119, 39, 14);
		frmAddABoat.getContentPane().add(lblYear);
		
		lblLength = new JLabel("Length");
		lblLength.setBounds(316, 94, 81, 14);
		frmAddABoat.getContentPane().add(lblLength);
		
		lblState = new JLabel("State registration number");
		lblState.setBounds(225, 122, 155, 14);
		frmAddABoat.getContentPane().add(lblState);
		
		manufactureTF = new JTextField();
		manufactureTF.setBounds(101, 88, 114, 20);
		frmAddABoat.getContentPane().add(manufactureTF);
		manufactureTF.setColumns(10);
		
		yearTF = new JTextField();
		yearTF.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				if(!isInteger(yearTF.getText())) {
					JOptionPane.showMessageDialog(null, "Enter year");
					yearTF.setText("");
				}
			}
		});
		yearTF.setBounds(101, 116, 86, 20);
		frmAddABoat.getContentPane().add(yearTF);
		yearTF.setColumns(10);
		
		lengthTF = new JTextField();
		lengthTF.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				if(!isInteger(lengthTF.getText()) && !isDouble(lengthTF.getText())) {
					JOptionPane.showMessageDialog(null, "Enter a number");
					lengthTF.setText("");
				}
			}
		});
		lengthTF.setBounds(407, 91, 86, 20);
		frmAddABoat.getContentPane().add(lengthTF);
		lengthTF.setColumns(10);
		
		stateRegNoTF = new JTextField();
		stateRegNoTF.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				if(!isInteger(stateRegNoTF.getText())) {
					JOptionPane.showMessageDialog(null, "Enter a number");
					stateRegNoTF.setText("");
				}
			}
		});
		stateRegNoTF.setBounds(407, 119, 86, 20);
		frmAddABoat.getContentPane().add(stateRegNoTF);
		stateRegNoTF.setColumns(10);
		
		rdbtnSailBoat = new JRadioButton("sail boat");
		rdbtnSailBoat.setSelected(true);
		rdbtnSailBoat.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				rdbtnSailBoat.setSelected(true);
				rdbtnPowerBoat.setSelected(false);
				lblNumberOfSails.setVisible(true);
				lblKeelDepth.setVisible(true);
				numberOfSailsTF.setVisible(true);
				keelDepthTF.setVisible(true);
				rdbtnNoEngine.setVisible(true);
				rdbtnInBoardEngine.setVisible(true);
				rdbtnOutboardEngine.setVisible(true);
				
				numberOfEnginesTF.setVisible(false);
				lblNumberOfEngines.setVisible(false);
				rdbtnGasolineFuel.setVisible(false);
				rdbtnDieselFuel.setVisible(false);
			}
		});
		rdbtnSailBoat.setBackground(Color.WHITE);
		rdbtnSailBoat.setIcon(new ImageIcon("src\\programming2\\assignment2\\sailboat.png"));
		rdbtnSailBoat.setBounds(101, 160, 109, 23);
		frmAddABoat.getContentPane().add(rdbtnSailBoat);
		
		rdbtnPowerBoat = new JRadioButton("power boat");
		rdbtnPowerBoat.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				rdbtnPowerBoat.setSelected(true);
				rdbtnSailBoat.setSelected(false);
				lblNumberOfSails.setVisible(false);
				lblKeelDepth.setVisible(false);
				numberOfSailsTF.setVisible(false);
				keelDepthTF.setVisible(false);
				rdbtnNoEngine.setVisible(false);
				rdbtnInBoardEngine.setVisible(false);
				rdbtnOutboardEngine.setVisible(false);

				numberOfEnginesTF.setVisible(true);
				lblNumberOfEngines.setVisible(true);
				rdbtnGasolineFuel.setVisible(true);
				rdbtnDieselFuel.setVisible(true);
			}
		});
		rdbtnPowerBoat.setBackground(Color.WHITE);
		rdbtnPowerBoat.setIcon(new ImageIcon("src\\programming2\\assignment2\\powerboat.png"));
		rdbtnPowerBoat.setBounds(261, 160, 109, 23);
		frmAddABoat.getContentPane().add(rdbtnPowerBoat);
		
		JSeparator sailBoatSeparator = new JSeparator();
		sailBoatSeparator.setBounds(10, 190, 511, 61);
		frmAddABoat.getContentPane().add(sailBoatSeparator);
		
		lblNumberOfSails = new JLabel("Number of sails");
		lblNumberOfSails.setBounds(10, 200, 123, 14);
		frmAddABoat.getContentPane().add(lblNumberOfSails);
		
		lblKeelDepth = new JLabel("Keel depth");
		lblKeelDepth.setBounds(34, 225, 89, 14);
		frmAddABoat.getContentPane().add(lblKeelDepth);
		
		numberOfSailsTF = new JTextField();
		numberOfSailsTF.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				if(!isInteger(numberOfSailsTF.getText())) {
					JOptionPane.showMessageDialog(null, "Enter a number");
					numberOfSailsTF.setText("");
				}
			}
		});
		numberOfSailsTF.setBounds(143, 196, 56, 20);
		frmAddABoat.getContentPane().add(numberOfSailsTF);
		numberOfSailsTF.setColumns(10);
		
		keelDepthTF = new JTextField();
		keelDepthTF.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				if(!isInteger(keelDepthTF.getText()) && !isDouble(keelDepthTF.getText())) {
					JOptionPane.showMessageDialog(null, "Enter a number");
					keelDepthTF.setText("");
				}
			}
		});
		keelDepthTF.setBounds(143, 222, 56, 20);
		frmAddABoat.getContentPane().add(keelDepthTF);
		keelDepthTF.setColumns(10);
		
		rdbtnNoEngine = new JRadioButton("No engine");
		rdbtnNoEngine.setSelected(true);
		rdbtnNoEngine.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				rdbtnNoEngine.setSelected(true);
				rdbtnInBoardEngine.setSelected(false);
				rdbtnOutboardEngine.setSelected(false);
			}
		});
		//rdbtnNoEngine.setBackground(Color.WHITE);
		rdbtnNoEngine.setBounds(205, 216, 81, 23);
		frmAddABoat.getContentPane().add(rdbtnNoEngine);
		
		rdbtnInBoardEngine = new JRadioButton("Inboard engine");
		rdbtnInBoardEngine.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				rdbtnNoEngine.setSelected(false);
				rdbtnInBoardEngine.setSelected(true);
				rdbtnOutboardEngine.setSelected(false);
			}
		});
		//rdbtnInBoardEngine.setBackground(Color.WHITE);
		rdbtnInBoardEngine.setBounds(288, 216, 109, 23);
		frmAddABoat.getContentPane().add(rdbtnInBoardEngine);
		
		rdbtnOutboardEngine = new JRadioButton("Outboard engine");
		rdbtnOutboardEngine.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				rdbtnNoEngine.setSelected(false);
				rdbtnInBoardEngine.setSelected(false);
				rdbtnOutboardEngine.setSelected(true);
			}
		});
		rdbtnOutboardEngine.setBackground(Color.WHITE);
		rdbtnOutboardEngine.setBounds(399, 216, 122, 23);
		frmAddABoat.getContentPane().add(rdbtnOutboardEngine);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
		            
		        if(rdbtnSailBoat.isSelected()){
		           	Sailboat sBoat = new Sailboat(stateRegNoTF.getText(), lengthTF.getText(), manufactureTF.getText(), yearTF.getText(), Integer.parseInt(strCustomerID));
		           	sBoat.setNumberSails(numberOfSailsTF.getText());
		           	sBoat.setKeelDepth(keelDepthTF.getText());
		           	
			        if(rdbtnNoEngine.isSelected()) {
			        	sBoat.setMotorType("NoEngine");
			        } else if(rdbtnInBoardEngine.isSelected()) {
				        sBoat.setMotorType("InBoardEngine");
			        } else {
				        sBoat.setMotorType("OutboardEngine");
			        }

			        sBoat.addSailboat();
			        frmAddABoat.setVisible(false);
		    	} else if(rdbtnPowerBoat.isSelected()) {
		    		Powerboat pBoat = new Powerboat(stateRegNoTF.getText(), lengthTF.getText(), manufactureTF.getText(), yearTF.getText(), Integer.parseInt(strCustomerID));
		    		pBoat.setNumberEngines(numberOfEnginesTF.getText());
			        if(rdbtnGasolineFuel.isSelected()) {
			        	pBoat.setFuelType("GasolineFuel");
			        } else {
			           	pBoat.setFuelType("DieselFuel");
			        }

			        pBoat.addPowerboat();
			        frmAddABoat.setVisible(false);
		    	}
			}
		});
		btnAdd.setBounds(101, 275, 89, 26);
		frmAddABoat.getContentPane().add(btnAdd);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				manufactureTF.setText("");
				yearTF.setText("");
				lengthTF.setText("");
				stateRegNoTF.setText("");
				numberOfSailsTF.setText("");
				keelDepthTF.setText("");
				numberOfEnginesTF.setText("");
			}
		});
		btnClear.setBounds(234, 275, 89, 26);
		frmAddABoat.getContentPane().add(btnClear);
		
		JButton btnClose = new JButton("Close");
		btnClose.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frmAddABoat.setVisible(false);
			}
		});
		btnClose.setBounds(362, 275, 89, 26);
		frmAddABoat.getContentPane().add(btnClose);
		
		JSeparator powerBoatSeparator = new JSeparator();
		powerBoatSeparator.setVisible(false);
		powerBoatSeparator.setBounds(10, 196, 511, 46);
		frmAddABoat.getContentPane().add(powerBoatSeparator);
		
		numberOfEnginesTF = new JTextField();
		numberOfEnginesTF.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				if(!isInteger(numberOfEnginesTF.getText())) {
					JOptionPane.showMessageDialog(null, "Enter a number");
					numberOfEnginesTF.setText("");
				}
			}
		});
		numberOfEnginesTF.setVisible(false);
		numberOfEnginesTF.setBounds(133, 209, 39, 20);
		frmAddABoat.getContentPane().add(numberOfEnginesTF);
		numberOfEnginesTF.setColumns(10);
		
		rdbtnGasolineFuel = new JRadioButton("Gasoline fuel");
		rdbtnGasolineFuel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				rdbtnGasolineFuel.setSelected(true);
				rdbtnDieselFuel.setSelected(false);
			}
		});
		rdbtnGasolineFuel.setSelected(true);
		//rdbtnGasolineFuel.setBackground(Color.WHITE);
		rdbtnGasolineFuel.setVisible(false);
		rdbtnGasolineFuel.setBounds(229, 208, 114, 23);
		frmAddABoat.getContentPane().add(rdbtnGasolineFuel);
		
		rdbtnDieselFuel = new JRadioButton("Diesel fuel");
		rdbtnDieselFuel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				rdbtnGasolineFuel.setSelected(false);
				rdbtnDieselFuel.setSelected(true);
			}
		});
		//rdbtnDieselFuel.setBackground(Color.WHITE);
		rdbtnDieselFuel.setVisible(false);
		rdbtnDieselFuel.setBounds(362, 208, 114, 23);
		frmAddABoat.getContentPane().add(rdbtnDieselFuel);
		
		lblNumberOfEngines = new JLabel("Number of engines");
		lblNumberOfEngines.setVisible(false);
		lblNumberOfEngines.setBounds(10, 212, 113, 14);
		frmAddABoat.getContentPane().add(lblNumberOfEngines);
		
		lblCustomerid = new JLabel("CustomerID");
		lblCustomerid.setBounds(24, 56, 77, 14);
		frmAddABoat.getContentPane().add(lblCustomerid);
		
		customerIDTF = new JTextField();
		customerIDTF.setText(strCustomerID);
		customerIDTF.setBounds(101, 56, 114, 20);
		frmAddABoat.getContentPane().add(customerIDTF);
	}

	/**
	 * 
	 * @param input
	 * @return true or false
	 */
	public boolean isInteger( String input )
	{
	   try
	   {
	      Integer.parseInt( input );
	      return true;
	   }
	   catch( Exception e )
	   {
	      return false;
	   }
	}

	/**
	 * 
	 * @param input
	 * @return true or false
	 */
	public boolean isDouble( String input )
	{
	   try
	   {
	      Double.parseDouble( input );
	      return true;
	   }
	   catch( Exception e )
	   {
	      return false;
	   }
	}
}
