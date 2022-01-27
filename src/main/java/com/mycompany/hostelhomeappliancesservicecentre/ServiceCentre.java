/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hostelhomeappliancesservicecentre;

import javax.swing.JFrame;

/**
 *
 * @author Roshen Nair
 */
public class ServiceCentre {
    private static ServiceCentre serviceCentreInstance;
    private Employee currentEmployee;
    private JFrame currentWindow;
    
    public static ServiceCentre getInstance() {
	if (ServiceCentre.serviceCentreInstance == null) {
	    ServiceCentre.serviceCentreInstance = new ServiceCentre();
	}
	
	return ServiceCentre.serviceCentreInstance;
    }
    
    public Employee getCurrentEmployee() {
	return this.currentEmployee;
    }

    public void setCurrentEmployee(Employee currentEmployee) {
	this.currentEmployee = currentEmployee;
    }
    
    public String getCurrentAccountType() {
	return this.currentEmployee.getClass().getSimpleName();
    }

    public JFrame getCurrentWindow() {
	return currentWindow;
    }

    public void setCurrentWindow(JFrame newWindow) {
	this.currentWindow.dispose();
	this.currentWindow = newWindow;
	this.currentWindow.setVisible(true);
    }
    
    public void logout() {
	this.setCurrentEmployee(null);
	this.setCurrentWindow(new LoginForm());
    }
}
