package ex_11_Arrays;

import java.util.Arrays;

public class Lab063_Arrays_Print {
    public static void main(String[] args) {
        int[]marks={22,34,56,66,88,99,100,34};
        System.out.println(marks.length);
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);
        System.out.println(marks[5]);
        System.out.println(marks[6]);
        System.out.println(marks[7]);

        System.out.println("-----");

        Arrays.sort(marks);

        for (int i=0;i< marks.length;i++){
            System.out.println(marks[i]);
        }


    }
}
