package ru.otus.java.basic.arrayproblems;

import java.util.Arrays;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину массива: ");
        int length = scanner.nextInt();
        int[] nums = new int[length];

        for (int i = 0; i < length; i++) {
            System.out.println("Введите элменет № " + (i+1));
            nums[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(nums));
        System.out.println("Введите число: ");
        int target = scanner.nextInt();


        findIndexes(nums, target);


    }

    private static int[] findIndexes(int[] nums, int target) {
        boolean flag = false;
        int[] array = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i!=j && !(flag)) {
                    if (nums[i] + nums[j] == target) {
                        flag = true;
                        array[0] = i;
                        array[1] = j;
                        System.out.println(Arrays.toString(array));
                    }
                }
            }
        }
        return array;
    }
}
