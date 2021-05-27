package com.company;

import java.util.Scanner;

public class Triangle {
    void triangle(){
        int height;

        Scanner news = new Scanner(System.in);

        do{
            System.out.println("Enter the height: ");
            height = news.nextInt();

        } while (height<=1);

        for (int i =1; i <=height; i++){
            for (int j = i; j <=height;j++){
                System.out.print("  ");
            }
            for(int j=1; j<=(2*i-1); j++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
