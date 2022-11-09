package students.student_renat_galickij.lesson_4.level_1_intern;

import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter integer");
        int number = scanner.nextInt();

        if (number > 0) {
            System.out.println("Number is positive ");
        } else if (number < 0) {
            System.out.println("Number is negative");
        } else if (number == 0) {
            System.out.println("Number equals 0");
        }
    }
}

