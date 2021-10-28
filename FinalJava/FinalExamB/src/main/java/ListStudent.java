import org.example.Student;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Hello world!
 *
 */
public class ListStudent
{
    public static List<Student> createListStudent() {
        List<Student> students = new ArrayList<>();
        students.add(new Student(23332001, "Hoàng Mai Ngọc", "hn333@gmail.com", 1, 0, 0, 1.5));
        students.add(new Student(23332002, "Hoàng Mai Hoa", "hn33333@ogmail.com", 3, 8, 1, 2.5));
        students.add(new Student(23332003, "Hoàng Mai Lan", "hn3332@gmail.com", 4, 3, 2, 3));
        students.add(new Student(23332015, "Hoàng Mai Huệ", "hn1@gmail.com", 1, 2, 2, 4));
        students.add(new Student(23332016, "Hoàng Mai Nam", "hn3@gmail.com", 4, 4, 3, 5.5));
        students.add(new Student(23332017, "Hoàng Mai Ba", "hn4@gmail.com", 9, 9, 4, 7));
        students.add(new Student(23332018, "Hoàng Mai Ca", "hn5@gmail.com", 8, 4, 5, 4));
        students.add(new Student(23332019, "Hoàng Mai Da", "hn6@gmail.com", 9, 1, 6, 8));
        students.add(new Student(23332010, "Hoàng Mai En", "hn7@gmail.com", 0, 9, 7, 1.5));
        students.add(new Student(23332011, "Hoàng Mai Phuong", "hn8@gmail.com", 1, 3, 8, 8.5));
        students.add(new Student(23332100, "Hoàng Mai Suong", "hn9@gmail.com", 2, 4, 9, 3.5));
        students.add(new Student(23332102, "Hoàng Mai Hiên", "hn10@gmail.com", 3, 2, 10, 4));
        students.add(new Student(23332103, "Hoàng Mai  Ly", "hn11@gmail.com", 0, 9, 9, 8.5));
        students.add(new Student(23332104, "Hoàng Mai Mi", "hn12@gmail.com", 9, 9, 9, 9));
        students.add(new Student(23332105, "Hoàng Mai Ni", "hn13@gmail.com", 7, 9, 8, 0));
        students.add(new Student(23332106, "Hoàng Mai Ong", "hn14@gmail.com", 9, 9, 7, 8));
        students.add(new Student(23332107, "Hoàng Mai Uyen", "hn16@gmail.com", 9, 9, 6, 1.5));
        students.add(new Student(23332108, "Hoàng Mai Tra", "hn18@gmail.com", 0, 3, 5, 8));

        students.forEach(user -> {
            System.out.println("ID : " + user.getId() + ", Name : " + user.getName() + ", Email : " + user.getEmail() + ", bonus : " + user.getBonus()
                    + ", report : " + user.getReport() + ", app : " + user.getApp() + ", lt : " + user.getLt());
        });
        return students;
    }

    //Câu 2
    public static List<Student> top10HighScore(List<Student> students) throws Exception {
        if(students == null || students.size() < 10) {
            throw new Exception("Invalid data");
        }
        return students.stream()
                .sorted(Comparator.comparingDouble(Student::getLt).reversed())
                .limit(10)
                .collect(Collectors.toList());
    }
    // Câu 3
    public static Map<Student,Double> sumMark(List<Student> students) throws Exception {
        if(students == null || students.size() == 0) {
            throw new Exception("Invalid data");
        }
        Map<Student,Double> result = new HashMap<>();
        for (Student st: students){
            double mark = st.getBonus()*0.1 + st.getReport()*0.3 + st.getApp()*0.15 + st.getLt()*0.45;
            double roundmark =  Math.round(mark*10)/10.0d;
            result.put(st,roundmark);
        }

        return result;
    }
    //Câu 4
    public static Map<Student,Double> top10LowestScore(Map<Student,Double> finalPoint) throws Exception {
        if(finalPoint == null || finalPoint.isEmpty()) {
            throw new Exception("Invalid size");
        }
        return finalPoint.entrySet().stream().
                sorted(Map.Entry.comparingByValue())
                .limit(10).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    }
    public static void classFinal(Map<Student,Double> students) throws Exception {

        System.out.println("Number of Students: " + students.size());

        long pass = students.entrySet().stream().filter(x -> x.getValue() > 4.5).count();
        System.out.println("Passed: " + pass + " Rate: " + (double) pass/students.size()*100 + "%" );
        int notPass = (int) (students.size() - pass);
        System.out.println("Failed: " + notPass + " Rate: " + (double) notPass/students.size()*100 + "%" );

        int excellence = (int)students.entrySet().stream().filter(x -> x.getValue() >=8 && x.getValue() <=10 ).count();
        int middle = (int)students.entrySet().stream().filter(x -> x.getValue() >=6.5 && x.getValue() <8 ).count();
        int normal = (int)students.entrySet().stream().filter(x -> x.getValue() >=5 && x.getValue() <6.5 ).count();

        System.out.println("Excellent students(điểm tổng kết 8 - 10) " + excellence + " Rate: " + (double) excellence/students.size()*100 + "%" );
        System.out.println("Good students (điểm tổng kết 6.5 - 8) " + middle + " Rate: " + (double) middle/students.size()*100 + "%" );
        System.out.println("Normal students (điểm tổng kết 5 - 6.5) " + normal + " Rate: " + (double) normal/students.size()*100 + "%" );
    }

}
