package students.student_artjoms_trosihins.lesson_5.level_4.task_26;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

class RandomUserArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Enter array length!");
        int[] numbers = new int[sc.nextInt()];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(10000);
        }
        System.out.println("Array numbers : " + Arrays.toString(numbers));
    }
}
