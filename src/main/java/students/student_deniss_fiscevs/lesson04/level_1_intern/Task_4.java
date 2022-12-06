package students.student_deniss_fiscevs.lesson04.level_1_intern;

import java.util.Scanner;

public class Task_4 {

    public static void main(String[] args) {

        System.out.println("Enter a number to check is it even or odd:");

        Scanner scanner = new Scanner(System.in);
        int userNumber = scanner.nextInt();

        if (userNumber == 0) {
            System.out.println("Zero");
        } else if (userNumber % 2 == 0) {
                System.out.println("Even");
        } else {
            System.out.println("Odd");
        }

    }

}
