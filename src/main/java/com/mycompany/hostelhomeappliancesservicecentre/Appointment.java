/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hostelhomeappliancesservicecentre;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author arvind
 */
public class Appointment {
    
    private static final String fileName = "appointments.txt";
    private static final int durationInHours = 1;
    private static final double appointmentPrice = 50;
    
    private int id;
    private Customer customer;
    private LocalDateTime dateTime;
    private String appliance;
    private Technician technician;
    private boolean paid;
    private String feedback;
    
    public Appointment(
            Customer customer,
            LocalDateTime dateTime,
            String appliance,
            Technician technician
    ) {
        this.id = Appointment.getNextId();
        this.customer = customer;
        this.dateTime = dateTime;
        this.appliance = appliance;
        this.technician = technician;
        this.paid = false;
        this.feedback = " ";
    }
    
    public Appointment(
            int id,
            Customer customer,
            LocalDateTime dateTime,
            String appliance,
            Technician technician,
            boolean paid,
            String feedback
    ) {
        this.id = id;
        this.customer = customer;
        this.dateTime = dateTime;
        this.appliance = appliance;
        this.technician = technician;
        this.paid = paid;
        this.feedback = feedback;
    }
    
        private static int getNextId() {
        try {
            File appointmentFile = new File("data/" + Appointment.fileName);
            Scanner fileReader = new Scanner(appointmentFile);
            
            if(Appointment.fileName.length() == 0) {
                int id = 1;
		return id;
            } else {
                int biggestId = 0;
                while(fileReader.hasNextLine()) {
                    String currentLine = fileReader.nextLine();
                    Appointment currentAppointment = Appointment.parse(currentLine);
                    if(currentAppointment.getId() > biggestId) {
                        biggestId = currentAppointment.getId();
                    }
                }
                return biggestId + 1;
            }
        } catch (FileNotFoundException e){
            System.out.println("File not found: " + Appointment.fileName);
        }
	
	return 0;
    }
       

//    Implement parsing feature to go through files and locate appointment ID
    public static Appointment parse(String appointmentLine) {
        String[] appointmentDetails = appointmentLine.split("\t");
        
        int id = Integer.parseInt(appointmentDetails[0]);
        String customerUsername = appointmentDetails[1];
        LocalDateTime dateTime = LocalDateTime.parse(appointmentDetails[2]);
        String appliance = appointmentDetails[3];
        String technicianUsername = appointmentDetails[4];
        Boolean paid = Boolean.parseBoolean(appointmentDetails[5]);
        String feedback = appointmentDetails[6];
        
        Customer customer = Customer.get(customerUsername);
        Technician technician = Technician.get(technicianUsername);
        
        return new Appointment(id, customer, dateTime, appliance, technician, paid, feedback);
    }
    
    
//    Return an appointment object from file
    public static Appointment get(int id) {
        
        try {
            File appointmentFile = new File("data/" + Appointment.fileName);
            Scanner fileReader = new Scanner(appointmentFile);
            
            while(fileReader.hasNextLine()) {
                String currentLine = fileReader.nextLine();
                Appointment currentAppointment = Appointment.parse(currentLine);
                
                if(currentAppointment.getId() == id) {
                    return currentAppointment;
                }
            }
        }
        catch (FileNotFoundException exception) {
            System.out.println("File not found: " + Appointment.fileName);
        }
        
        return null;
    }
    
    public static String stringify(Appointment appointment) {
        String result = "";
        result += Integer.toString(appointment.getId()) + "\t";
        result += appointment.getCustomer().getUsername() + "\t";
        result += appointment.getDateTime() + "\t";
        result += appointment.getAppliance() + "\t";
        result += appointment.getTechnician().getUsername() + "\t";
        result += appointment.isPaid() + "\t";
        result += appointment.getFeedback() + "\n";
        
        return result;
    }
    
    
    public static ArrayList<Appointment> getAll() {
	ArrayList<Appointment> appointments = new ArrayList<>();
	
	try {
	    File appointmentsFile = new File("data/" + Appointment.fileName);
	    Scanner fileScanner = new Scanner(appointmentsFile);

	    while (fileScanner.hasNextLine()) {
		String currentLine = fileScanner.nextLine();
		Appointment currentAppointment = Appointment.parse(currentLine);
		appointments.add(currentAppointment);
	    }
	} catch (FileNotFoundException e) {
	    System.out.println("File not found: " + Appointment.fileName);
	}
	
	return appointments;
    }
    
//    Implement functionality to cancel appointment
    public static void cancel(Appointment appointmentToCancel) {
        
        ArrayList<Appointment> appointments = new ArrayList<>();
        
        try {
            File appointmentsFile = new File("data/" + Appointment.fileName);
            Scanner fileScanner = new Scanner(appointmentsFile);
            
            while(fileScanner.hasNextLine()) {
                String currentLine = fileScanner.nextLine();
                Appointment currentAppointment = Appointment.parse(currentLine);
                
                if(!(currentAppointment.getId() == appointmentToCancel.getId())) {
                    appointments.add(currentAppointment);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + Appointment.fileName);
        }
        
        try {
            FileWriter fileWriter = new FileWriter("data/" + Appointment.fileName);
            for(Appointment appointment: appointments) {
                fileWriter.write(Appointment.stringify(appointment));
            }
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("Could not write to file: " + Appointment.fileName);
        }
    }
    
    public static boolean book(Appointment appointmentToBook) {
        
        if(slotAvailable(appointmentToBook)) {
            try {
		// create file writer with append mode enabled
		FileWriter fileWriter = new FileWriter("data/" + Appointment.fileName, true);
		fileWriter.write(Appointment.stringify(appointmentToBook));
		fileWriter.close();
		return true;
	    } catch (IOException e) {
		System.out.println("Could not write to file: " + Appointment.fileName);
	    }
        }
        
        return false;
        
    }
    
    public static boolean slotAvailable(Appointment appointmentToCheck) {
        
        try {
            File appointmentsFile = new File("data/" + Appointment.fileName);
            Scanner fileScanner = new Scanner(appointmentsFile);
            
            while(fileScanner.hasNextLine()) {
                String currentLine = fileScanner.nextLine();
                Appointment currentAppointment = Appointment.parse(currentLine);
                
                
                if ((currentAppointment.getDateTime().isEqual(appointmentToCheck.getDateTime())) 
                    && ((currentAppointment.getTechnician().getUsername().equals(appointmentToCheck.getTechnician().getUsername())) || 
                        currentAppointment.getCustomer().getUsername().equals(appointmentToCheck.getCustomer().getUsername())) && 
                        !(currentAppointment.getId() == appointmentToCheck.getId())){
                        return false;
                }
            }
            
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + Appointment.fileName);
        }
        
        
        return true;
    }
    
    public static boolean exists(int appointmentId) {
	return Appointment.get(appointmentId) != null;
    }
    
    public static boolean update(Appointment updatedAppointment) {	
	if (Appointment.exists(updatedAppointment.getId()) && Appointment.slotAvailable(updatedAppointment)) {
	    ArrayList<Appointment> appointments = new ArrayList<>();
	    
	    try {
		File appointmentsFile = new File("data/" + Appointment.fileName);
		Scanner fileScanner = new Scanner(appointmentsFile);

		while (fileScanner.hasNextLine()) {
		    String currentLine = fileScanner.nextLine();
                    Appointment currentAppointment = Appointment.parse(currentLine);
                    
		    if (currentAppointment.getId() == updatedAppointment.getId()) {
			appointments.add(updatedAppointment);
		    } else {
			appointments.add(currentAppointment);
		    }
		}
	    } catch (FileNotFoundException e) {
		System.out.println("File not found: " + Appointment.fileName);
	    }

	    try {
		FileWriter fileWriter = new FileWriter("data/" + Appointment.fileName);
		for (Appointment appointment: appointments) {   
		    fileWriter.write(Appointment.stringify(appointment));
		}
		fileWriter.close();
		return true;
	    } catch (IOException e) {
		System.out.println("Could not write to file: " + Appointment.fileName);
	    }
	}
	
	return false;
    }
    
    public static int getDurationInHours() {
        return Appointment.durationInHours;
    }
    
    public static double getAppointmentPrice() {
        return Appointment.appointmentPrice;
    }
    
    public int getId() {
        return this.id;
    }
    
    public Customer getCustomer() {
        return this.customer;
    }
    
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    
    public LocalDateTime getDateTime() {
        return this.dateTime;
    }
    
    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }
    
    public String getAppliance() {
        return this.appliance;
    }
    
    public void setAppliance(String appliance) {
        this.appliance = appliance;
    }
    
    public Technician getTechnician() {
        return this.technician;
    }
    
    public void setTechnician(Technician technician) {
        this.technician = technician;
    }
    
    public boolean isPaid() {
        return this.paid;
    }
    
    public void setPaid(boolean paid) {
        this.paid = paid;
    }
    
    public String getFeedback() {
        return this.feedback;
    }
    
    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }
    
}
