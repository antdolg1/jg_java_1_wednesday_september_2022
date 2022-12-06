package students.student_ignat_parfenov.lesson_4.homework.level_2_intern;

import java.util.Scanner;

public class Task7 {

    public static void main(String[] args) {

        int number9;
        int number10;

        System.out.println("Please enter two integers:");
        Scanner scanner = new Scanner(System.in);
        number9 = scanner.nextInt();
        number10 = scanner.nextInt();

        if (number9 == number10) {
            System.out.println("The entered number are equal");
        } else {
            System.out.println("The entered numbers are different");
        }
    }
}
