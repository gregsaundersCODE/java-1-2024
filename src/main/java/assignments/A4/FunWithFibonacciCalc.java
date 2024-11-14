package assignments.A4;

/**
 * import statment for scanner.
 */
import java.util.Scanner;

/**
 * the main method of the application. creates a scanner called Scanner and a fibonacci calc
 * called calculator.
 */
public class FunWithFibonacciCalc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FibonacciCalc calculator = new FibonacciCalc();

        /**
         * creates the UI for the application. it gives four options and then uses if-else to
         * run the piece of code that coresponds to the user's selection.
         */
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

            /**
             * if the user chooses the first option, this code will run.
             * displays all the fibonacci numbers lower than a value that is provided by the user.
             */
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

                /**
                 * this code runs if the user chooses option number 2.
                 * takes a number as user input and displays that number of the first fibonacci numbers.
                 */
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

                /**
                 * this code runs if the user selects option number 3.
                 * user inputs a number that they would like to check whether or not is a fibonacci number.
                 * displays whether or not the number is a fibonacci number.
                 */
            } else if (choice == 3) {
                System.out.print("Enter the number you would like to check: ");
                int number = scanner.nextInt();
                if (calculator.isFibonacciNumber(number)) {
                    System.out.println(number + " is a Fibonacci number.");
                } else {
                    System.out.println(number + " is not a Fibonacci number.");
                }

                /**
                 * this code runs if the user selects option number 4.
                 * displays a goodbye message and haults the running of the application.
                 */
            } else if (choice == 4) {
                System.out.println("Goodbye");
                break;

            } else {
                System.out.println("Invalid input. please enter one of the options above");
            }
        }
    }
}