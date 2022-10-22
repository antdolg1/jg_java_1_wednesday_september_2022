package students.student_ilja_morozovs.lesson_4.homework.level_1.Task_4;

import java.util.Scanner;

class Number {
    public static void main(String[] args) {
        int userNumber;
        System.out.println("Please input number: ");
        Scanner scanner = new Scanner(System.in);
        userNumber = scanner.nextInt();
        int userNumberLocal = userNumber % 2;
        if (userNumberLocal == 0) {
            System.out.println("Number is even!");
        } else {
            System.out.println("Number not even!");
        }

    }
}
