package com.company;

import java.util.Scanner;

public class Rectangle {
    void rectangle(){
        int length;
        int width;
        do {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter the length: ");
            length = scan.nextInt();
            System.out.println("Enter the width: ");
            width = scan.nextInt();
        } while (length<=1 && width <=1);

        for (int i=1; i <= length; i ++){
            for (int j=1; j <=width;j++){
                System.out.print("  *");
            }
            System.out.println("");
        }

    }
}
