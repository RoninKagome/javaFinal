package com.company;

import com.company.entities.Computer;
import com.company.entities.Student;
import com.company.services.StudentService;
import com.company.services.ComputerService;

public class Main {

    public static void main(String[] args) {

        ComputerService computerService = new ComputerService();
        final int computers = computerService.createComputers(26);

        StudentService studentService = new StudentService();
        final int students = studentService.createStudents(100);

        computerService.createFiles(computerService.getComputers(),studentService.getStudents());

        System.out.println("Students in student service");
        studentService.printStudents();

        System.out.println("\nComputers in computer service");
        computerService.printComputers();
    }
}
