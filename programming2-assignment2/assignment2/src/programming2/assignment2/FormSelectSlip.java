package programming2.assignment2;

/**
 * @Authors:
 *  
 *  Nikolay Nikolov, Ali Torabi ,
 *  Behnaz Akbariafshar,
 * Nathalie Desrosiers, Domenic Palucci
 */


import java.awt.Window;
import java.awt.event.WindowEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author Nikolovi
 */
public class FormSelectSlip extends javax.swing.JFrame {

    /**
     *
     */
    public Slip slip;
    LeaseGUI mm;
   // public static String slipID;
    
    /**
     * Creates new form FormDock
     */
    public FormSelectSlip(){
    	initComponents();
    }

    /**
     *
     * @param f
     */
    public FormSelectSlip(LeaseGUI f) {
        initComponents();
        
        mm = f;
        
        //slip = new Slip();
    }

    
    //@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        slipTbl = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox();

        setTitle("Dock 01");
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jLabel1.setText("Dock No: ");

        jCheckBox1.setSelected(true);
        jCheckBox1.setText("Electricity: ");
        jCheckBox1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        jCheckBox2.setSelected(true);
        jCheckBox2.setText("Water: ");
        jCheckBox2.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        slipTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"SL01-001",  new Double(12.35),  new Double(5.16),  new Double(80.0),  new Boolean(true),  new Boolean(true),  new Boolean(true),  new Double(5.0),  new Double(7.0),  new Double(3000.0),  new Double(35.0), "CL-4352-12"},
                {"SL01-002",  new Double(12.35),  new Double(5.16),  new Double(80.0),  new Boolean(true),  new Boolean(true), null, null, null,  new Double(2500.0),  new Double(80.0), "Free"},
                {"SL01-003",  new Double(12.35),  new Double(4.45),  new Double(80.0),  new Boolean(true),  new Boolean(true),  new Boolean(true),  new Double(5.0),  new Double(7.0),  new Double(3000.0),  new Double(40.0), "CL-1234-15"},
                {"SL01-004",  new Double(12.35),  new Double(4.45),  new Double(80.0),  new Boolean(true), null,  new Boolean(true),  new Double(5.0),  new Double(8.0),  new Double(2250.0),  new Double(32.0), "Free"},
                {"SL01-005",  new Double(15.65),  new Double(5.16),  new Double(80.0), null, null,  new Boolean(true),  new Double(4.0),  new Double(7.0),  new Double(3200.0),  new Double(55.0), "Free"},
                {"SL01-006",  new Double(15.65),  new Double(5.16),  new Double(80.0), null,  new Boolean(true), null, null, null,  new Double(3150.0),  new Double(10.0), "CL-4567-99"},
                {"SL01-007",  new Double(15.65),  new Double(4.45),  new Double(80.0), null,  new Boolean(true),  new Boolean(true),  new Double(4.0),  new Double(6.0),  new Double(1860.0),  new Double(45.0), "CL-234-875"},
                {"SL01-008",  new Double(15.65),  new Double(4.45),  new Double(80.0),  new Boolean(true), null, null, null, null,  new Double(4500.0),  new Double(84.0), "CL-7644"},
                {"SL01-009",  new Double(15.65),  new Double(4.45),  new Double(80.0), null, null, null, null, null,  new Double(3210.0),  new Double(54.0), "Free"},
                {"SL01-010",  new Double(15.65),  new Double(5.16),  new Double(80.0),  new Boolean(true),  new Boolean(true),  new Boolean(true),  new Double(4.0),  new Double(8.0),  new Double(4125.0),  new Double(54.0), "BL-34332"},
                {"SL01-011",  new Double(10.12),  new Double(4.45),  new Double(80.0), null,  new Boolean(true), null, null, null,  new Double(1200.0),  new Double(35.0), "TR-654-809"},
                {"SL01-012",  new Double(15.65),  new Double(5.16),  new Double(80.0),  new Boolean(true), null,  new Boolean(true),  new Double(4.0),  new Double(7.0),  new Double(1800.0),  new Double(35.0), "Free"},
                {"SL01-013",  new Double(15.65),  new Double(4.45),  new Double(80.0),  new Boolean(true),  new Boolean(true), null, null, null,  new Double(5000.0),  new Double(35.0), "CL-09887"},
                {"SL01-014",  new Double(15.65),  new Double(5.16),  new Double(80.0), null, null,  new Boolean(true),  new Double(5.0),  new Double(8.0),  new Double(5500.0),  new Double(62.0), "CL-8900-01"},
                {"SL01-015",  new Double(15.65),  new Double(5.16),  new Double(80.0),  new Boolean(true),  new Boolean(true),  new Boolean(true),  new Double(5.0),  new Double(9.0),  new Double(3980.0),  new Double(50.0), "Free"}
            },
            new String [] {
                "Slip ID", "Lenght", "Width", "Depth", "Water", "Elecrticity", "Covered", "Door Width", "Door Height", "Annual Price", "Daily Price", "BoatID"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        slipTbl.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(slipTbl);

//        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/marina/Fig4-12.jpg"))); // NOI18N

        jButton1.setText("Select");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Exit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Dock 01", "Dock 02" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jCheckBox1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jCheckBox2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 741, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)
                        .addGap(40, 40, 40))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCheckBox1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCheckBox2))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String ss = new String("");
        if (slipTbl.getSelectedRow() >=0 ){
            ss = slipTbl.getValueAt(slipTbl.getSelectedRow(),11).toString() == null?"":slipTbl.getValueAt(slipTbl.getSelectedRow(),11).toString();
             
            if (ss.equals("Free")){
                LeaseGUI.lblSlip.setText(slipTbl.getValueAt(slipTbl.getSelectedRow(),0)==null?"":slipTbl.getValueAt(slipTbl.getSelectedRow(),0).toString());
                LeaseGUI.aPriceTF.setText(slipTbl.getValueAt(slipTbl.getSelectedRow(),0)==null?"":slipTbl.getValueAt(slipTbl.getSelectedRow(),9).toString());
                LeaseGUI.toTF.setText(slipTbl.getValueAt(slipTbl.getSelectedRow(),0)==null?"":slipTbl.getValueAt(slipTbl.getSelectedRow(),10).toString());
                //mm.lblSlip.setText(slipTbl.getValueAt(slipTbl.getSelectedRow(),0)==null?"":slipTbl.getValueAt(slipTbl.getSelectedRow(),0).toString());
                
                this.setVisible(false);
                //LeaseGUI.sendSlipInfo();
            } else {
                JOptionPane.showMessageDialog (null, "This slip is occupied!", "Marina Manager", JOptionPane.INFORMATION_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog (null, "Please, select a slip!", "Marina Manager", JOptionPane.INFORMATION_MESSAGE);
        }
        
        
        //setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowActivated

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowGainedFocus

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable slipTbl;
    // End of variables declaration//GEN-END:variables
}
