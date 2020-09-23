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
    @Override
    public String toString() {
        return ""+students;
    }
}
