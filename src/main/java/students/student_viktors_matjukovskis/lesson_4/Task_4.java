package students.student_viktors_matjukovskis.lesson_4;

import java.util.Scanner;

public class Task_4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number");
        int number = scanner.nextInt();

         if (number%2 == 0) {
            System.out.println("Even number");
        } else if (number%1 ==0) {
            System.out.println("Odd number");
        }
    }
}
