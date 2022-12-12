package students.student_zanna_klimova.lesson_5.level_4;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, insert the length of array: ");
        int lengthOfArray = scanner.nextInt();
        int[] array = new int[lengthOfArray];
        System.out.println("Insert numbers for array: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        for(int i = 0; i < lengthOfArray; i++) {
            System.out.println("Inserted numbers are: " + array[i]);
        }
    }
}
