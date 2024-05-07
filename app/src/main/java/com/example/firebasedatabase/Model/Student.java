package com.example.firebasedatabase.Model;

public class Student {

    private int age;
    private int number;
    private String id;

    private String name;

    public Student(int age, int number, String id, String name) {
        this.age = age;
        this.number = number;
        this.id = id;
        this.name = name;
    }

    public Student() {

    }

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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
