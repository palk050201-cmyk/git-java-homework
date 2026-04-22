package ru.otus.java.basic.arrayproblems.task4;

import java.util.Arrays;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину 1 массива: ");
        int length1 = scanner.nextInt();
        int[] nums1 = new int[length1];

        for (int i = 0; i < length1; i++) {
            System.out.println("Введите элменет № " + (i + 1));
            nums1[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(nums1));


        System.out.println("Введите длину 2 массива: ");
        int length2 = scanner.nextInt();
        int[] nums2 = new int[length2];

        for (int i = 0; i < length2; i++) {
            System.out.println("Введите элменет № " + (i + 1));
            nums2[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(nums2));


        float median = median(nums1, nums2);
        System.out.println(median);
    }

    private static float median(int[] nums1, int[] nums2) {
        int sum = 0;
        int count = 0;
        float median = 0;
        if (nums1.length > 2) {
            for (int i = 1; i < nums1.length - 1; i++) {
                sum += nums1[i];
                count += 1;
            }
        } else {
            for (int i = 0; i < nums1.length; i++) {
                sum += nums1[i];
                count += 1;
            }
        }
        if (nums2.length > 2) {
            for (int i = 1; i < nums2.length - 1; i++) {
                sum += nums2[i];
                count += 1;
            }
        } else {
            for (int i = 0; i < nums2.length; i++) {
                sum += nums2[i];
                count += 1;
            }

        }
        median = (float) sum / count;
        return median;
    }

}
