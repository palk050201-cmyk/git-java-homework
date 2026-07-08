package ru.otus.java.basic.homework8;

import java.sql.SQLOutput;
import java.util.Scanner;


public class Application {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[][] array = new String[4][4];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = "13";


            }
        }

        try {
            validateArraySize(array);
            System.out.println(sumElementOfArray(array));
        } catch (AppArraySizeException e) {
            System.out.println(e.getMessage());
        }





    }


    public static void validateArraySize(String[][] table) {
        if (table.length != 4 || table[0].length != 4) {
            throw new AppArraySizeException("Длина массива не корректна");
        }
        System.out.println("Длина массива корректна");
    }

    public static int sumElementOfArray(String[][] array) {
        int sum = 0;
        int[][] intArray = new int[array.length][array[0].length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    intArray[i][j] = Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new AppArrayDataException("Неверный формат данных в ячейке " + i+1 + ", " + j+1);
                }
                sum += intArray[i][j];
            }
        }
        return sum;
    }

}




