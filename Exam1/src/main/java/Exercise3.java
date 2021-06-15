import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise3 {
    public void enterMonth(){
        Scanner sc = new Scanner(System.in);
        boolean isComplete =false;
        while (!isComplete) {
            try {
                System.out.println("enter month:");
                String inputMonth = sc.nextLine();
                int month = Integer.parseInt(inputMonth);
                if (month > 12 || month < 1) {
                    throw new RuntimeException("invalid month");
                }
                if (month == 1 | month == 3 | month == 5 | month == 7 | month == 8 | month == 10 | month == 12) {
                    System.out.println("Tháng " + month + " có 31 ngày");
                } else {
                    if (month == 2) {
                        System.out.println("Tháng " + month + " có 29 ngày");
                    } else {
                        if (month == 4 | month == 6 | month == 9 | month == 11) {
                            System.out.println("Thang: " + month + " co 30 ngay");
                        } else {
                            System.out.println("Thang khong ton tai");
                        }

                    }
                }
                isComplete = true;
            } catch (Exception ex) {
                System.out.println("invalid month, please try again");
            }
        }
    }
}
