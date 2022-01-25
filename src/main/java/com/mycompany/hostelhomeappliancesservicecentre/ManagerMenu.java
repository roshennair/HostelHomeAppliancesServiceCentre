/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.hostelhomeappliancesservicecentre;

/**
 *
 * @author Roshen Nair
 */
public class ManagerMenu extends javax.swing.JFrame {

    /**
     * Creates new form ManagerMenu
     */
    public ManagerMenu() {
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
        registerCustomerButton = new javax.swing.JButton();
        searchCustomerButton = new javax.swing.JButton();
        logoutButton = new javax.swing.JButton();
        welcomeMessage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Manager Menu");

        systemTitleLabel.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        systemTitleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        systemTitleLabel.setText("Manager Menu");
        systemTitleLabel.setPreferredSize(new java.awt.Dimension(551, 434));

        registerCustomerButton.setText("Register new customer");

        searchCustomerButton.setText("Search for a customer");
        searchCustomerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchCustomerButtonActionPerformed(evt);
            }
        });

        logoutButton.setText("Log out");
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });

        welcomeMessage.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        welcomeMessage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        welcomeMessage.setText("Welcome, " + HHASCSystem.getInstance().getCurrentEmployee().getName());
        welcomeMessage.setPreferredSize(new java.awt.Dimension(551, 434));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(systemTitleLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(welcomeMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
            .addGroup(layout.createSequentialGroup()
                .addGap(201, 201, 201)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(registerCustomerButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(searchCustomerButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(logoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(systemTitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(welcomeMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(registerCustomerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(searchCustomerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(logoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(92, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchCustomerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchCustomerButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchCustomerButtonActionPerformed

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_logoutButtonActionPerformed

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
	    java.util.logging.Logger.getLogger(ManagerMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	} catch (InstantiationException ex) {
	    java.util.logging.Logger.getLogger(ManagerMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	} catch (IllegalAccessException ex) {
	    java.util.logging.Logger.getLogger(ManagerMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	} catch (javax.swing.UnsupportedLookAndFeelException ex) {
	    java.util.logging.Logger.getLogger(ManagerMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	}
	//</editor-fold>

	/* Create and display the form */
	java.awt.EventQueue.invokeLater(new Runnable() {
	    public void run() {
		new ManagerMenu().setVisible(true);
	    }
	});
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton logoutButton;
    private javax.swing.JButton registerCustomerButton;
    private javax.swing.JButton searchCustomerButton;
    private javax.swing.JLabel systemTitleLabel;
    private javax.swing.JLabel welcomeMessage;
    // End of variables declaration//GEN-END:variables
}