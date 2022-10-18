package students.student_vladislav_saksin;

import java.util.Scanner;

public class ScannerDemo {

    public static void main(String[] args) {

        int firstNumber;
        int secondNumber;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter first number:");
        firstNumber = scanner.nextInt();
        System.out.println("Please enter second number");
        secondNumber = scanner.nextInt();

        System.out.println("==========================");

        System.out.println("Addition = " + (firstNumber + secondNumber));
        System.out.println("Subtraction = " + (firstNumber - secondNumber));
        System.out.println("Multiplication = " + (firstNumber * secondNumber));
        System.out.println("Divison = " + (firstNumber / secondNumber));


    }


}
