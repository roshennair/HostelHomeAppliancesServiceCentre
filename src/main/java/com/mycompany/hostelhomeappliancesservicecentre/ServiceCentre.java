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
    private Customer currentCustomer;
    private Appointment currentAppointment;
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
    
    public Customer getCurrentCustomer() {
	return this.currentCustomer;
    }

    public void setCurrentCustomer(Customer currentCustomer) {
	this.currentCustomer = currentCustomer;
    }
    
    public Appointment getCurrentAppointment() {
        return this.currentAppointment;
    }
    
    public void setCurrentAppointment(Appointment currentAppointment) {
        this.currentAppointment = currentAppointment;
    }

    public JFrame getCurrentWindow() {
	return this.currentWindow;
    }

    public void setCurrentWindow(JFrame newWindow) {
	if (this.currentWindow != null) {
	    this.currentWindow.dispose();
	}
	this.currentWindow = newWindow;
	this.currentWindow.setVisible(true);
    }
    
    public void logout() {
	this.setCurrentEmployee(null);
	this.setCurrentCustomer(null);
	this.setCurrentWindow(new LoginForm());
    }
}
