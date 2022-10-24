package students.student_svetlana_seda.lesson_4.level_2;

import java.util.Scanner;

public class TheSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert two whole numbers: ");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();

        if (number1 < number2) {
            System.out.println("The smallest number is " + number1 + ".");
        } else {

            System.out.println("The smallest number is " + number2 + ".");
        }

    }

}
