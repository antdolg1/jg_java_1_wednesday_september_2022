package students.student_sergejs_kozinecs.lesson_2.level_1;

import java.util.Scanner;

public class CalculateDouble {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x, y;

        System.out.println("Enter first float number and press Enter:");
        x = scanner.nextDouble();
        System.out.println("Enter second float number and press Enter:");
        y = scanner.nextDouble();

        Calculator calculate = new Calculator(x, y);

        System.out.println("Sum result: " + calculate.sumDouble() +
                "\nMultiplication result: " + calculate.multiplyDouble() +
                "\nSubtraction result: " + calculate.subtractDouble() +
                "\nDivision result: " + calculate.divideDouble());

        scanner.close();
    }
}
