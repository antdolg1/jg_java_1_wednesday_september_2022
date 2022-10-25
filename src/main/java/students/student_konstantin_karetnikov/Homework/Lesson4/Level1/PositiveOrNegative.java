package students.student_konstantin_karetnikov.Homework.Lesson4.Level1;

import java.util.Scanner;

public class PositiveOrNegative {
    public static void main(String[] args) {

    System.out.print("Please enter your number: ");
    Scanner scanner = new Scanner (System.in);
    int number = scanner.nextInt();
    if (number >= 0) {
        System.out.println("Positive");
    }
    else {
        System.out.println("Negative");
    }
}
}
