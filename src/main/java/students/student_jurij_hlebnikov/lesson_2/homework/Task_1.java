package students.student_jurij_hlebnikov.lesson_2.homework;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {

        System.out.println("Please give me two numbers");

        Scanner scanner = new Scanner(System.in);
        int numberOne = scanner.nextInt();
        int numberTwo = scanner.nextInt();

        int addition = numberOne + numberTwo;
        int subtraction = numberOne - numberTwo;
        int multiplication = numberOne * numberTwo;
        int division = numberOne / numberTwo;

        System.out.println("Their addition");
        System.out.println(addition);
        System.out.println("Their subtraction");
        System.out.println(subtraction);
        System.out.println("Their multiplication");
        System.out.println(multiplication);
        System.out.println("Their division");
        System.out.println(division);
        System.out.println("Thank you for Attention");
    }
}
