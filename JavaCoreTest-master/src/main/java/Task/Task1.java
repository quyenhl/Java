package Task;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 Write a program that will read a string containing numbers from the keyboard, each number is separated by comma ","

 Display to screen the whole list of number in decreasing sorting order.

 If string contains alphabetical character instead of a number, then the method should catch an exception and display to screen the message "String contains character which cannot be converted into number".

 Requirements:
 •The program must read a string of numbers from the keyboard.
 •The readData method is to read numbers from the keyboard
 •The readData method must contain a try-catch block.
 •The sortNumber method is to sorting list of numbers into decreasing order.
 •The readData method calls sortNumber method.
 •If the user enters alphabetical character rather than a number, the program should display message "String contains character which cannot be converted into number".
 */

public class Task1 {
    public List<Integer> readData() {
        System.out.println("Enter numbers: ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        List<Integer> intList = new ArrayList<>();

        try {
            int intdex = 0;
            for (int i = 0; i < input.length(); i++) {
                if (String.valueOf(input.charAt(i)).equals(",")) {
                    int number = Integer.parseInt(input.substring(intdex, i));
                    intdex = i + 1;
                    intList.add(number);
                }
            }
            intList.add(Integer.parseInt(input.substring(intdex)));
        } catch (NumberFormatException e) {
            System.out.println("String contains character which cannot be converted into number");
        }
        return intList;


    }

    public List<Integer> sortNumberList(List<Integer> list){
        Collections.sort(list, Collections.reverseOrder());
        return list;

    }

    public static void main(String[] args) {
        Task1 task1 = new Task1();
        List<Integer> originalSet = task1.readData();
        List<Integer> sortNumberList = task1.sortNumberList(originalSet);
        System.out.println("Sorted Numbers:  ");
        for (Integer i : sortNumberList) {
            System.out.print(i + ",");
        }

    }
}



