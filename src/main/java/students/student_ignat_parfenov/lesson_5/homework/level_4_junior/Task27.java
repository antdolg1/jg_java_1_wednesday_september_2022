package students.student_ignat_parfenov.lesson_5.homework.level_4_junior;

import java.util.Arrays;
import java.util.Random;

class Task27 {

    public static void main(String[] args) {

        Random random = new Random();
        int[] randomArraySum = new int[5];
        for (int i = 0; i < randomArraySum.length; i++) {
            randomArraySum[i] = random.nextInt(67);
            System.out.println(randomArraySum[i]);
        }
        int maxNum = randomArraySum[0];
        for (int j : randomArraySum) {
            if (j > maxNum)
                maxNum = j;
        }
        System.out.println("Maximum number = " + maxNum);
    }
}


