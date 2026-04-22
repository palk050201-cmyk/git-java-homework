package ru.otus.java.basic.arrayproblems.task14;

import java.util.Arrays;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //int len = scanner.nextInt();

        String[] array = new String[4];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Введите строку:");
            array[i] = scanner.nextLine();
        }

        System.out.println(Arrays.toString(array));

        //longestCommonPrefix();
    }
    public String longestCommonPrefix(String[] strs) {
        String prefix = "";
        boolean flag = true;
        for (int i = 0; i < strs.length - 1; i++) {
            if (strs[i].charAt(i)!=strs[i+1].charAt(i)) {
                flag = false;
            }
        }
    return prefix;
    }

}
