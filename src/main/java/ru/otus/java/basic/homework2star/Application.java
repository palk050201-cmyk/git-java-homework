package ru.otus.java.basic.homework2star;

import java.util.Arrays;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        System.out.println("Введите номер задачи для выполнения: ");
        Scanner scanner = new Scanner(System.in);
        detTask(scanner.nextInt());

    }

    public static void detTask(int taskNumber) {
        Scanner scanner = new Scanner(System.in);
        if (taskNumber == 1) {
            System.out.println("Введите количество массивов: ");
            int arrayAmount = scanner.nextInt();
            System.out.println("Введите количество элементов массивов: ");
            int elementsAmount = scanner.nextInt();
            sumArray(arrayAmount, elementsAmount);
        } else {
            System.out.println("Введите размер массива: ");
            int arraySize = scanner.nextInt();
            int[] array = new int[arraySize];
            for (int i = 0; i < arraySize; i++) {
                System.out.println("Введите значения элемента " + (i + 1) + " массива");
                array[i] = scanner.nextInt();
            }
            if (taskNumber == 2) {
                isDoteInArray(array);
            } else if (taskNumber == 3) {
                reverseArray(array);
            } else {
                System.out.println("Введите тип проверки сортировки. 1 - по убыванию; 2 - по возрастанию");
                int type = scanner.nextInt();
                isSortArray(array, type);
            }
        }
    }


    //Задача 1: Сумма n массивов
    public static void sumArray(int amount, int coloumnNumber) {
        int[] arraySum = new int[coloumnNumber];
        for (int i = 0; i < amount; i++) {
            System.out.println("Ввод значений элементов массива #: " + i);
            int[] array = new int[coloumnNumber];
            for (int j = 0; j < coloumnNumber; j++) {
                System.out.println("Введите значения элемента " + (j + 1) + " массива");
                //new array[j] = scanner.nextInt();
                Scanner scanner = new Scanner(System.in);
                array[j] = scanner.nextInt();
                arraySum[j] += array[j];

            }
        }
        System.out.println(Arrays.toString(arraySum));
//        System.out.println(Arrays.toString(array));
    }

    //Задача 2: Проверка точек по сумме в массиве
    public static void isDoteInArray(int[] array) {
        int leftPartSum = 0;
        int rightPartSum = 0;
        int i;
        int j;
        for (i = 0; i < array.length; i++) {
            rightPartSum = 0;
            for (j = i + 1; j < array.length; j++) {
                rightPartSum += array[j];
            }
            leftPartSum += array[i];

            if (rightPartSum == leftPartSum) {
                break;
            }
        }
        if (leftPartSum == rightPartSum) {
            System.out.println("Точка нашлась между " + (i + 1) + " и " + (i + 2) + " знаком, массив можно поделить по суммам: " + leftPartSum + " и " + rightPartSum);
        } else {
            System.out.println("Точка не нашлась, массив нельзя поделить по суммам");
        }
    }

    //Задача 3: Проверка отсортированности массива
    public static void isSortArray(int[] array, int type) {
        boolean sortFlag = true;

        for (int i = 1; i < array.length; i++) {
            if (type == 1) {
                if (array[i] > array[i - 1]) {
                    sortFlag = false;
                    break;
                } else {
                    sortFlag = true;
                }
            } else {
                if (array[i] < array[i - 1]) {
                    sortFlag = false;
                    break;
                } else {
                    sortFlag = true;
                }
            }
        }

        System.out.println(sortFlag ? "Массив отсротирован" : "Массив не отсортирован");
    }

    //Задача 4: Переворот массива
    public static void reverseArray(int[] array) {
        int[] reverseArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            reverseArray[array.length - (i + 1)] = array[i];
        }
        System.out.println(Arrays.toString(reverseArray));
    }

}
