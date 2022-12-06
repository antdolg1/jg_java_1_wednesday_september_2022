package students.student_deniss_fiscevs.lesson04.level_1_intern;

import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {

        System.out.println("Please, enter a number from 1-7 to check a day of week: ");

        Scanner scanner = new Scanner(System.in);
        int userNumber = scanner.nextInt();

        if (userNumber == 1) {
            System.out.println("Monday");
        } else if (userNumber == 2) {
            System.out.println("Tuesday");
        } else if (userNumber == 3) {
            System.out.println("Wednesday");
        } else if (userNumber == 4) {
            System.out.println("Thursday");
        } else if (userNumber == 5) {
            System.out.println("Friday");
        } else if (userNumber == 6) {
            System.out.println("Saturday");
        } else if (userNumber == 7) {
            System.out.println("Sunday");
        } else {
            System.out.println("Input error");
        }

    }
}
