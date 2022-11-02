package students.student_konstantin_karetnikov.lesson_5.level_4;

import java.util.Scanner;

public class ArrayAllFromUser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Please enter array length: ");
        int size = scanner.nextInt();
        int[] numbers = new int[size];
        System.out.println("Please input array elements:");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }
        System.out.println("Numbers[] elements: ");
        for (int i = 0; i < size; i++) {
            System.out.print(" " + numbers[i]);
        }
    }
}
