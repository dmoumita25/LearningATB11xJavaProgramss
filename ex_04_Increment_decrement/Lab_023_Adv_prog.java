package ex_04_Increment_decrement;

public class Lab_023_Adv_prog {
    public static void main(String[] args) {
        int a = 10;
        int b =20;
        int c = 10;
        System.out.println(a++ + b++ + c++);
        System.out.println(a);  //11
        System.out.println(b); //21
        System.out.println(c); //11
        // A--> a++ Expr A= 10
        // B--> b++ Expr B= 20
        // C--> c++ Expr C=10
        //Expr A+B+C 10+20+10


    }
}
