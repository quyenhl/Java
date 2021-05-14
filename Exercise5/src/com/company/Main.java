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
    }
}
