package com.company;

import java.util.Scanner;

public class ContainString {
    void containStr(){
        String str1;
        String str2;
        System.out.println("NHập chuỗi A bất kỳ: ");
        Scanner scanner = new Scanner(System.in);
        str1 = scanner.nextLine();
        System.out.println("NHập chuỗi B bất kỳ: ");

        str2 = scanner.nextLine();

        if (str1.contains(str2)){
            System.out.println("Chuỗi A chứa chuỗi B.");
        } else
            System.out.println("Chuỗi A không chứa chuỗi B.");

    }
}
