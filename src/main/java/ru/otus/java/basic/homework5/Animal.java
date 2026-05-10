package ru.otus.java.basic.homework5;

import java.sql.SQLOutput;

public class Animal {
    String name;
    int runVelocity;
    int energyConsumptionForRunning = 1;
    int endurance;


    public boolean isEnoughEndurance(int endurance){
        return this.endurance >= endurance;
    }


    public void run(int distance) {
        float time = 0f;
        int energyNeeded = distance * energyConsumptionForRunning;
        if (isEnoughEndurance(energyNeeded)) {
            endurance -= energyNeeded;
            time = (float) (distance / runVelocity);
            System.out.println(name + " пробежал " + distance + " м. за " + time + " секунд. Оставшаяся выносливость: " + endurance);
        } else {
            time = -1f;
            System.out.println(name + " не хватило сил пробежать такое расстояние. Время: " + time);
        }
    }

    public void getInfo() {
        System.out.println("Имя: " + name);
        System.out.println("Выносливость: " + endurance);
    }

}
