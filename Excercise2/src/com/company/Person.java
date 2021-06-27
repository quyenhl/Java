package com.company;

import java.util.Iterator;

public class Person {
    String name;
    String nationality;
    int age;

    public String getName() {
        return name;
    }

    public String getNationality() {
        return nationality;
    }

    public int getAge() {
        return age;
    }

    public Person(String name, String nationality, int age) {
        this.name = name;
        this.nationality = nationality;
        this.age = age;
    }



    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", nationality='" + nationality + '\'' +
                ", age=" + age +
                '}';
    }
}
