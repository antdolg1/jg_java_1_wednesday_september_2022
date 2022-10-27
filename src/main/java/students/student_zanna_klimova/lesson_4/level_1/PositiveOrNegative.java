package students.student_zanna_klimova.lesson_4.level_1;

import java.util.Scanner;

class PositiveOrNegative {
     static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert your number: ");
        int number = scanner.nextInt();
        if (number > 0) {
            System.out.println("Number is positive.");
        } else {
            System.out.println("Number is negative.");
        }
    }

}
