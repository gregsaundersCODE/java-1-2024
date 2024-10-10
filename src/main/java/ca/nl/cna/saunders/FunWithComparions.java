package ca.nl.cna.saunders;

import java.util.Scanner;

public class FunWithComparions {

    public static void main(String[] args) {
        System.out.println("Fun with comparisons");

        System.out.println("fun with arithmatic opperations!");

        Scanner input = new Scanner(System.in);

        System.out.println("enter a number: ");
        int x = input.nextInt();

        System.out.println("Please enter another number: ");
        int y = input.nextInt();

        if(x== y) {
            System.out.printf("%d == %d", x, y);
        }

        if(x != y){
            System.out.printf("");


        }
    }
}
