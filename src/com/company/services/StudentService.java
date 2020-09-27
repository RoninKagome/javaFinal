package com.company.services;

import com.company.entities.Student;

import java.util.ArrayList;

public class StudentService {
    private ArrayList<Student> students = new ArrayList<Student>();

    public void addStudent(Student student) {
        students.add(student);
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public int createStudents(int students) {
        for(int i = 0; i < students; i++) {
            Student student = new Student("student"+(i!=0?"_"+i:""),i+1,"java");
            addStudent(student);
        }
        return students;
    }

    public void printStudents() {
        for(Student student : students)
            System.out.println(student.toString());
    }

    @Override
    public String toString() {
        return ""+students;
    }
}
