package com.company;

public class FullTimeTeacher implements ITeach,ISpeak,IManageClass{

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
