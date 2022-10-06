package students.student_ilja_morozovs;

import java.util.Scanner;

public class IntegerCalc {
    int resultSum;
    int resultSubtraction;
    int resultIncrease;
    int resultDivide;


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        IntegerCalc integerCalc = new IntegerCalc();
        System.out.println("Enter first number: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter second number: ");
        int secondNumber = scanner.nextInt();
        integerCalc.resultSum = firstNumber + secondNumber;
        System.out.println("Sum result: " + integerCalc.resultSum);
        integerCalc.resultSubtraction = firstNumber - secondNumber;
        System.out.println("Subtraction result: " + integerCalc.resultSubtraction);
        integerCalc.resultIncrease = firstNumber * secondNumber;
        System.out.println("Increase result: " + integerCalc.resultIncrease);
        integerCalc.resultDivide = firstNumber / secondNumber;
        System.out.println("Divide result: " + integerCalc.resultDivide);
    }
}
