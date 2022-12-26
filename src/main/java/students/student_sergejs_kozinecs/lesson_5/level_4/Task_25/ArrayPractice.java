package students.student_sergejs_kozinecs.lesson_5.level_4.Task_25;

import java.util.Scanner;

class ArrayPractice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array length: ");
        int arrayLength = scanner.nextInt();
        int[] numbers = new int[arrayLength];


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
