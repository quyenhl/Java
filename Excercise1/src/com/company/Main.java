package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        System.out.println("Mô phỏng lớp học");

        Person s1 = new Person("cường","Trịnh" , "FullTimeTeacher");
        Person s2 = new Person("Thoa", "Nguyễn", "Student");
        Person s3 = new Person("Mai", "Nguyễn", "Student");
        Person s4 = new Person("Ngọc", "Nguyễn", "PartTimeTeacher");

        ArrayList<Person> people = new ArrayList<>();
        people.add(s1);
        people.add(s2);
        people.add(s3);
        people.add(s4);

        for (Person p : people) {
            System.out.println(p);
        }

        Class Java1 = new Class("Java1","SE01",2021);
        Class Java2 = new Class("Java2","SE01",2021);

        System.out.println("************************");
        System.out.println("Lớp " + Java1 + "gồm có: ");
        Student student = new Student("Thoa","Nguyễn", "Student");
        System.out.println(student);
        student.study();
        FullTimeTeacher fTeacher = new FullTimeTeacher("Cường", "Trịnh", "FullTimeTeacher");
        System.out.println(fTeacher);
        fTeacher.teach();
        System.out.println("************************");
        System.out.println("Lớp " + Java2 + "gồm có: ");
        ParttimeTeacher pTeacher = new ParttimeTeacher("Ngọc", "Trịnh", "PartTimeTeacher");
        System.out.println(pTeacher);
        pTeacher.teach();
        Student student1 = new Student("Mai","Nguyễn", "Student");
        System.out.println(student1);
        student.study();
    }
}
