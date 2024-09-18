package ca.nl.cna.saunders;

import java.util.Scanner;

public class FunWithArithmaticOpperations {

    public static void main(String[] args) {

        System.out.println("fun with arithmatic opperations!");

        Scanner input = new Scanner(System.in);

        System.out.println("enter a number: ");
        int x = input.nextInt();

        System.out.println("Please enter another number: ");
        int y = input.nextInt();

        int sum = x + y;

        System.out.printf("\nValue input: %d", sum);



    }
}
