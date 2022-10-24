package students.student_deniss_fiscevs.lesson04.level_1_intern;

import java.util.Scanner;

public class Task_1_and_2 {

    public static void main(String[] args) {

        System.out.println("Enter a number to check is it positive or negative:");

        Scanner scanner = new Scanner(System.in);
        int userNumber = scanner.nextInt();

        if (userNumber > 0) {
            System.out.println("Positive");
        } else if (userNumber < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }

    }

}
