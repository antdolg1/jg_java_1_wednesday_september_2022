package students.student_stivens_veveris;

import java.util.Scanner;

public class level3_task11 {

    public static void main(String[] args) {

        double firstNumber;
        double secondNumber;
        double thirdNumber;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, enter firstNumber: ");
        firstNumber = scanner.nextDouble();

        System.out.println("Please, enter secondNumber: ");
        secondNumber = scanner.nextDouble();

        System.out.println("Please, enter thirdNumber: ");
        thirdNumber = scanner.nextDouble();

        double average = (firstNumber + secondNumber + thirdNumber) / 3;

        System.out.println("______________");
        System.out.println(" ");
        System.out.println("Average of numbers = " + average);

    }
}
