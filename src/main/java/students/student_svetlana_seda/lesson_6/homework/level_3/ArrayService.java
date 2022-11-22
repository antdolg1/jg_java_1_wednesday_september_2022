package students.student_svetlana_seda.lesson_6.homework.level_3;

import java.lang.reflect.Array;
import java.util.Arrays;

class ArrayService {

    boolean contains(int[] array, int numberToSearch) {
        boolean condition = false;
        for (int arrayNumber : array) {
            if (arrayNumber == numberToSearch) {
                condition = true;
                break;
            }
        }
        return condition;
    }

    int countOccurrences(int[] array, int numberToSearch) {
        int numberOccurences = 0;
        for (int arrayNumber : array) {
            if (arrayNumber == numberToSearch) {
                numberOccurences += 1;
            }
        }
        return numberOccurences;
    }

    boolean replaceFirst(int[] array, int numberToReplace, int newNumber) {
        boolean condition = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == numberToReplace) {
                array[i] = newNumber;
                condition = true;
                break;
            }
        }
        return condition;
    }

    int replaceAll(int[] array, int numberToReplace, int newNumber) {
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == numberToReplace) {
                array[i] = newNumber;
                counter++;
            }
        }
        return counter;
    }

    //task 16
    void revert(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int j = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = j;
        }
    }

    //task17
    void sort(int[] arr) {
        Arrays.sort(arr);
    }

}


