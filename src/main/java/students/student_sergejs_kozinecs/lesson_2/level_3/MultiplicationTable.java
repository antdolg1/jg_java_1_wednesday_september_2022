package students.student_sergejs_kozinecs.lesson_2.level_3;

import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {
        int multiplier;
        final int maxMultiplayer = 10;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter integer number:");
        multiplier = scanner.nextInt();

        System.out.println("Multiplication table of " + multiplier + " is:");
        for (int i = 1; i <= maxMultiplayer; i++) {
            System.out.println(multiplier + " x " + i + " = " + i * multiplier);
        }

        scanner.close();
    }
}
