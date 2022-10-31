package students.student_ignat_parfenov.lesson_5.homework.level_4_junior;

import java.util.Random;

public class Task27 {

    public static void main(String[] args) {


        Random random = new Random();
        int[] maxArrayElement = new int[15];
        for (int i = 0; i < maxArrayElement.length; i++) {
            maxArrayElement[i] = random.nextInt(65);
            System.out.println(maxArrayElement[i]);
            int maxNumber = 0;

            if (maxNumber <= maxArrayElement[i]) {
                maxNumber = maxArrayElement[i];
                maxNumber = i;
            }
        }
    }
}
