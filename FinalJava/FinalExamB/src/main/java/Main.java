import org.example.Student;

import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws Exception {
        List<Student> student = ListStudent.createListStudent();
        System.out.println("-------------------------------------");
        List<Student> top10HighScore = ListStudent.top10HighScore(student);
        for (Student item: top10HighScore
             ) {
            System.out.println(item.toString());
        }
        System.out.println("-------------------------------------");
        Map<Student,Double> studentsNew = ListStudent.sumMark(student);

        Map<Student,Double> top10Lowest = ListStudent.top10LowestScore(studentsNew);
        for(Map.Entry<Student,Double> x : top10Lowest.entrySet()) {
            System.out.println(x.getKey().toString() + ", final mark: " + x.getValue());
        }

        System.out.println("-------------------------------------");
        for(Map.Entry<Student,Double> x : studentsNew.entrySet()) {
            System.out.println(x.getKey().toString() + ", final mark: " + x.getValue());
        }

        System.out.println("-------------------------------------");
        ListStudent.classFinal(studentsNew);
    }
}
