package ru.otus.java.basic.homework6;

public class Plate {
    int maxCapacity;
    int currentCapacity;


    Plate(int maxCapacity) {
        this.maxCapacity = maxCapacity;
        this.currentCapacity = maxCapacity;
    }

    public boolean isEnoughSpace(int food) {
        return maxCapacity > currentCapacity + food;
    }

    public boolean isEnoughFood(int food) {
        return currentCapacity >= food;

    }

    public void addFood(int food) {
        if (isEnoughSpace(food)) {
            currentCapacity += food;
        } else {
            System.out.println("Еда не влезает в тарелку");
        }
    }

    public void decreaseFood(int food) {
        if (isEnoughFood(food)) {
            currentCapacity -= food;
        } else {
            System.out.println("Нет столько еды!");
        }
    }

    public void getInfo() {
        System.out.println("maxCapacity = " + maxCapacity);
        System.out.println("currentCapacity = " + currentCapacity);
    }
}
