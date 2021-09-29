package com.code.javabasic3;

import java.util.Scanner;

public class Circle extends Shape {
    protected double radius;

    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    public Circle() {

    }

    @Override
    public void input() {
        // TODO Auto-generated method stub
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập bán kính: ");
        radius = sc.nextDouble();
    }

    @Override
    public void printInfo() {
        // TODO Auto-generated method stub
        super.printInfo();
        System.out.println("Bán kính của " + name + " có bán kính là " + radius);
    }

    @Override
    public double getArea() {
        // TODO Auto-generated method stub
        return ((radius * radius) * 3.14);
    }

    @Override
    public double getPrimeter() {
        // TODO Auto-generated method stub
        return ((2 * radius) * 3.14);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

}
