package ru.otus.java.basic.homework7;


public class Application {
    public static void main(String[] args) {


        //Создаем человека

        Human[] humans = {
                new Human("Peter", null),
                new Human("Elena", "Вездеход")
        };

        //Создаем транспорт
        Transport[] transports = {
            new AllRoadCar(100, 20, "Вездеход"),
            new Bike("Велосипед"),
            new Car(100, 10, "Машина"),
            new Horse(100, "Лошадь"),
        };

        //Создаем препядствия
        Obstacle[] obstacles = {
                new Forest(),
                new Plain(),
                new Swamp(),
        };

        for (Human h : humans) {
            System.out.println(h.getName());
            if (h.isInTransport()) {
                for (Transport t : transports) {
                    if (t.getType() == h.getCurrentTransport()) {
                        for (Obstacle o : obstacles) {
                            System.out.println(o.doIt(t));
                        }
                    }
                }
            }
            else {
                    System.out.println("Человек идет пешком");
            }
        }








    }
}
