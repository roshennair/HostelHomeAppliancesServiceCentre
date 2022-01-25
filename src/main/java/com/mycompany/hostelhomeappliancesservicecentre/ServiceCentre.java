/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hostelhomeappliancesservicecentre;

/**
 *
 * @author Roshen Nair
 */
public class ServiceCentre {
    private static ServiceCentre serviceCentreInstance;
    private Employee currentEmployee;
    
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
    
    public void logout() {
	this.currentEmployee = null;
	LoginForm loginForm = new LoginForm();
	loginForm.setVisible(true);
    }
}
