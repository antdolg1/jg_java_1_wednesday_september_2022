package students.student_ignat_parfenov.lesson3.homework.task7_9;

import java.util.Scanner;

public class MyNameScanner {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("What is your name? ");
        String yourName = scanner.next();

        System.out.println("Hello " + yourName + "!");

    }
}
