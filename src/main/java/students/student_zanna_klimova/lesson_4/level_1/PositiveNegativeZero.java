package students.student_zanna_klimova.lesson_4.level_1;

import java.util.Scanner;

 class PositiveNegativeZero {
     static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter the number:");
        int number = scanner.nextInt();
        if (number > 0) {
            System.out.println("Number ir positive.");
        } else if (number == 0) {
            System.out.println("Number is zero.");
        } else {
            System.out.println("Number is negative.");
        }
    }
    }
