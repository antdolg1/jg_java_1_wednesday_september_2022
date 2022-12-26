package students.student_sergejs_kozinecs.lesson_5.level_4.Task_26;

import java.util.Scanner;

public class ArrayPractice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array length: ");
        int arrayLength = scanner.nextInt();
        int[] numbers = new int[arrayLength];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 100) + 1;
        }

        for (int number : numbers) {
            System.out.println("Number is: " + number);
        }

        scanner.close();
    }
}
