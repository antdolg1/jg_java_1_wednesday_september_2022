package students.student_ignat_parfenov.lesson_5.homework.level_2_intern;

import java.util.Arrays;
import java.util.Scanner;

public class Task11 {

    public static void main(String[] args) {

        System.out.print("Please enter three numbers: ");
        Scanner scanner = new Scanner(System.in);
        int[] number = new int[3];
        number[0] = scanner.nextInt();
        number[1] = scanner.nextInt();
        number[2] = scanner.nextInt();
        System.out.println("The entered numbers array is" + Arrays.toString(number));
    }
}
