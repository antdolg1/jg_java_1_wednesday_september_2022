package students.student_sergejs_kozinecs.lesson_2.level_1;

import java.util.Scanner;

public class CalculateInt {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x, y;

        System.out.println("Enter first integer number and press Enter:");
        x = scanner.nextInt();
        System.out.println("Enter second integer number and press Enter:");
        y = scanner.nextInt();

        Calculator calculate = new Calculator(x, y);

        System.out.println("Sum result: " + calculate.sum() +
                "\nMultiplication result: " + calculate.multiply() +
                "\nSubtraction result: " + calculate.subtract() +
                "\nDivision result: " + calculate.divide());

        scanner.close();
    }
}