package ex_09_String;

public class Lab050_String_Functions {
    public static void main(String[] args) {
        String str1 ="Hello";
        String str2 = "Hello";
        String str3 = new String("Hello");
        System.out.println(str1 == str2); //true
        System.out.println(str1 == str3);//false
        System.out.println(str1.equals(str3));//true

    }
}
