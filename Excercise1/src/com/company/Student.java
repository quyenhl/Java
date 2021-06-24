package com.company;

public class Student extends Person implements ISpeak,IStudy{
    private String name;

    public Student(String firstName, String lastName, String job) {
        super(firstName, lastName, job);
    }



    @Override
    public void speak() {


    }

    @Override
    public void study() {
        System.out.println("Students have to study as scheduled calendar");

    }
}
