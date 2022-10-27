package students.student_sergejs_kozinecs.lesson_5.level_2.Task_11;

import java.util.Scanner;

class ArrayNumbers {
    public static void main(String[] args) {
        int[] numbers = new int[3];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter " + (i + 1) + " number: ");
            numbers[i] = scanner.nextInt();
        }

        for (int number : numbers) {
            System.out.println("Number is: " + number);
        }

        scanner.close();
    }
}