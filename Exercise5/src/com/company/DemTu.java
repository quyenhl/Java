package com.company;

import java.util.Scanner;

public class DemTu {
    static  void Demtu(){
        String Str;
        System.out.println("Hãy nhập chuỗi bất kỳ:");
        Scanner scanner = new Scanner(System.in);
        Str = scanner.nextLine();
        Str.trim();
        int count =0;
        int i =0;
        boolean notCount = true;
        for(i=0;i<Str.length();i++){
            if(Str.charAt(i)!=' ' && Str.charAt(i)!='\t' && Str.charAt(i)!='\n'){
                if(notCount){
                    count++;
                    notCount = false;
                } else {notCount = true;}

            }

        }
        System.out.println(count);





    }
}
