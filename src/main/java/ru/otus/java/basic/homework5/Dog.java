package ru.otus.java.basic.homework5;

public class Dog extends Animal{
    int swimVelocity;
    int energyConsumptionForSwimming = 2;

    public void swim(int distance) {
        endurance -= distance*energyConsumptionForSwimming;
        float time = 0f;
        if (endurance >= 0) {
            time = (float) (distance / runVelocity);
            System.out.println(name + " проплыть " + distance + " м. за " + time + " секунд. Оставшаяся выносливость: " + endurance);
        } else {
            time = -1f;
            endurance = 0;
            tiredness = true;
            System.out.println(name + " не хватило сил проплыть такое расстояние. Время: " + time);
        }
    }

    Dog(String name, int runVelocity, int swimVelocity,int endurance) {
        this.name = name;
        this.runVelocity = runVelocity;
        this.swimVelocity = swimVelocity;
        this.endurance = endurance;
    }

}
