package ru.otus.java.basic.homework5;

public class Horse extends Animal{
    int swimVelocity;
    int energyConsumptionForSwimming = 4;

    public void swim(int distance) {
        float time = 0f;
        int energyNeeded = distance * energyConsumptionForSwimming;
        if (isEnoughEndurance(energyNeeded)) {
            endurance -= energyNeeded;
            time = (float) (distance / swimVelocity);
            System.out.println(name + " проплыть " + distance + " м. за " + time + " секунд. Оставшаяся выносливость: " + endurance);
        } else {
            time = -1f;
            System.out.println(name + " не хватило сил проплыть такое расстояние. Время: " + time);
        }
    }

    Horse(String name, int runVelocity, int swimVelocity,int endurance) {
        this.name = name;
        this.runVelocity = runVelocity;
        this.swimVelocity = swimVelocity;
        this.endurance = endurance;
    }
}
