package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        mangSoNguyen();
    }

    static void mangSoNguyen(){
    //Nhập phần tử cho mảng
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số phần tử mảng: ");
        int size = scanner.nextInt();
        int Array[] = new int[size];

        for (int i =0; i< Array.length; i++){
            System.out.println("Nhập phần tử mảng vị trí "+ i);
            Array[i]= scanner.nextInt();

        }
        System.out.println("Mảng vừa nhập là: ");
        for (int i =0; i< Array.length; i++){
            System.out.print(Array[i] +"\t");

        }

        // Tìm phần tử l lớn nhất và in
        int max = 0;
        for (int i = 0; i <Array.length;i++){
            if (Array[i]> max){
                max = Array[i];
            }
        }


        System.out.println("\nPhần tử lớn nhất trong mảng là: " + max);

        for (int i = 0; i < Array.length; i++) {
            if (Array[i] == max) {
                System.out.println("Index của phần tử là: " + i);
            }
        }

        //Tìm phần tử bé nhất và in
        int min = Array[0];

        for (int j = 0; j <Array.length;j++){
            if (min> Array[j]){
                min = Array[j];
            }
        }


        System.out.println("\nPhần tử nhỏ nhất trong mảng là: " + min);

        for (int j = 0; j < Array.length; j++) {
            if (Array[j] == min) {
                System.out.println("Index của phần tử là: " + j);
            }
        }




    }

}

