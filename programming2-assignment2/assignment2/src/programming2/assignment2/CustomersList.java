
package programming2.assignment2;

/**
 * @Authors:
 *  Behnaz Akbariafshar, Ali Torabi ,Nikolay Nikolov,
 * Nathalie Desrosiers, Domenic Palucci
 */



import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;


public class CustomersList extends JFrame
{

	
	private JTable table;
	 private String[] columnNames = {"CustomerID","First Name", "Last Name", "Phone Number", "Email", "Street","City", "Postal Code", "Province/State", "Country"	};
         private JTextField txtFName;
	 private JTextField txtLName;
	 private JLabel lblPhoneNo,lblFirstName,lblLastName;
	 private JTextField txtPhoneNo;
         private JButton btnFindCustomer;
         private ArrayList<Customer> myCustomers;
	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the application.
	 */
	public CustomersList() {
		initialize();
	}

	/**
	 * Initialize the contents of the this.
	 */
	private void initialize()  {
		
		this.setSize(950,650);
		//this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().setLayout(null);
           		
               
        
        /*
        JLabel lblFirstName = new JLabel("First Name");
        lblFirstName.setBounds(21, 11, 77, 24);
        this.getContentPane().add(lblFirstName);
        
        txtFName = new JTextField();
        txtFName.setColumns(12);
        txtFName.setBounds(108, 11, 155, 24);
        this.getContentPane().add(txtFName);
        
        JLabel lblLastName = new JLabel("Last Name");
        lblLastName.setBounds(21, 46, 77, 24);
        this.getContentPane().add(lblLastName);
        
        txtLName = new JTextField();
        txtLName.setColumns(12);
        txtLName.setBounds(108, 11, 155, 24);
        this.getContentPane().add(txtLName);*/
        
        lblPhoneNo = new JLabel("Phone No");
        lblPhoneNo.setBounds(21, 11, 77, 24);
        this.getContentPane().add(lblPhoneNo);
        
        txtPhoneNo = new JTextField();
        txtPhoneNo.setColumns(12);
        txtPhoneNo.setBounds(108, 11, 155, 24);
        this.getContentPane().add(txtPhoneNo);
        //find customer with phone number
        JButton btnFindCustomer = new JButton("Find Customer");
        btnFindCustomer.addActionListener(new ActionListener() {
        	     @Override
                    public void actionPerformed(ActionEvent e) {
                        String value = txtPhoneNo.getText();

            for (int row = 0; row <= table.getRowCount() - 1; row++) {

                for (int col = 0; col <= table.getColumnCount() - 1; col++) {

                    if (value.equals(table.getValueAt(row, col))) {

                        // this will automatically set the view of the scroll in the location of the value
                        table.scrollRectToVisible(table.getCellRect(row, 0, true));

                        // this will automatically set the focus of the searched/selected row/value
                        table.setRowSelectionInterval(row, row);

                        for (int i = 0; i <= table.getColumnCount() - 1; i++) {

                            table.getColumnModel().getColumn(i).setCellRenderer(new HighlightRenderer());
                        }
                    }
                }
            }
       }
   
                   
        });
        btnFindCustomer.setBounds(508, 6, 117, 35);
        this.getContentPane().add(btnFindCustomer);
                
               
	     
		
		
		table = new JTable();
		JScrollPane scrollPane = new JScrollPane(table,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
      JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
	     scrollPane.setBounds(10, 133, 908, 423);
            
	    // this.add(scrollPane);
		this.getContentPane().add(scrollPane);
		table.setBounds(0, 11, 910, 313);
                scrollPane.setViewportView(table);
		this.getContentPane().add(table);		
       //table.setBorder(UIManager.getBorder("DesktopIcon.border"));
       scrollPane.setViewportView(table);
         
        // the column in the table
       
       myCustomers=new ArrayList<Customer>();
      Customer c1;
      int  i=0;
      try{
       String filePath=new File("").getAbsolutePath(); 
      //File file=new File("\\src\\programming2\\assignment2\\CustomerData.txt");
       Scanner sc = new Scanner(new File(       
               
               filePath+"\\src\\programming2\\assignment2\\CustomerData.txt"));
       
       while(sc.hasNextInt()){
           
            
           c1=new Customer(sc.nextInt(),sc.next(),sc.next(),sc.next(),sc.next(),new Address(sc.next(),sc.next(),sc.next(),sc.next(),sc.next()));
           
          myCustomers.add(c1);
          i++;
          //System.out.println(c1);
          // System.out.println(i);
          
       }
        sc.close();
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                
            },
            new String [] {
                "CustomerID","First Name", "Last Name", "Email","Phone Number", "Street","City", "Postal Code", "Province/State", "Country"
            }
        ));
        
        DefaultTableModel model=(DefaultTableModel) table.getModel();
         
        
        for(int j=0;j<i;j++){        
             System.out.println(j);
            Object[] objs = {
                myCustomers.get(j).getCustomerID(),
                myCustomers.get(j).getfName(),
                myCustomers.get(j).getlName(),
                myCustomers.get(j).getPhoneNo(),
                myCustomers.get(j).getEmail(),
                myCustomers.get(j).getAdd().getStAddress(),
                myCustomers.get(j).getAdd().getCity(),
                myCustomers.get(j).getAdd().getPostalCode(),
                myCustomers.get(j).getAdd().getProvince(),
                myCustomers.get(j).getAdd().getCountry()};           
                model.addRow(objs);
                System.out.print( myCustomers.get(j).toString());
            
        }
        TableColumn column = null;
    for (int k = 0; k < 9;k++) {
        column = table.getColumnModel().getColumn(k);
        
            column.setMinWidth(80);
        
    }    
    
     table.setDefaultRenderer(Object.class, new DefaultTableCellRenderer()
{
    //even rows have gray color and odd rows have white background
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column)
    {
        final Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        c.setBackground(row % 2 == 0 ? Color.LIGHT_GRAY : Color.WHITE);
        return c;
    }
});
        
  
       table.getSelectionModel().addListSelectionListener(new ListSelectionListener(){
        public void valueChanged(ListSelectionEvent event) {
            
           // System.out.println(table.getValueAt(table.getSelectedRow(), 0).toString());
        }
    });
     
     
      }catch(Exception e){
       //  System.out.println(e);
                JOptionPane.showMessageDialog(null,"it has a error ","error", JOptionPane.ERROR);
          
      }
        
       

      

      
       
   
    }
   
  		
private class HighlightRenderer extends DefaultTableCellRenderer {

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {

        // everything as usual
        super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

        // added behavior
        if(row == table.getSelectedRow()) {

            // this will customize that kind of border that will be use to highlight a row
            setBorder(BorderFactory.createMatteBorder(2, 1, 2, 1, Color.BLACK));
        }

        return this;
    }
}
		
