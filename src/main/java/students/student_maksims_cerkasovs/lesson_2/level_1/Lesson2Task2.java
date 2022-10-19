package students.student_maksims_cerkasovs.lesson_2.level_1;

import java.util.Scanner;

public class Lesson2Task2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the first number: ");
        double firstDoubleNumber1 = scanner.nextDouble();
        System.out.println("Input the second number: ");
        double firstDoubleNumber2 = scanner.nextDouble();

        double addiction = firstDoubleNumber1 + firstDoubleNumber2;
        System.out.println("Addiction = " + addiction);

        double subtraction = firstDoubleNumber1 - firstDoubleNumber2;
        System.out.println("Subtraction = " + subtraction);

        double multiplication = firstDoubleNumber1 * firstDoubleNumber2;
        System.out.println("Multiplication = " + multiplication);

        double division = firstDoubleNumber1 / firstDoubleNumber2;
        System.out.println("Division = " + division);

    }
}
