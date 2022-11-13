package students.student_svetlana_seda.lesson_5.homework.level_4;

import java.util.Random;

class Task27 {

    public static void main(String[] args) {

        Random random = new Random();

        int randomArraySize = random.nextInt(10);
        int[] array = new int[randomArraySize];

        for (int i = 0; i < array.length; i++) {
            int randomNumber = random.nextInt(0, 100);
            array[i] = randomNumber;

            System.out.println("Element" + "[" + i + "]" + " is " + array[i]);
            System.out.println();

            int maxNumber = array[0];
            for (int g = 0; g < randomArraySize; g++) maxNumber = Math.max(maxNumber, array[g]);

            System.out.println("The biggest number in array is " + maxNumber);

        }

    }

}
