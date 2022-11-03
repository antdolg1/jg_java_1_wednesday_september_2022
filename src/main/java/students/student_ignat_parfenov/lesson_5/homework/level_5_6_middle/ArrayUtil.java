package students.student_ignat_parfenov.lesson_5.homework.level_5_6_middle;

import java.util.Random;

class ArrayUtil {

    public static int[] createArray(int arrayLength) {
        return new int[arrayLength];
    }

    public void fillArrayWithRandomNumbers(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(999);
        }
    }

    public void printArrayToConsole(int[] array) {
        for (int element : array) {
            System.out.println(element + " ");
        }
    }

    public int findMaxNumber(int[] array) {
        int maxNumber = array[0];

        for (int i : array) {
            if (i < maxNumber) {
                maxNumber = i;
            }
        }
        return maxNumber;
    }
}



