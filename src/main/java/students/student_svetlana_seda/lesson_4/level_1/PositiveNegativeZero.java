package students.student_svetlana_seda.lesson_4.level_1;

import java.util.Scanner;

public class PositiveNegativeZero {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert the whole number:");
        int number = scanner.nextInt();
        if (number > 0) {
            System.out.println("Number is positive.");
        } else if (number == 0) {
            System.out.println("Number is zero");
        } else {
            System.out.println("Number is negative.");
        }

    }

}
