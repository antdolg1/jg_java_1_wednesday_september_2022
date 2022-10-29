package students.student_ignat_parfenov.lesson_5.homework.level_2_intern;

import java.util.Arrays;
import java.util.Random;

public class Task14 {

    public static void main(String[] args) {

        Random random = new Random();
        int[] masThree = new int[3];
        for (int i = 0; i < masThree.length; i++) {
            masThree[i] = random.nextInt(20);
        }
        System.out.println("Random array is " + Arrays.toString(masThree));

        double average = 0;
        for (int j : masThree) {
            average += j;
        }
        average /= 3;
        System.out.println("Array arithmetic mean is " + average);
    }
}
