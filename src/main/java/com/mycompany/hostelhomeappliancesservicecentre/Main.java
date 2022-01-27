/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hostelhomeappliancesservicecentre;

import java.time.LocalDate;

/**
 *
 * @author Roshen Nair
 */
public class Main {
    public static void main(String[] args) {
	// Generate new instance of HHASC system and display login form
	ServiceCentre.getInstance().setCurrentWindow(new LoginForm());
    }
}
