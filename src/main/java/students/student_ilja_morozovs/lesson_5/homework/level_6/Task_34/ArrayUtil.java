package students.student_ilja_morozovs.lesson_5.homework.level_6.Task_34;

import java.util.Arrays;

class ArrayUtil {

    void printArrayToConsole(int[] array) {
        System.out.println(Arrays.toString(array));
    }

    void fillArrayWithRandomNumber(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * array.length);
        }
    }

    int[] createArray(int arrayLength) {
        return new int[arrayLength];
    }
}
