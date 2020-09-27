package com.company.entities;

import java.util.ArrayList;

public class Computer {
    private int ip;
    private ArrayList<File> files = new ArrayList<File>();

    public Computer(int ip) {
        this.ip = ip;
    }

    public void addFile(File file) {
        files.add(file);
    }

    @Override
    public String toString() {
        return ip + ", " + files;
    }
}
