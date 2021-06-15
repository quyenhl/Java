import java.util.Scanner;

public class Exercise2 {
    public  void enterPwd(){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Please enter Password: ");
//        String pwd = sc.nextLine();
//
////       isValidPassword(pwd);
//        System.out.println(isValidPassword(pwd));
        boolean isComplete =false;
        while (!isComplete) {
        Scanner sc = new Scanner(System.in);
         System.out.println("enter password:");
                String pwd = sc.nextLine();
                isValidPassword(pwd);}
        isComplete = true;


    }

    public static void isValidPassword(String password)
    {
        Scanner sc = new Scanner(System.in);

        String upperCaseChars = "(.*[A-Z].*)";
        String numbers = "(.*[0-9].*)";
        String specialChars = "(.*[@,#,$,%,_,-].*$)";

        if (password.length() < 10)
        {
            System.out.println("Mật khẩu yếu. Phải lớn hơn 10 ký  tự");


        } else if (!password.matches(upperCaseChars )){

            System.out.println("Mật khẩu chưa đủ mạnh. Phải có ít nhất 1 chữ hoa");

        } else if (!password.matches(numbers )){

            System.out.println("Mật khẩu chưa đủ mạnh. Phải có ít nhất 1 số");

        } else if (!password.matches(specialChars )){
            System.out.println("Mật khẩu chưa đủ mạnh. Phải chứ kí tự đặc biệt.");

        } else {System.out.println("Valid password");}
    }



}
