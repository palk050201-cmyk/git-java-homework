package ru.otus.java.basic.homework9;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int taskNumber;

        System.out.println("Введите номер задачи: ");
        taskNumber = scanner.nextInt();

        if (taskNumber == 1) {
            System.out.println(getArrayList(3,10));
        } else if (taskNumber == 2) {
            System.out.println("Введите длину массива");
            System.out.println(sumArrayList(getArrayList(scanner.nextInt())));
        } else if (taskNumber == 3) {
            System.out.println("Введите длину массива");
            ArrayList<Integer> newList = setArrayElements(getArrayList(scanner.nextInt()), 5);
            System.out.println(newList);
        } else if (taskNumber == 4) {
            System.out.println("Введите длину массива");
            ArrayList<Integer> newList = increaseArrayElements(getArrayList(scanner.nextInt()), 5);
            System.out.println(newList);
        } else if (taskNumber == 5) {
            ArrayList<Employee> list = new ArrayList<>();
            ArrayList<String> newList = new ArrayList<>();
            list.add(new Employee(25, "Pavel"));
            list.add(new Employee(26, "Anastasia"));
            list.add(new Employee(30, "Georg"));
            System.out.println(getName(list));
        } else if (taskNumber == 6) {
            ArrayList<Employee> list = new ArrayList<>();
            ArrayList<String> newList = new ArrayList<>();
            list.add(new Employee(25, "Pavel"));
            list.add(new Employee(26, "Anastasia"));
            list.add(new Employee(30, "Georg"));
            System.out.println(getEmployeeByAge(list, 26));
        } else if (taskNumber == 7) {
            ArrayList<Employee> list = new ArrayList<>();
            ArrayList<String> newList = new ArrayList<>();
            list.add(new Employee(25, "Pavel"));
            list.add(new Employee(26, "Anastasia"));
            list.add(new Employee(30, "Georg"));
            System.out.println(checkMiddleAge(getMiddleAge(list), 30));
        } else {
            ArrayList<Employee> list = new ArrayList<>();
            ArrayList<String> newList = new ArrayList<>();
            list.add(new Employee(25, "Pavel"));
            list.add(new Employee(26, "Anastasia"));
            list.add(new Employee(15, "Georg"));
            System.out.println(getYoungestEmployeeLink(list));
        }

        }

    public static ArrayList<Integer> getArrayList(int min, int max){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = min; i < max + 1; i++) {
            list.add(i);
            }
        return list;
    }




    public static ArrayList<Integer> getArrayList(int a){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < a; i++) {
            list.add(scanner.nextInt());
        }
        return list;
    }


    public static int sumArrayList(ArrayList<Integer> list){
        int sum = 0;
        for (Integer intValue : list) {
            if (intValue > 5) {
                sum += intValue;
            }
        }
        return sum;
    }

    public static ArrayList<Integer> setArrayElements(ArrayList<Integer> list, int value){
        list.replaceAll(n -> value);
        return list;
    }


    public static ArrayList<Integer> increaseArrayElements(ArrayList<Integer> list, int value){
        list.replaceAll(n -> n+value);
        return list;
    }

    public static ArrayList<String> getName(ArrayList<Employee> list) {
        ArrayList<String> newList = new ArrayList<>();
        for (Employee employee : list) {
            newList.addLast(employee.getName());
        }
        return newList;
    }

    public static ArrayList<String> getEmployeeByAge(ArrayList<Employee> list, int minAge) {
        ArrayList<String> newList = new ArrayList<>();
        for (Employee employee : list) {
            if (employee.getAge() >= minAge) {
                newList.addLast(employee.getName());
            }

        }
        return newList;
    }

    public static int getMiddleAge(ArrayList<Employee> list) {
        int sum = 0;
        int middle;
        for (Employee employee : list) {
            sum += employee.getAge();
        }
        middle = sum / list.size();
        return middle;
    }

    public static boolean checkMiddleAge(int middleAge, int introducedMiddleAge) {
        if (middleAge > introducedMiddleAge) {
            return true;
        } return false;
    }

    public static Employee getYoungestEmployeeLink(ArrayList<Employee> list) {
        Employee link = list.getFirst();
        Integer tempAge = list.getFirst().getAge();
        for (Employee employee : list) {
            if (tempAge > employee.getAge()) {
                link = employee;
                tempAge = employee.getAge();
            }
        }
        return link;
    }



}
