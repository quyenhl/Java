package com.company;

public class DuongCheoChinh {
    void InDuongCheoChinh(int Arr[][],int soDong,int soCot){
        int sum = 0;
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
    }
}
