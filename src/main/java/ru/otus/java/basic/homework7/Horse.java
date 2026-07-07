package ru.otus.java.basic.homework7;

public class Horse implements Transport {
    private int endurance;
    private boolean tiredness;
    private String type;



    @Override
    public String getType() {
        return type;
    }

    @Override
    public boolean isActive() {
        if (tiredness!=true) {
            return true;
        }
        return false;
    }

    @Override
    public boolean moveInForest(int distance) {
        if (endurance >= distance) {
            return true;
        }
        tiredness = true;
        return false;
    }

    @Override
    public boolean moveInSwamp(int distance) {
        return false;
    }


    @Override
    public boolean moveInPlain(int distance) {
        if (endurance >= distance) {
            return true;
        }
        return false;
    }

    public int getEndurance() {
        return endurance;
    }
    public Horse(int endurance, String type) {
        this.endurance = endurance;
        this.type = type;
    }
}
