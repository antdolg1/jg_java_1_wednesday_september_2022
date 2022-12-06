package students.student_ignat_parfenov.lesson_4.homework.level_1_begginer;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

        System.out.println("Please enter eny number: ");
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();

        if (number1 > 0) {
            System.out.println("The entered number is positive and bigger than 0");
        } else if (number1 < 0) {
            System.out.println("The entered number is negative");
        } else {
            System.out.println("The entered number is 0!");
        }
    }
}
