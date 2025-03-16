package ex_04_Increment_decrement;

public class Lab_027_Increment_decrement_task {
    public static void main(String[] args) {
        int a = 20;
        System.out.println(--a + a++ + a--);
        // A >> --a
        // B >> a++
        // C >> a--
        //Expr A=19
        //Expr B=19 but the value of B is 20
        //Expr C=20 but the value of c is 19
        //Expr A+B+C 19+19+20 = 58
    }
}
