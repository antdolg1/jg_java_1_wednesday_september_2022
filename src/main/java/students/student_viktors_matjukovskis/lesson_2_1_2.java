package students.student_viktors_matjukovskis;

import java.util.Scanner;

public class lesson_2_1_2 {

    public static void main(String[] args) {

        char operator;
        Double num1, num2, result;

        Scanner input = new Scanner(System.in);

        System.out.println(" +, -, *,  /");
        operator = input.next().charAt(0);

        System.out.println("Первое число");
        num1 = input.nextDouble();

        System.out.println("Второе число");
        num2 = input.nextDouble();

        switch (operator) {

            case '+':
                result = num1 + num2;
                System.out.println(num1 + " + " + num2 + " = " + result);
                break;

            case '-':
                result = num1 - num2;
                System.out.println(num1 + " - " + num2 + " = " + result);
                break;

            case '*':
                result = num1 * num2;
                System.out.println(num1 + " * " + num2 + " = " + result);
                break;

            case '/':
                result = num1 / num2;
                System.out.println(num1 + " / " + num2 + " = " + result);
                break;
        }
    }
}