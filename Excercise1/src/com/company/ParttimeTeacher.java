package com.company;

public class ParttimeTeacher extends Person implements ISpeak,ITeach{
    public ParttimeTeacher(String firstName, String lastName, String job) {
        super(firstName, lastName, job);
    }

    @Override
    public void speak() {

    }

    @Override
    public void teach() {
        System.out.println("Partime Teacher work half day only");
    }

    @Override
    public void prepareLesson() {

    }


}
