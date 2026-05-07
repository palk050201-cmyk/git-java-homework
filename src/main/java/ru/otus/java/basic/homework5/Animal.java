package ru.otus.java.basic.homework5;

import java.sql.SQLOutput;

public class Animal {
    String name;
    int runVelocity;
    int energyConsumptionForRunning = 1;
    int endurance;
    boolean tiredness = false;

    public boolean isTired() {
        return tiredness;
    }

    public void run(int distance) {
        endurance -= distance*energyConsumptionForRunning;
        float time = 0f;
        if (endurance >= 0) {
            time = (float) (distance / runVelocity);
            System.out.println(name + " пробежал " + distance + " м. за " + time + " секунд. Оставшаяся выносливость: " + endurance);
        } else {
            time = -1f;
            endurance = 0;
            tiredness = true;
            System.out.println(name + " не хватило сил пробежать такое расстояние. Время: " + time);
        }
    }

    public void getInfo() {
        System.out.println("Имя: " + name);
        System.out.println("Выносливость: " + endurance);
        System.out.println("Признак усталости: " + tiredness);
    }

}
