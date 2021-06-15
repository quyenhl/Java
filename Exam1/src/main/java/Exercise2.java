import java.util.Scanner;

public class Exercise2 {
    public  void enterPwd(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter Password: ");
        String pwd = sc.nextLine();

//       isValidPassword(pwd);
        System.out.println(isValidPassword(pwd));


    }
    public static String isValidPassword(String password)
    {
        String result = "Valid Password";

        if (password.length() < 10)
        {
            System.out.println("Mật khẩu yếu. Phải lớn hơn 10 ký  tự");

        }
        String upperCaseChars = "(.*[A-Z].*)";
        if (!password.matches(upperCaseChars ))
        {
            System.out.println("Mật khẩu chưa đủ mạnh. Phải có ít nhất 1 chữ hoa");

        }

        String numbers = "(.*[0-9].*)";
        if (!password.matches(numbers ))
        {
            System.out.println("Mật khẩu chưa đủ mạnh. Phải có ít nhất 1 số");

        }
        String specialChars = "(.*[@,#,$,%,_,-].*$)";
        if (!password.matches(specialChars ))
        {
            System.out.println("Mật khẩu chưa đủ mạnh. Phải chứ kí tự đặc biệt.");

        }
        return (result);
    }


}
