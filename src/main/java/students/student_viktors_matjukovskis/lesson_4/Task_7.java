package students.student_viktors_matjukovskis.lesson_4;

import java.util.Scanner;

public class Task_7 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number 1: ");
        int number = scanner.nextInt();
        System.out.println("Enter the number 2: ");
        int number2 = scanner.nextInt();

        if (number == number2) {
            System.out.println("Numbers are equals");
        } if (number < number2) {
            System.out.println("Numbers are different");
        } else if (number > number2) {
            System.out.println("Numbers are different");
        }
    }
}
