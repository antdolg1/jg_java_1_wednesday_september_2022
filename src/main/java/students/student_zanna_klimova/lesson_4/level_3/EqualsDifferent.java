package students.student_zanna_klimova.lesson_4.level_3;

import java.util.Scanner;

public class EqualsDifferent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert three whole numbers: ");
        int numberOne = scanner.nextInt();
        int numberTwo = scanner.nextInt();
        int numberThree = scanner.nextInt();

        if (numberOne == numberTwo && numberOne == numberThree) {
            System.out.println("___________________________________");
            System.out.println("All numbers are equal.");
        } else if (numberOne != numberTwo && numberOne != numberThree) {
            System.out.println("___________________________________");
            System.out.println("All numbers are different.");
        } else {
            System.out.println("___________________________________");
            System.out.println("Neither all are equal or different.");
        }
    }
}
