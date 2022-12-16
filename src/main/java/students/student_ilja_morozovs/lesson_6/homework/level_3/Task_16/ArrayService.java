package students.student_ilja_morozovs.lesson_6.homework.level_3.Task_16;

import java.util.Arrays;

class ArrayService {
    public static void main(String[] args) {
        ArrayService arrayService = new ArrayService();
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Array: " + Arrays.toString(arr));
        arrayService.reverseArrayNumbers(arr);
        System.out.println("New array is:" + Arrays.toString(arr));
    }

    void reverseArrayNumbers(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
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

