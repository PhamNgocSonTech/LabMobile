package com.code.javabasic2;

public class Person {
    protected String myName;
    protected int myAge;
    protected String myGender;
    
    public Person(String myName, int myAge, String myGender) {
        this.myName = myName;
        this.myAge = myAge;
        this.myGender = myGender;
    }

    public Person(){

    }

    @Override
    public String toString() {
        return "[myAge=" + myAge + ", myGender=" + myGender + ", myName=" + myName + "]";
    }

    public String getMyName() {
        return myName;
    }

    public void setMyName(String myName) {
        this.myName = myName;
    }

    public int getMyAge() {
        return myAge;
    }

    public void setMyAge(int myAge) {
        this.myAge = myAge;
    }

    public String getMyGender() {
        return myGender;
    }

    public void setMyGender(String myGender) {
        this.myGender = myGender;
    }


    
}
