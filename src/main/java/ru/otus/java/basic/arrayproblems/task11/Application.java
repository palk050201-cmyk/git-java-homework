package ru.otus.java.basic.arrayproblems.task11;

import java.util.Arrays;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину массива: ");
        int length = scanner.nextInt();
        int[] nums = new int[length];

        for (int i = 0; i < length; i++) {
            System.out.println("Введите элменет № " + (i + 1));
            nums[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(nums));

        findVolume(nums);
    }

    private static int findVolume(int[] nums) {
        int volume = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (volume < (j - i) * Math.min(nums[i], nums[j])) {
                    volume = (j - i) * Math.min(nums[i], nums[j]);
                }
            }
        }
        return volume;
    }
}    
