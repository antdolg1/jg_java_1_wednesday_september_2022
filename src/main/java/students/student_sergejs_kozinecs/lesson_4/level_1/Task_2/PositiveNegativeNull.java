package students.student_sergejs_kozinecs.lesson_4.level_1.Task_2;

import java.util.Scanner;

class PositiveNegativeNull {
    static String isPositiveNegativeOrNull(int number) {
        if (number == 0) {
            return "is 0";
        }

        return number > 0 ? "is positive" : " is negative";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter int number:");
        String isPositiveNegativeOrNull = isPositiveNegativeOrNull(scanner.nextInt());

        System.out.println("This number " + isPositiveNegativeOrNull);

        scanner.close();
    }
}
