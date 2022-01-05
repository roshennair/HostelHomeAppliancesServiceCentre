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
public abstract class Employee extends Person {

    protected static final String fileName = "employees.txt";
    private String password;
    private String title;
    private double salary;

    public Employee(
	    String username,
	    String name,
	    LocalDate birthday,
	    String password,
	    String title,
	    double salary
    ) {
	super(username, name, birthday);
	this.password = password;
	this.title = title;
	this.salary = salary;
    }

    public String getPassword() {
	return this.password;
    }

    public void setPassword(String password) {
	this.password = password;
    }

    public String getTitle() {
	return this.title;
    }

    public void setTitle(String title) {
	this.title = title;
    }

    public double getSalary() {
	return this.salary;
    }

    public void setSalary(double salary) {
	this.salary = salary;
    }

    @Override
    public String toString() {
	String output = super.toString() + "\n";
	output += "Title: " + this.title + "\n";
	output += "Salary: RM" + this.salary;
	return output;
    }
}
