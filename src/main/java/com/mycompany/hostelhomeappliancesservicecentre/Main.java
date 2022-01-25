/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hostelhomeappliancesservicecentre;

/**
 *
 * @author Roshen Nair
 */
public class Main {
    public static void main(String[] args) {
	// Generate new instance of HHASC system
	ServiceCentre.getInstance();
	LoginForm loginForm = new LoginForm();
	loginForm.setVisible(true);
    }
}
