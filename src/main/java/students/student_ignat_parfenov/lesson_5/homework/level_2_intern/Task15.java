package students.student_ignat_parfenov.lesson_5.homework.level_2_intern;

import java.util.Arrays;
import java.util.Random;

public class Task15 {

    public static void main(String[] args) {

        Random random = new Random();
        int[] arrayPlusTwo = new int[3];
        for (int i = 0; i < arrayPlusTwo.length; i++) {
            arrayPlusTwo[i] = random.nextInt(99);
//            arrayPlusTwo[i] = (int) (Math.random() * arrayPlusTwo.length);
        }
        System.out.println("Array numbers are: " + Arrays.toString(arrayPlusTwo));
        for (int i = 0; i < arrayPlusTwo.length; i++) {
            arrayPlusTwo[i] = arrayPlusTwo[i] + 2;
        }
        System.out.println("Array numbers +2 are: " + Arrays.toString(arrayPlusTwo));
    }
}
