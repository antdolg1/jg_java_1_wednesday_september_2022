package students.student_aleksandrs_mads.lesson_4.homework.level_2.Task_7;

import java.util.Scanner;

public class LargestNumbers {
    public static void main(String[] args) {
        int firstNumber;
        int secondNumber;
        System.out.println("Enter first number: ");
        Scanner scanner = new Scanner(System.in);
        firstNumber = scanner.nextInt();
        System.out.println("Enter second number: ");
        Scanner scanner1 = new Scanner(System.in);
        secondNumber = scanner1.nextInt();
        if (firstNumber == secondNumber) {
            System.out.println("Numbers are equal");
        } else   {
            System.out.println("Numbers are different");
        }
    }
}




