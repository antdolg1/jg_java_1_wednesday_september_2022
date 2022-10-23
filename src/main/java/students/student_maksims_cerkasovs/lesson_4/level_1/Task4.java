package students.student_maksims_cerkasovs.lesson_4.level_1;

import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {

        int number2;
        System.out.println("Tape any number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        number2 = number % 2;

        if (number2 == 0) {
            System.out.println("Even number");
        } else {
            System.out.println("Odd number");
        }
    }
}
