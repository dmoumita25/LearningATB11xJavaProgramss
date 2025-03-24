package ex_09_String;

public class Lab052_Substring {
    public static void main(String[] args) {
        String anotherpalindrome = "Niagra.0 roar again!";
        String roar = anotherpalindrome.substring(9,15); //9-14(-1 index)
        System.out.println(roar);
    }
}
