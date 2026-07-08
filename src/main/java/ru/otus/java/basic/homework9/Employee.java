package ru.otus.java.basic.homework9;

public class Employee {
    private String name;
    private Integer age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public Employee(Integer age, String name) {
        this.age = age;
        this.name = name;
    }
}
