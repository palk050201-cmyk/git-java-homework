package ru.otus.java.basic.homework5;

public class Horse extends Animal{
    int swimVelocity;
    int energyConsumptionForSwimming = 4;

    public float swim(int distance) {
        float time = 0f;
        int energyNeeded = distance * energyConsumptionForSwimming;
        if (isEnoughEndurance(energyNeeded)) {
            endurance -= energyNeeded;
            time = (float) distance / swimVelocity;
            return time;
        } else {
            return -1f;
        }
    }

    Horse(String name, int runVelocity, int swimVelocity,int endurance) {
        this.name = name;
        this.runVelocity = runVelocity;
        this.swimVelocity = swimVelocity;
        this.endurance = endurance;
    }
}
