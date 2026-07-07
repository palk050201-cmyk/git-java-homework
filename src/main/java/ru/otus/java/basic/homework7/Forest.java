package ru.otus.java.basic.homework7;

public class Forest implements Obstacle{

    @Override
    public boolean doIt(Transport t) {
        return t.moveInForest(5);
    }
}
