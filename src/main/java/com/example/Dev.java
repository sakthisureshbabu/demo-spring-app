package com.example;

public class Dev {
    private Computer computer;

    public Dev() {
        System.out.println("Dev Constructor");
    }

    public Computer getComputer() {
        return computer;
    }

    public void setComputer(Computer computer) {
        this.computer = computer;
    }

    public void build() {
        computer.compile();
        System.out.println("Working on Awesome project");
    }
}