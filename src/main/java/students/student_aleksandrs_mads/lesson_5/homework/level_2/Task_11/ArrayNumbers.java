package students.student_aleksandrs_mads.lesson_5.homework.level_2.Task_11;

import java.util.Arrays;
import java.util.Scanner;

class ArrayNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] number = new int[3];
        System.out.println("Enter number ");
        for (int i = 0; i < number.length; i++) {
            number[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(number));
    }
}

