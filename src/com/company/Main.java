package com.company;

import com.company.entities.Computer;
import com.company.entities.Student;
import com.company.services.StudentService;
import com.company.services.ComputerService;

public class Main {

    public static void main(String[] args) {
        ComputerService computerService = new ComputerService();
        final int computers = 26;
        for(int i = 1; i < computers; i++) {
            Computer computer = new Computer(i);
            computerService.addComputer(computer);
        }

        StudentService studentService = new StudentService();
        final int students = 100;
        for(int i = 0; i < students; i++) {
            Student student = new Student("student"+(i!=0?"_"+i:""),i+1,"java");
            studentService.addStudent(student);
        }

        for(int i = 0; i < studentService.getStudents().size();i++)
            computerService.createFile(studentService.getStudents().get(i),computerService.getComputers().get(i%computerService.getComputers().size()));

        System.out.println(studentService.toString());

        System.out.println(computerService.toString());
    }
}
