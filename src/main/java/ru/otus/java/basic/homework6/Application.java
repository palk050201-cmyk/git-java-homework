package ru.otus.java.basic.homework6;

public class Application {
    public static void main(String[] args) {

        Plate plate = new Plate(500);


        plate.decreaseFood(510);
        plate.getInfo();
        System.out.println("-------");
        plate.decreaseFood(105);
        plate.getInfo();
        System.out.println("-------");
        plate.addFood(5);
        plate.getInfo();
        System.out.println("-------");
        plate.addFood(150);
        plate.getInfo();
        System.out.println("-------");


        Cat[] cats = new Cat[5];
        cats[0] = new Cat("Барсик", 100);
        cats[1] = new Cat("Джони", 100);
        cats[2] = new Cat("Бусинка", 80);
        cats[3] = new Cat("Дамик", 90);
        cats[4] = new Cat("Шкета", 150);


        for (int i = 0; i < cats.length; i++) {
            if (plate.isEnoughFood(cats[i].appetite)) {
                plate.decreaseFood(cats[i].appetite);
                cats[i].eat();
            } else {
                System.out.println("Котик " + cats[i].name + " не смог поесть");
            }
            cats[i].getInfo();
            System.out.println("-------");
        }


    }
}
