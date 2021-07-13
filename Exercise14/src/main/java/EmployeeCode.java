import java.util.InputMismatchException;
import java.util.Scanner;

public class EmployeeCode {
    public  void EnterCode(){
        int  n = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số nhân viên: ");
        n = sc.nextInt();
        while(n<=0) {
            try {
                System.out.println("Invalid Number. Please try again:  ");
                n = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid number");
            }
        }
        String arr[] = new String[n];

        for (int i = 0; i<arr.length;i++){
            System.out.println("Please enter employee code:");
            String id  = sc.nextLine();

            boolean check = id.matches("NV\\d{7}");
            while (!check){

                id = sc.nextLine();
                System.out.println("Wrong input. Please try again: ");
                check = id.matches("NV\\d{7}");

            }
            arr[i] = id;

        }
        System.out.println("List of entered employee code: ");
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }

    }


}
