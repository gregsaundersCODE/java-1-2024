package OldAssignments;

/**
 * imports the scanner
 */

import java.util.Scanner;

/**
 * the main function
 */
public class FunWithEmployees {
    public static void main(String[] args) {

        /**
         * creates a new scanner called "scanner"
         */
        Scanner scanner = new Scanner(System.in);

        /**
         * sets bvalues for employee counter, number of employees, and the total salary
         */
        double Salary = 0;
        int employeeCounter = 0;
        int NUM_OF_EMPLOYEES = 3;
        double salaryTotal = 0;

        /**
         * while loop that takes input for a first name,
         * last name, and salary while there no more than 3 employees
         */
        while (employeeCounter < NUM_OF_EMPLOYEES) {
            System.out.print("Enter first name: ");
            String firstName = scanner.nextLine();

            System.out.print("Enter last name: ");
            String lastName = scanner.nextLine();

            System.out.print("Enter salary: ");
            double salary = scanner.nextDouble();
            scanner.nextLine();

            /**
             * instantiates an employee that has a first name, last name and a salary.
             * uses the give raise function to give the employee an 8% raise
             */
            Employees employee = new Employees(firstName, lastName, salary);
            employee.giveRaise(8);

            /**
             * outputs first name, last name, and salary
             */
            System.out.printf("Name: %s %s, Salary: $%.2f\n",
                    employee.getFirstName(),
                    employee.getLastName(),
                    employee.getSalary());

            salaryTotal += employee.getSalary();

            /**
             * adds 1 to the employee counter
             */
            employeeCounter++;
        }

        /**
         * outputs the average salary
         */
        System.out.printf("/nThe average salary is $%.2f",
                employeeCounter, salaryTotal / NUM_OF_EMPLOYEES);
    }
}