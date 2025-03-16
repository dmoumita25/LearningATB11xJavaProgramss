package ex_04_Increment_decrement;

public class Lab_019_Inc_prog1_reverse {
    public static void main(String[] args) {
        int a = 10;
        int result = a++;
        System.out.println(a);
        System.out.println(result);

        // Line No | a |Expression(result)
        // 5       | 10 | NA
        // 6       | 11 | 10
        // 7       | 11 | NA
        // 8       | NA | 10

    }
}
