package students.student_igor_budnitski.level3;

import java.util.Scanner;

/*
* Напишите программу, которая запрашивает у пользователя целое число
и печатает на консоль таблицу умножения для этого числа до 10.
* */

public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the number from 1 to 10: ");
        int number = scanner.nextInt();
        for (int i = 1; i < 11; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }
    }
}
