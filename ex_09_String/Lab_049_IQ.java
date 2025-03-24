package ex_09_String;

public class Lab_049_IQ {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello"; // 1 string stored in SCP

        String s3 = new String("Hello"); //OA
        String s4 = new String("Hello");//OA
        String s5 = new String("hello");//OA 3 strings

        //comparison with == to locate memory ref
        System.out.println(s1 == s4);
        System.out.println(s3 == s4);
        System.out.println(s1 == s2);

        //equals content value
        System.out.println(s1.equals(s3));
        System.out.println(s2.equals(s5));
        System.out.println(s4.equalsIgnoreCase(s5));
    }
}
