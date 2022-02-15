/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hostelhomeappliancesservicecentre;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author arvind
 */
public class Technician extends Employee {
    
    private static final String fileName = "technicians.txt";
    
    public Technician(
            String username,
            String name,
            LocalDate birthday,
            String password,
            double salary
    ) {
        super(username, name, birthday, password, "technician", salary);
    }
    
//    To implement a parsing method to go through file and return technician object
    private static Technician parse(String technicianLine) {
        String[] technicianDetails = technicianLine.split("\t");
        
        String username = technicianDetails[0];
        String name = technicianDetails[1];
        LocalDate birthday = LocalDate.parse(technicianDetails[2]);
        String password = technicianDetails[3];
        double salary = Double.parseDouble(technicianDetails[4]);
        
        return new Technician(username, name, birthday, password, salary);
    }
    
    public static Technician get(String username) {
        
        try {
            File techniciansFile = new File("data/" + Technician.fileName);
            Scanner fileReader = new Scanner(techniciansFile);
            
            while(fileReader.hasNextLine()) {
                String currentline = fileReader.nextLine();
                Technician currentTechnician = Technician.parse(currentline);
                
                if(currentTechnician.getUsername().equals(username)) {
                    return currentTechnician;
                }
            }
        }
        catch (FileNotFoundException exception){
            System.out.println("File not found: " + Technician.fileName);
        }
        
        return null;
    }
    
    public static ArrayList<Technician> getAll() {
	ArrayList<Technician> technicians = new ArrayList<Technician>();
	
	try {
	    File techniciansFile = new File("data/" + Technician.fileName);
	    Scanner fileScanner = new Scanner(techniciansFile);

	    while (fileScanner.hasNextLine()) {
		String currentLine = fileScanner.nextLine();
		Technician currentTechnician = Technician.parse(currentLine);
		technicians.add(currentTechnician);
	    }
	} catch (FileNotFoundException e) {
	    System.out.println("File not found: " + Technician.fileName);
	}
	
	return technicians;
    }
    
//    To return a boolean to see if username and password correspond with object
    public static boolean authenticate(String username, String password) {
        Technician matchingTechnician = Technician.get(username);
        return matchingTechnician != null && matchingTechnician.getPassword().equals(password);
    }
    
    
}
