package students.student_sergejs_kozinecs.lesson_4.level_1.Task_1;

import java.util.Scanner;

class PositiveNegative {
    static String isPositiveOrNegative(int number) {
        return number >= 0 ? "is positive" : " is negative";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter int number:");
        String isPositiveOrNegative = isPositiveOrNegative(scanner.nextInt());

        System.out.println("This number " + isPositiveOrNegative);

        scanner.close();
    }
}
