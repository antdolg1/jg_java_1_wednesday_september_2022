package students.student_vladislav_saksin.lesson_4.homework.level_1.task_4;

import java.util.Scanner;

public class EvenOdd {

    public static void main(String[] args) {

        int number;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number");
        number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println("Even number");
        } else {
            System.out.println("Odd number");
        }

    }
}
