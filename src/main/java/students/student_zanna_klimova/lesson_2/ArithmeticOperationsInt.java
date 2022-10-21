package students.student_zanna_klimova.lesson_2;

import java.util.Scanner;

public class ArithmeticOperationsInt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        System.out.println("___________________________________");
        System.out.println("The sum of two numbers is: " + (firstNumber + secondNumber));
        System.out.println("The subtraction of two numbers is: " + (firstNumber - secondNumber));
        System.out.println("The multiplication of two numbers is: " + (firstNumber * secondNumber));
        System.out.println("The division of two numbers is: " + (firstNumber/secondNumber));

    }
}
