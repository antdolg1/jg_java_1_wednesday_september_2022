package students.student_stivens_veveris;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

        double userNumber1;
        double userNumber2;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter first number: ");
        userNumber1 = scanner.nextDouble();
        System.out.println("______________");
        System.out.println("User entered number: " + userNumber1);

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Please, enter second number: ");
        userNumber2 = scanner.nextDouble();
        System.out.println("______________");
        System.out.println("User entered number: " + userNumber2);

        double substraction = userNumber1 - userNumber2;
        double summary = userNumber1 + userNumber2;
        double division = userNumber1 / userNumber2;
        double multiplication = userNumber1 * userNumber2;

        System.out.println("______________");
        System.out.println("Numbers summary: " + summary);
        System.out.println("Numbers subtraction: " + substraction);
        System.out.println("Numbers division: " + division);
        System.out.println("Numbers multiplication: " + multiplication);

    }
}