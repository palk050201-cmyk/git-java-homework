package ru.otus.java.basic.homework4;

public class Application {
    public static void main(String[] args) {
        User[] users = new User[10];
        users[0] = new User("Kozlov","Pavel","Alex", 2001, "palk050201@gmail.com" );
        users[1] = new User("Ivanov","Ivan","Alex", 1999, "Ivanov@gmail.com" );
        users[2] = new User("Petrov","Pavel","Denisovich", 1990, "pretrov@gmail.com" );
        users[3] = new User("Ibaeva","Kristina","Evgenevna", 1995, "kristinaiaeva@gmail.com" );
        users[4] = new User("Legenkay","Nadegda","Alexxevna", 1985, "nadpa1985@gmail.com" );
        users[5] = new User("Prosvirin","George","Konstantinovich", 1998, "georgpro@gmail.com" );
        users[6] = new User("Sidorova","Anastasia","Sergeena", 1998, "sidorovaa@gmail.com" );
        users[7] = new User("Kozlova","Victoria","Alex", 1999, "koozlovaa@gmail.com" );
        users[8] = new User("Ibaeva","Anastasia","Alex", 2000, "ibaevaa@gmail.com" );
        users[9] = new User("Nadejdina","Natalya","Petrovna", 1975, "nata1975@gmail.com" );


        for (int i = 0; i < users.length; i++) {
            if (users[i].isOlderForty()) {
                users[i].getInfo();
                System.out.println();
            }
        }


        Box[] boxes = new Box[3];
        boxes[0] = new Box(10, 5, 4, "black", true, "pen");
        boxes[1] = new Box(10, 5, 4, "blue", false, "pen");
        boxes[2] = new Box(10, 5, 4, "red", true);

        boxes[0].setColour("green");
        boxes[1].dropContent();
        System.out.println();
        boxes[2].dropContent();
        System.out.println();
        boxes[2].putContent("jaket");
        System.out.println();


        for (int i = 0; i < boxes.length; i++) {
            System.out.println("Коробка № " + (int) (i+1));
            boxes[i].getInfo();
            System.out.println();
        }


    }
}
