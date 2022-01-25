/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hostelhomeappliancesservicecentre;

/**
 *
 * @author Roshen Nair
 */
// TODO: Create HHASC singleton class to store globally accessible state
public class HHASCSystem {
    private static HHASCSystem systemInstance;
    private Employee currentEmployee;
    private String currentAccountType;
    
    public static HHASCSystem getInstance() {
	if (HHASCSystem.systemInstance == null) {
	    HHASCSystem.systemInstance = new HHASCSystem();
	}
	
	return HHASCSystem.systemInstance;
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
}
