package students.student_konstantin_karetnikov.lesson_5.level_2;

import java.util.Scanner;

public class ArrayThreeNumbersFromUser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[3];

        {
            System.out.print("Please input element 1: ");
            numbers [0] = scanner.nextInt();
            System.out.print("Please input element 2: ");
            numbers [1] = scanner.nextInt();
            System.out.print("Please input element 3: ");
            numbers [2] = scanner.nextInt();

        }

        System.out.println("Element 1: " + numbers[0]);
        System.out.println("Element 2: " + numbers[1]);
        System.out.println("Element 3: " + numbers[2]);
    }
}
