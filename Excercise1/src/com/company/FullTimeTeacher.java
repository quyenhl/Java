package com.company;

public class FullTimeTeacher extends Person implements ITeach,ISpeak,IManageClass{

    public FullTimeTeacher(String firstName, String lastName, String job) {
        super(firstName, lastName, job);
    }

    @Override
    public void speak() {

    }

    @Override
    public void teach() {
        System.out.println("FullTime Teacher will work 8 hours per day");

    }

    @Override
    public void prepareLesson() {

    }


    @Override
    public void contactFamily() {

    }

    @Override
    public void manageStudy() {

    }
}
