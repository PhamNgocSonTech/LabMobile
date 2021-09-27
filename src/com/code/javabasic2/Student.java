package com.code.javabasic2;

public class Student extends Person{
    protected String myIdNum;
    protected double myGPA;
    
    public Student(String myName, int myAge, String myGender, String myIdNum, double myGPA) {
        super(myName, myAge, myGender);
        this.myIdNum = myIdNum;
        this.myGPA = myGPA;
    }
  
    public Student(){

    }

    public String getMyIdNum() {
        return myIdNum;
    }

    public void setMyIdNum(String myIdNum) {
        this.myIdNum = myIdNum;
    }

    public double getMyGPA() {
        return myGPA;
    }

    public void setMyGPA(double myGPA) {
        this.myGPA = myGPA;
    }

    @Override
    public String toString() {
        return super.toString()+ "[myGPA=" + myGPA + ", myIdNum=" + myIdNum + "]";
    }

    
    
}
