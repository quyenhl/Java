public class Excercise1 {
    public void excercise1 (){
        String str1 = "You Only Live Once. But if You do it right. once is Enough";

        int count = 0;
        for (int i =0; i<str1.length();i++){
            if (Character.isUpperCase(str1.charAt(i)))
                count++;
        }
        //Tổng kí tự viết hoa
        System.out.println("Số ký tự viết hoa là " + count);
        // Viết hoa tất cả các kí tự đầu tiên
        //String s1 = str1.substring(0, 1).toUpperCase();
        //String nameCapitalized = s1 + str1.substring(1);
        //String nameCapitalized = str1.substring(0, 1).toUpperCase()+str1.substring(1);
       // System.out.println("Chuỗi sau khi viết hoa các kí tự đầu tiên:  " + nameCapitalized);
        StringBuilder result1 = new StringBuilder(str1.length());
        boolean capitalize1 = false;
        boolean capitalize2 = false;

        for(int i = 0; i < str1.length(); i++) {
            char c = str1.charAt(i);
            if(c == '.') {
                capitalize1 = true;
            }
            else if(capitalize1 && Character.isAlphabetic(c)) {
                c = Character.toUpperCase(c);
                capitalize1 = false;
            }

            if(c == ' ') {
                capitalize2 = true;
            }
            else if(capitalize2 && Character.isAlphabetic(c)) {
                c = Character.toUpperCase(c);
                capitalize2 = false;
            }

            result1.append(c);
        }
        System.out.println("Chuỗi sau khi viết hoa kí tự đầu tiên là:  " + result1);

        //Viết hoa kí tự đầu sau dấu chấm
        StringBuilder result = new StringBuilder(str1.length());
        boolean capitalize = true;

        for(int i = 0; i < str1.length(); i++) {
            char c = str1.charAt(i);
            if(c == '.') {
                capitalize = true;
            }
            else if(capitalize && Character.isAlphabetic(c)) {
                c = Character.toUpperCase(c);
                capitalize = false;
            }

            result.append(c);
        }
        System.out.println("Chuỗi sau khi viết hoa sau dấu chấm là: " + result);

    }
}
