package ru.otus.java.basic.homework7;

public interface Transport {
    boolean moveInForest(int distance);
    boolean moveInPlain(int distance);
    boolean moveInSwamp(int distance);
    boolean isActive();
    String getType();

}
