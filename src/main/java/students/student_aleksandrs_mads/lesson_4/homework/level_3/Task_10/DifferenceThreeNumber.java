package students.student_aleksandrs_mads.lesson_4.homework.level_3.Task_10;

import java.util.Scanner;

class DifferenceThreeNumber {
    public static void main(String[] args) {
        int firstNumber;
        int secondNumber;
        int thirdNumber;
        System.out.println("Enter first number");
        Scanner scanner = new Scanner(System.in);
        firstNumber = scanner.nextInt();
        System.out.println("Enter second number");
        secondNumber = scanner.nextInt();
        System.out.println("Enter third number");
        thirdNumber = scanner.nextInt();
        if (firstNumber < secondNumber && secondNumber < thirdNumber) {
            System.out.println(thirdNumber);
        } else if (firstNumber > secondNumber && secondNumber > thirdNumber && firstNumber != thirdNumber) {
            System.out.println(firstNumber);
        } else {
            System.out.println(secondNumber);
        }
    }
}
