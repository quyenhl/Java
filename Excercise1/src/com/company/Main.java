package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        System.out.println("Mô phỏng lớp học");

        Person s1 = new Person("trịnh", "cường", "Teacher");
        Person s2 = new Person("nguyễn", "Thoa", "Student");
        Person s3 = new Person("nguyễn", "Mai", "Student");
        ArrayList<Person> people = new ArrayList<>();
        people.add(s1);
        people.add(s2);
        people.add(s3);
        for (Person p : people) {
            System.out.println(p);
        }

        Class Java1 = new Class("Java1","SE01",2021);
        Class Java2 = new Class("Java2","SE01",2021);
        System.out.println(Java1);
        System.out.println(Java2);


        Student student = new Student("Nguyễn","Thoa", "Student");
        student.study();
        FullTimeTeacher fTeacher = new FullTimeTeacher();
        fTeacher.teach();
        ParttimeTeacher pTeacher = new ParttimeTeacher();
        pTeacher.teach();
    }
}
