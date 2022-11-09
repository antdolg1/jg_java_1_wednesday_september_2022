package students.student_renat_galickij.lesson_4.level_1_intern;

import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter integer");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println("Number is even ");
        } else {
            System.out.println("Numver is odd");
        }
    }
}


