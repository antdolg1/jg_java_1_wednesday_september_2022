package students.student_renat_galickij.lesson_4.level_2_intern;

import java.util.Scanner;

public class Task_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first integer");
        int firstNumber = scanner.nextInt();

        System.out.println("Enter second integer");
        int secondNumber = scanner.nextInt();

        if (firstNumber == secondNumber) {
            System.out.println("Numbers are equals");
        } else {
            System.out.println("Numbers are not equals");
        }
    }
}

