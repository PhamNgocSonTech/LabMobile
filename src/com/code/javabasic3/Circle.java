package com.code.javabasic3;

public class Circle extends Shape {
    protected double radius;

    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    @Override
    public void printInfo() {
        // TODO Auto-generated method stub
        super.printInfo();
        System.out.println("circle have name is "+name);
        System.out.println(name+" have radius is "+radius);
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
