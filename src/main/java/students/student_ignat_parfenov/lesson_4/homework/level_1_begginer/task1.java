package students.student_ignat_parfenov.lesson_4.homework.level_1_begginer;

import java.util.Scanner;

public class task1 {

    public static void main(String[] args) {

        System.out.println("Please input any number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number >= 0){
            System.out.println("Entered number is positive");
        } else {
            System.out.println("Entered number is negative");
        }
    }
}
