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
        Manager m1 = Manager.get("manager2");
        System.out.println(m1);
	
	Customer c1 = Customer.get("cust2");
	System.out.println(c1);
    }
}
