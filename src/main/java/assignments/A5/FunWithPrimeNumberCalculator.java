package assignments.A5;

import java.util.Scanner;

public class FunWithPrimeNumberCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /**
         * creates the UI for the application. it gives four options and then uses if-else to
         * run the piece of code that coresponds to the user's selection.
         */
        while (true) {
            System.out.println("Fun With Prime Number Calculator!");
            System.out.println("1. Display all prime numbers up to a limit (user decides limit).");
            System.out.println("2. Display all prime numbers between two numbers (user decides the two numbers).");
            System.out.println("3. Display the prime factorization of a number (user decides number in question).");
            System.out.println("4. Display the prime factorization of all numbers up to a limit (user decides limit).");
            System.out.println("5. Exit");
            System.out.println("Please choose from option #1-#5: ");

            int choice = scanner.nextInt();

            /**
             * if the user chooses the first option, this code will run.
             * displays all the prime numbers up to a number
             * chosen by the user.
             */
            if (choice == 1) {
                System.out.print("Please Enter the maximum limit: ");
                int maxLimit = scanner.nextInt();
                System.out.println("The prime numbers up to " + maxLimit + "are:");
                for (int num = 2; num <= maxLimit; num++) {
                    if (PrimeNumberCalculator.isPrime(num)) {
                        System.out.print(num + " ");
                    }
                }
                System.out.println();

                /**
                 * this code runs if the user selects option number 2.
                 * displays all the prime numbers between two numbers that are provided by the user.
                 */
            } else if (choice == 2) {
                System.out.print("Enter the lower limit: ");
                int lower = scanner.nextInt();
                System.out.print("Enter the upper limit: ");
                int upper = scanner.nextInt();
                System.out.println("Prime numbers between " + lower + " and " + upper + ":");
                for (int num = lower; num <= upper; num++) {
                    if (PrimeNumberCalculator.isPrime(num)) {
                        System.out.print(num + " ");
                    }
                }
                System.out.println();

                /**
                 * this code will run if the option number 3 is selected.
                 * displays prime factorization of a number that the user provides.
                 */
            } else if (choice == 3) {
                System.out.print("Enter the number: ");
                int number = scanner.nextInt();
                System.out.println("Prime factorization of " + number + ": " +
                        PrimeNumberCalculator.getUniquePrimeFactorization(number));

                /**
                 * this code runs if the user selectes the option number 4.
                 * displays all prime factorizations of numbers within a range provided by the user.
                 */
            } else if (choice == 4) {
                System.out.print("Enter the upper limit: ");
                int limit = scanner.nextInt();
                System.out.println("Prime factorizations of all numbers up to " + limit + ":");
                for (int i = 2; i <= limit; i++) {
                    System.out.println(i + ": " + PrimeNumberCalculator.getUniquePrimeFactorization(i));
                }
                /**
                 * this code runs if the user selects option number five.
                 * it prints a message and ends the running of the application.
                 */
            } else if (choice == 5) {
                System.out.println("Goodbye");
                break;
                /**
                 * if the user enters an invalid input, this statement will catch it.
                 */
            } else {
                System.out.println("Invalid option. Please restart and choose an option from #1-#5.");
            }
        }
    }
}
