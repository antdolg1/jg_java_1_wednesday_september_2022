package students.student_renat_galickij.lesson_5.level_2_intern;

import java.util.Scanner;

public class Task_11 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int[] numbers = new int[3];
        numbers[0] = num1;
        numbers[1] = num2;
        numbers[2] = num3;
        System.out.println(numbers[0] + " " + numbers[1] + " " + numbers[2]);
    }
}
