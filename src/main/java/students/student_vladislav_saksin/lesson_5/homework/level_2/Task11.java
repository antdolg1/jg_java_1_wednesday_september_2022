package students.student_vladislav_saksin.lesson_5.homework.level_2;

import java.util.Arrays;
import java.util.Scanner;

class Task11 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[3];

        System.out.println("Please enter first number:");
        numbers[0] = scanner.nextInt();
        System.out.println("Please enter second number:");
        numbers[1] = scanner.nextInt();
        System.out.println("Please enter third number:");
        numbers[2] = scanner.nextInt();

        System.out.println(Arrays.toString(numbers));
    }

}
