package students.student_zanna_klimova.lesson_5.level_2;

import java.util.Scanner;

public class ArrayAskUser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 3 numbers: ");
        int[] numbers = new int[3];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
            System.out.println(numbers[i]);
        }
    }
}
