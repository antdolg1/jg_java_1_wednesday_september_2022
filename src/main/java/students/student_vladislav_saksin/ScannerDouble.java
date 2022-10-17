package students.student_vladislav_saksin;

import java.util.Scanner;

public class ScannerDouble {

    public static void main(String[] args) {

        double firstNumber;
        double secondNumber;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter first number:");
        firstNumber = scanner.nextDouble();
        System.out.println("Please enter second number");
        secondNumber = scanner.nextDouble();

        System.out.println("==========================");

        System.out.println("Addition = " + (firstNumber + secondNumber));
        System.out.println("Subtraction = " + (firstNumber - secondNumber));
        System.out.println("Multiplication = " + (firstNumber * secondNumber));
        System.out.println("Divison = " + (firstNumber / secondNumber));


    }


}
