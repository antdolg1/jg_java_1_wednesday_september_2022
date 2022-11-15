package students.student_raivis_urbevics.lesson6_level3.task12;

import java.util.Arrays;

class ArrayService {

    boolean contains(int[] arr, int numberToSearch) {
        boolean condition = false;
        for (int arrNumbers : arr) {
            if (arrNumbers == numberToSearch) {
                condition = true;
                break;
            }
        }
        return condition;
    }

    int countOccurrences(int[] arr, int numberToSearch) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == numberToSearch) {
                count += 1;
            }
        }
        return count;
    }

    boolean replaceFirst(int[] arr, int numberToReplace, int newNumber) {
        boolean condition = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == numberToReplace) {
                arr[i] = newNumber;
                condition = true;
                break;
            }
        }
        return condition;
    }

    int replaceAll(int[] arr, int numberToReplace, int newNumber) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == numberToReplace) {
                arr[i] = newNumber;
                count++;
            }
        }
        return count;
    }

    public void revertArray(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int rev = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = rev;
        }

    }

    public void sortArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int min = arr[i];
            int min_i = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    min_i = j;
                }
            }
            if (i != min_i) {
                int temp = arr[i];
                arr[i] = arr[min_i];
                arr[min_i] = temp;
            }
        }
    }
}
