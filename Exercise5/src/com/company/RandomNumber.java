package com.company;

import java.util.Random;

public class RandomNumber {
    static void randomNumber(){
        Random random = new Random();
        int n = random.nextInt(100);
        System.out.println(n);
        if (checkSoNguyenTo(n)){
            System.out.println("Đây là Số nguyên tố");
        }

        System.out.println("Giai thừa của " + n + " là " + tinhGiaiThua(n));



    }
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
    static  long tinhGiaiThua(int n){
        long  giaithua =1;
        if(n==0||n==1){
            return giaithua;
        } else {
            for(int i=2; i <=n;i++){
                giaithua *=i;
            }
            return  giaithua;
        }
    }
}
