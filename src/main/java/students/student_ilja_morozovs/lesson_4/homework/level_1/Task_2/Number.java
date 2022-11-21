package students.student_ilja_morozovs.lesson_4.homework.level_1.Task_2;

import java.util.Scanner;

class Number {
    public static void main(String[] args) {
        int userNumber;
        System.out.println("Please input number: ");
        Scanner scanner = new Scanner(System.in);
        userNumber = scanner.nextInt();
        if (userNumber < 0) {
            System.out.println("Number " + userNumber + " is negative.");
        } else if (userNumber > 0) {
            System.out.println("Number " + userNumber + " is positive.");
        } else {
            System.out.println("Number " + userNumber + " is equal Zero");
        }
    }
}
