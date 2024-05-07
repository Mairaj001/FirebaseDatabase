package com.example.firebasedatabase.Model;

public class Student {

    private int age;
    private int number;

    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student(int age, int number, String name) {
        this.age = age;
        this.number = number;
        this.name = name;
    }

    public Student() {
    }
}