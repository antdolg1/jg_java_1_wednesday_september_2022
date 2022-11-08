package students.student_viktors_matjukovskis.lesson_4;

import java.util.Scanner;

public class Task_1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number");
        int number = scanner.nextInt();

        if (number > 0) {
            System.out.println("Positive");
        } else if (number < 0) {
            System.out.println("Negative");
        }
    }
}
