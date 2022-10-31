package students.student_ignat_parfenov.lesson_5.homework.level_4_junior;

import java.util.Random;

class Task27 {

    public static void main(String[] args) {

        Random random = new Random();
        int[] randomArray = new int[5];
        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = random.nextInt(67);
            System.out.println(randomArray[i]);
        }
        int maxNum = randomArray[0];
        for (int j : randomArray) {
            if (j > maxNum)
                maxNum = j;
        }
        System.out.println("Array maximum number = " + maxNum);
    }
}


