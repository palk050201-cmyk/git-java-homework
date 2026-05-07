package ru.otus.java.basic.homework4;

import java.time.LocalDate;

public class User {
    private String secondName;
    private String firstName;
    private String middleName;
    private int birthYear;
    private String email;


    public int getBirthYear() {
        return birthYear;
    }


    public User(String secondName, String fitrstName, String middleName, int birthYear, String email) {
        this.secondName = secondName;
        this.firstName = fitrstName;
        this.middleName = middleName;
        this.birthYear = birthYear;
        this.email = email;
    }

    public boolean isOlderForty() {
        if (LocalDate.now().getYear() - getBirthYear() > 40) {
            return true;
        } else {
            return false;
        }
    }


    public void getInfo() {
        System.out.println("ФИО: " + secondName + " " + firstName + " " + middleName);
        System.out.println("Год рождения: " + birthYear);
        System.out.println("e-mail: "+ email);
    }


}
