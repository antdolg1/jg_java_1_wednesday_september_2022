package students.student_aleksandrs_mads.lesson_4.homework.level_1.Task_2;

import java.util.Scanner;

class Number {


    public static void main(String[] args) {
        int userNumber;
        System.out.println("Input number: ");
        Scanner scanner = new Scanner(System.in);
        userNumber = scanner.nextInt();
        if (userNumber > 0) {
            System.out.println("number is positive");
        } else if (userNumber == 0) {
            System.out.println("number is null");
        } else {
            System.out.println("number is negative");
        }
    }
}
