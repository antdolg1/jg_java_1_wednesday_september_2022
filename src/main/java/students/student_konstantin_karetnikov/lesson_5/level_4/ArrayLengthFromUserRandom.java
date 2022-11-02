package students.student_konstantin_karetnikov.lesson_5.level_4;

import java.util.Scanner;

public class ArrayLengthFromUserRandom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Please enter array length: ");
        int size = scanner.nextInt();
        int[] numbers = new int[size];
        System.out.println("The array is filled with random numbers");
        System.out.println("_______________________________________");
        for (int i = 0; i < size; i++) {
            numbers[i] = (int) (Math.random() *  2147483647);
        }
        System.out.println("Numbers[] elements: ");
        for (int i = 0; i < size; i++) {
           // System.out.print(" " + numbers[i]);
            System.out.print(numbers[i] + "\n");
        }
    }
}
