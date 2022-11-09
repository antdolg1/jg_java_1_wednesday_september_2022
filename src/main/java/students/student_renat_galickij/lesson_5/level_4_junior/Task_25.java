package students.student_renat_galickij.lesson_5.level_4_junior;

import java.util.Scanner;

public class Task_25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array's length: ");
        int arrayLength = scanner.nextInt();
        int array[] = new int[arrayLength];
        int number = 0;

        for (int i = 0; i < arrayLength; i++) {
            array[number] = scanner.nextInt();
            number++;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);

        }
    }
}
