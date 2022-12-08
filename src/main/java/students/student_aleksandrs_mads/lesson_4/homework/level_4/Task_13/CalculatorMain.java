package students.student_aleksandrs_mads.lesson_4.homework.level_4.Task_13;

import java.util.Scanner;

class CalculatorMain {
    public static void main(String[] args) {
        int firstNumber;
        int secondNumber;
        Calculator calculator = new Calculator();
        System.out.println("Enter first number");
        Scanner scanner = new Scanner(System.in);
        firstNumber = scanner.nextInt();
        System.out.println("Enter second number");
        secondNumber = scanner.nextInt();
        System.out.println("Entered first number " + firstNumber);
        System.out.println("Entered second number " + secondNumber);
        System.out.println(calculator.sum(firstNumber, secondNumber));
        System.out.println(calculator.subtraction(firstNumber, secondNumber));
        System.out.println(calculator.multiplication(firstNumber, secondNumber));
        System.out.println(calculator.division(firstNumber, secondNumber));
        System.out.println("Result if true-even, if false-odd: " + calculator.isEven(firstNumber));
    }
}
