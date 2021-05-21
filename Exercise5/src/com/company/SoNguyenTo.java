package com.company;

import java.util.Scanner;

public class SoNguyenTo {
    static boolean checkSoNguyenTo(int number){
    if (number < 2){
        return false;
    }
    for( int i = 2; i <=Math.sqrt(number);i++){
        if(number % i==0) {
            return false;
        }

    }
    return true;
    }
    static void useFor() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hãy nhập số:");
        int n = scanner.nextInt();
        System.out.println(n + " số nguyên tố đầu tiên là(Sử dụng vòng for):" + "\t");

        for(int i=2;i<=n;i++)
        {
            if(checkSoNguyenTo(i)) {
                System.out.print(i + "\n");
            }
        }
    }
    static void useWhile(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hãy nhập số:");
        int n = scanner.nextInt();
        System.out.println( n + " số nguyên tố đầu tiên là (sử dụng while):" +"\t");
        int count=0;
        int  i = 2;

        while (count <n){
            if (checkSoNguyenTo(i)){
                System.out.println(i + "\t");
                count ++;
            }
            i+=1;
        }

    }
    static void useDoWhile(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bao nhiêu số nguyên tố cần được in :");
        int n = scanner.nextInt();
        System.out.println( n + " số nguyên tố đầu tiên là (Sử dụng Dowhile):" +"\n");
        int count=0;
        int  i = 2;


        do{
           if(checkSoNguyenTo(i)) {
               System.out.println(i + "\t");

               i++;
           }
        }
        while (count <n);
    }

//Các số nguyên tố nhỏ hơn 100
static void useForwith100() {
    int n =100;
    for(int i=2;i<n;i++)
    {
        if(checkSoNguyenTo(i)) {
            System.out.print(i + "\n");
        }
    }
}
    static void useWhilewith100(){


        int  i = 2;

        while (i <100){
            if (checkSoNguyenTo(i)){
                System.out.println(i + "\t");
                i++;
            }
            i++;

        }

    }
    static void useDoWhilewith100(){


        int  i = 2;


        do{
            if(checkSoNguyenTo(i)) {
                System.out.println(i + "\t" );

            }
            i++;
        }
        while (i <100);

    }
}
