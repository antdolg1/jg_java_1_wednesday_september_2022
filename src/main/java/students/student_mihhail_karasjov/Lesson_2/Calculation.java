package students.student_mihhail_karasjov.Lesson_2;

import java.util.Scanner;

public class Calculation {

    public static void main(String[] args) {
        double number1;
        double number2;
        double answer;
        char option;
        Scanner reader = new Scanner(System.in);

        System.out.println("Enter two numbers: ");
        number1 = reader.nextDouble();
        number2 = reader.nextDouble();

        System.out.print("Enter an operation (+, -, *, /): ");
        option = reader.next().charAt(0);
        switch (option) {
            case '+':
                answer = number1 + number2;
                break;
            case '-':
                answer = number1 - number2;
                break;
            case '*':
                answer = number1 * number2;
                break;
            case '/':
                answer = number1 / number2;
                break;
            default:
                System.out.print("Error! Enter correct operation");
                return;
        }
        System.out.print("The result is given as follows: ");
        System.out.printf(number1 + " " + option + number2 + " = " + answer);
    }

}
