package students.student_ilja_morozovs.lesson_5.homework.level_5.Task_33;


import java.util.Arrays;

class ArrayUtil {

    void fillArrayWithRandomNumber(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * array.length);
        }
    }

    int[] createArray(int arrayLength) {
        return new int[arrayLength];
    }
}
