package com.code.javabasic2;

public class CollegeStudent extends Student {
    protected String major;
    protected int year;

    
    public CollegeStudent(String myName, int myAge, String myGender, String myIdNum, double myGPA, String major,
            int year) {
        super(myName, myAge, myGender, myIdNum, myGPA);
        this.major = major;
        this.year = year;
    }


    public CollegeStudent() {
        
    }

    
    @Override
    public String toString() {
        return super.toString()+ "[major=" + major + ", year=" + year + "]";
    }


    public String getMajor() {
        return major;
    }


    public void setMajor(String major) {
        this.major = major;
    }


    public int getYear() {
        return year;
    }


    public void setYear(int year) {
        this.year = year;
    }


    
}
