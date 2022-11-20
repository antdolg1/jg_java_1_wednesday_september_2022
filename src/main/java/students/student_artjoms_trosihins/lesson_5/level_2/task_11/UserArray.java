package students.student_artjoms_trosihins.lesson_5.level_2.task_11;

import java.util.Arrays;
import java.util.Scanner;

class UserArray {

    public static void main(String[] args) {

        int[] numbers = new int[3];

        System.out.println("Enter numbers for array");

        Scanner sc = new Scanner(System.in);
        numbers[0] = sc.nextInt();
        numbers[1] = sc.nextInt();
        numbers[2] = sc.nextInt();

        System.out.println("User numbers are" + Arrays.toString(numbers));
    }
}
