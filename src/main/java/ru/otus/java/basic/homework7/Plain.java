package ru.otus.java.basic.homework7;

public class Plain implements Obstacle{

    @Override
    public boolean doIt(Transport t) {
        return t.moveInPlain(1);
    }
}
