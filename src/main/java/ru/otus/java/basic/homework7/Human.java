package ru.otus.java.basic.homework7;

public class Human {
    private String name;
    private String currentTransport;


    public boolean isInTransport() {
        if (currentTransport == null) {
            return false;
        }
        return true;
    }



    public void getInto(String transport) {
        if (!isInTransport()) {
            currentTransport = transport;
        }
    }

    public void goOut() {
        if (isInTransport()) {
            currentTransport = null;
        }
    }


    public String getCurrentTransport() {
        return currentTransport;
    }

    public String getName() {
        return name;
    }

    public Human(String name, String currentTransport) {
        this.name = name;
        this.currentTransport = currentTransport;
    }
}
