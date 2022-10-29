package students.student_ignat_parfenov.lesson_5.homework.level_2_intern;

import java.util.Random;

public class Task13 {

    public static void main(String[] args) {
        Random random = new Random();
        int[] randomArraySum = new int[3];
        for (int i = 0; i < randomArraySum.length; i++) {
            randomArraySum[i] = random.nextInt(50);
            System.out.println(randomArraySum[i]);
        }
        int sum = arraySum(randomArraySum);
        System.out.print("\nThis array's sum is: " + sum);
    }

    public static int arraySum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0)
                sum += array[i];
        }
        return sum;
    }
}

