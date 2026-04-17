package ru.otus.java.basic.homework2;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        //Вводим случайный размер одномерного массива
        int sizeOfArray = (int) (Math.random() * 100);
        int[] array = new int[sizeOfArray];
        //Заполняем массив случайными int
        for (int i = 0; i < sizeOfArray; i++) {
            array[i] = (int) Math.round(Math.random() * 100);
        }
        System.out.println("Выберите программу задание:");

        Scanner scanner = new Scanner(System.in);
        int taskNumber = scanner.nextInt();
        if (taskNumber == 1) {
            printWordCountTimes();
        } else {
            System.out.println("Случайный массив: " + Arrays.toString(array));
            if (taskNumber == 2) {
                sumAndPrintLargeArrayElements(array);
            } else if (taskNumber == 3) {
                System.out.println("Введите число, на которое нужно заменить каждый элемент массива:");
                int term = scanner.nextInt();
                fillAndPrintArray(array, term);
            } else if (taskNumber == 4) {
                System.out.println("Введите слогаемое на которое нужно увеличить каждый элемент массива:");
                int term = scanner.nextInt();
                increaseAndPrintArrayElements(array, term);
            } else {
                System.out.println("Выберите вариант:");
                int variantNumber = scanner.nextInt();
                if (variantNumber == 1) {
                    determineLargerSumOfOddOrEvenElements(array);
                } else {
                    determineLargerLeftOrRightPartOfArray(array);
                }
            }
        }
    }


    // Задание 1
    public static void printWordCountTimes() {
        System.out.println("Введите число:");
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        System.out.println("Введите слово");
        String word = scanner.next();

        for (int i = 0; i <= count; i++) {
            System.out.println(word);
        }
    }

    // Задание 2
    public static void sumAndPrintLargeArrayElements(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++)
            if (array[i] >= 5) {
                sum += array[i];
            }
        System.out.println("Сумма элементов массива, которые больше 5 массива: " + sum);
    }

    // Задание 3
    public static void fillAndPrintArray(int[] array, int number) {
        for (int i = 0; i < array.length; i++) {
            array[i] = number;
        }
        System.out.println(Arrays.toString(array));
    }

    //Задание 4
    public static void increaseAndPrintArrayElements(int[] array, int number) {
        for (int i = 0; i < array.length; i++) {
            array[i] += number;
        }
        System.out.println(Arrays.toString(array));
    }


    //Задание 5:
    // Вариант 1: определение сумма на четных больше/меньше суммы на нечетных
    public static void determineLargerSumOfOddOrEvenElements(int[] array) {
        int evenSum = 0;
        int oddSum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                evenSum += array[i];
            } else {
                oddSum += array[i];
            }
        }

        if (evenSum > oddSum) {
            System.out.println("Сумма четных больше суммы нечетных");
        } else if (evenSum == oddSum) {
            System.out.println("Сумма четных равна сумме нечетных");
        } else {
            System.out.println("Сумма четных больше суммы нечетных");
        }
    }

    //Вариант 2: Определение суммы левой или правой части массива. Если массив имеет нечетное кол-во элементов, то левая часть больше на один элемент
    public static void determineLargerLeftOrRightPartOfArray(int[] array) {
        int sumOfLeftPart = 0;
        int sumOfRightPart = 0;

        for (int i = 0; i <= array.length / 2; i++) {
            sumOfLeftPart += array[i];
        }

        for (int j = array.length / 2 + 1; j < array.length; j++) {
            sumOfRightPart += array[j];
        }

        if (sumOfRightPart > sumOfLeftPart) {
            System.out.println("Правая часть массива больше левой части");
        } else if (sumOfRightPart == sumOfLeftPart) {
            System.out.println("Правая часть массива равна левой части");
        } else {
            System.out.println("Правая часть массива меньше левой части");
        }
    }
}

