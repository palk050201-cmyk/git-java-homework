package ru.otus.java.basic.homework12;

import java.util.ArrayList;
import java.util.List;

public class Application {


    public static void main(String[] args) {
        //Простое заполнение
        fillList();

        //Заполнение через хардкодное значение тредов
        try {
            fillListByThreads();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //Заполнение через ф-ию с прямым указание тредов
        try {
            smartFillListByThreads(1, 50_000_000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        try {
            smartFillListByThreads(2, 50_000_000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        try {
            smartFillListByThreads(4, 50_000_000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        try {
            smartFillListByThreads(5, 50_000_000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    //Простое заполнение
    private static void fillList() {
        List<Double> doubleList = new ArrayList<>();
        long start = System.currentTimeMillis();
        for (int i = 0; i < 50_000_000; i++) {
            doubleList.add(1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2));
        }
        long end = System.currentTimeMillis();
        System.out.println("Время выполнения: " + (end - start) + " в мс.");
    }


    //Заполнение через хардкодное значение тредов
    private static void fillListByThreads() throws InterruptedException {
        List<Double> doubleList = new ArrayList<>();
        long start = System.currentTimeMillis();
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 12_500_000; i++) {
                doubleList.add(1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2));
            }
        });
        Thread thread2 = new Thread(() -> {
            for (int i = 12_500_000; i < 25_000_000; i++) {
                doubleList.add(1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2));
            }
        });
        Thread thread3 = new Thread(() -> {
            for (int i = 25_000_000; i < 37_500_000; i++) {
                doubleList.add(1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2));
            }
        });
        Thread thread4 = new Thread(() -> {
            for (int i = 37_500_000; i < 50_000_000; i++) {
                doubleList.add(1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2));
            }
        });

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

        thread1.join();
        thread2.join();
        thread3.join();
        thread4.join();


        long end = System.currentTimeMillis();
        System.out.println("Время выполнения: " + (end - start) + " в мс.");

    }


    //Заполнение через ф-ию с прямым указание тредов и количество элементов
    private static void smartFillListByThreads(int threadsAmount, int elementsAmount) throws InterruptedException {
        List<Thread> threads = new ArrayList<>();
        List<Double> doubleList = new ArrayList<>();
        long start = System.currentTimeMillis();
        int iter = elementsAmount/threadsAmount;
        for (int i = 0; i < threadsAmount; i++) {
            int iterator = i;
            threads.add(new Thread(() -> {
                for (int j = iterator*(iter); j < (iter) * (iterator + 1); j++) {
                    doubleList.add(1.14 * Math.cos(j) * Math.sin(j * 0.2) * Math.cos(j / 1.2));
                }
            }));
        }
        for (Thread t : threads) {
            t.start();
        }
        for (Thread t : threads) {
            t.join();
        }
        long end = System.currentTimeMillis();
        System.out.println("Время выполнения: " + (end - start) + " в мс.");

    }
}
