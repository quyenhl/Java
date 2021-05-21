package com.company;

import java.util.Scanner;

public class DemTu {
      void Demtu(){
        String Str;
        System.out.println("Hãy nhập chuỗi bất kỳ:");
        Scanner scanner = new Scanner(System.in);
        Str = scanner.nextLine();

        int count=0 ;


        for(int i=0;i<Str.length()-1;i++){
            if(Str.charAt(i)==' ' && Str.charAt(i+1)!=' '){
                count++;

            }

        }
          if(Str.charAt(0)!=' ')
          {
              count++;
          }
        System.out.println(count);




    }
}
