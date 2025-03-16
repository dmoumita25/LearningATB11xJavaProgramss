package ex_04_Increment_decrement;

public class Lab_024_Adv_prog {
    public static void main(String[] args) {
        int a=10;
        System.out.println(++a + ++a + ++a);
        System.out.println( "The value of A" + (a));
        System.out.println("The value of A" + (++a));
        // A--> ++a Expr A=11
        // B--> ++a Expr B= 12
        // C--> ++a Expr C= 13
        //Expr A+B+C 11+12+13=36
    }
}
