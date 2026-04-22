package ru.otus.java.basic.homework3;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите номер задачи:");
        int taskNumber = scanner.nextInt();

        if (taskNumber == 2) {
            System.out.println("Введите размер n*n массива: ");
            int size = scanner.nextInt();
            generateAndPrintSquareArray(size);
        } else if (taskNumber == 3) {
            removeDiagonalAndPrintArray(generateAndPrintRandomArray(1));
        } else {
            System.out.println("Введите тип массива: 1- квадратный, 2 - прямоугольный");
            int type = scanner.nextInt();
            if (taskNumber == 1) {
                System.out.println(sumOfPositiveElements(generateAndPrintRandomArray(type)));
            } else if (taskNumber == 4) {
                System.out.println(findMax(generateAndPrintRandomArray(type)));
            } else {
                System.out.println(sumOfSecondRow(generateAndPrintRandomArray(type)));
            }
        }
    }


    // Задача 1
    private static int sumOfPositiveElements(int[][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > 0) {
                    sum += array[i][j];
                }
            }
        }
        return sum;
    }


    // Задача 2
    public static void generateAndPrintSquareArray(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }


    // Задача 3
    public static void removeDiagonalAndPrintArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == j) {
                    array[i][j] = 0;
                }
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("-----------------");
    }

    //Задача 4
    public static int findMax(int[][] array) {
        int max = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }
        }
        return max;
    }

    //Задача 5
    public static int sumOfSecondRow(int[][] array) {
        int sum = 0;
        if (array.length >= 2) {
            for (int i = 0; i < array[1].length; i++) {
                sum += array[1][i];
            }
        } else {
            sum = -1;
        }
        return sum;
    }


    public static int[][] generateAndPrintRandomArray(int type) {
        if (type == 1) {
            int size = 0;
            while (size < 2) {
                size = (int) (Math.random() * 10);
            }
            int[][] array = new int[size][size];
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    array[i][j] = (int) (Math.random() * 10 - 5);
                    System.out.print(array[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println("-----------------");
            return array;
        } else {
            int rowCount = 0;
            while (rowCount == 0) {
                rowCount = (int) (Math.random() * 10);
            }
            int columnCount = 0;
            while (columnCount == 0) {
                columnCount = (int) (Math.random() * 10);
            }
            int[][] array = new int[rowCount][columnCount];
            for (int i = 0; i < rowCount; i++) {
                for (int j = 0; j < columnCount; j++) {
                    array[i][j] = (int) (Math.random() * 10 - 5);
                    System.out.print(array[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println("-----------------");
            return array;
        }
    }

}
