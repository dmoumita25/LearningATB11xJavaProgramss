package ex_11_Arrays;

public class Lab060_arrays {
    public static void main(String[] args) {
        int[]marks = {89,90,34,67,78,79};
        System.out.println(marks.length);
        System.out.println(marks[0]);
        System.out.println(marks[5]);
        //System.out.println(marks[10]);//ArrayIndexOutOfBoundsException
        System.out.println(marks[-1]);//ArrayIndexOutOfBoundsException

    }
}
