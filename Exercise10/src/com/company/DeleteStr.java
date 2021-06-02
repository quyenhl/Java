package com.company;

import java.util.Scanner;

public class DeleteStr {
    void DeleteStr(){
        String str;
        String StrOutput =  new String();
        System.out.println("Nhập chuỗi bất kỳ:");
        Scanner scanner = new Scanner(System.in);
        str = scanner.nextLine();
        for (int i = 0; i < str.length();i++){
            boolean isDuplicate = false;
            String str1 = String.valueOf(str.charAt(i));
            for (int j =0; j <StrOutput.length();j++){
                if(str.charAt(i)==StrOutput.charAt(j)){
                    isDuplicate = true;
                    break;
                }
            }
            if (isDuplicate == false){
                StrOutput  = StrOutput.concat(str1);

            }
        }
        System.out.println("Chuỗi sau khi xóa kí tự giống nhau: " + StrOutput);
    }
}
