package students.student_mihhail_karasjov.Lesson3.Homework.Level2;

import java.util.Scanner;

public class HelloUser {
    public static void main(String[] args) {
        System.out.println("Please enter your name: ");

        Scanner in = new Scanner(System.in);
        String name = in.next();

        System.out.println("Hello, " + name + "!");
    }
}
