package com.code.javabasic3;

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


    @Override
    public void printInfo() {
        // TODO Auto-generated method stub
        super.printInfo();
        System.out.println("Triangle");
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

    
    
    
}
