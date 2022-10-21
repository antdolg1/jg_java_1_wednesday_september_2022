package students.student_ignat_parfenov.lesson_4.homework.level_1_begginer;

import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {

        int number3;
        System.out.println("Please enter your number: ");
        Scanner scanner = new Scanner(System.in);
        number3 = scanner.nextInt();

        if (number3 % 2 == 0) {
            System.out.println("Your entered number is even number");
        } else {
            System.out.println("Your entered number is uneven number");
        }
    }

}

