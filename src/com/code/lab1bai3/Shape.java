package com.code.lab1bai3;

import java.util.Scanner;

public abstract class Shape {
    protected String name;

    protected Shape(String name) {
        this.name = name;
    }

    protected Shape() {

    }

    public abstract double getArea();

    public abstract double getPrimeter();

    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Tên Hình  " );
        name = sc.nextLine();
    }
    public void printInfo() {
        System.out.println("Hình " + name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
