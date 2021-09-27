package com.code.javabasic2;

public class Teacher extends Person {
    protected String subject;
    protected double salary;

    public Teacher(String myName, int myAge, String myGender, String subject, double salary) {
        super(myName, myAge, myGender);
        this.subject = subject;
        this.salary = salary;
    }
    public Teacher() {
        
    }
    public String getSubject() {
        return subject;
    }
    public void setSubject(String subject) {
        this.subject = subject;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    @Override
    public String toString() {
        return super.toString()+ "[salary=" + salary + ", subject=" + subject + "]";
    }
    
    
    
}
