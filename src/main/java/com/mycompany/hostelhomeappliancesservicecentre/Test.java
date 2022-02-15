/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hostelhomeappliancesservicecentre;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDateTime;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 *
 * @author arvin
 */
public class Test {
        
    public static void main(String[] args) {
        
//        LocalDateTime dateT = LocalDateTime.of(2018, Month.MARCH, 7, 8, 0);
//        
//        System.out.println(dateT);

        
        
//        String str = "1986-04-08 11:00";
        
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
//        LocalDateTime dateTime = LocalDateTime.parse(str, formatter);
//        
//        System.out.println(dateTime);
        
//        1986-04-08T11:00
        
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
//        LocalDateTime dateTime = LocalDateTime.of(2015, Month.MARCH, 15, 11, 0);
//        String result = dateTime.format(formatter);
//
//        System.out.println("1\tcust1\t" + dateTime + "\tMachine\ttech1\tTrue\tTestFeedback");
        
        
//        LocalDateTime today = LocalDateTime.parse("2015-03-15T11:00");
//        System.out.println(today + "\n\n");
        
        LocalDate rightNow = LocalDate.parse("2003-01-07");
        System.out.println(rightNow);
        
        
        System.out.println("1\tcust1\t2015-03-15T11:00\tMachine\ttech1\tTrue\tTestFeedback");

//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
//        LocalDateTime dateTime = LocalDateTime.of(1986, Month.APRIL, 8, 12, 30);
//        String formattedDateTime = dateTime.format(formatter);
        
//        System.out.println(result);
        
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
//        LocalDateTime dateTime = LocalDateTime.parse(str, formatter);
//        
//        System.out.println(dateTime);
        
//        try {
//            File appointmentFile = new File("data/appointments.txt");
//            Scanner fileReader = new Scanner(appointmentFile);
//            
////            while(fileReader.hasNextLine()) {
//            String currentLine = fileReader.nextLine();
//
//            String[] appointmentDetails = "1	cust1	2015-03-15T11:00	Machine	tech1	True	TestFeedback".split(" ");
//        
//            String id = appointmentDetails[0];
//            String customerUsername = appointmentDetails[1];
//            LocalDateTime dateTime = LocalDateTime.parse(appointmentDetails[2]);
//            String appliance = appointmentDetails[3];
//            String technicianUsername = appointmentDetails[4];
//            Boolean paid = Boolean.parseBoolean(appointmentDetails[5]);
//            String feedback = appointmentDetails[6];
//
//            Customer customer = Customer.get(customerUsername);
//            Technician technician = Technician.get(technicianUsername);
//
////            return (customer, dateTime, appliance, technician);
//            System.out.println(id + customerUsername + dateTime + appliance + technicianUsername + paid + feedback);
////            }
//
//            
//        }
//        catch (FileNotFoundException e){
//            System.out.println("Not working");
//        }

        
        

    }
    
}
