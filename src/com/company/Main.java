package com.company;

import com.company.entities.Computer;
import com.company.entities.Student;
import com.company.services.StudentService;
import com.company.services.ComputerService;

final public class Main {

    private static final String ANSI_RESET = "\u001B[0m";
    private static final String ANSI_GREEN = "\u001B[32m";
    private static final String ANSI_RED = "\u001B[31m";

    public static void main(String[] args) {

        ComputerService computerService = new ComputerService();
        final int computers = computerService.createComputers(26);

        StudentService studentService = new StudentService();
        final int students = studentService.createStudents(100);

        computerService.createFiles(computerService.getComputers(),studentService.getStudents());

        System.out.println(ANSI_GREEN + "Students in student service" + ANSI_RESET);
        System.out.println(ANSI_RED + "name,age,works with" + ANSI_RESET);
        studentService.printStudents();

        System.out.println(ANSI_GREEN + "\nComputers in computer service" + ANSI_RESET);
        System.out.println(ANSI_RED + "ip, files(names)" + ANSI_RESET);
        computerService.printComputers();
    }
}
