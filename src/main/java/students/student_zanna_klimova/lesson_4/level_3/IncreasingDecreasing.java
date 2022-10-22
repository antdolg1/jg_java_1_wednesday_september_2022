package students.student_zanna_klimova.lesson_4.level_3;

import java.util.Scanner;

public class IncreasingDecreasing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert three whole numbers:");
        int numberOne = scanner.nextInt();
        int numberTwo = scanner.nextInt();
        int numberThree = scanner.nextInt();

        if (numberOne < numberTwo && numberTwo < numberThree) {
            System.out.println("__________________________");
            System.out.println("Numbers are in increasing order.");
        } else if (numberOne > numberTwo && numberTwo > numberThree) {
            System.out.println("__________________________");
            System.out.println("Numbers are in decreasing order.");
        } else {
            System.out.println("_______________________________");
            System.out.println("Numbers are neither increasing or decreasing order.");
        }
    }
}
