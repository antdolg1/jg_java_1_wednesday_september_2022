package students.student_ilja_morozovs.lesson_2.homework.level_1.Task_2;

import java.util.Scanner;

class DoubleCalculator {

    public static void main(String[] args) {
        double resultSum;
        double resultSubtraction;
        double resultIncrease;
        double resultDivide;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        double firstNumber = scanner.nextDouble();
        System.out.println("Enter second number: ");
        double secondNumber = scanner.nextDouble();
        resultSum = firstNumber + secondNumber;
        System.out.println("Sum result: " + resultSum);
        resultSubtraction = firstNumber - secondNumber;
        System.out.println("Subtraction result: " + resultSubtraction);
        resultIncrease = firstNumber * secondNumber;
        System.out.println("Increase result: " + resultIncrease);
        resultDivide = firstNumber / secondNumber;
        System.out.println("Divide result: " + resultDivide);
    }
}
