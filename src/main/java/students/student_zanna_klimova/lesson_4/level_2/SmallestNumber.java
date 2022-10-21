package students.student_zanna_klimova.lesson_4.level_2;

import java.util.Scanner;

public class SmallestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert two whole numbers: ");
        int numberOne = scanner.nextInt();
        int numberTwo = scanner.nextInt();

        if (numberOne < numberTwo) {
            System.out.println("_________________________________");
            System.out.println("Smallest number is: " + numberOne);
        } else {
            System.out.println("_________________________________");
            System.out.println("Smallest number is: " + numberTwo);
        }
    }
}
