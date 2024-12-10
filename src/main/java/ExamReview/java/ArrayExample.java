package ExamReview.java;

import java.sql.SQLOutput;
import java.util.Random;
public class ArrayExample {

    public static void main(String[] args) {
        System.out.println("ArrayExample");

        int[] array = new int[10];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
        printArray(array);
    }

    public static void printArray(int[] array) {
        System.out.printf("[%s]:\t %s", "Index", "value\n");
        for (int i = 0; i < array.length; i++) {
            System.out.printf("[%d]:\t\t %d\n", i, array[i]);
        }
    }
}