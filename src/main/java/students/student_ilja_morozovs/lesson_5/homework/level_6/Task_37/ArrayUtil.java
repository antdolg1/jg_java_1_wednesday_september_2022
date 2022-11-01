package students.student_ilja_morozovs.lesson_5.homework.level_6.Task_37;

import java.util.Arrays;

class ArrayUtil {
    int findMinNumber(int[] array) {
        int minNumber = array[0];
        for (int i = 0; i < array.length; i++) {
            minNumber = array[i];
            if (minNumber > array[i]) {
                minNumber = array[i];
            }
        }
        return minNumber;
    }

    int findMaxNumber(int[] array) {
        int maxNumber = array[0];
        for (int i = 0; i < array.length; i++) {
            maxNumber = array[i];
            if (maxNumber < array[i]) {
                maxNumber = array[i];
            }
        }
        return maxNumber;
    }

    void printArrayToConsole(int[] array) {
        System.out.println(Arrays.toString(array));
    }

    void fillArrayWithRandomNumber(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
    }

    int[] createArray(int arrayLength) {
        return new int[arrayLength];
    }
}
