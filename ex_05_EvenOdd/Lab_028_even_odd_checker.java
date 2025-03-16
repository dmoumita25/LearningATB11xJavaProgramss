package ex_05_EvenOdd;

import java.util.Scanner;

public class Lab_028_even_odd_checker {
    public static void main(String[] args) {
        //Create a scanner object for user input
        Scanner scanner = new Scanner(System.in);

        //User should enter a number
        System.out.println("Please enter the number : ");
        int num = scanner.nextInt();

        //Check if the user input is even or odd
        if (num % 2 == 0) {
            System.out.println("The number is even");
        } else {
            System.out.println("The number is odd");
        }

        //Close the scanner
        scanner.close();
    }
}
