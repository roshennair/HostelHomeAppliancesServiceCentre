/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hostelhomeappliancesservicecentre;

import java.time.LocalDateTime;

/**
 *
 * @author arvind
 */
public class Appointment {
    
    private static double pricePerHour;
    private String id;
    private Customer customer;
    private LocalDateTime time;
    private int durationInHours;
    private String appliance;
    private Technician technician;
    private boolean paid;
    private String feedback;
    
    public Appointment(
            double pricePerHour,
            String id,
            Customer customer,
            LocalDateTime time,
            int durationInHours,
            String appliance,
            Technician technician,
            boolean paid,
            String feedback
    ) {
        this.pricePerHour = pricePerHour;
        this.id = id;
        this.customer = customer;
        this.time = time;
        this.durationInHours = durationInHours;
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
//    public static Appointment parse(String appointmentID) {
//        
//    }
    
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
        return this.durationInHours;
    }
    
    public void setDurationInHours(int durationInHours) {
        this.durationInHours = durationInHours;
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
