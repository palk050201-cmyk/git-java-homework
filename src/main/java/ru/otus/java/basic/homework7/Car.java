package ru.otus.java.basic.homework7;

public class Car implements Transport{
    private int tank;
    private int fuelConsumption;
    private String type;

    @Override
    public String getType() {
        return type;
    }

    @Override
    public boolean isActive() {
        if (tank > 0) {
            return true;
        }
        return false;
    }

    @Override
    public boolean moveInForest(int distance) {
        return false;
    }

    @Override
    public boolean moveInPlain(int distance) {
        if (tank >= fuelConsumption * distance) {
            tank -= fuelConsumption * distance;
            return true;
        }
        return false;
    }


    @Override
    public boolean moveInSwamp(int distance) {
        return false;
    }

    public int getTank() {
        return tank;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public Car(int tank, int fuelConsumption, String type) {
        this.tank = tank;
        this.fuelConsumption = fuelConsumption;
        this.type = type;
    }
}
