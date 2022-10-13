package students.student_sergejs_kozinecs.lesson_3.level_2;

import java.util.Scanner;

public class Task_9 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name?");
        String userName = scanner.next();

        System.out.println("Hello " + userName + "!");

        scanner.close();

    }
}
