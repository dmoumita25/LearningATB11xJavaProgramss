package ex_04_Increment_decrement;

public class Lab_021_Adv_prog {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(a++ + ++a);
        System.out.println(a); // A value has been increased by 12


        // A = a++
        //B = ++a
        //A--> Expr A ---> 10  a=11
        //B--> Expr B ---> 12
        //Expr A+ Expr B= 10+12 a=12 now
    }
}
