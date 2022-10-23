package students.student_zanna_klimova;

import java.util.Scanner;

public class ArithmeticAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first number: ");
        double firstnumber = scanner.nextDouble();
        System.out.println("Please enter second number: ");
        double secondNumber = scanner.nextDouble();
        System.out.println("Please enter third number: ");
        double thirdNumber = scanner.nextDouble();
        double result = ((firstnumber + secondNumber + thirdNumber) / 3);
        System.out.println("________________________________________________");
        System.out.println("The average result of three numbers is " + result);
    }
}
