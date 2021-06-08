import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    Calculator calculator = new Calculator();
    @Test
    public void testMethodSub() {
        //assertEquals() dùng để xác minh giá trị mong đợi và giá trị thực tế bằng nhau
        //Pass
        assertEquals(15, calculator.add(10, 5));

        //assertNotEquals() dùng để xác minh giá trị mong đợi và giá trị thực tế không bằng nhau.
        //Fail
        assertNotEquals(9, calculator.add(5, 3));

    }
    @Test
    public void assertNul_notNull_Ex(){
        //assertNull() khẳng định rằng một object là null
        //assertNotNull() khẳng định rằng object là not null
        String str = "Java khó";
        String str2 = null;
        //Pass
        assertNull(str2);
        assertNotNull(str);
        //Fail
//        assertNull(str);
        //assertNotNull(str2);

    }
    @Test
    public void AssertArrayEquals() {
        // assertArrayEquals() được áp dụng đối với mảng, nó khẳng định rằng mảng mong đợi và mảng thực tế là bằng nhau.
        int[] arr1= {1, 2,3};
        int[] arr2= {1, 2,3};
        assertArrayEquals(arr1,arr2);

    }
    @Test
    public void AssertTrueFalse() {
        //assertTrue dùng để xác minh điều kiện phải trả về true.
        assertTrue(calculator.add(10, 5)<calculator.add(10, 6));
        assertFalse(calculator.add(10, 5)<calculator.add(10, 2));

    }
    @Test
    public void AssertSameNotSame() {
       // assertSame() khẳng định rằng 2 object có cùng tham chiếu tới chính xác cùng một object.
        // assertNotSame() khẳng định rằng 2 object không tham chiếu đến cùng một đối tượng.
       String str1 ="APPLE";
       String str2 = "Tôi đi học";
       String str3 = str1;
       //pass
        assertSame(str1,str3);
        assertNotSame(str1, str2);
        //fail
        assertSame(str1,str2);
        assertNotSame(str1, str3);


    }

}