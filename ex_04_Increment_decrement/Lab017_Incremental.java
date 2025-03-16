package ex_04_Increment_decrement;

public class Lab017_Incremental {
    public static void main(String[] args) {
        int a =10;
        //Prefix increment---increase the value first then store the result
        System.out.println(++a);
        System.out.println(a);

        //Post Increment----Print first then increase the value
        int a_1 = 20;
        System.out.println(a_1++);
        System.out.println(a_1);
    }

}
