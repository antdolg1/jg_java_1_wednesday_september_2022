package students.student_danila_kolesnicenko;

import java.util.Scanner;

public class AutoCalcNew {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        double firstNumber;
        double secondNumber;

        System.out.println("Please enter your first number:");
        firstNumber = scanner.nextDouble();
        System.out.println("Please enter your second number:");
        secondNumber = scanner.nextDouble();

        System.out.println(firstNumber + secondNumber);
        System.out.println(firstNumber - secondNumber);
        System.out.println(firstNumber * secondNumber);
        System.out.println(firstNumber / secondNumber);
    }
}