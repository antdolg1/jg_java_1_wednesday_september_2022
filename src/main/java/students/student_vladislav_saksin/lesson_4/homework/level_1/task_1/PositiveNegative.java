package students.student_vladislav_saksin.lesson_4.homework.level_1.task_1;

import java.util.Scanner;

public class PositiveNegative {

    public static void main(String[] args) {

        int number;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number");
        number = scanner.nextInt();

        if (number > 0) {
            System.out.println("Number is a positive number");
        }

        if (number < 0) {
            System.out.println("Number is a negative number");
        }

        if (number == 0) {
            System.out.println("Enter a number greater than or less than zero");
        }
    }
}


