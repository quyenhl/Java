package Task;

import java.util.Scanner;

/**
 * Write a method readString that reads a string from the keyboard.
 *
 * Write a method upperCaseString to change the first letter of each word to uppercase
 *
 * Display the result on the screen.
 *
 * Example input:
 * sam i am.
 *
 * Example output:
 * Sam I Am.
 *
 * Requirements:
 * •The method readString should read a string from the keyboard.
 * •The method upperCaseString should change the first letter of each word to uppercase
 * •The main method displays the result to screen.
 */
public class Task3 {
    public String readString()  {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter String:");
        String s = scanner.nextLine();
        return s;
    }

    public String upperCaseString (String s) {
        char[] charArray = s.toCharArray();
        for (int i=0; i<charArray.length; i++){
            if (i == 0)
                charArray[i] = Character.toUpperCase(charArray[i]);
            if (String.valueOf(charArray[i]).equals(" ") && !String.valueOf(charArray[i+1]).equals(" ")){
                charArray[i+1] = Character.toUpperCase(charArray[i+1]);
            }
        }
        s = String.copyValueOf(charArray);

        return s;



    }


    public static void main(String[] args) {
        Task3 task3 = new Task3();
        String s = task3.upperCaseString(task3.readString());
        System.out.println("Chuỗi sau khi viết hoa kí tự đầu tiên là:  " + s);
    }

}
