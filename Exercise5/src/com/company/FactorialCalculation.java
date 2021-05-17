package com.company;

import java.util.Scanner;

public class FactorialCalculation {
     static long facCal (int n) {

         long giaithua = 1;

         if (n == 0 || n == 1) {
             return giaithua;

         } else {
             for (int i = 2; i <= n; i++) {
                 giaithua *= i;
             }
             return giaithua;
         }



    }
    void EnterNumber(){
        System.out.println("Enter a number:");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();

        System.out.println(facCal(number));
    }
}
