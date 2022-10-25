package students.student_stivens_veveris.lesson4.level3;

import java.util.Scanner;

public class ThreeNumbers {

    public static void main(String[] args) {

            System.out.println("Please input first number:");

            Scanner scanner = new Scanner(System.in);
            double number = scanner.nextDouble();

            System.out.println("Please input second number:");
            double number2 = scanner.nextDouble();

            System.out.println("Please input third number:");
            double number3 = scanner.nextDouble();

            if (number == number2 && number2 == number3 && number3 == number) {
                System.out.println("All numbers are equal");
            } else if (number != number2 && number2 != number3 && number3 != number) {
                System.out.println("All numbers are different");
            } else {
            System.out.println("Neither all are equal or different");
            }

    }
}
