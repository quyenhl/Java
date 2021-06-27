package com.company;
import java.util.Iterator;

import java.util.*;
import java.util.stream.Collectors;



public class Main {

    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<Person>(Arrays.asList(
                new Person("Vinh", "Vietnam", 28),
                new Person("Lan", "Vietnam", 24),
                new Person("John", "USA", 27),
                new Person("Lee", "China", 67),
                new Person("Kim", "Korea", 22),
                new Person("Long", "Vietnam", 18),
                new Person("Jungho", "Korea", 19),
                new Person("Tian", "China", 20),
                new Person("Clara", "USA", 40),
                new Person("Mikura", "Japan", 27),
                new Person("Sony", "Japan", 29),
                new Person("Xiang", "China", 78),
                new Person("Peter", "France", 18),
                new Person("Haloy", "Malaysia", 20),
                new Person("Magie", "Malaysia", 32)
        ));
        //1.1 Đếm số người theo từng quốc tịch in ra màn hình
        System.out.println("1.1 Đếm số người theo từng quốc tịch in ra màn hình");
        countPeopleByNationality(people);
        //1.2 Sắp xếp theo tên những người trên 25 tuổi rồi in ra màn hình
        System.out.println("1.2 Sắp xếp theo tên những người trên 25 tuổi rồi in ra màn hình");
        sortPeopleOver25(people);

        System.out.println("1.3 Tính trung bình tuổi của người theo từng quốc gia");
        averageAgePerNationality(people);

        System.out.println("1.4 In ra màn hình đánh giá tuổi mỗi người");
        checkByAge(people);







    }
    public static void countPeopleByNationality( ArrayList<Person> people){
        Map<String, Integer> map = new HashMap<String, Integer>();
        int count =0;
        for (int i = 0; i < people.size(); i++) {

            if (!map.containsKey(people.get(i).nationality)) {
                map.put(people.get(i).nationality, 1);
            } else {
                count = map.get(people.get(i).nationality);
                count++;
                map.put(people.get(i).nationality, count);
            }
        }

        for (String qt : map.keySet()) {
            String key = qt.toString();
            String value = map.get(qt).toString();
            System.out.println("- "+ key + ": " + value);
        }



    }
    public static void sortPeopleOver25(ArrayList<Person> people){
        List<Person> person = new ArrayList<>();
        Map<String, List<Integer>> map = new HashMap<>();

        for (int i = 0; i < people.size(); i++) {

            if (people.get(i).age>25) {
                person.add(people.get(i));
            }
        }
        person.stream().sorted(Comparator.comparing(Person::getName)).forEach(System.out::println);

    }

    public  static  void averageAgePerNationality(ArrayList<Person> people) {
        Map<String, List<Integer>> map = new HashMap<>();

        for (Person p : people) {
            List<Integer> age = new ArrayList<>();
            if (!map.containsKey(p.getNationality())) {
                age.add(p.getAge());
                map.put(p.getNationality(), age);
            } else {
                age = map.get(p.getNationality());
                age.add(p.getAge());
            }

        }
        System.out.println(map);
        Map<String, Double> map2 = new HashMap<>();
        for (String nationality : map.keySet()) {
            List<Integer> list = map.get(nationality);
            double sum = 0;
            Iterator<Integer> iter1 = list.iterator();
            while (iter1.hasNext()) {
                sum += iter1.next();
            }
            double average = sum / list.size();
            double value = Math.floor(average * 10) / 10;
            map2.put(nationality, value);
        }
        map2.forEach((nationality, value) -> System.out.println("- "+ nationality + " : " + value));


    }
    public static void checkByAge(ArrayList<Person> people){
        Map<Person, String> map = new HashMap();

        for (Person p : people) {
            if (p.getAge() < 20) {
                map.put(p, "nổi loạn");
            } else if (p.getAge() >= 20 && p.getAge() < 31) {
                map.put(p, "việc làm");
            } else if (p.getAge() >= 31 && p.getAge() < 41) {
                map.put(p, "sự nghiệp");
            } else {
                map.put(p, "hưởng thụ");
            }
        }

        map.forEach((key, value) -> System.out.println("- " + key.name + " - "+ key.nationality + " - "+ key.age+ " - " + value));
    }
}
