/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hostelhomeappliancesservicecentre;

import java.time.LocalDate;

/**
 *
 * @author arvind
 */
public class Technician extends Employee  {
    
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
//    private static Technician parse(String technician) {
//        
//    }
    
//    To pass in username and locate line in file containing username
//    public static Technician get(String username) {
//        
//    }
    
//    To return a boolean to see if username and password correspond with object
//    public static boolean authenticate(String username, String password) {
//        
//    }
    
//    To implement a GUI form where technician can view appointment information
    public void searchAppointment() {
        
    }
    
    
}
