package com.company;

public class PrintString {
    void printStr(){
    String str ="You only live once, but if you do it right, once is enough";
    int count =0;
        System.out.println(str);
        System.out.println("Vị trí của o trong chuỗi trên là :");
        for (int i = 0; i < str.length(); i++) {

            if(str.charAt(i)=='o'){
                System.out.print(i + "\t");
                count ++;
            }

        }
        System.out.println("\n"+" Số lần xuất hiện o là " + count);


    }
}
