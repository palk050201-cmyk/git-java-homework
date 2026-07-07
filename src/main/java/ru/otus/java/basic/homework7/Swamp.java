package ru.otus.java.basic.homework7;

public class Swamp implements Obstacle{

    @Override
    public boolean doIt(Transport t) {
        return t.moveInSwamp(5);
    }
}
