package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int soDong, soCot;
        int sum = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số dòng, số cột: ");
        soDong = scanner.nextInt();
        soCot = soDong;
        int[][] Arr = new int[soDong][soCot];
        int[] Arr1 = new int[soDong];
        for (int i =0; i < soDong;i++){
            for (int j =0;j < soCot;j++){
                System.out.print("Ma trận A - Nhập phần tử thứ [" + i + "," + j + "]: ");
                Arr[i][j]=scanner.nextInt();

            }
        }

        System.out.println("Ma trận A:");
        for (int i=0;i <soDong;i++){
            for (int j =0;j <soCot;j++){
                System.out.print(Arr[i][j] + "\t");
            }
            System.out.println("\n");
        }

        System.out.println("Đường chéo chính là: ");
        for (int i=0;i <soDong;i++){
            for (int j =0;j <soCot;j++){
                if( i ==j){
                System.out.print(Arr[i][j] + "\t");
               sum = sum + Arr[i][j];}
            }

        }

        System.out.println("Tổng đường chéo chính là : " + sum);
        int temp =0;
        for (int i = 0; i < Arr.length-1;i++){
            for (int j= i+1;j<Arr.length;j++)
            if(Arr[1][j]<Arr[1][i]){
                temp = Arr[1][j];
                Arr[1][j] = Arr[1][i];
                Arr[1][i]= temp;

            }
        }

        for (int i = 1; i<Arr.length;i++){
            for(int j = 0; j<Arr.length; j++){
                if(i==1) {

                    System.out.print(Arr[i][j] + " ");
                }
            }
        }
//        System.out.println("Tổng đường chéo chính là : " + sum);

    }

}
