package ex_04_Increment_decrement;

public class Lab_025_Inc_dec_op_Task_14thMarch {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(++a + a++ + a++);
        System.out.println(a);  //The value of a =13
        // A-->++a
        // B-->a++
        // C-->a++
        //Expr A = 11
        //Expr B = 11 , The value of B=12
        //Expr C = 12 ,The Value of C=13
        //Expr A+B+C 11+11+12 = 34
    }
}
