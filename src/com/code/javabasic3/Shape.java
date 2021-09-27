package com.code.javabasic3;

public abstract class Shape {
    protected String name;

    protected Shape(String name) {
        this.name = name;
    }
    public void Shape(){

    }

    public abstract double getArea();

    

    public abstract double getPrimeter();

    public void printInfo(){
        System.out.println("Shape is ");
    }
    
}
