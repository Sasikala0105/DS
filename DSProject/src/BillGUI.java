import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;




public class BillGUI extends javax.swing.JFrame {
    
    

    private DefaultTableModel tblModel;
    public BillGUI() {
    	getContentPane().setBackground(new Color(245, 222, 179));
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    
    private void initComponents() {

        
        lbldate = new javax.swing.JLabel();
        lbldate.setBackground(Color.WHITE);
        lbldate.setFont(new Font("Times New Roman", Font.BOLD, 12));
        tfbilldate = new javax.swing.JTextField();
        lblaccnum = new javax.swing.JLabel();
        lblaccnum.setFont(new Font("Times New Roman", Font.BOLD, 12));
        tfaccnum = new javax.swing.JTextField();
        lblname = new javax.swing.JLabel();
        lblname.setFont(new Font("Times New Roman", Font.BOLD, 12));
        lbladd = new javax.swing.JLabel();
        lbladd.setFont(new Font("Times New Roman", Font.BOLD, 12));
        tfadd = new javax.swing.JTextField();
        arrears = new javax.swing.JLabel();
        arrears.setFont(new Font("Times New Roman", Font.BOLD, 12));
        lblcmr = new javax.swing.JLabel();
        lblcmr.setFont(new Font("Times New Roman", Font.BOLD, 12));
        tfcmr = new javax.swing.JTextField();
        lblpmr = new javax.swing.JLabel();
        lblpmr.setFont(new Font("Times New Roman", Font.BOLD, 12));
        tfpmr = new javax.swing.JTextField();
        lbltunit = new javax.swing.JLabel();
        lbltunit.setText("Total Unit");
        lbltunit.setFont(new Font("Times New Roman", Font.BOLD, 12));
        tftunit = new javax.swing.JTextField();
        tftunit.setEditable(false);
        lblcc = new javax.swing.JLabel();
        lblcc.setFont(new Font("Times New Roman", Font.BOLD, 12));
        tfcc = new javax.swing.JTextField();
        tfcc.setEditable(false);
        btnCalculate = new javax.swing.JButton();
        btnCalculate.setForeground(Color.BLACK);
        btnCalculate.setBackground(new Color(100, 149, 237));
        btnCalculate.setFont(new Font("Book Antiqua", Font.BOLD, 12));
        btnStore = new javax.swing.JButton();
        btnStore.setForeground(Color.BLACK);
        btnStore.setBackground(new Color(100, 149, 237));
        btnStore.setFont(new Font("Book Antiqua", Font.BOLD, 12));
        btnSearch = new javax.swing.JButton();
        btnSearch.setForeground(Color.BLACK);
        btnSearch.setBackground(new Color(65, 105, 225));
        btnSearch.setFont(new Font("Book Antiqua", Font.BOLD, 12));
        btnDisplayAll = new javax.swing.JButton();
        btnDisplayAll.setForeground(Color.BLACK);
        btnDisplayAll.setBackground(new Color(100, 149, 237));
        btnDisplayAll.setFont(new Font("Book Antiqua", Font.BOLD, 12));
        btnReset = new javax.swing.JButton();
        btnReset.setForeground(Color.BLACK);
        btnReset.setBackground(new Color(100, 149, 237));
        btnReset.setFont(new Font("Book Antiqua", Font.BOLD, 12));
        btnUpdate = new javax.swing.JButton();
        btnUpdate.setForeground(Color.BLACK);
        btnUpdate.setBackground(new Color(65, 105, 225));
        btnUpdate.setFont(new Font("Book Antiqua", Font.BOLD, 12));
        btnDelete = new javax.swing.JButton();
        btnDelete.setForeground(Color.BLACK);
        btnDelete.setBackground(new Color(100, 149, 237));
        btnDelete.setFont(new Font("Book Antiqua", Font.BOLD, 12));
        jScrollPane3 = new javax.swing.JScrollPane();
        tblDisplay = new javax.swing.JTable();
        btnExit = new javax.swing.JButton();
        btnExit.setForeground(Color.BLACK);
        btnExit.setBackground(new Color(100, 149, 237));
        btnExit.setFont(new Font("Book Antiqua", Font.BOLD, 12));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbldate.setText("Bill Date");

        lblaccnum.setText("Account Number");

        lblname.setText("Name");

        lbladd.setText("Address");

        arrears.setText("Arrears");

        lblcmr.setText("Current meter reading");

        lblpmr.setText("Previous meter reading");
       
        lblcc.setText("Current Charge");
        

        btnCalculate.setText("CALCULATE");
        btnCalculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalculateActionPerformed(evt);
            }
        });

        btnStore.setText("STORE DATA");
        btnStore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnSearch.setText("SEARCH");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnDisplayAll.setText("DISPLAY ALL");
        btnDisplayAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDisplayAllActionPerformed(evt);
            }
        });

        btnReset.setText("RESET");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        btnUpdate.setText("UPDATE");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setText("DELETE");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        tblDisplay.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}

            },
            new String [] {
                "Account Number", "Bill Date", "Name", "Address", "Arrears", "Current Meter Reading", "Previous Meter Reading", "Total Unit", "Current Charge", "Total Bill"
            }
        ));
        jScrollPane3.setViewportView(tblDisplay);

        btnExit.setText("EXIT");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        
        tfname = new JTextField();
        tfname.setColumns(10);
        
        tfarrears = new JTextField();
        tfarrears.setColumns(10);
        
        tftbill = new JTextField();
        tftbill.setEditable(false);
        tftbill.setText("");
        tftbill.setColumns(10);
        
        lbltbill = new JLabel("Total Bill");
        lbltbill.setFont(new Font("Times New Roman", Font.BOLD, 12));
        
        scrollPane = new JScrollPane();

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addGap(71)
        					.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        						.addGroup(layout.createSequentialGroup()
        							.addComponent(btnCalculate)
        							.addGap(21)
        							.addComponent(btnStore, GroupLayout.PREFERRED_SIZE, 109, GroupLayout.PREFERRED_SIZE)
        							.addGap(34)
        							.addComponent(btnDisplayAll, GroupLayout.PREFERRED_SIZE, 139, GroupLayout.PREFERRED_SIZE)
        							.addGap(31)
        							.addComponent(btnUpdate, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)
        							.addPreferredGap(ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
        							.addComponent(btnSearch, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
        							.addGap(33)
        							.addComponent(btnReset, GroupLayout.PREFERRED_SIZE, 109, GroupLayout.PREFERRED_SIZE)
        							.addGap(33)
        							.addComponent(btnDelete, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
        							.addGap(33)
        							.addComponent(btnExit, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE)
        							.addGap(1038))
        						.addGroup(layout.createSequentialGroup()
        							.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        								.addComponent(jScrollPane3, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 1097, Short.MAX_VALUE)
        								.addGroup(layout.createSequentialGroup()
        									.addGroup(layout.createParallelGroup(Alignment.LEADING, false)
        										.addComponent(arrears, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        										.addComponent(lbladd, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        										.addComponent(lblname, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        										.addComponent(lbldate, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        										.addGroup(layout.createSequentialGroup()
        											.addComponent(lblaccnum, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE)
        											.addPreferredGap(ComponentPlacement.RELATED)))
        									.addGap(100)
        									.addGroup(layout.createParallelGroup(Alignment.LEADING, false)
        										.addComponent(tfname)
        										.addComponent(tfbilldate)
        										.addComponent(tfaccnum, GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE)
        										.addComponent(tfadd, Alignment.TRAILING)
        										.addComponent(tfarrears, Alignment.TRAILING))
        									.addGap(55)
        									.addGroup(layout.createParallelGroup(Alignment.LEADING)
        										.addComponent(lbltunit, GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
        										.addGroup(layout.createParallelGroup(Alignment.LEADING, false)
        											.addComponent(lbltbill, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        											.addComponent(lblcc, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        											.addComponent(lblcmr, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        											.addGroup(layout.createSequentialGroup()
        												.addComponent(lblpmr, GroupLayout.PREFERRED_SIZE, 133, GroupLayout.PREFERRED_SIZE)
        												.addPreferredGap(ComponentPlacement.RELATED))))
        									.addGap(18)
        									.addGroup(layout.createParallelGroup(Alignment.LEADING, false)
        										.addComponent(tftbill)
        										.addComponent(tfcc)
        										.addComponent(tftunit, GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE)
        										.addGroup(layout.createSequentialGroup()
        											.addGap(2)
        											.addComponent(tfcmr))
        										.addComponent(tfpmr))))
        							.addGap(1006))))
        				.addGroup(layout.createSequentialGroup()
        					.addGap(93)
        					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 991, GroupLayout.PREFERRED_SIZE)))
        			.addContainerGap())
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(lbldate)
        				.addComponent(tfbilldate, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(lblcmr)
        				.addComponent(tfcmr, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(18)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(lblaccnum)
        				.addComponent(tfaccnum, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(lblpmr)
        				.addComponent(tfpmr, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        					.addComponent(tfname, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        					.addComponent(lbltunit, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
        					.addComponent(tftunit, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        				.addComponent(lblname))
        			.addGap(21)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        					.addComponent(tfadd, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        					.addComponent(lblcc)
        					.addComponent(tfcc, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        				.addComponent(lbladd))
        			.addGap(25)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(arrears)
        				.addComponent(tfarrears, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(lbltbill)
        				.addComponent(tftbill, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(58)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(btnCalculate, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
        				.addComponent(btnStore, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
        				.addComponent(btnDisplayAll, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
        				.addComponent(btnUpdate, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
        				.addComponent(btnExit, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
        				.addComponent(btnDelete, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
        				.addComponent(btnReset, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
        				.addComponent(btnSearch, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
        			.addGap(62)
        			.addComponent(jScrollPane3, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE)
        			.addGap(18)
        			.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
        			.addContainerGap())
        );
        taDisplay = new JTextArea();
        scrollPane.setViewportView(taDisplay);
        
                taDisplay.setColumns(20);
                taDisplay.setRows(5);
        getContentPane().setLayout(layout);

        pack();
    
        
    }

    private void btnCalculateActionPerformed(java.awt.event.ActionEvent evt) {
    	BillOperation bo = new BillOperation();
        double arrears = Double.parseDouble(tfarrears.getText());
        double currentmeterreading = Double.parseDouble(tfcmr.getText()); // convert String to double
        double previousmeterreading = Double.parseDouble(tfpmr.getText());
         double totalunit = currentmeterreading - previousmeterreading;
        tftunit.setText(String.valueOf(totalunit));
		double currentcharge = bo.calctariff(totalunit);
        tfcc.setText(String.valueOf(currentcharge));
        double totalbill = arrears + currentcharge;
        tftbill.setText(String.valueOf(totalbill));
    }

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {
        
        Bill billing;
        BillOperation billOperation = new BillOperation();
        
        int accountnumber = Integer.parseInt(tfaccnum.getText()); // get data in String from textfield acc num and convert into integer
        String billdate = tfbilldate.getText();
        String name = tfname.getText(); // get data in String from textfield name
        String address = tfadd.getText(); 
        double arrears = Double.parseDouble(tfarrears.getText()); // get data in String from textfield arrears and convert into double
        double currentmeterreading = Double.parseDouble(tfcmr.getText());
        double previousmeterreading = Double.parseDouble(tfpmr.getText());
        double currentcharge = Double.parseDouble(tfcc.getText());
        double totalunit = currentmeterreading - previousmeterreading;
        double totalbill = arrears + currentcharge;
        
        // store a record into an object
        billing = new Bill(accountnumber, billdate, name, address, arrears, currentmeterreading, previousmeterreading, totalunit, currentcharge, totalbill);
        try {
            billOperation.addRecord(billing); // add one record into text file
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        JOptionPane.showMessageDialog(null, "The record has been saved successfully in the text file");
    }

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {
        
        tfbilldate.setText("");
        tfaccnum.setText("");
        tfname.setText("");
        tfadd.setText("");
        tfarrears.setText("");
        tfcmr.setText("");
        tfpmr.setText("");
        tftunit.setText("");
        tfcc.setText("");
        tftbill.setText("");
        taDisplay.setText("");
        tblModel.setRowCount(0); // row in the table will be zero
    }

    private void btnDisplayAllActionPerformed(java.awt.event.ActionEvent evt) {
        
        ArrayList <Bill> bs;
        BillOperation billOperation = new BillOperation();
        
        taDisplay.setText("BILL LIST\n");
        taDisplay.append("\nACC NUM \tBILL DATE \tNAME \tADDRESS \t\tARREARS \t\tCMR \t\tPMR \t\tT.UNIT \t\tC.CHARGE \t\tT.BILL\n");
        
        tblModel = (DefaultTableModel) tblDisplay.getModel(); 
        tblModel.setRowCount(0);
        
        try 
        {
            
            bs = billOperation.displayAllRecord();
            for (int i=0; i<bs.size(); i++)
            {
                String accountnumber = String.valueOf(bs.get(i).getAccountnumber());
                String billdate = bs.get(i).getBilldate();
                String name = bs.get(i).getName();
                String address = bs.get(i).getAddress();
                String arrears = String.valueOf(bs.get(i).getArrears());
                String currentmeterreading = String.valueOf(bs.get(i).getCurrentmeterreading());
                String previousmeterreading = String.valueOf(bs.get(i).getPreviousmeterreading());
                String totalunit = String.valueOf(bs.get(i).getTotalunit());
                String currentcharge = String.valueOf(bs.get(i).getCurrentcharge()); 
                String totalbill = String.valueOf(bs.get(i).getTotalbill());
                taDisplay.append(accountnumber+"\t"+billdate+"\t"+name+"\t"+address+"\t\t"+arrears+"\t\t"+currentmeterreading+"\t\t"+previousmeterreading+"\t\t"+totalunit+"\t\t"+currentcharge+"\t\t"+totalbill+"\n");
                System.out.printf("%-6d %-25s %-10s %-25s %-10s %8.2f %8.2f  %8.2f  %8.2f \n",bs.get(i).getAccountnumber(),billdate, name, address, bs.get(i).getArrears(), bs.get(i).getCurrentmeterreading(), bs.get(i).getPreviousmeterreading(), bs.get(i).getTotalunit(), bs.get(i).getCurrentcharge(), bs.get(i).getTotalbill());
                
                String [] data = {accountnumber, billdate, name, address, arrears, currentmeterreading, previousmeterreading, totalunit, currentcharge, totalbill};
                tblModel.addRow(data); // add data into Jtable name
                
            }
        } catch (IOException ex) 
        {
            System.out.println(ex.getMessage());
        }
        
         
        
    }

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        BillOperation billOperation = new BillOperation();
        
        int accountnumber = Integer.parseInt(tfaccnum.getText());
        System.out.println("search staffno = "+accountnumber);
        
        Bill record = null;
        try
        {    
            record = billOperation.findRecord(accountnumber);
        }catch (IOException ex)
        {
            System.out.println(ex.getMessage());
        }
        if (record != null)
        {
            accountnumber = record.getAccountnumber();
            String billdate = record.getBilldate();
            String name = record.getName();
            String address = record.getAddress();
            double arrears = record.getArrears();
            double currentmeterreading = record.getCurrentmeterreading();
            double previousmeterreading = record.getPreviousmeterreading();
            double totalunit = record.getTotalunit();
            double currentcharge = record.getCurrentcharge();
            double totalbill = record.getTotalbill();
            
            tfaccnum.setText(String.valueOf(accountnumber));
            tfbilldate.setText(billdate);
            tfname.setText(name);
            tfadd.setText(address);
            tfarrears.setText(String.valueOf(arrears));
            tfcmr.setText(String.valueOf(currentmeterreading));
            tfpmr.setText(String.valueOf(previousmeterreading));
            tftunit.setText(String.valueOf(totalunit));
            tfcc.setText(String.valueOf(currentcharge));
            tftbill.setText(String.valueOf(totalbill));
            
      
            taDisplay.setText("BILLING RECORD\n");
            taDisplay.append("\nACC NUM \tBILL DATE \tNAME \tADDRESS \tARREARS \tC.MeterReading \tP.MeterReading \tT.UNIT \tC.CHARGE \t\tT.BILL\n");
            taDisplay.append(accountnumber+"\t"+billdate+"\t"+name+"\t"+address+"\t"+arrears+"\t"+currentmeterreading+"\t\t"+previousmeterreading+"\t\t"+totalunit+"\t"+currentcharge+"\t"+totalbill+"\n");
            JOptionPane.showMessageDialog(null, "The record of "+accountnumber+" is found successfully");
        }
        else // if record == null
        {
            JOptionPane.showMessageDialog(null, "The record of "+accountnumber+" is not found");
            taDisplay.setText("The record of account number = "+accountnumber+" is not found");
        }
            
            
        
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        BillOperation billOperation = new BillOperation();
        ArrayList <Bill> bs = new ArrayList <Bill>();
        Bill b = null;
        
        int accountnumber = Integer.parseInt(tfaccnum.getText());
        System.out.println("search account number = "+accountnumber);
        
        try
        {
            bs = billOperation.readAllRecordFromFile(); // read all records in text file and store it in arraylist
            for(int i=0; i<bs.size(); i++)
            {
                if (accountnumber == bs.get(i).getAccountnumber())
                {
                    b = bs.get(i);
                    bs.remove(i);
                    billOperation.addAllRecordInFile(bs);
                    JOptionPane.showMessageDialog(null, "The record of \n" + b.getAccountnumber()+"\n"+ b.getName()+ "\n has been deleted successfully");
                    taDisplay.setText(" The record of "+ b.getAccountnumber() +"\t"+ b.getName()+ " has been deleted successfully");
                }
            }
            if (b == null)
                JOptionPane.showMessageDialog(null, " The record of "+accountnumber+" is not found");
        }
        catch(IOException ex)
        {
            System.out.println(ex.getMessage());
        }
    }

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {
        
        Bill billing;
        
        BillOperation billOperation = new BillOperation();
        
        int accountnumber = Integer.parseInt(tfaccnum.getText());
        String billdate = tfbilldate.getText();
        String name = tfname.getText();
        String address = tfadd.getText(); 
        double arrears = Double.parseDouble(tfarrears.getText());
        double currentmeterreading = Double.parseDouble(tfcmr.getText());
        double previousmeterreading = Double.parseDouble(tfpmr.getText());
        double totalunit = currentmeterreading - previousmeterreading;
        double currentcharge = Double.parseDouble(tfcc.getText());
        double totalbill = arrears + currentcharge;
        
        billing = new Bill(accountnumber, billdate, name, address, arrears, currentmeterreading, previousmeterreading, totalunit, currentcharge, totalbill);
        
        ArrayList <Bill> bs = new ArrayList <Bill>();
        try
        {
            bs = billOperation.readAllRecordFromFile();
        }
        catch (IOException ex)
        {
            System.out.println(ex.getMessage());
        }
        
        for (int i=0; i<bs.size(); i++)
        {
            if (billing.getAccountnumber() == bs.get(i).getAccountnumber())
                bs.set(i, billing); // update record in arraylist
        }
        
        try
        {
            billOperation.addAllRecordInFile(bs);
            JOptionPane.showMessageDialog(btnUpdate, " The record of "+ accountnumber + " has been updated successfully");
        }
        catch (IOException ex)
        {
            System.out.println(ex.getMessage());
        }
        
        
    }

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {
    	
        JFrame frame = new JFrame("EXIT");
        if(JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "EXIT",
        		JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION)
        {
        	JOptionPane.showMessageDialog(btnExit, "Thank you. Have a nice day!");
        System.exit(0);
        }        
    }

    
    public static void main(String args[]) {
   
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BillGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BillGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BillGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BillGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BillGUI().setVisible(true);
            }
        });
    }

    // Variables declaration 
    private javax.swing.JButton btnCalculate;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnDisplayAll;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnStore;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel lbldate;
    private javax.swing.JLabel lblaccnum;
    private javax.swing.JLabel lblname;
    private javax.swing.JLabel lbladd;
    private javax.swing.JLabel arrears;
    private javax.swing.JLabel lblcmr;
    private javax.swing.JLabel lblpmr;
    private javax.swing.JLabel lbltunit;
    private javax.swing.JLabel lblcc;
    private javax.swing.JScrollPane jScrollPane3;
    private JTextArea taDisplay;
    private javax.swing.JTable tblDisplay;
    private javax.swing.JTextField tfadd;
    private javax.swing.JTextField tfpmr;
    private javax.swing.JTextField tftunit;
    private javax.swing.JTextField tfaccnum;
    private javax.swing.JTextField tfcc;
    private javax.swing.JTextField tfcmr;
    private javax.swing.JTextField tfbilldate;
    private JTextField tfname;
    private JTextField tfarrears;
    private JTextField tftbill;
    private JLabel lbltbill;
    private JScrollPane scrollPane;
}

