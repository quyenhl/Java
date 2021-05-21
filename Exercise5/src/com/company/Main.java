package com.company;

public class Main {

    public static void main(String[] args) {
      SoNguyenTo nguyento = new SoNguyenTo();
//      nguyento.useFor();
//      nguyento.useWhile();
//      nguyento.useDoWhile();

        System.out.println("In ra số nguyên tố nhỏ hơn 100 sử dụng For ");
        nguyento.useForwith100();
        System.out.println("In ra số nguyên tố nhỏ hơn 100 sử dụng Do while ");
        nguyento.useDoWhilewith100();
        System.out.println("In ra số nguyên tố nhỏ hơn 100 sử dụng while ");
        nguyento.useWhilewith100();

//        RandomNumber rand = new RandomNumber();
//        rand.randomNumber();

//          FactorialCalculation fcal = new FactorialCalculation();
//          fcal.EnterNumber();

        //  Bài 5-15
        System.out.println("Bài 5 và bài 15:" + "\n");
        PrintString printString = new PrintString();
        printString.printStr();
        //  Bài 8
        System.out.println("Bài 8:" + "\n");
        DemTu demTu = new DemTu();
        demTu.Demtu();


    }
}
