package students.student_deniss_fiscevs.lesson04.level_3_junior;

import java.util.Scanner;

public class Task_8 {

    public static void main(String[] args) {

        System.out.println("Please, enter three numbers:");

        Scanner scanner = new Scanner(System.in);
        int userNumber1 = scanner.nextInt();

        System.out.println("Accepted! And the second number?");

        int userNumber2 = scanner.nextInt();

        System.out.println("One more to go! The third number?");

        int userNumber3 = scanner.nextInt();

        if (userNumber1 == userNumber2 && userNumber2 == userNumber3) {
            System.out.println("All numbers are equal");
        } else if ((userNumber1 != userNumber2 && userNumber2 != userNumber3) && userNumber1 != userNumber3) {
            System.out.println("All numbers are different");
        } else {
            System.out.println("Neither all are equal or different");
        }
    }
}