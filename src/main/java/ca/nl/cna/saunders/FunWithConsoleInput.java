package ca.nl.cna.saunders;

import java.util.Scanner;

public class FunWithConsoleInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a number: ");
        int x = input.nextInt();

        System.out.println("Please enter another number: ");
        int y = input.nextInt();

        int sum = x + y;

        System.out.printf("\nValue input: %d", sum);

        ;




    }
}
