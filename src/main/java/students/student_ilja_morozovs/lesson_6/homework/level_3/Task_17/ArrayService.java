package students.student_ilja_morozovs.lesson_6.homework.level_3.Task_17;

import java.util.Arrays;

class ArrayService {
    public static void main(String[] args) {
        ArrayService arrayService = new ArrayService();
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10);
        }
        System.out.println("Array: " + Arrays.toString(arr));
        arrayService.arraySort(arr);
        System.out.println("Sorted array is: " + Arrays.toString(arr));
    }

    void arraySort(int[] arr) {
        int temp;
        boolean changeSomething = true;
        while (changeSomething) {
            changeSomething = false;
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    changeSomething = true;
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
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

