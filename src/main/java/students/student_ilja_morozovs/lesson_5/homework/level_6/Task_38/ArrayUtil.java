package students.student_ilja_morozovs.lesson_5.homework.level_6.Task_38;

import java.util.Arrays;

class ArrayUtil {
    public static void main(String[] args) {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] array;
        array = arrayUtil.createArray(3);
        arrayUtil.fillArrayWithRandomNumber(array);
        arrayUtil.printArrayToConsole(array);
    }

    int findMinNumber(int[] array) {
        int minNumber = array[0];
        for (int i = 0; i < array.length; i++) {
            if (minNumber > array[i]) {
                minNumber = array[i];
            }
        }
        return minNumber;
    }

    int findMaxNumber(int[] array) {
        int maxNumber = array[0];
        for (int i = 0; i < array.length; i++) {
            if (maxNumber < array[i]) {
                maxNumber = array[i];
            }
        }
        return maxNumber;
    }

    void printArrayToConsole(int[] array) {
        System.out.println(Arrays.toString(array));
    }

    int[] fillArrayWithRandomNumber(int[] array) {
//        array[0]=1;
//        array[1]=4;
//        array[2]=10;
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * array.length);
        }
        return array;
    }

    int[] createArray(int arrayLength) {
        return new int[arrayLength];
    }
}
