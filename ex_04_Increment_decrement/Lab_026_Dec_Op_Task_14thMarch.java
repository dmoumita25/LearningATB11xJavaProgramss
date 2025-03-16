package ex_04_Increment_decrement;

public class Lab_026_Dec_Op_Task_14thMarch {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(--a + a--);
        System.out.println("The value of a is" + " " + (a)); //the value of a=8
        // A >> --a , ExprA=9
        // B >> a-- , ExprB = 9, the value of a=8
        // Expr A+B 9+9 = 18
    }
}
