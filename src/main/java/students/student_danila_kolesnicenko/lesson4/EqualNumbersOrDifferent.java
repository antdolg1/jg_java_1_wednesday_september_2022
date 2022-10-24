package students.student_danila_kolesnicenko.lesson4;

import java.util.Scanner;

class EqualNumbersOrDifferent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber;
        int secondNumber;
        int thirdNumber;
        System.out.println("Please enter your first number :");
        firstNumber = scanner.nextInt();
        System.out.println("Please enter your second number :");
        secondNumber = scanner.nextInt();
        System.out.println("Please enter your third number");
        thirdNumber = scanner.nextInt();
        if (firstNumber == secondNumber && secondNumber == thirdNumber) {
            System.out.println("All numbers are equal");
        } else if (firstNumber != secondNumber) {
            System.out.println("All numbers are different ");
        } else  {
            System.out.println("Neither all are equal or different");
        }

    }
}