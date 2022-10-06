package students.student_ilja_morozovs;

import java.util.Scanner;

public class DoubleCalculator {
    double resultSum;
    double resultSubtraction;
    double resultIncrease;
    double resultDivide;


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DoubleCalculator doubleCalculator = new DoubleCalculator();
        System.out.println("Enter first number: ");
        double firstNumber = scanner.nextDouble();
        System.out.println("Enter second number: ");
        double secondNumber = scanner.nextDouble();
        doubleCalculator.resultSum = firstNumber + secondNumber;
        System.out.println("Sum result: " + doubleCalculator.resultSum);
        doubleCalculator.resultSubtraction = firstNumber - secondNumber;
        System.out.println("Subtraction result: " + doubleCalculator.resultSubtraction);
        doubleCalculator.resultIncrease = firstNumber * secondNumber;
        System.out.println("Increase result: " + doubleCalculator.resultIncrease);
        doubleCalculator.resultDivide = firstNumber / secondNumber;
        System.out.println("Divide result: " + doubleCalculator.resultDivide);
    }
}
