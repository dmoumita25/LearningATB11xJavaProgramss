package ex_11_Arrays;

import java.util.Arrays;

public class Lab066_Second_Largest_no {
    public static void main(String[] args) {
        int[]numbers={22,13,35,67};
        Arrays.sort(numbers);
        System.out.println("Second largest number: "+numbers[numbers.length-2]);

    }
}
