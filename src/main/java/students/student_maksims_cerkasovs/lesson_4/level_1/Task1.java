package students.student_maksims_cerkasovs.lesson_4.level_1;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        System.out.println("Tape any number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number >= 0) {
            System.out.println("Number is positive");
        } else {
            System.out.println("Number is negative");
        }
    }
}
