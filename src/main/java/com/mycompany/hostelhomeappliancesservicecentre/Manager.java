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
public class Manager extends Employee {
    private static final String fileName = "managers.txt";

    public Manager(
            String username,
            String name,
            LocalDate birthday,
            String password,
            double salary
    ) {
        super(username, name, birthday, password, "manager", salary);
    }
    
    private static Manager parse(String managerLine) {
	String[] managerDetails = managerLine.split("\t");
	
        String username = managerDetails[0];
        String name = managerDetails[1];
        LocalDate birthday = LocalDate.parse(managerDetails[2]);
        String password = managerDetails[3];
        double salary = Double.parseDouble(managerDetails[4]);
	
	return new Manager(username, name, birthday, password, salary);
    }

    public static Manager get(String username) {
        try {
            File managersFile = new File("data/" + Manager.fileName);
            Scanner fileScanner = new Scanner(managersFile);

            while (fileScanner.hasNextLine()) {
                String currentLine = fileScanner.nextLine();
                Manager currentManager = Manager.parse(currentLine);
                if (currentManager.getUsername().equals(username)) {
                    return currentManager;
		}
            }
	} catch (FileNotFoundException e) {
            System.out.println("File not found: " + Manager.fileName);
	}

        return null;
    }

    public static boolean authenticate(String username, String password) {
        Manager matchingManager = Manager.get(username);
        return matchingManager != null && matchingManager.getPassword().equals(password);
    }

}
