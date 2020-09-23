package com.company.services;

import com.company.entities.Computer;
import com.company.entities.File;
import com.company.entities.Student;

import java.util.ArrayList;

public class ComputerService {
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
    @Override
    public String toString() {
        return ""+computers;
    }
}
