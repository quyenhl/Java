package com.company;

import java.util.Scanner;

public class ChangeMonth {
    int  month;
    void switchcase(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tháng:");
        month = scanner.nextInt();

        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Tháng " + month + " có 31 ngày");
                break;
            case  2:
                System.out.println("Tháng " + month + " có 29 ngày");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Tháng " + month + " có 30 ngày");
                break;
            default:
                System.out.println("Tháng không hợp lệ");
                break;
        }


    }
    void ifelse() {
        int month;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tháng:");
        month = scanner.nextInt();
        if (month == 1 | month == 3 | month == 5 | month == 7 | month == 8 | month == 10 | month == 12) {
            System.out.println("Tháng " + month + " có 31 ngày");
        } else {
            if (month == 2) {
                System.out.println("Tháng " + month + " có 29 ngày");
            } else {
                if (month == 4 | month == 6 | month == 9 | month == 11) {
                    System.out.println("Thang: " + month + " co 30 ngay");
                } else {
                    System.out.println("Thang khong ton tai");
                }

            }
        }
    }
}
