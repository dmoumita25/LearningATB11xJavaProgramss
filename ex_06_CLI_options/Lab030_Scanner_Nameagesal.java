package ex_06_CLI_options;

import java.util.Scanner;

public class Lab030_Scanner_Nameagesal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Prompt the user for their name
        System.out.println("Enter the name");
        String name= scanner.nextLine();

        System.out.println("Enter the age");
        int age = scanner.nextInt();

        System.out.println("Enter the salary");
        double salary = scanner.nextDouble();

        System.out.println("\n---user information---");
        System.out.println(name);
        System.out.println(age);
        System.out.println(salary);
    }
}
