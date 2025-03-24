package ex_09_String;

public class Lab048_IQ {
    public static void main(String[] args) {
//        String s1 = "Hello";
//        String s2 = "Hello";
//        String s3 = "Hello"; // 1 string created in string constant pool,string can be duplicate in SCP
//        System.out.println(s1+" "+s2+" "+s3+" ");

        String s1 = new String("Hello"); //OA
        String s2 = new String("Hello");//OA
        String s3 = new String("Hello");//OA
        System.out.println(s1+" "+s2+" "+s3); //3 new strings created in object/heap area


    }
}
