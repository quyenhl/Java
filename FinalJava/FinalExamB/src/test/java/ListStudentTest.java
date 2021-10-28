import org.example.Student;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ListStudentTest {

    @Test
    void createListStudent() {
        List<Student> student = ListStudent.createListStudent();
        Assert.assertTrue(student.size() != 0);
    }

    @Test
    void top10HighScore() throws Exception {
        List<Student> student = ListStudent.createListStudent();
        List<Student> top10 = ListStudent.top10HighScore(student);
        Assert.assertTrue(top10.size() == 10);
    }

    @Test
    void sumMark() {
        List<Student> student = ListStudent.createListStudent();
    }

    @Test
    void top10LowestScore() {
    }

    @Test
    void classFinal() {
    }
}