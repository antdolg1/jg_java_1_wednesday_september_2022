package students.student_artjoms_trosihins.lesson_5.level_4.task_29;

import java.util.Arrays;
import java.util.Random;

class EvenNumbersArray {

    public static void main(String[] args) {

        Random random = new Random();

        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(20000);
        }
        System.out.println("Array elements : " + Arrays.toString(numbers));

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                System.out.println("Even elements : " + numbers[i]);
            }
        }
    }
}
