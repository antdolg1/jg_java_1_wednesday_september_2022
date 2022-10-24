package students.student_deniss_fiscevs.lesson04.level_2_intern;

import java.util.Scanner;

public class Task_7 {

    public static void main(String[] args) {

        System.out.println("Please, enter two numbers:");

        Scanner scanner = new Scanner(System.in);
        int userNumber1 = scanner.nextInt();

        System.out.println("Accepted! And the second number?");

        int userNumber2 = scanner.nextInt();

        if (userNumber1 == userNumber2) {
            System.out.println("Numbers are equals");
        } else {
            System.out.println("Numbers are different");
        }
    }
}
