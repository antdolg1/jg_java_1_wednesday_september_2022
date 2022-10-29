package students.student_ignat_parfenov.lesson_5.homework.level_2_intern;

import java.util.Random;

public class Task12 {

    public static void main(String[] args) {
        int[] randomArray = new int[10];
        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = i;
        }

        for (int i = 0; i < randomArray.length; i++) {
            System.out.println(randomArray[i]);
        }
    }
}
