package students.student_jurij_hlebnikov.lesson2;

import java.util.Scanner;

public class Task2CalculatorDoubl {

    public static void main(String[] args) {

        System.out.println("Please give me two numbers");

        Scanner scanner = new Scanner(System.in);
        double numberOne = scanner.nextDouble();
        double numberTwo = scanner.nextDouble();

        double addition = numberOne + numberTwo;
        double subtraction = numberOne - numberTwo;
        double multiplication = numberOne * numberTwo;
        double division = numberOne / numberTwo;

        System.out.println("Their addition");
        System.out.println(addition);
        System.out.println("Their subtraction");
        System.out.println(subtraction);
        System.out.println("Their multiplication");
        System.out.println(multiplication);
        System.out.println("Their division");
        System.out.println(division);
        System.out.println("Thank you for Attention");
    }
}