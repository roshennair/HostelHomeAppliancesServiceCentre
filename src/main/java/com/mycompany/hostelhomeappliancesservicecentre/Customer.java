/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hostelhomeappliancesservicecentre;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Roshen Nair
 */
public class Customer extends Person {

    private static final String fileName = "customers.txt";
    private String phoneNumber;
    private String email;
    private String address;
    private String bankCard;

    public Customer(
	    String username,
	    String name,
	    LocalDate birthday,
	    String phoneNumber,
	    String email,
	    String address,
	    String bankCard
    ) {
	super(username, name, birthday);
	this.phoneNumber = phoneNumber;
	this.email = email;
	this.address = address;
	this.bankCard = bankCard;
    }

    private static Customer parse(String customerLine) {
	String[] customerDetails = customerLine.split("\t");

	String username = customerDetails[0];
	String name = customerDetails[1];
	LocalDate birthday = LocalDate.parse(customerDetails[2]);
	String phoneNumber = customerDetails[3];
	String email = customerDetails[4];
	String address = customerDetails[5];
	String bankCard = customerDetails[6];

	return new Customer(username, name, birthday, phoneNumber, email, address, bankCard);
    }
    
    private static boolean exists(String username) {
	return Customer.get(username) != null;
    }

    private static String stringify(Customer customer) {
	String result = "";
	result += customer.getUsername() + "\t";
	result += customer.getName() + "\t";
	result += customer.getBirthday() + "\t";
	result += customer.getPhoneNumber() + "\t";
	result += customer.getEmail() + "\t";
	result += customer.getAddress() + "\t";
	result += customer.getBankCard() + "\n";
	return result;
    }

    // Returns true for any phone number that starts with +60 followed by 8-10 digits
    public static boolean isValidPhoneNumber(String phoneNumber) {
	return phoneNumber.matches("\\+60[0-9]{8,10}");
    }

    // Returns true for any email address that only contains letters, numbers, dashes, underscores and dots
    public static boolean isValidEmail(String email) {
	return email.matches("[A-Za-z0-9_.-]+@[A-Za-z0-9_.-]+");
    }

    // Returns true for any bank card number that contains 8-19 digits
    public static boolean isValidBankCard(String bankCard) {
	return bankCard.matches("[0-9]{8,19}");
    }
    

    
    public static Customer get(String username) {
	try {
	    File customersFile = new File("data/" + Customer.fileName);
	    Scanner fileScanner = new Scanner(customersFile);

	    while (fileScanner.hasNextLine()) {
		String currentLine = fileScanner.nextLine();
		Customer currentCustomer = Customer.parse(currentLine);
		if (currentCustomer.getUsername().equals(username)) {
		    return currentCustomer;
		}
	    }
	} catch (FileNotFoundException e) {
	    System.out.println("File not found: " + Customer.fileName);
	}

	return null;
    }
    
    public static ArrayList<Customer> getAll() {
	ArrayList<Customer> customers = new ArrayList<Customer>();
	
	try {
	    File customersFile = new File("data/" + Customer.fileName);
	    Scanner fileScanner = new Scanner(customersFile);

	    while (fileScanner.hasNextLine()) {
		String currentLine = fileScanner.nextLine();
		Customer currentCustomer = Customer.parse(currentLine);
		customers.add(currentCustomer);
	    }
	} catch (FileNotFoundException e) {
	    System.out.println("File not found: " + Customer.fileName);
	}
	
	return customers;
    }

    public static boolean register(Customer customer) {
	// ensure customer does not already exist 
	if (!Customer.exists(customer.getUsername())) {
	    try {
		// create file writer with append mode enabled
		FileWriter fileWriter = new FileWriter("data/" + Customer.fileName, true);
		fileWriter.write(Customer.stringify(customer));
		fileWriter.close();
		return true;
	    } catch (IOException e) {
		System.out.println("Could not write to file: " + Customer.fileName);
	    }
	}
	
	return false;
    }
    
    public static boolean update(Customer updatedCustomer) {	
	if (Customer.exists(updatedCustomer.getUsername())) {
	    ArrayList<Customer> customers = new ArrayList<Customer>();
	    
	    // read all customers into arraylist
	    try {
		File customersFile = new File("data/" + Customer.fileName);
		Scanner fileScanner = new Scanner(customersFile);

		while (fileScanner.hasNextLine()) {
		    String currentLine = fileScanner.nextLine();
		    Customer currentCustomer = Customer.parse(currentLine);
		    // if matching username, replace with updated customer
		    if (currentCustomer.getUsername().equals(updatedCustomer.getUsername())) {
			customers.add(updatedCustomer);
		    } else {
			customers.add(currentCustomer);
		    }
		}
	    } catch (FileNotFoundException e) {
		System.out.println("File not found: " + Customer.fileName);
	    }

	    // overwrite customers file with updated customers
	    try {
		FileWriter fileWriter = new FileWriter("data/" + Customer.fileName);
		for (Customer customer: customers) {   
		    fileWriter.write(Customer.stringify(customer));
		}
		fileWriter.close();
		return true;
	    } catch (IOException e) {
		System.out.println("Could not write to file: " + Customer.fileName);
	    }
	}
	
	return false;
    }
    
    public String getPhoneNumber() {
	return this.phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
	this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
	return this.email;
    }

    public void setEmail(String email) {
	this.email = email;
    }

    public String getAddress() {
	return this.address;
    }

    public void setAddress(String address) {
	this.address = address;
    }

    public String getBankCard() {
	return this.bankCard;
    }

    public void setBankCard(String bankCard) {
	this.bankCard = bankCard;
    }

    @Override
    public String toString() {
	String output = super.toString() + "\n";
	output += "Phone number: " + this.phoneNumber + "\n";
	output += "Email: " + this.email + "\n";
	output += "Address: " + this.address + "\n";
	output += "Bank card: " + this.bankCard;
	return output;
    }
}
