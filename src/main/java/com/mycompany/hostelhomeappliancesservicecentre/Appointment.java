/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hostelhomeappliancesservicecentre;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDateTime;
import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author arvind
 */
public class Appointment {
    
    private static final String fileName = "appointments.txt";
    
    private static double pricePerHour = 50;
    private String id;
    private Customer customer;
    private LocalDateTime time;
    private AppointmentDuration duration;
    private String appliance;
    private Technician technician;
    private boolean paid;
    private String feedback;
    
    public Appointment(
            String id,
            Customer customer,
            LocalDateTime time,
            AppointmentDuration duration,
            String appliance,
            Technician technician,
            boolean paid,
            String feedback
    ) {
        this.id = id;
        this.customer = customer;
        this.time = time;
        this.duration = duration;
        this.appliance = appliance;
        this.technician = technician;
        this.paid = paid;
        this.feedback = feedback;
    }
    
//    Implement feature to either randomly generate next ID or increment last ID
//    private static String getNextId() {
//        
//    }
    
//    Implement parsing feature to go through files and locate appointment ID
    public static Appointment parse(String appointmentLine) {
        String[] appointmentDetails = appointmentLine.split("\t");
        
        // Revise the elements
        String id = appointmentDetails[0];
        String customerUsername = appointmentDetails[1];
        LocalDateTime time = LocalDateTime.parse(appointmentDetails[2]);
        AppointmentDuration duration = AppointmentDuration.valueOf(appointmentDetails[3]);
        String appliance = appointmentDetails[4];
        String technicianUsername = appointmentDetails[5];
        Boolean paid = Boolean.parseBoolean(appointmentDetails[6]);
        String feedback = appointmentDetails[7];
        
        Customer customer = Customer.get(customerUsername);
        Technician technician = Technician.get(technicianUsername);
        
        return new Appointment(id, customer, time, duration, appliance, technician, paid, feedback);
    }
    
    // Add in new method, check if last ID exists, if not, scan file and read existing IDs.
    
//    Return an appointment object from file
    public static Appointment get(String id) {
        
        try {
            File appointmentFile = new File("data/" + Appointment.fileName);
            Scanner fileReader = new Scanner(appointmentFile);
            
            while(fileReader.hasNextLine()) {
                String currentLine = fileReader.nextLine();
                Appointment currentAppointment = Appointment.parse(currentLine);
                
                if(currentAppointment.getID().equals(id)) {
                    return currentAppointment;
                }
            }
        }
        catch (FileNotFoundException exception) {
            System.out.println("File not found: " + Appointment.fileName);
        }
        
        return null;
    }
    
//    Implement functionality to cancel appointment
    public static void cancel(String appointmentID) {
        
    }
    
    public String getID() {
        return this.id;
    }
    
    public Customer getCustomer() {
        return this.customer;
    }
    
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    
    public LocalDateTime getTime() {
        return this.time;
    }
    
    public void setTime(LocalDateTime time) {
        this.time = time;
    }
    
//    public enum getDurationInHours() {
//        return this.duration;
//    }
    
    public void setDurationInHours(int durationInHours) {
        this.duration = duration;
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
//    public boolean getPaid() {
//        
//    }
    
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
