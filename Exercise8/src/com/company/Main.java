package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
         //  Nhập và in Ma trận vuông
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
         // In đường chéo chính và tính tổng
        DuongCheoChinh  dc = new DuongCheoChinh();
        dc.InDuongCheoChinh(Arr, soDong,soCot);

        // In và sắp xếp hàng 2 matran
        SortArr sort = new SortArr();
        sort.sortArr(Arr);
//



    }


}
