/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.hostelhomeappliancesservicecentre;

import java.time.LocalDate;

/**
 *
 * @author Roshen Nair
 */
public class CustomerRegistrationForm extends javax.swing.JFrame {

    /**
     * Creates new form CustomerRegistrationForm
     */
    public CustomerRegistrationForm() {
	initComponents();
    }

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
        usernameLabel = new javax.swing.JLabel();
        usernameField = new javax.swing.JTextField();
        nameLabel = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        birthdayLabel = new javax.swing.JLabel();
        phoneNumberField = new javax.swing.JTextField();
        phoneNumberLabel = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        emailField = new javax.swing.JTextField();
        addressLabel = new javax.swing.JLabel();
        bankCardField = new javax.swing.JTextField();
        bankCardLabel = new javax.swing.JLabel();
        registerButton = new javax.swing.JButton();
        dayLabel = new javax.swing.JLabel();
        monthLabel = new javax.swing.JLabel();
        yearLabel = new javax.swing.JLabel();
        addressField = new javax.swing.JTextArea();
        dayField = new javax.swing.JComboBox<>();
        monthField = new javax.swing.JComboBox<>();
        yearField = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        systemTitleLabel.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        systemTitleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        systemTitleLabel.setText("APU Hostel Home Appliances Service Centre");

        formTitleLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        formTitleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        formTitleLabel.setText("Customer Registration Form");
        formTitleLabel.setPreferredSize(new java.awt.Dimension(551, 434));

        usernameLabel.setText("Username");

        usernameField.setName("username"); // NOI18N
        usernameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameFieldActionPerformed(evt);
            }
        });

        nameLabel.setText("Name");

        nameField.setName("username"); // NOI18N
        nameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameFieldActionPerformed(evt);
            }
        });

        birthdayLabel.setText("Birthday:");

        phoneNumberField.setName("username"); // NOI18N
        phoneNumberField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneNumberFieldActionPerformed(evt);
            }
        });

        phoneNumberLabel.setText("Phone number");

        emailLabel.setText("Email address");

        emailField.setName("username"); // NOI18N
        emailField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailFieldActionPerformed(evt);
            }
        });

        addressLabel.setText("House address");

        bankCardField.setName("username"); // NOI18N
        bankCardField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bankCardFieldActionPerformed(evt);
            }
        });

        bankCardLabel.setText("Bank card number");

        registerButton.setText("Register");
        registerButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        registerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerButtonActionPerformed(evt);
            }
        });

        dayLabel.setText("Day");

        monthLabel.setText("Month");

        yearLabel.setText("Year");

        addressField.setColumns(20);
        addressField.setRows(5);

        dayField.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        monthField.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));

        int minYear = 1900;
        int maxYear = 2022;
        String[] years = new String[maxYear - minYear + 1];
        for (int i = 0, j = minYear; j <= maxYear; i++, j++) {
            years[i] = String.valueOf(j);
        }
        yearField.setModel(new javax.swing.DefaultComboBoxModel<>(years));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(systemTitleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 515, Short.MAX_VALUE)
                            .addComponent(formTitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addressField, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(usernameField, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(usernameLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 429, Short.MAX_VALUE)
                                .addComponent(nameLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 429, Short.MAX_VALUE)
                                .addComponent(nameField, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(birthdayLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 429, Short.MAX_VALUE)
                                .addComponent(phoneNumberField, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(phoneNumberLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 429, Short.MAX_VALUE)
                                .addComponent(emailLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 429, Short.MAX_VALUE)
                                .addComponent(emailField, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(addressLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 429, Short.MAX_VALUE)
                                .addComponent(bankCardField, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(bankCardLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 429, Short.MAX_VALUE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(dayLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(dayField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(monthLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(monthField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(yearLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(yearField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(registerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(systemTitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(formTitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(usernameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(birthdayLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dayLabel)
                    .addComponent(monthLabel)
                    .addComponent(yearLabel)
                    .addComponent(dayField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(monthField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(yearField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(phoneNumberLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(phoneNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(emailLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(addressLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addressField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bankCardLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bankCardField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(registerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleName("Customer Registration Form");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usernameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameFieldActionPerformed
	// TODO add your handling code here:
    }//GEN-LAST:event_usernameFieldActionPerformed

    private void nameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameFieldActionPerformed
	// TODO add your handling code here:
    }//GEN-LAST:event_nameFieldActionPerformed

    private void phoneNumberFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneNumberFieldActionPerformed
	// TODO add your handling code here:
    }//GEN-LAST:event_phoneNumberFieldActionPerformed

    private void emailFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailFieldActionPerformed
	// TODO add your handling code here:
    }//GEN-LAST:event_emailFieldActionPerformed

    private void bankCardFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bankCardFieldActionPerformed
	// TODO add your handling code here:
    }//GEN-LAST:event_bankCardFieldActionPerformed

    private void registerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerButtonActionPerformed
	String username = this.usernameField.getText();
	String name = this.nameField.getText();
	int year = Integer.valueOf(this.yearField.getSelectedItem().toString());
	int month = Integer.valueOf(this.monthField.getSelectedItem().toString());
	int day = Integer.valueOf(this.dayField.getSelectedItem().toString());
	LocalDate birthday = LocalDate.of(year, month, day);
	String phoneNumber = this.phoneNumberField.getText();
	String email = this.emailField.getText();
	String address = this.addressField.getText();
	String bankCard = this.bankCardField.getText();

	Customer newCustomer = new Customer(username, name, birthday, phoneNumber, email, address, bankCard);
	
	// TODO: Check if customer exists, if yes, show error message, else add new line to customers text file
    }//GEN-LAST:event_registerButtonActionPerformed

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
	    java.util.logging.Logger.getLogger(CustomerRegistrationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	} catch (InstantiationException ex) {
	    java.util.logging.Logger.getLogger(CustomerRegistrationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	} catch (IllegalAccessException ex) {
	    java.util.logging.Logger.getLogger(CustomerRegistrationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	} catch (javax.swing.UnsupportedLookAndFeelException ex) {
	    java.util.logging.Logger.getLogger(CustomerRegistrationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	}
	//</editor-fold>

	/* Create and display the form */
	java.awt.EventQueue.invokeLater(new Runnable() {
	    public void run() {
		new CustomerRegistrationForm().setVisible(true);
	    }
	});
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea addressField;
    private javax.swing.JLabel addressLabel;
    private javax.swing.JTextField bankCardField;
    private javax.swing.JLabel bankCardLabel;
    private javax.swing.JLabel birthdayLabel;
    private javax.swing.JComboBox<String> dayField;
    private javax.swing.JLabel dayLabel;
    private javax.swing.JTextField emailField;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JLabel formTitleLabel;
    private javax.swing.JComboBox<String> monthField;
    private javax.swing.JLabel monthLabel;
    private javax.swing.JTextField nameField;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField phoneNumberField;
    private javax.swing.JLabel phoneNumberLabel;
    private javax.swing.JButton registerButton;
    private javax.swing.JLabel systemTitleLabel;
    private javax.swing.JTextField usernameField;
    private javax.swing.JLabel usernameLabel;
    private javax.swing.JComboBox<String> yearField;
    private javax.swing.JLabel yearLabel;
    // End of variables declaration//GEN-END:variables
}
