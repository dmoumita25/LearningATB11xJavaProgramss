package ex_11_Arrays;

import java.util.Scanner;

public class Lab065_user_input {
    public static void main(String[] args) {
        Scanner  sc= new Scanner(System.in);
        System.out.println("Enter the size of the array(int)");
        int size= sc.nextInt();

        int[]number_marks = new int[size];
        for(int i=0;i<number_marks.length;i++){
            System.out.println("Enter the number");
            number_marks[i] = sc.nextInt();


            for(i=0;i< number_marks.length;i++);{
                System.out.println(number_marks[i]);
            }
            sc.close();
        }


    }
}
