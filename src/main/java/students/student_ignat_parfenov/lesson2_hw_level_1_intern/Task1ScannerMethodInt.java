package students.student_ignat_parfenov.lesson2_hw_level_1_intern;

import java.util.Scanner;

public class Task1ScannerMethodInt {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Imput the first number : ");
        int firstNumber = scanner.nextInt();

        System.out.println("Imput the second number");
        int secondNumber = scanner.nextInt();

        System.out.println("Addition result is : " + (firstNumber + secondNumber));
        System.out.println("Subtraction result is : " + (firstNumber - secondNumber));
        System.out.println("Multiplication result is : " + firstNumber * secondNumber);

    }

}
