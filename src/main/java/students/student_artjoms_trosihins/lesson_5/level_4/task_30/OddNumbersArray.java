package students.student_artjoms_trosihins.lesson_5.level_4.task_30;

import java.util.Arrays;
import java.util.Random;

class OddNumbersArray {

    public static void main(String[] args) {

        Random random = new Random();

        int[] numbers = new int[20];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(200);
        }
        System.out.println("Array numbers : " + Arrays.toString(numbers));

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 1) {
                System.out.println("Odd numbers : " + numbers[i]);
            }
        }
    }
}
