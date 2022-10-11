package students.student_igor_budnitski.level8;


import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter first digit: ");
        double num1 = scanner.nextDouble();
        System.out.print("Please enter second digit: ");
        double num2 = scanner.nextDouble();
        System.out.println("""
                Please select operation.
                 - 1 - addition
                 - 2 - multiplication
                 - 3 - division
                 - 4 - deduction""");
        System.out.print("Please enter 1-4 for operation selection and press enter: ");
        int operation = scanner.nextInt();
        if (operation == 1) {
            System.out.println(addition(num1, num2));
        } else if (operation == 2) {
            System.out.println(multiplication(num1, num2));
        } else if (operation == 3) {
            System.out.println(division(num1, num2));
        } else if (operation == 4) {
            System.out.println(deduction(num1, num2));
        } else {
            System.out.println("Wrong operation");
        }
    }

    public static double addition(double a, double b) {
        return a + b;
    }

    public static double multiplication(double a, double b) {
        return a * b;
    }

    public static double division(double a, double b) {
        return a / b;
    }

    public static double deduction(double a, double b) {
        return a - b;
    }
}
