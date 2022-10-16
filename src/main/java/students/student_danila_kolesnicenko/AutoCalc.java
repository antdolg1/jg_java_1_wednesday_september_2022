package students.student_danila_kolesnicenko;

import java.util.Scanner;

public class AutoCalc {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        int firstNumber;
        int secondNumber;

        System.out.println("Please enter your first number:");
        firstNumber = scanner.nextInt();
        System.out.println("Please enter your second number:");
        secondNumber = scanner.nextInt();

        System.out.println(firstNumber + secondNumber);
        System.out.println(firstNumber - secondNumber);
        System.out.println(firstNumber * secondNumber);
        System.out.println(firstNumber / secondNumber);
    }
}