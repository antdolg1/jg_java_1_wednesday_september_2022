package students.student_ignat_parfenov.lesson_5.homework.level_2_intern;

import java.util.Arrays;
import java.util.Random;

public class Task15 {

    public static void main(String[] args) {

        Random random = new Random();
        int[] arrayElementPlusTwo = new int[3];
        for (int i = 0; i < arrayElementPlusTwo.length; i++) {
            arrayElementPlusTwo[i] = random.nextInt(20);
            System.out.println(arrayElementPlusTwo[i]);

            int a = 2;
            arrayElementPlusTwo[i] += a;
            System.out.println(Arrays.toString(arrayElementPlusTwo));
        }
    }
}
