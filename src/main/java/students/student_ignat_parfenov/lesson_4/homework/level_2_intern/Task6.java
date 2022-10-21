package students.student_ignat_parfenov.lesson_4.homework.level_2_intern;

import java.util.Scanner;

public class Task6 {

    public static void main(String[] args) {

        int number7;
        int number8;

        System.out.println("Please enter two integers:");
        Scanner scanner = new Scanner(System.in);
        number7 = scanner.nextInt();
        number8 = scanner.nextInt();

        if (number7 < number8) {
            System.out.println(number7 + " - The entered integer " + number7 + " is less than integer " + number8);
        } else if (number8 < number7) {
            System.out.println(number8 + " - The entered integer " + number8 + " is bigger than integer " + number7);
        } else {
            System.out.println("Both number are equal!");
        }
    }
}
