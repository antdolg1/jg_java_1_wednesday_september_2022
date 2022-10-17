package students.student_igor_budnitski.lesson_2.homework.level2;
/*
*Написать консольную программу, которая запрашивает
имя пользователя и выводит на консоль текст:

Hello имя пользователя!
* */

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name);
    }
}
