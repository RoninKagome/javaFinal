package com.company.entities;

public class Student {
    private String name;
    private int age;
    private String workingWith;
    public Student(String name, int age, String workingWith) {
        this.name = name;
        this.age = age;
        this.workingWith = workingWith;
    }
    public String getName() {
        return name;
    }
    public String getWorkingWith() {
        return workingWith;
    }
    @Override
    public String toString() {
        return name + ", " + age + ", " + workingWith;
    }
}
