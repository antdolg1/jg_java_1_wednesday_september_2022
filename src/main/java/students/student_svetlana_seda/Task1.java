package students.student_svetlana_seda;

import java.util.Random;
import java.util.Scanner;

public class Task {

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
