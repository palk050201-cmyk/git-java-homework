package ru.otus.java.basic.homework5;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {



        Cat cat = new Cat("Джони", 1, 120);
        Dog dog = new Dog("Чарли", 5, 5,150);
        Horse horse = new Horse("Мустанг", 10, 5, 150);


        System.out.println("-----------------------------");
        System.out.println(dog.run(10));
        dog.getInfo();
        System.out.println();
        System.out.println(dog.run(30));
        dog.getInfo();
        System.out.println();
        System.out.println(dog.swim(30));
        dog.getInfo();
        System.out.println();
        System.out.println(dog.swim(30));
        dog.getInfo();


        System.out.println("-----------------------------");
        System.out.println(horse.run(10));
        horse.getInfo();
        System.out.println();
        System.out.println(horse.run(30));
        horse.getInfo();
        System.out.println();
        System.out.println(horse.swim(30));
        horse.getInfo();

        System.out.println("-----------------------------");
        System.out.println(cat.run(10));
        cat.getInfo();
        System.out.println();
        System.out.println(cat.run(50));
        cat.getInfo();
        System.out.println();
        System.out.println(cat.run(60));
        cat.getInfo();
        System.out.println();
        System.out.println(cat.run(5));
        cat.getInfo();


    }
}
