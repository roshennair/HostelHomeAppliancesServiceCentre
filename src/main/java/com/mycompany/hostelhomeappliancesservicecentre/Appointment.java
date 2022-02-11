/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hostelhomeappliancesservicecentre;

import java.time.LocalDateTime;
import java.util.Vector;

/**
 *
 * @author arvind
 */
public class Appointment {
    
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
//    public static Appointment parse(String appointmentLine) {
//        String[] appointmentDetails = appointmentLine.split("\t");
        
        // double pricePerHour = Double.parseDouble(appointmentDetails[0]);
        // Revise the elements
//        String id = appointmentDetails[1];
//        String customerUsername = appointmentDetails[2];
//        LocalDateTime time = LocalDateTime.parse(appointmentDetails[3]);
//        int durationInHours = Integer.parseInt(appointmentDetails[4]);
//        String appliance = appointmentDetails[5];
//        String technicianUsername = appointmentDetails[6];
//        Boolean paid = Boolean.parseBoolean(appointmentDetails[7]);
//        String feedback = appointmentDetails[8];
//        
//        Customer customer = Customer.get(customerUsername);
//        
//        return new Appointment(id, customer, time, duration, appliance, technician, true, feedback);
//    }
    
    // Add in new method, check if last ID exists, if not, scan file and read these ID.
    
//    Return an appointment object from file
//    public static Appointment get(String appointmentID) {
//        
//    }
    
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
    
    public int getDurationInHours() {
        return this.duration;
    }
    
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
