package com.company;

public class Class {
    private String className;
    private int year;
    private  String subject;

    public Class(String subject,String className, int year ) {
        this.className = className;
        this.year = year;
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Class [Subject=" + subject + ", name=" + className + ", year=" + year + "]";
    }
}
