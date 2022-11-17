package students.student_svetlana_seda.lesson_5.homework.level_4;

import java.util.Random;

class Task30 {

    public static void main(String[] args) {

        Random random = new Random();

        int randomArraySize = random.nextInt(2, 5);
        int[] array = new int[randomArraySize];

        for (int i = 0; i < array.length; i++) {
            int randomNumber = random.nextInt(0, 100);
            array[i] = randomNumber;

            System.out.println("Element" + "[" + i + "]" + " is " + array[i]);
        }
        for (int i = 0; i < array.length; i++) {
            if ((array[i] % 2) > 0) {
                System.out.println("Number " + array[i] + " is NOT even!");
            }

        }

    }

}
