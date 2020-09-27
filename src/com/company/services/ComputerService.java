package com.company.services;

import com.company.entities.Computer;
import com.company.entities.File;
import com.company.entities.Student;

import java.util.ArrayList;

final public class ComputerService {
    private ArrayList<Computer> computers = new ArrayList<Computer>();

    public void addComputer(Computer computer) {
        computers.add(computer);
    }

    public void createFile(Student student, Computer computer) {
        String filename = student.getName() + '.' + student.getWorkingWith();
        File file = new File(filename);
        computer.addFile(file);
    }

    public ArrayList<Computer> getComputers() {
        return computers;
    }

    public int createComputers(int computers) {
        for(int i = 0; i < computers; i++) {
            Computer computer = new Computer(i+1);
            addComputer(computer);
        }
        return computers;
    }

    public void createFiles(ArrayList<Computer> computers, ArrayList<Student> students) {
        for(int i = 0; i < students.size();i++)
            createFile(students.get(i),computers.get(i%computers.size()));
    }

    public void printComputers() {
        for(Computer computer : computers)
            System.out.println(computer.toString());
    }

    @Override
    public String toString() {
        return ""+computers;
    }
}
