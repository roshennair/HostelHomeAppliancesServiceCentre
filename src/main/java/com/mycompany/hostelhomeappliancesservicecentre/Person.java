/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hostelhomeappliancesservicecentre;

import java.time.LocalDate;
import java.util.Calendar;

/**
 *
 * @author Roshen Nair
 */
public abstract class Person {

    private final String username;
    private String name;
    private LocalDate birthday;

    public Person(String username, String name, LocalDate birthday) {
        this.username = username;
        this.name = name;
        this.birthday = birthday;
    }

    public String getUsername() {
        return this.username;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthday() {
        return this.birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public int getAge() {
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        return currentYear - this.birthday.getYear();
    }

    @Override
    public String toString() {
        String output = "";
        output += "Username: " + this.username + "\n";
        output += "Name: " + this.name + "\n";
        output += "Birthday: " + this.birthday;
        return output;
    }
}
