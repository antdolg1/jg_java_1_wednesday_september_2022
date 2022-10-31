package students.student_ignat_parfenov.lesson_5.homework.level_4_junior;

import java.util.Random;

public class Task27 {

    public static void main(String[] args) {


        Random random = new Random();
        int[] maximumNumber = new int[5];
        for (int i = 0; i < maximumNumber.length; i++) {
            maximumNumber[i] = random.nextInt(50);
            System.out.println(maximumNumber[i]);
        }
        int max = 0;

    }
}

