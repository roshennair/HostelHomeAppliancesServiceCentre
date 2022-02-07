/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.hostelhomeappliancesservicecentre;

import java.util.ArrayList;
import java.time.LocalDate;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Roshen NairW
 */
public class CustomerSearchForm extends javax.swing.JFrame {

    /**
     * Creates new form CustomerSearch
     */
    public CustomerSearchForm() {
	initComponents();
    }
    
//    private void populateCustomersTable() {
//	ArrayList<Customers> customers = Customer.getAll();
//	
//    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        systemTitleLabel = new javax.swing.JLabel();
        formTitleLabel = new javax.swing.JLabel();
        customersTableScrollPane = new javax.swing.JScrollPane();
        customersTable = new javax.swing.JTable();
        customerSearchField = new javax.swing.JTextField();
        customerSearchLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Customer Search Form");
        setResizable(false);

        systemTitleLabel.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        systemTitleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        systemTitleLabel.setText("APU Hostel Home Appliances Service Centre");

        formTitleLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        formTitleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        formTitleLabel.setText("Customer Search");
        formTitleLabel.setPreferredSize(new java.awt.Dimension(551, 434));

        ArrayList<Customer> customers = Customer.getAll();
        Object[][] customersData = new Object[customers.size()][7];
        for (int i = 0; i < customers.size(); i++) {
            String username = customers.get(i).getUsername();
            String name = customers.get(i).getName();
            LocalDate birthday = customers.get(i).getBirthday();
            String phoneNumber = customers.get(i).getPhoneNumber();
            String email = customers.get(i).getEmail();
            String address = customers.get(i).getAddress();
            String bankCard = customers.get(i).getBankCard();
            Object[] currentCustomer = {username, name, birthday, phoneNumber, email, address, bankCard};
            customersData[i] = currentCustomer;
        }
        customersTable.setModel(new javax.swing.table.DefaultTableModel(
            customersData,
            new String [] {
                "Customer ID", "Name", "Birthday", "Phone number", "Email address", "Address", "Bank card number"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        customersTable.setColumnSelectionAllowed(true);
        customersTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        customersTable.getTableHeader().setReorderingAllowed(false);
        customersTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                customersTableMouseClicked(evt);
            }
        });
        customersTableScrollPane.setViewportView(customersTable);
        customersTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        customerSearchField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                customerSearchFieldKeyReleased(evt);
            }
        });

        customerSearchLabel.setText("Search");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(systemTitleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(formTitleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 813, Short.MAX_VALUE)
                            .addComponent(customersTableScrollPane)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(230, 230, 230)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(customerSearchLabel)
                            .addComponent(customerSearchField, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(systemTitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(formTitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(customerSearchLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(customerSearchField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(customersTableScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void search(String searchString) {
	DefaultTableModel customersTableModel = (DefaultTableModel) this.customersTable.getModel();
	TableRowSorter<DefaultTableModel> rowSorter = new TableRowSorter<>(customersTableModel);
	this.customersTable.setRowSorter(rowSorter);
	rowSorter.setRowFilter(RowFilter.regexFilter(searchString));
    }
    
    private void customerSearchFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_customerSearchFieldKeyReleased
        String searchString = this.customerSearchField.getText();
	this.search(searchString);
    }//GEN-LAST:event_customerSearchFieldKeyReleased

    private void customersTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customersTableMouseClicked
        int selectedRow = this.customersTable.getSelectedRow();
	
	if (selectedRow != -1) {
	    String selectedCustomerUsername = String.valueOf(this.customersTable.getValueAt(selectedRow, 0));
	    ServiceCentre.getInstance().setCurrentCustomer(Customer.get(selectedCustomerUsername));
	    ServiceCentre.getInstance().setCurrentWindow(new CustomerMenu());
	}
    }//GEN-LAST:event_customersTableMouseClicked
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
	/* Set the Nimbus look and feel */
	//<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
	/* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
	 */
	try {
	    for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
		if ("Nimbus".equals(info.getName())) {
		    javax.swing.UIManager.setLookAndFeel(info.getClassName());
		    break;
		}
	    }
	} catch (ClassNotFoundException ex) {
	    java.util.logging.Logger.getLogger(CustomerSearchForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	} catch (InstantiationException ex) {
	    java.util.logging.Logger.getLogger(CustomerSearchForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	} catch (IllegalAccessException ex) {
	    java.util.logging.Logger.getLogger(CustomerSearchForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	} catch (javax.swing.UnsupportedLookAndFeelException ex) {
	    java.util.logging.Logger.getLogger(CustomerSearchForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	}
	//</editor-fold>
	//</editor-fold>

	/* Create and display the form */
	java.awt.EventQueue.invokeLater(new Runnable() {
	    public void run() {
		new CustomerSearchForm().setVisible(true);
	    }
	});
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField customerSearchField;
    private javax.swing.JLabel customerSearchLabel;
    private javax.swing.JTable customersTable;
    private javax.swing.JScrollPane customersTableScrollPane;
    private javax.swing.JLabel formTitleLabel;
    private javax.swing.JLabel systemTitleLabel;
    // End of variables declaration//GEN-END:variables
}
