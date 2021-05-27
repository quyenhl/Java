package com.company;

public class SortArr {
    void sortArr(int Arr[][]){

        System.out.println("Hang 2 da sap xep la:");

        for (int i = 1; i<Arr.length;i++){
            for(int j = 0; j<Arr.length; j++){
                if(i==1) {

                    System.out.print(Arr[i][j] + "\t");
                }
            }
        }

    }
}
