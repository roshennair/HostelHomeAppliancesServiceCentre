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
        this.feedback = "";
    }
    
    public int getDurationInHours() {
        return Appointment.durationInHours;
    }
    
    public double getAppointmentPrice() {
        return Appointment.appointmentPrice;
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
        
        String id = appointmentDetails[0];
        String customerUsername = appointmentDetails[1];
        LocalDateTime dateTime = LocalDateTime.parse(appointmentDetails[2]);
        String appliance = appointmentDetails[3];
        String technicianUsername = appointmentDetails[4];
        Boolean paid = Boolean.parseBoolean(appointmentDetails[5]);
        String feedback = appointmentDetails[6];
        
        Customer customer = Customer.get(customerUsername);
        Technician technician = Technician.get(technicianUsername);
        
        return new Appointment(customer, dateTime, appliance, technician);
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
        result += appointment.getId();
        result += appointment.getCustomer().getUsername();
        result += appointment.getDateTime();
        result += appointment.getAppliance();
        result += appointment.getTechnician().getUsername();
        result += appointment.isPaid();
        result += appointment.getFeedback();
        
        return result;
    }
    
    public static boolean exists(int id) {
        return Appointment.get(id) != null;
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
    
//    Implement boolean to see if customer has paid or not
    public boolean isPaid() {
        return this.paid;
    }
    
    public String getFeedback() {
        return this.feedback;
    }
    
    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }
    
//    Implement GUI form to collect payment
    public void collectPayment() {
        
    }
    
//    Implement GUI form to generate reports and receipts
    public void generateReport() {
        
    }
}
