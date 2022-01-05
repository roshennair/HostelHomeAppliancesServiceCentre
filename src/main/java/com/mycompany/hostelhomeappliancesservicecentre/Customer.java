/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hostelhomeappliancesservicecentre;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
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

    // TODO: Implement phone number validation using RegExp
    private static boolean validatePhoneNumber(String phoneNumber) {
        return false;
    }

    // TODO: Implement email validation using RegExp
    private static boolean validateEmail(String email) {
        return false;
    }

    // TODO: Implement bank card validation using RegExp
    private static boolean validateBankCard(String bankCard) {
        return false;
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
