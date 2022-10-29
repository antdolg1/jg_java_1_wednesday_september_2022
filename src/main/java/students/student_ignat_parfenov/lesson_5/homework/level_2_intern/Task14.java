package students.student_ignat_parfenov.lesson_5.homework.level_2_intern;

import java.util.Arrays;
import java.util.Random;

public class Task14 {

    public static void main(String[] args) {

        Random random = new Random();
        int[] mas3 = new int[3];
        for (int i = 0; i < mas3.length; i++) {
            mas3[i] = random.nextInt(20);
        }
        System.out.println("Random array is " + Arrays.toString(mas3));

        double average = 0;
        for (int j : mas3) {
            average += j;
        }
        average /= 3;
        System.out.println("Array arithmetic mean is " + average);
    }
}
