package students.student_artjoms_trosihins.lesson_5.level_4.task_28;


import java.util.Arrays;
import java.util.Random;

class MinRandomArray {
    public static void main(String[] args) {

        Random random = new Random();

        int[] numbers = new int[9];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(10000);
        }
        System.out.println("Array elements : " + Arrays.toString(numbers));

        int minNumber = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < numbers[0]) {
                minNumber = numbers[i];
            }
        }
        System.out.println("Min number of array is " + minNumber);
    }
}
