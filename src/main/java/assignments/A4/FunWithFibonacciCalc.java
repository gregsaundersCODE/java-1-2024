package assignments.A4;

import java.util.Scanner;

public class FunWithFibonacciCalc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FibonacciCalc calculator = new FibonacciCalc();

        while (true) {
            System.out.println("\nFibonacci Calculator Options:");
            System.out.println("1. Display the fibonacci numbers that have a smaller value than __ (user can decide the number)");
            System.out.println("2. Display the first __ amount of Fibonacci numbers (user can decide the amount)");
            System.out.println("3. Check if a number is a Fibonacci number");
            System.out.println("4. Exit");
            System.out.print("What number would you like to select: ");

            int choice = scanner.nextInt();

            int num1;
            int num2;
            if (choice == 1) {
                System.out.print("Enter the maximum value: ");
                int maxNumber = scanner.nextInt();
                System.out.println("Fibonacci numbers less than " + maxNumber + ":");

                num1 = 0;
                num2 = 1;
                while (num1 < maxNumber) {
                    System.out.print(num1 + " ");
                    int next = num1 + num2;
                    num1 = num2;
                    num2 = next;
                }
                System.out.println();


            } else if (choice == 2) {
                System.out.print("Enter the number of Fibonacci numbers you would like to print: ");
                int n = scanner.nextInt();
                System.out.println("First " + n + " Fibonacci numbers:");

                num1 = 0;
                num2 = 1;
                for (int i = 1; i <= n; i++) {
                    System.out.print(num1 + " ");
                    int next = num1 + num2;
                    num1 = num2;
                    num2 = next;
                }
                System.out.println();

            } else if (choice == 3) {
                System.out.print("Enter the number you would like to check: ");
                int number = scanner.nextInt();
                if (calculator.isFibonacciNumber(number)) {
                    System.out.println(number + " is a Fibonacci number.");
                } else {
                    System.out.println(number + " is not a Fibonacci number.");
                }

            } else if (choice == 4) {
                System.out.println("Goodbye");
                break;

            } else {
                System.out.println("Invalid input. please enter one of the options above");
            }
        }
    }
}