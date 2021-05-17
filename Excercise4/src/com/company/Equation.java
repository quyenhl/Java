package com.company;

import java.util.Scanner;

public class Equation {
    double a;
    double b;
    double c;


    void calculation () {
        Scanner scanner= new Scanner(System.in);

        System.out.println("Nhập số a:" );
        a = scanner.nextDouble();
        if (a==0){
            System.out.println("Invalid number");
        } else {

            System.out.println("Nhập số b:");
            b = scanner.nextDouble();

            System.out.println("Nhập số c:");
            c = scanner.nextDouble();

            double delta = b * b - (4 * a * c);
            if (delta < 0) {
                System.out.println("Phương trình vô nghiệm");
            } else {
                if (delta == 0) {
                    double x1 = -b / 2 * a;
                    double x2 = -b / 2 * a;
                    System.out.println("Phương trình có nghiệm kép x1=" + x1 + " và x2=" + x2);
                } else {
                    if (delta > 0) {
                        double sqroot = Math.sqrt(delta);
                        double x1 = (-b + sqroot) / (2 * a);
                        double x2 = (-b - sqroot) / (2 * a);
                        System.out.println("Phương trình có 2 nghiệm phân biệt " + x1 + " và " + x2);
                    }


                }

            }
        }
    }


}
