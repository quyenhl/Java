package com.company;

public class ParttimeTeacher implements ISpeak,ITeach{
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
