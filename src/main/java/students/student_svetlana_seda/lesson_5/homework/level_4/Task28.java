package students.student_svetlana_seda.lesson_5.homework.level_4;

import java.util.Random;

class Task28 {

    public static void main(String[] args) {

        Random random = new Random();

        int randomArraySize = random.nextInt(2, 5);
        int[] array = new int[randomArraySize];

        for (int i = 0; i < array.length; i++) {
            int randomNumber = random.nextInt(0, 100);
            array[i] = randomNumber;

            System.out.println("Element" + "[" + i + "]" + " is " + array[i]);
            System.out.println();

            int minNumber = array[0];
            for (int g = 0; g < randomArraySize; g++) minNumber = Math.min(minNumber, array[g]);

            System.out.println("The smallest number in array is " + minNumber);

        }

    }

}




