package students.student_ilja_morozovs.lesson_5.homework.level_6.Task_36;

import java.util.Arrays;

class ArrayUtil {
    int findMaxNumber(int[] array){
        int maxNumber=array[0];
        for (int i = 0; i < array.length; i++) {
            maxNumber=array[i];
            if (maxNumber<array[i]){
                maxNumber=array[i];
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
