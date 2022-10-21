package students.student_zanna_klimova.lesson_4.level_2;

import java.util.Scanner;

public class EqualsOrDifferent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter two whole numbers: ");
        int numberOne = scanner.nextInt();
        int numberTwo = scanner.nextInt();

        if (numberOne == numberTwo) {
            System.out.println("__________________________________");
            System.out.println("Numbers are equals.");
        } else {
            System.out.println("___________________________________");
            System.out.println("Numbers are different.");
        }
    }

}
