package students.student_ignat_parfenov.lesson_5.homework.level_2_intern;

import java.util.Arrays;
import java.util.Random;

public class Task15 {

    public static void main(String[] args) {

        Random random = new Random();
        int[] arrayElementPlusTwo = new int[5];
        for (int i = 0; i < arrayElementPlusTwo.length; i++) {
            arrayElementPlusTwo[i] = random.nextInt(20);
            System.out.println("Current random array: " + Arrays.toString(arrayElementPlusTwo));

            int a = 2;
            arrayElementPlusTwo[0] += a;
            arrayElementPlusTwo[1] += a;
            arrayElementPlusTwo[2] += a;
            System.out.println("Current arrays elements plus 2: " + Arrays.toString(arrayElementPlusTwo));
        }
    }
}

