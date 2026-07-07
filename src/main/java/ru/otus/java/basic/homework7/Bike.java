package ru.otus.java.basic.homework7;

public class Bike implements Transport {
    private String type;

    @Override
    public String getType() {
        return type;
    }

    @Override
    public boolean isActive() {
        return true;
    }

    @Override
    public boolean moveInPlain(int distance) {
        return true;
    }

    @Override
    public boolean moveInForest(int distance) {
        return true;
    }

    @Override
    public boolean moveInSwamp(int distance) {
        return false;
    }


    public Bike(String type) {
        this.type = type;
    }
}
