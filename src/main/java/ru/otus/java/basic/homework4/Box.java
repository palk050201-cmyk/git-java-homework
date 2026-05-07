package ru.otus.java.basic.homework4;

public class Box {
    private int length;
    private int width;
    private int hight;
    private String colour;
    private boolean opened;
    private String content;


    public void open(){
        opened = true;
    }

    public  void close(){
        opened = false;
    }

    public void setColour(String colour){
        this.colour = colour;
    }


    public Box(int length, int width, int hight, String colour, boolean opened, String content) {
        this.length = length;
        this.width = width;
        this.hight = hight;
        this.colour = colour;
        this.opened = opened;
        this.content = content;
    }

    public Box(int length, int width, int hight, String colour, boolean opened) {
        this.length = length;
        this.width = width;
        this.hight = hight;
        this.colour = colour;
        this.opened = opened;
    }

    public void getInfo(){
        System.out.println("Цвет коробки " + colour);
        System.out.println("Размер коробки a*b*c" + length + "*" + width + "*" + hight);
        System.out.println("Коробка " + (opened ? "открата" : "закрыта"));
        System.out.println("В коробке лежит: " + content);
    }

    public boolean isOpened(){
        return opened;
    }

    public void putContent(String content){
        if (isOpened()) {
            if (this.content == null) {
                this.content = content;
                System.out.println("В коробку положили: " + content);
            } else {
                System.out.println("В коробке уже лежит: " + this.content);
            }
        } else {
            System.out.println("Коробка закрыта");
        }
    }

    public void dropContent(){
        if (isOpened()) {
            if (this.content != null) {
                System.out.println("Из коробки убрал: " + this.content);
                this.content = null;
            } else {
                System.out.println("В коробке нет вещей");
            }
        } else {
            System.out.println("Коробка закрыта");
        }
    }


}
