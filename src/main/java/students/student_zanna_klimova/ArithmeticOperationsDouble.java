package students.student_zanna_klimova;

import java.util.Scanner;

public class ArithmeticOperationsDouble {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        double firstNumber = scanner.nextDouble();
        double secondNumber = scanner.nextDouble();
        System.out.println("___________________________________");
        System.out.println("The sum of two numbers is: " + (firstNumber + secondNumber));
        System.out.println("The subtraction of two numbers is: " + (firstNumber - secondNumber));
        System.out.println("The multiplication of two numbers is: " + (firstNumber * secondNumber));
        System.out.println("The division of two numbers is: " + (firstNumber/secondNumber));

    }
}
