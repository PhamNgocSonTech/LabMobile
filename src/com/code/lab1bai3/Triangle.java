package com.code.lab1bai3;

import java.util.Scanner;

public class Triangle extends Shape {
    protected double side1;
    protected double side2;
    protected double side3;

    public Triangle(String name, double side1, double side2, double side3) {
        super(name);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    public Triangle(){

    }

    @Override
    public void input() {
        // TODO Auto-generated method stub
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập cạnh thứ 1: ");
        side1 = sc.nextDouble();
        System.out.println("Nhập cạnh thứ 2: ");
        side2 = sc.nextDouble();
        System.out.println("Nhập cạnh thứ 3: ");
        side3 = sc.nextDouble();
    }

    @Override
    public void printInfo() {
        // TODO Auto-generated method stub
        super.printInfo();
        System.out.println("Hình tam giác " + name + " có cạnh thứ 1 là: " + side1);
        System.out.println("Hình tam giác " + name + " có cạnh thứ 2 là: " + side2);
        System.out.println("Hình tam giác " + name + " có cạnh thứ 3 là: " + side3);
        System.out.println("------------------------------------------------");


    }

    @Override
    public double getArea() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public double getPrimeter() {
        // TODO Auto-generated method stub
        return side1 + side2 + side3;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

}
