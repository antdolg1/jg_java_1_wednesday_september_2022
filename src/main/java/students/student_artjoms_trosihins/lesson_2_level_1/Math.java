package students.student_artjoms_trosihins.lesson_2_level_1;

import java.util.Scanner;

public class Math {
    public static void main(String[] args) {
        int firstNumber;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please write first number :");
        firstNumber = scanner.nextInt();
        System.out.println(firstNumber);

        int secondNumber;
        System.out.println("Please write second number :");
        secondNumber = scanner.nextInt();
        System.out.println(secondNumber);

        int sum = firstNumber + secondNumber;
        System.out.println("Sum is " + sum);

        int sub = firstNumber - secondNumber;
        System.out.println("Subtraction is " + sub);

        int multi = firstNumber * secondNumber;
        System.out.println("Multiplication is " + multi);

        int div = firstNumber / secondNumber;
        System.out.println("Division is " + div);
    }
}
