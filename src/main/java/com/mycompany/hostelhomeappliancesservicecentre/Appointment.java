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
    
    private static double pricePerHour = 50;
    private String appointmentID;
    private Customer customer;
    private LocalDateTime time;
    private AppointmentDuration duration;
    private String appliance;
    private Technician technician;
    private boolean paid;
    private String feedback;
    
    public Appointment(
            String appointmentID,
            Customer customer,
            LocalDateTime time,
            AppointmentDuration duration,
            String appliance,
            Technician technician,
            boolean paid,
            String feedback
    ) {
        this.appointmentID = appointmentID;
        this.customer = customer;
        this.time = time;
        this.duration = duration;
        this.appliance = appliance;
        this.technician = technician;
        this.paid = paid;
        this.feedback = feedback;
    }
    
    // Add in new method, check if last ID exists, if not, scan file and read existing IDs.
//    Implement feature to either randomly generate next ID or increment last ID
//    private static String getNextId() {
//        try {
//            
//            File appointmentFile = new File("data/" + Appointment.fileName);
//            Scanner fileReader = new Scanner(appointmentFile);
//            
//            while(fileReader.hasNextLine()) {
//                
//            }
//            
//        } catch (FileNotFoundException e){
//            System.out.println("File not found: " + Appointment.fileName);
//        }
//        
//        return null;
//        
//    }
    
//    public static String storeLastId() {
//        
//    }
    
//    Implement parsing feature to go through files and locate appointment ID
    public static Appointment parse(String appointmentLine) {
        String[] appointmentDetails = appointmentLine.split("\t");
        
        String appointmentID = appointmentDetails[0];
        String customerUsername = appointmentDetails[1];
        LocalDateTime time = LocalDateTime.parse(appointmentDetails[2]);
        AppointmentDuration duration = AppointmentDuration.valueOf(appointmentDetails[3]);
        String appliance = appointmentDetails[4];
        String technicianUsername = appointmentDetails[5];
        Boolean paid = Boolean.parseBoolean(appointmentDetails[6]);
        String feedback = appointmentDetails[7];
        
        Customer customer = Customer.get(customerUsername);
        Technician technician = Technician.get(technicianUsername);
        
        return new Appointment(appointmentID, customer, time, duration, appliance, technician, paid, feedback);
    }
    
    
    
//    Return an appointment object from file
    public static Appointment get(String appointmentID) {
        
        try {
            File appointmentFile = new File("data/" + Appointment.fileName);
            Scanner fileReader = new Scanner(appointmentFile);
            
            while(fileReader.hasNextLine()) {
                String currentLine = fileReader.nextLine();
                Appointment currentAppointment = Appointment.parse(currentLine);
                
                if(currentAppointment.getAppointmentID().equals(appointmentID)) {
                    return currentAppointment;
                }
            }
        }
        catch (FileNotFoundException exception) {
            System.out.println("File not found: " + Appointment.fileName);
        }
        
        return null;
    }
    
    public static String stringify(Appointment appointment, Customer customer, Technician technician) {
        String result = "";
        result += appointment.getAppointmentID();
        result += customer.getUsername();
        result += appointment.getTime();
        result += appointment.getDuration();
        result += appointment.getAppliance();
        result += technician.getUsername();
        result += appointment.getPaid();
        result += appointment.getFeedback();
        
        return result;
    }
    
    public static boolean exists(String appointmentID) {
        return Appointment.get(appointmentID) != null;
    }
    
//    Implement functionality to cancel appointment
    public static void cancel(Appointment cancelAppointment, Customer customer, Technician technician) {
        
        ArrayList<Appointment> appointments = new ArrayList<Appointment>();
        
        try {
            File appointmentsFile = new File("data/" + Appointment.fileName);
            Scanner fileScanner = new Scanner(appointmentsFile);
            
            while(fileScanner.hasNextLine()) {
                String currentLine = fileScanner.nextLine();
                Appointment currentAppointment = Appointment.parse(currentLine);
                
                if(!(currentAppointment.getAppointmentID().equals(cancelAppointment.getAppointmentID()))) {
                    appointments.add(currentAppointment);
                }
            }
        }
        catch (FileNotFoundException e) {
            System.out.println("File not found: " + Appointment.fileName);
        }
        
        try {
            FileWriter fileWriter = new FileWriter("data/" + Appointment.fileName);
            for(Appointment appointment: appointments) {
                fileWriter.write(Appointment.stringify(appointment, customer, technician));
            }
            fileWriter.close();
        }
        catch (IOException e) {
            System.out.println("Could not write to file: " + Appointment.fileName);
        }
    }
    
    public String getAppointmentID() {
        return this.appointmentID;
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
    
    // Add in the name of the enum as object type we declared in different class
    public AppointmentDuration getDuration() {
        return this.duration;
    }
    
    public void setDuration(AppointmentDuration duration) {
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
    public boolean getPaid() {
        // Add in functionality for this method
        return true;
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
