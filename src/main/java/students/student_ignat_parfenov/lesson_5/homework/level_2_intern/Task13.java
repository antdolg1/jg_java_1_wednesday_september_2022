package students.student_ignat_parfenov.lesson_5.homework.level_2_intern;

import java.util.Arrays;
import java.util.Random;

public class Task13 {

    public static void main(String[] args) {
        Random random = new Random();
        int[] randomArraySum = new int[3];
        for (int i = 0; i < randomArraySum.length; i++) {
            randomArraySum[i] = random.nextInt(10);
            System.out.println(randomArraySum[i]);
        }
    }
}
