package students.student_stivens_veveris.lesson4.level3;

import java.util.Scanner;

public class ThreeNumbers9 {

    public static void main(String[] args) {

        System.out.println("Please input first number:");

        Scanner scanner = new Scanner(System.in);
        double number = scanner.nextDouble();

        System.out.println("Please input second number:");
        double number2 = scanner.nextDouble();

        System.out.println("Please input third number:");
        double number3 = scanner.nextDouble();

        if (number < number2 && number2 < number3 && number3 > number2) {
            System.out.println("increasing");
        } else if (number > number2 && number2 > number3 && number3 < number2) {
            System.out.println("decreasing");
        } else {
            System.out.println("Neither increasing or decreasing order");
        }

    }
}
