package ru.otus.java.basic.homework1;

import java.util.Random;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Введите целове число от 1 до 5");
        int number = scanner.nextInt();
        if (number > 0 && number <= 5) {
            if (number == 1) {
                greetings();
            }
            if (number == 2) {
                checkSign((int) (Math.random()*1000 - 500), (int) (Math.random()*1000 - 500), (int) (Math.random()*1000 - 500));
            }
            if (number == 3) {
                selectColor((int) ((Math.random()*100 - 50)));
            }
            if (number == 4) {
                compareNumbers((int) (Math.random()*1000 - 500),(int) (Math.random()*1000 - 500));
            }
            if (number == 5) {
                addOrSubtractAndPrint((int) (Math.random()*1000 - 500), (int) (Math.random()*1000 - 500), random.nextBoolean());
            }
        }
        else {
            System.out.println("Такой функции не существует!");
        }
        /*  greetings();
        checkSign(-100,3,2);
        selectColor(25);
        compareNumbers(5, 10);
        addOrSubtractAndPrint(5,3,true);*/
    }
    // Задача (1)
    public static void greetings() {
        System.out.println("Hello");
        System.out.println("World");
        System.out.println("from");
        System.out.println("Java");
    }

    // Задача (2)
    public static void checkSign(int a, int b, int c) {
        int sum = a + b + c;
        if (sum >= 0) {
            System.out.println("Сумма положительная");
        }
        else {
            System.out.println("Сумма отрицательная");
        }
    }

    // Задача (3)
    public static void selectColor(int data) {
        if (data<=10) {
            System.out.println("Красный");
        }
        if (data > 10 && data <=20) {
            System.out.println("Желтый");
        }
        if (data > 20) {
            System.out.println("Зеленый");
        }
    }
    // Задача (4)
    public static void compareNumbers(int a, int b) {
        if (a>=b) {
            System.out.println("a >= b");
        }
        else {
            System.out.println("a < b");
        }
    }
    // Задача (5)
    public static void addOrSubtractAndPrint(int initValue, int delta, boolean increment) {
        if (increment) {
            initValue += delta;
        }
        else {
            initValue -= delta;
        }
        System.out.println(initValue);
    }

}
