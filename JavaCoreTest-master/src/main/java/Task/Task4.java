package Task;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * 1. Use the keyboard to enter the number N.
 *
 * 2. Use the keyboard to enter N integers and put them in a list: the getIntegerList method.
 *
 * 3. Find the minimum among the list items: the getMinimum method.
 *
 * Requirements:
 * •The program should read values from the keyboard.
 * •The getIntegerList() method should read the number N from the keyboard and then return a list of N elements, which has been filled with numbers read from the keyboard.
 * •The getMinimum() method must return the minimum among the list items.
 * •The main() method should call the getIntegerList() method.
 * •The main() method should call the getMinimum() method.
 */
public class Task4 {
    public static void main(String[] args){
        System.out.println("Enter numbers:");
        Task4 task4 = new Task4();

        List<Integer> integerList = task4.getIntegerList();
        System.out.println("Mininum number :");
        System.out.println(task4.getMinimum(integerList));
    }

    public int getMinimum(List<Integer> array) {
        int min = Collections.min(array);
        return min;


    }

    public List<Integer> getIntegerList(){
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        List<Integer> list = new ArrayList<>();
        for (int i=0; i<n; i++){
            int m = Integer.parseInt(scanner.nextLine());
            list.add(m);
        }
        return list;
    }
}
