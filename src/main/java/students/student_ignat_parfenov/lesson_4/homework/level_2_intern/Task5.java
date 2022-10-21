package students.student_ignat_parfenov.lesson_4.homework.level_2_intern;

import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {

        int number5;
        int number6;

        System.out.println("Please enter two integers:");
        Scanner scanner = new Scanner(System.in);
        number5 = scanner.nextInt();
        number6 = scanner.nextInt();

        if (number5 > number6) {
            System.out.println(number5 + " - The entered number " + number5 + " is bigger than number " + number6);
        } else if (number6 > number5) {
            System.out.println(number6 + " - The entered number " + number6 + " is bigger than number " + number5);
        } else {
            System.out.println("Both number are equal!");
        }
    }
}
