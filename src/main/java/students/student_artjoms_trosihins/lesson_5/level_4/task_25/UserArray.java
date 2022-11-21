package students.student_artjoms_trosihins.lesson_5.level_4.task_25;

import java.util.Arrays;
import java.util.Scanner;

class UserArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please, enter array length!");
        int[] numbers = new int[sc.nextInt()];

        System.out.println("Please, enter numbers for array!");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }
        System.out.println("Array numbers is " + Arrays.toString(numbers));
    }
}
