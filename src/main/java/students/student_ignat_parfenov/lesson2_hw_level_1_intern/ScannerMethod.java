package students.student_ignat_parfenov.lesson2_hw_level_1_intern;

import java.util.Scanner;

public class ScannerMethod {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input first number : ");
        int firstNumber = scanner.nextInt();
        System.out.println("Input second number : ");
        int secondNumber = scanner.nextInt();

        System.out.println("Addition result is : " + (firstNumber + secondNumber));
        System.out.println("Subtraction result is : " + (firstNumber - secondNumber));
        System.out.println("Multiplication result is : " + firstNumber * secondNumber);

    }
}
