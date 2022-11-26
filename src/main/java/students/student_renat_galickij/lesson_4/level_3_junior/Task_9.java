package students.student_renat_galickij.lesson_4.level_3_junior;

import java.util.Scanner;

public class Task_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first integer");
        int firstNumber = scanner.nextInt();

        System.out.println("Enter second integer");
        int secondNumber = scanner.nextInt();

        System.out.println("Enter third integer");
        int thirdNumber = scanner.nextInt();

        if ((firstNumber < secondNumber) && (firstNumber < thirdNumber) && (secondNumber < thirdNumber)) {
            System.out.println("Increasing");
        } else if ((firstNumber > secondNumber) && (firstNumber > thirdNumber) && (secondNumber > thirdNumber)) {
            System.out.println("Decreasing");
        } else {
            System.out.println("Neither increasing or decreasing order");
        }
    }
}


