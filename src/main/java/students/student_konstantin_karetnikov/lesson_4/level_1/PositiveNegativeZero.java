package students.student_konstantin_karetnikov.lesson_4.level_1;

import java.util.Scanner;

class PositiveNegativeZero {public static void main(String[] args) {

    System.out.print("Please enter your number: ");
    Scanner scanner = new Scanner (System.in);
    int number = scanner.nextInt();
    if (number > 0) {
        System.out.println("Positive");
    }
    else if (number < 0) {
        System.out.println("Negative");
    }
    else {
        System.out.println("Zero");
    }
}
}
