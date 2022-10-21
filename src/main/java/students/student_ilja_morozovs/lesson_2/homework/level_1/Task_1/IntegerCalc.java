package students.student_ilja_morozovs.lessons_2.homework.level_1.Task_1;

import java.util.Scanner;

class IntegerCalc {

    public static void main(String[] args) {
        int resultSum;
        int resultSubtraction;
        int resultIncrease;
        int resultDivide;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter second number: ");
        int secondNumber = scanner.nextInt();
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
