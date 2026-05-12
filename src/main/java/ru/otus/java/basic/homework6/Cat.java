package ru.otus.java.basic.homework6;

public class Cat {
    String name;
    int appetite;
    int satiety;


    Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = 0;
    }


    public void eat() {
        satiety += appetite;
        appetite = 0;
    }


    public void getInfo() {
        System.out.println("name = " + name);
        System.out.println("appetite = " + appetite);
        System.out.println("satiety = " + satiety);
    }


}
