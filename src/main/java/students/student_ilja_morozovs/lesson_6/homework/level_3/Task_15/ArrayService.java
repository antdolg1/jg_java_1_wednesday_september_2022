package students.student_ilja_morozovs.lesson_6.homework.level_3.Task_15;

import java.util.Arrays;

class ArrayService {
    public static void main(String[] args) {
        ArrayService arrayService = new ArrayService();
        int[] arr = {1, 12, 3, 12, 5, 99, 35, 12};
        System.out.println("Array: " + Arrays.toString(arr));
        System.out.println("Count of change is: " + arrayService.changeAll(arr, 12, 4));
        System.out.println("New array is:" + Arrays.toString(arr));
    }

    int changeAll(int[] arr, int numberToReplace, int newNumber) {
        int countOfChangedNumber = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == numberToReplace) {
                arr[i] = newNumber;
                countOfChangedNumber++;
            }
        }
        return countOfChangedNumber;
    }

    boolean changeFirst(int[] arr, int numberToReplace, int newNumber) {
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

    boolean contains(int[] arr, int numberToSearch) {
        boolean state = false;
        for (int arrayNumbers : arr) {
            if (arrayNumbers == numberToSearch) {
                state = true;
                break;
            }
        }
        return state;
    }

    int countNumberOccurrences(int[] arr, int numberToSearch) {
        int numberOccurrences = 0;
        for (int arrayNumber : arr) {
            if (arrayNumber == numberToSearch) {
                numberOccurrences += 1;
            }
        }
        return numberOccurrences;
    }
}

