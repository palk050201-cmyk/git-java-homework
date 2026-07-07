package ru.otus.java.basic.homework7;

public class AllRoadCar implements Transport {
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
        if (tank >= fuelConsumption * distance) {
            tank -= fuelConsumption * distance;
            return true;
        }
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
        if (tank >= fuelConsumption * distance) {
            tank -= fuelConsumption * distance;
            return true;
        }
        return false;
    }

    public int getTank() {
        return tank;
    }

    public void setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public AllRoadCar(int tank, int fuelConsumption, String type) {
        this.tank = tank;
        this.fuelConsumption = fuelConsumption;
        this.type = type;
    }
}
